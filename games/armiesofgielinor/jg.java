/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jg extends IntrusiveNode {
    int field_l;
    static RgbSprite field_m;
    static String field_n;
    static int field_k;

    public static void a(int param0) {
        field_n = null;
        int var1 = 48 % ((param0 - 27) / 32);
        field_m = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        if (param2 != 512) {
          jg.a((byte) 13);
        }
        int var5 = kd.field_Z[param4][param3];
        if (var5 > -1) {
          var6 = AttackEvent.nextBoundedInt(false, td.field_d[var5].length, li.field_n);
          if (td.field_d[var5][var6] != null &&
            td.field_d[var5][var6].samples.length != 0) {
            param0 = 512 - (param0 - 800);
            param1 = 512 + (param1 <= 512 ? param1 < -512 ? -512 : param1 : 512) >> 2;
            param0 = ((param0 <= 512 ? param0 : 512) >> 2) + 120;
            jv.playSoundWithPan(td.field_d[var5][var6], param1, param0, (byte) 87);
          }
        }
    }

    final static void a(byte param0) {
        if (BattleTutorial.quickChatMenuVisible) {
          SoftwareRaster.d(SoftwareRaster.clipLeft, SoftwareRaster.clipTop, SoftwareRaster.clipRight - SoftwareRaster.clipLeft, SoftwareRaster.clipBottom - SoftwareRaster.clipTop);
          OwnerChangeEvent.quickChatMenuHost.draw(false, 20);
        }
        if (param0 != 102) {
          jg.a(-122, true, false, -112, 41, -27, 39);
        }
    }

    jg(int param0) {
        this.field_l = param0;
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var18_int = 0;
        int var22_int = 0;
        ClientUiComponent dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        ScrollContainer stackIn_3_0;
        boolean stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        boolean stackIn_4_4;
        LobbyRoom stackIn_10_0;
        ClientUiComponent stackIn_10_1;
        ClientUiComponent stackIn_10_2;
        long stackIn_10_3;
        ClientUiComponent stackIn_11_1 = null;
        ClientUiComponent stackIn_11_2 = null;
        ClientUiComponent stackIn_11_4 = null;
        LobbyRoom stackIn_31_0;
        ClientUiComponent stackIn_31_1;
        ClientUiComponent stackIn_31_2;
        long stackIn_31_3;
        ClientUiComponent stackIn_32_1;
        ClientUiComponent stackIn_32_2;
        ClientUiComponent stackIn_32_4;
        int stackIn_36_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_83_0 = 0;
        RgbSprite[] stackIn_85_0 = null;
        int stackIn_86_1 = 0;
        RgbSprite[] stackIn_93_0 = null;
        int stackIn_94_1 = 0;
        String stackIn_156_0 = null;
        String stackIn_166_0 = null;
        String stackIn_171_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        NodeDeque var8 = null;
        long var9 = 0L;
        Object var11 = null;
        LobbyRoom var12 = null;
        int var13 = 0;
        int var14 = 0;
        ClientUiComponent var18 = null;
        ClientUiComponent var19 = null;
        ClientUiComponent var20 = null;
        ClientUiComponent var21 = null;
        ClientUiComponent var22 = null;
        ClientUiComponent var23 = null;
        ClientUiComponent var24 = null;
        ClientUiComponent var25 = null;
        ClientUiComponent var26 = null;
        ClientUiComponent var27 = null;
        ClientUiComponent var28 = null;
        ClientUiComponent var29 = null;
        ClientUiComponent var30 = null;
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
        RgbSprite var42 = null;
        ClientUiComponent var43 = null;
        ClientUiComponent var44 = null;
        ClientUiComponent var45 = null;
        ClientUiComponent var46 = null;
        ClientUiComponent var47 = null;
        ClientUiComponent var48 = null;
        ClientUiComponent var49 = null;
        Object var50 = null;
        RgbSprite var50_ref = null;
        Object var51 = null;
        RgbSprite var51_ref = null;
        Object var52 = null;
        RgbSprite var52_ref = null;
        Object var53 = null;
        RgbSprite var53_ref = null;
        RgbSprite var54 = null;
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
        var41 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          stackIn_3_0 = CipherPacketBuffer.field_x;
          stackIn_3_1 = param1;
          stackIn_3_2 = param3 * (8 + 4 * jn.field_d);
          stackIn_3_3 = jn.field_d * 2 + 4;
          stackIn_4_4 = (CipherPacketBuffer.field_x == PointerInputHandler.contextMenuScrollContainer);
          var7_int = ((ScrollContainer) (Object) stackIn_3_0).updateContentLayout(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_4_4, param0, 2) ? 1 : 0;
          var8 = CipherPacketBuffer.field_x.content.children;
          var9 = vi.monotonicMillis(-118);
          var11 = null;
          var12 = (LobbyRoom) (var8.first((byte) 120));
          while (var12 != null) {
            var13 = 0;
            if (null == var12.children) {
              var12.field_Xb = new ClientUiComponent(0L, ws.field_P);
              var14 = param4 | param5;
              var12.addChild(var12.field_Xb, param0 + 107);
              var12.field_Xb.horizontalAlignment = 1;
              var12.ownerNameComponent = new ClientUiComponent(0L, IsaacRandom.field_i);
              var12.addChild(var12.ownerNameComponent, 102);
              var12.playerCountComponent = new ClientUiComponent(0L, ws.field_P);
              var12.addChild(var12.playerCountComponent, 59);
              var12.playerCountComponent.textHorizontalPadding = 0;
              var12.capacityComponent = new ClientUiComponent(0L, ws.field_P);
              var12.addChild(var12.capacityComponent, 61);
              var12.capacityComponent.textHorizontalPadding = 0;
              var12.ratingComponent = new ClientUiComponent(0L, IsaacRandom.field_i);
              var12.addChild(var12.ratingComponent, 78);
              var12.ratingComponent.horizontalAlignment = 2;
              stackIn_10_0 = var12;
              stackIn_10_1 = null;
              stackIn_10_2 = null;
              stackIn_10_3 = 0L;
              if (!fh.field_c) {
                stackIn_11_1 = null;
                stackIn_11_2 = null;
                stackIn_11_4 = IsaacRandom.field_i;
              } else {
                stackIn_11_1 = null;
                stackIn_11_2 = null;
                stackIn_11_4 = ws.field_P;
              }
              stackIn_10_0.optionIconContainer = new ClientUiComponent(stackIn_10_3, stackIn_11_4);
              var12.addChild(var12.optionIconContainer, param0 ^ 63);
              var12.optionIcons = new ClientUiComponent[tq.gameOptionCount];
              var12.gameTypeIcon = new ClientUiComponent(0L, (ClientUiComponent) null);
              if (0 != (var14 & 1 << ev.field_c)) {
                var12.optionIconContainer.addChild(var12.gameTypeIcon, param0 + 62);
              }
              var12.field_ec = new ClientUiComponent(0L, (ClientUiComponent) null);
              if ((1 << ai.field_M & var14) != 0) {
                var12.optionIconContainer.addChild(var12.field_ec, param0 + 59);
              }
              var12.spectatorIcon = new ClientUiComponent(0L, (ClientUiComponent) null);
              if ((var14 & 1 << gg.field_I) != 0) {
                var12.optionIconContainer.addChild(var12.spectatorIcon, param0 + 121);
              }
              var12.ratedIcon = new ClientUiComponent(0L, (ClientUiComponent) null);
              if ((var14 & 1 << uj.field_j) != 0) {
                var12.optionIconContainer.addChild(var12.ratedIcon, 86);
              }
              var45 = var12.gameTypeIcon;
              var44 = var12.ratedIcon;
              var43 = var12.field_ec;
              var12.spectatorIcon.verticalAlignment = 1;
              var43.verticalAlignment = 1;
              var44.verticalAlignment = 1;
              var45.verticalAlignment = 1;
              for (var18_int = 0; tq.gameOptionCount > var18_int; var18_int++) {
                var12.optionIcons[var18_int] = new ClientUiComponent(0L, (ClientUiComponent) null);
                if ((var14 & 1 << var18_int + na.field_E) != 0) {
                  var12.optionIconContainer.addChild(var12.optionIcons[var18_int], 39);
                }
                var12.optionIcons[var18_int].verticalAlignment = 1;
              }
              stackIn_31_0 = var12;
              stackIn_31_1 = null;
              stackIn_31_2 = null;
              stackIn_31_3 = 0L;
              if (fh.field_c) {
                stackIn_32_1 = null;
                stackIn_32_2 = null;
                stackIn_32_4 = IsaacRandom.field_i;
              } else {
                stackIn_32_1 = null;
                stackIn_32_2 = null;
                stackIn_32_4 = ws.field_P;
              }
              stackIn_31_0.field_Rb = new ClientUiComponent(stackIn_31_3, stackIn_32_4);
              var12.addChild(var12.field_Rb, 39);
              var12.field_Rb.horizontalAlignment = 2;
              var12.field_Pb = new ClientUiComponent(0L, IsaacRandom.field_i);
              var12.addChild(var12.field_Pb, 85);
              var12.field_Ib = new ClientUiComponent(0L, DualLinkedNode.field_k);
              var12.addChild(var12.field_Ib, 78);
              var12.field_sc = new ClientUiComponent(0L, DualLinkedNode.field_k);
              var12.addChild(var12.field_sc, param0 ^ 47);
              var12.field_Wb = new ClientUiComponent(0L, eq.field_h);
              var12.addChild(var12.field_Wb, 51);
              var12.inheritVisualStateForDescendants(param0 ^ -10027);
              var12.field_Yb = new ClientUiComponent(0L, QuickChatPhraseRepository.field_d);
              var12.addChild(var12.field_Yb, 89);
              var13 = 1;
            }
            var12.field_Xb.text = null;
            stackIn_36_0 = (var12.playing) ? param5 : param4;
            var14Lifetime1 = stackIn_36_0;
            var46 = var12.field_Xb;
            var12.field_Xb.height = 0;
            var12.field_Yb.text = null;
            var46.width = 0;
            var12.field_Yb.height = 0;
            var47 = var12.field_Yb;
            var12.ownerNameComponent.text = null;
            var47.width = 0;
            var48 = var12.ownerNameComponent;
            var12.ownerNameComponent.height = 0;
            var12.playerCountComponent.text = null;
            var48.width = 0;
            var12.playerCountComponent.height = 0;
            var18 = var12.playerCountComponent;
            var12.capacityComponent.text = null;
            var18.width = 0;
            var19 = var12.capacityComponent;
            var12.capacityComponent.height = 0;
            var19.width = 0;
            var12.ratingComponent.text = null;
            var20 = var12.ratingComponent;
            var12.ratingComponent.height = 0;
            var20.width = 0;
            var12.optionIconContainer.text = null;
            var12.optionIconContainer.height = 0;
            var21 = var12.optionIconContainer;
            var21.width = 0;
            for (var22_int = 0; var22_int < tq.gameOptionCount; var22_int++) {
              var12.optionIcons[var22_int].sprite = null;
              var23 = var12.optionIcons[var22_int];
              var12.optionIcons[var22_int].height = 0;
              var23.width = 0;
            }
            var12.gameTypeIcon.sprite = null;
            var12.gameTypeIcon.height = 0;
            var22 = var12.gameTypeIcon;
            var22.width = 0;
            var12.ratedIcon.sprite = null;
            var49 = var12.ratedIcon;
            var12.ratedIcon.height = 0;
            var49.width = 0;
            var12.field_ec.sprite = null;
            var24 = var12.field_ec;
            var12.field_ec.height = 0;
            var24.width = 0;
            var12.spectatorIcon.sprite = null;
            var25 = var12.spectatorIcon;
            var12.spectatorIcon.height = 0;
            var25.width = 0;
            var12.field_Rb.text = null;
            var26 = var12.field_Rb;
            var12.field_Rb.height = 0;
            var12.field_Pb.text = null;
            var26.width = 0;
            var12.field_Pb.height = 0;
            var27 = var12.field_Pb;
            var27.width = 0;
            var12.field_Ib.text = null;
            var28 = var12.field_Ib;
            var12.field_Ib.height = 0;
            var12.field_sc.text = null;
            var28.width = 0;
            var29 = var12.field_sc;
            var12.field_sc.height = 0;
            var12.field_Wb.text = null;
            var29.width = 0;
            var30 = var12.field_Wb;
            var12.field_Wb.height = 0;
            var30.width = 0;
            var12.width = CipherPacketBuffer.field_x.content.width;
            var31 = 0;
            var32 = var12.ownerName;
            if (!var12.isRemovedFromIndex(param0 ^ -7)) {
              boolean decompiledFrameRemainder1 = true;
              if (var12.playing) {
                if (var12.completedDurationMillis < 0) {
                  if (var12.allowsAdmissionRequests && (var12.joinable ||
                    var12.invitationReceived)) {
                    var12.field_Yb.text = fl.field_l;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (var12.spectatorMode != 2) {
                      var12.field_Xb.text = bi.field_d;
                    } else {
                      var12.field_Yb.text = re.field_E;
                    }
                  }
                } else {
                  var12.field_Xb.text = kw.field_Q;
                }
              } else {
                if (!var12.joinable &&
                  !var12.invitationReceived) {
                  if (var12.openToJoin) {
                    var12.field_Xb.text = AnimationFrameSet.field_I;
                  } else {
                    var12.field_Xb.text = ClientUiComponent.field_zb;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var12.field_Yb.text = fl.field_l;
                }
              }
              if (var12.field_Yb.text == null) {
                var12.field_Xb.setBounds(jn.field_d, -20500, 68, var31, 0);
              } else {
                var12.field_Yb.setBounds(jn.field_d, -20500, 68, var31, 0);
              }
              var12.ownerNameComponent.text = BitmapFont.a(var12.ownerNameComponent.font, var32, 78);
              var12.ownerNameComponent.setBounds(jn.field_d, -20500, 78, var31, 70);
              if (var12.ownerNameComponent.heldButtonMatches &&
                !var12.ownerNameComponent.text.equals(var32)) {
                ad.field_I = var32;
              }
              var12.playerCountComponent.text = Integer.toString(var12.playerCount);
              if (!var12.allowsAdmissionRequests) {
                var12.playerCountComponent.horizontalAlignment = 1;
                var12.playerCountComponent.setBounds(jn.field_d, -20500, 48, var31, 150);
              } else {
                var12.playerCountComponent.horizontalAlignment = 2;
                var12.capacityComponent.text = "/" + var12.playerCapacity;
                var33_int = (-var12.capacityComponent.font.a("/") + 348) / 2;
                var12.playerCountComponent.setBounds(jn.field_d, -20500, -150 + var33_int, var31, 150);
                var12.capacityComponent.setBounds(jn.field_d, -20500, 198 - var33_int, var31, var33_int);
              }
              var12.ratingComponent.text = Integer.toString(var12.displayRating);
              var12.ratingComponent.setBounds(jn.field_d, param0 - 20500, 48, var31, 200);
              stackIn_72_0 = (!fh.field_c) ? 200 : 250;
              var33_intLifetime1 = stackIn_72_0;
              var12.optionIconContainer.setBounds(jn.field_d, param0 ^ -20500, 365 - var33_intLifetime1 - 2, var31, var33_intLifetime1);
              var34_int = MusicPatch.field_n;
              if ((1 << ev.field_c & var14Lifetime1) != 0) {
                var50_ref = rs.field_p[var12.gameType];
                var12.gameTypeIcon.sprite = var50_ref;
                var12.gameTypeIcon.setBounds(var12.optionIconContainer.height, param0 ^ -20500, var50_ref.canvasWidth, 0, var34_int);
                var34_int = var34_int + (var50_ref.canvasWidth + MusicPatch.field_n);
              }
              if ((1 << ai.field_M & var14Lifetime1) != 0) {
                if (!var12.joinable) {
                  stackIn_83_0 = (var12.invitationReceived) ? 1 : 0;
                } else {
                  stackIn_83_0 = 1;
                }
                var36 = stackIn_83_0;
                stackIn_85_0 = ChatMessage.field_g;
                if (var36 == 0) {
                  stackIn_86_1 = 0;
                } else {
                  stackIn_86_1 = 1;
                }
                var51_ref = stackIn_85_0[stackIn_86_1];
                var12.field_ec.sprite = var51_ref;
                var12.field_ec.setBounds(var12.optionIconContainer.height, param0 ^ -20500, var51_ref.canvasWidth, 0, var34_int);
                var34_int = var34_int + (var51_ref.canvasWidth + MusicPatch.field_n);
              }
              if ((1 << gg.field_I & var14Lifetime1) != 0) {
                var52_ref = lm.field_h[var12.spectatorMode - 1];
                var12.spectatorIcon.sprite = var52_ref;
                var12.spectatorIcon.setBounds(var12.optionIconContainer.height, -20500, var52_ref.canvasWidth, 0, var34_int);
                var34_int = var34_int + (var52_ref.canvasWidth + MusicPatch.field_n);
              }
              if ((1 << uj.field_j & var14Lifetime1) != 0) {
                stackIn_93_0 = ResourceProtocolClient.field_d;
                if (!var12.rated) {
                  stackIn_94_1 = 0;
                } else {
                  stackIn_94_1 = 1;
                }
                var53_ref = stackIn_93_0[stackIn_94_1];
                var12.ratedIcon.sprite = var53_ref;
                var12.ratedIcon.setBounds(var12.optionIconContainer.height, -20500, var53_ref.canvasWidth, 0, var34_int);
                var34_int = var34_int + (MusicPatch.field_n + var53_ref.canvasWidth);
              }
              if (ju.field_a != null) {
                for (var36Lifetime1 = 0; var36Lifetime1 < tq.gameOptionCount; var36Lifetime1++) {
                  if (ju.field_a[var36Lifetime1] != null &&
                    (1 << var36Lifetime1 + na.field_E & var14Lifetime1) != 0) {
                    var42 = ju.field_a[var36Lifetime1][var12.gameOptions[var36Lifetime1] & 255];
                    var54 = var42;
                    var12.optionIcons[var36Lifetime1].sprite = var42;
                    var12.optionIcons[var36Lifetime1].setBounds(var12.optionIconContainer.height, -20500, var54.canvasWidth, 0, var34_int);
                    var34_int = var34_int + (var54.canvasWidth + MusicPatch.field_n);
                  }
                }
              }
              var36Lifetime2 = (var12.optionIconContainer.width - var34_int) / 2;
              if (0 < var36Lifetime2) {
                var12.gameTypeIcon.x = var12.gameTypeIcon.x + var36Lifetime2;
                var12.field_ec.x = var12.field_ec.x + var36Lifetime2;
                var12.spectatorIcon.x = var12.spectatorIcon.x + var36Lifetime2;
                var12.ratedIcon.x = var12.ratedIcon.x + var36Lifetime2;
                for (var37_int = 0; var37_int < tq.gameOptionCount; var37_int++) {
                  dupTemp$0 = var12.optionIcons[var37_int];
                  dupTemp$0.x = dupTemp$0.x + var36Lifetime2;
                }
              }
              if (var12.playing) {
                var37_intLifetime1 = var12.completedDurationMillis;
                if (var37_intLifetime1 < 0) {
                  var37_intLifetime1 = (int)(-var12.activityStartedMillis + var9);
                }
                var38_int = var37_intLifetime1 / 1000;
                var39 = var38_int / 60;
                var38_int = var38_int % 60;
                if (var39 >= 60) {
                  var40 = var39 / 60;
                  var39 = var39 % 60;
                  var12.field_Rb.text = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                } else {
                  var12.field_Rb.text = var39 + ":" + var38_int / 10 + var38_int % 10;
                }
              }
              var12.field_Rb.setBounds(jn.field_d, -20500, -365 + var12.width, var31, 365);
              var31 = var31 + jn.field_d;
              if (var12.playerNames != null) {
                var31 += 2;
                var37 = new StringBuilder(64);
                discarded$1 = var37.append(dh.field_i);
                discarded$2 = var37.append(var12.playerNames[0]);
                for (var38_intLifetime1 = 1; var12.playerCount > var38_intLifetime1; var38_intLifetime1++) {
                  discarded$3 = var37.append(", ");
                  discarded$4 = var37.append(var12.playerNames[var38_intLifetime1]);
                }
                var38 = var37.toString();
                var12.field_Pb.text = var38;
                var39Lifetime1 = var12.field_Pb.font.c(var38, var12.width - var12.field_Pb.textHorizontalPadding * 2);
                var12.field_Pb.setBounds(var39Lifetime1 * jn.field_d, -20500, var12.width, var31, 0);
                var31 = var31 + jn.field_d * var39Lifetime1;
              }
              if (var12.invitationReceived) {
                var12.field_Ib.text = fo.a(4800, sq.field_n, new String[]{var32});
                var12.field_Ib.setBounds(jn.field_d, -20500, -(2 * MusicPatchNode.field_l) + var12.width, var31, MusicPatchNode.field_l);
                var31 = var31 + jn.field_d;
              }
              if (var12.joinRequestSent) {
                var12.field_sc.text = fo.a(4800, GameplayController.field_A, new String[]{var32});
                var12.field_sc.setBounds(jn.field_d, -20500, var12.width - 2 * MusicPatchNode.field_l, var31, MusicPatchNode.field_l);
                var31 = var31 + jn.field_d;
              }
            }
            var33 = LeaderEscortCondition.a(var12.notificationCode, 6, var32);
            if (var33 != null) {
              var34_intLifetime1 = var12.field_Wb.font.c(var33, var12.width - MusicPatchNode.field_l - MusicPatchNode.field_l);
              var12.field_Wb.text = var33;
              var12.field_Wb.textOpacity = var12.notificationTicks * 256 / qd.lobbyNotificationDuration;
              var12.field_Wb.setBounds(jn.field_d * var34_intLifetime1, -20500, var12.width - MusicPatchNode.field_l * 2, var31, MusicPatchNode.field_l);
              var31 = var31 + var34_intLifetime1 * jn.field_d;
            }
            if (var7_int == 0) {
              var12.pendingHeightDelta = var31 - var12.height;
            }
            if (var13 != 0) {
              CipherPacketBuffer.field_x.content.positionAfter(var12, true, 2, (ClientUiComponent) (var11));
            }
            for (var34_intLifetime2 = 0; var34_intLifetime2 < tq.gameOptionCount; var34_intLifetime2++) {
              if (var12.optionIcons[var34_intLifetime2].heldButtonMatches) {
                if (wb.field_a == null) {
                  var35 = null;
                } else {
                  if (wb.field_a[var34_intLifetime2] != null) {
                    var35 = wb.field_a[var34_intLifetime2][255 & var12.gameOptions[var34_intLifetime2]];
                  } else {
                    var35 = null;
                  }
                }
                if (var35 != null) {
                  ad.field_I = ob.field_M[var34_intLifetime2] + " - " + (String) (var35);
                } else {
                  ad.field_I = ob.field_M[var34_intLifetime2];
                }
              }
            }
            if (var12.gameTypeIcon.heldButtonMatches) {
              if (1 == var12.gameType) {
                var34 = AiInfluenceMap.field_j;
              } else {
                var34 = ResourceRequest.field_u[var12.gameType];
              }
              ad.field_I = vu.field_P + " - " + var34;
            }
            if (var12.ratedIcon.heldButtonMatches) {
              if (var12.rated) {
                stackIn_156_0 = uu.field_a;
              } else {
                stackIn_156_0 = CampaignProgress.field_c;
              }
              ad.field_I = stackIn_156_0;
            }
            if (var12.field_ec.heldButtonMatches) {
              if (!var12.joinable &&
                !var12.invitationReceived) {
                if (var12.allowsAdmissionRequests) {
                  stackIn_166_0 = mv.field_e;
                } else {
                  stackIn_166_0 = SummonRequest.field_y;
                }
              } else {
                stackIn_166_0 = AttackEvent.field_K;
              }
              ad.field_I = stackIn_166_0;
            }
            if (var12.spectatorIcon.heldButtonMatches) {
              if (var12.spectatorMode != 2) {
                stackIn_171_0 = jj.field_d;
              } else {
                stackIn_171_0 = ak.field_e;
              }
              ad.field_I = stackIn_171_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var12.pressedButton != 0) {
              if (var12.isRemovedFromIndex(param0 ^ -7)) {
                var12 = (LobbyRoom) (var8.next((byte) 123));
                continue;
              }
              if (var12.field_Yb.pressedButton == 0) {
                TabbedPanel.a(-114, var12, param2, var32);
              } else {
                if (var12.playing && (!var12.allowsAdmissionRequests ||
                  !var12.joinable &&
                  !var12.invitationReceived)) {
                  ov.writeSpectateRoomRequest(param6, param0 + 3, var12.getRoomId((byte) 119));
                  decompiledFrameRemainder0 = false;
                }
                else {
                  CombatEvent.writeRoomAdmissionRequest(param6, -99, var12.getRoomId((byte) -97));
                }
              }
            }
            var12 = (LobbyRoom) (var8.next((byte) 123));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var7), "jg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void e(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        CipherPacketBuffer var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        iw var11 = null;
        b var12 = null;
        CipherPacketBuffer var13 = null;
        b var14 = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var13 = ByteStorage.incomingPacket;
          var2 = var13.readUnsignedByte(param0);
          if (var2 == 0) {
            var10 = ce.a(-80);
            var3 = var10;
            var9 = var10;
            var4 = var9;
            var5 = var13;
            var6 = ((PacketBuffer) ((Object) var5)).readUnsignedByte(0);
            for (var7 = 0; var7 < var6; var7++) {
              var9[var7] = ((PacketBuffer) ((Object) var5)).readInt(1);
            }
            var12 = (b) (ta.field_O.first((byte) 98));
            if (var12 == null) {
              dj.a((byte) -127);
              return;
            }
            var12.field_m = true;
            var12.field_l = var3;
            var12.unlink(param0 + 65);
            return;
          }
          if (var2 == 1) {
            var11 = (iw) (cg.field_c.first((byte) 104));
            if (var11 == null) {
              dj.a((byte) -126);
              return;
            }
            var11.unlink(41);
          } else {
            if (var2 == 2) {
              var14 = (b) (ta.field_O.first((byte) 125));
              if (var14 == null) {
                dj.a((byte) -125);
                return;
              }
              var14.field_l = ce.a(-120);
              var14.field_m = true;
              var14.unlink(param0 ^ 35);
            } else {
              af.a((Throwable) null, 78, "A1: " + CampaignProgress.b(false));
              dj.a((byte) -127);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "jg.A(" + param0 + ')');
        }
    }

    static {
        field_n = "Please enter your age in years";
    }
}
