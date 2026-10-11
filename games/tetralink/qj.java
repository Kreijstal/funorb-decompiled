/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static String field_a;
    static db field_c;
    static int[] field_b;
    static String field_e;
    static String field_d;

    final static boolean c(int param0) {
        if (param0 <= 105) {
          return true;
        }
        return null != hd.field_u ? true : ac.field_e;
    }

    final static void b(byte param0) {
        try {
          if (null != sk.field_f) {
            try {
              sk.field_f.a(0L, 0);
              sk.field_f.a(param0 ^ -19814, kb.field_q.field_u, kb.field_q.field_t, 24);
            } catch (Exception exception) {
            }
          }
          kb.field_q.field_t = kb.field_q.field_t + 24;
          if (param0 != 115) {
            field_d = (String) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0) {
        boolean stackIn_7_0 = false;
        if (param0 != 4) {
          field_d = (String) null;
        }
        stackIn_7_0 = (cm.field_n) || (ug.o(-69));
        return stackIn_7_0;
    }

    final static oh[] a(int param0, int param1) {
        oh[] var2 = new oh[9];
        var2[4] = ce.a(param1, 64, oj.a(param0, param0));
        return var2;
    }

    final static hl b(int param0) {
        if (param0 != 0) {
          qj.b(-109);
        }
        return ph.field_t.field_Pb;
    }

    final static void a(int param0, byte param1, oh[] param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
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
        var22 = TetraLink.field_J;
        try {
          if (param2 == null) {
            return;
          }
          if (0 < param0 &&
            param4 > 0) {
            if (null != param2[3]) {
              stackIn_9_0 = param2[3].field_t;
            } else {
              stackIn_9_0 = 0;
            }
            var6_int = stackIn_9_0;
            if (null == param2[5]) {
              stackIn_12_0 = 0;
            } else {
              stackIn_12_0 = param2[5].field_t;
            }
            var7 = stackIn_12_0;
            if (null != param2[1]) {
              stackIn_15_0 = param2[1].field_F;
            } else {
              stackIn_15_0 = 0;
            }
            var8 = stackIn_15_0;
            if (param2[7] != null) {
              stackIn_18_0 = param2[7].field_F;
            } else {
              stackIn_18_0 = 0;
            }
            var9 = stackIn_18_0;
            var10 = param0 + param3;
            var11 = param4 + param5;
            var12 = param3 + var6_int;
            if (param1 != -36) {
              field_d = (String) null;
            }
            var13 = -var7 + var10;
            var14 = var8 + param5;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param3 + param0 * var6_int / (var6_int + var7);
              var16 = param3 + param0 * var6_int / (var6_int + var7);
            }
            var18 = var14;
            var19 = var15;
            ra.a(pg.field_i);
            if (var18 > var19) {
              var19 = param5 + var8 * param4 / (var9 + var8);
              var18 = param5 + var8 * param4 / (var9 + var8);
            }
            if (param2[0] != null) {
              ra.b(param3, param5, var16, var18);
              param2[0].c(param3, param5);
              ra.b(pg.field_i);
            }
            if (param2[2] != null) {
              ra.b(var17, param5, var10, var18);
              param2[2].c(var13, param5);
              ra.b(pg.field_i);
            }
            if (null != param2[6]) {
              ra.b(param3, var19, var16, var11);
              param2[6].c(param3, var15);
              ra.b(pg.field_i);
            }
            if (param2[8] != null) {
              ra.b(var17, var19, var10, var11);
              param2[8].c(var13, var15);
              ra.b(pg.field_i);
            }
            if (null != param2[1] &&
              0 != param2[1].field_t) {
              ra.b(var16, param5, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param2[1].field_t) {
                param2[1].c(var20, param5);
              }
              ra.b(pg.field_i);
            }
            if (null != param2[7] &&
              param2[7].field_t != 0) {
              ra.b(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param2[7].field_t) {
                param2[7].c(var20Lifetime1, var15);
              }
              ra.b(pg.field_i);
            }
            if (param2[3] != null &&
              param2[3].field_F != 0) {
              ra.b(param3, var18, var16, var19);
              for (var20Lifetime2 = var14; var15 > var20Lifetime2; var20Lifetime2 = var20Lifetime2 + param2[3].field_F) {
                param2[3].c(param3, var20Lifetime2);
              }
              ra.b(pg.field_i);
            }
            if (param2[5] != null &&
              param2[5].field_F != 0) {
              ra.b(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param2[5].field_F) {
                param2[5].c(var13, var20Lifetime3);
              }
              ra.b(pg.field_i);
            }
            if (param2[4] != null &&
              0 != param2[4].field_t &&
              param2[4].field_F != 0) {
              ra.b(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param2[4].field_F) {
                for (var21 = var12; var21 < var13; var21 = var21 + param2[4].field_t) {
                  param2[4].c(var21, var20Lifetime4);
                }
              }
              ra.b(pg.field_i);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_74_0 = var6;
          stackIn_74_1 = new StringBuilder().append("qj.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_b = null;
        field_a = null;
        int var1 = -67 / ((0 - param0) / 49);
        field_d = null;
        field_c = null;
    }

    static {
        field_b = new int[]{2, 14, 15, 6, 5, 16, 17, 10, 11, 12};
        field_c = new db(1, 2, 2, 0);
        field_e = "Your turn - playing <%0> (<%1>)";
        field_d = "Enter name of friend to add to list";
    }
}
