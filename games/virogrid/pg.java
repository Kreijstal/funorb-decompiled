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
            field_i = (String) null;
            return lj.field_g;
        }
        return lj.field_g;
    }

    final static void a(boolean param0, he param1) {
        he var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            param1.a(param0);
            var2 = (he) ((Object) te.field_f.a((byte) -126));
            L1: while (true) {
              L2: {
                if (var2 == null) {
                  break L2;
                } else {
                  if (!var2.a(param1, -12712)) {
                    break L2;
                  } else {
                    var2 = (he) ((Object) te.field_f.a(16213));
                    continue L1;
                  }
                }
              }
              if (var2 != null) {
                td.a(var2, (byte) 89, param1);
                break L0;
              } else {
                te.field_f.a(param1, (byte) -42);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var2_ref);

            stackIn_11_1 = new StringBuilder().append("pg.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_j = null;
        field_a = null;
        if (param0 != 8192) {
            pg.a((byte) 74);
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
        int var1;
        int stackIn_3_0 = 0;
        var1 = -1 / ((-93 - param0) / 33);
        if (!qm.i(20)) {
          if ((bn.field_d ^ -1) >= -1) {
            return true;
          } else {
            return false;
          }
        } else {
          stackIn_3_0 = 1;
          return stackIn_3_0 != 0;
        }
    }

    static {
        field_a = "You resigned";
        field_i = "Grid width: <%0>";
        field_c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_j = new int[8192];
    }
}
