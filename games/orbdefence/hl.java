/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hl extends ej {
    private int field_S;
    private int field_T;
    private li field_R;
    static ki field_N;
    private int field_P;
    private pj field_V;
    private jj field_Q;
    private int field_U;
    private int field_O;

    private final void b(int param0, pj param1) {
        try {
          if (this.field_Q != null) {
            this.field_Q.b(57);
          }
          if (param0 != -6142) {
            this.field_R = (li) null;
          }
          if (param1 == null) {
            this.field_Q = new jj();
          } else {
            param1.a(6, this.field_S + 6, param1.field_r, (byte) -90, param1.field_m);
            this.field_Q = new jj(param1);
          }
          this.a(this.field_Q, (byte) 74);
          this.field_V = null;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "hl.SA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(boolean param0, pj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_V = param1;
          if (param0) {
            return;
          }
          if (this.field_R == pd.field_w) {
            this.a(this.field_P, this.field_V.field_m + 12, 12 + this.field_S + this.field_V.field_r, (byte) 114);
            this.field_U = 0;
            return;
          }
          if (ji.field_d == this.field_R) {
            return;
          }
          this.field_U = 0;
          this.field_R = ji.field_d;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("hl.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void p(int param0) {
        if (param0 != 0) {
          return;
        }
        field_N = null;
    }

    boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (this.field_Q != null) {
            if (98 == param1) {
              this.field_Q.a(-81, param2);
            }
            if (param1 == 99) {
              this.field_Q.a(-81, param2);
              return false;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("hl.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void n(int param0) {
        if (param0 != 6630) {
          this.field_U = -124;
          if (ji.field_d == this.field_R) {
            return;
          }
          this.field_U = 0;
          this.field_R = qd.field_b;
          this.b(-6142, this.field_V);
          this.field_V = null;
          this.field_Q.field_A = 0;
          return;
        }
        if (ji.field_d == this.field_R) {
          return;
        }
        this.field_U = 0;
        this.field_R = qd.field_b;
        this.b(-6142, this.field_V);
        this.field_V = null;
        this.field_Q.field_A = 0;
    }

    final boolean l(int param0) {
        this.m(param0 ^ param0);
        return super.l(194);
    }

    boolean d(boolean param0) {
        int fieldTemp$0 = 0;
        int var3 = OrbDefence.field_D ? 1 : 0;
        if (null == this.field_R) {
          if (!param0) {
            return super.d(false);
          }
          hl.p(-91);
          return super.d(false);
        }
        if (this.field_R != ji.field_d) {
          if (this.field_R != qd.field_b) {
            if (!param0) {
              return super.d(false);
            }
            hl.p(-91);
            return super.d(false);
          }
          fieldTemp$0 = this.field_U + 1;
          this.field_U = this.field_U + 1;
          if (this.field_O == fieldTemp$0) {
            this.field_R = null;
            this.field_Q.field_A = 256;
            if (!param0) {
              return super.d(false);
            }
            hl.p(-91);
            return super.d(false);
          }
          this.field_Q.field_A = (this.field_U << 8) / this.field_O;
          if (!param0) {
            return super.d(false);
          }
          hl.p(-91);
          return super.d(false);
        }
        int fieldTemp$1 = this.field_U + 1;
        this.field_U = this.field_U + 1;
        if (fieldTemp$1 != this.field_T) {
          this.field_Q.field_A = -((this.field_U << 8) / this.field_T) + 256;
          if (!param0) {
            return super.d(false);
          }
          hl.p(-91);
          return super.d(false);
        }
        this.field_R = pd.field_w;
        this.a(this.field_P, 12 + this.field_V.field_m, this.field_V.field_r + (12 + this.field_S), (byte) 114);
        this.field_U = 0;
        this.field_Q.field_A = 0;
        if (!param0) {
          return super.d(false);
        }
        hl.p(-91);
        return super.d(false);
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param0) {
          if (tl.field_d[param2] > tl.field_d[param3]) {
            return true;
          }
          if (tl.field_d[param2] < tl.field_d[param3]) {
            return false;
          }
          if (rh.field_c[param3] < rh.field_c[param2]) {
            return true;
          }
          if (rh.field_c[param3] > rh.field_c[param2]) {
            return false;
          }
          if (param1 >= -91) {
            return true;
          }
          var4 = vl.field_g[param3] + th.field_f[param3] + ld.field_b[param3];
          var5 = th.field_f[param2] + (vl.field_g[param2] + ld.field_b[param2]);
          if (var5 > var4) {
            return true;
          }
          if (var5 < var4) {
            return false;
          }
          return !(param3 >= param2);
        }
        if (rh.field_c[param3] < rh.field_c[param2]) {
          return true;
        }
        if (rh.field_c[param3] > rh.field_c[param2]) {
          return false;
        }
        if (tl.field_d[param3] < tl.field_d[param2]) {
          return true;
        }
        if (tl.field_d[param2] < tl.field_d[param3]) {
          return false;
        }
        if (param1 >= -91) {
          return true;
        }
        var4Lifetime1 = vl.field_g[param3] + th.field_f[param3] + ld.field_b[param3];
        var5Lifetime1 = th.field_f[param2] + (vl.field_g[param2] + ld.field_b[param2]);
        if (var5Lifetime1 > var4Lifetime1) {
          return true;
        }
        if (var5Lifetime1 < var4Lifetime1) {
          return false;
        }
        if (param3 >= param2) {
          return false;
        }
        return true;
    }

    final static void a(java.awt.Canvas param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          fg.a((byte) 51, (java.awt.Component) ((Object) param0));
          if (param1 < 104) {
            field_N = (ki) null;
          }
          cb.a(5000, (java.awt.Component) ((Object) param0));
          if (mj.field_i == null) {
            return;
          }
          mj.field_i.a(108, (java.awt.Component) ((Object) param0));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("hl.VA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void m(int param0) {
        if (this.field_R == null) {
          super.m(param0);
          return;
        }
        if (qd.field_b != this.field_R) {
          this.a(12 - (-this.field_S - this.field_V.field_r), (byte) -81, 12 + this.field_V.field_m);
          this.b(-6142, this.field_V);
        } else {
          this.field_R = null;
          this.field_Q.field_A = 256;
          super.m(param0);
          return;
        }
        this.field_R = null;
        this.field_Q.field_A = 256;
        super.m(param0);
    }

    hl(sk param0, pj param1, int param2, int param3, int param4) {
        super(param0, param1.field_m + 12, param2 + (12 + param1.field_r));
        try {
          this.field_S = param2;
          this.field_P = param4;
          this.field_O = param3;
          this.field_T = param3;
          this.b(-6142, param1);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
    }
}
