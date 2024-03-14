// KALKULATOR
document.addEventListener("DOMContentLoaded", function() {
    const display = document.querySelector(".display");
    const buttons = document.querySelectorAll(".button");

    buttons.forEach(button => {
        button.addEventListener("click", function() {
            const buttonText = button.textContent;
            let displayText = display.textContent;

            if (button.id === "equals") {
                try {
                    displayText = eval(displayText);
                } catch (error) {
                    displayText = "Error";
                }
            } else if (button.id === "clear") {
                displayText = "0";
            } else if (button.id === "backspace") {
                displayText = displayText.slice(0, -1);
            } else if (button.id === "percent") {
                const percentValue = parseFloat(displayText) / 100; // Oblicz procent
                displayText = (parseFloat(displayText) + (percentValue * parseFloat(displayText))).toFixed(2);
            } else {
                if (displayText === "0" || displayText === "Error") {
                    displayText = buttonText;
                } else {
                    displayText += buttonText;
                }
            }

            display.textContent = displayText;
        });
    });
});
