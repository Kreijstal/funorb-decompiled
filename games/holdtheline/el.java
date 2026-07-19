/*
 * Decompiled by CFR-JS 0.4.0.
 */
class el extends eh {
    int field_j;
    boolean field_k;
    int field_m;
    byte[] field_n;
    int field_l;

    el(int param0, int param1) {
        this.field_j = param0;
        this.field_n = new byte[param1];
        this.field_m = 0;
        this.field_l = param1;
    }

    el(int param0, byte[] param1, int param2, int param3) {
        this.field_j = param0;
        this.field_n = param1;
        this.field_m = param2;
        this.field_l = param3;
    }

    el(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_j = param0;
        this.field_n = param1;
        this.field_m = param2;
        this.field_l = param3;
        this.field_k = param4 ? true : false;
    }
}
