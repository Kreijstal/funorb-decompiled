/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tb {
    static mj field_a;
    static volatile int field_b;

    abstract long b(int param0);

    final static String a(String param0, String param1, boolean param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        String stackOut_10_0 = null;
        String stackOut_12_0 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (param2) {
          var4 = param1.indexOf(param0);
          L0: while (true) {
            L1: {
              L2: {
                if (var4 == -1) {
                  break L2;
                } else {
                  param1 = param1.substring(0, var4) + param3 + param1.substring(param0.length() + var4);
                  stackOut_4_0 = (String) param1;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    var4 = ((String) (Object) stackIn_5_0).indexOf(param0, param3.length() + var4);
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_6_0 = (String) param1;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            }
            return stackIn_7_0;
          }
        } else {
          field_a = null;
          var4 = param1.indexOf(param0);
          L3: while (true) {
            L4: {
              L5: {
                if (var4 == -1) {
                  break L5;
                } else {
                  param1 = param1.substring(0, var4) + param3 + param1.substring(param0.length() + var4);
                  stackOut_10_0 = (String) param1;
                  stackIn_13_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (var5 != 0) {
                    break L4;
                  } else {
                    var4 = ((String) (Object) stackIn_11_0).indexOf(param0, param3.length() + var4);
                    if (var5 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              stackOut_12_0 = (String) param1;
              stackIn_13_0 = stackOut_12_0;
              break L4;
            }
            return stackIn_13_0;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 255) {
            String discarded$0 = tb.a((String) null, (String) null, true, (String) null);
            field_a = null;
            return;
        }
        field_a = null;
    }

    abstract int a(long param0, byte param1);

    abstract void a(byte param0);

    final static pk a(th param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        pk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_5_0 = null;
        pk stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        pk stackOut_28_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.g(8, 26527);
            if (var2_int <= 0) {
              var3 = hl.a(true, param0) ? 1 : 0;
              if (param1 <= -18) {
                L1: {
                  var4 = hl.a(true, param0) ? 1 : 0;
                  var5 = new pk();
                  var5.field_w = (short)param0.g(16, 26527);
                  var5.field_h = hi.a(param0, (byte) -94, 16, var5.field_h);
                  var5.field_I = hi.a(param0, (byte) -70, 16, var5.field_I);
                  var5.field_g = hi.a(param0, (byte) -83, 16, var5.field_g);
                  var5.field_H = (short)param0.g(16, 26527);
                  var5.field_a = hi.a(param0, (byte) -46, 16, var5.field_a);
                  var5.field_k = hi.a(param0, (byte) -41, 16, var5.field_k);
                  var5.field_B = hi.a(param0, (byte) -114, 16, var5.field_B);
                  if (var3 != 0) {
                    var5.field_A = (short)param0.g(16, 26527);
                    var5.field_z = hi.a(param0, (byte) -87, 16, var5.field_z);
                    var5.field_b = hi.a(param0, (byte) -97, 16, var5.field_b);
                    var5.field_c = hi.a(param0, (byte) -42, 16, var5.field_c);
                    var5.field_j = hi.a(param0, (byte) -52, 16, var5.field_j);
                    var5.field_K = hi.a(param0, (byte) -35, 16, var5.field_K);
                    var5.field_E = hi.a(param0, (byte) -98, 16, var5.field_E);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var4 == 0) {
                    break L2;
                  } else {
                    int discarded$1 = param0.g(16, 26527);
                    var5.field_d = hi.a(param0, (byte) -70, 16, var5.field_d);
                    var5.field_s = hi.a(param0, (byte) -96, 16, var5.field_s);
                    var5.field_e = hi.a(param0, (byte) -128, 16, var5.field_e);
                    var5.field_x = hi.a(param0, (byte) -127, 16, var5.field_x);
                    var5.field_P = hi.a(param0, (byte) -124, 16, var5.field_P);
                    break L2;
                  }
                }
                L3: {
                  if (!hl.a(true, param0)) {
                    break L3;
                  } else {
                    var5.field_q = hi.a(param0, (byte) -77, 16, var5.field_q);
                    break L3;
                  }
                }
                L4: {
                  if (hl.a(true, param0)) {
                    var5.field_J = vk.a(0, param0, 16, var5.field_J);
                    var6 = 0;
                    var7 = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          L8: {
                            if (var5.field_J.length <= var7) {
                              break L8;
                            } else {
                              var10 = ~var6;
                              var9 = ~(var5.field_J[var7] & 255);
                              if (var8 != 0) {
                                if (var9 != var10) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              } else {
                                L9: {
                                  if (var9 >= var10) {
                                    break L9;
                                  } else {
                                    var6 = 255 & var5.field_J[var7];
                                    break L9;
                                  }
                                }
                                var7++;
                                if (var8 == 0) {
                                  continue L5;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          if (0 != var6) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                        var5.field_J = null;
                        if (var8 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                      var5.field_N = (byte)(1 + var6);
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                stackOut_28_0 = (pk) var5;
                stackIn_29_0 = stackOut_28_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (pk) (Object) stackIn_5_0;
              }
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("tb.I(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param1 + 41);
        }
        return stackIn_29_0;
    }

    final int a(byte param0, long param1) {
        long var4 = 0L;
        if (param0 >= 5) {
          var4 = ((tb) this).b(255);
          if (0L < var4) {
            ge.a(0, var4);
            return ((tb) this).a(param1, (byte) 121);
          } else {
            return ((tb) this).a(param1, (byte) 121);
          }
        } else {
          field_a = null;
          var4 = ((tb) this).b(255);
          if (0L >= var4) {
            return ((tb) this).a(param1, (byte) 121);
          } else {
            ge.a(0, var4);
            return ((tb) this).a(param1, (byte) 121);
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
