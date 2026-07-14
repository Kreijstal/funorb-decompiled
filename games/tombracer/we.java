/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class we extends wv {
    dea field_q;

    void a(boolean param0, boolean param1, int param2) {
        super.a(param0, param1, param2);
        ((we) this).field_q.a((byte) -125, param0, !param1 ? true : false);
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param2 != 2048) {
            return false;
        }
        return (param0 & 2048 ^ -1) != -1 ? true : false;
    }

    final void a(byte param0, boolean param1) {
        int var3 = ((we) this).field_q.e(-82);
        ik.field_h.a(0, var3);
        ((we) this).a(param1, var3, (byte) -104);
        super.a(param0, param1);
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0 ^ param0, param1, param2);
        ((we) this).field_q.c(-65);
    }

    we(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        ((we) this).field_q = new dea();
    }

    abstract void a(boolean param0, int param1, byte param2);

    static {
    }
}
