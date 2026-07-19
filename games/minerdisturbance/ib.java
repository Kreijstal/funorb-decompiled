/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib implements uj {
    static ln[] field_c;
    static ea field_a;
    static int[] field_b;

    public final String a(byte param0) {
        int var2 = 99 % ((param0 - -33) / 62);
        return "Fill Cell Gas";
    }

    public final void a(boolean param0) {
        tb.field_a = 3;
        ha.field_e = 1;
        if (param0) {
            ib.a(-48);
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
          ib.a(-66);
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    static {
        field_b = new int[128];
    }
}
