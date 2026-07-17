/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oga extends vg {
    boolean field_h;
    cka field_g;
    static long field_f;

    abstract void a(rt param0, int param1, byte param2, rt param3);

    final static void a(boolean param0) {
        nfa.field_p = param0 ? true : false;
        jf.field_r = false;
        jsa.a(false, -1);
        kl.field_a = fta.field_c;
        wt.field_d = fta.field_c;
    }

    final boolean b(byte param0) {
        if (param0 > -91) {
            field_f = 125L;
            return ((oga) this).field_h;
        }
        return ((oga) this).field_h;
    }

    abstract void a(int param0, byte param1);

    final boolean a(int param0) {
        if (param0 != 1) {
            ((oga) this).field_h = true;
            return false;
        }
        return false;
    }

    int b(int param0) {
        if (param0 != 13727) {
            boolean discarded$0 = ((oga) this).a((byte) 63);
            return 0;
        }
        return 0;
    }

    abstract boolean c(byte param0);

    abstract void a(int param0, byte param1, int param2);

    abstract boolean a(byte param0);

    abstract void d(byte param0);

    final int c(int param0) {
        if (param0 != 1) {
            return -49;
        }
        return 1;
    }

    oga(cka param0) {
        try {
            ((oga) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "oga.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
