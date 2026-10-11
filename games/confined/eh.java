/*
 * Decompiled by CFR-JS 0.4.0.
 */
class eh extends ue {
    private nf field_F;
    private nf[] field_O;
    private int field_E;
    private boolean field_U;
    private int field_X;
    private String field_Y;
    private int field_x;
    private int field_J;
    private int field_K;
    private nf[] field_hb;
    static String field_A;
    private boolean field_ab;
    static int field_R;
    private nf field_z;
    private int field_Q;
    private int field_cb;
    private int field_Z;
    private int field_T;
    private int field_W;
    private nf field_P;
    private int field_ib;
    private nf[] field_w;
    private int field_v;
    private int field_C;
    private nf field_B;
    static String field_eb;
    private nf[] field_fb;
    private int field_jb;
    private boolean field_V;
    private nf field_S;
    private int field_y;
    private boolean field_M;
    static boolean field_gb;
    private int field_N;
    private nf[] field_L;
    private boolean field_db;
    private boolean field_G;
    private int field_H;
    private String field_bb;
    private int field_D;
    private ok field_I;

    final static int e(int param0) {
        if (param0 != 0) {
          eh.d(69);
        }
        return cg.field_d;
    }

    public static void c(boolean param0) {
        field_A = null;
        field_eb = null;
        if (!param0) {
          eh.c(false);
        }
    }

    final static void d(int param0) {
        if (param0 > -104) {
          eh.c(false);
        }
    }

    eh(long param0, eh param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(eh param0, byte param1) {
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          var3_int = 15 / ((param1 - 28) / 54);
          if (param0 != null) {
            if (param0.field_x >= 0) {
              this.field_x = param0.field_x;
            }
            if (null != param0.field_P) {
              this.field_P = param0.field_P;
            }
            if (param0.field_db) {
              this.field_db = param0.field_db;
            }
            if (param0.field_ab) {
              this.field_ab = param0.field_ab;
            }
            if (null != param0.field_S) {
              this.field_S = param0.field_S;
            }
            if (param0.field_w != null) {
              this.field_w = param0.field_w;
            }
            if (param0.field_G) {
              this.field_G = param0.field_G;
            }
            if (param0.field_T != -2147483648) {
              this.field_T = param0.field_T;
            }
            if (param0.field_O != null) {
              this.field_O = param0.field_O;
            }
            if (param0.field_W != 0) {
              this.field_W = param0.field_W;
            }
            if (!param0.field_M) {
              this.field_M = param0.field_M;
            }
            if (param0.field_U) {
              this.field_U = param0.field_U;
            }
            if (0 != param0.field_jb) {
              this.field_jb = param0.field_jb;
            }
            if (256 != param0.field_v) {
              this.field_v = param0.field_v;
            }
            if (-2147483648 != param0.field_J) {
              this.field_J = param0.field_J;
            }
            if (param0.field_hb != null) {
              this.field_hb = param0.field_hb;
            }
            if (0 != param0.field_C) {
              this.field_C = param0.field_C;
            }
            if (null != param0.field_I) {
              this.field_I = param0.field_I;
            }
            if (param0.field_N != 0) {
              this.field_N = param0.field_N;
            }
            if (null != param0.field_bb) {
              this.field_bb = param0.field_bb;
            }
            if (param0.field_Q != -2147483648) {
              this.field_Q = param0.field_Q;
            }
            if (param0.field_y >= 0) {
              this.field_y = param0.field_y;
            }
            if (param0.field_Z >= 0) {
              this.field_Z = param0.field_Z;
            }
            if (param0.field_D != 0) {
              this.field_D = param0.field_D;
            }
            if (param0.field_E != -2147483648) {
              this.field_E = param0.field_E;
            }
            if (param0.field_cb != -2147483648) {
              this.field_cb = param0.field_cb;
            }
            if (null != param0.field_Y) {
              this.field_Y = param0.field_Y;
            }
            if (param0.field_V) {
              this.field_V = param0.field_V;
            }
            if (0 != param0.field_K) {
              this.field_K = param0.field_K;
            }
            if (param0.field_ib != 0) {
              this.field_ib = param0.field_ib;
            }
            if (null != param0.field_fb) {
              this.field_fb = param0.field_fb;
            }
            if (param0.field_B != null) {
              this.field_B = param0.field_B;
            }
            if (param0.field_H != -2147483648) {
              this.field_H = param0.field_H;
            }
            if (null != param0.field_F) {
              this.field_F = param0.field_F;
            }
            if (null != param0.field_z) {
              this.field_z = param0.field_z;
            }
            if (null != param0.field_L) {
              this.field_L = param0.field_L;
            }
            if (param0.field_X >= 0) {
              this.field_X = param0.field_X;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_97_0 = var3;
          stackIn_97_1 = new StringBuilder().append("eh.G(");
          if (param0 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_97_0), ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',').append(param1).append(')').toString());
        }
    }

    private eh(long param0, eh param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_Q = -2147483648;
        this.field_J = -2147483648;
        this.field_Z = -1;
        this.field_x = -1;
        this.field_cb = -2147483648;
        this.field_X = -1;
        this.field_v = 256;
        this.field_T = -2147483648;
        this.field_y = -1;
        this.field_M = true;
        this.field_H = -2147483648;
        this.field_E = -2147483648;
        this.field_U = false;
        try {
          this.field_i = param0;
          this.a(param1, (byte) -121);
          if (param6 != null) {
            this.field_bb = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("eh.<init>(").append(param0).append(',');
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
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_A = "More suggestions";
        field_eb = "Create your own free Jagex account";
        field_gb = true;
    }
}
