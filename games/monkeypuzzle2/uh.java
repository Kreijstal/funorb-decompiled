/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends ug {
    static lg field_e;

    final static float[] a(float[] param0, float param1, byte param2) {
        float[] var3 = null;
        RuntimeException var3_ref = null;
        float[] var4 = null;
        float[] var5 = null;
        float[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 >= 13) {
                break L1;
              } else {
                var4 = (float[]) null;
                uh.a((float[]) null, -2.973829984664917f, (byte) 31);
                break L1;
              }
            }
            var5 = new float[2];
            var3 = var5;
            var5[0] = param0[0] * param1;
            var5[1] = param1 * param0[1];
            stackIn_3_0 = (float[]) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("uh.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(byte param0, int param1) {
        if (pg.field_d.length <= param1) {
          return;
        } else {
          if ((param1 ^ -1) <= -1) {
            if (param0 >= -87) {
              field_e = (lg) null;
              pg.field_d[param1].field_e = param1;
              return;
            } else {
              pg.field_d[param1].field_e = param1;
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        if (!param0) {
            uh.a((byte) -56, -98);
        }
    }

    private uh() throws Throwable {
        throw new Error();
    }

    static {
    }
}
