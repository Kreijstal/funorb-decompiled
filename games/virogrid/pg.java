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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
            stackOut_9_0 = (RuntimeException) (var2_ref);
            stackOut_9_1 = new StringBuilder().append("pg.E(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    public static void b(int param0) {
        boolean discarded$0 = false;
        field_c = null;
        field_j = null;
        field_a = null;
        if (param0 != 8192) {
            discarded$0 = pg.a((byte) 74);
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
        field_a = "You resigned";
        field_i = "Grid width: <%0>";
        field_c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_j = new int[8192];
    }
}
