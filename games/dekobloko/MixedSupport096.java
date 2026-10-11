/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport096 {
    static int integerState0549;
    static NodeDeque nodeDequeState0021;
    static String stringState0378;
    private int[] integerArrayState0174;

    public static void performAction1317(boolean booleanArgument1) {
        if (!booleanArgument1) {
          stringState0378 = (String) null;
        }
        stringState0378 = null;
        nodeDequeState0021 = null;
    }

    final int computeInteger1316(byte byteArgument1, int integerArgument2) {
        int integerLocal1;
        int integerLocal2;
        int integerLocal3;
        int integerLocal4;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        integerLocal1 = -1 + (this.integerArrayState0174.length >> 1);
        if (byteArgument1 != -68) {
          return 51;
        }
        integerLocal2 = integerLocal1 & integerArgument2;
        while (true) {
          integerLocal3 = this.integerArrayState0174[1 + (integerLocal2 + integerLocal2)];
          if (integerLocal3 == -1) {
            return -1;
          }
          if (this.integerArrayState0174[integerLocal2 + integerLocal2] == integerArgument2) {
            return integerLocal3;
          }
          integerLocal2 = 1 + integerLocal2 & integerLocal1;
        }
    }

    final static MixedSupport062[] computeMixedSupport062Array1315(byte byteArgument1) {
        if (byteArgument1 != 27) {
          MixedSupport096.performAction1317(false);
        }
        return new MixedSupport062[]{MixedSupport005.mixedSupport062State0001, RenderingSupport003.mixedSupport062State0002, GameApplet.mixedSupport062State0003};
    }

    MixedSupport096(int[] integerArrayArgument1) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        RuntimeException runtimeExceptionLocal8 = null;
        int integerLocal9;
        try {
          integerLocal1 = 1;
          while (integerLocal1 <= integerArrayArgument1.length + (integerArrayArgument1.length >> 1)) {
            integerLocal1 = integerLocal1 << 1;
          }
          this.integerArrayState0174 = new int[integerLocal1 + integerLocal1];
          for (integerLocal2 = 0; integerLocal1 + integerLocal1 > integerLocal2; integerLocal2++) {
            this.integerArrayState0174[integerLocal2] = -1;
          }
          for (integerLocal9 = 0; integerLocal9 < integerArrayArgument1.length; integerLocal9++) {
            integerLocal3 = integerArrayArgument1[integerLocal9] & -1 + integerLocal1;
            while (-1 != this.integerArrayState0174[integerLocal3 - (-integerLocal3 - 1)]) {
              integerLocal3 = -1 + integerLocal1 & integerLocal3 + 1;
            }
            this.integerArrayState0174[integerLocal3 + integerLocal3] = integerArrayArgument1[integerLocal9];
            this.integerArrayState0174[1 + integerLocal3 + integerLocal3] = integerLocal9;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal7 = caughtParameterLocal10;
          runtimeExceptionLocal8 = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal8;
          stackStringBuilderLocal5 = new StringBuilder().append("oc.<init>(");
          if (integerArrayArgument1 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    static {
        stringState0378 = "Confirm Email:";
    }
}
