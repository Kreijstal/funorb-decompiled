/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends ig {
    static int field_J;
    private int field_I;
    static String field_G;
    static String field_F;
    private w field_H;

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        cg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        pb var12 = null;
        pb var15 = null;
        pb var18 = null;
        pb var21 = null;
        var11 = stellarshard.field_B;
        super.a(param0, param1, param2, param3);
        if (param0 != 0) {
          return;
        } else {
          var5 = param3 + this.field_w - -(this.field_p >> -582109727);
          var6 = (this.field_t >> -580680703) + (param2 + this.field_k);
          var8 = this.field_H.b(-28036);
          if (eh.field_c != var8) {
            if (var8 != vk.field_d) {
              if (var8 != qj.field_c) {
                if (var8 != lg.field_c) {
                  return;
                } else {
                  var21 = ah.field_p[1];
                  var21.d(var5 + -(var21.field_v >> -1732960991), -(var21.field_y >> -1465538719) + var6, 256);
                  return;
                }
              } else {
                var12 = ah.field_p[2];
                var12.d(-(var12.field_v >> 1873264993) + var5, -(var12.field_y >> -1904031391) + var6, 256);
                return;
              }
            } else {
              var18 = ah.field_p[0];
              var9 = var18.field_w << -1894610527;
              var10 = var18.field_x << -2083529759;
              if (ta.field_s != null) {
                if (var9 <= ta.field_s.field_v) {
                  if (ta.field_s.field_y < var10) {
                    ta.field_s = new pb(var9, var10);
                    hj.a(ta.field_s, 1);
                    var18.b(112, 144, var18.field_w << -400421052, var18.field_x << -31381852, -this.field_I << 520655658, 4096);
                    id.b((byte) -58);
                    ta.field_s.d(-var18.field_w + var5, -var18.field_x + var6, 256);
                    return;
                  } else {
                    hj.a(ta.field_s, 1);
                    ti.d();
                    var18.b(112, 144, var18.field_w << -400421052, var18.field_x << -31381852, -this.field_I << 520655658, 4096);
                    id.b((byte) -58);
                    ta.field_s.d(-var18.field_w + var5, -var18.field_x + var6, 256);
                    return;
                  }
                } else {
                  ta.field_s = new pb(var9, var10);
                  hj.a(ta.field_s, 1);
                  var18.b(112, 144, var18.field_w << -400421052, var18.field_x << -31381852, -this.field_I << 520655658, 4096);
                  id.b((byte) -58);
                  ta.field_s.d(-var18.field_w + var5, -var18.field_x + var6, 256);
                  return;
                }
              } else {
                ta.field_s = new pb(var9, var10);
                hj.a(ta.field_s, 1);
                var18.b(112, 144, var18.field_w << -400421052, var18.field_x << -31381852, -this.field_I << 520655658, 4096);
                id.b((byte) -58);
                ta.field_s.d(-var18.field_w + var5, -var18.field_x + var6, 256);
                return;
              }
            }
          } else {
            var15 = ah.field_p[0];
            var9 = var15.field_w << -1894610527;
            var10 = var15.field_x << -2083529759;
            if (ta.field_s != null) {
              if (var9 <= ta.field_s.field_v) {
                if (ta.field_s.field_y < var10) {
                  ta.field_s = new pb(var9, var10);
                  hj.a(ta.field_s, 1);
                  var15.b(112, 144, var15.field_w << -400421052, var15.field_x << -31381852, -this.field_I << 520655658, 4096);
                  id.b((byte) -58);
                  ta.field_s.d(-var15.field_w + var5, -var15.field_x + var6, 256);
                  return;
                } else {
                  hj.a(ta.field_s, 1);
                  ti.d();
                  var15.b(112, 144, var15.field_w << -400421052, var15.field_x << -31381852, -this.field_I << 520655658, 4096);
                  id.b((byte) -58);
                  ta.field_s.d(-var15.field_w + var5, -var15.field_x + var6, 256);
                  return;
                }
              } else {
                ta.field_s = new pb(var9, var10);
                hj.a(ta.field_s, 1);
                var15.b(112, 144, var15.field_w << -400421052, var15.field_x << -31381852, -this.field_I << 520655658, 4096);
                id.b((byte) -58);
                ta.field_s.d(-var15.field_w + var5, -var15.field_x + var6, 256);
                return;
              }
            } else {
              ta.field_s = new pb(var9, var10);
              hj.a(ta.field_s, 1);
              var15.b(112, 144, var15.field_w << -400421052, var15.field_x << -31381852, -this.field_I << 520655658, 4096);
              id.b((byte) -58);
              ta.field_s.d(-var15.field_w + var5, -var15.field_x + var6, 256);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_F = null;
        if (param0 != 25) {
            field_G = (String) null;
            field_G = null;
            return;
        }
        field_G = null;
    }

    final static void a(u param0, int param1, byte param2) {
        ha var3 = null;
        try {
            if (param2 <= 11) {
                field_F = (String) null;
            }
            var3 = pg.field_fb;
            var3.f(param1, 950);
            var3.a(false, param0.field_q);
            var3.c(param0.field_n, -115);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ii.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void g(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1_ref = sf.field_c;
        synchronized (var1_ref) {
          L0: {
            fb.field_n = ib.field_g;
            if (param0 == 256) {
              ac.field_e = ac.field_e + 1;
              ni.field_e = pg.field_gb;
              eb.field_a = ak.field_e;
              qc.field_a = hi.field_a;
              hi.field_a = false;
              gh.field_c = tg.field_b;
              di.field_b = oc.field_b;
              oc.field_e = wl.field_R;
              tg.field_b = 0;
              break L0;
            } else {
              return;
            }
          }
        }
    }

    final boolean a(int param0, rj param1) {
        RuntimeException var3 = null;
        rj var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -2147483648) {
                break L1;
              } else {
                var4 = (rj) null;
                this.a(43, false, 76, (rj) null);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ii.J(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, boolean param1, int param2, rj param3) {
        try {
            this.field_I = this.field_I + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ii.N(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String d(int param0) {
        if (param0 != 3690) {
            return (String) null;
        }
        if (!this.field_q) {
            return null;
        }
        return this.field_H.c(-22773);
    }

    ii(w param0) {
        try {
            this.field_H = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ii.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_G = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_F = null;
    }
}
