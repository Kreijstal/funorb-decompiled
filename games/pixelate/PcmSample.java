/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmSample extends AbstractPcmSample {
    int field_l;
    byte[] field_n;
    boolean field_m;
    int field_o;
    int field_p;

    PcmSample(int param0, byte[] param1, int param2, int param3) {
        this.field_o = param0;
        this.field_n = param1;
        this.field_l = param2;
        this.field_p = param3;
    }

    PcmSample(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_o = param0;
        this.field_n = param1;
        this.field_l = param2;
        this.field_p = param3;
        this.field_m = param4 ? true : false;
    }
}
