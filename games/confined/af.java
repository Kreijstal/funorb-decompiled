/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends sa {
    static mn field_cb;
    static String field_ab;
    static int field_Z;
    static String field_bb;
    static String field_U;

    final void a(mn param0, double param1, int param2, vg param3, oi param4) {
        if (param2 >= -5) {
            return;
        }
        if (!(!((af) this).field_N)) {
            return;
        }
        try {
            ((af) this).a(ri.field_c, ((af) this).field_S, param4, (byte) 64, param1, param0, param3, 128);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "af.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    af(hn param0, ee param1, da param2) {
        super(param0, param1, param2, 0.2, 0.03, 16.0);
        try {
            kj.a(rd.field_Hb, 96, (pm) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "af.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void i(byte param0) {
        field_bb = null;
        field_cb = null;
        field_ab = null;
        field_U = null;
    }

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, df param4, int param5) {
        RuntimeException var6 = null;
        tl[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        tl[] var10 = null;
        bc var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var9 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param4.c(-121)) {
              L1: {
                if (param0 == 0) {
                  var10 = hh.a(param4, 94);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_15_0 = null;
                          stackIn_16_0 = stackOut_15_0;
                          return (java.awt.Frame) (Object) stackIn_16_0;
                        }
                      } else {
                        L3: {
                          if (param3 != var10[var8].field_j) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    return (java.awt.Frame) (Object) stackIn_8_0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param4.a((byte) -101, param3, param2, param0, param1);
              L4: while (true) {
                if (0 != var11.field_g) {
                  var7 = (java.awt.Frame) var11.field_f;
                  if (var7 != null) {
                    if (var11.field_g == 2) {
                      si.a(var7, param4, true);
                      stackOut_28_0 = null;
                      stackIn_29_0 = stackOut_28_0;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackOut_24_0 = null;
                    stackIn_25_0 = stackOut_24_0;
                    return (java.awt.Frame) (Object) stackIn_25_0;
                  }
                } else {
                  jd.a(1, 10L);
                  continue L4;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (java.awt.Frame) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("af.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L5;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + 23221 + ')');
        }
        return (java.awt.Frame) (Object) stackIn_29_0;
    }

    final void g(int param0) {
        ka discarded$7 = ((af) this).a((byte) -123, da.field_g, 1.5);
        if (param0 != 26402) {
            ((af) this).g(55);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "<col=FFFFFF>Nuclear missiles:</col> awarded after every boss.";
        field_cb = new mn();
        field_U = "Loading sound effects";
    }
}
