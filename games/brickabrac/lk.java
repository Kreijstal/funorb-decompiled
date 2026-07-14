/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends qd {
    static th field_o;
    static jp field_t;
    private ie field_r;
    vl field_v;
    static int field_p;
    static boolean field_s;
    static jp[] field_n;
    static int[] field_u;
    static String field_q;
    ra field_m;

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ka var6 = null;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        ((lk) this).field_m.b(param0, param1, param2);
        var6 = (ka) (Object) ((lk) this).field_v.d(-123);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (!((lk) this).field_r.a(var6, -128)) {
                var4 = param1;
                var5 = param2;
                L2: while (true) {
                  if (var6.field_z >= var5) {
                    this.a(var5, var5 + var4, param0, var4, -1048576, var6);
                    var6.field_z = var6.field_z - var5;
                    break L1;
                  } else {
                    this.a(var6.field_z, var4 + var5, param0, var4, -1048576, var6);
                    var5 = var5 - var6.field_z;
                    var4 = var4 + var6.field_z;
                    if (!((lk) this).field_r.a(23300, param0, var5, var6, var4)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var6 = (ka) (Object) ((lk) this).field_v.a((byte) 116);
            continue L0;
          } else {
            return;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        ka var3 = null;
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        ((lk) this).field_m.a(param0);
        var3 = (ka) (Object) ((lk) this).field_v.d(-18);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((lk) this).field_r.a(var3, -112)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_z >= var2) {
                    this.a((byte) -109, var2, var3);
                    var3.field_z = var3.field_z - var2;
                    break L1;
                  } else {
                    this.a((byte) -128, var3.field_z, var3);
                    var2 = var2 - var3.field_z;
                    if (((lk) this).field_r.a(23300, (int[]) null, var2, var3, 0)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (ka) (Object) ((lk) this).field_v.a((byte) 116);
            continue L0;
          } else {
            return;
          }
        }
    }

    final int b() {
        return 0;
    }

    final qd a() {
        ka var1 = (ka) (Object) ((lk) this).field_v.d(-81);
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_y == null)) {
            return (qd) (Object) var1.field_y;
        }
        return ((lk) this).d();
    }

    private final void a(int param0, int param1, int[] param2, int param3, int param4, ka param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        kl var11 = null;
        int var12 = 0;
        ie stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        ka stackIn_13_2 = null;
        ie stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ka stackIn_14_2 = null;
        ie stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ka stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        ie stackOut_12_0;
        int stackOut_12_1;
        ka stackOut_12_2;
        ie stackOut_14_0;
        int stackOut_14_1;
        ka stackOut_14_2;
        int stackOut_14_3;
        ie stackOut_13_0;
        int stackOut_13_1;
        ka stackOut_13_2;
        int stackOut_13_3;
        var12 = BrickABrac.field_J ? 1 : 0;
        if (param4 == -1048576) {
          if ((4 & ((lk) this).field_r.field_n[param5.field_u]) == 0) {
            param5.field_y.b(param2, param3, param0);
            return;
          } else {
            if (0 > param5.field_x) {
              var7 = ((lk) this).field_r.field_U[param5.field_u] / tj.field_q;
              L0: while (true) {
                var8 = (1048575 - (-var7 + param5.field_j)) / var7;
                if (var8 <= param0) {
                  L1: {
                    param5.field_y.b(param2, param3, var8);
                    param0 = param0 - var8;
                    param5.field_j = param5.field_j + (var7 * var8 + -1048576);
                    param3 = param3 + var8;
                    var9 = tj.field_q / 100;
                    var10 = 262144 / var7;
                    if (var10 < var9) {
                      var9 = var10;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    var11 = param5.field_y;
                    if (-1 == (((lk) this).field_r.field_y[param5.field_u] ^ -1)) {
                      param5.field_y = kl.a(param5.field_F, var11.e(), var11.g(), var11.f());
                      break L2;
                    } else {
                      L3: {
                        param5.field_y = kl.a(param5.field_F, var11.e(), 0, var11.f());
                        stackOut_12_0 = ((lk) this).field_r;
                        stackOut_12_1 = 0;
                        stackOut_12_2 = (ka) param5;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        if (param5.field_k.field_j[param5.field_B] >= 0) {
                          stackOut_14_0 = (ie) (Object) stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = (ka) (Object) stackIn_14_2;
                          stackOut_14_3 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          stackIn_15_2 = stackOut_14_2;
                          stackIn_15_3 = stackOut_14_3;
                          break L3;
                        } else {
                          stackOut_13_0 = (ie) (Object) stackIn_13_0;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = (ka) (Object) stackIn_13_2;
                          stackOut_13_3 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          stackIn_15_2 = stackOut_13_2;
                          stackIn_15_3 = stackOut_13_3;
                          break L3;
                        }
                      }
                      ((ie) (Object) stackIn_15_0).a(stackIn_15_1 != 0, (ka) (Object) stackIn_15_2, stackIn_15_3 != 0);
                      param5.field_y.a(var9, var11.g());
                      break L2;
                    }
                  }
                  L4: {
                    if ((param5.field_k.field_j[param5.field_B] ^ -1) <= -1) {
                      break L4;
                    } else {
                      param5.field_y.f(-1);
                      break L4;
                    }
                  }
                  var11.g(var9);
                  var11.b(param2, param3, -param3 + param1);
                  if (var11.k()) {
                    ((lk) this).field_m.b((qd) (Object) var11);
                    continue L0;
                  } else {
                    continue L0;
                  }
                } else {
                  param5.field_j = param5.field_j + param0 * var7;
                  param5.field_y.b(param2, param3, param0);
                  return;
                }
              }
            } else {
              param5.field_y.b(param2, param3, param0);
              return;
            }
          }
        } else {
          return;
        }
    }

    private final void a(byte param0, int param1, ka param2) {
        int var4 = 0;
        int var5 = 0;
        ie stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ka stackIn_8_2 = null;
        ie stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        ka stackIn_9_2 = null;
        ie stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        ka stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        ie stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        ka stackIn_30_2 = null;
        ie stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        ka stackIn_31_2 = null;
        ie stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        ka stackIn_32_2 = null;
        int stackIn_32_3 = 0;
        ie stackOut_29_0;
        int stackOut_29_1;
        ka stackOut_29_2;
        ie stackOut_31_0;
        int stackOut_31_1;
        ka stackOut_31_2;
        int stackOut_31_3;
        ie stackOut_30_0;
        int stackOut_30_1;
        ka stackOut_30_2;
        int stackOut_30_3;
        ie stackOut_7_0;
        int stackOut_7_1;
        ka stackOut_7_2;
        ie stackOut_9_0;
        int stackOut_9_1;
        ka stackOut_9_2;
        int stackOut_9_3;
        ie stackOut_8_0;
        int stackOut_8_1;
        ka stackOut_8_2;
        int stackOut_8_3;
        if (param0 < -97) {
          if ((((lk) this).field_r.field_n[param2.field_u] & 4) != -1) {
            if (-1 > param2.field_x) {
              var4 = ((lk) this).field_r.field_U[param2.field_u] / tj.field_q;
              var5 = (-param2.field_j + var4 + 1048575) / var4;
              param2.field_j = 1048575 & var4 * param1 + param2.field_j;
              if (param1 >= var5) {
                if (0 == ((lk) this).field_r.field_y[param2.field_u]) {
                  param2.field_y = kl.a(param2.field_F, param2.field_y.e(), param2.field_y.g(), param2.field_y.f());
                  if (param2.field_k.field_j[param2.field_B] < 0) {
                    param2.field_y.f(-1);
                    param1 = param2.field_j / var4;
                    param2.field_y.a(param1);
                    return;
                  } else {
                    param1 = param2.field_j / var4;
                    param2.field_y.a(param1);
                    return;
                  }
                } else {
                  L0: {
                    param2.field_y = kl.a(param2.field_F, param2.field_y.e(), 0, param2.field_y.f());
                    stackOut_29_0 = ((lk) this).field_r;
                    stackOut_29_1 = 0;
                    stackOut_29_2 = (ka) param2;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_31_1 = stackOut_29_1;
                    stackIn_31_2 = stackOut_29_2;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    if (-1 >= (param2.field_k.field_j[param2.field_B] ^ -1)) {
                      stackOut_31_0 = (ie) (Object) stackIn_31_0;
                      stackOut_31_1 = stackIn_31_1;
                      stackOut_31_2 = (ka) (Object) stackIn_31_2;
                      stackOut_31_3 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      stackIn_32_1 = stackOut_31_1;
                      stackIn_32_2 = stackOut_31_2;
                      stackIn_32_3 = stackOut_31_3;
                      break L0;
                    } else {
                      stackOut_30_0 = (ie) (Object) stackIn_30_0;
                      stackOut_30_1 = stackIn_30_1;
                      stackOut_30_2 = (ka) (Object) stackIn_30_2;
                      stackOut_30_3 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_32_1 = stackOut_30_1;
                      stackIn_32_2 = stackOut_30_2;
                      stackIn_32_3 = stackOut_30_3;
                      break L0;
                    }
                  }
                  ((ie) (Object) stackIn_32_0).a(stackIn_32_1 != 0, (ka) (Object) stackIn_32_2, stackIn_32_3 != 0);
                  if (param2.field_k.field_j[param2.field_B] >= 0) {
                    param1 = param2.field_j / var4;
                    param2.field_y.a(param1);
                    return;
                  } else {
                    param2.field_y.f(-1);
                    param1 = param2.field_j / var4;
                    param2.field_y.a(param1);
                    return;
                  }
                }
              } else {
                param2.field_y.a(param1);
                return;
              }
            } else {
              param2.field_y.a(param1);
              return;
            }
          } else {
            param2.field_y.a(param1);
            return;
          }
        } else {
          ((lk) this).field_v = null;
          if ((((lk) this).field_r.field_n[param2.field_u] & 4) == -1) {
            param2.field_y.a(param1);
            return;
          } else {
            if (-1 > param2.field_x) {
              var4 = ((lk) this).field_r.field_U[param2.field_u] / tj.field_q;
              var5 = (-param2.field_j + var4 + 1048575) / var4;
              param2.field_j = 1048575 & var4 * param1 + param2.field_j;
              if (param1 >= var5) {
                if (0 == ((lk) this).field_r.field_y[param2.field_u]) {
                  param2.field_y = kl.a(param2.field_F, param2.field_y.e(), param2.field_y.g(), param2.field_y.f());
                  if (param2.field_k.field_j[param2.field_B] < 0) {
                    param2.field_y.f(-1);
                    param1 = param2.field_j / var4;
                    param2.field_y.a(param1);
                    return;
                  } else {
                    param1 = param2.field_j / var4;
                    param2.field_y.a(param1);
                    return;
                  }
                } else {
                  L1: {
                    param2.field_y = kl.a(param2.field_F, param2.field_y.e(), 0, param2.field_y.f());
                    stackOut_7_0 = ((lk) this).field_r;
                    stackOut_7_1 = 0;
                    stackOut_7_2 = (ka) param2;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    if (-1 >= (param2.field_k.field_j[param2.field_B] ^ -1)) {
                      stackOut_9_0 = (ie) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = (ka) (Object) stackIn_9_2;
                      stackOut_9_3 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      stackIn_10_3 = stackOut_9_3;
                      break L1;
                    } else {
                      stackOut_8_0 = (ie) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = (ka) (Object) stackIn_8_2;
                      stackOut_8_3 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      stackIn_10_3 = stackOut_8_3;
                      break L1;
                    }
                  }
                  ((ie) (Object) stackIn_10_0).a(stackIn_10_1 != 0, (ka) (Object) stackIn_10_2, stackIn_10_3 != 0);
                  if (param2.field_k.field_j[param2.field_B] < 0) {
                    param2.field_y.f(-1);
                    param1 = param2.field_j / var4;
                    param2.field_y.a(param1);
                    return;
                  } else {
                    param1 = param2.field_j / var4;
                    param2.field_y.a(param1);
                    return;
                  }
                }
              } else {
                param2.field_y.a(param1);
                return;
              }
            } else {
              param2.field_y.a(param1);
              return;
            }
          }
        }
    }

    final qd d() {
        ka var1_ref = null;
        do {
            var1_ref = (ka) (Object) ((lk) this).field_v.a((byte) 116);
            if (var1_ref == null) {
                return null;
            }
        } while (null == var1_ref.field_y);
        return (qd) (Object) var1_ref.field_y;
    }

    final static int[] a(int param0, int param1, int param2) {
        int var10 = 0;
        int var12 = 0;
        int var13 = BrickABrac.field_J ? 1 : 0;
        int[] var14 = new int[256];
        int[] var3 = var14;
        int var4 = (16745759 & param1) >> -1090375312;
        int var5 = (param1 & 65300) >> -2138173880;
        int var6 = 255 & param1;
        int var7 = (param2 & 16728276) >> 356181904;
        int var8 = (65533 & param2) >> -633671544;
        int var9 = 255 & param2;
        int var11 = 60 / ((param0 - -44) / 54);
        for (var10 = 0; 256 > var10; var10++) {
            var12 = 256 + -var10;
            var14[var10] = (var6 * var10 >> 1946782312) + (var9 * var12 >> 474903144) + (((var5 * var10 >> 285234568) - -(var8 * var12 >> 1075781768) << -1022285976) + ((var7 * var12 >> 933825160) + (var10 * var4 >> -844674712) << 1505390288));
        }
        return var3;
    }

    public static void c(int param0) {
        field_u = null;
        field_q = null;
        field_o = null;
        field_n = null;
        if (param0 != 2143) {
          lk.c(-30);
          field_t = null;
          return;
        } else {
          field_t = null;
          return;
        }
    }

    lk(ie param0) {
        ((lk) this).field_v = new vl();
        ((lk) this).field_m = new ra();
        ((lk) this).field_r = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new th(15, 0, 1, 0);
        field_q = "ON";
    }
}
