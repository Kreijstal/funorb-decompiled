/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ow {
    static String[] field_f;
    static String[] field_d;
    static int[] field_c;
    static String field_e;
    static qb field_b;
    static String field_a;

    abstract int a(int param0, int param1);

    abstract kl a(int param0);

    abstract byte[] b(int param0, int param1);

    final static ut a(sj param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        ut stackIn_5_0 = null;
        ut stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!cu.a(param3, param0, param1, 101)) {
            return null;
          }
          if (param2 > 4) {
            stackIn_7_0 = oc.c((byte) 75);
            return stackIn_7_0;
          }
          stackIn_5_0 = (ut) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ow.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
          return;
        }
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
        field_e = null;
    }

    static {
        field_f = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_c = new int[]{2, 4, 6, 8, 16};
        field_a = "live feed";
    }
}
