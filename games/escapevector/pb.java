/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    static char[] field_a;
    static boolean field_d;
    static int field_b;
    static int[] field_c;
    static wl field_e;

    final static int a(byte param0, dk[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        dk[] var3 = null;
        int var4 = 0;
        dk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 == 2) {
              var2_int = -2147483648;
              var3 = param1;
              var4 = 0;
              L1: while (true) {
                if (var3.length <= var4) {
                  if (2147483647 == (var2_int ^ -1)) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    stackOut_14_0 = var2_int;
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  L2: {
                    var5 = var3[var4];
                    var6 = var5.field_i + var5.field_l;
                    if (var2_int >= var6) {
                      break L2;
                    } else {
                      var2_int = var6;
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 20;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("pb.B(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_a = null;
        field_c = null;
        if (param0) {
            field_c = (int[]) null;
        }
    }

    final static void a(int param0) {
        ll.a(70, 8, param0 ^ 12, am.field_k);
        if (-96 < (am.field_k ^ -1)) {
          if (param0 != 4) {
            field_b = -65;
            return;
          } else {
            return;
          }
        } else {
          if ((am.field_k ^ -1) <= -111) {
            dg.field_t.e((640 + -dg.field_t.field_A) / 2, fg.field_b);
            if (param0 == 4) {
              return;
            } else {
              field_b = -65;
              return;
            }
          } else {
            mf.a(fg.field_b, (-dg.field_t.field_A + 640) / 2, -(am.field_k * 4) + 440, dg.field_t, -122);
            if (param0 == 4) {
              return;
            } else {
              field_b = -65;
              return;
            }
          }
        }
    }

    static {
        field_a = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_b = 0;
    }
}
