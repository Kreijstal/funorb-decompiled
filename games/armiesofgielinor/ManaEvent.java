/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ManaEvent extends GameEvent {
    static String field_A;
    int manaPoints;
    int playerId;
    int manaTypeCode;
    static String[] field_y;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, byte param8) {
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (0 <= param3 &&
            param1 < TriangleRasterizer.clipHeight) {
            if (param7 < 0 &&
              0 > param4 &&
              param2 < 0) {
              return;
            }
            if (TriangleRasterizer.clipWidth <= param7 &&
              TriangleRasterizer.clipWidth <= param4 &&
              TriangleRasterizer.clipWidth <= param2) {
              return;
            }
            var14 = -param1 + param3;
            if (param0 == param1) {
              if (param3 == param1) {
                var12 = 0;
                var9_int = param7 << 16;
                var11 = 0;
                var10 = param4 << 16;
              } else {
                var15 = -param0 + param3;
                if (param7 >= param4) {
                  var10 = param7 << 16;
                  var12 = (param2 - param7 << 16) / var14;
                  var11 = (param2 - param4 << 16) / var15;
                  var9_int = param4 << 16;
                } else {
                  var9_int = param7 << 16;
                  var12 = (-param4 + param2 << 16) / var15;
                  var10 = param4 << 16;
                  var11 = (param2 - param7 << 16) / var14;
                }
              }
              if (0 > param1) {
                param1 = Math.min(-param1, -param1 + param0);
                var10 = var10 + param1 * var12;
                var9_int = var9_int + var11 * param1;
                param1 = 0;
              }
              var13 = 0;
            } else {
              var10 = param7 << 16;
              var9_int = param7 << 16;
              var15 = param0 - param1;
              var12 = (param2 - param7 << 16) / var14;
              var11 = (-param7 + param4 << 16) / var15;
              if (var11 < var12) {
                var13 = 0;
              } else {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param1 < 0) {
                if (param0 < 0) {
                  param1 = param0 - param1;
                  var10 = var10 + param1 * var12;
                  var9_int = var9_int + var11 * param1;
                  param1 = param0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param1 = -param1;
                  var9_int = var9_int + var11 * param1;
                  var10 = var10 + var12 * param1;
                  param1 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = TriangleRasterizer.scanlineOffsets[param1];
                while (param0 > param1) {
                  var17 = var9_int >> 16;
                  if (var17 < TriangleRasterizer.clipWidth) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 != 0) {
                      if (TriangleRasterizer.clipWidth <= var17 + var18) {
                        var18 = -var17 + TriangleRasterizer.clipWidth - 1;
                      }
                      if (var17 < 0) {
                        tf.a(var16Lifetime2, param8 - 1432128883, var17 + var18, param6, param5);
                      } else {
                        tf.a(var17 + var16Lifetime2, -1432128863, var18, param6, param5);
                      }
                    } else {
                      if (var17 >= 0 &&
                        TriangleRasterizer.clipWidth > var17) {
                        tf.a(var16Lifetime2 + var17, -1432128863, var18, param6, param5);
                      }
                    }
                  }
                  param1++;
                  if (param1 >= TriangleRasterizer.clipHeight) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + SoftwareRaster.width;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              }
              var16Lifetime3 = -param0 + param3;
              if (var16Lifetime3 == 0) {
                var11 = 0;
                var12 = 0;
              } else {
                var17Lifetime2 = param2 << 16;
                if (var13 == 0) {
                  var9_int = param4 << 16;
                } else {
                  var10 = param4 << 16;
                }
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
              }
            }
            if (param8 != 20) {
              return;
            }
            if (param1 < 0) {
              param1 = -param1;
              var10 = var10 + var12 * param1;
              var9_int = var9_int + param1 * var11;
              param1 = 0;
            }
            var15Lifetime1 = TriangleRasterizer.scanlineOffsets[param1];
            while (param1 < param3) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < TriangleRasterizer.clipWidth) {
                var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (var17Lifetime1 == 0) {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < TriangleRasterizer.clipWidth) {
                    tf.a(var15Lifetime1 + var16Lifetime1, -1432128863, var17Lifetime1, param6, param5);
                  }
                } else {
                  if (TriangleRasterizer.clipWidth <= var16Lifetime1 + var17Lifetime1) {
                    var17Lifetime1 = TriangleRasterizer.clipWidth - (var16Lifetime1 + 1);
                  }
                  if (var16Lifetime1 >= 0) {
                    tf.a(var16Lifetime1 + var15Lifetime1, -1432128863, var17Lifetime1, param6, param5);
                  } else {
                    tf.a(var15Lifetime1, param8 - 1432128883, var17Lifetime1 + var16Lifetime1, param6, param5);
                  }
                }
              }
              param1++;
              if (TriangleRasterizer.clipHeight <= param1) {
                return;
              }
              var10 = var10 + var12;
              var15Lifetime1 = var15Lifetime1 + SoftwareRaster.width;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_81_0 = var9;
          stackIn_81_1 = new StringBuilder().append("vp.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_A = null;
        if (param0 != -829) {
          return;
        }
        field_y = null;
    }

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        int var4 = 118 % ((obfuscationGuard - 53) / 51);
        String var3 = "EventMana: type: , points: " + this.manaPoints + ", player: " + this.playerId;
        return var3;
    }

    final static void a(byte param0, int param1) {
        CipherPacketBuffer var2 = null;
        if (param0 == 69) {
          var2 = vl.outgoingPacket;
          var2.writeCipheredOpcode(32161, param1);
          var2.writeByte(1, 1);
          var2.writeByte(1, 3);
          return;
        }
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        int dupTemp$0 = 0;
        try {
          if (obfuscationGuard != -26661) {
            ManaEvent.a((byte) 14, 105);
          }
          if (0 > battlefield.localPlayer &&
            this.playerId >= 0 &&
            this.playerId < battlefield.playerMana.length) {
            battlefield.playerMana[this.playerId] = battlefield.playerMana[this.playerId] + this.manaPoints;
            if (battlefield.playerMana[this.playerId] > 1000000000) {
              battlefield.playerMana[this.playerId] = 1000000000;
            }
            dupTemp$0 = battlefield.getPlayerTeamIndex(this.playerId, -1);
            battlefield.teamManaCollected[dupTemp$0] = battlefield.teamManaCollected[dupTemp$0] + this.manaPoints;
            if (battlefield.teamManaCollected[battlefield.getPlayerTeamIndex(this.playerId, -1)] > 1000000000) {
              battlefield.teamManaCollected[battlefield.getPlayerTeamIndex(this.playerId, -1)] = 1000000000;
            }
          }
          fl.recomputeClientStateChecksum(battlefield, -120);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vp.G(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -84) {
            return false;
          }
          this.manaTypeCode = -20;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("vp.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    ManaEvent(int manaTypeCode, int manaPoints, int playerId) {
        this.eventKind = 9;
        this.manaTypeCode = manaTypeCode;
        this.manaPoints = manaPoints;
        this.playerId = playerId;
    }

    final static RgbSprite a(int param0, int param1, int param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -9027) {
            ManaEvent.g(-17);
          }
          if (kp.a(false, param0, param3, param1)) {
            return gv.a(2809);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("vp.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_A = "Loading";
        field_y = new String[]{"This unit has a normal <%0> attack.", "This unit deals +2 damage with <%0> attacks.", "This unit deals +5 damage with <%0> attacks.", "This unit deals +10 damage with <%0> attacks.", "This unit's <%0> attacks have +2 maximum range.", "This unit's <%0> attacks have +3 maximum range.", "This unit's <%0> attacks poison enemy units."};
    }
}
