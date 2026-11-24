/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractAudioSample {
    int field_l;
    boolean field_m;
    int field_n;
    byte[] field_k;
    int field_j;

    PcmSample(int param0, byte[] param1, int param2, int param3) {
        this.field_j = param0;
        this.field_k = param1;
        this.field_n = param2;
        this.field_l = param3;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_j = param0;
        this.field_k = param1;
        this.field_n = param2;
        this.field_l = param3;
        this.field_m = param4 ? true : false;
    }
}
