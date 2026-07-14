/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends md {
    byte[] field_r;
    int field_q;
    boolean field_s;
    int field_t;
    int field_p;

    sk(int param0, byte[] param1, int param2, int param3) {
        ((sk) this).field_p = param0;
        ((sk) this).field_r = param1;
        ((sk) this).field_q = param2;
        ((sk) this).field_t = param3;
    }

    sk(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((sk) this).field_p = param0;
        ((sk) this).field_r = param1;
        ((sk) this).field_q = param2;
        ((sk) this).field_t = param3;
        ((sk) this).field_s = param4 ? true : false;
    }
}
