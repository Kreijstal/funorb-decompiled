/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientContextMenu {
    private long accountId;
    static String field_j;
    private String displayName;
    static ClientUiComponent field_n;
    private int[] quickChatContext;
    ClientUiComponent sourceComponent;
    String accountName;
    static byte[] field_d;
    static String field_l;
    ContextActionMenu menu;
    static int field_k;
    static int field_a;
    int roomId;
    static IndexedSprite[] field_b;
    private int chatChannel;

    private final boolean dispatchAdmissionAction(int actionId, byte obfuscationGuard, int packetOpcode) {
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (actionId != 0) {
          if (actionId != 1) {
            if (actionId == 2) {
              CombatEvent.writeRoomAdmissionRequest(packetOpcode, -48, this.roomId);
            } else {
              if (actionId == 3) {
                PointerInputHandler.writeRoomAdmissionCancellation(-119, this.roomId, packetOpcode);
              } else {
                if (actionId == 10) {
                  ov.writeSpectateRoomRequest(packetOpcode, 3, this.roomId);
                } else {
                  if (actionId == 15) {
                    bw.writeWatchedRoomRequest(packetOpcode, this.roomId, (byte) -116);
                  } else {
                    if (actionId != 16) {
                      return false;
                    }
                    bw.writeWatchedRoomRequest(packetOpcode, 0, (byte) -116);
                  }
                }
              }
            }
          } else {
            SoundPlaybackHandle.writePlayerAdmissionCancellation(packetOpcode, this.accountId, (byte) 108);
          }
        } else {
          ActionSpell.writePlayerAdmissionRequest(this.accountId, packetOpcode, 6);
        }
        if (obfuscationGuard == 101) {
          return true;
        }
        this.accountId = -51L;
        return true;
    }

    private final boolean dispatchSocialAction(int socialPacketOpcode, boolean obfuscationGuard, int actionId) {
        Object var4;
        String var4_ref;
        String var5;
        String var6;
        String var7;
        String var8;
        String var9;
        var4 = null;
        if (obfuscationGuard) {
          this.addReportAction((byte) 101);
          if (actionId != 4) {
            if (actionId != 5) {
              if (actionId != 6) {
                if (actionId != 7) {
                  return false;
                }
                var5 = MusicPatchEnvelope.requestRemoveIgnoredAccount(socialPacketOpcode, this.displayName, false, this.accountName);
                if (var5 == null) {
                  return true;
                }
                LabeledWidgetContainer.appendSystemChatMessage((String) null, 2, -18119, this.accountName, var5, 0);
                return true;
              }
              var4_ref = se.requestAddIgnoredAccount(this.accountName, socialPacketOpcode, -127);
            } else {
              var4_ref = DamageEvent.requestRemoveFriend(this.accountName, (byte) -27, socialPacketOpcode);
            }
          } else {
            var4_ref = op.requestAddFriend(20, this.accountName, socialPacketOpcode);
          }
          if (var4_ref == null) {
            return true;
          }
          LabeledWidgetContainer.appendSystemChatMessage((String) null, 2, -18119, this.accountName, var4_ref, 0);
          return true;
        }
        if (actionId == 4) {
          var6 = op.requestAddFriend(20, this.accountName, socialPacketOpcode);
          if (var6 == null) {
            return true;
          }
          LabeledWidgetContainer.appendSystemChatMessage((String) null, 2, -18119, this.accountName, var6, 0);
          return true;
        }
        if (actionId == 5) {
          var7 = DamageEvent.requestRemoveFriend(this.accountName, (byte) -27, socialPacketOpcode);
          if (var7 == null) {
            return true;
          }
          LabeledWidgetContainer.appendSystemChatMessage((String) null, 2, -18119, this.accountName, var7, 0);
          return true;
        }
        if (actionId == 6) {
          var9 = se.requestAddIgnoredAccount(this.accountName, socialPacketOpcode, -127);
          if (var9 == null) {
            return true;
          }
          LabeledWidgetContainer.appendSystemChatMessage((String) null, 2, -18119, this.accountName, var9, 0);
          return true;
        }
        if (actionId != 7) {
          return false;
        }
        var8 = MusicPatchEnvelope.requestRemoveIgnoredAccount(socialPacketOpcode, this.displayName, false, this.accountName);
        if (var8 == null) {
          return true;
        }
        LabeledWidgetContainer.appendSystemChatMessage((String) null, 2, -18119, this.accountName, var8, 0);
        return true;
    }

    final boolean pollAndDispatch(int packetOpcode, byte obfuscationGuard, int socialPacketOpcode, int reportPacketOpcode, boolean enableCapture) {
        if (obfuscationGuard <= 60) {
          return true;
        }
        int var6 = this.menu.pollAction((byte) 116, enableCapture);
        if (var6 == -2) {
          return false;
        }
        boolean discarded$0 = this.dispatchAdmissionAction(var6, (byte) 101, packetOpcode);
        boolean discarded$1 = this.dispatchSocialAction(socialPacketOpcode, false, var6);
        boolean discarded$2 = this.dispatchChatAction(var6, socialPacketOpcode, (byte) -81);
        boolean discarded$3 = this.dispatchReportAction(var6, (byte) 113, reportPacketOpcode);
        return true;
    }

    final void addChatFilterActions(ChatMessage message, int currentChannel) {
        if (message.systemMessage) {
          return;
        }
        try {
          this.chatChannel = message.channelId;
          if (currentChannel == message.channelId) {
            if (MaskedTextEntryPainter.field_B == 0) {
              this.menu.addTextAction(12, ValidationStatusWidget.field_S, (byte) -110);
            }
            this.menu.addTextAction(13, MapRepository.field_g, (byte) -116);
          }
          if (message.channelId == 1) {
            if (QuickChatCategory.field_D == 0) {
              this.menu.addTextAction(12, jj.field_b, (byte) -108);
            }
            this.menu.addTextAction(13, fa.field_c, (byte) -121);
          }
          if (message.channelId == 2) {
            if (cd.field_c == 0) {
              this.menu.addTextAction(12, SummonRequest.field_C, (byte) -120);
            }
            this.menu.addTextAction(13, ScrollWidgetContainer.field_R, (byte) -119);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "tg.A(" + (message != null ? "{...}" : "null") + ',' + currentChannel + ')');
        }
    }

    final static void a(ResourceArchive param0, int param1, boolean param2, ResourceArchive param3) {
        try {
          bk.a(param2, IconLabelControl.field_Lb, eq.field_h, LeaderEscortCondition.field_f, DualLinkedNode.field_k, -106, ke.field_e, ClientUiNode.field_x, qc.field_e, WeightedLruCache.field_b, PreparedAction.field_o, rd.field_e);
          dh.field_n = fk.loadRgbSpritesByName("chatfilter", (byte) -125, param3, "lobby");
          BattlefieldTheme.field_k[0] = QuickChatPhrase.field_v;
          BattlefieldTheme.field_k[1] = IterableDualNodeDeque.field_a;
          BattlefieldTheme.field_k[param1] = cd.field_d;
          mu.a(t.field_a, param1 - 2, param0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "tg.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 <= -15) {
          field_b = null;
          field_j = null;
          field_n = null;
          field_d = null;
          field_l = null;
          return;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        ClientContextMenu.a((ResourceArchive) null, 28, false, (ResourceArchive) null);
        field_b = null;
        field_j = null;
        field_n = null;
        field_d = null;
        field_l = null;
    }

    final void addPlayerAdmissionActions(int obfuscationGuard, boolean includeJoinRequests) {
        LobbyPlayer var4;
        String var5;
        int var6;
        LobbyPlayer var7;
        LobbyPlayer var10;
        LobbyPlayer var11;
        LobbyPlayer var4Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != 23899) {
          this.chatChannel = 127;
          if (this.accountName == null) {
            return;
          }
          if (this.accountId == ChannelBaseVolumeConsoleCommand.localAccountId) {
            return;
          }
          if (null == ToggleWidget.currentRoom) {
            return;
          }
          if (!ToggleWidget.isCurrentRoomOwner(false)) {
            return;
          }
          var11 = DeployEvent.getLobbyPlayer((byte) 121, this.accountId);
          var4 = UnitModelPreview.getCurrentRoomPlayer(this.accountId, -86);
          var5 = this.getTargetDisplayName(obfuscationGuard - 24004);
          if (var4 != null) {
            if (ToggleWidget.currentRoom.playing &&
              ToggleWidget.currentRoom.completedDurationMillis < 0) {
              return;
            }
            this.menu.addTextAction(1, EmailCheckResult.a(4800, DraggableWidgetContainer.field_R, new String[]{var5}), (byte) -103);
            return;
          }
          if (var11 == null) {
            return;
          }
          if (!ToggleWidget.currentRoom.allowsAdmissionRequests) {
            return;
          }
          if (ToggleWidget.currentRoom.playerCapacity <= ToggleWidget.currentRoom.playerCount) {
            return;
          }
          if (var11.invitationSent) {
            this.menu.addTextAction(1, EmailCheckResult.a(4800, AccountRegistrationDialog.field_zb, new String[]{var5}), (byte) -124);
          } else {
            if (!includeJoinRequests) {
              this.menu.addTextAction(0, EmailCheckResult.a(4800, ValidationStatusWidget.field_W, new String[]{var5}), (byte) -118);
            } else {
              if (!var11.joinRequested) {
                this.menu.addTextAction(0, EmailCheckResult.a(4800, ValidationStatusWidget.field_W, new String[]{var5}), (byte) -118);
              } else {
                this.menu.addTextAction(0, EmailCheckResult.a(4800, ac.field_x, new String[]{var5}), (byte) -126);
                this.menu.addTextAction(1, EmailCheckResult.a(obfuscationGuard - 19099, vq.field_g, new String[]{var5}), (byte) -113);
              }
            }
          }
          return;
        }
        if (this.accountName == null) {
          return;
        }
        if (this.accountId == ChannelBaseVolumeConsoleCommand.localAccountId) {
          return;
        }
        if (null == ToggleWidget.currentRoom) {
          return;
        }
        if (!ToggleWidget.isCurrentRoomOwner(false)) {
          return;
        }
        var10 = DeployEvent.getLobbyPlayer((byte) 121, this.accountId);
        var7 = var10;
        var4Lifetime1 = UnitModelPreview.getCurrentRoomPlayer(this.accountId, -86);
        var5 = this.getTargetDisplayName(obfuscationGuard - 24004);
        if (var4Lifetime1 != null) {
          if (ToggleWidget.currentRoom.playing &&
            ToggleWidget.currentRoom.completedDurationMillis < 0) {
            return;
          }
          this.menu.addTextAction(1, EmailCheckResult.a(4800, DraggableWidgetContainer.field_R, new String[]{var5}), (byte) -103);
          return;
        }
        if (var10 == null) {
          return;
        }
        if (!ToggleWidget.currentRoom.allowsAdmissionRequests) {
          return;
        }
        if (ToggleWidget.currentRoom.playerCapacity <= ToggleWidget.currentRoom.playerCount) {
          return;
        }
        if (var10.invitationSent) {
          this.menu.addTextAction(1, EmailCheckResult.a(4800, AccountRegistrationDialog.field_zb, new String[]{var5}), (byte) -124);
        } else {
          if (!includeJoinRequests) {
            this.menu.addTextAction(0, EmailCheckResult.a(4800, ValidationStatusWidget.field_W, new String[]{var5}), (byte) -118);
          } else {
            if (!var10.joinRequested) {
              this.menu.addTextAction(0, EmailCheckResult.a(4800, ValidationStatusWidget.field_W, new String[]{var5}), (byte) -118);
            } else {
              this.menu.addTextAction(0, EmailCheckResult.a(4800, ac.field_x, new String[]{var5}), (byte) -126);
              this.menu.addTextAction(1, EmailCheckResult.a(obfuscationGuard - 19099, vq.field_g, new String[]{var5}), (byte) -113);
            }
          }
        }
        return;
    }

    final void addRoomAdmissionActions(byte obfuscationGuard) {
        boolean discarded$0 = false;
        String var3;
        int var4;
        LobbyRoom var5;
        LobbyRoom var6;
        LobbyRoom var7;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard > 46) {
          if (ToggleWidget.currentRoom != null) {
            return;
          }
          var6 = DebugConsole.getLobbyRoom((byte) 74, this.roomId);
          var5 = var6;
          if (var6 == null) {
            return;
          }
          var3 = var6.ownerName;
          if (var6.invitationReceived) {
            this.menu.addTextAction(2, EmailCheckResult.a(4800, ByteStorage.field_b, new String[]{var3}), (byte) -108);
            this.menu.addTextAction(3, EmailCheckResult.a(4800, or.field_a, new String[]{var3}), (byte) -120);
            return;
          }
          if (var6.joinable) {
            this.menu.addTextAction(2, EmailCheckResult.a(4800, ev.field_e, new String[]{var3}), (byte) -114);
            if (var6.joinRequestSent) {
              this.menu.addTextAction(3, EmailCheckResult.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
            }
            return;
          }
          if (!var6.joinRequestSent &&
            var6.allowsAdmissionRequests) {
            if (!var6.playing) {
              this.menu.addTextAction(2, EmailCheckResult.a(4800, CampaignResult.field_d, new String[]{var3}), (byte) -123);
              if (var6.joinRequestSent) {
                this.menu.addTextAction(3, EmailCheckResult.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
              }
              return;
            }
            if (!var6.joinable) {
              if (var6.joinRequestSent) {
                this.menu.addTextAction(3, EmailCheckResult.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
              }
              return;
            }
            this.menu.addTextAction(2, EmailCheckResult.a(4800, CampaignResult.field_d, new String[]{var3}), (byte) -123);
          }
          if (!var6.joinRequestSent) {
            return;
          }
          this.menu.addTextAction(3, EmailCheckResult.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
          return;
        }
        discarded$0 = this.dispatchChatAction(107, -75, (byte) 100);
        if (ToggleWidget.currentRoom != null) {
          return;
        }
        var7 = DebugConsole.getLobbyRoom((byte) 74, this.roomId);
        if (var7 == null) {
          return;
        }
        var3 = var7.ownerName;
        if (var7.invitationReceived) {
          this.menu.addTextAction(2, EmailCheckResult.a(4800, ByteStorage.field_b, new String[]{var3}), (byte) -108);
          this.menu.addTextAction(3, EmailCheckResult.a(4800, or.field_a, new String[]{var3}), (byte) -120);
          return;
        }
        if (var7.joinable) {
          this.menu.addTextAction(2, EmailCheckResult.a(4800, ev.field_e, new String[]{var3}), (byte) -114);
        } else {
          if (!var7.joinRequestSent &&
            var7.allowsAdmissionRequests) {
            if (!var7.playing) {
              this.menu.addTextAction(2, EmailCheckResult.a(4800, CampaignResult.field_d, new String[]{var3}), (byte) -123);
            } else {
              if (var7.joinable) {
                this.menu.addTextAction(2, EmailCheckResult.a(4800, CampaignResult.field_d, new String[]{var3}), (byte) -123);
              }
            }
          }
        }
        if (!var7.joinRequestSent) {
          return;
        }
        this.menu.addTextAction(3, EmailCheckResult.a(4800, eq.field_j, new String[]{var3}), (byte) -119);
        return;
    }

    private final boolean dispatchChatAction(int actionId, int filterContext, byte obfuscationGuard) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var4Lifetime6;
        int var4Lifetime7;
        if (actionId == 8) {
          ModalDialogHost.openPrivateTextChat(-23503, this.accountName, this.accountId);
          var4 = 84 % ((obfuscationGuard - 30) / 54);
          return true;
        }
        if (18 == actionId) {
          ConsoleExpression.openPrivateQuickChat(this.accountId, 1, this.accountName);
          var4Lifetime1 = 84 % ((obfuscationGuard - 30) / 54);
          return true;
        }
        if (actionId == 11) {
          ud.setChatFilter(0, false, this.chatChannel, filterContext);
          var4Lifetime2 = 84 % ((obfuscationGuard - 30) / 54);
          return true;
        }
        if (actionId == 12) {
          ud.setChatFilter(1, false, this.chatChannel, filterContext);
          var4Lifetime3 = 84 % ((obfuscationGuard - 30) / 54);
          return true;
        }
        if (13 == actionId) {
          ud.setChatFilter(2, false, this.chatChannel, filterContext);
          var4Lifetime4 = 84 % ((obfuscationGuard - 30) / 54);
          return true;
        }
        if (14 == actionId) {
          la.openPublicTextChat(-26887);
          var4Lifetime5 = 84 % ((obfuscationGuard - 30) / 54);
          return true;
        }
        if (actionId == 20) {
          ContextActionMenu.openPublicQuickChat(110);
          var4Lifetime6 = 84 % ((obfuscationGuard - 30) / 54);
          return true;
        }
        if (actionId == 19) {
          QuickChatCommandDefinition.openQuickChatResponses(81, this.accountName, this.quickChatContext, this.accountId, this.chatChannel);
          var4Lifetime7 = 84 % ((obfuscationGuard - 30) / 54);
          return true;
        }
        return false;
    }

    private final String getTargetDisplayName(int obfuscationGuard) {
        String targetName = null;
        if (this.displayName == null) {
          targetName = this.accountName;
        } else {
          targetName = this.displayName;
        }
        int guardQuotient = -2 / ((obfuscationGuard + 19) / 43);
        return targetName;
    }

    private final boolean dispatchReportAction(int actionId, byte obfuscationGuard, int reportPacketOpcode) {
        if (obfuscationGuard <= 38) {
          ClientContextMenu.a(-18);
          if (actionId == 17) {
            Spell.field_b = new ReportAbuseDialog(this.sourceComponent.screenX, this.sourceComponent.screenY, this.sourceComponent.width, this.sourceComponent.height, reportPacketOpcode, ArchiveIndex.field_b, UnitModelPreview.field_m, uc.field_b, eq.field_h, ArrayWidgetContainer.field_H, DualLinkedNode.field_k, this.accountName, this.accountId);
            return true;
          }
          return false;
        }
        if (actionId == 17) {
          Spell.field_b = new ReportAbuseDialog(this.sourceComponent.screenX, this.sourceComponent.screenY, this.sourceComponent.width, this.sourceComponent.height, reportPacketOpcode, ArchiveIndex.field_b, UnitModelPreview.field_m, uc.field_b, eq.field_h, ArrayWidgetContainer.field_H, DualLinkedNode.field_k, this.accountName, this.accountId);
          return true;
        }
        return false;
    }

    final void draw(byte obfuscationGuard, boolean blinkOn) {
        if (obfuscationGuard != -108) {
          ClientContextMenu.a(-128);
          this.menu.draw(blinkOn, 20);
          return;
        }
        this.menu.draw(blinkOn, 20);
    }

    final boolean isWaitingForAction(byte obfuscationGuard) {
        if (obfuscationGuard >= -107) {
          field_b = (IndexedSprite[]) null;
          if (null == this.menu) {
            return false;
          }
          if (this.menu.isWaitingForAction((byte) 86)) {
            return true;
          }
          return false;
        }
        if (null == this.menu) {
          return false;
        }
        if (this.menu.isWaitingForAction((byte) 86)) {
          return true;
        }
        return false;
    }

    final void addSocialActions(int[] quickChatContext, int obfuscationGuard, int chatChannel) {
        String discarded$0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        SocialListEntry var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          if (null != this.accountName && (this.accountId != ChannelBaseVolumeConsoleCommand.localAccountId ||
            2 == chatChannel) && 2 == th.socialListState) {
            var7 = this.getTargetDisplayName(-97);
            var4 = var7;
            var5 = lg.findFriend(this.accountName, (byte) -34);
            var6 = IndexedSpriteBase.isIgnoredAccount(this.accountName, -3404) ? 1 : 0;
            if (var5 == null &&
              var6 == 0) {
              this.menu.addTextAction(4, EmailCheckResult.a(4800, vf.field_l, new String[]{var7}), (byte) -125);
              this.menu.addTextAction(6, EmailCheckResult.a(4800, sq.field_o, new String[]{var7}), (byte) -100);
              if (quickChatContext != null &&
                chatChannel != 2 &&
                !NodeIterator.field_a) {
                this.quickChatContext = quickChatContext;
                this.menu.addTextAction(19, EmailCheckResult.a(4800, EmailConfirmationValidator.field_m, new String[]{var7}), (byte) -115);
              }
            }
            if (var5 != null) {
              if (!fs.isActivePrivateTextRecipient((byte) 111, this.accountName) &&
                !NodeIterator.field_a) {
                if (!vi.field_d) {
                  this.menu.addTextAction(8, EmailCheckResult.a(4800, MusicPatchNode.field_k, new String[]{var7}), (byte) -114);
                }
                this.menu.addTextAction(18, EmailCheckResult.a(obfuscationGuard ^ 4807, DeployRequest.field_w, new String[]{var7}), (byte) -111);
                if (quickChatContext != null) {
                  this.quickChatContext = quickChatContext;
                  this.menu.addTextAction(19, EmailCheckResult.a(4800, EmailConfirmationValidator.field_m, new String[]{var7}), (byte) -115);
                }
              }
              this.menu.addTextAction(5, EmailCheckResult.a(4800, AccountNameSelectionForm.field_K, new String[]{var7}), (byte) -111);
            }
            if (var6 != 0) {
              this.menu.addTextAction(7, EmailCheckResult.a(4800, ToggleTurnSkipConsoleCommand.field_E, new String[]{var7}), (byte) -102);
            }
          }
          if (obfuscationGuard != 7) {
            discarded$0 = this.getTargetDisplayName(-101);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("tg.D(");
          if (quickChatContext == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(obfuscationGuard).append(',').append(chatChannel).append(')').toString());
        }
    }

    final void addReportAction(byte obfuscationGuard) {
        String var3 = null;
        if (null != this.accountName &&
          ~this.accountId != ~ChannelBaseVolumeConsoleCommand.localAccountId) {
          var3 = this.getTargetDisplayName(96);
          String var2 = var3;
          this.menu.addTextAction(17, EmailCheckResult.a(4800, IterableDualNodeDeque.field_e, new String[]{var3}), (byte) -127);
        }
        if (obfuscationGuard >= 42) {
          return;
        }
        field_l = (String) null;
    }

    ClientContextMenu(ClientUiComponent sourceComponent, long accountId, String accountName, String displayName, int roomId, int chatChannel, int[] quickChatContext) {
        try {
          this.menu = new ContextActionMenu(AnimationSequence.field_h);
          this.quickChatContext = quickChatContext;
          this.roomId = roomId;
          this.accountId = accountId;
          this.displayName = displayName;
          this.sourceComponent = sourceComponent;
          this.accountName = accountName;
          this.chatChannel = chatChannel;
          sourceComponent.selected = true;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "tg.<init>(" + (sourceComponent != null ? "{...}" : "null") + ',' + accountId + ',' + (accountName != null ? "{...}" : "null") + ',' + (displayName != null ? "{...}" : "null") + ',' + roomId + ',' + chatChannel + ',' + (quickChatContext != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Members";
        field_l = "Most buildings";
        field_k = 1;
    }
}
