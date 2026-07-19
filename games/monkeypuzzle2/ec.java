/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ec {
    static String field_c;
    static qa field_e;
    static ad field_a;
    static Calendar field_b;
    static int field_d;

    final static int a(int param0) {
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            discarded$12 = wg.field_j.a(v.field_a, rc.field_g, true, true);
            wg.field_j.l(126);
            L1: while (true) {
              L2: {
                L3: {
                  if (!ba.a(param0 + -2)) {
                    break L3;
                  } else {
                    discarded$13 = wg.field_j.a(oa.field_H, 109, rd.field_p);
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (-1 != gb.field_f) {
                  break L2;
                } else {
                  if (!ah.field_h) {
                    if (cf.field_b != ed.field_c) {
                      if (param0 == 1) {
                        if (!bb.field_a.a(0)) {
                          stackOut_21_0 = 1;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (ch.field_d != cf.field_b) {
                            stackOut_26_0 = -1;
                            stackIn_27_0 = stackOut_26_0;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            stackOut_24_0 = 2;
                            stackIn_25_0 = stackOut_24_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      } else {
                        stackOut_17_0 = -20;
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackOut_11_0 = 3;
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var1_int = gb.field_f;
              qh.a(-1, true);
              stackOut_8_0 = var1_int;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "ec.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_25_0;
                  } else {
                    return stackIn_27_0;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != 123) {
          field_b = (Calendar) null;
          field_e = null;
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        sj var4_ref_sj = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        sj var17 = null;
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        var19 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            ma.field_c = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = ua.field_x.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              L2: {
                if (var3 >= var1_int) {
                  var3 = ma.field_c[9] >> 974711240;
                  break L2;
                } else {
                  var4_ref_sj = ua.field_x[var3];
                  var17 = var4_ref_sj;
                  var17 = var4_ref_sj;
                  var4_ref_sj.c(74);
                  bg.a(var3, 82);
                  var5 = var4_ref_sj.field_q + var4_ref_sj.field_G >> 742377857;
                  var6 = var4_ref_sj.field_b + var4_ref_sj.field_j >> -287863583;
                  var7 = var4_ref_sj.field_t + var4_ref_sj.field_x >> 48906273;
                  var8 = ma.field_c[9] >> -848235998;
                  var9 = ma.field_c[10] >> 1922782274;
                  var10_int = ma.field_c[11] >> 1505373058;
                  var11 = var9 * ik.field_i[4] + (var8 * ik.field_i[3] - -(ik.field_i[5] * var10_int)) >> 810355118;
                  var12 = ik.field_i[6] * var8 + (ik.field_i[7] * var9 - -(var10_int * ik.field_i[8])) >> -1099019186;
                  var13 = var10_int * ik.field_i[11] + (ik.field_i[9] * var8 + ik.field_i[10] * var9) >> -1494661682;
                  var2[var3] = var7 * var13 + var11 * var5 + var12 * var6 >> 5871824;
                  var3++;
                  if (var19 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: {
                var4 = ma.field_c[10] >> 743717576;
                var5 = ma.field_c[11] >> 1946634888;
                var6 = uj.field_i << 1437612964;
                var7 = 0;
                var8 = sb.a((byte) 79, var6) >> 449022120;
                var9 = r.a((byte) 71, var6) >> -1844742712;
                if (0 == (ei.field_a ^ -1)) {
                  break L3;
                } else {
                  if ((p.field_a ^ -1) != 0) {
                    var8 = 240 + -p.field_a;
                    var7 = -320 + ei.field_a;
                    var9 = -128;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var10 = 256.0 / Math.sqrt((double)(var8 * var8 + (var7 * var7 - -(var9 * var9))));
                var8 = (int)((double)var8 * var10);
                var9 = (int)((double)var9 * var10);
                var7 = (int)((double)var7 * var10);
                var12 = -var3 + var7;
                var13 = -var4 + var8;
                if (param0 == -128) {
                  break L4;
                } else {
                  field_b = (Calendar) null;
                  break L4;
                }
              }
              var14 = -var5 + var9;
              var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var12 * var12 + var13 * var13));
              var12 = (int)((double)var12 * var10);
              var13 = (int)((double)var13 * var10);
              var14 = (int)((double)var14 * var10);
              var15 = 0;
              L5: while (true) {
                stackOut_14_0 = ua.field_x.length;
                stackOut_14_1 = var15;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                L6: while (true) {
                  if (stackIn_15_0 <= stackIn_15_1) {
                    break L0;
                  } else {
                    var16 = 0;
                    if (var19 == 0) {
                      var17_int = 1;
                      L7: while (true) {
                        if (ua.field_x.length <= var17_int) {
                          var21[var16] = -2147483648;
                          var17 = ua.field_x[var16];
                          bg.a(var16, param0 + 255);
                          var18 = 0;
                          L8: while (true) {
                            L9: {
                              if ((var18 ^ -1) <= -4) {
                                b.a(ik.field_i, false, ma.field_c, false, var17, (byte) -91, true);
                                ja.a(var14, var9, 46, var13, var8, var17, var12, var7);
                                var15++;
                                break L9;
                              } else {
                                ik.field_i[var18] = ik.field_i[var18] + nl.field_a[var15][var18];
                                var18++;
                                if (var19 != 0) {
                                  break L9;
                                } else {
                                  continue L8;
                                }
                              }
                            }
                            continue L5;
                          }
                        } else {
                          stackOut_20_0 = var21[var16] ^ -1;
                          stackOut_20_1 = var21[var17_int] ^ -1;
                          stackIn_15_0 = stackOut_20_0;
                          stackIn_15_1 = stackOut_20_1;
                          stackIn_21_0 = stackOut_20_0;
                          stackIn_21_1 = stackOut_20_1;
                          if (var19 != 0) {
                            continue L6;
                          } else {
                            L10: {
                              if (stackIn_21_0 > stackIn_21_1) {
                                var16 = var17_int;
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            var17_int++;
                            continue L7;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "ec.B(" + param0 + ')');
        }
    }

    final static String a(ad param0, String param1, String param2, int param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_1_0 = null;
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
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param0.a(param3 ^ 65)) {
              L1: {
                if (param3 == 0) {
                  break L1;
                } else {
                  field_b = (Calendar) null;
                  break L1;
                }
              }
              stackOut_5_0 = param2 + " - " + param0.b(true) + "%";
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) (param1);
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("ec.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_c = "Password: ";
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
