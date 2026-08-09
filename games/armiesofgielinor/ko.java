/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    String field_f;
    static int field_e;
    boolean field_d;
    String field_c;
    static wk field_g;
    static int field_b;
    static String field_a;

    public static void a(boolean param0) {
        field_a = null;
        field_g = null;
        if (param0) {
            Object var2 = (Object) null;
            ko.a(false, -124, (Object) null);
        }
    }

    final static byte[] a(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        mg var5 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != null) {
              if (!(param2 instanceof byte[])) {
                if (param2 instanceof mg) {
                  var5 = (mg) (param2);
                  stackIn_12_0 = var5.a(0);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L1: {
                    if (param1 >= 30) {
                      break L1;
                    } else {
                      var4 = (Object) null;
                      ko.a(false, 22, (Object) null);
                      break L1;
                    }
                  }
                  throw new IllegalArgumentException();
                }
              } else {
                var3 = (byte[]) (param2);
                if (param0) {
                  stackIn_8_0 = kj.a(var3, 31732);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_6_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("ko.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_12_0;
            }
          }
        }
    }

    static {
        field_g = new wk(56, 56);
        field_b = 0;
        field_a = "Player";
    }
}
