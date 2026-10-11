/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lj implements Iterator {
    private mc field_d;
    private mc field_f;
    private ea field_e;
    static int[] field_a;
    static ah field_c;
    private int field_g;
    static int[] field_b;

    final static id a(int param0, bc param1) {
        int var7 = 0;
        id stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        id var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = TetraLink.field_J;
        try {
          var2_int = param1.e(8, (byte) -112);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = bc.a(91, param1) ? 1 : 0;
          var4 = bc.a(77, param1) ? 1 : 0;
          var5 = new id();
          var5.field_q = (short)param1.e(16, (byte) -112);
          var5.field_D = cc.a(var5.field_D, param1, 16, 0);
          var5.field_i = cc.a(var5.field_i, param1, 16, param0 ^ param0);
          var5.field_R = cc.a(var5.field_R, param1, 16, param0 ^ -16483);
          var5.field_s = (short)param1.e(16, (byte) -112);
          var5.field_K = cc.a(var5.field_K, param1, 16, 0);
          var5.field_I = cc.a(var5.field_I, param1, 16, param0 ^ -16483);
          var5.field_e = cc.a(var5.field_e, param1, 16, 0);
          if (var3 != 0) {
            var5.field_O = (short)param1.e(16, (byte) -112);
            var5.field_l = cc.a(var5.field_l, param1, 16, 0);
            var5.field_d = cc.a(var5.field_d, param1, 16, 0);
            var5.field_y = cc.a(var5.field_y, param1, 16, 0);
            var5.field_t = cc.a(var5.field_t, param1, 16, param0 + 16483);
            var5.field_b = cc.a(var5.field_b, param1, 16, 0);
            var5.field_N = cc.a(var5.field_N, param1, 16, param0 + 16483);
          }
          if (var4 != 0) {
            param1.e(16, (byte) -112);
            var5.field_k = cc.a(var5.field_k, param1, 16, param0 ^ -16483);
            var5.field_p = cc.a(var5.field_p, param1, 16, 0);
            var5.field_A = cc.a(var5.field_A, param1, 16, 0);
            var5.field_o = cc.a(var5.field_o, param1, 16, 0);
            var5.field_g = cc.a(var5.field_g, param1, 16, 0);
          }
          if (bc.a(126, param1)) {
            var5.field_v = cc.a(var5.field_v, param1, 16, 0);
          }
          if (bc.a(64, param1)) {
            var5.field_u = fi.a(16, var5.field_u, param1, (byte) 119);
            var6 = 0;
            for (var7 = 0; var7 < var5.field_u.length; var7++) {
              if ((var5.field_u[var7] & 255) > var6) {
                var6 = 255 & var5.field_u[var7];
              }
            }
            if (0 != var6) {
              var5.field_Q = (byte)(1 + var6);
            } else {
              var5.field_u = null;
            }
          }
          stackIn_25_0 = var5;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("lj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        mc var1;
        int var2;
        var2 = TetraLink.field_J;
        if (this.field_e.field_d[-1 + this.field_g] != this.field_f) {
          var1 = this.field_f;
          this.field_f = var1.field_j;
          this.field_d = var1;
          return var1;
        }
        do {
          if (this.field_g >= this.field_e.field_i) {
            return null;
          }
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          var1 = this.field_e.field_d[fieldTemp$0].field_j;
        } while (this.field_e.field_d[this.field_g - 1] == var1);
        this.field_f = var1.field_j;
        this.field_d = var1;
        return var1;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = TetraLink.field_J;
        if (this.field_e.field_d[this.field_g - 1] != this.field_f) {
          return true;
        }
        while (this.field_e.field_i > this.field_g) {
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          if (this.field_e.field_d[fieldTemp$0].field_j != this.field_e.field_d[-1 + this.field_g]) {
            this.field_f = this.field_e.field_d[this.field_g - 1].field_j;
            return true;
          }
          this.field_f = this.field_e.field_d[-1 + this.field_g];
        }
        return false;
    }

    public static void b(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 <= 116) {
          field_b = (int[]) null;
        }
        field_a = null;
    }

    private final void a(int param0) {
        this.field_f = this.field_e.field_d[0].field_j;
        this.field_g = 1;
        this.field_d = null;
        if (param0 != -1) {
          field_c = (ah) null;
        }
    }

    public final void remove() {
        if (null == this.field_d) {
          throw new IllegalStateException();
        }
        this.field_d.b(false);
        this.field_d = null;
    }

    final static void a(byte param0) {
        int var1 = (cf.field_n - 640) / 2;
        int var2 = ma.field_f * ma.field_f;
        int var3 = -(qd.field_ab * qd.field_ab) + var2;
        if (param0 >= -21) {
          bc var4 = (bc) null;
          lj.a((bc) null, -52);
        }
        hn.field_P.a((byte) -92, 199, 90, -120 + ra.field_e - 94, var1 - var3 * 199 / var2);
        qe.field_c.a((byte) -124, 438, 0, -4 + ra.field_e - 120, 438 * var3 / var2 + (202 + var1));
    }

    final static rm[] a(bc param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        rm[] var4 = null;
        int var6_int = 0;
        rm var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        rm[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TetraLink.field_J;
        try {
          var2_int = param0.e(8, (byte) -112);
          if (param1 < var2_int) {
            stackIn_3_0 = null;
            return (rm[]) (stackIn_3_0);
          }
          var3 = param0.e(12, (byte) -112);
          var4 = new rm[var3];
          for (var5 = 0; var3 > var5; var5++) {
            if (bc.a(100, param0)) {
              var6 = new rm();
              param0.e(24, (byte) -112);
              param0.e(24, (byte) -112);
              var6.field_j = param0.e(24, (byte) -112);
              param0.e(9, (byte) -112);
              param0.e(12, (byte) -112);
              param0.e(12, (byte) -112);
              param0.e(12, (byte) -112);
              var4[var5] = var6;
            } else {
              var6_int = param0.e(rn.a((byte) -127, -1 + var5), (byte) -112);
              var4[var5] = var4[var6_int];
            }
          }
          stackIn_11_0 = var4;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("lj.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    lj(ea param0) {
        this.field_d = null;
        try {
          this.field_e = param0;
          this.a(-1);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "lj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new int[4];
        field_b = new int[8192];
    }
}
