/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    static boolean field_d;
    private uh field_g;
    private uh field_a;
    static vd field_c;
    static int field_f;
    static String field_e;
    static boolean field_b;

    final uh d(int param0) {
        if (param0 != 5518) {
            return (uh) null;
        }
        uh var2 = this.field_g.field_p;
        if (var2 == this.field_g) {
            return null;
        }
        var2.f(64);
        return var2;
    }

    final static void a(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        gk stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        gk var9 = null;
        int var10 = 0;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var1_int = uk.field_e + -hg.field_rb;
            hg.field_rb = ma.field_wb + -(var1_int >> -576071743);
            jc.field_i = -(hi.field_a >> 1423132065) + rd.field_B;
            uk.field_e = var1_int + hg.field_rb;
            var2 = jc.field_i;
            var3 = param0;
            L1: while (true) {
              if (var3 >= bc.field_e.length) {
                break L0;
              } else {
                L2: {
                  var4 = vh.field_c[var3];
                  if (0 > var4) {
                    var5 = bg.field_r;
                    break L2;
                  } else {
                    if (ma.field_tb.field_f != var4) {
                      var5 = dh.field_M;
                      break L2;
                    } else {
                      var5 = bb.field_g;
                      break L2;
                    }
                  }
                }
                L3: {
                  var6 = bc.field_e[var3];
                  stackIn_10_0 = 12286;

                  if (-1 < (var4 ^ -1)) {
                    stackIn_11_0 = stackIn_10_0;
                    stackIn_11_1 = 0;
                    break L3;
                  } else {
                    stackIn_11_0 = stackIn_10_0;
                    stackIn_11_1 = 1;
                    break L3;
                  }
                }
                L4: {
                  var7 = hj.a(stackIn_11_0, stackIn_11_1 != 0, var6);
                  var8 = -(var7 >> 545600961) + ma.field_wb;
                  if (var4 < 0) {
                    break L4;
                  } else {
                    L5: {
                      if (var4 == ma.field_tb.field_f) {
                        stackIn_15_0 = bc.field_c;
                        break L5;
                      } else {
                        stackIn_15_0 = hj.field_i;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_15_0;
                      var2 = var2 + mf.field_F;
                      if (var9 == null) {
                        break L6;
                      } else {
                        var9.a((pd.field_b << 1867688993) + pa.field_a, var8 + -gd.field_c, var7 - -(gd.field_c << -1980693983), var2, param0 + 7453);
                        break L6;
                      }
                    }
                    var2 = var2 + pd.field_b;
                    break L4;
                  }
                }
                L7: {
                  if (0 <= var4) {
                    sl.field_o.c(var6, var8, ae.field_kb + var2, var5, -1);
                    var2 = var2 + (pa.field_a + (mf.field_F + pd.field_b));
                    break L7;
                  } else {
                    k.field_H.c(var6, var8, var2 + cd.field_b, var5, -1);
                    var2 = var2 + wa.field_R;
                    break L7;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1), "hl.A(" + param0 + ')');
        }
    }

    final static void a(je param0, int param1, int param2) {
        lh var6 = null;
        int var4 = 0;
        try {
            var6 = nj.field_p;
            var6.d(param2, -18392);
            var6.field_j = var6.field_j + 1;
            var4 = var6.field_j;
            var6.c(1, (byte) -108);
            var6.c(param0.field_m, (byte) -98);
            var6.c(param0.field_l, (byte) -95);
            var6.a(param0.field_o, (byte) -42);
            int var5 = 27 % ((40 - param1) / 62);
            var6.a(param0.field_p, (byte) 126);
            var6.a(param0.field_n, (byte) 123);
            var6.a(param0.field_h, (byte) -115);
            var6.d(var4, (byte) 48);
            var6.b(var6.field_j + -var4, (byte) 87);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "hl.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int b(int param0) {
        int var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var2 = 0;
        uh var3 = this.field_g.field_p;
        while (var3 != this.field_g) {
            var2++;
            var3 = var3.field_p;
        }
        if (param0 != 1423132065) {
            this.b(-11);
        }
        return var2;
    }

    final uh c(int param0) {
        uh var2 = this.field_a;
        if (!(var2 != this.field_g)) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_p;
        int var3 = -60 / ((-21 - param0) / 62);
        return var2;
    }

    final void a(uh param0, int param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0.field_n == null) {
                break L1;
              } else {
                param0.f(64);
                break L1;
              }
            }
            L2: {
              param0.field_n = this.field_g.field_n;
              param0.field_p = this.field_g;
              param0.field_n.field_p = param0;
              param0.field_p.field_n = param0;
              if (param1 == 0) {
                break L2;
              } else {
                field_b = true;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("hl.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    public hl() {
        this.field_g = new uh();
        this.field_g.field_p = this.field_g;
        this.field_g.field_n = this.field_g;
    }

    public static void e(int param0) {
        field_c = null;
        if (param0 < 90) {
            hl.a(-21);
        }
        field_e = null;
    }

    final uh a(boolean param0) {
        uh var2 = this.field_g.field_p;
        if (!param0) {
            field_c = (vd) null;
        }
        if (this.field_g == var2) {
            this.field_a = null;
            return null;
        }
        this.field_a = var2.field_p;
        return var2;
    }

    final static int a(int param0, boolean param1, int param2, int param3) {
        if (param2 != -1980693983) {
            return 114;
        }
        return wi.b(-1);
    }

    static {
        field_d = false;
        field_c = new vd();
        field_e = "Loading levels";
        field_b = false;
    }
}
