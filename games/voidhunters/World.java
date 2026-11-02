/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class World implements DiffableState, utb {
    private NebulaField field_p;
    private boolean swappedTeams;
    private int width;
    private IntrusiveDeque spawnPoints;
    private EscapePod[] escapePods;
    private IntrusiveDeque projectiles;
    private int field_y;
    private int[] respawntimers;
    private GrapplingHook[] grapplingHooks;
    private static int[] field_w;
    private ResourceNode[] resNodes;
    private AsteroidField field_e;
    private Ship[] ships;
    static String field_d;
    private MapZone[] mapZones;
    private boolean field_h;
    private Particle[] field_s;
    private boolean debug;
    private MissionControl missionControl;
    private static int[] field_c;
    private bea field_b;
    fba field_u;
    private boolean field_q;
    private int field_r;
    private Debris[] debris;

    final void a(ResourceNode param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -37) {
            field_w = (int[]) null;
          }
          this.resNodes = (ResourceNode[]) (ija.a(param0, this.resNodes, 0, SetShipDirectionArrow.field_p));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("pe.PA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(byte param0, boolean param1, int param2, int param3, int param4) {
        Debris discarded$1 = null;
        int var6;
        Nebula[] var7;
        int var8;
        Nebula var9;
        int var10;
        int var11;
        int var12;
        int var13;
        var13 = VoidHunters.field_G;
        if (param0 != -99) {
          discarded$1 = this.c(-37, false);
        }
        var6 = 0;
        var7 = this.field_p.a(false);
        if (null != var7) {
          var8 = 0;
          while (var7.length > var8) {
            var9 = var7[var8];
            var10 = param3 - var9.a(true);
            var11 = param2 - var9.getY((byte) -118);
            var12 = ar.a(var10, (byte) 121, var11);
            if (var12 < 16384 + param4) {
              this.a(0, param1, var8);
              var6 = 1;
              var8--;
              var7 = this.field_p.a(false);
            }
            var8++;
          }
        }
        return var6 != 0;
    }

    public final void a(faa param0, int param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        Projectile[] var3 = null;
        RuntimeException var3_ref = null;
        rdb[] var4 = null;
        int var6 = 0;
        Projectile[] var7 = null;
        var6 = VoidHunters.field_G;
        try {
          this.ships = (Ship[]) (GetAutoAfkTimeout.a(20, 1, this.ships, MissionGenerationData.field_a, 8, param0));
          this.projectiles = new IntrusiveDeque();
          var7 = (Projectile[]) (SetAutoDetail.a(10, aba.field_b, param0, 1, -88, (tv[]) null));
          var3 = var7;
          if (null != var3) {
            for (var4_int = 0; var4_int < var7.length; var4_int++) {
              this.projectiles.b(param1 ^ -10290, var7[var4_int]);
            }
          }
          this.debris = (Debris[]) (GetAutoAfkTimeout.a(param1 ^ -11, 1, this.debris, vcb.field_z, 10, param0));
          if (kv.a(false, param0)) {
            if (this.field_e == null) {
              this.field_e = new AsteroidField();
            }
            this.field_e.a(param0, 32);
          } else {
            this.field_e = null;
          }
          this.spawnPoints = new IntrusiveDeque();
          var4 = (rdb[]) (SetAutoDetail.a(6, GetBombletSprayProjectileDamage.field_q, param0, 1, param1 ^ -113, (tv[]) null));
          if (var4 != null) {
            for (var5 = 0; var4.length > var5; var5++) {
              this.spawnPoints.b(-10258, var4[var5]);
            }
          }
          this.grapplingHooks = (GrapplingHook[]) (GetAutoAfkTimeout.a(-14, 1, this.grapplingHooks, TickCondition.field_c, 8, param0));
          this.respawntimers = wkb.a((byte) 37, this.respawntimers, param0, 4);
          this.debug = kv.a(false, param0);
          this.field_y = param0.i(0, param1);
          this.swappedTeams = kv.a(false, param0);
          if (kv.a(false, param0)) {
            if (null == this.missionControl) {
              this.missionControl = new MissionControl();
            }
            this.missionControl.a(param0, false);
          } else {
            this.missionControl = null;
          }
          this.mapZones = (MapZone[]) (SetAutoDetail.a(8, wsb.field_e, param0, 1, -98, this.mapZones));
          this.resNodes = (ResourceNode[]) (SetAutoDetail.a(4, SetShipDirectionArrow.field_p, param0, 1, -84, this.resNodes));
          if (!kv.a(false, param0)) {
            this.field_p = null;
          } else {
            this.field_p = new NebulaField();
            this.field_p.a(param0, false);
          }
          this.width = param0.i(0, 28);
          this.field_r = param0.i(0, 28);
          if (!kv.a(false, param0)) {
            this.field_u = null;
          } else {
            if (this.field_u == null) {
              this.field_u = new fba();
            }
            this.field_u.a(param0, false);
          }
          this.escapePods = (EscapePod[]) (SetAutoDetail.a(4, pgb.field_g, param0, 1, -62, this.escapePods));
          if (!kv.a(false, param0)) {
            this.field_b = null;
          } else {
            this.field_b = new bea();
            this.field_b.a(param0, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_45_0 = var3_ref;
          stackIn_45_1 = new StringBuilder().append("pe.L(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10;
        int var11;
        int var12;
        int var13;
        var13 = VoidHunters.field_G;
        var10 = 0;
        if (param4 != 30273) {
          this.a((byte) -34, true, 58, 71, 121);
        }
        while (param0 > var10) {
          var11 = param1;
          var12 = param8;
          if (param6 > 0) {
            var11 = var11 + (-param6 + hob.a(GetFogOfWarSensorRange.field_o, param6 << 1, 126));
            var12 = var12 + (-param6 + hob.a(GetFogOfWarSensorRange.field_o, param6 << 1, 116));
          }
          this.a(param2, param5, var11, -19079, GetPedrosRepairMode.field_q, var12, param7, param3);
          var10++;
        }
    }

    private final void k(int param0) {
        Object var2_ref;
        Projectile var2_ref_tj;
        int var2;
        wc var3;
        Projectile var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var2_ref = null;
        var8 = VoidHunters.field_G;
        var2_ref_tj = (Projectile) (this.projectiles.d(0));
        while (var2_ref_tj != null) {
          if (var2_ref_tj.getType((byte) -104) == 1 ||
            var2_ref_tj.getType((byte) -104) == 6) {
            var3 = new wc(this.projectiles);
            var4 = (Projectile) (var3.c(570));
            while (null != var4) {
              if (var4.getType((byte) -104) != var2_ref_tj.getType((byte) -104)) {
                var5 = var2_ref_tj.d(107) - var4.d(118);
                var6 = var2_ref_tj.e((byte) -107) - var4.e((byte) -107);
                var7 = ar.a(var5, (byte) 103, var6);
                if (2048 > var7) {
                  if (var4.getType((byte) -104) != 3) {
                    var2_ref_tj.life = 0;
                  } else {
                    var2_ref_tj.life = var2_ref_tj.life - ooa.field_xb;
                    var4.f(-24805);
                  }
                  var4.life = 0;
                  if (var2_ref_tj.life > 0) {
                    var4 = (Projectile) (var3.a(19072));
                    continue;
                  }
                  var3.b((byte) 94);
                  var2_ref_tj.b(-3846);
                  if (var2_ref_tj.getType((byte) -104) == 6 &&
                    var4.getType((byte) -104) == 5) {
                    this.a(0, gib.field_a, var2_ref_tj.getFiredTeam(512), var2_ref_tj.b(false), false, var2_ref_tj.d(111), var2_ref_tj.e((byte) -107));
                    break;
                  }
                  qba.a(20382, var2_ref_tj.d(113), 81, var2_ref_tj.e((byte) -107), 50);
                  this.a(100, var2_ref_tj.e((byte) -107), var2_ref_tj.d(119), 1000, 11184895, 10, 50);
                  break;
                }
              }
              var4 = (Projectile) (var3.a(19072));
            }
          }
          var2_ref_tj = (Projectile) (this.projectiles.a((byte) 68));
        }
        var2 = 111 % ((param0 - 3) / 42);
    }

    final void g(int param0, int param1) {
        if (~param1 <= param0 && this.respawntimers.length > param1 && (13 == this.d(false) ||
          pla.a(this.d(false), -4))) {
          this.respawntimers[param1] = Particle.field_C;
        }
    }

    private final void a(Projectile param0, int param1, int param2, byte param3, int param4, int param5) {
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_94_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        uwa var10_ref_uwa = null;
        int var11 = 0;
        ShipBody var12 = null;
        ShipBody var13 = null;
        int var13_int = 0;
        Ship var14 = null;
        int var14_int = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        uwa var23 = null;
        int var7_intLifetime1;
        int var9Lifetime1;
        int var11Lifetime1;
        int var14_intLifetime1;
        int var14_intLifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var15Lifetime2Lifetime1;
        int var16Lifetime1Lifetime1;
        var22 = VoidHunters.field_G;
        try {
          if (1 != param0.getType((byte) -104) &&
            param0.getType((byte) -104) != 6 &&
            !gab.field_b.a((byte) -54)) {
            var7_int = -1;
            var8 = RoundResult.field_c.field_a;
            for (var9 = 0; ccb.field_a.field_d > var9; var9++) {
              var10_ref_uwa = ccb.field_a.field_b[var9];
              var11 = -1;
              var12 = var10_ref_uwa.field_e;
              if (var12 instanceof Ship) {
                var11 = ((Ship) (var12)).getTeam((byte) 113);
              }
              if (0 == var10_ref_uwa.field_c &&
                param0.getFiredTeam(512) != var11) {
                var13_int = SetShieldsDamageEnergyConversion.a(var10_ref_uwa.field_d, param2, param5, var10_ref_uwa.field_g, param1, 8, param4, var10_ref_uwa.field_f, 72);
                if ((-1 == var13_int ||
                  var13_int == 257) && (var10_ref_uwa.field_a != 0 ||
                  var10_ref_uwa.field_h != 0)) {
                  stackIn_26_0 = (!SetUseFilledPolygons.a(param2, var10_ref_uwa.field_f - var10_ref_uwa.field_h, -var10_ref_uwa.field_a + var10_ref_uwa.field_g, var10_ref_uwa.field_d, -104, param1)) ? 0 : 1;
                  var14_int = stackIn_26_0;
                  stackIn_29_0 = (!SetUseFilledPolygons.a(param2, var10_ref_uwa.field_f, var10_ref_uwa.field_g, var10_ref_uwa.field_d, -98, param1)) ? 0 : 1;
                  var15 = stackIn_29_0;
                  if ((var15 ^ var14_int) == 0) {
                    stackIn_34_0 = (!SetUseFilledPolygons.a(param5, -var10_ref_uwa.field_h + var10_ref_uwa.field_f, var10_ref_uwa.field_g - var10_ref_uwa.field_a, var10_ref_uwa.field_d, 56, param4)) ? 0 : 1;
                    var14_int = stackIn_34_0;
                    stackIn_37_0 = (!SetUseFilledPolygons.a(param5, var10_ref_uwa.field_f, var10_ref_uwa.field_g, var10_ref_uwa.field_d, 68, param4)) ? 0 : 1;
                    var15 = stackIn_37_0;
                    if ((var14_int ^ var15) != 0) {
                      var13_int = 0;
                    }
                  } else {
                    var13_int = 0;
                  }
                }
                if (-1 == var13_int ||
                  var13_int == 257) {
                  var14_intLifetime1 = -var10_ref_uwa.field_g + param1;
                  var15Lifetime1 = param2 - var10_ref_uwa.field_f;
                  var16 = ar.a(var14_intLifetime1, (byte) 121, var15Lifetime1);
                  if (Math.abs(var16 - var10_ref_uwa.field_d) <= 256) {
                    var13_int = 255;
                  }
                }
                if (var13_int != -1 &&
                  var13_int != 257 &&
                  var8 > var13_int) {
                  var14_intLifetime2 = 0;
                  if (var10_ref_uwa.field_i == -1) {
                    stackIn_74_0 = (!SetUseFilledPolygons.a(param2, var10_ref_uwa.field_f, var10_ref_uwa.field_g, var10_ref_uwa.field_d, -98, param1)) ? 1 : 0;
                    var14_intLifetime2 = stackIn_74_0;
                  } else {
                    var15Lifetime2 = (param0.dx * var13_int >> 8) + param1;
                    var16Lifetime1 = (param0.dy * var13_int >> 8) + param2;
                    var17 = var15Lifetime2 - var10_ref_uwa.field_g;
                    var18 = -var10_ref_uwa.field_f + var16Lifetime1;
                    var19 = ecb.a(var18, (byte) -77, var17);
                    var20 = GameKeyHandler.a(22433, var19 - var10_ref_uwa.field_b);
                    if (Math.abs(var20) < var10_ref_uwa.field_i) {
                      var14_intLifetime2 = 1;
                    } else {
                      var21 = SetShieldsDamageEnergyConversion.a(var10_ref_uwa.field_d, param5, param2, var10_ref_uwa.field_g, param4, 8, param1, var10_ref_uwa.field_f, 96);
                      if (var21 != -1 &&
                        var21 != 257) {
                        var13_int = 256 - var21;
                        if (var13_int < var8) {
                          var16Lifetime1Lifetime1 = param2 + (var13_int * param0.dy >> 8);
                          var15Lifetime2Lifetime1 = (param0.dx * var13_int >> 8) + param1;
                          var17Lifetime1 = var15Lifetime2Lifetime1 - var10_ref_uwa.field_g;
                          var18Lifetime1 = var16Lifetime1Lifetime1 - var10_ref_uwa.field_f;
                          var19Lifetime1 = ecb.a(var18Lifetime1, (byte) -77, var17Lifetime1);
                          var20 = GameKeyHandler.a(22433, -var10_ref_uwa.field_b + var19Lifetime1);
                          if (Math.abs(var20) < var10_ref_uwa.field_i) {
                            var14_intLifetime2 = 1;
                          }
                        }
                      }
                    }
                  }
                  if (var14_intLifetime2 != 0) {
                    var8 = var13_int;
                    var7_int = var9;
                  }
                }
              }
            }
            if (var7_int != -1) {
              var9Lifetime1 = (var8 * param0.dx >> 8) + param1;
              var10 = (var8 * param0.dy >> 8) + param2;
              var11Lifetime1 = pea.field_b;
              if (3 == param0.getType((byte) -104)) {
                param0.a(var10, var9Lifetime1, 118);
              } else {
                qba.a(20382, var9Lifetime1, 64, var10, 10);
                param0.b(-3846);
              }
              var23 = ccb.field_a.field_b[var7_int];
              var13 = var23.field_e;
              if (var13 instanceof Ship) {
                var14 = (Ship) (var13);
                var14.a((byte) 11, param0.getDamage((byte) 45) / GetPhysicsCollisionPhantomForceMultiplier.field_o);
              }
              this.a(sva.field_m, var10, var9Lifetime1, ei.field_a, 11184895, var11Lifetime1, dw.field_b);
              wgb.field_i = null;
            }
          }
          var7_intLifetime1 = -10 % ((26 - param3) / 39);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_93_0 = var7;
          stackIn_93_1 = new StringBuilder().append("pe.WE(");
          if (param0 == null) {
            stackIn_94_2 = "null";
          } else {
            stackIn_94_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_93_0), ((StringBuilder) (Object) stackIn_93_1).append(stackIn_94_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean a(Debris param0, int param1, boolean param2, Ship param3, int param4, int param5) {
        int var21 = 0;
        Ship stackIn_7_1 = null;
        boolean stackIn_8_2 = false;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        RuntimeException stackIn_110_0 = null;
        String stackIn_110_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        ShipComponent var10 = null;
        qua var11 = null;
        lu var12 = null;
        ShipComponent var13 = null;
        Hardpoint var14 = null;
        int var15 = 0;
        int var16 = 0;
        ShipComponent var17_ref_ml = null;
        int var17 = 0;
        ShipComponent var18_ref_ml = null;
        int var18 = 0;
        Ship[] var19 = null;
        Asteroid[] var19_array = null;
        int var20 = 0;
        Asteroid[] var20_ref_crb__ = null;
        Ship var21_ref_sg = null;
        Asteroid var22 = null;
        int var23 = 0;
        Ship[] var24 = null;
        lsb var25 = null;
        ShipComponent var18_ref_mlLifetime1;
        ShipComponent var18_ref_mlLifetime2;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var20Lifetime1;
        int var17Lifetime1Lifetime1;
        var23 = VoidHunters.field_G;
        try {
          var7_int = 0;
          var8 = -120 / ((79 - param4) / 44);
          if (null != param0) {
            var9 = -field_c[1] + param0.id;
            param0 = this.c(var9, false);
            stackIn_7_1 = (Ship) (param3);
            stackIn_8_2 = (hw.field_b == 1);
            this.a(stackIn_7_1, stackIn_8_2, -102, param0, param1, param5);
            if (GetPedrosRepairModeSwitchtime.field_o == 0) {
              param0.dy = 0;
              param0.field_t = 0;
              param0.field_o = 0;
              param0.dx = 0;
              param0.d((byte) 120);
            }
            var10 = param0.chassis;
            var11 = param3.p((byte) 49);
            if (var11 != null) {
              var12 = var11.field_e;
              if (var12 != null) {
                var13 = var12.field_b;
                var14 = var13.hardpoints[var12.field_e];
                var15 = 1;
                if (var11.field_c != null &&
                  var11.field_c.length > 0) {
                  var16 = 0;
                  while (!(var11.field_c.length <= var16)) {
                    var17_ref_ml = var11.field_c[var16];
                    var18_ref_ml = var17_ref_ml;
                    var18_ref_mlLifetime2 = var17_ref_ml;
                    if (!var17_ref_ml.a(16, var13) &&
                      var17_ref_ml != var13) {
                      var16++;
                      continue;
                    }
                    var15 = 0;
                    if (param2) {
                      break;
                    }
                    if (null == param0.chassis.subcomponents) {
                      break;
                    }
                    if (param0.chassis.subcomponents.length <= 0) {
                      break;
                    }
                    param0.chassis.a(this, (byte) -111, (ShipBody) (param0));
                    break;
                  }
                }
                var16Lifetime1 = 0;
                if (var15 != 0) {
                  var17 = this.width >> 1;
                  var18 = this.field_r >> 1;
                  if (!(param0.boundingbox[0] >= -var17) ||
                    !(var17 >= param0.boundingbox[1]) ||
                    !(param0.boundingbox[2] >= -var18) ||
                    !(param0.boundingbox[3] <= var18)) {
                    var15 = 0;
                  }
                  if (var15 != 0) {
                    var24 = this.ships;
                    var19 = var24;
                    for (var20 = 0; var24.length > var20; var20++) {
                      var21_ref_sg = var24[var20];
                      if (null != var21_ref_sg &&
                        param3 != var21_ref_sg &&
                        this.a(param0, var21_ref_sg, 66)) {
                        var15 = 0;
                        break;
                      }
                    }
                  }
                  if (var15 != 0) {
                    var19_array = this.field_e.c(0);
                    var20_ref_crb__ = var19_array;
                    for (var21 = 0; var21 < var20_ref_crb__.length; var21++) {
                      var22 = var20_ref_crb__[var21];
                      if (null != var22 &&
                        this.a(param0, var22, 80)) {
                        var15 = 0;
                        break;
                      }
                    }
                  }
                  if (var15 != 0 &&
                    param3.chassis.j(1) + param0.chassis.j(1) > ue.field_a) {
                    var15 = 0;
                  }
                  if (var15 == 0) {
                    var16Lifetime1 = 1;
                  }
                }
                if (var15 != 0) {
                  this.a(-106, 1, param0);
                  if (var11.field_c != null &&
                    var11.field_c.length > 0) {
                    for (var17Lifetime1 = 0; var11.field_c.length > var17Lifetime1; var17Lifetime1++) {
                      var18_ref_mlLifetime1 = var11.field_c[var17Lifetime1];
                      param3.chassis.a(false, var18_ref_mlLifetime1, this, 27, param3);
                      qba.a(20382, param0.d(false), 8, param0.g((byte) 120), 5);
                    }
                  }
                  var17Lifetime1Lifetime1 = var10.b(-24) * GetNumStars.a(param0.e(0), (byte) -119) - var10.c((byte) 100) * eu.a(param0.e(0), 96) >> 16;
                  var18Lifetime1 = var10.b(126) * eu.a(param0.e(0), 41) + var10.c((byte) 100) * GetNumStars.a(param0.e(0), (byte) 77) >> 16;
                  param0.a(var14.worldx - var17Lifetime1Lifetime1, -var18Lifetime1 + var14.worldy, (byte) -104);
                  param0.dy = 0;
                  param0.dx = 0;
                  param0.d((byte) 78);
                  var25 = var13.i((byte) -112).field_o[var12.field_e];
                  var20Lifetime1 = var25.field_a + var12.field_b.finalangle;
                  if (param0.chassis.thrusterbehaviour != null) {
                    var20Lifetime1 = GameKeyHandler.a(22433, var20Lifetime1 + 4096);
                  }
                  param0.a(var20Lifetime1, -95);
                  var10.h(98);
                  var13.a(1, var12.field_e, var10);
                  param3.e((byte) 119);
                  this.a(40, var14.worldy, var14.worldx, 1000, 11184895, 10, 20);
                  param3.chassis.a((byte) -127, (ShipBody) (param3));
                  qba.a(20382, param0.d(false), 4, param0.g((byte) -94), 5);
                  if (var10.weaponbehaviour != null) {
                    param3.justAttachedSomething = true;
                    var10.weaponbehaviour.a(true, true);
                  }
                } else {
                  if (var16Lifetime1 != 0) {
                    var7_int = 1;
                  }
                }
              }
            }
            if (param2) {
              param3.a(-1, (byte) -104);
            }
          }
          stackIn_101_0 = var7_int;
          return stackIn_101_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_105_0 = var7;
          stackIn_105_1 = new StringBuilder().append("pe.LF(");
          if (param0 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          stackIn_109_0 = stackIn_105_0;
          stackIn_109_1 = ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_110_0 = stackIn_109_0;
            stackIn_110_2 = "null";
          } else {
            stackIn_110_0 = stackIn_105_0;
            stackIn_110_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_110_0), ((StringBuilder) (Object) stackIn_109_1).append(stackIn_110_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final Nebula[] d(byte param0) {
        int var2 = 68 % ((param0 - 59) / 43);
        return this.field_p.a(false);
    }

    final void a(int param0, bea param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_b = param1;
          if (param0 != 0) {
            this.width = -90;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pe.GB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, byte param8) {
        int stackIn_37_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        var28 = VoidHunters.field_G;
        try {
          var10_int = 2147483647;
          var11 = -2147483648;
          var12 = 2147483647;
          if (param8 <= 73) {
            this.a((byte) -47, (rdb) null);
          }
          var13 = -2147483648;
          for (var14 = 0; param7.length > var14; var14 += 2) {
            var15 = param7[var14];
            var16 = param7[1 + var14];
            if (var15 > var11) {
              var11 = var15;
            }
            if (var15 < var10_int) {
              var10_int = var15;
            }
            if (var13 < var16) {
              var13 = var16;
            }
            if (var16 < var12) {
              var12 = var16;
            }
          }
          var14Lifetime1 = -var10_int + var11;
          var15Lifetime1 = -var12 + var13;
          var16Lifetime1 = var11 + var10_int >> 1;
          var17 = var12 + var13 >> 1;
          var18 = 1;
          var19 = 0;
          while (var19 < param5) {
            var20 = hob.a(GetFogOfWarSensorRange.field_o, var14Lifetime1, 126) + var10_int;
            var21 = hob.a(GetFogOfWarSensorRange.field_o, var15Lifetime1, 125) + var12;
            if (fra.a(param7, var21, 2, var20)) {
              var22 = 0;
              var23 = 0;
              if (param4 > 0) {
                var24 = -var16Lifetime1 + var20;
                var25 = var21 - var17;
                var26 = ar.a(var24, (byte) 122, var25);
                if (1 > var26) {
                  var26 = 1;
                }
                var27 = hob.a(GetFogOfWarSensorRange.field_o, param4 >> 1, 117) + (param4 >> 1);
                var23 = var23 + var27 * (-var17 + var21) / var26;
                var22 = var22 + var27 * (-var16Lifetime1 + var20) / var26;
              }
              var24Lifetime1 = hob.a(GetFogOfWarSensorRange.field_o, param2, 117) + (param2 >> 1);
              var25Lifetime1 = GetPedrosRepairMode.field_q;
              if (var18 != 0) {
                var22 = var22 >> 2;
                var24Lifetime1 = var24Lifetime1 << 1;
                var23 = var23 >> 2;
                var25Lifetime1 = param0 + (SetPhasedEnergyBeamReload.field_o + 1);
              }
              stackIn_37_0 = (var18 != 0) ? 0 : 1;
              var18 = stackIn_37_0;
              var26Lifetime1 = var22 + (param6 >> 1);
              var27Lifetime1 = var23 + (param1 >> 1);
              this.a(param3 * var24Lifetime1 / param2, var20, var26Lifetime1, -19079, var25Lifetime1, var27Lifetime1, var21, var24Lifetime1);
            } else {
              var19--;
            }
            var19++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_43_0 = var10;
          stackIn_43_1 = new StringBuilder().append("pe.MC(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param8).append(')').toString());
        }
    }

    final void a(int param0, ShipComponent param1, ShipBody param2) {
        int var5 = 0;
        boolean discarded$0 = false;
        GrapplingHook[] var4 = null;
        GrapplingHook var6 = null;
        int var8 = 0;
        GrapplingHook[] var9 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        ShipComponent var7 = null;
        var8 = VoidHunters.field_G;
        try {
          if (null == param2) {
            return;
          }
          var9 = this.grapplingHooks;
          var4 = var9;
          for (var5 = 0; var9.length > var5; var5++) {
            var6 = var9[var5];
            if (null != var6 &&
              var6.l((byte) -58) == param2.id) {
              var7 = param2.chassis.c(var6.getGrabbedComponentId(114), -126);
              if (var7 == param1) {
                var6.n(620);
              }
            }
          }
          if (param0 != 15520) {
            discarded$0 = this.a((Debris) null, -37, true, (Ship) null, 96, -69);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_24_0 = var4_ref;
          stackIn_24_1 = new StringBuilder().append("pe.FC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_28_0 = stackIn_24_0;
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param2 == null) {
            stackIn_29_0 = stackIn_28_0;
            stackIn_29_2 = "null";
          } else {
            stackIn_29_0 = stackIn_24_0;
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, ShipBody param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param2, true, true, false, param0);
          if (param1 <= 60) {
            this.swappedTeams = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pe.HA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        int stackIn_128_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        String stackIn_146_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        World var5 = null;
        try {
          var5 = (World) (other);
          tja.a(var5.ships, 1, this.ships, false, 5547);
          SetUseFilledPolygons.a(1, this.projectiles, 13, false, var5.projectiles);
          tja.a(var5.debris, 1, this.debris, false, 5547);
          if (this.field_e != null &&
            var5.field_e != null) {
            this.field_e.reportDifferences(var5.field_e, -46);
          }
          SetUseFilledPolygons.a(1, this.spawnPoints, 13, false, var5.spawnPoints);
          tja.a(var5.grapplingHooks, 1, this.grapplingHooks, false, 5547);
          if (null != this.missionControl &&
            var5.missionControl != null) {
            this.missionControl.reportDifferences(var5.missionControl, -105);
          }
          tja.a(var5.mapZones, 1, this.mapZones, false, 5547);
          tja.a(var5.resNodes, 1, this.resNodes, false, 5547);
          if (null != this.field_p &&
            null != var5.field_p) {
            this.field_p.reportDifferences(var5.field_p, -109);
          }
          if (null != this.field_u &&
            var5.field_u != null) {
            this.field_u.reportDifferences(var5.field_u, -74);
          }
          if (obfuscationGuard >= -19) {
            this.m(-81);
          }
          tja.a(var5.escapePods, 1, this.escapePods, false, 5547);
          if (this.field_b != null &&
            var5.field_b != null) {
            this.field_b.reportDifferences(var5.field_b, -25);
          }
          var4 = 0;
          if (SetCountermeasureLauncherAimspeed.a(var5.ships, false, 1, this.ships, 124)) {
            var4 = 1;
            System.out.println("Ship[] ships has changed. ");
          }
          if (SetCountermeasureLauncherAimspeed.a(hob.a(var5.projectiles, 210377952), false, 1, hob.a(this.projectiles, 210377952), 123)) {
            System.out.println("linklist projectiles has changed. ");
            var4 = 1;
          }
          if (SetCountermeasureLauncherAimspeed.a(var5.debris, false, 1, this.debris, 1)) {
            System.out.println("Debris[] debris has changed. ");
            var4 = 1;
          }
          stackIn_35_0 = (null != this.field_e) ? 0 : 1;
          stackIn_38_0 = stackIn_35_0;
          if (var5.field_e != null) {
            stackIn_39_0 = stackIn_38_0;
            stackIn_39_1 = 0;
          } else {
            stackIn_39_0 = stackIn_35_0;
            stackIn_39_1 = 1;
          }
          if ((stackIn_39_0 ^ stackIn_39_1) == 0 &&
            null != this.field_e &&
            !this.field_e.a((byte) -90, var5.field_e)) {
          }
          if (SetCountermeasureLauncherAimspeed.a(hob.a(var5.spawnPoints, 210377952), false, 1, hob.a(this.spawnPoints, 210377952), 118)) {
            var4 = 1;
            System.out.println("linklist spawn_points has changed. ");
          }
          if (SetCountermeasureLauncherAimspeed.a(var5.grapplingHooks, false, 1, this.grapplingHooks, -57)) {
            var4 = 1;
            System.out.println("GrapplingHook[] grappling_hooks has changed. ");
          }
          if (GetCountermeasuresCooldown.a(this.respawntimers, var5.respawntimers, false)) {
            System.out.println("int[] respawntimers has changed. ");
            var4 = 1;
          }
          stackIn_55_0 = (var5.debug) ? 0 : 1;
          stackIn_58_0 = stackIn_55_0;
          if (this.debug) {
            stackIn_59_0 = stackIn_58_0;
            stackIn_59_1 = 0;
          } else {
            stackIn_59_0 = stackIn_55_0;
            stackIn_59_1 = 1;
          }
          if (stackIn_59_0 != stackIn_59_1) {
            System.out.println("boolean debug has changed. before=" + var5.debug + ", now=" + this.debug);
            var4 = 1;
          }
          if (var5.field_y != this.field_y) {
          }
          if (this.swappedTeams != var5.swappedTeams) {
            System.out.println("boolean swapped_teams has changed. before=" + var5.swappedTeams + ", now=" + this.swappedTeams);
            var4 = 1;
          }
          stackIn_71_0 = (null != this.missionControl) ? 0 : 1;
          stackIn_74_0 = stackIn_71_0;
          if (var5.missionControl != null) {
            stackIn_75_0 = stackIn_74_0;
            stackIn_75_1 = 0;
          } else {
            stackIn_75_0 = stackIn_71_0;
            stackIn_75_1 = 1;
          }
          if ((stackIn_75_0 ^ stackIn_75_1) != 0 ||
            this.missionControl != null &&
            this.missionControl.a((byte) -103, var5.missionControl)) {
            var4 = 1;
            System.out.println("MissionControl mission_control has changed. before=" + var5.missionControl + ", now=" + this.missionControl);
          }
          if (SetCountermeasureLauncherAimspeed.a(var5.mapZones, false, 1, this.mapZones, 126)) {
            System.out.println("MapZone[] map_zones has changed. ");
            var4 = 1;
          }
          if (SetCountermeasureLauncherAimspeed.a(var5.resNodes, false, 1, this.resNodes, 123)) {
            System.out.println("ResourceNode[] res_nodes has changed. ");
            var4 = 1;
          }
          stackIn_90_0 = (null != var5.field_p) ? 0 : 1;
          stackIn_93_0 = stackIn_90_0;
          if (null != this.field_p) {
            stackIn_94_0 = stackIn_93_0;
            stackIn_94_1 = 0;
          } else {
            stackIn_94_0 = stackIn_90_0;
            stackIn_94_1 = 1;
          }
          if ((stackIn_94_0 ^ stackIn_94_1) == 0 &&
            this.field_p != null &&
            !this.field_p.a((byte) -81, var5.field_p)) {
          }
          if (var5.width != this.width) {
            var4 = 1;
            System.out.println("int width has changed. before=" + var5.width + ", now=" + this.width);
          }
          if (this.field_r != var5.field_r) {
          }
          stackIn_110_0 = (this.field_u != null) ? 0 : 1;
          stackIn_113_0 = stackIn_110_0;
          if (null != var5.field_u) {
            stackIn_114_0 = stackIn_113_0;
            stackIn_114_1 = 0;
          } else {
            stackIn_114_0 = stackIn_110_0;
            stackIn_114_1 = 1;
          }
          if ((stackIn_114_0 ^ stackIn_114_1) == 0 &&
            this.field_u != null &&
            !this.field_u.a((byte) 109, var5.field_u)) {
          }
          if (SetCountermeasureLauncherAimspeed.a(var5.escapePods, false, 1, this.escapePods, 117)) {
            System.out.println("EscapePod[] escape_pods has changed. ");
            var4 = 1;
          }
          stackIn_128_0 = (var5.field_b != null) ? 0 : 1;
          stackIn_131_0 = stackIn_128_0;
          if (this.field_b != null) {
            stackIn_132_0 = stackIn_131_0;
            stackIn_132_1 = 0;
          } else {
            stackIn_132_0 = stackIn_128_0;
            stackIn_132_1 = 1;
          }
          if ((stackIn_132_0 ^ stackIn_132_1) == 0 &&
            null != this.field_b &&
            !this.field_b.a((byte) -75, var5.field_b)) {
          }
          if (var4 != 0) {
            System.out.println("This instance of World has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_145_0 = var3;
          stackIn_145_1 = new StringBuilder().append("pe.F(");
          if (other == null) {
            stackIn_146_2 = "null";
          } else {
            stackIn_146_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_145_0), ((StringBuilder) (Object) stackIn_145_1).append(stackIn_146_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final EscapePod[] getEscapePods(int param0) {
        if (param0 != 0) {
          this.a(57, -43, (ShipBody) null);
        }
        return this.escapePods;
    }

    private final void b(int param0, byte param1, ShipBody param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_u.a(param2.boundingbox, (byte) 94, param2.id, param0);
          if (param1 <= 123) {
            this.field_y = -45;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pe.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final boolean a(int param0, ShipComponent param1, Hardpoint param2, boolean param3, byte param4, Ship param5, Debris param6) {
        int var8_int = 0;
        ShipComponent var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        lsb var18 = null;
        int var19 = 0;
        int var20 = 0;
        boolean stackIn_18_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 < 54) {
            this.field_h = false;
          }
          if (param6 != null) {
            var8_int = -field_c[1] + param6.id;
            param6 = this.c(var8_int, false);
            var9 = param6.chassis;
            var10 = var9.b(125) * GetNumStars.a(param6.e(0), (byte) 78) - var9.c((byte) 100) * eu.a(param6.e(0), 58) >> 16;
            var11 = var9.b(125) * eu.a(param6.e(0), 85) + var9.c((byte) 100) * GetNumStars.a(param6.e(0), (byte) -120) >> 16;
            var12 = var10 + var9.finalx;
            var13 = var9.finaly + var11;
            var14 = -var12 + param2.worldx;
            var15 = -var13 + param2.worldy;
            var16 = ar.a(var14, (byte) 118, var15);
            var17 = var16 >> 8;
            if (var17 <= 0) {
              var17 = 1;
            }
            var14 = var14 / var17;
            var15 = var15 / var17;
            var18 = param1.i((byte) -112).field_o[param0];
            var19 = var18.field_a + param1.finalangle;
            if (param6.chassis.thrusterbehaviour != null) {
              var19 += 4096;
            }
            VariableCondition.a(param2.worldx + GetNumStars.a(var19, (byte) -81), param2.worldy + eu.a(var19, 54), param2.worldy, param2.worldx, (byte) -54);
            param6.a(param6.e(false) * var15 * 4, param6.d(false), param6.g((byte) 124), (byte) -121, param6.e(false) * (var14 * 4));
            param6.dx = 180 * param6.dx >> 8;
            param6.dy = param6.dy * 180 >> 8;
            var20 = GameKeyHandler.a(22433, -param6.e(0) + var19);
            param6.angularvelocity = (var20 << 12) / var17;
            if (Math.abs(param6.angularvelocity) > Math.abs(var20) << 8) {
              param6.angularvelocity = var20 << 4;
            }
            param3 = true;
            param5.a(param6.id, (byte) -82);
            if (var16 < 4096 &&
              this.a(param6, param2.worldy, false, param5, 126, param2.worldx)) {
              param6.angularvelocity = 0;
              param6.field_p = 0;
              param6.d((byte) -90);
              return false;
            }
          }
          stackIn_18_0 = param3;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("pe.HF(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_26_0 = stackIn_22_0;
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_27_0 = stackIn_26_0;
            stackIn_27_2 = "null";
          } else {
            stackIn_27_0 = stackIn_22_0;
            stackIn_27_2 = "{...}";
          }
          stackIn_30_0 = stackIn_27_0;
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_31_0 = stackIn_30_0;
            stackIn_31_2 = "null";
          } else {
            stackIn_31_0 = stackIn_27_0;
            stackIn_31_2 = "{...}";
          }
          stackIn_34_0 = stackIn_31_0;
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param6 == null) {
            stackIn_35_0 = stackIn_34_0;
            stackIn_35_2 = "null";
          } else {
            stackIn_35_0 = stackIn_31_0;
            stackIn_35_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    private final boolean a(ShipComponent param0, Ship param1, ShipComponent param2, int param3, int param4, ShipComponent param5) {
        boolean discarded$0 = false;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var13 = 0;
        Debris var14 = null;
        int var15 = 0;
        int var16 = 0;
        Hardpoint var17 = null;
        Hardpoint var18 = null;
        ShipComponent var19 = null;
        ShipComponent var20 = null;
        Hardpoint var21 = null;
        Hardpoint var22 = null;
        ShipComponent var23 = null;
        ShipComponent var24 = null;
        Hardpoint var21Lifetime1;
        Hardpoint var21Lifetime2;
        Hardpoint var21Lifetime3;
        Hardpoint var21Lifetime4;
        int var8Lifetime1;
        var15 = VoidHunters.field_G;
        try {
          if (param4 != -17329) {
            return true;
          }
          if (param0.hardpoints != null &&
            null != param2.hardpoints &&
            param0.hardpoints.length == param2.hardpoints.length) {
            var7_int = 0;
            param1.a(-1, (byte) -92);
            if (param3 != 0) {
              var8 = 0;
              while (true) {
                if (param0.hardpoints.length <= var8) {
                  return false;
                }
                var17 = param0.hardpoints[var8];
                var21 = var17;
                var21Lifetime2 = var17;
                var19 = param0.d(var17.connectedComponentIdx, 692);
                var18 = param2.hardpoints[var8];
                var21Lifetime3 = var18;
                var21Lifetime4 = var18;
                var20 = param2.d(var18.connectedComponentIdx, 692);
                if (var19 != null &&
                  var20 != null &&
                  this.a(var19, param1, var20, param3 - 1, -17329, param5)) {
                  var7_int = 1;
                }
                if (var7_int == 0) {
                  var8++;
                  continue;
                }
                break;
              }
              return true;
            }
            var16 = 0;
            var8Lifetime1 = var16;
            while (param0.hardpoints.length > var16) {
              var21Lifetime1 = param0.hardpoints[var16];
              var24 = param0.d(var21Lifetime1.connectedComponentIdx, 692);
              var22 = param2.hardpoints[var16];
              var23 = param2.d(var22.connectedComponentIdx, param4 + 18021);
              if (null != var23 && (var24 == null ||
                var23.componentTypeId != var24.componentTypeId)) {
                var13 = var23.componentTypeId;
                var14 = this.a(var21Lifetime1.worldx, param1.d(false), var21Lifetime1.worldy, (byte) 30, param1.g((byte) -29), var13);
                if (var14 == null) {
                  discarded$0 = this.a(param1.chassis, param5, 0, param1, var13);
                  var14 = this.a(var21Lifetime1.worldx, param1.d(false), var21Lifetime1.worldy, (byte) 30, param1.g((byte) -23), var13);
                }
                stackIn_30_0 = (!this.a(var16, param0, var21Lifetime1, var7_int != 0, (byte) 95, param1, var14)) ? 0 : 1;
                var7_int = stackIn_30_0;
              }
              if (var7_int != 0) {
                return true;
              }
              var16++;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_42_0 = var7;
          stackIn_42_1 = new StringBuilder().append("pe.PD(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_46_0 = stackIn_42_0;
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param1 == null) {
            stackIn_47_0 = stackIn_46_0;
            stackIn_47_2 = "null";
          } else {
            stackIn_47_0 = stackIn_42_0;
            stackIn_47_2 = "{...}";
          }
          stackIn_50_0 = stackIn_47_0;
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',');
          if (param2 == null) {
            stackIn_51_0 = stackIn_50_0;
            stackIn_51_2 = "null";
          } else {
            stackIn_51_0 = stackIn_47_0;
            stackIn_51_2 = "{...}";
          }
          stackIn_54_0 = stackIn_51_0;
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_55_0 = stackIn_54_0;
            stackIn_55_2 = "null";
          } else {
            stackIn_55_0 = stackIn_51_0;
            stackIn_55_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(')').toString());
        }
    }

    final int d(boolean param0) {
        if (param0) {
          this.a(-85, 55);
        }
        return this.field_y;
    }

    final int e(boolean param0) {
        if (!param0) {
          this.e(true);
        }
        if (null == this.mapZones) {
          return 0;
        }
        return this.mapZones.length;
    }

    final void a(byte param0, rdb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.spawnPoints.b(-10258, param1);
          if (param0 > -51) {
            this.e(16, -28);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pe.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        Nebula var6;
        var6 = this.field_p.a((byte) 54, param2);
        var6 = var6;
        if (param0 != 0) {
          return;
        }
        if (param1) {
          this.field_u.a(new int[]{var6.a(true) - 16384, 16384 + var6.a(true), var6.getY((byte) -123) - 16384, var6.getY((byte) -81) + 16384}, param2, 0, true, 0);
        }
    }

    final void a(int param0, boolean param1, MessageLog param2, Player[] param3, MissionState param4, int param5, Player[] param6) {
        boolean discarded$0 = false;
        Debris stackIn_29_0;
        Object stackIn_29_1;
        boolean stackIn_29_2;
        int stackIn_29_3;
        Object stackIn_30_1;
        boolean stackIn_30_4;
        Debris stackIn_37_0;
        Object stackIn_37_1;
        boolean stackIn_37_2;
        int stackIn_37_3;
        Object stackIn_38_1;
        boolean stackIn_38_4;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        String stackIn_125_2 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        String stackIn_129_2 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_133_0 = null;
        String stackIn_133_2 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        RuntimeException stackIn_137_0 = null;
        String stackIn_137_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Ship[] var14_ref_sg__ = null;
        int var14 = 0;
        int var15_int = 0;
        Object var15 = null;
        int var16 = 0;
        Object[] var16_ref = null;
        GrapplingHook[] var16_ref_mqb__ = null;
        Debris var16_ref_nbb = null;
        Ship var16_ref_sg = null;
        int var17 = 0;
        int var18_int = 0;
        Object var18 = null;
        GrapplingHook var18_ref = null;
        int var19 = 0;
        Object var20 = null;
        Debris var20_ref = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24 = null;
        Object[] var25 = null;
        Object var26 = null;
        GrapplingHook[] var27 = null;
        GrapplingHook var28 = null;
        EscapePod[] var29 = null;
        EscapePod var30 = null;
        Ship[] var31 = null;
        Ship var32 = null;
        Debris var33 = null;
        Debris var34 = null;
        Projectile var35 = null;
        Object var15Lifetime1;
        Object[] var16_refLifetime1;
        GrapplingHook[] var16_ref_mqb__Lifetime1;
        Object var18Lifetime1;
        GrapplingHook var18_refLifetime1;
        Object var20Lifetime1;
        int var14Lifetime1;
        int var15_intLifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var17Lifetime4;
        int var17Lifetime5;
        int var17Lifetime6;
        int var19Lifetime1;
        var24 = null;
        var21 = VoidHunters.field_G;
        try {
          oua.field_a = param1;
          GetSniperCannonFireForce.field_o = param5;
          GetFogOfWarSensorRange.field_o = new Random((long)(10234 * GetSniperCannonFireForce.field_o));
          ccb.field_a.c(39);
          this.field_e.a(true);
          this.a(param4, param6, (byte) -40, param2);
          this.a(param3, 1, param6, param5);
          var8_int = this.width >> 1;
          var9 = this.field_r >> 1;
          var10 = -var8_int;
          var11 = var8_int;
          var12 = -var9;
          var13 = var9;
          var14_ref_sg__ = this.ships;
          for (var15_int = 0; var15_int < var14_ref_sg__.length; var15_int++) {
            var16_ref_sg = var14_ref_sg__[var15_int];
            if (var16_ref_sg != null) {
              var16_ref_sg.b(var12, param0 ^ 347545783, var13, var10, var11);
            }
          }
          if (param0 != 1799937864) {
            discarded$0 = this.a((ShipComponent) null, (Ship) null, (ShipComponent) null, 27, 102, (ShipComponent) null);
          }
          var35 = (Projectile) (this.projectiles.d(0));
          while (var35 != null) {
            var35.a((byte) 93, this);
            var35 = (Projectile) (this.projectiles.a((byte) 101));
          }
          for (var14 = 0; this.field_s.length > var14; var14++) {
            if (this.field_s[var14].b((byte) -126)) {
              this.field_s[var14].a(-8460);
            }
          }
          var14Lifetime1 = 0;
          var22 = 0;
          var15_intLifetime1 = var22;
          while (this.debris.length > var22) {
            var16_ref_nbb = this.debris[var22];
            if (var16_ref_nbb != null) {
              var14Lifetime1++;
              if (!var16_ref_nbb.c(var13, var11, param0 ^ 1799937849, var12, var10)) {
                if (var16_ref_nbb.k(param0 ^ 1344029312)) {
                  var16_ref_nbb = this.c(var22, false);
                  stackIn_37_0 = var16_ref_nbb;
                  stackIn_37_1 = this;
                  stackIn_37_2 = false;
                  stackIn_37_3 = 67;
                  if (hw.field_b != 1) {
                    stackIn_38_1 = this;
                    stackIn_38_4 = false;
                  } else {
                    stackIn_38_1 = this;
                    stackIn_38_4 = true;
                  }
                  ((Debris) (Object) stackIn_37_0).a(this, stackIn_37_2, (byte) stackIn_37_3, stackIn_38_4);
                }
              } else {
                var16_ref_nbb = this.c(var22, false);
                var16_ref_nbb.b(var12, 2147483647, var13, var10, var11);
                stackIn_29_0 = var16_ref_nbb;
                stackIn_29_1 = this;
                stackIn_29_2 = true;
                stackIn_29_3 = 67;
                if (hw.field_b != 1) {
                  stackIn_30_1 = this;
                  stackIn_30_4 = false;
                } else {
                  stackIn_30_1 = this;
                  stackIn_30_4 = true;
                }
                ((Debris) (Object) stackIn_29_0).a(this, stackIn_29_2, (byte) stackIn_29_3, stackIn_30_4);
              }
            }
            var22++;
          }
          if (var14Lifetime1 > kva.field_g) {
            var15 = null;
            var16 = hob.a(GetFogOfWarSensorRange.field_o, var14Lifetime1, 123);
            var17 = 0;
            var18_int = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (this.debris.length > var18_int) {
                if (this.debris[var18_int] != null) {
                  if (var17 == var16) {
                    var15 = this.debris[var18_int];
                    var20 = var15;
                    var20Lifetime1 = var15;
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var17++;
                  }
                }
                if (decompiledFrameRemainder0) {
                  var18_int++;
                  continue;
                }
              }
              if (var15 == null) {
                break;
              }
              if (((ShipBody) (var15)).chassis.getComponentTypeId(0) == 47) {
                break;
              }
              this.a(param0 ^ -1799937853, 1, (ShipBody) (var15));
              break;
            }
          }
          var15Lifetime1 = this.field_e.c(0);
          var25 = (Object[]) var15Lifetime1;
          var16_ref = var25;
          for (var17Lifetime1 = 0; var25.length > var17Lifetime1; var17Lifetime1++) {
            var26 = var25[var17Lifetime1];
            var18 = var26;
            if (var26 != null) {
              stackIn_65_0 = (!((Asteroid) (var26)).b(var12, 2147483647, var13, var10, var11)) ? 0 : 1;
              var19 = stackIn_65_0;
              ((Asteroid) (var26)).a(this, var19 != 0, (byte) 67, true);
            }
          }
          var27 = this.grapplingHooks;
          var16_ref_mqb__ = var27;
          for (var17Lifetime2 = 0; var17Lifetime2 < var27.length; var17Lifetime2++) {
            var28 = var27[var17Lifetime2];
            var18_ref = var28;
            if (var28 != null) {
              var28.b(24, var28.mass);
              var28.a(this, true, (byte) 67, true);
            }
          }
          if (this.escapePods != null) {
            var29 = this.escapePods;
            for (var17Lifetime3 = 0; var17Lifetime3 < var29.length; var17Lifetime3++) {
              var30 = var29[var17Lifetime3];
              var30.c((byte) -7);
            }
          }
          this.a(false, param4, (byte) -117, (lta) null);
          this.a(param0 ^ 1799937866, param2, param6);
          this.a(param0 - 1799937751, param5, param6, param4);
          var31 = this.ships;
          for (var17Lifetime4 = 0; var17Lifetime4 < var31.length; var17Lifetime4++) {
            var32 = var31[var17Lifetime4];
            if (null != var32) {
              var19Lifetime1 = 0;
              if (var32.getDragging(96) != -1) {
                var20_ref = this.i(21363, var32.getDragging(param0 ^ -1799937855));
                if (null != var20_ref) {
                  var19Lifetime1 = var20_ref.e(false);
                }
              }
              var32.b(24, var19Lifetime1 + var32.mass);
            }
          }
          var16_ref_mqb__Lifetime1 = this.grapplingHooks;
          for (var17Lifetime5 = 0; var16_ref_mqb__Lifetime1.length > var17Lifetime5; var17Lifetime5++) {
            var18_refLifetime1 = var16_ref_mqb__Lifetime1[var17Lifetime5];
            if (var18_refLifetime1 != null) {
              var18_refLifetime1.b(24, var18_refLifetime1.mass);
            }
          }
          var16_refLifetime1 = (Object[]) var15Lifetime1;
          for (var17Lifetime6 = 0; var17Lifetime6 < var16_refLifetime1.length; var17Lifetime6++) {
            var18Lifetime1 = var16_refLifetime1[var17Lifetime6];
            if (var18Lifetime1 != null) {
              ((Asteroid) (var18Lifetime1)).b(24, ((Asteroid) (var18Lifetime1)).mass);
            }
          }
          var23 = 0;
          var16Lifetime1 = var23;
          while (var23 < this.debris.length) {
            var33 = this.debris[var23];
            if (var33 != null && (var33.field_t != 0 ||
              var33.field_o != 0 ||
              var33.field_p != 0)) {
              var34 = this.c(var23, false);
              var34.b(24, var34.mass);
            }
            var23++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_124_0 = var8;
          stackIn_124_1 = new StringBuilder().append("pe.BA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_125_2 = "null";
          } else {
            stackIn_125_2 = "{...}";
          }
          stackIn_128_0 = stackIn_124_0;
          stackIn_128_1 = ((StringBuilder) (Object) stackIn_124_1).append(stackIn_125_2).append(',');
          if (param3 == null) {
            stackIn_129_0 = stackIn_128_0;
            stackIn_129_2 = "null";
          } else {
            stackIn_129_0 = stackIn_124_0;
            stackIn_129_2 = "{...}";
          }
          stackIn_132_0 = stackIn_129_0;
          stackIn_132_1 = ((StringBuilder) (Object) stackIn_128_1).append(stackIn_129_2).append(',');
          if (param4 == null) {
            stackIn_133_0 = stackIn_132_0;
            stackIn_133_2 = "null";
          } else {
            stackIn_133_0 = stackIn_129_0;
            stackIn_133_2 = "{...}";
          }
          stackIn_136_0 = stackIn_133_0;
          stackIn_136_1 = ((StringBuilder) (Object) stackIn_132_1).append(stackIn_133_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_137_0 = stackIn_136_0;
            stackIn_137_2 = "null";
          } else {
            stackIn_137_0 = stackIn_133_0;
            stackIn_137_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_137_0), ((StringBuilder) (Object) stackIn_136_1).append(stackIn_137_2).append(')').toString());
        }
    }

    final void b(int param0, byte param1) {
        if (param1 != 23) {
          return;
        }
        this.field_y = param0;
    }

    private final boolean a(ShipBody param0, int param1, Projectile param2) {
        ShipComponent var4 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          if (!param2.c(112)) {
            param0.a(gab.field_b, param2, -4414);
            if (gab.field_b.a((byte) -97)) {
              wgb.field_i = param0;
              return true;
            }
          } else {
            var4 = RoundResult.field_c.field_b;
            param0.a(RoundResult.field_c, param2, (byte) 104);
            if (RoundResult.field_c.field_b != var4) {
              wgb.field_i = param0;
            }
          }
          if (param1 >= 29) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("pe.U(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_0 = stackIn_15_0;
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_0 = stackIn_19_0;
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = stackIn_15_0;
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    private final void a(Player[] param0, int param1, Player[] param2, int param3) {
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_88_2 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        String stackIn_92_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Ship[] var9 = null;
        Ship var11 = null;
        Player var12 = null;
        Player var13 = null;
        ShipAI var14_ref_aoa = null;
        int var14 = 0;
        int var15 = 0;
        Ship var16 = null;
        int var17 = 0;
        Ship var16Lifetime1;
        Ship var16Lifetime2;
        var17 = VoidHunters.field_G;
        try {
          var5_int = GetTorpedoAcceleration.field_p;
          var6 = uja.field_b;
          if (param1 == fra.field_a) {
            var5_int = var5_int * GrappleLauncherBehaviour.field_d;
            var6 = var6 * GrappleLauncherBehaviour.field_d;
          }
          stackIn_9_0 = (param3 % var5_int != 0) ? 0 : 1;
          var7 = stackIn_9_0;
          stackIn_13_0 = (param3 % var6 != 0) ? 0 : 1;
          var8 = stackIn_13_0;
          var9 = this.ships;
          for (var10 = 0; var9.length > var10; var10++) {
            boolean decompiledFrameRemainder0 = true;
            var11 = var9[var10];
            var16 = var11;
            var16Lifetime1 = var11;
            if (null != var11) {
              if (var11.getOwner((byte) -117) >= 0 &&
                !var11.l((byte) -10)) {
                var12 = param2[var11.getOwner((byte) -117)];
                var13 = param0[var11.getOwner((byte) -117)];
                if (!var12.field_a &&
                  SetMissionResnetResourceTickTime.field_p == 1) {
                  var14_ref_aoa = new ShipAI();
                  var11.a(this, true, (byte) 67, true);
                  var14_ref_aoa.a(var11, (byte) -73, this);
                  if (GetPointDefenceLaserProjectiles.a(4096, 11284)) {
                    var11.a(var14_ref_aoa, param1 + 3);
                  }
                } else {
                  if (var11.d(9, 42)) {
                    var11.a(this, true, (byte) 67, true);
                  } else {
                    if (!var11.a(this, var12.aimtargetx, var12.aimtargety, 0)) {
                      if (4 == var12.specialorder) {
                        var11.a(param1 ^ -93, var12.specialorder, this, var12.aimtargety, var12.aimtargetx);
                      }
                    } else {
                      var15 = this.a(var12, -72, var13, var11) ? 1 : 0;
                      if (di.field_p == 1 &&
                        SetShipTeamAction.field_e == 1 &&
                        var11.justAttachedSomething &&
                        (var12.triggers & 128) != 0) {
                        var11.a(-114, var12.aimtargety, var12.aimtargetx);
                        var11.justAttachedSomething = false;
                      }
                      if (var15 != 0) {
                        if (1 == SetMissilesTopSpeed.field_o) {
                          var16Lifetime2 = GetGrapplingHookCooldown.a(this, (byte) 63, var11.getOwner((byte) -117), var11);
                          if (var16Lifetime2 != null) {
                            var12.aimtargetx = var16Lifetime2.d(false);
                            var12.aimtargety = var16Lifetime2.g((byte) -19);
                          }
                        }
                        if (di.field_p == 0) {
                          var11.a(param1 - 126, var12.aimtargety, var12.aimtargetx);
                        }
                      }
                      var11.a(this, true, (byte) 67, true);
                      var11.a(this, var12.triggers, false, var12.aimtargetx, var12.aimtargety);
                      var11.a(-71, var12.specialorder, this, var12.aimtargety, var12.aimtargetx);
                    }
                  }
                }
                if (!var11.d(4, 99) &&
                  var7 != 0) {
                  var14 = var11.c(SetSniperCannonFireForce.field_q, (byte) -2);
                  if (1 == qrb.field_a &&
                    0 < var14) {
                    if (var12.savedShip == null) {
                      var12.savedShip = new Ship();
                    }
                    var11.b((byte) 113, var12.savedShip);
                  }
                }
              } else {
                if (var11.l((byte) -10)) {
                  var11.a(this, true, (byte) 67, true);
                  if (!this.debug) {
                    var11.a(true, this);
                  }
                  if (var11.chassis.getComponentTypeId(0) == 0) {
                    if (param3 % GetDebrisFoundInPairs.field_p == 0) {
                      var11.c(SetKeepTeamColours.field_o, (byte) -2);
                    }
                  } else {
                    if (var8 != 0) {
                      var11.c(GetBombletSprayProjectileOndamageParticles.field_q, (byte) -2);
                    }
                  }
                } else {
                  var11.a(this, false, (byte) 67, true);
                }
              }
              if (fra.field_a == 1 &&
                1 == GetBombletSprayRandomness.field_p &&
                var11.o(94) < 255) {
                if (!var11.salvoJustFired) {
                  var11.salvoJustFired = true;
                } else {
                  var11.a((byte) 11, 65536);
                  var11.salvoJustFired = false;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                var11.salvoJustFired = false;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_87_0 = var5;
          stackIn_87_1 = new StringBuilder().append("pe.M(");
          if (param0 == null) {
            stackIn_88_2 = "null";
          } else {
            stackIn_88_2 = "{...}";
          }
          stackIn_91_0 = stackIn_87_0;
          stackIn_91_1 = ((StringBuilder) (Object) stackIn_87_1).append(stackIn_88_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_92_0 = stackIn_91_0;
            stackIn_92_2 = "null";
          } else {
            stackIn_92_0 = stackIn_87_0;
            stackIn_92_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_92_0), ((StringBuilder) (Object) stackIn_91_1).append(stackIn_92_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        Ship var5;
        int var6;
        var6 = VoidHunters.field_G;
        if (param1) {
          return true;
        }
        for (var4 = 0; this.ships.length > var4; var4++) {
          var5 = this.ships[var4];
          if (null != var5 &&
            var5.getDragging(-108) == param2) {
            if (!param0) {
              return true;
            }
            if (null == var5.getTargetBlueprint((byte) 28)) {
              return true;
            }
          }
        }
        return false;
    }

    final int m(int param0) {
        if (param0 != 1) {
          return 101;
        }
        return this.field_r;
    }

    private final void a(Asteroid[] param0, boolean param1, IntrusiveDeque param2) {
        int var4_int = 0;
        int var7 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        Asteroid var5 = null;
        int var6 = 0;
        int var8 = 0;
        Asteroid var9 = null;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          if (!param1) {
            this.mapZones = (MapZone[]) null;
          }
          for (var4_int = 0; var4_int < -1 + param0.length; var4_int++) {
            var5 = param0[var4_int];
            if (null != var5 &&
              var5.chassis != null &&
              !var5.chassis.k((byte) 72) &&
              var5.k(995401160)) {
              var6 = this.field_u.a(var5.id, var5.boundingbox, 3, -100);
              for (var7 = 0; var7 < var6; var7++) {
                var8 = ada.field_a[var7] - field_c[2];
                var9 = param0[var8];
                if (null != var9 &&
                  var9.chassis != null &&
                  !var9.chassis.k((byte) 68) && (var4_int > var8 ||
                  !var9.k(995401160))) {
                  if (this.a(true, 2, SetPointDefenceLaserProjectiles.field_o, (byte) 76, true, var9, 2, var5, param2)) {
                    this.field_e.b(-101);
                  }
                  if (null == var5.chassis) {
                    break;
                  }
                  if (var5.chassis.k((byte) 117)) {
                    break;
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_48_0 = var4;
          stackIn_48_1 = new StringBuilder().append("pe.IF(");
          if (param0 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_52_0 = stackIn_48_0;
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_53_0 = stackIn_52_0;
            stackIn_53_2 = "null";
          } else {
            stackIn_53_0 = stackIn_48_0;
            stackIn_53_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(')').toString());
        }
    }

    private final boolean a(boolean param0, int param1, int param2, byte param3, boolean param4, ShipBody param5, int param6, ShipBody param7, IntrusiveDeque param8) {
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        Object var12 = null;
        gda var12_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var12 = null;
        var18 = VoidHunters.field_G;
        try {
          if (!MissionAction.a(param7.boundingbox, param5.boundingbox, -115)) {
            return false;
          }
          if (param3 < 40) {
            return false;
          }
          param7.chassis.a(param8, param5.chassis, 0, (byte) 125, 0);
          var10_int = 0;
          if (param8.b(126)) {
            var10_int = 1;
            if (3 == param6) {
              param5.chassis.a(param7.chassis, param7.y, 0, param7.x, 0, param7.g(-106), param8, 0, 0);
            }
            if (param1 == 3) {
              param7.chassis.a(param5.chassis, param5.y, 0, param5.x, 0, param5.g(-68), param8, 0, 0);
            }
          }
          if (param8.b(-56)) {
            return false;
          }
          var11 = 1;
          var12_ref = (gda) (param8.d(0));
          while (null != var12_ref) {
            if (var10_int == 0 &&
              param4) {
              this.a(param7, param5, var12_ref, 46, param0);
            }
            var13 = this.a(param6, var12_ref.field_m, param7, (byte) 109, var12_ref.field_i, var12_ref.field_h, param5, var12_ref.field_g, param1) ? 1 : 0;
            if (var10_int == 0) {
              if (var13 != 0) {
                this.a(param7, var12_ref, -116, param2, param5);
              }
              if (var11 != 0) {
                if ((param6 != 2 ||
                  param1 != 2) &&
                  (3 != param6 &&
                  param1 != 3)) {
                  var14 = param7.dx - param5.dx;
                  var15 = param7.dy - param5.dy;
                  var16 = ar.a(var14, (byte) 112, var15) >> 2;
                  var17 = 48;
                  if (!param0) {
                    var17 = 52;
                  }
                  fnb.a(50, var12_ref.field_l, var12_ref.field_e, false, var17, var16);
                }
                var11 = 0;
              }
            }
            var12_ref = (gda) (param8.a((byte) 8));
          }
          param8.e(120);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_50_0 = var10;
          stackIn_50_1 = new StringBuilder().append("pe.UC(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_54_0 = stackIn_50_0;
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_55_0 = stackIn_54_0;
            stackIn_55_2 = "null";
          } else {
            stackIn_55_0 = stackIn_50_0;
            stackIn_55_2 = "{...}";
          }
          stackIn_58_0 = stackIn_55_0;
          stackIn_58_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param8 == null) {
            stackIn_59_0 = stackIn_58_0;
            stackIn_59_2 = "null";
          } else {
            stackIn_59_0 = stackIn_55_0;
            stackIn_59_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(')').toString());
        }
    }

    final void a(Debris param0, byte param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          param0.b(-(this.field_r >> 1), 2147483647, this.field_r >> 1, -(this.width >> 1), this.width >> 1);
          param0.b(24, param0.mass);
          if (param1 < 25) {
            return;
          }
          param0.a(this, true, (byte) 67, false);
          if (this.a(29651, param0, this.debris, 1)) {
            param0.phantom = true;
            if (hw.field_b != 1) {
              return;
            }
            this.b(2, (byte) 126, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("pe.VE(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void f(boolean param0) {
        int var3 = 0;
        int[] array$0 = null;
        fba stackIn_10_0;
        int[] stackIn_10_1;
        int[] stackIn_10_2;
        int stackIn_10_3;
        int stackIn_10_4;
        Nebula stackIn_10_5;
        boolean stackIn_11_6;
        Ship[] stackIn_15_1 = null;
        boolean stackIn_16_2 = false;
        Nebula[] var2;
        Nebula var4;
        int var5;
        Nebula[] var6;
        var5 = VoidHunters.field_G;
        if (null == this.field_u) {
          this.field_u = new fba();
        }
        var6 = this.field_p.a(param0);
        var2 = var6;
        if (var2 != null) {
          for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            array$0 = new int[4];
            stackIn_10_0 = this.field_u;
            stackIn_10_1 = array$0;
            stackIn_10_2 = array$0;
            stackIn_10_3 = 0;
            stackIn_10_4 = -16384;
            stackIn_10_5 = var4;
            stackIn_11_6 = !(param0);
            stackIn_10_2[stackIn_10_3] = stackIn_10_4 + ((Nebula) (Object) stackIn_10_5).a(stackIn_11_6);
            stackIn_10_1[1] = var4.a(true) + 16384;
            stackIn_10_1[2] = -16384 + var4.getY((byte) -119);
            stackIn_10_1[3] = var4.getY((byte) -114) + 16384;
            ((fba) (Object) stackIn_10_0).a(stackIn_10_1, (byte) 51, var3, 0);
          }
        }
        stackIn_15_1 = this.ships;
        stackIn_16_2 = !(param0);
        this.a(stackIn_15_1, stackIn_16_2, 1);
        if (hw.field_b == 1) {
          this.a(this.debris, true, 2);
        }
        this.a(this.field_e.c(0), true, 3);
    }

    private final ShipBody b(ShipBody[] param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        ShipBody stackIn_8_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            this.b((faa) null, 103);
          }
          if (param2 < 0) {
            return null;
          }
          if (param0.length <= param2) {
            return null;
          }
          stackIn_8_0 = param0[param2];
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("pe.QB(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, long param1, int param2) {
        faa var4;
        int var5;
        var4 = RequestNewestBlackboxRecording.field_p;
        var4.h(24335, param0);
        var4.position = var4.position + 1;
        var5 = var4.position;
        var4.c(0, 7);
        var4.a(param1, 105);
        var4.e(var4.position - var5, -129);
        if (param2 >= -120) {
          field_d = (String) null;
        }
    }

    final void a(int param0) {
        Ship[] var2;
        int var3;
        int var5;
        Ship[] var6;
        rdb var7;
        Ship var8;
        ResourceNode[] var9;
        ResourceNode var10;
        MapZone[] var11;
        MapZone var12;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = VoidHunters.field_G;
        var6 = this.ships;
        var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
          var8 = var6[var3];
          if (var8 != null) {
            this.a(var8.g((byte) -106), (byte) 4, var8.d(false), var8.g(param0 ^ -63));
          }
        }
        var7 = (rdb) (this.spawnPoints.d(param0 + param0));
        while (var7 != null) {
          this.a(var7.a(71), (byte) 4, var7.a(true), 51200);
          var7 = (rdb) (this.spawnPoints.a((byte) 100));
        }
        if (null != this.resNodes) {
          var9 = this.resNodes;
          for (var3Lifetime1 = 0; var3Lifetime1 < var9.length; var3Lifetime1++) {
            var10 = var9[var3Lifetime1];
            if (null != var10) {
              this.a(var10.y, (byte) 4, var10.x, var10.radius);
            }
          }
        }
        if (this.mapZones != null) {
          var11 = this.mapZones;
          for (var3Lifetime2 = 0; var3Lifetime2 < var11.length; var3Lifetime2++) {
            var12 = var11[var3Lifetime2];
            if (null != var12) {
              this.a(var12.y, var12.x, var12.height, var12.width, (byte) -92);
            }
          }
        }
    }

    private final void l(int param0) {
        int var3 = 0;
        int var4;
        Debris[] var2;
        Debris[] var5;
        var4 = VoidHunters.field_G;
        if (param0 > -82) {
          this.a(82, -2, -88, 15, 61, -108, -2, -18);
        }
        if (this.field_h) {
          return;
        }
        if (null == this.debris) {
          return;
        }
        var5 = this.debris;
        var2 = var5;
        this.debris = new Debris[this.debris.length];
        for (var3 = 0; this.debris.length > var3; var3++) {
          this.debris[var3] = var5[var3];
        }
        this.field_h = true;
        return;
    }

    final Debris i(int param0, int param1) {
        if (param0 != 21363) {
          return (Debris) null;
        }
        param1 = param1 - field_c[1];
        return (Debris) (this.b(this.debris, true, param1));
    }

    private final void a(MissionState param0, Player[] param1, byte param2, MessageLog param3) {
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_379_0 = null;
        StringBuilder stackIn_379_1 = null;
        String stackIn_380_2 = null;
        RuntimeException stackIn_383_0 = null;
        StringBuilder stackIn_383_1 = null;
        RuntimeException stackIn_384_0 = null;
        String stackIn_384_2 = null;
        RuntimeException stackIn_387_0 = null;
        StringBuilder stackIn_387_1 = null;
        RuntimeException stackIn_388_0 = null;
        String stackIn_388_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Ship var10 = null;
        int var10_int = 0;
        MissionVariable[] var10_array = null;
        ShipBody var10_ref = null;
        rdb var10_ref2 = null;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Asteroid[] var14_ref_crb__ = null;
        int var15 = 0;
        Asteroid[] var16_ref_crb__ = null;
        int var16 = 0;
        int var17 = 0;
        Ship var18_ref_sg = null;
        int var18 = 0;
        Asteroid var19_ref_crb = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24 = null;
        Asteroid var25 = null;
        Debris var26 = null;
        Ship var27 = null;
        Random var28 = null;
        Ship var29 = null;
        Ship[] var30 = null;
        Asteroid[] var31 = null;
        Asteroid[] var32 = null;
        Asteroid var33 = null;
        Debris var34 = null;
        Ship var35 = null;
        MapZone var36 = null;
        ResourceNode var37 = null;
        Nebula[] var38 = null;
        Nebula var39 = null;
        Ship[] var40 = null;
        Ship var41 = null;
        Ship var42 = null;
        Asteroid[] var43 = null;
        Asteroid var44 = null;
        Asteroid var45 = null;
        IntrusiveDeque var46 = null;
        Debris[] var47 = null;
        Debris var48 = null;
        Debris var49 = null;
        Ship[] var50 = null;
        Ship var51 = null;
        Ship var52 = null;
        Random var53 = null;
        ShipComponent var54 = null;
        Asteroid var55 = null;
        ShipBody var56 = null;
        ShipBody var57 = null;
        MapZone var58 = null;
        ResourceNode var59 = null;
        Random var60 = null;
        Message var61 = null;
        rdb var62 = null;
        ShipComponent var63 = null;
        Random var64 = null;
        Debris var65 = null;
        ShipComponent var66 = null;
        Ship var67 = null;
        String var68 = null;
        Ship var70 = null;
        Random var71 = null;
        Random var72 = null;
        Ship var73 = null;
        Nebula var74 = null;
        MissionVariable[] var75 = null;
        MapZone var76 = null;
        MapZone var77 = null;
        ShipBody var78 = null;
        Ship[] var79 = null;
        Ship var80 = null;
        int[] var83 = null;
        rdb var84 = null;
        Asteroid var85 = null;
        Debris var86 = null;
        Ship var87 = null;
        var24 = null;
        var23 = VoidHunters.field_G;
        try {
          var5_int = 0;
          var6 = 34 % ((param2 - 53) / 41);
          while (param1.length > var5_int) {
            var7 = param1[var5_int].aimtargetx;
            var8 = param1[var5_int].aimtargety;
            var9 = param1[var5_int].specialorder;
            if (13 == var9) {
              stackIn_8_1 = !(this.debug);
              this.debug = stackIn_8_1;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var9 == 10 &&
              13 == this.field_y) {
              var28 = new Random((long)(var8 * var7));
              var11_int = GetRepairModeRadius.a(-101, 3, SetRepairModeCooldown.e((byte) 107), var28);
              var29 = t.a(var11_int, (byte) 47);
              var29.a(new ShipAI(), 4);
              var29.h(17704, sja.field_c);
              var13 = var7;
              var14 = var8;
              var29.a(var13, var14, (byte) 108);
              var29.a(hob.a(var28, 8192, 122), -103);
              var29.a(false, true, this);
              var15 = 1;
              var30 = this.ships;
              var17 = 0;
              while (var17 < var30.length) {
                var18_ref_sg = var30[var17];
                var41 = var18_ref_sg;
                var42 = var41;
                var10 = var42;
                var41 = var18_ref_sg;
                if (var18_ref_sg != null &&
                  this.a(var29, var18_ref_sg, -69)) {
                  var15 = 0;
                } else {
                  var17++;
                  continue;
                }
                break;
              }
              var16_ref_crb__ = this.field_e.c(0);
              var31 = var16_ref_crb__;
              var18 = 0;
              while (var31.length > var18) {
                var19_ref_crb = var31[var18];
                var44 = var19_ref_crb;
                var25 = var44;
                var44 = var19_ref_crb;
                if (null != var19_ref_crb &&
                  this.a(var29, var19_ref_crb, 63)) {
                  var15 = 0;
                } else {
                  var18++;
                  continue;
                }
                break;
              }
              var17 = this.width >> 1;
              var18 = this.field_r >> 1;
              var19 = -var17;
              var20 = var17;
              var21 = -var18;
              var22 = var18;
              if (var7 < var19 ||
                var7 > var20 ||
                var8 < var21 ||
                var8 > var22) {
                var15 = 0;
              }
              if (var15 == 0) {
                GetFighterVision.a(6811, 6, 1);
                decompiledFrameRemainder0 = false;
              }
              else {
                this.a(var29, (byte) 96);
                if (vqa.field_g != null) {
                  vqa.field_g.d(-31407);
                }
              }
            }
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.debug) {
              if (var9 == 14) {
                var10 = this.d(var5_int, 61);
                var11 = null;
                var12 = 2147483647;
                var79 = this.ships;
                for (var14 = 0; var79.length > var14; var14++) {
                  var80 = var79[var14];
                  var11 = var80;
                  var11 = var80;
                  if (var80 != null &&
                    var80 != var10) {
                    var16 = var80.x - var7;
                    var17 = -var8 + var80.y;
                    var18 = ar.a(var16, (byte) 108, var17);
                    if (var12 > var18) {
                      var12 = var18;
                      var11 = var80;
                    }
                  }
                }
                if ((null != var11)) {
                  if (null != var10) {
                    var10.g(((Ship) (var11)).getOwner((byte) -117), -51);
                    if (-1 == ((Ship) (var11)).getOwner((byte) -117)) {
                      var10.a(new ShipAI(), 4);
                    }
                  }
                  ((Ship) (var11)).g(var5_int, -126);
                  ((Ship) (var11)).a((ShipAI) null, 4);
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                if (var9 == 15) {
                  var32 = this.field_e.c(0);
                  for (var11_int = 0; var32.length > var11_int; var11_int++) {
                    var33 = var32[var11_int];
                    if (var33 != null &&
                      null != var33.chassis.a(var8, var7, true)) {
                      this.a(-105, 2, var33);
                    }
                  }
                  for (var11_int = 0; var11_int < this.debris.length; var11_int++) {
                    var34 = this.debris[var11_int];
                    if (null != var34 &&
                      var34.chassis.a(var8, var7, true) != null) {
                      this.a(-104, 1, var34);
                    }
                  }
                  for (var11_int = 0; var11_int < this.ships.length; var11_int++) {
                    var35 = this.ships[var11_int];
                    var41 = var35;
                    var42 = var41;
                    var10 = var42;
                    var41 = var35;
                    if (var35 != null &&
                      var35.chassis.a(var8, var7, true) != null) {
                      this.a(-107, 0, var35);
                    }
                  }
                  var84 = (rdb) (this.spawnPoints.d(0));
                  while (var84 != null) {
                    if (var84.a(var7, (byte) -81, var8)) {
                      var84.b(-3846);
                    }
                    var84 = (rdb) (this.spawnPoints.a((byte) 106));
                  }
                  if (this.mapZones != null) {
                    for (var11_int = 0; this.mapZones.length > var11_int; var11_int++) {
                      var36 = this.mapZones[var11_int];
                      if (var36.a(var8, var7, (byte) -98)) {
                        this.c(var11_int, (byte) -90);
                        break;
                      }
                    }
                  }
                  if (this.resNodes != null) {
                    for (var11_int = 0; this.resNodes.length > var11_int; var11_int++) {
                      var37 = this.resNodes[var11_int];
                      if (var37.a(var7, (byte) 87, var8)) {
                        this.c((byte) 110, var11_int);
                        break;
                      }
                    }
                  }
                  var38 = this.field_p.a(false);
                  var11 = var38;
                  decompiledFrameRemainder1 = (var11 != null);
                  if (decompiledFrameRemainder1) {
                    var12 = 0;
                    boolean decompiledNaturalLoopExit0 = false;
                    while (!(decompiledNaturalLoopExit0 = (var38.length <= var12))) {
                      var39 = var38[var12];
                      if (!var39.a((byte) 100, var7, var8)) {
                        var12++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledNaturalLoopExit0) {
                      decompiledFrameCompleted0 = false;
                    }
                    if (decompiledFrameCompleted0) {
                      this.b((byte) -89);
                      this.f((byte) -22, var12);
                      decompiledFrameRemainder1 = false;
                    }
                  }
                }
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameCompleted0)) {
                  if (var9 == 16) {
                    var40 = this.ships;
                    for (var11_int = 0; var11_int < var40.length; var11_int++) {
                      var41 = var40[var11_int];
                      var42 = var41;
                      var10 = var42;
                      var42 = var41;
                      var10 = var42;
                      if (null != var41 &&
                        null != var41.chassis.a(var8, var7, true)) {
                        var41.h(17704, (1 + var41.getTeam((byte) 68)) % SettingsChange.field_b);
                      }
                    }
                    var10_ref2 = (rdb) (this.spawnPoints.d(0));
                    while (null != var10_ref2) {
                      if (var10_ref2.a(var7, (byte) -124, var8)) {
                        var10_ref2.a((1 + var10_ref2.getTeam(-29)) % SettingsChange.field_b, (byte) -93);
                      }
                      var10_ref2 = (rdb) (this.spawnPoints.a((byte) 117));
                    }
                  } else {
                    if (var9 != 17) {
                      if (var9 != 18) {
                        if (var9 != 25) {
                          if (var9 != 26) {
                            if (var9 == 27) {
                              if (null != this.missionControl) {
                                this.missionControl.g((byte) 82);
                              }
                            } else {
                              if (var9 == 28) {
                                if (null != this.missionControl) {
                                  this.missionControl.f((byte) -29);
                                }
                              } else {
                                if (var9 != 29) {
                                  if (var9 != 30) {
                                    if (var9 == 31) {
                                      if (this.missionControl != null) {
                                        this.missionControl.a((byte) -120, (MissionCondition) (new VariableCondition(0, 0)));
                                      }
                                    } else {
                                      if (var9 == 32) {
                                        if (this.missionControl != null) {
                                          var10_int = -1;
                                          var78 = this.a((byte) -27, var7, var8);
                                          if (null != var78) {
                                            var10_int = var78.id;
                                          }
                                          this.missionControl.a((byte) -120, (MissionCondition) (new ShipCondition(var10_int, 0)));
                                        }
                                      } else {
                                        if (var9 == 33) {
                                          if (null != this.missionControl) {
                                            this.missionControl.a((byte) -125, (MissionCondition) (new ShipSpawnedCondition(0)));
                                          }
                                        } else {
                                          if (34 != var9) {
                                            if (var9 == 35) {
                                              if (null != this.missionControl) {
                                                this.missionControl.a((MissionAction) (new AwardVictoryToTeamAction()), 0);
                                              }
                                            } else {
                                              if (36 != var9) {
                                                if (var9 != 37) {
                                                  if (var9 != 38) {
                                                    if (39 != var9) {
                                                      if (var9 != 40) {
                                                        if (var9 != 41) {
                                                          if (var9 == 42) {
                                                            if (null != this.missionControl) {
                                                              this.missionControl.e((byte) -99);
                                                            }
                                                          } else {
                                                            if (var9 == 43) {
                                                              if (null != this.missionControl) {
                                                                this.missionControl.b((byte) -128);
                                                              }
                                                            } else {
                                                              if (var9 != 44) {
                                                                if (var9 == 45) {
                                                                  if (this.missionControl != null) {
                                                                    this.missionControl.a(false, this, 0);
                                                                  }
                                                                } else {
                                                                  if (46 != var9) {
                                                                    if (47 == var9) {
                                                                      if (null != this.missionControl) {
                                                                        this.missionControl.a(false, this, 1);
                                                                      }
                                                                    } else {
                                                                      if (var9 == 48) {
                                                                        if (this.missionControl != null) {
                                                                          this.missionControl.a(1, 1, this);
                                                                        }
                                                                      } else {
                                                                        if (var9 == 49) {
                                                                          var77 = new MapZone(var7, var8);
                                                                          this.a(5706, var77);
                                                                        } else {
                                                                          if (var9 != 50) {
                                                                            if (51 == var9) {
                                                                              if (null != this.mapZones) {
                                                                                var10_int = 0;
                                                                                while (var10_int < this.mapZones.length) {
                                                                                  var76 = this.mapZones[var10_int];
                                                                                  if (!var76.a(var8, var7, (byte) -98)) {
                                                                                    var10_int++;
                                                                                    continue;
                                                                                  }
                                                                                  var76.width = (int)((double)var76.width / 1.25);
                                                                                  var76.height = (int)((double)var76.height / 1.25);
                                                                                  break;
                                                                                }
                                                                              }
                                                                            } else {
                                                                              if (var9 != 52) {
                                                                                if (var9 == 53) {
                                                                                  var75 = param0.customVariables;
                                                                                  var10_array = var75;
                                                                                  if (null != var10_array) {
                                                                                    for (var11_int = 0; var75.length > var11_int; var11_int++) {
                                                                                      if (null != var75[var11_int]) {
                                                                                        var75[var11_int].value = var75[var11_int].value / 2;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  switch (var9) {
                                                                                    case 55:
                                                                                      param0.a(127);
                                                                                      break;
                                                                                    case 19:
                                                                                      var74 = new Nebula(var7, var8);
                                                                                      this.b((byte) 60);
                                                                                      this.a(var74, 0);
                                                                                      break;
                                                                                    case 24:
                                                                                      this.e((int)((double)this.field_r / 1.1), 0);
                                                                                      break;
                                                                                    case 57:
                                                                                      var72 = new Random((long)(var7 * var8));
                                                                                      var73 = t.a(hob.a(var72, 12, 126) + 0, (byte) 42);
                                                                                      var73.a(new ShipAI(), 4);
                                                                                      var73.h(17704, sja.field_c);
                                                                                      var12 = var7;
                                                                                      var13 = var8;
                                                                                      var73.a(var12, var13, (byte) 52);
                                                                                      var73.a(hob.a(var72, 8192, 118), -82);
                                                                                      this.a(var73, (byte) 80);
                                                                                      break;
                                                                                    case 58:
                                                                                      var71 = new Random((long)(var7 * var8));
                                                                                      var68 = "AAQPKAASAhIDKAESAygAEgISAygBEgMoABICEgMoARIDKAASAhIDKAESAygAEgISAygBEgMoABICEgMoARIDKAASAhIDKAESAygAEgISAygBEgMoABICEgMoARIDKAASAhIDKAESAygAEgISAygBEgMoABICEgMoARIDKAASAhIDKAESAygAEgISAygBEgMoABICEgMoARIDKAASAhIDKAESBRL-BBIGEgUS-wQSBhIFEv8EEgYSBRL-BBIGEgUS-wQSBhIFEv8EEgYSBRL-BBIGEgUS-wQSBhIFEv8EEgYSBRL-BBIGEgUS-wQSBhIFEv8EEgYSBRL-BBIGEgUS-wQSBhIFEv8EEgYSBRL-BBIGEg";
                                                                                      var83 = GetResourceNodeCaptureTime.a(var68, true, true);
                                                                                      var70 = ae.a(var83, (byte) 126);
                                                                                      var70.a(new ShipAI(), 4);
                                                                                      var70.h(17704, sja.field_c);
                                                                                      var14 = var7;
                                                                                      var15 = var8;
                                                                                      var70.a(var14, var15, (byte) 100);
                                                                                      var70.a(hob.a(var71, 8192, 120), -51);
                                                                                      this.a(var70, (byte) 81);
                                                                                      break;
                                                                                    default:
                                                                                      if (var9 >= 72) {
                                                                                        var10_int = -72 + var9;
                                                                                        if (SetMassDriverAimarc.a(130, var10_int)) {
                                                                                          var66 = new ShipComponent(var10_int);
                                                                                          var67 = new Ship();
                                                                                          var67.chassis = var66;
                                                                                          var67.e((byte) 119);
                                                                                          var67.a(var7, var8, (byte) 42);
                                                                                          this.a(var67, (byte) 83);
                                                                                        } else {
                                                                                          if (fbb.b(var10_int, 15923)) {
                                                                                            var63 = new ShipComponent(var10_int);
                                                                                            var65 = new Debris(var63, false);
                                                                                            var64 = new Random((long)var7);
                                                                                            var65.a(hob.a(var64, 8192, 121), -95);
                                                                                            var65.a(var7, var8, (byte) -62);
                                                                                            this.a(var65, (byte) 54);
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      break;
                                                                                    case 23:
                                                                                      this.e((int)(1.1 * (double)this.field_r), 0);
                                                                                      break;
                                                                                    case 22:
                                                                                      this.a((int)((double)this.width / 1.1), (byte) 72);
                                                                                      break;
                                                                                    case 21:
                                                                                      this.a((int)((double)this.width * 1.1), (byte) 53);
                                                                                      break;
                                                                                    case 20:
                                                                                      var62 = new rdb(var7, var8, 0);
                                                                                      this.a((byte) -59, var62);
                                                                                      break;
                                                                                    case 56:
                                                                                      var60 = new Random((long)(var7 * var8));
                                                                                      var11_int = hob.a(var60, 5, 123);
                                                                                      var61 = new Message(var11_int, 0, 0);
                                                                                      param3.a(var61, true);
                                                                                      break;
                                                                                    case 54:
                                                                                      param0.b(false);
                                                                                      break;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                var59 = new ResourceNode(var7, var8);
                                                                                this.a(var59, (byte) -38);
                                                                              }
                                                                            }
                                                                          } else {
                                                                            if (null != this.mapZones) {
                                                                              var10_int = 0;
                                                                              while (this.mapZones.length > var10_int) {
                                                                                var58 = this.mapZones[var10_int];
                                                                                var76 = var58;
                                                                                var76 = var58;
                                                                                if (!var58.a(var8, var7, (byte) -98)) {
                                                                                  var10_int++;
                                                                                  continue;
                                                                                }
                                                                                var58.height = (int)(1.25 * (double)var58.height);
                                                                                var58.width = (int)((double)var58.width * 1.25);
                                                                                break;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (null != this.missionControl) {
                                                                      this.missionControl.a(1, 0, this);
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (null != this.missionControl) {
                                                                  this.missionControl.a(-828);
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          if (this.missionControl != null) {
                                                            this.missionControl.a((MissionAction) (new AdjustVariableAction(0, 0)), 0);
                                                          }
                                                        }
                                                      } else {
                                                        if (null != this.missionControl) {
                                                          this.missionControl.a((MissionAction) (new AdjustBodyComponentsAction(0, 0)), 0);
                                                        }
                                                      }
                                                    } else {
                                                      if (this.missionControl != null) {
                                                        var57 = this.a((byte) -20, var7, var8);
                                                        var11_int = -1;
                                                        if (var57 != null) {
                                                          var11_int = var57.id;
                                                        }
                                                        this.missionControl.a((MissionAction) (new SetShipTeamAction(var11_int, 0)), 0);
                                                      }
                                                    }
                                                  } else {
                                                    if (null != this.missionControl) {
                                                      this.missionControl.a((MissionAction) (new SetVariableLabelAction(0, 0)), 0);
                                                    }
                                                  }
                                                } else {
                                                  if (this.missionControl != null) {
                                                    this.missionControl.a((MissionAction) (new IncrementVariableAction(0, 0)), 0);
                                                  }
                                                }
                                              } else {
                                                if (null != this.missionControl) {
                                                  this.missionControl.a((MissionAction) (new SetVariableAction(0, 0)), 0);
                                                }
                                              }
                                            }
                                          } else {
                                            if (null != this.missionControl) {
                                              this.missionControl.a((byte) -120, (MissionCondition) (new TeamNodeCondition(0)));
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (this.missionControl != null &&
                                      this.mapZones != null) {
                                      var10_int = -1;
                                      var56 = this.a((byte) -116, var7, var8);
                                      if (null != var56) {
                                        var10_int = var56.id;
                                      }
                                      this.missionControl.a((byte) -124, (MissionCondition) (new BodyInZoneCondition(var10_int, 0)));
                                    }
                                  }
                                } else {
                                  if (null != this.missionControl) {
                                    var10_ref = this.a((byte) -48, var7, var8);
                                    if (null != var10_ref) {
                                      this.missionControl.a((byte) -126, (MissionCondition) (new BodyCondition(var10_ref.id)));
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (this.missionControl != null) {
                              this.missionControl.c((byte) 55);
                            }
                          }
                        } else {
                          if (this.missionControl == null) {
                            this.missionControl = new MissionControl();
                          }
                          this.missionControl.c(0);
                        }
                      } else {
                        var53 = new Random((long)(var7 * var8));
                        var54 = new ShipComponent(gnb.a(var53, (byte) 55));
                        var55 = new Asteroid(var54);
                        var55.a(var7, var8, (byte) -49);
                        this.a((byte) 126, var55);
                      }
                    } else {
                      var42 = this.d(var5_int, 73);
                      var10 = var42;
                      if (var42 != null) {
                        var11_int = var42.d(false);
                        var12 = var42.g((byte) -107);
                        var46 = new IntrusiveDeque();
                        var14_ref_crb__ = this.field_e.c(0);
                        var43 = var14_ref_crb__;
                        for (var16 = 0; var43.length > var16; var16++) {
                          var44 = var43[var16];
                          var25 = var44;
                          var25 = var44;
                          if (null != var44 &&
                            var44.chassis.a(var8, var7, true) != null) {
                            var45 = new Asteroid();
                            var44.b((byte) 76, var45);
                            var45.a(var11_int, var12, (byte) -93);
                            var46.b(-10258, var45);
                          }
                        }
                        var85 = (Asteroid) (var46.d(0));
                        while (var85 != null) {
                          this.a((byte) 126, var85);
                          var85 = (Asteroid) (var46.a((byte) 80));
                        }
                        var46.e(95);
                        var47 = this.debris;
                        for (var16 = 0; var16 < var47.length; var16++) {
                          var48 = var47[var16];
                          var26 = var48;
                          var26 = var48;
                          if (var48 != null &&
                            null != var48.chassis.a(var8, var7, true)) {
                            var49 = new Debris();
                            var48.b((byte) 87, var49);
                            var49.a(var11_int, var12, (byte) -122);
                            var46.b(-10258, var49);
                          }
                        }
                        var86 = (Debris) (var46.d(0));
                        while (var86 != null) {
                          this.a(var86, (byte) 51);
                          var86 = (Debris) (var46.a((byte) 8));
                        }
                        var46.e(107);
                        var50 = this.ships;
                        for (var16 = 0; var50.length > var16; var16++) {
                          var51 = var50[var16];
                          var27 = var51;
                          var27 = var51;
                          if (var51 != null &&
                            var51.getOwner((byte) -117) == -1 &&
                            null != var51.chassis.a(var8, var7, true)) {
                            var52 = new Ship();
                            var51.b((byte) 111, var52);
                            var52.a(var11_int, var12, (byte) 39);
                            var52.a(var42.e(0), -82);
                            var52.h(17704, var42.getTeam((byte) 125));
                            var46.b(-10258, var52);
                          }
                        }
                        var87 = (Ship) (var46.d(0));
                        while (null != var87) {
                          this.a(var87, (byte) 82);
                          var87 = (Ship) (var46.a((byte) 122));
                        }
                      }
                    }
                  }
                }
              }
            }
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_379_0 = var5;
          stackIn_379_1 = new StringBuilder().append("pe.JD(");
          if (param0 == null) {
            stackIn_380_2 = "null";
          } else {
            stackIn_380_2 = "{...}";
          }
          stackIn_383_0 = stackIn_379_0;
          stackIn_383_1 = ((StringBuilder) (Object) stackIn_379_1).append(stackIn_380_2).append(',');
          if (param1 == null) {
            stackIn_384_0 = stackIn_383_0;
            stackIn_384_2 = "null";
          } else {
            stackIn_384_0 = stackIn_379_0;
            stackIn_384_2 = "{...}";
          }
          stackIn_387_0 = stackIn_384_0;
          stackIn_387_1 = ((StringBuilder) (Object) stackIn_383_1).append(stackIn_384_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_388_0 = stackIn_387_0;
            stackIn_388_2 = "null";
          } else {
            stackIn_388_0 = stackIn_384_0;
            stackIn_388_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_388_0), ((StringBuilder) (Object) stackIn_387_1).append(stackIn_388_2).append(')').toString());
        }
    }

    final ShipBody g(byte param0, int param1) {
        int var3;
        int var4_int;
        Debris var5;
        int var6;
        Ship var4;
        int var7;
        int var3Lifetime1;
        var6 = VoidHunters.field_G;
        var3 = 0;
        var4_int = -108 % ((-71 - param0) / 44);
        while (var3 < this.debris.length) {
          var5 = this.debris[var3];
          if (var5 != null &&
            var5.chassis.a(param1, 0) > 0) {
            return (ShipBody) ((Object) var5);
          }
          var3++;
        }
        var7 = 0;
        var3Lifetime1 = var7;
        while (var7 < this.ships.length) {
          var4 = this.ships[var7];
          if (null != var4 &&
            var4.chassis.a(param1, 0) > 0) {
            return (ShipBody) ((Object) var4);
          }
          var7++;
        }
        return null;
    }

    final boolean b(int param0, int param1) {
        int var5 = VoidHunters.field_G;
        Projectile var6 = (Projectile) (this.projectiles.d(0));
        while (var6 != null) {
          if (var6.getType((byte) -104) == 6 &&
            param0 == var6.getTargetBody((byte) -119)) {
            return true;
          }
          var6 = (Projectile) (this.projectiles.a((byte) 40));
        }
        int var4 = -114 % ((69 - param1) / 37);
        return false;
    }

    final boolean a(int param0, int param1, boolean param2, int param3) {
        Ship[] var5;
        rdb var5_ref;
        int var6;
        int var7;
        Ship var7_ref_sg;
        int var8;
        int var9;
        int var10;
        int var11;
        Ship[] var12;
        int var6Lifetime1;
        int var8Lifetime1;
        var11 = VoidHunters.field_G;
        var12 = this.ships;
        var5 = var12;
        for (var6 = 0; var12.length > var6; var6++) {
          var7_ref_sg = var12[var6];
          if (var7_ref_sg != null &&
            var7_ref_sg.getTeam((byte) 116) >= 0 &&
            var7_ref_sg.getTeam((byte) 73) < SetMissionTerrainAsteroidProbability.field_p) {
            var8 = -param3 + var7_ref_sg.x;
            var9 = -param1 + var7_ref_sg.y;
            var10 = ar.a(var8, (byte) 123, var9);
            if (var7_ref_sg.g(-80) + param0 >= var10) {
              return true;
            }
          }
        }
        var5_ref = (rdb) (this.spawnPoints.d(0));
        if (param2) {
          this.projectiles = (IntrusiveDeque) null;
        }
        while (null != var5_ref) {
          if (var5_ref != null) {
            var6Lifetime1 = -param3 + var5_ref.a(true);
            var7 = var5_ref.a(82) - param1;
            var8Lifetime1 = ar.a(var6Lifetime1, (byte) 104, var7);
            if (var8Lifetime1 <= 51200 + param0) {
              return true;
            }
          }
          var5_ref = (rdb) (this.spawnPoints.a((byte) 107));
        }
        return false;
    }

    final void a(int param0, MapZone param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5706) {
            this.debris = (Debris[]) null;
          }
          this.mapZones = (MapZone[]) (ija.a(param1, this.mapZones, param0 - 5706, wsb.field_e));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("pe.HB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final GrapplingHook h(int param0, int param1) {
        int var3 = 63 / ((param1 + 59) / 42);
        param0 = param0 - field_c[3];
        if (param0 < 0) {
          return null;
        }
        return (GrapplingHook) (this.b(this.grapplingHooks, true, param0));
    }

    private final void a(ShipBody param0, ShipBody param1, gda param2, int param3, boolean param4) {
        int stackIn_36_0 = 0;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        String stackIn_94_2 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        wfb var7 = null;
        int var8 = 0;
        ShipComponent var9 = null;
        wfb var10 = null;
        int var11 = 0;
        int var12 = 0;
        Ship var13_ref_sg = null;
        int var13 = 0;
        Ship var14_ref_sg = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ShipComponent var20 = null;
        int var18Lifetime1;
        int var18Lifetime2;
        try {
          var20 = param2.field_h;
          var7 = var20.i((byte) -112);
          var8 = var7.field_q;
          var9 = param2.field_m;
          var10 = var9.i((byte) -112);
          if (!param4 &&
            var20.componentTypeId != 22 &&
            var9.componentTypeId != 22) {
            return;
          }
          var11 = param0 instanceof Ship ? 1 : 0;
          var12 = param1 instanceof Ship ? 1 : 0;
          if (var11 != 0 &&
            var12 != 0) {
            var13_ref_sg = (Ship) (param0);
            var14_ref_sg = (Ship) (param1);
            var13_ref_sg.c(var14_ref_sg.getOwner((byte) -117), 19581);
            var14_ref_sg.c(var13_ref_sg.getOwner((byte) -117), 19581);
          }
          var13 = var10.field_q;
          var14 = 0;
          var15 = 0;
          var16 = 0;
          if (null != var20.weaponbehaviour &&
            0 < var20.weaponbehaviour.a((byte) 24).b((byte) 63)) {
            var18 = ShipSpawnedCondition.field_d * var20.weaponbehaviour.reload >> 4;
            var8 = var7.field_q * var18;
            if (1 < var18) {
              var14 = 1;
            }
            var15 = 1;
          }
          var17 = 0;
          if (var9.weaponbehaviour != null &&
            0 < var9.weaponbehaviour.a((byte) 24).b((byte) 71)) {
            var18Lifetime1 = ShipSpawnedCondition.field_d * var9.weaponbehaviour.reload >> 4;
            if (var18Lifetime1 > 1) {
              var16 = 1;
            }
            var17 = 1;
            var13 = var18Lifetime1 * var10.field_q;
          }
          if (var20.i((byte) -112).field_r) {
            var15 = 1;
          }
          if (var9.i((byte) -112).field_r) {
            var17 = 1;
          }
          stackIn_36_0 = (!var20.k((byte) 69)) ? 0 : 1;
          var18Lifetime2 = stackIn_36_0;
          var19 = var9.k((byte) 48) ? 1 : 0;
          if (var18Lifetime2 == 0 &&
            var19 == 0) {
            if ((var15 == 0 ||
              var17 != 0) &&
              (var12 == 0 ||
              !((Ship) (param1)).j((byte) 103))) {
              var20.a(var13, (byte) -119);
            }
            if ((var17 == 0 ||
              var15 != 0) &&
              (var11 == 0 ||
              !((Ship) (param0)).j((byte) -74))) {
              var9.a(var8, (byte) -125);
            }
            if (null != var20.weaponbehaviour &&
              var20.weaponbehaviour.a((byte) 24).b((byte) 101) > 0) {
              var20.weaponbehaviour.reload = var20.weaponbehaviour.reload * 3 / 4;
            }
            if (var9.weaponbehaviour != null &&
              var9.weaponbehaviour.a((byte) 24).b((byte) 47) > 0) {
              var9.weaponbehaviour.reload = var9.weaponbehaviour.reload * 3 / 4;
            }
          }
          if ((var14 != 0 ||
            !(var10.field_y <= 0)) &&
            var19 != 0) {
            param0.chassis.a(true, var9, this, 101, param0);
            param0.chassis.a((byte) -125, param0);
            if (var10.field_y > 0) {
              this.a((byte) -44, param0, var9, var10);
            }
          }
          if ((var16 != 0 ||
            !(var7.field_y <= 0)) &&
            var18Lifetime2 != 0) {
            param1.chassis.a(true, var20, this, 62, param1);
            param1.chassis.a((byte) 116, param1);
            if (var7.field_y > 0) {
              this.a((byte) -44, param1, var20, var7);
            }
          }
          if (var14 != 0 &&
            !var20.k((byte) 91)) {
            GetGrapplingHookAimarc.a(param2.field_l, param1.id, 46, -126, param2.field_e);
            this.a(var8 >> 8, param2.field_l, var7.field_v, (byte) -82, param2.field_e, var20.finaly, var20.finalx);
          }
          if (var16 != 0 &&
            !var9.k((byte) 118)) {
            GetGrapplingHookAimarc.a(param2.field_l, param0.id, 46, -89, param2.field_e);
            this.a(var13 >> 8, param2.field_l, var10.field_v, (byte) -13, param2.field_e, var9.finaly, var9.finalx);
          }
          if (param3 != 46) {
            this.reportDifferences((tv) null, -125);
          }
          param0.d((byte) 71);
          param1.d((byte) 107);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_89_0 = var6;
          stackIn_89_1 = new StringBuilder().append("pe.VA(");
          if (param0 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          stackIn_93_0 = stackIn_89_0;
          stackIn_93_1 = ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',');
          if (param1 == null) {
            stackIn_94_0 = stackIn_93_0;
            stackIn_94_2 = "null";
          } else {
            stackIn_94_0 = stackIn_89_0;
            stackIn_94_2 = "{...}";
          }
          stackIn_97_0 = stackIn_94_0;
          stackIn_97_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_94_2).append(',');
          if (param2 == null) {
            stackIn_98_0 = stackIn_97_0;
            stackIn_98_2 = "null";
          } else {
            stackIn_98_0 = stackIn_94_0;
            stackIn_98_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_98_0), ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(byte param0, Projectile param1, boolean param2) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        try {
          if (RoundResult.field_c.a((byte) 92)) {
            param1.a(false, gab.field_b, RoundResult.field_c.field_b, RoundResult.field_c.field_a);
            RoundResult.field_c.a(2147483647);
          }
          if (gab.field_b.a((byte) 123)) {
            gab.field_b.a(this, -1, wgb.field_i, param2);
            gab.field_b.b((byte) -113);
          }
          var4_int = 1 % ((30 - param0) / 36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("pe.IB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final ShipBody d(byte param0, int param1) {
        ShipBody var3;
        ShipBody var3Lifetime1;
        ShipBody var3Lifetime2;
        ShipBody var3Lifetime3;
        if (param1 < 0) {
          return null;
        }
        var3 = this.b(this.ships, true, param1);
        if (null != var3) {
          return var3;
        }
        param1 = param1 - field_w[0];
        var3Lifetime1 = this.b(this.debris, true, param1);
        if (param0 != -27) {
          return (ShipBody) null;
        }
        if (var3Lifetime1 != null) {
          return var3Lifetime1;
        }
        param1 = param1 - field_w[1];
        var3Lifetime2 = this.b(this.field_e.c(0), true, param1);
        if (var3Lifetime2 != null) {
          return var3Lifetime2;
        }
        param1 = param1 - field_w[2];
        var3Lifetime3 = this.b(this.grapplingHooks, true, param1);
        return var3Lifetime3;
    }

    final EscapePod a(byte param0, int param1) {
        int var5 = 0;
        int var3;
        EscapePod[] var4;
        EscapePod var6;
        int var7;
        var7 = VoidHunters.field_G;
        if (this.escapePods == null) {
          return null;
        }
        var3 = -102 % ((-32 - param0) / 63);
        var4 = this.escapePods;
        for (var5 = 0; var4.length > var5; var5++) {
          var6 = var4[var5];
          if (var6.owner == param1) {
            return var6;
          }
        }
        return null;
    }

    final void a(int param0, int param1, ShipBody param2) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        try {
          var4_int = -field_c[param1] + param2.id;
          if (var4_int < 0) {
            return;
          }
          var5 = null;
          var6 = -1;
          var7 = param1;
          if (var7 != 0) {
            if (var7 != 1) {
              if (var7 == 2) {
                var6 = 3;
                var5 = this.field_e.c(0);
                this.field_e.b(-89);
              } else {
                if (3 == var7) {
                  var5 = this.grapplingHooks;
                }
              }
            } else {
              this.l(-96);
              if (1 == hw.field_b) {
                var6 = 2;
              }
              var5 = this.debris;
            }
          } else {
            var5 = this.ships;
            var6 = 1;
          }
          if (param0 >= -96) {
            this.field_q = true;
          }
          if (var5 != null &&
            java.lang.reflect.Array.getLength(var5) > var4_int) {
            ((Object[]) (var5))[var4_int] = null;
          }
          if (var6 != -1) {
            this.field_u.a(param2.id, param2.boundingbox, var6, (byte) -94);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_34_0 = var4;
          stackIn_34_1 = new StringBuilder().append("pe.GE(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        Object var6 = null;
        World var6_ref = null;
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        Object var13 = null;
        Object var14 = null;
        var6 = null;
        var5 = VoidHunters.field_G;
        try {
          var6_ref = (World) (param1);
          var6_ref.ships = (Ship[]) (sqb.a(var6_ref.ships, this.ships, 1, MissionGenerationData.field_a, false));
          if (this.debug) {
            if (VoidHunters.a(true, this.ships)) {
              System.err.println("Ship[] ships the actual object has a duplicate reference");
            }
            var7 = tjb.a(this.ships, 0);
            if (null != var7) {
              System.err.println("An element of Ship[] ships has a duplicate reference - " + var7.toString());
            }
          }
          var6_ref.field_s = (Particle[]) (sqb.a(var6_ref.field_s, this.field_s, 1, AdjustBodyComponentsAction.field_c, false));
          if (this.debug) {
            if (VoidHunters.a(true, this.field_s)) {
              System.err.println("Particle[] particles the actual object has a duplicate reference");
            }
            var8 = tjb.a(this.field_s, 0);
            if (var8 != null) {
              System.err.println("An element of Particle[] particles has a duplicate reference - " + var8.toString());
            }
          }
          var6_ref.projectiles = SetBloomCoefficientPercentage.a(var6_ref.projectiles, this.projectiles, 1, aba.field_b, -90);
          if (this.debug) {
            if (VoidHunters.a(true, this.projectiles)) {
              System.err.println("linklist<voidhunters.common.worldstate.Projectile> projectiles the actual object has a duplicate reference");
            }
            var9 = nqa.a(this.projectiles, 12642);
            if (var9 != null) {
              System.err.println("An element of linklist<voidhunters.common.worldstate.Projectile> projectiles has a duplicate reference - " + var9.toString());
            }
          }
          this.field_h = false;
          var6_ref.debris = this.debris;
          var6_ref.field_h = false;
          if (this.field_e == null) {
            var6_ref.field_e = null;
          } else {
            if (null == var6_ref.field_e) {
              var6_ref.field_e = new AsteroidField();
            }
            this.field_e.b((byte) 79, var6_ref.field_e);
            if (this.debug &&
              VoidHunters.a(true, this.field_e)) {
              System.err.println("AsteroidContainer asteroid_container has a duplicate reference");
            }
          }
          var6_ref.spawnPoints = SetBloomCoefficientPercentage.a(var6_ref.spawnPoints, this.spawnPoints, 1, GetBombletSprayProjectileDamage.field_q, 88);
          if (this.debug) {
            if (VoidHunters.a(true, this.spawnPoints)) {
              System.err.println("linklist<voidhunters.common.worldstate.SpawnPoint> spawn_points the actual object has a duplicate reference");
            }
            var10 = nqa.a(this.spawnPoints, 12642);
            if (var10 != null) {
              System.err.println("An element of linklist<voidhunters.common.worldstate.SpawnPoint> spawn_points has a duplicate reference - " + var10.toString());
            }
          }
          var6_ref.grapplingHooks = (GrapplingHook[]) (sqb.a(var6_ref.grapplingHooks, this.grapplingHooks, 1, TickCondition.field_c, false));
          if (this.debug) {
            if (VoidHunters.a(true, this.grapplingHooks)) {
              System.err.println("GrapplingHook[] grappling_hooks the actual object has a duplicate reference");
            }
            var11 = tjb.a(this.grapplingHooks, 0);
            if (null != var11) {
              System.err.println("An element of GrapplingHook[] grappling_hooks has a duplicate reference - " + var11.toString());
            }
          }
          var6_ref.respawntimers = SetTeamSelectionSpeedup.a(var6_ref.respawntimers, (byte) -66, this.respawntimers);
          var6_ref.debug = this.debug;
          if (param0 < 54) {
            this.a((byte) -80, (tv) null);
          }
          var6_ref.field_y = this.field_y;
          var6_ref.swappedTeams = this.swappedTeams;
          if (this.missionControl != null) {
            if (null == var6_ref.missionControl) {
              var6_ref.missionControl = new MissionControl();
            }
            this.missionControl.b((byte) 87, var6_ref.missionControl);
            if (this.debug &&
              VoidHunters.a(true, this.missionControl)) {
              System.err.println("MissionControl mission_control has a duplicate reference");
            }
          } else {
            var6_ref.missionControl = null;
          }
          var6_ref.mapZones = (MapZone[]) (sqb.a(var6_ref.mapZones, this.mapZones, 1, wsb.field_e, false));
          if (this.debug) {
            if (VoidHunters.a(true, this.mapZones)) {
              System.err.println("MapZone[] map_zones the actual object has a duplicate reference");
            }
            var12 = tjb.a(this.mapZones, 0);
            if (null != var12) {
              System.err.println("An element of MapZone[] map_zones has a duplicate reference - " + var12.toString());
            }
          }
          var6_ref.resNodes = (ResourceNode[]) (sqb.a(var6_ref.resNodes, this.resNodes, 1, SetShipDirectionArrow.field_p, false));
          if (this.debug) {
            if (VoidHunters.a(true, this.resNodes)) {
              System.err.println("ResourceNode[] res_nodes the actual object has a duplicate reference");
            }
            var13 = tjb.a(this.resNodes, 0);
            if (var13 != null) {
              System.err.println("An element of ResourceNode[] res_nodes has a duplicate reference - " + var13.toString());
            }
          }
          var6_ref.field_p = this.field_p;
          this.field_q = false;
          var6_ref.width = this.width;
          var6_ref.field_r = this.field_r;
          var6_ref.field_q = false;
          if (null != this.field_u) {
            if (var6_ref.field_u == null) {
              var6_ref.field_u = new fba();
            }
            this.field_u.b((byte) 122, var6_ref.field_u);
            if (this.debug &&
              VoidHunters.a(true, this.field_u)) {
              System.err.println("PartitioningManager grid has a duplicate reference");
            }
          } else {
            var6_ref.field_u = null;
          }
          var6_ref.escapePods = (EscapePod[]) (sqb.a(var6_ref.escapePods, this.escapePods, 1, pgb.field_g, false));
          if (this.debug) {
            if (VoidHunters.a(true, this.escapePods)) {
              System.err.println("EscapePod[] escape_pods the actual object has a duplicate reference");
            }
            var14 = tjb.a(this.escapePods, 0);
            if (var14 != null) {
              System.err.println("An element of EscapePod[] escape_pods has a duplicate reference - " + var14.toString());
            }
          }
          var6_ref.field_b = this.field_b;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("pe.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(')').toString());
        }
    }

    final void a(MissionEvent param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == this.missionControl) {
            this.missionControl = new MissionControl();
          }
          if (param1 != -38) {
            this.ships = (Ship[]) null;
          }
          this.missionControl.a(0, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("pe.AF(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        boolean stackIn_57_0 = false;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        World var5 = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = 33 % ((22 - param0) / 59);
          var5 = (World) (param1);
          if (!SetCountermeasureLauncherAimspeed.a(var5.ships, false, 1, this.ships, 126) &&
            !SetCountermeasureLauncherAimspeed.a(hob.a(var5.projectiles, 210377952), false, 1, hob.a(this.projectiles, 210377952), -79) &&
            !SetCountermeasureLauncherAimspeed.a(var5.debris, false, 1, this.debris, 117)) {
            stackIn_7_0 = (this.field_e != null) ? 0 : 1;
            stackIn_10_0 = stackIn_7_0;
            if (var5.field_e != null) {
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = 0;
            } else {
              stackIn_11_0 = stackIn_7_0;
              stackIn_11_1 = 1;
            }
            if ((stackIn_11_0 ^ stackIn_11_1) == 0 && (null == this.field_e ||
              !this.field_e.a((byte) -65, var5.field_e)) && (!SetCountermeasureLauncherAimspeed.a(hob.a(var5.spawnPoints, 210377952), false, 1, hob.a(this.spawnPoints, 210377952), -93) &&
              !SetCountermeasureLauncherAimspeed.a(var5.grapplingHooks, false, 1, this.grapplingHooks, 122) &&
              !SetBlueprintSaveTime.a(var5.respawntimers, this.respawntimers, (byte) 28))) {
              stackIn_22_0 = (var5.debug) ? 0 : 1;
              if (stackIn_22_0 != (this.debug ? 1 : 0) &&
                var5.field_y == this.field_y &&
                var5.swappedTeams == this.swappedTeams) {
                stackIn_29_0 = (var5.missionControl != null) ? 0 : 1;
                stackIn_32_0 = stackIn_29_0;
                if (null != this.missionControl) {
                  stackIn_33_0 = stackIn_32_0;
                  stackIn_33_1 = 0;
                } else {
                  stackIn_33_0 = stackIn_29_0;
                  stackIn_33_1 = 1;
                }
                if ((stackIn_33_0 ^ stackIn_33_1) == 0 && (null == this.missionControl ||
                  !this.missionControl.a((byte) 123, var5.missionControl)) && (!SetCountermeasureLauncherAimspeed.a(var5.mapZones, false, 1, this.mapZones, -71) &&
                  !SetCountermeasureLauncherAimspeed.a(var5.resNodes, false, 1, this.resNodes, -5) &&
                  var5.width == this.width &&
                  var5.field_r == this.field_r &&
                  !SetCountermeasureLauncherAimspeed.a(var5.escapePods, false, 1, this.escapePods, -20))) {
                  stackIn_46_0 = (null != this.field_b) ? 0 : 1;
                  stackIn_49_0 = stackIn_46_0;
                  if (null != var5.field_b) {
                    stackIn_50_0 = stackIn_49_0;
                    stackIn_50_1 = 0;
                  } else {
                    stackIn_50_0 = stackIn_46_0;
                    stackIn_50_1 = 1;
                  }
                  if ((stackIn_50_0 ^ stackIn_50_1) == 0 && (this.field_b == null ||
                    !this.field_b.a((byte) 89, var5.field_b))) {
                    stackIn_57_0 = false;
                    decompiledFrameRemainder0 = false;
                  }
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_57_0 = true;
          }
          return stackIn_57_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_61_0 = var3;
          stackIn_61_1 = new StringBuilder().append("pe.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(')').toString());
        }
    }

    private final boolean a(ShipComponent param0, ShipComponent param1, int param2, Ship param3, int param4) {
        int var6_int = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        ShipComponent var7 = null;
        Object var8 = null;
        int var10 = 0;
        var10 = VoidHunters.field_G;
        try {
          if (param0.hardpoints != null) {
            for (var6_int = 0; var6_int < param0.hardpoints.length; var6_int++) {
              var7 = param0.d(param0.hardpoints[var6_int].connectedComponentIdx, 692);
              var8 = null;
              if (null != param1 &&
                null != param1.hardpoints &&
                param1.hardpoints.length == param0.hardpoints.length) {
                var8 = param1.d(param1.hardpoints[var6_int].connectedComponentIdx, 692);
              }
              if (null != var7 &&
                param4 == var7.getComponentTypeId(param2 + 0) && (var8 == null ||
                ((ShipComponent) (var8)).getComponentTypeId(0) != var7.getComponentTypeId(param2 ^ 0))) {
                var7.a(this, (byte) -111, (ShipBody) (param3));
                param0.a(false, var7, this, param2 ^ 94, param3);
                qba.a(20382, param3.d(false), 8, param3.g((byte) -90), 5);
                return true;
              }
              if (null != var7 &&
                this.a(var7, (ShipComponent) (var8), 0, param3, param4)) {
                return true;
              }
            }
          }
          if (param2 == 0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("pe.T(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_35_0 = stackIn_31_0;
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param1 == null) {
            stackIn_36_0 = stackIn_35_0;
            stackIn_36_2 = "null";
          } else {
            stackIn_36_0 = stackIn_31_0;
            stackIn_36_2 = "{...}";
          }
          stackIn_39_0 = stackIn_36_0;
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_40_0 = stackIn_39_0;
            stackIn_40_2 = "null";
          } else {
            stackIn_40_0 = stackIn_36_0;
            stackIn_40_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param4).append(')').toString());
        }
    }

    final rca a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var21 = 0;
        int var7;
        int var8;
        Asteroid[] var9;
        rca var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        Asteroid[] var19_ref_crb__;
        int var19;
        int var20_int;
        Ship[] var20;
        Asteroid var21_ref_crb;
        int var22_int;
        Ship var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var23Lifetime1;
        int var24Lifetime1;
        int var25Lifetime1;
        var26 = VoidHunters.field_G;
        var7 = 32768;
        var8 = 0;
        var9 = this.field_e.c(param2);
        var10 = new rca();
        var11 = -(param5 / 2) + param3;
        var11 = Math.max(var11, var7 - this.width / 2);
        var12 = param5 / 2 + param3;
        var12 = Math.min(var12, -var7 + this.width / 2);
        var13 = param0 - param1 / 2;
        var13 = Math.max(var13, var7 - this.field_r / 2);
        var14 = param1 / 2 + param0;
        var14 = Math.min(var14, this.field_r / 2 - var7);
        var15 = 0;
        while (true) {
          if (var15 >= 100) {
            return var10;
          }
          var16 = hob.a(GetFogOfWarSensorRange.field_o, -var11 + var12, 124) + var11;
          var17 = hob.a(GetFogOfWarSensorRange.field_o, -var13 + var14, 123) + var13;
          var18 = 1;
          var19_ref_crb__ = var9;
          var20_int = 0;
          scanLoop1: while (true) {
            if (var19_ref_crb__.length > var20_int) {
              var21_ref_crb = var19_ref_crb__[var20_int];
              if (var21_ref_crb != null) {
                var22_int = var7 + var21_ref_crb.g(-39);
                var23 = var21_ref_crb.x - var16;
                var24 = var21_ref_crb.y - var17;
                var25 = ar.a(var23, (byte) 126, var24);
                if (var22_int > var25) {
                  var18 = 0;
                  break scanLoop1;
                }
              }
              var20_int++;
              continue;
            }
            break;
          }
          if (var18 != 0) {
            var19 = 2147483647;
            var20 = this.ships;
            for (var21 = 0; var20.length > var21; var21++) {
              var22 = var20[var21];
              if (null != var22 &&
                param4 != var22.getTeam((byte) 126)) {
                var23Lifetime1 = var22.x - var16;
                var24Lifetime1 = var22.y - var17;
                var25Lifetime1 = ar.a(var23Lifetime1, (byte) 121, var24Lifetime1);
                if (var25Lifetime1 < var19) {
                  var19 = var25Lifetime1;
                }
              }
            }
            if (var19 > var8) {
              var10.field_b = var17;
              var8 = var19;
              var10.field_c = var16;
            }
          }
          var15++;
        }
    }

    private final void a(int param0, int param1, Player[] param2, MissionState param3) {
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        String stackIn_109_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Ship[] var7_ref_sg__ = null;
        int var7 = 0;
        int var8 = 0;
        Ship var9_ref_sg = null;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        Ship var11_ref = null;
        int var12 = 0;
        Ship var13 = null;
        boolean[] var13_array = null;
        ShipComponent[] var14 = null;
        ShipComponent[] var15_ref_ml__ = null;
        int var15 = 0;
        int var16 = 0;
        ShipComponent var17_ref_ml = null;
        int var17 = 0;
        int var18_int = 0;
        ShipComponent var18 = null;
        int var19_int = 0;
        Debris var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var25 = 0;
        Ship var26 = null;
        String var27 = null;
        int var8Lifetime1;
        int var16Lifetime1;
        var23 = VoidHunters.field_G;
        try {
          if (param0 <= 18) {
            return;
          }
          var5_int = 0;
          while (true) {
            if (var5_int >= this.respawntimers.length) {
              return;
            }
            var6 = 0;
            var7_ref_sg__ = this.ships;
            var8 = 0;
            while (var7_ref_sg__.length > var8) {
              var9_ref_sg = var7_ref_sg__[var8];
              if (var9_ref_sg != null &&
                var9_ref_sg.getOwner((byte) -117) == var5_int) {
                var6 = 1;
              } else {
                var8++;
                continue;
              }
              break;
            }
            if (var6 == 0) {
              var7 = param2[var5_int].selectedTeam;
              if (this.a(var7, param3, -14368)) {
                this.respawntimers[var5_int] = this.respawntimers[var5_int] + 1;
                var8Lifetime1 = Particle.field_C;
                if (param3.c((byte) -59)) {
                  var8Lifetime1 = Particle.field_l * 3;
                }
                if (this.respawntimers[var5_int] == var8Lifetime1 &&
                  this.d(false) == 13) {
                  this.respawntimers[var5_int] = var8Lifetime1 - 1;
                } else {
                  if (var8Lifetime1 < this.respawntimers[var5_int]) {
                    if (!param2[var5_int].field_a &&
                      1 != SetMissionResnetResourceTickTime.field_p) {
                      this.respawntimers[var5_int] = Particle.field_C;
                    } else {
                      this.respawntimers[var5_int] = 0;
                      var9 = param2[var5_int].spawnChoice;
                      if (!param2[var5_int].field_a &&
                        SetMissionResnetResourceTickTime.field_p == 1) {
                        var9 = (var5_int + 1) * param1 % SetRepairModeCooldown.e((byte) 36);
                      }
                      boolean decompiledFrameRemainder0 = true;
                      var10 = 3 + var9;
                      var11 = null;
                      var12 = 0;
                      if (null != param2[var5_int].savedShip && (param3.c((byte) -51) ||
                        GetToggledScoreboard.a((byte) -104, this.d(false)) ||
                        qrb.field_a == 1 &&
                        param2[var5_int].savedShip.chassis.getComponentTypeId(0) == var10)) {
                        var26 = new Ship();
                        var26 = var26;
                        var11_ref = var26;
                        param2[var5_int].savedShip.b((byte) 74, var26);
                        var12 = 1;
                        if (((param3.c((byte) -42) ||
                          GetToggledScoreboard.a((byte) -95, this.d(false)))) && ((qrb.field_a == 0))) {
                          param2[var5_int].savedShip = null;
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        var13 = t.a(var10, (byte) 36);
                        var11_ref = var13;
                      }
                      if (null != var11_ref) {
                        if (MissionList.a((byte) -100) &&
                          !param3.c((byte) 112)) {
                          var27 = SetSpinningBladeSpinupSpeed.field_o[var11_ref.chassis.getComponentTypeId(0)];
                          if (var12 != 0) {
                            SetGrapplingHookCooldown.a(202, "spawns_as_saved_" + var27, 1);
                          } else {
                            SetGrapplingHookCooldown.a(202, "spawns_as_new_" + var27, 1);
                          }
                        }
                        this.a(-200000, var5_int, param3.c((byte) 116), var7, param2.length, var11_ref);
                      }
                      if (param3.getMissionPhase(8) != 5) {
                        param2[var5_int].carriedOverComponents = null;
                      }
                      if (null != param2[var5_int].carriedOverComponents) {
                        var13_array = new boolean[param2[var5_int].carriedOverComponents.length];
                        var14 = var11_ref.chassis.a((ShipComponent[]) null, (byte) 124);
                        if (var14 != null) {
                          var15_ref_ml__ = var14;
                          var16 = 0;
                          while (var16 < var15_ref_ml__.length) {
                            var17_ref_ml = var15_ref_ml__[var16];
                            var18_int = var17_ref_ml.componentTypeId;
                            var19_int = 0;
                            while (param2[var5_int].carriedOverComponents.length > var19_int) {
                              if (!var13_array[var19_int] &&
                                param2[var5_int].carriedOverComponents[var19_int] == var18_int) {
                                var13_array[var19_int] = true;
                              } else {
                                var19_int++;
                                continue;
                              }
                              break;
                            }
                            var16++;
                          }
                        }
                        var15 = var11_ref.g(-40) * 2;
                        var25 = 0;
                        var16Lifetime1 = var25;
                        while (param2[var5_int].carriedOverComponents.length > var25) {
                          if (!var13_array[var25]) {
                            var17 = param2[var5_int].carriedOverComponents[var25];
                            var18 = new ShipComponent(var17);
                            var19 = new Debris(var18, false);
                            var20 = hob.a(GetFogOfWarSensorRange.field_o, 8192, 122);
                            var21 = (GetNumStars.a(var20, (byte) -115) >> 8) * (var15 >> 8);
                            var22 = (eu.a(var20, 107) >> 8) * (var15 >> 8);
                            var19.a(var11_ref.d(false) + var21, var11_ref.g((byte) 118) + var22, (byte) -70);
                            var19.a(hob.a(GetFogOfWarSensorRange.field_o, 8192, 124), -66);
                            this.a(var19, (byte) 90);
                          }
                          var25++;
                        }
                        param2[var5_int].carriedOverComponents = null;
                      }
                    }
                  }
                }
              }
            }
            var5_int++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_104_0 = var5;
          stackIn_104_1 = new StringBuilder().append("pe.NE(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          stackIn_108_0 = stackIn_104_0;
          stackIn_108_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',');
          if (param3 == null) {
            stackIn_109_0 = stackIn_108_0;
            stackIn_109_2 = "null";
          } else {
            stackIn_109_0 = stackIn_104_0;
            stackIn_109_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_109_0), ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        int stackIn_5_0 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        boolean stackIn_14_2 = false;
        int stackIn_25_0 = 0;
        faa stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        boolean stackIn_32_2 = false;
        int stackIn_41_0 = 0;
        faa stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        boolean stackIn_50_2 = false;
        faa stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        boolean stackIn_59_2 = false;
        int stackIn_67_0 = 0;
        faa stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        boolean stackIn_74_2 = false;
        int stackIn_83_0 = 0;
        faa stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        boolean stackIn_92_2 = false;
        int stackIn_100_0 = 0;
        int stackIn_101_1 = 0;
        faa stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        boolean stackIn_105_2 = false;
        int stackIn_111_0 = 0;
        faa stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        boolean stackIn_120_2 = false;
        int stackIn_129_0 = 0;
        faa stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        boolean stackIn_138_2 = false;
        int stackIn_147_0 = 0;
        faa stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        boolean stackIn_156_2 = false;
        faa stackIn_164_0 = null;
        int stackIn_164_1 = 0;
        boolean stackIn_165_2 = false;
        RuntimeException stackIn_172_0 = null;
        StringBuilder stackIn_172_1 = null;
        String stackIn_173_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa var3 = null;
        RuntimeException var3_ref = null;
        Ship[] var4 = null;
        tv[] var4_array = null;
        Debris[] var4_array2 = null;
        GrapplingHook[] var4_array3 = null;
        MapZone[] var4_array4 = null;
        ResourceNode[] var4_array5 = null;
        EscapePod[] var4_array6 = null;
        int var5 = 0;
        Ship[] var6 = null;
        tv[] var6_array = null;
        int var7 = 0;
        Ship var8 = null;
        tv var8_ref = null;
        Debris var8_ref2 = null;
        GrapplingHook var8_ref3 = null;
        MapZone var8_ref4 = null;
        ResourceNode var8_ref5 = null;
        EscapePod var8_ref6 = null;
        int var9 = 0;
        Ship[] var10 = null;
        faa var11 = null;
        Ship[] var12 = null;
        tv[] var13 = null;
        faa var14 = null;
        Debris[] var15 = null;
        faa var16 = null;
        Debris[] var17 = null;
        tv[] var18 = null;
        faa var19 = null;
        tv[] var20 = null;
        tv var21 = null;
        GrapplingHook[] var22 = null;
        faa var23 = null;
        GrapplingHook[] var24 = null;
        MapZone[] var25 = null;
        faa var26 = null;
        MapZone[] var27 = null;
        ResourceNode[] var28 = null;
        faa var29 = null;
        ResourceNode[] var30 = null;
        EscapePod[] var31 = null;
        faa var32 = null;
        EscapePod[] var33 = null;
        faa var3Lifetime1;
        faa var3Lifetime2;
        faa var3Lifetime3;
        faa var3Lifetime4;
        faa var3Lifetime5;
        faa var3Lifetime6;
        faa var3Lifetime7;
        tv[] var4_arrayLifetime1;
        tv var21Lifetime1;
        tv var21Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var5Lifetime7;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var7Lifetime6;
        int var7Lifetime7;
        var9 = VoidHunters.field_G;
        try {
          var11 = param0;
          var3 = var11;
          var10 = this.ships;
          var4 = var10;
          if (var4 != null) {
            stackIn_5_0 = var10.length;
          } else {
            stackIn_5_0 = 0;
          }
          var5 = stackIn_5_0;
          var11.a(-632, var5, 8);
          if (var5 != 0) {
            var12 = var4;
            var6 = var12;
            for (var7 = 0; var12.length > var7; var7++) {
              var8 = var12[var7];
              stackIn_13_0 = var3;
              stackIn_13_1 = -33;
              stackIn_14_2 = (null != var8);
              if (vq.a(stackIn_13_0, stackIn_13_1, stackIn_14_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var11, var8);
              }
            }
          }
          if (param1 > -109) {
            this.getWidth((byte) 124);
          }
          var14 = param0;
          var3Lifetime1 = var14;
          var13 = hob.a(this.projectiles, 210377952);
          var4_array = var13;
          if (null != var4_array) {
            stackIn_25_0 = var13.length;
          } else {
            stackIn_25_0 = 0;
          }
          var5Lifetime1 = stackIn_25_0;
          var14.a(-632, var5Lifetime1, 10);
          if (var5Lifetime1 != 0) {
            var6_array = var13;
            for (var7Lifetime1 = 0; var6_array.length > var7Lifetime1; var7Lifetime1++) {
              var8_ref = var6_array[var7Lifetime1];
              var21 = var8_ref;
              var21Lifetime2 = var8_ref;
              stackIn_31_0 = var3Lifetime1;
              stackIn_31_1 = 39;
              stackIn_32_2 = (null != var8_ref);
              if (vq.a(stackIn_31_0, stackIn_31_1, stackIn_32_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var3Lifetime1, var8_ref);
              }
            }
          }
          var16 = param0;
          var3Lifetime2 = var16;
          var15 = this.debris;
          var4_array2 = var15;
          if (var4_array2 == null) {
            stackIn_41_0 = 0;
          } else {
            stackIn_41_0 = var15.length;
          }
          var5Lifetime2 = stackIn_41_0;
          var16.a(-632, var5Lifetime2, 10);
          if (var5Lifetime2 != 0) {
            var17 = var15;
            for (var7Lifetime2 = 0; var17.length > var7Lifetime2; var7Lifetime2++) {
              var8_ref2 = var17[var7Lifetime2];
              stackIn_49_0 = var3Lifetime2;
              stackIn_49_1 = 41;
              stackIn_50_2 = (null != var8_ref2);
              if (vq.a(stackIn_49_0, stackIn_49_1, stackIn_50_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var16, var8_ref2);
              }
            }
          }
          stackIn_58_0 = (faa) (param0);
          stackIn_58_1 = 77;
          stackIn_59_2 = (null != this.field_e);
          if (vq.a(stackIn_58_0, stackIn_58_1, stackIn_59_2)) {
            this.field_e.b(param0, -126);
          }
          var19 = param0;
          var3Lifetime3 = var19;
          var18 = hob.a(this.spawnPoints, 210377952);
          var4_arrayLifetime1 = var18;
          if (null == var4_arrayLifetime1) {
            stackIn_67_0 = 0;
          } else {
            stackIn_67_0 = var18.length;
          }
          var5Lifetime3 = stackIn_67_0;
          var19.a(-632, var5Lifetime3, 6);
          if (var5Lifetime3 != 0) {
            var20 = var18;
            for (var7Lifetime3 = 0; var7Lifetime3 < var20.length; var7Lifetime3++) {
              var21Lifetime1 = var20[var7Lifetime3];
              stackIn_73_0 = var3Lifetime3;
              stackIn_73_1 = 118;
              stackIn_74_2 = (var21Lifetime1 != null);
              if (vq.a(stackIn_73_0, stackIn_73_1, stackIn_74_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var19, var21Lifetime1);
              }
            }
          }
          var23 = param0;
          var3Lifetime4 = var23;
          var22 = this.grapplingHooks;
          var4_array3 = var22;
          if (null == var4_array3) {
            stackIn_83_0 = 0;
          } else {
            stackIn_83_0 = var22.length;
          }
          var5Lifetime4 = stackIn_83_0;
          var23.a(-632, var5Lifetime4, 8);
          if (0 != var5Lifetime4) {
            var24 = var22;
            for (var7Lifetime4 = 0; var7Lifetime4 < var24.length; var7Lifetime4++) {
              var8_ref3 = var24[var7Lifetime4];
              stackIn_91_0 = var3Lifetime4;
              stackIn_91_1 = 88;
              stackIn_92_2 = (var8_ref3 != null);
              if (vq.a(stackIn_91_0, stackIn_91_1, stackIn_92_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var23, var8_ref3);
              }
            }
          }
          stackIn_100_0 = 4;
          if (this.respawntimers != null) {
            stackIn_101_1 = this.respawntimers.length;
          } else {
            stackIn_101_1 = 0;
          }
          pgb.a(stackIn_100_0, stackIn_101_1, 68, param0, this.respawntimers);
          vq.a(param0, -88, this.debug);
          param0.a(-632, this.field_y, 32);
          vq.a(param0, 88, this.swappedTeams);
          stackIn_104_0 = (faa) (param0);
          stackIn_104_1 = -71;
          stackIn_105_2 = (this.missionControl != null);
          if (vq.a(stackIn_104_0, stackIn_104_1, stackIn_105_2)) {
            this.missionControl.b(param0, -117);
          }
          var26 = param0;
          var3Lifetime5 = var26;
          var25 = this.mapZones;
          var4_array4 = var25;
          if (null == var4_array4) {
            stackIn_111_0 = 0;
          } else {
            stackIn_111_0 = var25.length;
          }
          var5Lifetime5 = stackIn_111_0;
          var26.a(-632, var5Lifetime5, 8);
          if (var5Lifetime5 != 0) {
            var27 = var25;
            for (var7Lifetime5 = 0; var27.length > var7Lifetime5; var7Lifetime5++) {
              var8_ref4 = var27[var7Lifetime5];
              stackIn_119_0 = var3Lifetime5;
              stackIn_119_1 = 36;
              stackIn_120_2 = (null != var8_ref4);
              if (vq.a(stackIn_119_0, stackIn_119_1, stackIn_120_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var26, var8_ref4);
              }
            }
          }
          var29 = param0;
          var3Lifetime6 = var29;
          var28 = this.resNodes;
          var4_array5 = var28;
          if (null != var4_array5) {
            stackIn_129_0 = var28.length;
          } else {
            stackIn_129_0 = 0;
          }
          var5Lifetime6 = stackIn_129_0;
          var29.a(-632, var5Lifetime6, 4);
          if (var5Lifetime6 != 0) {
            var30 = var28;
            for (var7Lifetime6 = 0; var30.length > var7Lifetime6; var7Lifetime6++) {
              var8_ref5 = var30[var7Lifetime6];
              stackIn_137_0 = var3Lifetime6;
              stackIn_137_1 = -87;
              stackIn_138_2 = (var8_ref5 != null);
              if (vq.a(stackIn_137_0, stackIn_137_1, stackIn_138_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var29, var8_ref5);
              }
            }
          }
          param0.a(-632, this.width, 28);
          param0.a(-632, this.field_r, 28);
          var32 = param0;
          var3Lifetime7 = var32;
          var31 = this.escapePods;
          var4_array6 = var31;
          if (var4_array6 != null) {
            stackIn_147_0 = var31.length;
          } else {
            stackIn_147_0 = 0;
          }
          var5Lifetime7 = stackIn_147_0;
          var32.a(-632, var5Lifetime7, 4);
          if (0 != var5Lifetime7) {
            var33 = var31;
            for (var7Lifetime7 = 0; var33.length > var7Lifetime7; var7Lifetime7++) {
              var8_ref6 = var33[var7Lifetime7];
              stackIn_155_0 = var3Lifetime7;
              stackIn_155_1 = 56;
              stackIn_156_2 = (var8_ref6 != null);
              if (vq.a(stackIn_155_0, stackIn_155_1, stackIn_156_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var32, var8_ref6);
              }
            }
          }
          stackIn_164_0 = (faa) (param0);
          stackIn_164_1 = 46;
          stackIn_165_2 = (null != this.field_b);
          if (vq.a(stackIn_164_0, stackIn_164_1, stackIn_165_2)) {
            this.field_b.b(param0, -113);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_172_0 = var3_ref;
          stackIn_172_1 = new StringBuilder().append("pe.B(");
          if (param0 == null) {
            stackIn_173_2 = "null";
          } else {
            stackIn_173_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_172_0), ((StringBuilder) (Object) stackIn_172_1).append(stackIn_173_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void f(byte param0, int param1) {
        int var3 = -84 % ((param0 - 66) / 54);
        this.a(0, true, param1);
    }

    final void g(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        var3 = VoidHunters.field_G;
        for (var2 = 0; var2 < this.ships.length; var2++) {
          this.ships[var2] = null;
        }
        this.l(-125);
        for (var2Lifetime1 = 0; this.debris.length > var2Lifetime1; var2Lifetime1++) {
          this.debris[var2Lifetime1] = null;
        }
        this.field_e.a(121);
        this.projectiles.e(127);
        for (var2Lifetime2 = 0; this.field_s.length > var2Lifetime2; var2Lifetime2++) {
          this.field_s[var2Lifetime2].a((byte) 121);
        }
        this.spawnPoints.e(125);
        if (param0 != 11184895) {
          return;
        }
        for (var2Lifetime3 = 0; this.grapplingHooks.length > var2Lifetime3; var2Lifetime3++) {
          this.grapplingHooks[var2Lifetime3] = null;
        }
        for (var2Lifetime4 = 0; this.respawntimers.length > var2Lifetime4; var2Lifetime4++) {
          this.respawntimers[var2Lifetime4] = 0;
        }
        this.missionControl = null;
        this.mapZones = null;
        this.resNodes = null;
        this.field_p = new NebulaField();
        this.debug = false;
        this.field_u = new fba();
        this.escapePods = null;
    }

    private final boolean a(IntrusiveDeque param0, ShipBody[] param1, ShipBody[] param2, int param3, int param4, int param5, int param6) {
        int var10 = 0;
        int var13 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        String stackIn_48_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        ShipBody[] var9 = null;
        ShipBody var11 = null;
        ShipBody[] var12 = null;
        ShipBody var14 = null;
        int var15 = 0;
        int var16 = 0;
        var16 = VoidHunters.field_G;
        try {
          if (param3 != 20521) {
            return true;
          }
          var8_int = 0;
          var9 = param2;
          for (var10 = 0; var9.length > var10; var10++) {
            var11 = var9[var10];
            if (null != var11 &&
              null != var11.chassis &&
              !var11.chassis.k((byte) 56)) {
              var12 = param1;
              for (var13 = 0; var13 < var12.length; var13++) {
                var14 = var12[var13];
                if (var14 != null &&
                  null != var14.chassis &&
                  !var14.chassis.k((byte) 76)) {
                  var15 = this.a(false, param5, param6, (byte) 92, false, var14, param4, var11, param0) ? 1 : 0;
                  var8_int = var8_int | var15;
                  if (null == var11.chassis) {
                    break;
                  }
                  if (var11.chassis.k((byte) 82)) {
                    break;
                  }
                }
              }
            }
          }
          stackIn_39_0 = var8_int;
          return stackIn_39_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_43_0 = var8;
          stackIn_43_1 = new StringBuilder().append("pe.WA(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_47_0 = stackIn_43_0;
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',');
          if (param1 == null) {
            stackIn_48_0 = stackIn_47_0;
            stackIn_48_2 = "null";
          } else {
            stackIn_48_0 = stackIn_43_0;
            stackIn_48_2 = "{...}";
          }
          stackIn_51_0 = stackIn_48_0;
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',');
          if (param2 == null) {
            stackIn_52_0 = stackIn_51_0;
            stackIn_52_2 = "null";
          } else {
            stackIn_52_0 = stackIn_48_0;
            stackIn_52_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final int e(int param0, byte param1) {
        int var4 = 0;
        int var3;
        int var5;
        var5 = VoidHunters.field_G;
        var3 = 0;
        if (param1 != -99) {
          this.respawntimers = (int[]) null;
        }
        for (var4 = 0; var4 < this.ships.length; var4++) {
          if (null != this.ships[var4] &&
            this.ships[var4].getAi((byte) -108) != null &&
            this.ships[var4].getAi((byte) -108).a((byte) 92) == param0) {
            var3++;
          }
        }
        return var3;
    }

    final Ship[] getShips(int param0) {
        if (param0 != 1000) {
          this.b((byte) -38);
        }
        return this.ships;
    }

    final void a(int param0, byte param1) {
        this.width = param0;
        int var3 = 37 / ((param1 + 18) / 46);
    }

    final ResourceNode[] getResNodes(int param0) {
        if (param0 != 1) {
          this.resNodes = (ResourceNode[]) null;
        }
        return this.resNodes;
    }

    final Debris b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var10 = 0;
        Object var7;
        int var8;
        Debris[] var9;
        Debris var11;
        int var19;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        var19 = VoidHunters.field_G;
        var7 = null;
        var8 = param1;
        var9 = this.debris;
        for (var10 = 0; var9.length > var10; var10++) {
          var11 = var9[var10];
          if (var11 != null) {
            var12 = var11.getBoundingbox((byte) -41)[0] + var11.getBoundingbox((byte) -120)[1] >> 1;
            var13 = var11.getBoundingbox((byte) -37)[2] + var11.getBoundingbox((byte) -64)[3] >> 1;
            var14 = var12 - param3;
            var15 = -param4 + var13;
            var16 = ar.a(var14, (byte) 127, var15);
            if (var16 < var8) {
              var17 = var12 - param2;
              var18 = -param5 + var13;
              if (ar.a(var17, (byte) 113, var18) < gs.field_c &&
                !this.a(false, false, var11.id)) {
                var7 = var11;
                var8 = var16;
              }
            }
          }
        }
        if (param0 != 1) {
          this.respawntimers = (int[]) null;
        }
        return (Debris) (var7);
    }

    final void a(lta param0, byte param1, int param2, Ship param3) {
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        String stackIn_95_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        Asteroid[] var5 = null;
        RuntimeException var5_ref = null;
        int var6_int = 0;
        Nebula[] var6 = null;
        int var7 = 0;
        GrapplingHook var7_ref_mqb = null;
        Asteroid var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        rdb var13 = null;
        Projectile var14 = null;
        Ship[] var15 = null;
        Ship var16 = null;
        EscapePod[] var17 = null;
        EscapePod var18 = null;
        GrapplingHook[] var19 = null;
        Debris[] var20 = null;
        Debris var21 = null;
        Asteroid[] var22 = null;
        Nebula[] var23 = null;
        int var5_intLifetime1;
        int var6_intLifetime1;
        int var6_intLifetime2;
        int var6_intLifetime3;
        int var6_intLifetime4;
        int var7Lifetime1;
        var10 = VoidHunters.field_G;
        try {
          if (this.debug) {
            var13 = (rdb) (this.spawnPoints.d(0));
            while (null != var13) {
              var13.a(param0, false);
              var13 = (rdb) (this.spawnPoints.a((byte) 85));
            }
            if (this.mapZones != null) {
              for (var5_int = 0; var5_int < this.mapZones.length; var5_int++) {
                this.mapZones[var5_int].a(32, 13421772, param0);
              }
            }
          }
          if (null != this.resNodes) {
            var11 = 0;
            var5_intLifetime1 = var11;
            while (this.resNodes.length > var11) {
              this.resNodes[var11].b(param0, 115);
              var11++;
            }
          }
          var15 = this.ships;
          for (var6_int = 0; var6_int < var15.length; var6_int++) {
            var16 = var15[var6_int];
            if (var16 != null) {
              var8_int = var16.getOwner((byte) -117);
              if ((var8_int == -1 ||
                null != var16.getAi((byte) -108)) && !var16.b(2, (byte) -103)) {
                var9 = qpb.a(false, var16.getTeam((byte) 92), 13894143);
                var16.chassis.a(0, var9, this, param0);
                this.a(var16, param0, 97);
              }
            }
          }
          if (null != this.escapePods) {
            var17 = this.escapePods;
            for (var6_intLifetime1 = 0; var17.length > var6_intLifetime1; var6_intLifetime1++) {
              var18 = var17[var6_intLifetime1];
              var18.a(param0, (byte) -111);
            }
          }
          var19 = this.grapplingHooks;
          for (var6_intLifetime2 = 0; var6_intLifetime2 < var19.length; var6_intLifetime2++) {
            var7_ref_mqb = var19[var6_intLifetime2];
            if (var7_ref_mqb != null) {
              var7_ref_mqb.a(param0, 11184810, this, 16);
              this.a((byte) 76, var7_ref_mqb, param0);
            }
          }
          if (param1 <= 83) {
            this.a(33, (MapZone) null);
          }
          var20 = this.debris;
          for (var6_intLifetime3 = 0; var6_intLifetime3 < var20.length; var6_intLifetime3++) {
            var21 = var20[var6_intLifetime3];
            if (var21 != null) {
              if (GetMomentOfInertiaPredivideDownshift.field_q == 0 ||
                !this.a(true, false, var21.id)) {
                var21.a(param0, GetShowTutorial.a(29554, var21.chassis.componentTypeId), this, 16);
              }
              this.a((byte) -76, var21, param0);
            }
          }
          var5 = this.field_e.c(0);
          var22 = var5;
          for (var7 = 0; var22.length > var7; var7++) {
            var8 = var22[var7];
            if (null != var8) {
              var8.a(param0, 14540253, this, 16);
              this.a((byte) 80, var8, param0);
            }
          }
          for (var6_intLifetime4 = 0; this.field_s.length > var6_intLifetime4; var6_intLifetime4++) {
            if (this.field_s[var6_intLifetime4].b((byte) -125)) {
              this.field_s[var6_intLifetime4].a((byte) 114, param0);
            }
          }
          this.a(-98, param0, param2);
          var14 = (Projectile) (this.projectiles.d(0));
          while (null != var14) {
            var14.a(0, param0);
            var14 = (Projectile) (this.projectiles.a((byte) 84));
          }
          var23 = this.field_p.a(false);
          var6 = var23;
          if (null != var6) {
            var12 = 0;
            var7Lifetime1 = var12;
            while (var23.length > var12) {
              var23[var12].a(param3, 93, param2, param0, var12);
              var12++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_90_0 = var5_ref;
          stackIn_90_1 = new StringBuilder().append("pe.DC(");
          if (param0 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          stackIn_94_0 = stackIn_90_0;
          stackIn_94_1 = ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_95_0 = stackIn_94_0;
            stackIn_95_2 = "null";
          } else {
            stackIn_95_0 = stackIn_90_0;
            stackIn_95_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_95_0), ((StringBuilder) (Object) stackIn_94_1).append(stackIn_95_2).append(')').toString());
        }
    }

    final boolean e(byte param0) {
        if (param0 >= -44) {
          this.width = -69;
        }
        return this.swappedTeams;
    }

    private final void a(IntrusiveDeque param0, int param1, Asteroid[] param2) {
        int var5 = 0;
        int var9 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        Ship var6 = null;
        int var7 = 0;
        int var8 = 0;
        Asteroid var10 = null;
        int var12 = 0;
        Ship[] var13 = null;
        var12 = VoidHunters.field_G;
        try {
          var13 = this.ships;
          for (var5 = 0; var5 < var13.length; var5++) {
            var6 = var13[var5];
            if (var6 != null &&
              null != var6.chassis &&
              !var6.chassis.k((byte) 73)) {
              var7 = SetPointDefenceLaserProjectiles.field_o;
              if (var6.chassis.componentTypeId == 0) {
                var7 = var7 / 4;
              }
              var8 = this.field_u.a(-1, var6.boundingbox, 3, 127);
              for (var9 = 0; var9 < var8; var9++) {
                var10 = param2[-field_c[2] + ada.field_a[var9]];
                if (var10 != null &&
                  var10.chassis != null &&
                  !var10.chassis.k((byte) 42)) {
                  if (this.a(true, 2, var7, (byte) 77, true, var10, 0, var6, param0)) {
                    this.field_e.b(-64);
                  }
                  if (null == var6.chassis) {
                    break;
                  }
                  if (var6.chassis.k((byte) 82)) {
                    break;
                  }
                }
              }
            }
          }
          if (param1 != -1) {
            this.a((byte) -56, (Projectile) null, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("pe.EA(");
          if (param0 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_50_0 = stackIn_46_0;
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_51_0 = stackIn_50_0;
            stackIn_51_2 = "null";
          } else {
            stackIn_51_0 = stackIn_46_0;
            stackIn_51_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param5, 0, param6, param0, 30273, param2, param3, param1, 0);
        if (param4 != 11184895) {
          field_d = (String) null;
        }
    }

    private final Debris a(Debris param0, byte param1, Ship param2, int param3, vra param4, int param5) {
        Debris stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        try {
          if (param1 != 127) {
            this.field_r = 62;
          }
          if (null == param0 &&
            (128 & param4.field_e) != 0) {
            param2.a(123, param4.field_a, param4.field_c);
            var7_int = param2.d(false) - param2.j(param1 + 995401033);
            var8 = param2.g((byte) 118) - param2.i((byte) 5);
            param2.chassis.a(true, var7_int, var8, param2.e(param1 ^ 127), 0, param2.getBoundingbox((byte) -106));
            param0 = param2.chassis.a(this, param5, param3, param2, (byte) 85);
            if (param0 != null) {
              param2.a(param0.id, (byte) -63);
              param2.chassis.a((byte) -123, (ShipBody) (param2));
            }
          }
          stackIn_7_0 = (Debris) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_11_0 = var7;
          stackIn_11_1 = new StringBuilder().append("pe.ED(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_0 = stackIn_11_0;
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_0 = stackIn_15_0;
            stackIn_16_2 = "null";
          } else {
            stackIn_16_0 = stackIn_11_0;
            stackIn_16_2 = "{...}";
          }
          stackIn_19_0 = stackIn_16_0;
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_0 = stackIn_19_0;
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = stackIn_16_0;
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean a(Projectile param0, ShipBody param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -43) {
            return true;
          }
          var4_int = Math.abs(param0.dx);
          var5 = Math.abs(param0.dy);
          stackIn_4_0 = SetDebrisProjectileCollision.a(5220, param1.boundingbox[1] + var4_int, param0.e((byte) -107), param1.boundingbox[3] + var5, param0.d(101), -var4_int + param1.boundingbox[0], param1.boundingbox[2] - var5);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("pe.QE(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_0 = stackIn_8_0;
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_0 = stackIn_12_0;
            stackIn_13_2 = "null";
          } else {
            stackIn_13_0 = stackIn_8_0;
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(byte param0) {
        NebulaField var2 = null;
        if (!this.field_q) {
          if (this.field_p == null) {
            return;
          }
          int var3 = -85 % ((param0 - 6) / 47);
          var2 = this.field_p;
          this.field_p = new NebulaField();
          var2.b((byte) 81, this.field_p);
          this.field_q = true;
          return;
        }
    }

    public final void a(faa param0, boolean param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Projectile[] var3 = null;
        RuntimeException var3_ref = null;
        rdb[] var4 = null;
        int var6 = 0;
        Projectile[] var7 = null;
        var6 = VoidHunters.field_G;
        try {
          this.ships = (Ship[]) (SetAutoDetail.a(8, MissionGenerationData.field_a, param0, 1, -109, this.ships));
          this.projectiles = new IntrusiveDeque();
          var7 = (Projectile[]) (SetAutoDetail.a(10, aba.field_b, param0, 1, -127, (tv[]) null));
          var3 = var7;
          if (null != var3) {
            for (var4_int = 0; var4_int < var7.length; var4_int++) {
              this.projectiles.b(-10258, var7[var4_int]);
            }
          }
          this.debris = (Debris[]) (SetAutoDetail.a(10, vcb.field_z, param0, 1, -68, this.debris));
          if (!kv.a(param1, param0)) {
            this.field_e = null;
          } else {
            if (null == this.field_e) {
              this.field_e = new AsteroidField();
            }
            this.field_e.a(param0, false);
          }
          this.spawnPoints = new IntrusiveDeque();
          var4 = (rdb[]) (SetAutoDetail.a(6, GetBombletSprayProjectileDamage.field_q, param0, 1, -86, (tv[]) null));
          if (null != var4) {
            for (var5 = 0; var5 < var4.length; var5++) {
              this.spawnPoints.b(-10258, var4[var5]);
            }
          }
          this.grapplingHooks = (GrapplingHook[]) (SetAutoDetail.a(8, TickCondition.field_c, param0, 1, -47, this.grapplingHooks));
          this.respawntimers = wkb.a((byte) 37, this.respawntimers, param0, 4);
          this.debug = kv.a(false, param0);
          this.field_y = param0.i(0, 32);
          this.swappedTeams = kv.a(false, param0);
          if (!kv.a(false, param0)) {
            this.missionControl = null;
          } else {
            if (this.missionControl == null) {
              this.missionControl = new MissionControl();
            }
            this.missionControl.a(param0, false);
          }
          this.mapZones = (MapZone[]) (SetAutoDetail.a(8, wsb.field_e, param0, 1, -98, this.mapZones));
          this.resNodes = (ResourceNode[]) (SetAutoDetail.a(4, SetShipDirectionArrow.field_p, param0, 1, -71, this.resNodes));
          this.width = param0.i(0, 28);
          this.field_r = param0.i(0, 28);
          this.escapePods = (EscapePod[]) (SetAutoDetail.a(4, pgb.field_g, param0, 1, -83, this.escapePods));
          if (!kv.a(false, param0)) {
            this.field_b = null;
          } else {
            this.field_b = new bea();
            this.field_b.a(param0, false);
          }
          this.a((byte) 112);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_30_0 = var3_ref;
          stackIn_30_1 = new StringBuilder().append("pe.H(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(Asteroid[] param0, int param1) {
        int var14_int = 0;
        int stackIn_95_0 = 0;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        String stackIn_112_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        Projectile var3_ref = null;
        RuntimeException var3_ref2 = null;
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
        GrapplingHook[] var13_ref_mqb__ = null;
        Ship var14 = null;
        Debris var14_ref = null;
        Asteroid var14_ref2 = null;
        GrapplingHook var15 = null;
        int var17 = 0;
        Object var19 = null;
        Debris var19_ref = null;
        Ship var20 = null;
        Debris var21 = null;
        Asteroid var22 = null;
        Object var23 = null;
        Ship var23_ref = null;
        Debris var24 = null;
        int var4Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        var3 = null;
        var19 = null;
        var23 = null;
        var17 = VoidHunters.field_G;
        try {
          var3_ref = (Projectile) (this.projectiles.d(0));
          scanLoop1: while (true) {
            if (null == var3_ref) {
              var4 = -67 % ((-34 - param1) / 52);
              return;
            }
            wgb.field_i = null;
            RoundResult.field_c.a(2147483647);
            gab.field_b.b((byte) -70);
            var4Lifetime1 = var3_ref.x;
            var5 = var4Lifetime1 - var3_ref.dx;
            var6 = var5;
            var7 = var4Lifetime1;
            if (var6 > var7) {
              var7 = var6;
              var6 = var4Lifetime1;
            }
            var8 = var3_ref.y;
            var9 = var8 - var3_ref.dy;
            var10 = var9;
            var11 = var8;
            if (var10 > var11) {
              var11 = var10;
              var10 = var8;
            }
            GetLaserEnergyUsed.a(45, var10, var6, var11, var7);
            var12 = this.field_u.a(-128, 1);
            var13 = 0;
            while (var13 < var12) {
              var20 = this.ships[ada.field_a[var13] - field_c[0]];
              var14 = var20;
              if (null == var14 ||
                6 == var3_ref.getType((byte) -104) &&
                as.field_d == 0 &&
                var20.getTeam((byte) 99) == var3_ref.getFiredTeam(512) &&
                (var20.getTeam((byte) 84) != sja.field_c ||
                var20.getOwner((byte) -117) == var3_ref.b(false) ||
                var20.getAi((byte) -108) != null &&
                var20.getAi((byte) -108).a((byte) 28) == var3_ref.b(false)) ||
                (!this.a(var3_ref, var20, -46) ||
                !this.a(var20, 46, var3_ref))) {
                var13++;
                continue;
              }
              break;
            }
            if (1 == voa.field_d &&
              !gab.field_b.a((byte) 111)) {
              var12Lifetime1 = this.field_u.a(-122, 2);
              for (var13Lifetime1 = 0; var13Lifetime1 < var12Lifetime1; var13Lifetime1++) {
                var21 = this.debris[ada.field_a[var13Lifetime1] - field_c[1]];
                var14_ref = var21;
                if (null != var14_ref &&
                  this.a(var3_ref, var21, -66) &&
                  this.a(var21, 119, var3_ref)) {
                  break;
                }
              }
            }
            if (!gab.field_b.a((byte) 127)) {
              var13_ref_mqb__ = this.grapplingHooks;
              for (var14_int = 0; var14_int < var13_ref_mqb__.length; var14_int++) {
                var15 = var13_ref_mqb__[var14_int];
                if (null != var15 && (0 != SetThrusterAutobalancing.field_r ||
                  var15.m(32) != var3_ref.b(false)) && (this.a(var3_ref, var15, -80) &&
                  this.a(var15, 48, var3_ref))) {
                  break;
                }
              }
            }
            if (!gab.field_b.a((byte) -18)) {
              var12Lifetime2 = this.field_u.a(-110, 3);
              for (var13Lifetime2 = 0; var13Lifetime2 < var12Lifetime2; var13Lifetime2++) {
                var22 = param0[-field_c[2] + ada.field_a[var13Lifetime2]];
                var14_ref2 = var22;
                if (null != var14_ref2 &&
                  this.a(var3_ref, var22, -81) &&
                  this.a(var22, 72, var3_ref)) {
                  break;
                }
              }
            }
            this.a(var3_ref, var5, var9, (byte) -103, var4Lifetime1, var8);
            this.a(var5, var8, var4Lifetime1, var3_ref, var9, 6);
            if (wgb.field_i != null) {
              var13Lifetime3 = 1;
              if (wgb.field_i instanceof Ship) {
                var23_ref = (Ship) (wgb.field_i);
                if (var3_ref.getFiredTeam(512) != var23_ref.getTeam((byte) 77)) {
                  stackIn_95_0 = (!var23_ref.j((byte) -127)) ? 1 : 0;
                } else {
                  stackIn_95_0 = 0;
                }
                var13Lifetime3 = stackIn_95_0;
                if (var13Lifetime3 != 0) {
                  var23_ref.c(var3_ref.b(false), 19581);
                  if (var23_ref.g(false)) {
                    GetFighterVision.a(6811, 90, 100);
                  }
                }
                if (var13Lifetime3 == 0 &&
                  var3_ref.getType((byte) -104) == 5 &&
                  !var23_ref.j((byte) -40)) {
                  var13Lifetime3 = 1;
                }
              } else {
                if (!(wgb.field_i instanceof Debris)) {
                  wgb.field_i.d((byte) -68);
                  this.a((byte) 108, var3_ref, var13Lifetime3 != 0);
                  var3_ref = (Projectile) (this.projectiles.a((byte) 46));
                  continue scanLoop1;
                }
                var19_ref = (Debris) (wgb.field_i);
                var24 = var19_ref;
                var24.field_u = true;
              }
              wgb.field_i.d((byte) -68);
              this.a((byte) 108, var3_ref, var13Lifetime3 != 0);
            }
            var3_ref = (Projectile) (this.projectiles.a((byte) 46));
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          stackIn_111_0 = var3_ref2;
          stackIn_111_1 = new StringBuilder().append("pe.RE(");
          if (param0 == null) {
            stackIn_112_2 = "null";
          } else {
            stackIn_112_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_111_0), ((StringBuilder) (Object) stackIn_111_1).append(stackIn_112_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var11 = 0;
        int var9;
        int var10;
        int var12;
        int var13;
        var13 = VoidHunters.field_G;
        if (param3 != -19079) {
          this.g(-33);
        }
        var9 = -2147483648;
        var10 = -1;
        for (var11 = 0; this.field_s.length > var11; var11++) {
          if (this.field_s[var11].b((byte) -123)) {
            var12 = this.field_s[var11].a(true);
            if (var12 > var9) {
              var10 = var11;
              var9 = var12;
            }
            continue;
          }
          var10 = var11;
          break;
        }
        if (var10 >= 0) {
          this.field_s[var10].a(param7, param4, param2, param6, param5, param0, param1, true);
        }
    }

    final void a(lta param0, int param1, MissionState param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(true, param2, (byte) -117, param0);
          if (param1 != -950) {
            this.d(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pe.BB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_0 = stackIn_6_0;
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_0 = stackIn_10_0;
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = stackIn_6_0;
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void b(byte param0, int param1) {
        this.escapePods = (EscapePod[]) (GetSalvoUsesAllEnergy.a(pgb.field_g, param1, param0 ^ 15642, this.escapePods));
        if (param0 != 41) {
          this.c(88);
        }
    }

    final boolean getDebug(byte param0) {
        int var2 = -84 / ((-33 - param0) / 37);
        return this.debug;
    }

    private final boolean a(Player param0, int param1, Player param2, Ship param3) {
        boolean discarded$0 = false;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        Ship stackIn_29_1 = null;
        boolean stackIn_30_2 = false;
        Object stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        Object stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        Object stackIn_45_0 = null;
        String stackIn_45_2 = null;
        Object stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        Object stackIn_49_0 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        vra var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Debris var12 = null;
        Debris var13 = null;
        try {
          param3.a((int[]) null, -52);
          param3.a((qua) null, 3);
          var5 = null;
          if (param3.getTargetBlueprint((byte) 28) == null) {
            var5 = this.i(21363, param3.getDragging(85));
          }
          var6 = new vra();
          var6.field_e = param0.triggers;
          if (param1 > -69) {
            return false;
          }
          var6.field_d = param2.triggers;
          var6.field_a = param0.aimtargety;
          var6.field_c = param0.aimtargetx;
          if (param3.getTargetBlueprint((byte) 28) != null) {
            param3.chassis.i(103);
            this.a(16384, var6, param3.getTargetBlueprint((byte) 28), param3);
            return false;
          }
          var7 = var6.field_c;
          var8 = var6.field_a;
          stackIn_16_0 = (var5 == null) ? 0 : 1;
          var9 = stackIn_16_0;
          var12 = this.a((Debris) (var5), (byte) 127, param3, var8, var6, var7);
          if (var12 != null) {
            stackIn_22_0 = (var9 == 0) ? 1 : 0;
          } else {
            stackIn_22_0 = 0;
          }
          var10 = stackIn_22_0;
          if ((var6.field_e & 128) == 0) {
            if ((var6.field_d & 128) == 0) {
              return true;
            }
            discarded$0 = this.a(var12, var8, true, param3, 126, var7);
            return true;
          }
          param3.chassis.i(101);
          var13 = this.a(var8, var12, param3, (byte) 124, var7);
          var5 = var13;
          if (var13 != null) {
            if (var10 == 0) {
              var11 = -field_c[1] + var13.id;
              var5 = this.c(var11, false);
            }
            stackIn_29_1 = (Ship) (param3);
            stackIn_30_2 = (1 == hw.field_b);
            this.a(stackIn_29_1, stackIn_30_2, -98, (Debris) (var5), var8, var7);
            GetGrapplingHookAimarc.a(param3.g((byte) -91), param3.id, 74, 93, param3.d(false));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_40_0 = var5;
          stackIn_40_1 = new StringBuilder().append("pe.WD(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_44_0 = stackIn_40_0;
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_45_0 = stackIn_44_0;
            stackIn_45_2 = "null";
          } else {
            stackIn_45_0 = stackIn_40_0;
            stackIn_45_2 = "{...}";
          }
          stackIn_48_0 = stackIn_45_0;
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',');
          if (param3 == null) {
            stackIn_49_0 = stackIn_48_0;
            stackIn_49_2 = "null";
          } else {
            stackIn_49_0 = stackIn_45_0;
            stackIn_49_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) (stackIn_49_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7;
        Nebula[] var8;
        int var9;
        int var10;
        Nebula var11;
        int var12;
        int var13;
        int var14;
        var14 = VoidHunters.field_G;
        var7 = 0;
        var8 = this.field_p.a(false);
        var9 = 1 % ((24 - param4) / 52);
        if (null != var8) {
          var10 = 0;
          while (var10 < var8.length) {
            var11 = var8[var10];
            var12 = param0 - var11.a(true);
            var13 = param1 - var11.getY((byte) -102);
            if (param5 / 2 > Math.abs(var12) &&
              param2 / 2 > Math.abs(var13)) {
              this.a(0, param3, var10);
              var8 = this.field_p.a(false);
              var10--;
            }
            var10++;
          }
        }
        return var7 != 0;
    }

    private final ShipBody a(int param0, byte param1, int param2, ShipBody[] param3) {
        int var6 = 0;
        ShipBody[] var5 = null;
        RuntimeException var5_ref = null;
        ShipBody var7 = null;
        int var8 = 0;
        ShipBody[] var9 = null;
        ShipBody stackIn_6_0 = null;
        Object stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          var9 = param3;
          var5 = var9;
          for (var6 = 0; var9.length > var6; var6++) {
            var7 = var9[var6];
            if (null != var7 &&
              null != var7.chassis.a(param2, param0, true)) {
              stackIn_6_0 = var7;
              return stackIn_6_0;
            }
          }
          if (param1 == -111) {
            return null;
          }
          this.f(false);
          stackIn_11_0 = null;
          return (ShipBody) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_15_0 = var5_ref;
          stackIn_15_1 = new StringBuilder().append("pe.HC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void a(Ship param0, boolean param1, int param2, Debris param3, int param4, int param5) {
        int var8 = 0;
        lu var9 = null;
        ShipComponent var10_ref_ml = null;
        int var10 = 0;
        Hardpoint var11_ref_imb = null;
        int var11 = 0;
        lsb var12_ref_lsb = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        ShipComponent var20 = null;
        qua var21 = null;
        ShipComponent var22 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        try {
          var22 = param3.chassis;
          if (param2 > -59) {
            this.debris = (Debris[]) null;
          }
          var8 = 1;
          var9 = param0.chassis.a(param5, false, 8192, 0, param4, param0.chassis, -29866, (ShipBody) null);
          if (null != var9) {
            var10_ref_ml = var9.field_b;
            var11_ref_imb = var10_ref_ml.hardpoints[var9.field_e];
            var12_ref_lsb = var10_ref_ml.i((byte) -112).field_o[var9.field_e];
            var13 = var12_ref_lsb.field_a + var9.field_b.finalangle;
            if (null != param3.chassis.thrusterbehaviour) {
              var13 = GameKeyHandler.a(22433, var13 + 4096);
            }
            param3.a(var13, -86);
            var14 = var22.b(38) * GetNumStars.a(param3.e(0), (byte) -99) - var22.c((byte) 100) * eu.a(param3.e(0), 125) >> 16;
            var15 = var22.b(37) * eu.a(param3.e(0), 63) + var22.c((byte) 100) * GetNumStars.a(param3.e(0), (byte) -67) >> 16;
            param3.a(var11_ref_imb.worldx - var14 + param3.j(995401160), var11_ref_imb.worldy + (-var15 + param3.i((byte) 5)), (byte) -107);
            param3.dy = 0;
            param3.dx = 0;
            param3.chassis.i(97);
            param3.a(param1, true, this);
            var8 = 0;
            param0.a(var9.field_b.finaloutline, -48);
            var16 = param0.x - param0.j(995401160);
            var17 = param0.y - param0.i((byte) 5);
            var18 = GetNumStars.a(param0.e(0), (byte) 44);
            var19 = eu.a(param0.e(0), 68);
            var20 = new ShipComponent();
            param0.chassis.b((byte) 119, var20);
            param0.chassis.a(var19, param0.e(0), var18, var17, true, true, false, var16, (int[]) null);
            var21 = param0.chassis.a(false, param3, 0, -1, param4, 8192, param0.chassis, param5);
            var20.b((byte) 83, param0.chassis);
            if (var21 != null) {
              param0.a(var21, 3);
            }
          }
          if (var8 != 0) {
            var10 = var22.b(-48) * GetNumStars.a(param3.e(0), (byte) -120) - var22.c((byte) 100) * eu.a(param3.e(0), 118) >> 16;
            var11 = var22.b(124) * eu.a(param3.e(0), 82) + var22.c((byte) 100) * GetNumStars.a(param3.e(0), (byte) 87) >> 16;
            var12 = param3.j(995401160);
            var13Lifetime1 = param3.d(false) - var12;
            var14Lifetime1 = param3.i((byte) 5);
            var15Lifetime1 = param3.g((byte) -63) - var14Lifetime1;
            var16Lifetime1 = var10 + var13Lifetime1;
            var17Lifetime1 = var11 + var15Lifetime1;
            var18Lifetime1 = -var16Lifetime1 + param5;
            var19Lifetime1 = param4 - var17Lifetime1;
            if (1 != GetMomentOfInertiaPredivideDownshift.field_q) {
              param3.a(var19Lifetime1 * param3.e(false) / 2, param3.d(false), param3.g((byte) -77), (byte) -128, var18Lifetime1 * param3.e(false) / 2);
              param3.a(-param3.f(0) * param3.e(false) / 2, param3.d(false), param3.g((byte) 127), (byte) -124, -param3.c((byte) -115) * param3.e(false) / 2);
            } else {
              param3.a(param3.d(false) + var18Lifetime1, var19Lifetime1 + param3.g((byte) -32), (byte) -123);
              param3.a(param1, true, this);
            }
            param3.d((byte) 107);
          } else {
            param3.d((byte) 107);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_18_0 = var7;
          stackIn_18_1 = new StringBuilder().append("pe.LB(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_0 = stackIn_18_0;
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_0 = stackIn_22_0;
            stackIn_23_2 = "null";
          } else {
            stackIn_23_0 = stackIn_18_0;
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean a(boolean param0, int[] param1, int[] param2) {
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (!param0) {
            this.field_u = (fba) null;
          }
          stackIn_10_0 = !(param2[0] >= param1[0]) || !(param2[1] <= param1[1]) || !(param1[2] <= param2[2]) || !(param2[3] <= param1[3]);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("pe.CD(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_0 = stackIn_14_0;
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_19_0 = stackIn_18_0;
            stackIn_19_2 = "null";
          } else {
            stackIn_19_0 = stackIn_14_0;
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final void a(int param0, lta param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        uwa var5 = null;
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
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        var18 = VoidHunters.field_G;
        try {
          if (param0 >= -92) {
            this.mapZones = (MapZone[]) null;
          }
          for (var4_int = 0; ccb.field_a.field_d > var4_int; var4_int++) {
            var5 = ccb.field_a.field_b[var4_int];
            if (!(var5.field_e instanceof Ship) ||
              !((Ship) (var5.field_e)).b(2, (byte) 62)) {
              var6 = param1.a(var5.field_g, (byte) 115);
              var7 = param1.b(true, var5.field_f);
              if (-1 != var5.field_i) {
                var8 = SetBuildViewAutozoomEndOnAction.field_o;
                var9 = 0;
                var10 = 0;
                var11 = 128 + (eu.a(100 * param2, 58) >> 9) | 11184640;
                for (var12 = 0; var12 < 10; var12++) {
                  var13 = (eu.a(var12 * (10 * param2), 78) >> 8) * (var5.field_i >> 8) + var5.field_b;
                  var14 = (GetNumStars.a(var13, (byte) 105) >> 8) * (var5.field_d >> 8);
                  var15 = (eu.a(var13, 45) >> 8) * (var5.field_d >> 8);
                  c.a(param1.b(true, var15 + var5.field_f), param1.a(var14 + var5.field_g, (byte) 120), var6, var7, -16777216, 4473924);
                }
                for (var12Lifetime1 = -var8; var8 >= var12Lifetime1; var12Lifetime1++) {
                  var13Lifetime1 = var5.field_b + var5.field_i * var12Lifetime1 / var8;
                  var14Lifetime1 = (GetNumStars.a(var13Lifetime1, (byte) -106) >> 8) * (var5.field_d >> 8);
                  var15Lifetime1 = (eu.a(var13Lifetime1, 98) >> 8) * (var5.field_d >> 8);
                  var16 = var5.field_g + var14Lifetime1;
                  var17 = var5.field_f + var15Lifetime1;
                  if (-var8 < var12Lifetime1) {
                    c.a(param1.b(true, var17), param1.a(var16, (byte) 112), param1.a(var9, (byte) 125), param1.b(true, var10), -16777216, var11);
                  }
                  var10 = var17;
                  var9 = var16;
                }
              } else {
                SetNumStars.a((float)var5.field_d * param1.field_a, (byte) 111, var7, 11184895, var6);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("pe.UE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(lta param0, Ship param1, int param2, int param3, int param4) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        try {
          if (param1.d(4, 49) && ((0 == GetFightersPerPlayerMaximum.field_p ||
            param1.q(-49)) &&
            (-1 != param4 ||
            param2 != -1))) {
            var6_int = param0.a(param4, (byte) 120);
            var7 = param0.b(true, param2);
            SetNumStars.a(param0.field_a * (float)GetMinimapWidth.field_o, (byte) 77, var7, 65280, var6_int);
          }
          if (param3 != 0) {
            this.projectiles = (IntrusiveDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("pe.GA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_0 = stackIn_16_0;
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param1 == null) {
            stackIn_21_0 = stackIn_20_0;
            stackIn_21_2 = "null";
          } else {
            stackIn_21_0 = stackIn_16_0;
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final ShipBody a(byte param0, int param1, int param2) {
        ShipBody var4;
        Asteroid[] var5;
        ShipBody var4Lifetime1;
        ShipBody var4Lifetime2;
        ShipBody var4Lifetime3;
        if (param0 > -9) {
          return (ShipBody) null;
        }
        var4 = this.a(param1, (byte) -111, param2, this.ships);
        if (null != var4) {
          return var4;
        }
        var4Lifetime1 = this.a(param1, (byte) -111, param2, this.debris);
        if (var4Lifetime1 != null) {
          return var4Lifetime1;
        }
        var5 = this.field_e.c(0);
        var4Lifetime2 = this.a(param1, (byte) -111, param2, var5);
        if (var4Lifetime2 != null) {
          return var4Lifetime2;
        }
        var4Lifetime3 = this.a(param1, (byte) -111, param2, this.grapplingHooks);
        return var4Lifetime3;
    }

    final Asteroid[] a(boolean param0) {
        if (!param0) {
          return (Asteroid[]) null;
        }
        return this.field_e.c(0);
    }

    private final void a(Nebula param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(true, param0, (byte) -94);
          if (param1 != 0) {
            this.a(true, 95, -77, 72);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pe.QA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != 48) {
          this.projectiles = (IntrusiveDeque) null;
        }
        this.swappedTeams = param1 ? true : false;
    }

    private final void c(byte param0, int param1) {
        this.resNodes = (ResourceNode[]) (GetSalvoUsesAllEnergy.a(SetShipDirectionArrow.field_p, param1, 15667, this.resNodes));
        if (param0 != 110) {
          this.spawnPoints = (IntrusiveDeque) null;
        }
    }

    final void a(Ship param0, byte param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          param0.a(this, true, (byte) 67, false);
          param0.b(-(this.field_r >> 1), 2147483647, this.field_r >> 1, -(this.width >> 1), this.width >> 1);
          if (param1 <= 70) {
            return;
          }
          param0.C(32);
          if (this.a(29651, param0, this.ships, 0)) {
            this.b(1, (byte) 125, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pe.UA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final int f(int param0, int param1) {
        int var4 = 0;
        int var3;
        int var5;
        var5 = VoidHunters.field_G;
        var3 = 0;
        if (param1 != -13766) {
          this.escapePods = (EscapePod[]) null;
        }
        for (var4 = 0; this.ships.length > var4; var4++) {
          if (this.ships[var4] != null &&
            this.ships[var4].getTeam((byte) 109) == param0) {
            var3++;
          }
        }
        return var3;
    }

    final int b(boolean param0) {
        int var4 = 0;
        int var2;
        Debris[] var3;
        Debris var5;
        int var6;
        var6 = VoidHunters.field_G;
        var2 = 0;
        var3 = this.debris;
        if (!param0) {
          this.debug = true;
        }
        for (var4 = 0; var4 < var3.length; var4++) {
          var5 = var3[var4];
          if (null != var5) {
            var2++;
          }
        }
        return var2;
    }

    final void a(Projectile param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1023 <= this.projectiles.c(3)) {
            return;
          }
          this.projectiles.b(-10258, param0);
          if (param1) {
            field_c = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("pe.HD(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, Projectile param3, int param4, int param5) {
        int var9_int = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        uwa var9 = null;
        int var10 = 0;
        uwa var10_ref_uwa = null;
        Ship var11 = null;
        int var11_int = 0;
        Object var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = VoidHunters.field_G;
        try {
          if (param5 == param3.getType((byte) -104)) {
            var7_int = -1;
            var8 = 2147483647;
            for (var9_int = 0; var9_int < ccb.field_a.field_d; var9_int++) {
              var10_ref_uwa = ccb.field_a.field_b[var9_int];
              if (var10_ref_uwa.field_c == 1) {
                var11_int = var10_ref_uwa.field_g - param3.x;
                var12_int = -param3.y + var10_ref_uwa.field_f;
                var13 = ar.a(var11_int, (byte) 126, var12_int);
                if (var10_ref_uwa.field_d > var13 &&
                  var8 > var13) {
                  var8 = var13;
                  var7_int = var9_int;
                }
              }
            }
            if (var7_int == -1) {
              return;
            }
            var9 = ccb.field_a.field_b[var7_int];
            var10 = param3.b(false);
            var11 = this.d(var10, 113);
            var12 = null;
            if (null != var9.field_e &&
              var9.field_e instanceof Ship) {
              var12 = (Ship) (var9.field_e);
            }
            if (null != var12) {
              param3.b(((Ship) (var12)).getOwner((byte) -117), (byte) 47);
              param3.a(122, ((Ship) (var12)).getTeam((byte) 80));
            }
            if (null == var11) {
              param3.a(-1, (byte) -98);
              return;
            }
            if (var9.field_e == var11) {
              return;
            }
            param3.a(var11.id, (byte) -113);
            param3.life = SetShipDirectionArrow.field_o[8].a((byte) -99);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_36_0 = var7;
          stackIn_36_1 = new StringBuilder().append("pe.NC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final boolean a(int param0, MissionState param1, int param2) {
        int var4_int = 0;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          var4_int = param1.getMissionPhase(8);
          if (3 != var4_int &&
            var4_int != 5) {
            return false;
          }
          if (param2 != -14368) {
            this.a((MissionState) null, (Player[]) null, (byte) -27, (MessageLog) null);
          }
          if (param1.getMissionPhase(param2 ^ -14360) == 5) {
            var5 = param1.getPhaseTimer((byte) -97);
            var6 = lga.a((byte) -2, this.field_y);
            if (var6 < var5) {
              return false;
            }
          }
          stackIn_15_0 = this.a(true, param0, param1);
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("pe.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final Debris[] getDebris(byte param0) {
        if (param0 != -33) {
          return (Debris[]) null;
        }
        return this.debris;
    }

    private final boolean a(ShipBody param0, ShipBody param1, int param2) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        IntrusiveDeque var5 = null;
        try {
          if (!MissionAction.a(param0.boundingbox, param1.boundingbox, -128)) {
            return false;
          }
          var4_int = -59 / ((param2 + 25) / 41);
          var5 = new IntrusiveDeque();
          param0.chassis.a(param1.chassis, 0, 0, (byte) -126, var5);
          if (var5.b(-103)) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("pe.HE(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_17_0 = stackIn_13_0;
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_18_0 = stackIn_17_0;
            stackIn_18_2 = "null";
          } else {
            stackIn_18_0 = stackIn_13_0;
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(ShipBody param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Nebula var7 = null;
        int var8 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = VoidHunters.field_G;
        try {
          var3_int = 0;
          var4 = this.field_u.a(-1, param0.getBoundingbox((byte) -91), 0, 88);
          var5 = 0;
          var6 = 118 / ((56 - param1) / 59);
          while (var5 < var4) {
            var7 = this.d((byte) 116)[ada.field_a[var5]];
            if (var7 != null &&
              var7.a((byte) 100, param0.d(false), param0.g((byte) -17))) {
              var3_int = 1;
            } else {
              var5++;
              continue;
            }
            break;
          }
          stackIn_11_0 = var3_int;
          return stackIn_11_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("pe.KB(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, ShipBody param1, ShipBody[] param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = VoidHunters.field_G;
        try {
          if (param0 != 29651) {
            return false;
          }
          for (var5_int = 0; var5_int < param2.length; var5_int++) {
            if (null == param2[var5_int]) {
              var6 = var5_int + field_c[param3];
              if (!this.d(var6, (byte) 21)) {
                if (param3 == 1) {
                  this.l(param0 - 29775);
                  param2 = (ShipBody[]) ((Object) this.debris);
                }
                param2[var5_int] = param1;
                param1.id = var6;
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("pe.KE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_24_0 = stackIn_20_0;
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_25_0 = stackIn_24_0;
            stackIn_25_2 = "null";
          } else {
            stackIn_25_0 = stackIn_20_0;
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(EscapePod param0, byte param1) {
        Debris discarded$0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null != this.escapePods &&
            this.escapePods.length >= 15) {
            return;
          }
          this.escapePods = (EscapePod[]) (ija.a(param0, this.escapePods, 0, pgb.field_g));
          if (param1 != 107) {
            discarded$0 = this.a(78, (Debris) null, (Ship) null, (byte) -99, 119);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("pe.FD(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0, Nebula param1, byte param2) {
        int var4_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param2 > -66) {
            this.field_h = true;
          }
          var4_int = this.field_p.a(param1, 121);
          if (param0) {
            if (-1 == var4_int) {
              return;
            }
            this.field_u.a(new int[]{-16384 + param1.a(true), param1.a(true) + 16384, param1.getY((byte) -99) - 16384, param1.getY((byte) -127) + 16384}, (byte) 43, var4_int, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("pe.PE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    private final Debris a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var11 = 0;
        Object var7;
        int var8;
        int var9;
        Debris[] var10;
        Debris var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        var20 = VoidHunters.field_G;
        var7 = null;
        var8 = 262144;
        var9 = var8;
        var10 = this.debris;
        for (var11 = 0; var10.length > var11; var11++) {
          var12 = var10[var11];
          if (null != var12 &&
            var12.chassis.componentTypeId == param5) {
            var13 = (var12.getBoundingbox((byte) -80)[0] + var12.getBoundingbox((byte) -97)[1]) / 2;
            var14 = (var12.getBoundingbox((byte) -70)[2] + var12.getBoundingbox((byte) -54)[3]) / 2;
            var15 = var13 - param0;
            var16 = -param2 + var14;
            var17 = ar.a(var15, (byte) 104, var16);
            if (var17 < var9) {
              var18 = -param1 + var13;
              var19 = -param4 + var14;
              if (ar.a(var18, (byte) 108, var19) < gs.field_c &&
                !this.a(false, false, var12.id)) {
                var7 = var12;
                var9 = var17;
              }
            }
          }
        }
        if (param3 != 30) {
          this.field_u = (fba) null;
        }
        return (Debris) (var7);
    }

    private final Debris c(int param0, boolean param1) {
        if (null == this.debris) {
          return null;
        }
        if (param0 < 0) {
          return null;
        }
        if (param0 >= this.debris.length) {
          return null;
        }
        if (null == this.debris[param0]) {
          return null;
        }
        this.l(-85);
        Debris var4 = this.debris[param0];
        Debris var3 = var4;
        if (param1) {
          return (Debris) null;
        }
        this.debris[param0] = new Debris();
        var4.b((byte) 97, this.debris[param0]);
        return this.debris[param0];
    }

    final int c(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        var4 = VoidHunters.field_G;
        var2 = param0;
        for (var3 = 0; var3 < this.ships.length; var3++) {
          if (this.ships[var3] != null) {
            var2++;
          }
        }
        return var2;
    }

    private final void a(int param0, MessageLog param1, Player[] param2) {
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        RuntimeException runtimeException = null;
        Asteroid[] var5 = null;
        IntrusiveDeque var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new IntrusiveDeque();
          this.a(var7, false);
          this.a(var7, (byte) 25);
          var5 = this.field_e.c(0);
          this.a(var7, -1, var5);
          this.a(var5, true, var7);
          if (SetArmageddonWarning.field_o == 1) {
            discarded$3 = this.a(var7, this.debris, this.grapplingHooks, 20521, 3, 1, sja.field_i);
          }
          if (this.a(var7, var5, this.grapplingHooks, param0 + 20519, 3, param0, sja.field_i)) {
            this.field_e.b(-67);
          }
          discarded$4 = this.a(var7, this.ships, this.grapplingHooks, 20521, 3, 0, sja.field_i);
          this.a(var5, param0 ^ 44);
          this.k(param0 ^ -84);
          this.a(param1, 7559, param2, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("pe.FF(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_0 = stackIn_9_0;
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_14_0 = stackIn_13_0;
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = stackIn_9_0;
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final IntrusiveDeque getProjectiles(boolean param0) {
        if (!param0) {
          this.a(-10);
        }
        return this.projectiles;
    }

    final Debris a(boolean param0, int param1, int param2, int param3, int param4) {
        if (!param0) {
          field_w = (int[]) null;
        }
        return this.b(1, 65536, param3, param2, param4, param1);
    }

    public static void h(int param0) {
        if (param0 != 3) {
          field_d = (String) null;
        }
        field_d = null;
        field_w = null;
        field_c = null;
    }

    final ShipBody a(boolean param0, int param1, int param2, int param3) {
        int stackIn_24_0 = 0;
        Debris stackIn_24_1 = null;
        boolean stackIn_25_2 = false;
        Object var5;
        int var6;
        int var8;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        Ship[] var15;
        Ship var16;
        Debris[] var17;
        Debris var18;
        int var8Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        var13 = VoidHunters.field_G;
        var5 = null;
        var6 = 2147483647;
        var15 = this.ships;
        for (var8 = 0; var8 < var15.length; var8++) {
          var16 = var15[var8];
          if (null != var16 &&
            param3 != var16.getTeam((byte) 110)) {
            var10 = -param2 + var16.d(false);
            var11 = -param1 + var16.g((byte) -103);
            var12 = ar.a(var10, (byte) 107, var11);
            if (var12 < var6) {
              var6 = var12;
              var5 = var16;
            }
          }
        }
        if (1 == voa.field_d) {
          var17 = this.debris;
          var14 = 0;
          var8Lifetime1 = var14;
          while (var14 < var17.length) {
            var18 = var17[var14];
            if (null != var18) {
              stackIn_24_0 = -param2;
              stackIn_24_1 = var18;
              stackIn_25_2 = !(param0);
              var10Lifetime1 = stackIn_24_0 + ((Debris) (Object) stackIn_24_1).d(stackIn_25_2);
              var11Lifetime1 = var18.g((byte) 123) - param1;
              var12Lifetime1 = ar.a(var10Lifetime1, (byte) 124, var11Lifetime1);
              if (var6 > var12Lifetime1) {
                var5 = var18;
                var6 = var12Lifetime1;
              }
            }
            var14++;
          }
        }
        if (!param0) {
          this.a(-44, -99, (ShipBody) null);
        }
        return (ShipBody) (var5);
    }

    private final void a(ShipBody[] param0, boolean param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          for (var4_int = 0; var4_int < param0.length; var4_int++) {
            if (param0[var4_int] != null) {
              this.b(param2, (byte) 125, param0[var4_int]);
            }
          }
          if (!param1) {
            this.a(-39, 10, -81, -31, 28, -87, -120, (int[]) null, (byte) 68);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("pe.PC(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void c(int param0, byte param1) {
        this.mapZones = (MapZone[]) (GetSalvoUsesAllEnergy.a(wsb.field_e, param0, 15667, this.mapZones));
        if (param1 != -90) {
          this.a(false, (MissionState) null, (byte) 94, (lta) null);
        }
    }

    private final void a(int param0, int param1, int[] param2, byte param3, int param4, int param5, int param6) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
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
        int var9Lifetime1;
        int var10Lifetime1;
        var18 = VoidHunters.field_G;
        try {
          var8_int = 0;
          for (var9 = 0; param2.length > var9; var9 += 2) {
            var10 = param2[var9];
            if (var10 > var8_int) {
              var8_int = var10;
            }
          }
          var9Lifetime1 = param4 - param6;
          var10Lifetime1 = -param5 + param1;
          if (param3 >= -2) {
            return;
          }
          var11 = ecb.a(var10Lifetime1, (byte) -77, var9Lifetime1);
          var12 = var8_int * GetNumStars.a(var11, (byte) 101) >> 16;
          var13 = var8_int * eu.a(var11, 65) >> 16;
          var14 = 4;
          var15 = -var13 / var14;
          var16 = var12 / var14;
          var17 = 320;
          this.a(param0, var15, 50, 100, 30273, param4, var17, param1, var16);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("pe.JE(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void a(byte param0) {
        if (param0 < 47) {
          this.m(-1);
        }
        if (this.width == 0) {
          this.width = 1 << fob.field_c;
        }
        if (this.field_r == 0) {
          this.field_r = 1 << fob.field_c;
        }
        if (null == this.ships) {
          this.ships = new Ship[field_w[0]];
        }
        if (null == this.debris) {
          this.debris = new Debris[field_w[1]];
        }
        if (this.field_e == null) {
          this.field_e = new AsteroidField(field_w[2]);
        }
        if (this.grapplingHooks == null) {
          this.grapplingHooks = new GrapplingHook[field_w[3]];
        }
        if (null == this.field_p) {
          this.field_p = new NebulaField();
        }
        if (this.field_p.a(false) == null &&
          null != this.field_b) {
          this.field_b.a(this, 0);
        }
        this.f(false);
    }

    private final void a(int param0, vra param1, ShipBlueprint param2, Ship param3) {
        int var10 = 0;
        int var5_int = 0;
        int[] var6 = null;
        ShipComponent var7 = null;
        ShipComponent var8 = null;
        int var9 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var11 = VoidHunters.field_G;
        try {
          if (param0 != 16384) {
            return;
          }
          var5_int = 0;
          var13 = param2.description;
          var12 = var13;
          var6 = var12;
          if (null != var6 &&
            var13.length > 0) {
            var7 = SetSniperCannonProjectileLife.a(1, var13);
            var8 = param3.chassis;
            var9 = var8.j((byte) 57);
            for (var10 = 0; var10 < var9; var10++) {
              stackIn_10_0 = (!this.a(var8, param3, var7, var10, -17329, var7)) ? 0 : 1;
              var5_int = stackIn_10_0;
              if (var5_int != 0) {
                break;
              }
            }
          }
          if (var5_int == 0) {
            param3.a(-1, (byte) -119);
            param3.a((byte) -127, (ShipBlueprint) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("pe.VC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_24_0 = stackIn_20_0;
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_25_0 = stackIn_24_0;
            stackIn_25_2 = "null";
          } else {
            stackIn_25_0 = stackIn_20_0;
            stackIn_25_2 = "{...}";
          }
          stackIn_28_0 = stackIn_25_0;
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param3 == null) {
            stackIn_29_0 = stackIn_28_0;
            stackIn_29_2 = "null";
          } else {
            stackIn_29_0 = stackIn_25_0;
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final void a(boolean param0, MissionState param1, byte param2, lta param3) {
        int var18 = 0;
        int var21 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        String stackIn_103_2 = null;
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
        int[] var13 = null;
        int var14_int = 0;
        Asteroid[] var14 = null;
        Asteroid[] var15_ref_crb__ = null;
        int var15 = 0;
        Debris var15_ref_nbb = null;
        int var16 = 0;
        int var17 = 0;
        Asteroid var17_ref_crb = null;
        Ship var18_ref_sg = null;
        int var19 = 0;
        Ship[] var20 = null;
        Ship var22 = null;
        int var23 = 0;
        Asteroid[] var24 = null;
        Ship[] var25 = null;
        int var26 = 0;
        Debris var27 = null;
        Ship var28 = null;
        Ship var18_ref_sgLifetime1;
        Ship var22Lifetime1;
        Ship var22Lifetime2;
        Ship var18_ref_sgLifetime2;
        Ship var22Lifetime1Lifetime1;
        int var14_intLifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var15Lifetime2;
        int var16Lifetime2;
        int var17Lifetime2;
        var23 = VoidHunters.field_G;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (param1.getMissionPhase(8) == 5) {
            var5_int = param1.getPhaseTimer((byte) -102);
            var6 = lga.a((byte) -2, this.field_y);
            if (var6 < var5_int) {
              var7 = dm.a(this.field_y, (byte) -78);
              var8 = var5_int - var6;
              if (var8 > var7) {
                var8 = var7;
              }
              var9 = -(this.width / var7 * var8) + this.width;
              if (var9 < 0) {
                var9 = 0;
              }
              var10 = -(this.field_r / var7 * var8) + this.field_r;
              if (var10 < 0) {
                var10 = 0;
              }
              var11 = var9 >> 1;
              var12 = var10 >> 1;
              var13 = new int[]{-var11, var11, -var12, var12};
              if (!param0) {
                var26 = 0;
                var14_int = var26;
                while (var26 < this.debris.length) {
                  var27 = this.debris[var26];
                  if (null != var27 &&
                    this.a(true, var13, var27.boundingbox)) {
                    var15_ref_nbb = this.c(var26, false);
                    this.a(var15_ref_nbb, true, false, false, 1);
                  }
                  var26++;
                }
                var14 = this.field_e.c(0);
                var24 = var14;
                var15_ref_crb__ = var14;
                for (var16 = 0; var16 < var24.length; var16++) {
                  var17_ref_crb = var24[var16];
                  if (null != var17_ref_crb &&
                    this.a(true, var13, var17_ref_crb.boundingbox)) {
                    this.a(var17_ref_crb, true, false, false, 2);
                  }
                }
                for (var15 = 0; this.ships.length > var15; var15++) {
                  var28 = this.ships[var15];
                  var18_ref_sg = var28;
                  var22 = var18_ref_sg;
                  var18_ref_sgLifetime2 = var28;
                  if (var28 != null &&
                    this.a(true, var13, var28.boundingbox)) {
                    var28.chassis.a(1000, (byte) 85);
                  }
                }
                var15Lifetime2 = 0;
                var25 = this.ships;
                for (var17 = 0; var25.length > var17; var17++) {
                  var18_ref_sgLifetime1 = var25[var17];
                  var22Lifetime1 = var18_ref_sgLifetime1;
                  var22Lifetime1Lifetime1 = var18_ref_sgLifetime1;
                  if (null != var18_ref_sgLifetime1 &&
                    var15Lifetime2 < var18_ref_sgLifetime1.getTeam((byte) 97)) {
                    var15Lifetime2 = var18_ref_sgLifetime1.getTeam((byte) 103);
                  }
                }
                var16Lifetime2 = -1;
                var17Lifetime2 = 0;
                for (var18 = 0; var18 <= var15Lifetime2; var18++) {
                  var19 = 0;
                  var20 = this.ships;
                  for (var21 = 0; var20.length > var21; var21++) {
                    var22Lifetime2 = var20[var21];
                    if (null != var22Lifetime2 &&
                      var18 == var22Lifetime2.getTeam((byte) 105) &&
                      var22Lifetime2.getAi((byte) -108) == null) {
                      var19++;
                    }
                  }
                  if (var19 > 0) {
                    var19 = 1;
                  }
                  if (var19 <= var17Lifetime2) {
                    if (var19 == var17Lifetime2) {
                      var16Lifetime2 = -1;
                    }
                  } else {
                    var17Lifetime2 = var19;
                    var16Lifetime2 = var18;
                  }
                }
                if (var16Lifetime2 >= 0) {
                  param1.b(false, var16Lifetime2);
                }
                if (!(var7 > var8)) {
                  param1.b(false, -1);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                var14_intLifetime1 = -1 + param3.a(-var11, (byte) 123);
                var15Lifetime1 = param3.a(var11, (byte) 126) + 1;
                var16Lifetime1 = param3.b(true, -var12) - 1;
                var17Lifetime1 = param3.b(true, var12) + 1;
                kob.a((byte) 17, var15Lifetime1, var17Lifetime1, var16Lifetime1, var14_intLifetime1);
              }
            }
          }
          if (param2 != -117) {
            this.width = -34;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_98_0 = var5;
          stackIn_98_1 = new StringBuilder().append("pe.AE(").append(param0).append(',');
          if (param1 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          stackIn_102_0 = stackIn_98_0;
          stackIn_102_1 = ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_103_0 = stackIn_102_0;
            stackIn_103_2 = "null";
          } else {
            stackIn_103_0 = stackIn_98_0;
            stackIn_103_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
        }
    }

    private final void a(MessageLog param0, int param1, Player[] param2, Asteroid[] param3) {
        Player dupTemp$0 = null;
        Player dupTemp$1 = null;
        Player dupTemp$2 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        String stackIn_109_2 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        RuntimeException stackIn_113_0 = null;
        String stackIn_113_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Asteroid var7 = null;
        int var7_int = 0;
        EscapePod var8_ref_it = null;
        int var8 = 0;
        ShipComponent[] var9_ref_ml__ = null;
        int var9 = 0;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Ship var16 = null;
        int[] var17 = null;
        Debris var18 = null;
        Debris var19 = null;
        GrapplingHook[] var20 = null;
        GrapplingHook var21 = null;
        Asteroid[] var22 = null;
        Asteroid var23 = null;
        EscapePod var24 = null;
        int[] var25 = null;
        int[] var10Lifetime1;
        Debris var19Lifetime1;
        Debris var19Lifetime2;
        int var5_intLifetime1;
        int var5_intLifetime2;
        int var6Lifetime1;
        int var11Lifetime1;
        var13 = VoidHunters.field_G;
        try {
          for (var5_int = 0; var5_int < this.ships.length; var5_int++) {
            var16 = this.ships[var5_int];
            if (var16 != null &&
              var16.h(-120)) {
              if (var16.s(param1 ^ 7662)) {
                var8_ref_it = new EscapePod();
                var8_ref_it.x = var16.d(false);
                var8_ref_it.y = var16.g((byte) 124);
                var8_ref_it.owner = var16.getOwner((byte) -117);
                var8_ref_it.team = var16.getTeam((byte) 93);
                this.a(var8_ref_it, (byte) 107);
              }
              var7_int = 1;
              var8 = var16.getOwner((byte) -117);
              if (0 <= var8 &&
                var8 < param2.length) {
                if (SetMaxShipSize.field_o == 1) {
                  var9_ref_ml__ = var16.chassis.a(0, GetFogOfWarSensorRange.field_o, (ShipComponent[]) null);
                  var7_int = 0;
                  this.a(var16, true, true, true, 0);
                  if (null != var9_ref_ml__ &&
                    var9_ref_ml__.length > 0) {
                    var10 = new int[var9_ref_ml__.length];
                    for (var11 = 0; var9_ref_ml__.length > var11; var11++) {
                      var10[var11] = var9_ref_ml__[var11].componentTypeId;
                    }
                    param2[var8].carriedOverComponents = var10;
                  }
                }
                dupTemp$0 = param2[var8];
                dupTemp$0.deaths = dupTemp$0.deaths + 1;
                var9 = -1;
                var25 = var16.getLastAttackers(-26448);
                var17 = var25;
                var10Lifetime1 = var17;
                if (null != var10Lifetime1) {
                  var14 = 0;
                  var11Lifetime1 = var14;
                  while (var14 < var25.length) {
                    var12 = var25[var14];
                    if (var12 >= 0 &&
                      param2.length > var12) {
                      if (var14 != var25.length - 1) {
                        dupTemp$1 = param2[var12];
                        dupTemp$1.assists = dupTemp$1.assists + 1;
                      } else {
                        var9 = var12;
                        dupTemp$2 = param2[var12];
                        dupTemp$2.kills = dupTemp$2.kills + 1;
                      }
                    }
                    var14++;
                  }
                }
                if (var9 == -1) {
                  param0.a(new Message(3, var8, var8), true);
                } else {
                  param0.a(new Message(0, var9, var8), true);
                }
              }
              if (var7_int != 0) {
                if (var16.g(false)) {
                  this.a(var16, true, false, false, 0);
                } else {
                  this.a(0, (byte) 117, (ShipBody) (var16));
                }
              }
            }
          }
          for (var5_intLifetime1 = 0; var5_intLifetime1 < this.debris.length; var5_intLifetime1++) {
            var18 = this.debris[var5_intLifetime1];
            var19 = var18;
            var19Lifetime1 = var18;
            if (var18 != null &&
              var18.field_u) {
              var19Lifetime2 = this.c(var5_intLifetime1, false);
              if (var19Lifetime2.h(-128)) {
                this.a(1, (byte) 66, (ShipBody) (var19Lifetime2));
              } else {
                var19Lifetime2.a(107, this);
              }
              var19Lifetime2.field_u = false;
            }
          }
          var20 = this.grapplingHooks;
          for (var6 = 0; var6 < var20.length; var6++) {
            var21 = var20[var6];
            if (null != var21 &&
              var21.h(-122)) {
              this.a(3, (byte) 90, (ShipBody) (var21));
            }
          }
          if (param1 != 7559) {
            this.debug = true;
          }
          var22 = param3;
          var15 = 0;
          var6Lifetime1 = var15;
          while (var22.length > var15) {
            var23 = var22[var15];
            var7 = var23;
            if (var7 != null &&
              var23.h(-116)) {
              this.a(2, (byte) 72, (ShipBody) (var23));
            }
            var15++;
          }
          if (null != this.escapePods) {
            var5_intLifetime2 = 0;
            while (this.escapePods.length > var5_intLifetime2) {
              var24 = this.escapePods[var5_intLifetime2];
              if (var24.hyperdriveTimer <= 0) {
                this.b((byte) 41, var5_intLifetime2);
                var5_intLifetime2--;
              }
              var5_intLifetime2++;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_104_0 = var5;
          stackIn_104_1 = new StringBuilder().append("pe.BF(");
          if (param0 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          stackIn_108_0 = stackIn_104_0;
          stackIn_108_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_109_0 = stackIn_108_0;
            stackIn_109_2 = "null";
          } else {
            stackIn_109_0 = stackIn_104_0;
            stackIn_109_2 = "{...}";
          }
          stackIn_112_0 = stackIn_109_0;
          stackIn_112_1 = ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(',');
          if (param3 == null) {
            stackIn_113_0 = stackIn_112_0;
            stackIn_113_2 = "null";
          } else {
            stackIn_113_0 = stackIn_109_0;
            stackIn_113_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_113_0), ((StringBuilder) (Object) stackIn_112_1).append(stackIn_113_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, boolean param2, int param3, int param4, Ship param5) {
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        rca var13 = null;
        int var13_int = 0;
        rdb var14_ref_rdb = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Asteroid[] var16_ref_crb__ = null;
        int var17 = 0;
        Asteroid[] var17_ref_crb__ = null;
        Ship var18_ref_sg = null;
        int var18 = 0;
        int var19_int = 0;
        Asteroid var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Ship[] var24 = null;
        rca var25 = null;
        int var15Lifetime1;
        int var17Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        var23 = VoidHunters.field_G;
        try {
          var7_int = 0;
          var8 = 0;
          var9 = 0;
          var10 = this.d(false);
          if (qab.a(param0 + 200051, var10)) {
            var11 = 0;
            var12 = 0;
            var13_int = 0;
            var14_ref_rdb = (rdb) (this.spawnPoints.d(param0 + 200000));
            while (null != var14_ref_rdb) {
              if (~param3 == ~var14_ref_rdb.getTeam(-92)) {
                var13_int++;
                var11 = var11 + var14_ref_rdb.a(true);
                var12 = var12 + var14_ref_rdb.a(94);
                var15 = 1;
                var24 = this.ships;
                var17 = 0;
                scanLoop1: while (true) {
                  if (var24.length > var17) {
                    var18_ref_sg = var24[var17];
                    if (var18_ref_sg != null) {
                      var19_int = var14_ref_rdb.a(true) - var18_ref_sg.x;
                      var20 = var14_ref_rdb.a(74) - var18_ref_sg.y;
                      var21 = ar.a(var19_int, (byte) 126, var20);
                      var22 = var18_ref_sg.b(true) + 51200;
                      if (param3 != var18_ref_sg.getTeam((byte) 93) &&
                        !param2) {
                        var22 = var22 + (SetShipDirectionArrow.field_o[7].j(121) << 3);
                      }
                      if (var21 < var22) {
                        var15 = 0;
                        break scanLoop1;
                      }
                    }
                    var17++;
                    continue;
                  }
                  break;
                }
                if (var15 == 0) {
                  if (var15 != 0) {
                    var7_int = var14_ref_rdb.a(true);
                    var9 = 1;
                    var8 = var14_ref_rdb.a(102);
                  }
                  var14_ref_rdb = (rdb) (this.spawnPoints.a((byte) 11));
                  continue;
                }
                var16_ref_crb__ = this.field_e.c(0);
                var17_ref_crb__ = var16_ref_crb__;
                var18 = 0;
                scanLoop2: while (true) {
                  if (var18 < var17_ref_crb__.length) {
                    var19 = var17_ref_crb__[var18];
                    if (null != var19) {
                      var20Lifetime1 = var14_ref_rdb.a(true) - var19.x;
                      var21Lifetime1 = var14_ref_rdb.a(param0 ^ -200015) - var19.y;
                      var22Lifetime1 = ar.a(var20Lifetime1, (byte) 125, var21Lifetime1);
                      if (51200 + var19.chassis.i((byte) -112).field_l > var22Lifetime1) {
                        var15 = 0;
                        break scanLoop2;
                      }
                    }
                    var18++;
                    continue;
                  }
                  break;
                }
                if (var15 != 0) {
                  var7_int = var14_ref_rdb.a(true);
                  var9 = 1;
                  var8 = var14_ref_rdb.a(102);
                }
              }
              var14_ref_rdb = (rdb) (this.spawnPoints.a((byte) 11));
            }
            boolean decompiledFrameRemainder0 = true;
            if (var9 == 0) {
              if (var13_int != 0) {
                var12 = var12 / var13_int;
                var11 = var11 / var13_int;
                var25 = this.a(var12, this.field_r, 0, var11, param3, this.width / 4);
                var8 = var25.field_b;
                var7_int = var25.field_c;
              } else {
                var14 = this.width / param4;
                var15Lifetime1 = this.field_r / param4;
                if (0 <= param3 &&
                  2 > param3) {
                  var16 = -200000 + param3 * 400000;
                  var17Lifetime1 = this.width * 2 / 3 * param3;
                  var7_int = var17Lifetime1 + -this.width / 3;
                  var8 = this.field_r / 3 - param3 * (this.field_r * 2 / 3);
                  if ((this.field_y != -1)) {
                    var8 = var8 + (-var16 + 20000 * param1);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var8 = var15Lifetime1 / 2 + -this.field_r / 2 + var15Lifetime1 * param1;
                  var7_int = -this.width / 2 + (var14 * param1 + var14 / 2);
                }
              }
            }
            if (var7_int > 0) {
              param5.a(4096, -122);
            }
          } else {
            param3 = param1;
            var11 = this.width;
            var12 = this.field_r;
            if (this.field_y == 13) {
              var11 = var11 / 2;
              var12 = var12 / 2;
            }
            var13 = this.a(0, var12, 0, 0, param3, var11);
            var8 = var13.field_b;
            var7_int = var13.field_c;
            param5.a(hob.a(GetFogOfWarSensorRange.field_o, 8192, 117), -29);
          }
          param5.a(var7_int, var8, (byte) 65);
          param5.dx = 0;
          param5.field_t = 0;
          param5.field_o = 0;
          param5.dy = 0;
          param5.field_p = 0;
          param5.g(param1, param0 + 200125);
          if (param0 != -200000) {
            return;
          }
          param5.h(17704, param3);
          this.a(param5, (byte) 98);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_59_0 = var7;
          stackIn_59_1 = new StringBuilder().append("pe.ID(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(')').toString());
        }
    }

    public final void a(faa param0, byte param1) {
        int stackIn_5_0 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        boolean stackIn_14_2 = false;
        int stackIn_23_0 = 0;
        faa stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        boolean stackIn_32_2 = false;
        int stackIn_41_0 = 0;
        faa stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        boolean stackIn_50_2 = false;
        faa stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        boolean stackIn_59_2 = false;
        int stackIn_67_0 = 0;
        faa stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        boolean stackIn_74_2 = false;
        int stackIn_83_0 = 0;
        faa stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        boolean stackIn_90_2 = false;
        int stackIn_98_0 = 0;
        int stackIn_99_1 = 0;
        faa stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        boolean stackIn_103_2 = false;
        int stackIn_109_0 = 0;
        faa stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        boolean stackIn_118_2 = false;
        int stackIn_127_0 = 0;
        faa stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        boolean stackIn_136_2 = false;
        faa stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        boolean stackIn_145_2 = false;
        faa stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        boolean stackIn_151_2 = false;
        int stackIn_159_0 = 0;
        faa stackIn_167_0 = null;
        int stackIn_167_1 = 0;
        boolean stackIn_168_2 = false;
        faa stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        boolean stackIn_177_2 = false;
        RuntimeException stackIn_185_0 = null;
        StringBuilder stackIn_185_1 = null;
        String stackIn_186_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa var3 = null;
        RuntimeException var3_ref = null;
        Ship[] var4 = null;
        tv[] var4_array = null;
        Debris[] var4_array2 = null;
        GrapplingHook[] var4_array3 = null;
        MapZone[] var4_array4 = null;
        ResourceNode[] var4_array5 = null;
        EscapePod[] var4_array6 = null;
        int var5 = 0;
        tv[] var6 = null;
        Debris[] var6_array = null;
        int var7 = 0;
        Ship var8 = null;
        tv var8_ref = null;
        Debris var8_ref2 = null;
        GrapplingHook var8_ref3 = null;
        MapZone var8_ref4 = null;
        ResourceNode var8_ref5 = null;
        EscapePod var8_ref6 = null;
        int var9 = 0;
        Ship[] var10 = null;
        faa var11 = null;
        Ship[] var12 = null;
        tv[] var13 = null;
        faa var14 = null;
        tv[] var15 = null;
        tv var16 = null;
        Debris[] var17 = null;
        faa var18 = null;
        Debris[] var19 = null;
        tv[] var20 = null;
        faa var21 = null;
        GrapplingHook[] var22 = null;
        faa var23 = null;
        GrapplingHook[] var24 = null;
        MapZone[] var25 = null;
        faa var26 = null;
        MapZone[] var27 = null;
        ResourceNode[] var28 = null;
        faa var29 = null;
        ResourceNode[] var30 = null;
        EscapePod[] var31 = null;
        faa var32 = null;
        EscapePod[] var33 = null;
        faa var3Lifetime1;
        faa var3Lifetime2;
        faa var3Lifetime3;
        faa var3Lifetime4;
        faa var3Lifetime5;
        faa var3Lifetime6;
        faa var3Lifetime7;
        tv[] var4_arrayLifetime1;
        tv[] var6Lifetime1;
        tv var8_refLifetime1;
        tv var8_refLifetime2;
        tv var8_refLifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var5Lifetime7;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var7Lifetime6;
        int var7Lifetime7;
        var9 = VoidHunters.field_G;
        try {
          var11 = param0;
          var3 = var11;
          var10 = this.ships;
          var4 = var10;
          if (null == var4) {
            stackIn_5_0 = 0;
          } else {
            stackIn_5_0 = var10.length;
          }
          var5 = stackIn_5_0;
          var11.a(-632, var5, 8);
          if (0 != var5) {
            var12 = var10;
            for (var7 = 0; var12.length > var7; var7++) {
              var8 = var12[var7];
              stackIn_13_0 = var3;
              stackIn_13_1 = 110;
              stackIn_14_2 = (null != var8);
              if (vq.a(stackIn_13_0, stackIn_13_1, stackIn_14_2)) {
                ((utb) ((Object) var8)).a(var11, (byte) -105);
              }
            }
          }
          var14 = param0;
          var3Lifetime1 = var14;
          var13 = hob.a(this.projectiles, 210377952);
          var4_array = var13;
          if (null == var4_array) {
            stackIn_23_0 = 0;
          } else {
            stackIn_23_0 = var13.length;
          }
          var5Lifetime1 = stackIn_23_0;
          var14.a(-632, var5Lifetime1, 10);
          if (var5Lifetime1 != 0) {
            var15 = var4_array;
            var6 = var15;
            for (var7Lifetime1 = 0; var15.length > var7Lifetime1; var7Lifetime1++) {
              var16 = var15[var7Lifetime1];
              var8_ref = var16;
              var8_refLifetime2 = var16;
              var8_refLifetime3 = var16;
              stackIn_31_0 = var3Lifetime1;
              stackIn_31_1 = -69;
              stackIn_32_2 = (var16 != null);
              if (vq.a(stackIn_31_0, stackIn_31_1, stackIn_32_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var14, var16);
              }
            }
          }
          var18 = param0;
          var3Lifetime2 = var18;
          var17 = this.debris;
          var4_array2 = var17;
          if (var4_array2 == null) {
            stackIn_41_0 = 0;
          } else {
            stackIn_41_0 = var17.length;
          }
          var5Lifetime2 = stackIn_41_0;
          var18.a(-632, var5Lifetime2, 10);
          if (var5Lifetime2 != 0) {
            var19 = var4_array2;
            var6_array = var19;
            for (var7Lifetime2 = 0; var7Lifetime2 < var19.length; var7Lifetime2++) {
              var8_ref2 = var19[var7Lifetime2];
              stackIn_49_0 = var3Lifetime2;
              stackIn_49_1 = 101;
              stackIn_50_2 = (var8_ref2 != null);
              if (vq.a(stackIn_49_0, stackIn_49_1, stackIn_50_2)) {
                ((utb) ((Object) var8_ref2)).a(var18, (byte) -127);
              }
            }
          }
          stackIn_58_0 = (faa) (param0);
          stackIn_58_1 = 54;
          stackIn_59_2 = (null != this.field_e);
          if (vq.a(stackIn_58_0, stackIn_58_1, stackIn_59_2)) {
            this.field_e.a(param0, (byte) -92);
          }
          var21 = param0;
          var3Lifetime3 = var21;
          var20 = hob.a(this.spawnPoints, 210377952);
          var4_arrayLifetime1 = var20;
          if (null == var4_arrayLifetime1) {
            stackIn_67_0 = 0;
          } else {
            stackIn_67_0 = var20.length;
          }
          var5Lifetime3 = stackIn_67_0;
          var21.a(-632, var5Lifetime3, 6);
          if (var5Lifetime3 != 0) {
            var6Lifetime1 = var20;
            for (var7Lifetime3 = 0; var6Lifetime1.length > var7Lifetime3; var7Lifetime3++) {
              var8_refLifetime1 = var6Lifetime1[var7Lifetime3];
              stackIn_73_0 = var3Lifetime3;
              stackIn_73_1 = 66;
              stackIn_74_2 = (var8_refLifetime1 != null);
              if (vq.a(stackIn_73_0, stackIn_73_1, stackIn_74_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var3Lifetime3, var8_refLifetime1);
              }
            }
          }
          var23 = param0;
          var3Lifetime4 = var23;
          var22 = this.grapplingHooks;
          var4_array3 = var22;
          if (var4_array3 == null) {
            stackIn_83_0 = 0;
          } else {
            stackIn_83_0 = var22.length;
          }
          var5Lifetime4 = stackIn_83_0;
          var23.a(-632, var5Lifetime4, 8);
          if (0 != var5Lifetime4) {
            var24 = var22;
            for (var7Lifetime4 = 0; var7Lifetime4 < var24.length; var7Lifetime4++) {
              var8_ref3 = var24[var7Lifetime4];
              stackIn_89_0 = var3Lifetime4;
              stackIn_89_1 = 74;
              stackIn_90_2 = (var8_ref3 != null);
              if (vq.a(stackIn_89_0, stackIn_89_1, stackIn_90_2)) {
                ((utb) ((Object) var8_ref3)).a(var23, (byte) -98);
              }
            }
          }
          stackIn_98_0 = 4;
          if (this.respawntimers == null) {
            stackIn_99_1 = 0;
          } else {
            stackIn_99_1 = this.respawntimers.length;
          }
          pgb.a(stackIn_98_0, stackIn_99_1, -114, param0, this.respawntimers);
          vq.a(param0, 56, this.debug);
          param0.a(-632, this.field_y, 32);
          vq.a(param0, 39, this.swappedTeams);
          stackIn_102_0 = (faa) (param0);
          stackIn_102_1 = 122;
          stackIn_103_2 = (null != this.missionControl);
          if (vq.a(stackIn_102_0, stackIn_102_1, stackIn_103_2)) {
            this.missionControl.b(param0, -123);
          }
          var26 = param0;
          var3Lifetime5 = var26;
          var25 = this.mapZones;
          var4_array4 = var25;
          if (var4_array4 != null) {
            stackIn_109_0 = var25.length;
          } else {
            stackIn_109_0 = 0;
          }
          var5Lifetime5 = stackIn_109_0;
          var26.a(-632, var5Lifetime5, 8);
          if (0 != var5Lifetime5) {
            var27 = var25;
            for (var7Lifetime5 = 0; var7Lifetime5 < var27.length; var7Lifetime5++) {
              var8_ref4 = var27[var7Lifetime5];
              stackIn_117_0 = var3Lifetime5;
              stackIn_117_1 = 47;
              stackIn_118_2 = (null != var8_ref4);
              if (vq.a(stackIn_117_0, stackIn_117_1, stackIn_118_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var26, var8_ref4);
              }
            }
          }
          var29 = param0;
          var3Lifetime6 = var29;
          var28 = this.resNodes;
          var4_array5 = var28;
          if (null != var4_array5) {
            stackIn_127_0 = var28.length;
          } else {
            stackIn_127_0 = 0;
          }
          var5Lifetime6 = stackIn_127_0;
          var29.a(-632, var5Lifetime6, 4);
          if (var5Lifetime6 != 0) {
            var30 = var28;
            for (var7Lifetime6 = 0; var30.length > var7Lifetime6; var7Lifetime6++) {
              var8_ref5 = var30[var7Lifetime6];
              stackIn_135_0 = var3Lifetime6;
              stackIn_135_1 = 89;
              stackIn_136_2 = (null != var8_ref5);
              if (vq.a(stackIn_135_0, stackIn_135_1, stackIn_136_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var29, var8_ref5);
              }
            }
          }
          stackIn_144_0 = (faa) (param0);
          stackIn_144_1 = -94;
          stackIn_145_2 = (null != this.field_p);
          if (vq.a(stackIn_144_0, stackIn_144_1, stackIn_145_2)) {
            this.field_p.b(param0, -117);
          }
          param0.a(-632, this.width, 28);
          param0.a(-632, this.field_r, 28);
          stackIn_150_0 = (faa) (param0);
          stackIn_150_1 = 109;
          stackIn_151_2 = (null != this.field_u);
          if (vq.a(stackIn_150_0, stackIn_150_1, stackIn_151_2)) {
            this.field_u.b(param0, -125);
          }
          if (param1 > -91) {
            field_d = (String) null;
          }
          var32 = param0;
          var3Lifetime7 = var32;
          var31 = this.escapePods;
          var4_array6 = var31;
          if (null == var4_array6) {
            stackIn_159_0 = 0;
          } else {
            stackIn_159_0 = var31.length;
          }
          var5Lifetime7 = stackIn_159_0;
          var32.a(-632, var5Lifetime7, 4);
          if (var5Lifetime7 != 0) {
            var33 = var31;
            for (var7Lifetime7 = 0; var33.length > var7Lifetime7; var7Lifetime7++) {
              var8_ref6 = var33[var7Lifetime7];
              stackIn_167_0 = var3Lifetime7;
              stackIn_167_1 = -59;
              stackIn_168_2 = (var8_ref6 != null);
              if (vq.a(stackIn_167_0, stackIn_167_1, stackIn_168_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var32, var8_ref6);
              }
            }
          }
          stackIn_176_0 = (faa) (param0);
          stackIn_176_1 = 38;
          stackIn_177_2 = (null != this.field_b);
          if (vq.a(stackIn_176_0, stackIn_176_1, stackIn_177_2)) {
            this.field_b.b(param0, -113);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_185_0 = var3_ref;
          stackIn_185_1 = new StringBuilder().append("pe.E(");
          if (param0 == null) {
            stackIn_186_2 = "null";
          } else {
            stackIn_186_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_185_0), ((StringBuilder) (Object) stackIn_185_1).append(stackIn_186_2).append(',').append(param1).append(')').toString());
        }
    }

    final Ship d(int param0, int param1) {
        int var4 = 0;
        Ship[] var3;
        Ship var5;
        int var6;
        Ship[] var7;
        var6 = VoidHunters.field_G;
        var7 = this.ships;
        var3 = var7;
        if (param1 < 50) {
          return (Ship) null;
        }
        for (var4 = 0; var4 < var7.length; var4++) {
          var5 = var7[var4];
          if (null != var5 &&
            param0 == var5.getOwner((byte) -117)) {
            return var5;
          }
        }
        return null;
    }

    final int c(int param0, int param1) {
        if (param0 != -2003) {
          return 40;
        }
        if (param1 >= 0) {
          if (this.respawntimers.length <= param1) {
            return 0;
          }
          return Particle.field_C - this.respawntimers[param1];
        }
        return 0;
    }

    final int getWidth(byte param0) {
        if (param0 != -122) {
          field_d = (String) null;
        }
        return this.width;
    }

    private final boolean a(int param0, ShipComponent param1, ShipBody param2, byte param3, int param4, ShipComponent param5, ShipBody param6, int param7, int param8) {
        int var15 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        ShipComponent var10 = null;
        RuntimeException var10_ref = null;
        ShipComponent var11 = null;
        ShipBody var12 = null;
        ShipBody var13 = null;
        int var14 = 0;
        Object var16 = null;
        ShipBody var17 = null;
        long var18 = 0L;
        long var20 = 0L;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        GrapplingHook var26 = null;
        var16 = null;
        var25 = VoidHunters.field_G;
        try {
          if (param5.componentTypeId != 28 &&
            param1.componentTypeId != 28) {
            return true;
          }
          var10 = param5;
          var11 = param1;
          var12 = param6;
          var13 = param2;
          if (param3 <= 42) {
            this.field_y = 115;
          }
          var14 = param8;
          for (var15 = 0; 2 > var15; var15++) {
            if (var10.getComponentTypeId(0) == 28 &&
              var12 instanceof GrapplingHook &&
              var11.grapplebehaviour != null &&
              var11.grapplebehaviour.hookId == var12.id) {
              if (((GrapplingHook) (var12)).getRetracting((byte) -76)) {
                this.a(-104, var14, var12);
              }
              return false;
            }
            if (28 == var10.getComponentTypeId(0) &&
              var12 instanceof GrapplingHook) {
              var26 = (GrapplingHook) (var12);
              if (var13.id == var26.p(32)) {
                return true;
              }
              if (var26.l((byte) 13) == -1 &&
                !var26.getRetracting((byte) -16)) {
                var17 = var13;
                var18 = (long)(var26.d(false) - var11.finalx);
                var20 = (long)(var26.g((byte) 118) - var11.finaly);
                var22 = -var11.finalangle;
                var23 = (int)((long)GetNumStars.a(var22, (byte) 29) * var18 - var20 * (long)eu.a(var22, 39) >> 16);
                var24 = (int)((long)eu.a(var22, 58) * var18 + var20 * (long)GetNumStars.a(var22, (byte) 75) >> 16);
                qba.a(20382, var26.d(false), 11, var26.g((byte) 124), 50);
                var26.d(param7, var23, var24, 122, var17.id);
              }
              return false;
            }
            var10 = param1;
            var14 = param0;
            var13 = param6;
            var11 = param5;
            param7 = param4;
            var12 = param2;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_37_0 = var10_ref;
          stackIn_37_1 = new StringBuilder().append("pe.JF(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_41_0 = stackIn_37_0;
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param2 == null) {
            stackIn_42_0 = stackIn_41_0;
            stackIn_42_2 = "null";
          } else {
            stackIn_42_0 = stackIn_37_0;
            stackIn_42_2 = "{...}";
          }
          stackIn_45_0 = stackIn_42_0;
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_46_0 = stackIn_45_0;
            stackIn_46_2 = "null";
          } else {
            stackIn_46_0 = stackIn_42_0;
            stackIn_46_2 = "{...}";
          }
          stackIn_49_0 = stackIn_46_0;
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param6 == null) {
            stackIn_50_0 = stackIn_49_0;
            stackIn_50_2 = "null";
          } else {
            stackIn_50_0 = stackIn_46_0;
            stackIn_50_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final void a(Ship param0, lta param1, int param2) {
        boolean discarded$0 = false;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        String var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] var16 = null;
        String var17 = null;
        int[] var18 = null;
        String var5Lifetime1;
        String var5Lifetime2;
        int var6Lifetime1;
        int var7Lifetime1;
        try {
          var18 = param0.getBoundingbox((byte) -44);
          var16 = var18;
          var15 = var16;
          var4 = var15;
          if (!MissionAction.a(var18, param1.field_f, 5)) {
            if (param0.b(1, (byte) -107)) {
              return;
            }
            var5_int = -(int)param1.field_c + param0.x;
            var6 = -(int)param1.field_b + param0.y;
            var7 = ar.a(var5_int, (byte) 110, var6);
            var8 = (float)((param0.g(-66) << 8) / var7);
            if (0.0f >= var8) {
              return;
            }
            var9 = SetMissionTerrainSpaceProbability.a(0, (int)param1.field_b, (int)param1.field_c, param1.field_f[2], param0.y, 16, param1.field_f[1], param1.field_f[0], param1.field_f[3], param0.x);
            if (var9 >= 0) {
              var10 = (int)(1.0f * (float)var5_int * (float)var9 / 65536.0f + param1.field_c);
              var11 = (int)(param1.field_b + (float)var6 * 1.0f * (float)var9 / 65536.0f);
              var12 = param1.a(var10, (byte) 127);
              var13 = param1.b(true, var11);
              var14 = qpb.a(false, param0.getTeam((byte) 88), 13894143);
              GetPhasedEnergyBeamReload.a(var13, var8, -109, var12, var14);
            }
            return;
          }
          param0.a(param1, 122, this);
          if (param2 < 50) {
            discarded$0 = this.a(-62, (ShipComponent) null, (Hardpoint) null, true, (byte) 99, (Ship) null, (Debris) null);
          }
          if (GetPointDefenceLaserProjectiles.a(32, 11284)) {
            var17 = "Team=" + param0.getTeam((byte) 101) + ",owner=" + param0.getOwner((byte) -117) + " ai=" + param0.l((byte) -10);
            var5 = var17;
            var5Lifetime1 = var17;
            var5Lifetime2 = var17;
            if (param0.l((byte) -10)) {
              var5Lifetime2 = var17 + " parent=" + param0.getAi((byte) -108).a((byte) -125);
            }
            var6Lifetime1 = param1.a(param0.d(false), (byte) 123);
            var7Lifetime1 = param1.b(true, param0.g((byte) -54) - 16384);
            GetLagStandardDeviationOut.a(-1, var5Lifetime2, 16711935, var7Lifetime1, var6Lifetime1 - (GetPhasedEnergyBeamProjectiles.a(115, var5Lifetime2) >> 1), 4266);
          }
          if (GetPointDefenceLaserProjectiles.a(4096, 11284) &&
            param0.l((byte) -10)) {
            param0.getAi((byte) -108).a(param0, -11, param1, this);
          }
          this.a((byte) 69, param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("pe.RC(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_33_0 = stackIn_29_0;
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_34_0 = stackIn_33_0;
            stackIn_34_2 = "null";
          } else {
            stackIn_34_0 = stackIn_29_0;
            stackIn_34_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(Player param0, int param1, Ship param2, lta param3, byte param4, Ship param5, int param6, int param7, int param8) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        String stackIn_43_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        int var11 = 0;
        Ship var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        String var15 = null;
        String var16_ref_String = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        Ship[] var20 = null;
        int var17Lifetime1;
        var19 = VoidHunters.field_G;
        try {
          var20 = this.ships;
          var11 = 0;
          scanLoop1: while (true) {
            if (var11 < var20.length) {
              var12 = var20[var11];
              if (null != var12 &&
                !var12.b(2, (byte) 78)) {
                var13 = var12.getOwner((byte) -117);
                if (param8 == var13) {
                  var14 = qpb.a(false, var12.getTeam((byte) 80), 13894143);
                  var12.chassis.a(0, var14, this, param3);
                  if (param5 == var12 &&
                    param2 != null) {
                    this.a(param2, param3, 55);
                  } else {
                    this.a(var12, param3, 61);
                  }
                  this.a(param0, param5, (byte) -128, var12, param1, param7, var13, param3);
                  this.a(param3, var12, param1, 0, param7);
                  if (var12.d(9, 100)) {
                    var15_int = var12.y(8);
                    if (var15_int >= 0) {
                      var16_ref_String = Integer.toString((var15_int - 1) / Particle.field_l);
                      var17 = param3.a(var12.d(false), (byte) 119);
                      var18 = param3.b(true, -8192 + var12.getBoundingbox((byte) -70)[2]);
                      SetSelfDestructPrepareToggleCooldown.a(-(tea.a(1, var16_ref_String, 13879) >> 1) + var17, -1, var18, var16_ref_String, 1, 16541441, (byte) -94);
                    }
                  }
                  if (!GetPointDefenceLaserProjectiles.a(8, 11284)) {
                    break scanLoop1;
                  }
                  var15 = "Dragging debris=" + Integer.toString(var12.getDragging(param4 - 116));
                  var16 = param3.a(var12.d(false), (byte) 126);
                  var17Lifetime1 = param3.b(true, var12.g((byte) 125) - 16384);
                  GetLagStandardDeviationOut.a(-1, var15, 16711935, var17Lifetime1, var16 - (GetPhasedEnergyBeamProjectiles.a(-9, var15) >> 1), param4 + 4247);
                  break scanLoop1;
                }
              }
              var11++;
              continue;
            }
            break;
          }
          if (param4 != 19) {
            this.spawnPoints = (IntrusiveDeque) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_34_0 = var10;
          stackIn_34_1 = new StringBuilder().append("pe.JA(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_38_0 = stackIn_34_0;
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_0 = stackIn_38_0;
            stackIn_39_2 = "null";
          } else {
            stackIn_39_0 = stackIn_34_0;
            stackIn_39_2 = "{...}";
          }
          stackIn_42_0 = stackIn_39_0;
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param3 == null) {
            stackIn_43_0 = stackIn_42_0;
            stackIn_43_2 = "null";
          } else {
            stackIn_43_0 = stackIn_39_0;
            stackIn_43_2 = "{...}";
          }
          stackIn_46_0 = stackIn_43_0;
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_47_0 = stackIn_46_0;
            stackIn_47_2 = "null";
          } else {
            stackIn_47_0 = stackIn_43_0;
            stackIn_47_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final void a(ShipBody param0, boolean param1, boolean param2, boolean param3, int param4) {
        int stackIn_10_0 = 0;
        ShipBody stackIn_10_1 = null;
        boolean stackIn_11_2 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param3 &&
            param2) {
            param0.a(-61, this);
          }
          param0.a(-49, param2, this);
          param0.d((byte) 95);
          if (!param1) {
            this.b(-10);
          }
          this.a(-110, param4, param0);
          stackIn_10_0 = 20382;
          stackIn_10_1 = (ShipBody) (param0);
          stackIn_11_2 = !(param1);
          qba.a(stackIn_10_0, ((ShipBody) (Object) stackIn_10_1).d(stackIn_11_2), 68, param0.g((byte) 127), 10);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("pe.KC(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void b(int param0) {
        int var2;
        ResourceNode var3;
        int var4;
        int var5;
        Ship var6;
        int var7;
        int var8;
        int var2Lifetime1;
        var8 = VoidHunters.field_G;
        if (null == this.resNodes) {
          return;
        }
        for (var2 = 0; var2 < this.resNodes.length; var2++) {
          var3 = this.resNodes[var2];
          if (var3 != null) {
            var4 = -1;
            var5 = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (var5 < this.ships.length) {
                var6 = this.ships[var5];
                if (var6 != null) {
                  var7 = var6.getTeam((byte) 100);
                  if (var7 >= 0 &&
                    SetMissionTerrainAsteroidProbability.field_p > var7 &&
                    var3.a(var6.x, (byte) 84, var6.y)) {
                    if (var4 < 0) {
                      var4 = var7;
                    } else {
                      if (var7 != var4) {
                        var4 = -1;
                        decompiledFrameRemainder0 = false;
                      }
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  var5++;
                  continue;
                }
              }
              if (0 <= var4 &&
                var3.team != var4) {
                var3.field_h = var4;
                var3.captureTimer = var3.captureTimer + 1;
                if (Particle.field_G > var3.captureTimer) {
                  break;
                }
                var3.captureTimer = 0;
                var3.team = var4;
                break;
              }
              var3.captureTimer = var3.captureTimer - 2;
              if (var3.captureTimer >= 0) {
                break;
              }
              var3.captureTimer = 0;
              break;
            }
          }
        }
        var2Lifetime1 = 5 % ((18 - param0) / 39);
        return;
    }

    final void a(byte param0, ShipBody param1, ShipComponent param2, wfb param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        Ship var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -44) {
            this.swappedTeams = false;
          }
          var5_int = -1;
          var6 = -1;
          if (param1 instanceof Ship) {
            var7 = (Ship) (param1);
            var5_int = var7.getOwner((byte) -117);
            var6 = var7.getTeam((byte) 93);
          }
          this.a(1, param3.field_y, var6, var5_int, false, param2.finalx, param2.finaly);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("pe.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_0 = stackIn_9_0;
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_14_0 = stackIn_13_0;
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = stackIn_9_0;
            stackIn_14_2 = "{...}";
          }
          stackIn_17_0 = stackIn_14_0;
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_18_0 = stackIn_17_0;
            stackIn_18_2 = "null";
          } else {
            stackIn_18_0 = stackIn_14_0;
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void a(byte param0, GameSnapshot param1) {
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        rdb var5 = null;
        var4 = VoidHunters.field_G;
        try {
          if (param0 < 126) {
            this.field_h = false;
          }
          if (!this.debug) {
            var5 = (rdb) (this.spawnPoints.d(0));
            while (var5 != null) {
              var5.a(3128, this);
              var5 = (rdb) (this.spawnPoints.a((byte) 113));
            }
            this.b(99);
            if (this.missionControl == null) {
              return;
            }
            this.missionControl.a(-2374, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("pe.GF(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean d(int param0, byte param1) {
        boolean stackIn_7_0 = false;
        if (param1 != 21) {
          this.field_q = true;
        }
        stackIn_7_0 = (null != this.missionControl) && (!this.missionControl.a(param0, (byte) -85));
        return stackIn_7_0;
    }

    final MissionControl getMissionControl(int param0) {
        if (param0 != 0) {
          return (MissionControl) null;
        }
        return this.missionControl;
    }

    final int f(int param0) {
        if (param0 != 24797) {
          return -20;
        }
        return this.respawntimers.length;
    }

    final void e(int param0, int param1) {
        if (param1 != 0) {
          return;
        }
        this.field_r = param0;
    }

    private final boolean a(int param0, int param1, int param2, ShipBody[] param3, int param4) {
        ShipBody[] var6 = null;
        int var7 = 0;
        ShipBody var8 = null;
        int var12 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var12 = VoidHunters.field_G;
        try {
          var6 = param3;
          var7 = 0;
          if (param2 > -66) {
            this.a((IntrusiveDeque) null, true);
          }
          while (var7 < var6.length) {
            var8 = var6[var7];
            if (null != var8) {
              var9 = param0 - var8.d(false);
              var10 = param1 - var8.g((byte) 118);
              var11 = ar.a(var9, (byte) 121, var10);
              if (var11 < param4 + var8.g(-99)) {
                return true;
              }
            }
            var7++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_17_0 = var6_ref;
          stackIn_17_1 = new StringBuilder().append("pe.AD(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var10 = 0;
        int var8;
        int var9;
        int var11;
        Projectile var12;
        int var13;
        var13 = VoidHunters.field_G;
        if (param1 <= 0) {
          return;
        }
        if (param4) {
          this.d(89, 35);
        }
        var8 = 51;
        if (param0 == 1) {
          var8 = 55;
        }
        qba.a(20382, param5, var8, param6, 100);
        var9 = param1;
        for (var10 = 0; var9 > var10; var10++) {
          var11 = 8192 * var10 / var9;
          var12 = new Projectile(param5, param6, GetNumStars.a(var11, (byte) 114) * 1000 >> 16, 1000 * eu.a(var11, 93) >> 16, var11, 2 * param1, param2, param3, 5, pea.field_a);
          this.a(var12, false);
        }
    }

    final IntrusiveDeque getSpawnPoints(byte param0) {
        if (param0 != 24) {
          return (IntrusiveDeque) null;
        }
        return this.spawnPoints;
    }

    final MapZone e(byte param0, int param1) {
        if (param0 > -27) {
          this.mapZones = (MapZone[]) null;
        }
        if (null == this.mapZones) {
          return null;
        }
        if (param1 < 0) {
          return null;
        }
        if (this.mapZones.length > param1) {
          return this.mapZones[param1];
        }
        return null;
    }

    final int a(MapZone param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = VoidHunters.field_G;
        try {
          if (param1 <= 6) {
            stackIn_3_0 = 78;
            return stackIn_3_0;
          }
          if (null != this.mapZones) {
            for (var3_int = 0; var3_int < this.mapZones.length; var3_int++) {
              if (this.mapZones[var3_int] == param0) {
                stackIn_13_0 = var3_int;
                return stackIn_13_0;
              }
            }
          }
          stackIn_16_0 = -1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("pe.OC(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, ShipBody param1, lta param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 22 % ((-27 - param0) / 42);
          if (GetPointDefenceLaserProjectiles.a(8, 11284)) {
            var5 = param2.a(param1.d(false), (byte) 127);
            var6 = param2.b(true, param1.getBoundingbox((byte) -53)[2]) - pib.b((byte) 118) / 2;
            var7 = Integer.toString(param1.id);
            GetLagStandardDeviationOut.a(-1, var7, 16711935, var6, -(GetPhasedEnergyBeamProjectiles.a(-118, var7) >> 1) + var5, 4266);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("pe.ME(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_0 = stackIn_6_0;
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_11_0 = stackIn_10_0;
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = stackIn_6_0;
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void a(Player param0, Ship param1, byte param2, Ship param3, int param4, int param5, int param6, lta param7) {
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        String stackIn_81_2 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        String stackIn_85_2 = null;
        RuntimeException decompiledCaughtException = null;
        Debris var9 = null;
        RuntimeException var9_ref = null;
        int var10_int = 0;
        ShipComponent var10 = null;
        int var11 = 0;
        int var12_int = 0;
        Debris var12 = null;
        int var13 = 0;
        ShipComponent[] var13_ref_ml__ = null;
        int var14 = 0;
        ShipComponent[] var14_ref_ml__ = null;
        int var15 = 0;
        Hardpoint var15_ref_imb = null;
        int var16 = 0;
        int var17_int = 0;
        String var17 = null;
        int var18_int = 0;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        qua var25 = null;
        int var26 = 0;
        Debris var27 = null;
        Debris var28 = null;
        qua var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int var11Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        var24 = VoidHunters.field_G;
        try {
          if (param2 >= -126) {
            return;
          }
          if (param6 >= 0) {
            if (param3.d(4, 56)) {
              return;
            }
            if (0 == (param0.triggers & 128) &&
              null == param3.getTargetBlueprint((byte) 28)) {
              return;
            }
            var27 = this.i(21363, param3.getDragging(-96));
            var9 = var27;
            if (var27 == null) {
              return;
            }
            if (GetMomentOfInertiaPredivideDownshift.field_q == 1 &&
              null == param3.getTargetBlueprint((byte) 28)) {
              var10_int = param5;
              var11 = param4;
              if (param3 != param1) {
                var12_int = 131072;
                var13 = -param3.d(false) + var10_int;
                var14 = -param3.g((byte) -46) + var11;
                var15 = ar.a(var13, (byte) 111, var14);
                if (var15 > var12_int) {
                  var16 = ecb.a(var14, (byte) -77, var13);
                  var10_int = param3.d(false) + (var12_int >> 8) * (GetNumStars.a(var16, (byte) -115) >> 8);
                  var11 = param3.g((byte) 123) + (var12_int >> 8) * (eu.a(var16, 47) >> 8);
                }
              }
              var12 = new Debris();
              var27.b((byte) 60, var12);
              param3.a((int[]) null, -15);
              var28 = var12;
              var9 = var28;
              param3.a((qua) null, 3);
              this.a(param3, false, -126, var28, var11, var10_int);
            }
            var10 = var9.chassis;
            var11Lifetime1 = 1;
            var25 = param3.p((byte) 49);
            var29 = var25;
            if (var29 != null) {
              var13_ref_ml__ = var29.field_c;
              if (null != var13_ref_ml__ &&
                var13_ref_ml__.length > 0) {
                for (var14Lifetime1 = 0; var13_ref_ml__.length > var14Lifetime1; var14Lifetime1++) {
                  if (var11Lifetime1 != 0 &&
                    var25.field_e.field_b == var13_ref_ml__[var14Lifetime1] ||
                    var13_ref_ml__[var14Lifetime1].a(16, var29.field_e.field_b)) {
                    var11Lifetime1 = 0;
                  }
                }
              }
            }
            if (GetMomentOfInertiaPredivideDownshift.field_q == 1 &&
              param3.getTargetBlueprint((byte) 28) == null) {
              var13Lifetime1 = GetShowTutorial.a(29554, var9.chassis.componentTypeId);
              if (null != var29) {
                if (var11Lifetime1 == 0) {
                  var13Lifetime1 = 16711680;
                } else {
                  var13Lifetime1 = qpb.a(false, param3.getTeam((byte) 73), 13894143);
                }
              }
              var9.a(param7, var13Lifetime1, this, 16);
            }
            if (var29 != null) {
              var13Lifetime2 = GetUseSprites.field_o;
              GetUseSprites.field_o = 0;
              var14_ref_ml__ = var29.field_c;
              if (null != var14_ref_ml__ &&
                var14_ref_ml__.length > 0) {
                var15_ref_imb = var29.field_e.field_b.hardpoints[var25.field_e.field_e];
                var16Lifetime1 = 1024;
                var17_int = param7.a(-var16Lifetime1 + var15_ref_imb.worldx, (byte) 113);
                var18_int = param7.a(var16Lifetime1 + var15_ref_imb.worldx, (byte) 115);
                var19 = param7.b(true, -var16Lifetime1 + var15_ref_imb.worldy);
                var20 = param7.b(true, var16Lifetime1 + var15_ref_imb.worldy);
                c.a(var20, var18_int, var17_int, var19, -16777216, 16711680);
                c.a(var19, var18_int, var17_int, var20, -16777216, 16711680);
                for (var21 = 0; var21 < var14_ref_ml__.length; var21++) {
                  var14_ref_ml__[var21].a((byte) 26, param7, true, this, 16711680);
                }
              }
              GetUseSprites.field_o = var13Lifetime2;
            }
            var13Lifetime3 = var9.d(false) - var9.j(995401160);
            var14Lifetime2 = var9.g((byte) -16) - var9.i((byte) 5);
            var15Lifetime1 = var10.b(127) * GetNumStars.a(var9.e(0), (byte) 99) - var10.c((byte) 100) * eu.a(var9.e(0), 124) >> 16;
            var16Lifetime2 = var10.b(-25) * eu.a(var9.e(0), 62) + var10.c((byte) 100) * GetNumStars.a(var9.e(0), (byte) 64) >> 16;
            nn.a(param3.chassis.finaly, 1, var14Lifetime2 + var16Lifetime2, var13Lifetime3 + var15Lifetime1, param7, param3.chassis.finalx);
            var17 = me.a(var10, (byte) -84);
            GetLagStandardDeviationOut.a(-1, var17, 16777215, param7.b(true, -10000 + var9.g((byte) -109)), param7.a(var9.d(false), (byte) 118) - (GetPhasedEnergyBeamProjectiles.a(94, var17) >> 1), 4266);
            if (null != param3.A(56)) {
              var31 = param3.A(116);
              var30 = var31;
              var18 = var30;
              var26 = 0;
              var19Lifetime1 = var26;
              while (var26 < var31.length) {
                var20Lifetime1 = var31[var26];
                var21Lifetime1 = var18[var26 + 1];
                var22 = var18[(var26 + 2) % var31.length];
                var23 = var18[(3 + var26) % var31.length];
                c.a(param7.b(true, var23), param7.a(var22, (byte) 122), param7.a(var20Lifetime1, (byte) 121), param7.b(true, var21Lifetime1), -16777216, 65280);
                var26 += 2;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_72_0 = var9_ref;
          stackIn_72_1 = new StringBuilder().append("pe.RD(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_76_0 = stackIn_72_0;
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',');
          if (param1 == null) {
            stackIn_77_0 = stackIn_76_0;
            stackIn_77_2 = "null";
          } else {
            stackIn_77_0 = stackIn_72_0;
            stackIn_77_2 = "{...}";
          }
          stackIn_80_0 = stackIn_77_0;
          stackIn_80_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_81_0 = stackIn_80_0;
            stackIn_81_2 = "null";
          } else {
            stackIn_81_0 = stackIn_77_0;
            stackIn_81_2 = "{...}";
          }
          stackIn_84_0 = stackIn_81_0;
          stackIn_84_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_85_0 = stackIn_84_0;
            stackIn_85_2 = "null";
          } else {
            stackIn_85_0 = stackIn_81_0;
            stackIn_85_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_85_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_85_2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        int var6 = 0;
        Asteroid[] var5;
        Asteroid var7;
        int var11;
        Asteroid[] var12;
        int var8;
        int var9;
        int var10;
        var11 = VoidHunters.field_G;
        if (param1 != 4) {
          this.a((Asteroid[]) null, false, (IntrusiveDeque) null);
        }
        var12 = this.field_e.c(0);
        var5 = var12;
        for (var6 = 0; var6 < var12.length; var6++) {
          var7 = var12[var6];
          if (var7 != null) {
            var8 = param2 - var7.d(false);
            var9 = -var7.g((byte) 4) + param0;
            var10 = ar.a(var8, (byte) 115, var9);
            if (var7.chassis.i((byte) -112).field_l + param3 > var10) {
              this.a(-125, 2, var7);
            }
          }
        }
        if (this.a((byte) -99, true, param0, param2, param3)) {
          this.field_b.a(true, new rgb(param2, param0, param3));
        }
    }

    final boolean a(int param0, ShipBody param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = param1.x;
          var4 = param1.y;
          var5 = param1.g(param0 + 11886);
          if (this.a(var3_int, var4, -80, this.field_e.c(0), var5)) {
            return true;
          }
          if (this.a(var3_int, var4, param0 + 11833, this.ships, var5)) {
            return true;
          }
          if (param0 != -11924) {
            this.swappedTeams = false;
          }
          if (!this.a(var3_int, var4, -100, this.debris, var5)) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("pe.EC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void b(int param0, boolean param1) {
        boolean stackIn_3_1 = false;
        stackIn_3_1 = (param1);
        this.debug = stackIn_3_1;
        if (param0 >= -109) {
          this.field_u = (fba) null;
        }
    }

    private final void a(IntrusiveDeque param0, boolean param1) {
        int var3_int = 0;
        int var7 = 0;
        boolean discarded$0 = false;
        Object stackIn_8_0 = null;
        ShipComponent stackIn_8_1 = null;
        int stackIn_49_0 = 0;
        int stackIn_53_0 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        Ship var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        Ship var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Ship var9Lifetime1;
        Ship var9Lifetime2;
        var12 = VoidHunters.field_G;
        try {
          for (var3_int = 0; var3_int < this.ships.length; var3_int++) {
            var4 = this.ships[var3_int];
            var9 = var4;
            var9Lifetime1 = var4;
            if (var4 != null) {
              stackIn_8_0 = null;
              stackIn_8_1 = var4.chassis;
              if (stackIn_8_0 != stackIn_8_1 &&
                !var4.chassis.k((byte) 71)) {
                var5 = SetPointDefenceLaserProjectiles.field_o;
                if (var4.chassis.componentTypeId == 0) {
                  var5 = var5 >> 2;
                }
                var6 = this.field_u.a(var4.id, var4.boundingbox, 1, -90);
                for (var7 = 0; var6 > var7; var7++) {
                  var8 = -field_c[0] + ada.field_a[var7];
                  var9Lifetime2 = this.ships[var8];
                  if (null != var9Lifetime2 &&
                    var3_int > var8 &&
                    var9Lifetime2.chassis != null &&
                    !var9Lifetime2.chassis.k((byte) 94) && (var4.getTeam((byte) 82) != var9Lifetime2.getTeam((byte) 69) ||
                    !var4.g(false) &&
                    !var9Lifetime2.g(param1))) {
                    if (bra.field_d != 1) {
                      if (!var4.g(false)) {
                        stackIn_49_0 = (var9Lifetime2.g(param1)) ? 1 : 0;
                      } else {
                        stackIn_49_0 = 1;
                      }
                    } else {
                      stackIn_49_0 = 1;
                    }
                    var10 = stackIn_49_0;
                    stackIn_53_0 = (var9Lifetime2.getTeam((byte) 119) == var4.getTeam((byte) 79)) ? 0 : 1;
                    var11 = stackIn_53_0;
                    if (var10 != 0) {
                      if (var11 == 0) {
                        var10 = 0;
                      } else {
                        var4.c(var9Lifetime2.getOwner((byte) -117), 19581);
                        var9Lifetime2.c(var4.getOwner((byte) -117), 19581);
                      }
                    }
                    discarded$0 = this.a(var10 != 0, 0, var5, (byte) 57, var11 != 0, var9Lifetime2, 0, var4, param0);
                    if (var4.chassis == null) {
                      break;
                    }
                    if (var4.chassis.k((byte) 42)) {
                      break;
                    }
                  }
                }
              }
            }
          }
          if (param1) {
            this.field_u = (fba) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_75_0 = var3;
          stackIn_75_1 = new StringBuilder().append("pe.TE(");
          if (param0 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(boolean param0, int param1, MissionState param2) {
        int var6 = 0;
        int var8 = 0;
        MissionState stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        boolean stackIn_21_0 = false;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        MissionVariable[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        MissionVariable var7 = null;
        MissionVariable[] var9 = null;
        var8 = VoidHunters.field_G;
        try {
          if (!param0) {
            return true;
          }
          stackIn_7_0 = (MissionState) (param2);
          stackIn_8_1 = !(param0);
          var9 = ((MissionState) (Object) stackIn_7_0).getCustomVariables(stackIn_8_1);
          var4 = var9;
          var5 = 8;
          if (param1 == 1) {
            var5 = 9;
          }
          if (var4 != null) {
            if (var9.length <= 0) {
              return true;
            }
            for (var6 = 0; var9.length > var6; var6++) {
              var7 = var9[var6];
              if (var7 != null &&
                var5 == var7.label) {
                stackIn_21_0 = !(var7.value <= 0);
                return stackIn_21_0;
              }
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("pe.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final void a(IntrusiveDeque param0, byte param1) {
        int var4 = 0;
        int var8 = 0;
        int stackIn_15_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_51_1 = 0;
        int stackIn_51_3 = 0;
        Object stackIn_55_0;
        int stackIn_55_1;
        int stackIn_55_2;
        int stackIn_55_3;
        int stackIn_55_4;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int stackIn_56_3 = 0;
        boolean stackIn_56_5 = false;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        String stackIn_86_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        Debris var5_ref_nbb = null;
        Debris var6 = null;
        int var7 = 0;
        Debris var9 = null;
        int var11 = 0;
        Debris[] var12 = null;
        int var13 = 0;
        Debris[] var14 = null;
        Ship[] var15 = null;
        Ship var16 = null;
        Debris var17 = null;
        Object stackIn_55_0Lifetime1;
        Debris var9Lifetime1;
        Debris var9Lifetime2;
        int var5Lifetime1;
        var11 = VoidHunters.field_G;
        try {
          if (1 <= gl.field_d) {
            var14 = this.debris;
            for (var4 = 0; var14.length > var4; var4++) {
              var5_ref_nbb = var14[var4];
              var9 = var5_ref_nbb;
              var9Lifetime2 = var5_ref_nbb;
              if (var5_ref_nbb != null) {
                var5_ref_nbb.field_x = false;
              }
            }
            stackIn_15_0 = (GetTeamSelectionSpeedup.field_p != 1) ? 0 : 1;
            var3_int = stackIn_15_0;
            var15 = this.ships;
            for (var5 = 0; var15.length > var5; var5++) {
              var16 = var15[var5];
              if (null != var16 &&
                null != var16.chassis &&
                !var16.chassis.k((byte) 82)) {
                var7 = this.field_u.a(-1, var16.boundingbox, 2, 77);
                for (var8 = 0; var8 < var7; var8++) {
                  var9Lifetime1 = this.i(21363, ada.field_a[var8]);
                  if (var9Lifetime1 != null &&
                    null != var9Lifetime1.chassis &&
                    !var9Lifetime1.chassis.k((byte) 75) &&
                    var9Lifetime1.id != var16.getDragging(-123)) {
                    if (!var9Lifetime1.phantom &&
                      var3_int != 0) {
                      stackIn_47_1 = 1;
                    } else {
                      stackIn_47_1 = 0;
                    }
                    stackIn_50_1 = stackIn_47_1;
                    stackIn_50_2 = 1;
                    if (!var9Lifetime1.phantom) {
                      stackIn_51_1 = stackIn_50_1;
                      stackIn_51_3 = SetPointDefenceLaserProjectiles.field_o;
                    } else {
                      stackIn_51_1 = stackIn_47_1;
                      stackIn_51_3 = GetMissileLauncherEnergyUsed.field_p;
                    }
                    boolean decompiledFrameRemainder0 = true;
                    stackIn_55_0 = this;
                    stackIn_55_1 = stackIn_51_1;
                    stackIn_55_2 = stackIn_50_2;
                    stackIn_55_3 = stackIn_51_3;
                    stackIn_55_4 = 102;
                    if (!var9Lifetime1.phantom) {
                      stackIn_55_0Lifetime1 = this;
                      stackIn_55_1 = stackIn_51_1;
                      stackIn_55_2 = stackIn_50_2;
                      stackIn_55_3 = stackIn_51_3;
                      if (var3_int != 0) {
                        stackIn_56_1 = stackIn_51_1;
                        stackIn_56_2 = stackIn_50_2;
                        stackIn_56_3 = stackIn_51_3;
                        stackIn_56_5 = true;
                        decompiledFrameRemainder0 = false;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      stackIn_56_1 = stackIn_55_1;
                      stackIn_56_2 = stackIn_55_2;
                      stackIn_56_3 = stackIn_55_3;
                      stackIn_56_5 = false;
                    }
                    if (this.a(stackIn_56_1 != 0, stackIn_56_2, stackIn_56_3, (byte) stackIn_55_4, stackIn_56_5, var9Lifetime1, 0, var16, param0)) {
                      var9Lifetime1.field_x = true;
                      var9Lifetime1.d((byte) -80);
                    }
                    if (var16.chassis == null) {
                      break;
                    }
                    if (var16.chassis.k((byte) 47)) {
                      break;
                    }
                  }
                }
              }
            }
            var12 = this.debris;
            var13 = 0;
            var5Lifetime1 = var13;
            while (var12.length > var13) {
              var17 = var12[var13];
              var6 = var17;
              if (null != var6 &&
                var17.phantom &&
                !var17.field_x) {
                var6.phantom = false;
                var17.d((byte) 51);
              }
              var13++;
            }
          }
          if (param1 <= 7) {
            this.d((byte) -101, 66);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_85_0 = var3;
          stackIn_85_1 = new StringBuilder().append("pe.OD(");
          if (param0 == null) {
            stackIn_86_2 = "null";
          } else {
            stackIn_86_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_85_0), ((StringBuilder) (Object) stackIn_85_1).append(stackIn_86_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = VoidHunters.field_G;
        this.respawntimers = new int[param1];
        for (var3 = param0; this.respawntimers.length > var3; var3++) {
          this.respawntimers[var3] = Particle.field_C;
        }
    }

    final void a(byte param0, GrapplingHook param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param1.a(this, true, param0, false);
          this.a(param0 + 29584, param1, this.grapplingHooks, 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("pe.RB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var9 = 0;
        int var7;
        int var8;
        Asteroid var10;
        int var13;
        Asteroid[] var14;
        int var11;
        int var12;
        var13 = VoidHunters.field_G;
        var14 = this.field_e.c(0);
        var7 = param1 + param3 / 2;
        var8 = param0 + param2 / 2;
        for (var9 = 0; var14.length > var9; var9++) {
          var10 = var14[var9];
          if (null != var10) {
            var11 = var7 - var10.d(false);
            var12 = -var10.g((byte) -22) + var8;
            if (Math.abs(var11) < param3 / 2 &&
              param2 / 2 > Math.abs(var12)) {
              this.a(-97, 2, var10);
            }
          }
        }
        if (param4 > -61) {
          return;
        }
        if (this.a(var7, var8, param2, true, 121, param3)) {
          this.field_b.a(true, new ptb(param1, param0, param3, param2));
        }
    }

    private final void a(ShipBody param0, gda param1, int param2, int param3, ShipBody param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = param1.field_e;
          var7 = param1.field_l;
          var8 = param1.field_h.finaloutline[(param1.field_j << 1) % param1.field_h.finaloutline.length];
          if (param2 >= -81) {
            this.field_r = -1;
          }
          var9 = param1.field_h.finaloutline[(1 + (param1.field_j << 1)) % param1.field_h.finaloutline.length];
          var10 = param1.field_h.finaloutline[(2 + (param1.field_j << 1)) % param1.field_h.finaloutline.length];
          var11 = param1.field_h.finaloutline[((param1.field_j << 1) + 3) % param1.field_h.finaloutline.length];
          var12 = param1.field_m.finaloutline[(param1.field_f << 1) % param1.field_m.finaloutline.length];
          var13 = param1.field_m.finaloutline[((param1.field_f << 1) + 1) % param1.field_m.finaloutline.length];
          var14 = param1.field_m.finaloutline[(2 + (param1.field_f << 1)) % param1.field_m.finaloutline.length];
          var15 = param1.field_m.finaloutline[(3 + (param1.field_f << 1)) % param1.field_m.finaloutline.length];
          var16 = -var9 + var11;
          var17 = var8 - var10;
          var18 = var15 - var13;
          var19 = -var14 + var12;
          var18 = -var18;
          var19 = -var19;
          var20 = param3 * (var16 + var18) >> 8;
          var21 = param3 * (var19 + var17) >> 8;
          param0.a(var21, var6_int, var7, (byte) -123, var20);
          param4.a(-var21, var6_int, var7, (byte) -121, -var20);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("pe.BE(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_0 = stackIn_7_0;
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_12_0 = stackIn_11_0;
            stackIn_12_2 = "null";
          } else {
            stackIn_12_0 = stackIn_7_0;
            stackIn_12_2 = "{...}";
          }
          stackIn_15_0 = stackIn_12_0;
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_0 = stackIn_15_0;
            stackIn_16_2 = "null";
          } else {
            stackIn_16_0 = stackIn_12_0;
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final Debris a(int param0, Debris param1, Ship param2, byte param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Debris var8 = null;
        Debris stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 124) {
            this.field_y = 57;
          }
          if (null == param1) {
            var6_int = param2.d(false);
            var7 = param2.g((byte) 3);
            var8 = this.a(true, var7, param4, var6_int, param0);
            param1 = var8;
            if (null != param1) {
              param2.a(param1.id, (byte) -114);
            }
          }
          stackIn_6_0 = (Debris) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("pe.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_0 = stackIn_10_0;
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_15_0 = stackIn_14_0;
            stackIn_15_2 = "null";
          } else {
            stackIn_15_0 = stackIn_10_0;
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(byte param0, Asteroid param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          param1.b(-(this.field_r >> 1), param0 + 2147483521, this.field_r >> 1, -(this.width >> 1), this.width >> 1);
          if (param0 != 126) {
            this.field_y = 54;
          }
          param1.a(this, true, (byte) 67, false);
          if (this.field_e.a(this, 16520, param1)) {
            this.b(3, (byte) 126, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("pe.OB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public World() {
        int var1 = 0;
        this.field_s = new Particle[768];
        for (var1 = 0; this.field_s.length > var1; var1++) {
          this.field_s[var1] = new Particle();
        }
    }

    World(int param0) {
        int var2 = 0;
        this.field_u = new fba();
        this.field_s = new Particle[768];
        for (var2 = 0; var2 < this.field_s.length; var2++) {
          this.field_s[var2] = new Particle();
        }
        this.projectiles = new IntrusiveDeque();
        this.spawnPoints = new IntrusiveDeque();
        this.ships = new Ship[field_w[0]];
        this.debris = new Debris[field_w[1]];
        this.field_e = new AsteroidField(field_w[2]);
        this.grapplingHooks = new GrapplingHook[field_w[3]];
        this.a(0, param0);
        this.width = 1 << fob.field_c;
        this.field_r = 1 << fob.field_c;
        this.field_p = new NebulaField();
    }

    static {
        field_d = "Add action (Award victory)";
        field_w = new int[]{255, 1023, 1023, 255};
        field_c = new int[]{0, field_w[0], field_w[1] + field_w[0], field_w[1] + field_w[0] + field_w[2]};
    }
}
