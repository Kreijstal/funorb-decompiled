/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class st extends ie {
    static mm field_z;
    static String field_B;

    final void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        jh var7 = null;
        super.a(param0, param1, param2, param3, param4, param5);
        var7 = gt.field_gb;
        if (var7 != null) {
          if (((st) this).b(param4, -1, param2, param3, param5)) {
            if (!(((st) this).field_o instanceof sf)) {
              if (!(var7.field_o instanceof sf)) {
                return;
              } else {
                ((sf) (Object) var7.field_o).a(var7, (st) this, 20302);
                gt.field_gb = null;
                return;
              }
            } else {
              ((sf) (Object) ((st) this).field_o).a(var7, (st) this, 20302);
              gt.field_gb = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private st(int param0, int param1, int param2, int param3, mh param4, qm param5, pk param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((st) this).field_y = param6;
    }

    public static void a(byte param0) {
        field_z = null;
        if (param0 < 111) {
            return;
        }
        field_B = null;
    }

    final static float a(int param0, float[] param1, float[] param2) {
        int var3 = -42 % ((14 - param0) / 55);
        return param2[0] * param1[0] + param1[1] * param2[1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new mm();
    }
}
