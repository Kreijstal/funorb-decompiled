/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends ug implements el {
    private rg field_hb;
    static e field_lb;
    static dk field_ob;
    static nf[] field_mb;
    static String field_ib;
    static int field_jb;
    static String field_nb;
    static int field_kb;

    final static void a(int param0, boolean param1) {
        if (param0 <= -29) {
          if (kc.field_o) {
            bg.field_a = bk.a(320, true, param1, oj.field_B);
            return;
          } else {
            if (bj.field_m) {
              ji.field_e = qh.a(param1, (byte) 108);
              return;
            } else {
              L0: {
                da.field_e.b(param1, (byte) -115);
                if (!ej.field_b) {
                  ej.field_b = true;
                  he.field_d.a(h.field_R);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            }
          }
        } else {
          field_ob = (dk) null;
          if (kc.field_o) {
            bg.field_a = bk.a(320, true, param1, oj.field_B);
            return;
          } else {
            if (bj.field_m) {
              ji.field_e = qh.a(param1, (byte) 108);
              return;
            } else {
              L1: {
                da.field_e.b(param1, (byte) -115);
                if (!ej.field_b) {
                  ej.field_b = true;
                  he.field_d.a(h.field_R);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          }
        }
    }

    final static void n(int param0) {
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param0 == 15102) {
              if (!hm.f((byte) 6)) {
                L1: {
                  if (null == dn.field_d) {
                    break L1;
                  } else {
                    if (!dn.field_d.field_f) {
                      break L1;
                    } else {
                      qh.c(4);
                      ie.field_b.c(new ei(ie.field_b, wl.field_f), param0 + -15102);
                      break L1;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                ie.field_b.a(true, true, pe.field_m, qe.field_Q);
                ie.field_b.i((byte) 52);
                L2: while (true) {
                  if (!nm.e((byte) -96)) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    ie.field_b.a((byte) 101, ad.field_h, gk.field_r);
                    continue L2;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "ei.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void h(byte param0) {
        he.field_f = -1;
        vf.field_o = null;
        sa.field_R = false;
        if (param0 > -93) {
            return;
        }
        hm.field_qb = 0;
        nm.field_I = -1;
    }

    private ei(sh param0, ci param1) {
        super(param0, 200, 150);
        Object var3 = null;
        fj var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (kd.field_t != param1) {
                if (wl.field_f == param1) {
                  var3 = sf.field_s;
                  this.field_z = this.field_z + 10;
                  if (!kj.a((byte) -14)) {
                    break L1;
                  } else {
                    var3 = v.field_Cb;
                    this.field_z = this.field_z + 20;
                    break L1;
                  }
                } else {
                  if (fj.field_x != param1) {
                    break L1;
                  } else {
                    var3 = ql.field_A;
                    this.field_z = this.field_z + 30;
                    break L1;
                  }
                }
              } else {
                var3 = gh.field_d;
                break L1;
              }
            }
            var4 = new fj((String) (var3), (uk) null);
            var4.field_F = this.field_F;
            var4.field_z = 80;
            var4.field_q = 0;
            var4.field_m = 50;
            var4.field_n = (fe) ((Object) new vf(fa.field_Q, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.b(var4, 10);
            this.field_hb = this.a((uk) (this), s.field_J, -27167);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("ei.<init>(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    private final rg a(uk param0, String param1, int param2) {
        rg discarded$1 = null;
        rg var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        rg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new rg(param1, param0);
              var4.field_n = (fe) ((Object) new je());
              if (param2 == -27167) {
                break L1;
              } else {
                var6 = (String) null;
                discarded$1 = this.a((uk) null, (String) null, 101);
                break L1;
              }
            }
            var5 = this.field_z + -6;
            this.field_z = this.field_z + 38;
            var4.a(param2 ^ 27234, -16 + this.field_F - 14, var5, 30, 15);
            this.b(var4, 10);
            this.d(param2 ^ -27171);
            stackIn_3_0 = (rg) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("ei.F(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void i(byte param0) {
        field_ob = null;
        field_nb = null;
        int var1 = -69 / ((param0 - 9) / 60);
        field_lb = null;
        field_ib = null;
        field_mb = null;
    }

    final static bm o(int param0) {
        bm var1;
        var1 = new bm(kb.field_a, em.field_e, jl.field_p[0], ij.field_r[0], rg.field_I[0], sd.field_f[0], rj.field_f[0], an.field_p);
        ql.a(false);
        if (param0 < 20) {
          field_jb = 35;
          return var1;
        } else {
          return var1;
        }
    }

    public final void a(int param0, int param1, int param2, rg param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 68) {
                break L1;
              } else {
                this.field_hb = (rg) null;
                break L1;
              }
            }
            if (this.field_hb != param3) {
              break L0;
            } else {
              this.c(true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("ei.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ')');
        }
    }

    private final void c(boolean param0) {
        if (!(this.field_H)) {
            return;
        }
        this.field_H = false;
        if (!param0) {
            field_jb = 117;
        }
    }

    static {
        field_lb = new e(13, 0, 1, 0);
        field_jb = 0;
        field_ib = "Orb coins: ";
        field_kb = 0;
        field_nb = "Reload game";
    }
}
