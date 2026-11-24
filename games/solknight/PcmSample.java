/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractAudioSample {
    int field_l;
    int field_j;
    int field_m;
    boolean field_k;
    byte[] field_i;

    PcmSample(int param0, byte[] param1, int param2, int param3) {
        this.field_j = param0;
        this.field_i = param1;
        this.field_m = param2;
        this.field_l = param3;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_j = param0;
        this.field_i = param1;
        this.field_m = param2;
        this.field_l = param3;
        this.field_k = param4 ? true : false;
    }
}
