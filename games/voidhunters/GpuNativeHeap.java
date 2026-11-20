/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GpuNativeHeap extends GraphicsHeap {
    jaclib.memory.heap.NativeHeap heap;
    static BufferedFile field_e;

    final void deallocate(boolean param0) {
        this.heap.deallocate();
        if (!param0) {
          GpuNativeHeap.clearSharedReferences(false);
        }
    }

    GpuNativeHeap(int param0) {
        this.heap = new jaclib.memory.heap.NativeHeap(param0);
    }

    public static void clearSharedReferences(boolean param0) {
        field_e = null;
        if (!param0) {
          GpuNativeHeap.clearSharedReferences(false);
        }
    }

    static {
    }
}
