/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi {
    static ph field_a;
    static hr field_d;
    static String field_g;
    static int field_e;
    static ki field_c;
    static String field_b;
    static String field_f;

    public static void a(int param0) {
        field_g = null;
        field_b = null;
        field_c = null;
        field_a = null;
        field_f = null;
        if (param0 == 20437) {
          field_d = null;
          return;
        }
        pi.a(-26);
        field_d = null;
    }

    final static void a(byte param0) {
        rd.a(4, -66);
        if (param0 > -86) {
          field_e = -49;
        }
    }

    final static vl a(fs param0, boolean param1, int param2) {
        int var8 = 0;
        vl stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        jn var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        nm var13 = null;
        int var14 = 0;
        var14 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!param1) {
            param0.field_p = 0;
          }
          var3_int = param0.e(-31302);
          var4 = 0;
          if (1 < var3_int) {
            var4 = param0.e(-31302);
          }
          var5 = new jn();
          if (param2 <= 50) {
            pi.a(116);
          }
          var6 = param0.e(-31302);
          var7 = 1;
          for (var8 = 0; var6 > var8; var8++) {
            var9 = param0.e(-31302);
            var10 = param0.c(true);
            var11 = param0.c(true);
            param0.c(true);
            param0.c(true);
            var12 = 0;
            if (var3_int > 2) {
              var12 = param0.c(true);
            }
            var13 = cq.a(var12, var10 >> 8, var11 >> 8, var9, (byte) -113);
            if (var9 == 2) {
              var13.field_s = var7;
              var7++;
            }
            var5.a((ms) (var13), (byte) 39);
          }
          stackIn_17_0 = new vl(var5, var4);
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("pi.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_a = new ph(16);
        field_g = "Password: ";
        field_e = 0;
        field_f = "Your email address is used to identify this account";
    }
}
