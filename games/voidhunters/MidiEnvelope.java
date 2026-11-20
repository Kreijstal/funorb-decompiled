/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiEnvelope {
    byte[] amplitudeEnvelope;
    static asb field_j;
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
        field_j = null;
    }

    static {
        field_z = "cja.A(";
    }
}
