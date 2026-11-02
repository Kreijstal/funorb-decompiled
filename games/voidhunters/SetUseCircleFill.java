/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetUseCircleFill extends ConsoleCommand {
    static llb field_o;

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        field_o = null;
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
          lfa.field_j = arguments[0].a(false);
          if (obfuscationGuard > -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, 113);
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jfb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    SetUseCircleFill(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
