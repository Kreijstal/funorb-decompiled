/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends lk {
    static pb field_k;
    static String field_m;
    static String field_o;
    private ae field_n;
    private ae field_l;
    static String field_p;

    final cg a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        cg stackIn_3_0 = null;
        cg stackIn_6_0 = null;
        cg stackIn_10_0 = null;
        cg stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_l.field_m.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_3_0 = qj.field_c;
            return stackIn_3_0;
          }
          if (param0 <= 10) {
            stackIn_6_0 = (cg) null;
            return stackIn_6_0;
          }
          if (!rd.a(true, var4, var3)) {
            stackIn_10_0 = qj.field_c;
            return stackIn_10_0;
          }
          if (!this.a(-1, param1)) {
            return lg.field_c;
          }
          stackIn_14_0 = qj.field_c;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("lc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -53 / ((6 - param1) / 62);
          stackIn_1_0 = sk.a(false, 0, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("lc.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            this.field_n = (ae) null;
          }
          var3 = this.field_n.field_m.toLowerCase();
          var4 = param1.toLowerCase();
          if (0 < var3.length()) {
            if (var4.length() <= 0) {
              return false;
            }
            var5 = var3.lastIndexOf("@");
            if (0 <= var5 &&
              var5 < -1 + var3.length()) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(var5 + 1);
              if (0 <= var4.indexOf(var6)) {
                return true;
              }
              stackIn_14_0 = (var4.indexOf(var7) >= 0);
              return stackIn_14_0;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("lc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    lc(ae param0, ae param1, ae param2) {
        super(param0);
        try {
          this.field_n = param2;
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static li[] e(byte param0) {
        if (param0 == 33) {
          return new li[]{ua.field_a, de.field_d, il.field_u, g.field_z, g.field_A, ok.field_c, bb.field_m, va.field_b, kf.field_a, ef.field_n, ui.field_C, s.field_f, be.field_c, tf.field_b};
        }
        return (li[]) null;
    }

    final static int a(int param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (!param1) {
          param0 = param0 & 8191;
          if (param0 < 4096) {
            if (2048 <= param0) {
              stackIn_19_0 = -fh.field_h[-2048 + param0];
            } else {
              stackIn_19_0 = fh.field_h[-param0 + 2048];
            }
            return stackIn_19_0;
          }
          if (6144 > param0) {
            stackIn_15_0 = -fh.field_h[6144 - param0];
          } else {
            stackIn_15_0 = fh.field_h[param0 - 6144];
          }
          return stackIn_15_0;
        }
        field_k = (pb) null;
        param0 = param0 & 8191;
        if (param0 < 4096) {
          if (2048 <= param0) {
            stackIn_9_0 = -fh.field_h[-2048 + param0];
          } else {
            stackIn_9_0 = fh.field_h[-param0 + 2048];
          }
          return stackIn_9_0;
        }
        if (6144 > param0) {
          stackIn_5_0 = -fh.field_h[6144 - param0];
        } else {
          stackIn_5_0 = fh.field_h[param0 - 6144];
        }
        return stackIn_5_0;
    }

    final String b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 23 / ((param0 - 20) / 40);
          var4 = this.field_l.field_m.toLowerCase();
          var5 = param1.toLowerCase();
          if (var5.length() == 0) {
            return null;
          }
          var6 = var5;
          if (rd.a(var6, -121)) {
            stackIn_5_0 = wi.field_b;
            return stackIn_5_0;
          }
          if (lg.a(-124, var6)) {
            stackIn_9_0 = pk.field_f;
            return stackIn_9_0;
          }
          if (fl.a(var6, (byte) 19)) {
            stackIn_13_0 = pe.field_b;
            return stackIn_13_0;
          }
          if (this.a(-1, param1)) {
            stackIn_17_0 = el.field_H;
            return stackIn_17_0;
          }
          if (0 >= var4.length()) {
            stackIn_20_0 = k.field_e;
            return stackIn_20_0;
          }
          if (rb.a(var6, -85, var4)) {
            stackIn_23_0 = vf.field_D;
            return stackIn_23_0;
          }
          if (ji.a(var6, 95, var4)) {
            stackIn_27_0 = ge.field_l;
            return stackIn_27_0;
          }
          if (!mb.a(var6, (byte) 118, var4)) {
            stackIn_32_0 = wi.field_b;
            return stackIn_32_0;
          }
          stackIn_30_0 = vf.field_D;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("lc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_k = null;
        field_p = null;
        if (param0 == 3988) {
          field_m = null;
          field_o = null;
          return;
        }
        lc.f(16);
        field_m = null;
        field_o = null;
    }

    static {
        field_m = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_o = "This entry doesn't match";
    }
}
