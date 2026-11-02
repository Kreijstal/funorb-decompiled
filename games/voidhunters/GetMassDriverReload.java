/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetMassDriverReload extends ConsoleCommand {
    static asb field_o;

    public static void b(boolean param0) {
        if (!param0) {
          field_o = (asb) null;
          field_o = null;
          return;
        }
        field_o = null;
    }

    final static void a(String param0, int param1) {
        if (param1 > -12) {
          return;
        }
        try {
          pja.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "kwa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
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
            this.execute((ConsoleValue[]) null, 62);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(108, 83));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("kwa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetMassDriverReload(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
