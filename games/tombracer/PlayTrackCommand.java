/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayTrackCommand extends ConsoleMethod {
    static int field_o;
    static boolean field_p;

    PlayTrackCommand(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void updateLobbyGameList(int param0, int param1, boolean param2, int param3, int param4, int param5, boolean param6) {
        int var18_int = 0;
        int var22_int = 0;
        UiComponent dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        ScrollPane stackIn_5_0;
        int stackIn_5_1;
        boolean stackIn_5_2;
        int stackIn_5_3;
        int stackIn_5_4;
        int stackIn_5_5;
        boolean stackIn_6_6;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        LobbyGameWidget stackIn_12_0;
        UiComponent stackIn_12_1;
        UiComponent stackIn_12_2;
        long stackIn_12_3;
        UiComponent stackIn_13_1 = null;
        UiComponent stackIn_13_2 = null;
        UiComponent stackIn_13_4 = null;
        LobbyGameWidget stackIn_31_0;
        UiComponent stackIn_31_1;
        UiComponent stackIn_31_2;
        long stackIn_31_3;
        UiComponent stackIn_32_1;
        UiComponent stackIn_32_2;
        UiComponent stackIn_32_4;
        int stackIn_36_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_80_0 = 0;
        Sprite[] stackIn_82_0 = null;
        int stackIn_83_1 = 0;
        Sprite[] stackIn_90_0 = null;
        int stackIn_91_1 = 0;
        String stackIn_151_0 = null;
        String stackIn_160_0 = null;
        String stackIn_165_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        IntrusiveDeque var8 = null;
        long var9 = 0L;
        Object var11 = null;
        LobbyGameWidget var12 = null;
        int var13 = 0;
        int var14 = 0;
        UiComponent var18 = null;
        UiComponent var19 = null;
        UiComponent var20 = null;
        UiComponent var21 = null;
        UiComponent var22 = null;
        UiComponent var23 = null;
        UiComponent var24 = null;
        UiComponent var25 = null;
        UiComponent var26 = null;
        UiComponent var27 = null;
        UiComponent var28 = null;
        UiComponent var29 = null;
        UiComponent var30 = null;
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
        UiComponent var43 = null;
        UiComponent var44 = null;
        UiComponent var45 = null;
        UiComponent var46 = null;
        UiComponent var47 = null;
        UiComponent var48 = null;
        UiComponent var49 = null;
        Object var50 = null;
        Sprite var50_ref = null;
        Object var51 = null;
        Sprite var51_ref = null;
        Object var52 = null;
        Sprite var52_ref = null;
        Object var53 = null;
        Sprite var53_ref = null;
        Sprite var54 = null;
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
        var41 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != 0) {
            PlayTrackCommand.a(75, true);
          }
          stackIn_5_0 = nsa.field_i;
          stackIn_5_1 = 2;
          stackIn_5_2 = param6;
          stackIn_5_3 = 107;
          stackIn_5_4 = param3 * (2 + di.field_a) * 4;
          stackIn_5_5 = 2 * (2 + di.field_a);
          stackIn_6_6 = (nsa.field_i == lu.field_b);
          var7_int = ((ScrollPane) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_5_4, stackIn_5_5, stackIn_6_6) ? 1 : 0;
          var8 = nsa.field_i.field_tb.field_J;
          var9 = bva.currentTimeMillis((byte) -107);
          var11 = null;
          var12 = (LobbyGameWidget) (var8.first(-80));
          while (var12 != null) {
            var13 = 0;
            if (null == var12.field_J) {
              var12.field_Vb = new UiComponent(0L, iea.field_g);
              stackIn_10_0 = param4;
              stackIn_10_1 = param0;
              var14 = stackIn_10_0 | stackIn_10_1;
              var12.addChild(-122, var12.field_Vb);
              var12.field_Vb.field_z = 1;
              var12.field_bc = new UiComponent(0L, S2CStartRoundPacket.field_a);
              var12.addChild(-124, var12.field_bc);
              var12.field_Hb = new UiComponent(0L, iea.field_g);
              var12.addChild(-124, var12.field_Hb);
              var12.field_Hb.field_x = 0;
              var12.field_wb = new UiComponent(0L, iea.field_g);
              var12.addChild(-124, var12.field_wb);
              var12.field_wb.field_x = 0;
              var12.field_Lb = new UiComponent(0L, S2CStartRoundPacket.field_a);
              var12.addChild(-125, var12.field_Lb);
              var12.field_Lb.field_z = 2;
              stackIn_12_0 = var12;
              stackIn_12_1 = null;
              stackIn_12_2 = null;
              stackIn_12_3 = 0L;
              if (!UnlockOverlay.field_p) {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = S2CStartRoundPacket.field_a;
              } else {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = iea.field_g;
              }
              stackIn_12_0.field_Eb = new UiComponent(stackIn_12_3, stackIn_13_4);
              var12.addChild(-125, var12.field_Eb);
              var12.field_Ub = new UiComponent[ColourRowCache.field_b];
              var12.field_xb = new UiComponent(0L, (UiComponent) null);
              if ((1 << PowerUpItemBehaviour.field_w & var14) != 0) {
                var12.field_Eb.addChild(-128, var12.field_xb);
              }
              var12.field_vb = new UiComponent(0L, (UiComponent) null);
              if (0 != (var14 & 1 << una.field_c)) {
                var12.field_Eb.addChild(-124, var12.field_vb);
              }
              var12.field_Zb = new UiComponent(0L, (UiComponent) null);
              if ((var14 & 1 << TrackingCrusherComponent.field_F) != 0) {
                var12.field_Eb.addChild(param1 - 123, var12.field_Zb);
              }
              var12.field_fc = new UiComponent(0L, (UiComponent) null);
              if ((1 << RoomEffectTraps.field_b & var14) != 0) {
                var12.field_Eb.addChild(param1 ^ -124, var12.field_fc);
              }
              var45 = var12.field_xb;
              var44 = var12.field_fc;
              var43 = var12.field_vb;
              var12.field_Zb.field_bb = 1;
              var43.field_bb = 1;
              var44.field_bb = 1;
              var45.field_bb = 1;
              for (var18_int = 0; ColourRowCache.field_b > var18_int; var18_int++) {
                var12.field_Ub[var18_int] = new UiComponent(0L, (UiComponent) null);
                if ((1 << var18_int + SoundEvent.field_m & var14) != 0) {
                  var12.field_Eb.addChild(-126, var12.field_Ub[var18_int]);
                }
                var12.field_Ub[var18_int].field_bb = 1;
              }
              stackIn_31_0 = var12;
              stackIn_31_1 = null;
              stackIn_31_2 = null;
              stackIn_31_3 = 0L;
              if (!UnlockOverlay.field_p) {
                stackIn_32_1 = null;
                stackIn_32_2 = null;
                stackIn_32_4 = iea.field_g;
              } else {
                stackIn_32_1 = null;
                stackIn_32_2 = null;
                stackIn_32_4 = S2CStartRoundPacket.field_a;
              }
              stackIn_31_0.field_ub = new UiComponent(stackIn_31_3, stackIn_32_4);
              var12.addChild(-127, var12.field_ub);
              var12.field_ub.field_z = 2;
              var12.field_Qb = new UiComponent(0L, S2CStartRoundPacket.field_a);
              var12.addChild(param1 ^ -122, var12.field_Qb);
              var12.field_hc = new UiComponent(0L, PressureSwitchBehaviour.field_p);
              var12.addChild(-125, var12.field_hc);
              var12.field_dc = new UiComponent(0L, PressureSwitchBehaviour.field_p);
              var12.addChild(-122, var12.field_dc);
              var12.field_Rb = new UiComponent(0L, Corpse.field_i);
              var12.addChild(param1 ^ -127, var12.field_Rb);
              var12.a(-10966);
              var12.field_Nb = new UiComponent(0L, ModelAnimator.field_g);
              var12.addChild(-124, var12.field_Nb);
              var13 = 1;
            }
            var12.field_Vb.field_r = null;
            stackIn_36_0 = (var12.field_ec) ? param0 : param4;
            var14Lifetime1 = stackIn_36_0;
            var12.field_Vb.field_t = 0;
            var46 = var12.field_Vb;
            var12.field_Nb.field_r = null;
            var46.field_G = 0;
            var47 = var12.field_Nb;
            var12.field_Nb.field_t = 0;
            var12.field_bc.field_r = null;
            var47.field_G = 0;
            var48 = var12.field_bc;
            var12.field_bc.field_t = 0;
            var48.field_G = 0;
            var12.field_Hb.field_r = null;
            var18 = var12.field_Hb;
            var12.field_Hb.field_t = 0;
            var18.field_G = 0;
            var12.field_wb.field_r = null;
            var12.field_wb.field_t = 0;
            var19 = var12.field_wb;
            var19.field_G = 0;
            var12.field_Lb.field_r = null;
            var20 = var12.field_Lb;
            var12.field_Lb.field_t = 0;
            var12.field_Eb.field_r = null;
            var20.field_G = 0;
            var21 = var12.field_Eb;
            var12.field_Eb.field_t = 0;
            var21.field_G = 0;
            for (var22_int = 0; ColourRowCache.field_b > var22_int; var22_int++) {
              var12.field_Ub[var22_int].field_R = null;
              var23 = var12.field_Ub[var22_int];
              var12.field_Ub[var22_int].field_t = 0;
              var23.field_G = 0;
            }
            var12.field_xb.field_R = null;
            var22 = var12.field_xb;
            var12.field_xb.field_t = 0;
            var12.field_fc.field_R = null;
            var22.field_G = 0;
            var49 = var12.field_fc;
            var12.field_fc.field_t = 0;
            var12.field_vb.field_R = null;
            var49.field_G = 0;
            var12.field_vb.field_t = 0;
            var24 = var12.field_vb;
            var24.field_G = 0;
            var12.field_Zb.field_R = null;
            var12.field_Zb.field_t = 0;
            var25 = var12.field_Zb;
            var12.field_ub.field_r = null;
            var25.field_G = 0;
            var12.field_ub.field_t = 0;
            var26 = var12.field_ub;
            var12.field_Qb.field_r = null;
            var26.field_G = 0;
            var12.field_Qb.field_t = 0;
            var27 = var12.field_Qb;
            var27.field_G = 0;
            var12.field_hc.field_r = null;
            var12.field_hc.field_t = 0;
            var28 = var12.field_hc;
            var12.field_dc.field_r = null;
            var28.field_G = 0;
            var12.field_dc.field_t = 0;
            var29 = var12.field_dc;
            var12.field_Rb.field_r = null;
            var29.field_G = 0;
            var30 = var12.field_Rb;
            var12.field_Rb.field_t = 0;
            var30.field_G = 0;
            var12.field_G = nsa.field_i.field_tb.field_G;
            var31 = 0;
            var32 = var12.field_tb;
            if (!var12.g(0)) {
              boolean decompiledFrameRemainder1 = true;
              if (var12.field_ec) {
                if (var12.field_Kb >= 0) {
                  var12.field_Vb.field_r = Locomotor.field_l;
                } else {
                  if (var12.field_Yb && (var12.field_Bb ||
                    var12.field_gc)) {
                    var12.field_Nb.field_r = MazeGrid.field_b;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (var12.field_yb == 2) {
                      var12.field_Nb.field_r = vua.field_z;
                    } else {
                      var12.field_Vb.field_r = FlipOperator.field_q;
                    }
                  }
                }
              } else {
                if (!var12.field_Bb &&
                  !var12.field_gc) {
                  if (!var12.field_Tb) {
                    var12.field_Vb.field_r = QuickChatPhraseDefinition.field_p;
                  } else {
                    var12.field_Vb.field_r = aua.field_c;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var12.field_Nb.field_r = MazeGrid.field_b;
                }
              }
              if (null == var12.field_Nb.field_r) {
                var12.field_Vb.setBounds(68, di.field_a, -23776, var31, 0);
              } else {
                var12.field_Nb.setBounds(68, di.field_a, -23776, var31, 0);
              }
              var12.field_bc.field_r = BitmapFont.truncateWithEllipsis(var12.field_bc.field_H, var32, 78);
              var12.field_bc.setBounds(78, di.field_a, param1 ^ -23776, var31, 70);
              if (var12.field_bc.field_o &&
                !var12.field_bc.field_r.equals(var32)) {
                ArchiveNetworkClient.field_b = var32;
              }
              var12.field_Hb.field_r = Integer.toString(var12.field_Mb);
              if (var12.field_Yb) {
                var12.field_Hb.field_z = 2;
                var12.field_wb.field_r = "/" + var12.field_Jb;
                var33_int = (348 - var12.field_wb.field_H.stringWidth("/")) / 2;
                var12.field_Hb.setBounds(var33_int - 150, di.field_a, -23776, var31, 150);
                var12.field_wb.setBounds(-var33_int + 198, di.field_a, -23776, var31, var33_int);
              } else {
                var12.field_Hb.field_z = 1;
                var12.field_Hb.setBounds(48, di.field_a, -23776, var31, 150);
              }
              var12.field_Lb.field_r = Integer.toString(var12.field_Wb);
              var12.field_Lb.setBounds(48, di.field_a, param1 ^ -23776, var31, 200);
              stackIn_71_0 = (UnlockOverlay.field_p) ? 250 : 200;
              var33_intLifetime1 = stackIn_71_0;
              var12.field_Eb.setBounds(-2 + (-var33_intLifetime1 + 365), di.field_a, -23776, var31, var33_intLifetime1);
              var34_int = pda.field_c;
              if (0 != (var14Lifetime1 & 1 << PowerUpItemBehaviour.field_w)) {
                var50_ref = SoundEventPlayer.field_f[var12.field_cc];
                var12.field_xb.field_R = var50_ref;
                var12.field_xb.setBounds(var50_ref.field_n, var12.field_Eb.field_t, -23776, 0, var34_int);
                var34_int = var34_int + (var50_ref.field_n + pda.field_c);
              }
              if ((1 << una.field_c & var14Lifetime1) != 0) {
                if (!var12.field_Bb) {
                  stackIn_80_0 = (var12.field_gc) ? 1 : 0;
                } else {
                  stackIn_80_0 = 1;
                }
                var36 = stackIn_80_0;
                stackIn_82_0 = InvisibleTouchSwitchComponent.field_K;
                if (var36 != 0) {
                  stackIn_83_1 = 1;
                } else {
                  stackIn_83_1 = 0;
                }
                var51_ref = stackIn_82_0[stackIn_83_1];
                var12.field_vb.field_R = var51_ref;
                var12.field_vb.setBounds(var51_ref.field_n, var12.field_Eb.field_t, -23776, 0, var34_int);
                var34_int = var34_int + (var51_ref.field_n + pda.field_c);
              }
              if ((1 << TrackingCrusherComponent.field_F & var14Lifetime1) != 0) {
                var52_ref = TileGridCell.field_k[-1 + var12.field_yb];
                var12.field_Zb.field_R = var52_ref;
                var12.field_Zb.setBounds(var52_ref.field_n, var12.field_Eb.field_t, -23776, 0, var34_int);
                var34_int = var34_int + (pda.field_c + var52_ref.field_n);
              }
              if ((var14Lifetime1 & 1 << RoomEffectTraps.field_b) != 0) {
                stackIn_90_0 = wt.field_c;
                if (var12.field_Ob) {
                  stackIn_91_1 = 1;
                } else {
                  stackIn_91_1 = 0;
                }
                var53_ref = stackIn_90_0[stackIn_91_1];
                var12.field_fc.field_R = var53_ref;
                var12.field_fc.setBounds(var53_ref.field_n, var12.field_Eb.field_t, -23776, 0, var34_int);
                var34_int = var34_int + (pda.field_c + var53_ref.field_n);
              }
              if (pda.field_d != null) {
                for (var36Lifetime1 = 0; ColourRowCache.field_b > var36Lifetime1; var36Lifetime1++) {
                  if (null != pda.field_d[var36Lifetime1] &&
                    0 != (1 << var36Lifetime1 + SoundEvent.field_m & var14Lifetime1)) {
                    var42 = pda.field_d[var36Lifetime1][var12.field_ac[var36Lifetime1] & 255];
                    var54 = var42;
                    var12.field_Ub[var36Lifetime1].field_R = var42;
                    var12.field_Ub[var36Lifetime1].setBounds(var54.field_n, var12.field_Eb.field_t, -23776, 0, var34_int);
                    var34_int = var34_int + (var54.field_n + pda.field_c);
                  }
                }
              }
              var36Lifetime2 = (-var34_int + var12.field_Eb.field_G) / 2;
              if (0 < var36Lifetime2) {
                var12.field_xb.field_qb = var12.field_xb.field_qb + var36Lifetime2;
                var12.field_vb.field_qb = var12.field_vb.field_qb + var36Lifetime2;
                var12.field_Zb.field_qb = var12.field_Zb.field_qb + var36Lifetime2;
                var12.field_fc.field_qb = var12.field_fc.field_qb + var36Lifetime2;
                for (var37_int = 0; var37_int < ColourRowCache.field_b; var37_int++) {
                  dupTemp$0 = var12.field_Ub[var37_int];
                  dupTemp$0.field_qb = dupTemp$0.field_qb + var36Lifetime2;
                }
              }
              if (var12.field_ec) {
                var37_intLifetime1 = var12.field_Kb;
                if (var37_intLifetime1 < 0) {
                  var37_intLifetime1 = (int)(-var12.field_Gb + var9);
                }
                var38_int = var37_intLifetime1 / 1000;
                var39 = var38_int / 60;
                var38_int = var38_int % 60;
                if (60 <= var39) {
                  var40 = var39 / 60;
                  var39 = var39 % 60;
                  var12.field_ub.field_r = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                } else {
                  var12.field_ub.field_r = var39 + ":" + var38_int / 10 + var38_int % 10;
                }
              }
              var12.field_ub.setBounds(var12.field_G - 365, di.field_a, param1 ^ -23776, var31, 365);
              var31 = var31 + di.field_a;
              if (var12.field_Cb != null) {
                var31 += 2;
                var37 = new StringBuilder(64);
                discarded$1 = var37.append(MatchStatistics.field_l);
                discarded$2 = var37.append(var12.field_Cb[0]);
                for (var38_intLifetime1 = 1; var12.field_Mb > var38_intLifetime1; var38_intLifetime1++) {
                  discarded$3 = var37.append(", ");
                  discarded$4 = var37.append(var12.field_Cb[var38_intLifetime1]);
                }
                var38 = var37.toString();
                var12.field_Qb.field_r = var38;
                var39Lifetime1 = var12.field_Qb.field_H.countWrappedLines(var38, var12.field_G - 2 * var12.field_Qb.field_x);
                var12.field_Qb.setBounds(var12.field_G, var39Lifetime1 * di.field_a, param1 ^ -23776, var31, 0);
                var31 = var31 + di.field_a * var39Lifetime1;
              }
              if (var12.field_gc) {
                var12.field_hc.field_r = LegacyOpenGlFlowingWaterEffect.formatText(123, LoadProfileCommand.field_o, new String[]{var32});
                var12.field_hc.setBounds(var12.field_G - 2 * mna.field_d, di.field_a, -23776, var31, mna.field_d);
                var31 = var31 + di.field_a;
              }
              if (var12.field_Sb) {
                var12.field_dc.field_r = LegacyOpenGlFlowingWaterEffect.formatText(121, SweeperMountComponent.field_I, new String[]{var32});
                var12.field_dc.setBounds(-(mna.field_d * 2) + var12.field_G, di.field_a, -23776, var31, mna.field_d);
                var31 = var31 + di.field_a;
              }
            }
            var33 = ProxySocketConnector.formatLobbyPlayerStatus(var32, param1 + 8793, var12.field_Ib);
            if (var33 != null) {
              var34_intLifetime1 = var12.field_Rb.field_H.countWrappedLines(var33, var12.field_G - mna.field_d - mna.field_d);
              var12.field_Rb.field_r = var33;
              var12.field_Rb.field_s = var12.field_zb * 256 / qsa.field_a;
              var12.field_Rb.setBounds(-(mna.field_d * 2) + var12.field_G, di.field_a * var34_intLifetime1, param1 - 23776, var31, mna.field_d);
              var31 = var31 + di.field_a * var34_intLifetime1;
            }
            if (var7_int == 0) {
              var12.field_O = var31 - var12.field_t;
            }
            if (var13 != 0) {
              nsa.field_i.field_tb.placeBelow(2, (UiComponent) (var11), var12, (byte) -122);
            }
            for (var34_intLifetime2 = 0; ColourRowCache.field_b > var34_intLifetime2; var34_intLifetime2++) {
              if (var12.field_Ub[var34_intLifetime2].field_o) {
                if (null != eca.field_b) {
                  if (eca.field_b[var34_intLifetime2] != null) {
                    var35 = eca.field_b[var34_intLifetime2][var12.field_ac[var34_intLifetime2] & 255];
                  } else {
                    var35 = null;
                  }
                } else {
                  var35 = null;
                }
                if (var35 != null) {
                  ArchiveNetworkClient.field_b = DebouncedValidationSource.field_e[var34_intLifetime2] + " - " + (String) (var35);
                } else {
                  ArchiveNetworkClient.field_b = DebouncedValidationSource.field_e[var34_intLifetime2];
                }
              }
            }
            if (var12.field_xb.field_o) {
              if (1 == var12.field_cc) {
                var34 = ala.field_f;
              } else {
                var34 = SocketArchiveNetworkClient.field_w[var12.field_cc];
              }
              ArchiveNetworkClient.field_b = RoomCompletedScreen.field_k + " - " + var34;
            }
            if (var12.field_fc.field_o) {
              if (var12.field_Ob) {
                stackIn_151_0 = dka.field_a;
              } else {
                stackIn_151_0 = sda.field_i;
              }
              ArchiveNetworkClient.field_b = stackIn_151_0;
            }
            if (var12.field_vb.field_o) {
              if (!var12.field_Bb &&
                !var12.field_gc) {
                if (!var12.field_Yb) {
                  stackIn_160_0 = PerlinNoise2D.field_v;
                } else {
                  stackIn_160_0 = S2CRoundResultPacket.field_c;
                }
              } else {
                stackIn_160_0 = OpenGlRenderbuffer.field_k;
              }
              ArchiveNetworkClient.field_b = stackIn_160_0;
            }
            if (var12.field_Zb.field_o) {
              if (2 != var12.field_yb) {
                stackIn_165_0 = ega.field_d;
              } else {
                stackIn_165_0 = FleeLocomotor.field_y;
              }
              ArchiveNetworkClient.field_b = stackIn_165_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var12.field_y != 0 &&
              !var12.g(param1 + 0)) {
              if (var12.field_Nb.field_y == 0) {
                ImageProducerRasterBuffer.a((byte) -62, var12, param2, var32);
              } else {
                if (var12.field_ec && (!var12.field_Yb ||
                  !var12.field_Bb &&
                  !var12.field_gc)) {
                  LegacyOpenGlRidgedWaterEffect.a(param5, false, var12.getGameId(0));
                  decompiledFrameRemainder0 = false;
                }
                else {
                  CollisionGridEntry.a((byte) -111, param5, var12.getGameId(param1 ^ 0));
                }
              }
            }
            var12 = (LobbyGameWidget) (var8.next(param1 + 114));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var7), "bh.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final ConsoleValue invoke(ConsoleValue[] param0, int param1) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = new ConsoleValue(rua.a((String) (param0[0].field_d), -62));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bh.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0, boolean param1) {
        boolean stackIn_6_0 = false;
        if (param1) {
          field_o = 18;
        }
        stackIn_6_0 = (1 != param0) && (param0 != 7);
        return stackIn_6_0;
    }

    static {
        field_o = 17825;
    }
}
