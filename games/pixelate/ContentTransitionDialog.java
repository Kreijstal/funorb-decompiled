/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ContentTransitionDialog extends ResizableModalPanel {
    static Sprite field_hb;
    static SceneWidget field_eb;
    static boolean field_kb;
    private int fadeInDuration;
    private dq transitionPhase;
    private AlphaContainer contentWrapper;
    private UiComponent pendingContent;
    private int headerHeight;
    private int phaseTick;
    private int field_gb;
    static String[] field_jb;
    private int fadeOutDuration;

    final static void createMenuScreen(boolean param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (param2 != 0) {
            if (param2 != 4 &&
              param2 != 2 &&
              param2 != 1) {
              if (param2 == 5) {
                StripedProgressBar.field_H[param2] = (MenuScreen) ((Object) new fq(param2, param6, param3, param1, param5, param4));
              } else {
                if (param2 == 6) {
                  StripedProgressBar.field_H[param2] = (MenuScreen) ((Object) new HighscoresScreen(param2, param6, param3, param1, param5, param4));
                } else {
                  if (param2 == 7) {
                    StripedProgressBar.field_H[param2] = (MenuScreen) ((Object) new HowToPlayScreen(param2, param6, param3, param1, param5, param4));
                  } else {
                    if (param2 != 8 &&
                      param2 != 9) {
                      if (param2 == 10) {
                        StripedProgressBar.field_H[param2] = (MenuScreen) ((Object) new mi(param2, param6, param3, param1, param5, param4));
                      } else {
                        if (11 == param2) {
                          StripedProgressBar.field_H[param2] = (MenuScreen) ((Object) new l(param2, param6, param3, param1, param5, param4));
                        } else {
                          if (param2 == 12) {
                            StripedProgressBar.field_H[param2] = (MenuScreen) ((Object) new PauseMenuScreen(param2, param6, param3, param1, param5, param4));
                          } else {
                            if (param2 == 13) {
                              StripedProgressBar.field_H[param2] = (MenuScreen) ((Object) new GameResultsScreen(param2, param6, param3, param1, param5, param4));
                            } else {
                              if (param2 == 16) {
                                StripedProgressBar.field_H[param2] = (MenuScreen) ((Object) new GameModeSelectScreen(param2, param6, param3, param1, param5, param4));
                              } else {
                                if (17 == param2) {
                                  StripedProgressBar.field_H[param2] = (MenuScreen) ((Object) new OptionsScreen(param2, param6, param3, param1, param5, param4));
                                } else {
                                  if (param2 != 14) {
                                    throw new IllegalStateException("No class defined for id=" + param2);
                                  }
                                  StripedProgressBar.field_H[param2] = (MenuScreen) ((Object) new ij(param2, param6, param3, param1, param5, param4));
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      StripedProgressBar.field_H[param2] = (MenuScreen) ((Object) new AchievementsScreen(param2, param6, param3, param1, param5, param4));
                    }
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              StripedProgressBar.field_H[param2] = (MenuScreen) ((Object) new GameplayScreen(param2, param6, param3, param1, param5, param4));
            }
          } else {
            StripedProgressBar.field_H[param2] = (MenuScreen) ((Object) new MainMenuScreen(param2, param6, param3, param1, param5, param4));
          }
          if (param0) {
            return;
          }
          ContentTransitionDialog.getTimedNoticeText((byte) 29);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_35_0 = var7;
          stackIn_35_1 = new StringBuilder().append("hb.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static byte[] getNamedTextFile(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 59 % ((49 - param1) / 54);
          stackIn_1_0 = ig.field_b.getNamedFile((byte) 24, param0, "");
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("hb.O(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final void onResizeFinished(boolean param0) {
        if (DisplayNameForm.field_I == this.transitionPhase) {
          return;
        }
        if (param0) {
          this.phaseTick = 0;
          this.transitionPhase = Js5Transport.field_i;
          this.installContent(this.pendingContent, 114);
          this.contentWrapper.field_O = 0;
          this.pendingContent = null;
          return;
        }
        this.tickLayerAndCheckHidden(true);
        this.phaseTick = 0;
        this.transitionPhase = Js5Transport.field_i;
        this.installContent(this.pendingContent, 114);
        this.contentWrapper.field_O = 0;
        this.pendingContent = null;
    }

    boolean onFocusedKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.onFocusedKey(param0, param1, param2, param3)) {
            return true;
          }
          if (null == this.contentWrapper) {
            return false;
          }
          if (param0 == 98) {
            this.contentWrapper.focusNext(param2, param1 ^ 24);
          }
          if (param0 == 99) {
            this.contentWrapper.focusNext(param2, 27);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("hb.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean tickLayerAndCheckHidden(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (!param0) {
          if (this.transitionPhase == null) {
            return super.tickLayerAndCheckHidden(false);
          }
          if (DisplayNameForm.field_I != this.transitionPhase) {
            if (this.transitionPhase != Js5Transport.field_i) {
              return super.tickLayerAndCheckHidden(false);
            }
            fieldTemp$0 = this.phaseTick + 1;
            this.phaseTick = this.phaseTick + 1;
            if (this.fadeInDuration == fieldTemp$0) {
              this.transitionPhase = null;
              this.contentWrapper.field_O = 256;
              return super.tickLayerAndCheckHidden(false);
            }
            this.contentWrapper.field_O = (this.phaseTick << 8) / this.fadeInDuration;
            return super.tickLayerAndCheckHidden(false);
          }
          fieldTemp$1 = this.phaseTick + 1;
          this.phaseTick = this.phaseTick + 1;
          if (fieldTemp$1 != this.fadeOutDuration) {
            this.contentWrapper.field_O = 256 - (this.phaseTick << 8) / this.fadeOutDuration;
            return super.tickLayerAndCheckHidden(false);
          }
          this.transitionPhase = ViewportController.field_h;
          this.startResizeAnimation(this.pendingContent.field_C + this.headerHeight + 12, 12 + this.pendingContent.field_E, this.field_gb, 57);
          this.phaseTick = 0;
          this.contentWrapper.field_O = 0;
          return super.tickLayerAndCheckHidden(false);
        }
        ContentTransitionDialog.getTimedNoticeText((byte) 58);
        if (this.transitionPhase == null) {
          return super.tickLayerAndCheckHidden(false);
        }
        if (DisplayNameForm.field_I != this.transitionPhase) {
          if (this.transitionPhase != Js5Transport.field_i) {
            return super.tickLayerAndCheckHidden(false);
          }
          fieldTemp$2 = this.phaseTick + 1;
          this.phaseTick = this.phaseTick + 1;
          if (this.fadeInDuration == fieldTemp$2) {
            this.transitionPhase = null;
            this.contentWrapper.field_O = 256;
            return super.tickLayerAndCheckHidden(false);
          }
          this.contentWrapper.field_O = (this.phaseTick << 8) / this.fadeInDuration;
          return super.tickLayerAndCheckHidden(false);
        }
        int fieldTemp$3 = this.phaseTick + 1;
        this.phaseTick = this.phaseTick + 1;
        if (fieldTemp$3 != this.fadeOutDuration) {
          this.contentWrapper.field_O = 256 - (this.phaseTick << 8) / this.fadeOutDuration;
          return super.tickLayerAndCheckHidden(false);
        }
        this.transitionPhase = ViewportController.field_h;
        this.startResizeAnimation(this.pendingContent.field_C + this.headerHeight + 12, 12 + this.pendingContent.field_E, this.field_gb, 57);
        this.phaseTick = 0;
        this.contentWrapper.field_O = 0;
        return super.tickLayerAndCheckHidden(false);
    }

    ContentTransitionDialog(ModalStack param0, UiComponent param1, int param2, int param3, int param4) {
        super(param0, param1.field_E + 12, param2 + 12 + param1.field_C);
        try {
          this.field_gb = param4;
          this.headerHeight = param2;
          this.fadeInDuration = param3;
          this.fadeOutDuration = param3;
          this.installContent(param1, 125);
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    void transitionToContent(UiComponent param0, int param1) {
        RuntimeException var3 = null;
        UiComponent var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.pendingContent = param0;
          if (ViewportController.field_h != this.transitionPhase) {
            if (DisplayNameForm.field_I != this.transitionPhase) {
              this.transitionPhase = DisplayNameForm.field_I;
              this.phaseTick = 0;
            }
          } else {
            this.startResizeAnimation(this.pendingContent.field_C + this.headerHeight + 12, 12 + this.pendingContent.field_E, this.field_gb, 57);
            this.phaseTick = 0;
          }
          if (param1 < -111) {
            return;
          }
          var4 = (UiComponent) null;
          this.onFocusedKey(-79, 114, (UiComponent) null, 'F');
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hb.R(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void installContent(UiComponent param0, int param1) {
        if (null != this.contentWrapper) {
          this.contentWrapper.unlink(2779);
        }
        if (param1 <= 101) {
          return;
        }
        try {
          if (param0 != null) {
            param0.setBounds(param0.field_E, (byte) 55, this.headerHeight + 6, 6, param0.field_C);
            this.contentWrapper = new AlphaContainer(param0);
          } else {
            this.contentWrapper = new AlphaContainer();
          }
          this.addChild(this.contentWrapper, 80);
          this.pendingContent = null;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "hb.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void finishAnimations(boolean param0) {
        if (null != this.transitionPhase) {
          if (Js5Transport.field_i != this.transitionPhase) {
            this.centerWithSize(this.headerHeight + 12 + this.pendingContent.field_C, (byte) -110, 12 + this.pendingContent.field_E);
            this.installContent(this.pendingContent, 111);
          }
          this.contentWrapper.field_O = 256;
          this.transitionPhase = null;
        }
        super.finishAnimations(param0);
    }

    public static void clearStatics(byte param0) {
        field_hb = null;
        field_jb = null;
        field_eb = null;
        if (param0 != 82) {
          String var2 = (String) null;
          ContentTransitionDialog.getNamedTextFile((String) null, (byte) -11);
        }
    }

    final boolean isDismissed(byte param0) {
        this.finishAnimations(false);
        if (param0 < 120) {
          this.onResizeFinished(false);
          return super.isDismissed((byte) 126);
        }
        return super.isDismissed((byte) 126);
    }

    final static String getTimedNoticeText(byte param0) {
        int var1 = -24 / ((-51 - param0) / 54);
        if (LoadingStepTracker.field_h) {
          return null;
        }
        if (Js5ArchiveManager.field_c > CachedTextLayout.field_h) {
          return null;
        }
        if (!(Js5ArchiveManager.field_c + CipherPacketBuffer.field_s <= CachedTextLayout.field_h)) {
          return qg.field_b;
        }
        return null;
    }

    static {
        field_kb = true;
    }
}
