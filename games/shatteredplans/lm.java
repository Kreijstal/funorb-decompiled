/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    static String field_a;
    static u field_d;
    String field_c;
    static int[] field_e;
    String field_b;

    final static void a(byte param0) {
        ms.field_e[44] = 71;
        ms.field_e[61] = 27;
        ms.field_e[46] = 72;
        ms.field_e[47] = 73;
        ms.field_e[59] = 57;
        if (param0 <= 85) {
          lm.a(false);
          ms.field_e[91] = 42;
          ms.field_e[92] = 74;
          ms.field_e[93] = 43;
          ms.field_e[45] = 26;
          ms.field_e[222] = 58;
          ms.field_e[192] = 28;
          ms.field_e[520] = 59;
          return;
        } else {
          ms.field_e[91] = 42;
          ms.field_e[92] = 74;
          ms.field_e[93] = 43;
          ms.field_e[45] = 26;
          ms.field_e[222] = 58;
          ms.field_e[192] = 28;
          ms.field_e[520] = 59;
          return;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_d = null;
        if (!param0) {
            lm.a(false);
            field_e = null;
            return;
        }
        field_e = null;
    }

    static {
        field_a = "Game Type: Conquest";
        field_e = new int[]{2, 21, 22, 7, 6, 14};
        field_d = new u();
    }
}
