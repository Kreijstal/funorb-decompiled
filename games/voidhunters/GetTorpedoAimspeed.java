/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetTorpedoAimspeed extends ConsoleCommand {
    static osa field_o;
    static String field_p;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            GetTorpedoAimspeed.e((byte) 25);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(118, 116));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hgb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void e(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 < 14) {
          field_p = (String) null;
        }
    }

    GetTorpedoAimspeed(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_o = new osa(0, 0);
        field_p = "Rated game";
    }
}
