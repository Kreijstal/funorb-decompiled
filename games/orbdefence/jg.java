/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends di {
    static String field_l;
    im field_k;
    static String[] field_n;
    private lj field_j;
    v field_m;

    final di a() {
        he var1 = (he) (Object) ((jg) this).field_k.b((byte) -75);
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_l == null)) {
            return (di) (Object) var1.field_l;
        }
        return ((jg) this).d();
    }

    private final void a(int param0, he param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        lj stackIn_14_0 = null;
        he stackIn_14_1 = null;
        lj stackIn_15_0 = null;
        he stackIn_15_1 = null;
        lj stackIn_16_0 = null;
        he stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        lj stackOut_13_0 = null;
        he stackOut_13_1 = null;
        lj stackOut_15_0 = null;
        he stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        lj stackOut_14_0 = null;
        he stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        L0: {
          if (-1 == (((jg) this).field_j.field_o[param1.field_F] & 4 ^ -1)) {
            break L0;
          } else {
            if (0 > param1.field_n) {
              var4 = ((jg) this).field_j.field_L[param1.field_F] / la.field_c;
              var5 = (var4 + (1048575 + -param1.field_i)) / var4;
              param1.field_i = 1048575 & param0 * var4 + param1.field_i;
              if (var5 <= param0) {
                L1: {
                  if (-1 != (((jg) this).field_j.field_D[param1.field_F] ^ -1)) {
                    L2: {
                      param1.field_l = bb.a(param1.field_D, param1.field_l.g(), 0, param1.field_l.l());
                      stackOut_13_0 = ((jg) this).field_j;
                      stackOut_13_1 = (he) param1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if ((param1.field_g.field_m[param1.field_h] ^ -1) <= -1) {
                        stackOut_15_0 = (lj) (Object) stackIn_15_0;
                        stackOut_15_1 = (he) (Object) stackIn_15_1;
                        stackOut_15_2 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        break L2;
                      } else {
                        stackOut_14_0 = (lj) (Object) stackIn_14_0;
                        stackOut_14_1 = (he) (Object) stackIn_14_1;
                        stackOut_14_2 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        break L2;
                      }
                    }
                    ((lj) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2 != 0, param2 + 33816);
                    break L1;
                  } else {
                    param1.field_l = bb.a(param1.field_D, param1.field_l.g(), param1.field_l.j(), param1.field_l.l());
                    break L1;
                  }
                }
                L3: {
                  if (param1.field_g.field_m[param1.field_h] < 0) {
                    param1.field_l.d(-1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param0 = param1.field_i / var4;
                break L0;
              } else {
                if (param2 == -23887) {
                  param1.field_l.c(param0);
                  return;
                } else {
                  di discarded$3 = ((jg) this).d();
                  param1.field_l.c(param0);
                  return;
                }
              }
            } else {
              if (param2 == -23887) {
                param1.field_l.c(param0);
                return;
              } else {
                di discarded$4 = ((jg) this).d();
                param1.field_l.c(param0);
                return;
              }
            }
          }
        }
        if (param2 == -23887) {
          param1.field_l.c(param0);
          return;
        } else {
          di discarded$5 = ((jg) this).d();
          param1.field_l.c(param0);
          return;
        }
    }

    final di d() {
        he var1 = null;
        L0: while (true) {
          var1 = (he) (Object) ((jg) this).field_k.d(853);
          if (var1 != null) {
            if (var1.field_l != null) {
              return (di) (Object) var1.field_l;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(int[] param0, int param1, int param2, boolean param3, he param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        bb var13 = null;
        bb var17 = null;
        lj stackIn_12_0 = null;
        he stackIn_12_1 = null;
        lj stackIn_13_0 = null;
        he stackIn_13_1 = null;
        lj stackIn_14_0 = null;
        he stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        lj stackIn_37_0 = null;
        he stackIn_37_1 = null;
        lj stackIn_38_0 = null;
        he stackIn_38_1 = null;
        lj stackIn_39_0 = null;
        he stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        lj stackOut_36_0 = null;
        he stackOut_36_1 = null;
        lj stackOut_38_0 = null;
        he stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        lj stackOut_37_0 = null;
        he stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        lj stackOut_11_0 = null;
        he stackOut_11_1 = null;
        lj stackOut_13_0 = null;
        he stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        lj stackOut_12_0 = null;
        he stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        var12 = OrbDefence.field_D ? 1 : 0;
        if (param3) {
          if ((4 & ((jg) this).field_j.field_o[param4.field_F]) != 0) {
            if (param4.field_n < 0) {
              var7 = ((jg) this).field_j.field_L[param4.field_F] / la.field_c;
              L0: while (true) {
                var8 = (-param4.field_i + (1048575 + var7)) / var7;
                if (var8 > param5) {
                  param4.field_i = param4.field_i + var7 * param5;
                  param4.field_l.b(param0, param2, param5);
                  return;
                } else {
                  L1: {
                    param4.field_l.b(param0, param2, var8);
                    param4.field_i = param4.field_i + (-1048576 + var8 * var7);
                    param2 = param2 + var8;
                    param5 = param5 - var8;
                    var9 = la.field_c / 100;
                    var10 = 262144 / var7;
                    if (var9 > var10) {
                      var9 = var10;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    var17 = param4.field_l;
                    if (0 == ((jg) this).field_j.field_D[param4.field_F]) {
                      param4.field_l = bb.a(param4.field_D, var17.g(), var17.j(), var17.l());
                      break L2;
                    } else {
                      L3: {
                        param4.field_l = bb.a(param4.field_D, var17.g(), 0, var17.l());
                        stackOut_36_0 = ((jg) this).field_j;
                        stackOut_36_1 = (he) param4;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (param4.field_g.field_m[param4.field_h] >= 0) {
                          stackOut_38_0 = (lj) (Object) stackIn_38_0;
                          stackOut_38_1 = (he) (Object) stackIn_38_1;
                          stackOut_38_2 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          stackIn_39_1 = stackOut_38_1;
                          stackIn_39_2 = stackOut_38_2;
                          break L3;
                        } else {
                          stackOut_37_0 = (lj) (Object) stackIn_37_0;
                          stackOut_37_1 = (he) (Object) stackIn_37_1;
                          stackOut_37_2 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          stackIn_39_2 = stackOut_37_2;
                          break L3;
                        }
                      }
                      ((lj) (Object) stackIn_39_0).a(stackIn_39_1, stackIn_39_2 != 0, 9929);
                      param4.field_l.d(var9, var17.j());
                      break L2;
                    }
                  }
                  L4: {
                    if (param4.field_g.field_m[param4.field_h] < 0) {
                      param4.field_l.d(-1);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var17.f(var9);
                  var17.b(param0, param2, param1 + -param2);
                  if (var17.e()) {
                    ((jg) this).field_m.a((di) (Object) var17);
                    continue L0;
                  } else {
                    continue L0;
                  }
                }
              }
            } else {
              param4.field_l.b(param0, param2, param5);
              return;
            }
          } else {
            param4.field_l.b(param0, param2, param5);
            return;
          }
        } else {
          ((jg) this).field_j = null;
          if ((4 & ((jg) this).field_j.field_o[param4.field_F]) != 0) {
            if (param4.field_n < 0) {
              var7 = ((jg) this).field_j.field_L[param4.field_F] / la.field_c;
              L5: while (true) {
                var8 = (-param4.field_i + (1048575 + var7)) / var7;
                if (var8 > param5) {
                  param4.field_i = param4.field_i + var7 * param5;
                  param4.field_l.b(param0, param2, param5);
                  return;
                } else {
                  L6: {
                    param4.field_l.b(param0, param2, var8);
                    param4.field_i = param4.field_i + (-1048576 + var8 * var7);
                    param2 = param2 + var8;
                    param5 = param5 - var8;
                    var9 = la.field_c / 100;
                    var10 = 262144 / var7;
                    if (var9 > var10) {
                      var9 = var10;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var13 = param4.field_l;
                    if (0 == ((jg) this).field_j.field_D[param4.field_F]) {
                      param4.field_l = bb.a(param4.field_D, var13.g(), var13.j(), var13.l());
                      break L7;
                    } else {
                      L8: {
                        param4.field_l = bb.a(param4.field_D, var13.g(), 0, var13.l());
                        stackOut_11_0 = ((jg) this).field_j;
                        stackOut_11_1 = (he) param4;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (param4.field_g.field_m[param4.field_h] >= 0) {
                          stackOut_13_0 = (lj) (Object) stackIn_13_0;
                          stackOut_13_1 = (he) (Object) stackIn_13_1;
                          stackOut_13_2 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          stackIn_14_2 = stackOut_13_2;
                          break L8;
                        } else {
                          stackOut_12_0 = (lj) (Object) stackIn_12_0;
                          stackOut_12_1 = (he) (Object) stackIn_12_1;
                          stackOut_12_2 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          stackIn_14_2 = stackOut_12_2;
                          break L8;
                        }
                      }
                      ((lj) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2 != 0, 9929);
                      param4.field_l.d(var9, var13.j());
                      break L7;
                    }
                  }
                  L9: {
                    if (param4.field_g.field_m[param4.field_h] < 0) {
                      param4.field_l.d(-1);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  var13.f(var9);
                  var13.b(param0, param2, param1 + -param2);
                  if (var13.e()) {
                    ((jg) this).field_m.a((di) (Object) var13);
                    continue L5;
                  } else {
                    continue L5;
                  }
                }
              }
            } else {
              param4.field_l.b(param0, param2, param5);
              return;
            }
          } else {
            param4.field_l.b(param0, param2, param5);
            return;
          }
        }
    }

    final int c() {
        return 0;
    }

    final void c(int param0) {
        int var2 = 0;
        he var3 = null;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        ((jg) this).field_m.c(param0);
        var3 = (he) (Object) ((jg) this).field_k.b((byte) 117);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((jg) this).field_j.a(var3, (byte) 90)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_w >= var2) {
                    this.a(var2, var3, -23887);
                    var3.field_w = var3.field_w - var2;
                    break L1;
                  } else {
                    this.a(var3.field_w, var3, -23887);
                    var2 = var2 - var3.field_w;
                    if (((jg) this).field_j.a(4160, var3, 0, var2, (int[]) null)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (he) (Object) ((jg) this).field_k.d(853);
            continue L0;
          } else {
            return;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        he var6 = null;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        ((jg) this).field_m.b(param0, param1, param2);
        var6 = (he) (Object) ((jg) this).field_k.b((byte) -96);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (((jg) this).field_j.a(var6, (byte) 98)) {
                break L1;
              } else {
                var4 = param1;
                var5 = param2;
                L2: while (true) {
                  if (var6.field_w >= var5) {
                    this.a(param0, var4 + var5, var4, true, var6, var5);
                    var6.field_w = var6.field_w - var5;
                    break L1;
                  } else {
                    this.a(param0, var4 + var5, var4, true, var6, var6.field_w);
                    var5 = var5 - var6.field_w;
                    var4 = var4 + var6.field_w;
                    if (!((jg) this).field_j.a(4160, var6, var4, var5, param0)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var6 = (he) (Object) ((jg) this).field_k.d(853);
            continue L0;
          } else {
            return;
          }
        }
    }

    public static void d(int param0) {
        field_l = null;
        if (param0 < 34) {
            jg.d(-51);
            field_n = null;
            return;
        }
        field_n = null;
    }

    jg(lj param0) {
        ((jg) this).field_k = new im();
        ((jg) this).field_m = new v();
        ((jg) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "FAST BLAST";
    }
}
