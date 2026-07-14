/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl {
    static phb field_c;
    static String field_e;
    uwa[] field_b;
    static String field_a;
    int field_d;

    final static void a(java.awt.Canvas param0, int param1) {
        int var2 = 0;
        rib.a((java.awt.Component) (Object) param0, (byte) 121);
        uab.a((byte) 1, (java.awt.Component) (Object) param0);
        var2 = 105 / ((41 - param1) / 39);
        if (kkb.field_o != null) {
          kkb.field_o.a((java.awt.Component) (Object) param0, -21835);
          return;
        } else {
          return;
        }
    }

    final void c(int param0) {
        if (param0 < 26) {
            ((kl) this).field_b = null;
            ((kl) this).field_d = 0;
            return;
        }
        ((kl) this).field_d = 0;
    }

    final uwa a(int param0) {
        if (param0 == 0) {
          if (((kl) this).field_d < ((kl) this).field_b.length) {
            if (null == ((kl) this).field_b[((kl) this).field_d]) {
              ((kl) this).field_b[((kl) this).field_d] = new uwa();
              ((kl) this).field_d = ((kl) this).field_d + 1;
              return ((kl) this).field_b[((kl) this).field_d];
            } else {
              ((kl) this).field_d = ((kl) this).field_d + 1;
              return ((kl) this).field_b[((kl) this).field_d];
            }
          } else {
            nkb.a(false, "We've run out of shieldinfo slots");
            return null;
          }
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        Object var2 = null;
        if (param0 >= -102) {
          var2 = null;
          kl.a((java.awt.Canvas) null, 125);
          field_a = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_a = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        ch.field_o = true;
        var2 = "tuhstatbut";
        var3 = "rvnadlm";
        var4 = -1L;
        qs.a(param0, -125, var3, var2, var4);
        if (param1 != 0) {
          field_a = null;
          return;
        } else {
          return;
        }
    }

    public kl() {
        ((kl) this).field_b = new uwa[128];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Arm self destruct";
        field_a = "Bomblet spray";
    }
}
