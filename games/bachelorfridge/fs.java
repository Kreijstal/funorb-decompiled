/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs {
    static int[] field_e;
    private boolean field_c;
    private op field_d;
    static int field_f;
    private gj field_b;
    boolean field_a;

    final void a(int param0, int param1) {
        aga[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga[] var7 = null;
        aga[] var8 = null;
        L0: {
          var6 = BachelorFridge.field_y;
          if (!((fs) this).field_a) {
            var7 = ((fs) this).field_b.field_h.field_S[0].field_b;
            var8 = var7;
            var4 = new aga[var7.length];
            var5 = 0;
            L1: while (true) {
              if (var8.length <= var5) {
                ((fs) this).field_d.a(param0 ^ 1, (rk[]) (Object) var4, 0);
                ((fs) this).field_d.i((byte) -99);
                ((fs) this).field_d.i(param0);
                hla.field_t.field_g = 0;
                ((fs) this).field_d.b(hla.field_t, (byte) 123);
                hla.field_t.field_g = 0;
                dj.field_c.field_h.a(-2, hla.field_t);
                this.c(15467);
                break L0;
              } else {
                if (var8[var5] != null) {
                  var4[var5] = new aga((rk) (Object) var8[var5], ((fs) this).field_d, 0, var5);
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          } else {
            sja.field_fb.c(68, (byte) 108);
            sja.field_fb.d(param1, 0);
            break L0;
          }
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            fs.c((byte) 97);
            break L2;
          }
        }
    }

    public static void c(byte param0) {
        if (param0 != -59) {
            return;
        }
        field_e = null;
    }

    final void b(int param0) {
        if (!((fs) this).field_a) {
            return;
        }
        sja.field_fb.c(param0, (byte) 125);
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (0 == ((fs) this).field_d.field_A) {
            ((fs) this).field_d.field_A = 1;
            break L0;
          } else {
            ((fs) this).field_d.b(0);
            break L0;
          }
        }
        L1: {
          var2 = ((fs) this).field_d.field_A;
          var3 = ((fs) this).field_d.field_N ? 1 : 0;
          var4 = ((fs) this).field_d.field_M;
          var5 = ((fs) this).field_d.field_Q;
          var6 = ju.field_q[((fs) this).field_d.field_G];
          if (((fs) this).field_b.field_h.field_A == -1) {
            if (-1 != var2) {
              stackOut_7_0 = 1;
              stackIn_9_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = 0;
              stackIn_9_0 = stackOut_6_0;
              break L1;
            }
          } else {
            stackOut_4_0 = 0;
            stackIn_9_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var7 = stackIn_9_0;
          ((fs) this).field_b.field_h.a(var2, -16292, var3 != 0);
          ((fs) this).field_b.field_h.field_Q = var5;
          ((fs) this).field_b.field_h.field_M = var4;
          if (2 == ((fs) this).field_b.field_h.field_o) {
            ((fs) this).field_b.c(640, var4, var5);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var7 == 0) {
            break L3;
          } else {
            ((fs) this).field_b.l(-112);
            break L3;
          }
        }
        L4: {
          ((fs) this).field_b.field_M = 0;
          ((fs) this).field_b.field_m = true;
          ((fs) this).field_b.field_k = var6;
          ((fs) this).field_b.field_Y = new sfa[7];
          ((fs) this).field_b.field_u = var6;
          ((fs) this).field_b.field_p = var6 + -500;
          if (!((fs) this).field_b.field_h.field_N) {
            ((fs) this).field_b.f((byte) 50);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          ((fs) this).field_b.d((byte) 96);
          if (af.field_a) {
            if (((fs) this).field_b.field_h.field_e != 0) {
              break L5;
            } else {
              ((fs) this).field_b.field_h.a(true, 0);
              ((fs) this).field_b.e(-61);
              break L5;
            }
          } else {
            break L5;
          }
        }
        ((fs) this).field_b.m(10);
    }

    final void d(int param0) {
        if (!(((fs) this).field_a)) {
            return;
        }
        ((fs) this).field_b.field_h.field_v = ((fs) this).field_b.field_h.field_v | 1 << ((fs) this).field_b.field_n;
        sja.field_fb.c(60, (byte) 102);
        int var2 = -10 / ((param0 - -61) / 49);
    }

    final void b(byte param0) {
        if (param0 != 27) {
            ((fs) this).b((byte) 78);
        }
        if (!(((fs) this).field_a)) {
            return;
        }
        sja.field_fb.c(61, (byte) 127);
    }

    final void d(byte param0) {
        int var2 = 0;
        pf var3 = null;
        int var4 = 0;
        L0: {
          if (param0 == -16) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        L1: {
          if (((fs) this).field_a) {
            if (!((fs) this).field_c) {
              sja.field_fb.c(96, (byte) 102);
              ((fs) this).field_c = true;
              var2 = ((fs) this).field_b.field_h.c((byte) -81);
              if (((fs) this).field_b.field_h.field_A <= 3) {
                break L1;
              } else {
                if (((fs) this).field_b.field_g == var2) {
                  break L1;
                } else {
                  var3 = sja.field_fb;
                  var3.c(97, (byte) 97);
                  var3.field_g = var3.field_g + 2;
                  var4 = var3.field_g;
                  var3.e(var2, -1615464796);
                  var3.e(((fs) this).field_b.field_g, -1615464796);
                  ((fs) this).field_b.field_h.b((lu) (Object) var3, (byte) 127);
                  var3.a((byte) -88, var3.field_g + -var4);
                  hna.a(0, param0 ^ -100);
                  vc.a((byte) -99);
                  break L1;
                }
              }
            } else {
              return;
            }
          } else {
            if (0 != ((fs) this).field_b.field_M) {
              break L1;
            } else {
              ((fs) this).field_b.c(false);
              break L1;
            }
          }
        }
    }

    final void a(boolean param0, sfa[] param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (((fs) this).field_a) {
                sja.field_fb.c(58, (byte) 107);
                int fieldTemp$2 = sja.field_fb.field_g + 1;
                sja.field_fb.field_g = sja.field_fb.field_g + 1;
                var4_int = fieldTemp$2;
                sja.field_fb.d(param2, 0);
                var5 = 0;
                L2: while (true) {
                  if (7 <= var5) {
                    var5 = -var4_int + sja.field_fb.field_g;
                    sja.field_fb.b((byte) 83, var5);
                    break L1;
                  } else {
                    sd.a((byte) 124, (lu) (Object) sja.field_fb, param1[var5]);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                ((fs) this).field_d.a(param1, 0, (byte) -31);
                this.c(15467);
                hla.field_t.field_g = 0;
                ((fs) this).field_d.a(hla.field_t, -1);
                ((fs) this).field_d.h((byte) -111);
                var4_int = hla.field_t.field_g;
                hla.field_t.field_g = 0;
                ((fs) this).field_b.field_h.a(var4_int, true, hla.field_t);
                ((fs) this).field_b.b((byte) 31);
                ((fs) this).field_b.field_cb = false;
                break L1;
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                ((fs) this).a((byte) -74);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("fs.J(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ')');
        }
    }

    fs(gj param0, boolean param1) {
        op var3 = null;
        try {
            ((fs) this).field_b = param0;
            ((fs) this).field_a = param1 ? true : false;
            if (!((fs) this).field_a) {
                var3 = ((fs) this).field_b.field_h;
                ((fs) this).field_d = new op(var3.field_G, var3.field_E, var3.field_k, var3.field_o, var3.field_m, var3.field_y);
                hla.field_t.field_g = 0;
                ((fs) this).field_b.field_h.b(hla.field_t, (byte) 126);
                hla.field_t.field_g = 0;
                ((fs) this).field_d.a(-2, hla.field_t);
            }
            ((fs) this).field_c = true;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fs.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static wda[][] a(int param0) {
        wda[][] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wda[][] var6 = null;
        L0: {
          var5 = BachelorFridge.field_y;
          var6 = new wda[6][10];
          var1 = var6;
          if (param0 == 1) {
            break L0;
          } else {
            wda[][] discarded$1 = fs.a(11);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (6 <= var2) {
            return var1;
          } else {
            var3 = 0;
            L2: while (true) {
              if (var3 >= 10) {
                var2++;
                continue L1;
              } else {
                var4 = 0;
                if (jf.field_n[var3][var2] != 1) {
                  if (2 == jf.field_n[var3][var2]) {
                    var4 = (byte)(var4 | 2);
                    var4 = (byte)(var4 | 8);
                    var4 = (byte)(var4 | 4);
                    var6[var2][var3] = new wda((byte) var4, 2);
                    var3++;
                    continue L2;
                  } else {
                    if (jf.field_n[var3][var2] != 3) {
                      var4 = 4;
                      var6[var2][var3] = new wda((byte) var4, 0);
                      var3++;
                      continue L2;
                    } else {
                      var4 = (byte)(var4 | 2);
                      var4 = (byte)(var4 | 8);
                      var4 = (byte)(var4 | 1);
                      var4 = (byte)(var4 | 4);
                      var6[var2][var3] = new wda((byte) var4, 3);
                      var3++;
                      continue L2;
                    }
                  }
                } else {
                  var4 = (byte)(var4 | 2);
                  var4 = (byte)(var4 | 8);
                  var4 = (byte)(var4 | 1);
                  var4 = (byte)(var4 | 4);
                  var6[var2][var3] = new wda((byte) var4, 1);
                  var3++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void a(byte param0) {
        ((fs) this).field_c = false;
        int var2 = -64 / ((39 - param0) / 35);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 360;
    }
}
