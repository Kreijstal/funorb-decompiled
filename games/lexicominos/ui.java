/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ui extends cf {
    private int field_ab;
    private int field_bb;
    private boolean field_M;
    private int field_p;
    private int field_X;
    private int field_Q;
    private db[] field_W;
    private int field_q;
    static int[] field_D;
    private db[] field_N;
    private int field_y;
    private db field_F;
    private int field_u;
    private db field_Y;
    private String field_r;
    private int field_J;
    private db[] field_x;
    private db[] field_E;
    private db field_V;
    private int field_z;
    private int field_I;
    private db field_B;
    private int field_cb;
    static String field_w;
    private int field_C;
    private db[] field_T;
    private int field_H;
    private boolean field_s;
    private int field_L;
    private boolean field_P;
    private le field_K;
    private int field_S;
    private int field_v;
    private db field_t;
    private boolean field_Z;
    private boolean field_A;
    private boolean field_U;
    private String field_O;
    private int field_G;

    final static tf a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        tf var5 = null;
        tf stackIn_4_0 = null;
        tf stackIn_8_0 = null;
        tf stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() != 0) {
            var2_int = param1.indexOf('@');
            if (var2_int == -1) {
              stackIn_8_0 = w.field_k;
              return stackIn_8_0;
            }
            if (param0 != -100) {
              field_w = (String) null;
            }
            var3 = param1.substring(0, var2_int);
            var4 = param1.substring(1 + var2_int);
            var5 = ah.a(var3, (byte) 111);
            if (var5 == null) {
              return e.a(var4, -101);
            }
            stackIn_14_0 = var5;
            return stackIn_14_0;
          }
          stackIn_4_0 = fd.field_e;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("ui.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static boolean a(String param0, String param1, byte param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (sh.d(param1, (byte) 50)) {
            return false;
          }
          if (hd.a(param1, 17)) {
            return false;
          }
          if (ph.a((byte) 107, param1)) {
            return false;
          }
          if (param0.length() == 0) {
            return true;
          }
          if (bi.a((byte) -126, param0, param1)) {
            return false;
          }
          if (pd.a(param0, param1, 95)) {
            return false;
          }
          if (param2 != -118) {
            return false;
          }
          if (!ni.a((byte) 120, param1, param0)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("ui.V(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(')').toString());
        }
    }

    final static wf a(int param0, byte[] param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        wf var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var7 = 0;
        wf stackIn_3_0 = null;
        wf stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Lexicominos.field_L ? 1 : 0;
        try {
          var3 = new wf(param1.length);
          var4 = param1.length / param0;
          if (param2 != -29165) {
            stackIn_3_0 = (wf) null;
            return stackIn_3_0;
          }
          for (var5 = 0; var4 > var5; var5++) {
            for (var6 = 0; param0 > var6; var6++) {
              var3.field_j[var6 * var4 + var5] = param1[param0 * var5 + var6];
            }
          }
          var3.field_h = param1.length;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("ui.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void d(int param0) {
        vg.a(113);
        ni.a(param0 ^ -122, param0);
    }

    private final void a(byte param0, ui param1) {
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        byte[] var4 = null;
        try {
          if (param1 != null) {
            if (0 != param1.field_ab) {
              this.field_ab = param1.field_ab;
            }
            if (param1.field_U) {
              this.field_U = param1.field_U;
            }
            if (param1.field_z != 256) {
              this.field_z = param1.field_z;
            }
            if (param1.field_W != null) {
              this.field_W = param1.field_W;
            }
            if (null != param1.field_x) {
              this.field_x = param1.field_x;
            }
            if (-2147483648 != param1.field_y) {
              this.field_y = param1.field_y;
            }
            if (param1.field_q >= 0) {
              this.field_q = param1.field_q;
            }
            if (param1.field_X != 0) {
              this.field_X = param1.field_X;
            }
            if (param1.field_r != null) {
              this.field_r = param1.field_r;
            }
            if (param1.field_bb != -2147483648) {
              this.field_bb = param1.field_bb;
            }
            if (-2147483648 != param1.field_J) {
              this.field_J = param1.field_J;
            }
            if (param1.field_u != -2147483648) {
              this.field_u = param1.field_u;
            }
            if (null != param1.field_E) {
              this.field_E = param1.field_E;
            }
            if (null != param1.field_N) {
              this.field_N = param1.field_N;
            }
            if (param1.field_v != 0) {
              this.field_v = param1.field_v;
            }
            if (param1.field_K != null) {
              this.field_K = param1.field_K;
            }
            if (param1.field_G != 0) {
              this.field_G = param1.field_G;
            }
            if (param1.field_F != null) {
              this.field_F = param1.field_F;
            }
            if (0 != param1.field_Q) {
              this.field_Q = param1.field_Q;
            }
            if (null != param1.field_B) {
              this.field_B = param1.field_B;
            }
            if (param1.field_V != null) {
              this.field_V = param1.field_V;
            }
            if (param1.field_S != 0) {
              this.field_S = param1.field_S;
            }
            if (param1.field_Z) {
              this.field_Z = param1.field_Z;
            }
            if (param1.field_s) {
              this.field_s = param1.field_s;
            }
            if (param1.field_A) {
              this.field_A = param1.field_A;
            }
            if (null != param1.field_O) {
              this.field_O = param1.field_O;
            }
            if (-2147483648 != param1.field_H) {
              this.field_H = param1.field_H;
            }
            if (param1.field_cb != -2147483648) {
              this.field_cb = param1.field_cb;
            }
            if (0 <= param1.field_C) {
              this.field_C = param1.field_C;
            }
            if (0 <= param1.field_I) {
              this.field_I = param1.field_I;
            }
            if (param1.field_P) {
              this.field_P = param1.field_P;
            }
            if (param1.field_L != 0) {
              this.field_L = param1.field_L;
            }
            if (param1.field_p >= 0) {
              this.field_p = param1.field_p;
            }
            if (param1.field_Y != null) {
              this.field_Y = param1.field_Y;
            }
            if (!param1.field_M) {
              this.field_M = param1.field_M;
            }
            if (param1.field_t != null) {
              this.field_t = param1.field_t;
            }
            if (null != param1.field_T) {
              this.field_T = param1.field_T;
            }
          }
          if (param0 != -74) {
            var4 = (byte[]) null;
            ui.a(-111, (byte[]) null, 17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_99_0 = var3;
          stackIn_99_1 = new StringBuilder().append("ui.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_99_0), ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(')').toString());
        }
    }

    ui(long param0, ui param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    public static void e(int param0) {
        field_D = null;
        if (param0 != -1) {
          return;
        }
        field_w = null;
    }

    private ui(long param0, ui param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_p = -1;
        this.field_J = -2147483648;
        this.field_bb = -2147483648;
        this.field_z = 256;
        this.field_I = -1;
        this.field_H = -2147483648;
        this.field_C = -1;
        this.field_y = -2147483648;
        this.field_cb = -2147483648;
        this.field_M = true;
        this.field_q = -1;
        this.field_u = -2147483648;
        this.field_s = false;
        try {
          this.field_d = param0;
          this.a((byte) -74, param1);
          if (param6 != null) {
            this.field_O = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "ui.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
