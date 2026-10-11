/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends ii implements vg {
    private int[] field_N;
    private se field_K;
    private int field_O;
    static String field_P;
    private nk field_L;
    private ck[] field_T;
    static int[][] field_S;
    static int[] field_Q;
    static int[] field_M;
    static int[][] field_V;
    private String field_R;
    static int field_U;

    final void a(int param0, int param1, String param2) {
        int var4_int = this.field_O;
        if (param1 != 6824) {
          return;
        }
        try {
          this.a(var4_int + 1, 0);
          this.field_T[var4_int] = this.a(param2, (pg) (this), (byte) -82);
          this.field_N[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "kc.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2 ^ 0, param3);
        this.field_K.a(this.field_R, 14 + param1 + this.field_q, this.field_v + (param3 + 10), this.field_x - 28, this.field_s, 16777215, -1, param2, 0, this.field_K.field_H);
    }

    kc(nk param0, se param1, String param2) {
        super(0, 0, 288, 0, (ca) null);
        int var4_int = 0;
        this.field_O = 0;
        try {
          this.field_K = param1;
          this.field_R = param2;
          this.field_L = param0;
          var4_int = null != this.field_R ? this.field_K.a(this.field_R, 260, this.field_K.field_H) : 0;
          this.b(0, 288, 0, 0, var4_int + 22);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "kc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = DungeonAssault.field_K;
        try {
          if (param1 != 98) {
            return;
          }
          for (var6_int = 0; this.field_O > var6_int; var6_int++) {
            if (this.field_T[var6_int] != param0) {
              continue;
            }
            var7 = this.field_N[var6_int];
            if (var7 != -1) {
              sn.a(73, this.field_N[var6_int]);
            } else {
              this.field_L.j((byte) 85);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("kc.FA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_M = null;
        field_V = (int[][]) null;
        field_S = (int[][]) null;
        field_P = null;
        field_Q = null;
        if (param0 != 0) {
          field_Q = (int[]) null;
        }
    }

    final static ki[] a(qg param0, int param1) {
        int var5 = 0;
        ki[] stackIn_3_0 = null;
        ki[] stackIn_9_0 = null;
        ki[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        ki[] var4 = null;
        ki var6 = null;
        int var7 = 0;
        qg var8 = null;
        pn var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var7 = DungeonAssault.field_K;
        try {
          if (!param0.a(param1 + 61)) {
            stackIn_3_0 = new ki[]{};
            return stackIn_3_0;
          }
          var9 = param0.a(false);
          while (var9.field_c == 0) {
            pj.a(0, 10L);
          }
          if (var9.field_c == 2) {
            stackIn_9_0 = new ki[]{};
            return stackIn_9_0;
          }
          var11 = (int[]) (var9.field_f);
          var10 = var11;
          var3 = var10;
          var4 = new ki[var11.length >> 2];
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new ki();
            var4[var5] = var6;
            var6.field_g = var3[var5 << 2];
            var6.field_d = var3[(var5 << 2) + 1];
            var6.field_b = var3[2 + (var5 << 2)];
            var6.field_a = var3[3 + (var5 << 2)];
          }
          if (param1 != 10) {
            var8 = (qg) null;
            kc.a((qg) null, 35);
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("kc.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = DungeonAssault.field_K;
        if (param0 <= this.field_O) {
          return;
        }
        ck[] var7 = new ck[param0];
        ck[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = param1; this.field_O > var5; var5++) {
          var7[var5] = this.field_T[var5];
          var4[var5] = this.field_N[var5];
        }
        this.field_O = param0;
        this.field_N = var4;
        this.field_T = var3;
    }

    final static ab a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        ab var5 = null;
        ab stackIn_4_0 = null;
        ab stackIn_8_0 = null;
        ab stackIn_11_0 = null;
        ab stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() != 0) {
            var2_int = param0.indexOf('@');
            if (var2_int == -1) {
              stackIn_8_0 = ri.field_e;
              return stackIn_8_0;
            }
            var3 = param0.substring(0, var2_int);
            var4 = param0.substring(var2_int + 1);
            var5 = mo.a(var3, param1);
            if (var5 == null) {
              stackIn_13_0 = ed.a(-97, var4);
              return stackIn_13_0;
            }
            stackIn_11_0 = var5;
            return stackIn_11_0;
          }
          stackIn_4_0 = to.field_e;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("kc.G(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final ck a(String param0, pg param1, byte param2) {
        ck var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ck stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ck(param0, param1);
          if (param2 > -73) {
            this.a(-80, 42, 35, 65);
          }
          var4.field_o = (ca) ((Object) new na());
          var5 = this.field_s - 2;
          this.b(0, this.field_x, 0, 0, this.field_s + 34);
          var4.b(0, -14 + this.field_x, var5, 7, 30);
          this.b((byte) -126, var4);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("kc.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var0Lifetime1;
        int var1Lifetime1;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var1Lifetime2;
        field_P = "If you attempt to raid this dragon you will awaken it.<br><br>Do you wish to proceed?";
        field_S = new int[9][];
        field_V = new int[9][];
        for (var0 = 0; var0 <= 8; var0++) {
          field_S[var0] = new int[32];
          var1 = var0 * 8 + 106;
          var2 = 8 * var0 + 192;
          var3 = 80 + 6 * var0;
          var4 = 6 * var0 + 144;
          var5 = var0 * 10;
          var6 = var0 * 10 + 8;
          for (var7 = 0; 32 > var7; var7++) {
            var8 = (var2 - var1) * var7 / 32 + var1;
            var9 = var3 + var7 * (var4 - var3) / 32;
            var10 = (-var5 + var6) * var7 / 32 + var5;
            field_S[var0][var7] = mp.a(mp.a(var9 << 8, mp.a(-445743104, var8) << 16), var10);
          }
          var4Lifetime1 = 4 * var0 + 223;
          var2Lifetime1 = 223 + var0 * 4;
          var1Lifetime2 = 128 + var0 * 8;
          var6Lifetime1 = var0 * 4 + 223;
          field_V[var0] = new int[32];
          var3Lifetime1 = 128 + 8 * var0;
          var5Lifetime1 = 96 + 6 * var0;
          for (var7Lifetime1 = 0; var7Lifetime1 < 32; var7Lifetime1++) {
            var8Lifetime1 = var7Lifetime1 * (var2Lifetime1 - var1Lifetime2) / 32 + var1Lifetime2;
            var9Lifetime1 = (var4Lifetime1 - var3Lifetime1) * var7Lifetime1 / 32 + var3Lifetime1;
            var10Lifetime1 = var5Lifetime1 + (var6Lifetime1 - var5Lifetime1) * var7Lifetime1 / 32;
            field_V[var0][var7Lifetime1] = mp.a(mp.a(mp.a(var8Lifetime1, 77168640) << 16, var9Lifetime1 << 8), var10Lifetime1);
          }
        }
        field_M = new int[32];
        for (var0Lifetime1 = 0; var0Lifetime1 < 32; var0Lifetime1++) {
          var1Lifetime1 = 112 + var0Lifetime1 * 2;
          field_M[var0Lifetime1] = mp.a(var1Lifetime1 * 65793, -2147483648);
        }
    }
}
