/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class l {
    static u field_b;
    static String field_c;
    static String field_a;
    static db field_d;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 != -101) {
            field_c = (String) null;
        }
    }

    final static byte[] a(byte param0, boolean param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        qb var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 110) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            if (param2 != null) {
              if (param2 instanceof byte[]) {
                var3 = (byte[]) (param2);
                if (param1) {
                  stackIn_11_0 = sm.a(30, var3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_9_0 = (byte[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (!(param2 instanceof qb)) {
                  throw new IllegalArgumentException();
                } else {
                  var4 = (qb) (param2);
                  stackIn_14_0 = var4.a(78);
                  decompiledRegionSelector0 = 3;
                  break L0;
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
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("l.K(").append(param0).append(',').append(param1).append(',');

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
          throw dn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
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
              return stackIn_14_0;
            }
          }
        }
    }

    abstract l b(byte param0);

    void c(byte param0) {
        if (param0 < 123) {
            this.c((byte) 2);
        }
    }

    abstract l a(int param0);

    static {
        field_c = "Three-Player Puzzles";
        field_b = new u();
        field_a = "Loading extra data";
    }
}
