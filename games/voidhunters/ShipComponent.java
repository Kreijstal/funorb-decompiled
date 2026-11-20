/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ShipComponent implements DiffableState, CompactGameState {
    int[] finaloutline;
    int finalangle;
    ThrusterBehaviour thrusterbehaviour;
    Hardpoint[] hardpoints;
    WeaponBehaviour weaponbehaviour;
    private ComponentBehaviour behaviour;
    int finalx;
    GrappleLauncherBehaviour grapplebehaviour;
    ShipComponent[] subcomponents;
    private int connectionpointx;
    private int connectionpointy;
    int componentTypeId;
    int triggermap;
    private int health;
    int finaly;
    private int connectedangle;
    private int currentconnectedangle;
    static byte[][][] field_l;

    final void accumulateMassMoments(byte param0, int[] param1) {
        int var4 = 0;
        int var3_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = VoidHunters.field_G;
        try {
          var3_int = this.getDefinition((byte) -112).mass;
          param1[1] = param1[1] + (this.finaly * var3_int >> 4);
          param1[2] = param1[2] + var3_int;
          if (param0 < 23) {
            return;
          }
          param1[0] = param1[0] + (this.finalx * var3_int >> 4);
          if (null != this.subcomponents) {
            for (var4 = 0; var4 < this.subcomponents.length; var4++) {
              this.subcomponents[var4].accumulateMassMoments((byte) 117, param1);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ml.WC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final int getDefaultConnectionY(byte param0) {
        if (param0 != 100) {
          return -49;
        }
        return this.getDefinition((byte) -112).connectionY;
    }

    final void drawTree(byte param0, Camera2D param1, boolean param2, World param3, int param4) {
        int var6_int = 0;
        int var7 = VoidHunters.field_G;
        this.drawComponent(param3, (byte) 84, param4, param1, param2);
        if (param0 <= 21) {
          return;
        }
        try {
          if (null != this.subcomponents) {
            for (var6_int = 0; this.subcomponents.length > var6_int; var6_int++) {
              this.subcomponents[var6_int].drawTree((byte) 87, param1, param2, param3, param4);
            }
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ml.NB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void activate(ShipBody param0, int param1, World param2, int param3, int param4, int param5) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        ShipComponentDefinition var8 = null;
        try {
          if (param4 <= 7) {
            return;
          }
          var8 = this.getDefinition((byte) -112);
          if (this.thrusterbehaviour != null) {
            this.thrusterbehaviour.activate(true, var8.connectionY, this.finalx, this.finaly, var8.connectionX, param0, var8.outline, this.finaloutline, param2, this.finalangle, param1, param5, param3, this.componentTypeId);
          }
          if (this.weaponbehaviour != null) {
            this.weaponbehaviour.fire(param2, false, var8.connectionX, param3, -97, param0, param1, this.finaly, this.finalangle, this.finalx, var8.connectionY, var8.outline);
          }
          if (this.grapplebehaviour != null) {
            this.grapplebehaviour.fireOrRecall(param3, this.finaly, var8.outline, param1, this.finalangle, this.finalx, var8.connectionY, (byte) 77, param2, var8.connectionX, param0);
          }
          if (null != this.behaviour) {
            this.behaviour.activate(param0, var8.outline, -9151, param1, this.finaly, this.finalangle, var8.connectionX, param2, var8.connectionY, this.finalx, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("ml.CA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void detachFromBody(World param0, int param1, ShipBody param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          if (null != this.grapplebehaviour) {
            this.grapplebehaviour.destroyHook(param0, 19278);
          }
          param0.destroyHooksOnComponent(15520, this, param2);
          if (this.weaponbehaviour != null) {
            if (this.weaponbehaviour.isFiring(true)) {
              this.weaponbehaviour.reload = this.weaponbehaviour.getDefinition((byte) 24).getReloadTime((byte) 12) - this.weaponbehaviour.getDefinition((byte) 24).getPulseDuration((byte) 122);
            }
            this.weaponbehaviour.clearTargetLock(2048);
          }
          if (null != this.subcomponents) {
            for (var4_int = 0; this.subcomponents.length > var4_int; var4_int++) {
              this.subcomponents[var4_int].detachFromBody(param0, -19625, param2);
            }
          }
          if (param1 != -19625) {
            this.finalx = -47;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("ml.AC(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final boolean hasAdjustableConnection(byte param0) {
        int var2;
        boolean stackIn_5_0 = false;
        var2 = 63 / ((-25 - param0) / 43);
        stackIn_5_0 = (this.isSpinningWeapon(-47)) || !(0 >= this.getAimArc(118));
        return stackIn_5_0;
    }

    final void updateBehaviors(boolean param0, byte param1, World param2, ShipBody param3) {
        int stackIn_65_0 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        TargetLock var7 = null;
        ShipBody var8 = null;
        Ship[] var9 = null;
        Object var10 = null;
        int var11 = 0;
        Projectile var12 = null;
        Ship[] var12_array = null;
        int var13 = 0;
        Ship var14 = null;
        int var14_int = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        Ship[] var19 = null;
        int var20 = 0;
        Object var21 = null;
        WeaponDefinition var22 = null;
        ShipComponentDefinition var23 = null;
        IntrusiveDeque var24 = null;
        ShipComponentDefinition var25 = null;
        Ship var26 = null;
        int var5_intLifetime1;
        int var13Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        var21 = null;
        var18 = VoidHunters.field_G;
        try {
          if (this.subcomponents != null) {
            for (var5_int = 0; this.subcomponents.length > var5_int; var5_int++) {
              this.subcomponents[var5_int].updateBehaviors(param0, (byte) -124, param2, param3);
            }
          }
          if (null != this.weaponbehaviour &&
            param0) {
            var23 = this.getDefinition((byte) -112);
            var22 = this.weaponbehaviour.getDefinition((byte) 24);
            if (0 < var22.getMaxSpinSpeed((byte) 97) &&
              this.weaponbehaviour.reload != 0) {
              this.currentconnectedangle = this.currentconnectedangle + this.weaponbehaviour.reload;
              this.weaponbehaviour.update(this.finalx, param3, var23.outline, var23.connectionY, this.finaly, true, var23.connectionX, this.finalangle, param2);
              param3.onStateChanged((byte) -76);
            } else {
              if (!this.isDestroyed((byte) 127)) {
                if (this.weaponbehaviour.usesTargetLock((byte) 101)) {
                  if (this.weaponbehaviour.isFiring(true)) {
                    var7 = this.weaponbehaviour.getTargetLock(2);
                    if (var7 != null) {
                      var8 = param3;
                      if (var7.targetId >= 0) {
                        var8 = param2.getBodyById((byte) -27, var7.targetId);
                      }
                      if (var8 != null) {
                        this.aimAt(var8.getX(false) + var7.targetX, true, 0, var8.getY((byte) -87) + var7.targetY, 21750, 0);
                      }
                    }
                  } else {
                    this.weaponbehaviour.clearTargetLock(param1 + 2172);
                  }
                }
                this.weaponbehaviour.update(this.finalx, param3, var23.outline, var23.connectionY, this.finaly, true, var23.connectionX, this.finalangle, param2);
                if (var22.autoTargetsThreats(param1 ^ 2185)) {
                  var26 = (Ship) (param3);
                  var24 = param2.getProjectiles(true);
                  var9 = param2.getShips(1000);
                  var10 = null;
                  var11 = var22.getProjectileRange(param1 ^ 107);
                  var12 = (Projectile) (var24.first(0));
                  while (var12 != null) {
                    var13 = var12.getType((byte) -104);
                    if ((~var12.getFiredTeam(512) != ~var26.getTeam((byte) 73) ||
                      !ConsoleCharacterStream.usesTeamRules(33, param2.getObjectiveType(false)) &&
                      var12.getFiredPlayer(false) != var26.getOwner((byte) -117)) &&
                      (var13 == 6 ||
                      var13 == 1)) {
                      var14_int = var12.x - this.finalx;
                      var15 = var12.y - this.finaly;
                      var16 = TextLayout.approximateVectorLength(var14_int, (byte) 104, var15);
                      if (var11 > var16 &&
                        this.weaponbehaviour.canAimAtTarget(-26772, var12.y, var12.x, var23, this)) {
                        var10 = var12;
                        var11 = var16;
                      }
                    }
                    var12 = (Projectile) (var24.next((byte) 65));
                  }
                  var19 = var9;
                  var12_array = var9;
                  var20 = 0;
                  var13Lifetime1 = var20;
                  while (var20 < var19.length) {
                    var14 = var19[var20];
                    if (var14 != null &&
                      var14.isFighter(false) &&
                      var14.getTeam((byte) 78) != var26.getTeam((byte) 124)) {
                      var15Lifetime1 = var14.x - this.finalx;
                      var16Lifetime1 = var14.y - this.finaly;
                      var17 = TextLayout.approximateVectorLength(var15Lifetime1, (byte) 109, var16Lifetime1);
                      if (var17 < var11 &&
                        this.weaponbehaviour.canAimAtTarget(param1 ^ 26856, var14.y, var14.x, var23, this)) {
                        var11 = var17;
                        var10 = var14;
                      }
                    }
                    var20++;
                  }
                  if (var10 != null) {
                    this.aimAt(((MovingObject) (var10)).dx + ((MovingObject) (var10)).x, true, 0, ((MovingObject) (var10)).y + ((MovingObject) (var10)).dy, 21750, 0);
                    this.activate(param3, ((MovingObject) (var10)).dy + ((MovingObject) (var10)).y, param2, ((MovingObject) (var10)).x + ((MovingObject) (var10)).dx, 111, 256);
                    param3.onStateChanged((byte) -44);
                  }
                }
              }
            }
            if (0 < var22.getMaxSpinSpeed((byte) 72) &&
              !this.isDestroyed((byte) 106)) {
              this.weaponbehaviour.fire(param2, true, var23.connectionX, 0, -78, param3, 0, this.finaly, this.finalangle, this.finalx, var23.connectionY, var23.outline);
            }
          }
          stackIn_65_0 = (!this.isDestroyed((byte) 46)) ? 0 : 1;
          var5_intLifetime1 = stackIn_65_0;
          if (param1 != -124) {
            this.readState((IsaacPacketBuffer) null, false);
          }
          if (var5_intLifetime1 != 0 &&
            this.weaponbehaviour != null &&
            this.weaponbehaviour.isFiring(true)) {
            this.weaponbehaviour.reload = this.weaponbehaviour.getDefinition((byte) 24).getReloadTime((byte) 57) - this.weaponbehaviour.getDefinition((byte) 24).getPulseDuration((byte) 124);
          }
          if (null != this.thrusterbehaviour) {
            this.thrusterbehaviour.update(var5_intLifetime1 != 0, param3, this.finalangle, this.finaly, this.componentTypeId, this.finaloutline, param1 - 31377, this.finalx, param2);
          }
          var25 = this.getDefinition((byte) -112);
          if (this.grapplebehaviour != null) {
            this.grapplebehaviour.update(param3, param2, this.finaly, var5_intLifetime1 != 0, (byte) 126, this.finalx, this.finalangle, var25.outline);
          }
          if (null != this.behaviour) {
            this.behaviour.update(var5_intLifetime1 != 0, this.finaly, param3, var25.outline, param2, this.finalangle, 123, this.finalx);
          }
          if (var25.field_d > 0 &&
            param0) {
            ((Ship) (param3)).addEnergy(-1, var25.field_d);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_86_0 = var5;
          stackIn_86_1 = new StringBuilder().append("ml.OB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          stackIn_89_1 = ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',');
          if (param3 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_86_0), ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(')').toString());
        }
    }

    final ShipComponent[] collectComponentsInCircle(byte param0, int param1, int param2, ShipComponent[] param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ShipComponent[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          if (this.subcomponents != null) {
            for (var6_int = 0; this.subcomponents.length > var6_int; var6_int++) {
              param3 = this.subcomponents[var6_int].collectComponentsInCircle((byte) 101, param1, param2, param3, param4);
            }
          }
          if (param0 != 101) {
            this.configureThrusterBindings((byte) 114, (ShipBody) null);
          }
          if (ArchiveLoadRequest.intersectsCircle((byte) -57, this.finaloutline, param1, param4, param2)) {
            param3 = (ShipComponent[]) (SoftwareSprite2D.appendStateArrayValue(this, param3, 0, ArchiveTextureProvider.field_d));
          }
          stackIn_11_0 = (ShipComponent[]) (param3);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("ml.IC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final HardpointMatch findNearestHardpoint(int param0, boolean param1, int param2, int param3, int param4, ShipComponent param5, int param6, ShipBody param7) {
        int var11 = 0;
        HardpointMatch stackIn_3_0 = null;
        HardpointMatch stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var9 = null;
        int var10 = 0;
        HardpointMatch var11_ref_lu = null;
        Hardpoint var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var10Lifetime1;
        var16 = VoidHunters.field_G;
        try {
          if (param6 != -29866) {
            stackIn_3_0 = (HardpointMatch) null;
            return stackIn_3_0;
          }
          var9 = null;
          if (this.subcomponents != null) {
            for (var10 = 0; var10 < this.subcomponents.length; var10++) {
              var11_ref_lu = this.subcomponents[var10].findNearestHardpoint(param0, param1, param2, param3, param4, param5, -29866, param7);
              if (var11_ref_lu != null) {
                var9 = var11_ref_lu;
                param2 = ((HardpointMatch) (var9)).distance;
              }
            }
          }
          if (null != this.hardpoints) {
            var10Lifetime1 = -1;
            for (var11 = 0; this.hardpoints.length > var11; var11++) {
              var12 = this.hardpoints[var11];
              var13 = var12.worldx - param0;
              var14 = -param4 + var12.worldy;
              var15 = TextLayout.approximateVectorLength(var13, (byte) 120, var14);
              if (param2 > var15) {
                param2 = var15;
                var10Lifetime1 = var11;
              }
            }
            if (-1 != var10Lifetime1) {
              stackIn_21_0 = new HardpointMatch(var10Lifetime1, this, param2);
              return stackIn_21_0;
            }
          }
          stackIn_23_0 = var9;
          return (HardpointMatch) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_26_0 = var9;
          stackIn_26_1 = new StringBuilder().append("ml.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) (stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    private final void collectCollisions(byte param0, int param1, int param2, IntrusiveDeque param3, int param4, ShipComponent param5) {
        int var7_int = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[][] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        int[][] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var13Lifetime1;
        int var10Lifetime3;
        int var11Lifetime2;
        int var13Lifetime2;
        var16 = VoidHunters.field_G;
        try {
          if (this.subcomponents != null) {
            for (var7_int = 0; this.subcomponents.length > var7_int; var7_int++) {
              this.subcomponents[var7_int].collectCollisions((byte) -52, 1 + param1, var7_int + 1 << 4 * param1 | param2, param3, param4, param5);
            }
          }
          if (TextLayout.approximateVectorLength(-param5.finalx + this.finalx, (byte) 115, -param5.finaly + this.finaly) > this.getDefinition((byte) -112).boundingRadius + param5.getDefinition((byte) -112).boundingRadius) {
            return;
          }
          var7 = this.getDefinition((byte) -112).field_A;
          var8 = 37 % ((61 - param0) / 51);
          var9 = param5.getDefinition((byte) -112).field_A;
          if (var7 != null) {
            if (var9 == null) {
              var10 = -1;
              for (var11 = 0; var7.length > var11; var11++) {
                var24 = this.extractPolygonPart(this.finaloutline, var11, var7, -600917695);
                var13 = SpecialOrderStatus.getPolygonOverlapScore(var24, -5115, param5.finaloutline);
                if (var10 < var13) {
                  var10 = var13;
                }
              }
              if (var10 == -1) {
                return;
              }
              param3.addLast(-10258, new ComponentCollision(this, param2, param5, param4, var10));
              return;
            }
            var10Lifetime3 = -1;
            for (var11Lifetime2 = 0; var7.length > var11Lifetime2; var11Lifetime2++) {
              var25 = this.extractPolygonPart(this.finaloutline, var11Lifetime2, var7, -600917695);
              for (var13Lifetime2 = 0; var13Lifetime2 < var9.length; var13Lifetime2++) {
                var26 = this.extractPolygonPart(param5.finaloutline, var13Lifetime2, var9, -600917695);
                var15 = SpecialOrderStatus.getPolygonOverlapScore(var25, -5115, var26);
                if (var15 > var10Lifetime3) {
                  var10Lifetime3 = var15;
                }
              }
            }
            if (var10Lifetime3 == -1) {
              return;
            }
            param3.addLast(-10258, new ComponentCollision(this, param2, param5, param4, var10Lifetime3));
            return;
          }
          if (var9 != null) {
            var10Lifetime1 = -1;
            for (var11Lifetime1 = 0; var11Lifetime1 < var9.length; var11Lifetime1++) {
              var27 = this.extractPolygonPart(param5.finaloutline, var11Lifetime1, var9, -600917695);
              var13Lifetime1 = SpecialOrderStatus.getPolygonOverlapScore(this.finaloutline, -5115, var27);
              if (var13Lifetime1 > var10Lifetime1) {
                var10Lifetime1 = var13Lifetime1;
              }
            }
            if (var10Lifetime1 == -1) {
              return;
            }
            param3.addLast(-10258, new ComponentCollision(this, param2, param5, param4, var10Lifetime1));
            return;
          }
          var10Lifetime2 = SpecialOrderStatus.getPolygonOverlapScore(this.finaloutline, -5115, param5.finaloutline);
          if (-1 != var10Lifetime2) {
            param3.addLast(-10258, new ComponentCollision(this, param2, param5, param4, var10Lifetime2));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_48_0 = var7_ref;
          stackIn_48_1 = new StringBuilder().append("ml.LC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    final boolean applyDamageToLeaves(int param0, int param1, World param2, ShipBody param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          if (this.componentTypeId == param1) {
            param3.chassis.applyScaledDamage(param0, (byte) 80);
            return false;
          }
          if (null != this.subcomponents &&
            this.subcomponents.length != 0) {
            for (var5_int = 0; this.subcomponents.length > var5_int; var5_int++) {
              var6 = this.subcomponents[var5_int].applyDamageToLeaves(param0, 47, param2, param3) ? 1 : 0;
              if (var6 != 0) {
                this.pruneDestroyedComponents(param2, 0, true, param3);
              }
            }
            return false;
          }
          this.health = this.health - param0;
          if (this.health > 0) {
            return false;
          }
          this.health = 0;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ml.PB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int getComponentTypeId(int param0) {
        if (param0 != 0) {
          return 64;
        }
        return this.componentTypeId;
    }

    final void drawComponent(World param0, byte param1, int param2, Camera2D param3, boolean param4) {
        boolean discarded$0 = false;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_128_2 = null;
        StringBuilder stackIn_130_1 = null;
        String stackIn_131_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        float var14_float = 0.0f;
        int var14 = 0;
        float var15_float = 0.0f;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[][] var17_ref_int____ = null;
        int var18 = 0;
        int var19 = 0;
        int[] var19_ref_int__ = null;
        float var20_float = 0.0f;
        int var20 = 0;
        int[] var20_ref_int__ = null;
        float var21_float = 0.0f;
        int var21 = 0;
        int[] var21_ref_int__ = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        ShipComponentDefinition var47 = null;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var27Lifetime1;
        int var24Lifetime2;
        int var25Lifetime2;
        int var16Lifetime1Lifetime1;
        int var16Lifetime1Lifetime2;
        int var16Lifetime1Lifetime3;
        int var17Lifetime1Lifetime1;
        int var17Lifetime1Lifetime2;
        int var17Lifetime1Lifetime3;
        int var18Lifetime1Lifetime1;
        int var18Lifetime1Lifetime2;
        int var18Lifetime1Lifetime3;
        int var19Lifetime1Lifetime1;
        int var19Lifetime1Lifetime2;
        int var19Lifetime1Lifetime3;
        int var22Lifetime1Lifetime1;
        int var22Lifetime1Lifetime2;
        int var23Lifetime1Lifetime1;
        int var24Lifetime1Lifetime1;
        var46 = VoidHunters.field_G;
        try {
          var47 = this.getDefinition((byte) -112);
          var7 = this.health * 256 / var47.maxHealth;
          var8 = (-var7 + 256) * ((31 & SetMinimapWidth.field_o ^ (SetMinimapWidth.field_o & 32) - ((32 & SetMinimapWidth.field_o) >>> 5)) + 32) / 64;
          var9 = -var8 + 256;
          var10 = var8;
          var11 = 16724787;
          if (this.isDestroyed((byte) 97) ||
            this.health == 1 &&
            !param4) {
            param2 = param2 / 2;
            var11 = 8926003;
          }
          var12 = ((var11 & 65280) * var10 & 16711680) + (-16711936 & var10 * (var11 & 16711935)) + ((-16711936 & var9 * (16711935 & param2)) + (var9 * (65280 & param2) & 16711680)) >>> 8;
          if (var47.field_B == 0) {
            var12 = 11184810;
          }
          if (param1 != 84) {
            discarded$0 = this.hasAdjustableConnection((byte) -119);
          }
          if (this.componentTypeId == 45) {
            SetMissileLauncherEnergyUsed.a(13412864, (byte) 7, param3.worldToScreenY(true, this.finaly), (float)(int)(param3.scale * 4096.0f), 128 + (TextureLineShape.sinAngle(100 * SetMinimapWidth.field_o, param1 ^ 122) >> 8) / 8, param3.worldToScreenX(this.finalx, (byte) 127));
          }
          if (GetPointDefenceLaserProjectiles.isDebugFlagSet(16, param1 + 11200)) {
            SetNumStars.drawCircle(param3.scale * (float)var47.boundingRadius, (byte) 113, param3.worldToScreenY(true, this.finaly), 16711680, param3.worldToScreenX(this.finalx, (byte) 126));
          }
          var13 = 1;
          if (1 == GetUseSprites.field_o) {
            var14_float = 128.0f;
            var15_float = 128.0f;
            var16 = 32;
            var17 = -1;
            var18 = -1;
            if (this.componentTypeId == 3) {
              var18 = 12;
              var17 = 11;
              var15_float = 134.0f;
              var16 = 32;
            } else {
              if (4 == this.componentTypeId) {
                var17 = 13;
                var15_float = 98.0f;
                var18 = 14;
                var16 = 36;
              } else {
                if (this.componentTypeId != 6) {
                  if (this.componentTypeId == 5) {
                    var17 = 17;
                    var15_float = 136.0f;
                    var16 = 32;
                    var18 = 18;
                  } else {
                    if (this.componentTypeId != 7) {
                      if (this.componentTypeId != 8) {
                        if (this.componentTypeId == 9) {
                          var16 = 64;
                          var15_float = 110.0f;
                          var18 = 24;
                          var17 = 23;
                        } else {
                          if (this.componentTypeId != 10) {
                            if (this.componentTypeId == 11) {
                              var15_float = 128.0f;
                              var16 = 56;
                              var17 = 27;
                              var18 = 28;
                            }
                          } else {
                            var18 = 26;
                            var15_float = 134.0f;
                            var16 = 29;
                            var17 = 25;
                          }
                        }
                      } else {
                        var18 = 22;
                        var17 = 21;
                        var16 = 28;
                        var15_float = 116.0f;
                      }
                    } else {
                      var17 = 19;
                      var18 = 20;
                      var15_float = 104.0f;
                      var16 = 27;
                    }
                  }
                } else {
                  var16 = 24;
                  var18 = 16;
                  var15_float = 118.0f;
                  var17 = 15;
                }
              }
            }
            if (var17 >= 0) {
              var19 = (int)((float)var16 * (16384.0f * param3.scale));
              var20_float = param3.worldToScreenXFloat(this.finalx, param1 ^ -41);
              var21_float = param3.worldToScreenYFloat(0, this.finaly);
              var22 = -(2048 + this.finalangle) << 3;
              var23 = var12 | -16777216;
              if (!OpenGlTexture1D.field_i) {
                if (null != LoadBlackboxRecording.field_o) {
                  var18 -= 11;
                  var17 -= 11;
                  if (var17 >= 0 &&
                    LoadBlackboxRecording.field_o[var17] != null) {
                    LoadBlackboxRecording.field_o[var17].drawRotatedScaledBilinear((int)var14_float << 4, (int)var15_float << 4, (int)var20_float << 4, (int)var21_float << 4, var22, var19);
                  }
                  if (0 <= var18 &&
                    null != LoadBlackboxRecording.field_o[var18]) {
                    LoadBlackboxRecording.field_o[var18].drawRotatedScaled((int)var14_float << 4, (int)var15_float << 4, (int)var20_float << 4, (int)var21_float << 4, var22, var19);
                  }
                }
              } else {
                if (OpenGlVertexNormal.field_d[var17] != null) {
                  OpenGlVertexNormal.field_d[var17].drawRotatedScaled(var20_float, var21_float, var14_float, var15_float, var19, var22, 0, var23, 1);
                }
                if (0 <= var18 &&
                  null != OpenGlVertexNormal.field_d[var18]) {
                  OpenGlVertexNormal.field_d[var18].drawRotatedScaled(var20_float, var21_float, var14_float, var15_float, var19, var22, 0, var23, 2);
                }
              }
              var13 = 0;
            }
          }
          if (GetPointDefenceLaserProjectiles.isDebugFlagSet(4, param1 ^ 11328)) {
            var13 = 1;
          }
          if (var13 != 0) {
            var14 = GetNumStars.cosAngle(this.finalangle, (byte) -108);
            var15 = TextureLineShape.sinAngle(this.finalangle, 69);
            if (0 != var47.connectionX ||
              0 != var47.connectionY) {
              var16Lifetime1 = -(var47.connectionY * var15) + var47.connectionX * var14 >> 16;
              var17Lifetime1 = var47.connectionX * var15 + var47.connectionY * var14 >> 16;
              var18Lifetime1 = var16Lifetime1 + this.finalx;
              var19Lifetime1 = this.finaly + var17Lifetime1;
              var20 = param3.worldToScreenX(var18Lifetime1, (byte) 115);
              var21 = param3.worldToScreenY(true, var19Lifetime1);
              GetPhasedEnergyBeamReload.fillCircle(var21, (float)(int)(512.0f * param3.scale), param1 ^ -35, var20, param2);
              var22Lifetime1 = this.currentconnectedangle - this.connectedangle;
              var23Lifetime1 = -var22Lifetime1 + this.finalangle;
              var24 = 8 * GetNumStars.cosAngle(var23Lifetime1, (byte) 104) >> 9;
              var25 = TextureLineShape.sinAngle(var23Lifetime1, 55) * 8 >> 9;
              DelayedPacket.drawLine(param3.worldToScreenY(true, var19Lifetime1 - var25), param3.worldToScreenX(var18Lifetime1 - var24, (byte) 126), var20, var21, param1 - 16777300, param2);
              var24Lifetime2 = 8 * var14 >> 9;
              var25Lifetime2 = var15 * 8 >> 9;
              DelayedPacket.drawLine(param3.worldToScreenY(true, var25Lifetime2 + var19Lifetime1), param3.worldToScreenX(var18Lifetime1 + var24Lifetime2, (byte) 127), var20, var21, -16777216, param2);
            }
            if (SetVariableActionFactory.field_c != 1) {
              for (var16Lifetime1Lifetime1 = 0; this.finaloutline.length > var16Lifetime1Lifetime1; var16Lifetime1Lifetime1 += 2) {
                var17Lifetime1Lifetime1 = this.finaloutline[var16Lifetime1Lifetime1];
                var18Lifetime1Lifetime1 = this.finaloutline[var16Lifetime1Lifetime1 + 1];
                var19Lifetime1Lifetime1 = this.finaloutline[(2 + var16Lifetime1Lifetime1) % this.finaloutline.length];
                var20Lifetime1 = this.finaloutline[(3 + var16Lifetime1Lifetime1) % this.finaloutline.length];
                DelayedPacket.drawLine(param3.worldToScreenY(true, var20Lifetime1), param3.worldToScreenX(var19Lifetime1Lifetime1, (byte) 124), param3.worldToScreenX(var17Lifetime1Lifetime1, (byte) 120), param3.worldToScreenY(true, var18Lifetime1Lifetime1), -16777216, var12);
              }
            } else {
              var16Lifetime1Lifetime1 = 1879048192;
              if (!var47.field_k) {
                var16Lifetime1Lifetime1 = 1342177280;
              }
              var17_ref_int____ = var47.field_w;
              if (0 != ResourceArchive.field_f) {
                if (var17_ref_int____ != null) {
                  stackIn_74_0 = (var47.field_m) ? 1 : 0;
                } else {
                  stackIn_74_0 = 1;
                }
              } else {
                stackIn_74_0 = 1;
              }
              var18Lifetime1Lifetime1 = stackIn_74_0;
              if (var18Lifetime1Lifetime1 != 0) {
                var19_ref_int__ = GetLaserBeamProjectileDamage.field_p;
                for (var20Lifetime1 = 0; var20Lifetime1 < this.finaloutline.length; var20Lifetime1 += 2) {
                  var19_ref_int__[var20Lifetime1] = param3.worldToScreenX(this.finaloutline[var20Lifetime1], (byte) 122);
                  var19_ref_int__[var20Lifetime1 + 1] = param3.worldToScreenY(true, this.finaloutline[var20Lifetime1 + 1]);
                }
                GetBombletSprayAimarc.fillPolygon(-112, 0, this.finaloutline.length, var12 | var16Lifetime1Lifetime1, var19_ref_int__);
                for (var20Lifetime1 = 0; var20Lifetime1 < this.finaloutline.length; var20Lifetime1 += 2) {
                  var21Lifetime1 = var19_ref_int__[var20Lifetime1];
                  var22Lifetime1Lifetime1 = var19_ref_int__[1 + var20Lifetime1];
                  var23Lifetime1Lifetime1 = var19_ref_int__[(2 + var20Lifetime1) % this.finaloutline.length];
                  var24Lifetime1 = var19_ref_int__[(var20Lifetime1 + 3) % this.finaloutline.length];
                  DelayedPacket.drawLine(var24Lifetime1, var23Lifetime1Lifetime1, var21Lifetime1, var22Lifetime1Lifetime1, -16777216, var12);
                }
              }
              if (ResourceArchive.field_f == 1 &&
                var17_ref_int____ != null) {
                for (var19Lifetime1Lifetime1 = 0; var19Lifetime1Lifetime1 < var17_ref_int____.length; var19Lifetime1Lifetime1++) {
                  var20_ref_int__ = GetLaserBeamProjectileDamage.field_p;
                  var21_ref_int__ = ToolkitRasterStateCache.field_b;
                  var22Lifetime1Lifetime1 = 0;
                  var23Lifetime1Lifetime1 = 0;
                  var24Lifetime1Lifetime1 = 0;
                  var25Lifetime1 = 0;
                  var26 = 1;
                  for (var27 = 0; var17_ref_int____[var19Lifetime1Lifetime1].length > var27; var27 += 2) {
                    var28 = var17_ref_int____[var19Lifetime1Lifetime1][var27] - this.getRecoilOffset(param4, var47, true) >> 4;
                    var29 = var17_ref_int____[var19Lifetime1Lifetime1][1 + var27] >> 4;
                    var30 = var14 * var28;
                    var31 = var15 * var29;
                    var32 = var15 * var28;
                    var33 = var29 * var14;
                    var34 = var30 - var31 >> 12;
                    var35 = var32 + var33 >> 12;
                    var36 = var34 + this.finalx;
                    var37 = var35 + this.finaly;
                    var38 = param3.worldToScreenX(var36, (byte) 119);
                    var39 = param3.worldToScreenY(true, var37);
                    var20_ref_int__[var27] = var38;
                    var20_ref_int__[1 + var27] = var39;
                    if (var47.field_k) {
                      var40 = var31 + var30 >> 12;
                      var41 = -var33 + var32 >> 12;
                      var42 = this.finalx + var40;
                      var43 = this.finaly + var41;
                      var44 = param3.worldToScreenX(var42, (byte) 120);
                      var45 = param3.worldToScreenY(true, var43);
                      if (var26 == 0) {
                        DelayedPacket.drawLine(var39, var38, var22Lifetime1Lifetime1, var23Lifetime1Lifetime1, -16777216, var12);
                        DelayedPacket.drawLine(var45, var44, var24Lifetime1Lifetime1, var25Lifetime1, -16777216, var12);
                      }
                      var24Lifetime1Lifetime1 = var44;
                      var25Lifetime1 = var45;
                      var21_ref_int__[var27] = var44;
                      var21_ref_int__[var27 + 1] = var45;
                    } else {
                      if (var26 == 0 &&
                        !var47.field_m) {
                        DelayedPacket.drawLine(var39, var38, var22Lifetime1Lifetime1, var23Lifetime1Lifetime1, -16777216, var12);
                      }
                    }
                    var26 = 0;
                    var23Lifetime1Lifetime1 = var39;
                    var22Lifetime1Lifetime1 = var38;
                  }
                  if (!var47.field_k &&
                    !var47.field_m) {
                    DelayedPacket.drawLine(var20_ref_int__[1], var20_ref_int__[0], var20_ref_int__[var17_ref_int____[var19Lifetime1Lifetime1].length - 2], var20_ref_int__[var17_ref_int____[var19Lifetime1Lifetime1].length - 1], -16777216, var12);
                  }
                  var27Lifetime1 = var16Lifetime1Lifetime1;
                  GetBombletSprayAimarc.fillPolygon(param1 - 198, 0, var17_ref_int____[var19Lifetime1Lifetime1].length, var12 | var27Lifetime1, var20_ref_int__);
                  if (var47.field_k) {
                    GetBombletSprayAimarc.fillPolygon(-111, 0, var17_ref_int____[var19Lifetime1Lifetime1].length, var16Lifetime1Lifetime1 | var12, var21_ref_int__);
                  }
                }
              }
            }
            if (this.isSpinningWeapon(-128)) {
              for (var16Lifetime1Lifetime2 = 0; this.finaloutline.length > var16Lifetime1Lifetime2; var16Lifetime1Lifetime2 += 2) {
                var17Lifetime1Lifetime2 = this.finaloutline[var16Lifetime1Lifetime2];
                var18Lifetime1Lifetime2 = this.finaloutline[var16Lifetime1Lifetime2 + 1];
                var19Lifetime1Lifetime2 = this.finalx;
                var20Lifetime2 = this.finaly;
                DelayedPacket.drawLine(param3.worldToScreenY(true, var20Lifetime2), param3.worldToScreenX(var19Lifetime1Lifetime2, (byte) 116), param3.worldToScreenX(var17Lifetime1Lifetime2, (byte) 115), param3.worldToScreenY(true, var18Lifetime1Lifetime2), -16777216, var12);
              }
            }
            if (this.hardpoints != null &&
              GetPointDefenceLaserProjectiles.isDebugFlagSet(4, 11284)) {
              for (var16Lifetime1Lifetime3 = 0; this.hardpoints.length > var16Lifetime1Lifetime3; var16Lifetime1Lifetime3++) {
                if (-1 == this.hardpoints[var16Lifetime1Lifetime3].connectedComponentIdx) {
                  var17Lifetime1Lifetime3 = this.hardpoints[var16Lifetime1Lifetime3].worldx;
                  var18Lifetime1Lifetime3 = this.hardpoints[var16Lifetime1Lifetime3].worldy;
                  var19Lifetime1Lifetime3 = param3.worldToScreenX(var17Lifetime1Lifetime3, (byte) 125);
                  var20Lifetime3 = param3.worldToScreenY(true, var18Lifetime1Lifetime3);
                  if (GetPointDefenceLaserProjectiles.isDebugFlagSet(4, 11284)) {
                    var21Lifetime2 = GetNumStars.cosAngle(this.finalangle + var47.hardpoints[var16Lifetime1Lifetime3].field_a, (byte) -93) * 8 >> 8;
                    var22Lifetime1Lifetime2 = TextureLineShape.sinAngle(var47.hardpoints[var16Lifetime1Lifetime3].field_a + this.finalangle, 99) * 8 >> 8;
                    DelayedPacket.drawLine(param3.worldToScreenY(true, var22Lifetime1Lifetime2 + var18Lifetime1Lifetime3), param3.worldToScreenX(var17Lifetime1Lifetime3 + var21Lifetime2, (byte) 119), var19Lifetime1Lifetime3, var20Lifetime3, -16777216, 16711680);
                    GetLagStandardDeviationOut.drawTextWithDefaultFont(-1, Integer.toString(var16Lifetime1Lifetime3), 16711935, var20Lifetime3, var19Lifetime1Lifetime3, param1 ^ 4350);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_127_0 = var6;
          stackIn_127_1 = new StringBuilder().append("ml.T(");
          if (param0 == null) {
            stackIn_128_2 = "null";
          } else {
            stackIn_128_2 = "{...}";
          }
          stackIn_130_1 = ((StringBuilder) (Object) stackIn_127_1).append(stackIn_128_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_131_2 = "null";
          } else {
            stackIn_131_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_127_0), ((StringBuilder) (Object) stackIn_130_1).append(stackIn_131_2).append(',').append(param4).append(')').toString());
        }
    }

    final int adjustHealth(boolean param0, boolean param1, int param2) {
        int var7 = 0;
        int stackIn_3_0 = 0;
        int var4;
        ShipComponentDefinition var5;
        int var6;
        int var8;
        int var9;
        int var6Lifetime1;
        var9 = VoidHunters.field_G;
        stackIn_3_0 = (this.isDestroyed((byte) 110)) ? 0 : 1;
        var4 = stackIn_3_0;
        this.health = this.health + param2;
        var5 = this.getDefinition((byte) -112);
        if (this.health <= var5.maxHealth) {
          if (this.isDestroyed((byte) 52) &&
            var4 != 0 &&
            !param0 &&
            this.subcomponents != null &&
            this.subcomponents.length > 0) {
            for (var6 = 0; this.subcomponents.length > var6; var6++) {
              this.subcomponents[var6].repair(-this.subcomponents[var6].health, 3);
            }
          }
          if (!param1) {
            return 0;
          }
          this.connectionpointx = -14;
          return 0;
        }
        var6Lifetime1 = -var5.maxHealth + this.health;
        if (!param0 &&
          null != this.subcomponents && this.subcomponents.length > 0) {
          for (var7 = 0; this.subcomponents.length > var7; var7++) {
            var8 = this.subcomponents[var7].repair(var6Lifetime1, 3);
            var6Lifetime1 = var8;
            if (0 == var6Lifetime1) {
              break;
            }
          }
        }
        this.health = var5.maxHealth;
        return var6Lifetime1;
    }

    final boolean isDestroyed(byte param0) {
        if (param0 < 40) {
          this.getSubcomponent(-95, -20);
        }
        return this.health <= 0 ? true : false;
    }

    private final void writePackedAttributes(IsaacPacketBuffer param0, byte param1) {
        int var3_int = 0;
        IsaacPacketBuffer stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.hasAdjustableConnection((byte) -94)) {
            param0.writeBits(-632, this.currentconnectedangle, 14);
          }
          var3_int = -63 / ((9 - param1) / 47);
          stackIn_4_0 = (IsaacPacketBuffer) (param0);
          stackIn_4_1 = -115;
          stackIn_5_2 = (this.health != this.getDefinition((byte) -112).maxHealth);
          if (DateOfBirthInput.writeBoolean(stackIn_4_0, stackIn_4_1, stackIn_5_2)) {
            param0.writeBits(-632, this.health, BodyInZoneCondition.a(-88, this.getDefinition((byte) -112).maxHealth));
          }
          if (this.hasWeaponOrThruster((byte) -98)) {
            param0.writeBits(-632, this.triggermap, 9);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ml.M(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void updateWeaponTransforms(int param0, int param1, int param2, int param3, boolean param4, boolean param5, boolean param6, int param7, int[] param8) {
        int var12 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var13 = 0;
        int var10_intLifetime1;
        int var11Lifetime1;
        var13 = VoidHunters.field_G;
        try {
          if (!param4) {
            this.connectedangle = 110;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.weaponbehaviour != null && (this.weaponbehaviour.getDefinition((byte) 24).hasRecoil((byte) 55) ||
            !(this.weaponbehaviour.getDefinition((byte) 24).getMaxSpinSpeed((byte) 29) <= 0))) {
            this.transformGeometry(param5, param3, 0, param1, param2, param6, param0, param7, param8);
            decompiledFrameRemainder0 = false;
          }
          else {
            var10_int = GetNumStars.cosAngle(this.finalangle, (byte) -103);
            var11 = TextureLineShape.sinAngle(this.finalangle, 57);
            GetShipAimLines.field_o = var10_int;
            GetCountermeasureLauncherRandomness.field_p = var11;
          }
          if (null != this.subcomponents &&
            this.subcomponents.length > 0) {
            var10_intLifetime1 = GetShipAimLines.field_o;
            var11Lifetime1 = GetCountermeasureLauncherRandomness.field_p;
            for (var12 = 0; this.subcomponents.length > var12; var12++) {
              this.subcomponents[var12].updateWeaponTransforms(var11Lifetime1, this.finalangle, var10_intLifetime1, this.finaly, true, param5, param6, this.finalx, param8);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_17_0 = var10;
          stackIn_17_1 = new StringBuilder().append("ml.QC(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        int stackIn_31_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_1 = 0;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ShipComponent var5 = null;
        try {
          var5 = (ShipComponent) (other);
          if (obfuscationGuard >= -19) {
            return;
          }
          if (this.weaponbehaviour != null &&
            var5.weaponbehaviour != null) {
            this.weaponbehaviour.reportDifferences(var5.weaponbehaviour, -53);
          }
          if (this.thrusterbehaviour != null &&
            null != var5.thrusterbehaviour) {
            this.thrusterbehaviour.reportDifferences(var5.thrusterbehaviour, -28);
          }
          if (this.grapplebehaviour != null &&
            var5.grapplebehaviour != null) {
            this.grapplebehaviour.reportDifferences(var5.grapplebehaviour, -37);
          }
          if (null != this.behaviour &&
            var5.behaviour != null &&
            this.behaviour.getClass() == var5.behaviour.getClass()) {
            this.behaviour.reportDifferences(var5.behaviour, -36);
          }
          CarouselSlot.reportStateArrayDifferences(var5.subcomponents, 1, this.subcomponents, false, 5547);
          CarouselSlot.reportStateArrayDifferences(var5.hardpoints, 1, this.hardpoints, false, 5547);
          var4 = 0;
          if (this.componentTypeId != var5.componentTypeId) {
            System.out.println("int component_type_id has changed. before=" + var5.componentTypeId + ", now=" + this.componentTypeId);
            var4 = 1;
          }
          if (this.triggermap != var5.triggermap) {
            System.out.println("int triggermap has changed. before=" + var5.triggermap + ", now=" + this.triggermap);
            var4 = 1;
          }
          if (var5.connectionpointx != this.connectionpointx) {
            var4 = 1;
            System.out.println("int connectionpointx has changed. before=" + var5.connectionpointx + ", now=" + this.connectionpointx);
          }
          if (this.connectionpointy != var5.connectionpointy) {
            var4 = 1;
            System.out.println("int connectionpointy has changed. before=" + var5.connectionpointy + ", now=" + this.connectionpointy);
          }
          stackIn_31_0 = (null != this.weaponbehaviour) ? 0 : 1;
          if (var5.weaponbehaviour != null) {
            stackIn_34_1 = 0;
          } else {
            stackIn_34_1 = 1;
          }
          if ((stackIn_31_0 ^ stackIn_34_1) != 0 ||
            this.weaponbehaviour != null &&
            this.weaponbehaviour.differsFrom((byte) 114, var5.weaponbehaviour)) {
            System.out.println("WeaponBehaviour weaponbehaviour has changed. before=" + var5.weaponbehaviour + ", now=" + this.weaponbehaviour);
            var4 = 1;
          }
          stackIn_42_0 = (this.thrusterbehaviour != null) ? 0 : 1;
          if (null != var5.thrusterbehaviour) {
            stackIn_45_1 = 0;
          } else {
            stackIn_45_1 = 1;
          }
          if ((stackIn_42_0 ^ stackIn_45_1) != 0 ||
            this.thrusterbehaviour != null &&
            this.thrusterbehaviour.differsFrom((byte) 109, var5.thrusterbehaviour)) {
            System.out.println("ThrusterBehaviour thrusterbehaviour has changed. before=" + var5.thrusterbehaviour + ", now=" + this.thrusterbehaviour);
            var4 = 1;
          }
          stackIn_53_0 = (null != this.grapplebehaviour) ? 0 : 1;
          if (var5.grapplebehaviour != null) {
            stackIn_56_1 = 0;
          } else {
            stackIn_56_1 = 1;
          }
          if ((stackIn_53_0 ^ stackIn_56_1) != 0 ||
            this.grapplebehaviour != null &&
            this.grapplebehaviour.differsFrom((byte) 110, var5.grapplebehaviour)) {
            var4 = 1;
            System.out.println("GrappleLauncherBehaviour grapplebehaviour has changed. before=" + var5.grapplebehaviour + ", now=" + this.grapplebehaviour);
          }
          stackIn_64_0 = (null != this.behaviour) ? 0 : 1;
          if (null != var5.behaviour) {
            stackIn_67_1 = 0;
          } else {
            stackIn_67_1 = 1;
          }
          if ((stackIn_64_0 ^ stackIn_67_1) != 0 ||
            null != this.behaviour &&
            this.behaviour.getClass() != var5.behaviour.getClass() ||
            this.behaviour != null &&
            this.behaviour.differsFrom((byte) -125, var5.behaviour)) {
            System.out.println("ComponentBehaviour behaviour has changed. before=" + var5.behaviour + ", now=" + this.behaviour);
            var4 = 1;
          }
          if (SetCountermeasureLauncherAimspeed.a(var5.subcomponents, false, 1, this.subcomponents, -9)) {
            System.out.println("Component[] subcomponents has changed. ");
            var4 = 1;
          }
          if (SetCountermeasureLauncherAimspeed.a(var5.hardpoints, false, 1, this.hardpoints, 118)) {
            System.out.println("Hardpoint[] hardpoints has changed. ");
            var4 = 1;
          }
          if (var5.connectedangle != this.connectedangle) {
            var4 = 1;
            System.out.println("int connectedangle has changed. before=" + var5.connectedangle + ", now=" + this.connectedangle);
          }
          if (this.currentconnectedangle != var5.currentconnectedangle) {
            var4 = 1;
            System.out.println("int currentconnectedangle has changed. before=" + var5.currentconnectedangle + ", now=" + this.currentconnectedangle);
          }
          if (this.health != var5.health) {
            System.out.println("int health has changed. before=" + var5.health + ", now=" + this.health);
            var4 = 1;
          }
          if (var5.finalx != this.finalx) {
            System.out.println("int finalx has changed. before=" + var5.finalx + ", now=" + this.finalx);
            var4 = 1;
          }
          if (this.finaly != var5.finaly) {
            var4 = 1;
            System.out.println("int finaly has changed. before=" + var5.finaly + ", now=" + this.finaly);
          }
          if (var5.finalangle != this.finalangle) {
            System.out.println("int finalangle has changed. before=" + var5.finalangle + ", now=" + this.finalangle);
            var4 = 1;
          }
          if (GetCountermeasuresCooldown.a(this.finaloutline, var5.finaloutline, false)) {
            System.out.println("int[] finaloutline has changed. ");
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of Component has changed, where component_type_id=" + this.componentTypeId);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_104_0 = var3;
          stackIn_104_1 = new StringBuilder().append("ml.F(");
          if (other == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void updateWorldTransforms(int param0, boolean param1, int param2, boolean param3, byte param4, int param5, int[] param6) {
        int var8_int = 0;
        int var9 = 0;
        try {
          var8_int = GetNumStars.cosAngle(param0, (byte) -96);
          if (param4 < 84) {
            this.collectSpecialOrderStatuses((IntrusiveDeque) null, (Ship) null, 87);
          }
          var9 = TextureLineShape.sinAngle(param0, 84);
          this.updateWorldTransforms(param2, var9, param3, param0, param6, param1, 256, var8_int, param5);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ml.AB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final int countComponents(int param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        int var2 = param0;
        if (this.subcomponents != null) {
          for (var3 = 0; this.subcomponents.length > var3; var3++) {
            var2 = var2 + this.subcomponents[var3].countComponents(1);
          }
        }
        return var2;
    }

    final void resetWeaponReloads(int param0, int param1) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (this.componentTypeId == param1 &&
          null != this.weaponbehaviour) {
          this.weaponbehaviour.reload = 0;
        }
        if (param0 <= 63) {
          this.ejectChildDebris((Random) null, (World) null, 35, (byte) -68, 76, (ShipBody) null);
        }
        if (null != this.subcomponents) {
          for (var3 = 0; var3 < this.subcomponents.length; var3++) {
            this.subcomponents[var3].resetWeaponReloads(93, param1);
          }
        }
    }

    final int[] collectDamagedComponentPaths(int param0, int param1, int param2, byte param3, int param4, int param5, int[] param6) {
        boolean discarded$1 = false;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          if (param3 > -1) {
            discarded$1 = this.isAllowedAttachmentOverlap((ShipComponent) null, 51, (ShipComponent) null, (ShipComponent) null);
          }
          if (this.subcomponents != null) {
            for (var8_int = 0; this.subcomponents.length > var8_int; var8_int++) {
              param6 = this.subcomponents[var8_int].collectDamagedComponentPaths(param0, param1, param2 | 1 + var8_int << 4 * param5, (byte) -45, param4, 1 + param5, param6);
            }
          }
          if (ArchiveLoadRequest.intersectsCircle((byte) -57, this.finaloutline, param4, param1, param0) &&
            this.health < this.getDefinition((byte) -112).maxHealth) {
            param6 = SetMinimapWidth.appendInt(param6, param2, (byte) -106);
          }
          stackIn_12_0 = (int[]) (param6);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("ml.FB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final int getBoundingRadius(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        int var5 = TextLayout.approximateVectorLength(param3 - this.finalx, (byte) 124, param1 - this.finaly) + this.getDefinition((byte) -112).boundingRadius;
        if (param2 > -61) {
          this.writePackedAttributes((IsaacPacketBuffer) null, (byte) -13);
        }
        if (var5 > param0) {
          param0 = var5;
        }
        if (this.subcomponents != null) {
          for (var6 = 0; var6 < this.subcomponents.length; var6++) {
            param0 = this.subcomponents[var6].getBoundingRadius(param0, param1, -114, param3);
          }
        }
        return param0;
    }

    final void activateSpecialOrder(int param0, int param1, World param2, byte param3, int param4, ShipBody param5) {
        int var7_int = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        var8 = VoidHunters.field_G;
        try {
          if (this.getDefinition((byte) -112).getSpecialOrderId(-1) == param0 &&
            !this.isDestroyed((byte) 67)) {
            this.activate(param5, param1, param2, param4, 50, 256);
          }
          if (param3 >= -47) {
            this.connectionpointx = -103;
          }
          if (this.subcomponents != null) {
            for (var7_int = 0; this.subcomponents.length > var7_int; var7_int++) {
              this.subcomponents[var7_int].activateSpecialOrder(param0, param1, param2, (byte) -102, param4, param5);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_14_0 = var7;
          stackIn_14_1 = new StringBuilder().append("ml.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final void pruneDestroyedComponents(World param0, int param1, boolean param2, ShipBody param3) {
        int var5_int = 0;
        ShipComponent var6 = null;
        int var7 = 0;
        int var9 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var8 = 0;
        var9 = VoidHunters.field_G;
        try {
          if (this.subcomponents != null) {
            var5_int = 0;
            while (var5_int < this.subcomponents.length) {
              var6 = this.subcomponents[var5_int];
              var7 = var6.pruneDestroyedComponents(param1 + 0, param0, param3) ? 1 : 0;
              if (var7 != 0) {
                if (param2) {
                  var8 = var6.getDefinition((byte) -112).field_y;
                  if (var8 > 0) {
                    param0.spawnComponentRadialProjectiles((byte) -44, param3, var6, var6.getDefinition((byte) -112));
                  }
                }
                var6.detachFromBody(param0, -19625, param3);
                this.removeSubcomponent(115, var5_int);
                var5_int = -1 + var5_int;
                param3.recalculateMassProperties((byte) 119);
                var6.explode(true, param0, param3, (byte) -113);
              }
              var5_int++;
            }
          }
          if (param1 != 0) {
            this.hardpoints = (Hardpoint[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ml.I(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final int getRecoilOffset(boolean param0, ShipComponentDefinition param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 0;
          if (param0 &&
            this.weaponbehaviour != null &&
            this.weaponbehaviour.reload > 0) {
            var5 = this.weaponbehaviour.getRecoilFraction(89);
            if (var5 > 0) {
              var4_int = param1.boundingRadius * var5 >> 8;
            }
          }
          if (param2) {
            stackIn_11_0 = var4_int;
            return stackIn_11_0;
          }
          stackIn_9_0 = -58;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("ml.ID(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final int getFinaly(byte param0) {
        if (param0 <= 43) {
          this.collectSpecialOrderStatuses((IntrusiveDeque) null, (Ship) null, 87);
        }
        return this.finaly;
    }

    final void makeThrusterTrailsMutable(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (null != this.thrusterbehaviour) {
          this.thrusterbehaviour.makeTrailMutable(true);
        }
        if (null != this.subcomponents) {
          for (var2 = 0; var2 < this.subcomponents.length; var2++) {
            this.subcomponents[var2].makeThrusterTrailsMutable(0);
          }
        }
        if (param0 != 0) {
          this.activateSpecialOrder(59, -127, (World) null, (byte) 46, 109, (ShipBody) null);
        }
    }

    private final void readPackedAttributes(int param0, IsaacPacketBuffer param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.hasAdjustableConnection((byte) -94)) {
            this.currentconnectedangle = ShieldInfo.readSignedBits(14, param1, (byte) 20);
          }
          if (!LegacyOpenGlSpecularEffect.readBoolean(false, param1)) {
            this.health = this.getDefinition((byte) -112).maxHealth;
          } else {
            this.health = param1.readBits(0, BodyInZoneCondition.a(-111, this.getDefinition((byte) -112).maxHealth));
          }
          if (this.hasWeaponOrThruster((byte) -15)) {
            this.triggermap = param1.readBits(0, 9);
          }
          this.initializeGeometry(true);
          if (param0 != 0) {
            this.weaponbehaviour = (WeaponBehaviour) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ml.RA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void collectSpecialOrderStatuses(IntrusiveDeque param0, Ship param1, int param2) {
        int var6 = 0;
        int var4_int = 0;
        int var5 = VoidHunters.field_G;
        int var4_intLifetime1;
        try {
          if (~this.getDefinition((byte) -112).getSpecialOrderId(-1) != param2) {
            var4_int = this.getSpecialOrderState(param1, param2 ^ 10298);
            if (this.isDestroyed((byte) 84) &&
              var4_int == 0) {
              var4_int++;
            }
            param0.addLast(-10258, new SpecialOrderStatus(this.getDefinition((byte) -112).getSpecialOrderId(-1), var4_int));
          }
          if (this.subcomponents != null) {
            var6 = 0;
            var4_intLifetime1 = var6;
            while (this.subcomponents.length > var6) {
              this.subcomponents[var6].collectSpecialOrderStatuses(param0, param1, 0);
              var6++;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ml.VC(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int applyScaledDamage(int param0, byte param1) {
        int var5 = 0;
        int var4 = -97 / ((-34 - param1) / 62);
        int var3 = this.getDefinition((byte) -112).field_B;
        if (var3 == 0) {
          return 0;
        }
        this.health = this.health - (var3 * param0 >> 8);
        if (this.health < 0) {
          var5 = -this.health;
          this.health = 0;
          return (var5 << 8) / var3;
        }
        return 0;
    }

    private final void collectEdgeContacts(int param0, IntrusiveDeque param1, ShipComponent param2, int param3, int param4, int param5) {
        int var12 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var7_intLifetime1;
        var20 = VoidHunters.field_G;
        try {
          if (null != this.subcomponents) {
            for (var7_int = 0; var7_int < this.subcomponents.length; var7_int++) {
              this.subcomponents[var7_int].collectEdgeContacts(param0 + 1, param1, param2, param3 | 1 + var7_int << param0 * 4, 0, param5);
            }
          }
          if (TextLayout.approximateVectorLength(this.finalx - param2.finalx, (byte) 119, this.finaly - param2.finaly) > this.getDefinition((byte) -112).boundingRadius + param2.getDefinition((byte) -112).boundingRadius) {
            return;
          }
          for (var7_intLifetime1 = param4; var7_intLifetime1 < this.finaloutline.length; var7_intLifetime1 += 2) {
            var8 = this.finaloutline[var7_intLifetime1];
            var9 = this.finaloutline[var7_intLifetime1 + 1];
            var10 = this.finaloutline[(var7_intLifetime1 + 2) % this.finaloutline.length];
            var11 = this.finaloutline[(var7_intLifetime1 + 3) % this.finaloutline.length];
            for (var12 = 0; var12 < param2.finaloutline.length; var12 += 2) {
              var13 = param2.finaloutline[var12];
              var14 = param2.finaloutline[1 + var12];
              var15 = param2.finaloutline[(var12 + 2) % param2.finaloutline.length];
              var16 = param2.finaloutline[(3 + var12) % param2.finaloutline.length];
              var17 = SpecialOrderSubmessageFactory.segmentIntersectionFraction(8, var9, (byte) 88, var8, var15, var10, var14, var13, var16, var11);
              if (var17 != -1 &&
                var17 > 10 &&
                var17 < 245) {
                var18 = var8 + (var17 * (var10 - var8) >> 8);
                var19 = var9 + ((var11 - var9) * var17 >> 8);
                param1.addLast(-10258, new ComponentContact(this, param3, param2, param5, var18, var19, var7_intLifetime1 >> 1, var12 >> 1));
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("ml.JD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void configureThrusterBindings(byte param0, ShipBody param1) {
        ThrusterBehaviour stackIn_24_0 = null;
        boolean stackIn_25_1 = false;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
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
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        var21 = VoidHunters.field_G;
        try {
          if (this.thrusterbehaviour != null &&
            !this.thrusterbehaviour.isBooster(this.componentTypeId, (byte) -61)) {
            this.triggermap = 0;
            if (param1 instanceof Ship) {
              var3_int = param1.forceX;
              var4 = param1.forceY;
              var5 = param1.torque;
              var6 = this.thrusterbehaviour.getThrust(this.componentTypeId, false);
              param1.addDirectionalForce(this.finaly, this.finalangle, this.finalx, var6, 1948934248);
              var7 = -var3_int + param1.forceX >> 8;
              var8 = param1.forceY - var4 >> 8;
              var9 = param1.torque - var5;
              var10 = GetNumStars.cosAngle(param1.getAngle(0), (byte) -119) >> 8;
              var11 = TextureLineShape.sinAngle(param1.getAngle(0), 114) >> 8;
              var12 = GameKeyHandler.normalizeSignedAngle(22433, -2048 + param1.getAngle(0));
              var13 = GetNumStars.cosAngle(var12, (byte) -78) >> 8;
              var14 = TextureLineShape.sinAngle(var12, 96) >> 8;
              var15 = var10 * var7 + var8 * var11;
              var16 = var8 * var14 + var13 * var7;
              var17 = Math.max(var8 * var8 + var7 * var7, 1);
              var18 = 256 * var15 / var17;
              if (var9 > 0) {
                this.triggermap = this.triggermap | 8;
              } else {
                if (var9 < 0) {
                  this.triggermap = this.triggermap | 4;
                }
              }
              var19 = 256 * var16 / var17;
              var20 = 128;
              if (var15 > 0 &&
                var20 < var18) {
                this.triggermap = this.triggermap | 1;
              } else {
                if (var15 < 0 &&
                  -var20 > var18) {
                  this.triggermap = this.triggermap | 2;
                }
              }
              param1.forceX = var3_int;
              param1.torque = var5;
              param1.forceY = var4;
              if (var16 > 0 &&
                var19 > var20) {
                this.triggermap = this.triggermap | 32;
              } else {
                if (var16 < 0 &&
                  -var20 > var19) {
                  this.triggermap = this.triggermap | 64;
                }
              }
            }
            stackIn_24_0 = this.thrusterbehaviour;
            stackIn_25_1 = ((99 & this.triggermap) != 0);
            ((ThrusterBehaviour) (Object) stackIn_24_0).setTrailEnabled(stackIn_25_1, 1024);
          } else {
            if (null != this.thrusterbehaviour) {
              this.thrusterbehaviour.setTrailEnabled(param1 instanceof Ship, 1024);
              this.thrusterbehaviour.limitDetachedBoosterCooldown(this.componentTypeId, param1, -24213);
            }
          }
          if (null != this.subcomponents) {
            for (var3_intLifetime1 = 0; this.subcomponents.length > var3_intLifetime1; var3_intLifetime1++) {
              this.subcomponents[var3_intLifetime1].configureThrusterBindings((byte) 115, param1);
            }
          }
          var3_intLifetime2 = 7 % ((param0 + 76) / 43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("ml.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final void detachComponent(boolean param0, ShipComponent param1, World param2, int param3, ShipBody param4) {
        int var6_int = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        Debris var8 = null;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          if (null != this.subcomponents) {
            for (var6_int = 0; var6_int < this.subcomponents.length; var6_int++) {
              if (param1 == this.subcomponents[var6_int]) {
                var7 = param1.finalangle;
                if (null != param1.thrusterbehaviour) {
                  var7 = GameKeyHandler.normalizeSignedAngle(22433, var7 + 4096);
                }
                param1.detachFromBody(param2, -19625, param4);
                var8 = new Debris(param1, param0);
                var8.dx = param4.dx;
                var8.dy = param4.dy;
                param2.addDebris(var8, (byte) 37);
                if (!param0 &&
                  SetTorpedoAimspeed.field_o > 0) {
                  var8.addDirectionalForce(var8.y, var7, var8.x, var8.getMass(false) * SetTorpedoAimspeed.field_o >> 8, 1948934248);
                }
                this.removeSubcomponent(126, var6_int);
                param4.recalculateMassProperties((byte) 119);
              } else {
                this.subcomponents[var6_int].detachComponent(param0, param1, param2, 90, param4);
              }
            }
          }
          if (param3 < 23) {
            this.weaponbehaviour = (WeaponBehaviour) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_20_0 = var6;
          stackIn_20_1 = new StringBuilder().append("ml.DC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final boolean containsDescendant(int param0, ShipComponent param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          if (param0 != 16) {
            this.finalangle = -93;
          }
          if (this.subcomponents != null) {
            for (var3_int = 0; this.subcomponents.length > var3_int; var3_int++) {
              if (this.subcomponents[var3_int] == param1) {
                return true;
              }
              if (this.subcomponents[var3_int].containsDescendant(param0 + 0, param1)) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("ml.SB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final void updateWorldTransforms(int param0, int param1, boolean param2, int param3, int[] param4, boolean param5, int param6, int param7, int param8) {
        int var12 = 0;
        int var10_int = 0;
        int var11 = 0;
        int var13 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        var13 = VoidHunters.field_G;
        try {
          if (param6 != 256) {
            this.detachAllChildren((World) null, (byte) -46, (ShipBody) null);
          }
          this.transformGeometry(param5, param0, 0, param3, param7, param2, param1, param8, param4);
          if (this.subcomponents != null) {
            if (this.subcomponents.length <= 0) {
              return;
            }
            var10_int = GetShipAimLines.field_o;
            var11 = GetCountermeasureLauncherRandomness.field_p;
            for (var12 = 0; this.subcomponents.length > var12; var12++) {
              this.subcomponents[var12].updateWorldTransforms(this.finaly, var11, param2, this.finalangle, param4, param5, 256, var10_int, this.finalx);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("ml.UC(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final boolean isAllowedAttachmentOverlap(ShipComponent param0, int param1, ShipComponent param2, ShipComponent param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -23) {
            this.connectionpointx = 125;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param3.componentTypeId == 22 && (param2.getDefinition((byte) -112).field_a == 2 ||
            param0 == param2)) {
            stackIn_8_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_8_0 = false;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("ml.GB(");
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
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final ShipComponent[] collectDescendants(ShipComponent[] param0, byte param1) {
        int var4 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        ShipComponent[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          var3_int = -63 % ((param1 + 44) / 42);
          if (this.subcomponents != null) {
            for (var4 = 0; this.subcomponents.length > var4; var4++) {
              param0 = (ShipComponent[]) (SoftwareSprite2D.appendStateArrayValue(this.subcomponents[var4], param0, 0, ArchiveTextureProvider.field_d));
              param0 = this.subcomponents[var4].collectDescendants(param0, (byte) -127);
            }
          }
          stackIn_7_0 = (ShipComponent[]) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ml.P(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          this.componentTypeId = param0.readBits(0, 6);
          if (!LegacyOpenGlSpecularEffect.readBoolean(false, param0)) {
            this.weaponbehaviour = null;
          } else {
            if (null == this.weaponbehaviour) {
              this.weaponbehaviour = new WeaponBehaviour();
            }
            this.weaponbehaviour.readState(param0, false);
          }
          if (LegacyOpenGlSpecularEffect.readBoolean(false, param0)) {
            if (null == this.thrusterbehaviour) {
              this.thrusterbehaviour = new ThrusterBehaviour();
            }
            this.thrusterbehaviour.readState(param0, param1);
          } else {
            this.thrusterbehaviour = null;
          }
          if (LegacyOpenGlSpecularEffect.readBoolean(param1, param0)) {
            if (this.grapplebehaviour == null) {
              this.grapplebehaviour = new GrappleLauncherBehaviour();
            }
            this.grapplebehaviour.readState(param0, param1);
          } else {
            this.grapplebehaviour = null;
          }
          if (!LegacyOpenGlSpecularEffect.readBoolean(false, param0)) {
            this.behaviour = null;
          } else {
            if (null == this.behaviour) {
              var3_int = param0.readBits(0, 1);
              if (0 == var3_int) {
                this.behaviour = (ComponentBehaviour) ((Object) new ShieldBehaviour());
              } else {
                if (var3_int == 1) {
                  this.behaviour = (ComponentBehaviour) ((Object) new ArmBehaviour());
                }
              }
              this.behaviour.readState(param0, false);
            } else {
              this.behaviour.readState(param0, false);
            }
          }
          this.subcomponents = (ShipComponent[]) (SetAutoDetail.readStateArrayByMode(5, ArchiveTextureProvider.field_d, param0, 1, -85, this.subcomponents));
          this.hardpoints = (Hardpoint[]) (SetAutoDetail.readStateArrayByMode(5, HardpointGeometry.hardpointFactory, param0, 1, -63, this.hardpoints));
          this.readPackedAttributes(0, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("ml.H(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean hasWeaponOrThruster(byte param0) {
        int var2;
        boolean stackIn_5_0 = false;
        var2 = 22 % ((param0 + 61) / 32);
        stackIn_5_0 = (null != this.weaponbehaviour) || (null != this.thrusterbehaviour);
        return stackIn_5_0;
    }

    final ShipComponent[] markRandomComponentsDestroyed(int param0, Random param1, ShipComponent[] param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ShipComponent[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = VoidHunters.field_G;
        try {
          if (param0 != 0) {
            this.thrusterbehaviour = (ThrusterBehaviour) null;
          }
          if (null != this.subcomponents) {
            for (var4_int = 0; var4_int < this.subcomponents.length; var4_int++) {
              var5 = TextHotspotRegion.randomBoundedInt(param1, 100, 122);
              if (GetBombletSprayReload.field_s > var5 &&
                this.subcomponents[var4_int].componentTypeId != 47) {
                this.subcomponents[var4_int].health = 0;
                param2 = (ShipComponent[]) (SoftwareSprite2D.appendStateArrayValue(this.subcomponents[var4_int], param2, 0, ArchiveTextureProvider.field_d));
              } else {
                if (0 >= this.subcomponents[var4_int].health) {
                  this.subcomponents[var4_int].health = 1;
                }
              }
              param2 = this.subcomponents[var4_int].markRandomComponentsDestroyed(0, param1, param2);
            }
          }
          stackIn_14_0 = (ShipComponent[]) (param2);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ml.BB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final int rotateAim(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var3Lifetime1;
        var6 = VoidHunters.field_G;
        if (param1 != 0 &&
          this.getAimArc(112) > 0 &&
          this.health > 0) {
          var3 = 0;
          if (param1 > 0) {
            var3Lifetime1 = Math.abs(GameKeyHandler.normalizeSignedAngle(22433, this.connectedangle - (-this.getAimArc(124) + this.currentconnectedangle)));
          } else {
            var3Lifetime1 = Math.abs(GameKeyHandler.normalizeSignedAngle(22433, this.connectedangle - (this.getAimArc(-116) + this.currentconnectedangle)));
          }
          var4 = this.getAimSpeed((byte) 103);
          if (SetShipTeamAction.field_e == 1) {
            if (this.weaponbehaviour != null &&
              this.weaponbehaviour.needsAttachmentAim(true)) {
              var4 = 2048;
              this.weaponbehaviour.setAttachmentAimPending(false, true);
            } else {
              return param1;
            }
          }
          var5 = Math.min(Math.min(var4, Math.abs(param1)), var3Lifetime1);
          if (param1 < 0) {
            var5 = -var5;
          }
          this.currentconnectedangle = GameKeyHandler.normalizeSignedAngle(22433, var5 + this.currentconnectedangle);
          param1 = param1 - var5;
        }
        if (param0 <= -68) {
          return param1;
        }
        return -4;
    }

    private final int getAimSpeed(byte param0) {
        if (param0 != 103) {
          this.getFinalx(false);
        }
        if (this.behaviour != null) {
          return this.behaviour.getAimSpeed((byte) 118);
        }
        if (this.weaponbehaviour != null) {
          return this.weaponbehaviour.getAimSpeed((byte) -4);
        }
        if (null == this.grapplebehaviour) {
          return 0;
        }
        return this.grapplebehaviour.getAimSpeed((byte) 126);
    }

    public static void clearSharedReferences(int param0) {
        field_l = (byte[][][]) null;
        if (param0 != 24388) {
          field_l = (byte[][][]) null;
        }
    }

    private final void initializeGeometry(boolean param0) {
        int var3 = 0;
        ShipComponentDefinition var2;
        Hardpoint var4;
        int var5;
        int var7;
        ShipComponent var6;
        var7 = VoidHunters.field_G;
        var2 = EnvironmentReflectionGpuMaterialEffect.field_g[this.componentTypeId];
        this.finaloutline = new int[var2.outline.length];
        if (!param0) {
          this.getWorldConnectionX((ShipComponentDefinition) null, (byte) -94);
        }
        if (this.hardpoints != null) {
          for (var3 = 0; this.hardpoints.length > var3; var3++) {
            var4 = this.hardpoints[var3];
            var5 = var4.connectedComponentIdx;
            if (0 <= var5) {
              var6 = this.subcomponents[var5];
              this.alignToHardpoint(var6, (byte) 83, this.getDefinition((byte) -112), var3);
              if (!var6.hasAdjustableConnection((byte) -91)) {
                var6.resetConnectedAngle((byte) 42);
              }
            }
          }
        }
    }

    final void resetAim(int param0) {
        int discarded$0 = 0;
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        int var2Lifetime1;
        if (this.subcomponents != null) {
          for (var2 = 0; this.subcomponents.length > var2; var2++) {
            this.subcomponents[var2].resetAim(94);
          }
        }
        if (param0 < 93) {
          return;
        }
        if (this.canAimIndependently(true)) {
          var2Lifetime1 = GameKeyHandler.normalizeSignedAngle(22433, this.connectedangle - this.currentconnectedangle);
          discarded$0 = this.rotateAim((byte) -105, var2Lifetime1);
        }
    }

    final ComponentAttachmentPlan planAttachment(boolean param0, ShipBody param1, int param2, int param3, int param4, int param5, ShipComponent param6, int param7) {
        ComponentAttachmentPlan stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        ComponentAttachmentPlan var11 = null;
        ShipComponent var12 = null;
        HardpointDefinition var13 = null;
        Hardpoint var14 = null;
        ShipComponent var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        IntrusiveDeque var19 = null;
        Object var20 = null;
        ComponentCollision var20_ref = null;
        int var21 = 0;
        HardpointMatch var22 = null;
        HardpointMatch var23 = null;
        var20 = null;
        var21 = VoidHunters.field_G;
        try {
          var22 = this.findNearestHardpoint(param7, false, param5, param2, param4, param6, -29866, (ShipBody) null);
          var23 = var22;
          if (var23 == null) {
            return null;
          }
          var10 = param1.getAngle(0);
          var11 = new ComponentAttachmentPlan(var23);
          var12 = var23.component;
          var13 = var12.getDefinition((byte) -112).hardpoints[var22.hardpointIndex];
          var14 = var12.hardpoints[var22.hardpointIndex];
          var15 = param1.chassis;
          var16 = var13.field_a + var12.finalangle;
          if (null != var15.thrusterbehaviour) {
            var16 = GameKeyHandler.normalizeSignedAngle(22433, var16 + 4096);
          }
          var17 = var15.getDefaultConnectionX(-10) * GetNumStars.cosAngle(var10, (byte) -89) - var15.getDefaultConnectionY((byte) 100) * TextureLineShape.sinAngle(var10, 49) >> 16;
          var18 = var15.getDefaultConnectionX(124) * TextureLineShape.sinAngle(var10, param3 ^ -120) + var15.getDefaultConnectionY((byte) 100) * GetNumStars.cosAngle(var10, (byte) -72) >> 16;
          var15.updateWorldTransforms(false, var14.worldx - var17, -var18 + var14.worldy, var16, param3 ^ param3, (int[]) null);
          var19 = new IntrusiveDeque();
          param6.collectTreeCollisions(var15, 0, 0, (byte) -126, var19);
          if (var19.size(3) > 0) {
            var20_ref = (ComponentCollision) (var19.first(0));
            while (var20_ref != null) {
              if (var20_ref.overlapScore > 255 &&
                !this.isAllowedAttachmentOverlap(param6, -23, var20_ref.second, var20_ref.first) &&
                !this.isAllowedAttachmentOverlap(param6, -23, var20_ref.first, var20_ref.second) && (var15 != var20_ref.first ||
                null == var15.thrusterbehaviour ||
                var20_ref.second != var23.component)) {
                var11.addObstruction((byte) 108, var20_ref.second);
              }
              var20_ref = (ComponentCollision) (var19.next((byte) 112));
            }
          }
          if (var14.connectedComponentIdx != -1) {
            var11.addObstruction((byte) 108, var12.subcomponents[var14.connectedComponentIdx]);
          }
          stackIn_23_0 = var11;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_26_0 = var9;
          stackIn_26_1 = new StringBuilder().append("ml.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param7).append(')').toString());
        }
    }

    public final boolean differsFrom(byte param0, SerializableGameState param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_1 = 0;
        boolean stackIn_49_0 = false;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ShipComponent var5 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = -19 % ((param0 - 22) / 59);
          var5 = (ShipComponent) (param1);
          if (this.componentTypeId == var5.componentTypeId) {
            stackIn_4_0 = (this.weaponbehaviour != null) ? 0 : 1;
            if (var5.weaponbehaviour != null) {
              stackIn_7_1 = 0;
            } else {
              stackIn_7_1 = 1;
            }
            if ((stackIn_4_0 ^ stackIn_7_1) == 0 && (null == this.weaponbehaviour ||
              !this.weaponbehaviour.differsFrom((byte) 87, var5.weaponbehaviour))) {
              stackIn_14_0 = (var5.thrusterbehaviour != null) ? 0 : 1;
              if (null != this.thrusterbehaviour) {
                stackIn_17_1 = 0;
              } else {
                stackIn_17_1 = 1;
              }
              if ((stackIn_14_0 ^ stackIn_17_1) == 0 && (this.thrusterbehaviour == null ||
                !this.thrusterbehaviour.differsFrom((byte) 117, var5.thrusterbehaviour))) {
                stackIn_24_0 = (this.grapplebehaviour != null) ? 0 : 1;
                if (var5.grapplebehaviour != null) {
                  stackIn_27_1 = 0;
                } else {
                  stackIn_27_1 = 1;
                }
                if ((stackIn_24_0 ^ stackIn_27_1) == 0 && (this.grapplebehaviour == null ||
                  !this.grapplebehaviour.differsFrom((byte) 90, var5.grapplebehaviour))) {
                  stackIn_34_0 = (this.behaviour != null) ? 0 : 1;
                  if (null != var5.behaviour) {
                    stackIn_37_1 = 0;
                  } else {
                    stackIn_37_1 = 1;
                  }
                  if ((stackIn_34_0 ^ stackIn_37_1) == 0 && (this.behaviour == null ||
                    this.behaviour.getClass() == var5.behaviour.getClass()) && (null == this.behaviour ||
                    !this.behaviour.differsFrom((byte) -80, var5.behaviour)) && (!SetCountermeasureLauncherAimspeed.a(var5.subcomponents, false, 1, this.subcomponents, 125) &&
                    !SetCountermeasureLauncherAimspeed.a(var5.hardpoints, false, 1, this.hardpoints, 125))) {
                    stackIn_49_0 = false;
                    decompiledFrameRemainder0 = false;
                  }
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_49_0 = true;
          }
          return stackIn_49_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_52_0 = var3;
          stackIn_52_1 = new StringBuilder().append("ml.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    private final ShipComponent resolveComponentPath(int param0, byte param1, int param2) {
        int var4 = 15 & param2 >> param0 * 4;
        if (param1 >= -50) {
          this.getDefaultConnectionX(20);
        }
        if (var4 != 0) {
          if (null == this.subcomponents) {
            return null;
          }
          if (this.subcomponents.length < var4) {
            return null;
          }
          return this.subcomponents[var4 - 1].resolveComponentPath(param0 + 1, (byte) -73, param2);
        }
        return this;
    }

    final void clearPlaceholderHealth(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (this.health == 1) {
          this.health = 0;
        }
        if (param0 <= 52) {
          return;
        }
        if (null != this.subcomponents) {
          for (var2 = 0; this.subcomponents.length > var2; var2++) {
            this.subcomponents[var2].clearPlaceholderHealth(89);
          }
        }
    }

    private final int getSpecialOrderState(Ship param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 10298) {
            stackIn_2_0 = -51;
            return stackIn_2_0;
          }
          if (null != this.grapplebehaviour) {
            if (-1 == this.grapplebehaviour.hookId) {
              return this.grapplebehaviour.reload;
            }
            stackIn_18_0 = 0;
            return stackIn_18_0;
          }
          if (this.weaponbehaviour != null) {
            stackIn_6_0 = this.weaponbehaviour.reload;
            return stackIn_6_0;
          }
          if (this.thrusterbehaviour != null) {
            stackIn_9_0 = this.thrusterbehaviour.getCooldown(0);
            return stackIn_9_0;
          }
          if (null == this.behaviour) {
            stackIn_14_0 = 0;
            return stackIn_14_0;
          }
          stackIn_12_0 = this.behaviour.getSpecialOrderState(param1 ^ 10317, param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("ml.JC(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getMass(byte param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (param0 != -86) {
          this.getTreeDepth((byte) 13);
        }
        int var2 = this.getDefinition((byte) -112).mass;
        if (null != this.subcomponents) {
          for (var3 = 0; this.subcomponents.length > var3; var3++) {
            var2 = var2 + this.subcomponents[var3].getMass((byte) -86);
          }
        }
        return var2;
    }

    final int getAimArc(int param0) {
        int var2 = 17 / ((56 - param0) / 56);
        if (null == this.behaviour) {
          if (null != this.weaponbehaviour) {
            return this.weaponbehaviour.getAimArc((byte) 120);
          }
          if (this.grapplebehaviour == null) {
            return 0;
          }
          return this.grapplebehaviour.getAimArc((byte) 12);
        }
        return this.behaviour.getAimArc((byte) -114);
    }

    final void testProjectileHit(Projectile param0, ProjectileHit param1, int param2) {
        int var4_int = 0;
        int var5 = VoidHunters.field_G;
        if (this.subcomponents != null) {
          for (var4_int = 0; this.subcomponents.length > var4_int; var4_int++) {
            this.subcomponents[var4_int].testProjectileHit(param0, param1, -1);
            if (param1.hasHit((byte) -61)) {
              return;
            }
          }
        }
        if (~this.health >= param2) {
          return;
        }
        try {
          param0.testComponentHit(24158, this, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ml.N(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void traceProjectile(Projectile param0, ProjectileTraceResult param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var4_intLifetime1;
        var5 = VoidHunters.field_G;
        try {
          if (null != this.subcomponents) {
            for (var4_int = 0; var4_int < this.subcomponents.length; var4_int++) {
              this.subcomponents[var4_int].traceProjectile(param0, param1, 0);
            }
          }
          if (param2 >= this.health) {
            return;
          }
          var4_intLifetime1 = param0.getComponentHitFraction(this, 3);
          if (param1.fraction > var4_intLifetime1) {
            param1.fraction = var4_intLifetime1;
            param1.component = this;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ml.CC(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean hasDamagedComponentInCircle(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6;
        boolean stackIn_14_0 = false;
        var6 = VoidHunters.field_G;
        if (this.subcomponents != null) {
          for (var5 = 0; var5 < this.subcomponents.length; var5++) {
            if (this.subcomponents[var5].hasDamagedComponentInCircle(32609, param1, param2, param3)) {
              return true;
            }
          }
        }
        if (param0 != 32609) {
          this.updateBehaviors(false, (byte) 89, (World) null, (ShipBody) null);
        }
        stackIn_14_0 = (ArchiveLoadRequest.intersectsCircle((byte) -57, this.finaloutline, param3, param1, param2)) && (this.health < this.getDefinition((byte) -112).maxHealth);
        return stackIn_14_0;
    }

    final int getWorldConnectionX(ShipComponentDefinition param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -69) {
            this.grapplebehaviour = (GrappleLauncherBehaviour) null;
          }
          stackIn_3_0 = this.finalx + (param0.connectionX * GetNumStars.cosAngle(this.finalangle, (byte) -99) - param0.connectionY * TextureLineShape.sinAngle(this.finalangle, 84) >> 16);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ml.TA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final int collectWeapons(int param0, int param1) {
        ShipComponent[] var5 = null;
        ShipComponent[] var3_ref_ml__ = null;
        int incrementValue$0 = 0;
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (null != this.weaponbehaviour) {
          if (param1 >= GetPointDefenceLaserProjectileInterceptDamage.field_q.length) {
            var5 = new ShipComponent[GetPointDefenceLaserProjectileInterceptDamage.field_q.length + 1];
            var3_ref_ml__ = var5;
            ArrayOperations.copy(GetPointDefenceLaserProjectileInterceptDamage.field_q, 0, var3_ref_ml__, 0, GetPointDefenceLaserProjectileInterceptDamage.field_q.length);
            GetPointDefenceLaserProjectileInterceptDamage.field_q = var5;
          }
          incrementValue$0 = param1;
          param1++;
          GetPointDefenceLaserProjectileInterceptDamage.field_q[incrementValue$0] = this;
        }
        if (param0 < 125) {
          this.grapplebehaviour = (GrappleLauncherBehaviour) null;
        }
        if (this.subcomponents != null) {
          for (var3 = 0; this.subcomponents.length > var3; var3++) {
            param1 = this.subcomponents[var3].collectWeapons(126, param1);
          }
        }
        return param1;
    }

    final void collectTreeEdgeContacts(IntrusiveDeque param0, ShipComponent param1, int param2, byte param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = VoidHunters.field_G;
        try {
          if (null != this.subcomponents) {
            for (var6_int = 0; this.subcomponents.length > var6_int; var6_int++) {
              this.subcomponents[var6_int].collectTreeEdgeContacts(param0, param1, 1 + var6_int << param4 * 4 | param2, (byte) 122, param4 + 1);
            }
          }
          param1.collectEdgeContacts(0, param0, this, param2, 0, 0);
          if (param3 < 117) {
            this.setConnectionTransform(38, 37, -84, -122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("ml.K(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean pruneDestroyedComponents(int param0, World param1, ShipBody param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.pruneDestroyedComponents(param1, 0, false, param2);
          if (this.health > param0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ml.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int countActiveThrusters(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (null != this.thrusterbehaviour && !this.thrusterbehaviour.isBooster(this.componentTypeId, (byte) -61) &&
          0 < this.health) {
          return 1;
        }
        if (this.subcomponents != null) {
          var2 = 0;
          for (var3 = 0; this.subcomponents.length > var3; var3++) {
            var2 = var2 + this.subcomponents[var3].countActiveThrusters(-8913);
          }
          return var2;
        }
        if (param0 != -8913) {
          this.applyDamageToLeaves(31, 93, (World) null, (ShipBody) null);
          return 0;
        }
        return 0;
    }

    final void setConnectionTransform(int param0, int param1, int param2, int param3) {
        this.connectionpointy = param3;
        this.connectedangle = param0;
        this.connectionpointx = param1;
        if (param2 != 56) {
          this.hardpoints = (Hardpoint[]) null;
        }
    }

    final int getTreeDepth(byte param0) {
        int var4 = 0;
        int var2;
        int var3;
        int var5;
        int var6;
        var6 = VoidHunters.field_G;
        var2 = 1;
        if (param0 != 57) {
          return -12;
        }
        if (this.subcomponents != null) {
          var3 = 0;
          for (var4 = 0; var4 < this.subcomponents.length; var4++) {
            var5 = this.subcomponents[var4].getTreeDepth((byte) 57);
            if (var5 > var3) {
              var3 = var5;
            }
          }
          var2 = var2 + var3;
        }
        return var2;
    }

    public final void readCompactState(IsaacPacketBuffer param0, int param1) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          this.componentTypeId = param0.readBits(0, 6);
          this.triggermap = param0.readBits(0, 32);
          this.connectionpointx = param0.readBits(param1 - 32, 32);
          this.connectionpointy = param0.readBits(param1 - 32, param1);
          if (!LegacyOpenGlSpecularEffect.readBoolean(false, param0)) {
            this.weaponbehaviour = null;
          } else {
            if (this.weaponbehaviour == null) {
              this.weaponbehaviour = new WeaponBehaviour();
            }
            this.weaponbehaviour.readState(param0, false);
          }
          if (LegacyOpenGlSpecularEffect.readBoolean(false, param0)) {
            if (this.thrusterbehaviour == null) {
              this.thrusterbehaviour = new ThrusterBehaviour();
            }
            this.thrusterbehaviour.readState(param0, false);
          } else {
            this.thrusterbehaviour = null;
          }
          if (LegacyOpenGlSpecularEffect.readBoolean(false, param0)) {
            if (null == this.grapplebehaviour) {
              this.grapplebehaviour = new GrappleLauncherBehaviour();
            }
            this.grapplebehaviour.readState(param0, false);
          } else {
            this.grapplebehaviour = null;
          }
          if (!LegacyOpenGlSpecularEffect.readBoolean(false, param0)) {
            this.behaviour = null;
          } else {
            if (null == this.behaviour) {
              var3_int = param0.readBits(0, 1);
              if (var3_int != 0) {
                if (var3_int == 1) {
                  this.behaviour = (ComponentBehaviour) ((Object) new ArmBehaviour());
                }
              } else {
                this.behaviour = (ComponentBehaviour) ((Object) new ShieldBehaviour());
              }
            }
            this.behaviour.readState(param0, false);
          }
          this.subcomponents = (ShipComponent[]) (GetAutoAfkTimeout.readCompactStateArray(127, 1, this.subcomponents, ArchiveTextureProvider.field_d, 5, param0));
          this.hardpoints = (Hardpoint[]) (GetAutoAfkTimeout.readCompactStateArray(param1 ^ 93, 1, this.hardpoints, HardpointGeometry.hardpointFactory, 5, param0));
          this.connectedangle = param0.readBits(0, 32);
          this.currentconnectedangle = ShieldInfo.readSignedBits(14, param0, (byte) 20);
          this.health = param0.readBits(0, 32);
          this.finalx = param0.readBits(0, 32);
          this.finaly = param0.readBits(0, 32);
          this.finalangle = param0.readBits(0, 32);
          this.finaloutline = SetVariableActionFactory.readPackedIntArray((byte) 37, this.finaloutline, param0, 8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("ml.L(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    final void ensurePositiveHealth(boolean param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (this.health <= 0) {
          this.health = 1;
        }
        if (null != this.subcomponents) {
          for (var2 = 0; this.subcomponents.length > var2; var2++) {
            this.subcomponents[var2].ensurePositiveHealth(param0);
          }
        }
        if (param0) {
          this.collectEdgeContacts(-20, (IntrusiveDeque) null, (ShipComponent) null, 126, 9, -78);
        }
    }

    final ShipComponent getComponentByPath(int param0, int param1) {
        if (param1 >= -83) {
          this.resetThrusterTrails(5);
        }
        return this.resolveComponentPath(0, (byte) -62, param0);
    }

    private final void removeSubcomponent(int param0, int param1) {
        int var4 = 0;
        ShipComponent[] var3;
        Hardpoint var5;
        int var6;
        ShipComponent[] var7;
        var6 = VoidHunters.field_G;
        if (null != this.subcomponents &&
          this.subcomponents.length > param1 &&
          param1 >= 0) {
          if (param0 < 71) {
            return;
          }
          var7 = new ShipComponent[-1 + this.subcomponents.length];
          var3 = var7;
          ArrayOperations.copy(this.subcomponents, 0, var3, 0, param1);
          if (-1 + this.subcomponents.length > param1) {
            ArrayOperations.copy(this.subcomponents, 1 + param1, var3, param1, var7.length - param1);
          }
          this.subcomponents = var3;
          if (null != this.hardpoints) {
            for (var4 = 0; this.hardpoints.length > var4; var4++) {
              var5 = this.hardpoints[var4];
              if (param1 != var5.connectedComponentIdx) {
                if (param1 < var5.connectedComponentIdx) {
                  var5.connectedComponentIdx = var5.connectedComponentIdx - 1;
                }
              } else {
                var5.connectedComponentIdx = -1;
              }
            }
            return;
          }
          return;
        }
    }

    final ShipComponent findComponentAtPoint(int param0, int param1, boolean param2) {
        int var4 = 0;
        ShipComponent var5 = null;
        int var6 = VoidHunters.field_G;
        if (this.subcomponents != null) {
          for (var4 = 0; var4 < this.subcomponents.length; var4++) {
            var5 = this.subcomponents[var4].findComponentAtPoint(param0, param1, param2);
            if (var5 != null) {
              return var5;
            }
          }
        }
        if (PolygonContainment.containsPoint(this.finaloutline, param0, 2, param1)) {
          return this;
        }
        if (param2) {
          return null;
        }
        this.getEnergyCapacity(-9);
        return null;
    }

    final void updateWorldTransforms(boolean param0, int param1, int param2, int param3, int param4, int[] param5) {
        int discarded$0 = 0;
        int var7_int = 0;
        int var8 = 0;
        try {
          if (param4 != 0) {
            discarded$0 = this.rotateAim((byte) 99, 116);
          }
          var7_int = GetNumStars.cosAngle(param3, (byte) 35);
          var8 = TextureLineShape.sinAngle(param3, 86);
          this.updateWorldTransforms(param2, var8, param0, param3, param5, false, 256, var7_int, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ml.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public final void copyTo(byte param0, SerializableGameState param1) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ShipComponent var5 = null;
        var4 = VoidHunters.field_G;
        try {
          var5 = (ShipComponent) (param1);
          var5.triggermap = this.triggermap;
          var5.connectionpointy = this.connectionpointy;
          var5.connectionpointx = this.connectionpointx;
          var5.componentTypeId = this.componentTypeId;
          if (this.weaponbehaviour == null) {
            var5.weaponbehaviour = null;
          } else {
            if (null == var5.weaponbehaviour) {
              var5.weaponbehaviour = new WeaponBehaviour();
            }
            this.weaponbehaviour.copyTo((byte) 110, var5.weaponbehaviour);
          }
          if (this.thrusterbehaviour != null) {
            if (var5.thrusterbehaviour == null) {
              var5.thrusterbehaviour = new ThrusterBehaviour();
            }
            this.thrusterbehaviour.copyTo((byte) 117, var5.thrusterbehaviour);
          } else {
            var5.thrusterbehaviour = null;
          }
          if (null != this.grapplebehaviour) {
            if (null == var5.grapplebehaviour) {
              var5.grapplebehaviour = new GrappleLauncherBehaviour();
            }
            this.grapplebehaviour.copyTo((byte) 55, var5.grapplebehaviour);
          } else {
            var5.grapplebehaviour = null;
          }
          if (this.behaviour != null) {
            if (var5.behaviour == null ||
              var5.behaviour.getClass() != this.behaviour.getClass()) {
              if (this.behaviour.getClass() == ShieldBehaviour.class) {
                var5.behaviour = (ComponentBehaviour) ((Object) new ShieldBehaviour());
              } else {
                if (this.behaviour.getClass() == ArmBehaviour.class) {
                  var5.behaviour = (ComponentBehaviour) ((Object) new ArmBehaviour());
                }
              }
            }
            this.behaviour.copyTo((byte) 78, var5.behaviour);
          } else {
            var5.behaviour = null;
          }
          var5.subcomponents = (ShipComponent[]) (SpriteDimensions.copyStateArrayByMode(var5.subcomponents, this.subcomponents, 1, ArchiveTextureProvider.field_d, false));
          var5.hardpoints = (Hardpoint[]) (SpriteDimensions.copyStateArrayByMode(var5.hardpoints, this.hardpoints, 1, HardpointGeometry.hardpointFactory, false));
          var5.connectedangle = this.connectedangle;
          var5.finalangle = this.finalangle;
          var5.finalx = this.finalx;
          var5.currentconnectedangle = this.currentconnectedangle;
          var5.finaly = this.finaly;
          var5.health = this.health;
          if (param0 <= 54) {
            field_l = (byte[][][]) null;
          }
          var5.finaloutline = SetTeamSelectionSpeedup.copyIntsReusingArray(var5.finaloutline, (byte) -94, this.finaloutline);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("ml.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final void setTriggerMap(byte param0, int param1) {
        this.triggermap = param1;
        int var3 = -97 / ((param0 - 58) / 33);
    }

    private final boolean isSpinningWeapon(int param0) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = -112 / ((param0 - 25) / 51);
        stackIn_4_0 = (this.weaponbehaviour != null) && (this.weaponbehaviour.getDefinition((byte) 24).getMaxSpinSpeed((byte) 127) > 0);
        return stackIn_4_0;
    }

    final void collectTreeCollisions(ShipComponent param0, int param1, int param2, byte param3, IntrusiveDeque param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = VoidHunters.field_G;
        try {
          if (null != this.subcomponents) {
            for (var6_int = 0; var6_int < this.subcomponents.length; var6_int++) {
              this.subcomponents[var6_int].collectTreeCollisions(param0, 1 + var6_int << param2 * 4 | param1, 1 + param2, (byte) -126, param4);
            }
          }
          param0.collectCollisions((byte) -53, 0, param1, param4, 0, this);
          if (param3 != -126) {
            this.finaloutline = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("ml.JA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final Debris detachAtPoint(World param0, int param1, int param2, ShipBody param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        ShipComponent var7 = null;
        Debris var8 = null;
        Debris var9 = null;
        int var10 = 0;
        Debris stackIn_6_0 = null;
        Debris stackIn_9_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = VoidHunters.field_G;
        try {
          if (this.subcomponents != null) {
            var6_int = 0;
            while (var6_int < this.subcomponents.length) {
              var7 = this.subcomponents[var6_int];
              var8 = var7.detachAtPoint(param0, param1, param2, param3, (byte) 106);
              if (var8 != null) {
                stackIn_6_0 = var8;
                return stackIn_6_0;
              }
              if (!PolygonContainment.containsPoint(var7.finaloutline, param2, 2, param1)) {
                var6_int++;
                continue;
              }
              var7.detachFromBody(param0, -19625, param3);
              var9 = new Debris(var7, false);
              param0.addDebris(var9, (byte) 124);
              this.removeSubcomponent(121, var6_int);
              param3.recalculateMassProperties((byte) 119);
              stackIn_9_0 = var9;
              return stackIn_9_0;
            }
          }
          if (param4 > 62) {
            return null;
          }
          this.triggermap = -85;
          stackIn_14_0 = null;
          return (Debris) (stackIn_14_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("ml.KB(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    final int repair(int param0, int param1) {
        if (param1 != 3) {
          return 111;
        }
        return this.adjustHealth(false, false, param0);
    }

    final void applyControls(int param0, int param1, ShipBody param2, int param3, int param4, World param5) {
        int var7_int = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        try {
          if (param1 != 7834) {
            return;
          }
          if (0 != (param4 & this.triggermap) &&
            this.health > 0 && (null == this.thrusterbehaviour ||
            (0 == (1 & param4) ||
            ((param4 & 4) == 0 ||
            (8 & param4) != 0 ||
            (8 & this.triggermap) == 0) &&
            (0 == (8 & param4) ||
            0 != (param4 & 4) ||
            0 == (this.triggermap & 4)) &&
            (GetGrapplingHookAimspeed.field_p != 0 ||
            (this.triggermap & 2) == 0)) &&
            ((param4 & 2) == 0 ||
            ((param4 & 4) == 0 ||
            (param4 & 8) != 0 ||
            (8 & this.triggermap) == 0) &&
            ((8 & param4) == 0 ||
            (param4 & 4) != 0 ||
            (this.triggermap & 4) == 0) &&
            (GetGrapplingHookAimspeed.field_p != 0 ||
            (this.triggermap & 1) == 0)))) {
            this.activate(param2, param0, param5, param3, 90, 256);
          }
          if (this.subcomponents != null) {
            for (var7_int = 0; this.subcomponents.length > var7_int; var7_int++) {
              this.subcomponents[var7_int].applyControls(param0, 7834, param2, param3, param4, param5);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_40_0 = var7;
          stackIn_40_1 = new StringBuilder().append("ml.MC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final void resetThrusterTrails(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (this.thrusterbehaviour != null) {
          this.thrusterbehaviour.resetTrail(false);
        }
        if (param0 != 14546) {
          return;
        }
        if (null != this.subcomponents) {
          for (var2 = 0; var2 < this.subcomponents.length; var2++) {
            this.subcomponents[var2].resetThrusterTrails(param0 + 0);
          }
        }
    }

    final ShipComponent getSubcomponent(int param0, int param1) {
        if (param1 != 692) {
          this.hasDamagedComponentInCircle(48, 1, -93, 81);
        }
        if (null == this.subcomponents) {
          return null;
        }
        if (param0 < 0) {
          return null;
        }
        if (this.subcomponents.length <= param0) {
          return null;
        }
        return this.subcomponents[param0];
    }

    final void collectCircleContacts(ShipComponent param0, int param1, int param2, int param3, int param4, int param5, IntrusiveDeque param6, int param7, int param8) {
        int var10_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          if (param7 != 0) {
            this.finaloutline = (int[]) null;
          }
          if (null != this.subcomponents) {
            for (var10_int = 0; var10_int < this.subcomponents.length; var10_int++) {
              this.subcomponents[var10_int].collectCircleContacts(param0, param1, var10_int + 1 << param4 * 4 | param2, param3, 1 + param4, param5, param6, param7 ^ 0, param8);
            }
          }
          if (ArchiveLoadRequest.intersectsCircle((byte) -57, this.finaloutline, param3, param1, param5)) {
            param6.addLast(-10258, new ComponentContact(this, param2, param0, param8, param3, param1, 0, 0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("ml.TB(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final int getMomentOfInertia(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var8Lifetime1;
        int var9Lifetime1;
        var12 = VoidHunters.field_G;
        var4 = this.getDefinition((byte) -112).mass;
        var5 = this.finaloutline.length >> 1;
        var6 = var4 / var5;
        var7 = 1;
        for (var8 = 0; var5 > var8; var8++) {
          var9 = (this.finaloutline[var8 << 1] >> SetRepairModePower.field_r) - (param1 >> SetRepairModePower.field_r);
          var10 = (this.finaloutline[(var8 << 1) + 1] >> SetRepairModePower.field_r) - (param2 >> SetRepairModePower.field_r);
          var11 = var7;
          var7 = var7 + var6 * (var9 * var9 + var10 * var10);
          if (var7 < var11) {
            var7 = 2147483647;
          }
        }
        if (param0 != -921054591) {
          this.finalangle = 31;
        }
        if (null != this.subcomponents) {
          var13 = 0;
          var8Lifetime1 = var13;
          while (this.subcomponents.length > var13) {
            var9Lifetime1 = var7;
            var7 = var7 + this.subcomponents[var13].getMomentOfInertia(-921054591, param1, param2);
            if (var9Lifetime1 > var7) {
              var7 = 2147483647;
            }
            var13++;
          }
        }
        return var7;
    }

    final int aimAt(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        ShipComponentDefinition var10_ref_wfb;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var11Lifetime1;
        int var12Lifetime1;
        int var16Lifetime1;
        var17 = VoidHunters.field_G;
        if (PolygonContainment.field_a == 1 &&
          null != this.weaponbehaviour &&
          this.weaponbehaviour.isFiring(true) &&
          !param1) {
          return 0;
        }
        var7 = 0;
        if (param4 != 21750) {
          this.grapplebehaviour = (GrappleLauncherBehaviour) null;
        }
        var8 = Math.abs(GameKeyHandler.normalizeSignedAngle(param4 + 683, this.connectedangle + (-this.getAimArc(127) - this.currentconnectedangle)));
        param2 = param2 + var8;
        var9 = Math.abs(GameKeyHandler.normalizeSignedAngle(param4 + 683, this.connectedangle + (this.getAimArc(param4 ^ 21639) - this.currentconnectedangle)));
        if (param2 >= 8192) {
          param2 = 8191;
        }
        param5 = param5 + var9;
        if (8192 <= param5) {
          param5 = 8191;
        }
        boolean decompiledFrameRemainder0 = true;
        if (!this.canAimIndependently(true) &&
          !param1) {
          if ((this.subcomponents != null)) {
            var7 = 0;
            var10 = 0;
            var18 = 0;
            var11 = var18;
            while (this.subcomponents.length > var18) {
              var12 = this.subcomponents[var18].aimAt(param0, false, param2, param3, 21750, param5);
              var10++;
              var7 = var7 + var12;
              var18++;
            }
            if (!(var10 <= 0)) {
              var7 = var7 / var10;
            }
          }
          decompiledFrameRemainder0 = false;
        }
        else {
          var10_ref_wfb = this.getDefinition((byte) -112);
          var11Lifetime1 = this.getWorldConnectionX(var10_ref_wfb, (byte) -69);
          var12Lifetime1 = this.getWorldConnectionY(-86, var10_ref_wfb);
          var13 = param0 - var11Lifetime1;
          var14 = param3 - var12Lifetime1;
          var15 = GameSnapshotFactory.atan2AngleWithScaling(var14, (byte) -77, var13);
          if (this.isSpinningWeapon(-77)) {
            var16 = GameKeyHandler.normalizeSignedAngle(param4 ^ 855, GameKeyHandler.normalizeSignedAngle(22433, -this.currentconnectedangle + this.finalangle) + this.connectedangle);
            var7 = GameKeyHandler.normalizeSignedAngle(22433, var15 - var16);
          } else {
            var7 = GameKeyHandler.normalizeSignedAngle(22433, -this.finalangle + var15);
          }
          var16Lifetime1 = var7;
          if (0 < var16Lifetime1) {
            var16Lifetime1 -= 8192;
          } else {
            if (var16Lifetime1 < 0) {
              var16Lifetime1 += 8192;
            }
          }
          if (var7 > param5 &&
            param2 > -var16Lifetime1) {
            var7 = var16Lifetime1;
          } else {
            if (-var7 > param2 &&
              var16Lifetime1 < param5) {
              var7 = var16Lifetime1;
            }
          }
        }
        var7 = this.rotateAim((byte) -105, var7);
        return var7;
    }

    public final void writeCompactState(IsaacPacketBuffer param0, byte param1) {
        IsaacPacketBuffer stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        IsaacPacketBuffer stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        IsaacPacketBuffer stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        boolean stackIn_14_2 = false;
        IsaacPacketBuffer stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        boolean stackIn_19_2 = false;
        int stackIn_30_0 = 0;
        IsaacPacketBuffer stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        boolean stackIn_36_2 = false;
        int stackIn_44_0 = 0;
        IsaacPacketBuffer stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        boolean stackIn_51_2 = false;
        int stackIn_57_0 = 0;
        int stackIn_58_1 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        IsaacPacketBuffer var3 = null;
        RuntimeException var3_ref = null;
        ShipComponent[] var4 = null;
        Hardpoint[] var4_array = null;
        int var5 = 0;
        int var7 = 0;
        ShipComponent var8 = null;
        Hardpoint var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        ShipComponent[] var11 = null;
        Hardpoint[] var12 = null;
        IsaacPacketBuffer var3Lifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        var9 = VoidHunters.field_G;
        try {
          param0.writeBits(-632, this.componentTypeId, 6);
          param0.writeBits(-632, this.triggermap, 32);
          param0.writeBits(-632, this.connectionpointx, 32);
          param0.writeBits(-632, this.connectionpointy, 32);
          stackIn_3_0 = (IsaacPacketBuffer) (param0);
          stackIn_3_1 = 74;
          stackIn_4_2 = (this.weaponbehaviour != null);
          if (DateOfBirthInput.writeBoolean(stackIn_3_0, stackIn_3_1, stackIn_4_2)) {
            this.weaponbehaviour.writeState(param0, -125);
          }
          stackIn_8_0 = (IsaacPacketBuffer) (param0);
          stackIn_8_1 = 104;
          stackIn_9_2 = (null != this.thrusterbehaviour);
          if (DateOfBirthInput.writeBoolean(stackIn_8_0, stackIn_8_1, stackIn_9_2)) {
            this.thrusterbehaviour.writeState(param0, -125);
          }
          stackIn_13_0 = (IsaacPacketBuffer) (param0);
          stackIn_13_1 = -93;
          stackIn_14_2 = (this.grapplebehaviour != null);
          if (DateOfBirthInput.writeBoolean(stackIn_13_0, stackIn_13_1, stackIn_14_2)) {
            this.grapplebehaviour.writeState(param0, -115);
          }
          stackIn_18_0 = (IsaacPacketBuffer) (param0);
          stackIn_18_1 = 54;
          stackIn_19_2 = (null != this.behaviour);
          if (DateOfBirthInput.writeBoolean(stackIn_18_0, stackIn_18_1, stackIn_19_2)) {
            if (this.behaviour.getClass() != ShieldBehaviour.class) {
              if (this.behaviour.getClass() == ArmBehaviour.class) {
                param0.writeBits(-632, 1, 1);
              }
            } else {
              param0.writeBits(-632, 0, 1);
            }
            this.behaviour.writeState(param0, -127);
          }
          var3 = param0;
          var4 = this.subcomponents;
          if (var4 == null) {
            stackIn_30_0 = 0;
          } else {
            stackIn_30_0 = var4.length;
          }
          var5 = stackIn_30_0;
          var3.writeBits(-632, var5, 5);
          if (0 != var5) {
            var11 = var4;
            for (var7 = 0; var11.length > var7; var7++) {
              var8 = var11[var7];
              stackIn_35_0 = var3;
              stackIn_35_1 = -97;
              stackIn_36_2 = (var8 != null);
              if (DateOfBirthInput.writeBoolean(stackIn_35_0, stackIn_35_1, stackIn_36_2)) {
                ((CompactGameState) ((Object) var8)).writeCompactState(var3, (byte) -122);
              }
            }
          }
          var3Lifetime1 = param0;
          var4_array = this.hardpoints;
          if (param1 > -91) {
            return;
          }
          if (var4_array != null) {
            stackIn_44_0 = var4_array.length;
          } else {
            stackIn_44_0 = 0;
          }
          var5Lifetime1 = stackIn_44_0;
          var3Lifetime1.writeBits(-632, var5Lifetime1, 5);
          if (0 != var5Lifetime1) {
            var12 = var4_array;
            var10 = 0;
            var7Lifetime1 = var10;
            while (var12.length > var10) {
              var8_ref = var12[var10];
              stackIn_50_0 = var3Lifetime1;
              stackIn_50_1 = 120;
              stackIn_51_2 = (var8_ref != null);
              if (DateOfBirthInput.writeBoolean(stackIn_50_0, stackIn_50_1, stackIn_51_2)) {
                ((CompactGameState) ((Object) var8_ref)).writeCompactState(var3Lifetime1, (byte) -93);
              }
              var10++;
            }
          }
          param0.writeBits(-632, this.connectedangle, 32);
          param0.writeBits(-632, this.currentconnectedangle, 14);
          param0.writeBits(-632, this.health, 32);
          param0.writeBits(-632, this.finalx, 32);
          param0.writeBits(-632, this.finaly, 32);
          param0.writeBits(-632, this.finalangle, 32);
          stackIn_57_0 = 8;
          if (this.finaloutline == null) {
            stackIn_58_1 = 0;
          } else {
            stackIn_58_1 = this.finaloutline.length;
          }
          ChatMessage.writePackedIntArray(stackIn_57_0, stackIn_58_1, -96, param0, this.finaloutline);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_62_0 = var3_ref;
          stackIn_62_1 = new StringBuilder().append("ml.E(");
          if (param0 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getDefaultConnectionX(int param0) {
        int var2 = 32 % ((param0 - 89) / 35);
        return this.getDefinition((byte) -112).connectionX;
    }

    private final boolean canAimIndependently(boolean param0) {
        if (this.behaviour != null &&
          this.behaviour.canAimIndependently(0)) {
          return true;
        }
        if (null != this.weaponbehaviour &&
          this.weaponbehaviour.canAimIndependently(6)) {
          return true;
        }
        if (this.grapplebehaviour != null &&
          this.grapplebehaviour.hasNoHook((byte) -113)) {
          return true;
        }
        if (!param0) {
          this.collectSpecialOrderStatuses((IntrusiveDeque) null, (Ship) null, -20);
        }
        return false;
    }

    private final void transformGeometry(boolean param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int[] param8) {
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_3 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        long var11 = 0L;
        long var13 = 0L;
        int var15 = 0;
        int var16 = 0;
        long var17 = 0L;
        long var19 = 0L;
        long var21 = 0L;
        long var23 = 0L;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        long var29 = 0L;
        long var31 = 0L;
        long var33 = 0L;
        long var35 = 0L;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        ShipComponentDefinition var40 = null;
        int var41 = 0;
        ShipComponentDefinition var42 = null;
        int var28Lifetime1;
        var39 = VoidHunters.field_G;
        try {
          stackIn_3_1 = param2 ^ 22433;
          stackIn_3_2 = param3;
          if (param0) {
            stackIn_4_3 = this.connectedangle;
          } else {
            stackIn_4_3 = this.currentconnectedangle;
          }
          this.finalangle = GameKeyHandler.normalizeSignedAngle(stackIn_3_1, stackIn_3_2 + stackIn_4_3);
          var40 = this.getDefinition((byte) -112);
          var42 = var40;
          var11 = (long)var42.connectionX;
          var13 = (long)var42.connectionY;
          var15 = GetNumStars.cosAngle(this.finalangle, (byte) -97);
          var16 = TextureLineShape.sinAngle(this.finalangle, 123);
          GetShipAimLines.field_o = var15;
          GetCountermeasureLauncherRandomness.field_p = var16;
          var17 = -(var13 * (long)var16) + (long)var15 * var11 >> 16;
          var19 = (long)var15 * var13 + (long)var16 * var11 >> 16;
          var21 = (long)(-(this.connectionpointy * param6 >> 16) + (param4 * this.connectionpointx >> 16));
          var23 = (long)((param6 * this.connectionpointx >> 16) + (this.connectionpointy * param4 >> 16));
          this.finalx = (int)((long)param7 - (-var21 + var17));
          this.finaly = (int)(-var19 + (long)param1 + var23);
          var25 = 0;
          var26 = 0;
          var27 = this.getRecoilOffset(param5, var42, true);
          if (var27 != param2) {
            var25 = var27 * var15 >> 16;
            var26 = var16 * var27 >> 16;
          }
          for (var28 = 0; var28 < var42.outline.length; var28 += 2) {
            var29 = (long)var40.outline[var28];
            var31 = (long)var40.outline[var28 + 1];
            var33 = (-(var31 * (long)var16) + var29 * (long)var15 >> 16) + (long)this.finalx;
            var35 = (long)this.finaly + ((long)var16 * var29 + (long)var15 * var31 >> 16);
            this.finaloutline[var28] = (int)var33 - var25;
            this.finaloutline[var28 + 1] = (int)var35 - var26;
            if (param8 != null) {
              if (this.finaloutline[var28] < param8[0]) {
                param8[0] = this.finaloutline[var28];
              }
              if (param8[1] < this.finaloutline[var28]) {
                param8[1] = this.finaloutline[var28];
              }
              if (param8[2] > this.finaloutline[1 + var28]) {
                param8[2] = this.finaloutline[1 + var28];
              }
              if (this.finaloutline[1 + var28] > param8[3]) {
                param8[3] = this.finaloutline[var28 + 1];
              }
              if (var25 != 0 ||
                var26 != 0) {
                var37 = var25 + this.finaloutline[var28];
                var38 = var26 + this.finaloutline[1 + var28];
                if (var37 > param8[1]) {
                  param8[1] = var37;
                }
                if (var37 < param8[0]) {
                  param8[0] = var37;
                }
                if (param8[3] < var38) {
                  param8[3] = var38;
                }
                if (var38 < param8[2]) {
                  param8[2] = var38;
                }
              }
            }
          }
          if (null != this.hardpoints) {
            var41 = 0;
            var28Lifetime1 = var41;
            while (var41 < this.hardpoints.length) {
              this.hardpoints[var41].transformToWorld(var16, this.finalx, this.finaly, var15, param2 ^ -665140432, var40.hardpoints[var41].field_b, var40.hardpoints[var41].field_c);
              var41++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_44_0 = var10;
          stackIn_44_1 = new StringBuilder().append("ml.OC(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    private final void ejectChildDebris(Random param0, World param1, int param2, byte param3, int param4, ShipBody param5) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Debris var13 = null;
        try {
          this.subcomponents[param4].detachFromBody(param1, -19625, param5);
          if (param3 != 97) {
            this.currentconnectedangle = 117;
          }
          var13 = new Debris(this.subcomponents[param4], false);
          var8 = var13.getX(false) - this.finalx;
          var9 = var13.getY((byte) 126) - this.finaly;
          VariableCondition.enqueueDebugArrow(this.finalx + var8, this.finaly + var9, this.finaly, this.finalx, (byte) -54);
          var10 = TextLayout.approximateVectorLength(var8, (byte) 110, var9);
          if (0 == var10) {
            var10 = 1;
          }
          var11 = GameSnapshotFactory.atan2AngleWithScaling(var9, (byte) -77, var8);
          var12 = param2 * var13.getMass(false) / var10;
          if (param5 != null) {
            var13.dy = param5.dy;
            var13.dx = param5.dx;
          }
          var13.addDirectionalForce(this.finaly, GameKeyHandler.normalizeSignedAngle(22433, -100 + (var11 + TextHotspotRegion.randomBoundedInt(param0, 200, 118))), this.finalx, var12, 1948934248);
          param1.addDebris(var13, (byte) 50);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_12_0 = var7;
          stackIn_12_1 = new StringBuilder().append("ml.DA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final ShipComponent[] collectActiveThrusters(int param0, ShipComponent[] param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ShipComponent[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          if (this.thrusterbehaviour != null &&
            !this.thrusterbehaviour.isBooster(this.componentTypeId, (byte) -61) &&
            this.health > 0) {
            param1 = (ShipComponent[]) (SoftwareSprite2D.appendStateArrayValue(this, param1, 0, ArchiveTextureProvider.field_d));
          }
          if (param0 != 0) {
            this.currentconnectedangle = 84;
          }
          if (null != this.subcomponents) {
            for (var4_int = 0; this.subcomponents.length > var4_int; var4_int++) {
              param1 = this.subcomponents[var4_int].collectActiveThrusters(param0 + 0, param1, param2);
            }
          }
          stackIn_13_0 = (ShipComponent[]) (param1);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("ml.BD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final int countType(int param0, int param1) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        int var3 = param1;
        if (this.subcomponents != null) {
          for (var4 = 0; this.subcomponents.length > var4; var4++) {
            var3 = var3 + this.subcomponents[var4].countType(param0, 0);
          }
        }
        if (param0 == this.componentTypeId) {
          var3++;
        }
        return var3;
    }

    final void accumulateHealth(int[] param0, byte param1, boolean param2) {
        int var4_int = 0;
        int var5 = VoidHunters.field_G;
        try {
          if (param1 != -17) {
            this.thrusterbehaviour = (ThrusterBehaviour) null;
          }
          param0[0] = param0[0] + this.health;
          param0[1] = param0[1] + this.getDefinition((byte) -112).maxHealth;
          if (param2 &&
            null != this.subcomponents) {
            for (var4_int = 0; var4_int < this.subcomponents.length; var4_int++) {
              this.subcomponents[var4_int].accumulateHealth(param0, (byte) -17, param2);
            }
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ml.EC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ShipComponentDefinition getDefinition(byte param0) {
        if (param0 != -112) {
          return (ShipComponentDefinition) null;
        }
        return EnvironmentReflectionGpuMaterialEffect.field_g[this.componentTypeId];
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        IsaacPacketBuffer stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        IsaacPacketBuffer stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_10_2 = false;
        IsaacPacketBuffer stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        boolean stackIn_15_2 = false;
        IsaacPacketBuffer stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean stackIn_21_2 = false;
        int stackIn_31_0 = 0;
        IsaacPacketBuffer stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        boolean stackIn_37_2 = false;
        int stackIn_46_0 = 0;
        IsaacPacketBuffer stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        boolean stackIn_52_2 = false;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        IsaacPacketBuffer var3 = null;
        RuntimeException var3_ref = null;
        ShipComponent[] var4 = null;
        Hardpoint[] var4_array = null;
        int var5 = 0;
        int var7 = 0;
        ShipComponent var8 = null;
        Hardpoint var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        ShipComponent[] var11 = null;
        Hardpoint[] var12 = null;
        IsaacPacketBuffer var3Lifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        var9 = VoidHunters.field_G;
        try {
          param0.writeBits(-632, this.componentTypeId, 6);
          stackIn_3_0 = (IsaacPacketBuffer) (param0);
          stackIn_3_1 = -55;
          stackIn_4_2 = (this.weaponbehaviour != null);
          if (DateOfBirthInput.writeBoolean(stackIn_3_0, stackIn_3_1, stackIn_4_2)) {
            this.weaponbehaviour.writeState(param0, -114);
          }
          stackIn_9_0 = (IsaacPacketBuffer) (param0);
          stackIn_9_1 = 62;
          stackIn_10_2 = (null != this.thrusterbehaviour);
          if (DateOfBirthInput.writeBoolean(stackIn_9_0, stackIn_9_1, stackIn_10_2)) {
            this.thrusterbehaviour.writeState(param0, -123);
          }
          stackIn_14_0 = (IsaacPacketBuffer) (param0);
          stackIn_14_1 = 113;
          stackIn_15_2 = (this.grapplebehaviour != null);
          if (DateOfBirthInput.writeBoolean(stackIn_14_0, stackIn_14_1, stackIn_15_2)) {
            this.grapplebehaviour.writeState(param0, -115);
          }
          stackIn_20_0 = (IsaacPacketBuffer) (param0);
          stackIn_20_1 = -98;
          stackIn_21_2 = (null != this.behaviour);
          if (DateOfBirthInput.writeBoolean(stackIn_20_0, stackIn_20_1, stackIn_21_2)) {
            if (this.behaviour.getClass() != ShieldBehaviour.class) {
              if (this.behaviour.getClass() == ArmBehaviour.class) {
                param0.writeBits(-632, 1, 1);
              }
            } else {
              param0.writeBits(-632, 0, 1);
            }
            this.behaviour.writeState(param0, -110);
          }
          var3 = param0;
          var4 = this.subcomponents;
          if (var4 != null) {
            stackIn_31_0 = var4.length;
          } else {
            stackIn_31_0 = 0;
          }
          var5 = stackIn_31_0;
          var3.writeBits(-632, var5, 5);
          if (var5 != 0) {
            var11 = var4;
            for (var7 = 0; var11.length > var7; var7++) {
              var8 = var11[var7];
              stackIn_36_0 = var3;
              stackIn_36_1 = 113;
              stackIn_37_2 = (var8 != null);
              if (DateOfBirthInput.writeBoolean(stackIn_36_0, stackIn_36_1, stackIn_37_2)) {
                GetComponentBreakingExplosionForceMultiplier.writeStateByMode(2, 1, var3, var8);
              }
            }
          }
          var3Lifetime1 = param0;
          var4_array = this.hardpoints;
          if (param1 > -109) {
            this.behaviour = (ComponentBehaviour) null;
          }
          if (var4_array != null) {
            stackIn_46_0 = var4_array.length;
          } else {
            stackIn_46_0 = 0;
          }
          var5Lifetime1 = stackIn_46_0;
          var3Lifetime1.writeBits(-632, var5Lifetime1, 5);
          if (var5Lifetime1 != 0) {
            var12 = var4_array;
            var10 = 0;
            var7Lifetime1 = var10;
            while (var10 < var12.length) {
              var8_ref = var12[var10];
              stackIn_51_0 = var3Lifetime1;
              stackIn_51_1 = 53;
              stackIn_52_2 = (var8_ref != null);
              if (DateOfBirthInput.writeBoolean(stackIn_51_0, stackIn_51_1, stackIn_52_2)) {
                GetComponentBreakingExplosionForceMultiplier.writeStateByMode(2, 1, var3Lifetime1, var8_ref);
              }
              var10++;
            }
          }
          this.writePackedAttributes(param0, (byte) 63);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_59_0 = var3_ref;
          stackIn_59_1 = new StringBuilder().append("ml.B(");
          if (param0 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param1).append(')').toString());
        }
    }

    final void detachAllChildren(World param0, byte param1, ShipBody param2) {
        int var4_int = 0;
        ShipComponent var5 = null;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var6 = VoidHunters.field_G;
        try {
          if (param1 != -111) {
            this.connectionpointy = 51;
          }
          if (null != this.subcomponents) {
            var4_int = 0;
            while (var4_int < this.subcomponents.length) {
              var5 = this.subcomponents[var4_int];
              var5.detachAllChildren(param0, (byte) -111, param2);
              var4_int--;
              this.detachComponent(false, var5, param0, param1 + 234, param2);
              var4_int++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("ml.IB(");
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
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final int[] extractPolygonPart(int[] param0, int param1, int[][] param2, int param3) {
        int var7 = 0;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int[] var6 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] stackIn_3_0 = null;
        int[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          if (param3 != -600917695) {
            stackIn_3_0 = (int[]) null;
            return stackIn_3_0;
          }
          var9 = param2[param1];
          var5 = var9;
          var6 = new int[var9.length << 1];
          for (var7 = 0; var9.length > var7; var7++) {
            var6[var7 << 1] = param0[var9[var7] << 1];
            var6[(var7 << 1) + 1] = param0[(var9[var7] << 1) + 1];
          }
          stackIn_8_0 = var6;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("ml.NA(");
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
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final int getWorldConnectionY(int param0, ShipComponentDefinition param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -106 % ((-24 - param0) / 56);
          stackIn_1_0 = this.finaly + (param1.connectionX * TextureLineShape.sinAngle(this.finalangle, 62) + param1.connectionY * GetNumStars.cosAngle(this.finalangle, (byte) -119) >> 16);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ml.CD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean hasAvailableSpecialOrder(byte param0, int param1) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (param0 < 39) {
          this.weaponbehaviour = (WeaponBehaviour) null;
        }
        if (param1 == this.getDefinition((byte) -112).getSpecialOrderId(-1) &&
          !this.isDestroyed((byte) 69)) {
          return true;
        }
        if (this.subcomponents != null) {
          for (var3 = 0; var3 < this.subcomponents.length; var3++) {
            if (this.subcomponents[var3].hasAvailableSpecialOrder((byte) 118, param1)) {
              return true;
            }
          }
        }
        return false;
    }

    private final void addSubcomponent(byte param0, ShipComponent param1) {
        int var4 = 0;
        ShipComponent[] var3 = null;
        int var5 = 0;
        ShipComponent[] var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = VoidHunters.field_G;
        try {
          if (param0 != 73) {
            this.findNearestHardpoint(-81, false, 28, -34, 8, (ShipComponent) null, 106, (ShipBody) null);
          }
          if (this.subcomponents != null) {
            var6 = new ShipComponent[this.subcomponents.length + 1];
            var3 = var6;
            for (var4 = 0; var4 < this.subcomponents.length; var4++) {
              var6[var4] = this.subcomponents[var4];
            }
            var3[this.subcomponents.length] = param1;
            this.subcomponents = var3;
            return;
          }
          this.subcomponents = new ShipComponent[1];
          this.subcomponents[0] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ml.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    ShipComponent() {
    }

    final int getUnrotatedWorldAngle(byte param0) {
        if (param0 != -127) {
          this.finaloutline = (int[]) null;
        }
        return GameKeyHandler.normalizeSignedAngle(22433, this.finalangle - this.currentconnectedangle + this.connectedangle);
    }

    final int getFinalx(boolean param0) {
        if (!param0) {
          return -24;
        }
        return this.finalx;
    }

    final int getEnergyCapacity(int param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (param0 != 0) {
          this.updateWorldTransforms(45, 20, true, -45, (int[]) null, false, 77, -58, 36);
        }
        int var2 = this.getDefinition((byte) -112).energyCapacity;
        if (this.subcomponents != null) {
          for (var3 = 0; this.subcomponents.length > var3; var3++) {
            var2 = var2 + this.subcomponents[var3].getEnergyCapacity(param0 ^ 0);
          }
        }
        return var2;
    }

    final void resetConnectedAngle(byte param0) {
        if (param0 != 42) {
          this.finaly = 90;
        }
        this.currentconnectedangle = this.connectedangle;
    }

    final void explode(boolean param0, World param1, ShipBody param2, byte param3) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Random var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        ShipComponentDefinition var18 = null;
        int var11Lifetime1;
        var17 = VoidHunters.field_G;
        try {
          BlendTextureOperation.playSpatialSound(20382, this.finalx, 65, this.finaly, 10);
          var18 = this.getDefinition((byte) -112);
          var6 = Math.min(var18.maxHealth / var18.healthScale + this.countComponents(1), 1000);
          if (param3 > -53) {
            this.currentconnectedangle = -111;
          }
          var7 = param2.dx;
          var8 = param2.dy;
          var9 = CarouselConstantRequests.field_f * this.getDefinition((byte) -112).field_h >> 8;
          var10 = new Random((long)this.finalx);
          if (null != this.subcomponents &&
            param0) {
            for (var11 = 0; this.subcomponents.length > var11; var11++) {
              this.ejectChildDebris(var10, param1, var9, (byte) 97, var11, param2);
            }
          }
          var11Lifetime1 = 3;
          if (param2 instanceof Ship) {
            var11Lifetime1 = ((Ship) (param2)).getTeam((byte) 71);
            param2 = null;
          }
          param1.spawnPolygonParticles(var11Lifetime1, var8, 100, 50, 1000, var6 << 1, var7, this.finaloutline, (byte) 84);
          if (param2 != null) {
            var12 = param2.getX(false) - this.finalx;
            var13 = param2.getY((byte) -21) - this.finaly;
            VariableCondition.enqueueDebugArrow(this.finalx + var12, this.finaly + var13, this.finaly, this.finalx, (byte) -54);
            var14 = TextLayout.approximateVectorLength(var12, (byte) 120, var13);
            if (var14 == 0) {
              var14 = 1;
            }
            var15 = GameSnapshotFactory.atan2AngleWithScaling(var13, (byte) -77, var12);
            var16 = param2.getMass(false) * var9 / var14;
            param2.addDirectionalForce(this.finaly, GameKeyHandler.normalizeSignedAngle(22433, -100 + (var15 + TextHotspotRegion.randomBoundedInt(var10, 200, 123))), this.finalx, var16, 1948934248);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("ml.NC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    final void drawTrailsAndGrapples(int param0, int param1, World param2, Camera2D param3) {
        int var5_int = 0;
        int var6 = VoidHunters.field_G;
        try {
          if (this.thrusterbehaviour != null) {
            this.thrusterbehaviour.drawTrail((byte) -116, param1, param3, this.finaloutline);
          }
          if (null != this.grapplebehaviour) {
            this.grapplebehaviour.drawRope(this.finalangle, param3, this.getDefinition((byte) -112).outline, this.finaly, param2, this.finalx, param0 + 110);
          }
          if (param0 != 0) {
            this.getSubcomponent(34, -81);
          }
          if (this.subcomponents != null) {
            for (var5_int = 0; var5_int < this.subcomponents.length; var5_int++) {
              this.subcomponents[var5_int].drawTrailsAndGrapples(0, param1, param2, param3);
            }
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ml.JB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void alignToHardpoint(ShipComponent param0, byte param1, ShipComponentDefinition param2, int param3) {
        int var5_int = 0;
        try {
          if (param1 <= 25) {
            this.subcomponents = (ShipComponent[]) null;
          }
          var5_int = param2.hardpoints[param3].field_a;
          if (null != param0.thrusterbehaviour) {
            var5_int = GameKeyHandler.normalizeSignedAngle(22433, 4096 + var5_int);
          }
          param0.setConnectionTransform(var5_int, param2.hardpoints[param3].field_b, 56, param2.hardpoints[param3].field_c);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ml.PC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void attachToHardpoint(int param0, int param1, ShipComponent param2) {
        ShipComponentDefinition var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          this.addSubcomponent((byte) 73, param2);
          this.hardpoints[param1].connectedComponentIdx = -1 + this.subcomponents.length;
          var4 = this.getDefinition((byte) -112);
          this.alignToHardpoint(param2, (byte) 115, var4, param1);
          if (param0 != 1) {
            this.collectDescendants((ShipComponent[]) null, (byte) 63);
            param2.resetConnectedAngle((byte) 42);
          } else {
            param2.resetConnectedAngle((byte) 42);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("ml.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    ShipComponent(int param0) {
        int var3 = 0;
        ShipComponentDefinition var2;
        this.componentTypeId = param0;
        var2 = EnvironmentReflectionGpuMaterialEffect.field_g[this.componentTypeId];
        if (null != var2.field_c) {
          this.weaponbehaviour = new WeaponBehaviour();
          var2.field_c.copyTo((byte) 94, this.weaponbehaviour);
          if (var2.getSpecialOrderId(-1) == -1 &&
            !var2.field_c.getDefinition((byte) 24).usesTargetDisplacementVelocity(-3)) {
            this.setTriggerMap((byte) 124, 16);
          }
        }
        if (var2.field_e == null) {
          if (null != var2.field_g) {
            this.behaviour = (ComponentBehaviour) ((Object) new ShieldBehaviour());
            var2.field_g.copyTo((byte) 56, this.behaviour);
          }
        } else {
          this.behaviour = (ComponentBehaviour) ((Object) new ArmBehaviour());
          var2.field_e.copyTo((byte) 64, this.behaviour);
        }
        if (null != var2.field_t) {
          this.thrusterbehaviour = new ThrusterBehaviour();
          var2.field_t.copyTo((byte) 92, this.thrusterbehaviour);
        }
        if (null != var2.field_x) {
          this.grapplebehaviour = new GrappleLauncherBehaviour();
          var2.field_x.copyTo((byte) 107, this.grapplebehaviour);
        }
        this.currentconnectedangle = 0;
        this.health = var2.maxHealth;
        this.connectedangle = 0;
        if (null != var2.hardpoints) {
          this.hardpoints = new Hardpoint[var2.hardpoints.length];
          for (var3 = 0; var3 < this.hardpoints.length; var3++) {
            this.hardpoints[var3] = new Hardpoint();
          }
        }
        this.initializeGeometry(true);
    }

    static {
    }
}
