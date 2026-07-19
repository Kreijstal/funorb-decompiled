/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends at {
    static char[] field_r;
    static int[] field_s;
    static String field_j;
    private int field_m;
    private taa field_q;
    private gj field_o;
    private ad field_n;
    static String field_l;
    static String[] field_k;
    static String field_p;

    final boolean c(byte param0) {
        int fieldTemp$2 = 0;
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (this.field_q.a((byte) -106)) {
          return false;
        } else {
          L0: {
            var2 = -46 / ((param0 - 71) / 47);
            fieldTemp$2 = this.field_m - 1;
            this.field_m = this.field_m - 1;
            if (-1 > (fieldTemp$2 ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    ra(gj param0, ew param1) {
        try {
            this.field_o = param0;
            this.field_n = param1.field_l.a(-27449, this.field_o);
            this.field_q = new taa(this.field_o, this.field_n);
            this.a(27799, this.field_q);
            this.field_n.a(16761024, 65, fb.field_q);
            this.field_m = 100;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != 11919) {
          field_p = (String) null;
          field_k = null;
          field_j = null;
          field_r = null;
          field_s = null;
          field_l = null;
          field_p = null;
          return;
        } else {
          field_k = null;
          field_j = null;
          field_r = null;
          field_s = null;
          field_l = null;
          field_p = null;
          return;
        }
    }

    static {
        field_j = "You have <%0> unread messages!";
        field_l = "The following settings need to be changed:  ";
        field_s = new int[8192];
        field_p = "OVER <%0>";
        field_k = new String[]{"special", "range", "attack", "hp", "move"};
        field_r = new char[]{(char)91, (char)93, (char)35};
    }
}
