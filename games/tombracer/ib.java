/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ib implements noa {
    la field_a;

    abstract void a(byte param0, ui param1, boolean param2, ui param3);

    void a(kh param0, byte param1) {
        param0.a((byte) -126, ((ib) this).a(true), 4);
        if (param1 != 52) {
            int discarded$0 = ((ib) this).a(true);
        }
    }

    abstract void a(byte param0);

    abstract int a(boolean param0);

    ib(la param0, kh param1) {
        this(param0);
    }

    abstract lj a(boolean param0, int param1, int param2);

    abstract void a(int param0, int param1, int param2, int param3);

    private ib(la param0) {
        ((ib) this).field_a = param0;
    }

    static {
    }
}
