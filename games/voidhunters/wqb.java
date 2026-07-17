/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wqb extends mfb {
    static String field_d;
    static Hashtable field_e;
    static String[] field_c;
    static String field_b;

    final int a(int param0) {
        if (param0 != 0) {
            field_b = null;
            return qra.field_o;
        }
        return qra.field_o;
    }

    final int c(int param0) {
        if (param0 != 0) {
            field_e = null;
            return bma.field_n;
        }
        return bma.field_n;
    }

    public static void i(byte param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_c = null;
    }

    final int f(byte param0) {
        if (param0 <= 0) {
            field_b = null;
            return nca.field_o;
        }
        return nca.field_o;
    }

    final int k(int param0) {
        if (param0 != 0) {
            return 98;
        }
        return 1;
    }

    final int b(boolean param0) {
        if (param0) {
            int discarded$0 = ((wqb) this).b(23);
            return klb.field_p;
        }
        return klb.field_p;
    }

    final int b(int param0) {
        int var2 = 57 % ((7 - param0) / 47);
        return mmb.field_i;
    }

    final int d(byte param0) {
        if (param0 >= -52) {
            int discarded$0 = ((wqb) this).a(true);
            return cca.field_p;
        }
        return cca.field_p;
    }

    final int g(int param0) {
        if (param0 != 2769) {
            return 46;
        }
        return voa.field_b;
    }

    final int a(boolean param0) {
        if (param0) {
            int discarded$0 = ((wqb) this).f((byte) -9);
            return 3;
        }
        return 3;
    }

    final int a(byte param0) {
        int var2 = 126 % ((-48 - param0) / 43);
        return wob.field_o;
    }

    final int g(byte param0) {
        if (param0 >= -12) {
            field_e = null;
            return ioa.field_p;
        }
        return ioa.field_p;
    }

    wqb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Level editing", "Events", "Conditions", "Actions", "Event editing", "Map zones & Res nodes", "Misc", "Chassis", "Thrusters", "Basic weapons", "Advanced weapons", "Arms", "Hull pieces", "Defences", "Special"};
        field_b = "Waiting for fonts";
        field_d = "Weapon Energy";
        field_e = new Hashtable();
    }
}
