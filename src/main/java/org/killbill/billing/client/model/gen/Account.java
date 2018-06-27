/*
 * Copyright 2014-2018 Groupon, Inc
 * Copyright 2014-2018 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.joda.time.DateTime;
import org.killbill.billing.catalog.api.Currency;
import org.killbill.billing.client.model.gen.AuditLog;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class Account extends KillBillObject {

    private UUID accountId = null;

    private String name = null;

    private Integer firstNameLength = null;

    private String externalKey = null;

    private String email = null;

    private Integer billCycleDayLocal = null;

    private Currency currency = null;

    private UUID parentAccountId = null;

    private Boolean isPaymentDelegatedToParent = false;

    private UUID paymentMethodId = null;

    private DateTime referenceTime = null;

    private String timeZone = null;

    private String address1 = null;

    private String address2 = null;

    private String postalCode = null;

    private String company = null;

    private String city = null;

    private String state = null;

    private String country = null;

    private String locale = null;

    private String phone = null;

    private String notes = null;

    private Boolean isMigrated = false;

    private BigDecimal accountBalance = null;

    private BigDecimal accountCBA = null;



    public Account() {
    }

    public Account(final UUID accountId,
                     final String name,
                     final Integer firstNameLength,
                     final String externalKey,
                     final String email,
                     final Integer billCycleDayLocal,
                     final Currency currency,
                     final UUID parentAccountId,
                     final Boolean isPaymentDelegatedToParent,
                     final UUID paymentMethodId,
                     final DateTime referenceTime,
                     final String timeZone,
                     final String address1,
                     final String address2,
                     final String postalCode,
                     final String company,
                     final String city,
                     final String state,
                     final String country,
                     final String locale,
                     final String phone,
                     final String notes,
                     final Boolean isMigrated,
                     final BigDecimal accountBalance,
                     final BigDecimal accountCBA,
                     final List<AuditLog> auditLogs) {
        super(auditLogs);
        this.accountId = accountId;
        this.name = name;
        this.firstNameLength = firstNameLength;
        this.externalKey = externalKey;
        this.email = email;
        this.billCycleDayLocal = billCycleDayLocal;
        this.currency = currency;
        this.parentAccountId = parentAccountId;
        this.isPaymentDelegatedToParent = isPaymentDelegatedToParent;
        this.paymentMethodId = paymentMethodId;
        this.referenceTime = referenceTime;
        this.timeZone = timeZone;
        this.address1 = address1;
        this.address2 = address2;
        this.postalCode = postalCode;
        this.company = company;
        this.city = city;
        this.state = state;
        this.country = country;
        this.locale = locale;
        this.phone = phone;
        this.notes = notes;
        this.isMigrated = isMigrated;
        this.accountBalance = accountBalance;
        this.accountCBA = accountCBA;

    }


    public Account setAccountId(final UUID accountId) {
        this.accountId = accountId;
        return this;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public Account setName(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Account setFirstNameLength(final Integer firstNameLength) {
        this.firstNameLength = firstNameLength;
        return this;
    }

    public Integer getFirstNameLength() {
        return firstNameLength;
    }

    public Account setExternalKey(final String externalKey) {
        this.externalKey = externalKey;
        return this;
    }

    public String getExternalKey() {
        return externalKey;
    }

    public Account setEmail(final String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Account setBillCycleDayLocal(final Integer billCycleDayLocal) {
        this.billCycleDayLocal = billCycleDayLocal;
        return this;
    }

    public Integer getBillCycleDayLocal() {
        return billCycleDayLocal;
    }

    public Account setCurrency(final Currency currency) {
        this.currency = currency;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Account setParentAccountId(final UUID parentAccountId) {
        this.parentAccountId = parentAccountId;
        return this;
    }

    public UUID getParentAccountId() {
        return parentAccountId;
    }

    public Account setIsPaymentDelegatedToParent(final Boolean isPaymentDelegatedToParent) {
        this.isPaymentDelegatedToParent = isPaymentDelegatedToParent;
        return this;
    }

    @JsonProperty(value="isPaymentDelegatedToParent")
    public Boolean isPaymentDelegatedToParent() {
        return isPaymentDelegatedToParent;
    }

    public Account setPaymentMethodId(final UUID paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
        return this;
    }

    public UUID getPaymentMethodId() {
        return paymentMethodId;
    }

    public Account setReferenceTime(final DateTime referenceTime) {
        this.referenceTime = referenceTime;
        return this;
    }

    public DateTime getReferenceTime() {
        return referenceTime;
    }

    public Account setTimeZone(final String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public Account setAddress1(final String address1) {
        this.address1 = address1;
        return this;
    }

    public String getAddress1() {
        return address1;
    }

    public Account setAddress2(final String address2) {
        this.address2 = address2;
        return this;
    }

    public String getAddress2() {
        return address2;
    }

    public Account setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public Account setCompany(final String company) {
        this.company = company;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Account setCity(final String city) {
        this.city = city;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Account setState(final String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return state;
    }

    public Account setCountry(final String country) {
        this.country = country;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Account setLocale(final String locale) {
        this.locale = locale;
        return this;
    }

    public String getLocale() {
        return locale;
    }

    public Account setPhone(final String phone) {
        this.phone = phone;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Account setNotes(final String notes) {
        this.notes = notes;
        return this;
    }

    public String getNotes() {
        return notes;
    }

    public Account setIsMigrated(final Boolean isMigrated) {
        this.isMigrated = isMigrated;
        return this;
    }

    @JsonProperty(value="isMigrated")
    public Boolean isMigrated() {
        return isMigrated;
    }

    public Account setAccountBalance(final BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
        return this;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public Account setAccountCBA(final BigDecimal accountCBA) {
        this.accountCBA = accountCBA;
        return this;
    }

    public BigDecimal getAccountCBA() {
        return accountCBA;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(this.accountId, account.accountId) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.firstNameLength, account.firstNameLength) &&
        Objects.equals(this.externalKey, account.externalKey) &&
        Objects.equals(this.email, account.email) &&
        Objects.equals(this.billCycleDayLocal, account.billCycleDayLocal) &&
        Objects.equals(this.currency, account.currency) &&
        Objects.equals(this.parentAccountId, account.parentAccountId) &&
        Objects.equals(this.isPaymentDelegatedToParent, account.isPaymentDelegatedToParent) &&
        Objects.equals(this.paymentMethodId, account.paymentMethodId) &&
        Objects.equals(this.referenceTime, account.referenceTime) &&
        Objects.equals(this.timeZone, account.timeZone) &&
        Objects.equals(this.address1, account.address1) &&
        Objects.equals(this.address2, account.address2) &&
        Objects.equals(this.postalCode, account.postalCode) &&
        Objects.equals(this.company, account.company) &&
        Objects.equals(this.city, account.city) &&
        Objects.equals(this.state, account.state) &&
        Objects.equals(this.country, account.country) &&
        Objects.equals(this.locale, account.locale) &&
        Objects.equals(this.phone, account.phone) &&
        Objects.equals(this.notes, account.notes) &&
        Objects.equals(this.isMigrated, account.isMigrated) &&
        Objects.equals(this.accountBalance, account.accountBalance) &&
        Objects.equals(this.accountCBA, account.accountCBA) &&
        Objects.equals(this.auditLogs, account.auditLogs);

    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId,
                            name,
                            firstNameLength,
                            externalKey,
                            email,
                            billCycleDayLocal,
                            currency,
                            parentAccountId,
                            isPaymentDelegatedToParent,
                            paymentMethodId,
                            referenceTime,
                            timeZone,
                            address1,
                            address2,
                            postalCode,
                            company,
                            city,
                            state,
                            country,
                            locale,
                            phone,
                            notes,
                            isMigrated,
                            accountBalance,
                            accountCBA,
                            auditLogs, super.hashCode());
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Account {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    firstNameLength: ").append(toIndentedString(firstNameLength)).append("\n");
        sb.append("    externalKey: ").append(toIndentedString(externalKey)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    billCycleDayLocal: ").append(toIndentedString(billCycleDayLocal)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    parentAccountId: ").append(toIndentedString(parentAccountId)).append("\n");
        sb.append("    isPaymentDelegatedToParent: ").append(toIndentedString(isPaymentDelegatedToParent)).append("\n");
        sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
        sb.append("    referenceTime: ").append(toIndentedString(referenceTime)).append("\n");
        sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
        sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
        sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    isMigrated: ").append(toIndentedString(isMigrated)).append("\n");
        sb.append("    accountBalance: ").append(toIndentedString(accountBalance)).append("\n");
        sb.append("    accountCBA: ").append(toIndentedString(accountCBA)).append("\n");
        sb.append("    auditLogs: ").append(toIndentedString(auditLogs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
