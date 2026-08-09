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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            if (f.a(param1, 4, param0)) {
              var2_int = 0;
              L1: while (true) {
                if (param1.length() <= var2_int) {
                  stackIn_11_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (qh.a((byte) -30, param1.charAt(var2_int))) {
                    var2_int++;
                    continue L1;
                  } else {
                    stackIn_8_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("fa.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final static String a(char param0, int param1) {
        if (param1 != 29448) {
            CharSequence var3 = (CharSequence) null;
            fa.a(true, (CharSequence) null);
            return String.valueOf(param0);
        }
        return String.valueOf(param0);
    }

    abstract int a(boolean param0, int param1);

    final static boolean a(int param0) {
        if (param0 != 38) {
            field_b = (wk) null;
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
        if (param0 < 106) {
          fa.a(-119);
          qj.field_a[222] = 58;
          qj.field_a[192] = 28;
          qj.field_a[520] = 59;
          qj.field_a[47] = 73;
          qj.field_a[45] = 26;
          qj.field_a[92] = 74;
          qj.field_a[61] = 27;
          return;
        } else {
          qj.field_a[222] = 58;
          qj.field_a[192] = 28;
          qj.field_a[520] = 59;
          qj.field_a[47] = 73;
          qj.field_a[45] = 26;
          qj.field_a[92] = 74;
          qj.field_a[61] = 27;
          return;
        }
    }

    abstract byte[] a(int param0, int param1);

    final static void a(boolean param0, byte param1, boolean param2) {
        if (!param0) {
          pb.b();
          if (param1 > 32) {
            wn.a(0, param0);
            return;
          } else {
            field_d = (vd) null;
            wn.a(0, param0);
            return;
          }
        } else {
          pb.c(0, 0, pb.field_c, pb.field_j, 0, 192);
          if (param1 > 32) {
            wn.a(0, param0);
            return;
          } else {
            field_d = (vd) null;
            wn.a(0, param0);
            return;
          }
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        field_a = null;
        field_f = null;
        field_c = null;
        if (param0 != 38) {
            field_b = (wk) null;
        }
    }

    static {
        field_c = new int[]{38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, -1, -1, -1, 7};
        field_d = new vd();
    }
}
