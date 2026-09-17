<!DOCTYPE html>
<html>
<head>
    <title>Jersey REST API Test</title>
</head>
<body>

    <h1>My Java Web Application</h1>

    <p>Click the button to test the REST API:</p>

    <button onclick="testApi()">Test API</button>

    <p id="result"></p>

    <script>
        function testApi() {
            fetch("api/hello")
                .then(response => response.text())
                .then(data => {
                    document.getElementById("result").innerHTML = data;
                })
                .catch(error => {
                    document.getElementById("result").innerHTML =
                        "Error: " + error;
                });
        }
    </script>

</body>
</html>