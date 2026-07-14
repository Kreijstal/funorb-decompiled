/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends lj {
    static String field_p;
    static String field_o;
    private wl field_q;
    static jj field_l;
    jj field_n;
    vg field_m;

    final lj c() {
        sh var1 = null;
        var1 = (sh) (Object) ((vd) this).field_n.d(9272);
        if (var1 != null) {
          if (var1.field_k != null) {
            return (lj) (Object) var1.field_k;
          } else {
            return ((vd) this).a();
          }
        } else {
          return null;
        }
    }

    final static int b(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 1673262433;
        param0 = param0 | param0 >>> -1605520766;
        if (param1 != 17603) {
          return 26;
        } else {
          param0 = param0 | param0 >>> -1365761180;
          param0 = param0 | param0 >>> -1187105400;
          param0 = param0 | param0 >>> 1032618544;
          return param0 - -1;
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_p = null;
        field_l = null;
        if (param0 == 41) {
            return;
        }
        field_p = null;
    }

    final lj a() {
        sh var1 = null;
        L0: while (true) {
          var1 = (sh) (Object) ((vd) this).field_n.e((byte) -119);
          if (var1 != null) {
            if (var1.field_k != null) {
              return (lj) (Object) var1.field_k;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        sh var6 = null;
        int var7 = 0;
        var7 = Terraphoenix.field_V;
        ((vd) this).field_m.a(param0, param1, param2);
        var6 = (sh) (Object) ((vd) this).field_n.d(9272);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (((vd) this).field_q.a(var6, 16384)) {
                break L1;
              } else {
                var4 = param1;
                var5 = param2;
                L2: while (true) {
                  if (var6.field_y >= var5) {
                    this.a(var6, param0, var5 + var4, var5, var4, (byte) 13);
                    var6.field_y = var6.field_y - var5;
                    break L1;
                  } else {
                    this.a(var6, param0, var4 + var5, var6.field_y, var4, (byte) 3);
                    var4 = var4 + var6.field_y;
                    var5 = var5 - var6.field_y;
                    if (((vd) this).field_q.a((byte) 101, param0, var5, var6, var4)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var6 = (sh) (Object) ((vd) this).field_n.e((byte) -119);
            continue L0;
          } else {
            return;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        sh var3 = null;
        int var4 = 0;
        var4 = Terraphoenix.field_V;
        ((vd) this).field_m.a(param0);
        var3 = (sh) (Object) ((vd) this).field_n.d(9272);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((vd) this).field_q.a(var3, 16384)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_y) {
                    this.a(var2, 10756, var3);
                    var3.field_y = var3.field_y - var2;
                    break L1;
                  } else {
                    this.a(var3.field_y, 10756, var3);
                    var2 = var2 - var3.field_y;
                    if (!((vd) this).field_q.a((byte) 77, (int[]) null, var2, var3, 0)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var3 = (sh) (Object) ((vd) this).field_n.e((byte) -119);
            continue L0;
          } else {
            return;
          }
        }
    }

    final int d() {
        return 0;
    }

    private final void a(sh param0, int[] param1, int param2, int param3, int param4, byte param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        lh var11 = null;
        int var12 = 0;
        wl stackIn_11_0 = null;
        wl stackIn_12_0 = null;
        wl stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        wl stackOut_10_0 = null;
        wl stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        wl stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        var12 = Terraphoenix.field_V;
        if ((((vd) this).field_q.field_q[param0.field_v] & 4) != 0) {
          if (-1 >= (param0.field_h ^ -1)) {
            var7 = -8 % ((-49 - param5) / 44);
            param0.field_k.a(param1, param4, param3);
            return;
          } else {
            var7 = ((vd) this).field_q.field_D[param0.field_v] / nk.field_u;
            L0: while (true) {
              var8 = (1048575 - -var7 - param0.field_A) / var7;
              if (var8 <= param3) {
                L1: {
                  param0.field_k.a(param1, param4, var8);
                  param3 = param3 - var8;
                  param0.field_A = param0.field_A + (var7 * var8 - 1048576);
                  param4 = param4 + var8;
                  var9 = nk.field_u / 100;
                  var10 = 262144 / var7;
                  if (var10 >= var9) {
                    break L1;
                  } else {
                    var9 = var10;
                    break L1;
                  }
                }
                L2: {
                  var11 = param0.field_k;
                  if (-1 != (((vd) this).field_q.field_S[param0.field_v] ^ -1)) {
                    L3: {
                      param0.field_k = lh.a(param0.field_F, var11.l(), 0, var11.g());
                      stackOut_10_0 = ((vd) this).field_q;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if ((param0.field_B.field_p[param0.field_w] ^ -1) <= -1) {
                        stackOut_12_0 = (wl) (Object) stackIn_12_0;
                        stackOut_12_1 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L3;
                      } else {
                        stackOut_11_0 = (wl) (Object) stackIn_11_0;
                        stackOut_11_1 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        break L3;
                      }
                    }
                    ((wl) (Object) stackIn_13_0).a(stackIn_13_1 != 0, param0, 109);
                    param0.field_k.e(var9, var11.h());
                    break L2;
                  } else {
                    param0.field_k = lh.a(param0.field_F, var11.l(), var11.h(), var11.g());
                    break L2;
                  }
                }
                L4: {
                  if (0 > param0.field_B.field_p[param0.field_w]) {
                    param0.field_k.g(-1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var11.c(var9);
                var11.a(param1, param4, param2 - param4);
                if (!var11.k()) {
                  continue L0;
                } else {
                  ((vd) this).field_m.a((lj) (Object) var11);
                  continue L0;
                }
              } else {
                param0.field_A = param0.field_A + param3 * var7;
                var7 = -8 % ((-49 - param5) / 44);
                param0.field_k.a(param1, param4, param3);
                return;
              }
            }
          }
        } else {
          var7 = -8 % ((-49 - param5) / 44);
          param0.field_k.a(param1, param4, param3);
          return;
        }
    }

    private final void a(int param0, int param1, sh param2) {
        int var4 = 0;
        int var5 = 0;
        wl stackIn_9_0 = null;
        wl stackIn_10_0 = null;
        wl stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        wl stackIn_35_0 = null;
        wl stackIn_36_0 = null;
        wl stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        wl stackOut_34_0 = null;
        wl stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        wl stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        wl stackOut_8_0 = null;
        wl stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        wl stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        if (param1 == 10756) {
          if (-1 != (4 & ((vd) this).field_q.field_q[param2.field_v])) {
            if (-1 > param2.field_h) {
              var4 = ((vd) this).field_q.field_D[param2.field_v] / nk.field_u;
              var5 = (1048575 + (var4 - param2.field_A)) / var4;
              param2.field_A = 1048575 & var4 * param0 + param2.field_A;
              if (var5 <= param0) {
                if (((vd) this).field_q.field_S[param2.field_v] != 0) {
                  L0: {
                    param2.field_k = lh.a(param2.field_F, param2.field_k.l(), 0, param2.field_k.g());
                    stackOut_34_0 = ((vd) this).field_q;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_35_0 = stackOut_34_0;
                    if (param2.field_B.field_p[param2.field_w] >= 0) {
                      stackOut_36_0 = (wl) (Object) stackIn_36_0;
                      stackOut_36_1 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      break L0;
                    } else {
                      stackOut_35_0 = (wl) (Object) stackIn_35_0;
                      stackOut_35_1 = 1;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      break L0;
                    }
                  }
                  L1: {
                    ((wl) (Object) stackIn_37_0).a(stackIn_37_1 != 0, param2, 100);
                    if (param2.field_B.field_p[param2.field_w] < 0) {
                      param2.field_k.g(-1);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  param0 = param2.field_A / var4;
                  param2.field_k.a(param0);
                  return;
                } else {
                  L2: {
                    param2.field_k = lh.a(param2.field_F, param2.field_k.l(), param2.field_k.h(), param2.field_k.g());
                    if (param2.field_B.field_p[param2.field_w] < 0) {
                      param2.field_k.g(-1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  param0 = param2.field_A / var4;
                  param2.field_k.a(param0);
                  return;
                }
              } else {
                param2.field_k.a(param0);
                return;
              }
            } else {
              param2.field_k.a(param0);
              return;
            }
          } else {
            param2.field_k.a(param0);
            return;
          }
        } else {
          ((vd) this).field_q = null;
          if (-1 != (4 & ((vd) this).field_q.field_q[param2.field_v])) {
            if (-1 > param2.field_h) {
              var4 = ((vd) this).field_q.field_D[param2.field_v] / nk.field_u;
              var5 = (1048575 + (var4 - param2.field_A)) / var4;
              param2.field_A = 1048575 & var4 * param0 + param2.field_A;
              if (var5 <= param0) {
                if (((vd) this).field_q.field_S[param2.field_v] == 0) {
                  L3: {
                    param2.field_k = lh.a(param2.field_F, param2.field_k.l(), param2.field_k.h(), param2.field_k.g());
                    if (param2.field_B.field_p[param2.field_w] < 0) {
                      param2.field_k.g(-1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  param0 = param2.field_A / var4;
                  param2.field_k.a(param0);
                  return;
                } else {
                  L4: {
                    param2.field_k = lh.a(param2.field_F, param2.field_k.l(), 0, param2.field_k.g());
                    stackOut_8_0 = ((vd) this).field_q;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_9_0 = stackOut_8_0;
                    if (param2.field_B.field_p[param2.field_w] >= 0) {
                      stackOut_10_0 = (wl) (Object) stackIn_10_0;
                      stackOut_10_1 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      break L4;
                    } else {
                      stackOut_9_0 = (wl) (Object) stackIn_9_0;
                      stackOut_9_1 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      break L4;
                    }
                  }
                  ((wl) (Object) stackIn_11_0).a(stackIn_11_1 != 0, param2, 100);
                  L5: {
                    if (param2.field_B.field_p[param2.field_w] < 0) {
                      param2.field_k.g(-1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  param0 = param2.field_A / var4;
                  param2.field_k.a(param0);
                  return;
                }
              } else {
                param2.field_k.a(param0);
                return;
              }
            } else {
              param2.field_k.a(param0);
              return;
            }
          } else {
            param2.field_k.a(param0);
            return;
          }
        }
    }

    vd(wl param0) {
        ((vd) this).field_n = new jj();
        ((vd) this).field_m = new vg();
        ((vd) this).field_q = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Email is valid";
        field_o = "Please wait...";
        field_l = new jj();
    }
}
