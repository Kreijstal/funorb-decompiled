/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GameplayController {
    int field_Hb;
    private int field_ec;
    private boolean field_R;
    private boolean field_Db;
    int controlledPlayerId;
    private int field_ab;
    int field_ic;
    boolean field_lc;
    SpellConfirmationDialog spellConfirmation;
    private boolean field_r;
    boolean field_Ab;
    private String field_wb;
    private int field_kb;
    boolean field_fc;
    private boolean field_F;
    private int field_i;
    private int[] field_e;
    private int cameraFocusTileIndex;
    private int field_n;
    private boolean field_K;
    private int field_ib;
    Battlefield battlefield;
    int field_eb;
    private NodeDeque field_Ub;
    int field_L;
    private int field_j;
    boolean field_lb;
    boolean field_z;
    private int field_qb;
    private int field_t;
    private NodeDeque field_o;
    private boolean field_V;
    static String field_A;
    private RadialSummonMenu godMenu;
    private int field_fb;
    private boolean field_bc;
    boolean field_u;
    private int[] field_Y;
    private BattleTutorial battleTutorial;
    private boolean field_tb;
    NodeDeque eventPresenters;
    private boolean campaignMode;
    static int field_J;
    int field_hb;
    private boolean field_mb;
    private int field_c;
    private int field_X;
    private boolean field_m;
    int field_gc;
    private Unit field_W;
    private int field_g;
    boolean field_rb;
    private Unit field_kc;
    private TurnTimerDial turnTimerDial;
    int field_cc;
    private boolean field_E;
    boolean field_Tb;
    private boolean field_Pb;
    private UnitCycler unitCycler;
    private int field_Lb;
    private boolean field_S;
    int field_Vb;
    int field_Cb;
    private boolean field_P;
    private boolean field_O;
    private int[] field_hc;
    private int field_Fb;
    boolean field_ac;
    BattleCamera camera;
    Unit field_oc;
    int field_Gb;
    NodeDeque field_Nb;
    private int field_Zb;
    private int encodedTurnCheckpoint;
    private int field_Ob;
    private int field_nc;
    private boolean field_bb;
    private RgbSprite[] field_Wb;
    private boolean field_D;
    private int field_zb;
    private int field_mc;
    Unit selectedUnit;
    private int field_b;
    private int field_yb;
    private RadialSummonMenu[] unitMenus;
    int field_Jb;
    private boolean cameraFocusPending;
    private int field_x;
    private boolean field_a;
    private int field_Sb;
    private boolean field_Xb;
    BattleGraphicsAssets battleGraphicsAssets;
    private NodeDeque overviewTargets;
    private int field_Kb;
    private int encodedDamageCheckpoint;
    int field_y;
    int field_h;
    private int field_C;
    int remainingTurnTicks;
    private int field_nb;
    um field_d;
    private boolean field_l;
    private int field_U;
    private int field_H;
    private int field_B;
    BattleUnitRenderer unitRenderer;
    private int field_Rb;
    private int field_ob;
    boolean field_Mb;
    private boolean field_Q;
    MovementPlanner movementPlanner;
    int field_pb;
    private int field_Yb;
    private AiPlanner[] aiPlanners;
    boolean field_jc;
    private int field_sb;
    static int field_f;
    private int[] field_dc;
    private int field_db;
    int field_Bb;

    private final void a(int param0, int param1, boolean param2, int param3) {
        RuntimeException runtimeException = null;
        CampaignMission var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        CampaignRewardPreview var18 = null;
        int var19 = 0;
        try {
          param0 += 32;
          var5 = this.battlefield.campaignMission;
          stackIn_4_0 = (var5.playerSlot == this.battlefield.rankedParticipants[param3]) ? 0 : 1;
          var6 = stackIn_4_0;
          if (var6 == 0 &&
            param2) {
            stackIn_11_0 = 1;
          } else {
            stackIn_11_0 = 0;
          }
          var7 = stackIn_11_0;
          var8 = 110;
          if (var6 == 0) {
            var8 += 58;
          }
          if (var7 != 0) {
            var8 += 78;
            param0 -= 32;
          }
          stackIn_22_0 = (this.battlefield.rankedParticipants.length < 3) ? 0 : 1;
          var9 = stackIn_22_0;
          if (var9 != 0) {
            var8 -= 18;
          }
          if (var9 == 0 ||
            ArmiesOfGielinor.obfuscationControl) {
            fe.b(this.battlefield.campaignMission.name, db.a(true, 320), MatchConditionEntry.a(80, (byte) 94), true);
            fe.c(this.battlefield.campaignMission.name, db.a(true, 320), MatchConditionEntry.a(80, (byte) 94), nd.field_b, true);
          }
          fe.b(db.a(true, param1), MatchConditionEntry.a(param0, (byte) 94), 223, var8, io.field_m, nd.field_b, 0, 180);
          fe.b(cs.field_eb, db.a(true, param1 + 111), MatchConditionEntry.a(param0 + 18, (byte) 94), true);
          fe.c(cs.field_eb, db.a(true, 111 + param1), MatchConditionEntry.a(18 + param0, (byte) 94), nd.field_b, true);
          var10 = param1 + 55;
          var11 = var10 + 100;
          var12 = 50 + param0;
          var13 = 18;
          var14 = var12;
          var15 = this.battlefield.playerTurnCounts[var5.playerSlot];
          var16 = this.battlefield.damageTakenByPlayer[var5.playerSlot];
          var10 -= 32;
          var11 += 42;
          rs.field_n.b(RasterState.field_m, db.a(true, var10), MatchConditionEntry.a(var14, (byte) 94), 16777215, -1);
          rs.field_n.a(Integer.toString(var15), db.a(true, var11), MatchConditionEntry.a(var14, (byte) 94), 16777215, -1);
          var14 = var14 + var13;
          rs.field_n.b(OwnerChangeEvent.field_y, db.a(true, var10), MatchConditionEntry.a(var14, (byte) 94), 16777215, -1);
          rs.field_n.a(Integer.toString(var16), db.a(true, var11), MatchConditionEntry.a(var14, (byte) 94), 16777215, -1);
          if (var6 == 0) {
            if (var9 != 0) {
              param0 -= 18;
            }
            var17 = b.calculateMissionScore(var5.scoreTurnTarget, var5.scoreDamageTarget, var16, (byte) 25, var15);
            SoftwareRaster.e(db.a(true, var10), MatchConditionEntry.a(param0 + 113, (byte) 94), var11 - var10, 12303155);
            fe.b(qf.field_g, db.a(true, param1 + 111), MatchConditionEntry.a(param0 + 128, (byte) 94), true);
            fe.c(qf.field_g, db.a(true, 111 + param1), MatchConditionEntry.a(128 + param0, (byte) 94), nd.field_b, true);
            fe.c(AiInfluenceMap.a(10602, var17), db.a(true, 111 + param1), MatchConditionEntry.a(param0 + 155, (byte) 94), TutorialController.field_e, true);
            if (var7 != 0) {
              param0 += 58;
              SoftwareRaster.e(db.a(true, var10), MatchConditionEntry.a(113 + param0, (byte) 94), -var10 + var11, 12303155);
              fe.b(InstructionsPanel.field_gb, db.a(true, param1 + 111), MatchConditionEntry.a(128 + param0, (byte) 94), true);
              fe.c(InstructionsPanel.field_gb, db.a(true, 111 + param1), MatchConditionEntry.a(128 + param0, (byte) 94), nd.field_b, true);
              var18 = var5.createRewardPreview(-1);
              lw.field_ob.g(db.a(true, 4 + (15 + var10)), MatchConditionEntry.a(param0 + 132, (byte) 94));
              var18.icon.g(db.a(true, 4 + var10 + 15), MatchConditionEntry.a(128 + param0 + 4, (byte) 94));
              km.field_h[2].g(db.a(true, var10 + 15), MatchConditionEntry.a(param0 + 128, (byte) 94));
              var19 = 10 + km.field_h[2].canvasWidth + (var10 + 15);
              rs.field_n.a(var18.title, db.a(true, var19), MatchConditionEntry.a(132 + param0, (byte) 94), -var19 + var11, 32, 16777215, -1, 1, 1, 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.SD(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, byte param4, int param5, int param6) {
        tu stackIn_7_0;
        String stackIn_7_1;
        int stackIn_7_2;
        int stackIn_7_3;
        int[][] stackIn_7_4;
        int stackIn_8_5 = 0;
        tu stackIn_14_0;
        String stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        int[][] stackIn_14_4;
        int stackIn_15_5;
        boolean stackIn_19_5 = false;
        int stackIn_25_5 = 0;
        tu stackIn_32_0 = null;
        String stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        int[][] stackIn_32_4 = null;
        int stackIn_32_5 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_18_5;
        int var8_int = 0;
        RuntimeException var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        tu stackIn_32_0Lifetime1;
        String stackIn_32_1Lifetime1;
        int[][] stackIn_32_4Lifetime1;
        int stackIn_32_2Lifetime1;
        int stackIn_32_3Lifetime1;
        int stackIn_32_5Lifetime1;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          SpellConfirmationDialog.field_j.b();
          SoftwareRaster.b();
          var8_int = this.battlefield.playerTurnCounts[param6] + 1;
          if (var8_int > this.battlefield.turnLimit) {
            var8_int = this.battlefield.turnLimit;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!this.battlefield.field_V) {
            var9_ref_String = ah.a(og.field_m, (byte) 22, var8_int);
            en.field_E.a(var9_ref_String);
            stackIn_7_0 = en.field_E;
            stackIn_7_1 = var9_ref_String;
            stackIn_7_2 = param3;
            stackIn_7_3 = 2 + (param5 - param2);
            stackIn_7_4 = op.field_c;
            if (!this.battlefield.teamGame) {
              stackIn_8_5 = 0;
            } else {
              stackIn_8_5 = 1;
            }
            ((tu) (Object) stackIn_7_0).b(stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4[stackIn_8_5][param6], -1);
            decompiledFrameRemainder0 = (var10 != 0);
          }
          if (decompiledFrameRemainder0) {
            en.field_E.a(var8_int + "/" + this.battlefield.turnLimit);
            stackIn_14_0 = en.field_E;
            stackIn_14_1 = var8_int + "/" + this.battlefield.turnLimit;
            stackIn_14_2 = param3;
            stackIn_14_3 = 2 + (-param2 + param5);
            stackIn_14_4 = op.field_c;
            if (this.battlefield.teamGame) {
              stackIn_15_5 = 1;
            } else {
              stackIn_15_5 = 0;
            }
            ((tu) (Object) stackIn_14_0).b(stackIn_14_1, stackIn_14_2, stackIn_14_3, stackIn_14_4[stackIn_15_5][param6], -1);
          }
          var9 = 0;
          scanLoop1: while (true) {
            if (var9 < 3) {
              stackIn_32_0 = en.field_E;
              stackIn_32_1 = this.battlefield.teamStructureCounts[this.battlefield.getPlayerTeamIndex(param6, -1)][var9] + "/" + this.battlefield.mapStructureTotals[var9];
              stackIn_32_2 = param3;
              stackIn_32_3 = param5 + var9 * param2;
              stackIn_32_4 = op.field_c;
              stackOut_18_5 = this.battlefield.teamGame;
              stackIn_32_5 = stackOut_18_5 ? 1 : 0;
              stackIn_19_5 = stackOut_18_5;
              if (var10 != 0) {
                while (true) {
                  ((tu) (Object) stackIn_32_0).b(stackIn_32_1, stackIn_32_2, stackIn_32_3, stackIn_32_4[stackIn_32_5][this.battlefield.rankedParticipants[0]], -1);
                  var9++;
                  break scanLoop1;
                }
              }
              if (stackIn_19_5) {
                stackIn_25_5 = 1;
              } else {
                stackIn_25_5 = 0;
              }
              ((tu) (Object) stackIn_32_0).b(stackIn_32_1, stackIn_32_2, stackIn_32_3, stackIn_32_4[stackIn_25_5][param6], -1);
              var9++;
              if (var10 == 0) {
                continue;
              }
            }
            if (param1) {
              var9 = 0;
              while (var9 < 3) {
                stackIn_32_0Lifetime1 = en.field_E;
                stackIn_32_1Lifetime1 = Integer.toString(this.battlefield.teamStructureCounts[this.battlefield.rankedParticipants[0]][var9]);
                stackIn_32_2Lifetime1 = param0 + (param3 + 5);
                stackIn_32_3Lifetime1 = param2 * var9 + param5;
                stackIn_32_4Lifetime1 = op.field_c;
                stackIn_32_5Lifetime1 = 0;
                ((tu) (Object) stackIn_32_0Lifetime1).b(stackIn_32_1Lifetime1, stackIn_32_2Lifetime1, stackIn_32_3Lifetime1, stackIn_32_4Lifetime1[stackIn_32_5Lifetime1][this.battlefield.rankedParticipants[0]], -1);
                var9++;
                if (var10 != 0) {
                  break scanLoop1;
                }
              }
            }
            so.field_b.a(5605);
            break;
          }
          if (param4 != -126) {
            this.remainingTurnTicks = 93;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var8), "ic.WD(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void a(int param0) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        String stackIn_10_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_33_0 = null;
        RuntimeException decompiledCaughtException = null;
        String var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        String var3 = null;
        String var4 = null;
        int var5 = 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if ((this.field_Sb <= 0) &&
            (decompiledFrameRemainder0 = !(this.field_j <= 0))) {
            if (this.battlefield.currentPlayer < 0) {
              stackIn_10_0 = "";
            } else {
              stackIn_10_0 = BitmapFont.a(nr.field_e, this.battlefield.playerNames[this.battlefield.currentPlayer], 240);
            }
            var2 = stackIn_10_0;
            if (this.battlefield.currentPlayer == this.controlledPlayerId) {
              stackIn_14_0 = ce.field_H;
            } else {
              stackIn_14_0 = var2;
            }
            var3 = stackIn_14_0;
            discarded$0 = this.a(this.field_j, var3, false, 64);
            decompiledFrameRemainder0 = !(!ArmiesOfGielinor.obfuscationControl);
          }
          if (decompiledFrameRemainder0) {
            var2_int = this.battlefield.getPlayerTeamIndex(this.battlefield.currentPlayer, param0 - 25168);
            if (this.battlefield.currentPlayer >= 0) {
              stackIn_19_0 = BitmapFont.a(nr.field_e, this.battlefield.teams[var2_int].getTeamName(param0 ^ 25164), 240);
            } else {
              stackIn_19_0 = "";
            }
            var3 = stackIn_19_0;
            if (this.battlefield.currentPlayer == -1) {
              stackIn_33_0 = r.field_J;
            } else {
              if (l.activeCampaignMission == null &&
                this.controlledPlayerId > -1 &&
                ~var2_int == ~this.battlefield.getPlayerTeamIndex(this.controlledPlayerId, -1)) {
                stackIn_33_0 = DeployEvent.field_y;
              } else {
                stackIn_33_0 = fo.a(param0 - 20367, SoundCache.field_i, new String[]{var3});
              }
            }
            var4 = stackIn_33_0;
            var5 = -150 + this.field_Sb;
            if (var5 < 50) {
              var5 = 50;
            }
            discarded$1 = this.a(var5, var4, this.battlefield.teamGame, 64);
          }
          if (param0 != 25167) {
            this.l(-61);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "ic.C(" + param0 + ')');
        }
    }

    final void notifyTutorialInteraction(int interactionKind, int tileIndex, int obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (null != this.battleTutorial) {
            this.battleTutorial.handleInteraction(tileIndex, -3, interactionKind);
          }
          if (obfuscationGuard > -28) {
            this.controlledPlayerId = -60;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4), "ic.NC(" + interactionKind + ',' + tileIndex + ',' + obfuscationGuard + ')');
        }
    }

    final void restoreCampaignQuicksave(byte obfuscationGuard, CampaignQuicksave quicksave, CampaignMission mission) {
        boolean stackIn_9_1 = false;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int localPlayer = 0;
        RuntimeException var4 = null;
        MapTile[] tiles = null;
        int turnReferencePlayer = 0;
        int tileIndex = 0;
        MapTile tile = null;
        int playerId = 0;
        int var8 = 0;
        int referenceTurnCount;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          localPlayer = mission.playerSlot;
          this.battlefield.localPlayer = localPlayer;
          this.battlefield.readLegacySnapshot(0, new PacketBuffer(quicksave.snapshotBytes));
          this.battlefield.damageTakenByPlayer[localPlayer] = quicksave.damageTaken;
          if (null != quicksave.playerMana) {
            this.battlefield.playerMana = new int[quicksave.playerMana.length];
            vm.a(quicksave.playerMana, 0, this.battlefield.playerMana, 0, quicksave.playerMana.length);
          }
          this.controlledPlayerId = this.battlefield.currentPlayer;
          stackIn_9_1 = (localPlayer != this.battlefield.currentPlayer);
          this.field_bb = stackIn_9_1;
          if (quicksave.hasLostUnit) {
            this.battlefield.unitLossCounts[localPlayer] = 1;
          }
          this.battlefield.eliminatedPlayerMask = quicksave.eliminatedPlayerMask;
          tiles = this.battlefield.tiles;
          if (obfuscationGuard > -117) {
            this.updateCamera((byte) -32);
          }
          tileIndex = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (tiles.length <= tileIndex))) {
            tile = tiles[tileIndex];
            stackIn_28_0 = 0;
            if (var8 == 0) {
              if (stackIn_28_0 <= tile.ownerPlayer &&
                this.battlefield.isPlayerInactive(-1, tile.ownerPlayer)) {
                tile.a(-123, -1);
              }
              tileIndex++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_28_0 = mission.playerSlot;
          }
          turnReferencePlayer = stackIn_28_0;
          referenceTurnCount = this.battlefield.playerTurnCounts[turnReferencePlayer];
          playerId = 0;
          while (this.battlefield.playerTurnCounts.length > playerId) {
            if (var8 != 0) {
              return;
            }
            if (this.battlefield.playerTurnCounts[playerId] == 0) {
              if (turnReferencePlayer > playerId) {
                this.battlefield.playerTurnCounts[playerId] = referenceTurnCount;
              }
              if (playerId > turnReferencePlayer &&
                referenceTurnCount > 0) {
                this.battlefield.playerTurnCounts[playerId] = -1 + referenceTurnCount;
              }
            }
            playerId++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_52_0 = var4;
          stackIn_52_1 = new StringBuilder().append("ic.ID(").append(obfuscationGuard).append(',');
          if (quicksave == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          stackIn_56_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',');
          if (mission == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(')').toString());
        }
    }

    private final float buildCampaignLoadout(CampaignMission mission, byte obfuscationGuard, int[] equippedSpellIds, int[] unitUnlockMasks) {
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        float stackIn_71_0 = 0.0f;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        float manaMultiplier = 0.0f;
        RuntimeException var5 = null;
        int insertedSpellCount = 0;
        int maskIndex = 0;
        int[] initialUnits = null;
        CampaignMission[] campaignMissions = null;
        int initialUnitIndex = 0;
        int initialUnitType = 0;
        CampaignMission completedMission = null;
        int initialUnlockGroup = 0;
        int[] rewardUnits = null;
        int initialUnlockOrdinal = 0;
        int rewardUnitType = 0;
        int rewardUnlockGroup = 0;
        int rewardUnlockOrdinal = 0;
        int var15 = 0;
        int missionIndex;
        int rewardSpell;
        int rewardUnitIndex;
        int equippedSpell;
        int spellSlot;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          insertedSpellCount = 0;
          maskIndex = 0;
          while (unitUnlockMasks.length > maskIndex) {
            unitUnlockMasks[maskIndex] = 0;
            maskIndex++;
            if (var15 == 0) {
              continue;
            }
            break;
          }
          manaMultiplier = 1.0f;
          if (obfuscationGuard != 54) {
            this.a(true, -57, (Unit) null);
          }
          initialUnits = mission.campaign.initialUnitTypes;
          initialUnitIndex = 0;
          while (initialUnits.length > initialUnitIndex) {
            initialUnitType = initialUnits[initialUnitIndex];
            initialUnlockGroup = jv.getUnitUnlockGroup(false, initialUnitType);
            initialUnlockOrdinal = b.getUnitUnlockOrdinal(false, initialUnitType);
            unitUnlockMasks[initialUnlockGroup] = oe.bitwiseOr(unitUnlockMasks[initialUnlockGroup], 1 << initialUnlockOrdinal);
            initialUnitIndex++;
            if (var15 == 0) {
              continue;
            }
            break;
          }
          campaignMissions = mission.campaign.missions;
          missionIndex = 0;
          scanLoop1: while (true) {
            stackIn_12_0 = missionIndex;
            stackIn_12_1 = campaignMissions.length;
            scanLoop2: while (stackIn_12_0 < stackIn_12_1) {
              completedMission = campaignMissions[missionIndex];
              if (ClientUiNode.getProfileMissionScore(completedMission, 19) > 0) {
                boolean decompiledFrameRemainder0 = true;
                boolean decompiledFrameCompleted0 = true;
                if (null != completedMission.rewardUnitTypes) {
                  rewardUnits = completedMission.rewardUnitTypes;
                  rewardUnitIndex = 0;
                  while (rewardUnits.length > rewardUnitIndex) {
                    rewardUnitType = rewardUnits[rewardUnitIndex];
                    rewardUnlockGroup = jv.getUnitUnlockGroup(false, rewardUnitType);
                    rewardUnlockOrdinal = b.getUnitUnlockOrdinal(false, rewardUnitType);
                    unitUnlockMasks[rewardUnlockGroup] = oe.bitwiseOr(unitUnlockMasks[rewardUnlockGroup], 1 << rewardUnlockOrdinal);
                    rewardUnitIndex++;
                    if (var15 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                  }
                }
                if (decompiledFrameCompleted0) {
                  decompiledFrameRemainder0 = (completedMission.manaBonusPercent != 0);
                }
                if (decompiledFrameRemainder0) {
                  manaMultiplier = manaMultiplier + (float)completedMission.manaBonusPercent / 100.0f;
                }
                rewardSpell = completedMission.rewardSpellId;
                if (rewardSpell != -1) {
                  spellSlot = 0;
                  while (1 + insertedSpellCount > spellSlot) {
                    equippedSpell = -1;
                    stackIn_12_0 = equippedSpellIds.length;
                    stackIn_12_1 = spellSlot;
                    if (var15 != 0) {
                      continue scanLoop2;
                    }
                    if (stackIn_12_0 > stackIn_12_1) {
                      equippedSpell = equippedSpellIds[spellSlot];
                    }
                    if (equippedSpell == -1) {
                      if (spellSlot >= equippedSpellIds.length) {
                        break;
                      }
                      insertedSpellCount++;
                      equippedSpellIds[spellSlot] = rewardSpell;
                      break;
                    }
                    if (uc.spellDefinitions[equippedSpell][6] != 4 &&
                      uc.spellDefinitions[equippedSpell][6] != 5 &&
                      ~uc.spellDefinitions[equippedSpell][3] == ~uc.spellDefinitions[rewardSpell][3] &&
                      ~uc.spellDefinitions[rewardSpell][4] == ~uc.spellDefinitions[equippedSpell][4] &&
                      uc.spellDefinitions[equippedSpell][5] == uc.spellDefinitions[rewardSpell][5]) {
                      if (uc.spellDefinitions[rewardSpell][6] <= uc.spellDefinitions[equippedSpell][6] &&
                        uc.spellDefinitions[rewardSpell][7] <= uc.spellDefinitions[equippedSpell][7]) {
                        break;
                      }
                      equippedSpellIds[spellSlot] = rewardSpell;
                      break;
                    }
                    spellSlot++;
                  }
                }
              }
              missionIndex++;
              if (var15 == 0) {
                continue scanLoop1;
              }
              break;
            }
            break;
          }
          stackIn_71_0 = manaMultiplier;
          return stackIn_71_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_75_0 = var5;
          stackIn_75_1 = new StringBuilder().append("ic.MA(");
          if (mission == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(obfuscationGuard).append(',');
          if (equippedSpellIds == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          stackIn_83_1 = ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',');
          if (unitUnlockMasks == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, boolean param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        try {
          if (param3 != 89) {
            return;
          }
          fe.b(param0, param8, param7, param2, io.field_m, nd.field_b, 0, 0);
          if (param4) {
            vq.field_b.drawScaled(param0 + param9, param8 + param1, param5, param6);
            if (!ArmiesOfGielinor.obfuscationControl) {
              return;
            }
          }
          vq.field_b.drawOpaque(param9 + param0, param8 + param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var11), "ic.KC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static int a(byte[] param0, int param1, CharSequence param2, int param3, int param4, byte param5) {
        int stackIn_185_0 = 0;
        RuntimeException stackIn_189_0 = null;
        StringBuilder stackIn_189_1 = null;
        String stackIn_190_2 = null;
        StringBuilder stackIn_193_1 = null;
        String stackIn_194_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var6_int = -param1 + param3;
          var7 = 31 / ((param5 - 53) / 53);
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6_int <= var8))) {
            var9 = param2.charAt(param1 + var8);
            stackIn_185_0 = var9;
            if (var10 == 0) {
              regionExit1: {
                if ((stackIn_185_0 <= 0 ||
                  var9 >= 128) &&
                  (var9 < 160 ||
                  var9 > 255)) {
                  switch (var9) {
                    case 8364:
                      param0[var8 + param4] = (byte) -128;
                      break regionExit1;
                    case 8218:
                      param0[var8 + param4] = (byte) -126;
                      break regionExit1;
                    case 402:
                      param0[param4 + var8] = (byte) -125;
                      break regionExit1;
                    case 8230:
                      param0[param4 + var8] = (byte) -123;
                      break regionExit1;
                    case 8225:
                      param0[var8 + param4] = (byte) -121;
                      break regionExit1;
                    case 710:
                      param0[var8 + param4] = (byte) -120;
                      break regionExit1;
                    case 8240:
                      param0[var8 + param4] = (byte) -119;
                      break regionExit1;
                    default:
                      switch (var9) {
                        case 338:
                          param0[param4 + var8] = (byte) -116;
                          break regionExit1;
                        case 8216:
                          param0[var8 + param4] = (byte) -111;
                          break regionExit1;
                        case 8226:
                          param0[param4 + var8] = (byte) -107;
                          break regionExit1;
                        case 8212:
                          param0[param4 + var8] = (byte) -105;
                          break regionExit1;
                        case 732:
                          param0[param4 + var8] = (byte) -104;
                          break regionExit1;
                        default:
                          param0[param4 + var8] = (byte) 63;
                          break regionExit1;
                        case 376:
                          param0[param4 + var8] = (byte) -97;
                          break regionExit1;
                        case 382:
                          param0[var8 + param4] = (byte) -98;
                          break regionExit1;
                        case 339:
                          param0[var8 + param4] = (byte) -100;
                          break regionExit1;
                        case 8250:
                          param0[var8 + param4] = (byte) -101;
                          break regionExit1;
                        case 353:
                          param0[param4 + var8] = (byte) -102;
                          break regionExit1;
                        case 8482:
                          param0[param4 + var8] = (byte) -103;
                          break regionExit1;
                        case 8211:
                          param0[var8 + param4] = (byte) -106;
                          break regionExit1;
                        case 8221:
                          param0[var8 + param4] = (byte) -108;
                          break regionExit1;
                        case 8220:
                          param0[var8 + param4] = (byte) -109;
                          break regionExit1;
                        case 8217:
                          param0[var8 + param4] = (byte) -110;
                          break regionExit1;
                        case 381:
                          param0[param4 + var8] = (byte) -114;
                          break regionExit1;
                      }
                    case 8249:
                      param0[param4 + var8] = (byte) -117;
                      break regionExit1;
                    case 352:
                      param0[var8 + param4] = (byte) -118;
                      break regionExit1;
                    case 8224:
                      param0[param4 + var8] = (byte) -122;
                      break regionExit1;
                    case 8222:
                      param0[param4 + var8] = (byte) -124;
                      break regionExit1;
                  }
                }
                param0[var8 + param4] = (byte)var9;
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_185_0 = var6_int;
          }
          return stackIn_185_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_189_0 = var6;
          stackIn_189_1 = new StringBuilder().append("ic.ND(");
          if (param0 == null) {
            stackIn_190_2 = "null";
          } else {
            stackIn_190_2 = "{...}";
          }
          stackIn_193_1 = ((StringBuilder) (Object) stackIn_189_1).append(stackIn_190_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_194_2 = "null";
          } else {
            stackIn_194_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_189_0), ((StringBuilder) (Object) stackIn_193_1).append(stackIn_194_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int[][] stackIn_3_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_17_0;
        int stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        int stackIn_18_4;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var13Lifetime1;
        try {
          stackIn_3_0 = op.field_c;
          if (!this.battlefield.teamGame) {
            stackIn_4_1 = 0;
          } else {
            stackIn_4_1 = 1;
          }
          var7_int = stackIn_3_0[stackIn_4_1][param0];
          if (param5 >= -114) {
            this.field_Hb = 104;
          }
          var8 = param2;
          var9 = param1;
          var10 = param4;
          var11 = param3;
          SoftwareRaster.b(param4, param3, param2, param1, 0, 255);
          var12 = this.a((byte) -70, param0);
          if (4 <= var12 ||
            var12 <= 0) {
            SoftwareRaster.b(param4, param3, param2, param1, 15724527);
          }
          if (4 > var12 &&
            var12 > 0 || ArmiesOfGielinor.obfuscationControl) {
            var13 = 10 * var12;
            stackIn_17_0 = param4;
            stackIn_17_1 = param3;
            stackIn_17_2 = param2;
            stackIn_17_3 = param1;
            if (uk.field_n % (2 * var13) < var13) {
              stackIn_18_4 = var7_int;
            } else {
              stackIn_18_4 = 15724527;
            }
            SoftwareRaster.b(stackIn_17_0, stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_18_4);
          }
          param1 -= 2;
          param3++;
          param2 -= 2;
          param4++;
          if (this.battlefield.field_S[param0] > 0) {
            var13Lifetime1 = this.battlefield.field_S[param0];
            var14 = param2 + param4;
            if (var13Lifetime1 < this.battlefield.collectedManaTarget) {
              var14 = var13Lifetime1 * param2 / this.battlefield.collectedManaTarget + param4;
            }
            SoftwareRaster.h(var14, param3, param1, 11184810);
          }
          param2 = this.battlefield.i(param0, -12710) * param2 / this.battlefield.collectedManaTarget;
          SoftwareRaster.f(param4, param3, param2, param1, var7_int);
          if (this.field_Mb) {
            SoftwareRaster.b(var10 - 1, var11 - 1, var8 + 2, var9 + 2, 16777215, (int)(64.0 * Math.sin((double)uk.field_n / 3.141592653589793 / 2.0) + 128.0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var7), "ic.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4) {
        boolean discarded$0 = false;
        CoatOfArms stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        int stackIn_23_2;
        int stackIn_23_3;
        boolean stackIn_24_4 = false;
        int stackIn_27_5;
        String stackIn_27_6;
        boolean stackIn_27_7;
        boolean stackIn_28_8 = false;
        boolean stackIn_32_1 = false;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 != 18) {
            discarded$0 = this.a(false);
          }
          var6 = nd.field_b;
          fe.b(db.a(true, param4), MatchConditionEntry.a(param1, (byte) 94), 340, 160, io.field_m, var6, 0, 180);
          if (-1 < param3) {
            fe.b(ph.field_b[param3], db.a(true, param4 + 137), MatchConditionEntry.a(18 + param1, (byte) 94), true);
            fe.c(ph.field_b[param3], db.a(true, param4 + 137), MatchConditionEntry.a(param1 + 18, (byte) 94), nd.field_b, true);
          }
          if (-1 >= param3 ||
            var11 != 0) {
            fe.b(DualNodeIterator.field_g, db.a(true, 137 + param4), MatchConditionEntry.a(18 + param1, (byte) 94), true);
            fe.c(DualNodeIterator.field_g, db.a(true, param4 + 137), MatchConditionEntry.a(18 + param1, (byte) 94), nd.field_b, true);
          }
          var7 = 260 / this.battlefield.c(-9650, param0);
          HuffmanCodec.a(db.a(true, 25 + param4), op.field_c[0][param0], this.battlefield.teams[param0].getTeamName(3), false, (byte) -8, MatchConditionEntry.a(param1 + 5, (byte) 94));
          var8 = -33 + (5 + param4) + var7 / 2;
          var9 = 0;
          while (var9 < this.battlefield.playerCount) {
            if (var11 != 0) {
              return;
            }
            if (param0 == this.battlefield.getPlayerTeamIndex(var9, param2 ^ -19)) {
              var10 = this.battlefield.playerNames[var9 % this.battlefield.playerCount].toUpperCase();
              stackIn_19_0 = this.battlefield.playerCoats[var9 % this.battlefield.playerCount];
              stackIn_20_1 = ((this.battlefield.eliminatedPlayerMask & 1 << var9) != 0);
              stackIn_23_2 = 0;
              stackIn_23_3 = MatchConditionEntry.a(param1 + 50, (byte) 94);
              stackIn_24_4 = !((this.battlefield.field_C & 1 << var9) <= 0);
              stackIn_27_5 = db.a(true, var8 + 5);
              stackIn_27_6 = var10;
              stackIn_27_7 = true;
              stackIn_28_8 = (0 != (this.battlefield.inactivePlayerMask & 1 << var9));
              ((CoatOfArms) (Object) stackIn_19_0).a(stackIn_20_1, stackIn_23_2, stackIn_23_3, stackIn_24_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_28_8, false, -19744);
              en.field_E.c(var10, db.a(true, var8 + 33), MatchConditionEntry.a(param1 + 125, (byte) 94), 16777215, -1);
              stackIn_32_1 = (~this.field_Rb == ~var9);
              this.a(stackIn_32_1, var9, (byte) 116, var8 + 0, param1 + 128);
              var8 = var8 + var7;
            }
            var9++;
          }
          this.b(param0, 265 + param4, param1 + 95, param2 - 12875);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var6_ref), "ic.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void p(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = SoftwareRaster.width >> 1;
          var3 = SoftwareRaster.height >> 1;
          if (param0 != -71) {
            return;
          }
          var4 = 0;
          while (var3 > var4) {
            var5 = var2_int * (-var4 + var3) / var3;
            SoftwareRaster.h(0, var4, var5, var4, 0);
            SoftwareRaster.h(SoftwareRaster.width - 1, var4, SoftwareRaster.width - var5, var4, 0);
            SoftwareRaster.h(0, -var4 + SoftwareRaster.height, var5, -var4 + SoftwareRaster.height, 0);
            SoftwareRaster.h(SoftwareRaster.width - 1, SoftwareRaster.height - var4, SoftwareRaster.width - var5, SoftwareRaster.height - var4, 0);
            var4++;
            if (var6 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.FD(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        int[] stackIn_8_0 = null;
        int stackIn_11_0;
        int stackIn_11_1;
        int stackIn_11_2;
        int stackIn_11_3;
        RgbSprite[] stackIn_11_4;
        int[] stackIn_12_5 = null;
        String stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int[] stackIn_19_3 = null;
        String stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int[] stackIn_26_3;
        CoatOfArms stackIn_30_0 = null;
        boolean stackIn_31_1 = false;
        int[][] stackIn_34_2 = null;
        int stackIn_35_3 = 0;
        int stackIn_38_2;
        int stackIn_38_3;
        boolean stackIn_39_4 = false;
        int stackIn_42_5;
        String stackIn_42_6;
        boolean stackIn_42_7;
        boolean stackIn_43_8 = false;
        boolean stackIn_47_1 = false;
        RuntimeException decompiledCaughtException = null;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int[] var8 = null;
        try {
          if (param2 != -20777) {
            this.unitRenderer = (BattleUnitRenderer) null;
          }
          if (param4 > 2) {
            var7 = this.battlefield.rankedParticipants[2];
            var6 = this.battlefield.playerNames[var7].toUpperCase();
            if (this.field_Rb == 2) {
              stackIn_8_0 = TutorialController.field_e;
            } else {
              stackIn_8_0 = nd.field_b;
            }
            var8 = stackIn_8_0;
            stackIn_11_0 = db.a(true, param0);
            stackIn_11_1 = MatchConditionEntry.a(param3, (byte) 94);
            stackIn_11_2 = 184;
            stackIn_11_3 = 111;
            stackIn_11_4 = io.field_m;
            if (param4 <= 2) {
              stackIn_12_5 = jh.field_k;
            } else {
              stackIn_12_5 = var8;
            }
            fe.b(stackIn_11_0, stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_11_4, stackIn_12_5, 0, 180);
            if (-1 < param1) {
              fe.b(ph.field_b[param1], db.a(true, 59 + param0), MatchConditionEntry.a(19 + param3, (byte) 94), true);
              stackIn_18_0 = ph.field_b[param1];
              stackIn_18_1 = db.a(true, 59 + param0);
              stackIn_18_2 = MatchConditionEntry.a(19 + param3, (byte) 94);
              if (param4 > 2) {
                stackIn_19_3 = nd.field_b;
              } else {
                stackIn_19_3 = jh.field_k;
              }
              fe.c(stackIn_18_0, stackIn_18_1, stackIn_18_2, stackIn_19_3, true);
            }
            if (-1 >= param1 ||
              ArmiesOfGielinor.obfuscationControl) {
              fe.b(DualNodeIterator.field_g, db.a(true, 59 + param0), MatchConditionEntry.a(param3 + 19, (byte) 94), true);
              stackIn_25_0 = DualNodeIterator.field_g;
              stackIn_25_1 = db.a(true, 59 + param0);
              stackIn_25_2 = MatchConditionEntry.a(param3 + 19, (byte) 94);
              if (param4 > 2) {
                stackIn_26_3 = nd.field_b;
              } else {
                stackIn_26_3 = jh.field_k;
              }
              fe.c(stackIn_25_0, stackIn_25_1, stackIn_25_2, stackIn_26_3, true);
            }
            stackIn_30_0 = this.battlefield.playerCoats[var7];
            stackIn_31_1 = (0 != (this.battlefield.eliminatedPlayerMask & 1 << var7));
            stackIn_34_2 = op.field_c;
            if (!this.battlefield.teamGame) {
              stackIn_35_3 = 0;
            } else {
              stackIn_35_3 = 1;
            }
            stackIn_38_2 = stackIn_34_2[stackIn_35_3][var7];
            stackIn_38_3 = MatchConditionEntry.a(param3 + 21, (byte) 94);
            stackIn_39_4 = !((1 << var7 & this.battlefield.field_C) <= 0);
            stackIn_42_5 = db.a(true, param0 + 19);
            stackIn_42_6 = var6;
            stackIn_42_7 = true;
            stackIn_43_8 = ((1 << var7 & this.battlefield.inactivePlayerMask) != 0);
            ((CoatOfArms) (Object) stackIn_30_0).a(stackIn_31_1, stackIn_38_2, stackIn_38_3, stackIn_39_4, stackIn_42_5, stackIn_42_6, stackIn_42_7, stackIn_43_8, false, param2 + 1033);
            en.field_E.c(var6, db.a(true, param0 + 129), MatchConditionEntry.a(17 + param3, (byte) 94), 16777215, -1);
            this.b(var7, param0 + 104, param3 + 21, -12857);
            stackIn_47_1 = (this.field_Rb == 2);
            this.a(stackIn_47_1, var7, (byte) 110, 280, param3 + 80);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var6_ref), "ic.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void o(byte param0) {
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var7Lifetime1;
        try {
          var2_int = this.controlledPlayerId;
          if (var2_int < 0) {
            var2_int = this.battlefield.currentPlayer;
          }
          if (var2_int < 0) {
            return;
          }
          if (~this.battlefield.rankedParticipants[0] != ~this.battlefield.getPlayerTeamIndex(var2_int, -1) &&
            this.battlefield.i(this.battlefield.rankedParticipants[0], -12710) > this.battlefield.i(this.battlefield.getPlayerTeamIndex(var2_int, -1), -12710)) {
            stackIn_11_0 = 1;
          } else {
            stackIn_11_0 = 0;
          }
          var3 = stackIn_11_0;
          if (param0 != 107) {
            this.battleTutorial = (BattleTutorial) null;
          }
          var4 = this.o(param0 + 20) - 162;
          var5 = 133;
          var6 = 25;
          var7 = 0;
          var8 = vq.field_b.canvasWidth;
          var7Lifetime1 = 1;
          var9 = var6 + vq.field_b.canvasHeight;
          this.a(4, 2, var5, (byte) 89, var7Lifetime1 != 0, var8, var9, 99, var4, 3);
          this.a(param0 - 111, 90, 9, this.o(125) - 133, 24, var6);
          this.a(30, var3 != 0, var6, 16, (byte) -126, 63, var2_int);
          this.a(this.battlefield.getPlayerTeamIndex(var2_int, param0 - 108), var6, 3 * var6 + (this.o(126) - 133), 15, 90, -111, 9, -6 + var6 >> 1);
          SpellConfirmationDialog.field_j.g(20, this.o(127) - 180);
          if (this.field_fc) {
            SoftwareRaster.b(4, var4, 99, var5, 16777215, (int)(Math.sin((double)uk.field_n / 3.141592653589793 / 2.0) * 64.0 + 128.0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.MC(" + param0 + ')');
        }
    }

    private final void j(byte param0) {
        int var2_int = 0;
        if (param0 != 109) {
          return;
        }
        try {
          if (this.battlefield.currentPlayer == this.controlledPlayerId) {
            var2_int = uk.field_n - this.field_Hb;
            vl.outgoingPacket.writeCipheredOpcode(32161, 73);
            vl.outgoingPacket.writeByte(1, 0);
            vl.outgoingPacket.writeShort(true, var2_int);
            this.remainingTurnTicks = ce.turnDurationTicks[this.battlefield.turnDurationOption];
            this.field_Tb = false;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.TA(" + param0 + ')');
        }
    }

    private final int n(byte param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          var2_int = 103 / ((param0 - 4) / 43);
          var3 = 2 * this.field_ib + 128;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.CD(" + param0 + ')');
        }
    }

    private final String c(int param0, int param1) {
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_23_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (param0 >= 1000000000) {
            stackIn_2_0 = "lots";
            return stackIn_2_0;
          }
          var3_int = 111 / ((67 - param1) / 59);
          if (param0 >= 100000000) {
            stackIn_7_0 = param0 / 1000000000 + "." + param0 % 1000000000 / 100000000 + "B";
            return stackIn_7_0;
          }
          if (10000000 <= param0) {
            stackIn_10_0 = param0 / 1000000 + "M";
            return stackIn_10_0;
          }
          if (param0 >= 100000) {
            stackIn_13_0 = param0 / 1000000 + "." + param0 % 1000000 / 100000 + "M";
            return stackIn_13_0;
          }
          if (param0 >= 10000) {
            stackIn_16_0 = param0 / 1000 + "K";
            return stackIn_16_0;
          }
          if (param0 >= 1000) {
            stackIn_21_0 = param0 / 1000 + "." + param0 % 1000 / 100 + "K";
            return stackIn_21_0;
          }
          stackIn_23_0 = Integer.toString(param0);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ic.RA(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean a(boolean param0, GameEvent param1) {
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 == null) {
            return false;
          }
          if (param0) {
            return false;
          }
          var4 = param1.eventKind;
          if (var4 != 3 ||
            var5 != 0) {
            if (12 == var4) {
              return true;
            }
            if (var4 == 14 &&
              var5 == 0) {
              return true;
            }
            if (var4 == 16) {
              return true;
            }
            if (var4 == 17) {
              return true;
            }
            if (var4 == 9) {
              return true;
            }
            if (var4 != 19) {
              return false;
            }
            if (var5 == 0) {
              var3_int = ((TurnEffectEvent) (param1)).effectType;
              if (var3_int == 5) {
                return true;
              }
              if (var3_int == 3) {
                return true;
              }
              if (var3_int == 2) {
                return true;
              }
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_65_0 = var3;
          stackIn_65_1 = new StringBuilder().append("ic.RB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_65_0), ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(')').toString());
        }
    }

    final void rebuildSummonMenus(boolean obfuscationGuard) {
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RadialSummonItem[] godItems = null;
        int neutralItemCount = 0;
        RuntimeException var2_ref = null;
        int godOrdinal = 0;
        RadialSummonItem[] neutralItems = null;
        int neutralUnitOrdinal = 0;
        int neutralUnitType = 0;
        int godUnitType = 0;
        int var7 = 0;
        RadialSummonItem[] godUnitItems;
        int stackIn_58_0Lifetime1;
        int stackIn_58_1Lifetime1;
        int godUnitCount;
        int godUnitOrdinal;
        int chosenGodOrdinal;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!obfuscationGuard) {
            this.turnTimerDial = (TurnTimerDial) null;
          }
          boolean decompiledFrameCompleted0 = true;
          if (this.controlledPlayerId >= 0 &&
            this.controlledPlayerId < this.battlefield.chosenGods.length) {
            godItems = new RadialSummonItem[1 + this.battlefield.chosenGods[this.controlledPlayerId].length];
            godItems[0] = new RadialSummonItem(false, 0, 0, 25);
            godOrdinal = 0;
            while (godOrdinal < this.battlefield.chosenGods[this.controlledPlayerId].length) {
              godItems[godOrdinal + 1] = new RadialSummonItem(false, 1 + this.battlefield.chosenGods[this.controlledPlayerId][godOrdinal], godOrdinal + 1, 25);
              godOrdinal++;
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.godMenu = new RadialSummonMenu(40, godItems, false);
            }
          }
          if (this.controlledPlayerId >= 0 &&
            this.controlledPlayerId < this.battlefield.chosenGods.length) {
            this.unitMenus = new RadialSummonMenu[this.battlefield.chosenGods[this.controlledPlayerId].length + 1];
          }
          neutralItemCount = 0;
          neutralItems = new RadialSummonItem[AnimationFrameSet.unitUnlockGroups[0].length - 1];
          if (l.activeCampaignMission != null) {
            neutralItems = new RadialSummonItem[eb.a((byte) -107, 1 | this.field_Y[0])];
          }
          neutralUnitOrdinal = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(-1 + AnimationFrameSet.unitUnlockGroups[0].length > neutralUnitOrdinal)))) {
            neutralUnitType = AnimationFrameSet.unitUnlockGroups[0][neutralUnitOrdinal];
            if (var7 == 0) {
              if (l.activeCampaignMission == null ||
                (1 << neutralUnitOrdinal & this.field_Y[0]) != 0) {
                if (4 == neutralUnitType &&
                  !this.battlefield.kingBlackDragonSummoned) {
                  neutralItems[neutralItemCount] = new RadialSummonItem(true, 0, 74, 20);
                  neutralItemCount++;
                } else {
                  neutralItems[neutralItemCount] = new RadialSummonItem(true, 0, neutralUnitType, 20);
                  neutralItemCount++;
                }
              }
              neutralUnitOrdinal++;
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) && (this.controlledPlayerId >= 0 &&
            this.battlefield.chosenGods.length > this.controlledPlayerId)) {
            this.unitMenus[0] = new RadialSummonMenu(100, neutralItems, true);
          }
          if (0 <= this.controlledPlayerId &&
            this.controlledPlayerId < this.battlefield.chosenGods.length) {
            chosenGodOrdinal = 0;
            while (true) {
              stackIn_58_0 = chosenGodOrdinal;
              stackIn_58_1 = this.battlefield.chosenGods[this.controlledPlayerId].length;
              if (stackIn_58_0 >= stackIn_58_1) {
                return;
              }
              godUnitCount = 0;
              godUnitItems = new RadialSummonItem[eb.a((byte) -115, this.field_Y[this.battlefield.chosenGods[this.controlledPlayerId][chosenGodOrdinal] + 1])];
              if (var7 != 0) {
                return;
              }
              godUnitOrdinal = 0;
              while (godUnitOrdinal < 11) {
                godUnitType = AnimationFrameSet.unitUnlockGroups[1 + this.battlefield.chosenGods[this.controlledPlayerId][chosenGodOrdinal]][godUnitOrdinal];
                stackIn_58_0Lifetime1 = 0;
                stackIn_58_1Lifetime1 = this.field_Y[this.battlefield.chosenGods[this.controlledPlayerId][chosenGodOrdinal] + 1] & 1 << godUnitOrdinal;
                if (stackIn_58_0Lifetime1 < stackIn_58_1Lifetime1) {
                  godUnitItems[godUnitCount] = new RadialSummonItem(true, 1 + this.battlefield.chosenGods[this.controlledPlayerId][chosenGodOrdinal], godUnitType, 20);
                  godUnitCount++;
                }
                godUnitOrdinal++;
              }
              this.unitMenus[chosenGodOrdinal + 1] = new RadialSummonMenu(100, godUnitItems, true);
              chosenGodOrdinal++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "ic.AC(" + obfuscationGuard + ')');
        }
    }

    final void prepareMatchResults(boolean obfuscationGuard) {
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        um stackIn_23_2 = null;
        int stackIn_31_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int localTurn = 0;
        RuntimeException var2 = null;
        int turnsTaken = 0;
        int hasLostUnit = 0;
        int damageTaken = 0;
        int candidateScore = 0;
        int currentDamageThenSpecialUnitCount = 0;
        int currentTurns = 0;
        NodeDeque localUnits = null;
        int previousDamage = 0;
        Unit unit = null;
        int previousTurns = 0;
        int damageDelta = 0;
        int turnDelta = 0;
        int mutationSelector = 0;
        int mutationVariant = 0;
        int var15 = 0;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_j = 0;
          this.field_Sb = 250;
          stackIn_5_0 = (~this.battlefield.currentPlayer != ~this.controlledPlayerId) ? 0 : 1;
          localTurn = stackIn_5_0;
          if (!obfuscationGuard) {
            this.field_db = -124;
          }
          if (null != l.activeCampaignMission) {
            stackIn_15_0 = (~l.activeCampaignMission.playerSlot != ~this.battlefield.currentPlayer) ? 0 : 1;
            localTurn = stackIn_15_0;
          }
          stackIn_20_0 = -16147;
          stackIn_20_1 = 50;
          if (localTurn == 0 &&
            -1 != this.controlledPlayerId) {
            stackIn_23_2 = se.field_h;
          } else {
            stackIn_23_2 = oh.field_K;
          }
          TrianglePulse.a(stackIn_20_0, stackIn_20_1, stackIn_23_2, false);
          this.battleTutorial = null;
          if (l.activeCampaignMission != null) {
            turnsTaken = this.battlefield.playerTurnCounts[l.activeCampaignMission.playerSlot];
            DiskCacheWorker.reportCampaignTurn(localTurn != 0, 1, turnsTaken, l.activeCampaignMission);
            if (localTurn != 0) {
              stackIn_31_0 = (this.battlefield.unitLossCounts[l.activeCampaignMission.playerSlot] <= 0) ? 0 : 1;
              hasLostUnit = stackIn_31_0;
              damageTaken = this.battlefield.damageTakenByPlayer[l.activeCampaignMission.playerSlot];
              candidateScore = b.calculateMissionScore(l.activeCampaignMission.scoreTurnTarget, l.activeCampaignMission.scoreDamageTarget, damageTaken, (byte) 25, turnsTaken);
              currentDamageThenSpecialUnitCount = damageTaken;
              currentTurns = turnsTaken;
              previousDamage = 996394 ^ this.encodedDamageCheckpoint;
              previousTurns = this.encodedTurnCheckpoint ^ 996394;
              hc.field_b = hc.field_b + 1;
              hc.field_b = hc.field_b + (AiPlanningStrategy.pointerX ^ ko.pointerY);
              hc.field_b = Math.abs(hc.field_b);
              damageDelta = -previousDamage + currentDamageThenSpecialUnitCount;
              turnDelta = -previousTurns + currentTurns;
              mutationSelector = hc.field_b % 4;
              mutationVariant = mutationSelector;
              switch ((var15 == 0
                || mutationVariant == 0
                || mutationVariant == 2
                || mutationVariant == 3
                ) ? mutationVariant : -1) {
                case 0:
                  kw.campaignPacketWord0 = kw.campaignPacketWord0 - turnDelta;
                  ii.campaignPacketWord1 = ii.campaignPacketWord1 - damageDelta;
                  if (var15 == 0) {
                    break;
                  }
                case 1:
                  ii.campaignPacketWord1 = ii.campaignPacketWord1 + turnDelta;
                  kw.campaignPacketWord0 = kw.campaignPacketWord0 + damageDelta;
                  if (var15 == 0) {
                    break;
                  }
                case 2:
                  kw.campaignPacketWord0 = kw.campaignPacketWord0 + (-turnDelta + damageDelta);
                  if (var15 == 0) {
                    break;
                  }
                case 3:
                  ii.campaignPacketWord1 = ii.campaignPacketWord1 - (damageDelta - turnDelta);
                  if (var15 == 0) {
                    break;
                  }
                default:
                  throw new IllegalStateException("");
              }
              ActionSpell.submitCampaignResult(4, damageTaken, l.activeCampaignMission, hasLostUnit != 0, candidateScore, turnsTaken);
              if (1 == l.activeCampaignMission.campaign.campaignIndex &&
                l.activeCampaignMission.missionId == 3) {
                currentDamageThenSpecialUnitCount = 0;
                localUnits = this.battlefield.unitsByPlayer[l.activeCampaignMission.playerSlot];
                unit = (Unit) (localUnits.first((byte) 106));
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (null == unit))) {
                  stackIn_74_0 = -34;
                  stackIn_74_1 = ~unit.unitType;
                  if (var15 == 0) {
                    if (stackIn_74_0 == stackIn_74_1) {
                      currentDamageThenSpecialUnitCount++;
                    }
                    unit = (Unit) (localUnits.next((byte) 123));
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  stackIn_74_0 = ~currentDamageThenSpecialUnitCount;
                  stackIn_74_1 = -4;
                }
                if (stackIn_74_0 > stackIn_74_1) {
                  return;
                }
                this.a(44, (byte) 30, 211);
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.I(" + obfuscationGuard + ')');
        }
    }

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          vl.outgoingPacket.writeCipheredOpcode(32161, 65);
          var3 = -5 % ((26 - param0) / 37);
          var2_int = 5 + AttackEvent.nextBoundedInt(false, 15, vv.field_b);
          vl.outgoingPacket.writeByte(1, var2_int);
          var4 = 0;
          while (var4 < var2_int) {
            vl.outgoingPacket.writeByte(1, AttackEvent.nextBoundedInt(false, 256, vv.field_b));
            var4++;
            if (var5 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.QA(" + param0 + ')');
        }
    }

    private final void b(int param0) {
        CipherPacketBuffer var2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (param0 != -24936) {
            GameplayController.a((byte[]) null, -44, (CharSequence) null, 112, -65, (byte) -121);
          }
          if (this.field_lb) {
            vl.outgoingPacket.writeCipheredOpcode(32161, 65);
            var2 = vl.outgoingPacket;
            ((PacketBuffer) ((Object) var2)).writeByte(1, 2);
            ((PacketBuffer) ((Object) var2)).writeByte(1, this.battlefield.chosenGods[this.controlledPlayerId][0] | 128);
            ((PacketBuffer) ((Object) var2)).writeByte(param0 + 24937, this.battlefield.chosenGods[this.controlledPlayerId][1] << 4 | this.battlefield.chosenGods[this.controlledPlayerId][2]);
            if (!ArmiesOfGielinor.obfuscationControl) {
              return;
            }
          }
          this.battlefield.g(this.battlefield.chosenGods[this.controlledPlayerId][2], this.battlefield.chosenGods[this.controlledPlayerId][0], this.battlefield.chosenGods[this.controlledPlayerId][1], -9513);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "ic.ED(" + param0 + ')');
        }
    }

    private final void e(int param0, int param1, int param2) {
        String stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        try {
          if (this.battlefield.spellCastPending) {
            return;
          }
          this.field_gc = -1;
          this.field_nc = -1;
          if (param2 < 85) {
            this.controlledPlayerId = 27;
          }
          if (this.battlefield.currentPlayer == this.controlledPlayerId &&
            this.aiPlanners[this.controlledPlayerId] == null) {
            stackIn_12_0 = this.i(param0, 118);
          } else {
            stackIn_12_0 = TurnTimerDial.field_g;
          }
          var4 = stackIn_12_0;
          if (null != var4) {
            this.a(false, var4, (byte) -127);
            return;
          }
          this.field_y = -2;
          if (uc.spellDefinitions[param0][3] == 4) {
            this.notifyTutorialInteraction(25, param0, -128);
            this.requestSpellCast(param1, -1, param0, 2, false, -1);
            if (!ArmiesOfGielinor.obfuscationControl) {
              return;
            }
          }
          this.field_lc = false;
          if (null != this.field_oc) {
            this.field_oc = null;
          }
          this.a(true, 58, (Unit) null);
          this.movementPlanner.clearPath(126);
          this.field_gc = param0;
          this.field_nc = param1;
          this.notifyTutorialInteraction(25, this.field_gc, -97);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4_ref), "ic.UA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void rebuildOverviewTargets(int obfuscationGuard) {
        boolean stackIn_7_0 = false;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        boolean stackIn_28_0 = false;
        boolean stackIn_32_0 = false;
        int stackIn_39_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        boolean stackIn_54_0 = false;
        boolean stackIn_64_0 = false;
        int stackIn_71_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        boolean stackOut_53_0;
        boolean stackOut_63_0;
        boolean stackOut_27_0;
        boolean stackOut_31_0;
        NodeDeque controlledUnits = null;
        RuntimeException var2_ref = null;
        Unit controlledUnit = null;
        int playerIndex = 0;
        int controlledUnitGrouped = 0;
        NodeDeque otherPlayerUnits = null;
        CameraOverviewTarget controlledUnitTarget = null;
        MapTile landmarkTile = null;
        Unit otherUnit = null;
        int otherUnitGrouped = 0;
        CameraOverviewTarget otherUnitTarget = null;
        int obfuscationControl = 0;
        CameraOverviewTarget landmarkTarget;
        int stackIn_13_0Lifetime1;
        int stackIn_39_0Lifetime1;
        int stackIn_46_0Lifetime1;
        int stackIn_47_0Lifetime1;
        int stackIn_47_1Lifetime1;
        int stackIn_71_0Lifetime1;
        int tileX;
        int tileY;
        int landmarkGrouped;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          controlledUnits = this.battlefield.unitsByPlayer[this.controlledPlayerId];
          this.overviewTargets = new NodeDeque();
          controlledUnit = (Unit) (controlledUnits.first((byte) 123));
          scanLoop1: while (true) {
            if (controlledUnit != null) {
              stackIn_18_0 = 0;
              if (obfuscationControl != 0) {
                break scanLoop1;
              }
              controlledUnitGrouped = stackIn_18_0;
              controlledUnitTarget = (CameraOverviewTarget) (this.overviewTargets.first((byte) 111));
              while (null != controlledUnitTarget) {
                stackOut_6_0 = controlledUnitTarget.containsUnit(controlledUnit, -4977);
                stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                stackIn_7_0 = stackOut_6_0;
                if (stackIn_7_0) {
                  controlledUnitTarget.addUnit((byte) -106, controlledUnit);
                  controlledUnitGrouped = 1;
                } else {
                  controlledUnitTarget = (CameraOverviewTarget) (this.overviewTargets.next((byte) 123));
                  continue;
                }
                break;
              }
              stackIn_13_0Lifetime1 = controlledUnitGrouped;
              if (stackIn_13_0Lifetime1 == 0) {
                this.overviewTargets.addFirst(750, new CameraOverviewTarget(controlledUnit));
              }
              controlledUnit = (Unit) (controlledUnits.next((byte) 123));
              continue scanLoop1;
            }
            stackIn_18_0 = obfuscationGuard;
            break;
          }
          playerIndex = stackIn_18_0;
          scanLoop2: while (true) {
            stackIn_20_0 = ~playerIndex;
            scanLoop3: while (stackIn_20_0 > ~this.battlefield.playerCount) {
              stackIn_47_0 = ~this.controlledPlayerId;
              stackIn_47_1 = ~playerIndex;
              if (obfuscationControl != 0) {
                return;
              }
              if (stackIn_47_0 != stackIn_47_1) {
                otherPlayerUnits = this.battlefield.unitsByPlayer[playerIndex];
                otherUnit = (Unit) (otherPlayerUnits.first((byte) 93));
                while (otherUnit != null) {
                  stackOut_27_0 = otherUnit.hasMovementFlag1(false);
                  stackIn_20_0 = stackOut_27_0 ? 1 : 0;
                  stackIn_28_0 = stackOut_27_0;
                  if (obfuscationControl != 0) {
                    continue scanLoop3;
                  }
                  if (stackIn_28_0) {
                    otherUnitGrouped = 0;
                    otherUnitTarget = (CameraOverviewTarget) (this.overviewTargets.first((byte) 102));
                    while (true) {
                      if (null != otherUnitTarget) {
                        stackOut_31_0 = otherUnitTarget.containsUnit(otherUnit, -4977);
                        stackIn_39_0 = stackOut_31_0 ? 1 : 0;
                        stackIn_32_0 = stackOut_31_0;
                        if (stackIn_32_0) {
                          otherUnitGrouped = 1;
                          otherUnitTarget.addUnit((byte) -98, otherUnit);
                        } else {
                          otherUnitTarget = (CameraOverviewTarget) (this.overviewTargets.next((byte) 123));
                          continue;
                        }
                      }
                      stackIn_39_0Lifetime1 = otherUnitGrouped;
                      if (stackIn_39_0Lifetime1 != 0) {
                        break;
                      }
                      this.overviewTargets.addFirst(obfuscationGuard + 750, new CameraOverviewTarget(otherUnit));
                      break;
                    }
                  }
                  otherUnit = (Unit) (otherPlayerUnits.next((byte) 123));
                }
              }
              playerIndex++;
              if (obfuscationControl == 0) {
                continue scanLoop2;
              }
              break;
            }
            break;
          }
          tileX = 0;
          while (true) {
            stackIn_46_0 = ~tileX;
            stackIn_47_0Lifetime1 = stackIn_46_0;
            stackIn_47_1Lifetime1 = ~this.battlefield.mapWidth;
            if (stackIn_47_0Lifetime1 <= stackIn_47_1Lifetime1) {
              return;
            }
            if (obfuscationControl != 0) {
              return;
            }
            tileY = 0;
            while (this.battlefield.mapHeight > tileY) {
              landmarkTile = this.battlefield.tiles[this.battlefield.mapWidth * tileY + tileX];
              stackOut_53_0 = landmarkTile.isPortal(-118);
              stackIn_46_0Lifetime1 = stackOut_53_0 ? 1 : 0;
              stackIn_54_0 = stackOut_53_0;
              if (stackIn_54_0 ||
                landmarkTile.hasModifierFlag4((byte) -115) ||
                landmarkTile.hasModifierFlag1(obfuscationGuard + 12)) {
                landmarkGrouped = 0;
                landmarkTarget = (CameraOverviewTarget) (this.overviewTargets.first((byte) 123));
                while (true) {
                  if (null != landmarkTarget) {
                    stackOut_63_0 = landmarkTarget.containsTile(tileX, tileY, (byte) -54);
                    stackIn_71_0 = stackOut_63_0 ? 1 : 0;
                    stackIn_64_0 = stackOut_63_0;
                    if (stackIn_64_0) {
                      landmarkTarget.addTile(tileX, tileY, (byte) 94);
                      landmarkGrouped = 1;
                    } else {
                      landmarkTarget = (CameraOverviewTarget) (this.overviewTargets.next((byte) 123));
                      continue;
                    }
                  }
                  stackIn_71_0Lifetime1 = landmarkGrouped;
                  if (stackIn_71_0Lifetime1 != 0) {
                    break;
                  }
                  this.overviewTargets.addFirst(750, new CameraOverviewTarget(tileX, tileY));
                  break;
                }
              }
              tileY++;
            }
            tileX++;
            continue;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "ic.N(" + obfuscationGuard + ')');
        }
    }

    private final void i(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (this.selectedUnit != null ||
            this.field_h > -1) {
            if (80 > this.field_fb) {
              this.field_fb = this.field_fb + 5;
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if ((decompiledFrameRemainder0) &&
              (80 == this.field_fb)) {
              if (this.field_D) {
                if (this.field_mc > this.field_qb) {
                  this.field_qb = this.field_qb + 1;
                }
                if (this.field_mc <= this.field_qb) {
                  this.field_c = this.field_c - 1;
                  if (this.field_c <= 0) {
                    this.field_D = false;
                    this.field_c = 200;
                    if (var3 != 0) {
                      if (this.field_qb > 0) {
                        this.field_qb = this.field_qb - 1;
                      }
                      if (this.field_qb <= 0) {
                        this.field_c = this.field_c - 1;
                        if (this.field_c <= 0) {
                          this.field_c = 100;
                          this.field_D = true;
                        }
                      }
                    }
                  }
                }
              } else {
                if (this.field_qb > 0) {
                  this.field_qb = this.field_qb - 1;
                }
                if (this.field_qb <= 0) {
                  this.field_c = this.field_c - 1;
                  if (this.field_c <= 0) {
                    this.field_c = 100;
                    this.field_D = true;
                  }
                }
              }
            }
          }
          if (null != this.field_W ||
            -1 < this.field_ab) {
            if (this.field_i == 0) {
              this.field_ab = -1;
              this.field_W = null;
              if (var3 != 0) {
                this.field_i = this.field_i - 5;
              }
            } else {
              this.field_i = this.field_i - 5;
            }
          }
          if (param0) {
            this.f((byte) 75);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.QB(" + param0 + ')');
        }
    }

    private final void e(byte param0) {
        Battlefield stackIn_6_0 = null;
        boolean stackIn_6_1 = false;
        boolean stackIn_7_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 77) {
            this.e(true);
          }
          stackIn_6_0 = this.battlefield;
          stackIn_6_1 = true;
          stackIn_7_2 = !(this.field_lb);
          ((Battlefield) (Object) stackIn_6_0).prepareTurnConsequences(stackIn_6_1, stackIn_7_2, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.GC(" + param0 + ')');
        }
    }

    private final int a(Unit param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        MapTile var4 = null;
        Unit var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.battlefield == null) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (null == this.battlefield.tiles) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (param1 != 75) {
            stackIn_9_0 = 1;
            return stackIn_9_0;
          }
          var3_int = 0;
          while (this.battlefield.tiles.length > var3_int) {
            var4 = this.battlefield.tiles[var3_int];
            if (var4 != null ||
              var6 != 0) {
              var5 = var4.occupant;
              if (var5 != null &&
                param0 == var5) {
                stackIn_21_0 = var3_int;
                return stackIn_21_0;
              }
            }
            var3_int++;
            if (var6 == 0) {
              continue;
            }
            break;
          }
          stackIn_24_0 = -1;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("ic.E(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(byte param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.movementPlanner.selectionActive) {
            this.movementPlanner.drawSelectedPath(this.camera, -4);
          }
          var2_int = 8 % ((-60 - param0) / 56);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.W(" + param0 + ')');
        }
    }

    private final int b(boolean param0) {
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        String stackIn_60_0 = null;
        int stackIn_68_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_155_1 = 0;
        int stackIn_157_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_188_1 = 0;
        int stackIn_192_0 = 0;
        int stackIn_201_0 = 0;
        int stackIn_201_1 = 0;
        int stackIn_228_0 = 0;
        int stackIn_233_0 = 0;
        int stackIn_236_0 = 0;
        int stackIn_239_0 = 0;
        int stackIn_242_0 = 0;
        int stackIn_247_0 = 0;
        int stackIn_250_0 = 0;
        int stackIn_253_0 = 0;
        int stackIn_273_0 = 0;
        int stackIn_278_0 = 0;
        int stackIn_281_0 = 0;
        int stackIn_286_0 = 0;
        int stackIn_291_0 = 0;
        int stackIn_294_0 = 0;
        int stackIn_297_0 = 0;
        int stackIn_300_0 = 0;
        int stackIn_309_0 = 0;
        boolean stackIn_314_0 = false;
        int stackIn_318_0 = 0;
        int stackIn_321_0 = 0;
        boolean stackIn_325_0 = false;
        int stackIn_329_0 = 0;
        int stackIn_332_0 = 0;
        int stackIn_336_0 = 0;
        int stackIn_347_0 = 0;
        int stackIn_358_0 = 0;
        int stackIn_369_0 = 0;
        int stackIn_378_0 = 0;
        int stackIn_383_0 = 0;
        int stackIn_386_0 = 0;
        boolean stackIn_388_0 = false;
        int stackIn_398_0 = 0;
        int stackIn_405_0 = 0;
        int stackIn_411_0 = 0;
        int stackIn_417_0 = 0;
        int stackIn_425_0 = 0;
        int stackIn_429_0 = 0;
        int stackIn_431_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_313_0;
        boolean stackOut_324_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8_ref_String = null;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_155_0Lifetime1;
        int stackIn_155_1Lifetime1;
        int stackIn_188_0Lifetime1;
        int stackIn_188_1Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var7Lifetime6;
        int var7Lifetime7;
        int var7Lifetime8;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var9Lifetime5;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var7Lifetime2Lifetime1;
        int var8Lifetime1Lifetime1;
        int var9Lifetime2Lifetime1;
        int var9Lifetime4Lifetime1;
        int var9Lifetime5Lifetime1;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = so.field_b.field_a;
          var3 = so.field_b.field_g;
          if (this.battlefield.field_X) {
            this.field_j = 0;
          }
          if (mu.field_a == null &&
            0 >= this.field_j &&
            this.field_Sb <= 0) {
            this.trackCampaignMetrics(param0);
            if (this.field_V) {
              stackIn_19_0 = -1;
              return stackIn_19_0;
            }
            if (null != this.battleTutorial &&
              IterableDualNodeDeque.isPointerInBounds(-33, var2_int - (this.battleTutorial.panelWidth + 5), var2_int - 15, var3 - 45, -15 + var3)) {
              stackIn_27_0 = 1;
              return stackIn_27_0;
            }
            if (this.field_lb &&
              IterableDualNodeDeque.isPointerInBounds(-33, 10, 74, -40 + this.o(126), -10 + this.o(125))) {
              stackIn_33_0 = 2;
              return stackIn_33_0;
            }
            if (this.field_lb &&
              this.battlefield.teamGame &&
              TabbedPanel.a(this.o(125) - 26, 88, 14, false)) {
              stackIn_42_0 = 26;
              return stackIn_42_0;
            }
            var4 = -162 + this.o(125);
            var5 = 107;
            var6 = 25;
            if (!this.battlefield.field_V) {
              var5 = var5 - var6;
              var4 = var4 + var6;
            }
            if (IterableDualNodeDeque.isPointerInBounds(-33, 4, 103, var4, var5 + var4)) {
              stackIn_49_0 = -1;
              return stackIn_49_0;
            }
            if (this.battlefield.field_X) {
              var7 = rs.field_k;
              var8_ref_String = IntrusiveNode.field_g;
              if (!this.field_lb) {
                if (null != l.activeCampaignMission) {
                  stackIn_60_0 = pv.field_d;
                } else {
                  stackIn_60_0 = vq.field_f;
                }
                var8_ref_String = stackIn_60_0;
              }
              var9 = nr.field_e.a(var8_ref_String) / 2;
              var10 = -40;
              var11 = 0;
              var12 = 0;
              if (this.field_lb) {
                var11 = nr.field_e.a(DisplacedUnitMarker.field_t[12]) / 2;
                var12 = -65 - var11 + (rs.field_k - var9);
              }
              if (this.f(128, db.a(true, var12)) >= MatchConditionEntry.a(se.field_a, (byte) 94)) {
                var10 = var10 + se.field_a;
                if (var13 != 0) {
                  var10 = var10 + this.f(128, db.a(param0, var12));
                }
              } else {
                var10 = var10 + this.f(128, db.a(param0, var12));
              }
              if (IterableDualNodeDeque.isPointerInBounds(-33, db.a(true, 0) + var7 - (var9 + 45), var7 + db.a(true, 0) - 15, var10 + MatchConditionEntry.a(0, (byte) 94), 28 + (MatchConditionEntry.a(0, (byte) 94) + var10))) {
                stackIn_68_0 = 19;
                return stackIn_68_0;
              }
              if (this.field_lb &&
                this.controlledPlayerId > -1 &&
                !this.field_bb) {
                var7 = var7 - (var11 + 40);
                if (IterableDualNodeDeque.isPointerInBounds(-33, db.a(true, 0) + (var7 - var11 - 45), var7 + (db.a(true, 0) - 15), var10 + MatchConditionEntry.a(0, (byte) 94), 28 + var10 + MatchConditionEntry.a(0, (byte) 94))) {
                  stackIn_80_0 = 24;
                  return stackIn_80_0;
                }
              }
              stackIn_82_0 = -1;
              return stackIn_82_0;
            }
            if (this.battlefield.field_D < 3) {
              stackIn_85_0 = 3;
              return stackIn_85_0;
            }
            if (this.eventPresenters.first((byte) 108) != null &&
              ((EventPresenter) (this.eventPresenters.first((byte) 98))).isCombatViewReady((byte) 62)) {
              var7Lifetime1 = db.a(true, 21);
              var8 = MatchConditionEntry.a(35, (byte) 94);
              var9Lifetime1 = 93;
              var10Lifetime1 = 35;
              var11Lifetime1 = -var7Lifetime1 + (var2_int - var9Lifetime1);
              var12Lifetime1 = var8 + 0;
              if (!IterableDualNodeDeque.isPointerInBounds(-33, var11Lifetime1, var11Lifetime1 + var9Lifetime1, var12Lifetime1, var12Lifetime1 + var10Lifetime1)) {
                BattleTutorial.field_n = false;
                stackIn_94_0 = -1;
                return stackIn_94_0;
              }
              BattleTutorial.field_n = true;
              stackIn_92_0 = 18;
              return stackIn_92_0;
            }
            if (vt.a(67, en.field_E, this.field_Fb, bu.field_c, GrowthEvent.field_I, -121)) {
              stackIn_97_0 = 4;
              return stackIn_97_0;
            }
            if (TabbedPanel.a(29, 129, 19, false)) {
              stackIn_100_0 = 5;
              return stackIn_100_0;
            }
            if (null != this.spellConfirmation) {
              stackIn_105_0 = this.spellConfirmation.getActionAtPointer(28, (byte) 73, 27);
              return stackIn_105_0;
            }
            boolean decompiledFrameCompleted4 = true;
            boolean decompiledFrameCompleted3 = true;
            boolean decompiledFrameRemainder0 = true;
            if (this.battlefield.playerCoats != null) {
              if (!this.battlefield.teamGame) {
                var7Lifetime2 = 10;
                var8Lifetime1 = 0;
                while (this.battlefield.playerCount > var8Lifetime1) {
                  stackIn_201_0 = var8Lifetime1;
                  stackIn_201_1 = this.battlefield.currentPlayer;
                  if (var13 != 0) {
                    decompiledFrameCompleted4 = false;
                    break;
                  }
                  if (stackIn_201_0 != stackIn_201_1) {
                    if (IterableDualNodeDeque.isPointerInBounds(-33, -50 + var2_int, var2_int, var7Lifetime2, 30 + var7Lifetime2)) {
                      stackIn_122_0 = 25;
                      return stackIn_122_0;
                    }
                    var7Lifetime2 += 30;
                  } else {
                    if (IterableDualNodeDeque.isPointerInBounds(-33, var2_int - 64, var2_int, var7Lifetime2, 60 + var7Lifetime2)) {
                      stackIn_128_0 = 25;
                      return stackIn_128_0;
                    }
                    var7Lifetime2 += 60;
                  }
                  var8Lifetime1++;
                }
                if (decompiledFrameCompleted4) {
                  decompiledFrameRemainder0 = (var13 != 0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted4)) {
                var7Lifetime2Lifetime1 = 80;
                var8Lifetime1Lifetime1 = 0;
                while (!(var8Lifetime1Lifetime1 >= this.battlefield.teamCount)) {
                  stackIn_201_0 = this.battlefield.currentPlayer;
                  stackIn_201_1 = -1;
                  if (var13 != 0) {
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  boolean decompiledFrameRemainder1 = true;
                  if (stackIn_201_0 <= stackIn_201_1 ||
                    this.battlefield.getPlayerTeamIndex(this.battlefield.currentPlayer, -1) != var8Lifetime1Lifetime1) {
                    var9Lifetime2 = -(30 * this.battlefield.playerCount >> 2) + 6 - 60 + var2_int;
                    var10Lifetime2 = 0;
                    while (var10Lifetime2 < this.battlefield.playerCount) {
                      stackIn_155_0 = ~var8Lifetime1Lifetime1;
                      stackIn_155_1 = ~this.battlefield.getPlayerTeamIndex(var10Lifetime2, -1);
                      if (stackIn_155_0 == stackIn_155_1) {
                        if (IterableDualNodeDeque.isPointerInBounds(-33, var9Lifetime2, var9Lifetime2 + 30, var7Lifetime2Lifetime1, 30 + var7Lifetime2Lifetime1)) {
                          stackIn_151_0 = 25;
                          return stackIn_151_0;
                        }
                        var9Lifetime2 += 30;
                      }
                      var10Lifetime2++;
                    }
                    var7Lifetime2Lifetime1 += 35;
                    stackIn_155_0Lifetime1 = -33;
                    stackIn_155_1Lifetime1 = -120 + var2_int;
                    if (IterableDualNodeDeque.isPointerInBounds(stackIn_155_0Lifetime1, stackIn_155_1Lifetime1, var2_int, var7Lifetime2Lifetime1, var7Lifetime2Lifetime1 + 30)) {
                      stackIn_157_0 = -1;
                      return stackIn_157_0;
                    }
                    if (this.battlefield.campaignMission == null) {
                      var7Lifetime2Lifetime1 += 40;
                    } else {
                      var7Lifetime2Lifetime1 += 30;
                    }
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    var9Lifetime2Lifetime1 = 0;
                    while (true) {
                      if (var9Lifetime2Lifetime1 < this.battlefield.playerCount) {
                        stackIn_188_0 = ~this.battlefield.currentPlayer;
                        stackIn_188_1 = ~var9Lifetime2Lifetime1;
                        if (stackIn_188_0 == stackIn_188_1) {
                          if (IterableDualNodeDeque.isPointerInBounds(-33, -88 + var2_int, -28 + var2_int, var7Lifetime2Lifetime1, var7Lifetime2Lifetime1 + 60)) {
                            stackIn_175_0 = 25;
                            return stackIn_175_0;
                          }
                          var7Lifetime2Lifetime1 += 60;
                        } else {
                          if (~var8Lifetime1Lifetime1 == ~this.battlefield.getPlayerTeamIndex(var9Lifetime2Lifetime1, -1)) {
                            if (IterableDualNodeDeque.isPointerInBounds(-33, var2_int - 60 - 14, -58 + var2_int, var7Lifetime2Lifetime1, var7Lifetime2Lifetime1 + 30)) {
                              stackIn_184_0 = 25;
                              return stackIn_184_0;
                            }
                            var7Lifetime2Lifetime1 += 30;
                          }
                        }
                        var9Lifetime2Lifetime1++;
                        continue;
                      }
                      var7Lifetime2Lifetime1 += 5;
                      stackIn_188_0Lifetime1 = -33;
                      stackIn_188_1Lifetime1 = -120 + var2_int;
                      if (IterableDualNodeDeque.isPointerInBounds(stackIn_188_0Lifetime1, stackIn_188_1Lifetime1, var2_int, var7Lifetime2Lifetime1, 30 + var7Lifetime2Lifetime1)) {
                        stackIn_192_0 = -1;
                        return stackIn_192_0;
                      }
                      if (this.battlefield.campaignMission == null) {
                        var7Lifetime2Lifetime1 += 40;
                        break;
                      }
                      var7Lifetime2Lifetime1 += 30;
                      break;
                    }
                  }
                  var8Lifetime1Lifetime1++;
                }
              }
            }
            if ((decompiledFrameCompleted4) &&
              (decompiledFrameCompleted3)) {
              stackIn_201_0 = this.field_H;
              stackIn_201_1 = 240;
            }
            boolean decompiledFrameRemainder4 = true;
            if (stackIn_201_0 == stackIn_201_1) {
              if (!kt.field_l) {
                var7Lifetime3 = this.battlefield.mapSizeSetting;
                if (0 == var7Lifetime3) {
                  if (SpellMenuGroup.field_h[1].b(210, 100, AiPlanningStrategy.pointerX, ko.pointerY)) {
                    stackIn_273_0 = 20;
                    return stackIn_273_0;
                  }
                  if (IterableDualNodeDeque.isPointerInBounds(-33, 0, 251, 100, 347)) {
                    stackIn_278_0 = 0;
                    return stackIn_278_0;
                  }
                } else {
                  if (1 == var7Lifetime3 &&
                    var13 == 0) {
                    if (SpellMenuGroup.field_h[1].b(215, 95, AiPlanningStrategy.pointerX, ko.pointerY)) {
                      stackIn_281_0 = 20;
                      return stackIn_281_0;
                    }
                    decompiledFrameRemainder4 = !(!IterableDualNodeDeque.isPointerInBounds(-33, 0, 255, 95, 355));
                    if (decompiledFrameRemainder4) {
                      stackIn_286_0 = 0;
                      return stackIn_286_0;
                    }
                  }
                  if (decompiledFrameRemainder4) {
                    if (var7Lifetime3 == 2) {
                      if (SpellMenuGroup.field_h[1].b(210, 105, AiPlanningStrategy.pointerX, ko.pointerY)) {
                        stackIn_291_0 = 20;
                        return stackIn_291_0;
                      }
                      if (IterableDualNodeDeque.isPointerInBounds(-33, 0, 253, 105, 352)) {
                        stackIn_294_0 = 0;
                        return stackIn_294_0;
                      }
                    } else {
                      if (3 == var7Lifetime3) {
                        if (SpellMenuGroup.field_h[1].b(200, 110, AiPlanningStrategy.pointerX, ko.pointerY)) {
                          stackIn_297_0 = 20;
                          return stackIn_297_0;
                        }
                        if (IterableDualNodeDeque.isPointerInBounds(-33, 8, 238, 110, 340)) {
                          stackIn_300_0 = 0;
                          return stackIn_300_0;
                        }
                      }
                    }
                  }
                }
              } else {
                var7Lifetime3 = this.battlefield.mapSizeSetting;
                if (var7Lifetime3 == 0 &&
                  var13 == 0) {
                  if (SpellMenuGroup.field_h[0].b(188, 138, AiPlanningStrategy.pointerX, ko.pointerY)) {
                    stackIn_228_0 = 20;
                    return stackIn_228_0;
                  }
                  decompiledFrameRemainder4 = !(!db.a(343, 133, 405, 1661761121, 0));
                  if (decompiledFrameRemainder4) {
                    stackIn_233_0 = 0;
                    return stackIn_233_0;
                  }
                }
                if (decompiledFrameRemainder4) {
                  if (1 == var7Lifetime3 &&
                    var13 == 0) {
                    if (SpellMenuGroup.field_h[0].b(190, 128, AiPlanningStrategy.pointerX, ko.pointerY)) {
                      stackIn_236_0 = 20;
                      return stackIn_236_0;
                    }
                    decompiledFrameRemainder4 = !(!db.a(348, 128, 420, 1661761121, 0));
                    if (decompiledFrameRemainder4) {
                      stackIn_239_0 = 0;
                      return stackIn_239_0;
                    }
                  }
                  if (decompiledFrameRemainder4) {
                    if (var7Lifetime3 == 2 &&
                      var13 == 0) {
                      if (SpellMenuGroup.field_h[0].b(188, 137, AiPlanningStrategy.pointerX, ko.pointerY)) {
                        stackIn_242_0 = 20;
                        return stackIn_242_0;
                      }
                      decompiledFrameRemainder4 = !(!db.a(343, 133, 405, 1661761121, 0));
                      if (decompiledFrameRemainder4) {
                        stackIn_247_0 = 0;
                        return stackIn_247_0;
                      }
                    }
                    if ((decompiledFrameRemainder4) &&
                      (3 == var7Lifetime3)) {
                      if (SpellMenuGroup.field_h[0].b(188, 95, AiPlanningStrategy.pointerX, ko.pointerY)) {
                        stackIn_250_0 = 20;
                        return stackIn_250_0;
                      }
                      if (db.a(383, 93, 415, 1661761121, 0)) {
                        stackIn_253_0 = 0;
                        return stackIn_253_0;
                      }
                    }
                  }
                }
              }
            }
            if (TabbedPanel.a(-95 + this.o(126), 130, 22, false) && (this.battlefield.runeCapOption != 0 ||
              this.field_E)) {
              stackIn_309_0 = 23;
              return stackIn_309_0;
            }
            boolean decompiledFrameCompleted2 = true;
            if (this.field_B == 0) {
              var7Lifetime4 = 0;
              while (var7Lifetime4 < 5) {
                var8Lifetime2 = 130 + (int)(Math.sin((double)var7Lifetime4 * 3.141592653589793 / 4.0) * 64.0);
                var9Lifetime3 = (int)(Math.cos(3.141592653589793 * (double)var7Lifetime4 / 4.0) * -64.0) - (-this.o(126) + 95);
                stackOut_313_0 = TabbedPanel.a(var9Lifetime3, var8Lifetime2, 22, false);
                stackIn_321_0 = stackOut_313_0 ? 1 : 0;
                stackIn_314_0 = stackOut_313_0;
                if (var13 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                if (stackIn_314_0) {
                  stackIn_318_0 = 21;
                  return stackIn_318_0;
                }
                var7Lifetime4++;
              }
            }
            if (decompiledFrameCompleted2) {
              stackIn_321_0 = 0;
            }
            boolean decompiledFrameCompleted1 = true;
            if (stackIn_321_0 == this.field_n) {
              var7Lifetime5 = -1;
              while (var7Lifetime5 < 6) {
                stackOut_324_0 = TabbedPanel.a(this.o(127) - 100, 230 + 45 * var7Lifetime5, 22, false);
                stackIn_332_0 = stackOut_324_0 ? 1 : 0;
                stackIn_325_0 = stackOut_324_0;
                if (var13 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                if (stackIn_325_0) {
                  stackIn_329_0 = 22;
                  return stackIn_329_0;
                }
                var7Lifetime5++;
              }
            }
            if (decompiledFrameCompleted1) {
              stackIn_332_0 = this.battlefield.field_D;
            }
            if (stackIn_332_0 < 3) {
              stackIn_336_0 = 3;
              return stackIn_336_0;
            }
            if (80 == this.field_fb) {
              if (this.selectedUnit != null &&
                TabbedPanel.a(59, 279, 19, false)) {
                stackIn_347_0 = 6;
                return stackIn_347_0;
              }
              if ((this.selectedUnit != null ||
                this.field_h > -1) && IterableDualNodeDeque.isPointerInBounds(-33, 253, var2_int - 78, 0, 75)) {
                stackIn_358_0 = -1;
                return stackIn_358_0;
              }
            }
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder3 = true;
            if (this.field_m) {
              this.camera.gridPosition[0] = this.selectedUnit.tileX;
              this.camera.gridPosition[1] = this.selectedUnit.tileY;
              this.camera.projectModelAnchor(9470337);
              var7Lifetime6 = this.camera.screenPosition[0];
              var8Lifetime3 = this.camera.screenPosition[1];
              var9_ref_int__ = this.battlefield.chosenGods[this.controlledPlayerId];
              if (var9_ref_int__.length != 3) {
                var10Lifetime3 = 40;
                var11Lifetime2 = 15 + var7Lifetime6;
                var11Lifetime2 = var11Lifetime2 - var9_ref_int__.length * var10Lifetime3 / 2;
                var12Lifetime2 = 0;
                while (var9_ref_int__.length > var12Lifetime2) {
                  stackIn_388_0 = TabbedPanel.a(25 + var8Lifetime3, var11Lifetime2 + 25, 25, false);
                  if (var13 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_388_0) {
                    stackIn_369_0 = 7 + var12Lifetime2;
                    return stackIn_369_0;
                  }
                  var11Lifetime2 = var11Lifetime2 + var10Lifetime3;
                  var12Lifetime2++;
                }
                if (decompiledFrameCompleted0) {
                  decompiledFrameRemainder3 = (var13 != 0);
                }
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameCompleted0)) {
                if (TabbedPanel.a(var8Lifetime3 + 55, 40 + var7Lifetime6, 25, false)) {
                  stackIn_378_0 = 7;
                  return stackIn_378_0;
                }
                if (TabbedPanel.a(var8Lifetime3, 80 + var7Lifetime6, 25, false)) {
                  stackIn_383_0 = 8;
                  return stackIn_383_0;
                }
                if (TabbedPanel.a(var8Lifetime3, var7Lifetime6, 25, false)) {
                  stackIn_386_0 = 9;
                  return stackIn_386_0;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_388_0 = this.field_F;
            }
            boolean decompiledFrameRemainder2 = true;
            if (stackIn_388_0) {
              this.camera.gridPosition[1] = this.selectedUnit.tileY;
              this.camera.gridPosition[0] = this.selectedUnit.tileX;
              this.camera.projectModelAnchor(9470337);
              var7Lifetime7 = this.camera.screenPosition[0];
              var8Lifetime4 = this.camera.screenPosition[1];
              if (!IterableDualNodeDeque.isPointerInBounds(-33, var7Lifetime7 + 25, var7Lifetime7 + 55, var8Lifetime4 - 8, 7 + var8Lifetime4)) {
                if (!IterableDualNodeDeque.isPointerInBounds(-33, 25 + var7Lifetime7, var7Lifetime7 + 55, 33 + var8Lifetime4, var8Lifetime4 + 48)) {
                  if (IterableDualNodeDeque.isPointerInBounds(-33, var7Lifetime7 - 15, 15 + var7Lifetime7, 13 + var8Lifetime4, var8Lifetime4 + 28)) {
                    var9Lifetime4 = this.d(-59, this.selectedUnit.tileY - 1, -1 + this.selectedUnit.tileX) ? 1 : 0;
                    if (var9Lifetime4 != 0) {
                      stackIn_398_0 = 12;
                      return stackIn_398_0;
                    }
                    decompiledFrameRemainder2 = (var13 != 0);
                  }
                  if ((decompiledFrameRemainder2) &&
                    (decompiledFrameRemainder2 = !(!IterableDualNodeDeque.isPointerInBounds(-33, 65 + var7Lifetime7, 95 + var7Lifetime7, var8Lifetime4 + 13, var8Lifetime4 + 28)))) {
                    var9Lifetime4 = this.d(-103, this.selectedUnit.tileY, this.selectedUnit.tileX) ? 1 : 0;
                    if (var9Lifetime4 != 0) {
                      stackIn_405_0 = 13;
                      return stackIn_405_0;
                    }
                    decompiledFrameRemainder2 = (var13 != 0);
                  }
                }
                if (decompiledFrameRemainder2) {
                  var9Lifetime4 = this.d(-78, this.selectedUnit.tileY, this.selectedUnit.tileX - 1) ? 1 : 0;
                  if (var9Lifetime4 != 0) {
                    stackIn_411_0 = 11;
                    return stackIn_411_0;
                  }
                  decompiledFrameRemainder2 = (var13 != 0);
                }
              }
              if (decompiledFrameRemainder2) {
                var9Lifetime4Lifetime1 = this.d(-65, -1 + this.selectedUnit.tileY, this.selectedUnit.tileX) ? 1 : 0;
                if (var9Lifetime4Lifetime1 != 0) {
                  stackIn_417_0 = 10;
                  return stackIn_417_0;
                }
              }
            }
            if (this.field_y != -2) {
              this.camera.gridPosition[1] = this.field_ec;
              this.camera.gridPosition[0] = this.field_X;
              this.camera.projectModelAnchor(9470337);
              var7Lifetime8 = this.camera.screenPosition[0] + 24;
              var8Lifetime5 = this.camera.screenPosition[1];
              var9Lifetime5 = -1;
              if (this.godMenu != null) {
                var9Lifetime5 = this.godMenu.getChoiceAtPoint((byte) -124, TeleportAction.pointerPressY, var7Lifetime8 + 16, BattleTutorial.pointerPressX, var8Lifetime5 + 16);
              }
              if (var9Lifetime5 > -1) {
                stackIn_425_0 = 14;
                return stackIn_425_0;
              }
              if (this.field_y != -1) {
                var9Lifetime5Lifetime1 = this.unitMenus[this.field_y].getChoiceAtPoint((byte) -110, TeleportAction.pointerPressY, var7Lifetime8 + 16, BattleTutorial.pointerPressX, 16 + var8Lifetime5);
                if (var9Lifetime5Lifetime1 > -1) {
                  stackIn_429_0 = 15;
                  return stackIn_429_0;
                }
              }
            }
            stackIn_431_0 = 16;
            return stackIn_431_0;
          }
          stackIn_14_0 = -1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.WB(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int[] stackIn_42_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          fe.b(db.a(true, param1), MatchConditionEntry.a(param0, (byte) 94), 223, 228, io.field_m, TutorialController.field_e, 0, 180);
          var4_int = this.battlefield.rankedParticipants[this.field_Rb];
          var5 = this.battlefield.playerNames[var4_int];
          var5 = BitmapFont.a(nr.field_e, var5, 400);
          if (pc.field_j == null) {
            var6 = 0;
            if (this.field_lb &&
              this.battlefield.field_G != null &&
              var4_int >= 0 &&
              this.battlefield.field_G.length > var4_int) {
              var6 = this.battlefield.field_G[var4_int];
            }
            var7_int = eb.a((byte) -82, var6);
            var8 = 0;
            var9 = var8 + var7_int * 19;
            if (var9 < 192) {
              var9 = 192;
            }
            pc.field_j = new RgbSprite(217, var9);
            pc.field_j.b();
            SoftwareRaster.f(0, 0, SoftwareRaster.width, SoftwareRaster.height, 1776150);
            var10 = 0;
            while (var10 < 16) {
              stackIn_35_0 = -1;
              stackIn_35_1 = ~(var6 & 1 << var10);
              if (var13 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              stackIn_28_0 = (stackIn_35_0 == stackIn_35_1) ? 0 : 1;
              var11 = stackIn_28_0;
              if (var11 != 0) {
                var8 += 19;
                en.field_E.c(du.field_g[var10], 109, var8, 16777215, -1);
                var12 = (en.field_E.a(du.field_g[var10]) >> 1) + 3;
                AttackEvent.field_O.f(-AttackEvent.field_O.pixelWidth + (109 - var12), -10 + var8);
                AttackEvent.field_O.f(109 + var12, var8 - 10);
              }
              var10++;
            }
            if (decompiledFrameCompleted0) {
              so.field_b.a(param2 + 35212);
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_35_0 = param2;
            stackIn_35_1 = -29607;
          }
          if (stackIn_35_0 != stackIn_35_1) {
            this.startEquipmentTutorial((byte) 125);
          }
          SoftwareRaster.setClip(db.a(true, 374), MatchConditionEntry.a(33 + param0, (byte) 94), db.a(true, 591), MatchConditionEntry.a(192 + (param0 + 33), (byte) 94));
          var6Lifetime1 = -(uk.field_n / 3) % pc.field_j.pixelHeight;
          pc.field_j.f(db.a(true, 374), MatchConditionEntry.a(var6Lifetime1 + param0 + 33, (byte) 94));
          pc.field_j.f(db.a(true, 374), MatchConditionEntry.a(pc.field_j.pixelHeight + var6Lifetime1 + (param0 + 33), (byte) 94));
          SoftwareRaster.a();
          if (!this.field_l) {
            stackIn_42_0 = nd.field_b;
          } else {
            stackIn_42_0 = TutorialController.field_e;
          }
          var7 = stackIn_42_0;
          fe.a(db.a(true, param1 + 3), MatchConditionEntry.a(param0 + 3, (byte) 94), 217, 29, DisplacedUnitMarker.field_s, var7, 0, 128, true);
          fe.c(var5, db.a(true, 483), MatchConditionEntry.a(34 + param0, (byte) 94), 0, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4), "ic.CB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var7_int = -1;
          if (param0 != -4) {
            return;
          }
          var8 = var7_int;
          while (var8 < 3) {
            SoftwareRaster.b(param2, param3 + var8 * param5, param1, param4, 0, 128);
            od.field_a[var8 + 1].g(param2, param5 * var8 + param3);
            var8++;
            if (var9 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.DA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void v(int param0) {
        boolean stackIn_60_0 = false;
        int stackIn_67_0 = 0;
        boolean stackIn_95_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_59_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4_intLifetime1;
        int var4_intLifetime1Lifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 > -6) {
            this.field_d = (um) null;
          }
          if (this.field_y != -2) {
            if (0 == this.battlefield.getSummoningGodMaskAt(this.field_X, -27300, this.field_ec, this.controlledPlayerId)) {
              this.field_y = -2;
              return;
            }
            this.camera.gridPosition[1] = this.field_ec;
            this.camera.gridPosition[0] = this.field_X;
            this.camera.projectModelAnchor(9470337);
            var2_int = 24 + this.camera.screenPosition[0];
            var3 = this.camera.screenPosition[1];
            if (null != this.godMenu) {
              this.godMenu.draw(this.battlefield.playerMana[this.controlledPlayerId], -23451, this.field_hc, var2_int, var3);
            }
            if (-1 != this.field_y) {
              this.unitMenus[this.field_y].draw(this.battlefield.playerMana[this.controlledPlayerId], -23451, this.field_hc, var2_int, var3);
              var4_int = this.unitMenus[this.field_y].getChoiceAtPoint((byte) -116, ko.pointerY, 16 + var2_int, AiPlanningStrategy.pointerX, 16 + var3);
              if (var4_int > -1) {
                this.c(16 + var3, var4_int, 0, var2_int + 16);
              }
            }
          }
          if (this.field_F) {
            boolean decompiledFrameRemainder0 = true;
            this.camera.gridPosition[1] = this.selectedUnit.tileY;
            this.camera.gridPosition[0] = this.selectedUnit.tileX;
            this.camera.projectModelAnchor(9470337);
            var2_intLifetime1 = this.camera.screenPosition[0];
            var3Lifetime1 = this.camera.screenPosition[1];
            if (IterableDualNodeDeque.isPointerInBounds(-33, 25 + var2_intLifetime1, 55 + var2_intLifetime1, -8 + var3Lifetime1, 7 + var3Lifetime1)) {
              var4_intLifetime1 = this.d(-92, -1 + this.selectedUnit.tileY, this.selectedUnit.tileX) ? 1 : 0;
              this.a(40, var4_intLifetime1 != 0, var3Lifetime1, 40 + var2_intLifetime1);
              decompiledFrameRemainder0 = (var8 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!IterableDualNodeDeque.isPointerInBounds(-33, var2_intLifetime1 + 25, 55 + var2_intLifetime1, var3Lifetime1 + 33, 48 + var3Lifetime1)) {
                if (IterableDualNodeDeque.isPointerInBounds(-33, var2_intLifetime1 - 15, 15 + var2_intLifetime1, 13 + var3Lifetime1, var3Lifetime1 + 28)) {
                  var4_intLifetime1Lifetime1 = this.d(-51, this.selectedUnit.tileY - 1, -1 + this.selectedUnit.tileX) ? 1 : 0;
                  this.a(40, var4_intLifetime1Lifetime1 != 0, 20 + var3Lifetime1, var2_intLifetime1);
                  decompiledFrameRemainder0 = (var8 != 0);
                }
                if ((decompiledFrameRemainder0) &&
                  (IterableDualNodeDeque.isPointerInBounds(-33, var2_intLifetime1 + 65, 95 + var2_intLifetime1, 13 + var3Lifetime1, var3Lifetime1 + 28))) {
                  var4_intLifetime1Lifetime1 = this.d(-103, this.selectedUnit.tileY, this.selectedUnit.tileX) ? 1 : 0;
                  this.a(40, var4_intLifetime1Lifetime1 != 0, 20 + var3Lifetime1, 80 + var2_intLifetime1);
                  if (var8 != 0) {
                    var4_intLifetime1Lifetime1 = this.d(-94, this.selectedUnit.tileY, -1 + this.selectedUnit.tileX) ? 1 : 0;
                    this.a(40, var4_intLifetime1Lifetime1 != 0, var3Lifetime1 + 40, var2_intLifetime1 + 40);
                  }
                }
              } else {
                var4_intLifetime1Lifetime1 = this.d(-94, this.selectedUnit.tileY, -1 + this.selectedUnit.tileX) ? 1 : 0;
                this.a(40, var4_intLifetime1Lifetime1 != 0, var3Lifetime1 + 40, var2_intLifetime1 + 40);
              }
            }
            MatchConditionRegistry.field_d[0].g(var2_intLifetime1 + 25, var3Lifetime1 - 8);
            MatchConditionRegistry.field_d[2].g(25 + var2_intLifetime1, var3Lifetime1 + 33);
            MatchConditionRegistry.field_d[3].g(-15 + var2_intLifetime1, 13 + var3Lifetime1);
            MatchConditionRegistry.field_d[1].g(65 + var2_intLifetime1, var3Lifetime1 + 13);
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder1 = true;
          if (this.field_m) {
            this.camera.gridPosition[0] = this.selectedUnit.tileX;
            this.camera.gridPosition[1] = this.selectedUnit.tileY;
            this.camera.projectModelAnchor(9470337);
            var2_intLifetime2 = this.camera.screenPosition[0];
            var3Lifetime2 = this.camera.screenPosition[1];
            var4 = this.battlefield.chosenGods[this.controlledPlayerId];
            if (var4.length == 3) {
              UnitModelPreview.field_d[1 + this.battlefield.chosenGods[this.controlledPlayerId][1]].g(15 + var2_intLifetime2, 30 + var3Lifetime2);
              if (TabbedPanel.a(var3Lifetime2 + 55, 40 + var2_intLifetime2, 25, false)) {
                UnitModelPreview.field_d[0].f(var2_intLifetime2 + 15, 30 + var3Lifetime2, 256);
              }
              UnitModelPreview.field_d[this.battlefield.chosenGods[this.controlledPlayerId][2] + 1].g(55 + var2_intLifetime2, var3Lifetime2 - 25);
              if (TabbedPanel.a(var3Lifetime2, var2_intLifetime2 + 80, 25, false)) {
                UnitModelPreview.field_d[0].f(var2_intLifetime2 + 55, -25 + var3Lifetime2, 256);
              }
              UnitModelPreview.field_d[this.battlefield.chosenGods[this.controlledPlayerId][0] + 1].g(var2_intLifetime2 - 25, var3Lifetime2 - 25);
              decompiledFrameRemainder1 = !(!TabbedPanel.a(var3Lifetime2, var2_intLifetime2, 25, false));
              if (decompiledFrameRemainder1) {
                UnitModelPreview.field_d[0].f(var2_intLifetime2 - 25, -25 + var3Lifetime2, 256);
                decompiledFrameRemainder1 = (var8 != 0);
              }
            }
            if (decompiledFrameRemainder1) {
              var5 = 40;
              var6 = 15 + var2_intLifetime2;
              var6 = var6 - var5 * var4.length / 2;
              var7 = 0;
              while (var7 < var4.length) {
                UnitModelPreview.field_d[var4[var7] + 1].g(var6, var3Lifetime2);
                stackOut_59_0 = TabbedPanel.a(var3Lifetime2 + 25, var6 + 25, 25, false);
                stackIn_67_0 = stackOut_59_0 ? 1 : 0;
                stackIn_60_0 = stackOut_59_0;
                if (var8 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_60_0) {
                  UnitModelPreview.field_d[var4[var7] + 1].f(var6, var3Lifetime2, 256);
                }
                var6 = var6 + var5;
                var7++;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_67_0 = 0;
          }
          if (stackIn_67_0 > ~this.field_ab) {
            if (0 != this.field_i) {
              this.a(0, 112, 0, 253, this.battlefield.tiles[this.field_ab], this.field_i, this.controlledPlayerId, this.battlefield.mapTheme);
              if (var8 != 0) {
                this.field_ab = -1;
              }
            } else {
              this.field_ab = -1;
            }
          }
          if (this.field_W != null) {
            boolean decompiledSharedTail0 = (this.field_i != 0);
            if (!decompiledSharedTail0) {
              this.field_W = null;
              decompiledSharedTail0 = (var8 != 0);
            }
            if (decompiledSharedTail0) {
              hs.a(false, true, this.field_W, 0, 253, this.field_fb, this.field_i, 0);
            }
          }
          if (this.field_h > -1) {
            this.a(0, 110, this.field_qb, 253, this.battlefield.tiles[this.field_h], this.field_fb, this.controlledPlayerId, this.battlefield.mapTheme);
          }
          if (null != this.selectedUnit) {
            stackIn_95_0 = (~this.controlledPlayerId == ~this.selectedUnit.ownerPlayer);
            hs.a(stackIn_95_0, true, this.selectedUnit, this.field_qb, 253, this.field_fb, this.field_fb, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.HB(" + param0 + ')');
        }
    }

    private final void h(int param0, int param1) {
        int stackIn_31_0 = 0;
        int stackIn_52_0 = 0;
        CipherPacketBuffer stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_92_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        MapTile var4 = null;
        int var4_int = 0;
        PreparedAction var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var4_intLifetime1;
        int var5Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.selectedUnit == null) {
            return;
          }
          var3_int = -26 % ((param1 + 51) / 62);
          if (this.field_mb) {
            return;
          }
          if (~this.controlledPlayerId != ~this.battlefield.currentPlayer) {
            return;
          }
          if (0 >= this.remainingTurnTicks) {
            return;
          }
          if (this.selectedUnit.unitType == 72) {
            if (this.field_lc) {
              this.field_lc = false;
              this.movementPlanner.prepareForUnit(false, 114, this.controlledPlayerId, this.selectedUnit, -1, -1);
              if (var6 == 0) {
                return;
              }
            }
            this.field_lc = true;
            if (-1 < this.movementPlanner.spellId) {
              this.notifyTutorialInteraction(25, -1, -86);
            }
            this.movementPlanner.clearSelection(-86);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.selectedUnit.unitType == 34) {
            var4 = this.battlefield.tiles[this.selectedUnit.tileY * this.battlefield.mapWidth + this.selectedUnit.tileX];
            stackIn_31_0 = (var4.f(19725)) ? 0 : 1;
            var5 = stackIn_31_0;
            if ((!this.selectedUnit.movementSpent &&
              this.selectedUnit.attacksRemaining != 0) &&
              (decompiledFrameRemainder0 = (var5 != 0))) {
              this.a(false, jv.field_e, (byte) -119);
              return;
            }
            if (decompiledFrameRemainder0) {
              this.a(false, j.field_d, (byte) -127);
              return;
            }
          }
          if (this.selectedUnit.unitType == 7 &&
            param0 == -1) {
            var4_int = this.battlefield.tiles[this.battlefield.mapWidth * this.selectedUnit.tileY + this.selectedUnit.tileX].terrainType;
            stackIn_52_0 = (var4_int == 0) ? 0 : 1;
            var5Lifetime1 = stackIn_52_0;
            if (this.selectedUnit.movementSpent ||
              this.selectedUnit.attacksRemaining == 0) {
              this.a(false, j.field_d, (byte) -128);
              if (var6 == 0) {
                return;
              }
            }
            if (var5Lifetime1 == 0) {
              this.field_m = true;
              if (var6 == 0) {
                return;
              }
            }
            this.a(false, ao.field_x, (byte) -122);
            return;
          }
          if (17 == this.selectedUnit.unitType &&
            param0 == -1) {
            this.field_F = true;
            return;
          }
          if (param0 < 0) {
            param0 = 0;
          }
          if (this.field_lb) {
            var4_intLifetime1 = 1;
            if (17 == this.selectedUnit.unitType ||
              7 == this.selectedUnit.unitType) {
              var4_intLifetime1 = 2;
            }
            vl.outgoingPacket.writeCipheredOpcode(32161, 65);
            stackIn_91_0 = vl.outgoingPacket;
            stackIn_91_1 = 1;
            if (var4_intLifetime1 == 2) {
              stackIn_92_2 = 4;
            } else {
              stackIn_92_2 = 3;
            }
            ((CipherPacketBuffer) (Object) stackIn_91_0).writeByte(stackIn_91_1, stackIn_92_2);
            vl.outgoingPacket.writeByte(1, var4_intLifetime1 | 96);
            vl.outgoingPacket.writeByte(1, this.selectedUnit.tileX);
            vl.outgoingPacket.writeByte(1, this.selectedUnit.tileY);
            if (var4_intLifetime1 == 2) {
              vl.outgoingPacket.writeByte(1, param0);
            }
            if ((var6 != 0) &&
              (!this.selectedUnit.movementSpent)) {
              var4_ref = new DeployRequest(this.controlledPlayerId, this.selectedUnit.tileX, this.selectedUnit.tileY, param0).prepareAction(118, this.battlefield);
              if (var4_ref != null) {
                var4_ref.applyToBattlefield(64, this.battlefield);
              }
            }
          } else {
            if (!this.selectedUnit.movementSpent) {
              var4_ref = new DeployRequest(this.controlledPlayerId, this.selectedUnit.tileX, this.selectedUnit.tileY, param0).prepareAction(118, this.battlefield);
              if (var4_ref != null) {
                var4_ref.applyToBattlefield(64, this.battlefield);
              }
            }
          }
          this.a(false, 58, (Unit) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ic.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final void u(int param0) {
        boolean discarded$1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 517) {
            discarded$1 = this.l(true);
          }
          fm.a(e.field_b, 77, 150, 15, -67);
          fe.c(this.c(this.battlefield.playerMana[this.controlledPlayerId], -117), 180, 44, 16777215, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.RD(" + param0 + ')');
        }
    }

    private final void C(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        Unit var4 = null;
        MapTile var5 = null;
        int var6 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.controlledPlayerId < 0) {
            return;
          }
          var2_int = -83 / ((param0 - 8) / 59);
          var3 = 1;
          var4 = (Unit) (this.battlefield.unitsByPlayer[this.controlledPlayerId].first((byte) 113));
          while (var4 != null) {
            var5 = this.battlefield.tiles[var4.tileX + this.battlefield.mapWidth * var4.tileY];
            if (var6 != 0) {
              return;
            }
            boolean decompiledFrameRemainder0 = true;
            stackIn_18_0 = var3;
            if (!var4.movementSpent && (!var4.canCaptureStructures(-21428) ||
              !var5.isStructure(false) ||
              var5.isAlliedToPlayer(this.controlledPlayerId, (byte) 91))) {
              stackIn_21_1 = 0;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_21_1 = 1;
            }
            var3 = stackIn_18_0 & stackIn_21_1;
            var4 = (Unit) (this.battlefield.unitsByPlayer[this.controlledPlayerId].next((byte) 123));
          }
          this.field_jc = var3 != 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.KD(" + param0 + ')');
        }
    }

    private final void q(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          var2_int = this.battlefield.localPlayer;
          if (var2_int == this.battlefield.currentPlayer) {
            if (0 < this.eventPresenters.size(false)) {
              this.field_Pb = true;
              return;
            }
            if (this.field_kc != null && (this.field_kc.removedFromActivePlay ||
              !this.field_kc.c(65280) ||
              this.field_kc.ownerPlayer != var2_int)) {
              this.field_kc = null;
            }
            if (this.field_kc != null) {
              this.field_kc = this.a(-1, var2_int, this.field_kc, false);
            }
            boolean decompiledSharedTail0 = (this.field_kc == null);
            if (!decompiledSharedTail0) {
              this.field_Kb = -1;
              decompiledSharedTail0 = (ArmiesOfGielinor.obfuscationControl);
            }
            if (decompiledSharedTail0) {
              this.field_Kb = this.b(var2_int, this.field_Kb, true);
              if (this.field_Kb == -1) {
                this.field_kc = this.a(-1, var2_int, (Unit) null, true);
              }
            }
            var3 = -1;
            if (this.field_kc != null) {
              var3 = this.a(this.field_kc, (byte) 75);
              if (this.selectedUnit != this.field_kc) {
                this.a(false, param0 - 61, this.field_kc);
                this.field_y = -2;
              }
            }
            if (0 <= this.field_Kb) {
              var3 = this.field_Kb;
              this.field_ec = var3 / this.battlefield.mapWidth;
              this.field_X = var3 % this.battlefield.mapWidth;
              this.a(false, 58, (Unit) null);
              this.field_y = -1;
              this.field_hc = this.battlefield.getSummoningFavourAt(this.field_ec, (byte) 63, this.field_X, this.controlledPlayerId);
            }
            if (var3 < 0) {
              return;
            }
            this.camera.setFocusTile((byte) -127, var3);
          }
          this.field_Pb = true;
          if (param0 != 119) {
            this.field_dc = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.FA(" + param0 + ')');
        }
    }

    final void d(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != 4) {
            return;
          }
          if (this.field_lb) {
            if (this.field_db != 0) {
              throw new RuntimeException((String) null);
            }
            if (~this.controlledPlayerId == ~this.battlefield.currentPlayer) {
              this.field_Tb = true;
              vl.outgoingPacket.writeCipheredOpcode(param1 ^ 32165, 74);
            }
            this.field_db = param0;
            this.field_zb = uk.field_n;
            if (!ArmiesOfGielinor.obfuscationControl) {
              return;
            }
          }
          this.a(16, -126);
          this.field_Tb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ic.QC(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int var5_int = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          stackIn_4_0 = (param1) ? 16777215 : 16711680;
          var5_int = stackIn_4_0;
          SoftwareRaster.h(param3, -40 + param2, 80 + param3, param2, var5_int);
          SoftwareRaster.h(param3, param2 - 40, param3 - 80, param2, var5_int);
          SoftwareRaster.h(param3, 40 + param2, param3 + 80, param2, var5_int);
          SoftwareRaster.h(param3, param0 + param2, -80 + param3, param2, var5_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var5), "ic.AA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void l(byte param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_lb) {
            throw new IllegalStateException();
          }
          if (param0 != 108) {
            return;
          }
          vl.outgoingPacket.writeCipheredOpcode(32161, 68);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.HD(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        this.s(-96);
        if (!this.field_bb) {
          fe.b(ChatMessage.field_o, db.a(true, 320), MatchConditionEntry.a(380, (byte) 94), false);
          fe.c(ChatMessage.field_o, db.a(true, 320), MatchConditionEntry.a(380, (byte) 94), nd.field_b, false);
        }
        int var2_int = 0;
        AnimationSkeleton.field_t.draw(db.a(true, var2_int), MatchConditionEntry.a(0, (byte) 94));
        if (this.battlefield.currentPlayer < 0) {
          return;
        }
        try {
          int var3 = -15 % ((19 - param0) / 42);
          fe.c(this.battlefield.playerNames[this.battlefield.currentPlayer], db.a(true, var2_int + 320), MatchConditionEntry.a(170, (byte) 94), nd.field_b, false);
          this.battlefield.playerCoats[this.battlefield.currentPlayer].a(db.a(true, var2_int + 264), this.battlefield.playerNames[this.battlefield.currentPlayer], false, false, MatchConditionEntry.a(this.battlefield.playerCoats[this.battlefield.currentPlayer].getMissingPartOffset((byte) -62) + 190, (byte) 94), false, false, 74);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.GA(" + param0 + ')');
        }
    }

    final void a(boolean param0, Unit param1) {
        MovementPlanner stackIn_38_0 = null;
        boolean stackIn_39_1 = false;
        int stackIn_52_0 = 0;
        MovementPlanner stackIn_59_0 = null;
        boolean stackIn_60_1 = false;
        Object stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        Unit var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.selectedUnit == null &&
            -2 == this.field_y) {
            var3 = param1;
            if (null == param1) {
              var3 = null;
            }
            if (var3 != null &&
              this.battlefield.localPlayer != ((Unit) (var3)).ownerPlayer) {
              var3 = null;
            }
            if (~this.battlefield.currentPlayer != ~this.battlefield.localPlayer) {
              var3 = null;
            }
            if (!param0) {
              return;
            }
            if (var3 != null &&
              ((Unit) (var3)).movementSpent &&
              ((Unit) (var3)).attacksRemaining == 0) {
              var3 = null;
            }
            if (null != var3 &&
              param1.attacksRemaining > 0) {
              var4 = this.movementPlanner.unit;
              stackIn_38_0 = this.movementPlanner;
              stackIn_39_1 = (null == this.field_oc);
              ((MovementPlanner) (Object) stackIn_38_0).prepareForUnit(stackIn_39_1, 92, this.battlefield.localPlayer, (Unit) (var3), -1, -1);
              var5 = this.movementPlanner.attackTargetMask;
              var6 = 0;
              var7 = 0;
              while (true) {
                boolean decompiledFrameRemainder0 = true;
                if (var5.length > var7) {
                  stackIn_52_0 = var5[var7] & 4;
                  decompiledFrameRemainder0 = (var8 == 0);
                  if (decompiledFrameRemainder0) {
                    if (stackIn_52_0 != 0) {
                      var6 = 1;
                    }
                    if (var6 == 0) {
                      var7++;
                      continue;
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  stackIn_52_0 = var6;
                }
                if (stackIn_52_0 != 0) {
                  break;
                }
                var3 = null;
                if (var4 == null) {
                  break;
                }
                stackIn_59_0 = this.movementPlanner;
                stackIn_60_1 = (this.field_oc == null);
                ((MovementPlanner) (Object) stackIn_59_0).prepareForUnit(stackIn_60_1, 33, this.battlefield.localPlayer, var4, this.movementPlanner.selectionMode, this.movementPlanner.spellId);
                break;
              }
            }
            this.a(false, 58, (Unit) (var3));
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_66_0 = var3;
          stackIn_66_1 = new StringBuilder().append("ic.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) (stackIn_66_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1) {
        TurnTimerDial stackIn_26_0 = null;
        boolean stackIn_27_1 = false;
        MovementPlanner stackIn_104_0 = null;
        boolean stackIn_105_1 = false;
        boolean stackIn_117_0 = false;
        int stackIn_266_0 = 0;
        boolean stackIn_288_1 = false;
        int stackIn_405_0 = 0;
        int stackIn_405_1 = 0;
        int stackIn_415_0 = 0;
        int stackIn_419_1 = 0;
        int stackIn_435_0 = 0;
        int stackIn_439_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        int var4 = 0;
        Unit var4_ref_jd = null;
        SummonEvent var4_ref_mb = null;
        ac var4_ref_ac = null;
        RadialSummonItem var4_ref_jr = null;
        int var5 = 0;
        Unit var6_ref_jd = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RadialSummonItem var4_ref_jrLifetime1;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!this.battlefield.field_Ab) {
            return;
          }
          if (param0 <= 101) {
            return;
          }
          if (this.battlefield.field_o) {
            dj.a((byte) -124);
            return;
          }
          if (this.movementPlanner == null) {
            this.movementPlanner = new MovementPlanner(this.battlefield);
          }
          boolean decompiledFrameRemainder4 = true;
          this.trackCampaignMetrics(true);
          if (this.battlefield.field_X) {
            this.k(true);
            decompiledFrameRemainder4 = (var10 != 0);
          }
          if (decompiledFrameRemainder4) {
            if (this.battlefield.campaignMission == null) {
              stackIn_26_0 = this.turnTimerDial;
              stackIn_27_1 = (this.controlledPlayerId == this.battlefield.currentPlayer);
              ((TurnTimerDial) (Object) stackIn_26_0).advanceSweep(stackIn_27_1, this.remainingTurnTicks, (byte) 124);
            }
            this.i(false);
            this.y(112);
            if (null != this.field_Nb.first((byte) 113)) {
              ((sq) (this.field_Nb.first((byte) 96))).a((byte) 66);
            }
            if (this.field_L > 0) {
              this.field_L = this.field_L - 1;
            }
            this.w(39);
            if (0 < this.field_yb) {
              this.field_yb = this.field_yb - 1;
              if (this.field_yb == 0) {
                this.field_wb = null;
                this.field_S = false;
              }
            }
            if (null != this.battleTutorial) {
              this.battleTutorial.advancePanelAnimation(-68);
            }
            if (!this.battlefield.field_Cb) {
              this.x(98);
            }
          }
          if (param1) {
            this.updateCamera((byte) -42);
            if (!jj.b((byte) -73)) {
              this.b(this.b(true), 123);
              if (null == rd.field_j &&
                SectorCacheStore.field_a == null) {
                return;
              }
            }
          }
          this.field_Q = false;
          this.field_O = false;
          var3 = (EventPresenter) (this.eventPresenters.first((byte) 100));
          scanLoop1: while (true) {
            if (null != var3) {
              ((EventPresenter) (var3)).advanceFrame(-1);
              stackIn_117_0 = ((EventPresenter) (var3)).field_w;
              if (var10 != 0) {
                break scanLoop1;
              }
              if (stackIn_117_0) {
                this.field_Q = true;
              }
              if (this.a((EventPresenter) (var3), false)) {
                this.field_O = true;
              }
              if (((EventPresenter) (var3)).event.eventKind == 24) {
                nk.a((byte) 96);
              }
              if (((EventPresenter) (var3)).event.presentationComplete) {
                ((EventPresenter) (var3)).event.applyToBattlefield(this.battlefield, -26661);
                if (((EventPresenter) (var3)).event.eventKind == 1) {
                  this.e(((CombatEvent) (((EventPresenter) (var3)).event)).battleId, -56);
                  var4 = ((CombatEvent) (((EventPresenter) (var3)).event)).targetDeltaX;
                  var5 = ((CombatEvent) (((EventPresenter) (var3)).event)).targetDeltaY;
                  var6_ref_jd = this.battlefield.getUnitAt(var5, true, var4);
                  this.a(true, var6_ref_jd);
                }
                if (0 == ((EventPresenter) (var3)).event.eventKind) {
                  this.notifyTutorialInteraction(5, this.battlefield.mapWidth * ((EventPresenter) (var3)).event.unit.tileY + ((EventPresenter) (var3)).event.unit.tileX, -112);
                  var4_ref_jd = ((EventPresenter) (var3)).event.unit;
                  this.a(true, var4_ref_jd);
                }
                if (((EventPresenter) (var3)).event.eventKind == 2) {
                  this.a(12, -125);
                }
                if (10 == ((EventPresenter) (var3)).event.eventKind) {
                  this.a(15, -121);
                }
                if (((EventPresenter) (var3)).event.eventKind == 3) {
                  this.a(13, -124);
                }
                this.C(-90);
                if (this.selectedUnit != null) {
                  stackIn_104_0 = this.movementPlanner;
                  stackIn_105_1 = (null == this.field_oc);
                  ((MovementPlanner) (Object) stackIn_104_0).prepareForUnit(stackIn_105_1, 14, this.controlledPlayerId, this.selectedUnit, this.movementPlanner.selectionMode, this.movementPlanner.spellId);
                }
                if (((EventPresenter) (var3)).event.eventKind == 2) {
                  var4_ref_mb = (SummonEvent) (((EventPresenter) (var3)).event);
                  if (~var4_ref_mb.playerId == ~this.controlledPlayerId &&
                    !this.field_z) {
                    this.a(false, 58, this.battlefield.getUnitAt(var4_ref_mb.tileY, true, var4_ref_mb.tileX));
                  }
                }
                ((EventPresenter) (var3)).event = null;
                ((EventPresenter) (var3)).unlink(-124);
              }
              var3 = (EventPresenter) (this.eventPresenters.next((byte) 123));
              if (var10 == 0) {
                continue;
              }
            }
            stackIn_117_0 = this.field_lb;
            break;
          }
          boolean decompiledFrameRemainder3 = true;
          if ((!stackIn_117_0) &&
            (decompiledFrameRemainder3 = (null != this.aiPlanners[this.controlledPlayerId]))) {
            if (this.field_j > 0) {
              this.field_j = this.field_j - 1;
            }
            if ((this.field_j <= 0) &&
              (decompiledFrameRemainder3 = (this.field_V))) {
              this.field_V = false;
              this.field_j = 0;
              mu.field_a = new cg();
              qc.field_j = 0;
              return;
            }
            if (decompiledFrameRemainder3) {
              this.field_Q = true;
            }
          }
          if ((decompiledFrameRemainder3) &&
            (stackIn_117_0 ||
            var10 != 0)) {
            if (0 >= this.field_Sb) {
              if ((!(this.field_j <= 0)) && (50 != this.field_j ||
                !(this.field_Vb < this.battlefield.turnNumber) ||
                this.battlefield.currentPlayer == this.controlledPlayerId)) {
                this.field_j = this.field_j - 1;
                boolean decompiledSharedTail3 = (this.field_j != 0);
                if (!decompiledSharedTail3) {
                  this.j((byte) 109);
                  decompiledSharedTail3 = (var10 != 0);
                }
                if (decompiledSharedTail3) {
                  this.field_Q = true;
                  if (var10 != 0) {
                    this.field_Sb = this.field_Sb - 1;
                    if (this.field_Sb == 0) {
                      mu.field_a = new cg();
                      ma.field_Z = false;
                      qc.field_j = 0;
                    }
                  }
                }
              }
            } else {
              this.field_Sb = this.field_Sb - 1;
              if (this.field_Sb == 0) {
                mu.field_a = new cg();
                ma.field_Z = false;
                qc.field_j = 0;
              }
            }
          }
          var3 = this.battlefield.b(false);
          if (this.field_V) {
            var3 = null;
          }
          scanLoop2: while (true) {
            boolean decompiledFrameRemainder6 = true;
            if (var3 != null) {
              stackIn_405_0 = -1;
              stackIn_405_1 = ~this.field_Ub.size(false);
              if (var10 != 0) {
                break scanLoop2;
              }
              if (stackIn_405_0 == stackIn_405_1 ||
                ((GameEvent) (var3)).eventKind == 9) {
                if ((this.field_Q) &&
                  (decompiledFrameRemainder6 = (this.field_Q)) &&
                  (decompiledFrameRemainder6 = (this.field_O))) {
                  decompiledFrameRemainder6 = !(!this.a(false, (GameEvent) (var3)));
                }
                if (decompiledFrameRemainder6) {
                  boolean decompiledFrameCompleted0 = true;
                  boolean decompiledFrameRemainder2 = true;
                  ((GameEvent) (var3)).unlink(106);
                  if (this.field_r &&
                    9 == ((GameEvent) (var3)).eventKind &&
                    ((ManaEvent) (var3)).playerId == this.controlledPlayerId) {
                    boolean decompiledFrameRemainder5 = true;
                    boolean decompiledFrameCompleted1 = true;
                    var4 = 0;
                    if (3 == ((ManaEvent) (var3)).manaTypeCode) {
                      var5 = ((ManaEvent) (var3)).manaPoints;
                      var6 = 0;
                      var7 = ce.turnDurationTicks[this.battlefield.turnDurationOption] / 50;
                      if (var5 < this.turnTimerDial.sweepPosition / 50) {
                        var6 = -var5 + this.turnTimerDial.sweepPosition / 50;
                      }
                      while (((ManaEvent) (var3)).manaPoints > 0) {
                        var8 = -(int)(Math.sin((double)var4 * 3.141592653589793 * 2.0 / (double)var7) * 40.0);
                        var9 = -(int)(40.0 * Math.cos(3.141592653589793 * (double)var4 * 2.0 / (double)var7));
                        this.field_Ub.addLast((byte) -119, (IntrusiveNode) (new ac(72 + var8, 72 + var9, var8, var9, this.controlledPlayerId, var5 - var4 + var6 >> 1, 1, 3)));
                        ((ManaEvent) (var3)).manaPoints = ((ManaEvent) (var3)).manaPoints - 1;
                        var4++;
                        if (var10 != 0) {
                          decompiledFrameCompleted1 = false;
                          break;
                        }
                        if (var10 == 0) {
                          continue;
                        }
                        break;
                      }
                      if (decompiledFrameCompleted1) {
                        decompiledFrameRemainder5 = (var10 != 0);
                      }
                    }
                    if ((decompiledFrameRemainder5) &&
                      (decompiledFrameCompleted1)) {
                      if (4 != ((ManaEvent) (var3)).manaTypeCode) {
                        scanLoop3: while (true) {
                          if (((ManaEvent) (var3)).manaPoints > 0) {
                            this.field_Ub.addLast((byte) -119, (IntrusiveNode) (new ac(20, -120 + this.f(128, 0) + ((ManaEvent) (var3)).manaTypeCode * 25, 30, 0, this.controlledPlayerId, 10 * ((ManaEvent) (var3)).manaTypeCode + (var4 >> 2), 1, ((ManaEvent) (var3)).manaTypeCode)));
                            ((ManaEvent) (var3)).manaPoints = ((ManaEvent) (var3)).manaPoints - 1;
                            var4++;
                            if (var10 != 0) {
                              break scanLoop3;
                            }
                            if (var10 == 0) {
                              continue;
                            }
                          }
                          this.field_O = true;
                          break;
                        }
                        decompiledFrameRemainder5 = (var10 != 0);
                      }
                      if (decompiledFrameRemainder5) {
                        do {
                          if (((ManaEvent) (var3)).manaPoints <= 0) {
                            break;
                          }
                          this.field_Ub.addLast((byte) -119, (IntrusiveNode) (new ac(AttackEvent.nextBoundedInt(false, 30, vv.field_b) + 115, this.f(128, 0) - (110 - AttackEvent.nextBoundedInt(false, 30, vv.field_b)), 30, 0, this.controlledPlayerId, var4 >> 3, 1, ((ManaEvent) (var3)).manaTypeCode)));
                          var4++;
                          ((ManaEvent) (var3)).manaPoints = ((ManaEvent) (var3)).manaPoints - 1;
                          if (var10 != 0) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                        } while (var10 == 0);
                      }
                    }
                    if (decompiledFrameCompleted0) {
                      decompiledFrameRemainder2 = (var10 != 0);
                    }
                  }
                  if ((decompiledFrameRemainder2) &&
                    (decompiledFrameCompleted0)) {
                    this.field_Q = ((GameEvent) (var3)).a(this.eventPresenters, (byte) -127, this);
                    this.field_O = this.a(false, (GameEvent) (var3));
                    if (l.activeCampaignMission != null && (((GameEvent) (var3)).eventKind == 0 ||
                      ((GameEvent) (var3)).eventKind == 21 ||
                      ((GameEvent) (var3)).eventKind == 27 ||
                      8 == ((GameEvent) (var3)).eventKind)) {
                      var4_ref_jd = ((GameEvent) (var3)).unit;
                      if (var4_ref_jd != null &&
                        var4_ref_jd.ownerPlayer == l.activeCampaignMission.playerSlot) {
                        this.field_a = true;
                      }
                    }
                    boolean decompiledSharedTail2 = (((GameEvent) (var3)).eventKind != 2);
                    if (!decompiledSharedTail2) {
                      da.a((byte) -108, 3);
                      decompiledSharedTail2 = (var10 != 0);
                    }
                    if ((decompiledSharedTail2) &&
                      (((GameEvent) (var3)).eventKind == 3)) {
                      da.a((byte) -98, 4);
                    }
                    if (this.field_Q &&
                      !this.field_O) {
                      stackIn_266_0 = 1;
                    } else {
                      stackIn_266_0 = 0;
                    }
                    var4 = stackIn_266_0;
                    decompiledFrameRemainder6 = (var4 == 0);
                  }
                  if ((decompiledFrameRemainder6) &&
                    (decompiledFrameCompleted0)) {
                    var3 = this.battlefield.b(false);
                  }
                  if ((decompiledFrameRemainder6) &&
                    (var10 == 0)) {
                    continue;
                  }
                }
              }
            }
            var4_ref_ac = (ac) (this.field_Ub.first((byte) 111));
            scanLoop4: while (true) {
              if (var4_ref_ac != null) {
                var4_ref_ac.b(this.battlefield, 100);
                var4_ref_ac = (ac) (this.field_Ub.next((byte) 123));
                if (var10 != 0) {
                  break scanLoop4;
                }
                if (var10 == 0) {
                  continue;
                }
              }
              stackIn_288_1 = (this.field_Q) || !(this.eventPresenters.isEmpty(false)) || !(this.battlefield.pendingEvents.isEmpty(false)) || (this.field_bb);
              this.field_mb = stackIn_288_1;
              this.unitRenderer.refreshUnitModels(this.battlefield.mapWidth, (byte) 98, this.battlefield.mapHeight, this.battlefield.tiles);
              PointerInputHandler.a(4);
              break;
            }
            if (!this.field_K &&
              this.battlefield.kingBlackDragonSummoned &&
              this.unitMenus != null) {
              this.field_K = true;
              var4_ref_jr = this.unitMenus[0].getItemByChoiceId(74, -15050);
              if (var4_ref_jr != null) {
                if (this.battlefield.mapTheme == 2) {
                  var4_ref_jr.choiceId = 81;
                  if (var10 != 0) {
                    var4_ref_jr.choiceId = 4;
                  }
                } else {
                  var4_ref_jr.choiceId = 4;
                }
              }
            }
            if (this.field_K &&
              !this.battlefield.kingBlackDragonSummoned) {
              this.field_K = false;
              var4_ref_jrLifetime1 = this.unitMenus[0].getItemByChoiceId(4, -15050);
              if (var4_ref_jrLifetime1 != null) {
                var4_ref_jrLifetime1.choiceId = 74;
              }
            }
            boolean decompiledFrameRemainder1 = true;
            if (!this.battlefield.field_X) {
              if ((this.field_lb) &&
                (decompiledFrameRemainder1 = !(this.remainingTurnTicks < 1)) &&
                (decompiledFrameRemainder1 = !(this.field_Tb))) {
                this.m((byte) -75);
                decompiledFrameRemainder1 = (this.remainingTurnTicks == 0);
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder1 = (~this.battlefield.currentPlayer == ~this.controlledPlayerId))) {
                  this.r((byte) 80);
                  decompiledFrameRemainder1 = (var10 != 0);
                }
              }
              if (decompiledFrameRemainder1) {
                if (this.battlefield.campaignMission != null) {
                  if (this.battlefield.currentPlayer >= 0 &&
                    this.aiPlanners[this.battlefield.currentPlayer] != null &&
                    !this.field_Q) {
                    var4 = this.aiPlanners[this.battlefield.currentPlayer].h(-5094) ? 1 : 0;
                    if (var4 != 0) {
                      this.r((byte) 125);
                    }
                  }
                } else {
                  if (!this.field_z) {
                    if (!this.field_V &&
                      !this.field_Tb) {
                      this.m((byte) 126);
                      if (this.battlefield.currentPlayer >= 0 &&
                        null != this.aiPlanners[this.battlefield.currentPlayer] &&
                        !this.field_Q) {
                        var4 = this.aiPlanners[this.battlefield.currentPlayer].h(-5094) ? 1 : 0;
                        if (var4 != 0) {
                          this.r((byte) 87);
                        }
                      }
                    }
                    if (this.remainingTurnTicks == 0 &&
                      this.controlledPlayerId == this.battlefield.currentPlayer) {
                      this.r((byte) -66);
                    }
                  }
                }
              }
            }
            boolean decompiledSharedTail1 = (this.field_lb ||
              !(this.battlefield.field_qb) ||
              this.battlefield.field_X);
            if (!decompiledSharedTail1) {
              this.battlefield.updateMatchOutcome(1);
              this.battlefield.applyMatchOutcome(this.battlefield.winnerCount, true, this.battlefield.rankedParticipants);
              this.prepareMatchResults(true);
              decompiledSharedTail1 = (var10 != 0);
            }
            if ((decompiledSharedTail1) && (!this.field_lb &&
              this.field_Sb > 0)) {
              this.field_Sb = this.field_Sb - 1;
              if (this.field_Sb == 0 &&
                null == this.battlefield.campaignMission) {
                mu.field_a = new cg();
                qc.field_j = 0;
              }
            }
            stackIn_405_0 = ~this.field_pb;
            stackIn_405_1 = -3;
            break;
          }
          if (stackIn_405_0 != stackIn_405_1 ||
            this.field_n <= 0) {
            stackIn_415_0 = (this.field_n >= 256) ? 0 : 1;
            if (2 == this.field_pb) {
              stackIn_419_1 = 0;
            } else {
              stackIn_419_1 = 1;
            }
            if ((stackIn_415_0 & stackIn_419_1) != 0) {
              this.field_n = this.field_n + 16;
              if (var10 != 0) {
                this.field_n = this.field_n - 16;
              }
            }
          } else {
            this.field_n = this.field_n - 16;
          }
          if (this.field_pb != 1 ||
            this.field_B <= 0) {
            stackIn_435_0 = (1 == this.field_pb) ? 0 : 1;
            if (this.field_B >= 256) {
              stackIn_439_1 = 0;
            } else {
              stackIn_439_1 = 1;
            }
            if ((stackIn_435_0 & stackIn_439_1) != 0) {
              this.field_B = this.field_B + 16;
              if (var10 != 0) {
                this.field_B = this.field_B - 16;
              }
            }
          } else {
            this.field_B = this.field_B - 16;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_g <= 0) {
            if (this.field_g >= 0) {
              if (this.field_b > 0) {
                this.field_b = this.field_b - 1;
                this.field_Lb = this.field_Lb + 1;
                this.field_g = 45;
                decompiledFrameRemainder0 = (var10 != 0);
              }
              if ((decompiledFrameRemainder0) &&
                (this.field_b < 0)) {
                this.field_Lb = this.field_Lb - 1;
                this.field_b = this.field_b + 1;
                this.field_g = -45;
                if (var10 != 0) {
                  this.field_g = this.field_g + 5;
                  if (var10 != 0) {
                    this.field_g = this.field_g - 5;
                  }
                }
              }
            } else {
              this.field_g = this.field_g + 5;
              if (var10 != 0) {
                this.field_g = this.field_g - 5;
              }
            }
          } else {
            this.field_g = this.field_g - 5;
          }
          if (this.field_lb) {
            kp.field_k = bn.field_d;
            if (!ma.field_Z) {
              boolean decompiledSharedTail0 = !(s.field_d > 1);
              if (!decompiledSharedTail0) {
                kp.field_k = fo.a(4800, MovementPlanner.field_s, new String[]{Integer.toString(s.field_d)});
                decompiledSharedTail0 = (var10 != 0);
              }
              if (decompiledSharedTail0) {
                if (1 == s.field_d) {
                  kp.field_k = CacheEntry.field_y;
                  if (var10 != 0) {
                    kp.field_k = lw.field_pb;
                  }
                } else {
                  kp.field_k = lw.field_pb;
                }
              }
            }
            en.field_E.a(kp.field_k);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) (var3), "ic.PD(" + param0 + ',' + param1 + ')');
        }
    }

    final void A(int param0) {
        NodeDeque[] var2 = null;
        int var3 = 0;
        NodeDeque var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.eventPresenters.clear(param0 ^ 7);
          this.camera.followEventPresenters((byte) 118, this.eventPresenters);
          this.battleTutorial = null;
          this.eventPresenters = null;
          this.camera = null;
          this.unitRenderer = null;
          this.unitRenderer = null;
          cu.field_b = null;
          ro.modelProjectionCamera = null;
          ef.b(param0 ^ -112);
          if (param0 != 111) {
            this.field_hb = 66;
          }
          this.battlefield.tiles = null;
          this.battlefield.lineOfSightGrid = null;
          var2 = this.battlefield.unitsByPlayer;
          var3 = 0;
          while (var2.length > var3) {
            var4 = var2[var3];
            var4.clear(param0 ^ 61);
            var3++;
            if (var5 != 0) {
              return;
            }
          }
          this.aiPlanners = null;
          this.battlefield.teams = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "ic.O(" + param0 + ')');
        }
    }

    private final void m(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 > this.battlefield.currentPlayer) {
            return;
          }
          this.remainingTurnTicks = this.remainingTurnTicks - 1;
          var2_int = -58 % ((param0 - 85) / 39);
          if (this.remainingTurnTicks <= 500 &&
            this.remainingTurnTicks % 50 == 0) {
            RadialSummonMenu.$cfr$intArgs$a$6d836999ad61(76, ClientUiNode.field_v[16]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.SC(" + param0 + ')');
        }
    }

    private final void h(int param0) {
        int stackIn_32_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        boolean stackIn_39_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        try {
          if (this.battlefield.campaignMission == null) {
            this.turnTimerDial.draw(15, 15, (byte) 121);
            if (this.field_ac) {
              TrianglePulse.field_d.d(0, 0, 134, 134, (int)(64.0 * Math.sin((double)uk.field_n / 3.141592653589793 / 2.0) + 128.0));
            }
          }
          if (this.controlledPlayerId > -1) {
            if (!this.battlefield.field_X &&
              ~this.battlefield.currentPlayer == ~this.controlledPlayerId &&
              !this.field_bc &&
              this.eventPresenters.size(false) == 0 &&
              this.field_j == 0 &&
              this.field_Ub.isEmpty(false) &&
              !this.field_bb) {
              stackIn_32_0 = 1;
            } else {
              stackIn_32_0 = 0;
            }
            var2_int = stackIn_32_0;
            var3 = vt.a(67, en.field_E, this.field_Fb, bu.field_c, GrowthEvent.field_I, -128) ? 1 : 0;
            stackIn_38_0 = 6684672;
            stackIn_38_1 = -116;
            stackIn_39_2 = (var3 != 0) && (var2_int != 0);
            ip.a(stackIn_38_0, stackIn_38_1, stackIn_39_2, this.n((byte) 95), en.field_E, bu.field_c, 67, GrowthEvent.field_I, this.field_Fb);
            if (this.field_jc &&
              var2_int != 0) {
              TrianglePulse.field_d.d(0, -12 + this.field_Fb, 134, 50, (int)(128.0 + Math.sin((double)uk.field_n / 3.141592653589793 / 2.0) * 64.0));
            }
            MoveAttackAction.a(this.field_Fb, IsaacRandom.field_a, en.field_E, GrowthEvent.field_I, this.n((byte) -69), 67, param0 ^ -25);
          }
          if (param0 != 82) {
            return;
          }
          if (this.battlefield.mapSizeSetting != 4) {
            DropdownSelector.field_M.g(110, 10);
            if (TabbedPanel.a(29, 129, 19, false)) {
              DropdownSelector.field_M.f(110, 10, 128);
            }
            LineOfSightGrid.field_g.g(110, 10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.AB(" + param0 + ')');
        }
    }

    private final int b(int param0, int param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        MapTile var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (0 > param1) {
            stackIn_5_0 = 0;
          } else {
            stackIn_5_0 = param1 + 1;
          }
          var4_int = stackIn_5_0;
          if (!param2) {
            stackIn_7_0 = -87;
            return stackIn_7_0;
          }
          var5 = var4_int;
          while (var5 < this.battlefield.tiles.length) {
            var6 = this.battlefield.tiles[var5];
            if ((var6 != null ||
              var7 != 0) && (var6.terrainType == 7 &&
              ~var6.ownerPlayer == ~param0)) {
              stackIn_21_0 = var5;
              return stackIn_21_0;
            }
            var5++;
            if (var7 == 0) {
              continue;
            }
            break;
          }
          stackIn_24_0 = -1;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4), "ic.QD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = param3;
          var6 = param0;
          param3 = 75;
          wc.field_J.d(var5_int - 73, var6 - 73, TutorialLayout.field_g[bw.unitDefinitions[param1][1] + 1]);
          param0 = 75;
          fe.a(var5_int - 50, -46 + var6, 100, 30, jh.field_l, 128);
          fe.a(-50 + var5_int, var6 + 1, 100, 15, jh.field_l, 128);
          fe.a(var5_int - 50, var6 + 18, 100, 15, jh.field_l, 128);
          fe.a(-50 + var5_int, 35 + var6, 100, 15, jh.field_l, 128);
          SpellConfirmationDialog.field_j.b();
          SoftwareRaster.b();
          en.field_E.a(ScrollContainer.unitDisplayNames[param1].toUpperCase(), -47 + param3, param0 - 48, 94, 30, 16763904, -1, 1, 1, 0);
          en.field_E.b(UiSelectionState.field_d, param3 - 45, -4 + param0, 16777215, -1);
          var7 = (int)(Math.sin((double)uk.field_n / 3.141592653589793 / 2.0) * 64.0 + 128.0);
          var7 = var7 << 16 | 65283 & var7 << 6;
          stackIn_4_0 = bw.unitDefinitions[param1][2];
          if (param2 > bw.unitDefinitions[param1][1]) {
            stackIn_5_1 = this.field_hc[6];
          } else {
            stackIn_5_1 = this.field_hc[bw.unitDefinitions[param1][1]];
          }
          stackIn_9_0 = (stackIn_4_0 <= stackIn_5_1) ? 0 : 1;
          var8 = stackIn_9_0;
          stackIn_13_0 = (bw.unitDefinitions[param1][8] <= this.battlefield.playerMana[this.controlledPlayerId]) ? 0 : 1;
          var9 = stackIn_13_0;
          if (var8 != 0) {
            en.field_E.b(Integer.toString(bw.unitDefinitions[param1][2]), -13 + param3, param0 - 4, var7, -1);
          }
          if (var8 == 0 ||
            var11 != 0) {
            en.field_E.b(Integer.toString(bw.unitDefinitions[param1][2]), -13 + param3, -4 + param0, 7864064, -1);
          }
          en.field_E.a(bt.field_d, 45 + param3, param0 - 4, 16777215, -1);
          if (var9 == 0) {
            en.field_E.a(Integer.toString(bw.unitDefinitions[param1][8]), 28 + param3, -4 + param0, 7864064, -1);
          }
          if (var9 != 0 ||
            var11 != 0) {
            en.field_E.a(Integer.toString(bw.unitDefinitions[param1][8]), 28 + param3, param0 - 4, var7, -1);
          }
          en.field_E.b(mk.field_i, param3 - 45, param0 + 12, 16777215, -1);
          en.field_E.b(lq.field_a, param3 - 45, 29 + param0, 16777215, -1);
          en.field_E.b(vk.field_d, -45 + param3, param0 + 46, 16777215, -1);
          en.field_E.a(Integer.toString(bw.unitDefinitions[param1][4] + this.battlefield.a((byte) 11, bw.unitDefinitions[param1][1], this.controlledPlayerId)), param3 + 45, 12 + param0, 16763904, -1);
          en.field_E.a(Integer.toString(bw.unitDefinitions[param1][3]), param3 + 45, param0 + 29, 16763904, -1);
          if (34 != param1) {
            if (bw.unitDefinitions[param1][6] != bw.unitDefinitions[param1][7]) {
              en.field_E.a(fo.a(4800, td.field_a, new String[]{Integer.toString(bw.unitDefinitions[param1][6]), Integer.toString(bw.unitDefinitions[param1][7])}), 45 + param3, param0 + 46, 16763904, -1);
              if (var11 != 0) {
                en.field_E.a(Integer.toString(bw.unitDefinitions[param1][6]), param3 + 45, 46 + param0, 16763904, -1);
                en.field_E.a(fo.a(param2 ^ 4800, AiPlanningStrategy.field_e, new String[]{Integer.toString(bw.unitDefinitions[param1][6]), Integer.toString(bw.unitDefinitions[75][6]), Integer.toString(bw.unitDefinitions[75][7])}), param3 + 45, 46 + param0, 16763904, -1);
              }
            } else {
              en.field_E.a(Integer.toString(bw.unitDefinitions[param1][6]), param3 + 45, 46 + param0, 16763904, -1);
              if (var11 != 0) {
                en.field_E.a(fo.a(param2 ^ 4800, AiPlanningStrategy.field_e, new String[]{Integer.toString(bw.unitDefinitions[param1][6]), Integer.toString(bw.unitDefinitions[75][6]), Integer.toString(bw.unitDefinitions[75][7])}), param3 + 45, 46 + param0, 16763904, -1);
              }
            }
          } else {
            en.field_E.a(fo.a(param2 ^ 4800, AiPlanningStrategy.field_e, new String[]{Integer.toString(bw.unitDefinitions[param1][6]), Integer.toString(bw.unitDefinitions[75][6]), Integer.toString(bw.unitDefinitions[75][7])}), param3 + 45, 46 + param0, 16763904, -1);
          }
          so.field_b.a(5605);
          SpellConfirmationDialog.field_j.g(1);
          SpellConfirmationDialog.field_j.g(-75 + var5_int, -75 + var6);
          if (var8 == 0 &&
            var9 == 0) {
            pg.field_c.g(-78 + var5_int, -78 + var6);
          }
          if (var8 != 0 ||
            var9 != 0 || var11 != 0) {
            pg.field_c.g(var5_int - 78, var6 - 78, 10);
          }
          ro.field_rb[bw.unitDefinitions[param1][0]].draw(var5_int - 8, var6 - 71);
          if (null != bh.field_M[param1]) {
            var10 = en.field_E.getParagraphHeight(bh.field_M[param1], 220, 0);
            fe.b(-120 + var5_int, 130 + var6, 240, 20 + var10, io.field_m, TutorialController.field_e, 0, 192);
            en.field_E.a(bh.field_M[param1], var5_int - 110, 140 + var6, 220, 100, 16777215, -1, 1, 0, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.VA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void i(byte param0) {
        RuntimeException runtimeException = null;
        UnitInfoPopup var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != -69) {
            return;
          }
          var2 = (UnitInfoPopup) (this.field_o.first((byte) 91));
          while (var2 != null) {
            var2.a(this.selectedUnit, this.controlledPlayerId, param0 + 74, this.camera.currentPosition[0], this.camera.currentPosition[1], this.battlefield);
            var2 = (UnitInfoPopup) (this.field_o.next((byte) 123));
            if (var3 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.KB(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        PreparedAction var5 = null;
        try {
          if (this.field_mb) {
            return;
          }
          if (~this.controlledPlayerId != ~this.battlefield.currentPlayer) {
            return;
          }
          if (this.remainingTurnTicks <= 0) {
            return;
          }
          var4_int = this.battlefield.getSummonFailureFlags(this.controlledPlayerId, param1 + 190, param0, this.field_ec, this.field_X);
          if (var4_int > 0) {
            this.a(param2, TeamRoster.field_c[var4_int], (byte) -124);
            return;
          }
          RadialSummonMenu.$cfr$intArgs$a$6d836999ad61(109, ClientUiNode.field_v[12]);
          boolean decompiledSharedTail0 = !(this.field_lb);
          if (!decompiledSharedTail0) {
            vl.outgoingPacket.writeCipheredOpcode(32161, 65);
            vl.outgoingPacket.writeByte(1, 4);
            vl.outgoingPacket.writeByte(param1 - 64, 32);
            vl.outgoingPacket.writeByte(param1 ^ 64, param0);
            vl.outgoingPacket.writeByte(1, this.field_X);
            vl.outgoingPacket.writeByte(param1 - 64, this.field_ec);
            decompiledSharedTail0 = (ArmiesOfGielinor.obfuscationControl);
          }
          if (decompiledSharedTail0) {
            var5 = new SummonRequest(this.controlledPlayerId, this.field_X, this.field_ec, param0).prepareAction(param1 ^ 27, this.battlefield);
            if (var5 != null) {
              var5.applyToBattlefield(64, this.battlefield);
            }
          }
          if (param1 != 65) {
            field_J = 59;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4), "ic.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final String i(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.battlefield.e(-124, this.controlledPlayerId, param0);
          var4 = -60 % ((param1 + 52) / 49);
          if (var3_int > 0) {
            stackIn_4_0 = fo.a(4800, kv.field_I, new String[]{Integer.toString(var3_int - (-this.battlefield.playerTurnCounts[this.controlledPlayerId] - 1))});
            return stackIn_4_0;
          }
          if (this.battlefield.runeCapOption != 4 &&
            this.battlefield.remainingRuneCap[this.controlledPlayerId] < uc.spellDefinitions[param0][0]) {
            stackIn_10_0 = fo.a(4800, MovementPlanner.field_v, new String[]{Integer.toString(this.battlefield.remainingRuneCap[this.controlledPlayerId]), Integer.toString(uc.spellDefinitions[param0][0])});
            return stackIn_10_0;
          }
          stackIn_12_0 = null;
          return (String) (stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ic.WA(" + param0 + ',' + param1 + ')');
        }
    }

    private final Unit a(int param0, int param1, Unit param2, boolean param3) {
        NodeIterator var5 = null;
        RuntimeException var5_ref = null;
        Unit var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        Unit stackIn_26_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_35_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (~param1 > param0) {
            stackIn_3_0 = null;
            return (Unit) (stackIn_3_0);
          }
          if (null != param2 && (param2.removedFromActivePlay ||
            !param2.c(param0 + 65281))) {
            param2 = null;
          }
          var5 = new NodeIterator(this.battlefield.unitsByPlayer[param1]);
          if (param3) {
            var6 = (Unit) (var5.first(50));
          }
          if (!param3 ||
            var7 != 0) {
            var6 = (Unit) (var5.startForwardAt(param2, true));
          }
          while (null != var6) {
            if (var6 != param2 &&
              param1 == var6.ownerPlayer &&
              !var6.removedFromActivePlay) {
              stackIn_26_0 = var6;
              return stackIn_26_0;
            }
            if (param3 &&
              param2 == var6) {
              stackIn_32_0 = null;
              return (Unit) (stackIn_32_0);
            }
            var6 = (Unit) (var5.next(param0 ^ -51));
            if (var7 == 0) {
              continue;
            }
            break;
          }
          stackIn_35_0 = null;
          return (Unit) (stackIn_35_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_39_0 = var5_ref;
          stackIn_39_1 = new StringBuilder().append("ic.LC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int stackIn_7_0 = 0;
        int[] stackIn_11_0 = null;
        CoatOfArms stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        int[][] stackIn_24_2 = null;
        int stackIn_25_3 = 0;
        int stackIn_28_2;
        int stackIn_28_3;
        boolean stackIn_29_4 = false;
        int stackIn_32_5;
        String stackIn_32_6;
        boolean stackIn_32_7;
        boolean stackIn_33_8 = false;
        boolean stackIn_37_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        int[] var8 = null;
        int var9 = 0;
        try {
          if (2 == param1) {
            this.a(127, 200, (byte) -40, param2, param3);
            return;
          }
          stackIn_7_0 = (param1 <= 3) ? 70 : 0;
          var5_int = stackIn_7_0;
          var6 = this.battlefield.rankedParticipants[param3];
          var7 = this.battlefield.playerNames[var6].toUpperCase();
          if (~this.field_Rb != ~param3) {
            stackIn_11_0 = nd.field_b;
          } else {
            stackIn_11_0 = TutorialController.field_e;
          }
          var8 = stackIn_11_0;
          fe.b(db.a(true, 181), MatchConditionEntry.a(var5_int + 57, (byte) 94), 184, 111, io.field_m, var8, 0, 180);
          if (param2 > -1) {
            fe.b(ph.field_b[param2], db.a(true, 240), MatchConditionEntry.a(75 + var5_int, (byte) 94), true);
            fe.c(ph.field_b[param2], db.a(true, 240), MatchConditionEntry.a(var5_int + 75, (byte) 94), nd.field_b, true);
          }
          if (param2 <= -1 ||
            ArmiesOfGielinor.obfuscationControl) {
            fe.b(DualNodeIterator.field_g, db.a(true, 240), MatchConditionEntry.a(var5_int + 75, (byte) 94), true);
            fe.c(DualNodeIterator.field_g, db.a(true, 240), MatchConditionEntry.a(75 + var5_int, (byte) 94), nd.field_b, true);
          }
          var9 = -26 % ((-25 - param0) / 49);
          stackIn_20_0 = this.battlefield.playerCoats[var6];
          stackIn_21_1 = ((this.battlefield.eliminatedPlayerMask & 1 << var6) != 0);
          stackIn_24_2 = op.field_c;
          if (!this.battlefield.teamGame) {
            stackIn_25_3 = 0;
          } else {
            stackIn_25_3 = 1;
          }
          stackIn_28_2 = stackIn_24_2[stackIn_25_3][var6];
          stackIn_28_3 = MatchConditionEntry.a(78 + var5_int, (byte) 94);
          stackIn_29_4 = !((this.battlefield.field_C & 1 << var6) <= 0);
          stackIn_32_5 = db.a(true, 200);
          stackIn_32_6 = var7;
          stackIn_32_7 = true;
          stackIn_33_8 = (0 != (1 << var6 & this.battlefield.inactivePlayerMask));
          ((CoatOfArms) (Object) stackIn_20_0).a(stackIn_21_1, stackIn_28_2, stackIn_28_3, stackIn_29_4, stackIn_32_5, stackIn_32_6, stackIn_32_7, stackIn_33_8, false, -19744);
          en.field_E.c(var7, db.a(true, 310), MatchConditionEntry.a(var5_int + 74, (byte) 94), 16777215, -1);
          this.b(var6, 285, 78 + var5_int, -12857);
          stackIn_37_1 = (~this.field_Rb == ~param3);
          this.a(stackIn_37_1, var6, (byte) -112, db.a(true, 280), MatchConditionEntry.a(var5_int + 137, (byte) 94));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var5), "ic.PC(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean a(boolean param0) {
        boolean stackIn_25_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!param0) {
            this.field_L = 117;
          }
          stackIn_25_0 = (!this.battlefield.field_X) && (~this.controlledPlayerId == ~this.battlefield.currentPlayer) && (!this.field_bc) && (this.eventPresenters.size(false) == 0) && (this.field_j == 0) && (this.field_Ub.isEmpty(false)) && (!this.field_bb);
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.PA(" + param0 + ')');
        }
    }

    private final void e(int param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_Wb = new RgbSprite[this.battlefield.playerCoats.length];
          if (param0 != 16) {
            this.field_Ub = (NodeDeque) null;
          }
          var2_int = 0;
          while (var2_int < this.battlefield.playerCoats.length) {
            this.field_Wb[var2_int] = this.battlefield.playerCoats[var2_int].a(this.battlefield.e(var2_int, -1), (byte) -70, this.battlefield.teamGame);
            var2_int++;
            if (var3 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.DC(" + param0 + ')');
        }
    }

    private final boolean t(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var6Lifetime1;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var2_int = 2;
          var3 = 1;
          var4 = 0;
          var5 = 0;
          this.field_Pb = false;
          this.field_Xb = false;
          var6 = this.battlefield.mapSizeSetting;
          if ((0 != var6) &&
            (decompiledFrameRemainder0 = (var6 != 1)) &&
            (decompiledFrameRemainder1 = (var6 != 2 ||
            var10 != 0)) &&
            (decompiledFrameRemainder3 = (var6 == 3))) {
            decompiledFrameRemainder2 = (var10 != 0);
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            var2_int = 8;
            var5 = 20;
            var3 = 4;
            var4 = 15;
            decompiledFrameRemainder3 = (var10 != 0);
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            var5 = 20;
            var3 = 3;
            var2_int = 6;
            var4 = -5;
            decompiledFrameRemainder3 = (var10 != 0);
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            var5 = 20;
            var3 = 2;
            var2_int = 4;
            var4 = 10;
            decompiledFrameRemainder3 = (var10 != 0);
          }
          if (decompiledFrameRemainder3) {
            var3 = 2;
            var2_int = 3;
            var4 = -10;
            var5 = 20;
          }
          if (!db.a(217 - this.battlefield.mapWidth * var3 + var5 + var3 * 2 * this.battlefield.mapWidth, param0 - (this.battlefield.mapWidth * var3 - var5), this.battlefield.mapWidth * (2 * var2_int) + (-450 + 2 * this.field_H) + var4, 1661761121, 2 * (-225 + this.field_H) + var4)) {
            return false;
          }
          var6Lifetime1 = -var5 + this.battlefield.mapWidth * var3 - (217 - ko.pointerY);
          var7 = -var4 + (-(2 * (this.field_H - 225)) + AiPlanningStrategy.pointerX);
          var8 = var7 * 40 / var2_int;
          var9 = 20 * var6Lifetime1 / var3;
          this.camera.setWorldPosition(var8, var9, (byte) 68);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.JA(" + param0 + ')');
        }
    }

    private final int g(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 2) {
            this.k(1);
          }
          stackIn_4_0 = -50 + SoftwareRaster.width / 2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.EB(" + param0 + ')');
        }
    }

    private final void e(boolean param0) {
        int stackIn_5_0 = 0;
        Object stackIn_9_0;
        Object stackIn_11_0;
        int stackIn_11_1;
        int stackIn_11_2;
        int stackIn_11_3;
        int stackIn_12_4 = 0;
        Object stackIn_15_0;
        int stackIn_15_1;
        int stackIn_15_2;
        int stackIn_15_3;
        Object stackIn_16_0;
        int stackIn_16_4;
        int stackIn_29_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_45_2 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_53_3 = 0;
        Object stackIn_65_0;
        int stackIn_65_1;
        int stackIn_65_2;
        int stackIn_65_3;
        int stackIn_66_4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException var5_ref_RuntimeException = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = this.battlefield.playerCount;
          SoftwareRaster.b();
          jg.field_m.f(db.a(true, 0), MatchConditionEntry.a(0, (byte) 94));
          fe.b(db.a(param0, 15), MatchConditionEntry.a(33, (byte) 94), 610, 414, io.field_m, nd.field_b, 0, 180);
          fe.b(l.field_g, db.a(true, 320), MatchConditionEntry.a(35, (byte) 94));
          fe.c(l.field_g, db.a(true, 320), MatchConditionEntry.a(35, (byte) 94), nd.field_b, false);
          var3 = this.battlefield.winnerCount;
          stackIn_5_0 = (null == this.battlefield.campaignMission) ? 0 : 1;
          var4 = stackIn_5_0;
          if (this.battlefield.teamGame) {
            stackIn_11_0 = this;
            stackIn_11_1 = this.battlefield.rankedParticipants[0];
            stackIn_11_2 = 57;
            stackIn_11_3 = 18;
            if (1 == var3) {
              stackIn_12_4 = 0;
            } else {
              stackIn_9_0 = this;
              stackIn_12_4 = -1;
            }
            this.b(stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_12_4, 41);
            stackIn_15_0 = this;
            stackIn_15_1 = this.battlefield.rankedParticipants[1];
            stackIn_15_2 = 237;
            stackIn_15_3 = 18;
            if (1 == var3) {
              stackIn_16_0 = this;
              stackIn_16_4 = 1;
            } else {
              stackIn_16_0 = this;
              stackIn_16_4 = -1;
            }
            this.b(stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_16_4, 41);
            try {
              if (var4 == 0) {
                this.a(390, 3, 117);
              }
              if (var4 != 0 ||
                var6 != 0) {
                this.a(117, 390, this.battlefield.field_kb, 0);
              }
              decompiledRegionSelector0 = 0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5_ref_RuntimeException = decompiledCaughtException;
              if (var6 == 0) {
                decompiledRegionSelector0 = 0;
              } else {
                decompiledRegionSelector0 = 1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            }
          }
          stackIn_29_0 = (3 < var2_int) ? 0 : 70;
          var5 = stackIn_29_0;
          if (0 == var3) {
            var3 = this.battlefield.playerCount;
          }
          var3 -= 4;
          if (var4 != 0) {
            var3 = -1;
          }
          this.b(var3, (byte) 111, var2_int);
          if (var4 == 0) {
            var3++;
          }
          stackIn_44_1 = 181;
          if (var3 <= -1) {
            stackIn_45_2 = -var3;
          } else {
            stackIn_45_2 = -1;
          }
          this.a(stackIn_44_1, stackIn_45_2, -20777, var5 + 174, var2_int);
          if (var4 == 0) {
            var3++;
          }
          stackIn_52_1 = 117;
          stackIn_52_2 = var2_int;
          if (var3 <= -1) {
            stackIn_53_3 = 1;
          } else {
            stackIn_53_3 = -1;
          }
          this.a(stackIn_52_1, stackIn_52_2, stackIn_53_3, 1);
          if (var4 != 0) {
            var3 = 0;
          }
          if (var4 == 0 ||
            var6 != 0) {
            var3++;
          }
          stackIn_65_0 = this;
          stackIn_65_1 = var5 + 57;
          stackIn_65_2 = 41;
          stackIn_65_3 = -40;
          if (0 != var3) {
            stackIn_66_4 = -1;
          } else {
            stackIn_66_4 = 0;
          }
          this.a(stackIn_65_1, stackIn_65_2, (byte) stackIn_65_3, stackIn_66_4, 0);
          if (var4 == 0) {
            this.b(var5 + 57, 371, -29607);
            if (var6 == 0) {
              return;
            }
          }
          this.a(var5 + 57, 371, this.battlefield.field_kb, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.OC(" + param0 + ')');
        }
    }

    private final void a(boolean param0, String param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -117) {
            return;
          }
          RadialSummonMenu.$cfr$intArgs$a$6d836999ad61(109, ClientUiNode.field_v[5]);
          this.field_S = param0;
          this.field_yb = 50;
          this.field_wb = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("ic.MD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void z(int param0) {
        int stackIn_19_0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (0 != this.battlefield.runeCapOption ||
            256 > this.field_B) {
            var2_int = 0;
            while (var2_int < 5) {
              var3 = this.battlefield.equippedSpellIds[this.controlledPlayerId][var2_int];
              stackIn_54_0 = var3;
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_54_0 >= 0 &&
                this.i(var3, 19) == null) {
                stackIn_19_0 = 0;
              } else {
                stackIn_19_0 = 1;
              }
              var4 = stackIn_19_0;
              var5 = 64 - (this.field_B >> 2);
              var6 = 130 + (int)(Math.sin((double)var2_int * 3.141592653589793 / 4.0) * (double)var5);
              var7 = (int)((double)(-var5) * Math.cos((double)var2_int * 3.141592653589793 / 4.0)) + (this.o(127) - 95);
              if (var3 <= -1) {
                SoftwareRaster.a(var6, var7, 20, 0, 128);
              } else {
                if (this.field_nc == var2_int) {
                  TeamRoster.field_e.d(var6 - 30, var7 - 30, 60, 60, 256);
                }
                var8 = uc.spellDefinitions[var3][2];
                if (var8 < BattleCharacter.field_h.length) {
                  if (var4 != 0) {
                    BattleCharacter.field_h[var8].g(var6 - 19, -20 + var7, 128);
                  } else {
                    BattleCharacter.field_h[var8].g(-19 + var6, var7 - 20);
                  }
                }
              }
              if (var4 != 0) {
                km.field_h[0].g(-23 + var6, -23 + var7, 128);
              } else if (~var2_int != ~this.field_nc) {
                km.field_h[0].g(-23 + var6, var7 - 23);
              } else {
                km.field_h[1].g(var6 - 23, var7 - 23);
              }
              if (~var2_int == ~this.field_Jb) {
                TrianglePulse.field_d.d(-35 + var6, var7 - 35, 70, 70, (int)(128.0 + 64.0 * Math.sin((double)uk.field_n / 3.141592653589793 / 2.0)));
              }
              var2_int++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_54_0 = param0;
          }
          if (stackIn_54_0 != -5) {
            return;
          }
          if (this.battlefield.runeCapOption == 0 &&
            !this.field_P) {
            return;
          }
          BattleCharacter.field_h[170].g(111, -20 + (-95 + this.o(125)));
          km.field_h[1].g(107, -118 + this.o(param0 + 132));
          if (this.field_Jb == 255) {
            TrianglePulse.field_d.d(95, -95 + this.o(125) - 35, 70, 70, (int)(128.0 + 64.0 * Math.sin((double)uk.field_n / 3.141592653589793 / 2.0)));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.UD(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1, Unit param2) {
        MovementPlanner stackIn_38_0 = null;
        boolean stackIn_39_1 = false;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        AiPlanner var4_ref = null;
        RuntimeException var4_ref2 = null;
        int var5 = 0;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_i = this.field_fb;
          this.field_W = this.selectedUnit;
          this.field_ab = this.field_h;
          if (param1 != 58) {
            this.field_d = (um) null;
          }
          this.field_lc = false;
          this.field_h = -1;
          boolean decompiledSharedTail1 = (param2 == this.selectedUnit &&
            null != param2);
          if (!decompiledSharedTail1) {
            this.selectedUnit = param2;
            decompiledSharedTail1 = (var5 != 0);
          }
          if (decompiledSharedTail1) {
            this.selectedUnit.resetMovementTarget(-1);
            this.a(param2.tileY * this.battlefield.mapWidth + param2.tileX, true, (byte) 99);
          }
          this.field_qb = 0;
          this.field_D = false;
          this.field_fb = 0;
          if (null != this.selectedUnit) {
            var4 = this.selectedUnit.q((byte) 117);
            this.field_mc = (nr.field_e.a(var4) >> 1) - 210;
            if (this.field_mc < 0) {
              this.field_mc = 0;
            }
            this.field_c = 200;
            this.field_mc = this.field_mc << 1;
          }
          this.field_m = false;
          this.field_F = false;
          boolean decompiledSharedTail0 = (null != this.selectedUnit);
          if (!decompiledSharedTail0) {
            if (this.movementPlanner.spellId > -1) {
              this.notifyTutorialInteraction(25, -1, -101);
            }
            this.movementPlanner.clearSelection(-54);
            decompiledSharedTail0 = (var5 != 0);
          }
          if (decompiledSharedTail0) {
            if (2 == mu.field_f &&
              this.aiPlanners[this.selectedUnit.ownerPlayer] != null) {
              var4_ref = this.aiPlanners[this.selectedUnit.ownerPlayer];
              var4_ref.c(this.selectedUnit, (byte) -55);
            }
            stackIn_38_0 = this.movementPlanner;
            stackIn_39_1 = (this.field_oc == null);
            ((MovementPlanner) (Object) stackIn_38_0).prepareForUnit(stackIn_39_1, 80, this.controlledPlayerId, this.selectedUnit, -1, -1);
          }
          if (param0) {
            da.a((byte) -112, 0);
          }
          if (null != this.selectedUnit) {
            this.a(4, -116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = decompiledCaughtException;
          stackIn_51_0 = var4_ref2;
          stackIn_51_1 = new StringBuilder().append("ic.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        int stackIn_26_0 = 0;
        int stackIn_33_0 = 0;
        int[] stackIn_37_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          fe.b(param0, param2, 223, 228, io.field_m, TutorialController.field_e, 0, 180);
          var4_int = this.field_Rb;
          var5 = this.battlefield.playerNames[var4_int];
          var5 = BitmapFont.a(nr.field_e, var5, 400);
          if (null == pc.field_j) {
            var6 = 0;
            if (this.field_lb &&
              this.battlefield.field_G != null &&
              0 <= var4_int &&
              this.battlefield.field_G.length > var4_int) {
              var6 = this.battlefield.field_G[var4_int];
            }
            var7_int = eb.a((byte) -103, var6);
            var8 = 0;
            var9 = var7_int * 19 + var8;
            if (var9 < 192) {
              var9 = 192;
            }
            pc.field_j = new RgbSprite(217, var9);
            pc.field_j.b();
            SoftwareRaster.f(0, 0, SoftwareRaster.width, SoftwareRaster.height, 1776150);
            var10 = 0;
            while (var10 < 16) {
              stackIn_33_0 = 1 << var10 & var6;
              if (var13 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              stackIn_26_0 = (stackIn_33_0 == 0) ? 0 : 1;
              var11 = stackIn_26_0;
              if (var11 != 0) {
                var8 += 19;
                en.field_E.c(du.field_g[var10], 109, var8, 16777215, -1);
                var12 = 3 + (en.field_E.a(du.field_g[var10]) >> 1);
                AttackEvent.field_O.f(109 - var12 - AttackEvent.field_O.pixelWidth, var8 - 10);
                AttackEvent.field_O.f(109 + var12, -10 + var8);
              }
              var10++;
            }
            if (decompiledFrameCompleted0) {
              so.field_b.a(param1 + 5602);
            }
          }
          if (decompiledFrameCompleted0) {
            SoftwareRaster.setClip(4 + param0, param2 + 33, param0 + 4 + 217, param2 + 33 + 192);
            var6Lifetime1 = -(uk.field_n / param1) % pc.field_j.pixelHeight;
            pc.field_j.f(param0 + 3, var6Lifetime1 + (param2 + 33));
            pc.field_j.f(param0 + 3, pc.field_j.pixelHeight + (33 + param2) + var6Lifetime1);
            SoftwareRaster.a();
            stackIn_33_0 = this.field_l ? 1 : 0;
          }
          if (stackIn_33_0 == 0) {
            stackIn_37_0 = nd.field_b;
          } else {
            stackIn_37_0 = TutorialController.field_e;
          }
          var7 = stackIn_37_0;
          fe.a(param0 + 3, 3 + param2, 217, 29, DisplacedUnitMarker.field_s, var7, 0, 128, true);
          fe.c(var5, param0 + 108, param2 + 34, 0, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4), "ic.JC(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void c(int param0, boolean param1) {
        boolean discarded$0 = false;
        RuntimeException decompiledCaughtException = null;
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.aiPlanners.length >= ActionSpell.field_j &&
            this.aiPlanners[ActionSpell.field_j] != null) {
            this.aiPlanners[ActionSpell.field_j].a(mu.field_f, BattleGraphicsAssets.field_c, (byte) 18, param1);
            if (param0 != 0) {
              discarded$0 = this.a((EventPresenter) null, false);
            }
            var3 = "ai " + (ActionSpell.field_j + 1) + " ";
            var4 = mu.field_f;
            switch ((var5 == 0
              || var4 == 1
              || var4 == 2
              || var4 == 4
              ) ? var4 : -1) {
              case 0:
                var3 = var3 + "normal map";
                if (var5 == 0) {
                  break;
                }
              case 1:
                var3 = var3 + "capture value";
                if (var5 == 0) {
                  break;
                }
              case 3:
                var3 = var3 + "own power " + BattleGraphicsAssets.field_c;
                if (var5 == 0) {
                  break;
                }
              case 2:
                var3 = var3 + "enemy power " + BattleGraphicsAssets.field_c;
                if (var5 == 0) {
                  break;
                }
              case 4:
                var3 = var3 + "unit values";
              default:
                break;
            }
            LineOfSightGrid.$cfr$intArgs$a$5d483ac33914(-80, var3, this.field_Nb);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3_ref), "ic.WC(" + param0 + ',' + param1 + ')');
        }
    }

    final void g(boolean param0) {
        int discarded$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        boolean stackIn_47_0 = false;
        boolean stackIn_59_0 = false;
        boolean stackIn_90_1 = false;
        boolean stackIn_113_1 = false;
        boolean stackIn_144_0 = false;
        int stackIn_159_0 = 0;
        boolean stackIn_212_0 = false;
        int stackIn_278_0 = 0;
        int stackIn_278_1 = 0;
        boolean stackIn_283_0 = false;
        int stackIn_302_0 = 0;
        int stackIn_313_0 = 0;
        int stackIn_332_0 = 0;
        boolean stackIn_343_1 = false;
        int stackIn_346_0 = 0;
        StringBuilder stackIn_346_1 = null;
        String stackIn_347_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_143_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        IntrusiveNode var3_ref_tc = null;
        Unit var4_ref_jd = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Unit var7 = null;
        int var8 = 0;
        int stackIn_278_0Lifetime1;
        int stackIn_278_1Lifetime1;
        int stackIn_302_0Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (!this.battlefield.field_Ab) {
            return;
          }
          if (rs.field_q == 13 &&
            mu.field_a == null) {
            var2_int = 1;
            if (this.campaignMode) {
              var2_int = 24;
            }
            if (this.field_lb) {
              if (this.controlledPlayerId < 0) {
                var2_int = 4;
                if (var8 != 0) {
                  if (!this.battlefield.field_X) {
                    var2_int = 2;
                    var2_int = 3;
                  } else {
                    var2_int = 3;
                  }
                }
              } else {
                if (!this.battlefield.field_X) {
                  var2_int = 2;
                  if (var8 != 0) {
                    var2_int = 3;
                  }
                } else {
                  var2_int = 3;
                }
              }
            }
            var3 = var2_int;
            CipherPacketBuffer.a(false, var3, 1, 0);
            return;
          }
          if (rs.field_q == 9 &&
            this.field_E &&
            !this.field_lb &&
            null != this.selectedUnit) {
            this.selectedUnit.strength = 89;
            this.selectedUnit.maximumStrength = 89;
          }
          if (rs.field_q == 12 &&
            this.field_E) {
            stackIn_47_0 = !(CoatOfArms.field_e);
            CoatOfArms.field_e = stackIn_47_0;
            return;
          }
          if (rs.field_q == 11 &&
            this.field_E) {
            stackIn_59_0 = !(jv.field_a);
            jv.field_a = stackIn_59_0;
            return;
          }
          if (this.field_lb &&
            hf.textChatActive) {
            return;
          }
          if (rs.field_q == 83) {
            boolean decompiledSharedTail0 = (null != this.eventPresenters.first((byte) 102) &&
              ((EventPresenter) (this.eventPresenters.first((byte) 102))).fullCombatScene);
            if (!decompiledSharedTail0) {
              this.q((byte) 119);
              decompiledSharedTail0 = (var8 != 0);
            }
            if (decompiledSharedTail0) {
              ((EventPresenter) (this.eventPresenters.first((byte) 124))).presentation.requestFinish(109);
            }
          }
          if (param0) {
            discarded$0 = this.g(74, -31);
          }
          if (70 == rs.field_q) {
            stackIn_90_1 = !(this.field_tb);
            this.field_tb = stackIn_90_1;
          }
          if (rs.field_q == 84 &&
            br.field_f[86]) {
            if (null != FixedQuaternion.field_a) {
              ck.b(-122);
              if (var8 != 0) {
                ke.field_a = false;
                AiPlanningStrategy.a(false, 8028);
              }
            } else {
              ke.field_a = false;
              AiPlanningStrategy.a(false, 8028);
            }
          }
          if (84 == rs.field_q &&
            br.field_f[82]) {
            stackIn_113_1 = !(param0);
            if (this.a(stackIn_113_1)) {
              this.r((byte) 83);
            }
          }
          boolean decompiledFrameCompleted2 = true;
          if (rs.field_q == 72 &&
            !this.field_bb &&
            ~this.battlefield.currentPlayer == ~this.controlledPlayerId &&
            !this.field_mb &&
            !gk.field_H &&
            this.controlledPlayerId != -1) {
            if (null != this.selectedUnit &&
              ~this.controlledPlayerId == ~this.selectedUnit.ownerPlayer) {
              this.unitCycler.selectUnit(-124, this.selectedUnit);
            }
            this.a(false, 58, (Unit) null);
            this.unitCycler.selectNext(32);
            var2_int = this.unitCycler.getUnitCount((byte) 102);
            while (true) {
              var3_ref_tc = this.unitCycler.getSelectedNode((byte) 120);
              if (null == var3_ref_tc) {
                break;
              }
              var4_ref_jd = (Unit) (var3_ref_tc);
              stackOut_143_0 = var4_ref_jd.movementSpent;
              stackIn_159_0 = stackOut_143_0 ? 1 : 0;
              stackIn_144_0 = stackOut_143_0;
              if (var8 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
              if (!stackIn_144_0) {
                this.a(true, 58, var4_ref_jd);
                this.cameraFocusPending = true;
                this.cameraFocusTileIndex = var4_ref_jd.tileX + this.battlefield.mapWidth * var4_ref_jd.tileY;
                break;
              }
              this.unitCycler.selectNext(48);
              incrementValue$1 = var2_int;
              var2_int--;
              if (incrementValue$1 < 0 &&
                var8 == 0) {
                break;
              }
            }
          }
          if (decompiledFrameCompleted2) {
            stackIn_159_0 = 71;
          }
          if (stackIn_159_0 == rs.field_q &&
            !this.field_bb &&
            this.battlefield.currentPlayer == this.controlledPlayerId &&
            !this.field_mb &&
            !gk.field_H &&
            -1 != this.controlledPlayerId) {
            if (null != this.selectedUnit &&
              this.selectedUnit.ownerPlayer == this.controlledPlayerId) {
              this.unitCycler.selectUnit(-114, this.selectedUnit);
            }
            this.a(false, 58, (Unit) null);
            this.unitCycler.selectPrevious(-94);
            var2_int = this.unitCycler.getUnitCount((byte) 73);
            do {
              var3_ref_tc = this.unitCycler.getSelectedNode((byte) 88);
              if (var3_ref_tc == null) {
                break;
              }
              var4_ref_jd = (Unit) (var3_ref_tc);
              if (!var4_ref_jd.movementSpent) {
                this.a(true, 58, var4_ref_jd);
                this.cameraFocusTileIndex = var4_ref_jd.tileX + this.battlefield.mapWidth * var4_ref_jd.tileY;
                this.cameraFocusPending = true;
                if (var8 == 0) {
                  break;
                }
              }
              this.unitCycler.selectPrevious(-84);
              incrementValue$2 = var2_int;
              var2_int--;
              if (0 > incrementValue$2) {
                break;
              }
            } while (var8 == 0);
          }
          if (rs.field_q == 84 &&
            this.field_L == 0) {
            this.field_L = 200;
          }
          if (rs.field_q == 39) {
            stackIn_212_0 = !(kt.field_l);
            kt.field_l = stackIn_212_0;
          }
          if (rs.field_q == 34 && (this.battlefield.runeCapOption != 0 ||
            this.field_E)) {
            this.c(param0);
          }
          boolean decompiledFrameCompleted1 = true;
          if (!this.field_lb &&
            this.field_E) {
            if (rs.field_q == 4) {
              this.c(0, true);
            }
            if (rs.field_q == 3) {
              var2_int = (ActionSpell.field_j + 1) % this.battlefield.playerCount;
              while (true) {
                if (ActionSpell.field_j % this.battlefield.playerCount != var2_int &&
                  var8 == 0) {
                  if (this.aiPlanners[var2_int] != null) {
                    ActionSpell.field_j = var2_int;
                  } else {
                    var2_int = (var2_int + 1) % this.battlefield.playerCount;
                    continue;
                  }
                }
                break;
              }
              this.c(0, false);
            }
            if (rs.field_q == 2) {
              if (br.field_f[81]) {
                BattleGraphicsAssets.field_c = (BattleGraphicsAssets.field_c + 1) % 9;
                if (var8 != 0) {
                  mu.field_f = (mu.field_f + 1) % 5;
                }
              } else {
                mu.field_f = (mu.field_f + 1) % 5;
              }
              this.c(0, false);
            }
            if (rs.field_q == 1) {
              var2_int = 0;
              while (!(this.battlefield.playerCount <= var2_int)) {
                stackIn_283_0 = br.field_f[81];
                if (var8 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                if (!stackIn_283_0 ||
                  var2_int == 0 ||
                  var8 != 0) {
                  var3Lifetime1 = 0;
                  while (true) {
                    if (var3Lifetime1 < 7) {
                      stackIn_278_0 = -1;
                      stackIn_278_1 = ~this.battlefield.godFavourLevels[var2_int][var3Lifetime1];
                      if (stackIn_278_0 > stackIn_278_1) {
                        this.battlefield.godFavourLevels[var2_int][var3Lifetime1] = 5;
                      }
                      var3Lifetime1++;
                      continue;
                    }
                    this.battlefield.playerMana[var2_int] = this.battlefield.playerMana[var2_int] + (this.battlefield.playerMana[var2_int] >> 1);
                    stackIn_278_0Lifetime1 = this.battlefield.playerMana[var2_int];
                    stackIn_278_1Lifetime1 = 1000000000;
                    if (stackIn_278_0Lifetime1 <= stackIn_278_1Lifetime1) {
                      break;
                    }
                    this.battlefield.playerMana[var2_int] = 1000000000;
                    break;
                  }
                }
                var2_int++;
              }
            }
          }
          if (decompiledFrameCompleted1) {
            stackIn_283_0 = this.field_E;
          }
          if (stackIn_283_0 &&
            rs.field_q == 54 &&
            br.field_f[82]) {
            this.c(70);
          }
          boolean decompiledFrameCompleted0 = true;
          if (rs.field_q == 1 &&
            !this.field_lb &&
            this.field_E) {
            var2_int = 0;
            while (true) {
              stackIn_302_0 = ~this.battlefield.playerCount;
              if (stackIn_302_0 >= ~var2_int) {
                break;
              }
              stackIn_313_0 = 0;
              if (var8 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var3Lifetime2 = stackIn_313_0;
              while (var3Lifetime2 < 7) {
                stackIn_302_0Lifetime1 = this.battlefield.godFavourLevels[var2_int][var3Lifetime2];
                if (stackIn_302_0Lifetime1 > 0) {
                  this.battlefield.godFavourLevels[var2_int][var3Lifetime2] = 5;
                }
                var3Lifetime2++;
              }
              var2_int++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_313_0 = 9;
          }
          if (stackIn_313_0 == rs.field_q &&
            this.field_E &&
            this.field_h > 0 &&
            this.battlefield.tiles.length > this.field_h &&
            this.battlefield.tiles[this.field_h].occupant == null) {
            var2_int = this.field_h % this.battlefield.mapWidth;
            var3Lifetime3 = this.field_h / this.battlefield.mapWidth;
            var4 = 40;
            stackIn_332_0 = (!br.field_f[81]) ? 0 : 1;
            var5 = stackIn_332_0;
            var6 = bw.unitDefinitions[var4][4];
            var7 = new Unit(var2_int, var3Lifetime3, var4, var5, var6, var6, 1, 0, 0, this.battlefield, 0, 0, -1, false, 0);
            this.battlefield.registerUnit(8288, var7);
          }
          if (rs.field_q == 10 &&
            this.field_E) {
            stackIn_343_1 = !(this.field_Db);
            this.field_Db = stackIn_343_1;
            stackIn_346_0 = -80;
            stackIn_346_1 = new StringBuilder().append("ai ");
            if (!this.field_Db) {
              stackIn_347_2 = "un";
            } else {
              stackIn_347_2 = "";
            }
            LineOfSightGrid.$cfr$intArgs$a$5d483ac33914(stackIn_346_0, ((StringBuilder) (Object) stackIn_346_1).append(stackIn_347_2).append("paused").toString(), this.field_Nb);
          }
          if (this.field_E &&
            rs.field_q == 54 &&
            br.field_f[82]) {
            this.c(-103);
          }
          if (50 == rs.field_q &&
            this.field_lb &&
            this.field_E) {
            ug.a(0, this.battlefield, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.VB(" + param0 + ')');
        }
    }

    private final int g(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          var3_int = so.field_b.field_a;
          var4 = so.field_b.field_g;
          var5 = var3_int * ((param0 - 50) * (param0 - 50)) * (param1 + param0) / 200 / rs.field_k;
          var6 = (int)(Math.sin(3.141592653589793 * (double)param0 / 100.0) * 128.0);
          SoftwareRaster.b(0, 0, var3_int, var4, 0, var6);
          AnimationSkeleton.field_t.draw(db.a(true, var5), 0);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ic.BB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void s(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (!this.B(34)) {
            var2_int = 0;
            while (so.field_b.field_a > var2_int) {
              stackIn_17_0 = 0;
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var3 = stackIn_17_0;
              while (var3 < so.field_b.field_g) {
                MatchConditionEntry.field_n.drawOpaque(var2_int, var3);
                var3 = var3 + MatchConditionEntry.field_n.canvasHeight;
              }
              var2_int = var2_int + MatchConditionEntry.field_n.canvasWidth;
            }
            if ((decompiledFrameCompleted0) &&
              (var4 != 0)) {
              jg.field_m.g(0, 0, 96);
            }
          } else {
            jg.field_m.g(0, 0, 96);
          }
          if (decompiledFrameCompleted0) {
            stackIn_17_0 = param0;
          }
          if (stackIn_17_0 >= -83) {
            this.field_ic = 85;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.D(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1) {
        int discarded$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 >= -111) {
            discarded$1 = this.a((Unit) null, (byte) 66);
          }
          if (null != this.battleTutorial) {
            this.battleTutorial.handleInteraction(-1, -3, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ic.BC(" + param0 + ',' + param1 + ')');
        }
    }

    private final int a(int param0, String param1, boolean param2, int param3) {
        int stackIn_3_0 = 0;
        CoatOfArms stackIn_31_0;
        int stackIn_31_1;
        String stackIn_31_2;
        boolean stackIn_31_3;
        boolean stackIn_31_4;
        int stackIn_31_5;
        boolean stackIn_32_6 = false;
        CoatOfArms stackIn_38_0;
        int stackIn_38_1;
        String stackIn_38_2;
        boolean stackIn_38_3;
        boolean stackIn_38_4;
        int stackIn_38_5;
        boolean stackIn_39_6 = false;
        boolean stackIn_55_0 = false;
        CoatOfArms stackIn_69_0 = null;
        boolean stackIn_70_1 = false;
        int stackIn_73_2;
        int stackIn_73_3;
        boolean stackIn_73_4;
        int stackIn_73_5;
        String stackIn_73_6;
        boolean stackIn_73_7;
        boolean stackIn_74_8 = false;
        CoatOfArms stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        String stackIn_80_2 = null;
        boolean stackIn_81_3 = false;
        boolean stackIn_85_4;
        CoatOfArms stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        String stackIn_95_2 = null;
        boolean stackIn_96_3 = false;
        boolean stackIn_100_4;
        int stackIn_108_0 = 0;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_113_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_54_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11_int = 0;
        ArrayIndexOutOfBoundsException var11 = null;
        int var12 = 0;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.battlefield.currentPlayer < 0) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          var5_int = this.g(param0, -50);
          var6 = so.field_b.field_a;
          fe.c(param1, var6 / 2 + var5_int, 170, nd.field_b, false);
          var7 = this.battlefield.h(this.battlefield.currentPlayer, 0);
          if (param3 != 64) {
            this.field_jc = false;
          }
          boolean decompiledFrameRemainder0 = true;
          regionExit1: {
            if (!param2 ||
              var7 <= 1) {
              if (!(0 > this.battlefield.currentPlayer) ||
                ah.localCoat == null) {
                if (0 > this.battlefield.currentPlayer) {
                  break regionExit1;
                }
                if (this.battlefield.playerCoats.length <= this.battlefield.currentPlayer) {
                  break regionExit1;
                }
                if (this.battlefield.currentPlayer >= this.battlefield.playerNames.length) {
                  break regionExit1;
                }
                stackIn_31_0 = this.battlefield.playerCoats[this.battlefield.currentPlayer];
                stackIn_31_1 = var6 / 2 - 56 + var5_int;
                stackIn_31_2 = this.battlefield.playerNames[this.battlefield.currentPlayer];
                stackIn_31_3 = false;
                stackIn_31_4 = false;
                stackIn_31_5 = this.battlefield.playerCoats[this.battlefield.currentPlayer].getMissingPartOffset((byte) 112) + 190;
                stackIn_32_6 = (-1 == this.battlefield.currentPlayer);
                ((CoatOfArms) (Object) stackIn_31_0).a(stackIn_31_1, stackIn_31_2, stackIn_31_3, stackIn_31_4, stackIn_31_5, stackIn_32_6, false, 120);
                if (var12 == 0) {
                  break regionExit1;
                }
              }
              stackIn_38_0 = ah.localCoat;
              stackIn_38_1 = var5_int - 56 + var6 / 2;
              stackIn_38_2 = mv.localAccountName;
              stackIn_38_3 = false;
              stackIn_38_4 = false;
              stackIn_38_5 = 190 + ah.localCoat.getMissingPartOffset((byte) 125);
              stackIn_39_6 = (this.battlefield.currentPlayer == -1);
              ((CoatOfArms) (Object) stackIn_38_0).a(stackIn_38_1, stackIn_38_2, stackIn_38_3, stackIn_38_4, stackIn_38_5, stackIn_39_6, false, 92);
            }
            if (param2 &&
              !(var7 <= 1) || var12 != 0) {
              if (this.battlefield.winnerCount == 1 &&
                this.battlefield.currentPlayer >= 0) {
                var8 = (var7 >> 1) - 1;
                var9 = 0;
                var10 = 0;
                if (this.controlledPlayerId <= 0 ||
                  this.battlefield.getPlayerTeamIndex(this.controlledPlayerId, param3 ^ -65) != this.battlefield.getPlayerTeamIndex(this.battlefield.currentPlayer, param3 - 65)) {
                  var10 = this.battlefield.playerCoats[this.battlefield.getPlayerTeamIndex(this.battlefield.currentPlayer, -1) + (this.battlefield.playerCount - 2)].getMissingPartOffset((byte) -68);
                  if (var12 != 0) {
                    var10 = this.battlefield.playerCoats[this.controlledPlayerId].getMissingPartOffset((byte) -47);
                  }
                } else {
                  var10 = this.battlefield.playerCoats[this.controlledPlayerId].getMissingPartOffset((byte) -47);
                }
                try {
                  boolean decompiledFrameCompleted0 = true;
                  var11_int = 0;
                  while (var11_int < this.battlefield.playerCount) {
                    stackOut_54_0 = this.battlefield.arePlayersAllied(this.battlefield.currentPlayer, param3 - 17049, var11_int);
                    stackIn_108_0 = stackOut_54_0 ? 1 : 0;
                    stackIn_55_0 = stackOut_54_0;
                    if (var12 != 0) {
                      decompiledRegionSelector0 = 0;
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_55_0 &&
                      this.controlledPlayerId != var11_int) {
                      if (var8 != 0) {
                        stackIn_69_0 = this.battlefield.playerCoats[var11_int];
                        stackIn_70_1 = ((1 << var11_int & this.battlefield.eliminatedPlayerMask) != 0);
                        stackIn_73_2 = 0;
                        stackIn_73_3 = 190 + (var10 + ph.field_e[var8][var9][1]) - 10;
                        stackIn_73_4 = false;
                        stackIn_73_5 = ph.field_e[var8][var9][0] + var5_int + (-28 + var6 / 2);
                        stackIn_73_6 = this.battlefield.e(var11_int, param3 ^ -65);
                        stackIn_73_7 = true;
                        stackIn_74_8 = ((this.battlefield.inactivePlayerMask & 1 << var11_int) != 0);
                        ((CoatOfArms) (Object) stackIn_69_0).a(stackIn_70_1, stackIn_73_2, stackIn_73_3, stackIn_73_4, stackIn_73_5, stackIn_73_6, stackIn_73_7, stackIn_74_8, false, -19744);
                        if (var12 != 0) {
                          stackIn_80_0 = this.battlefield.playerCoats[var11_int];
                          stackIn_80_1 = ph.field_e[var8][var9][0] + var5_int + (var6 / 2 - 56);
                          stackIn_80_2 = this.battlefield.e(var11_int, -1);
                          stackIn_81_3 = ((this.battlefield.eliminatedPlayerMask & 1 << var11_int) != 0);
                          stackIn_85_4 = ((this.battlefield.inactivePlayerMask & 1 << var11_int) != 0);
                          ((CoatOfArms) (Object) stackIn_80_0).a(stackIn_80_1, stackIn_80_2, stackIn_81_3, stackIn_85_4, 190 + var10 + ph.field_e[var8][var9][1], false, false, 96);
                        }
                      } else {
                        stackIn_80_0 = this.battlefield.playerCoats[var11_int];
                        stackIn_80_1 = ph.field_e[var8][var9][0] + var5_int + (var6 / 2 - 56);
                        stackIn_80_2 = this.battlefield.e(var11_int, -1);
                        stackIn_81_3 = ((this.battlefield.eliminatedPlayerMask & 1 << var11_int) != 0);
                        stackIn_85_4 = ((this.battlefield.inactivePlayerMask & 1 << var11_int) != 0);
                        ((CoatOfArms) (Object) stackIn_80_0).a(stackIn_80_1, stackIn_80_2, stackIn_81_3, stackIn_85_4, 190 + var10 + ph.field_e[var8][var9][1], false, false, 96);
                      }
                    }
                    if (this.controlledPlayerId > -1 &&
                      ~this.battlefield.getPlayerTeamIndex(this.controlledPlayerId, -1) == ~this.battlefield.getPlayerTeamIndex(this.battlefield.currentPlayer, -1)) {
                      stackIn_95_0 = this.battlefield.playerCoats[this.controlledPlayerId];
                      stackIn_95_1 = ph.field_e[var8][var9][0] + var5_int + (var6 / 2 - 56);
                      stackIn_95_2 = this.battlefield.e(this.controlledPlayerId, param3 - 65);
                      stackIn_96_3 = ((1 << this.controlledPlayerId & this.battlefield.eliminatedPlayerMask) != 0);
                      stackIn_100_4 = (0 != (this.battlefield.inactivePlayerMask & 1 << this.controlledPlayerId));
                      ((CoatOfArms) (Object) stackIn_95_0).a(stackIn_95_1, stackIn_95_2, stackIn_96_3, stackIn_100_4, 190 + var10, false, false, 78);
                    }
                    var11_int++;
                    if (var12 == 0) {
                      continue;
                    }
                    break;
                  }
                  if (decompiledFrameCompleted0) {
                    decompiledRegionSelector0 = 1;
                  }
                } catch (java.lang.ArrayIndexOutOfBoundsException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var11 = (ArrayIndexOutOfBoundsException) (Object) decompiledCaughtException;
                  decompiledRegionSelector0 = 1;
                }
                decompiledFrameRemainder0 = (decompiledRegionSelector0 != 0);
                if ((decompiledFrameRemainder0) &&
                  (var12 != 0)) {
                  ah.localCoat.a(var6 / 2 - 56 + var5_int, mv.localAccountName, false, false, ah.localCoat.getMissingPartOffset((byte) -39) + 190, true, false, 34);
                }
              } else {
                ah.localCoat.a(var6 / 2 - 56 + var5_int, mv.localAccountName, false, false, ah.localCoat.getMissingPartOffset((byte) -39) + 190, true, false, 34);
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_108_0 = var5_int;
          }
          return stackIn_108_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_112_0 = var5;
          stackIn_112_1 = new StringBuilder().append("ic.FB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_113_2 = "null";
          } else {
            stackIn_113_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_112_0), ((StringBuilder) (Object) stackIn_112_1).append(stackIn_113_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void f(int param0, int param1, int param2) {
        this.battlefield.applyTurnChange(true, param1, param0);
        RadialSummonMenu.$cfr$intArgs$a$6d836999ad61(43, ClientUiNode.field_v[17]);
        if (param2 != 0) {
          return;
        }
        try {
          this.field_j = 100;
          this.remainingTurnTicks = ce.turnDurationTicks[this.battlefield.turnDurationOption];
          this.field_jc = false;
          this.field_Pb = true;
          this.field_bc = false;
          this.field_Tb = true;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.HA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean m(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!kt.field_l) {
            stackIn_4_0 = this.l(false);
            return stackIn_4_0;
          }
          if (!param0) {
            stackIn_9_0 = this.t(217);
            return stackIn_9_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.U(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        boolean stackIn_22_0 = false;
        Object stackIn_31_0;
        Object stackIn_33_0;
        Object stackIn_34_0;
        int stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        Object stackIn_35_0;
        int[] stackIn_35_4;
        int stackIn_38_0 = 0;
        boolean stackIn_55_0 = false;
        String stackIn_72_0 = null;
        String stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        int[] stackIn_79_3 = null;
        int stackIn_83_0 = 0;
        String stackIn_132_0 = null;
        int stackIn_182_0 = 0;
        int stackIn_182_1 = 0;
        int stackIn_215_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_252_0 = 0;
        int stackIn_252_1 = 0;
        int stackIn_335_0 = 0;
        int stackIn_336_1 = 0;
        int stackIn_424_0 = 0;
        int stackIn_424_1 = 0;
        String stackIn_457_0 = null;
        int stackIn_581_0 = 0;
        int stackIn_603_0 = 0;
        int stackIn_610_0 = 0;
        int stackIn_617_0 = 0;
        String[][] stackIn_671_0 = null;
        int stackIn_672_1 = 0;
        String[][] stackIn_682_0 = null;
        int stackIn_686_1 = 0;
        String[][] stackIn_707_0 = null;
        int stackIn_708_1 = 0;
        int stackIn_712_0 = 0;
        String[][] stackIn_721_0 = null;
        int stackIn_724_1 = 0;
        boolean stackIn_758_0 = false;
        boolean stackIn_798_0 = false;
        int stackIn_807_0 = 0;
        int stackIn_847_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_21_0;
        boolean stackOut_54_0;
        boolean stackOut_797_0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var6_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var8_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        MapTile var13_ref_ne = null;
        int[] var13_ref_int__ = null;
        int var14 = 0;
        String var15_ref_String = null;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        String var16_ref_String = null;
        int var16 = 0;
        MapTile var16_ref_ne = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2 = this.field_wb;
          var3 = 16777215;
          if (param0 != 120) {
            this.a(-99, false);
          }
          var4 = this.field_S ? 1 : 0;
          if (AiPlanningStrategy.pointerX >= 0 &&
            ko.pointerY >= 0) {
            var5 = 0;
            if (0 <= this.controlledPlayerId &&
              0 != this.battlefield.runeCapOption &&
              this.field_pb == 1 &&
              this.spellConfirmation == null) {
              var6 = 0;
              while (true) {
                if (5 > var6) {
                  var7 = 130 + (int)(Math.sin(3.141592653589793 * (double)var6 / 4.0) * (double)(-(this.field_B / 4) + 64));
                  var8 = -95 + ((int)(Math.cos(3.141592653589793 * (double)var6 / 4.0) * (double)(-(64 - this.field_B / 4))) + this.o(127));
                  stackOut_21_0 = TabbedPanel.a(var8, var7, 22, false);
                  stackIn_38_0 = stackOut_21_0 ? 1 : 0;
                  stackIn_22_0 = stackOut_21_0;
                  if (var20 == 0) {
                    if (stackIn_22_0) {
                      var9 = this.battlefield.equippedSpellIds[this.controlledPlayerId][var6];
                      if (var9 < 0) {
                        fe.b(TurnEffectEvent.field_y, 320, -100 + this.o(125), true);
                        fe.c(TurnEffectEvent.field_y, 320, this.o(param0 ^ 7) - 100, jh.field_k, true);
                        var5 = 1;
                      } else {
                        var5 = 1;
                        stackIn_34_0 = this;
                        stackIn_34_1 = var9;
                        stackIn_34_2 = this.o(127) - 60;
                        stackIn_34_3 = 320;
                        if (~var9 == ~this.field_gc) {
                          stackIn_35_0 = this;
                          stackIn_35_4 = nd.field_b;
                        } else {
                          stackIn_33_0 = this;
                          if (this.battlefield.e(122, this.controlledPlayerId, var9) <= 0) {
                            stackIn_35_0 = this;
                            stackIn_35_4 = TutorialController.field_e;
                          } else {
                            stackIn_31_0 = this;
                            stackIn_35_0 = this;
                            stackIn_35_4 = jh.field_k;
                          }
                        }
                        this.a(stackIn_34_1, stackIn_34_2, stackIn_34_3, stackIn_35_4, 11951);
                      }
                    }
                    var6++;
                    continue;
                  }
                } else {
                  stackIn_38_0 = var5;
                }
                if (stackIn_38_0 != 0) {
                  break;
                }
                if (this.field_gc <= -1) {
                  break;
                }
                this.a(this.field_gc, -60 + this.o(126), 320, nd.field_b, param0 ^ 11991);
                break;
              }
            }
            if (this.field_P &&
              2 == this.field_pb) {
              boolean decompiledFrameCompleted3 = true;
              if (null == this.spellConfirmation) {
                var6 = -1;
                while (var6 < 6) {
                  stackOut_54_0 = TabbedPanel.a(-95 + this.o(127), 230 + var6 * 45, 22, false);
                  stackIn_83_0 = stackOut_54_0 ? 1 : 0;
                  stackIn_55_0 = stackOut_54_0;
                  if (var20 != 0) {
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  boolean decompiledFrameRemainder14 = true;
                  if (stackIn_55_0) {
                    if (var6 != -1) {
                      if (var6 == 5) {
                        var2 = HuffmanCodec.field_g;
                      } else {
                        var7 = th.floorModWithOffset(this.field_Lb + var6, param0 ^ 121, 135);
                        if (-1 < var7 &&
                          var7 < fq.field_f.length) {
                          stackIn_72_0 = fq.field_f[var7];
                        } else {
                          stackIn_72_0 = StateChangeEvent.field_A;
                        }
                        var8_ref_String = stackIn_72_0;
                        fe.b(var8_ref_String, 320, this.o(param0 ^ 5) - 45, true);
                        var5 = 1;
                        stackIn_75_0 = var8_ref_String;
                        stackIn_75_1 = 320;
                        stackIn_75_2 = -45 + this.o(125);
                        if (~var7 != ~this.field_gc) {
                          if (0 < this.battlefield.e(26, this.controlledPlayerId, var7)) {
                            stackIn_79_3 = jh.field_k;
                          } else {
                            stackIn_79_3 = TutorialController.field_e;
                          }
                        } else {
                          stackIn_79_3 = nd.field_b;
                        }
                        fe.c(stackIn_75_0, stackIn_75_1, stackIn_75_2, stackIn_79_3, true);
                      }
                      decompiledFrameRemainder14 = false;
                    }
                    else {
                      var2 = HuffmanCodec.field_g;
                    }
                  }
                  var6++;
                }
              }
              if (decompiledFrameCompleted3) {
                stackIn_83_0 = var5;
              }
              if (stackIn_83_0 == 0 &&
                -1 < this.field_gc) {
                var6_ref_String = fq.field_f[this.field_gc];
                fe.b(var6_ref_String, 320, this.o(125) - 45, true);
                fe.c(var6_ref_String, 320, this.o(126) - 45, nd.field_b, true);
              }
            }
            if (var2 == null &&
              this.controlledPlayerId >= 0 &&
              TabbedPanel.a(-95 + this.o(param0 ^ 6), 130, 22, false) &&
              0 != this.battlefield.runeCapOption) {
              var2 = MatchSetupPanel.field_x;
            }
            boolean decompiledFrameRemainder13 = true;
            if (null == var2) {
              regionExit1: {
                boolean decompiledFrameCompleted2 = true;
                boolean decompiledFrameRemainder11 = true;
                if (!this.field_r ||
                  !IterableDualNodeDeque.isPointerInBounds(-33, 150, 227, 15, 15 + e.field_b[0].pixelHeight) ||
                  this.controlledPlayerId < 0) {
                  if (!this.field_lb ||
                    !IterableDualNodeDeque.isPointerInBounds(-33, 10, 74, this.o(param0 ^ 5) - 40, -10 + this.o(125))) {
                    if (this.field_lb &&
                      this.battlefield.teamGame &&
                      TabbedPanel.a(-40 + this.o(125) + 14, 88, 14, false)) {
                      if (qa.field_F) {
                        stackIn_132_0 = or.field_e;
                      } else {
                        stackIn_132_0 = kd.field_E;
                      }
                      var2 = stackIn_132_0;
                      decompiledFrameRemainder11 = (var20 != 0);
                    }
                    if (decompiledFrameRemainder11) {
                      if (vt.a(67, en.field_E, this.field_Fb, bu.field_c, GrowthEvent.field_I, -123) &&
                        !this.battlefield.field_X &&
                        this.battlefield.currentPlayer == this.controlledPlayerId &&
                        !this.field_bc) {
                        var2 = RasterState.field_k;
                        decompiledFrameRemainder11 = (var20 != 0);
                      }
                      if (decompiledFrameRemainder11) {
                        if (!TabbedPanel.a(29, 129, 19, false) ||
                          this.battlefield.mapSizeSetting == 4) {
                          if (this.spellConfirmation != null) {
                            return;
                          }
                          if (null != this.battlefield.playerCoats) {
                            if (this.battlefield.teamGame) {
                              var6 = 80;
                              var7 = 0;
                              while (var7 < this.battlefield.teamCount) {
                                stackIn_252_0 = this.battlefield.currentPlayer;
                                stackIn_252_1 = -1;
                                if (var20 != 0) {
                                  decompiledFrameCompleted2 = false;
                                  break;
                                }
                                boolean decompiledFrameRemainder12 = true;
                                if (stackIn_252_0 <= stackIn_252_1 ||
                                  this.battlefield.getPlayerTeamIndex(this.battlefield.currentPlayer, -1) != var7) {
                                  var8 = so.field_b.field_a - 60 - (30 * this.battlefield.playerCount >> 2);
                                  var9 = 0;
                                  while (var9 < this.battlefield.playerCount) {
                                    stackIn_182_0 = this.battlefield.getPlayerTeamIndex(var9, -1);
                                    stackIn_182_1 = var7;
                                    if (stackIn_182_0 == stackIn_182_1) {
                                      if (IterableDualNodeDeque.isPointerInBounds(-33, var8, var8 + 30, var6, var6 + 30)) {
                                        var2 = this.battlefield.playerNames[var9];
                                        var3 = op.field_c[1][var9];
                                      }
                                      var8 += 30;
                                    }
                                    var9++;
                                  }
                                  var6 += 35;
                                  stackIn_182_0 = param0 ^ -89;
                                  stackIn_182_1 = so.field_b.field_a - 120;
                                  if (IterableDualNodeDeque.isPointerInBounds(stackIn_182_0, stackIn_182_1, so.field_b.field_a, var6, 30 + var6) &&
                                    this.battlefield.campaignMission == null) {
                                    var2 = this.battlefield.teams[var7].getTeamName(3);
                                    var2 = this.a((String) (var2), var7, -255069420);
                                    var3 = op.field_c[0][var7];
                                  }
                                  var6 += 40;
                                  decompiledFrameRemainder12 = false;
                                }
                                else {
                                  var8 = 0;
                                  while (true) {
                                    if (this.battlefield.playerCount > var8) {
                                      stackIn_215_0 = ~var8;
                                      stackIn_215_1 = ~this.battlefield.currentPlayer;
                                      if (stackIn_215_0 != stackIn_215_1) {
                                        if (var7 == this.battlefield.getPlayerTeamIndex(var8, -1)) {
                                          if (IterableDualNodeDeque.isPointerInBounds(-33, so.field_b.field_a - 74, so.field_b.field_a - 58, var6, var6 + 30)) {
                                            var3 = op.field_c[1][var8];
                                            var2 = this.battlefield.playerNames[var8];
                                          }
                                          var6 += 30;
                                        }
                                      } else {
                                        if (IterableDualNodeDeque.isPointerInBounds(-33, -28 + (so.field_b.field_a - 60), -28 + so.field_b.field_a, var6, var6 + 60)) {
                                          var2 = this.battlefield.playerNames[var8];
                                          var3 = op.field_c[1][var8];
                                        }
                                        var6 += 60;
                                      }
                                      var8++;
                                      continue;
                                    }
                                    break;
                                  }
                                  var6 += 5;
                                  stackIn_215_0 = -33;
                                  stackIn_215_1 = so.field_b.field_a - 120;
                                  if (IterableDualNodeDeque.isPointerInBounds(stackIn_215_0, stackIn_215_1, so.field_b.field_a, var6, 30 + var6) &&
                                    this.battlefield.campaignMission == null) {
                                    var2 = this.battlefield.teams[var7].getTeamName(3);
                                    var2 = this.a((String) (var2), var7, -255069420);
                                    var3 = op.field_c[0][var7];
                                  }
                                  var6 += 40;
                                }
                                var7++;
                              }
                              if (decompiledFrameCompleted2) {
                                decompiledFrameRemainder11 = (var20 != 0);
                              }
                            }
                            if ((decompiledFrameRemainder11) &&
                              (decompiledFrameCompleted2)) {
                              var6 = 10;
                              var7 = 0;
                              scanLoop2: while (true) {
                                if (var7 < this.battlefield.playerCount) {
                                  stackIn_252_0 = var7;
                                  stackIn_252_1 = this.battlefield.currentPlayer;
                                  if (var20 != 0) {
                                    break regionExit1;
                                  }
                                  if (stackIn_252_0 == stackIn_252_1) {
                                    if (IterableDualNodeDeque.isPointerInBounds(-33, -64 + so.field_b.field_a, so.field_b.field_a, var6, var6 + 60)) {
                                      var2 = this.battlefield.playerNames[var7];
                                      var2 = this.a((String) (var2), var7, -255069420);
                                      var4 = 1;
                                      var3 = op.field_c[0][var7];
                                      break scanLoop2;
                                    }
                                    var6 += 60;
                                  } else {
                                    if (IterableDualNodeDeque.isPointerInBounds(-33, so.field_b.field_a - 50, so.field_b.field_a, var6, 30 + var6)) {
                                      var2 = this.battlefield.playerNames[var7];
                                      var2 = this.a((String) (var2), var7, -255069420);
                                      var3 = op.field_c[0][var7];
                                      var4 = 1;
                                      break scanLoop2;
                                    }
                                    var6 += 30;
                                  }
                                  var7++;
                                  continue;
                                }
                                break;
                              }
                              if (var20 != 0) {
                                var2 = ep.field_a;
                                var2 = PointerInputHandler.field_e;
                                var2 = fo.a(4800, vs.field_h, new String[]{Integer.toString(this.battlefield.playerMana[this.controlledPlayerId])});
                              }
                            }
                          }
                        } else {
                          var2 = ep.field_a;
                          if (var20 != 0) {
                            var2 = PointerInputHandler.field_e;
                            var2 = fo.a(4800, vs.field_h, new String[]{Integer.toString(this.battlefield.playerMana[this.controlledPlayerId])});
                          }
                        }
                      }
                    }
                  } else {
                    var2 = PointerInputHandler.field_e;
                    if (var20 != 0) {
                      var2 = fo.a(4800, vs.field_h, new String[]{Integer.toString(this.battlefield.playerMana[this.controlledPlayerId])});
                    }
                  }
                } else {
                  var2 = fo.a(4800, vs.field_h, new String[]{Integer.toString(this.battlefield.playerMana[this.controlledPlayerId])});
                }
                if (decompiledFrameCompleted2) {
                  stackIn_252_0 = -162;
                  stackIn_252_1 = this.o(param0 ^ 5);
                }
              }
              var6 = stackIn_252_0 + stackIn_252_1;
              var7 = 107;
              var8 = 25;
              if (!this.battlefield.field_V) {
                var7 = var7 - var8;
                var6 = var6 + var8;
              }
              boolean decompiledFrameRemainder10 = true;
              if (IterableDualNodeDeque.isPointerInBounds(-33, 0, 103, var6, var7 + var6) &&
                var2 == null) {
                var2 = "";
                var9 = -1;
                if (this.controlledPlayerId < 0) {
                  if (IterableDualNodeDeque.isPointerInBounds(-33, 5, 60, var6 + 4, -4 + var6 + var7) &&
                    this.battlefield.currentPlayer >= 0) {
                    var9 = (-4 + (-var6 + ko.pointerY)) / 25;
                    if (!this.battlefield.field_V) {
                      var9++;
                    }
                    boolean decompiledSharedTail5 = (var9 != 0);
                    if (!decompiledSharedTail5) {
                      var2 = fo.a(param0 ^ 4792, DiskCacheWorker.field_f[0], new String[]{Integer.toString(1 + this.battlefield.playerTurnCounts[this.battlefield.currentPlayer]), Integer.toString(this.battlefield.turnLimit)});
                      decompiledSharedTail5 = (var20 != 0);
                    }
                    if (decompiledSharedTail5) {
                      var2 = fo.a(param0 ^ 4792, DiskCacheWorker.field_f[var9], new String[]{Integer.toString(this.battlefield.teamStructureCounts[this.battlefield.getPlayerTeamIndex(this.battlefield.currentPlayer, -1)][-1 + var9]), Integer.toString(this.battlefield.mapStructureTotals[-1 + var9])});
                    }
                  }
                  decompiledFrameRemainder10 = (~this.battlefield.rankedParticipants[0] != ~this.battlefield.currentPlayer);
                  if ((decompiledFrameRemainder10) &&
                    (decompiledFrameRemainder10 = !(this.battlefield.i(this.battlefield.rankedParticipants[0], -12710) <= this.battlefield.i(this.battlefield.getPlayerTeamIndex(this.battlefield.currentPlayer, param0 - 121), -12710))) &&
                    (decompiledFrameRemainder10 = !(!IterableDualNodeDeque.isPointerInBounds(-33, 60, 103, 4 + var6, -4 + (var7 + var6))))) {
                    var9 = (ko.pointerY + (-var6 - 4)) / 25;
                    if (!this.battlefield.field_V) {
                      var9++;
                    }
                    decompiledFrameRemainder10 = !(var9 <= 0);
                    if (decompiledFrameRemainder10) {
                      var2 = fo.a(param0 ^ 4792, DiskCacheWorker.field_f[var9 + 4], new String[]{Integer.toString(this.battlefield.teamStructureCounts[this.battlefield.rankedParticipants[0]][-1 + var9]), Integer.toString(this.battlefield.mapStructureTotals[-1 + var9]), this.battlefield.teams[this.battlefield.rankedParticipants[0]].getTeamName(param0 ^ 123)});
                      decompiledFrameRemainder10 = (var20 != 0);
                    }
                  }
                }
                if (decompiledFrameRemainder10) {
                  if (IterableDualNodeDeque.isPointerInBounds(-33, 5, 60, var6 + 4, -4 + var6 + var7)) {
                    var9 = (ko.pointerY - var6 - 4) / 25;
                    if (!this.battlefield.field_V) {
                      var9++;
                    }
                    boolean decompiledSharedTail4 = (var9 != 0);
                    if (!decompiledSharedTail4) {
                      var2 = fo.a(4800, DiskCacheWorker.field_f[0], new String[]{Integer.toString(1 + this.battlefield.playerTurnCounts[this.controlledPlayerId]), Integer.toString(this.battlefield.turnLimit)});
                      decompiledSharedTail4 = (var20 != 0);
                    }
                    if (decompiledSharedTail4) {
                      var2 = fo.a(4800, DiskCacheWorker.field_f[var9], new String[]{Integer.toString(this.battlefield.teamStructureCounts[this.battlefield.getPlayerTeamIndex(this.controlledPlayerId, -1)][var9 - 1]), Integer.toString(this.battlefield.mapStructureTotals[var9 - 1])});
                    }
                  }
                  if (this.battlefield.rankedParticipants[0] != this.battlefield.getPlayerTeamIndex(this.controlledPlayerId, param0 - 121) &&
                    this.battlefield.i(this.battlefield.rankedParticipants[0], param0 - 12830) > this.battlefield.i(this.battlefield.getPlayerTeamIndex(this.controlledPlayerId, -1), -12710) &&
                    IterableDualNodeDeque.isPointerInBounds(param0 ^ -89, 60, 103, var6 + 4, -4 + var6 + var7)) {
                    var9 = (-4 - var6 + ko.pointerY) / 25;
                    if (!this.battlefield.field_V) {
                      var9++;
                    }
                    if (0 < var9) {
                      var2 = fo.a(param0 ^ 4792, DiskCacheWorker.field_f[4 + var9], new String[]{Integer.toString(this.battlefield.teamStructureCounts[this.battlefield.rankedParticipants[0]][-1 + var9]), Integer.toString(this.battlefield.mapStructureTotals[var9 - 1]), this.battlefield.teams[this.battlefield.rankedParticipants[0]].getTeamName(3)});
                    }
                  }
                }
              }
              var8 = 25;
              var9 = 9;
              var10 = 90 + var9;
              var11 = -133 + this.o(125) + 3 * var8;
              var12 = var8 + var11;
              if (IterableDualNodeDeque.isPointerInBounds(-33, var9, var10, var11, var12)) {
                var13 = this.battlefield.i(this.battlefield.getPlayerTeamIndex(this.controlledPlayerId, -1), -12710);
                var14 = this.battlefield.collectedManaTarget;
                var15_ref_String = Integer.toString(var13);
                var16_ref_String = Integer.toString(var14);
                if (null != DiskCacheWorker.field_f ||
                  !(DiskCacheWorker.field_f.length <= 8)) {
                  var2 = fo.a(param0 ^ 4792, DiskCacheWorker.field_f[8], new String[]{var15_ref_String, var16_ref_String});
                  if (var20 != 0) {
                    var2 = null;
                  }
                } else {
                  var2 = null;
                }
              }
              boolean decompiledFrameRemainder9 = true;
              if (this.field_fb == 80 &&
                null != this.selectedUnit) {
                var13 = this.selectedUnit.l(-27014);
                var14 = eb.a((byte) -108, var13 >> 2);
                stackIn_335_0 = var14 >> 2;
                if ((3 & var14) <= 0 &&
                  var14 != 0) {
                  stackIn_336_1 = 0;
                } else {
                  stackIn_336_1 = 1;
                }
                var15 = stackIn_335_0 + stackIn_336_1;
                if ((!TabbedPanel.a(59, 279, 21, false)) &&
                  (decompiledFrameRemainder9 = (IterableDualNodeDeque.isPointerInBounds(-33, 253, 562, 0, 75) ||
                  IterableDualNodeDeque.isPointerInBounds(-33, 387, 517, 39, 39 + 30 * var15)))) {
                  var2 = "";
                  if (IterableDualNodeDeque.isPointerInBounds(-33, 260, 285, 12, 44)) {
                    var2 = BufferedSocket.field_m[this.selectedUnit.getUnitCategory(0)];
                  }
                  if (IterableDualNodeDeque.isPointerInBounds(-33, 502, 550, 12, 32)) {
                    if (0 < this.selectedUnit.bonusStrength) {
                      var2 = fo.a(4800, ki.field_c, new String[]{Integer.toString(this.selectedUnit.strength), Integer.toString(this.selectedUnit.maximumStrength), Integer.toString(this.selectedUnit.bonusStrength)});
                    }
                    var2 = fo.a(param0 ^ 4792, CoatOfArms.field_c, new String[]{Integer.toString(this.selectedUnit.strength), Integer.toString(this.selectedUnit.maximumStrength)});
                  }
                  if (IterableDualNodeDeque.isPointerInBounds(-33, 312, 342, 39, 79)) {
                    var2 = fh.field_f[eb.a((byte) -109, 3 & ~var13)];
                  }
                  if (IterableDualNodeDeque.isPointerInBounds(-33, 344, 378, 39, 79)) {
                    var16 = this.selectedUnit.unitType;
                    if (this.selectedUnit.packedFlag8 &&
                      var16 == 34) {
                      var16 = 75;
                    }
                    var17 = bw.unitDefinitions[var16][6];
                    var18 = bw.unitDefinitions[var16][7];
                    if (this.selectedUnit.packedFlag8 &&
                      this.selectedUnit.unitType == 34 &&
                      3 == this.selectedUnit.getEquipmentCategory(param0 ^ 20696)) {
                      var18 = var18 + this.selectedUnit.getEquipmentProperty(1, -109);
                    }
                    if (this.selectedUnit.unitType != 81 &&
                      this.selectedUnit.unitType != 4 &&
                      this.selectedUnit.unitType != 74 ||
                      this.selectedUnit.getEquipmentCategory(20640) != 3) {
                      if (this.selectedUnit.getUnitCategory(0) != 3 ||
                        this.selectedUnit.getEquipmentCategory(20640) != 2) {
                        if ((this.selectedUnit.getUnitCategory(0) == 2) &&
                          (this.selectedUnit.getEquipmentCategory(param0 + 20520) == 1)) {
                          var18 = var18 + this.selectedUnit.getEquipmentProperty(1, -99);
                          if (var20 != 0) {
                            var18 = var18 + this.selectedUnit.getEquipmentProperty(1, 63);
                            var18 = var18 + this.selectedUnit.getEquipmentProperty(1, -126);
                          }
                        }
                      } else {
                        var18 = var18 + this.selectedUnit.getEquipmentProperty(1, 63);
                        if (var20 != 0) {
                          var18 = var18 + this.selectedUnit.getEquipmentProperty(1, -126);
                        }
                      }
                    } else {
                      var18 = var18 + this.selectedUnit.getEquipmentProperty(1, -126);
                    }
                    boolean decompiledSharedTail3 = (~var18 == ~var17);
                    if (!decompiledSharedTail3) {
                      var2 = fo.a(param0 ^ 4792, cw.field_a, new String[]{Integer.toString(var17), Integer.toString(var18)});
                      decompiledSharedTail3 = (var20 != 0);
                    }
                    if (decompiledSharedTail3) {
                      var2 = fo.a(param0 ^ 4792, ud.field_Y, new String[]{Integer.toString(var17)});
                    }
                  }
                  var16 = 0;
                  var17 = bw.unitDefinitions[this.selectedUnit.unitType][12];
                  if (IterableDualNodeDeque.isPointerInBounds(-33, 525, 555, 39, 79)) {
                    if (var17 == -1) {
                      var2 = du.field_f;
                      if (var20 != 0) {
                        var2 = DirectByteStorage.field_n[var17];
                      }
                    } else {
                      var2 = DirectByteStorage.field_n[var17];
                    }
                  }
                  if (IterableDualNodeDeque.isPointerInBounds(param0 - 153, 387, 517, 39, 39 + var15 * 30)) {
                    if (var14 == 0) {
                      var2 = fh.field_f[-1 + fh.field_f.length];
                    }
                    if (var14 != 0 ||
                      var20 != 0) {
                      var18 = 5;
                      while (true) {
                        if (var18 > 1) {
                          stackIn_424_0 = 0;
                          stackIn_424_1 = 1 << var18 & var13;
                          if (var20 == 0) {
                            if (stackIn_424_0 != stackIn_424_1) {
                              if (IterableDualNodeDeque.isPointerInBounds(param0 ^ -89, -((3 & var16) * 30) + 487, 517 - (3 & var16) * 30, 39 + 30 * (var16 >> 2), 79 + 30 * (var16 >> 2))) {
                                var2 = fh.field_f[var18 + 1];
                              }
                              var16++;
                            }
                            var18--;
                            continue;
                          }
                        } else {
                          stackIn_424_0 = 0;
                          stackIn_424_1 = this.selectedUnit.statusEffectType;
                        }
                        if (stackIn_424_0 != stackIn_424_1) {
                          if (IterableDualNodeDeque.isPointerInBounds(-33, 487 - (var16 & 3) * 30, 517 - (3 & var16) * 30, 30 * (var16 >> 2) + 39, 79 + 30 * (var16 >> 2))) {
                            var2 = fo.a(param0 + 4680, PaletteRegionMap.field_a[this.selectedUnit.statusEffectType - 1], new String[]{Integer.toString(this.selectedUnit.statusEffectValue)});
                          }
                          var16++;
                        }
                        if (this.selectedUnit.equipmentDescriptor > -1) {
                          if (IterableDualNodeDeque.isPointerInBounds(-33, 487 - 30 * (var16 & 3), 517 - 30 * (var16 & 3), (var16 >> 2) * 30 + 39, 79 + (var16 >> 2) * 30)) {
                            var2 = fo.a(4800, ManaEvent.field_y[this.selectedUnit.getEquipmentId((byte) 81)], new String[]{pg.field_b[this.selectedUnit.getEquipmentCategory(20640)]});
                          }
                          var16++;
                        }
                        if (0 < this.selectedUnit.accessoryType) {
                          if (IterableDualNodeDeque.isPointerInBounds(-33, -((var16 & 3) * 30) + 487, 517 - 30 * (3 & var16), 30 * (var16 >> 2) + 39, 30 * (var16 >> 2) + 79)) {
                            var2 = DropdownArrowPainter.field_c[this.selectedUnit.accessoryType];
                          }
                          var16++;
                        }
                        if (this.selectedUnit.immobilizedTurns > 0) {
                          if (IterableDualNodeDeque.isPointerInBounds(-33, 487 - 30 * (var16 & 3), 517 - (var16 & 3) * 30, 39 + (var16 >> 2) * 30, 30 * (var16 >> 2) + 79)) {
                            if (this.selectedUnit.immobilizedTurns > 1) {
                              stackIn_457_0 = fo.a(4800, ba.field_E[1], new String[]{Integer.toString(this.selectedUnit.immobilizedTurns)});
                            } else {
                              stackIn_457_0 = ba.field_E[0];
                            }
                            var2 = stackIn_457_0;
                          }
                          var16++;
                        }
                        if (this.selectedUnit.meleeLifeSteal) {
                          if (IterableDualNodeDeque.isPointerInBounds(-33, -((3 & var16) * 30) + 487, -((var16 & 3) * 30) + 517, 30 * (var16 >> 2) + 39, 30 * (var16 >> 2) + 79)) {
                            var2 = c.field_f;
                          }
                          var16++;
                        }
                        if (this.selectedUnit.packedFlag256) {
                          if (IterableDualNodeDeque.isPointerInBounds(-33, 487 - (3 & var16) * 30, 517 - 30 * (3 & var16), (var16 >> 2) * 30 + 39, (var16 >> 2) * 30 + 79)) {
                            var2 = td.field_h;
                          }
                          var16++;
                        }
                        if (!this.selectedUnit.packedFlag32) {
                          break;
                        }
                        if (IterableDualNodeDeque.isPointerInBounds(-33, -(30 * (var16 & 3)) + 487, -(30 * (3 & var16)) + 517, 39 + (var16 >> 2) * 30, 79 + (var16 >> 2) * 30)) {
                          var2 = qc.field_f;
                        }
                        var16++;
                        break;
                      }
                    }}
                  if (((String) (var2)).length() > 0) {
                    ClientConnectionState.a(-1204320024, -30 + 30 * var15, 223, (String) (var2));
                    return;
                  }
                  decompiledFrameRemainder9 = (var20 != 0);
                }
                if (decompiledFrameRemainder9) {
                  regionExit3: {
                    var2 = "";
                    var16 = this.selectedUnit.unitType;
                    if (var16 != 39) {
                      if (var16 != 34 ||
                        var20 != 0) {
                        boolean decompiledFrameRemainder8 = true;
                        if (var16 != 17) {
                          if ((var16 != 72 ||
                            var20 != 0) &&
                            (decompiledFrameRemainder8 = (var16 != 7))) {
                            break regionExit3;
                          }
                        } else {
                          if (this.selectedUnit.hasMovementFlag1(false)) {
                            break regionExit3;
                          }
                          var2 = de.field_b;
                          if (var20 == 0) {
                            break regionExit3;
                          }
                        }
                        if (decompiledFrameRemainder8) {
                          var2 = ContextActionMenu.field_Ob;
                          if (var20 == 0) {
                            break regionExit3;
                          }
                        }
                        if (!(this.selectedUnit.packedFlag8)) {
                          var16 = this.battlefield.tiles[this.battlefield.mapWidth * this.selectedUnit.tileY + this.selectedUnit.tileX].terrainType;
                          if (var16 == 0) {
                            var2 = IconLabelControl.field_Ib;
                            if (var20 == 0) {
                              break regionExit3;
                            }
                          }
                          var2 = ao.field_x;
                        }
                        break regionExit3;
                      }
                    } else {
                      var2 = fn.field_S;
                      if (var20 == 0) {
                        break regionExit3;
                      }
                    }
                    if (!this.selectedUnit.packedFlag8) {
                      var16_ref_ne = this.battlefield.tiles[this.selectedUnit.tileY * this.battlefield.mapWidth + this.selectedUnit.tileX];
                      if (var16_ref_ne.f(19725)) {
                        var2 = jv.field_e;
                        if (var20 != 0) {
                          var2 = lq.field_f;
                        }
                      } else {
                        var2 = lq.field_f;
                      }
                    }
                  }
                  if (((String) (var2)).length() != 0) {
                    if (!this.selectedUnit.movementSpent &&
                      0 != this.selectedUnit.attacksRemaining) {
                      if (this.selectedUnit.h(-13494)) {
                        var2 = DualNodeDeque.field_k;
                        if (var20 != 0) {
                          var2 = j.field_d;
                          var2 = kv.field_J;
                        }
                      }
                    } else {
                      var2 = j.field_d;
                      if (var20 != 0) {
                        var2 = kv.field_J;
                      }
                    }
                  } else {
                    var2 = kv.field_J;
                  }
                  ClientConnectionState.a(param0 - 1204320144, 0, 253, (String) (var2));
                  return;
                }
              }
              if (this.field_fb == 80 &&
                this.field_h > -1 &&
                IterableDualNodeDeque.isPointerInBounds(-33, 253, 562, 0, 75)) {
                boolean decompiledFrameRemainder7 = true;
                var2 = "";
                var13_ref_ne = this.battlefield.tiles[this.field_h];
                if (IterableDualNodeDeque.isPointerInBounds(-33, 260, 285, 12, 44)) {
                  if (!var13_ref_ne.isStructure(false)) {
                    var2 = GlobalSpell.field_k;
                    decompiledFrameRemainder7 = (var20 != 0);
                  }
                  if (decompiledFrameRemainder7) {
                    if (0 > var13_ref_ne.ownerPlayer) {
                      var2 = rn.field_b;
                      if (var20 != 0) {
                        if (this.controlledPlayerId == var13_ref_ne.ownerPlayer) {
                          var2 = GlobalSpell.field_e;
                          var2 = fo.a(param0 + 4680, IterableNodeHashTable.field_h, new String[]{this.battlefield.getPlayerTeam(var13_ref_ne.ownerPlayer, -1).getTeamName(3)});
                        } else {
                          var2 = fo.a(param0 + 4680, IterableNodeHashTable.field_h, new String[]{this.battlefield.getPlayerTeam(var13_ref_ne.ownerPlayer, -1).getTeamName(3)});
                        }
                      }
                    } else {
                      boolean decompiledSharedTail2 = (this.controlledPlayerId != var13_ref_ne.ownerPlayer);
                      if (!decompiledSharedTail2) {
                        var2 = GlobalSpell.field_e;
                        decompiledSharedTail2 = (var20 != 0);
                      }
                      if (decompiledSharedTail2) {
                        var2 = fo.a(param0 + 4680, IterableNodeHashTable.field_h, new String[]{this.battlefield.getPlayerTeam(var13_ref_ne.ownerPlayer, -1).getTeamName(3)});
                      }
                    }
                  }
                }
                if (IterableDualNodeDeque.isPointerInBounds(param0 - 153, 502, 550, 12, 32)) {
                  var2 = ek.field_b[0][vg.field_r[var13_ref_ne.terrainType]];
                }
                if (IterableDualNodeDeque.isPointerInBounds(-33, 260, 318, 39, 79)) {
                  var14 = 0;
                  if (var13_ref_ne.occupant != null &&
                    !this.battlefield.arePlayersAllied(var13_ref_ne.occupant.ownerPlayer, -16985, var13_ref_ne.ownerPlayer)) {
                    stackIn_581_0 = 1;
                  } else {
                    stackIn_581_0 = 0;
                  }
                  regionExit4: {
                    regionExit5: {
                      regionExit6: {
                        var15 = stackIn_581_0;
                        var16 = var13_ref_ne.terrainType;
                        if (var16 != 8 ||
                          var20 != 0) {
                          switch (var16) {
                            case 14:
                              break regionExit6;
                            case 9:
                              break regionExit6;
                            default:
                              break regionExit4;
                            case 7:
                              if (var20 == 0) {
                                break regionExit5;
                              }
                              break;
                          }
                        }
                        stackIn_603_0 = (var15 == 0) ? 25 : 12;
                        var14 = stackIn_603_0;
                        if (var20 == 0) {
                          break regionExit4;
                        }
                      }
                      stackIn_610_0 = (var15 == 0) ? 75 : 37;
                      var14 = stackIn_610_0;
                      if (var20 == 0) {
                        break regionExit4;
                      }
                    }
                    stackIn_617_0 = (var15 == 0) ? 50 : 25;
                    var14 = stackIn_617_0;
                  }
                  if (0 < var14) {
                    var2 = fo.a(4800, vg.field_t, new String[]{Integer.toString(var14)});
                    if (var20 != 0) {
                      var2 = ps.field_x;
                    }
                  } else {
                    var2 = ps.field_x;
                  }
                }
                if (TabbedPanel.a(50, 535, 16, false)) {
                  boolean decompiledSharedTail1 = (WeightedLruCache.terrainDamageTakenPercent[var13_ref_ne.terrainType] != 100);
                  if (!decompiledSharedTail1) {
                    var2 = ek.field_b[1][17];
                    decompiledSharedTail1 = (var20 != 0);
                  }
                  if (decompiledSharedTail1) {
                    var2 = fo.a(4800, ek.field_b[0][17], new String[]{Integer.toString(WeightedLruCache.terrainDamageTakenPercent[var13_ref_ne.terrainType])});
                  }
                }
                var14 = 23;
                var15 = 0;
                if (var13_ref_ne.hasCorpse(105)) {
                  if (IterableDualNodeDeque.isPointerInBounds(-33, var14 * var15 + 325, (var15 + 1) * var14 + 325, 39, 79)) {
                    var2 = ek.field_b[0][0];
                  }
                  var15++;
                }
                regionExit7: {
                  regionExit8: {
                    regionExit9: {
                      var16 = var13_ref_ne.terrainType;
                      if (var16 != 8 && ((14 != var16 ||
                        var20 != 0) &&
                        (9 != var16 ||
                        var20 != 0))) {
                        switch (var16) {
                          case 7:
                            break regionExit9;
                          case 3:
                            break regionExit8;
                          default:
                            break regionExit7;
                          case 2:
                            if (var20 == 0) {
                              break regionExit8;
                            }
                            break;
                        }
                      }
                      if (IterableDualNodeDeque.isPointerInBounds(param0 ^ -89, var15 * var14 + 325, (var15 + 1) * var14 + 325, 39, 79)) {
                        stackIn_671_0 = ek.field_b;
                        if (var13_ref_ne.ownerPlayer > -1 &&
                          ~this.controlledPlayerId == ~var13_ref_ne.ownerPlayer) {
                          stackIn_672_1 = 0;
                        } else {
                          stackIn_672_1 = 1;
                        }
                        var2 = stackIn_671_0[stackIn_672_1][1];
                      }
                      var15++;
                      if (var20 == 0) {
                        break regionExit7;
                      }
                    }
                    if (IterableDualNodeDeque.isPointerInBounds(-33, var14 * var15 + 325, 325 + (1 + var15) * var14, 39, 79)) {
                      stackIn_682_0 = ek.field_b;
                      if (var13_ref_ne.ownerPlayer != -1) {
                        if (var13_ref_ne.ownerPlayer == this.controlledPlayerId) {
                          stackIn_686_1 = 0;
                        } else {
                          stackIn_686_1 = 1;
                        }
                      } else {
                        stackIn_686_1 = 2;
                      }
                      var2 = stackIn_682_0[stackIn_686_1][2];
                    }
                    var15++;
                    if (var20 == 0) {
                      break regionExit7;
                    }
                  }
                  if (IterableDualNodeDeque.isPointerInBounds(-33, 325 + var14 * var15, 325 + (1 + var15) * var14, 39, 79)) {
                    var2 = ek.field_b[0][3];
                  }
                  var15++;
                }
                var16 = var13_ref_ne.getEffectsForPlayer((byte) 97, this.controlledPlayerId, this.battlefield.getPlayerTeamIndex(this.controlledPlayerId, -1));
                var17 = var13_ref_ne.getEffectsForPlayer((byte) 97, -1, -1);
                var18 = 0;
                while (true) {
                  if (var18 < 5) {
                    stackIn_712_0 = 1 << var18 & var17;
                    if (var20 == 0) {
                      if (stackIn_712_0 != 0) {
                        if (IterableDualNodeDeque.isPointerInBounds(-33, 325 + var15 * var14, (var15 + 1) * var14 + 325, 39, 79)) {
                          stackIn_707_0 = ek.field_b;
                          if ((var16 & 1 << var18) != 0) {
                            stackIn_708_1 = 1;
                          } else {
                            stackIn_708_1 = 0;
                          }
                          var2 = stackIn_707_0[stackIn_708_1][AnimationSequence.field_f[var18]];
                        }
                        var15++;
                      }
                      var18++;
                      continue;
                    }
                  } else {
                    stackIn_712_0 = var13_ref_ne.hasExplicitOwner((byte) -79) ? 1 : 0;
                  }
                  if (stackIn_712_0 != 0) {
                    var18 = var13_ref_ne.getExplicitOwner((byte) -74);
                    if (IterableDualNodeDeque.isPointerInBounds(-33, var14 * var15 + 325, 325 + var14 * (1 + var15), 39, 79)) {
                      stackIn_721_0 = ek.field_b;
                      if (this.controlledPlayerId > -1 &&
                        this.battlefield.arePlayersAllied(this.controlledPlayerId, -16985, var18)) {
                        stackIn_724_1 = 1;
                      } else {
                        stackIn_724_1 = 0;
                      }
                      var2 = stackIn_721_0[stackIn_724_1][9];
                    }
                    var15++;
                  }
                  if (0 >= ((String) (var2)).length()) {
                    break;
                  }
                  ClientConnectionState.a(param0 - 1204320144, 0, 253, (String) (var2));
                  return;
                }
              }
              if (this.field_H == 240 && (IterableDualNodeDeque.isPointerInBounds(-33, 0, 240, 110, 330) &&
                !kt.field_l ||
                IterableDualNodeDeque.isPointerInBounds(param0 ^ -89, 0, 410, 110, 370) &&
                kt.field_l)) {
                var2 = "";
              }
              boolean decompiledFrameCompleted1 = true;
              if (this.battlefield.currentPlayer > -1) {
                var13_ref_int__ = this.battlefield.chosenGods[this.battlefield.currentPlayer];
                var14 = 50;
                var15 = so.field_b.field_a / 2;
                var15 = var15 - var14 * (-1 + var13_ref_int__.length) / 2;
                var16 = 0;
                while (var13_ref_int__.length > var16) {
                  var17 = var16 * var14 + var15;
                  var18 = this.f(128, this.g(2)) - 30;
                  stackIn_758_0 = TabbedPanel.a(var18, var17, 13, false);
                  if (var20 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_758_0) {
                    var19 = var13_ref_int__[var16];
                    var4 = 1;
                    if (var19 > -1) {
                      var2 = fo.a(param0 + 4680, PointerInputHandler.field_c, new String[]{wf.field_q[var19 + 1], Integer.toString(this.battlefield.godFavourLevels[this.controlledPlayerId][var19])});
                    }
                  }
                  var16++;
                }
              }
              if (decompiledFrameCompleted1) {
                stackIn_758_0 = this.field_F;
              }
              boolean decompiledFrameRemainder6 = true;
              if (stackIn_758_0 &&
                var2 == null) {
                this.camera.gridPosition[1] = this.selectedUnit.tileY;
                this.camera.gridPosition[0] = this.selectedUnit.tileX;
                this.camera.projectModelAnchor(9470337);
                var13 = this.camera.screenPosition[0];
                var14 = this.camera.screenPosition[1];
                if (!IterableDualNodeDeque.isPointerInBounds(param0 - 153, 25 + var13, 55 + var13, -8 + var14, 7 + var14)) {
                  if (IterableDualNodeDeque.isPointerInBounds(param0 ^ -89, var13 + 25, var13 + 55, var14 + 33, var14 + 48)) {
                    var2 = aj.field_p;
                    decompiledFrameRemainder6 = (var20 != 0);
                  }
                  if (decompiledFrameRemainder6) {
                    if (IterableDualNodeDeque.isPointerInBounds(-33, -15 + var13, var13 + 15, var14 + 13, 28 + var14)) {
                      var2 = aj.field_p;
                      decompiledFrameRemainder6 = (var20 != 0);
                    }
                    if ((decompiledFrameRemainder6) &&
                      (IterableDualNodeDeque.isPointerInBounds(-33, var13 + 65, 95 + var13, var14 + 13, 28 + var14))) {
                      var2 = aj.field_p;
                      if (var20 != 0) {
                        var2 = aj.field_p;
                      }
                    }
                  }
                } else {
                  var2 = aj.field_p;
                }
              }
              boolean decompiledFrameRemainder5 = true;
              boolean decompiledFrameCompleted0 = true;
              boolean decompiledFrameRemainder4 = true;
              if (this.field_m &&
                var2 == null) {
                this.camera.gridPosition[0] = this.selectedUnit.tileX;
                this.camera.gridPosition[1] = this.selectedUnit.tileY;
                this.camera.projectModelAnchor(9470337);
                var13 = this.camera.screenPosition[0];
                var14 = this.camera.screenPosition[1];
                var15_ref_int__ = this.battlefield.chosenGods[this.controlledPlayerId];
                if (3 == var15_ref_int__.length) {
                  if (TabbedPanel.a(var14 + 55, var13 + 40, 25, false)) {
                    var2 = fo.a(param0 ^ 4792, SpellConfirmationDialog.field_g, new String[]{wf.field_q[1 + this.battlefield.chosenGods[this.controlledPlayerId][1]]});
                  }
                  if (TabbedPanel.a(var14, 80 + var13, 25, false)) {
                    var2 = fo.a(4800, SpellConfirmationDialog.field_g, new String[]{wf.field_q[this.battlefield.chosenGods[this.controlledPlayerId][2] + 1]});
                  }
                  decompiledFrameRemainder4 = !(!TabbedPanel.a(var14, var13, 25, false));
                  if (decompiledFrameRemainder4) {
                    var2 = fo.a(4800, SpellConfirmationDialog.field_g, new String[]{wf.field_q[1 + this.battlefield.chosenGods[this.controlledPlayerId][0]]});
                    decompiledFrameRemainder4 = (var20 != 0);
                  }
                }
                if (decompiledFrameRemainder4) {
                  var16 = 40;
                  var17 = var13 + 15;
                  var17 = var17 - var15_ref_int__.length * var16 / 2;
                  var18 = 0;
                  while (var18 < var15_ref_int__.length) {
                    stackOut_797_0 = TabbedPanel.a(var14 + 25, var17 + 25, 25, false);
                    stackIn_807_0 = stackOut_797_0 ? 1 : 0;
                    stackIn_798_0 = stackOut_797_0;
                    if (var20 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_798_0) {
                      var2 = fo.a(param0 + 4680, SpellConfirmationDialog.field_g, new String[]{wf.field_q[var15_ref_int__[var18] + 1]});
                    }
                    var17 = var17 + var16;
                    var18++;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (decompiledFrameRemainder5 = (null == var2))) {
                stackIn_807_0 = -2;
              }
              if ((decompiledFrameRemainder5) &&
                (stackIn_807_0 != this.field_y)) {
                this.camera.gridPosition[0] = this.field_X;
                this.camera.gridPosition[1] = this.field_ec;
                this.camera.projectModelAnchor(9470337);
                var13 = 24 + this.camera.screenPosition[0];
                var14 = this.camera.screenPosition[1];
                var15 = -1;
                if (this.godMenu != null) {
                  var15 = this.godMenu.getChoiceAtPoint((byte) -107, ko.pointerY, 16 + var13, AiPlanningStrategy.pointerX, 16 + var14);
                }
                if (var15 > -1) {
                  if (var15 != 0) {
                    var2 = wf.field_q[1 + this.battlefield.chosenGods[this.controlledPlayerId][-1 + var15]];
                    if (var20 != 0) {
                      var2 = wf.field_q[0];
                    }
                  } else {
                    var2 = wf.field_q[0];
                  }
                }
                if (null == var2 &&
                  this.field_y != -1) {
                  var15 = this.unitMenus[this.field_y].getChoiceAtPoint((byte) -121, ko.pointerY, 16 + var13, AiPlanningStrategy.pointerX, var14 + 16);
                  var4 = this.unitMenus[this.field_y].isSecondHalfHit((byte) 117, ko.pointerY, 16 + var14, var13 + 16, AiPlanningStrategy.pointerX) ? 1 : 0;
                  if (var15 > -1) {
                    var16 = this.battlefield.getSummonFailureFlags(this.controlledPlayerId, 255, var15, this.field_ec, this.field_X);
                    if (var16 > 0) {
                      var2 = TeamRoster.field_c[var16];
                      if (var20 != 0) {
                        var2 = "";
                      }
                    } else {
                      var2 = "";
                    }
                  }
                }
              }
              if (null == var2 &&
                !this.field_m &&
                !this.field_F) {
                this.camera.screenPosition[1] = ko.pointerY;
                this.camera.screenPosition[0] = AiPlanningStrategy.pointerX;
                this.camera.screenToGrid(false);
                var13 = this.camera.gridPosition[0];
                var14 = this.camera.gridPosition[1];
                var15 = -1;
                var16 = var13 + var14 * this.battlefield.mapWidth;
                var17 = 0;
                if (this.field_lc) {
                  var18 = this.battlefield.mapWidth;
                  var19 = -this.selectedUnit.tileX - this.selectedUnit.tileY * var18 + var16;
                  if (var19 != var18 &&
                    ~-var18 != ~var19 &&
                    var19 != 1 &&
                    var19 != -1) {
                    stackIn_847_0 = 0;
                  } else {
                    stackIn_847_0 = 1;
                  }
                  var17 = stackIn_847_0;
                }
                if (var13 > -1 &&
                  var14 > -1 &&
                  var13 < this.battlefield.mapWidth &&
                  var14 < this.battlefield.mapHeight) {
                  var15 = this.battlefield.tiles[var16].terrainType;
                }
                if (var13 > -1 &&
                  var13 < this.battlefield.mapWidth &&
                  -1 < var14 &&
                  var14 < this.battlefield.mapHeight) {
                  if (this.selectedUnit != null &&
                    !this.movementPlanner.otherPlayerPreview) {
                    if (!this.battlefield.a(this.selectedUnit, var13, var14, -128)) {
                      if ((!this.battlefield.a(var14, -26633, var13, this.selectedUnit)) &&
                        (decompiledFrameRemainder13 = !(this.movementPlanner.otherPlayerPreview))) {
                        decompiledFrameRemainder13 = !(!this.movementPlanner.controlsOtherPlayerUnit);
                      }
                      if (decompiledFrameRemainder13) {
                        var2 = DualNodeDeque.field_a;
                        if ((0 == (4 & this.movementPlanner.attackTargetMask[var16])) &&
                          (decompiledFrameRemainder13 = (var17 != 0))) {
                          var2 = ContextActionMenu.field_Ob;
                          decompiledFrameRemainder13 = (var20 != 0);
                        }
                        if ((decompiledFrameRemainder13) &&
                          (decompiledFrameRemainder13 = (!(this.selectedUnit.movementSpent) ||
                          (1 & this.movementPlanner.attackTargetMask[var16]) != 0))) {
                          var2 = wf.field_A;
                          decompiledFrameRemainder13 = (var20 != 0);
                        }
                      }
                    }
                    if (decompiledFrameRemainder13) {
                      var2 = wn.field_gb;
                      if (this.battlefield.tiles[var16].occupant == null ||
                        ~this.battlefield.tiles[var16].occupant.ownerPlayer != ~this.controlledPlayerId ||
                        this.movementPlanner.controlsOtherPlayerUnit) {
                        if (this.selectedUnit.h(-13494)) {
                          var2 = DualNodeDeque.field_k;
                          decompiledFrameRemainder13 = (var20 != 0);
                        }
                        if (decompiledFrameRemainder13) {
                          if (this.selectedUnit.movementSpent) {
                            var2 = j.field_d;
                            decompiledFrameRemainder13 = (var20 != 0);
                          }
                          if ((decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder13 = !(bw.unitDefinitions[this.selectedUnit.unitType][3] * 3 >= this.movementPlanner.movementCosts[var16]))) {
                            if (this.movementPlanner.movementCostsThroughOwnUnits[var16] <= bw.unitDefinitions[this.selectedUnit.unitType][3] * 3) {
                              var2 = op.field_g;
                              decompiledFrameRemainder13 = (var20 != 0);
                            }
                            if (decompiledFrameRemainder13) {
                              if (var17 == 0) {
                                var2 = fo.field_a;
                                decompiledFrameRemainder13 = (var20 != 0);
                              }
                              if (decompiledFrameRemainder13) {
                                var2 = "";
                                decompiledFrameRemainder13 = (var20 != 0);
                              }
                            }
                          }
                        }
                      }
                      if (decompiledFrameRemainder13) {
                        var2 = "";
                        decompiledFrameRemainder13 = (var20 != 0);
                      }
                    }
                  }
                  if (decompiledFrameRemainder13) {
                    if ((this.battlefield.getSummoningGodMaskAt(var13, -27300, var14, this.controlledPlayerId) <= 0) &&
                      (decompiledFrameRemainder13 = !(this.field_z))) {
                      boolean decompiledFrameRemainder3 = true;
                      boolean decompiledFrameRemainder2 = true;
                      boolean decompiledFrameRemainder1 = true;
                      boolean decompiledFrameRemainder0 = true;
                      var18 = var15;
                      if ((var18 != 7) &&
                        (decompiledFrameRemainder0 = (var18 != 14)) &&
                        (decompiledFrameRemainder1 = (var18 != 9 ||
                        var20 != 0)) &&
                        (decompiledFrameRemainder3 = (var18 == 8))) {
                        decompiledFrameRemainder2 = (var20 != 0);
                      }
                      if ((decompiledFrameRemainder3) &&
                        (decompiledFrameRemainder2) &&
                        (decompiledFrameRemainder1) &&
                        (decompiledFrameRemainder0)) {
                        var2 = AnimationFrameSet.field_F;
                        decompiledFrameRemainder3 = (var20 != 0);
                      }
                      if ((decompiledFrameRemainder3) &&
                        (decompiledFrameRemainder2) &&
                        (decompiledFrameRemainder1)) {
                        var2 = BattleGraphicsAssets.field_a;
                        decompiledFrameRemainder3 = (var20 != 0);
                      }
                      if ((decompiledFrameRemainder3) &&
                        (decompiledFrameRemainder2)) {
                        var2 = og.field_n;
                        decompiledFrameRemainder3 = (var20 != 0);
                      }
                      if (decompiledFrameRemainder3) {
                        var2 = on.field_p;
                      }
                      decompiledFrameRemainder13 = (null != this.battlefield.tiles[var16].metadata);
                      if ((decompiledFrameRemainder13) &&
                        (decompiledFrameRemainder13 = (this.battlefield.tiles[var16].metadata.displayName != null))) {
                        var2 = this.battlefield.tiles[var16].getDisplayName((byte) 89);
                        decompiledFrameRemainder13 = (var20 != 0);
                      }
                    }
                    if (decompiledFrameRemainder13) {
                      var2 = RadialSummonMenu.field_a;
                    }
                  }
                }
              }
            }
            if (null != var2 &&
              ((String) (var2)).length() > 0) {
              var6 = 10 + AiPlanningStrategy.pointerX;
              var7 = ko.pointerY + 30;
              var8 = en.field_E.a((String) (var2));
              if (var4 != 0) {
                var6 = var6 - (var8 + 12);
                if (!(6 <= var6)) {
                  var6 = var6 + (6 - var6);
                  if ((var20 != 0) &&
                    (so.field_b.field_a - 20 < var8 + var6)) {
                    var6 = -20 + (so.field_b.field_a - var8);
                  }
                }
              } else {
                if (so.field_b.field_a - 20 < var8 + var6) {
                  var6 = -20 + (so.field_b.field_a - var8);
                }
              }
              if (10 + var7 > this.o(126)) {
                var7 -= 30;
              }
              boolean decompiledSharedTail0 = (!(this.field_yb > 0) ||
                !(5 < this.field_yb % 10));
              if (!decompiledSharedTail0) {
                SoftwareRaster.a(-6 + var6, var7 - 11, 12 + var8, 15, 5, 16711680, 128);
                decompiledSharedTail0 = (var20 != 0);
              }
              if (decompiledSharedTail0) {
                SoftwareRaster.a(-6 + var6, var7 - 11, 12 + var8, 15, 5, 0, 128);
              }
              en.field_E.b((String) (var2), var6, var7, var3, -1);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) (var2), "ic.UB(" + param0 + ')');
        }
    }

    final void h(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        Object var3_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.eventPresenters = new NodeDeque();
          this.camera = new BattleCamera(this.battlefield.mapWidth, this.battlefield.mapHeight);
          this.unitRenderer = new BattleUnitRenderer(this.camera);
          ro.modelProjectionCamera = this.camera;
          ot.a(this.battlefield, this.battleGraphicsAssets, 1, this);
          var2_int = (this.battlefield.mapWidth >> 1) + (this.battlefield.mapWidth >> 1) * this.battlefield.mapWidth;
          if (!param0) {
            this.field_Gb = -93;
          }
          if (!this.battlefield.field_X) {
            var3_ref = null;
            if (this.controlledPlayerId > -1) {
              var3_ref = (Unit) (this.battlefield.unitsByPlayer[this.controlledPlayerId].first((byte) 120));
            } else {
              if (this.battlefield.currentPlayer > -1) {
                var3_ref = (Unit) (this.battlefield.unitsByPlayer[this.battlefield.currentPlayer].first((byte) 93));
              }
            }
            if (var3_ref != null) {
              var2_int = this.a((Unit) (var3_ref), (byte) 75);
            }
            this.camera.snapToTile(var2_int, param0);
          }
          regionExit1: {
            regionExit2: {
              regionExit3: {
                regionExit4: {
                  var3 = 0;
                  var4 = 0;
                  var5 = this.battlefield.mapSizeSetting;
                  if (var5 != 0 ||
                    var6 != 0) {
                    switch (var5) {
                      case 1:
                        break regionExit4;
                      case 2:
                        break regionExit3;
                      default:
                        break regionExit1;
                      case 3:
                        if (var6 == 0) {
                          break regionExit2;
                        }
                        break;
                    }
                  }
                  var4 = 4;
                  var3 = 8;
                  if (var6 == 0) {
                    break regionExit1;
                  }
                }
                var3 = 6;
                var4 = 3;
                if (var6 == 0) {
                  break regionExit1;
                }
              }
              var4 = 2;
              var3 = 4;
              if (var6 == 0) {
                break regionExit1;
              }
            }
            var4 = 2;
            var3 = 3;
          }
          cu.field_b = new RgbSprite(this.battlefield.mapWidth * 2 * var3, 1 + var4 * 2 * this.battlefield.mapWidth);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.NA(" + param0 + ')');
        }
    }

    private final void n(int param0) {
        int stackIn_34_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var7Lifetime1;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          fe.field_b = fe.field_b + 1;
          fe.field_b = fe.field_b % 100;
          if (param0 != -12) {
            this.field_bb = true;
          }
          if (!this.battlefield.field_L) {
            boolean decompiledFrameCompleted0 = true;
            var2 = this.battlefield.chosenGods[this.controlledPlayerId];
            var3 = this.battlefield.godFavourLevels[this.controlledPlayerId];
            var4 = this.f(param0 + 140, this.g(param0 + 14));
            if (this.field_Ab) {
              var5 = 0;
              while (var5 < var2.length) {
                var6 = 50 * (-1 + var5) + so.field_b.field_a / 2;
                var7 = var4 - 30;
                TrianglePulse.field_d.d(-35 + var6, var7 - 35, 70, 70, (int)(64.0 * Math.sin((double)uk.field_n / 3.141592653589793 / 2.0) + 128.0));
                var5++;
                if (var11 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              var5 = 50;
              var6 = so.field_b.field_a / 2;
              var6 = var6 - var5 * (-1 + var2.length) / 2;
            }
            var7Lifetime1 = 0;
            while (true) {
              if (var7Lifetime1 < var2.length) {
                var8 = var6 + var5 * var7Lifetime1;
                var9 = var4 - 30;
                stackIn_34_0 = ~var7Lifetime1;
                if (var11 == 0) {
                  if (!(stackIn_34_0 <= ~this.battlefield.field_D) ||
                    this.aiPlanners != null &&
                    this.aiPlanners[this.controlledPlayerId] != null) {
                    var10 = var2[var7Lifetime1];
                    if (var10 != -1) {
                      UnitModelPreview.field_d[1 + var10].h(-12 + var8, var9 - 12);
                      gt.field_c[var10 + 1].h(-18 + var8, -21 + var9);
                      fe.a(var8, var9, var10 + 1, var3[var10], fe.field_b);
                    }
                  } else {
                    UnitModelPreview.field_d[0].h(var8 - 12, var9 - 12);
                  }
                  var7Lifetime1++;
                  continue;
                }
              } else {
                stackIn_34_0 = this.field_r ? 1 : 0;
              }
              if (stackIn_34_0 == 0) {
                break;
              }
              this.u(517);
              break;
            }
          }
          this.z(param0 ^ 15);
          this.m(11425);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "ic.B(" + param0 + ')');
        }
    }

    private final int o(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 124) {
            this.d(113, true);
          }
          stackIn_4_0 = this.f(128, 0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.K(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, byte param2, int param3, int param4) {
        int[] stackIn_7_0 = null;
        CoatOfArms stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        String stackIn_10_2 = null;
        boolean stackIn_11_3 = false;
        boolean stackIn_15_4 = false;
        int stackIn_18_5;
        boolean stackIn_19_6 = false;
        boolean stackIn_29_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        String var7 = null;
        int[] var8 = null;
        try {
          var6_int = this.battlefield.rankedParticipants[param4];
          if (param2 != -40) {
            this.c(28, -48, -108, 17);
          }
          var7 = this.battlefield.playerNames[var6_int].toUpperCase();
          if (~this.field_Rb != ~param4) {
            stackIn_7_0 = nd.field_b;
          } else {
            stackIn_7_0 = TutorialController.field_e;
          }
          var8 = stackIn_7_0;
          fe.b(db.a(true, param1), MatchConditionEntry.a(param0, (byte) 94), 134, 228, io.field_m, var8, 0, 180);
          CampaignUnitOverride.a(db.a(true, param1), db.a(true, 134), MatchConditionEntry.a(228, (byte) 94), MatchConditionEntry.a(param0, (byte) 94), (byte) 73);
          stackIn_10_0 = this.battlefield.playerCoats[var6_int];
          stackIn_10_1 = db.a(true, 13 + param1);
          stackIn_10_2 = var7;
          stackIn_11_3 = ((this.battlefield.eliminatedPlayerMask & 1 << var6_int) != 0);
          stackIn_15_4 = ((1 << var6_int & this.battlefield.inactivePlayerMask) != 0);
          stackIn_18_5 = MatchConditionEntry.a(param0 - 2, (byte) 94);
          stackIn_19_6 = !((1 << var6_int & this.battlefield.field_C) <= 0);
          ((CoatOfArms) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_10_2, stackIn_11_3, stackIn_15_4, stackIn_18_5, stackIn_19_6, false, param2 ^ -3);
          QuickChatPhraseRepository.popRasterState(-18862);
          fe.b(db.a(true, param1), MatchConditionEntry.a(param0, (byte) 94), 134, 228, io.field_m, var8, 0, 0);
          if (param3 <= -1) {
            fe.b(DualNodeIterator.field_g, db.a(true, param1 + 67), MatchConditionEntry.a(18 + param0, (byte) 94), true);
            fe.c(DualNodeIterator.field_g, db.a(true, 67 + param1), MatchConditionEntry.a(param0 + 18, (byte) 94), nd.field_b, true);
          }
          if (param3 > -1 ||
            ArmiesOfGielinor.obfuscationControl) {
            fe.b(ph.field_b[param3], db.a(true, param1 + 67), MatchConditionEntry.a(param0 + 18, (byte) 94), true);
            fe.c(ph.field_b[param3], db.a(true, param1 + 67), MatchConditionEntry.a(18 + param0, (byte) 94), nd.field_b, true);
          }
          en.field_E.c(var7, db.a(true, param1 + 67), MatchConditionEntry.a(128 + param0, (byte) 94), 16777215, -1);
          this.b(var6_int, 35 + param1, 133 + param0, -12857);
          stackIn_29_1 = (~this.field_Rb == ~param4);
          this.a(stackIn_29_1, var6_int, (byte) 113, param1 + 35, param0 + 194);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var6), "ic.TB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(int param0, boolean param1) {
        String stackIn_25_0 = null;
        int stackIn_36_0 = 0;
        RgbSprite[] stackIn_39_0 = null;
        int stackIn_40_1 = 0;
        boolean stackIn_95_0 = false;
        int stackIn_107_0 = 0;
        int stackIn_136_0 = 0;
        RgbSprite[] stackIn_139_0 = null;
        int stackIn_140_1 = 0;
        int stackIn_149_0 = 0;
        int stackIn_149_1 = 0;
        int stackIn_149_2 = 0;
        int stackIn_150_3;
        int stackIn_226_0 = 0;
        int stackIn_233_0 = 0;
        tu stackIn_238_0 = null;
        StringBuilder stackIn_238_1 = null;
        boolean stackIn_239_2 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_94_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4_ref_String = null;
        EventPresenter var4_ref_vb = null;
        int var4 = 0;
        ac var4_ref_ac = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var4Lifetime1Lifetime1;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.battlefield.field_Ab &&
            this.movementPlanner != null) {
            if (this.field_V) {
              this.f(101);
              return;
            }
            if (this.battlefield.field_X &&
              0 == this.field_Sb) {
              this.e(true);
              var3_int = se.field_a - 40;
              var4_ref_String = IntrusiveNode.field_g;
              if (!this.field_lb) {
                if (null != l.activeCampaignMission) {
                  stackIn_25_0 = pv.field_d;
                } else {
                  stackIn_25_0 = vq.field_f;
                }
                var4_ref_String = stackIn_25_0;
              }
              var5 = nr.field_e.a(var4_ref_String) / 2;
              var6 = 0;
              var7 = 0;
              if (this.field_lb) {
                if (s.field_d > 0 &&
                  uk.field_n % 40 < 20) {
                  stackIn_36_0 = 1;
                } else {
                  stackIn_36_0 = 0;
                }
                var8 = stackIn_36_0;
                var9 = this.o(125);
                fm.a(e.field_b, 64, 10, -40 + var9, -71);
                stackIn_39_0 = jv.field_b;
                if (var8 == 0) {
                  stackIn_40_1 = 0;
                } else {
                  stackIn_40_1 = 1;
                }
                ((RgbSprite) (Object) stackIn_39_0[stackIn_40_1]).g(28, var9 - 36);
                var6 = nr.field_e.a(DisplacedUnitMarker.field_t[12]) / 2;
                var7 = -65 - var5 - var6 + rs.field_k;
                var9Lifetime1 = this.f(128, db.a(true, var7));
                if (MatchConditionEntry.a(0, (byte) 94) + se.field_a > var9Lifetime1) {
                  var3_int = -40 + (-MatchConditionEntry.a(0, (byte) 94) + var9Lifetime1);
                }
              }
              var8Lifetime1 = rs.field_k;
              fm.a(e.field_b, 30 + var5, db.a(true, var8Lifetime1 - var5 - 45), MatchConditionEntry.a(var3_int, (byte) 94), -117);
              fe.a(var4_ref_String, db.a(true, var8Lifetime1 - 30 - var5), MatchConditionEntry.a(var3_int + 28, (byte) 94), 16777215, true);
              if (this.field_lb &&
                -1 < this.controlledPlayerId) {
                fm.a(e.field_b, var6 + 30, db.a(true, -15 + var7), MatchConditionEntry.a(var3_int, (byte) 94), -87);
                fe.a(DisplacedUnitMarker.field_t[12], db.a(true, var7), MatchConditionEntry.a(var3_int + 28, (byte) 94), 16777215, true);
              }
              return;
            }
            if (!cu.field_a) {
              SoftwareRaster.b();
              if (var10 != 0) {
                this.s(-123);
              }
            } else {
              this.s(-123);
            }
            li.a(param0 + 4);
            if (~this.field_C < param0 &&
              this.field_Zb > -1 &&
              param1) {
              uu.a(this.field_Zb, -103, this.field_C);
            }
            if (!this.battlefield.field_Cb) {
              this.p(20);
              if (null != this.field_Nb.first((byte) 121)) {
                ((sq) (this.field_Nb.first((byte) 104))).b(500, this.o(param0 ^ 127));
                if (var10 != 0) {
                  this.c((byte) -117);
                  this.v(-128);
                  this.i((byte) -69);
                  if (-1 < this.controlledPlayerId) {
                    this.n(-12);
                  }
                  if (this.field_Nb.first((byte) 91) != null) {
                    ((sq) (this.field_Nb.first((byte) 88))).b(500, this.o(param0 ^ 126));
                  }
                }
              }
            } else {
              this.c((byte) -117);
              this.v(-128);
              this.i((byte) -69);
              if (-1 < this.controlledPlayerId) {
                this.n(-12);
              }
              if (this.field_Nb.first((byte) 91) != null) {
                ((sq) (this.field_Nb.first((byte) 88))).b(500, this.o(param0 ^ 126));
              }
            }
            this.o((byte) 107);
            if (!this.field_tb) {
              if (this.field_H > 0) {
                this.field_H = this.field_H - 16;
                if (var10 != 0 &&
                  this.field_H < 232) {
                  this.field_H = this.field_H + 16;
                }
              }
            } else {
              if (this.field_H < 232) {
                this.field_H = this.field_H + 16;
              }
            }
            this.l(-22038);
            this.k(-32400);
            var3_intLifetime1 = 0;
            var4_ref_vb = (EventPresenter) (this.eventPresenters.first((byte) 121));
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (null == var4_ref_vb))) {
              stackOut_94_0 = var4_ref_vb.fullCombatScene;
              stackIn_107_0 = stackOut_94_0 ? 1 : 0;
              stackIn_95_0 = stackOut_94_0;
              if (var10 == 0) {
                if (stackIn_95_0) {
                  var4_ref_vb.presentation.drawBaseLayer((byte) -122);
                  if (var4_ref_vb.presentation.isCombatViewReady((byte) -63)) {
                    var3_intLifetime1 = 1;
                  }
                }
                var4_ref_vb = (EventPresenter) (this.eventPresenters.next((byte) 123));
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              if (this.spellConfirmation != null) {
                this.spellConfirmation.draw(1619620993);
              }
              this.h(82);
              stackIn_107_0 = this.battlefield.currentPlayer;
            }
            if (stackIn_107_0 != this.controlledPlayerId ||
              this.field_bc ||
              this.battlefield.field_X) {
              if (this.field_ib > 0) {
                this.field_ib = this.field_ib - 8;
                if (var10 != 0 &&
                  this.field_ib < 64) {
                  this.field_ib = this.field_ib + 8;
                }
              }
            } else {
              if (this.field_ib < 64) {
                this.field_ib = this.field_ib + 8;
              }
            }
            if (this.field_lb) {
              if (s.field_d > 0 &&
                uk.field_n % 40 < 20) {
                stackIn_136_0 = 1;
              } else {
                stackIn_136_0 = 0;
              }
              var4 = stackIn_136_0;
              QuickChatCategory.field_u = 0;
              fm.a(e.field_b, 64, 10, this.o(125) - 40, -41);
              stackIn_139_0 = jv.field_b;
              if (var4 != 0) {
                stackIn_140_1 = 1;
              } else {
                stackIn_140_1 = 0;
              }
              ((RgbSprite) (Object) stackIn_139_0[stackIn_140_1]).g(28, -36 + this.o(param0 ^ 125));
              if (this.battlefield.teamGame &&
                -1 < this.controlledPlayerId) {
                fm.a(e.field_b, 29, 74, this.o(param0 ^ 126) - 40, -87);
                stackIn_149_0 = 88;
                stackIn_149_1 = -40 + (this.o(127) + 14);
                stackIn_149_2 = 10;
                if (qa.field_F) {
                  stackIn_150_3 = op.field_c[0][this.battlefield.getPlayerTeamIndex(this.controlledPlayerId, ~param0)];
                } else {
                  stackIn_150_3 = 14540253;
                }
                fe.c(stackIn_149_0, stackIn_149_1, stackIn_149_2, stackIn_150_3);
              }
            }
            if (param1) {
              if (this.field_gc > -1 &&
                this.field_C > -1 &&
                ~this.controlledPlayerId == ~this.battlefield.currentPlayer &&
                null == this.spellConfirmation) {
                BattleCharacter.field_h[uc.spellDefinitions[this.field_gc][2]].h(AiPlanningStrategy.pointerX + 12, 12 + ko.pointerY);
                km.field_h[1].h(AiPlanningStrategy.pointerX + 10, ko.pointerY + 10);
              }
              if (this.field_mb ||
                ~this.battlefield.currentPlayer == ~this.controlledPlayerId &&
                this.remainingTurnTicks <= 0 &&
                !this.field_z) {
                ChatMessage.field_s.g(8 + AiPlanningStrategy.pointerX, ko.pointerY + 8);
              }
              this.b((byte) 120);
            }
            boolean decompiledFrameCompleted0 = true;
            if (0 <= this.controlledPlayerId &&
              this.field_r) {
              var4_ref_ac = (ac) (this.field_Ub.first((byte) 124));
              while (var4_ref_ac != null) {
                var4_ref_ac.a(0, 0, (byte) -29);
                var4_ref_ac = (ac) (this.field_Ub.next((byte) 123));
                if (var10 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if ((decompiledFrameCompleted0) && (var3_intLifetime1 == 0 &&
                !this.battlefield.field_L)) {
                TrianglePulse.field_f.g(200, 19);
              }
            }
            if (decompiledFrameCompleted0) {
              this.a(25167);
            }
            if (this.battleTutorial != null) {
              this.battleTutorial.draw((byte) 21);
            }
            if (this.field_E &&
              CoatOfArms.field_e) {
              if (this.controlledPlayerId > -1) {
                var4Lifetime1 = 16777215;
                if (~this.field_Bb != ~this.battlefield.playerMana[this.controlledPlayerId] &&
                  this.field_Ub.isEmpty(false)) {
                  var4Lifetime1 = 16711680;
                }
                en.field_E.c(Integer.toString(this.field_Bb), 180, 3 * en.field_E.field_H + 25, var4Lifetime1, 0);
              }
              if (this.field_lb) {
                var4Lifetime1Lifetime1 = this.battlefield.computeStateChecksum(true, this.controlledPlayerId);
                stackIn_226_0 = (RadialSummonMenu.field_d == var4Lifetime1Lifetime1) ? 0 : 1;
                var5Lifetime1 = stackIn_226_0;
                en.field_E.c(Integer.toString(var4Lifetime1Lifetime1, 16) + " (client)", 320, 40, 16777215, -1);
                en.field_E.c(Integer.toString(RadialSummonMenu.field_d, 16) + " (server)", 320, en.field_E.field_H + 40, 16777215, -1);
                if (var5Lifetime1 != 0) {
                  stackIn_233_0 = (this.a((byte) 101)) ? 8421631 : 16711680;
                  var6Lifetime1 = stackIn_233_0;
                  en.field_E.c(Integer.toString(var4Lifetime1Lifetime1 ^ RadialSummonMenu.field_d, 16) + " (diff)", 320, en.field_E.field_H * 2 + 40, var6Lifetime1, -1);
                }
                en.field_E.c(Integer.toString(this.remainingTurnTicks), 64, 35 + en.field_E.field_H * 3, 16777215, -1);
                en.field_E.b(Integer.toString(this.field_cc) + "," + Integer.toString(this.field_eb), 20, 150, 16777215, -1);
              }
              en.field_E.b(Integer.toString(this.field_h), 20, 140, 16777215, -1);
              stackIn_238_0 = en.field_E;
              stackIn_238_1 = new StringBuilder().append("total hurt: ").append(this.battlefield.damageTakenByPlayer[this.controlledPlayerId]).append(" lost a unit? ");
              stackIn_239_2 = !(0 >= this.battlefield.unitLossCounts[this.controlledPlayerId]);
              ((tu) (Object) stackIn_238_0).b(((StringBuilder) (Object) stackIn_238_1).append(stackIn_239_2).toString(), 20, 460, 16777215, 1);
              en.field_E.b("scroll lock? " + this.cameraFocusPending, 20, 470, 16777215, 1);
              SoftwareRaster.b(150, 100, 434, 145, 16711935);
            }
            return;
          }
          SoftwareRaster.b();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ic.R(" + param0 + ',' + param1 + ')');
        }
    }

    private final void w(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_kb = this.field_kb - 1;
          if (param0 != 39) {
            field_f = 79;
          }
          if (this.field_kb == 0) {
            RadialSummonMenu.$cfr$intArgs$a$6d836999ad61(127, UnitLossCondition.battlefieldThemes[this.battlefield.mapTheme].chooseAmbientSound(param0 - 74));
          }
          if (0 >= this.field_kb) {
            this.field_kb = 50 + AttackEvent.nextBoundedInt(false, 200, vv.field_b);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.LB(" + param0 + ')');
        }
    }

    private final String a(String param0, int param1, int param2) {
        String stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackIn_16_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        try {
          var4_int = this.battlefield.i(param1, -12710);
          var5 = this.battlefield.collectedManaTarget;
          var6 = Integer.toString(var4_int);
          var7 = Integer.toString(var5);
          var8 = Integer.toString(this.battlefield.getStructureIncome(-99, param1));
          if (!this.battlefield.field_r) {
            stackIn_4_0 = param0 + " - " + fo.a(param2 + 255074220, dr.field_w, new String[]{var8});
            return stackIn_4_0;
          }
          if (param2 != -255069420) {
            this.b(-7, (byte) -110, -122);
          }
          var9 = this.a((byte) -70, param1);
          if (var9 == 1) {
            stackIn_10_0 = param0 + " - " + fo.a(4800, cr.field_bb, new String[]{var6, var7, var8});
            return stackIn_10_0;
          }
          if (var9 <= 3 &&
            var9 > 1) {
            stackIn_16_0 = param0 + " - " + fo.a(4800, TutorialLayout.field_c, new String[]{var6, var7, var8, Integer.toString(var9)});
            return stackIn_16_0;
          }
          stackIn_18_0 = param0 + " - " + fo.a(4800, lu.field_v, new String[]{var6, var7, var8});
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ic.GD(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(int param0, int param1) {
        int stackIn_19_0 = 0;
        MovementPlanner stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        boolean stackIn_36_2 = false;
        MovementPlanner stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        boolean stackIn_41_2 = false;
        boolean stackIn_73_1 = false;
        int stackIn_141_0 = 0;
        Unit stackIn_155_0 = null;
        int stackIn_195_0 = 0;
        boolean stackIn_220_0 = false;
        boolean stackIn_251_0 = false;
        boolean stackIn_262_0 = false;
        int stackIn_276_0 = 0;
        int stackIn_276_1 = 0;
        boolean stackIn_303_0 = false;
        MovementPlanner stackIn_313_0 = null;
        boolean stackIn_314_1 = false;
        MovementPlanner stackIn_317_0 = null;
        int stackIn_317_1 = 0;
        boolean stackIn_318_2 = false;
        int stackIn_322_0 = 0;
        boolean stackIn_336_1 = false;
        int stackIn_367_0 = 0;
        int stackIn_367_1 = 0;
        int stackIn_413_0 = 0;
        int stackIn_413_1 = 0;
        boolean stackIn_417_0 = false;
        int stackIn_428_0 = 0;
        boolean stackIn_432_0 = false;
        int stackIn_457_0 = 0;
        Battlefield stackIn_597_0 = null;
        int stackIn_597_1 = 0;
        boolean stackIn_600_2 = false;
        MovementPlanner stackIn_633_0 = null;
        int stackIn_633_1 = 0;
        boolean stackIn_634_2 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_302_0;
        boolean stackOut_416_0;
        boolean stackOut_431_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        UnitInfoPopup var7_ref_fi = null;
        int var8 = 0;
        int var9 = 0;
        Unit var9_ref_jd = null;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        Unit var10_ref_jd = null;
        int var11 = 0;
        EventPresenter var11_ref_vb = null;
        NodeDeque var11_ref_at = null;
        int var12 = 0;
        Unit var12_ref_jd = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_367_0Lifetime1;
        int stackIn_367_1Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var7Lifetime2;
        int var8Lifetime4;
        int var9Lifetime3;
        int var10Lifetime3;
        int var10Lifetime1Lifetime1;
        int var10Lifetime1Lifetime2;
        int var10Lifetime1Lifetime3;
        int var11Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        int var13Lifetime1Lifetime2;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 < 89) {
            return;
          }
          boolean decompiledFrameRemainder8 = true;
          var3_int = so.field_b.field_a;
          var4 = so.field_b.field_g;
          var5 = null;
          if (this.selectedUnit != null && (~this.controlledPlayerId == ~this.selectedUnit.ownerPlayer ||
            !this.movementPlanner.otherPlayerPreview) && (!this.field_m &&
            !this.field_F)) {
            stackIn_19_0 = 1;
            decompiledFrameRemainder8 = false;
          }
          else {
            stackIn_19_0 = 0;
          }
          boolean decompiledFrameRemainder7 = true;
          var6 = stackIn_19_0;
          if (16 == param0) {
            boolean decompiledFrameRemainder5 = true;
            this.camera.screenPosition[0] = AiPlanningStrategy.pointerX;
            this.camera.screenPosition[1] = ko.pointerY;
            this.camera.screenToGrid(false);
            this.camera.projectModelAnchor(9470337);
            var7 = this.camera.gridPosition[0];
            var8 = this.camera.gridPosition[1];
            if (this.field_gc <= -1) {
              this.field_ic = -1;
              decompiledFrameRemainder5 = (var6 != 0);
              if ((decompiledFrameRemainder5) &&
                (decompiledFrameRemainder5 = !(this.selectedUnit.movementSpent))) {
                boolean decompiledFrameRemainder4 = true;
                if (this.selectedUnit.hasMovementTarget(-28467)) {
                  stackIn_35_0 = this.movementPlanner;
                  stackIn_35_1 = this.selectedUnit.D(-110);
                  stackIn_36_2 = (null != this.field_oc);
                  ((MovementPlanner) (Object) stackIn_35_0).selectTarget(stackIn_35_1, stackIn_36_2, this.selectedUnit.a(false), (byte) 77);
                  decompiledFrameRemainder4 = (var16 != 0);
                }
                if (decompiledFrameRemainder4) {
                  this.camera.screenPosition[0] = AiPlanningStrategy.pointerX;
                  this.camera.screenPosition[1] = ko.pointerY;
                  this.camera.screenToGrid(false);
                  var9 = this.camera.gridPosition[0];
                  var10 = this.camera.gridPosition[1];
                  stackIn_40_0 = this.movementPlanner;
                  stackIn_40_1 = var10;
                  stackIn_41_2 = (null != this.field_oc);
                  ((MovementPlanner) (Object) stackIn_40_0).selectTarget(stackIn_40_1, stackIn_41_2, var9, (byte) -125);
                }
                this.camera.screenPosition[0] = AiPlanningStrategy.pointerX;
                this.camera.screenPosition[1] = ko.pointerY;
                this.camera.screenToGrid(false);
                this.camera.projectModelAnchor(9470337);
                decompiledFrameRemainder5 = (var16 != 0);
              }
            }
            if ((decompiledFrameRemainder5) && (this.field_cc != var7 ||
              this.field_eb != var8)) {
              if (var7 < 0 ||
                var8 < 0 ||
                !(var7 < this.battlefield.mapWidth) ||
                !(this.battlefield.mapHeight > var8)) {
                this.field_cc = -1;
                decompiledFrameRemainder5 = (var16 != 0);
              }
              if (decompiledFrameRemainder5) {
                this.field_cc = var7;
                this.field_eb = var8;
                if (-1 < this.field_gc) {
                  stackIn_73_1 = (de.getSpellCastError((byte) 122, this.field_eb, this.battlefield, this.field_cc, this.field_gc, this.controlledPlayerId) == null);
                  this.field_rb = stackIn_73_1;
                }
                if (this.field_gc != 44) {
                  this.field_Cb = -1;
                  if (var16 != 0) {
                    this.field_Cb = this.battlefield.getTerrainCrossingDirection(this.field_eb, 2056, this.field_cc);
                  }
                } else {
                  this.field_Cb = this.battlefield.getTerrainCrossingDirection(this.field_eb, 2056, this.field_cc);
                }
                if (this.field_Cb == -1) {
                  this.field_ic = uc.spellDefinitions[this.field_gc][7];
                  decompiledFrameRemainder5 = (var16 != 0);
                }
                if (decompiledFrameRemainder5) {
                  var9Lifetime3 = this.battlefield.getNormalizedTerrainAt(this.field_eb, -101, this.field_cc);
                  var10 = this.field_cc;
                  var11 = this.field_eb;
                  if (var9Lifetime3 == -1) {
                    this.field_ic = 0;
                    this.field_rb = false;
                  }
                  if (var9Lifetime3 != -1 ||
                    var16 != 0) {
                    this.field_ic = -1;
                    while (var9Lifetime3 == this.battlefield.getNormalizedTerrainAt(var11, -76, var10)) {
                      if (var16 != 0) {
                        break;
                      }
                      regionExit1: {
                        boolean decompiledFrameRemainder6 = true;
                        boolean decompiledFrameRemainder3 = true;
                        var12 = this.field_Cb;
                        if (var12 != 1 ||
                          var16 != 0) {
                          if ((var12 != 0 ||
                            var16 != 0) &&
                            (decompiledFrameRemainder3 = (var12 != 2))) {
                            if (3 != var12) {
                              break regionExit1;
                            }
                            decompiledFrameRemainder6 = false;
                          }
                        } else {
                          var11--;
                          break regionExit1;
                        }
                        if ((decompiledFrameRemainder6) &&
                          (decompiledFrameRemainder3)) {
                          var10++;
                          break regionExit1;
                        }
                        if (decompiledFrameRemainder6) {
                          var11++;
                          break regionExit1;
                        }
                        var10--;
                      }
                      this.field_ic = this.field_ic + 1;
                    }
                  }  }
              }
            }
            var9_ref_jd = this.battlefield.getUnitAt(var8, true, var7);
            if (var7 < 0 ||
              0 > var8 ||
              !(this.battlefield.mapWidth > var7) ||
              !(this.battlefield.mapHeight > var8)) {
              this.field_cc = -1;
            }
            var7Lifetime2 = this.camera.targetPosition[0];
            var8Lifetime4 = this.camera.targetPosition[1];
            stackIn_141_0 = (this.selectedUnit != var9_ref_jd) ? 0 : 1;
            var10Lifetime3 = stackIn_141_0;
            var11_ref_vb = (EventPresenter) (this.eventPresenters.first((byte) 97));
            scanLoop2: while (true) {
              if (null != var11_ref_vb) {
                stackIn_155_0 = var9_ref_jd;
                if (var16 == 0) {
                  if (stackIn_155_0 == var11_ref_vb.event.unit) {
                    var10Lifetime3 = 1;
                  }
                  var11_ref_vb = (EventPresenter) (this.eventPresenters.next((byte) 123));
                  continue;
                }
              } else {
                if (var10Lifetime3 != 0) {
                  break scanLoop2;
                }
                stackIn_155_0 = var9_ref_jd;
              }
              var5 = stackIn_155_0;
              break;
            }
            if (null != var5) {
              this.field_o.addLast((byte) -119, (IntrusiveNode) (new UnitInfoPopup((Unit) (var5), 40 + (var3_int >> 1) + var7Lifetime2, -40 + var8Lifetime4 + (var4 >> 1))));
            }
            decompiledFrameRemainder7 = false;
          }
          else {
            this.field_cc = -1;
          }
          if (!this.field_lb && (this.controlledPlayerId != this.battlefield.currentPlayer ||
            this.field_bb &&
            !this.field_Db)) {
            this.field_oc = null;
            this.movementPlanner.clearPath(107);
            this.field_y = -2;
            if (null != this.selectedUnit) {
              this.a(false, 58, (Unit) null);
            }
          }
          if (null != mu.field_a) {
            return;
          }
          var7_ref_fi = (UnitInfoPopup) (this.field_o.first((byte) 97));
          scanLoop3: while (true) {
            if (null != var7_ref_fi) {
              var8Lifetime1 = 0;
              if (var16 == 0) {
                if (var5 == var7_ref_fi.unit) {
                  var5 = null;
                  var8Lifetime1 = 1;
                }
                var7_ref_fi.advanceAnimation((byte) -111, var8Lifetime1 != 0);
                var7_ref_fi = (UnitInfoPopup) (this.field_o.next((byte) 123));
                continue;
              }
            } else {
              if (1 == DeployEvent.pointerPressButton) {
                stackIn_195_0 = 1;
                break scanLoop3;
              }
            }
            stackIn_195_0 = 0;
            break;
          }
          var7Lifetime1 = stackIn_195_0;
          if (DualLinkedNode.field_o) {
            param0 = 4;
            var7Lifetime1 = 1;
          }
          boolean decompiledFrameRemainder12 = true;
          if (var7Lifetime1 != 0) {
            var8Lifetime2 = BattleTutorial.pointerPressX;
            var9Lifetime1 = TeleportAction.pointerPressY;
            this.trackCampaignMetrics(true);
            if (this.field_V) {
              this.field_j = 0;
              this.field_V = false;
              mu.field_a = new cg();
              qc.field_j = 0;
              return;
            }
            if (18 == param0) {
              ((EventPresenter) (this.eventPresenters.first((byte) 122))).presentation.requestFinish(105);
              return;
            }
            if (param0 == 1) {
              this.battleTutorial.activateButton(false);
              return;
            }
            if (param0 == 0) {
              return;
            }
            if (param0 == 20) {
              stackIn_220_0 = !(kt.field_l);
              kt.field_l = stackIn_220_0;
              return;
            }
            if (param0 == 24) {
              this.l((byte) 108);
              return;
            }
            if (param0 == 27) {
              this.requestSpellCast(this.spellConfirmation.selectionMode, this.spellConfirmation.tileY, this.spellConfirmation.spellId, 2, true, this.spellConfirmation.tileX);
              this.spellConfirmation = null;
            }
            if (param0 == 28) {
              this.spellConfirmation = null;
            }
            if (param0 == 19) {
              if (this.field_lb) {
                CipherPacketBuffer.a(true, -5, 1, jt.field_a);
                if (var16 == 0) {
                  return;
                }
              }
              this.d(122, true);
              return;
            }
            if (param0 == 2) {
              stackIn_251_0 = !(ma.field_Z);
              ma.field_Z = stackIn_251_0;
              if (ma.field_Z) {
                s.field_d = 0;
              }
              return;
            }
            if (26 == param0) {
              stackIn_262_0 = !(qa.field_F);
              qa.field_F = stackIn_262_0;
              return;
            }
            if (param0 == 3) {
              var10Lifetime1 = 0;
              var11Lifetime1 = 0;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (var11Lifetime1 >= 6))) {
                stackIn_276_0 = -1;
                stackIn_276_1 = ~eb.a((byte) -84, this.field_Y[var11Lifetime1 + 1]);
                if (var16 == 0) {
                  if (stackIn_276_0 > stackIn_276_1) {
                    var10Lifetime1++;
                  }
                  var11Lifetime1++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                stackIn_276_0 = var4;
                stackIn_276_1 = -this.f(128, this.g(2));
              }
              var11Lifetime1 = stackIn_276_0 + stackIn_276_1;
              var12Lifetime1 = 0;
              var13 = 0;
              while (var13 < 6) {
                if (eb.a((byte) -77, this.field_Y[var13 + 1]) > 0) {
                  var14 = var3_int / 2 + (int)(140.0 * Math.sin(3.141592653589793 * (double)var12Lifetime1 * 2.0 / (double)var10Lifetime1));
                  var15 = (int)(-20.0 + (-Math.cos(2.0 * (3.141592653589793 * (double)var12Lifetime1) / (double)var10Lifetime1) * (double)(140 - var11Lifetime1 / 3) + (double)(var4 / 2)) - (double)(var11Lifetime1 / 2));
                  if (var13 != this.field_e[0] &&
                    ~var13 != ~this.field_e[1] &&
                    (var15 - var9Lifetime1) * (-var9Lifetime1 + var15) + (-var8Lifetime2 + var14) * (var14 - var8Lifetime2) < 1024 &&
                    this.field_Ob < 3) {
                    this.field_e[this.field_Ob] = var13;
                    this.field_dc[this.field_Ob] = 0;
                    this.field_Ob = this.field_Ob + 1;
                    RadialSummonMenu.$cfr$intArgs$a$6d836999ad61(37, ClientUiNode.field_v[15]);
                    if (var16 == 0) {
                      return;
                    }
                  }
                  var12Lifetime1++;
                }
                var13++;
                if (var16 == 0) {
                  continue;
                }
                break;
              }
              return;
            }
            if (param0 == 4 &&
              this.a(true)) {
              var10Lifetime1Lifetime1 = 0;
              var11_ref_at = this.battlefield.unitsByPlayer[this.battlefield.currentPlayer];
              var12_ref_jd = (Unit) (var11_ref_at.first((byte) 113));
              while (true) {
                if (null == var12_ref_jd) {
                  stackIn_322_0 = var10Lifetime1Lifetime1;
                  break;
                }
                stackOut_302_0 = var12_ref_jd.movementSpent;
                stackIn_322_0 = stackOut_302_0 ? 1 : 0;
                stackIn_303_0 = stackOut_302_0;
                if (var16 == 0) {
                  if (!stackIn_303_0 &&
                    var12_ref_jd.hasMovementTarget(-28467)) {
                    stackIn_313_0 = this.movementPlanner;
                    stackIn_314_1 = (this.field_oc == null);
                    ((MovementPlanner) (Object) stackIn_313_0).prepareForUnit(stackIn_314_1, 70, this.controlledPlayerId, var12_ref_jd, -1, -1);
                    stackIn_317_0 = this.movementPlanner;
                    stackIn_317_1 = var12_ref_jd.D(-70);
                    stackIn_318_2 = (null != this.field_oc);
                    ((MovementPlanner) (Object) stackIn_317_0).selectTarget(stackIn_317_1, stackIn_318_2, var12_ref_jd.a(false), (byte) -112);
                    this.f((byte) -123);
                    if (var12_ref_jd.movementSpent) {
                      var10Lifetime1Lifetime1 = 1;
                    }
                  }
                  var12_ref_jd = (Unit) (var11_ref_at.next((byte) 123));
                  continue;
                }
                break;
              }
              if (stackIn_322_0 != 0) {
                return;
              }
              this.field_jc = false;
              this.field_bc = true;
              this.a(14, -128);
              this.r((byte) -81);
              return;
            }
            if (param0 == 5 &&
              this.battlefield.mapSizeSetting != 4) {
              stackIn_336_1 = !(this.field_tb);
              this.field_tb = stackIn_336_1;
              RadialSummonMenu.$cfr$intArgs$a$6d836999ad61(63, ClientUiNode.field_v[18]);
              return;
            }
            if (param0 == 23) {
              this.c(false);
              this.a(19, -119);
              da.a((byte) -90, 0);
            }
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameCompleted3 = true;
            boolean decompiledFrameCompleted2 = true;
            regionExit4: {
              if (param0 == 25) {
                if (!this.battlefield.teamGame) {
                  var10Lifetime1Lifetime2 = 10;
                  var11Lifetime1Lifetime1 = 0;
                  while (this.battlefield.playerCount > var11Lifetime1Lifetime1) {
                    stackIn_413_0 = var11Lifetime1Lifetime1;
                    stackIn_413_1 = this.battlefield.currentPlayer;
                    if (var16 != 0) {
                      decompiledFrameCompleted3 = false;
                      break;
                    }
                    if (stackIn_413_0 == stackIn_413_1) {
                      if (IterableDualNodeDeque.isPointerInBounds(-33, var3_int - 64, var3_int, var10Lifetime1Lifetime2, 60 + var10Lifetime1Lifetime2)) {
                        hc.a(var11Lifetime1Lifetime1, false);
                        this.field_Pb = true;
                        return;
                      }
                      var10Lifetime1Lifetime2 += 60;
                    } else {
                      if (IterableDualNodeDeque.isPointerInBounds(-33, -50 + var3_int, var3_int, var10Lifetime1Lifetime2, 30 + var10Lifetime1Lifetime2)) {
                        hc.a(var11Lifetime1Lifetime1, false);
                        this.field_Pb = true;
                      }
                      var10Lifetime1Lifetime2 += 30;
                    }
                    var11Lifetime1Lifetime1++;
                  }
                  if ((decompiledFrameCompleted3) &&
                    (var16 == 0)) {
                    break regionExit4;
                  }
                }
                if (decompiledFrameCompleted3) {
                  var10Lifetime1Lifetime2 = 80;
                  var11Lifetime1Lifetime1 = 0;
                  while (true) {
                    stackIn_367_0 = ~this.battlefield.teamCount;
                    stackIn_367_1 = ~var11Lifetime1Lifetime1;
                    if (stackIn_367_0 >= stackIn_367_1) {
                      break;
                    }
                    stackIn_413_0 = this.battlefield.currentPlayer;
                    stackIn_413_1 = -1;
                    if (var16 != 0) {
                      decompiledFrameCompleted2 = false;
                      break;
                    }
                    if (stackIn_413_0 > stackIn_413_1 &&
                      this.battlefield.getPlayerTeamIndex(this.battlefield.currentPlayer, -1) == var11Lifetime1Lifetime1) {
                      var12Lifetime1Lifetime1 = 0;
                      while (var12Lifetime1Lifetime1 < this.battlefield.playerCount) {
                        stackIn_367_0Lifetime1 = var12Lifetime1Lifetime1;
                        stackIn_367_1Lifetime1 = this.battlefield.currentPlayer;
                        if (stackIn_367_0Lifetime1 != stackIn_367_1Lifetime1) {
                          if (this.battlefield.getPlayerTeamIndex(var12Lifetime1Lifetime1, -1) == var11Lifetime1Lifetime1) {
                            if (IterableDualNodeDeque.isPointerInBounds(-33, var3_int - 60 - 14, var3_int - 58, var10Lifetime1Lifetime2, 30 + var10Lifetime1Lifetime2)) {
                              hc.a(var12Lifetime1Lifetime1, false);
                              this.field_Pb = true;
                              return;
                            }
                            var10Lifetime1Lifetime2 += 30;
                          }
                        } else {
                          if (IterableDualNodeDeque.isPointerInBounds(-33, var3_int - 60 - 28, -28 + var3_int, var10Lifetime1Lifetime2, 60 + var10Lifetime1Lifetime2)) {
                            hc.a(var12Lifetime1Lifetime1, false);
                            this.field_Pb = true;
                            return;
                          }
                          var10Lifetime1Lifetime2 += 60;
                        }
                        var12Lifetime1Lifetime1++;
                      }
                      var10Lifetime1Lifetime2 += 5;
                      var10Lifetime1Lifetime2 += 40;
                    } else {
                      var12Lifetime1Lifetime1 = -(this.battlefield.playerCount * 30 >> 2) + (var3_int - 60);
                      var13Lifetime1 = 0;
                      while (this.battlefield.playerCount > var13Lifetime1) {
                        stackIn_367_0Lifetime1 = var11Lifetime1Lifetime1;
                        stackIn_367_1Lifetime1 = this.battlefield.getPlayerTeamIndex(var13Lifetime1, -1);
                        if (stackIn_367_0Lifetime1 == stackIn_367_1Lifetime1) {
                          if (IterableDualNodeDeque.isPointerInBounds(-33, var12Lifetime1Lifetime1, var12Lifetime1Lifetime1 + 30, var10Lifetime1Lifetime2, 30 + var10Lifetime1Lifetime2)) {
                            hc.a(var13Lifetime1, false);
                            this.field_Pb = true;
                            return;
                          }
                          var12Lifetime1Lifetime1 += 30;
                        }
                        var13Lifetime1++;
                      }
                      var10Lifetime1Lifetime2 += 35;
                      var10Lifetime1Lifetime2 += 40;
                    }
                    var11Lifetime1Lifetime1++;
                  }
                }
              }
            }
            if (((decompiledFrameCompleted3) && (decompiledFrameCompleted2)) &&
              (decompiledFrameRemainder2 = !(this.controlledPlayerId < 0))) {
              stackIn_413_0 = param0;
              stackIn_413_1 = 21;
            }
            if (decompiledFrameRemainder2) {
              boolean decompiledFrameCompleted1 = true;
              if (stackIn_413_0 == stackIn_413_1) {
                var10Lifetime1Lifetime2 = 0;
                while (5 > var10Lifetime1Lifetime2) {
                  var11Lifetime1Lifetime1 = (int)(Math.sin(3.141592653589793 * (double)var10Lifetime1Lifetime2 / 4.0) * 64.0) + 130;
                  var12Lifetime1Lifetime1 = (int)(-64.0 * Math.cos(3.141592653589793 * (double)var10Lifetime1Lifetime2 / 4.0)) - (-this.o(126) + 95);
                  stackOut_416_0 = TabbedPanel.a(var12Lifetime1Lifetime1, var11Lifetime1Lifetime1, 22, false);
                  stackIn_428_0 = stackOut_416_0 ? 1 : 0;
                  stackIn_417_0 = stackOut_416_0;
                  if (var16 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_417_0) {
                    if (-1 == this.battlefield.equippedSpellIds[this.controlledPlayerId][var10Lifetime1Lifetime2]) {
                      return;
                    }
                    this.e(this.battlefield.equippedSpellIds[this.controlledPlayerId][var10Lifetime1Lifetime2], var10Lifetime1Lifetime2, 98);
                  }
                  var10Lifetime1Lifetime2++;
                }
              }
              if (decompiledFrameCompleted1) {
                stackIn_428_0 = 22;
              }
              boolean decompiledFrameCompleted0 = true;
              if (stackIn_428_0 == param0) {
                var10Lifetime1Lifetime2 = -1;
                while (var10Lifetime1Lifetime2 < 6) {
                  stackOut_431_0 = TabbedPanel.a(this.o(125) - 82, 45 * var10Lifetime1Lifetime2 + 230, 22, false);
                  stackIn_457_0 = stackOut_431_0 ? 1 : 0;
                  stackIn_432_0 = stackOut_431_0;
                  if (var16 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  boolean decompiledFrameRemainder9 = true;
                  if (stackIn_432_0) {
                    if (-1 != var10Lifetime1Lifetime2) {
                      if (var10Lifetime1Lifetime2 != 5) {
                        if (((0 == this.field_g)) &&
                          ((this.field_b == 0))) {
                          this.e(th.floorModWithOffset(var10Lifetime1Lifetime2 + this.field_Lb, 1, 135), -1, 127);
                        }
                      } else {
                        this.field_b = this.field_b + 1;
                      }
                      decompiledFrameRemainder9 = false;
                    }
                    else {
                      this.field_b = this.field_b - 1;
                    }
                  }
                  var10Lifetime1Lifetime2++;
                }
              }
              if (decompiledFrameCompleted0) {
                stackIn_457_0 = 6;
              }
              if (stackIn_457_0 == param0) {
                if (~this.selectedUnit.ownerPlayer != ~this.controlledPlayerId) {
                  this.a(false, IndexedSpriteBase.field_a, (byte) -118);
                  return;
                }
                if (this.selectedUnit.movementSpent ||
                  !(this.selectedUnit.attacksRemaining > 0)) {
                  this.a(false, kv.field_J, (byte) -124);
                  if (var16 == 0) {
                    return;
                  }
                }
                boolean decompiledFrameRemainder1 = true;
                boolean decompiledFrameRemainder11 = true;
                boolean decompiledFrameRemainder10 = true;
                boolean decompiledFrameRemainder0 = true;
                var10Lifetime1Lifetime2 = this.selectedUnit.unitType;
                if ((var10Lifetime1Lifetime2 != 39) &&
                  (decompiledFrameRemainder0 = (34 != var10Lifetime1Lifetime2)) &&
                  (decompiledFrameRemainder10 = (17 != var10Lifetime1Lifetime2)) &&
                  (decompiledFrameRemainder11 = (var10Lifetime1Lifetime2 != 72 ||
                  var16 != 0))) {
                  if (var10Lifetime1Lifetime2 != 7) {
                    return;
                  }
                  decompiledFrameRemainder1 = (var16 != 0);
                }
                if ((decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder0)) {
                  this.h(-1, 38);
                  if (var16 == 0) {
                    return;
                  }
                }
                if ((decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder1)) {
                  if (this.selectedUnit.packedFlag8) {
                    return;
                  }
                  this.h(-1, -124);
                  if (var16 == 0) {
                    return;
                  }
                }
                if ((decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder1)) {
                  if (this.selectedUnit.hasMovementFlag1(false)) {
                    return;
                  }
                  this.h(-1, 39);
                  if (var16 == 0) {
                    return;
                  }
                }
                if (decompiledFrameRemainder1) {
                  this.h(-1, -115);
                  if (var16 == 0) {
                    return;
                  }
                }
                if (!this.selectedUnit.packedFlag8) {
                  this.h(-1, 88);
                }
                return;
              }
              var10_ref_int__ = this.battlefield.chosenGods[this.controlledPlayerId];
              if (param0 >= 7 &&
                param0 < (7 + var10_ref_int__.length)) {
                if (var10_ref_int__.length != 3) {
                  this.h(var10_ref_int__[param0 - 7], -127);
                  return;
                }
                if (param0 == 7) {
                  this.h(this.battlefield.chosenGods[this.controlledPlayerId][1], 63);
                  return;
                }
                if (8 == param0) {
                  this.h(this.battlefield.chosenGods[this.controlledPlayerId][2], -114);
                  return;
                }
                if (param0 == 9) {
                  this.h(this.battlefield.chosenGods[this.controlledPlayerId][0], 112);
                  return;
                }
              }
              if (param0 == 10) {
                this.h(2, -125);
                return;
              }
              if (param0 == 11) {
                this.h(1, 89);
                return;
              }
              if (param0 == 12) {
                this.h(3, -120);
                return;
              }
              if (param0 == 13) {
                this.h(0, -114);
                return;
              }
              if (param0 == 14) {
                this.camera.gridPosition[1] = this.field_ec;
                this.camera.gridPosition[0] = this.field_X;
                this.camera.projectModelAnchor(9470337);
                var11Lifetime1Lifetime1 = 24 + this.camera.screenPosition[0];
                var12Lifetime1Lifetime1 = this.camera.screenPosition[1];
                var13Lifetime1Lifetime1 = -1;
                if (this.godMenu != null) {
                  var13Lifetime1Lifetime1 = this.godMenu.getChoiceAtPoint((byte) -122, TeleportAction.pointerPressY, var11Lifetime1Lifetime1 + 16, BattleTutorial.pointerPressX, var12Lifetime1Lifetime1 + 16);
                }
                if (-1 < var13Lifetime1Lifetime1) {
                  this.a(11, -119);
                  this.field_y = var13Lifetime1Lifetime1;
                  RadialSummonMenu.$cfr$intArgs$a$6d836999ad61(103, ClientUiNode.field_v[11]);
                  return;
                }
              }
              if (param0 == 15) {
                this.camera.gridPosition[0] = this.field_X;
                this.camera.gridPosition[1] = this.field_ec;
                this.camera.projectModelAnchor(9470337);
                var11Lifetime1Lifetime1 = this.camera.screenPosition[0] + 24;
                var12Lifetime1Lifetime1 = this.camera.screenPosition[1];
                var13Lifetime1Lifetime2 = this.unitMenus[this.field_y].getChoiceAtPoint((byte) -113, TeleportAction.pointerPressY, var11Lifetime1Lifetime1 + 16, BattleTutorial.pointerPressX, var12Lifetime1Lifetime1 + 16);
                if (this.field_lb &&
                  ~this.battlefield.localPlayer != ~this.battlefield.currentPlayer) {
                  var13Lifetime1Lifetime2 = -1;
                }
                if (var13Lifetime1Lifetime2 > -1) {
                  this.a(var13Lifetime1Lifetime2, 65, this.unitMenus[this.field_y].isSecondHalfHit((byte) 117, TeleportAction.pointerPressY, var12Lifetime1Lifetime1 + 16, var11Lifetime1Lifetime1 + 16, BattleTutorial.pointerPressX));
                  return;
                }
              }
            }
            if (16 == param0) {
              this.camera.screenPosition[0] = var8Lifetime2;
              this.camera.screenPosition[1] = var9Lifetime1;
              this.camera.screenToGrid(false);
              var9Lifetime1 = this.camera.gridPosition[1];
              var8Lifetime2 = this.camera.gridPosition[0];
              this.field_y = -2;
              if (!this.battlefield.field_X) {
                if (-1 < this.field_gc &&
                  this.selectedUnit == null) {
                  this.requestSpellCast(this.field_nc, var9Lifetime1, this.field_gc, 2, false, var8Lifetime2);
                  return;
                }
                stackIn_597_0 = this.battlefield;
                stackIn_597_1 = -1;
                stackIn_600_2 = (this.selectedUnit == null) || (this.selectedUnit.ownerPlayer != this.controlledPlayerId) || (this.field_lc);
                if (((Battlefield) (Object) stackIn_597_0).a(stackIn_597_1, stackIn_600_2, var8Lifetime2, var9Lifetime1, this.controlledPlayerId) && (this.selectedUnit == null ||
                  this.controlledPlayerId == this.selectedUnit.ownerPlayer ||
                  this.movementPlanner.otherPlayerPreview)) {
                  var10_ref_jd = this.battlefield.getUnitAt(var9Lifetime1, true, var8Lifetime2);
                  if (null != this.selectedUnit &&
                    Math.abs(-var8Lifetime2 + this.selectedUnit.tileX) + Math.abs(this.selectedUnit.tileY - var9Lifetime1) == 1 &&
                    this.field_lc &&
                    var10_ref_jd.unitType != 72) {
                    this.field_oc = this.selectedUnit;
                  }
                  if (!var10_ref_jd.presentationOwnsModel) {
                    this.a(true, 58, var10_ref_jd);
                  }
                  this.movementPlanner.clearPath(-54);
                  return;
                }
                if (var6 != 0) {
                  if (this.controlledPlayerId != this.battlefield.currentPlayer ||
                    !this.movementPlanner.selectionActive ||
                    this.movementPlanner.targetX != var8Lifetime2 ||
                    this.movementPlanner.targetY != var9Lifetime1) {
                    if (this.field_lc) {
                      return;
                    }
                    stackIn_633_0 = this.movementPlanner;
                    stackIn_633_1 = var9Lifetime1;
                    stackIn_634_2 = (null != this.field_oc);
                    ((MovementPlanner) (Object) stackIn_633_0).selectTarget(stackIn_633_1, stackIn_634_2, var8Lifetime2, (byte) 57);
                    if (this.movementPlanner.actionAllowed) {
                      this.a(18, -125);
                      da.a((byte) -102, 1);
                      if (var16 == 0) {
                        return;
                      }
                    }
                    da.a((byte) -123, 2);
                    if (var16 == 0) {
                      return;
                    }
                  }
                  var10Lifetime1Lifetime3 = var8Lifetime2 + var9Lifetime1 * this.battlefield.mapWidth;
                  if (this.selectedUnit.movementSpent ||
                    !(this.movementPlanner.movementCosts[var10Lifetime1Lifetime3] > this.movementPlanner.getMovementBudget(27732)) ||
                    (this.movementPlanner.attackTargetMask[var10Lifetime1Lifetime3] & 3) == 0 ||
                    null != this.battlefield.tiles[var10Lifetime1Lifetime3].occupant) {
                    this.f((byte) 77);
                  }
                  da.a((byte) -35, 1);
                  return;
                }
                if (var8Lifetime2 <= -1 ||
                  -1 >= var9Lifetime1 ||
                  !(var8Lifetime2 < this.battlefield.mapWidth) ||
                  !(var9Lifetime1 < this.battlefield.mapHeight)) {
                  this.a(-1, false, (byte) 54);
                  if (var16 != 0) {
                    this.a(var8Lifetime2 + var9Lifetime1 * this.battlefield.mapWidth, false, (byte) 46);
                  }
                } else {
                  this.a(var8Lifetime2 + var9Lifetime1 * this.battlefield.mapWidth, false, (byte) 46);
                }
                if (this.battlefield.currentPlayer == this.controlledPlayerId &&
                  this.battlefield.getSummoningGodMaskAt(var8Lifetime2, -27300, var9Lifetime1, this.controlledPlayerId) > 0) {
                  this.field_y = -1;
                  this.field_X = var8Lifetime2;
                  this.field_ec = var9Lifetime1;
                  this.field_hc = this.battlefield.getSummoningFavourAt(var9Lifetime1, (byte) 95, var8Lifetime2, this.controlledPlayerId);
                  this.field_Pb = false;
                  this.field_Xb = true;
                  this.a(10, -122);
                  RadialSummonMenu.$cfr$intArgs$a$6d836999ad61(101, ClientUiNode.field_v[11]);
                  decompiledFrameRemainder12 = (var16 != 0);
                }
                if (decompiledFrameRemainder12) {
                  this.field_sb = this.field_sb + 1;
                  var10Lifetime1Lifetime3 = this.battlefield.mapWidth * var9Lifetime1 + var8Lifetime2;
                  RadialSummonMenu.$cfr$intArgs$a$6d836999ad61(38, ClientUiNode.field_v[5]);
                  if (~this.field_nb != ~var10Lifetime1Lifetime3) {
                    this.field_sb = 1;
                    this.field_nb = var10Lifetime1Lifetime3;
                    if ((var16 != 0) && (this.field_sb >= 3 &&
                      this.controlledPlayerId > -1 &&
                      !this.field_bb)) {
                      this.a(false, ij.field_A, (byte) -125);
                    }
                  } else {
                    if (this.field_sb >= 3 &&
                      this.controlledPlayerId > -1 &&
                      !this.field_bb) {
                      this.a(false, ij.field_A, (byte) -125);
                    }
                  }
                }
              }
            }
          }
          if (DeployEvent.pointerPressButton == 2) {
            this.trackCampaignMetrics(true);
            this.field_U = TeleportAction.pointerPressY;
            this.field_t = BattleTutorial.pointerPressX;
          }
          if (0 == (eq.pointerButtonMask & 4) &&
            -1 != this.field_t) {
            var8Lifetime3 = AiPlanningStrategy.pointerX - this.field_t;
            var9Lifetime2 = -this.field_U + ko.pointerY;
            this.field_U = -1;
            this.field_t = -1;
            var10Lifetime2 = var8Lifetime3 * var8Lifetime3 + var9Lifetime2 * var9Lifetime2;
            if (var10Lifetime2 < 400 &&
              !this.field_bb) {
              this.field_lc = false;
              if (null != this.field_oc) {
                this.a(true, 58, this.field_oc);
                this.field_oc.resetMovementTarget(-1);
                this.field_oc = null;
                if (var16 != 0) {
                  this.a(true, 58, (Unit) null);
                }
              } else {
                this.a(true, 58, (Unit) null);
              }
              this.movementPlanner.clearPath(105);
              this.field_y = -2;
              if (this.field_gc > -1) {
                this.spellConfirmation = null;
                this.field_ic = -1;
                this.field_gc = -1;
                this.field_nc = -1;
                this.notifyTutorialInteraction(25, -1, -90);
              }
            }
          }
          if (lk.pointerChangedSnapshot) {
            this.field_C = AiPlanningStrategy.pointerX;
            this.field_Zb = ko.pointerY;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ic.SB(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean l(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var4Lifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var2_int = 1;
          this.field_Pb = param0;
          var3 = 0;
          this.field_Xb = false;
          var4 = this.battlefield.mapSizeSetting;
          if ((var4 != 0) &&
            (decompiledFrameRemainder0 = (var4 != 1 ||
            var8 != 0)) &&
            (decompiledFrameRemainder1 = (2 != var4)) &&
            (decompiledFrameRemainder3 = (var4 == 3))) {
            decompiledFrameRemainder2 = (var8 != 0);
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            var2_int = 10;
            var3 = 3;
            decompiledFrameRemainder3 = (var8 != 0);
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            var2_int = 7;
            decompiledFrameRemainder3 = (var8 != 0);
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            var3 = 7;
            var2_int = 5;
            decompiledFrameRemainder3 = (var8 != 0);
          }
          if (decompiledFrameRemainder3) {
            var3 = 15;
            var2_int = 3;
          }
          if (!IterableDualNodeDeque.isPointerInBounds(-33, var3 + (this.field_H - 220), var2_int * this.battlefield.mapWidth + this.field_H + (-220 + var3), var3 + 120, 120 + var3 + this.battlefield.mapHeight * var2_int)) {
            return false;
          }
          var4Lifetime1 = -var3 - (120 - ko.pointerY);
          var5 = AiPlanningStrategy.pointerX + 220 - var3 - this.field_H;
          var6 = (var5 + var4Lifetime1) * 40 / var2_int + 0;
          var7 = this.battlefield.mapWidth * 20 + (var4Lifetime1 - var5) * 20 / var2_int;
          this.camera.setWorldPosition(var6, var7, (byte) 68);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.BA(" + param0 + ')');
        }
    }

    private final void c(boolean param0) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_pb = this.field_pb + 1;
          if (1 == this.field_pb &&
            0 == this.battlefield.runeCapOption) {
            this.field_pb = this.field_pb + 1;
          }
          if (this.field_pb == 2 && (!this.field_P ||
            !br.field_f[82] ||
            !br.field_f[86])) {
            this.field_pb = 0;
          }
          if (this.field_pb == 3) {
            this.field_pb = 0;
          }
          this.field_gc = -1;
          if (param0) {
            return;
          }
          this.field_nc = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.P(" + param0 + ')');
        }
    }

    private final void f(byte param0) {
        RuntimeException decompiledCaughtException = null;
        PreparedAction var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (~this.controlledPlayerId != ~this.battlefield.currentPlayer) {
            return;
          }
          if (this.field_mb) {
            return;
          }
          if (this.remainingTurnTicks <= 0 &&
            !this.field_z) {
            return;
          }
          if (this.movementPlanner.actionAllowed) {
            boolean decompiledFrameRemainder0 = true;
            this.movementPlanner.selectionActive = false;
            if (this.field_lb) {
              if (this.field_oc == null) {
                this.movementPlanner.writeMovementPacket(true, vl.outgoingPacket);
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                this.movementPlanner.writeAttackMovementPacket(vl.outgoingPacket, (byte) -120, this.field_oc);
                if (var3 != 0) {
                  if (null == this.field_oc) {
                    var2 = this.movementPlanner.createActionRequest(this.controlledPlayerId, 43).prepareAction(90, this.battlefield);
                    if (var2 != null) {
                      var2.applyToBattlefield(64, this.battlefield);
                    }
                    new SphinxActionRequest(this.controlledPlayerId, this.field_oc.tileX, this.field_oc.tileY, this.movementPlanner.createActionRequest(this.controlledPlayerId, 50)).prepareAction(47, this.battlefield).applyToBattlefield(64, this.battlefield);
                  } else {
                    new SphinxActionRequest(this.controlledPlayerId, this.field_oc.tileX, this.field_oc.tileY, this.movementPlanner.createActionRequest(this.controlledPlayerId, 50)).prepareAction(47, this.battlefield).applyToBattlefield(64, this.battlefield);
                  }
                }
              }
            } else {
              boolean decompiledSharedTail0 = (null != this.field_oc);
              if (!decompiledSharedTail0) {
                var2 = this.movementPlanner.createActionRequest(this.controlledPlayerId, 43).prepareAction(90, this.battlefield);
                if (var2 != null) {
                  var2.applyToBattlefield(64, this.battlefield);
                }
                decompiledSharedTail0 = (var3 != 0);
              }
              if (decompiledSharedTail0) {
                new SphinxActionRequest(this.controlledPlayerId, this.field_oc.tileX, this.field_oc.tileY, this.movementPlanner.createActionRequest(this.controlledPlayerId, 50)).prepareAction(47, this.battlefield).applyToBattlefield(64, this.battlefield);
              }
            }
            if (this.movementPlanner.spellId > -1) {
              this.notifyTutorialInteraction(27, this.movementPlanner.spellId, -119);
            }
            this.a(false, 58, (Unit) null);
            this.field_oc = null;
          }
          var2_int = 127 / ((-64 - param0) / 54);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "ic.VC(" + param0 + ')');
        }
    }

    private final void r(byte param0) {
        Battlefield stackIn_29_0 = null;
        boolean stackIn_30_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = -67 % ((param0 - 0) / 59);
          this.spellConfirmation = null;
          if (null != this.battlefield.campaignMission) {
            this.saveCampaignQuicksave((byte) -64);
            if (null == this.aiPlanners[this.battlefield.currentPlayer]) {
              if (this.battlefield.b(this.battlefield.campaignMission.playerSlot, this.field_a, -1)) {
                this.battlefield.eliminatePlayer(10001, this.battlefield.campaignMission.playerSlot, false);
              }
              if (!this.field_a) {
                var3 = this.battlefield.g(-1);
                if (var3 > 0) {
                  fq.a(this.field_Nb, fo.a(4800, DeployRequest.field_x, new String[]{Integer.toString(var3)}), 0, true);
                }
              }
            }
            this.field_a = false;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_lb) {
            this.i(0);
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            while (true) {
              if (this.field_Ub.size(false) > 0) {
                ((ac) (this.field_Ub.first((byte) 120))).a(this.battlefield, -12614);
                if (var4 == 0) {
                  continue;
                }
              } else {
                stackIn_29_0 = this.battlefield;
                stackIn_30_1 = !(this.field_z);
                ((Battlefield) (Object) stackIn_29_0).b(stackIn_30_1, false, 30156);
                this.remainingTurnTicks = ce.turnDurationTicks[this.battlefield.turnDurationOption];
                this.field_ic = -1;
                this.field_nc = -1;
                this.field_gc = -1;
                this.field_eb = -1;
                this.field_cc = -1;
                this.field_Cb = -1;
                this.field_y = -2;
                this.movementPlanner.clearPath(-92);
              }
              break;
            }
            if (null != this.selectedUnit) {
              this.a(false, 58, (Unit) null);
            }
            this.field_F = false;
            this.controlledPlayerId = this.battlefield.currentPlayer;
            this.field_bc = false;
            this.field_m = false;
            this.field_lc = false;
            if (!this.field_z) {
              this.field_V = true;
              mu.field_a = new cg();
              qc.field_j = 0;
              var3 = this.battlefield.currentPlayer;
              if (var3 > -1) {
                this.field_kc = (Unit) (this.battlefield.unitsByPlayer[var3].first((byte) 112));
                if (this.field_kc != null) {
                  this.camera.snapToTile(this.field_kc.tileX + this.field_kc.tileY * this.battlefield.mapWidth, true);
                  this.field_Pb = true;
                }
              }
            }
            if (null != this.aiPlanners[this.battlefield.currentPlayer]) {
              this.aiPlanners[this.battlefield.currentPlayer].a((byte) -123);
              this.field_bb = true;
              this.field_j = 50;
              if (var4 != 0) {
                this.field_bb = false;
              }
            } else {
              this.field_bb = false;
            }
            if (this.field_z &&
              this.field_V) {
              this.field_V = false;
            }
            RadialSummonMenu.$cfr$intArgs$a$6d836999ad61(126, ClientUiNode.field_v[17]);
          }
          wt.field_G = false;
          ep.field_f = false;
          et.field_d = false;
          uu.field_b = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.VD(" + param0 + ')');
        }
    }

    private final int f(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 128) {
            this.camera = (BattleCamera) null;
          }
          if (param1 > CombatEvent.field_I.width) {
            stackIn_7_0 = so.field_b.field_g;
            return stackIn_7_0;
          }
          stackIn_9_0 = CombatEvent.field_I.screenY;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ic.G(" + param0 + ',' + param1 + ')');
        }
    }

    private final void g(byte param0) {
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int[][] stackIn_65_0 = null;
        int stackIn_66_1 = 0;
        int[][] stackIn_73_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.battlefield.mapSizeSetting == 4) {
            return;
          }
          if (this.field_H <= 0) {
            return;
          }
          var2_int = this.battlefield.mapSizeSetting;
          switch ((var12 == 0
            || var2_int == 0
            || var2_int == 3
            ) ? var2_int : -1) {
            case 0:
              CampaignRewardPreview.field_e.c(-242 + this.field_H, 100, 253, 247);
              if (var12 == 0) {
                break;
              }
            case 1:
              CampaignRewardPreview.field_e.c(-245 + this.field_H, 95, 260, 260);
              if (var12 == 0) {
                break;
              }
            case 2:
              CampaignRewardPreview.field_e.c(this.field_H - 240, 105, 253, 247);
              if (var12 == 0) {
                break;
              }
            case 3:
              CampaignRewardPreview.field_e.c(this.field_H - 232, 110, 230, 230);
            default:
              break;
          }
          var2_int = 0;
          var3 = 1;
          var4 = 0;
          var5 = this.battlefield.mapSizeSetting;
          switch ((var12 == 0
            || var5 == 1
            || var5 == 2
            || var5 == 3
            ) ? var5 : -1) {
            case 0:
              var4 = 3;
              var3 = 10;
              if (var12 == 0) {
                break;
              }
            case 1:
              var3 = 7;
              if (var12 == 0) {
                break;
              }
            case 2:
              var4 = 7;
              var3 = 5;
              if (var12 == 0) {
                break;
              }
            case 3:
              var3 = 3;
              var4 = 15;
            default:
              break;
          }
          var5 = 0;
          while (true) {
            stackIn_54_0 = this.battlefield.mapWidth;
            stackIn_54_1 = var5;
            if (stackIn_54_0 > stackIn_54_1) {
              stackIn_81_0 = 0;
              if (var12 == 0) {
                var6 = stackIn_81_0;
                while (var6 < this.battlefield.mapWidth) {
                  var7 = UnitLossCondition.battlefieldThemes[this.battlefield.mapTheme].terrainPreviewColours[this.battlefield.tiles[var2_int].terrainType];
                  stackIn_54_0 = this.battlefield.tiles[var2_int].ownerPlayer;
                  stackIn_54_1 = -1;
                  if (stackIn_54_0 > stackIn_54_1) {
                    stackIn_65_0 = op.field_c;
                    if (this.battlefield.teamGame) {
                      stackIn_66_1 = 1;
                    } else {
                      stackIn_66_1 = 0;
                    }
                    var7 = stackIn_65_0[stackIn_66_1][this.battlefield.getPlayerTeamIndex(this.battlefield.tiles[var2_int].ownerPlayer, -1)];
                  }
                  var8 = this.field_H + (-220 + var3 * var6) + var4;
                  var9 = var5 * var3 - (-120 - var4);
                  AttackEvent.field_y[this.battlefield.mapSizeSetting].b(var8, var9, var7);
                  if (this.battlefield.tiles[var2_int].occupant != null) {
                    stackIn_73_0 = op.field_c;
                    if (!this.battlefield.teamGame) {
                      stackIn_74_1 = 0;
                    } else {
                      stackIn_74_1 = 1;
                    }
                    var7 = stackIn_73_0[stackIn_74_1][this.battlefield.tiles[var2_int].occupant.ownerPlayer];
                    AttackEvent.field_y[this.battlefield.mapSizeSetting + 4].b(var8, var9, var7);
                    if (this.battlefield.tiles[var2_int].occupant.hasMovementFlag1(false)) {
                      var10 = -(80 * SocketResourceClient.b(uk.field_n << 8, 100) >> 16) + 255;
                      AttackEvent.field_y[4 + this.battlefield.mapSizeSetting].f(var8, var9, var10);
                    }
                  }
                  var2_int++;
                  var6++;
                }
                var5++;
                continue;
              }
            } else {
              var5 = IconTextComponent.l(26136);
              stackIn_81_0 = param0;
            }
            if (stackIn_81_0 < 116) {
              this.field_fb = 2;
            }
            regionExit1: {
              regionExit2: {
                regionExit3: {
                  regionExit4: {
                    var6 = BattleUnitRenderer.b(1);
                    var5 = var5 / 2;
                    var7 = var3 * (var5 + (20 * this.battlefield.mapWidth - var6)) / 40;
                    var8 = var3 * (-(20 * this.battlefield.mapHeight) + (var5 + var6)) / 40;
                    var8 = var8 + (120 + var4);
                    var7 = var7 + (var4 + (-220 + this.field_H));
                    SoftwareRaster.setClip(var4 + (-220 + this.field_H), var4 + 120, var3 * this.battlefield.mapWidth + this.field_H - 220 + var4, var3 * this.battlefield.mapHeight + 120 + var4);
                    SoftwareRaster.d(-(var3 * 8) + var7, var8, var7, -(8 * var3) + var8, 16777215, 128);
                    SoftwareRaster.d(var7 + 8 * var3, var8, var7, 8 * var3 + var8, 16777215, 128);
                    SoftwareRaster.d(var7 + 8 * var3, var8, var7, var8 - var3 * 8, 16777215, 128);
                    SoftwareRaster.d(-(var3 * 8) + var7, var8, var7, 8 * var3 + var8, 16777215, 128);
                    SoftwareRaster.d(var7 - var3 * 8 + 1, var8, var7, var8 - 8 * var3 + 1, 16777215, 64);
                    SoftwareRaster.d(-1 + 8 * var3 + var7, var8, var7, -1 + (8 * var3 + var8), 16777215, 64);
                    SoftwareRaster.d(8 * var3 + var7 - 1, var8, var7, var8 + (-(8 * var3) + 1), 16777215, 64);
                    SoftwareRaster.d(1 + (var7 - 8 * var3), var8, var7, var3 * 8 + var8 - 1, 16777215, 64);
                    SoftwareRaster.d(var7 - var3 * 8 - 1, var8, var7, -1 + var8 - var3 * 8, 16777215, 64);
                    SoftwareRaster.d(1 + (var7 + var3 * 8), var8, var7, var8 + (var3 * 8 + 1), 16777215, 64);
                    SoftwareRaster.d(1 + (var7 + 8 * var3), var8, var7, -1 + (var8 - 8 * var3), 16777215, 64);
                    SoftwareRaster.d(-1 + (var7 - 8 * var3), var8, var7, 1 + (var8 + var3 * 8), 16777215, 64);
                    SoftwareRaster.d(var7 + var3 / 4, var3 / 4 + (var8 - 6 * var3), var7 + var3 / 2, var3 / 2 - var3 * 6 + var8, 16777215, 128);
                    SoftwareRaster.d(-(var3 / 4) + var7, -(var3 / 4) + var8 - 6 * var3, -(var3 / 2) + var7, var8 - (var3 * 6 + var3 / 2), 16777215, 128);
                    SoftwareRaster.d(-(var3 / 2) + var7, var3 / 4 - 6 * var3 + var8, var7 - var3 / 4, -(6 * var3) + (var8 - var3 / 4), 16777215, 128);
                    SoftwareRaster.d(var3 / 4 + var7, var3 / 4 - var3 * 6 + var8, var7 - var3 / 4, var8 - var3 * 6 + var3 / 2, 16777215, 128);
                    SoftwareRaster.d(-(var3 / 2) + var7, var3 / 4 - 6 * var3 + var8, var7 - var3 / 4, -(6 * var3) + (var8 + var3 / 2), 16777215, 128);
                    SoftwareRaster.d(var3 / 2 + var7, -(6 * var3) + var8 - var3 / 2, -(var3 / 2) + var7, -(var3 * 6) + (var8 - var3 / 2), 16777215, 128);
                    SoftwareRaster.d(var3 / 2 + var7, -(var3 / 2) - var3 * 6 + var8, var3 / 2 + var7, var3 / 2 + (-(6 * var3) + var8), 16777215, 128);
                    SoftwareRaster.a();
                    var9 = 0;
                    var10 = 0;
                    var11 = this.battlefield.mapSizeSetting;
                    if (var11 != 0 ||
                      var12 != 0) {
                      switch (var11) {
                        case 1:
                          break regionExit4;
                        case 2:
                          break regionExit3;
                        default:
                          break regionExit1;
                        case 3:
                          if (var12 == 0) {
                            break regionExit2;
                          }
                          break;
                      }
                    }
                    var10 = 100;
                    var9 = 210;
                    if (var12 == 0) {
                      break regionExit1;
                    }
                  }
                  var10 = 95;
                  var9 = 215;
                  if (var12 == 0) {
                    break regionExit1;
                  }
                }
                var9 = 210;
                var10 = 105;
                if (var12 == 0) {
                  break regionExit1;
                }
              }
              var9 = 200;
              var10 = 110;
            }
            var9 = var9 - (240 - this.field_H);
            SpellMenuGroup.field_h[1].g(var9, var10);
            if (this.field_H == 240 &&
              SpellMenuGroup.field_h[1].b(var9, var10, AiPlanningStrategy.pointerX, ko.pointerY)) {
              SpellMenuGroup.field_h[1].f(var9, var10, 200);
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.IC(" + param0 + ')');
        }
    }

    final void trackCampaignMetrics(boolean obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        int damageTaken = 0;
        RuntimeException var2 = null;
        int turnsTaken = 0;
        int previousDamage = 0;
        int previousTurns = 0;
        int currentDamageThenMutationSelector = 0;
        int currentTurnsThenMutationVariant = 0;
        int damageCheckpoint = 0;
        int turnCheckpoint = 0;
        int damageDelta = 0;
        int turnDelta = 0;
        int deltaMutationSelector = 0;
        int deltaMutationVariant = 0;
        int var14 = 0;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          damageTaken = 0;
          if (!obfuscationGuard) {
            return;
          }
          turnsTaken = 0;
          if (this.campaignMode) {
            boolean decompiledFrameRemainder5 = true;
            turnsTaken = this.battlefield.playerTurnCounts[l.activeCampaignMission.playerSlot];
            damageTaken = this.battlefield.damageTakenByPlayer[l.activeCampaignMission.playerSlot];
            previousDamage = this.encodedDamageCheckpoint ^ 996394;
            previousTurns = 996394 ^ this.encodedTurnCheckpoint;
            if (previousTurns != turnsTaken ||
              ~previousDamage != ~damageTaken) {
              if (previousDamage <= damageTaken &&
                previousTurns <= turnsTaken) {
                boolean decompiledFrameRemainder4 = true;
                boolean decompiledFrameRemainder3 = true;
                boolean decompiledFrameRemainder2 = true;
                boolean decompiledFrameRemainder1 = true;
                boolean decompiledFrameRemainder0 = true;
                currentDamageThenMutationSelector = damageTaken;
                currentTurnsThenMutationVariant = turnsTaken;
                damageCheckpoint = previousDamage;
                turnCheckpoint = previousTurns;
                hc.field_b = hc.field_b + 1;
                hc.field_b = hc.field_b + (ko.pointerY ^ AiPlanningStrategy.pointerX);
                hc.field_b = Math.abs(hc.field_b);
                damageDelta = -damageCheckpoint + currentDamageThenMutationSelector;
                turnDelta = -turnCheckpoint + currentTurnsThenMutationVariant;
                deltaMutationSelector = hc.field_b % 4;
                deltaMutationVariant = deltaMutationSelector;
                if ((deltaMutationVariant != 0 ||
                  var14 != 0) &&
                  (decompiledFrameRemainder0 = (deltaMutationVariant != 1 ||
                  var14 != 0)) &&
                  (decompiledFrameRemainder1 = (2 != deltaMutationVariant ||
                  var14 != 0)) &&
                  (decompiledFrameRemainder4 = (deltaMutationVariant == 3))) {
                  decompiledFrameRemainder2 = (var14 != 0);
                }
                if ((decompiledFrameRemainder4) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder0)) {
                  ii.campaignPacketWord1 = ii.campaignPacketWord1 - damageDelta;
                  kw.campaignPacketWord0 = kw.campaignPacketWord0 - turnDelta;
                  decompiledFrameRemainder3 = (var14 != 0);
                }
                if ((decompiledFrameRemainder4) &&
                  (decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1)) {
                  kw.campaignPacketWord0 = kw.campaignPacketWord0 + damageDelta;
                  ii.campaignPacketWord1 = ii.campaignPacketWord1 + turnDelta;
                  decompiledFrameRemainder3 = (var14 != 0);
                }
                if ((decompiledFrameRemainder4) &&
                  (decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2)) {
                  kw.campaignPacketWord0 = kw.campaignPacketWord0 + (-turnDelta + damageDelta);
                  decompiledFrameRemainder3 = (var14 != 0);
                }
                if ((decompiledFrameRemainder4) &&
                  (decompiledFrameRemainder3)) {
                  ii.campaignPacketWord1 = ii.campaignPacketWord1 - (damageDelta - turnDelta);
                  decompiledFrameRemainder4 = (var14 == 0);
                }
                if (decompiledFrameRemainder4) {
                  this.encodedDamageCheckpoint = 996394 ^ damageTaken;
                  this.encodedTurnCheckpoint = turnsTaken ^ 996394;
                  decompiledFrameRemainder5 = false;
                }
                if (decompiledFrameRemainder5) {
                  throw new IllegalStateException("");
                }
              }
              if (decompiledFrameRemainder5) {
                return;
              }
            }
            hc.field_b = hc.field_b + 1;
            hc.field_b = hc.field_b + (ko.pointerY ^ AiPlanningStrategy.pointerX);
            hc.field_b = Math.abs(hc.field_b);
            currentDamageThenMutationSelector = hc.field_b % 8;
            currentTurnsThenMutationVariant = currentDamageThenMutationSelector;
            switch ((var14 == 0
              || currentTurnsThenMutationVariant == 0
              || currentTurnsThenMutationVariant == 1
              || currentTurnsThenMutationVariant == 3
              || currentTurnsThenMutationVariant == 4
              || currentTurnsThenMutationVariant == 7
              ) ? currentTurnsThenMutationVariant : -1) {
              case 0:
                kw.campaignPacketWord0 = kw.campaignPacketWord0 - wr.campaignPacketWord3;
                cg.campaignPacketWord2 = cg.campaignPacketWord2 + 1;
                if (var14 == 0) {
                  return;
                }
              case 1:
                wr.campaignPacketWord3 = wr.campaignPacketWord3 + 1;
                ii.campaignPacketWord1 = ii.campaignPacketWord1 + cg.campaignPacketWord2;
                if (var14 == 0) {
                  return;
                }
              case 2:
                ii.campaignPacketWord1 = ii.campaignPacketWord1 + 1;
                kw.campaignPacketWord0 = kw.campaignPacketWord0 + 1;
                if (var14 == 0) {
                  return;
                }
              case 3:
                ii.campaignPacketWord1 = ii.campaignPacketWord1 + BattleTutorial.pointerPressX;
                kw.campaignPacketWord0 = kw.campaignPacketWord0 + BattleTutorial.pointerPressX;
                if (var14 == 0) {
                  return;
                }
              case 4:
                wr.campaignPacketWord3 = wr.campaignPacketWord3 + 1;
                ii.campaignPacketWord1 = ii.campaignPacketWord1 + cg.campaignPacketWord2;
                if (var14 == 0) {
                  return;
                }
              case 5:
                kw.campaignPacketWord0 = kw.campaignPacketWord0 - wr.campaignPacketWord3;
                cg.campaignPacketWord2 = cg.campaignPacketWord2 + 1;
                if (var14 == 0) {
                  return;
                }
              case 6:
                kw.campaignPacketWord0 = kw.campaignPacketWord0 + wr.campaignPacketWord3;
                cg.campaignPacketWord2 = cg.campaignPacketWord2 - 1;
                if (var14 == 0) {
                  return;
                }
              case 7:
                ii.campaignPacketWord1 = ii.campaignPacketWord1 - cg.campaignPacketWord2;
                wr.campaignPacketWord3 = wr.campaignPacketWord3 - 1;
                if (var14 == 0) {
                  return;
                }
              default:
                break;
            }
            throw new IllegalStateException("");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.MB(" + obfuscationGuard + ')');
        }
    }

    private final void updateCamera(byte obfuscationGuard) {
        BattleCamera stackIn_7_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_19_0 = 0;
        BattleCamera stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        boolean stackIn_29_2 = false;
        int stackIn_36_3;
        boolean stackIn_39_4 = false;
        boolean stackIn_49_5 = false;
        boolean stackIn_59_6 = false;
        boolean stackIn_66_7 = false;
        boolean stackIn_70_8 = false;
        CameraOverviewTarget stackIn_123_0 = null;
        Object stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        RuntimeException decompiledCaughtException = null;
        CameraOverviewTarget stackOut_122_0;
        int directionKeysEnabled = 0;
        RuntimeException var2 = null;
        int manualCameraMovement = 0;
        int cameraPlayerIndex = 0;
        CameraOverviewTarget overviewTarget = null;
        int overviewVelocitySettled = 0;
        Object nearestTarget = null;
        CameraOverviewTarget candidateTarget = null;
        int candidateDistance = 0;
        int obfuscationControl = 0;
        int nearestDistance;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.cameraFocusPending) {
            stackIn_7_0 = this.camera;
            if (!this.field_z) {
              stackIn_8_1 = 40;
            } else {
              stackIn_8_1 = 5;
            }
            if (((BattleCamera) (Object) stackIn_7_0).moveTowardTile(stackIn_8_1, (byte) 113, this.cameraFocusTileIndex)) {
              this.cameraFocusPending = false;
              this.a(3, -128);
            }
            return;
          }
          if (this.field_lb &&
            ma.field_Z) {
            stackIn_19_0 = 0;
          } else {
            stackIn_19_0 = 1;
          }
          boolean decompiledFrameRemainder4 = true;
          directionKeysEnabled = stackIn_19_0;
          stackIn_26_0 = this.camera;
          stackIn_26_1 = obfuscationGuard + 145;
          if (!br.field_f[99] && (!br.field_f[49] ||
            directionKeysEnabled == 0)) {
            stackIn_29_2 = false;
            decompiledFrameRemainder4 = false;
          }
          else {
            stackIn_29_2 = true;
          }
          boolean decompiledFrameRemainder3 = true;
          stackIn_36_3 = ko.pointerY;
          if (!br.field_f[98] && (!br.field_f[33] ||
            directionKeysEnabled == 0)) {
            stackIn_39_4 = false;
            decompiledFrameRemainder3 = false;
          }
          else {
            stackIn_39_4 = true;
          }
          boolean decompiledFrameRemainder2 = true;
          if (!br.field_f[97] && (!br.field_f[50] ||
            directionKeysEnabled == 0)) {
            stackIn_49_5 = false;
            decompiledFrameRemainder2 = false;
          }
          else {
            stackIn_49_5 = true;
          }
          boolean decompiledFrameRemainder1 = true;
          if (!br.field_f[96] && (!br.field_f[48] ||
            directionKeysEnabled == 0)) {
            stackIn_59_6 = false;
            decompiledFrameRemainder1 = false;
          }
          else {
            stackIn_59_6 = true;
          }
          stackIn_66_7 = (this.field_Pb) || (this.field_Xb);
          stackIn_70_8 = (ro.pointerButton == 2);
          manualCameraMovement = ((BattleCamera) (Object) stackIn_26_0).handleInput(stackIn_26_1, stackIn_29_2, stackIn_36_3, stackIn_39_4, stackIn_49_5, stackIn_59_6, stackIn_66_7, stackIn_70_8, AiPlanningStrategy.pointerX) ? 1 : 0;
          if (manualCameraMovement != 0) {
            this.field_Pb = false;
            this.field_Xb = false;
            if (null != this.overviewTargets) {
              this.overviewTargets.clear(90);
            }
          }
          if (manualCameraMovement == 0 &&
            this.field_H == 240 &&
            ro.pointerButton == 1) {
            manualCameraMovement = this.m(false) ? 1 : 0;
          }
          if (obfuscationGuard != -42) {
            this.l((byte) 23);
          }
          if (this.battlefield.h(-293) &&
            !this.field_z) {
            cameraPlayerIndex = this.controlledPlayerId;
            if (0 > cameraPlayerIndex) {
              cameraPlayerIndex = this.battlefield.currentPlayer;
            }
            hc.a(cameraPlayerIndex, false);
            if (obfuscationControl == 0) {
              return;
            }
          }
          if (null != this.overviewTargets &&
            manualCameraMovement == 0) {
            boolean decompiledFrameRemainder0 = true;
            overviewTarget = (CameraOverviewTarget) (this.overviewTargets.first((byte) 104));
            if (null == overviewTarget) {
              this.overviewTargets = null;
              decompiledFrameRemainder0 = (obfuscationControl != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!overviewTarget.hasStartedHold((byte) 127)) {
                overviewVelocitySettled = this.camera.moveTowardTile(10, (byte) 113, overviewTarget.getTileIndex(this.battlefield.mapWidth, (byte) -57)) ? 1 : 0;
                if (overviewVelocitySettled != 0) {
                  overviewTarget.startHold(obfuscationGuard ^ 79);
                }
                decompiledFrameRemainder0 = (obfuscationControl != 0);
              }
              if ((decompiledFrameRemainder0) &&
                (!overviewTarget.advanceHold(-5))) {
                overviewTarget.unlink(-109);
                nearestDistance = 2147483647;
                nearestTarget = null;
                candidateTarget = (CameraOverviewTarget) (this.overviewTargets.first((byte) 111));
                while (true) {
                  if (null != candidateTarget) {
                    stackOut_122_0 = candidateTarget;
                    stackIn_135_0 = stackOut_122_0;
                    stackIn_123_0 = stackOut_122_0;
                    stackIn_135_1 = -5;
                    if (obfuscationControl == 0) {
                      if (((CameraOverviewTarget) (Object) stackIn_123_0).isNearTarget(stackIn_135_1, overviewTarget)) {
                        candidateTarget.unlink(obfuscationGuard + 72);
                      } else {
                        candidateDistance = candidateTarget.distanceSquaredTo(2, overviewTarget);
                        if (candidateDistance < nearestDistance) {
                          nearestDistance = candidateDistance;
                          nearestTarget = candidateTarget;
                        }
                      }
                      candidateTarget = (CameraOverviewTarget) (this.overviewTargets.next((byte) 123));
                      continue;
                    }
                  } else {
                    if (nearestTarget == null) {
                      break;
                    }
                    stackIn_135_0 = nearestTarget;
                    stackIn_135_1 = 77;
                  }
                  ((CameraOverviewTarget) stackIn_135_0).unlink(stackIn_135_1);
                  this.overviewTargets.addFirst(750, (IntrusiveNode) (nearestTarget));
                  break;
                }
              }
            }
            if (obfuscationControl == 0) {
              return;
            }
          }
          if (-2 != this.field_y &&
            this.field_Xb) {
            this.camera.moveTowardTile(-1, (byte) 113, this.battlefield.mapWidth * this.field_ec + this.field_X);
            if (obfuscationControl == 0) {
              return;
            }
          }
          if (this.field_Pb &&
            manualCameraMovement == 0) {
            this.camera.followEventPresenters((byte) 104, this.eventPresenters);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.CA(" + obfuscationGuard + ')');
        }
    }

    private final void k(int param0) {
        int stackIn_35_0 = 0;
        boolean stackIn_36_1 = false;
        int stackIn_39_2;
        int stackIn_39_3;
        boolean stackIn_40_4 = false;
        boolean stackIn_43_5;
        boolean stackIn_43_6;
        int stackIn_43_7;
        boolean stackIn_44_8 = false;
        int stackIn_50_0 = 0;
        boolean stackIn_51_1 = false;
        int stackIn_54_2;
        int stackIn_54_3;
        boolean stackIn_55_4 = false;
        boolean stackIn_58_5;
        boolean stackIn_58_6;
        int stackIn_58_7;
        boolean stackIn_59_8;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_78_0 = 0;
        boolean stackIn_79_1 = false;
        int stackIn_82_2;
        int stackIn_82_3;
        boolean stackIn_83_4 = false;
        boolean stackIn_86_5;
        boolean stackIn_86_6;
        int stackIn_86_7;
        boolean stackIn_87_8;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_116_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_149_0 = 0;
        int stackIn_160_0 = 0;
        boolean stackIn_161_1 = false;
        int stackIn_164_2;
        int stackIn_164_3;
        boolean stackIn_165_4 = false;
        boolean stackIn_168_5;
        boolean stackIn_168_6;
        int stackIn_168_7;
        boolean stackIn_169_8 = false;
        int stackIn_183_0 = 0;
        boolean stackIn_184_1 = false;
        int stackIn_187_2;
        int stackIn_187_3;
        boolean stackIn_188_4 = false;
        boolean stackIn_191_5;
        boolean stackIn_191_6;
        int stackIn_191_7;
        boolean stackIn_192_8 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_66_0Lifetime1;
        int stackIn_66_1Lifetime1;
        int stackIn_94_0Lifetime1;
        int stackIn_94_1Lifetime1;
        int stackIn_121_0Lifetime1;
        int stackIn_121_1Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var5Lifetime2;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != -32400) {
            this.controlledPlayerId = 1;
          }
          var2_int = so.field_b.field_a;
          if (this.battlefield.playerCoats != null) {
            if (this.field_Wb == null) {
              this.e(16);
            }
            if (this.battlefield.teamGame) {
              var3 = 80;
              var4 = 0;
              while (this.battlefield.teamCount > var4) {
                if (var15 != 0) {
                  return;
                }
                boolean decompiledFrameRemainder0 = true;
                if (this.battlefield.currentPlayer > -1 &&
                  var4 == this.battlefield.getPlayerTeamIndex(this.battlefield.currentPlayer, -1)) {
                  var5 = 0;
                  while (this.battlefield.playerCount > var5) {
                    stackIn_66_0 = this.battlefield.currentPlayer;
                    stackIn_66_1 = var5;
                    if (stackIn_66_0 != stackIn_66_1) {
                      if (this.battlefield.getPlayerTeamIndex(var5, -1) == var4) {
                        stackIn_35_0 = param0 ^ -32399;
                        stackIn_36_1 = !((this.battlefield.inactivePlayerMask & 1 << var5) <= 0);
                        stackIn_39_2 = var3;
                        stackIn_39_3 = -14 + (var2_int - 60);
                        stackIn_40_4 = !(0 >= (1 << var5 & this.battlefield.field_C));
                        stackIn_43_5 = true;
                        stackIn_43_6 = false;
                        stackIn_43_7 = op.field_c[0][var4];
                        stackIn_44_8 = !((this.battlefield.eliminatedPlayerMask & 1 << var5) <= 0);
                        qp.a(stackIn_35_0, stackIn_36_1, stackIn_39_2, stackIn_39_3, stackIn_40_4, stackIn_43_5, stackIn_43_6, stackIn_43_7, stackIn_44_8, this.field_Wb[var5]);
                        var3 += 30;
                      }
                    } else {
                      stackIn_50_0 = 1;
                      stackIn_51_1 = !((this.battlefield.inactivePlayerMask & 1 << var5) <= 0);
                      stackIn_54_2 = var3;
                      stackIn_54_3 = -60 + var2_int - 28;
                      stackIn_55_4 = !(0 >= (this.battlefield.field_C & 1 << var5));
                      stackIn_58_5 = false;
                      stackIn_58_6 = true;
                      stackIn_58_7 = op.field_c[0][var4];
                      stackIn_59_8 = !((1 << var5 & this.battlefield.eliminatedPlayerMask) <= 0);
                      qp.a(stackIn_50_0, stackIn_51_1, stackIn_54_2, stackIn_54_3, stackIn_55_4, stackIn_58_5, stackIn_58_6, stackIn_58_7, stackIn_59_8, this.field_Wb[var5]);
                      var3 += 60;
                    }
                    var5++;
                  }
                  var3 += 5;
                  if (this.battlefield.campaignMission == null) {
                    this.a(var4, 10, 96, var3, -112 + var2_int, (byte) -119);
                    var3 += 10;
                  }
                  stackIn_66_0Lifetime1 = var2_int - 120;
                  stackIn_66_1Lifetime1 = op.field_c[0][var4];
                  HuffmanCodec.a(stackIn_66_0Lifetime1, stackIn_66_1Lifetime1, this.battlefield.teams[var4].getTeamName(3), true, (byte) -27, var3);
                  var3 += 30;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var5Lifetime2 = -(30 * this.battlefield.playerCount >> 2) - 54 + var2_int;
                  var6_int = 0;
                  while (true) {
                    if (var6_int < this.battlefield.playerCount) {
                      stackIn_94_0 = ~var4;
                      stackIn_94_1 = ~this.battlefield.getPlayerTeamIndex(var6_int, -1);
                      if (stackIn_94_0 == stackIn_94_1) {
                        this.field_Wb[var6_int].h(var5Lifetime2, var3);
                        stackIn_78_0 = param0 + 32401;
                        stackIn_79_1 = !((1 << var6_int & this.battlefield.inactivePlayerMask) <= 0);
                        stackIn_82_2 = var3;
                        stackIn_82_3 = var5Lifetime2;
                        stackIn_83_4 = !((this.battlefield.field_C & 1 << var6_int) <= 0);
                        stackIn_86_5 = true;
                        stackIn_86_6 = false;
                        stackIn_86_7 = op.field_c[0][var4];
                        stackIn_87_8 = !((this.battlefield.eliminatedPlayerMask & 1 << var6_int) <= 0);
                        qp.a(stackIn_78_0, stackIn_79_1, stackIn_82_2, stackIn_82_3, stackIn_83_4, stackIn_86_5, stackIn_86_6, stackIn_86_7, stackIn_87_8, this.field_Wb[var6_int]);
                        var5Lifetime2 += 30;
                      }
                      var6_int++;
                      continue;
                    }
                    break;
                  }
                  var3 += 35;
                  if (null == this.battlefield.campaignMission) {
                    this.a(var4, 10, 96, var3, var2_int - 112, (byte) -128);
                    var3 += 10;
                  }
                  stackIn_94_0Lifetime1 = var2_int - 120;
                  stackIn_94_1Lifetime1 = op.field_c[0][var4];
                  HuffmanCodec.a(stackIn_94_0Lifetime1, stackIn_94_1Lifetime1, this.battlefield.teams[var4].getTeamName(3), true, (byte) 109, var3);
                  var3 += 30;
                }
                var4++;
              }
              if (var15 == 0) {
                return;
              }
            }
            var3Lifetime1 = 10;
            var4Lifetime1 = 0;
            var5Lifetime1 = 0;
            var6 = new int[this.battlefield.playerCount];
            var7_int = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (!(this.battlefield.playerCount > var7_int)))) {
              var6[var7_int] = this.battlefield.i(var7_int, -12710);
              stackIn_116_0 = -1;
              if (var15 == 0) {
                if (stackIn_116_0 == ~(this.battlefield.eliminatedPlayerMask >> var7_int & 1) &&
                  (this.battlefield.inactivePlayerMask >> var7_int & 1) == 0) {
                  var5Lifetime1++;
                  if (0 < var6[var7_int]) {
                    var4Lifetime1 = 1;
                  }
                } else {
                  var6[var7_int] = -1;
                }
                var7_int++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_116_0 = this.battlefield.playerCount;
            }
            boolean decompiledFrameCompleted0 = true;
            var7 = new int[stackIn_116_0];
            if (var4Lifetime1 != 0) {
              var8 = -1;
              var9 = 2147483647;
              var10 = -1;
              var11 = 3;
              if (var5Lifetime1 < var11) {
                var11 = var5Lifetime1;
              }
              var12 = 0;
              while (true) {
                stackIn_121_0 = var11;
                stackIn_121_1 = var12;
                if (stackIn_121_0 <= stackIn_121_1) {
                  break;
                }
                stackIn_149_0 = 0;
                if (var15 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                var13 = stackIn_149_0;
                while (this.battlefield.playerCount > var13) {
                  stackIn_121_0Lifetime1 = -1;
                  stackIn_121_1Lifetime1 = var6[var13];
                  boolean decompiledFrameRemainder1 = true;
                  if (stackIn_121_0Lifetime1 != stackIn_121_1Lifetime1) {
                    var14 = -1 - this.battlefield.currentPlayer + var13;
                    if (var14 < 0) {
                      var14 = this.battlefield.playerCount + var14;
                    }
                    if (~var6[var13] != ~var8) {
                      if (!(var6[var13] <= var8)) {
                        var10 = var13;
                        var8 = var6[var13];
                        var9 = var14;
                      }
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      if (var9 > var14) {
                        var9 = var14;
                        var10 = var13;
                        var8 = var6[var13];
                      }
                    }
                  }
                  var13++;
                }
                if (var10 < 0 &&
                  var15 == 0) {
                  break;
                }
                var6[var10] = -1;
                var8 = -1;
                var7[var10] = var12 + 1;
                var10 = -1;
                var9 = 2147483647;
                var12++;
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_149_0 = 0;
            }
            var8Lifetime1 = stackIn_149_0;
            while (true) {
              if (var8Lifetime1 >= this.battlefield.playerCount) {
                return;
              }
              if (var15 != 0) {
                return;
              }
              if (var8Lifetime1 != this.battlefield.currentPlayer) {
                stackIn_160_0 = 1;
                stackIn_161_1 = !((this.battlefield.inactivePlayerMask & 1 << var8Lifetime1) <= 0);
                stackIn_164_2 = var3Lifetime1;
                stackIn_164_3 = var2_int - 50;
                stackIn_165_4 = !((1 << var8Lifetime1 & this.battlefield.field_C) <= 0);
                stackIn_168_5 = true;
                stackIn_168_6 = false;
                stackIn_168_7 = op.field_c[0][var8Lifetime1];
                stackIn_169_8 = !((1 << var8Lifetime1 & this.battlefield.eliminatedPlayerMask) <= 0);
                qp.a(stackIn_160_0, stackIn_161_1, stackIn_164_2, stackIn_164_3, stackIn_165_4, stackIn_168_5, stackIn_168_6, stackIn_168_7, stackIn_169_8, this.field_Wb[var8Lifetime1]);
                if (this.battlefield.field_r) {
                  var9Lifetime1 = 30;
                  this.a(var8Lifetime1, 6, 30, 24 + var3Lifetime1, -36 + (-(var9Lifetime1 / 2) + var2_int), (byte) -116);
                  if (0 < var7[var8Lifetime1] &&
                    !this.field_z) {
                    TeleportAction.field_w[var7[var8Lifetime1] - 1].g(-(var9Lifetime1 / 2) - 60 + var2_int, 16 + var3Lifetime1);
                  }
                }
                var3Lifetime1 += 30;
              } else {
                stackIn_183_0 = 1;
                stackIn_184_1 = !((this.battlefield.inactivePlayerMask & 1 << var8Lifetime1) <= 0);
                stackIn_187_2 = var3Lifetime1;
                stackIn_187_3 = var2_int - 64;
                stackIn_188_4 = !(0 >= (1 << var8Lifetime1 & this.battlefield.field_C));
                stackIn_191_5 = false;
                stackIn_191_6 = true;
                stackIn_191_7 = op.field_c[0][var8Lifetime1];
                stackIn_192_8 = !((1 << var8Lifetime1 & this.battlefield.eliminatedPlayerMask) <= 0);
                qp.a(stackIn_183_0, stackIn_184_1, stackIn_187_2, stackIn_187_3, stackIn_188_4, stackIn_191_5, stackIn_191_6, stackIn_191_7, stackIn_192_8, this.field_Wb[var8Lifetime1]);
                if (this.battlefield.field_r) {
                  var9Lifetime1 = 56;
                  this.a(var8Lifetime1, 8, var9Lifetime1, var3Lifetime1 + 48, var2_int - 36 - var9Lifetime1 / 2, (byte) -116);
                  if (var7[var8Lifetime1] > 0 &&
                    this.battleTutorial == null) {
                    var10Lifetime1 = -52 - var9Lifetime1 / 2 + var2_int;
                    var11Lifetime1 = 44 + var3Lifetime1 + 8;
                    SoftwareRaster.a(var10Lifetime1 << 4, var11Lifetime1 << 4, 256, 62, fe.field_o[0]);
                    TeleportAction.field_w[-1 + var7[var8Lifetime1]].g(-10 + var10Lifetime1, -10 + var11Lifetime1);
                  }
                }
                var3Lifetime1 += 60;
              }
              var8Lifetime1++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.TC(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param3 != -12857) {
            return;
          }
          var5_int = 18;
          var6 = 0;
          do {
            if (var6 >= 3) {
              var6 = 0;
              break;
            }
            od.field_a[1 + var6].g(db.a(true, param1), MatchConditionEntry.a(var5_int * var6 + param2, (byte) 94));
            var6++;
          } while (var7 == 0);
          while (var6 < 3) {
            en.field_E.b(this.battlefield.teamStructureCounts[param0][var6] + "/" + this.battlefield.mapStructureTotals[var6], db.a(true, 40 + param1), MatchConditionEntry.a(-2 + param2 + (var6 + 1) * var5_int, (byte) 94), 38810, -1);
            var6++;
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.SA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void h(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!this.field_lb) {
            throw new IllegalStateException();
          }
          vl.outgoingPacket.writeCipheredOpcode(32161, 66);
          if (param0 != 69) {
            this.field_wb = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.BD(" + param0 + ')');
        }
    }

    private final boolean B(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 34) {
            this.field_rb = false;
          }
          stackIn_7_0 = (dc.field_o == 2098862971322544L);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.CC(" + param0 + ')');
        }
    }

    private final void y(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_ob = this.field_ob ^ this.battlefield.eliminatedPlayerMask;
          this.field_x = this.field_x ^ this.battlefield.field_C;
          this.field_hb = this.field_hb ^ this.battlefield.inactivePlayerMask;
          if (param0 <= 49) {
            this.e(90, -46, 119);
          }
          var2_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var2_int < this.battlefield.playerCount)))) {
            var3 = 1 << var2_int;
            if (var4 == 0) {
              if ((this.field_hb & var3) != 0) {
                LineOfSightGrid.$cfr$intArgs$a$5d483ac33914(-80, fo.a(4800, wd.field_g, new String[]{this.battlefield.playerNames[var2_int]}), this.field_Nb);
              } else {
                if ((this.field_ob & var3) != 0) {
                  LineOfSightGrid.$cfr$intArgs$a$5d483ac33914(-80, fo.a(4800, QuickChatMenu.field_Mb, new String[]{this.battlefield.playerNames[var2_int]}), this.field_Nb);
                }
              }
              if (0 != (var3 & this.field_x) &&
                0 == (this.battlefield.eliminatedPlayerMask & var3)) {
                if (0 == (var3 & this.battlefield.field_C)) {
                  LineOfSightGrid.$cfr$intArgs$a$5d483ac33914(-80, fo.a(4800, TelepopEvent.field_y, new String[]{this.battlefield.playerNames[var2_int]}), this.field_Nb);
                } else {
                  LineOfSightGrid.$cfr$intArgs$a$5d483ac33914(-80, fo.a(4800, bk.field_h, new String[]{this.battlefield.playerNames[var2_int]}), this.field_Nb);
                }
              }
              var2_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_x = this.battlefield.field_C;
            this.field_hb = this.battlefield.inactivePlayerMask;
          }
          this.field_ob = this.battlefield.eliminatedPlayerMask;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.PB(" + param0 + ')');
        }
    }

    private final boolean a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 60 / ((param0 + 17) / 41);
          stackIn_10_0 = (this.field_Q) || !(this.battlefield.pendingEvents.isEmpty(false)) || !(this.field_Ub.isEmpty(false));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.OD(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, MapTile param4, int param5, int param6, int param7) {
        int stackIn_12_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_51_0 = 0;
        RgbSprite stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_56_3 = 0;
        String stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_60_3 = 0;
        IndexedSprite stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        int stackIn_68_3 = 0;
        tu stackIn_71_0;
        String stackIn_71_1;
        int stackIn_71_2;
        int stackIn_71_3;
        int stackIn_72_4 = 0;
        IndexedSprite stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        int stackIn_128_3;
        int stackIn_131_0 = 0;
        IndexedSprite stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        int stackIn_136_2 = 0;
        int stackIn_137_3;
        RuntimeException stackIn_142_0 = null;
        StringBuilder stackIn_142_1 = null;
        String stackIn_143_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var12Lifetime1;
        int var14Lifetime1;
        int var16Lifetime1;
        var17 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          CampaignDefinition.field_t.drawOpaque(param3 + 2, -73 + (param5 + param0));
          fe.b(param3 + 0, -76 - (-param5 - param0), 309, 71, io.field_m, nd.field_b, 0, 0);
          SoftwareRaster.b(7 + param3, param5 - 70 + param0, 25, 25, 0, 128);
          if (-1 < param4.ownerPlayer) {
            wb.a(7816226, -8 + param3, param4.ownerPlayer, uk.field_n, -52 + param5 + param0);
          }
          SoftwareRaster.b(param3 + 37, param0 + param5 - 70, 265, 25, 0, 128);
          var9 = param4.getDisplayName((byte) 124).toLowerCase();
          SoftwareRaster.setClip(37 + param3, param0 - 70 + param5, 245 + param3, param0 + param5 - 45);
          fe.a(var9, -param2 + 42 + param3, param0 + (-43 + param5), 16777215, true);
          SoftwareRaster.a();
          lp.field_b[vg.field_r[param4.terrainType]].draw(param3 + 273, param0 + (param5 - 74));
          SoftwareRaster.b(param3 + 7, param0 - 41 + param5, 60, 30, 0, 128);
          TrianglePulse.field_f.g(param3 + 12, -36 + param5 + param0);
          var10 = 0;
          if (null != param4.occupant &&
            !this.battlefield.arePlayersAllied(param4.occupant.ownerPlayer, -16985, param4.ownerPlayer)) {
            stackIn_12_0 = 1;
          } else {
            stackIn_12_0 = 0;
          }
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var11 = stackIn_12_0;
          var12 = param4.terrainType;
          if (var12 != 8) {
            decompiledFrameRemainder0 = (var12 != 14 ||
              var17 != 0);
            if (((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder0 = (9 != var12 ||
              var17 != 0))) &&
              (decompiledFrameRemainder2 = (7 == var12))) {
              decompiledFrameRemainder1 = (var17 != 0);
            }
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            stackIn_37_0 = (var11 != 0) ? 12 : 25;
            var10 = stackIn_37_0;
            decompiledFrameRemainder2 = (var17 != 0);
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            stackIn_44_0 = (var11 != 0) ? 37 : 75;
            var10 = stackIn_44_0;
            decompiledFrameRemainder2 = (var17 != 0);
          }
          if (decompiledFrameRemainder2) {
            stackIn_51_0 = (var11 == 0) ? 50 : 25;
            var10 = stackIn_51_0;
          }
          stackIn_55_0 = TrianglePulse.field_f;
          stackIn_55_1 = param3 + 12;
          stackIn_55_2 = param0 + param5 - 36;
          if (0 != var10) {
            stackIn_56_3 = 255;
          } else {
            stackIn_56_3 = 128;
          }
          ((RgbSprite) (Object) stackIn_55_0).g(stackIn_55_1, stackIn_55_2, stackIn_56_3);
          stackIn_59_0 = var10 + "";
          stackIn_59_1 = param3 + 62;
          stackIn_59_2 = param5 + (param0 - 10);
          if (var10 != 0) {
            stackIn_60_3 = 16777215;
          } else {
            stackIn_60_3 = 7829367;
          }
          fe.d(stackIn_59_0, stackIn_59_1, stackIn_59_2, stackIn_60_3, true);
          SoftwareRaster.b(72 + param3, param0 - 41 + param5, 190, 30, 0, 128);
          if (param7 + 17 >= lp.field_b.length) {
            param7 = 0;
          }
          stackIn_67_0 = lp.field_b[17 + param7];
          stackIn_67_1 = 268 + param3;
          stackIn_67_2 = param5 + (-42 + param0);
          if (WeightedLruCache.terrainDamageTakenPercent[param4.terrainType] < 100) {
            stackIn_68_3 = 255;
          } else {
            stackIn_68_3 = 128;
          }
          ((IndexedSprite) (Object) stackIn_67_0).b(stackIn_67_1, stackIn_67_2, stackIn_68_3, 0);
          stackIn_71_0 = rs.field_n;
          stackIn_71_1 = 100 - WeightedLruCache.terrainDamageTakenPercent[param4.terrainType] + "%";
          stackIn_71_2 = 284 + param3;
          stackIn_71_3 = param0 + (param5 - 24);
          if (WeightedLruCache.terrainDamageTakenPercent[param4.terrainType] < 100) {
            stackIn_72_4 = 16777215;
          } else {
            stackIn_72_4 = 7829367;
          }
          ((tu) (Object) stackIn_71_0).c(stackIn_71_1, stackIn_71_2, stackIn_71_3, stackIn_72_4, 0);
          if (param1 <= 101) {
            return;
          }
          var12Lifetime1 = 0;
          var13 = 23;
          if (param4.hasCorpse(68)) {
            lp.field_b[0].draw(72 + (param3 + var13 * var12Lifetime1), param5 - 42 + param0);
            var12Lifetime1++;
          }
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameRemainder3 = true;
          var14 = param4.terrainType;
          if (((var14 != 8 ||
            var17 != 0) && var14 != 9 && (var14 != 14 ||
            var17 != 0)) &&
            (decompiledFrameRemainder3 = (var14 != 7 ||
            var17 != 0)) &&
            (decompiledFrameRemainder4 = (3 != var14 ||
            var17 != 0)) &&
            (decompiledFrameRemainder5 = (2 == var14))) {
            decompiledFrameRemainder4 = (var17 != 0);
          }
          if ((decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4) &&
            (decompiledFrameRemainder3)) {
            lp.field_b[1].draw(var13 * var12Lifetime1 + (72 + param3), param0 - (-param5 + 42));
            var12Lifetime1++;
            decompiledFrameRemainder5 = (var17 != 0);
          }
          if ((decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            lp.field_b[2].draw(var13 * var12Lifetime1 + param3 + 72, param0 + param5 - 42);
            var12Lifetime1++;
            decompiledFrameRemainder5 = (var17 != 0);
          }
          if (decompiledFrameRemainder5) {
            lp.field_b[3].draw(72 - (-param3 - var13 * var12Lifetime1), param0 - 42 + param5);
            var12Lifetime1++;
          }
          var14Lifetime1 = param4.getEffectsForPlayer((byte) 97, param6, this.battlefield.getPlayerTeamIndex(param6, -1));
          var15 = param4.getEffectsForPlayer((byte) 97, -1, -1);
          var16 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (5 <= var16))) {
            stackIn_131_0 = -1;
            if (var17 == 0) {
              if (stackIn_131_0 != ~(var15 & 1 << var16)) {
                stackIn_127_0 = lp.field_b[AnimationSequence.field_f[var16]];
                stackIn_127_1 = param3 + 72 + var12Lifetime1 * var13;
                stackIn_127_2 = param5 - 42 + param0;
                if (0 == (var14Lifetime1 & 1 << var16)) {
                  stackIn_128_3 = 128;
                } else {
                  stackIn_128_3 = 255;
                }
                ((IndexedSprite) (Object) stackIn_127_0).b(stackIn_127_1, stackIn_127_2, stackIn_128_3, 0);
                var12Lifetime1++;
              }
              var16++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_131_0 = param4.hasExplicitOwner((byte) -79) ? 1 : 0;
          }
          if (stackIn_131_0 != 0) {
            var16Lifetime1 = param4.getExplicitOwner((byte) -56);
            stackIn_136_0 = lp.field_b[9];
            stackIn_136_1 = var13 * var12Lifetime1 + (72 + param3);
            stackIn_136_2 = param5 - (42 - param0);
            if (~var16Lifetime1 != ~param6) {
              stackIn_137_3 = 128;
            } else {
              stackIn_137_3 = 255;
            }
            ((IndexedSprite) (Object) stackIn_136_0).b(stackIn_136_1, stackIn_136_2, stackIn_137_3, 0);
            var12Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_142_0 = var9_ref;
          stackIn_142_1 = new StringBuilder().append("ic.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_143_2 = "null";
          } else {
            stackIn_143_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_142_0), ((StringBuilder) (Object) stackIn_142_1).append(stackIn_143_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int[] param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 0) {
            return;
          }
          var6_int = 200;
          var7 = ActionRequest.field_l[param0];
          if (this.battlefield.runeCapOption != 4) {
            var7 = var7 + fo.a(4800, lt.field_f, new String[]{Integer.toString(uc.spellDefinitions[param0][0]), Integer.toString(this.battlefield.remainingRuneCap[this.controlledPlayerId])});
          }
          var8 = en.field_E.getParagraphHeight(var7, var6_int - 20, 0);
          var9 = (nr.field_e.getParagraphHeight(fq.field_f[param0], -20 + var6_int << 1, 0) >> 1) - 30;
          if (param4 != 11951) {
            this.field_l = false;
          }
          fe.b(param2 - (var6_int >> 1), -20 + param1 - var8 - var9, var6_int, var8 - (-var9 - 30), io.field_m, param3, 0, 192);
          en.field_E.a(var7, param2 - (var6_int >> 1) + 10, param1 - var8, var6_int - 20, var8, 16777215, -1, 1, 0, 0);
          fe.b(fq.field_f[param0], param2, -3 - var8 + param1 - var9, var6_int - 20, true);
          fe.a(fq.field_f[param0], param2, -3 - var9 + (-var8 + param1), -20 + var6_int, param3, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("ic.FC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, byte param2) {
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        try {
          this.field_i = this.field_fb;
          this.field_W = this.selectedUnit;
          this.field_ab = this.field_h;
          this.selectedUnit = null;
          if (this.field_h == -1 ||
            param0 == -1) {
            this.field_qb = 0;
            this.field_fb = 0;
          }
          if (~param0 != ~this.field_h) {
            this.field_h = param0;
            if (ArmiesOfGielinor.obfuscationControl) {
              this.field_h = -1;
            }
          } else {
            this.field_h = -1;
          }
          this.field_D = false;
          if (this.field_h != -1) {
            var4 = this.battlefield.tiles[this.field_h].getDisplayName((byte) 81);
            this.field_mc = (nr.field_e.a(var4) >> 1) - 210;
            if (this.field_mc < 0) {
              this.field_mc = 0;
            }
            this.field_mc = this.field_mc << 1;
            this.field_c = 200;
          }
          if (param2 <= 36) {
            this.field_m = false;
          }
          this.field_m = false;
          this.field_F = false;
          if (-1 < this.movementPlanner.spellId) {
            this.notifyTutorialInteraction(25, -1, -115);
          }
          this.movementPlanner.clearSelection(-34);
          if (param1) {
            da.a((byte) -96, 0);
          }
          this.a(28, -113);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4_ref), "ic.JD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void i(int param0) {
        try {
          vl.outgoingPacket.writeCipheredOpcode(param0 ^ 32161, 65);
          vl.outgoingPacket.writeByte(param0 ^ 1, 1);
          vl.outgoingPacket.writeByte(param0 + 1, 64);
          this.remainingTurnTicks = param0;
          this.field_Tb = true;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.AD(" + param0 + ')');
        }
    }

    private final boolean d(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          var4_int = this.battlefield.mapWidth;
          var5 = this.battlefield.mapHeight;
          if (param2 >= 0 &&
            var4_int > param2) {
            if (param1 >= 0 &&
              param1 < var5) {
              if (~(var4_int - 1) == ~param2 &&
                ~(var5 - 1) == ~param1) {
                return false;
              }
              if (param0 > -46) {
                this.e(-49);
              }
              var6 = param2 + param1 * var4_int;
              if (var6 >= this.battlefield.tiles.length) {
                return false;
              }
              if ((-1 + var4_int) > param2 &&
                1 + var6 < this.battlefield.tiles.length) {
                if (var5 - 1 > param1 &&
                  (var6 + var4_int) < this.battlefield.tiles.length) {
                  if (param2 < -1 + var4_int &&
                    -1 + var5 > param1 &&
                    this.battlefield.tiles.length > 1 + var6 + var4_int) {
                    return true;
                  }
                  return false;
                }
                return false;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4), "ic.LD(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void k(boolean param0) {
        int stackIn_7_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var2_intLifetime1Lifetime1;
        int var3Lifetime1Lifetime1;
        int var4Lifetime1Lifetime1;
        int var5Lifetime1Lifetime1;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.battlefield.campaignMission != null) {
            return;
          }
          var6 = this.battlefield.playerCount;
          stackIn_7_0 = (var6 <= 3) ? 70 : 0;
          var7 = stackIn_7_0;
          this.field_l = false;
          if (this.battlefield.teamGame) {
            var2_int = 393;
            var3 = 120;
            var4 = var2_int + 217;
            var5 = 29 + var3;
            if (var14 != 0) {
              var2_int = 371;
              var3 = var7 + 57;
              var4 = 217 + var2_int;
              var5 = var3 + 29;
            }
          } else {
            var2_int = 371;
            var3 = var7 + 57;
            var4 = 217 + var2_int;
            var5 = var3 + 29;
          }
          if (IterableDualNodeDeque.isPointerInBounds(-33, var2_int, var4, var3, var5)) {
            this.field_l = true;
            if (DeployEvent.pointerPressButton != 0) {
              this.field_Rb = this.field_Rb + 1;
              if (this.field_Rb >= var6) {
                this.field_Rb = 0;
              }
              pc.field_j = null;
            }
          }
          if (DeployEvent.pointerPressButton == 0) {
            return;
          }
          if (!this.battlefield.teamGame) {
            var2_intLifetime1 = 41;
            var3Lifetime1 = var7 + 57;
            var4Lifetime1 = 134 + var2_intLifetime1;
            var5Lifetime1 = 228 + var3Lifetime1;
            if (IterableDualNodeDeque.isPointerInBounds(-33, var2_intLifetime1, var4Lifetime1, var3Lifetime1, var5Lifetime1)) {
              pc.field_j = null;
              this.field_Rb = 0;
            }
            if (var6 == 2) {
              var2_intLifetime1 = 200;
              var3Lifetime1 = 127;
              var4Lifetime1 = 134 + var2_intLifetime1;
              var5Lifetime1 = 228 + var3Lifetime1;
            }
            if (var6 != 2 ||
              var14 != 0) {
              var3Lifetime1 = var7 + 57;
              var2_intLifetime1 = 181;
              var4Lifetime1 = var2_intLifetime1 + 184;
              var5Lifetime1 = 111 + var3Lifetime1;
            }
            if (IterableDualNodeDeque.isPointerInBounds(-33, var2_intLifetime1, var4Lifetime1, var3Lifetime1, var5Lifetime1)) {
              pc.field_j = null;
              this.field_Rb = 1;
            }
            if (var6 > 2) {
              var3Lifetime1Lifetime1 = 174 + var7;
              var2_intLifetime1Lifetime1 = 181;
              var5Lifetime1Lifetime1 = 111 + var3Lifetime1Lifetime1;
              var4Lifetime1Lifetime1 = 184 + var2_intLifetime1Lifetime1;
              if (IterableDualNodeDeque.isPointerInBounds(-33, var2_intLifetime1Lifetime1, var4Lifetime1Lifetime1, var3Lifetime1Lifetime1, var5Lifetime1Lifetime1)) {
                this.field_Rb = 2;
                pc.field_j = null;
              }
            }
            var7 = 298;
            if (!param0) {
              return;
            }
            var8 = 46;
            var9 = 3;
            while (var6 > var9) {
              if (var14 != 0) {
                return;
              }
              if (IterableDualNodeDeque.isPointerInBounds(-33, var8, var8 + 110, var7, 110 + var7)) {
                pc.field_j = null;
                this.field_Rb = var9;
              }
              var8 += 110;
              var9++;
            }
            return;
          }
          var8Lifetime1 = 41;
          var9Lifetime1 = 57;
          var10 = 260 / (this.battlefield.playerCount / this.battlefield.teamCount);
          var11 = 0;
          scanLoop1: while (true) {
            stackIn_27_0 = this.battlefield.teamCount;
            stackIn_27_1 = var11;
            scanLoop2: while (stackIn_27_0 > stackIn_27_1) {
              var12 = -33 + (var10 / 2 + var8Lifetime1) + 5;
              var13 = 0;
              while (var13 < this.battlefield.playerCount) {
                stackIn_27_0 = this.battlefield.getPlayerTeamIndex(var13, -1);
                stackIn_27_1 = this.battlefield.rankedParticipants[var11];
                if (var14 != 0) {
                  continue scanLoop2;
                }
                if (stackIn_27_0 == stackIn_27_1 ||
                  var14 != 0) {
                  if (IterableDualNodeDeque.isPointerInBounds(-33, var12, var12 + 67, var9Lifetime1 + 50, 155 + var9Lifetime1)) {
                    this.field_Rb = var13;
                    pc.field_j = null;
                    return;
                  }
                  var12 = var12 + var10;
                }
                var13++;
              }
              var9Lifetime1 += 180;
              var11++;
              if (var14 == 0) {
                continue scanLoop1;
              }
              return;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.CE(" + param0 + ')');
        }
    }

    private final void requestSpellCast(int selectionMode, int tileY, int spellId, int obfuscationGuard, boolean confirmed, int tileX) {
        RuntimeException decompiledCaughtException = null;
        String validationMessage = null;
        RuntimeException var7_ref = null;
        Object spell = null;
        int var9 = 0;
        String confirmationPrompt;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 2) {
            this.a(103, 19, -106, 102, -35, -67, -34, 6);
          }
          validationMessage = de.getSpellCastError((byte) 66, tileY, this.battlefield, tileX, spellId, this.controlledPlayerId);
          if (null != validationMessage) {
            this.a(false, validationMessage, (byte) -118);
            return;
          }
          if (!confirmed) {
            confirmationPrompt = kq.getSpellConfirmationPrompt(tileY, 7, spellId, this.battlefield, tileX);
            if (confirmationPrompt != null) {
              this.spellConfirmation = new SpellConfirmationDialog(selectionMode, spellId, tileX, tileY, confirmationPrompt, this);
              return;
            }
          }
          if (this.battlefield.spellCastPending) {
            return;
          }
          this.field_gc = -1;
          this.field_ic = -1;
          this.field_nc = -1;
          if (uc.spellDefinitions[spellId][3] != 4) {
            spell = new UnitSpell(spellId, tileX, tileY);
            if (var9 != 0) {
              spell = new GlobalSpell(spellId);
            }
          } else {
            spell = new GlobalSpell(spellId);
          }
          if (uc.spellDefinitions[spellId][4] == 5) {
            this.notifyTutorialInteraction(26, selectionMode, -39);
            this.a(false, obfuscationGuard ^ 56, this.battlefield.tiles[tileY * this.battlefield.mapWidth + tileX].occupant);
            if (null == this.selectedUnit) {
              return;
            }
            this.movementPlanner.prepareForUnit(false, obfuscationGuard ^ 33, this.controlledPlayerId, this.selectedUnit, selectionMode, spellId);
            if (var9 == 0) {
              return;
            }
          }
          this.battlefield.spellCastPending = true;
          this.notifyTutorialInteraction(25, ((Spell) (spell)).spellId, -118);
          if (this.field_lb) {
            vl.outgoingPacket.writeCipheredOpcode(32161, 65);
            vl.outgoingPacket.writeByte(1, 2 + ((Spell) (spell)).getPayloadSize(25365));
            vl.outgoingPacket.writeByte(1, 160);
            vl.outgoingPacket.writeByte(1, selectionMode);
            ((Spell) (spell)).writePayload(-11637, vl.outgoingPacket);
            if (var9 == 0) {
              return;
            }
          }
          new SpellCastAction((Spell) (spell), selectionMode, this.controlledPlayerId).applyToBattlefield(obfuscationGuard ^ 66, this.battlefield);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var7_ref), "ic.DD(" + selectionMode + ',' + tileY + ',' + spellId + ',' + obfuscationGuard + ',' + confirmed + ',' + tileX + ')');
        }
    }

    private final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -22038) {
            this.field_fb = 31;
          }
          if (!kt.field_l) {
            this.g((byte) 118);
            if (!ArmiesOfGielinor.obfuscationControl) {
              return;
            }
          }
          this.q(2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.IB(" + param0 + ')');
        }
    }

    private final void p(int param0) {
        int stackIn_11_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        RgbSprite stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_96_3 = 0;
        RgbSprite stackIn_99_0;
        int stackIn_99_1;
        int stackIn_99_2;
        int stackIn_99_3;
        int stackIn_100_4;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int stackIn_57_0Lifetime1;
        int stackIn_57_1Lifetime1;
        int stackIn_81_0Lifetime1;
        int stackIn_81_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var9Lifetime1Lifetime1;
        int var10Lifetime1Lifetime1;
        var17 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var2_int = 0;
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (6 <= var3))) {
            stackIn_11_0 = 0;
            if (var17 == 0) {
              if (stackIn_11_0 < eb.a((byte) -112, this.field_Y[var3 + 1])) {
                var2_int++;
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var3 = 0;
            stackIn_11_0 = 3;
          }
          var4 = new int[stackIn_11_0];
          var4[0] = (int)(128.0 - Math.cos(3.141592653589793 * (double)this.field_dc[0] / 256.0) * 128.0);
          var4[1] = (int)(128.0 - Math.cos((double)this.field_dc[1] * 3.141592653589793 / 256.0) * 128.0);
          var4[2] = (int)(-(Math.cos((double)this.field_dc[2] * 3.141592653589793 / 256.0) * 128.0) + 128.0);
          var5 = so.field_b.field_a;
          if (param0 != 20) {
            return;
          }
          var6 = so.field_b.field_g;
          var7 = var6 - this.f(128, this.g(2));
          if (this.field_dc[2] < 256) {
            SoftwareRaster.b(0, 0, var5, var6, 0, (-var4[2] + 255) / 2);
            rs.field_n.a(SummonAction.field_F, var5 / 2, -(var7 >> 1) + (-20 + var6 / 2), 16763904, 0, -var4[2] + 255);
          }
          this.n(-12);
          var8 = 0;
          while (var8 < 6) {
            stackIn_57_0 = -1;
            stackIn_57_1 = ~eb.a((byte) -105, this.field_Y[var8 + 1]);
            if (var17 != 0) {
              return;
            }
            if (stackIn_57_0 > stackIn_57_1) {
              var9 = var5 / 2 + (int)(140.0 * Math.sin(2.0 * ((double)var3 * 3.141592653589793) / (double)var2_int));
              var10 = -(var7 >> 1) - 20 + var6 / 2 + (int)((double)(140 - var7 / 3) * -Math.cos(2.0 * (3.141592653589793 * (double)var3) / (double)var2_int));
              if (this.field_e[0] != var8) {
                if (this.field_e[1] != var8) {
                  if (~this.field_e[2] == ~var8) {
                    if (this.field_dc[2] < 256) {
                      var11 = (6400 - var4[2] * 25) / 256;
                      UnitModelPreview.field_d[var8 + 1].c(-var11 + var9, var10 - var11, var11 << 1, var11 << 1);
                    }
                  } else if (this.field_dc[2] < 256) {
                    UnitModelPreview.field_d[var8 + 1].e(var9 - 25, var10 - 25, 256 - var4[2]);
                  }
                } else if (this.field_dc[1] < 256) {
                  var11 = (256 - var4[1]) * 25 / 256;
                  UnitModelPreview.field_d[1 + var8].c(var9 - var11, -var11 + var10, var11 << 1, var11 << 1);
                }
              } else {
                if (this.field_dc[0] < 256) {
                  var11 = (6400 - var4[0] * 25) / 256;
                  UnitModelPreview.field_d[var8 + 1].c(-var11 + var9, var10 - var11, var11 << 1, var11 << 1);
                }
              }
              var3++;
              if (this.field_dc[2] < 256) {
                gt.field_c[1 + var8].e(-37 + var9, var10 - 42, 256 - var4[2]);
              }
            }
            var8++;
          }
          var8Lifetime1 = 0;
          while (true) {
            stackIn_57_0Lifetime1 = ~var8Lifetime1;
            stackIn_57_1Lifetime1 = -4;
            if (stackIn_57_0Lifetime1 <= stackIn_57_1Lifetime1) {
              break;
            }
            if (var17 != 0) {
              return;
            }
            boolean decompiledFrameRemainder0 = true;
            if (this.field_e[var8Lifetime1] > -1) {
              if (this.field_dc[var8Lifetime1] < 256) {
                var9Lifetime1 = 0;
                var10Lifetime1 = 0;
                while (var10Lifetime1 < 6) {
                  stackIn_81_0 = ~this.field_e[var8Lifetime1];
                  stackIn_81_1 = ~var10Lifetime1;
                  if (stackIn_81_0 != stackIn_81_1) {
                    if (eb.a((byte) -73, this.field_Y[1 + var10Lifetime1]) > 0) {
                      var9Lifetime1++;
                    }
                    var10Lifetime1++;
                    continue;
                  }
                  break;
                }
                var10Lifetime1 = (int)(140.0 * Math.sin((double)var9Lifetime1 * 3.141592653589793 * 2.0 / (double)var2_int)) + var5 / 2;
                stackIn_81_0Lifetime1 = (int)(-Math.cos(2.0 * ((double)var9Lifetime1 * 3.141592653589793) / (double)var2_int) * (double)(-(var7 / 3) + 140)) + var6 / 2 - 20;
                stackIn_81_1Lifetime1 = -(var7 / 2);
                var11Lifetime1 = stackIn_81_0Lifetime1 + stackIn_81_1Lifetime1;
                var12 = (var8Lifetime1 - 1) * 50 + var5 / 2;
                var13 = -30 + this.f(param0 ^ 148, this.g(2));
                var14 = ((-var4[var8Lifetime1] + 256) * var10Lifetime1 + var4[var8Lifetime1] * var12) / 256;
                var15 = (var11Lifetime1 * (256 - var4[var8Lifetime1]) + var4[var8Lifetime1] * var13) / 256 - (int)(Math.sin((double)this.field_dc[var8Lifetime1] * 3.141592653589793 / 256.0) * 120.0);
                var16 = 10 + (-(var4[var8Lifetime1] * 54) + 13824) / 256;
                pv.field_e.b();
                SoftwareRaster.b();
                TrianglePulse.field_d.b(0, 0, TutorialLayout.field_g[1 + this.field_e[var8Lifetime1]]);
                so.field_b.a(5605);
                pv.field_e.d(var14 - var16 / 2, var15 - var16 / 2, var16, var16, 255);
                decompiledFrameRemainder0 = false;
              }
              else {
                if (this.field_dc[var8Lifetime1] < 384) {
                  var9Lifetime1Lifetime1 = (var8Lifetime1 - 1) * 50 + var5 / 2;
                  var10Lifetime1Lifetime1 = -30 + this.f(128, this.g(2));
                  if (this.field_dc[var8Lifetime1] < 320) {
                    pv.field_e.b();
                    TrianglePulse.field_d.b(0, 0, TutorialLayout.field_g[this.field_e[var8Lifetime1] + 1]);
                    so.field_b.a(5605);
                    pv.field_e.d(var9Lifetime1Lifetime1 - 5, -5 + var10Lifetime1Lifetime1, 10, 10, 255);
                  }
                  if (this.field_dc[var8Lifetime1] > 256) {
                    ((nj) (gt.field_c[1 + this.field_e[var8Lifetime1]])).h(-18 + var9Lifetime1Lifetime1, var10Lifetime1Lifetime1 - 21, (this.field_dc[var8Lifetime1] - 256) * 2);
                  }
                  stackIn_95_0 = TrianglePulse.field_d;
                  stackIn_95_1 = var9Lifetime1Lifetime1 - 32;
                  stackIn_95_2 = -32 + var10Lifetime1Lifetime1;
                  if (this.field_dc[var8Lifetime1] <= 320) {
                    stackIn_96_3 = 1280 - 4 * this.field_dc[var8Lifetime1];
                  } else {
                    stackIn_96_3 = this.field_dc[var8Lifetime1] * 4 - 1280;
                  }
                  ((RgbSprite) (Object) stackIn_95_0).f(stackIn_95_1, stackIn_95_2, -stackIn_96_3 + 256);
                  stackIn_99_0 = TrianglePulse.field_d;
                  stackIn_99_1 = -32 + var9Lifetime1Lifetime1;
                  stackIn_99_2 = var10Lifetime1Lifetime1 - 32;
                  stackIn_99_3 = 256;
                  if (this.field_dc[var8Lifetime1] <= 320) {
                    stackIn_100_4 = 4 * (-this.field_dc[var8Lifetime1] + 320);
                  } else {
                    stackIn_100_4 = -1280 + 4 * this.field_dc[var8Lifetime1];
                  }
                  ((RgbSprite) (Object) stackIn_99_0).f(stackIn_99_1, stackIn_99_2, stackIn_99_3 - stackIn_100_4);
                }
              }
            }
            var8Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.EA(" + param0 + ')');
        }
    }

    private final void x(int param0) {
        int stackIn_24_0 = 0;
        int stackIn_28_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 < 20) {
            this.c(-10, true);
          }
          var2_int = 0;
          while (3 > var2_int) {
            if (var3 != 0) {
              return;
            }
            if (this.field_e[var2_int] > -1) {
              if (this.field_dc[var2_int] < 384) {
                this.field_dc[var2_int] = this.field_dc[var2_int] + 4;
              }
              if (this.field_dc[var2_int] == 320) {
                this.battlefield.chosenGods[this.controlledPlayerId][this.battlefield.field_D] = this.field_e[var2_int];
                this.battlefield.godFavourLevels[this.controlledPlayerId][this.battlefield.chosenGods[this.controlledPlayerId][this.battlefield.field_D]] = 1;
                this.battlefield.field_D = this.battlefield.field_D + 1;
              }
              stackIn_24_0 = (this.field_dc[2] != 384) ? 0 : 1;
              if (this.battlefield.field_D != 3) {
                stackIn_28_1 = 0;
              } else {
                stackIn_28_1 = 1;
              }
              if ((stackIn_24_0 & stackIn_28_1) != 0) {
                this.rebuildSummonMenus(true);
                this.b(-24936);
                if (!this.field_lb) {
                  this.battlefield.applyTurnChange(true, 0, 0);
                  if (this.field_z) {
                    this.a(29, -119);
                  } else {
                    this.e((byte) 77);
                    this.field_V = true;
                    mu.field_a = new cg();
                    qc.field_j = 0;
                    this.remainingTurnTicks = ce.turnDurationTicks[this.battlefield.turnDurationOption];
                  }
                }
                this.battlefield.field_Cb = true;
              }
            }
            var2_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.OB(" + param0 + ')');
        }
    }

    private final void m(int param0) {
        int stackIn_20_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_75_0Lifetime1;
        int stackIn_75_1Lifetime1;
        int var2_intLifetime1;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_P &&
            this.field_n != 256) {
            if (param0 != 11425) {
              this.field_r = false;
            }
            var2_int = -1;
            while (var2_int < 6) {
              stackIn_75_0 = uc.spellDefinitions[th.floorModWithOffset(var2_int + this.field_Lb, param0 - 11424, 135)][1];
              stackIn_75_1 = this.battlefield.playerTurnCounts[this.controlledPlayerId];
              if (var5 != 0) {
                return;
              }
              stackIn_20_0 = (stackIn_75_0 <= stackIn_75_1) ? 0 : 1;
              var3 = stackIn_20_0;
              var4 = uc.spellDefinitions[th.floorModWithOffset(var2_int + this.field_Lb, 1, 135)][2];
              if (~th.floorModWithOffset(this.field_Lb + var2_int, 1, 135) == ~this.field_gc) {
                TeamRoster.field_e.d(var2_int * 45 + 200 + this.field_g, -125 + this.o(127), 60, 60, 256);
              }
              if (var2_int == -1) {
                if (this.field_g > 0) {
                  if (BattleCharacter.field_h.length <= var4) {
                    SoftwareRaster.a(this.field_g + 45 * var2_int + 230, this.o(126) - 95, 20, AttackEvent.nextBoundedInt(false, 16777215, vv.field_b), -(this.field_n >> 1) + 128);
                  } else {
                    BattleCharacter.field_h[var4].e(this.field_g + (211 + var2_int * 45), this.o(127) - 115, -this.field_n + 256);
                  }
                  if (var3 != 0) {
                    SoftwareRaster.a(230 + (var2_int * 45 + this.field_g), -95 + this.o(param0 ^ 11484), 20, 0, 128);
                  }
                  en.field_E.c(Integer.toString(var4), 231 - (-(var2_int * 45) - this.field_g), this.o(125) - 60, 16777215, 0);
                }
              } else if (var2_int == 5) {
                if (0 > this.field_g) {
                  if (BattleCharacter.field_h.length <= var4) {
                    SoftwareRaster.a(45 * var2_int + 230 + this.field_g, -95 + this.o(126), 20, AttackEvent.nextBoundedInt(false, 16777215, vv.field_b), -(this.field_n >> 1) + 128);
                  } else {
                    BattleCharacter.field_h[var4].e(45 * var2_int + (211 + this.field_g), this.o(127) - 115, -this.field_n + 256);
                  }
                  if (var3 != 0) {
                    SoftwareRaster.a(this.field_g + 230 + var2_int * 45, -95 + this.o(125), 20, 0, 128);
                  }
                  en.field_E.c(Integer.toString(var4), this.field_g + 231 + 45 * var2_int, this.o(param0 ^ 11487) - 60, 16777215, 0);
                }
              } else {
                if (var4 < BattleCharacter.field_h.length) {
                  BattleCharacter.field_h[var4].e(this.field_g + (var2_int * 45 + 211), -115 + this.o(126), 256 - this.field_n);
                } else {
                  SoftwareRaster.a(this.field_g + (230 + 45 * var2_int), -95 + this.o(127), 20, AttackEvent.nextBoundedInt(false, 16777215, vv.field_b), -(this.field_n >> 1) + 128);
                }
                if (var3 != 0) {
                  SoftwareRaster.a(var2_int * 45 + (230 + this.field_g), this.o(127) - 95, 20, 0, 128);
                }
                en.field_E.a(Integer.toString(var4), this.field_g + (231 + 45 * var2_int), -60 + this.o(125), 16777215, 0, 256 - this.field_n);
              }
              var2_int++;
            }
            var2_intLifetime1 = -1;
            while (true) {
              stackIn_75_0Lifetime1 = var2_intLifetime1;
              stackIn_75_1Lifetime1 = 6;
              if (stackIn_75_0Lifetime1 >= stackIn_75_1Lifetime1) {
                break;
              }
              if (var5 != 0) {
                return;
              }
              if (var2_intLifetime1 != -1) {
                if (var2_intLifetime1 == 5) {
                  cu.field_d[2].e(211 + 45 * var2_intLifetime1, this.o(param0 - 11300) - 115, -this.field_n + 256);
                }
              } else {
                cu.field_d[0].e(211 + var2_intLifetime1 * 45, this.o(127) - 95 - 20, -this.field_n + 256);
              }
              km.field_h[0].e(208 + var2_intLifetime1 * 45, -95 + this.o(125) - 23, -this.field_n + 256);
              var2_intLifetime1++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.GB(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        try {
          field_A = null;
          if (param0 >= -95) {
            GameplayController.a((String) null, (byte) 73, (String) null, (ResourceArchive) null);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.LA(" + param0 + ')');
        }
    }

    private final void b(int param0, byte param1, int param2) {
        CoatOfArms stackIn_25_0 = null;
        boolean stackIn_26_1 = false;
        int[][] stackIn_29_2 = null;
        int stackIn_30_3 = 0;
        int stackIn_33_2;
        int stackIn_33_3;
        boolean stackIn_34_4 = false;
        int stackIn_37_5;
        String stackIn_37_6;
        boolean stackIn_37_7;
        boolean stackIn_38_8 = false;
        boolean stackIn_42_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 <= 70) {
            this.field_Ub = (NodeDeque) null;
          }
          var4_int = 0;
          param0 = -param0;
          if (param2 > 3) {
            fe.b(db.a(true, 41), MatchConditionEntry.a(292, (byte) 94), 553, 127, io.field_m, nd.field_b, 0, 180);
            var7 = 3;
            while (param2 > var7) {
              var5 = this.battlefield.rankedParticipants[var7];
              var6 = this.battlefield.playerNames[var5].toUpperCase();
              if (var8 != 0) {
                return;
              }
              if (param0 >= 1) {
                if (param0 >= 0 &&
                  !(ph.field_b.length <= param0)) {
                  fe.c(ph.field_b[param0], db.a(true, var4_int + 98), MatchConditionEntry.a(323, (byte) 94), nd.field_b, true);
                }
              } else {
                fe.c(DualNodeIterator.field_g, db.a(true, 98 + var4_int), MatchConditionEntry.a(323, (byte) 94), nd.field_b, true);
              }
              stackIn_25_0 = this.battlefield.playerCoats[var5];
              stackIn_26_1 = (0 != (1 << var5 & this.battlefield.eliminatedPlayerMask));
              stackIn_29_2 = op.field_c;
              if (this.battlefield.teamGame) {
                stackIn_30_3 = 1;
              } else {
                stackIn_30_3 = 0;
              }
              stackIn_33_2 = stackIn_29_2[stackIn_30_3][var5];
              stackIn_33_3 = MatchConditionEntry.a(311, (byte) 94);
              stackIn_34_4 = !((1 << var5 & this.battlefield.field_C) <= 0);
              stackIn_37_5 = db.a(true, 70 + var4_int);
              stackIn_37_6 = var6;
              stackIn_37_7 = true;
              stackIn_38_8 = ((1 << var5 & this.battlefield.inactivePlayerMask) != 0);
              ((CoatOfArms) (Object) stackIn_25_0).a(stackIn_26_1, stackIn_33_2, stackIn_33_3, stackIn_34_4, stackIn_37_5, stackIn_37_6, stackIn_37_7, stackIn_38_8, false, -19744);
              en.field_E.c(var6, db.a(true, 98 + var4_int), MatchConditionEntry.a(380, (byte) 94), 16777215, -1);
              stackIn_42_1 = (~this.field_Rb == ~var7);
              this.a(stackIn_42_1, var5, (byte) -64, 66 + var4_int, 385);
              param0++;
              var4_int += 110;
              var7++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4), "ic.NB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void saveCampaignQuicksave(byte obfuscationGuard) {
        try {
          LobbyPlayer.uploadQuicksave(this.battlefield, this.battlefield.damageTakenByPlayer[this.battlefield.campaignMission.playerSlot], this.battlefield.unitLossCounts[this.battlefield.campaignMission.playerSlot], (byte) -80, this.battlefield.campaignMission.missionId, this.battlefield.campaignMission.campaign.campaignIndex);
          LineOfSightGrid.$cfr$intArgs$a$5d483ac33914(-80, PacketBuffer.field_p, this.field_Nb);
          if (obfuscationGuard >= -39) {
            this.s(-24);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ic.EC(" + obfuscationGuard + ')');
        }
    }

    final void startEquipmentTutorial(byte obfuscationGuard) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_Yb = 2;
          this.battlefield.loadOrGenerateMap(0, 2);
          var2_int = 0;
          do {
            if (var2_int >= this.aiPlanners.length) {
              this.movementPlanner = new MovementPlanner(this.battlefield);
              this.battleTutorial = (BattleTutorial) ((Object) new EquipmentBattleTutorial(this));
              this.field_z = true;
              this.battlefield.field_V = false;
              this.battlefield.playerNames = new String[2];
              break;
            }
            this.aiPlanners[var2_int] = null;
            var2_int++;
          } while (var3 == 0);
          if (!DamageEvent.g(79)) {
            this.battlefield.playerNames[0] = mv.localAccountName;
            if (var3 != 0) {
              this.battlefield.playerNames[0] = BoundedFile.field_i;
            }
          } else {
            this.battlefield.playerNames[0] = BoundedFile.field_i;
          }
          this.battlefield.playerNames[1] = vs.field_b;
          this.battlefield.playerCoats = new CoatOfArms[2];
          this.battlefield.playerCoats[0] = ah.localCoat;
          if (obfuscationGuard != 60) {
            this.v(-13);
          }
          this.battlefield.playerCoats[1] = new CoatOfArms(GrowthEvent.field_E, su.field_a);
          this.battlefield.currentPlayer = 0;
          this.field_V = false;
          this.remainingTurnTicks = ce.turnDurationTicks[this.battlefield.turnDurationOption];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.BE(" + obfuscationGuard + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        int[] var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int[] var4Lifetime1;
        int var5Lifetime1;
        try {
          if (rb.a(param0, BoundedFile.field_e, 1)) {
            return;
          }
          if (param1 != 30) {
            this.field_Rb = 37;
          }
          var4 = BoundedFile.field_e;
          var5 = param0;
          var4[var5 >> 5] = oe.bitwiseOr(var4[var5 >> 5], 1 << rn.bitwiseAnd(var5, 31));
          var4Lifetime1 = ReportAbuseDialog.field_Nb;
          var5Lifetime1 = param0;
          var4Lifetime1[var5Lifetime1 >> 5] = oe.bitwiseOr(var4Lifetime1[var5Lifetime1 >> 5], 1 << rn.bitwiseAnd(31, var5Lifetime1));
          ai.field_P.addLast((byte) -119, (IntrusiveNode) (new jg(param0)));
          if (!this.field_R) {
            UnitInfoPopup.field_u.addLast((byte) -119, (IntrusiveNode) (new iw(param0, param2, -1, -1, -1, -1)));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4_ref), "ic.DB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void e(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != -56) {
            return;
          }
          if (!this.field_lb) {
            this.a(17, -125);
            this.field_Tb = false;
            if (!ArmiesOfGielinor.obfuscationControl) {
              return;
            }
          }
          if (~this.field_db != ~param0) {
            throw new RuntimeException((String) null);
          }
          if (this.battlefield.currentPlayer == this.controlledPlayerId) {
            vl.outgoingPacket.writeCipheredOpcode(param1 + 32217, 73);
            vl.outgoingPacket.writeByte(1, param0);
            vl.outgoingPacket.writeShort(true, uk.field_n - this.field_zb);
            this.field_Tb = false;
          }
          this.field_db = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ic.HC(" + param0 + ',' + param1 + ')');
        }
    }

    private final void q(int param0) {
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        int[][] stackIn_88_0 = null;
        int stackIn_89_1 = 0;
        int[][] stackIn_105_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_111_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        float var10_float = 0.0f;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        float var13_float = 0.0f;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.battlefield.mapSizeSetting == 4) {
            return;
          }
          if (0 >= this.field_H) {
            return;
          }
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameRemainder0 = true;
          var2_int = this.battlefield.mapSizeSetting;
          if ((var2_int != 0 ||
            var16 != 0) &&
            (decompiledFrameRemainder0 = (1 != var2_int)) &&
            (decompiledFrameRemainder1 = (var2_int != 2 ||
            var16 != 0)) &&
            (decompiledFrameRemainder3 = (var2_int == 3))) {
            decompiledFrameRemainder2 = (var16 != 0);
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1) &&
            (decompiledFrameRemainder0)) {
            io.field_z.c(this.field_H * 2 - 475, 138, 390, 200);
            decompiledFrameRemainder3 = (var16 != 0);
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            io.field_z.c(-490 + this.field_H * 2, 128, 430, 220);
            decompiledFrameRemainder3 = (var16 != 0);
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameRemainder2)) {
            io.field_z.c(-480 + 2 * this.field_H, 138, 400, 200);
            decompiledFrameRemainder3 = (var16 != 0);
          }
          if (decompiledFrameRemainder3) {
            io.field_z.c(2 * (this.field_H - 240) - 15, 93, 430, 290);
          }
          var2_int = 0;
          var3 = 2;
          var4 = 1;
          var5 = 0;
          var6 = 0;
          var7_int = this.battlefield.mapSizeSetting;
          switch ((var16 == 0
            || var7_int == 2
            || var7_int == 3
            ) ? var7_int : -1) {
            case 0:
              var5 = 15;
              var3 = 8;
              var4 = 4;
              var6 = 20;
              if (var16 == 0) {
                break;
              }
            case 1:
              var6 = 20;
              var3 = 6;
              var4 = 3;
              var5 = -5;
              if (var16 == 0) {
                break;
              }
            case 2:
              var4 = 2;
              var5 = 10;
              var3 = 4;
              var6 = 20;
              if (var16 == 0) {
                break;
              }
            case 3:
              var6 = 20;
              var5 = -10;
              var4 = 2;
              var3 = 3;
            default:
              break;
          }
          boolean decompiledFrameCompleted0 = true;
          var7 = 1.401298464324817e-45f;
          var8 = 3.4028234663852886e+38f;
          if (fs.field_b != null &&
            mu.field_f != 0) {
            var9 = 0;
            while (!(var9 >= fs.field_b.length)) {
              var10_float = fs.field_b[var9];
              stackIn_73_0 = $cfr$fcmpl(var8, var10_float);
              if (var16 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_73_0 > 0) {
                var8 = var10_float;
              }
              if (var7 < var10_float) {
                var7 = var10_float;
              }
              var9++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_73_0 = 0;
          }
          var9 = stackIn_73_0;
          while (true) {
            stackIn_75_0 = ~var9;
            if (stackIn_75_0 > ~this.battlefield.mapWidth) {
              stackIn_111_0 = 0;
              if (var16 == 0) {
                var10 = stackIn_111_0;
                while (var10 < this.battlefield.mapWidth) {
                  var11 = UnitLossCondition.battlefieldThemes[this.battlefield.mapTheme].terrainPreviewColours[this.battlefield.tiles[var2_int].terrainType];
                  var13 = mu.field_f;
                  stackIn_75_0 = var13;
                  if (stackIn_75_0 == 0) {
                    if (!(this.battlefield.tiles[var2_int].ownerPlayer <= -1)) {
                      stackIn_88_0 = op.field_c;
                      if (!this.battlefield.teamGame) {
                        stackIn_89_1 = 0;
                      } else {
                        stackIn_89_1 = 1;
                      }
                      var11 = stackIn_88_0[stackIn_89_1][this.battlefield.getPlayerTeamIndex(this.battlefield.tiles[var2_int].ownerPlayer, -1)];
                    }
                  } else {
                    var12 = 0;
                    if (null != fs.field_b &&
                      fs.field_b.length > var2_int) {
                      var13_float = 0.0f;
                      var13_float = fs.field_b[var2_int];
                      var12 = -15 + (int)(30.0f * (-var8 + var13_float) / (-var8 + var7));
                      if (var12 <= 0) {
                        var12 = -var12 << 20 & 267386880;
                      } else {
                        var12 = var12 << 12;
                      }
                      var12 = var12 | 15;
                    }
                    var11 = var12;
                  }
                  var12 = var5 - 2 * (225 - this.field_H) + (var3 * var9 + var3 * var10);
                  var13 = var6 + (215 + var9 * var4) - var10 * var4;
                  SkeletonLimitMarker.field_s[this.battlefield.mapSizeSetting].b(var12, var13, var11);
                  if (null != this.battlefield.tiles[var2_int].occupant) {
                    stackIn_105_0 = op.field_c;
                    if (!this.battlefield.teamGame) {
                      stackIn_106_1 = 0;
                    } else {
                      stackIn_106_1 = 1;
                    }
                    var11 = stackIn_105_0[stackIn_106_1][this.battlefield.tiles[var2_int].occupant.ownerPlayer];
                    SkeletonLimitMarker.field_s[this.battlefield.mapSizeSetting + 4].b(var12, var13, var11);
                    if (this.battlefield.tiles[var2_int].occupant.hasMovementFlag1(false)) {
                      var14 = 255 - (80 * SocketResourceClient.b(uk.field_n << 8, 100) >> 16);
                      SkeletonLimitMarker.field_s[4 + this.battlefield.mapSizeSetting].f(var12, var13, var14);
                    }
                  }
                  var2_int++;
                  var10++;
                }
                var9++;
                continue;
              }
            } else {
              var9 = IconTextComponent.l(param0 ^ 26138);
              stackIn_111_0 = BattleUnitRenderer.b(param0 - 1);
            }
            var10 = stackIn_111_0;
            var11 = var3 * var9 / 40;
            cu.field_b.b();
            var12 = var4 * var10 / 20;
            SoftwareRaster.b();
            SoftwareRaster.h(var11 - var4 * 12, -(var4 * 9) + var12, var4 * 12 + var11, -(var4 * 9) + var12, 16777215);
            SoftwareRaster.h(var4 * 12 + var11, 9 * var4 + var12, -(var4 * 12) + var11, var4 * 9 + var12, 16777215);
            SoftwareRaster.h(-(var4 * 12) + var11, var12 - 9 * var4, -(var4 * 12) + var11, var12 + var4 * 9, 16777215);
            SoftwareRaster.h(var11 + 12 * var4, var12 - var4 * 9, var11 + var4 * 12, 9 * var4 + var12, 16777215);
            SoftwareRaster.h(var11 - var4 * 9, var12 - var4 * 8, -(11 * var4) + var11, var12 - var4 * 6, 16777215);
            SoftwareRaster.h(-(var4 * 9) + var11, -(var4 * 8) + var12, -(var4 * 7) + var11, var12 - var4 * 6, 16777215);
            SoftwareRaster.h(-(var4 * 11) + var11, -(6 * var4) + var12, -(10 * var4) + var11, -(var4 * 6) + var12, 16777215);
            SoftwareRaster.h(var11 - 8 * var4, -(6 * var4) + var12, var11 - var4 * 7, -(var4 * 6) + var12, 16777215);
            SoftwareRaster.h(var11 - var4 * 10, var12 - var4 * 6, -(var4 * 10) + var11, var12 - 5 * var4, 16777215);
            SoftwareRaster.h(-(var4 * 8) + var11, -(6 * var4) + var12, var11 - var4 * 8, var12 - 5 * var4, 16777215);
            SoftwareRaster.h(-(10 * var4) + var11, -(5 * var4) + var12, var11 - var4 * 8, var12 - 5 * var4, 16777215);
            this.p((byte) -71);
            so.field_b.a(5605);
            if (this.battlefield.mapSizeSetting < 2) {
              var5 -= 2;
              if (this.battlefield.mapSizeSetting < 1) {
                var5--;
              }
            }
            cu.field_b.e(-448 + param0 * this.field_H + var5, var6 - var4 * this.battlefield.mapWidth + 218, 128);
            var13 = 0;
            var14 = 0;
            var15 = this.battlefield.mapSizeSetting;
            switch ((var16 == 0
              || var15 == 2
              || var15 == 3
              ) ? var15 : -1) {
              case 0:
                var14 = 138;
                var13 = 188;
                if (var16 == 0) {
                  break;
                }
              case 1:
                var14 = 128;
                var13 = 190;
                if (var16 == 0) {
                  break;
                }
              case 2:
                var14 = 137;
                var13 = 188;
                if (var16 == 0) {
                  break;
                }
              case 3:
                var13 = 188;
                var14 = 95;
              default:
                break;
            }
            var13 = var13 - (480 - (this.field_H << 1));
            SpellMenuGroup.field_h[0].g(var13, var14);
            if (240 == this.field_H &&
              SpellMenuGroup.field_h[0].b(var13, var14, AiPlanningStrategy.pointerX, ko.pointerY)) {
              SpellMenuGroup.field_h[0].f(var13, var14, 200);
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.UC(" + param0 + ')');
        }
    }

    final static RgbSprite a(String param0, byte param1, String param2, ResourceArchive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RgbSprite stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.getGroupId(param2, 109);
          if (param1 != 51) {
            GameplayController.d(45);
          }
          var5 = param3.getFileId((byte) -115, var4_int, param0);
          stackIn_4_0 = ManaEvent.a(var4_int, var5, param1 ^ -9074, param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ic.AE(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void r(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!this.field_lb) {
            throw new IllegalStateException();
          }
          vl.outgoingPacket.writeCipheredOpcode(32161, 67);
          var2_int = 38 / ((param0 - 53) / 41);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.TD(" + param0 + ')');
        }
    }

    final void focusCameraOnTile(int obfuscationGuard, int tileX, int tileY) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.cameraFocusTileIndex = this.battlefield.mapWidth * tileY + tileX;
          if (obfuscationGuard != 25) {
            this.e(-24);
          }
          this.field_Pb = false;
          this.cameraFocusPending = true;
          this.field_Xb = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4), "ic.V(" + obfuscationGuard + ',' + tileX + ',' + tileY + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var9_int = 15724527;
          var10 = param4;
          var11 = param1;
          var12 = param6;
          var13 = param2;
          SoftwareRaster.b(param6, param2, param4, param1, 0, 128);
          param4 = param4 - (param3 << 1);
          param1 = param1 - (param7 << 1);
          param6 = param6 + param3;
          param2 = param2 + param7;
          SoftwareRaster.b(param6, param2, param4, param1, 0, 128);
          if (param5 >= -90) {
            this.field_a = false;
          }
          SoftwareRaster.b(param6, param2, param4, param1, var9_int);
          var14 = op.field_c[0][param0];
          param2++;
          param4 -= 2;
          param1 -= 2;
          param6++;
          param4 = this.battlefield.i(param0, -12710) * param4 / this.battlefield.collectedManaTarget;
          SoftwareRaster.f(param6, param2, param4, param1, var14);
          if (this.field_Mb) {
            SoftwareRaster.b(var12, var13, var10, var11, 16777215, (int)(128.0 + Math.sin((double)uk.field_n / 3.141592653589793 / 2.0) * 64.0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var9), "ic.JB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final boolean a(EventPresenter param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            return false;
          }
          if (null == param0) {
            return false;
          }
          stackIn_9_0 = this.a(false, param0.event);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ic.OA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = this.battlefield.getStructureIncome(-117, param1);
          if (var3_int <= 0) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          if (param0 != -70) {
            this.field_nb = -90;
          }
          var4 = this.battlefield.collectedManaTarget - this.battlefield.i(param1, -12710);
          stackIn_7_0 = 1 + (-1 + var4) / var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ic.M(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, int param1, byte param2, int param3, int param4) {
        int stackIn_14_0 = 0;
        RgbSprite[] stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        try {
          if (null != this.battlefield.campaignMission) {
            return;
          }
          var6_int = 0;
          if (this.battlefield.field_rb != null &&
            0 <= param1 &&
            this.battlefield.field_rb.length > param1) {
            var6_int = this.battlefield.field_rb[param1];
          }
          var9 = 94 % ((param2 - 52) / 55);
          if (~param1 == ~this.controlledPlayerId) {
            stackIn_14_0 = this.field_Gb;
          } else {
            stackIn_14_0 = 0;
          }
          var7 = stackIn_14_0;
          var8 = 65;
          if (var7 != 0) {
            var8 += 32;
            param3 -= 16;
          }
          if (!param0) {
            stackIn_22_0 = IsaacRandom.field_a;
          } else {
            stackIn_22_0 = rq.field_k;
          }
          fm.a(stackIn_22_0, var8, db.a(true, param3), MatchConditionEntry.a(param4, (byte) 94), -116);
          it.field_a.g(db.a(true, param3 + 9), MatchConditionEntry.a(6 + param4, (byte) 94));
          rs.field_n.b(Integer.toString(var6_int), db.a(true, param3 + 35), MatchConditionEntry.a(16 + param4, (byte) 94), 104342, -1);
          if (var7 != 0) {
            var10 = "(+" + Integer.toString(var7) + ")";
            rs.field_n.a(var10, db.a(true, 88 + param3), MatchConditionEntry.a(param4 + 16, (byte) 94), 104342, -1);
            if (param3 <= AiPlanningStrategy.pointerX &&
              (param3 + var8) > AiPlanningStrategy.pointerX &&
              ko.pointerY >= param4 &&
              ko.pointerY <= (24 + param4)) {
              var11 = fo.a(4800, qf.field_b, new String[]{Integer.toString(var7 + pg.playerProfile.progressionCredit)});
              var12 = AiPlanningStrategy.pointerX;
              var13 = ko.pointerY;
              var14 = en.field_E.a(var11, 320);
              var15 = en.field_E.getParagraphHeight(var11, 320, en.field_E.field_H);
              SoftwareRaster.a(db.a(true, var12 - 3), MatchConditionEntry.a(-3 + var13, (byte) 94), var14 + 6, 6 + var15, 5, 0, 192);
              en.field_E.a(var11, db.a(true, var12), MatchConditionEntry.a(var13, (byte) 94), var14, var15, 16777215, -1, 0, 0, en.field_E.field_H);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var6), "ic.T(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void k(byte param0) {
        int discarded$0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_Yb = 1;
          this.battlefield.loadOrGenerateMap(0, 1);
          this.movementPlanner = new MovementPlanner(this.battlefield);
          this.battleTutorial = new BattleTutorial(this);
          this.field_z = true;
          var2_int = 0;
          do {
            if (var2_int >= this.aiPlanners.length) {
              this.battlefield.runeCapOption = 0;
              this.battlefield.field_V = false;
              this.battlefield.equippedSpellIds = (int[][]) null;
              this.battlefield.field_D = 3;
              break;
            }
            this.aiPlanners[var2_int] = null;
            var2_int++;
          } while (var3 == 0);
          var2_int = 0;
          do {
            if (var2_int >= 3) {
              this.battlefield.field_Cb = true;
              this.rebuildSummonMenus(true);
              this.battlefield.playerNames = new String[2];
              break;
            }
            this.battlefield.chosenGods[this.controlledPlayerId][var2_int] = var2_int;
            this.battlefield.godFavourLevels[this.controlledPlayerId][this.battlefield.chosenGods[this.controlledPlayerId][var2_int]] = 1;
            var2_int++;
          } while (var3 == 0);
          if (!DamageEvent.g(76)) {
            this.battlefield.playerNames[0] = mv.localAccountName;
            if (var3 != 0) {
              this.battlefield.playerNames[0] = BoundedFile.field_i;
            }
          } else {
            this.battlefield.playerNames[0] = BoundedFile.field_i;
          }
          this.battlefield.playerNames[1] = vs.field_b;
          this.battlefield.playerCoats = new CoatOfArms[2];
          this.battlefield.playerCoats[0] = ah.localCoat;
          this.battlefield.playerCoats[1] = new CoatOfArms(GrowthEvent.field_E, su.field_a);
          this.battlefield.currentPlayer = 0;
          this.field_V = false;
          this.remainingTurnTicks = ce.turnDurationTicks[this.battlefield.turnDurationOption];
          if (param0 >= -108) {
            discarded$0 = this.n((byte) -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ic.RC(" + param0 + ')');
        }
    }

    final void d(int param0, boolean param1) {
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          this.battleTutorial = null;
          if (!this.field_lb) {
            if (l.activeCampaignMission == null) {
              var3_int = 0;
              if (!DamageEvent.g(124)) {
                stackIn_12_0 = (this.field_Yb != 2) ? var3_int : 18;
                var4 = stackIn_12_0;
                var5 = param1 ? 1 : 0;
                CipherPacketBuffer.a(var5 != 0, var4, 1, 0);
                if (var6 != 0) {
                  if (io.a(ReportAbuseDialog.field_Nb, (byte) 124) ||
                    null != PointerInputHandler.field_f) {
                    var4 = param1 ? 1 : 0;
                    CipherPacketBuffer.a(var4 != 0, 10, 1, 0);
                    var4 = var3_int;
                    var5 = param1 ? 1 : 0;
                    CipherPacketBuffer.a(var5 != 0, var4, 1, 0);
                  } else {
                    var4 = var3_int;
                    var5 = param1 ? 1 : 0;
                    CipherPacketBuffer.a(var5 != 0, var4, 1, 0);
                  }
                }
              } else {
                boolean decompiledSharedTail1 = (!(io.a(ReportAbuseDialog.field_Nb, (byte) 124)) &&
                  null == PointerInputHandler.field_f);
                if (!decompiledSharedTail1) {
                  var4 = param1 ? 1 : 0;
                  CipherPacketBuffer.a(var4 != 0, 10, 1, 0);
                  decompiledSharedTail1 = (var6 != 0);
                }
                if (decompiledSharedTail1) {
                  var4 = var3_int;
                  var5 = param1 ? 1 : 0;
                  CipherPacketBuffer.a(var5 != 0, var4, 1, 0);
                }
              }
              decompiledFrameRemainder0 = (var6 != 0);
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledSharedTail0 = !(this.battlefield.field_X);
              if (!decompiledSharedTail0) {
                qh.requestDeleteQuicksave((byte) 27);
                decompiledSharedTail0 = (var6 != 0);
              }
              if ((decompiledSharedTail0) && (this.battlefield.currentPlayer == l.activeCampaignMission.playerSlot &&
                this.field_a)) {
                this.saveCampaignQuicksave((byte) -79);
              }
              MoveEvent.campaignMenu.openCampaign(l.activeCampaignMission.campaign.campaignIndex, true);
            }
          }
          du.field_h = false;
          vs.field_j = true;
          if (param0 <= 93) {
            this.startEquipmentTutorial((byte) 85);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ic.L(" + param0 + ',' + param1 + ')');
        }
    }

    GameplayController(boolean param0, int param1, String[] param2, int param3, boolean param4, BattleGraphicsAssets param5, int param6, int param7, int param8, boolean param9, int param10, int param11, boolean param12, CampaignMission param13) {
        boolean stackIn_4_1 = false;
        Object stackIn_66_0;
        Battlefield stackIn_66_1;
        Battlefield stackIn_66_2;
        int stackIn_66_3;
        String[] stackIn_66_4;
        int stackIn_66_5;
        int[][] stackIn_66_6;
        Battlefield stackIn_67_1 = null;
        Battlefield stackIn_67_2 = null;
        int stackIn_67_7 = 0;
        Object stackIn_69_0;
        boolean stackIn_70_8 = false;
        Object stackIn_72_0;
        boolean stackIn_72_9;
        int stackIn_72_10;
        int stackIn_72_11;
        int stackIn_72_12;
        boolean stackIn_72_13;
        int[][] stackIn_72_14;
        int stackIn_72_15;
        int stackIn_72_16;
        int stackIn_73_17 = 0;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        boolean stackIn_127_0 = false;
        int stackIn_142_0 = 0;
        int stackIn_144_0 = 0;
        boolean stackIn_154_0 = false;
        int stackIn_162_0 = 0;
        int stackIn_162_1 = 0;
        int stackIn_231_1 = 0;
        int stackIn_234_0 = 0;
        int stackIn_234_1 = 0;
        RuntimeException stackIn_244_0 = null;
        StringBuilder stackIn_244_1 = null;
        String stackIn_245_2 = null;
        StringBuilder stackIn_248_1 = null;
        String stackIn_249_2 = null;
        StringBuilder stackIn_252_1 = null;
        String stackIn_253_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_126_0;
        boolean stackOut_153_0;
        int[] var15 = null;
        int[][] var15_array = null;
        RuntimeException var15_ref = null;
        int var16_int = 0;
        int[][] var16 = null;
        float var17 = 0.0f;
        int var18_int = 0;
        su[] var18 = null;
        int[] var19_ref_int__ = null;
        int var19 = 0;
        int[] var20_ref_int__ = null;
        int var20 = 0;
        CampaignParticipant var21_ref_sd = null;
        int var21 = 0;
        int var22 = 0;
        int[] var22_ref_int__ = null;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        CampaignParticipant var25 = null;
        Unit var25_ref = null;
        int var26 = 0;
        Battlefield stackIn_67_1Lifetime1;
        Battlefield stackIn_67_1Lifetime2;
        Battlefield stackIn_67_2Lifetime1;
        Battlefield stackIn_67_2Lifetime2;
        int var18_intLifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var21Lifetime1Lifetime1;
        int var24Lifetime1Lifetime1;
        var26 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.spellConfirmation = null;
        this.field_i = 0;
        this.field_ab = -1;
        this.field_wb = null;
        this.field_ic = -1;
        this.field_R = false;
        this.field_eb = -1;
        this.field_r = true;
        this.field_g = 0;
        this.field_L = 0;
        this.field_K = false;
        this.field_S = false;
        this.field_oc = null;
        this.field_zb = -1;
        this.field_rb = false;
        this.field_j = 0;
        this.field_t = -1;
        this.field_nc = -1;
        this.field_Tb = false;
        this.field_Gb = 0;
        this.field_nb = -1;
        this.field_Jb = -1;
        this.field_ib = 0;
        this.field_kb = -1;
        this.field_Wb = null;
        this.field_h = -1;
        this.field_W = null;
        this.field_Sb = -1;
        this.field_b = 0;
        this.field_gc = -1;
        this.field_U = -1;
        this.field_cc = -1;
        this.field_B = 256;
        this.field_n = 256;
        this.field_Cb = -1;
        this.field_fb = 0;
        this.selectedUnit = null;
        this.field_H = 0;
        this.field_P = false;
        this.field_y = -2;
        this.field_Rb = 0;
        this.field_Lb = 0;
        this.field_pb = 0;
        this.field_Yb = 0;
        this.field_yb = 0;
        this.field_db = 0;
        this.field_Bb = 0;
        this.field_sb = 0;
        this.movementPlanner = null;
        try {
          vv.field_b = new Random(vi.monotonicMillis(95));
          this.encodedDamageCheckpoint = 996394;
          stackIn_4_1 = !(BufferedSocket.field_j < 2);
          this.field_E = stackIn_4_1;
          pc.field_j = null;
          this.encodedTurnCheckpoint = 996394;
          ii.campaignPacketWord1 = 4452;
          kw.campaignPacketWord0 = 2297;
          cg.campaignPacketWord2 = 72584621;
          wr.campaignPacketWord3 = 224;
          this.field_Ub = new NodeDeque();
          this.field_o = new NodeDeque();
          this.field_Nb = new NodeDeque();
          this.overviewTargets = new NodeDeque();
          this.field_u = param4;
          this.field_lb = param0;
          this.controlledPlayerId = param3;
          this.field_bb = false;
          var15 = ReportAbuseDialog.field_Nb;
          var16_int = 0;
          do {
            if (var16_int >= 8) {
              this.field_z = false;
              break;
            }
            var15[var16_int] = 0;
            var16_int++;
          } while (var26 == 0);
          if (0 >= df.field_M) {
            this.field_Y = Widget.field_o;
            if (var26 != 0) {
              this.field_Y = pg.playerProfile.unitUnlockMasks;
            }
          } else {
            this.field_Y = pg.playerProfile.unitUnlockMasks;
          }
          this.field_P = param12;
          if (null == pg.playerProfile) {
            param10 = 0;
          }
          var15_array = (int[][]) null;
          if (param10 != 0) {
            var15_array = new int[][]{pg.playerProfile.equippedSpellIds};
          }
          boolean decompiledFrameRemainder5 = true;
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameRemainder3 = true;
          var16 = new int[][]{this.field_Y};
          AnimationSequence.b(-8);
          var17 = 1.0f;
          if (param13 != null) {
            this.campaignMode = true;
            TabbedPanel.a(param13, (byte) -26);
            var16 = new int[param2.length][7];
            var15_array = new int[param2.length][];
            var18_int = 0;
            while (var18_int < var16.length) {
              var19_ref_int__ = var16[var18_int];
              stackIn_90_0 = ~var18_int;
              stackIn_90_1 = ~param13.playerSlot;
              if (var26 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
              boolean decompiledFrameRemainder6 = true;
              if (stackIn_90_0 != stackIn_90_1) {
                var21_ref_sd = param13.campaign.participants[param13.participantIds[var18_int]];
                var20_ref_int__ = new int[var21_ref_sd.equippedSpellIds.length];
                vm.a(var21_ref_sd.equippedSpellIds, 0, var20_ref_int__, 0, var21_ref_sd.equippedSpellIds.length);
                var22 = 0;
                while (var22 < var19_ref_int__.length) {
                  var19_ref_int__[var22] = 0;
                  var22++;
                }
                if (null != var21_ref_sd.availableUnitTypes) {
                  var22_ref_int__ = var21_ref_sd.availableUnitTypes;
                  var23 = 0;
                  while (var22_ref_int__.length > var23) {
                    var24 = var22_ref_int__[var23];
                    var25_int = jv.getUnitUnlockGroup(false, var24);
                    var19_ref_int__[var25_int] = oe.bitwiseOr(var19_ref_int__[var25_int], 1 << b.getUnitUnlockOrdinal(false, var24));
                    var23++;
                  }
                }
                decompiledFrameRemainder6 = false;
              }
              else {
                var20_ref_int__ = new int[5];
                var21 = 0;
                while (true) {
                  if (var21 < var20_ref_int__.length) {
                    var20_ref_int__[var21] = -1;
                    var21++;
                    continue;
                  }
                  break;
                }
                var17 = this.buildCampaignLoadout(param13, (byte) 54, var20_ref_int__, var19_ref_int__);
                this.field_Y = var19_ref_int__;
              }
              var15_array[var18_int] = var20_ref_int__;
              var18_int++;
            }
            if (decompiledFrameCompleted3) {
              decompiledFrameRemainder3 = (var26 != 0);
            }
          }
          if ((decompiledFrameRemainder3) &&
            (decompiledFrameCompleted3) &&
            (!this.field_lb)) {
            var16 = new int[param2.length][7];
            var18_intLifetime1 = 0;
            while (var18_intLifetime1 < var16.length) {
              var16[var18_intLifetime1] = this.field_Y;
              var18_intLifetime1++;
              if (var26 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameCompleted2)) {
            DropdownArrowPainter.a(false);
          }
          if (decompiledFrameCompleted3) {
            stackIn_66_0 = this;
            stackIn_66_1 = null;
            stackIn_66_2 = null;
            stackIn_66_3 = param1;
            stackIn_66_4 = (String[]) (param2);
            stackIn_66_5 = -1;
            stackIn_66_6 = var16;
            if (this.field_lb) {
              stackIn_67_1 = null;
              stackIn_67_2 = null;
              stackIn_67_7 = this.controlledPlayerId;
            } else {
              stackIn_67_1 = null;
              stackIn_67_2 = null;
              stackIn_67_7 = -1;
            }
            stackIn_69_0 = this;
            if (this.field_lb) {
              stackIn_67_1Lifetime1 = null;
              stackIn_67_2Lifetime1 = null;
              stackIn_70_8 = false;
            } else {
              stackIn_67_1Lifetime1 = null;
              stackIn_67_2Lifetime1 = null;
              stackIn_70_8 = true;
            }
            stackIn_72_0 = this;
            stackIn_72_9 = false;
            stackIn_72_10 = param6;
            stackIn_72_11 = param7;
            stackIn_72_12 = param8;
            stackIn_72_13 = param9;
            stackIn_72_14 = var15_array;
            stackIn_72_15 = param10;
            stackIn_72_16 = param11;
            if (this.field_P) {
              stackIn_67_1Lifetime2 = null;
              stackIn_67_2Lifetime2 = null;
              stackIn_73_17 = -1 + (1 << param2.length);
            } else {
              stackIn_67_1Lifetime2 = null;
              stackIn_67_2Lifetime2 = null;
              stackIn_73_17 = 0;
            }
            this.battlefield = new Battlefield(stackIn_66_3, stackIn_66_4, stackIn_66_5, stackIn_66_6, stackIn_67_7, stackIn_70_8, stackIn_72_9, stackIn_72_10, stackIn_72_11, stackIn_72_12, stackIn_72_13, stackIn_72_14, stackIn_72_15, stackIn_72_16, stackIn_73_17, param13);
            this.battlefield.campaignManaMultiplier = var17;
            if (!this.field_lb) {
              this.movementPlanner = new MovementPlanner(this.battlefield);
            }
            this.turnTimerDial = new TurnTimerDial(ce.turnDurationTicks[this.battlefield.turnDurationOption]);
            if (l.activeCampaignMission != null) {
              this.rebuildSummonMenus(true);
              this.field_V = true;
              this.battlefield.applyTurnChange(true, 0, 0);
              this.remainingTurnTicks = ce.turnDurationTicks[this.battlefield.turnDurationOption];
              this.e((byte) 77);
              this.battlefield.field_Cb = true;
              decompiledFrameRemainder5 = (var26 != 0);
            }
            if ((decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4 = (this.field_Y[4] != 0 ||
              this.field_Y[5] != 0 ||
              this.field_Y[6] != 0))) {
              stackIn_90_0 = ~this.controlledPlayerId;
              stackIn_90_1 = -1;
            }
          }
          if ((decompiledFrameRemainder5) &&
            (decompiledFrameRemainder4)) {
            if (stackIn_90_0 > stackIn_90_1) {
              this.battlefield.field_D = 3;
              this.e((byte) 77);
              this.battlefield.field_Cb = true;
              decompiledFrameRemainder5 = (var26 != 0);
            }
            if (decompiledFrameRemainder5) {
              this.field_e = new int[3];
              this.field_dc = new int[3];
              this.field_e[1] = -1;
              this.field_e[0] = -1;
              this.field_e[2] = -1;
              this.field_dc[2] = 0;
              this.battlefield.field_Cb = false;
              this.field_dc[0] = 0;
              this.field_dc[1] = 0;
              decompiledFrameRemainder5 = (var26 != 0);
            }
          }
          if (decompiledFrameRemainder5) {
            this.battlefield.field_D = 3;
            if (0 <= this.controlledPlayerId &&
              this.controlledPlayerId < this.battlefield.chosenGods.length) {
              this.battlefield.chosenGods[this.controlledPlayerId][0] = 0;
              this.battlefield.chosenGods[this.controlledPlayerId][1] = 1;
              this.battlefield.chosenGods[this.controlledPlayerId][2] = 2;
              if (null != param13) {
                this.battlefield.chosenGods[this.controlledPlayerId] = new int[]{this.battlefield.campaignMission.campaign.localGodId};
              }
            }
            this.rebuildSummonMenus(true);
            if (!this.field_lb) {
              this.field_V = true;
              this.battlefield.applyTurnChange(true, 0, 0);
              this.remainingTurnTicks = ce.turnDurationTicks[this.battlefield.turnDurationOption];
              this.e((byte) 77);
            }
            this.battlefield.field_Cb = true;
          }
          this.battleGraphicsAssets = param5;
          this.field_Kb = -1;
          if (this.battlefield.mapTheme == -1) {
            this.field_d = null;
            if (var26 != 0) {
              this.field_d = UnitLossCondition.battlefieldThemes[this.battlefield.mapTheme].musicTrack;
            }
          } else {
            this.field_d = UnitLossCondition.battlefieldThemes[this.battlefield.mapTheme].musicTrack;
          }
          boolean decompiledFrameRemainder2 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          this.aiPlanners = new AiPlanner[this.battlefield.playerCount];
          if (!this.field_lb &&
            !this.field_z) {
            fs.field_b = new float[this.battlefield.tiles.length];
            var18 = new su[this.battlefield.playerCount];
            if (this.battlefield.campaignMission != null) {
              var19 = 0;
              var20 = 0;
              var21Lifetime1 = 0;
              var22Lifetime1 = 0;
              var23Lifetime1 = this.battlefield.campaignMission.playerSlot;
              var24Lifetime1 = 0;
              scanLoop1: while (true) {
                if (var24Lifetime1 < this.battlefield.tiles.length) {
                  stackOut_126_0 = this.battlefield.tiles[var24Lifetime1].hasModifierFlag1(12);
                  stackIn_142_0 = stackOut_126_0 ? 1 : 0;
                  stackIn_127_0 = stackOut_126_0;
                  if (var26 != 0) {
                    break scanLoop1;
                  }
                  if (stackIn_127_0 &&
                    var23Lifetime1 != this.battlefield.tiles[var24Lifetime1].ownerPlayer) {
                    var20 = 1;
                  } else {
                    if (this.battlefield.tiles[var24Lifetime1].hasModifierFlag4((byte) -117)) {
                      var22Lifetime1 = 1;
                    }
                    var24Lifetime1++;
                    continue;
                  }
                }
                stackIn_142_0 = 0;
                break;
              }
              var24Lifetime1Lifetime1 = stackIn_142_0;
              while (true) {
                stackIn_144_0 = this.battlefield.playerCount;
                if (stackIn_144_0 > var24Lifetime1Lifetime1) {
                  stackIn_162_0 = ~var24Lifetime1Lifetime1;
                  stackIn_162_1 = ~var23Lifetime1;
                  if (var26 == 0) {
                    if (stackIn_162_0 != stackIn_162_1) {
                      var25 = this.battlefield.campaignMission.campaign.participants[this.battlefield.campaignMission.participantIds[var24Lifetime1Lifetime1]];
                      this.aiPlanners[var24Lifetime1Lifetime1] = new AiPlanner(this.battlefield, var24Lifetime1Lifetime1, false, var25.unitOverrides);
                    }
                    var25_ref = (Unit) (this.battlefield.unitsByPlayer[var24Lifetime1Lifetime1].first((byte) 115));
                    while (var25_ref != null) {
                      stackOut_153_0 = var25_ref.hasMovementFlag1(false);
                      stackIn_144_0 = stackOut_153_0 ? 1 : 0;
                      stackIn_154_0 = stackOut_153_0;
                      if (stackIn_154_0) {
                        if (this.battlefield.arePlayersAllied(var24Lifetime1Lifetime1, -16985, var23Lifetime1)) {
                          var21Lifetime1 = 1;
                        } else {
                          var19 = 1;
                        }
                      }
                      var25_ref = (Unit) (this.battlefield.unitsByPlayer[var24Lifetime1Lifetime1].next((byte) 123));
                    }
                    var24Lifetime1Lifetime1++;
                    continue;
                  }
                } else {
                  this.field_r = this.battlefield.field_eb;
                  stackIn_162_0 = ~this.battlefield.campaignMission.campaign.campaignIndex;
                  stackIn_162_1 = -1;
                }
                if (stackIn_162_0 == stackIn_162_1 &&
                  2 == this.battlefield.campaignMission.missionId) {
                  this.battlefield.field_eb = false;
                }
                boolean decompiledFrameRemainder0 = true;
                if (var19 == 0 ||
                  var20 == 0) {
                  if (var19 == 0) {
                    if (var20 == 0) {
                      if (var22Lifetime1 != 0 &&
                        var21Lifetime1 != 0) {
                        this.battleTutorial = new BattleTutorial(this, 5);
                      }
                      if (var22Lifetime1 == 0 ||
                        var21Lifetime1 == 0 || var26 != 0) {
                        if (!this.battlefield.field_eb) {
                          this.battleTutorial = new BattleTutorial(this, 0);
                          decompiledFrameRemainder0 = (var26 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          this.battleTutorial = new BattleTutorial(this, 1);
                          if (var26 != 0) {
                            this.battleTutorial = new BattleTutorial(this, 3);
                            this.battleTutorial = new BattleTutorial(this, 2);
                            this.battleTutorial = new BattleTutorial(this, 4);
                          }
                        }
                      }} else {
                      this.battleTutorial = new BattleTutorial(this, 3);
                      if (var26 != 0) {
                        this.battleTutorial = new BattleTutorial(this, 2);
                        this.battleTutorial = new BattleTutorial(this, 4);
                      }
                    }
                  } else {
                    this.battleTutorial = new BattleTutorial(this, 2);
                    if (var26 != 0) {
                      this.battleTutorial = new BattleTutorial(this, 4);
                    }
                  }
                } else {
                  this.battleTutorial = new BattleTutorial(this, 4);
                }
                if (l.activeCampaignMission.musicId != -1) {
                  this.field_d = fh.field_b[l.activeCampaignMission.musicId];
                }
                if (var26 == 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                break;
              }
            }
            if (decompiledFrameCompleted1) {
              var19Lifetime1 = 0;
              if (ByteStorage.field_g < this.battlefield.playerCount) {
                var19Lifetime1 = AttackEvent.nextBoundedInt(false, 1 - ByteStorage.field_g + this.battlefield.playerCount, li.field_n);
              }
              var20Lifetime1 = 0;
              while (this.aiPlanners.length > var20Lifetime1) {
                stackIn_234_0 = ~var20Lifetime1;
                stackIn_234_1 = ~var19Lifetime1;
                if (var26 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_234_0 <= stackIn_234_1 &&
                  (var19Lifetime1 + ByteStorage.field_g) > var20Lifetime1) {
                  var21Lifetime1Lifetime1 = -var19Lifetime1 + var20Lifetime1;
                  if (var18[var21Lifetime1Lifetime1] == null) {
                    this.aiPlanners[var20Lifetime1] = new AiPlanner(this.battlefield, var20Lifetime1, false, (CampaignUnitOverride[]) null);
                  } else {
                    this.aiPlanners[var20Lifetime1] = var18[var21Lifetime1Lifetime1].a((byte) 51, this.battlefield, (CampaignUnitOverride[]) null, var20Lifetime1, false);
                  }
                }
                var20Lifetime1++;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            if (this.battlefield.campaignMission == null) {
              stackIn_231_1 = 100;
            } else {
              stackIn_231_1 = 17;
            }
            this.field_Fb = stackIn_231_1;
            decompiledFrameRemainder1 = (this.battlefield.campaignMission == null);
            if (decompiledFrameRemainder1) {
              stackIn_234_0 = ~this.controlledPlayerId;
              stackIn_234_1 = -1;
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder2 = !(stackIn_234_0 > stackIn_234_1))) {
            this.unitCycler = new UnitCycler(this.battlefield.unitsByPlayer[this.controlledPlayerId]);
            decompiledFrameRemainder2 = (var26 != 0);
          }
          if (decompiledFrameRemainder2) {
            this.unitCycler = new UnitCycler(this.battlefield.unitsByPlayer[this.battlefield.campaignMission.playerSlot]);
            this.rebuildOverviewTargets(0);
          }
          oa.a(-63, this.field_d);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_244_0 = var15_ref;
          stackIn_244_1 = new StringBuilder().append("ic.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_245_2 = "null";
          } else {
            stackIn_245_2 = "{...}";
          }
          stackIn_248_1 = ((StringBuilder) (Object) stackIn_244_1).append(stackIn_245_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_249_2 = "null";
          } else {
            stackIn_249_2 = "{...}";
          }
          stackIn_252_1 = ((StringBuilder) (Object) stackIn_248_1).append(stackIn_249_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_253_2 = "null";
          } else {
            stackIn_253_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_244_0), ((StringBuilder) (Object) stackIn_252_1).append(stackIn_253_2).append(')').toString());
        }
    }

    static {
        field_A = "Asking to join <%0>'s game...";
    }

    private static int $cfr$fcmpl(float left, float right) {
        return left > right ? 1 : (left == right ? 0 : -1);
    }
}
