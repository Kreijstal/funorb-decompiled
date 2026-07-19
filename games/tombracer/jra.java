/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jra extends loa {
    static String field_b;
    static String[] field_c;

    jra(qea param0) {
        super(param0);
    }

    final void a(int param0, int param1, hj param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (-1 + param2.field_f <= var5_int) {
                    break L3;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_12_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      var6 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (-1 + param2.field_a <= var6) {
                              break L6;
                            } else {
                              param2.a(var6, 0, 0, var5_int);
                              var6 += 2;
                              if (var7 != 0) {
                                break L5;
                              } else {
                                if (var7 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var5_int++;
                          break L5;
                        }
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var5_int = 2;
                stackOut_11_0 = param1;
                stackIn_12_0 = stackOut_11_0;
                break L2;
              }
              L7: {
                if (stackIn_12_0 >= 73) {
                  break L7;
                } else {
                  jra.a(78);
                  break L7;
                }
              }
              L8: while (true) {
                if (var5_int >= -2 + param2.field_a) {
                  break L0;
                } else {
                  var6 = 1 + this.field_a.a(param2.field_f + -2, 0);
                  param2.a(var5_int, 0, 0, var6);
                  var5_int += 2;
                  if (var7 == 0) {
                    continue L8;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("jra.B(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 19290) {
            jra.a(30);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        field_b = "Names can only contain letters, numbers, spaces and underscores";
        field_c = new String[3];
    }
}
