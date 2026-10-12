/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AiInfluenceMap {
    private int minimumY;
    private int maximumY;
    static BattleCamera field_d;
    private int mapWidth;
    static String field_j;
    static ResourceArchive field_f;
    private int minimumX;
    private int maximumX;
    static String field_l;
    private MapTile[] tiles;
    static BitmapFont field_h;
    static String field_k;
    private int mapHeight;
    private int[] packedCosts;

    final void a(float[] param0, boolean param1, float param2, int param3, byte param4, int param5, int param6, int param7) {
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        int var15 = 0;
        float var16 = 0.0f;
        int var17 = 0;
        Unit var18 = null;
        Unit var19 = null;
        var17 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param4 != -4) {
            this.minimumY = 94;
          }
          var18 = IterableDualNodeDeque.field_b[param3];
          var19 = var18;
          var19.tileX = param7;
          var19.tileY = param6;
          this.a(var19, 120);
          var10 = 3 * bw.unitDefinitions[var18.unitType][3];
          for (var12 = this.minimumY; var12 <= this.maximumY; var12++) {
            var11 = this.minimumX + this.mapWidth * var12;
            for (var13 = this.minimumX; var13 <= this.maximumX; var13++) {
              var14 = this.packedCosts[var11];
              var15 = (65535 & var14) + (var14 >> 16) * var10;
              var16 = 10.0f * param2 / (float)(1 + var15);
              if (param1) {
                var16 = var16 / (float)(1 + var15);
              }
              param0[var11] = param0[var11] + var16;
              var11++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_14_0 = var9;
          stackIn_14_1 = new StringBuilder().append("ir.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static int writeTieredSignedInt(int tier1Bits, int tier2Bits, int value, int tier3Bits, int obfuscationGuard, int tier0Bits, CipherPacketBuffer packet) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (tier0Bits != 0) {
            var7_int = 1 << -1 + tier0Bits;
            if (-1 + var7_int >= value &&
              value >= -var7_int) {
              packet.writeBits(-16807, 2, 0);
              packet.writeBits(obfuscationGuard - 16808, tier0Bits, value);
              stackIn_9_0 = tier0Bits + 2;
              return stackIn_9_0;
            }
            if (0 >= value) {
              value = value + var7_int;
            } else {
              value = value - var7_int;
            }
          } else {
            if (0 == value) {
              packet.writeBits(obfuscationGuard - 16808, 2, 0);
              stackIn_5_0 = 2;
              return stackIn_5_0;
            }
          }
          var7_intLifetime1 = 1 << -1 + tier1Bits;
          if (value <= var7_intLifetime1 - obfuscationGuard &&
            value >= -var7_intLifetime1) {
            packet.writeBits(-16807, 2, 1);
            packet.writeBits(obfuscationGuard ^ -16808, tier1Bits, value);
            stackIn_16_0 = tier1Bits + 2;
            return stackIn_16_0;
          }
          if (value <= 0) {
            value = value + var7_intLifetime1;
          } else {
            value = value - var7_intLifetime1;
          }
          var7_intLifetime2 = 1 << -1 + tier2Bits;
          if (value <= var7_intLifetime2 - 1 &&
            value >= -var7_intLifetime2) {
            packet.writeBits(-16807, 2, 2);
            packet.writeBits(-16807, tier2Bits, value);
            stackIn_27_0 = 2 + tier2Bits;
            return stackIn_27_0;
          }
          if (value <= 0) {
            value = value + var7_intLifetime2;
          } else {
            value = value - var7_intLifetime2;
          }
          var7_intLifetime3 = 1 << tier3Bits - 1;
          if (value <= -1 + var7_intLifetime3 &&
            value >= -var7_intLifetime3) {
            packet.writeBits(-16807, 2, 3);
            packet.writeBits(-16807, tier3Bits, value);
            stackIn_31_0 = 2 + tier3Bits;
            return stackIn_31_0;
          }
          if (value <= 0) {
            value = value + var7_intLifetime3;
          } else {
            value = value - var7_intLifetime3;
          }
          throw new IllegalArgumentException("out of range " + value);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_38_0 = var7;
          stackIn_38_1 = new StringBuilder().append("ir.L(").append(tier1Bits).append(',').append(tier2Bits).append(',').append(value).append(',').append(tier3Bits).append(',').append(obfuscationGuard).append(',').append(tier0Bits).append(',');
          if (packet == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_d = null;
        field_f = null;
        int var1 = 59 % ((param0 + 1) / 41);
        field_h = null;
        field_k = null;
        field_j = null;
    }

    final static String a(int param0, int param1) {
        if (param0 != 10602) {
          CipherPacketBuffer var3 = (CipherPacketBuffer) null;
          AiInfluenceMap.writeTieredSignedInt(12, 72, -87, -119, -83, -86, (CipherPacketBuffer) null);
        }
        return Integer.toString(param1);
    }

    final void a(float[][] param0, int param1, int param2, Unit param3) {
        int var9 = 0;
        int var10 = 0;
        float[] dupTemp$0 = null;
        float[] dupTemp$1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var7Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param3.removedFromActivePlay) {
            return;
          }
          var5_int = param3.getUnitCategory(param2 ^ param2);
          var6 = param3.canCaptureStructures(-21428) ? 1 : 0;
          this.a(param3, 124);
          var7 = 0;
          var8 = bw.unitDefinitions[param3.unitType][7];
          this.maximumY = Math.min(this.maximumY + var8, this.mapHeight - 1);
          this.maximumX = Math.min(var8 + this.maximumX, this.mapWidth - 1);
          this.minimumY = Math.max(-var8 + this.minimumY, 0);
          this.minimumX = Math.max(-var8 + this.minimumX, 0);
          for (var9 = this.minimumY; this.maximumY >= var9; var9++) {
            var16 = this.mapWidth * var9 + this.minimumX;
            var7Lifetime1 = var16;
            for (var10 = this.minimumX; var10 <= this.maximumX; var10++) {
              var11 = this.a(this.packedCosts, param3, var10, var9, (byte) 5);
              if (var11 != 1000000) {
                var12 = this.packedCosts[var11];
                var13 = var12 >> 16;
                var14 = var13 + 1;
                var14 = var14 * var14;
                dupTemp$0 = param0[var5_int];
                dupTemp$0[var16] = dupTemp$0[var16] + (float)(param1 * param3.getEffectiveStrength((byte) 122)) / (float)var14;
              }
              if (var6 != 0) {
                var12Lifetime1 = this.packedCosts[var16];
                var13Lifetime1 = var12Lifetime1 >> 16;
                var14Lifetime1 = var13Lifetime1 + 1;
                var14Lifetime1 = var14Lifetime1 * var14Lifetime1;
                dupTemp$1 = param0[8];
                dupTemp$1[var16] = dupTemp$1[var16] + (float)(param1 * param3.getEffectiveStrength((byte) 122)) / (float)var14Lifetime1;
              }
              var16++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("ir.G(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, float param2, int param3, float[][][] param4, boolean param5, int param6, boolean param7) {
        try {
          if (!param7) {
            this.mapWidth = -97;
          }
          this.a(param4[param0][param6], param5, param2, param0, (byte) -4, param6, param3, param1);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ir.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void writeCoatOfArms(int[] parts, byte obfuscationGuard, PacketBuffer packet, int[] colourIndices) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 100) {
            field_l = (String) null;
          }
          for (var4_int = 0; 6 > var4_int; var4_int++) {
            packet.writeByte(obfuscationGuard - 99, parts[var4_int]);
            packet.writeByte(1, colourIndices[var4_int]);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ir.K(");
          if (parts == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(',');
          if (packet == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (colourIndices == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void a(Unit param0, int param1) {
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var3_intLifetime1;
        int var6Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          for (var3_int = 0; this.packedCosts.length > var3_int; var3_int++) {
            this.packedCosts[var3_int] = 268435455;
          }
          this.minimumY = param0.tileY;
          this.maximumX = param0.tileX;
          this.maximumY = param0.tileY;
          this.minimumX = param0.tileX;
          this.maximumX = Math.min(this.maximumX + 1, -1 + this.mapWidth);
          this.maximumY = Math.min(1 + this.maximumY, this.mapHeight - 1);
          this.minimumX = Math.max(-1 + this.minimumX, 0);
          this.minimumY = Math.max(-1 + this.minimumY, 0);
          this.packedCosts[param0.tileX + param0.tileY * this.mapWidth] = 0;
          if (param1 < 118) {
            this.minimumX = -1;
          }
          var3_intLifetime1 = 3 * bw.unitDefinitions[param0.unitType][3];
          var4 = 0;
          while (500 > var4) {
            var5 = 0;
            var6 = 0;
            for (var7 = this.minimumY; this.maximumY >= var7; var7++) {
              var12 = this.minimumX + var7 * this.mapWidth;
              var6Lifetime1 = var12;
              for (var8 = this.minimumX; this.maximumX >= var8; var8++) {
                var9 = 2147483647;
                if (var8 > 0) {
                  var10 = this.packedCosts[-1 + var12] + SpellCastEvent.a(this.mapWidth, this.tiles, false, var12, param0.ownerPlayer, this.mapHeight, -1, param0, var12 - 1, false, true);
                  if (var3_intLifetime1 < (65535 & var10)) {
                    var10 = -var3_intLifetime1 + (((var10 >> 16) + 1 << 16) + (65535 & var10));
                  }
                  if (var9 > var10) {
                    var9 = var10;
                  }
                }
                if (var7 > 0) {
                  var10Lifetime1 = this.packedCosts[var12 - this.mapWidth] + SpellCastEvent.a(this.mapWidth, this.tiles, false, var12, param0.ownerPlayer, this.mapHeight, -1, param0, var12 - this.mapWidth, false, true);
                  if (var3_intLifetime1 < (var10Lifetime1 & 65535)) {
                    var10Lifetime1 = (65535 & var10Lifetime1) + ((1 + (var10Lifetime1 >> 16) << 16) - var3_intLifetime1);
                  }
                  if (var9 > var10Lifetime1) {
                    var9 = var10Lifetime1;
                  }
                }
                if (-1 + this.mapWidth > var8) {
                  var10Lifetime2 = this.packedCosts[1 + var12] + SpellCastEvent.a(this.mapWidth, this.tiles, false, var12, param0.ownerPlayer, this.mapHeight, -1, param0, var12 + 1, false, true);
                  if ((var10Lifetime2 & 65535) > var3_intLifetime1) {
                    var10Lifetime2 = (1 + (var10Lifetime2 >> 16) << 16) + (var10Lifetime2 & 65535) - var3_intLifetime1;
                  }
                  if (var10Lifetime2 < var9) {
                    var9 = var10Lifetime2;
                  }
                }
                if (-1 + this.mapHeight > var7) {
                  var10Lifetime3 = this.packedCosts[this.mapWidth + var12] + SpellCastEvent.a(this.mapWidth, this.tiles, false, var12, param0.ownerPlayer, this.mapHeight, -1, param0, var12 + this.mapWidth, false, true);
                  if ((var10Lifetime3 & 65535) > var3_intLifetime1) {
                    var10Lifetime3 = -var3_intLifetime1 + ((var10Lifetime3 >> 16) + 1 << 16) + (65535 & var10Lifetime3);
                  }
                  if (var9 > var10Lifetime3) {
                    var9 = var10Lifetime3;
                  }
                }
                if (var9 < this.packedCosts[var12] &&
                  6 >= var9 >> 16) {
                  this.packedCosts[var12] = var9;
                  if (this.maximumY <= var7) {
                    this.maximumY = Math.min(var7 + 1, this.mapHeight - 1);
                  }
                  if (this.maximumX <= var8) {
                    this.maximumX = Math.min(1 + var8, this.mapWidth - 1);
                  }
                  if (this.minimumY >= var7) {
                    this.minimumY = Math.max(-1 + var7, 0);
                  }
                  if (var8 <= this.minimumX) {
                    this.minimumX = Math.max(-1 + var8, 0);
                  }
                  if (var5 < var9) {
                    var5 = var9;
                  }
                }
                var12++;
              }
            }
            if (var5 == 0) {
              return;
            }
            var4++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_60_0 = var3;
          stackIn_60_1 = new StringBuilder().append("ir.B(");
          if (param0 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int stackIn_13_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_61_0 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var7Lifetime1Lifetime1;
        int var8Lifetime1Lifetime1;
        int var9Lifetime1Lifetime1;
        int var9Lifetime1Lifetime1Lifetime1;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 + param3 >= 0 &&
          param3 + param0 < this.mapWidth &&
          param5 + param4 >= 0 &&
          this.mapHeight > param4 + param5) {
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (param3 != 0) {
            if (param3 == 0) {
              stackIn_28_0 = (param4 > 0) ? 1 : -1;
              var7 = stackIn_28_0;
              param4 = param4 * var7;
              var8 = 1;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (var8 >= param4))) {
                var9 = param0 + (var8 * var7 + param5) * this.mapWidth;
                if ((param2 ||
                  2 != this.tiles[var9].terrainType) && this.tiles[var9].terrainType != 3) {
                  var8++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                decompiledFrameCompleted0 = false;
              }
              if (decompiledFrameCompleted0) {
                return false;
              }
            }
          } else {
            if (0 == param4) {
              return true;
            }
            if (param3 == 0) {
              stackIn_13_0 = (param4 > 0) ? 1 : -1;
              var7 = stackIn_13_0;
              param4 = param4 * var7;
              for (var8 = 1; var8 < param4; var8++) {
                var9 = param0 + (var8 * var7 + param5) * this.mapWidth;
                if (!param2 &&
                  2 == this.tiles[var9].terrainType) {
                  return false;
                }
                if (this.tiles[var9].terrainType == 3) {
                  return false;
                }
              }
              decompiledFrameRemainder0 = false;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0)) {
            if (param1 >= -23) {
              field_f = (ResourceArchive) null;
            }
            if (param4 == 0) {
              stackIn_45_0 = (param3 <= 0) ? -1 : 1;
              var7Lifetime1 = stackIn_45_0;
              param3 = param3 * var7Lifetime1;
              var8Lifetime1 = 1;
              while (true) {
                if (var8Lifetime1 >= param3) {
                  return true;
                }
                var9Lifetime1 = param5 * this.mapWidth + var7Lifetime1 * var8Lifetime1 + param0;
                if ((param2 ||
                  this.tiles[var9Lifetime1].terrainType != 2) && this.tiles[var9Lifetime1].terrainType != 3) {
                  var8Lifetime1++;
                  continue;
                }
                break;
              }
              return false;
            }
            stackIn_58_0 = (0 < param3) ? 1 : -1;
            var7Lifetime1Lifetime1 = stackIn_58_0;
            stackIn_61_0 = (0 >= param4) ? -1 : 1;
            boolean decompiledFrameCompleted1 = true;
            var8Lifetime1Lifetime1 = stackIn_61_0;
            param3 = param3 * var7Lifetime1Lifetime1;
            param4 = param4 * var8Lifetime1Lifetime1;
            if (param3 > param4) {
              var9Lifetime1Lifetime1 = 1;
              while (true) {
                if (var9Lifetime1Lifetime1 >= param3) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                var10 = var9Lifetime1Lifetime1 * param4 / param3;
                var11 = (var10 * var8Lifetime1Lifetime1 + param5) * this.mapWidth + var9Lifetime1Lifetime1 * var7Lifetime1Lifetime1 + param0;
                if ((param2 ||
                  this.tiles[var11].terrainType != 2) && this.tiles[var11].terrainType != 3) {
                  var9Lifetime1Lifetime1++;
                  continue;
                }
                break;
              }
              if (decompiledFrameCompleted1) {
                return false;
              }
            }
            if (decompiledFrameCompleted1) {
              var9Lifetime1Lifetime1Lifetime1 = 1;
              while (param4 > var9Lifetime1Lifetime1Lifetime1) {
                var10Lifetime1 = param3 * var9Lifetime1Lifetime1Lifetime1 / param4;
                var11Lifetime1 = (var9Lifetime1Lifetime1Lifetime1 * var8Lifetime1Lifetime1 + param5) * this.mapWidth + var7Lifetime1Lifetime1 * var10Lifetime1 + param0;
                if ((param2 ||
                  2 != this.tiles[var11Lifetime1].terrainType) && this.tiles[var11Lifetime1].terrainType != 3) {
                  var9Lifetime1Lifetime1Lifetime1++;
                  continue;
                }
                return false;
              }
            }
            return true;
          }
          return true;
        }
        return false;
    }

    private final int a(int[] param0, Unit param1, int param2, int param3, byte param4) {
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var6_int = 1000000;
          var7 = 1000000;
          if (param4 != 5) {
            stackIn_3_0 = 115;
            return stackIn_3_0;
          }
          stackIn_7_0 = (bw.unitDefinitions[param1.unitType][0] != 4) ? 0 : 1;
          var8 = stackIn_7_0;
          var9 = bw.unitDefinitions[param1.unitType][6];
          var10 = bw.unitDefinitions[param1.unitType][7];
          for (var11 = -var10; var11 <= var10; var11++) {
            for (var12 = -var10; var10 >= var12; var12++) {
              var13 = Math.abs(var11) + Math.abs(var12);
              if (var9 <= var13 &&
                var13 <= var10 &&
                this.a(param2, -117, var8 != 0, var12, var11, param3)) {
                var15 = (param3 + var11) * this.mapWidth + param2 + var12;
                var16 = param0[var15];
                if (var7 > var16) {
                  var6_int = var15;
                  var7 = var16;
                }
              }
            }
          }
          stackIn_27_0 = var6_int;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_30_0 = var6;
          stackIn_30_1 = new StringBuilder().append("ir.C(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, float param2, int param3, int param4, float[][][] param5, int param6) {
        try {
          if (param0 >= -18) {
            Unit var9 = (Unit) null;
            this.a((Unit) null, 43);
          }
          this.a(param3, param6, param2, param1, param5, false, param4, true);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ir.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    AiInfluenceMap(MapTile[] tiles, int mapWidth, int mapHeight) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var5Lifetime1;
        try {
          this.mapWidth = mapWidth;
          this.mapHeight = mapHeight;
          this.tiles = tiles;
          this.packedCosts = new int[this.tiles.length];
          if (null == IterableDualNodeDeque.field_b) {
            IterableDualNodeDeque.field_b = new Unit[8];
            var12 = new int[IterableDualNodeDeque.field_b.length];
            var11 = var12;
            var9 = var11;
            var4 = var9;
            for (var5 = 0; 75 > var5; var5++) {
              var6 = bw.unitDefinitions[var5][0];
              var7 = bw.unitDefinitions[var5][3];
              if (var12[var6] == 0 ||
                !(bw.unitDefinitions[var12[var6]][3] >= var7)) {
                var12[var6] = var5;
              }
            }
            var10 = 0;
            var5Lifetime1 = var10;
            while (IterableDualNodeDeque.field_b.length > var10) {
              IterableDualNodeDeque.field_b[var10] = new Unit(0, 0, var12[var10]);
              var10++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("ir.<init>(");
          if (tiles == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(mapWidth).append(',').append(mapHeight).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        nt stackIn_37_0 = null;
        boolean stackIn_38_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        nt var3 = null;
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
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var14 = ByteStorage.incomingPacket;
          var2 = var14.readUnsignedByte(0);
          var3 = (nt) (s.field_a.first((byte) 120));
          while (var3 != null) {
            if (var2 != var3.field_o) {
              var3 = (nt) (s.field_a.next((byte) 123));
              continue;
            }
            break;
          }
          if (var3 == null) {
            dj.a((byte) -127);
            return;
          }
          var4 = var14.readUnsignedByte(0);
          if (var4 != 0) {
            var5 = var3.field_q;
            LeaderEscortCondition.field_a[0] = mv.localAccountName;
            for (var6_int = 1; var6_int < var4; var6_int++) {
              LeaderEscortCondition.field_a[var6_int] = var14.readNullTerminatedString(1);
            }
            DelayedPacket.a(2, var5, var4);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              jp.a(var14, -83);
              if (0 == var6_intLifetime1) {
                var3.field_r = RevivalEvent.field_D;
                var3.field_s = ov.field_e;
                var3.field_k = la.field_d;
                var3.field_m = nk.field_m;
                ut.a(RevivalEvent.field_D, nk.field_m, ov.field_e, la.field_d, (byte) 127, var6_intLifetime1);
              } else {
                ut.a(RevivalEvent.field_D, nk.field_m, ov.field_e, la.field_d, (byte) 125, var6_intLifetime1);
              }
            }
            ArchiveIndex.a(var5, 0);
            dupTemp$0 = new String[2][var5];
            var3.field_t = dupTemp$0;
            var6 = dupTemp$0;
            dupTemp$1 = new int[2][var5 * 4];
            var3.field_n = dupTemp$1;
            var7 = dupTemp$1;
            var8 = kt.field_p;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = vt.field_m[var9];
              var6[0][var10] = LeaderEscortCondition.field_a[var11];
              var7[0][var10 * 4] = no.field_U[var11];
              var7[0][1 + 4 * var10] = AnimationFrameSet.field_w[var11];
              var7[0][var10 * 4 + 2] = TutorialController.field_c[var11];
              var7[0][3 + var10 * 4] = VineGrowthAction.field_s[var11];
              if (gt.isLocalAccountName(LeaderEscortCondition.field_a[var11], (byte) 121) &&
                0 == TutorialController.field_c[var11] + AnimationFrameSet.field_w[var11] + VineGrowthAction.field_s[var11]) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var8 > var9Lifetime1) {
              var11Lifetime1 = vt.field_m[var5 + var9Lifetime1];
              var6[1][var13] = LeaderEscortCondition.field_a[var11Lifetime1];
              var7[1][4 * var13] = no.field_U[var11Lifetime1];
              var7[1][var13 * 4 + 1] = AnimationFrameSet.field_w[var11Lifetime1];
              var7[1][var13 * 4 + 2] = TutorialController.field_c[var11Lifetime1];
              var7[1][var13 * 4 + 3] = VineGrowthAction.field_s[var11Lifetime1];
              if (gt.isLocalAccountName(LeaderEscortCondition.field_a[var11Lifetime1], (byte) 109) &&
                VineGrowthAction.field_s[var11Lifetime1] + (AnimationFrameSet.field_w[var11Lifetime1] + TutorialController.field_c[var11Lifetime1]) == 0) {
                var6[1][var13] = null;
                var13--;
              }
              var9Lifetime1++;
              var13++;
            }
          }
          stackIn_37_0 = var3;
          stackIn_38_1 = (param0);
          stackIn_37_0.field_l = stackIn_38_1;
          var3.unlink(50);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "ir.J(" + param0 + ')');
        }
    }

    static {
        field_l = "Prayers to increase your favour.";
        field_j = "RuneScape clan";
        field_k = "Screen Size";
    }
}
