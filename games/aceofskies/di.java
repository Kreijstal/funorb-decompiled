/*
 * Decompiled by CFR-JS 0.4.0.
 */
class di extends ou {
    private int field_P;
    private boolean field_A;
    private Sprite field_W;
    private Sprite field_H;
    private boolean field_z;
    private int field_J;
    private int field_D;
    private Sprite[] field_U;
    private Sprite field_w;
    private int field_T;
    private String field_x;
    private int field_F;
    private Sprite[] field_O;
    private int field_X;
    private int field_S;
    private int field_Q;
    private boolean field_C;
    private int field_u;
    private String field_Z;
    private int field_s;
    private Sprite[] field_p;
    private int field_B;
    private Sprite[] field_L;
    private BitmapFont field_R;
    private int field_ab;
    private boolean field_t;
    private int field_r;
    private Sprite[] field_K;
    private boolean field_o;
    private boolean field_q;
    private int field_Y;
    static IntrusiveDeque activeSoundPlaybacks;
    private Sprite field_G;
    private Sprite field_N;
    private int field_y;
    private int field_v;
    private int field_E;
    private int field_V;

    private final void a(di param0, int param1) {
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 >= -109) {
            this.field_s = 60;
          }
          if (param0 != null) {
            if (param0.field_C) {
              this.field_C = param0.field_C;
            }
            if (param0.field_R != null) {
              this.field_R = param0.field_R;
            }
            if (param0.field_H != null) {
              this.field_H = param0.field_H;
            }
            if (0 != param0.field_D) {
              this.field_D = param0.field_D;
            }
            if (0 != param0.field_X) {
              this.field_X = param0.field_X;
            }
            if (param0.field_V != 0) {
              this.field_V = param0.field_V;
            }
            if (null != param0.field_L) {
              this.field_L = param0.field_L;
            }
            if (null != param0.field_K) {
              this.field_K = param0.field_K;
            }
            if (param0.field_E >= 0) {
              this.field_E = param0.field_E;
            }
            if (param0.field_t) {
              this.field_t = param0.field_t;
            }
            if (param0.field_J != -2147483648) {
              this.field_J = param0.field_J;
            }
            if (param0.field_Y != -2147483648) {
              this.field_Y = param0.field_Y;
            }
            if (param0.field_T >= 0) {
              this.field_T = param0.field_T;
            }
            if (-2147483648 != param0.field_v) {
              this.field_v = param0.field_v;
            }
            if (param0.field_s != -2147483648) {
              this.field_s = param0.field_s;
            }
            if (param0.field_z) {
              this.field_z = param0.field_z;
            }
            if (null != param0.field_x) {
              this.field_x = param0.field_x;
            }
            if (null != param0.field_p) {
              this.field_p = param0.field_p;
            }
            if (256 != param0.field_r) {
              this.field_r = param0.field_r;
            }
            if (param0.field_B != 0) {
              this.field_B = param0.field_B;
            }
            if (param0.field_F != 0) {
              this.field_F = param0.field_F;
            }
            if (null != param0.field_w) {
              this.field_w = param0.field_w;
            }
            if (param0.field_S >= 0) {
              this.field_S = param0.field_S;
            }
            if (null != param0.field_O) {
              this.field_O = param0.field_O;
            }
            if (param0.field_u >= 0) {
              this.field_u = param0.field_u;
            }
            if (!param0.field_q) {
              this.field_q = param0.field_q;
            }
            if (param0.field_o) {
              this.field_o = param0.field_o;
            }
            if (param0.field_y != -2147483648) {
              this.field_y = param0.field_y;
            }
            if (0 != param0.field_ab) {
              this.field_ab = param0.field_ab;
            }
            if (param0.field_A) {
              this.field_A = param0.field_A;
            }
            if (param0.field_G != null) {
              this.field_G = param0.field_G;
            }
            if (param0.field_U != null) {
              this.field_U = param0.field_U;
            }
            if (param0.field_P != 0) {
              this.field_P = param0.field_P;
            }
            if (null != param0.field_N) {
              this.field_N = param0.field_N;
            }
            if (param0.field_Q != -2147483648) {
              this.field_Q = param0.field_Q;
            }
            if (param0.field_Z != null) {
              this.field_Z = param0.field_Z;
            }
            if (null != param0.field_W) {
              this.field_W = param0.field_W;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_99_0 = var3;
          stackIn_99_1 = new StringBuilder().append("di.E(");
          if (param0 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_99_0), ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        activeSoundPlaybacks = null;
        if (param0) {
          activeSoundPlaybacks = (IntrusiveDeque) null;
        }
    }

    di(long param0, di param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private di(long param0, di param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_S = -1;
        this.field_T = -1;
        this.field_J = -2147483648;
        this.field_t = false;
        this.field_Q = -2147483648;
        this.field_s = -2147483648;
        this.field_u = -1;
        this.field_q = true;
        this.field_y = -2147483648;
        this.field_r = 256;
        this.field_E = -1;
        this.field_v = -2147483648;
        this.field_Y = -2147483648;
        try {
          this.key = param0;
          this.a(param1, -115);
          if (param6 != null) {
            this.field_x = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "di.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        activeSoundPlaybacks = new IntrusiveDeque();
    }
}
