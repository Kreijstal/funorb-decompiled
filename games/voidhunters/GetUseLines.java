/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetUseLines extends ConsoleCommand {
    private static long[] field_o;
    static soa field_p;

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            field_o = (long[]) null;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserAimarc.field_p);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vea.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        if (param0 != 0) {
          field_o = (long[]) null;
        }
    }

    GetUseLines(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_o = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if (1L != (var0 & 1L)) {
              var0 = var0 >>> 1;
            } else {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            }
          }
          field_o[var2] = var0;
        }
    }
}
