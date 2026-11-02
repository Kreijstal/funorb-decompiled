/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GetFogOfWarSensorRange extends ConsoleCommand {
    static Random field_o;
    static String[] field_p;

    public static void e(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 > -47) {
          GetFogOfWarSensorRange.e((byte) -14);
        }
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, 77);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(47, 111));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vg.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetFogOfWarSensorRange(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
