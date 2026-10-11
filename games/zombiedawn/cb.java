/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cb extends ce {
    private int field_L;
    private vn[] field_D;
    private int field_Y;
    private vn field_A;
    private boolean field_H;
    private vn field_F;
    private int field_S;
    private int field_K;
    private int field_P;
    private boolean field_E;
    private vn[] field_y;
    private String field_O;
    private rb field_bb;
    private boolean field_cb;
    private int field_J;
    private int field_x;
    static int[] field_N;
    private int field_V;
    private int field_Q;
    private vn field_R;
    private int field_fb;
    private int field_gb;
    private vn field_C;
    private boolean field_X;
    private int field_T;
    private boolean field_eb;
    private String field_Z;
    private int field_M;
    private boolean field_w;
    private vn[] field_db;
    private int field_z;
    private vn field_B;
    private int field_ab;
    private vn[] field_G;
    private int field_U;
    private int field_I;
    private int field_W;
    private vn[] field_hb;

    final static boolean a(int param0, char param1) {
        boolean stackIn_9_0 = false;
        if (param0 < 59) {
          return false;
        }
        stackIn_9_0 = ((!(65 > param1) &&
          !(param1 > 90)) ||
          (!(param1 < 97) &&
          !(param1 > 122)));
        return stackIn_9_0;
    }

    public static void e(int param0) {
        field_N = null;
        if (param0 < 65) {
          cb.a(-56, 'N');
        }
    }

    final static String f(int param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = ZombieDawn.field_J;
        if (param0 != 3) {
          cb.a(39, '￾');
        }
        var6 = "(" + em.field_U + " " + wb.field_t + " " + e.field_P + ") " + l.field_d;
        var1 = var6;
        if (jd.field_b > 0) {
          var1 = var6 + ":";
          for (var2 = 0; jd.field_b > var2; var2++) {
            var7 = var1 + ' ';
            var3 = fj.field_g.field_h[var2] & 255;
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 >= 10) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            if (10 <= var3) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var8 = var7 + (char)var4;
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    cb(long param0, cb param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(int param0, cb param1) {
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != null) {
            if (param1.field_F != null) {
              this.field_F = param1.field_F;
            }
            if (null != param1.field_G) {
              this.field_G = param1.field_G;
            }
            if (-2147483648 != param1.field_M) {
              this.field_M = param1.field_M;
            }
            if (null != param1.field_bb) {
              this.field_bb = param1.field_bb;
            }
            if (param1.field_D != null) {
              this.field_D = param1.field_D;
            }
            if (param1.field_gb != -2147483648) {
              this.field_gb = param1.field_gb;
            }
            if (param1.field_w) {
              this.field_w = param1.field_w;
            }
            if (null != param1.field_A) {
              this.field_A = param1.field_A;
            }
            if (!param1.field_X) {
              this.field_X = param1.field_X;
            }
            if (param1.field_E) {
              this.field_E = param1.field_E;
            }
            if (-2147483648 != param1.field_Q) {
              this.field_Q = param1.field_Q;
            }
            if (param1.field_O != null) {
              this.field_O = param1.field_O;
            }
            if (param1.field_T != 0) {
              this.field_T = param1.field_T;
            }
            if (param1.field_H) {
              this.field_H = param1.field_H;
            }
            if (param1.field_Y != 0) {
              this.field_Y = param1.field_Y;
            }
            if (param1.field_Z != null) {
              this.field_Z = param1.field_Z;
            }
            if (param1.field_K >= 0) {
              this.field_K = param1.field_K;
            }
            if (param1.field_ab != 0) {
              this.field_ab = param1.field_ab;
            }
            if (0 != param1.field_fb) {
              this.field_fb = param1.field_fb;
            }
            if (null != param1.field_R) {
              this.field_R = param1.field_R;
            }
            if (param1.field_cb) {
              this.field_cb = param1.field_cb;
            }
            if (null != param1.field_B) {
              this.field_B = param1.field_B;
            }
            if (param1.field_db != null) {
              this.field_db = param1.field_db;
            }
            if (param1.field_eb) {
              this.field_eb = param1.field_eb;
            }
            if (null != param1.field_y) {
              this.field_y = param1.field_y;
            }
            if (-2147483648 != param1.field_V) {
              this.field_V = param1.field_V;
            }
            if (param1.field_z != -2147483648) {
              this.field_z = param1.field_z;
            }
            if (param1.field_U != 0) {
              this.field_U = param1.field_U;
            }
            if (null != param1.field_hb) {
              this.field_hb = param1.field_hb;
            }
            if (256 != param1.field_x) {
              this.field_x = param1.field_x;
            }
            if (param1.field_L != 0) {
              this.field_L = param1.field_L;
            }
            if (param1.field_S != -2147483648) {
              this.field_S = param1.field_S;
            }
            if (0 <= param1.field_J) {
              this.field_J = param1.field_J;
            }
            if (0 <= param1.field_I) {
              this.field_I = param1.field_I;
            }
            if (null != param1.field_C) {
              this.field_C = param1.field_C;
            }
            if (0 <= param1.field_W) {
              this.field_W = param1.field_W;
            }
            if (param1.field_P != 0) {
              this.field_P = param1.field_P;
            }
          }
          if (param0 != -2147483648) {
            this.field_D = (vn[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_97_0 = var3;
          stackIn_97_1 = new StringBuilder().append("cb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_97_0), ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(')').toString());
        }
    }

    private cb(long param0, cb param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_K = -1;
        this.field_S = -2147483648;
        this.field_x = 256;
        this.field_Q = -2147483648;
        this.field_V = -2147483648;
        this.field_gb = -2147483648;
        this.field_M = -2147483648;
        this.field_J = -1;
        this.field_H = false;
        this.field_X = true;
        this.field_I = -1;
        this.field_z = -2147483648;
        this.field_W = -1;
        try {
          this.field_f = param0;
          this.a(-2147483648, param1);
          if (param6 != null) {
            this.field_Z = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "cb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_N = new int[]{1, 2, 3, 5, 5, 3, 5, 5, 1, 3, 5, 10, 5, 5, 2, 1, 3, 3, 3, 2, 2, 2, 3, 1, 5, 2, 3, 5, 10, 2, 2, 2};
    }
}
