/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sp extends pu {
    static int field_l;

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (1 >= param1) {
                if (1 != param1) {
                  var4 = -50;
                  stackOut_9_0 = var3_int;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = var3_int * param0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                L2: {
                  if ((1 & param1) == 0) {
                    break L2;
                  } else {
                    var3_int = var3_int * param0;
                    break L2;
                  }
                }
                param1 = param1 >> 1;
                param0 = param0 * param0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3, "sp.A(" + param0 + 44 + param1 + 44 + 27 + 41);
        }
        return stackIn_10_0;
    }

    final static int a(hh param0, boolean param1, hh param2) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                sp.b(-122);
                break L1;
              }
            }
            var4 = null;
            stackOut_2_0 = iv.a(-15, 0, 0, param0, (String) null, false, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("sp.B(");
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
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void b(int param0) {
        if (param0 != 1) {
            field_l = -10;
        }
        if (!(gfa.field_i)) {
            throw new IllegalStateException();
        }
        if (oq.field_b != null) {
            oq.field_b.p(-96);
        }
        String var1 = kaa.c(97);
        ola.field_e = new ph(var1, (String) null, true, false, false);
        gja.field_m.a((wj) (Object) kka.field_l, (byte) 82);
        kka.field_l.e((wj) (Object) ola.field_e, 33);
        kka.field_l.m(param0 ^ 17311);
    }

    final static void a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            lka.field_E = qs.a(false, new lu(param0));
            w.field_h = new int[50][13];
            var2_int = 1;
            L1: while (true) {
              if (~var2_int <= ~lka.field_E.length) {
                L2: {
                  if (param1 == -7) {
                    break L2;
                  } else {
                    var5 = null;
                    int discarded$2 = sp.a((hh) null, false, (hh) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                var3 = 2;
                L3: while (true) {
                  if (15 <= var3) {
                    var2_int++;
                    continue L1;
                  } else {
                    L4: {
                      if (var3 == 3) {
                        break L4;
                      } else {
                        if (var3 == 6) {
                          break L4;
                        } else {
                          if (var3 == 9) {
                            break L4;
                          } else {
                            if (var3 != 12) {
                              w.field_h[-1 + var2_int][-2 + var3] = kka.a(var2_int, 63, var3);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    var3++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("sp.D(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = -1;
    }
}
