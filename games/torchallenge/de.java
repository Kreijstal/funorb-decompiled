/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de {
    static ka field_a;
    static ll field_b;
    static boolean[][] field_c;
    static int field_d;

    public static void a() {
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static ka[] a(boolean param0) {
        ka[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        byte[] var23 = null;
        int[] var24 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        var1 = new ka[vl.field_b];
        var2 = 0;
        L0: while (true) {
          if (vl.field_b <= var2) {
            int discarded$1 = 0;
            p.a();
            return var1;
          } else {
            var3 = lg.field_e[var2] * pg.field_r[var2];
            var21 = h.field_a[var2];
            if (vd.field_c[var2]) {
              var23 = gf.field_t[var2];
              var24 = new int[var3];
              var20 = var24;
              var16 = var20;
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L1: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (ka) (Object) new el(ij.field_B, le.field_g, ug.field_e[var2], dd.field_t[var2], pg.field_r[var2], lg.field_e[var2], var24);
                  var2++;
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = p.a(jh.a(255, (int) var23[var7]) << 24, td.field_m[jh.a(255, (int) var21[var7])]);
                  var7++;
                  continue L1;
                }
              }
            } else {
              var9 = new int[var3];
              var22 = var9;
              var6_int = 0;
              L2: while (true) {
                if (var3 <= var6_int) {
                  var1[var2] = new ka(ij.field_B, le.field_g, ug.field_e[var2], dd.field_t[var2], pg.field_r[var2], lg.field_e[var2], var22);
                  var2++;
                  var2++;
                  continue L0;
                } else {
                  var9[var6_int] = td.field_m[jh.a((int) var21[var6_int], 255)];
                  var6_int++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static boolean a(int param0) {
        gh var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        gh var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (gh) (Object) pf.field_d.c((byte) -66);
            var1 = var4;
            if (var1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var2 = 0;
              L1: while (true) {
                if (var1.field_p <= var2) {
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L2: {
                    if (null != var4.field_j[var2]) {
                      if (var4.field_j[var2].field_d != 0) {
                        break L2;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0 != 0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (null != var4.field_q[var2]) {
                      if (var4.field_q[var2].field_d != 0) {
                        break L3;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var2++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1_ref, "de.D(" + -1 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        boolean[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = nh.field_hb.length;
            if (ma.field_j >= var1_int) {
              return;
            } else {
              var2 = ra.field_k[ma.field_j];
              if (var2[a.field_c]) {
                var3 = nh.field_hb[ma.field_j];
                var4 = we.field_l[ma.field_j];
                var5 = 200;
                var6 = var4 * var5;
                if (param0 == -131073) {
                  L1: {
                    var7 = var3 * var6;
                    var8 = ef.field_k % var7 / var6;
                    cj.field_j = -var8 + a.field_c;
                    if (cj.field_j >= 0) {
                      break L1;
                    } else {
                      cj.field_j = cj.field_j + var3;
                      break L1;
                    }
                  }
                  var10 = 0;
                  var8 = var10;
                  L2: while (true) {
                    if (3 <= var10) {
                      break L0;
                    } else {
                      L3: {
                        if (lj.field_n[var10] != null) {
                          lj.field_n[var10].field_kb = 0;
                          var10++;
                          break L3;
                        } else {
                          var10++;
                          break L3;
                        }
                      }
                      var10++;
                      continue L2;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "de.B(" + param0 + ')');
        }
    }

    final static boolean a(int param0, lj param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 0;
            stackOut_0_0 = param1.b((byte) 79);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("de.F(").append(30).append(',');
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
          throw oj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (param1 != 0) {
          if (param1 < 0) {
            throw new IllegalArgumentException("");
          } else {
            if (32768 <= param1) {
              if (param1 >= 131072) {
                if (param1 >= 33554432) {
                  if (param1 < 536870912) {
                    if (param1 >= 134217728) {
                      var2 = 6;
                      param1 = param1 >> (var2 << 1);
                      return dd.field_p[param1 - 32768] << var2;
                    } else {
                      var2 = 5;
                      param1 = param1 >> (var2 << 1);
                      return dd.field_p[param1 - 32768] << var2;
                    }
                  } else {
                    var2 = 7;
                    param1 = param1 >> (var2 << 1);
                    return dd.field_p[param1 - 32768] << var2;
                  }
                } else {
                  if (2097152 > param1) {
                    if (param1 < 524288) {
                      var2 = 1;
                      param1 = param1 >> (var2 << 1);
                      return dd.field_p[param1 - 32768] << var2;
                    } else {
                      var2 = 2;
                      param1 = param1 >> (var2 << 1);
                      return dd.field_p[param1 - 32768] << var2;
                    }
                  } else {
                    if (param1 >= 8388608) {
                      var2 = 4;
                      param1 = param1 >> (var2 << 1);
                      return dd.field_p[param1 - 32768] << var2;
                    } else {
                      var2 = 3;
                      param1 = param1 >> (var2 << 1);
                      return dd.field_p[param1 - 32768] << var2;
                    }
                  }
                }
              } else {
                return dd.field_p[-32768 + param1];
              }
            } else {
              if (param1 < 128) {
                if (param1 < 8) {
                  if (param1 >= 2) {
                    var2 = 7;
                    param1 = param1 << (var2 << 1);
                    return dd.field_p[param1 - 32768] >> var2;
                  } else {
                    return 256;
                  }
                } else {
                  if (param1 < 32) {
                    var2 = 6;
                    param1 = param1 << (var2 << 1);
                    return dd.field_p[param1 - 32768] >> var2;
                  } else {
                    var2 = 5;
                    param1 = param1 << (var2 << 1);
                    return dd.field_p[param1 - 32768] >> var2;
                  }
                }
              } else {
                if (2048 <= param1) {
                  if (param1 < 8192) {
                    var2 = 2;
                    param1 = param1 << (var2 << 1);
                    return dd.field_p[param1 - 32768] >> var2;
                  } else {
                    var2 = 1;
                    param1 = param1 << (var2 << 1);
                    return dd.field_p[param1 - 32768] >> var2;
                  }
                } else {
                  if (param1 < 512) {
                    var2 = 4;
                    param1 = param1 << (var2 << 1);
                    return dd.field_p[param1 - 32768] >> var2;
                  } else {
                    var2 = 3;
                    param1 = param1 << (var2 << 1);
                    return dd.field_p[param1 - 32768] >> var2;
                  }
                }
              }
            }
          }
        } else {
          return 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
        field_c = new boolean[][]{new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[3], new boolean[1], new boolean[1]};
        field_b = new ll();
        field_d = 0;
    }
}
