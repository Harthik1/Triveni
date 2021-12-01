package com.Task.Task.core.workflows;
import com.day.cq.tagging.TagConstants;

/**
 * 
 * @author arunkumar.p
 * This class has all the application Constants of TCP
 */
public class WorkflowConstants {

	private WorkflowConstants() {

	}

	public static final String FRAGMENT_PARENT_RESOURCE = "/content/dam/tcp";
	public static final String SITE_ROOT_PATH = "/content/tcp";
	public static final String SUB_SERVICE_USER = "cfuser";
	public static final String CONTENT_FRAGMENT_TITLE = "c_title";
	public static final String TITLE = "title";
	public static final String CONTENT_FRAGMENT_DESC = "c_description";
	public static final String CONTENT_FRAGMENT_DATATYPE = "dataType";
	public static final String CONTENT_FRAGMENT_VALUE = "value";
	public static final String CONTENT_FRAGMENT_NAME = "c_name";
	public static final String CONTENT_FRAGMENT_TYPE = ":type";
	public static final String CONTENT_FRAGMENT_VARIATIONS = "variations";
	public static final String CONTENT_FRAGMENT_ELEMENTS = "elements";
	public static final String CONTENT_FRAGMENT_TAGS_KEY = TagConstants.PN_TAGS;
	public static final String CONTENT_FRAGMENT_TAGS = "tags";
	public static final String LOYALTY_INITIAL_CONFIGURATION = "/content/dam/tcp/app-core/app-content/loyalty/";
	public static final String LOYALTY_CONFIGURATION = "configuration";
	public static final String BRANDS_WITHOUT_TIER = "brands-without-tier";
	public static final String LOYALTY_PATH = "app-core/app-content/loyalty";
	public static final String LOYALTY_ELIGIBILITY_CRITERIA = "/eligibility-criteria";
	public static final String ELIGIBILITY_CRITERIA = "eligibilityCriteria";
	public static final String LOYALTY_EARN_RATE_MSG = "/earn-rate-msg";
	public static final String EARN_RATE_MSG = "earnRateMsg";
	public static final String LOYALTY_BENEFITS = "benefits";
	public static final String LOYALTY_MEMBERSHIP = "membership";
	public static final String LOYALTY_EPICURE = "epicure";
	public static final String LOYALTY_BACKGROUND = "background";
	public static final String LOYALTY_BACKGROUND_BRAND_CARD = "brandCardsBackgroundImageURL";
	public static final String LOYALTY_BACKGROUND_BRAND_CARD_DETAILS = "brandCardDetailsBackgroundImageURL";
	public static final String LOYALTY_BACKGROUND_TCP_VAULT = "tcpVaultDetailsPageBackgroundImageURL";
	public static final String LOYALTY_BACKGROUND_TCP_VAULT_DETAILS = "tcpVaultBackgroundImageURL";
	public static final String BRAND_NAME = "brandName";
	public static final String BRAND_URL = "brandURL";
	public static final String BRAND_IMAGE_URL = "brandImageURL";
	public static final String BRAND_CODE="brandCode";
	public static final String BRAND_TIER="tier";
	public static final String BENEFITS_LIST = "benefitList";
	public static final String MEMBERSHIP_LIST = "membershipList";
	public static final String ALL_BENEFITS = "allBenefits";
	public static final String MEMBERSHIP_BENFITS = "membershipBenfits";
	public static final String FRAGMENT_TAG_PROPERTY_NAME="tags";
	public static final String PATH_TO_PAYMENT_INSTRUMENT_MODEL=WorkflowConstants.MODELS_URI+"/payment-instrument";
	public static final String PATH_TO_LOYALTY_CARD_MODEL=WorkflowConstants.MODELS_URI+"/loyalty-cards";
	public static final String PATH_TO_VAULT_OFFERS=WorkflowConstants.MODELS_URI+"/vault-offers";
	public static final String CONTENT_FRAGMENT_DATA="data";
	public static final String BAD_REQUEST_MESSAGE="Bad Request";
	public static final String ERROR_LOG_MESSAGE="Error while getting assets";
	public static final String ASSETS_URLS="assetsUrls";
	public static final String PATH_PARAM="path";
	public static final String KEY_TEMPLATE="HCM_1";
	public static final String INTERNAL_SERVER_ERROR="Internal Server error";
	public static final String FRAGMENT_CREATION_ERROR="Error while creating Content Fragment";
	public static final String CONTENT_FRAGMENT_OFFSET="offset";
	public static final String CONTENT_FRAGMENT_LIMIT="limit";
	public static final String BRAND_FRAGMENT_ERROR="Error while getting brand data";
	public static final String USER_AUTHENTICATION_ERROR="Error while Authenticating User";
	public static final String CONTENT_FRAGMENT_CREATED="Created";
	public static final String INTERAL_SERVER_ERROR="Internal Server Error";
	public static final String MAIN_BANNER="mainBanner";
	public static final String GRID_ITEM="gridItem";
	public static final String LIST_ITEMS="listItems";
	public static final String BENEFITS="benefits";
	public static final String CTA="cta";
	public static final String LIST_OBJECT="list";
	public static final String OFFERS="offers";
	public static final String DELIMITER="/";
	public static final String JOURNEY="journey";
	public static final String ITEMS="items";
	public static final String COUNT="count";
	public static final String ID="id";
	public static final String DOCUMENT_TYPE = "documentType";
	public static final String DESCRIPTION = "description";
	public static final String MULTI_CHOICE = "multichoice";
	public static final String TEXT_DOCUMENT="textDocument";
	public static final String VERSION="Version";
	public static final String ACTION = "action";
	public static final String PATH_TO_OFFER_DETAILS = WorkflowConstants.MODELS_URI+"/offer-details";
	public static final String BANNER_CONTENT = "bannersContent";
	public static final String RIBBON_CONTENT = "ribbonContent";
	public static final String SOURCE = "source";
	public static final String CONTENT = "content";
	public static final String FOR_YOU = "forYou";
	public static final String WIDGET_ID= "widget_id";
	public static final String TARGET = "target";
	public static final String AEM = "aem";
	public static final String UNAUTHORIZED="Unauthorized";
	public static final String MODELS_URI="/conf/tcp/settings/dam/cfm/models";
	public static final String CTA_LABEL="ctaLabel";
	public static final String CTA_URL="ctaUrl";
	public static final String CTA_TYPE="ctaType";
	public static final String OFFER_CHANNEL="offerChannel";
	public static final String BRAND_TITLE="brandTitle";
	public static final String OFFER_TYPE="offerType";
	public static final String CONTENT_ID = "contentId";
	public static final String STATUS_CODE="statusCode";
	public static final String STATUS="status";
	public static final String MESSAGE="message";
	public static final String CODE="code";
	public static final String ERROR_MESSAGE="errorMessage";
	public static final String BUSINESS_ERROR="businessError";
	public static final String NOT_FOUND = "Not Found";
	public static final String FAILURE = "Failure";
	public static final String SUCCESS = "Success";
	public static final String REMOVED = "DELETED";
	public static final String RESULT = "result";
	public static final String MODULE = "module";
	public static final String CUSTOM_PARAMS = "customParams";
	public static final String KEY = "key";
	public static final String SAVED_CARDS_TAGS = " [jcr:content/metadata/cq:tags] = 'tcp:savedcards/";
	public static final String IMAGE = "image";
	public static final String IMAGE_LINK = "imageLink";
	public static final String MAP_IMAGE = "mapImage";
	public static final String PLACE_NAME = "placeName";
	public static final String ADDRESS_LABEL = "addressLabel";
	public static final String ADDRESS = "address";
	public static final String PHONE_LABEL = "phoneLabel";
	public static final String PHONE = "phone";
	public static final String LAT = "lat";
	public static final String LNG = "lng";
	public static final String EXPIRY_DATE = "expiryDate";
	public static final String NAME="tagName";
	public static final String VALUES="values";
	public static final String BUNDLES="bundles";
	public static final String BANNER_PATH = "bannerPath";
	public static final String IMAGE_URL = "imageURL";
	public static final String PRODUCT_ID_LIST = "productIdList";
	public static final String MERCHANDISE_HIERARCHY_IDS = "merchandiseHierarchyIds";
	public static final String OFFER_GENERE="offerGenre";	
	public static final String BUNDLE="Bundle";
	public static final String COLLECTED_EXPIRY_DATE = "collectedExpiryDate";
	public static final String TERMS_AND_CONDITIONS = "termsAndConditions";
	public static final String PRODUCT_ID_LIST_ITEMS="productIdList/item";
	public static final String COUPON_TYPE = "couponType";
	public static final String OFFER_PATHS = "offerPaths";
	public static final String SEGMENTS = "segments";
	public static final String IMAGE_SUBTITLE = "imageSubtitle";

	//Offer Engine Payment Information
	public static final String PAYMENT_MODE = "paymentMode";
	public static final String PROVIDER = "provider";
	public static final String PAYMENT_TYPE = "paymentType";
	public static final String PAYMENT_SUBTYPE = "paymentSubType";
	public static final String TAGS_PATH = "/content/cq:tags/tcp/savedcards/";
	public static final String TAGS_NAMESPACE = "tcp:savedcards/";
	public static final String PAYMENT = "payment";
	public static final String PAYMENT_INFORMATION = "paymentInformation";
	
	//Offer Engine Models
	public static final String PROGRAM_ID = "programId";
	public static final String EVENT = "event";
	public static final String ITEM_ID = "itemId";
	public static final String BENEFIT_TYPE = "benefitType";
	public static final String START_DATE = "startDate";
	public static final String END_DATE = "endDate";
	public static final String OFFER_EXPIRING_IN = "offerExpiringIn";
	public static final String SUPPLEMENTARY_DETAILS = "supplementaryDetails";
	public static final String DESKTOP_IMAGE = "desktopImage";
	public static final String DESKTOP_MAP_IMAGE = "desktopMapImage";
	public static final String IS_REMOVE = "isRemove";
	public static final String POOLING_INFO = "poolingInfo";
	public static final String IS_SHARABLE = "isSharable";
	public static final String FILTER = "filter";
	public static final String SHARABILITY_DETAILS = "sharabilityDetails";
	public static final String OFFER_SHARE_TYPE = "offerShareType";
	public static final String OFFER_ID = "offerId";
	public static final String OFFER_IMAGE = "offerImage";
	public static final String ASSET_TYPE = "assetType";
	public static final String CHANNEL_TITLE = "channelTitle";
	public static final String CHANNEL_DESC = "channelDescription";
	public static final String OFFER_NAME = "offerName";
	public static final String IMAGE_TITLE = "imageTitle";
	public static final String POOLING_CONTENT="poolingContent";
	public static final String SHARE_TEXT = "sharetext";
	public static final String KEY_NAME = "name";
	public static final String REDIRECTION_URL="redirectionURL";
	public static final String CONTENT_URL = "contentUrl";
	public static final String CONTENT_TYPE = "contentType";
	public static final String CONTENT_SOURCE = "contentSource";
	public static final String OTHERS = "others";
	public static final String FRAGMENT_URL = "fragmentUrl";
	public static final String OFFER_CATEGORY="offerCategory";
	public static final String OFFER_DISCOUNT_PERCENTAGE="offerdiscountPercentage";

	// PDF Service
	public static final String CREATED = "Created";
	public static final String NOT_CREATED = "Not Created";
	public static final String PDF_CREATION_ERROR_MSG = "Error While creation PDF";
	public static final String PDF_DELETION_ERROR_MSG = "Error While deleting PDF";
	public static final String IS_HOME_INSURANCE = "isHomeInsurance";
	public static final String IS_FRADULENT = "isFradulent";
	public static final String DOCUMENT_URL = "documentURL";
	public static final String POLICY_NO = "policyNo";
	public static final String POLICY_PERIOD_FORM = "policyPeriodFrom";
	public static final String POLICY_PERIOD_TO = "policyPeriodTo";
	public static final String POLICY_HOLDER_FULL_NAME = "policyHolderFullName";
	public static final String CERTIFICATE_NO = "certificateNo";
	public static final String INSURED_FULL_NAME = "insuredFullName";
	public static final String ADDRESS_FOR_COMMUNICATION = "addressForCommunication";
	public static final String ADDRESS_OF_INSURED_PERSON = "addressOfInsuredPerson";
	public static final String TELEPHONE = "telephone";
	public static final String CERTIFICATE_FROM = "certificateFrom";
	public static final String CERTIFICATE_TO = "certificateTo";
	public static final String SUM_INSURED = "sumInsured";
	public static final String AUTHOR = "author";
	public static final String TOTAL_PREMIUM = "totalPremium";
	public static final String GST = "gst";
	public static final String PREMIUM_PAYABLE = "premiumPayable";
	
	// Aggregate Banners
	public static final String FIELD = "field";
	public static final String PAGE = "page";
	public static final String CF_PATH = "cfPath";
	public static final String QUERY = "query";
	public static final String FILTERS = "filters";
	public static final String ATTRIBUTES = "attributes";
	public static final String OFFER_IDS = "offerIds";
	public static final String TAG_BRAND_NAME = "brand_name";
	public static final String TAG_SUB_BRAND_NAME = "sub_brand_name";
	public static final String TAG_CATEGORY_NAME = "category_name";
	public static final String TAG_SUB_CATEGORY_NAME = "sub_category_name";
	public static final String TAG_OFFER_TYPE = "offer_type";
	public static final String TAG_BRAND_NAME_PATH = "/content/cq:tags/tcp/brand-name/";
	public static final String TAG_SUB_BRAND_NAME_PATH = "/content/cq:tags/tcp/brand-name/sub-brand-name/";
	public static final String TAG_CATEGORY_NAME_PATH = "/content/cq:tags/tcp/category-name/";
	public static final String TAG_SUB_CATEGORY_NAME_PATH = "/content/cq:tags/tcp/category-name/sub-category-name/";
	public static final String TAG_OFFER_TYPE_PATH = "/content/cq:tags/tcp/offer-type/";

	//curated Offer
	public static final String TOTAL_RESULTS = "total_results";
	public static final String NUM_OF_PAGES = "num_of_pages";
	public static final String PAGE_INFO = "page_info";
	public static final String REDIRECTION_TYPE = "redirectionType";
	public static final String OFFER_CTA_TYPE = "offer_ctaType";
	public static final String OFFER_DESC = "offer_description";
	public static final String OFFER_IMAGE_URL = "offer_image_url";
	public static final String CATALOG_ITEM_ID = "catalog_item_id";
	public static final String OFFER_TITLE = "offer_title";
	public static final String OFFER_BRAND_TITLE = "offer_brand_title";
	public static final String OFFER_BAND_LOGO = "offer_brand_logo";
	public static final String CURATED_OFFER_TYPE = "offer_type";
	public static final String OFFER_EXPIRY_DATE = "offer_expiry_date";
	public static final String BRAND_LOGO = "brandLogo";
	public static final String TYPE = "type";
	public static final String GROUP_LIST="groupList";
	public static final String PRODUCT_IDS= "productIds";
	
	//Enrollment Benefits
	public static final String HEADING = "heading";
	public static final String TEXT = "text";
	
	//Rest api
	public static final String APPLICATION_JSON="application/json";
	
	//userInterest
	public static final String CONFIGURATION = "configuration";
	public static final String MIN = "minSelection";
	public static final String MAX = "maxSelection";
	
	//RequestHeaders
	//private static final String PROGRAM_ID = "ProgramId";
	public static final String AUTHORIZATION = "Authorization";
	public static final String CLIENT_ID = "client_id";
	public static final String CLIENT_SECRET = "client_secret";
	public static final String CUSTOMER_ID="customerId";
	public static final String XPROGRAMID="X-ProgramID";
	public static final String HEADER_PROGRAMID="ProgramId";
	
	//fs insurance document and product offering
	public static final String LOGO="logo";
	public static final String LABEL="label";
	public static final String BENEFITS_COVERAGE="benefitsCoverage";
	public static final String DOCUMENTS="documents";
	public static final String DOCUMENT_CHECKLIST="document_checklist";
	
	//fs insurance Loan pdf api
	public static final String NAME_OF_THE_GROUP_POLICY_HOLDER = "nameoftheGroupPolicyHolder";
	public static final String NAME_OF_THE_LENDING_INSTITUTION = "nameofLendingInstitution";
	public static final String NAME_OF_THE_INSURED_PERSION = "nameoftheInsuredPerson";
	public static final String MASTER_POLICY_NO = "masterPolicyNo";
	public static final String MOBILE_NO = "mobileNo";
	public static final String EMAIL = "email";
	public static final String POLICY_TENURE = "policyTenure";
	public static final String NAME_OF_THE_CERTIFICATE_HOLDER = "nameoftheCertificateholder";
	public static final String PURCHASE_DATE = "purchaseDate";
	public static final String RELATIONSHIP_WITH_CERTIFICATE_HOLDER = "relationshipWithCertificateHolder";
	public static final String DATE_OF_BIRTH = "dateOfBirth";
	public static final String NOMINEE_NAME = "nomineeName";
	public static final String GROSS_PREMIUM = "grossPremium";
	public static final String AGE = "age";
	public static final String LOAN_ACCOUNT_NO = "loanAccountNumber";
	public static final String EMI_AMMOUNT = "emiAmount";
	public static final String NET_PREMIUM = "netPremium";
	public static final String SUM_INSURED_LABEL = "Sum Insured";
	public static final String COVER_NAME_LABEL = "Cover Name";
	public static final String ACCIDENTAL_DEATH_LABEL = "Accidental Death";
	public static final String PERMANENT_TOTAL_DISABILITY_LABEL = "Permanent Total Disability";
	public static final String IS_LOAN_ACCIDENT = "isLoanAccident";
	public static final String IS_LOAN_COMPREHENSIVE = "isLoanComprehensive";
	
	//content personalisation
	public static final String SUB_TITLE = "subTitle";
	
	//run mode
	public static final String CONTENT_ROOT_SHORTENING = "/content/tcp/en";
	public static final String DAM_ROOT = "/content/dam/tcp";
	public static final String HTML_EXTN = ".html";
	public static final String TCP_PAGE_CONTENT = "/content/tcp/";
	public static final String CTAURL = "ctaURL";
	public static final String ERROR = "error";
	public static final String BACKGROUND_IMAGE_URL = "backgroundImageURL";
}
