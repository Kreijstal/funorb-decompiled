/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ca extends rd {
    private boolean field_J;
    private boolean field_x;
    private boolean field_L;
    private int field_z;
    private int field_A;
    private int field_T;
    private hl field_F;
    private String field_S;
    private hl field_ab;
    private int field_U;
    private int field_V;
    private int field_db;
    private hl[] field_v;
    private qe field_B;
    private int field_H;
    private boolean field_I;
    private int field_w;
    private hl field_D;
    private int field_Z;
    private hl[] field_s;
    private String field_u;
    private int field_G;
    private hl field_t;
    private int field_Q;
    private hl[] field_eb;
    private int field_y;
    private hl[] field_bb;
    private int field_W;
    private int field_O;
    static String field_M;
    private int field_E;
    static long field_Y;
    private hl field_cb;
    private boolean field_P;
    private hl[] field_K;
    private int field_N;
    private int field_r;
    private int field_C;
    static String field_X;
    private boolean field_R;

    ca(long param0, ca param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static void f(int param0) {
        gd.field_g = false;
        se.field_p.j(7909);
        if (param0 != 0) {
          field_Y = -84L;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_X = null;
        field_M = null;
    }

    private final void a(ca param0, byte param1) {
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > -95) {
            return;
          }
          if (param0 != null) {
            if (null != param0.field_v) {
              this.field_v = param0.field_v;
            }
            if (param0.field_r >= 0) {
              this.field_r = param0.field_r;
            }
            if (param0.field_W != -2147483648) {
              this.field_W = param0.field_W;
            }
            if (-2147483648 != param0.field_E) {
              this.field_E = param0.field_E;
            }
            if (param0.field_z != -2147483648) {
              this.field_z = param0.field_z;
            }
            if (0 != param0.field_y) {
              this.field_y = param0.field_y;
            }
            if (256 != param0.field_Z) {
              this.field_Z = param0.field_Z;
            }
            if (!param0.field_x) {
              this.field_x = param0.field_x;
            }
            if (param0.field_S != null) {
              this.field_S = param0.field_S;
            }
            if (param0.field_db != 0) {
              this.field_db = param0.field_db;
            }
            if (param0.field_C != 0) {
              this.field_C = param0.field_C;
            }
            if (param0.field_J) {
              this.field_J = param0.field_J;
            }
            if (param0.field_P) {
              this.field_P = param0.field_P;
            }
            if (param0.field_u != null) {
              this.field_u = param0.field_u;
            }
            if (param0.field_N != -2147483648) {
              this.field_N = param0.field_N;
            }
            if (param0.field_t != null) {
              this.field_t = param0.field_t;
            }
            if (param0.field_L) {
              this.field_L = param0.field_L;
            }
            if (param0.field_R) {
              this.field_R = param0.field_R;
            }
            if (null != param0.field_F) {
              this.field_F = param0.field_F;
            }
            if (param0.field_D != null) {
              this.field_D = param0.field_D;
            }
            if (param0.field_Q != 0) {
              this.field_Q = param0.field_Q;
            }
            if (param0.field_s != null) {
              this.field_s = param0.field_s;
            }
            if (param0.field_I) {
              this.field_I = param0.field_I;
            }
            if (param0.field_w != 0) {
              this.field_w = param0.field_w;
            }
            if (0 <= param0.field_V) {
              this.field_V = param0.field_V;
            }
            if (null != param0.field_eb) {
              this.field_eb = param0.field_eb;
            }
            if (null != param0.field_cb) {
              this.field_cb = param0.field_cb;
            }
            if (param0.field_O != 0) {
              this.field_O = param0.field_O;
            }
            if (null != param0.field_ab) {
              this.field_ab = param0.field_ab;
            }
            if (param0.field_T != 0) {
              this.field_T = param0.field_T;
            }
            if (param0.field_H != -2147483648) {
              this.field_H = param0.field_H;
            }
            if (param0.field_A >= 0) {
              this.field_A = param0.field_A;
            }
            if (null != param0.field_bb) {
              this.field_bb = param0.field_bb;
            }
            if (param0.field_G != -2147483648) {
              this.field_G = param0.field_G;
            }
            if (param0.field_K != null) {
              this.field_K = param0.field_K;
            }
            if (param0.field_U >= 0) {
              this.field_U = param0.field_U;
            }
            if (param0.field_B != null) {
              this.field_B = param0.field_B;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_97_0 = var3;
          stackIn_97_1 = new StringBuilder().append("ca.F(");
          if (param0 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_97_0), ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',').append(param1).append(')').toString());
        }
    }

    private ca(long param0, ca param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_A = -1;
        this.field_z = -2147483648;
        this.field_U = -1;
        this.field_x = true;
        this.field_H = -2147483648;
        this.field_V = -1;
        this.field_L = false;
        this.field_E = -2147483648;
        this.field_W = -2147483648;
        this.field_Z = 256;
        this.field_r = -1;
        this.field_N = -2147483648;
        this.field_G = -2147483648;
        try {
          this.field_b = param0;
          this.a(param1, (byte) -105);
          if (param6 != null) {
            this.field_S = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ca.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_M = "Type your email address again to make sure it's correct";
        field_X = "Suggested names: ";
    }
}
