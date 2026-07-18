/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static String field_f;
    static volatile boolean field_d;
    static lh field_a;
    static String field_c;
    static String field_e;
    static String field_b;

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = Chess.field_G;
        try {
          L0: {
            var5_int = param3 + param2;
            var6 = param4 - -param0;
            if (wb.field_i >= param2) {
              stackOut_3_0 = wb.field_i;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = param2;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_4_0;
            if (param4 <= wb.field_a) {
              stackOut_6_0 = wb.field_a;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = param4;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_7_0;
            if (var5_int >= wb.field_j) {
              stackOut_9_0 = wb.field_j;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            } else {
              stackOut_8_0 = var5_int;
              stackIn_10_0 = stackOut_8_0;
              break L2;
            }
          }
          L3: {
            var9 = stackIn_10_0;
            if (var6 < wb.field_b) {
              stackOut_12_0 = var6;
              stackIn_13_0 = stackOut_12_0;
              break L3;
            } else {
              stackOut_11_0 = wb.field_b;
              stackIn_13_0 = stackOut_11_0;
              break L3;
            }
          }
          L4: {
            var10 = stackIn_13_0;
            if (wb.field_i > param2) {
              break L4;
            } else {
              if (param2 >= wb.field_j) {
                break L4;
              } else {
                var11 = param2 + wb.field_h * var8;
                var12 = -var8 + 1 + var10 >> 1;
                L5: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L4;
                  } else {
                    wb.field_d[var11] = 16777215;
                    var11 = var11 + 2 * wb.field_h;
                    continue L5;
                  }
                }
              }
            }
          }
          L6: {
            if (wb.field_a > param4) {
              break L6;
            } else {
              if (wb.field_b > var6) {
                var11 = wb.field_h * param4 + var7;
                var12 = var9 + (1 - var7) >> 1;
                L7: while (true) {
                  var12--;
                  if (var12 < 0) {
                    break L6;
                  } else {
                    wb.field_d[var11] = 16777215;
                    var11 += 2;
                    continue L7;
                  }
                }
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (var5_int < wb.field_i) {
              break L8;
            } else {
              if (var5_int >= wb.field_j) {
                break L8;
              } else {
                var11 = var5_int + (var8 + (-param2 + var5_int & 1)) * wb.field_h;
                var12 = -var8 + (var10 + 1) >> 1;
                L9: while (true) {
                  var12--;
                  if (0 > var12) {
                    break L8;
                  } else {
                    wb.field_d[var11] = 16777215;
                    var11 = var11 + 2 * wb.field_h;
                    continue L9;
                  }
                }
              }
            }
          }
          if (param4 < wb.field_a) {
            rc.a(-44, false, -98, -67, 79);
            return;
          } else {
            if (var6 >= wb.field_b) {
              rc.a(-44, false, -98, -67, 79);
              return;
            } else {
              var11 = (1 & -param4 + var6) + wb.field_h * var6 - -var7;
              var12 = var9 + 1 + -var7 >> 1;
              L10: while (true) {
                var12--;
                if (var12 < 0) {
                  rc.a(-44, false, -98, -67, 79);
                  return;
                } else {
                  wb.field_d[var11] = 16777215;
                  var11 += 2;
                  continue L10;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var5, "rc.B(" + param0 + ',' + false + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static pm a(String param0, int param1, String param2, um param3, um param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        pm stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        pm stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var5_int = param3.a(param0, 0);
            var6 = param3.a(param2, 7, var5_int);
            stackOut_2_0 = dn.a(var6, var5_int, (byte) 124, param3, param4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("rc.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(19131).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void b() {
        an.field_c = false;
        if (null == tl.field_Fb) {
          if (0 != vk.field_g) {
            ml.a(0);
            hf.field_g = 0;
            return;
          } else {
            hf.field_g = 0;
            return;
          }
        } else {
          tl.field_Fb.n(-116);
          if (0 == vk.field_g) {
            hf.field_g = 0;
            return;
          } else {
            ml.a(0);
            hf.field_g = 0;
            return;
          }
        }
    }

    public static void a() {
        field_c = null;
        field_f = null;
        field_b = null;
        field_e = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<%0> to move";
        field_e = "Login: ";
        field_d = false;
        field_c = "You have <%0> unread messages!";
        field_b = "Quit";
    }
}
