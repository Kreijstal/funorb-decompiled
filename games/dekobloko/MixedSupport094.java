/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport094 {
    static String stringState0372;
    static int[] integerArrayState0173;
    static String stringState0373;
    static int integerState0547;
    static String stringState0374;
    static RgbSprite[] rgbSpriteArrayState0019;

    final static void performAction1305(int integerArgument1) {
        if (integerArgument1 <= 125) {
          return;
        }
        InputAdapter006.integerArrayState0206 = null;
        SceneWidgetPart011.byteArrayArrayState0008 = (byte[][]) null;
        MixedSupport052.integerArrayState0054 = null;
        MixedSupport130.integerArrayState0208 = null;
        MixedSupport039.integerArrayState0047 = null;
        NetworkSupport006.integerArrayState0152 = null;
    }

    final static void performAction1306(java.applet.Applet appletArgument1, int integerArgument2, String stringArgument3) {
        try {
          String stringLocal1 = null;
          String stringLocal2 = null;
          String stringLocal3 = null;
          try {
            MixedSupport131.stringState0543 = stringArgument3;
            try {
              stringLocal1 = appletArgument1.getParameter("cookieprefix");
              stringLocal2 = appletArgument1.getParameter("cookiehost");
              stringLocal3 = stringLocal1 + "session=" + stringArgument3 + "; version=1; path=/; domain=" + stringLocal2;
              if (integerArgument2 == ~stringArgument3.length()) {
                stringLocal3 = stringLocal3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              MixedSupport088.performAction1240((byte) -51, appletArgument1, "document.cookie=\"" + stringLocal3 + "\"");
            } catch (Throwable throwable) {
            }
            NetworkSupport007.performAction1166((byte) 121, appletArgument1);
          } catch (RuntimeException runtimeException) {
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "oa.A(" + (appletArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ',' + (stringArgument3 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal6) {
          throw uncheckedExceptionLocal6;
        } catch (Throwable checkedExceptionLocal7) {
          throw new RuntimeException(checkedExceptionLocal7);
        }
    }

    final static String computeString1307(String stringArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException runtimeExceptionLocal3 = null;
        char[] characterArrayLocal4 = null;
        int integerLocal5 = 0;
        String stackStringLocal6 = null;
        RuntimeException stackRuntimeExceptionLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        integerLocal5 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal2 = stringArgument1.length();
          characterArrayLocal4 = new char[integerLocal2];
          for (integerLocal1 = 0; integerLocal1 < integerLocal2; integerLocal1++) {
            characterArrayLocal4[-integerLocal1 + integerLocal2 - 1] = stringArgument1.charAt(integerLocal1);
          }
          if (integerArgument2 != -1) {
            stringState0372 = (String) null;
          }
          stackStringLocal6 = new String(characterArrayLocal4);
          return stackStringLocal6;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal3 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal7 = runtimeExceptionLocal3;
          stackStringBuilderLocal8 = new StringBuilder().append("oa.D(");
          if (stringArgument1 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal7), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(integerArgument2).append(')').toString());
        }
    }

    public static void performAction1308(int integerArgument1) {
        if (integerArgument1 != -1) {
          integerArrayState0173 = (int[]) null;
        }
        stringState0372 = null;
        integerArrayState0173 = null;
        rgbSpriteArrayState0019 = null;
        stringState0374 = null;
        stringState0373 = null;
    }

    static {
        stringState0373 = "Enter multiplayer lobby";
        stringState0374 = "You must play 1 more rated game before playing with the current options.";
    }
}
