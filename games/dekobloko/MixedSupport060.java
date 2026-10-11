/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport060 {
    private static int[] integerArrayState0102;
    private static float[] floatArrayState0001;
    private static boolean[] booleanArrayState0006;
    private int[] integerArrayState0103;
    private int[] integerArrayState0104;
    private static int[] integerArrayState0105;
    private int[][] integerArrayArrayState0011;
    private int[] integerArrayState0106;
    private int[] integerArrayState0107;
    private int integerState0331;
    private int[] integerArrayState0108;
    private static int[] integerArrayState0109;

    private final void performAction0809(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        if (integerArgument1 >= integerArgument2) {
          return;
        }
        integerLocal2 = integerArgument1;
        integerLocal3 = integerArrayState0105[integerLocal2];
        integerLocal4 = integerArrayState0102[integerLocal2];
        integerLocal5 = booleanArrayState0006[integerLocal2] ? 1 : 0;
        for (integerLocal1 = integerArgument1 + 1; integerLocal1 <= integerArgument2; integerLocal1++) {
          integerLocal6 = integerArrayState0105[integerLocal1];
          if (integerLocal6 < integerLocal3) {
            integerArrayState0105[integerLocal2] = integerLocal6;
            integerArrayState0102[integerLocal2] = integerArrayState0102[integerLocal1];
            booleanArrayState0006[integerLocal2] = booleanArrayState0006[integerLocal1];
            integerLocal2++;
            integerArrayState0105[integerLocal1] = integerArrayState0105[integerLocal2];
            integerArrayState0102[integerLocal1] = integerArrayState0102[integerLocal2];
            booleanArrayState0006[integerLocal1] = booleanArrayState0006[integerLocal2];
          }
        }
        integerArrayState0105[integerLocal2] = integerLocal3;
        integerArrayState0102[integerLocal2] = integerLocal4;
        booleanArrayState0006[integerLocal2] = integerLocal5 != 0;
        this.performAction0809(integerArgument1, integerLocal2 - 1);
        this.performAction0809(integerLocal2 + 1, integerArgument2);
    }

    private final static int computeInteger0813(int[] integerArrayArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        integerLocal2 = integerArrayArgument1[integerArgument2];
        integerLocal3 = -1;
        integerLocal4 = 2147483647;
        for (integerLocal1 = 0; integerLocal1 < integerArgument2; integerLocal1++) {
          integerLocal5 = integerArrayArgument1[integerLocal1];
          if (integerLocal5 > integerLocal2 &&
            integerLocal5 < integerLocal4) {
            integerLocal3 = integerLocal1;
            integerLocal4 = integerLocal5;
          }
        }
        return integerLocal3;
    }

    final boolean computeBoolean0808() {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int[] stackIntegerArrayLocal5 = null;
        int stackIntegerLocal6 = 0;
        int stackIntegerLocal7 = 0;
        int integerLocal8;
        int integerLocal9;
        int integerLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        stackIntegerLocal4 = (VorbisSample.computeInteger1920() == 0) ? 0 : 1;
        integerLocal8 = stackIntegerLocal4;
        if (integerLocal8 == 0) {
          return false;
        }
        integerLocal9 = this.integerArrayState0107.length;
        System.arraycopy(this.integerArrayState0107, 0, integerArrayState0105, 0, integerLocal9);
        integerLocal10 = integerArrayState0109[this.integerState0331 - 1];
        integerLocal11 = SceneWidgetPart010.computeInteger1667((byte) 6, integerLocal10 - 1);
        integerArrayState0102[0] = VorbisSample.computeInteger1923(integerLocal11);
        integerArrayState0102[1] = VorbisSample.computeInteger1923(integerLocal11);
        integerLocal12 = 2;
        for (integerLocal1 = 0; integerLocal1 < this.integerArrayState0104.length; integerLocal1++) {
          integerLocal13 = this.integerArrayState0104[integerLocal1];
          integerLocal14 = this.integerArrayState0108[integerLocal13];
          integerLocal15 = this.integerArrayState0103[integerLocal13];
          integerLocal16 = (1 << integerLocal15) - 1;
          integerLocal17 = 0;
          if (integerLocal15 > 0) {
            integerLocal17 = VorbisSample.mixedSupport065ArrayState0001[this.integerArrayState0106[integerLocal13]].computeInteger0855();
          }
          for (integerLocal2 = 0; integerLocal2 < integerLocal14; integerLocal2++) {
            integerLocal18 = this.integerArrayArrayState0011[integerLocal13][integerLocal17 & integerLocal16];
            integerLocal17 = integerLocal17 >>> integerLocal15;
            previousIntegerLocal3 = integerLocal12;
            integerLocal12++;
            stackIntegerArrayLocal5 = (int[]) (integerArrayState0102);
            stackIntegerLocal6 = previousIntegerLocal3;
            if (integerLocal18 < 0) {
              stackIntegerLocal7 = 0;
            } else {
              stackIntegerLocal7 = VorbisSample.mixedSupport065ArrayState0001[integerLocal18].computeInteger0855();
            }
            stackIntegerArrayLocal5[stackIntegerLocal6] = stackIntegerLocal7;
          }
        }
        return true;
    }

    private final int computeInteger0810(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        int integerLocal1 = integerArgument4 - integerArgument2;
        int integerLocal2 = integerArgument3 - integerArgument1;
        int integerLocal3 = integerLocal1 < 0 ? -integerLocal1 : integerLocal1;
        int integerLocal4 = integerLocal3 * (integerArgument5 - integerArgument1);
        int integerLocal5 = integerLocal4 / integerLocal2;
        return integerLocal1 < 0 ? integerArgument2 - integerLocal5 : integerArgument2 + integerLocal5;
    }

    private final static int computeInteger0815(int[] integerArrayArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        integerLocal2 = integerArrayArgument1[integerArgument2];
        integerLocal3 = -1;
        integerLocal4 = -2147483648;
        for (integerLocal1 = 0; integerLocal1 < integerArgument2; integerLocal1++) {
          integerLocal5 = integerArrayArgument1[integerLocal1];
          if (integerLocal5 < integerLocal2 &&
            integerLocal5 > integerLocal4) {
            integerLocal3 = integerLocal1;
            integerLocal4 = integerLocal5;
          }
        }
        return integerLocal3;
    }

    public static void performAction0814() {
        integerArrayState0109 = null;
        floatArrayState0001 = null;
        integerArrayState0105 = null;
        integerArrayState0102 = null;
        booleanArrayState0006 = null;
    }

    private final void performAction0811(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, float[] floatArrayArgument5, int integerArgument6) {
        int integerLocal1 = 0;
        int integerLocal2 = integerArgument4 - integerArgument2;
        int integerLocal3 = integerArgument3 - integerArgument1;
        int integerLocal4 = integerLocal2 < 0 ? -integerLocal2 : integerLocal2;
        int integerLocal5 = integerLocal2 / integerLocal3;
        int integerLocal6 = integerArgument2;
        int integerLocal7 = 0;
        int integerLocal8 = integerLocal2 < 0 ? integerLocal5 - 1 : integerLocal5 + 1;
        integerLocal4 = integerLocal4 - (integerLocal5 < 0 ? -integerLocal5 : integerLocal5) * integerLocal3;
        floatArrayArgument5[integerArgument1] = floatArrayArgument5[integerArgument1] * floatArrayState0001[integerLocal6];
        if (integerArgument3 > integerArgument6) {
          integerArgument3 = integerArgument6;
        }
        for (integerLocal1 = integerArgument1 + 1; integerLocal1 < integerArgument3; integerLocal1++) {
          integerLocal7 = integerLocal7 + integerLocal4;
          if (integerLocal7 >= integerLocal3) {
            integerLocal7 = integerLocal7 - integerLocal3;
            integerLocal6 = integerLocal6 + integerLocal8;
          } else {
            integerLocal6 = integerLocal6 + integerLocal5;
          }
          floatArrayArgument5[integerLocal1] = floatArrayArgument5[integerLocal1] * floatArrayState0001[integerLocal6];
        }
    }

    final void performAction0812(float[] floatArrayArgument1, int integerArgument2) {
        int stackIntegerLocal1 = 0;
        int[] stackIntegerArrayLocal2 = null;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int[] stackIntegerArrayLocal5 = null;
        int stackIntegerLocal6 = 0;
        int stackIntegerLocal7 = 0;
        int integerLocal8;
        int integerLocal9;
        boolean[] booleanArrayLocal10;
        int integerLocal11;
        int integerLocal12;
        int integerLocal13;
        float floatLocal14;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        int integerLocal19;
        boolean[] booleanArrayLocal20;
        int integerLocal21;
        int integerLocal22;
        int integerLocal23;
        int integerLocal24;
        int integerLocal25;
        int integerLocal26;
        int integerLocal27;
        int integerLocal28;
        integerLocal8 = this.integerArrayState0107.length;
        integerLocal9 = integerArrayState0109[this.integerState0331 - 1];
        booleanArrayLocal10 = booleanArrayState0006;
        booleanArrayState0006[1] = true;
        booleanArrayLocal10[0] = true;
        for (integerLocal11 = 2; integerLocal11 < integerLocal8; integerLocal11++) {
          integerLocal12 = MixedSupport060.computeInteger0815(integerArrayState0105, integerLocal11);
          integerLocal13 = MixedSupport060.computeInteger0813(integerArrayState0105, integerLocal11);
          integerLocal15 = this.computeInteger0810(integerArrayState0105[integerLocal12], integerArrayState0102[integerLocal12], integerArrayState0105[integerLocal13], integerArrayState0102[integerLocal13], integerArrayState0105[integerLocal11]);
          integerLocal16 = integerArrayState0102[integerLocal11];
          integerLocal17 = integerLocal9 - integerLocal15;
          integerLocal18 = integerLocal15;
          stackIntegerLocal1 = (integerLocal17 >= integerLocal18) ? integerLocal18 : integerLocal17;
          integerLocal19 = stackIntegerLocal1 << 1;
          if (integerLocal16 == 0) {
            booleanArrayState0006[integerLocal11] = false;
            integerArrayState0102[integerLocal11] = integerLocal15;
          } else {
            booleanArrayLocal20 = booleanArrayState0006;
            integerLocal21 = integerLocal12;
            booleanArrayState0006[integerLocal13] = true;
            booleanArrayLocal20[integerLocal21] = true;
            booleanArrayState0006[integerLocal11] = true;
            if (integerLocal16 < integerLocal19) {
              stackIntegerArrayLocal5 = (int[]) (integerArrayState0102);
              stackIntegerLocal6 = integerLocal11;
              if ((integerLocal16 & 1) == 0) {
                stackIntegerLocal7 = integerLocal15 + integerLocal16 / 2;
              } else {
                stackIntegerLocal7 = integerLocal15 - (integerLocal16 + 1) / 2;
              }
              stackIntegerArrayLocal5[stackIntegerLocal6] = stackIntegerLocal7;
            } else {
              stackIntegerArrayLocal2 = (int[]) (integerArrayState0102);
              stackIntegerLocal3 = integerLocal11;
              if (integerLocal17 <= integerLocal18) {
                stackIntegerLocal4 = integerLocal15 - integerLocal16 + integerLocal17 - 1;
              } else {
                stackIntegerLocal4 = integerLocal16 - integerLocal18 + integerLocal15;
              }
              stackIntegerArrayLocal2[stackIntegerLocal3] = stackIntegerLocal4;
            }
          }
        }
        this.performAction0809(0, integerLocal8 - 1);
        integerLocal23 = 0;
        integerLocal24 = integerArrayState0102[0] * this.integerState0331;
        integerLocal22 = 1;
        integerLocal25 = integerLocal22;
        while (integerLocal22 < integerLocal8) {
          if (booleanArrayState0006[integerLocal22]) {
            integerLocal26 = integerArrayState0105[integerLocal22];
            integerLocal28 = integerArrayState0102[integerLocal22] * this.integerState0331;
            this.performAction0811(integerLocal23, integerLocal24, integerLocal26, integerLocal28, floatArrayArgument1, integerArgument2);
            if (integerLocal26 >= integerArgument2) {
              return;
            }
            integerLocal23 = integerLocal26;
            integerLocal24 = integerLocal28;
          }
          integerLocal22++;
        }
        floatLocal14 = floatArrayState0001[integerLocal24];
        for (integerLocal27 = integerLocal23; integerLocal27 < integerArgument2; integerLocal27++) {
          floatArrayArgument1[integerLocal27] = floatArrayArgument1[integerLocal27] * floatLocal14;
        }
    }

    MixedSupport060() {
        int cachedIntegerLocal1 = 0;
        int integerLocal2 = 0;
        int previousIntegerLocal3 = 0;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        int integerLocal7;
        int integerLocal8;
        int integerLocal9;
        int[] integerArrayLocal10;
        int integerLocal11;
        int[] integerArrayLocal12;
        int[] integerArrayLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        int integerLocal18;
        int integerLocal19;
        int integerLocal20;
        integerLocal4 = VorbisSample.computeInteger1923(16);
        if (integerLocal4 != 1) {
          throw new RuntimeException();
        }
        integerLocal5 = VorbisSample.computeInteger1923(5);
        integerLocal6 = 0;
        this.integerArrayState0104 = new int[integerLocal5];
        for (integerLocal7 = 0; integerLocal7 < integerLocal5; integerLocal7++) {
          integerLocal8 = VorbisSample.computeInteger1923(4);
          this.integerArrayState0104[integerLocal7] = integerLocal8;
          if (integerLocal8 >= integerLocal6) {
            integerLocal6 = integerLocal8 + 1;
          }
        }
        this.integerArrayState0108 = new int[integerLocal6];
        this.integerArrayState0103 = new int[integerLocal6];
        this.integerArrayState0106 = new int[integerLocal6];
        this.integerArrayArrayState0011 = new int[integerLocal6][];
        for (integerLocal14 = 0; integerLocal14 < integerLocal6; integerLocal14++) {
          this.integerArrayState0108[integerLocal14] = VorbisSample.computeInteger1923(3) + 1;
          cachedIntegerLocal1 = VorbisSample.computeInteger1923(2);
          this.integerArrayState0103[integerLocal14] = cachedIntegerLocal1;
          integerLocal18 = cachedIntegerLocal1;
          if (integerLocal18 != 0) {
            this.integerArrayState0106[integerLocal14] = VorbisSample.computeInteger1923(8);
          }
          integerLocal18 = 1 << integerLocal18;
          integerArrayLocal13 = new int[integerLocal18];
          integerArrayLocal12 = integerArrayLocal13;
          integerArrayLocal10 = integerArrayLocal12;
          this.integerArrayArrayState0011[integerLocal14] = integerArrayLocal13;
          for (integerLocal11 = 0; integerLocal11 < integerLocal18; integerLocal11++) {
            integerArrayLocal10[integerLocal11] = VorbisSample.computeInteger1923(8) - 1;
          }
        }
        this.integerState0331 = VorbisSample.computeInteger1923(2) + 1;
        integerLocal15 = VorbisSample.computeInteger1923(4);
        integerLocal19 = 2;
        for (integerLocal9 = 0; integerLocal9 < integerLocal5; integerLocal9++) {
          integerLocal19 = integerLocal19 + this.integerArrayState0108[this.integerArrayState0104[integerLocal9]];
        }
        this.integerArrayState0107 = new int[integerLocal19];
        this.integerArrayState0107[0] = 0;
        this.integerArrayState0107[1] = 1 << integerLocal15;
        integerLocal20 = 2;
        for (integerLocal16 = 0; integerLocal16 < integerLocal5; integerLocal16++) {
          integerLocal17 = this.integerArrayState0104[integerLocal16];
          for (integerLocal2 = 0; integerLocal2 < this.integerArrayState0108[integerLocal17]; integerLocal2++) {
            previousIntegerLocal3 = integerLocal20;
            integerLocal20++;
            this.integerArrayState0107[previousIntegerLocal3] = VorbisSample.computeInteger1923(integerLocal15);
          }
        }
        if (integerArrayState0105 != null &&
          integerArrayState0105.length >= integerLocal20) {
          return;
        }
        integerArrayState0105 = new int[integerLocal20];
        integerArrayState0102 = new int[integerLocal20];
        booleanArrayState0006 = new boolean[integerLocal20];
        return;
    }

    static {
        floatArrayState0001 = new float[]{1.0649863213529898e-7f, 1.1341951022814101e-7f, 1.2079014766186447e-7f, 1.2863978327004588e-7f, 1.3699950329737476e-7f, 1.459025043004658e-7f, 1.553840860424316e-7f, 1.654818078122844e-7f, 1.7623574422032107e-7f, 1.8768855625239667e-7f, 1.998856049567621e-7f, 2.128753067154321e-7f, 2.2670913324418507e-7f, 2.4144196686393116e-7f, 2.5713222839840455e-7f, 2.738421187586937e-7f, 2.9163791737119027e-7f, 3.105902237621194e-7f, 3.3077409966608684e-7f, 3.5226966588197683e-7f, 3.7516213069466176e-7f, 3.9954230146577174e-7f, 4.2550681200737017e-7f, 4.531586341727234e-7f, 4.826074473385233e-7f, 5.139700078871101e-7f, 5.473706323755323e-7f, 5.829418796565733e-7f, 6.208247214090079e-7f, 6.611693947888853e-7f, 7.041359140202985e-7f, 7.498946388295735e-7f, 7.98627013409714e-7f, 8.505263053848466e-7f, 9.057982879312476e-7f, 9.646621492720442e-7f, 0.0000010273513453284977f, 0.0000010941143955278676f, 0.0000011652160765152075f, 0.0000012409384453349048f, 0.0000013215816352385445f, 0.0000014074654473006376f, 0.000001498930487286998f, 0.0000015963394162099576f, 0.0000017000785419440945f, 0.0000018105591834682855f, 0.0000019282194898551097f, 0.0000020535260318865767f, 0.0000021869757347303675f, 0.0000023290976969292387f, 0.0000024804558051982895f, 0.0000026416496439196635f, 0.000002813319042616058f, 0.0000029961443033243995f, 0.000003190850520695676f, 0.0000033982100831053685f, 0.000003619044946390204f, 0.000003854230726574315f, 0.0000041047005652217194f, 0.000004371447175799403f, 0.000004655528300645528f, 0.000004958070803695591f, 0.000005280273853713879f, 0.000005623416200251086f, 0.00000598885708313901f, 0.0000063780466916796286f, 0.000006792528438381851f, 0.000007233945325424429f, 0.000007704047675360925f, 0.000008204699952329975f, 0.000008737887583265547f, 0.000009305725143349264f, 0.000009910463631968014f, 0.000010554501386650372f, 0.000011240392268518917f, 0.00001197085566673195f, 0.000012748789231409319f, 0.000013577277968579438f, 0.000014459606063610408f, 0.00001539927143312525f, 0.000016400004824390635f, 0.000017465768905822188f, 0.000018600792827783152f, 0.000019809576770057902f, 0.00002109691376972478f, 0.00002246791154902894f, 0.000023928001610329375f, 0.000025482977434876375f, 0.00002713900539674796f, 0.000028902650228701532f, 0.000030780909582972527f, 0.000032781226764200255f, 0.00003491153256618418f, 0.000037180281651671976f, 0.00003959646710427478f, 0.00004216966772219166f, 0.00004491009167395532f, 0.000047828601964283735f, 0.00005093677464174107f, 0.00005424693154054694f, 0.00005777220212621614f, 0.00006152656715130433f, 0.00006552490958711132f, 0.00006978308374527842f, 0.00007431798439938575f, 0.00007914758316474035f, 0.00008429103763774037f, 0.00008976874960353598f, 0.00009560242324369028f, 0.00010181521065533161f, 0.00010843174095498398f, 0.0001154782366938889f, 0.00012298267392907292f, 0.00013097477494738996f, 0.00013948624837212265f, 0.00014855085464660078f, 0.00015820453700143844f, 0.000168485552421771f, 0.00017943468992598355f, 0.00019109535787720233f, 0.00020351381681393832f, 0.00021673929586540908f, 0.0002308242255821824f, 0.00024582448531873524f, 0.0002617995487526059f, 0.0002788127458188683f, 0.0002969315683003515f, 0.00031622787355445325f, 0.00033677814644761384f, 0.0003586638777051121f, 0.0003819718840532005f, 0.0004067945701535791f, 0.00043323036516085267f, 0.0004613841010723263f, 0.000491367478389293f, 0.0005232992698438466f, 0.0005573062226176262f, 0.0005935230874456465f, 0.0006320935790427029f, 0.000673170608934015f, 0.0007169169839471579f, 0.0007635062793269753f, 0.0008131232461892068f, 0.0008659645682200789f, 0.0009222398512065411f, 0.0009821722051128745f, 0.001045999233610928f, 0.0011139742564409971f, 0.0011863665422424674f, 0.001263463287614286f, 0.0013455701991915703f, 0.0014330128906294703f, 0.0015261381631717086f, 0.00162531528621912f, 0.0017309373943135142f, 0.0018434234661981463f, 0.001963219605386257f, 0.002090800553560257f, 0.002226672600954771f, 0.002371374284848571f, 0.002525479532778263f, 0.0026895992923527956f, 0.0028643847908824682f, 0.0030505286995321512f, 0.0032487690914422274f, 0.0034598924685269594f, 0.003684735856950283f, 0.003924190532416105f, 0.0041792066767811775f, 0.004450794775038958f, 0.004740032833069563f, 0.005048066843301058f, 0.005376118700951338f, 0.005725488997995853f, 0.0060975635424256325f, 0.006493817549198866f, 0.006915822625160217f, 0.007365251425653696f, 0.00784388743340969f, 0.008353627286851406f, 0.008896492421627045f, 0.009474636986851692f, 0.010090352036058903f, 0.010746080428361893f, 0.01144442055374384f, 0.012188144028186798f, 0.012980197556316853f, 0.013823725283145905f, 0.0147220678627491f, 0.01567879132926464f, 0.016697686165571213f, 0.017782796174287796f, 0.018938422203063965f, 0.020169148221611977f, 0.021479854360222816f, 0.02287573553621769f, 0.02436232939362526f, 0.025945531204342842f, 0.027631618082523346f, 0.02942727692425251f, 0.031339626759290695f, 0.03337625041604042f, 0.0355452261865139f, 0.037855155766010284f, 0.04031519964337349f, 0.04293510690331459f, 0.045725274831056595f, 0.04869675636291504f, 0.05186134949326515f, 0.05523158982396126f, 0.058820851147174835f, 0.06264336407184601f, 0.06671427935361862f, 0.0710497498512268f, 0.07566696405410767f, 0.08058422803878784f, 0.08582104742527008f, 0.09139817953109741f, 0.0973377451300621f, 0.10366330295801163f, 0.11039993166923523f, 0.11757434159517288f, 0.12521497905254364f, 0.1333521455526352f, 0.142018124461174f, 0.15124726295471191f, 0.16107617318630219f, 0.17154380679130554f, 0.18269167840480804f, 0.19456401467323303f, 0.20720787346363068f, 0.22067342698574066f, 0.23501402139663696f, 0.2502865493297577f, 0.26655158400535583f, 0.28387361764907837f, 0.30232131481170654f, 0.32196786999702454f, 0.342891126871109f, 0.36517414450645447f, 0.38890519738197327f, 0.4141784608364105f, 0.44109413027763367f, 0.46975889801979065f, 0.5002864599227905f, 0.5327979326248169f, 0.567422091960907f, 0.6042963862419128f, 0.6435669660568237f, 0.6853895783424377f, 0.72993004322052f, 0.7773650288581848f, 0.8278825879096985f, 0.8816830515861511f, 0.9389798045158386f, 1.0f};
        integerArrayState0109 = new int[]{256, 128, 86, 64};
    }
}
