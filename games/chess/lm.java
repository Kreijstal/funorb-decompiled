/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm extends pb {
    boolean field_o;
    int field_n;
    int field_l;
    int field_k;
    byte[] field_m;

    lm(int param0, int param1) {
        this.field_n = param0;
        this.field_m = new byte[param1];
        this.field_k = 0;
        this.field_l = param1;
    }

    lm(int param0, byte[] param1, int param2, int param3) {
        this.field_n = param0;
        this.field_m = param1;
        this.field_k = param2;
        this.field_l = param3;
    }

    lm(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_n = param0;
        this.field_m = param1;
        this.field_k = param2;
        this.field_l = param3;
        this.field_o = param4 ? true : false;
    }
}
