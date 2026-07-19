/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class df {
    static String field_c;
    static String field_a;
    static String field_b;
    int field_d;

    final static int a(boolean param0) {
        if (!param0) {
            return 51;
        }
        return new Date().getYear() - -1900;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        int discarded$0 = 0;
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 > -106) {
            discarded$0 = df.a(true);
        }
    }

    df(int param0) {
        this.field_d = param0;
    }

    static {
        field_a = "Checking";
        field_b = "Hide lobby chat";
        field_c = "Status";
    }
}
