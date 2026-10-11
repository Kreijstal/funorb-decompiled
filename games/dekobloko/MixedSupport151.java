/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport151 extends HashNode {
    int integerState0921;
    int[] integerArrayState0258;
    static String stringState0607;
    int integerState0922;
    static boolean booleanState0221;
    static RgbSprite rgbSpriteState0071;
    int integerState0923;
    int integerState0924;
    int integerState0925;
    int integerState0926;

    final void performAction2016(byte byteArgument1, int integerArgument2, int[] integerArrayArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8) {
        try {
          this.integerState0924 = integerArgument2;
          if (byteArgument1 != 37) {
            CharSequence charSequenceLocal1 = (CharSequence) null;
            MixedSupport151.computeString2019(false, (CharSequence) null, -40);
          }
          this.integerState0922 = integerArgument6;
          this.integerArrayState0258 = integerArrayArgument3;
          this.integerState0923 = integerArgument8;
          this.integerState0926 = integerArgument4;
          this.integerState0921 = integerArgument7;
          this.integerState0925 = integerArgument5;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wc.D(" + byteArgument1 + ',' + integerArgument2 + ',' + (integerArrayArgument3 != null ? "{...}" : "null") + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ',' + integerArgument7 + ',' + integerArgument8 + ')');
        }
    }

    public static void performAction2017(int integerArgument1) {
        stringState0607 = null;
        if (integerArgument1 != 2) {
          MixedSupport151.performAction2018(64, -36, -122);
          rgbSpriteState0071 = null;
          return;
        }
        rgbSpriteState0071 = null;
    }

    final static String computeString2019(boolean booleanArgument1, CharSequence charSequenceArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        String stringLocal2 = null;
        int integerLocal3 = 0;
        String stackStringLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        RuntimeException runtimeExceptionLocal10 = null;
        integerLocal3 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          stringLocal2 = MixedSupport112.computeString1597(booleanArgument1, (byte) 19, charSequenceArgument2);
          if (stringLocal2 != null) {
            stackStringLocal4 = stringLocal2;
            return stackStringLocal4;
          }
          for (integerLocal1 = integerArgument3; charSequenceArgument2.length() > integerLocal1; integerLocal1++) {
            if (!MixedSupport018.computeBoolean0273(charSequenceArgument2.charAt(integerLocal1), (byte) 90)) {
              stackStringLocal5 = MixedSupport068.stringState0289;
              return stackStringLocal5;
            }
          }
          return null;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal9 = caughtParameterLocal11;
          runtimeExceptionLocal10 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal10;
          stackStringBuilderLocal7 = new StringBuilder().append("wc.A(").append(booleanArgument1).append(',');
          if (charSequenceArgument2 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument3).append(')').toString());
        }
    }

    final static void performAction2018(int integerArgument1, int integerArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        RuntimeException caughtExceptionLocal10 = null;
        RuntimeException runtimeExceptionLocal11 = null;
        integerLocal9 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument1 <= integerArgument2 + 5) {
            return;
          }
          integerLocal2 = integerArgument2;
          integerLocal3 = NetworkSupport004.integerArrayState0052[integerLocal2];
          integerLocal4 = NetworkSupport004.integerArrayState0052[integerLocal2 + 1];
          integerLocal5 = NetworkSupport004.integerArrayState0052[2 + integerLocal2];
          integerLocal6 = NetworkSupport004.integerArrayState0052[integerLocal2 + 3];
          integerLocal7 = NetworkSupport004.integerArrayState0052[4 + integerLocal2];
          for (integerLocal1 = integerArgument2 + 5; integerLocal1 < integerArgument1; integerLocal1 += 5) {
            integerLocal8 = NetworkSupport004.integerArrayState0052[3 + integerLocal1];
            if (integerLocal6 < integerLocal8) {
              NetworkSupport004.integerArrayState0052[integerLocal2] = NetworkSupport004.integerArrayState0052[integerLocal1];
              NetworkSupport004.integerArrayState0052[integerLocal2 + 1] = NetworkSupport004.integerArrayState0052[integerLocal1 + 1];
              NetworkSupport004.integerArrayState0052[2 + integerLocal2] = NetworkSupport004.integerArrayState0052[2 + integerLocal1];
              NetworkSupport004.integerArrayState0052[3 + integerLocal2] = integerLocal8;
              NetworkSupport004.integerArrayState0052[4 + integerLocal2] = NetworkSupport004.integerArrayState0052[integerLocal1 + 4];
              integerLocal2 += 5;
              NetworkSupport004.integerArrayState0052[integerLocal1] = NetworkSupport004.integerArrayState0052[integerLocal2];
              NetworkSupport004.integerArrayState0052[1 + integerLocal1] = NetworkSupport004.integerArrayState0052[integerLocal2 + 1];
              NetworkSupport004.integerArrayState0052[integerLocal1 + 2] = NetworkSupport004.integerArrayState0052[integerLocal2 + 2];
              NetworkSupport004.integerArrayState0052[integerLocal1 + 3] = NetworkSupport004.integerArrayState0052[3 + integerLocal2];
              NetworkSupport004.integerArrayState0052[4 + integerLocal1] = NetworkSupport004.integerArrayState0052[4 + integerLocal2];
            }
          }
          NetworkSupport004.integerArrayState0052[integerLocal2] = integerLocal3;
          NetworkSupport004.integerArrayState0052[integerLocal2 + 1] = integerLocal4;
          NetworkSupport004.integerArrayState0052[integerLocal2 + 2] = integerLocal5;
          NetworkSupport004.integerArrayState0052[integerLocal2 + 3] = integerLocal6;
          NetworkSupport004.integerArrayState0052[4 + integerLocal2] = integerLocal7;
          MixedSupport151.performAction2018(integerLocal2, integerArgument2, integerArgument3);
          MixedSupport151.performAction2018(integerArgument1, 5 + integerLocal2, integerArgument3 + 0);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal10 = caughtParameterLocal12;
          runtimeExceptionLocal11 = caughtExceptionLocal10;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal11), "wc.C(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ')');
        }
    }

    MixedSupport151() {
    }

    static {
        booleanState0221 = true;
        stringState0607 = "<%0> is not on your friend list.";
    }
}
