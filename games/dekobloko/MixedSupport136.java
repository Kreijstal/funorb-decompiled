/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport136 extends HashNode {
    static int[] integerArrayState0211;
    int integerState0800;
    static String stringState0559;
    int integerState0801;

    final static void performAction1873(MixedSupport145 mixedSupport145Argument1, int integerArgument2, int integerArgument3, int integerArgument4, boolean booleanArgument5, int integerArgument6, int integerArgument7, int integerArgument8) {
        int stackIntegerLocal1 = 0;
        int[] stackIntegerArrayLocal2 = null;
        int stackIntegerLocal3 = 0;
        int stackIntegerLocal4 = 0;
        int stackIntegerLocal5 = 0;
        int stackIntegerLocal6 = 0;
        ClientException stackClientExceptionLocal7 = null;
        int stackIntegerLocal8 = 0;
        int stackIntegerLocal9;
        int stackIntegerLocal10;
        int stackIntegerLocal11;
        int stackIntegerLocal12;
        int stackIntegerLocal13;
        int stackIntegerLocal14;
        int stackIntegerLocal15;
        int stackIntegerLocal16;
        int stackIntegerLocal17;
        int stackIntegerLocal18;
        int stackIntegerLocal19;
        int stackIntegerLocal20;
        boolean stackBooleanLocal21;
        int stackIntegerLocal22 = 0;
        RuntimeException stackRuntimeExceptionLocal23 = null;
        StringBuilder stackStringBuilderLocal24 = null;
        String stackStringLocal25 = null;
        RuntimeException caughtExceptionLocal26 = null;
        int[] integerArrayLocal27 = null;
        RuntimeException runtimeExceptionLocal28 = null;
        int integerLocal29 = 0;
        int integerLocal30 = 0;
        int integerLocal31 = 0;
        int integerLocal32 = 0;
        int integerLocal33 = 0;
        int integerLocal34 = 0;
        int integerLocal35 = 0;
        int integerLocal36 = 0;
        ClientException clientExceptionLocal37 = null;
        int integerLocal38 = 0;
        int integerLocal39 = 0;
        int integerLocal40 = 0;
        int integerLocal41 = 0;
        int integerLocal42 = 0;
        int integerLocal43 = 0;
        int integerLocal44 = 0;
        int integerLocal45 = 0;
        int integerLocal46 = 0;
        int integerLocal47 = 0;
        int integerLocal48 = 0;
        int integerLocal49 = 0;
        int integerLocal50 = 0;
        int integerLocal51 = 0;
        int integerLocal52 = 0;
        int integerLocal53 = 0;
        int integerLocal54 = 0;
        int integerLocal55 = 0;
        int integerLocal56 = 0;
        int[] integerArrayLocal57 = null;
        MixedSupport145 mixedSupport145Local58 = null;
        int[] integerArrayLocal59 = null;
        int[] integerArrayLocal60 = null;
        byte[] byteArrayLocal61 = null;
        int[] integerArrayLocal62 = null;
        int[] integerArrayLocal63 = null;
        int[] integerArrayLocal64 = null;
        int[] integerArrayLocal65 = null;
        int integerLocal66;
        int integerLocal67;
        int integerLocal68;
        int integerLocal69;
        int integerLocal70;
        integerLocal56 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          mixedSupport145Local58 = mixedSupport145Argument1;
          if (booleanArgument5) {
            integerArrayState0211 = (int[]) null;
          }
          if (mixedSupport145Local58.byteArrayState0033 != null &&
            mixedSupport145Local58.byteState0004 > 1) {
            byteArrayLocal61 = mixedSupport145Local58.byteArrayState0033;
            GameAssets.performAction1702(byteArrayLocal61, -25724, 0, SceneWidgetPart008.integerArrayState0170, 0);
          } else {
            MixedSupport073.performAction1017(2);
          }
          integerArrayLocal60 = new int[mixedSupport145Argument1.shortState0002];
          integerArrayLocal59 = integerArrayLocal60;
          integerArrayLocal57 = integerArrayLocal59;
          integerArrayLocal27 = integerArrayLocal57;
          integerArrayLocal65 = new int[mixedSupport145Argument1.shortState0002];
          integerArrayLocal63 = UiComponentPart015.integerArrayState0100;
          integerArrayLocal62 = MixedSupport009.integerArrayState0016;
          integerArrayLocal64 = MixedSupport120.integerArrayState0205;
          for (integerLocal29 = 0; mixedSupport145Argument1.shortState0002 > integerLocal29; integerLocal29++) {
            integerLocal30 = integerArrayLocal62[integerLocal29] * integerArgument2 + integerArrayLocal63[integerLocal29] * integerArgument4 + integerArrayLocal64[integerLocal29] * integerArgument7 >> 8;
            if (integerLocal30 < 0) {
              integerLocal30 = -integerLocal30;
            }
            if (0 > integerLocal30) {
              stackIntegerLocal1 = 128;
            } else {
              if (integerLocal30 < 128) {
                stackIntegerLocal1 = integerLocal30 + 128;
              } else {
                stackIntegerLocal1 = 256;
              }
            }
            integerLocal69 = stackIntegerLocal1;
            integerLocal31 = integerArgument3 * integerArrayLocal63[integerLocal29] + integerArrayLocal62[integerLocal29] * integerArgument8 + integerArrayLocal64[integerLocal29] * integerArgument6 >> 8;
            stackIntegerArrayLocal2 = MixedSupport017.integerArrayState0023;
            if (integerLocal31 >= 0) {
              stackIntegerLocal3 = integerLocal31;
            } else {
              stackIntegerLocal3 = -integerLocal31;
            }
            integerLocal70 = stackIntegerArrayLocal2[stackIntegerLocal3];
            integerLocal69 = (256 - integerLocal70) * integerLocal69 >>> 8;
            integerArrayLocal60[integerLocal29] = integerLocal69;
            integerArrayLocal65[integerLocal29] = integerLocal70;
          }
          for (integerLocal66 = 0; integerLocal66 < MixedSupport124.integerState0771; integerLocal66++) {
            integerLocal67 = SceneWidgetPart004.integerArrayState0053[integerLocal66];
            integerLocal68 = mixedSupport145Argument1.shortArrayState0002[integerLocal67];
            integerLocal32 = mixedSupport145Argument1.shortArrayState0015[integerLocal67];
            integerLocal33 = mixedSupport145Argument1.shortArrayState0008[integerLocal67];
            if (UiComponentPart015.integerArrayState0100.length > mixedSupport145Argument1.shortArrayState0005[integerLocal67]) {
              stackIntegerLocal4 = mixedSupport145Argument1.shortArrayState0005[integerLocal67];
            } else {
              stackIntegerLocal4 = -1;
            }
            integerLocal34 = stackIntegerLocal4;
            if (UiComponentPart015.integerArrayState0100.length > mixedSupport145Argument1.shortArrayState0014[integerLocal67]) {
              stackIntegerLocal5 = mixedSupport145Argument1.shortArrayState0014[integerLocal67];
            } else {
              stackIntegerLocal5 = -1;
            }
            integerLocal35 = stackIntegerLocal5;
            if (UiComponentPart015.integerArrayState0100.length <= mixedSupport145Argument1.shortArrayState0006[integerLocal67]) {
              stackIntegerLocal6 = -1;
            } else {
              stackIntegerLocal6 = mixedSupport145Argument1.shortArrayState0006[integerLocal67];
            }
            integerLocal36 = stackIntegerLocal6;
            if (null != MixedSupport077.clientExceptionArrayState0001 &&
              null != mixedSupport145Argument1.shortArrayState0012 &&
              mixedSupport145Argument1.shortArrayState0012.length > integerLocal67 &&
              mixedSupport145Argument1.shortArrayState0012[integerLocal67] != -1 &&
              MixedSupport077.clientExceptionArrayState0001.length > mixedSupport145Argument1.shortArrayState0012[integerLocal67]) {
              stackClientExceptionLocal7 = MixedSupport077.clientExceptionArrayState0001[mixedSupport145Argument1.shortArrayState0012[integerLocal67]];
            } else {
              stackClientExceptionLocal7 = null;
            }
            clientExceptionLocal37 = stackClientExceptionLocal7;
            integerLocal38 = MixedSupport075.integerArrayState0137[integerLocal68];
            integerLocal39 = MixedSupport116.integerArrayState0200[integerLocal68];
            integerLocal40 = MixedSupport075.integerArrayState0137[integerLocal32];
            integerLocal41 = MixedSupport116.integerArrayState0200[integerLocal32];
            integerLocal42 = MixedSupport075.integerArrayState0137[integerLocal33];
            integerLocal43 = MixedSupport116.integerArrayState0200[integerLocal33];
            if (integerLocal34 == integerLocal35 &&
              integerLocal36 == integerLocal35) {
              integerLocal44 = integerArrayLocal60[integerLocal34];
              integerLocal45 = integerArrayLocal65[integerLocal34];
              if (clientExceptionLocal37 != null) {
                stackIntegerLocal22 = clientExceptionLocal37.integerState0139;
              } else {
                stackIntegerLocal22 = 8355711;
              }
              integerLocal46 = stackIntegerLocal22;
              integerLocal47 = integerLocal46 & 16711935;
              integerLocal48 = integerLocal46 & 65280;
              integerLocal49 = 1476460288 & integerLocal48 * integerLocal44 >>> 8 | -268500737 & integerLocal47 * integerLocal44 >>> 8;
              integerLocal49 = integerLocal49 + 65793 * integerLocal45;
              RenderingSupport015.performAction1777(integerLocal39, integerLocal43, integerLocal38, integerLocal49 >> 1 & 8355711, integerLocal40, integerLocal41, 127, integerLocal42);
            } else {
              integerLocal44 = integerArrayLocal60[integerLocal34];
              integerLocal45 = integerArrayLocal60[integerLocal35];
              integerLocal46 = integerArrayLocal60[integerLocal36];
              integerLocal47 = integerArrayLocal65[integerLocal34];
              integerLocal48 = integerArrayLocal65[integerLocal35];
              integerLocal49 = integerArrayLocal65[integerLocal36];
              if (clientExceptionLocal37 != null) {
                stackIntegerLocal8 = clientExceptionLocal37.integerState0139;
              } else {
                stackIntegerLocal8 = 8355711;
              }
              integerLocal50 = stackIntegerLocal8;
              integerLocal51 = integerLocal50 & 16711935;
              integerLocal52 = integerLocal50 & 65280;
              integerLocal53 = (16711810 & integerLocal52 * integerLocal44) >>> 8 | (integerLocal51 * integerLocal44 & -16711879) >>> 8;
              integerLocal54 = integerLocal51 * integerLocal45 >>> 8 & 285147391 | integerLocal52 * integerLocal45 >>> 8 & 1291910912;
              integerLocal55 = -755040001 & integerLocal51 * integerLocal46 >>> 8 | integerLocal52 * integerLocal46 >>> 8 & -2046755072;
              integerLocal53 = integerLocal53 + integerLocal47 * 65793;
              integerLocal54 = integerLocal54 + integerLocal48 * 65793;
              integerLocal55 = integerLocal55 + integerLocal49 * 65793;
              stackIntegerLocal9 = integerLocal53 & 255;
              stackIntegerLocal10 = integerLocal41;
              stackIntegerLocal11 = integerLocal38;
              stackIntegerLocal12 = integerLocal55 >> 16;
              stackIntegerLocal13 = integerLocal40;
              stackIntegerLocal14 = integerLocal53 >> 16;
              stackIntegerLocal15 = integerLocal55 & 255;
              stackIntegerLocal16 = 255 & integerLocal54;
              stackIntegerLocal17 = integerLocal43;
              stackIntegerLocal18 = integerLocal54 >> 16;
              stackIntegerLocal19 = integerLocal55 >> 8 & 255;
              stackIntegerLocal20 = integerLocal39;
              stackBooleanLocal21 = !(booleanArgument5);
              SoftwareFramebuffer.performAction2028(stackIntegerLocal9, stackIntegerLocal10, stackIntegerLocal11, stackIntegerLocal12, stackIntegerLocal13, stackIntegerLocal14, stackIntegerLocal15, stackIntegerLocal16, stackIntegerLocal17, stackIntegerLocal18, stackIntegerLocal19, stackIntegerLocal20, stackBooleanLocal21, integerLocal53 >> 8 & 255, integerLocal42, 255 & integerLocal54 >> 8);
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal71) {
          caughtExceptionLocal26 = caughtParameterLocal71;
          runtimeExceptionLocal28 = caughtExceptionLocal26;
          stackRuntimeExceptionLocal23 = runtimeExceptionLocal28;
          stackStringBuilderLocal24 = new StringBuilder().append("ug.B(");
          if (mixedSupport145Argument1 == null) {
            stackStringLocal25 = "null";
          } else {
            stackStringLocal25 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal23), ((StringBuilder) (Object) stackStringBuilderLocal24).append(stackStringLocal25).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(booleanArgument5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',').append(integerArgument8).append(')').toString());
        }
    }

    final static boolean computeBoolean1872(CharSequence charSequenceArgument1, boolean booleanArgument2, int integerArgument3) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (!MixedSupport014.computeBoolean0214(booleanArgument2, charSequenceArgument1, 4564)) {
            return false;
          }
          for (integerLocal1 = 0; integerLocal1 < charSequenceArgument1.length(); integerLocal1++) {
            if (!MixedSupport018.computeBoolean0273(charSequenceArgument1.charAt(integerLocal1), (byte) 82)) {
              return false;
            }
          }
          integerLocal3 = -86 % ((-31 - integerArgument3) / 56);
          return true;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          runtimeExceptionLocal2 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("ug.A(");
          if (charSequenceArgument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(booleanArgument2).append(',').append(integerArgument3).append(')').toString());
        }
    }

    public static void performAction1871(int integerArgument1) {
        integerArrayState0211 = null;
        if (integerArgument1 != -21771) {
          CharSequence charSequenceLocal1 = (CharSequence) null;
          MixedSupport136.computeBoolean1872((CharSequence) null, false, -92);
        }
        stringState0559 = null;
    }

    private MixedSupport136() throws Throwable {
        throw new Error();
    }

    final static boolean computeBoolean1870(char characterArgument1, int integerArgument2) {
        boolean stackBooleanLocal1 = false;
        if (integerArgument2 != 32) {
          return false;
        }
        stackBooleanLocal1 = (160 == characterArgument1) || (characterArgument1 == 32) || (characterArgument1 == 95) || (characterArgument1 == 45);
        return stackBooleanLocal1;
    }

    static {
        stringState0559 = "The Controls";
    }
}
