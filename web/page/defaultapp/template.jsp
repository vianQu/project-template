<%--
  Created by IntelliJ IDEA.
  User: VIAN QU
  Date: Nov 18, 2012
  Time: 1:34:26 PM
  Email: vian.qu@gmail.com | vian_qu@yahoo.com
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<html>
  <head>
  <title>Simple jsp page</title>
      <script type='text/javascript' src='${pageContext.request.contextPath}/dwr/engine.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/dwr/util.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/media/js/jquery-1.8.2.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/media/js/jquery-ui-1.9.1.custom.js'></script>
      <script type='text/javascript' src='${pageContext.request.contextPath}/media/js/bootstrap.min.js'></script>

      <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/media/css/bootstrap.min.css" media="screen"/>
      <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/media/css/bootstrap-responsive.min.css"/>
      <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/page/media/css/smoothness/jquery-ui-1.9.1.custom.css"/>
      
      <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/media/css/content.css"/>
      <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/media/css/paging.css"/>
      <sj:head jqueryui="true" jquerytheme="smoothness"/>
  </head>
  <body>
  <%--alert message--%>
  <s:actionerror theme="bootstrap"/>
  <s:actionmessage theme="bootstrap"/>
  <s:fielderror theme="bootstrap"/>

  <div class="form-horizontal">

      <center><h2> Template Screen Project </h2></center>

      <s:form name="formTemplate" namespace="/" theme="bootstrap" cssClass="form-horizontal">
          <br/>
          <s:textfield name="text1" placeholder="ini text field 1" label="text field" labelposition="inline" />
          <s:password name="pass" placeholder="Password" label="password"/>
          <s:textarea name="textArea1" id="textArea1" label="Alamat"/>
          <s:checkboxlist
                        tooltip="Choose your Friends"
                        label="Friends" labelSeparator=":"
                        list="{'Wes', 'Patrick', 'Jason', 'Jay', 'Toby', 'Rene'}"
                        name="friends"/>
          <s:radio
                        tooltip="Choose your Best Friend"
                        label="Best Friend"
                        list="{'Wes', 'Patrick', 'Jason', 'Jay', 'Toby', 'Rene'}"
                        name="bestFriend"
                        cssErrorClass="foo"/>
          <s:radio
                        tooltip="Radio Buttons with inline position"
                        label="Best Friend Inline"
                        labelposition="inline"
                        list="{'Wes', 'Patrick', 'Jason', 'Jay', 'Toby', 'Rene'}"
                        name="bestFriendInline"
                        cssErrorClass="foo"/>
          <s:select
                        tooltip="Choose Your Favourite Color"
                        label="Favorite Color"
                        list="{'Red', 'Blue', 'Green'}"
                        name="favouriteColor"
                        emptyOption="false"
                        headerKey="None"
                        headerValue="None"/>
          
          <s:doubleselect
                        tooltip="Choose Your State"
                        label="State"
                        name="region" list="{'North', 'South'}"
                        value="'South'"
                        doubleValue="'Florida'"
                        doubleList="top == 'North' ? {'Oregon', 'Washington'} : {'Texas', 'Florida'}"
                        doubleName="state"
                        headerKey="-1"
                        headerValue="---------- Please Select ----------"
                        emptyOption="true"/>
          <s:file
                        tooltip="Upload Your Picture"
                        label="Picture"
                        name="picture"/>
          <s:optiontransferselect
                        tooltip="Select Your Favourite Cartoon Characters"
                        label="Favourite Cartoons Characters"
                        name="leftSideCartoonCharacters"
                        leftTitle="Left Title"
                        rightTitle="Right Title"
                        list="{'Popeye', 'He-Man', 'Spiderman'}"
                        multiple="true"
                        headerKey="headerKey"
                        headerValue="--- Please Select ---"
                        emptyOption="true"
                        doubleList="{'Superman', 'Mickey Mouse', 'Donald Duck'}"
                        doubleName="rightSideCartoonCharacters"
                        doubleHeaderKey="doubleHeaderKey"
                        doubleHeaderValue="--- Please Select ---"
                        doubleEmptyOption="true"
                        doubleMultiple="true"/>
          <s:textarea
                        label="Your Thougths"
                        name="thoughts"
                        cssClass="input-xxlarge"
                        tooltip="Enter your thoughts here"/>
                <div class="form-actions">
                    <s:submit cssClass="btn"/>
                </div>
      </s:form>

  </div>

  <div id="advance">
      <h2>advance form</h2>

            <s:form theme="simple" cssClass="well form-search">
                <s:textfield
                        placeholder="Login"
                        name="login"
                        tooltip="Enter your Name here"/>

                <s:password
                        placeholder="Password"
                        name="password"/>

                <s:submit cssClass="btn-primary"/>
            </s:form>

      <s:form action="echo" theme="bootstrap" cssClass="well form-vertical" label="AJAX Echo Form">
                <s:textfield
                        label="Enter your Name"
                        name="echo"
                        tooltip="Enter your Name here"/>

                <sj:submit targets="result" effect="highlight" cssClass="btn-success"/>
            </s:form>
            <div id="result"></div>

      <h2>A Bootstrap Form with a simple Typeahead Input Field.</h2>

            <s:form theme="bootstrap" cssClass="well form-horizontal" label="Form with Typeahead Input Field">
                <s:textfield
                        label="Choose a State"
                        name="echo"
                        tooltip="Choose a State here"
                        data-provide="typeahead"
                        data-source="[&quot;Alabama&quot;,&quot;Alaska&quot;,&quot;Arizona&quot;,&quot;Arkansas&quot;,&quot;California&quot;,&quot;Colorado&quot;,&quot;Connecticut&quot;,&quot;Delaware&quot;,&quot;Florida&quot;,&quot;Georgia&quot;,&quot;Hawaii&quot;,&quot;Idaho&quot;,&quot;Illinois&quot;,&quot;Indiana&quot;,&quot;Iowa&quot;,&quot;Kansas&quot;,&quot;Kentucky&quot;,&quot;Louisiana&quot;,&quot;Maine&quot;,&quot;Maryland&quot;,&quot;Massachusetts&quot;,&quot;Michigan&quot;,&quot;Minnesota&quot;,&quot;Mississippi&quot;,&quot;Missouri&quot;,&quot;Montana&quot;,&quot;Nebraska&quot;,&quot;Nevada&quot;,&quot;New Hampshire&quot;,&quot;New Jersey&quot;,&quot;New Mexico&quot;,&quot;New York&quot;,&quot;North Dakota&quot;,&quot;North Carolina&quot;,&quot;Ohio&quot;,&quot;Oklahoma&quot;,&quot;Oregon&quot;,&quot;Pennsylvania&quot;,&quot;Rhode Island&quot;,&quot;South Carolina&quot;,&quot;South Dakota&quot;,&quot;Tennessee&quot;,&quot;Texas&quot;,&quot;Utah&quot;,&quot;Vermont&quot;,&quot;Virginia&quot;,&quot;Washington&quot;,&quot;West Virginia&quot;,&quot;Wisconsin&quot;,&quot;Wyoming&quot;]"
                        data-items="4"
                 />
            </s:form>
  </div>

  <div class="span9">

            <h2>A Bootstrap Form with jQuery UI Datepicker and jQuery UI Autocompleter</h2>

            <s:form action="echo" theme="bootstrap" cssClass="form-horizontal" label="Form with jQuery UI Elements">
                <sj:datepicker
                        id="datepicker"
                        parentTheme="bootstrap"
                        label="Datepicker"
                        tooltip="Tooltip for Datepicker"
                />
                <s:url id="languages_url" action="languages"/>
                <sj:autocompleter
                        id="autocompleter"
                        parentTheme="bootstrap"
                        label="Autocompleter"
                        tooltip="Tooltip for Autocompleter"
                        href="%{languages_url}"
	    	            loadMinimumCount="1"
                 />
            </s:form>

            <button id="code1btn" class="btn">Code Example</button>
            <div id="code1" class="collapse in">
                <pre>
                    &lt;s:form action=&quot;echo&quot; theme=&quot;bootstrap&quot; cssClass=&quot;form-horizontal&quot; label=&quot;Form with jQuery UI Elements&quot;&gt;
                        &lt;sj:datepicker
                                id=&quot;datepicker&quot;
                                parentTheme=&quot;bootstrap&quot;
                                label=&quot;Datepicker&quot;
                                tooltip=&quot;Tooltip for Datepicker&quot;
                        /&gt;
                        &lt;s:url id=&quot;languages_url&quot; action=&quot;languages&quot;/&gt;
                        &lt;sj:autocompleter
                                id=&quot;autocompleter&quot;
                                parentTheme=&quot;bootstrap&quot;
                                label=&quot;Autocompleter&quot;
                                tooltip=&quot;Tooltip for Autocompleter&quot;
                                href=&quot;%{languages_url}&quot;
                                loadMinimumCount=&quot;1&quot;
                         /&gt;
                    &lt;/s:form&gt;
                </pre>
            </div>
        </div>

  </body>
</html>