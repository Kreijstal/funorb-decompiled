/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport067 {
    static String stringState0278;
    static CodecSupport001 codecSupport001State0001;
    static int integerState0347;
    static String stringState0279;
    static String stringState0280;
    static long longState0022;
    static SceneWidget sceneWidgetState0067;

    final static void performAction0890(java.awt.Canvas canvasArgument1, boolean booleanArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        RuntimeException runtimeExceptionLocal7 = null;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (UiComponentPart004.integerState0091 >= 10) {
            if (!UiComponentPart009.computeBoolean0413(480)) {
              SoftwareRaster.performAction0727();
              GameSession.performAction1479(240, 320, integerArgument3 ^ -21986);
              UiComponentPart019.performAction1174(1, 0, 0, canvasArgument1);
            } else {
              if (MixedSupport052.integerState0269 != 0) {
                UiComponentPart005.performAction0347(true, canvasArgument1);
              } else {
                MixedSupport134.performAction1851(false, booleanArgument2, 78);
                UiComponentPart019.performAction1174(1, 0, 0, canvasArgument1);
              }
            }
          } else {
            integerLocal1 = 0;
            if (MixedSupport016.booleanState0016) {
              integerLocal1 = 1;
              MixedSupport016.booleanState0016 = false;
            }
            RenderingSupport001.performAction0148(UiComponentPart005.computeInteger0348(true), integerLocal1 != 0, 6, TextLayout.computeString0251(-11777), MixedSupport035.colorState0001);
          }
          if (integerArgument3 == -6351) {
            return;
          }
          MixedSupport067.performAction0889(-78);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal6 = caughtParameterLocal8;
          runtimeExceptionLocal7 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal7;
          stackStringBuilderLocal4 = new StringBuilder().append("jf.B(");
          if (canvasArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(booleanArgument2).append(',').append(integerArgument3).append(')').toString());
        }
    }

    public static void performAction0889(int integerArgument1) {
        sceneWidgetState0067 = null;
        stringState0278 = null;
        int integerLocal1 = -128 % ((integerArgument1 + 47) / 61);
        stringState0279 = null;
        codecSupport001State0001 = null;
        stringState0280 = null;
    }

    static {
        stringState0278 = "Your game";
        stringState0280 = "Invite more players, or alternatively try changing the following settings:  ";
        stringState0279 = "<%0> might change the options - wait and see.";
        integerState0347 = 0;
        codecSupport001State0001 = new CodecSupport001();
    }
}
