/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetDebrisCollision extends ConsoleCommand {
    static String field_o;

    final static void a(java.awt.Component param0, byte param1) {
        try {
          param0.removeKeyListener(GetMomentOfInertiaPerpointCalcDownshift.field_q);
          int var2_int = -92 % ((param1 - 64) / 56);
          param0.removeFocusListener(GetMomentOfInertiaPerpointCalcDownshift.field_q);
          SetSniperCannonAimarc.field_p = -1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rib.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    SetDebrisCollision(String param0, Class[] param1, String param2) {
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
            field_o = (String) null;
          }
          SetMachineGunEnergyUsed.a(8, 62, arguments[0].a(50));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rib.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 >= -126) {
          field_o = (String) null;
        }
    }

    static {
        field_o = "Accept invitation to <%0>'s game";
    }
}
