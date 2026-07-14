/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends bb {
    static boolean field_L;
    private id field_K;
    static ed field_O;
    int field_M;
    static int field_N;
    int field_P;
    private int field_R;
    static boolean field_Q;

    final static void a(int param0, int param1, dd param2, int param3, int param4, int param5) {
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
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        L0: {
          var20 = fleas.field_A ? 1 : 0;
          var6 = (param5 - param0 << 1723611368) / param2.field_x;
          var7 = var6 * param2.field_q + (param0 << 1612409736);
          param3 = param3 + param2.field_q;
          param1 = param1 + param2.field_v;
          var8 = param3 - -(gb.field_d * param1);
          var9 = 0;
          var10 = param2.field_t;
          if (param4 == 2147483647) {
            break L0;
          } else {
            d.j(-47);
            break L0;
          }
        }
        L1: {
          var11 = param2.field_w;
          var12 = -var11 + gb.field_d;
          var13 = 0;
          if (gb.field_b <= param1) {
            break L1;
          } else {
            var14 = -param1 + gb.field_b;
            param1 = gb.field_b;
            var8 = var8 + gb.field_d * var14;
            var9 = var9 + var14 * var11;
            var10 = var10 - var14;
            break L1;
          }
        }
        L2: {
          if (var10 + param1 <= gb.field_i) {
            break L2;
          } else {
            var10 = var10 - (var10 + (param1 - gb.field_i));
            break L2;
          }
        }
        L3: {
          if (gb.field_l > param3) {
            var14 = gb.field_l - param3;
            var8 = var8 + var14;
            var9 = var9 + var14;
            var13 = var13 + var14;
            param3 = gb.field_l;
            var11 = var11 - var14;
            var12 = var12 + var14;
            var7 = var7 + var6 * var14;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (var11 + param3 <= gb.field_h) {
            break L4;
          } else {
            var14 = var11 + (param3 - gb.field_h);
            var11 = var11 - var14;
            var13 = var13 + var14;
            var12 = var12 + var14;
            break L4;
          }
        }
        L5: {
          if (var11 <= 0) {
            break L5;
          } else {
            if (var10 >= -1) {
              break L5;
            } else {
              param1 = -var10;
              L6: while (true) {
                if (-1 <= param1) {
                  return;
                } else {
                  var14 = var7;
                  param3 = -var11;
                  L7: while (true) {
                    if (-1 >= param3) {
                      var8 = var8 + var12;
                      var9 = var9 + var13;
                      param1++;
                      continue L6;
                    } else {
                      var15 = var14 >> -2068757560;
                      var16 = 256 - var15;
                      var14 = var14 + var6;
                      if (-1 <= var15) {
                        var9++;
                        var17 = param2.field_B[var9];
                        if (0 != var17) {
                          if (255 < var15) {
                            gb.field_a[var8] = var17;
                            var8++;
                            param3++;
                            continue L7;
                          } else {
                            var18 = gb.field_a[var8];
                            var19 = (16711935 & var17) * var15 + (var18 & 16711935) * var16 >> -129030680 & 16711935;
                            gb.field_a[var8] = (sc.a(16711908, sc.a(var17, 65280) * var15 + sc.a(65280, var18) * var16) >> -1641925464) + var19;
                            var8++;
                            param3++;
                            continue L7;
                          }
                        } else {
                          var8++;
                          param3++;
                          continue L7;
                        }
                      } else {
                        var8++;
                        var9++;
                        param3++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static si a(int param0, ih param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        si var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = fleas.field_A ? 1 : 0;
        var2 = param1.b(8, (byte) -87);
        if (-1 <= (var2 ^ -1)) {
          L0: {
            var3 = fb.a((byte) 98, param1) ? 1 : 0;
            var4 = fb.a((byte) 98, param1) ? 1 : 0;
            var5 = new si();
            var5.field_w = (short)param1.b(16, (byte) -87);
            var5.field_n = qg.a((byte) 125, var5.field_n, 16, param1);
            var5.field_f = qg.a((byte) 125, var5.field_f, 16, param1);
            var5.field_P = qg.a((byte) 125, var5.field_P, 16, param1);
            var5.field_j = (short)param1.b(16, (byte) -87);
            var5.field_Q = qg.a((byte) 125, var5.field_Q, 16, param1);
            var5.field_M = qg.a((byte) 125, var5.field_M, 16, param1);
            var5.field_N = qg.a((byte) 125, var5.field_N, 16, param1);
            if (var3 == 0) {
              break L0;
            } else {
              var5.field_p = (short)param1.b(16, (byte) -87);
              var5.field_r = qg.a((byte) 125, var5.field_r, 16, param1);
              var5.field_K = qg.a((byte) 125, var5.field_K, 16, param1);
              var5.field_x = qg.a((byte) 125, var5.field_x, 16, param1);
              var5.field_D = qg.a((byte) 125, var5.field_D, 16, param1);
              var5.field_F = qg.a((byte) 125, var5.field_F, 16, param1);
              var5.field_u = qg.a((byte) 125, var5.field_u, 16, param1);
              break L0;
            }
          }
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              int discarded$2 = param1.b(16, (byte) -87);
              var5.field_E = qg.a((byte) 125, var5.field_E, 16, param1);
              var5.field_i = qg.a((byte) 125, var5.field_i, 16, param1);
              var5.field_t = qg.a((byte) 125, var5.field_t, 16, param1);
              var5.field_q = qg.a((byte) 125, var5.field_q, 16, param1);
              var5.field_l = qg.a((byte) 125, var5.field_l, 16, param1);
              break L1;
            }
          }
          L2: {
            if (!fb.a((byte) 98, param1)) {
              break L2;
            } else {
              var5.field_s = qg.a((byte) 125, var5.field_s, 16, param1);
              break L2;
            }
          }
          L3: {
            if (!fb.a((byte) 98, param1)) {
              break L3;
            } else {
              var5.field_J = bf.a(param1, 8, var5.field_J, 16);
              var6 = 0;
              var7 = 0;
              L4: while (true) {
                if (var5.field_J.length <= var7) {
                  if (var6 != 0) {
                    var5.field_h = (byte)(1 + var6);
                    break L3;
                  } else {
                    var5.field_J = null;
                    break L3;
                  }
                } else {
                  if ((var5.field_J[var7] & 255) > var6) {
                    var6 = var5.field_J[var7] & 255;
                    var7++;
                    continue L4;
                  } else {
                    var7++;
                    continue L4;
                  }
                }
              }
            }
          }
          var6 = 37 / ((87 - param0) / 37);
          return var5;
        } else {
          throw new IllegalStateException("" + var2);
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        L0: {
          if (0 > param0) {
            break L0;
          } else {
            if (((d) this).field_K.b(0) > param0) {
              var3 = 76 % ((param1 - 14) / 59);
              return ((d) this).field_K.b(param0, false);
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = fleas.field_A ? 1 : 0;
        if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
          return false;
        } else {
          L0: {
            var8 = param4 - (param6 - -((d) this).field_M);
            var9 = ((d) this).field_u - 2 * ((d) this).field_M;
            if (var8 > var9) {
              var8 = var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 >= (var8 ^ -1)) {
              break L1;
            } else {
              var8 = 0;
              break L1;
            }
          }
          L2: {
            var8 = ((d) this).field_R * var8 / var9;
            if (param5 != 1) {
              if (-3 != (param5 ^ -1)) {
                break L2;
              } else {
                var10 = 2147483647;
                var11 = -1;
                var12 = 0;
                L3: while (true) {
                  if (var12 >= ((d) this).field_K.b(0)) {
                    if (0 > var11) {
                      break L2;
                    } else {
                      ((d) this).field_K.b(1, var11);
                      break L2;
                    }
                  } else {
                    var13 = -var8 + ((d) this).field_K.b(var12, false);
                    var13 = var13 * var13;
                    if (var10 > var13) {
                      var11 = var12;
                      var10 = var13;
                      var12++;
                      continue L3;
                    } else {
                      var12++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              ((d) this).field_K.a((byte) 47, var8);
              break L2;
            }
          }
          return true;
        }
    }

    public static void j(int param0) {
        field_O = null;
        if (param0 != -1) {
            field_O = null;
        }
    }

    private d() throws Throwable {
        throw new Error();
    }

    final int i(int param0) {
        if (param0 <= 24) {
            int discarded$0 = ((d) this).i(-5);
        }
        return ((d) this).field_K.b(0);
    }

    final static void a(int param0, int param1, qc param2, qc param3, int param4, int param5, int param6, fa param7, fa param8, qc param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        bk.a(-5237, param15, param7, param8);
        hg.a(0, param17, param0, param14, param16);
        rb.a(param6, param4, (byte) 83);
        sk.a(param11, param2, param5, 443, param3, param19);
        if (param20 != 255) {
            field_Q = false;
        }
        ai.a(param10, param1, param9, false);
        mh.a(param12, 1, param18, param13);
    }

    final int a(byte param0) {
        if (param0 != 9) {
            ((d) this).field_K = null;
        }
        return ((d) this).field_R;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = false;
        field_O = new ed();
    }
}
