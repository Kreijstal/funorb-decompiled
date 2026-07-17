/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ds {
    static boolean[][] field_h;
    static hh field_d;
    static int field_c;
    static hd[] field_a;
    static String field_e;
    static String field_b;
    static boolean field_g;
    static String field_f;

    final static gf[] a(ml param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        gf[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        gf var6 = null;
        int var7 = 0;
        gf[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        gf[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            var2_int = param0.l(8, 59);
            if (0 >= var2_int) {
              var3 = param0.l(12, 59);
              var4 = new gf[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  stackOut_15_0 = (gf[]) var4;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  L2: {
                    if (mu.a(param0, (byte) -39)) {
                      var6 = new gf();
                      int discarded$102 = param0.l(24, 59);
                      int discarded$103 = param0.l(24, 59);
                      var6.field_g = param0.l(24, 59);
                      int discarded$104 = param0.l(9, 59);
                      int discarded$105 = param0.l(12, 59);
                      int discarded$106 = param0.l(12, 59);
                      int discarded$107 = param0.l(12, 59);
                      var4[var5] = var6;
                      var5++;
                      break L2;
                    } else {
                      var6_int = param0.l(kb.a(-1 + var5, false), 59);
                      var4[var5] = var4[var6_int];
                      var5++;
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("ds.B(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + -4 + 41);
        }
        return stackIn_16_0;
    }

    final static void a(int param0, bb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              qa.field_E.a((byte) -128, (hd) (Object) param1);
              if (param0 == -1) {
                break L1;
              } else {
                field_c = -45;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ds.C(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        field_a = null;
        field_d = null;
        field_e = null;
        field_b = null;
    }

    final static int a(int param0, int param1) {
        if (1 != param0) {
          if (8 != param0) {
            if (11 != param0) {
              if (param0 == 18) {
                return 1;
              } else {
                if (param0 != 19) {
                  if (param0 == 32) {
                    return 1;
                  } else {
                    if (37 == param0) {
                      return 1;
                    } else {
                      if (24 == param0) {
                        return 1;
                      } else {
                        if (param0 == 25) {
                          return 1;
                        } else {
                          if (param0 != 23) {
                            if (param0 != 29) {
                              if (34 != param0) {
                                if (param0 != 30) {
                                  if (21 == param0) {
                                    return 0;
                                  } else {
                                    if (20 != param0) {
                                      return 0;
                                    } else {
                                      return 1;
                                    }
                                  }
                                } else {
                                  return 1;
                                }
                              } else {
                                return 1;
                              }
                            } else {
                              return 1;
                            }
                          } else {
                            return 0;
                          }
                        }
                      }
                    }
                  }
                } else {
                  return 1;
                }
              }
            } else {
              return 1;
            }
          } else {
            return 2;
          }
        } else {
          return 2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new hh();
        field_c = 225;
        field_e = "Send private message";
        field_g = false;
        field_f = "Click to Spectate";
    }
}
