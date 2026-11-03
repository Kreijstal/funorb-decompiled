/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fq extends MessageDialog implements ButtonActivationListener {
    static boolean field_Gb;
    static String muChatOn;
    static String mpRematchnewgame;
    private boolean field_Fb;
    private boolean field_Eb;
    static int[] field_Hb;
    private AccountCreationForm field_Cb;

    final static boolean m(int param0) {
        if (param0 == 0) {
          return null == MatchingTextValidator.field_u ? um.field_e : true;
        }
        fq.m(71);
        return null == MatchingTextValidator.field_u ? um.field_e : true;
    }

    public static void releaseStatics(int param0) {
        mpRematchnewgame = null;
        muChatOn = null;
        if (param0 != 5) {
          return;
        }
        field_Hb = null;
    }

    private final void a(wc param0, int param1, boolean param2) {
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
          if (param1 != 5) {
            field_Gb = true;
          }
          if (!param0.field_f) {
            if (null == param0.field_c) {
              var4 = param0.field_b;
              if (param0.field_g == 248) {
                if (!param2) {
                  PoolMatchController.r((byte) -80);
                }
                var4 = NodeHashTableIterator.createIneligible;
                this.field_Eb = true;
              }
            } else {
              var4 = TextHotspotRegion.createUsernameUnavailable;
              if (null != this.field_Cb) {
                this.field_Cb.onMoreSuggestionsRequested(param1 ^ 16777210);
              }
            }
          } else {
            var4 = SingleChildWidget.createAccountSuccess;
          }
          var5 = new MessageDialogContent((MessageDialog) (this), bi.field_e, var4);
          if (param0.field_f) {
            if (param0.field_e) {
              this.replaceContent(new Under13NoticePanel(this), 30);
              return;
            }
            var5.addButton(WeightedLruCache.cont, param1 - 88, (WidgetListener) (this));
          } else {
            if (this.field_Eb) {
              var5.addButton(WeightedLruCache.cont, -123, (WidgetListener) (this));
            } else {
              if (param0.field_g == 5) {
                var5.addActionButton(11, NodeHashTableIterator.reloadgame, param1 ^ 4);
                var5.addActionButton(17, dj.quittowebsite, 1);
              } else {
                var5.addActionButton(-1, CueStick.back, param1 ^ 4);
              }
            }
            if (3 == param0.field_g) {
              var5.addActionButton(7, UiComponentNode.toserverlist, param1 ^ 4);
            } else {
              if (param0.field_g != 6) {
                this.replaceContent(var5, 30);
                return;
              }
              var5.addActionButton(9, e.tocustomersupport, 1);
            }
          }
          this.replaceContent(var5, 30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("fq.TB(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, ButtonWidget param3, int param4) {
        if (this.field_Eb) {
          t.a(115, false, true);
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
        wc var2 = null;
        wc var2Lifetime1;
        if (param0 != -20) {
          mpRematchnewgame = (String) null;
          if (!this.dialogOpen) {
            return super.advanceDialogAnimation((byte) -20);
          }
          if (this.field_Fb) {
            return super.advanceDialogAnimation((byte) -20);
          }
          var2 = hi.a(true);
          if (var2 != null) {
            this.a(var2, param0 + 25, false);
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
        var2Lifetime1 = hi.a(true);
        if (var2Lifetime1 != null) {
          this.a(var2Lifetime1, param0 + 25, false);
          return super.advanceDialogAnimation((byte) -20);
        }
        return super.advanceDialogAnimation((byte) -20);
    }

    fq(DialogLayer param0, AccountCreationForm param1) {
        super(param0, bi.field_e, DualLinkNodeHashTable.creatingyouraccount, false, false);
        try {
          this.field_Cb = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "fq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void p(byte param0) {
        this.a(DebouncedValidationProvider.a(248, true, NodeHashTableIterator.createIneligible), 5, true);
        if (param0 > -44) {
          field_Gb = true;
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4;
        StatefulTextPainter.field_s.a(true, (byte) 106, (java.awt.Component) ((Object) TextLineLayout.a((byte) -37)));
        ThemeSelectScreen.field_P = 0;
        GameRules.field_b = param1;
        if (param0 != -3405) {
          return;
        }
        ga.m(param0 ^ 22150);
        if (!dn.a(true, GameRules.field_b)) {
          if (GameRules.field_b < 0) {
            if (-2 == GameRules.field_b) {
              KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, il.field_c[3]);
              }
              return;
            }
            if (GameRules.field_b == -5) {
              KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
            } else {
              if (GameRules.field_b == -4) {
                KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
              }
            }
          } else {
            if (s.field_c[GameRules.field_b].field_n) {
              KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
            } else {
              if (-2 == GameRules.field_b) {
                KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
              } else {
                if (GameRules.field_b == -5) {
                  KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
                } else {
                  if (GameRules.field_b == -4) {
                    KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
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
          TextLineLayout.a((byte) -27, il.field_c[3]);
          return;
        }
        s.field_c[GameRules.field_b].parentScreenId = param2;
        var4 = 0;
        if (GameRules.field_b == 21) {
          var4 = -1;
        }
        s.field_c[GameRules.field_b].onEnter(0, var4, param3);
        if (GameRules.field_b != 21) {
          if (GameRules.field_b < 0) {
            if (-2 == GameRules.field_b) {
              KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, il.field_c[3]);
              }
              return;
            }
            if (GameRules.field_b == -5) {
              KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, il.field_c[3]);
                return;
              }
              return;
            }
            if (GameRules.field_b == -4) {
              KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
            }
          } else {
            if (s.field_c[GameRules.field_b].field_n) {
              KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
            } else {
              if (-2 == GameRules.field_b) {
                KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
                if (GameRules.field_b != -2 &&
                  GameRules.field_b != -4) {
                  TextLineLayout.a((byte) -27, il.field_c[3]);
                  return;
                }
                return;
              }
              if (GameRules.field_b == -5) {
                KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
                if (GameRules.field_b != -2 &&
                  GameRules.field_b != -4) {
                  TextLineLayout.a((byte) -27, il.field_c[3]);
                  return;
                }
                return;
              }
              if (GameRules.field_b == -4) {
                KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
                if (GameRules.field_b != -2 &&
                  GameRules.field_b != -4) {
                  TextLineLayout.a((byte) -27, il.field_c[3]);
                  return;
                }
                return;
              }
            }
          }
        } else {
          id.a(-83, param3);
          if (GameRules.field_b < 0) {
            if (-2 == GameRules.field_b) {
              KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, il.field_c[3]);
                return;
              }
              return;
            }
            if (GameRules.field_b == -5) {
              KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, il.field_c[3]);
                return;
              }
              return;
            }
            if (GameRules.field_b == -4) {
              KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
            }
          } else {
            if (s.field_c[GameRules.field_b].field_n) {
              KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, il.field_c[3]);
                return;
              }
              return;
            }
            if (-2 == GameRules.field_b) {
              KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, il.field_c[3]);
                return;
              }
              return;
            }
            if (GameRules.field_b == -5) {
              KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, il.field_c[3]);
                return;
              }
              return;
            }
            if (GameRules.field_b == -4) {
              KillerBallSkin.a(256, false, true, HalloweenBallSkin.field_m);
              if (GameRules.field_b != -2 &&
                GameRules.field_b != -4) {
                TextLineLayout.a((byte) -27, il.field_c[3]);
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
        TextLineLayout.a((byte) -27, il.field_c[3]);
        return;
    }

    static {
        muChatOn = "On";
        mpRematchnewgame = "Set up new game";
        field_Hb = new int[]{2, 20, 21, 49, 6, 5, 12, 13};
    }
}
