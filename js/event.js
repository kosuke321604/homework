const addBtn = document.getElementById('add-btn');
const delBtn = document.getElementById('delete-btn');
const todoList = document.getElementById('list');

// HTML要素がクリックされたときにイベント処理を実行する
addBtn.addEventListener('click', () => {
  // テキストボックスに入力された文字列を取得する
  const text = document.forms.textForm.textBox.value;
  // console.log(text.length + '文字');
  const creatList = document.createElement('li');
  creatList.innerHTML=text;

  todoList.appendChild(creatList);

});

delBtn.addEventListener('click', () => {
    // テキストボックスに入力された文字列を取得する
    todoList.removeChild(todoList.firstElementChild);
  
    // 取得した文字列の文字数を出力する
    
    console.log(text.length + '文字');
});