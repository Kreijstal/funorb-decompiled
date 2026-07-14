/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cba extends za {
    jaclib.memory.heap.NativeHeap field_f;
    static gdb field_e;

    final void a(boolean param0) {
        ((cba) this).field_f.a();
        if (!param0) {
            cba.b(false);
        }
    }

    cba(int param0) {
        ((cba) this).field_f = new jaclib.memory.heap.NativeHeap(param0);
    }

    public static void b(boolean param0) {
        field_e = null;
        if (!param0) {
            cba.b(false);
        }
    }

    static {
    }
}
