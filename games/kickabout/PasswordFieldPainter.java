/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordFieldPainter extends BeveledTextPainter {
    static String[] field_y;
    static volatile boolean field_A;
    static int field_w;
    static String field_C;
    static String field_D;
    static IntrusiveDeque field_B;
    static byte[] field_x;
    static String[][] field_z;

    final static void a(int param0, int param1) {
        ManagerAction var2 = null;
        ManagerAction var2Lifetime1;
        if (param0 == 65536) {
          var2 = new ManagerAction(1, new int[]{param1});
          AchievementSubmission.applyAndQueueManagerAction(var2, 69);
          return;
        }
        PasswordFieldPainter.a(false, -70);
        var2Lifetime1 = new ManagerAction(1, new int[]{param1});
        AchievementSubmission.applyAndQueueManagerAction(var2Lifetime1, 69);
    }

    final static int getDaysInMonth(int param0, int param1, int param2) {
        if (param0 == 1) {
          if (GameModeDefinition.isLeapYear(-16143, param1)) {
            return 29;
          }
          if (param2 <= -123) {
            return SortCriterion.field_j[param0];
          }
          return -2;
        }
        if (param2 <= -123) {
          return SortCriterion.field_j[param0];
        }
        return -2;
    }

    final static int a(boolean param0, int param1) {
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        try {
          TournamentChampionDialog.field_I = TournamentChampionDialog.field_I + 65536;
          if (param1 != -587) {
            PasswordFieldPainter.getQuickChatCommandTypes(-111);
          }
          while (UnreadMessagesScreen.multiplyFixed16(MatchTextInputOverlay.field_a, false, TournamentChampionDialog.field_I) >= 65536) {
            TournamentChampionDialog.field_I = TournamentChampionDialog.field_I - MatchTextInputOverlay.field_a;
          }
          var2_int = -1;
          if (AlternateKeyedLoginCredentials.field_n != null) {
            var2_int = AlternateKeyedLoginCredentials.field_n.length;
          } else {
            if (null != StringCursor.field_b) {
              var2_int = StringCursor.field_b.length;
            }
          }
          if (-1 != var2_int) {
            boolean decompiledFrameRemainder0 = true;
            if (MatchTextInputOverlay.field_f > MatchHudSupport.field_g) {
              MatchHudSupport.field_g = MatchHudSupport.field_g + 1;
              if (MatchTextInputOverlay.field_c < MatchHudSupport.field_g && (AlternateKeyedLoginCredentials.field_n == null ||
                AlternateKeyedLoginCredentials.field_n[LoginCredentials.field_e] == null)) {
                MatchHudSupport.field_g = MatchHudSupport.field_g - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (MatchHudSupport.field_g >= MatchTextInputOverlay.field_f &&
                  null == AlternateKeyedLoginCredentials.field_n[(LoginCredentials.field_e + 1) % var2_int]) {
                  MatchHudSupport.field_g = MatchHudSupport.field_g - 1;
                }
              }
            }
            if (MatchTextInputOverlay.field_f <= MatchHudSupport.field_g) {
              MatchHudSupport.field_g = MatchHudSupport.field_g - MatchTextInputOverlay.field_f;
              if (HighScoreSubmission.field_m) {
                LoginCredentials.field_e = LoginCredentials.field_e + 1;
                if (LoginCredentials.field_e >= var2_int) {
                  LoginCredentials.field_e = LoginCredentials.field_e - var2_int;
                }
              } else {
                LoginCredentials.field_e = LoginCredentials.field_e - 1;
                if (LoginCredentials.field_e < 0) {
                  LoginCredentials.field_e = LoginCredentials.field_e + var2_int;
                }
              }
            }
            if (MatchTextInputOverlay.field_c < MatchHudSupport.field_g) {
              HighScoreSubmission.field_m = true;
            }
          }
          if (null != TextInputWidget.field_E) {
            var3 = -(TextInputWidget.field_E.field_v / 2) + 357;
            var4 = 0;
            if (0 != WidgetContainer.field_A &&
              ReceivedAuctionItem.field_y > var3 &&
              TextInputWidget.field_E.field_w + var3 > ReceivedAuctionItem.field_y) {
              if (269 - TextInputWidget.field_E.field_q < HighScoreSubmission.field_q &&
                HighScoreSubmission.field_q < 269) {
                HighScoreSubmission.field_m = false;
                MatchHudSupport.field_g = MatchTextInputOverlay.field_f;
                var4 = 1;
              }
              if (HighScoreSubmission.field_q > 586 &&
                HighScoreSubmission.field_q < TextInputWidget.field_E.field_q + 586) {
                MatchHudSupport.field_g = MatchTextInputOverlay.field_f;
                var4 = 1;
                HighScoreSubmission.field_m = true;
              }
            }
            if (var4 == 0 &&
              MatchHudSupport.field_g > MatchTextInputOverlay.field_c &&
              var3 < ArchiveManager.field_m &&
              var3 + TextInputWidget.field_E.field_w > ArchiveManager.field_m) {
              if (BytePlusOneCommand.field_A > 269 - TextInputWidget.field_E.field_q &&
                269 > BytePlusOneCommand.field_A) {
                MatchHudSupport.field_g = MatchTextInputOverlay.field_c;
              }
              if (BytePlusOneCommand.field_A > 586 &&
                BytePlusOneCommand.field_A < TextInputWidget.field_E.field_q + 586) {
                MatchHudSupport.field_g = MatchTextInputOverlay.field_c;
              }
            }
          }
          if (!param0) {
            return 0;
          }
          AuctionItem.field_l.a(-21174, MatchTextInputOverlay.hitTestPairedControls(ArchiveManager.field_m, BytePlusOneCommand.field_A, (byte) 98), MatchTextInputOverlay.hitTestPairedControls(ReceivedAuctionItem.field_y, HighScoreSubmission.field_q, (byte) 69));
          if (AuctionItem.field_l.c(-1)) {
            if (AuctionItem.field_l.selectedIndex == 0) {
              stackIn_58_0 = 3;
              return stackIn_58_0;
            }
            if (AuctionItem.field_l.selectedIndex == 1) {
              stackIn_61_0 = 2;
              return stackIn_61_0;
            }
          }
          stackIn_64_0 = -59;
          while (true) {
            if (!TexturedPanelPainter.$cfr$intArgs$b$c4997cb15529(stackIn_64_0)) {
              stackIn_77_0 = 0;
              return stackIn_77_0;
            }
            AuctionItem.field_l.handleArrowKeys(0, true);
            if (AuctionItem.field_l.c(param1 ^ 586)) {
              if (AuctionItem.field_l.selectedIndex == 0) {
                stackIn_69_0 = 3;
                return stackIn_69_0;
              }
              if (1 == AuctionItem.field_l.selectedIndex) {
                stackIn_72_0 = 1;
                return stackIn_72_0;
              }
            }
            if (FixedQuaternion.field_e != 13) {
              stackIn_64_0 = -59;
              continue;
            }
            break;
          }
          stackIn_75_0 = 1;
          return stackIn_75_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var2), "rp.BA(" + param0 + ',' + param1 + ')');
        }
    }

    private PasswordFieldPainter(BitmapFont param0, int param1) {
        super(param0, param1);
    }

    final String displayText(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -38) {
            field_D = (String) null;
          }
          stackIn_3_0 = BuyPlayerDialog.repeatCharacter('*', (byte) 48, param1.field_q.length());
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rp.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static QuickChatCommandType[] getQuickChatCommandTypes(int param0) {
        if (param0 == -27666) {
          return new QuickChatCommandType[]{DiskCacheWorker.field_c, IconLabel.field_yb, MachineTokenStorageSupport.field_c, SocketArchiveNetworkClient.field_t, FormationAgent.field_h, ConsoleParseException.field_e, MatchTextInputOverlay.field_o, MatchingTextValidator.field_j, DebugConsole.field_r, IconButtonPainter.field_e, LinkTextPainter.field_b, ChatInputState.field_d, BallAgent.field_z, StreetSceneryLoader.field_l};
        }
        field_A = true;
        return new QuickChatCommandType[]{DiskCacheWorker.field_c, IconLabel.field_yb, MachineTokenStorageSupport.field_c, SocketArchiveNetworkClient.field_t, FormationAgent.field_h, ConsoleParseException.field_e, MatchTextInputOverlay.field_o, MatchingTextValidator.field_j, DebugConsole.field_r, IconButtonPainter.field_e, LinkTextPainter.field_b, ChatInputState.field_d, BallAgent.field_z, StreetSceneryLoader.field_l};
    }

    PasswordFieldPainter(int param0) {
        this(ModelMaterial.field_a, param0);
    }

    public static void releaseStatics(int param0) {
        field_C = null;
        field_z = (String[][]) null;
        field_y = null;
        field_B = null;
        field_D = null;
        field_x = null;
        if (param0 < 84) {
          PasswordFieldPainter.getDaysInMonth(114, -72, -26);
          return;
        }
    }

    static {
        field_y = new String[]{"Timelimit", "Facebook", "Gamemode", "Tournament"};
        field_A = false;
        field_C = "This player did not sell. He remains in your team.";
        field_D = "Computer";
        field_z = new String[][]{new String[]{"000000000000000cf00102040800f300000000000000000000000000000000000", "000000000000000000e1800e1800e100000000000000000000000000000000000", "000000000000000000e1840e18002000000000000000000000000000000000000", "00000000000000000021840e18402100000000000000000000000000000000000"}, new String[]{"000000000000000cf0c0030c0030f300000000000000000000000000000000000", "000000000000000000e1840e18402100000000000000000000000000000000000", "000000000000000000e1030c0030e100000000000000000000000000000000000", "00000000000000000022890a28c02200000000000000000000000000000000000"}};
    }
}
