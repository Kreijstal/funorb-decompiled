/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport069 extends MixedSupport155 {
    private String stringState0290;
    static NodeDeque nodeDequeState0011;
    static String stringState0291;
    static RawSound[] rawSoundArrayState0002;
    static int integerState0354;
    static RgbSprite rgbSpriteState0025;
    private boolean booleanState0089;

    MixedSupport069(UiComponentPart028 uiComponentPart028Argument1) {
        super(uiComponentPart028Argument1);
        this.booleanState0089 = false;
    }

    final RenderingSupport015 computeRenderingSupport0150817(String stringArgument1, byte byteArgument2) {
        MixedSupport016 mixedSupport016Local1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        String stringLocal3 = null;
        CharSequence charSequenceLocal4 = null;
        RenderingSupport015 stackRenderingSupport015Local5 = null;
        RenderingSupport015 stackRenderingSupport015Local6 = null;
        RenderingSupport015 stackRenderingSupport015Local7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        try {
          if (byteArgument2 != -40) {
            stringLocal3 = (String) null;
            MixedSupport069.computeString0936('�', (String) null, (String) null, 32);
          }
          charSequenceLocal4 = (CharSequence) ((Object) stringArgument1);
          if (!MixedSupport113.computeBoolean1609(charSequenceLocal4, byteArgument2 ^ 27418)) {
            stackRenderingSupport015Local5 = MixedSupport149.renderingSupport015State0005;
            return stackRenderingSupport015Local5;
          }
          if (!stringArgument1.equals(this.stringState0290)) {
            mixedSupport016Local1 = MixedSupport033.computeMixedSupport0160544(byteArgument2 - 11039, stringArgument1);
            if (mixedSupport016Local1 != null &&
              null == mixedSupport016Local1.stringState0075) {
              this.booleanState0089 = mixedSupport016Local1.booleanState0014;
              this.stringState0290 = stringArgument1;
            } else {
              stackRenderingSupport015Local6 = DiagnosticSupport002.renderingSupport015State0002;
              return stackRenderingSupport015Local6;
            }
          }
          if (this.booleanState0089) {
            stackRenderingSupport015Local7 = MixedSupport023.renderingSupport015State0001;
          } else {
            stackRenderingSupport015Local7 = MixedSupport149.renderingSupport015State0005;
          }
          return stackRenderingSupport015Local7;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal2 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal2;
          stackStringBuilderLocal9 = new StringBuilder().append("jm.B(");
          if (stringArgument1 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(byteArgument2).append(')').toString());
        }
    }

    final void performAction0938(boolean booleanArgument1) {
        if (!booleanArgument1) {
          this.booleanState0089 = true;
          this.stringState0290 = null;
          return;
        }
        this.stringState0290 = null;
    }

    final static void performAction0937(int integerArgument1, boolean booleanArgument2) {
        if (integerArgument1 != 0) {
          String stringLocal1 = (String) null;
          MixedSupport069.computeString0936('_', (String) null, (String) null, -55);
          if (!UiComponentPart023.computeBoolean1421(-30146)) {
            SocketFactory.cipherPacketBufferState0002.performAction1861(9, -4);
            MixedSupport087.booleanState0118 = true;
            UiComponentPart010.integerState0188 = UiComponentPart009.integerState0149;
            return;
          }
          UiComponentPart033.performAction2047(0, -80, true, 2, booleanArgument2, MixedSupport009.stringState0041);
          return;
        }
        if (!UiComponentPart023.computeBoolean1421(-30146)) {
          SocketFactory.cipherPacketBufferState0002.performAction1861(9, -4);
          MixedSupport087.booleanState0118 = true;
          UiComponentPart010.integerState0188 = UiComponentPart009.integerState0149;
          return;
        }
        UiComponentPart033.performAction2047(0, -80, true, 2, booleanArgument2, MixedSupport009.stringState0041);
    }

    final String computeString0816(String stringArgument1, byte byteArgument2) {
        String stringLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        MixedSupport016 mixedSupport016Local3 = null;
        CharSequence charSequenceLocal4 = null;
        String stackStringLocal5 = null;
        String stackStringLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException stackRuntimeExceptionLocal8 = null;
        StringBuilder stackStringBuilderLocal9 = null;
        String stackStringLocal10 = null;
        RuntimeException caughtExceptionLocal11 = null;
        try {
          charSequenceLocal4 = (CharSequence) ((Object) stringArgument1);
          stringLocal1 = MixedSupport062.computeString0822(5, charSequenceLocal4);
          if (stringLocal1 != null) {
            stackStringLocal5 = stringLocal1;
            return stackStringLocal5;
          }
          if (!stringArgument1.equals(this.stringState0290)) {
            mixedSupport016Local3 = MixedSupport033.computeMixedSupport0160544(byteArgument2 - 11068, stringArgument1);
            if (mixedSupport016Local3 == null) {
              return null;
            }
            if (null != mixedSupport016Local3.stringState0075) {
              return null;
            }
            this.stringState0290 = stringArgument1;
            this.booleanState0089 = mixedSupport016Local3.booleanState0014;
          }
          if (byteArgument2 != -11) {
            MixedSupport069.performAction0937(109, false);
          }
          if (this.booleanState0089) {
            stackStringLocal7 = MixedSupport029.stringState0147;
            return stackStringLocal7;
          }
          stackStringLocal6 = ResourceSupport003.stringState0381;
          return stackStringLocal6;
        } catch (java.lang.RuntimeException caughtParameterLocal12) {
          caughtExceptionLocal11 = caughtParameterLocal12;
          runtimeExceptionLocal2 = caughtExceptionLocal11;
          stackRuntimeExceptionLocal8 = runtimeExceptionLocal2;
          stackStringBuilderLocal9 = new StringBuilder().append("jm.A(");
          if (stringArgument1 == null) {
            stackStringLocal10 = "null";
          } else {
            stackStringLocal10 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal8), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(',').append(byteArgument2).append(')').toString());
        }
    }

    public static void performAction0940(int integerArgument1) {
        rgbSpriteState0025 = null;
        nodeDequeState0011 = null;
        stringState0291 = null;
        if (integerArgument1 <= 41) {
          rgbSpriteState0025 = (RgbSprite) null;
          rawSoundArrayState0002 = null;
          return;
        }
        rawSoundArrayState0002 = null;
    }

    final static String computeString0936(char characterArgument1, String stringArgument2, String stringArgument3, int integerArgument4) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int integerLocal4 = 0;
        RuntimeException runtimeExceptionLocal5 = null;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        StringBuilder stringBuilderLocal10 = null;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        String stackStringLocal14 = null;
        RuntimeException stackRuntimeExceptionLocal15 = null;
        StringBuilder stackStringBuilderLocal16 = null;
        String stackStringLocal17 = null;
        StringBuilder stackStringBuilderLocal18 = null;
        String stackStringLocal19 = null;
        RuntimeException caughtExceptionLocal20 = null;
        integerLocal13 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal4 = stringArgument2.length();
          integerLocal6 = stringArgument3.length();
          integerLocal7 = integerLocal4;
          integerLocal8 = -1 + integerLocal6;
          if (~integerLocal8 != integerArgument4) {
            integerLocal9 = 0;
            while (true) {
              integerLocal9 = stringArgument2.indexOf((int) characterArgument1, integerLocal9);
              if (integerLocal9 < 0) {
                break;
              }
              integerLocal7 = integerLocal7 + integerLocal8;
              integerLocal9++;
            }
          }
          stringBuilderLocal10 = new StringBuilder(integerLocal7);
          integerLocal11 = 0;
          while (true) {
            integerLocal12 = stringArgument2.indexOf((int) characterArgument1, integerLocal11);
            if (integerLocal12 < 0) {
              discarded$3 = stringBuilderLocal10.append(stringArgument2.substring(integerLocal11));
              stackStringLocal14 = stringBuilderLocal10.toString();
              return stackStringLocal14;
            }
            discarded$4 = stringBuilderLocal10.append(stringArgument2.substring(integerLocal11, integerLocal12));
            integerLocal11 = 1 + integerLocal12;
            discarded$5 = stringBuilderLocal10.append(stringArgument3);
          }
        } catch (java.lang.RuntimeException caughtParameterLocal21) {
          caughtExceptionLocal20 = caughtParameterLocal21;
          runtimeExceptionLocal5 = caughtExceptionLocal20;
          stackRuntimeExceptionLocal15 = runtimeExceptionLocal5;
          stackStringBuilderLocal16 = new StringBuilder().append("jm.L(").append(characterArgument1).append(',');
          if (stringArgument2 == null) {
            stackStringLocal17 = "null";
          } else {
            stackStringLocal17 = "{...}";
          }
          stackStringBuilderLocal18 = ((StringBuilder) (Object) stackStringBuilderLocal16).append(stackStringLocal17).append(',');
          if (stringArgument3 == null) {
            stackStringLocal19 = "null";
          } else {
            stackStringLocal19 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal15), ((StringBuilder) (Object) stackStringBuilderLocal18).append(stackStringLocal19).append(',').append(integerArgument4).append(')').toString());
        }
    }

    final static void performAction0939(boolean booleanArgument1, MixedSupport043 mixedSupport043Argument2, int integerArgument3, byte byteArgument4, boolean booleanArgument5) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        String stringLocal8 = null;
        try {
          MixedSupport102.integerArrayState0179[0] = RenderingSupport004.randomState0002.nextInt();
          MixedSupport102.integerArrayState0179[1] = RenderingSupport004.randomState0002.nextInt();
          MixedSupport102.integerArrayState0179[2] = (int)(Sprite.longState0027 >> 32);
          MixedSupport147.packetBufferState0008.position = 0;
          MixedSupport102.integerArrayState0179[3] = (int)Sprite.longState0027;
          MixedSupport147.packetBufferState0008.performAction2067(MixedSupport102.integerArrayState0179[0], false);
          MixedSupport147.packetBufferState0008.performAction2067(MixedSupport102.integerArrayState0179[1], false);
          if (byteArgument4 < 123) {
            MixedSupport069.performAction0940(2);
          }
          MixedSupport147.packetBufferState0008.performAction2067(MixedSupport102.integerArrayState0179[2], false);
          MixedSupport147.packetBufferState0008.performAction2067(MixedSupport102.integerArrayState0179[3], false);
          MixedSupport057.performAction0765(MixedSupport147.packetBufferState0008, 0);
          MixedSupport147.packetBufferState0008.performAction2087(-1, integerArgument3);
          mixedSupport043Argument2.performAction0603(MixedSupport147.packetBufferState0008, (byte) 124);
          SocketFactory.cipherPacketBufferState0002.position = 0;
          if (!booleanArgument1) {
            SocketFactory.cipherPacketBufferState0002.performAction2073(true, 16);
          } else {
            SocketFactory.cipherPacketBufferState0002.performAction2073(true, 18);
          }
          SocketFactory.cipherPacketBufferState0002.position = SocketFactory.cipherPacketBufferState0002.position + 2;
          integerLocal5 = SocketFactory.cipherPacketBufferState0002.position;
          SocketFactory.cipherPacketBufferState0002.performAction2067(CodecSupport003.integerState0686, false);
          SocketFactory.cipherPacketBufferState0002.performAction2068(MixedSupport115.longState0045, (byte) 0);
          integerLocal7 = 0;
          if (UiComponent.booleanState0017) {
            integerLocal7 = integerLocal7 | 1;
          }
          if (MixedSupport018.booleanState0021) {
            integerLocal7 = integerLocal7 | 4;
          }
          if (booleanArgument5) {
            integerLocal7 = integerLocal7 | 8;
          }
          if (null != MixedSupport146.stringState0594) {
            integerLocal7 = integerLocal7 | 16;
          }
          SocketFactory.cipherPacketBufferState0002.performAction2073(true, integerLocal7);
          stringLocal8 = MixedSupport001.computeString0016(UiComponentPart029.computeApplet1689(25144), (byte) 114);
          if (stringLocal8 == null) {
            stringLocal8 = "";
          }
          SocketFactory.cipherPacketBufferState0002.performAction2066(0, stringLocal8);
          if (MixedSupport146.stringState0594 != null) {
            SocketFactory.cipherPacketBufferState0002.performAction2078(8, MixedSupport146.stringState0594);
          }
          CodecSupport003.performAction1618(AnimatedTileRegion.bigIntegerState0004, RichTextLayout.bigIntegerState0001, SocketFactory.cipherPacketBufferState0002, MixedSupport147.packetBufferState0008, 0);
          SocketFactory.cipherPacketBufferState0002.performAction2081(true, SocketFactory.cipherPacketBufferState0002.position - integerLocal5);
          UiComponentPart033.performAction2052(4792, -1);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal4 = caughtParameterLocal9;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("jm.C(").append(booleanArgument1).append(',');
          if (mixedSupport043Argument2 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument3).append(',').append(byteArgument4).append(',').append(booleanArgument5).append(')').toString());
        }
    }

    static {
        nodeDequeState0011 = new NodeDeque();
        rawSoundArrayState0002 = new RawSound[4];
        integerState0354 = 0;
    }
}
