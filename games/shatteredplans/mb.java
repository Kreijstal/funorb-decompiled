/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends ml {
    static int[] field_o;
    static int[] field_p;
    static qr field_n;

    final String a(boolean param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_o = (int[]) null;
          }
          if (this.b(-11196, param1) != tj.field_b) {
            return null;
          }
          stackIn_5_0 = hr.field_f;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("mb.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, nq param11, int param12, int param13, v param14, v param15, int param16, nq param17, int param18, v param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          tf.a(-86, param17, param16, param11);
          id.a(param20, param5, param3 + 26883, param10, param7);
          eg.b(param2, param8, param3);
          te.a(-4440, param19, param13, param14, param9, param12);
          ad.a(param4, param15, param1, (byte) 106);
          gn.a(param0, param18, false, param6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_4_0 = var21;
          stackIn_4_1 = new StringBuilder().append("mb.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param12).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param15 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param16).append(',');
          if (param17 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param20).append(')').toString());
        }
    }

    final static int[][] a(ln[] param0, boolean param1) {
        int[][] stackIn_12_0 = null;
        int[][] stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        ln[] var5_ref_ln__ = null;
        int var6 = 0;
        int var7 = 0;
        ln var7_ref_ln = null;
        int var8 = 0;
        int var9 = 0;
        int[][] var10 = null;
        int[][] var11 = null;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = param0.length;
          var11 = new int[var2_int][var2_int];
          var10 = var11;
          var3 = var10;
          for (var4 = 0; var4 < var2_int; var4++) {
            for (var5 = 0; var2_int > var5; var5++) {
              var11[var4][var5] = -1;
            }
            var11[var4][var4] = 0;
            var5_ref_ln__ = param0[var4].field_D;
            for (var6 = 0; var5_ref_ln__.length > var6; var6++) {
              var7_ref_ln = var5_ref_ln__[var6];
              var11[var4][var7_ref_ln.field_p] = 1;
            }
          }
          if (param1) {
            stackIn_12_0 = (int[][]) null;
            return stackIn_12_0;
          }
          for (var4Lifetime1 = 0; var2_int > var4Lifetime1; var4Lifetime1++) {
            for (var5Lifetime1 = 0; var5Lifetime1 < var2_int; var5Lifetime1++) {
              var9 = 0;
              var6Lifetime1 = var9;
              while (var9 < var2_int) {
                if (var11[var5Lifetime1][var4Lifetime1] != -1 &&
                  var11[var4Lifetime1][var9] != -1) {
                  var7 = var11[var5Lifetime1][var4Lifetime1] + var11[var4Lifetime1][var9];
                  if (var11[var5Lifetime1][var9] == -1 ||
                    var7 < var11[var5Lifetime1][var9]) {
                    var11[var5Lifetime1][var9] = var7;
                  }
                }
                var9++;
              }
            }
          }
          stackIn_29_0 = var3;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("mb.M(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(')').toString());
        }
    }

    mb(go param0) {
        super(param0);
    }

    public static void d(int param0) {
        field_o = null;
        field_p = null;
        field_n = null;
        if (param0 <= 77) {
          field_n = (qr) null;
        }
    }

    final u b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        u stackIn_2_0 = null;
        u stackIn_5_0 = null;
        u stackIn_10_0 = null;
        u stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!go.a(0, var4)) {
            stackIn_2_0 = tj.field_b;
            return stackIn_2_0;
          }
          if (param0 != -11196) {
            stackIn_5_0 = (u) null;
            return stackIn_5_0;
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = ma.a(var5, param0 + 11198);
          if (0 < var3_int &&
            130 >= var3_int) {
            stackIn_12_0 = p.field_g;
            return stackIn_12_0;
          }
          stackIn_10_0 = tj.field_b;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("mb.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_o = new int[]{15000, 9000, 6000, 4500, 3000, 2250, 1500};
    }
}
