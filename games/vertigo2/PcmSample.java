/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractAudioSample {
    byte[] samples;
    boolean field_p;
    int field_o;
    int field_q;
    int field_r;

    PcmSample(int param0, byte[] param1, int param2, int param3) {
        this.field_r = param0;
        this.samples = param1;
        this.field_o = param2;
        this.field_q = param3;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_r = param0;
        this.samples = param1;
        this.field_o = param2;
        this.field_q = param3;
        this.field_p = param4 ? true : false;
    }
}
