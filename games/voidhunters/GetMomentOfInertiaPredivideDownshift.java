/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetMomentOfInertiaPredivideDownshift extends ConsoleCommand {
    static int field_q;
    static int field_r;
    static int field_p;
    static String field_o;

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
            this.execute((ConsoleValue[]) null, -73);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(181, 75));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ktb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(byte param0) {
        int var1 = -57 % ((param0 + 17) / 55);
        field_o = null;
    }

    GetMomentOfInertiaPredivideDownshift(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_q = 1;
        field_r = 53;
        field_o = "Build an awesome ship and test it out";
    }
}
