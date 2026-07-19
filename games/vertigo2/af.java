/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class af extends cj implements ik {
    private df field_K;
    static String field_L;
    static int field_E;
    static String field_G;
    static String field_H;
    static String field_J;
    static String field_I;
    static char[] field_F;

    void a(int param0, df param1) {
        int discarded$0 = 0;
        try {
            if (param0 != -11808) {
                discarded$0 = this.a(10);
            }
            this.field_K = param1;
            this.field_K.field_h = (af) (this);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "af.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (jm.a(param1, param2 ^ -99, param0)) {
              L1: {
                if (param2 == -99) {
                  break L1;
                } else {
                  af.d(false);
                  break L1;
                }
              }
              var3_int = 0;
              L2: while (true) {
                if (param1.length() <= var3_int) {
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (wb.a(param1.charAt(var3_int), (byte) 115)) {
                    var3_int++;
                    continue L2;
                  } else {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("af.W(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    abstract int c(boolean param0);

    abstract boolean e(boolean param0);

    public static void d(boolean param0) {
        field_G = null;
        field_H = null;
        field_F = null;
        field_L = null;
        if (param0) {
            return;
        }
        field_J = null;
        field_I = null;
    }

    public final of a(byte param0) {
        if (param0 != -5) {
            this.field_K = (df) null;
            return (of) ((Object) this.field_K);
        }
        return (of) ((Object) this.field_K);
    }

    abstract int i(int param0);

    abstract int a(int param0);

    af(int param0, int param1, int param2, int param3, ur param4) {
        super(param0, param1, param2, param3, param4);
    }

    final static void a(int param0, int param1, byte param2) {
        kf.field_b = param1;
        if (param2 != 122) {
            return;
        }
        ni.field_a = param0;
    }

    static {
        field_L = "From <%0>: ";
        field_G = "Accept invitation to <%0>'s game";
        field_J = "Unfortunately you are not eligible to create an account.";
        field_F = new char[128];
        field_I = "Close";
    }
}
