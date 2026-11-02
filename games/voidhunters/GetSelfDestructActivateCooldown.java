/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class GetSelfDestructActivateCooldown extends ConsoleCommand {
    final static String a(int param0, int param1) {
        if (param0 == 0) {
          return uf.field_F;
        }
        if (param0 == 1) {
          return GetBombletSprayProjectileLife.field_r;
        }
        if (param1 <= 88) {
          return (String) null;
        }
        if (param0 == 2) {
          return null;
        }
        if (param0 == 3) {
          return whb.field_d;
        }
        if (param0 == 4) {
          return SetTorpedoProjectileDamage.field_o;
        }
        if (param0 == 5) {
          return null;
        }
        if (6 != param0) {
          return "Unknown component type";
        }
        return null;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        File var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            var4 = (File) null;
            GetSelfDestructActivateCooldown.a((byte) -64, (String) null, (File) null);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(224, 118));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("td.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetSelfDestructActivateCooldown(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(byte param0, String param1, File param2) {
        try {
          jma.field_q.put(param1, param2);
          int var3_int = 97 / ((63 - param0) / 59);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "td.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
