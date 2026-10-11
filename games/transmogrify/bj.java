/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bj extends kb {
    private String field_x;
    private boolean field_W;
    private String field_D;
    private int field_U;
    private int field_u;
    private boolean field_B;
    private ti field_v;
    private int field_N;
    private int field_R;
    private ti[] field_O;
    private int field_H;
    private int field_T;
    private int field_K;
    static String field_P;
    private ti field_db;
    private ti[] field_L;
    private ti field_I;
    private int field_J;
    private boolean field_G;
    private ti[] field_S;
    private int field_A;
    private int field_s;
    private int field_Z;
    private ti[] field_M;
    private boolean field_ab;
    static String field_X;
    private int field_cb;
    private ti field_E;
    private int field_r;
    private int field_t;
    private int field_Q;
    private int field_w;
    private int field_y;
    private int field_z;
    private ti field_C;
    private boolean field_V;
    private ti[] field_bb;
    private boolean field_F;
    private kg field_Y;

    public static void c(byte param0) {
        field_X = null;
        if (param0 >= -42) {
          field_P = (String) null;
        }
        field_P = null;
    }

    private final void a(int param0, bj param1) {
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != null) {
            if (-2147483648 != param1.field_Z) {
              this.field_Z = param1.field_Z;
            }
            if (null != param1.field_x) {
              this.field_x = param1.field_x;
            }
            if (0 <= param1.field_A) {
              this.field_A = param1.field_A;
            }
            if (param1.field_r != 0) {
              this.field_r = param1.field_r;
            }
            if (param1.field_U != -2147483648) {
              this.field_U = param1.field_U;
            }
            if (null != param1.field_db) {
              this.field_db = param1.field_db;
            }
            if (param1.field_V) {
              this.field_V = param1.field_V;
            }
            if (param1.field_N != 256) {
              this.field_N = param1.field_N;
            }
            if (param1.field_C != null) {
              this.field_C = param1.field_C;
            }
            if (param1.field_J != 0) {
              this.field_J = param1.field_J;
            }
            if (param1.field_E != null) {
              this.field_E = param1.field_E;
            }
            if (null != param1.field_Y) {
              this.field_Y = param1.field_Y;
            }
            if (null != param1.field_S) {
              this.field_S = param1.field_S;
            }
            if (param1.field_cb != 0) {
              this.field_cb = param1.field_cb;
            }
            if (param1.field_u >= 0) {
              this.field_u = param1.field_u;
            }
            if (0 <= param1.field_y) {
              this.field_y = param1.field_y;
            }
            if (param1.field_B) {
              this.field_B = param1.field_B;
            }
            if (!param1.field_F) {
              this.field_F = param1.field_F;
            }
            if (0 != param1.field_R) {
              this.field_R = param1.field_R;
            }
            if (-2147483648 != param1.field_K) {
              this.field_K = param1.field_K;
            }
            if (param1.field_Q != 0) {
              this.field_Q = param1.field_Q;
            }
            if (param1.field_t != -2147483648) {
              this.field_t = param1.field_t;
            }
            if (param1.field_H != 0) {
              this.field_H = param1.field_H;
            }
            if (null != param1.field_v) {
              this.field_v = param1.field_v;
            }
            if (param1.field_w >= 0) {
              this.field_w = param1.field_w;
            }
            if (param1.field_G) {
              this.field_G = param1.field_G;
            }
            if (null != param1.field_bb) {
              this.field_bb = param1.field_bb;
            }
            if (param1.field_s != -2147483648) {
              this.field_s = param1.field_s;
            }
            if (null != param1.field_L) {
              this.field_L = param1.field_L;
            }
            if (null != param1.field_D) {
              this.field_D = param1.field_D;
            }
            if (param1.field_z != 0) {
              this.field_z = param1.field_z;
            }
            if (param1.field_T != -2147483648) {
              this.field_T = param1.field_T;
            }
            if (param1.field_ab) {
              this.field_ab = param1.field_ab;
            }
            if (param1.field_O != null) {
              this.field_O = param1.field_O;
            }
            if (param1.field_W) {
              this.field_W = param1.field_W;
            }
            if (null != param1.field_I) {
              this.field_I = param1.field_I;
            }
            if (null != param1.field_M) {
              this.field_M = param1.field_M;
            }
          }
          if (param0 != -10583) {
            bj.c((byte) 114);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_103_0 = var3;
          stackIn_103_1 = new StringBuilder().append("bj.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(')').toString());
        }
    }

    bj(long param0, bj param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, oa param2, byte param3, oa param4) {
        try {
          if (param3 >= -100) {
            field_X = (String) null;
          }
          gl.a((byte) -126, param1, param0, param4.field_g, param2, param4.field_h, 0);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "bj.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0) {
        if (null != wg.field_d) {
          wg.field_d.r(77);
        }
        ca.field_g = new ck();
        if (param0 != -2147483648) {
          field_P = (String) null;
        }
        l.field_d.b(104, ca.field_g);
    }

    private bj(long param0, bj param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_U = -2147483648;
        this.field_T = -2147483648;
        this.field_u = -1;
        this.field_s = -2147483648;
        this.field_Z = -2147483648;
        this.field_N = 256;
        this.field_ab = false;
        this.field_K = -2147483648;
        this.field_y = -1;
        this.field_w = -1;
        this.field_t = -2147483648;
        this.field_A = -1;
        this.field_F = true;
        try {
          this.field_c = param0;
          this.a(-10583, param1);
          if (param6 != null) {
            this.field_D = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("bj.<init>(").append(param0).append(',');
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
          throw ch.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_P = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_X = "Checking";
    }
}
