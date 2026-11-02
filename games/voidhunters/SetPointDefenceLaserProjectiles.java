/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SetPointDefenceLaserProjectiles extends ConsoleCommand {
    static java.util.zip.CRC32 field_p;
    static int field_o;
    static String field_q;

    public static void a(int param0) {
        field_p = null;
        field_q = null;
        if (param0 != 88) {
          field_q = (String) null;
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(88, 62, arguments[0].a(102));
          if (obfuscationGuard >= -119) {
            field_o = -58;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gkb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetPointDefenceLaserProjectiles(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = 4096;
        field_p = new java.util.zip.CRC32();
        field_q = "Similar rating";
    }
}
