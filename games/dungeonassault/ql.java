/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends java.awt.Canvas {
    static String field_k;
    static cn field_c;
    private java.awt.Component field_i;
    static String field_l;
    static String field_a;
    static String field_h;
    static af field_f;
    static String field_g;
    static int field_d;
    static Object[] field_e;
    static int field_j;
    static int field_b;

    public final void update(java.awt.Graphics param0) {
        ((ql) this).field_i.update(param0);
    }

    public static void b(byte param0) {
        Object var2 = null;
        field_g = null;
        field_a = null;
        field_k = null;
        if (param0 != 20) {
          var2 = null;
          boolean discarded$2 = ql.a((nh) null, (nh) null, (byte) 30, (nh) null);
          field_f = null;
          field_c = null;
          field_e = null;
          field_l = null;
          field_h = null;
          return;
        } else {
          field_f = null;
          field_c = null;
          field_e = null;
          field_l = null;
          field_h = null;
          return;
        }
    }

    final static boolean a(nh param0, nh param1, byte param2, nh param3) {
        int var4 = 0;
        if (param3.a(-14354)) {
          if (param3.a(false, "commonui")) {
            var4 = 62 / ((-27 - param2) / 59);
            if (param0.a(-14354)) {
              if (param0.a(false, "commonui")) {
                if (param1.a(-14354)) {
                  if (!param1.a(false, "button.gif")) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(byte param0) {
        if (param0 != -105) {
            field_g = (String) field_e[6];
        }
    }

    ql(java.awt.Component param0) {
        ((ql) this).field_i = param0;
    }

    public final void paint(java.awt.Graphics param0) {
        ((ql) this).field_i.paint(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_h = "Mouse over an icon for details";
        field_g = "STANDARD";
        field_l = "A knight in ornate black armour, adorned with evil-looking sigils. He has a grim look about him, likely from seeing so many enemies fall before his sword.";
        field_f = new af();
        field_j = 0;
        field_d = 256;
        field_e = new Object[1];
        field_b = 0;
    }
}
