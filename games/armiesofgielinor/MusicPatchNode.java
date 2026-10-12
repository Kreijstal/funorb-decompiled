/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchNode extends IntrusiveNode {
    static byte[] field_r;
    static String field_C;
    int key;
    static int field_l;
    int portamentoPitchDelta;
    int portamentoScale;
    int exclusiveGroup;
    RawPcmStream stream;
    PcmSample sample;
    int channel;
    int framesUntilUpdate;
    int releaseTime;
    static String field_k;
    MusicPatch patch;
    int decayTime;
    static int[] field_G;
    int volumeEnvelopeIndex;
    int retriggerPhase;
    int notePan;
    int velocityGain;
    int vibratoPhase;
    int basePitch;
    int releaseEnvelopeIndex;
    static String field_z;
    int volumeEnvelopeTime;
    int ageTicks;
    MusicPatchEnvelope envelope;

    public static void a(int param0) {
        field_r = null;
        field_z = null;
        field_k = null;
        field_C = null;
        field_G = null;
        if (param0 != 9480) {
          MusicPatchNode.f(69);
        }
    }

    final void releaseReferences(int obfuscationGuard) {
        this.stream = null;
        this.patch = null;
        this.sample = null;
        if (obfuscationGuard == 13301) {
          this.envelope = null;
          return;
        }
        MusicPatchNode.a(-82);
        this.envelope = null;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        jv.field_c = param2;
        DualNodeDeque.field_g = param1;
        ActionRequest.field_n = param0;
        if (param3 != 3815) {
          MusicPatchNode.a(-70, -81, 66, 75);
        }
    }

    final static void f(int param0) {
        if (param0 != -28093) {
          MusicPatchNode.a(38);
          BufferedFile.a((byte) 102);
          return;
        }
        BufferedFile.a((byte) 102);
    }

    MusicPatchNode() {
    }

    static {
        field_C = "Healing";
        field_k = "Send private message to <%0>";
        field_z = "Day";
    }
}
