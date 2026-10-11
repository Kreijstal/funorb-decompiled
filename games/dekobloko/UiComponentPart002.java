/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart002 extends InteractiveComponent {
    private int integerState0047;
    private NetworkSupport006 networkSupport006State0001;
    static int[] integerArrayState0013;
    static String stringState0037;
    int integerState0048;
    int integerState0049;
    static int[] integerArrayState0014;

    public static void performAction0087(int integerArgument1) {
        stringState0037 = null;
        integerArrayState0014 = null;
        integerArrayState0013 = null;
        if (integerArgument1 > -53) {
          String stringLocal1 = (String) null;
          UiComponentPart002.computeString0088(-83, (String) null);
        }
    }

    final int computeInteger0089(int integerArgument1, int integerArgument2) {
        if (integerArgument2 < 0 ||
          this.networkSupport006State0001.computeInteger1147(126) <= integerArgument2) {
          return -1;
        }
        if (integerArgument1 != -1) {
          integerArrayState0014 = (int[]) null;
        }
        return this.networkSupport006State0001.computeInteger1154(integerArgument2, 0);
    }

    final static int[] computeIntegerArray0091(int integerArgument1) {
        int integerLocal1 = 110 / ((-90 - integerArgument1) / 32);
        return new int[8];
    }

    final static String computeString0088(int integerArgument1, String stringArgument2) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        String stackStringLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          integerLocal1 = MixedSupport138.computeInteger1895(MixedSupport021.integerState0123, MixedSupport126.integerState0776, -28705);
          if (integerLocal1 == 1) {
            stringArgument2 = "<img=0>" + stringArgument2;
          }
          if (integerLocal1 == 2) {
            stringArgument2 = "<img=1>" + stringArgument2;
          }
          if (integerArgument1 >= 78) {
            stackStringLocal4 = (String) (stringArgument2);
            return stackStringLocal4;
          }
          stackStringLocal3 = (String) null;
          return stackStringLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("b.F(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    final boolean computeBoolean0062(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, int integerArgument4, int integerArgument5, int integerArgument6, byte byteArgument7) {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        int integerLocal6 = 0;
        RuntimeException runtimeExceptionLocal7 = null;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        integerLocal12 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (!super.computeBoolean0062(integerArgument1, integerArgument2, uiComponentArgument3, integerArgument4, integerArgument5, integerArgument6, byteArgument7)) {
            return false;
          }
          integerLocal6 = -integerArgument6 + integerArgument2 - this.integerState0049;
          integerLocal8 = this.integerState0107 - this.integerState0049 * 2;
          if (integerLocal8 < integerLocal6) {
            integerLocal6 = integerLocal8;
          }
          if (integerLocal6 < 0) {
            integerLocal6 = 0;
          }
          integerLocal6 = integerLocal6 * this.integerState0047 / integerLocal8;
          if (integerArgument4 != 1) {
            if (2 != integerArgument4) {
              return true;
            }
            integerLocal9 = 2147483647;
            integerLocal10 = -1;
            for (integerLocal1 = 0; integerLocal1 < this.networkSupport006State0001.computeInteger1147(114); integerLocal1++) {
              integerLocal11 = this.networkSupport006State0001.computeInteger1154(integerLocal1, 0) - integerLocal6;
              integerLocal11 = integerLocal11 * integerLocal11;
              if (integerLocal11 < integerLocal9) {
                integerLocal9 = integerLocal11;
                integerLocal10 = integerLocal1;
              }
            }
            if (integerLocal10 >= 0) {
              this.networkSupport006State0001.performAction1155(-91, integerLocal10);
            }
          } else {
            this.networkSupport006State0001.performAction1150(integerLocal6, false);
          }
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal13) {
          caughtExceptionLocal5 = caughtParameterLocal13;
          runtimeExceptionLocal7 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal7;
          stackStringBuilderLocal3 = new StringBuilder().append("b.LB(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (uiComponentArgument3 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(byteArgument7).append(')').toString());
        }
    }

    final int computeInteger0092(int integerArgument1) {
        if (integerArgument1 != -15317) {
          String stringLocal1 = (String) null;
          UiComponentPart002.computeString0088(-69, (String) null);
        }
        return this.integerState0047;
    }

    final int computeInteger0090(boolean booleanArgument1) {
        if (!booleanArgument1) {
          return -57;
        }
        return this.networkSupport006State0001.computeInteger1147(-77);
    }

    private UiComponentPart002() throws Throwable {
        throw new Error();
    }

    static {
        integerArrayState0013 = new int[8192];
        stringState0037 = "Master Challenge";
    }
}
