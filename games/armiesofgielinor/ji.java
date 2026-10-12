/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static String field_a;
    static String field_b;
    static int[] field_c;

    final static wd a(int param0, String param1) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        wd stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_c = (int[]) null;
          }
          if (mh.field_b == du.field_d) {
            stackIn_4_0 = null;
            return (wd) (stackIn_4_0);
          }
          if (mh.field_b == lm.field_d &&
            param1.equals(jh.field_j)) {
            mh.field_b = nb.field_i;
            stackIn_11_0 = vl.field_k;
            return stackIn_11_0;
          }
          jh.field_j = param1;
          mh.field_b = du.field_d;
          vl.field_k = null;
          stackIn_9_0 = null;
          return (wd) (stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ji.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static lk a(boolean param0) {
        if (param0) {
          if (VertexNormal.field_f == null) {
            VertexNormal.field_f = new lk(gl.field_e, 20, 0, 0, 0, 11579568, -1, 0, 0, gl.field_e.field_H, -1, 2147483647, true);
          }
          return VertexNormal.field_f;
        }
        ji.a(false);
        if (VertexNormal.field_f == null) {
          VertexNormal.field_f = new lk(gl.field_e, 20, 0, 0, 0, 11579568, -1, 0, 0, gl.field_e.field_H, -1, 2147483647, true);
        }
        return VertexNormal.field_f;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 0) {
          field_b = (String) null;
        }
    }

    static {
        field_a = "This item can only be used on your own units.";
        field_b = "Set up new game";
        field_c = new int[8192];
    }
}
