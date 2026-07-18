/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uda extends qra {
    static nh field_r;
    private daa field_m;
    private vna field_n;
    static String field_w;
    static String field_o;
    static int field_q;
    private int field_p;
    private boolean field_y;
    static jea field_s;
    private rp[] field_t;
    private int field_u;
    private int field_v;
    static int field_x;

    private final boolean f(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != 0) {
            return true;
        }
        ad var2 = (ad) (Object) ((uda) this).field_n.f(param0 ^ -80);
        while (var2 != null) {
            if (var2.a((byte) -85)) {
                if (!var2.a(-64)) {
                    ((uda) this).field_v = var2.field_f;
                    return true;
                }
            }
            var2 = (ad) (Object) ((uda) this).field_n.e(111);
        }
        return false;
    }

    final boolean a(char param0, int param1, int param2) {
        L0: {
          if (0 == ((uda) this).field_p) {
            break L0;
          } else {
            if (!this.i(param1 ^ -26)) {
              break L0;
            } else {
              L1: {
                if (param1 == 25) {
                  break L1;
                } else {
                  boolean discarded$2 = this.f(94);
                  break L1;
                }
              }
              L2: {
                if (84 == param2) {
                  break L2;
                } else {
                  if (param2 != 83) {
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              this.a(true, ((uda) this).field_v);
              return true;
            }
          }
        }
        return false;
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ad var6_ref_ad = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var10 = TombRacer.field_G ? 1 : 0;
          la.field_j.a(0, 0);
          var3 = aaa.a(false) / 2;
          var4 = koa.b(0) / 2;
          if (this.i(-1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          ik.field_h.a(0, 0);
          int discarded$4 = be.a(gta.field_a.toUpperCase(), 1, qr.field_v, 2431750, 0, 48, 1, -222 + var4, var3 + -360, -1, (byte) 60, 512);
          if (-1 != ((uda) this).field_u) {
            break L1;
          } else {
            if (var5 == 0) {
              break L1;
            } else {
              int discarded$5 = be.a(jsa.field_F, 1, eda.field_f, 2431750, 0, 48, 1, koa.b(0) + -48, var3 - 256, -1, (byte) 60, 512);
              break L1;
            }
          }
        }
        var6_ref_ad = (ad) (Object) ((uda) this).field_n.f(-80);
        L2: while (true) {
          if (var6_ref_ad == null) {
            L3: {
              if (param0 < -50) {
                break L3;
              } else {
                ((uda) this).a(33, true);
                break L3;
              }
            }
            ura.a(-10985);
            var6 = ((uda) this).field_t.length;
            var11 = 0;
            var7 = var11;
            L4: while (true) {
              if (var6 <= var11) {
                int discarded$6 = -6;
                se.f();
                ((uda) this).d(-27142);
                return;
              } else {
                L5: {
                  var8 = 64 + -(var6 * 64) + var3 + (var11 * 128 + -10);
                  var9 = var4 - -80;
                  if (((uda) this).field_t[var11] != null) {
                    ((uda) this).field_t[var11].a(var8, 1400, var9 - -55, (byte) 73);
                    break L5;
                  } else {
                    bsa.field_i.a(-(bsa.field_i.a() >> 1) + var8, -(bsa.field_i.c() >> 1) + var9, 0, 1627389951, 1);
                    break L5;
                  }
                }
                int discarded$7 = be.a(((uda) this).field_h.a(var11, false).toUpperCase(), 1, qf.field_j, wga.field_a[var11], 0, 32, 1, 55 + var9, var8 + -64, -1, (byte) 60, 128);
                var11++;
                continue L4;
              }
            }
          } else {
            L6: {
              if (var6_ref_ad.field_f != ((uda) this).field_v) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L6;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L6;
              }
            }
            var7 = stackIn_11_0;
            var6_ref_ad.a((byte) -9, var7 != 0);
            var6_ref_ad = (ad) (Object) ((uda) this).field_n.e(119);
            continue L2;
          }
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (((uda) this).field_y) {
            break L0;
          } else {
            li.b(((uda) this).field_h.l(param0 + 41), (byte) 107);
            ((uda) this).field_y = true;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (((uda) this).field_t.length <= var3) {
            L2: {
              if (param1) {
                ((uda) this).c(7);
                break L2;
              } else {
                break L2;
              }
            }
            if (((uda) this).field_u < 0) {
              L3: {
                ((uda) this).field_m.a(32221);
                if (!param1) {
                  break L3;
                } else {
                  if (!this.i(param0 + -81)) {
                    break L3;
                  } else {
                    int discarded$2 = -13;
                    this.g();
                    break L3;
                  }
                }
              }
              L4: {
                if (((uda) this).field_m.a(false)) {
                  ((uda) this).field_u = 100;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (param0 == 80) {
                  break L5;
                } else {
                  boolean discarded$3 = ((uda) this).a('H', -116, 32);
                  break L5;
                }
              }
              ((uda) this).field_p = ((uda) this).field_p + 1;
              return;
            } else {
              L6: {
                ((uda) this).field_u = ((uda) this).field_u - 1;
                if (((uda) this).field_u == 0) {
                  if (((uda) this).field_h.field_D) {
                    return;
                  } else {
                    ((uda) this).field_h.c(111);
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              return;
            }
          } else {
            if (null != ((uda) this).field_t[var3]) {
              ((uda) this).field_t[var3].b(-73);
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    private final void a(boolean param0, int param1) {
        if (!this.i(-1)) {
            return;
        }
        if (null != ((uda) this).field_f) {
            ((uda) this).field_f.d(param1, 73);
        } else {
            ((uda) this).a(((uda) this).field_h.field_x, 0, param1);
        }
    }

    uda(qh param0, v param1) {
        super(param0, param1);
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ad var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        ((uda) this).field_p = 0;
        ((uda) this).field_v = 0;
        ((uda) this).field_u = -1;
        try {
          L0: {
            ((uda) this).field_m = new daa(((uda) this).field_c);
            ((uda) this).field_m.field_b = new w();
            ((uda) this).field_n = new vna();
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= 13) {
                var3_int = param0.field_k.field_H.length;
                ((uda) this).field_t = new rp[var3_int];
                ((uda) this).field_y = false;
                break L0;
              } else {
                L2: {
                  var4 = aaa.a(false);
                  var5 = koa.b(0);
                  var6 = var3_int % 7 * ((-90 + var4) / 7) + 45;
                  stackOut_3_0 = -90;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var3_int >= 7) {
                    stackOut_5_0 = stackIn_5_0;
                    stackOut_5_1 = (var5 >> 1) + 20;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L2;
                  } else {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = (var5 >> 1) + -84;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_6_0 + stackIn_6_1;
                  if (var3_int < 7) {
                    break L3;
                  } else {
                    var6 += 32;
                    break L3;
                  }
                }
                L4: {
                  var8 = new ad(var6, var7);
                  if (!this.a(var3_int, (byte) -35)) {
                    break L4;
                  } else {
                    var8 = new ad(var3_int, var6, var7);
                    break L4;
                  }
                }
                ((uda) this).field_n.b((byte) -104, (vg) (Object) var8);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("uda.<init>(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        ((uda) this).field_m.a((byte) -69, param2, param0);
        ((uda) this).field_t[param0] = new rp(param2);
        bua var4 = ((uda) this).field_t[param0].field_j;
        var4.a(param2, false, param1, 5, true);
        int var5 = var4.c((byte) 114);
        var4.a(param1 + 107, var5, param2, 0, 0);
        jha var6 = ab.a(param1 ^ -41, gl.a((byte) 82, coa.field_n, new String[2]));
        iqa.field_c.a(0, var6);
    }

    private final boolean i(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            ((uda) this).field_p = -18;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((uda) this).field_h.d((byte) 111)) {
              break L2;
            } else {
              if (((uda) this).field_m.a(0, ((uda) this).field_h.field_x) != -1) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void g() {
        int var3 = 0;
        Object stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_28_2 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        int stackOut_26_2 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (((uda) this).field_p == 0) {
          return;
        } else {
          L0: {
            if (!qma.field_c) {
              break L0;
            } else {
              if (!this.f(0)) {
                break L0;
              } else {
                if (hf.field_b == 1) {
                  this.a(true, ((uda) this).field_v);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L1: {
            if (!((uda) this).field_h.g(0, 2)) {
              break L1;
            } else {
              ((uda) this).field_v = ((uda) this).field_v - 7;
              break L1;
            }
          }
          L2: {
            if (!((uda) this).field_h.g(0, 3)) {
              break L2;
            } else {
              ((uda) this).field_v = ((uda) this).field_v + 7;
              break L2;
            }
          }
          L3: {
            if (!((uda) this).field_h.g(0, 0)) {
              break L3;
            } else {
              ((uda) this).field_v = ((uda) this).field_v - 1;
              break L3;
            }
          }
          L4: {
            if (((uda) this).field_h.g(0, 1)) {
              ((uda) this).field_v = ((uda) this).field_v + 1;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (((uda) this).field_v < 13) {
              break L5;
            } else {
              ((uda) this).field_v = ((uda) this).field_v - 13;
              break L5;
            }
          }
          L6: {
            if (0 > ((uda) this).field_v) {
              ((uda) this).field_v = ((uda) this).field_v + 13;
              break L6;
            } else {
              break L6;
            }
          }
          L7: while (true) {
            if (this.a(((uda) this).field_v, (byte) -74)) {
              return;
            } else {
              L8: {
                L9: {
                  stackOut_23_0 = this;
                  stackOut_23_1 = ((uda) this).field_v;
                  stackIn_26_0 = stackOut_23_0;
                  stackIn_26_1 = stackOut_23_1;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  if (((uda) this).field_h.g(0, 0)) {
                    break L9;
                  } else {
                    stackOut_24_0 = this;
                    stackOut_24_1 = stackIn_24_1;
                    stackIn_27_0 = stackOut_24_0;
                    stackIn_27_1 = stackOut_24_1;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    if (!((uda) this).field_h.g(0, 2)) {
                      stackOut_27_0 = this;
                      stackOut_27_1 = stackIn_27_1;
                      stackOut_27_2 = 1;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      stackIn_28_2 = stackOut_27_2;
                      break L8;
                    } else {
                      stackOut_25_0 = this;
                      stackOut_25_1 = stackIn_25_1;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      break L9;
                    }
                  }
                }
                stackOut_26_0 = this;
                stackOut_26_1 = stackIn_26_1;
                stackOut_26_2 = -1;
                stackIn_28_0 = stackOut_26_0;
                stackIn_28_1 = stackOut_26_1;
                stackIn_28_2 = stackOut_26_2;
                break L8;
              }
              L10: {
                ((uda) this).field_v = stackIn_28_1 + stackIn_28_2;
                if (((uda) this).field_v >= 13) {
                  ((uda) this).field_v = ((uda) this).field_v + -13;
                  break L10;
                } else {
                  break L10;
                }
              }
              if (((uda) this).field_v < 0) {
                ((uda) this).field_v = 13 + ((uda) this).field_v;
                continue L7;
              } else {
                continue L7;
              }
            }
          }
        }
    }

    private final boolean a(int param0, byte param1) {
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          if (param1 < -29) {
            break L0;
          } else {
            field_s = null;
            break L0;
          }
        }
        L1: {
          if (vpa.a(119)) {
            break L1;
          } else {
            if (mq.field_e != null) {
              L2: {
                L3: {
                  if (di.field_g[param0]) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        if (di.field_f[param0]) {
                          break L5;
                        } else {
                          if (wla.field_ub <= 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (mq.field_e.b((byte) 4, param0)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                    int discarded$3 = 0;
                    if (!eq.c()) {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L2;
              }
              return stackIn_16_0 != 0;
            } else {
              break L1;
            }
          }
        }
        return di.field_g[param0];
    }

    final boolean e(int param0) {
        if (param0 != -9202) {
            return false;
        }
        return true;
    }

    public static void h(int param0) {
        field_o = null;
        field_w = null;
        field_s = null;
        if (param0 < 9) {
            uda.h(105);
        }
        field_r = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "(finished quicker)";
        field_w = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
