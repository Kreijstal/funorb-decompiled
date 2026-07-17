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

    public static void a() {
        field_g = null;
        field_f = null;
        field_h = null;
        field_i = null;
        field_a = null;
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static wp a(int param0) {
        fd var2 = null;
        int var3 = 0;
        if (null != bk.field_e) {
          if (bk.field_e.b(false) != 0) {
            var2 = (fd) (Object) bk.field_e.e((byte) 109);
            L0: while (true) {
              if (var2 != null) {
                var3 = var2.field_k;
                if (var3 == param0) {
                  return var2.field_p;
                } else {
                  var2 = (fd) (Object) bk.field_e.a((byte) 123);
                  continue L0;
                }
              } else {
                return null;
              }
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
        te stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        te stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = ne.a(-45, aa.a(param2, 100, param1));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("we.A(").append(100).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final static char a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 255 & param1;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        } else {
          if (param0 <= -115) {
            if (var2 >= 128) {
              if (var2 >= 160) {
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[]{(byte) 65, (byte) 79, (byte) 71, (byte) 2};
        field_h = "Toughest unit";
        field_i = "Suggested names: ";
    }
}
