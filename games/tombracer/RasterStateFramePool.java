/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterStateFramePool {
    static IntrusiveDeque freeFrames;
    private static String field_z;

    public static void releaseStatics(byte param0) {
        freeFrames = null;
        if (param0 <= 51) {
          RasterStateFramePool.releaseStatics((byte) -125);
        }
    }

    public RasterStateFramePool() {
        TooltipVisibility discarded$0 = new TooltipVisibility();
    }

    static {
        field_z = "vt.A(";
        freeFrames = new IntrusiveDeque();
    }
}
