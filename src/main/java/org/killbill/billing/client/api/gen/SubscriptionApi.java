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


package org.killbill.billing.client.api.gen;


import org.killbill.billing.client.model.gen.BlockingState;
import org.killbill.billing.client.model.gen.BulkSubscriptionsBundle;
import org.killbill.billing.client.model.gen.Bundle;
import org.killbill.billing.client.model.gen.CustomField;
import org.joda.time.LocalDate;
import org.killbill.billing.client.model.gen.Subscription;
import org.killbill.billing.client.model.gen.Tag;
import java.util.UUID;
import java.util.Map;
import org.killbill.billing.entitlement.api.Entitlement.EntitlementActionPolicy;
import org.killbill.billing.catalog.api.BillingActionPolicy;
import org.killbill.billing.client.model.CustomFields;
import java.util.List;
import org.killbill.billing.client.model.Subscriptions;
import org.killbill.billing.client.model.Bundles;
import org.killbill.billing.client.model.BulkSubscriptionsBundles;
import org.killbill.billing.client.model.Tags;
import org.killbill.billing.util.api.AuditLevel;

import com.google.common.collect.Multimap;
import com.google.common.base.Preconditions;
import com.google.common.base.MoreObjects;
import com.google.common.collect.LinkedListMultimap;

import org.killbill.billing.client.Converter;
import org.killbill.billing.client.KillBillClientException;
import org.killbill.billing.client.KillBillHttpClient;
import org.killbill.billing.client.RequestOptions;
import org.killbill.billing.client.RequestOptions.RequestOptionsBuilder;


/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
public class SubscriptionApi {

    private final KillBillHttpClient httpClient;

    public SubscriptionApi() {
        this(new KillBillHttpClient());
    }

    public SubscriptionApi(final KillBillHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public void addSubscriptionBlockingState(final BlockingState body, final UUID subscriptionId, final LocalDate requestedDate, final Map<String, String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling addSubscriptionBlockingState");
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling addSubscriptionBlockingState");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/block"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (requestedDate != null) {
            queryParams.put("requestedDate", String.valueOf(requestedDate));
        }
        if (pluginProperty != null) {
            queryParams.putAll("pluginProperty", Converter.convertPluginPropertyMap(pluginProperty));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doPut(uri, body, requestOptions);
    }

    public void cancelEntitlementPlan(final UUID subscriptionId, final LocalDate requestedDate, final EntitlementActionPolicy entitlementPolicy, final BillingActionPolicy billingPolicy, final Map<String, String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        cancelEntitlementPlan(subscriptionId, requestedDate, Boolean.valueOf(false), Long.valueOf(5), entitlementPolicy, billingPolicy, Boolean.valueOf(false), pluginProperty, inputOptions);
    }


    public void cancelEntitlementPlan(final UUID subscriptionId, final LocalDate requestedDate, final Boolean callCompletion, final Long callTimeoutSec, final EntitlementActionPolicy entitlementPolicy, final BillingActionPolicy billingPolicy, final Boolean useRequestedDateForBilling, final Map<String, String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling cancelEntitlementPlan");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (requestedDate != null) {
            queryParams.put("requestedDate", String.valueOf(requestedDate));
        }
        if (callCompletion != null) {
            queryParams.put("callCompletion", String.valueOf(callCompletion));
        }
        if (callTimeoutSec != null) {
            queryParams.put("callTimeoutSec", String.valueOf(callTimeoutSec));
        }
        if (entitlementPolicy != null) {
            queryParams.put("entitlementPolicy", String.valueOf(entitlementPolicy));
        }
        if (billingPolicy != null) {
            queryParams.put("billingPolicy", String.valueOf(billingPolicy));
        }
        if (useRequestedDateForBilling != null) {
            queryParams.put("useRequestedDateForBilling", String.valueOf(useRequestedDateForBilling));
        }
        if (pluginProperty != null) {
            queryParams.putAll("pluginProperty", Converter.convertPluginPropertyMap(pluginProperty));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doDelete(uri, requestOptions);
    }

    public void changeEntitlementPlan(final Subscription body, final UUID subscriptionId, final LocalDate requestedDate, final BillingActionPolicy billingPolicy, final Map<String, String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        changeEntitlementPlan(body, subscriptionId, requestedDate, Boolean.valueOf(false), Long.valueOf(3), billingPolicy, pluginProperty, inputOptions);
    }

    public void changeEntitlementPlan(final Subscription body, final UUID subscriptionId, final LocalDate requestedDate, final Boolean callCompletion, final Long callTimeoutSec, final BillingActionPolicy billingPolicy, final Map<String, String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling changeEntitlementPlan");
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling changeEntitlementPlan");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (requestedDate != null) {
            queryParams.put("requestedDate", String.valueOf(requestedDate));
        }
        if (callCompletion != null) {
            queryParams.put("callCompletion", String.valueOf(callCompletion));
        }
        if (callTimeoutSec != null) {
            queryParams.put("callTimeoutSec", String.valueOf(callTimeoutSec));
        }
        if (billingPolicy != null) {
            queryParams.put("billingPolicy", String.valueOf(billingPolicy));
        }
        if (pluginProperty != null) {
            queryParams.putAll("pluginProperty", Converter.convertPluginPropertyMap(pluginProperty));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doPut(uri, body, requestOptions);
    }

    public void createCustomFields(final UUID subscriptionId, final CustomFields body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling createCustomFields");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createCustomFields");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/customFields"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        inputOptionsBuilder.withFollowLocation(followLocation);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doPost(uri, body, requestOptions);
    }

    public Subscription createEntitlement(final Subscription body, final LocalDate entitlementDate, final LocalDate billingDate, final Integer bcd, final Map<String, String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        return createEntitlement(body, entitlementDate, billingDate, Boolean.valueOf(true), Boolean.valueOf(false), bcd, Boolean.valueOf(false), Long.valueOf(3), pluginProperty, inputOptions);
    }

    public Subscription createEntitlement(final Subscription body, final LocalDate entitlementDate, final LocalDate billingDate, final Boolean renameKeyIfExistsAndUnused, final Boolean migrated, final Integer bcd, final Boolean callCompletion, final Long callTimeoutSec, final Map<String, String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createEntitlement");

        final String uri = "/1.0/kb/subscriptions";

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (entitlementDate != null) {
            queryParams.put("entitlementDate", String.valueOf(entitlementDate));
        }
        if (billingDate != null) {
            queryParams.put("billingDate", String.valueOf(billingDate));
        }
        if (renameKeyIfExistsAndUnused != null) {
            queryParams.put("renameKeyIfExistsAndUnused", String.valueOf(renameKeyIfExistsAndUnused));
        }
        if (migrated != null) {
            queryParams.put("migrated", String.valueOf(migrated));
        }
        if (bcd != null) {
            queryParams.put("bcd", String.valueOf(bcd));
        }
        if (callCompletion != null) {
            queryParams.put("callCompletion", String.valueOf(callCompletion));
        }
        if (callTimeoutSec != null) {
            queryParams.put("callTimeoutSec", String.valueOf(callTimeoutSec));
        }
        if (pluginProperty != null) {
            queryParams.putAll("pluginProperty", Converter.convertPluginPropertyMap(pluginProperty));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        inputOptionsBuilder.withFollowLocation(followLocation);
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doPost(uri, body, Subscription.class, requestOptions);
    }

    public Bundle createEntitlementWithAddOns(final Subscriptions body, final LocalDate entitlementDate, final LocalDate billingDate, final Map<String, String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        return createEntitlementWithAddOns(body, entitlementDate, billingDate, Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(false), Long.valueOf(3), pluginProperty, inputOptions);
    }

    public Bundle createEntitlementWithAddOns(final Subscriptions body, final LocalDate entitlementDate, final LocalDate billingDate, final Boolean migrated, final Boolean renameKeyIfExistsAndUnused, final Boolean callCompletion, final Long callTimeoutSec, final Map<String, String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createEntitlementWithAddOns");

        final String uri = "/1.0/kb/subscriptions/createEntitlementWithAddOns";

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (entitlementDate != null) {
            queryParams.put("entitlementDate", String.valueOf(entitlementDate));
        }
        if (billingDate != null) {
            queryParams.put("billingDate", String.valueOf(billingDate));
        }
        if (migrated != null) {
            queryParams.put("migrated", String.valueOf(migrated));
        }
        if (renameKeyIfExistsAndUnused != null) {
            queryParams.put("renameKeyIfExistsAndUnused", String.valueOf(renameKeyIfExistsAndUnused));
        }
        if (callCompletion != null) {
            queryParams.put("callCompletion", String.valueOf(callCompletion));
        }
        if (callTimeoutSec != null) {
            queryParams.put("callTimeoutSec", String.valueOf(callTimeoutSec));
        }
        if (pluginProperty != null) {
            queryParams.putAll("pluginProperty", Converter.convertPluginPropertyMap(pluginProperty));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        inputOptionsBuilder.withFollowLocation(followLocation);
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doPost(uri, body, Bundle.class, requestOptions);
    }

    public Bundles createEntitlementsWithAddOns(final BulkSubscriptionsBundles body, final LocalDate entitlementDate, final LocalDate billingDate, final Map<String, String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        return createEntitlementsWithAddOns(body, entitlementDate, billingDate, Boolean.valueOf(true), Boolean.valueOf(false), Boolean.valueOf(false), Long.valueOf(3), pluginProperty, inputOptions);
    }

    public Bundles createEntitlementsWithAddOns(final BulkSubscriptionsBundles body, final LocalDate entitlementDate, final LocalDate billingDate, final Boolean renameKeyIfExistsAndUnused, final Boolean migrated, final Boolean callCompletion, final Long callTimeoutSec, final Map<String, String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling createEntitlementsWithAddOns");

        final String uri = "/1.0/kb/subscriptions/createEntitlementsWithAddOns";

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (entitlementDate != null) {
            queryParams.put("entitlementDate", String.valueOf(entitlementDate));
        }
        if (billingDate != null) {
            queryParams.put("billingDate", String.valueOf(billingDate));
        }
        if (renameKeyIfExistsAndUnused != null) {
            queryParams.put("renameKeyIfExistsAndUnused", String.valueOf(renameKeyIfExistsAndUnused));
        }
        if (migrated != null) {
            queryParams.put("migrated", String.valueOf(migrated));
        }
        if (callCompletion != null) {
            queryParams.put("callCompletion", String.valueOf(callCompletion));
        }
        if (callTimeoutSec != null) {
            queryParams.put("callTimeoutSec", String.valueOf(callTimeoutSec));
        }
        if (pluginProperty != null) {
            queryParams.putAll("pluginProperty", Converter.convertPluginPropertyMap(pluginProperty));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        inputOptionsBuilder.withFollowLocation(followLocation);
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doPost(uri, body, Bundles.class, requestOptions);
    }

    public Tags createTags(final UUID subscriptionId, final List<String> tagDef,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling createTags");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/tags"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (tagDef != null) {
            queryParams.putAll("tagDef", tagDef);
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        final Boolean followLocation = MoreObjects.firstNonNull(inputOptions.getFollowLocation(), Boolean.TRUE);
        inputOptionsBuilder.withFollowLocation(followLocation);
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doPost(uri, null, Tags.class, requestOptions);
    }


    public void deleteCustomFields(final UUID subscriptionId, final List<String> customField,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling deleteCustomFields");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/customFields"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (customField != null) {
            queryParams.putAll("customField", customField);
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doDelete(uri, requestOptions);
    }


    public void deleteTags(final UUID subscriptionId, final List<UUID> tagDef,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling deleteTags");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/tags"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (tagDef != null) {
            queryParams.putAll("tagDef", Converter.convertUUIDListToStringList(tagDef));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doDelete(uri, requestOptions);
    }

    public CustomFields getCustomFields(final UUID subscriptionId,  final RequestOptions inputOptions) throws KillBillClientException {
        return getCustomFields(subscriptionId, AuditLevel.NONE, inputOptions);
    }

    public CustomFields getCustomFields(final UUID subscriptionId, final AuditLevel audit,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling getCustomFields");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/customFields"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (audit != null) {
            queryParams.put("audit", String.valueOf(audit));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doGet(uri, CustomFields.class, requestOptions);
    }

    public Subscription getEntitlement(final UUID subscriptionId,  final RequestOptions inputOptions) throws KillBillClientException {
        return getEntitlement(subscriptionId, AuditLevel.NONE, inputOptions);
    }

    public Subscription getEntitlement(final UUID subscriptionId, final AuditLevel audit,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling getEntitlement");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (audit != null) {
            queryParams.put("audit", String.valueOf(audit));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doGet(uri, Subscription.class, requestOptions);
    }

    public Tags getTags(final UUID subscriptionId,  final RequestOptions inputOptions) throws KillBillClientException {
        return getTags(subscriptionId, Boolean.valueOf(false), AuditLevel.NONE, inputOptions);
    }

    public Tags getTags(final UUID subscriptionId, final Boolean includedDeleted, final AuditLevel audit,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling getTags");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/tags"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (includedDeleted != null) {
            queryParams.put("includedDeleted", String.valueOf(includedDeleted));
        }
        if (audit != null) {
            queryParams.put("audit", String.valueOf(audit));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        return httpClient.doGet(uri, Tags.class, requestOptions);
    }

    public void modifyCustomFields(final UUID subscriptionId, final CustomFields body,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling modifyCustomFields");
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling modifyCustomFields");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/customFields"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());


        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doPut(uri, body, requestOptions);
    }

    public void uncancelEntitlementPlan(final UUID subscriptionId, final Map<String, String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling uncancelEntitlementPlan");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/uncancel"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (pluginProperty != null) {
            queryParams.putAll("pluginProperty", Converter.convertPluginPropertyMap(pluginProperty));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doPut(uri, null, requestOptions);
    }

    public void undoChangeEntitlementPlan(final UUID subscriptionId, final Map<String, String> pluginProperty,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling undoChangeEntitlementPlan");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/undoChangePlan"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (pluginProperty != null) {
            queryParams.putAll("pluginProperty", Converter.convertPluginPropertyMap(pluginProperty));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doPut(uri, null, requestOptions);
    }

    public void updateSubscriptionBCD(final Subscription body, final UUID subscriptionId, final LocalDate effectiveFromDate,  final RequestOptions inputOptions) throws KillBillClientException {
        updateSubscriptionBCD(body, subscriptionId, effectiveFromDate, Boolean.valueOf(false), inputOptions);
    }

    public void updateSubscriptionBCD(final Subscription body, final UUID subscriptionId, final LocalDate effectiveFromDate, final Boolean forceNewBcdWithPastEffectiveDate,  final RequestOptions inputOptions) throws KillBillClientException {
        Preconditions.checkNotNull(body, "Missing the required parameter 'body' when calling updateSubscriptionBCD");
        Preconditions.checkNotNull(subscriptionId, "Missing the required parameter 'subscriptionId' when calling updateSubscriptionBCD");

        final String uri = "/1.0/kb/subscriptions/{subscriptionId}/bcd"
          .replaceAll("\\{" + "subscriptionId" + "\\}", subscriptionId.toString());

        final Multimap<String, String> queryParams = LinkedListMultimap.create(inputOptions.getQueryParams());
        if (effectiveFromDate != null) {
            queryParams.put("effectiveFromDate", String.valueOf(effectiveFromDate));
        }
        if (forceNewBcdWithPastEffectiveDate != null) {
            queryParams.put("forceNewBcdWithPastEffectiveDate", String.valueOf(forceNewBcdWithPastEffectiveDate));
        }

        final RequestOptionsBuilder inputOptionsBuilder = inputOptions.extend();
        inputOptionsBuilder.withQueryParams(queryParams);
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_CONTENT_TYPE, "application/json");
        inputOptionsBuilder.withHeader(KillBillHttpClient.HTTP_HEADER_ACCEPT, "application/json");
        final RequestOptions requestOptions = inputOptionsBuilder.build();

        httpClient.doPut(uri, body, requestOptions);
    }

}
