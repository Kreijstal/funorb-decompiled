/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static IntrusiveDeque field_c;
    static ti[] field_b;
    static String[] countdownLabels;

    final static long b(boolean param0) {
        if (!param0) {
          mc.a(true);
        }
        return -wi.field_q + lk.a(0);
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          return;
        }
        countdownLabels = null;
        field_b = null;
    }

    final static String a(byte param0) {
        if (param0 != 102) {
          field_c = (IntrusiveDeque) null;
        }
        if (rh.field_v == of.field_d) {
          return ta.field_h;
        }
        return kk.field_c;
    }

    static {
        field_c = new IntrusiveDeque();
        countdownLabels = new String[]{"Ready", "Set", "Go"};
    }
}
