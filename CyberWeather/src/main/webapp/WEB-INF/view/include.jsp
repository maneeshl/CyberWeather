
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:set scope="request" value="${pageContext.request.contextPath}/" var="baseLocation" />
<c:set scope="request" value="${pageContext.request.contextPath}/images/" var="baseImageLocation" />
<c:set scope="request" value="${pageContext.request.contextPath}/css/" var="baseCssLocation" />
<c:set scope="request" value="${pageContext.request.contextPath}/javascript/" var="baseJsLocation" />
