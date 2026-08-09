/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends na {
    static int field_f;
    static String field_e;

    final gf a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        gf stackIn_2_0 = null;
        gf stackIn_5_0 = null;
        gf stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (CharSequence) ((Object) param1);
            if (jf.a(param0 ^ -13159, var4)) {
              var5 = (CharSequence) ((Object) param1);
              var3_int = no.a((byte) -128, var5);
              if (param0 == 26) {
                L1: {
                  if (-1 <= (var3_int ^ -1)) {
                    break L1;
                  } else {
                    if ((var3_int ^ -1) < -131) {
                      break L1;
                    } else {
                      return qe.field_a;
                    }
                  }
                }
                stackIn_10_0 = qr.field_e;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = (gf) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = qr.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("jc.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    jc(dh param0) {
        super(param0);
    }

    public static void c(byte param0) {
        field_e = null;
        int var1 = 5 % ((param0 - -18) / 53);
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a((byte) 26, param1) == qr.field_e) {
              stackIn_3_0 = gn.field_g;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != 0) {
                jc.b(true);
                stackIn_7_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("jc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (String) ((Object) stackIn_7_0);
        }
    }

    final static int b(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = 0;
              var2 = 0;
              if (param0) {
                break L1;
              } else {
                field_f = 118;
                break L1;
              }
            }
            L2: while (true) {
              if (var2 >= aa.field_a.length) {
                stackIn_11_0 = var1_int;
                break L0;
              } else {
                if (aa.field_a[var2] != null) {
                  L3: {
                    if (aa.field_a[var2].field_Q != 0) {
                      var1_int++;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var2++;
                  continue L2;
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "jc.A(" + param0 + ')');
        }
        return stackIn_11_0;
    }

    static {
        field_f = 0;
        field_e = "Go Back";
    }
}
