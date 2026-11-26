/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static String field_b;
    static IntrusiveDeque field_d;
    static String field_a;
    static IntrusiveDeque field_c;

    final static void a(boolean param0) {
        pe var1 = null;
        pe var1Lifetime1;
        if (!param0) {
          var1 = (pe) (IntrusiveDeque.field_e.removeLast(-126));
          if (var1 == null) {
            var1 = new pe();
          }
          var1.a(SoftwareRasterizer.field_l, SoftwareRasterizer.field_i, SoftwareRasterizer.field_d, -26690, SoftwareRasterizer.field_g, SoftwareRasterizer.field_j, SoftwareRasterizer.field_c, SoftwareRasterizer.field_b);
          ok.field_a.addLast(0, var1);
          return;
        }
        field_b = (String) null;
        var1Lifetime1 = (pe) (IntrusiveDeque.field_e.removeLast(-126));
        if (var1Lifetime1 == null) {
          var1Lifetime1 = new pe();
        }
        var1Lifetime1.a(SoftwareRasterizer.field_l, SoftwareRasterizer.field_i, SoftwareRasterizer.field_d, -26690, SoftwareRasterizer.field_g, SoftwareRasterizer.field_j, SoftwareRasterizer.field_c, SoftwareRasterizer.field_b);
        ok.field_a.addLast(0, var1Lifetime1);
    }

    public static void clearStaticReferences(int param0) {
        if (param0 == -1246) {
          field_d = null;
          field_c = null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = (String) null;
        field_d = null;
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        field_a = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_d = new IntrusiveDeque();
        field_c = new IntrusiveDeque();
    }
}
