/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends eu {
    static int[] field_c;
    static String field_d;
    static String field_e;
    static ne[] field_f;
    static int field_b;

    final static void a(int param0, wb[] param1, byte param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
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
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1 == null) {
            return;
          }
          if (param5 > 0 &&
            param4 > 0) {
            if (param1[3] == null) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = param1[3].field_z;
            }
            var6_int = stackIn_10_0;
            if (null == param1[5]) {
              stackIn_13_0 = 0;
            } else {
              stackIn_13_0 = param1[5].field_z;
            }
            var7 = stackIn_13_0;
            if (null == param1[1]) {
              stackIn_16_0 = 0;
            } else {
              stackIn_16_0 = param1[1].field_w;
            }
            var8 = stackIn_16_0;
            if (param1[7] != null) {
              stackIn_19_0 = param1[7].field_w;
            } else {
              stackIn_19_0 = 0;
            }
            var9 = stackIn_19_0;
            var10 = param0 + param5;
            var11 = param3 + param4;
            var12 = param0 + var6_int;
            var13 = var10 - var7;
            var14 = param3 + var8;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var16 > var17) {
              var17 = param0 + param5 * var6_int / (var7 + var6_int);
              var16 = param0 + param5 * var6_int / (var7 + var6_int);
            }
            var18 = var14;
            if (param2 != -34) {
              field_b = 71;
            }
            var19 = var15;
            lk.b(cd.field_f);
            if (var19 < var18) {
              var19 = param3 + param4 * var8 / (var8 + var9);
              var18 = param3 + param4 * var8 / (var8 + var9);
            }
            if (param1[0] != null) {
              lk.e(param0, param3, var16, var18);
              param1[0].a(param0, param3);
              lk.a(cd.field_f);
            }
            if (null != param1[2]) {
              lk.e(var17, param3, var10, var18);
              param1[2].a(var13, param3);
              lk.a(cd.field_f);
            }
            if (param1[6] != null) {
              lk.e(param0, var19, var16, var11);
              param1[6].a(param0, var15);
              lk.a(cd.field_f);
            }
            if (null != param1[8]) {
              lk.e(var17, var19, var10, var11);
              param1[8].a(var13, var15);
              lk.a(cd.field_f);
            }
            if (param1[1] != null &&
              0 != param1[1].field_z) {
              lk.e(var16, param3, var17, var18);
              for (var20 = var12; var13 > var20; var20 = var20 + param1[1].field_z) {
                param1[1].a(var20, param3);
              }
              lk.a(cd.field_f);
            }
            if (param1[7] != null &&
              param1[7].field_z != 0) {
              lk.e(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param1[7].field_z) {
                param1[7].a(var20Lifetime1, var15);
              }
              lk.a(cd.field_f);
            }
            if (null != param1[3] &&
              param1[3].field_w != 0) {
              lk.e(param0, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param1[3].field_w) {
                param1[3].a(param0, var20Lifetime2);
              }
              lk.a(cd.field_f);
            }
            if (param1[5] != null &&
              param1[5].field_w != 0) {
              lk.e(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param1[5].field_w) {
                param1[5].a(var13, var20Lifetime3);
              }
              lk.a(cd.field_f);
            }
            if (param1[4] != null &&
              param1[4].field_z != 0) {
              if (0 == param1[4].field_w) {
                return;
              }
              lk.e(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param1[4].field_w) {
                for (var21 = var12; var13 > var21; var21 = var21 + param1[4].field_z) {
                  param1[4].a(var21, var20Lifetime4);
                }
              }
              lk.a(cd.field_f);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_77_0 = var6;
          stackIn_77_1 = new StringBuilder().append("kn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_77_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static char a(byte param0, byte param1) {
        int var3 = 0;
        int var2 = param0 & 255;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (param1 <= -29) {
          if (var2 >= 128 &&
            var2 < 160) {
            var3 = uk.field_lb[var2 - 128];
            if (0 == var3) {
              var3 = 63;
            }
            var2 = var3;
          }
          return (char)var2;
        }
        return '^';
    }

    public static void b(int param0) {
        field_f = null;
        if (param0 != -1) {
          return;
        }
        field_c = null;
        field_d = null;
        field_e = null;
    }

    kn() {
        this.a(56);
    }

    final static void a(boolean param0, int param1) {
        jv.a(true, (byte) -71, param0);
        int var2 = 48 % ((-25 - param1) / 41);
    }

    private final void a(int param0) {
        if (param0 != 56) {
          kn.b(-32);
        }
    }

    final static void a(boolean param0, byte param1) {
        if (oj.a(false)) {
          if (param1 != -122) {
            field_b = 120;
          }
          if (param0) {
            lk.b(0, 0, lk.field_b, lk.field_c, 0, 192);
          }
          pu.field_e.a(0, 0, false);
          return;
        }
    }

    static {
        field_d = "Type your email address again to make sure it's correct";
        field_c = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_e = "Unpacking graphics";
    }
}
