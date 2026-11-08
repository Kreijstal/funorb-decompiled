/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PlayingView extends MatchPhaseView {
    private boolean field_B;
    private int field_z;
    static String[][] field_y;
    private Sprite[] field_C;
    static UiLayoutNode field_w;
    static long field_o;
    private int field_G;
    private int field_D;
    static String field_K;
    private boolean field_k;
    static int field_J;
    private boolean field_u;
    private byte[] field_t;
    private int[] field_v;
    private boolean field_m;
    private boolean field_L;
    private IntrusiveDeque field_r;
    private int field_H;
    static String field_F;
    private int field_s;
    private int field_I;
    boolean field_l;
    private boolean field_j;
    private int field_q;
    private boolean field_E;
    private boolean field_n;
    private boolean field_x;
    private int field_p;

    private final void switchToNearestTeammate(int param0, int param1, int param2) {
        int var8 = 0;
        int var4;
        int var5;
        int var6;
        FootballerAgent[] var7;
        FootballerAgent var9;
        int var10;
        int var11;
        int var12;
        int var13;
        var13 = Kickabout.field_G;
        var4 = this.field_a.field_g[this.field_g].team;
        var5 = -1;
        var6 = 2147483647;
        var7 = this.field_a.field_P[var4];
        for (var8 = 1; var7.length > var8; var8++) {
          var9 = var7[var8];
          var10 = -param1 + var9.pixelX(-125);
          var11 = -param0 + var9.pixelY(true);
          var12 = var10 * var10 + var11 * var11;
          if (this.field_a.findControllingParticipant((byte) 6, var4, var8) >= 0) {
            var12 = var12 << 1;
          }
          if (var12 < var6) {
            var6 = var12;
            var5 = var8;
          }
        }
        this.queueKeypress(var5 + param2, -1);
    }

    private final int a(byte param0, int param1) {
        if (param0 >= -56) {
          return -33;
        }
        return ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-61, param1, MidiPcmStream.field_l);
    }

    private final void playCrowdReaction(boolean param0, int param1, int param2) {
        boolean stackIn_12_0;
        int stackIn_12_1;
        int stackIn_12_2;
        boolean stackIn_12_3;
        boolean stackIn_13_4;
        int var5;
        var5 = Kickabout.field_G;
        if (this.field_a.field_X.goalCount >= 40) {
          return;
        }
        if (this.field_a.field_V.possessorTeam >= 0 &&
          0 <= this.field_s &&
          this.field_a.field_V.possessorTeam != this.field_s) {
          if (1 == RankingsScreen.field_C ||
            RankingsScreen.field_C == 2) {
            stackIn_12_0 = false;
            stackIn_12_1 = -1;
            stackIn_12_2 = -79;
            stackIn_12_3 = param0;
            stackIn_13_4 = !(param0);
            ParticipantStatus.$cfr$intArgs$a$60f25194e713(stackIn_12_0, stackIn_12_1, stackIn_12_2, UiWidget.a(stackIn_12_3, stackIn_13_4, (byte) 97, false, false));
          }
          if (RankingsScreen.field_C == 1) {
            if (!param0) {
              ParticipantStatus.$cfr$intArgs$a$60f25194e713(false, -1, 81, 3);
            } else {
              ParticipantStatus.$cfr$intArgs$a$60f25194e713(false, -1, -111, 4);
            }
          }
          if (RankingsScreen.field_C == 2) {
            if (!param0) {
              ParticipantStatus.$cfr$intArgs$a$60f25194e713(false, -1, -99, 24);
            } else {
              ParticipantStatus.$cfr$intArgs$a$60f25194e713(false, -1, 104, 25);
            }
          }
          if (RankingsScreen.field_C == 3) {
            if (!param0) {
              ParticipantStatus.$cfr$intArgs$a$60f25194e713(false, -1, -70, 30);
            } else {
              ParticipantStatus.$cfr$intArgs$a$60f25194e713(false, -1, 79, 31);
            }
          }
        }
        if (param1 != 3) {
          return;
        }
        if (this.field_s == -1 &&
          1 - param2 == this.field_a.field_V.possessorTeam &&
          param2 == this.field_D) {
          if (RankingsScreen.field_C == 1) {
            ParticipantStatus.$cfr$intArgs$a$60f25194e713(false, -1, 91, 5);
          }
          if (2 == RankingsScreen.field_C) {
            ParticipantStatus.$cfr$intArgs$a$60f25194e713(false, -1, 91, 26);
          }
          if (RankingsScreen.field_C == 3) {
            ParticipantStatus.$cfr$intArgs$a$60f25194e713(false, -1, 96, 32);
          }
        }
    }

    private final int getFocusedParticipant(int param0) {
        if (param0 != -41) {
          this.field_m = false;
        }
        return this.isLocalParticipantActive((byte) 13) ? this.field_g : this.field_a.b((byte) -69, this.field_h);
    }

    private final void l(int param0) {
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_1 = 0;
        boolean stackIn_61_1 = false;
        int stackIn_94_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_116_0 = 0;
        boolean stackIn_116_1 = false;
        boolean stackIn_116_2 = false;
        boolean stackIn_117_3 = false;
        boolean stackIn_122_0 = false;
        int stackIn_122_1 = 0;
        int stackIn_122_2 = 0;
        int stackIn_123_3;
        boolean stackIn_128_0 = false;
        int stackIn_128_1 = 0;
        int stackIn_128_2 = 0;
        int stackIn_129_3;
        boolean stackIn_134_0 = false;
        int stackIn_134_1 = 0;
        int stackIn_134_2 = 0;
        int stackIn_135_3;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = Kickabout.field_G;
        if (!this.field_E) {
          SelectionMarkerSupport.a(0);
          this.field_E = true;
        }
        if (40 > this.field_a.field_X.goalCount) {
          this.field_p = this.field_p - 1;
        }
        if (this.field_a.field_X.goalCount != 0) {
          this.field_B = true;
        } else {
          if (this.field_B) {
            ShopPlayerSlot.c(34, 75);
            this.field_B = false;
          }
        }
        if (this.field_f &&
          this.field_a.phaseTime == this.field_a.timeLimit) {
          ShopPlayerSlot.c(34, param0 - 2004);
        }
        if (this.field_f &&
          this.field_a.phaseTime <= 100 &&
          !this.field_j) {
          this.field_j = true;
          ShopPlayerSlot.c(33, 98);
        }
        if (-2 != this.field_g) {
          stackIn_25_0 = this.field_a.field_g[this.field_g].team;
        } else {
          stackIn_25_0 = 0;
        }
        var2 = stackIn_25_0;
        stackIn_28_0 = (this.field_a.field_V.possessorTeam != var2) ? 0 : 1;
        var3 = stackIn_28_0;
        stackIn_30_0 = 44040192;
        stackIn_31_1 = (var2 == 0) ? -655360 : 655360;
        stackIn_34_0 = (stackIn_30_0 + stackIn_31_1 <= this.field_a.field_V.positionY) ? 0 : 1;
        var4 = stackIn_34_0;
        if (var2 == 0 &&
          var4 == 0) {
          stackIn_44_0 = 1;
        } else {
          if (1 == var2) {
            stackIn_44_0 = (var4 != 0) ? 1 : 0;
          } else {
            stackIn_44_0 = 0;
          }
        }
        var5 = stackIn_44_0;
        stackIn_47_0 = (var5 != 0) ? 0 : 1;
        var6 = stackIn_47_0;
        if (param0 != 2115) {
          return;
        }
        stackIn_52_0 = (var6 != 0) ? 0 : 1;
        stackIn_55_1 = (this.field_L) ? 0 : 1;
        if (stackIn_52_0 != stackIn_55_1 &&
          this.field_a.field_X.goalCount < 40) {
          stackIn_61_1 = (var6 != 0);
          this.field_L = stackIn_61_1;
          AppletContextSupport.a(RankingsScreen.field_C, NanoTickClock.field_n, true, this.field_L);
        }
        if (NanoTickClock.field_n) {
          if (RankingsScreen.field_C == 1 ||
            2 == RankingsScreen.field_C) {
            this.a(var3 != 0, 4, var5 != 0);
          }
          if (3 == RankingsScreen.field_C) {
            this.o(-23079);
          }
        }
        if (this.field_a.field_V.possessorTeam == -1 &&
          this.field_s >= 0 ||
          !(0 > this.field_a.field_V.field_j)) {
          if (Math.abs(this.field_a.field_V.verticalVelocity >> 16) <= 4) {
            if (this.field_a.field_V.horizontalSpeedSquared(-118) > 6553600) {
              ShopPlayerSlot.c(37, -113);
            } else {
              ShopPlayerSlot.c(36, param0 ^ -2087);
            }
          } else {
            ShopPlayerSlot.c(35, param0 - 2024);
          }
        }
        if (NanoTickClock.field_n) {
          this.playCrowdReaction(var3 != 0, param0 - 2112, var2);
        }
        if (NanoTickClock.field_n && (this.field_a.field_V.field_y ||
          this.field_a.field_V.field_x)) {
          if (24248320 < this.field_a.field_V.positionX) {
            if (this.field_a.field_V.positionX < 34603008) {
              stackIn_94_0 = (this.field_a.field_V.height < 2359296) ? 1 : 0;
            } else {
              stackIn_94_0 = 0;
            }
          } else {
            stackIn_94_0 = 0;
          }
          var7 = stackIn_94_0;
          if (this.field_a.field_V.positionX > 19573418) {
            stackIn_100_0 = (39146837 <= this.field_a.field_V.positionX) ? 0 : 1;
          } else {
            stackIn_100_0 = 0;
          }
          var8 = stackIn_100_0;
          if (var5 == 0 &&
            var8 != 0 &&
            var7 == 0) {
            if (RankingsScreen.field_C == 1) {
              ParticipantStatus.$cfr$intArgs$a$60f25194e713(false, -1, 122, 5);
            }
            if (RankingsScreen.field_C == 2) {
              ParticipantStatus.$cfr$intArgs$a$60f25194e713(false, -1, -106, 26);
            }
            if (RankingsScreen.field_C == 3) {
              ParticipantStatus.$cfr$intArgs$a$60f25194e713(false, -1, -75, 32);
            }
          }
        }
        if (this.field_a.field_X.score[0] != this.field_v[0] ||
          this.field_a.field_X.score[1] != this.field_v[1]) {
          ScrollBar.k(param0 - 2115);
          stackIn_116_0 = RankingsScreen.field_C;
          stackIn_116_1 = NanoTickClock.field_n;
          stackIn_116_2 = true;
          stackIn_117_3 = (var5 == 0);
          AppletContextSupport.a(stackIn_116_0, stackIn_116_1, stackIn_116_2, stackIn_117_3);
          if (NanoTickClock.field_n) {
            if (RankingsScreen.field_C == 1) {
              stackIn_122_0 = false;
              stackIn_122_1 = -1;
              stackIn_122_2 = -87;
              if (var5 != 0) {
                stackIn_123_3 = 3;
              } else {
                stackIn_123_3 = 23;
              }
              ParticipantStatus.$cfr$intArgs$a$60f25194e713(stackIn_122_0, stackIn_122_1, stackIn_122_2, stackIn_123_3);
            }
            if (2 == RankingsScreen.field_C) {
              stackIn_128_0 = false;
              stackIn_128_1 = -1;
              stackIn_128_2 = 113;
              if (var5 != 0) {
                stackIn_129_3 = 24;
              } else {
                stackIn_129_3 = 27;
              }
              ParticipantStatus.$cfr$intArgs$a$60f25194e713(stackIn_128_0, stackIn_128_1, stackIn_128_2, stackIn_129_3);
            }
            if (RankingsScreen.field_C == 3) {
              stackIn_134_0 = false;
              stackIn_134_1 = -1;
              stackIn_134_2 = -100;
              if (var5 != 0) {
                stackIn_135_3 = 30;
              } else {
                stackIn_135_3 = 43;
              }
              ParticipantStatus.$cfr$intArgs$a$60f25194e713(stackIn_134_0, stackIn_134_1, stackIn_134_2, stackIn_135_3);
            }
          }
        }
        this.field_v[0] = this.field_a.field_X.score[0];
        this.field_v[1] = this.field_a.field_X.score[1];
        if (this.field_a.field_V.possessorTeam == 1 - this.field_D) {
          this.field_D = this.field_a.field_V.possessorTeam;
        }
    }

    final boolean b(byte param0) {
        int var2;
        boolean stackIn_5_0 = false;
        var2 = 121 % ((17 - param0) / 35);
        stackIn_5_0 = (this.field_k) || (this.field_m);
        return stackIn_5_0;
    }

    final static LoginText f(int param0) {
        if (param0 != -1) {
          PlayingView.d((byte) -2);
        }
        return new LoginText(LobbyPlayerRow.a(320), TextLine.isAvailabilityCheckPending(false));
    }

    private final void queueMouseMove(int param0, int param1, int param2) {
        int var8;
        int stackIn_10_0 = 0;
        int var4;
        int var5;
        int var6;
        PlayerInputEvent var7;
        var8 = Kickabout.field_G;
        while (true) {
          if (127 >= Math.abs(param0) &&
            Math.abs(param1) <= 127) {
            if (param2 != -1) {
              return;
            }
            var4 = (byte)param0;
            var5 = (byte)param1;
            if (this.field_a.c(this.field_g, -111)) {
              stackIn_10_0 = this.field_a.getControlledFootballer((byte) 97, this.field_g).actionTime;
            } else {
              stackIn_10_0 = 0;
            }
            var6 = stackIn_10_0;
            var7 = InstrumentNoteMask.createMouseEvent(this.field_g, var6, 85, (byte) var5, (byte) var4);
            this.queueInputEvent(false, var7);
            if (this.field_f) {
              FootballerAiOverlaySupport.field_d.b(71, (byte) 94);
              FootballerAiOverlaySupport.field_d.writeByte(114, var6);
              FootballerAiOverlaySupport.field_d.writeByte(111, var4);
              FootballerAiOverlaySupport.field_d.writeByte(125, var5);
            }
            return;
          }
          param1 = param1 / 2;
          param0 = param0 / 2;
        }
    }

    final void m(int param0) {
        if (param0 > -77) {
          this.queueKeypress(-34, -31);
        }
        this.wrapAgentsForRendering(this.field_a, this.field_f, 370);
        this.a((IntrusiveDeque) null, (byte) -126);
    }

    private final void pollMovementKeys(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        boolean[] var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        boolean[] var12;
        var11 = Kickabout.field_G;
        var12 = GameplayHelpScreen.field_G;
        var2 = var12;
        if (!var12[TextPromptDialog.field_Kb]) {
          stackIn_6_0 = (var12[98]) ? 1 : 0;
        } else {
          stackIn_6_0 = 1;
        }
        var3 = stackIn_6_0;
        if (!var12[PlayerContextMenu.field_e]) {
          stackIn_12_0 = (var12[96]) ? 1 : 0;
        } else {
          stackIn_12_0 = 1;
        }
        var4 = stackIn_12_0;
        if (var12[ArchivePreloadEntry.field_e]) {
          stackIn_18_0 = 1;
        } else {
          stackIn_18_0 = (var12[99]) ? 1 : 0;
        }
        var5 = stackIn_18_0;
        if (param0 >= -110) {
          this.field_s = -84;
        }
        if (!var12[IsSixCommand.field_A]) {
          stackIn_26_0 = (var12[97]) ? 1 : 0;
        } else {
          stackIn_26_0 = 1;
        }
        boolean decompiledFrameRemainder0 = true;
        var6 = stackIn_26_0;
        if (!this.field_f &&
          MyKitScreen.field_O) {
          if (!var12[TextPromptDialog.field_Kb] &&
            !var12[ArchivePreloadEntry.field_e] &&
            !var12[PlayerContextMenu.field_e] &&
            !var12[IsSixCommand.field_A]) {
            if ((var12[98] ||
              var12[99] ||
              var12[96] ||
              var12[97])) {
              NotCommand.$cfr$intArgs$a$7ffe4b125357(50, false);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            NotCommand.$cfr$intArgs$a$7ffe4b125357(50, true);
          }
        }
        if (this.field_l) {
          if (this.isLocalParticipantActive((byte) 13)) {
            if (FaceNormal.field_c) {
              var7 = var3;
              var3 = var5;
              var5 = var7;
              var7 = var4;
              var4 = var6;
              var6 = var7;
            }
            var7 = 0;
            if (var3 != 0) {
              var7 = var7 | 4;
            }
            if (var5 != 0) {
              var7 = var7 | 1;
            }
            if (var4 != 0) {
              var7 = var7 | 2;
            }
            if (var6 != 0) {
              var7 = var7 | 8;
            }
            if (this.field_H != var7 ||
              this.field_a.getControlledFootballer((byte) -38, this.field_g).directionMask != var7) {
              this.field_H = var7;
              this.b(false);
            }
          }
          if (var2[SquadSlotWidget.field_Jb]) {
            this.field_q = this.field_q - 16;
            if (128 > this.field_q) {
              this.field_q = 128;
            }
          }
          if (var2[SpriteNumberPainter.field_a]) {
            this.field_q = this.field_q + 16;
            if (this.field_q > 256) {
              this.field_q = 256;
            }
          }
        } else {
          regionExit1: {
            var7 = 15;
            if ((var4 != 0 ||
              var6 != 0) && (var3 != 0 ||
              var5 != 0)) {
              var7 = var7 * 200;
              break regionExit1;
            }
            var7 = var7 << 8;
          }
          var7 = var7 / InstrumentNoteMask.field_i;
          var8 = 0;
          var9 = 0;
          if (var4 != 0) {
            var8 = var8 - var7;
          }
          var10 = 0;
          if (var3 != 0) {
            var9 = var9 - var7;
          }
          if (var6 != 0) {
            var8 = var8 + var7;
          }
          if (var5 != 0) {
            var9 = var9 + var7;
          }
          if (var2[SquadSlotWidget.field_Jb]) {
            var10 -= 16;
          }
          if (var2[SpriteNumberPainter.field_a]) {
            var10 += 16;
          }
          ResourceArchive.a((double)var9, (byte) 127, (double)var8, (double)var10);
        }
    }

    private final void pollLocalInput(int param0) {
        boolean stackIn_10_1 = false;
        boolean stackIn_11_2 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_14_2 = false;
        int stackIn_22_0 = 0;
        boolean stackIn_58_1 = false;
        int var2;
        int var3;
        FootballerAgent var4;
        int var5;
        int var2Lifetime1;
        var5 = Kickabout.field_G;
        if (ArchiveIndex.b(640) &&
          !this.b((byte) -65)) {
          return;
        }
        if (2 == RasterGammaSupport.field_a) {
          this.field_m = true;
        }
        if (RasterGammaSupport.field_a == 1) {
          this.field_k = true;
        }
        stackIn_10_1 = this.field_k;
        stackIn_11_2 = (AccountNameCheckState.field_c == 1);
        this.field_k = stackIn_10_1 & stackIn_11_2;
        stackIn_13_1 = this.field_m;
        stackIn_14_2 = (AccountNameCheckState.field_c == 2);
        this.field_m = stackIn_13_1 & stackIn_14_2;
        if (param0 != 16623) {
          this.field_n = true;
        }
        if (!this.isLocalParticipantActive((byte) 13)) {
          if (2 == RasterGammaSupport.field_a) {
            stackIn_58_1 = !(this.field_l);
            this.field_l = stackIn_58_1;
          }
        } else {
          if (this.field_l &&
            this.field_a.participantStatus[this.field_g].isActive(param0 ^ 19800)) {
            stackIn_22_0 = (!this.field_k) ? 0 : 1;
            var2 = stackIn_22_0;
            var3 = this.field_m ? 1 : 0;
            var4 = this.field_a.getControlledFootballer((byte) 122, this.field_g);
            if (0 == this.field_I ||
              var2 != 0) {
              if (ArrayWidgetContainer.field_x == -1 &&
                TutorialCaptionSupport.field_j == -1) {
                this.field_z = -1;
                this.field_G = -1;
              } else {
                this.field_z = AccountTermsPanel.screenToWorldX(ArrayWidgetContainer.field_x, 6784) - var4.pixelX(-103);
                this.field_G = TextLayoutLine.screenToWorldY(-6779, TutorialCaptionSupport.field_j) - var4.pixelY(true);
              }
            }
            if (var4.action == 1) {
              if (var2 == 0 &&
                var3 == 0) {
                this.queueMouseMove(this.field_z, this.field_G, -1);
              }
            } else {
              if (-1 != ArrayWidgetContainer.field_x ||
                TutorialCaptionSupport.field_j != -1) {
                if (!this.field_a.c(this.field_g, -115)) {
                  if (var2 != 0 &&
                    var4.d((byte) 102)) {
                    this.queueMouseMove(this.field_z, this.field_G, -1);
                    this.field_k = false;
                  }
                  if (this.field_m) {
                    this.switchToNearestTeammate(TextLayoutLine.screenToWorldY(-6779, TutorialCaptionSupport.field_j), AccountTermsPanel.screenToWorldX(ArrayWidgetContainer.field_x, 6784), 1);
                    this.field_m = false;
                  }
                } else {
                  if (var2 == 0) {
                    if (var3 != 0) {
                      this.queueKeypress(7, -1);
                    }
                  } else {
                    this.queueKeypress(6, param0 - 16624);
                  }
                }
                if (var2 == 0) {
                  this.field_I = 0;
                } else {
                  this.field_I = this.field_I + 1;
                }
              }
            }
          }
        }
        var2Lifetime1 = StatefulTextPainter.field_v;
        if (this.field_l) {
          if (var2Lifetime1 > 0) {
            this.field_q = this.field_q - 16;
            if (this.field_q < 128) {
              this.field_q = 128;
            }
          }
          if (var2Lifetime1 < 0) {
            this.field_q = this.field_q + 16;
            if (this.field_q > 256) {
              this.field_q = 256;
            }
          }
        } else {
          if (0 < var2Lifetime1) {
            ResourceArchive.a(0.0, (byte) 127, 0.0, -16.0);
          }
          if (var2Lifetime1 < 0) {
            ResourceArchive.a(0.0, (byte) 127, 0.0, 16.0);
          }
        }
    }

    final void a(IntrusiveDeque param0, byte param1) {
        int var4_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        WorldDrawEntry var4 = null;
        int var5 = 0;
        int var3_intLifetime1;
        var5 = Kickabout.field_G;
        try {
          if (null == this.field_r) {
            this.field_r = new IntrusiveDeque();
          } else {
            this.field_r.clear(22997);
          }
          for (var3_int = 0; 2 > var3_int; var3_int++) {
            for (var4_int = 0; var4_int < 5; var4_int++) {
              this.field_r.addLast(TextHotspotWidget.a((RenderedFootballer) (this.field_a.field_P[var3_int][var4_int]), 1), 3);
            }
          }
          this.field_r.addLast(ValidatedTextWidget.a((RenderedBall) (this.field_a.field_V), false), 3);
          this.field_r.addLast(CheckboxPainter.a(true, 115), 3);
          var3_intLifetime1 = -88 / ((4 - param1) / 50);
          this.field_r.addLast(CheckboxPainter.a(false, 92), 3);
          if (param0 != null) {
            var4 = (WorldDrawEntry) (param0.g(24009));
            while (var4 != null) {
              var4.c((byte) -109);
              this.field_r.addLast(var4, 3);
              var4 = (WorldDrawEntry) (param0.c(33));
            }
          }
          IntTripleCommand.a(this.field_r, -22488);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("va.NA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void o(int param0) {
        int var2 = 0;
        int var3 = 0;
        FadingSoundPlayer var4 = null;
        if (this.field_p <= 0 &&
          this.field_a.field_X.goalCount < 40 &&
          !PlayerPortraitCacheEntry.isFadingSoundActive(90, 28) &&
          !PlayerPortraitCacheEntry.isFadingSoundActive(117, 29)) {
          var2 = this.a((byte) -97, 2);
          var3 = 1 == var2 ? 1 + this.a((byte) -104, 2) : this.a((byte) -103, 3) + 3;
          var4 = ParticipantStatus.$cfr$intArgs$a$60f25194e713(false, -1, -65, 28 + var2);
          if (var4 != null) {
            var4.startFadeIn(200, true);
            var4.startFadeOut(200, (byte) -4);
            var4.setStartDelay(var3, param0 ^ -23079);
          }
          this.field_p = this.a((byte) -89, 400) + 600;
        }
        if (param0 != -23079) {
          this.field_z = 59;
        }
    }

    private final void wrapAgentsForRendering(CommonGame param0, boolean param1, int param2) {
        int var4_int = 0;
        int var8 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_1 = false;
        RenderedBall stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        int stackIn_22_0 = 0;
        RenderedFootballer stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        PlayerStats var13_ref_up = null;
        int var13 = 0;
        int var14_int = 0;
        MeshData var14 = null;
        RenderedFootballer var15 = null;
        int var16 = 0;
        var16 = Kickabout.field_G;
        try {
          if (param2 != 370) {
            field_K = (String) null;
          }
          stackIn_5_0 = param1;
          stackIn_6_1 = !(LeaderboardParticipant.field_f);
          param1 = stackIn_5_0 & stackIn_6_1;
          param0.field_V = (BallAgent) ((Object) new RenderedBall(param0.field_V));
          stackIn_8_0 = (RenderedBall) (param0.field_V);
          stackIn_9_1 = (param1);
          stackIn_8_0.field_I = stackIn_9_1;
          for (var4_int = 0; var4_int < 2; var4_int++) {
            var5 = param0.field_H[var4_int];
            var6 = param0.field_d[var4_int];
            var7 = param0.field_Q[var4_int];
            for (var8 = 0; var8 < 5; var8++) {
              if (0 == var8) {
                var9 = 4;
                var10 = 1;
                var11 = 0;
                var12 = 0;
              } else {
                var13_ref_up = param0.field_b[var4_int][var8 - 1];
                var9 = var13_ref_up.archetype;
                var14_int = var13_ref_up.appearance;
                var12 = (var14_int & 15) >> 0;
                var10 = var14_int >> 8 & 15;
                var11 = (var14_int & 245) >> 4;
              }
              if (AccountRegistrationResponse.isHalloweenAppearanceEnabled((byte) 24)) {
                stackIn_22_0 = (param0.field_P[var4_int][var8].stats.c((byte) -107, param0.field_P[var4_int][var8].member)) ? 1 : 0;
              } else {
                stackIn_22_0 = 0;
              }
              var13 = stackIn_22_0;
              var14 = AuctionItem.a(var5, var6, var10, var9, var11, var12, var7, false, this.field_n, var13 != 0);
              var15 = new RenderedFootballer(var14, var9, false, param0.field_P[var4_int][var8]);
              stackIn_24_0 = var15;
              stackIn_25_1 = (param1);
              stackIn_24_0.field_E = stackIn_25_1;
              param0.field_P[var4_int][var8] = (FootballerAgent) ((Object) var15);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("va.MA(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void onButtonClick(int param0, int param1) {
        if (param0 <= 98) {
          IntrusiveDeque var4 = (IntrusiveDeque) null;
          this.a((IntrusiveDeque) null, (byte) -3);
        }
    }

    private final void queueInputEvent(boolean param0, PlayerInputEvent param1) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_a.enqueueEvent(param1, -115);
          if (param0) {
            return;
          }
          if (param1.eventType == 0 ||
            1 == param1.eventType) {
            ((RenderedFootballer) (this.field_a.getControlledFootballer((byte) 105, this.field_g))).field_Z = false;
          }
          if (2 == param1.eventType &&
            this.field_a.c(this.field_g, -7) &&
            RotaryDialPainter.field_n &&
            !MyKitScreen.field_O) {
            this.switchToPredictedReceiver(InstrumentNoteMask.createMouseEvent(param1.participant, param1.value, -115, param1.field_p, param1.field_o), -122);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("va.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void updateCamera(boolean param0) {
        int var2;
        RenderedFootballer var3;
        int var4;
        RenderedBall var4_ref_ob;
        int var5;
        int var6;
        int var7;
        double var7_double;
        double var9;
        double var11;
        double var13;
        double var15;
        double var17;
        if (!this.field_l) {
          return;
        }
        if (this.field_a.field_X.goalCount > 25) {
          PitchAppearanceSupport.setProjectionTarget(128.0, 60, 448.0, 672.0);
          return;
        }
        if (MyKitScreen.field_O) {
          KitStyleTile.j(13459);
          return;
        }
        if (!param0) {
          this.playCrowdReaction(false, 114, -8);
        }
        var2 = this.getFocusedParticipant(-41);
        var3 = (RenderedFootballer) (this.field_a.getControlledFootballer((byte) -70, var2));
        if (this.field_a.c(var2, -67)) {
          var4 = var3.getRenderedX(1606384336);
          var5 = var3.h(1000);
          var6 = var3.directionX * 0;
          var7 = 50 * var3.directionY;
          PitchAppearanceSupport.setProjectionTarget((double)this.field_q, 60, (double)(var6 + var4), (double)(var5 + var7));
        } else {
          var4_ref_ob = (RenderedBall) (this.field_a.field_V);
          var5 = var4_ref_ob.positionX >> 16;
          var6 = var4_ref_ob.getRenderedY(true) + (var4_ref_ob.positionY >> 16) >> 1;
          var7_double = (double)var3.field_kb / 65536.0;
          var9 = (double)var3.field_bb / 65536.0;
          var11 = (double)(this.field_q + 40);
          var13 = (double)(-var5) + var7_double;
          var15 = (double)(-var6) + var9;
          var17 = Math.sqrt(var13 * var13 + var15 * var15);
          if (340.0 < var17) {
            var11 = 340.0 * var11 / var17;
          }
          PitchAppearanceSupport.setProjectionTarget(var11, 60, (double)((int)var7_double + var5 >> 1), (double)((int)var9 + var6 >> 1));
        }
        return;
    }

    private final void updateAimIndicator(byte param0) {
        int var2;
        int var3;
        RenderedFootballer var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var10 = Kickabout.field_G;
        var2 = this.field_z;
        var3 = this.field_G;
        if (var2 == -1 &&
          var3 == -1) {
          return;
        }
        if (FaceNormal.field_c) {
          var2 = -var2;
          var3 = -var3;
        }
        if (param0 <= 102) {
          this.field_L = true;
        }
        var4 = (RenderedFootballer) (this.field_a.getControlledFootballer((byte) 93, this.field_g));
        var5 = SocialListLayoutSupport.worldToScreenX(0, var4.field_kb >> 16);
        var6 = IntKeyLookup.a((byte) -110, var4.field_bb >> 16);
        if (this.field_a.c(this.field_g, -50) &&
          var4.action != 2) {
          if (this.field_a.field_y) {
            return;
          }
          if (var4.action != 1) {
            PasswordValidator.a(706856675, 128, 256, var2, var3, true);
            GameMediaSupport.drawViewportScaledSprite(653278209, var5, var6);
          } else {
            var7 = var4.a(var4.actionTime, (byte) -68);
            PasswordValidator.a(706856675, 256, var7, var2, var3, true);
            GameMediaSupport.drawViewportScaledSprite(653278209, var5, var6);
          }
        } else {
          if (this.field_a.field_l) {
            return;
          }
          if (var4.action == 3) {
            var7 = BuyPitchDialog.field_I[3];
            if (0 == var4.archetype) {
              var7 = var7 << 1;
            }
            var8 = var7 - var4.actionTime;
            if (var8 < 0) {
              var8 = 0;
            }
            var9 = (var8 << 8) / var7;
            var9 = 3 * var9 >> 2;
            PasswordValidator.a(706856675, 256, var9, var2, var3, false);
            GameMediaSupport.drawViewportScaledSprite(653278209, var5, var6);
          } else {
            PasswordValidator.a(706856675, 128, 192, var2, var3, false);
            GameMediaSupport.drawViewportScaledSprite(653278209, var5, var6);
          }
        }
    }

    private final void switchToPredictedReceiver(PlayerInputEvent param0, int param1) {
        int var11 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        BallAgent var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        FootballerAgent var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        CommonGame var17 = null;
        int var4Lifetime1;
        var16 = Kickabout.field_G;
        try {
          if (MyKitScreen.field_O) {
            return;
          }
          var17 = new CommonGame(this.field_a);
          if (param0 != null) {
            var17.enqueueEvent(param0, -117);
            var17.processEventQueue((byte) 120);
          }
          for (var4 = 0; var4 < 50; var4++) {
            if (-1 != var17.field_V.possessorTeam) {
              var17.tick(4);
              continue;
            }
            break;
          }
          if (var17.field_V.possessorTeam != -1) {
            return;
          }
          var6 = var17.field_V;
          var6.stepPhysics((byte) -86, this.field_a.surface, this.field_a.field_B);
          while (!var6.field_k) {
            if (var6.height != 0) {
              var6.stepPhysics((byte) -106, this.field_a.surface, this.field_a.field_B);
              continue;
            }
            break;
          }
          var4Lifetime1 = var6.pixelX(true);
          var5 = var6.pixelY(879306160);
          var7 = -89 % ((param1 + 55) / 38);
          while (250000 < var6.horizontalSpeedSquared(28)) {
            var6.stepPhysics((byte) 122, this.field_a.surface, this.field_a.field_B);
            var6.stepPhysics((byte) -70, this.field_a.surface, this.field_a.field_B);
          }
          if (param0 != null) {
            var4Lifetime1 = var4Lifetime1 + var6.pixelX(true) >> 1;
            var5 = var6.pixelY(879306160) + var5 >> 1;
          } else {
            var4Lifetime1 = var6.pixelX(true);
            var5 = var6.pixelY(879306160);
          }
          var8 = this.field_a.field_g[this.field_g].team;
          var9 = -1;
          var10 = 2147483647;
          for (var11 = 1; this.field_a.field_P[var8].length > var11; var11++) {
            var12 = this.field_a.field_P[var8][var11];
            var13 = -var4Lifetime1 + (var12.positionX >> 16);
            var14 = -var5 + (var12.positionY >> 16);
            var15 = var13 * var13 + var14 * var14;
            if (var15 < var10) {
              var10 = var15;
              var9 = var11;
            }
          }
          if (this.field_a.findControllingParticipant((byte) 6, var8, var9) == -1) {
            this.queueKeypress(var9 + 1, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("va.QA(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void drawStartCountdown(int param0) {
        Sprite var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var2 = -this.field_a.timeLimit + this.field_a.phaseTime;
        int var6Lifetime1;
        if (param0 != 0) {
          this.onButtonClick(-113, 91);
        }
        if (var2 < 120) {
          var3 = SocketArchiveNetworkClient.field_q[var2 / 40 + 1];
          var4 = var3.field_o;
          var5 = var3.field_v;
          var2 = var2 % 40;
          var6 = 256;
          if (var2 > 35) {
            var6Lifetime1 = (-var2 + 40 << 8) / 5;
          } else {
            var5 = var5 * (var2 + 35) / 70;
            var4 = (var2 + 35) * var4 / 70;
            var6Lifetime1 = (var2 << 8) / 35;
          }
          var3.drawScaledAdditive(-var4 + 640 >> 1, -var5 + 480 >> 1, var4, var5, var6Lifetime1);
        }
    }

    final static java.awt.Container d(byte param0) {
        if (ServerMessageScreen.field_A != null) {
          return (java.awt.Container) ((Object) ServerMessageScreen.field_A);
        }
        int var1 = 25 % ((46 - param0) / 33);
        return (java.awt.Container) ((Object) AppletContextSupport.getActiveApplet(-120));
    }

    PlayingView(CommonGame param0, int param1, CommonGame param2, boolean param3, boolean param4) {
        super(param0, param1, param3, (int[]) null);
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        this.field_D = 0;
        this.field_t = new byte[8];
        this.field_s = -2;
        this.field_j = false;
        this.field_l = true;
        this.field_I = 0;
        this.field_B = false;
        this.field_L = false;
        this.field_E = false;
        this.field_n = false;
        try {
          this.field_v = new int[2];
          this.field_j = false;
          stackIn_4_1 = (param4);
          this.field_x = stackIn_4_1;
          stackIn_7_1 = !(param3);
          this.field_B = stackIn_7_1;
          this.wrapAgentsForRendering(param0, param3, 370);
          this.a((IntrusiveDeque) null, (byte) -97);
          var6_int = this.getFocusedParticipant(-41);
          this.field_C = SetLagCommand.a((byte) -97, param0.field_g, param0.field_S, param0.field_g[var6_int].team);
          this.field_l = true;
          MainMenuScreen.a(this.field_h, param1, param0, true);
          ArrayWidgetContainer.a(0, param0, var6_int, this.field_C);
          CachedTextLayout.a(param0, var6_int, 50);
          FormationMaskSupport.a(-3, param0, this.field_h);
          ByteArrayPool.setActiveMatch(param0, this.field_h, 101);
          this.field_q = 172;
          stackIn_10_0 = (param0.field_g[var6_int].team == 1);
          FaceNormal.field_c = stackIn_10_0;
          ContextMenu.b(0, (byte) 60, ReceivedAuctionItem.field_E[1]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("va.<init>(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void b(boolean param0) {
        this.queueInputEvent(param0, PlayerInputFactory.createKeyheldEvent(param0, this.field_H, this.field_g));
        if (this.field_f) {
          FootballerAiOverlaySupport.field_d.b(68, (byte) -65);
          FootballerAiOverlaySupport.field_d.writeByte(123, this.field_H);
        }
    }

    private final void queueKeypress(int param0, int param1) {
        if (param1 != -1) {
          this.field_q = -15;
        }
        this.queueInputEvent(false, WelcomeDialog.createKeypressEvent(1, this.field_g, param0));
        if (this.field_f) {
          FootballerAiOverlaySupport.field_d.b(70, (byte) 99);
          FootballerAiOverlaySupport.field_d.writeByte(param1 ^ -107, param0);
        }
    }

    final void g(int param0) {
        PlayerInputEvent var3;
        if (-2 != this.field_s ||
          this.field_a.field_V.possessorTeam != -1) {
          this.field_s = this.field_a.field_V.possessorTeam;
        }
        if (param0 != 0) {
          var3 = (PlayerInputEvent) null;
          this.queueInputEvent(true, (PlayerInputEvent) null);
        }
        if (this.field_a.field_X.goalCount >= 40) {
          this.field_s = -2;
        }
    }

    private final void a(boolean param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        FadingSoundPlayer var6 = null;
        if (this.field_p <= 0 &&
          40 > this.field_a.field_X.goalCount) {
          var4 = !param0 ? UiWidget.a(false, true, (byte) 97, false, false) : UiWidget.a(true, false, (byte) 97, true, !param2 ? true : false);
          var5 = this.a((byte) -64, 2) == 0 ? 1 : 0;
          var6 = ParticipantStatus.$cfr$intArgs$a$60f25194e713(false, var5 == 0 ? 256 : 0, 65, var4);
          if (var6 != null) {
            var6.startFadeOut(4, (byte) -4);
          }
          this.field_p = this.a((byte) -78, 100) + 200;
        }
        if (param1 != 4) {
          this.field_q = -116;
        }
    }

    final void drawContent(int param0) {
        int var4 = 0;
        int stackIn_21_0 = 0;
        int var2;
        int var3;
        RenderedFootballer var4_ref_gm;
        int var5;
        WorldDrawEntry var6;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        var5 = Kickabout.field_G;
        LeaguesHelpScreen.i(-126);
        if (this.field_u &&
          this.isLocalParticipantActive((byte) 13)) {
          this.updateAimIndicator((byte) 107);
        }
        ReceivedAuctionItem.i((byte) 45);
        for (var2 = 0; 2 > var2; var2++) {
          for (var3 = 0; var3 < 5; var3++) {
            Trinket.a((RenderedFootballer) (this.field_a.field_P[var2][var3]), 100);
          }
        }
        ((RenderedBall) (this.field_a.field_V)).drawShadow(param0 - 13);
        SelectionMarkerSupport.drawWorldEntries(0);
        if (param0 != 1) {
          return;
        }
        var6 = (WorldDrawEntry) (this.field_r.g(24009));
        while (var6 != null) {
          var6.draw(192);
          var6 = (WorldDrawEntry) (this.field_r.c(33));
        }
        if (MyKitScreen.field_O) {
          MessageDialog.f(70);
        }
        if (this.field_C != null) {
          stackIn_21_0 = (!this.field_f) ? 12 : 0;
          var2Lifetime1 = stackIn_21_0 + (InstrumentNoteMask.field_i * 100 >> 8);
          for (var3Lifetime1 = 0; this.field_a.playerCount > var3Lifetime1; var3Lifetime1++) {
            if (this.field_a.participantStatus[var3Lifetime1].isActive(3511)) {
              var4_ref_gm = (RenderedFootballer) (this.field_a.getControlledFootballer((byte) 112, var3Lifetime1));
              this.field_C[var3Lifetime1].c(SocialListLayoutSupport.worldToScreenX(0, var4_ref_gm.getRenderedX(1606384336)) - (this.field_C[var3Lifetime1].field_o >> 1), IntKeyLookup.a((byte) -85, var4_ref_gm.h(1000)) - var2Lifetime1);
            }
          }
        }
        if (this.field_a.field_X.goalCount < 40 &&
          !MyKitScreen.field_O) {
          NotificationPanelPositionSupport.updateBottomPanelOffset(3585);
          MusicPatch.drawMatchMinimap(16777215);
          if (this.isLocalParticipantActive((byte) 13)) {
            CommonGame.b(false);
          }
        } else {
          NamedValueEntry.a((byte) 70);
        }
        if (this.field_f &&
          this.field_a.timeLimit < this.field_a.phaseTime) {
          this.drawStartCountdown(0);
        }
        if (this.isLocalParticipantActive((byte) 13) &&
          !this.field_l) {
          ByteArrayPool.field_d.drawCentered(PitchDecorationSupport.field_f.toUpperCase(), 320, 30, 16777215, -1);
        }
        if (this.field_a.field_f) {
          ByteArrayPool.field_d.drawText("FB", 5, 17, 16777215, -1);
        }
        if (SelectionMarkerSupport.field_g) {
          var2Lifetime2 = 370;
          var3Lifetime2 = -45;
          SoftwareRasterizer.drawRectangle(SocialListLayoutSupport.worldToScreenX(0, var2Lifetime2), IntKeyLookup.a((byte) -89, var3Lifetime2), 155 * InstrumentNoteMask.field_i >> 8, 45 * InstrumentNoteMask.field_i >> 8, 16711935);
          LongPlusOneCommand.a(this.field_a, param0 ^ 72, 0);
          LongPlusOneCommand.a(this.field_a, 48, 1);
        }
        if (LineupAgent.field_g &&
          this.field_a.phase == 4) {
          var2Lifetime3 = SquadPickerDialog.field_J / 5;
          var3Lifetime3 = SquadPickerDialog.field_J % 5;
          LoginMethod.computeCameraFocus(this.field_a, (byte) -98);
          if (var3Lifetime3 == 0) {
            for (var4 = 1; var4 < 5; var4++) {
              FootballerAiOverlaySupport.drawFootballerAiOverlay(this.field_a, var4, var2Lifetime3, (byte) 99);
            }
            return;
          }
          FootballerAiOverlaySupport.drawFootballerAiOverlay(this.field_a, var3Lifetime3, var2Lifetime3, (byte) 99);
        }
        return;
    }

    public static void releaseStatics(byte param0) {
        field_w = null;
        field_F = null;
        field_K = null;
        if (param0 != -40) {
          PlayingView.releaseStatics((byte) -12);
        }
        field_y = (String[][]) null;
    }

    final boolean handleKey(char param0, int param1, int param2) {
        int var6 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_9_1 = false;
        boolean stackIn_17_1 = false;
        int var4;
        int var5;
        int var7;
        int var4Lifetime1;
        var7 = Kickabout.field_G;
        if ((83 == param2 ||
          param2 == 82) && (!this.field_f &&
          MyKitScreen.field_O)) {
          stackIn_8_0 = 50;
          stackIn_9_1 = (83 == param2);
          NotCommand.$cfr$intArgs$a$7ffe4b125357(stackIn_8_0, stackIn_9_1);
        }
        if (AchievementsScreen.a(false) &&
          GameplayHelpScreen.field_G[81] &&
          param2 == 84) {
          stackIn_17_1 = !(this.field_l);
          this.field_l = stackIn_17_1;
        }
        if (param1 != 1670) {
          this.handleKey('�', 73, -75);
        }
        if (!this.isLocalParticipantActive((byte) 13)) {
          return true;
        }
        if (this.field_a.participantStatus[this.field_g].isActive(param1 ^ 2865)) {
          if (param2 == 83 ||
            param2 == 82) {
            this.queueKeypress(0, param1 - 1671);
          }
          if (!this.field_f ||
            !this.field_x) {
            for (var4 = 0; 7 > var4; var4++) {
              this.field_t[var4] = this.field_t[1 + var4];
            }
            this.field_t[7] = (byte)Character.toLowerCase(param0);
            var4Lifetime1 = TextHotspotRegion.a(false, 8, this.field_t);
            var5 = -1;
            for (var6 = 0; NamedValueContainer.field_d.length > var6; var6++) {
              if (var4Lifetime1 == NamedValueContainer.field_d[var6]) {
                var5 = var6;
              }
            }
            if (var5 != -1 &&
              null != GameLoopApplet.field_E) {
              if (!this.field_a.a(var5, false, GameLoopApplet.field_E.field_e, this.field_g, ScrollContainer.field_Ib)) {
                return true;
              }
              if (var5 != 11 &&
                var5 != 10) {
                this.queueInputEvent(false, GrowableIntList.createCheatEvent(this.field_g, (byte) 8, var5));
              }
              if (this.field_f) {
                FootballerAiOverlaySupport.field_d.b(76, (byte) 98);
                FootballerAiOverlaySupport.field_d.writeBytes(0, 8, 1991220144, this.field_t);
              }
            }
          }
        }
        return true;
    }

    final void update(int param0, boolean param1) {
        this.field_u = param1 ? true : false;
        if (this.field_u) {
          this.pollMovementKeys(-122);
          this.pollLocalInput(16623);
        }
        if (this.field_g == this.field_a.field_V.field_j &&
          RotaryDialPainter.field_n) {
          this.switchToPredictedReceiver((PlayerInputEvent) null, -123);
        }
        this.a(true, this.field_a);
        if (this.field_a.bigHeadMode != this.field_n) {
          this.field_n = this.field_a.bigHeadMode;
          this.refreshFootballerSprites(-90);
        }
        FootballerAgent var4 = this.field_a.getBallCarrier((byte) -96);
        if (var4 != null) {
          ((RenderedBall) (this.field_a.field_V)).field_E = ((RenderedBall) (this.field_a.field_V)).field_E + (var4.directionY << 16);
        }
        if (param0 > -92) {
          return;
        }
        IntTripleCommand.a(this.field_r, -22488);
        TextLineLayoutSupport.tickWorldEntries(7249);
        this.l(2115);
        GameKeyHandler.b(40);
        ArchiveIndex.c(88);
        LobbyPlayerRow.i(0);
        PlayerShopScreen.a(false);
    }

    private final void refreshFootballerSprites(int param0) {
        int var6 = 0;
        int stackIn_27_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var7;
        int var8;
        int var9;
        int var10;
        PlayerStats var11_ref_up;
        int var11;
        int var12_int;
        MeshData var12;
        int var13;
        var13 = Kickabout.field_G;
        var2 = 0;
        if (param0 > -83) {
          return;
        }
        while (var2 < 2) {
          var3 = this.field_a.field_H[var2];
          var4 = this.field_a.field_d[var2];
          var5 = this.field_a.field_Q[var2];
          for (var6 = 0; 5 > var6; var6++) {
            if (0 == var6) {
              var8 = 1;
              var7 = 4;
              var10 = 0;
              var9 = 0;
            } else {
              var11_ref_up = this.field_a.field_b[var2][var6 - 1];
              var7 = var11_ref_up.archetype;
              var12_int = var11_ref_up.appearance;
              var8 = var12_int >> 8 & 15;
              var10 = (var12_int & 15) >> 0;
              var9 = (var12_int & 251) >> 4;
            }
            if (var7 < 0 ||
              var7 >= 5) {
              var7 = 0;
            }
            if (AccountRegistrationResponse.isHalloweenAppearanceEnabled((byte) -86)) {
              stackIn_27_0 = (this.field_a.field_P[var2][var6].stats.c((byte) -107, this.field_a.field_P[var2][var6].member)) ? 1 : 0;
            } else {
              stackIn_27_0 = 0;
            }
            var11 = stackIn_27_0;
            var12 = AuctionItem.a(var3, var4, var8, var7, var9, var10, var5, false, this.field_n, var11 != 0);
            ((RenderedFootballer) (this.field_a.field_P[var2][var6])).setModel(var12, (byte) -115);
          }
          var2++;
        }
    }

    private final void a(boolean param0, CommonGame param1) {
        int var3_int = 0;
        int var4 = 0;
        RenderedFootballer var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Kickabout.field_G;
        try {
          if (!param0) {
            this.field_k = false;
          }
          for (var3_int = 0; 2 > var3_int; var3_int++) {
            for (var4 = 0; var4 < 5; var4++) {
              var5 = (RenderedFootballer) (param1.field_P[var3_int][var4]);
              var6 = ~param1.field_X.goalScorer == ~var3_int ? 1 : 0;
              var7 = param1.findControllingParticipant((byte) 6, var3_int, var4);
              var8 = var7 == -1 ? 0 : param1.participantStatus[var7].field_l;
              var5.updateAnimationFlags(var6 != 0, false, var8);
            }
          }
          ((RenderedBall) (param1.field_V)).a((RenderedFootballer) (param1.getBallCarrier((byte) -96)), (byte) 50);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "va.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Canvas param0, boolean param1, int param2) {
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = Kickabout.field_G;
        try {
          if (10 > DateInputValidator.field_d) {
            var3_int = 0;
            if (PlatformTaskState.field_f) {
              var3_int = 1;
              PlatformTaskState.field_f = false;
            }
            AgeValidator.a(var3_int != 0, -68, PlayerInputEvent.g((byte) 60), SumIntegersCommand.field_A, MeshPreviewSupport.getCommonUiLoadProgress((byte) 92));
          } else {
            if (!TournamentChampionDialog.i(-86)) {
              SoftwareRasterizer.clearFramebuffer();
              ValidationState.a(320, 240, (byte) 122);
              WidgetStyleFactory.drawRasterToCanvas(27744, 0, 0, param0);
            } else {
              if (RasterGlowSupport.field_c == 0) {
                PlayerPortraitCacheEntry.a(false, param1, (byte) 39);
                WidgetStyleFactory.drawRasterToCanvas(27744, 0, 0, param0);
              } else {
                FormationAgent.a(param0, -14142);
              }
            }
          }
          if (param2 != 0) {
            PlayingView.d((byte) -37);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("va.PA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_y = new String[][]{new String[]{"Kickabout gives several types of reward at the end of each game:", "<img=0><col=ffff00>Money</col> to both the winner and loser. Characters in higher leagues earn more money per game.", "<img=0><col=ffff00>Experience</col> to all characters used in game. High-level characters earn EXP more slowly.", "<img=0><col=ffff00>League points</col> to help you on your way to the Diamond Division!"}, new String[]{"Rewards are scaled according to the outcome of the game:", "<img=0>Rated Games give ten times the reward of an Unrated Game - but you must defeat your opponent 1-on-1 using your own characters.", "<img=0><col=ffff00>Repeated</col> Rated Games, where you have played the opponent recently, give Unrated rewards.", "<img=0>Playing for only <col=ffff00>4 minutes</col> gives 50% less rewards; playing for <col=ffff00>12 minutes</col> gives 50% more rewards."}};
        field_J = 0;
        field_F = "Invite <%0> to this game";
        field_K = "More suggestions";
    }
}
