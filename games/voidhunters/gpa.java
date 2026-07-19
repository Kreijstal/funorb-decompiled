/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gpa extends za {
    static String field_f;
    jaclib.memory.heap.NativeHeap field_e;

    public static void a(int param0) {
        field_f = null;
        if (param0 > -89) {
            field_f = (String) null;
        }
    }

    final void a(boolean param0) {
        this.field_e.a();
        if (param0) {
            this.a(true);
        }
    }

    gpa(int param0) {
        this.field_e = new jaclib.memory.heap.NativeHeap(param0);
    }

    static {
        field_f = "Off";
    }
}
