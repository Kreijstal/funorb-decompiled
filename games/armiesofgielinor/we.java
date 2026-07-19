/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    static je[] field_g;
    int field_d;
    String field_j;
    static String field_h;
    static byte[] field_a;
    String field_b;
    kl field_c;
    static je field_f;
    static String field_i;
    String field_e;

    public static void a(byte param0) {
        char discarded$2 = 0;
        if (param0 != 120) {
          discarded$2 = we.a(2, (byte) 125);
          field_g = null;
          field_f = null;
          field_h = null;
          field_i = null;
          field_a = null;
          return;
        } else {
          field_g = null;
          field_f = null;
          field_h = null;
          field_i = null;
          field_a = null;
          return;
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static wp a(int param0, boolean param1) {
        fd var2 = null;
        int var3 = 0;
        at stackIn_4_0 = null;
        at stackIn_5_0 = null;
        at stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        at stackOut_3_0 = null;
        at stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        at stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        if (null != bk.field_e) {
          L0: {
            stackOut_3_0 = bk.field_e;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (param1) {
              stackOut_5_0 = (at) ((Object) stackIn_5_0);
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L0;
            } else {
              stackOut_4_0 = (at) ((Object) stackIn_4_0);
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L0;
            }
          }
          if (((at) (Object) stackIn_6_0).b(stackIn_6_1 != 0) != 0) {
            if (param1) {
              var2 = (fd) ((Object) bk.field_e.e((byte) 109));
              L1: while (true) {
                if (var2 != null) {
                  var3 = var2.field_k;
                  if (var3 == param0) {
                    return var2.field_p;
                  } else {
                    var2 = (fd) ((Object) bk.field_e.a((byte) 123));
                    continue L1;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return (wp) null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static te a(int param0, int param1, sn param2) {
        RuntimeException var3 = null;
        te stackIn_2_0 = null;
        te stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        te stackOut_3_0 = null;
        te stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == 100) {
              stackOut_3_0 = ne.a(param0 + -145, aa.a(param2, 100, param1));
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (te) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("we.A(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static char a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 255 & param1;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        } else {
          if (param0 <= -115) {
            if (-129 >= (var2 ^ -1)) {
              if ((var2 ^ -1) <= -161) {
                return (char)var2;
              } else {
                L0: {
                  var3 = ou.field_a[var2 + -128];
                  if (var3 == 0) {
                    var3 = 63;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var2 = var3;
                return (char)var2;
              }
            } else {
              return (char)var2;
            }
          } else {
            return 'ﾍ';
          }
        }
    }

    private we() throws Throwable {
        throw new Error();
    }

    static {
        field_a = new byte[]{(byte)65, (byte)79, (byte)71, (byte)2};
        field_h = "Toughest unit";
        field_i = "Suggested names: ";
    }
}
