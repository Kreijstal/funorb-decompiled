/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends am implements lja {
    private hf field_U;
    static kv field_S;
    static String field_V;
    static vr field_T;

    final static int a(boolean param0, int param1) {
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        try {
          pn.field_f = pn.field_f + 65536;
          while (c.a(ph.field_D, pn.field_f, false) >= 65536) {
            wga.field_s = wga.field_s + 1;
            pn.field_f = pn.field_f - ph.field_D;
          }
          var2_int = -1;
          if (null == oja.field_f) {
            if (null != taa.field_m) {
              var2_int = taa.field_m.length;
            }
          } else {
            var2_int = oja.field_f.length;
          }
          if (-1 != var2_int) {
            boolean decompiledFrameRemainder0 = true;
            if (ph.field_G > gp.field_A) {
              gp.field_A = gp.field_A + 1;
              if (ph.field_E < gp.field_A && (oja.field_f == null ||
                null == oja.field_f[ih.field_l])) {
                gp.field_A = gp.field_A - 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (gp.field_A >= ph.field_G &&
                  oja.field_f[(ih.field_l + 1) % var2_int] == null) {
                  gp.field_A = gp.field_A - 1;
                }
              }
            }
            if (gp.field_A >= ph.field_G) {
              vj.field_n = ih.field_l;
              if (!ja.field_p) {
                ih.field_l = ih.field_l - 1;
                if (ih.field_l < 0) {
                  ih.field_l = ih.field_l + var2_int;
                }
              } else {
                ih.field_l = ih.field_l + 1;
                if (ih.field_l >= var2_int) {
                  ih.field_l = ih.field_l - var2_int;
                }
              }
              gp.field_A = gp.field_A - ph.field_G;
            }
            if (ph.field_E < gp.field_A) {
              ja.field_p = true;
            }
          }
          if (param1 != 0) {
            field_V = (String) null;
          }
          if (id.field_h != null) {
            var3 = 357 - id.field_h.field_o / 2;
            var4 = 0;
            if (0 != lf.field_c &&
              var3 < jc.field_r &&
              jc.field_r < id.field_h.field_p + var3) {
              if (269 - id.field_h.field_q < nfa.field_a &&
                nfa.field_a < 269) {
                var4 = 1;
                ja.field_p = false;
                gp.field_A = ph.field_G;
              }
              if (586 < nfa.field_a &&
                nfa.field_a < 586 + id.field_h.field_q) {
                var4 = 1;
                ja.field_p = true;
                gp.field_A = ph.field_G;
              }
            }
            if (var4 == 0 &&
              ph.field_E < gp.field_A &&
              gd.field_m > var3 &&
              id.field_h.field_p + var3 > gd.field_m) {
              if (-id.field_h.field_q + 269 < mk.field_p &&
                mk.field_p < 269) {
                gp.field_A = ph.field_E;
              }
              if (586 < mk.field_p &&
                mk.field_p < 586 + id.field_h.field_q) {
                gp.field_A = ph.field_E;
              }
            }
          }
          if (param0) {
            ic.field_i.a(wja.a(jc.field_r, nfa.field_a, false), -121, wja.a(gd.field_m, mk.field_p, false));
            if (ic.field_i.e(0)) {
              if (ic.field_i.field_g == 0) {
                stackIn_61_0 = 3;
                return stackIn_61_0;
              }
              if (ic.field_i.field_g == 1) {
                stackIn_64_0 = 2;
                return stackIn_64_0;
              }
            }
            while (kaa.b(param1 + 127)) {
              ic.field_i.a(0, -128);
              if (ic.field_i.e(0)) {
                if (ic.field_i.field_g == 0) {
                  stackIn_71_0 = 3;
                  return stackIn_71_0;
                }
                if (1 == ic.field_i.field_g) {
                  stackIn_74_0 = 1;
                  return stackIn_74_0;
                }
              }
              if (gf.field_k != 13) {
                continue;
              }
              stackIn_78_0 = 1;
              return stackIn_78_0;
            }
          }
          stackIn_80_0 = 0;
          return stackIn_80_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "em.T(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        fb.field_p = param1 >> 4 & 3;
        if (!(fb.field_p <= 2)) {
          fb.field_p = 2;
        }
        ri.field_c = param1 >> 2 & 3;
        if (2 < ri.field_c) {
          ri.field_c = 2;
          fj.field_g = 3 & param1;
          if (param0 < fj.field_g) {
            fj.field_g = 2;
            return;
          }
          return;
        }
        fj.field_g = 3 & param1;
        if (param0 < fj.field_g) {
          fj.field_g = 2;
          return;
        }
    }

    private final hf a(int param0, String param1, pl param2) {
        hf var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        hf stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new hf(param1, param2);
          var4.field_f = (qda) ((Object) new ff());
          var6 = -85 % ((param0 + 69) / 54);
          var5 = this.field_q - 6;
          this.field_q = this.field_q + 38;
          var4.a(15, 30, (byte) 59, this.field_p - 14 - 16, var5);
          this.c(var4, 61);
          this.d(6);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("em.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    em(rp param0, lo param1) {
        super(param0, 200, 150);
        Object var3 = null;
        wj var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (dn.field_b != param1) {
            if (r.field_m == param1) {
              var3 = cn.field_k;
              this.field_q = this.field_q + 10;
              if (od.e((byte) -127)) {
                this.field_q = this.field_q + 20;
                var3 = dm.field_e;
              }
            } else {
              if (param1 == tma.field_x) {
                this.field_q = this.field_q + 30;
                var3 = jia.field_l;
              }
            }
          } else {
            var3 = qca.field_l;
          }
          var4 = new wj((String) (var3), (pl) null);
          var4.field_v = 50;
          var4.field_q = 80;
          var4.field_s = 0;
          var4.field_p = this.field_p;
          var4.field_f = (qda) ((Object) new gha(oc.field_l, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.c(var4, 70);
          this.field_U = this.a(-2, ala.field_d, (pl) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("em.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void n(int param0) {
        if (!this.field_C) {
          return;
        }
        if (param0 != 0) {
          field_T = (vr) null;
          this.field_C = false;
          return;
        }
        this.field_C = false;
    }

    final static boolean d(byte param0) {
        if (param0 > -26) {
          return true;
        }
        return null != wh.field_p ? true : false;
    }

    public final void a(int param0, hf param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_U == param1) {
            this.n(0);
          }
          if (param3 >= 50) {
            return;
          }
          field_T = (vr) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("em.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void o(int param0) {
        field_T = null;
        field_S = null;
        field_V = null;
        if (param0 == -22799) {
          return;
        }
        em.o(95);
    }

    static {
    }
}
