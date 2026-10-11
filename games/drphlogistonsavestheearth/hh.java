/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh {
    static bb field_b;
    static he[] field_d;
    static he[] field_c;
    static li field_e;
    static int[] field_a;

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (!param0) {
          field_c = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        hh.a(-87, (CharSequence) null);
        field_c = null;
    }

    final static int a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 10) {
            field_c = (he[]) null;
          }
          stackIn_3_0 = fj.a(10, param1, 124, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("hh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_d = new he[9];
        field_b = new bb();
        field_e = null;
        field_a = new int[75];
    }
}
