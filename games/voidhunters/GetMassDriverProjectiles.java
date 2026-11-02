/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetMassDriverProjectiles extends ConsoleCommand {
    static ri field_p;
    static String field_o;
    static int field_q;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        byte[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            var4 = (byte[]) null;
            GetMassDriverProjectiles.a((byte) -22, false, (byte[]) null, -98, -44, -111);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(81, 89));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("eaa.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    GetMassDriverProjectiles(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(byte param0, boolean param1, byte[] param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        faa var6 = RequestNewestBlackboxRecording.field_p;
        var6.h(24335, param5);
        if (param0 < 86) {
          return;
        }
        try {
          var6.position = var6.position + 1;
          var7 = var6.position;
          var6.c(0, 4);
          var6.c(0, param4);
          var8 = param3;
          if (param1) {
            var8 += 128;
          }
          var6.c(0, var8);
          var6.a(0, param2, -1, param2.length);
          var6.e(var6.position - var7, -129);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "eaa.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_p = null;
        int var1 = -70 / ((param0 - 80) / 37);
        field_o = null;
    }

    static {
        field_o = "<%0> has lost connection.";
        field_p = new ri(9, 0, 4, 1);
        field_q = 1;
    }
}
