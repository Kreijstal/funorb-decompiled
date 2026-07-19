/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends rr {
    byte[] field_p;
    int field_l;
    int field_n;
    boolean field_m;
    int field_o;

    qp(int param0, byte[] param1, int param2, int param3) {
        this.field_n = param0;
        this.field_p = param1;
        this.field_l = param2;
        this.field_o = param3;
    }

    qp(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_n = param0;
        this.field_p = param1;
        this.field_l = param2;
        this.field_o = param3;
        this.field_m = param4 ? true : false;
    }
}
