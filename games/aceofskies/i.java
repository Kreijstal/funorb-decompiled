/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends ka implements e {
    long field_nativeid;

    private final native void oa(oa param0);

    public final native void w(boolean param0);

    protected final void finalize() {
        if (((i) this).field_nativeid != 0L) {
            vk.a((e) this, 101);
        }
    }

    i(oa param0) {
        this.oa(param0);
    }
}
