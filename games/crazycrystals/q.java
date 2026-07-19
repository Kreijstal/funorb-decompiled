/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static String field_d;
    static vh[] field_a;
    static dl[] field_b;
    static String[] field_c;

    final static void a(boolean param0) {
        if (!param0) {
          if (ph.field_E != null) {
            fq.a(-75, ph.field_E);
            ph.field_E.a(te.field_a, (byte) -92);
            ph.field_E = null;
            return;
          } else {
            return;
          }
        } else {
          field_b = (dl[]) null;
          if (ph.field_E == null) {
            return;
          } else {
            fq.a(-75, ph.field_E);
            ph.field_E.a(te.field_a, (byte) -92);
            ph.field_E = null;
            return;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 != -3591) {
            q.a(18);
        }
    }

    static {
        field_d = "Tile variations: ";
        field_c = new String[]{"Green Player", "Pink Player", "Blue Player"};
    }
}
