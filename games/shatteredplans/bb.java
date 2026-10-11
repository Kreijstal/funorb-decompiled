/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static String field_d;
    static int field_c;
    static String field_a;
    static int field_b;

    final static as a(int param0, mg param1) {
        as var2 = null;
        RuntimeException var2_ref = null;
        as stackIn_2_0 = null;
        as stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -2) {
            stackIn_2_0 = (as) null;
            return stackIn_2_0;
          }
          var2 = new as(param1);
          var2.field_v = -var2.field_v;
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("bb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static qr a(byte param0) {
        if (param0 != 100) {
          bb.a(false, false, (byte) 25, -35);
        }
        return ls.field_a.field_xb;
    }

    final static void a(int param0, long param1, int param2, boolean param3, String param4, int param5) {
        int var7_int = 0;
        try {
          js.field_f.h(param2, 255);
          js.field_f.field_j = js.field_f.field_j + 1;
          var7_int = js.field_f.field_j;
          if (param0 < 18) {
            bb.a(false, true, (byte) -52, -121);
          }
          js.field_f.b(-16426, param1);
          js.field_f.a(param4, (byte) 0);
          js.field_f.c(param5, (byte) -127);
          js.field_f.c(param3 ? 1 : 0, (byte) -96);
          js.field_f.b(js.field_f.field_j - var7_int, (byte) 118);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "bb.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void b(byte param0) {
        field_d = null;
        if (param0 != 26) {
          return;
        }
        field_a = null;
    }

    final static void a(boolean param0, boolean param1, byte param2, int param3) {
        int stackIn_13_0 = 0;
        qr stackIn_25_0 = null;
        String stackIn_26_1 = null;
        qr stackIn_28_0 = null;
        String stackIn_29_1 = null;
        String stackIn_57_0 = null;
        qr stackIn_70_0 = null;
        boolean stackIn_71_1 = false;
        qr stackIn_75_0 = null;
        boolean stackIn_76_1 = false;
        qr stackIn_80_0 = null;
        boolean stackIn_81_1 = false;
        int stackIn_83_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        qr var5 = null;
        qr var6 = null;
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
        qr var15 = null;
        String var16 = null;
        qr var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          qo.a(22353, bc.field_b);
          if (param2 != -2) {
            field_d = (String) null;
          }
          if (he.field_p != null) {
            var15 = go.field_I;
            var17 = var15;
            go.field_I.field_mb = 0;
            var17.field_K = 0;
            var5 = aq.field_j;
            aq.field_j.field_mb = 0;
            var5.field_K = 0;
            var6 = dn.field_f;
            dn.field_f.field_mb = 0;
            var6.field_K = 0;
            tj.field_f.field_z = le.field_c.toUpperCase();
            var7 = (2 + pf.field_g.field_K) / 2;
            dn.field_f.a(-2 + var7, 40, (byte) 108, pf.field_g.field_mb - 40, 0);
            aq.field_j.a(-var7 + pf.field_g.field_K, 40, (byte) 73, pf.field_g.field_mb - 40, var7);
            if (nl.field_a.length == 1 &&
              2 == nl.field_a[0]) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (var10 < nl.field_a.length) {
                  stackIn_13_0 = ((id.field_c[var10 / 8] & 1 << (var10 & 7)) == 0) ? 0 : 1;
                  var11_int = stackIn_13_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    nl.field_a[var10] != 2) {
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
            aq.field_j.field_s = true;
            if (k.field_i) {
              i.field_g.field_s = false;
              oh.field_c.field_z = nb.field_c;
              if (var8 == 0) {
                stackIn_57_0 = cm.field_c;
              } else {
                stackIn_57_0 = mp.field_f;
              }
              var16 = stackIn_57_0;
              var9 = var16;
              var9 = var16;
              var9 = var16;
              var10Lifetime1 = dn.field_f.field_nb.c(var16) + 3 * dn.field_f.field_nb.a('.');
              dn.field_f.field_kb = (-var10Lifetime1 + dn.field_f.field_K) / 2;
              if (16 == (ln.field_w & 48)) {
                var9 = var16 + ".";
              }
              dn.field_f.field_y = 0;
              if ((48 & ln.field_w) == 32) {
                var9 = (String) (var9) + "..";
              }
              if ((48 & ln.field_w) == 48) {
                var9 = (String) (var9) + "...";
              }
              dn.field_f.field_z = (String) (var9);
              aq.field_j.field_z = fb.field_bc.toUpperCase();
            } else {
              stackIn_25_0 = aq.field_j;
              if (var8 != 0) {
                stackIn_26_1 = lo.field_A;
              } else {
                stackIn_26_1 = dk.field_a;
              }
              stackIn_25_0.field_z = ((String) (Object) stackIn_26_1).toUpperCase();
              stackIn_28_0 = oh.field_c;
              if (var8 != 0) {
                stackIn_29_1 = df.field_i;
              } else {
                stackIn_29_1 = qp.field_v;
              }
              stackIn_28_0.field_z = re.a(stackIn_29_1, 4371, new String[]{aq.field_j.field_z});
              dn.field_f.field_z = wg.field_b;
              i.field_g.field_s = true;
              wg.field_d = true;
              if (null != pe.field_D) {
                wg.field_d = false;
                qd.field_h = false;
                if (lr.field_c == null) {
                  lr.field_c = new byte[em.field_k];
                  ek.field_F = new boolean[em.field_k];
                }
                var13 = 0;
                var9_intLifetime1 = var13;
                while (var13 < em.field_k) {
                  ek.field_F[var13] = false;
                  var13++;
                }
                js.a(-1, param2 + 3, he.field_p, em.field_k, 0, true, -1, -1);
                if (!(bs.field_b < 2) &&
                  di.field_p[12]) {
                  wg.field_d = true;
                }
              }
              if (!wg.field_d) {
                aq.field_j.field_s = false;
                if (aq.field_j.field_v) {
                  var9 = null;
                  if (qd.field_h) {
                    var9 = "<col=A00000>" + wl.field_b + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; em.field_k > var10Lifetime1; var10Lifetime1++) {
                    if (ek.field_F[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + gm.field_l[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 == null) {
                        var9 = var11_ref;
                      } else {
                        var9 = (String) (var9) + ", " + var11_ref;
                      }
                    }
                  }
                  dn.field_k = "<col=A00000>" + gg.field_c + "<br>" + ji.field_F + (String) (var9);
                }
              }
            }
          }
          stackIn_70_0 = am.field_xb;
          stackIn_71_1 = (param1) && (!param0) && (!ti.field_e);
          ((qr) (Object) stackIn_70_0).a(stackIn_71_1, -20429);
          stackIn_75_0 = pf.field_g;
          stackIn_76_1 = (param1) && (!param0) && (!ti.field_e);
          ((qr) (Object) stackIn_75_0).a(stackIn_76_1, -20429);
          stackIn_80_0 = ed.field_d;
          stackIn_81_1 = (param1) && (!param0) && (ti.field_e);
          ((qr) (Object) stackIn_80_0).a(stackIn_81_1, -20429);
          n.field_h.field_d.f(false);
          if (he.field_p != null) {
            stackIn_83_0 = ~i.field_g.field_rb;
            if (stackIn_83_0 != -1) {
              je.a((byte) 62, param3);
            }
            if (0 != aq.field_j.field_rb) {
              if (!k.field_i) {
                rf.a(param3, 104);
              } else {
                oq.a(param3, false);
              }
            }
            sc.a(-109, true, he.field_p, param3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var4), "bb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_d = "<%0> is offering a rematch.";
        field_a = "Accept draw";
        field_b = 0;
    }
}
