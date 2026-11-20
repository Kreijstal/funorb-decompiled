/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TiledSpriteTextureOperation extends SpriteTextureOperation {
    static boolean field_r;
    static Widget field_s;
    static Widget field_q;

    public static void clearSharedReferences(boolean param0) {
        field_q = null;
        if (!param0) {
          return;
        }
        field_s = null;
    }

    public TiledSpriteTextureOperation() {
    }

    final static String a(ShipComponent param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (2 == param0.getDefinition((byte) -112).field_a) {
            stackIn_3_0 = SpriteArchiveDecoder.field_c;
            return stackIn_3_0;
          }
          if (param0.getDefinition((byte) -112).field_a == 3) {
            stackIn_6_0 = GetMpSandboxEnemySpawnLimit.field_o;
            return stackIn_6_0;
          }
          var2_int = -75 % ((-24 - param1) / 52);
          if (null == SetSpinningBladeSpinupSpeed.field_o) {
            return null;
          }
          stackIn_10_0 = SetSpinningBladeSpinupSpeed.field_o[param0.getComponentTypeId(0)];
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("me.E(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final int[][] getColorRow(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = VoidHunters.field_G;
        if (param0 != 255) {
          field_s = (Widget) null;
        }
        int[][] var13 = this.field_d.getRow(param1, (byte) -98);
        int[][] var12 = var13;
        int[][] var11 = var12;
        int[][] var3 = var11;
        if (this.field_d.field_g &&
          this.loadSpritePixels(0)) {
          var4 = var13[0];
          var5 = var13[1];
          var6 = var13[2];
          var7 = this.sourceHeight * (param1 % this.sourceHeight);
          for (var8 = 0; var8 < TextHotspotRegion.textureWidth; var8++) {
            var9 = this.sourcePixels[var8 % this.sourceWidth + var7];
            var6[var8] = MenuBackgroundBattle.andBits(4080, var9 << 4);
            var5[var8] = MenuBackgroundBattle.andBits(4080, var9 >> 4);
            var4[var8] = MenuBackgroundBattle.andBits(4080, var9 >> 12);
          }
        }
        return var11;
    }

    final static void a(int param0, int param1, boolean param2, boolean param3, int param4, int param5, byte param6) {
        int var18_int = 0;
        int var22_int = 0;
        Widget dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        ScrollPaneWidget stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        boolean stackIn_4_4 = false;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        LobbyGameEntry stackIn_12_0;
        Widget stackIn_12_1;
        Widget stackIn_12_2;
        long stackIn_12_3;
        Widget stackIn_13_1 = null;
        Widget stackIn_13_2 = null;
        Widget stackIn_13_4 = null;
        LobbyGameEntry stackIn_29_0;
        Widget stackIn_29_1;
        Widget stackIn_29_2;
        long stackIn_29_3;
        Widget stackIn_30_1;
        Widget stackIn_30_2;
        Widget stackIn_30_4;
        int stackIn_34_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_77_0 = 0;
        Sprite[] stackIn_79_0 = null;
        int stackIn_80_1 = 0;
        Sprite[] stackIn_87_0 = null;
        int stackIn_88_1 = 0;
        String stackIn_152_0 = null;
        String stackIn_160_0 = null;
        String stackIn_165_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        IntrusiveDeque var8 = null;
        long var9 = 0L;
        Object var11 = null;
        LobbyGameEntry var12 = null;
        int var13 = 0;
        int var14 = 0;
        Widget var18 = null;
        Widget var19 = null;
        Widget var20 = null;
        Widget var21 = null;
        Widget var22 = null;
        Widget var23 = null;
        Widget var24 = null;
        Widget var25 = null;
        Widget var26 = null;
        Widget var27 = null;
        Widget var28 = null;
        Widget var29 = null;
        Widget var30 = null;
        int var31 = 0;
        String var32 = null;
        int var33_int = 0;
        String var33 = null;
        int var34_int = 0;
        String var34 = null;
        Object var35 = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        Sprite var42 = null;
        Widget var43 = null;
        Widget var44 = null;
        Widget var45 = null;
        Widget var46 = null;
        Widget var47 = null;
        Widget var48 = null;
        Widget var49 = null;
        Object var50 = null;
        Sprite var50_ref = null;
        Object var51 = null;
        Sprite var51_ref = null;
        Object var52 = null;
        Sprite var52_ref = null;
        Object var53 = null;
        Sprite var53_ref = null;
        Sprite var54 = null;
        String var34Lifetime1;
        String var34Lifetime2;
        int var14Lifetime1;
        int var33_intLifetime1;
        int var34_intLifetime1;
        int var34_intLifetime2;
        int var36Lifetime1;
        int var36Lifetime2;
        int var37_intLifetime1;
        int var38_intLifetime1;
        int var39Lifetime1;
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = VoidHunters.field_G;
        try {
          stackIn_3_0 = MapClearanceCircle.field_f;
          stackIn_3_1 = 38;
          stackIn_3_2 = 2;
          stackIn_3_3 = (DialogMessagePanel.field_w * 4 + 8) * param1;
          stackIn_4_4 = (LegacyOpenGlMaterialEffect.field_a == MapClearanceCircle.field_f);
          var7_int = ((ScrollPaneWidget) (Object) stackIn_3_0).layoutAndUpdateScrolling((byte) stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_4_4, param2, DialogMessagePanel.field_w * 2 + 4) ? 1 : 0;
          if (param6 <= 108) {
            TiledSpriteTextureOperation.clearSharedReferences(false);
          }
          var8 = MapClearanceCircle.field_f.content.children;
          var9 = MonotonicMillisClock.currentTimeMillis(false);
          var11 = null;
          var12 = (LobbyGameEntry) (var8.first(0));
          while (var12 != null) {
            var13 = 0;
            if (null == var12.children) {
              var12.field_Mb = new Widget(0L, SetShieldsDirectionalArc.field_o);
              stackIn_10_0 = param0;
              stackIn_10_1 = param5;
              var14 = stackIn_10_0 | stackIn_10_1;
              var12.addChild(-561, var12.field_Mb);
              var12.field_Mb.field_F = 1;
              var12.field_dc = new Widget(0L, SetReverbDamp.field_q);
              var12.addChild(-561, var12.field_dc);
              var12.field_yb = new Widget(0L, SetShieldsDirectionalArc.field_o);
              var12.addChild(-561, var12.field_yb);
              var12.field_yb.field_w = 0;
              var12.field_wb = new Widget(0L, SetShieldsDirectionalArc.field_o);
              var12.addChild(-561, var12.field_wb);
              var12.field_wb.field_w = 0;
              var12.field_Hb = new Widget(0L, SetReverbDamp.field_q);
              var12.addChild(-561, var12.field_Hb);
              var12.field_Hb.field_F = 2;
              stackIn_12_0 = var12;
              stackIn_12_1 = null;
              stackIn_12_2 = null;
              stackIn_12_3 = 0L;
              if (!GetGrapplingHooksDamageableBySourcePlayer.field_o) {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = SetReverbDamp.field_q;
              } else {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = SetShieldsDirectionalArc.field_o;
              }
              stackIn_12_0.field_Lb = new Widget(stackIn_12_3, stackIn_13_4);
              var12.addChild(-561, var12.field_Lb);
              var12.field_Zb = new Widget[PasswordValidator.field_l];
              var12.field_Wb = new Widget(0L, (Widget) null);
              if ((1 << TextLayout.field_b & var14) != 0) {
                var12.field_Lb.addChild(-561, var12.field_Wb);
              }
              var12.field_Eb = new Widget(0L, (Widget) null);
              if (0 != (var14 & 1 << ArchiveLoadRequest.field_g)) {
                var12.field_Lb.addChild(-561, var12.field_Eb);
              }
              var12.field_Ab = new Widget(0L, (Widget) null);
              if ((var14 & 1 << GetShipToShipRamDamage.field_o) != 0) {
                var12.field_Lb.addChild(-561, var12.field_Ab);
              }
              var12.field_Rb = new Widget(0L, (Widget) null);
              if (0 != (var14 & 1 << GetFighterVision.field_o)) {
                var12.field_Lb.addChild(-561, var12.field_Rb);
              }
              var45 = var12.field_Wb;
              var44 = var12.field_Rb;
              var12.field_Ab.field_B = 1;
              var43 = var12.field_Eb;
              var43.field_B = 1;
              var44.field_B = 1;
              var45.field_B = 1;
              for (var18_int = 0; PasswordValidator.field_l > var18_int; var18_int++) {
                var12.field_Zb[var18_int] = new Widget(0L, (Widget) null);
                if (0 != (1 << var18_int + TextureFormat.field_b & var14)) {
                  var12.field_Lb.addChild(-561, var12.field_Zb[var18_int]);
                }
                var12.field_Zb[var18_int].field_B = 1;
              }
              stackIn_29_0 = var12;
              stackIn_29_1 = null;
              stackIn_29_2 = null;
              stackIn_29_3 = 0L;
              if (!GetGrapplingHooksDamageableBySourcePlayer.field_o) {
                stackIn_30_1 = null;
                stackIn_30_2 = null;
                stackIn_30_4 = SetShieldsDirectionalArc.field_o;
              } else {
                stackIn_30_1 = null;
                stackIn_30_2 = null;
                stackIn_30_4 = SetReverbDamp.field_q;
              }
              stackIn_29_0.field_Yb = new Widget(stackIn_29_3, stackIn_30_4);
              var12.addChild(-561, var12.field_Yb);
              var12.field_Yb.field_F = 2;
              var12.field_Jb = new Widget(0L, SetReverbDamp.field_q);
              var12.addChild(-561, var12.field_Jb);
              var12.field_Tb = new Widget(0L, GetMissionDebrisDefaultProbability.field_o);
              var12.addChild(-561, var12.field_Tb);
              var12.field_vb = new Widget(0L, GetMissionDebrisDefaultProbability.field_o);
              var12.addChild(-561, var12.field_vb);
              var12.field_bc = new Widget(0L, DeveloperConsole.field_q);
              var12.addChild(-561, var12.field_bc);
              var12.inheritInteractionStateInDescendants(127);
              var12.field_Sb = new Widget(0L, UiValueTrackRenderer.field_h);
              var12.addChild(-561, var12.field_Sb);
              var13 = 1;
            }
            stackIn_34_0 = (var12.field_fc) ? param0 : param5;
            var14Lifetime1 = stackIn_34_0;
            var12.field_Mb.text = null;
            var12.field_Mb.height = 0;
            var46 = var12.field_Mb;
            var46.width = 0;
            var12.field_Sb.text = null;
            var47 = var12.field_Sb;
            var12.field_Sb.height = 0;
            var12.field_dc.text = null;
            var47.width = 0;
            var12.field_dc.height = 0;
            var48 = var12.field_dc;
            var12.field_yb.text = null;
            var48.width = 0;
            var12.field_yb.height = 0;
            var18 = var12.field_yb;
            var18.width = 0;
            var12.field_wb.text = null;
            var12.field_wb.height = 0;
            var19 = var12.field_wb;
            var12.field_Hb.text = null;
            var19.width = 0;
            var20 = var12.field_Hb;
            var12.field_Hb.height = 0;
            var20.width = 0;
            var12.field_Lb.text = null;
            var12.field_Lb.height = 0;
            var21 = var12.field_Lb;
            var21.width = 0;
            for (var22_int = 0; PasswordValidator.field_l > var22_int; var22_int++) {
              var12.field_Zb[var22_int].field_tb = null;
              var23 = var12.field_Zb[var22_int];
              var12.field_Zb[var22_int].height = 0;
              var23.width = 0;
            }
            var12.field_Wb.field_tb = null;
            var12.field_Wb.height = 0;
            var22 = var12.field_Wb;
            var12.field_Rb.field_tb = null;
            var22.width = 0;
            var49 = var12.field_Rb;
            var12.field_Rb.height = 0;
            var12.field_Eb.field_tb = null;
            var49.width = 0;
            var24 = var12.field_Eb;
            var12.field_Eb.height = 0;
            var12.field_Ab.field_tb = null;
            var24.width = 0;
            var25 = var12.field_Ab;
            var12.field_Ab.height = 0;
            var25.width = 0;
            var12.field_Yb.text = null;
            var12.field_Yb.height = 0;
            var26 = var12.field_Yb;
            var26.width = 0;
            var12.field_Jb.text = null;
            var12.field_Jb.height = 0;
            var27 = var12.field_Jb;
            var12.field_Tb.text = null;
            var27.width = 0;
            var28 = var12.field_Tb;
            var12.field_Tb.height = 0;
            var12.field_vb.text = null;
            var28.width = 0;
            var12.field_vb.height = 0;
            var29 = var12.field_vb;
            var29.width = 0;
            var12.field_bc.text = null;
            var12.field_bc.height = 0;
            var30 = var12.field_bc;
            var30.width = 0;
            var12.width = MapClearanceCircle.field_f.content.width;
            var31 = 0;
            var32 = var12.field_Vb;
            if (!var12.isSecondaryDetached((byte) 58)) {
              boolean decompiledFrameRemainder1 = true;
              if (!var12.field_fc) {
                if (!var12.field_cc &&
                  !var12.field_ac) {
                  if (var12.field_Xb) {
                    var12.field_Mb.text = MonotonicMillisClock.field_c;
                  } else {
                    var12.field_Mb.text = MouseWheelInput.field_a;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var12.field_Sb.text = FlipTextureOperation.field_j;
                }
              } else {
                if (0 <= var12.field_Ub) {
                  var12.field_Mb.text = SetTorpedoAimarc.field_o;
                } else {
                  if (var12.field_Gb && (var12.field_cc ||
                    var12.field_ac)) {
                    var12.field_Sb.text = FlipTextureOperation.field_j;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (var12.field_Bb == 2) {
                      var12.field_Sb.text = GpuVertexBufferOwner.field_a;
                    } else {
                      var12.field_Mb.text = DateOfBirthInput.field_w;
                    }
                  }
                }
              }
              if (null != var12.field_Sb.text) {
                var12.field_Sb.setBounds(0, -76, 68, var31, DialogMessagePanel.field_w);
              } else {
                var12.field_Mb.setBounds(0, 5, 68, var31, DialogMessagePanel.field_w);
              }
              var12.field_dc.text = BitmapFont.ellipsize(var12.field_dc.font, var32, 78);
              var12.field_dc.setBounds(70, -40, 78, var31, DialogMessagePanel.field_w);
              if (var12.field_dc.field_O &&
                !var12.field_dc.text.equals(var32)) {
                NebulaFieldFactory.field_a = var32;
              }
              var12.field_yb.text = Integer.toString(var12.field_zb);
              if (!var12.field_Gb) {
                var12.field_yb.field_F = 1;
                var12.field_yb.setBounds(150, 125, 48, var31, DialogMessagePanel.field_w);
              } else {
                var12.field_yb.field_F = 2;
                var12.field_wb.text = "/" + var12.field_Fb;
                var33_int = (-var12.field_wb.font.getStringWidth("/") + 348) / 2;
                var12.field_yb.setBounds(150, 127, -150 + var33_int, var31, DialogMessagePanel.field_w);
                var12.field_wb.setBounds(var33_int, 121, -var33_int + 198, var31, DialogMessagePanel.field_w);
              }
              var12.field_Hb.text = Integer.toString(var12.field_Kb);
              var12.field_Hb.setBounds(200, 39, 48, var31, DialogMessagePanel.field_w);
              stackIn_67_0 = (GetGrapplingHooksDamageableBySourcePlayer.field_o) ? 250 : 200;
              var33_intLifetime1 = stackIn_67_0;
              var12.field_Lb.setBounds(var33_intLifetime1, 28, -var33_intLifetime1 + 363, var31, DialogMessagePanel.field_w);
              var34_int = MissionListFactory.field_a;
              if ((1 << TextLayout.field_b & var14Lifetime1) != 0) {
                var50_ref = SpriteDimensions.field_o[var12.field_Cb];
                var12.field_Wb.field_tb = var50_ref;
                var12.field_Wb.setBounds(var34_int, 32, var50_ref.paddedWidth, 0, var12.field_Lb.height);
                var34_int = var34_int + (MissionListFactory.field_a + var50_ref.paddedWidth);
              }
              if ((var14Lifetime1 & 1 << ArchiveLoadRequest.field_g) != 0) {
                if (!var12.field_cc) {
                  stackIn_77_0 = (var12.field_ac) ? 1 : 0;
                } else {
                  stackIn_77_0 = 1;
                }
                var36 = stackIn_77_0;
                stackIn_79_0 = atb.field_b;
                if (var36 == 0) {
                  stackIn_80_1 = 0;
                } else {
                  stackIn_80_1 = 1;
                }
                var51_ref = stackIn_79_0[stackIn_80_1];
                var12.field_Eb.field_tb = var51_ref;
                var12.field_Eb.setBounds(var34_int, 35, var51_ref.paddedWidth, 0, var12.field_Lb.height);
                var34_int = var34_int + (var51_ref.paddedWidth + MissionListFactory.field_a);
              }
              if ((1 << GetShipToShipRamDamage.field_o & var14Lifetime1) != 0) {
                var52_ref = GetPointDefenceLaserProjectileInterceptDamage.field_t[var12.field_Bb - 1];
                var12.field_Ab.field_tb = var52_ref;
                var12.field_Ab.setBounds(var34_int, 117, var52_ref.paddedWidth, 0, var12.field_Lb.height);
                var34_int = var34_int + (var52_ref.paddedWidth + MissionListFactory.field_a);
              }
              if (0 != (1 << GetFighterVision.field_o & var14Lifetime1)) {
                stackIn_87_0 = DisplayModeDialog.field_U;
                if (!var12.field_xb) {
                  stackIn_88_1 = 0;
                } else {
                  stackIn_88_1 = 1;
                }
                var53_ref = stackIn_87_0[stackIn_88_1];
                var12.field_Rb.field_tb = var53_ref;
                var12.field_Rb.setBounds(var34_int, 121, var53_ref.paddedWidth, 0, var12.field_Lb.height);
                var34_int = var34_int + (var53_ref.paddedWidth + MissionListFactory.field_a);
              }
              if (null != SetPointDefenceLaserAimarc.field_p) {
                for (var36Lifetime1 = 0; var36Lifetime1 < PasswordValidator.field_l; var36Lifetime1++) {
                  if (SetPointDefenceLaserAimarc.field_p[var36Lifetime1] != null &&
                    (var14Lifetime1 & 1 << var36Lifetime1 + TextureFormat.field_b) != 0) {
                    var42 = SetPointDefenceLaserAimarc.field_p[var36Lifetime1][var12.field_Pb[var36Lifetime1] & 255];
                    var54 = var42;
                    var12.field_Zb[var36Lifetime1].field_tb = var42;
                    var12.field_Zb[var36Lifetime1].setBounds(var34_int, 120, var54.paddedWidth, 0, var12.field_Lb.height);
                    var34_int = var34_int + (var54.paddedWidth + MissionListFactory.field_a);
                  }
                }
              }
              var36Lifetime2 = (var12.field_Lb.width - var34_int) / 2;
              if (var36Lifetime2 > 0) {
                var12.field_Wb.x = var12.field_Wb.x + var36Lifetime2;
                var12.field_Eb.x = var12.field_Eb.x + var36Lifetime2;
                var12.field_Ab.x = var12.field_Ab.x + var36Lifetime2;
                var12.field_Rb.x = var12.field_Rb.x + var36Lifetime2;
                for (var37_int = 0; PasswordValidator.field_l > var37_int; var37_int++) {
                  dupTemp$0 = var12.field_Zb[var37_int];
                  dupTemp$0.x = dupTemp$0.x + var36Lifetime2;
                }
              }
              if (var12.field_fc) {
                var37_intLifetime1 = var12.field_Ub;
                if (var37_intLifetime1 < 0) {
                  var37_intLifetime1 = (int)(var9 - var12.field_Ob);
                }
                var38_int = var37_intLifetime1 / 1000;
                var39 = var38_int / 60;
                var38_int = var38_int % 60;
                if (60 <= var39) {
                  var40 = var39 / 60;
                  var39 = var39 % 60;
                  var12.field_Yb.text = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                } else {
                  var12.field_Yb.text = var39 + ":" + var38_int / 10 + var38_int % 10;
                }
              }
              var12.field_Yb.setBounds(365, 43, var12.width - 365, var31, DialogMessagePanel.field_w);
              var31 = var31 + DialogMessagePanel.field_w;
              if (var12.field_Ib != null) {
                var31 += 2;
                var37 = new StringBuilder(64);
                discarded$1 = var37.append(SoftwareSprite2D.field_c);
                discarded$2 = var37.append(var12.field_Ib[0]);
                for (var38_intLifetime1 = 1; var38_intLifetime1 < var12.field_zb; var38_intLifetime1++) {
                  discarded$3 = var37.append(", ");
                  discarded$4 = var37.append(var12.field_Ib[var38_intLifetime1]);
                }
                var38 = var37.toString();
                var12.field_Jb.text = var38;
                var39Lifetime1 = var12.field_Jb.font.getLineCount(var38, var12.width - var12.field_Jb.field_w * 2);
                var12.field_Jb.setBounds(0, -9, var12.width, var31, var39Lifetime1 * DialogMessagePanel.field_w);
                var31 = var31 + DialogMessagePanel.field_w * var39Lifetime1;
              }
              if (var12.field_ac) {
                var12.field_Tb.text = SetReverbGain.a(GetDebrisGroupColour.field_o, new String[]{var32}, 104);
                var12.field_Tb.setBounds(AppletCookieWriter.field_c, 122, var12.width - AppletCookieWriter.field_c * 2, var31, DialogMessagePanel.field_w);
                var31 = var31 + DialogMessagePanel.field_w;
              }
              if (var12.field_Qb) {
                var12.field_vb.text = SetReverbGain.a(SoftCacheReference.field_m, new String[]{var32}, 79);
                var12.field_vb.setBounds(AppletCookieWriter.field_c, 0, var12.width - 2 * AppletCookieWriter.field_c, var31, DialogMessagePanel.field_w);
                var31 = var31 + DialogMessagePanel.field_w;
              }
            }
            var33 = GetBombletSprayAimspeed.a((byte) -126, var32, var12.field_ec);
            var34 = var33;
            var34Lifetime1 = var33;
            if (var33 != null) {
              var34_intLifetime1 = var12.field_bc.font.getLineCount(var33, -AppletCookieWriter.field_c + (var12.width - AppletCookieWriter.field_c));
              var12.field_bc.field_I = var12.field_Db * 256 / GetMomentOfInertiaPredivideDownshift.field_p;
              var12.field_bc.text = var33;
              var12.field_bc.setBounds(AppletCookieWriter.field_c, 126, -(2 * AppletCookieWriter.field_c) + var12.width, var31, DialogMessagePanel.field_w * var34_intLifetime1);
              var31 = var31 + DialogMessagePanel.field_w * var34_intLifetime1;
            }
            if (var7_int == 0) {
              var12.field_E = var31 - var12.height;
            }
            if (var13 != 0) {
              MapClearanceCircle.field_f.content.positionBelow((Widget) (var11), 2, var12, -25);
            }
            for (var34_intLifetime2 = 0; var34_intLifetime2 < PasswordValidator.field_l; var34_intLifetime2++) {
              if (var12.field_Zb[var34_intLifetime2].field_O) {
                if (SetShipAimLines.field_o != null) {
                  if (null == SetShipAimLines.field_o[var34_intLifetime2]) {
                    var35 = null;
                  } else {
                    var35 = SetShipAimLines.field_o[var34_intLifetime2][255 & var12.field_Pb[var34_intLifetime2]];
                  }
                } else {
                  var35 = null;
                }
                if (var35 != null) {
                  NebulaFieldFactory.field_a = ClientException.field_c[var34_intLifetime2] + " - " + (String) (var35);
                } else {
                  NebulaFieldFactory.field_a = ClientException.field_c[var34_intLifetime2];
                }
              }
            }
            if (var12.field_Wb.field_O) {
              if (1 != var12.field_Cb) {
                var34Lifetime2 = SetHealthBarHeight.field_p[var12.field_Cb];
              } else {
                var34Lifetime2 = GetDebrisGroupColour.field_p;
              }
              NebulaFieldFactory.field_a = GpuFaceAttachmentState.field_c + " - " + var34Lifetime2;
            }
            if (var12.field_Rb.field_O) {
              if (!var12.field_xb) {
                stackIn_152_0 = OpenGlClientVertexBuffer.field_c;
              } else {
                stackIn_152_0 = GetTorpedoAimspeed.field_p;
              }
              NebulaFieldFactory.field_a = stackIn_152_0;
            }
            if (var12.field_Eb.field_O) {
              if (!var12.field_cc &&
                !var12.field_ac) {
                if (var12.field_Gb) {
                  stackIn_160_0 = SpawnPoint.field_f;
                } else {
                  stackIn_160_0 = GetMissilesCooldown.field_o;
                }
              } else {
                stackIn_160_0 = ComponentContact.field_k;
              }
              NebulaFieldFactory.field_a = stackIn_160_0;
            }
            if (var12.field_Ab.field_O) {
              if (var12.field_Bb != 2) {
                stackIn_165_0 = CarouselSystemEventFactory.field_b;
              } else {
                stackIn_165_0 = OpenGlSprite.field_h;
              }
              NebulaFieldFactory.field_a = stackIn_165_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var12.field_o != 0 &&
              !var12.isSecondaryDetached((byte) 34)) {
              if (var12.field_Sb.field_o == 0) {
                LobbyGameContextMenuBuilder.showGameContextMenu((byte) 112, var12, var32, param3);
              } else {
                if (var12.field_fc && (!var12.field_Gb ||
                  !var12.field_cc &&
                  !var12.field_ac)) {
                  ArmBehaviourFactory.a(var12.getGameId((byte) -13), param4, 20694);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  SpriteArchiveDecoder.a(param4, (byte) -88, var12.getGameId((byte) -13));
                }
              }
            }
            var12 = (LobbyGameEntry) (var8.next((byte) 92));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var7), "me.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_r = false;
    }
}
