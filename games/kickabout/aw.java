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
        sj var2;
        field_F = null;
        field_G = null;
        if (param0 >= -108) {
          var2 = (sj) null;
          aw.a(90, 5, (sj) null, 24);
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
                stackIn_3_0 = (rg) (Class.forName("rh").newInstance());
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = ub.h((byte) -128);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("aw.V(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        super.a(100, param1);
        if (param1 != 2) {
          L0: {
            stackIn_4_0 = 10;

            if (param1 != 0) {
              stackIn_5_0 = stackIn_4_0;
              stackIn_5_1 = 0;
              break L0;
            } else {
              stackIn_5_0 = stackIn_4_0;
              stackIn_5_1 = 1;
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
