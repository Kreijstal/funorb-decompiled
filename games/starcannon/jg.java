/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends dk {
    private int field_G;
    static int field_A;
    static String field_I;
    static int field_H;
    static ue field_F;
    private he field_D;
    static hl[] field_C;

    final String d(int param0) {
        if (!this.field_h) {
          if (param0 == 12606) {
            return null;
          } else {
            this.field_D = (he) null;
            return null;
          }
        } else {
          return this.field_D.a(26162);
        }
    }

    final void a(int param0, int param1, uj param2, int param3) {
        boolean discarded$0 = false;
        try {
            if (param0 < 27) {
                uj var6 = (uj) null;
                discarded$0 = this.a(64, (uj) null);
            }
            this.field_G = this.field_G + 1;
            super.a(40, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "jg.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        p var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hl var13 = null;
        hl var14 = null;
        hl var15 = null;
        hl var16 = null;
        var11 = StarCannon.field_A;
        super.a(param0, param1, param2, param3);
        if (-1 != (param0 ^ -1)) {
          return;
        } else {
          var5 = (this.field_i >> -841063231) + this.field_s + param1;
          var6 = this.field_j + (param3 - -(this.field_f >> -1417809439));
          var8 = this.field_D.b((byte) -126);
          if (cg.field_g == var8) {
            var16 = fi.field_g[0];
            var9 = var16.field_x << 1134355233;
            var10 = var16.field_q << 1975153889;
            if (fe.field_H != null) {
              if (fe.field_H.field_u >= var9) {
                if (fe.field_H.field_v >= var10) {
                  bc.a(fe.field_H, 26095);
                  ki.b();
                  var16.b(112, 144, var16.field_x << 756156420, var16.field_q << -1230263708, -this.field_G << -1204572918, 4096);
                  wf.a(-120);
                  fe.field_H.f(var5 + -var16.field_x, -var16.field_q + var6, 256);
                  return;
                } else {
                  fe.field_H = new hl(var9, var10);
                  bc.a(fe.field_H, 26095);
                  var16.b(112, 144, var16.field_x << 756156420, var16.field_q << -1230263708, -this.field_G << -1204572918, 4096);
                  wf.a(-120);
                  fe.field_H.f(var5 + -var16.field_x, -var16.field_q + var6, 256);
                  return;
                }
              } else {
                fe.field_H = new hl(var9, var10);
                bc.a(fe.field_H, 26095);
                var16.b(112, 144, var16.field_x << 756156420, var16.field_q << -1230263708, -this.field_G << -1204572918, 4096);
                wf.a(-120);
                fe.field_H.f(var5 + -var16.field_x, -var16.field_q + var6, 256);
                return;
              }
            } else {
              fe.field_H = new hl(var9, var10);
              bc.a(fe.field_H, 26095);
              var16.b(112, 144, var16.field_x << 756156420, var16.field_q << -1230263708, -this.field_G << -1204572918, 4096);
              wf.a(-120);
              fe.field_H.f(var5 + -var16.field_x, -var16.field_q + var6, 256);
              return;
            }
          } else {
            if (var8 != cd.field_a) {
              if (var8 != sb.field_n) {
                if (var8 != bf.field_x) {
                  return;
                } else {
                  var13 = fi.field_g[1];
                  var13.f(-(var13.field_u >> 934716193) + var5, -(var13.field_v >> 615701729) + var6, 256);
                  return;
                }
              } else {
                var14 = fi.field_g[2];
                var14.f(var5 + -(var14.field_u >> 1362261473), var6 - (var14.field_v >> 917476577), 256);
                return;
              }
            } else {
              var15 = fi.field_g[0];
              var9 = var15.field_x << 1134355233;
              var10 = var15.field_q << 1975153889;
              if (fe.field_H != null) {
                if (fe.field_H.field_u >= var9) {
                  if (fe.field_H.field_v >= var10) {
                    bc.a(fe.field_H, 26095);
                    ki.b();
                    var15.b(112, 144, var15.field_x << 756156420, var15.field_q << -1230263708, -this.field_G << -1204572918, 4096);
                    wf.a(-120);
                    fe.field_H.f(var5 + -var15.field_x, -var15.field_q + var6, 256);
                    return;
                  } else {
                    fe.field_H = new hl(var9, var10);
                    bc.a(fe.field_H, 26095);
                    var15.b(112, 144, var15.field_x << 756156420, var15.field_q << -1230263708, -this.field_G << -1204572918, 4096);
                    wf.a(-120);
                    fe.field_H.f(var5 + -var15.field_x, -var15.field_q + var6, 256);
                    return;
                  }
                } else {
                  fe.field_H = new hl(var9, var10);
                  bc.a(fe.field_H, 26095);
                  var15.b(112, 144, var15.field_x << 756156420, var15.field_q << -1230263708, -this.field_G << -1204572918, 4096);
                  wf.a(-120);
                  fe.field_H.f(var5 + -var15.field_x, -var15.field_q + var6, 256);
                  return;
                }
              } else {
                fe.field_H = new hl(var9, var10);
                bc.a(fe.field_H, 26095);
                var15.b(112, 144, var15.field_x << 756156420, var15.field_q << -1230263708, -this.field_G << -1204572918, 4096);
                wf.a(-120);
                fe.field_H.f(var5 + -var15.field_x, -var15.field_q + var6, 256);
                return;
              }
            }
          }
        }
    }

    final boolean a(int param0, uj param1) {
        RuntimeException var3 = null;
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
            if (param0 == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_A = -109;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("jg.PA(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void e(int param0) {
        field_I = null;
        field_C = null;
        if (param0 != 934716193) {
            jg.e((byte) -6);
            field_F = null;
            return;
        }
        field_F = null;
    }

    final static void e(byte param0) {
        if (param0 < 99) {
            field_F = (ue) null;
        }
    }

    jg(he param0) {
        try {
            this.field_D = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_C = new hl[10];
        field_I = "Revenge fleet destroyed<br><br>CONGRATULATIONS<br><br>Final score: ";
    }
}
