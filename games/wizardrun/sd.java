/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static String[] field_b;
    static String field_e;
    int field_a;
    static int[] field_f;
    static String field_c;
    static String[] field_d;

    final static byte[] a(mg param0, byte[] param1, int param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_17_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = wizardrun.field_H;
        try {
          L0: {
            var4_int = param0.g(param2, -11719);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param1 == null) {
                    break L2;
                  } else {
                    if (var4_int == param1.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param1 = new byte[var4_int];
                break L1;
              }
              L3: {
                var5 = param0.g(3, -11719);
                var6 = (byte)param0.g(8, -11719);
                if (0 >= var5) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param1[var7] = (byte)var6;
                      var7++;
                      continue L4;
                    }
                  }
                } else {
                  var7 = 0;
                  L5: while (true) {
                    if (var4_int <= var7) {
                      break L3;
                    } else {
                      param1[var7] = (byte)(param0.g(var5, param3 + -11730) + var6);
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              if (param3 == 11) {
                stackIn_19_0 = (byte[]) (param1);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_17_0 = (byte[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("sd.C(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0;
        } else {
          return stackIn_19_0;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    sd(int param0) {
        this.field_a = param0;
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    public static void a(int param0) {
        field_d = null;
        field_f = null;
        field_b = null;
        if (param0 != 0) {
            byte[] var2 = (byte[]) null;
            sd.a((mg) null, (byte[]) null, 19, (byte) -77);
        }
        field_e = null;
        field_c = null;
    }

    static {
        field_e = "Jump into the captured enemies for larger crystals.";
        field_f = new int[8192];
        field_d = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_c = "Logging in...";
    }
}
