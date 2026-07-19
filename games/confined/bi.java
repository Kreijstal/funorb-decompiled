/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi extends ob {
    byte[] field_o;
    int field_r;
    int field_p;
    boolean field_q;
    int field_n;

    bi(int param0, byte[] param1, int param2, int param3) {
        this.field_n = param0;
        this.field_o = param1;
        this.field_p = param2;
        this.field_r = param3;
    }

    bi(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_n = param0;
        this.field_o = param1;
        this.field_p = param2;
        this.field_r = param3;
        this.field_q = param4 ? true : false;
    }
}
