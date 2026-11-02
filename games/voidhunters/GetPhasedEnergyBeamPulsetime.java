/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetPhasedEnergyBeamPulsetime extends ConsoleCommand {
    static int field_o;
    static java.awt.Font field_p;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            GetPhasedEnergyBeamPulsetime.e((byte) 108);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(186, 74));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fda.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_p = null;
        if (param0 != 51) {
          field_p = (java.awt.Font) null;
        }
    }

    final static boolean e(byte param0) {
        if (param0 < 83) {
          return false;
        }
        return cgb.field_a;
    }

    GetPhasedEnergyBeamPulsetime(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
