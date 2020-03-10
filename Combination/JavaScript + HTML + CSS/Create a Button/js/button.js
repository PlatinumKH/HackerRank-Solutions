var clickMeButton = document.createElement('button');
var counter = 0;
clickMeButton.id = 'btn';
clickMeButton.innerHTML = counter;
clickMeButton.style.background = '#4FFF8F';
document.body.appendChild(clickMeButton);

btn.onclick = function() {
                /* This changes the button's label */
                btn.innerHTML = parseInt(clickMeButton.innerHTML) + 1;
            };