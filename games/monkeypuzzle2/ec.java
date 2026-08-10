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
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            wg.field_j.a(v.field_a, rc.field_g, true, true);
            wg.field_j.l(126);
            L1: while (true) {
              if (!ba.a(param0 + -2)) {
                if (-1 != gb.field_f) {
                  var1_int = gb.field_f;
                  qh.a(-1, true);
                  stackIn_7_0 = var1_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (!ah.field_h) {
                    if (cf.field_b != ed.field_c) {
                      if (param0 == 1) {
                        if (!bb.field_a.a(0)) {
                          stackIn_20_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (ch.field_d != cf.field_b) {
                            stackIn_25_0 = -1;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            stackIn_23_0 = 2;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      } else {
                        stackIn_16_0 = -20;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackIn_13_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_10_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                wg.field_j.a(oa.field_H, 109, rd.field_p);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "ec.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0;
                  } else {
                    return stackIn_25_0;
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
        }
        field_e = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void b(int param0) {
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
        int var17_int = 0;
        sj var17 = null;
        int var18 = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
              if (var3 >= var1_int) {
                L2: {
                  var3 = ma.field_c[9] >> 974711240;
                  var4 = ma.field_c[10] >> 743717576;
                  var5 = ma.field_c[11] >> 1946634888;
                  var6 = uj.field_i << 1437612964;
                  var7 = 0;
                  var8 = sb.a((byte) 79, var6) >> 449022120;
                  var9 = r.a((byte) 71, var6) >> -1844742712;
                  if (0 == (ei.field_a ^ -1)) {
                    break L2;
                  } else {
                    if ((p.field_a ^ -1) != 0) {
                      var8 = 240 + -p.field_a;
                      var7 = -320 + ei.field_a;
                      var9 = -128;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var10 = 256.0 / Math.sqrt((double)(var8 * var8 + (var7 * var7 - -(var9 * var9))));
                  var8 = (int)((double)var8 * var10);
                  var9 = (int)((double)var9 * var10);
                  var7 = (int)((double)var7 * var10);
                  var12 = -var3 + var7;
                  var13 = -var4 + var8;
                  if (param0 == -128) {
                    break L3;
                  } else {
                    field_b = (Calendar) null;
                    break L3;
                  }
                }
                var14 = -var5 + var9;
                var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var12 * var12 + var13 * var13));
                var12 = (int)((double)var12 * var10);
                var13 = (int)((double)var13 * var10);
                var14 = (int)((double)var14 * var10);
                var15 = 0;
                L4: while (true) {
                  if (ua.field_x.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L5: while (true) {
                      if (ua.field_x.length <= var17_int) {
                        var21[var16] = -2147483648;
                        var17 = ua.field_x[var16];
                        bg.a(var16, param0 + 255);
                        var18 = 0;
                        L6: while (true) {
                          if ((var18 ^ -1) <= -4) {
                            b.a(ik.field_i, false, ma.field_c, false, var17, (byte) -91, true);
                            ja.a(var14, var9, 46, var13, var8, var17, var12, var7);
                            var15++;
                            continue L4;
                          } else {
                            ik.field_i[var18] = ik.field_i[var18] + nl.field_a[var15][var18];
                            var18++;
                            continue L6;
                          }
                        }
                      } else {
                        L7: {
                          if ((var21[var16] ^ -1) > (var21[var17_int] ^ -1)) {
                            var16 = var17_int;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var17_int++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                var4_ref_sj = ua.field_x[var3];
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
                continue L1;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = param2 + " - " + param0.b(true) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) (param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("ec.C(");

            if (param0 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ',' + param3 + ')');
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
