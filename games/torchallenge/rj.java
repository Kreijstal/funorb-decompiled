/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rj {
    static ka field_a;
    static int field_g;
    static ka[] field_b;
    static int field_c;
    static lj field_f;
    static String field_d;
    static int[] field_e;
    static char[] field_h;

    final static ka[] a(int param0, int param1) {
        ka[] var2 = null;
        RuntimeException var2_ref = null;
        ka[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 19) {
                break L1;
              } else {
                rj.a((byte) -37, false, (int[]) null, (vg) null, false, true, (int[]) null);
                break L1;
              }
            }
            var2 = new ka[9];
            var2[4] = e.a(param1, 64, (byte) -95);
            stackIn_4_0 = (ka[]) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2_ref), "rj.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(byte param0, boolean param1, int[] param2, vg param3, boolean param4, boolean param5, int[] param6) {
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        StringBuilder stackIn_79_1 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        StringBuilder stackIn_83_1 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
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
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        var30 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = 2147483647;
              var8 = -2147483648;
              var21 = param6[3] >> 1471710946;
              var22 = param6[4] >> 1080272450;
              var23 = param6[5] >> 1398578242;
              var24 = param6[6] >> 1701400866;
              var25 = param6[7] >> 2011035970;
              var26 = param6[8] >> -2046109918;
              var27 = param6[9] >> 1375349026;
              var28 = param6[10] >> -2136331390;
              var12 = param2[4] * var22 + param2[3] * var21 + param2[5] * var23 >> 1837810990;
              if (param0 < -20) {
                break L1;
              } else {
                rj.a((byte) -82, false, (int[]) null, (vg) null, true, true, (int[]) null);
                break L1;
              }
            }
            var29 = param6[11] >> 1878972994;
            var13 = var26 * param2[5] + (param2[4] * var25 + param2[3] * var24) >> -583978258;
            var18 = var22 * param2[10] + param2[9] * var21 - -(var23 * param2[11]) >> -46802962;
            var14 = param2[5] * var29 + (param2[3] * var27 + param2[4] * var28) >> -716084562;
            var19 = var26 * param2[11] + param2[10] * var25 + param2[9] * var24 >> 81829902;
            var16 = param2[6] * var24 + (param2[7] * var25 + var26 * param2[8]) >> -381732338;
            var20 = param2[9] * var27 + param2[10] * var28 + var29 * param2[11] >> -591326162;
            var15 = param2[7] * var22 + (var21 * param2[6] - -(var23 * param2[8])) >> 139092750;
            var17 = var29 * param2[8] + var28 * param2[7] + param2[6] * var27 >> 1595568558;
            var21 = -param6[0] + param2[0];
            var22 = param2[1] + -param6[1];
            var23 = -param6[2] + param2[2];
            var9 = param6[4] * var22 + param6[3] * var21 + var23 * param6[5] >> -fd.field_g + 16;
            var10 = param6[8] * var23 + (param6[6] * var21 - -(param6[7] * var22)) >> 16 - fd.field_g;
            var11 = var23 * param6[11] + var21 * param6[9] + param6[10] * var22 >> -1406404496;
            var21 = oc.field_i;
            var22 = oc.field_c;
            var23 = 0;
            L2: while (true) {
              L3: {
                if ((var23 ^ -1) <= (param3.field_d ^ -1)) {
                  L4: {
                    if (null == param3.field_u) {
                      break L4;
                    } else {
                      if (null == param3.field_y) {
                        break L4;
                      } else {
                        if (param3.field_J == null) {
                          break L4;
                        } else {
                          if (param3.field_E == null) {
                            break L4;
                          } else {
                            if (null == param3.field_l) {
                              break L4;
                            } else {
                              if (null == param3.field_C) {
                                break L4;
                              } else {
                                if (param3.field_A == null) {
                                  break L4;
                                } else {
                                  if (null == param3.field_o) {
                                    break L4;
                                  } else {
                                    if (param3.field_a == null) {
                                      break L4;
                                    } else {
                                      var23 = 0;
                                      L5: while (true) {
                                        if ((var23 ^ -1) <= (param3.field_x ^ -1)) {
                                          break L4;
                                        } else {
                                          var24 = param3.field_u[var23];
                                          var25 = param3.field_y[var23];
                                          var26 = param3.field_J[var23];
                                          ba.field_h[var23] = var9 - -(var24 * var12 + var15 * var25 + var18 * var26 >> 1915848624);
                                          ib.field_O[var23] = (var24 * var13 + (var25 * var16 + var26 * var19) >> -466835376) + var10;
                                          ih.field_O[var23] = (var24 * var14 + var25 * var17 - -(var26 * var20) >> 125287760) + var11;
                                          var24 = param3.field_E[var23];
                                          var25 = param3.field_l[var23];
                                          var26 = param3.field_C[var23];
                                          il.field_r[var23] = (var25 * var15 + var24 * var12 - -(var18 * var26) >> 1953371088) + var9;
                                          tf.field_u[var23] = (var25 * var16 + (var24 * var13 + var19 * var26) >> -149844368) + var10;
                                          ef.field_d[var23] = (var24 * var14 - (-(var25 * var17) + -(var20 * var26)) >> -172160400) + var11;
                                          var24 = param3.field_A[var23];
                                          var25 = param3.field_o[var23];
                                          var26 = param3.field_a[var23];
                                          fa.field_h[var23] = var9 + (var18 * var26 + var24 * var12 - -(var15 * var25) >> -318290352);
                                          qi.field_h[var23] = var10 - -(var19 * var26 + var16 * var25 + var24 * var13 >> 1255480752);
                                          kc.field_m[var23] = var11 - -(var20 * var26 + (var14 * var24 - -(var17 * var25)) >> -1825362224);
                                          var23++;
                                          continue L5;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (param4) {
                    var9 = param2[3];
                    var10 = param2[4];
                    var11 = param2[5];
                    var12 = param2[6];
                    var13 = param2[7];
                    var14 = param2[8];
                    var15 = param2[9];
                    var16 = param2[10];
                    var17 = param2[11];
                    var18 = 0;
                    L6: while (true) {
                      stackIn_63_0 = param3.field_c;
                      stackIn_63_1 = var18;
                      if (stackIn_63_0 <= stackIn_63_1) {
                        break L3;
                      } else {
                        stackIn_66_0 = var18;
                        stackIn_66_1 = sj.field_S.length;
                        if (stackIn_66_0 >= stackIn_66_1) {
                          break L3;
                        } else {
                          var19 = param3.field_L[var18];
                          var20 = param3.field_r[var18];
                          var21 = param3.field_D[var18];
                          sj.field_S[var18] = var12 * var20 + (var19 * var9 + var15 * var21) >> -1077903728;
                          kl.field_b[var18] = var16 * var21 + var10 * var19 - -(var13 * var20) >> 404237232;
                          kd.field_o[var18] = var21 * var17 + var11 * var19 + var14 * var20 >> 206202288;
                          var18++;
                          continue L6;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                } else {
                  var24 = param3.field_g[var23];
                  var25 = param3.field_t[var23];
                  var26 = param3.field_q[var23];
                  var27 = (var18 * var26 + (var12 * var24 + var15 * var25) >> 16 + -fd.field_g) + var9;
                  var28 = (var25 * var16 + var13 * var24 - -(var26 * var19) >> 16 - fd.field_g) + var10;
                  var29 = var11 + (var20 * var26 + (var14 * var24 + var25 * var17) >> -736990640);
                  stackIn_63_0 = 50;

                  stackIn_63_1 = var29;

                  L8: {
                    if (stackIn_63_0 > stackIn_63_1) {
                      bg.field_O[var23] = -2147483648;
                      break L8;
                    } else {
                      L9: {
                        tj.field_a[var23] = var27 / var29 + var21;
                        si.field_K[var23] = var28 / var29 + var22;
                        if ((var8 ^ -1) > (var29 ^ -1)) {
                          var8 = var29;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if ((var7_int ^ -1) < (var29 ^ -1)) {
                          var7_int = var29;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      bg.field_O[var23] = var29;
                      break L8;
                    }
                  }
                  L11: {
                    if (param1) {
                      bk.field_q[var23] = var27 >> fd.field_g;
                      ad.field_h[var23] = var28 >> fd.field_g;
                      ek.field_K[var23] = var29;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  var23++;
                  continue L2;
                }
              }
              md.a(-2, param5, var7_int, var8, param3);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackIn_75_0 = (RuntimeException) (var7);

            stackIn_75_1 = new StringBuilder().append("rj.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L12;
            } else {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_79_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(',');

            if (param3 == null) {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "null";
              break L13;
            } else {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_80_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackIn_80_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_83_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "null";
              break L14;
            } else {
              stackIn_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackIn_84_2 = "{...}";
              break L14;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_76_0), stackIn_84_2 + ')');
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, boolean param4, int param5, int param6, int param7, String param8, int param9, long param10, boolean param11, int param12, uj param13) {
        try {
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                L1: {
                  id.field_b = new pa(param5);
                  dk.field_s = new pa(param1);
                  vl.field_a = param13;
                  fg.field_S = param2;
                  wh.field_c = param10;
                  ll.field_f = param8;
                  ed.field_e = param4;
                  mh.field_a = param7;
                  ae.field_x = param3;
                  na.field_c = param0;
                  db.field_y = param12;
                  ph.field_e = param9;
                  sd.field_h = param6;
                  if (!param11) {
                    break L1;
                  } else {
                    field_g = 2;
                    break L1;
                  }
                }
                L2: {
                  if (null != vl.field_a.field_d) {
                    try {
                      L3: {
                        cf.field_d = new rk(vl.field_a.field_d, 64, 0);
                        break L3;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var15 = (IOException) (Object) decompiledCaughtException;
                      throw new RuntimeException(var15.toString());
                    }
                    break L2;
                  } else {
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_13_0 = (RuntimeException) (var15_ref);

                stackIn_13_1 = new StringBuilder().append("rj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

                if (param8 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L4;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');

                if (param13 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L5;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L5;
                }
              }
              throw oj.a((Throwable) ((Object) stackIn_14_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "rj.toString()");
        }
    }

    static long a(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            stackIn_1_0 = param0 | param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var4), "rj.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        try {
            field_f = null;
            field_h = null;
            field_b = null;
            field_e = null;
            field_d = null;
            field_a = null;
            if (param0 != 10) {
                field_f = (lj) null;
            }
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "rj.E(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, ka[] param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = lg.field_d[param1][9];
            var6 = lg.field_d[param1][10];
            var7 = lg.field_d[param1][11];
            var8 = lg.field_d[param1][12];
            var9 = lg.field_d[param1][13];
            var10 = lg.field_d[param1][14];
            var11 = lg.field_d[param1][15];
            var12 = lg.field_d[param1][16];
            ne.a(param4, var8, var10, var9, param2, param4 - 2 * var5_int, var6, var5_int, param3, -(param0 * var9) + param4, -var11 + param2 + -var10, var12, -var7 + -var6 + param2, 128);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("rj.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param4 + ')');
        }
    }

    static {
        field_g = 0;
        field_e = new int[]{60, 60, 60};
        field_d = null;
        field_b = new ka[2];
        field_h = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
