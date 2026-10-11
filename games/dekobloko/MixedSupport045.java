/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport045 implements CallbackContract007 {
    static String stringState0189;
    static MixedSupport066 mixedSupport066State0003;
    static String stringState0190;
    static String stringState0191;
    static String stringState0192;

    final static int computeInteger0612(int integerArgument1, int integerArgument2, int integerArgument3, String stringArgument4, int integerArgument5, int integerArgument6, int integerArgument7, BitmapFont bitmapFontArgument8, byte byteArgument9, int integerArgument10, int integerArgument11) {
        int integerLocal1 = 0;
        RuntimeException runtimeExceptionLocal2 = null;
        int stackIntegerLocal3 = 0;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        try {
          integerLocal1 = 2;
          if (bitmapFontArgument8 == UiComponentPart029.renderingSupport010State0005) {
            integerLocal1 = 1;
          }
          bitmapFontArgument8.computeInteger1213(stringArgument4, integerArgument11 - integerLocal1, -integerLocal1 + integerArgument3, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
          bitmapFontArgument8.computeInteger1213(stringArgument4, -integerLocal1 + integerArgument11, integerArgument3, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
          bitmapFontArgument8.computeInteger1213(stringArgument4, integerArgument11 - integerLocal1, integerArgument3 + integerLocal1, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
          bitmapFontArgument8.computeInteger1213(stringArgument4, integerArgument11, -integerLocal1 + integerArgument3, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
          if (byteArgument9 > -123) {
            MixedSupport045.performAction0614(false, -18, 81);
          }
          bitmapFontArgument8.computeInteger1213(stringArgument4, integerArgument11, integerArgument3 + integerLocal1, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
          bitmapFontArgument8.computeInteger1213(stringArgument4, integerArgument11 + integerLocal1, integerArgument3 - integerLocal1, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
          bitmapFontArgument8.computeInteger1213(stringArgument4, integerArgument11 + integerLocal1, integerArgument3, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
          bitmapFontArgument8.computeInteger1213(stringArgument4, integerLocal1 + integerArgument11, integerArgument3 + integerLocal1, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
          if (bitmapFontArgument8 == SceneWidget.renderingSupport010State0007) {
            bitmapFontArgument8.computeInteger1213(stringArgument4, 1 + integerArgument11, -integerLocal1 + integerArgument3, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
            bitmapFontArgument8.computeInteger1213(stringArgument4, integerArgument11 - 1, -integerLocal1 + integerArgument3, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
            bitmapFontArgument8.computeInteger1213(stringArgument4, integerArgument11 + integerLocal1, -1 + integerArgument3, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
            bitmapFontArgument8.computeInteger1213(stringArgument4, -integerLocal1 + integerArgument11, integerArgument3 - 1, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
            bitmapFontArgument8.computeInteger1213(stringArgument4, integerLocal1 + integerArgument11, 1 + integerArgument3, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
            bitmapFontArgument8.computeInteger1213(stringArgument4, integerArgument11 - integerLocal1, integerArgument3 + 1, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
            bitmapFontArgument8.computeInteger1213(stringArgument4, integerArgument11 + 1, integerLocal1 + integerArgument3, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
            bitmapFontArgument8.computeInteger1213(stringArgument4, -1 + integerArgument11, integerArgument3 + integerLocal1, integerArgument1, integerArgument6, 65793, -1, integerArgument10, integerArgument2, integerArgument5);
          }
          stackIntegerLocal3 = bitmapFontArgument8.computeInteger1213(stringArgument4, integerArgument11, integerArgument3, integerArgument1, integerArgument6, integerArgument7, -1, integerArgument10, integerArgument2, integerArgument5);
          return stackIntegerLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal9 = caughtParameterLocal10;
          runtimeExceptionLocal2 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal4 = runtimeExceptionLocal2;
          stackStringBuilderLocal5 = new StringBuilder().append("ga.B(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',');
          if (stringArgument4 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          stackStringBuilderLocal7 = ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(',').append(integerArgument5).append(',').append(integerArgument6).append(',').append(integerArgument7).append(',');
          if (bitmapFontArgument8 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(byteArgument9).append(',').append(integerArgument10).append(',').append(integerArgument11).append(')').toString());
        }
    }

    public static void performAction0611(byte byteArgument1) {
        stringState0192 = null;
        stringState0189 = null;
        stringState0191 = null;
        if (byteArgument1 != -52) {
          stringState0189 = (String) null;
        }
        mixedSupport066State0003 = null;
        stringState0190 = null;
    }

    final static void performAction0615(byte byteArgument1) {
        MixedSupport002.nodeDequeState0001 = new NodeDeque();
        if (byteArgument1 != -112) {
          mixedSupport066State0003 = (MixedSupport066) null;
        }
    }

    final static void performAction0614(boolean booleanArgument1, int integerArgument2, int integerArgument3) {
        if (booleanArgument1) {
          stringState0190 = (String) null;
        }
        CipherPacketBuffer cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
        cipherPacketBufferLocal1.performAction1861(integerArgument3, -4);
        cipherPacketBufferLocal1.performAction2073(true, 3);
        cipherPacketBufferLocal1.performAction2073(true, 10);
        cipherPacketBufferLocal1.performAction2087(-1, integerArgument2);
    }

    final static MixedSupport066 computeMixedSupport0660613(int integerArgument1, String stringArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        MixedSupport066 stackMixedSupport066Local5 = null;
        MixedSupport066 stackMixedSupport066Local6 = null;
        MixedSupport066 stackMixedSupport066Local7 = null;
        MixedSupport066 stackMixedSupport066Local8 = null;
        RuntimeException stackRuntimeExceptionLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        RuntimeException runtimeExceptionLocal13 = null;
        integerLocal4 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal1 = stringArgument2.length();
          if (integerLocal1 == 0) {
            stackMixedSupport066Local5 = InputAdapter003.mixedSupport066State0004;
            return stackMixedSupport066Local5;
          }
          if (integerLocal1 > 63) {
            stackMixedSupport066Local6 = (MixedSupport066) (mixedSupport066State0003);
            return stackMixedSupport066Local6;
          }
          integerLocal2 = 0;
          if (integerArgument1 != 7017) {
            stringState0189 = (String) null;
          }
          while (integerLocal2 < integerLocal1) {
            integerLocal3 = stringArgument2.charAt(integerLocal2);
            if (45 == integerLocal3) {
              if (integerLocal2 == 0 ||
                integerLocal2 == -1 + integerLocal1) {
                stackMixedSupport066Local7 = DualNode.mixedSupport066State0001;
                return stackMixedSupport066Local7;
              }
            } else {
              if (MixedSupport141.stringState0576.indexOf(integerLocal3) == -1) {
                stackMixedSupport066Local8 = DualNode.mixedSupport066State0001;
                return stackMixedSupport066Local8;
              }
            }
            integerLocal2++;
          }
          return null;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal12 = caughtParameterLocal14;
          runtimeExceptionLocal13 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal9 = runtimeExceptionLocal13;
          stackStringBuilderLocal10 = new StringBuilder().append("ga.A(").append(integerArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal9), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(')').toString());
        }
    }

    static {
        stringState0189 = "If you do nothing the game will revert to normal view in <%0> seconds.";
        stringState0190 = "Rating";
        mixedSupport066State0003 = new MixedSupport066();
        stringState0191 = "Confirm Password: ";
        stringState0192 = "Loading backgrounds";
    }
}
