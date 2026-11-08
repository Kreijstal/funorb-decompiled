/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerContextMenu {
    static String playerXIsOnTheirLastLife;
    static long field_j;
    static CipherPacketBuffer field_e;
    static String field_g;
    private long field_l;
    private int field_a;
    static String invite;
    private String field_d;
    UiComponent field_i;
    String field_m;
    int field_b;
    static int[] field_c;
    private int[] field_h;
    ContextMenu field_n;

    final void addChatFilterActions(ChatMessage param0, boolean param1) {
        if (param0.field_g) {
          return;
        }
        try {
          this.field_a = param0.field_p;
          if (param1) {
            this.field_b = 59;
          }
          if (param0.field_p == 0) {
            if (BallDebugOverlay.field_i == 0) {
              this.field_n.addAction(ProjectedLineSupport.muChatLobbyFriendsOnly, 17130, 12);
            }
            this.field_n.addAction(Pool.muChatLobbyHide, 17130, 13);
          }
          if (param0.field_p == 1) {
            if (FixedPointVectorSupport.field_e == 0) {
              this.field_n.addAction(IntKeyLookup.muChatGameFriendsOnly, 17130, 12);
            }
            this.field_n.addAction(TextLayout.muChatGameHide, 17130, 13);
          }
          if (param0.field_p == 2) {
            if (ResourceArchive.field_e == 0) {
              this.field_n.addAction(FreePlayRules.muChatPmFriendsOnly, 17130, 12);
            }
            this.field_n.addAction(EmailAvailabilityValidator.muChatInvisibleAndSilentMode, 17130, 13);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "kn.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        this.field_n.drawRoot((byte) -79, param0);
        if (param1 != 12887) {
          field_c = (int[]) null;
        }
    }

    private final boolean executeListAction(byte param0, int param1, int param2) {
        int var5;
        var5 = Pool.field_O;
        if (param0 != 98) {
          return true;
        }
        if (param2 != 0) {
          if (param2 != 1) {
            if (2 != param2) {
              if (param2 == 3) {
                AccountCreationForm.a(this.field_b, true, param1);
              } else {
                if (param2 == 10) {
                  FaceNormal.a(this.field_b, 3, param1);
                } else {
                  if (param2 == 15) {
                    SocialListEntry.a(param1, this.field_b, 11);
                  } else {
                    if (16 != param2) {
                      return false;
                    }
                    SocialListEntry.a(param1, 0, param0 ^ 105);
                  }
                }
              }
            } else {
              HighscoresScreen.a(this.field_b, (byte) -125, param1);
            }
          } else {
            CueStick.a(this.field_l, param1, param0 - 98);
          }
        } else {
          DropTargetWidget.a(param1, (byte) 97, this.field_l);
        }
        return true;
    }

    final void buildPlayerMenu(int param0, int[] param1, byte param2) {
        boolean discarded$0 = false;
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
          if (null != this.field_m && (~this.field_l != ~BitmapTextLayout.field_m ||
            2 == param0) && ChatInputSupport.field_a == 2) {
            var7 = this.getTargetName(3);
            var4 = var7;
            var5 = UsernameSuggestionSupport.a(-103, this.field_m);
            var6 = MenuSelection.a(this.field_m, 24552) ? 1 : 0;
            if (var5 == null &&
              var6 == 0) {
              this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var7}, -1, QuickChatHelpDialog.addXToFriends), 17130, 4);
              this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var7}, -1, MenuScreenBase.addXToIgnore), 17130, 6);
              if (param1 != null &&
                param0 != 2 &&
                !RankingsRequest.field_z) {
                this.field_h = param1;
                this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var7}, -1, TranslatedUiText.field_k), 17130, 19);
              }
            }
            if (var5 != null) {
              if (!NineBallRules.a(this.field_m, (byte) -101) &&
                !RankingsRequest.field_z) {
                if (!ViewportController.field_y) {
                  this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var7}, -1, NineSliceFrameSupport.sendPmToX), 17130, 8);
                }
                this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var7}, -1, TutorialController.sendQcToX), 17130, 18);
                if (param1 != null) {
                  this.field_h = param1;
                  this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var7}, -1, TranslatedUiText.field_k), 17130, 19);
                }
              }
              this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var7}, -1, FaceNormal.rmXFromFriends), 17130, 5);
            }
            if (var6 != 0) {
              this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var7}, -1, AccountProtocolStage.rmXFromIgnore), 17130, 7);
            }
          }
          if (param2 < 43) {
            discarded$0 = this.a(63, 79, -128);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("kn.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    final void addReportAbuseAction(byte param0) {
        String var3 = null;
        boolean discarded$0 = false;
        if (null != this.field_m &&
          this.field_l != BitmapTextLayout.field_m) {
          var3 = this.getTargetName(3);
          String var2 = var3;
          this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var3}, -1, NetworkGameClient.reportXForAbuse), 17130, 17);
        }
        if (param0 < 8) {
          discarded$0 = this.openReportAbuse((byte) -22, -119, 104);
        }
    }

    private final boolean executePlayerAction(int param0, byte param1, int param2) {
        int var5;
        var5 = Pool.field_O;
        if (param2 != 8) {
          if (param2 == 18) {
            AccountStateQuery.a(this.field_l, (byte) -104, this.field_m);
          } else {
            if (param2 != 11) {
              if (12 != param2) {
                if (13 != param2) {
                  if (param2 == 14) {
                    WidgetStyleLayer.a(true);
                  } else {
                    if (param2 == 20) {
                      EmailValidator.c((byte) 41);
                    } else {
                      if (param2 != 19) {
                        return false;
                      }
                      QuickChatDynamicCommand.a(this.field_a, this.field_h, this.field_l, this.field_m, (byte) 76);
                    }
                  }
                } else {
                  TextInputPainter.a(2, this.field_a, param0, (byte) -45);
                }
              } else {
                TextInputPainter.a(1, this.field_a, param0, (byte) 126);
              }
            } else {
              TextInputPainter.a(0, this.field_a, param0, (byte) 121);
            }
          }
        } else {
          ProxySocketConnector.a((byte) -75, this.field_l, this.field_m);
        }
        if (param1 >= 57) {
          return true;
        }
        this.field_d = (String) null;
        return true;
    }

    private final boolean openReportAbuse(byte param0, int param1, int param2) {
        if (param0 > -74) {
          PlayerContextMenu.isValidNameCharacter((byte) 75, 'ﾪ');
        }
        if (17 != param2) {
          return false;
        }
        AccountMenuText.field_b = new ReportAbuseDialog(this.field_i.screenX, this.field_i.screenY, this.field_i.width, this.field_i.height, param1, AccountStateQuery.field_m, DiskArchiveRequest.field_J, VertexTransformSupport.field_f, AlignedIconLabel.field_Lb, ChoiceButtonSupport.field_e, UiWidget.field_A, this.field_m, this.field_l);
        return true;
    }

    final boolean b(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 111) {
          this.a(true, 110);
        }
        stackIn_6_0 = (this.field_n != null) && (this.field_n.handleCancelKey((byte) -49));
        return stackIn_6_0;
    }

    final boolean handleMenuSelection(int param0, int param1, boolean param2, int param3, int param4) {
        if (param3 != 25427) {
          return false;
        }
        int var6 = this.field_n.updateAndPollAction(param3 ^ 25356, param2);
        if (var6 == -2) {
          return false;
        }
        boolean discarded$0 = this.executeListAction((byte) 98, param1, var6);
        boolean discarded$1 = this.a(var6, param4, 6);
        boolean discarded$2 = this.executePlayerAction(param4, (byte) 115, var6);
        boolean discarded$3 = this.openReportAbuse((byte) -75, param0, var6);
        return true;
    }

    final static void updatePageControls(int param0) {
        VerticalScrollbar.field_Nb.sprite = TransformRotationSupport.createTextLabelSprite(1, 0, AccountWelcomePanel.substituteTemplateArguments(new String[]{Integer.toString(ReflectionReplySupport.field_f[ChatPanelSupport.field_a] / 50)}, -1, PolarObject.timerSecs));
        if (param0 != 13) {
          PlayerContextMenu.updatePageControls(-82);
        }
        TickClock.field_i.enabled = ChatPanelSupport.field_a > 0 ? true : false;
        DualLinkNodeHashTable.field_f.enabled = ChatPanelSupport.field_a < -1 + ByteArrayNode.field_p[0] ? true : false;
    }

    private final boolean a(int param0, int param1, int param2) {
        Object var4;
        String var4_ref;
        String var5;
        var4 = null;
        if (param0 == 4) {
          var4_ref = MultiHandleSliderWidget.a(this.field_m, param1, 88);
        } else {
          if (param0 == 5) {
            var4_ref = HalloweenBallSkin.removeFriend((byte) 91, this.field_m, param1);
          } else {
            if (param0 == 6) {
              var4_ref = Atan2Support.a(param1, this.field_m, param2 ^ 4);
            } else {
              if (param0 != 7) {
                return false;
              }
              var4_ref = MembershipBenefitsLoader.removeIgnore(-3266, this.field_d, this.field_m, param1);
            }
          }
        }
        if (var4_ref != null) {
          var5 = (String) null;
          MenuScreenBase.a(0, var4_ref, (String) null, 2, this.field_m, true);
        }
        if (param2 == 6) {
          return true;
        }
        return false;
    }

    final void addGameInviteActions(byte param0, boolean param1) {
        LobbyPlayer var4;
        String var5;
        LobbyPlayer var6;
        if (null != this.field_m &&
          this.field_l != BitmapTextLayout.field_m &&
          null != HighscoresScreen.field_L &&
          TikiTableScene.e((byte) 85)) {
          var6 = LobbyPlayerLookupSupport.findLobbyPlayer(param0 ^ 124, this.field_l);
          var4 = QuickChatHelpDialog.b(this.field_l, 0);
          var5 = this.getTargetName(3);
          if (var4 != null) {
            if (!HighscoresScreen.field_L.field_ec ||
              !(HighscoresScreen.field_L.field_qc < 0)) {
              this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var5}, -1, ChatInputSupport.muGameoptKickXFromThisGame), 17130, 1);
            }
          } else {
            if (var6 != null &&
              HighscoresScreen.field_L.field_Dc &&
              HighscoresScreen.field_L.field_Nb > HighscoresScreen.field_L.field_mc) {
              if (!var6.field_mc) {
                if (param1 &&
                  var6.field_Yb) {
                  this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var5}, -1, UsernameSuggestionSupport.muGameoptAcceptXIntoGame), param0 + 17006, 0);
                  this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var5}, param0 - 125, ProjectedVertex.muGameoptRejectXFromGame), 17130, 1);
                } else {
                  this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var5}, -1, IterableDualLinkDeque.muGameoptInviteXToGame), 17130, 0);
                }
              } else {
                this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var5}, -1, MenuScreenBase.muGameoptWithdrawInviteToX), param0 + 17006, 1);
              }
            }
          }
        }
        if (param0 != 124) {
          PlayerContextMenu.releaseStatics((byte) 66);
        }
    }

    private final String getTargetName(int param0) {
        String var2 = null;
        if (null != this.field_d) {
          var2 = this.field_d;
        } else {
          var2 = this.field_m;
        }
        if (param0 != 3) {
          invite = (String) null;
        }
        return var2;
    }

    final static boolean isValidNameCharacter(byte param0, char param1) {
        int var3 = 0;
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        char[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > 0 &&
            param1 < 128) {
            return true;
          }
          if (160 <= param1 &&
            param1 <= 255) {
            return true;
          }
          if (param0 <= 36) {
            return true;
          }
          if (0 != param1) {
            var5 = AccountDisplayNameSupport.field_a;
            var2 = var5;
            for (var3 = 0; var3 < var5.length; var3++) {
              var4 = var5[var3];
              if (var4 == param1) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2_ref), "kn.B(" + param0 + ',' + param1 + ')');
        }
    }

    PlayerContextMenu(UiComponent param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
          this.field_n = new ContextMenu(IntrusiveDeque.field_c);
          this.field_d = param3;
          this.field_l = param1;
          this.field_b = param4;
          this.field_a = param5;
          param0.selected = true;
          this.field_i = param0;
          this.field_h = param6;
          this.field_m = param2;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "kn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void addInviteActions(int param0) {
        String var3;
        LobbyGame var4;
        if (null == HighscoresScreen.field_L) {
          var4 = ArchiveLoadSequence.a(this.field_b, 125);
          if (var4 != null) {
            var3 = var4.field_Ob;
            if (var4.field_Xb) {
              this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var3}, -1, BallEvent.inviteAcceptXsGame), param0 ^ 18642, 2);
              this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var3}, -1, QuickChatDynamicCommand.inviteDeclineXsGame), 17130, 3);
            } else {
              if (var4.field_ic) {
                this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var3}, param0 ^ -2617, LongAndTextLoginPayload.joinXsGame), param0 ^ 18642, 2);
              } else {
                if (!var4.field_fc &&
                  var4.field_Dc && (!var4.field_ec ||
                  var4.field_ic)) {
                  this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var3}, -1, ShotEvent.joinRequestXsGame), param0 ^ 18642, 2);
                }
              }
              if (var4.field_fc) {
                this.field_n.addAction(AccountWelcomePanel.substituteTemplateArguments(new String[]{var3}, -1, MarkerSliderPainter.joinWithdrawRequestXsGame), 17130, 3);
              }
            }
          }
        }
        if (param0 != 2616) {
          PlayerContextMenu.isValidNameCharacter((byte) 103, 'ﾥ');
        }
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        field_g = null;
        invite = null;
        if (param0 > -74) {
          return;
        }
        field_c = null;
        playerXIsOnTheirLastLife = null;
    }

    static {
        playerXIsOnTheirLastLife = "<%0> is on their last life!";
        invite = "Invite";
        field_c = new int[8192];
    }
}
