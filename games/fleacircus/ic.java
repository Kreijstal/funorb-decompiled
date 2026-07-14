/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends jj implements da {
    static java.awt.Font field_bb;
    static sf field_ab;
    static char[] field_db;
    private bb field_cb;

    private final bb a(int param0, String param1, kd param2) {
        bb var4 = null;
        int var5 = 0;
        Object var6 = null;
        var4 = new bb(param1, param2);
        var4.field_p = (ch) (Object) new ri();
        var5 = -6 + ((ic) this).field_j;
        ((ic) this).field_j = ((ic) this).field_j + 38;
        if (param0 != -28732) {
          var6 = null;
          ((ic) this).a(-90, -88, -85, 85, (bb) null);
          var4.a(15, -16 + (((ic) this).field_u + -14), var5, 30, 80);
          ((ic) this).a((qa) (Object) var4, (byte) -43);
          ((ic) this).b(false);
          return var4;
        } else {
          var4.a(15, -16 + (((ic) this).field_u + -14), var5, 30, 80);
          ((ic) this).a((qa) (Object) var4, (byte) -43);
          ((ic) this).b(false);
          return var4;
        }
    }

    private final void p(int param0) {
        if (param0 != 108) {
            return;
        }
        if (!(((ic) this).field_G)) {
            return;
        }
        ((ic) this).field_G = false;
    }

    final static void n(int param0) {
        if (param0 < -118) {
          nb.field_a.i(-72);
          if (em.field_g == null) {
            em.field_g = new nd(nb.field_a, rh.field_e);
            nb.field_a.b((qa) (Object) em.field_g, (byte) -35);
            return;
          } else {
            nb.field_a.b((qa) (Object) em.field_g, (byte) -35);
            return;
          }
        } else {
          return;
        }
    }

    public final void a(int param0, int param1, int param2, int param3, bb param4) {
        if (!(param4 != ((ic) this).field_cb)) {
            this.p(108);
        }
        if (param3 != 248) {
            ic.n(48);
            return;
        }
    }

    ic(f param0, fc param1) {
        super(param0, 200, 150);
        String var3 = null;
        String var5 = null;
        qa var6 = null;
        Object var7 = null;
        qa var8 = null;
        String var9 = null;
        qa var10 = null;
        qa var11 = null;
        var7 = null;
        if (param1 != tg.field_h) {
          if (param1 == fb.field_g) {
            L0: {
              ((ic) this).field_j = ((ic) this).field_j + 10;
              var3 = oc.field_c;
              if (!al.a(-83)) {
                break L0;
              } else {
                ((ic) this).field_j = ((ic) this).field_j + 20;
                var3 = ec.field_e;
                break L0;
              }
            }
            var11 = new qa(var3, (kd) null);
            var11.field_u = ((ic) this).field_u;
            var11.field_j = 80;
            var11.field_z = 50;
            var11.field_y = 0;
            var11.field_p = (ch) (Object) new e(nb.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((ic) this).a(var11, (byte) -102);
            ((ic) this).field_cb = this.a(-28732, ja.field_O, (kd) this);
          } else {
            if (param1 == ge.field_c) {
              ((ic) this).field_j = ((ic) this).field_j + 30;
              var9 = tg.field_a;
              var3 = var9;
              var3 = var9;
              var10 = new qa(var9, (kd) null);
              var10.field_u = ((ic) this).field_u;
              var10.field_j = 80;
              var10.field_z = 50;
              var10.field_y = 0;
              var10.field_p = (ch) (Object) new e(nb.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ic) this).a(var10, (byte) -102);
              ((ic) this).field_cb = this.a(-28732, ja.field_O, (kd) this);
            } else {
              var8 = new qa((String) var7, (kd) null);
              var8.field_u = ((ic) this).field_u;
              var8.field_j = 80;
              var8.field_z = 50;
              var8.field_y = 0;
              var8.field_p = (ch) (Object) new e(nb.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ic) this).a(var8, (byte) -102);
              ((ic) this).field_cb = this.a(-28732, ja.field_O, (kd) this);
            }
          }
        } else {
          var5 = sa.field_b;
          var6 = new qa(var5, (kd) null);
          var6.field_u = ((ic) this).field_u;
          var6.field_j = 80;
          var6.field_z = 50;
          var6.field_y = 0;
          var6.field_p = (ch) (Object) new e(nb.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((ic) this).a(var6, (byte) -102);
          ((ic) this).field_cb = this.a(-28732, ja.field_O, (kd) this);
        }
    }

    public static void o(int param0) {
        field_db = null;
        field_ab = null;
        if (param0 > -79) {
            field_bb = null;
            field_bb = null;
            return;
        }
        field_bb = null;
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        L0: {
          var4 = 0;
          if (param3) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param1) {
          if (!param2) {
            if (param0 < 0) {
              return null;
            } else {
              return gi.field_a[var4];
            }
          } else {
            var4++;
            if (param0 < 0) {
              return null;
            } else {
              return gi.field_a[var4];
            }
          }
        } else {
          var4 += 2;
          if (param2) {
            var4++;
            if (param0 < 0) {
              return null;
            } else {
              return gi.field_a[var4];
            }
          } else {
            if (param0 < 0) {
              return null;
            } else {
              return gi.field_a[var4];
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
