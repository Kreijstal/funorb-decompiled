/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerContextMenu {
    int field_c;
    ContextMenu field_j;
    static String field_k;
    private int[] field_g;
    private String field_i;
    static ValidationState field_a;
    UiComponent field_h;
    private int field_f;
    private long field_e;
    String field_b;
    static int field_d;

    final boolean isMenuOpen(int param0) {
        if (param0 != -1) {
          return true;
        }
        if (this.field_j == null) {
          return false;
        }
        if (this.field_j.handleEscape((byte) -87)) {
          return true;
        }
        return false;
    }

    private final boolean openReportPrompt(int param0, int param1, int param2) {
        if (param2 == 17) {
          PasswordValidator.field_y = new ReportAbuseDialog(this.field_h.field_eb, this.field_h.field_z, this.field_h.field_Hb, this.field_h.field_R, param0, RandomAccessCacheFile.field_h, UiComponent.field_gb, ErrorPrintHelpers.field_c, TextLayoutLine.field_i, GrowableIntList.field_c, NotificationToast.field_n, this.field_b, this.field_e);
          return true;
        }
        if (param1 == -20991) {
          return false;
        }
        return false;
    }

    private final String getDisplayName(int param0) {
        String var2 = null;
        String var2Lifetime1;
        if (param0 == 2) {
          if (null == this.field_i) {
            var2 = this.field_b;
          } else {
            var2 = this.field_i;
          }
          return var2;
        }
        field_a = (ValidationState) null;
        if (null == this.field_i) {
          var2Lifetime1 = this.field_b;
        } else {
          var2Lifetime1 = this.field_i;
        }
        return var2Lifetime1;
    }

    private final boolean handleSecondaryAction(int param0, int param1, int param2) {
        int var5;
        var5 = TetraLink.field_J;
        if (param2 == 8) {
          AnimationSequence.openPrivateChatTo(false, this.field_b, this.field_e);
        } else {
          if (param2 == 18) {
            LoginProgressHelpers.openPrivateTextChat(-127, this.field_b, this.field_e);
          } else {
            if (param2 == 11) {
              PendingListRequest.updateChatFilterSetting(this.field_f, param1, 0, 99);
            } else {
              if (param2 == 12) {
                PendingListRequest.updateChatFilterSetting(this.field_f, param1, 1, 113);
              } else {
                if (param2 == 13) {
                  PendingListRequest.updateChatFilterSetting(this.field_f, param1, 2, 99);
                } else {
                  if (param2 == 14) {
                    GameSession.resetChatMode(-4210768);
                  } else {
                    if (20 == param2) {
                      GameBoard.switchToPublicChat(-20715);
                    } else {
                      if (19 != param2) {
                        return false;
                      }
                      AccountServerResult.openPrivateQuickChat(this.field_e, this.field_b, this.field_g, 60, this.field_f);
                    }
                  }
                }
              }
            }
          }
        }
        if (param0 != -15) {
          return false;
        }
        return true;
    }

    final void addReportAbuseAction(boolean param0) {
        String var3 = null;
        if (null != this.field_b &&
          ~this.field_e != ~IsaacCipher.field_c) {
          var3 = this.getDisplayName(2);
          String var2 = var3;
          this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var3}, IntKeyLookup.field_a, 125), 1, 17);
        }
        if (param0) {
          return;
        }
        this.field_j = (ContextMenu) null;
    }

    private final boolean handleSocialAction(int param0, int param1, int param2) {
        String var4_ref = null;
        String var6 = null;
        int var5 = 0;
        Object var4 = null;
        String var4_refLifetime1;
        String var6Lifetime1;
        String var4_refLifetime2;
        String var4_refLifetime3;
        String var6Lifetime2;
        String var6Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        if (4 != param2) {
          if (5 == param2) {
            var4_ref = AnimationPlayer.requestRemoveFriend(false, this.field_b, param1);
            if (var4_ref != null) {
              var6 = (String) null;
              AccountCreationDialog.addChatMessage(0, 0, this.field_b, 2, var4_ref, (String) null);
              var5 = -112 % ((11 - param0) / 54);
              return true;
            }
            var5 = -112 % ((11 - param0) / 54);
            return true;
          }
          if (param2 == 6) {
            var4_refLifetime2 = WhirlpoolHasher.requestAddIgnore(param1, this.field_b, 2);
            if (var4_refLifetime2 != null) {
              var6Lifetime2 = (String) null;
              AccountCreationDialog.addChatMessage(0, 0, this.field_b, 2, var4_refLifetime2, (String) null);
              var5Lifetime3 = -112 % ((11 - param0) / 54);
              return true;
            }
            var5Lifetime3 = -112 % ((11 - param0) / 54);
            return true;
          }
          if (param2 != 7) {
            return false;
          }
          var4_refLifetime3 = ContextMenu.requestRemoveIgnore(this.field_b, param1, 2, this.field_i);
          if (var4_refLifetime3 == null) {
            var5Lifetime4 = -112 % ((11 - param0) / 54);
            return true;
          }
          var6Lifetime3 = (String) null;
          AccountCreationDialog.addChatMessage(0, 0, this.field_b, 2, var4_refLifetime3, (String) null);
          var5Lifetime5 = -112 % ((11 - param0) / 54);
          return true;
        }
        var4_refLifetime1 = ReflectionCheckHelpers.requestAddIgnore((byte) 122, this.field_b, param1);
        if (var4_refLifetime1 == null) {
          var5Lifetime1 = -112 % ((11 - param0) / 54);
          return true;
        }
        var6Lifetime1 = (String) null;
        AccountCreationDialog.addChatMessage(0, 0, this.field_b, 2, var4_refLifetime1, (String) null);
        var5Lifetime2 = -112 % ((11 - param0) / 54);
        return true;
    }

    final static void setReplyTarget(String param0, int param1, int param2, long param3, byte param4) {
        try {
          RasterStackHelpers.field_g = param2;
          TextHighlightSpan.field_u = true;
          DualLinkNodeHashTable.field_h = param1;
          CaptionedContainer.field_N = param3;
          int var6_int = -83 % ((param4 + 59) / 56);
          ReflectionCheckHelpers.field_j = param0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "pf.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void addChatFilterActions(ChatMessage param0, int param1) {
        if (param0.field_l) {
          return;
        }
        try {
          this.field_f = param0.field_i;
          if (param0.field_i == 0) {
            if (RegistrationResponseHelpers.field_e == 0) {
              this.field_j.addItem(ScreenDrawHelpers.field_b, 1, 12);
            }
            this.field_j.addItem(LoginCredentialType.field_b, 1, 13);
          }
          if (param1 != 12) {
            int[] var4 = (int[]) null;
            this.addSocialActions(20, (int[]) null, true);
          }
          if (1 == param0.field_i) {
            if (RasterStackHelpers.field_b == 0) {
              this.field_j.addItem(LoadingScreenRenderHelpers.field_a, param1 - 11, 12);
            }
            this.field_j.addItem(SpriteState.field_H, 1, 13);
          }
          if (param0.field_i == 2) {
            if (IntrusiveNode.field_f == 0) {
              this.field_j.addItem(TextureEntry.field_a, param1 - 11, 12);
            }
            this.field_j.addItem(IntrusiveNode.field_a, 1, 13);
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "pf.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean processInput(int param0, int param1, boolean param2, byte param3, int param4) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        int var6 = this.field_j.pollAction(param2, -109);
        if (param3 != 53) {
          this.field_h = (UiComponent) null;
          if (var6 == -2) {
            return false;
          }
          discarded$0 = this.handleGameAction(var6, 122, param1);
          discarded$1 = this.handleSocialAction(85, param0, var6);
          discarded$2 = this.handleSecondaryAction(-15, param0, var6);
          discarded$3 = this.openReportPrompt(param4, -20991, var6);
          return true;
        }
        if (var6 == -2) {
          return false;
        }
        boolean discarded$4 = this.handleGameAction(var6, 122, param1);
        boolean discarded$5 = this.handleSocialAction(85, param0, var6);
        boolean discarded$6 = this.handleSecondaryAction(-15, param0, var6);
        boolean discarded$7 = this.openReportPrompt(param4, -20991, var6);
        return true;
    }

    final void addLobbyGameActions(byte param0) {
        String var3;
        int var4;
        LobbyGame var5;
        var4 = TetraLink.field_J;
        if (AccountWelcomePanel.field_N != null) {
          if (param0 == 79) {
            return;
          }
          field_a = (ValidationState) null;
          return;
        }
        var5 = DialWidget.findLobbyPlayer(param0 ^ 35, this.field_c);
        if (var5 == null) {
          if (param0 == 79) {
            return;
          }
          field_a = (ValidationState) null;
          return;
        }
        var3 = var5.field_ec;
        if (var5.field_Vb) {
          this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var3}, Bzip2State.field_b, 123), 1, 2);
          this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var3}, SocketConnector.field_b, 122), param0 - 78, 3);
        } else {
          if (var5.field_xc) {
            this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var3}, HighscoreQuery.field_o, 127), 1, 2);
          } else {
            if (!var5.field_Wb &&
              var5.field_kc) {
              if (!var5.field_Kb) {
                this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var3}, MenuReturnHelpers.field_g, 120), 1, 2);
              } else {
                if (var5.field_xc) {
                  this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var3}, MenuReturnHelpers.field_g, 120), 1, 2);
                }
              }
            }
          }
          if (var5.field_Wb) {
            this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var3}, NameSeparatorHelpers.field_e, 121), 1, 3);
          }
        }
        if (param0 == 79) {
          return;
        }
        field_a = (ValidationState) null;
        return;
    }

    final void addGameSetupMenuItems(int param0, boolean param1) {
        LobbyPlayerEntry var4;
        String var5;
        int var6;
        LobbyPlayerEntry var7;
        var6 = TetraLink.field_J;
        if (this.field_b == null) {
          if (param0 == 19) {
            return;
          }
          PlayerContextMenu.setReplyTarget((String) null, -98, -98, 115L, (byte) 47);
          return;
        }
        if (IsaacCipher.field_c == this.field_e) {
          if (param0 == 19) {
            return;
          }
          PlayerContextMenu.setReplyTarget((String) null, -98, -98, 115L, (byte) 47);
          return;
        }
        if (AccountWelcomePanel.field_N == null) {
          if (param0 == 19) {
            return;
          }
          PlayerContextMenu.setReplyTarget((String) null, -98, -98, 115L, (byte) 47);
          return;
        }
        if (!MenuThemeHelpers.isCurrentGameOwner(63)) {
          if (param0 == 19) {
            return;
          }
          PlayerContextMenu.setReplyTarget((String) null, -98, -98, 115L, (byte) 47);
          return;
        }
        var7 = NameAvailabilityValidator.findSocialEntry(this.field_e, -26778);
        var4 = SecondaryNodeDequeIterator.findLobbyPlayer(-18701, this.field_e);
        var5 = this.getDisplayName(2);
        if (var4 != null) {
          if (!AccountWelcomePanel.field_N.field_Kb) {
            this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var5}, OpacityWidget.field_P, 124), 1, 1);
          } else {
            if (AccountWelcomePanel.field_N.field_bc >= 0) {
              this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var5}, OpacityWidget.field_P, 124), 1, 1);
            }
          }
        } else {
          if (var7 != null &&
            AccountWelcomePanel.field_N.field_kc &&
            AccountWelcomePanel.field_N.field_jc < AccountWelcomePanel.field_N.field_rc) {
            if (var7.field_cc) {
              this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var5}, ValidationStatusIcon.field_P, param0 + 106), param0 ^ 18, 1);
            } else {
              if (!param1) {
                this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var5}, IconLabelItem.field_Lb, 126), 1, 0);
              } else {
                if (!var7.field_Kb) {
                  this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var5}, IconLabelItem.field_Lb, 126), 1, 0);
                } else {
                  this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var5}, MusicTrackHelpers.field_a, 125), 1, 0);
                  this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var5}, ByteStorage.field_c, param0 ^ 104), param0 - 18, 1);
                }
              }
            }
          }
        }
        if (param0 == 19) {
          return;
        }
        PlayerContextMenu.setReplyTarget((String) null, -98, -98, 115L, (byte) 47);
        return;
    }

    PlayerContextMenu(UiComponent param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
          this.field_j = new ContextMenu(TetraLink.field_P);
          param0.field_zb = true;
          this.field_e = param1;
          this.field_b = param2;
          this.field_h = param0;
          this.field_f = param5;
          this.field_g = param6;
          this.field_c = param4;
          this.field_i = param3;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "pf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void setMenuFlag(boolean param0, int param1) {
        this.field_j.drawFullScreen(param0, 256);
        if (param1 != 15163) {
          this.field_i = (String) null;
        }
    }

    final void addSocialActions(int param0, int[] param1, boolean param2) {
        String stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        SocialListEntry var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          if (!param2) {
            return;
          }
          if (this.field_b != null) {
            if (IsaacCipher.field_c == this.field_e &&
              param0 != 2) {
              return;
            }
            if (TwoColumnListPanel.field_Tb == 2) {
              var7 = this.getDisplayName(2);
              var4 = var7;
              stackIn_9_0 = this.field_b;
              stackIn_10_1 = !(param2);
              var5 = DiskCacheWorker.findFriendByName(stackIn_9_0, stackIn_10_1);
              var6 = ArchiveGroupHelpers.areAllGroupsReady((byte) 2, this.field_b) ? 1 : 0;
              if (var5 == null &&
                var6 == 0) {
                this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var7}, BoardAnimator.field_i, 125), 1, 4);
                this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var7}, LabelPairWidget.field_Nb, 126), 1, 6);
                if (param1 != null &&
                  param0 != 2 &&
                  !MenuLabelGlobals.field_a) {
                  this.field_g = param1;
                  this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var7}, LoginPanel.field_bb, 123), 1, 19);
                }
              }
              if (var5 != null) {
                if (!DialWidgetPainter.isPrivateChatTarget(this.field_b, (byte) -80) &&
                  !MenuLabelGlobals.field_a) {
                  if (!DisplayNameForm.field_K) {
                    this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var7}, ValidationState.field_a, 125), 1, 8);
                  }
                  this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var7}, StatusRequestHelpers.field_b, 126), 1, 18);
                  if (param1 != null) {
                    this.field_g = param1;
                    this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var7}, LoginPanel.field_bb, 127), 1, 19);
                  }
                }
                this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var7}, WidgetTheme.field_j, 120), 1, 5);
              }
              if (var6 != 0) {
                this.field_j.addItem(SectorCacheStore.formatTemplate(new String[]{var7}, ProgressMessageDialog.field_nb, 126), 1, 7);
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("pf.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    private final boolean handleGameAction(int param0, int param1, int param2) {
        int var5;
        var5 = TetraLink.field_J;
        if (0 == param0) {
          LinkTextPainter.sendLongRequest(param2, (byte) -118, this.field_e);
        } else {
          if (param0 == 1) {
            GameKeyHandler.sendLongCommand(47, param2, this.field_e);
          } else {
            if (param0 == 2) {
              LoginProgressHelpers.sendShortRequest(param2, (byte) 110, this.field_c);
            } else {
              if (param0 == 3) {
                MidiPcmStream.sendWithdrawJoinRequest(this.field_c, -125, param2);
              } else {
                if (10 == param0) {
                  LabelPairWidget.sendByteRequest(3, this.field_c, param2);
                } else {
                  if (param0 == 15) {
                    MidiPcmStream.sendShowGamePlayers(param2, (byte) -125, this.field_c);
                  } else {
                    if (param0 != 16) {
                      return false;
                    }
                    MidiPcmStream.sendShowGamePlayers(param2, (byte) -123, 0);
                  }
                }
              }
            }
          }
        }
        if (param1 <= 108) {
        }
        return true;
    }

    final static void notifyBrowserResize(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          try {
            JavaScriptBridge.callWithArguments(new Object[]{new Integer(param1)}, 6760, "resizing", ProgressMessageDialog.getHostApplet(13));
            if (param0 <= 115) {
              PlayerContextMenu.releaseStatics((byte) 9);
            }
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_k = null;
        if (param0 != 86) {
          PlayerContextMenu.notifyBrowserResize(60, 17);
        }
    }

    static {
        field_k = "Create";
        field_a = new ValidationState();
    }
}
