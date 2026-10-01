/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mi extends kg {
    private int field_v;
    private int field_t;
    private int field_bb;
    private boolean field_q;
    private int field_A;
    private String field_X;
    private dm[] field_fb;
    private dm[] field_H;
    private boolean field_P;
    static String field_E;
    private dm field_p;
    private int field_T;
    private boolean field_S;
    private int field_cb;
    static int field_C;
    private dm[] field_eb;
    private boolean field_L;
    static dm[] field_B;
    private int field_J;
    private dm[] field_D;
    private String field_Y;
    private int field_K;
    private int field_r;
    private int field_O;
    private int field_V;
    private dm field_F;
    private m field_Q;
    private dm[] field_s;
    private int field_db;
    private int field_x;
    private dm field_Z;
    private int field_z;
    private boolean field_N;
    static boolean field_I;
    private int field_ab;
    static String field_R;
    static String field_y;
    private dm field_u;
    private int field_G;
    private int field_U;
    private dm field_M;
    private boolean field_W;
    private int field_w;

    private final void a(int param0, mi param1) {
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != null) {
            if (param1.field_K != -2147483648) {
              this.field_K = param1.field_K;
            }
            if (-1 != (param1.field_x ^ -1)) {
              this.field_x = param1.field_x;
            }
            if (null != param1.field_F) {
              this.field_F = param1.field_F;
            }
            if (param1.field_A != 0) {
              this.field_A = param1.field_A;
            }
            if (-2147483648 != param1.field_J) {
              this.field_J = param1.field_J;
            }
            if (param1.field_M != null) {
              this.field_M = param1.field_M;
            }
            if (0 != param1.field_z) {
              this.field_z = param1.field_z;
            }
            if (param1.field_Z != null) {
              this.field_Z = param1.field_Z;
            }
            if (null != param1.field_Y) {
              this.field_Y = param1.field_Y;
            }
            if (param1.field_r != -2147483648) {
              this.field_r = param1.field_r;
            }
            if (param1.field_H != null) {
              this.field_H = param1.field_H;
            }
            if (-2147483648 != param1.field_T) {
              this.field_T = param1.field_T;
            }
            if ((param1.field_w ^ -1) != 2147483647) {
              this.field_w = param1.field_w;
            }
            if (param1.field_N) {
              this.field_N = param1.field_N;
            }
            if (param1.field_p != null) {
              this.field_p = param1.field_p;
            }
            if (-257 != (param1.field_t ^ -1)) {
              this.field_t = param1.field_t;
            }
            if (param1.field_cb >= 0) {
              this.field_cb = param1.field_cb;
            }
            if (!param1.field_S) {
              this.field_S = param1.field_S;
            }
            if (0 != param1.field_V) {
              this.field_V = param1.field_V;
            }
            if (null != param1.field_s) {
              this.field_s = param1.field_s;
            }
            if (null != param1.field_X) {
              this.field_X = param1.field_X;
            }
            if (param1.field_U != 0) {
              this.field_U = param1.field_U;
            }
            if (param1.field_fb != null) {
              this.field_fb = param1.field_fb;
            }
            if (0 <= param1.field_bb) {
              this.field_bb = param1.field_bb;
            }
            if (0 != param1.field_v) {
              this.field_v = param1.field_v;
            }
            if (null != param1.field_u) {
              this.field_u = param1.field_u;
            }
            if (param1.field_eb != null) {
              this.field_eb = param1.field_eb;
            }
            if (-1 >= (param1.field_G ^ -1)) {
              this.field_G = param1.field_G;
            }
            if (param1.field_L) {
              this.field_L = param1.field_L;
            }
            if (param1.field_db != -2147483648) {
              this.field_db = param1.field_db;
            }
            if (param1.field_P) {
              this.field_P = param1.field_P;
            }
            if (null != param1.field_D) {
              this.field_D = param1.field_D;
            }
            if (param1.field_Q != null) {
              this.field_Q = param1.field_Q;
            }
            if (0 != param1.field_O) {
              this.field_O = param1.field_O;
            }
            if (param1.field_q) {
              this.field_q = param1.field_q;
            }
            if (0 <= param1.field_ab) {
              this.field_ab = param1.field_ab;
            }
            if (param1.field_W) {
              this.field_W = param1.field_W;
            }
          }
          if (param0 != -2147483648) {
            field_B = (dm[]) null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_100_0 = (RuntimeException) (var3);

          stackIn_100_1 = new StringBuilder().append("mi.B(").append(param0).append(',');

          if (param1 == null) {
            stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
            stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
            stackIn_101_2 = "null";
          } else {
            stackIn_101_0 = (RuntimeException) ((Object) stackIn_100_0);
            stackIn_101_1 = (StringBuilder) ((Object) stackIn_100_1);
            stackIn_101_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_101_2).append(')').toString());
        }
    }

    mi(long param0, mi param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    public static void b(boolean param0) {
        field_R = null;
        if (param0) {
            return;
        }
        field_E = null;
        field_y = null;
        field_B = null;
    }

    private mi(long param0, mi param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_bb = -1;
        this.field_t = 256;
        this.field_T = -2147483648;
        this.field_S = true;
        this.field_K = -2147483648;
        this.field_J = -2147483648;
        this.field_ab = -1;
        this.field_cb = -1;
        this.field_G = -1;
        this.field_db = -2147483648;
        this.field_q = false;
        this.field_r = -2147483648;
        this.field_w = -2147483648;
        try {
          this.field_a = param0;
          this.a(-2147483648, param1);
          if (param6 != null) {
            this.field_X = param6;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (runtimeException);

          stackIn_6_1 = new StringBuilder().append("mi.<init>(").append(param0).append(',');

          if (param1 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "{...}";
          }


          stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

          if (param6 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_E = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_y = "Continue";
        field_I = false;
        field_R = "Connection lost. <%0>";
    }
}
