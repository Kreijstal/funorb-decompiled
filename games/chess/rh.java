/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    private int field_h;
    private int field_g;
    private hf[] field_f;
    private int field_b;
    static int[] field_a;
    float field_i;
    static ci field_c;
    static String[] field_e;
    String field_d;

    final static java.net.URL a(java.net.URL param0, java.applet.Applet param1, byte param2) {
        Object var4 = null;
        Object var3 = null;
        if (null != wg.field_p) {
            if (!wg.field_p.equals((Object) (Object) param1.getParameter("settings"))) {
                var3 = (Object) (Object) wg.field_p;
                var4 = var3;
                var4 = var3;
            }
        }
        var4 = null;
        if (null != qn.field_R) {
            if (!(qn.field_R.equals((Object) (Object) param1.getParameter("session")))) {
                var4 = (Object) (Object) qn.field_R;
            }
        }
        if (param2 != -87) {
            return null;
        }
        return va.a((String) var3, -148, param0, -1, (String) var4);
    }

    final boolean b(int param0) {
        hf var2 = null;
        int var3 = 0;
        hf var4 = null;
        var3 = Chess.field_G;
        L0: while (true) {
          if (((rh) this).field_b >= ((rh) this).field_h) {
            if (param0 == -1) {
              return true;
            } else {
              return true;
            }
          } else {
            var4 = ((rh) this).field_f[((rh) this).field_b];
            var2 = var4;
            if (var4.field_c.c((byte) 123)) {
              L1: {
                if ((var4.field_f ^ -1) > -1) {
                  break L1;
                } else {
                  if (var4.field_c.a(var4.field_f, (byte) -72)) {
                    break L1;
                  } else {
                    this.a(var2, var4.field_c.c(var4.field_f, -85), 118);
                    return false;
                  }
                }
              }
              L2: {
                if (var4.field_e == null) {
                  break L2;
                } else {
                  if (var4.field_c.b(var4.field_e, param0 ^ -101)) {
                    break L2;
                  } else {
                    this.a(var2, var4.field_c.c(var4.field_e, 0), param0 ^ 25);
                    return false;
                  }
                }
              }
              L3: {
                if (var4.field_f >= 0) {
                  break L3;
                } else {
                  if (null != var4.field_e) {
                    break L3;
                  } else {
                    if (var4.field_d == null) {
                      break L3;
                    } else {
                      if (!var4.field_c.b((byte) -40)) {
                        this.a(var2, var4.field_c.a((byte) -72), 119);
                        return false;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              ((rh) this).field_b = ((rh) this).field_b + 1;
              continue L0;
            } else {
              this.a(var4, 0, param0 ^ 48);
              return false;
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        nk var2 = qn.field_U;
        var2.f(param1, param0 ^ -117);
        var2.c(1, (byte) 86);
        var2.c(param0, (byte) 45);
    }

    private final void a(hf param0, int param1, int param2) {
        int var5 = -39 % ((57 - param2) / 57);
        float var4 = (float)(1 + ((rh) this).field_b) + (float)param1 / 100.0f;
        ((rh) this).field_i = (float)((rh) this).field_g * var4 / (float)(1 + ((rh) this).field_h);
        if (param1 != 0) {
            ((rh) this).field_d = param0.field_d + " - " + param1 + "%";
        } else {
            ((rh) this).field_d = param0.field_b;
        }
    }

    final static km[] a(km[] param0, int param1) {
        int var2 = 0;
        km var3 = null;
        int var4 = Chess.field_G;
        for (var2 = 0; var2 < param0.length; var2++) {
            var3 = param0[var2];
            param0[var2].field_r = 0;
            var3.field_s = 0;
            param0[var2].field_v = param0[var2].field_w;
            param0[var2].field_u = param0[var2].field_t;
        }
        if (param1 != -9568) {
            Object var5 = null;
            rh.a(-18, 113, (lh) null, -30, 5, -1, -31, -128, (le) null, 37, (le) null, (le) null, 40, 88, 107, (lh) null, -119, (byte) -45, 84, -5);
        }
        return param0;
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_e = null;
        if (param0 <= 95) {
            Object var2 = null;
            rh.a(32, 87, (lh) null, 23, -22, -34, -8, 31, (le) null, 115, (le) null, (le) null, 85, -66, 50, (lh) null, 94, (byte) 105, 6, 74);
        }
    }

    private rh() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1, lh param2, int param3, int param4, int param5, int param6, int param7, le param8, int param9, le param10, le param11, int param12, int param13, int param14, lh param15, int param16, byte param17, int param18, int param19) {
        if (param17 >= -122) {
            return;
        }
        vl.field_M = param15;
        sj.field_d = param2;
        ql.a(param13, param3, param5, param9, (byte) 66);
        r.a(param19, (byte) -87, param7, param10);
        eg.a(param4, param12, param1, param8, param11, 4);
        ed.a(param6, param18, (byte) -79);
        ca.a(param16, (byte) 107, param14, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_a = new int[]{6523921, 3419144};
    }
}
