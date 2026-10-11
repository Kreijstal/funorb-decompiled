/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport093 {
    static PlatformService platformServiceState0004;
    static String stringState0370;
    static int integerState0545;
    static SceneWidget sceneWidgetState0092;
    static int[] integerArrayState0171;
    static int[] integerArrayState0172;
    static int integerState0546;
    static String stringState0371;

    public static void performAction1304(boolean booleanArgument1) {
        if (!booleanArgument1) {
          stringState0370 = null;
          integerArrayState0172 = null;
          integerArrayState0171 = null;
          stringState0371 = null;
          sceneWidgetState0092 = null;
          platformServiceState0004 = null;
          return;
        }
        integerState0546 = 7;
        stringState0370 = null;
        integerArrayState0172 = null;
        integerArrayState0171 = null;
        stringState0371 = null;
        sceneWidgetState0092 = null;
        platformServiceState0004 = null;
    }

    final static int computeInteger1303(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (!(SoftwareRaster.integerState0284 < integerArgument1 + (integerArgument4 + integerArgument3))) {
          return integerArgument4 + integerArgument1;
        }
        if (-integerArgument3 + integerArgument4 < integerArgument2) {
          return SoftwareRaster.integerState0284 - integerArgument3;
        }
        return integerArgument4 - integerArgument3;
    }

    static {
        integerState0545 = 50;
        stringState0370 = "Add friend";
        integerArrayState0172 = UiComponentPart002.computeIntegerArray0091(-123);
        stringState0371 = "Did you know?";
    }
}
