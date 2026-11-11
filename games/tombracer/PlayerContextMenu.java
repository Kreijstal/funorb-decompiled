/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerContextMenu {
    private String field_d;
    private int field_b;
    private long field_g;
    private int[] field_e;
    ContextMenu field_f;
    UiComponent field_h;
    int field_k;
    static fp field_j;
    static volatile boolean field_c;
    String field_i;
    static String field_a;

    public static void releaseStatics(byte param0) {
        int var1 = 37 % ((7 - param0) / 44);
        field_j = null;
        field_a = null;
    }

    final boolean handleEscape(int param0) {
        if (param0 != 13) {
          gqa var3 = (gqa) null;
          this.addChatFilterActions((gqa) null, -72);
          if (this.field_f == null) {
            return false;
          }
          if (this.field_f.handleEscape(param0 ^ -13)) {
            return true;
          }
          return false;
        }
        if (this.field_f == null) {
          return false;
        }
        if (this.field_f.handleEscape(param0 ^ -13)) {
          return true;
        }
        return false;
    }

    private final String getDisplayName(int param0) {
        String var2 = null;
        if (param0 != -13) {
          return (String) null;
        }
        if (this.field_d == null) {
          var2 = this.field_i;
        } else {
          var2 = this.field_d;
        }
        return var2;
    }

    final void a(boolean param0, boolean param1) {
        if (!param0) {
          this.field_g = -102L;
          this.field_f.drawFullScreen(44, param1);
          return;
        }
        this.field_f.drawFullScreen(44, param1);
    }

    final void addLobbyGameActions(byte param0) {
        String var3;
        int var4;
        ht var5;
        var4 = TombRacer.field_G ? 1 : 0;
        if (null != C2SChooseRewardPacket.field_a) {
          if (param0 <= -10) {
            return;
          }
          this.field_e = (int[]) null;
          return;
        }
        var5 = MazeSolver.a(this.field_k, 0);
        if (var5 == null) {
          if (param0 <= -10) {
            return;
          }
          this.field_e = (int[]) null;
          return;
        }
        var3 = var5.field_tb;
        if (var5.field_gc) {
          this.field_f.addItem((byte) -102, 2, LegacyOpenGlFlowingWaterEffect.formatText(114, pba.field_d, new String[]{var3}));
          this.field_f.addItem((byte) -104, 3, LegacyOpenGlFlowingWaterEffect.formatText(123, cp.field_i, new String[]{var3}));
        } else {
          if (var5.field_Bb) {
            this.field_f.addItem((byte) -76, 2, LegacyOpenGlFlowingWaterEffect.formatText(106, mna.field_b, new String[]{var3}));
          } else {
            if (!var5.field_Sb &&
              var5.field_Yb) {
              if (!var5.field_ec) {
                this.field_f.addItem((byte) -125, 2, LegacyOpenGlFlowingWaterEffect.formatText(91, di.field_h, new String[]{var3}));
              } else {
                if (var5.field_Bb) {
                  this.field_f.addItem((byte) -125, 2, LegacyOpenGlFlowingWaterEffect.formatText(91, di.field_h, new String[]{var3}));
                }
              }
            }
          }
          if (var5.field_Sb) {
            this.field_f.addItem((byte) -102, 3, LegacyOpenGlFlowingWaterEffect.formatText(86, PrefabComponent.field_B, new String[]{var3}));
          }
        }
        if (param0 <= -10) {
          return;
        }
        this.field_e = (int[]) null;
        return;
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = this.field_f.updateAndPollAction(0, param0);
        if (param3 == var6) {
          return false;
        }
        boolean discarded$0 = this.a(param3 - 16, var6, param2);
        boolean discarded$1 = this.b(var6, (byte) -121, param4);
        boolean discarded$2 = this.a(var6, (byte) -39, param4);
        boolean discarded$3 = this.openReportAbuse(param1, var6, 114);
        return true;
    }

    private final boolean b(int param0, byte param1, int param2) {
        Object var4;
        String var4_ref;
        String var5;
        String var4_refLifetime1;
        String var5Lifetime1;
        var4 = null;
        if (4 == param0) {
          var4_ref = rf.a(true, this.field_i, param2);
          if (var4_ref == null) {
            if (param1 != -121) {
              return false;
            }
            return true;
          }
          var5 = (String) null;
          TreasureValuesOverlay.addChatMessage(0, true, this.field_i, var4_ref, (String) null, 2);
          if (param1 != -121) {
            return false;
          }
          return true;
        }
        if (param0 == 5) {
          var4_refLifetime1 = uca.a(this.field_i, (byte) 102, param2);
        } else {
          if (param0 == 6) {
            var4_refLifetime1 = Bzip2State.a(-3, this.field_i, param2);
          } else {
            if (7 != param0) {
              return false;
            }
            var4_refLifetime1 = kc.a(this.field_i, param2, false, this.field_d);
          }
        }
        if (var4_refLifetime1 != null) {
          var5Lifetime1 = (String) null;
          TreasureValuesOverlay.addChatMessage(0, true, this.field_i, var4_refLifetime1, (String) null, 2);
        }
        if (param1 != -121) {
          return false;
        }
        return true;
    }

    private final boolean a(int param0, int param1, int param2) {
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param1 == 0) {
          RewardChoiceSlot.a((byte) -38, param2, this.field_g);
        } else {
          if (param1 == 1) {
            HardwareAnimatedWaterEffect.a(param2, this.field_g, -120);
          } else {
            if (param1 == 2) {
              q.a((byte) -123, param2, this.field_k);
            } else {
              if (param1 == 3) {
                MidiVoiceMixer.a(param2, 30, this.field_k);
              } else {
                if (param1 == 10) {
                  LegacyOpenGlRidgedWaterEffect.a(param2, false, this.field_k);
                } else {
                  if (param1 == 15) {
                    cua.a(this.field_k, param0 + 21, param2);
                  } else {
                    if (param1 != 16) {
                      return false;
                    }
                    cua.a(0, 3, param2);
                  }
                }
              }
            }
          }
        }
        if (param0 == -18) {
          return true;
        }
        field_j = (fp) null;
        return true;
    }

    private final boolean a(int param0, byte param1, int param2) {
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param1 != -39) {
          PlayerContextMenu.releaseStatics((byte) 36);
        }
        if (param0 == 8) {
          no.a(this.field_i, this.field_g, (byte) 120);
          return true;
        }
        if (param0 == 18) {
          CurveOperator.a((byte) 123, this.field_g, this.field_i);
          return true;
        }
        if (param0 == 11) {
          MazeGenerator.a(this.field_b, param2, (byte) 108, 0);
          return true;
        }
        if (param0 == 12) {
          MazeGenerator.a(this.field_b, param2, (byte) 108, 1);
          return true;
        }
        if (param0 == 13) {
          MazeGenerator.a(this.field_b, param2, (byte) 108, 2);
          return true;
        }
        if (param0 == 14) {
          kaa.a((byte) 118);
          return true;
        }
        if (param0 == 20) {
          ContextMenu.e((byte) 123);
          return true;
        }
        if (19 != param0) {
          return false;
        }
        eca.a((byte) 84, this.field_b, this.field_g, this.field_e, this.field_i);
        return true;
    }

    final void addSocialActions(int[] param0, int param1, int param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        mu var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          if (param2 != 19) {
            this.field_f = (ContextMenu) null;
          }
          if (this.field_i != null) {
            if (SimpleConditionBehaviour.field_r == this.field_g &&
              param1 != 2) {
              return;
            }
            if (UiWidget.field_g != 2) {
              return;
            }
            var7 = this.getDisplayName(-13);
            var4 = var7;
            var5 = wp.a(127, this.field_i);
            var6 = MouseWheelInput.a(2180, this.field_i) ? 1 : 0;
            if (var5 == null &&
              var6 == 0) {
              this.field_f.addItem((byte) -64, 4, LegacyOpenGlFlowingWaterEffect.formatText(92, DirectRenderModel.field_m, new String[]{var7}));
              this.field_f.addItem((byte) -70, 6, LegacyOpenGlFlowingWaterEffect.formatText(127, mp.field_b, new String[]{var7}));
              if (param0 != null &&
                2 != param1 &&
                !fua.field_g) {
                this.field_e = param0;
                this.field_f.addItem((byte) -90, 19, LegacyOpenGlFlowingWaterEffect.formatText(119, gja.field_k, new String[]{var7}));
              }
            }
            if (var5 != null) {
              if (!RewardChoicePhase.isPrivateChatTarget(this.field_i, (byte) -50) &&
                !fua.field_g) {
                if (!PowerDownItemBehaviour.field_s) {
                  this.field_f.addItem((byte) -77, 8, LegacyOpenGlFlowingWaterEffect.formatText(114, RoomViewRenderer.field_b, new String[]{var7}));
                }
                this.field_f.addItem((byte) -118, 18, LegacyOpenGlFlowingWaterEffect.formatText(108, SceneLight.field_f, new String[]{var7}));
                if (param0 != null) {
                  this.field_e = param0;
                  this.field_f.addItem((byte) -71, 19, LegacyOpenGlFlowingWaterEffect.formatText(96, gja.field_k, new String[]{var7}));
                }
              }
              this.field_f.addItem((byte) -104, 5, LegacyOpenGlFlowingWaterEffect.formatText(90, LegacyTurbulentWaterNoise.field_q, new String[]{var7}));
            }
            if (var6 == 0) {
              return;
            }
            this.field_f.addItem((byte) -87, 7, LegacyOpenGlFlowingWaterEffect.formatText(120, HardwareUnlitEffect.field_f, new String[]{var7}));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_32_0 = var4_ref;
          stackIn_32_1 = new StringBuilder().append("lja.L(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void addChatFilterActions(gqa param0, int param1) {
        String discarded$1 = null;
        RuntimeException var3 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_m) {
            return;
          }
          this.field_b = param0.field_d;
          if (param0.field_d == 0) {
            if (k.field_A == 0) {
              this.field_f.addItem((byte) -66, 12, LegacyOpenGlEffect.field_b);
            }
            this.field_f.addItem((byte) -86, 13, pea.field_f);
          }
          if (1 == param0.field_d) {
            if (0 == nba.field_b) {
              this.field_f.addItem((byte) -77, 12, jl.field_a);
            }
            this.field_f.addItem((byte) -82, 13, HardwareRidgedWaterNoise.field_w);
          }
          if (param0.field_d == 2) {
            if (UrlDownloadRequest.field_i == 0) {
              this.field_f.addItem((byte) -93, 12, cva.field_e);
            }
            this.field_f.addItem((byte) -85, 13, LegacyOpenGlUnlitEffect.field_c);
          }
          if (param1 == 13) {
            return;
          }
          discarded$1 = this.getDisplayName(-106);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("lja.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0, boolean param1) {
        pha var4;
        String var5;
        int var6;
        pha var13;
        pha var14;
        pha var4Lifetime1;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != -22) {
          field_c = false;
          if (this.field_i == null) {
            return;
          }
          if (this.field_g != SimpleConditionBehaviour.field_r &&
            null != C2SChooseRewardPacket.field_a) {
            if (!ComponentMount.b(8192)) {
              return;
            }
            var14 = nl.a(true, this.field_g);
            var4 = vba.a((byte) -40, this.field_g);
            var5 = this.getDisplayName(-13);
            if (var4 != null) {
              if (!C2SChooseRewardPacket.field_a.field_ec) {
                this.field_f.addItem((byte) -74, 1, LegacyOpenGlFlowingWaterEffect.formatText(108, S2CMatchResultPacket.field_a, new String[]{var5}));
                return;
              }
              if (C2SChooseRewardPacket.field_a.field_Kb >= 0) {
                this.field_f.addItem((byte) -74, 1, LegacyOpenGlFlowingWaterEffect.formatText(108, S2CMatchResultPacket.field_a, new String[]{var5}));
                return;
              }
            } else {
              if (var14 != null &&
                C2SChooseRewardPacket.field_a.field_Yb &&
                C2SChooseRewardPacket.field_a.field_Jb > C2SChooseRewardPacket.field_a.field_Mb) {
                if (var14.field_Hb) {
                  this.field_f.addItem((byte) -79, 1, LegacyOpenGlFlowingWaterEffect.formatText(126, RenderableNode.field_g, new String[]{var5}));
                  return;
                }
                if (param1 &&
                  var14.field_Fb) {
                  this.field_f.addItem((byte) -123, 0, LegacyOpenGlFlowingWaterEffect.formatText(127, sb.field_c, new String[]{var5}));
                  this.field_f.addItem((byte) -98, 1, LegacyOpenGlFlowingWaterEffect.formatText(116, CoinBagItemComponent.field_G, new String[]{var5}));
                  return;
                }
                this.field_f.addItem((byte) -112, 0, LegacyOpenGlFlowingWaterEffect.formatText(98, LightSource.field_i, new String[]{var5}));
                return;
              }
            }
          }
          return;
        }
        if (this.field_i == null) {
          return;
        }
        if (this.field_g == SimpleConditionBehaviour.field_r) {
          return;
        }
        if (null == C2SChooseRewardPacket.field_a) {
          return;
        }
        if (!ComponentMount.b(8192)) {
          return;
        }
        var13 = nl.a(true, this.field_g);
        var4Lifetime1 = vba.a((byte) -40, this.field_g);
        var5 = this.getDisplayName(-13);
        if (var4Lifetime1 != null) {
          if (C2SChooseRewardPacket.field_a.field_ec &&
            C2SChooseRewardPacket.field_a.field_Kb < 0) {
            return;
          }
          this.field_f.addItem((byte) -74, 1, LegacyOpenGlFlowingWaterEffect.formatText(108, S2CMatchResultPacket.field_a, new String[]{var5}));
          return;
        }
        if (var13 == null) {
          return;
        }
        if (C2SChooseRewardPacket.field_a.field_Yb &&
          C2SChooseRewardPacket.field_a.field_Jb > C2SChooseRewardPacket.field_a.field_Mb) {
          if (var13.field_Hb) {
            this.field_f.addItem((byte) -79, 1, LegacyOpenGlFlowingWaterEffect.formatText(126, RenderableNode.field_g, new String[]{var5}));
            return;
          }
          if (param1 &&
            var13.field_Fb) {
            this.field_f.addItem((byte) -123, 0, LegacyOpenGlFlowingWaterEffect.formatText(127, sb.field_c, new String[]{var5}));
            this.field_f.addItem((byte) -98, 1, LegacyOpenGlFlowingWaterEffect.formatText(116, CoinBagItemComponent.field_G, new String[]{var5}));
            return;
          }
          this.field_f.addItem((byte) -112, 0, LegacyOpenGlFlowingWaterEffect.formatText(98, LightSource.field_i, new String[]{var5}));
          return;
        }
        return;
    }

    final void c(int param0) {
        String var4 = null;
        if (this.field_i != null &&
          this.field_g != SimpleConditionBehaviour.field_r) {
          var4 = this.getDisplayName(-13);
          String var2 = var4;
          this.field_f.addItem((byte) -81, 17, LegacyOpenGlFlowingWaterEffect.formatText(122, SecondaryLinkQueue.field_c, new String[]{var4}));
        }
        if (param0 == 0) {
          return;
        }
        gqa var3 = (gqa) null;
        this.addChatFilterActions((gqa) null, -104);
    }

    private final boolean openReportAbuse(int param0, int param1, int param2) {
        if (param2 < 93) {
          field_a = (String) null;
          if (param1 != 17) {
            return false;
          }
          RoomViewRenderer.field_c = new ReportAbuseDialog(this.field_h.field_q, this.field_h.field_A, this.field_h.field_G, this.field_h.field_t, param0, WallModel.field_r, OpenGlTransform3D.field_f, cga.field_g, Corpse.field_i, FacePlayerMountComponent.field_F, PressureSwitchBehaviour.field_p, this.field_i, this.field_g);
          return true;
        }
        if (param1 != 17) {
          return false;
        }
        RoomViewRenderer.field_c = new ReportAbuseDialog(this.field_h.field_q, this.field_h.field_A, this.field_h.field_G, this.field_h.field_t, param0, WallModel.field_r, OpenGlTransform3D.field_f, cga.field_g, Corpse.field_i, FacePlayerMountComponent.field_F, PressureSwitchBehaviour.field_p, this.field_i, this.field_g);
        return true;
    }

    PlayerContextMenu(UiComponent param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
          this.field_f = new ContextMenu(SimpleBlockBehaviour.field_n);
          this.field_i = param2;
          this.field_h = param0;
          this.field_b = param5;
          param0.field_cb = true;
          this.field_e = param6;
          this.field_g = param1;
          this.field_k = param4;
          this.field_d = param3;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "lja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = false;
        field_j = new fp();
        field_a = "That treasure's valuable, but heavy, so it'll slow you down. Drop it using <img=8><img=9> if you need to.";
    }
}
