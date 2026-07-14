/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends fh {
    byte[] field_l;
    int field_h;
    int field_j;
    boolean field_i;
    int field_k;

    hb(int param0, int param1) {
        ((hb) this).field_h = param0;
        ((hb) this).field_l = new byte[param1];
        ((hb) this).field_k = 0;
        ((hb) this).field_j = param1;
    }

    hb(int param0, byte[] param1, int param2, int param3) {
        ((hb) this).field_h = param0;
        ((hb) this).field_l = param1;
        ((hb) this).field_k = param2;
        ((hb) this).field_j = param3;
    }

    hb(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((hb) this).field_h = param0;
        ((hb) this).field_l = param1;
        ((hb) this).field_k = param2;
        ((hb) this).field_j = param3;
        ((hb) this).field_i = param4 ? true : false;
    }
}
