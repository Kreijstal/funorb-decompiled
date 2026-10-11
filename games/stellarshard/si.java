/*
 * Decompiled by CFR-JS 0.4.0.
 */
class si extends bi {
    private int field_bb;
    private int field_W;
    static String field_I;
    static bd field_V;
    private boolean field_x;
    private int field_fb;
    private boolean field_A;
    private pb[] field_Q;
    private int field_J;
    private pb[] field_R;
    private boolean field_Y;
    private int field_E;
    private int field_lb;
    private pb[] field_ib;
    private int field_eb;
    private pb[] field_hb;
    private pb field_O;
    static int field_gb;
    static boolean[] field_jb;
    private boolean field_z;
    private pb field_U;
    private int field_L;
    private int field_H;
    private int field_N;
    private int field_ab;
    private int field_K;
    private int field_db;
    static String field_B;
    private String field_G;
    private pb field_w;
    private boolean field_kb;
    private int field_F;
    private boolean field_P;
    private int field_Z;
    private pb field_cb;
    private int field_T;
    private pb field_y;
    private pb[] field_S;
    private int field_C;
    private String field_D;
    private int field_M;
    private bd field_v;
    static int field_X;

    public static void f(int param0) {
        field_I = null;
        if (param0 != -16412) {
          si.f(-65);
        }
        field_B = null;
        field_jb = null;
        field_V = null;
    }

    si(long param0, si param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(byte param0, si param1) {
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != null) {
            if (param1.field_W != 0) {
              this.field_W = param1.field_W;
            }
            if (param1.field_lb >= 0) {
              this.field_lb = param1.field_lb;
            }
            if (param1.field_z) {
              this.field_z = param1.field_z;
            }
            if (param1.field_C >= 0) {
              this.field_C = param1.field_C;
            }
            if (null != param1.field_ib) {
              this.field_ib = param1.field_ib;
            }
            if (param1.field_db != -2147483648) {
              this.field_db = param1.field_db;
            }
            if (param1.field_x) {
              this.field_x = param1.field_x;
            }
            if (param1.field_eb != 0) {
              this.field_eb = param1.field_eb;
            }
            if (param1.field_ab != 256) {
              this.field_ab = param1.field_ab;
            }
            if (param1.field_T != 0) {
              this.field_T = param1.field_T;
            }
            if (param1.field_w != null) {
              this.field_w = param1.field_w;
            }
            if (param1.field_D != null) {
              this.field_D = param1.field_D;
            }
            if (param1.field_L != -2147483648) {
              this.field_L = param1.field_L;
            }
            if (param1.field_J >= 0) {
              this.field_J = param1.field_J;
            }
            if (param1.field_M != 0) {
              this.field_M = param1.field_M;
            }
            if (param1.field_O != null) {
              this.field_O = param1.field_O;
            }
            if (param1.field_F != -2147483648) {
              this.field_F = param1.field_F;
            }
            if (null != param1.field_hb) {
              this.field_hb = param1.field_hb;
            }
            if (null != param1.field_U) {
              this.field_U = param1.field_U;
            }
            if (null != param1.field_v) {
              this.field_v = param1.field_v;
            }
            if (null != param1.field_S) {
              this.field_S = param1.field_S;
            }
            if (param1.field_Y) {
              this.field_Y = param1.field_Y;
            }
            if (param1.field_P) {
              this.field_P = param1.field_P;
            }
            if (param1.field_cb != null) {
              this.field_cb = param1.field_cb;
            }
            if (param1.field_bb != 0) {
              this.field_bb = param1.field_bb;
            }
            if (param1.field_R != null) {
              this.field_R = param1.field_R;
            }
            if (!param1.field_A) {
              this.field_A = param1.field_A;
            }
            if (param1.field_Z != 0) {
              this.field_Z = param1.field_Z;
            }
            if (null != param1.field_Q) {
              this.field_Q = param1.field_Q;
            }
            if (param1.field_y != null) {
              this.field_y = param1.field_y;
            }
            if (param1.field_N != 0) {
              this.field_N = param1.field_N;
            }
            if (param1.field_K != -2147483648) {
              this.field_K = param1.field_K;
            }
            if (param1.field_fb != -2147483648) {
              this.field_fb = param1.field_fb;
            }
            if (param1.field_kb) {
              this.field_kb = param1.field_kb;
            }
            if (param1.field_H != -2147483648) {
              this.field_H = param1.field_H;
            }
            if (param1.field_E >= 0) {
              this.field_E = param1.field_E;
            }
            if (param1.field_G != null) {
              this.field_G = param1.field_G;
            }
          }
          if (param0 != -62) {
            si.f(75);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("si.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(')').toString());
        }
    }

    private si(long param0, si param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_J = -1;
        this.field_L = -2147483648;
        this.field_K = -2147483648;
        this.field_E = -1;
        this.field_A = true;
        this.field_F = -2147483648;
        this.field_fb = -2147483648;
        this.field_ab = 256;
        this.field_lb = -1;
        this.field_H = -2147483648;
        this.field_P = false;
        this.field_db = -2147483648;
        this.field_C = -1;
        try {
          this.field_j = param0;
          this.a((byte) -62, param1);
          if (param6 != null) {
            this.field_G = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "si.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_I = "Player Name: ";
        field_jb = new boolean[112];
        field_gb = 0;
        field_B = "Type your age in years";
    }
}
