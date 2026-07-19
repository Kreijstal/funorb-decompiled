/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class tp extends lm {
    static Random field_v;
    static java.math.BigInteger field_t;
    static String field_u;
    private static String field_z;

    tp() {
    }

    public static void b(boolean param0) {
        field_v = null;
        if (!param0) {
            tp.b(true);
            field_u = null;
            field_t = null;
            return;
        }
        field_u = null;
        field_t = null;
    }

    static {
        field_z = "tp.FA(";
        field_v = new Random();
        field_u = "Add friend";
        field_t = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
