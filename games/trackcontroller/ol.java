/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends wh {
    static qj field_n;
    private nb field_p;
    static String field_m;
    ja field_q;
    k field_o;

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        ha var6 = null;
        int var7 = 0;
        var7 = TrackController.field_F ? 1 : 0;
        ((ol) this).field_o.a(param0, param1, param2);
        var6 = (ha) (Object) ((ol) this).field_q.b(2);
        L0: while (true) {
          if (var6 == null) {
            return;
          } else {
            L1: {
              if (((ol) this).field_p.a(-39, var6)) {
                break L1;
              } else {
                var4 = param1;
                var5 = param2;
                L2: while (true) {
                  if (var6.field_w >= var5) {
                    this.a(param0, var4, (byte) 126, var5, var6, var5 + var4);
                    var6.field_w = var6.field_w - var5;
                    break L1;
                  } else {
                    this.a(param0, var4, (byte) 126, var6.field_w, var6, var4 - -var5);
                    var4 = var4 + var6.field_w;
                    var5 = var5 - var6.field_w;
                    if (!((ol) this).field_p.a(var5, param0, var4, 1, var6)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            var6 = (ha) (Object) ((ol) this).field_q.a(10);
            continue L0;
          }
        }
    }

    private final void a(ha param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        nb stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        nb stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        nb stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        nb stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        nb stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        nb stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        if ((4 & ((ol) this).field_p.field_I[param0.field_D]) != 0) {
          if (param0.field_v < 0) {
            L0: {
              var4 = ((ol) this).field_p.field_M[param0.field_D] / oa.field_h;
              var5 = (var4 + (1048575 - param0.field_C)) / var4;
              param0.field_C = 1048575 & param0.field_C + param1 * var4;
              if (var5 > param1) {
                break L0;
              } else {
                L1: {
                  if (0 != ((ol) this).field_p.field_R[param0.field_D]) {
                    L2: {
                      param0.field_l = bh.a(param0.field_n, param0.field_l.f(), 0, param0.field_l.g());
                      stackOut_13_0 = ((ol) this).field_p;
                      stackOut_13_1 = 0;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if ((param0.field_B.field_q[param0.field_i] ^ -1) <= -1) {
                        stackOut_15_0 = (nb) (Object) stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        stackIn_16_2 = stackOut_15_2;
                        break L2;
                      } else {
                        stackOut_14_0 = (nb) (Object) stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        break L2;
                      }
                    }
                    ((nb) (Object) stackIn_16_0).a(stackIn_16_1 != 0, stackIn_16_2 != 0, param0);
                    break L1;
                  } else {
                    param0.field_l = bh.a(param0.field_n, param0.field_l.f(), param0.field_l.e(), param0.field_l.g());
                    break L1;
                  }
                }
                L3: {
                  if (0 > param0.field_B.field_q[param0.field_i]) {
                    param0.field_l.f(-1);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param1 = param0.field_C / var4;
                break L0;
              }
            }
            if (param2 <= -100) {
              param0.field_l.d(param1);
              return;
            } else {
              ((ol) this).field_q = null;
              param0.field_l.d(param1);
              return;
            }
          } else {
            if (param2 <= -100) {
              param0.field_l.d(param1);
              return;
            } else {
              ((ol) this).field_q = null;
              param0.field_l.d(param1);
              return;
            }
          }
        } else {
          if (param2 <= -100) {
            param0.field_l.d(param1);
            return;
          } else {
            ((ol) this).field_q = null;
            param0.field_l.d(param1);
            return;
          }
        }
    }

    final int c() {
        return 0;
    }

    final void d(int param0) {
        int var2 = 0;
        ha var3 = null;
        int var4 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        ((ol) this).field_o.d(param0);
        var3 = (ha) (Object) ((ol) this).field_q.b(2);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              if (!((ol) this).field_p.a(-93, var3)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_w >= var2) {
                    this.a(var3, var2, -118);
                    var3.field_w = var3.field_w - var2;
                    break L1;
                  } else {
                    this.a(var3, var3.field_w, -107);
                    var2 = var2 - var3.field_w;
                    if (!((ol) this).field_p.a(var2, (int[]) null, 0, 1, var3)) {
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
            var3 = (ha) (Object) ((ol) this).field_q.a(10);
            continue L0;
          }
        }
    }

    final wh b() {
        ha var1 = null;
        var1 = (ha) (Object) ((ol) this).field_q.b(2);
        if (var1 != null) {
          if (null != var1.field_l) {
            return (wh) (Object) var1.field_l;
          } else {
            return ((ol) this).a();
          }
        } else {
          return null;
        }
    }

    private final void a(int[] param0, int param1, byte param2, int param3, ha param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        bh var14 = null;
        nb stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        nb stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        nb stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        nb stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        nb stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        nb stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        L0: {
          var12 = TrackController.field_F ? 1 : 0;
          if (-1 == (((ol) this).field_p.field_I[param4.field_D] & 4 ^ -1)) {
            break L0;
          } else {
            if (0 > param4.field_v) {
              var7 = ((ol) this).field_p.field_M[param4.field_D] / oa.field_h;
              L1: while (true) {
                var8 = (-param4.field_C + 1048575 - -var7) / var7;
                if (param3 >= var8) {
                  L2: {
                    param4.field_l.a(param0, param1, var8);
                    param3 = param3 - var8;
                    param1 = param1 + var8;
                    param4.field_C = param4.field_C + (-1048576 + var7 * var8);
                    var9 = oa.field_h / 100;
                    var10 = 262144 / var7;
                    if (var10 >= var9) {
                      break L2;
                    } else {
                      var9 = var10;
                      break L2;
                    }
                  }
                  L3: {
                    var14 = param4.field_l;
                    if (-1 != (((ol) this).field_p.field_R[param4.field_D] ^ -1)) {
                      L4: {
                        param4.field_l = bh.a(param4.field_n, var14.f(), 0, var14.g());
                        stackOut_13_0 = ((ol) this).field_p;
                        stackOut_13_1 = 0;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (0 <= param4.field_B.field_q[param4.field_i]) {
                          stackOut_15_0 = (nb) (Object) stackIn_15_0;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          break L4;
                        } else {
                          stackOut_14_0 = (nb) (Object) stackIn_14_0;
                          stackOut_14_1 = stackIn_14_1;
                          stackOut_14_2 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_16_2 = stackOut_14_2;
                          break L4;
                        }
                      }
                      ((nb) (Object) stackIn_16_0).a(stackIn_16_1 != 0, stackIn_16_2 != 0, param4);
                      param4.field_l.c(var9, var14.e());
                      break L3;
                    } else {
                      param4.field_l = bh.a(param4.field_n, var14.f(), var14.e(), var14.g());
                      break L3;
                    }
                  }
                  L5: {
                    if ((param4.field_B.field_q[param4.field_i] ^ -1) <= -1) {
                      break L5;
                    } else {
                      param4.field_l.f(-1);
                      break L5;
                    }
                  }
                  var14.h(var9);
                  var14.a(param0, param1, param5 - param1);
                  if (!var14.i()) {
                    continue L1;
                  } else {
                    ((ol) this).field_o.a((wh) (Object) var14);
                    continue L1;
                  }
                } else {
                  param4.field_C = param4.field_C + var7 * param3;
                  break L0;
                }
              }
            } else {
              param4.field_l.a(param0, param1, param3);
              if (param2 == 126) {
                return;
              } else {
                int discarded$2 = ((ol) this).c();
                return;
              }
            }
          }
        }
        param4.field_l.a(param0, param1, param3);
        if (param2 != 126) {
          int discarded$3 = ((ol) this).c();
          return;
        } else {
          return;
        }
    }

    final wh a() {
        ha var1_ref = null;
        do {
            var1_ref = (ha) (Object) ((ol) this).field_q.a(10);
            if (var1_ref == null) {
                return null;
            }
        } while (var1_ref.field_l == null);
        return (wh) (Object) var1_ref.field_l;
    }

    public static void f(int param0) {
        field_m = null;
        if (param0 > -2) {
            return;
        }
        field_n = null;
    }

    final static void e(int param0) {
        int var1 = 0;
        if (param0 != 256) {
          L0: {
            ol.f(-80);
            if (-225 < (qd.field_d ^ -1)) {
              var1 = qd.field_d % 32;
              da.a(-var1 + (32 + qd.field_d), (byte) -74);
              break L0;
            } else {
              da.a(256, (byte) -74);
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (-225 < (qd.field_d ^ -1)) {
              var1 = qd.field_d % 32;
              da.a(-var1 + (32 + qd.field_d), (byte) -74);
              break L1;
            } else {
              da.a(256, (byte) -74);
              break L1;
            }
          }
          return;
        }
    }

    ol(nb param0) {
        ((ol) this).field_q = new ja();
        ((ol) this).field_o = new k();
        ((ol) this).field_p = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Please enter your age in years";
    }
}
