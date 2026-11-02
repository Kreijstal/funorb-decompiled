/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractAudioSample {
    byte[] field_s;
    int field_o;
    int field_r;
    int field_q;
    boolean field_p;

    PcmSample(int param0, byte[] param1, int param2, int param3) {
        this.field_o = param0;
        this.field_s = param1;
        this.field_q = param2;
        this.field_r = param3;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_o = param0;
        this.field_s = param1;
        this.field_q = param2;
        this.field_r = param3;
        this.field_p = param4 ? true : false;
    }
}
