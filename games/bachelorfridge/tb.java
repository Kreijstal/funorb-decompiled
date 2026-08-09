/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb {
    static eaa field_c;
    static java.awt.Font field_b;
    static String field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != -7778) {
            field_a = (String) null;
            field_a = null;
            field_c = null;
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static byte[] a(boolean param0, byte param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        nu var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 57) {
                break L1;
              } else {
                field_b = (java.awt.Font) null;
                break L1;
              }
            }
            if (param2 != null) {
              if (param2 instanceof byte[]) {
                var3 = (byte[]) (param2);
                if (param0) {
                  stackIn_11_0 = gs.a((byte) 120, var3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_9_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (param2 instanceof nu) {
                  var4 = (nu) (param2);
                  stackIn_15_0 = var4.a(false);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  throw new IllegalArgumentException();
                }
              }
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("tb.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    static {
        field_c = new eaa();
        field_a = "Names should contain a maximum of 12 characters";
    }
}
