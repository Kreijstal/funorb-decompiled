/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends km {
    private km field_Eb;
    private int[] field_Kb;
    private int field_Ib;
    private int field_Pb;
    private int field_Lb;
    private int field_Fb;
    private km field_Hb;
    static dl field_Ob;
    private mg[] field_Jb;
    private int field_Qb;
    private int field_Mb;
    private int field_Nb;
    private hk[] field_Gb;

    final static void a(java.awt.Component param0, boolean param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) pm.field_l);
        if (param1) {
            Object var3 = null;
            ga.a((java.awt.Component) null, true);
        }
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) pm.field_l);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) pm.field_l);
    }

    final int b(boolean param0, byte param1) {
        int var4 = Virogrid.field_F ? 1 : 0;
        ((ga) this).a(param0, (byte) 98);
        if (!param0) {
            return -2;
        }
        int var3 = 0;
        if (param1 != -89) {
            int discarded$0 = ((ga) this).b(true, (byte) -14);
        }
        while (((ga) this).field_Qb > var3) {
            if (!(((ga) this).field_Gb[var3].field_nb == 0)) {
                return ((ga) this).field_Kb[var3];
            }
            var3++;
        }
        if (!(oi.field_g == 0)) {
            return -1;
        }
        return ((ga) this).field_Nb;
    }

    public static void i(int param0) {
        field_Ob = null;
        if (param0 >= -47) {
            field_Ob = null;
        }
    }

    final boolean g(int param0) {
        if (!(((ga) this).field_Nb == -2)) {
            return false;
        }
        if (param0 > -34) {
            ((ga) this).field_Kb = null;
        }
        if (-14 != (um.field_Gb ^ -1)) {
            return true;
        }
        ((ga) this).field_Nb = -1;
        return true;
    }

    final void a(int param0, String param1, int param2) {
        ((ga) this).field_Gb[((ga) this).field_Qb] = new hk(0L, (km) null, (km) null, ((ga) this).field_Eb, (mg) null, param1);
        ((ga) this).field_Gb[((ga) this).field_Qb].field_x = ((ga) this).field_Jb;
        ((ga) this).field_Gb[((ga) this).field_Qb].field_ib = true;
        ((ga) this).field_Gb[((ga) this).field_Qb].field_D = param0;
        ((ga) this).a(param0 ^ 1, (km) (Object) ((ga) this).field_Gb[((ga) this).field_Qb]);
        ((ga) this).field_Kb[((ga) this).field_Qb] = param2;
        ((ga) this).field_Qb = ((ga) this).field_Qb + 1;
    }

    final void a(String param0, byte param1, int param2, mg param3) {
        ((ga) this).field_Gb[((ga) this).field_Qb] = new hk(0L, (km) null, (km) null, ((ga) this).field_Eb, param3, param0);
        ((ga) this).field_Gb[((ga) this).field_Qb].field_x = ((ga) this).field_Jb;
        ((ga) this).field_Gb[((ga) this).field_Qb].field_ib = true;
        ((ga) this).field_Gb[((ga) this).field_Qb].field_D = 1;
        ((ga) this).a(param1 + -89, (km) (Object) ((ga) this).field_Gb[((ga) this).field_Qb]);
        ((ga) this).field_Kb[((ga) this).field_Qb] = param2;
        ((ga) this).field_Qb = ((ga) this).field_Qb + 1;
        if (param1 != 89) {
            ((ga) this).field_Fb = -30;
        }
    }

    final static boolean h(int param0) {
        if (param0 != -20940) {
            Object var2 = null;
            ga.a((java.awt.Component) null, false);
        }
        return ql.field_q.a((byte) 19);
    }

    ga(km param0, mg[] param1, km param2, km param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        ((ga) this).field_Nb = -2;
        ((ga) this).field_Kb = new int[256];
        ((ga) this).field_Gb = new hk[256];
        ((ga) this).field_Jb = param1;
        ((ga) this).field_Mb = param8;
        ((ga) this).field_Ib = param5;
        ((ga) this).field_Pb = param7;
        ((ga) this).field_Hb = param2;
        ((ga) this).field_Fb = param4;
        ((ga) this).field_Eb = param3;
        ((ga) this).field_Lb = param6;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Virogrid.field_F ? 1 : 0;
          if (-1 == (((ga) this).field_Qb ^ -1)) {
            ((ga) this).field_Gb[((ga) this).field_Qb] = new hk(0L, (km) null, (km) null, ((ga) this).field_Hb, (mg) null, cg.field_a);
            ((ga) this).field_Gb[((ga) this).field_Qb].field_D = 1;
            ((ga) this).a(0, (km) (Object) ((ga) this).field_Gb[((ga) this).field_Qb]);
            ((ga) this).field_Kb[((ga) this).field_Qb] = -1;
            ((ga) this).field_Qb = ((ga) this).field_Qb + 1;
            break L0;
          } else {
            break L0;
          }
        }
        var6 = 0;
        var7 = param1;
        L1: while (true) {
          if (var7 >= ((ga) this).field_Qb) {
            var6 = var6 + 2 * ((ga) this).field_Fb;
            var7 = ((ga) this).field_Mb * ((ga) this).field_Qb + ((ga) this).field_Pb - -((ga) this).field_Pb;
            var8 = sh.b(0, param2, param3, var6);
            var9 = p.a(-1, var7, param4, param0);
            ((ga) this).a(var8, var7, var6, (byte) -87, var9);
            var10 = 0;
            L2: while (true) {
              if (var10 >= ((ga) this).field_Qb) {
                return;
              } else {
                ((ga) this).field_Gb[var10].a(-(2 * ((ga) this).field_Fb) + var6, ((ga) this).field_Fb, 2, var10 * ((ga) this).field_Mb + ((ga) this).field_Pb, ((ga) this).field_Lb, ((ga) this).field_Mb, ((ga) this).field_Ib);
                var10++;
                continue L2;
              }
            }
          } else {
            var8 = ((ga) this).field_Gb[var7].c(-89, ((ga) this).field_Lb, ((ga) this).field_Ib);
            if (var6 < var8) {
              var6 = var8;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    ga(ga param0) {
        this((km) (Object) param0, param0.field_Jb, param0.field_Hb, param0.field_Eb, param0.field_Fb, param0.field_Ib, param0.field_Lb, param0.field_Pb, param0.field_Mb);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ob = new dl();
    }
}
