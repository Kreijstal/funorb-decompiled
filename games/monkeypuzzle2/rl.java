/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl {
    static float[][] field_c;
    static int field_a;
    static double field_b;

    final static tb a(int param0, byte[] param1) {
        tb var2 = null;
        RuntimeException var2_ref = null;
        tb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var2 = new tb(param1, qc.field_P, mb.field_b, da.field_c, ra.field_ab, fk.field_d, cb.field_b);
                gb.a(param0 + 32415);
                if (param0 == -32466) {
                  break L1;
                } else {
                  field_c = (float[][]) null;
                  break L1;
                }
              }
              stackIn_6_0 = (tb) (var2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("rl.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(int param0) {
        field_c = (float[][]) null;
        int var1 = -12 / ((param0 - -37) / 44);
    }

    static {
        field_c = new float[][]{new float[]{4.0f, 800.0f}, new float[]{110.0f, 800.0f}, new float[]{144.0f, 800.0f}, new float[]{202.0f, 800.0f}, new float[]{212.0f, 800.0f}, new float[]{295.0f, 800.0f}, new float[]{326.0f, 800.0f}, new float[]{369.0f, 800.0f}, new float[]{387.0f, 800.0f}, new float[]{495.0f, 800.0f}, new float[]{525.0f, 800.0f}, new float[]{606.0f, 800.0f}};
        field_b = Math.atan2(1.0, 0.0);
    }
}
