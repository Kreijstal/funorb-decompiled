/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bia extends tb {
    static int field_d;
    static int field_c;

    bia() {
    }

    final static boolean a(boolean param0, byte param1, int param2) {
        if (param1 != -31) {
          boolean discarded$2 = bia.a(true, (byte) 77, 66);
          return fwa.field_g.a(param2, 11, param0);
        } else {
          return fwa.field_g.a(param2, 11, param0);
        }
    }

    final static void a(byte param0) {
        ajb var1_ref = null;
        Object var1 = null;
        if (param0 != 124) {
            bia.a((byte) -88);
            var1_ref = (ajb) (Object) bc.field_b.c((byte) -126);
            if (!(var1_ref != null)) {
                throw new IllegalStateException();
            }
            dma.a(var1_ref.field_k, var1_ref.field_d, var1_ref.field_i);
            dma.b(var1_ref.field_j, var1_ref.field_g, var1_ref.field_h, var1_ref.field_e);
            var1_ref.field_k = null;
            ce.field_p.b(-10258, (ksa) (Object) var1_ref);
            return;
        }
        var1_ref = (ajb) (Object) bc.field_b.c((byte) -126);
        if (!(var1_ref != null)) {
            throw new IllegalStateException();
        }
        dma.a(var1_ref.field_k, var1_ref.field_d, var1_ref.field_i);
        dma.b(var1_ref.field_j, var1_ref.field_g, var1_ref.field_h, var1_ref.field_e);
        var1_ref.field_k = null;
        ce.field_p.b(-10258, (ksa) (Object) var1_ref);
    }

    final static qkb a(boolean param0) {
        if (!param0) {
            return null;
        }
        return kpb.field_q;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 65000;
    }
}
