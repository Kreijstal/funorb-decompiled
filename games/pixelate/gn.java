/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gn extends lm {
    volatile boolean field_v;
    static nc field_y;
    boolean field_t;
    static int[] field_z;
    static String[] field_w;
    static int[] field_A;
    boolean field_x;
    static wm field_u;

    final static void a(byte param0) {
        ui.field_f = new tf(7, 25);
        ui.field_f.c();
        t.d(0, 0, 28, 25, 7, 16711935);
        t.e(0, 0, 28, 25, 7, 65793);
        qa.field_f.a(19692);
        ec.field_q = new tf(7, 25);
        ec.field_q.c();
        t.e(1, 3, 28, 21, 6, 16777215);
        t.e(1, 2, 28, 21, 6, 16777215);
        if (param0 <= 91) {
          gn.a((byte) 36);
          t.e(0, 2, 28, 21, 6, 65793);
          qa.field_f.a(19692);
          di.field_c = new tf(8, 25);
          di.field_c.c();
          t.e(t.field_j + -28, 3, 28, 21, 6, 16777215);
          t.e(-28 + t.field_j, 2, 28, 21, 6, 16777215);
          t.e(-28 + (t.field_j - 1), 2, 28, 21, 6, 65793);
          qa.field_f.a(19692);
          return;
        } else {
          t.e(0, 2, 28, 21, 6, 65793);
          qa.field_f.a(19692);
          di.field_c = new tf(8, 25);
          di.field_c.c();
          t.e(t.field_j + -28, 3, 28, 21, 6, 16777215);
          t.e(-28 + t.field_j, 2, 28, 21, 6, 16777215);
          t.e(-28 + (t.field_j - 1), 2, 28, 21, 6, 65793);
          qa.field_f.a(19692);
          return;
        }
    }

    public static void b(byte param0) {
        field_A = null;
        field_z = null;
        field_w = null;
        field_y = null;
        field_u = null;
    }

    abstract byte[] h(int param0);

    abstract int g(int param0);

    gn() {
        ((gn) this).field_v = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new int[128];
        field_w = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_u = new wm(9, 0, 4, 1);
    }
}
