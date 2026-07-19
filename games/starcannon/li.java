/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    static byte[][] field_a;
    static ue field_b;

    final static void a(hl param0, byte param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
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
        int decompiledRegionSelector0 = 0;
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
            if (-1 == (3 & (param0.field_u | param0.field_v | param0.field_w | param0.field_y) ^ -1)) {
              decompiledRegionSelector0 = 0;
              break L0;
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
                  if (param1 == -100) {
                    param0.field_w = param0.field_w & -4;
                    param0.field_B = var4;
                    param0.field_u = var2_int;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  var8 = 0;
                  L2: while (true) {
                    if (param0.field_u <= var8) {
                      var6 = var6 + (var2_int - param0.field_u);
                      var7++;
                      continue L1;
                    } else {
                      incrementValue$2 = var6;
                      var6++;
                      incrementValue$3 = var5;
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
            stackOut_14_0 = (RuntimeException) (var2);
            stackOut_14_1 = new StringBuilder().append("li.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void b(int param0) {
        field_a = (byte[][]) null;
        if (param0 != -23) {
            return;
        }
        field_b = null;
    }

    final static void a(int param0, bf param1) {
        RuntimeException var2 = null;
        bf var2_ref = null;
        bf var3 = null;
        int var4 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
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
                  if ((param1.field_q ^ -1) == -15) {
                    break L1;
                  } else {
                    if (-9 == (param1.field_q ^ -1)) {
                      break L1;
                    } else {
                      if (-10 != (param1.field_q ^ -1)) {
                        L2: {
                          if (param0 < -110) {
                            break L2;
                          } else {
                            field_b = (ue) null;
                            break L2;
                          }
                        }
                        if (-23 != (param1.field_q ^ -1)) {
                          kh.field_y.b(63, param1);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var2_ref = fi.field_e;
                          L3: while (true) {
                            L4: {
                              if (!(var2_ref.field_a instanceof bf)) {
                                break L4;
                              } else {
                                L5: {
                                  var3 = (bf) ((Object) var2_ref.field_a);
                                  if (-7 == (var3.field_q ^ -1)) {
                                    break L5;
                                  } else {
                                    if (-8 == (var3.field_q ^ -1)) {
                                      break L5;
                                    } else {
                                      if ((var3.field_q ^ -1) == -15) {
                                        break L5;
                                      } else {
                                        if (var3.field_q == 8) {
                                          break L5;
                                        } else {
                                          if ((var3.field_q ^ -1) == -10) {
                                            break L5;
                                          } else {
                                            break L4;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                var2_ref = var3;
                                continue L3;
                              }
                            }
                            ia.a(param1, var2_ref, (byte) 57);
                            decompiledRegionSelector0 = 1;
                            break L0;
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
            ia.a(param1, fi.field_e, (byte) 57);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var2);
            stackOut_26_1 = new StringBuilder().append("li.A(").append(param0).append(',');
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
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 1392) {
            break L0;
          } else {
            field_a = (byte[][]) null;
            break L0;
          }
        }
        if (rc.field_d == null) {
          return;
        } else {
          var1 = rc.field_d;
          synchronized (var1) {
            L1: {
              rc.field_d = null;
              break L1;
            }
          }
          return;
        }
    }

    static {
        field_a = new byte[1000][];
    }
}
