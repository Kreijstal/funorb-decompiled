/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    final static void a(int param0, la param1) {
        int var3 = 0;
        int var4 = 0;
        of var5 = null;
        int[] var6 = null;
        int var7 = 0;
        Object var8 = null;
        df var9 = null;
        int var10 = 0;
        df var11 = null;
        var7 = Torquing.field_u;
        var9 = new df(param1.a(-125, "", "logo.fo3d"));
        var11 = var9;
        var3 = var11.i((byte) -101);
        var11.j((byte) -100);
        ha.field_d = pe.a((byte) -59, var11);
        db.field_a = new of[var3];
        eo.field_d = new int[var3][];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3) {
            L1: {
              var11.j(-128);
              if (param0 == 6) {
                break L1;
              } else {
                var8 = null;
                le.a((byte) -43, -40, (qk) null);
                break L1;
              }
            }
            var10 = 0;
            var4 = var10;
            L2: while (true) {
              if (var10 >= var3) {
                return;
              } else {
                var5 = db.field_a[var10];
                var5.a(1, 6, 6, 6, (byte) -123);
                var5.a(32767);
                var6 = new int[]{var5.field_g + var5.field_A >> -187202207, var5.field_H + var5.field_x >> 1688882529, var5.field_p - -var5.field_e >> -288496383};
                eo.field_d[var10] = var6;
                var5.a(-var6[2], (byte) -6, -var6[0], -var6[1]);
                var10++;
                continue L2;
              }
            }
          } else {
            db.field_a[var4] = mh.a(255, var9);
            var4++;
            continue L0;
          }
        }
    }

    final static void a(byte param0, int param1, qk param2) {
        if (param0 < 82) {
            return;
        }
        kc.field_z.a((byte) 54, (q) (Object) param2);
        ii.a(32, param1, param2);
    }

    static {
    }
}
