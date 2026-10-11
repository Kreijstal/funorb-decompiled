/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkSupport001 {
    static SceneWidget sceneWidgetState0003;
    static String stringState0026;
    static RgbSprite rgbSpriteState0005;
    static BitmapFont bitmapFontState0002;
    static BitmapFont bitmapFontState0003;

    public static void performAction0069(int integerArgument1) {
        stringState0026 = null;
        bitmapFontState0003 = null;
        bitmapFontState0002 = null;
        if (integerArgument1 != 0) {
          return;
        }
        sceneWidgetState0003 = null;
        rgbSpriteState0005 = null;
    }

    final static void performAction0068(String stringArgument1, int integerArgument2, java.applet.Applet appletArgument3) {
        try {
          java.net.URL uRLLocal1 = null;
          int integerLocal2 = 0;
          RuntimeException stackRuntimeExceptionLocal3 = null;
          StringBuilder stackStringBuilderLocal4 = null;
          String stackStringLocal5 = null;
          StringBuilder stackStringBuilderLocal6 = null;
          String stackStringLocal7 = null;
          Throwable caughtExceptionLocal8 = null;
          Exception exceptionLocal9 = null;
          RuntimeException runtimeExceptionLocal10 = null;
          try {
            try {
              uRLLocal1 = new java.net.URL(appletArgument3.getCodeBase(), stringArgument1);
              uRLLocal1 = NetworkSupport004.computeURL0662(uRLLocal1, -1, appletArgument3);
              NetworkSupport002.performAction0190((byte) 92, uRLLocal1.toString(), true, appletArgument3);
            } catch (java.lang.Exception caughtParameterLocal11) {
              caughtExceptionLocal8 = caughtParameterLocal11;
              exceptionLocal9 = (Exception) (Object) caughtExceptionLocal8;
              exceptionLocal9.printStackTrace();
            }
            integerLocal2 = 92 / ((44 - integerArgument2) / 48);
            return;
          } catch (java.lang.RuntimeException caughtParameterLocal12) {
            caughtExceptionLocal8 = caughtParameterLocal12;
            runtimeExceptionLocal10 = (RuntimeException) (Object) caughtExceptionLocal8;
            stackRuntimeExceptionLocal3 = runtimeExceptionLocal10;
            stackStringBuilderLocal4 = new StringBuilder().append("aj.A(");
            if (stringArgument1 == null) {
              stackStringLocal5 = "null";
            } else {
              stackStringLocal5 = "{...}";
            }
            stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',').append(integerArgument2).append(',');
            if (appletArgument3 == null) {
              stackStringLocal7 = "null";
            } else {
              stackStringLocal7 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal13) {
          throw uncheckedExceptionLocal13;
        } catch (Throwable checkedExceptionLocal14) {
          throw new RuntimeException(checkedExceptionLocal14);
        }
    }

    final static void performAction0067(int integerArgument1) {
        NetworkSupport010.integerState0585 = 0;
        if (integerArgument1 != -1045) {
          return;
        }
        MixedSupport141.performAction1911(0);
    }

    static {
        stringState0026 = "<%0> has left the lobby.";
    }
}
