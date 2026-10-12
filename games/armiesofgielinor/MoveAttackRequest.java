/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MoveAttackRequest extends ActionRequest {
    private int startX;
    private int targetDeltaY;
    static BufferedSocket field_z;
    private int[] pathDirections;
    static RgbSprite field_A;
    static String field_y;
    static RgbSprite[] field_C;
    private int startY;
    static sn[] field_v;
    static long[] field_I;
    static String field_F;
    static int[] field_D;
    static int field_x;
    static byte[] field_B;
    static int[] field_K;
    private int targetDeltaX;

    private final String formatMoveRejection(String[] messageParts, int obfuscationGuard) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 0) {
            field_z = (BufferedSocket) null;
          }
          stackIn_3_0 = this.formatIllegalMove(118, messageParts, "move");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("am.G(");
          if (messageParts == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_C = null;
        field_D = null;
        field_z = null;
        field_F = null;
        field_K = null;
        field_y = null;
        field_B = null;
        field_I = null;
        if (param0 != -1) {
          field_D = (int[]) null;
        }
        field_v = null;
        field_A = null;
    }

    private final PreparedAction prepareVineGrowth(Unit unit, byte obfuscationGuard, Battlefield battlefield) {
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_23_0 = null;
        PreparedAction stackIn_26_0 = null;
        Object stackIn_32_0 = null;
        VineGrowthAction stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (unit.movementSpent) {
            this.formatIllegalMove(-84, new String[]{"vine at ", TutorialController.formatCoordinatePair(unit.tileX, obfuscationGuard ^ 32, unit.tileY), " has already grown"}, "vine growth");
            stackIn_3_0 = null;
            return (PreparedAction) (stackIn_3_0);
          }
          if (this.pathDirections.length != 1) {
            this.formatIllegalMove(-98, new String[]{"vine at ", TutorialController.formatCoordinatePair(unit.tileX, obfuscationGuard - 32, unit.tileY), " attempted to grow more than one step"}, "vine growth");
            stackIn_6_0 = null;
            return (PreparedAction) (stackIn_6_0);
          }
          var4_int = this.startX;
          var5 = this.startY;
          var6 = this.pathDirections[0];
          if (1 != var6) {
            if (0 == var6) {
              var4_int++;
            } else {
              if (var6 == 2) {
                var5++;
              } else {
                if (var6 == 3) {
                  var4_int--;
                }
              }
            }
          } else {
            var5--;
          }
          if (var4_int >= 0 &&
            var5 >= 0 &&
            var4_int < battlefield.mapWidth &&
            battlefield.mapHeight > var5) {
            if (obfuscationGuard != 32) {
              stackIn_26_0 = (PreparedAction) null;
              return stackIn_26_0;
            }
            var6 = battlefield.tiles[var5 * battlefield.mapWidth + var4_int].terrainType;
            if (2 != var6 &&
              4 != var6 &&
              var6 != 6) {
              stackIn_34_0 = new VineGrowthAction(var4_int, var5, this.startX, this.startY, unit.strength, this.actingPlayer);
              return (PreparedAction) ((Object) stackIn_34_0);
            }
            this.formatIllegalMove(120, new String[]{"vine at ", TutorialController.formatCoordinatePair(unit.tileX, obfuscationGuard - 32, unit.tileY), " attempted to grow onto ground type: ", Integer.toString(var6)}, "vine growth");
            stackIn_32_0 = null;
            return (PreparedAction) (stackIn_32_0);
          }
          this.formatIllegalMove(127, new String[]{"vine at ", TutorialController.formatCoordinatePair(unit.tileX, 0, unit.tileY), " attempted to escape the map"}, "vine growth");
          stackIn_23_0 = null;
          return (PreparedAction) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_37_0 = var4;
          stackIn_37_1 = new StringBuilder().append("am.H(");
          if (unit == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final PreparedAction prepareAction(int obfuscationGuard, Battlefield battlefield) {
        String discarded$3 = null;
        String discarded$0 = null;
        String discarded$1 = null;
        String discarded$2 = null;
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        PreparedAction stackIn_13_0 = null;
        PreparedAction stackIn_16_0 = null;
        int stackIn_20_0 = 0;
        Object stackIn_52_0 = null;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_97_0 = 0;
        MoveAttackAction stackIn_114_0 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        String stackIn_118_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        Unit var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Unit var16 = null;
        Unit var17 = null;
        int var9Lifetime1;
        int var9Lifetime2;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.unlink(-107);
          var16 = battlefield.getUnitAt(this.startY, true, this.startX);
          var17 = var16;
          if (var17 == null) {
            discarded$3 = this.formatMoveRejection(new String[]{"no unit at ", TutorialController.formatCoordinatePair(this.startX, 0, this.startY)}, 0);
            stackIn_3_0 = null;
            return (PreparedAction) (stackIn_3_0);
          }
          if (this.actingPlayer != var17.ownerPlayer &&
            !this.allowOtherPlayer) {
            discarded$0 = this.formatMoveRejection(new String[]{"unit at ", TutorialController.formatCoordinatePair(this.startX, 0, this.startY), " not owned by this player"}, 0);
            stackIn_7_0 = null;
            return (PreparedAction) (stackIn_7_0);
          }
          if (var17.unitType != 51 && (!(this.spellId > -1) ||
            uc.spellDefinitions[this.spellId][5] != 24)) {
            if (var17.unitType == 39) {
              stackIn_16_0 = this.prepareVineGrowth(var17, (byte) 32, battlefield);
              return stackIn_16_0;
            }
            if (!var17.movementSpent) {
              stackIn_20_0 = 3 * bw.unitDefinitions[var16.unitType][3];
            } else {
              stackIn_20_0 = 0;
            }
            var4 = stackIn_20_0;
            if (0 != (battlefield.getTileEffects(31, var17.tileY, var17.tileX, var17.ownerPlayer) & 4) &&
              null != this.pathDirections &&
              this.pathDirections.length > 0) {
              var4 = 0;
              discarded$1 = this.formatMoveRejection(new String[]{"unit at ", TutorialController.formatCoordinatePair(this.startX, 0, this.startY), "Moved when in range of cyclops"}, 0);
            }
            if (this.spellId > -1 &&
              uc.spellDefinitions[this.spellId][5] == 18) {
              var4 = var4 << 1;
            }
            if (7 == var17.statusEffectType) {
              var4 = var4 >> 1;
            }
            if (var17.statusEffectType == 8) {
              var4 = 0;
            }
            var5 = this.startX;
            var6 = this.startY;
            var7 = 0;
            while (this.pathDirections.length > var7 &&
              var4 > 0) {
              var8_int = battlefield.mapWidth * var6 + var5;
              var9 = this.pathDirections[var7];
              if (var9 == 1) {
                var6--;
              } else {
                if (0 != var9) {
                  if (var9 == 2) {
                    var6++;
                  } else {
                    if (3 == var9) {
                      var5--;
                    }
                  }
                } else {
                  var5++;
                }
              }
              if (0 <= var5 &&
                0 <= var6 &&
                battlefield.mapWidth > var5 &&
                battlefield.mapHeight > var6) {
                var9Lifetime2 = battlefield.a(var8_int, -16, var5 + battlefield.mapWidth * var6, var17.ownerPlayer, var17, true);
                if (var9Lifetime2 <= var4) {
                  var4 = var4 - var9Lifetime2;
                  var7++;
                  continue;
                }
                this.targetDeltaX = 0;
                this.targetDeltaY = 0;
              } else {
                discarded$2 = this.formatMoveRejection(new String[]{"unit at ", TutorialController.formatCoordinatePair(this.startX, 0, this.startY), " attempted to escape the map"}, 0);
                stackIn_52_0 = null;
                return (PreparedAction) (stackIn_52_0);
              }
              break;
            }
            if (var17.attacksRemaining == 0) {
              this.targetDeltaY = 0;
              this.targetDeltaX = 0;
            }
            var8 = battlefield.getUnitAt(this.targetDeltaY + var6, true, var5 + this.targetDeltaX);
            if (var8 == null) {
              this.targetDeltaY = 0;
              this.targetDeltaX = 0;
            }
            stackIn_65_0 = (this.targetDeltaX >= 0) ? 1 : -1;
            var9Lifetime1 = stackIn_65_0;
            stackIn_68_0 = (0 <= this.targetDeltaY) ? 1 : -1;
            var10 = stackIn_68_0;
            var11 = var9Lifetime1 * this.targetDeltaX + this.targetDeltaY * var10;
            var12 = bw.unitDefinitions[var17.unitType][6];
            var13 = bw.unitDefinitions[var17.unitType][7];
            if (var17.packedFlag8 &&
              var17.unitType == 34) {
              var12 = 2;
              var13 = 7;
              if (var17.getEquipmentCategory(20640) == 3) {
                var13 = var13 + var17.getEquipmentProperty(1, 57);
              }
            }
            {
              if (81 != var17.unitType &&
                4 != var17.unitType && (var17.unitType != 74 ||
                3 != var17.getEquipmentCategory(20640))) {
                if (var17.getUnitCategory(0) == 3 &&
                  var17.getEquipmentCategory(20640) == 2) {
                  var13 = var13 + var17.getEquipmentProperty(1, -108);
                } else if (2 != var17.getUnitCategory(0)) {
                } else if (var17.getEquipmentCategory(20640) != 1) {
                } else {
                  var13 = var13 + var17.getEquipmentProperty(1, -87);
                }
              } else {
                var13 = var13 + var17.getEquipmentProperty(1, 118);
              }
            }
            if (obfuscationGuard < 31) {
              field_I = (long[]) null;
            }
            boolean decompiledFrameRemainder0 = true;
            if (1 < var11 && (var12 > var11 ||
              var11 > var13)) {
              this.targetDeltaY = 0;
              this.targetDeltaX = 0;
              decompiledFrameRemainder0 = false;
            }
            else {
              if (1 >= var11) {
                if (var11 == 1 &&
                  4 == var8.getUnitCategory(0) &&
                  !var17.canAttackFlying((byte) 78)) {
                  this.targetDeltaX = 0;
                  this.targetDeltaY = 0;
                }
              } else {
                stackIn_97_0 = (bw.unitDefinitions[var17.unitType][0] != 4) ? 0 : 1;
                var14 = stackIn_97_0;
                if (!battlefield.field_j.a(var6, this.targetDeltaX + var5, var5, var14 != 0, var13, this.targetDeltaY + var6, (byte) 81)) {
                  this.targetDeltaX = 0;
                  this.targetDeltaY = 0;
                }
                if ((battlefield.getTileEffects(31, var6 + this.targetDeltaY, var5 + this.targetDeltaX, var17.ownerPlayer) & 2) != 0 ||
                  0 != (battlefield.getTileEffects(31, var6, var5, var17.ownerPlayer) & 2)) {
                  this.targetDeltaX = 0;
                  this.targetDeltaY = 0;
                }
              }
            }
            if (var7 == 0 &&
              this.targetDeltaX == 0 &&
              0 == this.targetDeltaY) {
              return null;
            }
            stackIn_114_0 = new MoveAttackAction(this.startX, this.startY, this.pathDirections, var7, this.targetDeltaX, this.targetDeltaY, this.actingPlayer, var17, battlefield.getUnitAt(var6 + this.targetDeltaY, true, this.targetDeltaX + var5));
            return (PreparedAction) ((Object) stackIn_114_0);
          }
          stackIn_13_0 = this.prepareTeleport(battlefield, 0, var17);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_117_0 = var3;
          stackIn_117_1 = new StringBuilder().append("am.C(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_118_2 = "null";
          } else {
            stackIn_118_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_117_0), ((StringBuilder) (Object) stackIn_117_1).append(stackIn_118_2).append(')').toString());
        }
    }

    private final PreparedAction prepareTeleport(Battlefield battlefield, int obfuscationGuard, Unit unit) {
        Object stackIn_6_0 = null;
        Object stackIn_12_0 = null;
        TeleportAction stackIn_16_0 = null;
        TeleportAction stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          var4_int = this.startX + this.targetDeltaX;
          var5 = this.startY + this.targetDeltaY;
          if (var4_int >= 0 &&
            var5 >= 0 &&
            battlefield.mapWidth > var4_int &&
            battlefield.mapHeight > var5) {
            var6 = battlefield.tiles[var4_int + var5 * battlefield.mapWidth].terrainType;
            if (var6 != 2 &&
              var6 != 4 &&
              var6 != 6) {
              if (obfuscationGuard > ~this.spellId &&
                uc.spellDefinitions[this.spellId][5] == 24) {
                stackIn_16_0 = new TeleportAction(this.startX, this.startY, this.targetDeltaX, this.targetDeltaY, this.actingPlayer, unit, false);
                return (PreparedAction) ((Object) stackIn_16_0);
              }
              stackIn_18_0 = new TeleportAction(this.startX, this.startY, this.targetDeltaX, this.targetDeltaY, this.actingPlayer, unit, true);
              return (PreparedAction) ((Object) stackIn_18_0);
            }
            this.formatIllegalMove(126, new String[]{"unit at ", TutorialController.formatCoordinatePair(unit.tileX, 0, unit.tileY), " attempted to teleport onto ground type: ", Integer.toString(var6)}, "teleport");
            stackIn_12_0 = null;
            return (PreparedAction) (stackIn_12_0);
          }
          this.formatIllegalMove(obfuscationGuard + 124, new String[]{"unit at ", TutorialController.formatCoordinatePair(unit.tileX, 0, unit.tileY), " attempted to teleport off the map"}, "teleport");
          stackIn_6_0 = null;
          return (PreparedAction) (stackIn_6_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("am.F(");
          if (battlefield == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(obfuscationGuard).append(',');
          if (unit == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    MoveAttackRequest(PacketBuffer packet, int actingPlayer) {
        int pathIndex = 0;
        int pathLength = 0;
        int packedDirections = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int packedTargetDelta;
        try {
          this.actingPlayer = actingPlayer;
          pathLength = packet.readUnsignedShort((byte) -104) & 8191;
          this.pathDirections = new int[pathLength];
          this.startX = packet.readUnsignedByte(0);
          this.startY = packet.readUnsignedByte(0);
          packedDirections = 0;
          for (pathIndex = 0; pathLength > pathIndex; pathIndex++) {
            if (0 == pathIndex % 4) {
              packedDirections = packet.readUnsignedByte(0);
            }
            this.pathDirections[pathIndex] = rn.a(3, packedDirections);
            packedDirections = packedDirections >> 2;
          }
          packedTargetDelta = packet.readUnsignedShort((byte) -104);
          if (packedTargetDelta != 0) {
            this.targetDeltaY = 255 & packedTargetDelta;
            this.targetDeltaX = packedTargetDelta >> 8;
            this.targetDeltaY = (this.targetDeltaY ^ 128) - 128;
            this.targetDeltaX = -128 + (this.targetDeltaX ^ 128);
          } else {
            this.targetDeltaX = 0;
            this.targetDeltaY = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("am.<init>(");
          if (packet == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(actingPlayer).append(')').toString());
        }
    }

    MoveAttackRequest(int actingPlayer, int declaredPathLength, int[] pathDirections, int startX, int startY, int targetDeltaX, int targetDeltaY) {
        try {
          this.pathDirections = pathDirections;
          this.startX = startX;
          this.targetDeltaY = targetDeltaY;
          this.startY = startY;
          this.targetDeltaX = targetDeltaX;
          this.actingPlayer = actingPlayer;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "am.<init>(" + actingPlayer + ',' + declaredPathLength + ',' + (pathDirections != null ? "{...}" : "null") + ',' + startX + ',' + startY + ',' + targetDeltaX + ',' + targetDeltaY + ')');
        }
    }

    static {
        field_y = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_I = new long[1000];
        field_B = new byte[]{(byte)2, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        field_F = "You cannot add yourself!";
        field_K = new int[1024];
    }
}
