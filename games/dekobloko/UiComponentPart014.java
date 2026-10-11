/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiComponentPart014 extends UiComponentPart030 implements CallbackContract019 {
    private InteractiveComponent interactiveComponentState0006;
    static SceneWidget sceneWidgetState0052;
    static String stringState0248;
    static RawSound rawSoundState0010;
    static int integerState0316;
    static SceneWidget sceneWidgetState0053;

    public final void performAction0341(byte byteArgument1, int integerArgument2, InteractiveComponent interactiveComponentArgument3, int integerArgument4, int integerArgument5) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        RuntimeException runtimeExceptionLocal5 = null;
        try {
          if (this.interactiveComponentState0006 == interactiveComponentArgument3) {
            this.performAction0787((byte) -102);
          }
          if (byteArgument1 != 67) {
            sceneWidgetState0053 = (SceneWidget) null;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal6) {
          caughtExceptionLocal4 = caughtParameterLocal6;
          runtimeExceptionLocal5 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal5;
          stackStringBuilderLocal2 = new StringBuilder().append("ib.H(").append(byteArgument1).append(',').append(integerArgument2).append(',');
          if (interactiveComponentArgument3 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(')').toString());
        }
    }

    final static void performAction0784(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, byte byteArgument6, int integerArgument7, int integerArgument8, int[] integerArrayArgument9) {
        RuntimeException stackRuntimeExceptionLocal1 = null;
        StringBuilder stackStringBuilderLocal2 = null;
        String stackStringLocal3 = null;
        RuntimeException caughtExceptionLocal4 = null;
        int integerLocal5 = 0;
        RuntimeException runtimeExceptionLocal6 = null;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        int integerLocal11 = 0;
        int integerLocal12 = 0;
        int integerLocal13 = 0;
        int integerLocal14 = 0;
        int integerLocal15 = 0;
        int integerLocal16 = 0;
        int integerLocal17;
        int integerLocal18;
        int integerLocal19;
        int integerLocal20;
        int integerLocal21;
        int integerLocal22;
        integerLocal16 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          if (integerArgument4 >= 0 &&
            MixedSupport109.integerState0654 > integerArgument8) {
            if (0 > integerArgument1 &&
              0 > integerArgument7 &&
              integerArgument3 < 0) {
              return;
            }
            if (integerArgument1 >= MixedSupport109.integerState0653 &&
              integerArgument7 >= MixedSupport109.integerState0653 &&
              MixedSupport109.integerState0653 <= integerArgument3) {
              return;
            }
            if (byteArgument6 != 117) {
              return;
            }
            integerLocal11 = integerArgument4 - integerArgument8;
            if (integerArgument2 == integerArgument8) {
              if (integerArgument4 != integerArgument8) {
                integerLocal12 = integerArgument4 - integerArgument2;
                if (integerArgument7 <= integerArgument1) {
                  integerLocal9 = (integerArgument3 - integerArgument1 << 16) / integerLocal11;
                  integerLocal8 = (integerArgument3 - integerArgument7 << 16) / integerLocal12;
                  integerLocal5 = integerArgument7 << 16;
                  integerLocal7 = integerArgument1 << 16;
                } else {
                  integerLocal5 = integerArgument1 << 16;
                  integerLocal7 = integerArgument7 << 16;
                  integerLocal8 = (-integerArgument1 + integerArgument3 << 16) / integerLocal11;
                  integerLocal9 = (integerArgument3 - integerArgument7 << 16) / integerLocal12;
                }
              } else {
                integerLocal8 = 0;
                integerLocal7 = integerArgument7 << 16;
                integerLocal9 = 0;
                integerLocal5 = integerArgument1 << 16;
              }
              integerLocal10 = 0;
              if (integerArgument8 < 0) {
                integerArgument8 = Math.min(-integerArgument8, integerArgument2 - integerArgument8);
                integerLocal7 = integerLocal7 + integerArgument8 * integerLocal9;
                integerLocal5 = integerLocal5 + integerArgument8 * integerLocal8;
                integerArgument8 = 0;
              }
            } else {
              integerLocal7 = integerArgument1 << 16;
              integerLocal5 = integerArgument1 << 16;
              integerLocal12 = integerArgument2 - integerArgument8;
              integerLocal9 = (integerArgument3 - integerArgument1 << 16) / integerLocal11;
              integerLocal8 = (integerArgument7 - integerArgument1 << 16) / integerLocal12;
              if (integerLocal8 < integerLocal9) {
                integerLocal10 = 0;
              } else {
                integerLocal13 = integerLocal8;
                integerLocal8 = integerLocal9;
                integerLocal9 = integerLocal13;
                integerLocal10 = 1;
              }
              boolean frameRemainderLocal23 = true;
              if (integerArgument8 < 0) {
                if (integerArgument2 < 0) {
                  integerArgument8 = integerArgument2 - integerArgument8;
                  integerLocal7 = integerLocal7 + integerLocal9 * integerArgument8;
                  integerLocal5 = integerLocal5 + integerLocal8 * integerArgument8;
                  integerArgument8 = integerArgument2;
                  frameRemainderLocal23 = false;
                }
                else {
                  integerArgument8 = -integerArgument8;
                  integerLocal5 = integerLocal5 + integerArgument8 * integerLocal8;
                  integerLocal7 = integerLocal7 + integerArgument8 * integerLocal9;
                  integerArgument8 = 0;
                }
              }
              if (frameRemainderLocal23) {
                integerLocal20 = MixedSupport109.integerArrayState0197[integerArgument8];
                while (integerArgument2 > integerArgument8) {
                  integerLocal14 = integerLocal5 >> 16;
                  if (MixedSupport109.integerState0653 > integerLocal14) {
                    integerLocal15 = (integerLocal7 >> 16) - (integerLocal5 >> 16);
                    if (integerLocal15 != 0) {
                      if (MixedSupport109.integerState0653 <= integerLocal15 + integerLocal14) {
                        integerLocal15 = -1 + (-integerLocal14 + MixedSupport109.integerState0653);
                      }
                      if (integerLocal14 < 0) {
                        TextLayout.performAction0252(integerLocal20, (byte) 57, integerArrayArgument9, integerArgument5, integerLocal15 + integerLocal14);
                      } else {
                        TextLayout.performAction0252(integerLocal20 + integerLocal14, (byte) 57, integerArrayArgument9, integerArgument5, integerLocal15);
                      }
                    } else {
                      if (0 <= integerLocal14 &&
                        MixedSupport109.integerState0653 > integerLocal14) {
                        TextLayout.performAction0252(integerLocal14 + integerLocal20, (byte) 57, integerArrayArgument9, integerArgument5, integerLocal15);
                      }
                    }
                  }
                  integerArgument8++;
                  if (MixedSupport109.integerState0654 <= integerArgument8) {
                    return;
                  }
                  integerLocal7 = integerLocal7 + integerLocal9;
                  integerLocal20 = integerLocal20 + SoftwareRaster.integerState0285;
                  integerLocal5 = integerLocal5 + integerLocal8;
                }
              }
              integerLocal21 = integerArgument4 - integerArgument2;
              if (integerLocal21 == 0) {
                integerLocal9 = 0;
                integerLocal8 = 0;
              } else {
                integerLocal22 = integerArgument3 << 16;
                if (integerLocal10 != 0) {
                  integerLocal7 = integerArgument7 << 16;
                } else {
                  integerLocal5 = integerArgument7 << 16;
                }
                integerLocal9 = (-integerLocal7 + integerLocal22) / integerLocal21;
                integerLocal8 = (-integerLocal5 + integerLocal22) / integerLocal21;
              }
            }
            if (integerArgument8 < 0) {
              integerArgument8 = -integerArgument8;
              integerLocal7 = integerLocal7 + integerLocal9 * integerArgument8;
              integerLocal5 = integerLocal5 + integerArgument8 * integerLocal8;
              integerArgument8 = 0;
            }
            integerLocal17 = MixedSupport109.integerArrayState0197[integerArgument8];
            while (integerArgument4 > integerArgument8) {
              integerLocal18 = integerLocal5 >> 16;
              if (MixedSupport109.integerState0653 > integerLocal18) {
                integerLocal19 = -(integerLocal5 >> 16) + (integerLocal7 >> 16);
                if (integerLocal19 != 0) {
                  if (MixedSupport109.integerState0653 <= integerLocal19 + integerLocal18) {
                    integerLocal19 = MixedSupport109.integerState0653 - integerLocal18 - 1;
                  }
                  if (integerLocal18 < 0) {
                    TextLayout.performAction0252(integerLocal17, (byte) 57, integerArrayArgument9, integerArgument5, integerLocal18 + integerLocal19);
                  } else {
                    TextLayout.performAction0252(integerLocal18 + integerLocal17, (byte) 57, integerArrayArgument9, integerArgument5, integerLocal19);
                  }
                } else {
                  if (0 <= integerLocal18 &&
                    MixedSupport109.integerState0653 > integerLocal18) {
                    TextLayout.performAction0252(integerLocal18 + integerLocal17, (byte) 57, integerArrayArgument9, integerArgument5, integerLocal19);
                  }
                }
              }
              integerArgument8++;
              if (MixedSupport109.integerState0654 <= integerArgument8) {
                return;
              }
              integerLocal7 = integerLocal7 + integerLocal9;
              integerLocal5 = integerLocal5 + integerLocal8;
              integerLocal17 = integerLocal17 + SoftwareRaster.integerState0285;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal24) {
          caughtExceptionLocal4 = caughtParameterLocal24;
          runtimeExceptionLocal6 = caughtExceptionLocal4;
          stackRuntimeExceptionLocal1 = runtimeExceptionLocal6;
          stackStringBuilderLocal2 = new StringBuilder().append("ib.D(").append(integerArgument1).append(',').append(integerArgument2).append(',').append(integerArgument3).append(',').append(integerArgument4).append(',').append(integerArgument5).append(',').append(byteArgument6).append(',').append(integerArgument7).append(',').append(integerArgument8).append(',');
          if (integerArrayArgument9 == null) {
            stackStringLocal3 = "null";
          } else {
            stackStringLocal3 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal1), ((StringBuilder) (Object) stackStringBuilderLocal2).append(stackStringLocal3).append(')').toString());
        }
    }

    private final InteractiveComponent computeInteractiveComponent0785(CallbackContract006 callbackContract006Argument1, String stringArgument2, byte byteArgument3) {
        InteractiveComponent interactiveComponentLocal1 = null;
        RuntimeException runtimeExceptionLocal2 = null;
        int integerLocal3 = 0;
        InteractiveComponent stackInteractiveComponentLocal4 = null;
        RuntimeException stackRuntimeExceptionLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        StringBuilder stackStringBuilderLocal8 = null;
        String stackStringLocal9 = null;
        RuntimeException caughtExceptionLocal10 = null;
        try {
          interactiveComponentLocal1 = new InteractiveComponent(stringArgument2, callbackContract006Argument1);
          interactiveComponentLocal1.callbackContract004State0006 = (CallbackContract004) ((Object) new MixedSupport041());
          integerLocal3 = this.integerState0108 - 6;
          this.integerState0108 = this.integerState0108 + 38;
          if (byteArgument3 != -90) {
            sceneWidgetState0053 = (SceneWidget) null;
          }
          interactiveComponentLocal1.performAction0241(30, -16 + (this.integerState0107 - 14), 15, integerLocal3, byteArgument3 - 16465);
          this.performAction1012(interactiveComponentLocal1, (byte) -55);
          this.performAction0247(109);
          stackInteractiveComponentLocal4 = interactiveComponentLocal1;
          return stackInteractiveComponentLocal4;
        } catch (java.lang.RuntimeException caughtParameterLocal11) {
          caughtExceptionLocal10 = caughtParameterLocal11;
          runtimeExceptionLocal2 = caughtExceptionLocal10;
          stackRuntimeExceptionLocal5 = runtimeExceptionLocal2;
          stackStringBuilderLocal6 = new StringBuilder().append("ib.I(");
          if (callbackContract006Argument1 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          stackStringBuilderLocal8 = ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(',');
          if (stringArgument2 == null) {
            stackStringLocal9 = "null";
          } else {
            stackStringLocal9 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) stackRuntimeExceptionLocal5), ((StringBuilder) (Object) stackStringBuilderLocal8).append(stackStringLocal9).append(',').append(byteArgument3).append(')').toString());
        }
    }

    private final void performAction0787(byte byteArgument1) {
        if (!this.booleanState0011) {
          return;
        }
        if (byteArgument1 >= -30) {
          return;
        }
        this.booleanState0011 = false;
    }

    final static RenderingSupport008 computeRenderingSupport0080782(byte byteArgument1, boolean booleanArgument2) {
        GameDomainSupport002 gameDomainSupport002Local1 = null;
        GameDomainSupport002 gameDomainSupport002Local2 = null;
        GameDomainSupport002 cachedGameDomainSupport002Local3 = null;
        GameDomainSupport002 cachedGameDomainSupport002Local4 = null;
        GameDomainSupport002 gameDomainSupport002Local5 = null;
        GameDomainSupport002 gameDomainSupport002Local6 = null;
        RenderingSupport008 renderingSupport008Local7 = new RenderingSupport008(5);
        RenderingSupport008 renderingSupport008Local8 = renderingSupport008Local7;
        int integerLocal9 = 372;
        if (UiComponentPart013.booleanState0066) {
          integerLocal9 -= 12;
        }
        if (UiComponentPart023.computeBoolean1421(-30146)) {
          gameDomainSupport002Local6 = new GameDomainSupport002(20, UiComponentPart026.stringState0461, MixedSupport001.renderingSupport010State0001);
          gameDomainSupport002Local6.integerState0178 = integerLocal9;
          gameDomainSupport002Local6.integerState0174 = -(gameDomainSupport002Local6.integerState0176 / 2) + 320;
          renderingSupport008Local8.performAction0969(gameDomainSupport002Local6, 118);
        } else {
          renderingSupport008Local7.performAction0969(new GameDomainSupport002(22, MixedSupport120.stringArrayState0041[0], MixedSupport001.renderingSupport010State0001), 123);
          renderingSupport008Local7.performAction0969(new GameDomainSupport002(22, MixedSupport120.stringArrayState0041[1], MixedSupport001.renderingSupport010State0001), 118);
          renderingSupport008Local7.performAction0969(new GameDomainSupport002(22, MixedSupport120.stringArrayState0041[2], MixedSupport001.renderingSupport010State0001), 111);
          gameDomainSupport002Local1 = renderingSupport008Local7.gameDomainSupport002ArrayState0001[0];
          GameDomainSupport002 gameDomainSupport002Local10 = gameDomainSupport002Local1;
          renderingSupport008Local7.gameDomainSupport002ArrayState0001[2].integerState0176 = 185;
          gameDomainSupport002Local2 = renderingSupport008Local7.gameDomainSupport002ArrayState0001[1];
          gameDomainSupport002Local2.integerState0176 = 185;
          gameDomainSupport002Local1.integerState0176 = 185;
          renderingSupport008Local7.gameDomainSupport002ArrayState0001[0].integerState0174 = 120 - renderingSupport008Local7.gameDomainSupport002ArrayState0001[0].integerState0176 / 2;
          renderingSupport008Local7.gameDomainSupport002ArrayState0001[1].integerState0174 = 320 - renderingSupport008Local7.gameDomainSupport002ArrayState0001[1].integerState0176 / 2;
          renderingSupport008Local7.gameDomainSupport002ArrayState0001[2].integerState0174 = 520 - renderingSupport008Local7.gameDomainSupport002ArrayState0001[2].integerState0176 / 2;
          cachedGameDomainSupport002Local3 = renderingSupport008Local7.gameDomainSupport002ArrayState0001[2];
          cachedGameDomainSupport002Local3.integerState0178 = integerLocal9;
          cachedGameDomainSupport002Local4 = renderingSupport008Local7.gameDomainSupport002ArrayState0001[1];
          cachedGameDomainSupport002Local4.integerState0178 = integerLocal9;
          renderingSupport008Local7.gameDomainSupport002ArrayState0001[0].integerState0178 = integerLocal9;
        }
        integerLocal9 += 43;
        if (UiComponentPart013.booleanState0066) {
          gameDomainSupport002Local5 = new GameDomainSupport002(3, MixedSupport094.stringState0373, MixedSupport001.renderingSupport010State0001);
          gameDomainSupport002Local5.integerState0178 = integerLocal9;
          gameDomainSupport002Local5.integerState0174 = -(gameDomainSupport002Local5.integerState0176 / 2) + 320;
          integerLocal9 += 28;
          renderingSupport008Local8.performAction0969(gameDomainSupport002Local5, 122);
        }
        GameDomainSupport002 gameDomainSupport002Local11 = new GameDomainSupport002(13, MixedSupport101.stringState0411, MixedSupport001.renderingSupport010State0001);
        gameDomainSupport002Local11.integerState0174 = 320 - gameDomainSupport002Local11.integerState0176 / 2;
        gameDomainSupport002Local11.integerState0178 = integerLocal9;
        renderingSupport008Local8.performAction0969(gameDomainSupport002Local11, 126);
        renderingSupport008Local8.integerState0372 = 272;
        renderingSupport008Local8.integerState0368 = 500;
        renderingSupport008Local8.integerState0374 = 70;
        renderingSupport008Local8.integerState0375 = 76;
        renderingSupport008Local8.performAction0968(MixedSupport036.integerState0222, booleanArgument2, -129);
        int integerLocal12 = -87 % ((19 - byteArgument1) / 60);
        return renderingSupport008Local8;
    }

    final static void performAction0783(byte byteArgument1, RgbSprite[] rgbSpriteArrayArgument2) {
        try {
          int integerLocal1 = -81 / ((-23 - byteArgument1) / 37);
          MixedSupport021.rgbSpriteArrayState0008 = rgbSpriteArrayArgument2;
          if (MixedSupport021.rgbSpriteArrayState0008 != null &&
            rgbSpriteArrayArgument2.length < 3) {
            throw new IllegalArgumentException("");
          }
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "ib.J(" + byteArgument1 + ',' + (rgbSpriteArrayArgument2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int computeInteger0786(int integerArgument1) {
        ProxySocketFactory.codecSupport002State0001.performAction1246(-126);
        if (integerArgument1 <= 65) {
          rawSoundState0010 = (RawSound) null;
        }
        if (MixedSupport124.networkSupport003State0003.computeBoolean0374((byte) -56)) {
          return 0;
        }
        return NetworkSupport009.computeInteger1358(0);
    }

    UiComponentPart014(UiComponentPart016 uiComponentPart016Argument1, MixedSupport084 mixedSupport084Argument2) {
        super(uiComponentPart016Argument1, 200, 150);
        Object objectLocal1 = null;
        UiComponent uiComponentLocal2 = null;
        Object stackObjectLocal3 = null;
        StringBuilder stackStringBuilderLocal4 = null;
        String stackStringLocal5 = null;
        StringBuilder stackStringBuilderLocal6 = null;
        String stackStringLocal7 = null;
        RuntimeException caughtExceptionLocal8 = null;
        try {
          objectLocal1 = null;
          if (mixedSupport084Argument2 != NetworkArchiveRequestManager.mixedSupport084State0003) {
            if (MixedSupport075.mixedSupport084State0002 == mixedSupport084Argument2) {
              objectLocal1 = MixedSupport023.stringState0103;
              this.integerState0108 = this.integerState0108 + 10;
              if (UiComponentPart033.computeBoolean2054(98)) {
                this.integerState0108 = this.integerState0108 + 20;
                objectLocal1 = MixedSupport155.stringState0634;
              }
            } else {
              if (MixedSupport046.mixedSupport084State0001 == mixedSupport084Argument2) {
                this.integerState0108 = this.integerState0108 + 30;
                objectLocal1 = MixedSupport046.stringState0197;
              }
            }
          } else {
            objectLocal1 = NodeHashTable.stringState0507;
          }
          uiComponentLocal2 = new UiComponent((String) (objectLocal1), (CallbackContract006) null);
          uiComponentLocal2.integerState0107 = this.integerState0107;
          uiComponentLocal2.integerState0110 = 0;
          uiComponentLocal2.integerState0108 = 80;
          uiComponentLocal2.integerState0104 = 50;
          uiComponentLocal2.callbackContract004State0006 = (CallbackContract004) ((Object) new MixedSupport001(MixedSupport011.bitmapFontState0006, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.performAction1012(uiComponentLocal2, (byte) -55);
          this.interactiveComponentState0006 = this.computeInteractiveComponent0785((CallbackContract006) (this), UiComponentPart021.stringState0383, (byte) -90);
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal9) {
          caughtExceptionLocal8 = caughtParameterLocal9;
          objectLocal1 = caughtExceptionLocal8;
          stackObjectLocal3 = objectLocal1;
          stackStringBuilderLocal4 = new StringBuilder().append("ib.<init>(");
          if (uiComponentPart016Argument1 == null) {
            stackStringLocal5 = "null";
          } else {
            stackStringLocal5 = "{...}";
          }
          stackStringBuilderLocal6 = ((StringBuilder) (Object) stackStringBuilderLocal4).append(stackStringLocal5).append(',');
          if (mixedSupport084Argument2 == null) {
            stackStringLocal7 = "null";
          } else {
            stackStringLocal7 = "{...}";
          }
          throw ClientException.computeDiagnosticSupport0020400((Throwable) (stackObjectLocal3), ((StringBuilder) (Object) stackStringBuilderLocal6).append(stackStringLocal7).append(')').toString());
        }
    }

    public static void performAction0788(int integerArgument1) {
        sceneWidgetState0053 = null;
        stringState0248 = null;
        if (integerArgument1 > -10) {
          return;
        }
        sceneWidgetState0052 = null;
        rawSoundState0010 = null;
    }

    static {
        integerState0316 = 20;
    }
}
