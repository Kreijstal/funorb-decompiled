/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gk extends eg {
    static bg field_s;

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        try {
          if (param4) {
            ng.a(param2.field_q, param2.field_v, param0 - 12153, param1 + param2.field_u, param3 + param2.field_t);
          }
          super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "gk.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static ki b(int param0, int param1) {
        ki var2 = null;
        ki var2Lifetime1;
        if (param1 == 1) {
          var2 = new ki();
          on.field_v.a((byte) 103, var2);
          tc.a(param1 + 0, param0);
          return var2;
        }
        gk.b(-117, -125);
        var2Lifetime1 = new ki();
        on.field_v.a((byte) 103, var2Lifetime1);
        tc.a(param1 + 0, param0);
        return var2Lifetime1;
    }

    public static void a(byte param0) {
        if (param0 > -49) {
          field_s = (bg) null;
          field_s = null;
          return;
        }
        field_s = null;
    }

    gk(int param0) {
        this(bn.field_d, param0);
    }

    gk(we param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_I, -1, 2147483647, false);
    }

    final static lc a(int param0, int param1, int param2, int param3, int param4) {
        lc var5;
        int var6;
        int var7;
        lc var5Lifetime1;
        var7 = MinerDisturbance.field_ab;
        var5 = (lc) (sj.field_g.b(107));
        while (var5 != null) {
          if (~param2 == ~var5.field_q) {
            return var5;
          }
          var5 = (lc) (sj.field_g.b((byte) 56));
        }
        var5Lifetime1 = new lc();
        var5Lifetime1.field_q = param2;
        var5Lifetime1.field_r = param4;
        var5Lifetime1.field_v = param1;
        sj.field_g.a((byte) -94, var5Lifetime1);
        var6 = 51 / ((50 - param3) / 50);
        lc.a((byte) 126, param0, var5Lifetime1);
        return var5Lifetime1;
    }

    static {
        field_s = new bg(0, 2, 2, 1);
    }
}
