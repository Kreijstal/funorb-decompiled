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
        if (!((jg) this).field_h) {
          if (param0 == 12606) {
            return null;
          } else {
            ((jg) this).field_D = null;
            return null;
          }
        } else {
          return ((jg) this).field_D.a(26162);
        }
    }

    final void a(int param0, int param1, uj param2, int param3) {
        Object var6 = null;
        if (param0 < 27) {
          var6 = null;
          boolean discarded$2 = ((jg) this).a(64, (uj) null);
          ((jg) this).field_G = ((jg) this).field_G + 1;
          super.a(40, param1, param2, param3);
          return;
        } else {
          ((jg) this).field_G = ((jg) this).field_G + 1;
          super.a(40, param1, param2, param3);
          return;
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
          var5 = (((jg) this).field_i >> -841063231) + ((jg) this).field_s + param1;
          var6 = ((jg) this).field_j + (param3 - -(((jg) this).field_f >> -1417809439));
          var8 = ((jg) this).field_D.b((byte) -126);
          if (cg.field_g == var8) {
            var16 = fi.field_g[0];
            var9 = var16.field_x << 1134355233;
            var10 = var16.field_q << 1975153889;
            if (fe.field_H != null) {
              if (fe.field_H.field_u >= var9) {
                if (fe.field_H.field_v >= var10) {
                  bc.a(fe.field_H, 26095);
                  ki.b();
                  var16.b(112, 144, var16.field_x << 756156420, var16.field_q << -1230263708, -((jg) this).field_G << -1204572918, 4096);
                  wf.a(-120);
                  fe.field_H.f(var5 + -var16.field_x, -var16.field_q + var6, 256);
                  return;
                } else {
                  fe.field_H = new hl(var9, var10);
                  bc.a(fe.field_H, 26095);
                  var16.b(112, 144, var16.field_x << 756156420, var16.field_q << -1230263708, -((jg) this).field_G << -1204572918, 4096);
                  wf.a(-120);
                  fe.field_H.f(var5 + -var16.field_x, -var16.field_q + var6, 256);
                  return;
                }
              } else {
                fe.field_H = new hl(var9, var10);
                bc.a(fe.field_H, 26095);
                var16.b(112, 144, var16.field_x << 756156420, var16.field_q << -1230263708, -((jg) this).field_G << -1204572918, 4096);
                wf.a(-120);
                fe.field_H.f(var5 + -var16.field_x, -var16.field_q + var6, 256);
                return;
              }
            } else {
              fe.field_H = new hl(var9, var10);
              bc.a(fe.field_H, 26095);
              var16.b(112, 144, var16.field_x << 756156420, var16.field_q << -1230263708, -((jg) this).field_G << -1204572918, 4096);
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
                    var15.b(112, 144, var15.field_x << 756156420, var15.field_q << -1230263708, -((jg) this).field_G << -1204572918, 4096);
                    wf.a(-120);
                    fe.field_H.f(var5 + -var15.field_x, -var15.field_q + var6, 256);
                    return;
                  } else {
                    fe.field_H = new hl(var9, var10);
                    bc.a(fe.field_H, 26095);
                    var15.b(112, 144, var15.field_x << 756156420, var15.field_q << -1230263708, -((jg) this).field_G << -1204572918, 4096);
                    wf.a(-120);
                    fe.field_H.f(var5 + -var15.field_x, -var15.field_q + var6, 256);
                    return;
                  }
                } else {
                  fe.field_H = new hl(var9, var10);
                  bc.a(fe.field_H, 26095);
                  var15.b(112, 144, var15.field_x << 756156420, var15.field_q << -1230263708, -((jg) this).field_G << -1204572918, 4096);
                  wf.a(-120);
                  fe.field_H.f(var5 + -var15.field_x, -var15.field_q + var6, 256);
                  return;
                }
              } else {
                fe.field_H = new hl(var9, var10);
                bc.a(fe.field_H, 26095);
                var15.b(112, 144, var15.field_x << 756156420, var15.field_q << -1230263708, -((jg) this).field_G << -1204572918, 4096);
                wf.a(-120);
                fe.field_H.f(var5 + -var15.field_x, -var15.field_q + var6, 256);
                return;
              }
            }
          }
        }
    }

    final boolean a(int param0, uj param1) {
        if (param0 != 0) {
            field_A = -109;
            return false;
        }
        return false;
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
            field_F = null;
        }
    }

    jg(he param0) {
        ((jg) this).field_D = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new hl[10];
        field_I = "Revenge fleet destroyed<br><br>CONGRATULATIONS<br><br>Final score: ";
    }
}
