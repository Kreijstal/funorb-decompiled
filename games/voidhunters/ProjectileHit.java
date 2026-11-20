/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProjectileHit {
    private int impactX;
    static llb field_d;
    private Projectile projectile;
    private ShipComponent component;
    private int impactY;

    final void clear(byte param0) {
        int var2 = 51 / ((64 - param0) / 50);
        this.component = null;
        this.projectile = null;
    }

    final boolean hasHit(byte param0) {
        int var2 = 113 % ((56 - param0) / 32);
        return null != this.component ? true : false;
    }

    final void set(int param0, ShipComponent param1, Projectile param2, byte param3, int param4) {
        try {
          this.impactX = param4;
          this.impactY = param0;
          this.component = param1;
          if (param3 != 61) {
            ShipBody var7 = (ShipBody) null;
            this.resolve((World) null, -17, (ShipBody) null, false);
          }
          this.projectile = param2;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "sfa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void clearSharedReferences(boolean param0) {
        if (param0) {
          field_d = (llb) null;
        }
        field_d = null;
    }

    public ProjectileHit() {
        this.clear((byte) 118);
    }

    final void resolve(World param0, int param1, ShipBody param2, boolean param3) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6_int = 0;
        ShipComponentDefinition var6 = null;
        int var7 = 0;
        int var8 = 0;
        ShipComponentDefinition var9 = null;
        int var10 = 0;
        int var6_intLifetime1;
        int var8Lifetime1;
        var10 = VoidHunters.field_G;
        try {
          if (this.projectile.getType((byte) -104) != 1) {
            stackIn_7_0 = (3 != this.projectile.getType((byte) -104)) ? 1 : 0;
          } else {
            stackIn_7_0 = 0;
          }
          var5_int = stackIn_7_0;
          if (this.projectile.getType((byte) -104) == 3) {
            this.projectile.a(this.impactY, this.impactX, 127);
          }
          if (2 == this.projectile.getType((byte) -104) && (!(param2 instanceof Ship) ||
            ((Ship) (param2)).getOwner((byte) -117) != this.projectile.b(false) ||
            ((Ship) (param2)).getTeam((byte) 115) != this.projectile.getFiredTeam(param1 + 513))) {
            var6_int = SetBombletSprayFireForce.field_o;
            param2.addForceAtPoint(this.projectile.dy * var6_int, this.impactX, this.impactY, (byte) -119, var6_int * this.projectile.dx);
          }
          if (this.projectile.getType((byte) -104) == 5) {
            var6_intLifetime1 = GetWorldWidthUpshift.field_q;
            param2.addForceAtPoint(this.projectile.dy * var6_intLifetime1, this.impactX, this.impactY, (byte) -116, this.projectile.dx * var6_intLifetime1);
          }
          if (this.projectile.getType((byte) -104) == 6) {
            if (param3 ||
              SetPointDefenceLaserPulsetime.field_o == 1) {
              param0.a(0, gib.field_a, this.projectile.getFiredTeam(512), this.projectile.b(false), false, this.impactX, this.impactY);
            }
            param3 = false;
          }
          if (param3) {
            var6 = this.component.getDefinition((byte) -112);
            if (this.projectile.getType((byte) -104) != 3) {
              if (this.projectile.getType((byte) -104) == 1) {
                GetGrapplingHookAimarc.a(this.impactY, param2.getId(false), 40, 106, this.impactX);
              } else {
                if (!var6.field_r) {
                  if (var6.field_B == 0) {
                    qba.a(20382, this.impactX, 60, this.impactY, 1);
                  } else {
                    qba.a(20382, this.impactX, 56, this.impactY, 1);
                  }
                } else {
                  qba.a(20382, this.impactX, 77, this.impactY, 1);
                }
              }
            } else {
              GetGrapplingHookAimarc.a(this.impactY, param2.getId(false), 70, -48, this.impactX);
            }
            var7 = 5;
            var8 = this.projectile.getType((byte) -104);
            if (var8 != 1) {
              if (var8 == 0) {
                var7 = ehb.field_e;
              } else {
                if (var8 != 2) {
                  if (var8 != 3) {
                    if (var8 != 4) {
                      if (5 == var8) {
                        var7 = GetLaserEnergyUsed.field_r;
                      }
                    } else {
                      var7 = GetShipAimLines.field_p;
                    }
                  } else {
                    var7 = pea.field_b;
                  }
                } else {
                  var7 = NetworkArchiveRequest.field_o;
                }
              }
            } else {
              var7 = mc.field_u;
            }
            var8Lifetime1 = this.component.applyScaledDamage(this.projectile.getDamage((byte) 68), (byte) 40);
            if (var8Lifetime1 > 0) {
              var5_int = 0;
              this.projectile.b(var8Lifetime1, 110);
            }
            param0.a(sva.field_m, this.impactY, this.impactX, ei.field_a, 11184895, var7, dw.field_b);
            var9 = var6;
            if (this.component.isDestroyed((byte) 99) &&
              var9.field_y > 0) {
              param2.chassis.detachComponent(true, this.component, param0, 60, param2);
              param2.chassis.configureThrusterBindings((byte) 102, param2);
              param0.a(1, var9.field_y, this.projectile.getFiredTeam(param1 ^ -513), this.projectile.b(false), false, this.component.getFinalx(true), this.component.getFinaly((byte) 74));
            } else {
              if (GetInnateThrusters.field_p == 1 &&
                this.component.isDestroyed((byte) 71) &&
                this.component != param2.chassis) {
                this.component.adjustHealth(true, false, var9.maxHealth);
                param2.chassis.detachComponent(true, this.component, param0, param1 ^ -39, param2);
                param2.chassis.configureThrusterBindings((byte) 97, param2);
              }
            }
          }
          if (var5_int != 0) {
            this.projectile.unlink(-3846);
          }
          if (param1 != -1) {
            this.projectile = (Projectile) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_72_0 = var5;
          stackIn_72_1 = new StringBuilder().append("sfa.B(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
