/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    private boolean field_k;
    static int[] field_j;
    static hl field_d;
    static int[] field_o;
    static hl field_l;
    static int[] field_b;
    static String field_c;
    private boolean field_e;
    static String field_a;
    static int field_g;
    static int[] field_i;
    static db field_f;
    static int[] field_h;
    static long field_n;
    private String field_m;

    final void a(boolean param0, int param1) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param0) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((rj) this).field_e = stackIn_3_1 != 0;
        if (param1 != 8) {
          String discarded$2 = ((rj) this).a((byte) 28);
          ((rj) this).field_k = true;
          return;
        } else {
          ((rj) this).field_k = true;
          return;
        }
    }

    final boolean c(boolean param0) {
        if (param0) {
            ((rj) this).field_k = false;
            return ((rj) this).field_k;
        }
        return ((rj) this).field_k;
    }

    final String a(byte param0) {
        if (param0 != 72) {
            field_i = null;
            return ((rj) this).field_m;
        }
        return ((rj) this).field_m;
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        return ((rj) this).field_e;
    }

    rj(String param0) {
        ((rj) this).field_k = false;
        ((rj) this).field_e = false;
        ((rj) this).field_m = param0;
    }

    public static void b(boolean param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        field_o = null;
        field_j = null;
        field_f = null;
        field_i = null;
        field_b = null;
        field_l = null;
        if (!param0) {
          field_o = null;
          field_h = null;
          return;
        } else {
          field_h = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Cancel";
        field_a = "Macroing or use of bots";
        field_o = new int[8];
        field_i = new int[8];
        field_h = new int[8];
        field_b = new int[8];
        field_j = new int[8];
        field_g = 0;
        field_f = new db(0, 2, 2, 1);
    }
}
