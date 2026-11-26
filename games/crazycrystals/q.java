/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q {
    static String field_d;
    static vh[] field_a;
    static RgbSprite[] field_b;
    static String[] field_c;

    final static void a(boolean param0) {
        if (param0) {
          field_b = (RgbSprite[]) null;
          if (ph.field_E != null) {
            fq.a(-75, ph.field_E);
            ph.field_E.exitFullscreen(te.field_a, (byte) -92);
            ph.field_E = null;
            return;
          }
          return;
        }
        if (ph.field_E == null) {
          return;
        }
        fq.a(-75, ph.field_E);
        ph.field_E.exitFullscreen(te.field_a, (byte) -92);
        ph.field_E = null;
    }

    public static void clearStaticReferences(int param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
        if (param0 != -3591) {
          q.clearStaticReferences(18);
        }
    }

    static {
        field_d = "Tile variations: ";
        field_c = new String[]{"Green Player", "Pink Player", "Blue Player"};
    }
}
