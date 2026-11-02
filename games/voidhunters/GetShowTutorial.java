/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetShowTutorial extends ConsoleCommand {
    static volatile boolean field_o;

    final static int a(int param0, int param1) {
        if (param0 != 29554) {
          return -94;
        }
        if (!btb.field_a) {
          return 16742263 + 2243266 * param1;
        }
        return hab.field_g[param1].a(14951);
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
          if (obfuscationGuard >= -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, 111);
          }
          stackIn_3_0 = new ConsoleValue(SetUseExtraBackground.field_p);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("aob.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetShowTutorial(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = true;
    }
}
