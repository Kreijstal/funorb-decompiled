/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static byte[][] field_a;
    static ue field_b;

    final static void a(hl param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = StarCannon.field_A;
        try {
          L0: {
            if ((3 & (param0.field_u | param0.field_v | param0.field_w | param0.field_y)) == 0) {
              return;
            } else {
              var2_int = (param0.field_w & 3) + param0.field_u;
              var3 = param0.field_v - -(3 & param0.field_y);
              var2_int = 4 - ((3 & var2_int) - var2_int);
              var3 = var3 - ((var3 & 3) + -4);
              var4 = new int[var3 * var2_int];
              var5 = 0;
              var6 = (param0.field_w & 3) + var2_int * (param0.field_y & 3);
              var7 = 0;
              L1: while (true) {
                if (param0.field_v <= var7) {
                  param0.field_y = param0.field_y & -4;
                  param0.field_v = var3;
                  param0.field_w = param0.field_w & -4;
                  param0.field_B = var4;
                  param0.field_u = var2_int;
                  break L0;
                } else {
                  var8 = 0;
                  L2: while (true) {
                    if (param0.field_u <= var8) {
                      var6 = var6 + (var2_int - param0.field_u);
                      var7++;
                      continue L1;
                    } else {
                      int incrementValue$2 = var6;
                      var6++;
                      int incrementValue$3 = var5;
                      var5++;
                      var4[incrementValue$2] = param0.field_B[incrementValue$3];
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var2;
            stackOut_14_1 = new StringBuilder().append("li.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + -100 + ')');
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, bf param1) {
        RuntimeException var2 = null;
        bf var2_ref = null;
        bf var3 = null;
        int var4 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var4 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              if (param1.field_q == 6) {
                break L1;
              } else {
                if (7 == param1.field_q) {
                  break L1;
                } else {
                  if (param1.field_q == 14) {
                    break L1;
                  } else {
                    if (param1.field_q == 8) {
                      break L1;
                    } else {
                      if (param1.field_q != 9) {
                        L2: {
                          if (param0 < -110) {
                            break L2;
                          } else {
                            field_b = null;
                            break L2;
                          }
                        }
                        if (param1.field_q != 22) {
                          kh.field_y.b(63, (rf) (Object) param1);
                          break L0;
                        } else {
                          var2_ref = fi.field_e;
                          L3: while (true) {
                            L4: {
                              if (!(var2_ref.field_a instanceof bf)) {
                                break L4;
                              } else {
                                var3 = (bf) (Object) var2_ref.field_a;
                                if (var3.field_q == 6) {
                                  var2_ref = var3;
                                  continue L3;
                                } else {
                                  if (var3.field_q == 7) {
                                    var2_ref = var3;
                                    continue L3;
                                  } else {
                                    if (var3.field_q == 14) {
                                      var2_ref = var3;
                                      continue L3;
                                    } else {
                                      if (var3.field_q == 8) {
                                        var2_ref = var3;
                                        continue L3;
                                      } else {
                                        if (var3.field_q == 9) {
                                          var2_ref = var3;
                                          continue L3;
                                        } else {
                                          break L4;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            ia.a((rf) (Object) param1, (rf) (Object) var2_ref, (byte) 57);
                            return;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            ia.a((rf) (Object) param1, (rf) (Object) fi.field_e, (byte) 57);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var2;
            stackOut_29_1 = new StringBuilder().append("li.A(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L5;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (rc.field_d == null) {
          return;
        } else {
          var1 = (Object) (Object) rc.field_d;
          synchronized (var1) {
            L0: {
              rc.field_d = null;
              break L0;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[1000][];
    }
}
