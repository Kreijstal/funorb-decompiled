/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bf extends ma implements ee {
    static dk field_M;
    private ri field_L;
    static ci field_K;
    static String field_N;

    abstract int i(int param0);

    abstract int c(boolean param0);

    final static void g(byte param0) {
        if (param0 < 38) {
          field_N = null;
          o.field_a[520] = 59;
          o.field_a[222] = 58;
          o.field_a[192] = 28;
          o.field_a[91] = 42;
          o.field_a[45] = 26;
          o.field_a[47] = 73;
          o.field_a[59] = 57;
          o.field_a[93] = 43;
          o.field_a[44] = 71;
          o.field_a[61] = 27;
          o.field_a[92] = 74;
          o.field_a[46] = 72;
          return;
        } else {
          o.field_a[520] = 59;
          o.field_a[222] = 58;
          o.field_a[192] = 28;
          o.field_a[91] = 42;
          o.field_a[45] = 26;
          o.field_a[47] = 73;
          o.field_a[59] = 57;
          o.field_a[93] = 43;
          o.field_a[44] = 71;
          o.field_a[61] = 27;
          o.field_a[92] = 74;
          o.field_a[46] = 72;
          return;
        }
    }

    abstract boolean h(byte param0);

    bf(int param0, int param1, int param2, int param3, jm param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static void a(boolean param0, int param1) {
        ji.field_U = 1000000000L / (long)param1;
        if (!param0) {
            bf.d(true);
        }
    }

    public static void d(boolean param0) {
        field_M = null;
        if (param0) {
            return;
        }
        field_N = null;
        field_K = null;
    }

    public final vb a(int param0) {
        if (param0 > -80) {
            field_K = null;
            return (vb) (Object) ((bf) this).field_L;
        }
        return (vb) (Object) ((bf) this).field_L;
    }

    void a(boolean param0, ri param1) {
        ((bf) this).field_L = param1;
        ((bf) this).field_L.field_j = (bf) this;
        if (param0) {
            bf.d(true);
        }
    }

    abstract int h(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Create a free account to start using this feature";
    }
}
