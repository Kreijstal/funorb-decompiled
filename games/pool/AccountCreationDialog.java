/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationDialog extends MessageDialog implements ButtonActivationListener {
    static boolean field_Gb;
    static String muChatOn;
    static String mpRematchnewgame;
    private boolean field_Fb;
    private boolean field_Eb;
    static int[] field_Hb;
    private AccountCreationForm field_Cb;

    final static boolean hasCanvasFocus(int obfuscationGuard) {
        if (obfuscationGuard == 0) {
          return null == MatchingTextValidator.field_u ? MeshBase.field_e : true;
        }
        AccountCreationDialog.hasCanvasFocus(71);
        return null == MatchingTextValidator.field_u ? MeshBase.field_e : true;
    }

    public static void releaseStatics(int param0) {
        mpRematchnewgame = null;
        muChatOn = null;
        if (param0 != 5) {
          return;
        }
        field_Hb = null;
    }

    private final void showCreationResponse(LoginResponse response, int obfuscationGuard, boolean initialError) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        MessageDialogContent var5 = null;
        int var6 = 0;
        var6 = Pool.field_O;
        try {
          this.field_Fb = true;
          if (obfuscationGuard != 5) {
            field_Gb = true;
          }
          if (!response.field_f) {
            if (null == response.field_c) {
              var4 = response.field_b;
              if (response.field_g == 248) {
                if (!initialError) {
                  PoolMatchController.setTuhstatbutCookie((byte) -80);
                }
                var4 = NodeHashTableIterator.createIneligible;
                this.field_Eb = true;
              }
            } else {
              var4 = TextHotspotRegion.createUsernameUnavailable;
              if (null != this.field_Cb) {
                this.field_Cb.onMoreSuggestionsRequested(obfuscationGuard ^ 16777210);
              }
            }
          } else {
            var4 = SingleChildWidget.createAccountSuccess;
          }
          var5 = new MessageDialogContent((MessageDialog) (this), LoginPayloadFactory.field_e, var4);
          if (response.field_f) {
            if (response.field_e) {
              this.replaceContent(new Under13NoticePanel(this), 30);
              return;
            }
            var5.addButton(WeightedLruCache.cont, obfuscationGuard - 88, (WidgetListener) (this));
          } else {
            if (this.field_Eb) {
              var5.addButton(WeightedLruCache.cont, -123, (WidgetListener) (this));
            } else {
              if (response.field_g == 5) {
                var5.addActionButton(11, NodeHashTableIterator.reloadgame, obfuscationGuard ^ 4);
                var5.addActionButton(17, FullscreenDisplayMode.quittowebsite, 1);
              } else {
                var5.addActionButton(-1, CueStick.back, obfuscationGuard ^ 4);
              }
            }
            if (3 == response.field_g) {
              var5.addActionButton(7, UiComponentNode.toserverlist, obfuscationGuard ^ 4);
            } else {
              if (response.field_g != 6) {
                this.replaceContent(var5, 30);
                return;
              }
              var5.addActionButton(9, ChoiceButtonSupport.tocustomersupport, 1);
            }
          }
          this.replaceContent(var5, 30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("fq.TB(");
          if (response == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(obfuscationGuard).append(',').append(initialError).append(')').toString());
        }
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, ButtonWidget param3, int param4) {
        if (this.field_Eb) {
          PacketDiagnosticsSupport.a(115, false, true);
          return;
        }
        NineSliceFrame.a((byte) 41);
        if (!param0) {
          return;
        }
        try {
          this.dismissDialog(17);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fq.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final boolean advanceDialogAnimation(byte param0) {
        LoginResponse var2 = null;
        LoginResponse var2Lifetime1;
        if (param0 != -20) {
          mpRematchnewgame = (String) null;
          if (!this.dialogOpen) {
            return super.advanceDialogAnimation((byte) -20);
          }
          if (this.field_Fb) {
            return super.advanceDialogAnimation((byte) -20);
          }
          var2 = DirectByteStorage.pollAccountCreationResponse(true);
          if (var2 != null) {
            this.showCreationResponse(var2, param0 + 25, false);
            return super.advanceDialogAnimation((byte) -20);
          }
          return super.advanceDialogAnimation((byte) -20);
        }
        if (!this.dialogOpen) {
          return super.advanceDialogAnimation((byte) -20);
        }
        if (this.field_Fb) {
          return super.advanceDialogAnimation((byte) -20);
        }
        var2Lifetime1 = DirectByteStorage.pollAccountCreationResponse(true);
        if (var2Lifetime1 != null) {
          this.showCreationResponse(var2Lifetime1, param0 + 25, false);
          return super.advanceDialogAnimation((byte) -20);
        }
        return super.advanceDialogAnimation((byte) -20);
    }

    AccountCreationDialog(DialogLayer param0, AccountCreationForm param1) {
        super(param0, LoginPayloadFactory.field_e, DualLinkNodeHashTable.creatingyouraccount, false, false);
        try {
          this.field_Cb = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void showCreationIneligible(byte obfuscationGuard) {
        this.showCreationResponse(DebouncedValidationProvider.createLoginErrorResponse(248, true, NodeHashTableIterator.createIneligible), 5, true);
        if (obfuscationGuard > -44) {
          field_Gb = true;
        }
    }

    final static void switchScreen(int obfuscationGuard, int screenId, int parentScreenId, boolean animate) {
        int var4;
        StatefulTextPainter.field_s.setCursorVisible(true, (byte) 106, (java.awt.Component) ((Object) TextLineLayout.getActiveCanvas((byte) -37)));
        ThemeSelectScreen.field_P = 0;
        GameRules.field_b = screenId;
        if (obfuscationGuard != -3405) {
          return;
        }
        MaxLengthTextInputWidget.initializeBallPreview(obfuscationGuard ^ 22150);
        if (!ShotEvent.isNonnegative(true, GameRules.field_b)) {
          if (GameRules.field_b < 0) {
            if (-2 == GameRules.field_b) {
              KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[3]);
              }
              return;
            }
            if (GameRules.field_b == -5) {
              KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
            } else {
              if (GameRules.field_b == -4) {
                KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
              }
            }
          } else {
            if (DisplayModeSupport.field_c[GameRules.field_b].field_n) {
              KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
            } else {
              if (-2 == GameRules.field_b) {
                KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
              } else {
                if (GameRules.field_b == -5) {
                  KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
                } else {
                  if (GameRules.field_b == -4) {
                    KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
                  }
                }
              }
            }
          }
          if (GameRules.field_b == -2) {
            return;
          }
          if (GameRules.field_b == -4) {
            return;
          }
          TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[3]);
          return;
        }
        DisplayModeSupport.field_c[GameRules.field_b].parentScreenId = parentScreenId;
        var4 = 0;
        if (GameRules.field_b == 21) {
          var4 = -1;
        }
        DisplayModeSupport.field_c[GameRules.field_b].onEnter(0, var4, animate);
        if (GameRules.field_b != 21) {
          if (GameRules.field_b < 0) {
            if (-2 == GameRules.field_b) {
              KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[3]);
              }
              return;
            }
            if (GameRules.field_b == -5) {
              KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[3]);
                return;
              }
              return;
            }
            if (GameRules.field_b == -4) {
              KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
            }
          } else {
            if (DisplayModeSupport.field_c[GameRules.field_b].field_n) {
              KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
            } else {
              if (-2 == GameRules.field_b) {
                KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
                if (GameRules.field_b != -2 &&
                  GameRules.field_b != -4) {
                  TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[3]);
                  return;
                }
                return;
              }
              if (GameRules.field_b == -5) {
                KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
                if (GameRules.field_b != -2 &&
                  GameRules.field_b != -4) {
                  TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[3]);
                  return;
                }
                return;
              }
              if (GameRules.field_b == -4) {
                KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
                if (GameRules.field_b != -2 &&
                  GameRules.field_b != -4) {
                  TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[3]);
                  return;
                }
                return;
              }
            }
          }
        } else {
          MouseWheelInput.a(-83, animate);
          if (GameRules.field_b < 0) {
            if (-2 == GameRules.field_b) {
              KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[3]);
                return;
              }
              return;
            }
            if (GameRules.field_b == -5) {
              KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[3]);
                return;
              }
              return;
            }
            if (GameRules.field_b == -4) {
              KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
            }
          } else {
            if (DisplayModeSupport.field_c[GameRules.field_b].field_n) {
              KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[3]);
                return;
              }
              return;
            }
            if (-2 == GameRules.field_b) {
              KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[3]);
                return;
              }
              return;
            }
            if (GameRules.field_b == -5) {
              KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[3]);
                return;
              }
              return;
            }
            if (GameRules.field_b == -4) {
              KillerBallSkin.playMusicTrack(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[3]);
                return;
              }
              return;
            }
          }
        }
        if (GameRules.field_b == -2) {
          return;
        }
        if (GameRules.field_b == -4) {
          return;
        }
        TextLineLayout.a((byte) -27, BeveledFrameSpriteFactory.field_c[3]);
        return;
    }

    static {
        muChatOn = "On";
        mpRematchnewgame = "Set up new game";
        field_Hb = new int[]{2, 20, 21, 49, 6, 5, 12, 13};
    }
}
