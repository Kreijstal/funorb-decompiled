/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport135 {
    static RgbSprite rgbSpriteState0060;
    static String stringState0555;
    static String stringState0556;
    static String stringState0557;

    final static boolean computeBoolean1855(int integerArgument1, String stringArgument2) {
        RuntimeException runtimeExceptionLocal1 = null;
        String stringLocal2 = null;
        boolean stackBooleanLocal3 = false;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          if (null == MixedSupport068.stringState0288) {
            return false;
          }
          if (integerArgument1 != 2048) {
            stringLocal2 = (String) null;
            MixedSupport135.computeBoolean1855(-5, (String) null);
          }
          stackBooleanLocal3 = !(stringArgument2.toLowerCase().indexOf(MixedSupport068.stringState0288.toLowerCase()) < 0);
          return stackBooleanLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeExceptionLocal1 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal1;
          stackStringBuilderLocal5 = new StringBuilder().append("ue.C(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    public static void performAction1853(byte byteArgument1) {
        rgbSpriteState0060 = null;
        stringState0556 = null;
        stringState0555 = null;
        if (byteArgument1 < -4) {
          stringState0557 = null;
          return;
        }
        MixedSupport135.computeInteger1854(-36, 12);
        stringState0557 = null;
    }

    final static int computeInteger1854(int integerArgument1, int integerArgument2) {
        integerArgument1 = integerArgument1 & 8191;
        int integerLocal1 = -44 % ((integerArgument2 + 3) / 44);
        if (integerArgument1 >= 4096) {
          return integerArgument1 >= 6144 ? MixedSupport102.integerArrayState0180[-6144 + integerArgument1] : -MixedSupport102.integerArrayState0180[-integerArgument1 + 6144];
        }
        return 2048 <= integerArgument1 ? -MixedSupport102.integerArrayState0180[-2048 + integerArgument1] : MixedSupport102.integerArrayState0180[-integerArgument1 + 2048];
    }

    static {
        stringState0555 = "Solicitation";
        stringState0557 = "Tips";
        stringState0556 = "Report abuse";
    }
}
