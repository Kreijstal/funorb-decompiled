/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gpa extends za {
    static String field_f;
    jaclib.memory.heap.NativeHeap field_e;

    public static void a() {
        field_f = null;
    }

    final void a(boolean param0) {
        ((gpa) this).field_e.a();
        if (param0) {
            ((gpa) this).a(true);
        }
    }

    gpa(int param0) {
        ((gpa) this).field_e = new jaclib.memory.heap.NativeHeap(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Off";
    }
}
