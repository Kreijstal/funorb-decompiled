/*
 * Decompiled by CFR-JS 0.4.0.
 */
class haa extends rj {
    static nh field_z;
    static jpa field_A;
    private ae field_B;
    static int[][] field_C;

    final boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.field_B = (ae) null;
          }
          stackIn_3_0 = this.field_B.a(param0, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("haa.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    haa(ae param0) {
        try {
          this.field_B = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "haa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        if (param0 > 37) {
          field_C = (int[][]) null;
          field_A = null;
          field_z = null;
          return;
        }
        field_A = (jpa) null;
        field_C = (int[][]) null;
        field_A = null;
        field_z = null;
    }

    static {
        field_C = new int[][]{new int[]{3, 4, 5, 6}, new int[]{2, 3}};
    }
}
