/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends ug {
    static lg field_e;

    final static float[] a(float[] param0, float param1, byte param2) {
        float[] var3 = null;
        Object var4 = null;
        float[] var5 = null;
        if (param2 < 13) {
          var4 = null;
          float[] discarded$1 = uh.a((float[]) null, -2.973829984664917f, (byte) 31);
          var5 = new float[2];
          var3 = var5;
          var5[0] = param0[0] * param1;
          var5[1] = param1 * param0[1];
          return var5;
        } else {
          var5 = new float[2];
          var3 = var5;
          var5[0] = param0[0] * param1;
          var5[1] = param1 * param0[1];
          return var5;
        }
    }

    final static void a(byte param0, int param1) {
        if (pg.field_d.length <= param1) {
          return;
        } else {
          if ((param1 ^ -1) <= -1) {
            if (param0 >= -87) {
              field_e = null;
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
