/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractPcmSample {
    int field_h;
    byte[] field_i;
    int field_l;
    boolean field_k;
    int field_j;

    PcmSample(int param0, byte[] param1, int param2, int param3) {
        this.field_l = param0;
        this.field_i = param1;
        this.field_j = param2;
        this.field_h = param3;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_l = param0;
        this.field_i = param1;
        this.field_j = param2;
        this.field_h = param3;
        this.field_k = param4 ? true : false;
    }
}
