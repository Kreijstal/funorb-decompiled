/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetShipAimLines extends ConsoleCommand {
    static int field_o;
    static int field_p;

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
            this.execute((ConsoleValue[]) null, 10);
          }
          stackIn_3_0 = new ConsoleValue(sn.field_Y);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gaa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        if (param1 == 11343) {
          lfa.a((byte) 34, param3);
          GraphicsToolkit.a(param3, param0, param2, 5);
          return;
        }
        GetShipAimLines.a(72, 8, 14, true);
        lfa.a((byte) 34, param3);
        GraphicsToolkit.a(param3, param0, param2, 5);
    }

    GetShipAimLines(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = 10;
    }
}
