/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport107 {
    static MixedSupport132 mixedSupport132State0010;
    static int integerState0681;
    static String stringState0462;
    static byte[] byteArrayState0026;
    static String stringState0463;
    static int integerState0682;
    static int integerState0683;
    static String stringState0464;
    static int[] integerArrayState0199;
    static MixedSupport057 mixedSupport057State0004;
    static RgbSprite[][] rgbSpriteArrayArrayState0009;
    static int integerState0684;
    static String stringState0465;
    static RgbSprite[][] rgbSpriteArrayArrayState0010;

    final static String computeString1407(boolean booleanArgument1, byte byteArgument2, CharSequence charSequenceArgument3) {
        int integerLocal1 = 0;
        String stackStringLocal2 = null;
        String stackStringLocal3 = null;
        String stackStringLocal4 = null;
        String stackStringLocal5 = null;
        String stackStringLocal6 = null;
        String stackStringLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException stackRuntimeExceptionLocal9 = null;
        StringBuilder stackStringBuilderLocal10 = null;
        String stackStringLocal11 = null;
        RuntimeException caughtExceptionLocal12 = null;
        int integerLocal13 = 0;
        RuntimeException runtimeExceptionLocal14 = null;
        String stringLocal15 = null;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        integerLocal18 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (charSequenceArgument3 == null) {
            stackStringLocal2 = MixedSupport024.stringState0119;
            return stackStringLocal2;
          }
          integerLocal13 = charSequenceArgument3.length();
          if (integerLocal13 >= 1 &&
            integerLocal13 <= 12) {
            stringLocal15 = ComponentContainer.computeString0894(charSequenceArgument3, (byte) 2);
            if (stringLocal15 != null &&
              1 <= stringLocal15.length()) {
              if (!MixedSupport129.computeBoolean1650(stringLocal15.charAt(0), 32) &&
                !MixedSupport129.computeBoolean1650(stringLocal15.charAt(-1 + stringLocal15.length()), 32)) {
                if (byteArgument2 <= 12) {
                  stackStringLocal6 = (String) null;
                  return stackStringLocal6;
                }
                integerLocal16 = 0;
                for (integerLocal1 = 0; charSequenceArgument3.length() > integerLocal1; integerLocal1++) {
                  integerLocal17 = charSequenceArgument3.charAt(integerLocal1);
                  if (!MixedSupport129.computeBoolean1650((char) integerLocal17, 32)) {
                    integerLocal16 = 0;
                  } else {
                    integerLocal16++;
                  }
                  if (2 <= integerLocal16 &&
                    !booleanArgument1) {
                    stackStringLocal7 = MixedSupport133.stringState0573;
                    return stackStringLocal7;
                  }
                }
                if (integerLocal16 <= 0) {
                  return null;
                }
                stackStringLocal8 = BirthDateValidator.stringState0446;
                return stackStringLocal8;
              }
              stackStringLocal5 = BirthDateValidator.stringState0446;
              return stackStringLocal5;
            }
            stackStringLocal4 = MixedSupport024.stringState0119;
            return stackStringLocal4;
          }
          stackStringLocal3 = MixedSupport024.stringState0119;
          return stackStringLocal3;
        } catch (java.lang.RuntimeException caughtParameterLocal19) {
          caughtExceptionLocal12 = caughtParameterLocal19;
          runtimeExceptionLocal14 = caughtExceptionLocal12;
          stackRuntimeExceptionLocal9 = runtimeExceptionLocal14;
          stackStringBuilderLocal10 = new StringBuilder().append("rb.A(").append(booleanArgument1).append(',').append(byteArgument2).append(',');
          if (charSequenceArgument3 == null) {
            stackStringLocal11 = "null";
          } else {
            stackStringLocal11 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal9), ((StringBuilder) (Object) stackStringBuilderLocal10).append(stackStringLocal11).append(')').toString());
        }
    }

    final static void performAction1405(long longArgument1, String stringArgument2, int integerArgument3, int integerArgument4, int integerArgument5) {
        try {
          MixedSupport034.stringState0164 = stringArgument2;
          MixedSupport103.integerState0596 = integerArgument4;
          MixedSupport016.integerState0102 = integerArgument5;
          if (integerArgument3 > -21) {
            stringState0464 = (String) null;
          }
          MixedSupport077.longState0029 = longArgument1;
          MixedSupport017.booleanState0020 = true;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "rb.E(" + longArgument1 + ',' + (stringArgument2 != null ? "{...}" : "null") + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ')');
        }
    }

    final static boolean computeBoolean1404(int integerArgument1, int integerArgument2, int[] integerArrayArgument3) {
        RuntimeException runtimeExceptionLocal1 = null;
        boolean stackBooleanLocal2 = false;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        RuntimeException caughtExceptionLocal6 = null;
        try {
          if (integerArgument1 > -6) {
            integerState0682 = -32;
          }
          stackBooleanLocal2 = (0 != (integerArrayArgument3[integerArgument2 >> 5] & 1 << (integerArgument2 & 31)));
          return stackBooleanLocal2;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal6 = caughtParameterLocal7;
          runtimeExceptionLocal1 = caughtExceptionLocal6;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("rb.B(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (integerArrayArgument3 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(')').toString());
        }
    }

    final static void performAction1408(boolean booleanArgument1, byte byteArgument2, String stringArgument3, boolean booleanArgument4) {
        try {
          UiComponentPart033.performAction1819(-61);
          MixedSupport005.uiComponentPart016State0001.closeAllDialogs(true);
          MixedSupport025.uiComponentPart013State0001 = new LoginPanel(PlayerNamePrompt.stringState0217, (String) null, BirthDateInput.booleanState0198, booleanArgument1, booleanArgument4);
          if (byteArgument2 > -13) {
            String stringLocal1 = (String) null;
            MixedSupport107.performAction1402(false, -65, (String) null, false);
          }
          LabeledWidgetContainer.uiComponentPart023State0001 = new UiComponentPart023(MixedSupport005.uiComponentPart016State0001, MixedSupport025.uiComponentPart013State0001);
          MixedSupport005.uiComponentPart016State0001.showDialog((byte) -109, LabeledWidgetContainer.uiComponentPart023State0001);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "rb.D(" + booleanArgument1 + ',' + byteArgument2 + ',' + (stringArgument3 != null ? "{...}" : "null") + ',' + booleanArgument4 + ')');
        }
    }

    public static void clearStaticReferences(int integerArgument1) {
        byteArrayState0026 = null;
        stringState0462 = null;
        rgbSpriteArrayArrayState0010 = (RgbSprite[][]) null;
        stringState0465 = null;
        mixedSupport057State0004 = null;
        rgbSpriteArrayArrayState0009 = (RgbSprite[][]) null;
        if (integerArgument1 != 573767765) {
          stringState0462 = (String) null;
        }
        mixedSupport132State0010 = null;
        integerArrayState0199 = null;
        stringState0463 = null;
        stringState0464 = null;
    }

    final static String computeString1403(int integerArgument1, int integerArgument2, String stringArgument3) {
        RuntimeException runtimeExceptionLocal1 = null;
        int integerLocal2 = 0;
        CipherPacketBuffer cipherPacketBufferLocal3 = null;
        CharSequence charSequenceLocal4 = null;
        String stackStringLocal5 = null;
        String stackStringLocal6 = null;
        String stackStringLocal7 = null;
        String stackStringLocal8 = null;
        String stackStringLocal9 = null;
        String stackStringLocal10 = null;
        String stackStringLocal11 = null;
        Object stackObjectLocal12 = null;
        RuntimeException stackRuntimeExceptionLocal13 = null;
        StringBuilder stackStringBuilderLocal14 = null;
        String stackStringLocal15 = null;
        RuntimeException caughtExceptionLocal16 = null;
        try {
          charSequenceLocal4 = (CharSequence) ((Object) stringArgument3);
          if (!MixedSupport023.computeBoolean0340(charSequenceLocal4, (byte) -70)) {
            stackStringLocal5 = RenderingSupport003.stringState0199;
            return stackStringLocal5;
          }
          if (ThemeTips.integerState0351 != 2) {
            stackStringLocal6 = MixedSupport005.stringState0020;
            return stackStringLocal6;
          }
          if (MixedSupport066.computeBoolean0829(stringArgument3, true)) {
            stackStringLocal7 = NodeHashTable.stringState0506;
            return stackStringLocal7;
          }
          if (RenderingSupport012.computeBoolean1345(stringArgument3, integerArgument2 ^ 3)) {
            stackStringLocal8 = NodeHashTableIterator.substituteIndexedPlaceholders(111, MixedSupport033.stringState0162, new String[]{stringArgument3});
            return stackStringLocal8;
          }
          if (100 <= UiComponentPart018.integerState0502 &&
            0 >= Framebuffer.integerState0192) {
            stackStringLocal9 = HashNode.stringState0053;
            return stackStringLocal9;
          }
          if (200 <= UiComponentPart018.integerState0502) {
            stackStringLocal10 = HashNode.stringState0053;
            return stackStringLocal10;
          }
          if (MixedSupport062.computeBoolean0736(stringArgument3, (byte) -118)) {
            stackStringLocal11 = NodeHashTableIterator.substituteIndexedPlaceholders(82, MixedSupport098.stringState0414, new String[]{stringArgument3});
            return stackStringLocal11;
          }
          cipherPacketBufferLocal3 = SocketFactory.cipherPacketBufferState0002;
          cipherPacketBufferLocal3.performAction1641(integerArgument1, -4);
          cipherPacketBufferLocal3.position = cipherPacketBufferLocal3.position + 1;
          integerLocal2 = cipherPacketBufferLocal3.position;
          cipherPacketBufferLocal3.writeByte(true, 0);
          cipherPacketBufferLocal3.writeNullTerminatedString(integerArgument2, stringArgument3);
          cipherPacketBufferLocal3.writeLengthByte(-integerLocal2 + cipherPacketBufferLocal3.position, true);
          stackObjectLocal12 = null;
          return (String) (stackObjectLocal12);
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal16 = caughtParameterLocal17;
          runtimeExceptionLocal1 = caughtExceptionLocal16;
          stackRuntimeExceptionLocal13 = runtimeExceptionLocal1;
          stackStringBuilderLocal14 = new StringBuilder().append("rb.C(").append(integerArgument1).append(',').append(integerArgument2).append(',');
          if (stringArgument3 == null) {
            stackStringLocal15 = "null";
          } else {
            stackStringLocal15 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal13), ((StringBuilder) (Object) stackStringBuilderLocal14).append(stackStringLocal15).append(')').toString());
        }
    }

    final static void performAction1406(MixedSupport056 mixedSupport056Argument1, int integerArgument2) {
        int cachedIntegerLocal1 = 0;
        int cachedIntegerLocal2 = 0;
        int integerLocal3 = 0;
        int previousIntegerLocal4 = 0;
        int integerLocal5 = 0;
        RuntimeException stackRuntimeExceptionLocal6 = null;
        StringBuilder stackStringBuilderLocal7 = null;
        String stackStringLocal8 = null;
        RuntimeException caughtExceptionLocal9 = null;
        int integerLocal10 = 0;
        RuntimeException runtimeExceptionLocal11 = null;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14;
        int integerLocal15;
        integerLocal13 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          for (integerLocal10 = 0; integerLocal10 < 3; integerLocal10++) {
            FullscreenCanvas.integerArrayState0198[integerLocal10] = 0;
          }
          if (integerArgument2 != -3) {
            mixedSupport057State0004 = (MixedSupport057) null;
          }
          for (integerLocal14 = 0; MixedSupport058.integerState0317 > integerLocal14; integerLocal14++) {
            if (MixedSupport097.mixedSupport056ArrayState0001[integerLocal14].integerState0290 == mixedSupport056Argument1.integerState0290) {
              cachedIntegerLocal1 = MixedSupport097.mixedSupport056ArrayState0001[integerLocal14].computeInteger0669((byte) 94);
              FullscreenCanvas.integerArrayState0198[cachedIntegerLocal1] = FullscreenCanvas.integerArrayState0198[cachedIntegerLocal1] + 1;
            }
          }
          cachedIntegerLocal2 = mixedSupport056Argument1.computeInteger0669((byte) 94);
          FullscreenCanvas.integerArrayState0198[cachedIntegerLocal2] = FullscreenCanvas.integerArrayState0198[cachedIntegerLocal2] + 1;
          integerLocal15 = 0;
          for (integerLocal3 = 0; MixedSupport058.integerState0317 > integerLocal3; integerLocal3++) {
            boolean frameRemainderLocal16 = true;
            if (mixedSupport056Argument1.integerState0290 == MixedSupport097.mixedSupport056ArrayState0001[integerLocal3].integerState0290) {
              integerLocal12 = MixedSupport097.mixedSupport056ArrayState0001[integerLocal3].computeInteger0669((byte) 94);
              if (FullscreenCanvas.integerArrayState0198[integerLocal12] > ComponentContainer.integerState0376) {
                FullscreenCanvas.integerArrayState0198[integerLocal12] = FullscreenCanvas.integerArrayState0198[integerLocal12] - 1;
                frameRemainderLocal16 = false;
              }
            }
            if (frameRemainderLocal16) {
              previousIntegerLocal4 = integerLocal15;
              integerLocal15++;
              MixedSupport097.mixedSupport056ArrayState0001[previousIntegerLocal4] = MixedSupport097.mixedSupport056ArrayState0001[integerLocal3];
            }
          }
          MixedSupport058.integerState0317 = integerLocal15;
          integerLocal5 = MixedSupport058.integerState0317;
          MixedSupport058.integerState0317 = MixedSupport058.integerState0317 + 1;
          MixedSupport097.mixedSupport056ArrayState0001[integerLocal5] = mixedSupport056Argument1;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal17) {
          caughtExceptionLocal9 = caughtParameterLocal17;
          runtimeExceptionLocal11 = caughtExceptionLocal9;
          stackRuntimeExceptionLocal6 = runtimeExceptionLocal11;
          stackStringBuilderLocal7 = new StringBuilder().append("rb.F(");
          if (mixedSupport056Argument1 == null) {
            stackStringLocal8 = "null";
          } else {
            stackStringLocal8 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument2).append(')').toString());
        }
    }

    static {
        mixedSupport132State0010 = new MixedSupport132();
        stringState0464 = "Open in popup window";
        integerArrayState0199 = new int[]{287440998, 288563797, 288572484, 287467144, 289703987, 288594261, 288602999, 288612215, 573767765, 574894916, 572679765, 574920994, 573819955, 572718933};
        integerState0684 = 0;
        stringState0463 = "This password contains your Player Name, and would be easy to guess";
        stringState0465 = "Unfortunately your configuration doesn't support fullscreen mode.";
        integerState0682 = 0;
        rgbSpriteArrayArrayState0010 = new RgbSprite[8][];
        rgbSpriteArrayArrayState0009 = new RgbSprite[8][];
        mixedSupport057State0004 = new MixedSupport057();
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void performAction1402(boolean booleanArgument1, int integerArgument2, String stringArgument3, boolean booleanArgument4) {
        try {
          UiComponentPart033.performAction1819(-61);
          MixedSupport005.uiComponentPart016State0001.closeAllDialogs(true);
          MixedSupport025.uiComponentPart013State0001 = new LoginPanel(PlayerNamePrompt.stringState0217, (String) null, BirthDateInput.booleanState0198, booleanArgument1, booleanArgument4);
          if (integerArgument2 > -13) {
            String stringLocal1 = (String) null;
            MixedSupport107.performAction1402(false, -65, (String) null, false);
          }
          LabeledWidgetContainer.uiComponentPart023State0001 = new UiComponentPart023(MixedSupport005.uiComponentPart016State0001, MixedSupport025.uiComponentPart013State0001);
          MixedSupport005.uiComponentPart016State0001.showDialog((byte) -109, LabeledWidgetContainer.uiComponentPart023State0001);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeException), "rb.D(" + booleanArgument1 + ',' + integerArgument2 + ',' + (stringArgument3 != null ? "{...}" : "null") + ',' + booleanArgument4 + ')');
        }
    }
}
