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
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 20) {
            oc.a(-29);
          }
          if (nb.a(param2, param1, (byte) 125, param0)) {
            stackIn_6_0 = ti.a((byte) 108);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (jb[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("oc.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
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
