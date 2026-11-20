/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiEnvelope {
    byte[] amplitudeEnvelope;
    static ResourceArchive localizationArchive;
    int decayPitchScale;
    int envelopePitchScale;
    int vibratoSpeed;
    byte[] releaseEnvelope;
    int releasePitchScale;
    int vibratoDelay;
    int decayRate;
    int vibratoDepth;
    private static String field_z;

    public static void clearSharedReferences(int param0) {
        if (param0 != -17719) {
          return;
        }
        localizationArchive = null;
    }

    static {
        field_z = "cja.A(";
    }
}
