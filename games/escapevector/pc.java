/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static hh field_a;
    static String[] field_b;
    static int field_d;
    static int[] field_c;
    static int[] field_f;
    static String field_g;
    static mf field_e;

    public static void a(boolean param0) {
        Object var2 = null;
        if (!param0) {
          var2 = null;
          String discarded$2 = pc.a(-125, (CharSequence) null);
          field_f = null;
          field_g = null;
          field_e = null;
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_g = null;
          field_e = null;
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        if (param0 != 0) {
          L0: {
            field_a = null;
            var2 = jb.a(vn.a((byte) 122, param1), (byte) 29);
            if (var2 == null) {
              var2 = "";
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            var2 = jb.a(vn.a((byte) 122, param1), (byte) 29);
            if (var2 == null) {
              var2 = "";
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((param1 ^ -1) <= -1) {
          if (fh.field_c.length > param1) {
            if (param0 != 2513) {
              field_c = null;
              var2 = fh.field_c[param1].length;
              return var2;
            } else {
              var2 = fh.field_c[param1].length;
              return var2;
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Superbly done so far, commander. Your mission remit has again been extended and now takes you to the ice moon. The aliens are busy perfecting cold fusion drive technology for their armada.", "Search for and destroy the drive components."};
        field_f = new int[]{0, 0, 0, 1};
        field_g = "Create a free Account";
    }
}
