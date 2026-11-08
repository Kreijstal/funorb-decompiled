/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerInputEvent extends DualLinkNode {
    int value;
    static DisplayNameForm field_n;
    PlayerStats[] field_s;
    byte field_o;
    int participant;
    int eventType;
    static Sprite field_q;
    ClubState field_t;
    byte field_p;

    final static int a(int param0, byte param1, int param2) {
        if (param1 > -24) {
          field_n = (DisplayNameForm) null;
        }
        if (param2 >= 2) {
          return 2;
        }
        if (5 > param0) {
          return 0;
        }
        return 1;
    }

    final static String getAccountLoadingStatus(byte param0) {
        if (!(DateInputValidator.field_d >= 2)) {
          return SortCriterion.field_c;
        }
        if (null != LoginRequiredDialog.field_H) {
          if (!LoginRequiredDialog.field_H.ensureIndex(-42)) {
            return HuffmanCodec.field_g;
          }
          return TutorialMessages.field_e;
        }
        int var1 = 27 % ((param0 + 48) / 56);
        if (!SceneSpriteFactory.field_b.ensureIndex(-78)) {
          return CommonGame.field_M;
        }
        if (!SceneSpriteFactory.field_b.ensurePackedGroupByName(false, "commonui")) {
          return BufferedSocket.field_q + " - " + SceneSpriteFactory.field_b.getGroupProgressByName("commonui", -16248) + "%";
        }
        if (!SelectionMarkerSupport.field_c.ensureIndex(-122)) {
          return QuickChatMenuFactory.field_b;
        }
        if (!SelectionMarkerSupport.field_c.ensurePackedGroupByName(false, "commonui")) {
          return TextLine.field_l + " - " + SelectionMarkerSupport.field_c.getGroupProgressByName("commonui", -16248) + "%";
        }
        if (!PlayerStats.field_k.ensureIndex(-96)) {
          return TeamSelectionAgent.field_l;
        }
        if (!PlayerStats.field_k.ensureAllGroupsAvailable(false)) {
          return SumIntegersCommand.field_H + " - " + PlayerStats.field_k.getOverallProgress(-8185) + "%";
        }
        return RegistrationUiSupport.field_a;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          return;
        }
        field_n = null;
        field_q = null;
    }

    final static void a(boolean param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        RankingsRequest stackIn_35_0 = null;
        boolean stackIn_36_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        RankingsRequest var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        CipherPacketBuffer var14 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = Kickabout.field_G;
        try {
          var14 = ByteArrayPool.field_e;
          var2 = var14.readUnsignedByte((byte) -109);
          var3 = (RankingsRequest) (WorldDrawEntry.field_i.first(24009));
          while (var3 != null) {
            if (var2 != var3.field_k) {
              var3 = (RankingsRequest) (WorldDrawEntry.field_i.next(33));
              continue;
            }
            break;
          }
          if (var3 == null) {
            FormationView.closeClientSocket((byte) -116);
            return;
          }
          var4 = var14.readUnsignedByte((byte) -127);
          if (0 != var4) {
            FindingOpponentScreen.field_B[0] = ArchiveSource.field_e;
            var5 = var3.field_p;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              FindingOpponentScreen.field_B[var6_int] = var14.readString(124);
            }
            ArchiveManager.prepareRankingStatistics(-20669, var4, var5);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              ByteStorage.readPackedRankingStatistics(var14, 542439655);
              if (var6_intLifetime1 == 0) {
                var3.field_f = FormationView.field_r;
                var3.field_m = GameOptionMenuSupport.field_d;
                var3.field_j = MenuButton.field_j;
                var3.field_h = AuctionsHelpScreen.field_E;
                WidgetStyleFactory.appendRankingStatistics(AuctionsHelpScreen.field_E, (byte) -106, MenuButton.field_j, var6_intLifetime1, FormationView.field_r, GameOptionMenuSupport.field_d);
              } else {
                WidgetStyleFactory.appendRankingStatistics(AuctionsHelpScreen.field_E, (byte) -106, MenuButton.field_j, var6_intLifetime1, FormationView.field_r, GameOptionMenuSupport.field_d);
              }
            }
            TabStrip.selectTopRankingRows(var5, (byte) 63);
            dupTemp$0 = new String[2][var5];
            var3.field_i = dupTemp$0;
            var6 = dupTemp$0;
            dupTemp$1 = new int[2][4 * var5];
            var3.field_o = dupTemp$1;
            var7 = dupTemp$1;
            var8 = AuctionsScreen.field_O;
            var9 = 0;
            var10 = 0;
            while (var9 < var8) {
              var11 = ByteStorage.field_d[var9];
              var6[0][var10] = FindingOpponentScreen.field_B[var11];
              var7[0][4 * var10] = LobbyMatchPreview.field_m[var11];
              var7[0][1 + var10 * 4] = AccountMessagePanel.field_G[var11];
              var7[0][2 + var10 * 4] = AgeValidator.field_j[var11];
              var7[0][3 + 4 * var10] = DropTargetWidget.field_B[var11];
              if (SumIntegersCommand.isLocalPlayerName((byte) -89, FindingOpponentScreen.field_B[var11]) &&
                DropTargetWidget.field_B[var11] + AccountMessagePanel.field_G[var11] + AgeValidator.field_j[var11] == 0) {
                var6[0][var10] = null;
                var10--;
              }
              var10++;
              var9++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = ByteStorage.field_d[var5 + var9Lifetime1];
              var6[1][var13] = FindingOpponentScreen.field_B[var11Lifetime1];
              var7[1][4 * var13] = LobbyMatchPreview.field_m[var11Lifetime1];
              var7[1][1 + var13 * 4] = AccountMessagePanel.field_G[var11Lifetime1];
              var7[1][var13 * 4 + 2] = AgeValidator.field_j[var11Lifetime1];
              var7[1][4 * var13 + 3] = DropTargetWidget.field_B[var11Lifetime1];
              if (SumIntegersCommand.isLocalPlayerName((byte) 52, FindingOpponentScreen.field_B[var11Lifetime1]) &&
                AccountMessagePanel.field_G[var11Lifetime1] + AgeValidator.field_j[var11Lifetime1] + DropTargetWidget.field_B[var11Lifetime1] == 0) {
                var6[1][var13] = null;
                var13--;
              }
              var9Lifetime1++;
              var13++;
            }
          }
          stackIn_35_0 = var3;
          stackIn_36_1 = (param0);
          stackIn_35_0.field_e = stackIn_36_1;
          var3.unlink((byte) -109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "ki.D(" + param0 + ')');
        }
    }

    final static boolean readBooleanByte(PacketBuffer param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.readUnsignedByte((byte) -121);
          var4 = 4 % ((param1 - 15) / 62);
          stackIn_3_0 = (var2_int != 1) ? 0 : 1;
          var3 = stackIn_3_0;
          stackIn_4_0 = var3;
          return stackIn_4_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ki.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    PlayerInputEvent(int param0, int param1, int param2, byte param3, byte param4) {
        this.eventType = param0;
        this.value = param2;
        this.participant = param1;
        this.field_o = param3;
        this.field_p = param4;
    }

    public final String toString() {
        Object var1;
        Object var2;
        int var3;
        int var4;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        var4 = Kickabout.field_G;
        var1 = null;
        if (this.eventType == 0) {
          var1 = "Keyheld";
        }
        var2 = " " + this.value;
        if (this.eventType == 2) {
          var1 = "Mouse";
          var2 = "Click(" + this.field_o + "," + this.field_p + ") ";
        }
        if (this.eventType == 1) {
          var1 = "Keypress";
          var3 = this.value;
          if (0 == var3) {
            var2 = " DASH";
          } else {
            if (var3 == 1) {
              var2 = " SELECT0";
            } else {
              if (2 != var3) {
                if (var3 != 3) {
                  if (var3 != 4) {
                    if (5 != var3) {
                      if (var3 == 6) {
                        var2 = " CHARGE_KICK_LEFT";
                      } else {
                        if (var3 == 7) {
                          var2 = " CHARGE_KICK_RIGHT";
                        }
                      }
                    } else {
                      var2 = " SELECT4";
                    }
                  } else {
                    var2 = " SELECT3";
                  }
                } else {
                  var2 = " SELECT2";
                }
              } else {
                var2 = " SELECT1";
              }
            }
          }
        }
        if (4 == this.eventType) {
          var1 = "Team";
          var3Lifetime1 = this.value;
          if (0 == var3Lifetime1) {
            var2 = " Left";
          } else {
            if (var3Lifetime1 == 1) {
              var2 = " Right";
            } else {
              if (var3Lifetime1 == 2) {
                var2 = " Ready";
              }
            }
          }
          var2 = " data=" + this.value;
        }
        if (5 == this.eventType) {
          var2 = " data=" + this.value;
          var1 = "LineUp";
        }
        if (this.eventType == 7) {
          var1 = "Cheat";
          var2 = " data=" + this.value;
        }
        if (6 == this.eventType) {
          var3Lifetime2 = this.value;
          if (var3Lifetime2 != 0) {
            if (var3Lifetime2 != 1) {
              if (2 != var3Lifetime2) {
                if (var3Lifetime2 == 3) {
                  var2 = " OfferRematch";
                }
              } else {
                var2 = " OfferDraw";
              }
            } else {
              var2 = " Resign";
            }
          } else {
            var2 = " Depart";
          }
          var1 = "meta";
          var2 = var1;
          var2 = var1;
        }
        if (this.eventType == 3) {
          var3Lifetime3 = this.value;
          if (var3Lifetime3 != 0) {
            if (var3Lifetime3 == 1) {
              var2 = " Right";
            } else {
              if (var3Lifetime3 == 2) {
                var2 = " OK";
              }
            }
          } else {
            var2 = " Left";
          }
          var1 = "formation";
        }
        return new String("{Move" + (String) (var1) + (String) (var2) + "}");
    }

    static {
    }
}
