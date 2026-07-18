/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qca extends llb {
    static int field_wb;
    static int field_yb;
    private llb field_xb;
    private llb field_vb;

    private qca(long param0, llb param1, llb param2, String param3) {
        super(param0, (llb) null);
        try {
            ((qca) this).field_vb = new llb(0L, param1);
            ((qca) this).field_xb = new llb(0L, param2);
            ((qca) this).field_xb.field_R = param3;
            ((qca) this).b(-561, ((qca) this).field_vb);
            ((qca) this).b(-561, ((qca) this).field_xb);
            ((qca) this).g(123);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "qca.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        vbb.e(3);
        dma.g(param2, param4, param0, param1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        if (param5) {
            return;
        }
        ((qca) this).a(param0, 121, param4, param3, param1);
        this.a(param2, 64);
    }

    private final void a(int param0, int param1) {
        ((qca) this).field_vb.a(0, -57, ((qca) this).field_vb.e(78), 0, ((qca) this).field_G);
        int var3 = param0 + ((qca) this).field_vb.field_hb;
        ((qca) this).field_xb.a(var3, 120, ((qca) this).field_hb - var3, 0, ((qca) this).field_G);
    }

    qca(long param0, qca param1, String param2) {
        this(param0, param1.field_vb, param1.field_xb, param2);
    }

    final int b(int param0, int param1) {
        if (param1 != 0) {
          field_yb = -94;
          return ((qca) this).field_vb.e(param1 ^ 80) + (param0 + ((qca) this).field_xb.e(param1 ^ 61));
        } else {
          return ((qca) this).field_vb.e(param1 ^ 80) + (param0 + ((qca) this).field_xb.e(param1 ^ 61));
        }
    }

    qca(long param0, phb param1, phb param2, int param3, llb param4, String param5) {
        this(param0, (llb) null, param4, param5);
        try {
            ((qca) this).field_vb.field_q = param1;
            ((qca) this).field_vb.field_tb = param2;
            ((qca) this).field_vb.field_B = param3;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "qca.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_wb = 64;
        field_yb = 0;
    }
}
