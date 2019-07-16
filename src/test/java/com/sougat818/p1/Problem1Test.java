package com.sougat818.p1;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem1Test {

  Problem1 problem1;

  @Before
  public void setUp() {
    problem1 = new Problem1();

  }

  @Test
  public void testSolution1() {
    String a = "<h1>Nayeem loves counseling</h1>";

    ArrayList<String> result = problem1.solution(a);

    Assert.assertEquals("Nayeem loves counseling", result.get(0));
    Assert.assertEquals(1, result.size());
  }

  @Test
  public void testSolution2() {
    String a = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";

    ArrayList<String> result = problem1.solution(a);

    Assert.assertEquals("Sanjay has no watch", result.get(0));
    Assert.assertEquals("So wait for a while", result.get(1));
    Assert.assertEquals(2, result.size());
  }

  @Test
  public void testSolution3() {
    String a = "<Amee>safat codes like a ninja</amee>";

    ArrayList<String> result = problem1.solution(a);
    Assert.assertEquals("None", result.get(0));

    Assert.assertEquals(1, result.size());

  }

  @Test
  public void testSolution4() {
    String a = "<SA premium>Imtiaz has a secret crush</SA premium>";

    ArrayList<String> result = problem1.solution(a);

    Assert.assertEquals("Imtiaz has a secret crush", result.get(0));
    Assert.assertEquals(1, result.size());
  }

  @Test
  public void testSolution5() {
    String a = "<>hello</>";

    ArrayList<String> result = problem1.solution(a);
    Assert.assertEquals("None", result.get(0));

    Assert.assertEquals(1, result.size());
  }


  @Test
  public void testSolution6() {
    String a = "hfBOjFgJbKv8AsQ7VPb^l@VkMyBV#Tpjqm02^$t)*xy7KHFbnoMEch<rgSp^#oM(1_Q5Mkts1q84z1=Iedzf{EJ$AN1$whF17 M})xpLx+F>KiXorVH#*DE%TnM~IjGwImQo7ATx d+LLAgVj^t$&33FZ}Q~_JWYvRyzKvjbP</rgSp^#oM(1_Q5Mkts1q84z1=Iedzf{EJ$AN1$whF17 M})xpLx+F>VPGfHhbJfnN4~2(_liZ=PNFK9+1S*(Q&BI{o@R4<WLrEEiNeSxe_CefW3bgn11qSPvyj7#q>XsXUWgpXrj</WLrEEiNeSxe_CefW3bgn11qSPvyj7#q><ZzHJdOlGzjKPyH{uYr%iTCM`G( mq=#T-as})U6q><ZTNwhpAVYzXLpumxjtG2Q3u}`xPC5qfN>jxOqH{xp)D8=&sFEjSgI4iae2T</ZTNwhpAVYzXLpumxjtG2Q3u}`xPC5qfN>mPsbSwZKzPvmcZMcW<afmVnWgLpAgkkC(OIJ4OgxLwPlVbEYAZN3&F*cBjH$piI5%V2Dix%A7n><TdHbzf&d#`0B{uyO}OJOA##U4R$SO^U@P7iwAXxI^_$4uAmOd)><hkbnCx$U4i2FvSO$FgWqsOzy%HNQyXGtbKK&%uL\"WBWX@-*9RXT><evTQXm12fdbbL@(&Tb%vAcfkZ6j\"3^-z87XM6cY3-)~x%dSGdQZ3></evTQXm12fdbbL@(&Tb%vAcfkZ6j\"3^-z87XM6cY3-)~x%dSGdQZ3></hkbnCx$U4i2FvSO$FgWqsOzy%HNQyXGtbKK&%uL\"WBWX@-*9RXT>nJBoXNYbfquWfBJhuay</TdHbzf&d#`0B{uyO}OJOA##U4R$SO^U@P7iwAXxI^_$4uAmOd)></afmVnWgLpAgkkC(OIJ4OgxLwPlVbEYAZN3&F*cBjH$piI5%V2Dix%A7n><uHs@eRQOHaU$a_Xn$xBOu7~Dj5W3><YhGfP\"Vl=)riHvm6AXQL0\"({A3wd\"XKB~0GrdWN\"OH><tPdtjPvqZrT7z$0p&Khbv></tPdtjPvqZrT7z$0p&Khbv><uUAL8ZK@wC`y\"7gCN^$ZpJl^^^PZPh^V37IT85Sp-UB><uOtKUgfnOTSg2C&qg7Y@BY>wWMHTQ}(+Fte}`0fhp^ms08LQ&QkCY*OSb~Mol)T(z0Xb&+8U3V@3KTRDvlyFrjkhCfaLrm</uUAL8ZK@wC`y\"7gCN^$ZpJl^^^PZPh^V37IT85Sp-UB><qmxzKpOBmP9o~KuOjX\"U_nP7%2_(3 *)0UL_Tr-9l}v>oiuJQZvt3%9F@=`AxLvbrWwvXUQ$ptvKNOZ\"mm5=*Ay5IDlA1^12Ak2zMLKdVZxnhlOAOKDFdunxUvVe</qmxzKpOBmP9o~KuOjX\"U_nP7%2_(3 *)0UL_Tr-9l}v><FZzfyPeoWjdjuU(t} fXKt)%vHdsjZTuvHvlm0+Q@7X50TF%g&%nFjlQ3kN4C>dNWzmGRGvgkD^r9AI@PMSbAFMwoL#\"wW7o\"0v*t+Ohb+ZuocE-iM$n@y3e$%wB^\"fsieQQQdahub4lTZ+MzN5 jQ1`@PNmPWtEWKcv}_t ~&4p$wyp7xf5Ym6pUU7~unrNZN%%gAgx){eZvZoYM}mBLWuo<mZzXAWxiStzlDY0#$_v`mz%M14=kW@Xc+)nY)jM^ZigOTGNym=MB__m7m9takvFs3>aZbVFKPsBir90U5yHq6S%(+54a&Z9H9nsus-K=yz}5mI)1y8AfLD$fM8S^oUKJrWfGYeXQWW<XpIvgtCy97L^R(&9vzCHs-cnXr_y(w_lxtYoV#->JFThSgCUmLaOUQGH</XpIvgtCy97L^R(&9vzCHs-cnXr_y(w_lxtYoV#-><BUTkqjXR=sF)x&GW><sjRrjRdandX7p(ByhH6%sca{>lKrlsOktEQpgVb</sjRrjRdandX7p(ByhH6%sca{></BUTkqjXR=sF)x&GW>EWJtGGLmxYkuRZ&9QMwCvQcWHgpHx6McgHI7UO@fBKezxLKxgPa1s)TZbL=%2IgwT`NB{l1+#s_ZwDhrMIbV3pg=1@8<fFLOqxW@k9v#brCnP>BrfhWiUe__UipV&AoH#rguE#qvKu*^MXnpaMTZSHJKh</fFLOqxW@k9v#brCnP><GoTJEOi@aN9M-9>mXoJ<mHWbdnPBzsY_$&vqplRB-toxtS`T_3=l4_ox*qB+jfcZeZPy^s\"LL}>fwCQSrXWf*3GQIJ-^YrhO&#2wIxlbepeKA`wueq}*b)YEw`@%5<ryJvYB7dtzDX{_p*%P3nbarwv#488`Ujj-nvVymGMam~9(Em}ras\"XK^K+~*\"S><KRM*J@N0B2\"fv2nnA3tr-_$xvws>FCqtcCLz$Lk}SE}v1I\"k}_&Y~RxBZWXY9DJAeejK9@7zSh8~S@&7</KRM*J@N0B2\"fv2nnA3tr-_$xvws></ryJvYB7dtzDX{_p*%P3nbarwv#488`Ujj-nvVymGMam~9(Em}ras\"XK^K+~*\"S><zEwAvY*f4*M%F><lmdcj3*Uwkl9gE32ed#bOQHLp#)`^>bErpTcNtMm0YSh=r&9ixme7^f<BQwvIlsVeSzj*@7jjbEq8`77\"Xf8GHBW BX*L-Zm#IZcHb)Og9QfXtr></BQwvIlsVeSzj*@7jjbEq8`77\"Xf8GHBW BX*L-Zm#IZcHb)Og9QfXtr><PKFhOQqmx=y^IRN6vGDJLRb%euy4QI+*ej4eA%HPX2IDJ1=$(K0jwV9gsx><twFtEJVUFPNhI ~A6DU}+={mc&whg^G)8nj>ZodNefz8oJQ~K0`m-#DDw25(=UY)~ZSEgKgUdtxGHmlOnAjzCMvKTqHeRqIsjuzkBFRYB)MzZ99@S4+nzxafLPW^A<eBdtuihuHCYV)#J{jM=R#60DPV\"U5}\"c3Efsv`_JWPC%(k><PcaPSjyb7YnY(-45SEdlQ$Il7OxPFl><KrvYOZk\"m)d+S&XJQ=Kg#ybPrTxY}yF4wGN)_yLDb#B%>zLaeOLLIMXqXJYvL</KrvYOZk\"m)d+S&XJQ=Kg#ybPrTxY}yF4wGN)_yLDb#B%>WMdzJcHrnDW</eBdtuihuHCYV)#J{jM=R#60DPV\"U5}\"c3Efsv`_JWPC%(k><ouwEkGQns-`XX p2NXFb`V$~\"l(Y_sv9tJ`Z><luJVEZt64{N32yiI0`TkTIac)*rH+20ZYH2*ooVF%#L><aevKBZZ#lU02ND39KfJ3lBP55mLymA9es4fQ&L(xqZmalW6b@6BM><lBA4x)DWYS`_9BZ-`fv(EcCQ><MdcnZjdCP+gH#@luRgKxdHaL66I$1#v=dwxQYub}qmm3\"qGxBH)U>vWhWZWZmpA%TiOwJldgc1@j-d12bH3-f55l{aMQTbycafijCPYViodosb</MdcnZjdCP+gH#@luRgKxdHaL66I$1#v=dwxQYub}qmm3\"qGxBH)U>HKHRJIqRiE</lBA4x)DWYS`_9BZ-`fv(EcCQ></aevKBZZ#lU02ND39KfJ3lBP55mLymA9es4fQ&L(xqZmalW6b@6BM>xcNialZIwuhcmG&sXh)xZ#(Qq$3nDpEqH#1%y<PAH9jT6itok+NiN_RXa#v$aH#K>dyDpXSEQVIAPkpwrnabPUKziRB(u4Yv)U w1dEKhJm6HRoBPCFBD<Heumz0mF4zooAhk FD*=tD4SZ>vVcsHqSlGtL</Heumz0mF4zooAhk FD*=tD4SZ>BEIEoilgH*IcwUEdnIZh\"BYQxph<kjoMjKgRFr*g sfA%OS><boCYwWeIQzKcTaStZr~a=wtGM2iRQtZPS3rj@c`Pf+\"Uax4Pb7N8TxilQ{+7 hUkE9~zGj><dKIOtZ&WoCSdf6iyH6hDVguY-kT gD7tiRRX+}URD~F6Rx^e~3*hZn5scC`QWiWFL><bfDbr`3Px}#Q~4Lt&29{Y2k&8k4zWf5G\"HpO3(@s_><iKySEMyPud$ L KF2t$@VpfYe$_IM#U{CtqVb&SP>vJZqUJNG 9@3zmID) mFj7jz3$j0wwrcZcYejZSPtT</iKySEMyPud$ L KF2t$@VpfYe$_IM#U{CtqVb&SP>rJMayDokeUT</bfDbr`3Px}#Q~4Lt&29{Y2k&8k4zWf5G\"HpO3(@s_></dKIOtZ&WoCSdf6iyH6hDVguY-kT gD7tiRRX+}URD~F6Rx^e~3*hZn5scC`QWiWFL></kjoMjKgRFr*g sfA%OS><gcTLkI{E}PGPu83`K90cZYCRBZRbi =5+Q3uV~AF)Y>ldwUMFTRiX+\"l`ud2^ERWsPDV8PU--33u7~rsYgEz(5)m5xVmFmE&2j{5{KH</gcTLkI{E}PGPu83`K90cZYCRBZRbi =5+Q3uV~AF)Y><pwpM%U*b&hfmT4x\"`><qgaeaInCX~o{sgMaqnhOP8*9ffef*`pC`V_ku@D)>JvICToQjHK1I=Q=nAEf*dk-KT{08-}z%F$t88V6-(b7&%X9sz-h_1x#zl1 YN0S0Yqr~*vwJClhTJZMpiPreyTXU</pwpM%U*b&hfmT4x\"`><WjaFIbVH8g\"c%zxeGES%lpu1QCB^51Q=uYH%yg><EnniXGe=A{j8dL-@>WhBvRRrpZT~cLFN#hDh8MB8tp`S51W+MbI_#Kqz1tVmqL1RJsYk\"8p5{K0ZNg6DGSb</EnniXGe=A{j8dL-@></WjaFIbVH8g\"c%zxeGES%lpu1QCB^51Q=uYH%yg>AWNrDk*cAQN2x6)lgsLQpjke+}E*5JvnhZLoc7JiSyEpCn%AqH)U 3{G`Hvq}{4`=L8NkbMTkRT6{qi<ldAvOMNlAlM6))&Rt60\"Fgz_~i^v`CgPpLk~=SzDO@><pqzuz*dtHX#$\"`P{TMhQzgC$MVsRZ%8$5Q5-B#OKijY(t*oQMWU}apcr><rhSrEpIbo*SE&XQ#q9%$ANBxbzU8g(Dv=6CHsXMJ=rdu~# 28JvN)_><fWKaAHGmpDycn\"A5Oe ={wR1vgz9Zsj^eb3AKuce>tTikYEawW2XPEW78QKfeKpQ#t$A_fqi}*WRJG6}PaO4j</rhSrEpIbo*SE&XQ#q9%$ANBxbzU8g(Dv=6CHsXMJ=rdu~# 28JvN)_>jLhOtVYVnZrwXZfqCYIFBqISTJ</ldAvOMNlAlM6))&Rt60\"Fgz_~i^v`CgPpLk~=SzDO@><NipSzHMIicjD2chCx eCPa9><JiRLQc*OI4Wagi1M%51X2N9$>hyOmf*j)tNT41-hx_EpHd`IXQ#S O aa\"BP+7 Crvv%M`VdcGjwmOXhLffJqIAIzD<ICOWKRf}4RNyCByTXKcxwwDpVF}><VWgpxny5$la8BL><rTCcoKJM{}CA0q&NIjoZk9YRSnOiA7kQ}N)-P9Su{b>sCipkwxYcBCskrYcI<OORwkGS0Bd)+r@~6xdY7-1S%qxFA+dXst+VKb1{HYE @VPCBA*0rr+*8HX4E><oBaxczrarqj8(IoJjy^HWKu-ye+K`Vj#Vc4LEtzu@pmy><iBjZCNpr=Vhim6eC(nVsoqpo}g^62zM=&GH647><pEdZwu0eySiT$7U@B\"UJpXR)qwwn#Dz`Yvwa0^><wieRtSDZ^yV3h Jh+5e9V}3FsC`~A7S+3><KdegH{$gYKsPbcPv*YGBo&GCLzohLh3i) rQ2}{ Hq KcU_9tM5`N6SKI)`H>AfyiTjzN}m-EbuL47is^xTz\"a}#DPdtqxEkGOrdb)nvDqhXOWyBdxKvUnO</wieRtSDZ^yV3h Jh+5e9V}3FsC`~A7S+3>nX</pEdZwu0eySiT$7U@B\"UJpXR)qwwn#Dz`Yvwa0^></OORwkGS0Bd)+r@~6xdY7-1S%qxFA+dXst+VKb1{HYE @VPCBA*0rr+*8HX4E>KndAZSqs%&J&uF9Mj$nBpVvjhZ{1Vrqv15R9LtE`%BwTgM3hxVuvI^<vHHMbIeevU)O~8KQ 0yGBTkTS_hsM-v8Z@xJX^Qf`{lCou)mqaOn{Zy_lk`Vw1><EmHtSuWSNl2q$MO@NyzFbjPx%u-nM{EDSk3n6Tg@71MOwai$n n_z*></vHHMbIeevU)O~8KQ 0yGBTkTS_hsM-v8Z@xJX^Qf`{lCou)mqaOn{Zy_lk`Vw1><dOCqFLJASoIME5u8QLlByfaBO((gc~Ej8YlZS\"rPA$IK$v~%>IUinaMr8E@BJD73_fI(-l@xy*qX+JneS%lReKfB*Od-WnzTREwjw$~xi^W%CD$F5y)g2w$rpN\"pj~lvEzMpc=S8`SXH4*2Fy^C4R<cu%dXw3=Y7_Q4n~-_lI8\"8sD*#OhJI`Cy7vAVwI)bbBQ>zIRyLmvS(ZC}vQnH\"G8j7}fcaPUmxZoYqHXsiAKLq&VlB_ZhFwZ} Oy+A`L4lZlHllTHN^17{6\"LaczlTXdWRJ`R_6yXiL_4eVH 79oYOk7zrQUnza#-j0Smew~7ul%KO{dcvXimvIDpV{V2fTjBy& SO&+v#=4v8-~M`\"vnYgHpKF^2(#5y(TH 89@s=QWLyztGWYffi1TL7NifbziUbE(k\"K`t2}Yn{ Qbne2#0@0 STA_6{7<lJZjq=}{XFWQN8ZhT)%{NxBl$><oBHnXLtJC\"#OV`97~y03VgM*c6@Ho=nRMgpDzM`Bzwz&ouHVwxm+4M}{-><aIsfgXEw2v3rR((bEsDVs*9vfRL$#></aIsfgXEw2v3rR((bEsDVs*9vfRL$#>GDThkEf</oBHnXLtJC\"#OV`97~y03VgM*c6@Ho=nRMgpDzM`Bzwz&ouHVwxm+4M}{-></lJZjq=}{XFWQN8ZhT)%{NxBl$>PjVphf#i{ZUnV-^uRTMGuYkg7Y&RwIld^Tlyioi*pjAxwBMvklz$9bnLFg5 0j0}f%WuU2a{LBPR-u<UzK6u*I4%AGQe72Y-L@M8h*0Z4 xe>yESxusIA</UzK6u*I4%AGQe72Y-L@M8h*0Z4 xe><OKGXgxGyzc0^CtQti&S~ez5qi7u-WTVPZD&>OpJybrTkWtBaV3DNLoP8$ztW&aD*{wECr5*C_0IhTGdFWN\"v^tT91^cl(~T{YwwRK~KlLnTkFVqOPIGGVwk<QyyJpXLoAX3sR}RW}+$FGC}a(e\"N*dt4evrZr>zjgEvMkTQROA<HbagS_@J@`8knR$Y></HbagS_@J@`8knR$Y><zXUgwJIwLU1~mSA9g8KD te5qvaGppPjmN&y$yTY>PKIgsnT</zXUgwJIwLU1~mSA9g8KD te5qvaGppPjmN&y$yTY>JpywjgDsxKMiP30xEOUv*st%$(pYy<NDJUehhtF)gy\"S&juI2{u(Wz)q^dlWs^pgIAjwS$&M&ivPtt7Qp><ckRkfMULo~uG28mWQ4uMp=A9ufoU3pexQpkxn\"}V+G><LpUNpCt+bO2O)27+--Vd{8** iI+Daax`YGa~qQ _d\"U><JlZJwNlL#Ty=gu{0o8_86{9{aU*jG^Kl6=y\"7sV{I}t{YmBB2V89AC9Z1o*E\"><PZUSgK$Z$p4qRsQi04h{UI%MkiI=3C CBx2cv4Q#xZ+V lC+lXNP`5Uo#0MP&~YQil>zLzpsX#4WJ+%2F-SO3=zVCU#y6luvHkqbaMKodFtgydm</JlZJwNlL#Ty=gu{0o8_86{9{aU*jG^Kl6=y\"7sV{I}t{YmBB2V89AC9Z1o*E\"></LpUNpCt+bO2O)27+--Vd{8** iI+Daax`YGa~qQ _d\"U>AwH</ckRkfMULo~uG28mWQ4uMp=A9ufoU3pexQpkxn\"}V+G>tOQNlqVQxC</NDJUehhtF)gy\"S&juI2{u(Wz)q^dlWs^pgIAjwS$&M&ivPtt7Qp>XvQmdI&( p}QJD8fDF=a7GnUlzfzmpkZ-D-QvMLRll<ecF3~#UPv&J2HFHhWS)C +dfIHP}Ojse7eR_wr7LKEM&EUG%#g%^>XFvRyHmvSc<YotR2(*lXQZ^Ik+QN$\"uq{5`0r*ha#z^PQM=POt@_Ui$sULJQ_Xgiv}oN i><XDJWxF*pJ+5*dnmavPb`lG)Z^Ig^6NFD#(X#BrQkur{-+X_V+Wziv)\"2FWrbxQI>WJxTLJrFgoKAeTkBNPErMcJWQiRyEdVlml</YotR2(*lXQZ^Ik+QN$\"uq{5`0r*ha#z^PQM=POt@_Ui$sULJQ_Xgiv}oN i><ZavgKllKMWbO-kBAA6dH0v+ )E&2kxebe5G^*cO{WsMaP}RIAk}B}`_@egHGl~><xTkjVBrZEX{PRfUuZzizQ(BGk6uHhgt%lsCNx*+Q>xapVvtVnL$Mp89tScay6OCswozv((G#$qVpVO(9ki-MC& VvfUsUeufBozYLRGKUAjMeRPOW<JlCZg6Ae#Q~yFnubOYgiA~-^DYYO`6-CNH4><GZGjthhyUhKTl9sueQ#s@n (3JX$6zP5D ~uTlufj(tZ><tGmINRQ7BjsSslA={5T{=@nd{4a#5Us2F45hbHmIIe=nM@Tb-&#nXsOesBrX><UUiR+&iR&zls0^0><Cde8N\"csKY~pbCUW_S7\"wb>nXIlrmi^fw\"diK=^dvE{b@ %Sl$R(Ig`Eo2ipZVSf5FAp M%gP}%VVE\"i} O)TozUsiDUnp";

    ArrayList<String> result = problem1.solution(a);

    Assert.assertEquals("KiXorVH#*DE%TnM~IjGwImQo7ATx d+LLAgVj^t$&33FZ}Q~_JWYvRyzKvjbP",
        result.get(0));
    Assert.assertEquals("XsXUWgpXrj", result.get(1));
    Assert.assertEquals("jxOqH{xp)D8=&sFEjSgI4iae2T", result.get(2));
  }


}


