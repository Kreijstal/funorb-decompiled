/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyPlayer extends SceneWidget {
    boolean field_Zb;
    int field_dc;
    long field_ec;
    static boolean field_lc;
    int field_qc;
    static String[] field_ic;
    static String field_Xb;
    int field_ac;
    int field_jc;
    String field_Vb;
    static int field_gc;
    boolean field_kc;
    SceneWidget field_Yb;
    String field_mc;
    SceneWidget field_hc;
    boolean field_nc;
    static String field_Tb;
    static ArgbSprite[] field_pc;
    SceneWidget field_cc;
    SceneWidget field_oc;
    long field_fc;
    int field_Ub;
    SceneWidget field_Sb;
    static SceneWidget field_bc;
    int field_Wb;

    final static void updateReportAbuseDialog(int param0, byte param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var3 = -68 / ((-30 - param1) / 54);
        if (null != FunOrbClient.field_x) {
          var4 = FunOrbClient.field_x.pollOffence(param2, -95);
          if (var4 != -2) {
            if (var4 != -1) {
              var5 = FunOrbClient.field_x.isMuteSelected((byte) 63) ? 1 : 0;
              MouseInputHandler.sendAbuseReport(0, var5 != 0, FunOrbClient.field_x.field_hc, var4, FunOrbClient.field_x.getEnteredText(true), param0);
            }
            FunOrbClient.field_x = null;
            PendingDataRequest.closeContextMenu(false);
          }
        }
    }

    final static void advanceLobbyTransitions(boolean param0, int param1) {
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        if (param1 != 0) {
          return;
        }
        if (param0 ||
          null == LoginEncryptionHelpers.field_b) {
          GzipDecoder.field_c = false;
        }
        if (!param0) {
          if (null != LoginEncryptionHelpers.field_b) {
            if (0 < SentinelCommand.field_t) {
              SentinelCommand.field_t = SentinelCommand.field_t - 1;
            } else {
              if (SolidSpriteHelpers.field_c > 0) {
                SolidSpriteHelpers.field_c = SolidSpriteHelpers.field_c - 1;
              } else {
                if (PasswordRuleHelpers.field_f < AudioService.field_h) {
                  if (PasswordRuleHelpers.field_f == 0) {
                    AccountTermsPanel.buildSocialPanels(false, true);
                  }
                  PasswordRuleHelpers.field_f = PasswordRuleHelpers.field_f + 1;
                }
              }
            }
          } else {
            if (ByteArrayPoolHelpers.field_a != null) {
              if (SentinelCommand.field_t <= 0) {
                if (0 >= PasswordRuleHelpers.field_f) {
                  if (AudioService.field_h > SolidSpriteHelpers.field_c) {
                    if (0 == SolidSpriteHelpers.field_c) {
                      AccountTermsPanel.buildSocialPanels(true, true);
                    }
                    SolidSpriteHelpers.field_c = SolidSpriteHelpers.field_c + 1;
                  }
                } else {
                  PasswordRuleHelpers.field_f = PasswordRuleHelpers.field_f - 1;
                }
              } else {
                SentinelCommand.field_t = SentinelCommand.field_t - 1;
              }
            } else {
              GzipDecoder.field_c = false;
              if (0 >= SolidSpriteHelpers.field_c) {
                if (PasswordRuleHelpers.field_f > 0) {
                  PasswordRuleHelpers.field_f = PasswordRuleHelpers.field_f - 1;
                } else {
                  if (SentinelCommand.field_t < AudioService.field_h) {
                    if (SentinelCommand.field_t == 0) {
                      LoginDialog.buildMainScreenRoots(854);
                    }
                    SentinelCommand.field_t = SentinelCommand.field_t + 1;
                  }
                }
              } else {
                SolidSpriteHelpers.field_c = SolidSpriteHelpers.field_c - 1;
              }
            }
          }
        } else {
          if (SentinelCommand.field_t > 0) {
            SentinelCommand.field_t = SentinelCommand.field_t - 1;
          } else {
            if (0 < SolidSpriteHelpers.field_c) {
              SolidSpriteHelpers.field_c = SolidSpriteHelpers.field_c - 1;
            } else {
              if (PasswordRuleHelpers.field_f > 0) {
                PasswordRuleHelpers.field_f = PasswordRuleHelpers.field_f - 1;
              }
            }
          }
        }
    }

    public static void releaseStatics(int param0) {
        field_Xb = null;
        field_Tb = null;
        field_ic = null;
        if (param0 < 73) {
          LobbyPlayer.updateReportAbuseDialog(24, (byte) -21, true);
        }
        field_bc = null;
        field_pc = null;
    }

    final boolean isUnlisted(byte param0) {
        if (param0 != -36) {
          LobbyPlayer.updateReportAbuseDialog(-73, (byte) -40, false);
        }
        return !this.isDualLinked((byte) 30) ? true : false;
    }

    LobbyPlayer(String param0, String param1, long param2) {
        super(0L, (SceneWidget) null);
        CharSequence var6 = null;
        try {
          this.field_mc = param0;
          this.field_ec = param2;
          this.field_Vb = param1;
          var6 = (CharSequence) ((Object) this.field_mc);
          AlphaContainer.normalizeDisplayName(1, var6);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean sortsBefore(LobbyPlayer param0, int param1) {
        RuntimeException var3 = null;
        LobbyPlayer var4 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_11_0 = false;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (param0.field_kc) ? 0 : 1;
          if (stackIn_3_0 == (this.field_kc ? 1 : 0)) {
            stackIn_5_0 = this.field_kc;
            return stackIn_5_0;
          }
          if (param1 >= -35) {
            var4 = (LobbyPlayer) null;
            this.sortsBefore((LobbyPlayer) null, 15);
          }
          if (param0.field_Zb != this.field_Zb) {
            stackIn_11_0 = this.field_Zb;
            return stackIn_11_0;
          }
          stackIn_15_0 = !(this.field_fc >= param0.field_fc);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("cc.G(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void resetFrameTimingHistory(int param0) {
        int var1_int = 0;
        int var2 = SteelSentinels.obfuscationControl;
        int var1_intLifetime1;
        try {
          ContentTransitionDialog.field_qb.reset((byte) -118);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            AccountMessagePanel.field_T[var1_int] = 0L;
          }
          for (var1_intLifetime1 = param0; 32 > var1_intLifetime1; var1_intLifetime1++) {
            HighscoreColumnHeader.field_c[var1_intLifetime1] = 0L;
          }
          OptionMaskHelpers.field_a = 0;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "cc.B(" + param0 + ')');
        }
    }

    final void setNames(int param0, String param1, String param2) {
        CharSequence var5 = null;
        try {
          this.field_mc = param1;
          this.field_Vb = param2;
          var5 = (CharSequence) ((Object) this.field_mc);
          AlphaContainer.normalizeDisplayName(1, var5);
          int var4_int = -54 / ((54 - param0) / 38);
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "cc.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_ic = new String[]{"TRAINING", "ILOLIAN INCIDENT", "SOLARITE WAR"};
        field_Tb = "<%1> was damaged by <%0>";
        field_lc = false;
    }
}
