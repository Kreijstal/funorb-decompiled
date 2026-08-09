/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static String[] field_a;
    int field_e;
    static String field_b;
    static kc field_d;
    static String field_i;
    int field_c;
    static String field_f;
    static int field_g;
    static i field_h;

    final static mi a(nf param0, int param1) {
        mi var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        mi stackIn_3_0 = null;
        mi stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = (mi) ((Object) uh.field_n.c(true));
            if (var2 == null) {
              stackIn_3_0 = new mi(param0);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = -18 / ((param1 - 64) / 43);
              var2.a(-117, param0);
              stackIn_5_0 = (mi) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("aj.A(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_5_0;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 28139) {
          L0: {
            aj.a(120);
            if (-3 < (param1 ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-3 < (param1 ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        if (param0 != 20028) {
            return;
        }
        field_i = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    final static mi a(ml param0, int param1, boolean param2, int param3, nf param4, int param5) {
        RuntimeException var6 = null;
        mi stackIn_2_0 = null;
        mi stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param2) {
              stackIn_4_0 = j.a(param0, param1, (byte) -116, param4, -1, param5, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (mi) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("aj.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    aj(int param0, int param1, int param2, int param3) {
        this.field_c = param0;
        this.field_e = param3;
    }

    static {
        field_b = "Wands to buy:<nbsp>5";
        field_i = "Press TAB to chat or F10 to open Quick Chat.";
        field_a = new String[]{"Turn time (seconds)", "Map style", "Game mode"};
        field_f = "Fire 101";
        field_g = 22;
    }
}
