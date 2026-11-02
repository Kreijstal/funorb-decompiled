/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SetLaserAimarc extends ConsoleCommand {
    static int[] field_p;
    static int field_o;

    final static void a(int param0) {
        File var1_ref = null;
        if (null == wqb.field_e) {
          return;
        }
        Object var1 = null;
        try {
          var1_ref = lfb.a(ata.field_L, (byte) 34);
        } catch (Exception exception) {
        }
        if (param0 > -95) {
          return;
        }
        if (var1_ref != null) {
          fkb.a(67, wqb.field_e, var1_ref);
          return;
        }
    }

    SetLaserAimarc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
          SetMachineGunEnergyUsed.a(132, 62, arguments[0].a(12));
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qra.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 != -80) {
          field_p = (int[]) null;
          field_p = null;
          return;
        }
        field_p = null;
    }

    static {
        field_p = new int[1];
        field_o = 50;
    }
}
