/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport123 {
    static String stringState0539;
    static SceneWidgetPart006 sceneWidgetPart006State0002;
    static int[] integerArrayState0208;
    static int integerState0787;
    static String stringState0540;
    static String[] stringArrayState0048;
    static String stringState0541;
    static int integerState0788;

    final static int computeInteger1615(byte byteArgument1) {
        int stackIntegerLocal1 = 0;
        RuntimeException caughtExceptionLocal2 = null;
        int integerLocal3 = 0;
        RuntimeException runtimeExceptionLocal4 = null;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        long longLocal7 = 0L;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal3 = 0;
          integerLocal5 = 0;
          while (DualNodeDeque.computeBoolean0027(52)) {
            MixedSupport066.mixedSupport116State0001.performAction1512(-111);
            if (MixedSupport066.mixedSupport116State0001.computeBoolean1520((byte) 114)) {
              integerLocal3 = 1;
            }
            if (MixedSupport146.integerState0931 != 13) {
              continue;
            }
            integerLocal5 = 1;
          }
          MixedSupport066.mixedSupport116State0001.performAction1515(MixedSupport126.computeInteger1627(HashNode.integerState0069, (byte) -81, MixedSupport101.integerState0590), -20563, MixedSupport126.computeInteger1627(UiComponentPart013.integerState0276, (byte) -81, TextLineMetrics.integerState0535));
          if (MixedSupport066.mixedSupport116State0001.computeBoolean1520((byte) 114)) {
            integerLocal3 = 1;
          }
          integerLocal6 = 0;
          if (integerLocal3 != 0 &&
            MixedSupport066.mixedSupport116State0001.integerState0754 >= 0) {
            integerLocal6 = InputAdapter002.integerArrayState0192[MixedSupport066.mixedSupport116State0001.integerState0754];
            if (2 == integerLocal6 ||
              integerLocal6 == 5) {
              RenderingSupport001.performAction0137(false);
            }
          } else {
            if (integerLocal5 != 0 &&
              MixedSupport009.integerState0054 != 2) {
              RenderingSupport001.performAction0137(false);
            }
          }
          if (byteArgument1 > -88) {
            MixedSupport123.computeInteger1615((byte) 116);
          }
          if (integerLocal6 == 0 &&
            2 == MixedSupport009.integerState0054) {
            longLocal7 = MixedSupport062.correctedCurrentTimeMillis(4) - MixedSupport024.longState0007;
            integerLocal8 = (int)((10999L - longLocal7) / 1000L);
            if (0 >= integerLocal8) {
              integerLocal6 = 2;
              UiComponentPart003.performAction0163(-79, 5, true);
            }
          }
          stackIntegerLocal1 = integerLocal6;
          return stackIntegerLocal1;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal2 = caughtParameterLocal10;
          runtimeExceptionLocal4 = caughtExceptionLocal2;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal4), "tm.B(" + byteArgument1 + ')');
        }
    }

    public static void clearStaticReferences(int integerArgument1) {
        stringState0540 = null;
        sceneWidgetPart006State0002 = null;
        integerArrayState0208 = null;
        stringArrayState0048 = null;
        stringState0541 = null;
        if (integerArgument1 > 87) {
          stringState0539 = null;
          return;
        }
        stringState0541 = (String) null;
        stringState0539 = null;
    }

    final static void performAction1616(byte byteArgument1) {
        UiComponentPart018.stringArrayState0021[4] = MixedSupport026.stringState0128;
        UiComponentPart018.stringArrayState0021[7] = UiComponentPart022.stringState0401;
        UiComponentPart018.stringArrayState0021[1] = UiComponentPart030.stringState0520;
        UiComponentPart018.stringArrayState0021[2] = MixedSupport124.stringState0545;
        UiComponentPart018.stringArrayState0021[3] = MixedSupport071.stringState0317;
        UiComponentPart018.stringArrayState0021[6] = MixedSupport073.stringState0321;
        if (byteArgument1 <= -30) {
          UiComponentPart018.stringArrayState0021[5] = RichTextLayout.stringState0135;
          UiComponentPart018.stringArrayState0021[0] = MixedSupport137.stringState0588;
          MixedSupport003.stringArrayState0001[MixedSupport003.stringArrayState0001.length - 2] = MixedSupport119.stringState0522;
          MixedSupport003.stringArrayState0001[-1 + MixedSupport003.stringArrayState0001.length] = UiComponentPart023.stringState0426;
          return;
        }
    }

    static {
        stringState0540 = "You have not yet unlocked this option for use.";
        integerState0787 = 0;
        stringState0539 = "Waiting for music";
        stringArrayState0048 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        stringState0541 = "Create your own free Jagex account";
    }
}
