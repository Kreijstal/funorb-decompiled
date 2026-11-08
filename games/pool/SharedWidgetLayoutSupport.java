/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SharedWidgetLayoutSupport {
    static int field_c;
    static String[] field_a;
    static int field_b;

    final static void a(int param0, int param1, int param2, boolean param3, boolean param4, int param5, int param6) {
        int var18_int = 0;
        int var22_int = 0;
        UiComponent dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        ScrollPane stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        boolean stackIn_4_2 = false;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        LobbyGame stackIn_12_0;
        UiComponent stackIn_12_1;
        UiComponent stackIn_12_2;
        long stackIn_12_3;
        UiComponent stackIn_13_1 = null;
        UiComponent stackIn_13_2 = null;
        UiComponent stackIn_13_4 = null;
        LobbyGame stackIn_32_0;
        UiComponent stackIn_32_1;
        UiComponent stackIn_32_2;
        long stackIn_32_3;
        UiComponent stackIn_33_1;
        UiComponent stackIn_33_2;
        UiComponent stackIn_33_4;
        int stackIn_37_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_81_0 = 0;
        Sprite[] stackIn_83_0 = null;
        int stackIn_84_1 = 0;
        Sprite[] stackIn_91_0 = null;
        int stackIn_92_1 = 0;
        String stackIn_157_0 = null;
        String stackIn_166_0 = null;
        String stackIn_172_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        IntrusiveDeque var8 = null;
        long var9 = 0L;
        Object var11 = null;
        LobbyGame var12 = null;
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
        UiComponent var42 = null;
        Sprite var43 = null;
        UiComponent var44 = null;
        UiComponent var45 = null;
        UiComponent var46 = null;
        UiComponent var47 = null;
        UiComponent var48 = null;
        UiComponent var49 = null;
        UiComponent var50 = null;
        Object var51 = null;
        Sprite var51_ref = null;
        Object var52 = null;
        Sprite var52_ref = null;
        Object var53 = null;
        Sprite var53_ref = null;
        Object var54 = null;
        Sprite var54_ref = null;
        Sprite var55 = null;
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
        var51 = null;
        var52 = null;
        var53 = null;
        var54 = null;
        var41 = Pool.field_O;
        try {
          stackIn_3_0 = BufferedSocket.field_m;
          stackIn_3_1 = param3;
          stackIn_4_2 = (WidgetStyleLayer.field_c == BufferedSocket.field_m);
          var7_int = ((ScrollPane) (Object) stackIn_3_0).updateContentLayout(stackIn_3_1, stackIn_4_2, 2, (byte) -112, 2 * (ArchiveIndex.field_x + 2), (8 + 4 * ArchiveIndex.field_x) * param6) ? 1 : 0;
          if (param1 != 0) {
            var42 = (UiComponent) null;
            SharedWidgetLayoutSupport.a((UiComponent) null, 35, (UiComponent) null, 120, (byte[]) null, 54, 24, (UiComponent) null, 88, -75);
          }
          var8 = BufferedSocket.field_m.content.children;
          var9 = MonotonicClock.monotonicTimeMillis((byte) -120);
          var11 = null;
          var12 = (LobbyGame) (var8.last((byte) -127));
          while (var12 != null) {
            var13 = 0;
            if (var12.children == null) {
              stackIn_10_0 = param0;
              stackIn_10_1 = param5;
              var14 = stackIn_10_0 | stackIn_10_1;
              var12.field_xc = new UiComponent(0L, BallSkin.field_d);
              var12.addChild(-108, var12.field_xc);
              var12.field_xc.horizontalAlignment = 1;
              var12.field_cc = new UiComponent(0L, PacketBuffer.field_s);
              var12.addChild(119, var12.field_cc);
              var12.field_Lb = new UiComponent(0L, BallSkin.field_d);
              var12.addChild(-111, var12.field_Lb);
              var12.field_Lb.textInset = 0;
              var12.field_nc = new UiComponent(0L, BallSkin.field_d);
              var12.addChild(-123, var12.field_nc);
              var12.field_nc.textInset = 0;
              var12.field_Bc = new UiComponent(0L, PacketBuffer.field_s);
              var12.addChild(118, var12.field_Bc);
              var12.field_Bc.horizontalAlignment = 2;
              stackIn_12_0 = var12;
              stackIn_12_1 = null;
              stackIn_12_2 = null;
              stackIn_12_3 = 0L;
              if (AccountStateQuery.field_p) {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = BallSkin.field_d;
              } else {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = PacketBuffer.field_s;
              }
              stackIn_12_0.field_Sb = new UiComponent(stackIn_12_3, stackIn_13_4);
              var12.addChild(94, var12.field_Sb);
              var12.field_Ub = new UiComponent[LogoFinalFrameLoader.field_c];
              var12.field_Ec = new UiComponent(0L, (UiComponent) null);
              if ((var14 & 1 << TikiBallSkin.field_n) != 0) {
                var12.field_Sb.addChild(73, var12.field_Ec);
              }
              var12.field_hc = new UiComponent(0L, (UiComponent) null);
              if (0 != (var14 & 1 << CacheEntry.field_F)) {
                var12.field_Sb.addChild(param1 - 116, var12.field_hc);
              }
              var12.field_lc = new UiComponent(0L, (UiComponent) null);
              if (0 != (1 << HighScoreRequest.field_o & var14)) {
                var12.field_Sb.addChild(126, var12.field_lc);
              }
              var12.field_kc = new UiComponent(0L, (UiComponent) null);
              if ((1 << DebugSliderInputSupport.field_b & var14) != 0) {
                var12.field_Sb.addChild(48, var12.field_kc);
              }
              var46 = var12.field_Ec;
              var45 = var12.field_kc;
              var12.field_lc.verticalAlignment = 1;
              var44 = var12.field_hc;
              var44.verticalAlignment = 1;
              var45.verticalAlignment = 1;
              var46.verticalAlignment = 1;
              for (var18_int = 0; var18_int < LogoFinalFrameLoader.field_c; var18_int++) {
                var12.field_Ub[var18_int] = new UiComponent(0L, (UiComponent) null);
                if (0 != (var14 & 1 << DebugSliderInputSupport.field_f + var18_int)) {
                  var12.field_Sb.addChild(-105, var12.field_Ub[var18_int]);
                }
                var12.field_Ub[var18_int].verticalAlignment = 1;
              }
              stackIn_32_0 = var12;
              stackIn_32_1 = null;
              stackIn_32_2 = null;
              stackIn_32_3 = 0L;
              if (!AccountStateQuery.field_p) {
                stackIn_33_1 = null;
                stackIn_33_2 = null;
                stackIn_33_4 = BallSkin.field_d;
              } else {
                stackIn_33_1 = null;
                stackIn_33_2 = null;
                stackIn_33_4 = PacketBuffer.field_s;
              }
              stackIn_32_0.field_dc = new UiComponent(stackIn_32_3, stackIn_33_4);
              var12.addChild(53, var12.field_dc);
              var12.field_dc.horizontalAlignment = 2;
              var12.field_jc = new UiComponent(0L, PacketBuffer.field_s);
              var12.addChild(-100, var12.field_jc);
              var12.field_Rb = new UiComponent(0L, UiWidget.field_A);
              var12.addChild(40, var12.field_Rb);
              var12.field_zc = new UiComponent(0L, UiWidget.field_A);
              var12.addChild(param1 + 87, var12.field_zc);
              var12.field_Cc = new UiComponent(0L, AlignedIconLabel.field_Lb);
              var12.addChild(-109, var12.field_Cc);
              var12.markDescendantsToInheritVisualState((byte) -125);
              var12.field_Tb = new UiComponent(0L, ModelInstance.field_i);
              var12.addChild(123, var12.field_Tb);
              var13 = 1;
            }
            stackIn_37_0 = (!var12.field_ec) ? param5 : param0;
            var14Lifetime1 = stackIn_37_0;
            var12.field_xc.text = null;
            var12.field_xc.height = 0;
            var47 = var12.field_xc;
            var47.width = 0;
            var12.field_Tb.text = null;
            var48 = var12.field_Tb;
            var12.field_Tb.height = 0;
            var48.width = 0;
            var12.field_cc.text = null;
            var12.field_cc.height = 0;
            var49 = var12.field_cc;
            var49.width = 0;
            var12.field_Lb.text = null;
            var18 = var12.field_Lb;
            var12.field_Lb.height = 0;
            var18.width = 0;
            var12.field_nc.text = null;
            var19 = var12.field_nc;
            var12.field_nc.height = 0;
            var19.width = 0;
            var12.field_Bc.text = null;
            var12.field_Bc.height = 0;
            var20 = var12.field_Bc;
            var20.width = 0;
            var12.field_Sb.text = null;
            var12.field_Sb.height = 0;
            var21 = var12.field_Sb;
            var21.width = 0;
            for (var22_int = 0; var22_int < LogoFinalFrameLoader.field_c; var22_int++) {
              var12.field_Ub[var22_int].sprite = null;
              var23 = var12.field_Ub[var22_int];
              var12.field_Ub[var22_int].height = 0;
              var23.width = 0;
            }
            var12.field_Ec.sprite = null;
            var22 = var12.field_Ec;
            var12.field_Ec.height = 0;
            var12.field_kc.sprite = null;
            var22.width = 0;
            var50 = var12.field_kc;
            var12.field_kc.height = 0;
            var12.field_hc.sprite = null;
            var50.width = 0;
            var24 = var12.field_hc;
            var12.field_hc.height = 0;
            var12.field_lc.sprite = null;
            var24.width = 0;
            var12.field_lc.height = 0;
            var25 = var12.field_lc;
            var25.width = 0;
            var12.field_dc.text = null;
            var12.field_dc.height = 0;
            var26 = var12.field_dc;
            var26.width = 0;
            var12.field_jc.text = null;
            var12.field_jc.height = 0;
            var27 = var12.field_jc;
            var12.field_Rb.text = null;
            var27.width = 0;
            var12.field_Rb.height = 0;
            var28 = var12.field_Rb;
            var28.width = 0;
            var12.field_zc.text = null;
            var29 = var12.field_zc;
            var12.field_zc.height = 0;
            var12.field_Cc.text = null;
            var29.width = 0;
            var12.field_Cc.height = 0;
            var30 = var12.field_Cc;
            var30.width = 0;
            var12.width = BufferedSocket.field_m.content.width;
            var31 = 0;
            var32 = var12.field_Ob;
            if (!var12.isUnindexed(-14144)) {
              boolean decompiledFrameRemainder1 = true;
              if (!var12.field_ec) {
                if (!var12.field_ic &&
                  !var12.field_Xb) {
                  if (var12.field_Qb) {
                    var12.field_xc.text = Pocket.statusFull;
                  } else {
                    var12.field_xc.text = ThemeSelectScreen.statusPrivate;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var12.field_Tb.text = MidiPcmStream.statusJoin;
                }
              } else {
                if (0 > var12.field_qc) {
                  if (var12.field_Dc && (var12.field_ic ||
                    var12.field_Xb)) {
                    var12.field_Tb.text = MidiPcmStream.statusJoin;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (var12.field_Yb == 2) {
                      var12.field_Tb.text = KillerRules.statusSpectate;
                    } else {
                      var12.field_xc.text = DiskArchiveRequest.statusPlaying;
                    }
                  }
                } else {
                  var12.field_xc.text = ChatMessage.statusConcluded;
                }
              }
              if (null == var12.field_Tb.text) {
                var12.field_xc.setBounds(var31, 2147483647, 0, 68, ArchiveIndex.field_x);
              } else {
                var12.field_Tb.setBounds(var31, 2147483647, 0, 68, ArchiveIndex.field_x);
              }
              var12.field_cc.text = BitmapFont.truncateText(var12.field_cc.font, var32, 78);
              var12.field_cc.setBounds(var31, 2147483647, 70, 78, ArchiveIndex.field_x);
              if (var12.field_cc.activeInside &&
                !var12.field_cc.text.equals(var32)) {
                CacheEntry.field_B = var32;
              }
              var12.field_Lb.text = Integer.toString(var12.field_mc);
              if (var12.field_Dc) {
                var12.field_nc.text = "/" + var12.field_Nb;
                var12.field_Lb.horizontalAlignment = 2;
                var33_int = (348 - var12.field_nc.font.b("/")) / 2;
                var12.field_Lb.setBounds(var31, 2147483647, 150, -150 + var33_int, ArchiveIndex.field_x);
                var12.field_nc.setBounds(var31, param1 ^ 2147483647, var33_int, -var33_int + 198, ArchiveIndex.field_x);
              } else {
                var12.field_Lb.horizontalAlignment = 1;
                var12.field_Lb.setBounds(var31, 2147483647, 150, 48, ArchiveIndex.field_x);
              }
              var12.field_Bc.text = Integer.toString(var12.field_pc);
              var12.field_Bc.setBounds(var31, 2147483647, 200, 48, ArchiveIndex.field_x);
              stackIn_70_0 = (!AccountStateQuery.field_p) ? 200 : 250;
              var33_intLifetime1 = stackIn_70_0;
              var12.field_Sb.setBounds(var31, 2147483647, var33_intLifetime1, -2 - var33_intLifetime1 + 365, ArchiveIndex.field_x);
              var34_int = ByteArrayPool.field_b;
              if ((1 << TikiBallSkin.field_n & var14Lifetime1) != 0) {
                var51_ref = IntrusiveNodeHashTable.field_i[var12.field_ac];
                var12.field_Ec.sprite = var51_ref;
                var12.field_Ec.setBounds(0, 2147483647, var34_int, var51_ref.field_w, var12.field_Sb.height);
                var34_int = var34_int + (ByteArrayPool.field_b + var51_ref.field_w);
              }
              if (0 != (1 << CacheEntry.field_F & var14Lifetime1)) {
                if (!var12.field_ic) {
                  stackIn_81_0 = (var12.field_Xb) ? 1 : 0;
                } else {
                  stackIn_81_0 = 1;
                }
                var36 = stackIn_81_0;
                stackIn_83_0 = RasterBuffer.field_a;
                if (var36 != 0) {
                  stackIn_84_1 = 1;
                } else {
                  stackIn_84_1 = 0;
                }
                var52_ref = stackIn_83_0[stackIn_84_1];
                var12.field_hc.sprite = var52_ref;
                var12.field_hc.setBounds(0, param1 ^ 2147483647, var34_int, var52_ref.field_w, var12.field_Sb.height);
                var34_int = var34_int + (var52_ref.field_w + ByteArrayPool.field_b);
              }
              if ((var14Lifetime1 & 1 << HighScoreRequest.field_o) != 0) {
                var53_ref = PackedColorSupport.field_f[-1 + var12.field_Yb];
                var12.field_lc.sprite = var53_ref;
                var12.field_lc.setBounds(0, 2147483647, var34_int, var53_ref.field_w, var12.field_Sb.height);
                var34_int = var34_int + (ByteArrayPool.field_b + var53_ref.field_w);
              }
              if ((1 << DebugSliderInputSupport.field_b & var14Lifetime1) != 0) {
                stackIn_91_0 = QuickChatMenuSupport.field_c;
                if (var12.field_wc) {
                  stackIn_92_1 = 1;
                } else {
                  stackIn_92_1 = 0;
                }
                var54_ref = stackIn_91_0[stackIn_92_1];
                var12.field_kc.sprite = var54_ref;
                var12.field_kc.setBounds(0, 2147483647, var34_int, var54_ref.field_w, var12.field_Sb.height);
                var34_int = var34_int + (var54_ref.field_w + ByteArrayPool.field_b);
              }
              if (GradientPaletteSupport.field_d != null) {
                for (var36Lifetime1 = 0; LogoFinalFrameLoader.field_c > var36Lifetime1; var36Lifetime1++) {
                  if (null != GradientPaletteSupport.field_d[var36Lifetime1] &&
                    (1 << DebugSliderInputSupport.field_f + var36Lifetime1 & var14Lifetime1) != 0) {
                    var43 = GradientPaletteSupport.field_d[var36Lifetime1][255 & var12.settings[var36Lifetime1]];
                    var55 = var43;
                    var12.field_Ub[var36Lifetime1].sprite = var43;
                    var12.field_Ub[var36Lifetime1].setBounds(0, 2147483647, var34_int, var55.field_w, var12.field_Sb.height);
                    var34_int = var34_int + (ByteArrayPool.field_b + var55.field_w);
                  }
                }
              }
              var36Lifetime2 = (-var34_int + var12.field_Sb.width) / 2;
              if (0 < var36Lifetime2) {
                var12.field_Ec.localX = var12.field_Ec.localX + var36Lifetime2;
                var12.field_hc.localX = var12.field_hc.localX + var36Lifetime2;
                var12.field_lc.localX = var12.field_lc.localX + var36Lifetime2;
                var12.field_kc.localX = var12.field_kc.localX + var36Lifetime2;
                for (var37_int = 0; LogoFinalFrameLoader.field_c > var37_int; var37_int++) {
                  dupTemp$0 = var12.field_Ub[var37_int];
                  dupTemp$0.localX = dupTemp$0.localX + var36Lifetime2;
                }
              }
              if (var12.field_ec) {
                var37_intLifetime1 = var12.field_qc;
                if (var37_intLifetime1 < 0) {
                  var37_intLifetime1 = (int)(var9 - var12.field_sc);
                }
                var38_int = var37_intLifetime1 / 1000;
                var39 = var38_int / 60;
                var38_int = var38_int % 60;
                if (var39 >= 60) {
                  var40 = var39 / 60;
                  var39 = var39 % 60;
                  var12.field_dc.text = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                } else {
                  var12.field_dc.text = var39 + ":" + var38_int / 10 + var38_int % 10;
                }
              }
              var12.field_dc.setBounds(var31, 2147483647, 365, -365 + var12.width, ArchiveIndex.field_x);
              var31 = var31 + ArchiveIndex.field_x;
              if (var12.playerNames != null) {
                var31 += 2;
                var37 = new StringBuilder(64);
                discarded$1 = var37.append(ResizableDialog.playersInGame);
                discarded$2 = var37.append(var12.playerNames[0]);
                for (var38_intLifetime1 = 1; var38_intLifetime1 < var12.field_mc; var38_intLifetime1++) {
                  discarded$3 = var37.append(", ");
                  discarded$4 = var37.append(var12.playerNames[var38_intLifetime1]);
                }
                var38 = var37.toString();
                var12.field_jc.text = var38;
                var39Lifetime1 = var12.field_jc.font.countWrappedLines(var38, var12.width - 2 * var12.field_jc.textInset);
                var12.field_jc.setBounds(var31, param1 ^ 2147483647, 0, var12.width, var39Lifetime1 * ArchiveIndex.field_x);
                var31 = var31 + var39Lifetime1 * ArchiveIndex.field_x;
              }
              if (var12.field_Xb) {
                var12.field_Rb.text = AccountWelcomePanel.substituteTemplateArguments(new String[]{var32}, -1, AppletUrlSupport.youAreInvitedToXsGame);
                var12.field_Rb.setBounds(var31, param1 ^ 2147483647, CueAim.field_j, var12.width - CueAim.field_j * 2, ArchiveIndex.field_x);
                var31 = var31 + ArchiveIndex.field_x;
              }
              if (var12.field_fc) {
                var12.field_zc.text = AccountWelcomePanel.substituteTemplateArguments(new String[]{var32}, ~param1, TextLayout.askingToJoinXsGame);
                var12.field_zc.setBounds(var31, param1 + 2147483647, CueAim.field_j, -(CueAim.field_j * 2) + var12.width, ArchiveIndex.field_x);
                var31 = var31 + ArchiveIndex.field_x;
              }
            }
            var33 = AlternateLongAndTextLoginPayload.a(var32, var12.field_Fc, true);
            var34 = var33;
            var34Lifetime1 = var33;
            if (var33 != null) {
              var34_intLifetime1 = var12.field_Cc.font.countWrappedLines(var33, -CueAim.field_j - CueAim.field_j + var12.width);
              var12.field_Cc.textAlpha256 = var12.field_Mb * 256 / AudioService.field_f;
              var12.field_Cc.text = var33;
              var12.field_Cc.setBounds(var31, 2147483647, CueAim.field_j, var12.width - 2 * CueAim.field_j, ArchiveIndex.field_x * var34_intLifetime1);
              var31 = var31 + var34_intLifetime1 * ArchiveIndex.field_x;
            }
            if (var7_int == 0) {
              var12.remainingHeight = -var12.height + var31;
            }
            if (var13 != 0) {
              BufferedSocket.field_m.content.placeBelow((UiComponent) (var11), 2, var12, param1 - 79);
            }
            for (var34_intLifetime2 = 0; LogoFinalFrameLoader.field_c > var34_intLifetime2; var34_intLifetime2++) {
              if (var12.field_Ub[var34_intLifetime2].activeInside) {
                if (null == BufferedFile.field_p) {
                  var35 = null;
                } else {
                  if (null != BufferedFile.field_p[var34_intLifetime2]) {
                    var35 = BufferedFile.field_p[var34_intLifetime2][255 & var12.settings[var34_intLifetime2]];
                  } else {
                    var35 = null;
                  }
                }
                if (var35 != null) {
                  CacheEntry.field_B = ValidationMessageWidget.field_R[var34_intLifetime2] + " - " + (String) (var35);
                } else {
                  CacheEntry.field_B = ValidationMessageWidget.field_R[var34_intLifetime2];
                }
              }
            }
            if (var12.field_Ec.activeInside) {
              if (var12.field_ac != 1) {
                var34Lifetime2 = ChatMessage.field_i[var12.field_ac];
              } else {
                var34Lifetime2 = ChatInputSupport.runescapeclan;
              }
              CacheEntry.field_B = SharedRateScaleSupport.whoCanJoin + " - " + var34Lifetime2;
            }
            if (var12.field_kc.activeInside) {
              if (!var12.field_wc) {
                stackIn_157_0 = PackedColorSupport.unratedGame;
              } else {
                stackIn_157_0 = ScrollPane.ratedGame;
              }
              CacheEntry.field_B = stackIn_157_0;
            }
            if (var12.field_hc.activeInside) {
              if (!var12.field_ic &&
                !var12.field_Xb) {
                if (!var12.field_Dc) {
                  stackIn_166_0 = Cp1252DecodingSupport.youCannotJoinInProgress;
                } else {
                  stackIn_166_0 = LobbyPlayer.youCanAskToJoin;
                }
              } else {
                stackIn_166_0 = DebouncedValidationProvider.youCanJoin;
              }
              CacheEntry.field_B = stackIn_166_0;
            }
            if (var12.field_lc.activeInside) {
              if (2 != var12.field_Yb) {
                stackIn_172_0 = MirroredSceneSupport.youCanNotSpectate;
              } else {
                stackIn_172_0 = OpacityWidget.youCanSpectate;
              }
              CacheEntry.field_B = stackIn_172_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var12.pressedButton != 0) {
              if (var12.isUnindexed(-14144)) {
                var12 = (LobbyGame) (var8.previous((byte) -5));
                continue;
              }
              if (var12.field_Tb.pressedButton == 0) {
                PacketAvailabilitySupport.a((byte) -110, param4, var12, var32);
              } else {
                if (var12.field_ec && (!var12.field_Dc ||
                  !var12.field_ic &&
                  !var12.field_Xb)) {
                  FaceNormal.a(var12.getGameId(20872), param1 + 3, param2);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  HighscoresScreen.a(var12.getGameId(20872), (byte) -104, param2);
                }
              }
            }
            var12 = (LobbyGame) (var8.previous((byte) -5));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var7), "mk.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(UiComponent param0, int param1, UiComponent param2, int param3, byte[] param4, int param5, int param6, UiComponent param7, int param8, int param9) {
        int var11 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var12 = 0;
        var12 = Pool.field_O;
        try {
          SpaceObject.field_j = param4;
          BitmapTextLayout.field_m = -1L;
          PoolMatchController.field_hb = param8;
          LogoFinalFrameLoader.field_c = param4.length;
          LookupRetrySupport.field_e = null;
          HighscoresScreen.field_L = null;
          RenderingInitializationSupport.field_c = new byte[(PoolMatchController.field_hb + 7) / 8];
          LobbyGame.field_Ac = false;
          var10_int = 0;
          for (var11 = 0; SpaceObject.field_j.length > var11; var11++) {
            var10_int = var10_int + (SpaceObject.field_j[var11] & 255);
          }
          if (param9 != 13162) {
            field_c = -6;
          }
          var10_int = (var10_int + 7) / 8;
          AgeValidator.field_s = new byte[var10_int];
          if (null == param7.children) {
            param7.children = new IntrusiveDeque();
          }
          IntrusiveNode.field_i = param7.children;
          IntrusiveNode.field_i.clear((byte) 106);
          ModelOriginSupport.field_n = new DualLinkNodeHashTable(param6);
          PoolMatchController.field_jb = 0;
          TutorialSelectScreen.field_I = -1;
          LobbyPlayerLookupSupport.field_d = -1;
          AgeValidator.field_r = 0;
          if (param0.children == null) {
            param0.children = new IntrusiveDeque();
          }
          NetworkGameClient.field_A = param0.children;
          NetworkGameClient.field_A.clear((byte) 123);
          LoginEncryptionSupport.field_a = new DualLinkNodeHashTable(param1);
          if (null == param2.children) {
            param2.children = new IntrusiveDeque();
          }
          ValidationMessageWidget.field_W = param2.children;
          ValidationMessageWidget.field_W.clear((byte) 36);
          LobbyPlayer.field_Qb = new DualLinkNodeHashTable(param5);
          AudioService.field_f = param3;
          StrongCacheEntry.field_K = 0L;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_17_0 = var10;
          stackIn_17_1 = new StringBuilder().append("mk.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          UiComponent var2 = (UiComponent) null;
          SharedWidgetLayoutSupport.a((UiComponent) null, -99, (UiComponent) null, -55, (byte[]) null, -33, 73, (UiComponent) null, 92, -39);
        }
        field_a = null;
    }

    static {
        field_b = 0;
    }
}
