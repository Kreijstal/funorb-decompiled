/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ShipComponent implements DiffableState, utb {
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

    final void a(byte param0, int[] param1) {
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
          var3_int = this.i((byte) -112).field_u;
          param1[1] = param1[1] + (this.finaly * var3_int >> 4);
          param1[2] = param1[2] + var3_int;
          if (param0 < 23) {
            return;
          }
          param1[0] = param1[0] + (this.finalx * var3_int >> 4);
          if (null != this.subcomponents) {
            for (var4 = 0; var4 < this.subcomponents.length; var4++) {
              this.subcomponents[var4].a((byte) 117, param1);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final int c(byte param0) {
        if (param0 != 100) {
          return -49;
        }
        return this.i((byte) -112).field_i;
    }

    final void a(byte param0, lta param1, boolean param2, World param3, int param4) {
        int var6_int = 0;
        int var7 = VoidHunters.field_G;
        this.a(param3, (byte) 84, param4, param1, param2);
        if (param0 <= 21) {
          return;
        }
        try {
          if (null != this.subcomponents) {
            for (var6_int = 0; this.subcomponents.length > var6_int; var6_int++) {
              this.subcomponents[var6_int].a((byte) 87, param1, param2, param3, param4);
            }
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ml.NB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(ShipBody param0, int param1, World param2, int param3, int param4, int param5) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        wfb var8 = null;
        try {
          if (param4 <= 7) {
            return;
          }
          var8 = this.i((byte) -112);
          if (this.thrusterbehaviour != null) {
            this.thrusterbehaviour.a(true, var8.field_i, this.finalx, this.finaly, var8.field_b, param0, var8.field_v, this.finaloutline, param2, this.finalangle, param1, param5, param3, this.componentTypeId);
          }
          if (this.weaponbehaviour != null) {
            this.weaponbehaviour.a(param2, false, var8.field_b, param3, -97, param0, param1, this.finaly, this.finalangle, this.finalx, var8.field_i, var8.field_v);
          }
          if (this.grapplebehaviour != null) {
            this.grapplebehaviour.a(param3, this.finaly, var8.field_v, param1, this.finalangle, this.finalx, var8.field_i, (byte) 77, param2, var8.field_b, param0);
          }
          if (null != this.behaviour) {
            this.behaviour.a(param0, var8.field_v, -9151, param1, this.finaly, this.finalangle, var8.field_b, param2, var8.field_i, this.finalx, param3);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(World param0, int param1, ShipBody param2) {
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
            this.grapplebehaviour.a(param0, 19278);
          }
          param0.a(15520, this, param2);
          if (this.weaponbehaviour != null) {
            if (this.weaponbehaviour.b(true)) {
              this.weaponbehaviour.reload = this.weaponbehaviour.a((byte) 24).f((byte) 12) - this.weaponbehaviour.a((byte) 24).c((byte) 122);
            }
            this.weaponbehaviour.b(2048);
          }
          if (null != this.subcomponents) {
            for (var4_int = 0; this.subcomponents.length > var4_int; var4_int++) {
              this.subcomponents[var4_int].a(param0, -19625, param2);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final boolean d(byte param0) {
        int var2;
        boolean stackIn_5_0 = false;
        var2 = 63 / ((-25 - param0) / 43);
        stackIn_5_0 = (this.d(-47)) || !(0 >= this.c(118));
        return stackIn_5_0;
    }

    final void a(boolean param0, byte param1, World param2, ShipBody param3) {
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
        mfb var22 = null;
        wfb var23 = null;
        IntrusiveDeque var24 = null;
        wfb var25 = null;
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
              this.subcomponents[var5_int].a(param0, (byte) -124, param2, param3);
            }
          }
          if (null != this.weaponbehaviour &&
            param0) {
            var23 = this.i((byte) -112);
            var22 = this.weaponbehaviour.a((byte) 24);
            if (0 < var22.b((byte) 97) &&
              this.weaponbehaviour.reload != 0) {
              this.currentconnectedangle = this.currentconnectedangle + this.weaponbehaviour.reload;
              this.weaponbehaviour.a(this.finalx, param3, var23.field_v, var23.field_i, this.finaly, true, var23.field_b, this.finalangle, param2);
              param3.d((byte) -76);
            } else {
              if (!this.k((byte) 127)) {
                if (this.weaponbehaviour.c((byte) 101)) {
                  if (this.weaponbehaviour.b(true)) {
                    var7 = this.weaponbehaviour.c(2);
                    if (var7 != null) {
                      var8 = param3;
                      if (var7.targetId >= 0) {
                        var8 = param2.d((byte) -27, var7.targetId);
                      }
                      if (var8 != null) {
                        this.a(var8.d(false) + var7.targetX, true, 0, var8.g((byte) -87) + var7.targetY, 21750, 0);
                      }
                    }
                  } else {
                    this.weaponbehaviour.b(param1 + 2172);
                  }
                }
                this.weaponbehaviour.a(this.finalx, param3, var23.field_v, var23.field_i, this.finaly, true, var23.field_b, this.finalangle, param2);
                if (var22.h(param1 ^ 2185)) {
                  var26 = (Ship) (param3);
                  var24 = param2.getProjectiles(true);
                  var9 = param2.getShips(1000);
                  var10 = null;
                  var11 = var22.j(param1 ^ 107);
                  var12 = (Projectile) (var24.d(0));
                  while (var12 != null) {
                    var13 = var12.getType((byte) -104);
                    if ((~var12.getFiredTeam(512) != ~var26.getTeam((byte) 73) ||
                      !qab.a(33, param2.d(false)) &&
                      var12.b(false) != var26.getOwner((byte) -117)) &&
                      (var13 == 6 ||
                      var13 == 1)) {
                      var14_int = var12.x - this.finalx;
                      var15 = var12.y - this.finaly;
                      var16 = ar.a(var14_int, (byte) 104, var15);
                      if (var11 > var16 &&
                        this.weaponbehaviour.a(-26772, var12.y, var12.x, var23, this)) {
                        var10 = var12;
                        var11 = var16;
                      }
                    }
                    var12 = (Projectile) (var24.a((byte) 65));
                  }
                  var19 = var9;
                  var12_array = var9;
                  var20 = 0;
                  var13Lifetime1 = var20;
                  while (var20 < var19.length) {
                    var14 = var19[var20];
                    if (var14 != null &&
                      var14.g(false) &&
                      var14.getTeam((byte) 78) != var26.getTeam((byte) 124)) {
                      var15Lifetime1 = var14.x - this.finalx;
                      var16Lifetime1 = var14.y - this.finaly;
                      var17 = ar.a(var15Lifetime1, (byte) 109, var16Lifetime1);
                      if (var17 < var11 &&
                        this.weaponbehaviour.a(param1 ^ 26856, var14.y, var14.x, var23, this)) {
                        var11 = var17;
                        var10 = var14;
                      }
                    }
                    var20++;
                  }
                  if (var10 != null) {
                    this.a(((ara) (var10)).dx + ((ara) (var10)).x, true, 0, ((ara) (var10)).y + ((ara) (var10)).dy, 21750, 0);
                    this.a(param3, ((ara) (var10)).dy + ((ara) (var10)).y, param2, ((ara) (var10)).x + ((ara) (var10)).dx, 111, 256);
                    param3.d((byte) -44);
                  }
                }
              }
            }
            if (0 < var22.b((byte) 72) &&
              !this.k((byte) 106)) {
              this.weaponbehaviour.a(param2, true, var23.field_b, 0, -78, param3, 0, this.finaly, this.finalangle, this.finalx, var23.field_i, var23.field_v);
            }
          }
          stackIn_65_0 = (!this.k((byte) 46)) ? 0 : 1;
          var5_intLifetime1 = stackIn_65_0;
          if (param1 != -124) {
            this.a((faa) null, false);
          }
          if (var5_intLifetime1 != 0 &&
            this.weaponbehaviour != null &&
            this.weaponbehaviour.b(true)) {
            this.weaponbehaviour.reload = this.weaponbehaviour.a((byte) 24).f((byte) 57) - this.weaponbehaviour.a((byte) 24).c((byte) 124);
          }
          if (null != this.thrusterbehaviour) {
            this.thrusterbehaviour.a(var5_intLifetime1 != 0, param3, this.finalangle, this.finaly, this.componentTypeId, this.finaloutline, param1 - 31377, this.finalx, param2);
          }
          var25 = this.i((byte) -112);
          if (this.grapplebehaviour != null) {
            this.grapplebehaviour.a(param3, param2, this.finaly, var5_intLifetime1 != 0, (byte) 126, this.finalx, this.finalangle, var25.field_v);
          }
          if (null != this.behaviour) {
            this.behaviour.a(var5_intLifetime1 != 0, this.finaly, param3, var25.field_v, param2, this.finalangle, 123, this.finalx);
          }
          if (var25.field_d > 0 &&
            param0) {
            ((Ship) (param3)).e(-1, var25.field_d);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_86_0), ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(')').toString());
        }
    }

    final ShipComponent[] a(byte param0, int param1, int param2, ShipComponent[] param3, int param4) {
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
              param3 = this.subcomponents[var6_int].a((byte) 101, param1, param2, param3, param4);
            }
          }
          if (param0 != 101) {
            this.a((byte) 114, (ShipBody) null);
          }
          if (ujb.a((byte) -57, this.finaloutline, param1, param4, param2)) {
            param3 = (ShipComponent[]) (ija.a(this, param3, 0, ii.field_d));
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final lu a(int param0, boolean param1, int param2, int param3, int param4, ShipComponent param5, int param6, ShipBody param7) {
        int var11 = 0;
        lu stackIn_3_0 = null;
        lu stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var9 = null;
        int var10 = 0;
        lu var11_ref_lu = null;
        Hardpoint var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var10Lifetime1;
        var16 = VoidHunters.field_G;
        try {
          if (param6 != -29866) {
            stackIn_3_0 = (lu) null;
            return stackIn_3_0;
          }
          var9 = null;
          if (this.subcomponents != null) {
            for (var10 = 0; var10 < this.subcomponents.length; var10++) {
              var11_ref_lu = this.subcomponents[var10].a(param0, param1, param2, param3, param4, param5, -29866, param7);
              if (var11_ref_lu != null) {
                var9 = var11_ref_lu;
                param2 = ((lu) (var9)).field_g;
              }
            }
          }
          if (null != this.hardpoints) {
            var10Lifetime1 = -1;
            for (var11 = 0; this.hardpoints.length > var11; var11++) {
              var12 = this.hardpoints[var11];
              var13 = var12.worldx - param0;
              var14 = -param4 + var12.worldy;
              var15 = ar.a(var13, (byte) 120, var14);
              if (param2 > var15) {
                param2 = var15;
                var10Lifetime1 = var11;
              }
            }
            if (-1 != var10Lifetime1) {
              stackIn_21_0 = new lu(var10Lifetime1, this, param2);
              return stackIn_21_0;
            }
          }
          stackIn_23_0 = var9;
          return (lu) (stackIn_23_0);
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
          throw GetMissileLauncherRandomness.a((Throwable) (stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, int param2, IntrusiveDeque param3, int param4, ShipComponent param5) {
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
              this.subcomponents[var7_int].a((byte) -52, 1 + param1, var7_int + 1 << 4 * param1 | param2, param3, param4, param5);
            }
          }
          if (ar.a(-param5.finalx + this.finalx, (byte) 115, -param5.finaly + this.finaly) > this.i((byte) -112).field_l + param5.i((byte) -112).field_l) {
            return;
          }
          var7 = this.i((byte) -112).field_A;
          var8 = 37 % ((61 - param0) / 51);
          var9 = param5.i((byte) -112).field_A;
          if (var7 != null) {
            if (var9 == null) {
              var10 = -1;
              for (var11 = 0; var7.length > var11; var11++) {
                var24 = this.a(this.finaloutline, var11, var7, -600917695);
                var13 = ihb.a(var24, -5115, param5.finaloutline);
                if (var10 < var13) {
                  var10 = var13;
                }
              }
              if (var10 == -1) {
                return;
              }
              param3.b(-10258, new fka(this, param2, param5, param4, var10));
              return;
            }
            var10Lifetime3 = -1;
            for (var11Lifetime2 = 0; var7.length > var11Lifetime2; var11Lifetime2++) {
              var25 = this.a(this.finaloutline, var11Lifetime2, var7, -600917695);
              for (var13Lifetime2 = 0; var13Lifetime2 < var9.length; var13Lifetime2++) {
                var26 = this.a(param5.finaloutline, var13Lifetime2, var9, -600917695);
                var15 = ihb.a(var25, -5115, var26);
                if (var15 > var10Lifetime3) {
                  var10Lifetime3 = var15;
                }
              }
            }
            if (var10Lifetime3 == -1) {
              return;
            }
            param3.b(-10258, new fka(this, param2, param5, param4, var10Lifetime3));
            return;
          }
          if (var9 != null) {
            var10Lifetime1 = -1;
            for (var11Lifetime1 = 0; var11Lifetime1 < var9.length; var11Lifetime1++) {
              var27 = this.a(param5.finaloutline, var11Lifetime1, var9, -600917695);
              var13Lifetime1 = ihb.a(this.finaloutline, -5115, var27);
              if (var13Lifetime1 > var10Lifetime1) {
                var10Lifetime1 = var13Lifetime1;
              }
            }
            if (var10Lifetime1 == -1) {
              return;
            }
            param3.b(-10258, new fka(this, param2, param5, param4, var10Lifetime1));
            return;
          }
          var10Lifetime2 = ihb.a(this.finaloutline, -5115, param5.finaloutline);
          if (-1 != var10Lifetime2) {
            param3.b(-10258, new fka(this, param2, param5, param4, var10Lifetime2));
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, World param2, ShipBody param3) {
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
            param3.chassis.a(param0, (byte) 80);
            return false;
          }
          if (null != this.subcomponents &&
            this.subcomponents.length != 0) {
            for (var5_int = 0; this.subcomponents.length > var5_int; var5_int++) {
              var6 = this.subcomponents[var5_int].a(param0, 47, param2, param3) ? 1 : 0;
              if (var6 != 0) {
                this.a(param2, 0, true, param3);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int getComponentTypeId(int param0) {
        if (param0 != 0) {
          return 64;
        }
        return this.componentTypeId;
    }

    final void a(World param0, byte param1, int param2, lta param3, boolean param4) {
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
        wfb var47 = null;
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
          var47 = this.i((byte) -112);
          var7 = this.health * 256 / var47.field_p;
          var8 = (-var7 + 256) * ((31 & SetMinimapWidth.field_o ^ (SetMinimapWidth.field_o & 32) - ((32 & SetMinimapWidth.field_o) >>> 5)) + 32) / 64;
          var9 = -var8 + 256;
          var10 = var8;
          var11 = 16724787;
          if (this.k((byte) 97) ||
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
            discarded$0 = this.d((byte) -119);
          }
          if (this.componentTypeId == 45) {
            SetMissileLauncherEnergyUsed.a(13412864, (byte) 7, param3.b(true, this.finaly), (float)(int)(param3.field_a * 4096.0f), 128 + (eu.a(100 * SetMinimapWidth.field_o, param1 ^ 122) >> 8) / 8, param3.a(this.finalx, (byte) 127));
          }
          if (GetPointDefenceLaserProjectiles.a(16, param1 + 11200)) {
            SetNumStars.a(param3.field_a * (float)var47.field_l, (byte) 113, param3.b(true, this.finaly), 16711680, param3.a(this.finalx, (byte) 126));
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
              var19 = (int)((float)var16 * (16384.0f * param3.field_a));
              var20_float = param3.b(this.finalx, param1 ^ -41);
              var21_float = param3.c(0, this.finaly);
              var22 = -(2048 + this.finalangle) << 3;
              var23 = var12 | -16777216;
              if (!li.field_i) {
                if (null != LoadBlackboxRecording.field_o) {
                  var18 -= 11;
                  var17 -= 11;
                  if (var17 >= 0 &&
                    LoadBlackboxRecording.field_o[var17] != null) {
                    LoadBlackboxRecording.field_o[var17].b((int)var14_float << 4, (int)var15_float << 4, (int)var20_float << 4, (int)var21_float << 4, var22, var19);
                  }
                  if (0 <= var18 &&
                    null != LoadBlackboxRecording.field_o[var18]) {
                    LoadBlackboxRecording.field_o[var18].a((int)var14_float << 4, (int)var15_float << 4, (int)var20_float << 4, (int)var21_float << 4, var22, var19);
                  }
                }
              } else {
                if (mmb.field_d[var17] != null) {
                  mmb.field_d[var17].a(var20_float, var21_float, var14_float, var15_float, var19, var22, 0, var23, 1);
                }
                if (0 <= var18 &&
                  null != mmb.field_d[var18]) {
                  mmb.field_d[var18].a(var20_float, var21_float, var14_float, var15_float, var19, var22, 0, var23, 2);
                }
              }
              var13 = 0;
            }
          }
          if (GetPointDefenceLaserProjectiles.a(4, param1 ^ 11328)) {
            var13 = 1;
          }
          if (var13 != 0) {
            var14 = GetNumStars.a(this.finalangle, (byte) -108);
            var15 = eu.a(this.finalangle, 69);
            if (0 != var47.field_b ||
              0 != var47.field_i) {
              var16Lifetime1 = -(var47.field_i * var15) + var47.field_b * var14 >> 16;
              var17Lifetime1 = var47.field_b * var15 + var47.field_i * var14 >> 16;
              var18Lifetime1 = var16Lifetime1 + this.finalx;
              var19Lifetime1 = this.finaly + var17Lifetime1;
              var20 = param3.a(var18Lifetime1, (byte) 115);
              var21 = param3.b(true, var19Lifetime1);
              GetPhasedEnergyBeamReload.a(var21, (float)(int)(512.0f * param3.field_a), param1 ^ -35, var20, param2);
              var22Lifetime1 = this.currentconnectedangle - this.connectedangle;
              var23Lifetime1 = -var22Lifetime1 + this.finalangle;
              var24 = 8 * GetNumStars.a(var23Lifetime1, (byte) 104) >> 9;
              var25 = eu.a(var23Lifetime1, 55) * 8 >> 9;
              c.a(param3.b(true, var19Lifetime1 - var25), param3.a(var18Lifetime1 - var24, (byte) 126), var20, var21, param1 - 16777300, param2);
              var24Lifetime2 = 8 * var14 >> 9;
              var25Lifetime2 = var15 * 8 >> 9;
              c.a(param3.b(true, var25Lifetime2 + var19Lifetime1), param3.a(var18Lifetime1 + var24Lifetime2, (byte) 127), var20, var21, -16777216, param2);
            }
            if (wkb.field_c != 1) {
              for (var16Lifetime1Lifetime1 = 0; this.finaloutline.length > var16Lifetime1Lifetime1; var16Lifetime1Lifetime1 += 2) {
                var17Lifetime1Lifetime1 = this.finaloutline[var16Lifetime1Lifetime1];
                var18Lifetime1Lifetime1 = this.finaloutline[var16Lifetime1Lifetime1 + 1];
                var19Lifetime1Lifetime1 = this.finaloutline[(2 + var16Lifetime1Lifetime1) % this.finaloutline.length];
                var20Lifetime1 = this.finaloutline[(3 + var16Lifetime1Lifetime1) % this.finaloutline.length];
                c.a(param3.b(true, var20Lifetime1), param3.a(var19Lifetime1Lifetime1, (byte) 124), param3.a(var17Lifetime1Lifetime1, (byte) 120), param3.b(true, var18Lifetime1Lifetime1), -16777216, var12);
              }
            } else {
              var16Lifetime1Lifetime1 = 1879048192;
              if (!var47.field_k) {
                var16Lifetime1Lifetime1 = 1342177280;
              }
              var17_ref_int____ = var47.field_w;
              if (0 != asb.field_f) {
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
                  var19_ref_int__[var20Lifetime1] = param3.a(this.finaloutline[var20Lifetime1], (byte) 122);
                  var19_ref_int__[var20Lifetime1 + 1] = param3.b(true, this.finaloutline[var20Lifetime1 + 1]);
                }
                GetBombletSprayAimarc.a(-112, 0, this.finaloutline.length, var12 | var16Lifetime1Lifetime1, var19_ref_int__);
                for (var20Lifetime1 = 0; var20Lifetime1 < this.finaloutline.length; var20Lifetime1 += 2) {
                  var21Lifetime1 = var19_ref_int__[var20Lifetime1];
                  var22Lifetime1Lifetime1 = var19_ref_int__[1 + var20Lifetime1];
                  var23Lifetime1Lifetime1 = var19_ref_int__[(2 + var20Lifetime1) % this.finaloutline.length];
                  var24Lifetime1 = var19_ref_int__[(var20Lifetime1 + 3) % this.finaloutline.length];
                  c.a(var24Lifetime1, var23Lifetime1Lifetime1, var21Lifetime1, var22Lifetime1Lifetime1, -16777216, var12);
                }
              }
              if (asb.field_f == 1 &&
                var17_ref_int____ != null) {
                for (var19Lifetime1Lifetime1 = 0; var19Lifetime1Lifetime1 < var17_ref_int____.length; var19Lifetime1Lifetime1++) {
                  var20_ref_int__ = GetLaserBeamProjectileDamage.field_p;
                  var21_ref_int__ = feb.field_b;
                  var22Lifetime1Lifetime1 = 0;
                  var23Lifetime1Lifetime1 = 0;
                  var24Lifetime1Lifetime1 = 0;
                  var25Lifetime1 = 0;
                  var26 = 1;
                  for (var27 = 0; var17_ref_int____[var19Lifetime1Lifetime1].length > var27; var27 += 2) {
                    var28 = var17_ref_int____[var19Lifetime1Lifetime1][var27] - this.a(param4, var47, true) >> 4;
                    var29 = var17_ref_int____[var19Lifetime1Lifetime1][1 + var27] >> 4;
                    var30 = var14 * var28;
                    var31 = var15 * var29;
                    var32 = var15 * var28;
                    var33 = var29 * var14;
                    var34 = var30 - var31 >> 12;
                    var35 = var32 + var33 >> 12;
                    var36 = var34 + this.finalx;
                    var37 = var35 + this.finaly;
                    var38 = param3.a(var36, (byte) 119);
                    var39 = param3.b(true, var37);
                    var20_ref_int__[var27] = var38;
                    var20_ref_int__[1 + var27] = var39;
                    if (var47.field_k) {
                      var40 = var31 + var30 >> 12;
                      var41 = -var33 + var32 >> 12;
                      var42 = this.finalx + var40;
                      var43 = this.finaly + var41;
                      var44 = param3.a(var42, (byte) 120);
                      var45 = param3.b(true, var43);
                      if (var26 == 0) {
                        c.a(var39, var38, var22Lifetime1Lifetime1, var23Lifetime1Lifetime1, -16777216, var12);
                        c.a(var45, var44, var24Lifetime1Lifetime1, var25Lifetime1, -16777216, var12);
                      }
                      var24Lifetime1Lifetime1 = var44;
                      var25Lifetime1 = var45;
                      var21_ref_int__[var27] = var44;
                      var21_ref_int__[var27 + 1] = var45;
                    } else {
                      if (var26 == 0 &&
                        !var47.field_m) {
                        c.a(var39, var38, var22Lifetime1Lifetime1, var23Lifetime1Lifetime1, -16777216, var12);
                      }
                    }
                    var26 = 0;
                    var23Lifetime1Lifetime1 = var39;
                    var22Lifetime1Lifetime1 = var38;
                  }
                  if (!var47.field_k &&
                    !var47.field_m) {
                    c.a(var20_ref_int__[1], var20_ref_int__[0], var20_ref_int__[var17_ref_int____[var19Lifetime1Lifetime1].length - 2], var20_ref_int__[var17_ref_int____[var19Lifetime1Lifetime1].length - 1], -16777216, var12);
                  }
                  var27Lifetime1 = var16Lifetime1Lifetime1;
                  GetBombletSprayAimarc.a(param1 - 198, 0, var17_ref_int____[var19Lifetime1Lifetime1].length, var12 | var27Lifetime1, var20_ref_int__);
                  if (var47.field_k) {
                    GetBombletSprayAimarc.a(-111, 0, var17_ref_int____[var19Lifetime1Lifetime1].length, var16Lifetime1Lifetime1 | var12, var21_ref_int__);
                  }
                }
              }
            }
            if (this.d(-128)) {
              for (var16Lifetime1Lifetime2 = 0; this.finaloutline.length > var16Lifetime1Lifetime2; var16Lifetime1Lifetime2 += 2) {
                var17Lifetime1Lifetime2 = this.finaloutline[var16Lifetime1Lifetime2];
                var18Lifetime1Lifetime2 = this.finaloutline[var16Lifetime1Lifetime2 + 1];
                var19Lifetime1Lifetime2 = this.finalx;
                var20Lifetime2 = this.finaly;
                c.a(param3.b(true, var20Lifetime2), param3.a(var19Lifetime1Lifetime2, (byte) 116), param3.a(var17Lifetime1Lifetime2, (byte) 115), param3.b(true, var18Lifetime1Lifetime2), -16777216, var12);
              }
            }
            if (this.hardpoints != null &&
              GetPointDefenceLaserProjectiles.a(4, 11284)) {
              for (var16Lifetime1Lifetime3 = 0; this.hardpoints.length > var16Lifetime1Lifetime3; var16Lifetime1Lifetime3++) {
                if (-1 == this.hardpoints[var16Lifetime1Lifetime3].connectedComponentIdx) {
                  var17Lifetime1Lifetime3 = this.hardpoints[var16Lifetime1Lifetime3].worldx;
                  var18Lifetime1Lifetime3 = this.hardpoints[var16Lifetime1Lifetime3].worldy;
                  var19Lifetime1Lifetime3 = param3.a(var17Lifetime1Lifetime3, (byte) 125);
                  var20Lifetime3 = param3.b(true, var18Lifetime1Lifetime3);
                  if (GetPointDefenceLaserProjectiles.a(4, 11284)) {
                    var21Lifetime2 = GetNumStars.a(this.finalangle + var47.field_o[var16Lifetime1Lifetime3].field_a, (byte) -93) * 8 >> 8;
                    var22Lifetime1Lifetime2 = eu.a(var47.field_o[var16Lifetime1Lifetime3].field_a + this.finalangle, 99) * 8 >> 8;
                    c.a(param3.b(true, var22Lifetime1Lifetime2 + var18Lifetime1Lifetime3), param3.a(var17Lifetime1Lifetime3 + var21Lifetime2, (byte) 119), var19Lifetime1Lifetime3, var20Lifetime3, -16777216, 16711680);
                    GetLagStandardDeviationOut.a(-1, Integer.toString(var16Lifetime1Lifetime3), 16711935, var20Lifetime3, var19Lifetime1Lifetime3, param1 ^ 4350);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_127_0), ((StringBuilder) (Object) stackIn_130_1).append(stackIn_131_2).append(',').append(param4).append(')').toString());
        }
    }

    final int a(boolean param0, boolean param1, int param2) {
        int var7 = 0;
        int stackIn_3_0 = 0;
        int var4;
        wfb var5;
        int var6;
        int var8;
        int var9;
        int var6Lifetime1;
        var9 = VoidHunters.field_G;
        stackIn_3_0 = (this.k((byte) 110)) ? 0 : 1;
        var4 = stackIn_3_0;
        this.health = this.health + param2;
        var5 = this.i((byte) -112);
        if (this.health <= var5.field_p) {
          if (this.k((byte) 52) &&
            var4 != 0 &&
            !param0 &&
            this.subcomponents != null &&
            this.subcomponents.length > 0) {
            for (var6 = 0; this.subcomponents.length > var6; var6++) {
              this.subcomponents[var6].g(-this.subcomponents[var6].health, 3);
            }
          }
          if (!param1) {
            return 0;
          }
          this.connectionpointx = -14;
          return 0;
        }
        var6Lifetime1 = -var5.field_p + this.health;
        if (!param0 &&
          null != this.subcomponents && this.subcomponents.length > 0) {
          for (var7 = 0; this.subcomponents.length > var7; var7++) {
            var8 = this.subcomponents[var7].g(var6Lifetime1, 3);
            var6Lifetime1 = var8;
            if (0 == var6Lifetime1) {
              break;
            }
          }
        }
        this.health = var5.field_p;
        return var6Lifetime1;
    }

    final boolean k(byte param0) {
        if (param0 < 40) {
          this.d(-95, -20);
        }
        return this.health <= 0 ? true : false;
    }

    private final void b(faa param0, byte param1) {
        int var3_int = 0;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.d((byte) -94)) {
            param0.a(-632, this.currentconnectedangle, 14);
          }
          var3_int = -63 / ((9 - param1) / 47);
          stackIn_4_0 = (faa) (param0);
          stackIn_4_1 = -115;
          stackIn_5_2 = (this.health != this.i((byte) -112).field_p);
          if (vq.a(stackIn_4_0, stackIn_4_1, stackIn_5_2)) {
            param0.a(-632, this.health, BodyInZoneCondition.a(-88, this.i((byte) -112).field_p));
          }
          if (this.f((byte) -98)) {
            param0.a(-632, this.triggermap, 9);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, boolean param5, boolean param6, int param7, int[] param8) {
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
          if (this.weaponbehaviour != null && (this.weaponbehaviour.a((byte) 24).h((byte) 55) ||
            !(this.weaponbehaviour.a((byte) 24).b((byte) 29) <= 0))) {
            this.a(param5, param3, 0, param1, param2, param6, param0, param7, param8);
            decompiledFrameRemainder0 = false;
          }
          else {
            var10_int = GetNumStars.a(this.finalangle, (byte) -103);
            var11 = eu.a(this.finalangle, 57);
            GetShipAimLines.field_o = var10_int;
            GetCountermeasureLauncherRandomness.field_p = var11;
          }
          if (null != this.subcomponents &&
            this.subcomponents.length > 0) {
            var10_intLifetime1 = GetShipAimLines.field_o;
            var11Lifetime1 = GetCountermeasureLauncherRandomness.field_p;
            for (var12 = 0; this.subcomponents.length > var12; var12++) {
              this.subcomponents[var12].a(var11Lifetime1, this.finalangle, var10_intLifetime1, this.finaly, true, param5, param6, this.finalx, param8);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
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
          tja.a(var5.subcomponents, 1, this.subcomponents, false, 5547);
          tja.a(var5.hardpoints, 1, this.hardpoints, false, 5547);
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
            this.weaponbehaviour.a((byte) 114, var5.weaponbehaviour)) {
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
            this.thrusterbehaviour.a((byte) 109, var5.thrusterbehaviour)) {
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
            this.grapplebehaviour.a((byte) 110, var5.grapplebehaviour)) {
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
            this.behaviour.a((byte) -125, var5.behaviour)) {
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2, boolean param3, byte param4, int param5, int[] param6) {
        int var8_int = 0;
        int var9 = 0;
        try {
          var8_int = GetNumStars.a(param0, (byte) -96);
          if (param4 < 84) {
            this.a((IntrusiveDeque) null, (Ship) null, 87);
          }
          var9 = eu.a(param0, 84);
          this.a(param2, var9, param3, param0, param6, param1, 256, var8_int, param5);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ml.AB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final int j(int param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        int var2 = param0;
        if (this.subcomponents != null) {
          for (var3 = 0; this.subcomponents.length > var3; var3++) {
            var2 = var2 + this.subcomponents[var3].j(1);
          }
        }
        return var2;
    }

    final void e(int param0, int param1) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (this.componentTypeId == param1 &&
          null != this.weaponbehaviour) {
          this.weaponbehaviour.reload = 0;
        }
        if (param0 <= 63) {
          this.a((Random) null, (World) null, 35, (byte) -68, 76, (ShipBody) null);
        }
        if (null != this.subcomponents) {
          for (var3 = 0; var3 < this.subcomponents.length; var3++) {
            this.subcomponents[var3].e(93, param1);
          }
        }
    }

    final int[] a(int param0, int param1, int param2, byte param3, int param4, int param5, int[] param6) {
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
            discarded$1 = this.a((ShipComponent) null, 51, (ShipComponent) null, (ShipComponent) null);
          }
          if (this.subcomponents != null) {
            for (var8_int = 0; this.subcomponents.length > var8_int; var8_int++) {
              param6 = this.subcomponents[var8_int].a(param0, param1, param2 | 1 + var8_int << 4 * param5, (byte) -45, param4, 1 + param5, param6);
            }
          }
          if (ujb.a((byte) -57, this.finaloutline, param4, param1, param0) &&
            this.health < this.i((byte) -112).field_p) {
            param6 = SetMinimapWidth.a(param6, param2, (byte) -106);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final int a(int param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = VoidHunters.field_G;
        int var5 = ar.a(param3 - this.finalx, (byte) 124, param1 - this.finaly) + this.i((byte) -112).field_l;
        if (param2 > -61) {
          this.b((faa) null, (byte) -13);
        }
        if (var5 > param0) {
          param0 = var5;
        }
        if (this.subcomponents != null) {
          for (var6 = 0; var6 < this.subcomponents.length; var6++) {
            param0 = this.subcomponents[var6].a(param0, param1, -114, param3);
          }
        }
        return param0;
    }

    final void a(int param0, int param1, World param2, byte param3, int param4, ShipBody param5) {
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
          if (this.i((byte) -112).b(-1) == param0 &&
            !this.k((byte) 67)) {
            this.a(param5, param1, param2, param4, 50, 256);
          }
          if (param3 >= -47) {
            this.connectionpointx = -103;
          }
          if (this.subcomponents != null) {
            for (var7_int = 0; this.subcomponents.length > var7_int; var7_int++) {
              this.subcomponents[var7_int].a(param0, param1, param2, (byte) -102, param4, param5);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final void a(World param0, int param1, boolean param2, ShipBody param3) {
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
              var7 = var6.a(param1 + 0, param0, param3) ? 1 : 0;
              if (var7 != 0) {
                if (param2) {
                  var8 = var6.i((byte) -112).field_y;
                  if (var8 > 0) {
                    param0.a((byte) -44, param3, var6, var6.i((byte) -112));
                  }
                }
                var6.a(param0, -19625, param3);
                this.f(115, var5_int);
                var5_int = -1 + var5_int;
                param3.e((byte) 119);
                var6.a(true, param0, param3, (byte) -113);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final int a(boolean param0, wfb param1, boolean param2) {
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
            var5 = this.weaponbehaviour.a(89);
            if (var5 > 0) {
              var4_int = param1.field_l * var5 >> 8;
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final int getFinaly(byte param0) {
        if (param0 <= 43) {
          this.a((IntrusiveDeque) null, (Ship) null, 87);
        }
        return this.finaly;
    }

    final void g(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (null != this.thrusterbehaviour) {
          this.thrusterbehaviour.b(true);
        }
        if (null != this.subcomponents) {
          for (var2 = 0; var2 < this.subcomponents.length; var2++) {
            this.subcomponents[var2].g(0);
          }
        }
        if (param0 != 0) {
          this.a(59, -127, (World) null, (byte) 46, 109, (ShipBody) null);
        }
    }

    private final void a(int param0, faa param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.d((byte) -94)) {
            this.currentconnectedangle = uwa.a(14, param1, (byte) 20);
          }
          if (!kv.a(false, param1)) {
            this.health = this.i((byte) -112).field_p;
          } else {
            this.health = param1.i(0, BodyInZoneCondition.a(-111, this.i((byte) -112).field_p));
          }
          if (this.f((byte) -15)) {
            this.triggermap = param1.i(0, 9);
          }
          this.c(true);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void a(IntrusiveDeque param0, Ship param1, int param2) {
        int var6 = 0;
        int var4_int = 0;
        int var5 = VoidHunters.field_G;
        int var4_intLifetime1;
        try {
          if (~this.i((byte) -112).b(-1) != param2) {
            var4_int = this.a(param1, param2 ^ 10298);
            if (this.k((byte) 84) &&
              var4_int == 0) {
              var4_int++;
            }
            param0.b(-10258, new ihb(this.i((byte) -112).b(-1), var4_int));
          }
          if (this.subcomponents != null) {
            var6 = 0;
            var4_intLifetime1 = var6;
            while (this.subcomponents.length > var6) {
              this.subcomponents[var6].a(param0, param1, 0);
              var6++;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ml.VC(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(int param0, byte param1) {
        int var5 = 0;
        int var4 = -97 / ((-34 - param1) / 62);
        int var3 = this.i((byte) -112).field_B;
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

    private final void a(int param0, IntrusiveDeque param1, ShipComponent param2, int param3, int param4, int param5) {
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
              this.subcomponents[var7_int].a(param0 + 1, param1, param2, param3 | 1 + var7_int << param0 * 4, 0, param5);
            }
          }
          if (ar.a(this.finalx - param2.finalx, (byte) 119, this.finaly - param2.finaly) > this.i((byte) -112).field_l + param2.i((byte) -112).field_l) {
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
              var17 = ng.a(8, var9, (byte) 88, var8, var15, var10, var14, var13, var16, var11);
              if (var17 != -1 &&
                var17 > 10 &&
                var17 < 245) {
                var18 = var8 + (var17 * (var10 - var8) >> 8);
                var19 = var9 + ((var11 - var9) * var17 >> 8);
                param1.b(-10258, new gda(this, param3, param2, param5, var18, var19, var7_intLifetime1 >> 1, var12 >> 1));
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(byte param0, ShipBody param1) {
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
            !this.thrusterbehaviour.a(this.componentTypeId, (byte) -61)) {
            this.triggermap = 0;
            if (param1 instanceof Ship) {
              var3_int = param1.field_t;
              var4 = param1.field_o;
              var5 = param1.field_p;
              var6 = this.thrusterbehaviour.a(this.componentTypeId, false);
              param1.a(this.finaly, this.finalangle, this.finalx, var6, 1948934248);
              var7 = -var3_int + param1.field_t >> 8;
              var8 = param1.field_o - var4 >> 8;
              var9 = param1.field_p - var5;
              var10 = GetNumStars.a(param1.e(0), (byte) -119) >> 8;
              var11 = eu.a(param1.e(0), 114) >> 8;
              var12 = GameKeyHandler.a(22433, -2048 + param1.e(0));
              var13 = GetNumStars.a(var12, (byte) -78) >> 8;
              var14 = eu.a(var12, 96) >> 8;
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
              param1.field_t = var3_int;
              param1.field_p = var5;
              param1.field_o = var4;
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
            ((ThrusterBehaviour) (Object) stackIn_24_0).a(stackIn_25_1, 1024);
          } else {
            if (null != this.thrusterbehaviour) {
              this.thrusterbehaviour.a(param1 instanceof Ship, 1024);
              this.thrusterbehaviour.a(this.componentTypeId, param1, -24213);
            }
          }
          if (null != this.subcomponents) {
            for (var3_intLifetime1 = 0; this.subcomponents.length > var3_intLifetime1; var3_intLifetime1++) {
              this.subcomponents[var3_intLifetime1].a((byte) 115, param1);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    final void a(boolean param0, ShipComponent param1, World param2, int param3, ShipBody param4) {
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
                  var7 = GameKeyHandler.a(22433, var7 + 4096);
                }
                param1.a(param2, -19625, param4);
                var8 = new Debris(param1, param0);
                var8.dx = param4.dx;
                var8.dy = param4.dy;
                param2.a(var8, (byte) 37);
                if (!param0 &&
                  SetTorpedoAimspeed.field_o > 0) {
                  var8.a(var8.y, var7, var8.x, var8.e(false) * SetTorpedoAimspeed.field_o >> 8, 1948934248);
                }
                this.f(126, var6_int);
                param4.e((byte) 119);
              } else {
                this.subcomponents[var6_int].a(param0, param1, param2, 90, param4);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final boolean a(int param0, ShipComponent param1) {
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
              if (this.subcomponents[var3_int].a(param0 + 0, param1)) {
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3, int[] param4, boolean param5, int param6, int param7, int param8) {
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
            this.a((World) null, (byte) -46, (ShipBody) null);
          }
          this.a(param5, param0, 0, param3, param7, param2, param1, param8, param4);
          if (this.subcomponents != null) {
            if (this.subcomponents.length <= 0) {
              return;
            }
            var10_int = GetShipAimLines.field_o;
            var11 = GetCountermeasureLauncherRandomness.field_p;
            for (var12 = 0; this.subcomponents.length > var12; var12++) {
              this.subcomponents[var12].a(this.finaly, var11, param2, this.finalangle, param4, param5, 256, var10_int, this.finalx);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final boolean a(ShipComponent param0, int param1, ShipComponent param2, ShipComponent param3) {
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
          if (param3.componentTypeId == 22 && (param2.i((byte) -112).field_a == 2 ||
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final ShipComponent[] a(ShipComponent[] param0, byte param1) {
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
              param0 = (ShipComponent[]) (ija.a(this.subcomponents[var4], param0, 0, ii.field_d));
              param0 = this.subcomponents[var4].a(param0, (byte) -127);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          this.componentTypeId = param0.i(0, 6);
          if (!kv.a(false, param0)) {
            this.weaponbehaviour = null;
          } else {
            if (null == this.weaponbehaviour) {
              this.weaponbehaviour = new WeaponBehaviour();
            }
            this.weaponbehaviour.a(param0, false);
          }
          if (kv.a(false, param0)) {
            if (null == this.thrusterbehaviour) {
              this.thrusterbehaviour = new ThrusterBehaviour();
            }
            this.thrusterbehaviour.a(param0, param1);
          } else {
            this.thrusterbehaviour = null;
          }
          if (kv.a(param1, param0)) {
            if (this.grapplebehaviour == null) {
              this.grapplebehaviour = new GrappleLauncherBehaviour();
            }
            this.grapplebehaviour.a(param0, param1);
          } else {
            this.grapplebehaviour = null;
          }
          if (!kv.a(false, param0)) {
            this.behaviour = null;
          } else {
            if (null == this.behaviour) {
              var3_int = param0.i(0, 1);
              if (0 == var3_int) {
                this.behaviour = (ComponentBehaviour) ((Object) new mua());
              } else {
                if (var3_int == 1) {
                  this.behaviour = (ComponentBehaviour) ((Object) new kma());
                }
              }
              this.behaviour.a(param0, false);
            } else {
              this.behaviour.a(param0, false);
            }
          }
          this.subcomponents = (ShipComponent[]) (SetAutoDetail.a(5, ii.field_d, param0, 1, -85, this.subcomponents));
          this.hardpoints = (Hardpoint[]) (SetAutoDetail.a(5, ta.field_a, param0, 1, -63, this.hardpoints));
          this.a(0, param0);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean f(byte param0) {
        int var2;
        boolean stackIn_5_0 = false;
        var2 = 22 % ((param0 + 61) / 32);
        stackIn_5_0 = (null != this.weaponbehaviour) || (null != this.thrusterbehaviour);
        return stackIn_5_0;
    }

    final ShipComponent[] a(int param0, Random param1, ShipComponent[] param2) {
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
              var5 = hob.a(param1, 100, 122);
              if (GetBombletSprayReload.field_s > var5 &&
                this.subcomponents[var4_int].componentTypeId != 47) {
                this.subcomponents[var4_int].health = 0;
                param2 = (ShipComponent[]) (ija.a(this.subcomponents[var4_int], param2, 0, ii.field_d));
              } else {
                if (0 >= this.subcomponents[var4_int].health) {
                  this.subcomponents[var4_int].health = 1;
                }
              }
              param2 = this.subcomponents[var4_int].a(0, param1, param2);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final int c(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var3Lifetime1;
        var6 = VoidHunters.field_G;
        if (param1 != 0 &&
          this.c(112) > 0 &&
          this.health > 0) {
          var3 = 0;
          if (param1 > 0) {
            var3Lifetime1 = Math.abs(GameKeyHandler.a(22433, this.connectedangle - (-this.c(124) + this.currentconnectedangle)));
          } else {
            var3Lifetime1 = Math.abs(GameKeyHandler.a(22433, this.connectedangle - (this.c(-116) + this.currentconnectedangle)));
          }
          var4 = this.b((byte) 103);
          if (SetShipTeamAction.field_e == 1) {
            if (this.weaponbehaviour != null &&
              this.weaponbehaviour.a(true)) {
              var4 = 2048;
              this.weaponbehaviour.a(false, true);
            } else {
              return param1;
            }
          }
          var5 = Math.min(Math.min(var4, Math.abs(param1)), var3Lifetime1);
          if (param1 < 0) {
            var5 = -var5;
          }
          this.currentconnectedangle = GameKeyHandler.a(22433, var5 + this.currentconnectedangle);
          param1 = param1 - var5;
        }
        if (param0 <= -68) {
          return param1;
        }
        return -4;
    }

    private final int b(byte param0) {
        if (param0 != 103) {
          this.getFinalx(false);
        }
        if (this.behaviour != null) {
          return this.behaviour.b((byte) 118);
        }
        if (this.weaponbehaviour != null) {
          return this.weaponbehaviour.e((byte) -4);
        }
        if (null == this.grapplebehaviour) {
          return 0;
        }
        return this.grapplebehaviour.d((byte) 126);
    }

    public static void e(int param0) {
        field_l = (byte[][][]) null;
        if (param0 != 24388) {
          field_l = (byte[][][]) null;
        }
    }

    private final void c(boolean param0) {
        int var3 = 0;
        wfb var2;
        Hardpoint var4;
        int var5;
        int var7;
        ShipComponent var6;
        var7 = VoidHunters.field_G;
        var2 = hab.field_g[this.componentTypeId];
        this.finaloutline = new int[var2.field_v.length];
        if (!param0) {
          this.a((wfb) null, (byte) -94);
        }
        if (this.hardpoints != null) {
          for (var3 = 0; this.hardpoints.length > var3; var3++) {
            var4 = this.hardpoints[var3];
            var5 = var4.connectedComponentIdx;
            if (0 <= var5) {
              var6 = this.subcomponents[var5];
              this.a(var6, (byte) 83, this.i((byte) -112), var3);
              if (!var6.d((byte) -91)) {
                var6.h((byte) 42);
              }
            }
          }
        }
    }

    final void i(int param0) {
        int discarded$0 = 0;
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        int var2Lifetime1;
        if (this.subcomponents != null) {
          for (var2 = 0; this.subcomponents.length > var2; var2++) {
            this.subcomponents[var2].i(94);
          }
        }
        if (param0 < 93) {
          return;
        }
        if (this.a(true)) {
          var2Lifetime1 = GameKeyHandler.a(22433, this.connectedangle - this.currentconnectedangle);
          discarded$0 = this.c((byte) -105, var2Lifetime1);
        }
    }

    final qua a(boolean param0, ShipBody param1, int param2, int param3, int param4, int param5, ShipComponent param6, int param7) {
        qua stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        qua var11 = null;
        ShipComponent var12 = null;
        lsb var13 = null;
        Hardpoint var14 = null;
        ShipComponent var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        IntrusiveDeque var19 = null;
        Object var20 = null;
        fka var20_ref = null;
        int var21 = 0;
        lu var22 = null;
        lu var23 = null;
        var20 = null;
        var21 = VoidHunters.field_G;
        try {
          var22 = this.a(param7, false, param5, param2, param4, param6, -29866, (ShipBody) null);
          var23 = var22;
          if (var23 == null) {
            return null;
          }
          var10 = param1.e(0);
          var11 = new qua(var23);
          var12 = var23.field_b;
          var13 = var12.i((byte) -112).field_o[var22.field_e];
          var14 = var12.hardpoints[var22.field_e];
          var15 = param1.chassis;
          var16 = var13.field_a + var12.finalangle;
          if (null != var15.thrusterbehaviour) {
            var16 = GameKeyHandler.a(22433, var16 + 4096);
          }
          var17 = var15.b(-10) * GetNumStars.a(var10, (byte) -89) - var15.c((byte) 100) * eu.a(var10, 49) >> 16;
          var18 = var15.b(124) * eu.a(var10, param3 ^ -120) + var15.c((byte) 100) * GetNumStars.a(var10, (byte) -72) >> 16;
          var15.a(false, var14.worldx - var17, -var18 + var14.worldy, var16, param3 ^ param3, (int[]) null);
          var19 = new IntrusiveDeque();
          param6.a(var15, 0, 0, (byte) -126, var19);
          if (var19.c(3) > 0) {
            var20_ref = (fka) (var19.d(0));
            while (var20_ref != null) {
              if (var20_ref.field_e > 255 &&
                !this.a(param6, -23, var20_ref.field_f, var20_ref.field_d) &&
                !this.a(param6, -23, var20_ref.field_d, var20_ref.field_f) && (var15 != var20_ref.field_d ||
                null == var15.thrusterbehaviour ||
                var20_ref.field_f != var23.field_b)) {
                var11.a((byte) 108, var20_ref.field_f);
              }
              var20_ref = (fka) (var19.a((byte) 112));
            }
          }
          if (var14.connectedComponentIdx != -1) {
            var11.a((byte) 108, var12.subcomponents[var14.connectedComponentIdx]);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param7).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
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
              !this.weaponbehaviour.a((byte) 87, var5.weaponbehaviour))) {
              stackIn_14_0 = (var5.thrusterbehaviour != null) ? 0 : 1;
              if (null != this.thrusterbehaviour) {
                stackIn_17_1 = 0;
              } else {
                stackIn_17_1 = 1;
              }
              if ((stackIn_14_0 ^ stackIn_17_1) == 0 && (this.thrusterbehaviour == null ||
                !this.thrusterbehaviour.a((byte) 117, var5.thrusterbehaviour))) {
                stackIn_24_0 = (this.grapplebehaviour != null) ? 0 : 1;
                if (var5.grapplebehaviour != null) {
                  stackIn_27_1 = 0;
                } else {
                  stackIn_27_1 = 1;
                }
                if ((stackIn_24_0 ^ stackIn_27_1) == 0 && (this.grapplebehaviour == null ||
                  !this.grapplebehaviour.a((byte) 90, var5.grapplebehaviour))) {
                  stackIn_34_0 = (this.behaviour != null) ? 0 : 1;
                  if (null != var5.behaviour) {
                    stackIn_37_1 = 0;
                  } else {
                    stackIn_37_1 = 1;
                  }
                  if ((stackIn_34_0 ^ stackIn_37_1) == 0 && (this.behaviour == null ||
                    this.behaviour.getClass() == var5.behaviour.getClass()) && (null == this.behaviour ||
                    !this.behaviour.a((byte) -80, var5.behaviour)) && (!SetCountermeasureLauncherAimspeed.a(var5.subcomponents, false, 1, this.subcomponents, 125) &&
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    private final ShipComponent a(int param0, byte param1, int param2) {
        int var4 = 15 & param2 >> param0 * 4;
        if (param1 >= -50) {
          this.b(20);
        }
        if (var4 != 0) {
          if (null == this.subcomponents) {
            return null;
          }
          if (this.subcomponents.length < var4) {
            return null;
          }
          return this.subcomponents[var4 - 1].a(param0 + 1, (byte) -73, param2);
        }
        return this;
    }

    final void h(int param0) {
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
            this.subcomponents[var2].h(89);
          }
        }
    }

    private final int a(Ship param0, int param1) {
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
            stackIn_9_0 = this.thrusterbehaviour.c(0);
            return stackIn_9_0;
          }
          if (null == this.behaviour) {
            stackIn_14_0 = 0;
            return stackIn_14_0;
          }
          stackIn_12_0 = this.behaviour.a(param1 ^ 10317, param0);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final int e(byte param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (param0 != -86) {
          this.j((byte) 13);
        }
        int var2 = this.i((byte) -112).field_u;
        if (null != this.subcomponents) {
          for (var3 = 0; this.subcomponents.length > var3; var3++) {
            var2 = var2 + this.subcomponents[var3].e((byte) -86);
          }
        }
        return var2;
    }

    final int c(int param0) {
        int var2 = 17 / ((56 - param0) / 56);
        if (null == this.behaviour) {
          if (null != this.weaponbehaviour) {
            return this.weaponbehaviour.d((byte) 120);
          }
          if (this.grapplebehaviour == null) {
            return 0;
          }
          return this.grapplebehaviour.a((byte) 12);
        }
        return this.behaviour.a((byte) -114);
    }

    final void a(Projectile param0, sfa param1, int param2) {
        int var4_int = 0;
        int var5 = VoidHunters.field_G;
        if (this.subcomponents != null) {
          for (var4_int = 0; this.subcomponents.length > var4_int; var4_int++) {
            this.subcomponents[var4_int].a(param0, param1, -1);
            if (param1.a((byte) -61)) {
              return;
            }
          }
        }
        if (~this.health >= param2) {
          return;
        }
        try {
          param0.a(24158, this, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ml.N(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(Projectile param0, tpb param1, int param2) {
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
              this.subcomponents[var4_int].a(param0, param1, 0);
            }
          }
          if (param2 >= this.health) {
            return;
          }
          var4_intLifetime1 = param0.a(this, 3);
          if (param1.field_a > var4_intLifetime1) {
            param1.field_a = var4_intLifetime1;
            param1.field_b = this;
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6;
        boolean stackIn_14_0 = false;
        var6 = VoidHunters.field_G;
        if (this.subcomponents != null) {
          for (var5 = 0; var5 < this.subcomponents.length; var5++) {
            if (this.subcomponents[var5].b(32609, param1, param2, param3)) {
              return true;
            }
          }
        }
        if (param0 != 32609) {
          this.a(false, (byte) 89, (World) null, (ShipBody) null);
        }
        stackIn_14_0 = (ujb.a((byte) -57, this.finaloutline, param3, param1, param2)) && (this.health < this.i((byte) -112).field_p);
        return stackIn_14_0;
    }

    final int a(wfb param0, byte param1) {
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
          stackIn_3_0 = this.finalx + (param0.field_b * GetNumStars.a(this.finalangle, (byte) -99) - param0.field_i * eu.a(this.finalangle, 84) >> 16);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(int param0, int param1) {
        ShipComponent[] var5 = null;
        ShipComponent[] var3_ref_ml__ = null;
        int incrementValue$0 = 0;
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (null != this.weaponbehaviour) {
          if (param1 >= GetPointDefenceLaserProjectileInterceptDamage.field_q.length) {
            var5 = new ShipComponent[GetPointDefenceLaserProjectileInterceptDamage.field_q.length + 1];
            var3_ref_ml__ = var5;
            cua.a(GetPointDefenceLaserProjectileInterceptDamage.field_q, 0, var3_ref_ml__, 0, GetPointDefenceLaserProjectileInterceptDamage.field_q.length);
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
            param1 = this.subcomponents[var3].b(126, param1);
          }
        }
        return param1;
    }

    final void a(IntrusiveDeque param0, ShipComponent param1, int param2, byte param3, int param4) {
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
              this.subcomponents[var6_int].a(param0, param1, 1 + var6_int << param4 * 4 | param2, (byte) 122, param4 + 1);
            }
          }
          param1.a(0, param0, this, param2, 0, 0);
          if (param3 < 117) {
            this.c(38, 37, -84, -122);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(int param0, World param1, ShipBody param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param1, 0, false, param2);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (null != this.thrusterbehaviour && !this.thrusterbehaviour.a(this.componentTypeId, (byte) -61) &&
          0 < this.health) {
          return 1;
        }
        if (this.subcomponents != null) {
          var2 = 0;
          for (var3 = 0; this.subcomponents.length > var3; var3++) {
            var2 = var2 + this.subcomponents[var3].l(-8913);
          }
          return var2;
        }
        if (param0 != -8913) {
          this.a(31, 93, (World) null, (ShipBody) null);
          return 0;
        }
        return 0;
    }

    final void c(int param0, int param1, int param2, int param3) {
        this.connectionpointy = param3;
        this.connectedangle = param0;
        this.connectionpointx = param1;
        if (param2 != 56) {
          this.hardpoints = (Hardpoint[]) null;
        }
    }

    final int j(byte param0) {
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
            var5 = this.subcomponents[var4].j((byte) 57);
            if (var5 > var3) {
              var3 = var5;
            }
          }
          var2 = var2 + var3;
        }
        return var2;
    }

    public final void a(faa param0, int param1) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          this.componentTypeId = param0.i(0, 6);
          this.triggermap = param0.i(0, 32);
          this.connectionpointx = param0.i(param1 - 32, 32);
          this.connectionpointy = param0.i(param1 - 32, param1);
          if (!kv.a(false, param0)) {
            this.weaponbehaviour = null;
          } else {
            if (this.weaponbehaviour == null) {
              this.weaponbehaviour = new WeaponBehaviour();
            }
            this.weaponbehaviour.a(param0, false);
          }
          if (kv.a(false, param0)) {
            if (this.thrusterbehaviour == null) {
              this.thrusterbehaviour = new ThrusterBehaviour();
            }
            this.thrusterbehaviour.a(param0, false);
          } else {
            this.thrusterbehaviour = null;
          }
          if (kv.a(false, param0)) {
            if (null == this.grapplebehaviour) {
              this.grapplebehaviour = new GrappleLauncherBehaviour();
            }
            this.grapplebehaviour.a(param0, false);
          } else {
            this.grapplebehaviour = null;
          }
          if (!kv.a(false, param0)) {
            this.behaviour = null;
          } else {
            if (null == this.behaviour) {
              var3_int = param0.i(0, 1);
              if (var3_int != 0) {
                if (var3_int == 1) {
                  this.behaviour = (ComponentBehaviour) ((Object) new kma());
                }
              } else {
                this.behaviour = (ComponentBehaviour) ((Object) new mua());
              }
            }
            this.behaviour.a(param0, false);
          }
          this.subcomponents = (ShipComponent[]) (GetAutoAfkTimeout.a(127, 1, this.subcomponents, ii.field_d, 5, param0));
          this.hardpoints = (Hardpoint[]) (GetAutoAfkTimeout.a(param1 ^ 93, 1, this.hardpoints, ta.field_a, 5, param0));
          this.connectedangle = param0.i(0, 32);
          this.currentconnectedangle = uwa.a(14, param0, (byte) 20);
          this.health = param0.i(0, 32);
          this.finalx = param0.i(0, 32);
          this.finaly = param0.i(0, 32);
          this.finalangle = param0.i(0, 32);
          this.finaloutline = wkb.a((byte) 37, this.finaloutline, param0, 8);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(')').toString());
        }
    }

    final void d(boolean param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (this.health <= 0) {
          this.health = 1;
        }
        if (null != this.subcomponents) {
          for (var2 = 0; this.subcomponents.length > var2; var2++) {
            this.subcomponents[var2].d(param0);
          }
        }
        if (param0) {
          this.a(-20, (IntrusiveDeque) null, (ShipComponent) null, 126, 9, -78);
        }
    }

    final ShipComponent c(int param0, int param1) {
        if (param1 >= -83) {
          this.f(5);
        }
        return this.a(0, (byte) -62, param0);
    }

    private final void f(int param0, int param1) {
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
          cua.a(this.subcomponents, 0, var3, 0, param1);
          if (-1 + this.subcomponents.length > param1) {
            cua.a(this.subcomponents, 1 + param1, var3, param1, var7.length - param1);
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

    final ShipComponent a(int param0, int param1, boolean param2) {
        int var4 = 0;
        ShipComponent var5 = null;
        int var6 = VoidHunters.field_G;
        if (this.subcomponents != null) {
          for (var4 = 0; var4 < this.subcomponents.length; var4++) {
            var5 = this.subcomponents[var4].a(param0, param1, param2);
            if (var5 != null) {
              return var5;
            }
          }
        }
        if (fra.a(this.finaloutline, param0, 2, param1)) {
          return this;
        }
        if (param2) {
          return null;
        }
        this.a(-9);
        return null;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int[] param5) {
        int discarded$0 = 0;
        int var7_int = 0;
        int var8 = 0;
        try {
          if (param4 != 0) {
            discarded$0 = this.c((byte) 99, 116);
          }
          var7_int = GetNumStars.a(param3, (byte) 35);
          var8 = eu.a(param3, 86);
          this.a(param2, var8, param0, param3, param5, false, 256, var7_int, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ml.OA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(byte param0, tv param1) {
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
            this.weaponbehaviour.b((byte) 110, var5.weaponbehaviour);
          }
          if (this.thrusterbehaviour != null) {
            if (var5.thrusterbehaviour == null) {
              var5.thrusterbehaviour = new ThrusterBehaviour();
            }
            this.thrusterbehaviour.b((byte) 117, var5.thrusterbehaviour);
          } else {
            var5.thrusterbehaviour = null;
          }
          if (null != this.grapplebehaviour) {
            if (null == var5.grapplebehaviour) {
              var5.grapplebehaviour = new GrappleLauncherBehaviour();
            }
            this.grapplebehaviour.b((byte) 55, var5.grapplebehaviour);
          } else {
            var5.grapplebehaviour = null;
          }
          if (this.behaviour != null) {
            if (var5.behaviour == null ||
              var5.behaviour.getClass() != this.behaviour.getClass()) {
              if (this.behaviour.getClass() == mua.class) {
                var5.behaviour = (ComponentBehaviour) ((Object) new mua());
              } else {
                if (this.behaviour.getClass() == kma.class) {
                  var5.behaviour = (ComponentBehaviour) ((Object) new kma());
                }
              }
            }
            this.behaviour.b((byte) 78, var5.behaviour);
          } else {
            var5.behaviour = null;
          }
          var5.subcomponents = (ShipComponent[]) (sqb.a(var5.subcomponents, this.subcomponents, 1, ii.field_d, false));
          var5.hardpoints = (Hardpoint[]) (sqb.a(var5.hardpoints, this.hardpoints, 1, ta.field_a, false));
          var5.connectedangle = this.connectedangle;
          var5.finalangle = this.finalangle;
          var5.finalx = this.finalx;
          var5.currentconnectedangle = this.currentconnectedangle;
          var5.finaly = this.finaly;
          var5.health = this.health;
          if (param0 <= 54) {
            field_l = (byte[][][]) null;
          }
          var5.finaloutline = SetTeamSelectionSpeedup.a(var5.finaloutline, (byte) -94, this.finaloutline);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1) {
        this.triggermap = param1;
        int var3 = -97 / ((param0 - 58) / 33);
    }

    private final boolean d(int param0) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = -112 / ((param0 - 25) / 51);
        stackIn_4_0 = (this.weaponbehaviour != null) && (this.weaponbehaviour.a((byte) 24).b((byte) 127) > 0);
        return stackIn_4_0;
    }

    final void a(ShipComponent param0, int param1, int param2, byte param3, IntrusiveDeque param4) {
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
              this.subcomponents[var6_int].a(param0, 1 + var6_int << param2 * 4 | param1, 1 + param2, (byte) -126, param4);
            }
          }
          param0.a((byte) -53, 0, param1, param4, 0, this);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final Debris a(World param0, int param1, int param2, ShipBody param3, byte param4) {
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
              var8 = var7.a(param0, param1, param2, param3, (byte) 106);
              if (var8 != null) {
                stackIn_6_0 = var8;
                return stackIn_6_0;
              }
              if (!fra.a(var7.finaloutline, param2, 2, param1)) {
                var6_int++;
                continue;
              }
              var7.a(param0, -19625, param3);
              var9 = new Debris(var7, false);
              param0.a(var9, (byte) 124);
              this.f(121, var6_int);
              param3.e((byte) 119);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    final int g(int param0, int param1) {
        if (param1 != 3) {
          return 111;
        }
        return this.a(false, false, param0);
    }

    final void a(int param0, int param1, ShipBody param2, int param3, int param4, World param5) {
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
            this.a(param2, param0, param5, param3, 90, 256);
          }
          if (this.subcomponents != null) {
            for (var7_int = 0; this.subcomponents.length > var7_int; var7_int++) {
              this.subcomponents[var7_int].a(param0, 7834, param2, param3, param4, param5);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (this.thrusterbehaviour != null) {
          this.thrusterbehaviour.a(false);
        }
        if (param0 != 14546) {
          return;
        }
        if (null != this.subcomponents) {
          for (var2 = 0; var2 < this.subcomponents.length; var2++) {
            this.subcomponents[var2].f(param0 + 0);
          }
        }
    }

    final ShipComponent d(int param0, int param1) {
        if (param1 != 692) {
          this.b(48, 1, -93, 81);
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

    final void a(ShipComponent param0, int param1, int param2, int param3, int param4, int param5, IntrusiveDeque param6, int param7, int param8) {
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
              this.subcomponents[var10_int].a(param0, param1, var10_int + 1 << param4 * 4 | param2, param3, 1 + param4, param5, param6, param7 ^ 0, param8);
            }
          }
          if (ujb.a((byte) -57, this.finaloutline, param3, param1, param5)) {
            param6.b(-10258, new gda(this, param2, param0, param8, param3, param1, 0, 0));
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final int a(int param0, int param1, int param2) {
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
        var4 = this.i((byte) -112).field_u;
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
            var7 = var7 + this.subcomponents[var13].a(-921054591, param1, param2);
            if (var9Lifetime1 > var7) {
              var7 = 2147483647;
            }
            var13++;
          }
        }
        return var7;
    }

    final int a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        int var7;
        int var8;
        int var9;
        int var10;
        wfb var10_ref_wfb;
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
        if (fra.field_a == 1 &&
          null != this.weaponbehaviour &&
          this.weaponbehaviour.b(true) &&
          !param1) {
          return 0;
        }
        var7 = 0;
        if (param4 != 21750) {
          this.grapplebehaviour = (GrappleLauncherBehaviour) null;
        }
        var8 = Math.abs(GameKeyHandler.a(param4 + 683, this.connectedangle + (-this.c(127) - this.currentconnectedangle)));
        param2 = param2 + var8;
        var9 = Math.abs(GameKeyHandler.a(param4 + 683, this.connectedangle + (this.c(param4 ^ 21639) - this.currentconnectedangle)));
        if (param2 >= 8192) {
          param2 = 8191;
        }
        param5 = param5 + var9;
        if (8192 <= param5) {
          param5 = 8191;
        }
        boolean decompiledFrameRemainder0 = true;
        if (!this.a(true) &&
          !param1) {
          if ((this.subcomponents != null)) {
            var7 = 0;
            var10 = 0;
            var18 = 0;
            var11 = var18;
            while (this.subcomponents.length > var18) {
              var12 = this.subcomponents[var18].a(param0, false, param2, param3, 21750, param5);
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
          var10_ref_wfb = this.i((byte) -112);
          var11Lifetime1 = this.a(var10_ref_wfb, (byte) -69);
          var12Lifetime1 = this.a(-86, var10_ref_wfb);
          var13 = param0 - var11Lifetime1;
          var14 = param3 - var12Lifetime1;
          var15 = ecb.a(var14, (byte) -77, var13);
          if (this.d(-77)) {
            var16 = GameKeyHandler.a(param4 ^ 855, GameKeyHandler.a(22433, -this.currentconnectedangle + this.finalangle) + this.connectedangle);
            var7 = GameKeyHandler.a(22433, var15 - var16);
          } else {
            var7 = GameKeyHandler.a(22433, -this.finalangle + var15);
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
        var7 = this.c((byte) -105, var7);
        return var7;
    }

    public final void a(faa param0, byte param1) {
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        faa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        boolean stackIn_14_2 = false;
        faa stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        boolean stackIn_19_2 = false;
        int stackIn_30_0 = 0;
        faa stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        boolean stackIn_36_2 = false;
        int stackIn_44_0 = 0;
        faa stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        boolean stackIn_51_2 = false;
        int stackIn_57_0 = 0;
        int stackIn_58_1 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa var3 = null;
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
        faa var3Lifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        var9 = VoidHunters.field_G;
        try {
          param0.a(-632, this.componentTypeId, 6);
          param0.a(-632, this.triggermap, 32);
          param0.a(-632, this.connectionpointx, 32);
          param0.a(-632, this.connectionpointy, 32);
          stackIn_3_0 = (faa) (param0);
          stackIn_3_1 = 74;
          stackIn_4_2 = (this.weaponbehaviour != null);
          if (vq.a(stackIn_3_0, stackIn_3_1, stackIn_4_2)) {
            this.weaponbehaviour.b(param0, -125);
          }
          stackIn_8_0 = (faa) (param0);
          stackIn_8_1 = 104;
          stackIn_9_2 = (null != this.thrusterbehaviour);
          if (vq.a(stackIn_8_0, stackIn_8_1, stackIn_9_2)) {
            this.thrusterbehaviour.b(param0, -125);
          }
          stackIn_13_0 = (faa) (param0);
          stackIn_13_1 = -93;
          stackIn_14_2 = (this.grapplebehaviour != null);
          if (vq.a(stackIn_13_0, stackIn_13_1, stackIn_14_2)) {
            this.grapplebehaviour.b(param0, -115);
          }
          stackIn_18_0 = (faa) (param0);
          stackIn_18_1 = 54;
          stackIn_19_2 = (null != this.behaviour);
          if (vq.a(stackIn_18_0, stackIn_18_1, stackIn_19_2)) {
            if (this.behaviour.getClass() != mua.class) {
              if (this.behaviour.getClass() == kma.class) {
                param0.a(-632, 1, 1);
              }
            } else {
              param0.a(-632, 0, 1);
            }
            this.behaviour.b(param0, -127);
          }
          var3 = param0;
          var4 = this.subcomponents;
          if (var4 == null) {
            stackIn_30_0 = 0;
          } else {
            stackIn_30_0 = var4.length;
          }
          var5 = stackIn_30_0;
          var3.a(-632, var5, 5);
          if (0 != var5) {
            var11 = var4;
            for (var7 = 0; var11.length > var7; var7++) {
              var8 = var11[var7];
              stackIn_35_0 = var3;
              stackIn_35_1 = -97;
              stackIn_36_2 = (var8 != null);
              if (vq.a(stackIn_35_0, stackIn_35_1, stackIn_36_2)) {
                ((utb) ((Object) var8)).a(var3, (byte) -122);
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
          var3Lifetime1.a(-632, var5Lifetime1, 5);
          if (0 != var5Lifetime1) {
            var12 = var4_array;
            var10 = 0;
            var7Lifetime1 = var10;
            while (var12.length > var10) {
              var8_ref = var12[var10];
              stackIn_50_0 = var3Lifetime1;
              stackIn_50_1 = 120;
              stackIn_51_2 = (var8_ref != null);
              if (vq.a(stackIn_50_0, stackIn_50_1, stackIn_51_2)) {
                ((utb) ((Object) var8_ref)).a(var3Lifetime1, (byte) -93);
              }
              var10++;
            }
          }
          param0.a(-632, this.connectedangle, 32);
          param0.a(-632, this.currentconnectedangle, 14);
          param0.a(-632, this.health, 32);
          param0.a(-632, this.finalx, 32);
          param0.a(-632, this.finaly, 32);
          param0.a(-632, this.finalangle, 32);
          stackIn_57_0 = 8;
          if (this.finaloutline == null) {
            stackIn_58_1 = 0;
          } else {
            stackIn_58_1 = this.finaloutline.length;
          }
          pgb.a(stackIn_57_0, stackIn_58_1, -96, param0, this.finaloutline);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param1).append(')').toString());
        }
    }

    final int b(int param0) {
        int var2 = 32 % ((param0 - 89) / 35);
        return this.i((byte) -112).field_b;
    }

    private final boolean a(boolean param0) {
        if (this.behaviour != null &&
          this.behaviour.a(0)) {
          return true;
        }
        if (null != this.weaponbehaviour &&
          this.weaponbehaviour.d(6)) {
          return true;
        }
        if (this.grapplebehaviour != null &&
          this.grapplebehaviour.b((byte) -113)) {
          return true;
        }
        if (!param0) {
          this.a((IntrusiveDeque) null, (Ship) null, -20);
        }
        return false;
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int[] param8) {
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
        wfb var40 = null;
        int var41 = 0;
        wfb var42 = null;
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
          this.finalangle = GameKeyHandler.a(stackIn_3_1, stackIn_3_2 + stackIn_4_3);
          var40 = this.i((byte) -112);
          var42 = var40;
          var11 = (long)var42.field_b;
          var13 = (long)var42.field_i;
          var15 = GetNumStars.a(this.finalangle, (byte) -97);
          var16 = eu.a(this.finalangle, 123);
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
          var27 = this.a(param5, var42, true);
          if (var27 != param2) {
            var25 = var27 * var15 >> 16;
            var26 = var16 * var27 >> 16;
          }
          for (var28 = 0; var28 < var42.field_v.length; var28 += 2) {
            var29 = (long)var40.field_v[var28];
            var31 = (long)var40.field_v[var28 + 1];
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
              this.hardpoints[var41].a(var16, this.finalx, this.finaly, var15, param2 ^ -665140432, var40.field_o[var41].field_b, var40.field_o[var41].field_c);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(')').toString());
        }
    }

    private final void a(Random param0, World param1, int param2, byte param3, int param4, ShipBody param5) {
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
          this.subcomponents[param4].a(param1, -19625, param5);
          if (param3 != 97) {
            this.currentconnectedangle = 117;
          }
          var13 = new Debris(this.subcomponents[param4], false);
          var8 = var13.d(false) - this.finalx;
          var9 = var13.g((byte) 126) - this.finaly;
          VariableCondition.a(this.finalx + var8, this.finaly + var9, this.finaly, this.finalx, (byte) -54);
          var10 = ar.a(var8, (byte) 110, var9);
          if (0 == var10) {
            var10 = 1;
          }
          var11 = ecb.a(var9, (byte) -77, var8);
          var12 = param2 * var13.e(false) / var10;
          if (param5 != null) {
            var13.dy = param5.dy;
            var13.dx = param5.dx;
          }
          var13.a(this.finaly, GameKeyHandler.a(22433, -100 + (var11 + hob.a(param0, 200, 118))), this.finalx, var12, 1948934248);
          param1.a(var13, (byte) 50);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final ShipComponent[] a(int param0, ShipComponent[] param1, int param2) {
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
            !this.thrusterbehaviour.a(this.componentTypeId, (byte) -61) &&
            this.health > 0) {
            param1 = (ShipComponent[]) (ija.a(this, param1, 0, ii.field_d));
          }
          if (param0 != 0) {
            this.currentconnectedangle = 84;
          }
          if (null != this.subcomponents) {
            for (var4_int = 0; this.subcomponents.length > var4_int; var4_int++) {
              param1 = this.subcomponents[var4_int].a(param0 + 0, param1, param2);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        int var3 = param1;
        if (this.subcomponents != null) {
          for (var4 = 0; this.subcomponents.length > var4; var4++) {
            var3 = var3 + this.subcomponents[var4].a(param0, 0);
          }
        }
        if (param0 == this.componentTypeId) {
          var3++;
        }
        return var3;
    }

    final void a(int[] param0, byte param1, boolean param2) {
        int var4_int = 0;
        int var5 = VoidHunters.field_G;
        try {
          if (param1 != -17) {
            this.thrusterbehaviour = (ThrusterBehaviour) null;
          }
          param0[0] = param0[0] + this.health;
          param0[1] = param0[1] + this.i((byte) -112).field_p;
          if (param2 &&
            null != this.subcomponents) {
            for (var4_int = 0; var4_int < this.subcomponents.length; var4_int++) {
              this.subcomponents[var4_int].a(param0, (byte) -17, param2);
            }
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ml.EC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final wfb i(byte param0) {
        if (param0 != -112) {
          return (wfb) null;
        }
        return hab.field_g[this.componentTypeId];
    }

    public final void b(faa param0, int param1) {
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        faa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_10_2 = false;
        faa stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        boolean stackIn_15_2 = false;
        faa stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean stackIn_21_2 = false;
        int stackIn_31_0 = 0;
        faa stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        boolean stackIn_37_2 = false;
        int stackIn_46_0 = 0;
        faa stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        boolean stackIn_52_2 = false;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa var3 = null;
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
        faa var3Lifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        var9 = VoidHunters.field_G;
        try {
          param0.a(-632, this.componentTypeId, 6);
          stackIn_3_0 = (faa) (param0);
          stackIn_3_1 = -55;
          stackIn_4_2 = (this.weaponbehaviour != null);
          if (vq.a(stackIn_3_0, stackIn_3_1, stackIn_4_2)) {
            this.weaponbehaviour.b(param0, -114);
          }
          stackIn_9_0 = (faa) (param0);
          stackIn_9_1 = 62;
          stackIn_10_2 = (null != this.thrusterbehaviour);
          if (vq.a(stackIn_9_0, stackIn_9_1, stackIn_10_2)) {
            this.thrusterbehaviour.b(param0, -123);
          }
          stackIn_14_0 = (faa) (param0);
          stackIn_14_1 = 113;
          stackIn_15_2 = (this.grapplebehaviour != null);
          if (vq.a(stackIn_14_0, stackIn_14_1, stackIn_15_2)) {
            this.grapplebehaviour.b(param0, -115);
          }
          stackIn_20_0 = (faa) (param0);
          stackIn_20_1 = -98;
          stackIn_21_2 = (null != this.behaviour);
          if (vq.a(stackIn_20_0, stackIn_20_1, stackIn_21_2)) {
            if (this.behaviour.getClass() != mua.class) {
              if (this.behaviour.getClass() == kma.class) {
                param0.a(-632, 1, 1);
              }
            } else {
              param0.a(-632, 0, 1);
            }
            this.behaviour.b(param0, -110);
          }
          var3 = param0;
          var4 = this.subcomponents;
          if (var4 != null) {
            stackIn_31_0 = var4.length;
          } else {
            stackIn_31_0 = 0;
          }
          var5 = stackIn_31_0;
          var3.a(-632, var5, 5);
          if (var5 != 0) {
            var11 = var4;
            for (var7 = 0; var11.length > var7; var7++) {
              var8 = var11[var7];
              stackIn_36_0 = var3;
              stackIn_36_1 = 113;
              stackIn_37_2 = (var8 != null);
              if (vq.a(stackIn_36_0, stackIn_36_1, stackIn_37_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var3, var8);
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
          var3Lifetime1.a(-632, var5Lifetime1, 5);
          if (var5Lifetime1 != 0) {
            var12 = var4_array;
            var10 = 0;
            var7Lifetime1 = var10;
            while (var10 < var12.length) {
              var8_ref = var12[var10];
              stackIn_51_0 = var3Lifetime1;
              stackIn_51_1 = 53;
              stackIn_52_2 = (var8_ref != null);
              if (vq.a(stackIn_51_0, stackIn_51_1, stackIn_52_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var3Lifetime1, var8_ref);
              }
              var10++;
            }
          }
          this.b(param0, (byte) 63);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(World param0, byte param1, ShipBody param2) {
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
              var5.a(param0, (byte) -111, param2);
              var4_int--;
              this.a(false, var5, param0, param1 + 234, param2);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final int[] a(int[] param0, int param1, int[][] param2, int param3) {
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(int param0, wfb param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -106 % ((-24 - param0) / 56);
          stackIn_1_0 = this.finaly + (param1.field_b * eu.a(this.finalangle, 62) + param1.field_i * GetNumStars.a(this.finalangle, (byte) -119) >> 16);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final boolean b(byte param0, int param1) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (param0 < 39) {
          this.weaponbehaviour = (WeaponBehaviour) null;
        }
        if (param1 == this.i((byte) -112).b(-1) &&
          !this.k((byte) 69)) {
          return true;
        }
        if (this.subcomponents != null) {
          for (var3 = 0; var3 < this.subcomponents.length; var3++) {
            if (this.subcomponents[var3].b((byte) 118, param1)) {
              return true;
            }
          }
        }
        return false;
    }

    private final void a(byte param0, ShipComponent param1) {
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
            this.a(-81, false, 28, -34, 8, (ShipComponent) null, 106, (ShipBody) null);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    ShipComponent() {
    }

    final int g(byte param0) {
        if (param0 != -127) {
          this.finaloutline = (int[]) null;
        }
        return GameKeyHandler.a(22433, this.finalangle - this.currentconnectedangle + this.connectedangle);
    }

    final int getFinalx(boolean param0) {
        if (!param0) {
          return -24;
        }
        return this.finalx;
    }

    final int a(int param0) {
        int var3 = 0;
        int var4 = VoidHunters.field_G;
        if (param0 != 0) {
          this.a(45, 20, true, -45, (int[]) null, false, 77, -58, 36);
        }
        int var2 = this.i((byte) -112).field_n;
        if (this.subcomponents != null) {
          for (var3 = 0; this.subcomponents.length > var3; var3++) {
            var2 = var2 + this.subcomponents[var3].a(param0 ^ 0);
          }
        }
        return var2;
    }

    final void h(byte param0) {
        if (param0 != 42) {
          this.finaly = 90;
        }
        this.currentconnectedangle = this.connectedangle;
    }

    final void a(boolean param0, World param1, ShipBody param2, byte param3) {
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
        wfb var18 = null;
        int var11Lifetime1;
        var17 = VoidHunters.field_G;
        try {
          qba.a(20382, this.finalx, 65, this.finaly, 10);
          var18 = this.i((byte) -112);
          var6 = Math.min(var18.field_p / var18.field_z + this.j(1), 1000);
          if (param3 > -53) {
            this.currentconnectedangle = -111;
          }
          var7 = param2.dx;
          var8 = param2.dy;
          var9 = kmb.field_f * this.i((byte) -112).field_h >> 8;
          var10 = new Random((long)this.finalx);
          if (null != this.subcomponents &&
            param0) {
            for (var11 = 0; this.subcomponents.length > var11; var11++) {
              this.a(var10, param1, var9, (byte) 97, var11, param2);
            }
          }
          var11Lifetime1 = 3;
          if (param2 instanceof Ship) {
            var11Lifetime1 = ((Ship) (param2)).getTeam((byte) 71);
            param2 = null;
          }
          param1.a(var11Lifetime1, var8, 100, 50, 1000, var6 << 1, var7, this.finaloutline, (byte) 84);
          if (param2 != null) {
            var12 = param2.d(false) - this.finalx;
            var13 = param2.g((byte) -21) - this.finaly;
            VariableCondition.a(this.finalx + var12, this.finaly + var13, this.finaly, this.finalx, (byte) -54);
            var14 = ar.a(var12, (byte) 120, var13);
            if (var14 == 0) {
              var14 = 1;
            }
            var15 = ecb.a(var13, (byte) -77, var12);
            var16 = param2.e(false) * var9 / var14;
            param2.a(this.finaly, GameKeyHandler.a(22433, -100 + (var15 + hob.a(var10, 200, 123))), this.finalx, var16, 1948934248);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, World param2, lta param3) {
        int var5_int = 0;
        int var6 = VoidHunters.field_G;
        try {
          if (this.thrusterbehaviour != null) {
            this.thrusterbehaviour.a((byte) -116, param1, param3, this.finaloutline);
          }
          if (null != this.grapplebehaviour) {
            this.grapplebehaviour.a(this.finalangle, param3, this.i((byte) -112).field_v, this.finaly, param2, this.finalx, param0 + 110);
          }
          if (param0 != 0) {
            this.d(34, -81);
          }
          if (this.subcomponents != null) {
            for (var5_int = 0; var5_int < this.subcomponents.length; var5_int++) {
              this.subcomponents[var5_int].a(0, param1, param2, param3);
            }
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ml.JB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(ShipComponent param0, byte param1, wfb param2, int param3) {
        int var5_int = 0;
        try {
          if (param1 <= 25) {
            this.subcomponents = (ShipComponent[]) null;
          }
          var5_int = param2.field_o[param3].field_a;
          if (null != param0.thrusterbehaviour) {
            var5_int = GameKeyHandler.a(22433, 4096 + var5_int);
          }
          param0.c(var5_int, param2.field_o[param3].field_b, 56, param2.field_o[param3].field_c);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "ml.PC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, ShipComponent param2) {
        wfb var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          this.a((byte) 73, param2);
          this.hardpoints[param1].connectedComponentIdx = -1 + this.subcomponents.length;
          var4 = this.i((byte) -112);
          this.a(param2, (byte) 115, var4, param1);
          if (param0 != 1) {
            this.a((ShipComponent[]) null, (byte) 63);
            param2.h((byte) 42);
          } else {
            param2.h((byte) 42);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    ShipComponent(int param0) {
        int var3 = 0;
        wfb var2;
        this.componentTypeId = param0;
        var2 = hab.field_g[this.componentTypeId];
        if (null != var2.field_c) {
          this.weaponbehaviour = new WeaponBehaviour();
          var2.field_c.b((byte) 94, this.weaponbehaviour);
          if (var2.b(-1) == -1 &&
            !var2.field_c.a((byte) 24).e(-3)) {
            this.a((byte) 124, 16);
          }
        }
        if (var2.field_e == null) {
          if (null != var2.field_g) {
            this.behaviour = (ComponentBehaviour) ((Object) new mua());
            var2.field_g.b((byte) 56, this.behaviour);
          }
        } else {
          this.behaviour = (ComponentBehaviour) ((Object) new kma());
          var2.field_e.b((byte) 64, this.behaviour);
        }
        if (null != var2.field_t) {
          this.thrusterbehaviour = new ThrusterBehaviour();
          var2.field_t.b((byte) 92, this.thrusterbehaviour);
        }
        if (null != var2.field_x) {
          this.grapplebehaviour = new GrappleLauncherBehaviour();
          var2.field_x.b((byte) 107, this.grapplebehaviour);
        }
        this.currentconnectedangle = 0;
        this.health = var2.field_p;
        this.connectedangle = 0;
        if (null != var2.field_o) {
          this.hardpoints = new Hardpoint[var2.field_o.length];
          for (var3 = 0; var3 < this.hardpoints.length; var3++) {
            this.hardpoints[var3] = new Hardpoint();
          }
        }
        this.c(true);
    }

    static {
    }
}
