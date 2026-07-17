/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class tia extends bw {
    ad field_h;
    Random field_f;
    int field_g;

    final static void b(boolean param0) {
    }

    void a(int param0, int param1, int param2) {
        if (param1 != 25415) {
            ((tia) this).a(61, 127, 83);
        }
    }

    boolean a(int param0) {
        if (param0 > 0) {
            tia.b(false);
            return false;
        }
        return false;
    }

    tia(gj param0, ad param1) {
        ((tia) this).field_f = new Random();
        try {
            ((tia) this).field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "tia.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
