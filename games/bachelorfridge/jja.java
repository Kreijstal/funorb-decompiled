/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jja extends tda {
    eaa field_k;
    private jp field_l;
    hn field_j;
    static String field_m;

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        fh var6 = null;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        ((jja) this).field_j.a(param0, param1, param2);
        var6 = (fh) (Object) ((jja) this).field_k.b((byte) 90);
        L0: while (true) {
          if (var6 == null) {
            return;
          } else {
            if (!((jja) this).field_l.a(var6, (byte) 95)) {
              var4 = param1;
              var5 = param2;
              L1: while (true) {
                if (var6.field_r >= var5) {
                  this.a(var5, param0, var4, var4 + var5, var6, (byte) 12);
                  var6.field_r = var6.field_r - var5;
                  var6 = (fh) (Object) ((jja) this).field_k.c(0);
                  continue L0;
                } else {
                  this.a(var6.field_r, param0, var4, var5 + var4, var6, (byte) 12);
                  var5 = var5 - var6.field_r;
                  var4 = var4 + var6.field_r;
                  if (!((jja) this).field_l.a(var4, var6, param0, var5, false)) {
                    continue L1;
                  } else {
                    var6 = (fh) (Object) ((jja) this).field_k.c(0);
                    continue L0;
                  }
                }
              }
            } else {
              var6 = (fh) (Object) ((jja) this).field_k.c(0);
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int[] param1, int param2, int param3, fh param4, byte param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        je var11 = null;
        int var12 = 0;
        jp stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        fh stackIn_14_2 = null;
        jp stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        fh stackIn_15_2 = null;
        jp stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        fh stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        jp stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        fh stackOut_13_2 = null;
        jp stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        fh stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        jp stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        fh stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        L0: {
          var12 = BachelorFridge.field_y;
          if ((((jja) this).field_l.field_u[param4.field_n] & 4) == 0) {
            break L0;
          } else {
            if (param4.field_p < 0) {
              var7 = ((jja) this).field_l.field_M[param4.field_n] / pb.field_j;
              L1: while (true) {
                var8 = (-param4.field_t + (var7 + 1048575)) / var7;
                if (var8 <= param0) {
                  L2: {
                    param4.field_z.a(param1, param2, var8);
                    param0 = param0 - var8;
                    param4.field_t = param4.field_t + (-1048576 + var8 * var7);
                    param2 = param2 + var8;
                    var9 = pb.field_j / 100;
                    var10 = 262144 / var7;
                    if (var9 <= var10) {
                      break L2;
                    } else {
                      var9 = var10;
                      break L2;
                    }
                  }
                  L3: {
                    var11 = param4.field_z;
                    if (((jja) this).field_l.field_y[param4.field_n] != 0) {
                      L4: {
                        param4.field_z = je.a(param4.field_f, var11.f(), 0, var11.i());
                        stackOut_13_0 = ((jja) this).field_l;
                        stackOut_13_1 = 809594182;
                        stackOut_13_2 = (fh) param4;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        if (0 <= param4.field_j.field_n[param4.field_h]) {
                          stackOut_15_0 = (jp) (Object) stackIn_15_0;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = (fh) (Object) stackIn_15_2;
                          stackOut_15_3 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          stackIn_16_3 = stackOut_15_3;
                          break L4;
                        } else {
                          stackOut_14_0 = (jp) (Object) stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = (fh) (Object) stackIn_14_2;
                          stackOut_14_3 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_16_2 = stackOut_14_2;
                          stackIn_16_3 = stackOut_14_3;
                          break L4;
                        }
                      }
                      ((jp) (Object) stackIn_16_0).a(stackIn_16_1, (fh) (Object) stackIn_16_2, stackIn_16_3 != 0);
                      param4.field_z.a(var9, var11.g());
                      break L3;
                    } else {
                      param4.field_z = je.a(param4.field_f, var11.f(), var11.g(), var11.i());
                      break L3;
                    }
                  }
                  L5: {
                    if (-1 < (param4.field_j.field_n[param4.field_h] ^ -1)) {
                      param4.field_z.d(-1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var11.c(var9);
                  var11.a(param1, param2, param3 + -param2);
                  if (var11.e()) {
                    ((jja) this).field_j.a((tda) (Object) var11);
                    continue L1;
                  } else {
                    continue L1;
                  }
                } else {
                  param4.field_t = param4.field_t + var7 * param0;
                  break L0;
                }
              }
            } else {
              if (param5 != 12) {
                return;
              } else {
                param4.field_z.a(param1, param2, param0);
                return;
              }
            }
          }
        }
        if (param5 != 12) {
          return;
        } else {
          param4.field_z.a(param1, param2, param0);
          return;
        }
    }

    final int d() {
        return 0;
    }

    final tda b() {
        fh var1 = (fh) (Object) ((jja) this).field_k.b((byte) 90);
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_z == null)) {
            return (tda) (Object) var1.field_z;
        }
        return ((jja) this).a();
    }

    final static void d(byte param0) {
        if (param0 < 18) {
            return;
        }
        kka.field_l.e((wj) (Object) new dka(), 33);
    }

    final void a(int param0) {
        int var2 = 0;
        fh var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        ((jja) this).field_j.a(param0);
        var3 = (fh) (Object) ((jja) this).field_k.b((byte) 90);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            if (!((jja) this).field_l.a(var3, (byte) 95)) {
              var2 = param0;
              L1: while (true) {
                if (var2 <= var3.field_r) {
                  this.a(var2, 53, var3);
                  var3.field_r = var3.field_r - var2;
                  var3 = (fh) (Object) ((jja) this).field_k.c(0);
                  continue L0;
                } else {
                  this.a(var3.field_r, 91, var3);
                  var2 = var2 - var3.field_r;
                  if (!((jja) this).field_l.a(0, var3, (int[]) null, var2, false)) {
                    continue L1;
                  } else {
                    var3 = (fh) (Object) ((jja) this).field_k.c(0);
                    continue L0;
                  }
                }
              }
            } else {
              var3 = (fh) (Object) ((jja) this).field_k.c(0);
              continue L0;
            }
          }
        }
    }

    final static void c(int param0) {
        lq.g(param0 + -20756);
        if (param0 != 20757) {
            jja.b(81);
        }
    }

    final static void b(int param0) {
        cha.field_l = ig.field_m.g(76);
        CharSequence var2 = (CharSequence) (Object) cha.field_l;
        tca.field_a = fq.a(param0 ^ param0, var2);
    }

    public static void c(byte param0) {
        if (param0 != -90) {
            field_m = null;
            field_m = null;
            return;
        }
        field_m = null;
    }

    final tda a() {
        fh var1 = null;
        int var2 = 0;
        var2 = BachelorFridge.field_y;
        L0: while (true) {
          var1 = (fh) (Object) ((jja) this).field_k.c(0);
          if (var1 != null) {
            if (var1.field_z != null) {
              return (tda) (Object) var1.field_z;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != -1) {
          field_m = null;
          cq discarded$4 = ic.a(param0, rt.field_a[param2], -31855);
          return;
        } else {
          cq discarded$5 = ic.a(param0, rt.field_a[param2], -31855);
          return;
        }
    }

    private final void a(int param0, int param1, fh param2) {
        int var4 = 0;
        int var5 = 0;
        jp stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        fh stackIn_17_2 = null;
        jp stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        fh stackIn_18_2 = null;
        jp stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        fh stackIn_19_2 = null;
        int stackIn_19_3 = 0;
        jp stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        fh stackOut_16_2 = null;
        jp stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        fh stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        jp stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        fh stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        if (0 != (((jja) this).field_l.field_u[param2.field_n] & 4)) {
          if (param2.field_p < 0) {
            var4 = ((jja) this).field_l.field_M[param2.field_n] / pb.field_j;
            var5 = (-param2.field_t + 1048575 - -var4) / var4;
            param2.field_t = var4 * param0 + param2.field_t & 1048575;
            if (param0 >= var5) {
              if (((jja) this).field_l.field_y[param2.field_n] == 0) {
                param2.field_z = je.a(param2.field_f, param2.field_z.f(), param2.field_z.g(), param2.field_z.i());
                if (param2.field_j.field_n[param2.field_h] >= 0) {
                  param0 = param2.field_t / var4;
                  param2.field_z.a(param0);
                  if (param1 < 18) {
                    ((jja) this).field_l = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  param2.field_z.d(-1);
                  param0 = param2.field_t / var4;
                  param2.field_z.a(param0);
                  if (param1 < 18) {
                    ((jja) this).field_l = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L0: {
                  param2.field_z = je.a(param2.field_f, param2.field_z.f(), 0, param2.field_z.i());
                  stackOut_16_0 = ((jja) this).field_l;
                  stackOut_16_1 = 809594182;
                  stackOut_16_2 = (fh) param2;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if ((param2.field_j.field_n[param2.field_h] ^ -1) <= -1) {
                    stackOut_18_0 = (jp) (Object) stackIn_18_0;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = (fh) (Object) stackIn_18_2;
                    stackOut_18_3 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L0;
                  } else {
                    stackOut_17_0 = (jp) (Object) stackIn_17_0;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = (fh) (Object) stackIn_17_2;
                    stackOut_17_3 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L0;
                  }
                }
                ((jp) (Object) stackIn_19_0).a(stackIn_19_1, (fh) (Object) stackIn_19_2, stackIn_19_3 != 0);
                if (param2.field_j.field_n[param2.field_h] >= 0) {
                  param0 = param2.field_t / var4;
                  param2.field_z.a(param0);
                  if (param1 < 18) {
                    ((jja) this).field_l = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  param2.field_z.d(-1);
                  param0 = param2.field_t / var4;
                  param2.field_z.a(param0);
                  if (param1 < 18) {
                    ((jja) this).field_l = null;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              param2.field_z.a(param0);
              if (param1 < 18) {
                ((jja) this).field_l = null;
                return;
              } else {
                return;
              }
            }
          } else {
            param2.field_z.a(param0);
            if (param1 < 18) {
              ((jja) this).field_l = null;
              return;
            } else {
              return;
            }
          }
        } else {
          param2.field_z.a(param0);
          if (param1 < 18) {
            ((jja) this).field_l = null;
            return;
          } else {
            return;
          }
        }
    }

    jja(jp param0) {
        ((jja) this).field_k = new eaa();
        ((jja) this).field_j = new hn();
        ((jja) this).field_l = param0;
    }

    static {
    }
}
