/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eb implements Iterable {
    static km field_b;
    static int field_f;
    static String field_a;
    static int field_d;
    static String field_g;
    wb field_e;
    static km field_c;

    final void a(boolean param0, wb param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1.field_k != null) {
            param1.c(52);
          }
          param1.field_k = this.field_e.field_k;
          param1.field_h = this.field_e;
          param1.field_k.field_h = param1;
          param1.field_h.field_k = param1;
          if (!param0) {
            this.a(27);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("eb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_a = null;
        field_c = null;
        if (!param0) {
          eb.a(false);
        }
        field_b = null;
    }

    final wb a(int param0) {
        if (param0 != -32314) {
          wb var3 = (wb) null;
          this.a(true, (wb) null);
        }
        wb var2 = this.field_e.field_h;
        if (this.field_e == var2) {
          return null;
        }
        var2.c(63);
        return var2;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new f(this));
    }

    final static void a(boolean param0, boolean param1, int param2, boolean param3) {
        int stackIn_11_0 = 0;
        String stackIn_24_0 = null;
        km stackIn_36_0 = null;
        String stackIn_37_1 = null;
        km stackIn_39_0 = null;
        String[] stackIn_39_1 = null;
        String stackIn_40_2 = null;
        km stackIn_70_0 = null;
        boolean stackIn_71_1 = false;
        km stackIn_75_0 = null;
        boolean stackIn_76_1 = false;
        km stackIn_80_0 = null;
        boolean stackIn_81_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        km var5 = null;
        km var6 = null;
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
        km var15 = null;
        String var16 = null;
        km var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = Virogrid.field_F ? 1 : 0;
        try {
          rf.a(hn.field_h, -4);
          if (la.field_h != null) {
            var15 = ed.field_c;
            var17 = var15;
            ed.field_c.field_ub = 0;
            var17.field_K = 0;
            ii.field_d.field_ub = 0;
            var5 = ii.field_d;
            var5.field_K = 0;
            var6 = jk.field_b;
            jk.field_b.field_ub = 0;
            var6.field_K = 0;
            qi.field_e.field_V = hk.field_Ib.toUpperCase();
            var7 = (dm.field_r.field_K + 2) / 2;
            jk.field_b.a(0, 40, -2 + var7, (byte) -96, dm.field_r.field_ub - 40);
            ii.field_d.a(var7, 40, dm.field_r.field_K - var7, (byte) -64, -40 + dm.field_r.field_ub);
            if (vj.field_b.length == 1 &&
              vj.field_b[0] == 2) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (var10 < vj.field_b.length) {
                  stackIn_11_0 = (0 == (kn.field_E[var10 / 8] & 1 << (7 & var10))) ? 0 : 1;
                  var11_int = stackIn_11_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    vj.field_b[var10] != 2) {
                    var8 = 1;
                  } else {
                    var10++;
                    continue;
                  }
                }
                if (0 != var9_int) {
                  break;
                }
                var8 = 1;
                break;
              }
            }
            ii.field_d.field_Y = true;
            if (!ld.field_c) {
              stackIn_36_0 = ii.field_d;
              if (var8 != 0) {
                stackIn_37_1 = p.field_g;
              } else {
                stackIn_37_1 = gf.field_x;
              }
              stackIn_36_0.field_V = ((String) (Object) stackIn_37_1).toUpperCase();
              stackIn_39_0 = l.field_b;
              stackIn_39_1 = new String[]{ii.field_d.field_V};
              if (var8 != 0) {
                stackIn_40_2 = ok.field_K;
              } else {
                stackIn_40_2 = h.field_b;
              }
              stackIn_39_0.field_V = oi.a(stackIn_39_1, stackIn_40_2, 2);
              jk.field_b.field_V = nl.field_v;
              ud.field_b = true;
              fb.field_o.field_Y = true;
              if (nb.field_q != null) {
                vi.field_l = false;
                ud.field_b = false;
                if (null == ub.field_D) {
                  hk.field_Lb = new boolean[vb.field_h];
                  ub.field_D = new byte[vb.field_h];
                }
                var13 = 0;
                var9_intLifetime1 = var13;
                while (var13 < vb.field_h) {
                  hk.field_Lb[var13] = false;
                  var13++;
                }
                kn.a(true, -1, -1, vb.field_h, 0, 8, -1, la.field_h);
                if (!(2 > hd.field_d) &&
                  dc.field_Y[12]) {
                  ud.field_b = true;
                }
              }
              if (!ud.field_b) {
                ii.field_d.field_Y = false;
                if (ii.field_d.field_G) {
                  var9 = null;
                  if (vi.field_l) {
                    var9 = "<col=A00000>" + wg.field_d + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; var10Lifetime1 < vb.field_h; var10Lifetime1++) {
                    if (hk.field_Lb[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + bd.field_a[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 != null) {
                        var9 = (String) (var9) + ", " + var11_ref;
                      } else {
                        var9 = var11_ref;
                      }
                    }
                  }
                  wc.field_g = "<col=A00000>" + eg.field_F + "<br>" + ij.field_h + (String) (var9);
                }
              }
            } else {
              fb.field_o.field_Y = false;
              l.field_b.field_V = bl.field_A;
              if (var8 == 0) {
                stackIn_24_0 = ma.field_f;
              } else {
                stackIn_24_0 = uh.field_d;
              }
              var16 = stackIn_24_0;
              var9 = var16;
              var10Lifetime1 = jk.field_b.field_C.a(var16) + 3 * jk.field_b.field_C.a('.');
              jk.field_b.field_lb = 0;
              if ((rl.field_y & 48) == 16) {
                var9 = var16 + ".";
              }
              jk.field_b.field_z = (-var10Lifetime1 + jk.field_b.field_K) / 2;
              if ((48 & rl.field_y) == 32) {
                var9 = (String) (var9) + "..";
              }
              if ((48 & rl.field_y) == 48) {
                var9 = (String) (var9) + "...";
              }
              jk.field_b.field_V = (String) (var9);
              ii.field_d.field_V = vb.field_g.toUpperCase();
            }
          }
          stackIn_70_0 = ao.field_Eb;
          stackIn_71_1 = (param3) && (!param1) && (!ad.field_h);
          ((km) (Object) stackIn_70_0).a(stackIn_71_1, (byte) 89);
          stackIn_75_0 = dm.field_r;
          stackIn_76_1 = (param3) && (!param1) && (!ad.field_h);
          ((km) (Object) stackIn_75_0).a(stackIn_76_1, (byte) 103);
          stackIn_80_0 = pm.field_n;
          stackIn_81_1 = (param3) && (!param1) && (ad.field_h);
          ((km) (Object) stackIn_80_0).a(stackIn_81_1, (byte) 100);
          he.field_pc.field_c.g(0);
          if (param0) {
            field_f = 123;
          }
          if (null != la.field_h) {
            if (fb.field_o.field_nb != 0) {
              ub.b(param2, -12508);
            }
            if (0 != ii.field_d.field_nb) {
              if (!ld.field_c) {
                em.a((byte) -55, param2);
              } else {
                qa.a(3, param2);
              }
            }
            co.a(param2, true, -2137400888, la.field_h);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var4), "eb.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    eb() {
        this.field_e = new wb();
        this.field_e.field_h = this.field_e;
        this.field_e.field_k = this.field_e;
    }

    static {
        field_g = "Offer rematch";
        field_a = "Cancel";
    }
}
