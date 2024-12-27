<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
        }
        .container {
            width: 300px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .input-box {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border-radius: 5px;
            border: 1px solid #ccc;
        }
        button {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Calculator</h2>
        <form action="/calculate" method="post">
            <!-- Number Input -->
            <input type="text" name="num1" class="input-box" placeholder="Enter first number" required value="${num1}" />
            <input type="text" name="num2" class="input-box" placeholder="Enter second number" required value="${num2}" />

            <!-- Operation Selection -->
            <select name="operation" class="input-box" >
                <option value="">Select Operation</option>
                <option value="add">Add</option>
                <option value="subtract">Subtract</option>
                <option value="multiply">Multiply</option>
                <option value="divide">Divide</option>
            </select>

            <!-- Submit Button -->
            <button type="submit">Calculate</button>
        </form>

        <hr>

        <!-- Display Result -->
        <div>
            <h3>Result: 
                <%= request.getAttribute("result") != null ? request.getAttribute("result") : "Not calculated yet" %>
            </h3>
        </div>
    </div>

</body>
</html>
