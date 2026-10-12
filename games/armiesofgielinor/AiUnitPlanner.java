/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AiUnitPlanner extends IntrusiveNode {
    Unit selectedTarget;
    static String field_w;
    int previousSourceTile;
    AiActionCandidate selectedAction;
    static boolean[] field_q;
    private float field_p;
    private int decisionPriority;
    static String[] field_z;
    Unit unit;
    static int field_s;
    private float field_x;
    int previousTargetTile;
    static boolean field_t;
    AiPlanner planner;
    private float field_v;
    int previousDestinationTile;

    private final Unit getSelectedTarget(int obfuscationGuard) {
        if (this.selectedAction == null) {
          return null;
        }
        if (obfuscationGuard != -8786) {
          return (Unit) null;
        }
        Object var2 = null;
        if (this.selectedAction.hasTarget(81)) {
          var2 = this.planner.battlefield.getUnitAt(this.selectedAction.targetY, true, this.selectedAction.targetX);
        }
        return (Unit) (var2);
    }

    private final float scoreTile(int tileIndex, int obfuscationGuard, boolean submitCandidate, MovementPlanner movementPlanner) {
        float stackIn_10_0 = 0.0f;
        int stackIn_17_0 = 0;
        float stackIn_26_0 = 0.0f;
        float stackIn_32_0 = 0.0f;
        float stackIn_41_0 = 0.0f;
        int stackIn_46_0 = 0;
        float stackIn_88_0 = 0.0f;
        float stackIn_96_0 = 0.0f;
        int stackIn_97_1 = 0;
        int stackIn_146_0 = 0;
        float stackIn_218_0 = 0.0f;
        float stackIn_231_0 = 0.0f;
        RuntimeException stackIn_234_0 = null;
        StringBuilder stackIn_234_1 = null;
        String stackIn_235_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        float var6 = 0.0f;
        Battlefield battlefield = null;
        int tileX = 0;
        int tileY = 0;
        int sourceTileIndex = 0;
        int var11 = 0;
        MapTile tile = null;
        Object occupant = null;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int var17_int = 0;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19_int = 0;
        float var19 = 0.0f;
        int var20_int = 0;
        float var20 = 0.0f;
        int var21_int = 0;
        float var21 = 0.0f;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        float var25 = 0.0f;
        int var25_int = 0;
        int var26_int = 0;
        float var26 = 0.0f;
        float var27 = 0.0f;
        int var27_int = 0;
        float var28 = 0.0f;
        int var29 = 0;
        int var30 = 0;
        float var6Lifetime1;
        float var14Lifetime1;
        float var15Lifetime1;
        float var18Lifetime1;
        float var19Lifetime1;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var24Lifetime2;
        float var27Lifetime1;
        int var27_intLifetime1;
        var29 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = 1000000;
          if (obfuscationGuard != -5) {
            this.executeSelectedAction(-12);
          }
          var6 = -3.4028234663852886e+38f;
          battlefield = this.planner.battlefield;
          tileX = tileIndex % battlefield.mapWidth;
          tileY = tileIndex / battlefield.mapWidth;
          if (this == this.planner.currentUnitPlanner &&
            this.planner.tileEvaluationCache[tileIndex] != -3.4028234663852886e+38f) {
            var6Lifetime1 = this.planner.tileEvaluationCache[tileIndex];
          } else {
            sourceTileIndex = this.unit.tileX + battlefield.mapWidth * this.unit.tileY;
            if (this.unit.packedFlag256 &&
              tileIndex == sourceTileIndex) {
              stackIn_10_0 = -3.4028234663852886e+38f;
              return stackIn_10_0;
            }
            if (movementPlanner.movementCosts[tileIndex] > movementPlanner.getMovementBudget(obfuscationGuard + 27737)) {
              stackIn_17_0 = (sourceTileIndex != tileIndex) ? 1 : 0;
            } else {
              stackIn_17_0 = 0;
            }
            var11 = stackIn_17_0;
            tile = battlefield.tiles[tileIndex];
            if (var11 == 0 &&
              this.unit.hasMovementFlag1(false) &&
              sourceTileIndex != tileIndex &&
              this.unit.objectiveId == 0 &&
              this.unit.strength >= this.unit.maximumStrength) {
              var11 = 1;
            }
            movementPlanner.selectTarget(tileY, false, tileX, (byte) 93);
            if ((4 & movementPlanner.field_e[tileIndex]) == 0 &&
              var11 != 0) {
              stackIn_26_0 = -3.4028234663852886e+38f;
              return stackIn_26_0;
            }
            if (!movementPlanner.actionAllowed && (tileX != this.unit.tileX ||
              tileY != this.unit.tileY)) {
              stackIn_32_0 = -3.4028234663852886e+38f;
              return stackIn_32_0;
            }
            occupant = tile.occupant;
            if (occupant == this.unit) {
              occupant = null;
            }
            var14 = 0.0f;
            var15 = 0.0f;
            var6Lifetime1 = 0.0f;
            var16 = 0.0f;
            if (occupant != null) {
              if ((movementPlanner.field_e[tileIndex] & 4) == 0) {
                stackIn_41_0 = -3.4028234663852886e+38f;
                return stackIn_41_0;
              }
              if (0.0f != this.field_x) {
                var17_int = 1000000;
                var18 = -3.4028234663852886e+38f;
                stackIn_46_0 = (bw.unitDefinitions[this.unit.unitType][0] != 4) ? 0 : 1;
                var19_int = stackIn_46_0;
                var20_int = this.unit.getMaximumAttackRange(3257);
                var21_int = this.unit.getMinimumAttackRange((byte) -79);
                for (var22 = -var20_int; var22 <= var20_int; var22++) {
                  for (var23 = -var20_int; var20_int >= var23; var23++) {
                    var24 = Math.abs(var22) + Math.abs(var23);
                    if (var24 >= var21_int &&
                      var20_int >= var24 &&
                      this.planner.influenceMap.a(tileX, -42, var19_int != 0, var23, var22, tileY)) {
                      var26_int = var23 + tileX + battlefield.mapWidth * (var22 + tileY);
                      if (battlefield.tiles[var26_int].occupant == null ||
                        battlefield.tiles[var26_int].occupant == this.unit) {
                        var27 = this.scoreAttackFromTile(tileIndex, tileX + var23, tileY + var22, obfuscationGuard ^ -2);
                        if (var27 != -3.4028234663852886e+38f) {
                          if ((tile.terrainType == 11 ||
                            tile.terrainType == 7) &&
                            tile.isAlliedToPlayer(this.planner.playerId, (byte) 91)) {
                            if (var27 < 1.0f) {
                              var27 = 1.0f;
                            }
                            var27 = var27 * this.planner.weights[39];
                          }
                          if (this.field_v != 0.0f &&
                            tile.isStructure(false)) {
                            var27 = var27 * this.field_v;
                          } else {
                            var27 = var27 * this.field_x;
                          }
                          var28 = this.scoreTile(var26_int, -5, false, movementPlanner);
                          if (var28 != -3.4028234663852886e+38f) {
                            var27 = var28 + var27;
                            if (var18 < var27) {
                              var17_int = var26_int;
                              var18 = var27;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (1000000 == var17_int) {
                  stackIn_88_0 = -3.4028234663852886e+38f;
                  return stackIn_88_0;
                }
                var5_int = var17_int;
                var16 = var18;
                var6Lifetime1 = var6Lifetime1 + var16;
              }
            }
            if (occupant == null &&
              tile.isAlliedToPlayer(this.planner.playerId, (byte) 91) &&
              11 != tile.terrainType) {
              stackIn_96_0 = var6Lifetime1;
              if (tile.terrainType != 7) {
                stackIn_97_1 = 1;
              } else {
                stackIn_97_1 = 2;
              }
              var6Lifetime1 = stackIn_96_0 + (float)stackIn_97_1 * ((float)(-this.unit.strength + this.unit.maximumStrength) * this.planner.weights[12]);
            }
            if (sourceTileIndex == tileIndex &&
              !this.unit.a(23072)) {
              var6Lifetime1 = var6Lifetime1 + (float)(-this.unit.strength + this.unit.maximumStrength) * this.planner.weights[12];
            }
            if ((tile.terrainType == 11 ||
              tile.terrainType == 7) &&
              (tile.isAlliedToPlayer(this.planner.playerId, (byte) 91) &&
              this.planner.weights[53] < (float)battlefield.playerMana[this.planner.playerId])) {
              var6Lifetime1 = var6Lifetime1 - this.planner.weights[52] * (float)battlefield.playerMana[this.planner.playerId];
            }
            var17 = 0.0f;
            var18Lifetime1 = 0.0f;
            var19 = 0.0f;
            var20 = 0.0f;
            var21 = 0.0f;
            var22Lifetime1 = this.unit.getUnitCategory(obfuscationGuard ^ -5);
            var23Lifetime1 = this.unit.getUnitCategory(obfuscationGuard + 5);
            for (var24Lifetime1 = 0; var24Lifetime1 < 8; var24Lifetime1++) {
              if (1 != var24Lifetime1 &&
                0 != var24Lifetime1 ||
                var22Lifetime1 != 4) {
                var17 = var17 + (float)fk.matchupDamagePercent[var24Lifetime1][var22Lifetime1] * this.planner.field_K[var24Lifetime1][tileIndex] / 100.0f;
              }
              if (var24Lifetime1 != 4 ||
                this.unit.canAttackFlying((byte) 92)) {
                var18Lifetime1 = var18Lifetime1 + (float)fk.matchupDamagePercent[var22Lifetime1][var24Lifetime1] * this.planner.field_n[var23Lifetime1][var24Lifetime1][tileIndex] / 100.0f;
              }
              var30 = 0;
              var25_int = var30;
              while (8 > var30) {
                var20 = var20 + this.planner.field_A[var30][tileIndex] * this.planner.field_K[var24Lifetime1][tileIndex] * (float)fk.matchupDamagePercent[var30][var24Lifetime1] / 100.0f;
                var30++;
              }
              var21 = var21 + this.planner.field_K[var24Lifetime1][tileIndex];
            }
            var19Lifetime1 = this.planner.field_A[8][tileIndex];
            var20 = var20 / (1.0f + var21);
            if (0.0f == var16 &&
              this.field_v != 0.0f) {
              var15Lifetime1 = this.planner.weights[6] * this.planner.field_n[var23Lifetime1][9][tileIndex];
              if (this.unit.ownerPlayer != tile.ownerPlayer &&
                tile.isStructure(false)) {
                var15Lifetime1 = var15Lifetime1 * this.planner.weights[41];
              }
              var15Lifetime1 = var15Lifetime1 + this.planner.weights[46] * var20;
              var15Lifetime1 = var15Lifetime1 - this.planner.weights[7] * var17;
              var15Lifetime1 = var15Lifetime1 - var19Lifetime1 * this.planner.weights[8];
              if (tile.isStructure(false) &&
                this.unit.tileX == tileX &&
                tileY == this.unit.tileY &&
                tile.captureStrength < this.unit.getEffectiveStrength((byte) 122) * 4 &&
                tile.ownerPlayer != this.unit.ownerPlayer) {
                var15Lifetime1 = var15Lifetime1 + 999999.0f;
              }
              var6Lifetime1 = var6Lifetime1 + var15Lifetime1 * this.field_v;
            }
            if (this.unit.u(8)) {
              stackIn_146_0 = (this.unit.objectiveId == 0) ? 1 : 0;
            } else {
              stackIn_146_0 = 0;
            }
            var24Lifetime2 = stackIn_146_0;
            if (var16 == 0.0f && (var24Lifetime2 == 0 ||
              !submitCandidate)) {
              var25 = this.planner.field_n[var23Lifetime1][9][tileIndex];
              if (0.0f == this.field_v &&
                !this.unit.hasMovementFlag1(false)) {
                var25 = var25 - this.planner.field_V[tileIndex];
              }
              if (this.unit.objectiveId != 0) {
                var25 = var25 * this.planner.weights[60];
              }
              var14Lifetime1 = this.planner.weights[4] * var25;
              var14Lifetime1 = var14Lifetime1 + var18Lifetime1 * this.planner.weights[5];
              var26 = 1.0f;
              if (this.unit.canCaptureStructures(-21428)) {
                var26 = var26 * this.planner.weights[58];
              }
              if (this.unit.hasMovementFlag1(false)) {
                var26 = var26 * this.planner.weights[49];
              }
              var14Lifetime1 = var14Lifetime1 - var26 * (var17 * this.planner.weights[40]);
              if (this.unit.hasMovementFlag1(false)) {
                var14Lifetime1 = var14Lifetime1 + var20 * this.planner.weights[57];
              }
              if (!this.unit.canCaptureStructures(-21428) &&
                tile.isStructure(false) &&
                this.planner.playerId != tile.ownerPlayer) {
                var14Lifetime1 = var14Lifetime1 - this.planner.weights[38] * var19Lifetime1;
              }
              if (this.unit.f((byte) -109)) {
                var27_int = 0;
                if (0 < tileX &&
                  battlefield.tiles[-1 + tileIndex].hasCorpse(-58)) {
                  var27_int++;
                }
                if (battlefield.mapWidth - 1 > tileX &&
                  battlefield.tiles[tileIndex + 1].hasCorpse(117)) {
                  var27_int++;
                }
                if (tileY > 0 &&
                  battlefield.tiles[tileIndex - battlefield.mapWidth].hasCorpse(obfuscationGuard ^ 79)) {
                  var27_int++;
                }
                if (tileY < -1 + battlefield.mapHeight &&
                  battlefield.tiles[battlefield.mapWidth + tileIndex].hasCorpse(-117)) {
                  var27_int++;
                }
                var14Lifetime1 = var14Lifetime1 + this.planner.weights[10] * (float)var27_int;
              }
              if (this.unit.p((byte) -107) ||
                this.unit.d((byte) 105)) {
                var27_intLifetime1 = 0;
                if (sourceTileIndex != tileIndex - 1 &&
                  tileX > 0 &&
                  null != battlefield.tiles[tileIndex - 1].occupant &&
                  this.unit.ownerPlayer == battlefield.tiles[-1 + tileIndex].occupant.ownerPlayer) {
                  var27_intLifetime1++;
                }
                if (sourceTileIndex != 1 + tileIndex &&
                  tileX < battlefield.mapWidth - 1 &&
                  null != battlefield.tiles[1 + tileIndex].occupant &&
                  this.unit.ownerPlayer == battlefield.tiles[tileIndex + 1].occupant.ownerPlayer) {
                  var27_intLifetime1++;
                }
                if (-battlefield.mapWidth + tileIndex != sourceTileIndex &&
                  tileY > 0 &&
                  null != battlefield.tiles[-battlefield.mapWidth + tileIndex].occupant &&
                  battlefield.tiles[-battlefield.mapWidth + tileIndex].occupant.ownerPlayer == this.unit.ownerPlayer) {
                  var27_intLifetime1++;
                }
                if (sourceTileIndex != tileIndex + battlefield.mapWidth &&
                  tileY < -1 + battlefield.mapHeight &&
                  null != battlefield.tiles[battlefield.mapWidth + tileIndex].occupant &&
                  battlefield.tiles[battlefield.mapWidth + tileIndex].occupant.ownerPlayer == this.unit.ownerPlayer) {
                  var27_intLifetime1++;
                }
                var14Lifetime1 = var14Lifetime1 + (float)var27_intLifetime1 * this.planner.weights[11];
              }
              if (this.unit.s(124) &&
                battlefield.tiles[tileIndex].hasCorpse(81)) {
                var14Lifetime1 = var14Lifetime1 + this.planner.weights[51];
              }
              if (0 != this.unit.objectiveId) {
                if (!this.unit.hasMovementFlag1(false)) {
                  stackIn_218_0 = 1.0f;
                } else {
                  stackIn_218_0 = this.planner.weights[48];
                }
                var27Lifetime1 = stackIn_218_0;
                var14Lifetime1 = var14Lifetime1 + this.planner.objectiveInfluence[this.unit.getUnitCategory(0)][this.unit.objectiveId - 1][tileIndex] * var27Lifetime1;
              }
              var6Lifetime1 = var6Lifetime1 + var14Lifetime1 * this.field_p;
            }
            if (tileIndex == sourceTileIndex) {
              var6Lifetime1 = var6Lifetime1 + 0.0010000000474974513f;
            }
            if (this == this.planner.currentUnitPlanner) {
              this.planner.tileEvaluationCache[tileIndex] = var6Lifetime1;
            }
          }
          if (submitCandidate) {
            if (var5_int == 1000000) {
              if (var6Lifetime1 != 0.0f) {
                this.planner.getSelectionStrategy(this, (byte) 85).submitMoveCandidate(tileY, tileX, obfuscationGuard ^ 104, var6Lifetime1);
              }
            } else {
              this.planner.getSelectionStrategy(this, (byte) -88).submitAttackCandidate(var5_int / battlefield.mapWidth, tileX, var5_int % battlefield.mapWidth, -120, var6Lifetime1, tileY);
            }
          }
          stackIn_231_0 = var6Lifetime1;
          return stackIn_231_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_234_0 = var5;
          stackIn_234_1 = new StringBuilder().append("cl.J(").append(tileIndex).append(',').append(obfuscationGuard).append(',').append(submitCandidate).append(',');
          if (movementPlanner == null) {
            stackIn_235_2 = "null";
          } else {
            stackIn_235_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_234_0), ((StringBuilder) (Object) stackIn_234_1).append(stackIn_235_2).append(')').toString());
        }
    }

    final float evaluateActions(boolean selectAction, byte obfuscationGuard) {
        Unit discarded$0 = null;
        MovementPlanner stackIn_7_0 = null;
        float[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        float stackIn_28_2 = 0.0f;
        MovementPlanner var3;
        AiPlanningStrategy var4;
        float var5;
        int var6;
        float var7;
        int var8;
        MovementPlanner var9;
        int var6Lifetime1;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (selectAction &&
          this.unit.movementSpent &&
          this.unit.attacksRemaining <= 0) {
          return -3.4028234663852886e+38f;
        }
        if (selectAction) {
          stackIn_7_0 = this.planner.actionMovement;
        } else {
          stackIn_7_0 = this.planner.evaluationMovement;
        }
        var9 = stackIn_7_0;
        var3 = var9;
        if (obfuscationGuard >= -122) {
          discarded$0 = this.getSelectedTarget(-4);
        }
        var4 = this.planner.getSelectionStrategy(this, (byte) 86);
        if (selectAction) {
          var4.reset((byte) 72);
        }
        var9.prepareForUnit(false, 20, this.unit.ownerPlayer, this.unit, -1, -1);
        if (this.planner.currentUnitPlanner == this) {
          for (var6 = 0; this.planner.tileEvaluationCache.length > var6; var6++) {
            this.planner.tileEvaluationCache[var6] = -3.4028234663852886e+38f;
          }
        }
        var5 = -3.4028234663852886e+38f;
        for (var6Lifetime1 = 0; var9.movementCosts.length > var6Lifetime1; var6Lifetime1++) {
          if (!selectAction) {
            fs.field_b[var6Lifetime1] = 0.0f;
          }
          var7 = this.scoreTile(var6Lifetime1, -5, selectAction, var9);
          if (var5 < var7) {
            var5 = var7;
          }
          if (!selectAction) {
            stackIn_27_0 = fs.field_b;
            stackIn_27_1 = var6Lifetime1;
            if (-3.4028234663852886e+38f != var7) {
              stackIn_28_2 = var7;
            } else {
              stackIn_28_2 = -1.0f;
            }
            stackIn_27_0[stackIn_27_1] = stackIn_28_2;
          }
        }
        if (!selectAction) {
          var9.clearSelection(-57);
        } else {
          this.selectedAction = var4.selectCandidate((byte) -90);
          this.selectedTarget = this.getSelectedTarget(-8786);
          if (null == this.selectedAction ||
            this.selectedAction.executionResult == -2) {
            var5 = -3.4028234663852886e+38f;
          }
        }
        return var5;
    }

    private final int a(byte param0, boolean param1) {
        int var5 = 0;
        int[] var4;
        int var7;
        MovementPlanner var8;
        int[] var9;
        int[] var10;
        int[] stackIn_3_0 = null;
        MapTile var6;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var8 = this.planner.actionMovement;
        if (param1) {
          stackIn_3_0 = var8.movementCosts;
        } else {
          stackIn_3_0 = var8.field_k;
        }
        var10 = stackIn_3_0;
        var9 = var10;
        var4 = var9;
        if (param0 <= 14) {
          this.field_x = 1.991025686264038f;
        }
        for (var5 = 0; var5 < var8.movementCosts.length; var5++) {
          if (0 < var10[var5] &&
            var10[var5] <= var8.getMovementBudget(27732)) {
            var6 = this.planner.battlefield.tiles[var5];
            if (var6.isStructure(false) &&
              !var6.isAlliedToPlayer(this.planner.playerId, (byte) 91) && (null == var6.occupant ||
              !param1 &&
              this.planner.playerId == var6.occupant.ownerPlayer)) {
              return var5;
            }
          }
        }
        return 1000000;
    }

    final static void b(int param0, int param1) {
        CipherPacketBuffer var2 = vl.outgoingPacket;
        var2.writeCipheredOpcode(param0 ^ 32164, param1);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.writeByte(1, param0);
        var2.writeByte(1, vu.field_M.field_nc);
        int var4 = (vu.field_M.field_ac << 6) + vu.field_M.field_Tb;
        var2.writeByte(1, var4);
        var2.writeBytes(vu.field_M.field_pc, 0, vu.field_M.field_pc.length, -38);
        var2.writeByteLengthPrefix(var2.position - var3, param0 ^ 5935);
    }

    public static void a(int param0) {
        field_q = null;
        field_z = null;
        field_w = null;
        if (param0 != -31116) {
          field_w = (String) null;
        }
    }

    final boolean shouldFollow(byte obfuscationGuard, AiUnitPlanner otherPlanner) {
        RuntimeException var3 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (otherPlanner == null) {
            return false;
          }
          if (otherPlanner.decisionPriority > this.decisionPriority) {
            return true;
          }
          if (this.decisionPriority == otherPlanner.decisionPriority) {
            stackIn_10_0 = !(otherPlanner.unit.tileX + otherPlanner.unit.tileY >= this.unit.tileX + this.unit.tileY);
            return stackIn_10_0;
          }
          if (obfuscationGuard < -78) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("cl.D(").append(obfuscationGuard).append(',');
          if (otherPlanner == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void a(byte param0) {
        MovementPlanner var2 = this.planner.actionMovement;
        var2.prepareForUnit(false, 81, this.planner.playerId, this.unit, -1, -1);
        if (param0 <= 23) {
          this.decisionPriority = -31;
        }
    }

    private final void c(int param0, int param1) {
        int var4 = 0 / ((param1 - 80) / 41);
        int var3 = param0 % this.planner.battlefield.mapWidth;
        int var5 = param0 / this.planner.battlefield.mapWidth;
        float var6 = this.planner.weights[54] * this.planner.field_n[0][9][param0];
        this.planner.influenceMap.a(this.planner.field_V, true, var6, 0, (byte) -4, 9, var5, var3);
        this.planner.influenceMap.a(this.planner.field_V, true, var6, 0, (byte) -4, 9, this.unit.tileY, this.unit.tileX);
    }

    final void executeSelectedAction(int obfuscationGuard) {
        if (null != this.selectedAction &&
          this.selectedAction.executionResult != -2) {
          this.selectedAction.execute((byte) 5, this.planner);
        }
        if (obfuscationGuard != 4) {
          return;
        }
        this.planner.actionMovement.clearSelection(obfuscationGuard - 34);
    }

    final void refreshDecisionPriority(int obfuscationGuard) {
        int var2;
        int var3;
        MapTile var4;
        int var2Lifetime1;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.unit.movementSpent) {
          return;
        }
        if (this.unit.canCaptureStructures(-21428)) {
          this.field_v = this.planner.weights[33];
          this.field_x = this.planner.weights[34];
          this.field_p = this.planner.weights[35];
        } else {
          this.field_v = 0.0f;
          this.field_x = this.planner.weights[36];
          this.field_p = this.planner.weights[37];
        }
        this.decisionPriority = 100;
        if (!this.unit.canCaptureStructures(-21428)) {
          if (this.unit.getUnitCategory(0) == 5) {
            this.decisionPriority = 10;
          }
          if (2 == this.unit.getUnitCategory(0) ||
            3 == this.unit.getUnitCategory(0)) {
            this.decisionPriority = 200;
          }
        } else {
          this.decisionPriority = 50;
          this.a((byte) 67);
          if (this.a((byte) 124, true) != 1000000) {
            this.decisionPriority = 300;
          } else {
            var2 = this.a((byte) 125, false);
            if (var2 != 1000000) {
              this.c(var2, 122);
              this.decisionPriority = 1;
            }
          }
        }
        if (this.unit.hasMovementFlag1(false)) {
          this.decisionPriority = this.decisionPriority - 300;
        }
        if (this.unit.objectiveId != 0) {
          var4 = this.planner.battlefield.tiles[this.planner.battlefield.mapWidth * this.unit.tileY + this.unit.tileX];
          if (var4.getTag((byte) -107) == this.unit.objectiveId) {
            this.unit.objectiveId = 0;
          }
        }
        var2Lifetime1 = -97 % ((obfuscationGuard + 13) / 63);
        if (this.unit.objectiveId != 0) {
          this.decisionPriority = this.decisionPriority + 300;
        }
        if (this.unit.packedFlag256) {
          this.decisionPriority = this.decisionPriority + 500;
        }
        this.decisionPriority = this.decisionPriority + this.unit.getEffectiveStrength((byte) 122);
    }

    private final float scoreAttackFromTile(int targetTileIndex, int attackOriginX, int attackOriginY, int matchupCategory) {
        int stackIn_3_0 = 0;
        float stackIn_30_0 = 0.0f;
        float stackIn_33_0 = 0.0f;
        float stackIn_36_0 = 0.0f;
        float score;
        Battlefield battlefield;
        int targetX;
        int targetY;
        MapTile targetTile;
        Unit targetUnit;
        int targetDeltaX;
        int targetDeltaY;
        int meleeRange;
        int targetDamage;
        int unitDamage;
        int unitHealing;
        int targetHealing;
        int netTargetDamage;
        int netUnitDamage;
        float var21;
        int[] combatPrediction;
        float var21Lifetime1;
        float var21Lifetime2;
        float var21Lifetime3;
        float var21Lifetime4;
        score = 0.0f;
        battlefield = this.planner.battlefield;
        targetX = targetTileIndex % battlefield.mapWidth;
        targetY = targetTileIndex / battlefield.mapWidth;
        targetTile = battlefield.tiles[targetTileIndex];
        targetUnit = targetTile.occupant;
        targetDeltaX = -attackOriginX + targetX;
        targetDeltaY = targetY - attackOriginY;
        stackIn_3_0 = (Math.abs(targetDeltaX) + Math.abs(targetDeltaY) != 1) ? 0 : 1;
        meleeRange = stackIn_3_0;
        combatPrediction = battlefield.predictCombat(targetUnit, attackOriginY, (byte) -123, targetDeltaY, this.unit, targetDeltaX, attackOriginX);
        targetDamage = combatPrediction[0];
        unitDamage = combatPrediction[1];
        unitHealing = 0;
        if (targetUnit.getEffectiveStrength((byte) 122) < targetDamage) {
          targetDamage = targetUnit.getEffectiveStrength((byte) 122);
        }
        targetHealing = 0;
        if (this.unit.meleeLifeSteal &&
          meleeRange != 0) {
          unitHealing = targetDamage;
          if (unitHealing > -this.unit.strength + this.unit.maximumStrength) {
            unitHealing = -this.unit.strength + this.unit.maximumStrength;
          }
        }
        if (this.unit.getEffectiveStrength((byte) 122) + unitHealing < unitDamage) {
          unitDamage = unitHealing + this.unit.getEffectiveStrength((byte) 122);
        }
        if ((2 & combatPrediction[2]) == 0) {
          if (targetUnit.meleeLifeSteal &&
            meleeRange != 0) {
            targetHealing = unitDamage;
            if (-targetUnit.strength + targetUnit.maximumStrength < targetHealing) {
              targetHealing = -targetUnit.strength + targetUnit.maximumStrength;
            }
          }
          if (0 != (combatPrediction[2] & 1)) {
            targetHealing++;
          }
        } else {
          unitDamage = 0;
          unitHealing++;
        }
        if (this.unit.canParasitize(targetUnit, (byte) 115) &&
          !targetUnit.isFlying(-99)) {
          unitHealing = 0;
          targetHealing = 0;
          targetDamage = targetUnit.getEffectiveStrength((byte) 122);
          unitDamage = 0;
        }
        netTargetDamage = targetDamage - targetHealing;
        netUnitDamage = unitDamage - unitHealing;
        if (!targetUnit.hasMovementFlag1(false)) {
          stackIn_30_0 = 1.0f;
        } else {
          stackIn_30_0 = this.planner.weights[61];
        }
        var21 = stackIn_30_0;
        score = score + (float)netTargetDamage * this.planner.weights[0] * var21;
        if (!this.unit.hasMovementFlag1(false)) {
          stackIn_33_0 = 1.0f;
        } else {
          var21Lifetime1 = this.planner.weights[48];
          stackIn_33_0 = var21Lifetime1;
        }
        var21Lifetime2 = stackIn_33_0;
        score = score - (float)netUnitDamage * this.planner.weights[1] * var21Lifetime2;
        if (targetTile.hasModifierFlag1(12)) {
          var21Lifetime3 = this.planner.weights[50];
          stackIn_36_0 = var21Lifetime3;
        } else {
          stackIn_36_0 = 1.0f;
        }
        var21Lifetime4 = stackIn_36_0;
        score = score + this.planner.weights[2] * var21Lifetime4 * this.planner.field_n[0][9][targetTileIndex];
        if (0 != (combatPrediction[2] & 1) &&
          !targetUnit.hasMovementFlag1(false)) {
          score = score - this.planner.weights[32];
        }
        if (targetUnit.a(23072)) {
          score = score * this.planner.weights[47];
        }
        if (targetUnit.getUnitCategory(0) == matchupCategory) {
          score = score * this.planner.weights[31];
        }
        if (targetUnit.canCaptureStructures(-21428)) {
          score = score * this.planner.weights[30];
          if (battlefield.tiles[targetTileIndex].isStructure(false) &&
            battlefield.tiles[targetTileIndex].ownerPlayer != targetUnit.ownerPlayer) {
            score = score * this.planner.weights[30];
          }
        }
        if ((combatPrediction[2] & 1) != 0 &&
          1 >= combatPrediction[0]) {
          return -3.4028234663852886e+38f;
        }
        return score;
    }

    AiUnitPlanner(AiPlanner planner, Unit unit) {
        try {
          this.planner = planner;
          this.unit = unit;
          this.unit.aiPlanner = this;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "cl.<init>(" + (planner != null ? "{...}" : "null") + ',' + (unit != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_z = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_w = "Leaders cannot carry a ring of life.";
    }
}
