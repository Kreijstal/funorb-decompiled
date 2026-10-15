/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContextActionController {
    static PaletteFont field_g;
    private long targetId;
    private int[] suggestedPhraseIds;
    UiComponent anchorComponent;
    int gameId;
    private String targetDisplayName;
    static String field_f;
    ContextMenu contextMenu;
    String targetName;
    private int chatChannel;
    static int[] worldDirectionZ;

    private final boolean dispatchChatAction(int opcode, boolean obfuscationGuard, int actionId) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard) {
            return false;
          }
          boolean remainingActionBranch = true;
          if (8 == actionId) {
            MessageScreen.a(this.targetName, this.targetId, 2);
          }
          if (8 != actionId ||
            unusedGameFlag != 0) {
            if (18 == actionId) {
              BitPacketBuffer.a(21846, this.targetName, this.targetId);
            }
            if (18 != actionId ||
              unusedGameFlag != 0) {
              if (actionId != 11) {
                if (actionId != 12) {
                  if (13 == actionId) {
                    DirectByteStorage.updateChatFilter(0, opcode, 2, this.chatChannel);
                    remainingActionBranch = (unusedGameFlag != 0);
                  }
                  if (remainingActionBranch) {
                    if (actionId == 14) {
                      TooltipSprite.d(2);
                      remainingActionBranch = (unusedGameFlag != 0);
                    }
                    if (remainingActionBranch) {
                      if (actionId == 20) {
                        LevelPackLoader.a(4252);
                        remainingActionBranch = (unusedGameFlag != 0);
                      }
                      if (remainingActionBranch) {
                        if (19 == actionId) {
                          QuickChatParameterType.a(this.suggestedPhraseIds, this.targetId, this.chatChannel, obfuscationGuard, this.targetName);
                          remainingActionBranch = (unusedGameFlag != 0);
                        }
                        if (remainingActionBranch) {
                          return false;
                        }
                      }
                    }
                  }
                }
                if (remainingActionBranch) {
                  DirectByteStorage.updateChatFilter(0, opcode, 1, this.chatChannel);
                  if (unusedGameFlag != 0) {
                    DirectByteStorage.updateChatFilter(0, opcode, 0, this.chatChannel);
                  }
                }
              } else {
                DirectByteStorage.updateChatFilter(0, opcode, 0, this.chatChannel);
              }
            }}
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var4), "nn.B(" + opcode + ',' + obfuscationGuard + ',' + actionId + ')');
        }
    }

    final void addGameActions(boolean obfuscationGuard) {
        boolean discarded$0 = false;
        RuntimeException decompiledCaughtException = null;
        LobbyGame var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (null == ClientResourceHelpers.currentLobbyGame) {
            var2 = MultiValueSliderRenderer.findLobbyGame(this.gameId, (byte) 61);
            if (var2 != null) {
              var3 = var2.displayName;
              if (var2.invitationPending) {
                this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(kk.field_d, new String[]{var3}, (byte) 103), 2, (byte) 76);
                this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(np.field_f, new String[]{var3}, (byte) 103), 3, (byte) 107);
                decompiledFrameRemainder0 = (var4 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (!var2.directJoinAvailable) {
                  if ((!var2.joinRequestPending) && (var2.protocolFlag8) && (!var2.started ||
                    var2.directJoinAvailable)) {
                    this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(qp.field_a, new String[]{var3}, (byte) 103), 2, (byte) 105);
                    if (var4 != 0) {
                      this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(FocusableWidget.field_G, new String[]{var3}, (byte) 103), 2, (byte) 126);
                    }
                  }
                } else {
                  this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(FocusableWidget.field_G, new String[]{var3}, (byte) 103), 2, (byte) 126);
                }
                if (var2.joinRequestPending) {
                  this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(rm.field_b, new String[]{var3}, (byte) 103), 3, (byte) 87);
                }
              }
            }
          }
          if (!obfuscationGuard) {
            discarded$0 = this.dispatchSocialAction((byte) 3, 96, 123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2_ref), "nn.L(" + obfuscationGuard + ')');
        }
    }

    private final String getTargetCaption(int obfuscationGuard) {
        String caption = null;
        RuntimeException var2_ref = null;
        String invalidGuardResult = null;
        String result = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -12688) {
            invalidGuardResult = (String) null;
            return invalidGuardResult;
          }
          if (this.targetDisplayName == null) {
            caption = this.targetName;
            if (BrickABrac.field_J) {
              caption = this.targetDisplayName;
            }
          } else {
            caption = this.targetDisplayName;
          }
          result = caption;
          return result;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2_ref), "nn.M(" + obfuscationGuard + ')');
        }
    }

    final void drawContextMenu(byte obfuscationGuard, boolean showTextSuffix) {
        try {
          this.contextMenu.drawRoot(true, showTextSuffix);
          int var3_int = 11 % ((obfuscationGuard + 91) / 34);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "nn.H(" + obfuscationGuard + ',' + showTextSuffix + ')');
        }
    }

    final static void a(ResourceArchive param0, int param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2599_0;
            StringBuilder stackIn_2599_1;
            String stackIn_2600_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int var4;
            ResourceArchive param0;
            int param1;
            boolean finished;
            $CfrPartitionedBody(ResourceArchive initialParam0, int initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2599_0 = null;
                this.stackIn_2599_1 = null;
                this.stackIn_2600_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
                this.var4 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                HighscorePackSelector.field_c = param0;
                var2 = nk.a("loginm3", (byte) 107);
                if (var2 != null) {
                  DisplayModeInfo.field_b = MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("loginm2", (byte) -110);
                if (var2 != null) {
                  gd.field_e = MenuButton.a(var2, (byte) 91);
                }
                var2 = nk.a("loginm1", (byte) -124);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 98);
                }
                var2 = nk.a("idlemessage20min", (byte) -107);
                if (null != var2) {
                  NinjaBackground.field_s = MenuButton.a(var2, (byte) 104);
                }
                var2 = nk.a("error_js5crc", (byte) -111);
                if (null != var2) {
                  nk.field_d = MenuButton.a(var2, (byte) 72);
                }
                var2 = nk.a("error_js5io", (byte) -119);
                if (null != var2) {
                  RadialSelectorWidget.field_M = MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("error_js5connect_full", (byte) -119);
                if (null != var2) {
                  AppletGameShell.field_k = MenuButton.a(var2, (byte) 106);
                }
                var2 = nk.a("error_js5connect", (byte) -114);
                if (var2 != null) {
                  np.field_e = MenuButton.a(var2, (byte) 72);
                }
                var2 = nk.a("login_gameupdated", (byte) 24);
                if (null != var2) {
                  u.field_b = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("create_unable", (byte) 91);
                if (null != var2) {
                  ConditionalTextValue.field_d = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("create_ineligible", (byte) 28);
                if (var2 != null) {
                  CircleBody.field_q = MenuButton.a(var2, (byte) 96);
                }
                var2 = nk.a("usernameprompt", (byte) 2);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 111);
                }
                var2 = nk.a("passwordprompt", (byte) 34);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("andagainprompt", (byte) -123);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 116);
                }
                var2 = nk.a("ticketing_read", (byte) -119);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("ticketing_ignore", (byte) -128);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 91);
                }
                var2 = nk.a("ticketing_oneunread", (byte) 113);
                if (var2 != null) {
                  WidgetGroup.field_C = MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("ticketing_xunread", (byte) -111);
                if (null != var2) {
                  ed.field_c = MenuButton.a(var2, (byte) 116);
                }
                var2 = nk.a("ticketing_gotowebsite", (byte) -125);
                if (null != var2) {
                  ConditionalTextValue.field_e = MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("ticketing_waitingformessages", (byte) 38);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("mu_chat_on", (byte) -127);
                if (var2 != null) {
                  mc.field_a = MenuButton.a(var2, (byte) 123);
                }
                var2 = nk.a("mu_chat_friends", (byte) -127);
                if (null != var2) {
                  AchievementSubmission.friendsTabLabel = MenuButton.a(var2, (byte) 125);
                }
                var2 = nk.a("mu_chat_off", (byte) -122);
                if (var2 != null) {
                  TableRowSubmission.field_s = MenuButton.a(var2, (byte) 123);
                }
                var2 = nk.a("mu_chat_lobby", (byte) -8);
                if (null != var2) {
                  ArcticBackground.field_u = MenuButton.a(var2, (byte) 98);
                }
                var2 = nk.a("mu_chat_public", (byte) 15);
                if (null != var2) {
                  QuickChatHelpDialog.field_Wb = MenuButton.a(var2, (byte) 118);
                }
                var2 = nk.a("mu_chat_ignore", (byte) -115);
                if (var2 != null) {
                  pl.ignoreTabLabel = MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("mu_chat_tips", (byte) 35);
                if (var2 != null) {
                  MidiSynthesizer.field_u = MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("mu_chat_game", (byte) 126);
                if (null != var2) {
                  UiComponent.field_Z = MenuButton.a(var2, (byte) 97);
                }
                var2 = nk.a("mu_chat_private", (byte) 45);
                if (var2 != null) {
                  ContentTransitionLayer.field_hb = MenuButton.a(var2, (byte) 84);
                }
                var2 = nk.a("mu_x_entered_game", (byte) 69);
                if (null != var2) {
                  IntKeyIndex.field_d = MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("mu_x_joined_your_game", (byte) 98);
                if (var2 != null) {
                  InstructionsScreen.field_w = MenuButton.a(var2, (byte) 119);
                }
                var2 = nk.a("mu_x_entered_other_game", (byte) -126);
                if (null != var2) {
                  DateInputWidget.field_K = MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("mu_x_left_lobby", (byte) -125);
                if (null != var2) {
                  ArcticBackground.field_v = MenuButton.a(var2, (byte) 111);
                }
                var2 = nk.a("mu_x_lost_con", (byte) -123);
                if (var2 != null) {
                  Brick.field_z = MenuButton.a(var2, (byte) 122);
                }
                var2 = nk.a("mu_x_cannot_join_full", (byte) 7);
                if (null != var2) {
                  SpriteGeometry.field_B = MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("mu_x_cannot_join_inprogress", (byte) 102);
                if (var2 != null) {
                  GameRenderAudioHelpers.field_e = MenuButton.a(var2, (byte) 122);
                }
                var2 = nk.a("mu_x_declined_invite", (byte) 112);
                if (var2 != null) {
                  BlankScreen.field_h = MenuButton.a(var2, (byte) 98);
                }
                var2 = nk.a("mu_x_withdrew_request", (byte) 110);
                if (var2 != null) {
                  GamePresentationHelpers.field_c = MenuButton.a(var2, (byte) 76);
                }
                var2 = nk.a("mu_x_removed", (byte) -119);
                if (null != var2) {
                  LevelPack.field_f = MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("mu_x_dropped_out", (byte) -112);
                if (null != var2) {
                  gr.field_b = MenuButton.a(var2, (byte) 97);
                }
                var2 = nk.a("mu_entered_other_game", (byte) 62);
                if (null != var2) {
                  ConnectionPhase.field_b = MenuButton.a(var2, (byte) 102);
                }
                var2 = nk.a("mu_game_is_full", (byte) 60);
                if (var2 != null) {
                  qp.field_b = MenuButton.a(var2, (byte) 83);
                }
                var2 = nk.a("mu_game_has_started", (byte) 25);
                if (var2 != null) {
                  OptionsScreen.field_w = MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("mu_you_declined_invite", (byte) -117);
                if (var2 != null) {
                  GameTransportActions.field_b = MenuButton.a(var2, (byte) 76);
                }
                var2 = nk.a("mu_invite_withdrawn", (byte) 73);
                if (var2 != null) {
                  BrickMotionPath.field_s = MenuButton.a(var2, (byte) 73);
                }
                var2 = nk.a("mu_request_declined", (byte) 113);
                if (null != var2) {
                  MenuScreen.field_n = MenuButton.a(var2, (byte) 86);
                }
                var2 = nk.a("mu_request_withdrawn", (byte) -111);
                if (var2 != null) {
                  AchievementIcon.field_o = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("mu_all_players_have_left", (byte) 95);
                if (null != var2) {
                  fm.field_c = MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("mu_lobby_name", (byte) 3);
                if (null != var2) {
                  ConnectionPhase.nameColumnHeadingText = MenuButton.a(var2, (byte) 87);
                }
                var2 = nk.a("mu_lobby_rating", (byte) -116);
                if (var2 != null) {
                  RadialSelectorRenderer.field_c = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("mu_lobby_friend_add", (byte) 61);
                if (var2 != null) {
                  LoginPanel.field_J = MenuButton.a(var2, (byte) 70);
                }
                var2 = nk.a("mu_lobby_friend_rm", (byte) 72);
                if (var2 != null) {
                  ChocolateBackground.field_y = MenuButton.a(var2, (byte) 91);
                }
                var2 = nk.a("mu_lobby_name_add", (byte) -19);
                if (null != var2) {
                  MatchCompleteScreen.field_z = MenuButton.a(var2, (byte) 84);
                }
                var2 = nk.a("mu_lobby_name_rm", (byte) -117);
                if (var2 != null) {
                  ScreenNavigationHelpers.field_e = MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("mu_lobby_location", (byte) 8);
                if (var2 != null) {
                  ArchiveSource.locationColumnHeadingText = MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("mu_gamelist_all_games", (byte) -116);
                if (null != var2) {
                  rl.field_c = MenuButton.a(var2, (byte) 114);
                }
                var2 = nk.a("mu_gamelist_status", (byte) -119);
                if (var2 != null) {
                  nk.field_b = MenuButton.a(var2, (byte) 87);
                }
                var2 = nk.a("mu_gamelist_owner", (byte) -119);
                if (null != var2) {
                  VolcanicBackground.field_r = MenuButton.a(var2, (byte) 105);
                }
                var2 = nk.a("mu_gamelist_players", (byte) 76);
                if (var2 != null) {
                  ch.field_d = MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("mu_gamelist_avg_rating", (byte) 125);
                if (var2 != null) {
                  BallPulseEffect.field_o = MenuButton.a(var2, (byte) 103);
                }
                var2 = nk.a("mu_gamelist_options", (byte) -112);
                if (null != var2) {
                  TextFieldRenderer.field_v = MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("mu_gamelist_elapsed_time", (byte) -14);
                if (null != var2) {
                  ByteStorage.field_d = MenuButton.a(var2, (byte) 84);
                }
                var2 = nk.a("mu_play_rated", (byte) 60);
                if (var2 != null) {
                  GameplayRenderHelpers.field_e = MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("mu_create_unrated", (byte) 8);
                if (var2 != null) {
                  MultiplayerMatch.field_e = MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("mu_options", (byte) -120);
                if (var2 != null) {
                  ArchiveSource.field_b = MenuButton.a(var2, (byte) 93);
                }
                var2 = nk.a("mu_options_whocanjoin", (byte) -121);
                if (var2 != null) {
                  Bzip2State.field_H = MenuButton.a(var2, (byte) 85);
                }
                var2 = nk.a("mu_options_players", (byte) -107);
                if (var2 != null) {
                  QuickChatMenu.field_ac = MenuButton.a(var2, (byte) 75);
                }
                var2 = nk.a("mu_options_dontmind", (byte) 19);
                if (null != var2) {
                  StateIconLabel.field_Pb = MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("mu_options_allow_spectate", (byte) -107);
                if (var2 != null) {
                  PlayerInputBatch.field_j = MenuButton.a(var2, (byte) 85);
                }
                var2 = nk.a("mu_options_ratedgametype", (byte) -114);
                if (null != var2) {
                  EmailConfirmationValidator.field_r = MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("yes", (byte) -119);
                if (null != var2) {
                  hh.field_f = MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("no", (byte) -4);
                if (var2 != null) {
                  MenuSelection.field_a = MenuButton.a(var2, (byte) 106);
                }
                var2 = nk.a("mu_invite_players", (byte) -108);
                if (var2 != null) {
                  SecondaryNodeQueue.field_a = MenuButton.a(var2, (byte) 119);
                }
                var2 = nk.a("close", (byte) -17);
                if (var2 != null) {
                  fh.field_e = MenuButton.a(var2, (byte) 98);
                }
                var2 = nk.a("add_x_to_friends", (byte) 4);
                if (null != var2) {
                  AchievementMaskRequest.field_l = MenuButton.a(var2, (byte) 108);
                }
                var2 = nk.a("add_x_to_ignore", (byte) 52);
                if (var2 != null) {
                  PasswordFieldRenderer.field_H = MenuButton.a(var2, (byte) 76);
                }
                var2 = nk.a("rm_x_from_friends", (byte) -111);
                if (var2 != null) {
                  ChatLobbyUiHelpers.field_g = MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("rm_x_from_ignore", (byte) -127);
                if (var2 != null) {
                  UsernameSuggestionPanel.field_O = MenuButton.a(var2, (byte) 83);
                }
                var2 = nk.a("send_pm_to_x", (byte) -108);
                if (null != var2) {
                  ClientException.field_c = MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("send_qc_to_x", (byte) -115);
                if (var2 != null) {
                  qm.field_b = MenuButton.a(var2, (byte) 103);
                }
                var2 = nk.a("send_pm", (byte) -110);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 91);
                }
                var2 = nk.a("invite_accept_xs_game", (byte) -110);
                if (var2 != null) {
                  kk.field_d = MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("invite_decline_xs_game", (byte) 54);
                if (null != var2) {
                  np.field_f = MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("join_xs_game", (byte) -122);
                if (null != var2) {
                  FocusableWidget.field_G = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("join_request_xs_game", (byte) 24);
                if (null != var2) {
                  qp.field_a = MenuButton.a(var2, (byte) 91);
                }
                var2 = nk.a("join_withdraw_request_xs_game", (byte) 71);
                if (null != var2) {
                  rm.field_b = MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("mu_gameopt_kick_x_from_this_game", (byte) -115);
                if (null != var2) {
                  RankingsRequest.field_q = MenuButton.a(var2, (byte) 102);
                }
                var2 = nk.a("mu_gameopt_withdraw_invite_to_x", (byte) -121);
                if (null != var2) {
                  hm.field_c = MenuButton.a(var2, (byte) 91);
                }
                var2 = nk.a("mu_gameopt_accept_x_into_game", (byte) -114);
                if (null != var2) {
                  mc.field_b = MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("mu_gameopt_reject_x_from_game", (byte) 123);
                if (null != var2) {
                  RasterCacheSurface.field_o = MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("mu_gameopt_invite_x_to_game", (byte) -128);
                if (null != var2) {
                  ResourceRequest.field_A = MenuButton.a(var2, (byte) 79);
                }
                var2 = nk.a("report_x_for_abuse", (byte) -108);
                if (var2 != null) {
                  DesertBackground.field_t = MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("unable_to_send_message_password_a", (byte) 64);
                if (var2 != null) {
                  DiagnosticTextLine.field_j = MenuButton.a(var2, (byte) 119);
                }
                var2 = nk.a("unable_to_send_message_password_b", (byte) -128);
                if (var2 != null) {
                  ScreenshotViewer.field_m = MenuButton.a(var2, (byte) 103);
                }
                var2 = nk.a("mu_chat_lobby_show_all", (byte) 75);
                if (var2 != null) {
                  Bzip2State.field_m = MenuButton.a(var2, (byte) 116);
                }
                var2 = nk.a("mu_chat_lobby_friends_only", (byte) -127);
                if (null != var2) {
                  RasterSnapshot.field_l = MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("mu_chat_lobby_friends", (byte) 16);
                if (null != var2) {
                  DirectByteStorage.field_l = MenuButton.a(var2, (byte) 76);
                }
                var2 = nk.a("mu_chat_lobby_hide", (byte) -126);
                if (null != var2) {
                  ArchiveSourceManager.field_e = MenuButton.a(var2, (byte) 123);
                }
                var2 = nk.a("mu_chat_game_show_all", (byte) -14);
                if (null != var2) {
                  LegacyUtf8Decoder.field_a = MenuButton.a(var2, (byte) 99);
                }
                var2 = nk.a("mu_chat_game_friends_only", (byte) 117);
                if (var2 != null) {
                  StrongCacheEntry.field_K = MenuButton.a(var2, (byte) 86);
                }
                var2 = nk.a("mu_chat_game_friends", (byte) -128);
                if (var2 != null) {
                  DualLinkNode.field_m = MenuButton.a(var2, (byte) 91);
                }
                var2 = nk.a("mu_chat_game_hide", (byte) 126);
                if (var2 != null) {
                  CacheIoWorker.field_b = MenuButton.a(var2, (byte) 83);
                }
                var2 = nk.a("mu_chat_pm_show_all", (byte) -125);
                if (var2 != null) {
                  ObjectHistoryBuffer.field_l = MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("mu_chat_pm_friends_only", (byte) -123);
                if (null != var2) {
                  qp.field_d = MenuButton.a(var2, (byte) 73);
                }
                var2 = nk.a("mu_chat_pm_friends", (byte) -109);
                if (var2 != null) {
                  HotspotTextWidget.field_M = MenuButton.a(var2, (byte) 98);
                }
                var2 = nk.a("mu_chat_invisible_and_silent_mode", (byte) -118);
                if (var2 != null) {
                  EmailAvailabilityRequest.field_b = MenuButton.a(var2, (byte) 72);
                }
                var2 = nk.a("you_have_been_removed_from_xs_game", (byte) 86);
                if (null != var2) {
                  ValidationMessageWidget.field_T = MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("your_rating_is_x", (byte) 48);
                if (var2 != null) {
                  rm.field_c = MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("you_are_on_x_server", (byte) -125);
                if (null != var2) {
                  LevelDecoder.field_c = MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("rated_game", (byte) -110);
                if (var2 != null) {
                  DelayedPacket.field_n = MenuButton.a(var2, (byte) 111);
                }
                var2 = nk.a("unrated_game", (byte) -125);
                if (var2 != null) {
                  rl.field_b = MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("rated_game_tips", (byte) -107);
                if (null != var2) {
                  TextChoiceDialogStyles.field_a = MenuButton.a(var2, (byte) 107);
                }
                var2 = nk.a("searching_for_opponent_singular", (byte) -115);
                if (null != var2) {
                  MatchingTextValidator.field_l = MenuButton.a(var2, (byte) 99);
                }
                var2 = nk.a("searching_for_opponents_plural", (byte) -112);
                if (var2 != null) {
                  FireworkBurst.matchmakingStatusText = MenuButton.a(var2, (byte) 75);
                }
                var2 = nk.a("find_opponent_singular", (byte) 23);
                if (null != var2) {
                  NewAchievementsScreen.field_F = MenuButton.a(var2, (byte) 96);
                }
                var2 = nk.a("find_opponents_plural", (byte) -127);
                if (null != var2) {
                  ArrayWidgetGroup.field_J = MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("rated_game_tips_setup_singular", (byte) -117);
                if (null != var2) {
                  ResourceArchiveFactory.field_f = MenuButton.a(var2, (byte) 127);
                }
                var2 = nk.a("rated_game_tips_setup_plural", (byte) -106);
                if (null != var2) {
                  LabeledWidget.field_G = MenuButton.a(var2, (byte) 113);
                }
                var2 = nk.a("waiting_to_start_hint", (byte) -117);
                if (null != var2) {
                  SocialListEntry.field_Pb = MenuButton.a(var2, (byte) 96);
                }
                var2 = nk.a("your_game", (byte) -121);
                if (null != var2) {
                  ba.field_x = MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("game_full", (byte) -127);
                if (null != var2) {
                  GameCanvas.field_d = MenuButton.a(var2, (byte) 127);
                }
                var2 = nk.a("join_requests_one", (byte) -111);
                if (null != var2) {
                  LabeledToggleRenderer.field_g = MenuButton.a(var2, (byte) 86);
                }
                var2 = nk.a("join_requests_many", (byte) 50);
                if (var2 != null) {
                  LevelPackLoader.field_h = MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("xs_game", (byte) -12);
                if (null != var2) {
                  fm.field_a = MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("waiting_for_x_to_start_game", (byte) -127);
                if (null != var2) {
                  IntrusiveNode.field_a = MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("game_options_changed", (byte) -108);
                if (null != var2) {
                  SpriteGeometry.field_w = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("players_x_of_y", (byte) -114);
                if (null != var2) {
                  rl.field_d = MenuButton.a(var2, (byte) 106);
                }
                var2 = nk.a("message_lobby", (byte) -109);
                if (null != var2) {
                  LevelPackSelectScreen.field_x = MenuButton.a(var2, (byte) 72);
                }
                var2 = nk.a("quickchat_lobby", (byte) 75);
                if (null != var2) {
                  tq.field_b = MenuButton.a(var2, (byte) 112);
                }
                var2 = nk.a("message_game", (byte) 79);
                if (var2 != null) {
                  hc.field_b = MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("message_team", (byte) -109);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 97);
                }
                var2 = nk.a("quickchat_game", (byte) 41);
                if (null != var2) {
                  MultiplayerExitScreen.field_y = MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("kick", (byte) -113);
                if (var2 != null) {
                  LegacyUtf8Decoder.field_b = MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("inviting_x", (byte) 101);
                if (var2 != null) {
                  ll.field_a = MenuButton.a(var2, (byte) 116);
                }
                var2 = nk.a("x_wants_to_join", (byte) 63);
                if (var2 != null) {
                  ce.field_g = MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("accept", (byte) 80);
                if (var2 != null) {
                  JungleBackground.field_t = MenuButton.a(var2, (byte) 78);
                }
                var2 = nk.a("reject", (byte) -113);
                if (var2 != null) {
                  NameEntryPopup.field_Wb = MenuButton.a(var2, (byte) 112);
                }
                var2 = nk.a("invite", (byte) -123);
                if (null != var2) {
                  ea.field_f = MenuButton.a(var2, (byte) 97);
                }
                var2 = nk.a("status_concluded", (byte) -106);
                if (var2 != null) {
                  LobbyPlayer.field_Sb = MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("status_spectate", (byte) -4);
                if (var2 != null) {
                  ArrayWidgetGroup.field_I = MenuButton.a(var2, (byte) 118);
                }
                var2 = nk.a("status_playing", (byte) -15);
                if (null != var2) {
                  CanvasResizeController.field_o = MenuButton.a(var2, (byte) 79);
                }
                var2 = nk.a("status_join", (byte) -107);
                if (var2 != null) {
                  TooltipSprite.field_k = MenuButton.a(var2, (byte) 117);
                }
                var2 = nk.a("status_private", (byte) 46);
                if (var2 != null) {
                  hm.field_a = MenuButton.a(var2, (byte) 101);
                }
                var2 = nk.a("status_full", (byte) 47);
                if (var2 != null) {
                  IntArrayRequest.field_p = MenuButton.a(var2, (byte) 95);
                }
                var2 = nk.a("players_in_game", (byte) 112);
                if (null != var2) {
                  QuickChatParameterType.field_f = MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("you_are_invited_to_xs_game", (byte) -111);
                if (null != var2) {
                  TextFieldRenderer.field_y = MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("asking_to_join_xs_game", (byte) 28);
                if (null != var2) {
                  TextChoiceDialogHitTest.field_b = MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("who_can_join", (byte) 47);
                if (var2 != null) {
                  FarmBackground.field_s = MenuButton.a(var2, (byte) 100);
                }
                var2 = nk.a("you_can_join", (byte) -112);
                if (null != var2) {
                  ArchiveSource.field_d = MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("you_can_ask_to_join", (byte) 35);
                if (null != var2) {
                  WidgetPaintStyle.field_n = MenuButton.a(var2, (byte) 75);
                }
                var2 = nk.a("you_cannot_join_in_progress", (byte) 68);
                if (var2 != null) {
                  AchievementsScreen.field_K = MenuButton.a(var2, (byte) 85);
                }
                var2 = nk.a("you_can_spectate", (byte) 105);
                if (null != var2) {
                  LobbyPlayer.field_jc = MenuButton.a(var2, (byte) 102);
                }
                var2 = nk.a("you_can_not_spectate", (byte) -112);
                if (var2 != null) {
                  AlternateNumericLoginCredentials.field_q = MenuButton.a(var2, (byte) 101);
                }
                var2 = nk.a("spectate_xs_game", (byte) -122);
                if (null != var2) {
                  LevelResultSubmission.field_s = MenuButton.a(var2, (byte) 81);
                }
                var2 = nk.a("hide_players_in_xs_game", (byte) 50);
                if (var2 != null) {
                  ArchiveSourceManager.field_d = MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("show_players_in_xs_game", (byte) -123);
                if (null != var2) {
                  Paddle.field_G = MenuButton.a(var2, (byte) 99);
                }
                var2 = nk.a("connecting_to_friend_server_twoline", (byte) -118);
                if (null != var2) {
                  LoginCredentialKind.field_f = MenuButton.a(var2, (byte) 102);
                }
                var2 = nk.a("loading", (byte) 18);
                if (null != var2) {
                  AlternateNumericLoginCredentials.field_t = MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("offline", (byte) -126);
                if (var2 != null) {
                  DialogMessagePanel.field_S = MenuButton.a(var2, (byte) 84);
                }
                var2 = nk.a("multiconst_invite_only", (byte) 35);
                if (var2 != null) {
                  MainMenuScreen.field_r = MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("multiconst_clan", (byte) 60);
                if (var2 != null) {
                  t.field_e = MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("multiconst_friends", (byte) 56);
                if (var2 != null) {
                  IterableIntrusiveHashTable.field_g = MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("multiconst_similar_rating", (byte) 55);
                if (null != var2) {
                  AlternateNumericLoginCredentials.field_u = MenuButton.a(var2, (byte) 72);
                }
                var2 = nk.a("multiconst_open", (byte) -115);
                if (null != var2) {
                  FullscreenDialogHelpers.field_a = MenuButton.a(var2, (byte) 96);
                }
                var2 = nk.a("no_options_available", (byte) -118);
                if (var2 != null) {
                  TextHotspotRegion.field_m = MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("reportabuse", (byte) -4);
                if (null != var2) {
                  RadialSelectorWidget.field_Y = MenuButton.a(var2, (byte) 109);
                }
                var2 = nk.a("presstabtochat", (byte) -122);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 75);
                }
                var2 = nk.a("pressf10toquickchat", (byte) 31);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 99);
                }
                var2 = nk.a("dob_chatdisabled", (byte) -119);
                if (var2 != null) {
                  CircleBody.field_s = MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("dob_enterforchat", (byte) 71);
                if (var2 != null) {
                  MusicEnvelope.field_i = MenuButton.a(var2, (byte) 108);
                }
                var2 = nk.a("tab_hidechattemporarily", (byte) -11);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 104);
                }
                var2 = nk.a("esc_cancelprivatemessage", (byte) -124);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 107);
                }
                var2 = nk.a("esc_cancelthisline", (byte) -125);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 118);
                }
                var2 = nk.a("privatequickchat_from_x", (byte) -122);
                if (null != var2) {
                  FullscreenFailureDialog.field_fb = MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("privatequickchat_to_x", (byte) -111);
                if (var2 != null) {
                  SaveResultsPromptScreen.field_x = MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("privatechat_blankarea_explanation", (byte) 122);
                if (var2 != null) {
                  df.field_b = MenuButton.a(var2, (byte) 105);
                }
                var2 = nk.a("publicchat_unavailable_ratedgame", (byte) -111);
                if (null != var2) {
                  rl.field_a = MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("privatechat_friend_offline", (byte) -120);
                if (var2 != null) {
                  ScorePopup.field_j = MenuButton.a(var2, (byte) 102);
                }
                var2 = nk.a("privatechat_friend_notlisted", (byte) -111);
                if (null != var2) {
                  kk.field_c = MenuButton.a(var2, (byte) 112);
                }
                var2 = nk.a("chatviewscrolledup", (byte) -114);
                if (var2 != null) {
                  un.field_h = MenuButton.a(var2, (byte) 83);
                }
                var2 = nk.a("thisisrunescapeclan", (byte) -125);
                if (var2 != null) {
                  rq.field_d = MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("thisisrunescapeclan_notowner", (byte) 46);
                if (var2 != null) {
                  ChocolateBackground.field_t = MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("runescapeclan", (byte) -112);
                if (null != var2) {
                  SoundCache.field_b = MenuButton.a(var2, (byte) 95);
                }
                var2 = nk.a("rated_membersonly", (byte) -106);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("gameopt_membersonly", (byte) -128);
                if (var2 != null) {
                  PacketBuffer.field_m = MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("gameopt_1moreratedgame", (byte) 55);
                if (var2 != null) {
                  NineSliceFrame.field_a = MenuButton.a(var2, (byte) 119);
                }
                var2 = nk.a("gameopt_moreratedgames", (byte) -126);
                if (null != var2) {
                  tq.field_e = MenuButton.a(var2, (byte) 119);
                }
                var2 = nk.a("gameopt_needrating", (byte) -113);
                if (var2 != null) {
                  QuickChatPhraseDefinition.field_x = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("gameopt_unratedonly", (byte) 45);
                if (var2 != null) {
                  ContentTransitionLayer.field_ib = MenuButton.a(var2, (byte) 114);
                }
                var2 = nk.a("gameopt_notunlocked", (byte) -110);
                if (var2 != null) {
                  InstructionsScreen.field_t = MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("gameopt_cannotbecombined1", (byte) 55);
                if (null != var2) {
                  fh.field_b = MenuButton.a(var2, (byte) 79);
                }
                var2 = nk.a("gameopt_cannotbecombined2", (byte) -119);
                if (null != var2) {
                  FileCacheStore.field_e = MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("gameopt_playernotmember", (byte) -2);
                if (null != var2) {
                  MenuSelection.field_f = MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("gameopt_younotmember", (byte) 118);
                if (null != var2) {
                  DateInputWidget.field_J = MenuButton.a(var2, (byte) 119);
                }
                var2 = nk.a("gameopt_playerneedsrating", (byte) 5);
                if (var2 != null) {
                  WidgetLayerStack.field_H = MenuButton.a(var2, (byte) 101);
                }
                var2 = nk.a("gameopt_youneedrating", (byte) 38);
                if (null != var2) {
                  ea.field_h = MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("gameopt_playerneedsratedgames", (byte) -125);
                if (null != var2) {
                  ValidationStatus.field_g = MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("gameopt_youneedratedgames", (byte) 121);
                if (null != var2) {
                  Brick.field_F = MenuButton.a(var2, (byte) 100);
                }
                var2 = nk.a("gameopt_playerneeds1ratedgame", (byte) 66);
                if (null != var2) {
                  di.field_b = MenuButton.a(var2, (byte) 97);
                }
                var2 = nk.a("gameopt_youneed1ratedgame", (byte) -120);
                if (var2 != null) {
                  SaveResultsPromptScreen.field_w = MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("gameopt_playerhasntunlocked", (byte) 21);
                if (var2 != null) {
                  IntNode.field_m = MenuButton.a(var2, (byte) 117);
                }
                var2 = nk.a("gameopt_youhaventunlocked", (byte) 79);
                if (var2 != null) {
                  ObjectHistoryBuffer.field_j = MenuButton.a(var2, (byte) 77);
                }
                var2 = nk.a("gameopt_trychanging1", (byte) -10);
                if (null != var2) {
                  LobbyPlayer.field_bc = MenuButton.a(var2, (byte) 106);
                }
                var2 = nk.a("gameopt_trychanging2", (byte) 64);
                if (null != var2) {
                  QuickChatHelpDialog.field_Rb = MenuButton.a(var2, (byte) 102);
                }
                var2 = nk.a("gameopt_needchanging1", (byte) 89);
                if (var2 != null) {
                  ProducerFramebuffer.field_k = MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("gameopt_needchanging2", (byte) 121);
                if (var2 != null) {
                  MusicEnvelope.field_l = MenuButton.a(var2, (byte) 122);
                }
                var2 = nk.a("gameopt_mightchange", (byte) 97);
                if (var2 != null) {
                  ba.field_y = MenuButton.a(var2, (byte) 103);
                }
                var2 = nk.a("gameopt_playersdontqualify", (byte) 20);
                if (null != var2) {
                  LabeledToggleRenderer.field_a = MenuButton.a(var2, (byte) 79);
                }
                var2 = nk.a("gameopt_playersdontqualify_selectgametab", (byte) 34);
                if (var2 != null) {
                  NineSliceFrame.field_d = MenuButton.a(var2, (byte) 85);
                }
                var2 = nk.a("gameopt_unselectedoptions", (byte) 85);
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (var2 != null) {
                  WhirlpoolHasher.field_b = MenuButton.a(var2, (byte) 78);
                }
                var2 = nk.a("gameopt_pleaseselectoption1", (byte) 9);
                if (var2 != null) {
                  MouseWheelSource.field_b = MenuButton.a(var2, (byte) 122);
                }
                var2 = nk.a("gameopt_pleaseselectoption2", (byte) -128);
                if (null != var2) {
                  BackgroundScene.field_g = MenuButton.a(var2, (byte) 119);
                }
                var2 = nk.a("gameopt_badnumplayers", (byte) -19);
                if (var2 != null) {
                  AccountContentTransitionLayer.field_rb = MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("gameopt_inviteplayers_or_trychanging1", (byte) -115);
                if (null != var2) {
                  ContextMenu.field_ac = MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("gameopt_inviteplayers_or_trychanging2", (byte) -117);
                if (null != var2) {
                  LoginCredentials.field_e = MenuButton.a(var2, (byte) 77);
                }
                var2 = nk.a("gameopt_novalidcombos", (byte) -119);
                if (var2 != null) {
                  RadialSelectorRenderer.field_a = MenuButton.a(var2, (byte) 76);
                }
                var2 = nk.a("gameopt_pleasetrychanging", (byte) 36);
                if (var2 != null) {
                  AchievementsScreen.field_G = MenuButton.a(var2, (byte) 75);
                }
                var2 = nk.a("ra_title", (byte) 119);
                if (var2 != null) {
                  TextFieldRenderer.field_B = MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("ra_mutethisplayer", (byte) -114);
                if (var2 != null) {
                  FullscreenFailureDialog.field_gb = MenuButton.a(var2, (byte) 102);
                }
                var2 = nk.a("ra_suggestmute", (byte) -109);
                if (null != var2) {
                  nk.field_e = MenuButton.a(var2, (byte) 127);
                }
                var2 = nk.a("ra_intro", (byte) 124);
                if (var2 != null) {
                  LobbyGame.field_rc = MenuButton.a(var2, (byte) 99);
                }
                var2 = nk.a("ra_intro_no_name", (byte) 96);
                if (null != var2) {
                  ContextMenu.field_Ub = MenuButton.a(var2, (byte) 112);
                }
                var2 = nk.a("ra_explanation", (byte) 21);
                if (var2 != null) {
                  QuickChatPhraseDefinition.field_D = MenuButton.a(var2, (byte) 75);
                }
                var2 = nk.a("rule_pillar_0", (byte) -117);
                if (null != var2) {
                  DualLinkNode.field_o = MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("rule_0_0", (byte) 13);
                if (var2 != null) {
                  DelayedPacket.field_i = MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("rule_0_1", (byte) -114);
                if (var2 != null) {
                  IntegerValidationHelpers.field_b = MenuButton.a(var2, (byte) 73);
                }
                var2 = nk.a("rule_0_2", (byte) -106);
                if (var2 != null) {
                  TextFieldValidator.field_i = MenuButton.a(var2, (byte) 73);
                }
                var2 = nk.a("rule_0_3", (byte) -16);
                if (null != var2) {
                  nk.field_i = MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("rule_0_4", (byte) -117);
                if (null != var2) {
                  DualLinkNode.field_i = MenuButton.a(var2, (byte) 111);
                }
                var2 = nk.a("rule_0_5", (byte) -128);
                if (null != var2) {
                  BackgroundRegistry.field_a = MenuButton.a(var2, (byte) 123);
                }
                var2 = nk.a("rule_pillar_1", (byte) 51);
                if (null != var2) {
                  SaveResultsPromptScreen.field_r = MenuButton.a(var2, (byte) 117);
                }
                var2 = nk.a("rule_1_0", (byte) 87);
                if (null != var2) {
                  RichTextLayout.field_o = MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("rule_1_1", (byte) 2);
                if (null != var2) {
                  RasterCacheSurface.field_l = MenuButton.a(var2, (byte) 108);
                }
                var2 = nk.a("rule_1_2", (byte) -115);
                if (var2 != null) {
                  NineSliceFrame.field_c = MenuButton.a(var2, (byte) 118);
                }
                var2 = nk.a("rule_1_3", (byte) -114);
                if (var2 != null) {
                  tq.field_g = MenuButton.a(var2, (byte) 83);
                }
                var2 = nk.a("rule_1_4", (byte) -4);
                if (null != var2) {
                  GrowableIntList.field_n = MenuButton.a(var2, (byte) 78);
                }
                var2 = nk.a("rule_pillar_2", (byte) -109);
                if (null != var2) {
                  LobbyUiHelpers.reportSecurityHeading = MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("rule_2_0", (byte) -2);
                if (var2 != null) {
                  ed.field_a = MenuButton.a(var2, (byte) 122);
                }
                var2 = nk.a("rule_2_1", (byte) -114);
                if (var2 != null) {
                  ContextMenu.field_Rb = MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("rule_2_2", (byte) -15);
                if (null != var2) {
                  AchievementsScreen.field_I = MenuButton.a(var2, (byte) 123);
                }
                var2 = nk.a("createafreeaccount", (byte) 55);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("cancel", (byte) 25);
                if (var2 != null) {
                  ValidationIconWidget.field_L = MenuButton.a(var2, (byte) 108);
                }
                var2 = nk.a("pleaselogintoplay", (byte) -116);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 119);
                }
                var2 = nk.a("pleaselogin", (byte) 121);
                if (var2 != null) {
                  LevelPackLoader.field_a = MenuButton.a(var2, (byte) 99);
                }
                var2 = nk.a("pleaselogin_member", (byte) 60);
                if (null != var2) {
                  CanvasResizeController.field_k = MenuButton.a(var2, (byte) 72);
                }
                var2 = nk.a("invaliduserorpass", (byte) 42);
                if (var2 != null) {
                  DesertBackground.field_u = MenuButton.a(var2, (byte) 86);
                }
                var2 = nk.a("pleasetryagain", (byte) 48);
                if (null != var2) {
                  GameCanvas.field_b = MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("pleasereenterpass", (byte) 51);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 84);
                }
                var2 = nk.a("playfreeversion", (byte) 117);
                if (var2 != null) {
                  MonotonicTime.field_f = MenuButton.a(var2, (byte) 94);
                }
                var2 = nk.a("reloadgame", (byte) -18);
                if (null != var2) {
                  DialogMessagePanel.field_L = MenuButton.a(var2, (byte) 119);
                }
                var2 = nk.a("toserverlist", (byte) -125);
                if (var2 != null) {
                  Ball.field_H = MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("tocustomersupport", (byte) 112);
                if (var2 != null) {
                  MatchingTextValidator.field_p = MenuButton.a(var2, (byte) 76);
                }
                var2 = nk.a("changedisplayname", (byte) 61);
                if (var2 != null) {
                  BrickABrac.field_G = MenuButton.a(var2, (byte) 91);
                }
                var2 = nk.a("returntohomepage", (byte) -10);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 95);
                }
                var2 = nk.a("justplay", (byte) -116);
                if (var2 != null) {
                  nd.field_d = MenuButton.a(var2, (byte) 119);
                }
                var2 = nk.a("justplay_excl", (byte) 119);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 125);
                }
                var2 = nk.a("login", (byte) -119);
                if (null != var2) {
                  ok.field_a = MenuButton.a(var2, (byte) 76);
                }
                var2 = nk.a("goback", (byte) -120);
                if (var2 != null) {
                  ByteArrayNode.field_l = MenuButton.a(var2, (byte) 96);
                }
                var2 = nk.a("otheroptions", (byte) -118);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("proceed", (byte) 71);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("connectingtoserver", (byte) 1);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 101);
                }
                var2 = nk.a("pleasewait", (byte) -119);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 103);
                }
                var2 = nk.a("logging_in", (byte) 40);
                if (null != var2) {
                  WidgetTextLayout.field_d = MenuButton.a(var2, (byte) 95);
                }
                var2 = nk.a("reconnect", (byte) 5);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("backtoerror", (byte) -110);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 117);
                }
                var2 = nk.a("pleasecheckinternet", (byte) 67);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 114);
                }
                var2 = nk.a("attemptingtoreconnect", (byte) -115);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("connectionlost_reconnecting", (byte) 75);
                if (null != var2) {
                  GameScreen.field_b = MenuButton.a(var2, (byte) 97);
                }
                var2 = nk.a("connectionlost_withreason", (byte) -122);
                if (var2 != null) {
                  ProxySocketConnector.field_h = MenuButton.a(var2, (byte) 91);
                }
                var2 = nk.a("passwordverificationrequired", (byte) -128);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 119);
                }
                var2 = nk.a("invalidpass", (byte) -116);
                if (null != var2) {
                  TooltipSprite.field_n = MenuButton.a(var2, (byte) 123);
                }
                var2 = nk.a("retry", (byte) -124);
                if (var2 != null) {
                  TabbedPane.field_Tb = MenuButton.a(var2, (byte) 123);
                }
                var2 = nk.a("back", (byte) -114);
                if (var2 != null) {
                  HalloweenBackground.field_s = MenuButton.a(var2, (byte) 75);
                }
                var2 = nk.a("exitfullscreenmode", (byte) -112);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 116);
                }
                var2 = nk.a("quittowebsite", (byte) -124);
                if (var2 != null) {
                  wc.field_a = MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("connectionrestored", (byte) -113);
                if (null != var2) {
                  FarmBackground.field_t = MenuButton.a(var2, (byte) 78);
                }
                var2 = nk.a("warning_ifyouquit", (byte) -107);
                if (var2 != null) {
                  LevelResultSubmission.field_o = MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("warning_ifyouquitorleavepage", (byte) -115);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("resubscribe_withoutlosing_fs", (byte) -112);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("resubscribe_withoutlosing", (byte) -108);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 107);
                }
                var2 = nk.a("customersupport_withoutlosing_fs", (byte) -113);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 94);
                }
                var2 = nk.a("customersupport_withoutlosing", (byte) -125);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("js5help_withoutlosing_fs", (byte) 106);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 91);
                }
                var2 = nk.a("js5help_withoutlosing", (byte) -112);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 125);
                }
                var2 = nk.a("checkinternet_withoutlosing_fs", (byte) -128);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 93);
                }
                var2 = nk.a("checkinternet_withoutlosing", (byte) -8);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("create_intro", (byte) -126);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 100);
                }
                var2 = nk.a("create_sameaccounttip_unnamed", (byte) -117);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 112);
                }
                var2 = nk.a("dateofbirthprompt", (byte) 6);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 73);
                }
                var2 = nk.a("fetchingcountrylist", (byte) 97);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("countryprompt", (byte) -124);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("countrylisterror", (byte) 104);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 93);
                }
                var2 = nk.a("theonlypersonalquestions", (byte) -116);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 78);
                }
                var2 = nk.a("create_submittingdata", (byte) 34);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 97);
                }
                var2 = nk.a("check", (byte) 44);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 86);
                }
                var2 = nk.a("create_pleasechooseausername", (byte) -5);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 103);
                }
                var2 = nk.a("create_usernameblurb", (byte) 2);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 87);
                }
                var2 = nk.a("checkingavailability", (byte) 39);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("checking", (byte) -112);
                if (null != var2) {
                  DropTargetWidget.field_G = MenuButton.a(var2, (byte) 103);
                }
                var2 = nk.a("create_namealreadytaken", (byte) 19);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 93);
                }
                var2 = nk.a("create_sameaccounttip_named", (byte) -107);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("create_nosuggestions", (byte) -125);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 100);
                }
                var2 = nk.a("create_alternativelygoback", (byte) -116);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("create_available", (byte) 66);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("create_willnowshowtermsandconditions", (byte) -116);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("fetchingterms", (byte) -123);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 83);
                }
                var2 = nk.a("termserror", (byte) -19);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 75);
                }
                var2 = nk.a("create_iagree", (byte) 121);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 83);
                }
                var2 = nk.a("create_idisagree", (byte) -108);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 98);
                }
                var2 = nk.a("create_pleasescrolldowntoaccept", (byte) 59);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 117);
                }
                var2 = nk.a("create_linkaddress", (byte) -106);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("openinpopupwindow", (byte) 109);
                if (null != var2) {
                  GameConnectionShell.field_z = MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("create", (byte) 61);
                if (null != var2) {
                  GrowableIntList.field_d = MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("create_pleasechooseapassword", (byte) -120);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 105);
                }
                var2 = nk.a("create_passwordblurb", (byte) -113);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 113);
                }
                var2 = nk.a("create_nevergivepassword", (byte) -125);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("creatingyouraccount", (byte) -116);
                if (null != var2) {
                  MidiSynthesizer.field_o = MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("create_youmustaccept", (byte) 36);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 81);
                }
                var2 = nk.a("create_passwordsdifferent", (byte) 63);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("create_success", (byte) 106);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 87);
                }
                var2 = nk.a("day", (byte) 40);
                if (var2 != null) {
                  StrongCacheEntry.field_M = MenuButton.a(var2, (byte) 99);
                }
                var2 = nk.a("month", (byte) 36);
                if (null != var2) {
                  rl.field_f = MenuButton.a(var2, (byte) 86);
                }
                var2 = nk.a("year", (byte) 85);
                if (null != var2) {
                  kk.field_f = MenuButton.a(var2, (byte) 84);
                }
                var2 = nk.a("monthnames,0", (byte) -128);
                if (null != var2) {
                  Widget.field_v[0] = MenuButton.a(var2, (byte) 78);
                }
                var2 = nk.a("monthnames,1", (byte) -123);
                if (var2 != null) {
                  Widget.field_v[1] = MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("monthnames,2", (byte) 61);
                if (null != var2) {
                  Widget.field_v[2] = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("monthnames,3", (byte) -116);
                if (var2 != null) {
                  Widget.field_v[3] = MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("monthnames,4", (byte) -111);
                if (null != var2) {
                  Widget.field_v[4] = MenuButton.a(var2, (byte) 95);
                }
                var2 = nk.a("monthnames,5", (byte) -127);
                if (var2 != null) {
                  Widget.field_v[5] = MenuButton.a(var2, (byte) 114);
                }
                var2 = nk.a("monthnames,6", (byte) -108);
                if (null != var2) {
                  Widget.field_v[6] = MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("monthnames,7", (byte) 122);
                if (var2 != null) {
                  Widget.field_v[7] = MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("monthnames,8", (byte) -113);
                if (var2 != null) {
                  Widget.field_v[8] = MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("monthnames,9", (byte) -123);
                if (null != var2) {
                  Widget.field_v[9] = MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("monthnames,10", (byte) 83);
                if (null != var2) {
                  Widget.field_v[10] = MenuButton.a(var2, (byte) 99);
                }
                var2 = nk.a("monthnames,11", (byte) 112);
                if (var2 != null) {
                  Widget.field_v[11] = MenuButton.a(var2, (byte) 101);
                }
                var2 = nk.a("create_welcome", (byte) -17);
                if (var2 != null) {
                  PlayerNameChooserPanel.field_H = MenuButton.a(var2, (byte) 101);
                }
                var2 = nk.a("create_u13_welcome", (byte) -122);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 117);
                }
                var2 = nk.a("create_createanaccount", (byte) 0);
                if (null != var2) {
                  CheckboxWidgetRenderer.field_a = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("create_username", (byte) -111);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 125);
                }
                var2 = nk.a("create_displayname", (byte) -115);
                if (null != var2) {
                  BlankScreen.field_j = MenuButton.a(var2, (byte) 108);
                }
                var2 = nk.a("create_password", (byte) -108);
                if (var2 != null) {
                  wc.field_c = MenuButton.a(var2, (byte) 106);
                }
                var2 = nk.a("create_password_confirm", (byte) -121);
                if (null != var2) {
                  WidgetLayerStack.field_G = MenuButton.a(var2, (byte) 72);
                }
                var2 = nk.a("create_email", (byte) 29);
                if (var2 != null) {
                  IntNode.field_l = MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("create_email_confirm", (byte) -125);
                if (null != var2) {
                  DelayedPacket.field_o = MenuButton.a(var2, (byte) 73);
                }
                var2 = nk.a("create_age", (byte) 96);
                if (null != var2) {
                  HuffmanCodec.field_d = MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("create_u13_email", (byte) -125);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 85);
                }
                var2 = nk.a("create_u13_email_confirm", (byte) 67);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("create_dob", (byte) -109);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 117);
                }
                var2 = nk.a("create_country", (byte) 89);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 87);
                }
                var2 = nk.a("create_alternatives_header", (byte) 5);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("create_alternatives_select", (byte) -5);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("create_suggestions", (byte) -19);
                if (null != var2) {
                  AchievementIcon.field_l = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("create_more_suggestions", (byte) -119);
                if (var2 != null) {
                  IntegerValidationHelpers.field_c = MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("create_select_alternative", (byte) -117);
                if (var2 != null) {
                  aa.field_c = MenuButton.a(var2, (byte) 122);
                }
                var2 = nk.a("create_optin_news", (byte) -15);
                if (var2 != null) {
                  LevelCompleteScreen.field_z = MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("create_agreeterms", (byte) -120);
                if (null != var2) {
                  ch.field_e = MenuButton.a(var2, (byte) 91);
                }
                var2 = nk.a("create_u13terms", (byte) 43);
                if (var2 != null) {
                  MainMenuScreen.field_z = MenuButton.a(var2, (byte) 70);
                }
                var2 = nk.a("login_username_email", (byte) -128);
                if (var2 != null) {
                  PlayerInputBatch.field_p = MenuButton.a(var2, (byte) 93);
                }
                var2 = nk.a("login_username", (byte) 66);
                if (var2 != null) {
                  IndexedSpriteGeometry.field_c = MenuButton.a(var2, (byte) 98);
                }
                var2 = nk.a("login_email", (byte) 34);
                if (null != var2) {
                  IntegerParsingHelpers.field_a = MenuButton.a(var2, (byte) 91);
                }
                var2 = nk.a("login_username_tooltip", (byte) -127);
                if (null != var2) {
                  ValidatedTextFieldWidget.field_X = MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("login_password_tooltip", (byte) 120);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 114);
                }
                var2 = nk.a("login_login_tooltip", (byte) 96);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("login_create_tooltip", (byte) 97);
                if (var2 != null) {
                  MidiSynthesizer.field_q = MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("login_justplay_tooltip", (byte) -128);
                if (null != var2) {
                  SoundCache.field_i = MenuButton.a(var2, (byte) 111);
                }
                var2 = nk.a("login_back_tooltip", (byte) 41);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 125);
                }
                var2 = nk.a("login_no_displayname", (byte) 60);
                if (var2 != null) {
                  EmailAvailabilityRequest.field_d = MenuButton.a(var2, (byte) 123);
                }
                var2 = nk.a("create_username_tooltip", (byte) 51);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 73);
                }
                var2 = nk.a("create_username_hint", (byte) -128);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 95);
                }
                var2 = nk.a("create_displayname_tooltip", (byte) 124);
                if (null != var2) {
                  hh.field_a = MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("create_displayname_hint", (byte) -119);
                if (var2 != null) {
                  GameClock.field_h = MenuButton.a(var2, (byte) 72);
                }
                var2 = nk.a("create_password_tooltip", (byte) -19);
                if (var2 != null) {
                  IntKeyIndex.field_a = MenuButton.a(var2, (byte) 119);
                }
                var2 = nk.a("create_password_hint", (byte) -128);
                if (var2 != null) {
                  InstructionsScreen.field_x = MenuButton.a(var2, (byte) 111);
                }
                var2 = nk.a("create_password_confirm_tooltip", (byte) 21);
                if (var2 != null) {
                  BoundedFile.field_b = MenuButton.a(var2, (byte) 73);
                }
                var2 = nk.a("create_email_tooltip", (byte) 119);
                if (null != var2) {
                  rf.field_d = MenuButton.a(var2, (byte) 108);
                }
                var2 = nk.a("create_email_confirm_tooltip", (byte) -113);
                if (var2 != null) {
                  ResourceArchive.field_e = MenuButton.a(var2, (byte) 107);
                }
                var2 = nk.a("create_age_tooltip", (byte) -124);
                if (null != var2) {
                  hc.field_d = MenuButton.a(var2, (byte) 73);
                }
                var2 = nk.a("create_optin_news_tooltip", (byte) -117);
                if (var2 != null) {
                  ok.field_e = MenuButton.a(var2, (byte) 79);
                }
                var2 = nk.a("create_u13_email_tooltip", (byte) -122);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 111);
                }
                var2 = nk.a("create_u13_email_confirm_tooltip", (byte) -118);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("create_dob_tooltip", (byte) 30);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 127);
                }
                var2 = nk.a("create_country_tooltip", (byte) 51);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 96);
                }
                var2 = nk.a("create_optin_tooltip", (byte) -127);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 122);
                }
                var2 = nk.a("create_continue", (byte) -111);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 122);
                }
                var2 = nk.a("create_username_unavailable", (byte) -113);
                if (var2 != null) {
                  ScreenNavigationHelpers.field_f = MenuButton.a(var2, (byte) 125);
                }
                var2 = nk.a("create_username_available", (byte) 74);
                if (var2 != null) {
                  MouseWheelSource.field_d = MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("create_alert_namelength", (byte) 6);
                if (var2 != null) {
                  MenuScreen.field_o = MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("create_alert_namechars", (byte) -109);
                if (var2 != null) {
                  RankingsRequest.field_i = MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("create_alert_nameleadingspace", (byte) -120);
                if (null != var2) {
                  MenuButton.field_g = MenuButton.a(var2, (byte) 95);
                }
                var2 = nk.a("create_alert_doublespace", (byte) -126);
                if (null != var2) {
                  MusicPatch.field_n = MenuButton.a(var2, (byte) 99);
                }
                var2 = nk.a("create_alert_passchars", (byte) -109);
                if (var2 != null) {
                  HuffmanCodec.field_c = MenuButton.a(var2, (byte) 102);
                }
                var2 = nk.a("create_alert_passrepeated", (byte) -18);
                if (var2 != null) {
                  WhirlpoolHasher.field_i = MenuButton.a(var2, (byte) 76);
                }
                var2 = nk.a("create_alert_passlength", (byte) 29);
                if (null != var2) {
                  sc.field_a = MenuButton.a(var2, (byte) 86);
                }
                var2 = nk.a("create_alert_passcontainsname", (byte) -107);
                if (null != var2) {
                  BackgroundRegistry.field_b = MenuButton.a(var2, (byte) 93);
                }
                var2 = nk.a("create_alert_passcontainsemail", (byte) 45);
                if (var2 != null) {
                  StateIconLabel.field_Tb = MenuButton.a(var2, (byte) 116);
                }
                var2 = nk.a("create_alert_passcontainsname_partial", (byte) 51);
                if (var2 != null) {
                  GameUiController.field_f = MenuButton.a(var2, (byte) 117);
                }
                var2 = nk.a("create_alert_checkname", (byte) 55);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("create_alert_invalidemail", (byte) -120);
                if (var2 != null) {
                  ValidationIconWidget.invalidEmailMessage = MenuButton.a(var2, (byte) 100);
                }
                var2 = nk.a("create_alert_email_unavailable", (byte) -124);
                if (var2 != null) {
                  ConstructionBackground.field_s = MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("create_alert_invaliddate", (byte) -116);
                if (null != var2) {
                  ScrollPaneWithFooter.field_Rb = MenuButton.a(var2, (byte) 73);
                }
                var2 = nk.a("create_alert_invalidage", (byte) -114);
                if (null != var2) {
                  FarmBackground.field_y = MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("create_alert_yearrange", (byte) -122);
                if (null != var2) {
                  Under13RegistrationNoticePanel.field_J = MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("create_alert_mismatch", (byte) 26);
                if (var2 != null) {
                  AccountContentTransitionLayer.field_sb = MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("create_passwordvalid", (byte) -123);
                if (null != var2) {
                  SoundPlayback.field_k = MenuButton.a(var2, (byte) 85);
                }
                var2 = nk.a("create_emailvalid", (byte) -108);
                if (null != var2) {
                  WeightedLruCache.validEmailMessage = MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("create_account_success", (byte) -126);
                if (var2 != null) {
                  FramedMenuScreen.field_r = MenuButton.a(var2, (byte) 101);
                }
                var2 = nk.a("invalid_name", (byte) -113);
                if (null != var2) {
                  LobbyGame.field_Xb = MenuButton.a(var2, (byte) 122);
                }
                var2 = nk.a("cannot_add_yourself", (byte) -128);
                if (var2 != null) {
                  rj.field_a = MenuButton.a(var2, (byte) 113);
                }
                var2 = nk.a("unable_to_add_friend", (byte) -114);
                if (null != var2) {
                  kd.field_b = MenuButton.a(var2, (byte) 117);
                }
                var2 = nk.a("unable_to_add_ignore", (byte) -110);
                if (var2 != null) {
                  df.field_c = MenuButton.a(var2, (byte) 99);
                }
                var2 = nk.a("unable_to_delete_friend", (byte) 35);
                if (null != var2) {
                  ScrollPaneWithFooter.field_Ub = MenuButton.a(var2, (byte) 81);
                }
                var2 = nk.a("unable_to_delete_ignore", (byte) 34);
                if (null != var2) {
                  hd.field_b = MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("friendlistfull", (byte) -112);
                if (null != var2) {
                  er.field_e = MenuButton.a(var2, (byte) 97);
                }
                var2 = nk.a("friendlistdupe", (byte) 19);
                if (var2 != null) {
                  TextChoiceDialogStyles.field_d = MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("friendnotfound", (byte) 56);
                if (null != var2) {
                  MusicVoice.field_C = MenuButton.a(var2, (byte) 109);
                }
                var2 = nk.a("ignorelistfull", (byte) 40);
                if (null != var2) {
                  ap.field_d = MenuButton.a(var2, (byte) 98);
                }
                var2 = nk.a("ignorelistdupe", (byte) 73);
                if (var2 != null) {
                  DraggableWidget.field_J = MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("ignorenotfound", (byte) 26);
                if (var2 != null) {
                  WeightedLruCache.field_h = MenuButton.a(var2, (byte) 99);
                }
                var2 = nk.a("removeignorefirst", (byte) -113);
                if (null != var2) {
                  ConstructionBackground.field_u = MenuButton.a(var2, (byte) 104);
                }
                var2 = nk.a("removefriendfirst", (byte) -111);
                if (var2 != null) {
                  tq.field_a = MenuButton.a(var2, (byte) 93);
                }
                var2 = nk.a("enterfriend_add", (byte) -12);
                if (null != var2) {
                  ArchiveNetworkClient.field_t = MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("enterfriend_del", (byte) 37);
                if (null != var2) {
                  TableDataRequest.field_j = MenuButton.a(var2, (byte) 111);
                }
                var2 = nk.a("enterignore_add", (byte) -115);
                if (null != var2) {
                  CacheIoWorker.field_e = MenuButton.a(var2, (byte) 118);
                }
                var2 = nk.a("enterignore_del", (byte) -107);
                if (var2 != null) {
                  MultiplayerExitScreen.field_A = MenuButton.a(var2, (byte) 96);
                }
                var2 = nk.a("text_removed_from_game", (byte) 25);
                if (null != var2) {
                  EmailValidator.field_k = MenuButton.a(var2, (byte) 70);
                }
                var2 = nk.a("text_lobby_pleaselogin_free", (byte) 63);
                if (null != var2) {
                  BrickGameLayerController.field_b = MenuButton.a(var2, (byte) 105);
                }
                var2 = nk.a("opengl", (byte) -121);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 95);
                }
                var2 = nk.a("sse", (byte) 2);
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 114);
                }
                var2 = nk.a("purejava", (byte) 26);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 127);
                }
                var2 = nk.a("waitingfor_graphics", (byte) -128);
                if (null != var2) {
                  OutgoingPacketHelpers.field_e = MenuButton.a(var2, (byte) 118);
                }
                var2 = nk.a("waitingfor_models", (byte) -122);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 83);
                }
                var2 = nk.a("waitingfor_fonts", (byte) -5);
                if (null != var2) {
                  RadialSelectorWidget.field_P = MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("waitingfor_soundeffects", (byte) 116);
                if (var2 != null) {
                  MovingBody.field_n = MenuButton.a(var2, (byte) 111);
                }
                var2 = nk.a("waitingfor_music", (byte) 18);
                if (var2 != null) {
                  BallPulseEffect.field_i = MenuButton.a(var2, (byte) 116);
                }
                var2 = nk.a("waitingfor_instruments", (byte) 41);
                if (null != var2) {
                  AlternateNumericLoginCredentials.field_n = MenuButton.a(var2, (byte) 83);
                }
                var2 = nk.a("waitingfor_levels", (byte) -117);
                if (var2 != null) {
                  fa.field_j = MenuButton.a(var2, (byte) 99);
                }
                var2 = nk.a("waitingfor_extradata", (byte) 5);
                if (null != var2) {
                  IntHistoryBuffer.field_k = MenuButton.a(var2, (byte) 79);
                }
                var2 = nk.a("waitingfor_languages", (byte) 65);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 104);
                }
                var2 = nk.a("waitingfor_textures", (byte) -127);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 70);
                }
                var2 = nk.a("waitingfor_animations", (byte) 116);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 85);
                }
                var2 = nk.a("loading_graphics", (byte) 111);
                if (null != var2) {
                  WidgetGroup.field_F = MenuButton.a(var2, (byte) 87);
                }
                var2 = nk.a("loading_models", (byte) -110);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 113);
                }
                var2 = nk.a("loading_fonts", (byte) -107);
                if (null != var2) {
                  ConditionalTextValue.field_k = MenuButton.a(var2, (byte) 105);
                }
                var2 = nk.a("loading_soundeffects", (byte) -17);
                if (var2 != null) {
                  ValidationIconWidget.field_Q = MenuButton.a(var2, (byte) 108);
                }
                var2 = nk.a("loading_music", (byte) 123);
                if (var2 != null) {
                  EmailValidator.field_m = MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("loading_instruments", (byte) -123);
                if (var2 != null) {
                  LinkWidgetRenderer.field_a = MenuButton.a(var2, (byte) 127);
                }
                var2 = nk.a("loading_levels", (byte) -7);
                if (var2 != null) {
                  uo.field_a = MenuButton.a(var2, (byte) 95);
                }
                var2 = nk.a("loading_extradata", (byte) 92);
                if (null != var2) {
                  qm.field_e = MenuButton.a(var2, (byte) 84);
                }
                var2 = nk.a("loading_languages", (byte) 76);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("loading_textures", (byte) -107);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 75);
                }
                var2 = nk.a("loading_animations", (byte) -120);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 106);
                }
                var2 = nk.a("unpacking_graphics", (byte) 53);
                if (var2 != null) {
                  MessageScreen.field_u = MenuButton.a(var2, (byte) 97);
                }
                var2 = nk.a("unpacking_models", (byte) -128);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 104);
                }
                var2 = nk.a("unpacking_soundeffects", (byte) 73);
                if (var2 != null) {
                  BitPacketBuffer.field_s = MenuButton.a(var2, (byte) 78);
                }
                var2 = nk.a("unpacking_music", (byte) 9);
                if (null != var2) {
                  ValidatedTextFieldWidget.field_bb = MenuButton.a(var2, (byte) 113);
                }
                var2 = nk.a("unpacking_levels", (byte) 78);
                if (var2 != null) {
                  Ball.field_x = MenuButton.a(var2, (byte) 97);
                }
                var2 = nk.a("unpacking_languages", (byte) 15);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 72);
                }
                var2 = nk.a("unpacking_animations", (byte) -124);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 106);
                }
                var2 = nk.a("unpacking_toolkit", (byte) -128);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 81);
                }
                var2 = nk.a("instructions", (byte) -119);
                if (null != var2) {
                  TextHotspotRegion.field_l = MenuButton.a(var2, (byte) 86);
                }
                var2 = nk.a("tutorial", (byte) -120);
                if (null != var2) {
                  LevelPackLoader.field_i = MenuButton.a(var2, (byte) 122);
                }
                var2 = nk.a("playtutorial", (byte) 113);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 86);
                }
                var2 = nk.a("sound_colon", (byte) 48);
                if (null != var2) {
                  LevelResultSubmission.field_q = MenuButton.a(var2, (byte) 111);
                }
                var2 = nk.a("music_colon", (byte) 3);
                if (null != var2) {
                  ArchiveNetworkClient.field_r = MenuButton.a(var2, (byte) 113);
                }
                var2 = nk.a("fullscreen", (byte) -118);
                if (var2 != null) {
                  GamePresentationHelpers.field_b = MenuButton.a(var2, (byte) 112);
                }
                var2 = nk.a("screensize", (byte) -107);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 75);
                }
                var2 = nk.a("highscores", (byte) 76);
                if (null != var2) {
                  MusicCrossfadeStream.field_B = MenuButton.a(var2, (byte) 107);
                }
                var2 = nk.a("rankings", (byte) 113);
                if (var2 != null) {
                  pp.field_c = MenuButton.a(var2, (byte) 107);
                }
                var2 = nk.a("achievements", (byte) -116);
                if (null != var2) {
                  FocusableWidget.field_D = MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("achievementsthisgame", (byte) 22);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("achievementsthissession", (byte) 70);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 106);
                }
                var2 = nk.a("watchintroduction", (byte) -117);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("quit", (byte) 118);
                if (var2 != null) {
                  HighscorePackSelector.field_g = MenuButton.a(var2, (byte) 97);
                }
                var2 = nk.a("login_createaccount", (byte) -121);
                if (var2 != null) {
                  UiComponent.field_mb = MenuButton.a(var2, (byte) 103);
                }
                var2 = nk.a("tohighscores", (byte) 25);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("returntomainmenu", (byte) -4);
                if (null != var2) {
                  VerticalScrollbar.field_Rb = MenuButton.a(var2, (byte) 118);
                }
                var2 = nk.a("returntopausemenu", (byte) -5);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("returntooptionsmenu_notpaused", (byte) -109);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 75);
                }
                var2 = nk.a("mainmenu", (byte) -17);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 85);
                }
                var2 = nk.a("pausemenu", (byte) 107);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 127);
                }
                var2 = nk.a("optionsmenu_notpaused", (byte) -111);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("menu", (byte) 35);
                if (null != var2) {
                  jj.field_b = MenuButton.a(var2, (byte) 127);
                }
                var2 = nk.a("selectlevel", (byte) 36);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 72);
                }
                var2 = nk.a("nextlevel", (byte) -109);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("startgame", (byte) -124);
                if (null != var2) {
                  ConstructionBackground.field_r = MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("newgame", (byte) 113);
                if (var2 != null) {
                  UnderwaterBackground.field_v = MenuButton.a(var2, (byte) 101);
                }
                var2 = nk.a("resumegame", (byte) -119);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 111);
                }
                var2 = nk.a("resumetutorial", (byte) 109);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("skip", (byte) 109);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("skiptutorial", (byte) 39);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 98);
                }
                var2 = nk.a("skipending", (byte) -114);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("restartlevel", (byte) 30);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 102);
                }
                var2 = nk.a("endtest", (byte) -123);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("endgame", (byte) -116);
                if (var2 != null) {
                  LevelPackLoader.field_d = MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("endtutorial", (byte) 118);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 108);
                }
                var2 = nk.a("ok", (byte) -108);
                if (null != var2) {
                  TextFieldValidator.field_j = MenuButton.a(var2, (byte) 87);
                }
                var2 = nk.a("on", (byte) -127);
                if (var2 != null) {
                  MusicVoiceMixer.field_q = MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("off", (byte) 125);
                if (var2 != null) {
                  BufferedFile.field_q = MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("previous", (byte) 56);
                if (null != var2) {
                  DiagnosticTextLine.field_i = MenuButton.a(var2, (byte) 104);
                }
                var2 = nk.a("prev", (byte) -122);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("next", (byte) 9);
                if (null != var2) {
                  PauseMenuScreen.field_u = MenuButton.a(var2, (byte) 84);
                }
                var2 = nk.a("graphics_colon", (byte) -122);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 112);
                }
                var2 = nk.a("hotseatmultiplayer", (byte) 118);
                if (null != var2) {
                  MatchResultScreen.field_r = MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("entermultiplayerlobby", (byte) 104);
                if (var2 != null) {
                  ArchiveNetworkRequest.field_H = MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("singleplayergame", (byte) -107);
                if (var2 != null) {
                  BirthDateEntryPanel.field_O = MenuButton.a(var2, (byte) 102);
                }
                var2 = nk.a("returntogame", (byte) -125);
                if (var2 != null) {
                  DebouncedValidationSource.field_e = MenuButton.a(var2, (byte) 103);
                }
                var2 = nk.a("endgameresign", (byte) -110);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("offerdraw", (byte) 117);
                if (null != var2) {
                  t.field_b = MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("canceldraw", (byte) -106);
                if (null != var2) {
                  fh.field_a = MenuButton.a(var2, (byte) 84);
                }
                var2 = nk.a("acceptdraw", (byte) -116);
                if (var2 != null) {
                  er.field_a = MenuButton.a(var2, (byte) 86);
                }
                var2 = nk.a("resign", (byte) 27);
                if (var2 != null) {
                  StrongCacheEntry.field_H = MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("returntolobby", (byte) -118);
                if (null != var2) {
                  di.field_a = MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("cont", (byte) -117);
                if (null != var2) {
                  UsernameSuggestionPanel.field_L = MenuButton.a(var2, (byte) 111);
                }
                var2 = nk.a("continue_spectating", (byte) -119);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 77);
                }
                var2 = nk.a("messages", (byte) -127);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("graphics_fastest", (byte) -114);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 98);
                }
                var2 = nk.a("graphics_medium", (byte) 50);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 125);
                }
                var2 = nk.a("graphics_best", (byte) 107);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("graphics_directx", (byte) -127);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 113);
                }
                var2 = nk.a("graphics_opengl", (byte) 105);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 96);
                }
                var2 = nk.a("graphics_java", (byte) 65);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 93);
                }
                var2 = nk.a("graphics_quality_high", (byte) 47);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("graphics_quality_low", (byte) 113);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 100);
                }
                var2 = nk.a("graphics_mode", (byte) -118);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("graphics_quality", (byte) -119);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("mode", (byte) 39);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 122);
                }
                var2 = nk.a("quality", (byte) -120);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 76);
                }
                var2 = nk.a("keys", (byte) 12);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("objective", (byte) 95);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("currentobjective", (byte) -122);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("pressescforpausemenu", (byte) 57);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("pressescforpausemenuortoskiptutorial", (byte) -125);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 79);
                }
                var2 = nk.a("pressescforoptionsmenu_doesntpause", (byte) -109);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("pressescforoptionsmenu_doesntpause_short", (byte) -118);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("powerups", (byte) -127);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("latestlevel_suffix", (byte) -128);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 86);
                }
                var2 = nk.a("unreachedlevel_name", (byte) -109);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 109);
                }
                var2 = nk.a("unreachedlevel_cannotplayreason", (byte) 5);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("unreachedlevel_cannotplayreason_shorter", (byte) 61);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 78);
                }
                var2 = nk.a("unreachedworld_cannotplayreason", (byte) -110);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 111);
                }
                var2 = nk.a("memberslevel_name", (byte) -119);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("memberslevel_cannotplayreason", (byte) -126);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 122);
                }
                var2 = nk.a("membersworld_cannotplayreason", (byte) 68);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 94);
                }
                var2 = nk.a("unreachedlevel_createtip", (byte) 109);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 106);
                }
                var2 = nk.a("unreachedlevel_createtip_line1", (byte) -3);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("unreachedlevel_createtip_line2", (byte) -7);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("unreachedlevel_logintip", (byte) -122);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 73);
                }
                var2 = nk.a("memberslevel_logintip", (byte) -109);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("displayname_none", (byte) 31);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 79);
                }
                var2 = nk.a("levelxofy1", (byte) 113);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 97);
                }
                var2 = nk.a("levelxofy2", (byte) 112);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 103);
                }
                var2 = nk.a("levelxofy", (byte) -124);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 100);
                }
                var2 = nk.a("ingame_level", (byte) 113);
                if (null != var2) {
                  AlternateNumericLoginCredentials.field_p = MenuButton.a(var2, (byte) 117);
                }
                var2 = nk.a("mouseoveranicon", (byte) -107);
                if (var2 != null) {
                  ProducerFramebuffer.field_h = MenuButton.a(var2, (byte) 73);
                }
                var2 = nk.a("notyetachieved", (byte) 55);
                if (null != var2) {
                  ResourcePreparationEntry.field_c = MenuButton.a(var2, (byte) 114);
                }
                var2 = nk.a("achieved", (byte) -125);
                if (null != var2) {
                  DesertBackground.field_s = MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("orbpoints", (byte) 16);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 76);
                }
                var2 = nk.a("orbcoins", (byte) -123);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 105);
                }
                var2 = nk.a("orbpoints_colon", (byte) -123);
                if (null != var2) {
                  LevelPackLoader.field_c = MenuButton.a(var2, (byte) 117);
                }
                var2 = nk.a("orbcoins_colon", (byte) -7);
                if (null != var2) {
                  UsernameAvailabilityValidator.field_m = MenuButton.a(var2, (byte) 94);
                }
                var2 = nk.a("achieved_colon_description", (byte) 86);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 108);
                }
                var2 = nk.a("secretachievement", (byte) 33);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("no_highscores", (byte) 54);
                if (null != var2) {
                  ArchiveNetworkRequest.field_J = MenuButton.a(var2, (byte) 114);
                }
                var2 = nk.a("hs_name", (byte) 10);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 100);
                }
                var2 = nk.a("hs_level", (byte) -114);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 79);
                }
                var2 = nk.a("hs_fromlevel", (byte) 60);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 94);
                }
                var2 = nk.a("hs_tolevel", (byte) -116);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 125);
                }
                var2 = nk.a("hs_score", (byte) -110);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 119);
                }
                var2 = nk.a("hs_end", (byte) 113);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 81);
                }
                var2 = nk.a("ingame_score", (byte) 119);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("score_colon", (byte) -107);
                if (var2 != null) {
                  LevelResultSubmission.field_j = MenuButton.a(var2, (byte) 98);
                }
                var2 = nk.a("mp_leavegame", (byte) 75);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 118);
                }
                var2 = nk.a("mp_offerrematch", (byte) 110);
                if (var2 != null) {
                  RectangleBody.field_t = MenuButton.a(var2, (byte) 81);
                }
                var2 = nk.a("mp_offerrematch_unrated", (byte) 45);
                if (var2 != null) {
                  ResourcePreparationQueue.field_a = MenuButton.a(var2, (byte) 85);
                }
                var2 = nk.a("mp_acceptrematch", (byte) -114);
                if (var2 != null) {
                  MusicPatch.field_m = MenuButton.a(var2, (byte) 83);
                }
                var2 = nk.a("mp_acceptrematch_unrated", (byte) 12);
                if (null != var2) {
                  qm.field_c = MenuButton.a(var2, (byte) 117);
                }
                var2 = nk.a("mp_cancelrematch", (byte) 0);
                if (null != var2) {
                  LoginCredentials.field_g = MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("mp_cancelrematch_unrated", (byte) -111);
                if (null != var2) {
                  ContentTransitionPhase.field_a = MenuButton.a(var2, (byte) 98);
                }
                var2 = nk.a("mp_rematchnewgame", (byte) -110);
                if (null != var2) {
                  GameRenderAudioHelpers.field_b = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("mp_rematchnewgame_unrated", (byte) -116);
                if (null != var2) {
                  TabbedPane.field_Pb = MenuButton.a(var2, (byte) 117);
                }
                var2 = nk.a("mp_x_wantstodraw", (byte) -106);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 117);
                }
                var2 = nk.a("mp_x_offersrematch", (byte) 59);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("mp_x_offersrematch_unrated", (byte) -118);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 72);
                }
                var2 = nk.a("mp_youofferrematch", (byte) 15);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 78);
                }
                var2 = nk.a("mp_youofferrematch_unrated", (byte) -124);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 99);
                }
                var2 = nk.a("mp_youofferdraw", (byte) 45);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("mp_youresigned", (byte) 115);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("mp_youresigned_rematch", (byte) -112);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 95);
                }
                var2 = nk.a("mp_x_hasresignedandleft", (byte) 70);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 106);
                }
                var2 = nk.a("mp_x_hasresigned_rematch", (byte) -3);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("mp_x_hasresigned", (byte) 110);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("mp_x_hasleft", (byte) 88);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 114);
                }
                var2 = nk.a("mp_x_haswon", (byte) -114);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("mp_youhavewon", (byte) -128);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 81);
                }
                var2 = nk.a("mp_gamedrawn", (byte) -126);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 116);
                }
                var2 = nk.a("mp_timeremaining", (byte) -4);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 96);
                }
                var2 = nk.a("mp_x_turn", (byte) 77);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 95);
                }
                var2 = nk.a("mp_yourturn", (byte) 14);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 99);
                }
                var2 = nk.a("gameover", (byte) 68);
                if (var2 != null) {
                  SpaceBackground.field_s = MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("mp_hidechat", (byte) 4);
                if (null != var2) {
                  PopupWidgetLayer.field_V = MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("mp_showchat_nounread", (byte) 116);
                if (var2 != null) {
                  BubbleDistortion.field_A = MenuButton.a(var2, (byte) 109);
                }
                var2 = nk.a("mp_showchat_unread1", (byte) 111);
                if (null != var2) {
                  BirthDateValidator.field_g = MenuButton.a(var2, (byte) 117);
                }
                var2 = nk.a("mp_showchat_unread2", (byte) -106);
                if (var2 != null) {
                  ArchiveSource.field_a = MenuButton.a(var2, (byte) 78);
                }
                var2 = nk.a("click_to_quickchat", (byte) -119);
                if (null != var2) {
                  MainMenuScreen.field_y = MenuButton.a(var2, (byte) 112);
                }
                var2 = nk.a("autorespond", (byte) -107);
                if (null != var2) {
                  GameOverlayHelpers.field_b = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("quickchat_help", (byte) 37);
                if (var2 != null) {
                  ScreenNavigationHelpers.quickChatHelpTitle = MenuButton.a(var2, (byte) 127);
                }
                var2 = nk.a("quickchat_help_title", (byte) 63);
                if (null != var2) {
                  DelegatingCanvas.field_b = MenuButton.a(var2, (byte) 100);
                }
                var2 = nk.a("quickchat_shortcut_help,0", (byte) -117);
                if (null != var2) {
                  MenuSelection.field_p[0] = MenuButton.a(var2, (byte) 75);
                }
                var2 = nk.a("quickchat_shortcut_help,1", (byte) 20);
                if (null != var2) {
                  MenuSelection.field_p[1] = MenuButton.a(var2, (byte) 119);
                }
                var2 = nk.a("quickchat_shortcut_help,2", (byte) -16);
                if (null != var2) {
                  MenuSelection.field_p[2] = MenuButton.a(var2, (byte) 84);
                }
                var2 = nk.a("quickchat_shortcut_help,3", (byte) 12);
                if (null != var2) {
                  MenuSelection.field_p[3] = MenuButton.a(var2, (byte) 108);
                }
                var2 = nk.a("quickchat_shortcut_help,4", (byte) 18);
                if (var2 != null) {
                  MenuSelection.field_p[4] = MenuButton.a(var2, (byte) 107);
                }
                var2 = nk.a("quickchat_shortcut_help,5", (byte) 41);
                if (null != var2) {
                  MenuSelection.field_p[5] = MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("quickchat_shortcut_keys,0", (byte) 119);
                if (var2 != null) {
                  PlayerNameChooserPanel.field_M[0] = MenuButton.a(var2, (byte) 122);
                }
                var2 = nk.a("quickchat_shortcut_keys,1", (byte) 51);
                if (null != var2) {
                  PlayerNameChooserPanel.field_M[1] = MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("quickchat_shortcut_keys,2", (byte) 26);
                if (null != var2) {
                  PlayerNameChooserPanel.field_M[2] = MenuButton.a(var2, (byte) 118);
                }
                var2 = nk.a("quickchat_shortcut_keys,3", (byte) 101);
                if (null != var2) {
                  PlayerNameChooserPanel.field_M[3] = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("quickchat_shortcut_keys,4", (byte) 124);
                if (var2 != null) {
                  PlayerNameChooserPanel.field_M[4] = MenuButton.a(var2, (byte) 94);
                }
                var2 = nk.a("quickchat_shortcut_keys,5", (byte) -119);
                if (var2 != null) {
                  PlayerNameChooserPanel.field_M[5] = MenuButton.a(var2, (byte) 100);
                }
                var2 = nk.a("keychar_the_character_under_questionmark", (byte) 109);
                if (null != var2) {
                  SoundCache.field_h = RankingsRequest.decodeCp1252Byte((byte) -99, var2[0]);
                }
                var2 = nk.a("rating_noratings", (byte) -116);
                if (null != var2) {
                  ProxyAuthenticationRequiredException.field_f = MenuButton.a(var2, (byte) 79);
                }
                var2 = nk.a("rating_rating", (byte) -115);
                if (null != var2) {
                  QuickChatCategoryRegistry.field_e = MenuButton.a(var2, (byte) 127);
                }
                var2 = nk.a("rating_played", (byte) -128);
                if (null != var2) {
                  NodeDeque.field_c = MenuButton.a(var2, (byte) 101);
                }
                var2 = nk.a("rating_won", (byte) -117);
                if (var2 != null) {
                  WidgetPaintStyle.field_e = MenuButton.a(var2, (byte) 91);
                }
                var2 = nk.a("rating_lost", (byte) -126);
                if (var2 != null) {
                  ScrollPaneWithFooter.field_Vb = MenuButton.a(var2, (byte) 84);
                }
                var2 = nk.a("rating_drawn", (byte) 62);
                if (null != var2) {
                  BufferedFile.field_p = MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("benefits_fullscreen", (byte) 37);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("benefits_noadverts", (byte) -121);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 84);
                }
                var2 = nk.a("benefits_price", (byte) 89);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 98);
                }
                var2 = nk.a("members_expansion_benefits,0", (byte) -116);
                if (var2 != null) {
                  MatchCompleteScreen.field_y[0] = MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("members_expansion_benefits,1", (byte) -10);
                if (null != var2) {
                  MatchCompleteScreen.field_y[1] = MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("members_expansion_benefits,2", (byte) -122);
                if (var2 != null) {
                  MatchCompleteScreen.field_y[2] = MenuButton.a(var2, (byte) 103);
                }
                var2 = nk.a("members_expansion_price_top", (byte) -121);
                if (null != var2) {
                  ByteStorage.field_a = MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("members_expansion_price_bottom", (byte) -124);
                if (var2 != null) {
                  ArchiveIndex.field_q = MenuButton.a(var2, (byte) 125);
                }
                var2 = nk.a("reconnect_lost_seq,0", (byte) -106);
                if (var2 != null) {
                  ContentTransitionPhase.field_e[0] = MenuButton.a(var2, (byte) 115);
                }
                var2 = nk.a("reconnect_lost_seq,1", (byte) -108);
                if (null != var2) {
                  ContentTransitionPhase.field_e[1] = MenuButton.a(var2, (byte) 127);
                }
                var2 = nk.a("reconnect_lost_seq,2", (byte) -114);
                if (null != var2) {
                  ContentTransitionPhase.field_e[2] = MenuButton.a(var2, (byte) 99);
                }
                var2 = nk.a("reconnect_lost_seq,3", (byte) -6);
                if (var2 != null) {
                  ContentTransitionPhase.field_e[3] = MenuButton.a(var2, (byte) 106);
                }
                var2 = nk.a("reconnect_lost", (byte) -110);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 107);
                }
                var2 = nk.a("reconnect_restored", (byte) 34);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 123);
                }
                var2 = nk.a("reconnect_please_check", (byte) -106);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("reconnect_wait", (byte) -112);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 105);
                }
                var2 = nk.a("reconnect_retry", (byte) 110);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 80);
                }
                var2 = nk.a("reconnect_resume", (byte) -120);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 101);
                }
                var2 = nk.a("reconnect_or", (byte) 6);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 101);
                }
                var2 = nk.a("reconnect_exitfs", (byte) 27);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 118);
                }
                var2 = nk.a("reconnect_exitfs_quit", (byte) 118);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 113);
                }
                var2 = nk.a("reconnect_quit", (byte) -125);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("reconnect_check_fs", (byte) -112);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("reconnect_check_nonfs", (byte) -125);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("fs_accept_beforeaccept", (byte) -125);
                if (var2 != null) {
                  MultiValueSliderRenderer.field_k = MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("fs_button_accept", (byte) 6);
                if (null != var2) {
                  GrowableIntList.field_c = MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("fs_accept_afteraccept", (byte) -115);
                if (var2 != null) {
                  rf.field_e = MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("fs_button_cancel", (byte) 41);
            }
            void runChunk3() throws java.lang.RuntimeException {
                if (null != var2) {
                  di.field_c = MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("fs_accept_aftercancel", (byte) -127);
                if (var2 != null) {
                  u.field_f = MenuButton.a(var2, (byte) 73);
                }
                var2 = nk.a("fs_accept_countdown_sing", (byte) 40);
                if (var2 != null) {
                  PowerUp.field_x = MenuButton.a(var2, (byte) 72);
                }
                var2 = nk.a("fs_accept_countdown_pl", (byte) -107);
                if (var2 != null) {
                  u.field_e = MenuButton.a(var2, (byte) 78);
                }
                var2 = nk.a("fs_nonmember", (byte) -123);
                if (var2 != null) {
                  StatefulWidgetRenderer.field_x = MenuButton.a(var2, (byte) 102);
                }
                var2 = nk.a("fs_button_close", (byte) -116);
                if (var2 != null) {
                  LevelSequence.field_a = MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("fs_button_members", (byte) -123);
                if (null != var2) {
                  PasswordValidator.field_q = MenuButton.a(var2, (byte) 114);
                }
                var2 = nk.a("fs_unavailable", (byte) -125);
                if (null != var2) {
                  LoginCredentials.field_a = MenuButton.a(var2, (byte) 76);
                }
                var2 = nk.a("fs_unavailable_try_signed_applet", (byte) -108);
                if (null != var2) {
                  df.field_d = MenuButton.a(var2, (byte) 76);
                }
                var2 = nk.a("fs_focus", (byte) -106);
                if (null != var2) {
                  ChocolateBackground.field_s = MenuButton.a(var2, (byte) 79);
                }
                var2 = nk.a("fs_focus_or_resolution", (byte) -124);
                if (null != var2) {
                  AccountResponse.field_h = MenuButton.a(var2, (byte) 112);
                }
                var2 = nk.a("fs_timeout", (byte) 40);
                if (null != var2) {
                  DirectByteStorage.field_h = MenuButton.a(var2, (byte) 119);
                }
                var2 = nk.a("fs_button_tryagain", (byte) -118);
                if (null != var2) {
                  ja.field_b = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("graphics_ui_fs_countdown", (byte) 8);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("mb_caption_title", (byte) 44);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("mb_including_gamename", (byte) 79);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 78);
                }
                var2 = nk.a("mb_full_access_1", (byte) 32);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 77);
                }
                var2 = nk.a("mb_full_access_2", (byte) -115);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 83);
                }
                var2 = nk.a("mb_achievement_count_1", (byte) -2);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("mb_achievement_count_2", (byte) 55);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 77);
                }
                var2 = nk.a("mb_exclusive_1", (byte) -127);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 108);
                }
                var2 = nk.a("mb_exclusive_2", (byte) -111);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 89);
                }
                var2 = nk.a("me_extra_benefits", (byte) -117);
                if (var2 != null) {
                  va.field_c = MenuButton.a(var2, (byte) 111);
                }
                var2 = nk.a("hs_friend_tip", (byte) -125);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("hs_friend_tip_multi", (byte) 91);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 114);
                }
                var2 = nk.a("hs_mode_name,0", (byte) 45);
                if (null != var2) {
                  pl.field_c[0] = MenuButton.a(var2, (byte) 83);
                }
                var2 = nk.a("hs_mode_name,1", (byte) 73);
                if (null != var2) {
                  pl.field_c[1] = MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("hs_mode_name,2", (byte) -14);
                if (null != var2) {
                  pl.field_c[2] = MenuButton.a(var2, (byte) 111);
                }
                var2 = nk.a("rating_mode_name,0", (byte) -112);
                if (null != var2) {
                  LevelCompleteScreen.field_E[0] = MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("rating_mode_name,1", (byte) 95);
                if (var2 != null) {
                  LevelCompleteScreen.field_E[1] = MenuButton.a(var2, (byte) 100);
                }
                var2 = nk.a("rating_mode_long_name,0", (byte) -122);
                if (null != var2) {
                  jh.field_e[0] = MenuButton.a(var2, (byte) 92);
                }
                var2 = nk.a("rating_mode_long_name,1", (byte) -112);
                if (var2 != null) {
                  jh.field_e[1] = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("graphics_config_fixed_size", (byte) -117);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 107);
                }
                var2 = nk.a("graphics_config_resizable", (byte) -124);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("graphics_config_fullscreen", (byte) -20);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 109);
                }
                var2 = nk.a("graphics_config_done", (byte) -118);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 122);
                }
                var2 = nk.a("graphics_config_apply", (byte) 65);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 101);
                }
                var2 = nk.a("graphics_config_title", (byte) 75);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 108);
                }
                var2 = nk.a("graphics_config_instruction", (byte) -109);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 109);
                }
                var2 = nk.a("graphics_config_need_memory", (byte) 109);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 94);
                }
                var2 = nk.a("pleasewait_dotdotdot", (byte) -16);
                if (null != var2) {
                  kd.field_a = MenuButton.a(var2, (byte) 83);
                }
                var2 = nk.a("serviceunavailable", (byte) 85);
                if (var2 != null) {
                  BoundedFile.field_d = MenuButton.a(var2, (byte) 104);
                }
                var2 = nk.a("createtouse", (byte) 40);
                if (var2 != null) {
                  DateFieldsWidget.field_N = MenuButton.a(var2, (byte) 75);
                }
                var2 = nk.a("achievementsoffline", (byte) -20);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 70);
                }
                var2 = nk.a("warning", (byte) 18);
                if (null != var2) {
                  MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("DEFAULT_PLAYER_NAME", (byte) -20);
                if (null != var2) {
                  LevelSelectScreen.field_t = MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("mustlogin1", (byte) -110);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("mustlogin2,1", (byte) 77);
                if (var2 != null) {
                  EmailConfirmationValidator.field_m[1] = MenuButton.a(var2, (byte) 82);
                }
                var2 = nk.a("mustlogin2,2", (byte) -108);
                if (null != var2) {
                  EmailConfirmationValidator.field_m[2] = MenuButton.a(var2, (byte) 79);
                }
                var2 = nk.a("mustlogin2,3", (byte) -123);
                if (var2 != null) {
                  EmailConfirmationValidator.field_m[3] = MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("mustlogin2,4", (byte) 84);
                if (var2 != null) {
                  EmailConfirmationValidator.field_m[4] = MenuButton.a(var2, (byte) 87);
                }
                var2 = nk.a("mustlogin2,5", (byte) -121);
                if (var2 != null) {
                  EmailConfirmationValidator.field_m[5] = MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("mustlogin2,6", (byte) 63);
                if (var2 != null) {
                  EmailConfirmationValidator.field_m[6] = MenuButton.a(var2, (byte) 73);
                }
                var2 = nk.a("mustlogin2,7", (byte) 6);
                if (null != var2) {
                  EmailConfirmationValidator.field_m[7] = MenuButton.a(var2, (byte) 103);
                }
                var2 = nk.a("mustlogin3,1", (byte) 115);
                if (var2 != null) {
                  FullscreenFailureKind.field_e[1] = MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("mustlogin3,2", (byte) -106);
                if (null != var2) {
                  FullscreenFailureKind.field_e[2] = MenuButton.a(var2, (byte) 81);
                }
                var2 = nk.a("mustlogin3,3", (byte) -107);
                if (var2 != null) {
                  FullscreenFailureKind.field_e[3] = MenuButton.a(var2, (byte) 78);
                }
                var2 = nk.a("mustlogin3,4", (byte) -13);
                if (var2 != null) {
                  FullscreenFailureKind.field_e[4] = MenuButton.a(var2, (byte) 96);
                }
                var2 = nk.a("mustlogin3,5", (byte) -121);
                if (null != var2) {
                  FullscreenFailureKind.field_e[5] = MenuButton.a(var2, (byte) 116);
                }
                var2 = nk.a("mustlogin3,6", (byte) -19);
                if (var2 != null) {
                  FullscreenFailureKind.field_e[6] = MenuButton.a(var2, (byte) 71);
                }
                var2 = nk.a("mustlogin3,7", (byte) 61);
                if (null != var2) {
                  FullscreenFailureKind.field_e[7] = MenuButton.a(var2, (byte) 90);
                }
                var2 = nk.a("discard", (byte) -116);
                if (null != var2) {
                  DesertBackground.field_r = MenuButton.a(var2, (byte) 86);
                }
                var2 = nk.a("mustlogin4,1", (byte) -110);
                if (null != var2) {
                  un.field_c[1] = MenuButton.a(var2, (byte) 86);
                }
                var2 = nk.a("mustlogin4,2", (byte) 66);
                if (null != var2) {
                  un.field_c[2] = MenuButton.a(var2, (byte) 96);
                }
                var2 = nk.a("mustlogin4,3", (byte) -108);
                if (var2 != null) {
                  un.field_c[3] = MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("mustlogin4,4", (byte) -110);
                if (var2 != null) {
                  un.field_c[4] = MenuButton.a(var2, (byte) 100);
                }
                var2 = nk.a("mustlogin4,5", (byte) -123);
                if (null != var2) {
                  un.field_c[5] = MenuButton.a(var2, (byte) 100);
                }
                var2 = nk.a("mustlogin4,6", (byte) -122);
                if (null != var2) {
                  un.field_c[6] = MenuButton.a(var2, (byte) 98);
                }
                var2 = nk.a("mustlogin4,7", (byte) 96);
                if (var2 != null) {
                  un.field_c[7] = MenuButton.a(var2, (byte) 95);
                }
                var2 = nk.a("mustlogin_notloggedin", (byte) -119);
                if (null != var2) {
                  PauseMenuScreen.field_w = MenuButton.a(var2, (byte) 118);
                }
                var2 = nk.a("mustlogin_alternate,1", (byte) 95);
                if (var2 != null) {
                  MultiplayerExitScreen.savePrompts[1] = MenuButton.a(var2, (byte) 88);
                }
                var2 = nk.a("mustlogin_alternate,2", (byte) 33);
                if (var2 != null) {
                  MultiplayerExitScreen.savePrompts[2] = MenuButton.a(var2, (byte) 81);
                }
                if (param1 <= 89) {
                  ContextActionController.a((ResourceArchive) null, -113);
                }
                var2 = nk.a("mustlogin_alternate,3", (byte) -120);
                if (null != var2) {
                  MultiplayerExitScreen.savePrompts[3] = MenuButton.a(var2, (byte) 124);
                }
                var2 = nk.a("mustlogin_alternate,4", (byte) 122);
                if (var2 != null) {
                  MultiplayerExitScreen.savePrompts[4] = MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("mustlogin_alternate,5", (byte) -8);
                if (null != var2) {
                  MultiplayerExitScreen.savePrompts[5] = MenuButton.a(var2, (byte) 120);
                }
                var2 = nk.a("mustlogin_alternate,6", (byte) -127);
                if (null != var2) {
                  MultiplayerExitScreen.savePrompts[6] = MenuButton.a(var2, (byte) 104);
                }
                var2 = nk.a("mustlogin_alternate,7", (byte) 100);
                if (var2 != null) {
                  MultiplayerExitScreen.savePrompts[7] = MenuButton.a(var2, (byte) 113);
                }
                var2 = nk.a("subscription_cost_monthly,0", (byte) -116);
                if (null != var2) {
                  uo.field_e[0] = MenuButton.a(var2, (byte) 74);
                }
                var2 = nk.a("subscription_cost_monthly,1", (byte) 7);
                if (null != var2) {
                  uo.field_e[1] = MenuButton.a(var2, (byte) 93);
                }
                var2 = nk.a("subscription_cost_monthly,2", (byte) -111);
                if (null != var2) {
                  uo.field_e[2] = MenuButton.a(var2, (byte) 110);
                }
                var2 = nk.a("subscription_cost_monthly,3", (byte) -106);
                if (null != var2) {
                  uo.field_e[3] = MenuButton.a(var2, (byte) 100);
                }
                var2 = nk.a("subscription_cost_monthly,4", (byte) -128);
                if (var2 != null) {
                  uo.field_e[4] = MenuButton.a(var2, (byte) 121);
                }
                var2 = nk.a("subscription_cost_monthly,5", (byte) -116);
                if (null != var2) {
                  uo.field_e[5] = MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("subscription_cost_monthly,6", (byte) -115);
                if (var2 != null) {
                  uo.field_e[6] = MenuButton.a(var2, (byte) 116);
                }
                var2 = nk.a("subscription_cost_monthly,7", (byte) -122);
                if (var2 != null) {
                  uo.field_e[7] = MenuButton.a(var2, (byte) 114);
                }
                var2 = nk.a("subscription_cost_monthly,8", (byte) -15);
                if (var2 != null) {
                  uo.field_e[8] = MenuButton.a(var2, (byte) 114);
                }
                var2 = nk.a("subscription_cost_monthly,9", (byte) 29);
                if (var2 != null) {
                  uo.field_e[9] = MenuButton.a(var2, (byte) 93);
                }
                var2 = nk.a("subscription_cost_monthly,10", (byte) 10);
                if (null != var2) {
                  uo.field_e[10] = MenuButton.a(var2, (byte) 126);
                }
                var2 = nk.a("subscription_cost_monthly,11", (byte) -120);
                if (var2 != null) {
                  uo.field_e[11] = MenuButton.a(var2, (byte) 94);
                }
                var2 = nk.a("subscription_cost_monthly,12", (byte) -111);
                if (var2 != null) {
                  uo.field_e[12] = MenuButton.a(var2, (byte) 81);
                }
                var2 = nk.a("sentence_separator", (byte) 99);
                if (var2 != null) {
                  MenuButton.a(var2, (byte) 87);
                }
                HighscorePackSelector.field_c = null;
            }
            void run() {
                var3 = BrickABrac.field_J ? 1 : 0;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                  runChunk2();
                  if (finished) return;
                  runChunk3();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_2599_0 = (RuntimeException) (var2_ref);
                  stackIn_2599_1 = new StringBuilder().append("nn.F(");
                  if (param0 == null) {
                    stackIn_2600_2 = "null";
                  } else {
                    stackIn_2600_2 = "{...}";
                  }
                  throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_2599_0), ((StringBuilder) (Object) stackIn_2599_1).append(stackIn_2600_2).append(',').append(param1).append(')').toString());
                }
                if (var3 != 0) {
                  var4 = AppletGameShell.field_l;
                  var4++;
                  AppletGameShell.field_l = var4;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final void addSocialActions(int[] suggestedPhraseIds, byte obfuscationGuard, int channel) {
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        String caption = null;
        RuntimeException var4_ref = null;
        SocialListEntry friend = null;
        int ignoredPlayer = 0;
        try {
          if (null != this.targetName && (Widget.field_p != this.targetId ||
            channel == 2) && 2 == LevelMetadata.field_m) {
            caption = this.getTargetCaption(-12688);
            friend = RadialSelectorRenderer.findFriend(false, this.targetName);
            ignoredPlayer = AchievementBrowserScreen.isIgnoredPlayer(121, this.targetName) ? 1 : 0;
            if (friend == null &&
              ignoredPlayer == 0) {
              this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(AchievementMaskRequest.field_l, new String[]{caption}, (byte) 103), 4, (byte) 105);
              this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(PasswordFieldRenderer.field_H, new String[]{caption}, (byte) 103), 6, (byte) 110);
              if (null != suggestedPhraseIds &&
                2 != channel &&
                !TextWidgetRenderer.field_e) {
                this.suggestedPhraseIds = suggestedPhraseIds;
                this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(GameOverlayHelpers.field_b, new String[]{caption}, (byte) 103), 19, (byte) 95);
              }
            }
            if (null != friend) {
              if (!ConditionalTextValue.a(13134, this.targetName) &&
                !TextWidgetRenderer.field_e) {
                if (!PlayerNameChooserPanel.field_I) {
                  this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(ClientException.field_c, new String[]{caption}, (byte) 103), 8, (byte) 80);
                }
                this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(qm.field_b, new String[]{caption}, (byte) 103), 18, (byte) 104);
                if (null != suggestedPhraseIds) {
                  this.suggestedPhraseIds = suggestedPhraseIds;
                  this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(GameOverlayHelpers.field_b, new String[]{caption}, (byte) 103), 19, (byte) 72);
                }
              }
              this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(ChatLobbyUiHelpers.field_g, new String[]{caption}, (byte) 103), 5, (byte) 106);
            }
            if (ignoredPlayer != 0) {
              this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(UsernameSuggestionPanel.field_O, new String[]{caption}, (byte) 103), 7, (byte) 82);
            }
          }
          if (obfuscationGuard > -68) {
            worldDirectionZ = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_53_0 = var4_ref;
          stackIn_53_1 = new StringBuilder().append("nn.I(");
          if (suggestedPhraseIds == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(obfuscationGuard).append(',').append(channel).append(')').toString());
        }
    }

    final void addPlayerGameActions(boolean obfuscationGuard, boolean allowAdditionalActions) {
        RuntimeException decompiledCaughtException = null;
        LobbyPlayer gamePlayer = null;
        RuntimeException var3_ref = null;
        LobbyPlayer invitedPlayer = null;
        String caption = null;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (!obfuscationGuard) {
            this.drawContextMenu((byte) -36, true);
          }
          if (this.targetName != null &&
            ~Widget.field_p != ~this.targetId &&
            null != ClientResourceHelpers.currentLobbyGame &&
            hn.b((byte) 7)) {
            gamePlayer = MatchCompleteScreen.findLobbyPlayer((byte) 96, this.targetId);
            invitedPlayer = EmailAvailabilityRequest.findGamePlayer(this.targetId, 2);
            caption = this.getTargetCaption(-12688);
            if (invitedPlayer != null) {
              if (ClientResourceHelpers.currentLobbyGame.started &&
                ClientResourceHelpers.currentLobbyGame.concludedDurationMillis < 0) {
                return;
              }
              this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(RankingsRequest.field_q, new String[]{caption}, (byte) 103), 1, (byte) 94);
              if (unusedGameFlag == 0) {
                return;
              }
            }
            if (null != gamePlayer &&
              ClientResourceHelpers.currentLobbyGame.protocolFlag8 &&
              ClientResourceHelpers.currentLobbyGame.maxPlayers > ClientResourceHelpers.currentLobbyGame.playerCount) {
              if (gamePlayer.invitationPending) {
                this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(hm.field_c, new String[]{caption}, (byte) 103), 1, (byte) 108);
                if (unusedGameFlag == 0) {
                  return;
                }
              }
              if (allowAdditionalActions &&
                gamePlayer.joinRequestPending) {
                this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(mc.field_b, new String[]{caption}, (byte) 103), 0, (byte) 112);
                this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(RasterCacheSurface.field_o, new String[]{caption}, (byte) 103), 1, (byte) 116);
                if (unusedGameFlag == 0) {
                  return;
                }
              }
              this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(ResourceRequest.field_A, new String[]{caption}, (byte) 103), 0, (byte) 126);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var3_ref), "nn.C(" + obfuscationGuard + ',' + allowAdditionalActions + ')');
        }
    }

    final void addReportAction(byte obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (obfuscationGuard > -66) {
            this.handleContextCancelKey(32);
          }
          if (null != this.targetName &&
            this.targetId != Widget.field_p) {
            var2 = this.getTargetCaption(-12688);
            this.contextMenu.addAction(GamePresentationHelpers.formatIndexedText(DesertBackground.field_t, new String[]{var2}, (byte) 103), 17, (byte) 107);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2_ref), "nn.K(" + obfuscationGuard + ')');
        }
    }

    final boolean handleContextCancelKey(int obfuscationGuard) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 2099) {
            this.addMessageFilterActions((ChatMessage) null, -34);
          }
          stackIn_10_0 = (this.contextMenu != null) && (this.contextMenu.handleCancelKey(94));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var2), "nn.N(" + obfuscationGuard + ')');
        }
    }

    final boolean pollAndDispatchAction(int pendingResult, int socialAndFilterOpcode, int unusedReportOption, int gameOpcode, boolean inputEnabled) {
        boolean ignoredGameResult = false;
        boolean ignoredSocialResult = false;
        boolean ignoredChatResult = false;
        boolean ignoredReportResult = false;
        int actionId = 0;
        RuntimeException var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          actionId = this.contextMenu.updateAndPollAction((byte) -60, inputEnabled);
          if (pendingResult == actionId) {
            return false;
          }
          ignoredGameResult = this.dispatchGameAction((byte) 97, gameOpcode, actionId);
          ignoredSocialResult = this.dispatchSocialAction((byte) -67, actionId, socialAndFilterOpcode);
          ignoredChatResult = this.dispatchChatAction(socialAndFilterOpcode, false, actionId);
          ignoredReportResult = this.dispatchReportAction(122, actionId, unusedReportOption);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var6), "nn.J(" + pendingResult + ',' + socialAndFilterOpcode + ',' + unusedReportOption + ',' + gameOpcode + ',' + inputEnabled + ')');
        }
    }

    private final boolean dispatchSocialAction(byte obfuscationGuard, int actionId, int opcode) {
        boolean ignoredGuardResult = false;
        Object unusedError = null;
        String errorMessage = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref2 = null;
        try {
          if (obfuscationGuard != -67) {
            ignoredGuardResult = this.dispatchReportAction(-62, 55, -75);
          }
          unusedError = null;
          if (actionId == 4) {
            errorMessage = jl.requestAddFriend(obfuscationGuard ^ -24878, this.targetName, opcode);
          } else {
            if (actionId == 5) {
              errorMessage = KeyboardInput.requestRemoveFriend(opcode, false, this.targetName);
            } else {
              if (6 == actionId) {
                errorMessage = LoginMethodPreference.requestAddIgnoredPlayer(this.targetName, opcode, 2);
              } else {
                if (7 != actionId) {
                  return false;
                }
                errorMessage = uf.requestRemoveIgnoredPlayer(this.targetName, opcode, this.targetDisplayName, -66);
              }
            }
          }
          if (errorMessage != null) {
            SoundCache.appendSystemChatMessage((byte) 92, 0, (String) null, errorMessage, this.targetName, 2);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var4_ref2), "nn.D(" + obfuscationGuard + ',' + actionId + ',' + opcode + ')');
        }
    }

    private final boolean dispatchGameAction(byte obfuscationGuard, int opcode, int actionId) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (actionId == 0) {
            hd.requestInviteOrAcceptPlayer(this.targetId, 69, opcode);
          }
          if (actionId != 0 ||
            unusedGameFlag != 0) {
            if (actionId != 1) {
              if (actionId != 2) {
                if (3 == actionId) {
                  GameTransportActions.requestLeaveOrDeclineGame(this.gameId, false, opcode);
                }
                if (3 != actionId ||
                  unusedGameFlag != 0) {
                  if (actionId == 10) {
                    DraggableWidget.requestSpectateGame(this.gameId, obfuscationGuard - 11, opcode);
                  }
                  if (actionId != 10 ||
                    unusedGameFlag != 0) {
                    if (actionId == 15) {
                      ContextMenu.requestGamePlayerPreview(opcode, (byte) -34, this.gameId);
                    }
                    if (actionId != 15 ||
                      unusedGameFlag != 0) {
                      if (actionId != 16) {
                        return false;
                      }
                      ContextMenu.requestGamePlayerPreview(opcode, (byte) 120, 0);
                      if (unusedGameFlag != 0) {
                        DropTargetWidget.requestJoinGame(this.gameId, opcode, obfuscationGuard + 11815);
                        rf.requestRemoveOrRejectPlayer(opcode, this.targetId, true);
                      }
                    }}}} else {
                DropTargetWidget.requestJoinGame(this.gameId, opcode, obfuscationGuard + 11815);
                if (unusedGameFlag != 0) {
                  rf.requestRemoveOrRejectPlayer(opcode, this.targetId, true);
                }
              }
            } else {
              rf.requestRemoveOrRejectPlayer(opcode, this.targetId, true);
            }
          }
          if (obfuscationGuard != 97) {
            worldDirectionZ = (int[]) null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var4), "nn.G(" + obfuscationGuard + ',' + opcode + ',' + actionId + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        worldDirectionZ = null;
        if (param0 != 0) {
          return;
        }
        try {
          field_g = null;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "nn.A(" + param0 + ')');
        }
    }

    private final boolean dispatchReportAction(int obfuscationGuard, int actionId, int unusedReportOption) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (actionId == 17) {
            CircleBody.reportAbuseDialog = new ReportAbuseDialog(this.anchorComponent.screenX, this.anchorComponent.screenY, this.anchorComponent.width, this.anchorComponent.height, unusedReportOption, MenuSelection.field_m, rf.field_c, ReportAbuseDialog.field_Zb, CappedUrlRequest.field_l, BlankScreen.field_k, DualLinkNode.field_t, this.targetName, this.targetId);
            return true;
          }
          if (obfuscationGuard < 121) {
            this.contextMenu = (ContextMenu) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var4), "nn.E(" + obfuscationGuard + ',' + actionId + ',' + unusedReportOption + ')');
        }
    }

    ContextActionController(UiComponent anchorComponent, long targetId, String targetName, String targetDisplayName, int gameId, int chatChannel, int[] suggestedPhraseIds) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.contextMenu = new ContextMenu(ce.contextMenuStyle);
          this.targetId = targetId;
          this.anchorComponent = anchorComponent;
          this.chatChannel = chatChannel;
          this.gameId = gameId;
          this.targetName = targetName;
          anchorComponent.selected = true;
          this.suggestedPhraseIds = suggestedPhraseIds;
          this.targetDisplayName = targetDisplayName;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("nn.<init>(");
          if (anchorComponent == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(targetId).append(',');
          if (targetName == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (targetDisplayName == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(gameId).append(',').append(chatChannel).append(',');
          if (suggestedPhraseIds == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void addMessageFilterActions(ChatMessage message, int obfuscationGuard) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (message.systemMessage) {
            return;
          }
          this.chatChannel = message.channel;
          if (message.channel == 0) {
            if (InstructionsScreen.lobbyChatFilter == 0) {
              this.contextMenu.addAction(RasterSnapshot.field_l, 12, (byte) 81);
            }
            this.contextMenu.addAction(ArchiveSourceManager.field_e, 13, (byte) 87);
          }
          if (obfuscationGuard >= -70) {
            return;
          }
          if (message.channel == 1) {
            if (InstructionsScreen.gameChatFilter == 0) {
              this.contextMenu.addAction(StrongCacheEntry.field_K, 12, (byte) 107);
            }
            this.contextMenu.addAction(CacheIoWorker.field_b, 13, (byte) 82);
          }
          if (message.channel == 2) {
            if (WeightedLruCache.privateChatFilter == 0) {
              this.contextMenu.addAction(qp.field_d, 12, (byte) 121);
            }
            this.contextMenu.addAction(EmailAvailabilityRequest.field_b, 13, (byte) 118);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("nn.O(");
          if (message == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        worldDirectionZ = new int[8192];
    }
}
