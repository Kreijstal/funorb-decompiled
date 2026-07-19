/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ya extends za implements e {
    long field_nativeid;

    public final native void w(boolean param0);

    protected final void finalize() {
        if (this.field_nativeid != 0L) {
            vk.a((e) (this), 81);
        }
    }

    private final native void aa(oa param0, int param1);

    final native void r();

    ya(oa param0, int param1) {
        this.aa(param0, param1);
    }

    final native void ga();
}
