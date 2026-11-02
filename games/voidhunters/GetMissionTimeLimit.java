/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetMissionTimeLimit extends ConsoleCommand {
    static int field_o;
    static Object field_p;
    static String field_q;

    GetMissionTimeLimit(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(59, 121));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("pra.A(");
          if (arguments == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        try {
          if (param0 ||
            null == SetSpinningBladeSpindamageMultiplier.field_o) {
            GetTorpedoProjectileDamage.field_o = false;
          }
          if (param0) {
            if (lia.field_b > 0) {
              lia.field_b = lia.field_b - 1;
            } else {
              if (nf.field_a <= 0) {
                if (SetExplosionPushMultiplier.field_p > 0) {
                  SetExplosionPushMultiplier.field_p = SetExplosionPushMultiplier.field_p - 1;
                }
              } else {
                nf.field_a = nf.field_a - 1;
              }
            }
          } else {
            if (SetSpinningBladeSpindamageMultiplier.field_o != null) {
              if (0 >= lia.field_b) {
                if (nf.field_a <= 0) {
                  if (GetRepairModePower.field_o > SetExplosionPushMultiplier.field_p) {
                    if (SetExplosionPushMultiplier.field_p == 0) {
                      ai.a(false, 0);
                    }
                    SetExplosionPushMultiplier.field_p = SetExplosionPushMultiplier.field_p + 1;
                  }
                } else {
                  nf.field_a = nf.field_a - 1;
                }
              } else {
                lia.field_b = lia.field_b - 1;
              }
            } else {
              if (null != SetThrusterParticleSpeedDownshift.field_o) {
                if (0 < lia.field_b) {
                  lia.field_b = lia.field_b - 1;
                } else {
                  if (0 < SetExplosionPushMultiplier.field_p) {
                    SetExplosionPushMultiplier.field_p = SetExplosionPushMultiplier.field_p - 1;
                  } else {
                    if (nf.field_a < GetRepairModePower.field_o) {
                      if (nf.field_a == 0) {
                        ai.a(true, 0);
                      }
                      nf.field_a = nf.field_a + 1;
                    }
                  }
                }
              } else {
                GetTorpedoProjectileDamage.field_o = false;
                if (0 < nf.field_a) {
                  nf.field_a = nf.field_a - 1;
                } else {
                  if (SetExplosionPushMultiplier.field_p <= 0) {
                    if (lia.field_b < GetRepairModePower.field_o) {
                      if (lia.field_b == 0) {
                        fma.l(8611);
                      }
                      lia.field_b = lia.field_b + 1;
                    }
                  } else {
                    SetExplosionPushMultiplier.field_p = SetExplosionPushMultiplier.field_p - 1;
                  }
                }
              }
            }
          }
          if (param1) {
            return;
          }
          GetMissionTimeLimit.a(true, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var2), "pra.C(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        try {
          if (param0 >= -71) {
            field_p = (Object) null;
          }
          field_q = null;
          field_p = null;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pra.B(" + param0 + ')');
        }
    }

    static {
        field_q = "Ship blueprint recorded";
    }
}
