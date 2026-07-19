/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a implements e {
    private oa field_b;
    long field_nativeid;
    Runnable field_a;

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
            pq.a(0, (e) (this));
        }
    }

    private final native void M(long param0);

    final void a() {
        this.field_a = (Runnable) ((Object) Thread.currentThread());
        this.b();
    }

    private final native void E(long param0, boolean param1);

    a(oa param0, int param1, int param2) {
        this.field_b = param0;
        i discarded$0 = new i(this.field_b);
        i discarded$1 = new i(this.field_b);
        i discarded$2 = new i(this.field_b);
        i discarded$3 = new i(this.field_b);
        i discarded$4 = new i(this.field_b);
        i discarded$5 = new i(this.field_b);
        i discarded$6 = new i(this.field_b);
        i discarded$7 = new i(this.field_b);
        i discarded$8 = new i(this.field_b);
        i discarded$9 = new i(this.field_b);
        this.HA(this.field_nativeid, param0, param1, param2);
    }

    public final void w(boolean param0) {
        this.E(this.field_nativeid, param0);
    }

    private final void b() {
        this.M(this.field_nativeid);
    }

    private final native void na(long param0, ha param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    private final native void HA(long param0, ha param1, int param2, int param3);

    final void a(ha param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.na(this.field_nativeid, param0, param1, param2, param3, param4, param5, param6, param7);
    }
}
