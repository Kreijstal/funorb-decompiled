/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kj extends cj {
    private boolean field_p;
    private kc field_V;
    private kc[] field_Q;
    private int field_K;
    private kc field_A;
    private int field_I;
    private int field_u;
    private int field_E;
    private int field_H;
    private boolean field_o;
    private static long[] field_z;
    private kc field_x;
    private int field_U;
    private int field_D;
    private int field_S;
    private kc[] field_w;
    static String field_q;
    private kc field_N;
    private boolean field_C;
    private int field_J;
    private int field_bb;
    private String field_Z;
    private boolean field_s;
    private boolean field_v;
    static int field_t;
    private kc field_B;
    private boolean field_F;
    private int field_r;
    private ee field_Y;
    private int field_ab;
    private kc[] field_T;
    private int field_R;
    private int field_G;
    private int field_n;
    private kc[] field_L;
    private String field_O;
    private kc[] field_X;
    static boolean field_P;
    private int field_M;
    private int field_W;
    private int field_y;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        sa.field_d = param1;
        mg.field_q = param4;
        if (param3 > -79) {
          return;
        }
        tl.field_b = param2;
        sj.field_c = param0;
    }

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Main.field_T;
        var2 = 0;
        var3 = h.field_F;
        if (var3 >= 5) {
          if (105 <= var3) {
            if (120 > var3) {
              var3 = -var3 + 120;
              var2 = 8192 - 8192 * var3 * var3 / 3300;
            }
          } else {
            var2 = (var3 * 16384 - 40960) / 220;
          }
        } else {
          var2 = var3 * (var3 * 8192) / 1100;
        }
        if (param0 != 104) {
          field_q = (String) null;
        }
        var4 = 1;
        var5 = 0;
        if (param1 == 3) {
          var4 = -1;
        }
        if (param1 == 1) {
          var5 = 1;
        }
        if (4 == param1) {
          var4 = 1;
          var5 = 1;
        }
        if (param1 == 5) {
          var4 = -1;
          var5 = 1;
        }
        if (param1 == 6) {
          var5 = -1;
          var4 = 1;
        }
        if (param1 == 7 ||
          param1 == 8) {
          var5 = -1;
          var4 = -1;
        }
        if (11 == param1) {
          var4 = -1;
        }
        if (param1 == 12) {
          var4 = -1;
          var5 = -1;
        }
        if (param1 == 13) {
          var5 = -1;
          var4 = 1;
        }
        if (param1 == 14) {
          var4 = -1;
          var5 = 1;
        }
        if (param1 == 15) {
          var4 = 1;
          var5 = 1;
        }
        nl.field_c = lf.a(var2 * var4, var5 * var2, true);
    }

    private final void a(kj param0, int param1) {
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != null) {
            if (param0.field_H >= 0) {
              this.field_H = param0.field_H;
            }
            if (0 != param0.field_J) {
              this.field_J = param0.field_J;
            }
            if (param0.field_w != null) {
              this.field_w = param0.field_w;
            }
            if (param0.field_U != 0) {
              this.field_U = param0.field_U;
            }
            if (null != param0.field_L) {
              this.field_L = param0.field_L;
            }
            if (null != param0.field_Q) {
              this.field_Q = param0.field_Q;
            }
            if (param0.field_y >= 0) {
              this.field_y = param0.field_y;
            }
            if (param0.field_B != null) {
              this.field_B = param0.field_B;
            }
            if (param0.field_o) {
              this.field_o = param0.field_o;
            }
            if (!param0.field_C) {
              this.field_C = param0.field_C;
            }
            if (param0.field_M != -2147483648) {
              this.field_M = param0.field_M;
            }
            if (null != param0.field_X) {
              this.field_X = param0.field_X;
            }
            if (param0.field_p) {
              this.field_p = param0.field_p;
            }
            if (param0.field_n >= 0) {
              this.field_n = param0.field_n;
            }
            if (param0.field_T != null) {
              this.field_T = param0.field_T;
            }
            if (param0.field_W != -2147483648) {
              this.field_W = param0.field_W;
            }
            if (param0.field_Z != null) {
              this.field_Z = param0.field_Z;
            }
            if (param0.field_s) {
              this.field_s = param0.field_s;
            }
            if (param0.field_v) {
              this.field_v = param0.field_v;
            }
            if (param0.field_r != -2147483648) {
              this.field_r = param0.field_r;
            }
            if (0 != param0.field_u) {
              this.field_u = param0.field_u;
            }
            if (null != param0.field_A) {
              this.field_A = param0.field_A;
            }
            if (param0.field_R != 0) {
              this.field_R = param0.field_R;
            }
            if (param0.field_D != 0) {
              this.field_D = param0.field_D;
            }
            if (param0.field_V != null) {
              this.field_V = param0.field_V;
            }
            if (param0.field_I != 0) {
              this.field_I = param0.field_I;
            }
            if (-2147483648 != param0.field_S) {
              this.field_S = param0.field_S;
            }
            if (param0.field_Y != null) {
              this.field_Y = param0.field_Y;
            }
            if (param0.field_O != null) {
              this.field_O = param0.field_O;
            }
            if (-2147483648 != param0.field_K) {
              this.field_K = param0.field_K;
            }
            if (0 != param0.field_E) {
              this.field_E = param0.field_E;
            }
            if (param0.field_x != null) {
              this.field_x = param0.field_x;
            }
            if (param0.field_N != null) {
              this.field_N = param0.field_N;
            }
            if (param0.field_G >= 0) {
              this.field_G = param0.field_G;
            }
            if (param0.field_F) {
              this.field_F = param0.field_F;
            }
            if (param0.field_ab != -2147483648) {
              this.field_ab = param0.field_ab;
            }
            if (param0.field_bb != 256) {
              this.field_bb = param0.field_bb;
            }
          }
          if (param1 != 1) {
            kj.a(-106, 57, -95, 68, -64);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_100_0 = var3;
          stackIn_100_1 = new StringBuilder().append("kj.F(");
          if (param0 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_q = null;
        if (param0 != 45) {
          field_q = (String) null;
        }
        field_z = null;
    }

    kj(long param0, kj param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private kj(long param0, kj param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_K = -2147483648;
        this.field_p = false;
        this.field_S = -2147483648;
        this.field_bb = 256;
        this.field_ab = -2147483648;
        this.field_C = true;
        this.field_n = -1;
        this.field_H = -1;
        this.field_M = -2147483648;
        this.field_r = -2147483648;
        this.field_W = -2147483648;
        this.field_y = -1;
        this.field_G = -1;
        try {
          this.field_e = param0;
          this.a(param1, 1);
          if (param6 != null) {
            this.field_Z = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "kj.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_z = new long[256];
        field_q = "Logging in...";
        for (var2 = 0; 256 > var2; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((var0 & 1L) != 1L) {
              var0 = var0 >>> 1;
            } else {
              var0 = var0 >>> 1 ^ -3932672073523589310L;
            }
          }
          field_z[var2] = var0;
        }
    }
}
