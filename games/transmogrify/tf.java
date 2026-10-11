/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    int field_b;
    static int field_a;
    int field_c;

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        am var4 = null;
        o var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        try {
          var4 = (am) (ec.field_b.a((byte) -95));
          while (var4 != null) {
            ei.a(true, param0, var4);
            var4 = (am) (ec.field_b.a(true));
          }
          if (param1) {
            tf.a(-55, false);
          }
          var5 = (o) (mh.field_a.a((byte) -95));
          while (var5 != null) {
            nk.a(param0, var5, -31995);
            var5 = (o) (mh.field_a.a(true));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var2), "tf.B(" + param0 + ',' + param1 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, boolean param1, int param2) {
        int stackIn_65_0 = 0;
        int stackIn_68_0 = 0;
        String[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        String stackIn_76_2 = null;
        String[] stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        int stackIn_80_3 = 0;
        String stackIn_83_2 = null;
        String stackIn_89_0 = null;
        boolean stackIn_89_1 = false;
        boolean stackIn_90_2 = false;
        int stackIn_113_0 = 0;
        int stackIn_114_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          ej.field_n = true;
          q.field_a = param2;
          if (q.field_a == 0) {
            var3_int = vd.a(nc.field_r, gd.field_m, qi.field_b, ce.field_b, (byte) 110);
            var4 = 3 + var3_int;
            ce.field_a = new int[var4];
            qb.field_f = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              ce.field_a[var5] = -1;
            }
            uj.field_d = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              qb.field_f[var5] = nc.field_r[var5];
            }
            qb.field_f[-3 + var4] = "";
            qb.field_f[var4 - 2] = vg.field_g;
            ce.field_a[var4 - 2] = 0;
            uj.field_d[0] = 4;
            qb.field_f[var4 - 1] = oe.field_a;
            ce.field_a[-1 + var4] = 1;
            uj.field_d[1] = 5;
          } else if (1 == q.field_a) {
            var3_int = vd.a(nc.field_r, gd.field_m, qi.field_b, ce.field_b, (byte) -103);
            var4 = var3_int + 2;
            qb.field_f = new String[var4];
            ce.field_a = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              ce.field_a[var5] = -1;
            }
            uj.field_d = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              qb.field_f[var5] = nc.field_r[var5];
            }
            qb.field_f[-2 + var4] = "";
            qb.field_f[var4 - 1] = oe.field_a;
            ce.field_a[-1 + var4] = 0;
            uj.field_d[0] = 5;
          } else if (q.field_a != 2) {
            if (q.field_a == 3) {
              if (!lk.field_b.field_e) {
                var3_int = vd.a(nc.field_r, gd.field_m, nh.field_m, ce.field_b, (byte) -103);
              } else {
                var3_int = vd.a(nc.field_r, gd.field_m, e.field_x, ce.field_b, (byte) -118);
              }
              var4 = 2 + var3_int;
              ce.field_a = new int[var4];
              qb.field_f = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                ce.field_a[var5] = -1;
              }
              uj.field_d = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                qb.field_f[var5] = nc.field_r[var5];
              }
              qb.field_f[-2 + var4] = "";
              qb.field_f[-1 + var4] = oe.field_a;
              ce.field_a[-1 + var4] = 0;
              uj.field_d[0] = 5;
            } else if (4 == q.field_a) {
              var3_int = vd.a(nc.field_r, gd.field_m, n.field_b, ce.field_b, (byte) -111);
              var4 = 2 + var3_int;
              qb.field_f = new String[var4];
              ce.field_a = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                ce.field_a[var5] = -1;
              }
              uj.field_d = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                qb.field_f[var5] = nc.field_r[var5];
              }
              qb.field_f[-2 + var4] = "";
              qb.field_f[-1 + var4] = oe.field_a;
              ce.field_a[-1 + var4] = 0;
              uj.field_d[0] = 5;
            } else {
              if (5 != q.field_a) {
                throw new IllegalArgumentException();
              }
              var3_int = vd.a(nc.field_r, gd.field_m, dg.field_e, ce.field_b, (byte) 71);
              var4 = 3 + var3_int;
              qb.field_f = new String[var4];
              ce.field_a = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                ce.field_a[var5] = -1;
              }
              uj.field_d = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                qb.field_f[var5] = nc.field_r[var5];
              }
              qb.field_f[-3 + var4] = "";
              qb.field_f[var4 - 2] = pe.field_a;
              ce.field_a[var4 - 2] = 0;
              uj.field_d[0] = 3;
              qb.field_f[-1 + var4] = oe.field_a;
              ce.field_a[var4 - 1] = 1;
              uj.field_d[1] = 5;
            }
          } else {
            var3_int = vd.a(nc.field_r, gd.field_m, ij.a(ef.field_c, new String[]{"<br><%0><br>"}, (byte) -53), ce.field_b, (byte) -80);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(nc.field_r[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            bd.field_p = new String[var4];
            ji.a(nc.field_r, 0, bd.field_p, 0, var4);
            ne.field_a = new String[-1 + var3_int - var4];
            ji.a(nc.field_r, 1 + var4, ne.field_a, 0, -1 + (var3_int - var4));
            var4 = -1;
            var3_int = vd.a(nc.field_r, gd.field_m, ij.a(mk.field_C, new String[]{"<br><%0><br>"}, (byte) -46), ce.field_b, (byte) 112);
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(nc.field_r[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            ng.field_i = new String[var4];
            ji.a(nc.field_r, 0, ng.field_i, 0, var4);
            th.field_d = new String[-1 + var3_int - var4];
            ji.a(nc.field_r, var4 + 1, th.field_d, 0, -1 - var4 + var3_int);
            if (ng.field_i.length <= bd.field_p.length) {
              stackIn_65_0 = bd.field_p.length;
            } else {
              stackIn_65_0 = ng.field_i.length;
            }
            var5 = stackIn_65_0;
            if (ne.field_a.length >= th.field_d.length) {
              stackIn_68_0 = ne.field_a.length;
            } else {
              stackIn_68_0 = th.field_d.length;
            }
            var6 = stackIn_68_0;
            var7 = var5 + 7 + var6;
            ce.field_a = new int[var7];
            qb.field_f = new String[var7];
            for (var8 = 0; var7 > var8; var8++) {
              ce.field_a[var8] = -1;
            }
            uj.field_d = new int[2];
            qb.field_f[0] = ab.field_a;
            qb.field_f[1] = wd.field_i;
            ce.field_a[1] = 0;
            ce.field_a[3] = 1;
            qb.field_f[3] = ac.field_h;
            uj.field_d[0] = 5;
            qb.field_f[5] = "";
            uj.field_d[1] = 2;
            qb.field_f[4] = oi.field_j;
            qb.field_f[2] = nj.field_l;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_75_0 = qb.field_f;
              stackIn_75_1 = 6 + var8Lifetime2;
              if (-var5 + ng.field_i.length + var8Lifetime2 >= 0) {
                stackIn_76_2 = ng.field_i[-var5 + (var8Lifetime2 + ng.field_i.length)];
              } else {
                stackIn_76_2 = "";
              }
              stackIn_75_0[stackIn_75_1] = stackIn_76_2;
            }
            qb.field_f[6 + var5] = null;
            ce.field_a[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_80_0 = qb.field_f;
              stackIn_80_1 = 7 - (-var5 - var8Lifetime3);
              stackIn_80_2 = ~th.field_d.length;
              stackIn_80_3 = ~var8Lifetime3;
              if (stackIn_80_2 >= stackIn_80_3) {
                stackIn_83_2 = "";
              } else {
                stackIn_83_2 = th.field_d[var8Lifetime3];
              }
              stackIn_80_0[stackIn_80_1] = stackIn_83_2;
            }
            c.field_c = lk.a(0);
          }
          bk.field_c.field_a = uj.field_d.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < qb.field_f.length; var4Lifetime1++) {
            stackIn_89_0 = qb.field_f[var4Lifetime1];
            stackIn_89_1 = false;
            stackIn_90_2 = !(0 > ce.field_a[var4Lifetime1]);
            var5Lifetime1 = uc.a(stackIn_89_0, stackIn_89_1, stackIn_90_2);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (q.field_a == 2) {
            var10 = bd.field_p;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = uc.a(var11, false, false);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = ne.field_a;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = uc.a(var12, false, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          ic.field_b = wd.field_j - (var3_intLifetime1 >> 1);
          jd.field_a = wd.field_j - (-var3_intLifetime1 + (var3_intLifetime1 >> 1));
          mf.field_d = (ee.field_D + jl.field_o << 1) * bk.field_c.field_a;
          for (var4Lifetime2 = 0; var4Lifetime2 < qb.field_f.length; var4Lifetime2++) {
            stackIn_113_0 = mf.field_d;
            if (ce.field_a[var4Lifetime2] >= 0) {
              stackIn_114_1 = hi.field_c;
            } else {
              stackIn_114_1 = fi.field_x;
            }
            mf.field_d = stackIn_113_0 + stackIn_114_1;
          }
          qa.field_u = -(mf.field_d >> 1) + lb.field_j;
          if (param0 <= 33) {
            return;
          }
          jj.field_c = new int[qb.field_f.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = qa.field_u;
          while (qb.field_f.length > var4Lifetime3) {
            var6Lifetime1 = ce.field_a[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = uc.a(qb.field_f[var4Lifetime3], false, true);
              var5Lifetime3 = var5Lifetime3 + ee.field_D;
              var8Lifetime1 = -(var7Lifetime2 >> 1) + wd.field_j;
              jj.field_c[var4Lifetime3] = new int[4];
              jj.field_c[var4Lifetime3][0] = var8Lifetime1 - vh.field_m;
              jj.field_c[var4Lifetime3][1] = var5Lifetime3;
              jj.field_c[var4Lifetime3][2] = (vh.field_m << 1) + var7Lifetime2;
              var5Lifetime3 = var5Lifetime3 + (ee.field_D + (jl.field_o << 1) + hi.field_c);
              jj.field_c[var4Lifetime3][3] = hi.field_c + (jl.field_o << 1);
            } else {
              var5Lifetime3 = var5Lifetime3 + fi.field_x;
            }
            var4Lifetime3++;
          }
          if (q.field_a != 2) {
            bk.field_c.a(tl.a(196077633, oa.field_j, bk.field_a), 0, (byte) -104, param1);
          } else {
            bk.field_c.a(-1, -1, (byte) 124, param1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var3), "tf.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    tf(int param0, int param1, int param2, int param3) {
        this.field_c = param0;
        this.field_b = param3;
    }

    static {
    }
}
