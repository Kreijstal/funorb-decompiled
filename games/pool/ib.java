/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends kd {
    ko field_t;
    static bp field_s;
    static boolean field_v;
    static int field_r;
    private vk field_w;
    static di field_u;
    static String[] field_q;
    ai field_p;

    final kd b() {
        pr var1 = null;
        L0: while (true) {
          var1 = (pr) (Object) ((ib) this).field_t.f((byte) -5);
          if (var1 != null) {
            if (null != var1.field_o) {
              return (kd) (Object) var1.field_o;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static void c(int param0) {
        if (param0 > -21) {
            field_s = null;
            lf.a(17, (byte) 77);
            return;
        }
        lf.a(17, (byte) 77);
    }

    private final void a(int param0, pr param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        vk stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        pr stackIn_14_2 = null;
        vk stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        pr stackIn_15_2 = null;
        vk stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        pr stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        vk stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        pr stackOut_13_2 = null;
        vk stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        pr stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        vk stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        pr stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        if (param2 == 1048575) {
          if ((((ib) this).field_w.field_F[param1.field_t] & 4) != 0) {
            if (param1.field_G < 0) {
              var4 = ((ib) this).field_w.field_L[param1.field_t] / bp.field_h;
              var5 = (-param1.field_y + (var4 + 1048575)) / var4;
              param1.field_y = param1.field_y - -(var4 * param0) & 1048575;
              if (var5 <= param0) {
                if (((ib) this).field_w.field_U[param1.field_t] != 0) {
                  L0: {
                    param1.field_o = nb.b(param1.field_C, param1.field_o.m(), 0, param1.field_o.f());
                    stackOut_13_0 = ((ib) this).field_w;
                    stackOut_13_1 = param2 + -1048698;
                    stackOut_13_2 = (pr) param1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    if (-1 >= (param1.field_u.field_s[param1.field_A] ^ -1)) {
                      stackOut_15_0 = (vk) (Object) stackIn_15_0;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = (pr) (Object) stackIn_15_2;
                      stackOut_15_3 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      stackIn_16_3 = stackOut_15_3;
                      break L0;
                    } else {
                      stackOut_14_0 = (vk) (Object) stackIn_14_0;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = (pr) (Object) stackIn_14_2;
                      stackOut_14_3 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_16_2 = stackOut_14_2;
                      stackIn_16_3 = stackOut_14_3;
                      break L0;
                    }
                  }
                  L1: {
                    ((vk) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, stackIn_16_3 != 0);
                    if ((param1.field_u.field_s[param1.field_A] ^ -1) > -1) {
                      param1.field_o.e(-1);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  param0 = param1.field_y / var4;
                  param1.field_o.a(param0);
                  return;
                } else {
                  L2: {
                    param1.field_o = nb.b(param1.field_C, param1.field_o.m(), param1.field_o.j(), param1.field_o.f());
                    if ((param1.field_u.field_s[param1.field_A] ^ -1) > -1) {
                      param1.field_o.e(-1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  param0 = param1.field_y / var4;
                  param1.field_o.a(param0);
                  return;
                }
              } else {
                param1.field_o.a(param0);
                return;
              }
            } else {
              param1.field_o.a(param0);
              return;
            }
          } else {
            param1.field_o.a(param0);
            return;
          }
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, pr param2, int param3, int param4, int[] param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        nb var11 = null;
        int var12 = 0;
        vk stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        pr stackIn_13_2 = null;
        vk stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        pr stackIn_14_2 = null;
        vk stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        pr stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        vk stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        pr stackOut_12_2 = null;
        vk stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        pr stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        vk stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        pr stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        L0: {
          var12 = Pool.field_O;
          if (-1 == (4 & ((ib) this).field_w.field_F[param2.field_t] ^ -1)) {
            break L0;
          } else {
            if ((param2.field_G ^ -1) > -1) {
              var7 = ((ib) this).field_w.field_L[param2.field_t] / bp.field_h;
              L1: while (true) {
                var8 = (1048575 + var7 + -param2.field_y) / var7;
                if (param4 < var8) {
                  param2.field_y = param2.field_y + param4 * var7;
                  break L0;
                } else {
                  L2: {
                    param2.field_o.a(param5, param0, var8);
                    param4 = param4 - var8;
                    param2.field_y = param2.field_y + (-1048576 + var8 * var7);
                    param0 = param0 + var8;
                    var9 = bp.field_h / 100;
                    var10 = 262144 / var7;
                    if (var9 <= var10) {
                      break L2;
                    } else {
                      var9 = var10;
                      break L2;
                    }
                  }
                  L3: {
                    var11 = param2.field_o;
                    if (((ib) this).field_w.field_U[param2.field_t] != 0) {
                      L4: {
                        param2.field_o = nb.b(param2.field_C, var11.m(), 0, var11.f());
                        stackOut_12_0 = ((ib) this).field_w;
                        stackOut_12_1 = -125;
                        stackOut_12_2 = (pr) param2;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        if ((param2.field_u.field_s[param2.field_A] ^ -1) <= -1) {
                          stackOut_14_0 = (vk) (Object) stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = (pr) (Object) stackIn_14_2;
                          stackOut_14_3 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          stackIn_15_2 = stackOut_14_2;
                          stackIn_15_3 = stackOut_14_3;
                          break L4;
                        } else {
                          stackOut_13_0 = (vk) (Object) stackIn_13_0;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = (pr) (Object) stackIn_13_2;
                          stackOut_13_3 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_15_1 = stackOut_13_1;
                          stackIn_15_2 = stackOut_13_2;
                          stackIn_15_3 = stackOut_13_3;
                          break L4;
                        }
                      }
                      ((vk) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_15_3 != 0);
                      param2.field_o.c(var9, var11.j());
                      break L3;
                    } else {
                      param2.field_o = nb.b(param2.field_C, var11.m(), var11.j(), var11.f());
                      break L3;
                    }
                  }
                  L5: {
                    if (-1 < (param2.field_u.field_s[param2.field_A] ^ -1)) {
                      param2.field_o.e(-1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var11.c(var9);
                  var11.a(param5, param0, param1 + -param0);
                  if (!var11.g()) {
                    continue L1;
                  } else {
                    ((ib) this).field_p.b((kd) (Object) var11);
                    continue L1;
                  }
                }
              }
            } else {
              if (param3 == 1048575) {
                param2.field_o.a(param5, param0, param4);
                return;
              } else {
                ib.c(-60);
                param2.field_o.a(param5, param0, param4);
                return;
              }
            }
          }
        }
        if (param3 == 1048575) {
          param2.field_o.a(param5, param0, param4);
          return;
        } else {
          ib.c(-60);
          param2.field_o.a(param5, param0, param4);
          return;
        }
    }

    final int d() {
        return 0;
    }

    final kd a() {
        pr var1 = null;
        var1 = (pr) (Object) ((ib) this).field_t.c((byte) 76);
        if (var1 != null) {
          if (null != var1.field_o) {
            return (kd) (Object) var1.field_o;
          } else {
            return ((ib) this).b();
          }
        } else {
          return null;
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        pr var6 = null;
        int var7 = 0;
        var7 = Pool.field_O;
        ((ib) this).field_p.a(param0, param1, param2);
        var6 = (pr) (Object) ((ib) this).field_t.c((byte) -67);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (!((ib) this).field_w.a(-16257, var6)) {
                var5 = param2;
                var4 = param1;
                L2: while (true) {
                  if (var6.field_D >= var5) {
                    this.a(var4, var4 + var5, var6, 1048575, var5, param0);
                    var6.field_D = var6.field_D - var5;
                    break L1;
                  } else {
                    this.a(var4, var4 - -var5, var6, 1048575, var6.field_D, param0);
                    var5 = var5 - var6.field_D;
                    var4 = var4 + var6.field_D;
                    if (!((ib) this).field_w.a(var5, param0, var4, 1, var6)) {
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
            var6 = (pr) (Object) ((ib) this).field_t.f((byte) -5);
            continue L0;
          } else {
            return;
          }
        }
    }

    public static void d(int param0) {
        field_s = null;
        if (param0 != -1) {
            field_q = null;
            field_u = null;
            field_q = null;
            return;
        }
        field_u = null;
        field_q = null;
    }

    final static int[] a(double[] param0, int param1) {
        if (param1 != -30100) {
            ib.d(-75);
            return tq.a(3, -20607, param0);
        }
        return tq.a(3, -20607, param0);
    }

    final void a(int param0) {
        int var2 = 0;
        pr var3 = null;
        int var4 = 0;
        var4 = Pool.field_O;
        ((ib) this).field_p.a(param0);
        var3 = (pr) (Object) ((ib) this).field_t.c((byte) -20);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (((ib) this).field_w.a(-16257, var3)) {
                break L1;
              } else {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_D) {
                    this.a(var2, var3, 1048575);
                    var3.field_D = var3.field_D - var2;
                    break L1;
                  } else {
                    this.a(var3.field_D, var3, 1048575);
                    var2 = var2 - var3.field_D;
                    if (((ib) this).field_w.a(var2, (int[]) null, 0, 1, var3)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var3 = (pr) (Object) ((ib) this).field_t.f((byte) -5);
            continue L0;
          } else {
            return;
          }
        }
    }

    ib(vk param0) {
        ((ib) this).field_t = new ko();
        ((ib) this).field_p = new ai();
        ((ib) this).field_w = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
