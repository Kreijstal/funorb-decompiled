/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class HardwareGraphicsHeap extends GraphicsHeap {
    jaclib.memory.heap.NativeHeap heap;
    static LegacyAlphaFontLoader field_m;
    static Random field_o;
    static ProgressDialog field_n;

    public static void releaseStatics(int param0) {
        field_o = null;
        field_m = null;
        field_n = null;
        if (param0 <= 119) {
          HardwareGraphicsHeap.releaseStatics(23);
        }
    }

    HardwareGraphicsHeap(int capacity) {
        this.heap = new jaclib.memory.heap.NativeHeap(capacity);
    }

    final void close(int guard) {
        this.heap.a();
        if (guard != -14365) {
          field_m = (LegacyAlphaFontLoader) null;
        }
    }

    static {
        field_m = new LegacyAlphaFontLoader();
    }
}
