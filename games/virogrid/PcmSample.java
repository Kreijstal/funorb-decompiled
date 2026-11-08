/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractAudioSample {
    int field_l;
    int field_j;
    boolean field_i;
    byte[] field_k;
    int field_h;

    PcmSample(int param0, byte[] param1, int param2, int param3) {
        this.field_h = param0;
        this.field_k = param1;
        this.field_l = param2;
        this.field_j = param3;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_h = param0;
        this.field_k = param1;
        this.field_l = param2;
        this.field_j = param3;
        this.field_i = param4 ? true : false;
    }
}
