/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class GetGrapplingHooksDamageableBySourcePlayer extends ConsoleCommand {
    static aja field_p;
    static boolean field_o;

    final static int a(int param0) {
        int var1 = 17 / ((param0 + 41) / 54);
        ho.field_a.a(0);
        if (!GetAutozoomAmountMultiply.field_o.e(0)) {
          return vq.g(-6269);
        }
        return 0;
    }

    GetGrapplingHooksDamageableBySourcePlayer(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            field_o = false;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(15, 75));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ll.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_p = null;
        if (param0 == 1) {
          return;
        }
        field_o = false;
    }

    final static void e(byte param0) {
        File var1_ref = null;
        Object var1 = null;
        if (param0 != -120) {
          field_p = (aja) null;
        }
        try {
          var1_ref = lfb.a(ata.field_L, (byte) 34);
        } catch (Exception exception) {
        }
        if (var1_ref == null) {
          return;
        }
        Object var2 = asa.a(var1_ref, (byte) -48);
        if (var2 instanceof Hashtable) {
          wqb.field_e = (Hashtable) (var2);
          return;
        }
    }

    final static int a(boolean param0, byte param1) {
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_82_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var3Lifetime1;
        var5 = VoidHunters.field_G;
        try {
          SetSpecialOrderBoxWidth.field_o = SetSpecialOrderBoxWidth.field_o + 65536;
          while (GetMissilesCooldown.a(SetMachineGunEnergyUsed.field_r, SetSpecialOrderBoxWidth.field_o, (byte) 74) >= 65536) {
            SetSpecialOrderBoxWidth.field_o = SetSpecialOrderBoxWidth.field_o - SetMachineGunEnergyUsed.field_r;
          }
          var2_int = -1;
          if (SetSpinningBladeSpindamageMultiplier.field_p != null) {
            var2_int = SetSpinningBladeSpindamageMultiplier.field_p.length;
          } else {
            if (AwardVictoryToWinnerAction.field_a != null) {
              var2_int = AwardVictoryToWinnerAction.field_a.length;
            }
          }
          if (var2_int != -1) {
            boolean decompiledFrameRemainder0 = true;
            if (SetMachineGunEnergyUsed.field_s > SetBots.field_q) {
              SetBots.field_q = SetBots.field_q + 1;
              if (SetMachineGunEnergyUsed.field_p < SetBots.field_q && (null == SetSpinningBladeSpindamageMultiplier.field_p ||
                null == SetSpinningBladeSpindamageMultiplier.field_p[pa.field_b])) {
                SetBots.field_q = SetBots.field_q - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (SetBots.field_q >= SetMachineGunEnergyUsed.field_s &&
                  SetSpinningBladeSpindamageMultiplier.field_p[(pa.field_b + 1) % var2_int] == null) {
                  SetBots.field_q = SetBots.field_q - 1;
                }
              }
            }
            if (SetBots.field_q >= SetMachineGunEnergyUsed.field_s) {
              SetBots.field_q = SetBots.field_q - SetMachineGunEnergyUsed.field_s;
              if (!SetPhysicsCollisionGrapplingHookForceMultiplier.field_q) {
                pa.field_b = pa.field_b - 1;
                if (pa.field_b < 0) {
                  pa.field_b = pa.field_b + var2_int;
                }
              } else {
                pa.field_b = pa.field_b + 1;
                if (var2_int <= pa.field_b) {
                  pa.field_b = pa.field_b - var2_int;
                }
              }
            }
            if (SetBots.field_q > SetMachineGunEnergyUsed.field_p) {
              SetPhysicsCollisionGrapplingHookForceMultiplier.field_q = true;
            }
          }
          if (SettingsChange.field_e != null) {
            var3 = 357 - SettingsChange.field_e.field_n / 2;
            var4 = 0;
            if (SetDebrisPartitioned.field_o != 0 &&
              var3 < qs.field_a &&
              qs.field_a < var3 + SettingsChange.field_e.field_p) {
              if (269 - SettingsChange.field_e.field_q < Particle.field_H &&
                269 > Particle.field_H) {
                SetBots.field_q = SetMachineGunEnergyUsed.field_s;
                SetPhysicsCollisionGrapplingHookForceMultiplier.field_q = false;
                var4 = 1;
              }
              if (Particle.field_H > 586 &&
                Particle.field_H < 586 + SettingsChange.field_e.field_q) {
                SetBots.field_q = SetMachineGunEnergyUsed.field_s;
                var4 = 1;
                SetPhysicsCollisionGrapplingHookForceMultiplier.field_q = true;
              }
            }
            if (var4 == 0 &&
              SetBots.field_q > SetMachineGunEnergyUsed.field_p &&
              var3 < uia.field_b &&
              SettingsChange.field_e.field_p + var3 > uia.field_b) {
              if (269 - SettingsChange.field_e.field_q < kc.field_b &&
                kc.field_b < 269) {
                SetBots.field_q = SetMachineGunEnergyUsed.field_p;
              }
              if (586 < kc.field_b &&
                kc.field_b < SettingsChange.field_e.field_q + 586) {
                SetBots.field_q = SetMachineGunEnergyUsed.field_p;
              }
            }
          }
          var3Lifetime1 = 13 % ((param1 + 42) / 37);
          if (!param0) {
            return 0;
          }
          nna.field_z.a(GetGrapplingHookAimspeed.a(-1, qs.field_a, Particle.field_H), 5620, GetGrapplingHookAimspeed.a(-1, uia.field_b, kc.field_b));
          if (nna.field_z.e((byte) -120)) {
            if (nna.field_z.field_j == 0) {
              stackIn_61_0 = 3;
              return stackIn_61_0;
            }
            if (nna.field_z.field_j == 1) {
              stackIn_65_0 = 2;
              return stackIn_65_0;
            }
          }
          stackIn_68_0 = 127;
          while (true) {
            if (!ata.e(stackIn_68_0)) {
              stackIn_82_0 = 0;
              return stackIn_82_0;
            }
            nna.field_z.a(false, 0);
            if (nna.field_z.e((byte) -127)) {
              if (0 == nna.field_z.field_j) {
                stackIn_74_0 = 3;
                return stackIn_74_0;
              }
              if (nna.field_z.field_j == 1) {
                stackIn_77_0 = 1;
                return stackIn_77_0;
              }
            }
            if (SetBombletSprayProjectileDamage.field_o != 13) {
              stackIn_68_0 = 127;
              continue;
            }
            break;
          }
          stackIn_80_0 = 1;
          return stackIn_80_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var2), "ll.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_o = true;
    }
}
