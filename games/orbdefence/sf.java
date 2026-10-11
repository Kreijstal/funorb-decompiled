/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sf extends ie {
    private int field_w;
    private hj field_D;
    private int field_R;
    private int field_x;
    private int field_n;
    static int[] field_K;
    private int field_E;
    private int field_X;
    private int field_y;
    private hj field_v;
    private String field_N;
    private boolean field_l;
    private hj[] field_B;
    static ki field_q;
    private hj field_S;
    static int field_O;
    private hj[] field_J;
    private int field_H;
    private int field_s;
    private boolean field_U;
    private int field_m;
    private hj[] field_V;
    private hj[] field_t;
    private int field_p;
    private hj field_C;
    private int field_z;
    private kc field_A;
    private int field_Q;
    private int field_I;
    private boolean field_o;
    static int field_T;
    private int field_L;
    private int field_G;
    private hj field_M;
    private int field_u;
    private String field_r;
    private boolean field_Y;
    private int field_W;
    private hj[] field_k;
    private boolean field_P;
    private boolean field_F;

    sf(long param0, sf param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static wa a(String param0, ki param1, int param2, String param3, ki param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        wa stackIn_2_0 = null;
        wa stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param4.a(param0, 0);
          var6 = param4.a(param3, 5187, var5_int);
          if (param2 == -1) {
            stackIn_4_0 = pf.a(var5_int, -6, param1, param4, var6);
            return stackIn_4_0;
          }
          stackIn_2_0 = (wa) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("sf.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static StringBuilder a(int param0, StringBuilder param1, char param2, byte param3) {
        int var6 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var7 = 0;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          var5 = -73 / ((param3 + 32) / 42);
          var4_int = param1.length();
          param1.setLength(param0);
          for (var6 = var4_int; param0 > var6; var6++) {
            param1.setCharAt(var6, param2);
          }
          stackIn_5_0 = (StringBuilder) (param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("sf.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(sf param0, byte param1) {
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > -111) {
            this.field_l = true;
          }
          if (param0 != null) {
            if (param0.field_R != 0) {
              this.field_R = param0.field_R;
            }
            if (param0.field_D != null) {
              this.field_D = param0.field_D;
            }
            if (param0.field_o) {
              this.field_o = param0.field_o;
            }
            if (param0.field_L != 0) {
              this.field_L = param0.field_L;
            }
            if (!param0.field_P) {
              this.field_P = param0.field_P;
            }
            if (param0.field_U) {
              this.field_U = param0.field_U;
            }
            if (param0.field_v != null) {
              this.field_v = param0.field_v;
            }
            if (0 != param0.field_p) {
              this.field_p = param0.field_p;
            }
            if (null != param0.field_N) {
              this.field_N = param0.field_N;
            }
            if (param0.field_H != -2147483648) {
              this.field_H = param0.field_H;
            }
            if (param0.field_G >= 0) {
              this.field_G = param0.field_G;
            }
            if (param0.field_X != 0) {
              this.field_X = param0.field_X;
            }
            if (param0.field_z >= 0) {
              this.field_z = param0.field_z;
            }
            if (param0.field_k != null) {
              this.field_k = param0.field_k;
            }
            if (null != param0.field_V) {
              this.field_V = param0.field_V;
            }
            if (null != param0.field_B) {
              this.field_B = param0.field_B;
            }
            if (param0.field_y != 0) {
              this.field_y = param0.field_y;
            }
            if (param0.field_l) {
              this.field_l = param0.field_l;
            }
            if (param0.field_m >= 0) {
              this.field_m = param0.field_m;
            }
            if (null != param0.field_t) {
              this.field_t = param0.field_t;
            }
            if (param0.field_I != 0) {
              this.field_I = param0.field_I;
            }
            if (param0.field_F) {
              this.field_F = param0.field_F;
            }
            if (null != param0.field_M) {
              this.field_M = param0.field_M;
            }
            if (param0.field_J != null) {
              this.field_J = param0.field_J;
            }
            if (param0.field_Q != -2147483648) {
              this.field_Q = param0.field_Q;
            }
            if (param0.field_E != 256) {
              this.field_E = param0.field_E;
            }
            if (param0.field_W != -2147483648) {
              this.field_W = param0.field_W;
            }
            if (param0.field_n >= 0) {
              this.field_n = param0.field_n;
            }
            if (param0.field_C != null) {
              this.field_C = param0.field_C;
            }
            if (param0.field_w != -2147483648) {
              this.field_w = param0.field_w;
            }
            if (-2147483648 != param0.field_s) {
              this.field_s = param0.field_s;
            }
            if (param0.field_u != 0) {
              this.field_u = param0.field_u;
            }
            if (null != param0.field_S) {
              this.field_S = param0.field_S;
            }
            if (null != param0.field_r) {
              this.field_r = param0.field_r;
            }
            if (param0.field_A != null) {
              this.field_A = param0.field_A;
            }
            if (param0.field_x != -2147483648) {
              this.field_x = param0.field_x;
            }
            if (param0.field_Y) {
              this.field_Y = param0.field_Y;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_99_0 = var3;
          stackIn_99_1 = new StringBuilder().append("sf.G(");
          if (param0 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_99_0), ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 != 7) {
          StringBuilder var2 = (StringBuilder) null;
          sf.a(-50, (StringBuilder) null, '}', (byte) -73);
        }
        field_q = null;
        field_K = null;
    }

    private sf(long param0, sf param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_x = -2147483648;
        this.field_H = -2147483648;
        this.field_m = -1;
        this.field_w = -2147483648;
        this.field_n = -1;
        this.field_Q = -2147483648;
        this.field_E = 256;
        this.field_z = -1;
        this.field_U = false;
        this.field_G = -1;
        this.field_s = -2147483648;
        this.field_W = -2147483648;
        this.field_P = true;
        try {
          this.field_d = param0;
          this.a(param1, (byte) -117);
          if (param6 != null) {
            this.field_r = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "sf.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = new int[4];
        field_O = 9;
    }
}
