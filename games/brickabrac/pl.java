/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static tp[] field_f;
    static int[] field_b;
    static String field_e;
    static String[] field_c;
    static jp field_a;
    static int field_d;

    final static jp a(int param0, jp param1) {
        jp var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        jp stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new jp(param1.field_x / 2, param1.field_z / 2);
              if (param0 == -16371) {
                break L1;
              } else {
                var3 = (byte[]) null;
                pl.a(-81, (byte[]) null, 117, false, 81, (byte) 40);
                break L1;
              }
            }
            var2.g();
            param1.a(0, 0);
            kc.field_q.a((byte) 103);
            stackIn_3_0 = (jp) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("pl.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, byte[] param1, int param2, boolean param3, int param4, byte param5) {
        pi var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
            var6 = k.field_h;
            var6.e(-13413, param0);
            var6.field_l = var6.field_l + 1;
            var7 = var6.field_l;
            var6.a(15, 4);
            var6.a(81, param2);
            if (param5 >= -55) {
                field_b = (int[]) null;
            }
            var8 = param4;
            if (!(!param3)) {
                var8 += 128;
            }
            var6.a(46, var8);
            var6.a(param1, -1, 0, param1.length);
            var6.d((byte) 123, -var7 + var6.field_l);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "pl.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 0) {
            mf var2 = (mf) null;
            pl.a((String) null, (String) null, (byte) -53, (mf) null);
        }
        field_c = null;
        field_a = null;
        field_e = null;
        field_b = null;
    }

    final static void a(jp param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var13 = new int[param0.field_C];
            var12 = var13;
            var11 = var12;
            var2 = var11;
            var3 = 0;
            var4 = 0;
            var5_int = param1;
            L1: while (true) {
              if (var5_int >= param0.field_C) {
                var3 = 0;
                var5 = new int[var4 + param0.field_C];
                var6 = 0;
                L2: while (true) {
                  if (param0.field_C <= var6) {
                    var6 = 0;
                    L3: while (true) {
                      if (var4 <= var6) {
                        param0.field_G = var5;
                        break L0;
                      } else {
                        incrementValue$0 = var3;
                        var3++;
                        var5[incrementValue$0] = param0.field_G[var6];
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    incrementValue$1 = var3;
                    var3++;
                    var5[incrementValue$1] = var13[var6];
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var11[var5_int] = var4 + param0.field_C;
                var6 = 0;
                var7 = 0;
                var8 = 0;
                L4: while (true) {
                  if (param0.field_D <= var8) {
                    var4++;
                    var5_int++;
                    continue L1;
                  } else {
                    L5: {
                      incrementValue$2 = var3;
                      var3++;
                      var9 = param0.field_G[incrementValue$2];
                      if ((var9 ^ -1) == -1) {
                        L6: {
                          if (0 >= var6) {
                            break L6;
                          } else {
                            var6 = 0;
                            var4++;
                            break L6;
                          }
                        }
                        var7++;
                        param0.field_G[var4] = -var7;
                        break L5;
                      } else {
                        L7: {
                          if (0 >= var7) {
                            break L7;
                          } else {
                            var4++;
                            var7 = 0;
                            break L7;
                          }
                        }
                        var6++;
                        param0.field_G[var4] = var6;
                        break L5;
                      }
                    }
                    var8++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2_ref);

            stackIn_24_1 = new StringBuilder().append("pl.A(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.addMouseListener(lj.field_j);
            param0.addMouseMotionListener(lj.field_j);
            if (param1 != 7282) {
                mf var3 = (mf) null;
                pl.a((String) null, (String) null, (byte) 8, (mf) null);
            }
            param0.addFocusListener(lj.field_j);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "pl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                pl.a(-94);
                break L1;
              }
            }
            if (!param2) {
              stackIn_6_0 = oc.field_m.c(param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = lj.field_r.c(param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("pl.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static jp a(String param0, String param1, byte param2, mf param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        jp stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param3.a(param0, false);
            var5 = param3.a(var4_int, -108, param1);
            var6 = 116 % ((40 - param2) / 57);
            stackIn_1_0 = dk.a(-873, param3, var4_int, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("pl.D(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_e = "Ignore";
        field_b = vn.d(8);
        field_d = 0;
        field_c = new String[]{"All scores", "My scores", "Best each"};
    }
}
