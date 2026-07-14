/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a implements e {
    private oa field_a;
    long field_nativeid;

    private final native void E(long param0, boolean param1);

    final void a() {
        Thread discarded$0 = Thread.currentThread();
        this.b();
    }

    protected final void finalize() {
        if (((a) this).field_nativeid != 0L) {
            pa.a((e) this, (byte) -37);
        }
    }

    private final void b() {
        this.M(((a) this).field_nativeid);
    }

    public final void w(boolean param0) {
        this.E(((a) this).field_nativeid, param0);
    }

    private final native void M(long param0);

    a(oa param0, int param1, int param2) {
        ((a) this).field_a = param0;
        i discarded$0 = new i(((a) this).field_a);
        i discarded$1 = new i(((a) this).field_a);
        i discarded$2 = new i(((a) this).field_a);
        i discarded$3 = new i(((a) this).field_a);
        i discarded$4 = new i(((a) this).field_a);
        i discarded$5 = new i(((a) this).field_a);
        i discarded$6 = new i(((a) this).field_a);
        i discarded$7 = new i(((a) this).field_a);
        i discarded$8 = new i(((a) this).field_a);
        i discarded$9 = new i(((a) this).field_a);
        this.HA(((a) this).field_nativeid, (ha) (Object) param0, param1, param2);
    }

    private final native void HA(long param0, ha param1, int param2, int param3);
}
