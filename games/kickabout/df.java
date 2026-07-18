/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends dj {
    static int field_E;
    static int field_H;
    static iw field_I;
    static String[] field_F;
    static hd field_G;

    final static void d() {
        nl var1 = null;
        nl var2 = null;
        if (!(0 == et.field_d.field_R[1].field_g)) {
            if (!(et.field_d.field_V.field_m != 1)) {
                var1 = et.field_d.a((byte) 104, 0);
                var2 = et.field_d.a((byte) -71, 1);
                ej.b(var1.f(-121) + -var2.f(-99), -2, var1.a(true) + -var2.a(true), 10);
            }
            et.field_d.field_R[1].field_g = 0;
        }
    }

    final static vn a(int param0, int param1, boolean param2, int param3) {
        boolean[][] var4 = null;
        boolean[][] var5 = null;
        int var6 = 0;
        int var7 = 0;
        vn var8 = null;
        int var9 = 0;
        int var10 = 0;
        short[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        boolean[][] var20 = null;
        int var21 = 0;
        boolean[][] var22 = null;
        boolean[][] var24 = null;
        boolean[][] var25 = null;
        boolean[][] var27 = null;
        boolean[][] var28 = null;
        boolean[][] var30 = null;
        boolean[][] var31 = null;
        short[] var32 = null;
        boolean[][] var33 = null;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var19 = Kickabout.field_G;
        var31 = je.field_g[param0].field_l[0];
        var28 = var31;
        var25 = var28;
        var22 = var25;
        var20 = var22;
        var4 = var20;
        var33 = je.field_g[param0].field_l[1];
        var30 = var33;
        var27 = var30;
        var24 = var27;
        var5 = var24;
        var6 = (short)param3;
        var7 = (short)param1;
        var8 = new vn(of.field_f, true, false, true, true);
        var32 = of.field_f.field_p;
        var12 = var8.field_p;
        var13 = 0;
        var14 = 0;
        L0: while (true) {
          if (var14 >= var31.length) {
            var33 = var30;
            var13 = 0;
            var14 = 0;
            L1: while (true) {
              if (var33.length <= var14) {
                return var8;
              } else {
                var15 = 20;
                var16 = 0;
                L2: while (true) {
                  if (var16 >= var33[0].length) {
                    var13 += 3;
                    var14++;
                    continue L1;
                  } else {
                    L3: {
                      var17 = 9 - var16;
                      if (var5[-var14 + 12][var17]) {
                        stackOut_21_0 = var7;
                        stackIn_22_0 = stackOut_21_0;
                        break L3;
                      } else {
                        stackOut_20_0 = var6;
                        stackIn_22_0 = stackOut_20_0;
                        break L3;
                      }
                    }
                    var10 = stackIn_22_0;
                    var9 = ks.a(var15, var13, 119, 6);
                    var15 += 5;
                    var21 = 0;
                    var18 = var21;
                    L4: while (true) {
                      if (var32.length <= var21) {
                        var16++;
                        continue L2;
                      } else {
                        if (var32[var21] == var9) {
                          var12[var21] = (short)var10;
                          var21++;
                          continue L4;
                        } else {
                          var21++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            var15 = 20;
            var16 = 0;
            L5: while (true) {
              if (var16 >= var31[0].length) {
                var13 += 3;
                var14++;
                continue L0;
              } else {
                L6: {
                  var17 = var16;
                  if (!var20[-var14 + 12][var17]) {
                    stackOut_6_0 = var6;
                    stackIn_7_0 = stackOut_6_0;
                    break L6;
                  } else {
                    stackOut_5_0 = var7;
                    stackIn_7_0 = stackOut_5_0;
                    break L6;
                  }
                }
                var10 = stackIn_7_0;
                var9 = ks.a(var15, var13, 120, 7);
                var18 = 0;
                L7: while (true) {
                  if (var18 >= var32.length) {
                    var15 += 5;
                    var16++;
                    continue L5;
                  } else {
                    if (var32[var18] == var9) {
                      var12[var18] = (short)var10;
                      var18++;
                      continue L7;
                    } else {
                      var18++;
                      continue L7;
                    }
                  }
                }
              }
            }
          }
        }
    }

    df() {
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4_int = 0;
        ot var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        ot stackIn_22_0 = null;
        ot stackOut_21_0 = null;
        ot stackOut_20_0 = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var9 = Kickabout.field_G;
          super.a(param0, param1);
          if (((df) this).field_C == 0) {
            on.a(((df) this).field_j + 40, 198, 560, 200, 10, 65793, 128);
            ms.a(wa.field_b, ((df) this).field_j + 40, 560, false, 0, 126);
            un.field_d.a(c.field_h.toLowerCase(), 56 + ((df) this).field_j, 222, 16777215, -1);
            var3 = 0;
            L1: while (true) {
              if (var3 >= 3) {
                break L0;
              } else {
                pb.field_C.c(ml.field_t[var3], 150 + ((df) this).field_j, 256 - -(50 * var3), 16777215, -1);
                int discarded$1 = pb.field_C.a(jq.field_a[var3], ((df) this).field_j + 170, 243 - -(var3 * 50), 420, 300, 16777215, -1, 0, 0, 16);
                var3++;
                continue L1;
              }
            }
          } else {
            if (((df) this).field_C == 1) {
              var3 = 0;
              L2: while (true) {
                if (var3 >= 2) {
                  var3 = 0;
                  L3: while (true) {
                    if (var3 >= 4) {
                      break L0;
                    } else {
                      L4: {
                        if (0 == (var3 & 1)) {
                          stackOut_21_0 = eq.field_h;
                          stackIn_22_0 = stackOut_21_0;
                          break L4;
                        } else {
                          stackOut_20_0 = ml.field_q;
                          stackIn_22_0 = stackOut_20_0;
                          break L4;
                        }
                      }
                      var4 = stackIn_22_0;
                      ((ut) (Object) var4).c(var3 * 45 + 380 + ((df) this).field_j, 145);
                      var3++;
                      continue L3;
                    }
                  }
                } else {
                  L5: {
                    if (var3 != 1) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L5;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L5;
                    }
                  }
                  L6: {
                    var4_int = stackIn_8_0;
                    if (var4_int != 0) {
                      stackOut_10_0 = 345;
                      stackIn_11_0 = stackOut_10_0;
                      break L6;
                    } else {
                      stackOut_9_0 = 50;
                      stackIn_11_0 = stackOut_9_0;
                      break L6;
                    }
                  }
                  L7: {
                    var5 = stackIn_11_0;
                    var5 = var5 + ((df) this).field_j;
                    var6 = 146;
                    on.a(-10 + var5, 126, 265, 270, 10, 65793, 140);
                    if (var3 != 1) {
                      break L7;
                    } else {
                      var6 += 50;
                      break L7;
                    }
                  }
                  var7 = 0;
                  L8: while (true) {
                    if (var7 >= tj.field_w[var3].length) {
                      var3++;
                      continue L2;
                    } else {
                      var8 = tj.field_w[var3][var7];
                      var6 = var6 + (20 + pb.field_C.a(var8, var5, var6, 245, 999, 16777215, -1, 0, 0, 16) * 16);
                      var7++;
                      continue L8;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    public static void c() {
        field_F = null;
        field_I = null;
        field_G = null;
    }

    final static int g() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        var3 = Kickabout.field_G;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!nk.b((byte) -59)) {
                L2: {
                  int discarded$25 = 16756;
                  int discarded$26 = 16756;
                  re.field_c.a(-21174, ts.b(n.field_m, el.field_A), ts.b(vc.field_y, sm.field_q));
                  if (!re.field_c.c(-1)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (re.field_c.field_e >= 0) {
                      var2 = gl.field_d[re.field_c.field_e];
                      if (2 == var2) {
                        int discarded$27 = -77;
                        dh.c();
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_13_0 = var2;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                re.field_c.d(105);
                if (!re.field_c.c(-1)) {
                  continue L1;
                } else {
                  var1_int = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "df.K(" + -61 + ')');
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = 0;
    }
}
