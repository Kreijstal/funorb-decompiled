/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends di {
    static String field_m;
    private boolean field_n;
    static String field_r;
    static volatile boolean field_q;
    static cb field_p;
    private ni field_t;
    static int field_s;
    private String field_u;
    static int field_o;

    hd(lb param0, lb param1) {
        super(param0);
        ((hd) this).field_n = false;
        ((hd) this).field_u = "";
        ((hd) this).field_t = new ni(param0, param1);
    }

    final static boolean a(int param0, char param1) {
        if (param0 < -112) {
          if (param1 >= 48) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_q = true;
          if (param1 >= 48) {
            if (param1 > 57) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final String a(String param0, int param1) {
        if (((hd) this).field_t.a(-116, param0) != ef.field_b) {
          if (((hd) this).a(-108, param0) != ef.field_b) {
            if (param1 != 426) {
              ((hd) this).field_u = null;
              return hf.field_a;
            } else {
              return hf.field_a;
            }
          } else {
            return wd.field_H;
          }
        } else {
          return ((hd) this).field_t.a(param0, 426);
        }
    }

    public static void d(byte param0) {
        if (param0 != 69) {
          hd.d((byte) -97);
          field_r = null;
          field_m = null;
          field_p = null;
          return;
        } else {
          field_r = null;
          field_m = null;
          field_p = null;
          return;
        }
    }

    final ud a(int param0, String param1) {
        j var3 = null;
        if (param0 >= -106) {
            return null;
        }
        if (!(((hd) this).field_t.a(-112, param1) != ef.field_b)) {
            return ef.field_b;
        }
        if (!(param1.equals((Object) (Object) ((hd) this).field_u))) {
            var3 = ca.a(param1, 647);
            if (!(var3.b((byte) 79))) {
                return tk.field_t;
            }
            ((hd) this).field_u = param1;
            ((hd) this).field_n = var3.c((byte) -100);
        }
        return !((hd) this).field_n ? ef.field_b : TrackController.field_G;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = false;
        field_r = "Sound: ";
        field_m = "Continue";
        field_p = new cb();
    }
}
