/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends ea {
    int field_l;
    int field_j;
    byte[] field_h;
    boolean field_i;
    int field_k;

    ib(int param0, int param1) {
        ((ib) this).field_l = param0;
        ((ib) this).field_h = new byte[param1];
        ((ib) this).field_j = 0;
        ((ib) this).field_k = param1;
    }

    ib(int param0, byte[] param1, int param2, int param3) {
        ((ib) this).field_l = param0;
        ((ib) this).field_h = param1;
        ((ib) this).field_j = param2;
        ((ib) this).field_k = param3;
    }

    ib(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((ib) this).field_l = param0;
        ((ib) this).field_h = param1;
        ((ib) this).field_j = param2;
        ((ib) this).field_k = param3;
        ((ib) this).field_i = param4 ? true : false;
    }
}
