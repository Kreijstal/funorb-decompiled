/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class MovementPlanner {
    private int mapWidth;
    static me field_c;
    private boolean field_g;
    private int[] pathDirections;
    int targetX;
    private boolean directAction;
    static String field_s;
    int[] movementCosts;
    int field_y;
    private Battlefield battlefield;
    int[] field_e;
    int targetY;
    boolean field_f;
    Unit unit;
    int targetDeltaX;
    int targetDeltaY;
    boolean field_a;
    private int actingPlayer;
    int spellId;
    int pathLength;
    boolean actionAllowed;
    int[] field_k;
    private int mapHeight;
    private int unitType;
    static dl field_z;
    static String field_v;
    boolean field_w;

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
            packet.h(32161, 65);
            var4_int = 9;
            packet.b(1, var4_int);
            packet.b(1, 96);
            packet.b(1, attackedUnit.tileX);
            packet.b(1, attackedUnit.tileY);
            packet.b(1, 0);
            packet.b(1, 0);
            packet.b(1, this.unit.tileX);
            packet.b(1, this.unit.tileY);
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
          packet.h(32161, 65);
          packet.b(1, var4_intLifetime1);
          packet.b(1, 96);
          packet.b(1, attackedUnit.tileX);
          packet.b(1, attackedUnit.tileY);
          packet.b(1, (135 | this.pathLength) >> 8);
          packet.b(1, 255 & this.pathLength);
          packet.b(1, this.unit.tileX);
          packet.b(1, this.unit.tileY);
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
          throw ig.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        MapTile var6;
        int var6_int;
        MapTile var7;
        int var8;
        Unit var9;
        int var10;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (0 != (4 & this.battlefield.b(31, this.unit.tileY, this.unit.tileX, this.unit.ownerPlayer))) {
          param1 = 0;
        }
        if (param1 < 0) {
          for (var4 = 0; var4 < this.mapWidth; var4++) {
            var10 = 0;
            var5 = var10;
            while (this.mapHeight > var10) {
              var6 = this.battlefield.tiles[var4 + var10 * this.mapWidth];
              if (var6.terrainType != 2 &&
                7 != var6.terrainType &&
                var6.terrainType != 11 &&
                var6.terrainType != 4 &&
                6 != var6.terrainType && (var6.occupant == null ||
                param0)) {
                this.movementCosts[var4 + this.mapWidth * var10] = 0;
              }
              var10++;
            }
          }
        } else {
          if (param0) {
            if (this.unit.statusEffectType == 7) {
              param1 = param1 >> 1;
            } else {
              if (this.unit.statusEffectType == 8) {
                param1 = 0;
              }
            }
          }
          for (var4 = -param1; var4 <= param1; var4++) {
            for (var5 = -param1; var5 <= param1; var5++) {
              var6_int = Math.abs(var4) + Math.abs(var5);
              if (var4 + this.unit.tileX > -1 &&
                var4 + this.unit.tileX < this.mapWidth &&
                this.unit.tileY + var5 > -1 &&
                var5 + this.unit.tileY < this.mapHeight) {
                var7 = this.battlefield.tiles[this.mapWidth * (this.unit.tileY + var5) + (this.unit.tileX + var4)];
                if (2 != var7.terrainType && (var7.terrainType != 7 &&
                  var7.terrainType != 11 ||
                  param0) && (4 != var7.terrainType &&
                  6 != var7.terrainType &&
                  var6_int <= param1) && (null == var7.occupant ||
                  param0)) {
                  this.movementCosts[this.mapWidth * (var5 + this.unit.tileY) + (var4 + this.unit.tileX)] = 0;
                }
              }
            }
          }
        }
        if (param2 <= 65) {
          var9 = (Unit) null;
          this.prepareForUnit(true, 39, -101, (Unit) null, -116, -60);
        }
    }

    final void selectTarget(int targetY, boolean allowOtherPlayer, int targetX, byte obfuscationGuard) {
        int var5;
        Unit var6;
        int var7;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
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
          this.field_g = false;
          this.actionAllowed = false;
          this.targetY = targetY;
          this.targetDeltaY = 0;
          this.directAction = false;
          var5 = -124 / ((-19 - obfuscationGuard) / 60);
          this.pathDirections = null;
          this.targetDeltaX = 0;
          this.targetX = targetX;
          if (this.unit.unitType != 51 && (this.spellId <= -1 ||
            uc.spellDefinitions[this.spellId][5] != 24)) {
            var6 = this.battlefield.getUnitAt(targetY, true, targetX);
            if (var6 == null) {
              this.reconstructPath(targetY, (byte) -116, targetX);
              return;
            }
            if (var6.ownerPlayer == this.actingPlayer &&
              !this.field_a) {
              return;
            }
            this.a(targetY, targetX, (byte) -120);
            return;
          }
          this.selectDirectAction(targetY, targetX, 0);
          return;
        }
        this.clearPath(-116);
    }

    final void reconstructPath(int targetY, byte obfuscationGuard, int targetX) {
        boolean stackIn_43_1 = false;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var4 = targetY * this.mapWidth + targetX;
        var5 = var4;
        var6 = targetX;
        var7 = targetY;
        if (this.unit.packedFlag8 &&
          this.unit.unitType != 0) {
        }
        var8 = 0;
        this.field_g = true;
        if (-1 < this.spellId &&
          uc.spellDefinitions[this.spellId][5] == 18) {
        }
        while (true) {
          if (this.movementCosts[var5] > 0) {
            var9 = this.a(var5, (byte) 84, var6, var7);
            var10 = var9;
            if (var10 == 1) {
              var7--;
              var5 = var5 - this.mapWidth;
            } else {
              if (var10 != 0) {
                if (2 != var10) {
                  if (3 == var10) {
                    var6--;
                    var5--;
                  }
                } else {
                  var7++;
                  var5 = var5 + this.mapWidth;
                }
              } else {
                var6++;
                var5++;
              }
            }
            var8++;
            if (99 >= var8) {
              continue;
            }
            this.pathDirections = null;
            break;
          }
          var7 = targetY;
          var6 = targetX;
          var5 = var4;
          this.pathDirections = new int[var8];
          var8--;
          while (0 < this.movementCosts[var5]) {
            var9Lifetime1 = this.a(var5, (byte) 39, var6, var7);
            this.pathDirections[var8] = GrowthEvent.b(3, var9Lifetime1);
            var10Lifetime1 = var9Lifetime1;
            if (1 == var10Lifetime1) {
              var5 = var5 - this.mapWidth;
              var7--;
            } else {
              if (var10Lifetime1 != 0) {
                if (var10Lifetime1 != 2) {
                  if (var10Lifetime1 == 3) {
                    var6--;
                    var5--;
                  }
                } else {
                  var5 = var5 + this.mapWidth;
                  var7++;
                }
              } else {
                var5++;
                var6++;
              }
            }
            var8--;
          }
          this.pathLength = this.pathDirections.length;
          stackIn_43_1 = !(this.unit.movementSpent);
          this.actionAllowed = stackIn_43_1;
          break;
        }
        this.field_f = true;
        if (obfuscationGuard != -116) {
          this.field_w = false;
        }
        return;
    }

    private final void a(int param0, int param1, byte param2) {
        int var9 = 0;
        int var10 = 0;
        boolean stackIn_32_1 = false;
        ul stackIn_74_0;
        int stackIn_74_1;
        int stackIn_74_2;
        int stackIn_74_3;
        boolean stackIn_75_4 = false;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var11;
        int var12;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.unit.tileX == param1 &&
          param0 == this.unit.tileY) {
          return;
        }
        if ((4 & this.field_e[param1 + param0 * this.mapWidth]) == 0) {
          this.actionAllowed = false;
          return;
        }
        var4 = bw.unitDefinitions[this.unit.unitType][7];
        var5 = bw.unitDefinitions[this.unit.unitType][6];
        if (param2 != -120) {
          this.mapHeight = 82;
        }
        if (this.unit.packedFlag8 &&
          this.unit.unitType == 34) {
          var4 = 7;
          var5 = 2;
          if (3 == this.unit.getEquipmentCategory(20640)) {
            var4 = var4 + this.unit.getEquipmentProperty(1, 115);
          }
        }
        if ((this.unit.unitType == 81 ||
          4 == this.unit.unitType ||
          74 == this.unit.unitType) &&
          this.unit.getEquipmentCategory(20640) == 3) {
          var4 = var4 + this.unit.getEquipmentProperty(1, param2 ^ 21);
        } else if (3 == this.unit.getUnitCategory(0) &&
          this.unit.getEquipmentCategory(param2 ^ -20696) == 2) {
          var4 = var4 + this.unit.getEquipmentProperty(1, -87);
        } else {
          if (this.unit.getUnitCategory(0) == 2 &&
            this.unit.getEquipmentCategory(20640) == 1) {
            var4 = var4 + this.unit.getEquipmentProperty(1, param2 ^ 41);
          }
        }
        if ((1 & this.field_e[param0 * this.mapWidth + param1]) != 1) {
          var6 = 3 * bw.unitDefinitions[this.unit.unitType][3];
          if (this.unit.packedFlag8 &&
            this.unit.unitType != 0) {
            var6 = 0;
          }
          if (this.spellId > -1 &&
            uc.spellDefinitions[this.spellId][5] == 18) {
            var6 = var6 << 1;
          }
          var7 = this.unit.tileX;
          this.field_g = true;
          var8 = this.unit.tileY;
          for (var9 = -var4; var4 >= var9; var9++) {
            for (var10 = -var4; var4 >= var10; var10++) {
              var11 = Math.abs(var9) + Math.abs(var10);
              if (-1 < var9 + param1 &&
                this.mapWidth > var9 + param1 &&
                param0 + var10 > -1 &&
                this.mapHeight > param0 + var10 &&
                var11 <= var4 &&
                var5 <= var11 && (1 == var11 ||
                (2 & this.battlefield.b(31, var10 + param0, param1 + var9, this.unit.ownerPlayer)) == 0 &&
                0 == (this.battlefield.b(31, param0, param1, this.unit.ownerPlayer) & 2)) && this.movementCosts[param1 + (var9 + this.mapWidth * (param0 + var10))] <= var6) {
                stackIn_74_0 = this.battlefield.field_j;
                stackIn_74_1 = var10 + param0;
                stackIn_74_2 = param1;
                stackIn_74_3 = param1 + var9;
                stackIn_75_4 = (this.unit.getUnitCategory(0) == 4);
                if (((ul) (Object) stackIn_74_0).a(stackIn_74_1, stackIn_74_2, stackIn_74_3, stackIn_75_4, var4, param0, (byte) 86)) {
                  var6 = this.movementCosts[param1 + var9 + this.mapWidth * (param0 + var10)];
                  var8 = var10 + param0;
                  var7 = var9 + param1;
                  this.actionAllowed = true;
                }
              }
            }
          }
          if (this.actionAllowed) {
            this.reconstructPath(var8, (byte) -116, var7);
            this.targetDeltaX = -var7 + param1;
            this.targetDeltaY = param0 - var8;
          }
        } else {
          stackIn_32_1 = !(this.unit.attacksRemaining <= 0);
          this.actionAllowed = stackIn_32_1;
          this.targetDeltaY = param0 - this.unit.tileY;
          this.targetDeltaX = param1 - this.unit.tileX;
        }
        this.field_f = true;
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
        this.field_f = true;
        this.actionAllowed = this.actionAllowed & (!this.unit.movementSpent ? true : false);
    }

    final void a(BattleCamera param0, int param1) {
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
          param0.field_c[0] = this.unit.tileX;
          param0.field_c[1] = this.unit.tileY;
          param0.c(9470337);
          if (param1 != -4) {
            field_v = (String) null;
          }
          var3_int = param0.field_e[0];
          var4 = param0.field_e[1];
          sc.field_f[10].g(var3_int, var4);
          param0.field_c[1] = this.targetY;
          param0.field_c[0] = this.targetX;
          param0.c(param1 + 9470341);
          var5 = param0.field_e[0];
          var6 = param0.field_e[1];
          var7 = this.getMovementBudget(27732);
          var8 = 0;
          if (!this.directAction) {
            if (this.field_g) {
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
                  sc.field_f[this.pathDirections[var10] + var9].e(var3_int, var4, 128);
                  sc.field_f[this.pathDirections[var10] + var9].e(var11 + var3_int, var4 + var12, 128);
                  sc.field_f[this.pathDirections[var10] + var9].e(var3_int + (var11 << 1), (var12 << 1) + var4, 128);
                  if (var10 < this.pathDirections.length - 1 &&
                    this.pathDirections[1 + var10] == this.pathDirections[var10]) {
                    sc.field_f[this.pathDirections[var10] + var9].e(var3_int + 3 * var11, 3 * var12 + var4, 128);
                  }
                  var4 = var4 + (var12 << 2);
                  var3_int = var3_int + (var11 << 2);
                  if (var8 == 0) {
                    param0.field_e[1] = var12 + 16 + var4;
                    param0.field_e[0] = 32 + var3_int + var11;
                    param0.c(false);
                    if (this.actionAllowed &&
                      this.movementCosts[param0.field_c[0] + param0.field_c[1] * this.mapWidth] > var7) {
                      var9 = 0;
                      var8 = 1;
                    }
                  }
                }
              }
              sc.field_f[var9 + 5].e(var5, var6, 128);
            }
          } else {
            stackIn_6_0 = sc.field_f;
            stackIn_6_1 = 5;
            if (!this.actionAllowed) {
              stackIn_7_2 = 0;
            } else {
              stackIn_7_2 = 6;
            }
            ((RgbSprite) (Object) stackIn_6_0[stackIn_6_1 + stackIn_7_2]).g(var5, var6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_44_0 = var3;
          stackIn_44_1 = new StringBuilder().append("nn.O(");
          if (param0 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param1).append(')').toString());
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
        this.field_f = false;
        this.pathDirections = null;
    }

    private final int a(int param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        var5 = this.movementCosts[param0];
        var7 = 30 % ((-18 - param1) / 38);
        var6 = -1;
        if (param2 > 0 &&
          this.movementCosts[-1 + param0] < var5 &&
          this.battlefield.a(param0 - 1, -16, param0, this.unit.ownerPlayer, this.unit, true) == this.movementCosts[param0] - this.movementCosts[param0 - 1]) {
          var6 = 3;
          var5 = this.movementCosts[param0 - 1];
        }
        if (param2 < -1 + this.mapWidth &&
          this.movementCosts[1 + param0] < var5 &&
          this.battlefield.a(1 + param0, -16, param0, this.unit.ownerPlayer, this.unit, true) == -this.movementCosts[1 + param0] + this.movementCosts[param0]) {
          var6 = 0;
          var5 = this.movementCosts[1 + param0];
        }
        if (param3 > 0 &&
          var5 > this.movementCosts[param0 - this.mapWidth] &&
          this.battlefield.a(-this.mapWidth + param0, -16, param0, this.unit.ownerPlayer, this.unit, true) == -this.movementCosts[param0 - this.mapWidth] + this.movementCosts[param0]) {
          var6 = 1;
          var5 = this.movementCosts[param0 - this.mapWidth];
        }
        if (this.mapWidth - 1 > param3 &&
          var5 > this.movementCosts[param0 + this.mapWidth] &&
          this.battlefield.a(param0 + this.mapWidth, -16, param0, this.unit.ownerPlayer, this.unit, true) == -this.movementCosts[param0 + this.mapWidth] + this.movementCosts[param0]) {
          var6 = 2;
          var5 = this.movementCosts[this.mapWidth + param0];
        }
        return var6;
    }

    final int getMovementBudget(int obfuscationGuard) {
        int discarded$0 = 0;
        if (obfuscationGuard != 27732) {
          discarded$0 = this.a(-31, (byte) 81, -84, 42);
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
          if ((4 & this.battlefield.b(31, this.unit.tileY, this.unit.tileX, this.unit.ownerPlayer)) != 0) {
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        boolean stackIn_4_1 = false;
        boolean stackIn_8_1 = false;
        int[] stackIn_32_0 = null;
        int stackIn_35_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_85_2 = null;
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
        int var15 = 0;
        int var16 = 0;
        int[] var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        CipherPacketBuffer var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int var14Lifetime1;
        int var15Lifetime1;
        int var23Lifetime1;
        int var23Lifetime2;
        int var23Lifetime3;
        var24 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.actingPlayer = actingPlayer;
          this.spellId = spellId;
          this.field_f = false;
          this.field_y = selectionMode;
          stackIn_4_1 = (this.actingPlayer != unit.ownerPlayer);
          this.field_a = stackIn_4_1;
          this.unit = unit;
          stackIn_8_1 = (allowOtherPlayer) && (this.field_a);
          this.field_w = stackIn_8_1;
          if (obfuscationGuard <= 10) {
            var25 = (CipherPacketBuffer) null;
            this.writeMovementPacket(true, (CipherPacketBuffer) null);
          }
          this.unitType = this.unit.unitType;
          var7_int = this.unit.getMaximumAttackRange(3257);
          var8 = this.unit.getMinimumAttackRange((byte) -79);
          this.resetCosts(0);
          if (this.spellId > -1 &&
            24 == uc.spellDefinitions[this.spellId][5]) {
            this.a(false, uc.spellDefinitions[this.spellId][6], 93);
            return;
          }
          if (this.unitType == 51) {
            this.a(true, bw.unitDefinitions[this.unitType][3], 112);
            return;
          }
          var9 = this.getMovementBudget(27732);
          var10 = this.unit.tileX;
          var11 = this.unit.tileX;
          var12 = this.unit.tileY;
          var13 = this.unit.tileY;
          this.movementCosts[this.unit.tileX + this.mapWidth * this.unit.tileY] = 0;
          this.field_k[this.unit.tileX + this.mapWidth * this.unit.tileY] = 0;
          if (!this.unit.packedFlag8 ||
            this.unit.unitType == 0) {
            for (var14 = 0; var14 < 500; var14++) {
              var15 = 0;
              var16 = 0;
              for (var17 = 0; var17 < this.mapWidth; var17++) {
                for (var18 = 0; var18 < this.mapHeight; var18++) {
                  for (var19 = 0; var19 < 2; var19++) {
                    if (var19 == 0) {
                      stackIn_32_0 = this.movementCosts;
                    } else {
                      stackIn_32_0 = this.field_k;
                    }
                    var27 = stackIn_32_0;
                    var26 = var27;
                    var20 = var26;
                    stackIn_35_0 = (var19 != 1) ? 0 : 1;
                    var21 = stackIn_35_0;
                    var22 = 1000000;
                    if (var18 > 0) {
                      var23 = this.battlefield.a(this.unit, var21 != 0, 14336, true, var16, -1 + var16, this.unit.ownerPlayer);
                      if (var22 > var23 + var20[-1 + var16]) {
                        var22 = var23 + var20[-1 + var16];
                        if (var11 < var18 &&
                          var9 >= var22) {
                          var11 = var18;
                        }
                      }
                    }
                    if (var17 > 0) {
                      var23Lifetime1 = this.battlefield.a(this.unit, var21 != 0, 14336, true, var16, -this.mapWidth + var16, this.unit.ownerPlayer);
                      if (var17 > 0 &&
                        var20[var16 - this.mapWidth] + var23Lifetime1 < var22) {
                        var22 = var20[var16 - this.mapWidth] + var23Lifetime1;
                      }
                    }
                    if (var18 < -1 + this.mapWidth) {
                      var23Lifetime2 = this.battlefield.a(this.unit, var21 != 0, 14336, true, var16, var16 + 1, this.unit.ownerPlayer);
                      if (var22 > var20[var16 + 1] + var23Lifetime2) {
                        var22 = var20[var16 + 1] + var23Lifetime2;
                      }
                    }
                    if (var17 < this.mapHeight - 1) {
                      var23Lifetime3 = this.battlefield.a(this.unit, var21 != 0, 14336, true, var16, var16 + this.mapWidth, this.unit.ownerPlayer);
                      if (var20[this.mapWidth + var16] + var23Lifetime3 < var22) {
                        var22 = var20[var16 + this.mapWidth] + var23Lifetime3;
                      }
                    }
                    if (var22 < var27[var16]) {
                      if (var10 > var18) {
                        var10 = var18;
                      }
                      if (var18 > var11) {
                        var11 = var18;
                      }
                      if (var15 < var22) {
                        var15 = var22;
                      }
                      if (var17 > var13) {
                        var13 = var17;
                      }
                      var27[var16] = var22;
                      if (var12 > var17) {
                        var12 = var17;
                      }
                    }
                  }
                  var16++;
                }
              }
              if (0 == var15) {
                break;
              }
            }
          }
          stackIn_75_0 = (4 != bw.unitDefinitions[unit.unitType][0]) ? 0 : 1;
          var14Lifetime1 = stackIn_75_0;
          stackIn_78_0 = (!this.unit.j((byte) 102)) ? 0 : 1;
          var15Lifetime1 = stackIn_78_0;
          this.battlefield.field_j.a(var8, var15Lifetime1 != 0, -1, var10, var13, this.unit.ownerPlayer, this.field_a, this.movementCosts, var7_int, var11, var14Lifetime1 != 0, this.field_e, var9, var12);
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
          throw ig.a((Throwable) ((Object) stackIn_84_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(',').append(selectionMode).append(',').append(spellId).append(')').toString());
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
        this.battlefield.field_J = true;
        return (ActionRequest) ((Object) new SpellCastRequest(new ActionSpell(this.spellId, var4), this.field_y, actingPlayer));
    }

    final static void a(byte param0, Battlefield param1) {
        int var2_int = 0;
        RuntimeException stackIn_179_0 = null;
        StringBuilder stackIn_179_1 = null;
        String stackIn_180_2 = null;
        RuntimeException decompiledCaughtException = null;
        Battlefield var2 = null;
        RuntimeException var2_ref = null;
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
        Random var13 = null;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1.mapSizeSetting == 4) {
            var2 = param1;
            param1.mapHeight = 10;
            param1.tiles = new MapTile[100];
            var2.mapWidth = 10;
            for (var3 = 0; var3 < 100; var3++) {
              boolean decompiledFrameRemainder0 = true;
              var4 = var3 % 10;
              var5 = var3 / 10;
              if ((var4 == 1 ||
                var4 == 8) && (1 == var5 ||
                var5 == 8)) {
                param1.tiles[var3] = new MapTile(7, param1);
                decompiledFrameRemainder0 = false;
              }
              else {
                if ((var4 != 1 &&
                  var4 != 8 ||
                  (var5 >= 9 ||
                  var5 <= 0)) &&
                  (var5 != 1 &&
                  var5 != 8 ||
                  (var4 >= 9 ||
                  var4 <= 0))) {
                  if ((2 == var4 ||
                    var4 == 7) &&
                    (var5 == 2 ||
                    7 == var5)) {
                    param1.tiles[var3] = new MapTile(9, param1);
                  } else {
                    if ((var4 == 3 ||
                      var4 == 6) &&
                      (var5 == 2 ||
                      var5 == 7)) {
                      param1.tiles[var3] = new MapTile(8, param1);
                    } else {
                      if ((var4 == 2 ||
                        7 == var4) &&
                        (var5 == 3 ||
                        6 == var5)) {
                        param1.tiles[var3] = new MapTile(8, param1);
                      } else {
                        if ((4 != var4 ||
                          var5 >= 4) &&
                          (var4 != 5 ||
                          var5 <= 5)) {
                          if ((4 == var4 ||
                            5 == var4) &&
                            (var5 == 4 ||
                            var5 == 5)) {
                            param1.tiles[var3] = new MapTile(6, param1);
                          } else {
                            param1.tiles[var3] = new MapTile(0, param1);
                          }
                        } else {
                          param1.tiles[var3] = new MapTile(4, param1);
                        }
                      }
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if ((var4 != 4 ||
                    var5 != 1) &&
                    (5 != var4 ||
                    var5 != 8)) {
                    param1.tiles[var3] = new MapTile(1, param1);
                  } else {
                    param1.tiles[var3] = new MapTile(10, param1);
                  }
                }
              }
            }
            param1.unitsByPlayer[0].addLast((byte) -119, (IntrusiveNode) (new Unit(3, 3, 0, 0, 10, 10, 9, 0, 0, param1, 0, 0, -1, false, 0)));
            param1.unitsByPlayer[1].addLast((byte) -119, (IntrusiveNode) (new Unit(6, 6, 0, 1, 10, 10, 9, 0, 0, param1, 0, 0, -1, false, 0)));
            param1.a((byte) -110, param1.mapWidth, param1.mapHeight, param1.tiles);
            return;
          }
          param1.tiles = new MapTile[param1.mapWidth * param1.mapHeight];
          for (var2_int = 0; var2_int < param1.mapHeight * param1.mapWidth; var2_int++) {
            param1.tiles[var2_int] = null;
          }
          if (param0 <= 40) {
            MovementPlanner.b(69);
          }
          var13 = new Random((long)param1.randomSeed);
          var3Lifetime1 = 3;
          var4Lifetime1 = 4 + AttackEvent.a(false, 4, var13);
          var5Lifetime1 = AttackEvent.a(false, 100, var13);
          if (param1.mapTheme == 0) {
            if (10 > var5Lifetime1) {
              var3Lifetime1 = 5;
            } else {
              if (30 <= var5Lifetime1) {
                if (var5Lifetime1 < 60) {
                  var3Lifetime1 = 1;
                } else {
                  if (var5Lifetime1 < 70) {
                    var3Lifetime1 = 6;
                  }
                }
              } else {
                var3Lifetime1 = 4;
              }
            }
          } else {
            if (param1.mapTheme != 2) {
              if (var5Lifetime1 >= 30) {
                if (var5Lifetime1 >= 60) {
                  if (var5Lifetime1 < 80) {
                    var3Lifetime1 = 6;
                  }
                } else {
                  var3Lifetime1 = 4;
                }
              } else {
                var3Lifetime1 = 0;
              }
            } else {
              if (var5Lifetime1 >= 30) {
                if (60 > var5Lifetime1) {
                  var3Lifetime1 = 4;
                } else {
                  if (var5Lifetime1 < 80) {
                    var3Lifetime1 = 2;
                  }
                }
              } else {
                var3Lifetime1 = 5;
              }
            }
          }
          for (var6 = -1; var6 < 2; var6++) {
            for (var7 = -1; var7 < 2; var7++) {
              if (var6 == 0 &&
                var7 == 0) {
                ul.a(var13, param1, (byte) 85, var3Lifetime1);
              } else {
                var8 = var6 * 20 + 20 + 10;
                var9 = 20 * (var7 + 1) + 10;
                param1.tiles[param1.mapWidth * var9 + var8] = new MapTile(1, param1);
                if (var6 != 0 &&
                  var7 != 0) {
                  var8 = var8 + (-1 + AttackEvent.a(false, 2, var13));
                  var9 = var9 + (-1 + AttackEvent.a(false, 2, var13));
                } else {
                  var8 = var6 * (AttackEvent.a(false, 4, var13) + 5) - (-10 - (1 + var6) * 20);
                  var9 = (5 + AttackEvent.a(false, 4, var13)) * var7 + 10 + 20 * (var7 + 1);
                }
                param1.tiles[param1.mapWidth * var9 + var8] = new MapTile(7, param1);
                if (0 != var3Lifetime1) {
                  fi.a(var8, (byte) 101, 1, var9, 20 * (var6 + 1) + 10, false, (var7 + 1) * 20 + 10, param1, var13);
                }
                for (var10 = 0; var10 < var4Lifetime1; var10++) {
                  while (null != param1.tiles[var9 * param1.mapWidth + var8]) {
                    if (param1.tiles[var8 + param1.mapWidth * var9].terrainType != 0 &&
                      param1.tiles[var9 * param1.mapWidth + var8].terrainType != 1) {
                      var8 = AttackEvent.a(false, 7, var13) * 2 + (20 * (var6 + 1) + 3);
                      var9 = (1 + var7) * 20 - (-(2 * AttackEvent.a(false, 7, var13)) - 3);
                      continue;
                    }
                    break;
                  }
                  param1.tiles[var8 + var9 * param1.mapWidth] = new MapTile(8, param1);
                  if (var3Lifetime1 != 0) {
                    qp.a(var9, 20 * (1 + var6) + 10, -1, var7 * 20 + 30, var8, 0, param1, 1, var13);
                  }
                }
              }
            }
          }
          for (var6Lifetime1 = 0; var6Lifetime1 < param1.mapHeight * param1.mapWidth; var6Lifetime1++) {
            if (param1.tiles[var6Lifetime1] == null) {
              param1.tiles[var6Lifetime1] = new MapTile(0, param1);
            }
          }
          var6Lifetime2 = -1;
          if (var3Lifetime1 == 5) {
            var6Lifetime2 = 3;
          }
          for (var7Lifetime1 = -1; var7Lifetime1 < 2; var7Lifetime1++) {
            for (var8Lifetime1 = -1; 2 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = 0;
              if (0 != var7Lifetime1 &&
                var8Lifetime1 != 0) {
                if (var7Lifetime1 != var8Lifetime1) {
                  var9Lifetime1 += 2;
                }
                if (var8Lifetime1 == 1) {
                  var9Lifetime1++;
                }
              } else {
                var9Lifetime1 += 4;
                if (1 == var8Lifetime1 ||
                  var7Lifetime1 == 1) {
                  var9Lifetime1++;
                }
                if (var8Lifetime1 == 0) {
                  var9Lifetime1 += 2;
                }
              }
              if ((var7Lifetime1 != 0 ||
                var8Lifetime1 != 0) && var9Lifetime1 < param1.playerCount) {
                var10Lifetime1 = 20 * (1 + var7Lifetime1) + 10;
                var11 = 10 + 20 * (1 + var8Lifetime1);
                if (var7Lifetime1 != 0 &&
                  var8Lifetime1 != 0) {
                  var10Lifetime1 = var10Lifetime1 + (-1 + AttackEvent.a(false, 2, var13));
                  var11 = var11 + (-1 + AttackEvent.a(false, 2, var13));
                } else {
                  var10Lifetime1 = 10 + (AttackEvent.a(false, 4, var13) + 5) * var7Lifetime1 + (20 + 20 * var7Lifetime1);
                  var11 = 10 + var8Lifetime1 * (AttackEvent.a(false, 4, var13) + 5) + (20 + 20 * var8Lifetime1);
                }
                while (param1.tiles[param1.mapWidth * var11 + var10Lifetime1].terrainType != 0) {
                  if (1 != param1.tiles[var10Lifetime1 + param1.mapWidth * var11].terrainType) {
                    var11 = 20 + (var8Lifetime1 * 20 + 10);
                    var10Lifetime1 = (1 + var7Lifetime1) * 20 + 10;
                    if (var7Lifetime1 != 0 &&
                      0 != var8Lifetime1) {
                      var10Lifetime1 = var10Lifetime1 + (AttackEvent.a(false, 4, var13) - 2);
                      var11 = var11 + (AttackEvent.a(false, 4, var13) - 2);
                      continue;
                    }
                    var10Lifetime1 = var7Lifetime1 * (AttackEvent.a(false, 4, var13) + 5) + 10 - (-20 - var7Lifetime1 * 20);
                    var11 = (AttackEvent.a(false, 4, var13) + 5) * var8Lifetime1 + 10 - (-20 - 20 * var8Lifetime1);
                    continue;
                  }
                  break;
                }
                param1.unitsByPlayer[var9Lifetime1].addLast((byte) -119, (IntrusiveNode) (new Unit(var10Lifetime1, var11, 0, var9Lifetime1, 10, 10, 9, 0, 0, param1, 0, 0, -1, false, 0)));
              }
            }
          }
          if (var3Lifetime1 == 2) {
            var6Lifetime2 = 5;
          }
          on.a(param1, var6Lifetime2, false, var13);
          param1.a((byte) -119, param1.mapWidth, param1.mapHeight, param1.tiles);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_179_0 = var2_ref;
          stackIn_179_1 = new StringBuilder().append("nn.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_180_2 = "null";
          } else {
            stackIn_180_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_179_0), ((StringBuilder) (Object) stackIn_179_1).append(stackIn_180_2).append(')').toString());
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
              packet.h(32161, 65);
              packet.b(1, var3_int);
            } else {
              packet.h(32161, 65);
              packet.b(1, var3_int + 4);
              packet.b(1, 160);
              packet.b(1, this.field_y);
              packet.b(true, this.spellId);
            }
            packet.b(1, 0);
            packet.b(1, 0);
            packet.b(1, this.unit.tileX);
            packet.b(1, this.unit.tileY);
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
            packet.h(32161, 65);
            packet.b(1, var3_intLifetime1);
          } else {
            packet.h(32161, 65);
            packet.b(1, 4 + var3_intLifetime1);
            packet.b(1, 160);
            packet.b(1, this.field_y);
            packet.b(true, this.spellId);
            this.battlefield.field_J = true;
          }
          packet.b(1, this.pathLength >> 8 | 0);
          packet.b(1, this.pathLength & 255);
          packet.b(1, this.unit.tileX);
          packet.b(1, this.unit.tileY);
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
          throw ig.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void resetCosts(int startIndex) {
        int var2 = 0;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        for (var2 = startIndex; this.movementCosts.length > var2; var2++) {
          this.movementCosts[var2] = 1000000;
          this.field_k[var2] = 1000000;
          this.field_e[var2] = 0;
        }
    }

    MovementPlanner(Battlefield battlefield) {
        this.field_y = -1;
        this.spellId = -1;
        try {
          this.battlefield = battlefield;
          this.mapHeight = this.battlefield.mapHeight;
          this.mapWidth = this.battlefield.mapWidth;
          this.movementCosts = new int[this.mapHeight * this.mapWidth];
          this.field_k = new int[this.mapWidth * this.mapHeight];
          this.field_e = new int[this.mapWidth * this.mapHeight];
          this.resetCosts(0);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "nn.<init>(" + (battlefield != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_s = "Show chat (<%0> unread messages)";
        field_c = new me(7, 0, 1, 1);
        field_v = "You can only use a further <%0> runes of trinkets in this game. This trinket is worth <%1>.";
        field_z = new dl(1);
    }
}
