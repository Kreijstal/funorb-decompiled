/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetPhysicsCollisionForceMultiplier extends ConsoleCommand {
    static String field_o;

    SetPhysicsCollisionForceMultiplier(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, int param1, int param2) {
        String var4 = null;
        int var3 = SetThrusterParticleSpeedDownshift.field_o != null ? 1 : 0;
        String var4Lifetime1;
        String var4Lifetime2;
        String var4Lifetime1Lifetime1;
        if (SetBombletSprayProjectileDamage.field_o != 9) {
          if (SetBombletSprayProjectileDamage.field_o == 10) {
            if (var3 != 0) {
              return false;
            }
            or.a(0);
            return true;
          }
          if (SetBombletSprayProjectileDamage.field_o == 11) {
            if (!SetThrusterBindingBalanceThreshold.field_o) {
              if (param1 == 2) {
                return false;
              }
              return false;
            }
            if (2 != gi.field_a) {
              if (gi.field_a != 2) {
                if (var3 != 0) {
                  return false;
                }
                if (!AdjustVariableAction.b(param1 + 5)) {
                  return true;
                }
                var4 = (String) null;
                SetBurstFireReload.a((String) null, -25719, GetWaitForPlayers.field_p, param2, gi.field_a, cwa.field_b);
                return true;
              }
              if (!AdjustVariableAction.b(param1 + 5)) {
                return true;
              }
              var4 = (String) null;
              SetBurstFireReload.a((String) null, -25719, GetWaitForPlayers.field_p, param2, gi.field_a, cwa.field_b);
              return true;
            }
            if (ira.a(hb.field_b, cwa.field_b, 41)) {
              if (gi.field_a != 2) {
                if (var3 == 0) {
                  if (AdjustVariableAction.b(param1 + 5)) {
                    var4Lifetime2 = (String) null;
                    SetBurstFireReload.a((String) null, -25719, GetWaitForPlayers.field_p, param2, gi.field_a, cwa.field_b);
                    return true;
                  }
                  return true;
                }
                return false;
              }
              if (AdjustVariableAction.b(param1 + 5)) {
                var4Lifetime2 = (String) null;
                SetBurstFireReload.a((String) null, -25719, GetWaitForPlayers.field_p, param2, gi.field_a, cwa.field_b);
                return true;
              }
              return true;
            }
            return false;
          }
          if (param1 != 2) {
            return false;
          }
          return false;
        }
        if (!jeb.a(abb.field_a, GetSniperCannonAimspeed.field_p, SetPhasedEnergyBeamPulseFadetime.field_p, rea.field_d, (byte) -93)) {
          if (SetBombletSprayProjectileDamage.field_o == 10) {
            if (var3 != 0) {
              return false;
            }
            or.a(0);
            return true;
          }
          if (SetBombletSprayProjectileDamage.field_o == 11) {
            if (!SetThrusterBindingBalanceThreshold.field_o) {
              if (param1 != 2) {
                return false;
              }
              return false;
            }
            if (2 != gi.field_a) {
              if (gi.field_a != 2) {
                if (var3 == 0) {
                  if (AdjustVariableAction.b(param1 + 5)) {
                    var4Lifetime1 = (String) null;
                    SetBurstFireReload.a((String) null, -25719, GetWaitForPlayers.field_p, param2, gi.field_a, cwa.field_b);
                    return true;
                  }
                  return true;
                }
                return false;
              }
              if (AdjustVariableAction.b(param1 + 5)) {
                var4Lifetime1 = (String) null;
                SetBurstFireReload.a((String) null, -25719, GetWaitForPlayers.field_p, param2, gi.field_a, cwa.field_b);
                return true;
              }
              return true;
            }
            if (ira.a(hb.field_b, cwa.field_b, 41)) {
              if (gi.field_a != 2) {
                if (var3 == 0) {
                  if (AdjustVariableAction.b(param1 + 5)) {
                    var4Lifetime1Lifetime1 = (String) null;
                    SetBurstFireReload.a((String) null, -25719, GetWaitForPlayers.field_p, param2, gi.field_a, cwa.field_b);
                    return true;
                  }
                  return true;
                }
                return false;
              }
              if (AdjustVariableAction.b(param1 + 5)) {
                var4Lifetime1Lifetime1 = (String) null;
                SetBurstFireReload.a((String) null, -25719, GetWaitForPlayers.field_p, param2, gi.field_a, cwa.field_b);
                return true;
              }
              return true;
            }
            return false;
          }
          if (param1 != 2) {
            return false;
          }
          return false;
        }
        if (abb.field_a != 2 &&
          var3 != 0) {
          return false;
        }
        return fia.a(GetSniperCannonAimspeed.field_p, abb.field_a, (byte) 123, SetPhasedEnergyBeamPulseFadetime.field_p, rea.field_d);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        phb[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            var4 = (phb[]) null;
            SetPhysicsCollisionForceMultiplier.a((phb[]) null, 64, 92, -41, -29, false);
          }
          SetMachineGunEnergyUsed.a(50, 62, arguments[0].a(48));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("qt.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 <= 119) {
          field_o = (String) null;
        }
    }

    final static void a(phb[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          if (param0 != null &&
            param3 > 0) {
            var6_int = param0[0].field_m;
            var7 = param0[2].field_m;
            var8 = param0[1].field_m;
            param0[0].e(param4, param2, param1);
            param0[2].e(param3 + param4 - var7, param2, param1);
            dma.a(ola.field_o);
            dma.g(var6_int + param4, param2, param3 + (param4 - var7), param2 + param0[1].field_n);
            if (!param5) {
              SetPhysicsCollisionForceMultiplier.a(27, -59, -55);
            }
            var9 = var6_int + param4;
            var10 = -var7 + (param4 + param3);
            for (param4 = var9; param4 < var10; param4 = param4 + var8) {
              param0[1].e(param4, param2, param1);
            }
            dma.b(ola.field_o);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("qt.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_o = "Grappling hook";
    }
}
