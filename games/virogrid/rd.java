/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rd extends fd implements fg {
    private al field_D;

    rd(int param0, int param1, int param2, int param3, ol param4) {
        super(param0, param1, param2, param3, param4);
    }

    public final le a(int param0) {
        if (param0 != -1) {
            return null;
        }
        return (le) (Object) ((rd) this).field_D;
    }

    abstract int g(int param0);

    abstract int g(boolean param0);

    abstract boolean h(int param0);

    void a(int param0, al param1) {
        ((rd) this).field_D = param1;
        ((rd) this).field_D.field_h = (rd) this;
        if (param0 != 2) {
            le discarded$0 = ((rd) this).a(-16);
        }
    }

    abstract int f(int param0);

    static {
    }
}
