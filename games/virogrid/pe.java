/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends l {
    jh field_g;
    l field_h;
    static int[] field_j;
    static int field_k;
    int field_i;

    final static void a(java.awt.Component param0, i param1, pd param2, boolean param3, byte param4, int param5) {
        if (param4 >= -4) {
            return;
        }
        try {
            wl.a(param2, param1, 1024, 106, param3, param0, param5, param5);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "pe.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Virogrid.field_F ? 1 : 0;
        try {
            var5_int = df.field_e * param0 + param2;
            var6 = param4 * df.field_e + var5_int;
            var7 = (param1 & 16711422) >> -853483999;
            var8 = 0;
            var9 = var5_int;
            while (var6 > var9) {
                df.field_d[var9] = 0 == var8 % 2 ? var7 : param1;
                var8++;
                var9 = var9 + df.field_e;
            }
            var9 = -57 / ((-54 - param3) / 53);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "pe.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_j = null;
        int var1 = -99 / ((-23 - param0) / 53);
    }

    final static String a(String param0, String param1, eh param2, int param3, int param4) {
        RuntimeException var5 = null;
        String stackIn_3_0 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!param2.c(param4)) {
              stackOut_2_0 = (String) (param0);
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackOut_4_0 = param1 + " - " + param2.b((byte) 113, param3) + "%";
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5);
            stackOut_6_1 = new StringBuilder().append("pe.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_5_0;
        }
    }

    final static void a(int param0) {
        String[][] dupTemp$2 = null;
        int[][] dupTemp$3 = null;
        RuntimeException var1 = null;
        int var2 = 0;
        dh var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        hg var13 = null;
        int var14 = 0;
        int var15 = 0;
        hg var16 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var13 = sh.field_qb;
            var16 = var13;
            var2 = var16.g(11132);
            var3 = (dh) ((Object) bl.field_D.a((byte) -67));
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 == var3.field_i) {
                    break L2;
                  } else {
                    var3 = (dh) ((Object) bl.field_D.a(16213));
                    continue L1;
                  }
                }
              }
              if (var3 != null) {
                L3: {
                  var4 = var16.g(param0 + 11133);
                  if (param0 != (var4 ^ -1)) {
                    rc.field_h[0] = mi.field_d;
                    var5 = var3.field_g;
                    var6_int = 1;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        fj.a((byte) 125, var5, var4);
                        var6_int = 0;
                        L5: while (true) {
                          if (var4 <= var6_int) {
                            sb.a(var5, (byte) 46);
                            dupTemp$2 = new String[2][var5];
                            var3.field_j = dupTemp$2;
                            var6 = dupTemp$2;
                            dupTemp$3 = new int[2][4 * var5];
                            var3.field_t = dupTemp$3;
                            var7 = dupTemp$3;
                            var8 = ka.field_m;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var14 = 0;
                                var9 = var14;
                                var15 = 0;
                                var10 = var15;
                                L7: while (true) {
                                  if (var8 <= var14) {
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = lk.field_Tb[var14 + var5];
                                      var6[1][var15] = rc.field_h[var11];
                                      var7[1][4 * var15] = wh.field_c[var11];
                                      var7[1][1 + 4 * var15] = vc.field_jb[var11];
                                      var7[1][4 * var15 + 2] = tg.field_A[var11];
                                      var7[1][var15 * 4 - -3] = kf.field_j[var11];
                                      if (!jc.a(rc.field_h[var11], true)) {
                                        break L8;
                                      } else {
                                        if (-1 != (vc.field_jb[var11] - (-tg.field_A[var11] - kf.field_j[var11]) ^ -1)) {
                                          break L8;
                                        } else {
                                          var6[1][var15] = null;
                                          var15--;
                                          break L8;
                                        }
                                      }
                                    }
                                    var14++;
                                    var15++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = lk.field_Tb[var9];
                                  var6[0][var10] = rc.field_h[var11];
                                  var7[0][var10 * 4] = wh.field_c[var11];
                                  var7[0][4 * var10 + 1] = vc.field_jb[var11];
                                  var7[0][2 + 4 * var10] = tg.field_A[var11];
                                  var7[0][3 + 4 * var10] = kf.field_j[var11];
                                  if (jc.a(rc.field_h[var11], true)) {
                                    if (0 == vc.field_jb[var11] - (-tg.field_A[var11] + -kf.field_j[var11])) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var10++;
                                var9++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              lj.a(true, var16);
                              if (var6_int == 0) {
                                var3.field_m = ug.field_b;
                                var3.field_u = lm.field_j;
                                var3.field_h = ve.field_s;
                                var3.field_q = ng.field_X;
                                fd.a(ng.field_X, lm.field_j, param0 ^ -1, ve.field_s, var6_int, ug.field_b);
                                break L10;
                              } else {
                                fd.a(ng.field_X, lm.field_j, param0 ^ -1, ve.field_s, var6_int, ug.field_b);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        rc.field_h[var6_int] = var13.h(-121);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var3.field_s = true;
                var3.a(false);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                tn.a(false);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "pe.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        db.field_k = null;
        k.field_c = null;
        gb.field_F = null;
        lj.field_j = (byte[][]) null;
        if (param0 != -28) {
            field_k = 63;
        }
        mb.field_bb = null;
        el.field_w = null;
    }

    pe(jh param0, l param1) {
        try {
            this.field_g = param0;
            this.field_i = param0.l();
            this.field_h = param1;
            this.field_g.f(this.field_i * ag.field_c + 128 >> -1370145592);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = 0;
    }
}
