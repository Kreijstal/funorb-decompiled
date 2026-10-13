/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class MovementPlanner {
    private int mapWidth;
    static QuickChatCommandDefinition field_c;
    private boolean showMovementPath;
    private int[] pathDirections;
    int targetX;
    private boolean directAction;
    static String field_s;
    int[] movementCosts;
    int selectionMode;
    private Battlefield battlefield;
    int[] attackTargetMask;
    int targetY;
    boolean selectionActive;
    Unit unit;
    int targetDeltaX;
    int targetDeltaY;
    boolean controlsOtherPlayerUnit;
    private int actingPlayer;
    int spellId;
    int pathLength;
    boolean actionAllowed;
    int[] movementCostsThroughOwnUnits;
    private int mapHeight;
    private int unitType;
    static UiSelectionState field_z;
    static String field_v;
    boolean otherPlayerPreview;

    final int writeAttackMovementPacket(CipherPacketBuffer packet, byte obfuscationGuard, Unit attackedUnit) {
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var4_intLifetime1;
        try {
          if (this.directAction &&
            this.actionAllowed) {
            packet.writeCipheredOpcode(32161, 65);
            var4_int = 9;
            packet.writeByte(1, var4_int);
            packet.writeByte(1, 96);
            packet.writeByte(1, attackedUnit.tileX);
            packet.writeByte(1, attackedUnit.tileY);
            packet.writeByte(1, 0);
            packet.writeByte(1, 0);
            packet.writeByte(1, this.unit.tileX);
            packet.writeByte(1, this.unit.tileY);
            pd.a(this.targetDeltaX, this.targetDeltaY, packet, -100);
            stackIn_3_0 = var4_int;
            return stackIn_3_0;
          }
          if (this.pathDirections == null) {
            this.pathLength = 0;
          }
          if (this.pathLength == 0 &&
            0 == this.targetDeltaX &&
            this.targetDeltaY == 0) {
            stackIn_12_0 = -1;
            return stackIn_12_0;
          }
          stackIn_15_0 = 4;
          stackIn_15_1 = -(this.pathLength / 4);
          if (this.pathLength % 4 > 0) {
            stackIn_16_2 = 1;
          } else {
            stackIn_16_2 = 0;
          }
          var4_intLifetime1 = stackIn_15_0 - (stackIn_15_1 - (stackIn_16_2 + 5));
          if (obfuscationGuard > -24) {
            this.selectDirectAction(-36, 76, -91);
          }
          packet.writeCipheredOpcode(32161, 65);
          packet.writeByte(1, var4_intLifetime1);
          packet.writeByte(1, 96);
          packet.writeByte(1, attackedUnit.tileX);
          packet.writeByte(1, attackedUnit.tileY);
          packet.writeByte(1, (135 | this.pathLength) >> 8);
          packet.writeByte(1, 255 & this.pathLength);
          packet.writeByte(1, this.unit.tileX);
          packet.writeByte(1, this.unit.tileY);
          jj.a((byte) -112, this.pathLength, packet, this.pathDirections);
          pd.a(this.targetDeltaX, this.targetDeltaY, packet, -73);
          stackIn_19_0 = var4_intLifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("nn.N(");
          if (packet == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(obfuscationGuard).append(',');
          if (attackedUnit == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final void fillDirectRangeCosts(boolean allowOccupiedTiles, int range, int obfuscationGuard) {
        int tileXOrDeltaX;
        int tileYOrDeltaY;
        MapTile scannedTile;
        int manhattanDistance;
        MapTile targetTile;
        int obfuscationControl;
        Unit discardedUnit;
        int scanY;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 != (4 & this.battlefield.getTileEffects(31, this.unit.tileY, this.unit.tileX, this.unit.ownerPlayer))) {
          range = 0;
        }
        if (range < 0) {
          for (tileXOrDeltaX = 0; tileXOrDeltaX < this.mapWidth; tileXOrDeltaX++) {
            scanY = 0;
            tileYOrDeltaY = scanY;
            while (this.mapHeight > scanY) {
              scannedTile = this.battlefield.tiles[tileXOrDeltaX + scanY * this.mapWidth];
              if (scannedTile.terrainType != 2 &&
                7 != scannedTile.terrainType &&
                scannedTile.terrainType != 11 &&
                scannedTile.terrainType != 4 &&
                6 != scannedTile.terrainType && (scannedTile.occupant == null ||
                allowOccupiedTiles)) {
                this.movementCosts[tileXOrDeltaX + this.mapWidth * scanY] = 0;
              }
              scanY++;
            }
          }
        } else {
          if (allowOccupiedTiles) {
            if (this.unit.statusEffectType == 7) {
              range = range >> 1;
            } else {
              if (this.unit.statusEffectType == 8) {
                range = 0;
              }
            }
          }
          for (tileXOrDeltaX = -range; tileXOrDeltaX <= range; tileXOrDeltaX++) {
            for (tileYOrDeltaY = -range; tileYOrDeltaY <= range; tileYOrDeltaY++) {
              manhattanDistance = Math.abs(tileXOrDeltaX) + Math.abs(tileYOrDeltaY);
              if (tileXOrDeltaX + this.unit.tileX > -1 &&
                tileXOrDeltaX + this.unit.tileX < this.mapWidth &&
                this.unit.tileY + tileYOrDeltaY > -1 &&
                tileYOrDeltaY + this.unit.tileY < this.mapHeight) {
                targetTile = this.battlefield.tiles[this.mapWidth * (this.unit.tileY + tileYOrDeltaY) + (this.unit.tileX + tileXOrDeltaX)];
                if (2 != targetTile.terrainType && (targetTile.terrainType != 7 &&
                  targetTile.terrainType != 11 ||
                  allowOccupiedTiles) && (4 != targetTile.terrainType &&
                  6 != targetTile.terrainType &&
                  manhattanDistance <= range) && (null == targetTile.occupant ||
                  allowOccupiedTiles)) {
                  this.movementCosts[this.mapWidth * (tileYOrDeltaY + this.unit.tileY) + (tileXOrDeltaX + this.unit.tileX)] = 0;
                }
              }
            }
          }
        }
        if (obfuscationGuard <= 65) {
          discardedUnit = (Unit) null;
          this.prepareForUnit(true, 39, -101, (Unit) null, -116, -60);
        }
    }

    final void selectTarget(int targetY, boolean allowOtherPlayer, int targetX, byte obfuscationGuard) {
        int guardQuotient;
        Unit targetUnit;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.unit == null) {
          return;
        }
        if (this.actingPlayer != this.unit.ownerPlayer &&
          !allowOtherPlayer &&
          this.spellId != 36) {
          return;
        }
        if (0 <= targetY &&
          0 <= targetX &&
          this.mapWidth > targetX &&
          targetY < this.mapHeight) {
          this.showMovementPath = false;
          this.actionAllowed = false;
          this.targetY = targetY;
          this.targetDeltaY = 0;
          this.directAction = false;
          guardQuotient = -124 / ((-19 - obfuscationGuard) / 60);
          this.pathDirections = null;
          this.targetDeltaX = 0;
          this.targetX = targetX;
          if (this.unit.unitType != 51 && (this.spellId <= -1 ||
            uc.spellDefinitions[this.spellId][5] != 24)) {
            targetUnit = this.battlefield.getUnitAt(targetY, true, targetX);
            if (targetUnit == null) {
              this.reconstructPath(targetY, (byte) -116, targetX);
              return;
            }
            if (targetUnit.ownerPlayer == this.actingPlayer &&
              !this.controlsOtherPlayerUnit) {
              return;
            }
            this.selectAttackTarget(targetY, targetX, (byte) -120);
            return;
          }
          this.selectDirectAction(targetY, targetX, 0);
          return;
        }
        this.clearPath(-116);
    }

    final void reconstructPath(int targetY, byte obfuscationGuard, int targetX) {
        boolean movementAvailable = false;
        int targetIndex;
        int pathTileIndex;
        int pathTileX;
        int pathTileY;
        int pathStepIndex;
        int predecessorDirection;
        int directionBranch;
        int obfuscationControl;
        int storedPredecessorDirection;
        int storedDirectionBranch;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        targetIndex = targetY * this.mapWidth + targetX;
        pathTileIndex = targetIndex;
        pathTileX = targetX;
        pathTileY = targetY;
        if (this.unit.packedFlag8 &&
          this.unit.unitType != 0) {
        }
        pathStepIndex = 0;
        this.showMovementPath = true;
        if (-1 < this.spellId &&
          uc.spellDefinitions[this.spellId][5] == 18) {
        }
        while (true) {
          if (this.movementCosts[pathTileIndex] > 0) {
            predecessorDirection = this.choosePredecessorDirection(pathTileIndex, (byte) 84, pathTileX, pathTileY);
            directionBranch = predecessorDirection;
            if (directionBranch == 1) {
              pathTileY--;
              pathTileIndex = pathTileIndex - this.mapWidth;
            } else {
              if (directionBranch != 0) {
                if (2 != directionBranch) {
                  if (3 == directionBranch) {
                    pathTileX--;
                    pathTileIndex--;
                  }
                } else {
                  pathTileY++;
                  pathTileIndex = pathTileIndex + this.mapWidth;
                }
              } else {
                pathTileX++;
                pathTileIndex++;
              }
            }
            pathStepIndex++;
            if (99 >= pathStepIndex) {
              continue;
            }
            this.pathDirections = null;
            break;
          }
          pathTileY = targetY;
          pathTileX = targetX;
          pathTileIndex = targetIndex;
          this.pathDirections = new int[pathStepIndex];
          pathStepIndex--;
          while (0 < this.movementCosts[pathTileIndex]) {
            storedPredecessorDirection = this.choosePredecessorDirection(pathTileIndex, (byte) 39, pathTileX, pathTileY);
            this.pathDirections[pathStepIndex] = GrowthEvent.bitwiseXor(3, storedPredecessorDirection);
            storedDirectionBranch = storedPredecessorDirection;
            if (1 == storedDirectionBranch) {
              pathTileIndex = pathTileIndex - this.mapWidth;
              pathTileY--;
            } else {
              if (storedDirectionBranch != 0) {
                if (storedDirectionBranch != 2) {
                  if (storedDirectionBranch == 3) {
                    pathTileX--;
                    pathTileIndex--;
                  }
                } else {
                  pathTileIndex = pathTileIndex + this.mapWidth;
                  pathTileY++;
                }
              } else {
                pathTileIndex++;
                pathTileX++;
              }
            }
            pathStepIndex--;
          }
          this.pathLength = this.pathDirections.length;
          movementAvailable = !(this.unit.movementSpent);
          this.actionAllowed = movementAvailable;
          break;
        }
        this.selectionActive = true;
        if (obfuscationGuard != -116) {
          this.otherPlayerPreview = false;
        }
        return;
    }

    private final void selectAttackTarget(int targetY, int targetX, byte obfuscationGuard) {
        int deltaX = 0;
        int deltaY = 0;
        boolean attackAvailable = false;
        LineOfSightGrid visibilityGrid;
        int visibilityOriginY;
        int visibilityTargetX;
        int visibilityOriginX;
        boolean category4Visibility = false;
        int maximumAttackRange;
        int minimumAttackRange;
        int bestMovementCost;
        int selectedOriginX;
        int selectedOriginY;
        int manhattanDistance;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.unit.tileX == targetX &&
          targetY == this.unit.tileY) {
          return;
        }
        if ((4 & this.attackTargetMask[targetX + targetY * this.mapWidth]) == 0) {
          this.actionAllowed = false;
          return;
        }
        maximumAttackRange = bw.unitDefinitions[this.unit.unitType][7];
        minimumAttackRange = bw.unitDefinitions[this.unit.unitType][6];
        if (obfuscationGuard != -120) {
          this.mapHeight = 82;
        }
        if (this.unit.packedFlag8 &&
          this.unit.unitType == 34) {
          maximumAttackRange = 7;
          minimumAttackRange = 2;
          if (3 == this.unit.getEquipmentCategory(20640)) {
            maximumAttackRange = maximumAttackRange + this.unit.getEquipmentProperty(1, 115);
          }
        }
        if ((this.unit.unitType == 81 ||
          4 == this.unit.unitType ||
          74 == this.unit.unitType) &&
          this.unit.getEquipmentCategory(20640) == 3) {
          maximumAttackRange = maximumAttackRange + this.unit.getEquipmentProperty(1, obfuscationGuard ^ 21);
        } else if (3 == this.unit.getUnitCategory(0) &&
          this.unit.getEquipmentCategory(obfuscationGuard ^ -20696) == 2) {
          maximumAttackRange = maximumAttackRange + this.unit.getEquipmentProperty(1, -87);
        } else {
          if (this.unit.getUnitCategory(0) == 2 &&
            this.unit.getEquipmentCategory(20640) == 1) {
            maximumAttackRange = maximumAttackRange + this.unit.getEquipmentProperty(1, obfuscationGuard ^ 41);
          }
        }
        if ((1 & this.attackTargetMask[targetY * this.mapWidth + targetX]) != 1) {
          bestMovementCost = 3 * bw.unitDefinitions[this.unit.unitType][3];
          if (this.unit.packedFlag8 &&
            this.unit.unitType != 0) {
            bestMovementCost = 0;
          }
          if (this.spellId > -1 &&
            uc.spellDefinitions[this.spellId][5] == 18) {
            bestMovementCost = bestMovementCost << 1;
          }
          selectedOriginX = this.unit.tileX;
          this.showMovementPath = true;
          selectedOriginY = this.unit.tileY;
          for (deltaX = -maximumAttackRange; maximumAttackRange >= deltaX; deltaX++) {
            for (deltaY = -maximumAttackRange; maximumAttackRange >= deltaY; deltaY++) {
              manhattanDistance = Math.abs(deltaX) + Math.abs(deltaY);
              if (-1 < deltaX + targetX &&
                this.mapWidth > deltaX + targetX &&
                targetY + deltaY > -1 &&
                this.mapHeight > targetY + deltaY &&
                manhattanDistance <= maximumAttackRange &&
                minimumAttackRange <= manhattanDistance && (1 == manhattanDistance ||
                (2 & this.battlefield.getTileEffects(31, deltaY + targetY, targetX + deltaX, this.unit.ownerPlayer)) == 0 &&
                0 == (this.battlefield.getTileEffects(31, targetY, targetX, this.unit.ownerPlayer) & 2)) && this.movementCosts[targetX + (deltaX + this.mapWidth * (targetY + deltaY))] <= bestMovementCost) {
                visibilityGrid = this.battlefield.lineOfSightGrid;
                visibilityOriginY = deltaY + targetY;
                visibilityTargetX = targetX;
                visibilityOriginX = targetX + deltaX;
                category4Visibility = (this.unit.getUnitCategory(0) == 4);
                if (((LineOfSightGrid) (Object) visibilityGrid).computeVisibility(visibilityOriginY, visibilityTargetX, visibilityOriginX, category4Visibility, maximumAttackRange, targetY, (byte) 86)) {
                  bestMovementCost = this.movementCosts[targetX + deltaX + this.mapWidth * (targetY + deltaY)];
                  selectedOriginY = deltaY + targetY;
                  selectedOriginX = deltaX + targetX;
                  this.actionAllowed = true;
                }
              }
            }
          }
          if (this.actionAllowed) {
            this.reconstructPath(selectedOriginY, (byte) -116, selectedOriginX);
            this.targetDeltaX = -selectedOriginX + targetX;
            this.targetDeltaY = targetY - selectedOriginY;
          }
        } else {
          attackAvailable = !(this.unit.attacksRemaining <= 0);
          this.actionAllowed = attackAvailable;
          this.targetDeltaY = targetY - this.unit.tileY;
          this.targetDeltaX = targetX - this.unit.tileX;
        }
        this.selectionActive = true;
        return;
    }

    private final void selectDirectAction(int targetY, int targetX, int requiredCost) {
        this.directAction = true;
        if (requiredCost == this.movementCosts[this.mapWidth * targetY + targetX]) {
          this.actionAllowed = true;
          this.targetDeltaY = -this.unit.tileY + targetY;
          this.targetDeltaX = targetX - this.unit.tileX;
        } else {
          this.actionAllowed = false;
        }
        this.selectionActive = true;
        this.actionAllowed = this.actionAllowed & (!this.unit.movementSpent ? true : false);
    }

    final void drawSelectedPath(BattleCamera camera, int obfuscationGuard) {
        int var10 = 0;
        RgbSprite[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          camera.gridPosition[0] = this.unit.tileX;
          camera.gridPosition[1] = this.unit.tileY;
          camera.projectModelAnchor(9470337);
          if (obfuscationGuard != -4) {
            field_v = (String) null;
          }
          var3_int = camera.screenPosition[0];
          var4 = camera.screenPosition[1];
          TaggedMapData.field_f[10].drawTransparent(var3_int, var4);
          camera.gridPosition[1] = this.targetY;
          camera.gridPosition[0] = this.targetX;
          camera.projectModelAnchor(obfuscationGuard + 9470341);
          var5 = camera.screenPosition[0];
          var6 = camera.screenPosition[1];
          var7 = this.getMovementBudget(27732);
          var8 = 0;
          if (!this.directAction) {
            if (this.showMovementPath) {
              var9 = 0;
              if (this.actionAllowed &&
                this.actingPlayer == this.battlefield.currentPlayer) {
                var9 += 6;
              }
              if (null != this.pathDirections) {
                for (var10 = 0; this.pathDirections.length > var10; var10++) {
                  var11 = 0;
                  var12 = 0;
                  var13 = this.pathDirections[var10];
                  if (1 == var13) {
                    var11 = -10;
                    var12 = -5;
                  } else {
                    if (var13 != 0) {
                      if (2 == var13) {
                        var11 = 10;
                        var12 = 5;
                      } else {
                        if (var13 == 3) {
                          var11 = -10;
                          var12 = 5;
                        }
                      }
                    } else {
                      var11 = 10;
                      var12 = -5;
                    }
                  }
                  TaggedMapData.field_f[this.pathDirections[var10] + var9].drawWithOpacity(var3_int, var4, 128);
                  TaggedMapData.field_f[this.pathDirections[var10] + var9].drawWithOpacity(var11 + var3_int, var4 + var12, 128);
                  TaggedMapData.field_f[this.pathDirections[var10] + var9].drawWithOpacity(var3_int + (var11 << 1), (var12 << 1) + var4, 128);
                  if (var10 < this.pathDirections.length - 1 &&
                    this.pathDirections[1 + var10] == this.pathDirections[var10]) {
                    TaggedMapData.field_f[this.pathDirections[var10] + var9].drawWithOpacity(var3_int + 3 * var11, 3 * var12 + var4, 128);
                  }
                  var4 = var4 + (var12 << 2);
                  var3_int = var3_int + (var11 << 2);
                  if (var8 == 0) {
                    camera.screenPosition[1] = var12 + 16 + var4;
                    camera.screenPosition[0] = 32 + var3_int + var11;
                    camera.screenToGrid(false);
                    if (this.actionAllowed &&
                      this.movementCosts[camera.gridPosition[0] + camera.gridPosition[1] * this.mapWidth] > var7) {
                      var9 = 0;
                      var8 = 1;
                    }
                  }
                }
              }
              TaggedMapData.field_f[var9 + 5].drawWithOpacity(var5, var6, 128);
            }
          } else {
            stackIn_6_0 = TaggedMapData.field_f;
            stackIn_6_1 = 5;
            if (!this.actionAllowed) {
              stackIn_7_2 = 0;
            } else {
              stackIn_7_2 = 6;
            }
            ((RgbSprite) (Object) stackIn_6_0[stackIn_6_1 + stackIn_7_2]).drawTransparent(var5, var6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_44_0 = var3;
          stackIn_44_1 = new StringBuilder().append("nn.O(");
          if (camera == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void clearSelection(int obfuscationGuard) {
        this.clearPath(-42);
        this.unit = null;
        this.spellId = -1;
        if (obfuscationGuard >= -14) {
          return;
        }
        this.resetCosts(0);
    }

    final void clearPath(int obfuscationGuard) {
        int var2 = -37 / ((obfuscationGuard - 49) / 52);
        this.selectionActive = false;
        this.pathDirections = null;
    }

    private final int choosePredecessorDirection(int tileIndex, byte obfuscationGuard, int tileX, int tileY) {
        int bestCost;
        int predecessorDirection;
        int guardRemainder;
        bestCost = this.movementCosts[tileIndex];
        guardRemainder = 30 % ((-18 - obfuscationGuard) / 38);
        predecessorDirection = -1;
        if (tileX > 0 &&
          this.movementCosts[-1 + tileIndex] < bestCost &&
          this.battlefield.getMovementStepCost(tileIndex - 1, -16, tileIndex, this.unit.ownerPlayer, this.unit, true) == this.movementCosts[tileIndex] - this.movementCosts[tileIndex - 1]) {
          predecessorDirection = 3;
          bestCost = this.movementCosts[tileIndex - 1];
        }
        if (tileX < -1 + this.mapWidth &&
          this.movementCosts[1 + tileIndex] < bestCost &&
          this.battlefield.getMovementStepCost(1 + tileIndex, -16, tileIndex, this.unit.ownerPlayer, this.unit, true) == -this.movementCosts[1 + tileIndex] + this.movementCosts[tileIndex]) {
          predecessorDirection = 0;
          bestCost = this.movementCosts[1 + tileIndex];
        }
        if (tileY > 0 &&
          bestCost > this.movementCosts[tileIndex - this.mapWidth] &&
          this.battlefield.getMovementStepCost(-this.mapWidth + tileIndex, -16, tileIndex, this.unit.ownerPlayer, this.unit, true) == -this.movementCosts[tileIndex - this.mapWidth] + this.movementCosts[tileIndex]) {
          predecessorDirection = 1;
          bestCost = this.movementCosts[tileIndex - this.mapWidth];
        }
        if (this.mapWidth - 1 > tileY &&
          bestCost > this.movementCosts[tileIndex + this.mapWidth] &&
          this.battlefield.getMovementStepCost(tileIndex + this.mapWidth, -16, tileIndex, this.unit.ownerPlayer, this.unit, true) == -this.movementCosts[tileIndex + this.mapWidth] + this.movementCosts[tileIndex]) {
          predecessorDirection = 2;
          bestCost = this.movementCosts[this.mapWidth + tileIndex];
        }
        return predecessorDirection;
    }

    final int getMovementBudget(int obfuscationGuard) {
        int discarded$0 = 0;
        if (obfuscationGuard != 27732) {
          discarded$0 = this.choosePredecessorDirection(-31, (byte) 81, -84, 42);
        }
        int var2 = 3 * bw.unitDefinitions[this.unitType][3];
        if (this.spellId > -1 &&
          18 == uc.spellDefinitions[this.spellId][5]) {
          var2 = var2 << 1;
        }
        if (this.unit != null) {
          if (7 == this.unit.statusEffectType) {
            var2 = var2 >> 1;
          } else {
            if (this.unit.statusEffectType == 8) {
              var2 = 0;
            }
          }
          if ((4 & this.battlefield.getTileEffects(31, this.unit.tileY, this.unit.tileX, this.unit.ownerPlayer)) != 0) {
            var2 = 0;
          }
        }
        return var2;
    }

    public static void b(int param0) {
        if (param0 >= -30) {
          MovementPlanner.b(51);
        }
        field_s = null;
        field_c = null;
        field_z = null;
        field_v = null;
    }

    final void prepareForUnit(boolean allowOtherPlayer, int obfuscationGuard, int actingPlayer, Unit unit, int selectionMode, int spellId) {
        int scanY = 0;
        int scanX = 0;
        int costGridVariant = 0;
        boolean otherPlayerUnit = false;
        boolean previewOtherPlayer = false;
        int[] selectedCostGrid = null;
        int ownOccupantsAllowed = 0;
        int category4Visibility = 0;
        int category4TargetsAllowed = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        int maximumAttackRange = 0;
        RuntimeException var7 = null;
        int minimumAttackRange = 0;
        int movementBudget = 0;
        int minimumX = 0;
        int maximumX = 0;
        int minimumY = 0;
        int maximumY = 0;
        int relaxationPass = 0;
        int greatestUpdatedCost = 0;
        int tileIndex = 0;
        int[] costGrid = null;
        int allowUnmovedOwnUnits = 0;
        int candidateCost = 0;
        int leftStepCost = 0;
        int obfuscationControl = 0;
        CipherPacketBuffer var25 = null;
        int[] costGridAlias = null;
        int[] mutableCostGrid = null;
        int ignoreBlockingTerrain;
        int allowCategory4Targets;
        int upStepCost;
        int rightStepCost;
        int downStepCost;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.actingPlayer = actingPlayer;
          this.spellId = spellId;
          this.selectionActive = false;
          this.selectionMode = selectionMode;
          otherPlayerUnit = (this.actingPlayer != unit.ownerPlayer);
          this.controlsOtherPlayerUnit = otherPlayerUnit;
          this.unit = unit;
          previewOtherPlayer = (allowOtherPlayer) && (this.controlsOtherPlayerUnit);
          this.otherPlayerPreview = previewOtherPlayer;
          if (obfuscationGuard <= 10) {
            var25 = (CipherPacketBuffer) null;
            this.writeMovementPacket(true, (CipherPacketBuffer) null);
          }
          this.unitType = this.unit.unitType;
          maximumAttackRange = this.unit.getMaximumAttackRange(3257);
          minimumAttackRange = this.unit.getMinimumAttackRange((byte) -79);
          this.resetCosts(0);
          if (this.spellId > -1 &&
            24 == uc.spellDefinitions[this.spellId][5]) {
            this.fillDirectRangeCosts(false, uc.spellDefinitions[this.spellId][6], 93);
            return;
          }
          if (this.unitType == 51) {
            this.fillDirectRangeCosts(true, bw.unitDefinitions[this.unitType][3], 112);
            return;
          }
          movementBudget = this.getMovementBudget(27732);
          minimumX = this.unit.tileX;
          maximumX = this.unit.tileX;
          minimumY = this.unit.tileY;
          maximumY = this.unit.tileY;
          this.movementCosts[this.unit.tileX + this.mapWidth * this.unit.tileY] = 0;
          this.movementCostsThroughOwnUnits[this.unit.tileX + this.mapWidth * this.unit.tileY] = 0;
          if (!this.unit.packedFlag8 ||
            this.unit.unitType == 0) {
            for (relaxationPass = 0; relaxationPass < 500; relaxationPass++) {
              greatestUpdatedCost = 0;
              tileIndex = 0;
              for (scanY = 0; scanY < this.mapWidth; scanY++) {
                for (scanX = 0; scanX < this.mapHeight; scanX++) {
                  for (costGridVariant = 0; costGridVariant < 2; costGridVariant++) {
                    if (costGridVariant == 0) {
                      selectedCostGrid = this.movementCosts;
                    } else {
                      selectedCostGrid = this.movementCostsThroughOwnUnits;
                    }
                    mutableCostGrid = selectedCostGrid;
                    costGridAlias = mutableCostGrid;
                    costGrid = costGridAlias;
                    ownOccupantsAllowed = (costGridVariant != 1) ? 0 : 1;
                    allowUnmovedOwnUnits = ownOccupantsAllowed;
                    candidateCost = 1000000;
                    if (scanX > 0) {
                      leftStepCost = this.battlefield.getMovementStepCost(this.unit, allowUnmovedOwnUnits != 0, 14336, true, tileIndex, -1 + tileIndex, this.unit.ownerPlayer);
                      if (candidateCost > leftStepCost + costGrid[-1 + tileIndex]) {
                        candidateCost = leftStepCost + costGrid[-1 + tileIndex];
                        if (maximumX < scanX &&
                          movementBudget >= candidateCost) {
                          maximumX = scanX;
                        }
                      }
                    }
                    if (scanY > 0) {
                      upStepCost = this.battlefield.getMovementStepCost(this.unit, allowUnmovedOwnUnits != 0, 14336, true, tileIndex, -this.mapWidth + tileIndex, this.unit.ownerPlayer);
                      if (scanY > 0 &&
                        costGrid[tileIndex - this.mapWidth] + upStepCost < candidateCost) {
                        candidateCost = costGrid[tileIndex - this.mapWidth] + upStepCost;
                      }
                    }
                    if (scanX < -1 + this.mapWidth) {
                      rightStepCost = this.battlefield.getMovementStepCost(this.unit, allowUnmovedOwnUnits != 0, 14336, true, tileIndex, tileIndex + 1, this.unit.ownerPlayer);
                      if (candidateCost > costGrid[tileIndex + 1] + rightStepCost) {
                        candidateCost = costGrid[tileIndex + 1] + rightStepCost;
                      }
                    }
                    if (scanY < this.mapHeight - 1) {
                      downStepCost = this.battlefield.getMovementStepCost(this.unit, allowUnmovedOwnUnits != 0, 14336, true, tileIndex, tileIndex + this.mapWidth, this.unit.ownerPlayer);
                      if (costGrid[this.mapWidth + tileIndex] + downStepCost < candidateCost) {
                        candidateCost = costGrid[tileIndex + this.mapWidth] + downStepCost;
                      }
                    }
                    if (candidateCost < mutableCostGrid[tileIndex]) {
                      if (minimumX > scanX) {
                        minimumX = scanX;
                      }
                      if (scanX > maximumX) {
                        maximumX = scanX;
                      }
                      if (greatestUpdatedCost < candidateCost) {
                        greatestUpdatedCost = candidateCost;
                      }
                      if (scanY > maximumY) {
                        maximumY = scanY;
                      }
                      mutableCostGrid[tileIndex] = candidateCost;
                      if (minimumY > scanY) {
                        minimumY = scanY;
                      }
                    }
                  }
                  tileIndex++;
                }
              }
              if (0 == greatestUpdatedCost) {
                break;
              }
            }
          }
          category4Visibility = (4 != bw.unitDefinitions[unit.unitType][0]) ? 0 : 1;
          ignoreBlockingTerrain = category4Visibility;
          category4TargetsAllowed = (!this.unit.canAttackFlying((byte) 102)) ? 0 : 1;
          allowCategory4Targets = category4TargetsAllowed;
          this.battlefield.lineOfSightGrid.mergeAttackTargetMask(minimumAttackRange, allowCategory4Targets != 0, -1, minimumX, maximumY, this.unit.ownerPlayer, this.controlsOtherPlayerUnit, this.movementCosts, maximumAttackRange, maximumX, ignoreBlockingTerrain != 0, this.attackTargetMask, movementBudget, minimumY);
          if (this.unit.packedFlag8 &&
            this.unit.unitType != 0) {
            this.movementCosts[this.unit.tileX + this.unit.tileY * this.mapWidth] = 1000000;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_84_0 = var7;
          stackIn_84_1 = new StringBuilder().append("nn.E(").append(allowOtherPlayer).append(',').append(obfuscationGuard).append(',').append(actingPlayer).append(',');
          if (unit == null) {
            stackIn_85_2 = "null";
          } else {
            stackIn_85_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_84_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(',').append(selectionMode).append(',').append(spellId).append(')').toString());
        }
    }

    final ActionRequest createActionRequest(int actingPlayer, int obfuscationGuard) {
        int var4_int = 0;
        int[] var3;
        int var6;
        int[] var7;
        MoveAttackRequest var4;
        int var5;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var7 = new int[this.pathLength];
        var3 = var7;
        if (this.pathDirections != null) {
          for (var4_int = 0; this.pathLength > var4_int; var4_int++) {
            var7[var4_int] = this.pathDirections[var4_int];
          }
        } else {
          var3 = new int[]{};
        }
        var5 = 51 / ((-19 - obfuscationGuard) / 39);
        var4 = new MoveAttackRequest(actingPlayer, this.pathLength, var3, this.unit.tileX, this.unit.tileY, this.targetDeltaX, this.targetDeltaY);
        if (this.spellId <= -1) {
          return (ActionRequest) ((Object) var4);
        }
        this.battlefield.spellCastPending = true;
        return (ActionRequest) ((Object) new SpellCastRequest(new ActionSpell(this.spellId, var4), this.selectionMode, actingPlayer));
    }

    final static void generateProceduralMap(byte obfuscationGuard, Battlefield battlefield) {
        int tileIndex = 0;
        RuntimeException stackIn_179_0 = null;
        StringBuilder stackIn_179_1 = null;
        String stackIn_180_2 = null;
        RuntimeException decompiledCaughtException = null;
        Battlefield fixedArena = null;
        RuntimeException var2_ref = null;
        int arenaIndex = 0;
        int arenaX = 0;
        int arenaY = 0;
        int sectorX = 0;
        int sectorY = 0;
        int structureX = 0;
        int structureY = 0;
        int villageIndex = 0;
        int spawnY = 0;
        int obfuscationControl = 0;
        Random random = null;
        int centerPattern;
        int villagesPerSector;
        int patternRoll;
        int emptyTileIndex;
        int preferredScatteredTerrain;
        int spawnSectorX;
        int spawnSectorY;
        int spawnPlayer;
        int spawnX;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (battlefield.mapSizeSetting == 4) {
            fixedArena = battlefield;
            battlefield.mapHeight = 10;
            battlefield.tiles = new MapTile[100];
            fixedArena.mapWidth = 10;
            for (arenaIndex = 0; arenaIndex < 100; arenaIndex++) {
              boolean decompiledFrameRemainder0 = true;
              arenaX = arenaIndex % 10;
              arenaY = arenaIndex / 10;
              if ((arenaX == 1 ||
                arenaX == 8) && (1 == arenaY ||
                arenaY == 8)) {
                battlefield.tiles[arenaIndex] = new MapTile(7, battlefield);
                decompiledFrameRemainder0 = false;
              }
              else {
                if ((arenaX != 1 &&
                  arenaX != 8 ||
                  (arenaY >= 9 ||
                  arenaY <= 0)) &&
                  (arenaY != 1 &&
                  arenaY != 8 ||
                  (arenaX >= 9 ||
                  arenaX <= 0))) {
                  if ((2 == arenaX ||
                    arenaX == 7) &&
                    (arenaY == 2 ||
                    7 == arenaY)) {
                    battlefield.tiles[arenaIndex] = new MapTile(9, battlefield);
                  } else {
                    if ((arenaX == 3 ||
                      arenaX == 6) &&
                      (arenaY == 2 ||
                      arenaY == 7)) {
                      battlefield.tiles[arenaIndex] = new MapTile(8, battlefield);
                    } else {
                      if ((arenaX == 2 ||
                        7 == arenaX) &&
                        (arenaY == 3 ||
                        6 == arenaY)) {
                        battlefield.tiles[arenaIndex] = new MapTile(8, battlefield);
                      } else {
                        if ((4 != arenaX ||
                          arenaY >= 4) &&
                          (arenaX != 5 ||
                          arenaY <= 5)) {
                          if ((4 == arenaX ||
                            5 == arenaX) &&
                            (arenaY == 4 ||
                            arenaY == 5)) {
                            battlefield.tiles[arenaIndex] = new MapTile(6, battlefield);
                          } else {
                            battlefield.tiles[arenaIndex] = new MapTile(0, battlefield);
                          }
                        } else {
                          battlefield.tiles[arenaIndex] = new MapTile(4, battlefield);
                        }
                      }
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if ((arenaX != 4 ||
                    arenaY != 1) &&
                    (5 != arenaX ||
                    arenaY != 8)) {
                    battlefield.tiles[arenaIndex] = new MapTile(1, battlefield);
                  } else {
                    battlefield.tiles[arenaIndex] = new MapTile(10, battlefield);
                  }
                }
              }
            }
            battlefield.unitsByPlayer[0].addLast((byte) -119, (IntrusiveNode) (new Unit(3, 3, 0, 0, 10, 10, 9, 0, 0, battlefield, 0, 0, -1, false, 0)));
            battlefield.unitsByPlayer[1].addLast((byte) -119, (IntrusiveNode) (new Unit(6, 6, 0, 1, 10, 10, 9, 0, 0, battlefield, 0, 0, -1, false, 0)));
            battlefield.installMap((byte) -110, battlefield.mapWidth, battlefield.mapHeight, battlefield.tiles);
            return;
          }
          battlefield.tiles = new MapTile[battlefield.mapWidth * battlefield.mapHeight];
          for (tileIndex = 0; tileIndex < battlefield.mapHeight * battlefield.mapWidth; tileIndex++) {
            battlefield.tiles[tileIndex] = null;
          }
          if (obfuscationGuard <= 40) {
            MovementPlanner.b(69);
          }
          random = new Random((long)battlefield.randomSeed);
          centerPattern = 3;
          villagesPerSector = 4 + AttackEvent.nextBoundedInt(false, 4, random);
          patternRoll = AttackEvent.nextBoundedInt(false, 100, random);
          if (battlefield.mapTheme == 0) {
            if (10 > patternRoll) {
              centerPattern = 5;
            } else {
              if (30 <= patternRoll) {
                if (patternRoll < 60) {
                  centerPattern = 1;
                } else {
                  if (patternRoll < 70) {
                    centerPattern = 6;
                  }
                }
              } else {
                centerPattern = 4;
              }
            }
          } else {
            if (battlefield.mapTheme != 2) {
              if (patternRoll >= 30) {
                if (patternRoll >= 60) {
                  if (patternRoll < 80) {
                    centerPattern = 6;
                  }
                } else {
                  centerPattern = 4;
                }
              } else {
                centerPattern = 0;
              }
            } else {
              if (patternRoll >= 30) {
                if (60 > patternRoll) {
                  centerPattern = 4;
                } else {
                  if (patternRoll < 80) {
                    centerPattern = 2;
                  }
                }
              } else {
                centerPattern = 5;
              }
            }
          }
          for (sectorX = -1; sectorX < 2; sectorX++) {
            for (sectorY = -1; sectorY < 2; sectorY++) {
              if (sectorX == 0 &&
                sectorY == 0) {
                LineOfSightGrid.paintMapCenterPattern(random, battlefield, (byte) 85, centerPattern);
              } else {
                structureX = sectorX * 20 + 20 + 10;
                structureY = 20 * (sectorY + 1) + 10;
                battlefield.tiles[battlefield.mapWidth * structureY + structureX] = new MapTile(1, battlefield);
                if (sectorX != 0 &&
                  sectorY != 0) {
                  structureX = structureX + (-1 + AttackEvent.nextBoundedInt(false, 2, random));
                  structureY = structureY + (-1 + AttackEvent.nextBoundedInt(false, 2, random));
                } else {
                  structureX = sectorX * (AttackEvent.nextBoundedInt(false, 4, random) + 5) - (-10 - (1 + sectorX) * 20);
                  structureY = (5 + AttackEvent.nextBoundedInt(false, 4, random)) * sectorY + 10 + 20 * (sectorY + 1);
                }
                battlefield.tiles[battlefield.mapWidth * structureY + structureX] = new MapTile(7, battlefield);
                if (0 != centerPattern) {
                  UnitInfoPopup.paintRandomTerrainPath(structureX, (byte) 101, 1, structureY, 20 * (sectorX + 1) + 10, false, (sectorY + 1) * 20 + 10, battlefield, random);
                }
                for (villageIndex = 0; villageIndex < villagesPerSector; villageIndex++) {
                  while (null != battlefield.tiles[structureY * battlefield.mapWidth + structureX]) {
                    if (battlefield.tiles[structureX + battlefield.mapWidth * structureY].terrainType != 0 &&
                      battlefield.tiles[structureY * battlefield.mapWidth + structureX].terrainType != 1) {
                      structureX = AttackEvent.nextBoundedInt(false, 7, random) * 2 + (20 * (sectorX + 1) + 3);
                      structureY = (1 + sectorY) * 20 - (-(2 * AttackEvent.nextBoundedInt(false, 7, random)) - 3);
                      continue;
                    }
                    break;
                  }
                  battlefield.tiles[structureX + structureY * battlefield.mapWidth] = new MapTile(8, battlefield);
                  if (centerPattern != 0) {
                    DefeatPlayerWithMetricsConsoleCommand.paintTerrainConnection(structureY, 20 * (1 + sectorX) + 10, -1, sectorY * 20 + 30, structureX, 0, battlefield, 1, random);
                  }
                }
              }
            }
          }
          for (emptyTileIndex = 0; emptyTileIndex < battlefield.mapHeight * battlefield.mapWidth; emptyTileIndex++) {
            if (battlefield.tiles[emptyTileIndex] == null) {
              battlefield.tiles[emptyTileIndex] = new MapTile(0, battlefield);
            }
          }
          preferredScatteredTerrain = -1;
          if (centerPattern == 5) {
            preferredScatteredTerrain = 3;
          }
          for (spawnSectorX = -1; spawnSectorX < 2; spawnSectorX++) {
            for (spawnSectorY = -1; 2 > spawnSectorY; spawnSectorY++) {
              spawnPlayer = 0;
              if (0 != spawnSectorX &&
                spawnSectorY != 0) {
                if (spawnSectorX != spawnSectorY) {
                  spawnPlayer += 2;
                }
                if (spawnSectorY == 1) {
                  spawnPlayer++;
                }
              } else {
                spawnPlayer += 4;
                if (1 == spawnSectorY ||
                  spawnSectorX == 1) {
                  spawnPlayer++;
                }
                if (spawnSectorY == 0) {
                  spawnPlayer += 2;
                }
              }
              if ((spawnSectorX != 0 ||
                spawnSectorY != 0) && spawnPlayer < battlefield.playerCount) {
                spawnX = 20 * (1 + spawnSectorX) + 10;
                spawnY = 10 + 20 * (1 + spawnSectorY);
                if (spawnSectorX != 0 &&
                  spawnSectorY != 0) {
                  spawnX = spawnX + (-1 + AttackEvent.nextBoundedInt(false, 2, random));
                  spawnY = spawnY + (-1 + AttackEvent.nextBoundedInt(false, 2, random));
                } else {
                  spawnX = 10 + (AttackEvent.nextBoundedInt(false, 4, random) + 5) * spawnSectorX + (20 + 20 * spawnSectorX);
                  spawnY = 10 + spawnSectorY * (AttackEvent.nextBoundedInt(false, 4, random) + 5) + (20 + 20 * spawnSectorY);
                }
                while (battlefield.tiles[battlefield.mapWidth * spawnY + spawnX].terrainType != 0) {
                  if (1 != battlefield.tiles[spawnX + battlefield.mapWidth * spawnY].terrainType) {
                    spawnY = 20 + (spawnSectorY * 20 + 10);
                    spawnX = (1 + spawnSectorX) * 20 + 10;
                    if (spawnSectorX != 0 &&
                      0 != spawnSectorY) {
                      spawnX = spawnX + (AttackEvent.nextBoundedInt(false, 4, random) - 2);
                      spawnY = spawnY + (AttackEvent.nextBoundedInt(false, 4, random) - 2);
                      continue;
                    }
                    spawnX = spawnSectorX * (AttackEvent.nextBoundedInt(false, 4, random) + 5) + 10 - (-20 - spawnSectorX * 20);
                    spawnY = (AttackEvent.nextBoundedInt(false, 4, random) + 5) * spawnSectorY + 10 - (-20 - 20 * spawnSectorY);
                    continue;
                  }
                  break;
                }
                battlefield.unitsByPlayer[spawnPlayer].addLast((byte) -119, (IntrusiveNode) (new Unit(spawnX, spawnY, 0, spawnPlayer, 10, 10, 9, 0, 0, battlefield, 0, 0, -1, false, 0)));
              }
            }
          }
          if (centerPattern == 2) {
            preferredScatteredTerrain = 5;
          }
          on.scatterMapTerrain(battlefield, preferredScatteredTerrain, false, random);
          battlefield.installMap((byte) -119, battlefield.mapWidth, battlefield.mapHeight, battlefield.tiles);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_179_0 = var2_ref;
          stackIn_179_1 = new StringBuilder().append("nn.H(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_180_2 = "null";
          } else {
            stackIn_180_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_179_0), ((StringBuilder) (Object) stackIn_179_1).append(stackIn_180_2).append(')').toString());
        }
    }

    final int writeMovementPacket(boolean obfuscationGuard, CipherPacketBuffer packet) {
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var3_intLifetime1;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.directAction &&
            this.actionAllowed) {
            var3_int = 6;
            if (this.spellId <= -1) {
              packet.writeCipheredOpcode(32161, 65);
              packet.writeByte(1, var3_int);
            } else {
              packet.writeCipheredOpcode(32161, 65);
              packet.writeByte(1, var3_int + 4);
              packet.writeByte(1, 160);
              packet.writeByte(1, this.selectionMode);
              packet.writeShort(true, this.spellId);
            }
            packet.writeByte(1, 0);
            packet.writeByte(1, 0);
            packet.writeByte(1, this.unit.tileX);
            packet.writeByte(1, this.unit.tileY);
            pd.a(this.targetDeltaX, this.targetDeltaY, packet, 127);
            stackIn_7_0 = var3_int;
            return stackIn_7_0;
          }
          if (null == this.pathDirections) {
            this.pathLength = 0;
          }
          stackIn_14_0 = (0 < this.pathLength % 4) ? 1 : 0;
          var3_intLifetime1 = stackIn_14_0 + (6 + this.pathLength / 4);
          if (this.spellId <= -1) {
            packet.writeCipheredOpcode(32161, 65);
            packet.writeByte(1, var3_intLifetime1);
          } else {
            packet.writeCipheredOpcode(32161, 65);
            packet.writeByte(1, 4 + var3_intLifetime1);
            packet.writeByte(1, 160);
            packet.writeByte(1, this.selectionMode);
            packet.writeShort(true, this.spellId);
            this.battlefield.spellCastPending = true;
          }
          packet.writeByte(1, this.pathLength >> 8 | 0);
          packet.writeByte(1, this.pathLength & 255);
          packet.writeByte(1, this.unit.tileX);
          packet.writeByte(1, this.unit.tileY);
          jj.a((byte) -27, this.pathLength, packet, this.pathDirections);
          if (!obfuscationGuard) {
            this.resetCosts(-21);
          }
          pd.a(this.targetDeltaX, this.targetDeltaY, packet, -78);
          stackIn_20_0 = var3_intLifetime1;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("nn.C(").append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void resetCosts(int startIndex) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        for (var2 = startIndex; this.movementCosts.length > var2; var2++) {
          this.movementCosts[var2] = 1000000;
          this.movementCostsThroughOwnUnits[var2] = 1000000;
          this.attackTargetMask[var2] = 0;
        }
    }

    MovementPlanner(Battlefield battlefield) {
        this.selectionMode = -1;
        this.spellId = -1;
        try {
          this.battlefield = battlefield;
          this.mapHeight = this.battlefield.mapHeight;
          this.mapWidth = this.battlefield.mapWidth;
          this.movementCosts = new int[this.mapHeight * this.mapWidth];
          this.movementCostsThroughOwnUnits = new int[this.mapWidth * this.mapHeight];
          this.attackTargetMask = new int[this.mapWidth * this.mapHeight];
          this.resetCosts(0);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "nn.<init>(" + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = "Show chat (<%0> unread messages)";
        field_c = new QuickChatCommandDefinition(7, 0, 1, 1);
        field_v = "You can only use a further <%0> runes of trinkets in this game. This trinket is worth <%1>.";
        field_z = new UiSelectionState(1);
    }
}
