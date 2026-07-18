/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ya extends za implements e {
    long field_nativeid;

    final native void r();

    final native void ga();

    ya(oa param0, int param1) {
        this.aa(param0, param1);
    }

    public final native void w(boolean param0);

    protected final void finalize() {
        if (((ya) this).field_nativeid != 0L) {
            pa.a((e) this, (byte) -37);
        }
    }

    private final native void aa(oa param0, int param1);
}
