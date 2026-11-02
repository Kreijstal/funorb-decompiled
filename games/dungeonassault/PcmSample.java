/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends ap {
    int field_l;
    int field_n;
    boolean field_j;
    byte[] data;
    int field_m;

    PcmSample(int param0, byte[] param1, int param2, int param3) {
        this.field_n = param0;
        this.data = param1;
        this.field_l = param2;
        this.field_m = param3;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_n = param0;
        this.data = param1;
        this.field_l = param2;
        this.field_m = param3;
        this.field_j = param4 ? true : false;
    }
}
