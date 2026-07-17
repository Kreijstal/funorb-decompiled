/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fa {
    static vd field_d;
    static gh field_f;
    static wk field_e;
    static int[] field_c;
    static wk field_b;
    static gk[] field_a;

    abstract jl b(byte param0);

    final static boolean a(boolean param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            if (f.a(param1, 4, param0)) {
              var2_int = 0;
              L1: while (true) {
                if (param1.length() <= var2_int) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  if (qh.a((byte) -30, param1.charAt(var2_int))) {
                    var2_int++;
                    continue L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("fa.P(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final static String a(char param0, int param1) {
        return String.valueOf(param0);
    }

    abstract int a(boolean param0, int param1);

    final static boolean a(int param0) {
        if (param0 != 38) {
            field_b = null;
            return !uc.field_g ? true : false;
        }
        return !uc.field_g ? true : false;
    }

    final static void a(byte param0) {
        qj.field_a[44] = 71;
        qj.field_a[93] = 43;
        qj.field_a[59] = 57;
        qj.field_a[46] = 72;
        qj.field_a[91] = 42;
        qj.field_a[222] = 58;
        qj.field_a[192] = 28;
        qj.field_a[520] = 59;
        qj.field_a[47] = 73;
        qj.field_a[45] = 26;
        qj.field_a[92] = 74;
        qj.field_a[61] = 27;
    }

    abstract byte[] a(int param0, int param1);

    final static void a(boolean param0, byte param1, boolean param2) {
        L0: {
          if (!param0) {
            pb.b();
            pb.b();
            pb.b();
            break L0;
          } else {
            pb.c(0, 0, pb.field_c, pb.field_j, 0, 192);
            break L0;
          }
        }
        if (param1 <= 32) {
          field_d = null;
          wn.a(0, param0);
          return;
        } else {
          wn.a(0, param0);
          return;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        field_a = null;
        field_f = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, -1, -1, -1, 7};
        field_d = new vd();
    }
}
