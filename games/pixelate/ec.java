/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends mg {
    static String field_n;
    private boolean field_s;
    static int field_t;
    static String field_m;
    static int field_r;
    static java.awt.Canvas field_u;
    static tf field_q;
    private String field_p;
    static String field_o;

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        id var4 = null;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param1);
            var3 = sn.a(var5, 0);
            if (var3 != null) {
              stackIn_3_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 <= -76) {
                  break L1;
                } else {
                  ec.a(true, 49, -104);
                  break L1;
                }
              }
              L2: {
                if (param1.equals(this.field_p)) {
                  break L2;
                } else {
                  var4 = ig.a(200, param1);
                  if (var4 != null) {
                    if (var4.field_c == null) {
                      this.field_p = param1;
                      this.field_s = var4.field_g;
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (this.field_s) {
                stackIn_17_0 = vi.field_L;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_15_0 = ek.field_e;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("ec.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    final void f(int param0) {
        this.field_p = null;
        int var2 = -118 / ((param0 - -56) / 56);
    }

    ec(c param0) {
        super(param0);
        this.field_s = false;
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = ce.field_c;
            L1: while (true) {
              if (var3_int >= pl.field_J.length) {
                L2: {
                  if (!param0) {
                    break L2;
                  } else {
                    stackIn_12_0 = 1;
                    stackIn_12_1 = 50;
                    ec.a(stackIn_12_0 != 0, stackIn_12_1, 69);
                    break L2;
                  }
                }
                stackIn_14_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var5 = uf.field_e[var3_int];
                  if (-1 >= (var5 ^ -1)) {
                    var6 = jp.a(pl.field_J[var3_int], 8192, true);
                    var4 = var4 + ki.field_e;
                    var7 = bq.field_d + -(var6 >> 447013697);
                    if (!mn.a(param1, var4, 59, (lf.field_b << -653544671) + dk.field_d, -uf.field_a + var7, param2, (uf.field_a << -1849595423) + var6)) {
                      var4 = var4 + ((lf.field_b << 1458915521) - -ki.field_e + dk.field_d);
                      break L3;
                    } else {
                      stackIn_7_0 = var5;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    var4 = var4 + da.field_m;
                    break L3;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "ec.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          return stackIn_14_0;
        }
    }

    final static void a(boolean param0, fm param1) {
        tf var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new tf(param1.a((byte) 24, "", "final_frame.jpg"), (java.awt.Component) ((Object) field_u));
            var3 = var2.field_F;
            var4 = var2.field_E;
            ti.a(param0);
            th.field_b = new tf(var3, 3 * var4 / 4);
            th.field_b.c();
            var2.f(0, 0);
            in.field_s = new tf(var3, var4 + -th.field_b.field_E);
            in.field_s.c();
            var2.f(0, -th.field_b.field_E);
            in.field_s.field_y = th.field_b.field_E;
            ia.a((byte) 92);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ec.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        if (param0 != 0) {
            return;
        }
        field_q = null;
        field_n = null;
        field_u = null;
        field_m = null;
        field_o = null;
    }

    final dj a(String param0, boolean param1) {
        id var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        dj stackIn_2_0 = null;
        dj stackIn_5_0 = null;
        dj stackIn_12_0 = null;
        dj stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param0);
            if (fm.a((byte) 63, var4)) {
              if (param1) {
                L1: {
                  if (!param0.equals(this.field_p)) {
                    L2: {
                      var3 = ig.a(200, param0);
                      if (var3 == null) {
                        break L2;
                      } else {
                        if (null != var3.field_c) {
                          break L2;
                        } else {
                          this.field_p = param0;
                          this.field_s = var3.field_g;
                          break L1;
                        }
                      }
                    }
                    stackIn_12_0 = tg.field_j;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
                L3: {
                  if (this.field_s) {
                    stackIn_17_0 = qk.field_g;
                    break L3;
                  } else {
                    stackIn_17_0 = sk.field_a;
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_5_0 = (dj) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = sk.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3_ref);

            stackIn_20_1 = new StringBuilder().append("ec.D(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              return stackIn_17_0;
            }
          }
        }
    }

    static {
        field_m = "Checking";
        field_n = "Hide game chat";
        field_o = "Close";
    }
}
