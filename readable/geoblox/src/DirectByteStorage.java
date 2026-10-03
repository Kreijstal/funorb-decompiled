/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectByteStorage extends ByteStorage {
    static IntrusiveDeque field_g;
    private java.nio.ByteBuffer directBuffer;
    static MeshMaterial[] meshMaterials;
    static ResourceArchive field_h;

    public static void b(int param0) {
        field_g = null;
        meshMaterials = null;
        field_h = null;
        if (param0 > -1) {
            meshMaterials = (MeshMaterial[]) null;
        }
    }

    DirectByteStorage() {
    }

    final byte[] copyToByteArray(byte copyGuard) {
        byte[] copiedBytes = new byte[this.directBuffer.capacity()];
        byte[] unusedCopiedBytesAlias = copiedBytes;
        this.directBuffer.position(0);
        this.directBuffer.get(copiedBytes);
        int unusedGuardQuotient = 39 / ((copyGuard - 8) / 46);
        return copiedBytes;
    }

    final void initializeStorage(byte[] sourceBytes, boolean populateBuffer) {
        this.directBuffer = java.nio.ByteBuffer.allocateDirect(sourceBytes.length);
        this.directBuffer.position(0);
        if (!populateBuffer) {
            return;
        }
        try {
            this.directBuffer.put(sourceBytes);
        } catch (RuntimeException bufferPopulationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) bufferPopulationFailure), "l.A(" + (sourceBytes != null ? "{...}" : "null") + ',' + populateBuffer + ')');
        }
    }

    static {
        field_g = new IntrusiveDeque();
    }
}
