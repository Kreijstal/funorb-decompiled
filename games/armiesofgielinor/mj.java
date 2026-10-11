/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    static int field_b;
    static int field_c;
    static String field_a;

    final static void a(byte param0) {
        rj.field_F.a(18, -20500, nf.field_Kb.field_gb - (!fh.field_c ? 0 : 40 + (jn.field_c + 4)), 0, 0);
        cm.field_a.a(18, -20500, jn.field_c + 42, 0, -2 + (nf.field_Kb.field_gb - jn.field_c - 40));
        MapTile.field_f.a(0, false, nf.field_Kb.field_gb, 2, jn.field_c, 20, nf.field_Kb.field_ob - 20);
        if (param0 >= 29) {
          return;
        }
        field_b = -104;
    }

    final static void b(byte param0) {
        if (l.field_a != null) {
          l.field_a.f();
          if (TextCursor.field_e != null) {
            TextCursor.field_e.f();
          }
          if (param0 > -79) {
            mj.b((byte) 93);
            return;
          }
          return;
        }
        if (TextCursor.field_e != null) {
          TextCursor.field_e.f();
        }
        if (param0 <= -79) {
          return;
        }
        mj.b((byte) 93);
    }

    public static void c(byte param0) {
        if (param0 >= -23) {
          mj.b((byte) 115);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_b = 480;
        field_c = 20;
        field_a = "This option cannot be combined with the current settings for:  ";
    }
}
