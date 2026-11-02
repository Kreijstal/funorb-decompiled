/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetShieldsDirectionalArc extends ConsoleCommand {
    static llb field_o;
    static String field_q;
    static asb field_r;
    static int field_p;

    public static void a(int param0) {
        field_q = null;
        if (param0 != -29044) {
          GetShieldsDirectionalArc.a(17);
          field_o = null;
          field_r = null;
          return;
        }
        field_o = null;
        field_r = null;
    }

    GetShieldsDirectionalArc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_2_0 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= -119) {
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(212, 79));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jta.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_q = "This password contains your Player Name, and would be easy to guess";
    }
}
