/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class UiComponentPart033 extends UiComponentPart012 implements CallbackContract019 {
    static MidiSynthesizer midiSynthesizerState0001;
    static SceneWidget sceneWidgetState0150;
    static NetworkSupport012 networkSupport012State0001;
    private boolean booleanState0225;
    private UiComponentPart031 uiComponentPart031State0002;
    static String stringState0623;
    private boolean booleanState0226;
    static MixedSupport121 mixedSupport121State0004;
    static int integerState0934;

    final boolean computeBoolean0182(byte byteArgument1) {
        MixedSupport016 mixedSupport016Local1 = null;
        if (byteArgument1 <= 15) {
          this.uiComponentPart031State0002 = (UiComponentPart031) null;
        }
        if (this.booleanState0011 &&
          !this.booleanState0225) {
          mixedSupport016Local1 = AudioSupport002.computeMixedSupport0160882(13);
          if (mixedSupport016Local1 != null) {
            this.performAction2049(false, mixedSupport016Local1, false);
          }
        }
        return super.computeBoolean0182((byte) 117);
    }

    final static void performAction2053(int integerArgument1) {
        SceneWidgetPart007.booleanState0113 = false;
        int integerLocal1 = -22 % ((-14 - integerArgument1) / 35);
        UiComponentPart032.booleanState0198 = false;
        InputAdapter003.performAction0749(-1, (byte) -122);
        UiComponentPart016.mixedSupport004State0001 = MixedSupport134.mixedSupport004State0005;
        GameAssets.mixedSupport004State0004 = MixedSupport134.mixedSupport004State0005;
    }

    public final void performAction0341(byte byteArgument1, int integerArgument2, InteractiveComponent interactiveComponentArgument3, int integerArgument4, int integerArgument5) {
        if (this.booleanState0226) {
          NetworkSupport003.performAction0380(false, true, (byte) 66);
          return;
        }
        try {
          RenderingSupport006.performAction0846((byte) -51);
          this.performAction0655(-128);
          if (byteArgument1 != 67) {
            mixedSupport121State0004 = (MixedSupport121) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wj.H(" + byteArgument1 + ',' + integerArgument2 + ',' + (interactiveComponentArgument3 != null ? "{...}" : "null") + ',' + integerArgument4 + ',' + integerArgument5 + ')');
        }
    }

    final static void performAction2047(int integerArgument1, int integerArgument2, boolean booleanArgument3, int integerArgument4, boolean booleanArgument5, String stringArgument6) {
        RgbSprite rgbSpriteLocal1 = null;
        RuntimeException stackRuntimeExceptionLocal2 = null;
        StringBuilder stackStringBuilderLocal3 = null;
        String stackStringLocal4 = null;
        RuntimeException caughtExceptionLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        try {
          UiComponentPart006.performAction0387(booleanArgument5, -5540, stringArgument6, integerArgument1, booleanArgument3);
          MixedSupport037.integerState0224 = integerArgument4;
          CacheWorkQueue.booleanState0079 = !booleanArgument3;
          if (integerArgument2 >= -70) {
            rgbSpriteLocal1 = (RgbSprite) null;
            UiComponentPart033.performAction2048((RgbSprite) null, 81);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal7) {
          caughtExceptionLocal5 = caughtParameterLocal7;
          runtimeExceptionLocal6 = caughtExceptionLocal5;
          stackRuntimeExceptionLocal2 = runtimeExceptionLocal6;
          stackStringBuilderLocal3 = new StringBuilder().append("wj.K(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(booleanArgument3).append(',').append(integerArgument4).append(',').append(booleanArgument5).append(',');
          if (stringArgument6 == null) {
            stackStringLocal4 = "null";
          } else {
            stackStringLocal4 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal2), ((StringBuilder) (Object) stackStringBuilderLocal3).append(stackStringLocal4).append(')').toString());
        }
    }

    final static void performAction2050(boolean booleanArgument1, java.awt.Frame frameArgument2, PlatformService platformServiceArgument3) {
        AsyncTask asyncTaskLocal1 = null;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        RuntimeException runtimeExceptionLocal9 = null;
        integerLocal2 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (!booleanArgument1) {
            UiComponentPart033.performAction2053(92);
          }
          while (true) {
            asyncTaskLocal1 = platformServiceArgument3.computeAsyncTask0567(75254128, frameArgument2);
            while (asyncTaskLocal1.integerState0510 == 0) {
              MixedSupport132.performAction1837(10L, -128);
            }
            if (asyncTaskLocal1.integerState0510 != 1) {
              MixedSupport132.performAction1837(100L, -128);
              continue;
            }
            break;
          }
          frameArgument2.setVisible(false);
          frameArgument2.dispose();
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal10) {
          caughtExceptionLocal8 = caughtParameterLocal10;
          runtimeExceptionLocal9 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal9;
          stackStringBuilderLocal4 = new StringBuilder().append("wj.N(").append(booleanArgument1).append(',');
          if (frameArgument2 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (platformServiceArgument3 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    final static void performAction2052(int integerArgument1, int integerArgument2) {
        try {
          IOException iOException = null;
          Throwable caughtExceptionLocal2 = null;
          if (GameSession.bufferedSocketState0002 != null && (integerArgument2 < 0 ||
            UiComponentPart023.mixedSupport139State0009 == SoftwareFramebuffer.mixedSupport139State0012)) {
            if (SocketFactory.cipherPacketBufferState0002.position == 0 &&
              MixedSupport063.computeLong0827(4) > 10000L + ArchiveRequestManager.longState0011) {
              SocketFactory.cipherPacketBufferState0002.performAction1861(integerArgument2, -4);
            }
            if (integerArgument1 != 4792) {
              stringState0623 = (String) null;
            }
            if (SocketFactory.cipherPacketBufferState0002.position > 0) {
              try {
                GameSession.bufferedSocketState0002.performAction1557(0, SocketFactory.cipherPacketBufferState0002.position, 1, SocketFactory.cipherPacketBufferState0002.payload);
                ArchiveRequestManager.longState0011 = MixedSupport063.computeLong0827(integerArgument1 ^ 4796);
              } catch (java.io.IOException caughtParameterLocal3) {
                caughtExceptionLocal2 = caughtParameterLocal3;
                iOException = (IOException) (Object) caughtExceptionLocal2;
                NodeHashTable.performAction1703(100);
              }
              SocketFactory.cipherPacketBufferState0002.position = 0;
            }
            return;
          }
          SocketFactory.cipherPacketBufferState0002.position = 0;
        } catch (RuntimeException | Error uncheckedExceptionLocal4) {
          throw uncheckedExceptionLocal4;
        } catch (Throwable checkedExceptionLocal5) {
          throw new RuntimeException(checkedExceptionLocal5);
        }
    }

    UiComponentPart033(UiComponentPart016 uiComponentPart016Argument1, UiComponentPart031 uiComponentPart031Argument2) {
        super(uiComponentPart016Argument1, GameDomainSupport002.bitmapFontState0012, CollectionSupport001.stringState0098, false, false);
        try {
          this.uiComponentPart031State0002 = uiComponentPart031Argument2;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wj.<init>(" + (uiComponentPart016Argument1 != null ? "{...}" : "null") + ',' + (uiComponentPart031Argument2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void performAction2049(boolean booleanArgument1, MixedSupport016 mixedSupport016Argument2, boolean booleanArgument3) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        String stringLocal5 = null;
        RuntimeException runtimeExceptionLocal6 = null;
        UiComponentPart008 uiComponentPart008Local7 = null;
        int integerLocal8 = 0;
        integerLocal8 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          this.booleanState0225 = true;
          if (mixedSupport016Argument2.booleanState0014) {
            stringLocal5 = SoftwareFramebuffer.stringState0618;
          } else {
            if (null != mixedSupport016Argument2.stringArrayState0003) {
              stringLocal5 = ResourceSupport003.stringState0381;
              if (this.uiComponentPart031State0002 != null) {
                this.uiComponentPart031State0002.performAction0342(25);
              }
            } else {
              stringLocal5 = mixedSupport016Argument2.stringState0075;
              if (mixedSupport016Argument2.integerState0101 == 248) {
                if (!booleanArgument1) {
                  MixedSupport070.performAction0941((byte) -36);
                }
                this.booleanState0226 = true;
                stringLocal5 = DualNodeDeque.stringState0007;
              }
            }
          }
          uiComponentPart008Local7 = new UiComponentPart008((UiComponentPart012) (this), GameDomainSupport002.bitmapFontState0012, stringLocal5);
          if (!mixedSupport016Argument2.booleanState0014) {
            if (!this.booleanState0226) {
              if (mixedSupport016Argument2.integerState0101 == 5) {
                uiComponentPart008Local7.performAction0406(GameDomainSupport005.stringState0406, 11, 14);
                uiComponentPart008Local7.performAction0406(SceneWidgetPart005.stringState0255, 17, 14);
              } else {
                uiComponentPart008Local7.performAction0406(UiComponentPart003.stringState0060, -1, 14);
              }
            } else {
              uiComponentPart008Local7.computeInteractiveComponent0405(115, MixedSupport034.stringState0163, (CallbackContract006) (this));
            }
            if (mixedSupport016Argument2.integerState0101 == 3) {
              uiComponentPart008Local7.performAction0406(UiComponent.stringState0079, 7, 14);
            } else {
              if (mixedSupport016Argument2.integerState0101 == 6) {
                uiComponentPart008Local7.performAction0406(UiComponentPart032.stringState0580, 9, 14);
              }
            }
          } else {
            if (mixedSupport016Argument2.booleanState0013) {
              this.performAction0201(new UiComponentPart018(this), (byte) 79);
              return;
            }
            uiComponentPart008Local7.computeInteractiveComponent0405(119, MixedSupport034.stringState0163, (CallbackContract006) (this));
          }
          this.performAction0201(uiComponentPart008Local7, (byte) 68);
          if (booleanArgument3) {
            integerState0934 = 4;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal4 = caughtParameterLocal9;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("wj.M(").append(booleanArgument1).append(',');
          if (mixedSupport016Argument2 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(booleanArgument3).append(')').toString());
        }
    }

    final void performAction2051(boolean booleanArgument1) {
        this.performAction2049(booleanArgument1, MixedSupport140.computeMixedSupport0161904(248, DualNodeDeque.stringState0007, -12), false);
    }

    public static void performAction2055(int integerArgument1) {
        midiSynthesizerState0001 = null;
        networkSupport012State0001 = null;
        sceneWidgetState0150 = null;
        stringState0623 = null;
        if (integerArgument1 != 0) {
          PlatformService platformServiceLocal1 = (PlatformService) null;
          UiComponentPart033.performAction2050(true, (java.awt.Frame) null, (PlatformService) null);
        }
        mixedSupport121State0004 = null;
    }

    final static boolean computeBoolean2054(int integerArgument1) {
        boolean stackBooleanLocal1 = false;
        if (integerArgument1 <= 17) {
          return true;
        }
        stackBooleanLocal1 = (MixedSupport081.codecSupport004State0001 != null) && (MixedSupport081.codecSupport004State0001.computeBoolean1639(0));
        return stackBooleanLocal1;
    }

    final static MixedSupport056 computeMixedSupport0562046(byte byteArgument1, int integerArgument2, int integerArgument3, int integerArgument4) {
        boolean stackBooleanLocal1 = false;
        Object objectLocal2;
        int integerLocal3;
        int integerLocal4;
        int integerLocal5;
        int integerLocal6;
        MixedSupport056 mixedSupport056Local7;
        int integerLocal8;
        MixedSupport056 mixedSupport056Local9;
        int integerLocal10;
        String stringLocal11;
        String stringLocal12;
        int integerLocal13;
        int integerLocal14;
        int integerLocal15;
        int integerLocal16;
        int integerLocal17;
        integerLocal14 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        objectLocal2 = null;
        MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.nodeDequeState0034.performAction1971(115);
        integerLocal3 = 0;
        integerLocal4 = 0;
        for (integerLocal5 = MixedSupport058.integerState0317 - 1; integerLocal5 >= 0; integerLocal5--) {
          mixedSupport056Local7 = MixedSupport102.mixedSupport056ArrayState0001[integerLocal5];
          integerLocal8 = 0;
          if (!MixedSupport151.booleanState0221 &&
            integerLocal3 < ComponentContainer.integerState0376) {
            integerLocal10 = ReturnedShape.computeInteger1622(0, mixedSupport056Local7.integerState0290);
            if (mixedSupport056Local7.computeInteger0748((byte) 94) >= integerLocal10 && (mixedSupport056Local7.booleanState0070 ||
              !MixedSupport063.computeBoolean0830(mixedSupport056Local7.stringState0238, (byte) -118))) {
              integerLocal8 = 1;
            }
          }
          if (integerLocal8 != 0) {
            if (mixedSupport056Local7.sceneWidgetState0049 == null ||
              MixedSupport114.booleanState0162) {
              if (null == mixedSupport056Local7.sceneWidgetState0049) {
                MixedSupport010.integerState0067 = MixedSupport010.integerState0067 + 1;
              }
              stringLocal11 = NetworkSupport006.computeString1149(106, mixedSupport056Local7);
              stringLocal12 = stringLocal11 + BitmapFont.computeString1226(mixedSupport056Local7.stringState0241);
              integerLocal13 = SceneWidgetPart011.computeInteger1780(byteArgument1 ^ 4651, mixedSupport056Local7);
              mixedSupport056Local7.sceneWidgetState0049 = new SceneWidget(0L, MixedSupport040.sceneWidgetState0032, stringLocal12);
              integerLocal4 = integerLocal4 + integerArgument2;
              mixedSupport056Local7.sceneWidgetState0049.bitmapFontState0020 = MixedSupport038.bitmapFontState0013;
              mixedSupport056Local7.sceneWidgetState0049.integerState0899 = integerLocal13 - ((16711422 & integerLocal13) >> 1) + ((MixedSupport040.sceneWidgetState0032.integerState0899 & 16711422) >> 1);
              mixedSupport056Local7.sceneWidgetState0049.integerState0910 = integerLocal13;
              mixedSupport056Local7.sceneWidgetState0049.integerState0889 = ((16711423 & MixedSupport040.sceneWidgetState0032.integerState0889) >> 1) - ((16711423 & integerLocal13) >> 1) + integerLocal13;
            }
            integerLocal3++;
          } else {
            mixedSupport056Local7.sceneWidgetState0049 = null;
          }
        }
        integerLocal15 = 0;
        integerLocal6 = 0;
        if (byteArgument1 != 55) {
          return (MixedSupport056) null;
        }
        while (integerLocal6 < MixedSupport058.integerState0317) {
          mixedSupport056Local9 = MixedSupport102.mixedSupport056ArrayState0001[integerLocal6];
          if (null != mixedSupport056Local9.sceneWidgetState0049) {
            MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.performAction1998(mixedSupport056Local9.sceneWidgetState0049, -16834);
            mixedSupport056Local9.sceneWidgetState0049.performAction1994(mixedSupport056Local9.sceneWidgetState0049.computeInteger2000(true), 0, integerLocal15, integerArgument2, integerArgument4);
            integerLocal15 = integerLocal15 + integerArgument2;
            if (mixedSupport056Local9.sceneWidgetState0049.integerState0891 != 0) {
              objectLocal2 = mixedSupport056Local9;
            }
          }
          integerLocal6++;
        }
        integerLocal16 = -integerLocal15 + integerLocal4 + (MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0895 + MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0915);
        MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0915 = MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0915 - integerLocal16;
        MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0903 = MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0903 + integerLocal16;
        if (MixedSupport114.booleanState0162) {
          MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0915 = integerLocal15;
        }
        if (MixedSupport114.booleanState0162) {
          MixedSupport114.booleanState0162 = false;
          ProxySocketFactory.booleanState0169 = true;
          MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0903 = MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0089.integerState0915 - MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0915;
          MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0904 = 0;
        }
        MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0895 = integerLocal15 - MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0915;
        if (LoginCredentials.booleanState0085 &&
          UiComponentPart031.sceneWidgetState0116 != null) {
          ProxySocketFactory.booleanState0169 = true;
        }
        integerLocal17 = -MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0895 - (MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0915 - MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0089.integerState0915);
        if (ProxySocketFactory.booleanState0169) {
          MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0904 = -MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0903 + integerLocal17;
        }
        MixedSupport026.sceneWidgetPart008State0001.performAction1292(2 * integerArgument2 * integerArgument3, true, true, integerArgument2);
        stackBooleanLocal1 = (integerLocal17 == MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0903 + MixedSupport026.sceneWidgetPart008State0001.sceneWidgetState0090.integerState0904);
        ProxySocketFactory.booleanState0169 = stackBooleanLocal1;
        return (MixedSupport056) (objectLocal2);
    }

    final static void performAction2048(RgbSprite rgbSpriteArgument1, int integerArgument2) {
        try {
          MixedSupport103.rgbSpriteState0040 = rgbSpriteArgument1;
          if (integerArgument2 != 369179521) {
            integerState0934 = -2;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "wj.J(" + (rgbSpriteArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    static {
        stringState0623 = "Accept unrated rematch";
        mixedSupport121State0004 = new MixedSupport121(1);
    }
}
