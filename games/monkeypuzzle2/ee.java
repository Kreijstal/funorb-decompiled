/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ee extends jk {
    static int field_F;
    private int field_I;
    private int field_H;
    private boolean field_G;
    private boolean field_D;
    private int field_K;
    private int field_E;

    private ee(int param0, int param1, int param2, int param3, ml param4, of param5, we param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_H = 2147483647;
        this.field_K = 2147483647;
        try {
          this.field_D = param8 ? true : false;
          this.field_G = param7 ? true : false;
          this.field_v = param6;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ee.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final StringBuilder a(boolean param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_2_0 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = (StringBuilder) null;
            return stackIn_2_0;
          }
          if (this.a(param2, (byte) -122, param3, param1)) {
            this.a(param2, param3, param1, -128);
            this.b(param2, -25844, param1, param3);
            discarded$62 = param1.append(" revert=").append(this.field_G);
            if (2147483647 != this.field_H &&
              2147483647 != this.field_K) {
              discarded$63 = param1.append(" to ").append(this.field_H).append(',').append(this.field_K);
            }
          }
          stackIn_9_0 = (StringBuilder) (param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ee.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final void i(int param0) {
        super.i(param0);
        this.field_v.a(this.field_p, 13361, 0, this.field_l, 0);
        this.field_K = this.field_e;
        this.field_H = this.field_r;
    }

    final static ai k(int param0) {
        ai var1 = null;
        ai var1Lifetime1;
        if (param0 == 15090) {
          var1 = new ai(nj.field_d, qk.field_a, qc.field_P[0], mb.field_b[0], da.field_c[0], ra.field_ab[0], cb.field_b[0], fk.field_d);
          gb.a(-45);
          return var1;
        }
        ee.j(94);
        var1Lifetime1 = new ai(nj.field_d, qk.field_a, qc.field_P[0], mb.field_b[0], da.field_c[0], ra.field_ab[0], cb.field_b[0], fk.field_d);
        gb.a(-45);
        return var1Lifetime1;
    }

    final void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        try {
          super.a(param0, param1, param2, param3, 0, param5);
          this.field_t = param4;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ee.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(we param0, int param1, int param2, byte param3) {
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_24_1 = 0;
        int stackIn_27_2 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_v instanceof t) ||
            ((t) (this.field_v)).field_w) &&
            this.field_t == 1) {
            var5_int = -param2 + (-this.field_E + ei.field_a);
            var6 = -this.field_I + p.field_a - param1;
            if (this.field_r != var5_int ||
              this.field_e != var6) {
              this.field_e = var6;
              this.field_r = var5_int;
              if (this.field_o instanceof qe) {
                ((qe) (this.field_o)).a(param1, this, param2, 3257);
              }
            }
          } else {
            if (this.field_G) {
              if (this.field_H != this.field_r) {
                var5_int = this.field_H - this.field_r;
                stackIn_18_1 = this.field_r;
                if (Math.abs(var5_int) > 2) {
                  stackIn_19_2 = var5_int >> 1;
                } else {
                  if (var5_int > 0) {
                    stackIn_19_2 = 1;
                  } else {
                    stackIn_19_2 = -1;
                  }
                }
                this.field_r = stackIn_18_1 + stackIn_19_2;
              }
              if (this.field_e != this.field_K) {
                var5_int = -this.field_e + this.field_K;
                stackIn_24_1 = this.field_e;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int > 0) {
                    stackIn_27_2 = 1;
                  } else {
                    stackIn_27_2 = -1;
                  }
                } else {
                  stackIn_27_2 = var5_int >> 1;
                }
                this.field_e = stackIn_24_1 + stackIn_27_2;
              }
            }
          }
          super.a(param0, param1, param2, (byte) -40);
          if (param3 < -13) {
            return;
          }
          field_F = 122;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("ee.E(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, we param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_D) {
            return true;
          }
          if (!this.a(param1, param0, param6, param5, (byte) 45)) {
            stackIn_10_0 = var8_int;
            return stackIn_10_0 != 0;
          }
          if (1 == param2) {
            this.field_E = -param6 + param1 - this.field_r;
            od.field_n = this;
            this.field_I = param5 - (this.field_e + param0);
          }
          this.field_t = param2;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("ee.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static te[] j(int param0) {
        if (param0 == 44) {
          return new te[]{rd.field_o, fc.field_g, eg.field_i, cm.field_D, lb.field_I, ja.field_B, fc.field_j, lg.field_E, o.field_d, wa.field_b, ve.field_A, vj.field_a, ph.field_b, he.field_e};
        }
        field_F = -9;
        return new te[]{rd.field_o, fc.field_g, eg.field_i, cm.field_D, lb.field_I, ja.field_B, fc.field_j, lg.field_E, o.field_d, wa.field_b, ve.field_A, vj.field_a, ph.field_b, he.field_e};
    }

    static {
        field_F = -1;
    }
}
