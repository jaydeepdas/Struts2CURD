<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>AddProduct</title>
        <style type="text/css">
            .button-save {background-color: green;color: white;}
            .button-productshow {background-color: #000000;color: white;margin-left: 30%;}
        </style>
    </head>
    <body >
        <h2>Add Product</h2>
        <a href="showproduct"><button class="button-productshow" type="button">Show Products</button></a>
        <s:form action="saveproduct.action" method="post">
            <s:textfield label="ID" name="productId" />
            <s:textfield label="Name" name="productName" />
            <s:textfield label="Make" name="productMake" />
            <s:textfield label="Price" name="price" />
            <s:textfield label="Availability" name="availability" />
            <s:submit cssClass="button-save" value="Save" />
        </s:form>
        <s:if test="ctr>0">
            <span style="color: green;"><s:property value="msg" /></span>
        </s:if>
        <s:else>
            <span style="color: red;"><s:property value="msg" /></span>
        </s:else>
    </body>
</html>