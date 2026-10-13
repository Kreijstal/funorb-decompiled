/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VertexNormal {
    int x;
    static String field_a;
    static int field_c;
    static String field_h;
    int y;
    static BitmapTextWidgetPainter field_f;
    int z;
    int contributions;

    final static void a(int param0, int param1, boolean param2, int param3, ScrollContainer param4) {
        int var27_int = 0;
        ScrollContainer stackIn_40_0;
        boolean stackIn_40_1;
        int stackIn_40_2;
        int stackIn_40_3;
        boolean stackIn_41_4 = false;
        int stackIn_44_0 = 0;
        int stackIn_60_0 = 0;
        ClientUiComponent stackIn_96_0;
        int stackIn_96_1;
        int stackIn_96_2;
        int stackIn_96_3;
        int stackIn_97_4 = 0;
        RuntimeException stackIn_221_0 = null;
        StringBuilder stackIn_221_1 = null;
        String stackIn_222_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        NodeDeque var10 = null;
        int var11_int = 0;
        Object var11 = null;
        LobbyPlayer var12 = null;
        int var13 = 0;
        ClientUiComponent var14 = null;
        ClientUiComponent var15 = null;
        ClientUiComponent var16 = null;
        ClientUiComponent var17 = null;
        ClientUiComponent var18 = null;
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
        var31 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (ToggleWidget.currentRoom != null && (null != ep.field_p ||
            iv.field_e != null ||
            jv.field_d != null ||
            CombatPresentation.field_j != null)) {
            for (var9 = 0; var9 < tq.gameOptionCount; var9++) {
              var10_int = ToggleWidget.currentRoom.gameOptions[var9] & 255;
              if (null != ep.field_p &&
                null != ep.field_p[var9] &&
                ep.field_p[var9][var10_int]) {
                var5_int = 1;
              }
              if (null != iv.field_e &&
                null != iv.field_e[var9]) {
                var11_int = iv.field_e[var9][var10_int];
                if (var11_int > var6) {
                  var6 = var11_int;
                }
                if (var11_int != 0 &&
                  !bj.field_k) {
                  var5_int = 1;
                }
              }
              if (jv.field_d != null &&
                jv.field_d[var9] != null) {
                var11_intLifetime1 = jv.field_d[var9][var10_int];
                if (var11_intLifetime1 != 0 &&
                  !bj.field_k) {
                  var5_int = 1;
                }
                if (var11_intLifetime1 > var7) {
                  var7 = var11_intLifetime1;
                }
              }
              if (null != CombatPresentation.field_j &&
                null != CombatPresentation.field_j[var9]) {
                var8 = var8 | CombatPresentation.field_j[var9][var10_int];
              }
            }
          }
          stackIn_40_0 = (ScrollContainer) (param4);
          stackIn_40_1 = param2;
          stackIn_40_2 = param0 * (8 + jn.field_d * 4);
          stackIn_40_3 = jn.field_d * 2 + 4;
          stackIn_41_4 = (param4 == PointerInputHandler.contextMenuScrollContainer);
          stackIn_44_0 = (!((ScrollContainer) (Object) stackIn_40_0).updateContentLayout(stackIn_40_1, stackIn_40_2, stackIn_40_3, stackIn_41_4, 0, 2)) ? 0 : 1;
          var9Lifetime1 = stackIn_44_0;
          var10 = param4.content.children;
          var11 = null;
          if (param1 != 255) {
            return;
          }
          var12 = (LobbyPlayer) (var10.first((byte) 124));
          while (var12 != null) {
            var13 = 0;
            if (var12.children == null) {
              var12.nameComponent = new ClientUiComponent(0L, IsaacRandom.field_i);
              var12.addChild(var12.nameComponent, 106);
              var12.ratingComponent = new ClientUiComponent(0L, ws.field_P);
              if (fh.field_c) {
                var12.addChild(var12.ratingComponent, param1 ^ 157);
              }
              var12.ratingComponent.horizontalAlignment = 2;
              var12.field_fc = new ClientUiComponent(0L, eq.field_h);
              var12.addChild(var12.field_fc, 62);
              var12.inheritVisualStateForDescendants(-10027);
              var12.admissionButton = new ClientUiComponent(0L, QuickChatPhraseRepository.field_d);
              var12.addChild(var12.admissionButton, param1 - 194);
              var12.cancelRejectButton = new ClientUiComponent(0L, ContentTransitionDialog.field_X);
              var12.addChild(var12.cancelRejectButton, 90);
              var13 = 1;
            }
            var12.nameComponent.text = null;
            var14 = var12.nameComponent;
            var12.nameComponent.height = 0;
            var12.ratingComponent.text = null;
            var14.width = 0;
            var12.ratingComponent.height = 0;
            var15 = var12.ratingComponent;
            var15.width = 0;
            var12.admissionButton.text = null;
            var12.admissionButton.height = 0;
            var16 = var12.admissionButton;
            var16.width = 0;
            var12.cancelRejectButton.text = null;
            var12.cancelRejectButton.height = 0;
            var17 = var12.cancelRejectButton;
            var17.width = 0;
            var12.field_fc.text = null;
            var12.field_fc.height = 0;
            var18 = var12.field_fc;
            var18.width = 0;
            var12.width = param4.content.width;
            var19 = 0;
            var32 = var12.displayName;
            var21 = 72;
            if (MapTile.field_f == param4) {
              var21 += 42;
            }
            var33 = BitmapFont.truncateWithEllipsis(var12.nameComponent.font, var32, var21);
            var20 = var33;
            stackIn_60_0 = (var33.equals(var12.displayName)) ? 0 : 1;
            var22 = stackIn_60_0;
            if (var12.chatIconId < 4) {
              if (var12.chatIconId > 0) {
                var20 = "<img=" + (-1 + var12.chatIconId) + ">" + var33;
              }
            } else {
              var20 = "<img=" + (var12.chatIconId - (4 - PacketBuffer.field_n)) + ">" + var33;
            }
            var12.nameComponent.text = var20;
            if (!var12.isRemovedFromIndex(0)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.packedFlag0 ||
                (!(var6 <= var12.rating) ||
                !(var7 <= var12.ratedGamesPlayed) ||
                !((var8 & ~var12.optionUnlockMask) <= 0))) {
                var23_int = 8414771;
                var24_int = 8421504;
              }
              var12.nameComponent.selectedTextColour = var24_int;
              var12.nameComponent.heldPressTextColour = var24_int;
              var12.nameComponent.matchedButtonTextColour = var24_int;
              var12.admissionButton.textColour = var23_int;
              var12.ratingComponent.textColour = var23_int;
              var12.nameComponent.textColour = var23_int;
              var12.ratingComponent.selectedTextColour = var24_int;
              var12.ratingComponent.heldPressTextColour = var24_int;
              var12.ratingComponent.matchedButtonTextColour = var24_int;
              var12.admissionButton.selectedTextColour = var24_int;
              var12.admissionButton.heldPressTextColour = var24_int;
              var12.admissionButton.matchedButtonTextColour = var24_int;
              if (bu.field_a != param4) {
                if (var12.invitationSent) {
                  var12.nameComponent.text = EmailCheckResult.a(param1 ^ 4671, AiPlanningStrategy.field_g, new String[]{var20});
                  var12.cancelRejectButton.text = ac.field_s;
                } else {
                  if (var12.joinRequested) {
                    var12.nameComponent.text = EmailCheckResult.a(param1 + 4545, DeployEvent.field_G, new String[]{var20});
                    var12.admissionButton.text = LeaderEscortCondition.field_g;
                    var12.cancelRejectButton.text = SpellConfirmationDialog.field_l;
                  } else {
                    var12.admissionButton.text = bq.field_b;
                  }
                }
              } else {
                if (!ToggleWidget.currentRoom.playing) {
                  var12.cancelRejectButton.text = bq.field_a;
                }
              }
              var25_int = 0;
              if (null != ToggleWidget.currentRoom &&
                ToggleWidget.isCurrentRoomOwner(false) &&
                ChannelBaseVolumeConsoleCommand.localAccountId != var12.accountId) {
                if (null != var12.admissionButton.text) {
                  var26 = var12.admissionButton.getPreferredWidth(104) + MusicPatchNode.field_l * 2;
                  var12.admissionButton.setBounds(jn.field_d, -20500, var26, var19, var25_int);
                  var25_int = var25_int + var26;
                }
                if (var12.cancelRejectButton.text != null) {
                  if (bu.field_a != param4) {
                    var26Lifetime2 = var12.cancelRejectButton.getPreferredWidth(param1 - 328) + MusicPatchNode.field_l * 2;
                  } else {
                    var26Lifetime2 = 40;
                  }
                  var12.cancelRejectButton.setBounds(jn.field_d, param1 - 20755, var26Lifetime2, var19, var25_int);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_96_0 = var12.nameComponent;
              stackIn_96_1 = jn.field_d;
              stackIn_96_2 = -20500;
              stackIn_96_3 = -var25_int + var12.width;
              if (fh.field_c) {
                stackIn_97_4 = 42;
              } else {
                stackIn_97_4 = 0;
              }
              ((ClientUiComponent) (Object) stackIn_96_0).setBounds(stackIn_96_1, stackIn_96_2, stackIn_96_3 - stackIn_97_4, var19, var25_int);
              var12.ratingComponent.text = Integer.toString(var12.rating);
              var12.ratingComponent.setBounds(jn.field_d, -20500, 40, var19, var12.width - 40);
              if (var12.nameComponent.heldButtonMatches &&
                var22 != 0) {
                DialogMessagePane.field_I = var12.displayName;
                if (DeployRequest.field_v != null &&
                  DeployRequest.field_v[var12.chatIconId] != null) {
                  DialogMessagePane.field_I = DialogMessagePane.field_I + " - " + DeployRequest.field_v[var12.chatIconId];
                }
              } else {
                if (var12.nameComponent.heldButtonMatches &&
                  DeployRequest.field_v != null &&
                  null != DeployRequest.field_v[var12.chatIconId]) {
                  DialogMessagePane.field_I = DeployRequest.field_v[var12.chatIconId];
                }
              }
              var19 = var19 + jn.field_d;
            }
            var23 = s.a(false, var20, var12.notificationCode);
            var24 = var23;
            var30 = var24;
            var25 = var30;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_fc.font.getLineCount(var23, -MusicPatchNode.field_l + (var12.width - MusicPatchNode.field_l));
              var12.field_fc.textOpacity = var12.notificationTicks * 256 / RegistrationAgreementPane.lobbyNotificationDuration;
              var12.field_fc.text = var23;
              var12.field_fc.setBounds(var24_intLifetime1 * jn.field_d, -20500, var12.width - 2 * MusicPatchNode.field_l, var19, MusicPatchNode.field_l);
              var19 = var19 + jn.field_d * var24_intLifetime1;
            }
            if (var9Lifetime1 == 0) {
              var12.pendingHeightDelta = var19 - var12.height;
            }
            if (var13 != 0) {
              param4.content.positionAfter(var12, true, 2, (ClientUiComponent) (var11));
            }
            if (var12.pressedButton != 0 &&
              !var12.isRemovedFromIndex(0)) {
              if (var12.admissionButton.pressedButton != 0) {
                ActionSpell.writePlayerAdmissionRequest(var12.accountId, param3, 6);
              } else {
                if (0 == var12.cancelRejectButton.pressedButton) {
                  bk.a(false, 0, BattleTutorial.pointerPressX, 0, var12, param4, TeleportAction.pointerPressY);
                } else {
                  SoundPlaybackHandle.writePlayerAdmissionCancellation(param3, var12.accountId, (byte) 97);
                }
              }
            }
            var11 = var12;
            if (var12.hovered) {
              if (var12.isRemovedFromIndex(0)) {
                var12 = (LobbyPlayer) (var10.next((byte) 123));
                continue;
              }
              var24Lifetime2 = null;
              if (ChannelBaseVolumeConsoleCommand.localAccountId != var12.accountId) {
                if (var5_int != 0 &&
                  !var12.packedFlag0) {
                  var24Lifetime2 = EmailCheckResult.a(param1 + 4545, TickCounter.field_b, new String[]{var20});
                  var30Lifetime1 = var24Lifetime2;
                  var25 = var30Lifetime1;
                  var24Lifetime2 = var25;
                  var30Lifetime1Lifetime1 = var24Lifetime2;
                  var25 = var30Lifetime1Lifetime1;
                } else {
                  if (var7 <= var12.ratedGamesPlayed) {
                    if (var6 <= var12.rating) {
                      if ((~var12.optionUnlockMask & var8) != 0) {
                        var25_int = fd.a(true, ~var12.optionUnlockMask & var8);
                        var24Lifetime2 = EmailCheckResult.a(4800, h.field_f, new String[]{var20});
                        if (0 < var25_int &&
                          jl.field_c != null &&
                          jl.field_c.length >= var25_int &&
                          jl.field_c[var25_int - 1] != null) {
                          var24Lifetime2 = EmailCheckResult.a(4800, jl.field_c[-1 + var25_int][2], new String[]{var20});
                        }
                      }
                    } else {
                      var24Lifetime2 = EmailCheckResult.a(4800, bk.field_g, new String[]{var20, Integer.toString(var6)});
                    }
                  } else {
                    var25_int = -var12.ratedGamesPlayed + var7;
                    if (var25_int == 1) {
                      var24Lifetime2 = EmailCheckResult.a(4800, BattlefieldTheme.field_r, new String[]{var20});
                    }
                    var24Lifetime2 = EmailCheckResult.a(4800, AccountNamePrompt.field_Ib, new String[]{var20, Integer.toString(var25_int)});
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.packedFlag0) {
                  var24Lifetime2 = is.field_a;
                } else {
                  if (var7 > var12.ratedGamesPlayed) {
                    var25_int = -var12.ratedGamesPlayed + var7;
                    if (var25_int == 1) {
                      var24Lifetime2 = tn.field_Y;
                    }
                    var24Lifetime2 = EmailCheckResult.a(4800, GlobalSpell.field_j, new String[]{null, Integer.toString(var25_int)});
                  } else {
                    if (var6 <= var12.rating) {
                      if (0 != (var8 & ~var12.optionUnlockMask)) {
                        var25_int = fd.a(true, ~var12.optionUnlockMask & var8);
                        var24Lifetime2 = EventPresenter.field_l;
                        if (var25_int > 0 &&
                          null != jl.field_c &&
                          jl.field_c.length >= var25_int &&
                          jl.field_c[var25_int - 1] != null) {
                          var24Lifetime2 = jl.field_c[-1 + var25_int][1];
                        }
                      }
                    } else {
                      var24Lifetime2 = EmailCheckResult.a(4800, vi.field_b, new String[]{null, Integer.toString(var6)});
                    }
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
                for (var27_int = 0; var27_int < tq.gameOptionCount; var27_int++) {
                  var28 = ToggleWidget.currentRoom.gameOptions[var27_int] & 255;
                  var29 = 0;
                  if (ep.field_p != null &&
                    ep.field_p[var27_int] != null &&
                    ep.field_p[var27_int][var28] &&
                    !var12.packedFlag0) {
                    var29 = 1;
                  }
                  if (null != iv.field_e &&
                    null != iv.field_e[var27_int]) {
                    var30_int = iv.field_e[var27_int][var28];
                    if (var30_int != 0 &&
                      !bj.field_k &&
                      !var12.packedFlag0) {
                      var29 = 1;
                    }
                    if (var12.rating < var30_int) {
                      var29 = 1;
                    }
                  }
                  if (jv.field_d != null &&
                    null != jv.field_d[var27_int]) {
                    var30_intLifetime1 = jv.field_d[var27_int][var28];
                    if (var30_intLifetime1 != 0 &&
                      !bj.field_k &&
                      !var12.packedFlag0) {
                      var29 = 1;
                    }
                    if (var12.ratedGamesPlayed < var30_intLifetime1) {
                      var29 = 1;
                    }
                  }
                  if (CombatPresentation.field_j != null &&
                    null != CombatPresentation.field_j[var27_int] &&
                    (~var12.optionUnlockMask & CombatPresentation.field_j[var27_int][var28]) != 0) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + GridWidgetContainer.field_M[var27_int] + "</col>";
                    var25 = var30_refLifetime2;
                    var24Lifetime2 = var25;
                    var25 = var30_refLifetime2;
                    if (var25 != null) {
                      var25 = (String) (var25) + ", " + var30_refLifetime2;
                      var24Lifetime2 = var25;
                      var24Lifetime2 = var25;
                      var26Lifetime1 = 1;
                    } else {
                      var25 = var30_refLifetime2;
                    }
                  }
                }
                if (param4 == bu.field_a &&
                  ToggleWidget.isCurrentRoomOwner(false)) {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var34 + "<br>" + IterableDualNodeDeque.field_d + (String) (var25);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + EmailCheckResult.a(4800, DualNodeHashTable.field_c, new String[]{(String) (var25)});
                  }
                } else {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var34 + "<br>" + EmailCheckResult.a(4800, BufferedFile.field_e, new String[]{(String) (var25)});
                  } else {
                    var24Lifetime2 = var34 + "<br>" + MusicCrossfadeStream.field_u + (String) (var25);
                  }
                }
                if (param4 == bu.field_a &&
                  !ToggleWidget.isCurrentRoomOwner(false)) {
                  var27 = ToggleWidget.currentRoom.ownerName;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + EmailCheckResult.a(param1 ^ 4671, DirectByteStorage.field_l, new String[]{var27});
                }
                DialogMessagePane.field_I = (String) (var24Lifetime2);
              }
            }
            var12 = (LobbyPlayer) (var10.next((byte) 123));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_221_0 = var5;
          stackIn_221_1 = new StringBuilder().append("wi.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_222_2 = "null";
          } else {
            stackIn_222_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_221_0), ((StringBuilder) (Object) stackIn_221_1).append(stackIn_222_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        if (param0 != -14691) {
          return;
        }
        field_f = null;
    }

    static {
        field_a = "Gielinor! A new world, rich in powerful magic. The gods seek to dominate this new realm, but only you can determine its fate.";
        field_h = "Equip";
    }
}
