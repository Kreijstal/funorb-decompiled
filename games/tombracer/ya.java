/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ya extends za implements e {
    long field_nativeid;

    protected final void finalize() {
        if (((ya) this).field_nativeid != 0L) {
            ho.a(-1, (e) this);
        }
    }

    public final native void w(boolean param0);

    final native void ga();

    private final native void aa(oa param0, int param1);

    final native void r();

    ya(oa param0, int param1) {
        this.aa(param0, param1);
    }
}
