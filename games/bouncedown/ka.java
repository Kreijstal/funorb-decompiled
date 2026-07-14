/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends wf {
    static String field_k;
    private pk field_p;
    static mj field_o;
    static int field_n;
    bc field_m;
    rb field_l;

    final wf d() {
        kl var1 = null;
        var1 = (kl) (Object) ((ka) this).field_m.a((byte) -52);
        if (var1 != null) {
          if (null != var1.field_i) {
            return (wf) (Object) var1.field_i;
          } else {
            return ((ka) this).c();
          }
        } else {
          return null;
        }
    }

    private final void a(int[] param0, int param1, int param2, kl param3, byte param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pi var11 = null;
        int var12 = 0;
        pk stackIn_14_0 = null;
        kl stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        pk stackIn_15_0 = null;
        kl stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        pk stackIn_16_0 = null;
        kl stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        pk stackOut_13_0 = null;
        kl stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        pk stackOut_15_0 = null;
        kl stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        pk stackOut_14_0 = null;
        kl stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        L0: {
          var12 = Bounce.field_N;
          if (-1 == (((ka) this).field_p.field_l[param3.field_E] & 4 ^ -1)) {
            break L0;
          } else {
            if (param3.field_C < 0) {
              var7 = ((ka) this).field_p.field_K[param3.field_E] / e.field_r;
              L1: while (true) {
                var8 = (var7 + 1048575 + -param3.field_u) / var7;
                if (var8 <= param2) {
                  L2: {
                    param3.field_i.a(param0, param5, var8);
                    param2 = param2 - var8;
                    param3.field_u = param3.field_u + (var8 * var7 - 1048576);
                    param5 = param5 + var8;
                    var9 = e.field_r / 100;
                    var10 = 262144 / var7;
                    if (var9 <= var10) {
                      break L2;
                    } else {
                      var9 = var10;
                      break L2;
                    }
                  }
                  L3: {
                    var11 = param3.field_i;
                    if (((ka) this).field_p.field_s[param3.field_E] != 0) {
                      L4: {
                        param3.field_i = pi.a(param3.field_w, var11.j(), 0, var11.h());
                        stackOut_13_0 = ((ka) this).field_p;
                        stackOut_13_1 = (kl) param3;
                        stackOut_13_2 = -115;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        if (param3.field_D.field_n[param3.field_r] >= 0) {
                          stackOut_15_0 = (pk) (Object) stackIn_15_0;
                          stackOut_15_1 = (kl) (Object) stackIn_15_1;
                          stackOut_15_2 = stackIn_15_2;
                          stackOut_15_3 = 0;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          stackIn_16_3 = stackOut_15_3;
                          break L4;
                        } else {
                          stackOut_14_0 = (pk) (Object) stackIn_14_0;
                          stackOut_14_1 = (kl) (Object) stackIn_14_1;
                          stackOut_14_2 = stackIn_14_2;
                          stackOut_14_3 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          stackIn_16_1 = stackOut_14_1;
                          stackIn_16_2 = stackOut_14_2;
                          stackIn_16_3 = stackOut_14_3;
                          break L4;
                        }
                      }
                      ((pk) (Object) stackIn_16_0).a(stackIn_16_1, (byte) stackIn_16_2, stackIn_16_3 != 0);
                      param3.field_i.d(var9, var11.g());
                      break L3;
                    } else {
                      param3.field_i = pi.a(param3.field_w, var11.j(), var11.g(), var11.h());
                      break L3;
                    }
                  }
                  L5: {
                    if ((param3.field_D.field_n[param3.field_r] ^ -1) <= -1) {
                      break L5;
                    } else {
                      param3.field_i.f(-1);
                      break L5;
                    }
                  }
                  var11.i(var9);
                  var11.a(param0, param5, param1 + -param5);
                  if (var11.k()) {
                    ((ka) this).field_l.a((wf) (Object) var11);
                    continue L1;
                  } else {
                    continue L1;
                  }
                } else {
                  param3.field_u = param3.field_u + param2 * var7;
                  break L0;
                }
              }
            } else {
              param3.field_i.a(param0, param5, param2);
              if (param4 < -54) {
                return;
              } else {
                ((ka) this).a(-79);
                return;
              }
            }
          }
        }
        param3.field_i.a(param0, param5, param2);
        if (param4 < -54) {
          return;
        } else {
          ((ka) this).a(-79);
          return;
        }
    }

    private final void a(kl param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        pk stackIn_18_0 = null;
        kl stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        pk stackIn_19_0 = null;
        kl stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        pk stackIn_20_0 = null;
        kl stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        pk stackOut_17_0 = null;
        kl stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        pk stackOut_19_0 = null;
        kl stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        pk stackOut_18_0 = null;
        kl stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        if ((((ka) this).field_p.field_l[param0.field_E] & 4) != 0) {
          if (param0.field_C < 0) {
            var4 = ((ka) this).field_p.field_K[param0.field_E] / e.field_r;
            var5 = (-param0.field_u + (1048575 - -var4)) / var4;
            param0.field_u = param0.field_u - -(var4 * param1) & 1048575;
            if (var5 <= param1) {
              L0: {
                if (-1 != (((ka) this).field_p.field_s[param0.field_E] ^ -1)) {
                  L1: {
                    param0.field_i = pi.a(param0.field_w, param0.field_i.j(), 0, param0.field_i.h());
                    stackOut_17_0 = ((ka) this).field_p;
                    stackOut_17_1 = (kl) param0;
                    stackOut_17_2 = -128;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    if (param0.field_D.field_n[param0.field_r] >= 0) {
                      stackOut_19_0 = (pk) (Object) stackIn_19_0;
                      stackOut_19_1 = (kl) (Object) stackIn_19_1;
                      stackOut_19_2 = stackIn_19_2;
                      stackOut_19_3 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      stackIn_20_3 = stackOut_19_3;
                      break L1;
                    } else {
                      stackOut_18_0 = (pk) (Object) stackIn_18_0;
                      stackOut_18_1 = (kl) (Object) stackIn_18_1;
                      stackOut_18_2 = stackIn_18_2;
                      stackOut_18_3 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      stackIn_20_3 = stackOut_18_3;
                      break L1;
                    }
                  }
                  ((pk) (Object) stackIn_20_0).a(stackIn_20_1, (byte) stackIn_20_2, stackIn_20_3 != 0);
                  break L0;
                } else {
                  param0.field_i = pi.a(param0.field_w, param0.field_i.j(), param0.field_i.g(), param0.field_i.h());
                  break L0;
                }
              }
              L2: {
                if (0 > param0.field_D.field_n[param0.field_r]) {
                  param0.field_i.f(-1);
                  break L2;
                } else {
                  break L2;
                }
              }
              param1 = param0.field_u / var4;
              if (param2 < -58) {
                param0.field_i.a(param1);
                return;
              } else {
                field_k = null;
                param0.field_i.a(param1);
                return;
              }
            } else {
              if (param2 < -58) {
                param0.field_i.a(param1);
                return;
              } else {
                field_k = null;
                param0.field_i.a(param1);
                return;
              }
            }
          } else {
            if (param2 < -58) {
              param0.field_i.a(param1);
              return;
            } else {
              field_k = null;
              param0.field_i.a(param1);
              return;
            }
          }
        } else {
          if (param2 < -58) {
            param0.field_i.a(param1);
            return;
          } else {
            field_k = null;
            param0.field_i.a(param1);
            return;
          }
        }
    }

    public static void d(int param0) {
        field_o = null;
        field_k = null;
        if (param0 == 0) {
            return;
        }
        field_n = 46;
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        kl var6 = null;
        int var7 = 0;
        var7 = Bounce.field_N;
        ((ka) this).field_l.a(param0, param1, param2);
        var6 = (kl) (Object) ((ka) this).field_m.a((byte) -49);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (((ka) this).field_p.a(var6, 8335400)) {
                break L1;
              } else {
                var5 = param2;
                var4 = param1;
                L2: while (true) {
                  if (var5 <= var6.field_j) {
                    this.a(param0, var4 + var5, var5, var6, (byte) -70, var4);
                    var6.field_j = var6.field_j - var5;
                    break L1;
                  } else {
                    this.a(param0, var4 + var5, var6.field_j, var6, (byte) -109, var4);
                    var4 = var4 + var6.field_j;
                    var5 = var5 - var6.field_j;
                    if (((ka) this).field_p.a(param0, var5, var4, var6, (byte) 106)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            var6 = (kl) (Object) ((ka) this).field_m.d((byte) 127);
            continue L0;
          } else {
            return;
          }
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.removeMouseListener((java.awt.event.MouseListener) (Object) nj.field_o);
        if (param1 > -72) {
          field_k = null;
          param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) nj.field_o);
          param0.removeFocusListener((java.awt.event.FocusListener) (Object) nj.field_o);
          c.field_c = 0;
          return;
        } else {
          param0.removeMouseMotionListener((java.awt.event.MouseMotionListener) (Object) nj.field_o);
          param0.removeFocusListener((java.awt.event.FocusListener) (Object) nj.field_o);
          c.field_c = 0;
          return;
        }
    }

    final int b() {
        return 0;
    }

    final wf c() {
        kl var1 = null;
        L0: while (true) {
          var1 = (kl) (Object) ((ka) this).field_m.d((byte) -94);
          if (var1 != null) {
            if (null != var1.field_i) {
              return (wf) (Object) var1.field_i;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0) {
        int var2 = 0;
        kl var3 = null;
        int var4 = 0;
        var4 = Bounce.field_N;
        ((ka) this).field_l.a(param0);
        var3 = (kl) (Object) ((ka) this).field_m.a((byte) -91);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (!((ka) this).field_p.a(var3, 8335400)) {
                var2 = param0;
                L2: while (true) {
                  if (var2 <= var3.field_j) {
                    this.a(var3, var2, -96);
                    var3.field_j = var3.field_j - var2;
                    break L1;
                  } else {
                    this.a(var3, var3.field_j, -124);
                    var2 = var2 - var3.field_j;
                    if (((ka) this).field_p.a((int[]) null, var2, 0, var3, (byte) 112)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (kl) (Object) ((ka) this).field_m.d((byte) -101);
            continue L0;
          } else {
            return;
          }
        }
    }

    ka(pk param0) {
        ((ka) this).field_m = new bc();
        ((ka) this).field_l = new rb();
        ((ka) this).field_p = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Keys";
    }
}
