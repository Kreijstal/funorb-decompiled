/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends wa implements fg {
    private le field_U;
    static mg[] field_Y;
    static String field_X;
    static en field_Z;
    private int field_W;
    static String field_V;

    vd(String param0, cd param1, int param2) {
        super(param0, param1, param2);
    }

    final String d(int param0) {
        if (((vd) this).field_p) {
          if (((vd) this).field_h != null) {
            km.a(((vd) this).field_g + (-((vd) this).field_W + nl.field_u), hk.field_Jb, -83);
            if (param0 <= 35) {
              return null;
            } else {
              return ((vd) this).field_h;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void l(int param0) {
        field_X = null;
        field_Z = null;
        field_V = null;
        field_Y = null;
    }

    final static hh a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        hh var5 = null;
        hh stackIn_4_0 = null;
        hh stackIn_8_0 = null;
        hh stackIn_13_0 = null;
        hh stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_7_0 = null;
        hh stackOut_14_0 = null;
        hh stackOut_12_0 = null;
        hh stackOut_3_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param0.length() == 0) {
                  break L1;
                } else {
                  var2_int = param0.indexOf('@');
                  if (var2_int == -1) {
                    stackOut_7_0 = a.field_H;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  } else {
                    var3 = param0.substring(0, var2_int);
                    var4 = param0.substring(var2_int + 1);
                    var5 = j.a(var3, 0);
                    if (var5 == null) {
                      stackOut_14_0 = qc.a(28320, var4);
                      stackIn_15_0 = stackOut_14_0;
                      break L0;
                    } else {
                      stackOut_12_0 = (hh) var5;
                      stackIn_13_0 = stackOut_12_0;
                      return stackIn_13_0;
                    }
                  }
                }
              }
            }
            stackOut_3_0 = pi.field_b;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2;
            stackOut_16_1 = new StringBuilder().append("vd.DA(");
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
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + 119 + ')');
        }
        return stackIn_15_0;
    }

    final void e(int param0) {
        super.e(param0);
        if (null != ((vd) this).field_U) {
            ((vd) this).field_U.b(false);
        }
    }

    final void a(le param0, byte param1) {
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
              ((vd) this).field_U = param0;
              if (param1 > 124) {
                break L1;
              } else {
                field_X = null;
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
            stackOut_3_1 = new StringBuilder().append("vd.W(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public final le a(int param0) {
        if (param0 != -1) {
            return null;
        }
        return ((vd) this).field_U;
    }

    final void a(int param0, int param1, fi param2, int param3) {
        super.a(param0, 114, param2, param3);
        if (param1 < 113) {
            return;
        }
        try {
            ((vd) this).field_W = nl.field_u - (((vd) this).field_l + param0);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "vd.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "This password contains repeated characters, and would be easy to guess";
        field_X = null;
    }
}
