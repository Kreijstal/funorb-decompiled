/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hq extends li {
    int[] field_n;
    static int field_r;
    static String field_q;
    int field_p;
    boolean field_o;

    final static boolean a(int param0, int param1, int param2, r param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 124) {
            hq.a(true);
          }
          var5 = param3.a(param1, param2, (byte) -119);
          var4 = var5;
          if (var5 == null) {
            return false;
          }
          lc.a(59, var5);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("hq.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_q = null;
        if (param0) {
          field_r = 80;
        }
    }

    final static void b(int param0, int param1) {
        int var4 = 0;
        int var2 = (qg.field_G - 640) / 2;
        int var3 = ld.field_b * ld.field_b;
        int var4Lifetime1;
        if (param1 < -126) {
          var4 = var3 - param0 * param0;
          hk.field_o.a(94, 199, -124 + (bi.field_j - 90), 90, var2 - var4 * 199 / var3);
          lb.field_c.a(118, 438, bi.field_j - 124, 0, var4 * 438 / var3 + (202 + var2));
          return;
        }
        hq.a(false);
        var4Lifetime1 = var3 - param0 * param0;
        hk.field_o.a(94, 199, -124 + (bi.field_j - 90), 90, var2 - var4Lifetime1 * 199 / var3);
        lb.field_c.a(118, 438, bi.field_j - 124, 0, var4Lifetime1 * 438 / var3 + (202 + var2));
    }

    hq() {
        this.field_o = false;
    }

    final static er[] a(er[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        er var3 = null;
        int var4 = 0;
        r var5 = null;
        er[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 != 202) {
            var5 = (r) null;
            hq.a(33, -77, -100, (r) null);
          }
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            var3 = param0[var2_int];
            param0[var2_int].field_z = 0;
            var3.field_C = 0;
            param0[var2_int].field_x = param0[var2_int].field_y;
            param0[var2_int].field_B = param0[var2_int].field_t;
          }
          stackIn_7_0 = (er[]) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("hq.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_q = "<%0> has entered another game.";
    }
}
