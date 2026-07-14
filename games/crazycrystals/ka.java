/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends od {
    static boolean field_j;
    static int field_n;
    static db field_m;
    wb field_k;
    private wg field_o;
    tj field_l;

    final od a() {
        pl var1 = null;
        int var2 = 0;
        var2 = CrazyCrystals.field_B;
        L0: while (true) {
          var1 = (pl) (Object) ((ka) this).field_k.a(false);
          if (var1 != null) {
            if (null != var1.field_v) {
              return (od) (Object) var1.field_v;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(pl param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        wg stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        pl stackIn_14_2 = null;
        wg stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        pl stackIn_15_2 = null;
        wg stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        pl stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        wg stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        pl stackOut_13_2 = null;
        wg stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        pl stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        wg stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        pl stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        if (param2 < -79) {
          if ((((ka) this).field_o.field_E[param0.field_i] & 4) != 0) {
            if (param0.field_l < 0) {
              var4 = ((ka) this).field_o.field_G[param0.field_i] / id.field_m;
              var5 = (var4 + 1048575 + -param0.field_j) / var4;
              param0.field_j = var4 * param1 + param0.field_j & 1048575;
              if (var5 <= param1) {
                if (((ka) this).field_o.field_v[param0.field_i] != 0) {
                  L0: {
                    param0.field_v = kg.b(param0.field_t, param0.field_v.f(), 0, param0.field_v.k());
                    stackOut_13_0 = ((ka) this).field_o;
                    stackOut_13_1 = 2;
                    stackOut_13_2 = (pl) param0;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    if (-1 >= (param0.field_A.field_n[param0.field_y] ^ -1)) {
                      stackOut_15_0 = (wg) (Object) stackIn_15_0;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = (pl) (Object) stackIn_15_2;
                      stackOut_15_3 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      stackIn_16_3 = stackOut_15_3;
                      break L0;
                    } else {
                      stackOut_14_0 = (wg) (Object) stackIn_14_0;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = (pl) (Object) stackIn_14_2;
                      stackOut_14_3 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_16_2 = stackOut_14_2;
                      stackIn_16_3 = stackOut_14_3;
                      break L0;
                    }
                  }
                  L1: {
                    ((wg) (Object) stackIn_16_0).a((byte) stackIn_16_1, stackIn_16_2, stackIn_16_3 != 0);
                    if (0 > param0.field_A.field_n[param0.field_y]) {
                      param0.field_v.f(-1);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  param1 = param0.field_j / var4;
                  param0.field_v.a(param1);
                  return;
                } else {
                  L2: {
                    param0.field_v = kg.b(param0.field_t, param0.field_v.f(), param0.field_v.j(), param0.field_v.k());
                    if (0 > param0.field_A.field_n[param0.field_y]) {
                      param0.field_v.f(-1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  param1 = param0.field_j / var4;
                  param0.field_v.a(param1);
                  return;
                }
              } else {
                param0.field_v.a(param1);
                return;
              }
            } else {
              param0.field_v.a(param1);
              return;
            }
          } else {
            param0.field_v.a(param1);
            return;
          }
        } else {
          return;
        }
    }

    final int c() {
        return 0;
    }

    final od d() {
        pl var1 = null;
        var1 = (pl) (Object) ((ka) this).field_k.g(32073);
        if (var1 != null) {
          if (var1.field_v != null) {
            return (od) (Object) var1.field_v;
          } else {
            return ((ka) this).a();
          }
        } else {
          return null;
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        pl var6 = null;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        ((ka) this).field_l.a(param0, param1, param2);
        var6 = (pl) (Object) ((ka) this).field_k.g(32073);
        L0: while (true) {
          if (var6 == null) {
            return;
          } else {
            if (((ka) this).field_o.a(var6, (byte) 100)) {
              var6 = (pl) (Object) ((ka) this).field_k.a(false);
              continue L0;
            } else {
              var4 = param1;
              var5 = param2;
              L1: while (true) {
                if (var5 <= var6.field_k) {
                  this.a(param0, var6, var4, -1048576, var5, var5 + var4);
                  var6.field_k = var6.field_k - var5;
                  var6 = (pl) (Object) ((ka) this).field_k.a(false);
                  continue L0;
                } else {
                  this.a(param0, var6, var4, -1048576, var6.field_k, var5 + var4);
                  var5 = var5 - var6.field_k;
                  var4 = var4 + var6.field_k;
                  if (!((ka) this).field_o.a(var5, var4, param0, var6, (byte) 98)) {
                    continue L1;
                  } else {
                    var6 = (pl) (Object) ((ka) this).field_k.a(false);
                    continue L0;
                  }
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        int var1 = -91 % ((47 - param0) / 56);
        field_m = null;
    }

    private final void a(int[] param0, pl param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        kg var13 = null;
        wg stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        pl stackIn_12_2 = null;
        wg stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        pl stackIn_13_2 = null;
        wg stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        pl stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        wg stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        pl stackOut_11_2 = null;
        wg stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        pl stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        wg stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        pl stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        L0: {
          var12 = CrazyCrystals.field_B;
          if (param3 == -1048576) {
            break L0;
          } else {
            od discarded$1 = ((ka) this).a();
            break L0;
          }
        }
        if (0 == (4 & ((ka) this).field_o.field_E[param1.field_i])) {
          param1.field_v.a(param0, param2, param4);
          return;
        } else {
          if (-1 < (param1.field_l ^ -1)) {
            var7 = ((ka) this).field_o.field_G[param1.field_i] / id.field_m;
            L1: while (true) {
              var8 = (-param1.field_j + var7 + 1048575) / var7;
              if (var8 > param4) {
                param1.field_j = param1.field_j + var7 * param4;
                param1.field_v.a(param0, param2, param4);
                return;
              } else {
                L2: {
                  param1.field_v.a(param0, param2, var8);
                  param4 = param4 - var8;
                  param2 = param2 + var8;
                  param1.field_j = param1.field_j + (-1048576 + var7 * var8);
                  var9 = id.field_m / 100;
                  var10 = 262144 / var7;
                  if (var10 >= var9) {
                    break L2;
                  } else {
                    var9 = var10;
                    break L2;
                  }
                }
                L3: {
                  var13 = param1.field_v;
                  if (((ka) this).field_o.field_v[param1.field_i] != 0) {
                    L4: {
                      param1.field_v = kg.b(param1.field_t, var13.f(), 0, var13.k());
                      stackOut_11_0 = ((ka) this).field_o;
                      stackOut_11_1 = 2;
                      stackOut_11_2 = (pl) param1;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      if ((param1.field_A.field_n[param1.field_y] ^ -1) <= -1) {
                        stackOut_13_0 = (wg) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = (pl) (Object) stackIn_13_2;
                        stackOut_13_3 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        stackIn_14_3 = stackOut_13_3;
                        break L4;
                      } else {
                        stackOut_12_0 = (wg) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = (pl) (Object) stackIn_12_2;
                        stackOut_12_3 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        stackIn_14_3 = stackOut_12_3;
                        break L4;
                      }
                    }
                    ((wg) (Object) stackIn_14_0).a((byte) stackIn_14_1, stackIn_14_2, stackIn_14_3 != 0);
                    param1.field_v.b(var9, var13.j());
                    break L3;
                  } else {
                    param1.field_v = kg.b(param1.field_t, var13.f(), var13.j(), var13.k());
                    break L3;
                  }
                }
                L5: {
                  if (param1.field_A.field_n[param1.field_y] >= 0) {
                    break L5;
                  } else {
                    param1.field_v.f(-1);
                    break L5;
                  }
                }
                var13.d(var9);
                var13.a(param0, param2, param5 + -param2);
                if (!var13.e()) {
                  continue L1;
                } else {
                  ((ka) this).field_l.b((od) (Object) var13);
                  continue L1;
                }
              }
            }
          } else {
            param1.field_v.a(param0, param2, param4);
            return;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        pl var3 = null;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        ((ka) this).field_l.a(param0);
        var3 = (pl) (Object) ((ka) this).field_k.g(32073);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            if (!((ka) this).field_o.a(var3, (byte) 113)) {
              var2 = param0;
              L1: while (true) {
                if (var3.field_k >= var2) {
                  this.a(var3, var2, (byte) -101);
                  var3.field_k = var3.field_k - var2;
                  var3 = (pl) (Object) ((ka) this).field_k.a(false);
                  continue L0;
                } else {
                  this.a(var3, var3.field_k, (byte) -116);
                  var2 = var2 - var3.field_k;
                  if (!((ka) this).field_o.a(var2, 0, (int[]) null, var3, (byte) 94)) {
                    continue L1;
                  } else {
                    var3 = (pl) (Object) ((ka) this).field_k.a(false);
                    continue L0;
                  }
                }
              }
            } else {
              var3 = (pl) (Object) ((ka) this).field_k.a(false);
              continue L0;
            }
          }
        }
    }

    ka(wg param0) {
        ((ka) this).field_k = new wb();
        ((ka) this).field_l = new tj();
        ((ka) this).field_o = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 128;
    }
}
