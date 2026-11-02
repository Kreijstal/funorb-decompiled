/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetMissileLauncherRandomness extends ConsoleCommand {
    static gj field_o;
    static int field_p;
    static String field_q;

    GetMissileLauncherRandomness(String param0, Class[] param1, String param2) {
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
          if (obfuscationGuard >= -119) {
            field_q = (String) null;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(78, 84));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rta.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 32) {
          GetMissileLauncherRandomness.a(-20);
          field_q = null;
          field_o = null;
          return;
        }
        field_q = null;
        field_o = null;
    }

    final static ClientException a(Throwable param0, String param1) {
        ClientException var2 = null;
        if (param0 instanceof ClientException) {
          var2 = (ClientException) ((Object) param0);
          var2.field_a = var2.field_a + ' ' + param1;
        } else {
          var2 = new ClientException(param0, param1);
        }
        return var2;
    }

    final static boolean e(int param0) {
        if (param0 == -3840) {
          return SetShipTeamAction.field_b == dw.field_c ? true : false;
        }
        field_o = (gj) null;
        return SetShipTeamAction.field_b == dw.field_c ? true : false;
    }

    static {
        field_p = 0;
        field_o = new gj();
        field_q = "Year";
    }
}
