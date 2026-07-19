/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb {
    static da field_b;
    static String[] field_d;
    static String field_a;
    static String field_c;

    public static void a(byte param0) {
        o discarded$2 = null;
        o var2 = null;
        if (param0 != 113) {
          var2 = (o) null;
          discarded$2 = eb.a(false, (o) null, 11);
          field_a = null;
          field_d = null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static o a(boolean param0, o param1, int param2) {
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        o var11 = null;
        int stackIn_4_0 = 0;
        int stackIn_24_0 = 0;
        o stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_23_0 = 0;
        o stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var10 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            param1.d();
            var11 = new o(param1.field_p, param1.field_t / 3);
            var4 = 0;
            var5 = 0;
            var6 = param1.field_v;
            var7 = var11.field_v;
            var8 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var11.field_t <= var8) {
                    break L3;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_24_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      var9 = stackIn_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var9 >= var11.field_p) {
                              break L6;
                            } else {
                              incrementValue$6 = var5;
                              var5++;
                              incrementValue$7 = var4;
                              var4++;
                              var7[incrementValue$6] = var7[incrementValue$6] + rf.b(20, var6[incrementValue$7], param0, 2);
                              var9++;
                              if (var10 != 0) {
                                break L5;
                              } else {
                                if (var10 == 0) {
                                  continue L4;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var5 = var5 - var11.field_p;
                          break L5;
                        }
                        var9 = 0;
                        L7: while (true) {
                          L8: {
                            L9: {
                              if (var11.field_p <= var9) {
                                break L9;
                              } else {
                                incrementValue$8 = var5;
                                var5++;
                                incrementValue$9 = var4;
                                var4++;
                                var7[incrementValue$8] = var7[incrementValue$8] + rf.b(20, var6[incrementValue$9], param0, 1);
                                var9++;
                                if (var10 != 0) {
                                  break L8;
                                } else {
                                  if (var10 == 0) {
                                    continue L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            var5 = var5 - var11.field_p;
                            break L8;
                          }
                          var9 = 0;
                          L10: while (true) {
                            L11: {
                              L12: {
                                if (var11.field_p <= var9) {
                                  break L12;
                                } else {
                                  incrementValue$10 = var5;
                                  var5++;
                                  incrementValue$11 = var4;
                                  var4++;
                                  var7[incrementValue$10] = var7[incrementValue$10] + rf.b(20, var6[incrementValue$11], param0, 0);
                                  var9++;
                                  if (var10 != 0) {
                                    break L11;
                                  } else {
                                    if (var10 == 0) {
                                      continue L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              var8++;
                              break L11;
                            }
                            if (var10 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                stackOut_23_0 = -54 % ((param2 - -21) / 57);
                stackIn_24_0 = stackOut_23_0;
                break L2;
              }
              var8 = stackIn_24_0;
              var11.f();
              stackOut_24_0 = (o) (var11);
              stackIn_25_0 = stackOut_24_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var3);
            stackOut_26_1 = new StringBuilder().append("eb.B(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L13;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L13;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ')');
        }
        return stackIn_25_0;
    }

    static {
        field_a = "Player Name: ";
        field_d = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_c = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
