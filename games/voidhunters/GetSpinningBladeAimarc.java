/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetSpinningBladeAimarc extends ConsoleCommand {
    static IntrusiveDeque field_q;
    static boolean field_o;
    static int field_r;
    static String field_p;

    public static void e(byte param0) {
        field_p = null;
        if (param0 < 55) {
          return;
        }
        field_q = null;
    }

    GetSpinningBladeAimarc(String param0, Class[] param1, String param2) {
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
            GetSpinningBladeAimarc.e((byte) 15);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(134, 122));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mlb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_r = 65;
        field_p = "Your request to join has been declined.";
    }
}
