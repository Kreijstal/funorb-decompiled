/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    short[] field_a;
    short field_s;
    short[] field_q;
    int[] field_n;
    short[] field_J;
    short field_R;
    int[] field_r;
    short[] field_x;
    static cg field_t;
    int[] field_j;
    int[] field_f;
    int[] field_i;
    static String field_l;
    int[] field_g;
    short[] field_N;
    short[] field_e;
    short[] field_b;
    short[] field_I;
    short[] field_c;
    byte[] field_u;
    int field_M;
    int field_p;
    int[] field_h;
    short[] field_z;
    private boolean field_H;
    static String[] field_d;
    int field_v;
    short[] field_K;
    int[] field_C;
    short[] field_o;
    int field_w;
    byte field_O;
    short[] field_m;
    static int field_B;
    short[] field_G;
    short[] field_y;
    short field_P;
    int field_F;
    short[] field_A;
    int[] field_E;
    short[] field_D;
    short[] field_Q;
    static String field_L;
    int field_k;

    final static String a(ue param0, String param1, String param2, byte param3) {
        RuntimeException var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 >= -102) {
            field_d = (String[]) null;
          }
          if (!param0.b((byte) 96)) {
            stackIn_5_0 = (String) (param2);
            return stackIn_5_0;
          }
          stackIn_7_0 = param1 + " - " + param0.a((byte) 120) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("lb.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, String[] param1, String param2, qe param3, int param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var6Lifetime1;
        try {
          var5_int = param3.a(param2);
          if (param0 >= var5_int &&
            param2.indexOf("<br>") == -1) {
            param1[0] = param2;
            stackIn_3_0 = 1;
            return stackIn_3_0;
          }
          var6 = (param0 + (var5_int - 1)) / param0;
          param0 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          if (param4 > -58) {
            field_l = (String) null;
          }
          var8 = param2.length();
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param2.charAt(var9);
            if (var10 == 32 ||
              45 == var10) {
              var11 = param2.substring(var7, var9 + 1).trim();
              var12 = param3.a(var11);
              if (var12 >= param0) {
                var7 = 1 + var9;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param1[incrementValue$1] = var11;
              }
            }
            if (62 == var10 &&
              param2.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param1[incrementValue$2] = param2.substring(var7, -3 + var9).trim();
              var7 = 1 + var9;
            }
          }
          if (var7 < var8) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param1[incrementValue$0] = param2.substring(var7, var8).trim();
          }
          stackIn_24_0 = var6Lifetime1;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("lb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(nh param0, qe param1, int param2, String param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = StarCannon.field_A;
        try {
          var5_int = 0;
          var6 = -1;
          if (param2 != 3853) {
            return;
          }
          for (var7 = 1; var7 < param3.length(); var7++) {
            var8 = param3.charAt(var7);
            if (var8 == 60) {
              var6 = param0.field_d[0] + ((var5_int >> 8) + param1.a(param3.substring(0, var7)));
            }
            if (var6 == -1) {
              if (var8 == 32) {
                var5_int = var5_int + param4;
              }
              param0.field_d[var7] = param0.field_d[0] + (var5_int >> 8) - (-param1.a(param3.substring(0, 1 + var7)) + param1.a((char) var8));
            } else {
              param0.field_d[var7] = var6;
            }
            if (62 == var8) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("lb.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(')').toString());
        }
    }

    final void c(byte param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        var12 = StarCannon.field_A;
        if (this.field_H) {
          return;
        }
        this.field_H = true;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; this.field_R > var8; var8++) {
          var9 = this.field_J[var8];
          var10 = this.field_x[var8];
          if (var6 < var10) {
            var6 = var10;
          }
          if (var9 > var5) {
            var5 = var9;
          }
          var11 = this.field_q[var8];
          if (var3 > var10) {
            var3 = var10;
          }
          if (var2 > var9) {
            var2 = var9;
          }
          if (var7 < var11) {
            var7 = var11;
          }
          if (var4 > var11) {
            var4 = var11;
          }
        }
        this.field_p = var2;
        this.field_w = var6;
        this.field_F = var3;
        this.field_M = var5;
        if (param0 != -3) {
          field_l = (String) null;
        }
        this.field_k = var4;
        this.field_v = var7;
    }

    final static hd b(byte param0) {
        if (param0 != -127) {
          lb.a(-62);
        }
        if (null == d.field_l) {
          d.field_l = new hd(nb.field_b, 20, 0, 0, 0, 11579568, -1, 0, 0, nb.field_b.field_p, -1, 2147483647, true);
        }
        return d.field_l;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = StarCannon.field_A;
        for (var6 = 0; this.field_R > var6; var6++) {
          this.field_J[var6] = (short)(param2 * this.field_J[var6] / param0);
          this.field_x[var6] = (short)(param1 * this.field_x[var6] / param0);
          this.field_q[var6] = (short)(this.field_q[var6] * param3 / param0);
        }
        if (param4 != -72) {
          this.a(-86, 117, (byte) 99, 54);
        }
        this.b(param4 + 153);
    }

    private final void b(int param0) {
        if (param0 <= 48) {
          this.b(83);
        }
        this.field_H = false;
    }

    public static void a(byte param0) {
        if (param0 != -49) {
          String var2 = (String) null;
          lb.a((nh) null, (qe) null, -33, (String) null, -39);
        }
        field_d = null;
        field_l = null;
        field_L = null;
        field_t = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = StarCannon.field_A;
        if (param2 != -30) {
          this.field_H = true;
        }
        for (var5 = 0; this.field_R > var5; var5++) {
          this.field_J[var5] = (short)(this.field_J[var5] + param0);
          this.field_x[var5] = (short)(this.field_x[var5] + param3);
          this.field_q[var5] = (short)(this.field_q[var5] + param1);
        }
        this.b(104);
    }

    final static String a(int param0) {
        if (!eg.field_h && di.field_m >= le.field_a &&
          !(hf.field_l + le.field_a <= di.field_m)) {
          return sc.field_c;
        }
        int var1 = 68 % ((-45 - param0) / 62);
        return null;
    }

    lb() {
        this.field_O = (byte) 0;
        this.field_H = false;
    }

    static {
        field_l = "MEDIUM";
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
