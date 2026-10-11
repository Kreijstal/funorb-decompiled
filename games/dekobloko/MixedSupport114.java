/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport114 {
    static String stringState0475;
    static String stringState0476;
    static String stringState0477;
    static String stringState0478;
    static MixedSupport111 mixedSupport111State0010;
    static boolean booleanState0162;
    static MixedSupport121 mixedSupport121State0003;

    final static boolean computeBoolean1629(java.applet.Applet appletArgument1, byte byteArgument2) {
        try {
          int integerLocal1 = 0;
          String stringLocal2 = null;
          String stringLocal3 = null;
          String[] stringArrayLocal4 = null;
          int integerLocal5 = 0;
          int integerLocal6 = 0;
          boolean stackBooleanLocal7 = false;
          RuntimeException stackRuntimeExceptionLocal8 = null;
          StringBuilder stackStringBuilderLocal9 = null;
          String stackStringLocal10 = null;
          Throwable caughtExceptionLocal11 = null;
          Throwable throwableLocal12 = null;
          RuntimeException runtimeExceptionLocal13 = null;
          integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            if (MixedSupport144.booleanState0209) {
              return true;
            }
            try {
              stringLocal2 = "tuhstatbut";
              stringLocal3 = (String) (MixedSupport088.computeObject1242(true, "getcookies", appletArgument1));
              stringArrayLocal4 = ResourceArchive.computeStringArray0907(';', (byte) 66, stringLocal3);
              if (byteArgument2 >= -55) {
                MixedSupport114.performAction1628(-124);
              }
              for (integerLocal1 = 0; integerLocal1 < stringArrayLocal4.length; integerLocal1++) {
                integerLocal5 = stringArrayLocal4[integerLocal1].indexOf('=');
                if (integerLocal5 >= 0 &&
                  stringArrayLocal4[integerLocal1].substring(0, integerLocal5).trim().equals(stringLocal2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable caughtParameterLocal14) {
              caughtExceptionLocal11 = caughtParameterLocal14;
              throwableLocal12 = caughtExceptionLocal11;
            }
            stackBooleanLocal7 = (null != appletArgument1.getParameter("tuhstatbut"));
            return stackBooleanLocal7;
          } catch (java.lang.RuntimeException caughtParameterLocal15) {
            caughtExceptionLocal11 = caughtParameterLocal15;
            runtimeExceptionLocal13 = (RuntimeException) (Object) caughtExceptionLocal11;
            stackRuntimeExceptionLocal8 = runtimeExceptionLocal13;
            stackStringBuilderLocal9 = new StringBuilder().append("rg.B(");
            if (appletArgument1 == null) {
              stackStringLocal10 = "null";
            } else {
              stackStringLocal10 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(byteArgument2).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal16) {
          throw uncheckedExceptionLocal16;
        } catch (Throwable checkedExceptionLocal17) {
          throw new RuntimeException(checkedExceptionLocal17);
        }
    }

    public static void performAction1628(int integerArgument1) {
        stringState0477 = null;
        stringState0475 = null;
        stringState0476 = null;
        mixedSupport111State0010 = null;
        mixedSupport121State0003 = null;
        int integerLocal1 = 36 / ((-41 - integerArgument1) / 35);
        stringState0478 = null;
    }

    static {
        stringState0475 = "Offline";
        stringState0476 = "Player names can be up to 12 letters, numbers and underscores";
        stringState0478 = "Can you unlock the Master Challenge by reaching Stage<nbsp>4 of Stamina Mode?";
        stringState0477 = "Please try again in a few minutes.";
        mixedSupport111State0010 = new MixedSupport111(10, 2, 2, 0);
        booleanState0162 = true;
    }
}
