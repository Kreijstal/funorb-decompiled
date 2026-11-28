/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport101 {
    static boolean booleanState0135;
    static String stringState0433;
    static long longState0042;
    static int integerState0589;
    static String stringState0434;
    static int integerState0590;
    static int integerState0591;

    public static void clearStaticReferences(int integerArgument1) {
        int integerLocal1 = -26 / ((integerArgument1 + 34) / 48);
        stringState0433 = null;
        stringState0434 = null;
    }

    final static int computeInteger1269(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int stackIntegerLocal7 = 0;
        int stackIntegerLocal8 = 0;
        RuntimeException caughtExceptionLocal9 = null;
        RuntimeException runtimeExceptionLocal10 = null;
        integerLocal6 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal1 = 0;
          if (integerArgument2 != -2141435999) {
            MixedSupport101.computeInteger1269(7, 120, -115);
          }
          integerLocal2 = MixedSupport111.integerState0721;
          while (UiComponentPart010.stringArrayState0012.length > integerLocal1) {
            integerLocal3 = MixedSupport129.integerArrayState0211[integerLocal1];
            if (integerLocal3 < 0) {
              integerLocal2 = integerLocal2 + ComponentDecorator.integerState0497;
            } else {
              integerLocal4 = NetworkArchiveRequestManager.computeInteger1288(0, UiComponentPart010.stringArrayState0012[integerLocal1], true);
              integerLocal2 = integerLocal2 + PcmResampler.integerState0344;
              integerLocal5 = -(integerLocal4 >> 1) + MixedSupport004.integerState0029;
              if (MixedSupport049.computeBoolean0586(17, integerArgument1, integerArgument3, integerLocal4 + (DebouncedFieldValidator.integerState0050 << 1), integerLocal2, BirthDateInput.integerState0835 + (MixedSupport076.integerState0433 << 1), integerLocal5 - DebouncedFieldValidator.integerState0050)) {
                stackIntegerLocal7 = integerLocal3;
                return stackIntegerLocal7;
              }
              integerLocal2 = integerLocal2 + ((MixedSupport076.integerState0433 << 1) + (PcmResampler.integerState0344 + BirthDateInput.integerState0835));
            }
            integerLocal1++;
          }
          stackIntegerLocal8 = -1;
          return stackIntegerLocal8;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal9 = caughtParameterLocal11;
          runtimeExceptionLocal10 = caughtExceptionLocal9;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal10), "pm.A(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ')');
        }
    }

    static {
        booleanState0135 = false;
        stringState0433 = "You have declined the invitation.";
        stringState0434 = "Sound: ";
        integerState0590 = 0;
    }
}
