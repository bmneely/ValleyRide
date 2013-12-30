package com.benneelyvalleyride;

import android.content.Context;
import android.graphics.Color;
import android.location.Geocoder;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by benneely on 11/12/13.
 */
public class Routes {
    private ArrayList<Route> mRoutes;
    private static Routes sRoutes;
    private Context mAppContext;
    private Geocoder geocoder;


    private Routes(Context appContext) {
        this.geocoder = new Geocoder(appContext);
        this.mAppContext = appContext;
        mRoutes = new ArrayList<Route>();
        mRoutes.add(new Route( 1, "Parkcenter", Color.parseColor("#FBCF34"), R.drawable.route_1_icon, R.drawable.route_1_map,
                new ArrayList<Stop>()
                {{
                    add(new Stop( "Zone 1 Idaho & 8th", new LatLng(43.616105,-116.202049), new ArrayList<Integer>()
                        {{ add(615); add(645); add(715); add(745);add(815); add(845); add(945); add(1045); add(1145); add(1245);  add(1345); add(1445); add(1515); add(1545); add(1615); add(1645); add(1715); add(1745); add(1815); }} ));
                    add(new Stop( "University & Joyce", new LatLng(43.6029,-116.204479), new ArrayList<Integer>()
                        {{ add(620); add(650); add(720); add(750); add(820); add(850); add(950); add(1050); add(1150); add(1250); add(1350); add(1450); add(1520); add(1550); add(1620); add(1650); add(1720); add(1750); add(1820); }} ));
                    add(new Stop( "Beacon & Broadway", new LatLng(43.598394,-116.193544), new ArrayList<Integer>()
                        {{ add(624); add(654); add(724); add(754); add(824); add(854); add(954); add(1054); add(1154); add(1254); add(1354); add(1454); add(1524); add(1554); add(1624); add(1654); add(1724); add(1754); add(1824); }} ));
                    add(new Stop( "Boise & Apple", new LatLng(43.578492,-116.173384), new ArrayList<Integer>()
                        {{ add(630); add(700); add(730); add(800); add(830); add(900); add(1000); add(1100); add(1200); add(1300); add(1400); add(1500); add(1530); add(1600); add(1630); add(1700); add(1730); add(1800); add(1830); }} ));
                    add(new Stop( "TK & Diamond", new LatLng(43.569039,-116.191931), new ArrayList<Integer>()
                        {{ add(640); add(710); add(740); add(810); add(840); add(910); add(1010); add(1110); add(1210); add(1310); add(1410); add(1510); add(1540); add(1610); add(1640); add(1710); add(1740); add(1810); add(1840); }} ));
                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "TK & Diamond", new LatLng(43.569039,-116.191931), new ArrayList<Integer>()
                        {{ add(540); add(640); add(710); add(740); add(810); add(840); add(910); add(1010); add(1110); add(1210); add(1310); add(1410); add(1510); add(1540); add(1610); add(1640); add(1710); add(1740); add(1810); }} ));
                    add(new Stop( "Boise & Apple", new LatLng(43.578492,-116.173384), new ArrayList<Integer>()
                        {{ add(550); add(650); add(720); add(750); add(820); add(850); add(920); add(1020); add(1120); add(1220); add(1320); add(1420); add(1520); add(1550); add(1620); add(1650); add(1720); add(1750); add(1820); }} ));
                    add(new Stop( "Beacon & Broadway", new LatLng(43.598394,-116.193544), new ArrayList<Integer>()
                        {{ add(555); add(655); add(725); add(755); add(825); add(855); add(925); add(1025); add(1125); add(1225); add(1325); add(1425); add(1525); add(1555); add(1625); add(1655); add(1725); add(1755); add(1825); }} ));
                    add(new Stop( "BSU Admin. Building", new LatLng(43.603102,-116.204923), new ArrayList<Integer>()
                        {{ add(603); add(703); add(733); add(803); add(833); add(903); add(933); add(1033); add(1133); add(1233); add(1333); add(1433); add(1533); add(1603); add(1633); add(1703); add(1733); add(1803); add(1833); }} ));
                    add(new Stop( "Zone 1 Idaho & 8th", new LatLng(43.616105,-116.202049), new ArrayList<Integer>()
                        {{ add(610); add(710); add(740); add(810); add(840); add(910); add(940); add(1040); add(1140); add(1240); add(1340); add(1440); add(1540); add(1610); add(1640); add(1710); add(1740); add(1810); add(1840); }} ));
                }}
        ));
        mRoutes.add(new Route( 2, "Broadway", Color.parseColor("#4F67AA"), R.drawable.route_2_icon, R.drawable.route_2_map,
                new ArrayList<Stop>()
                {{
                    add(new Stop( "Zone 3 Main & 8th", new LatLng(43.615023,-116.202498), new ArrayList<Integer>()
                        {{ add(645); add(745); add(845); add(945); add(1045); add(1145); add(1245); add(1345); add(1445); add(1545); add(1645); add(1745); add(1845); }} ));
                    add(new Stop( "Broadway & Beacon", new LatLng(43.598394,-116.193544), new ArrayList<Integer>()
                        {{ add(650); add(750); add(850); add(950); add(1050); add(1150); add(1250); add(1350); add(1450); add(1550); add(1650); add(1750); add(1850); }} ));
                    add(new Stop( "Broadway & Linden", new LatLng(43.578967,-116.193565), new ArrayList<Integer>()
                        {{ add(655); add(755); add(845); add(954); add(1055); add(1155); add(1255); add(1355); add(1455); add(1555); add(1655); add(1755); add(1855); }} ));
                    add(new Stop( "Gekeler & Iowa", new LatLng(43.578967,-116.193565), new ArrayList<Integer>()
                        {{ add(703); add(803); add(903); add(1003); add(1103); add(1203); add(1303); add(1403); add(1503); add(1603); add(1703); add(1803); add(1903); }} ));
                    add(new Stop( "Apple & Boise", new LatLng(43.578492,-116.173384), new ArrayList<Integer>()
                        {{ add(710); add(810); add(910); add(1010); add(1110); add(1210); add(1310); add(1410); add(1510); add(1610); add(1710); add(1810); add(1903); }} ));
                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "Apple & Boise", new LatLng(43.578492,-116.173384), new ArrayList<Integer>()
                        {{ add(710); add(810); add(910); add(1010); add(1110); add(1210); add(1310); add(1410); add(1510); add(1610); add(1710); add(1810); add(1910); }} ));
                    add(new Stop( "Bergeson & Federal Way", new LatLng(43.568146,-116.182266), new ArrayList<Integer>()
                        {{ add(715); add(815); add(915); add(1015); add(1115); add(1215); add(1315); add(1415); add(1515); add(1615); add(1715); add(1815); add(1915); }} ));
                    add(new Stop( "Broadway & Linden", new LatLng(43.578967,-116.193565), new ArrayList<Integer>()
                        {{ add(720); add(820); add(920); add(1020); add(1120); add(1220); add(1320); add(1420); add(1520); add(1620); add(1720); add(1820); }} ));
                    add(new Stop( "Broadway & Beacon", new LatLng(43.598394,-116.193544), new ArrayList<Integer>()
                        {{ add(727); add(827); add(925); add(1025); add(1125); add(1225); add(1325); add(1425); add(1525); add(1625); add(1725); add(1825); }} ));
                    add(new Stop( "Zone 3 Main & 8th", new LatLng(43.615023,-116.202498), new ArrayList<Integer>()
                        {{ add(732); add(832); add(932); add(1032); add(1132); add(1232); add(1332); add(1432); add(1532); add(1632); add(1732); add(1832); }} ));
                }}
        ));
        mRoutes.add(new Route( 3, "Vista", Color.parseColor("#EE9C3F"), R.drawable.route_3_icon, R.drawable.route_3_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Zone 1 Idaho & 8th", new LatLng(43.616105,-116.202049), new ArrayList<Integer>()
                        {{ add(620); add(640); add(700); add(720); add(740); add(800); add(820); add(840); add(920); add(1000); add(1040); add(1120); add(1200); add(1320); add(1400); add(1420); add(1520); add(1600); add(1620); add(1640); add(1700); add(1720); add(1740); add(1800); add(1820); }} ));
                    add(new Stop( "Capital & Ann Morrison", new LatLng(43.605806,-116.211466), new ArrayList<Integer>()
                        {{ add(623); add(643); add(703); add(723); add(743); add(803); add(823); add(843); add(923); add(1003); add(1043); add(1123); add(1203); add(1323); add(1403); add(1423); add(1523); add(1603); add(1623); add(1643); add(1703); add(1723); add(1743); add(1803); add(1823); }} ));
                    add(new Stop( "Vista & Overland", new LatLng(43.589858,-116.213683), new ArrayList<Integer>()
                        {{ add(626); add(646); add(706); add(726); add(746); add(806); add(826); add(846); add(926); add(1006); add(1046); add(1126); add(1206); add(1326); add(1406); add(1426); add(1526); add(1606); add(1626); add(1646); add(1706); add(1726); add(1746); add(1806); add(1826); }} ));
                    add(new Stop( "Vista & Canal", new LatLng(43.577138,-116.213631), new ArrayList<Integer>()
                        {{ add(628); add(648); add(708); add(728); add(748); add(808); add(828); add(848); add(928); add(1008); add(1048); add(1128); add(1208); add(1328); add(1408); add(1428); add(1528); add(1608); add(1628); add(1648); add(1708); add(1728); add(1748); add(1808); add(1828); }} ));
                    add(new Stop( "Boise Airport", new LatLng(43.569901,-116.21634), new ArrayList<Integer>()
                        {{ add(635); add(655); add(715); add(735); add(755); add(815); add(835); add(855); add(935); add(1015); add(1055); add(1135); add(1215); add(1335); add(1415); add(1435); add(1535); add(1615); add(1635); add(1655); add(1715); add(1735); add(1755); add(1815); add(1835); }} ));
                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "Boise Airport", new LatLng(43.569901,-116.21634), new ArrayList<Integer>()
                        {{ add(555); add(615); add(635); add(655); add(715); add(735); add(755); add(815); add(855); add(935); add(1015); add(1055); add(1135); add(1215); add(1255); add(1335); add(1415); add(1455); add(1535); add(1555); add(1615); add(1635); add(1655); add(1715); add(1735); add(1755); }} ));
                    add(new Stop( "Vista & Canal", new LatLng(43.577138,-116.213631), new ArrayList<Integer>()
                        {{ add(558); add(618); add(638); add(658); add(718); add(738); add(758); add(818); add(858); add(938); add(1018); add(1058); add(1138); add(1218); add(1258); add(1338); add(1418); add(1458); add(1538); add(1558); add(1618); add(1638); add(1658); add(1718); add(1738); add(1758); }} ));
                    add(new Stop( "Vista & Overland", new LatLng(43.589858,-116.213683), new ArrayList<Integer>()
                        {{ add(601); add(621); add(641); add(701); add(721); add(741); add(801); add(821); add(901); add(941); add(1021); add(1101); add(1141); add(1221); add(1301); add(1341); add(1421); add(1501); add(1541); add(1601); add(1621); add(1641); add(1701); add(1721); add(1741); add(1801); }} ));
                    add(new Stop( "Capital & University", new LatLng(43.605176,-116.211485), new ArrayList<Integer>()
                        {{ add(604); add(624); add(644); add(704); add(724); add(744); add(804); add(824); add(904); add(944); add(1024); add(1104); add(1144); add(1224); add(1304); add(1344); add(1424); add(1504); add(1544); add(1604); add(1624); add(1644); add(1704); add(1724); add(1744); add(1804); }} ));
                    add(new Stop( "Zone 1 Idaho & 8th", new LatLng(43.616105,-116.202049), new ArrayList<Integer>()
                        {{ add(610); add(630); add(650); add(710); add(730); add(750); add(810); add(830); add(910); add(950); add(1030); add(1110); add(1150); add(1230); add(1310); add(1350); add(1430); add(1510); add(1550); add(1610); add(1630); add(1650); add(1710); add(1730); add(1750); add(1810); }} ));
                }}
        ));
        mRoutes.add(new Route( 4, "Roosevelt", Color.parseColor("#44AED5"), R.drawable.route_4_icon, R.drawable.route_4_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Zone 3 Main & 8th", new LatLng(43.615023,-116.202498), new ArrayList<Integer>()
                        {{ add(645); add(715); add(745); add(815); add(845); add(945); add(1045); add(1145); add(1245); add(1345); add(1445); add(1515); add(1545); add(1615); add(1645); add(1715); add(1745); add(1815); add(1845); }} ));
                    add(new Stop( "13th at Post Office", new LatLng(43.614071,-116.217354), new ArrayList<Integer>()
                        {{ add(648); add(718); add(748); add(818); add(848); add(948); add(1048); add(1148); add(1248); add(1348); add(1448); add(1518); add(1548); add(1618); add(1648); add(1718); add(1748); add(1818); add(1848); }} ));
                    add(new Stop( "Latah & Rose Hill", new LatLng(43.600685,-116.228579), new ArrayList<Integer>()
                        {{ add(655); add(725); add(755); add(825); add(855); add(955); add(1055); add(1155); add(1255); add(1355); add(1455); add(1525); add(1555); add(1625); add(1655); add(1725); add(1755); add(1825); add(1855); }} ));
                    add(new Stop( "Roosevelt & Overland", new LatLng(43.589775,-116.233565), new ArrayList<Integer>()
                        {{ add(700); add(730); add(800); add(930); add(900); add(1000); add(1100); add(1200); add(1300); add(1400); add(1500); add(1525); add(1555); add(1625); add(1655); add(1725); add(1755); add(1825); add(1855); }} ));
                    add(new Stop( "Vista & Canal", new LatLng(43.577138,-116.213631), new ArrayList<Integer>()
                        {{ add(608); add(638); add(708); add(738); add(808); add(908); add(1008); add(1108); add(1208); add(1308); add(1408); add(1508); add(1538); add(1608); add(1638); add(1708); add(1738); add(1808); add(1838); add(1908); }} ));
                    add(new Stop( "Targee & Vista", new LatLng(43.582499,-116.213652), new ArrayList<Integer>()
                        {{ add(610); add(640); add(710); add(740); add(810); add(910); add(1010); add(1110); add(1210); add(1310); add(1410); add(1510); add(1540); add(1610); add(1640); add(1710); add(1740); add(1810); add(1840); add(1910); }} ));
                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "Targee & Vista", new LatLng(43.582499,-116.213652), new ArrayList<Integer>()
                        {{ add(610); add(640); add(710); add(740); add(810); add(840); add(910); add(1010); add(1110); add(1210); add(1310); add(1410); add(1510); add(1540); add(1610); add(1640); add(1710); add(1740); add(1810); }} ));
                    add(new Stop( "Vista & Canal", new LatLng(43.577138,-116.213631), new ArrayList<Integer>()
                        {{ add(614); add(644); add(714); add(744); add(814); add(844); add(914); add(1014); add(1114); add(1214); add(1314); add(1414); add(1514); add(1544); add(1614); add(1644); add(1714); add(1744); add(1814); }} ));
                    add(new Stop( "Roosevelt & Overland", new LatLng(43.589775,-116.233565), new ArrayList<Integer>()
                        {{ add(620); add(650); add(720); add(740); add(820); add(850); add(920); add(1020); add(1120); add(1220); add(1320); add(1420); add(1520); add(1550); add(1620); add(1650); add(1720); add(1750); add(1820); }} ));
                    add(new Stop( "Latah & Rose Hill", new LatLng(43.600685,-116.228579), new ArrayList<Integer>()
                        {{ add(625); add(655); add(725); add(745); add(825); add(855); add(925); add(1025); add(1125); add(1255); add(1325); add(1425); add(1555); add(1555); add(1625); add(1655); add(1725); add(1755); add(1825); }} ));
                    add(new Stop( "13th at Post Office", new LatLng(43.614071,-116.217354), new ArrayList<Integer>()
                        {{ add(628); add(658); add(728); add(748); add(828); add(858); add(928); add(1028); add(1128); add(1228); add(1328); add(1428); add(1528); add(1558); add(1628); add(1658); add(1728); add(1758); add(1828); }} ));
                    add(new Stop( "Zone 3 Main & 8th", new LatLng(43.615023,-116.202498), new ArrayList<Integer>()
                        {{ add(635); add(705); add(735); add(805); add(835); add(905); add(935); add(1035); add(1135); add(1235); add(1335); add(1435); add(1535); add(1604); add(1635); add(1705); add(1735); add(1805); add(1835); }} ));
                }}
        ));
        mRoutes.add(new Route( 5, "Emerald", Color.parseColor("#822617"), R.drawable.route_5_icon, R.drawable.route_5_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Zone 1 Idaho & 8th", new LatLng(43.616105,-116.202049), new ArrayList<Integer>()
                        {{ add(615); add(645); add(715); add(745); add(815); add(845); add(945); add(1045); add(1145); add(1245); add(1345); add(1445); add(1515); add(1545); add(1615); add(1645); add(1715); add(1745); add(1845); }} ));
                    add(new Stop( "13th at Post Office", new LatLng(43.614071,-116.217354), new ArrayList<Integer>()
                        {{ add(618); add(648); add(718); add(748); add(818); add(848); add(948); add(1048); add(1148); add(1248); add(1348); add(1448); add(1518); add(1548); add(1618); add(1648); add(1718); add(1748); add(1848); }} ));
                    add(new Stop( "Americana & Emerald", new LatLng(43.611557,-116.22846), new ArrayList<Integer>()
                        {{ add(622); add(652); add(722); add(752); add(822); add(852); add(952); add(1052); add(1152); add(1252); add(1352); add(1452); add(1522); add(1552); add(1622); add(1652); add(1722); add(1752); add(1852); }} ));
                    add(new Stop( "Emerald & Curtis", new LatLng(43.611628,-116.253645), new ArrayList<Integer>()
                        {{ add(627); add(657); add(727); add(757); add(827); add(857); add(957); add(1057); add(1157); add(1257); add(1357); add(1457); add(1527); add(1557); add(1627); add(1657); add(1727); add(1757); add(1857); }} ));
                    add(new Stop( "Town Square Mall P&R", new LatLng(43.577138,-116.213631), new ArrayList<Integer>()
                        {{ add(635); add(705); add(735); add(805); add(835); add(905); add(1005); add(1105); add(1205); add(1305); add(1405); add(1505); add(1535); add(1605); add(1635); add(1705); add(1735); add(1805); add(1905); }} ));
                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "Town Square Mall P&R", new LatLng(43.577138,-116.213631), new ArrayList<Integer>()
                        {{ add(610); add(640); add(710); add(740); add(810); add(840); add(910); add(1010); add(1110); add(1210); add(1310); add(1410); add(1510); add(1540); add(1610); add(1640); add(1710); add(1740); add(1810); }} ));
                    add(new Stop( "Emerald & Curtis", new LatLng(43.611628,-116.253645), new ArrayList<Integer>()
                        {{ add(616); add(646); add(716); add(746); add(816); add(846); add(916); add(1016); add(1116); add(1216); add(1316); add(1416); add(1516); add(1546); add(1616); add(1646); add(1716); add(1746); add(1816); }} ));
                    add(new Stop( "Emerald & Latah", new LatLng(43.611557,-116.22846), new ArrayList<Integer>()
                        {{ add(621); add(651); add(721); add(751); add(821); add(851); add(921); add(1021); add(1121); add(1221); add(1321); add(1421); add(1521); add(1551); add(1621); add(1651); add(1721); add(1751); add(1821); }} ));
                    add(new Stop( "13th at Post Office", new LatLng(43.600685,-116.228579), new ArrayList<Integer>()
                        {{ add(624); add(654); add(724); add(754); add(824); add(854); add(924); add(1024); add(1124); add(1224); add(1324); add(1424); add(1524); add(1554); add(1624); add(1654); add(1724); add(1754); add(1824); }} ));
                    add(new Stop( "Zone 1 Idaho & 8th", new LatLng(43.614071,-116.217354), new ArrayList<Integer>()
                        {{ add(631); add(701); add(731); add(801); add(831); add(901); add(931); add(1031); add(1131); add(1231); add(1331); add(1431); add(1531); add(1601); add(1631); add(1701); add(1731); add(1801); add(1831); }} ));
                }}
        ));
        mRoutes.add(new Route( 6, "Orchard", Color.parseColor("#2780C0"), R.drawable.route_6_icon, R.drawable.route_6_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Zone 1 Idaho & 8th", new LatLng(43.616105,-116.202049), new ArrayList<Integer>()
                        {{ add(615); add(645); add(715); add(745); add(815); add(845); add(945); add(1045); add(1145); add(1245); add(1345); add(1445); add(1515); add(1545); add(1615); add(1645); add(1715); add(1755); add(1815); add(1845); }} ));
                    add(new Stop( "Main & 30th", new LatLng(43.621812,-116.227668), new ArrayList<Integer>()
                        {{ add(619); add(649); add(719); add(749); add(819); add(849); add(949); add(1049); add(1149); add(1249); add(1349); add(1449); add(1519); add(1549); add(1619); add(1649); add(1719); add(1749); add(1819); add(1849); }} ));
                    add(new Stop( "Orchard & Emerald", new LatLng(443.611622,-116.243497), new ArrayList<Integer>()
                        {{ add(623); add(653); add(723); add(753); add(823); add(853); add(953); add(1053); add(1153); add(1253); add(1353); add(1453); add(1523); add(1553); add(1623); add(1653); add(1723); add(1753); add(1823); add(1853); }} ));
                    add(new Stop( "Orchard & Kootenai", new LatLng(43.593428,-116.243581), new ArrayList<Integer>()
                        {{ add(628); add(658); add(728); add(758); add(828); add(858); add(958); add(1058); add(1158); add(1258); add(1358); add(1458); add(1528); add(1558); add(1628); add(1658); add(1728); add(1758); add(1828); add(1858); }} ));
                    add(new Stop( "Curtis & Overland", new LatLng(43.589873,-116.2536281), new ArrayList<Integer>()
                        {{ add(633); add(703); add(733); add(803); add(833); add(903); add(1003); add(1103); add(1203); add(1303); add(1403); add(1503); add(1533); add(1603); add(1633); add(1703); add(1733); add(1803); add(1833); add(1903); }} ));
                    add(new Stop( "Curtis & Frankiln", new LatLng(43.603309,-116.253644), new ArrayList<Integer>()
                        {{ add(637); add(707); add(737); add(807); add(837); add(907); add(1007); add(1107); add(1207); add(1307); add(1407); add(1507); add(1537); add(1607); add(1637); add(1707); add(1737); add(1807); add(1837); add(1907); }} ));
                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "Curtis & Frankiln", new LatLng(43.603309,-116.253644), new ArrayList<Integer>()
                        {{ add(637); add(707); add(737); add(807); add(837); add(907); add(1007); add(1107); add(1207); add(1307); add(1407); add(1507); add(1537); add(1607); add(1637); add(1707); add(1737); add(1807); add(1837); add(1907); }} ));
                    add(new Stop( "Curtis & Overland", new LatLng(43.589873,-116.2536281), new ArrayList<Integer>()
                        {{ add(644); add(714); add(744); add(814); add(844); add(914); add(1014); add(1114); add(1214); add(1314); add(1414); add(1514); add(1544); add(1614); add(1644); add(1714); add(1744); add(1814); add(1844); add(1914); }} ));
                    add(new Stop( "Orchard & Kootenai", new LatLng(43.593428,-116.243581), new ArrayList<Integer>()
                        {{ add(648); add(718); add(748); add(818); add(848); add(918); add(1018); add(1118); add(1218); add(1318); add(1418); add(1518); add(1548); add(1618); add(1648); add(1718); add(1748); add(1818); add(1848); add(1918); }} ));
                    add(new Stop( "Orchard & Emerald", new LatLng(443.611622,-116.243497), new ArrayList<Integer>()
                        {{ add(652); add(722); add(752); add(822); add(852); add(922); add(1022); add(1122); add(1222); add(1322); add(1422); add(1522); add(1552); add(1622); add(1652); add(1722); add(1752); add(1822); add(1852); add(1922); }} ));
                    add(new Stop( "Fairview & 17th", new LatLng(43.620525,-116.214535), new ArrayList<Integer>()
                        {{ add(654); add(724); add(754); add(824); add(854); add(924); add(1024); add(1124); add(1224); add(1324); add(1424); add(1524); add(1554); add(1624); add(1654); add(1724); add(1754); add(1824); add(1854); add(1924); }} ));
                    add(new Stop( "Zone 1 Idaho & 8th", new LatLng(43.616105,-116.202049), new ArrayList<Integer>()
                        {{ add(705); add(735); add(805); add(835); add(905); add(935); add(1035); add(1135); add(1235); add(1335); add(1435); add(1535); add(1605); add(1635); add(1705); add(1735); add(1805); add(1835); add(1905); add(1935); }} ));
                }}
        ));
        mRoutes.add(new Route( 7, "Fairview", Color.parseColor("#DC86B1"), R.drawable.route_7_icon, R.drawable.route_7_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Zone 1 Idaho & 8th", new LatLng(43.616105,-116.202049), new ArrayList<Integer>()
                        {{ add(540); add(620); add(700); add(740); add(820); add(900); add(940); add(1020); add(1100); add(1140); add(1220); add(1300); add(1340); add(1420); add(1500); add(1540); add(1620); add(1700); add(1740); add(1820); }} ));
                    add(new Stop( "Main & 30th", new LatLng(43.621812,-116.227668), new ArrayList<Integer>()
                        {{ add(546); add(626); add(706); add(746); add(826); add(906); add(946); add(1026); add(1106); add(1146); add(1226); add(1306); add(1346); add(1426); add(1506); add(1546); add(1626); add(1706); add(1746); add(1826); }} ));
                    add(new Stop( "Fairview & Cole", new LatLng(43.619323,-116.274236), new ArrayList<Integer>()
                        {{ add(554); add(634); add(714); add(754); add(834); add(914); add(954); add(1034); add(1114); add(1154); add(1234); add(1314); add(1354); add(1434); add(1514); add(1554); add(1634); add(1714); add(1754); add(1834); }} ));
                    add(new Stop( "Milwaukee & Goddard", new LatLng(43.644843,-116.284112), new ArrayList<Integer>()
                        {{ add(719); }} ));
                    add(new Stop( "Milwaukee & Fairview", new LatLng(43.619525,-116.284332), new ArrayList<Integer>()
                        {{ add(603); add(643); add(728); add(803); add(843); add(923); add(1003); add(1043); add(1123); add(1203); add(1243); add(1323); add(1403); add(1423); add(1523); add(1603); add(1643); add(1723); add(1803); add(1843); }} ));
                    add(new Stop( "Town Square Mall P&R", new LatLng(43.577138,-116.213631), new ArrayList<Integer>()
                        {{ add(615); add(655); add(728); add(815); add(855); add(923); add(1015); add(1055); add(1135); add(1215); add(1255); add(1335); add(1415); add(1435); add(1535); add(1615); add(1655); add(1735); add(1815); add(1855); }} ));
                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "Town Square Mall P&R", new LatLng(43.577138,-116.213631), new ArrayList<Integer>()
                        {{ add(620); add(700); add(740); add(820); add(900); add(940); add(1020); add(1100); add(1140); add(1220); add(1300); add(1340); add(1420); add(1500); add(1540); add(1620); add(1700); add(1740); add(1820); }} ));
                    add(new Stop( "Milwaukee & Fairview", new LatLng(43.619525,-116.284332), new ArrayList<Integer>()
                        {{ add(628); add(708); add(748); add(828); add(908); add(948); add(1028); add(1108); add(1148); add(1228); add(1308); add(1348); add(1428); add(1508); add(1548); add(1628); add(1708); add(1748); add(1828); }} ));
                    add(new Stop( "Milwaukee & Goddard", new LatLng(43.644843,-116.284112), new ArrayList<Integer>()
                        {{ add(1513); }} ));
                    add(new Stop( "Fairview & Cole", new LatLng(43.619323,-116.274236), new ArrayList<Integer>()
                        {{ add(637); add(717); add(757); add(837); add(917); add(958); add(1037); add(1117); add(1147); add(1237); add(1317); add(1357); add(1437); add(1522); add(1547); add(1637); add(1717); add(1757); add(1837); }} ));
                    add(new Stop( "Fairview & 17th", new LatLng(43.620525,-116.214535), new ArrayList<Integer>()
                        {{ add(646); add(726); add(806); add(846); add(926); add(1006); add(1046); add(1126); add(1156); add(1246); add(1326); add(1406); add(1446); add(1531); add(1606); add(1646); add(1726); add(1806); add(1846); }} ));
                    add(new Stop( "Zone 1 Idaho & 8th", new LatLng(43.616105,-116.202049), new ArrayList<Integer>()
                        {{ add(655); add(735); add(815); add(855); add(935); add(1015); add(1055); add(1135); add(1215); add(1250); add(1335); add(1415); add(1455); add(1540); add(1615); add(1655); add(1735); add(1815); add(1855); }} ));
                }}
        ));
        mRoutes.add(new Route( 8, "Chinden - Five Mile", Color.parseColor("#368897"), R.drawable.route_8_icon, R.drawable.route_8_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Town Square Mall P&R", new LatLng(43.577138,-116.213631), new ArrayList<Integer>()
                        {{ add(758); add(915); add(1015); add(1115); add(1215); add(1315); add(1415); add(1515); }} ));
                    add(new Stop( "Five Mile & Emerald", new LatLng(43.609968,-116.314313), new ArrayList<Integer>()
                        {{ add(805); add(922); add(1022); add(1122); add(1222); add(1322); add(1422); add(1522); }} ));
                    add(new Stop( "McMillion & Five Mile", new LatLng(43.648461,-116.314181), new ArrayList<Integer>()
                        {{ add(812); add(929); add(1029); add(1129); add(1229); add(1329); add(1429); add(1529); }} ));
                    add(new Stop( "West YMCA", new LatLng(43.620446,-116.20388), new ArrayList<Integer>()
                        {{ add(816); add(933); add(1033); add(1133); add(1233); add(1333); add(1433); add(1533); }} ));
                    add(new Stop( "Hewlett Packard", new LatLng(43.660122,-116.323546), new ArrayList<Integer>()
                        {{ add(823); add(930); add(1040); add(1140); add(1240); add(1340); add(1440); add(1540); }} ));
                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "Hewlett Packard", new LatLng(43.660122,-116.323546), new ArrayList<Integer>()
                        {{ add(823); add(940); add(1040); add(1140); add(1240); add(1340); add(1440); add(1540); }} ));
                    add(new Stop( "Five Mile & McMillion", new LatLng(43.648461,-116.314181), new ArrayList<Integer>()
                        {{ add(826); add(943); add(1043); add(1143); add(1243); add(1343); add(1443); add(1543); }} ));
                    add(new Stop( "Five Mile & Emerald", new LatLng(43.609968,-116.314313), new ArrayList<Integer>()
                        {{ add(834); add(951); add(1051); add(1151); add(1251); add(1351); add(1451); add(1551); }} ));
                    add(new Stop( "Town Square Mall P&R", new LatLng(43.577138,-116.213631), new ArrayList<Integer>()
                        {{ add(905); add(1005); add(1105); add(1205); add(1305); add(1405); add(1505); add(1605); }} ));
                }}
        ));
        mRoutes.add(new Route( 9, "State Street", Color.parseColor("#105BA2"), R.drawable.route_9_icon, R.drawable.route_9_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Zone 2 Main & 9th", new LatLng(43.61622,-116.204679), new ArrayList<Integer>()
                        {{ add(515); add(545); add(615); add(645); add(715); add(745); add(815); add(845); add(915); add(945); add(1015); add(1045); add(1115); add(1145); add(1215); add(1245); add(1315); add(1345); add(1415); add(1445); add(1515); add(1545); add(1615); add(1645); add(1715); add(1745); add(1815); }} ));
                    add(new Stop( "State & 17th", new LatLng(43.624047,-116.211142), new ArrayList<Integer>()
                        {{ add(520); add(550); add(620); add(650); add(720); add(750); add(820); add(850); add(920); add(950); add(1020); add(1050); add(1120); add(1150); add(1220); add(1250); add(1320); add(1350); add(1420); add(1450); add(1520); add(1550); add(1620); add(1650); add(1720); add(1750); add(1820); }} ));
                    add(new Stop( "State & Veterans Parkway", new LatLng(43.640035,-116.23499), new ArrayList<Integer>()
                        {{ add(525); add(555); add(625); add(655); add(725); add(755); add(825); add(855); add(925); add(955); add(1025); add(1055); add(1125); add(1155); add(1225); add(1255); add(1325); add(1355); add(1425); add(1455); add(1525); add(1555); add(1625); add(1655); add(1725); add(1755); add(1825); }} ));
                    add(new Stop( "State & Ellens Ferry", new LatLng(43.658797,-116.263646), new ArrayList<Integer>()
                        {{ add(530); add(600); add(630); add(700); add(730); add(750); add(830); add(900); add(930); add(1000); add(1030); add(1100); add(1130); add(1200); add(1230); add(1300); add(1330); add(1400); add(1430); add(1500); add(1530); add(1600); add(1630); add(1700); add(1730); add(1800); add(1830); }} ));
                    add(new Stop( "State & Glenwood", new LatLng(3.666445,-116.276486), new ArrayList<Integer>()
                        {{ add(535); add(605); add(635); add(705); add(735); add(805); add(835); add(905); add(935); add(1005); add(1035); add(1105); add(1135); add(1205); add(1235); add(1305); add(1335); add(1405); add(1435); add(1505); add(1535); add(1605); add(1635); add(1705); add(1735); add(1805); add(1835); }} ));
                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "State & Glenwood", new LatLng(3.666445,-116.276486), new ArrayList<Integer>()
                        {{ add(545); add(615); add(645); add(715); add(745); add(815); add(845); add(915); add(945); add(1015); add(1045); add(1115); add(1145); add(1215); add(1245); add(1315); add(1345); add(1415); add(1445); add(1515); add(1545); add(1615); add(1645); add(1715); add(1745); add(1815); add(1845); }} ));
                    add(new Stop( "State & Ellens Ferry", new LatLng(43.658797,-116.263646), new ArrayList<Integer>()
                        {{ add(548); add(618); add(648); add(718); add(748); add(818); add(848); add(918); add(948); add(1018); add(1048); add(1118); add(1148); add(1218); add(1248); add(1318); add(1348); add(1418); add(1448); add(1518); add(1548); add(1618); add(1648); add(1718); add(1748); add(1818); add(1848); }} ));
                    add(new Stop( "State & Veterans Parkway", new LatLng(43.640035,-116.23499), new ArrayList<Integer>()
                        {{ add(554); add(624); add(654); add(724); add(754); add(824); add(854); add(924); add(954); add(1024); add(1054); add(1124); add(1154); add(1224); add(1254); add(1324); add(1354); add(1424); add(1454); add(1524); add(1554); add(1624); add(1654); add(1724); add(1754); add(1824); add(1854); }} ));
                    add(new Stop( "State & 17th", new LatLng(43.624047,-116.211142), new ArrayList<Integer>()
                        {{ add(559); add(629); add(659); add(729); add(759); add(829); add(859); add(929); add(959); add(1029); add(1059); add(1129); add(1159); add(1229); add(1259); add(1329); add(1359); add(1429); add(1459); add(1529); add(1559); add(1629); add(1659); add(1729); add(1759); add(1829); add(1859); }} ));
                    add(new Stop( "Zone 2 Main & 9th", new LatLng(43.61622,-116.204679), new ArrayList<Integer>()
                        {{ add(605); add(635); add(705); add(735); add(805); add(835); add(905); add(935); add(1005); add(1035); add(1105); add(1135); add(1205); add(1235); add(1259); add(1335); add(1405); add(1435); add(1505); add(1535); add(1559); add(1635); add(1705); add(1735); add(1805); add(1835); add(1905); }} ));
                }}
        ));
        mRoutes.add(new Route( 10, "Hill Road - Maple Grove", Color.parseColor("#F3B36A"), R.drawable.route_10_icon, R.drawable.route_10_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Zone 2 Main & 9th", new LatLng(43.61622,-116.204679), new ArrayList<Integer>()
                        {{ add(545); add(645); add(745); add(845); add(945); add(1045); add(1145); add(1245); add(1345); add(1445); add(1545); add(1645); add(1745); }} ));
                    add(new Stop( "State & 17th", new LatLng(43.624047,-116.211142), new ArrayList<Integer>()
                        {{ add(548); add(648); add(748); add(848); add(948); add(1048); add(1148); add(1248); add(1348); add(1448); add(1548); add(1648); add(1748); }} ));
                    add(new Stop( "Taft & 28th", new LatLng(43.648079,-116.223293), new ArrayList<Integer>()
                        {{ add(555); add(655); add(755); add(855); add(955); add(1055); add(1155); add(1255); add(1355); add(1455); add(1555); add(1655); add(1755); }} ));
                    add(new Stop( "Collister & Hill", new LatLng(43.665964,-116.248322), new ArrayList<Integer>()
                        {{ add(600); add(700); add(800); add(900); add(1000); add(1100); add(1200); add(1300); add(1400); add(1500); add(1600); add(1700); add(1800); }} ));
                    add(new Stop( "Tobi & Pierce Park", new LatLng(43.675336,-116.268499), new ArrayList<Integer>()
                        {{ add(607); add(707); add(807); add(907); add(1007); add(1107); add(1207); add(1307); add(1407); add(1507); add(1607); add(1707); add(1807); }} ));
                    add(new Stop( "Gary & Bunch", new LatLng(43.675438,-116.279192), new ArrayList<Integer>()
                        {{ add(611); add(711); add(811); add(911); add(1011); add(1111); add(1211); add(1311); add(1411); add(1511); add(1611); add(1711); add(1811); }} ));
                    add(new Stop( "Goddard & Glenwood", new LatLng(43.64385,-116.277766), new ArrayList<Integer>()
                        {{ add(618); add(718); add(818); add(918); add(1018); add(1118); add(1218); add(1318); add(1418); add(1518); add(1618); add(1718); add(1818); }} ));
                    add(new Stop( "Maple Grove & Ustick", new LatLng(43.633917,-116.294163), new ArrayList<Integer>()
                        {{ add(623); add(723); add(823); add(923); add(1023); add(1123); add(1223); add(1323); add(1423); add(1523); add(1623); add(1723); add(1823); }} ));
                    add(new Stop( "Maple Grove & Fairview", new LatLng(43.619456,-116.294126), new ArrayList<Integer>()
                        {{ add(626); add(726); add(826); add(926); add(1026); add(1126); add(1226); add(1326); add(1426); add(1526); add(1626); add(1726); add(1826); }} ));
                    add(new Stop( "Town Square Mall P&R", new LatLng(43.577138,-116.213631), new ArrayList<Integer>()
                        {{ add(635); add(735); add(835); add(935); add(1035); add(1135); add(1235); add(1335); add(1435); add(1535); add(1635); add(1735); add(1835); }} ));
                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "Town Square Mall P&R", new LatLng(43.577138,-116.213631), new ArrayList<Integer>()
                        {{ add(645); add(745); add(845); add(945); add(1045); add(1145); add(1245); add(1345); add(1445); add(1545); add(1645); add(1745); add(1845); }} ));
                    add(new Stop( "Maple Grove & Fairview", new LatLng(43.619456,-116.294128), new ArrayList<Integer>()
                        {{ add(648); add(748); add(848); add(948); add(1048); add(1148); add(1248); add(1348); add(1448); add(1548); add(1648); add(1748); add(1848); }} ));
                    add(new Stop( "Maple Grove & Ustick", new LatLng(43.633917,-116.294163), new ArrayList<Integer>()
                        {{ add(650); add(750); add(850); add(950); add(1050); add(1150); add(1250); add(1350); add(1450); add(1550); add(1650); add(1750); add(1850); }} ));
                    add(new Stop( "Goddard & Glenwood", new LatLng(43.64385,-116.277766), new ArrayList<Integer>()
                        {{ add(653); add(753); add(853); add(953); add(1053); add(1153); add(1253); add(1353); add(1453); add(1535); add(1653); add(1753); add(1853); }} ));
                    add(new Stop( "Gary & Bunch", new LatLng(43.675438,-116.279192), new ArrayList<Integer>()
                        {{ add(700); add(800); add(900); add(1000); add(1100); add(1200); add(1300); add(1400); add(1500); add(1600); add(1700); add(1800); add(1900); }} ));
                    add(new Stop( "Tobi & Pierce Park", new LatLng(43.675336,-116.268499), new ArrayList<Integer>()
                        {{ add(707); add(807); add(907); add(1007); add(1107); add(1207); add(1307); add(1407); add(1507); add(1607); add(1707); add(1807); add(1907); }} ));
                    add(new Stop( "Hill & Collister", new LatLng(43.665964,-116.248322), new ArrayList<Integer>()
                        {{ add(714); add(814); add(914); add(1014); add(1114); add(1214); add(1314); add(1414); add(1514); add(1614); add(1714); add(1814); add(1914); }} ));
                    add(new Stop( "Taft & 28th", new LatLng(43.648079,-116.223293), new ArrayList<Integer>()
                        {{ add(721); add(821); add(921); add(1021); add(1121); add(1221); add(1321); add(1421); add(1521); add(1621); add(1721); add(1821); add(1921); }} ));
                    add(new Stop( "State & 17th", new LatLng(43.624047,-116.211142), new ArrayList<Integer>()
                        {{ add(728); add(828); add(928); add(1028); add(1128); add(1228); add(1328); add(1428); add(1528); add(1628); add(1728); add(1828); add(1928); }} ));
                    add(new Stop( "Zone 2 Main & 9th", new LatLng(43.61622,-116.204679), new ArrayList<Integer>()
                        {{ add(740); add(840); add(940); add(1040); add(1140); add(1240); add(1340); add(1440); add(1540); add(1640); add(1740); add(1840); add(1940); }} ));
                }}
        ));
        mRoutes.add(new Route( 11, "Garden City", Color.parseColor("#C43E4E"), R.drawable.route_11_icon, R.drawable.route_11_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Zone 2 Main & 9th", new LatLng(43.61622,-116.204679), new ArrayList<Integer>()
                        {{ add(945); add(1045); add(1145); add(1245); add(1345); add(1445); }} ));
                    add(new Stop( "Main & 30th", new LatLng(43.621812,-116.227668), new ArrayList<Integer>()
                        {{ add(950); add(1050); add(1150); add(1250); add(1350); add(1450); }} ));
                    add(new Stop( "50th & Sawyer", new LatLng(43.643801,-116.265435), new ArrayList<Integer>()
                        {{ add(1001); add(1101); add(1201); add(1301); add(1401); add(1501); }} ));

                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "50th & Sawyer", new LatLng(43.643801,-116.265435), new ArrayList<Integer>()
                        {{ add(1001); add(1101); add(1201); add(1301); add(1401); add(1501); }} ));
                    add(new Stop( "Fairview & 17th", new LatLng(43.620525,-116.214535), new ArrayList<Integer>()
                        {{ add(1007); add(1107); add(1207); add(1307); add(1407); add(1507); }} ));
                    add(new Stop( "Zone 2 Main & 9th", new LatLng(43.61622,-116.204679), new ArrayList<Integer>()
                        {{ add(1014); add(1114); add(1214); add(1314); add(1414); add(1514); }} ));

                }}
        ));
        mRoutes.add(new Route( 14, "Hyde Park", Color.parseColor("#CD9E66"), R.drawable.route_14_icon, R.drawable.route_14_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Zone 2 Main & 9th", new LatLng(43.61622,-116.204679), new ArrayList<Integer>()
                        {{ add(545); add(615); add(645); add(715); add(745); add(815); add(845); add(915); add(1015); add(1115); add(1215); add(1315); add(1415); add(1515); add(1545); add(1615); add(1645); add(1715); add(1745); add(1815); }} ));
                    add(new Stop( "Fort & 13th", new LatLng(43.624722,-116.203491), new ArrayList<Integer>()
                        {{ add(550); add(620); add(650); add(720); add(750); add(820); add(850); add(920); add(1020); add(1120); add(1220); add(1320); add(1420); add(1520); add(1550); add(1620); add(1650); add(1720); add(1750); add(1820); }} ));
                    add(new Stop( "Bogus Basin & Parkhill", new LatLng(43.644249,-116.206368), new ArrayList<Integer>()
                        {{ add(555); add(625); add(655); add(725); add(755); add(825); add(855); add(925); add(1025); add(1125); add(1225); add(1325); add(1425); add(1525); add(1555); add(1625); add(1650); add(1720); add(1750); add(1820); }} ));
                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "Bogus Basin & Parkhill", new LatLng(43.644249,-116.206368), new ArrayList<Integer>()
                        {{ add(555); add(625); add(655); add(725); add(755); add(825); add(855); add(925); add(1025); add(1125); add(1225); add(1325); add(1425); add(1525); add(1555); add(1625); add(1650); add(1720); add(1750); add(1820); }} ));
                    add(new Stop( "Fort & 13th", new LatLng(43.624722,-116.203491), new ArrayList<Integer>()
                        {{ add(600); add(630); add(700); add(730); add(800); add(830); add(900); add(1000); add(1100); add(1200); add(1300); add(1400); add(1300); add(1530); add(1600); add(1630); add(1700); add(1730); add(1800); add(1830); }} ));
                    add(new Stop( "Zone 2 Main & 9th", new LatLng(43.61622,-116.204679), new ArrayList<Integer>()
                        {{ add(605); add(635); add(705); add(735); add(805); add(835); add(905); add(1005); add(1105); add(1205); add(1305); add(1405); add(1305); add(1535); add(1605); add(1635); add(1705); add(1735); add(1805); add(1835); }} ));

                }}
        ));
        mRoutes.add(new Route( 16, "VA Shuttle", Color.parseColor("#A46722"), R.drawable.route_16_icon, R.drawable.route_16_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Zone 3 Main & 8th", new LatLng(43.615023,-116.202498), new ArrayList<Integer>()
                        {{ add(615); add(715); add(815); add(915); add(1015); add(1115); add(1215); add(1315); add(1415); add(1515); add(1615); add(1715); add(1815); }} ));
                    add(new Stop( "Collins & VA Medical Center", new LatLng(43.619412,-116.190435), new ArrayList<Integer>()
                        {{ add(620); add(720); add(820); add(920); add(1020); add(1120); add(1220); add(1320); add(1420); add(1520); add(1620); add(1720); add(1820); }} ));
                    add(new Stop( "Washington & Coston", new LatLng(43.608061,-116.174829), new ArrayList<Integer>()
                        {{ add(625); add(725); add(825); add(925); add(1025); add(1125); add(1225); add(1325); add(1425); add(1525); add(1625); add(1725); add(1825); }} ));
                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "Washington & Coston", new LatLng(43.608061,-116.174829), new ArrayList<Integer>()
                        {{ add(625); add(725); add(825); add(925); add(1025); add(1125); add(1225); add(1325); add(1425); add(1525); add(1625); add(1725); add(1825); }} ));
                    add(new Stop( "Idaho & 1st", new LatLng(443.612211,-116.194524), new ArrayList<Integer>()
                        {{ add(630); add(730); add(830); add(930); add(1030); add(1130); add(1230); add(1330); add(1430); add(1530); add(1630); add(1730); add(1830); }} ));
                    add(new Stop( "Zone 3 Main & 8th", new LatLng(43.615023,-116.202498), new ArrayList<Integer>()
                        {{ add(640); add(740); add(840); add(940); add(1040); add(1140); add(1240); add(1340); add(1440); add(1540); add(1640); add(1740); add(1840); }} ));
                }}
        ));
        mRoutes.add(new Route( 17, "Warm Springs", Color.parseColor("#A46722"), R.drawable.route_17_icon, R.drawable.route_17_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Zone 3 Main & 8th", new LatLng(43.615023,-116.202498), new ArrayList<Integer>()
                        {{ add(645); add(745); add(845); add(945); add(1045); add(1145); add(1245); add(1345); add(1445); add(1545); add(1645); add(1745); }} ));
                    add(new Stop( "Walnut & Park", new LatLng(43.602523,-116.186329), new ArrayList<Integer>()
                        {{ add(650); add(750); add(850); add(950); add(1050); add(1150); add(1250); add(1350); add(1450); add(1550); add(1650); add(1750); }} ));
                    add(new Stop( "Old Penitentiary", new LatLng(43.60141,-116.166619), new ArrayList<Integer>()
                        {{ add(655); add(755); add(855); add(955); add(1055); add(1155); add(1255); add(1355); add(1455); add(1555); add(1655); add(1755); }} ));
                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "Old Penitentiary", new LatLng(43.60141,-116.166619), new ArrayList<Integer>()
                        {{ add(655); add(755); add(855); add(955); add(1055); add(1155); add(1255); add(1355); add(1455); add(1555); add(1655); add(1755); }} ));
                    add(new Stop( "Warm Springs & Ave. C", new LatLng(43.610694,-116.190956), new ArrayList<Integer>()
                        {{ add(700); add(800); add(900); add(1000); add(1100); add(1200); add(1300); add(1400); add(1500); add(1600); add(1700); add(1800); }} ));
                    add(new Stop( "Zone 3 Main & 8th", new LatLng(43.615023,-116.202498), new ArrayList<Integer>()
                        {{ add(710); add(810); add(910); add(1010); add(1110); add(1210); add(1310); add(1410); add(1510); add(1610); add(1710); add(1810); }} ));

                }}
        ));
        mRoutes.add(new Route( 28, "Cole - Victory", Color.parseColor("#4E1B4E"), R.drawable.route_28_icon, R.drawable.route_28_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Town Square Mall P&R", new LatLng(43.577138,-116.213631), new ArrayList<Integer>()
                        {{ add(740); add(845); add(945); add(1045); add(1145); add(1245); add(1345); add(1445); add(1545); add(1645); add(1745); add(1845); }} ));
                    add(new Stop( "Social Security Office @ Vinell", new LatLng(43.593317,-116.286029), new ArrayList<Integer>()
                        {{ add(855); add(955); add(1055); add(1155); add(1255); add(1355); add(1455); add(1555); add(1655); add(1755); add(1855); }} ));
                    add(new Stop( "Frank Church School", new LatLng(43.571066,-116.283878), new ArrayList<Integer>()
                        {{ add(755); add(910); add(1010); add(1110); add(1210); add(1310); add(1410); add(1510); add(1610); add(1710); add(1810); add(1910); }} ));
                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "Frank Church School", new LatLng(43.571066,-116.283878), new ArrayList<Integer>()
                        {{ add(710); add(810); add(910); add(1010); add(1110); add(1210); add(1310); add(1410); add(1510); add(1610); add(1710); add(1810); }} ));
                    add(new Stop( "Social Security Office @ Vinell", new LatLng(43.593317,-116.286029), new ArrayList<Integer>()
                        {{ add(721); add(821); add(921); add(1021); add(1121); add(1221); add(1321); add(1421); add(1521); add(1621); add(1721); add(1821); }} ));
                    add(new Stop( "Frank Church School", new LatLng(43.571066,-116.283878), new ArrayList<Integer>()
                        {{ add(736); add(836); add(936); add(1036); add(1136); add(1236); add(1336); add(1436); add(1536); add(1636); add(1736); add(1836); }} ));
                }}
        ));
        mRoutes.add(new Route( 29, "Overland", Color.parseColor("#4AA04E"), R.drawable.route_29_icon, R.drawable.route_29_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "BSU Admin. Building", new LatLng(43.603102,-116.204923), new ArrayList<Integer>()
                        {{ add(645); add(715); add(745); add(815); add(845); add(915); add(1015); add(1115); add(1215); add(1315); add(1415); add(1515); add(1545); add(1615); add(1645); add(1715); add(1745); add(1815); add(1845); }} ));
                    add(new Stop( "Overland & Vista", new LatLng(43.589858,-116.213683), new ArrayList<Integer>()
                        {{ add(650); add(720); add(750); add(820); add(850); add(920); add(1020); add(1120); add(1220); add(1320); add(1420); add(1520); add(1550); add(1620); add(1650); add(1720); add(1750); add(1820); add(1850); }} ));
                    add(new Stop( "Overland & Orchard", new LatLng(43.589767,-116.243613), new ArrayList<Integer>()
                        {{ add(655); add(725); add(755); add(825); add(855); add(925); add(1025); add(1125); add(1225); add(1325); add(1425); add(1525); add(1555); add(1625); add(1655); add(1725); add(1755); add(1825); add(1850); }} ));
                    add(new Stop( "Overland & Cole", new LatLng(43.590287,-116.274119), new ArrayList<Integer>()
                        {{ add(700); add(730); add(800); add(830); add(900); add(930); add(1030); add(1130); add(1230); add(1330); add(1430); add(1530); add(1600); add(1630); add(1700); add(1730); add(1800); add(1830); add(1850); }} ));
                    add(new Stop( "Town Square Mall P&R", new LatLng(43.577138,-116.213631), new ArrayList<Integer>()
                        {{ add(705); add(735); add(805); add(835); add(905); add(935); add(1035); add(1135); add(1235); add(1335); add(1435); add(1535); add(1605); add(1635); add(1700); add(1735); add(1800); add(1835); add(1850); }} ));
                }},
                new ArrayList<Stop>() {{
                    add(new Stop( "Town Square Mall P&R", new LatLng(43.577138,-116.213631), new ArrayList<Integer>()
                        {{ add(645); add(715); add(745); add(815); add(845); add(915); add(1015); add(1115); add(1215); add(1315); add(1415); add(1515); add(1545); add(1615); add(1645); add(1715); add(1745); add(1815); add(1845); }} ));
                    add(new Stop( "Overland & Cole", new LatLng(43.590287,-116.274119), new ArrayList<Integer>()
                        {{ add(650); add(720); add(750); add(820); add(850); add(920); add(1020); add(1120); add(1220); add(1320); add(1420); add(1520); add(1550); add(1620); add(1650); add(1720); add(1750); add(1820); add(1850); }} ));
                    add(new Stop( "Overland & Orchard", new LatLng(43.589767,-116.243613), new ArrayList<Integer>()
                        {{ add(655); add(725); add(755); add(825); add(855); add(925); add(1025); add(1125); add(1225); add(1325); add(1425); add(1525); add(1555); add(1625); add(1655); add(1725); add(1755); add(1825); add(1850); }} ));
                    add(new Stop( "Overland & Vista", new LatLng(43.589858,-116.213683), new ArrayList<Integer>()
                        {{ add(700); add(730); add(800); add(830); add(900); add(930); add(1030); add(1130); add(1230); add(1330); add(1430); add(1530); add(1600); add(1630); add(1700); add(1730); add(1800); add(1830); add(1850); }} ));
                    add(new Stop( "BSU Admin. Building", new LatLng(43.603102,-116.204923), new ArrayList<Integer>()
                        {{ add(705); add(735); add(805); add(835); add(905); add(935); add(1035); add(1135); add(1235); add(1335); add(1435); add(1535); add(1605); add(1635); add(1700); add(1735); add(1800); add(1835); add(1850); }} ));
                }}
        ));
		mRoutes.add(new Route( 40, "Meridian Express", Color.parseColor("#4AA04E"), R.drawable.route_40_icon, R.drawable.route_40_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Happy Day Transit Center", new LatLng(43.627012,-116.634944), new ArrayList<Integer>()
                        {{ add(520); add(555); add(625); add(655); add(1440); add(1510); add(1540); }} ));
                    add(new Stop( "CWI P&R", new LatLng(43.614984,-116.507178), new ArrayList<Integer>()
                        {{ add(543); add(618); add(648); add(718); add(1503); add(1533); add(1603); add(1639); }} ));
                    add(new Stop( "Country Terrace P&R", new LatLng(43.591558,-116.392537), new ArrayList<Integer>()
                        {{ add(558); add(633); add(703); add(733); add(1516); add(1546); add(1616); add(1652); }} ));
                    add(new Stop( "Main & 9th", new LatLng(43.61626,-116.204683), new ArrayList<Integer>()
                        {{ add(618); add(653); add(723); add(753); add(1536); add(1606); add(1636); add(1712); }} ));
                    add(new Stop( "Main & 1st", new LatLng(43.611531,-116.195482), new ArrayList<Integer>()
                        {{ add(622); add(627); add(727); add(757); add(1540); add(1610); add(1640); add(1716); }} ));
					add(new Stop( "BSU Admin. Building", new LatLng(43.6031,-116.204915), new ArrayList<Integer>()
						{{ add(629); add(704); add(734); add(804); add(1547); add(1617); add(1647); add(1723); add(1639); }} ));
                }},
				new ArrayList<Stop>() {{
                    add(new Stop( "University & Joyce", new LatLng(43.6031,-116.204915), new ArrayList<Integer>()
                        {{ add(712); add(742); add(812); add(1555); add(1625); add(1655); add(1731); }} ));
                    add(new Stop( "Idaho & 1st", new LatLng(43.61204,-116.194503), new ArrayList<Integer>()
                        {{ add(719); add(749); add(819); add(1602); add(1632); add(1702); add(1738); }} ));
                    add(new Stop( "Idaho & 8th", new LatLng(43.616528,-116.202936), new ArrayList<Integer>()
                        {{ add(723); add(753); add(823); add(1606); add(1636); add(1706); add(1742); }} ));
                    add(new Stop( "Country Terrace P&R", new LatLng(43.591558,-116.392537), new ArrayList<Integer>()
                        {{ add(743); add(813); add(843); add(1626); add(1656); add(1726); add(1802); }} ));
                    add(new Stop( "CWI P&R", new LatLng(43.614984,-116.507178), new ArrayList<Integer>()
                        {{ add(758); add(828); add(858); add(1639); add(1709); add(1739); add(1815); }} ));
					add(new Stop( "Happy Day Transit Center", new LatLng(43.627012,-116.634944), new ArrayList<Integer>()
                        {{ add(819); add(849); add(919); add(1730); add(1800); add(1836); }} ));
                }}
        ));
		mRoutes.add(new Route( 42, "", Color.parseColor("#4AA04E"), R.drawable.route_40_icon, R.drawable.route_40_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Happy Day Transit Center", new LatLng(43.627012,-116.634944), new ArrayList<Integer>()
                        {{ add(630); add(730); add(1530); }} ));
                    add(new Stop( "College of Western Idaho", new LatLng(43.614984,-116.507178), new ArrayList<Integer>()
                        {{ add(646); add(746); add(916); add(1046); add(1246); add(1446); add(1546); add(1716); }} ));
                    add(new Stop( "Progress & Corporate", new LatLng(43.598937,-116.390604), new ArrayList<Integer>()
                        {{ add(700); add(800); add(930); add(1100); add(1300); add(1500); add(1600); add(1730); }} ));
					add(new Stop( "Franklin and Eagle", new LatLng(43.604798,-116.355187), new ArrayList<Integer>()
                        {{ add(715); add(815); add(945); add(1115); add(1315); add(1515); add(1615); add(1745); }} ));
					add(new Stop( "Overland & Silverstone", new LatLng(43.590472,-116.349457), new ArrayList<Integer>()
                        {{ add(722); add(822); add(952); add(1122); add(1322); add(1522); add(1622); add(1752); }} ));
					add(new Stop( "Overland & Clear Creek", new LatLng(43.590148,-116.317172), new ArrayList<Integer>()
                        {{ add(724); add(824); add(952); add(1124); add(1322); add(1524); add(1624); add(1754); }} ));
					add(new Stop( "Maple Grove & Overland", new LatLng(43.590476,-116.29425), new ArrayList<Integer>()
                        {{ add(729); add(829); add(959); add(1129); add(1329); add(1529); add(1629); add(1759); }} ));
					add(new Stop( "Towne Square Mall P&R", new LatLng(43.610876,-116.276532), new ArrayList<Integer>()
                        {{ add(735); add(835); add(1005); add(1135); add(1335); add(1535); add(1635); add(1805); }} ));
                    add(new Stop( "Main & 9th", new LatLng(43.61626,-116.204683), new ArrayList<Integer>()
                        {{ add(750); add(850); add(450); }} ));
                    add(new Stop( "Main & 1st", new LatLng(43.611531,-116.195482), new ArrayList<Integer>()
                        {{ add(752); add(852); add(452); }} ));
					add(new Stop( "BSU Admin. Building", new LatLng(43.6031,-116.204915), new ArrayList<Integer>()
						{{ add(758); add(858); add(458); }} ));
                }},
				new ArrayList<Stop>() {{
                    add(new Stop( "University & Joyce", new LatLng(43.6031,-116.204915), new ArrayList<Integer>()
                        {{ add(807); add(907); add(1707); }} ));
                    add(new Stop( "Idaho & 1st", new LatLng(43.61204,-116.194503), new ArrayList<Integer>()
                        {{ add(813); add(913); add(1513); }} ));
                    add(new Stop( "Idaho & 8th", new LatLng(43.616528,-116.202936), new ArrayList<Integer>()
                        {{ add(815); add(915); add(1515); }} ));
					add(new Stop( "Towne Square Mall P&R", new LatLng(43.610876,-116.276532), new ArrayList<Integer>()
                        {{ add(830); add(930); add(1015); add(1145); add(1345); add(1545); add(1730); add(1815); }} ));
                    add(new Stop( "Maple Grove & Overland", new LatLng(43.590476,-116.29425), new ArrayList<Integer>()
                        {{ add(838); add(938); add(1024); add(1154); add(1358); add(1558); add(1742); add(1828); }} ));
					add(new Stop( "Overland & Clear Creek", new LatLng(43.590361,-116.316926), new ArrayList<Integer>()
                        {{ add(842); add(942); add(1028); add(1158); add(1358); add(1558); add(1742); add(1828); }} ));
					add(new Stop( "Overland & Silverstone", new LatLng(43.590472,-116.349457), new ArrayList<Integer>()
                        {{ add(845); add(945); add(1031); add(1201); add(1401); add(1601); add(1745); add(1831); }} ));
					add(new Stop( "Franklin and Eagle", new LatLng(43.604798,-116.355187), new ArrayList<Integer>()
                        {{ add(850); add(950); add(1036); add(1206); add(1406); add(1606); add(1750); add(1836); }} ));
					add(new Stop( "Progress & Corporate", new LatLng(43.598937,-116.390604), new ArrayList<Integer>()
                        {{ add(901); add(1001); add(1047); add(1217); add(1417); add(1617); add(1801); add(1847); }} ));
                    add(new Stop( "College of Western Idaho", new LatLng(43.614984,-116.507178), new ArrayList<Integer>()
                        {{ add(915); add(1015); add(1101); add(1231); add(1431); add(1631); add(1815); add(1901); }} ));
					add(new Stop( "Happy Day Transit Center", new LatLng(43.627012,-116.634944), new ArrayList<Integer>()
                        {{ add(1831); add(1917); }} ));
                }}
        ));
		mRoutes.add(new Route( 43, "Caldwell Express", Color.parseColor("#4AA04E"), R.drawable.route_43_icon, R.drawable.route_43_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "10th & Larkspur Ct.", new LatLng(43.640556,-116.693184), new ArrayList<Integer>()
                        {{ add(630); add(700); }} ));
                    add(new Stop( "Franklin Rd P&R", new LatLng(43.610876,-116.276532), new ArrayList<Integer>()
                        {{ add(639); add(709); }} ));
                    add(new Stop( "Main & 9th", new LatLng(43.61626,-116.204683), new ArrayList<Integer>()
                        {{ add(712); add(742); }} ));
                    add(new Stop( "Main & 1st", new LatLng(43.611531,-116.195482), new ArrayList<Integer>()
                        {{ add(716); add(746); }} ));
                    add(new Stop( "BSU Admin Building", new LatLng(43.6031,-116.204915), new ArrayList<Integer>()
                        {{ add(723); add(753); }} ));
					add(new Stop( "University and Brady", new LatLng(43.604673,-116.2081), new ArrayList<Integer>()
						{{ add(730); add(800); }} ));
                }},
				new ArrayList<Stop>() {{
                    add(new Stop( "University and Earle", new LatLng(43.60492,-116.209688), new ArrayList<Integer>()
                        {{ add(1640); add(1710); }} ));
                    add(new Stop( "University & Joyce", new LatLng(43.6031,-116.204915), new ArrayList<Integer>()
                        {{ add(1644); add(1714); }} ));
                    add(new Stop( "Idaho & 1st", new LatLng(43.61204,-116.194503), new ArrayList<Integer>()
                        {{ add(1651); add(1721); }} ));
                    add(new Stop( "Idaho & 8th", new LatLng(43.616528,-116.202936), new ArrayList<Integer>()
                        {{ add(1656); add(1725); }} ));
                    add(new Stop( "Franklin Rd P&R", new LatLng(43.610876,-116.276532), new ArrayList<Integer>()
                        {{ add(1729); add(1759); }} ));
					add(new Stop( "10th & Larkspur Ct.", new LatLng(43.640556,-116.693184), new ArrayList<Integer>()
						{{ add(1737); add(1800); }} ));
                }}
        ));
		mRoutes.add(new Route( 44, "Hwy. 44 Express", Color.parseColor("#4AA04E"), R.drawable.route_44_icon, R.drawable.route_44_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "Happy Day Transit Center", new LatLng(43.627012,-116.634944), new ArrayList<Integer>()
                        {{ add(620); }} ));
					add(new Stop( "Franklin Rd P&R", new LatLng(43.610876,-116.276532), new ArrayList<Integer>()
						{{ add(630); }} ));
					add(new Stop( "Middleton Fine Arts Center", new LatLng(43.706381,-116.624902), new ArrayList<Integer>()
						{{ add(644); }} ));
					add(new Stop( "LifeSpring Christian Church", new LatLng(43.693088,-116.493123), new ArrayList<Integer>()
						{{ add(657); }} ));
					add(new Stop( "Eagle Riverside", new LatLng(43.68819,-116.335902), new ArrayList<Integer>()
						{{ add(711); }} ));
					add(new Stop( "32nd & State Street", new LatLng(43.635374,-116.228692), new ArrayList<Integer>()
						{{ add(733); }} ));
					add(new Stop( "Main & 9th", new LatLng(43.61626,-116.204683), new ArrayList<Integer>()
						{{ add(745); }} ));
					add(new Stop( "Park and Broadway", new LatLng(43.606415,-116.19359), new ArrayList<Integer>()
						{{ add(749); }} ));
					add(new Stop( "BSU Admin Building", new LatLng(43.6031,-116.204915), new ArrayList<Integer>()
						{{ add(755); }} ));
					add(new Stop( "University and Brady", new LatLng(43.604673,-116.2081), new ArrayList<Integer>()
						{{ add(800); }} ));
                }},
				new ArrayList<Stop>() {{
					add(new Stop( "University and Earle", new LatLng(43.60492,-116.209688), new ArrayList<Integer>()
						{{ add(505); }} ));
					add(new Stop( "University & Joyce", new LatLng(43.6031,-116.204915), new ArrayList<Integer>()
						{{ add(510); }} ));
					add(new Stop( "Park and Broadway", new LatLng(43.606415,-116.19359), new ArrayList<Integer>()
						{{ add(514); }} ));
					add(new Stop( "Idaho & 8th", new LatLng(43.616528,-116.202936), new ArrayList<Integer>()
						{{ add(518); }} ));
					add(new Stop( "33rd & State Street", new LatLng(43.636199,-116.22944), new ArrayList<Integer>()
						{{ add(529); }} ));
					add(new Stop( "Eagle Riverside", new LatLng(43.68819,-116.335902), new ArrayList<Integer>()
						{{ add(545); }} ));
					add(new Stop( "LifeSpring Christian Church", new LatLng(43.693088,-116.493123), new ArrayList<Integer>()
						{{ add(606); }} ));
					add(new Stop( "Middleton Fine Arts Center", new LatLng(43.706381,-116.624902), new ArrayList<Integer>()
						{{ add(617); }} ));
					add(new Stop( "Franklin Rd P&R", new LatLng(43.610876,-116.276532), new ArrayList<Integer>()
						{{ add(630); }} ));
					add(new Stop( "Happy Day Transit Center", new LatLng(43.627012,-116.634944), new ArrayList<Integer>()
                        {{ add(640); }} ));
                }}
        ));
		mRoutes.add(new Route( 45, "BSU Express", Color.parseColor("#4AA04E"), R.drawable.route_45_icon, R.drawable.route_45_map,
                new ArrayList<Stop>() {{
                    add(new Stop( "College of Western Idaho", new LatLng(43.614984,-116.507178), new ArrayList<Integer>()
                        {{ add(900); add(1000); add(1300); add(1400); add(1600); add(1730); add(1900); }} ));
                    add(new Stop( "Myrtle & 9th", new LatLng(43.61323,-116.207811), new ArrayList<Integer>()
                        {{ add(920); add(1020); add(1320); add(1420); add(1620); add(1750); add(1920); }} ));
					add(new Stop( "BSU Admin. Building", new LatLng(43.6031,-116.204915), new ArrayList<Integer>()
						{{ add(925); add(1025); add(1325); add(1425); add(1625); add(1755); add(1925); }} ));
                }},
				new ArrayList<Stop>() {{
                    add(new Stop( "University & Joyce", new LatLng(43.6031,-116.204915), new ArrayList<Integer>()
                        {{ add(930); add(1030); add(1330); add(1430); add(1630); add(1800); add(1930); }} ));
                    add(new Stop( "Front & 3rd", new LatLng(43.61028,-116.19804), new ArrayList<Integer>()
                        {{ add(933); add(1033); add(1333); add(1433); add(1633); add(1803); add(1933); }} ));
                    add(new Stop( "Front & 9th", new LatLng(43.61469,-116.205885), new ArrayList<Integer>()
                        {{ add(935); add(1035); add(1335); add(1435); add(1635); add(1805); add(1935); }} ));
                    add(new Stop( "College of Western Idaho", new LatLng(43.614984,-116.507178), new ArrayList<Integer>()
                        {{ add(954); add(1054); add(1354); add(1454); add(1654); add(1824); add(1954); }} ));
                }}
        ));
    }

    public static Routes get(Context c){
        if (sRoutes == null) {
                sRoutes = new Routes(c.getApplicationContext());
        }
        return sRoutes;
    }

    public ArrayList<Route> getRoutes() {
        return mRoutes;
    }

    public Route getRouteByRouteNumber(int routeNumber){
        for ( Route r : mRoutes) {
            if (r.getRouteNumber() == routeNumber){
                return r;
            }
        }
        return null;
    }

    public Stop getStopByRouteNumberAndId(int routeNumber, UUID stopId){
        for ( Route r : mRoutes) {
            if (r.getRouteNumber() == routeNumber){
                for (Stop s : r.getInBoundStops()){
                    if (s.getId() == stopId){
                        return s;
                    }
                }
                for (Stop s : r.getOutBoundStops()){
                    if (s.getId() == stopId){
                        return s;
                    }
                }
            }
        }
        return null;
    }
}