/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends ka implements vo {
    static String[] field_bb;
    private qm field_ab;

    private final qm a(String param0, byte param1, fn param2) {
        qm var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        qm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new qm(param0, param2);
          var4.field_y = (eb) ((Object) new ad());
          var5 = this.field_C - 6;
          this.field_C = this.field_C + 38;
          var4.a(-16 + (this.field_E - 14), (byte) 64, var5, 15, 30);
          if (param1 > -111) {
            field_bb = (String[]) null;
          }
          this.b(var4, 80);
          this.c((byte) 121);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("ic.M(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param0 == this.field_ab) {
            this.g(true);
          }
          if (param2 != 11) {
            ic.a(-85, true, 100, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ic.Q(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void g(boolean param0) {
        if (!param0) {
          this.field_ab = (qm) null;
        }
        if (!this.field_N) {
          return;
        }
        this.field_N = false;
    }

    ic(kn param0, fp param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ng var4 = null;
        try {
          var3 = null;
          if (jg.field_F == param1) {
            var3 = mn.field_a;
          } else {
            if (ia.field_c != param1) {
              if (param1 == fh.field_Q) {
                var3 = ha.field_k;
                this.field_C = this.field_C + 30;
              }
            } else {
              this.field_C = this.field_C + 10;
              var3 = l.field_o;
              if (ke.a(false)) {
                this.field_C = this.field_C + 20;
                var3 = co.field_e;
              }
            }
          }
          var4 = new ng((String) (var3), (fn) null);
          var4.field_z = 0;
          var4.field_E = this.field_E;
          var4.field_C = 80;
          var4.field_p = 50;
          var4.field_y = (eb) ((Object) new uc(ep.field_b, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b(var4, 80);
          this.field_ab = this.a(od.field_Hb, (byte) -126, (fn) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ic.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3) {
        int stackIn_11_0 = 0;
        String stackIn_25_0 = null;
        ak stackIn_34_0 = null;
        String stackIn_35_1 = null;
        ak stackIn_37_0 = null;
        String stackIn_38_1 = null;
        ak stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        boolean stackIn_70_2 = false;
        ak stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        boolean stackIn_75_2 = false;
        ak stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        boolean stackIn_82_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ak var5 = null;
        ak var6 = null;
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
        ak var15 = null;
        String var16 = null;
        ak var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          cm.b(vn.field_g, param2 ^ 4743);
          if (bn.field_S != null) {
            wm.field_d.field_nb = 0;
            var15 = wm.field_d;
            var17 = var15;
            var17.field_K = 0;
            var5 = ep.field_a;
            ep.field_a.field_nb = 0;
            var5.field_K = 0;
            var6 = nk.field_e;
            nk.field_e.field_nb = 0;
            var6.field_K = 0;
            vp.field_Qb.field_cb = vn.field_d.toUpperCase();
            var7 = (ai.field_A.field_K + 2) / 2;
            nk.field_e.a(ai.field_A.field_nb - 40, 40, 0, 256, -2 + var7);
            ep.field_a.a(ai.field_A.field_nb - 40, 40, var7, 256, ai.field_A.field_K - var7);
            if (ia.field_a.length == 1 &&
              ia.field_a[0] == 2) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (var10 < ia.field_a.length) {
                  stackIn_11_0 = ((qm.field_J[var10 / 8] & 1 << (7 & var10)) == 0) ? 0 : 1;
                  var11_int = stackIn_11_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    2 != ia.field_a[var10]) {
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
            ep.field_a.field_rb = true;
            if (!rl.field_r) {
              stackIn_34_0 = ep.field_a;
              if (var8 == 0) {
                stackIn_35_1 = bc.field_n;
              } else {
                stackIn_35_1 = qo.field_x;
              }
              stackIn_34_0.field_cb = ((String) (Object) stackIn_35_1).toUpperCase();
              stackIn_37_0 = an.field_a;
              if (var8 != 0) {
                stackIn_38_1 = oh.field_d;
              } else {
                stackIn_38_1 = vk.field_sb;
              }
              stackIn_37_0.field_cb = sd.a(stackIn_38_1, 59, new String[]{ep.field_a.field_cb});
              gk.field_kb.field_rb = true;
              nk.field_e.field_cb = dn.field_b;
              pb.field_f = true;
              if (null != h.field_Z) {
                ib.field_b = false;
                if (null == kf.field_o) {
                  lc.field_t = new boolean[fj.field_b];
                  kf.field_o = new byte[fj.field_b];
                }
                pb.field_f = false;
                var13 = 0;
                var9_intLifetime1 = var13;
                while (fj.field_b > var13) {
                  lc.field_t[var13] = false;
                  var13++;
                }
                no.a(fj.field_b, 0, (byte) 91, true, -1, -1, bn.field_S, -1);
                if (!(wo.field_h < 2) &&
                  bc.field_m[12]) {
                  pb.field_f = true;
                }
              }
              if (!pb.field_f) {
                ep.field_a.field_rb = false;
                if (ep.field_a.field_R) {
                  var9 = null;
                  if (ib.field_b) {
                    var9 = "<col=A00000>" + pk.field_e + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; var10Lifetime1 < fj.field_b; var10Lifetime1++) {
                    if (lc.field_t[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + jk.field_e[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 != null) {
                        var9 = (String) (var9) + ", " + var11_ref;
                      } else {
                        var9 = var11_ref;
                      }
                    }
                  }
                  up.field_o = "<col=A00000>" + lo.field_Gb + "<br>" + ij.field_p + (String) (var9);
                }
              }
            } else {
              an.field_a.field_cb = mj.field_g;
              gk.field_kb.field_rb = false;
              if (var8 != 0) {
                stackIn_25_0 = ag.field_o;
              } else {
                stackIn_25_0 = oi.field_b;
              }
              var16 = stackIn_25_0;
              var9 = var16;
              var9 = var16;
              var9 = var16;
              var10Lifetime1 = nk.field_e.field_Db.c(var16) + nk.field_e.field_Db.a('.') * 3;
              if (16 == (48 & rb.field_o)) {
                var9 = var16 + ".";
              }
              nk.field_e.field_C = (nk.field_e.field_K - var10Lifetime1) / 2;
              nk.field_e.field_Bb = 0;
              if ((rb.field_o & 48) == 32) {
                var9 = (String) (var9) + "..";
              }
              if ((rb.field_o & 48) == 48) {
                var9 = (String) (var9) + "...";
              }
              nk.field_e.field_cb = (String) (var9);
              ep.field_a.field_cb = fa.field_f.toUpperCase();
            }
          }
          stackIn_69_0 = ff.field_h;
          stackIn_69_1 = -28476;
          stackIn_70_2 = (param1) && (!param3) && (!bm.field_o);
          ((ak) (Object) stackIn_69_0).a(stackIn_69_1, stackIn_70_2);
          stackIn_74_0 = ai.field_A;
          stackIn_74_1 = param2 - 28479;
          stackIn_75_2 = (param1) && (!param3) && (!bm.field_o);
          ((ak) (Object) stackIn_74_0).a(stackIn_74_1, stackIn_75_2);
          if (param2 != 3) {
            field_bb = (String[]) null;
          }
          stackIn_81_0 = ra.field_e;
          stackIn_81_1 = param2 ^ -28473;
          stackIn_82_2 = (param1) && (!param3) && (bm.field_o);
          ((ak) (Object) stackIn_81_0).a(stackIn_81_1, stackIn_82_2);
          nd.field_b.field_g.b((byte) -108);
          if (null != bn.field_S) {
            if (0 != gk.field_kb.field_P) {
              fb.a(1, param0);
            }
            if (ep.field_a.field_P != 0) {
              if (!rl.field_r) {
                r.a(param2 - 3, param0);
              } else {
                wo.c(-1, param0);
              }
            }
            be.a(true, bn.field_S, param0, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "ic.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void e(byte param0) {
        field_bb = null;
        int var1 = 90 / ((param0 - 62) / 41);
    }

    static {
        field_bb = new String[]{"Online head-to-head rated games", "Unlimited Challenge Mode levels", "Complete all fifty puzzles", "Full screen mode"};
    }
}
