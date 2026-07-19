/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends za {
    jaclib.memory.heap.NativeHeap field_h;
    static es field_g;
    static int[] field_i;
    static String[] field_f;
    static int[] field_e;

    final static boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return cu.field_r;
    }

    gi(int param0) {
        this.field_h = new jaclib.memory.heap.NativeHeap(param0);
    }

    final void d(int param0) {
        this.field_h.a();
        if (param0 <= 124) {
            gi.a(-62);
        }
    }

    public static void a(int param0) {
        boolean discarded$0 = false;
        field_g = null;
        field_i = null;
        field_f = null;
        if (param0 != -12085) {
            discarded$0 = gi.a(false);
            field_e = null;
            return;
        }
        field_e = null;
    }

    static {
        field_i = new int[1024];
        field_f = new String[]{"By rating", "By win percentage"};
        field_e = new int[]{-1, -1, -1, -1, -1, -1, 70, -1, -1, -1, 70, 150, -1, -1, -1, -1, -1, -1, -1, -1, 30, 30};
    }
}
