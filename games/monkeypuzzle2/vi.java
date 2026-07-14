/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static String[] field_b;
    static String field_a;

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 0) {
          var2 = null;
          vi.a((String) null, 23, false);
          field_a = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          return;
        }
    }

    final static void a(String param0, int param1, boolean param2) {
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (!param2) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        ja.field_F = stackIn_3_0 != 0;
        ah.field_h = true;
        if (param1 != 12345) {
          return;
        } else {
          me.field_f = new ha(wg.field_j, pj.field_c, param0, fk.field_a, ja.field_F);
          wg.field_j.b((byte) -63, (we) (Object) me.field_f);
          return;
        }
    }

    final static int a(int param0, CharSequence param1) {
        Object var3 = null;
        if (param0 <= 39) {
          var3 = null;
          vi.a((String) null, 30, false);
          return wk.a(90, 10, param1, true);
        } else {
          return wk.a(90, 10, param1, true);
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
            Object var2 = null;
            int discarded$0 = vi.a(97, (CharSequence) null);
            fg.field_a = 0;
            return;
        }
        fg.field_a = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[16];
        field_a = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
