/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gl extends pk implements fca, ufa {
    static String field_g;
    sh field_e;
    static String field_f;

    final static boolean a(int param0, String param1) {
        return null != bna.b(-56, param1);
    }

    public final void a(lka param0, int param1) {
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
              if (param1 == 0) {
                break L1;
              } else {
                field_g = null;
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
            stackOut_3_1 = new StringBuilder().append("gl.G(");
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
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final String d(byte param0) {
        NumberFormatException numberFormatException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var2_int = ((gl) this).field_e.d((byte) 112);
              var3 = ((gl) this).field_e.f((byte) 99);
              var4 = ((gl) this).field_e.j(-1);
              var5 = kja.a(27168);
              if (1890 > var4) {
                break L1;
              } else {
                if (-3 + var5 >= var4) {
                  if (!jp.a(var4, var3, (byte) 85, var2_int)) {
                    L2: {
                      if (param0 > 97) {
                        break L2;
                      } else {
                        field_g = null;
                        break L2;
                      }
                    }
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = lga.a(true, new String[2], vo.field_c);
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            numberFormatException = (NumberFormatException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        return eb.field_s;
    }

    public gl() {
    }

    public static void d(int param0) {
        field_f = null;
        field_g = null;
        if (param0 > -1) {
            field_f = null;
        }
    }

    public final boolean b(byte param0) {
        if (param0 != 5) {
          gl.d(97);
          return ((gl) this).field_e.k(param0 ^ -81);
        } else {
          return ((gl) this).field_e.k(param0 ^ -81);
        }
    }

    final jg c(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        jg stackIn_5_0 = null;
        jg stackIn_9_0 = null;
        jg stackIn_13_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        jg stackOut_4_0 = null;
        jg stackOut_8_0 = null;
        jg stackOut_12_0 = null;
        try {
          L0: {
            L1: {
              var2_int = ((gl) this).field_e.d((byte) 107);
              var3 = ((gl) this).field_e.f((byte) 73);
              var4 = ((gl) this).field_e.j(param0 + -36);
              if (param0 == 35) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            var5 = kja.a(27168);
            if (var4 < 1890) {
              stackOut_4_0 = jt.field_f;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              if (var5 - 3 < var4) {
                stackOut_8_0 = jt.field_f;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              } else {
                if (!jp.a(var4, var3, (byte) 91, var2_int)) {
                  stackOut_12_0 = jt.field_f;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return jt.field_f;
        }
        if (decompiledRegionSelector0 == 0) {
          return cm.field_u;
        } else {
          return stackIn_13_0;
        }
    }

    public final void a(lka param0, byte param1) {
        try {
            int var3_int = -85 / (param1 / 49);
            ((gl) this).a(574);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "gl.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Remove <%0> from friend list";
        field_f = "You have not yet unlocked this option for use.";
    }
}
