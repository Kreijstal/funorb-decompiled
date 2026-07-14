/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cm extends ub {
    private int field_I;
    private int field_P;
    private int field_O;
    private int field_N;
    static int field_J;
    static int[] field_M;
    private int field_L;
    private int field_K;

    cm(se param0, int param1, int param2) {
        super(param0, param1, param2);
        ((cm) this).field_O = 0;
        ((cm) this).field_L = 0;
    }

    final static int a(boolean param0, int param1) {
        int var2 = 0;
        if (-1 >= param1) {
            // if_icmple L16
        } else {
            var2 += 16;
            param1 = param1 >>> 16;
        }
        if (!param0) {
            byte discarded$0 = cm.b(122, (byte) 64);
        }
        if (256 <= param1) {
            param1 = param1 >>> 8;
            var2 += 8;
        }
        if (-17 >= param1) {
            var2 += 4;
            param1 = param1 >>> 4;
        }
        if (!(-5 > param1)) {
            param1 = param1 >>> 2;
            var2 += 2;
        }
        if (param1 >= 1) {
            var2++;
            param1 = param1 >>> 1;
        }
        return var2 + param1;
    }

    void m(int param0) {
        if ((((cm) this).field_O ^ -1) >= -1) {
            return;
        }
        ((cm) this).a((byte) 117, ((cm) this).field_K, ((cm) this).field_P);
        ((cm) this).field_O = 0;
        if (param0 != 4000) {
            return;
        }
        ((cm) this).n(param0 ^ 8096);
    }

    public static void o(int param0) {
        if (param0 != 1) {
            return;
        }
        field_M = null;
    }

    boolean a(int param0) {
        ((cm) this).m(4000);
        if (param0 >= -11) {
            return true;
        }
        return super.a(-89);
    }

    void n(int param0) {
        if (param0 != 4096) {
            ((cm) this).field_I = 43;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param1 <= 0) {
            ((cm) this).a((byte) 99, param2, param3);
            return;
        }
        ((cm) this).field_P = param3;
        ((cm) this).field_O = param1;
        ((cm) this).field_N = ((cm) this).field_i;
        ((cm) this).field_L = 0;
        ((cm) this).field_K = param2;
        if (param0 > 0) {
            boolean discarded$0 = ((cm) this).k(-115);
        }
        ((cm) this).field_I = ((cm) this).field_n;
    }

    final static void a(int param0, int param1) {
        no.field_H = 1000000000L / (long)param1;
        if (param0 != 922104624) {
            field_M = null;
        }
    }

    final static void l(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Kickabout.field_G;
        int var1 = -19 % ((param0 - -57) / 45);
        lt.field_c = new ut[100];
        int var2 = wt.field_y.field_o;
        int var3 = wt.field_y.field_v;
        for (var4 = 0; (var4 ^ -1) > -101; var4++) {
            lt.field_c[var4] = new ut(var2, var3);
            iw.a(123, lt.field_c[var4]);
            var5 = (var4 << -391386032) / 100;
            wt.field_y.b(wt.field_y.field_o << 1020129891, wt.field_y.field_v << -1771681725, on.field_g << 662483523, on.field_f << 1044820227, -var5, 4096);
            ta.e(127);
        }
    }

    void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        var17 = Kickabout.field_G;
        on.g(param0 + 6, 35 + param2, ((cm) this).field_n + -12, -40 + ((cm) this).field_i, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 77 % ((param1 - -55) / 45);
        var8 = 0;
        var9 = param2;
        L0: while (true) {
          if (var4 <= var8) {
            var4 = 22;
            var5 = 194;
            var6 = 169;
            var8 = 0;
            var9 = 35 + param2;
            L1: while (true) {
              if (var4 <= var8) {
                aa.field_f.c(-90 + ((cm) this).field_n + param0, param2 - -10);
                ju.a(5 + param0, -127, 35 + param2, sk.field_a, -10 + ((cm) this).field_n);
                ju.a(param0, -125, -22 + (((cm) this).field_i + param2), vb.field_a, ((cm) this).field_n);
                var4 = ((cm) this).field_i - 79;
                var6 = 127;
                var5 = 169;
                var8 = 0;
                var9 = 57 + param2;
                L2: while (true) {
                  if (var8 >= var4) {
                    return;
                  } else {
                    var10 = var8 * (var6 + -var5) / var4 + var5;
                    var10 = var10 | (var10 << -841155824 | var10 << -551136184);
                    on.f(param0, var9, 6, var10);
                    on.f(-6 + ((cm) this).field_n + param0, var9, 6, var10);
                    var9++;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var10 = (var6 - var5) * var8 / var4 + var5;
                var10 = var10 | (var10 << 1599739696 | var10 << -926119768);
                on.f(param0, var9, 6, var10);
                on.f(-6 + ((cm) this).field_n + param0, var9, 6, var10);
                var9++;
                var8++;
                continue L1;
              }
            }
          } else {
            if (var9 >= on.field_e) {
              if (var9 < on.field_h) {
                L3: {
                  var10 = var8 * (var6 - var5) / var4 + var5;
                  var11 = 0;
                  var12 = ((cm) this).field_n;
                  if (var8 > 20) {
                    break L3;
                  } else {
                    L4: while (true) {
                      if (var11 > 20) {
                        break L3;
                      } else {
                        var13 = (-var11 + 20) * (20 + -var11) + (20 + -var8) * (20 - var8);
                        if ((var13 ^ -1) >= -463) {
                          if (var13 >= 420) {
                            var14 = var10 * (462 + -var13) / 42;
                            var14 = var14 | (var14 << 116560272 | var14 << 97598152);
                            on.field_a[var9 * on.field_g + param0 - -var11] = var14;
                            var11++;
                            continue L4;
                          } else {
                            break L3;
                          }
                        } else {
                          var11++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (-21 <= var8) {
                    var13 = var12;
                    var12 -= 21;
                    var14 = 0;
                    L6: while (true) {
                      L7: {
                        if (-21 < var14) {
                          break L7;
                        } else {
                          var15 = var14 * var14 + (-var8 + 20) * (20 - var8);
                          if (462 < var15) {
                            break L7;
                          } else {
                            if ((var15 ^ -1) > -421) {
                              var13 = var12 - -1;
                              var12++;
                              var14++;
                              continue L6;
                            } else {
                              var16 = (462 - var15) * var10 / 42;
                              var16 = var16 | (var16 << 922104624 | var16 << -492282904);
                              on.field_a[var12 + param0 + on.field_g * var9] = var16;
                              var12++;
                              var14++;
                              continue L6;
                            }
                          }
                        }
                      }
                      var12 = var13;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                var10 = var10 | (var10 << 1281368080 | var10 << 215254696);
                on.f(var11 + param0, var9, var12 + -var11, var10);
                var8++;
                var9++;
                continue L0;
              } else {
                var8++;
                var9++;
                continue L0;
              }
            } else {
              var8++;
              var9++;
              continue L0;
            }
          }
        }
    }

    final static byte b(int param0, byte param1) {
        if (param0 != -5) {
            field_J = 116;
        }
        return (byte)(param1 - -1);
    }

    boolean k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param0 <= (((cm) this).field_O ^ -1)) {
        } else {
            var2 = ((cm) this).field_P;
            var3 = ((cm) this).field_K;
            ((cm) this).field_L = ((cm) this).field_L + 1;
            if (((cm) this).field_L + 1 >= ((cm) this).field_O) {
                ((cm) this).field_O = 0;
                ((cm) this).n(4096);
            } else {
                var4 = (2 * ((cm) this).field_O + -((cm) this).field_L) * ((cm) this).field_L;
                var5 = ((cm) this).field_O * ((cm) this).field_O;
                var2 = var4 * (((cm) this).field_P + -((cm) this).field_I) / var5 + ((cm) this).field_I;
                var3 = (-((cm) this).field_N + ((cm) this).field_K) * var4 / var5 + ((cm) this).field_N;
            }
            ((cm) this).a((byte) 125, var3, var2);
        }
        return super.k(-1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = new int[4];
        field_M[2] = 4000;
        field_M[1] = 500;
        field_M[0] = 0;
        field_M[3] = 10000;
    }
}
