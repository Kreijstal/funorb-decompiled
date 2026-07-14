/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends sg {
    static boolean field_s;
    private gh field_q;
    vn field_l;
    static wj[] field_p;
    static int field_o;
    static ch field_m;
    m field_n;
    static qb field_k;
    static String field_r;

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        o var6 = null;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        ((hk) this).field_n.a(param0, param1, param2);
        var6 = (o) (Object) ((hk) this).field_l.b(12623);
        L0: while (true) {
          if (var6 != null) {
            if (!((hk) this).field_q.a(true, var6)) {
              var5 = param2;
              var4 = param1;
              L1: while (true) {
                if (var5 <= var6.field_C) {
                  this.a(var6, var4, var5, var4 - -var5, param0, 59);
                  var6.field_C = var6.field_C - var5;
                  var6 = (o) (Object) ((hk) this).field_l.a(0);
                  continue L0;
                } else {
                  this.a(var6, var4, var6.field_C, var5 + var4, param0, 82);
                  var4 = var4 + var6.field_C;
                  var5 = var5 - var6.field_C;
                  if (((hk) this).field_q.a(var4, 24464, var5, param0, var6)) {
                    var6 = (o) (Object) ((hk) this).field_l.a(0);
                    continue L0;
                  } else {
                    continue L1;
                  }
                }
              }
            } else {
              var6 = (o) (Object) ((hk) this).field_l.a(0);
              continue L0;
            }
          } else {
            return;
          }
        }
    }

    public static void b(boolean param0) {
        field_m = null;
        if (param0) {
          field_o = 74;
          field_r = null;
          field_p = null;
          field_k = null;
          return;
        } else {
          field_r = null;
          field_p = null;
          field_k = null;
          return;
        }
    }

    final int c() {
        return 0;
    }

    private final void a(o param0, int param1, int param2, int param3, int[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        kd var11 = null;
        int var12 = 0;
        gh stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        gh stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        gh stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        gh stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        gh stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        gh stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        if ((4 & ((hk) this).field_q.field_Q[param0.field_H]) != 0) {
          if (param0.field_y >= 0) {
            var7 = -125 / ((21 - param5) / 35);
            param0.field_n.a(param4, param1, param2);
            return;
          } else {
            var7 = ((hk) this).field_q.field_s[param0.field_H] / lb.field_r;
            L0: while (true) {
              var8 = (-param0.field_l + var7 + 1048575) / var7;
              if (param2 >= var8) {
                L1: {
                  param0.field_n.a(param4, param1, var8);
                  param1 = param1 + var8;
                  param0.field_l = param0.field_l + (-1048576 + var7 * var8);
                  param2 = param2 - var8;
                  var9 = lb.field_r / 100;
                  var10 = 262144 / var7;
                  if (var9 > var10) {
                    var9 = var10;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var11 = param0.field_n;
                  if (((hk) this).field_q.field_H[param0.field_H] == 0) {
                    param0.field_n = kd.a(param0.field_m, var11.i(), var11.f(), var11.g());
                    break L2;
                  } else {
                    L3: {
                      param0.field_n = kd.a(param0.field_m, var11.i(), 0, var11.g());
                      stackOut_10_0 = ((hk) this).field_q;
                      stackOut_10_1 = 11132;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      if (0 <= param0.field_D.field_m[param0.field_t]) {
                        stackOut_12_0 = (gh) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        break L3;
                      } else {
                        stackOut_11_0 = (gh) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        break L3;
                      }
                    }
                    ((gh) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2 != 0, param0);
                    param0.field_n.d(var9, var11.f());
                    break L2;
                  }
                }
                L4: {
                  if (param0.field_D.field_m[param0.field_t] < 0) {
                    param0.field_n.e(-1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var11.d(var9);
                var11.a(param4, param1, -param1 + param3);
                if (!var11.h()) {
                  continue L0;
                } else {
                  ((hk) this).field_n.b((sg) (Object) var11);
                  continue L0;
                }
              } else {
                param0.field_l = param0.field_l + var7 * param2;
                var7 = -125 / ((21 - param5) / 35);
                param0.field_n.a(param4, param1, param2);
                return;
              }
            }
          }
        } else {
          var7 = -125 / ((21 - param5) / 35);
          param0.field_n.a(param4, param1, param2);
          return;
        }
    }

    final sg b() {
        o var1 = null;
        int var2 = 0;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        L0: while (true) {
          var1 = (o) (Object) ((hk) this).field_l.a(0);
          if (var1 != null) {
            if (null != var1.field_n) {
              return (sg) (Object) var1.field_n;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_3_0 = 0;
        boolean stackOut_2_0 = false;
        if (param0 != 0) {
          L0: {
            boolean discarded$8 = hk.c(-43);
            if (null != ka.field_m) {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = ie.field_Pb;
              stackIn_8_0 = stackOut_6_0 ? 1 : 0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (null != ka.field_m) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = ie.field_Pb;
              stackIn_4_0 = stackOut_2_0 ? 1 : 0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final sg a() {
        o var1 = (o) (Object) ((hk) this).field_l.b(12623);
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_n == null)) {
            return (sg) (Object) var1.field_n;
        }
        return ((hk) this).b();
    }

    private final void a(o param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        gh stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        gh stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        gh stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        gh stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        gh stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        gh stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        if ((((hk) this).field_q.field_Q[param0.field_H] & 4) != 0) {
          if (0 > param0.field_y) {
            var4 = ((hk) this).field_q.field_s[param0.field_H] / lb.field_r;
            var5 = (1048575 + (var4 + -param0.field_l)) / var4;
            param0.field_l = 1048575 & param0.field_l + var4 * param2;
            if (param2 >= var5) {
              L0: {
                if (0 != ((hk) this).field_q.field_H[param0.field_H]) {
                  L1: {
                    param0.field_n = kd.a(param0.field_m, param0.field_n.i(), 0, param0.field_n.g());
                    stackOut_17_0 = ((hk) this).field_q;
                    stackOut_17_1 = 11132;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    if (0 <= param0.field_D.field_m[param0.field_t]) {
                      stackOut_19_0 = (gh) (Object) stackIn_19_0;
                      stackOut_19_1 = stackIn_19_1;
                      stackOut_19_2 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      break L1;
                    } else {
                      stackOut_18_0 = (gh) (Object) stackIn_18_0;
                      stackOut_18_1 = stackIn_18_1;
                      stackOut_18_2 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      break L1;
                    }
                  }
                  ((gh) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_20_2 != 0, param0);
                  break L0;
                } else {
                  param0.field_n = kd.a(param0.field_m, param0.field_n.i(), param0.field_n.f(), param0.field_n.g());
                  break L0;
                }
              }
              L2: {
                if (0 > param0.field_D.field_m[param0.field_t]) {
                  param0.field_n.e(-1);
                  break L2;
                } else {
                  break L2;
                }
              }
              param2 = param0.field_l / var4;
              if (param1 == 0) {
                param0.field_n.a(param2);
                return;
              } else {
                boolean discarded$4 = hk.c(-38);
                param0.field_n.a(param2);
                return;
              }
            } else {
              if (param1 == 0) {
                param0.field_n.a(param2);
                return;
              } else {
                boolean discarded$5 = hk.c(-38);
                param0.field_n.a(param2);
                return;
              }
            }
          } else {
            if (param1 == 0) {
              param0.field_n.a(param2);
              return;
            } else {
              boolean discarded$6 = hk.c(-38);
              param0.field_n.a(param2);
              return;
            }
          }
        } else {
          if (param1 == 0) {
            param0.field_n.a(param2);
            return;
          } else {
            boolean discarded$7 = hk.c(-38);
            param0.field_n.a(param2);
            return;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        o var3 = null;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        ((hk) this).field_n.a(param0);
        var3 = (o) (Object) ((hk) this).field_l.b(12623);
        L0: while (true) {
          if (var3 != null) {
            if (!((hk) this).field_q.a(true, var3)) {
              var2 = param0;
              L1: while (true) {
                if (var3.field_C >= var2) {
                  this.a(var3, 0, var2);
                  var3.field_C = var3.field_C - var2;
                  var3 = (o) (Object) ((hk) this).field_l.a(0);
                  continue L0;
                } else {
                  this.a(var3, 0, var3.field_C);
                  var2 = var2 - var3.field_C;
                  if (((hk) this).field_q.a(0, 24464, var2, (int[]) null, var3)) {
                    var3 = (o) (Object) ((hk) this).field_l.a(0);
                    continue L0;
                  } else {
                    continue L1;
                  }
                }
              }
            } else {
              var3 = (o) (Object) ((hk) this).field_l.a(0);
              continue L0;
            }
          } else {
            return;
          }
        }
    }

    final static void d(int param0) {
        u.field_k = false;
        field_s = false;
        if (param0 != -24225) {
          hk.b(true);
          ee.a(-1, (byte) 30);
          in.field_Gb = uj.field_h;
          hb.field_Gb = uj.field_h;
          return;
        } else {
          ee.a(-1, (byte) 30);
          in.field_Gb = uj.field_h;
          hb.field_Gb = uj.field_h;
          return;
        }
    }

    hk(gh param0) {
        ((hk) this).field_l = new vn();
        ((hk) this).field_n = new m();
        ((hk) this).field_q = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new ch(2);
        field_r = "Password is valid";
    }
}
