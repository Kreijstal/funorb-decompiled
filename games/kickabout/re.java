/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re implements gj {
    static ko field_c;
    private int field_d;
    static String[] field_b;
    private int field_n;
    private int field_i;
    static int field_k;
    private int field_p;
    private hu field_m;
    private int field_g;
    private int field_f;
    private int field_j;
    private int field_a;
    private int field_e;
    static ot field_o;
    private int field_l;
    private int field_h;

    final static void a(int param0) {
        int var3 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_33_0 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        boolean stackIn_39_2 = false;
        dg stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        dg var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Kickabout.field_G;
        try {
          var1_int = uq.field_c;
          var2 = param0;
          if (ck.field_a == 2) {
            var3_long = -va.field_o + nj.a(-50);
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; eq.field_c.length > var3; var3++) {
            var4 = dk.field_g[var3];
            if (0 > var4) {
              var5 = du.field_k;
            } else {
              if (var4 != ll.field_k.field_e) {
                var5 = wt.field_v;
              } else {
                var5 = fb.field_R;
              }
            }
            var6 = eq.field_c[var3];
            if (ck.field_a == 2 &&
              1 == var2) {
              if (pn.field_D.length <= dn.field_Eb.length) {
                stackIn_18_0 = dn.field_Eb.length;
              } else {
                stackIn_18_0 = pn.field_D.length;
              }
              var7 = stackIn_18_0;
              if (pg.field_a.length < cg.field_E.length) {
                stackIn_21_0 = cg.field_E.length;
              } else {
                stackIn_21_0 = pg.field_a.length;
              }
              var8 = stackIn_21_0;
              if (6 <= var3 &&
                var3 < var7 + 6) {
                if (-6 + var3 - (-dn.field_Eb.length + var7) >= 0) {
                  stackIn_26_0 = dn.field_Eb[-var7 - 6 + (var3 + dn.field_Eb.length)];
                } else {
                  stackIn_26_0 = "";
                }
                var6 = stackIn_26_0;
              }
              if (var3 >= var7 + 7 &&
                var3 < var8 + 7 + var7) {
                if (pg.field_a.length <= var3 - (7 + var7)) {
                  stackIn_33_0 = "";
                } else {
                  stackIn_33_0 = pg.field_a[-7 + (var3 - var7)];
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_38_0 = 10;
            stackIn_38_1 = var6;
            stackIn_39_2 = !(var4 < 0);
            var7Lifetime1 = ud.a(stackIn_38_0, stackIn_38_1, stackIn_39_2);
            var8Lifetime1 = ta.field_A - (var7Lifetime1 >> 1);
            if (var4 >= 0) {
              if (ll.field_k.field_e == var4) {
                stackIn_44_0 = qn.field_a;
              } else {
                stackIn_44_0 = cr.field_e;
              }
              var9 = stackIn_44_0;
              var1_int = var1_int + aj.field_a;
              if (var9 != null) {
                var9.a(-eb.field_d + var8Lifetime1, nr.field_j + (pr.field_d << 1), var1_int, var7Lifetime1 + (eb.field_d << 1), param0 ^ 3);
              }
              var1_int = var1_int + pr.field_d;
            }
            if (var4 < 0) {
              cv.field_f.a(var6, var8Lifetime1, jl.field_d + var1_int, var5, -1);
              var1_int = var1_int + la.field_c;
            } else {
              sf.field_F.a(var6, var8Lifetime1, lk.field_g + var1_int, var5, -1);
              var1_int = var1_int + (nr.field_j + aj.field_a + pr.field_d);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "re.E(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_o = null;
        if (param0 != 109) {
          re.a((byte) 112, -27, 55, -64);
        }
        field_c = null;
    }

    final static void b(int param0) {
        int var1;
        int var1Lifetime1;
        int var1Lifetime2;
        int var1Lifetime3;
        if (param0 <= 85) {
          field_k = 33;
        }
        fp.field_f = fp.field_f + 3;
        if (fp.field_f >= 256) {
          fp.field_f = fp.field_f - 256;
        }
        if (wh.field_q) {
          vd.a(0, 0);
          var1 = vr.a(rm.field_C, ih.field_c, (byte) -110);
          if (var1 != -1) {
            jm.a(100, 9863, var1);
            return;
          }
          if (!iu.a(63, ih.field_c, rm.field_C)) {
            jm.a(2, 9863, 1);
            return;
          }
          vd.a(0, 1);
          if (0 != ih.field_c) {
            if (ih.field_c == 1) {
              var1Lifetime1 = vc.b(123);
              if (var1Lifetime1 != -1) {
                jm.a(100, 9863, var1Lifetime1);
                return;
              }
            } else {
              if (ih.field_c == 2) {
                var1Lifetime1 = k.b(-124);
                if (var1Lifetime1 != -1) {
                  jm.a(100, 9863, var1Lifetime1);
                  return;
                }
              }
            }
          } else {
            var1Lifetime1 = ve.c(false);
            if (var1Lifetime1 != -1) {
              jm.a(100, 9863, var1Lifetime1);
              return;
            }
          }
          vd.a(0, 2);
          if (2 != rm.field_C) {
            if (rm.field_C == 3) {
              var1Lifetime2 = kw.c((byte) 28);
              if (var1Lifetime2 != -1) {
                jm.a(100, 9863, var1Lifetime2);
                return;
              }
            }
          } else {
            if (!bl.a((byte) -94)) {
              jm.a(1, 9863, 0);
              return;
            }
          }
          vd.a(0, 3);
          var1Lifetime3 = fu.a(5464, ih.field_c, rm.field_C);
          if (var1Lifetime3 != -1) {
            jm.a(100, 9863, var1Lifetime3);
            return;
          }
          vd.a(0, 4);
          if (!ja.d(120, kn.a(ih.field_c, 121, vi.field_n, rm.field_C))) {
            jm.a(4, 9863, 0);
            return;
          }
          vd.a(0, 5);
          if (rm.field_C == 2) {
            if (!ja.d(108, 4)) {
              jm.a(2, 9863, 0);
              return;
            }
            if (!ja.d(117, 5)) {
              jm.a(2, 9863, 1);
              return;
            }
          } else {
            if (rm.field_C == 3) {
              if (!ja.d(109, 6)) {
                jm.a(2, 9863, 0);
                return;
              }
              if (!ja.d(120, 7)) {
                jm.a(2, 9863, 1);
                return;
              }
            }
          }
          if (kl.field_t) {
            hl.field_e = null;
            am.field_h = null;
            ub.field_G = null;
            hq.field_e = null;
            c.field_f = null;
            vd.a(0, 6);
            if (0 == rm.field_C) {
              hd.a(15, 6, 50, 0);
            }
            if (rm.field_C == 1) {
              hd.a(15, 5, 70, 20);
            }
            if (2 == rm.field_C) {
              hd.a(15, 4, 128, 0);
            }
            if (3 == rm.field_C) {
              hd.a(15, 3, 256, 0);
            }
            vd.a(0, 7);
            if (rm.field_C == 2) {
              in.a(true, 128);
            }
            if (rm.field_C == 3) {
              mj.a((byte) -39, 128);
            }
            vd.a(0, 8);
            vb.a(true);
            vd.a(0, 9);
            if (0 == ih.field_c) {
              pp.b(1);
            }
            if (ih.field_c == 1) {
              eh.a((byte) -48);
            }
            if (ih.field_c == 2) {
              cv.a(11383);
            }
            vd.a(0, 10);
            vp.a(-4121, rm.field_C);
            kl.field_t = false;
          }
          wh.field_q = false;
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        es var9 = null;
        var8 = Kickabout.field_G;
        try {
          if (la.a(100)) {
            return;
          }
          if (uv.field_f) {
            return;
          }
          if (param1 >= 0) {
            if (param1 > pu.field_Db[param3]) {
              param1 = pu.field_Db[param3];
            }
          } else {
            param1 = 0;
          }
          if (param2 < 0) {
            param1 = 0;
          } else {
            if (pu.field_Db[param3] < param2) {
              param2 = pu.field_Db[param3];
            }
          }
          if (param2 <= param1) {
            return;
          }
          if (-param1 + param2 > 32) {
            param2 = 32 + param1;
          }
          vq.field_g.b(22997);
          var4_int = 0;
          if (param0 <= 120) {
            field_c = (ko) null;
          }
          var5 = 0;
          var6 = param1;
          for (var7 = param1; var7 < param2; var7++) {
            if (bf.field_y.a(var7, (byte) 116, param3) == null) {
              if (var5 == 0) {
                var6 = var7;
              }
              var5++;
            } else {
              if (var5 > 0) {
                var4_int++;
                vq.field_g.a(new es(param3, var6, var5), 3);
              }
              var5 = 0;
            }
          }
          if (var5 > 0) {
            vq.field_g.a(new es(param3, var6, var5), 3);
            var4_int++;
          }
          if (0 < var4_int) {
            or.field_d.b(53, (byte) 118);
            or.field_d.g(-1207444472, 2 + 5 * var4_int);
            or.field_d.a(121, var4_int);
            var9 = (es) (vq.field_g.b((byte) 126));
            while (var9 != null) {
              var9.a(or.field_d, (byte) 95);
              var9 = (es) (vq.field_g.b((byte) 127));
            }
            or.field_d.a(105, param3);
            uv.field_f = true;
            ri.field_t = 500;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var4), "re.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static ak a(boolean param0, int param1) {
        ak var2 = new ak(3);
        var2.field_n = param0 ? true : false;
        if (param1 < 33) {
          return (ak) null;
        }
        return var2;
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        qk var12 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        try {
          var12 = !(param3 instanceof qk) ? null : (qk) (param3);
          if (var12 != null) {
            param1 = param1 & var12.field_y;
          }
          var7 = 5592405;
          on.a(param4 + param3.field_t, param3.field_g + param2, param3.field_n, param3.field_i, this.field_a);
          if (param1) {
            var7 = 16777215;
          }
          var8 = param4 - (-param3.field_t - this.field_f);
          var9 = this.field_n + (param2 + param3.field_g);
          int var10 = -126 / ((59 - param0) / 53);
          on.d(var8, var9, this.field_h, this.field_g, 5592405);
          on.a(var8, var9, this.field_h, this.field_g, var7);
          if (var12.field_A) {
            on.b(var8, var9, this.field_h + var8, this.field_g + var9, 1);
            on.b(var8 + this.field_h, var9, var8, this.field_g + var9, 1);
          }
          if (null != this.field_m) {
            var11 = this.field_h + (this.field_f + this.field_i);
            this.field_m.a(param3.field_q, var11 + param3.field_t + param4, this.field_p + param2 + param3.field_g, -this.field_i - var11 + param3.field_n, param3.field_i - (this.field_i << 1), this.field_e, this.field_l, this.field_d, this.field_j, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "re.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    re(hu param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_d = 1;
        this.field_j = 1;
        try {
          this.field_m = param0;
          this.field_g = param7;
          this.field_f = param5;
          this.field_i = param1;
          this.field_p = param2;
          this.field_l = param4;
          this.field_e = param3;
          this.field_a = param9;
          this.field_h = param8;
          this.field_n = param6;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_b = new String[]{"<img=0>Tournaments are <col=ffff00>unrated</col> only.", "<img=0>If a player has no opponent for their game, they automatically go through to the next round.", "<img=0>In the event of a draw, a random statistic is chosen to decide who wins, in the event of all stats being the the same, the winner is decided on a coin toss."};
        field_c = new ko(1);
    }
}
