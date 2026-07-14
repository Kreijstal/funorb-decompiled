/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends pj {
    int field_v;
    private fr field_u;
    private long field_t;
    static int field_x;
    static String field_r;
    static int field_s;
    static String[] field_w;

    public static void a(int param0) {
        field_r = null;
        if (param0 != -1) {
            return;
        }
        field_w = null;
    }

    private final void f(int param0) {
        L0: {
          if (((wh) this).field_t > 0L) {
            ((wh) this).field_u.field_y.releasePbuffer(((wh) this).field_t);
            ((wh) this).field_t = 0L;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 30611) {
          ((wh) this).field_u = null;
          return;
        } else {
          return;
        }
    }

    final static String a(byte param0) {
        String var1 = null;
        L0: {
          var1 = "";
          if (no.field_a == null) {
            break L0;
          } else {
            var1 = no.field_a.a((byte) 48);
            break L0;
          }
        }
        if (param0 > -53) {
          L1: {
            field_w = null;
            if (0 != var1.length()) {
              break L1;
            } else {
              var1 = kf.f(1);
              break L1;
            }
          }
          L2: {
            if (var1.length() == 0) {
              var1 = kq.field_R;
              break L2;
            } else {
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (0 != var1.length()) {
              break L3;
            } else {
              var1 = kf.f(1);
              break L3;
            }
          }
          L4: {
            if (var1.length() == 0) {
              var1 = kq.field_R;
              break L4;
            } else {
              break L4;
            }
          }
          return var1;
        }
    }

    protected final void finalize() throws Throwable {
        this.f(30611);
        super.finalize();
    }

    final long e(int param0) {
        if (param0 >= -68) {
            return -90L;
        }
        return ((wh) this).field_t;
    }

    wh(fr param0, int param1, int param2) {
        ((wh) this).field_u = param0;
        ((wh) this).field_v = param1 * param2;
        ((wh) this).field_t = ((wh) this).field_u.field_y.createPbuffer(param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "click to assign points <br> right-click to remove points";
        field_x = 64;
        field_w = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
