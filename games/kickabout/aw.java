/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aw extends i {
    static String field_G;
    static String field_F;
    static boolean field_H;
    static String field_K;
    static String field_I;
    static int field_J;

    public static void h(byte param0) {
        kg discarded$2 = null;
        sj var2 = null;
        field_F = null;
        field_G = null;
        if (param0 >= -108) {
          var2 = (sj) null;
          discarded$2 = aw.a(90, 5, (sj) null, 24);
          field_K = null;
          field_I = null;
          return;
        } else {
          field_K = null;
          field_I = null;
          return;
        }
    }

    final static rg g(byte param0) {
        try {
            Throwable var1 = null;
            rg stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            rg stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 == 3) {
                    break L1;
                  } else {
                    aw.h((byte) -117);
                    break L1;
                  }
                }
                stackOut_2_0 = (rg) (Class.forName("rh").newInstance());
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static kg a(int param0, int param1, sj param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        kg stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        kg stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (cu.a(param0, param2, param1, param3 ^ 123)) {
              L1: {
                if (param3 == 2) {
                  break L1;
                } else {
                  field_G = (String) null;
                  break L1;
                }
              }
              stackOut_5_0 = ub.h((byte) -128);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("aw.V(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (kg) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final void a(int param0, int param1) {
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        super.a(100, param1);
        if (param1 != 2) {
          L0: {
            stackOut_2_0 = 10;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (param1 != 0) {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          wf.b(stackIn_5_0, stackIn_5_1 != 0);
          if (param0 <= 60) {
            field_H = true;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    aw() {
        super(8);
    }

    final boolean a(int param0, byte param1, char param2) {
        boolean discarded$3 = super.a(param0, param1, param2);
        if ((param0 ^ -1) != -14) {
          return true;
        } else {
          this.a(78, 2);
          return true;
        }
    }

    static {
        field_I = "Connecting to<br>friend server...";
        field_F = "Advertising websites";
        field_K = "Trap Mouse: Disabled";
        field_G = "Type your email address again to make sure it's correct";
    }
}
