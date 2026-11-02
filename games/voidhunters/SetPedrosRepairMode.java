/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetPedrosRepairMode extends ConsoleCommand {
    static phb[] field_q;
    static int field_p;
    static int field_o;

    public static void e(byte param0) {
        if (param0 != 53) {
          field_o = -42;
          field_q = null;
          return;
        }
        field_q = null;
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.a(31, 62, arguments[0].a(65));
          if (obfuscationGuard > -119) {
            field_o = -106;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oqa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetPedrosRepairMode(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = 64;
        field_o = 0;
    }
}
