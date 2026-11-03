/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractPcmSample {
    int field_k;
    int field_l;
    int field_j;
    byte[] field_m;
    boolean field_i;

    PcmSample(int param0, byte[] param1, int param2, int param3) {
        this.field_j = param0;
        this.field_m = param1;
        this.field_l = param2;
        this.field_k = param3;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_j = param0;
        this.field_m = param1;
        this.field_l = param2;
        this.field_k = param3;
        this.field_i = param4 ? true : false;
    }
}
