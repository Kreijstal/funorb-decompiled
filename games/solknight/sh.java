/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends nl {
    int field_l;
    int field_j;
    int field_m;
    boolean field_k;
    byte[] field_i;

    sh(int param0, byte[] param1, int param2, int param3) {
        ((sh) this).field_j = param0;
        ((sh) this).field_i = param1;
        ((sh) this).field_m = param2;
        ((sh) this).field_l = param3;
    }

    sh(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((sh) this).field_j = param0;
        ((sh) this).field_i = param1;
        ((sh) this).field_m = param2;
        ((sh) this).field_l = param3;
        ((sh) this).field_k = param4 ? true : false;
    }
}
