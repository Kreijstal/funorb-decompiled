/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sr {
    int[] field_a;
    int[] field_c;
    byte field_o;
    short[] field_P;
    short[] field_g;
    short[] field_M;
    short[] field_b;
    short[] field_C;
    short[] field_w;
    short[] field_s;
    short[] field_v;
    short[] field_y;
    short field_x;
    short[] field_I;
    short[] field_z;
    int[] field_Q;
    byte[] field_p;
    static bi field_F;
    int[] field_H;
    short[] field_B;
    short field_u;
    short[] field_i;
    int field_k;
    int[] field_K;
    int field_E;
    short[] field_f;
    int[] field_m;
    int field_t;
    int field_j;
    int field_r;
    int[] field_l;
    static int field_q;
    short field_e;
    private boolean field_d;
    int[] field_D;
    short[] field_L;
    int[] field_A;
    short[] field_J;
    short[] field_n;
    short[] field_G;
    static boolean field_h;
    static String field_N;
    int field_O;

    private final void a(int param0) {
        this.field_d = false;
        if (param0 < 102) {
          String var3 = (String) null;
          sr.a((String) null, 127, (byte) 99, -16, (String) null, (String) null, false);
        }
    }

    final static int a(String param0, int param1, byte param2, int param3, String param4, String param5, boolean param6) {
        e var7 = null;
        RuntimeException var7_ref = null;
        e var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new e(param0);
          if (param2 > -38) {
            stackIn_2_0 = -102;
            return stackIn_2_0;
          }
          var8 = new e(param5);
          stackIn_4_0 = si.a(param1, param3, var8, var7, 125, param4, param6);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_7_0 = var7_ref;
          stackIn_7_1 = new StringBuilder().append("sr.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param3 != 32767) {
          String var7 = (String) null;
          sr.a(71, (String) null);
        }
        for (var5 = 0; this.field_x > var5; var5++) {
          this.field_w[var5] = (short)(this.field_w[var5] + param1);
          this.field_z[var5] = (short)(this.field_z[var5] + param2);
          this.field_f[var5] = (short)(this.field_f[var5] + param0);
        }
        this.a(107);
    }

    public static void a(byte param0) {
        int var1 = 19 % ((24 - param0) / 60);
        field_N = null;
        field_F = null;
    }

    final void a(boolean param0) {
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
        boolean stackIn_5_1 = false;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_d) {
          return;
        }
        stackIn_5_1 = (param0);
        this.field_d = stackIn_5_1;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; var8 < this.field_x; var8++) {
          var9 = this.field_w[var8];
          var10 = this.field_z[var8];
          if (var2 > var9) {
            var2 = var9;
          }
          if (var9 > var5) {
            var5 = var9;
          }
          if (var6 < var10) {
            var6 = var10;
          }
          if (var10 < var3) {
            var3 = var10;
          }
          var11 = this.field_f[var8];
          if (var4 > var11) {
            var4 = var11;
          }
          if (var7 < var11) {
            var7 = var11;
          }
        }
        this.field_k = var2;
        this.field_t = var6;
        this.field_j = var3;
        this.field_E = var4;
        this.field_O = var5;
        this.field_r = var7;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var6 = 0; var6 < this.field_x; var6++) {
          this.field_w[var6] = (short)(param2 * this.field_w[var6] / param4);
          this.field_z[var6] = (short)(this.field_z[var6] * param3 / param4);
          this.field_f[var6] = (short)(this.field_f[var6] * param0 / param4);
        }
        this.a(103);
        if (param1 != -226) {
          this.a(true);
        }
    }

    final static boolean a(int param0, String param1) {
        de var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        de var2Lifetime1;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2 = (de) (aj.field_a.d(0));
          while (var2 != null) {
            if (param1.equalsIgnoreCase(var2.field_l)) {
              return true;
            }
            var2 = (de) (aj.field_a.a((byte) -71));
          }
          var2Lifetime1 = (de) (qi.field_h.d(param0));
          while (true) {
            if (var2Lifetime1 == null) {
              return false;
            }
            if (!param1.equalsIgnoreCase(var2Lifetime1.field_l)) {
              var2Lifetime1 = (de) (qi.field_h.a((byte) -71));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("sr.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static int a(int param0, byte param1, boolean param2, int param3) {
        if (param1 != 0) {
          field_F = (bi) null;
        }
        return uo.a((byte) -75);
    }

    sr() {
        this.field_d = false;
        this.field_o = (byte) 0;
    }

    static {
        field_h = true;
        field_N = "Showing production, projects and fleet movements.";
    }
}
