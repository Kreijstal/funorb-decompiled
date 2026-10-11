/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc extends oh {
    static si field_i;
    static String[] field_g;
    static String field_h;
    static dl[] field_f;

    final static void a(boolean param0, int param1) {
        if (ph.field_E == null) {
          dq.a(-32056, param0);
        } else {
          q.a(false);
        }
        if (param1 != 0) {
          dl[] var3 = (dl[]) null;
          qc.a(9, -14, -108, (dl[]) null, -100, -14, -83);
        }
    }

    public static void c(byte param0) {
        field_h = null;
        field_i = null;
        if (param0 <= 114) {
          return;
        }
        field_g = null;
        field_f = null;
    }

    qc() {
    }

    final static boolean a(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        try {
          var2_int = param0.charAt(0);
          if (param1 >= -78) {
            field_h = (String) null;
          }
          for (var3 = 1; var3 < param0.length(); var3++) {
            if (param0.charAt(var3) != var2_int) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("qc.R(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        if (param0 != 1843275042) {
          field_g = (String[]) null;
        }
        return q.field_a[ma.field_n[param1]].field_g;
    }

    int a(byte param0, boolean param1) {
        if (param0 > -53) {
          field_i = (si) null;
        }
        return param1 ? 16 : 2;
    }

    final static void a(int param0, int param1, int param2, dl[] param3, int param4, int param5, int param6) {
        int var22 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        var23 = CrazyCrystals.field_B;
        try {
          if (param3 == null) {
            return;
          }
          if (0 < param5 &&
            param2 > 0 &&
            param0 != 0) {
            if (param3[3] != null) {
              stackIn_11_0 = param3[3].field_n;
            } else {
              stackIn_11_0 = 0;
            }
            var7_int = stackIn_11_0;
            if (param3[5] == null) {
              stackIn_14_0 = 0;
            } else {
              stackIn_14_0 = param3[5].field_n;
            }
            var8 = stackIn_14_0;
            if (null == param3[1]) {
              stackIn_17_0 = 0;
            } else {
              stackIn_17_0 = param3[1].field_o;
            }
            var9 = stackIn_17_0;
            if (null == param3[7]) {
              stackIn_20_0 = 0;
            } else {
              stackIn_20_0 = param3[7].field_o;
            }
            var10 = stackIn_20_0;
            var11 = param4 + param5;
            var12 = param1 + param2;
            var13 = param4 + var7_int;
            var14 = -var8 + var11;
            var15 = var9 + param1;
            var16 = var12 - var10;
            var17 = var13;
            var18 = var14;
            if (var18 < var17) {
              var18 = param4 + var7_int * param5 / (var8 + var7_int);
              var17 = param4 + var7_int * param5 / (var8 + var7_int);
            }
            var19 = var15;
            var20 = var16;
            kh.b(ec.field_i);
            if (var20 < var19) {
              var20 = param1 + var9 * param2 / (var9 + var10);
              var19 = param1 + var9 * param2 / (var9 + var10);
            }
            if (param3[0] != null) {
              kh.a(param4, param1, var17, var19);
              param3[0].f(param4, param1, param0);
              kh.a(ec.field_i);
            }
            if (null != param3[param6]) {
              kh.a(var18, param1, var11, var19);
              param3[2].f(var14, param1, param0);
              kh.a(ec.field_i);
            }
            if (param3[6] != null) {
              kh.a(param4, var20, var17, var12);
              param3[6].f(param4, var16, param0);
              kh.a(ec.field_i);
            }
            if (null != param3[8]) {
              kh.a(var18, var20, var11, var12);
              param3[8].f(var14, var16, param0);
              kh.a(ec.field_i);
            }
            if (null != param3[1] &&
              param3[1].field_n != 0) {
              kh.a(var17, param1, var18, var19);
              for (var21 = var13; var14 > var21; var21 = var21 + param3[1].field_n) {
                param3[1].f(var21, param1, param0);
              }
              kh.a(ec.field_i);
            }
            if (param3[7] != null &&
              param3[7].field_n != 0) {
              kh.a(var17, var20, var18, var12);
              for (var21Lifetime1 = var13; var14 > var21Lifetime1; var21Lifetime1 = var21Lifetime1 + param3[7].field_n) {
                param3[7].f(var21Lifetime1, var16, param0);
              }
              kh.a(ec.field_i);
            }
            if (null != param3[3] &&
              0 != param3[3].field_o) {
              kh.a(param4, var19, var17, var20);
              for (var21Lifetime2 = var15; var16 > var21Lifetime2; var21Lifetime2 = var21Lifetime2 + param3[3].field_o) {
                param3[3].f(param4, var21Lifetime2, param0);
              }
              kh.a(ec.field_i);
            }
            if (param3[5] != null &&
              param3[5].field_o != 0) {
              kh.a(var18, var19, var11, var20);
              for (var21Lifetime3 = var15; var21Lifetime3 < var16; var21Lifetime3 = var21Lifetime3 + param3[5].field_o) {
                param3[5].f(var14, var21Lifetime3, param0);
              }
              kh.a(ec.field_i);
            }
            if (null != param3[4] &&
              0 != param3[4].field_n &&
              param3[4].field_o != 0) {
              kh.a(var17, var19, var18, var20);
              for (var21Lifetime4 = var15; var21Lifetime4 < var16; var21Lifetime4 = var21Lifetime4 + param3[4].field_o) {
                for (var22 = var13; var22 < var14; var22 = var22 + param3[4].field_n) {
                  param3[4].f(var22, var21Lifetime4, param0);
                }
              }
              kh.a(ec.field_i);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_78_0 = var7;
          stackIn_78_1 = new StringBuilder().append("qc.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_g = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_h = "Accept";
        field_f = new dl[4];
    }
}
