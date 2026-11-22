/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport095 extends MixedSupport043 {
    private String stringState0375;
    static int integerState0548;
    static String stringState0376;
    static RawSound rawSoundState0015;
    private String stringState0377;
    static RgbSprite[][][] rgbSpriteArrayArrayArrayState0001;
    static boolean booleanState0124;
    static SecondaryNodeHashTable secondaryNodeHashTableState0004;

    final static LoginCredentials computeLoginCredentials1172(byte byteArgument1) {
        int integerLocal1 = 82 % ((byteArgument1 + 59) / 56);
        return new LoginCredentials(MixedSupport033.computeString0495(116), MixedSupport032.computeBoolean0478((byte) -126));
    }

    final void performAction0548(PacketBuffer packetBufferArgument1, byte byteArgument2) {
        try {
          packetBufferArgument1.writeNullCircumfixedString(8, this.stringState0377);
          if (byteArgument2 < 34) {
            MixedSupport095.computeSceneWidgetPart0131169(-10, 21);
          }
          packetBufferArgument1.writeBase38String(this.stringState0375, true);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) runtimeException), "ob.D(" + (packetBufferArgument1 != null ? "{...}" : "null") + ',' + byteArgument2 + ')');
        }
    }

    final static SceneWidgetPart013 computeSceneWidgetPart0131169(int integerArgument1, int integerArgument2) {
        if (integerArgument2 != 8) {
          stringState0376 = (String) null;
        }
        return MixedSupport127.secondaryNodeHashTableState0005 != null ? (SceneWidgetPart013) (MixedSupport127.secondaryNodeHashTableState0005.get(integerArgument2 ^ 24718, (long)integerArgument1)) : null;
    }

    final static RgbSprite[] computeRgbSpriteArray1170(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        int integerLocal1 = 0;
        int integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        RgbSprite[] rgbSpriteArrayLocal3 = new RgbSprite[9];
        RgbSprite[] rgbSpriteArrayLocal4 = rgbSpriteArrayLocal3;
        rgbSpriteArrayLocal3[0] = NetworkSupport012.computeRgbSprite1559((byte) -99, integerArgument4, integerArgument1);
        for (integerLocal1 = 1; integerLocal1 < 9; integerLocal1++) {
          rgbSpriteArrayLocal3[integerLocal1] = rgbSpriteArrayLocal3[0];
        }
        if (integerArgument3 != -3932) {
          MixedSupport095.performAction1168((byte) 72);
        }
        rgbSpriteArrayLocal4[4] = NetworkSupport012.computeRgbSprite1559((byte) -122, 64, integerArgument2);
        return rgbSpriteArrayLocal4;
    }

    final MixedSupport048 computeMixedSupport0480546(int integerArgument1) {
        if (integerArgument1 != 18) {
          return (MixedSupport048) null;
        }
        return GameDomainSupport005.mixedSupport048State0002;
    }

    final static void performAction1171(int integerArgument1, MusicTrack musicTrackArgument2, byte byteArgument3) {
        int integerLocal1 = 0;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (PcmPlayerService.musicTrackState0005 != musicTrackArgument2) {
            if (PcmPlayerService.musicTrackState0005 != null &&
              musicTrackArgument2 != null) {
              UiComponentPart033.midiSynthesizerState0001.performAction0698(musicTrackArgument2, 0, 0, 16);
              PcmPlayerService.musicTrackState0005 = musicTrackArgument2;
              UiComponentPart033.midiSynthesizerState0001.performAction0701(integerArgument1);
            } else {
              MixedSupport092.performAction1161(integerArgument1, musicTrackArgument2, true);
            }
          } else {
            UiComponentPart033.midiSynthesizerState0001.performAction0701(integerArgument1);
          }
          if (byteArgument3 < 45) {
            integerState0548 = 64;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("ob.C(").append(integerArgument1).append(',');
          if (musicTrackArgument2 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(',').append(byteArgument3).append(')').toString());
        }
    }

    public static void performAction1168(byte byteArgument1) {
        secondaryNodeHashTableState0004 = null;
        rgbSpriteArrayArrayArrayState0001 = (RgbSprite[][][]) null;
        stringState0376 = null;
        if (byteArgument1 < 86) {
          MixedSupport095.computeRgbSpriteArray1170(-105, -21, 61, -11);
        }
        rawSoundState0015 = null;
    }

    final static void performAction1173(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        if (256 == integerArgument3) {
          MixedSupport105.rgbSpriteState0042.performAction0295(integerArgument1, integerArgument4, 64);
        } else {
          MixedSupport105.rgbSpriteState0042.performAction0295(integerArgument1, integerArgument4, integerArgument3 >> 2);
        }
        if (integerArgument2 != -299374302) {
          MixedSupport095.performAction1168((byte) 0);
        }
    }

    MixedSupport095(String stringArgument1, String stringArgument2) {
        try {
          this.stringState0377 = stringArgument1;
          this.stringState0375 = stringArgument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020367((Throwable) ((Object) runtimeException), "ob.<init>(" + (stringArgument1 != null ? "{...}" : "null") + ',' + (stringArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        stringState0376 = "Message game";
        rgbSpriteArrayArrayArrayState0001 = new RgbSprite[8][7][16];
    }
}
