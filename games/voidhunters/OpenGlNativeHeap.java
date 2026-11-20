/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlNativeHeap extends GraphicsHeap {
    static String field_f;
    jaclib.memory.heap.NativeHeap heap;

    public static void clearSharedReferences(int param0) {
        field_f = null;
        if (param0 > -89) {
          field_f = (String) null;
        }
    }

    final void deallocate(boolean param0) {
        this.heap.deallocate();
        if (param0) {
          this.deallocate(true);
        }
    }

    OpenGlNativeHeap(int param0) {
        this.heap = new jaclib.memory.heap.NativeHeap(param0);
    }

    static {
        field_f = "Off";
    }
}
