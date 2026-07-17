/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends ff {
    private byte[] field_s;

    final void a(int param0, byte param1, int param2) {
        int var4 = 2 * param0;
        param1 = (byte)(param2 + ((255 & param1) >> 1));
        int incrementValue$0 = var4;
        var4++;
        ((qb) this).field_s[incrementValue$0] = (byte)param1;
        ((qb) this).field_s[var4] = (byte)param1;
    }

    final byte[] a(int param0, byte param1, int param2, int param3) {
        ((qb) this).field_s = new byte[2 * (param2 * (param3 * param0))];
        ((qb) this).a(param0, param1 + 214, param3, param2);
        if (param1 != -8) {
          return null;
        } else {
          return ((qb) this).field_s;
        }
    }

    qb() {
        super(12, 5, 16, 2, 2, 0.44999998807907104f);
    }

    final static void d() {
        il.field_a = in.field_z;
        oh.field_e = oh.field_e + 1;
        kr.field_e = 3;
        uk.field_ob = true;
        if (!(jl.a(-89))) {
            return;
        }
        int discarded$0 = 0;
        ke.a();
        nv.field_a = 0;
        pd.field_p = un.field_a[0];
        in.field_z = 0;
        jt.field_u = 0;
        gn.a(10, true);
        ag.a(0, 1 + oh.field_e % 5);
    }

    static {
    }
}
