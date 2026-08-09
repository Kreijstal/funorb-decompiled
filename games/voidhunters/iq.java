/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iq {
    static int field_a;

    final static tv[] a(dja[] param0, tv[] param1, Class[] param2, dja param3, int param4, faa param5, int param6, int param7) {
        tv[] stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        tv var14 = null;
        faa var15 = null;
        int var16 = 0;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var8_int = 56 % ((param7 - 59) / 43);
              var9 = param5.i(0, param4);
              if (-1 == (var9 ^ -1)) {
                param1 = null;
                break L1;
              } else {
                L2: {
                  L3: {
                    if (param1 == null) {
                      break L3;
                    } else {
                      if (param1.length == var9) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  param1 = param3.a(11995, var9);
                  break L2;
                }
                var10 = iia.a(-118, param0.length - 1);
                var11 = 0;
                L4: while (true) {
                  if (var9 <= var11) {
                    break L1;
                  } else {
                    L5: {
                      if (!kv.a(false, param5)) {
                        param1[var11] = null;
                        break L5;
                      } else {
                        L6: {
                          L7: {
                            var12 = param5.i(0, var10);
                            if (param1[var11] == null) {
                              break L7;
                            } else {
                              if (param1[var11].getClass() != param2[var12]) {
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          }
                          param1[var11] = param0[var12].a((byte) -120);
                          break L6;
                        }
                        L8: {
                          var13 = param6;
                          var14 = param1[var11];
                          var15 = param5;
                          if ((var13 ^ -1) != -2) {
                            break L8;
                          } else {
                            var14.a(var15, false);
                            break L8;
                          }
                        }
                        L9: {
                          if (2 == var13) {
                            ((tva) ((Object) var14)).a(-128, var15);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        if (var13 == 3) {
                          ((sjb) ((Object) var14)).a(var15, -97);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var11++;
                    continue L4;
                  }
                }
              }
            }
            stackIn_26_0 = (tv[]) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var8 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var8);

            stackIn_29_1 = new StringBuilder().append("iq.A(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L10;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L12;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_38_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',');

            if (param3 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L13;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L13;
            }
          }
          L14: {


            stackIn_41_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L14;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L14;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_30_0), stackIn_42_2 + ',' + param6 + ',' + param7 + ')');
        }
        return stackIn_26_0;
    }

    static {
        field_a = -1;
    }
}
