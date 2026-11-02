/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SetMassDriverAimarc extends ConsoleCommand {
    static int field_o;
    static String field_p;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            SetMassDriverAimarc.a((byte) 59, 88L);
          }
          SetMachineGunEnergyUsed.a(130, 62, arguments[0].a(73));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("tnb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static String a(byte param0, long param1) {
        SetMissilesDamageSourceTeam.field_o.setTime(new Date(param1));
        int var3 = SetMissilesDamageSourceTeam.field_o.get(7);
        int var5 = -29 / ((-38 - param0) / 39);
        int var4 = SetMissilesDamageSourceTeam.field_o.get(5);
        int var6 = SetMissilesDamageSourceTeam.field_o.get(2);
        int var7 = SetMissilesDamageSourceTeam.field_o.get(1);
        int var8 = SetMissilesDamageSourceTeam.field_o.get(11);
        int var9 = SetMissilesDamageSourceTeam.field_o.get(12);
        int var10 = SetMissilesDamageSourceTeam.field_o.get(13);
        return waa.field_D[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + GetPhasedEnergyBeamReload.field_o[var6] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    public static void e(byte param0) {
        field_p = null;
        int var1 = 32 / ((param0 - 67) / 55);
    }

    final static boolean a(int param0, int param1) {
        if (param0 != 130) {
          return true;
        }
        return hab.field_g[param1].field_f;
    }

    SetMassDriverAimarc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = "Tips";
        field_o = 67;
    }
}
