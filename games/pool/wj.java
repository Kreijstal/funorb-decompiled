/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wj extends ud {
    private int field_O;
    private boolean field_W;
    private int field_P;
    static int field_T;
    private int field_Q;
    static String field_U;
    static int field_V;
    private int field_R;
    private boolean field_N;
    static String[] field_S;

    final static void a(int param0, boolean param1) {
        if (hb.field_a > 0 &&
          tf.field_d) {
          qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
          ln.field_q.a((byte) -79, param1);
        }
        if (uf.field_z > 0) {
          if (nr.field_bb) {
            qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
            de.field_b.a((byte) -79, param1);
          }
        } else {
          if (nj.field_b > 0 &&
            nr.field_bb) {
            qh.g(0, 0, qh.field_l, fl.field_q.field_ib);
            de.field_b.a((byte) -79, param1);
          }
        }
        if (param0 < -42) {
          return;
        }
        wj.h(-57);
    }

    final void f(byte param0) {
        super.f(param0);
        this.field_L.a(this.field_l, 0, this.field_y, false, 0);
        this.field_Q = this.field_D;
        this.field_P = this.field_C;
    }

    final static void a(int param0, int param1) {
        ap.field_E = param0;
        g.field_l = new int[3];
        wb.field_e = new pn[param0 * 15];
        aa.field_e = 0;
        if (param1 > -43) {
          field_V = 16;
        }
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, int param3) {
        StringBuilder discarded$62 = null;
        StringBuilder discarded$63 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 < 13) {
            field_U = (String) null;
          }
          if (this.b(param1, param2, param0, -1)) {
            this.a(1, param2, param0, param1);
            this.a(param2, 3, param0, param1);
            discarded$62 = param0.append(" revert=").append(this.field_N);
            if (this.field_P != 2147483647 &&
              this.field_Q != 2147483647) {
              discarded$63 = param0.append(" to ").append(this.field_P).append(',').append(this.field_Q);
            }
          }
          stackIn_8_0 = (StringBuilder) (param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("wj.EA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_S = null;
        field_U = null;
        if (param0 >= -33) {
          ai var2 = (ai) null;
          wj.a((di) null, 96, false, (ai) null);
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, ei param5) {
        if (param4 < 62) {
          return;
        }
        try {
          super.a(param0, param1, param2, param3, (byte) 124, param5);
          this.field_n = 0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "wj.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private wj(int param0, int param1, int param2, int param3, fp param4, cc param5, ei param6, boolean param7, boolean param8) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_P = 2147483647;
        this.field_Q = 2147483647;
        try {
          this.field_L = param6;
          this.field_W = param8 ? true : false;
          this.field_N = param7 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "wj.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(di param0, int param1, boolean param2, ai param3) {
        try {
          cl.field_h = param1 * up.a(-21282) / 1000;
          if (param2) {
            field_S = (String[]) null;
          }
          q.a(param0, 102);
          oj.a(param0, (byte) -106);
          dr.a((byte) -65, param0);
          wk.a(-257);
          lm.i(23);
          im.field_fc = 0 - cl.field_h;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "wj.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(ei param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = super.a(param0, param1, param2, param3, param4, param5, param6) ? 1 : 0;
          if (var8_int != 0 &&
            this.field_W) {
            return true;
          }
          if (!this.a(param1, param5, param6, -1, param4)) {
            stackIn_5_0 = var8_int;
            return stackIn_5_0 != 0;
          }
          this.field_n = param3;
          if (param3 != 1) {
            return true;
          }
          this.field_O = -param5 - this.field_D + param4;
          this.field_R = -param1 + (param6 - this.field_C);
          uh.field_u = this;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("wj.AA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(ei param0, int param1, int param2, int param3) {
        int stackIn_15_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_23_1 = 0;
        int stackIn_26_2 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          if ((!(this.field_L instanceof fe) ||
            ((fe) (this.field_L)).field_I) &&
            this.field_n == 1) {
            var5_int = -this.field_R + wn.field_i - param2;
            var6 = gg.field_f - this.field_O - param3;
            if (var5_int != this.field_C ||
              this.field_D != var6) {
              this.field_D = var6;
              this.field_C = var5_int;
              if (this.field_t instanceof gb) {
                ((gb) (this.field_t)).a(this, (byte) 81, param3, param2);
              }
            }
          } else {
            if (this.field_N) {
              if (this.field_P != this.field_C) {
                var5_int = -this.field_C + this.field_P;
                stackIn_15_1 = this.field_C;
                if (Math.abs(var5_int) <= 2) {
                  if (0 < var5_int) {
                    stackIn_18_2 = 1;
                  } else {
                    stackIn_18_2 = -1;
                  }
                } else {
                  stackIn_18_2 = var5_int >> 1;
                }
                this.field_C = stackIn_15_1 + stackIn_18_2;
              }
              if (this.field_Q != this.field_D) {
                var5_int = -this.field_D + this.field_Q;
                stackIn_23_1 = this.field_D;
                if (Math.abs(var5_int) <= 2) {
                  if (var5_int <= 0) {
                    stackIn_26_2 = -1;
                  } else {
                    stackIn_26_2 = 1;
                  }
                } else {
                  stackIn_26_2 = var5_int >> 1;
                }
                this.field_D = stackIn_23_1 + stackIn_26_2;
              }
            }
          }
          if (param1 != 958) {
            return;
          }
          super.a(param0, param1 + 0, param2, param3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("wj.S(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean i(int param0) {
        if (param0 != -1) {
          field_S = (String[]) null;
          if (null == sa.field_f) {
            return fm.field_H ? true : false;
          }
          return true;
        }
        if (null != sa.field_f) {
          return true;
        }
        if (!fm.field_H) {
          return false;
        }
        return true;
    }

    static {
        field_U = "You<%0> have all resigned!";
    }
}
