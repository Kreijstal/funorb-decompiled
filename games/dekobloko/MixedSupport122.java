/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport122 {
    static String stringState0514;
    static String stringState0515;
    static int integerState0757;
    static boolean booleanState0179;
    static String stringState0516;
    static String stringState0517;
    static String stringState0518;

    final static void performAction1736(String stringArgument1, int[] integerArrayArgument2, byte byteArgument3, SceneWidgetPart008 sceneWidgetPart008Argument4, SceneWidget sceneWidgetArgument5, String stringArgument6, long longArgument7, int integerArgument8, int integerArgument9) {
        try {
          NetworkSupport005.sceneWidgetPart008State0004 = sceneWidgetPart008Argument4;
          SceneWidget.mixedSupport104State0001 = new MixedSupport104(sceneWidgetArgument5, longArgument7, stringArgument1, stringArgument6, integerArgument9, integerArgument8, integerArrayArgument2);
          if (byteArgument3 <= 84) {
            stringState0515 = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "sl.A(" + (stringArgument1 != null ? "{...}" : "null") + ',' + (integerArrayArgument2 != null ? "{...}" : "null") + ',' + byteArgument3 + ',' + (sceneWidgetPart008Argument4 != null ? "{...}" : "null") + ',' + (sceneWidgetArgument5 != null ? "{...}" : "null") + ',' + (stringArgument6 != null ? "{...}" : "null") + ',' + longArgument7 + ',' + integerArgument8 + ',' + integerArgument9 + ')');
        }
    }

    public static void performAction1733(byte byteArgument1) {
        stringState0518 = null;
        stringState0517 = null;
        stringState0516 = null;
        stringState0515 = null;
        if (byteArgument1 != 110) {
          booleanState0179 = true;
        }
        stringState0514 = null;
    }

    final static void performAction1735(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = MixedSupport085.integerArrayState0153[MixedSupport069.integerState0354];
        int integerLocal2 = MixedSupport085.integerArrayState0153[(MixedSupport069.integerState0354 + 1) % MixedSupport085.integerArrayState0153.length];
        int integerLocal3 = MixedSupport042.computeInteger0594(integerLocal2, LoginCredentials.integerState0348, integerArgument4, integerLocal1, 110);
        int integerLocal4 = MixedSupport118.integerArrayState0201[MixedSupport069.integerState0354];
        if (integerArgument2 >= -35) {
          MixedSupport122.performAction1733((byte) 86);
        }
        int integerLocal5 = MixedSupport118.integerArrayState0201[(MixedSupport069.integerState0354 + 1) % MixedSupport085.integerArrayState0153.length];
        int integerLocal6 = MixedSupport042.computeInteger0594(integerLocal5, LoginCredentials.integerState0348, integerArgument4, integerLocal4, 114);
        SoftwareRaster.performAction0739(integerArgument3, integerArgument1, 640, 480, integerLocal3, integerLocal6);
    }

    final static long computeLong1734(int integerArgument1) {
        if (integerArgument1 != -1) {
          MixedSupport122.performAction1732((String) null, (int[]) null, 24, (SceneWidgetPart008) null, (SceneWidget) null, (String) null, -106L, 12, -60);
        }
        return -MixedSupport100.longState0040 + MixedSupport063.computeLong0827(4);
    }

    static {
        stringState0514 = "Username: ";
        stringState0516 = "Score";
        stringState0517 = "You have been removed from <%0>'s game.";
        stringState0518 = "Passwords must be between 5 and 20 letters and numbers";
        integerState0757 = 0;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void performAction1732(String stringArgument1, int[] integerArrayArgument2, int integerArgument3, SceneWidgetPart008 sceneWidgetPart008Argument4, SceneWidget sceneWidgetArgument5, String stringArgument6, long longArgument7, int integerArgument8, int integerArgument9) {
        try {
          NetworkSupport005.sceneWidgetPart008State0004 = sceneWidgetPart008Argument4;
          SceneWidget.mixedSupport104State0001 = new MixedSupport104(sceneWidgetArgument5, longArgument7, stringArgument1, stringArgument6, integerArgument9, integerArgument8, integerArrayArgument2);
          if (integerArgument3 <= 84) {
            stringState0515 = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "sl.A(" + (stringArgument1 != null ? "{...}" : "null") + ',' + (integerArrayArgument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ',' + (sceneWidgetPart008Argument4 != null ? "{...}" : "null") + ',' + (sceneWidgetArgument5 != null ? "{...}" : "null") + ',' + (stringArgument6 != null ? "{...}" : "null") + ',' + longArgument7 + ',' + integerArgument8 + ',' + integerArgument9 + ')');
        }
    }
}
