/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends ib implements en {
    static int field_J;
    static String field_L;
    private int[] field_T;
    private d[] field_I;
    private int field_M;
    static boolean field_O;
    static tg field_P;
    static int[] field_N;
    private String field_R;
    static String field_S;
    private dh field_H;
    private lp field_K;
    static ki field_Q;

    final void a(boolean param0, String param1, int param2) {
        int var4_int = 0;
        try {
            if (param0) {
                Object var5 = null;
                ((ec) this).a(117, -42, (byte) 27, -108, (d) null);
            }
            var4_int = ((ec) this).field_M;
            this.a((byte) -106, 1 + var4_int);
            ((ec) this).field_I[var4_int] = ((ec) this).a((byte) 126, param1, (uh) this);
            ((ec) this).field_T[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ec.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                if (var6_int >= ((ec) this).field_M) {
                  break L2;
                } else {
                  if (param4 != ((ec) this).field_I[var6_int]) {
                    var6_int++;
                    continue L1;
                  } else {
                    var7 = ((ec) this).field_T[var6_int];
                    if (var7 != -1) {
                      int discarded$2 = 1;
                      bd.a(((ec) this).field_T[var6_int]);
                      break L2;
                    } else {
                      ((ec) this).field_K.m(17);
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param2 <= -22) {
                  break L3;
                } else {
                  field_O = false;
                  break L3;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("ec.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final static void h() {
        lm.a(-1);
        cg.field_l = true;
        sa.field_E = true;
        mf.field_f.a(-126);
        pq.a(0, gf.field_b, false);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        int discarded$0 = ((ec) this).field_H.a(((ec) this).field_R, 14 + (param1 - -((ec) this).field_o), 10 + (param0 - -((ec) this).field_w), ((ec) this).field_t - 28, ((ec) this).field_s, 16777215, -1, 0, 0, ((ec) this).field_H.field_F);
    }

    final d a(byte param0, String param1, uh param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        d var5 = null;
        int var6 = 0;
        d stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        d stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4_int = -104 / ((param0 - 89) / 37);
            var5 = new d(param1, param2);
            var5.field_l = (ub) (Object) new hi();
            var6 = ((ec) this).field_s + -2;
            ((ec) this).a(34 + ((ec) this).field_s, 0, 0, (byte) -119, ((ec) this).field_t);
            var5.a(30, 7, var6, (byte) -119, -14 + ((ec) this).field_t);
            ((ec) this).a((oc) (Object) var5, true);
            stackOut_0_0 = (d) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("ec.A(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    private final void a(byte param0, int param1) {
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (!(param1 > ((ec) this).field_M)) {
            return;
        }
        d[] var7 = new d[param1];
        d[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < ((ec) this).field_M; var5++) {
            var7[var5] = ((ec) this).field_I[var5];
            var4[var5] = ((ec) this).field_T[var5];
        }
        ((ec) this).field_T = var4;
        ((ec) this).field_I = var3;
        ((ec) this).field_M = param1;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        jp var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        RuntimeException decompiledCaughtException = null;
        var31 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var8_int = param2 + (-param1 + -param7);
              var9 = -param7 + param4 - param1;
              var10 = param1 + (param2 + param7);
              if (lb.field_f >= var10) {
                break L1;
              } else {
                var10 = lb.field_f;
                break L1;
              }
            }
            L2: {
              if (lb.field_i <= var8_int) {
                break L2;
              } else {
                var8_int = lb.field_i;
                break L2;
              }
            }
            L3: {
              var11 = param4 + param1 + param7;
              if (var9 < lb.field_b) {
                var9 = lb.field_b;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var11 > lb.field_j) {
                var11 = lb.field_j;
                break L4;
              } else {
                break L4;
              }
            }
            var35 = new int[32];
            var34 = var35;
            var33 = var34;
            var32 = var33;
            var12 = var32;
            var13 = 4194559;
            var14 = 32768;
            var15 = 0;
            L5: while (true) {
              if (var15 >= 16) {
                L6: {
                  var15 = var10 - var8_int;
                  var16 = -var9 + var11;
                  if (var15 <= 0) {
                    break L6;
                  } else {
                    if (var16 <= 0) {
                      break L6;
                    } else {
                      var17 = new jp(var15, var16);
                      var18 = param1 * param1;
                      var19 = (param7 + param1) * (param7 + param1);
                      var20 = 0;
                      var21 = -param4 + var9;
                      var22 = 0;
                      L7: while (true) {
                        if (var22 >= var16) {
                          var17.d(var8_int, var9);
                          lb.b(param2 << 4, param4 << 4, param7 + param1 << 4, 255, var35);
                          break L0;
                        } else {
                          var23 = -param2 + var8_int;
                          var24 = var23 * var23 + var21 * var21;
                          var25 = 0;
                          L8: while (true) {
                            if (var25 >= var15) {
                              var22++;
                              var21++;
                              continue L7;
                            } else {
                              L9: {
                                var26 = var22 + var9;
                                var27 = var25 + var8_int;
                                if (var24 != 0) {
                                  if (var24 < var18) {
                                    L10: {
                                      var28 = ap.a(var24 << 12, -55);
                                      var29 = (param1 << 6) - var28;
                                      var30 = var28 + -((-BrickABrac.c(2048, (var29 << 7) / param1) + 65536) * param5 >> 11);
                                      var26 = var21 * var30 / var28 + param4;
                                      var27 = var30 * var23 / var28 + param2;
                                      if (lb.field_i <= var27) {
                                        break L10;
                                      } else {
                                        var27 = lb.field_i;
                                        break L10;
                                      }
                                    }
                                    L11: {
                                      if (lb.field_b > var26) {
                                        var26 = lb.field_b;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      if (var27 < lb.field_f) {
                                        break L12;
                                      } else {
                                        var27 = lb.field_f;
                                        break L12;
                                      }
                                    }
                                    if (var26 >= lb.field_j) {
                                      var26 = lb.field_j;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    if (var19 > var24) {
                                      L13: {
                                        var28 = ap.a(var24 << 12, -100);
                                        var29 = -(param1 << 6) + var28;
                                        var30 = var28 - (param5 * (-BrickABrac.c(2048, (var29 << 7) / param7) + 65536) >> 11);
                                        var27 = param2 - -(var23 * var30 / var28);
                                        var26 = var30 * var21 / var28 + param4;
                                        if (lb.field_i <= var27) {
                                          break L13;
                                        } else {
                                          var27 = lb.field_i;
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        if (lb.field_b > var26) {
                                          var26 = lb.field_b;
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        if (lb.field_j > var26) {
                                          break L15;
                                        } else {
                                          var26 = lb.field_j;
                                          break L15;
                                        }
                                      }
                                      if (var27 < lb.field_f) {
                                        break L9;
                                      } else {
                                        var27 = lb.field_f;
                                        break L9;
                                      }
                                    } else {
                                      var17.field_G[var20] = lb.field_l[lb.field_c * var26 - -var27];
                                      var20++;
                                      var23++;
                                      var25++;
                                      var24 = var24 + (-1 + var23 * 2);
                                      continue L8;
                                    }
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              var17.field_G[var20] = lb.field_l[lb.field_c * var26 - -var27];
                              var20++;
                              var23++;
                              var25++;
                              var24 = var24 + (-1 + var23 * 2);
                              continue L8;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                var16 = param6 * var15 >> 4;
                var12[var15] = ud.d(ik.a(var16 * var14, 16711680), ik.a(var13 * var16, -16711936)) >>> 8;
                var12[-var15 + 31] = ud.d(ik.a(var16 * var13, -16711936), ik.a(16711680, var16 * var14)) >>> 8;
                var15++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var8, "ec.C(" + 4227327 + ',' + param1 + ',' + param2 + ',' + 99 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    ec(lp param0, dh param1, String param2) {
        super(0, 0, 288, 0, (ub) null);
        int var4_int = 0;
        ((ec) this).field_M = 0;
        try {
            ((ec) this).field_K = param0;
            ((ec) this).field_R = param2;
            ((ec) this).field_H = param1;
            var4_int = ((ec) this).field_R == null ? 0 : ((ec) this).field_H.b(((ec) this).field_R, 260, ((ec) this).field_H.field_F);
            ((ec) this).a(22 + var4_int, 0, 0, (byte) -119, 288);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ec.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_Q = null;
        field_N = null;
        field_L = null;
        field_S = null;
        field_P = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = "Reload game";
        field_J = 15;
        field_S = "Offline";
    }
}
