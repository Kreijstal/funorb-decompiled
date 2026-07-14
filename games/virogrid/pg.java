/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static String field_a;
    static int field_g;
    int field_d;
    static boolean field_h;
    static int field_e;
    static String field_i;
    static String[] field_c;
    int field_b;
    int field_f;
    static int[] field_j;

    final static int a(boolean param0) {
        if (!param0) {
            field_i = null;
            return lj.field_g;
        }
        return lj.field_g;
    }

    final static void a(boolean param0, he param1) {
        he var2 = null;
        int var3 = 0;
        var3 = Virogrid.field_F ? 1 : 0;
        param1.a(param0);
        var2 = (he) (Object) te.field_f.a((byte) -126);
        L0: while (true) {
          if (var2 != null) {
            if (var2.a(param1, -12712)) {
              var2 = (he) (Object) te.field_f.a(16213);
              continue L0;
            } else {
              L1: {
                if (var2 != null) {
                  td.a((l) (Object) var2, (byte) 89, (l) (Object) param1);
                  break L1;
                } else {
                  te.field_f.a((l) (Object) param1, (byte) -42);
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (var2 != null) {
                td.a((l) (Object) var2, (byte) 89, (l) (Object) param1);
                break L2;
              } else {
                te.field_f.a((l) (Object) param1, (byte) -42);
                break L2;
              }
            }
            return;
          }
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_j = null;
        field_a = null;
        if (param0 != 8192) {
            boolean discarded$0 = pg.a((byte) 74);
            field_i = null;
            return;
        }
        field_i = null;
    }

    final static String a(int param0) {
        if (param0 != -1) {
            field_g = -109;
            return rf.field_a;
        }
        return rf.field_a;
    }

    final static boolean a(byte param0) {
        int var1 = 0;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var1 = -1 / ((-93 - param0) / 33);
        if (!qm.i(20)) {
          if ((bn.field_d ^ -1) >= -1) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You resigned";
        field_i = "Grid width: <%0>";
        field_c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_j = new int[8192];
    }
}
