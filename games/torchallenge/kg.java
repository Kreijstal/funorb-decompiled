/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kg extends rc {
    static String field_P;
    private int field_C;
    private int field_y;
    private boolean field_J;
    private ka field_Y;
    private boolean field_kb;
    private int field_Z;
    private int field_jb;
    private eg field_S;
    private ka[] field_A;
    private int field_z;
    private ka field_X;
    private int field_bb;
    static String field_db;
    private int field_I;
    private int field_D;
    private int field_N;
    private int field_ab;
    private int field_V;
    private int field_M;
    private int field_B;
    private ka[] field_gb;
    private int field_x;
    private ka[] field_G;
    private ka[] field_O;
    private boolean field_K;
    private ka field_fb;
    private boolean field_w;
    private int field_Q;
    private String field_v;
    private String field_T;
    private int field_U;
    private ka field_hb;
    private boolean field_H;
    private int field_ib;
    private int field_E;
    private ka field_L;
    static String field_eb;
    private ka[] field_R;
    private boolean field_W;
    static String field_cb;

    kg(long param0, kg param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    public static void e(int param0) {
        field_db = null;
        field_P = null;
        field_cb = null;
        field_eb = null;
        if (param0 != -8796) {
          kg.e(53);
        }
    }

    final static boolean a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        boolean stackIn_7_0 = false;
        if (param0 >= -86) {
          return true;
        }
        stackIn_7_0 = (param3 <= param4) && (param4 < param3 + param2) && (param5 >= param1) && (param6 + param1 > param5);
        return stackIn_7_0;
    }

    private final void a(byte param0, kg param1) {
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          if (param1 != null) {
            if (param1.field_I != 0) {
              this.field_I = param1.field_I;
            }
            if (param1.field_B != -2147483648) {
              this.field_B = param1.field_B;
            }
            if (0 <= param1.field_Z) {
              this.field_Z = param1.field_Z;
            }
            if (param1.field_M != 0) {
              this.field_M = param1.field_M;
            }
            if (null != param1.field_hb) {
              this.field_hb = param1.field_hb;
            }
            if (param1.field_fb != null) {
              this.field_fb = param1.field_fb;
            }
            if (param1.field_K) {
              this.field_K = param1.field_K;
            }
            if (null != param1.field_T) {
              this.field_T = param1.field_T;
            }
            if (param1.field_bb >= 0) {
              this.field_bb = param1.field_bb;
            }
            if (param1.field_gb != null) {
              this.field_gb = param1.field_gb;
            }
            if (param1.field_U != 0) {
              this.field_U = param1.field_U;
            }
            if (param1.field_G != null) {
              this.field_G = param1.field_G;
            }
            if (param1.field_A != null) {
              this.field_A = param1.field_A;
            }
            if (param1.field_S != null) {
              this.field_S = param1.field_S;
            }
            if (param1.field_ib != -2147483648) {
              this.field_ib = param1.field_ib;
            }
            if (param1.field_C != 256) {
              this.field_C = param1.field_C;
            }
            if (param1.field_w) {
              this.field_w = param1.field_w;
            }
            if (param1.field_x >= 0) {
              this.field_x = param1.field_x;
            }
            if (param1.field_E != -2147483648) {
              this.field_E = param1.field_E;
            }
            if (param1.field_D != 0) {
              this.field_D = param1.field_D;
            }
            if (!param1.field_W) {
              this.field_W = param1.field_W;
            }
            if (0 != param1.field_N) {
              this.field_N = param1.field_N;
            }
            if (null != param1.field_v) {
              this.field_v = param1.field_v;
            }
            if (param1.field_Q >= 0) {
              this.field_Q = param1.field_Q;
            }
            if (param1.field_Y != null) {
              this.field_Y = param1.field_Y;
            }
            if (null != param1.field_R) {
              this.field_R = param1.field_R;
            }
            if (param1.field_H) {
              this.field_H = param1.field_H;
            }
            if (param1.field_J) {
              this.field_J = param1.field_J;
            }
            if (param1.field_V != -2147483648) {
              this.field_V = param1.field_V;
            }
            if (param1.field_L != null) {
              this.field_L = param1.field_L;
            }
            if (param1.field_O != null) {
              this.field_O = param1.field_O;
            }
            if (param1.field_ab != -2147483648) {
              this.field_ab = param1.field_ab;
            }
            if (param1.field_kb) {
              this.field_kb = param1.field_kb;
            }
            if (param1.field_jb != 0) {
              this.field_jb = param1.field_jb;
            }
            if (param1.field_y != -2147483648) {
              this.field_y = param1.field_y;
            }
            if (0 != param1.field_z) {
              this.field_z = param1.field_z;
            }
            if (param1.field_X != null) {
              this.field_X = param1.field_X;
            }
          }
          var3_int = -119 % ((param0 + 75) / 42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_92_0 = var3;
          stackIn_92_1 = new StringBuilder().append("kg.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_92_0), ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(')').toString());
        }
    }

    private kg(long param0, kg param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_y = -2147483648;
        this.field_x = -1;
        this.field_Z = -1;
        this.field_V = -2147483648;
        this.field_Q = -1;
        this.field_B = -2147483648;
        this.field_bb = -1;
        this.field_W = true;
        this.field_ab = -2147483648;
        this.field_w = false;
        this.field_E = -2147483648;
        this.field_C = 256;
        this.field_ib = -2147483648;
        try {
          this.field_d = param0;
          this.a((byte) 122, param1);
          if (param6 != null) {
            this.field_T = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "kg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_P = null;
        field_eb = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_cb = "Email address is unavailable";
    }
}
