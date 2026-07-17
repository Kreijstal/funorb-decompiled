/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends kd {
    static int field_h;
    static java.math.BigInteger field_d;
    private String field_e;
    private String field_c;
    static int field_g;
    static int field_f;

    final static java.awt.Frame a(uf param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        ji[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        ji[] var10 = null;
        ce var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_20_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param0.b(-4)) {
              L1: {
                if (param1 != 0) {
                  break L1;
                } else {
                  int discarded$2 = 0;
                  var10 = rf.a(param0);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_14_0 = null;
                          stackIn_15_0 = stackOut_14_0;
                          return (java.awt.Frame) (Object) stackIn_15_0;
                        }
                      } else {
                        L3: {
                          if (var10[var8].field_f != param5) {
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
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (java.awt.Frame) (Object) stackIn_7_0;
                  }
                }
              }
              var11 = param0.a(86, param1, param2, param5, param4);
              L4: while (true) {
                if (var11.field_f != 0) {
                  var7 = (java.awt.Frame) var11.field_e;
                  if (var7 != null) {
                    if (var11.field_f == 2) {
                      sg.a(var7, (byte) -105, param0);
                      stackOut_24_0 = null;
                      stackIn_25_0 = stackOut_24_0;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackOut_20_0 = null;
                    stackIn_21_0 = stackOut_20_0;
                    return (java.awt.Frame) (Object) stackIn_21_0;
                  }
                } else {
                  int discarded$3 = 0;
                  wl.a(10L);
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
            stackOut_26_0 = (RuntimeException) var6;
            stackOut_26_1 = new StringBuilder().append("sc.B(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L5;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param1 + 44 + param2 + 44 + 124 + 44 + param4 + 44 + param5 + 41);
        }
        return (java.awt.Frame) (Object) stackIn_25_0;
    }

    final void a(byte param0, be param1) {
        try {
            if (param0 != -6) {
                field_g = 54;
            }
            param1.b(((sc) this).field_c, param0 + 132);
            param1.a(((sc) this).field_e, 27933);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "sc.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        if (param0 != 255) {
            field_d = null;
        }
        field_d = null;
    }

    final static int a(int param0, int param1) {
        param0 = (param0 & 1431655765) + ((param0 & -1431655765) >>> 1);
        param0 = (858993459 & param0) - -(param0 >>> 2 & 858993459);
        param0 = (param0 >>> 4) + param0 & 252645135;
        if (param1 != -1) {
            sc.a(-83);
        }
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return param0 & 255;
    }

    final nh a(boolean param0) {
        if (param0) {
            return null;
        }
        return nd.field_M;
    }

    sc(String param0, String param1) {
        try {
            ((sc) this).field_e = param1;
            ((sc) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "sc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_d = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
