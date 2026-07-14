/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends rqa {
    final nc a(nc[] param0, int param1) {
        if (param1 > -119) {
            return null;
        }
        return new nc((Object) (Object) frb.a(105, 97));
    }

    final static int e(byte param0) {
        if (2 > ef.field_z) {
            return 0;
        }
        if (ahb.field_p == 0) {
            if (!(btb.field_b.b((byte) 94))) {
                return 20;
            }
            if (!btb.field_b.a(32171, "commonui")) {
                return 40;
            }
            if (!(dt.field_o.b((byte) -97))) {
                return 50;
            }
            if (!(dt.field_o.a(32171, "commonui"))) {
                return 60;
            }
            if (!(gdb.field_i.b((byte) 127))) {
                return 70;
            }
            // ifne L283
            return 80;
        }
        if (!(ppb.field_a == null)) {
            if (!(ppb.field_a.b((byte) -118))) {
                return 14;
            }
            if (!(ppb.field_a.a(true, ""))) {
                return 29;
            }
            if (!(ppb.field_a.a(32171, ""))) {
                return 29;
            }
        }
        if (!btb.field_b.b((byte) -47)) {
            return 43;
        }
        if (!btb.field_b.a(32171, "commonui")) {
            return 57;
        }
        if (!(dt.field_o.b((byte) 124))) {
            return 71;
        }
        if (!(dt.field_o.a(32171, "commonui"))) {
            return 80;
        }
        if (!(gdb.field_i.b((byte) -103))) {
            return 82;
        }
        if (!(gdb.field_i.a(120))) {
            return 86;
        }
        if (param0 <= 94) {
            return 36;
        }
        return 100;
    }

    bj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(byte param0, asb param1, no param2) {
        int var3 = 0;
        rn var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        Object var11 = null;
        Object var12 = null;
        int[] var16 = null;
        var9 = VoidHunters.field_G;
        var3 = ahb.field_p;
        tra.field_o = new llb(0L, (llb) null);
        if (param1 != null) {
          param1.field_e = false;
          param1.field_h = 0;
          lnb.field_i = new jv(var3, param1, param1);
          usa.field_o = new voa(var3, param1, param1, (rs) (Object) new wk());
          var4 = cqb.d(10);
          if (var4 != null) {
            jka.a(var4, (byte) -111);
            var12 = null;
            wdb.field_Ab = ocb.a(65793, 4020342, 10204, (no) null, 1513239, 8947848, 1513239, 5138823, 65793, 1127256, 0, 65793, 2245737);
            ej.field_a = ocb.a(0, 0, param0 ^ -10239, param2, 0, 0, 0, 0, 0, 0, 16764006, 0, 0);
            jwa.field_k = ocb.a(0, 0, 10204, param2, 0, 0, 0, 0, 0, 0, 16777215, 0, 0);
            var5 = dma.field_g;
            var6 = dma.field_j;
            var16 = dma.field_i;
            ie.field_o = new phb(10, 14);
            ie.field_o.b();
            var8 = 2;
            L0: while (true) {
              if ((var8 ^ -1) <= -8) {
                dma.a(var16, var5, var6);
                tha.field_o = vcb.a(0, jwa.field_k, wdb.field_Ab, ej.field_a, var4);
                if (param0 == -35) {
                  tra.field_o.field_lb = new ij();
                  return;
                } else {
                  return;
                }
              } else {
                dma.d(var8, 1 + var8, 14 + -(var8 << -1434063999), 16777215);
                var8++;
                continue L0;
              }
            }
          } else {
            var11 = null;
            gna.a((Throwable) null, "QC2", 0);
            return;
          }
        } else {
          var10 = null;
          gna.a((Throwable) null, "QC1", 0);
          return;
        }
    }

    static {
    }
}
