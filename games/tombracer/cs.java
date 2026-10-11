/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cs {
    static qh field_c;
    static String field_b;
    static jea field_a;

    final static String a(byte param0) {
        int var1 = 126 % ((param0 + 60) / 52);
        if (kl.field_a == gsa.field_y) {
          return ub.field_i;
        }
        if (wt.field_d == gsa.field_y) {
          return uaa.field_a;
        }
        if (gva.field_b.b(124)) {
          return jo.field_E;
        }
        return uaa.field_a;
    }

    public static void a(int param0) {
        if (param0 == 3840) {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
        cs.a((byte) 80);
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_b = "No Reward (DNF)";
    }
}
