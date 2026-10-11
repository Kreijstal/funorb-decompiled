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
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          var2 = new tb(param1, qc.field_P, mb.field_b, da.field_c, ra.field_ab, fk.field_d, cb.field_b);
          gb.a(param0 + 32415);
          if (param0 != -32466) {
            field_c = (float[][]) null;
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("rl.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = (float[][]) null;
        int var1 = -12 / ((param0 + 37) / 44);
    }

    static {
        field_c = new float[][]{new float[]{4.0f, 800.0f}, new float[]{110.0f, 800.0f}, new float[]{144.0f, 800.0f}, new float[]{202.0f, 800.0f}, new float[]{212.0f, 800.0f}, new float[]{295.0f, 800.0f}, new float[]{326.0f, 800.0f}, new float[]{369.0f, 800.0f}, new float[]{387.0f, 800.0f}, new float[]{495.0f, 800.0f}, new float[]{525.0f, 800.0f}, new float[]{606.0f, 800.0f}};
        field_b = Math.atan2(1.0, 0.0);
    }
}
