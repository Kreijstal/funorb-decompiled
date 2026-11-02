/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetMissileLauncherAimspeed extends ConsoleCommand {
    static dqb field_o;
    static int[] field_p;

    public static void a(int param0) {
        if (param0 != 127) {
          GetMissileLauncherAimspeed.a(14);
          field_o = null;
          field_p = null;
          return;
        }
        field_o = null;
        field_p = null;
    }

    GetMissileLauncherAimspeed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
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
          if (obfuscationGuard > -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, 124);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(127, 120));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eob.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
    }
}
