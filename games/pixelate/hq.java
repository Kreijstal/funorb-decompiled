/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class hq extends de {
    static int field_r;
    private int field_J;
    private String field_y;
    private String field_A;
    private String field_v;
    private String field_o;
    private String field_K;
    private String field_s;
    static vg field_q;
    private String field_w;
    private int field_H;
    private boolean field_B;
    private int field_x;
    private int field_I;
    private int field_z;
    private String[] field_M;
    private int field_G;
    private String field_u;
    static String field_D;
    private int field_E;
    private String[] field_p;
    static String field_t;

    final void a(int param0, int param1, boolean param2, boolean param3, boolean param4, boolean param5, int param6, int param7, int param8, int param9) {
        int var12 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        String stackIn_8_1 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        String stackIn_12_1 = null;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        String stackOut_7_1 = null;
        Object stackOut_6_0 = null;
        String stackOut_6_1 = null;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        String stackOut_11_1 = null;
        Object stackOut_10_0 = null;
        String stackOut_10_1 = null;
        L0: {
          var12 = Pixelate.field_H ? 1 : 0;
          ((hq) this).field_G = 0;
          if (param7 == 2) {
            break L0;
          } else {
            hq.f((byte) -64);
            break L0;
          }
        }
        L1: {
          ((hq) this).field_v = this.e(10, param0);
          ((hq) this).field_E = param1;
          ((hq) this).field_H = param8;
          ((hq) this).field_J = param6;
          ((hq) this).field_K = di.a(false, param9);
          if (!param4) {
            if (!param5) {
              if (param2) {
                ((hq) this).field_A = ah.field_u;
                ((hq) this).field_I = 5;
                break L1;
              } else {
                ((hq) this).field_A = gq.field_m;
                ((hq) this).field_I = 0;
                break L1;
              }
            } else {
              ((hq) this).field_A = pg.field_d;
              ((hq) this).field_I = 9;
              break L1;
            }
          } else {
            L2: {
              if (param5) {
                break L2;
              } else {
                if (param2) {
                  break L2;
                } else {
                  L3: {
                    stackOut_5_0 = this;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (param3) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = gf.field_c;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L3;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = gq.field_m;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L3;
                    }
                  }
                  ((hq) this).field_A = stackIn_8_1;
                  ((hq) this).field_I = 0;
                  break L1;
                }
              }
            }
            L4: {
              stackOut_9_0 = this;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (param3) {
                stackOut_11_0 = this;
                stackOut_11_1 = gf.field_c;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L4;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = vi.field_J;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L4;
              }
            }
            ((hq) this).field_A = stackIn_12_1;
            ((hq) this).field_I = 10;
            break L1;
          }
        }
        ((hq) this).field_x = -1;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        ob var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = Pixelate.field_H ? 1 : 0;
          if (((hq) this).field_G != 1) {
            gj.field_W[7].b(0, 45);
            break L0;
          } else {
            gj.field_W[4].b(0, 45);
            break L0;
          }
        }
        L1: {
          ((hq) this).d((byte) -81);
          ((hq) this).b((byte) -71);
          var2 = 20;
          var3 = 70;
          var4 = 167;
          if (param0 == 11) {
            break L1;
          } else {
            var9 = null;
            ((hq) this).a((String) null, 91, (pm) null);
            break L1;
          }
        }
        var5_int = 0;
        L2: while (true) {
          if (5 <= var5_int) {
            L3: {
              var5 = rk.field_e;
              var6 = 190;
              var7 = var5.field_w - -var5.field_z - -3;
              if (((hq) this).field_G == 0) {
                var5.a(tg.field_b, 120, var6, 0, -1);
                var5.c(((hq) this).field_v, 540, var6, 1, -1);
                var6 = var6 + var7;
                var5.a(ep.field_d, 120, var6, 0, -1);
                var5.c(Integer.toString(((hq) this).field_E), 540, var6, 1, -1);
                var6 = var6 + var7;
                var5.a(vi.field_E, 120, var6, 0, -1);
                var5.c(Integer.toString(((hq) this).field_H), 540, var6, 1, -1);
                var6 = var6 + var7;
                var5.a(lo.field_Lb, 120, var6, 0, -1);
                var5.c(Integer.toString(((hq) this).field_J), 540, var6, 1, -1);
                var6 = var6 + var7;
                t.d(118, var6 - 5, 424, 9, 0);
                t.d(120, var6 + -2, 420, 3, 16777215);
                var6 = var6 + var7;
                var5.a(he.field_c, 120, var6, 0, -1);
                var5.c(((hq) this).field_K, 540, var6, 1, -1);
                break L3;
              } else {
                if (((hq) this).field_G != 1) {
                  if (((hq) this).field_G != 2) {
                    break L3;
                  } else {
                    L4: {
                      if (((hq) this).field_o != null) {
                        var5.b(((hq) this).field_o, 330, var6, 0, -1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var6 = var6 + var7;
                    var5.a("Final Scores:", 120, var6, 0, -1);
                    var6 = var6 + var7;
                    var5.a(((hq) this).field_M[((hq) this).field_z], 120, var6, 0, -1);
                    var5.c(((hq) this).field_p[((hq) this).field_z], 540, var6, 1, -1);
                    var6 = var6 + var7;
                    var5.a(((hq) this).field_M[1 + -((hq) this).field_z], 120, var6, 0, -1);
                    var5.c(((hq) this).field_p[1 + -((hq) this).field_z], 540, var6, 1, -1);
                    var6 = var6 + var7;
                    var5.b(((hq) this).field_w, 330, var6, 0, -1);
                    break L3;
                  }
                } else {
                  var6 = var6 + var7;
                  var5.a(tg.field_b, 120, var6, 0, -1);
                  var5.c(((hq) this).field_v, 540, var6, 1, -1);
                  var6 = var6 + var7;
                  var5.a(ep.field_d, 120, var6, 0, -1);
                  var5.c(((hq) this).field_y, 540, var6, 1, -1);
                  var6 = var6 + var7;
                  t.d(118, var6 + -5, 424, 9, 0);
                  t.d(120, var6 + -2, 420, 3, 16777215);
                  var6 = var6 + var7;
                  var5.b(((hq) this).field_u, 330, var6, 0, -1);
                  break L3;
                }
              }
            }
            return;
          } else {
            rg.field_e.field_a[0].f(var3, var4);
            var4 = var4 + var2;
            rg.field_e.field_a[1].f(var3 - -(var2 >> 2), var4);
            var4 = var4 + var2;
            var5_int++;
            continue L2;
          }
        }
    }

    hq(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    private final String e(int param0, int param1) {
        if (param0 != 10) {
            ((hq) this).field_H = -21;
        }
        int var3 = param1 / 3000;
        int var4 = param1 % 3000 / 50;
        return var3 + ":" + (var4 < 10 ? "0" : "") + var4;
    }

    private final int d(int param0, int param1) {
        int var3 = rk.field_e.c(param1 == 0 ? ((hq) this).field_A : ((hq) this).field_s);
        if (!(param1 != 0)) {
            var3 += 40;
        }
        int var4 = -32 / ((param0 - -16) / 47);
        return var3;
    }

    final void f(int param0) {
        ((hq) this).field_B = false;
        if (param0 >= -119) {
            ((hq) this).field_u = null;
        }
    }

    final boolean c(int param0, int param1) {
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          if (param0 < -112) {
            break L0;
          } else {
            ((hq) this).f(-55);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 == 0) {
              break L2;
            } else {
              L3: {
                if (1 != ((hq) this).field_G) {
                  break L3;
                } else {
                  if (((hq) this).field_x != -1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (2 != ((hq) this).field_G) {
                  break L4;
                } else {
                  if (!((hq) this).field_B) {
                    break L4;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L1;
            }
          }
          stackOut_9_0 = 1;
          stackIn_11_0 = stackOut_9_0;
          break L1;
        }
        return stackIn_11_0 != 0;
    }

    final int b(int param0, int param1) {
        int var3 = 120 / ((-13 - param0) / 37);
        return ((hq) this).field_d;
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, !((hq) this).c(-113, 1) ? 0 : 1, param2);
    }

    final void a(boolean param0, boolean param1, int param2, int param3, byte param4, int param5, int param6) {
        ((hq) this).field_u = !param1 ? qj.field_c : wb.field_a;
        ((hq) this).field_G = 1;
        ((hq) this).field_x = param5;
        ((hq) this).field_y = sd.a(lj.field_b, param4 + 21, new String[2]);
        if (param4 != 34) {
            return;
        }
        ((hq) this).field_v = this.e(param4 + -24, param3);
        if (!(((hq) this).field_x == -1)) {
            ((hq) this).field_s = !param1 ? vm.field_f : kn.field_P;
        }
        if (!param0) {
            ((hq) this).field_I = 17;
            ((hq) this).field_A = tn.field_f;
        } else {
            ((hq) this).field_I = 9;
            ((hq) this).field_A = pg.field_d;
        }
    }

    final void c(byte param0) {
        ((hq) this).b((byte) 12, false);
        if (param0 > -13) {
            hq.f((byte) 29);
        }
    }

    final static int a(byte param0, int param1) {
        int var2 = -((-10 + param1) / 2) + 25;
        int var3 = 0;
        if (var2 < 5) {
            var2 = 5;
        }
        return var2;
    }

    final int a(int param0, boolean param1) {
        if (param1) {
            field_r = -93;
        }
        return ((hq) this).a(param0, (byte) 90) + this.d(-112, param0);
    }

    final void c(int param0) {
        if (param0 != 0) {
            ((hq) this).field_K = null;
        }
        if (null == ro.field_e) {
            super.c(0);
        } else {
            ro.field_e.a(false, param0);
            t.a(0, 0, 640, 480);
            rh.b((byte) -75);
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        if (param1 >= -106) {
            int discarded$0 = this.d(-3, 100);
        }
        if (oa.field_j == 1) {
            kj.a(((hq) this).field_x, (byte) 126);
            fc.field_e = 14;
            var3 = param0 ? 1 : 0;
            int discarded$1 = -25528;
            la.a(!gq.d(121) ? 0 : 12, -3, var3 != 0);
        } else {
            if (oa.field_j == 2) {
                ro.field_e.g(46);
            }
        }
    }

    final void a(String param0, int param1, pm param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              ((hq) this).field_G = 2;
              if (param0 != null) {
                ((hq) this).field_w = sd.a(qm.field_G, param1 ^ -47, new String[1]);
                break L1;
              } else {
                ((hq) this).field_w = td.field_c;
                break L1;
              }
            }
            ((hq) this).field_M = new String[2];
            ((hq) this).field_p = new String[2];
            var4_int = 0;
            L2: while (true) {
              if (var4_int >= 2) {
                L3: {
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (param2.field_v[0] >= param2.field_v[1]) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L3;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L3;
                  }
                }
                L4: {
                  ((hq) this).field_z = stackIn_10_1;
                  ((hq) this).field_I = -5;
                  ((hq) this).field_A = ko.field_jb;
                  if (param1 == -10) {
                    break L4;
                  } else {
                    ((hq) this).field_G = -27;
                    break L4;
                  }
                }
                L5: {
                  if (((hq) this).field_B) {
                    ((hq) this).e(1);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                break L0;
              } else {
                ((hq) this).field_M[var4_int] = param2.field_i[var4_int];
                ((hq) this).field_p[var4_int] = di.a(false, param2.field_v[var4_int]);
                var4_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("hq.U(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
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
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        if (!(!((hq) this).c(-122, 1))) {
            var3 = 60;
            if (0 == param0) {
                return var3;
            }
            return -var3 + (640 + -this.d(98, param0));
        }
        if (param1 != 90) {
            field_t = null;
        }
        return 320 - (this.d(87, param0) >> 1);
    }

    final void a(int param0, boolean param1, boolean param2) {
        int var6_int = 0;
        int var4 = param0 * 2;
        if (!param1) {
            hq.f((byte) -107);
        }
        int var5 = 128 <= param0 ? param0 * 2 - 256 : 0;
        if (param2) {
            var6_int = var4;
            var4 = var5;
            var5 = var6_int;
        }
        if (!(c.field_R != null)) {
            c.field_R = vk.a(480, 123, (java.awt.Component) (Object) new java.awt.Canvas(), 640);
        }
        ha var6 = qa.field_f;
        qa.field_f = c.field_R;
        qa.field_f.a(19692);
        ((hq) this).c(0);
        qa.field_f = var6;
        qa.field_f.a(19692);
        fi.a(c.field_R.field_e, var4, var5);
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          ((hq) this).field_B = true;
          var2 = ro.field_e.field_z;
          var3 = ro.field_e.field_a.field_p;
          var4 = ro.field_e.field_o;
          if ((var3 & param0 << var2) != 0) {
            ((hq) this).field_s = fg.field_c;
            break L0;
          } else {
            if (var3 == 0) {
              if (3 == (1 << ro.field_e.field_z | var4)) {
                ((hq) this).field_s = bm.field_t;
                break L0;
              } else {
                ((hq) this).field_s = dq.field_c;
                break L0;
              }
            } else {
              ((hq) this).field_s = sc.field_c;
              break L0;
            }
          }
        }
    }

    final void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((hq) this).field_o = param0;
              if (param1 == -4) {
                break L1;
              } else {
                ((hq) this).e(79);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("hq.JA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final void a(byte param0, boolean param1, int param2) {
        if (param2 == 0) {
            ((hq) this).a(param1, ((hq) this).field_A, oc.field_N, -6, ((hq) this).a(0, (byte) 90) + ((hq) this).a(0, false) >> 1);
        } else {
            super.a(((hq) this).field_s, param1, param2, oc.field_N, (byte) 99);
        }
        if (param0 > -116) {
            ((hq) this).field_E = 4;
        }
    }

    final void b(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (oa.field_j != 2) {
            L1: {
              var3 = ((hq) this).field_I;
              var4 = param1 ? 1 : 0;
              if (!gq.d(104)) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              } else {
                stackOut_6_0 = 12;
                stackIn_8_0 = stackOut_6_0;
                break L1;
              }
            }
            int discarded$4 = -25528;
            la.a(stackIn_8_0, var3, var4 != 0);
            break L0;
          } else {
            L2: {
              if (!md.field_Y) {
                break L2;
              } else {
                var3 = param1 ? 1 : 0;
                int discarded$5 = -25528;
                la.a(ti.field_t, -5, var3 != 0);
                break L2;
              }
            }
            if (!oa.field_i) {
              break L0;
            } else {
              qj.a(false, 0, 11);
              break L0;
            }
          }
        }
        L3: {
          if (param0 == 12) {
            break L3;
          } else {
            ((hq) this).field_A = null;
            break L3;
          }
        }
    }

    public static void f(byte param0) {
        field_D = null;
        field_q = null;
        if (param0 >= -37) {
            field_t = null;
        }
        field_t = null;
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        pf stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        pf stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        pf stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        pf stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        pf stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        pf stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        L0: {
          var3 = Pixelate.field_H ? 1 : 0;
          var2 = ke.field_a;
          if (((hq) this).field_g.c((byte) 35)) {
            break L0;
          } else {
            L1: {
              if (((hq) this).field_g.field_j != -1) {
                break L1;
              } else {
                L2: {
                  if (var2 == 98) {
                    break L2;
                  } else {
                    if (var2 == 99) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  stackOut_14_0 = ((hq) this).field_g;
                  stackOut_14_1 = 0;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  if (!((hq) this).c(-118, 1)) {
                    stackOut_16_0 = (pf) (Object) stackIn_16_0;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    break L3;
                  } else {
                    stackOut_15_0 = (pf) (Object) stackIn_15_0;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    break L3;
                  }
                }
                ((pf) (Object) stackIn_17_0).a(stackIn_17_1 != 0, stackIn_17_2);
                break L0;
              }
            }
            L4: {
              if (((hq) this).field_g.field_j != 0) {
                break L4;
              } else {
                if (var2 != 97) {
                  break L4;
                } else {
                  if (((hq) this).c(-119, 1)) {
                    ((hq) this).field_g.a(false, 1);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
            if (1 != ((hq) this).field_g.field_j) {
              break L0;
            } else {
              if (var2 == 96) {
                ((hq) this).field_g.a(false, 0);
                break L0;
              } else {
                break L0;
              }
            }
          }
        }
        L5: {
          if (param0 < -35) {
            break L5;
          } else {
            hq.f((byte) -122);
            break L5;
          }
        }
        ((hq) this).field_g.b((byte) -71);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = "Connection restored.";
    }
}
