/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ShipAI implements DiffableState {
    private ShipBody targetBody;
    private int desiredVelocityY;
    private int parentPlayer;
    private int desiredVelocityX;
    static int[] field_c;
    private int desiredAngularVelocity;

    private final int computeCombatRange(ShipComponent[] param0, int param1, int param2) {
        int var5 = 0;
        int var4_int = 0;
        ShipComponent var6 = null;
        int var7 = 0;
        int var9 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var8 = 0;
        var9 = VoidHunters.field_G;
        try {
          var4_int = 0;
          for (var5 = 0; var5 < param2; var5++) {
            var6 = param0[var5];
            var7 = var6.weaponbehaviour.weapontype;
            if (!var6.isDestroyed((byte) 86) &&
              2 != var7 &&
              var7 != 8 &&
              9 != var7 &&
              var7 != 10) {
              var8 = var6.weaponbehaviour.getDefinition((byte) 24).getProjectileRange(118);
              if (var8 > var4_int) {
                var4_int = var8;
              }
            }
          }
          if (param1 > -1) {
            ShipAI.clearSharedReferences(true);
          }
          stackIn_26_0 = var4_int << 3;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("aoa.I(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void drawSteeringDebug(Ship param0, int param1, Camera2D param2, World param3) {
        try {
          int var5_int = -5 / ((-71 - param1) / 50);
          DelayedPacket.drawLine(param2.worldToScreenY(true, param0.y + this.desiredVelocityY), param2.worldToScreenX(param0.x + this.desiredVelocityX, (byte) 124), param2.worldToScreenX(param0.x, (byte) 127), param2.worldToScreenY(true, param0.y), -16777216, 16776960);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "aoa.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void addAsteroidAvoidance(int param0, Ship param1, World param2) {
        int var9 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Asteroid[] var6 = null;
        int var7 = 0;
        Asteroid[] var8 = null;
        Asteroid var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = VoidHunters.field_G;
        try {
          var4_int = 0;
          var5 = param0;
          var6 = param2.getAsteroids(true);
          var7 = param1.getBoundingExtent(-101);
          var8 = var6;
          for (var9 = 0; var9 < var8.length; var9++) {
            var10 = var8[var9];
            if (var10 != null) {
              var11 = var10.getBoundingExtent(-42) + var7 >> 6;
              var12 = var10.x - param1.x;
              var13 = var10.y - param1.y;
              var14 = TextLayout.approximateVectorLength(var12, (byte) 122, var13) >> 9;
              if (var14 <= var11 / 2) {
                if (var14 <= 0) {
                  var14 = 1;
                }
                var15 = GameSnapshotFactory.a(-var13, (byte) -77, -var12);
                var4_int = var4_int + GetNumStars.cosAngle(var15, (byte) -106) * var11 / (var14 * var14);
                var5 = var5 + var11 * TextureLineShape.sinAngle(var15, 40) / (var14 * var14);
              }
            }
          }
          this.desiredVelocityY = this.desiredVelocityY + var5;
          this.desiredVelocityX = this.desiredVelocityX + var4_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("aoa.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public final void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        ShipAI var3 = (ShipAI) (other);
        int var4 = 0;
        if (var3.parentPlayer != this.parentPlayer) {
          var4 = 1;
          System.out.println("int parent_player has changed. before=" + var3.parentPlayer + ", now=" + this.parentPlayer);
        }
        if (obfuscationGuard >= -19) {
          return;
        }
        try {
          if (var4 != 0) {
            System.out.println("This instance of ShipAI has changed");
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "aoa.F(" + (other != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    private final void updateSteering(boolean param0, int param1, Ship param2, World param3) {
        int var5_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.desiredVelocityY = 0;
          if (param0) {
            field_c = (int[]) null;
          }
          this.targetBody = null;
          this.desiredVelocityX = 0;
          this.desiredAngularVelocity = 0;
          this.computeTargetSteering(param3, (byte) -89, param2, param1);
          if (!param2.isFighter(param0)) {
            var5_int = param2.chassis.countActiveThrusters(-8913);
            if (var5_int > 0) {
              this.addAsteroidAvoidance(0, param2, param3);
              this.addFriendlyShipAvoidance(param3, (byte) -103, param2);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("aoa.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        try {
          if (param1) {
            World var4 = (World) null;
            this.drawSteeringDebug((Ship) null, 11, (Camera2D) null, (World) null);
          }
          this.parentPlayer = param0.readBits(0, 4);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "aoa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean differsFrom(byte param0, SerializableGameState param1) {
        ShipAI var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (ShipAI) (param1);
          var4 = -12 % ((param0 - 22) / 59);
          stackIn_3_0 = (var3.parentPlayer != this.parentPlayer);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("aoa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(boolean param0) {
        if (param0) {
          return;
        }
        field_c = null;
    }

    final boolean applyAiControls(Ship param0, byte param1, World param2) {
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_94_2 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_97_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Random var9_ref_Random = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        IntrusiveDeque var16_ref_ij = null;
        int var17 = 0;
        Object var18_ref = null;
        int var18 = 0;
        Projectile var18_ref_tj = null;
        ShipComponent var19_ref_ml = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        SerializableGameState var24 = null;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var17Lifetime2;
        int var20Lifetime2;
        int var21Lifetime2;
        var18_ref = null;
        var23 = VoidHunters.field_G;
        try {
          if (param1 != -73) {
            var24 = (SerializableGameState) null;
            this.copyTo((byte) -82, (SerializableGameState) null);
          }
          var4_int = param0.dx;
          var5 = param0.dy;
          var6 = param0.angularvelocity;
          var7 = param0.chassis.collectWeapons(127, 0);
          var8 = this.computeCombatRange(GetPointDefenceLaserProjectileInterceptDamage.field_q, -18, var7);
          if (var8 > GetUseNiceTrails.fogOfWarSensorRange) {
            var8 = GetUseNiceTrails.fogOfWarSensorRange;
          }
          if (param0.isFighter(false)) {
            var9_ref_Random = new Random((long)(param0.id * GetSniperCannonFireForce.field_o));
            var10 = 1000;
            if (this.targetBody == null) {
              var10 = 4000;
            }
            if (TextHotspotRegion.randomBoundedInt(var9_ref_Random, var10, 125) == 0) {
              ArchiveProvider.playSpatialSound(50, param0.y, param0.x, false, 94, 512);
            }
          }
          this.updateSteering(false, var8, param0, param2);
          var9 = 0;
          var10Lifetime1 = 0;
          var11 = 0;
          if (this.targetBody != null) {
            var10Lifetime1 = this.targetBody.chassis.finalx;
            var11 = this.targetBody.chassis.finaly;
            var12 = -param0.x + var10Lifetime1;
            var13 = var11 - param0.y;
            var14 = TextLayout.approximateVectorLength(var12, (byte) 109, var13);
            var15 = GameSnapshotFactory.a(var13, (byte) -77, var12);
            if (16384 + var8 >= var14) {
              var16 = 0;
              var17 = 2147483647;
              for (var18 = 0; var18 < var7; var18++) {
                var19_ref_ml = GetPointDefenceLaserProjectileInterceptDamage.field_q[var18];
                var20 = var19_ref_ml.weaponbehaviour.weapontype;
                if (!var19_ref_ml.isDestroyed((byte) 48) &&
                  var20 != 2 &&
                  var20 != 8 &&
                  9 != var20 &&
                  var20 != 10 &&
                  var8 >> 3 <= var19_ref_ml.weaponbehaviour.getDefinition((byte) 24).getProjectileRange(127)) {
                  var21 = var19_ref_ml.getUnrotatedWorldAngle((byte) -127);
                  var22 = GameKeyHandler.a(param1 + 22506, var15 - var21);
                  if (var17 > Math.abs(var22)) {
                    var17 = Math.abs(var22);
                    var16 = var22;
                  }
                }
              }
              if (var17 < 2147483647) {
                this.desiredAngularVelocity = var16 << 8;
              }
              if (FlipTextureOperation.field_p == 0) {
                param0.aimAt(8, var11, var10Lifetime1);
              }
              var9 = var9 | 16;
            } else {
              if (0 != this.desiredVelocityX &&
                this.desiredVelocityY != 0) {
                var16 = GameSnapshotFactory.a(this.desiredVelocityY, (byte) -77, this.desiredVelocityX);
                this.desiredAngularVelocity = GameKeyHandler.a(22433, var16 - param0.getAngle(param1 ^ -73)) << 8;
              }
            }
            if (GetUseNiceTrails.fogOfWarSensorRange > var14) {
              param0.activateSpecialOrder(-73, 2, param2, var11, var10Lifetime1);
              param0.activateSpecialOrder(-126, 6, param2, var11, var10Lifetime1);
              if (!param0.getShieldsOn(31390)) {
                param0.activateSpecialOrder(param1 ^ 30, 3, param2, var11, var10Lifetime1);
              }
            }
            if (param0.chassis.hasAvailableSpecialOrder((byte) 70, 7)) {
              var16_ref_ij = param2.getProjectiles(true);
              var17Lifetime2 = 0;
              var18_ref_tj = (Projectile) (var16_ref_ij.first(0));
              while (true) {
                boolean decompiledFrameRemainder0 = true;
                if (var18_ref_tj != null) {
                  if (var18_ref_tj.getType((byte) -104) == 6 &&
                    var18_ref_tj.getTargetBody((byte) -119) == param0.id) {
                    var19 = var18_ref_tj.x - param0.x;
                    var20Lifetime2 = var18_ref_tj.y - param0.y;
                    var21Lifetime2 = TextLayout.approximateVectorLength(var19, (byte) 115, var20Lifetime2);
                    if (var21Lifetime2 < UiComboBoxRenderer.field_a) {
                      var17Lifetime2 = 1;
                      decompiledFrameRemainder0 = false;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var18_ref_tj = (Projectile) (var16_ref_ij.next((byte) 55));
                    continue;
                  }
                }
                if (var17Lifetime2 == 0) {
                  break;
                }
                param0.activateSpecialOrder(-111, 7, param2, var11, var10Lifetime1);
                break;
              }
            }
          }
          var12Lifetime1 = 1024;
          var13Lifetime1 = 1024;
          var14Lifetime1 = this.desiredVelocityX - var4_int;
          var15Lifetime1 = -var5 + this.desiredVelocityY;
          var16Lifetime1 = this.desiredAngularVelocity - var6;
          if (var14Lifetime1 != 0 ||
            var15Lifetime1 != 0 ||
            var16Lifetime1 != 0) {
            if (Math.abs(var16Lifetime1) > var12Lifetime1) {
              if (var16Lifetime1 <= 0) {
                if (var16Lifetime1 < 0) {
                  var9 = var9 | 4;
                }
              } else {
                var9 = var9 | 8;
              }
            }
            if (var14Lifetime1 != 0 ||
              var15Lifetime1 != 0) {
              var17Lifetime1 = GameSnapshotFactory.a(var15Lifetime1, (byte) -77, var14Lifetime1);
              var18Lifetime1 = param0.getAngle(0);
              var19Lifetime1 = GameKeyHandler.a(22433, var17Lifetime1 - var18Lifetime1);
              var20Lifetime1 = GameKeyHandler.a(22433, -4096 - (var18Lifetime1 - var17Lifetime1));
              var21Lifetime1 = GameKeyHandler.a(22433, 2048 - (var18Lifetime1 - var17Lifetime1));
              var22Lifetime1 = GameKeyHandler.a(param1 + 22506, var17Lifetime1 - var18Lifetime1 - 2048);
              if (Math.abs(var19Lifetime1) < var13Lifetime1) {
                var9 = var9 | 1;
              }
              if (var13Lifetime1 > Math.abs(var20Lifetime1)) {
                var9 = var9 | 2;
              }
              if (var13Lifetime1 > Math.abs(var21Lifetime1)) {
                var9 = var9 | 32;
              }
              if (Math.abs(var22Lifetime1) < var13Lifetime1) {
                var9 = var9 | 64;
              }
            }
          }
          if (var9 == 0) {
            return false;
          }
          param0.applyControls(param2, var9, false, var10Lifetime1, var11);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_93_0 = var4;
          stackIn_93_1 = new StringBuilder().append("aoa.O(");
          if (param0 == null) {
            stackIn_94_2 = "null";
          } else {
            stackIn_94_2 = "{...}";
          }
          stackIn_96_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_94_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_97_2 = "null";
          } else {
            stackIn_97_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_93_0), ((StringBuilder) (Object) stackIn_96_1).append(stackIn_97_2).append(')').toString());
        }
    }

    final int getParentPlayerId(byte param0) {
        int var2 = -17 / ((param0 + 52) / 54);
        return -1 + this.parentPlayer;
    }

    private final void addFriendlyShipAvoidance(World param0, byte param1, Ship param2) {
        int var9 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Ship[] var7 = null;
        Ship[] var8 = null;
        Ship var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = VoidHunters.field_G;
        try {
          var4_int = 0;
          var5 = 0;
          if (param1 != -103) {
            return;
          }
          var6 = param2.getBoundingExtent(-100);
          var7 = param0.getShips(1000);
          var8 = var7;
          for (var9 = 0; var8.length > var9; var9++) {
            var10 = var8[var9];
            if (var10 != null &&
              param2 != var10 &&
              var10.getTeam((byte) 70) == param2.getTeam((byte) 97)) {
              var11 = var6 + var10.getBoundingExtent(-86) >> 6;
              var12 = -param2.x + var10.x;
              var13 = var10.y - param2.y;
              var14 = TextLayout.approximateVectorLength(var12, (byte) 109, var13) >> 9;
              if (256 >= var14) {
                if (var14 <= 0) {
                  var14 = 1;
                }
                var15 = GameSnapshotFactory.a(-var13, (byte) -77, -var12);
                var4_int = var4_int + var11 * GetNumStars.cosAngle(var15, (byte) 85) / (var14 * var14);
                var5 = var5 + TextureLineShape.sinAngle(var15, 107) * var11 / (var14 * var14);
              }
            }
          }
          this.desiredVelocityY = this.desiredVelocityY + var5;
          this.desiredVelocityX = this.desiredVelocityX + var4_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("aoa.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final void computeTargetSteering(World param0, byte param1, Ship param2, int param3) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
        Ship var16 = null;
        try {
          var16 = GetGrapplingHookCooldown.findNearestAiTarget(param0, (byte) 63, this.getParentPlayerId((byte) 70), param2);
          if (var16 != null) {
            var6 = var16.chassis.finalx;
            var7 = var16.chassis.finaly;
            var8 = GameSnapshotFactory.a(param2.y - var7, (byte) -77, -var6 + param2.x);
            var9 = param3;
            var10 = var6 + (GetNumStars.cosAngle(var8, (byte) 38) >> 8) * (var9 >> 8);
            var11 = (var9 >> 8) * (TextureLineShape.sinAngle(var8, 127) >> 8) + var7;
            var12 = 256;
            var13 = -param2.x + var10;
            var14 = var11 - param2.y;
            var15 = TextLayout.approximateVectorLength(var13, (byte) 120, var14);
            if (var12 < var15) {
              var13 = var12 * var13 / (var15 >> 4);
              var14 = var14 * var12 / (var15 >> 4);
            }
            this.desiredVelocityY = var14;
            this.targetBody = (ShipBody) ((Object) var16);
            this.desiredVelocityX = var13;
          }
          if (param1 >= -76) {
            this.targetBody = (ShipBody) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("aoa.M(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final void setParentPlayerId(int param0, boolean param1) {
        this.parentPlayer = param0 + 1;
        if (!param1) {
          field_c = (int[]) null;
        }
    }

    public final void copyTo(byte param0, SerializableGameState param1) {
        ShipAI var6 = null;
        ShipAI var7 = null;
        try {
          var6 = (ShipAI) (param1);
          var7 = var6;
          if (param0 < 54) {
            SerializableGameState var4 = (SerializableGameState) null;
            this.differsFrom((byte) -32, (SerializableGameState) null);
          }
          var7.parentPlayer = this.parentPlayer;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "aoa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        if (param1 > -109) {
          return;
        }
        try {
          param0.writeBits(-632, this.parentPlayer, 4);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "aoa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_c = new int[8192];
    }
}
