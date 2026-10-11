/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm extends qt {
    private int field_B;
    static String field_A;
    static hd field_C;

    final static boolean a(boolean param0) {
        if (!param0) {
          return 2 <= tk.field_Ib ? true : false;
        }
        field_A = (String) null;
        return 2 <= tk.field_Ib ? true : false;
    }

    final void a(int param0, boolean param1) {
        hd var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var16;
        uo var18;
        int[] var21;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int var10;
        int var11;
        String var12;
        int var13;
        int var14;
        int var15;
        int var10Lifetime1;
        int var11Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var15Lifetime1;
        int var10Lifetime2;
        int var11Lifetime2;
        int var13Lifetime2;
        int var14Lifetime3;
        int var14Lifetime4;
        int var15Lifetime2;
        String var12Lifetime1;
        String var12Lifetime2;
        int var14Lifetime5;
        var16 = Kickabout.field_G;
        super.a(param0, param1);
        on.a(vu.field_Ib.field_F, vu.field_Ib.field_T, vu.field_Ib.field_q, vu.field_Ib.field_mb, 8, 0, 96);
        on.a(-4 + bq.field_d.field_F, -4 + bq.field_d.field_T, 2 + bq.field_d.field_q, 4 + (bq.field_d.field_mb << 1), 8, 0, 128);
        bq.field_d.a(46, false);
        ub.field_D.a(97, false);
        vu.field_Ib.a(param0 + 84, false);
        pt.a(vu.field_Ib.field_F + vu.field_Ib.field_q, param0 - 22909, vu.field_Ib.field_F, vu.field_Ib.field_mb + vu.field_Ib.field_T, vu.field_Ib.field_T);
        var3 = (hd) (vu.field_Ib.field_Db.field_jb.g(24009));
        while (var3 != null) {
          if (var3 instanceof ej) {
            ((ej) (var3)).c(true);
          }
          var3 = (hd) (vu.field_Ib.field_Db.field_jb.c(33));
        }
        ta.e(117);
        var18 = pb.field_C;
        var21 = bh.field_f;
        if (pt.field_e == -1) {
          stackIn_9_0 = ob.field_C;
        } else {
          stackIn_9_0 = pt.field_e;
        }
        var5 = stackIn_9_0;
        if (var5 == -1) {
          stackIn_12_0 = 0;
        } else {
          stackIn_12_0 = c.a(var5, 0, var21) ? 1 : 0;
        }
        var6 = stackIn_12_0;
        var7 = 142 + this.field_j;
        var8 = 289;
        on.a(this.field_j + 8, 280, 120, 145, 8, 0, 148);
        var9 = 230;
        on.a(this.field_j + 135, 280, 244, 145, 8, 0, 148);
        if (-1 == var5) {
          if (!la.a(100)) {
            pb.field_C.a(rt.field_K, var7, 250, var9, 200, 16777215, -1, 1, 1, 0);
          } else {
            pb.field_C.a(sh.field_b, var7, 250, var9, 200, 16777215, -1, 1, 1, 0);
          }
          return;
        }
        if (var6 == 0 &&
          !pc.field_e) {
          if (var5 == 32 &&
            jd.f(-1)) {
            ra.field_L.c(5 + this.field_j, 290);
            var10 = var18.a('"' + kw.field_c[var5] + '"', var7, var8, var9, 80, 16776960, -1, 1, 0, 16);
            var11 = var8 + var10 * 16 + 5;
            q.field_d.d(bo.field_Db.toLowerCase(), (var9 >> 1) + var7, var11 + 6, 16711680, -1);
            var11 += 10;
            var12 = lw.field_a[var5];
            if (th.field_a[var5]) {
              var12 = field_A;
            }
            var11 += 16;
            var13 = Math.max(var18.a(dh.field_l), var18.a(po.field_d)) + 30;
            var18.c(dh.field_l, var7 + var13, var11, 16777215, -1);
            var18.a(Integer.toString(wc.field_g[var5]), 5 + var13 + var7, var11, 16777215, -1);
            var11 += 18;
            var18.c(po.field_d, var7 + var13, var11, 16777215, -1);
            for (var14 = wc.field_g[var5] / 100; var14 > 0; var14--) {
              var15 = 5 * var14 + (var13 + (var7 - 2));
              qs.field_R.f(var15, -14 + var11);
            }
            var11 += 9;
            var14Lifetime5 = 16;
            if (3 < var18.b(var12, var9)) {
              var11 -= 4;
              var14Lifetime5 = 15;
            }
            var18.a(var12, var7, var11, var9, 200, 16777215, -1, 0, 0, var14Lifetime5);
            return;
          }
          pn.field_w.c(5 + this.field_j, 290);
          var10Lifetime2 = var18.a('"' + kw.field_c[var5] + '"', var7, var8, var9, 80, 16776960, -1, 1, 0, 16);
          var11Lifetime2 = var8 + var10Lifetime2 * 16 + 5;
          q.field_d.d(bo.field_Db.toLowerCase(), (var9 >> 1) + var7, var11Lifetime2 + 6, 16711680, -1);
          var11Lifetime2 += 10;
          var12Lifetime2 = lw.field_a[var5];
          if (th.field_a[var5]) {
            var12Lifetime2 = field_A;
          }
          var11Lifetime2 += 16;
          var13Lifetime2 = Math.max(var18.a(dh.field_l), var18.a(po.field_d)) + 30;
          var18.c(dh.field_l, var7 + var13Lifetime2, var11Lifetime2, 16777215, -1);
          var18.a(Integer.toString(wc.field_g[var5]), 5 + var13Lifetime2 + var7, var11Lifetime2, 16777215, -1);
          var11Lifetime2 += 18;
          var18.c(po.field_d, var7 + var13Lifetime2, var11Lifetime2, 16777215, -1);
          for (var14Lifetime3 = wc.field_g[var5] / 100; var14Lifetime3 > 0; var14Lifetime3--) {
            var15Lifetime2 = 5 * var14Lifetime3 + (var13Lifetime2 + (var7 - 2));
            qs.field_R.f(var15Lifetime2, -14 + var11Lifetime2);
          }
          var11Lifetime2 += 9;
          var14Lifetime4 = 16;
          if (3 < var18.b(var12Lifetime2, var9)) {
            var11Lifetime2 -= 4;
            var14Lifetime4 = 15;
          }
          var18.a(var12Lifetime2, var7, var11Lifetime2, var9, 200, 16777215, -1, 0, 0, var14Lifetime4);
          return;
        }
        qe.field_i[iw.field_e[var5]].c(5 + this.field_j, 290);
        var10Lifetime1 = var18.a('"' + kw.field_c[var5] + '"', var7, var8, var9, 80, 16776960, -1, 1, 0, 16);
        var11Lifetime1 = var8 + var10Lifetime1 * 16 + 5;
        if (var6 == 0) {
          q.field_d.d(bo.field_Db.toLowerCase(), (var9 >> 1) + var7, var11Lifetime1 + 6, 16711680, -1);
          var11Lifetime1 += 10;
          var12Lifetime1 = lw.field_a[var5];
          if (th.field_a[var5]) {
            var12Lifetime1 = field_A;
          }
          var11Lifetime1 += 16;
          var13Lifetime1 = Math.max(var18.a(dh.field_l), var18.a(po.field_d)) + 30;
          var18.c(dh.field_l, var7 + var13Lifetime1, var11Lifetime1, 16777215, -1);
          var18.a(Integer.toString(wc.field_g[var5]), 5 + var13Lifetime1 + var7, var11Lifetime1, 16777215, -1);
          var11Lifetime1 += 18;
          var18.c(po.field_d, var7 + var13Lifetime1, var11Lifetime1, 16777215, -1);
          for (var14Lifetime1 = wc.field_g[var5] / 100; var14Lifetime1 > 0; var14Lifetime1--) {
            var15Lifetime1 = 5 * var14Lifetime1 + (var13Lifetime1 + (var7 - 2));
            qs.field_R.f(var15Lifetime1, -14 + var11Lifetime1);
          }
        } else {
          var12Lifetime1 = lw.field_a[var5];
          if (th.field_a[var5] &&
            var6 == 0) {
            var12Lifetime1 = field_A;
          }
          var11Lifetime1 += 16;
          var13Lifetime1 = Math.max(var18.a(dh.field_l), var18.a(po.field_d)) + 30;
          var18.c(dh.field_l, var7 + var13Lifetime1, var11Lifetime1, 16777215, -1);
          var18.a(Integer.toString(wc.field_g[var5]), 5 + var13Lifetime1 + var7, var11Lifetime1, 16777215, -1);
          var11Lifetime1 += 18;
          var18.c(po.field_d, var7 + var13Lifetime1, var11Lifetime1, 16777215, -1);
          for (var14Lifetime1 = wc.field_g[var5] / 100; var14Lifetime1 > 0; var14Lifetime1--) {
            var15Lifetime1 = 5 * var14Lifetime1 + (var13Lifetime1 + (var7 - 2));
            qs.field_R.f(var15Lifetime1, -14 + var11Lifetime1);
          }
        }
        var11Lifetime1 += 9;
        var14Lifetime2 = 16;
        if (3 < var18.b(var12Lifetime1, var9)) {
          var11Lifetime1 -= 4;
          var14Lifetime2 = 15;
        }
        var18.a(var12Lifetime1, var7, var11Lifetime1, var9, 200, 16777215, -1, 0, 0, var14Lifetime2);
    }

    final void b(int param0) {
        int var2 = 0;
        hd var3 = null;
        int var4 = Kickabout.field_G;
        bq.field_d = eo.a(false);
        ub.field_D = eo.a(true);
        for (var2 = 0; 2 > var2; var2++) {
          var3 = var2 == 0 ? bq.field_d : ub.field_D;
          var3.field_N.d();
          var3.field_vb.d();
          var3.field_r.d();
          var3.field_t.d();
        }
        bq.field_d.field_lb = false;
        vu.field_Ib = new tk("Cabinet", ne.j((byte) 15), be.field_q, it.field_m);
        vu.field_Ib.a(16, 100, 4, (byte) -114, 200, 300, 70);
        if (param0 == -38) {
          sj.field_g = true;
          return;
        }
        fm.a(true);
        sj.field_g = true;
    }

    public static void g(byte param0) {
        int var1 = 3 % ((param0 + 3) / 32);
        field_A = null;
        field_C = null;
    }

    final void a(byte param0, boolean param1) {
        int var4 = 0;
        hd var5 = null;
        int var6 = Kickabout.field_G;
        int var4Lifetime1;
        super.a((byte) 101, param1);
        bq.field_d.a(true, 32, 310 + this.field_j, 144, 32);
        int var3 = 41 % ((param0 - 38) / 60);
        ub.field_D.a(true, 32, this.field_j + 310, 176, 32);
        vu.field_Ib.a(true, 300, 45 + this.field_j, 70, 200);
        if (0 < this.field_B) {
          this.field_B = this.field_B - 1;
          var4 = vu.field_Ib.field_Db.field_J;
          vu.field_Ib.b(0, param1);
          bq.field_d.b(0, param1);
          ub.field_D.b(0, param1);
          ob.field_C = -1;
          var5 = (hd) (vu.field_Ib.field_Db.field_jb.g(24009));
          while (var5 != null) {
            if (var5 instanceof ej) {
              ((ej) (var5)).a(param1, -60);
            }
            var5 = (hd) (vu.field_Ib.field_Db.field_jb.c(33));
          }
          this.e(-1);
          if (vu.field_Ib.field_Db.field_J <= var4) {
            if (var4 <= vu.field_Ib.field_Db.field_J) {
              return;
            }
            if (this.field_B == 0) {
              sp.c(60, -100);
              this.field_B = 8;
              return;
            }
            return;
          }
          if (this.field_B != 0) {
            if (var4 > vu.field_Ib.field_Db.field_J) {
              if (this.field_B != 0) {
                return;
              }
              sp.c(60, -100);
              this.field_B = 8;
            }
            return;
          }
          sp.c(59, 66);
          this.field_B = 8;
          if (var4 > vu.field_Ib.field_Db.field_J) {
            if (this.field_B != 0) {
              return;
            }
            sp.c(60, -100);
            this.field_B = 8;
          }
          return;
        }
        var4Lifetime1 = vu.field_Ib.field_Db.field_J;
        vu.field_Ib.b(0, param1);
        bq.field_d.b(0, param1);
        ub.field_D.b(0, param1);
        ob.field_C = -1;
        var5 = (hd) (vu.field_Ib.field_Db.field_jb.g(24009));
        while (var5 != null) {
          if (var5 instanceof ej) {
            ((ej) (var5)).a(param1, -60);
          }
          var5 = (hd) (vu.field_Ib.field_Db.field_jb.c(33));
        }
        this.e(-1);
        if (vu.field_Ib.field_Db.field_J > var4Lifetime1 &&
          this.field_B == 0) {
          sp.c(59, 66);
          this.field_B = 8;
          if (var4Lifetime1 > vu.field_Ib.field_Db.field_J) {
            if (this.field_B != 0) {
              return;
            }
            sp.c(60, -100);
            this.field_B = 8;
          }
          return;
        }
        if (var4Lifetime1 > vu.field_Ib.field_Db.field_J) {
          if (this.field_B != 0) {
            return;
          }
          sp.c(60, -100);
          this.field_B = 8;
        }
    }

    private final void e(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = Kickabout.field_G;
        var2 = 0;
        var3 = 0;
        if (bq.field_d.field_qb == 1) {
          if (0 == ha.field_I % 2) {
            var2 = 1;
            vu.field_Ib.field_Db.field_v = vu.field_Ib.field_Db.field_v + 16;
          }
          var3 = 1;
          ha.field_I = ha.field_I + 1;
        }
        if (ub.field_D.field_qb == 1) {
          var3 = 1;
          if (ha.field_I % 2 == 0) {
            vu.field_Ib.field_Db.field_v = vu.field_Ib.field_Db.field_v - 16;
            var2 = 1;
          }
          ha.field_I = ha.field_I + 1;
        }
        var4 = id.field_v;
        if (~var4 != param0) {
          if (!vu.field_Ib.field_gb) {
            if (var3 == 0) {
              ha.field_I = 0;
            }
            if (var2 == 0) {
              return;
            }
            var5 = vu.field_Ib.field_Db.field_J;
            var6 = vu.field_Ib.field_Db.field_v;
            if (-(var5 + var6) >= 0) {
              bq.field_d.field_lb = true;
            } else {
              bq.field_d.field_lb = false;
              vu.field_Ib.field_Db.field_v = -var5;
            }
            var7 = vu.field_Ib.field_Db.field_mb;
            if (-(var6 + var5) <= vu.field_Ib.field_Db.field_L + (var7 - vu.field_Ib.field_Gb.field_mb)) {
              ub.field_D.field_lb = true;
            } else {
              vu.field_Ib.field_Db.field_v = -var5 - (-vu.field_Ib.field_Gb.field_mb + (vu.field_Ib.field_Db.field_L + var7));
              ub.field_D.field_lb = false;
            }
            return;
          }
          vu.field_Ib.field_Db.field_v = vu.field_Ib.field_Db.field_v - 16 * var4;
          var2 = 1;
        }
        if (var3 == 0) {
          ha.field_I = 0;
        }
        if (var2 == 0) {
          return;
        }
        var5Lifetime1 = vu.field_Ib.field_Db.field_J;
        var6Lifetime1 = vu.field_Ib.field_Db.field_v;
        if (-(var5Lifetime1 + var6Lifetime1) >= 0) {
          bq.field_d.field_lb = true;
        } else {
          bq.field_d.field_lb = false;
          vu.field_Ib.field_Db.field_v = -var5Lifetime1;
        }
        var7Lifetime1 = vu.field_Ib.field_Db.field_mb;
        if (-(var6Lifetime1 + var5Lifetime1) <= vu.field_Ib.field_Db.field_L + (var7Lifetime1 - vu.field_Ib.field_Gb.field_mb)) {
          ub.field_D.field_lb = true;
        } else {
          vu.field_Ib.field_Db.field_v = -var5Lifetime1 - (-vu.field_Ib.field_Gb.field_mb + (vu.field_Ib.field_Db.field_L + var7Lifetime1));
          ub.field_D.field_lb = false;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        pt.field_e = -1;
        ob.field_C = -1;
    }

    final static int a(byte param0, int param1) {
        if (param0 == -27) {
          return 88080384 + (100 * param1 + 500 << 16);
        }
        fm.a(true);
        return 88080384 + (100 * param1 + 500 << 16);
    }

    final static gg a(String param0, int param1) {
        String var2 = null;
        gg var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        gg stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Kickabout.field_G;
        try {
          if (ni.field_m == null) {
            return null;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = mo.a(0, var6);
          if (param1 != 145) {
            field_C = (hd) null;
          }
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (gg) (ni.field_m.a(-3611, (long)var2.hashCode()));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_Gb);
            var4 = mo.a(0, var7);
            if (var4 == null) {
              var4 = var3.field_Gb;
            }
            if (var4.equals(var2)) {
              stackIn_18_0 = var3;
              return stackIn_18_0;
            }
            var3 = (gg) (ni.field_m.a((byte) 117));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("fm.I(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        int var3 = 14 / ((param0 + 49) / 52);
        return super.a(-116, param1);
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        try {
          super.a(param0, param1, -70, param3);
          bq.field_d.a(true, 32, 310 + this.field_j, 144, 32);
          ub.field_D.a(true, 32, 310 + this.field_j, 176, 32);
          vu.field_Ib.a(true, 300, this.field_j + 45, 70, 200);
          bq.field_d.b(0, false);
          ub.field_D.b(0, false);
          vu.field_Ib.b(0, false);
          if (param2 >= -28) {
            field_C = (hd) null;
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "fm.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final int b(int param0, int param1) {
        if (!la.a(100)) {
          if (param1 == -22667) {
            return super.b(param0, -22667);
          }
          this.a((byte) 31, false);
          return super.b(param0, -22667);
        }
        if (param0 == 0) {
          return (this.field_i[0].field_d >> 1) + 25;
        }
        if (param0 == 1) {
          return 340 - (this.field_i[1].field_d >> 1);
        }
        if (param1 == -22667) {
          return super.b(param0, -22667);
        }
        this.a((byte) 31, false);
        return super.b(param0, -22667);
    }

    fm() {
        this.field_B = 0;
    }

    static {
        field_A = "This is a secret achievement.";
    }
}
