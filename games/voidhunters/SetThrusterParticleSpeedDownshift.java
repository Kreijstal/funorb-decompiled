/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetThrusterParticleSpeedDownshift extends ConsoleCommand {
    static mm field_o;

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
          SetMachineGunEnergyUsed.a(176, 62, arguments[0].a(124));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ohb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 != 84) {
          field_o = (mm) null;
          field_o = null;
          return;
        }
        field_o = null;
    }

    SetThrusterParticleSpeedDownshift(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static nl a(int param0, int param1, int param2) {
        Object var3;
        nl var3_ref;
        int var4;
        nl var3_refLifetime1;
        var3 = null;
        var4 = VoidHunters.field_G;
        if (param1 <= -17) {
          var3_ref = (nl) (gtb.field_d.d(0));
          while (var3_ref != null) {
            if (param0 == var3_ref.field_k &&
              param2 == var3_ref.field_l) {
              return var3_ref;
            }
            var3_ref = (nl) (gtb.field_d.a((byte) 59));
          }
          return null;
        }
        SetThrusterParticleSpeedDownshift.e((byte) -51);
        var3_refLifetime1 = (nl) (gtb.field_d.d(0));
        while (var3_refLifetime1 != null) {
          if (param0 == var3_refLifetime1.field_k &&
            param2 == var3_refLifetime1.field_l) {
            return var3_refLifetime1;
          }
          var3_refLifetime1 = (nl) (gtb.field_d.a((byte) 59));
        }
        return null;
    }

    static {
    }
}
