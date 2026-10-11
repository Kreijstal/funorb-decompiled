/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    private wq field_i;
    static int[] field_j;
    static int field_b;
    private v field_h;
    private int[] field_c;
    private wq field_f;
    private int field_g;
    private wq field_a;
    static int[] field_e;
    private int field_k;
    static String field_d;

    private final void a(int param0) {
        this.field_a.a((byte) 47, 65536, 0, 0, 1194);
        this.field_a.a(126);
        this.field_f.a((byte) 47, 0, 0, 65536, 256);
        this.field_f.a(91);
        this.field_a.a(this.field_i, true);
        int var2 = -49 % ((-8 - param0) / 62);
        this.field_i.a(1, this.field_f);
    }

    private final void a(int param0, int param1, int param2) {
        this.a((byte) 92, param1, this.field_c, param2, this.field_g);
        this.field_c[param0] = this.field_c[param0] - this.field_k;
    }

    public static void b(byte param0) {
        int var1 = 92 % ((param0 - 88) / 37);
        field_j = null;
        field_d = null;
        field_e = null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null != il.field_t) {
            return;
          }
          il.field_t = new String[60];
          il.field_t[24] = ma.field_Y;
          il.field_t[11] = tf.field_p;
          il.field_t[0] = od.field_g;
          il.field_t[1] = la.field_e;
          il.field_t[13] = pl.field_v;
          il.field_t[7] = gp.field_c;
          il.field_t[3] = lb.field_d;
          il.field_t[53] = gk.field_P;
          il.field_t[6] = ir.field_k;
          il.field_t[9] = bd.field_k;
          il.field_t[8] = null;
          il.field_t[4] = el.field_a;
          il.field_t[54] = mh.field_d;
          il.field_t[2] = sa.field_b;
          il.field_t[5] = pq.field_d;
          il.field_t[25] = ig.field_m;
          il.field_t[22] = hq.field_d;
          il.field_t[16] = rk.field_y;
          il.field_t[28] = wf.field_s;
          il.field_t[19] = s.field_b;
          il.field_t[21] = dv.field_r;
          il.field_t[26] = bj.field_l;
          il.field_t[46] = hc.field_d;
          il.field_t[17] = su.field_c;
          il.field_t[23] = sa.field_e;
          il.field_t[27] = bg.field_b;
          il.field_t[30] = pf.field_e;
          il.field_t[20] = tl.field_h;
          il.field_t[18] = rk.field_c;
          il.field_t[14] = qu.field_s[0];
          il.field_t[15] = qu.field_s[1];
          for (var1_int = 55; 59 > var1_int; var1_int++) {
            il.field_t[var1_int] = null;
          }
          il.field_t[42] = nt.field_p;
          il.field_t[40] = vg.field_l;
          il.field_t[32] = mn.field_r;
          il.field_t[36] = rj.field_G;
          il.field_t[31] = ij.field_C;
          il.field_t[35] = wd.field_j;
          il.field_t[47] = qk.field_f;
          il.field_t[51] = nt.field_p;
          il.field_t[48] = lw.field_lb;
          il.field_t[44] = dd.field_g;
          il.field_t[37] = lg.field_c;
          cf.field_m = new String[3];
          il.field_t[52] = oa.field_G;
          il.field_t[38] = up.field_f;
          ParasiteEvent.field_A = new String[]{wi.field_a, rf.field_e, je.field_lb, ob.field_P};
          il.field_t[43] = kg.field_c;
          il.field_t[33] = gv.field_b;
          il.field_t[59] = em.field_e;
          il.field_t[41] = dk.field_x;
          il.field_t[45] = oa.field_G;
          il.field_t[50] = GameEvent.field_u;
          il.field_t[34] = pf.field_e;
          il.field_t[29] = qm.field_I;
          il.field_t[39] = StateChangeEvent.field_y;
          wb.field_b = new String[29];
          cf.field_m[0] = on.field_o;
          cf.field_m[2] = uq.field_v;
          cf.field_m[1] = uh.field_b;
          wb.field_b[0] = null;
          wb.field_b[10] = DamageEvent.field_z;
          if (param0 < 81) {
            return;
          }
          wb.field_b[6] = el.field_a;
          wb.field_b[13] = ar.field_y;
          du.field_g = new String[]{tg.field_l, gk.field_N, tv.field_c, tv.field_b, vn.field_g, dn.field_Kb, qu.field_r, r.field_I, we.field_h, kd.field_Q, og.field_t, mg.field_c, fg.field_l, pi.field_P, StateChangeEvent.field_H, ut.field_ib};
          wb.field_b[18] = dd.field_g;
          wb.field_b[4] = gg.field_H;
          wb.field_b[14] = ov.field_d;
          wb.field_b[17] = ke.field_f;
          wb.field_b[12] = bk.field_b;
          wb.field_b[27] = gk.field_P;
          wb.field_b[28] = mh.field_d;
          wb.field_b[23] = lw.field_lb;
          wb.field_b[1] = cb.field_d;
          wb.field_b[22] = ni.field_b;
          wb.field_b[2] = cw.field_b;
          wb.field_b[5] = nl.field_F;
          wb.field_b[24] = cb.field_d;
          wb.field_b[15] = hc.field_w;
          wb.field_b[26] = lb.field_d;
          wb.field_b[21] = og.field_u;
          wb.field_b[7] = kw.field_N;
          wb.field_b[8] = pu.field_h;
          wb.field_b[3] = l.field_g;
          wb.field_b[11] = nh.field_J;
          wb.field_b[19] = hm.field_e;
          wb.field_b[9] = jn.field_e;
          wb.field_b[20] = dk.field_x;
          oi.field_a[10] = fo.a(4800, oi.field_a[10], new String[]{Integer.toString(20)});
          vl.field_m = new String[6];
          vl.field_m[3] = jj.field_f;
          vl.field_m[0] = pl.field_C;
          vl.field_m[4] = pp.field_Y;
          vl.field_m[2] = qt.field_a;
          vl.field_m[1] = bk.field_c;
          vl.field_m[5] = fa.field_g;
          var3 = 0;
          var1_intLifetime1 = var3;
          while (jj.field_a.length > var3) {
            if (dj.field_d[var3] == null) {
              dj.field_d[var3] = jj.field_a[var3];
            }
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "j.C(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, int[] param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_h.field_k[0] = param1;
          this.field_h.field_k[1] = param3;
          this.field_h.a((byte) -49);
          var6_int = this.field_h.field_h[0];
          var7 = param4;
          param2[0] = var6_int;
          if (param0 <= 49) {
            field_e = (int[]) null;
          }
          var8 = this.field_h.field_h[1];
          param2[1] = var7;
          param2[2] = var8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("j.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        int stackIn_10_0 = 0;
        String stackIn_23_0 = null;
        je stackIn_32_0 = null;
        String stackIn_33_1 = null;
        je stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        String stackIn_36_2 = null;
        je stackIn_66_0 = null;
        boolean stackIn_66_1 = false;
        boolean stackIn_67_2 = false;
        je stackIn_71_0 = null;
        boolean stackIn_71_1 = false;
        boolean stackIn_72_2 = false;
        je stackIn_76_0 = null;
        boolean stackIn_76_1 = false;
        boolean stackIn_77_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        je var5 = null;
        je var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        je var15 = null;
        String var16 = null;
        je var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          qb.a(bd.field_r, param0 + 114);
          if (no.field_K != null) {
            var15 = lm.field_b;
            var17 = var15;
            lm.field_b.field_ob = 0;
            var17.field_gb = 0;
            var5 = so.field_d;
            so.field_d.field_ob = 0;
            var5.field_gb = 0;
            pi.field_N.field_ob = 0;
            var6 = pi.field_N;
            var6.field_gb = 0;
            kd.field_F.field_X = uu.field_a.toUpperCase();
            var7 = (2 + pd.field_c.field_gb) / 2;
            pi.field_N.a(40, param0 - 20501, var7 - 2, -40 + pd.field_c.field_ob, 0);
            so.field_d.a(40, param0 ^ -20499, -var7 + pd.field_c.field_gb, -40 + pd.field_c.field_ob, var7);
            if (lm.field_e.length == 1 &&
              lm.field_e[0] == 2) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (lm.field_e.length > var10) {
                  stackIn_10_0 = ((ln.field_d[var10 / 8] & 1 << (var10 & 7)) == 0) ? 0 : 1;
                  var11_int = stackIn_10_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    lm.field_e[var10] != 2) {
                    var8 = 1;
                  } else {
                    var10++;
                    continue;
                  }
                }
                if (var9_int != 0) {
                  break;
                }
                var8 = 1;
                break;
              }
            }
            so.field_d.field_xb = true;
            if (!ua.field_s) {
              stackIn_32_0 = so.field_d;
              if (var8 != 0) {
                stackIn_33_1 = qp.field_E;
              } else {
                stackIn_33_1 = fk.field_e;
              }
              stackIn_32_0.field_X = ((String) (Object) stackIn_33_1).toUpperCase();
              stackIn_35_0 = uj.field_l;
              stackIn_35_1 = 4800;
              if (var8 == 0) {
                stackIn_36_2 = ov.field_k;
              } else {
                stackIn_36_2 = dr.field_x;
              }
              stackIn_35_0.field_X = fo.a(stackIn_35_1, stackIn_36_2, new String[]{so.field_d.field_X});
              mp.field_Lb.field_xb = true;
              fc.field_a = true;
              pi.field_N.field_X = cg.field_i;
              if (fs.field_d != null) {
                jp.field_a = false;
                fc.field_a = false;
                if (null == ur.field_B) {
                  dt.field_d = new boolean[tq.field_b];
                  ur.field_B = new byte[tq.field_b];
                }
                var13 = 0;
                var9_intLifetime1 = var13;
                while (var13 < tq.field_b) {
                  dt.field_d[var13] = false;
                  var13++;
                }
                es.a(0, tq.field_b, no.field_K, -1, true, -1, (byte) 89, -1);
                if (!(hi.field_j < 2) &&
                  br.field_f[12]) {
                  fc.field_a = true;
                }
              }
              if (!fc.field_a) {
                so.field_d.field_xb = false;
                if (so.field_d.field_jb) {
                  var9 = null;
                  if (jp.field_a) {
                    var9 = "<col=A00000>" + ep.field_h + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; var10Lifetime1 < tq.field_b; var10Lifetime1++) {
                    if (dt.field_d[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + ob.field_M[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 != null) {
                        var9 = (String) (var9) + ", " + var11_ref;
                      } else {
                        var9 = var11_ref;
                      }
                    }
                  }
                  ad.field_I = "<col=A00000>" + kp.field_e + "<br>" + ov.field_j + (String) (var9);
                }
              }
            } else {
              uj.field_l.field_X = jb.field_v;
              mp.field_Lb.field_xb = false;
              if (var8 != 0) {
                stackIn_23_0 = p.field_f;
              } else {
                stackIn_23_0 = bd.field_l;
              }
              var16 = stackIn_23_0;
              var9 = var16;
              var9 = var16;
              var9 = var16;
              var10Lifetime1 = pi.field_N.field_Z.a(var16) + 3 * pi.field_N.field_Z.a('.');
              pi.field_N.field_O = (-var10Lifetime1 + pi.field_N.field_gb) / 2;
              if ((hg.field_b & 48) == 16) {
                var9 = var16 + ".";
              }
              pi.field_N.field_Eb = 0;
              if (32 == (48 & hg.field_b)) {
                var9 = (String) (var9) + "..";
              }
              if (48 == (48 & hg.field_b)) {
                var9 = (String) (var9) + "...";
              }
              pi.field_N.field_X = (String) (var9);
              so.field_d.field_X = ac.field_s.toUpperCase();
            }
          }
          if (param0 != 1) {
            j.b((byte) 20);
          }
          stackIn_66_0 = lk.field_a;
          stackIn_66_1 = true;
          stackIn_67_2 = (param2) && (!param1) && (!vk.field_f);
          ((je) (Object) stackIn_66_0).a(stackIn_66_1, stackIn_67_2);
          stackIn_71_0 = pd.field_c;
          stackIn_71_1 = true;
          stackIn_72_2 = (param2) && (!param1) && (!vk.field_f);
          ((je) (Object) stackIn_71_0).a(stackIn_71_1, stackIn_72_2);
          stackIn_76_0 = ta.field_R;
          stackIn_76_1 = true;
          stackIn_77_2 = (param2) && (!param1) && (vk.field_f);
          ((je) (Object) stackIn_76_0).a(stackIn_76_1, stackIn_77_2);
          ij.field_w.field_a.l(10000);
          if (null != no.field_K) {
            if (0 != mp.field_Lb.field_yb) {
              lu.a(-127, param3);
            }
            if (so.field_d.field_yb != 0) {
              if (ua.field_s) {
                ManaEvent.a((byte) 69, param3);
              } else {
                gs.a(param3, -8006);
              }
            }
            vf.a(1, true, param3, no.field_K);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "j.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    j(int param0, v param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_c = new int[3];
          this.field_h = param1;
          this.field_a = new wq();
          this.field_f = new wq();
          this.field_i = new wq();
          this.a(105);
          this.field_g = param0 << 16;
          this.field_k = ev.b(-55, this.field_g, so.a(196608, -129));
          this.a(2, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("j.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_j = new int[]{128, 129, 131, 130, 132};
        field_d = "Already moved this turn";
    }
}
