/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl {
    int field_e;
    static String field_d;
    static aj field_b;
    static String field_a;
    static kc field_c;
    static String field_f;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, byte param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          while (true) {
            param2--;
            if (0 > param2) {
              if (param9 < 116) {
                var17 = (int[]) null;
                gl.a(-42, -39, 14, -51, (int[]) null, 44, -111, -12, -52, (byte) 102);
              }
              return;
            }
            var18 = param4;
            var10 = var18;
            var11 = param1;
            var12 = param6;
            var13 = param5;
            var14 = param0;
            var15 = (16711422 & var18[var11]) >> 1;
            var10[var11] = dg.a(255, var14 >> 17) - (-(dg.a(var13, 33423780) >> 9) - dg.a(16711680, var12 >> 1)) + var15;
            param6 = param6 + param7;
            param1++;
            param0 = param0 + param8;
            param5 = param5 + param3;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("gl.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_f = null;
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != 15) {
          gl.a((byte) -4);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, qb[] param4, int param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
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
        var22 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param4 == null) {
            return;
          }
          if (param3 > 0 &&
            param0 > 0) {
            if (null == param4[3]) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = param4[3].field_n;
            }
            var6_int = stackIn_10_0;
            if (param2 != -27327) {
              gl.a(true, -7);
            }
            if (null != param4[5]) {
              stackIn_15_0 = param4[5].field_n;
            } else {
              stackIn_15_0 = 0;
            }
            var7 = stackIn_15_0;
            if (null != param4[1]) {
              stackIn_18_0 = param4[1].field_w;
            } else {
              stackIn_18_0 = 0;
            }
            var8 = stackIn_18_0;
            if (null != param4[7]) {
              stackIn_21_0 = param4[7].field_w;
            } else {
              stackIn_21_0 = 0;
            }
            var9 = stackIn_21_0;
            var10 = param1 + param3;
            var11 = param0 + param5;
            var12 = param1 + var6_int;
            var13 = -var7 + var10;
            var14 = var8 + param5;
            var15 = var11 - var9;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param1 + param3 * var6_int / (var7 + var6_int);
              var16 = param1 + param3 * var6_int / (var7 + var6_int);
            }
            var18 = var14;
            var19 = var15;
            de.a(ee.field_d);
            if (var19 < var18) {
              var19 = param5 + var8 * param0 / (var9 + var8);
              var18 = param5 + var8 * param0 / (var9 + var8);
            }
            if (null != param4[0]) {
              de.a(param1, param5, var16, var18);
              param4[0].c(param1, param5);
              de.b(ee.field_d);
            }
            if (null != param4[2]) {
              de.a(var17, param5, var10, var18);
              param4[2].c(var13, param5);
              de.b(ee.field_d);
            }
            if (null != param4[6]) {
              de.a(param1, var19, var16, var11);
              param4[6].c(param1, var15);
              de.b(ee.field_d);
            }
            if (param4[8] != null) {
              de.a(var17, var19, var10, var11);
              param4[8].c(var13, var15);
              de.b(ee.field_d);
            }
            if (param4[1] != null &&
              param4[1].field_n != 0) {
              de.a(var16, param5, var17, var18);
              for (var20 = var12; var20 < var13; var20 = var20 + param4[1].field_n) {
                param4[1].c(var20, param5);
              }
              de.b(ee.field_d);
            }
            if (null != param4[7] &&
              param4[7].field_n != 0) {
              de.a(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var13 > var20Lifetime1; var20Lifetime1 = var20Lifetime1 + param4[7].field_n) {
                param4[7].c(var20Lifetime1, var15);
              }
              de.b(ee.field_d);
            }
            if (null != param4[3] &&
              param4[3].field_w != 0) {
              de.a(param1, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param4[3].field_w) {
                param4[3].c(param1, var20Lifetime2);
              }
              de.b(ee.field_d);
            }
            if (param4[5] != null &&
              param4[5].field_w != 0) {
              de.a(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var20Lifetime3 < var15; var20Lifetime3 = var20Lifetime3 + param4[5].field_w) {
                param4[5].c(var13, var20Lifetime3);
              }
              de.b(ee.field_d);
            }
            if (null != param4[4] &&
              0 != param4[4].field_n &&
              param4[4].field_w != 0) {
              de.a(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param4[4].field_w) {
                for (var21 = var12; var13 > var21; var21 = var21 + param4[4].field_n) {
                  param4[4].c(var21, var20Lifetime4);
                }
              }
              de.b(ee.field_d);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_74_0 = var6;
          stackIn_74_1 = new StringBuilder().append("gl.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_74_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        int var3;
        qb[] var4;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 ||
          wi.field_f == null) {
          so.field_j = false;
        }
        if (param0) {
          if (ce.field_h <= 0) {
            if (sm.field_a <= 0) {
              if (0 < oo.field_y) {
                oo.field_y = oo.field_y - 1;
              }
            } else {
              sm.field_a = sm.field_a - 1;
            }
          } else {
            ce.field_h = ce.field_h - 1;
          }
        } else {
          if (wi.field_f == null) {
            if (om.field_x == null) {
              so.field_j = false;
              if (sm.field_a > 0) {
                sm.field_a = sm.field_a - 1;
              } else {
                if (oo.field_y > 0) {
                  oo.field_y = oo.field_y - 1;
                } else {
                  if (ce.field_h < ea.field_F) {
                    if (ce.field_h == 0) {
                      ik.a((byte) -85);
                    }
                    ce.field_h = ce.field_h + 1;
                  }
                }
              }
            } else {
              if (ce.field_h > 0) {
                ce.field_h = ce.field_h - 1;
              } else {
                if (oo.field_y <= 0) {
                  if (ea.field_F > sm.field_a) {
                    if (0 == sm.field_a) {
                      ik.a(true, -115);
                    }
                    sm.field_a = sm.field_a + 1;
                  }
                } else {
                  oo.field_y = oo.field_y - 1;
                }
              }
            }
          } else {
            if (ce.field_h <= 0) {
              if (sm.field_a > 0) {
                sm.field_a = sm.field_a - 1;
              } else {
                if (oo.field_y < ea.field_F) {
                  if (oo.field_y == 0) {
                    ik.a(false, 95);
                  }
                  oo.field_y = oo.field_y + 1;
                }
              }
            } else {
              ce.field_h = ce.field_h - 1;
            }
          }
        }
        if (param1 != 0) {
          var4 = (qb[]) null;
          gl.a(126, -38, -58, 81, (qb[]) null, 13);
        }
    }

    static {
        field_d = "Invalid date";
        field_b = new aj(9, 0, 4, 1);
        field_a = "Team Play:";
        field_f = "Please check if address is correct";
    }
}
