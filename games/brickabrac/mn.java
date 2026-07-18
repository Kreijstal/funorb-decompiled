/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mn extends tk {
    int field_C;
    int field_D;
    int field_F;
    static int field_v;
    int field_x;
    static String field_u;
    int field_E;
    static String field_B;
    static int field_A;
    int field_z;
    static String field_w;
    static int field_y;

    public static void f(int param0) {
        field_B = null;
        field_u = null;
        field_w = null;
    }

    final static void a(int param0, int param1, id param2, mm param3, byte param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mn.a(-1, (mh) (Object) param2, param3, (int[]) null, param2.field_hc, -1, (byte) -58, param2.field_gc, param2.field_Yb);
        bm.field_d.a(true, true);
        bm.field_d.a((int[]) null, (byte) -120, 0);
        bm.field_d.a((byte) -93);
        nn var7 = bm.field_d;
        try {
            var8 = param5;
            var9 = param1;
            var10 = 0;
            var11 = 0;
            var7.field_d.a(var9, -79, var11, var10, var8);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "mn.D(" + 0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + 58 + ',' + param5 + ',' + 0 + ')');
        }
    }

    final static void a(jp param0, int param1, int param2, int param3, int param4, int param5, jp param6, int param7, jp param8, int param9, int param10) {
        RuntimeException var11 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            param0.d((param1 - param0.field_x) / 2 + (param3 - -(param5 * 5 >> 16)), param2);
            param8.c(param3 + (-param8.field_x + param1) / 2 - -(10 * param5 >> 16), -param8.field_z + 480 + param10 + (param2 - 35 / param7));
            param6.c((param5 * 20 >> 16) + (-param6.field_x + param1) / 2 + param3, -param6.field_z + (480 + param2) - -param10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var11 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var11;
            stackOut_4_1 = new StringBuilder().append("mn.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param7).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param8 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + 1 + ',' + param10 + ')');
        }
    }

    final static void a(int param0, mh param1, mm param2, int[] param3, String param4, int param5, byte param6, long param7, String param8) {
        try {
            o.field_b = param2;
            bm.field_d = new nn(param1, param7, param4, param8, param5, param0, param3);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "mn.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + -58 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final static jp[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        jp[] var10 = null;
        jp[] var11_ref_jp__ = null;
        int var11 = 0;
        int var12 = 0;
        jp var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = BrickABrac.field_J ? 1 : 0;
        var9 = 3;
        var10 = new jp[]{new jp(var9, var9), new jp(3, var9), new jp(var9, var9), new jp(var9, 3), new jp(64, 64), new jp(var9, 3), new jp(var9, var9), new jp(3, var9), new jp(var9, var9)};
        var11_ref_jp__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_jp__.length <= var12) {
            var11 = 0;
            L1: while (true) {
              if (var11 >= 1) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= 1) {
                    var11 = 0;
                    L3: while (true) {
                      if (var11 >= 3) {
                        var11 = 0;
                        L4: while (true) {
                          if (var11 >= 1) {
                            return var10;
                          } else {
                            var12 = 0;
                            L5: while (true) {
                              if (var12 >= 1) {
                                var11++;
                                continue L4;
                              } else {
                                var10[1].field_G[3 * (-var12 + (var9 - 1)) - -var11] = 65793;
                                var10[3].field_G[var11 * var9 + (var9 - (1 - -var12))] = 65793;
                                var10[7].field_G[var12 * 3 + var11] = 65793;
                                var10[5].field_G[var12 + var9 * var11] = 65793;
                                var12++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L6: while (true) {
                          if (var12 >= 1) {
                            var11++;
                            continue L3;
                          } else {
                            var10[7].field_G[var11 + (-1 + (var9 + -var12)) * 3] = 0;
                            var10[5].field_G[var9 * var11 - -var9 - (1 + var12)] = 0;
                            var10[1].field_G[var12 * 3 + var11] = 0;
                            var10[3].field_G[var12 + var11 * var9] = 0;
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L7: while (true) {
                      if (var12 >= var9) {
                        var11++;
                        continue L2;
                      } else {
                        L8: {
                          var10[0].field_G[var11 * var9 + var12] = 0;
                          var10[0].field_G[var11 + var12 * var9] = 0;
                          if (var12 < var9 + -var11) {
                            var10[2].field_G[var12 + var9 * var11] = 0;
                            var10[6].field_G[var9 * var12 + var11] = 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var12++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (~var9 >= ~var12) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_G[var12 + (-1 + var9 - var11) * var9] = 0;
                    var10[8].field_G[var12 + (-var11 + (var9 + -1)) * var9] = 0;
                    var10[2].field_G[-var11 - -var9 + -1 + var9 * var12] = 0;
                    var10[8].field_G[var9 - (1 + var11) + var9 * var12] = 0;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_jp__[var12];
            var14 = 0;
            L10: while (true) {
              if (~var13.field_G.length >= ~var14) {
                var12++;
                continue L0;
              } else {
                var13.field_G[var14] = 0;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    mn() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "From Level";
        field_B = "<%0> cannot join; the game is full.";
        field_w = "Game options changed (<%0>)";
        field_y = 640;
    }
}
