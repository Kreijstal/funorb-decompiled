/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetBombletSprayProjectiles extends ConsoleCommand {
    static String field_s;
    static int field_p;
    static int[] field_q;
    static int[] field_r;
    static String field_o;

    GetBombletSprayProjectiles(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        if (param0) {
          field_q = null;
          field_r = null;
          field_s = null;
          field_o = null;
          return;
        }
        GetBombletSprayProjectiles.b(true);
        field_q = null;
        field_r = null;
        field_s = null;
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
          if (obfuscationGuard >= -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, -55);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(83, 123));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jmb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_p = 37;
        field_s = "Log in";
        field_r = new int[]{2, 21, 4, 3, 23, 11};
        field_o = "Loading music";
    }
}
