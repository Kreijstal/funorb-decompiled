/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static int[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(byte param0) {
        if (param0 >= -28) {
          return false;
        }
        return null != jf.field_a ? true : im.field_e;
    }

    final static GraphicsRenderer a(java.awt.Canvas param0, byte param1, int param2, d param3) {
        RuntimeException var4 = null;
        wl stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 66) {
            field_a = (int[]) null;
          }
          stackIn_3_0 = new wl(param0, param3, param2);
          return (GraphicsRenderer) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("lh.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 2800) {
          field_a = (int[]) null;
        }
    }

    static {
    }
}
