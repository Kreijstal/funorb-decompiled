/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static String field_f;
    static vh field_b;
    static dd field_a;
    static String field_d;
    static String field_c;
    static String field_e;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        if (param0 != -23334) {
          CharSequence var2 = (CharSequence) null;
          pl.a((CharSequence) null, -41, ';');
        }
        field_d = null;
        field_e = null;
        field_f = null;
        field_a = null;
    }

    final static int a(CharSequence param0, int param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 0;
          var4 = param0.length();
          var5 = 0;
          if (param1 > -69) {
            var6 = (CharSequence) null;
            pl.a((CharSequence) null, 35, 'ﾢ');
          }
          while (var5 < var4) {
            if (param0.charAt(var5) == param2) {
              var3_int++;
            }
            var5++;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("pl.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1, int param2, int[] param3, int param4, int[] param5, int[] param6, int[] param7, int param8, int[] param9, int param10, int[] param11) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var19 = Pool.field_O;
        try {
          if (param10 != -26182) {
            return;
          }
          var12_int = param2;
          var13 = param4;
          while (param8 > var12_int) {
            if (var13 < param1) {
              var14 = param11[var12_int] - param3[0];
              var15 = -param3[1] + param6[var12_int];
              var16 = -param3[2] + param7[var12_int];
              var17 = var14 * param3[3] + param3[4] * var15 + param3[5] * var16 >> 7;
              var18 = param3[8] * var16 + var14 * param3[6] + param3[7] * var15 >> 7;
              var16 = var15 * param3[10] + var14 * param3[9] + param3[11] * var16 >> 16;
              if (0 == var16) {
                var16 = -1;
              }
              param5[var12_int] = fb.field_q + (qh.field_b + var17 / var16);
              param0[var12_int] = var18 / var16 + fb.field_d + qh.field_c;
              param9[var12_int] = var16;
              var12_int++;
              var13++;
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_12_0 = var12;
          stackIn_12_1 = new StringBuilder().append("pl.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param6 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param7 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    static {
        field_c = "You may pot (hit into a pocket) any ball on the table to continue your visit, save for the cue ball, as long as you have first hit the lowest numbered ball!";
        field_e = "Without Guides";
        field_d = "Please log in to access this feature.";
    }
}
