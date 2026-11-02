/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetMutatorVotes extends ConsoleCommand {
    static int field_p;
    static String field_o;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var2Lifetime1;
        if (param1 == 255) {
          var2 = param0 - 50;
          return Math.min(255 * var2 / 50, 255);
        }
        GetMutatorVotes.a(75, 111);
        var2Lifetime1 = param0 - 50;
        return Math.min(255 * var2Lifetime1 / 50, 255);
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
            stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(58, 90));
            return stackIn_4_0;
          }
          stackIn_2_0 = (ConsoleValue) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hlb.A(");
          if (arguments == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        if (param3 > 44) {
          SetLaserRandomness.a(nna.field_w, -57, param1, param2, qs.field_c, param0, jk.field_Cb);
          return;
        }
        field_o = (String) null;
        SetLaserRandomness.a(nna.field_w, -57, param1, param2, qs.field_c, param0, jk.field_Cb);
    }

    GetMutatorVotes(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_o = null;
        if (param0 < 66) {
          GetMutatorVotes.e((byte) 9);
        }
    }

    static {
        field_o = "Left wing";
        field_p = 256;
    }
}
