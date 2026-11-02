/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetCountermeasureLauncherAimarc extends ConsoleCommand {
    static phb[] field_p;
    static gdb field_r;
    static String field_o;
    static String field_q;
    static String field_s;

    SetCountermeasureLauncherAimarc(String param0, Class[] param1, String param2) {
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
          SetMachineGunEnergyUsed.a(142, 62, arguments[0].a(46));
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vsa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 <= -30) {
          field_s = null;
          field_p = null;
          field_o = null;
          field_q = null;
          field_r = null;
          return;
        }
        field_q = (String) null;
        field_s = null;
        field_p = null;
        field_o = null;
        field_q = null;
        field_r = null;
    }

    static {
        field_o = "Click here or press <%0> to save your ship";
        field_s = "Close";
    }
}
