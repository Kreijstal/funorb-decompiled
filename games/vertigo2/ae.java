/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae extends dr {
    byte[] field_s;
    boolean field_p;
    int field_o;
    int field_q;
    int field_r;

    ae(int param0, byte[] param1, int param2, int param3) {
        ((ae) this).field_r = param0;
        ((ae) this).field_s = param1;
        ((ae) this).field_o = param2;
        ((ae) this).field_q = param3;
    }

    ae(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((ae) this).field_r = param0;
        ((ae) this).field_s = param1;
        ((ae) this).field_o = param2;
        ((ae) this).field_q = param3;
        ((ae) this).field_p = param4 ? true : false;
    }
}
