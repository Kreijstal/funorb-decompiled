/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ava {
    private int field_g;
    static int field_d;
    int field_b;
    static DraggableWidget field_f;
    int field_a;
    private byte field_e;
    int field_c;

    final ava a(int param0, int param1, int param2, int param3) {
        if (param0 != 0) {
          return (ava) null;
        }
        return new ava(this.field_g, param3, param1, param2, this.field_e);
    }

    final static void updateLobbyPlayerRows(ScrollPane param0, int param1, int param2, boolean param3, int param4) {
        int var27_int = 0;
        ScrollPane stackIn_43_0;
        int stackIn_43_1;
        boolean stackIn_43_2;
        int stackIn_43_3;
        int stackIn_43_4;
        int stackIn_43_5;
        boolean stackIn_44_6 = false;
        int stackIn_47_0 = 0;
        int stackIn_59_0 = 0;
        UiComponent stackIn_94_0 = null;
        int stackIn_95_1 = 0;
        RuntimeException stackIn_219_0 = null;
        StringBuilder stackIn_219_1 = null;
        String stackIn_220_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        IntrusiveDeque var10 = null;
        int var11_int = 0;
        Object var11 = null;
        pha var12 = null;
        int var13 = 0;
        UiComponent var14 = null;
        UiComponent var15 = null;
        UiComponent var16 = null;
        UiComponent var17 = null;
        UiComponent var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        Object var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        Object var30 = null;
        String var30_ref = null;
        int var30_int = 0;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        Object var24Lifetime1;
        Object var24Lifetime2;
        Object var30Lifetime1;
        String var30_refLifetime1;
        String var30_refLifetime2;
        Object var30Lifetime1Lifetime1;
        int var9Lifetime1;
        int var11_intLifetime1;
        int var24_intLifetime1;
        int var26Lifetime1;
        int var30_intLifetime1;
        int var26Lifetime2;
        var31 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (C2SChooseRewardPacket.field_a != null && (PowerUpItemBehaviour.field_u != null ||
            hp.field_a != null ||
            C2SRoomResultPacket.field_g != null ||
            HotspotTextWidget.field_z != null)) {
            for (var9 = 0; ColourRowCache.field_b > var9; var9++) {
              var10_int = 255 & C2SChooseRewardPacket.field_a.field_ac[var9];
              if (PowerUpItemBehaviour.field_u != null &&
                null != PowerUpItemBehaviour.field_u[var9] &&
                PowerUpItemBehaviour.field_u[var9][var10_int]) {
                var5_int = 1;
              }
              if (null != hp.field_a &&
                hp.field_a[var9] != null) {
                var11_int = hp.field_a[var9][var10_int];
                if (var11_int != 0 &&
                  !DropAnimation.field_c) {
                  var5_int = 1;
                }
                if (var6 < var11_int) {
                  var6 = var11_int;
                }
              }
              if (HotspotTextWidget.field_z != null &&
                null != HotspotTextWidget.field_z[var9]) {
                var8 = var8 | HotspotTextWidget.field_z[var9][var10_int];
              }
              if (C2SRoomResultPacket.field_g != null &&
                null != C2SRoomResultPacket.field_g[var9]) {
                var11_intLifetime1 = C2SRoomResultPacket.field_g[var9][var10_int];
                if (0 != var11_intLifetime1 &&
                  !DropAnimation.field_c) {
                  var5_int = 1;
                }
                if (var7 < var11_intLifetime1) {
                  var7 = var11_intLifetime1;
                }
              }
            }
          }
          stackIn_43_0 = (ScrollPane) (param0);
          stackIn_43_1 = 2;
          stackIn_43_2 = param3;
          stackIn_43_3 = 92;
          stackIn_43_4 = param2 * (8 + ToolkitSelector.field_a * 4);
          stackIn_43_5 = 2 * (ToolkitSelector.field_a + param4);
          stackIn_44_6 = (lu.field_b == param0);
          stackIn_47_0 = (!((ScrollPane) (Object) stackIn_43_0).updateContentLayout(stackIn_43_1, stackIn_43_2, stackIn_43_3, stackIn_43_4, stackIn_43_5, stackIn_44_6)) ? 0 : 1;
          var9Lifetime1 = stackIn_47_0;
          var10 = param0.field_tb.field_J;
          var11 = null;
          var12 = (pha) (var10.first(-80));
          while (var12 != null) {
            var13 = 0;
            if (var12.field_J == null) {
              var12.field_Nb = new UiComponent(0L, S2CStartRoundPacket.field_a);
              var12.addChild(-128, var12.field_Nb);
              var12.field_Db = new UiComponent(0L, ClipFrame.field_g);
              if (UnlockOverlay.field_p) {
                var12.addChild(-123, var12.field_Db);
              }
              var12.field_Db.field_z = 2;
              var12.field_Gb = new UiComponent(0L, Corpse.field_i);
              var12.addChild(-126, var12.field_Gb);
              var12.invalidateLayoutRecursive(-10966);
              var12.field_Kb = new UiComponent(0L, ModelAnimator.field_g);
              var12.addChild(param4 ^ -121, var12.field_Kb);
              var12.field_Cb = new UiComponent(0L, kv.field_b);
              var12.addChild(-128, var12.field_Cb);
              var13 = 1;
            }
            var12.field_Nb.field_r = null;
            var14 = var12.field_Nb;
            var12.field_Nb.field_t = 0;
            var14.field_G = 0;
            var12.field_Db.field_r = null;
            var12.field_Db.field_t = 0;
            var15 = var12.field_Db;
            var15.field_G = 0;
            var12.field_Kb.field_r = null;
            var12.field_Kb.field_t = 0;
            var16 = var12.field_Kb;
            var16.field_G = 0;
            var12.field_Cb.field_r = null;
            var17 = var12.field_Cb;
            var12.field_Cb.field_t = 0;
            var12.field_Gb.field_r = null;
            var17.field_G = 0;
            var18 = var12.field_Gb;
            var12.field_Gb.field_t = 0;
            var18.field_G = 0;
            var12.field_G = param0.field_tb.field_G;
            var19 = 0;
            var32 = var12.field_wb;
            var20 = var32;
            var20 = var32;
            var21 = 72;
            if (param0 == bsa.field_j) {
              var21 += 42;
            }
            var33 = BitmapFont.truncateWithEllipsis(var12.field_Nb.field_H, var32, var21);
            var20 = var33;
            var20 = var33;
            var20 = var33;
            stackIn_59_0 = (var33.equals(var12.field_wb)) ? 0 : 1;
            var22 = stackIn_59_0;
            if (var12.field_Ab < 4) {
              if (var12.field_Ab > 0) {
                var20 = "<img=" + (-1 + var12.field_Ab) + ">" + var33;
              }
            } else {
              var20 = "<img=" + (RoomComponent.field_n + var12.field_Ab - 4) + ">" + var33;
            }
            var12.field_Nb.field_r = var20;
            if (!var12.f(162)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_tb ||
                (!(var6 <= var12.field_Jb) ||
                !(var12.field_zb >= var7) ||
                !((var8 & ~var12.field_Eb) <= 0))) {
                var23_int = 8414771;
                var24_int = 8421504;
              }
              var12.field_Kb.field_ib = var23_int;
              var12.field_Db.field_ib = var23_int;
              var12.field_Nb.field_ib = var23_int;
              var12.field_Nb.field_gb = var24_int;
              var12.field_Nb.field_N = var24_int;
              var12.field_Nb.field_ab = var24_int;
              var12.field_Db.field_gb = var24_int;
              var12.field_Db.field_N = var24_int;
              var12.field_Db.field_ab = var24_int;
              var12.field_Kb.field_gb = var24_int;
              var12.field_Kb.field_N = var24_int;
              var12.field_Kb.field_ab = var24_int;
              if (param0 != MidiPatch.field_n) {
                if (var12.field_Hb) {
                  var12.field_Nb.field_r = LegacyOpenGlFlowingWaterEffect.formatText(90, TextureFilter.field_b, new String[]{var20});
                  var12.field_Cb.field_r = mq.field_d;
                } else {
                  if (var12.field_Fb) {
                    var12.field_Nb.field_r = LegacyOpenGlFlowingWaterEffect.formatText(105, uaa.field_c, new String[]{var20});
                    var12.field_Kb.field_r = r.field_l;
                    var12.field_Cb.field_r = sv.field_q;
                  } else {
                    var12.field_Kb.field_r = FallbackShaderEffect.field_e;
                  }
                }
              } else {
                if (!C2SChooseRewardPacket.field_a.field_ec) {
                  var12.field_Cb.field_r = WeaveOperator.field_o;
                }
              }
              var25_int = 0;
              if (null != C2SChooseRewardPacket.field_a &&
                ComponentMount.b(8192) &&
                var12.field_yb != SimpleConditionBehaviour.field_r) {
                if (var12.field_Kb.field_r != null) {
                  var26 = var12.field_Kb.measureNaturalWidth((byte) 69) + mna.field_d * 2;
                  var12.field_Kb.setBounds(var26, ToolkitSelector.field_a, -23776, var19, var25_int);
                  var25_int = var25_int + var26;
                }
                if (var12.field_Cb.field_r != null) {
                  if (param0 == MidiPatch.field_n) {
                    var26Lifetime2 = 40;
                  } else {
                    var26Lifetime2 = var12.field_Cb.measureNaturalWidth((byte) 69) + 2 * mna.field_d;
                  }
                  var12.field_Cb.setBounds(var26Lifetime2, ToolkitSelector.field_a, -23776, var19, var25_int);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_94_0 = var12.field_Nb;
              if (UnlockOverlay.field_p) {
                stackIn_95_1 = 42;
              } else {
                stackIn_95_1 = 0;
              }
              ((UiComponent) (Object) stackIn_94_0).setBounds(-stackIn_95_1 + var12.field_G - var25_int, ToolkitSelector.field_a, param4 - 23778, var19, var25_int);
              var12.field_Db.field_r = Integer.toString(var12.field_Jb);
              var12.field_Db.setBounds(40, ToolkitSelector.field_a, -23776, var19, var12.field_G - 40);
              if (var12.field_Nb.field_o &&
                var22 != 0) {
                ArchiveNetworkClient.field_b = var12.field_wb;
                if (null != ql.field_m &&
                  null != ql.field_m[var12.field_Ab]) {
                  ArchiveNetworkClient.field_b = ArchiveNetworkClient.field_b + " - " + ql.field_m[var12.field_Ab];
                }
              } else {
                if (var12.field_Nb.field_o &&
                  null != ql.field_m &&
                  null != ql.field_m[var12.field_Ab]) {
                  ArchiveNetworkClient.field_b = ql.field_m[var12.field_Ab];
                }
              }
              var19 = var19 + ToolkitSelector.field_a;
            }
            var23 = S2CNextRoundPacket.describeGameJoinStatus(var12.field_Lb, var20, -65);
            var24 = var23;
            var30 = var24;
            var25 = var30;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_Gb.field_H.countWrappedLines(var23, -mna.field_d - mna.field_d + var12.field_G);
              var12.field_Gb.field_r = var23;
              var12.field_Gb.field_s = var12.field_xb * 256 / qsa.field_a;
              var12.field_Gb.setBounds(var12.field_G - 2 * mna.field_d, ToolkitSelector.field_a * var24_intLifetime1, -23776, var19, mna.field_d);
              var19 = var19 + ToolkitSelector.field_a * var24_intLifetime1;
            }
            if (var9Lifetime1 == 0) {
              var12.field_O = var19 - var12.field_t;
            }
            if (var13 != 0) {
              param0.field_tb.placeBelow(2, (UiComponent) (var11), var12, (byte) -122);
            }
            if (var12.field_y != 0 &&
              !var12.f(162)) {
              if (var12.field_Kb.field_y != 0) {
                RewardChoiceSlot.a((byte) 92, param1, var12.field_yb);
              } else {
                if (0 == var12.field_Cb.field_y) {
                  rc.a(PasswordValidator.field_m, RidgedNoise3D.field_p, var12, (byte) -93, 0, 0, param0);
                } else {
                  HardwareAnimatedWaterEffect.a(param1, var12.field_yb, -118);
                }
              }
            }
            if (var12.field_pb &&
              !var12.f(162)) {
              var24Lifetime2 = null;
              if (SimpleConditionBehaviour.field_r == var12.field_yb) {
                if (var5_int != 0 &&
                  !var12.field_tb) {
                  var24Lifetime2 = ProgressBarWidget.field_F;
                } else {
                  if (var7 > var12.field_zb) {
                    var25_int = var7 - var12.field_zb;
                    if (var25_int == 1) {
                      var24Lifetime2 = LegacyOpenGlEnvironmentWaterEffect.field_c;
                    }
                    var24Lifetime2 = LegacyOpenGlFlowingWaterEffect.formatText(92, WaveformOperator.field_r, new String[]{null, Integer.toString(var25_int)});
                    var30Lifetime1 = var24Lifetime2;
                    var25 = var30Lifetime1;
                    var24Lifetime2 = var25;
                    var30Lifetime1Lifetime1 = var24Lifetime2;
                    var25 = var30Lifetime1Lifetime1;
                  } else {
                    if (var6 <= var12.field_Jb) {
                      if (0 != (~var12.field_Eb & var8)) {
                        var25_int = WidgetContainer.highestOneBit(~var12.field_Eb & var8, (byte) -107);
                        var24Lifetime2 = HardwareSprite.field_f;
                        if (0 < var25_int &&
                          null != BitPacketBuffer.field_l &&
                          BitPacketBuffer.field_l.length >= var25_int &&
                          null != BitPacketBuffer.field_l[-1 + var25_int]) {
                          var24Lifetime2 = BitPacketBuffer.field_l[var25_int - 1][1];
                        }
                      }
                    } else {
                      var24Lifetime2 = LegacyOpenGlFlowingWaterEffect.formatText(95, TileGrid.field_k, new String[]{null, Integer.toString(var6)});
                    }
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_tb) {
                  var24Lifetime2 = LegacyOpenGlFlowingWaterEffect.formatText(96, MatchPhase.field_g, new String[]{var20});
                } else {
                  if (var7 <= var12.field_zb) {
                    if (var12.field_Jb >= var6) {
                      if ((var8 & ~var12.field_Eb) != 0) {
                        var25_int = WidgetContainer.highestOneBit(~var12.field_Eb & var8, (byte) -125);
                        var24Lifetime2 = LegacyOpenGlFlowingWaterEffect.formatText(86, TrackMountComponent.field_I, new String[]{var20});
                        if (var25_int > 0 &&
                          null != BitPacketBuffer.field_l &&
                          var25_int <= BitPacketBuffer.field_l.length &&
                          null != BitPacketBuffer.field_l[-1 + var25_int]) {
                          var24Lifetime2 = LegacyOpenGlFlowingWaterEffect.formatText(121, BitPacketBuffer.field_l[var25_int - 1][2], new String[]{var20});
                        }
                      }
                    } else {
                      var24Lifetime2 = LegacyOpenGlFlowingWaterEffect.formatText(118, SocketArchiveNetworkClient.field_r, new String[]{var20, Integer.toString(var6)});
                    }
                  } else {
                    var25_int = -var12.field_zb + var7;
                    if (1 == var25_int) {
                      var24Lifetime2 = LegacyOpenGlFlowingWaterEffect.formatText(115, FlagSet.field_d, new String[]{var20});
                    }
                    var24Lifetime2 = LegacyOpenGlFlowingWaterEffect.formatText(97, td.field_q, new String[]{var20, Integer.toString(var25_int)});
                  }
                }
              }
              if (var24Lifetime2 != null) {
                var34 = "<col=A00000>" + (String) (var24Lifetime2);
                var30_ref = var34;
                var25 = var30_ref;
                var24Lifetime2 = var25;
                var30_refLifetime1 = var34;
                var25 = var30_refLifetime1;
                var25 = null;
                var26Lifetime1 = 0;
                for (var27_int = 0; var27_int < ColourRowCache.field_b; var27_int++) {
                  var28 = 255 & C2SChooseRewardPacket.field_a.field_ac[var27_int];
                  var29 = 0;
                  if (null != PowerUpItemBehaviour.field_u &&
                    null != PowerUpItemBehaviour.field_u[var27_int] &&
                    PowerUpItemBehaviour.field_u[var27_int][var28] &&
                    !var12.field_tb) {
                    var29 = 1;
                  }
                  if (hp.field_a != null &&
                    null != hp.field_a[var27_int]) {
                    var30_int = hp.field_a[var27_int][var28];
                    if (var30_int != 0 &&
                      !DropAnimation.field_c &&
                      !var12.field_tb) {
                      var29 = 1;
                    }
                    if (var12.field_Jb < var30_int) {
                      var29 = 1;
                    }
                  }
                  if (null != C2SRoomResultPacket.field_g &&
                    null != C2SRoomResultPacket.field_g[var27_int]) {
                    var30_intLifetime1 = C2SRoomResultPacket.field_g[var27_int][var28];
                    if (var30_intLifetime1 != 0 &&
                      !DropAnimation.field_c &&
                      !var12.field_tb) {
                      var29 = 1;
                    }
                    if (var12.field_zb < var30_intLifetime1) {
                      var29 = 1;
                    }
                  }
                  if (HotspotTextWidget.field_z != null &&
                    HotspotTextWidget.field_z[var27_int] != null &&
                    (~var12.field_Eb & HotspotTextWidget.field_z[var27_int][var28]) != 0) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + DebouncedValidationSource.field_e[var27_int] + "</col>";
                    var25 = var30_refLifetime2;
                    var24Lifetime2 = var25;
                    var25 = var30_refLifetime2;
                    if (var25 == null) {
                      var25 = var30_refLifetime2;
                      var24Lifetime2 = var25;
                      var24Lifetime2 = var25;
                    } else {
                      var25 = (String) (var25) + ", " + var30_refLifetime2;
                      var26Lifetime1 = 1;
                    }
                  }
                }
                if (MidiPatch.field_n == param0 &&
                  ComponentMount.b(param4 ^ 8194)) {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var34 + "<br>" + LegacyOpenGlFlowingWaterEffect.formatText(114, IdolItemComponent.field_I, new String[]{(String) (var25)});
                  } else {
                    var24Lifetime2 = var34 + "<br>" + ArchiveNetworkClient.field_l + (String) (var25);
                  }
                } else {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var34 + "<br>" + baa.field_f + (String) (var25);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + LegacyOpenGlFlowingWaterEffect.formatText(125, FlameShooterComponent.field_K, new String[]{(String) (var25)});
                  }
                }
                if (MidiPatch.field_n == param0 &&
                  !ComponentMount.b(8192)) {
                  var27 = C2SChooseRewardPacket.field_a.field_tb;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + LegacyOpenGlFlowingWaterEffect.formatText(102, C2SSubmitSettingsPacket.field_c, new String[]{var27});
                }
                ArchiveNetworkClient.field_b = (String) (var24Lifetime2);
              }
            }
            var11 = var12;
            var12 = (pha) (var10.next(124));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_219_0 = var5;
          stackIn_219_1 = new StringBuilder().append("ava.A(");
          if (param0 == null) {
            stackIn_220_2 = "null";
          } else {
            stackIn_220_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_219_0), ((StringBuilder) (Object) stackIn_219_1).append(stackIn_220_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -1) {
          return;
        }
        field_f = null;
    }

    ava(int param0, int param1, int param2, int param3, byte param4) {
        this.field_b = param3;
        this.field_g = param0;
        this.field_e = param4;
        this.field_a = param1;
        this.field_c = param2;
    }

    static {
        field_d = 0;
    }
}
