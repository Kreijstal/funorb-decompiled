/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends hg {
    static int[] field_h;
    static qh[] field_k;
    static String[] field_j;
    String field_g;
    int field_i;

    public static void a(byte param0) {
        field_h = null;
        field_k = null;
        field_j = null;
    }

    final static boolean a(boolean param0) {
        if (pg.field_c == null) {
            return false;
        }
        if (al.field_d != ck.field_t) {
            return false;
        }
        return true;
    }

    final static void a(dk[] param0, int param1, int param2, byte param3) {
        dk[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        dk var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        dk[] var11 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            if (param0 != null) {
              var11 = param0;
              var4 = var11;
              var5 = 0;
              L1: while (true) {
                if (var11.length <= var5) {
                  L2: {
                    if (param3 <= -5) {
                      break L2;
                    } else {
                      field_k = null;
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  L3: {
                    var6 = var11[var5];
                    if (var6 == null) {
                      var5++;
                      break L3;
                    } else {
                      L4: {
                        var7 = var6.field_c;
                        if (param2 != var7) {
                          stackOut_8_0 = 0;
                          stackIn_9_0 = stackOut_8_0;
                          break L4;
                        } else {
                          stackOut_7_0 = 1;
                          stackIn_9_0 = stackOut_7_0;
                          break L4;
                        }
                      }
                      L5: {
                        var8 = stackIn_9_0;
                        if (var7 != param1) {
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          break L5;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L5;
                        }
                      }
                      var9 = stackIn_12_0;
                      var6.a(var8 != 0, var9 != 0, (byte) 81);
                      var5++;
                      break L3;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4_ref;
            stackOut_20_1 = new StringBuilder().append("rb.A(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    rb(String param0, int param1) {
        try {
            ((rb) this).field_g = param0;
            ((rb) this).field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "rb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new String[]{"Congratulations on your success in the asteroid belt. Given your success thus far, we are extending your mission. You must now cripple the alien's mining operations.", "Target and eliminate their ore extraction machinery."};
    }
}
