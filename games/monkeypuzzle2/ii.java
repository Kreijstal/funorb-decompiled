/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ii extends vb {
    private le[] field_k;
    private String field_I;
    private le field_O;
    private boolean field_x;
    private le field_R;
    private int field_s;
    private int field_P;
    private boolean field_X;
    private int field_N;
    private int field_H;
    private boolean field_j;
    private int field_F;
    private boolean field_J;
    private int field_w;
    private int field_u;
    private int field_Q;
    private int field_l;
    private boolean field_y;
    static ib field_r;
    private int field_W;
    private int field_K;
    private int field_A;
    private String field_ab;
    private le[] field_M;
    private int field_q;
    private int field_z;
    private le field_p;
    private int field_C;
    private le field_V;
    private le field_n;
    static int field_E;
    static int[] field_U;
    private le[] field_Z;
    private le[] field_S;
    private boolean field_o;
    private ta field_t;
    private int field_G;
    private le[] field_Y;
    private int field_L;
    static ad field_m;
    static int field_B;
    private int field_v;
    static int field_T;
    static o field_D;

    final static void a(md param0, String param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        try {
          rk.field_g = param0;
          fa.field_q = param5;
          fl.field_d = param7;
          fi.field_d = param1;
          pi.field_o = param2;
          oh.field_c = param4;
          rb.field_eb = param3;
          mk.field_f = param6;
          lg.field_n = (wl) ((Object) new fa());
          jc.field_c = new uj(param0);
          if (param8 != -2045) {
            ii.b((byte) 62);
          }
          c.field_h = new c(lg.field_n, jc.field_c);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ii.L(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static java.applet.Applet a(boolean param0) {
        if (ll.field_b != null) {
          return ll.field_b;
        }
        if (param0) {
          field_r = (ib) null;
        }
        return (java.applet.Applet) ((Object) m.field_f);
    }

    ii(long param0, ii param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    public static void b(byte param0) {
        if (param0 <= 92) {
          return;
        }
        field_U = null;
        field_D = null;
        field_r = null;
        field_m = null;
    }

    private final void a(ii param0, boolean param1) {
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ii var4 = null;
        try {
          if (!param1) {
            var4 = (ii) null;
            this.a((ii) null, true);
          }
          if (param0 != null) {
            if (param0.field_X) {
              this.field_X = param0.field_X;
            }
            if (param0.field_O != null) {
              this.field_O = param0.field_O;
            }
            if (param0.field_t != null) {
              this.field_t = param0.field_t;
            }
            if (param0.field_x) {
              this.field_x = param0.field_x;
            }
            if (param0.field_s != -2147483648) {
              this.field_s = param0.field_s;
            }
            if (null != param0.field_k) {
              this.field_k = param0.field_k;
            }
            if (null != param0.field_V) {
              this.field_V = param0.field_V;
            }
            if (param0.field_S != null) {
              this.field_S = param0.field_S;
            }
            if (0 != param0.field_W) {
              this.field_W = param0.field_W;
            }
            if (param0.field_j) {
              this.field_j = param0.field_j;
            }
            if (-2147483648 != param0.field_N) {
              this.field_N = param0.field_N;
            }
            if (param0.field_P >= 0) {
              this.field_P = param0.field_P;
            }
            if (param0.field_u != 0) {
              this.field_u = param0.field_u;
            }
            if (param0.field_o) {
              this.field_o = param0.field_o;
            }
            if (param0.field_z != -2147483648) {
              this.field_z = param0.field_z;
            }
            if (param0.field_q != 0) {
              this.field_q = param0.field_q;
            }
            if (null != param0.field_I) {
              this.field_I = param0.field_I;
            }
            if (param0.field_Z != null) {
              this.field_Z = param0.field_Z;
            }
            if (param0.field_K != 0) {
              this.field_K = param0.field_K;
            }
            if (param0.field_v != 0) {
              this.field_v = param0.field_v;
            }
            if (param0.field_F != -2147483648) {
              this.field_F = param0.field_F;
            }
            if (!param0.field_y) {
              this.field_y = param0.field_y;
            }
            if (null != param0.field_Y) {
              this.field_Y = param0.field_Y;
            }
            if (param0.field_l != -2147483648) {
              this.field_l = param0.field_l;
            }
            if (param0.field_G != 0) {
              this.field_G = param0.field_G;
            }
            if (param0.field_ab != null) {
              this.field_ab = param0.field_ab;
            }
            if (param0.field_p != null) {
              this.field_p = param0.field_p;
            }
            if (param0.field_L >= 0) {
              this.field_L = param0.field_L;
            }
            if (param0.field_H != 256) {
              this.field_H = param0.field_H;
            }
            if (param0.field_A != -2147483648) {
              this.field_A = param0.field_A;
            }
            if (null != param0.field_n) {
              this.field_n = param0.field_n;
            }
            if (param0.field_w != 0) {
              this.field_w = param0.field_w;
            }
            if (param0.field_M != null) {
              this.field_M = param0.field_M;
            }
            if (param0.field_C >= 0) {
              this.field_C = param0.field_C;
            }
            if (param0.field_J) {
              this.field_J = param0.field_J;
            }
            if (param0.field_Q >= 0) {
              this.field_Q = param0.field_Q;
            }
            if (null == param0.field_R) {
              return;
            }
            this.field_R = param0.field_R;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_98_0 = var3;
          stackIn_98_1 = new StringBuilder().append("ii.N(");
          if (param0 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_98_0), ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',').append(param1).append(')').toString());
        }
    }

    private ii(long param0, ii param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_F = -2147483648;
        this.field_s = -2147483648;
        this.field_H = 256;
        this.field_y = true;
        this.field_P = -1;
        this.field_A = -2147483648;
        this.field_N = -2147483648;
        this.field_Q = -1;
        this.field_l = -2147483648;
        this.field_x = false;
        this.field_C = -1;
        this.field_z = -2147483648;
        this.field_L = -1;
        try {
          this.field_a = param0;
          this.a(param1, true);
          if (param6 != null) {
            this.field_I = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ii.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_E = 12;
        field_U = new int[field_E];
        field_r = new ib();
    }
}
