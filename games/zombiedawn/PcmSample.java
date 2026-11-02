/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractAudioSample {
    byte[] field_l;
    boolean field_j;
    int field_m;
    int field_i;
    int field_k;

    PcmSample(int param0, byte[] param1, int param2, int param3) {
        this.field_m = param0;
        this.field_l = param1;
        this.field_i = param2;
        this.field_k = param3;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_m = param0;
        this.field_l = param1;
        this.field_i = param2;
        this.field_k = param3;
        this.field_j = param4 ? true : false;
    }
}
