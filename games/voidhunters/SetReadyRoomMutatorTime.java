/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetReadyRoomMutatorTime extends ConsoleCommand {
    static int[] field_o;

    final static void e(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = VoidHunters.field_G;
        try {
          if (!wgb.field_g) {
            return;
          }
          mmb.field_d = new aja[SetPointDefenceLaserAimarc.field_r.length];
          var1_int = 0;
          if (param0 > -8) {
            field_o = (int[]) null;
          }
          while (mmb.field_d.length > var1_int) {
            if (null != SetPointDefenceLaserAimarc.field_r[var1_int]) {
              mmb.field_d[var1_int] = GetDebrisGroupColour.field_r.a(SetPointDefenceLaserAimarc.field_r[var1_int], false);
            }
            var1_int++;
          }
          mmb.field_d[30] = GetBombletSprayPushMultiplier.a((byte) -62, GetDebrisGroupColour.field_r, oaa.field_j);
          GetDebrisThrowable.a(false, "Finished building sprites");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1), "ah.D(" + param0 + ')');
        }
    }

    SetReadyRoomMutatorTime(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 == 233) {
          return;
        }
        field_o = (int[]) null;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          SetMachineGunEnergyUsed.a(233, 62, arguments[0].a(15));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ah.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        var3 = VoidHunters.field_G;
        if (0 >= GetDebrisCarryOver.field_o) {
          if (GetPhasedEnergyBeamPulsetime.e((byte) 120)) {
            var2 = 0;
          } else {
            var2 = 1;
          }
        } else {
          if (null == efb.field_b) {
            psb.field_b = ob.a(0, SetTorpedoProjectiles.field_o, 640, 480, 0, 0);
            if (psb.field_b != null) {
              var2 = 2;
              SetGrapplingHookCooldown.a((byte) 77, psb.field_b);
            } else {
              var2 = 3;
            }
          } else {
            psb.field_b = efb.field_b.a((byte) 124);
            mb.h(2, 117);
            if (psb.field_b != null) {
              var2 = 2;
              SetGrapplingHookCooldown.a((byte) 77, psb.field_b);
            } else {
              var2 = 3;
            }
          }
        }
        if (param0 != 2) {
          return;
        }
        if (null != efb.field_b) {
          return;
        }
        if (SetOndamageParticleSpeed.field_p) {
          wha.a(2, param1, var2);
        }
    }

    static {
        field_o = new int[4];
    }
}
