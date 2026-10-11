/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class e extends cb {
    private ui field_j;
    private ui field_k;
    static String[][][] field_i;

    final static byte[] a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 87 / ((param0 + 43) / 60);
          stackIn_1_0 = hb.field_e.a(param1, 0, "");
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("e.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.field_j.field_s.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var5 = var4;
          if (ek.a(-78, var5)) {
            stackIn_6_0 = q.field_a;
            return stackIn_6_0;
          }
          if (bi.a(0, var5)) {
            stackIn_9_0 = bk.field_b;
            return stackIn_9_0;
          }
          if (nj.a(var5, (byte) 126)) {
            stackIn_12_0 = ra.field_d;
            return stackIn_12_0;
          }
          var6 = -127 % ((param0 - 49) / 56);
          if (this.b(0, param1)) {
            stackIn_16_0 = sj.field_e;
            return stackIn_16_0;
          }
          if (0 >= var7.length()) {
            stackIn_19_0 = gj.field_c;
            return stackIn_19_0;
          }
          if (im.a(var5, 0, var7)) {
            stackIn_22_0 = tc.field_r;
            return stackIn_22_0;
          }
          if (a.a((byte) 121, var5, var7)) {
            stackIn_26_0 = rb.field_f;
            return stackIn_26_0;
          }
          if (!lm.a(var7, var5, 14965)) {
            return q.field_a;
          }
          stackIn_30_0 = tc.field_r;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("e.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static String a(long param0, int param1) {
        int var9 = 0;
        fg.field_h.setTime(new Date(param0));
        int var3 = fg.field_h.get(7);
        int var4 = fg.field_h.get(5);
        int var5 = fg.field_h.get(2);
        int var6 = fg.field_h.get(1);
        int var7 = fg.field_h.get(11);
        int var8 = fg.field_h.get(12);
        if (param1 <= -123) {
          var9 = fg.field_h.get(13);
          return w.field_P[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + uf.field_w[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        return (String) null;
    }

    e(ui param0, ui param1, ui param2) {
        super(param0);
        try {
          this.field_k = param2;
          this.field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final ag a(String param0, int param1) {
        boolean discarded$1 = false;
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String var5 = null;
        ag stackIn_2_0 = null;
        ag stackIn_5_0 = null;
        ag stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_j.field_s.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = fg.field_d;
            return stackIn_2_0;
          }
          if (!td.a(var3, (byte) -76, var4)) {
            stackIn_5_0 = fg.field_d;
            return stackIn_5_0;
          }
          if (param1 != 5) {
            var5 = (String) null;
            discarded$1 = this.b(3, (String) null);
          }
          if (!this.b(0, param0)) {
            return sc.field_a;
          }
          stackIn_11_0 = fg.field_d;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("e.D(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_k = (ui) null;
          }
          var3 = this.field_k.field_s.toLowerCase();
          var4 = param1.toLowerCase();
          if (var3.length() > 0) {
            if (var4.length() <= 0) {
              return false;
            }
            var5 = var3.lastIndexOf("@");
            if (0 <= var5 &&
              var3.length() - 1 > var5) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(1 + var5);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (0 <= var4.indexOf(var7)) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("e.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void f(int param0) {
        if (param0 != -1) {
          field_i = (String[][][]) null;
          field_i = (String[][][]) null;
          return;
        }
        field_i = (String[][][]) null;
    }

    static {
    }
}
