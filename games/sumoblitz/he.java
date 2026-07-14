/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class he extends za {
    jaclib.memory.heap.NativeHeap field_p;
    static tf field_m;
    static Random field_o;
    static m field_n;

    public static void a(int param0) {
        field_o = null;
        field_m = null;
        field_n = null;
        if (param0 <= 119) {
            he.a(23);
        }
    }

    he(int param0) {
        ((he) this).field_p = new jaclib.memory.heap.NativeHeap(param0);
    }

    final void c(int param0) {
        ((he) this).field_p.a();
        if (param0 != -14365) {
            field_m = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new tf();
    }
}
