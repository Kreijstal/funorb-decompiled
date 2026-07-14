/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gga extends mc {
    private gga(int param0, int param1, int param2, int param3, wwa param4, sba param5, shb param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((gga) this).field_t = param6;
    }

    final void a(byte param0, int param1, int param2, int param3, shb param4, int param5) {
        int var8 = 0;
        ef var9 = null;
        super.a((byte) -124, param1, param2, param3, param4, param5);
        var9 = lb.field_p;
        var8 = 123 % ((52 - param0) / 52);
        if (var9 != null) {
          if (((gga) this).a(param2, param1, param5, param3, (byte) 22)) {
            if (!(((gga) this).field_l instanceof ol)) {
              if (!(var9.field_l instanceof ol)) {
                return;
              } else {
                ((ol) (Object) var9.field_l).a((byte) -70, var9, (gga) this);
                lb.field_p = null;
                return;
              }
            } else {
              ((ol) (Object) ((gga) this).field_l).a((byte) -70, var9, (gga) this);
              lb.field_p = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
    }
}
