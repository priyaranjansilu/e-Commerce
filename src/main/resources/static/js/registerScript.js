
        document.getElementById("registrationForm").addEventListener("submit", async (event) => {
            event.preventDefault();

            const username = document.querySelector("input[name='username']").value;
            const email = document.querySelector("input[name='email']").value;
            const password = document.querySelector("input[name='password']").value;
            const confirmPassword = document.querySelector("input[name='confirmPassword']").value;
            const terms = document.querySelector("input[name='terms']").checked;

            if (password !== confirmPassword) {
                alert("Passwords do not match!");
                return;
            }

            if (!terms) {
                alert("You must agree to the terms and conditions!");
                return;
            }

            const user = {
                username: username,
                email: email,
                password: password
            };

            try {
                const response = await fetch("/api/register", {
                    method: "POST",
                    headers: { "Content-Type": "application/json" },
                    body: JSON.stringify(user)
                });

                if (response.ok) {
                    const message = await response.text();
                    alert(message);
                    window.location.href = "/login";
                } else {
                    alert("Registration failed. Please try again.");
                }
            } catch (error) {
                console.error("Error submitting form:", error);
                alert("An error occurred. Please try again.");
            }
        });
   