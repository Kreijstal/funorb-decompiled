/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport109 {
    private static int[] integerArrayState0193;
    static int integerState0651;
    private static int[] integerArrayState0194;
    static int[] integerArrayState0195;
    static int integerState0652;
    static int integerState0653;
    static int integerState0654;
    static int[] integerArrayState0196;
    static int[] integerArrayState0197;

    private final static void performAction1540() {
        integerState0651 = integerState0653 / 2;
        integerState0652 = integerState0654 / 2;
    }

    public static void performAction1537() {
        integerArrayState0197 = null;
        integerArrayState0193 = null;
        integerArrayState0194 = null;
        integerArrayState0195 = null;
        integerArrayState0196 = null;
    }

    final static void performAction1539() {
        MixedSupport109.performAction1538(SoftwareRaster.integerState0282, SoftwareRaster.integerState0280, SoftwareRaster.integerState0281, SoftwareRaster.integerState0283);
    }

    private final static void performAction1538(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        integerState0653 = integerArgument3 - integerArgument1;
        integerState0654 = integerArgument4 - integerArgument2;
        MixedSupport109.performAction1540();
        if (integerArrayState0197.length < integerState0654) {
          integerArrayState0197 = new int[UiComponentPart020.computeInteger1328(-10498, integerState0654)];
        }
        int integerLocal2 = integerArgument2 * SoftwareRaster.integerState0285 + integerArgument1;
        for (integerLocal1 = 0; integerLocal1 < integerState0654; integerLocal1++) {
          integerArrayState0197[integerLocal1] = integerLocal2;
          integerLocal2 = integerLocal2 + SoftwareRaster.integerState0285;
        }
    }

    static {
        int integerLocal1 = 0;
        int integerLocal2;
        int integerLocal3;
        integerArrayState0195 = new int[2048];
        integerArrayState0194 = new int[2048];
        integerArrayState0196 = new int[2048];
        integerArrayState0197 = new int[1024];
        integerArrayState0193 = new int[512];
        for (integerLocal1 = 1; integerLocal1 < 512; integerLocal1++) {
          integerArrayState0193[integerLocal1] = 32768 / integerLocal1;
        }
        for (integerLocal2 = 1; integerLocal2 < 2048; integerLocal2++) {
          integerArrayState0194[integerLocal2] = 65536 / integerLocal2;
        }
        for (integerLocal3 = 0; integerLocal3 < 2048; integerLocal3++) {
          integerArrayState0195[integerLocal3] = (int)(65536.0 * Math.sin((double)integerLocal3 * 0.0030679615));
          integerArrayState0196[integerLocal3] = (int)(65536.0 * Math.cos((double)integerLocal3 * 0.0030679615));
        }
    }
}
