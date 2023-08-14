package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class JankenLogic {
	public void execute(JankenBean jankenBean) {
		
		int myselfResult = jankenBean.getMyselfResult();
//		int pcResult = jankenBean.getPcResult();
//		String result= jankenBean.getResult();
		String result;
		String myselfResultName;
		String pcResultName;		
		
		//乱数でPCの手を生成
		Random random = new Random();
	    int randomvalue = random.nextInt(3);
	    int pcResult= randomvalue;
	    
	    //じゃんけんの手のコードに対応する名称をhashmapで格納
	    Map<Integer,String>pattern = new HashMap<Integer,String>();
	    pattern.put(0, "グー");
	    pattern.put(1, "チョキ");
	    pattern.put(2, "パー");
	    
		//じゃんけん結果を判定
	    //0:グー、1:チョキ、2：パー
	    int jankenResult = myselfResult - pcResult;  
	    if(jankenResult ==-1||jankenResult==2) {
	    	result = "勝ち";
	    	
	    }else if(jankenResult ==1||jankenResult==-2){
	    	result = "負け";	    	
	    	
	    }else {
	    	result = "引き分け";
	    		    	
	    	
	    }
	    myselfResultName=pattern.get(myselfResult);
    	pcResultName=pattern.get(pcResult);
    	jankenBean.resultPast.add(result);//配列で結果格納
		
	    jankenBean.setMyselfResultName(myselfResultName);
	    jankenBean.setPcResultName(pcResultName);
		
	}

}
