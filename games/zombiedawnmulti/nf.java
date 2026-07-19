/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    static int field_a;
    static int field_b;
    static int field_c;
    static int field_d;

    final static ma a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        ma var7 = null;
        int var8 = 0;
        ma stackIn_3_0 = null;
        ma stackIn_6_0 = null;
        ma stackIn_9_0 = null;
        ma stackIn_12_0 = null;
        ma stackIn_16_0 = null;
        ma stackIn_19_0 = null;
        ma stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_15_0 = null;
        ma stackOut_18_0 = null;
        ma stackOut_21_0 = null;
        ma stackOut_11_0 = null;
        ma stackOut_8_0 = null;
        ma stackOut_5_0 = null;
        ma stackOut_2_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (-1 != (var2_int ^ -1)) {
              if ((var2_int ^ -1) >= -256) {
                var3 = mk.a('.', false, param1);
                if (2 <= var3.length) {
                  if (param0 >= 79) {
                    var4 = var3;
                    var5 = 0;
                    L1: while (true) {
                      L2: {
                        L3: {
                          if (var5 >= var4.length) {
                            break L3;
                          } else {
                            var6 = var4[var5];
                            stackOut_15_0 = lq.a((byte) 1, var6);
                            stackIn_22_0 = stackOut_15_0;
                            stackIn_16_0 = stackOut_15_0;
                            if (var8 != 0) {
                              break L2;
                            } else {
                              var7 = stackIn_16_0;
                              if (var7 != null) {
                                stackOut_18_0 = (ma) (var7);
                                stackIn_19_0 = stackOut_18_0;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              } else {
                                var5++;
                                if (var8 == 0) {
                                  continue L1;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        stackOut_21_0 = pg.a(var3[-1 + var3.length], (byte) -86);
                        stackIn_22_0 = stackOut_21_0;
                        break L2;
                      }
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    stackOut_11_0 = (ma) null;
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_8_0 = jo.field_e;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = er.field_f;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = jo.field_e;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2);
            stackOut_23_1 = new StringBuilder().append("nf.A(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  return stackIn_19_0;
                }
              }
            }
          }
        }
    }

    static {
        ka.a(50, (byte) -110);
    }
}
