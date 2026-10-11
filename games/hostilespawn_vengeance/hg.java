/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static int field_e;
    static int field_f;
    static String field_c;
    static bd field_a;
    static String field_d;
    static String[] field_b;

    final static void a(byte[] param0, int param1, int param2, int param3, vi param4, java.math.BigInteger param5, java.math.BigInteger param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          var7_int = ja.a(7, param2);
          if (hi.field_k == null) {
            hi.field_k = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; 4 > var9; var9++) {
            var8[var9] = hi.field_k.nextInt();
          }
          if (bb.field_f == null ||
            !(bb.field_f.field_n.length >= var7_int)) {
            bb.field_f = new vi(var7_int);
          }
          bb.field_f.field_i = 0;
          bb.field_f.a(param2, param0, true, param3);
          bb.field_f.g(var7_int, -122);
          bb.field_f.a(var13, (byte) 108);
          if (tb.field_M == null ||
            !(tb.field_M.field_n.length >= 100)) {
            tb.field_M = new vi(100);
          }
          tb.field_M.field_i = 0;
          tb.field_M.d(95, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          if (param1 >= -98) {
            return;
          }
          while (4 > var11) {
            tb.field_M.b(var13[var11], 25251);
            var11++;
          }
          tb.field_M.a((byte) -119, param2);
          tb.field_M.a(param5, 0, param6);
          param4.a(tb.field_M.field_i, tb.field_M.field_n, true, 0);
          param4.a(bb.field_f.field_i, bb.field_f.field_n, true, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("hg.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param6 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 == 0) {
          field_d = null;
          field_b = null;
          return;
        }
        field_a = (bd) null;
        field_d = null;
        field_b = null;
    }

    final static void a(byte param0, p param1) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        oj var13 = null;
        try {
          if (dl.field_l) {
            return;
          }
          if (param0 != 64) {
            hg.a(-79);
          }
          var13 = mm.field_m[0];
          var3 = jj.a(param1, 1, var13);
          if (var3 > 16.0) {
            return;
          }
          var5 = nh.a(-12149, param1, var13);
          var7 = 16.0;
          if (var13.field_t != 0) {
            var9 = (double)var13.field_t * Math.cos(3.141592653589793 * var13.field_K / 128.0);
            var11 = (double)var13.field_t * Math.sin(3.141592653589793 * var13.field_K / 128.0);
            var9 = var9 + var7 * Math.cos(var5 * 3.141592653589793 / 128.0);
            var11 = var11 + Math.sin(3.141592653589793 * var5 / 128.0) * var7;
            var5 = 128.0 * Math.atan2(var11, var9) / 3.141592653589793;
            var7 = Math.sqrt(var11 * var11 + var9 * var9);
          }
          var13.field_K = var5;
          var13.field_t = Math.min(16, (int)var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("hg.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_e = 0;
        field_c = "This password contains your email address, and would be easy to guess";
        field_d = "Back";
        field_b = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
