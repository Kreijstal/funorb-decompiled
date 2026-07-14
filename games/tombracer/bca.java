/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bca {
    static nh field_d;
    private kpa field_b;
    static String field_c;
    static int[] field_a;

    public static void b(int param0) {
        if (param0 != 3) {
          field_a = null;
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final static ip a(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            bca.a((vb) null, (byte) 31);
            return (ip) (Object) new es();
        }
        return (ip) (Object) new es();
    }

    private final void a(byte param0) {
        ((bca) this).field_b = new kpa(3);
        if (param0 != -101) {
            return;
        }
        ((bca) this).field_b.a(true, 106);
    }

    final static void b(byte param0) {
        rn.field_b = 0;
        if (param0 != 55) {
            field_d = null;
        }
    }

    final void a(byte param0, kh param1) {
        ((bca) this).field_b.a(param1, (byte) -120);
        if (param0 >= -13) {
            field_d = null;
        }
    }

    final static void a(vb param0, byte param1) {
        kva.field_n.b((cg) (Object) param0.field_f);
        if (param1 != -42) {
            bca.b((byte) -90);
        }
    }

    final boolean a(int param0, int param1) {
        if (param1 != 14530) {
            return false;
        }
        if (-1 == param0) {
            return true;
        }
        return ((bca) this).field_b.a(0, param0);
    }

    public bca() {
        this.a((byte) -101);
    }

    bca(int param0, kh param1) {
        if ((param0 ^ -1) < -9) {
            ((bca) this).field_b = new kpa(3, param0, param1);
        } else {
            this.a((byte) -101);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Points from room +<%0>";
        field_a = new int[]{};
    }
}
