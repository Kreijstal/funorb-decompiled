/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ProgressMessageDialog extends ContentTransitionDialog implements ButtonActionListener {
    static int field_sb;
    private boolean field_ob;
    private boolean field_rb;
    static int field_wb;
    private boolean field_qb;
    private boolean field_vb;
    private BitmapFont field_ub;
    static String field_pb;
    private StripedProgressBar field_tb;
    static String field_nb;

    public static void releaseStatics(byte param0) {
        int var1 = -101 / ((-67 - param0) / 47);
        field_nb = null;
        field_pb = null;
    }

    final static QuickChatMenu createQuickChatPhraseMenu(int param0, UiComponent param1, UiComponent param2, UiComponent param3, int[] param4) {
        int var10_int = 0;
        Object stackIn_9_0 = null;
        QuickChatMenu stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        String[] var6 = null;
        char[] var7 = null;
        QuickChatMenu[] var8 = null;
        int var9 = 0;
        Exception var10 = null;
        QuickChatPhraseDefinition var11 = null;
        int var12 = 0;
        int[] var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        var12 = TetraLink.field_J;
        try {
          var5_int = param4.length;
          if (param0 > -26) {
            var13 = (int[]) null;
            ProgressMessageDialog.createQuickChatPhraseMenu(90, (UiComponent) null, (UiComponent) null, (UiComponent) null, (int[]) null);
          }
          var6 = new String[var5_int];
          var15 = new char[var5_int];
          var14 = var15;
          var7 = var14;
          var8 = new QuickChatMenu[var5_int];
          var9 = 49;
          try {
            for (var10_int = 0; var10_int < var5_int; var10_int++) {
              var11 = QueuedStatSubmission.field_p.getPhraseDefinition(param4[var10_int], -128);
              var6[var10_int] = var11.getPreviewText(-107);
              var9 = (char)(var9 + 1);
              var7[var10_int] = (char)var9;
              var8[var10_int] = null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10 = (Exception) (Object) decompiledCaughtException;
            stackIn_9_0 = null;
            return (QuickChatMenu) (stackIn_9_0);
          }
          stackIn_11_0 = new QuickChatMenu(0L, param3, param2, param1, var8, param4, var6, var15);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("lk.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    ProgressMessageDialog(WidgetContainer param0, BitmapFont param1, String param2, boolean param3, boolean param4) {
        super(param0, new MessageDialogContent((ProgressMessageDialog) null, param1, param2), 77, 10, 10);
        try {
          this.field_ob = false;
          this.field_qb = false;
          this.field_ub = param1;
          this.field_rb = param4 ? true : false;
          this.field_vb = param3 ? true : false;
          this.field_tb = new StripedProgressBar(13, 50, 274, 30, 15, 2113632, 4210752);
          this.field_tb.field_K = true;
          this.addChild(this.field_tb, 10);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean handleKey(int param0, char param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1) {
            ProgressMessageDialog.getHostApplet(108);
          }
          if (param0 != 13) {
            stackIn_7_0 = super.handleKey(param0, param1, 1, param3);
            return stackIn_7_0;
          }
          this.closeDialog(-125);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("lk.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void showConnectionRestored(int param0) {
        if (param0 != 128) {
          LobbyGame var3 = (LobbyGame) null;
          ProgressMessageDialog.findValidSettingCombination(false, (byte) -124, 39, (LobbyGame) null, -11, -14, 32, -111);
        }
        this.field_tb.setStripeColours(param0 ^ 248, 2121792, 4210752);
        MessageDialogContent var2 = new MessageDialogContent(this, this.field_ub, HighscoreQuery.field_t);
        var2.addActionButton(MusicPatchEnvelope.field_l, 15, param0 ^ -256);
        this.transitionToContent(var2, -27667);
    }

    final static java.applet.Applet getHostApplet(int param0) {
        if (param0 != 13) {
          field_sb = 60;
        }
        if (null != RegistrationResponseHelpers.field_c) {
          return RegistrationResponseHelpers.field_c;
        }
        return (java.applet.Applet) ((Object) ChatPanelSlideHelpers.field_a);
    }

    final void closeDialog(int param0) {
        if (!this.field_K) {
          return;
        }
        this.field_K = false;
        if (this.field_vb) {
          PasswordLoginCredentials.showLoginForm(-8);
        } else {
          if (this.field_rb) {
            ContextMenu.openLoginDialog((byte) 116);
          }
        }
        if (param0 >= -122) {
          this.closeDialog(122);
        }
    }

    final static boolean canAppendNameCharacter(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!AccountServerResult.isAllowedNameCharacter(3010, param0)) {
            return false;
          }
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (param1 != -1) {
            return true;
          }
          if (12 <= var3_int) {
            return false;
          }
          if (!NameSeparatorHelpers.isNameSeparator((byte) 81, param0)) {
            return true;
          }
          if (var3_int != 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("lk.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static void findValidSettingCombination(boolean param0, byte param1, int param2, LobbyGame param3, int param4, int param5, int param6, int param7) {
        IconLabelItem[][] stackIn_35_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        IconLabelItem[] var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        IconLabelItem var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        LobbyGame var16 = null;
        IconLabelItem[] var17 = null;
        int[] var18 = null;
        IconLabelItem[] var19 = null;
        int[] var20 = null;
        int var10Lifetime1;
        int var13_intLifetime1;
        var15 = TetraLink.field_J;
        try {
          if (param1 >= -111) {
            var16 = (LobbyGame) null;
            ProgressMessageDialog.findValidSettingCombination(true, (byte) -16, 61, (LobbyGame) null, -105, 77, -74, -96);
          }
          if (param6 <= param2) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (var9 >= ThreeSliceButtonPainter.field_s.length) {
                if (var8_int == 0) {
                  return;
                }
                EditableTextWidget.field_R = true;
                return;
              }
              var20 = ThreeSliceButtonPainter.field_s[var9];
              var18 = var20;
              var10_ref_int__ = var18;
              var11 = 0;
              var12 = 0;
              scanLoop1: while (true) {
                if (var12 >= var20.length) {
                  if (var11 == 0 &&
                    GameOptionControls.field_k != param2) {
                    break scanLoop1;
                  }
                  var8_int = 0;
                  for (var12 = 0; var12 < var20.length; var12 += 2) {
                    var13_int = var20[var12];
                    if (var13_int != -1) {
                      if (param2 > var13_int) {
                        NetworkArchiveRequest.field_G[var13_int] = true;
                      }
                    } else {
                      NameSuggestionsPanel.field_P = true;
                    }
                  }
                  break scanLoop1;
                }
                var13_intLifetime1 = var20[var12];
                var14 = var10_ref_int__[1 + var12];
                if (-1 == var13_intLifetime1) {
                  if (MenuScreen.field_f[param5] != var14) {
                    break scanLoop1;
                  }
                } else {
                  if (param2 == var13_intLifetime1 &&
                    param7 == var14) {
                    var11 = 1;
                  } else {
                    if (var13_intLifetime1 >= param2) {
                      break scanLoop1;
                    }
                    if ((255 & ArrayWidgetContainer.field_K[var13_intLifetime1]) != var14) {
                      break scanLoop1;
                    }
                  }
                }
                var12 += 2;
                continue;

              }
              var9++;
            }
          }
          stackIn_35_0 = ClientException.field_e;
          if (-1 == param2) {
            stackIn_36_1 = 1;
          } else {
            stackIn_36_1 = param2 + 4;
          }
          var17 = stackIn_35_0[stackIn_36_1];
          var19 = var17;
          var8 = var19;
          var9 = 1;
          if (param0) {
            if (param2 != -1) {
              for (var10 = 0; var10 < -1 + var17.length; var10++) {
                if ((StringPadHelpers.field_a[(param4 + var10) / 8] & 1 << (7 & param4 + var10)) == 0) {
                  continue;
                }
                var9 = 0;
                break;
              }
              param4 = param4 + (255 & EditableTextWidget.field_Y[param2]);
            } else {
              var10 = 0;
              while (!(MenuScreen.field_f.length <= var10)) {
                if (0 == (PendingSubmission.field_o[var10 / 8] & 1 << (7 & var10))) {
                  var10++;
                  continue;
                }
                var9 = 0;
                break;
              }
            }
          }
          var10Lifetime1 = 0;
          var11 = 0;
          while (true) {
            if (param2 != -1) {
              stackIn_54_0 = var19.length - 1;
            } else {
              stackIn_54_0 = MenuScreen.field_f.length;
            }
            if (stackIn_54_0 <= var11) {
              if (var10Lifetime1 != 0) {
                return;
              }
              for (var11 = 0; -1 + var19.length > var11; var11++) {
                if (param2 == -1) {
                  param5 = var11;
                } else {
                  ArrayWidgetContainer.field_K[param2] = (byte)var11;
                }
                ProgressMessageDialog.findValidSettingCombination(param0, (byte) -118, param2 + 1, param3, param4, param5, param6, param7);
                if (EditableTextWidget.field_R) {
                  return;
                }
              }
              return;
            }
            if (-1 == param2) {
              param5 = var11;
            } else {
              ArrayWidgetContainer.field_K[param2] = (byte)var11;
            }
            if (param2 == -1 &&
              MenuScreen.field_f.length == 1) {
              var12 = 1;
            } else {
              var13 = var8[var11 + 1];
              if (param0) {
                if (!var13.field_zb) {
                  if (var9 != 0) {
                    stackIn_78_0 = (var13.field_S) ? 1 : 0;
                  } else {
                    stackIn_78_0 = 0;
                  }
                } else {
                  stackIn_78_0 = 1;
                }
                var12 = stackIn_78_0;
              } else {
                if (param2 == -1) {
                  stackIn_69_0 = (MenuScreen.field_f[var11] != AccountWelcomePanel.field_N.field_rc) ? 0 : 1;
                } else {
                  stackIn_69_0 = (var11 != (255 & AccountWelcomePanel.field_N.field_sc[param2])) ? 0 : 1;
                }
                var12 = stackIn_69_0;
              }
            }
            if (var12 != 0) {
              ProgressMessageDialog.findValidSettingCombination(param0, (byte) -120, param2 + 1, param3, param4, param5, param6, param7);
              var10Lifetime1 = 1;
            }
            if (EditableTextWidget.field_R) {
              return;
            }
            var11++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_100_0 = var8_ref;
          stackIn_100_1 = new StringBuilder().append("lk.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void showResultMessage(String param0, int param1, int param2) {
        boolean stackIn_6_1 = false;
        MessageDialogContent stackIn_13_0 = null;
        String stackIn_14_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        MessageDialogContent var6 = null;
        var5 = TetraLink.field_J;
        try {
          if (this.field_qb) {
            return;
          }
          stackIn_6_1 = (param1 == 256);
          this.field_ob = stackIn_6_1;
          this.field_qb = true;
          this.field_tb.setStripeColours(-32, 8405024, 4210752);
          if (param2 != 17) {
            this.closeDialog(0);
          }
          var6 = new MessageDialogContent(this, this.field_ub, param0);
          if (5 != param1) {
            if (param1 == 256) {
              var6.addButton((WidgetListener) (this), param2 ^ -44, CacheEntry.field_v);
            } else {
              stackIn_13_0 = var6;
              if (!this.field_vb) {
                stackIn_14_1 = ResizableDialog.field_T;
              } else {
                stackIn_14_1 = CacheEntry.field_v;
              }
              ((MessageDialogContent) (Object) stackIn_13_0).addActionButton(stackIn_14_1, -1, param2 ^ 103);
            }
          } else {
            var6.addActionButton(ContentTransitionDialog.field_hb, 11, 94);
            var6.addActionButton(GameClock.field_a, 17, 91);
          }
          if (param1 == 3) {
            var6.addActionButton(UiComponent.field_C, 7, param2 ^ 108);
          } else {
            if (param1 == 4) {
              var6.addActionButton(QuickChatPhraseCache.field_d, 8, 97);
            } else {
              if (6 == param1) {
                var6.addActionButton(GameBoard.field_c, 9, 81);
              } else {
                if (9 != param1) {
                  this.transitionToContent(var6, -27667);
                  return;
                }
                var6.addButton((WidgetListener) (this), 40, AccountTextGlobals.field_d);
              }
            }
          }
          this.transitionToContent(var6, -27667);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("lk.EA(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public void onButtonActivated(byte param0, TextButton param1, int param2, int param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param0 > 0) {
            this.field_rb = false;
          }
          if (this.field_ob) {
            ArchiveIndex.setPendingMenuAction(3, 0);
            this.closeDialog(-124);
          } else {
            MouseInputHandler.openRelativeUrl(-92, "tochangedisplayname.ws", ProgressMessageDialog.getHostApplet(13));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("lk.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_sb = -1;
        field_nb = "Remove <%0> from ignore list";
        field_pb = "Start Game";
    }
}
