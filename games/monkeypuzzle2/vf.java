/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static int field_b;
    static int field_a;

    final static void a(boolean param0) {
        if (param0) {
          return;
        }
        qh.a(17, true);
    }

    final static void a(byte param0) {
        jf var1 = (jf) (de.field_n.removeFirst((byte) -66));
        if (var1 == null) {
          var1 = new jf();
        }
        var1.a(SoftwareRasterizer.field_h, SoftwareRasterizer.field_k, 117, SoftwareRasterizer.field_g, SoftwareRasterizer.field_f, SoftwareRasterizer.field_j, SoftwareRasterizer.field_a, SoftwareRasterizer.field_i);
        oa.field_J.addFirst(-8212, var1);
        if (param0 >= 31) {
          return;
        }
        field_b = 124;
    }

    static {
        field_a = 0;
    }
}
