/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureCoordinateGeneration {
    static int[] field_b;
    static int clientPreparationPhase;

    final static void stopSoundStream(int index, int guard) {
        if (guard <= 114) {
          return;
        }
        PcmSampleStream var2 = ImageProducerRasterBuffer.field_n[index];
        GpuDataType.removeSoundStream(125, var2);
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        if (param0 >= -37) {
          clientPreparationPhase = 52;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = new int[8192];
    }
}
