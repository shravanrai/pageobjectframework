package com.hldoc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class BOT_HomePage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='https://www.busonlineticket.com/about-us']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "a[title='Adam Express']")
    @CacheLookup
    private WebElement adamExpress;

    @FindBy(id = "ContentPlaceHolder1_txtDepartDate")
    @CacheLookup
    private WebElement addAHotel1;

    @FindBy(id = "ContentPlaceHolder1_txtReturnDate")
    @CacheLookup
    private WebElement addAHotel2;

    @FindBy(id = "ContentPlaceHolder1_qty")
    @CacheLookup
    private WebElement addAHotel3;

    @FindBy(id = "txtOrigin")
    @CacheLookup
    private WebElement addAHotel4;

    @FindBy(id = "txtDestination")
    @CacheLookup
    private WebElement addAHotel5;

    @FindBy(id = "cbAddSearchHotel")
    @CacheLookup
    private WebElement addAHotel6;

    @FindBy(css = "a[title='Adik Beradik Express']")
    @CacheLookup
    private WebElement adikBeradikExpress;

    @FindBy(css = "a[title='Aerobus']")
    @CacheLookup
    private WebElement aerobus;

    @FindBy(css = "a[href='https://www.busonlineticket.com/busonlineticket-affiliates-program']")
    @CacheLookup
    private WebElement affiliateProgram;

    @FindBy(css = "a[href='https://www.busonlineticket.com/booking/agent-registration.aspx']")
    @CacheLookup
    private WebElement agentRegistration;

    @FindBy(css = "a[title='Airport Coach']")
    @CacheLookup
    private WebElement airportCoach;

    @FindBy(css = "#menu-item-10915 a")
    @CacheLookup
    private WebElement airportTransfer1;

    @FindBy(css = "#main-footer div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) ul:nth-of-type(1) li:nth-of-type(5) a")
    @CacheLookup
    private WebElement airportTransfer2;

    @FindBy(css = "a[title='Al Ameen Boat Service']")
    @CacheLookup
    private WebElement alAmeenBoatService;

    @FindBy(css = "a[href='https://www.busonlineticket.com/alipay-payment-guide']")
    @CacheLookup
    private WebElement alipayPaymentGuide;

    @FindBy(css = "a[title='Alisan Golden Coach ']")
    @CacheLookup
    private WebElement alisanGoldenCoach;

    @FindBy(css = "a[title='Alya Express']")
    @CacheLookup
    private WebElement alyaExpress;

    @FindBy(css = "a[title='Antar Holiday']")
    @CacheLookup
    private WebElement antarHoliday;

    @FindBy(css = "a[title='Arwana Express']")
    @CacheLookup
    private WebElement arwanaExpress;

    @FindBy(css = "a[href='https://www.busonlineticket.com/axs-payment-guide']")
    @CacheLookup
    private WebElement axsPaymentGuide;

    @FindBy(css = "a[title='AYU EXPRESS']")
    @CacheLookup
    private WebElement ayuExpress;

    @FindBy(css = "a[title='AZ LINER']")
    @CacheLookup
    private WebElement azLiner;

    @FindBy(css = "#main-header div:nth-of-type(2) div.container div.row div:nth-of-type(2) div:nth-of-type(1) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement bahasaMalaysia;

    @FindBy(css = "a[title='Batam Fast Ferry Pte Ltd']")
    @CacheLookup
    private WebElement batamFastFerryPteLtd;

    @FindBy(css = "a[title='Beh Travel & Tours Sdn Bhd']")
    @CacheLookup
    private WebElement behTravelToursSdnBhd;

    @FindBy(css = "a[title='Biaramas Express']")
    @CacheLookup
    private WebElement biaramasExpress;

    @FindBy(css = "a[title='Billion Stars']")
    @CacheLookup
    private WebElement billionStars;

    @FindBy(css = "a[title='Bintan Resort Ferry']")
    @CacheLookup
    private WebElement bintanResortFerry;

    @FindBy(css = "a[title='Bintang Jaya Express']")
    @CacheLookup
    private WebElement bintangJayaExpress;

    @FindBy(id = "btnBusSearchNew")
    @CacheLookup
    private WebElement bookNow;

    @FindBy(css = "a[href='https://www.busonlineticket.com/faq']")
    @CacheLookup
    private WebElement bookingFaq;

    @FindBy(css = "a[title='Bundhaya Speed Boat']")
    @CacheLookup
    private WebElement bundhayaSpeedBoat;

    @FindBy(css = "a[href='https://www.busonlineticket.com/bus-chartering-service']")
    @CacheLookup
    private WebElement busCharter;

    @FindBy(css = "#menu-item-10914 a")
    @CacheLookup
    private WebElement busHotel1;

    @FindBy(css = "#main-footer div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) ul:nth-of-type(1) li:nth-of-type(2) a")
    @CacheLookup
    private WebElement busHotel2;

    @FindBy(css = "#menu-item-24683 a")
    @CacheLookup
    private WebElement busOperator;

    @FindBy(css = "a[title='Bus Operators on BusOnlineticket.com']")
    @CacheLookup
    private WebElement busOperators1;

    @FindBy(css = "#main-footer div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(1) ul.widget-list li:nth-of-type(3) a")
    @CacheLookup
    private WebElement busOperators2;

    @FindBy(css = "a[href='https://www.busonlineticket.com/bus-route']")
    @CacheLookup
    private WebElement busRoute;

    @FindBy(css = "a[href='https://www.busonlineticket.com/bus-terminal']")
    @CacheLookup
    private WebElement busTerminal;

    @FindBy(css = "#menu-item-10909 a")
    @CacheLookup
    private WebElement busTickets1;

    @FindBy(css = "#main-footer div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) ul:nth-of-type(1) li:nth-of-type(1) a")
    @CacheLookup
    private WebElement busTickets2;

    @FindBy(css = "#main-header div:nth-of-type(2) div.container div.row div:nth-of-type(1) div.hidden-lg.hidden-md.hidden-sm.text-center a:nth-of-type(1)")
    @CacheLookup
    private WebElement busonlineticketCom1;

    @FindBy(css = "#main-footer div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement busonlineticketCom2;

    @FindBy(css = "a[title='C.S Travel & Tours']")
    @CacheLookup
    private WebElement cSTravelTours;

    @FindBy(css = "a[title='Causeway Link Express']")
    @CacheLookup
    private WebElement causewayLinkExpress;

    @FindBy(css = "a[title='Cepat Express']")
    @CacheLookup
    private WebElement cepatExpress;

    @FindBy(css = "#liNonMember3 a")
    @CacheLookup
    private WebElement checkMyBooking;

    @FindBy(css = "a[title='Citra Indomas']")
    @CacheLookup
    private WebElement citraIndomas;

    @FindBy(css = "a[title='City Holidays Express']")
    @CacheLookup
    private WebElement cityHolidaysExpress;

    @FindBy(css = "a[title='99 Coachland Express']")
    @CacheLookup
    private WebElement coachlandExpress99;

    @FindBy(css = "a[href='https://www.busonlineticket.com/contact-us']")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "a[title='Cosmic Express']")
    @CacheLookup
    private WebElement cosmicExpress;

    @FindBy(css = "a[title='D Amour Enterprise']")
    @CacheLookup
    private WebElement dAmourEnterprise;

    @FindBy(css = "a[title='Darul Iman Express']")
    @CacheLookup
    private WebElement darulImanExpress;

    @FindBy(css = "a[href='https://www.busonlineticket.com/dbs-paylah-payment-guide']")
    @CacheLookup
    private WebElement dbsPaylahGuide;

    @FindBy(css = "a[title='Delima Express (MY)']")
    @CacheLookup
    private WebElement delimaExpressMy;

    @FindBy(css = "a[href='https://www.busonlineticket.com/destinations']")
    @CacheLookup
    private WebElement destinations;

    @FindBy(css = "a[title='Discovery Tours']")
    @CacheLookup
    private WebElement discoveryTours;

    @FindBy(css = "a[title='Economy Express']")
    @CacheLookup
    private WebElement economyExpress;

    @FindBy(css = "a[title='Edaran Express']")
    @CacheLookup
    private WebElement edaranExpress;

    @FindBy(css = "a[title='Ekspres Musafir']")
    @CacheLookup
    private WebElement ekspresMusafir;

    @FindBy(css = "a[title='Eltabina Jaya Express']")
    @CacheLookup
    private WebElement eltabinaJayaExpress;

    @FindBy(css = "a[title='E-Mutiara']")
    @CacheLookup
    private WebElement emutiara;

    @FindBy(css = "#main-header div:nth-of-type(1) div.container div:nth-of-type(1) ul.list-inline li:nth-of-type(1) a")
    @CacheLookup
    private WebElement eng;

    @FindBy(css = "#main-header div:nth-of-type(2) div.container div.row div:nth-of-type(2) div:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement english;

    @FindBy(css = "a[title='Etika Express']")
    @CacheLookup
    private WebElement etikaExpress;

    @FindBy(css = "a[href='https://www.busonlineticket.com/ferry-route']")
    @CacheLookup
    private WebElement ferryRoute;

    @FindBy(css = "#menu-item-10911 a")
    @CacheLookup
    private WebElement ferryTickets1;

    @FindBy(css = "#main-footer div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) ul:nth-of-type(1) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement ferryTickets2;

    @FindBy(css = "a[title='First Coach']")
    @CacheLookup
    private WebElement firstCoach;

    @FindBy(css = "a[title='GJG Express ']")
    @CacheLookup
    private WebElement gjgExpress;

    @FindBy(css = "a[title='Golden Coach Express']")
    @CacheLookup
    private WebElement goldenCoachExpress;

    @FindBy(css = "a[title='Han Travel ']")
    @CacheLookup
    private WebElement hanTravel;

    @FindBy(css = "#menu-item-12 a")
    @CacheLookup
    private WebElement home1;

    @FindBy(css = "#breadcrumbs span span a")
    @CacheLookup
    private WebElement home2;

    @FindBy(css = "#main-footer div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(1) ul.widget-list li:nth-of-type(1) a")
    @CacheLookup
    private WebElement home3;

    @FindBy(css = "#menu-item-10913 a")
    @CacheLookup
    private WebElement hotels1;

    @FindBy(css = "#main-footer div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) ul:nth-of-type(1) li:nth-of-type(8) a")
    @CacheLookup
    private WebElement hotels2;

    @FindBy(css = "a[href='https://www.busonlineticket.com/how-to-book']")
    @CacheLookup
    private WebElement howToBook;

    @FindBy(css = "a[title='IGS Ferry']")
    @CacheLookup
    private WebElement igsFerry;

    @FindBy(css = "a[title='707 Inc']")
    @CacheLookup
    private WebElement inc707;

    @FindBy(css = "a[title='Inter Top Express']")
    @CacheLookup
    private WebElement interTopExpress;

    @FindBy(css = "a[title='Intercity Coach']")
    @CacheLookup
    private WebElement intercityCoach;

    @FindBy(css = "a[title='Jadam Express']")
    @CacheLookup
    private WebElement jadamExpress;

    @FindBy(css = "a[title='Jasa Pelangi Ekspres']")
    @CacheLookup
    private WebElement jasaPelangiEkspres;

    @FindBy(css = "a[title='Jasmine Express']")
    @CacheLookup
    private WebElement jasmineExpress;

    @FindBy(css = "a[title='JB Transliner']")
    @CacheLookup
    private WebElement jbTransliner;

    @FindBy(css = "a[title='Jengka Liner']")
    @CacheLookup
    private WebElement jengkaLiner;

    @FindBy(css = "a[title='Jet Bus']")
    @CacheLookup
    private WebElement jetBus;

    @FindBy(css = "a[title='Joo Seng Travel']")
    @CacheLookup
    private WebElement jooSengTravel;

    @FindBy(css = "a[title='Kejora Express']")
    @CacheLookup
    private WebElement kejoraExpress;

    @FindBy(css = "a[title='Kesatuan Express']")
    @CacheLookup
    private WebElement kesatuanExpress;

    @FindBy(css = "a[title='KKKL Express (Terus Nanti)']")
    @CacheLookup
    private WebElement kkklExpressTerusNanti;

    @FindBy(css = "a[title='KKKL Travel & Tours Pte Ltd']")
    @CacheLookup
    private WebElement kkklTravelToursPteLtd;

    @FindBy(css = "a[title='Konsortium Express']")
    @CacheLookup
    private WebElement konsortiumExpress;

    @FindBy(css = "a[title='KPB Express']")
    @CacheLookup
    private WebElement kpbExpress;

    @FindBy(css = "a[title='KPB Seremban Enterprise']")
    @CacheLookup
    private WebElement kpbSerembanEnterprise;

    @FindBy(css = "a[title='Kulim First Travel']")
    @CacheLookup
    private WebElement kulimFirstTravel;

    @FindBy(css = "a[title='Kwok Ping Express  JB']")
    @CacheLookup
    private WebElement kwokPingExpressJb;

    @FindBy(css = "a[title='LA Holidays']")
    @CacheLookup
    private WebElement laHolidays;

    @FindBy(css = "a[title='Lapan Lapan Travel']")
    @CacheLookup
    private WebElement lapanLapanTravel;

    @FindBy(css = "a[href='https://www.busonlineticket.com/promotions']")
    @CacheLookup
    private WebElement latestPromotion;

    @FindBy(css = "a[title='Lienadia Express']")
    @CacheLookup
    private WebElement lienadiaExpress;

    @FindBy(css = "a[title='Limbongan Maju ']")
    @CacheLookup
    private WebElement limbonganMaju;

    @FindBy(css = "#liNonMember1 a")
    @CacheLookup
    private WebElement logIn;

    @FindBy(css = "#menu-item-24681 a")
    @CacheLookup
    private WebElement login;

    @FindBy(css = "#menu-item-24682 a")
    @CacheLookup
    private WebElement loyaltyProgram1;

    @FindBy(css = "#main-footer div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(1) ul.widget-list li:nth-of-type(9) a")
    @CacheLookup
    private WebElement loyaltyProgram2;

    @FindBy(css = "a[title='LPMS Express']")
    @CacheLookup
    private WebElement lpmsExpress;

    @FindBy(css = "a[title='Luxury Coach ']")
    @CacheLookup
    private WebElement luxuryCoach;

    @FindBy(css = "a[title='Maharani Express']")
    @CacheLookup
    private WebElement maharaniExpress;

    @FindBy(css = "a[title='Majestic Fast Ferry Pte Ltd']")
    @CacheLookup
    private WebElement majesticFastFerryPteLtd;

    @FindBy(css = "a[title='Maju Express']")
    @CacheLookup
    private WebElement majuExpress;

    @FindBy(css = "a[href='https://www.busonlineticket.com/manage-my-booking']")
    @CacheLookup
    private WebElement manageMyBooking;

    @FindBy(css = "a[title='Manis Liner Express']")
    @CacheLookup
    private WebElement manisLinerExpress;

    @FindBy(css = "a[title='Maraliner']")
    @CacheLookup
    private WebElement maraliner;

    @FindBy(css = "a[title='Mayang Sari Express']")
    @CacheLookup
    private WebElement mayangSariExpress;

    @FindBy(css = "a[title='Melor Interline Express']")
    @CacheLookup
    private WebElement melorInterlineExpress;

    @FindBy(css = "a[title='Meridian Holidays']")
    @CacheLookup
    private WebElement meridianHolidays;

    @FindBy(css = "#main-header div:nth-of-type(1) div.container div:nth-of-type(1) ul.list-inline li:nth-of-type(2) a")
    @CacheLookup
    private WebElement mly;

    @FindBy(css = "a[title='Naik Selalu Express']")
    @CacheLookup
    private WebElement naikSelaluExpress;

    @FindBy(css = "a[title='Neoliner Express']")
    @CacheLookup
    private WebElement neolinerExpress;

    @FindBy(css = "a[title='New Asian Travel']")
    @CacheLookup
    private WebElement newAsianTravel;

    @FindBy(css = "a[title='NKS Hotel and Travel ']")
    @CacheLookup
    private WebElement nksHotelAndTravel;

    @FindBy(css = "a[href='https://www.busonlineticket.com/plus-user-guide']")
    @CacheLookup
    private WebElement ntucPlusGuide;

    @FindBy(name = "ctl00$ContentPlaceHolder1$way")
    @CacheLookup
    private List<WebElement> oneWay;

    private final String oneWayValue = "radOneWay";

    @FindBy(css = "a[title='Orkid Malaysia Express']")
    @CacheLookup
    private WebElement orkidMalaysiaExpress;

    private final String pageLoadedText = "You only need to select your origin, destinations, number of pax and departure date and we will provide you with the list of available trips for booking";

    private final String pageUrl = "/booking/bus-tickets.aspx";

    @FindBy(css = "a[title='Pahang Lin Siong']")
    @CacheLookup
    private WebElement pahangLinSiong;

    @FindBy(css = "a[title='Pasir Gudang Ferry']")
    @CacheLookup
    private WebElement pasirGudangFerry;

    @FindBy(css = "a[href='https://www.busonlineticket.com/paypal-guide']")
    @CacheLookup
    private WebElement paypalPaymentGuide;

    @FindBy(css = "a[title='Perak Transit']")
    @CacheLookup
    private WebElement perakTransit;

    @FindBy(css = "a[title='Perdana Express']")
    @CacheLookup
    private WebElement perdanaExpress;

    @FindBy(css = "a[title='Perhentian Trans Holiday']")
    @CacheLookup
    private WebElement perhentianTransHoliday;

    @FindBy(css = "a[title='Persada Travel and Tours']")
    @CacheLookup
    private WebElement persadaTravelAndTours;

    @FindBy(css = "a[title='Plusliner']")
    @CacheLookup
    private WebElement plusliner;

    @FindBy(css = "#content div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(3) div:nth-of-type(2) div.list-group a:nth-of-type(1)")
    @CacheLookup
    private WebElement popularBusTicketsFromMalaysia;

    @FindBy(css = "#content div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(3) div:nth-of-type(1) div.list-group a:nth-of-type(1)")
    @CacheLookup
    private WebElement popularBusTicketsFromSingapore;

    @FindBy(css = "a[title='Prisma Express']")
    @CacheLookup
    private WebElement prismaExpress;

    @FindBy(css = "a[href='https://www.busonlineticket.com/privacy-policy']")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "a[title='Queen Express']")
    @CacheLookup
    private WebElement queenExpress;

    @FindBy(css = "a[title='Quick Liner Express']")
    @CacheLookup
    private WebElement quickLinerExpress;


    private final String returnValue = "radRoundTrip";

    @FindBy(css = "a[title='Kuala Lumpur-Malacca']")
    @CacheLookup
    private WebElement rm1000busFromKlToMalacca;

    @FindBy(css = "a[title='Kuala Lumpur-Johor Bahru']")
    @CacheLookup
    private WebElement rm2000busFromKlToJohor;

    @FindBy(css = "a[title='Kuala Lumpur-Batu Pahat']")
    @CacheLookup
    private WebElement rm2200busFromKlToBatu;

    @FindBy(css = "a[title='Kuala Lumpur-Kuantan']")
    @CacheLookup
    private WebElement rm2300busFromKlToKuantan;

    @FindBy(css = "a[title='Kuala Lumpur-Butterworth']")
    @CacheLookup
    private WebElement rm2800busFromKlToButterworth;

    @FindBy(css = "a[title='Kuala Lumpur-Penang']")
    @CacheLookup
    private WebElement rm3300busFromKlToPenang;

    @FindBy(css = "a[title='Kuala Lumpur-Cameron Highlands']")
    @CacheLookup
    private WebElement rm3500busFromKlToCameron;

    @FindBy(css = "a[title='Kuala Lumpur-Mersing']")
    @CacheLookup
    private WebElement rm3830busFromKlToMersing;

    @FindBy(css = "a[title='Bus from Singapore to Legoland']")
    @CacheLookup
    private WebElement s1100busFromSingaporeToLegoland;

    @FindBy(css = "a[title='Bus from Singapore to Malacca']")
    @CacheLookup
    private WebElement s1300busFromSingaporeToMalacca;

    @FindBy(css = "a[title='Bus from Singapore to KL']")
    @CacheLookup
    private WebElement s1800busFromSingaporeToKl;

    @FindBy(css = "a[title='Kuala Lumpur-Singapore']")
    @CacheLookup
    private WebElement s2000busFromKlToSingapore;

    @FindBy(css = "a[title='Bus from Singapore to One Utama']")
    @CacheLookup
    private WebElement s2500busFromSingaporeToOne;

    @FindBy(css = "a[title='Bus from Singapore to Genting Highlands']")
    @CacheLookup
    private WebElement s3000busFromSingaporeToGenting;

    @FindBy(css = "a[title='Bus from Singapore to Ipoh']")
    @CacheLookup
    private WebElement s3000busFromSingaporeToIpoh;

    @FindBy(css = "a[title='Bus from Singapore to Mersing']")
    @CacheLookup
    private WebElement s3300busFromSingaporeToMersing;

    @FindBy(css = "a[title='Bus from Singapore to Port Dickson']")
    @CacheLookup
    private WebElement s3500busFromSingaporeToPort;

    @FindBy(css = "a[title='Bus from Singapore to Cameron Highlands']")
    @CacheLookup
    private WebElement s4000busFromSingaporeToCameron;

    @FindBy(css = "#main-header div:nth-of-type(1) div.container div:nth-of-type(2) div.pull-right ul.list-inline li:nth-of-type(3) a")
    @CacheLookup
    private WebElement salesbusonlineticketCom;

    @FindBy(css = "a[title='Sani Express']")
    @CacheLookup
    private WebElement saniExpress;

    @FindBy(css = "a[title='Sanwa Tours (M) Sdn Bhd']")
    @CacheLookup
    private WebElement sanwaToursMSdnBhd;

    @FindBy(css = "a[title='SE Super Express']")
    @CacheLookup
    private WebElement seSuperExpress;

    @FindBy(css = "a[title='Seasons Express']")
    @CacheLookup
    private WebElement seasonsExpress;

    @FindBy(css = "a[title='Sepakat Liner Express']")
    @CacheLookup
    private WebElement sepakatLinerExpress;

    @FindBy(css = "a[title='Shanhua Travel and Tours Sdn Bhd']")
    @CacheLookup
    private WebElement shanhuaTravelAndToursSdnBhd;

    @FindBy(css = "a[href='https://www.busonlineticket.com/booking/sign_up.aspx']")
    @CacheLookup
    private WebElement signUp;

    @FindBy(css = "a[title='Sin Yong Express']")
    @CacheLookup
    private WebElement sinYongExpress;

    @FindBy(css = "a[title='Sipitang Express ']")
    @CacheLookup
    private WebElement sipitangExpress;

    @FindBy(css = "#main-footer div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(1) ul.widget-list li:nth-of-type(15) a")
    @CacheLookup
    private WebElement sitemap1;

    @FindBy(css = "#main-footer div:nth-of-type(2) div.hidden-lg.hidden-md.hidden-sm a:nth-of-type(2)")
    @CacheLookup
    private WebElement sitemap2;

    @FindBy(css = "a[title='Sri Maju Express (Kangar)']")
    @CacheLookup
    private WebElement sriMajuExpressKangar;

    @FindBy(css = "a[title='Sri Theven Travel & Tours Sdn Bhd']")
    @CacheLookup
    private WebElement sriThevenTravelToursSdn;

    @FindBy(css = "a[title='S&S International']")
    @CacheLookup
    private WebElement ssInternational;

    @FindBy(css = "a[title='Star Coach Express ']")
    @CacheLookup
    private WebElement starCoachExpress;

    @FindBy(css = "a[title='Star Shuttle Express']")
    @CacheLookup
    private WebElement starShuttleExpress;

    @FindBy(css = "a[title='Starmart Express']")
    @CacheLookup
    private WebElement starmartExpress;

    @FindBy(css = "a[title='Suasana Holiday Express']")
    @CacheLookup
    private WebElement suasanaHolidayExpress;

    @FindBy(css = "a[title='Suasana Tony Coach']")
    @CacheLookup
    private WebElement suasanaTonyCoach;

    @FindBy(css = "a[title='Super Coach Holiday']")
    @CacheLookup
    private WebElement superCoachHoliday;

    @FindBy(css = "a[title='Super Fast Ferry']")
    @CacheLookup
    private WebElement superFastFerry;

    @FindBy(css = "a[title='Super Nice Express (Grassland)']")
    @CacheLookup
    private WebElement superNiceExpressGrassland;

    @FindBy(css = "a[title='Superior Tour']")
    @CacheLookup
    private WebElement superiorTour;

    @FindBy(css = "a[title='Supernice Grassland']")
    @CacheLookup
    private WebElement superniceGrassland;

    @FindBy(css = "a[title='Swiftliner Express Sdn Bhd (Arwana Express)']")
    @CacheLookup
    private WebElement swiftlinerExpressSdnBhdArwanaExpress;

    @FindBy(css = "a[title='Telaga Terminal ']")
    @CacheLookup
    private WebElement telagaTerminal;

    @FindBy(css = "#main-footer div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) ul:nth-of-type(2) li a")
    @CacheLookup
    private WebElement thailandBookingSite1;

    @FindBy(css = "#main-footer div:nth-of-type(2) div.hidden-lg.hidden-md.hidden-sm a:nth-of-type(3)")
    @CacheLookup
    private WebElement thailandBookingSite2;

    @FindBy(css = "a[title='The One Travel']")
    @CacheLookup
    private WebElement theOneTravel;

    @FindBy(css = "#main-footer div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) ul:nth-of-type(1) li:nth-of-type(6) a")
    @CacheLookup
    private WebElement tourPackages;

    @FindBy(css = "#menu-item-10912 a")
    @CacheLookup
    private WebElement tours;

    @FindBy(css = "a[href='https://www.busonlineticket.com/train-route']")
    @CacheLookup
    private WebElement trainRoute;

    @FindBy(css = "#menu-item-10910 a")
    @CacheLookup
    private WebElement trainTickets1;

    @FindBy(css = "#main-footer div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) ul:nth-of-type(1) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement trainTickets2;

    @FindBy(css = "a[title='Trans MVS Express']")
    @CacheLookup
    private WebElement transMvsExpress;

    @FindBy(css = "a[title='Transnasional']")
    @CacheLookup
    private WebElement transnasional;

    @FindBy(css = "a[title='Transtar Travel']")
    @CacheLookup
    private WebElement transtarTravel;

    @FindBy(css = "a[title='Travel Forte (CTTS Holiday)']")
    @CacheLookup
    private WebElement travelForteCttsHoliday;

    @FindBy(css = "a[href='https://www.busonlineticket.com/travel-tips']")
    @CacheLookup
    private WebElement travelTips;

    @FindBy(css = "a[href='https://www.busonlineticket.com/trip-duration']")
    @CacheLookup
    private WebElement tripDuration;

    @FindBy(css = "a[title='Unititi Express']")
    @CacheLookup
    private WebElement unititiExpress;

    @FindBy(css = "a[title='Urban Bus']")
    @CacheLookup
    private WebElement urbanBus;

    @FindBy(css = "a[title='Utama Express']")
    @CacheLookup
    private WebElement utamaExpress;

    @FindBy(css = "a[title='Vigourmarine Boat Services']")
    @CacheLookup
    private WebElement vigourmarineBoatServices;

    @FindBy(css = "a[title='WTS Travel & Tours']")
    @CacheLookup
    private WebElement wtsTravelTours;

    @FindBy(css = "a[title='YoYo Express']")
    @CacheLookup
    private WebElement yoyoExpress;

    public BOT_HomePage() {
    }

    public BOT_HomePage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public BOT_HomePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public BOT_HomePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Adam Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAdamExpressLink() {
        adamExpress.click();
        return this;
    }

    /**
     * Click on Adik Beradik Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAdikBeradikExpressLink() {
        adikBeradikExpress.click();
        return this;
    }

    /**
     * Click on Aerobus Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAerobusLink() {
        aerobus.click();
        return this;
    }

    /**
     * Click on Affiliate Program Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAffiliateProgramLink() {
        affiliateProgram.click();
        return this;
    }

    /**
     * Click on Agent Registration Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAgentRegistrationLink() {
        agentRegistration.click();
        return this;
    }

    /**
     * Click on Airport Coach Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAirportCoachLink() {
        airportCoach.click();
        return this;
    }

    /**
     * Click on Airport Transfer Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAirportTransfer1Link() {
        airportTransfer1.click();
        return this;
    }

    /**
     * Click on Airport Transfer Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAirportTransfer2Link() {
        airportTransfer2.click();
        return this;
    }

    /**
     * Click on Al Ameen Boat Service Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAlAmeenBoatServiceLink() {
        alAmeenBoatService.click();
        return this;
    }

    /**
     * Click on Alipay Payment Guide Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAlipayPaymentGuideLink() {
        alipayPaymentGuide.click();
        return this;
    }

    /**
     * Click on Alisan Golden Coach Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAlisanGoldenCoachLink() {
        alisanGoldenCoach.click();
        return this;
    }

    /**
     * Click on Alya Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAlyaExpressLink() {
        alyaExpress.click();
        return this;
    }

    /**
     * Click on Antar Holiday Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAntarHolidayLink() {
        antarHoliday.click();
        return this;
    }

    /**
     * Click on Arwana Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickArwanaExpressLink() {
        arwanaExpress.click();
        return this;
    }

    /**
     * Click on Axs Payment Guide Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAxsPaymentGuideLink() {
        axsPaymentGuide.click();
        return this;
    }

    /**
     * Click on Ayu Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAyuExpressLink() {
        ayuExpress.click();
        return this;
    }

    /**
     * Click on Az Liner Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickAzLinerLink() {
        azLiner.click();
        return this;
    }

    /**
     * Click on Bahasa Malaysia Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBahasaMalaysiaLink() {
        bahasaMalaysia.click();
        return this;
    }

    /**
     * Click on Batam Fast Ferry Pte Ltd Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBatamFastFerryPteLtdLink() {
        batamFastFerryPteLtd.click();
        return this;
    }

    /**
     * Click on Beh Travel Tours Sdn Bhd Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBehTravelToursSdnBhdLink() {
        behTravelToursSdnBhd.click();
        return this;
    }

    /**
     * Click on Biaramas Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBiaramasExpressLink() {
        biaramasExpress.click();
        return this;
    }

    /**
     * Click on Billion Stars Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBillionStarsLink() {
        billionStars.click();
        return this;
    }

    /**
     * Click on Bintan Resort Ferry Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBintanResortFerryLink() {
        bintanResortFerry.click();
        return this;
    }

    /**
     * Click on Bintang Jaya Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBintangJayaExpressLink() {
        bintangJayaExpress.click();
        return this;
    }

    /**
     * Click on Book Now Button.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBookNowButton() {
        bookNow.click();
        return this;
    }

    /**
     * Click on Booking Faq Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBookingFaqLink() {
        bookingFaq.click();
        return this;
    }

    /**
     * Click on Bundhaya Speed Boat Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBundhayaSpeedBoatLink() {
        bundhayaSpeedBoat.click();
        return this;
    }

    /**
     * Click on Bus Charter Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBusCharterLink() {
        busCharter.click();
        return this;
    }

    /**
     * Click on Bus Hotel Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBusHotel1Link() {
        busHotel1.click();
        return this;
    }

    /**
     * Click on Bus Hotel Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBusHotel2Link() {
        busHotel2.click();
        return this;
    }

    /**
     * Click on Bus Operator Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBusOperatorLink() {
        busOperator.click();
        return this;
    }

    /**
     * Click on Bus Operators Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBusOperators1Link() {
        busOperators1.click();
        return this;
    }

    /**
     * Click on Bus Operators Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBusOperators2Link() {
        busOperators2.click();
        return this;
    }

    /**
     * Click on Bus Route Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBusRouteLink() {
        busRoute.click();
        return this;
    }

    /**
     * Click on Bus Terminal Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBusTerminalLink() {
        busTerminal.click();
        return this;
    }

    /**
     * Click on Bus Tickets Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBusTickets1Link() {
        busTickets1.click();
        return this;
    }

    /**
     * Click on Bus Tickets Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBusTickets2Link() {
        busTickets2.click();
        return this;
    }

    /**
     * Click on Busonlineticket.com Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBusonlineticketCom1Link() {
        busonlineticketCom1.click();
        return this;
    }

    /**
     * Click on Busonlineticket.com Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickBusonlineticketCom2Link() {
        busonlineticketCom2.click();
        return this;
    }

    /**
     * Click on C.s Travel Tours Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickCSTravelToursLink() {
        cSTravelTours.click();
        return this;
    }

    /**
     * Click on Causeway Link Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickCausewayLinkExpressLink() {
        causewayLinkExpress.click();
        return this;
    }

    /**
     * Click on Cepat Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickCepatExpressLink() {
        cepatExpress.click();
        return this;
    }

    /**
     * Click on Citra Indomas Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickCitraIndomasLink() {
        citraIndomas.click();
        return this;
    }

    /**
     * Click on City Holidays Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickCityHolidaysExpressLink() {
        cityHolidaysExpress.click();
        return this;
    }

    /**
     * Click on 99 Coachland Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickCoachlandExpressLink99() {
        coachlandExpress99.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Cosmic Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickCosmicExpressLink() {
        cosmicExpress.click();
        return this;
    }

    /**
     * Click on D Amour Enterprise Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickDAmourEnterpriseLink() {
        dAmourEnterprise.click();
        return this;
    }

    /**
     * Click on Darul Iman Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickDarulImanExpressLink() {
        darulImanExpress.click();
        return this;
    }

    /**
     * Click on Dbs Paylah Guide Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickDbsPaylahGuideLink() {
        dbsPaylahGuide.click();
        return this;
    }

    /**
     * Click on Delima Express My Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickDelimaExpressMyLink() {
        delimaExpressMy.click();
        return this;
    }

    /**
     * Click on Destinations Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickDestinationsLink() {
        destinations.click();
        return this;
    }

    /**
     * Click on Discovery Tours Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickDiscoveryToursLink() {
        discoveryTours.click();
        return this;
    }

    /**
     * Click on Economy Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickEconomyExpressLink() {
        economyExpress.click();
        return this;
    }

    /**
     * Click on Edaran Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickEdaranExpressLink() {
        edaranExpress.click();
        return this;
    }

    /**
     * Click on Ekspres Musafir Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickEkspresMusafirLink() {
        ekspresMusafir.click();
        return this;
    }

    /**
     * Click on Eltabina Jaya Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickEltabinaJayaExpressLink() {
        eltabinaJayaExpress.click();
        return this;
    }

    /**
     * Click on Emutiara Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickEmutiaraLink() {
        emutiara.click();
        return this;
    }

    /**
     * Click on Eng Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickEngLink() {
        eng.click();
        return this;
    }

    /**
     * Click on English Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickEnglishLink() {
        english.click();
        return this;
    }

    /**
     * Click on Etika Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickEtikaExpressLink() {
        etikaExpress.click();
        return this;
    }

    /**
     * Click on Ferry Route Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickFerryRouteLink() {
        ferryRoute.click();
        return this;
    }

    /**
     * Click on Ferry Tickets Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickFerryTickets1Link() {
        ferryTickets1.click();
        return this;
    }

    /**
     * Click on Ferry Tickets Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickFerryTickets2Link() {
        ferryTickets2.click();
        return this;
    }

    /**
     * Click on First Coach Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickFirstCoachLink() {
        firstCoach.click();
        return this;
    }

    /**
     * Click on Gjg Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickGjgExpressLink() {
        gjgExpress.click();
        return this;
    }

    /**
     * Click on Golden Coach Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickGoldenCoachExpressLink() {
        goldenCoachExpress.click();
        return this;
    }

    /**
     * Click on Han Travel Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickHanTravelLink() {
        hanTravel.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickHome1Link() {
        home1.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickHome2Link() {
        home2.click();
        return this;
    }

    /**
     * Click on Home Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickHome3Link() {
        home3.click();
        return this;
    }

    /**
     * Click on Hotels Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickHotels1Link() {
        hotels1.click();
        return this;
    }

    /**
     * Click on Hotels Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickHotels2Link() {
        hotels2.click();
        return this;
    }

    /**
     * Click on How To Book Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickHowToBookLink() {
        howToBook.click();
        return this;
    }

    /**
     * Click on Igs Ferry Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickIgsFerryLink() {
        igsFerry.click();
        return this;
    }

    /**
     * Click on 707 Inc Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickIncLink707() {
        inc707.click();
        return this;
    }

    /**
     * Click on Inter Top Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickInterTopExpressLink() {
        interTopExpress.click();
        return this;
    }

    /**
     * Click on Intercity Coach Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickIntercityCoachLink() {
        intercityCoach.click();
        return this;
    }

    /**
     * Click on Jadam Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickJadamExpressLink() {
        jadamExpress.click();
        return this;
    }

    /**
     * Click on Jasa Pelangi Ekspres Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickJasaPelangiEkspresLink() {
        jasaPelangiEkspres.click();
        return this;
    }

    /**
     * Click on Jasmine Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickJasmineExpressLink() {
        jasmineExpress.click();
        return this;
    }

    /**
     * Click on Jb Transliner Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickJbTranslinerLink() {
        jbTransliner.click();
        return this;
    }

    /**
     * Click on Jengka Liner Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickJengkaLinerLink() {
        jengkaLiner.click();
        return this;
    }

    /**
     * Click on Jet Bus Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickJetBusLink() {
        jetBus.click();
        return this;
    }

    /**
     * Click on Joo Seng Travel Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickJooSengTravelLink() {
        jooSengTravel.click();
        return this;
    }

    /**
     * Click on Kejora Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickKejoraExpressLink() {
        kejoraExpress.click();
        return this;
    }

    /**
     * Click on Kesatuan Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickKesatuanExpressLink() {
        kesatuanExpress.click();
        return this;
    }

    /**
     * Click on Kkkl Express Terus Nanti Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickKkklExpressTerusNantiLink() {
        kkklExpressTerusNanti.click();
        return this;
    }

    /**
     * Click on Kkkl Travel Tours Pte Ltd Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickKkklTravelToursPteLtdLink() {
        kkklTravelToursPteLtd.click();
        return this;
    }

    /**
     * Click on Konsortium Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickKonsortiumExpressLink() {
        konsortiumExpress.click();
        return this;
    }

    /**
     * Click on Kpb Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickKpbExpressLink() {
        kpbExpress.click();
        return this;
    }

    /**
     * Click on Kpb Seremban Enterprise Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickKpbSerembanEnterpriseLink() {
        kpbSerembanEnterprise.click();
        return this;
    }

    /**
     * Click on Kulim First Travel Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickKulimFirstTravelLink() {
        kulimFirstTravel.click();
        return this;
    }

    /**
     * Click on Kwok Ping Express Jb Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickKwokPingExpressJbLink() {
        kwokPingExpressJb.click();
        return this;
    }

    /**
     * Click on La Holidays Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickLaHolidaysLink() {
        laHolidays.click();
        return this;
    }

    /**
     * Click on Lapan Lapan Travel Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickLapanLapanTravelLink() {
        lapanLapanTravel.click();
        return this;
    }

    /**
     * Click on Latest Promotion Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickLatestPromotionLink() {
        latestPromotion.click();
        return this;
    }

    /**
     * Click on Lienadia Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickLienadiaExpressLink() {
        lienadiaExpress.click();
        return this;
    }

    /**
     * Click on Limbongan Maju Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickLimbonganMajuLink() {
        limbonganMaju.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickLogInLink() {
        logIn.click();
        return this;
    }

    /**
     * Click on Login Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickLoginLink() {
        login.click();
        return this;
    }

    /**
     * Click on Loyalty Program Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickLoyaltyProgram1Link() {
        loyaltyProgram1.click();
        return this;
    }

    /**
     * Click on Loyalty Program Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickLoyaltyProgram2Link() {
        loyaltyProgram2.click();
        return this;
    }

    /**
     * Click on Lpms Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickLpmsExpressLink() {
        lpmsExpress.click();
        return this;
    }

    /**
     * Click on Luxury Coach Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickLuxuryCoachLink() {
        luxuryCoach.click();
        return this;
    }

    /**
     * Click on Maharani Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickMaharaniExpressLink() {
        maharaniExpress.click();
        return this;
    }

    /**
     * Click on Majestic Fast Ferry Pte Ltd Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickMajesticFastFerryPteLtdLink() {
        majesticFastFerryPteLtd.click();
        return this;
    }

    /**
     * Click on Maju Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickMajuExpressLink() {
        majuExpress.click();
        return this;
    }

    /**
     * Click on Manage My Booking Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickManageMyBookingLink() {
        manageMyBooking.click();
        return this;
    }

    /**
     * Click on Manis Liner Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickManisLinerExpressLink() {
        manisLinerExpress.click();
        return this;
    }

    /**
     * Click on Maraliner Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickMaralinerLink() {
        maraliner.click();
        return this;
    }

    /**
     * Click on Mayang Sari Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickMayangSariExpressLink() {
        mayangSariExpress.click();
        return this;
    }

    /**
     * Click on Melor Interline Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickMelorInterlineExpressLink() {
        melorInterlineExpress.click();
        return this;
    }

    /**
     * Click on Meridian Holidays Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickMeridianHolidaysLink() {
        meridianHolidays.click();
        return this;
    }

    /**
     * Click on Mly Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickMlyLink() {
        mly.click();
        return this;
    }

    /**
     * Click on Naik Selalu Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickNaikSelaluExpressLink() {
        naikSelaluExpress.click();
        return this;
    }

    /**
     * Click on Neoliner Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickNeolinerExpressLink() {
        neolinerExpress.click();
        return this;
    }

    /**
     * Click on New Asian Travel Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickNewAsianTravelLink() {
        newAsianTravel.click();
        return this;
    }

    /**
     * Click on Nks Hotel And Travel Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickNksHotelAndTravelLink() {
        nksHotelAndTravel.click();
        return this;
    }

    /**
     * Click on Ntuc Plus Guide Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickNtucPlusGuideLink() {
        ntucPlusGuide.click();
        return this;
    }

    /**
     * Click on Orkid Malaysia Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickOrkidMalaysiaExpressLink() {
        orkidMalaysiaExpress.click();
        return this;
    }

    /**
     * Click on Pahang Lin Siong Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickPahangLinSiongLink() {
        pahangLinSiong.click();
        return this;
    }

    /**
     * Click on Pasir Gudang Ferry Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickPasirGudangFerryLink() {
        pasirGudangFerry.click();
        return this;
    }

    /**
     * Click on Paypal Payment Guide Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickPaypalPaymentGuideLink() {
        paypalPaymentGuide.click();
        return this;
    }

    /**
     * Click on Perak Transit Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickPerakTransitLink() {
        perakTransit.click();
        return this;
    }

    /**
     * Click on Perdana Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickPerdanaExpressLink() {
        perdanaExpress.click();
        return this;
    }

    /**
     * Click on Perhentian Trans Holiday Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickPerhentianTransHolidayLink() {
        perhentianTransHoliday.click();
        return this;
    }

    /**
     * Click on Persada Travel And Tours Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickPersadaTravelAndToursLink() {
        persadaTravelAndTours.click();
        return this;
    }

    /**
     * Click on Plusliner Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickPluslinerLink() {
        plusliner.click();
        return this;
    }

    /**
     * Click on Popular Bus Tickets From Malaysia Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickPopularBusTicketsFromMalaysiaLink() {
        popularBusTicketsFromMalaysia.click();
        return this;
    }

    /**
     * Click on Popular Bus Tickets From Singapore Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickPopularBusTicketsFromSingaporeLink() {
        popularBusTicketsFromSingapore.click();
        return this;
    }

    /**
     * Click on Prisma Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickPrismaExpressLink() {
        prismaExpress.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Queen Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickQueenExpressLink() {
        queenExpress.click();
        return this;
    }

    /**
     * Click on Quick Liner Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickQuickLinerExpressLink() {
        quickLinerExpress.click();
        return this;
    }

    /**
     * Click on Rm 10.00bus From Kl To Malacca Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickRm1000busFromKlToMalaccaLink() {
        rm1000busFromKlToMalacca.click();
        return this;
    }

    /**
     * Click on Rm 20.00bus From Kl To Johor Bahru Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickRm2000busFromKlToJohorLink() {
        rm2000busFromKlToJohor.click();
        return this;
    }

    /**
     * Click on Rm 22.00bus From Kl To Batu Pahat Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickRm2200busFromKlToBatuLink() {
        rm2200busFromKlToBatu.click();
        return this;
    }

    /**
     * Click on Rm 23.00bus From Kl To Kuantan Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickRm2300busFromKlToKuantanLink() {
        rm2300busFromKlToKuantan.click();
        return this;
    }

    /**
     * Click on Rm 28.00bus From Kl To Butterworth Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickRm2800busFromKlToButterworthLink() {
        rm2800busFromKlToButterworth.click();
        return this;
    }

    /**
     * Click on Rm 33.00bus From Kl To Penang Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickRm3300busFromKlToPenangLink() {
        rm3300busFromKlToPenang.click();
        return this;
    }

    /**
     * Click on Rm 35.00bus From Kl To Cameron Highlands Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickRm3500busFromKlToCameronLink() {
        rm3500busFromKlToCameron.click();
        return this;
    }

    /**
     * Click on Rm 38.30bus From Kl To Mersing Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickRm3830busFromKlToMersingLink() {
        rm3830busFromKlToMersing.click();
        return this;
    }

    /**
     * Click on S 11.00bus From Singapore To Legoland Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickS1100busFromSingaporeToLegolandLink() {
        s1100busFromSingaporeToLegoland.click();
        return this;
    }

    /**
     * Click on S 13.00bus From Singapore To Malacca Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickS1300busFromSingaporeToMalaccaLink() {
        s1300busFromSingaporeToMalacca.click();
        return this;
    }

    /**
     * Click on S 18.00bus From Singapore To Kl Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickS1800busFromSingaporeToKlLink() {
        s1800busFromSingaporeToKl.click();
        return this;
    }

    /**
     * Click on S 20.00bus From Kl To Singapore Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickS2000busFromKlToSingaporeLink() {
        s2000busFromKlToSingapore.click();
        return this;
    }

    /**
     * Click on S 25.00bus From Singapore To One Utama Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickS2500busFromSingaporeToOneLink() {
        s2500busFromSingaporeToOne.click();
        return this;
    }

    /**
     * Click on S 30.00bus From Singapore To Genting Highlands Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickS3000busFromSingaporeToGentingLink() {
        s3000busFromSingaporeToGenting.click();
        return this;
    }

    /**
     * Click on S 30.00bus From Singapore To Ipoh Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickS3000busFromSingaporeToIpohLink() {
        s3000busFromSingaporeToIpoh.click();
        return this;
    }

    /**
     * Click on S 33.00bus From Singapore To Mersing Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickS3300busFromSingaporeToMersingLink() {
        s3300busFromSingaporeToMersing.click();
        return this;
    }

    /**
     * Click on S 35.00bus From Singapore To Port Dickson Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickS3500busFromSingaporeToPortLink() {
        s3500busFromSingaporeToPort.click();
        return this;
    }

    /**
     * Click on S 40.00bus From Singapore To Cameron Highlands Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickS4000busFromSingaporeToCameronLink() {
        s4000busFromSingaporeToCameron.click();
        return this;
    }

    /**
     * Click on Salesbusonlineticket.com Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSalesbusonlineticketComLink() {
        salesbusonlineticketCom.click();
        return this;
    }

    /**
     * Click on Sani Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSaniExpressLink() {
        saniExpress.click();
        return this;
    }

    /**
     * Click on Sanwa Tours M Sdn Bhd Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSanwaToursMSdnBhdLink() {
        sanwaToursMSdnBhd.click();
        return this;
    }

    /**
     * Click on Se Super Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSeSuperExpressLink() {
        seSuperExpress.click();
        return this;
    }

    /**
     * Click on Seasons Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSeasonsExpressLink() {
        seasonsExpress.click();
        return this;
    }

    /**
     * Click on Sepakat Liner Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSepakatLinerExpressLink() {
        sepakatLinerExpress.click();
        return this;
    }

    /**
     * Click on Shanhua Travel And Tours Sdn Bhd Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickShanhuaTravelAndToursSdnBhdLink() {
        shanhuaTravelAndToursSdnBhd.click();
        return this;
    }

    /**
     * Click on Sign Up Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSignUpLink() {
        signUp.click();
        return this;
    }

    /**
     * Click on Sin Yong Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSinYongExpressLink() {
        sinYongExpress.click();
        return this;
    }

    /**
     * Click on Sipitang Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSipitangExpressLink() {
        sipitangExpress.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSitemap1Link() {
        sitemap1.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSitemap2Link() {
        sitemap2.click();
        return this;
    }

    /**
     * Click on Sri Maju Express Kangar Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSriMajuExpressKangarLink() {
        sriMajuExpressKangar.click();
        return this;
    }

    /**
     * Click on Sri Theven Travel Tours Sdn Bhd Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSriThevenTravelToursSdnLink() {
        sriThevenTravelToursSdn.click();
        return this;
    }

    /**
     * Click on Ss International Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSsInternationalLink() {
        ssInternational.click();
        return this;
    }

    /**
     * Click on Star Coach Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickStarCoachExpressLink() {
        starCoachExpress.click();
        return this;
    }

    /**
     * Click on Star Shuttle Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickStarShuttleExpressLink() {
        starShuttleExpress.click();
        return this;
    }

    /**
     * Click on Starmart Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickStarmartExpressLink() {
        starmartExpress.click();
        return this;
    }

    /**
     * Click on Suasana Holiday Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSuasanaHolidayExpressLink() {
        suasanaHolidayExpress.click();
        return this;
    }

    /**
     * Click on Suasana Tony Coach Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSuasanaTonyCoachLink() {
        suasanaTonyCoach.click();
        return this;
    }

    /**
     * Click on Super Coach Holiday Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSuperCoachHolidayLink() {
        superCoachHoliday.click();
        return this;
    }

    /**
     * Click on Super Fast Ferry Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSuperFastFerryLink() {
        superFastFerry.click();
        return this;
    }

    /**
     * Click on Super Nice Express Grassland Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSuperNiceExpressGrasslandLink() {
        superNiceExpressGrassland.click();
        return this;
    }

    /**
     * Click on Superior Tour Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSuperiorTourLink() {
        superiorTour.click();
        return this;
    }

    /**
     * Click on Supernice Grassland Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSuperniceGrasslandLink() {
        superniceGrassland.click();
        return this;
    }

    /**
     * Click on Swiftliner Express Sdn Bhd Arwana Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickSwiftlinerExpressSdnBhdArwanaExpressLink() {
        swiftlinerExpressSdnBhdArwanaExpress.click();
        return this;
    }

    /**
     * Click on Telaga Terminal Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickTelagaTerminalLink() {
        telagaTerminal.click();
        return this;
    }

    /**
     * Click on Thailand Booking Site Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickThailandBookingSite1Link() {
        thailandBookingSite1.click();
        return this;
    }

    /**
     * Click on Thailand Booking Site Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickThailandBookingSite2Link() {
        thailandBookingSite2.click();
        return this;
    }

    /**
     * Click on The One Travel Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickTheOneTravelLink() {
        theOneTravel.click();
        return this;
    }

    /**
     * Click on Tour Packages Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickTourPackagesLink() {
        tourPackages.click();
        return this;
    }

    /**
     * Click on Tours Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickToursLink() {
        tours.click();
        return this;
    }

    /**
     * Click on Train Route Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickTrainRouteLink() {
        trainRoute.click();
        return this;
    }

    /**
     * Click on Train Tickets Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickTrainTickets1Link() {
        trainTickets1.click();
        return this;
    }

    /**
     * Click on Train Tickets Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickTrainTickets2Link() {
        trainTickets2.click();
        return this;
    }

    /**
     * Click on Trans Mvs Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickTransMvsExpressLink() {
        transMvsExpress.click();
        return this;
    }

    /**
     * Click on Transnasional Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickTransnasionalLink() {
        transnasional.click();
        return this;
    }

    /**
     * Click on Transtar Travel Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickTranstarTravelLink() {
        transtarTravel.click();
        return this;
    }

    /**
     * Click on Travel Forte Ctts Holiday Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickTravelForteCttsHolidayLink() {
        travelForteCttsHoliday.click();
        return this;
    }

    /**
     * Click on Travel Tips Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickTravelTipsLink() {
        travelTips.click();
        return this;
    }

    /**
     * Click on Trip Duration Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickTripDurationLink() {
        tripDuration.click();
        return this;
    }

    /**
     * Click on Unititi Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickUnititiExpressLink() {
        unititiExpress.click();
        return this;
    }

    /**
     * Click on Urban Bus Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickUrbanBusLink() {
        urbanBus.click();
        return this;
    }

    /**
     * Click on Utama Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickUtamaExpressLink() {
        utamaExpress.click();
        return this;
    }

    /**
     * Click on Vigourmarine Boat Services Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickVigourmarineBoatServicesLink() {
        vigourmarineBoatServices.click();
        return this;
    }

    /**
     * Click on Wts Travel Tours Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickWtsTravelToursLink() {
        wtsTravelTours.click();
        return this;
    }

    /**
     * Click on Yoyo Express Link.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage clickYoyoExpressLink() {
        yoyoExpress.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage fill() {
        setOneWayRadioButtonField();
        setAddAHotel1TextField();
        setAddAHotel2TextField();
        setAddAHotel3DropDownListField();
        setAddAHotel4TextField();
        setAddAHotel5TextField();
        setAddAHotel6CheckboxField();
        return this;
    }

    /**
     * Set default value to Add A Hotel Text field.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage setAddAHotel1TextField() {
        return setAddAHotel1TextField(data.get("ADD_A_HOTEL_1"));
    }

    /**
     * Set value to Add A Hotel Text field.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage setAddAHotel1TextField(String addAHotel1Value) {
        addAHotel1.sendKeys(addAHotel1Value);
        return this;
    }

    /**
     * Set default value to Add A Hotel Text field.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage setAddAHotel2TextField() {
        return setAddAHotel2TextField(data.get("ADD_A_HOTEL_2"));
    }

    /**
     * Set value to Add A Hotel Text field.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage setAddAHotel2TextField(String addAHotel2Value) {
        addAHotel2.sendKeys(addAHotel2Value);
        return this;
    }

    /**
     * Set default value to Add A Hotel Drop Down List field.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage setAddAHotel3DropDownListField() {
        return setAddAHotel3DropDownListField(data.get("ADD_A_HOTEL_3"));
    }

    /**
     * Set value to Add A Hotel Drop Down List field.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage setAddAHotel3DropDownListField(String addAHotel3Value) {
        new Select(addAHotel3).selectByVisibleText(addAHotel3Value);
        return this;
    }

    /**
     * Set default value to Add A Hotel Text field.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage setAddAHotel4TextField() {
        return setAddAHotel4TextField(data.get("ADD_A_HOTEL_4"));
    }

    /**
     * Set value to Add A Hotel Text field.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage setAddAHotel4TextField(String addAHotel4Value) {
        addAHotel4.sendKeys(addAHotel4Value);
        return this;
    }

    /**
     * Set default value to Add A Hotel Text field.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage setAddAHotel5TextField() {
        return setAddAHotel5TextField(data.get("ADD_A_HOTEL_5"));
    }

    /**
     * Set value to Add A Hotel Text field.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage setAddAHotel5TextField(String addAHotel5Value) {
        addAHotel5.sendKeys(addAHotel5Value);
        return this;
    }

    /**
     * Set Add A Hotel Checkbox field.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage setAddAHotel6CheckboxField() {
        if (!addAHotel6.isSelected()) {
            addAHotel6.click();
        }
        return this;
    }

    /**
     * Set default value to One Way Radio Button field.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage setOneWayRadioButtonField() {
        for (WebElement el : oneWay) {
            if (el.getAttribute("value").equals(oneWayValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Unset default value from Add A Hotel Drop Down List field.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage unsetAddAHotel3DropDownListField() {
        return unsetAddAHotel3DropDownListField(data.get("ADD_A_HOTEL_3"));
    }

    /**
     * Unset value from Add A Hotel Drop Down List field.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage unsetAddAHotel3DropDownListField(String addAHotel3Value) {
        new Select(addAHotel3).deselectByVisibleText(addAHotel3Value);
        return this;
    }

    /**
     * Unset Add A Hotel Checkbox field.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage unsetAddAHotel6CheckboxField() {
        if (addAHotel6.isSelected()) {
            addAHotel6.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the BOT_HomePage class instance.
     */
    public BOT_HomePage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
