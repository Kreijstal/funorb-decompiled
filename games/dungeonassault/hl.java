/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hl {
    static cn field_h;
    static lh field_a;
    static gd field_b;
    static volatile int field_g;
    static ad field_c;
    static int[] field_e;
    static String field_d;
    static int field_f;
    static tl field_i;
    static String field_k;
    static String field_j;

    final static void a(int param0, int param1, al param2) {
        wj var3 = null;
        var3 = ac.field_B;
        var3.d((byte) -118, param0);
        var3.a(6, 5);
        var3.a(6, 0);
        var3.i(param2.field_k, -125);
        var3.a(6, param2.field_l);
        var3.a(6, param2.field_p);
        if (param1 >= -122) {
          field_d = null;
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, CharSequence param1, int param2) {
        if (param0 >= -119) {
            hl.a(true);
            return mm.a(param1, true, param2, 3703);
        }
        return mm.a(param1, true, param2, 3703);
    }

    public static void a(int param0) {
        Object var2 = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_i = null;
        field_c = null;
        field_e = null;
        field_k = null;
        if (param0 <= 49) {
          var2 = null;
          hl.a(110, 75, (al) null);
          field_j = null;
          field_h = null;
          return;
        } else {
          field_j = null;
          field_h = null;
          return;
        }
    }

    abstract void a(ec param0, byte param1);

    abstract fd b(int param0);

    final static void a(boolean param0) {
        lg.field_w.h(1);
        if (!param0) {
          L0: {
            field_a = null;
            if (hg.field_r == null) {
              hg.field_r = new wi(lg.field_w, ub.field_o);
              break L0;
            } else {
              break L0;
            }
          }
          lg.field_w.a((lm) (Object) hg.field_r, -1);
          return;
        } else {
          L1: {
            if (hg.field_r == null) {
              hg.field_r = new wi(lg.field_w, ub.field_o);
              break L1;
            } else {
              break L1;
            }
          }
          lg.field_w.a((lm) (Object) hg.field_r, -1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_c = new ad(0, 2, 2, 1);
        field_k = "Enter the name of the player you wish to find in the Dragons of Renown table";
        field_e = new int[]{45, 210, 490, 630, 850, 1010, 1305, 1475, 1665};
        field_j = "The pit in this room may be shallow, but it's full of metal nails waiting to shred a careless raider.<br><br>Trapped raiders permanently lose 1 <%defence>. (If <%defence> reduced to 0, the raider dies)";
        field_d = "<%col_detect>Detect +1 to all monsters.</col>";
    }
}
