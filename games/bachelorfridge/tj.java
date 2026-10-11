/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static du field_d;
    static int[] field_e;
    static int[] field_f;
    static int[][] field_b;
    static String field_a;
    static byte[] field_c;

    final static kv[] a(kv[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        kv var3_ref_kv = null;
        int var3 = 0;
        int var4 = 0;
        kv[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            var3_ref_kv = param0[var2_int];
            param0[var2_int].field_u = 0;
            var3_ref_kv.field_t = 0;
            param0[var2_int].field_n = param0[var2_int].field_q;
            param0[var2_int].field_o = param0[var2_int].field_p;
          }
          var3 = -22 % ((59 - param1) / 44);
          stackIn_5_0 = (kv[]) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("tj.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static rk[] a(byte param0, lu param1) {
        int var3 = 0;
        rk[] var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        lu var5 = null;
        rk[] var6 = null;
        rk[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          var6 = new rk[50];
          var2 = var6;
          for (var3 = 0; var3 < 50; var3++) {
            var6[var3] = gka.a(param1, 255);
          }
          if (param0 != 124) {
            var5 = (lu) null;
            tj.a((byte) -37, (lu) null);
          }
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("tj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 > -99) {
          return;
        }
        field_d = null;
        field_b = (int[][]) null;
        field_e = null;
        field_f = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_e = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_d = new du(8, 0, 4, 1);
        field_c = new byte[]{(byte) 1, (byte) 0, (byte)3, (byte) 0, (byte) 1};
        field_a = "Continue";
    }
}
