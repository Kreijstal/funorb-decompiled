/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetGrapplingHookRopeBreakLength extends ConsoleCommand {
    static ConsoleCommandRegistry field_o;
    static String[] field_p;
    static String field_q;

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        field_q = null;
        if (param0 != 204) {
          field_o = (ConsoleCommandRegistry) null;
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
          if (obfuscationGuard > -119) {
            field_q = (String) null;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(204, 121));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("to.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void e(byte param0) {
        if (param0 >= -14) {
          return;
        }
        GetMissionVariablesHudX.field_o.b(new rla(), 90);
    }

    GetGrapplingHookRopeBreakLength(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_q = "Downloading at <%0>%";
        field_p = new String[100];
        field_o = new ConsoleCommandRegistry();
    }
}
