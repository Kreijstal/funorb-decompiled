/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class Battlefield {
    int mapHeight;
    int turnLimit;
    private int[] field_M;
    int[] field_zb;
    int field_ib;
    static String field_nb;
    int[][] field_a;
    private int field_Db;
    boolean field_X;
    private int field_ab;
    boolean field_kb;
    private int[] playerTeamIndices;
    boolean field_eb;
    float campaignManaMultiplier;
    int winnerCount;
    int[] field_h;
    int field_D;
    int currentPlayer;
    CampaignMission campaignMission;
    int field_Q;
    int[] remainingRuneCap;
    CoatOfArms[] playerCoats;
    private boolean field_Fb;
    static String field_q;
    NodeDeque pendingEvents;
    TeamRoster[] teams;
    private int field_A;
    boolean field_L;
    int[] playerMana;
    int collectedManaTarget;
    int[] teamManaCollected;
    int eliminatedPlayerMask;
    private int[] field_Y;
    int turnNumber;
    boolean field_qb;
    boolean field_Cb;
    private int[] field_N;
    MapTile[] tiles;
    NodeDeque unitObservers;
    PacketBuffer snapshotBuffer;
    int[] field_S;
    boolean field_Ab;
    int mapSizeSetting;
    int mapTheme;
    int playerCount;
    int teamCount;
    NodeDeque[] unitsByPlayer;
    private int[] field_d;
    int field_C;
    int localPlayer;
    private int[] eliminationOrder;
    int field_i;
    boolean field_o;
    int[] field_ub;
    boolean field_J;
    int inactivePlayerMask;
    boolean field_x;
    private int[] field_g;
    private int[] field_U;
    int[] field_rb;
    boolean field_b;
    int[] field_G;
    int[] rankedParticipants;
    String[] playerNames;
    boolean field_V;
    int mapWidth;
    boolean teamGame;
    int[][] teamStructureCounts;
    int[][] field_B;
    boolean kingBlackDragonSummoned;
    boolean field_f;
    ul field_j;
    private int field_I;
    int[][] chosenGods;
    private MatchConditionRegistry matchConditions;
    private int field_vb;
    int[][] godFavourLevels;
    int randomSeed;
    int[] field_s;
    int[] field_ob;
    private int[] field_y;
    static String field_pb;
    boolean field_r;
    int[] playerTurnCounts;
    boolean field_F;

    final TeamRoster getPlayerTeam(int playerId, int obfuscationGuard) {
        if (~playerId > obfuscationGuard) {
          return null;
        }
        if (playerId > this.playerTeamIndices.length) {
          return null;
        }
        return this.teams[this.playerTeamIndices[playerId]];
    }

    final void registerUnit(int obfuscationGuard, Unit unit) {
        RuntimeException runtimeException = null;
        IntrusiveNode var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.unitsByPlayer.length <= unit.ownerPlayer) {
            return;
          }
          this.unitsByPlayer[unit.ownerPlayer].addLast((byte) -119, (IntrusiveNode) (unit));
          if (obfuscationGuard != 8288) {
            this.l(-73, -26);
          }
          var3 = this.unitObservers.first((byte) 96);
          while (var3 != null) {
            if (var4 != 0) {
              return;
            }
            if (var3 instanceof UnitObserver) {
              ((UnitObserver) ((Object) var3)).onUnitRegistered(unit, (byte) -2);
            }
            var3 = this.unitObservers.next((byte) 123);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ha.A(").append(obfuscationGuard).append(',');
          if (unit == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void refreshUnitTileEffects(Unit unit, int obfuscationGuard) {
        int var3_int = 0;
        try {
          if (obfuscationGuard >= -87) {
            this.mapSizeSetting = -63;
          }
          if (unit != null) {
            var3_int = this.getTileEffects(31, unit.tileY, unit.tileX, unit.ownerPlayer);
            unit.hasTileEffect16 = (16 & var3_int) != 0 ? true : false;
            unit.hasTileEffect4 = (4 & var3_int) != 0 ? true : false;
            unit.hasTileEffect8 = (var3_int & 8) != 0 ? true : false;
          }
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ha.DA(" + (unit != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3, Unit param4, boolean param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -16) {
            this.teams = (TeamRoster[]) null;
          }
          stackIn_3_0 = SpellCastEvent.a(this.mapWidth, this.tiles, param5, param2, param3, this.mapHeight, this.getPlayerTeamIndex(param3, param1 ^ 15), param4, param0, false, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ha.VD(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(')').toString());
        }
    }

    final static int a(int param0, byte[] param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length >= 6) {
            var3_int = param0 * 12 + 6;
            stackIn_8_0 = ((128 & param1[var3_int]) == 0) ? 0 : 1;
            var5 = stackIn_8_0;
            if (var5 != 0) {
              var3_int++;
              var3_int++;
              var4 = param1[var3_int] & 255;
            }
            if (var5 == 0 ||
              ArmiesOfGielinor.obfuscationControl) {
              var3_int++;
              var4 = 255 & param1[var3_int];
            }
            if (param2) {
              field_nb = (String) null;
            }
            stackIn_14_0 = var4 / param0 + 1;
            return stackIn_14_0;
          }
          stackIn_4_0 = 0;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("ha.GC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final void setTerrainType(byte obfuscationGuard, int terrainType, int tileX, int tileY) {
        this.tiles[tileX + tileY * this.mapWidth].terrainType = terrainType;
        this.tiles[tileY * this.mapWidth + tileX].field_b = true;
        int var5 = 96 % ((59 - obfuscationGuard) / 34);
    }

    final NodeDeque prepareTurnConsequences(boolean skipUnitProcessing, boolean collectMarkers, int obfuscationGuard) {
        boolean stackIn_36_0 = false;
        boolean stackIn_60_0 = false;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        Object var4 = null;
        Unit var5_ref_jd = null;
        int var5 = 0;
        int var6_int = 0;
        Unit var6 = null;
        MapTile var7 = null;
        int var8 = 0;
        Unit var5_ref_jdLifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var4 = null;
        if (this.field_b) {
          var4 = new NodeDeque();
        }
        this.g((byte) -15);
        if (skipUnitProcessing) {
          return (NodeDeque) (var4);
        }
        var5_ref_jd = (Unit) (this.unitsByPlayer[this.currentPlayer].first((byte) 116));
        if (obfuscationGuard != 0) {
          this.field_o = false;
        }
        scanLoop1: while (true) {
          boolean decompiledFrameCompleted0 = true;
          if (var5_ref_jd != null) {
            stackIn_36_0 = var5_ref_jd.canCaptureStructures(-21428);
            if (var8 == 0) {
              if (stackIn_36_0 &&
                !var5_ref_jd.isDisplacedFromTile(obfuscationGuard + 26440)) {
                var6_int = var5_ref_jd.tileX + var5_ref_jd.tileY * this.mapWidth;
                if (var5_ref_jd.tileX >= 0 &&
                  this.tiles.length > var5_ref_jd.tileX &&
                  var5_ref_jd.tileY >= 0 &&
                  var5_ref_jd.tileY < this.tiles.length) {
                  var7 = this.tiles[var6_int];
                  if (var7.isStructure(false) && (!(var7.ownerPlayer >= 0) ||
                    !this.arePlayersAllied(var7.ownerPlayer, -16985, this.currentPlayer))) {
                    var7.captureStrength = var7.captureStrength - var5_ref_jd.getEffectiveStrength((byte) 122);
                    if (var7.captureStrength <= 0 &&
                      this.field_b) {
                      if (!collectMarkers) {
                        this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new StateChangeEvent(0, var5_ref_jd.tileX, var5_ref_jd.tileY, var5_ref_jd.ownerPlayer)));
                      } else {
                        ((NodeDeque) (var4)).addLast((byte) -119, (IntrusiveNode) (new StateChangeMarker(var5_ref_jd.tileX, var5_ref_jd.tileY, 0, this.currentPlayer)));
                      }
                    }
                  }
                }
              }
              var5_ref_jd = (Unit) (this.unitsByPlayer[this.currentPlayer].next((byte) 123));
              continue;
            }
          } else {
            var5_ref_jd = (Unit) (this.unitsByPlayer[this.currentPlayer].first((byte) 102));
            while (var5_ref_jd != null) {
              var5_ref_jd.n((byte) -42);
              var5_ref_jd = (Unit) (this.unitsByPlayer[this.currentPlayer].next((byte) 123));
              if (var8 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_36_0 = collectMarkers;
            }
          }
          if ((decompiledFrameCompleted0) &&
            (!stackIn_36_0)) {
            break scanLoop1;
          }
          this.applyPendingEvents((byte) 108);
          break;
        }
        var5_ref_jdLifetime1 = (Unit) (this.unitsByPlayer[this.currentPlayer].d((byte) -81));
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var5_ref_jdLifetime1 == null))) {
          stackIn_60_0 = var5_ref_jdLifetime1.removedFromActivePlay;
          if (var8 == 0) {
            if (!stackIn_60_0) {
              if (collectMarkers) {
                if (var5_ref_jdLifetime1.isDisplacedFromTile(26440)) {
                  ((NodeDeque) (var4)).addLast((byte) -119, (IntrusiveNode) (new DisplacedUnitMarker(var5_ref_jdLifetime1.tileX, var5_ref_jdLifetime1.tileY, var5_ref_jdLifetime1, this.tiles[var5_ref_jdLifetime1.tileY * this.mapWidth + var5_ref_jdLifetime1.tileX])));
                }
                if (var5_ref_jdLifetime1.isJadeVine((byte) 79) &&
                  this.playerMana[var5_ref_jdLifetime1.ownerPlayer] < 10) {
                  ((NodeDeque) (var4)).addLast((byte) -119, (IntrusiveNode) (new DeployAction(var5_ref_jdLifetime1.ownerPlayer, var5_ref_jdLifetime1, 0)));
                }
                if (var5_ref_jdLifetime1.unitType == 10 &&
                  this.tiles[var5_ref_jdLifetime1.tileX + var5_ref_jdLifetime1.tileY * this.mapWidth].hasCorpse(93) &&
                  var5_ref_jdLifetime1.maximumStrength == 19) {
                  ((NodeDeque) (var4)).addLast((byte) -119, (IntrusiveNode) (new CorpseConditionMarker(var5_ref_jdLifetime1.ownerPlayer, this.playerCount)));
                }
              }
              var5_ref_jdLifetime1.queueTurnConsequences(-1);
              if (collectMarkers) {
                this.applyPendingEvents((byte) 108);
                this.d(this.currentPlayer, this.unitsByPlayer[this.currentPlayer].b(false), 91, 13);
                this.d(this.currentPlayer, this.field_ob[this.currentPlayer], obfuscationGuard ^ 82, 12);
              }
            }
            var5_ref_jdLifetime1 = (Unit) (this.unitsByPlayer[this.currentPlayer].b((byte) 100));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_60_0 = collectMarkers;
        }
        if (stackIn_60_0) {
          var5 = 0;
          var6 = (Unit) (this.unitsByPlayer[this.currentPlayer].first((byte) 102));
          while (true) {
            if (var6 != null) {
              stackIn_69_0 = ~var6.unitType;
              stackIn_69_1 = -21;
              if (var8 == 0) {
                if (stackIn_69_0 == stackIn_69_1) {
                  var5++;
                }
                var6 = (Unit) (this.unitsByPlayer[this.currentPlayer].next((byte) 123));
                continue;
              }
            } else {
              stackIn_69_0 = ~var5;
              stackIn_69_1 = -26;
            }
            if (stackIn_69_0 > stackIn_69_1) {
              break;
            }
            ((NodeDeque) (var4)).addLast((byte) -119, (IntrusiveNode) (new SkeletonLimitMarker(this.currentPlayer, this.playerCount)));
            break;
          }
        }
        return (NodeDeque) (var4);
    }

    final void eliminatePlayer(int obfuscationGuard, int playerId, boolean removeUnits) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        Object stackIn_38_0 = null;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        Object stackIn_65_0 = null;
        int statePc = 0;
        int orderIndex = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Unit var8 = null;
        int var9 = 0;
        int[] receivingPlayers = null;
        Unit unitToRemove = null;
        Unit campaignUnit = null;
        scanLoop1: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
                    this.eliminatedPlayerMask = this.eliminatedPlayerMask | 1 << playerId;
                    orderIndex = 0;
                    statePc = 1;
                    continue scanLoop1;
                }
                case 1: {
                    if (orderIndex >= this.playerCount) {
                        statePc = 60;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 2. */
                        {
                            stackIn_61_0 = this.eliminationOrder[orderIndex];
                            stackIn_3_0 = stackIn_61_0;
                            stackIn_61_1 = playerId;
                            stackIn_3_1 = stackIn_61_1;
                            if (var9 != 0) {
                                statePc = 61;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 3. */
                                {
                                    if (stackIn_3_0 != stackIn_3_1) {
                                        statePc = 6;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 4. */
                                        {
                                            if (var9 == 0) {
                                                statePc = 60;
                                            } else {
                                                statePc = 6;
                                            }
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 6: {
                    if (this.eliminationOrder[orderIndex] < 0) {
                        /* Inlined CFG state: 8. */
                        {
                            this.eliminationOrder[orderIndex] = playerId;
                            if (!this.teamGame) {
                                statePc = 44;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 9. */
                                {
                                    var5 = 0;
                                    var6 = 0;
                                    statePc = 10;
                                    continue scanLoop1;
                                }
                            }
                        }
                    } else {
                        statePc = 58;
                        continue scanLoop1;
                    }
                }
                case 10: {
                    if (~var6 <= ~this.playerCount) {
                        statePc = 17;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 11. */
                        {
                            stackIn_18_0 = ~playerId;
                            stackIn_12_0 = stackIn_18_0;
                            stackIn_18_1 = ~var6;
                            stackIn_12_1 = stackIn_18_1;
                            if (var9 != 0) {
                                statePc = 18;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 12. */
                                {
                                    if (stackIn_12_0 == stackIn_12_1) {
                                        statePc = 16;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 13. */
                                        {
                                            if (!this.arePlayersAllied(var6, -16985, playerId)) {
                                                statePc = 16;
                                                continue scanLoop1;
                                            } else {
                                                /* Inlined CFG state: 14. */
                                                {
                                                    if (0 != (this.eliminatedPlayerMask & 1 << var6)) {
                                                        statePc = 16;
                                                    } else {
                                                        statePc = 15;
                                                    }
                                                    continue scanLoop1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 15: {
                    var5++;
                    statePc = 16;
                    continue scanLoop1;
                }
                case 16: {
                    var6++;
                    if (var9 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 17;
                    }
                    continue scanLoop1;
                }
                case 17: {
                    stackIn_18_0 = ~var5;
                    stackIn_18_1 = -1;
                    statePc = 18;
                    continue scanLoop1;
                }
                case 18: {
                    if (stackIn_18_0 >= stackIn_18_1) {
                        statePc = 21;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 19. */
                        {
                            if (!removeUnits) {
                                /* Inlined CFG state: 26. */
                                {
                                    receivingPlayers = new int[var5];
                                    var5 = 0;
                                    var7 = 0;
                                    statePc = 27;
                                    continue scanLoop1;
                                }
                            } else {
                                statePc = 21;
                                continue scanLoop1;
                            }
                        }
                    }
                }
                case 21: {
                    unitToRemove = (Unit) (this.unitsByPlayer[playerId].first((byte) 87));
                    statePc = 22;
                    continue scanLoop1;
                }
                case 22: {
                    if (unitToRemove == null) {
                        statePc = 43;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 23. */
                        {
                            this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new DeathEvent(unitToRemove, true)));
                            unitToRemove = (Unit) (this.unitsByPlayer[playerId].next((byte) 123));
                            if (var9 != 0) {
                                statePc = 43;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 24. */
                                {
                                    if (var9 == 0) {
                                        statePc = 22;
                                    } else {
                                        statePc = 43;
                                    }
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 27: {
                    if (~this.playerCount >= ~var7) {
                        statePc = 34;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 28. */
                        {
                            stackIn_36_0 = ~var7;
                            stackIn_29_0 = stackIn_36_0;
                            stackIn_36_1 = ~playerId;
                            stackIn_29_1 = stackIn_36_1;
                            if (var9 != 0) {
                                statePc = 36;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 29. */
                                {
                                    if (stackIn_29_0 == stackIn_29_1) {
                                        statePc = 33;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 30. */
                                        {
                                            if (!this.arePlayersAllied(var7, obfuscationGuard - 26986, playerId)) {
                                                statePc = 33;
                                                continue scanLoop1;
                                            } else {
                                                /* Inlined CFG state: 31. */
                                                {
                                                    if ((1 << var7 & this.eliminatedPlayerMask) != 0) {
                                                        statePc = 33;
                                                    } else {
                                                        statePc = 32;
                                                    }
                                                    continue scanLoop1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 32: {
                    receivingPlayers[var5] = var7;
                    var5++;
                    statePc = 33;
                    continue scanLoop1;
                }
                case 33: {
                    var7++;
                    if (var9 == 0) {
                        statePc = 27;
                    } else {
                        statePc = 34;
                    }
                    continue scanLoop1;
                }
                case 34: {
                    var5 = 0;
                    var7 = 0;
                    statePc = 35;
                    continue scanLoop1;
                }
                case 35: {
                    stackIn_36_0 = ~this.tiles.length;
                    stackIn_36_1 = ~var7;
                    statePc = 36;
                    continue scanLoop1;
                }
                case 36: {
                    if (stackIn_36_0 >= stackIn_36_1) {
                        statePc = 43;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 37. */
                        {
                            var8 = this.tiles[var7].occupant;
                            stackIn_65_0 = null;
                            stackIn_38_0 = stackIn_65_0;
                            if (var9 != 0) {
                                statePc = 65;
                            } else {
                                statePc = 38;
                            }
                            continue scanLoop1;
                        }
                    }
                }
                case 38: {
                    if (stackIn_38_0 == var8) {
                        statePc = 42;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 39. */
                        {
                            if (playerId == var8.ownerPlayer) {
                                /* Inlined CFG state: 41. */
                                {
                                    this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new OwnerChangeEvent(var8, receivingPlayers[var5 % receivingPlayers.length], false)));
                                    var5++;
                                    statePc = 42;
                                    continue scanLoop1;
                                }
                            } else {
                                statePc = 42;
                                continue scanLoop1;
                            }
                        }
                    }
                }
                case 42: {
                    var7++;
                    if (var9 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 43;
                    }
                    continue scanLoop1;
                }
                case 43: {
                    if (var9 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 44;
                    }
                    continue scanLoop1;
                }
                case 44: {
                    var5 = 0;
                    statePc = 45;
                    continue scanLoop1;
                }
                case 45: {
                    if (this.mapHeight * this.mapWidth <= var5) {
                        statePc = 51;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 46. */
                        {
                            stackIn_61_0 = playerId;
                            stackIn_47_0 = stackIn_61_0;
                            stackIn_61_1 = this.tiles[var5].ownerPlayer;
                            stackIn_47_1 = stackIn_61_1;
                            if (var9 != 0) {
                                statePc = 61;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 47. */
                                {
                                    if (stackIn_47_0 != stackIn_47_1) {
                                        statePc = 50;
                                        continue scanLoop1;
                                    } else {
                                        /* Inlined CFG state: 48. */
                                        {
                                            this.tiles[var5].ownerPlayer = -1;
                                            if (11 != this.tiles[var5].terrainType) {
                                                statePc = 50;
                                                continue scanLoop1;
                                            } else {
                                                /* Inlined CFG state: 49. */
                                                {
                                                    this.tiles[var5].terrainType = 0;
                                                    statePc = 50;
                                                    continue scanLoop1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                case 50: {
                    var5++;
                    if (var9 == 0) {
                        statePc = 45;
                    } else {
                        statePc = 51;
                    }
                    continue scanLoop1;
                }
                case 51: {
                    if (null == this.campaignMission) {
                        statePc = 60;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 52. */
                        {
                            campaignUnit = (Unit) (this.unitsByPlayer[playerId].first((byte) 87));
                            statePc = 53;
                            continue scanLoop1;
                        }
                    }
                }
                case 53: {
                    if (campaignUnit == null) {
                        statePc = 57;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 54. */
                        {
                            this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new DeathEvent(campaignUnit, true)));
                            campaignUnit = (Unit) (this.unitsByPlayer[playerId].next((byte) 123));
                            if (var9 != 0) {
                                statePc = 60;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 55. */
                                {
                                    if (var9 == 0) {
                                        statePc = 53;
                                    } else {
                                        statePc = 57;
                                    }
                                    continue scanLoop1;
                                }
                            }
                        }
                    }
                }
                case 57: {
                    if (var9 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 58;
                    }
                    continue scanLoop1;
                }
                case 58: {
                    orderIndex++;
                    if (var9 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 60;
                    }
                    continue scanLoop1;
                }
                case 60: {
                    stackIn_61_0 = obfuscationGuard;
                    stackIn_61_1 = 10001;
                    statePc = 61;
                    continue scanLoop1;
                }
                case 61: {
                    if (stackIn_61_0 == stackIn_61_1) {
                        /* Inlined CFG state: 63. */
                        {
                            if (this.hasSingleSurvivor((byte) -42)) {
                                statePc = 68;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 64. */
                                {
                                    stackIn_65_0 = null;
                                    statePc = 65;
                                    continue scanLoop1;
                                }
                            }
                        }
                    } else {
                        /* Inlined CFG state: 62. */
                        {
                            return;
                        }
                    }
                }
                case 65: {
                    if (stackIn_65_0 == this.campaignMission) {
                        statePc = 70;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 66. */
                        {
                            if (~this.campaignMission.playerSlot == ~playerId) {
                                statePc = 68;
                            } else {
                                statePc = 70;
                            }
                            continue scanLoop1;
                        }
                    }
                }
                case 68: {
                    if (!this.field_b) {
                        statePc = 70;
                        continue scanLoop1;
                    } else {
                        /* Inlined CFG state: 69. */
                        {
                            this.field_qb = true;
                            statePc = 70;
                            continue scanLoop1;
                        }
                    }
                }
                case 70: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final NodeDeque b(boolean param0, boolean param1, int param2) {
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        boolean stackIn_49_1 = false;
        NodeDeque stackIn_50_0 = null;
        int var4 = 0;
        int var5_int = 0;
        NodeDeque var5 = null;
        Unit var6 = null;
        int var7 = 0;
        Unit var8 = null;
        Unit var6Lifetime1;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.field_X) {
          throw new IllegalStateException();
        }
        if (param2 != 30156) {
          return (NodeDeque) null;
        }
        var4 = this.currentPlayer;
        var8 = (Unit) (this.unitsByPlayer[this.currentPlayer].first((byte) 94));
        do {
          if (var8 == null) {
            this.playerTurnCounts[this.currentPlayer] = this.playerTurnCounts[this.currentPlayer] + 1;
            break;
          }
          var8.refreshForTurnChange((byte) -36);
          var8 = (Unit) (this.unitsByPlayer[this.currentPlayer].next((byte) 123));
        } while (var7 == 0);
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameCompleted2 = true;
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameCompleted1 = true;
        if (param0) {
          this.a(true);
          this.currentPlayer = (this.currentPlayer + 1) % this.playerCount;
          while (~this.currentPlayer != ~var4) {
            stackIn_42_0 = -1;
            stackIn_42_1 = ~(1 << this.currentPlayer & this.eliminatedPlayerMask);
            if (var7 != 0) {
              decompiledFrameCompleted2 = false;
              break;
            }
            if (stackIn_42_0 == stackIn_42_1) {
              decompiledFrameCompleted1 = false;
              break;
            }
            this.currentPlayer = (this.currentPlayer + 1) % this.playerCount;
          }
          if (decompiledFrameCompleted2) {
            decompiledFrameRemainder0 = !(decompiledFrameCompleted1);
          }
        }
        if ((decompiledFrameRemainder0) &&
          (decompiledFrameCompleted2) &&
          (decompiledFrameCompleted1)) {
          var5_int = this.currentPlayer + 1;
          while (var5_int != this.currentPlayer) {
            stackIn_50_0 = this.unitsByPlayer[(this.currentPlayer + 1) % this.playerCount];
            if (var7 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            var6 = (Unit) (((NodeDeque) (Object) stackIn_50_0).first((byte) 119));
            while (var6 != null) {
              var6.n((byte) -42);
              var6 = (Unit) (this.unitsByPlayer[(1 + this.currentPlayer) % this.playerCount].next((byte) 123));
            }
            var6Lifetime1 = (Unit) (this.unitsByPlayer[(this.currentPlayer + 1) % this.playerCount].first((byte) 95));
            while (var6Lifetime1 != null) {
              var6Lifetime1.refreshForTurnChange((byte) -36);
              var6Lifetime1 = (Unit) (this.unitsByPlayer[(1 + this.currentPlayer) % this.playerCount].next((byte) 123));
            }
            var5_int = (1 + var5_int) % this.playerCount;
          }
        }
        if ((decompiledFrameCompleted2) &&
          (decompiledFrameCompleted0)) {
          this.turnNumber = this.turnNumber + 1;
          this.a(this.currentPlayer, (byte) -102);
          if (param0 && (var4 == this.currentPlayer ||
            this.hasSingleSurvivor((byte) -42))) {
            this.field_qb = true;
            return null;
          }
          decompiledFrameRemainder1 = (param0);
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameRemainder1 = !(!this.i(0)))) {
            stackIn_42_0 = ~var4;
            stackIn_42_1 = ~this.currentPlayer;
          }
        }
        if ((decompiledFrameRemainder1) && (decompiledFrameCompleted0) && (stackIn_42_0 < stackIn_42_1 ||
          this.c((byte) 103))) {
          this.field_qb = true;
          return null;
        }
        if (decompiledFrameCompleted0) {
          stackIn_49_1 = !(var4 >= 0);
          stackIn_50_0 = this.prepareTurnConsequences(stackIn_49_1, param1, param2 - 30156);
        }
        var5 = stackIn_50_0;
        return var5;
    }

    private final void a(int param0, byte param1) {
        int var3;
        var3 = 124 % ((37 - param1) / 34);
        if ((this.localPlayer < 0 ||
          ~this.localPlayer != ~param0) && this.localPlayer >= 0) {
          this.field_Fb = false;
          if (ArmiesOfGielinor.obfuscationControl) {
            this.field_Fb = true;
          }
        } else {
          this.field_Fb = true;
        }
        if (0 < this.turnNumber) {
        }
    }

    final Unit getUnitAt(int tileY, boolean obfuscationGuard, int tileX) {
        boolean discarded$0 = false;
        if (tileX < 0) {
          return null;
        }
        if (tileY < 0) {
          return null;
        }
        if (tileX >= this.mapWidth) {
          return null;
        }
        if (this.mapHeight <= tileY) {
          return null;
        }
        MapTile var4 = this.tiles[tileX + tileY * this.mapWidth];
        if (!obfuscationGuard) {
          discarded$0 = this.a((int[]) null, -58, 5, -34);
        }
        return var4.occupant;
    }

    private final boolean a(int[] param0, int param1, int param2, int param3) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          var5_int = param0[param3];
          if (param2 != -24107) {
            this.godFavourLevels = (int[][]) null;
          }
          var6 = param0[param1];
          if (var6 < var5_int) {
            return true;
          }
          if (~var6 == ~var5_int) {
            var7 = this.i(param3, -12710);
            var8 = this.i(param1, param2 + 11397);
            if (var8 >= var7) {
              if (~var8 != ~var7) {
                return false;
              }
              var9 = this.b((byte) 31, param3);
              var10 = this.b((byte) 31, param1);
              if (var10 < var9) {
                return true;
              }
              if (~var9 == ~var10) {
                var11 = this.playerMana[param3];
                var12 = this.playerMana[param1];
                if (var11 > var12) {
                  return true;
                }
                if (var11 == var12 &&
                  param1 > param3) {
                  return true;
                }
              }
            }
            if (!(var8 >= var7) ||
              ArmiesOfGielinor.obfuscationControl) {
              return true;
            }}
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("ha.BD(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Unit var11 = null;
        int var12 = 0;
        Unit var13_ref_jd = null;
        int var13 = 0;
        MapTile var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var12Lifetime1;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param2 == 74) {
          this.kingBlackDragonSummoned = true;
          if (this.field_b &&
            this.field_N[9] < 0) {
            this.field_N[9] = param5;
          }
        }
        var8 = 0;
        var9 = bw.unitDefinitions[param2][4] + param6;
        if (this.getUnitAt(param3, true, param1) != null) {
          this.getUnitAt(param3, true, param1).unlink(param4 ^ 91);
        }
        var10 = param4;
        if (param2 == 74) {
          var10 = 2;
        }
        var11 = new Unit(param1, param3, param2, param5, var9, var9, var10, 0, 0, this, 0, 0, -1, false, 0);
        this.registerUnit(8288, var11);
        if (var11.getUnitCategory(0) != 4) {
        }
        if (re.a(0, (byte) -98) &&
          this.field_b) {
          if (param2 != 19 &&
            param2 != 21 &&
            param2 != 20 &&
            0 != param2) {
            this.field_Db = this.field_Db | 1 << param5;
          }
          if ((param2 == 19 ||
            param2 == 21 ||
            param2 == 20 ||
            0 == param2 || var16 != 0) && ((1 << param5 & this.field_Db) == 0 &&
            0 == (1 << param5 & this.field_I))) {
            var12 = 0;
            if (param2 == 19) {
              var12 = var12 | 1;
            }
            if (param2 != 19 ||
              var16 != 0) {
              if (param2 != 21) {
                if (20 == param2) {
                  var12 = var12 | 4;
                  if (var16 != 0) {
                    var12 = var12 | 2;
                  }
                }
              } else {
                var12 = var12 | 2;
              }
            }
            var13_ref_jd = (Unit) (this.unitsByPlayer[param5].first((byte) 89));
            while (true) {
              if (var13_ref_jd != null) {
                stackIn_40_0 = 19;
                stackIn_40_1 = var13_ref_jd.unitType;
                if (var16 == 0) {
                  if (stackIn_40_0 != stackIn_40_1) {
                    if (var13_ref_jd.unitType != 21) {
                      if (var13_ref_jd.unitType == 20) {
                        var12 = var12 | 4;
                      }
                    } else {
                      var12 = var12 | 2;
                    }
                  } else {
                    var12 = var12 | 1;
                  }
                  var13_ref_jd = (Unit) (this.unitsByPlayer[param5].next((byte) 123));
                  continue;
                }
              } else {
                stackIn_40_0 = -8;
                stackIn_40_1 = ~var12;
              }
              if (stackIn_40_0 != stackIn_40_1) {
                break;
              }
              this.field_I = this.field_I | 1 << param5;
              break;
            }
          }}
        if (param2 == 58) {
          var8 = ps.field_C[1];
        }
        if (param2 == 63) {
          var8 = ps.field_C[0];
        }
        if (param2 == 59 ||
          param2 == 53 ||
          param2 == 43) {
          var8 = 1;
        }
        if (var8 > 0) {
          this.a(param3, param1, 0, 3);
        }
        if (param0) {
          return;
        }
        this.playerMana[param5] = this.playerMana[param5] - bw.unitDefinitions[param2][8];
        if (this.field_b) {
          this.field_ub[param5] = this.field_ub[param5] + bw.unitDefinitions[param2][8];
          this.d(param5, this.field_ub[param5], 106, 10);
        }
        boolean decompiledFrameRemainder0 = true;
        var12Lifetime1 = bw.unitDefinitions[param2][2];
        var13 = bw.unitDefinitions[param2][1];
        var14 = this.tiles[this.mapWidth * param3 + param1];
        if ((var13 == -1) &&
          (decompiledFrameRemainder0 = (var12Lifetime1 == this.godFavourLevels[param5][6])) &&
          (decompiledFrameRemainder0 = !(this.godFavourLevels[param5][6] >= 5))) {
          this.b(6, param5, 1, (byte) 92);
        }
        if ((decompiledFrameRemainder0) &&
          (var13 != -1 ||
          var16 != 0)) {
          boolean decompiledFrameCompleted0 = true;
          this.field_U[param5] = oe.c(this.field_U[param5], 1 << var13);
          if (7 == var14.terrainType &&
            var12Lifetime1 == this.godFavourLevels[param5][var13]) {
            var15 = 0;
            while (6 > var15) {
              stackIn_76_0 = ~var15;
              stackIn_76_1 = ~var13;
              if (var16 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_76_0 == stackIn_76_1 &&
                5 > this.godFavourLevels[param5][var15]) {
                this.b(var15, param5, 1, (byte) 92);
              }
              var15++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_76_0 = 11;
            stackIn_76_1 = var14.terrainType;
          }
          if (stackIn_76_0 == stackIn_76_1 &&
            ~var13 == ~var14.godId &&
            ~var12Lifetime1 == ~var14.godFavourLevel &&
            var14.godFavourLevel < 5) {
            var14.godFavourLevel = var14.godFavourLevel + 1;
          }
        }
        if (this.field_b) {
          this.field_Y[param5] = this.field_Y[param5] + 1;
          this.d(param5, this.unitsByPlayer[param5].b(false), param4 ^ 104, 13);
          this.d(param5, this.field_Y[param5], 119, 5);
        }
    }

    private final boolean i(int param0) {
        int var2;
        int var3;
        int stackIn_14_0 = 0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!this.field_V) {
          return false;
        }
        var2 = param0;
        while (var2 < this.teamCount) {
          stackIn_14_0 = var2;
          if (var3 != 0) {
            return stackIn_14_0 != 0;
          }
          if (stackIn_14_0 < 0) {
            return false;
          }
          if (var2 >= this.teamManaCollected.length) {
            return false;
          }
          if (this.i(var2, param0 - 12710) >= this.collectedManaTarget) {
            return true;
          }
          var2++;
        }
        return this.c((byte) 51);
    }

    private final int f(byte param0) {
        int var2;
        int var3;
        int var4;
        if (this.field_s != null &&
          this.field_s.length == 3) {
          if (param0 > -65) {
            return 72;
          }
          var2 = 2 * this.turnLimit / 3;
          var3 = 50 * this.field_s[0] * var2;
          var3 = var3 + 75 * var2 * this.field_s[1];
          var3 = var3 + this.field_s[2] * var2 * 25;
          if (this.turnLimit <= 1) {
            return 0;
          }
          var4 = var3 / this.teamCount;
          var4 = var4 / 500 * 500 + 500;
          return var4;
        }
        return 0;
    }

    final boolean a(int param0, int param1, int param2, Unit param3) {
        MapTile var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= 0 &&
            param0 >= 0 &&
            param2 < this.mapWidth) {
            if (this.mapHeight < param0) {
              return false;
            }
            if (param1 != -26633) {
              this.field_N = (int[]) null;
            }
            var5 = this.tiles[param2 + this.mapWidth * param0];
            if (null == var5.occupant) {
              return false;
            }
            if (!this.arePlayersAllied(var5.occupant.ownerPlayer, -16985, param3.ownerPlayer)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_20_0 = var5_ref;
          stackIn_20_1 = new StringBuilder().append("ha.JD(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void a(int param0, MapTile param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null != param1.occupant &&
            param1.hasCorpse(-32)) {
            param1.clearCorpse(param0 + 114);
            if (param1.occupant.maximumStrength < 99) {
              this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TurnEffectEvent(param1.occupant, 4)));
            }
          }
          if (param0 != -100) {
            this.unitsByPlayer = (NodeDeque[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ha.AE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = 0;
        do {
          if (var2 >= this.field_S.length) {
            var2 = -74 % ((39 - param0) / 49);
            break;
          }
          this.field_S[var2] = this.teamManaCollected[var2];
          var2++;
        } while (var5 == 0);
        if (this.currentPlayer >= 0) {
          var3 = 0;
          while (true) {
            if (var3 >= this.mapWidth) {
              return;
            }
            if (var5 != 0) {
              return;
            }
            var4 = 0;
            while (var4 < this.mapHeight) {
              this.tiles[var3 + this.mapWidth * var4].a(var4, var3, this.currentPlayer, 0);
              var4++;
            }
            var3++;
          }
        }
        return;
    }

    final static int b(int param0, int param1, int param2) {
        if (param2 != -4) {
          field_q = (String) null;
        }
        int var3 = param0;
        if (nv.c(0, param1) &&
          param0 == 3) {
          var3 = 3;
        }
        return var3;
    }

    final void b(int param0, boolean param1, int param2, int param3, int param4) {
        MapTile stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        MapTile var6;
        int var7;
        int var8;
        MapTile var9;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param4 < 0) {
          return;
        }
        if (param4 < this.mapHeight &&
          param0 >= 0 &&
          this.mapWidth > param0) {
          var9 = this.tiles[param0 + this.mapWidth * param4];
          var6 = var9;
          stackIn_8_0 = var6;
          stackIn_9_1 = (!param1) ? false : true;
          regionExit1: {
            regionExit2: {
              regionExit3: {
                regionExit4: {
                  boolean decompiledFrameRemainder1 = true;
                  boolean decompiledFrameRemainder0 = true;
                  stackIn_8_0.field_b = stackIn_9_1;
                  var7 = param2;
                  if (((14 != var7 ||
                    var8 != 0) && (var7 != 9 ||
                    var8 != 0)) &&
                    (decompiledFrameRemainder0 = (var7 != 4)) &&
                    (decompiledFrameRemainder1 = (3 != var7 ||
                    var8 != 0))) {
                    switch (var7) {
                      case 5:
                        break regionExit4;
                      case 0:
                        break regionExit3;
                      case 1:
                        break regionExit2;
                      case 10:
                        break regionExit1;
                      default:
                        return;
                    }
                  }
                  if ((decompiledFrameRemainder1) &&
                    (decompiledFrameRemainder0)) {
                    if (8 != var9.terrainType) {
                      return;
                    }
                    if (!this.arePlayersAllied(var9.ownerPlayer, -16985, param3)) {
                      return;
                    }
                    var7 = var9.getDefaultCaptureStrength(10);
                    var6.terrainType = param2;
                    var9.captureStrength = var9.captureStrength + (-var7 + var9.getDefaultCaptureStrength(10));
                    this.f(-2);
                    this.recountStructures(2);
                    return;
                  }
                  if (decompiledFrameRemainder1) {
                    if (var9.terrainType != 1) {
                      if (var9.terrainType != 0 &&
                        var9.terrainType != 3 &&
                        5 != var9.terrainType) {
                        return;
                      }
                      var6.terrainType = 4;
                      if (var8 == 0) {
                        return;
                      }
                    }
                    var6.terrainType = 10;
                    if (var8 == 0) {
                      return;
                    }
                  }
                  if (var9.terrainType != 0) {
                    return;
                  }
                  var6.terrainType = 3;
                  if (var8 == 0) {
                    return;
                  }
                }
                if (var9.terrainType != 0 &&
                  var9.terrainType != 3) {
                  return;
                }
                var6.terrainType = 5;
                if (var8 == 0) {
                  return;
                }
              }
              if (var9.terrainType == 2) {
                var6.terrainType = 0;
                if (var8 == 0) {
                  return;
                }
              }
              if (12 != var9.terrainType) {
                return;
              }
              var6.terrainType = 13;
              if (var8 == 0) {
                return;
              }
            }
            if (var9.terrainType != 0 &&
              var9.terrainType != 3 &&
              var9.terrainType != 5) {
              return;
            }
            var6.terrainType = 1;
            if (var8 == 0) {
              return;
            }
          }
          if (var9.terrainType == 6 ||
            4 == var9.terrainType) {
            var6.terrainType = 10;
          }
          if (var9.terrainType != 5) {
            return;
          }
          var6.terrainType = 1;
          return;
        }
    }

    final boolean b(int param0, boolean param1) {
        if (this.field_f) {
          return false;
        }
        if (!this.matchConditions.hasDefeat((byte) -88, param0)) {
          return false;
        }
        if (!param1) {
          this.field_vb = 102;
        }
        this.eliminatePlayer(10001, param0, false);
        return true;
    }

    final NodeDeque getUnitsForPlayer(int playerId, int obfuscationGuard) {
        if (null == this.unitsByPlayer) {
          return null;
        }
        if (0 > playerId) {
          return null;
        }
        if (playerId >= this.unitsByPlayer.length) {
          return null;
        }
        if (obfuscationGuard != 0) {
          this.teamManaCollected = (int[]) null;
        }
        return this.unitsByPlayer[playerId];
    }

    private final void b(int[] param0, int param1, int param2, int param3) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Unit var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = 0;
          if (param1 != 12534) {
            this.readGameEvent((PacketBuffer) null, (byte) -4);
          }
          do {
            if (this.teamCount <= var5_int) {
              var5_int = -3;
              break;
            }
            param0[var5_int] = 0;
            var5_int++;
          } while (var10 == 0);
          scanLoop1: while (true) {
            stackIn_10_0 = ~var5_int;
            stackIn_10_1 = -4;
            if (stackIn_10_0 >= stackIn_10_1) {
              if (var10 != 0) {
                return;
              }
              var6 = -3;
              while (3 >= var6) {
                var7 = Math.abs(var5_int) + Math.abs(var6);
                stackIn_10_0 = -1;
                stackIn_10_1 = ~(param3 + var5_int);
                if (stackIn_10_0 >= stackIn_10_1 &&
                  (param3 + var5_int) < this.mapWidth &&
                  var6 + param2 >= 0 &&
                  (var6 + param2) < this.mapHeight) {
                  var8 = this.tiles[this.mapWidth * (param2 + var6) + param3 + var5_int].occupant;
                  if (var8 != null ||
                    var10 != 0) {
                    var9 = this.getPlayerTeamIndex(var8.ownerPlayer, param1 - 12535);
                    if (var8.unitType == 59) {
                      stackIn_26_0 = (!var8.packedFlag32) ? 0 : 1;
                      if (stackIn_26_0 + ps.field_C[2] >= var7) {
                        param0[var9] = oe.c(param0[var9], 4);
                      }
                    }
                    if (var8.unitType == 53) {
                      stackIn_31_0 = ~var7;
                      if (var8.packedFlag32) {
                        stackIn_32_1 = 1;
                      } else {
                        stackIn_32_1 = 0;
                      }
                      if (stackIn_31_0 >= ~(stackIn_32_1 + ps.field_C[3])) {
                        param0[var9] = oe.c(param0[var9], 8);
                      }
                    }
                    if (var8.unitType == 43) {
                      stackIn_38_0 = var7;
                      if (!var8.packedFlag32) {
                        stackIn_39_1 = 0;
                      } else {
                        stackIn_39_1 = 1;
                      }
                      if (stackIn_38_0 <= stackIn_39_1 + ps.field_C[4] &&
                        0 < var7) {
                        param0[var9] = oe.c(param0[var9], 16);
                      }
                    }
                    if (var8.unitType == 63) {
                      stackIn_45_0 = ps.field_C[0];
                      if (var8.packedFlag32) {
                        stackIn_46_1 = 1;
                      } else {
                        stackIn_46_1 = 0;
                      }
                      if ((stackIn_45_0 + stackIn_46_1) >= var7) {
                        param0[var9] = oe.c(param0[var9], 1);
                      }
                    }
                    if (58 == var8.unitType) {
                      stackIn_51_0 = ps.field_C[1];
                      if (!var8.packedFlag32) {
                        stackIn_52_1 = 0;
                      } else {
                        stackIn_52_1 = 1;
                      }
                      if ((stackIn_51_0 + stackIn_52_1) >= var7) {
                        param0[var9] = oe.c(param0[var9], 2);
                      }
                    }
                  }
                }
                var6++;
              }
              var5_int++;
              continue scanLoop1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_59_0 = var5;
          stackIn_59_1 = new StringBuilder().append("ha.LA(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        Unit var8;
        var8 = this.getUnitAt(param3, true, param2);
        if (param0 >= -117) {
          this.playerTurnCounts = (int[]) null;
        }
        if (var8 != null &&
          this.arePlayersAllied(var8.ownerPlayer, -16985, param4) && (!var8.a(23072) ||
          param1)) {
          var8.strength = var8.strength + param5;
          if (this.field_b) {
            this.field_ob[param4] = this.field_ob[param4] + param5;
          }
          if (var8.maximumStrength < var8.strength) {
            var8.strength = var8.maximumStrength;
          }
        }
    }

    final void a(byte param0, Spell param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_f &&
            param2 > -1) {
            stackIn_4_0 = 1;
          } else {
            stackIn_4_0 = 0;
          }
          var5_int = stackIn_4_0;
          if (this.campaignMission != null &&
            ~param3 != ~this.campaignMission.playerSlot) {
            var5_int = 0;
          }
          if (param0 != -49) {
            this.b(-42, true, -106, -92, 114);
          }
          if (var5_int != 0) {
            this.field_B[param3][param2] = -1;
            this.remainingRuneCap[param3] = this.remainingRuneCap[param3] - uc.spellDefinitions[param1.spellId][0];
          }
          this.field_J = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ha.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean h(int param0) {
        int var2 = this.field_Fb ? 1 : 0;
        this.field_Fb = false;
        if (param0 != -293) {
          this.field_ib = 1;
        }
        return var2 != 0;
    }

    final void b(int param0, int param1, int param2, byte param3) {
        int[] dupTemp$1 = null;
        if (param1 >= 0) {
          if (param1 >= this.godFavourLevels.length) {
            return;
          }
          if (param0 >= 0) {
            if (param0 >= this.godFavourLevels[param1].length) {
              return;
            }
            dupTemp$1 = this.godFavourLevels[param1];
            dupTemp$1[param0] = dupTemp$1[param0] + param2;
            if (this.godFavourLevels[param1][param0] > 5) {
              this.godFavourLevels[param1][param0] = 5;
            }
            if (param3 != 92) {
              return;
            }
            if (param0 == -1) {
              return;
            }
            if (this.godFavourLevels[param1][param0] > this.godFavourLevels[param1][6]) {
              this.godFavourLevels[param1][6] = this.godFavourLevels[param1][param0];
            }
            return;
          }
        }
    }

    final String[] e(int param0) {
        if (param0 != 26524) {
          this.field_qb = true;
        }
        return this.matchConditions.describeConditions(param0 ^ 26524);
    }

    private final void readStateChangeEvent(int obfuscationGuard, PacketBuffer packet) {
        int header = 0;
        int tileX = 0;
        int tileY = 0;
        int playerId = 0;
        int effectType = 0;
        try {
          header = packet.readUnsignedByte(obfuscationGuard + 30531);
          tileX = packet.readUnsignedByte(0);
          tileY = packet.readUnsignedByte(0);
          playerId = 7 & header;
          if (obfuscationGuard != -30531) {
            this.applyMatchOutcome(103, false, (int[]) null);
          }
          effectType = (header & 31) >> 3;
          this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new StateChangeEvent(effectType, tileX, tileY, playerId)));
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ha.GD(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    private final void appendPlayerDiagnostics(int playerId, gn output, int obfuscationGuard) {
        int stackIn_9_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          output.a(new String[]{this.e(playerId, obfuscationGuard + 3395), ": "}, (byte) -124);
          output.a(0, 2);
          var4_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4_int >= this.chosenGods[playerId].length))) {
            var5 = this.chosenGods[playerId][var4_int];
            stackIn_9_0 = var5;
            if (var6 == 0) {
              if (stackIn_9_0 >= 0) {
                output.a(new String[]{"god: ", wf.field_q[var5 + 1], " level: ", Integer.toString(this.godFavourLevels[playerId][var5])}, (byte) -57);
              }
              var4_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            output.a(new String[]{"mana: ", Integer.toString(this.playerMana[playerId]), ", collected: ", Integer.toString(this.teamManaCollected[this.playerTeamIndices[playerId]])}, (byte) -49);
            output.a(new String[]{"turns: ", Integer.toString(this.playerTurnCounts[playerId])}, (byte) -102);
            stackIn_9_0 = ~BattleCharacter.field_i[this.field_Q];
          }
          if (stackIn_9_0 != -1) {
            output.a(new String[]{"rune cap remaining: ", Integer.toString(this.remainingRuneCap[playerId])}, (byte) -62);
          }
          output.a(0, -2);
          if (obfuscationGuard != -3396) {
            this.hasCapturingUnit(91, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ha.G(").append(playerId).append(',');
          if (output == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int scaleIncomingDamage(Unit defender, byte obfuscationGuard, int attackTypeMask, int attackPower) {
        int damageTakenPercent = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          damageTakenPercent = this.getDamageTakenPercent(defender.tileX + defender.tileY * this.mapWidth, -4, defender);
          if (~(attackTypeMask | TrianglePulse.statusProtectionMasks[defender.statusEffectType]) == ~TrianglePulse.statusProtectionMasks[defender.statusEffectType]) {
            damageTakenPercent = damageTakenPercent - defender.statusEffectValue * 10;
          }
          if (obfuscationGuard > -111) {
            this.field_eb = false;
          }
          stackIn_5_0 = damageTakenPercent * attackPower / 100;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ha.L(");
          if (defender == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(',').append(attackTypeMask).append(',').append(attackPower).append(')').toString());
        }
    }

    final boolean hasUsablePortal(int playerId, byte obfuscationGuard) {
        int var3;
        int var4;
        int stackIn_17_0 = 0;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != -26) {
          return false;
        }
        var3 = 0;
        while ((this.mapWidth * this.mapHeight) > var3) {
          stackIn_17_0 = ~this.tiles[var3].ownerPlayer;
          if (var4 != 0) {
            return stackIn_17_0 != 0;
          }
          if (stackIn_17_0 == ~playerId ||
            null == this.campaignMission &&
            this.arePlayersAllied(this.tiles[var3].ownerPlayer, -16985, playerId)) {
            if (this.tiles[var3].terrainType == 7) {
              return true;
            }
            if (this.tiles[var3].terrainType == 11 &&
              this.godFavourLevels[playerId][this.tiles[var3].godId] > 0) {
              return true;
            }
          }
          var3++;
        }
        return false;
    }

    final boolean hasCapturingUnit(int playerId, boolean obfuscationGuard) {
        Unit var3_ref_jd = null;
        int var3 = 0;
        Unit var4 = null;
        int var5 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_18_0 = 0;
        boolean stackIn_25_0 = false;
        int stackIn_34_0 = 0;
        boolean stackOut_24_0;
        int stackIn_18_0Lifetime1;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!obfuscationGuard) {
          return false;
        }
        var3_ref_jd = (Unit) (this.unitsByPlayer[playerId].first((byte) 116));
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3_ref_jd == null))) {
          stackIn_13_0 = var3_ref_jd.canCaptureStructures(-21428);
          if (var5 == 0) {
            if ((stackIn_13_0 ||
              var3_ref_jd.isSeaSlug((byte) 116)) &&
              !var3_ref_jd.removedFromActivePlay) {
              return true;
            }
            var3_ref_jd = (Unit) (this.unitsByPlayer[playerId].next((byte) 123));
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_13_0 = this.teamGame;
        }
        if (stackIn_13_0) {
          if (null != this.campaignMission) {
            return false;
          }
          var3 = 0;
          while (true) {
            stackIn_18_0 = this.playerCount;
            if (stackIn_18_0 <= var3) {
              break;
            }
            stackIn_34_0 = var3;
            if (var5 != 0) {
              return stackIn_34_0 != 0;
            }
            if (stackIn_34_0 != playerId &&
              this.arePlayersAllied(var3, -16985, playerId)) {
              var4 = (Unit) (this.unitsByPlayer[var3].first((byte) 99));
              while (var4 != null) {
                stackOut_24_0 = var4.canCaptureStructures(-21428);
                stackIn_18_0Lifetime1 = stackOut_24_0 ? 1 : 0;
                stackIn_25_0 = stackOut_24_0;
                if ((stackIn_25_0 ||
                  var4.isSeaSlug((byte) 90)) &&
                  !var4.removedFromActivePlay) {
                  return true;
                }
                var4 = (Unit) (this.unitsByPlayer[var3].next((byte) 123));
              }
            }
            var3++;
          }
        }
        return false;
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4) {
        MapTile var6;
        if (0 <= param2 &&
          0 <= param3 &&
          this.mapWidth > param2 &&
          this.mapHeight > param3) {
          var6 = this.tiles[param2 + this.mapWidth * param3];
          if (null == var6.occupant) {
            return false;
          }
          if (param0 < ~param4) {
            return true;
          }
          if (this.arePlayersAllied(var6.occupant.ownerPlayer, -16985, param4)) {
            return true;
          }
          return param1;
        }
        return false;
    }

    final int[] getSummoningFavourAt(int tileY, byte obfuscationGuard, int tileX, int playerId) {
        int[] var5 = null;
        MapTile var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        boolean decompiledFrameCompleted0 = true;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var9 = new int[7];
        var5 = var9;
        var6 = this.tiles[tileX + tileY * this.mapWidth];
        if (7 == var6.terrainType &&
          this.arePlayersAllied(var6.ownerPlayer, -16985, playerId)) {
          var7 = 0;
          while (var7 < 7) {
            var9[var7] = this.godFavourLevels[playerId][var7];
            var7++;
            if (var8 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if ((decompiledFrameCompleted0) && (var6.terrainType == 11 &&
          this.arePlayersAllied(var6.ownerPlayer, -16985, playerId) &&
          var9[var6.godId] < var6.godFavourLevel)) {
          var9[var6.godId] = var6.godFavourLevel;
        }
        if (obfuscationGuard >= 8) {
          return var9;
        }
        return (int[]) null;
    }

    final int a(boolean param0, int param1) {
        int stackIn_21_0 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        Unit var6 = null;
        int var7 = 0;
        MapTile var8_ref_ne = null;
        int var8 = 0;
        int var9 = 0;
        int var5Lifetime1;
        int var7Lifetime1;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var3 = this.randomSeed;
        if (this.kingBlackDragonSummoned) {
          var3 = var3 ^ 313485252;
        }
        var3 = var3 ^ this.mapSizeSetting * 137;
        var3 = var3 ^ 783246 * this.mapTheme;
        var3 = var3 ^ this.field_Q * 545542;
        if (param1 >= 0) {
          var3 = var3 ^ this.n(param1, -111) * (7 * param1 + 11);
        }
        var4 = param1;
        if (0 > var4) {
          var4 = 0;
        }
        if (!param0) {
          this.field_ib = -38;
        }
        var5 = 0;
        scanLoop1: while (true) {
          if (this.mapWidth > var5) {
            stackIn_21_0 = 0;
            if (var9 != 0) {
              break scanLoop1;
            }
            var6_int = stackIn_21_0;
            while (this.mapHeight > var6_int) {
              var7 = this.mapWidth * var6_int + var5;
              var8_ref_ne = this.tiles[var7];
              var3 = var3 ^ this.a((byte) 103, var4, var8_ref_ne) * (var7 * 3 + 351);
              var6_int++;
            }
            var5++;
            continue scanLoop1;
          }
          stackIn_21_0 = 0;
          break;
        }
        var5Lifetime1 = stackIn_21_0;
        scanLoop2: while (var5Lifetime1 < this.playerCount) {
          var6 = (Unit) (this.unitsByPlayer[var5Lifetime1].first((byte) 101));
          while (true) {
            if (var6 != null) {
              var7Lifetime1 = var6.tileX;
              var8 = var6.tileY;
              var3 = var3 ^ this.b(-125, var6) * (var7Lifetime1 + 372) * (var8 + 723);
              var6 = (Unit) (this.unitsByPlayer[var5Lifetime1].next((byte) 123));
              if (var9 == 0) {
                continue;
              }
            } else {
              var5Lifetime1++;
            }
            break;
          }
          if (var9 == 0) {
            continue scanLoop2;
          }
          break;
        }
        return var3;
    }

    final void setEliminatedPlayerMask(int playerMask, int obfuscationGuard) {
        int var3;
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var3 = -36 % ((-50 - obfuscationGuard) / 62);
        var4 = 0;
        while (this.playerCount > var4) {
          if (var5 == 0) {
            if ((this.eliminatedPlayerMask & 1 << var4) != (1 << var4 & playerMask)) {
              this.eliminatePlayer(10001, var4, false);
            }
            var4++;
            continue;
          }
          break;
        }
        this.eliminatedPlayerMask = playerMask;
        return;
    }

    final void c(int param0, int param1, int param2, byte param3) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int[] dupTemp$3 = null;
        int[] dupTemp$4 = null;
        int[] dupTemp$5 = null;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        Unit var10;
        MapTile var11;
        int var7Lifetime1;
        int var7Lifetime2;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (-1 < param2) {
          var10 = this.getUnitAt(param0, true, param1);
          if (var10 != null &&
            1 == var10.accessoryType) {
            var10.accessoryType = 0;
          }
        }
        boolean decompiledFrameRemainder2 = true;
        var11 = this.tiles[param1 + param0 * this.mapWidth];
        var6 = var11.ownerPlayer;
        if (var6 > -1) {
          boolean decompiledFrameRemainder1 = true;
          var7 = var11.terrainType;
          if (var7 == 7 &&
            var9 == 0) {
            dupTemp$0 = this.teamStructureCounts[this.playerTeamIndices[var6]];
            dupTemp$0[0] = dupTemp$0[0] - 1;
            decompiledFrameRemainder2 = false;
          } else {
            if (var7 != 14 && (var7 != 9 ||
              var9 != 0)) {
              decompiledFrameRemainder1 = (var7 != 8);
              decompiledFrameRemainder2 = !(decompiledFrameRemainder1);
            }
          }
          if ((decompiledFrameRemainder2) &&
            (decompiledFrameRemainder1)) {
            dupTemp$1 = this.teamStructureCounts[this.playerTeamIndices[var6]];
            dupTemp$1[1] = dupTemp$1[1] - 1;
            decompiledFrameRemainder2 = (var9 != 0);
          }
          if (decompiledFrameRemainder2) {
            dupTemp$2 = this.teamStructureCounts[this.playerTeamIndices[var6]];
            dupTemp$2[2] = dupTemp$2[2] - 1;
          }
        }
        regionExit1: {
          regionExit2: {
            regionExit3: {
              var11.a(-104, param2);
              var7Lifetime1 = var11.terrainType;
              if (var7Lifetime1 != 7) {
                if (var7Lifetime1 == 14) {
                  break regionExit3;
                }
                if (var7Lifetime1 == 9 &&
                  var9 == 0) {
                  break regionExit3;
                }
                if (var7Lifetime1 != 8) {
                  break regionExit1;
                }
                if (var9 == 0) {
                  break regionExit2;
                }
              }
              dupTemp$3 = this.teamStructureCounts[this.playerTeamIndices[param2]];
              dupTemp$3[0] = dupTemp$3[0] + 1;
              if (var9 == 0) {
                break regionExit1;
              }
            }
            dupTemp$4 = this.teamStructureCounts[this.playerTeamIndices[param2]];
            dupTemp$4[1] = dupTemp$4[1] + 1;
            if (var9 == 0) {
              break regionExit1;
            }
          }
          dupTemp$5 = this.teamStructureCounts[this.playerTeamIndices[param2]];
          dupTemp$5[2] = dupTemp$5[2] + 1;
        }
        if (param3 != -115) {
          this.field_U = (int[]) null;
        }
        if (this.field_b &&
          !this.teamGame) {
          this.d(param2, this.teamStructureCounts[this.playerTeamIndices[param2]][1] + (this.teamStructureCounts[this.playerTeamIndices[param2]][0] + this.teamStructureCounts[this.playerTeamIndices[param2]][2]), 102, 0);
          var7Lifetime2 = -1 + this.playerCount;
          var8 = 0;
          while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (this.eliminationOrder[var8] > -1) {
              stackIn_43_0 = ~this.playerCount;
              stackIn_43_1 = ~var8;
              decompiledFrameRemainder0 = (var9 == 0);
              if ((decompiledFrameRemainder0) &&
                (stackIn_43_0 < stackIn_43_1)) {
                var7Lifetime2--;
                var8++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_43_0 = var7Lifetime2;
              stackIn_43_1 = -1;
            }
            if (stackIn_43_0 > stackIn_43_1 &&
              ~this.rankedParticipants[var7Lifetime2] == ~var6) {
              this.field_y[param2] = this.field_y[param2] + 1;
              this.d(param2, this.field_y[param2], 104, 15);
            }
            if (~this.rankedParticipants[0] != ~var6) {
              break;
            }
            this.field_M[param2] = this.field_M[param2] + 1;
            this.d(param2, this.field_M[param2], param3 ^ -18, 14);
            break;
          }
        }
        if (var11.hasModifierFlag1(12)) {
          this.eliminatePlayer(param3 + 10116, var6, false);
          var11.d((byte) 61);
        }
        if (this.campaignMission != null &&
          var6 != -1) {
          this.b(var6, true);
        }
        this.updateMatchOutcome(1);
    }

    final void g(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param3 != -9513) {
          this.eliminatePlayer(-46, 97, true);
        }
        var5 = 0;
        while (var5 < this.playerCount &&
          var7 == 0) {
          var6 = 0;
          while (var6 < 6) {
            this.godFavourLevels[var5][param1] = 1;
            this.godFavourLevels[var5][param2] = 1;
            this.godFavourLevels[var5][param0] = 1;
            this.chosenGods[var5][0] = param1;
            this.chosenGods[var5][1] = param2;
            this.chosenGods[var5][2] = param0;
            var6++;
          }
          var5++;
        }
        return;
    }

    private final void j(int param0) {
        if (param0 != 7) {
          this.kingBlackDragonSummoned = true;
          return;
        }
    }

    final int[] predictCombat(Unit defender, int attackOriginY, byte obfuscationGuard, int targetDeltaY, Unit attacker, int targetDeltaX, int attackOriginX) {
        int[] stackIn_7_0 = null;
        int[] stackIn_16_0 = null;
        int stackIn_20_0 = 0;
        int[] stackIn_80_0 = null;
        int[] stackIn_97_0 = null;
        int[] stackIn_108_0 = null;
        int[] stackIn_133_0 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        String stackIn_137_2 = null;
        StringBuilder stackIn_139_1 = null;
        String stackIn_140_2 = null;
        RuntimeException decompiledCaughtException = null;
        Unit attackerUnit = null;
        RuntimeException var8_ref = null;
        Unit defenderUnit = null;
        int[] combatPrediction = null;
        int effectiveAttackerType = 0;
        int attackDistance = 0;
        int attackerDamageMask = 0;
        int defenderDamageMask = 0;
        int attackerEquipmentBonus = 0;
        int defenderEquipmentBonus = 0;
        int meleeRange = 0;
        int maximumRange = 0;
        int minimumRange = 0;
        int defenderDamage = 0;
        int attackerDamage = 0;
        int var22 = 0;
        Unit var23 = null;
        int defenderMinimumRange;
        var22 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var23 = attacker;
          attackerUnit = var23;
          if (obfuscationGuard > -119) {
            this.inactivePlayerMask = 42;
          }
          defenderUnit = defender;
          combatPrediction = new int[]{0, 0, 0};
          if (attackerUnit != null &&
            defenderUnit != null) {
            effectiveAttackerType = var23.unitType;
            if (effectiveAttackerType == 34 &&
              var23.packedFlag8) {
              effectiveAttackerType = 75;
            }
            if (!var23.canAttackFlying((byte) 80) &&
              defenderUnit.isFlying(-96)) {
              stackIn_16_0 = combatPrediction;
              return stackIn_16_0;
            }
            attackDistance = Math.abs(targetDeltaX) + Math.abs(targetDeltaY);
            attackerDamageMask = 32;
            defenderDamageMask = 32;
            attackerEquipmentBonus = 0;
            defenderEquipmentBonus = 0;
            stackIn_20_0 = (attackDistance != 1) ? 0 : 1;
            boolean decompiledFrameRemainder1 = true;
            meleeRange = stackIn_20_0;
            if (meleeRange == 0) {
              if (34 != var23.unitType ||
                !var23.packedFlag8) {
                if (var23.unitType != 81 &&
                  var23.unitType != 4 &&
                  var23.unitType != 74) {
                  if (var23.getUnitCategory(0) != 3) {
                    attackerDamageMask = 2;
                    decompiledFrameRemainder1 = (var23.getEquipmentCategory(20640) == 1);
                    if (decompiledFrameRemainder1) {
                      attackerEquipmentBonus = var23.getEquipmentProperty(0, 80);
                      decompiledFrameRemainder1 = (var22 != 0);
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    if (var23.getEquipmentCategory(20640) == 2) {
                      attackerEquipmentBonus = var23.getEquipmentProperty(0, 58);
                    }
                    attackerDamageMask = 4;
                    decompiledFrameRemainder1 = (var22 != 0);
                  }
                }
                if (decompiledFrameRemainder1) {
                  attackerDamageMask = 8;
                  decompiledFrameRemainder1 = (var23.getEquipmentCategory(20640) == 3);
                  if (decompiledFrameRemainder1) {
                    attackerEquipmentBonus = var23.getEquipmentProperty(0, 106);
                    decompiledFrameRemainder1 = (var22 != 0);
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                attackerDamageMask = 8;
                decompiledFrameRemainder1 = (var23.getEquipmentCategory(20640) == 3);
                if (decompiledFrameRemainder1) {
                  attackerEquipmentBonus = var23.getEquipmentProperty(0, 118);
                }
              }
            }
            if ((decompiledFrameRemainder1) &&
              (meleeRange != 0 ||
              var22 != 0)) {
              if (var23.unitType == 34 &&
                var23.packedFlag8) {
                attackerDamageMask = 8;
                decompiledFrameRemainder1 = (var23.getEquipmentCategory(20640) == 3);
                if (decompiledFrameRemainder1) {
                  attackerEquipmentBonus = var23.getEquipmentProperty(0, 55);
                  decompiledFrameRemainder1 = (var22 != 0);
                }
              }
              if (decompiledFrameRemainder1) {
                if (var23.isFlying(-126)) {
                  if (var23.getEquipmentCategory(20640) == 4) {
                    attackerEquipmentBonus = var23.getEquipmentProperty(0, -95);
                  }
                  attackerDamageMask = 16;
                  decompiledFrameRemainder1 = (var22 != 0);
                }
                if (decompiledFrameRemainder1) {
                  if (var23.getUnitCategory(0) == 3) {
                    attackerDamageMask = 4;
                    if (var23.getEquipmentCategory(20640) == 2) {
                      attackerEquipmentBonus = var23.getEquipmentProperty(0, -102);
                      if (var22 != 0) {
                        attackerDamageMask = 1;
                        if (0 == var23.getEquipmentCategory(20640)) {
                          attackerEquipmentBonus = var23.getEquipmentProperty(0, -93);
                        }
                      }
                    }
                  } else {
                    attackerDamageMask = 1;
                    if (0 == var23.getEquipmentCategory(20640)) {
                      attackerEquipmentBonus = var23.getEquipmentProperty(0, -93);
                    }
                  }
                }
              }
            }
            boolean decompiledFrameRemainder0 = true;
            if (meleeRange != 0) {
              if (defenderUnit.unitType != 34 ||
                !defenderUnit.packedFlag8) {
                if (defenderUnit.isFlying(-109)) {
                  defenderDamageMask = 16;
                  decompiledFrameRemainder0 = (defenderUnit.getEquipmentCategory(20640) == 4);
                  if (decompiledFrameRemainder0) {
                    defenderEquipmentBonus = defenderUnit.getEquipmentProperty(0, 122);
                    decompiledFrameRemainder0 = (var22 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (3 == defenderUnit.getUnitCategory(0)) {
                    if (defenderUnit.getEquipmentCategory(20640) == 2) {
                      defenderEquipmentBonus = defenderUnit.getEquipmentProperty(0, 69);
                    }
                    defenderDamageMask = 4;
                    if (var22 != 0) {
                      if (defenderUnit.getEquipmentCategory(20640) == 0) {
                        defenderEquipmentBonus = defenderUnit.getEquipmentProperty(0, -123);
                      }
                      defenderDamageMask = 1;
                      if (defenderUnit.getEquipmentCategory(20640) == 3) {
                        defenderEquipmentBonus = defenderUnit.getEquipmentProperty(0, 116);
                      }
                      defenderDamageMask = 8;
                    }
                  } else {
                    if (defenderUnit.getEquipmentCategory(20640) == 0) {
                      defenderEquipmentBonus = defenderUnit.getEquipmentProperty(0, -123);
                    }
                    defenderDamageMask = 1;
                    if (var22 != 0) {
                      if (defenderUnit.getEquipmentCategory(20640) == 3) {
                        defenderEquipmentBonus = defenderUnit.getEquipmentProperty(0, 116);
                      }
                      defenderDamageMask = 8;
                    }
                  }
                }
              } else {
                if (defenderUnit.getEquipmentCategory(20640) == 3) {
                  defenderEquipmentBonus = defenderUnit.getEquipmentProperty(0, 116);
                }
                defenderDamageMask = 8;
              }
            }
            if (effectiveAttackerType >= 0 &&
              bw.unitDefinitions.length > effectiveAttackerType) {
              maximumRange = attacker.getMaximumAttackRange(3257);
              minimumRange = attacker.getMinimumAttackRange((byte) -79);
              if (attacker.unitType != 81 &&
                4 != attacker.unitType &&
                attacker.unitType != 74 ||
                attacker.getEquipmentCategory(20640) != 3) {
                if (attacker.getUnitCategory(0) != 3 ||
                  attacker.getEquipmentCategory(20640) != 2) {
                  if ((attacker.getUnitCategory(0) == 2) &&
                    (1 == attacker.getEquipmentCategory(20640))) {
                    maximumRange = maximumRange + attacker.getEquipmentProperty(1, 117);
                    if (var22 != 0) {
                      maximumRange = maximumRange + attacker.getEquipmentProperty(1, -124);
                      maximumRange = maximumRange + attacker.getEquipmentProperty(1, -87);
                    }
                  }
                } else {
                  maximumRange = maximumRange + attacker.getEquipmentProperty(1, -124);
                  if (var22 != 0) {
                    maximumRange = maximumRange + attacker.getEquipmentProperty(1, -87);
                  }
                }
              } else {
                maximumRange = maximumRange + attacker.getEquipmentProperty(1, -87);
              }
              if (attackDistance > maximumRange) {
                stackIn_97_0 = combatPrediction;
                return stackIn_97_0;
              }
              defenderDamage = 0;
              attackerDamage = 0;
              if (attackDistance >= minimumRange) {
                defenderDamage = this.scaleIncomingDamage(defenderUnit, (byte) -123, attackerDamageMask, this.computeAttackPower(attackOriginY, 0, attackOriginX, defenderUnit, var23, (byte) -128) + attackerEquipmentBonus);
                if (defenderDamage == 0) {
                  defenderDamage = 1;
                }
                if (255 < defenderDamage) {
                  defenderDamage = 255;
                }
                combatPrediction[0] = defenderDamage;
              }
              if ((attackDistance < minimumRange ||
                var22 != 0) &&
                attackDistance > 1) {
                stackIn_108_0 = combatPrediction;
                return stackIn_108_0;
              }
              if (meleeRange != 0 && (!(defenderDamage >= defenderUnit.bonusStrength + defenderUnit.strength) ||
                defender.statusEffectType == 7 ||
                8 == defender.statusEffectType)) {
                defenderMinimumRange = bw.unitDefinitions[defenderUnit.unitType][6];
                if (defenderMinimumRange > 1) {
                  attackerDamage = this.scaleIncomingDamage(attackerUnit, (byte) -123, defenderDamageMask, this.computeAttackPower(attackOriginY + targetDeltaY, defenderDamage, attackOriginX + targetDeltaX, var23, defenderUnit, (byte) -128) * 3 / 20 + defenderEquipmentBonus);
                }
                if (defenderMinimumRange <= 1 ||
                  var22 != 0) {
                  attackerDamage = this.scaleIncomingDamage(attackerUnit, (byte) -125, defenderDamageMask, this.computeAttackPower(attackOriginY + targetDeltaY, defenderDamage, targetDeltaX + attackOriginX, var23, defenderUnit, (byte) -128) + defenderEquipmentBonus);
                  if (attackerDamage == 0) {
                    attackerDamage = 1;
                  }
                }
                if (attackerDamage > 255) {
                  attackerDamage = 255;
                }
                combatPrediction[1] = attackerDamage;
              }
              if (var23.bonusStrength + var23.strength <= attackerDamage &&
                attacker.statusEffectType != 7 &&
                attacker.statusEffectType != 8) {
                combatPrediction[2] = oe.c(combatPrediction[2], 1);
              }
              if (defenderDamage >= defenderUnit.strength + defenderUnit.bonusStrength &&
                7 != defender.statusEffectType &&
                defender.statusEffectType != 8) {
                combatPrediction[2] = oe.c(combatPrediction[2], 2);
              }
              stackIn_133_0 = combatPrediction;
              return stackIn_133_0;
            }
            stackIn_80_0 = combatPrediction;
            return stackIn_80_0;
          }
          stackIn_7_0 = combatPrediction;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_136_0 = var8_ref;
          stackIn_136_1 = new StringBuilder().append("ha.EC(");
          if (defender == null) {
            stackIn_137_2 = "null";
          } else {
            stackIn_137_2 = "{...}";
          }
          stackIn_139_1 = ((StringBuilder) (Object) stackIn_136_1).append(stackIn_137_2).append(',').append(attackOriginY).append(',').append(obfuscationGuard).append(',').append(targetDeltaY).append(',');
          if (attacker == null) {
            stackIn_140_2 = "null";
          } else {
            stackIn_140_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_136_0), ((StringBuilder) (Object) stackIn_139_1).append(stackIn_140_2).append(',').append(targetDeltaX).append(',').append(attackOriginX).append(')').toString());
        }
    }

    private final void a(boolean param0, Unit param1, gn param2) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          param2.a(new String[]{"unit type: ", dn.unitDisplayNames[param1.unitType].toLowerCase(), " at ", TutorialController.formatCoordinatePair(param1.tileX, 0, param1.tileY)}, (byte) -120);
          param2.a(0, 2);
          param2.a(new String[]{"owner: ", this.e(param1.ownerPlayer, -1)}, (byte) -120);
          if (param1.poisoned) {
            param2.a((byte) 19, "poisoned");
          }
          if (param1.packedFlag8) {
            param2.a((byte) 19, "deployed");
          }
          if (param1.movementSpent) {
            param2.a((byte) 19, "moved");
          }
          if (param1.packedFlag512) {
            param2.a((byte) 19, "trinket used");
          }
          param2.a((byte) 19, "attacksleft: " + param1.attacksRemaining);
          if (param1.bonusStrength != 0) {
            param2.a(new String[]{"bonus: ", Integer.toString(param1.bonusStrength)}, (byte) -54);
          }
          param2.a(new String[]{"strength: ", Integer.toString(param1.strength), "/", Integer.toString(param1.maximumStrength)}, (byte) -105);
          param2.a(0, -2);
          if (param0) {
            this.getSummoningFavourAt(-59, (byte) 114, 16, 49);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("ha.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final boolean isPlayerInactive(int obfuscationGuard, int playerId) {
        boolean stackIn_7_0 = false;
        if (obfuscationGuard != -1) {
          this.a(56, (String) null, (GameEvent) null);
        }
        stackIn_7_0 = ((this.eliminatedPlayerMask & 1 << playerId) != 0) || ((this.inactivePlayerMask & 1 << playerId) != 0);
        return stackIn_7_0;
    }

    final int a(int param0, int param1, boolean param2) {
        int var4 = -1;
        if (param1 >= 0) {
          var4 = this.getPlayerTeamIndex(param1, -1);
        }
        if (!param2) {
          this.mapTheme = -93;
        }
        return this.tiles[param0].getEffectsForPlayer((byte) 97, param1, var4);
    }

    private final int computeAttackPower(int attackerY, int priorDamage, int attackerX, Unit defender, Unit attacker, byte obfuscationGuard) {
        int discarded$0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int matchupPercent = 0;
        RuntimeException var7 = null;
        int attackPower = 0;
        try {
          if (defender.statusEffectType == 7 ||
            defender.statusEffectType == 8) {
            priorDamage = 0;
          }
          matchupPercent = fk.matchupDamagePercent[attacker.getUnitCategory(0)][defender.getUnitCategory(0)];
          if (obfuscationGuard > -127) {
            discarded$0 = this.a((byte) -69, -60, (MapTile) null);
          }
          if ((this.getTileEffects(31, attackerY, attackerX, attacker.ownerPlayer) & 16) != 0) {
            matchupPercent = 90;
          }
          if (attacker.hasAntiFlyingBonus(116) &&
            defender.isFlying(-121)) {
            matchupPercent = 90;
          }
          attackPower = matchupPercent * (attacker.bonusStrength + (attacker.strength - priorDamage)) / 100;
          stackIn_15_0 = (attackPower <= 0) ? 0 : attackPower;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_18_0 = var7;
          stackIn_18_1 = new StringBuilder().append("ha.VC(").append(attackerY).append(',').append(priorDamage).append(',').append(attackerX).append(',');
          if (defender == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (attacker == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void readStoredUnitAt(int tileX, int obfuscationGuard, PacketBuffer packet, int tileY) {
        int var5_int = 0;
        Unit var6 = null;
        if (obfuscationGuard >= -22) {
          return;
        }
        try {
          var5_int = packet.readUnsignedByte(0);
          var6 = SummonEvent.readStoredUnit(var5_int, 0, tileY, tileX, packet, this, -102, true);
          this.unitsByPlayer[var6.ownerPlayer].addLast((byte) -119, (IntrusiveNode) (var6));
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ha.WD(" + tileX + ',' + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ',' + tileY + ')');
        }
    }

    final String describeBattlefield(int playerId, int obfuscationGuard) {
        int stackIn_21_0 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        MapTile var8 = null;
        int var9 = 0;
        gn var10 = null;
        Unit var11 = null;
        gn var12 = null;
        int var5Lifetime1;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var10 = new gn();
        var12 = var10;
        var10.a(new String[]{"seed: ", Integer.toString(this.randomSeed, 16)}, (byte) -116);
        var10.a(new String[]{"size: ", Integer.toString(this.mapSizeSetting), ", theme: ", Integer.toString(this.mapTheme)}, (byte) -103);
        if (this.kingBlackDragonSummoned) {
          var12.a((byte) 19, "kbd summoned");
        }
        if (playerId >= 0) {
          this.appendPlayerDiagnostics(playerId, var12, obfuscationGuard - 3148);
        }
        var4 = playerId;
        if (var4 < 0) {
          var4 = 0;
        }
        var5 = 0;
        if (obfuscationGuard != -248) {
          return (String) null;
        }
        scanLoop1: while (true) {
          if (var5 < this.mapWidth) {
            stackIn_21_0 = 0;
            if (var9 != 0) {
              break scanLoop1;
            }
            var6 = stackIn_21_0;
            while (this.mapHeight > var6) {
              var7 = var6 * this.mapWidth + var5;
              var8 = this.tiles[var7];
              this.a(var4, var8, (byte) -40, var6, var12, var5);
              var6++;
            }
            var5++;
            continue scanLoop1;
          }
          stackIn_21_0 = 0;
          break;
        }
        var5Lifetime1 = stackIn_21_0;
        scanLoop2: while (this.playerCount > var5Lifetime1) {
          var11 = (Unit) (this.unitsByPlayer[var5Lifetime1].first((byte) 124));
          while (true) {
            if (var11 != null) {
              this.a(false, var11, var10);
              var11 = (Unit) (this.unitsByPlayer[var5Lifetime1].next((byte) 123));
              if (var9 == 0) {
                continue;
              }
            } else {
              var5Lifetime1++;
            }
            break;
          }
          if (var9 == 0) {
            continue scanLoop2;
          }
          break;
        }
        return var12.c(1024);
    }

    private final void readSpecialEvent(PacketBuffer packet, byte obfuscationGuard) {
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int specialKind = 0;
        RuntimeException var3 = null;
        int playerAndMode = 0;
        int selectionMode = 0;
        int dispatchKind = 0;
        int var7 = 0;
        int tileX;
        int tileY;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          specialKind = packet.readUnsignedByte(obfuscationGuard ^ -84) & 31;
          if (specialKind == 13) {
            this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new KingBlackDragonEvent(packet.readUnsignedByte(0))));
            return;
          }
          if (specialKind == 14) {
            this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new ManaEvent(3, packet.readUnsignedByte(0), this.localPlayer)));
            return;
          }
          if (obfuscationGuard != -84) {
            this.registerUnit(-22, (Unit) null);
          }
          if (specialKind == 5) {
            playerAndMode = packet.readUnsignedByte(0);
            selectionMode = 15 & playerAndMode;
            if (selectionMode == 15) {
              selectionMode = -1;
            }
            this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new SpellCastEvent(TutorialLayout.readSpell(-1, packet, 4368051), selectionMode, playerAndMode >> 4)));
          }
          regionExit1: {
            regionExit2: {
              regionExit3: {
                regionExit4: {
                  regionExit5: {
                    regionExit6: {
                      boolean decompiledFrameRemainder0 = true;
                      tileX = packet.readUnsignedByte(0);
                      tileY = packet.readUnsignedByte(obfuscationGuard ^ -84);
                      dispatchKind = specialKind;
                      if ((dispatchKind != 1) &&
                        (decompiledFrameRemainder0 = (dispatchKind != 11))) {
                        if (17 == dispatchKind &&
                          var7 == 0) {
                          break regionExit6;
                        }
                        if (dispatchKind == 16) {
                          break regionExit5;
                        }
                        if (2 == dispatchKind &&
                          var7 == 0) {
                          break regionExit4;
                        }
                        if (dispatchKind == 7 &&
                          var7 == 0) {
                          break regionExit3;
                        }
                        if (dispatchKind == 8 &&
                          var7 == 0) {
                          break regionExit2;
                        }
                        if (15 != dispatchKind) {
                          return;
                        }
                        if (var7 == 0) {
                          break regionExit1;
                        }
                      }
                      if (decompiledFrameRemainder0) {
                        this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TelepopEvent(tileX, tileY)));
                        if (var7 == 0) {
                          return;
                        }
                      }
                      this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TeleportEvent(tileX, tileY, packet.readUnsignedShort((byte) -104), true)));
                      if (var7 == 0) {
                        return;
                      }
                    }
                    this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new TeleportEvent(tileX, tileY, packet.readUnsignedShort((byte) -104), false)));
                    if (var7 == 0) {
                      return;
                    }
                  }
                  this.readStoredUnitAt(tileX, -47, packet, tileY);
                  if (var7 == 0) {
                    return;
                  }
                }
                this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new DeathEvent(tileX, tileY)));
                if (var7 == 0) {
                  return;
                }
              }
              this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new DeployEvent(tileX, tileY, 0)));
              if (var7 == 0) {
                return;
              }
            }
            this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new DeployEvent(tileX, tileY, packet.readUnsignedByte(0))));
            if (var7 == 0) {
              return;
            }
          }
          this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new GrowthEvent(tileX, tileY, packet.readUnsignedByte(0), packet.readUnsignedByte(obfuscationGuard ^ -84), packet.readUnsignedByte(0), packet.readUnsignedByte(0))));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_49_0 = var3;
          stackIn_49_1 = new StringBuilder().append("ha.LC(");
          if (packet == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int h(int param0, int param1) {
        if (param1 != 0) {
          return -38;
        }
        if (!this.teamGame) {
          return -1;
        }
        return this.teams[this.playerTeamIndices[param0]].getPlayerCount(16648);
    }

    final void a(int param0, String param1, GameEvent param2) {
        String var4 = null;
        try {
          var4 = param2.describeEvent((byte) -8, false);
          if (param0 != 0) {
            this.field_D = -23;
          }
          this.j(7);
          var4 = param1 + "\n" + var4;
          this.pendingEvents.b(param0 ^ 98);
          Spell.a("Dropping conection: turn: " + this.turnNumber + ", player: " + this.currentPlayer + "\n" + var4, (byte) 40);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ha.JC(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(int param0, int param1) {
        if (!this.teamGame) {
          return -1;
        }
        if (param0 != -9650) {
          return 126;
        }
        return this.teams[param1].getPlayerCount(16648);
    }

    private final void readCombatEvent(PacketBuffer packet, int obfuscationGuard) {
        NodeDeque stackIn_5_0;
        int stackIn_5_1;
        CombatEvent stackIn_5_2;
        CombatEvent stackIn_5_3;
        int stackIn_5_4;
        int stackIn_5_5;
        int stackIn_5_6;
        int stackIn_5_7;
        int stackIn_5_8;
        int stackIn_5_9;
        int stackIn_5_10;
        CombatEvent stackIn_6_2 = null;
        CombatEvent stackIn_6_3 = null;
        boolean stackIn_6_11 = false;
        boolean stackIn_9_12 = false;
        int stackIn_11_13;
        int stackIn_11_14;
        boolean stackIn_12_15 = false;
        boolean stackIn_15_16;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        CombatEvent stackIn_6_2Lifetime1;
        CombatEvent stackIn_6_2Lifetime2;
        CombatEvent stackIn_6_2Lifetime3;
        CombatEvent stackIn_6_3Lifetime1;
        CombatEvent stackIn_6_3Lifetime2;
        CombatEvent stackIn_6_3Lifetime3;
        try {
          var3_int = packet.readUnsignedByte(0);
          var4 = packet.readUnsignedByte(0);
          var5 = packet.readUnsignedByte(0);
          var6 = packet.readUnsignedByte(~obfuscationGuard);
          var7 = packet.readUnsignedShort((byte) -104);
          var8 = var7 >> 8;
          var9 = 255 & var7;
          var8 = (var8 ^ 128) - 128;
          var9 = (var9 ^ 128) - 128;
          var10 = packet.readUnsignedByte(0);
          var11 = packet.readUnsignedByte(0);
          var12 = packet.readUnsignedByte(0);
          var13 = packet.readUnsignedByte(0);
          if (obfuscationGuard > ~(4 & var3_int)) {
            this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new ParasiteEvent(var5, var6, var8, var9, var10)));
            if (!ArmiesOfGielinor.obfuscationControl) {
              return;
            }
          }
          stackIn_5_0 = this.pendingEvents;
          stackIn_5_1 = -119;
          stackIn_5_2 = null;
          stackIn_5_3 = null;
          stackIn_5_4 = var4;
          stackIn_5_5 = var5;
          stackIn_5_6 = var6;
          stackIn_5_7 = var8;
          stackIn_5_8 = var9;
          stackIn_5_9 = var10;
          stackIn_5_10 = var11;
          if ((var3_int & 1) <= 0) {
            stackIn_6_2 = null;
            stackIn_6_3 = null;
            stackIn_6_11 = false;
          } else {
            stackIn_6_2 = null;
            stackIn_6_3 = null;
            stackIn_6_11 = true;
          }
          if ((var3_int & 2) <= 0) {
            stackIn_6_2Lifetime1 = null;
            stackIn_6_3Lifetime1 = null;
            stackIn_9_12 = false;
          } else {
            stackIn_6_2Lifetime1 = null;
            stackIn_6_3Lifetime1 = null;
            stackIn_9_12 = true;
          }
          stackIn_11_13 = 7 & var12;
          stackIn_11_14 = (var12 & 127) >> 4;
          if ((8 & var12) == 0) {
            stackIn_6_2Lifetime2 = null;
            stackIn_6_3Lifetime2 = null;
            stackIn_12_15 = false;
          } else {
            stackIn_6_2Lifetime2 = null;
            stackIn_6_3Lifetime2 = null;
            stackIn_12_15 = true;
          }
          if ((var12 & 128) == 0) {
            stackIn_6_2Lifetime3 = null;
            stackIn_6_3Lifetime3 = null;
            stackIn_15_16 = false;
          } else {
            stackIn_6_2Lifetime3 = null;
            stackIn_6_3Lifetime3 = null;
            stackIn_15_16 = true;
          }
          ((NodeDeque) (Object) stackIn_5_0).addLast((byte) stackIn_5_1, (IntrusiveNode) (new CombatEvent(stackIn_5_4, stackIn_5_5, stackIn_5_6, stackIn_5_7, stackIn_5_8, stackIn_5_9, stackIn_5_10, stackIn_6_11, stackIn_9_12, stackIn_11_13, stackIn_11_14, stackIn_12_15, stackIn_15_16, var13)));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("ha.ND(");
          if (packet == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final boolean d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (~eb.a((byte) -95, 85 & this.eliminatedPlayerMask) == ~(this.playerCount / this.teamCount)) {
          return false;
        }
        if (~eb.a((byte) -97, this.eliminatedPlayerMask & 170) == ~(this.playerCount / this.teamCount)) {
          return true;
        }
        var2 = this.i(0, -12710);
        if (param0 <= 68) {
          this.unitsByPlayer = (NodeDeque[]) null;
        }
        boolean decompiledFrameRemainder1 = true;
        var3 = this.i(1, -12710);
        if (var2 <= var3) {
          boolean decompiledFrameRemainder0 = true;
          if (var3 == var2) {
            boolean decompiledFrameCompleted0 = true;
            var4 = this.b((byte) 31, 0);
            var5 = this.b((byte) 31, 1);
            if (var5 >= var4) {
              if (~var4 == ~var5) {
                var6 = 0;
                var7 = 0;
                var8 = 0;
                while (true) {
                  if (this.playerCount > var8) {
                    var7 = var7 + this.playerMana[var8 + 1];
                    var6 = var6 + this.playerMana[var8];
                    var8 += 2;
                    if (var9 == 0) {
                      continue;
                    }
                  } else {
                    if (var7 < var6) {
                      return true;
                    }
                  }
                  if (var6 == var7) {
                    return true;
                  }
                  if (var9 == 0) {
                    break;
                  }
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                decompiledFrameRemainder0 = (var9 != 0);
                decompiledFrameRemainder1 = !(decompiledFrameRemainder0);
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              return true;
            }
          }
          if (decompiledFrameRemainder1) {
            return false;
          }
        }
        return true;
    }

    private final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 >= -126) {
            stackIn_3_0 = -8;
            return stackIn_3_0;
          }
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.playerCount <= var3_int))) {
            stackOut_6_0 = vr.a(11987, this.playerNames[var3_int], param0);
            stackIn_13_0 = stackOut_6_0 ? 1 : 0;
            stackIn_7_0 = stackOut_6_0;
            if (var4 == 0) {
              if (stackIn_7_0) {
                stackIn_10_0 = var3_int;
                return stackIn_10_0;
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_13_0 = -1;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ha.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final int d(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        boolean stackOut_4_0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var4 = 0;
        var5 = 0;
        if (param2 != 6) {
          return 58;
        }
        var6 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var6 >= this.playerCount))) {
          stackOut_4_0 = this.arePlayersAllied(var6, param2 ^ -16991, param0);
          stackIn_11_0 = stackOut_4_0 ? 1 : 0;
          stackIn_5_0 = stackOut_4_0;
          if (var7 == 0) {
            if (stackIn_5_0) {
              var4++;
              if (0 == (this.eliminatedPlayerMask & 1 << var6)) {
                var5++;
              }
            }
            var6++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_11_0 = 0;
        }
        if (stackIn_11_0 == var5) {
          return 0;
        }
        if (this.campaignMission == null) {
          return param1 * var4 / var5;
        }
        if (~this.campaignMission.playerSlot == ~param0) {
          param1 = (int)((float)param1 * this.campaignManaMultiplier);
        }
        return param1;
    }

    final void readLegacySnapshot(int obfuscationGuard, PacketBuffer packet) {
        boolean stackIn_10_1 = false;
        int stackIn_13_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_98_0;
        int stackIn_98_1;
        int stackIn_98_2;
        int stackIn_98_3;
        PacketBuffer stackIn_98_4;
        Object stackIn_98_5;
        int stackIn_98_6;
        boolean stackIn_99_7 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        MapTile var10_ref_ne = null;
        int var11 = 0;
        Unit var12 = null;
        int var13 = 0;
        int stackIn_94_0Lifetime1;
        int stackIn_94_1Lifetime1;
        int var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var7Lifetime2;
        int var9Lifetime2;
        int var11Lifetime2;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.randomSeed = packet.readInt(obfuscationGuard + 1);
          this.turnLimit = packet.readUnsignedShort((byte) -104);
          this.playerCoats = new CoatOfArms[this.playerCount];
          var3_int = 0;
          do {
            if (var3_int >= this.playerCount) {
              var3_int = packet.readUnsignedByte(obfuscationGuard ^ 0);
              break;
            }
            this.playerCoats[var3_int] = new CoatOfArms();
            EffectPresentation.readCoatOfArms(this.playerCoats[var3_int].parts, packet, false, this.playerCoats[var3_int].colourIndices);
            var3_int++;
          } while (var13 == 0);
          stackIn_10_1 = !((var3_int & 1) <= 0);
          this.kingBlackDragonSummoned = stackIn_10_1;
          this.mapTheme = (56 & var3_int) >> 3;
          this.mapSizeSetting = (6 & var3_int) >> 1;
          stackIn_13_0 = ((var3_int & 128) == 0) ? 0 : 1;
          var4 = stackIn_13_0;
          var5 = 0;
          if (var4 != 0) {
            var5 = packet.readUnsignedByte(0);
          }
          this.turnNumber = packet.readUnsignedByte(obfuscationGuard ^ 0);
          this.currentPlayer = packet.readUnsignedByte(obfuscationGuard + 0);
          this.l(obfuscationGuard + 0, 0);
          var6 = this.tiles.length - 1;
          scanLoop1: while (true) {
            if (var6 >= 0) {
              this.tiles[var6].clearCorpse(14);
              var6--;
              if (var13 == 0) {
                continue;
              }
            } else {
              if (this.localPlayer <= -1) {
                var6 = 0;
                while (this.playerCount > var6) {
                  this.playerTurnCounts[var6] = packet.readUnsignedShort((byte) -104);
                  var6++;
                  if (var13 != 0) {
                    break scanLoop1;
                  }
                }
                if (var13 == 0) {
                  break scanLoop1;
                }
              }
              this.godFavourLevels[this.localPlayer][6] = packet.readUnsignedByte(0);
            }
            var6 = 0;
            while (true) {
              if (this.chosenGods[this.localPlayer].length > var6) {
                var7 = packet.readUnsignedByte(obfuscationGuard ^ 0);
                this.chosenGods[this.localPlayer][var6] = var7 >> 4;
                stackIn_38_0 = ~this.chosenGods[this.localPlayer][var6];
                stackIn_38_1 = -8;
                if (var13 == 0) {
                  if (stackIn_38_0 <= stackIn_38_1) {
                    this.chosenGods[this.localPlayer][var6] = -1;
                  } else {
                    this.godFavourLevels[this.localPlayer][this.chosenGods[this.localPlayer][var6]] = rn.a(15, var7);
                    this.field_D = this.field_D + 1;
                    if (var6 == 2) {
                      this.field_Cb = true;
                    }
                  }
                  var6++;
                  continue;
                }
              } else {
                this.playerMana[this.localPlayer] = packet.readInt(1);
                this.playerTurnCounts[this.localPlayer] = packet.readUnsignedShort((byte) -104);
                this.field_Q = packet.readUnsignedByte(0);
                stackIn_38_0 = -1;
                stackIn_38_1 = ~this.field_Q;
              }
              boolean decompiledFrameCompleted0 = true;
              if (stackIn_38_0 != stackIn_38_1) {
                if (this.field_B == null) {
                  this.field_B = new int[this.playerCount][5];
                }
                var6 = 0;
                while (var6 < 5) {
                  var7Lifetime2 = packet.readUnsignedShort((byte) -104);
                  stackIn_50_0 = 65535;
                  stackIn_50_1 = var7Lifetime2;
                  if (var13 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_50_0 == stackIn_50_1) {
                    var7Lifetime2 = -1;
                  }
                  this.field_B[this.localPlayer][var6] = var7Lifetime2;
                  var6++;
                }
              }
              if (decompiledFrameCompleted0) {
                stackIn_50_0 = -1;
                stackIn_50_1 = ~BattleCharacter.field_i[this.field_Q];
              }
              if (stackIn_50_0 == stackIn_50_1) {
                break;
              }
              this.remainingRuneCap[this.localPlayer] = packet.readUnsignedShort((byte) -104);
              break;
            }
            break;
          }
          var6 = 0;
          do {
            if (var6 >= this.teamCount) {
              var6 = 0;
              break;
            }
            this.teamManaCollected[var6] = packet.readUnsignedShort((byte) -104);
            var6++;
          } while (var13 == 0);
          scanLoop2: while (true) {
            if (var6 < this.playerCount) {
              while (true) {
                stackIn_69_0 = ~this.unitsByPlayer[var6].b(false);
                if (var13 != 0) {
                  break scanLoop2;
                }
                if (stackIn_69_0 < -1) {
                  ((Unit) (this.unitsByPlayer[var6].first((byte) 121))).removeFromBattlefield(-98);
                  continue;
                }
                break;
              }
              var6++;
              continue scanLoop2;
            }
            var6 = packet.readUnsignedShort((byte) -104);
            stackIn_69_0 = 0;
            break;
          }
          var7Lifetime1 = stackIn_69_0;
          var8 = 0;
          scanLoop3: while (true) {
            if (var6 > var8) {
              stackIn_94_0 = ~(this.mapWidth * this.mapHeight);
              stackIn_94_1 = ~var7Lifetime1;
              if (var13 != 0) {
                if (stackIn_94_0 <= stackIn_94_1) {
                  break scanLoop3;
                }
                var9 = packet.readUnsignedByte(0);
                var10 = packet.readUnsignedByte(0);
                var11 = packet.readUnsignedByte(0);
                return;
              }
              if (stackIn_94_0 < stackIn_94_1) {
                var9Lifetime2 = packet.readUnsignedByte(0);
                if ((var9Lifetime2 & 128) != 0) {
                  var7Lifetime1 = var7Lifetime1 + (127 & var9Lifetime2);
                  continue;
                }
                var10_ref_ne = this.tiles[var7Lifetime1];
                if (0 >= (1 & var9Lifetime2)) {
                  var10_ref_ne.clearCorpse(14);
                }
                if (0 < (1 & var9Lifetime2) ||
                  var13 != 0) {
                  var10_ref_ne.a(obfuscationGuard + 63);
                }
                if ((var9Lifetime2 & 2) > 0) {
                  var10_ref_ne.terrainType = packet.readUnsignedByte(0);
                  var10_ref_ne.field_b = true;
                  if (var10_ref_ne.terrainType == 11) {
                    var11Lifetime2 = packet.readUnsignedByte(0);
                    var10_ref_ne.godId = var11Lifetime2 >> 4 & 15;
                    var10_ref_ne.godFavourLevel = var11Lifetime2 & 15;
                  }
                }
                if ((16 & var9Lifetime2) > 0) {
                  var10_ref_ne.ownerPlayer = packet.readUnsignedByte(0);
                }
                if ((var9Lifetime2 & 4) > 0) {
                  var10_ref_ne.captureStrength = packet.readUnsignedByte(0);
                }
                if ((64 & var9Lifetime2) > 0) {
                  var11Lifetime2 = packet.readUnsignedByte(0);
                  var10_ref_ne.setExplicitOwner(true, var11Lifetime2);
                }
                var7Lifetime1++;
                var8++;
                continue;
              }
            }
            var6 = packet.readUnsignedShort((byte) -104);
            var8 = obfuscationGuard;
            while (true) {
              stackIn_94_0Lifetime1 = ~var8;
              stackIn_94_1Lifetime1 = ~var6;
              if (stackIn_94_0Lifetime1 <= stackIn_94_1Lifetime1) {
                break;
              }
              var9Lifetime1 = packet.readUnsignedByte(0);
              var10Lifetime1 = packet.readUnsignedByte(0);
              var11Lifetime1 = packet.readUnsignedByte(0);
              if (var13 != 0) {
                return;
              }
              stackIn_98_0 = var11Lifetime1 & 127;
              stackIn_98_1 = var5;
              stackIn_98_2 = var10Lifetime1;
              stackIn_98_3 = var9Lifetime1;
              stackIn_98_4 = (PacketBuffer) (packet);
              stackIn_98_5 = this;
              stackIn_98_6 = -94;
              stackIn_99_7 = ((128 & var11Lifetime1) != 0);
              var12 = SummonEvent.readStoredUnit(stackIn_98_0, stackIn_98_1, stackIn_98_2, stackIn_98_3, stackIn_98_4, this, stackIn_98_6, stackIn_99_7);
              this.unitsByPlayer[var12.ownerPlayer].addLast((byte) -119, (IntrusiveNode) (var12));
              var8++;
            }
            break;
          }
          this.initializeMatchConditions(-29673);
          this.f(-2);
          this.collectedManaTarget = this.f((byte) -82);
          this.recountStructures(obfuscationGuard ^ 2);
          this.a(0, 0, obfuscationGuard + 0, -1);
          fl.a(this, -118);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_104_0 = var3;
          stackIn_104_1 = new StringBuilder().append("ha.UA(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(')').toString());
        }
    }

    private final void a(boolean param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = this.getSurvivingPlayerMask((byte) 78);
        var3 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var3 >= this.playerCount))) {
          stackIn_7_0 = 0;
          stackIn_7_1 = var2 & 1 << var3;
          if (var4 == 0) {
            if (stackIn_7_0 != stackIn_7_1) {
              this.b(var3, param0);
            }
            var3++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_7_0 = param0 ? 1 : 0;
          stackIn_7_1 = 1;
        }
        if (stackIn_7_0 != stackIn_7_1) {
          this.winnerCount = 57;
        }
        return;
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        if (param0 > -1 && -1 < param2 && param0 < this.mapWidth &&
          this.mapHeight > param2) {
          this.tiles[param0 + param2 * this.mapWidth].setExplicitOwner(true, param3);
        }
        if (param1) {
          this.field_kb = true;
        }
    }

    final void f(int param0, int param1, int param2, int param3) {
        Unit var5 = this.getUnitAt(param3, true, param0);
        if (var5 != null &&
          this.arePlayersAllied(var5.ownerPlayer, -16985, param1)) {
          var5.bonusStrength = 5;
        }
        if (param2 < 117) {
          this.field_Cb = true;
        }
    }

    final int g(int param0) {
        if (param0 == ~this.field_A) {
          return -1;
        }
        return 3 - this.field_A;
    }

    final int getSummonFailureFlags(int playerId, int obfuscationGuard, int unitType, int tileY, int tileX) {
        int var6;
        int[] var7;
        int var8;
        int var9;
        int var10;
        int[] var11;
        int[] var12;
        if (obfuscationGuard != 255) {
          this.appendPlayerDiagnostics(30, (gn) null, -50);
        }
        var6 = 0;
        var12 = this.getSummoningFavourAt(tileY, (byte) 118, tileX, playerId);
        var11 = var12;
        var7 = var11;
        var8 = bw.unitDefinitions[unitType][1];
        var9 = b.getUnitUnlockOrdinal(false, unitType);
        if (unitType != 74 &&
          unitType >= 8 &&
          0 == (1 << var9 & this.field_a[playerId][var8 + 1])) {
          return 4;
        }
        if (!this.f(bw.unitDefinitions[unitType][8], this.playerMana[playerId], 0)) {
          var6 = var6 | 1;
        }
        if (bw.unitDefinitions[unitType][1] == -1) {
          var10 = var12[6];
          if (ArmiesOfGielinor.obfuscationControl) {
            var10 = var7[bw.unitDefinitions[unitType][1]];
          }
        } else {
          var10 = var7[bw.unitDefinitions[unitType][1]];
        }
        if (!this.a(var10, true, bw.unitDefinitions[unitType][2])) {
          var6 = var6 | 2;
        }
        return var6;
    }

    final int e(int param0, int param1, int param2) {
        if (this.campaignMission != null) {
          if (uc.spellDefinitions[param2][4] == 4 &&
            0 != uc.spellDefinitions[param2][3]) {
            return -this.playerTurnCounts[param1] + 1;
          }
          return 0;
        }
        int var4 = -66 % ((param0 + 19) / 35);
        if (this.playerTurnCounts[param1] < uc.spellDefinitions[param2][1]) {
          return uc.spellDefinitions[param2][1] - this.playerTurnCounts[param1];
        }
        return 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        regionExit1: {
          boolean decompiledFrameCompleted0 = true;
          var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          if (param2 > param3) {
            var5 = 0;
            while (this.mapWidth > var5) {
              if (var11 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var6 = 0;
              while (var6 < this.mapHeight) {
                this.b(this.tiles[var6 * this.mapWidth + var5].teamEffectFlags, 12534, var6, var5);
                if (null != this.tiles[var5 + var6 * this.mapWidth].occupant) {
                  this.tiles[var5 + var6 * this.mapWidth].occupant.refreshTileEffects((byte) -17);
                }
                var6++;
              }
              var5++;
            }
          }
          if ((decompiledFrameCompleted0) &&
            (param2 <= param3 ||
            var11 != 0)) {
            var5Lifetime1 = param1 - param3;
            var6Lifetime1 = param3 + param1;
            var7 = param0 - param3;
            var8 = param0 + param3;
            if (var5Lifetime1 < 0) {
              var5Lifetime1 = 0;
            }
            if (0 > var7) {
              var7 = 0;
            }
            if (this.mapWidth <= var6Lifetime1) {
              var6Lifetime1 = -1 + this.mapWidth;
            }
            if (this.mapHeight <= var8) {
              var8 = this.mapHeight - 1;
            }
            var9 = var5Lifetime1;
            while (var6Lifetime1 >= var9) {
              if (var11 != 0) {
                break;
              }
              var10 = var7;
              while (var10 <= var8) {
                this.b(this.tiles[var10 * this.mapWidth + var9].teamEffectFlags, 12534, var10, var9);
                if (this.tiles[var9 + var10 * this.mapWidth].occupant != null) {
                  this.tiles[this.mapWidth * var10 + var9].occupant.refreshTileEffects((byte) 55);
                }
                var10++;
              }
              var9++;
            }
          }
        }
    }

    private final void applyPendingEvents(byte obfuscationGuard) {
        GameEvent var2 = null;
        int var3 = 0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        while (this.pendingEvents.b(false) > 0) {
          var2 = (GameEvent) (this.pendingEvents.a(0));
          var2.applyToBattlefield(this, -26661);
          if (var3 != 0) {
            return;
          }
        }
        if (obfuscationGuard == 108) {
        }
    }

    private final int[] getEliminationRanks(int obfuscationGuard) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_16_0 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = new int[this.playerCount];
        var3 = 0;
        if (obfuscationGuard != 10326) {
          this.field_Ab = false;
        }
        do {
          if (var3 >= this.playerCount) {
            var3 = 0;
            break;
          }
          var2[var3] = this.playerCount;
          var3++;
        } while (var5 == 0);
        while (this.playerCount > var3) {
          stackIn_16_0 = this.eliminationOrder;
          if (var5 != 0) {
            return stackIn_16_0;
          }
          var4 = stackIn_16_0[var3];
          if (var4 != -1 ||
            var5 != 0) {
            var2[var4] = var3;
            var3++;
            continue;
          }
          break;
        }
        return var2;
    }

    final int a(int param0, int param1, int param2, byte param3) {
        int discarded$0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_51_0 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        MapTile var11 = null;
        MapTile var12 = null;
        MapTile var13 = null;
        MapTile var14 = null;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param3 > -32) {
          discarded$0 = this.a((String) null, 89);
        }
        var5 = 1;
        while (var5 != 0) {
          var5 = 0;
          stackIn_51_0 = -this.field_ab;
          if (var10 != 0) {
            return stackIn_51_0;
          }
          var6 = stackIn_51_0;
          scanLoop1: while (true) {
            stackIn_7_0 = var6;
            stackIn_7_1 = this.field_ab;
            if (stackIn_7_0 < stackIn_7_1) {
              var7 = param2 + var6;
              var8 = param0 + this.field_ab;
              stackIn_7_0 = var7;
              stackIn_7_1 = -1;
              if (stackIn_7_0 > stackIn_7_1 &&
                this.mapWidth > var7 &&
                var8 > -1 &&
                this.mapHeight > var8) {
                var5 = 1;
                var11 = this.tiles[var7 + this.mapWidth * var8];
                if (this.arePlayersAllied(var11.ownerPlayer, -16985, param1) &&
                  var11.occupant == null &&
                  !var11.field_l &&
                  var11.isStructure(false)) {
                  return var7 + var8 * this.mapWidth;
                }
              }
              var7Lifetime1 = this.field_ab + param2;
              var8Lifetime1 = var6 + param0;
              if (var7Lifetime1 > -1 &&
                this.mapWidth > var7Lifetime1 &&
                -1 < var8Lifetime1 &&
                var8Lifetime1 < this.mapHeight) {
                var5 = 1;
                var12 = this.tiles[var8Lifetime1 * this.mapWidth + var7Lifetime1];
                if (this.arePlayersAllied(var12.ownerPlayer, -16985, param1) &&
                  var12.occupant == null &&
                  !var12.field_l &&
                  var12.isStructure(false)) {
                  return this.mapWidth * var8Lifetime1 + var7Lifetime1;
                }
              }
              var7Lifetime2 = -var6 + param2;
              var8Lifetime2 = param0 - this.field_ab;
              if (var7Lifetime2 > -1 &&
                this.mapWidth > var7Lifetime2 &&
                var8Lifetime2 > -1 &&
                var8Lifetime2 < this.mapHeight) {
                var5 = 1;
                var13 = this.tiles[var8Lifetime2 * this.mapWidth + var7Lifetime2];
                if (this.arePlayersAllied(var13.ownerPlayer, -16985, param1) &&
                  null == var13.occupant &&
                  !var13.field_l &&
                  var13.isStructure(false)) {
                  return var7Lifetime2 + var8Lifetime2 * this.mapWidth;
                }
              }
              var7Lifetime3 = param2 - this.field_ab;
              var8Lifetime3 = -var6 + param0;
              if (var7Lifetime3 > -1 &&
                this.mapWidth > var7Lifetime3 &&
                var8Lifetime3 > -1 &&
                var8Lifetime3 < this.mapHeight) {
                var5 = 1;
                var14 = this.tiles[var7Lifetime3 + this.mapWidth * var8Lifetime3];
                if (this.arePlayersAllied(var14.ownerPlayer, -16985, param1) &&
                  var14.occupant == null &&
                  !var14.field_l &&
                  var14.isStructure(false)) {
                  return var8Lifetime3 * this.mapWidth + var7Lifetime3;
                }
              }
              var6++;
              continue scanLoop1;
            }
            break;
          }
          this.field_ab = this.field_ab + 1;
        }
        return -1;
    }

    final void writeLegacySnapshot(PacketBuffer packet, int obfuscationGuard, int playerId) {
        int stackIn_9_0 = 0;
        int stackIn_16_2 = 0;
        PacketBuffer stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_48_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_67_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_113_0 = 0;
        Unit stackIn_129_0 = null;
        Unit stackIn_130_0 = null;
        Unit stackIn_134_0 = null;
        Unit stackIn_134_1 = null;
        PacketBuffer stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        int stackIn_140_2 = 0;
        RuntimeException stackIn_148_0 = null;
        StringBuilder stackIn_148_1 = null;
        String stackIn_149_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        MapTile var9_ref_ne = null;
        int var9 = 0;
        Unit var10 = null;
        int var11 = 0;
        int var12 = 0;
        MapTile var13 = null;
        Unit stackIn_129_0Lifetime1;
        Unit stackIn_130_0Lifetime1;
        Unit stackIn_134_0Lifetime1;
        Unit stackIn_134_1Lifetime1;
        Unit var10Lifetime1;
        int stackIn_99_0Lifetime1;
        int stackIn_99_1Lifetime1;
        int var5Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = 0;
          packet.writeInt((byte) -58, this.randomSeed);
          packet.writeShort(true, this.turnLimit);
          var5 = 0;
          scanLoop1: while (true) {
            if (var5 < this.playerCount) {
              AiInfluenceMap.writeCoatOfArms(this.playerCoats[var5].parts, (byte) 100, packet, this.playerCoats[var5].colourIndices);
              var5++;
              if (var12 == 0) {
                continue;
              }
            } else {
              if (!this.kingBlackDragonSummoned) {
                stackIn_9_0 = 0;
                break scanLoop1;
              }
            }
            stackIn_9_0 = 1;
            break;
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder0 = true;
          var5Lifetime1 = stackIn_9_0 | this.mapSizeSetting << 1 | this.mapTheme << 3 | 128;
          packet.writeByte(1, var5Lifetime1);
          packet.writeByte(obfuscationGuard + 25772, 1);
          packet.writeByte(1, this.turnNumber);
          packet.writeByte(1, this.currentPlayer);
          if (playerId > -1) {
            packet.writeByte(1, this.godFavourLevels[playerId][6]);
            var6 = 0;
            scanLoop2: while (true) {
              if (var6 < this.chosenGods[playerId].length) {
                stackIn_21_0 = (PacketBuffer) (packet);
                stackIn_21_1 = obfuscationGuard + 25772;
                stackIn_21_2 = 0;
                if (var12 == 0) {
                  if (stackIn_21_2 <= this.chosenGods[playerId][var6]) {
                    stackIn_16_2 = this.godFavourLevels[playerId][this.chosenGods[playerId][var6]];
                  } else {
                    stackIn_16_2 = 0;
                  }
                  ((PacketBuffer) (Object) stackIn_21_0).writeByte(stackIn_21_1, stackIn_16_2 | this.chosenGods[playerId][var6] << 4);
                  var6++;
                  continue;
                }
              } else {
                if (this.playerMana[playerId] < 1) {
                  packet.writeInt((byte) -104, 0);
                  if (var12 == 0) {
                    break scanLoop2;
                  }
                }
                stackIn_21_0 = (PacketBuffer) (packet);
                stackIn_21_1 = -107;
                stackIn_21_2 = this.playerMana[playerId];
              }
              ((PacketBuffer) (Object) stackIn_21_0).writeInt((byte) stackIn_21_1, stackIn_21_2);
              break;
            }
            boolean decompiledFrameCompleted1 = true;
            packet.writeShort(true, this.playerTurnCounts[playerId]);
            packet.writeByte(1, this.field_Q);
            if (this.field_Q != 0) {
              var6 = 0;
              while (var6 < 5) {
                packet.writeShort(true, this.field_B[playerId][var6]);
                var6++;
                if (var12 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameCompleted1) &&
              (decompiledFrameRemainder0 = (BattleCharacter.field_i[this.field_Q] != 0))) {
              packet.writeShort(true, this.remainingRuneCap[playerId]);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (!(playerId > -1) ||
            var12 != 0)) {
            var6 = 0;
            while (var6 < this.playerCount) {
              packet.writeShort(true, this.playerTurnCounts[var6]);
              var6++;
              if (var12 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            var6 = 0;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6 >= this.teamCount))) {
            stackIn_48_0 = -2;
            if (var12 == 0) {
              if (stackIn_48_0 < ~this.teamManaCollected[var6]) {
                packet.writeShort(true, 0);
              } else {
                packet.writeShort(true, this.teamManaCollected[var6]);
              }
              var6++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var6 = 0;
            stackIn_48_0 = 0;
          }
          var7 = stackIn_48_0;
          while (true) {
            stackIn_50_0 = this.mapWidth;
            stackIn_50_1 = var7;
            if (stackIn_50_0 > stackIn_50_1) {
              stackIn_67_0 = 0;
              if (var12 == 0) {
                var8 = stackIn_67_0;
                while (this.mapWidth > var8) {
                  var9_ref_ne = this.tiles[var7 + this.mapWidth * var8];
                  stackIn_50_0 = 0;
                  stackIn_50_1 = ~var9_ref_ne.ownerPlayer;
                  if (stackIn_50_0 > stackIn_50_1 ||
                    var9_ref_ne.field_b ||
                    null != var9_ref_ne.occupant &&
                    var9_ref_ne.l(obfuscationGuard ^ 25770) ||
                    (var9_ref_ne.hasCorpse(67) ||
                    var9_ref_ne.hasExplicitOwner((byte) -79))) {
                    var6++;
                  }
                  var8++;
                }
                var7++;
                continue;
              }
            } else {
              stackIn_67_0 = obfuscationGuard;
            }
            if (stackIn_67_0 != -25771) {
              this.a(89, (String) null, (GameEvent) null);
            }
            if (var4_int != 0) {
              var6 = this.mapHeight * this.mapWidth;
            }
            packet.writeShort(true, var6);
            var7 = 0;
            var6 = 0;
            var8Lifetime1 = 0;
            while (true) {
              if (var8Lifetime1 >= this.mapHeight * this.mapWidth) {
                var8Lifetime1 = playerId;
                stackIn_113_0 = 0;
                break;
              }
              stackIn_113_0 = var4_int;
              if (var12 == 0) {
                stackIn_78_0 = (stackIn_113_0 == 0) ? 0 : 2;
                var9 = stackIn_78_0;
                var13 = this.tiles[var8Lifetime1];
                if (var13.hasCorpse(obfuscationGuard ^ 25807)) {
                  var9 = var9 | 1;
                }
                if (var13.field_b) {
                  var9 = var9 | 2;
                }
                if (var13.ownerPlayer > -1) {
                  var9 = var9 | 16;
                }
                if (null != var13.occupant &&
                  var13.l(-1)) {
                  var9 = var9 | 4;
                }
                if (var13.hasExplicitOwner((byte) -79)) {
                  var9 = var9 | 64;
                }
                if (var9 > 0) {
                  while (true) {
                    if (var8Lifetime1 > var7) {
                      stackIn_99_0 = var8Lifetime1 - var7;
                      stackIn_99_1 = 127;
                      if (stackIn_99_0 <= stackIn_99_1) {
                        stackIn_97_0 = -var7 + var8Lifetime1;
                      } else {
                        stackIn_97_0 = 127;
                      }
                      var11 = stackIn_97_0;
                      var7 = var7 + var11;
                      packet.writeByte(1, var11 | 128);
                      continue;
                    }
                    packet.writeByte(1, var9);
                    stackIn_99_0Lifetime1 = 0;
                    stackIn_99_1Lifetime1 = var9 & 2;
                    if (stackIn_99_0Lifetime1 < stackIn_99_1Lifetime1) {
                      packet.writeByte(1, var13.terrainType);
                      if (var13.terrainType == 11) {
                        packet.writeByte(1, var13.godId << 4 | var13.godFavourLevel);
                      }
                    }
                    if ((var9 & 16) > 0) {
                      packet.writeByte(1, var13.ownerPlayer);
                    }
                    if ((var9 & 8) <= 0) {
                    }
                    if ((4 & var9) > 0) {
                      packet.writeByte(1, var13.captureStrength);
                    }
                    var7++;
                    if (0 >= (var9 & 64)) {
                      break;
                    }
                    packet.writeByte(obfuscationGuard + 25772, var13.ownerPlayer);
                    break;
                  }
                }
                var8Lifetime1++;
                continue;
              }
              break;
            }
            var9Lifetime1 = stackIn_113_0;
            scanLoop3: while (true) {
              if (var9Lifetime1 < this.playerCount) {
                stackIn_129_0 = (Unit) (this.unitsByPlayer[var9Lifetime1].first((byte) 119));
                if (var12 == 0) {
                  var10 = stackIn_129_0;
                  while (var10 != null) {
                    stackIn_134_0 = var10;
                    stackIn_134_1 = this.tiles[var10.tileX + var10.tileY * this.mapWidth].occupant;
                    if (stackIn_134_0 == stackIn_134_1 ||
                      ~var8Lifetime1 == ~var9Lifetime1) {
                      var6++;
                    }
                    var10 = (Unit) (this.unitsByPlayer[var9Lifetime1].next((byte) 123));
                  }
                  var9Lifetime1++;
                  continue;
                } else {
                  while (true) {
                    var10 = stackIn_129_0;
                    while (var10 != null) {
                      stackIn_130_0 = this.tiles[var10.tileX + this.mapWidth * var10.tileY].occupant;
                      var10 = stackIn_130_0;
                    }
                    var9Lifetime1++;
                    break scanLoop3;
                  }
                }
              }
              packet.writeShort(true, var6);
              var9Lifetime1 = 0;
              while (var9Lifetime1 < this.playerCount) {
                if (var12 != 0) {
                  break;
                }
                stackIn_129_0Lifetime1 = (Unit) (this.unitsByPlayer[var9Lifetime1].first((byte) 114));
                var10Lifetime1 = stackIn_129_0Lifetime1;
                while (var10Lifetime1 != null) {
                  stackIn_130_0Lifetime1 = this.tiles[var10Lifetime1.tileX + this.mapWidth * var10Lifetime1.tileY].occupant;
                  stackIn_134_0Lifetime1 = stackIn_130_0Lifetime1;
                  stackIn_134_1Lifetime1 = var10Lifetime1;
                  if (stackIn_134_0Lifetime1 == stackIn_134_1Lifetime1 ||
                    ~var8Lifetime1 == ~var9Lifetime1) {
                    packet.writeByte(1, var10Lifetime1.tileX);
                    packet.writeByte(1, var10Lifetime1.tileY);
                    stackIn_139_0 = (PacketBuffer) (packet);
                    stackIn_139_1 = obfuscationGuard + 25772;
                    if (var10Lifetime1 == this.tiles[this.mapWidth * var10Lifetime1.tileY + var10Lifetime1.tileX].occupant) {
                      stackIn_140_2 = 0;
                    } else {
                      stackIn_140_2 = 128;
                    }
                    ((PacketBuffer) (Object) stackIn_139_0).writeByte(stackIn_139_1, stackIn_140_2 | var10Lifetime1.unitType);
                    CampaignRewardPreview.a(29712, var10Lifetime1, packet);
                  }
                  var10Lifetime1 = (Unit) (this.unitsByPlayer[var9Lifetime1].next((byte) 123));
                }
                var9Lifetime1++;
              }
              break;
            }
            this.recountStructures(obfuscationGuard + 25773);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_148_0 = var4;
          stackIn_148_1 = new StringBuilder().append("ha.TD(");
          if (packet == null) {
            stackIn_149_2 = "null";
          } else {
            stackIn_149_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_148_0), ((StringBuilder) (Object) stackIn_148_1).append(stackIn_149_2).append(',').append(obfuscationGuard).append(',').append(playerId).append(')').toString());
        }
    }

    final void applyMatchOutcome(int winnerCount, boolean outcomeFlag, int[] rankedParticipants) {
        RuntimeException runtimeException = null;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.winnerCount = winnerCount;
          if (winnerCount == 1) {
            this.currentPlayer = rankedParticipants[0];
          }
          if (winnerCount != 1 ||
            ArmiesOfGielinor.obfuscationControl) {
            this.currentPlayer = -1;
          }
          stackIn_7_1 = (outcomeFlag);
          this.field_X = stackIn_7_1;
          this.rankedParticipants = rankedParticipants;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("ha.HB(").append(winnerCount).append(',').append(outcomeFlag).append(',');
          if (rankedParticipants == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final GameEvent b(boolean param0) {
        if (0 == this.pendingEvents.b(param0)) {
          return null;
        }
        GameEvent var2 = (GameEvent) (this.pendingEvents.first((byte) 118));
        if (var2 == null) {
          return null;
        }
        return var2;
    }

    final void a(byte param0, int param1, int param2, MapTile[] param3) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_45_0 = 0;
        Unit stackIn_53_0;
        Unit stackIn_53_1;
        int stackIn_53_2;
        int stackIn_53_3;
        int stackIn_53_4;
        int stackIn_53_5;
        int stackIn_53_6;
        int stackIn_53_7;
        Unit stackIn_54_0 = null;
        Unit stackIn_54_1 = null;
        int stackIn_54_8 = 0;
        int stackIn_91_0 = 0;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Unit var9_ref_jd = null;
        int var9 = 0;
        Unit var10_ref_jd = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Unit var17 = null;
        PacketBuffer var18 = null;
        Spell var19 = null;
        int var20 = 0;
        MapTile var21 = null;
        Unit var22 = null;
        NodeDeque var23 = null;
        NodeIterator var24 = null;
        MapTile var25 = null;
        Unit var26 = null;
        int[] var30 = null;
        int var6Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var20 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param3 == null) {
            return;
          }
          var5_int = param1 * param2;
          if (param3.length != var5_int) {
            return;
          }
          this.field_j = new ul(this, param3, param1, param2);
          this.tiles = param3;
          this.mapHeight = param2;
          this.mapWidth = param1;
          var6 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.unitsByPlayer.length <= var6))) {
            var23 = this.unitsByPlayer[var6];
            if (var20 == 0) {
              if (var23 != null &&
                var23.b(false) != 0) {
                var24 = new NodeIterator(var23);
                var9_ref_jd = (Unit) (var24.first(50));
                while (var9_ref_jd != null) {
                  var10_ref_jd = (Unit) (var24.next(50));
                  var9_ref_jd.unlink(70);
                  var9_ref_jd = var10_ref_jd;
                }
              }
              var6++;
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (param0 >= -69)) {
            this.a(83, -46, -45, (byte) -10);
          }
          var6Lifetime1 = 0;
          while (var6Lifetime1 < this.tiles.length) {
            var21 = this.tiles[var6Lifetime1];
            var25 = var21;
            if (var20 != 0) {
              return;
            }
            boolean decompiledFrameRemainder3 = true;
            if (var25 != null) {
              var22 = var25.occupant;
              var26 = var22;
              if (var26 != null) {
                var9 = var26.ownerPlayer;
                var10 = var26.tileX;
                var11 = var26.tileY;
                var12 = var26.unitType;
                var21.occupant = null;
                var30 = bw.unitDefinitions[var12];
                decompiledFrameRemainder3 = !(var9 < 0);
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder3 = !(this.playerCount <= var9))) {
                  if (0 != var12) {
                    stackIn_34_0 = var30[4];
                  } else {
                    stackIn_34_0 = 10;
                  }
                  var14 = stackIn_34_0;
                  if (0 != var12) {
                    stackIn_37_0 = var30[4];
                  } else {
                    stackIn_37_0 = 10;
                  }
                  var15 = stackIn_37_0;
                  if ((16 & var26.movementFlags) != 0) {
                    var15 = var26.strength;
                    if (var14 < var15) {
                      var14 = var15;
                    }
                  }
                  stackIn_45_0 = (75 != var12) ? 0 : 1;
                  var16 = stackIn_45_0;
                  if (var16 != 0) {
                    var12 = 34;
                  }
                  if (var12 == 4 &&
                    this.mapTheme == 2) {
                    var12 = 81;
                  }
                  stackIn_53_0 = null;
                  stackIn_53_1 = null;
                  stackIn_53_2 = var10;
                  stackIn_53_3 = var11;
                  stackIn_53_4 = var12;
                  stackIn_53_5 = var9;
                  stackIn_53_6 = var14;
                  stackIn_53_7 = var15;
                  if (var12 != 0) {
                    stackIn_54_0 = null;
                    stackIn_54_1 = null;
                    stackIn_54_8 = 0;
                  } else {
                    stackIn_54_0 = null;
                    stackIn_54_1 = null;
                    stackIn_54_8 = 8;
                  }
                  var17 = new Unit(stackIn_53_2, stackIn_53_3, stackIn_53_4, stackIn_53_5, stackIn_53_6, stackIn_53_7, stackIn_54_8 | 1, 0, 0, this, 0, 0, -1, false, 0);
                  if (var17.p(-43)) {
                    this.a(var11, var10, 0, 3);
                  }
                  if (var16 != 0) {
                    var17.z(10);
                    var17.packedFlag8 = true;
                  }
                  var17.objectiveId = var26.objectiveId;
                  var17.movementFlags = var26.movementFlags;
                  var17.tag = var26.tag;
                  if (var26.displayName != null) {
                    var17.displayName = var26.displayName;
                  }
                  if (var26.hasMovementFlag1(false) &&
                    this.campaignMission != null) {
                    this.field_V = false;
                  }
                  if (var26.tankId >= 0) {
                    if (uc.spellDefinitions[var22.tankId][4] == 5) {
                      throw new IllegalStateException("");
                    }
                    var18 = new PacketBuffer(4);
                    var18.writeShort(true, var26.tankId);
                    var18.writeByte(1, var26.tileX);
                    var18.writeByte(1, var26.tileY);
                    var18.position = 0;
                    var19 = TutorialLayout.readSpell(var26.ownerPlayer, var18, 4368051);
                    if (var19 != null) {
                      var19.applyEffect(var26.ownerPlayer, this, 26123);
                    }
                  }
                  var21.occupant = var17;
                  this.unitsByPlayer[var9].addLast((byte) -119, (IntrusiveNode) (var17));
                }
              }
              if ((decompiledFrameRemainder3) &&
                (var25.ownerPlayer > -1)) {
                boolean decompiledFrameRemainder1 = true;
                boolean decompiledFrameRemainder2 = true;
                boolean decompiledFrameRemainder0 = true;
                var10Lifetime1 = var25.terrainType;
                if (var10Lifetime1 != 11 ||
                  var20 != 0) {
                  if ((7 != var10Lifetime1) &&
                    (decompiledFrameRemainder0 = (var10Lifetime1 != 14 ||
                    var20 != 0)) &&
                    (decompiledFrameRemainder0 = (var10Lifetime1 != 9 ||
                    var20 != 0))) {
                    decompiledFrameRemainder1 = (var10Lifetime1 == 8);
                    decompiledFrameRemainder2 = !(decompiledFrameRemainder1);
                  }
                } else {
                  if (this.campaignMission != null &&
                    ~this.campaignMission.playerSlot != ~var25.ownerPlayer) {
                    stackIn_91_0 = 1;
                  } else {
                    stackIn_91_0 = 0;
                  }
                  var9Lifetime1 = stackIn_91_0;
                  if (var9Lifetime1 != 0) {
                    var21.godFavourLevel = this.godFavourLevels[var21.ownerPlayer][var21.godId];
                  }
                }
                if ((decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder0)) {
                  dupTemp$0 = this.teamStructureCounts[this.getPlayerTeamIndex(var21.ownerPlayer, -1)];
                  dupTemp$0[0] = dupTemp$0[0] + 1;
                  decompiledFrameRemainder3 = false;
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1)) {
                  dupTemp$1 = this.teamStructureCounts[this.getPlayerTeamIndex(var21.ownerPlayer, -1)];
                  dupTemp$1[1] = dupTemp$1[1] + 1;
                  decompiledFrameRemainder3 = false;
                }
                if ((decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder1)) {
                  dupTemp$2 = this.teamStructureCounts[this.getPlayerTeamIndex(var21.ownerPlayer, -1)];
                  dupTemp$2[2] = dupTemp$2[2] + 1;
                  decompiledFrameRemainder3 = false;
                }
                if ((decompiledFrameRemainder3) &&
                  (!var25.hasModifierFlag4((byte) -122))) {
                  var25.ownerPlayer = -1;
                }
              }
            }
            var6Lifetime1++;
          }
          this.initializeMatchConditions(-29673);
          this.f(-2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_106_0 = var5;
          stackIn_106_1 = new StringBuilder().append("ha.OB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(')').toString());
        }
    }

    private final void a(int param0, MapTile param1, byte param2, int param3, gn param4, int param5) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (!this.a(param0, param1, param2 ^ -88)) {
            return;
          }
          if (!param1.field_b &&
            !param1.hasCorpse(param2 - 35) &&
            !param1.hasExplicitOwner((byte) -79) &&
            -1 == param1.ownerPlayer) {
            return;
          }
          param4.a(new String[]{"cell at ", TutorialController.formatCoordinatePair(param5, 0, param3), ": "}, (byte) -95);
          param4.a(0, 2);
          if (param1.field_b) {
            param4.a(new String[]{"changed type: ", Integer.toString(param1.terrainType)}, (byte) -106);
          }
          if (param1.hasCorpse(125)) {
            param4.a((byte) 19, "bones");
          }
          if (param1.hasExplicitOwner((byte) -79)) {
            param4.a(new String[]{"fort: owner: ", this.e(param1.getExplicitOwner((byte) -54), -1)}, (byte) -57);
          }
          if (param1.ownerPlayer != -1) {
            param4.a(new String[]{"owner: ", this.e(param1.ownerPlayer, param2 ^ 39)}, (byte) -93);
          }
          param4.a(0, -2);
          if (param2 != -40) {
            this.readMoveEvent((byte) -3, (PacketBuffer) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_22_0 = var7;
          stackIn_22_1 = new StringBuilder().append("ha.FC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param5).append(')').toString());
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != -2) {
          this.field_d = (int[]) null;
        }
        this.field_s[1] = 0;
        this.field_s[2] = 0;
        this.field_s[0] = 0;
        if (null == this.tiles) {
          return;
        }
        var2 = 0;
        while (var2 < this.tiles.length) {
          var3 = this.tiles[var2].terrainType;
          if (var4 == 0) {
            switch ((var4 == 0
              || var3 == 7
              || var3 == 8
              ) ? var3 : -1) {
              case 7:
                this.field_s[0] = this.field_s[0] + 1;
                {
                  break;
                }
              case 14:
              case 9:
                this.field_s[1] = this.field_s[1] + 1;
                {
                  break;
                }
              case 8:
                this.field_s[2] = this.field_s[2] + 1;
              default:
                break;
            }
            var2++;
            continue;
          }
          break;
        }
    }

    final boolean canSummonUnitAt(int tileY, int obfuscationGuard, int unitType, int tileX, int playerId) {
        int[] var6;
        int var7;
        int var8;
        int var9;
        int[] var10;
        int[] var11;
        int[] var12;
        int[] var10Lifetime1;
        int[] var10Lifetime1Lifetime1;
        var12 = this.getSummoningFavourAt(tileY, (byte) 37, tileX, playerId);
        var11 = var12;
        var10 = var11;
        var6 = var10;
        var7 = bw.unitDefinitions[unitType][1];
        var8 = b.getUnitUnlockOrdinal(false, unitType);
        if (unitType != 74 &&
          unitType >= 8 &&
          0 == (this.field_a[playerId][1 + var7] & 1 << var8)) {
          return false;
        }
        if (this.f(bw.unitDefinitions[unitType][8], this.playerMana[playerId], 0)) {
          var10Lifetime1 = var6;
          if (-1 == bw.unitDefinitions[unitType][1]) {
            var9 = var12[6];
            if (ArmiesOfGielinor.obfuscationControl) {
              var10Lifetime1Lifetime1 = var6;
              var9 = var10Lifetime1Lifetime1[bw.unitDefinitions[unitType][1]];
            }
          } else {
            var10Lifetime1Lifetime1 = var6;
            var9 = var10Lifetime1Lifetime1[bw.unitDefinitions[unitType][1]];
          }
          if (this.a(var9, true, bw.unitDefinitions[unitType][2])) {
            return true;
          }
        }
        if (obfuscationGuard == -26813) {
          return false;
        }
        this.collectedManaTarget = 58;
        return false;
    }

    private final int b(byte param0, int param1) {
        if (param0 != 31) {
          return -126;
        }
        return this.teamStructureCounts[param1][0] * 10 - (-(5 * this.teamStructureCounts[param1][1]) - 2 * this.teamStructureCounts[param1][2]);
    }

    private final boolean a(int param0, MapTile param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 94 % ((-56 - param2) / 50);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("ha.TB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(Unit param0, boolean param1, int param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 14336) {
            stackIn_4_0 = SpellCastEvent.a(this.mapWidth, this.tiles, param3, param4, param6, this.mapHeight, this.getPlayerTeamIndex(param6, -1), param0, param5, param1, true);
            return stackIn_4_0;
          }
          stackIn_2_0 = 112;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("ha.HC(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void appendSnapshotChunk(int chunkLength, PacketBuffer packet, byte obfuscationGuard) {
        try {
          if (obfuscationGuard > -71) {
            this.playerCount = 26;
          }
          if (this.snapshotBuffer == null) {
            chunkLength -= 2;
            this.snapshotBuffer = new PacketBuffer(packet.readUnsignedShort((byte) -104));
          }
          packet.readBytes(0, chunkLength, this.snapshotBuffer.position, this.snapshotBuffer.payload);
          this.snapshotBuffer.position = this.snapshotBuffer.position + chunkLength;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ha.AC(" + chunkLength + ',' + (packet != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final int getTileEffects(int obfuscationGuard, int tileY, int tileX, int playerId) {
        int var5 = -1;
        if (playerId >= 0) {
          var5 = this.getPlayerTeamIndex(playerId, obfuscationGuard ^ -32);
        }
        if (obfuscationGuard != 31) {
          this.c(-23, -102);
        }
        return this.tiles[tileX + this.mapWidth * tileY].getEffectsForPlayer((byte) 97, playerId, var5);
    }

    private final void readSummonEvent(PacketBuffer packet, boolean obfuscationGuard) {
        int unitType = 0;
        int ownerAndBonus = 0;
        int tileX = 0;
        int tileY = 0;
        int strengthBonus = 0;
        try {
          packet.readUnsignedByte(0);
          if (!obfuscationGuard) {
            this.f(-120);
          }
          unitType = packet.readUnsignedByte(0);
          ownerAndBonus = packet.readUnsignedByte(0);
          tileX = packet.readUnsignedByte(0);
          tileY = packet.readUnsignedByte(0);
          strengthBonus = 31 & ownerAndBonus;
          strengthBonus = (16 ^ strengthBonus) - 16;
          this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new SummonEvent(unitType, tileX, tileY, strengthBonus, ownerAndBonus >> 5)));
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "ha.CB(" + (packet != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    private final int b(int param0, Unit param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param1.ownerPlayer;
          if (param1.poisoned) {
            var3_int = var3_int ^ 5637;
          }
          if (param1.packedFlag8) {
            var3_int = var3_int ^ 757314;
          }
          var3_int = var3_int ^ 12643 * param1.attacksRemaining;
          if (param1.movementSpent) {
            var3_int = var3_int ^ 76756163;
          }
          if (param1.packedFlag512) {
            var3_int = var3_int ^ 847523;
          }
          var3_int = var3_int ^ 38 * param1.tileX;
          var3_int = var3_int ^ param1.tileY * 391;
          var3_int = var3_int ^ param1.bonusStrength * 874;
          var3_int = var3_int ^ 23874 * param1.unitType;
          var3_int = var3_int ^ param1.strength * 584668;
          var3_int = var3_int ^ 445235 * param1.maximumStrength;
          if (param0 >= -6) {
            this.field_rb = (int[]) null;
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ha.TC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void e(int param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        if (param0 != 14) {
          discarded$0 = this.a(-18, (MapTile) null, 8);
        }
        Unit var5 = this.getUnitAt(param3, true, param1);
        if (var5 != null &&
          this.arePlayersAllied(var5.ownerPlayer, -16985, param2)) {
          var5.poisoned = false;
        }
    }

    final int a(byte param0, int param1, int param2) {
        if (param0 != 11) {
          this.healOrRaiseSkeletonAt((byte) 47, 3, 37, -46);
        }
        return 0;
    }

    final void d(int param0, int param1, int param2, int param3) {
        if (!this.field_b) {
          return;
        }
        if (param2 < 68) {
          return;
        }
        if (this.field_d[param3] < param1) {
          this.field_d[param3] = param1;
          this.field_N[param3] = param0;
        }
    }

    final void applyTurnChange(boolean obfuscationGuard, int nextPlayer, int turnNumber) {
        int var5 = 0;
        Unit var6 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.currentPlayer > -1) {
          var6 = (Unit) (this.unitsByPlayer[this.currentPlayer].first((byte) 91));
          while (true) {
            if (var6 != null) {
              var6.refreshForTurnChange((byte) -36);
              var6 = (Unit) (this.unitsByPlayer[this.currentPlayer].next((byte) 123));
              if (var5 == 0) {
                continue;
              }
            } else {
              this.playerTurnCounts[this.currentPlayer] = this.playerTurnCounts[this.currentPlayer] + 1;
              this.currentPlayer = nextPlayer;
              this.turnNumber = turnNumber;
              this.prepareTurnConsequences(false, false, 0);
              this.updateMatchOutcome(1);
            }
            break;
          }
          if (var5 != 0) {
            this.currentPlayer = nextPlayer;
            this.turnNumber = turnNumber;
          }
        } else {
          this.currentPlayer = nextPlayer;
          this.turnNumber = turnNumber;
        }
        this.a(nextPlayer, (byte) 111);
        if (obfuscationGuard) {
          return;
        }
        this.eliminationOrder = (int[]) null;
    }

    final void queueCombatConsequences(int attackerY, int targetDeltaX, boolean attackerDies, int attackerX, int targetDeltaY, int obfuscationGuard, boolean defenderDies, int attackerDamage, int defenderDamage, int unseenUnitType) {
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_84_0 = 0;
        NodeDeque stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        DamageEvent stackIn_112_2 = null;
        DamageEvent stackIn_112_3 = null;
        Unit stackIn_112_4 = null;
        int stackIn_112_5 = 0;
        DamageEvent stackIn_114_2;
        DamageEvent stackIn_114_3;
        DamageEvent stackIn_115_2;
        DamageEvent stackIn_115_3;
        boolean stackIn_115_6;
        NodeDeque stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        DamageEvent stackIn_119_2 = null;
        DamageEvent stackIn_119_3 = null;
        Unit stackIn_119_4 = null;
        int stackIn_119_5 = 0;
        DamageEvent stackIn_121_2;
        DamageEvent stackIn_121_3;
        DamageEvent stackIn_122_2 = null;
        DamageEvent stackIn_122_3 = null;
        boolean stackIn_122_6 = false;
        int stackIn_130_0 = 0;
        int stackIn_136_0 = 0;
        Unit defender = null;
        int attackDistance = 0;
        int attackerEquipmentPoisons = 0;
        int defenderEquipmentPoisons = 0;
        int meleeAttack = 0;
        int guardQuotient = 0;
        int defenderHealingIndex = 0;
        int obfuscationControlSnapshot = 0;
        Unit attackerLookup = null;
        Unit attacker = null;
        DamageEvent stackIn_112_2Lifetime1;
        DamageEvent stackIn_112_3Lifetime1;
        DamageEvent stackIn_114_2Lifetime1;
        DamageEvent stackIn_114_3Lifetime1;
        DamageEvent stackIn_115_2Lifetime1;
        DamageEvent stackIn_115_3Lifetime1;
        DamageEvent stackIn_119_2Lifetime1;
        DamageEvent stackIn_119_3Lifetime1;
        DamageEvent stackIn_121_2Lifetime1;
        DamageEvent stackIn_121_3Lifetime1;
        DamageEvent stackIn_122_2Lifetime1;
        DamageEvent stackIn_122_3Lifetime1;
        int campaignKillMarker;
        int attackerHealingIndex;
        obfuscationControlSnapshot = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        attackerLookup = this.getUnitAt(attackerY, true, attackerX);
        attacker = attackerLookup;
        defender = this.getUnitAt(attackerY + targetDeltaY, true, targetDeltaX + attackerX);
        attackDistance = Math.abs(targetDeltaX) + Math.abs(targetDeltaY);
        if (defender != null &&
          attacker != null) {
          attackerEquipmentPoisons = 0;
          defenderEquipmentPoisons = 0;
          stackIn_7_0 = (attackDistance != 1) ? 0 : 1;
          boolean decompiledFrameRemainder2 = true;
          meleeAttack = stackIn_7_0;
          if (meleeAttack != 0) {
            if (attacker.getUnitCategory(0) == 4) {
              if (attacker.getEquipmentCategory(20640) == 4 &&
                (attacker.getEquipmentProperty(2, 122) & 1) == 1) {
                stackIn_13_0 = 1;
              } else {
                stackIn_13_0 = 0;
              }
              attackerEquipmentPoisons = stackIn_13_0;
              decompiledFrameRemainder2 = (obfuscationControlSnapshot != 0);
            }
            if (decompiledFrameRemainder2) {
              if (attacker.getUnitCategory(0) == 3) {
                if (2 == attacker.getEquipmentCategory(20640) &&
                  (attacker.getEquipmentProperty(2, -90) & 1) == 1) {
                  stackIn_19_0 = 1;
                } else {
                  stackIn_19_0 = 0;
                }
                attackerEquipmentPoisons = stackIn_19_0;
                decompiledFrameRemainder2 = (obfuscationControlSnapshot != 0);
              }
              if (decompiledFrameRemainder2) {
                if (attacker.unitType == 34 &&
                  attacker.packedFlag8) {
                  if (attacker.getEquipmentCategory(20640) == 3 &&
                    (1 & attacker.getEquipmentProperty(2, -97)) == 1) {
                    stackIn_26_0 = 1;
                  } else {
                    stackIn_26_0 = 0;
                  }
                  attackerEquipmentPoisons = stackIn_26_0;
                  decompiledFrameRemainder2 = (obfuscationControlSnapshot != 0);
                }
                if (decompiledFrameRemainder2) {
                  if (attacker.getEquipmentCategory(20640) == 0 &&
                    (1 & attacker.getEquipmentProperty(2, 121)) == 1) {
                    stackIn_31_0 = 1;
                  } else {
                    stackIn_31_0 = 0;
                  }
                  attackerEquipmentPoisons = stackIn_31_0;
                }
              }
            }
          }
          if ((decompiledFrameRemainder2) &&
            (meleeAttack == 0 ||
            obfuscationControlSnapshot != 0)) {
            if (34 == attacker.unitType &&
              attacker.packedFlag8) {
              if (attacker.getEquipmentCategory(20640) == 3 &&
                1 == (1 & attacker.getEquipmentProperty(2, 99))) {
                stackIn_38_0 = 1;
              } else {
                stackIn_38_0 = 0;
              }
              attackerEquipmentPoisons = stackIn_38_0;
              decompiledFrameRemainder2 = (obfuscationControlSnapshot != 0);
            }
            if (decompiledFrameRemainder2) {
              if (attacker.unitType == 81 ||
                attacker.unitType == 4 ||
                74 == attacker.unitType) {
                if (3 == attacker.getEquipmentCategory(20640) &&
                  1 == (attacker.getEquipmentProperty(2, -112) & 1)) {
                  stackIn_47_0 = 1;
                } else {
                  stackIn_47_0 = 0;
                }
                attackerEquipmentPoisons = stackIn_47_0;
                decompiledFrameRemainder2 = (obfuscationControlSnapshot != 0);
              }
              if (decompiledFrameRemainder2) {
                boolean decompiledSharedTail0 = (3 != attacker.getUnitCategory(0));
                if (!decompiledSharedTail0) {
                  if (attacker.getEquipmentCategory(20640) == 2 &&
                    (attacker.getEquipmentProperty(2, -123) & 1) == 1) {
                    stackIn_53_0 = 1;
                  } else {
                    stackIn_53_0 = 0;
                  }
                  attackerEquipmentPoisons = stackIn_53_0;
                  decompiledSharedTail0 = (obfuscationControlSnapshot != 0);
                }
                if (decompiledSharedTail0) {
                  if (1 == attacker.getEquipmentCategory(20640) &&
                    (1 & attacker.getEquipmentProperty(2, 116)) == 1) {
                    stackIn_58_0 = 1;
                  } else {
                    stackIn_58_0 = 0;
                  }
                  attackerEquipmentPoisons = stackIn_58_0;
                }
              }
            }
          }
          boolean decompiledFrameRemainder1 = true;
          guardQuotient = -37 / ((35 - obfuscationGuard) / 34);
          if (meleeAttack != 0) {
            if (4 == defender.getUnitCategory(0)) {
              if (4 == defender.getEquipmentCategory(20640) &&
                1 == (defender.getEquipmentProperty(2, -117) & 1)) {
                stackIn_65_0 = 1;
              } else {
                stackIn_65_0 = 0;
              }
              defenderEquipmentPoisons = stackIn_65_0;
              decompiledFrameRemainder1 = (obfuscationControlSnapshot != 0);
            }
            if (decompiledFrameRemainder1) {
              if (defender.getUnitCategory(0) != 3) {
                if (defender.unitType != 34 ||
                  !defender.packedFlag8) {
                  if (defender.getEquipmentCategory(20640) == 0 &&
                    (1 & defender.getEquipmentProperty(2, -94)) == 1) {
                    stackIn_74_0 = 1;
                  } else {
                    stackIn_74_0 = 0;
                  }
                  defenderEquipmentPoisons = stackIn_74_0;
                  if (obfuscationControlSnapshot != 0) {
                    if (defender.getEquipmentCategory(20640) == 3 &&
                      1 == (defender.getEquipmentProperty(2, -114) & 1)) {
                      stackIn_79_0 = 1;
                    } else {
                      stackIn_79_0 = 0;
                    }
                    defenderEquipmentPoisons = stackIn_79_0;
                    if (defender.getEquipmentCategory(20640) == 2 &&
                      1 == (1 & defender.getEquipmentProperty(2, 117))) {
                      stackIn_84_0 = 1;
                    } else {
                      stackIn_84_0 = 0;
                    }
                    defenderEquipmentPoisons = stackIn_84_0;
                  }
                } else {
                  if (defender.getEquipmentCategory(20640) == 3 &&
                    1 == (defender.getEquipmentProperty(2, -114) & 1)) {
                    stackIn_79_0 = 1;
                  } else {
                    stackIn_79_0 = 0;
                  }
                  defenderEquipmentPoisons = stackIn_79_0;
                  if (obfuscationControlSnapshot != 0) {
                    if (defender.getEquipmentCategory(20640) == 2 &&
                      1 == (1 & defender.getEquipmentProperty(2, 117))) {
                      stackIn_84_0 = 1;
                    } else {
                      stackIn_84_0 = 0;
                    }
                    defenderEquipmentPoisons = stackIn_84_0;
                  }
                }
              } else {
                if (defender.getEquipmentCategory(20640) == 2 &&
                  1 == (1 & defender.getEquipmentProperty(2, 117))) {
                  stackIn_84_0 = 1;
                } else {
                  stackIn_84_0 = 0;
                }
                defenderEquipmentPoisons = stackIn_84_0;
              }
            }
          }
          if (attackerDies &&
            defender.maximumStrength < 99 &&
            attacker.grantsGrowthOnDeath(-40)) {
            this.pendingEvents.addFirst(750, new TurnEffectEvent(defender, 4));
          }
          if (defenderDies &&
            attacker.maximumStrength < 99 &&
            defender.grantsGrowthOnDeath(-40)) {
            this.pendingEvents.addFirst(750, new TurnEffectEvent(attacker, 4));
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          if (meleeAttack != 0 &&
            defender.meleeLifeSteal) {
            defenderHealingIndex = 0;
            while (defenderHealingIndex < defenderDamage) {
              this.pendingEvents.addFirst(750, new TurnEffectEvent(defender, 1));
              defenderHealingIndex++;
              if (obfuscationControlSnapshot != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted1) && (meleeAttack != 0 &&
            attacker.meleeLifeSteal)) {
            attackerHealingIndex = 0;
            while (attackerHealingIndex < attackerDamage) {
              this.pendingEvents.addFirst(750, new TurnEffectEvent(attacker, 1));
              attackerHealingIndex++;
              if (obfuscationControlSnapshot != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            regionExit1: {
              regionExit2: {
                stackIn_112_0 = this.pendingEvents;
                stackIn_112_1 = 750;
                stackIn_112_2 = null;
                stackIn_112_3 = null;
                stackIn_112_4 = attacker;
                stackIn_112_5 = defenderDamage;
                if (!defender.hasPoisonousAttacks(-113)) {
                  stackIn_114_2 = null;
                  stackIn_114_3 = null;
                  if (defenderEquipmentPoisons == 0) {
                    break regionExit2;
                  }
                  stackIn_112_2Lifetime1 = null;
                  stackIn_112_3Lifetime1 = null;
                }
                stackIn_114_2Lifetime1 = null;
                stackIn_114_3Lifetime1 = null;
                if (defenderDamage > 0) {
                  stackIn_115_2 = null;
                  stackIn_115_3 = null;
                  stackIn_115_6 = true;
                  break regionExit1;
                }
              }
              stackIn_115_2Lifetime1 = null;
              stackIn_115_3Lifetime1 = null;
              stackIn_115_6 = false;
            }
            ((NodeDeque) (Object) stackIn_112_0).addFirst(stackIn_112_1, new DamageEvent(stackIn_112_4, stackIn_112_5, stackIn_115_6));
          }
          boolean decompiledFrameRemainder3 = true;
          boolean decompiledFrameRemainder0 = true;
          stackIn_119_0 = this.pendingEvents;
          stackIn_119_1 = 750;
          stackIn_119_2 = null;
          stackIn_119_3 = null;
          stackIn_119_4 = defender;
          stackIn_119_5 = attackerDamage;
          if (!attacker.hasPoisonousAttacks(-119)) {
            stackIn_121_2 = null;
            stackIn_121_3 = null;
            decompiledFrameRemainder0 = (attackerEquipmentPoisons != 0);
            if (decompiledFrameRemainder0) {
              stackIn_119_2Lifetime1 = null;
              stackIn_119_3Lifetime1 = null;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_121_2Lifetime1 = null;
            stackIn_121_3Lifetime1 = null;
            if (attackerDamage > 0) {
              stackIn_122_2 = null;
              stackIn_122_3 = null;
              stackIn_122_6 = true;
              decompiledFrameRemainder3 = false;
            }
          }
          if (decompiledFrameRemainder3) {
            stackIn_122_2Lifetime1 = null;
            stackIn_122_3Lifetime1 = null;
            stackIn_122_6 = false;
          }
          ((NodeDeque) (Object) stackIn_119_0).addFirst(stackIn_119_1, new DamageEvent(stackIn_119_4, stackIn_119_5, stackIn_122_6));
          attacker.attacksRemaining = attacker.attacksRemaining - 1;
          if (this.field_b) {
            defender.attacksReceived = defender.attacksReceived + 1;
            attacker.attacksMade = attacker.attacksMade + 1;
            this.d(attacker.ownerPlayer, attacker.attacksMade, 112, 7);
            this.d(defender.ownerPlayer, defender.attacksReceived, 79, 6);
            campaignKillMarker = 0;
            if (attackerDies) {
              this.field_g[defender.ownerPlayer] = this.field_g[defender.ownerPlayer] + 1;
              this.d(defender.ownerPlayer, this.field_g[defender.ownerPlayer], 120, 4);
              if (attacker.tag == 10 &&
                11 == defender.tag) {
                stackIn_130_0 = 1;
              } else {
                stackIn_130_0 = 0;
              }
              campaignKillMarker = stackIn_130_0;
            }
            if (defenderDies) {
              this.field_g[attackerLookup.ownerPlayer] = this.field_g[attackerLookup.ownerPlayer] + 1;
              this.d(attacker.ownerPlayer, this.field_g[attackerLookup.ownerPlayer], 91, 4);
              if (defender.tag == 10 &&
                attacker.tag == 11) {
                stackIn_136_0 = 1;
              } else {
                stackIn_136_0 = 0;
              }
              campaignKillMarker = stackIn_136_0;
            }
            if (campaignKillMarker != 0 &&
              this.campaignMission != null &&
              this.campaignMission.campaign.campaignIndex == 2) {
              if (this.campaignMission.missionId != 5) {
                return;
              }
              rd.field_j.a(50, (byte) 30, 205);
            }
          }
          return;
        }
        boolean discarded$0 = this.a(attacker, targetDeltaX, attackerDamage, attackerDies, attackerY, -1, targetDeltaY, defender, attackerX, defenderDamage, unseenUnitType, defenderDies, 0);
    }

    final void l(int param0, int param1) {
        int dupTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        RuntimeException stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        RuntimeException stackIn_8_1 = null;
        String stackIn_8_2 = null;
        MapLayout var3;
        int var4_int;
        MapTile[] var4;
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != param1) {
          this.mapSizeSetting = 0;
        }
        if (this.mapSizeSetting >= 0 &&
          hs.field_G.length > this.mapSizeSetting) {
          dupTemp$0 = hs.field_G[this.mapSizeSetting];
          this.mapWidth = dupTemp$0;
          this.mapHeight = dupTemp$0;
          if ((0 > this.mapSizeSetting ||
            2 < this.mapSizeSetting) && param1 == 0) {
            rn.a(-118, this);
            if (var6 == 0) {
              return;
            }
          }
          regionExit1: {
            if (param1 != 0) {
              var3 = ew.field_e.a((byte) 59, param1 - 1);
              if (var6 == 0) {
                break regionExit1;
              }
            }
            if (null == this.campaignMission) {
              var4_int = ew.field_e.a(param0 + 0, this.mapSizeSetting, this.mapTheme, this.playerCount);
              if (var4_int <= 0) {
                throw new RuntimeException((String) null);
              }
              var5 = this.randomSeed % var4_int;
              var3 = ew.field_e.a(this.playerCount, 4136, this.mapSizeSetting, this.mapTheme, var5);
              if (var3 == null) {
                throw new RuntimeException((String) null);
              }
              if (var6 != 0) {
                var3 = this.campaignMission.getMapLayout(-114);
              }
            } else {
              var3 = this.campaignMission.getMapLayout(-114);
            }
          }
          var4 = var3.createTiles(param0 - 95, this);
          this.a((byte) -104, var3.mapWidth, var3.mapHeight, var4);
          return;
        }
        stackIn_7_0 = null;
        stackIn_7_1 = null;
        if (!this.field_x) {
          stackIn_8_0 = null;
          stackIn_8_1 = null;
          stackIn_8_2 = null;
        } else {
          stackIn_8_0 = null;
          stackIn_8_1 = null;
          stackIn_8_2 = "That's not a valid map size: " + this.mapSizeSetting;
        }
        throw new RuntimeException(stackIn_8_2);
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -64) {
            stackIn_2_0 = -101;
            return stackIn_2_0;
          }
          var3_int = this.getPlayerTeamIndex(this.localPlayer, param1 ^ 63);
          if (var3_int < 0) {
            var4 = this.a(param0, -128);
            var3_int = this.getPlayerTeamIndex(var4, -1);
            if (var3_int < 0) {
              var3_int = 2;
            }
          }
          stackIn_9_0 = op.field_c[0][var3_int];
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ha.OC(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        if (!param1) {
          this.registerUnit(127, (Unit) null);
        }
        int var4 = param2 <= param0 ? 1 : 0;
        return var4 != 0;
    }

    private final boolean a(Unit param0, int param1, int param2, boolean param3, int param4, int param5, int param6, Unit param7, int param8, int param9, int param10, boolean param11, int param12) {
        StringBuilder stackIn_2_0 = null;
        int stackIn_3_1 = 0;
        StringBuilder stackIn_5_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var14 = null;
        String var15 = null;
        String var16 = null;
        try {
          stackIn_2_0 = new StringBuilder().append("applycombat: ").append(param12).append(", player: ").append(this.currentPlayer).append(", turn: ").append(this.turnNumber).append(", att: ");
          if (param0 == null) {
            stackIn_3_1 = -1;
          } else {
            stackIn_3_1 = param0.unitType;
          }
          stackIn_5_0 = ((StringBuilder) (Object) stackIn_2_0).append(stackIn_3_1).append(", def: ");
          if (param7 != null) {
            stackIn_6_1 = param7.unitType;
          } else {
            stackIn_6_1 = -1;
          }
          var16 = ((StringBuilder) (Object) stackIn_5_0).append(stackIn_6_1).toString();
          if (param5 != -1) {
            return false;
          }
          var15 = "\ncx: " + param8 + ", cy: " + param4 + ", ax: " + param1 + ", ay: " + param6 + ", adam: " + param2 + ", ddam: " + param9 + ", creature: " + param10 + ", attdie: " + param3 + ", defdie: " + param11;
          if (this.field_F) {
            af.a((Throwable) null, 115, var16 + var15);
            return true;
          }
          this.field_o = true;
          System.out.println(var16 + var15);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var14 = decompiledCaughtException;
          stackIn_16_0 = var14;
          stackIn_16_1 = new StringBuilder().append("ha.JA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    final int getStructureIncome(int obfuscationGuard, int playerId) {
        float stackIn_5_0 = 0.0f;
        float var3;
        int var4;
        if (this.campaignMission != null &&
          this.campaignMission.playerSlot == playerId) {
          stackIn_5_0 = this.campaignManaMultiplier;
        } else {
          stackIn_5_0 = 1.0f;
        }
        var3 = stackIn_5_0;
        var4 = (int)((float)(this.teamStructureCounts[this.playerTeamIndices[playerId]][2] * 25) * var3) + ((int)(var3 * (float)(this.teamStructureCounts[this.playerTeamIndices[playerId]][1] * 75)) + (int)(var3 * (float)(50 * this.teamStructureCounts[this.playerTeamIndices[playerId]][0])));
        if (obfuscationGuard <= -95) {
          return var4;
        }
        return 115;
    }

    final int g(int param0, int param1, int param2) {
        int var4;
        if (param2 >= 0 &&
          param0 >= 0 &&
          param2 < this.mapWidth &&
          this.mapWidth > param0) {
          if (param1 > -28) {
            this.field_Fb = false;
          }
          var4 = this.tiles[param2 + this.mapWidth * param0].terrainType;
          if (6 == var4) {
            var4 = 4;
          }
          return var4;
        }
        return -1;
    }

    final boolean arePlayersAllied(int firstPlayer, int obfuscationGuard, int secondPlayer) {
        boolean stackIn_11_0 = false;
        if (obfuscationGuard != -16985) {
          this.field_o = false;
        }
        if (firstPlayer != -1 &&
          secondPlayer != -1 &&
          firstPlayer != 255) {
          if (secondPlayer == 255) {
            return false;
          }
          stackIn_11_0 = (this.playerTeamIndices[secondPlayer] == this.playerTeamIndices[firstPlayer]);
          return stackIn_11_0;
        }
        return false;
    }

    private final void readMoveEvent(byte obfuscationGuard, PacketBuffer packet) {
        RuntimeException runtimeException = null;
        int stepsRemaining = 0;
        int guardArithmetic = 0;
        int startX = 0;
        int startY = 0;
        int[] directions = null;
        int stepIndex = 0;
        int packedDirections = 0;
        int stepsInByte = 0;
        int var11 = 0;
        int[] directionArray = null;
        int[] decodedDirections = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          guardArithmetic = -72 % ((-9 - obfuscationGuard) / 57);
          stepsRemaining = packet.readUnsignedShort((byte) -104) & 8191;
          startX = packet.readUnsignedByte(0);
          startY = packet.readUnsignedByte(0);
          decodedDirections = new int[stepsRemaining];
          directionArray = decodedDirections;
          directions = directionArray;
          stepIndex = 0;
          scanLoop1: while (true) {
            stackIn_3_0 = stepsRemaining;
            if (stackIn_3_0 > 0) {
              packedDirections = packet.readUnsignedByte(0);
              if (var11 != 0) {
                return;
              }
              stepsInByte = 0;
              while (stepsInByte < 4) {
                stackIn_3_0 = stepsRemaining;
                if (stackIn_3_0 > 0) {
                  directions[stepIndex] = rn.a(3, packedDirections);
                  packedDirections = packedDirections >> 2;
                  stepIndex++;
                  stepsRemaining--;
                  stepsInByte++;
                  continue;
                }
                break;
              }
              continue scanLoop1;
            }
            break;
          }
          this.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new MoveEvent(startX, startY, decodedDirections)));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("ha.MD(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final boolean f(int param0, int param1, int param2) {
        int var4 = param1 >= param0 ? 1 : 0;
        if (param2 != 0) {
          this.e(73, 49, -89);
        }
        return var4 != 0;
    }

    private final int b(byte param0) {
        int var2 = 1 + this.field_vb;
        if (this.mapSizeSetting < 0 ||
          hs.field_G.length <= this.mapSizeSetting) {
          return var2 * nr.field_a[0];
        }
        int var3 = nr.field_a[this.mapSizeSetting] * var2;
        if (this.campaignMission != null) {
          var3 = 9999;
        }
        if (param0 != 32) {
          this.field_Db = -41;
        }
        return var3;
    }

    final String e(int param0, int param1) {
        if (-1 > param0) {
          return "id: " + param0;
        }
        if (param1 < ~param0) {
          return "none";
        }
        return this.playerNames[param0];
    }

    final void readGameEvent(PacketBuffer packet, byte obfuscationGuard) {
        int header = 0;
        int eventCategory = 0;
        int var5 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          header = packet.payload[packet.position];
          eventCategory = (header & 237) >> 5;
          switch ((var5 == 0
            || eventCategory == 3
            || eventCategory == 5
            || eventCategory == 6
            ) ? eventCategory : -1) {
            case 0:
              this.readMoveEvent((byte) 91, packet);
              if (var5 == 0) {
                break;
              }
            case 1:
              this.readSummonEvent(packet, true);
              if (var5 == 0) {
                break;
              }
            case 3:
              this.readCombatEvent(packet, -1);
              if (var5 == 0) {
                break;
              }
            case 5:
              this.readStateChangeEvent(-30531, packet);
              if (var5 == 0) {
                break;
              }
            case 6:
              this.readSpecialEvent(packet, (byte) -84);
            default:
              break;
          }
          if (obfuscationGuard >= -50) {
            this.a(true, 103, -100, 43, -48, -87, -117);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("ha.SA(");
          if (packet == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final int a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param3 != 0) {
          return -22;
        }
        return 0;
    }

    private final boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_22_0 = 0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!this.field_V) {
          return false;
        }
        if (param0 < 45) {
          this.registerUnit(-102, (Unit) null);
        }
        var2 = 0;
        while (this.playerCount > var2) {
          stackIn_22_0 = 0;
          if (var3 != 0) {
            return stackIn_22_0 != 0;
          }
          if (stackIn_22_0 > var2) {
            return false;
          }
          if (var2 >= this.playerTurnCounts.length) {
            return false;
          }
          if (0 == (1 << var2 & this.eliminatedPlayerMask) ||
            var3 != 0) {
            if (this.playerTurnCounts[var2] > this.turnLimit) {
              return true;
            }
            if (this.playerTurnCounts[var2] < this.turnLimit) {
              return false;
            }
          }
          var2++;
        }
        return true;
    }

    final int getDamageTakenPercent(int tileIndex, int obfuscationGuard, Unit unit) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.tiles[tileIndex].hasExplicitOwner((byte) -79) &&
            this.arePlayersAllied(this.tiles[tileIndex].getExplicitOwner((byte) -88), -16985, unit.ownerPlayer)) {
            stackIn_4_0 = 60;
            return stackIn_4_0;
          }
          if (0 != (8 & this.getTileEffects(31, unit.tileY, unit.tileX, unit.ownerPlayer))) {
            stackIn_7_0 = 100;
            return stackIn_7_0;
          }
          stackIn_11_0 = (bw.unitDefinitions[unit.unitType][1] != 2) ? 0 : 1;
          var4_int = stackIn_11_0;
          if (var4_int != 0 &&
            this.tiles[tileIndex].terrainType == 3) {
            tileIndex = 70;
            if (ArmiesOfGielinor.obfuscationControl) {
              tileIndex = ri.terrainDamageTakenPercent[this.tiles[tileIndex].terrainType];
            }
          } else {
            tileIndex = ri.terrainDamageTakenPercent[this.tiles[tileIndex].terrainType];
          }
          if (obfuscationGuard != -4) {
            this.kingBlackDragonSummoned = false;
          }
          stackIn_18_0 = tileIndex;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("ha.U(").append(tileIndex).append(',').append(obfuscationGuard).append(',');
          if (unit == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void initializeMatchConditions(int obfuscationGuard) {
        boolean stackIn_39_0 = false;
        int stackIn_46_0 = 0;
        boolean stackIn_49_0 = false;
        int stackIn_66_0 = 0;
        int stackIn_76_0 = 0;
        boolean stackIn_88_0 = false;
        boolean stackOut_38_0;
        boolean stackOut_48_0;
        boolean stackOut_87_0;
        int hasEscortGoals = 0;
        int hasPortals = 0;
        boolean[] portalOwners = null;
        boolean[] captureUnitOwners = null;
        Vector[] leaderGroups = null;
        int var7_int = 0;
        boolean[] needsUnitLossCheck = null;
        MapTile tile = null;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        Unit var12 = null;
        Unit[] leaders = null;
        Unit var14 = null;
        Unit[] leaderArray = null;
        int stackIn_76_0Lifetime1;
        int var10Lifetime1;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.matchConditions = new MatchConditionRegistry(this.playerCount);
        hasEscortGoals = 0;
        hasPortals = 0;
        portalOwners = new boolean[this.playerCount];
        captureUnitOwners = new boolean[this.playerCount];
        leaderGroups = new Vector[this.playerCount];
        var7_int = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var7_int >= this.tiles.length))) {
          tile = this.tiles[var7_int];
          if (var11 == 0) {
            if (tile != null) {
              var12 = tile.occupant;
              var14 = var12;
              if (var14 != null) {
                if (var14.hasMovementFlag1(false) &&
                  var14.ownerPlayer != -1) {
                  if (null == leaderGroups[var12.ownerPlayer]) {
                    leaderGroups[var12.ownerPlayer] = new Vector();
                  }
                  leaderGroups[var12.ownerPlayer].addElement(var14);
                }
                if (var14.unitType == 7 &&
                  0 <= var14.ownerPlayer) {
                  hasPortals = 1;
                  portalOwners[var12.ownerPlayer] = true;
                }
                if ((var14.canCaptureStructures(-21428) ||
                  var14.isSeaSlug((byte) 93)) && var14.ownerPlayer >= 0) {
                  captureUnitOwners[var12.ownerPlayer] = true;
                }
              }
              if (tile.isPortal(-58)) {
                if (tile.ownerPlayer >= 0) {
                  portalOwners[tile.ownerPlayer] = true;
                }
                hasPortals = 1;
              }
              if (tile.hasModifierFlag4((byte) -128)) {
                hasEscortGoals = 1;
              }
            }
            var7_int++;
            continue;
          }
          break;
        }
        if ((decompiledNaturalLoopExit0) &&
          (obfuscationGuard != -29673)) {
          this.appendPlayerDiagnostics(23, (gn) null, 119);
        }
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameCompleted1 = true;
        boolean decompiledFrameCompleted3 = true;
        boolean decompiledFrameCompleted2 = true;
        regionExit1: {
          boolean decompiledFrameRemainder0 = true;
          needsUnitLossCheck = new boolean[this.playerCount];
          if (hasPortals == 0) {
            var8 = 0;
            while (this.playerCount > var8) {
              needsUnitLossCheck[var8] = true;
              var8++;
              if (var11 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
            decompiledFrameRemainder0 = !(decompiledFrameCompleted3);
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted3)) {
            var8 = 0;
            while (true) {
              if (this.playerCount > var8) {
                stackOut_38_0 = captureUnitOwners[var8];
                stackIn_46_0 = stackOut_38_0 ? 1 : 0;
                stackIn_39_0 = stackOut_38_0;
                if (var11 == 0) {
                  if (!stackIn_39_0) {
                    if (!portalOwners[var8]) {
                      needsUnitLossCheck[var8] = true;
                    }
                  } else {
                    portalOwners[var8] = true;
                  }
                  var8++;
                  continue;
                }
              } else {
                stackIn_46_0 = 0;
              }
              var8 = stackIn_46_0;
              while (var8 < this.playerCount) {
                stackOut_48_0 = portalOwners[var8];
                stackIn_66_0 = stackOut_48_0 ? 1 : 0;
                stackIn_49_0 = stackOut_48_0;
                if (var11 != 0) {
                  break regionExit1;
                }
                if (stackIn_49_0) {
                  this.matchConditions.addCondition(new PortalLossCondition(var8, this), (byte) 91, var8);
                }
                var8++;
              }
              this.field_eb = true;
              if (var11 == 0) {
                break;
              }
              var8 = 0;
              if (this.playerCount <= var8) {
                break;
              }
              needsUnitLossCheck[var8] = true;
              var8++;
              decompiledFrameCompleted2 = false;
              break;
            }
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameCompleted2)) {
            stackIn_66_0 = hasEscortGoals;
          }
        }
        if ((decompiledFrameCompleted3) &&
          (decompiledFrameCompleted2) &&
          (stackIn_66_0 == 0)) {
          var8 = 0;
          while (this.playerCount > var8) {
            if (var11 != 0) {
              decompiledFrameCompleted1 = false;
              break;
            }
            if (null != leaderGroups[var8]) {
              needsUnitLossCheck[var8] = true;
              this.matchConditions.removePlayerPortalLossConditions(244, var8);
            }
            var8++;
          }
          if (decompiledFrameCompleted1) {
            decompiledFrameRemainder1 = (var11 != 0);
          }
        }
        if ((decompiledFrameRemainder1) &&
          (decompiledFrameCompleted1)) {
          var8 = 0;
          while (true) {
            stackIn_76_0 = ~var8;
            if (stackIn_76_0 <= ~this.playerCount) {
              break;
            }
            if (var11 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (null != leaderGroups[var8]) {
              leaders = new Unit[leaderGroups[var8].size()];
              leaderArray = leaders;
              var10 = 0;
              while (var10 < leaderGroups[var8].size()) {
                leaders[var10] = (Unit) (leaderGroups[var8].elementAt(var10));
                var10++;
              }
              this.matchConditions.addCondition(new LeaderEscortCondition(var8, leaderArray), (byte) 85, var8);
              needsUnitLossCheck[var8] = true;
              this.matchConditions.removePortalLossConditions((byte) 43);
              var10Lifetime1 = 0;
              while (this.playerCount > var10Lifetime1) {
                stackOut_87_0 = this.arePlayersAllied(var8, -16985, var10Lifetime1);
                stackIn_76_0Lifetime1 = stackOut_87_0 ? 1 : 0;
                stackIn_88_0 = stackOut_87_0;
                if (stackIn_88_0 &&
                  ~var10Lifetime1 != ~var8) {
                  needsUnitLossCheck[var10Lifetime1] = true;
                }
                var10Lifetime1++;
              }
            }
            var8++;
          }
        }
        if (decompiledFrameCompleted0) {
          var8 = 0;
        }
        while (var8 < this.playerCount) {
          if (var11 == 0) {
            if (needsUnitLossCheck[var8]) {
              this.matchConditions.addCondition(new UnitLossCondition(var8, this), (byte) 99, var8);
            }
            var8++;
            continue;
          }
          break;
        }
        return;
    }

    private final int n(int param0, int param1) {
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var3 = 0;
        if (param1 >= -60) {
          this.getSummoningFavourAt(53, (byte) 105, 32, 124);
        }
        var4 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var4 >= this.chosenGods[param0].length))) {
          var5 = this.chosenGods[param0][var4];
          stackIn_10_0 = ~var5;
          stackIn_10_1 = -1;
          if (var6 == 0) {
            if (stackIn_10_0 <= stackIn_10_1) {
              var3 = var3 ^ (17232 + 312 * var5) * this.godFavourLevels[param0][var5];
            }
            var4++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_10_0 = ~this.playerMana[param0];
          stackIn_10_1 = -2;
        }
        if (stackIn_10_0 <= stackIn_10_1) {
          var3 = var3 ^ this.playerMana[param0] * 88357;
        }
        if (this.teamManaCollected[this.playerTeamIndices[param0]] >= 1) {
          var3 = var3 ^ this.teamManaCollected[this.playerTeamIndices[param0]] * 12473;
        }
        var3 = var3 ^ 7563 * this.playerTurnCounts[param0];
        if (BattleCharacter.field_i[this.field_Q] != 0) {
          var3 = var3 ^ 7317 * this.remainingRuneCap[param0];
        }
        return var3;
    }

    final int getPlayerTeamIndex(int playerId, int obfuscationGuard) {
        if (obfuscationGuard < ~playerId) {
          return -1;
        }
        return this.playerTeamIndices[playerId];
    }

    final int i(int param0, int param1) {
        int var3;
        if (null == this.teamManaCollected) {
          return 0;
        }
        if (param0 < 0) {
          return 0;
        }
        if (param0 >= this.playerCount) {
          return 0;
        }
        var3 = 25 * param0;
        var3 = var3 + this.teamManaCollected[this.playerTeamIndices[param0]];
        if (var3 > this.collectedManaTarget) {
          var3 = this.collectedManaTarget;
        }
        if (param1 != -12710) {
          this.field_A = -76;
        }
        return var3;
    }

    public static void c(int param0) {
        field_pb = null;
        field_nb = null;
        field_q = null;
        if (param0 != -1) {
          field_nb = (String) null;
        }
    }

    final void recountStructures(int obfuscationGuard) {
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        int[] dupTemp$2 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = 0;
        do {
          if (var2 >= this.teamStructureCounts.length) {
            if (obfuscationGuard != 2) {
              this.a(-11, (String) null, (GameEvent) null);
            }
            break;
          }
          this.teamStructureCounts[var2][0] = 0;
          this.teamStructureCounts[var2][1] = 0;
          this.teamStructureCounts[var2][2] = 0;
          var2++;
        } while (var5 == 0);
        if (null == this.tiles) {
          return;
        }
        var6 = 0;
        var2 = var6;
        while (this.tiles.length > var6) {
          var3 = this.getPlayerTeamIndex(this.tiles[var6].ownerPlayer, -1);
          if (var5 != 0) {
            return;
          }
          boolean decompiledFrameRemainder2 = true;
          if (var3 > -1) {
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            var4 = this.tiles[var6].terrainType;
            if ((7 != var4) &&
              (decompiledFrameRemainder0 = (var4 != 14 ||
              var5 != 0)) &&
              (decompiledFrameRemainder0 = (9 != var4 ||
              var5 != 0))) {
              decompiledFrameRemainder1 = (var4 != 8);
              decompiledFrameRemainder2 = !(decompiledFrameRemainder1);
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              dupTemp$0 = this.teamStructureCounts[var3];
              dupTemp$0[0] = dupTemp$0[0] + 1;
              decompiledFrameRemainder2 = false;
            }
            if ((decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              dupTemp$1 = this.teamStructureCounts[var3];
              dupTemp$1[1] = dupTemp$1[1] + 1;
              decompiledFrameRemainder2 = false;
            }
            if (decompiledFrameRemainder2) {
              dupTemp$2 = this.teamStructureCounts[var3];
              dupTemp$2[2] = dupTemp$2[2] + 1;
            }
          }
          var6++;
        }
        this.updateMatchOutcome(1);
        return;
    }

    final int getSurvivingPlayerMask(byte obfuscationGuard) {
        if (obfuscationGuard != 78) {
          this.getUnitsForPlayer(84, -63);
        }
        return ~this.eliminatedPlayerMask & (1 << this.playerCount) - 1;
    }

    final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        var4 = 0;
        var5 = this.g(param0, param1 - 2101, param2);
        if (var5 == 4 ||
          5 == var5) {
          if (~this.g(param0 - 1, param1 - 2139, param2) != ~var5) {
            var4 = var4 | 2;
          }
          if (~var5 != ~this.g(param0, -37, param2 + 1)) {
            var4 = var4 | 1;
          }
          if (~var5 != ~this.g(param0, -43, -1 + param2)) {
            var4 = var4 | 8;
          }
          if (~var5 != ~this.g(1 + param0, -63, param2)) {
            var4 = var4 | 4;
          }
        }
        if (var4 == 6) {
          return 1;
        }
        if (var4 == 9) {
          return 0;
        }
        if (var4 == 2) {
          return 2;
        }
        if (param1 != 2056) {
          return -23;
        }
        if (var4 == 4) {
          return 1;
        }
        if (var4 == 1) {
          return 3;
        }
        if (var4 != 8) {
          return -1;
        }
        return 0;
    }

    private final boolean hasSingleSurvivor(byte obfuscationGuard) {
        int survivingTeams = 0;
        TeamRoster[] teams = null;
        int teamIndex = 0;
        TeamRoster team = null;
        int[] players = null;
        int playerIndex = 0;
        int playerId = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_20_0 = false;
        boolean stackIn_24_0 = false;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != -42) {
          return true;
        }
        if (!this.teamGame) {
          stackIn_24_0 = (eb.a((byte) -125, this.getSurvivingPlayerMask((byte) 78)) == 1);
          return stackIn_24_0;
        }
        survivingTeams = 0;
        teams = this.teams;
        teamIndex = 0;
        while (true) {
          stackIn_5_0 = teamIndex;
          stackIn_5_1 = teams.length;
          boolean decompiledFrameRemainder0 = true;
          if (stackIn_5_0 < stackIn_5_1) {
            team = teams[teamIndex];
            players = team.playerIds;
            stackIn_17_0 = 0;
            decompiledFrameRemainder0 = (var9 == 0);
            if (decompiledFrameRemainder0) {
              playerIndex = stackIn_17_0;
              while (players.length > playerIndex) {
                playerId = players[playerIndex];
                stackIn_5_0 = ~(this.eliminatedPlayerMask & 1 << playerId);
                stackIn_5_1 = -1;
                if (stackIn_5_0 == stackIn_5_1) {
                  survivingTeams++;
                } else {
                  playerIndex++;
                  continue;
                }
                break;
              }
              teamIndex++;
              continue;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_17_0 = 1;
          }
          stackIn_20_0 = (stackIn_17_0 == survivingTeams);
          return stackIn_20_0;
        }
    }

    final void eliminatePlayerTeam(byte obfuscationGuard, int playerId) {
        int var4 = -71 % ((obfuscationGuard + 15) / 37);
        TeamRoster var3 = this.getPlayerTeam(playerId, -1);
        if (var3 != null) {
          var3.eliminateAllPlayers(3, this);
        }
    }

    private final int a(byte param0, int param1, MapTile param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 0;
          if (!this.a(param1, param2, 115)) {
            var4_int = var4_int ^ param2.terrainType;
            stackIn_2_0 = var4_int;
            return stackIn_2_0;
          }
          var4_int = var4_int ^ param2.terrainType * 47;
          if (param2.hasCorpse(-120)) {
            var4_int = var4_int ^ 234;
          }
          if (param2.hasExplicitOwner((byte) -79)) {
            var4_int = var4_int ^ 2823;
            var4_int = var4_int ^ param2.getExplicitOwner((byte) -71) * 75;
          }
          if (param0 != 103) {
            this.c(-105, 88);
          }
          var4_int = var4_int ^ 7657 * param2.ownerPlayer;
          stackIn_12_0 = var4_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ha.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean checkPlayerVictory(int startPlayer, int playerId) {
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_11_0 = false;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!this.matchConditions.hasVictory(playerId, -96)) {
          return false;
        }
        var3 = startPlayer;
        while (var3 < this.playerCount) {
          stackIn_11_0 = this.arePlayersAllied(var3, startPlayer ^ -16985, playerId);
          if (var4 != 0) {
            return stackIn_11_0;
          }
          if (!stackIn_11_0 ||
            var4 != 0) {
            this.eliminatePlayer(10001, var3, true);
          }
          var3++;
        }
        return true;
    }

    final int getSummoningGodMaskAt(int tileX, int obfuscationGuard, int tileY, int playerId) {
        int var6;
        MapTile var7;
        if (0 > playerId) {
          return 0;
        }
        if (tileX >= 0 &&
          0 <= tileY &&
          tileX < this.mapWidth) {
          if (tileY >= this.mapHeight) {
            return 0;
          }
          var7 = this.tiles[this.mapWidth * tileY + tileX];
          if (var7.occupant != null) {
            return 0;
          }
          var6 = this.arePlayersAllied(playerId, -16985, var7.ownerPlayer) ? 1 : 0;
          if (var6 != 0 &&
            7 == var7.terrainType) {
            return 65535;
          }
          if (obfuscationGuard != -27300) {
            this.a(41, 1, 42, (byte) 14);
          }
          if (var6 != 0 &&
            var7.terrainType == 11) {
            return 1 << var7.godId;
          }
          return 0;
        }
        return 0;
    }

    final void setInactivePlayerMask(int startPlayer, int playerMask) {
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var3 = startPlayer;
        while (this.playerCount > var3) {
          if (var4 == 0) {
            if (~(this.inactivePlayerMask & 1 << var3) != ~(1 << var3 & playerMask)) {
              this.eliminatePlayer(10001, var3, false);
            }
            var3++;
            continue;
          }
          break;
        }
        this.inactivePlayerMask = playerMask;
        return;
    }

    final boolean a(Unit param0, int param1, int param2, int param3) {
        MapTile var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 0 &&
            param2 >= 0 &&
            param1 < this.mapWidth &&
            param2 <= this.mapHeight) {
            if (param3 >= -117) {
              return false;
            }
            var5 = this.tiles[param2 * this.mapWidth + param1];
            if (null == var5.occupant) {
              return true;
            }
            if (param0.unitType == 51) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_19_0 = var5_ref;
          stackIn_19_1 = new StringBuilder().append("ha.W(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean b(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        MapTile[] var6;
        int var7;
        MapTile var8;
        Unit var9;
        int var10;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null == this.campaignMission) {
          return false;
        }
        if (param1) {
          this.field_A = 0;
          return false;
        }
        var4 = 0;
        var5 = 0;
        if (param2 != -1) {
          return false;
        }
        var6 = this.tiles;
        var7 = 0;
        while (true) {
          if (var6.length <= var7) {
            if (var5 == 0 &&
              var4 != 0) {
              this.field_A = this.field_A + 1;
              stackIn_24_0 = -4;
              stackIn_24_1 = ~this.field_A;
            } else {
              this.field_A = 0;
              return false;
            }
            break;
          }
          var8 = var6[var7];
          stackIn_24_0 = var8.ownerPlayer;
          stackIn_24_1 = param0;
          if (var10 == 0) {
            if (stackIn_24_0 == stackIn_24_1 && (7 == var8.terrainType ||
              11 == var8.terrainType)) {
              var4 = 1;
              var9 = var8.occupant;
              if (var9 == null ||
                this.arePlayersAllied(var9.ownerPlayer, -16985, param0)) {
                var5 = 1;
              }
            }
            var7++;
            continue;
          }
          break;
        }
        if (stackIn_24_0 >= stackIn_24_1) {
          return true;
        }
        return false;
    }

    final void updateMatchOutcome(int obfuscationGuard) {
        int discarded$0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_8_0 = false;
        int stackIn_19_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        boolean stackIn_67_0 = false;
        int stackIn_71_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_85_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        boolean stackOut_7_0;
        boolean stackOut_66_0;
        int var2_int = 0;
        int[] var2 = null;
        TeamRoster[] var3_ref_go__ = null;
        int var3 = 0;
        int var4 = 0;
        TeamRoster var5_ref_go = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int stackIn_71_0Lifetime1;
        int var2_intLifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.teamGame) {
          if (this.campaignMission != null &&
            this.field_qb) {
            var2_int = 0;
            var3_ref_go__ = this.teams;
            var4 = 0;
            while (true) {
              stackIn_6_0 = var4;
              stackIn_6_1 = var3_ref_go__.length;
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted1 = true;
              if (stackIn_6_0 < stackIn_6_1) {
                var5_ref_go = var3_ref_go__[var4];
                stackOut_7_0 = var5_ref_go.containsPlayer(this.campaignMission.playerSlot, (byte) -100);
                stackIn_19_0 = stackOut_7_0 ? 1 : 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledFrameRemainder0 = (var9 == 0);
                if (decompiledFrameRemainder0) {
                  if (!stackIn_8_0) {
                    var16 = var5_ref_go.playerIds;
                    var7 = 0;
                    while (var7 < var16.length) {
                      var8 = var16[var7];
                      stackIn_6_0 = -1;
                      stackIn_6_1 = ~(this.eliminatedPlayerMask & 1 << var8);
                      if (stackIn_6_0 == stackIn_6_1) {
                        var2_int = 1;
                        decompiledFrameCompleted1 = false;
                        break;
                      }
                      var7++;
                    }
                  }
                  if (decompiledFrameCompleted1) {
                    var4++;
                    continue;
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                this.winnerCount = 1;
                stackIn_19_0 = var2_int;
              }
              if (stackIn_19_0 == 0) {
                this.rankedParticipants[0] = 0;
                this.rankedParticipants[1] = 1;
                if (var9 == 0) {
                  return;
                }
              }
              this.rankedParticipants[0] = 1;
              this.rankedParticipants[1] = 0;
              return;
            }
          }
          if (!this.d((byte) 125)) {
            this.rankedParticipants[1] = 0;
            this.rankedParticipants[0] = 1;
            if (var9 != 0) {
              this.rankedParticipants[1] = 1;
              this.rankedParticipants[0] = 0;
            }
          } else {
            this.rankedParticipants[1] = 1;
            this.rankedParticipants[0] = 0;
          }
          var2_intLifetime1 = 0;
          var4 = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var4 >= this.teamCount))) {
            stackIn_34_0 = ~this.collectedManaTarget;
            if (var9 == 0) {
              if (stackIn_34_0 >= ~this.teamManaCollected[var4]) {
                var2_intLifetime1++;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_34_0 = 0;
          }
          var3 = stackIn_34_0;
          var4 = 0;
          while (true) {
            if (var4 >= this.playerCount) {
              this.winnerCount = var2_intLifetime1;
              stackIn_42_0 = -1;
              stackIn_42_1 = ~this.winnerCount;
              break;
            }
            stackIn_42_0 = this.playerTurnCounts[var4];
            stackIn_42_1 = this.turnLimit;
            if (var9 == 0) {
              if (stackIn_42_0 >= stackIn_42_1) {
                var3 = 1;
              }
              var4++;
              continue;
            }
            break;
          }
          if (stackIn_42_0 == stackIn_42_1 &&
            var3 != 0) {
            this.winnerCount = 1;
          }
          if (0 != this.winnerCount) {
            return;
          }
          if (this.hasSingleSurvivor((byte) -42)) {
            this.winnerCount = 1;
          }
          return;
        }
        if (this.field_X &&
          !this.field_b) {
          return;
        }
        var14 = this.getEliminationRanks(10326);
        var12 = var14;
        var10 = var12;
        var2 = var10;
        var3 = 0;
        do {
          if (this.playerCount <= var3) {
            var3 = 0;
            break;
          }
          this.rankedParticipants[var3] = var3;
          var3++;
        } while (var9 == 0);
        scanLoop1: while (true) {
          if (-1 + this.playerCount > var3) {
            var4 = var3;
            stackIn_73_0 = 1 + var3;
            if (var9 != 0) {
              break scanLoop1;
            }
            var5 = stackIn_73_0;
            while (this.playerCount > var5) {
              stackOut_66_0 = this.a(var14, this.rankedParticipants[var4], -24107, this.rankedParticipants[var5]);
              stackIn_71_0 = stackOut_66_0 ? 1 : 0;
              stackIn_67_0 = stackOut_66_0;
              if (stackIn_67_0) {
                var4 = var5;
              }
              var5++;
            }
            stackIn_71_0Lifetime1 = this.rankedParticipants[var3];
            var5Lifetime3 = stackIn_71_0Lifetime1;
            this.rankedParticipants[var3] = this.rankedParticipants[var4];
            this.rankedParticipants[var4] = var5Lifetime3;
            var3++;
            continue scanLoop1;
          }
          var3 = 0;
          var4 = 0;
          stackIn_73_0 = 0;
          break;
        }
        var5Lifetime1 = stackIn_73_0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (this.playerCount <= var5Lifetime1))) {
          stackIn_85_0 = ~(1 << var5Lifetime1 & this.eliminatedPlayerMask);
          stackIn_85_1 = -1;
          if (var9 == 0) {
            if (stackIn_85_0 == stackIn_85_1) {
              if (this.teamManaCollected[var5Lifetime1] >= this.collectedManaTarget) {
                var3++;
              }
              if (this.playerTurnCounts[var5Lifetime1] >= this.turnLimit) {
                var4 = 1;
              }
            }
            var5Lifetime1++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_85_0 = obfuscationGuard;
          stackIn_85_1 = 1;
        }
        if (stackIn_85_0 != stackIn_85_1) {
          discarded$0 = this.f((byte) 28);
        }
        boolean decompiledFrameCompleted0 = true;
        this.winnerCount = var3;
        if (this.winnerCount == 0 &&
          var4 != 0) {
          var5Lifetime2 = -1;
          var6 = 0;
          while (var6 < this.playerCount) {
            stackIn_100_0 = ~this.teamManaCollected[var6];
            stackIn_100_1 = ~var5Lifetime2;
            if (var9 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
            if (stackIn_100_0 != stackIn_100_1) {
              if (var5Lifetime2 < this.teamManaCollected[var6]) {
                this.winnerCount = 1;
                var5Lifetime2 = this.teamManaCollected[var6];
              }
            } else {
              this.winnerCount = this.winnerCount + 1;
            }
            var6++;
          }
        }
        if (decompiledFrameCompleted0) {
          stackIn_100_0 = 0;
          stackIn_100_1 = this.winnerCount;
        }
        if ((stackIn_100_0 != stackIn_100_1 ||
          !this.hasSingleSurvivor((byte) -42)) &&
          this.campaignMission == null) {
          return;
        }
        this.winnerCount = 1;
        return;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        this.a(param1, false, param0, param3);
        this.a(param1, false, 1 + param0, param3);
        this.a(1 + param1, false, param0, param3);
        if (param2 != -13) {
          return;
        }
        this.a(1 + param1, false, 1 + param0, param3);
    }

    final void healOrRaiseSkeletonAt(byte obfuscationGuard, int playerId, int tileY, int tileX) {
        MapTile var5;
        MapTile var6;
        if (obfuscationGuard <= 19) {
          return;
        }
        if (0 > tileX) {
          return;
        }
        if (tileY >= 0 &&
          tileX < this.mapWidth &&
          this.mapHeight > tileY) {
          var6 = this.tiles[this.mapWidth * tileY + tileX];
          var5 = var6;
          if (null != var6.occupant) {
            if (var6.occupant.unitType != 20) {
              return;
            }
            if (!this.arePlayersAllied(var6.occupant.ownerPlayer, -16985, playerId)) {
              return;
            }
            var6.occupant.strength = var6.occupant.maximumStrength;
            if (!ArmiesOfGielinor.obfuscationControl) {
              return;
            }
          }
          if (!var6.hasCorpse(89)) {
            return;
          }
          var5.occupant = new Unit(tileX, tileY, 20, playerId, 15, 15, 1, 0, 0, this, 0, 0, -1, false, 0);
          var6.clearCorpse(14);
          this.registerUnit(8288, var6.occupant);
          return;
        }
    }

    Battlefield(int param0, String[] param1, int param2, int[][] param3, int param4, boolean param5, boolean param6, int param7, int param8, int param9, boolean param10, int[][] param11, int param12, int param13, int param14, CampaignMission param15) {
        int[] array$2 = null;
        int[] array$3 = null;
        int incrementValue$4 = 0;
        int[] array$6 = null;
        int incrementValue$7 = 0;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        int stackIn_10_1 = 0;
        boolean stackIn_13_1 = false;
        boolean stackIn_16_2 = false;
        boolean stackIn_35_1 = false;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        boolean stackIn_57_1 = false;
        boolean stackIn_60_1 = false;
        int stackIn_91_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_145_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_168_1 = 0;
        int stackIn_179_0 = 0;
        int stackIn_179_1 = 0;
        int stackIn_192_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_215_0 = 0;
        int stackIn_215_1 = 0;
        int stackIn_220_0 = 0;
        RuntimeException stackIn_226_0 = null;
        StringBuilder stackIn_226_1 = null;
        String stackIn_227_2 = null;
        StringBuilder stackIn_229_1 = null;
        String stackIn_230_2 = null;
        StringBuilder stackIn_232_1 = null;
        String stackIn_233_2 = null;
        StringBuilder stackIn_235_1 = null;
        String stackIn_236_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        int[] var17 = null;
        RuntimeException var17_ref = null;
        int var18 = 0;
        int[] var19_ref_int__ = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var21_ref_int__ = null;
        int var22 = 0;
        int var23 = 0;
        String var23_ref_String = null;
        int var24 = 0;
        int var25 = 0;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        CampaignParticipant var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var17Lifetime1;
        int stackIn_145_0Lifetime1;
        int stackIn_168_0Lifetime1;
        int stackIn_168_1Lifetime1;
        int stackIn_179_0Lifetime1;
        int stackIn_179_1Lifetime1;
        int stackIn_204_0Lifetime1;
        int stackIn_215_0Lifetime1;
        int stackIn_215_1Lifetime1;
        int var19Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        int var20Lifetime1;
        int var19Lifetime2;
        int stackIn_168_0Lifetime1Lifetime1;
        int stackIn_168_1Lifetime1Lifetime1;
        int var19Lifetime1Lifetime1;
        int var21Lifetime1Lifetime1;
        var25 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_ab = 1;
        this.winnerCount = 0;
        this.field_eb = false;
        this.campaignManaMultiplier = 1.0f;
        this.snapshotBuffer = null;
        this.field_Cb = false;
        this.field_D = 0;
        this.field_J = false;
        this.field_o = false;
        this.field_V = true;
        this.kingBlackDragonSummoned = false;
        this.playerCoats = null;
        this.field_A = 0;
        this.field_r = true;
        this.field_qb = false;
        try {
          this.unitObservers = new NodeDeque();
          stackIn_4_1 = (param5);
          this.field_Ab = stackIn_4_1;
          stackIn_7_1 = (param10);
          this.teamGame = stackIn_7_1;
          this.playerCount = param1.length;
          this.campaignMission = param15;
          this.mapSizeSetting = param7;
          this.field_vb = param8;
          if (this.teamGame) {
            stackIn_10_1 = 2;
          } else {
            stackIn_10_1 = this.playerCount;
          }
          this.teamCount = stackIn_10_1;
          this.mapTheme = param9;
          this.field_Q = param12;
          stackIn_13_1 = !(param13 <= 0);
          this.field_L = stackIn_13_1;
          stackIn_16_2 = (this.campaignMission == null);
          this.field_V = stackIn_16_2;
          this.field_r = stackIn_16_2;
          this.matchConditions = new MatchConditionRegistry(this.playerCount);
          if (this.mapSizeSetting < 0) {
            this.mapSizeSetting = 0;
          }
          if (this.campaignMission == null) {
            if (2 < this.playerCount &&
              1 > this.mapSizeSetting) {
              this.mapSizeSetting = 1;
            }
            if (this.playerCount > 4 &&
              2 > this.mapSizeSetting) {
              this.mapSizeSetting = 2;
            }
            if (this.playerCount > 6 &&
              this.mapSizeSetting < 3) {
              this.mapSizeSetting = 3;
            }
            this.field_kb = false;
            if ((!(this.playerCount >= 4)) &&
              (!(this.mapSizeSetting <= 2)) &&
              (this.mapSizeSetting != 4)) {
              this.mapSizeSetting = 2;
              if (var25 != 0) {
                stackIn_35_1 = (mh.getProfileMissionScore(this.campaignMission.campaign.campaignIndex, -126, this.campaignMission.missionId) == 0);
                this.field_kb = stackIn_35_1;
              }
            }
          } else {
            stackIn_35_1 = (mh.getProfileMissionScore(this.campaignMission.campaign.campaignIndex, -126, this.campaignMission.missionId) == 0);
            this.field_kb = stackIn_35_1;
          }
          boolean decompiledFrameCompleted5 = true;
          boolean decompiledFrameRemainder0 = true;
          this.randomSeed = AttackEvent.a(false, 2147483647, li.field_n);
          this.teams = new TeamRoster[this.teamCount];
          this.playerTeamIndices = new int[this.playerCount];
          this.field_ib = param0;
          if (!this.teamGame ||
            null != this.campaignMission) {
            var17_int = 0;
            while (var17_int < this.playerCount) {
              this.teams[var17_int] = new TeamRoster(param1[var17_int], new int[]{var17_int});
              this.playerTeamIndices[var17_int] = var17_int;
              var17_int++;
              if (var25 != 0) {
                decompiledFrameCompleted5 = false;
                break;
              }
            }
            if (decompiledFrameCompleted5) {
              decompiledFrameRemainder0 = (var25 != 0);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted5)) {
            var31 = new int[this.playerCount / 2];
            var26 = var31;
            var17 = var26;
            var18 = 0;
            var32 = new int[this.playerCount / 2];
            var27 = var32;
            var19_ref_int__ = var27;
            var20 = 0;
            var21 = 0;
            while (true) {
              if (var21 < this.playerCount) {
                stackIn_51_0 = ~(var21 & 1);
                stackIn_51_1 = -1;
                if (var25 == 0) {
                  if (stackIn_51_0 == stackIn_51_1) {
                    var17[var18++] = var21;
                    this.playerTeamIndices[var21] = 0;
                  } else {
                    var19_ref_int__[var20++] = var21;
                    this.playerTeamIndices[var21] = 1;
                  }
                  var21++;
                  continue;
                }
              } else {
                stackIn_51_0 = var20;
                stackIn_51_1 = var18;
              }
              break;
            }
            if (stackIn_51_0 != stackIn_51_1) {
              throw new IllegalStateException("");
            }
            this.teams[0] = new TeamRoster(CampaignMission.field_p, var31);
            this.teams[1] = new TeamRoster(AnimationPlayer.field_n, var32);
          }
          if (decompiledFrameCompleted5) {
            this.pendingEvents = new NodeDeque();
            this.chosenGods = new int[this.playerCount][3];
            this.godFavourLevels = new int[this.playerCount][7];
            this.playerNames = param1;
            this.currentPlayer = param2;
            this.eliminationOrder = new int[this.playerCount];
            this.playerMana = new int[this.playerCount];
            this.mapHeight = 0;
            stackIn_57_1 = (param6);
            this.field_x = stackIn_57_1;
            this.teamManaCollected = new int[this.teamCount];
            this.remainingRuneCap = new int[this.playerCount];
            this.rankedParticipants = new int[this.teamCount];
            this.unitsByPlayer = new NodeDeque[this.playerCount];
            this.localPlayer = param4;
            this.field_a = param3;
            this.mapWidth = 0;
            stackIn_60_1 = (param5);
            this.field_b = stackIn_60_1;
            this.field_S = new int[this.teamCount];
            this.teamStructureCounts = new int[this.teamCount][3];
            this.playerTurnCounts = new int[this.playerCount];
            this.field_s = new int[3];
            this.field_U = new int[this.playerCount];
          }
          boolean decompiledFrameCompleted1 = true;
          if (this.field_b) {
            boolean decompiledFrameCompleted4 = true;
            boolean decompiledFrameCompleted3 = true;
            regionExit1: {
              if (param11 == null) {
                this.field_B = (int[][]) null;
                if (var25 == 0) {
                  break regionExit1;
                }
              }
              if (param11.length != 1) {
                this.field_B = new int[this.playerCount][];
                var17_int = 0;
                while (var17_int < this.playerCount) {
                  var18Lifetime1 = param11[var17_int].length;
                  stackIn_92_0 = var18Lifetime1;
                  stackIn_92_1 = 5;
                  if (var25 != 0) {
                    decompiledFrameCompleted4 = false;
                    break;
                  }
                  if (stackIn_92_0 < stackIn_92_1) {
                    var18Lifetime1 = 5;
                  }
                  array$2 = new int[var18Lifetime1];
                  this.field_B[var17_int] = array$2;
                  var19 = 0;
                  while (param11[var17_int].length > var19) {
                    this.field_B[var17_int][var19] = param11[var17_int][var19];
                    var19++;
                  }
                  var19Lifetime2 = param11[var17_int].length;
                  while (var18Lifetime1 > var19Lifetime2) {
                    this.field_B[var17_int][var19Lifetime2] = -1;
                    var19Lifetime2++;
                  }
                  var17_int++;
                }
                if ((decompiledFrameCompleted4) &&
                  (var25 == 0)) {
                  break regionExit1;
                }
              }
              if (decompiledFrameCompleted4) {
                this.field_B = new int[this.playerCount][5];
                var17_int = 0;
                while (this.playerCount > var17_int) {
                  stackIn_91_0 = 0;
                  if (var25 != 0) {
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  var18Lifetime1 = stackIn_91_0;
                  while (var18Lifetime1 < 5) {
                    this.field_B[var17_int][var18Lifetime1] = param11[0][var18Lifetime1];
                    var18Lifetime1++;
                  }
                  var17_int++;
                }
              }
            }
            if ((decompiledFrameCompleted4) &&
              (decompiledFrameCompleted3)) {
              stackIn_91_0 = ~param3.length;
            }
            if (decompiledFrameCompleted4) {
              stackIn_92_0 = stackIn_91_0;
              stackIn_92_1 = -2;
            }
            boolean decompiledFrameCompleted2 = true;
            if (stackIn_92_0 != stackIn_92_1) {
              this.field_a = param3;
            }
            if (stackIn_92_0 == stackIn_92_1 ||
              var25 != 0) {
              this.field_a = new int[this.playerCount][];
              var17_int = 0;
              while (var17_int < this.playerCount) {
                this.field_a[var17_int] = param3[0];
                var17_int++;
                if (var25 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted2) {
              this.field_d = new int[16];
              this.field_N = new int[16];
            }
            var17_int = 0;
            while (true) {
              if (var17_int < 16) {
                this.field_N[var17_int] = -1;
                var17_int++;
                if (var25 == 0) {
                  continue;
                }
              } else {
                this.field_d[15] = 2;
                this.field_d[12] = 30;
                this.field_d[4] = 5;
                this.field_d[10] = 500;
                this.field_Y = new int[this.playerCount];
                this.field_M = new int[this.playerCount];
                this.field_g = new int[this.playerCount];
                this.field_h = new int[this.playerCount];
                this.field_d[14] = 2;
                this.field_d[5] = 5;
                this.field_d[8] = 5;
                this.field_ob = new int[this.playerCount];
                this.field_d[7] = 3;
                this.field_d[6] = 3;
                this.field_d[11] = 30;
                this.field_ub = new int[this.playerCount];
                this.field_d[0] = 1;
                this.field_zb = new int[this.playerCount];
                this.field_y = new int[this.playerCount];
                this.field_d[13] = 10;
              }
              break;
            }
            var17_int = 0;
            while (var17_int < this.playerCount) {
              this.field_ub[var17_int] = 0;
              this.field_g[var17_int] = 0;
              this.field_h[var17_int] = 0;
              this.field_Y[var17_int] = 0;
              this.field_zb[var17_int] = 0;
              this.field_ob[var17_int] = 0;
              this.field_M[var17_int] = 0;
              this.field_y[var17_int] = 0;
              var17_int++;
              if (var25 != 0) {
                decompiledFrameCompleted1 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted1) &&
              (var25 != 0)) {
              this.field_a = new int[this.playerCount][];
              if (0 <= param4 &&
                param4 < this.field_a.length) {
                this.field_a[param4] = param3[0];
              }
            }
          } else {
            this.field_a = new int[this.playerCount][];
            if (0 <= param4 &&
              param4 < this.field_a.length) {
              this.field_a[param4] = param3[0];
            }
          }
          var17_int = 0;
          do {
            if (var17_int >= this.teamCount) {
              var17_int = 0;
              break;
            }
            this.teamStructureCounts[var17_int][0] = 0;
            this.teamStructureCounts[var17_int][1] = 0;
            this.teamStructureCounts[var17_int][2] = 0;
            this.rankedParticipants[var17_int] = var17_int;
            this.teamManaCollected[var17_int] = 0;
            var17_int++;
          } while (var25 == 0);
          while (true) {
            stackIn_118_0 = this.playerCount;
            stackIn_118_1 = var17_int;
            regionExit2: {
              boolean decompiledFrameCompleted0 = true;
              if (stackIn_118_0 > stackIn_118_1) {
                this.eliminationOrder[var17_int] = -1;
                this.unitsByPlayer[var17_int] = new NodeDeque();
                stackIn_220_0 = 0;
                if (var25 != 0) {
                  break regionExit2;
                }
                if (stackIn_220_0 != var17_int) {
                  this.playerMana[var17_int] = 200;
                } else {
                  this.playerMana[var17_int] = 150;
                }
                this.playerTurnCounts[var17_int] = 0;
                var18Lifetime2 = 0;
                scanLoop3: while (true) {
                  if (var18Lifetime2 < this.godFavourLevels[var17_int].length) {
                    this.godFavourLevels[var17_int][var18Lifetime2] = 0;
                    var18Lifetime2++;
                    continue;
                  }
                  if (!this.field_b &&
                    var17_int != this.localPlayer || (this.field_a[var17_int][4] != 0 ||
                    0 != this.field_a[var17_int][5] ||
                    0 != this.field_a[var17_int][6])) {
                    if (!this.field_L) {
                      var18Lifetime2 = 0;
                      while (var18Lifetime2 < 3) {
                        this.chosenGods[var17_int][var18Lifetime2] = -1;
                        var18Lifetime2++;
                      }
                      break scanLoop3;
                    }
                    var18Lifetime2 = 4;
                    var19Lifetime1 = 4;
                    while (this.field_a[var17_int].length > var19Lifetime1) {
                      stackIn_145_0 = this.field_a[var17_int][var19Lifetime1];
                      if (stackIn_145_0 != 0) {
                        var18Lifetime2++;
                      }
                      var19Lifetime1++;
                    }
                    array$3 = new int[var18Lifetime2];
                    this.chosenGods[var17_int] = array$3;
                    var19Lifetime1 = 0;
                    stackIn_145_0Lifetime1 = 0;
                    var20Lifetime1 = stackIn_145_0Lifetime1;
                    while (this.field_a[var17_int].length > var20Lifetime1) {
                      stackIn_118_0 = 0;
                      stackIn_118_1 = this.field_a[var17_int][var20Lifetime1];
                      if (stackIn_118_0 != stackIn_118_1) {
                        incrementValue$4 = var19Lifetime1;
                        var19Lifetime1++;
                        this.chosenGods[var17_int][incrementValue$4] = var20Lifetime1;
                      }
                      var20Lifetime1++;
                    }
                    break scanLoop3;
                  }
                  var18Lifetime2 = 0;
                  while (var18Lifetime2 < 3) {
                    this.chosenGods[var17_int][var18Lifetime2] = var18Lifetime2;
                    this.godFavourLevels[var17_int][this.chosenGods[var17_int][var18Lifetime2]] = 1;
                    var18Lifetime2++;
                  }
                  break;
                }
                this.godFavourLevels[var17_int][6] = 1;
                this.remainingRuneCap[var17_int] = BattleCharacter.field_i[this.field_Q];
                var17_int++;
                continue;
              }
              if (null != this.campaignMission) {
                regionExit4: {
                  regionExit5: {
                    var33 = this.campaignMission.getTeamAssignments((byte) -46);
                    var28 = var33;
                    var17Lifetime1 = var28;
                    if (var17Lifetime1 != null) {
                      this.teamCount = 0;
                      this.teamGame = true;
                      var18Lifetime2 = 0;
                      scanLoop6: while (true) {
                        if (var18Lifetime2 < var33.length) {
                          stackIn_168_0 = var33[var18Lifetime2];
                          stackIn_168_1 = this.teamCount;
                          if (var25 != 0) {
                            if (stackIn_168_0 <= stackIn_168_1) {
                              break regionExit5;
                            }
                            var19Lifetime1Lifetime1 = 0;
                            var20Lifetime1 = 0;
                            stackIn_192_0 = 0;
                            break regionExit4;
                          } else {
                            if (stackIn_168_0 > stackIn_168_1) {
                              this.teamCount = var33[var18Lifetime2];
                            }
                            var18Lifetime2++;
                            continue;
                          }
                        }
                        this.teamCount = this.teamCount + 1;
                        this.teams = new TeamRoster[this.teamCount];
                        var18Lifetime2 = 0;
                        while (true) {
                          stackIn_168_0Lifetime1 = ~var18Lifetime2;
                          stackIn_168_1Lifetime1 = ~this.teamCount;
                          if (stackIn_168_0Lifetime1 <= stackIn_168_1Lifetime1) {
                            break regionExit5;
                          }
                          var19Lifetime1Lifetime1 = 0;
                          var20Lifetime1 = 0;
                          stackIn_192_0 = 0;
                          if (var25 != 0) {
                            break regionExit4;
                          }
                          var21Lifetime1 = stackIn_192_0;
                          while (var21Lifetime1 < var33.length) {
                            stackIn_179_0 = var33[var21Lifetime1];
                            stackIn_179_1 = var18Lifetime2;
                            if (stackIn_179_0 == stackIn_179_1) {
                              if (~var21Lifetime1 == ~this.campaignMission.playerSlot) {
                                var19Lifetime1Lifetime1 = 1;
                              }
                              var20Lifetime1++;
                            }
                            var21Lifetime1++;
                          }
                          stackIn_179_0Lifetime1 = ~var20Lifetime1;
                          stackIn_179_1Lifetime1 = -1;
                          if (stackIn_179_0Lifetime1 == stackIn_179_1Lifetime1) {
                            break scanLoop6;
                          }
                          var34 = new int[var20Lifetime1];
                          var29 = var34;
                          var21_ref_int__ = var29;
                          var22 = 0;
                          var23 = 0;
                          while (var23 < var33.length) {
                            stackIn_168_0Lifetime1Lifetime1 = var33[var23];
                            stackIn_168_1Lifetime1Lifetime1 = var18Lifetime2;
                            if (stackIn_168_0Lifetime1Lifetime1 == stackIn_168_1Lifetime1Lifetime1) {
                              var21_ref_int__[var22++] = var23;
                              this.playerTeamIndices[var23] = var18Lifetime2;
                            }
                            var23++;
                          }
                          if (var19Lifetime1Lifetime1 != 0) {
                            var23_ref_String = param1[this.campaignMission.playerSlot];
                          } else {
                            var23_ref_String = param1[var34[0]];
                          }
                          this.teams[var18Lifetime2] = new TeamRoster(var23_ref_String, var34);
                          var18Lifetime2++;
                        }

                      }
                      throw new IllegalStateException("");
                    }
                  }
                  stackIn_192_0 = 0;
                }
                var18Lifetime2 = stackIn_192_0;
                while (var18Lifetime2 < this.playerCount) {
                  stackIn_220_0 = ~this.campaignMission.playerSlot;
                  if (var25 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_220_0 == ~var18Lifetime2) {
                    this.chosenGods[var18Lifetime2] = new int[]{this.campaignMission.campaign.localGodId};
                  } else {
                    var30 = this.campaignMission.campaign.participants[this.campaignMission.participantIds[var18Lifetime2]];
                    var20Lifetime1 = 0;
                    var21Lifetime1Lifetime1 = 1;
                    while (var21Lifetime1Lifetime1 < this.field_a[var18Lifetime2].length) {
                      stackIn_204_0 = this.field_a[var18Lifetime2][var21Lifetime1Lifetime1];
                      if (stackIn_204_0 != 0) {
                        var20Lifetime1++;
                      }
                      var21Lifetime1Lifetime1++;
                    }
                    array$6 = new int[var20Lifetime1];
                    this.chosenGods[var18Lifetime2] = array$6;
                    var21Lifetime1Lifetime1 = 0;
                    stackIn_204_0Lifetime1 = 0;
                    var22Lifetime1 = stackIn_204_0Lifetime1;
                    var23Lifetime1 = 1;
                    while (var23Lifetime1 < this.field_a[var18Lifetime2].length) {
                      var24 = var30.godFavourLevels[var23Lifetime1 - 1];
                      stackIn_215_0 = ~this.field_a[var18Lifetime2][var23Lifetime1];
                      stackIn_215_1 = -1;
                      if (stackIn_215_0 == stackIn_215_1) {
                        if (var22Lifetime1 < var24) {
                          var22Lifetime1 = var24;
                        }
                      } else {
                        this.godFavourLevels[var18Lifetime2][-1 + var23Lifetime1] = var24;
                        if (this.godFavourLevels[var18Lifetime2][-1 + var23Lifetime1] > this.godFavourLevels[var18Lifetime2][0]) {
                          this.godFavourLevels[var18Lifetime2][0] = this.godFavourLevels[var18Lifetime2][var23Lifetime1 - 1];
                        }
                        incrementValue$7 = var21Lifetime1Lifetime1;
                        var21Lifetime1Lifetime1++;
                        this.chosenGods[var18Lifetime2][incrementValue$7] = var23Lifetime1 - 1;
                      }
                      var23Lifetime1++;
                    }
                    stackIn_215_0Lifetime1 = ~var22Lifetime1;
                    stackIn_215_1Lifetime1 = -1;
                    if (stackIn_215_0Lifetime1 < stackIn_215_1Lifetime1) {
                      this.godFavourLevels[var18Lifetime2][6] = var22Lifetime1;
                    }
                  }
                  var18Lifetime2++;
                }
                if (decompiledFrameCompleted0) {
                  this.field_Cb = true;
                  this.field_D = 3;
                }
              }
              if (decompiledFrameCompleted0) {
                stackIn_220_0 = this.field_b ? 1 : 0;
              }
            }
            if (stackIn_220_0 != 0) {
              this.randomSeed = AttackEvent.a(false, 2147483647, li.field_n);
              this.l(0, 0);
            }
            this.turnLimit = this.b((byte) 32);
            this.f(-2);
            this.collectedManaTarget = this.f((byte) -80);
            this.field_F = false;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17_ref = decompiledCaughtException;
          stackIn_226_0 = var17_ref;
          stackIn_226_1 = new StringBuilder().append("ha.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_227_2 = "null";
          } else {
            stackIn_227_2 = "{...}";
          }
          stackIn_229_1 = ((StringBuilder) (Object) stackIn_226_1).append(stackIn_227_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_230_2 = "null";
          } else {
            stackIn_230_2 = "{...}";
          }
          stackIn_232_1 = ((StringBuilder) (Object) stackIn_229_1).append(stackIn_230_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_233_2 = "null";
          } else {
            stackIn_233_2 = "{...}";
          }
          stackIn_235_1 = ((StringBuilder) (Object) stackIn_232_1).append(stackIn_233_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_236_2 = "null";
          } else {
            stackIn_236_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_226_0), ((StringBuilder) (Object) stackIn_235_1).append(stackIn_236_2).append(')').toString());
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param2 = ia.a(param2, '_', 3, "");
          if (param1 != -26) {
            return true;
          }
          var3 = nf.a(true, param2);
          stackIn_8_0 = (param0.indexOf(param2) != -1) || (param0.indexOf(var3) != -1);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ha.ID(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_q = "AnimationEvent";
        field_nb = "Loading graphics";
        field_pb = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
    }
}
