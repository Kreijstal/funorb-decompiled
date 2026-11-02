/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SetMissilesDamageSourceTeam extends ConsoleCommand {
    static String field_q;
    static String field_p;
    static Calendar field_o;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            stackIn_2_0 = (ConsoleValue) null;
            return stackIn_2_0;
          }
          SetMachineGunEnergyUsed.a(14, 62, arguments[0].a(121));
          stackIn_4_0 = new ConsoleValue("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("lib.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetMissilesDamageSourceTeam(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_p = null;
        field_o = null;
        field_q = null;
    }

    static {
        field_q = "Classic";
        field_p = "Skip current mission phase";
        field_o = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
