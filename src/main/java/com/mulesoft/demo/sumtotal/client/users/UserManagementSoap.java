package com.mulesoft.demo.sumtotal.client.users;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2013-05-20T11:08:11.076-07:00
 * Generated source version: 2.7.5
 * 
 */
@WebService(targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", name = "UserManagementSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface UserManagementSoap {

    @RequestWrapper(localName = "AddUpdateRequiredSkill", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.AddUpdateRequiredSkill")
    @WebMethod(operationName = "AddUpdateRequiredSkill", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/AddUpdateRequiredSkill")
    @ResponseWrapper(localName = "AddUpdateRequiredSkillResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.AddUpdateRequiredSkillResponse")
    public void addUpdateRequiredSkill(
        @WebParam(name = "toUsrId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String toUsrId,
        @WebParam(name = "requiredSkillId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String requiredSkillId,
        @WebParam(name = "prtyId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String prtyId,
        @WebParam(name = "profValueId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String profValueId,
        @WebParam(name = "notes", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String notes
    );

    @RequestWrapper(localName = "RemoveRequiredActivity", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.RemoveRequiredActivity")
    @WebMethod(operationName = "RemoveRequiredActivity", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/RemoveRequiredActivity")
    @ResponseWrapper(localName = "RemoveRequiredActivityResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.RemoveRequiredActivityResponse")
    public void removeRequiredActivity(
        @WebParam(name = "removedUserRequiredActivityId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String removedUserRequiredActivityId
    );

    @WebResult(name = "GetRequiredSkillsResult", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    @RequestWrapper(localName = "GetRequiredSkills", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetRequiredSkills")
    @WebMethod(operationName = "GetRequiredSkills", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/GetRequiredSkills")
    @ResponseWrapper(localName = "GetRequiredSkillsResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetRequiredSkillsResponse")
    public com.mulesoft.demo.sumtotal.client.users.ArrayOfUserRequiredSkill2 getRequiredSkills(
        @WebParam(name = "forUsrId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String forUsrId,
        @WebParam(name = "populationLevel", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        int populationLevel
    );

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "CreateUserResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", partName = "parameters")
    @WebMethod(operationName = "CreateUser", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/CreateUser")
    public CreateUserResponse createUser(
        @WebParam(partName = "parameters", name = "CreateUser", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        CreateUser parameters
    );

    @RequestWrapper(localName = "RemoveAcquiredSkill", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.RemoveAcquiredSkill")
    @WebMethod(operationName = "RemoveAcquiredSkill", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/RemoveAcquiredSkill")
    @ResponseWrapper(localName = "RemoveAcquiredSkillResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.RemoveAcquiredSkillResponse")
    public void removeAcquiredSkill(
        @WebParam(name = "removeAcquiredSkillId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String removeAcquiredSkillId
    );

    @WebResult(name = "IsCertificationResult", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    @RequestWrapper(localName = "IsCertification", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.IsCertification")
    @WebMethod(operationName = "IsCertification", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/IsCertification")
    @ResponseWrapper(localName = "IsCertificationResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.IsCertificationResponse")
    public boolean isCertification(
        @WebParam(name = "inUserId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String inUserId,
        @WebParam(name = "inCertId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String inCertId
    );

    @WebResult(name = "RefreshAudienceResult", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    @RequestWrapper(localName = "RefreshAudience", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.RefreshAudience")
    @WebMethod(operationName = "RefreshAudience", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/RefreshAudience")
    @ResponseWrapper(localName = "RefreshAudienceResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.RefreshAudienceResponse")
    public java.lang.String refreshAudience(
        @WebParam(name = "audID", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String audID
    );

    @WebResult(name = "GetUsersResult", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    @RequestWrapper(localName = "GetUsers", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetUsers")
    @WebMethod(operationName = "GetUsers", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/GetUsers")
    @ResponseWrapper(localName = "GetUsersResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetUsersResponse")
    public com.mulesoft.demo.sumtotal.client.users.ArrayOfUser getUsers(
        @WebParam(name = "inDomainId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String inDomainId,
        @WebParam(name = "searchFilter", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String searchFilter,
        @WebParam(name = "populationLevel", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        int populationLevel
    );

    @RequestWrapper(localName = "AddUpdateRequiredCompetency", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.AddUpdateRequiredCompetency")
    @WebMethod(operationName = "AddUpdateRequiredCompetency", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/AddUpdateRequiredCompetency")
    @ResponseWrapper(localName = "AddUpdateRequiredCompetencyResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.AddUpdateRequiredCompetencyResponse")
    public void addUpdateRequiredCompetency(
        @WebParam(name = "toUsrId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String toUsrId,
        @WebParam(name = "requiredCompId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String requiredCompId,
        @WebParam(name = "prtyId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String prtyId,
        @WebParam(name = "notes", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String notes
    );

    @WebResult(name = "GetRequiredCompetenciesResult", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    @RequestWrapper(localName = "GetRequiredCompetencies", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetRequiredCompetencies")
    @WebMethod(operationName = "GetRequiredCompetencies", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/GetRequiredCompetencies")
    @ResponseWrapper(localName = "GetRequiredCompetenciesResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetRequiredCompetenciesResponse")
    public com.mulesoft.demo.sumtotal.client.users.ArrayOfUserRequiredCompetency2 getRequiredCompetencies(
        @WebParam(name = "forUsrId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String forUsrId,
        @WebParam(name = "populationLevel", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        int populationLevel
    );

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "UpdateUserResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", partName = "parameters")
    @WebMethod(operationName = "UpdateUser", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/UpdateUser")
    public UpdateUserResponse updateUser(
        @WebParam(partName = "parameters", name = "UpdateUser", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        UpdateUser parameters
    );

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetUserByIdResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", partName = "parameters")
    @WebMethod(operationName = "GetUserById", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/GetUserById")
    public GetUserByIdResponse getUserById(
        @WebParam(partName = "parameters", name = "GetUserById", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        GetUserById parameters
    );

    @RequestWrapper(localName = "AddUpdateAcquiredSkill", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.AddUpdateAcquiredSkill")
    @WebMethod(operationName = "AddUpdateAcquiredSkill", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/AddUpdateAcquiredSkill")
    @ResponseWrapper(localName = "AddUpdateAcquiredSkillResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.AddUpdateAcquiredSkillResponse")
    public void addUpdateAcquiredSkill(
        @WebParam(name = "toUsrId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String toUsrId,
        @WebParam(name = "acquiredSkillId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String acquiredSkillId,
        @WebParam(name = "profValueId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String profValueId,
        @WebParam(name = "acqFirstDt", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        javax.xml.datatype.XMLGregorianCalendar acqFirstDt,
        @WebParam(name = "acqLastDt", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        javax.xml.datatype.XMLGregorianCalendar acqLastDt,
        @WebParam(name = "notes", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String notes
    );

    @WebResult(name = "GetPendingEvaluationsResult", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    @RequestWrapper(localName = "GetPendingEvaluations", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetPendingEvaluations")
    @WebMethod(operationName = "GetPendingEvaluations", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/GetPendingEvaluations")
    @ResponseWrapper(localName = "GetPendingEvaluationsResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetPendingEvaluationsResponse")
    public com.mulesoft.demo.sumtotal.client.users.ArrayOfEvaluation getPendingEvaluations(
        @WebParam(name = "forUsrId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String forUsrId,
        @WebParam(name = "populationLevel", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        int populationLevel
    );

    @WebResult(name = "GetAcquiredSkillsResult", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    @RequestWrapper(localName = "GetAcquiredSkills", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetAcquiredSkills")
    @WebMethod(operationName = "GetAcquiredSkills", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/GetAcquiredSkills")
    @ResponseWrapper(localName = "GetAcquiredSkillsResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetAcquiredSkillsResponse")
    public com.mulesoft.demo.sumtotal.client.users.ArrayOfUserAcquiredSkill2 getAcquiredSkills(
        @WebParam(name = "forUsrId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String forUsrId,
        @WebParam(name = "populationLevel", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        int populationLevel
    );

    @WebResult(name = "GetMemberDomainsResult", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    @RequestWrapper(localName = "GetMemberDomains", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetMemberDomains")
    @WebMethod(operationName = "GetMemberDomains", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/GetMemberDomains")
    @ResponseWrapper(localName = "GetMemberDomainsResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetMemberDomainsResponse")
    public com.mulesoft.demo.sumtotal.client.users.ArrayOfDomainUser2 getMemberDomains(
        @WebParam(name = "forUsrId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String forUsrId,
        @WebParam(name = "populationLevel", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        int populationLevel
    );

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "CreateEmptyUserResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", partName = "parameters")
    @WebMethod(operationName = "CreateEmptyUser", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/CreateEmptyUser")
    public CreateEmptyUserResponse createEmptyUser(
        @WebParam(partName = "parameters", name = "CreateEmptyUser", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        CreateEmptyUser parameters
    );

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "CreateUserAndUpdateJobOrgResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", partName = "parameters")
    @WebMethod(operationName = "CreateUserAndUpdateJobOrg", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/CreateUserAndUpdateJobOrg")
    public CreateUserAndUpdateJobOrgResponse createUserAndUpdateJobOrg(
        @WebParam(partName = "parameters", name = "CreateUserAndUpdateJobOrg", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        CreateUserAndUpdateJobOrg parameters
    );

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetUserByUserNameResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", partName = "parameters")
    @WebMethod(operationName = "GetUserByUserName", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/GetUserByUserName")
    public GetUserByUserNameResponse getUserByUserName(
        @WebParam(partName = "parameters", name = "GetUserByUserName", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        GetUserByUserName parameters
    );

    @RequestWrapper(localName = "AddUpdateRequiredActivity", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.AddUpdateRequiredActivity")
    @WebMethod(operationName = "AddUpdateRequiredActivity", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/AddUpdateRequiredActivity")
    @ResponseWrapper(localName = "AddUpdateRequiredActivityResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.AddUpdateRequiredActivityResponse")
    public void addUpdateRequiredActivity(
        @WebParam(name = "toUserId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String toUserId,
        @WebParam(name = "requiredActivityId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String requiredActivityId,
        @WebParam(name = "prtyId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String prtyId,
        @WebParam(name = "grdId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String grdId,
        @WebParam(name = "notes", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String notes
    );

    @RequestWrapper(localName = "UserAudienceRefresh", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.UserAudienceRefresh")
    @WebMethod(operationName = "UserAudienceRefresh", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/UserAudienceRefresh")
    @ResponseWrapper(localName = "UserAudienceRefreshResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.UserAudienceRefreshResponse")
    public void userAudienceRefresh(
        @WebParam(name = "EmpID", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String empID
    );

    @WebResult(name = "SearchUsersByPathResult", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    @RequestWrapper(localName = "SearchUsersByPath", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.SearchUsersByPath")
    @WebMethod(operationName = "SearchUsersByPath", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/SearchUsersByPath")
    @ResponseWrapper(localName = "SearchUsersByPathResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.SearchUsersByPathResponse")
    public com.mulesoft.demo.sumtotal.client.users.ArrayOfUser searchUsersByPath(
        @WebParam(name = "path", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String path,
        @WebParam(name = "returnProperties", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String returnProperties
    );

    @WebResult(name = "GetTRUsersResult", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    @RequestWrapper(localName = "GetTRUsers", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetTRUsers")
    @WebMethod(operationName = "GetTRUsers", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/GetTRUsers")
    @ResponseWrapper(localName = "GetTRUsersResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetTRUsersResponse")
    public com.mulesoft.demo.sumtotal.client.users.ArrayOfUser getTRUsers(
        @WebParam(name = "populationLevel", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        int populationLevel
    );

    @WebResult(name = "GetRequiredActivitiesResult", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
    @RequestWrapper(localName = "GetRequiredActivities", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetRequiredActivities")
    @WebMethod(operationName = "GetRequiredActivities", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/GetRequiredActivities")
    @ResponseWrapper(localName = "GetRequiredActivitiesResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.GetRequiredActivitiesResponse")
    public com.mulesoft.demo.sumtotal.client.users.ArrayOfUserRequiredActivity2 getRequiredActivities(
        @WebParam(name = "forUserId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String forUserId,
        @WebParam(name = "populationLevel", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        int populationLevel
    );

    @RequestWrapper(localName = "RemoveRequiredSkill", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.RemoveRequiredSkill")
    @WebMethod(operationName = "RemoveRequiredSkill", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/RemoveRequiredSkill")
    @ResponseWrapper(localName = "RemoveRequiredSkillResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.RemoveRequiredSkillResponse")
    public void removeRequiredSkill(
        @WebParam(name = "removedUserRequiredSkillId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String removedUserRequiredSkillId
    );

    @RequestWrapper(localName = "RemoveRequiredCompetency", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.RemoveRequiredCompetency")
    @WebMethod(operationName = "RemoveRequiredCompetency", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/RemoveRequiredCompetency")
    @ResponseWrapper(localName = "RemoveRequiredCompetencyResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", className = "com.mulesoft.demo.sumtotal.client.users.RemoveRequiredCompetencyResponse")
    public void removeRequiredCompetency(
        @WebParam(name = "removedUserRequiredCompId", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        java.lang.String removedUserRequiredCompId
    );

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "DeleteUserResponse", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/", partName = "parameters")
    @WebMethod(operationName = "DeleteUser", action = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/DeleteUser")
    public DeleteUserResponse deleteUser(
        @WebParam(partName = "parameters", name = "DeleteUser", targetNamespace = "http://www.sumtotalsystems.com/sumtotal7/sumtotalws/UserManagement/")
        DeleteUser parameters
    );
}