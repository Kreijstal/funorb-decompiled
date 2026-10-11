/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ug extends ii {
    private boolean field_E;
    private int field_w;
    private boolean field_v;
    private qj[] field_S;
    private boolean field_U;
    private qj field_ab;
    private boolean field_H;
    private int field_z;
    private int field_F;
    private String field_L;
    private int field_bb;
    private int field_Z;
    static int field_Q;
    private int field_P;
    private int field_K;
    private int field_V;
    private qj[] field_Y;
    private boolean field_G;
    private int field_N;
    private int field_u;
    private int field_X;
    private qj[] field_C;
    private int field_x;
    private oh field_I;
    private qj[] field_eb;
    private qj field_M;
    private int field_db;
    private boolean field_hb;
    private qj[] field_D;
    static String field_t;
    private qj field_W;
    private int field_T;
    private String field_J;
    private int field_fb;
    private qj field_A;
    static bj field_cb;
    private int field_B;
    private qj field_O;
    private int field_gb;
    private int field_y;

    final static void a(int param0, java.awt.Component param1) {
        try {
          param1.setFocusTraversalKeysEnabled(false);
          int var2_int = -53 / ((-10 - param0) / 37);
          param1.addKeyListener(cj.field_o);
          param1.addFocusListener(cj.field_o);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ug.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(String param0, kk param1, int param2, String param3) {
        RuntimeException var4 = null;
        java.awt.Component var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 2147483647) {
            var5 = (java.awt.Component) null;
            ug.a(26, (java.awt.Component) null);
          }
          if (!param1.c(param2 ^ -2147483600)) {
            stackIn_5_0 = (String) (param0);
            return stackIn_5_0;
          }
          stackIn_7_0 = param3 + " - " + param1.a(true) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ug.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_t = null;
        field_cb = null;
        if (param0 > -84) {
          String var2 = (String) null;
          ug.a((String) null, (kk) null, -13, (String) null);
        }
    }

    ug(long param0, ug param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(ug param0, int param1) {
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != null) {
            if (param0.field_fb != 0) {
              this.field_fb = param0.field_fb;
            }
            if (null != param0.field_C) {
              this.field_C = param0.field_C;
            }
            if (param0.field_T != -2147483648) {
              this.field_T = param0.field_T;
            }
            if (param0.field_X >= 0) {
              this.field_X = param0.field_X;
            }
            if (param0.field_N != 0) {
              this.field_N = param0.field_N;
            }
            if (param0.field_G) {
              this.field_G = param0.field_G;
            }
            if (param0.field_S != null) {
              this.field_S = param0.field_S;
            }
            if (param0.field_P != 256) {
              this.field_P = param0.field_P;
            }
            if (param0.field_O != null) {
              this.field_O = param0.field_O;
            }
            if (null != param0.field_eb) {
              this.field_eb = param0.field_eb;
            }
            if (null != param0.field_I) {
              this.field_I = param0.field_I;
            }
            if (param0.field_Z != -2147483648) {
              this.field_Z = param0.field_Z;
            }
            if (param0.field_db != -2147483648) {
              this.field_db = param0.field_db;
            }
            if (param0.field_V >= 0) {
              this.field_V = param0.field_V;
            }
            if (-2147483648 != param0.field_w) {
              this.field_w = param0.field_w;
            }
            if (param0.field_E) {
              this.field_E = param0.field_E;
            }
            if (0 != param0.field_B) {
              this.field_B = param0.field_B;
            }
            if (param0.field_Y != null) {
              this.field_Y = param0.field_Y;
            }
            if (param0.field_M != null) {
              this.field_M = param0.field_M;
            }
            if (0 != param0.field_x) {
              this.field_x = param0.field_x;
            }
            if (null != param0.field_L) {
              this.field_L = param0.field_L;
            }
            if (param0.field_H) {
              this.field_H = param0.field_H;
            }
            if (param0.field_K != 0) {
              this.field_K = param0.field_K;
            }
            if (param0.field_U) {
              this.field_U = param0.field_U;
            }
            if (!param0.field_hb) {
              this.field_hb = param0.field_hb;
            }
            if (param0.field_D != null) {
              this.field_D = param0.field_D;
            }
            if (param0.field_F != -2147483648) {
              this.field_F = param0.field_F;
            }
            if (0 <= param0.field_u) {
              this.field_u = param0.field_u;
            }
            if (0 != param0.field_y) {
              this.field_y = param0.field_y;
            }
            if (param0.field_v) {
              this.field_v = param0.field_v;
            }
            if (null != param0.field_A) {
              this.field_A = param0.field_A;
            }
            if (param0.field_gb >= 0) {
              this.field_gb = param0.field_gb;
            }
            if (param0.field_W != null) {
              this.field_W = param0.field_W;
            }
            if (param0.field_ab != null) {
              this.field_ab = param0.field_ab;
            }
            if (param0.field_bb != 0) {
              this.field_bb = param0.field_bb;
            }
            if (null != param0.field_J) {
              this.field_J = param0.field_J;
            }
            if (param0.field_z != -2147483648) {
              this.field_z = param0.field_z;
            }
          }
          if (param1 != 256) {
            ug.g(103);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_95_0 = var3;
          stackIn_95_1 = new StringBuilder().append("ug.G(");
          if (param0 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_95_0), ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(',').append(param1).append(')').toString());
        }
    }

    private ug(long param0, ug param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_w = -2147483648;
        this.field_P = 256;
        this.field_Z = -2147483648;
        this.field_V = -1;
        this.field_db = -2147483648;
        this.field_X = -1;
        this.field_v = false;
        this.field_F = -2147483648;
        this.field_u = -1;
        this.field_z = -2147483648;
        this.field_hb = true;
        this.field_T = -2147483648;
        this.field_gb = -1;
        try {
          this.field_b = param0;
          this.a(param1, 256);
          if (param6 != null) {
            this.field_L = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ug.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = "Loading extra data";
        field_Q = 0;
    }
}
