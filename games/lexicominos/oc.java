/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    static boolean field_b;
    static int[] field_a;
    static int field_e;
    static int field_c;
    static jb[] field_d;

    final static jb[] a(sh param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        jb[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 20) {
                break L1;
              } else {
                oc.a(-29);
                break L1;
              }
            }
            if (nb.a(param2, param1, (byte) 125, param0)) {
              stackIn_6_0 = ti.a((byte) 108);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("oc.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jb[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(int param0) {
        int var1 = -2 % ((param0 - 11) / 49);
        field_d = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = false;
        field_e = 256;
        field_c = 20;
    }
}
