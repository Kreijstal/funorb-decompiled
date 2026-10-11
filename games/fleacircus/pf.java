/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    static rh field_b;
    static char[] field_d;
    static dd field_a;
    static cd field_c;

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != 13480) {
          pf.a(40);
        }
    }

    final static java.awt.Frame a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_36_0 = null;
        java.awt.Frame stackIn_39_0 = null;
        java.awt.Frame stackIn_41_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        hf[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        hf[] var10 = null;
        od var11 = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          if (!param3.a(107)) {
            return null;
          }
          if (param5 == 0) {
            var10 = nd.a(true, param3);
            var6 = var10;
            if (var6 == null) {
              stackIn_7_0 = null;
              return (java.awt.Frame) (stackIn_7_0);
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (var10[var8].field_c == param4 &&
                param2 == var10[var8].field_a && ((0 == param1 ||
                var10[var8].field_j == param1) &&
                (var7_int == 0 ||
                !(param5 >= var10[var8].field_i)))) {
                param5 = var10[var8].field_i;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          var11 = param3.a(param4, (byte) -50, param2, param5, param1);
          while (var11.field_b == 0) {
            vh.a(10L, -88);
          }
          var7 = (java.awt.Frame) (var11.field_e);
          if (var7 == null) {
            return null;
          }
          if (var11.field_b == 2) {
            hi.a(param3, var7, (byte) 52);
            stackIn_36_0 = null;
            return (java.awt.Frame) (stackIn_36_0);
          }
          if (param0 == 18316) {
            stackIn_41_0 = var7;
            return stackIn_41_0;
          }
          stackIn_39_0 = (java.awt.Frame) null;
          return stackIn_39_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_44_0 = var6_ref;
          stackIn_44_1 = new StringBuilder().append("pf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((7 & param1) != 0) {
          var2 = -(7 & param1) + 8;
        }
        int var3 = param1 + var2;
        if (param0 > -65) {
          return -9;
        }
        return var3;
    }

    final static void a(int param0, int param1, boolean param2) {
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        String[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String stackIn_40_2 = null;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        String stackIn_47_2 = null;
        int stackIn_90_0 = 0;
        String stackIn_90_1 = null;
        boolean stackIn_91_2 = false;
        int stackIn_115_0 = 0;
        int stackIn_116_1 = 0;
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
        var9 = fleas.field_A ? 1 : 0;
        try {
          vc.field_a = param0;
          d.field_L = true;
          if (vc.field_a == 0) {
            var3_int = nb.a(rh.field_o, vh.field_l, pb.field_e, sc.field_d, 1);
            var4 = var3_int + 3;
            m.field_c = new int[var4];
            fb.field_d = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              m.field_c[var5] = -1;
            }
            em.field_e = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              fb.field_d[var5] = sc.field_d[var5];
            }
            fb.field_d[var4 - 3] = "";
            fb.field_d[-2 + var4] = md.field_M;
            m.field_c[var4 - 2] = 0;
            em.field_e[0] = 4;
            fb.field_d[-1 + var4] = ja.field_O;
            m.field_c[-1 + var4] = 1;
            em.field_e[1] = 5;
          } else if (vc.field_a == 1) {
            var3_int = nb.a(rh.field_o, vh.field_l, pb.field_e, sc.field_d, 1);
            var4 = 2 + var3_int;
            fb.field_d = new String[var4];
            m.field_c = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              m.field_c[var5] = -1;
            }
            em.field_e = new int[1];
            for (var5 = 0; var3_int > var5; var5++) {
              fb.field_d[var5] = sc.field_d[var5];
            }
            fb.field_d[-2 + var4] = "";
            fb.field_d[-1 + var4] = ja.field_O;
            m.field_c[var4 - 1] = 0;
            em.field_e[0] = 5;
          } else if (vc.field_a != 2) {
            if (vc.field_a == 3) {
              if (!fg.field_q.field_e) {
                var3_int = nb.a(sa.field_b, vh.field_l, pb.field_e, sc.field_d, 1);
              } else {
                var3_int = nb.a(aj.field_x, vh.field_l, pb.field_e, sc.field_d, 1);
              }
              var4 = 2 + var3_int;
              m.field_c = new int[var4];
              fb.field_d = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                m.field_c[var5] = -1;
              }
              em.field_e = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                fb.field_d[var5] = sc.field_d[var5];
              }
              fb.field_d[-2 + var4] = "";
              fb.field_d[var4 - 1] = ja.field_O;
              m.field_c[-1 + var4] = 0;
              em.field_e[0] = 5;
            } else if (vc.field_a == 4) {
              var3_int = nb.a(oc.field_c, vh.field_l, pb.field_e, sc.field_d, 1);
              var4 = var3_int + 2;
              fb.field_d = new String[var4];
              m.field_c = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                m.field_c[var5] = -1;
              }
              em.field_e = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                fb.field_d[var5] = sc.field_d[var5];
              }
              fb.field_d[-2 + var4] = "";
              fb.field_d[-1 + var4] = ja.field_O;
              m.field_c[-1 + var4] = 0;
              em.field_e[0] = 5;
            } else {
              if (vc.field_a != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = nb.a(tg.field_a, vh.field_l, pb.field_e, sc.field_d, 1);
              var4 = var3_int + 3;
              m.field_c = new int[var4];
              fb.field_d = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                m.field_c[var5] = -1;
              }
              em.field_e = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                fb.field_d[var5] = sc.field_d[var5];
              }
              fb.field_d[var4 - 3] = "";
              fb.field_d[var4 - 2] = s.field_a;
              m.field_c[var4 - 2] = 0;
              em.field_e[0] = 3;
              fb.field_d[-1 + var4] = ja.field_O;
              m.field_c[-1 + var4] = 1;
              em.field_e[1] = 5;
            }
          } else {
            var3_int = nb.a(db.a(wa.field_q, new String[]{"<br><%0><br>"}, true), vh.field_l, pb.field_e, sc.field_d, 1);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(sc.field_d[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            j.field_o = new String[var4];
            dm.a(sc.field_d, 0, j.field_o, 0, var4);
            oe.field_c = new String[var3_int - (var4 + 1)];
            dm.a(sc.field_d, var4 + 1, oe.field_c, 0, -var4 + (var3_int - 1));
            var4 = -1;
            var3_int = nb.a(db.a(cd.field_g, new String[]{"<br><%0><br>"}, true), vh.field_l, pb.field_e, sc.field_d, 1);
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(sc.field_d[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            uk.field_a = new String[var4];
            dm.a(sc.field_d, 0, uk.field_a, 0, var4);
            rc.field_g = new String[-1 - var4 + var3_int];
            dm.a(sc.field_d, 1 + var4, rc.field_g, 0, -1 - var4 + var3_int);
            if (j.field_o.length >= uk.field_a.length) {
              stackIn_29_0 = j.field_o.length;
            } else {
              stackIn_29_0 = uk.field_a.length;
            }
            var5 = stackIn_29_0;
            if (rc.field_g.length <= oe.field_c.length) {
              stackIn_32_0 = oe.field_c.length;
            } else {
              stackIn_32_0 = rc.field_g.length;
            }
            var6 = stackIn_32_0;
            var7 = 7 + var5 + var6;
            fb.field_d = new String[var7];
            m.field_c = new int[var7];
            for (var8 = 0; var7 > var8; var8++) {
              m.field_c[var8] = -1;
            }
            em.field_e = new int[2];
            m.field_c[1] = 0;
            fb.field_d[1] = ck.field_p;
            fb.field_d[0] = ki.field_e;
            fb.field_d[5] = "";
            m.field_c[3] = 1;
            fb.field_d[2] = cf.field_a;
            fb.field_d[3] = rc.field_h;
            em.field_e[0] = 5;
            em.field_e[1] = 2;
            fb.field_d[4] = ib.field_d;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_39_0 = fb.field_d;
              stackIn_39_1 = var8Lifetime2 + 6;
              if (-var5 + (uk.field_a.length + var8Lifetime2) < 0) {
                stackIn_40_2 = "";
              } else {
                stackIn_40_2 = uk.field_a[uk.field_a.length + (var8Lifetime2 - var5)];
              }
              stackIn_39_0[stackIn_39_1] = stackIn_40_2;
            }
            fb.field_d[6 + var5] = null;
            m.field_c[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_44_0 = fb.field_d;
              stackIn_44_1 = var5 + (7 + var8Lifetime3);
              stackIn_44_2 = ~var8Lifetime3;
              stackIn_44_3 = ~rc.field_g.length;
              if (stackIn_44_2 <= stackIn_44_3) {
                stackIn_47_2 = "";
              } else {
                stackIn_47_2 = rc.field_g[var8Lifetime3];
              }
              stackIn_44_0[stackIn_44_1] = stackIn_47_2;
            }
            sd.field_h = lj.a((byte) -52);
          }
          if (param1 != 1) {
            field_a = (dd) null;
          }
          bk.field_a.field_m = em.field_e.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < fb.field_d.length; var4Lifetime1++) {
            stackIn_90_0 = 3;
            stackIn_90_1 = fb.field_d[var4Lifetime1];
            stackIn_91_2 = !(m.field_c[var4Lifetime1] < 0);
            var5Lifetime1 = se.a(stackIn_90_0, stackIn_90_1, stackIn_91_2);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (vc.field_a == 2) {
            var10 = j.field_o;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = se.a(3, var11, false);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = oe.field_c;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = se.a(param1 ^ 2, var12, false);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          em.field_d = bk.field_a.field_m * (id.field_c + ge.field_h << 1);
          bm.field_K = af.field_b + (var3_intLifetime1 - (var3_intLifetime1 >> 1));
          ei.field_M = -(var3_intLifetime1 >> 1) + af.field_b;
          for (var4Lifetime2 = 0; var4Lifetime2 < fb.field_d.length; var4Lifetime2++) {
            stackIn_115_0 = em.field_d;
            if (0 > m.field_c[var4Lifetime2]) {
              stackIn_116_1 = cm.field_f;
            } else {
              stackIn_116_1 = hb.field_t;
            }
            em.field_d = stackIn_115_0 + stackIn_116_1;
          }
          rb.field_H = vc.field_f - (em.field_d >> 1);
          vh.field_j = new int[fb.field_d.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = rb.field_H;
          while (fb.field_d.length > var4Lifetime3) {
            var6Lifetime1 = m.field_c[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = se.a(3, fb.field_d[var4Lifetime3], true);
              var5Lifetime3 = var5Lifetime3 + id.field_c;
              var8Lifetime1 = af.field_b - (var7Lifetime2 >> 1);
              vh.field_j[var4Lifetime3] = new int[4];
              vh.field_j[var4Lifetime3][0] = -ae.field_c + var8Lifetime1;
              vh.field_j[var4Lifetime3][1] = var5Lifetime3;
              vh.field_j[var4Lifetime3][2] = (ae.field_c << 1) + var7Lifetime2;
              var5Lifetime3 = var5Lifetime3 + ((ge.field_h << 1) + (id.field_c + hb.field_t));
              vh.field_j[var4Lifetime3][3] = hb.field_t + (ge.field_h << 1);
            } else {
              var5Lifetime3 = var5Lifetime3 + cm.field_f;
            }
            var4Lifetime3++;
          }
          if (vc.field_a == 2) {
            bk.field_a.a(-1, -1, param2, -101);
          } else {
            bk.field_a.a(bg.a(ag.field_f, kc.field_b, 112), 0, param2, param1 - 85);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var3), "pf.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static h a(Throwable param0, String param1) {
        h var2 = null;
        if (!(param0 instanceof h)) {
          var2 = new h(param0, param1);
        } else {
          var2 = (h) ((Object) param0);
          var2.field_f = var2.field_f + ' ' + param1;
        }
        return var2;
    }

    static {
        field_d = new char[128];
        field_c = null;
    }
}
