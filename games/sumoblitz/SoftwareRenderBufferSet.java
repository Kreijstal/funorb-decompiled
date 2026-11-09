/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareRenderBufferSet extends RenderBufferSet {
    static int scratchIndexCapacity;

    SoftwareRenderBufferSet(SoftwareGraphicsToolkit toolkit) {
    }

    static {
        scratchIndexCapacity = 4096;
    }
}
