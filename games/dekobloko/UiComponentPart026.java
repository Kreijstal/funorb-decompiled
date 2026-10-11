/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart026 extends UiComponentPart030 {
    private boolean booleanState0157;
    private UiComponentPart027 uiComponentPart027State0002;
    private String stringState0458;
    private String stringState0459;
    static int integerState0673;
    static String stringState0460;
    private boolean booleanState0158;
    static String stringState0461;

    final static NodeDeque computeNodeDeque1577(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6, int integerArgument7, int integerArgument8) {
        NodeDeque nodeDequeLocal1 = new NodeDeque();
        AnimatedTileRegion animatedTileRegionLocal2 = new AnimatedTileRegion();
        animatedTileRegionLocal2.integerState0813 = 10000;
        animatedTileRegionLocal2.integerState0817 = integerArgument6;
        animatedTileRegionLocal2.indexedSpriteArrayState0005 = new IndexedSprite[integerArgument1 * integerArgument6];
        animatedTileRegionLocal2.integerState0814 = integerArgument3;
        animatedTileRegionLocal2.integerState0816 = integerArgument5;
        animatedTileRegionLocal2.integerState0818 = integerArgument2;
        animatedTileRegionLocal2.integerState0815 = integerArgument1;
        animatedTileRegionLocal2.integerState0811 = integerArgument7;
        nodeDequeLocal1.performAction1963(animatedTileRegionLocal2, 2777);
        int integerLocal3 = -11 / ((integerArgument8 - 10) / 35);
        animatedTileRegionLocal2.performAction1889(11976, integerArgument4);
        return nodeDequeLocal1;
    }

    UiComponentPart026(UiComponentPart016 uiComponentPart016Argument1, String stringArgument2) {
        super(uiComponentPart016Argument1, 300, 120);
        int integerLocal1 = 0;
        try {
          this.stringState0458 = stringArgument2;
          if (this.stringState0458 != null) {
            integerLocal1 = GameDomainSupport002.bitmapFontState0012.computeInteger1223(this.stringState0458, 260, GameDomainSupport002.bitmapFontState0012.integerState0518);
            this.performAction0174(112, 300, integerLocal1 + 150);
          }
          this.uiComponentPart027State0002 = new UiComponentPart027(13, 50, 274, 30, 15, 2113632, 4210752);
          this.booleanState0158 = false;
          this.uiComponentPart027State0002.booleanState0159 = true;
          this.booleanState0157 = false;
          this.performAction1012(this.uiComponentPart027State0002, (byte) -55);
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "qn.<init>(" + (uiComponentPart016Argument1 != null ? "{...}" : "null") + ',' + (stringArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void performAction1584(byte byteArgument1) {
        stringState0460 = null;
        if (byteArgument1 <= 60) {
          RgbSprite rgbSpriteLocal1 = (RgbSprite) null;
          UiComponentPart026.performAction1579((RgbSprite) null, (RgbSprite) null, (byte) -20);
        }
        stringState0461 = null;
    }

    final static void performAction1581(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        MixedSupport136 mixedSupport136Local2 = null;
        RuntimeException caughtExceptionLocal3 = null;
        RuntimeException runtimeExceptionLocal4 = null;
        integerLocal1 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument1 != -20494) {
            stringState0460 = (String) null;
          }
          mixedSupport136Local2 = (MixedSupport136) (UiComponentPart025.nodeDequeState0026.computeHashNode1970((byte) 125));
          while (mixedSupport136Local2 != null) {
            RenderingSupport006.performAction0845(mixedSupport136Local2, (byte) -70, integerArgument2);
            mixedSupport136Local2 = (MixedSupport136) (UiComponentPart025.nodeDequeState0026.computeHashNode1974(true));
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal5) {
          caughtExceptionLocal3 = caughtParameterLocal5;
          runtimeExceptionLocal4 = caughtExceptionLocal3;
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeExceptionLocal4), "qn.HA(" + integerArgument1 + ',' + integerArgument2 + ')');
        }
    }

    final void performAction1583(byte byteArgument1) {
        this.uiComponentPart027State0002.booleanState0159 = false;
        this.booleanState0158 = true;
        if (byteArgument1 < 75) {
          this.performAction1583((byte) -99);
        }
    }

    final static void performAction1579(RgbSprite rgbSpriteArgument1, RgbSprite rgbSpriteArgument2, byte byteArgument3) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        RuntimeException stackRuntimeExceptionLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        float floatLocal9 = 0.0f;
        RuntimeException runtimeExceptionLocal10 = null;
        float floatLocal11 = 0.0f;
        float floatLocal12 = 0.0f;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17 = 0;
        int integerLocal18 = 0;
        int integerLocal19 = 0;
        RgbSprite rgbSpriteLocal20 = null;
        int[] integerArrayLocal21 = null;
        int[] integerArrayLocal22 = null;
        integerLocal19 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          floatLocal11 = 1.0f;
          integerLocal13 = rgbSpriteArgument2.integerState0258;
          integerLocal14 = rgbSpriteArgument2.integerState0255;
          integerArrayLocal21 = rgbSpriteArgument2.integerArrayState0024;
          integerArrayLocal22 = rgbSpriteArgument1.integerArrayState0024;
          integerLocal15 = 0;
          if (byteArgument3 > -73) {
            rgbSpriteLocal20 = (RgbSprite) null;
            UiComponentPart026.performAction1579((RgbSprite) null, (RgbSprite) null, (byte) 15);
          }
          for (integerLocal1 = 0; integerLocal14 > integerLocal1; integerLocal1++) {
            for (integerLocal2 = 0; integerLocal13 > integerLocal2; integerLocal2++) {
              integerLocal16 = 255 & integerArrayLocal21[integerLocal15];
              integerLocal17 = integerLocal2 + integerLocal1 + integerLocal16 / 5 + CipherPacketBuffer.integerState0799 & 127;
              floatLocal12 = (float)integerLocal16 / 255.0f;
              floatLocal9 = (float)integerLocal17 / 128.0f;
              integerLocal18 = SceneWidgetPart008.computeInteger1287(floatLocal9, floatLocal12, false, floatLocal11);
              integerArrayLocal22[integerLocal15] = integerLocal18;
              integerLocal15++;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal23) {
          caughtExceptionLocal8 = caughtParameterLocal23;
          runtimeExceptionLocal10 = caughtExceptionLocal8;
          stackRuntimeExceptionLocal3 = runtimeExceptionLocal10;
          stackStringBuilderLocal4 = new StringBuilder().append("qn.EA(");
          if (rgbSpriteArgument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (rgbSpriteArgument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',').append(byteArgument3).append(')').toString());
        }
    }

    final static void performAction1578(int integerArgument1, PlatformService platformServiceArgument2, int integerArgument3, PacketBuffer packetBufferArgument4) {
        try {
          int integerLocal1 = 0;
          int integerLocal2 = 0;
          int integerLocal3 = 0;
          byte[] byteArrayLocal4 = null;
          String cachedStringLocal5 = null;
          RuntimeException stackRuntimeExceptionLocal6 = null;
          StringBuilder stackStringBuilderLocal7 = null;
          String stackStringLocal8 = null;
          StringBuilder stackStringBuilderLocal9 = null;
          String stackStringLocal10 = null;
          Throwable caughtExceptionLocal11 = null;
          RuntimeException runtimeExceptionLocal12 = null;
          int integerLocal13 = 0;
          ClassNotFoundException classNotFoundExceptionLocal14 = null;
          SecurityException securityExceptionLocal15 = null;
          NullPointerException nullPointerExceptionLocal16 = null;
          Exception exceptionLocal17 = null;
          Throwable throwableLocal18 = null;
          String stringLocal19 = null;
          int integerLocal20 = 0;
          String[] stringArrayLocal21 = null;
          byte[][] byteArrayArrayLocal22 = null;
          Class[] classArrayLocal23 = null;
          int integerLocal24 = 0;
          int integerLocal25 = 0;
          String stringLocal26 = null;
          String stringLocal27 = null;
          int integerLocal28 = 0;
          MixedSupport075 mixedSupport075Local29 = null;
          byte[][] byteArrayArrayLocal30 = null;
          String stringLocal31 = null;
          byte[][] byteArrayArrayLocal32 = null;
          int integerLocal33;
          integerLocal25 = DekoBlokoClient.obfuscationControl ? 1 : 0;
          try {
            mixedSupport075Local29 = new MixedSupport075();
            mixedSupport075Local29.integerState0407 = packetBufferArgument4.computeInteger2085((byte) -116);
            mixedSupport075Local29.integerState0406 = packetBufferArgument4.computeInteger2096(7553);
            mixedSupport075Local29.integerArrayState0136 = new int[mixedSupport075Local29.integerState0407];
            mixedSupport075Local29.integerArrayState0135 = new int[mixedSupport075Local29.integerState0407];
            mixedSupport075Local29.byteArrayArrayArrayState0002 = new byte[mixedSupport075Local29.integerState0407][][];
            mixedSupport075Local29.asyncTaskArrayState0002 = new AsyncTask[mixedSupport075Local29.integerState0407];
            mixedSupport075Local29.integerArrayState0138 = new int[mixedSupport075Local29.integerState0407];
            mixedSupport075Local29.asyncTaskArrayState0001 = new AsyncTask[mixedSupport075Local29.integerState0407];
            for (integerLocal1 = 0; integerLocal1 < mixedSupport075Local29.integerState0407; integerLocal1++) {
              try {
                integerLocal13 = packetBufferArgument4.computeInteger2085((byte) -21);
                if (0 != integerLocal13 &&
                  integerLocal13 != 1 &&
                  integerLocal13 != 2) {
                  if (integerLocal13 == 3 ||
                    4 == integerLocal13) {
                    stringLocal31 = packetBufferArgument4.computeString2082((byte) -38);
                    stringLocal19 = packetBufferArgument4.computeString2082((byte) -38);
                    integerLocal20 = packetBufferArgument4.computeInteger2085((byte) -72);
                    stringArrayLocal21 = new String[integerLocal20];
                    for (integerLocal2 = 0; integerLocal2 < integerLocal20; integerLocal2++) {
                      stringArrayLocal21[integerLocal2] = packetBufferArgument4.computeString2082((byte) -38);
                    }
                    byteArrayArrayLocal32 = new byte[integerLocal20][];
                    byteArrayArrayLocal30 = byteArrayArrayLocal32;
                    byteArrayArrayLocal22 = byteArrayArrayLocal30;
                    if (integerLocal13 == 3) {
                      for (integerLocal3 = 0; integerLocal20 > integerLocal3; integerLocal3++) {
                        integerLocal24 = packetBufferArgument4.computeInteger2096(7553);
                        byteArrayLocal4 = new byte[integerLocal24];
                        byteArrayArrayLocal22[integerLocal3] = byteArrayLocal4;
                        packetBufferArgument4.performAction2075(byteArrayArrayLocal32[integerLocal3], 0, (byte) 127, integerLocal24);
                      }
                    }
                    mixedSupport075Local29.integerArrayState0138[integerLocal1] = integerLocal13;
                    classArrayLocal23 = new Class[integerLocal20];
                    integerLocal28 = 0;
                    integerLocal33 = integerLocal28;
                    while (integerLocal20 > integerLocal28) {
                      classArrayLocal23[integerLocal28] = RenderingSupport002.computeClass0266(stringArrayLocal21[integerLocal28], (byte) -122);
                      integerLocal28++;
                    }
                    mixedSupport075Local29.asyncTaskArrayState0001[integerLocal1] = platformServiceArgument2.computeAsyncTask0569(-10962, stringLocal19, RenderingSupport002.computeClass0266(stringLocal31, (byte) -108), classArrayLocal23);
                    mixedSupport075Local29.byteArrayArrayArrayState0002[integerLocal1] = byteArrayArrayLocal32;
                  }
                } else {
                  stringLocal27 = packetBufferArgument4.computeString2082((byte) -38);
                  cachedStringLocal5 = packetBufferArgument4.computeString2082((byte) -38);
                  stringLocal26 = cachedStringLocal5;
                  stringLocal19 = cachedStringLocal5;
                  integerLocal20 = 0;
                  if (1 == integerLocal13) {
                    integerLocal20 = packetBufferArgument4.computeInteger2096(7553);
                  }
                  mixedSupport075Local29.integerArrayState0138[integerLocal1] = integerLocal13;
                  mixedSupport075Local29.integerArrayState0136[integerLocal1] = integerLocal20;
                  mixedSupport075Local29.asyncTaskArrayState0002[integerLocal1] = platformServiceArgument2.computeAsyncTask0572(false, stringLocal26, RenderingSupport002.computeClass0266(stringLocal27, (byte) 9));
                }
              } catch (java.lang.ClassNotFoundException caughtParameterLocal34) {
                caughtExceptionLocal11 = caughtParameterLocal34;
                classNotFoundExceptionLocal14 = (ClassNotFoundException) (Object) caughtExceptionLocal11;
                mixedSupport075Local29.integerArrayState0135[integerLocal1] = -1;
              } catch (java.lang.SecurityException caughtParameterLocal35) {
                caughtExceptionLocal11 = caughtParameterLocal35;
                securityExceptionLocal15 = (SecurityException) (Object) caughtExceptionLocal11;
                mixedSupport075Local29.integerArrayState0135[integerLocal1] = -2;
              } catch (java.lang.NullPointerException caughtParameterLocal36) {
                caughtExceptionLocal11 = caughtParameterLocal36;
                nullPointerExceptionLocal16 = (NullPointerException) (Object) caughtExceptionLocal11;
                mixedSupport075Local29.integerArrayState0135[integerLocal1] = -3;
              } catch (java.lang.Exception caughtParameterLocal37) {
                caughtExceptionLocal11 = caughtParameterLocal37;
                exceptionLocal17 = (Exception) (Object) caughtExceptionLocal11;
                mixedSupport075Local29.integerArrayState0135[integerLocal1] = -4;
              } catch (java.lang.Throwable caughtParameterLocal38) {
                caughtExceptionLocal11 = caughtParameterLocal38;
                throwableLocal18 = caughtExceptionLocal11;
                mixedSupport075Local29.integerArrayState0135[integerLocal1] = -5;
              }
            }
            if (integerArgument3 != 4210752) {
              stringState0460 = (String) null;
            }
            MixedSupport002.nodeDequeState0001.performAction1963(mixedSupport075Local29, 2777);
            return;
          } catch (java.lang.RuntimeException caughtParameterLocal39) {
            caughtExceptionLocal11 = caughtParameterLocal39;
            runtimeExceptionLocal12 = (RuntimeException) (Object) caughtExceptionLocal11;
            stackRuntimeExceptionLocal6 = runtimeExceptionLocal12;
            stackStringBuilderLocal7 = new StringBuilder().append("qn.JA(").append(integerArgument1).append(',');
            if (platformServiceArgument2 == null) {
              stackStringLocal8 = "null";
            } else {
              stackStringLocal8 = "{...}";
            }
            stackStringBuilderLocal9 = ((StringBuilder) (Object) stackStringBuilderLocal7).append(stackStringLocal8).append(',').append(integerArgument3).append(',');
            if (packetBufferArgument4 == null) {
              stackStringLocal10 = "null";
            } else {
              stackStringLocal10 = "{...}";
            }
            throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal6), ((StringBuilder) (Object) stackStringBuilderLocal9).append(stackStringLocal10).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedExceptionLocal40) {
          throw uncheckedExceptionLocal40;
        } catch (Throwable checkedExceptionLocal41) {
          throw new RuntimeException(checkedExceptionLocal41);
        }
    }

    final void performAction1580(boolean booleanArgument1, float floatArgument2, int integerArgument3, String stringArgument4) {
        RuntimeException runtimeException = null;
        int stackIntegerLocal2 = 0;
        boolean stackBooleanLocal3 = false;
        RuntimeException stackRuntimeExceptionLocal4 = null;
        StringBuilder stackStringBuilderLocal5 = null;
        String stackStringLocal6 = null;
        RuntimeException caughtExceptionLocal7 = null;
        try {
          stackIntegerLocal2 = (booleanArgument1) ? 0 : 1;
          if (stackIntegerLocal2 == (this.booleanState0157 ? 1 : 0)) {
            stackBooleanLocal3 = (booleanArgument1);
            this.booleanState0157 = stackBooleanLocal3;
            if (this.booleanState0157) {
              this.uiComponentPart027State0002.performAction1585(4210752, 4088, 8405024);
              this.uiComponentPart027State0002.booleanState0159 = true;
            } else {
              this.uiComponentPart027State0002.performAction1585(4210752, 4088, 2113632);
              if (this.booleanState0158) {
                this.uiComponentPart027State0002.booleanState0159 = false;
              }
            }
          }
          if (integerArgument3 != 4210752) {
            UiComponentPart026.performAction1582(68);
          }
          this.uiComponentPart027State0002.integerState0680 = (int)(floatArgument2 / 100.0f * 65536.0f);
          this.stringState0459 = stringArgument4;
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal8) {
          caughtExceptionLocal7 = caughtParameterLocal8;
          runtimeException = caughtExceptionLocal7;
          stackRuntimeExceptionLocal4 = runtimeException;
          stackStringBuilderLocal5 = new StringBuilder().append("qn.IA(").append(booleanArgument1).append(',').append(floatArgument2).append(',').append(integerArgument3).append(',');
          if (stringArgument4 == null) {
            stackStringLocal6 = "null";
          } else {
            stackStringLocal6 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal4), ((StringBuilder) (Object) stackStringBuilderLocal5).append(stackStringLocal6).append(')').toString());
        }
    }

    final void performAction0178(int integerArgument1, int integerArgument2, int integerArgument3) {
        super.performAction0178(-128, integerArgument2, integerArgument3);
        GameDomainSupport002.bitmapFontState0012.performAction1224(this.stringState0459, (this.integerState0107 >> 1) + integerArgument3, 103 + integerArgument2, 16777215, -1);
        if (integerArgument1 >= -127) {
          return;
        }
        if (null != this.stringState0458) {
          SoftwareRaster.performAction0718(integerArgument3 + 20, integerArgument2 + 113, 260, 8421504);
          GameDomainSupport002.bitmapFontState0012.computeInteger1213(this.stringState0458, integerArgument3 + 20, 128 + integerArgument2, 260, 100, 16777215, -1, 1, 0, GameDomainSupport002.bitmapFontState0012.integerState0518);
        }
    }

    final static void performAction1582(int integerArgument1) {
        if (GameDomainSupport004.booleanState0087) {
          MixedSupport104.performAction1409(false);
        }
        if (integerArgument1 != 13) {
          stringState0461 = (String) null;
        }
    }

    static {
        stringState0460 = "This game has started.";
        stringState0461 = "Log in / Create account";
    }
}
