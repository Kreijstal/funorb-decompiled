/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rr extends o {
    static int field_t;

    final static a a(pf param0, int param1, int param2, int param3) {
        a var5 = null;
        int var6 = 0;
        a var7 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != null) {
          var7 = (a) (Object) param0.d(param3 ^ param3);
          L0: while (true) {
            if (var7 != null) {
              var5 = var7.b(-125, param2, param1);
              if (null != var7.b(-125, param2, param1)) {
                return var5;
              } else {
                var7 = (a) (Object) param0.a((byte) -71);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    rr(nq param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_J, -1, 2147483647, false);
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        if (!(!param2)) {
            rg.a((byte) 93, param0.field_q + param3, param0.field_n, param1 - -param0.field_m, param0.field_x);
        }
        super.a(param0, param1, param2, param3, param4);
    }

    final static boolean a(vd param0, pf param1, byte param2) {
        oh var3 = null;
        vd var4 = null;
        int var5 = 0;
        Object var6 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = param1.d(0);
        L0: while (true) {
          if (var3 == null) {
            if (param2 != 64) {
              var6 = null;
              a discarded$2 = rr.a((pf) null, 76, -63, 75);
              return false;
            } else {
              return false;
            }
          } else {
            var4 = (vd) (Object) var3;
            if (var4.a((byte) -118, param0)) {
              return true;
            } else {
              var3 = param1.a((byte) -71);
              continue L0;
            }
          }
        }
    }

    rr(int param0) {
        this(gn.field_u, param0);
    }

    static {
    }
}
