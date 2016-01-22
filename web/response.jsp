<body>
    <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
    <jsp:setProperty name="mybean" property="name" />
    <h1>Hello, <jsp:getProperty name="mybean" property="name" />!</h1>
</body>