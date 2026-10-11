/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh {
    static eb field_b;
    static int[] field_e;
    static String field_d;
    static wm field_c;
    static int field_g;
    private int[] field_f;
    static int field_a;

    public static void a(int param0) {
        field_e = null;
        if (param0 > -92) {
          field_c = (wm) null;
        }
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        String[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        String stackIn_77_2 = null;
        String[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        int stackIn_81_3 = 0;
        String stackIn_84_2 = null;
        boolean stackIn_93_0 = false;
        int stackIn_116_0 = 0;
        int stackIn_117_1 = 0;
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
        var9 = Chess.field_G;
        try {
          kb.field_S = true;
          gm.field_f = param2;
          if (gm.field_f == 0) {
            var3_int = vm.a(qi.field_m, -9224, vj.field_d, n.field_d, mk.field_a);
            var4 = 3 + var3_int;
            cb.field_k = new int[var4];
            ka.field_g = new String[var4];
            for (var5 = 0; var5 < var4; var5++) {
              cb.field_k[var5] = -1;
            }
            fi.field_c = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              ka.field_g[var5] = n.field_d[var5];
            }
            ka.field_g[-3 + var4] = "";
            ka.field_g[-2 + var4] = ph.field_m;
            cb.field_k[var4 - 2] = 0;
            fi.field_c[0] = 4;
            ka.field_g[var4 - 1] = sj.field_m;
            cb.field_k[var4 - 1] = 1;
            fi.field_c[1] = 5;
          } else if (gm.field_f == 1) {
            var3_int = vm.a(qi.field_m, -9224, vj.field_d, n.field_d, mk.field_a);
            var4 = var3_int + 2;
            cb.field_k = new int[var4];
            ka.field_g = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              cb.field_k[var5] = -1;
            }
            fi.field_c = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              ka.field_g[var5] = n.field_d[var5];
            }
            ka.field_g[-2 + var4] = "";
            ka.field_g[var4 - 1] = sj.field_m;
            cb.field_k[var4 - 1] = 0;
            fi.field_c[0] = 5;
          } else if (gm.field_f != 2) {
            if (3 == gm.field_f) {
              if (oc.field_l.field_k) {
                var3_int = vm.a(hl.field_a, -9224, vj.field_d, n.field_d, mk.field_a);
              } else {
                var3_int = vm.a(Chess.field_D, -9224, vj.field_d, n.field_d, mk.field_a);
              }
              var4 = 2 + var3_int;
              cb.field_k = new int[var4];
              ka.field_g = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                cb.field_k[var5] = -1;
              }
              fi.field_c = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                ka.field_g[var5] = n.field_d[var5];
              }
              ka.field_g[var4 - 2] = "";
              ka.field_g[-1 + var4] = sj.field_m;
              cb.field_k[-1 + var4] = 0;
              fi.field_c[0] = 5;
            } else if (gm.field_f == 4) {
              var3_int = vm.a(le.field_c, -9224, vj.field_d, n.field_d, mk.field_a);
              var4 = var3_int + 2;
              cb.field_k = new int[var4];
              ka.field_g = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                cb.field_k[var5] = -1;
              }
              fi.field_c = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                ka.field_g[var5] = n.field_d[var5];
              }
              ka.field_g[var4 - 2] = "";
              ka.field_g[-1 + var4] = sj.field_m;
              cb.field_k[var4 - 1] = 0;
              fi.field_c[0] = 5;
            } else {
              if (gm.field_f != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = vm.a(vd.field_Gb, -9224, vj.field_d, n.field_d, mk.field_a);
              var4 = 3 + var3_int;
              cb.field_k = new int[var4];
              ka.field_g = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                cb.field_k[var5] = -1;
              }
              fi.field_c = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                ka.field_g[var5] = n.field_d[var5];
              }
              ka.field_g[var4 - 3] = "";
              ka.field_g[-2 + var4] = lk.field_d;
              cb.field_k[var4 - 2] = 0;
              fi.field_c[0] = 3;
              ka.field_g[-1 + var4] = sj.field_m;
              cb.field_k[var4 - 1] = 1;
              fi.field_c[1] = 5;
            }
          } else {
            var3_int = vm.a(oc.a(i.field_a, new String[]{"<br><%0><br>"}, (byte) -110), -9224, vj.field_d, n.field_d, mk.field_a);
            var4 = -1;
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(n.field_d[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            ik.field_a = new String[var4];
            ne.a(n.field_d, 0, ik.field_a, 0, var4);
            tj.field_p = new String[-var4 + (var3_int - 1)];
            ne.a(n.field_d, 1 + var4, tj.field_p, 0, var3_int - var4 - 1);
            var4 = -1;
            var3_int = vm.a(oc.a(tb.field_e, new String[]{"<br><%0><br>"}, (byte) -105), -9224, vj.field_d, n.field_d, mk.field_a);
            for (var5 = 0; var5 < var3_int; var5++) {
              if (!"<%0>".equals(n.field_d[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            hj.field_l = new String[var4];
            ne.a(n.field_d, 0, hj.field_l, 0, var4);
            em.field_m = new String[-1 - var4 + var3_int];
            ne.a(n.field_d, 1 + var4, em.field_m, 0, -1 + (-var4 + var3_int));
            if (hj.field_l.length > ik.field_a.length) {
              stackIn_66_0 = hj.field_l.length;
            } else {
              stackIn_66_0 = ik.field_a.length;
            }
            var5 = stackIn_66_0;
            if (em.field_m.length > tj.field_p.length) {
              stackIn_69_0 = em.field_m.length;
            } else {
              stackIn_69_0 = tj.field_p.length;
            }
            var6 = stackIn_69_0;
            var7 = var5 + 7 + var6;
            ka.field_g = new String[var7];
            cb.field_k = new int[var7];
            for (var8 = 0; var7 > var8; var8++) {
              cb.field_k[var8] = -1;
            }
            ka.field_g[1] = rf.field_a;
            fi.field_c = new int[2];
            ka.field_g[0] = sj.field_a;
            cb.field_k[1] = 0;
            cb.field_k[3] = 1;
            ka.field_g[2] = rd.field_b;
            ka.field_g[4] = bb.field_a;
            fi.field_c[1] = 2;
            ka.field_g[3] = ag.field_b;
            fi.field_c[0] = 5;
            ka.field_g[5] = "";
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_76_0 = ka.field_g;
              stackIn_76_1 = var8Lifetime2 + 6;
              if (0 > -var5 + hj.field_l.length + var8Lifetime2) {
                stackIn_77_2 = "";
              } else {
                stackIn_77_2 = hj.field_l[-var5 + (hj.field_l.length + var8Lifetime2)];
              }
              stackIn_76_0[stackIn_76_1] = stackIn_77_2;
            }
            ka.field_g[var5 + 6] = null;
            cb.field_k[6 + var5] = -2;
            for (var8Lifetime3 = 0; var8Lifetime3 < var6; var8Lifetime3++) {
              stackIn_81_0 = ka.field_g;
              stackIn_81_1 = var8Lifetime3 + 7 + var5;
              stackIn_81_2 = ~em.field_m.length;
              stackIn_81_3 = ~var8Lifetime3;
              if (stackIn_81_2 >= stackIn_81_3) {
                stackIn_84_2 = "";
              } else {
                stackIn_84_2 = em.field_m[var8Lifetime3];
              }
              stackIn_81_0[stackIn_81_1] = stackIn_84_2;
            }
            jg.field_M = ud.a(2);
          }
          ol.field_R.field_f = fi.field_c.length;
          if (param0) {
            return;
          }
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; ka.field_g.length > var4Lifetime1; var4Lifetime1++) {
            stackIn_93_0 = !(cb.field_k[var4Lifetime1] < 0);
            var5Lifetime1 = kn.a(stackIn_93_0, false, ka.field_g[var4Lifetime1]);
            if (var5Lifetime1 > var3_intLifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (2 == gm.field_f) {
            var10 = ik.field_a;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var5Lifetime2 < var10.length; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = kn.a(false, false, var11);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = tj.field_p;
            for (var5Lifetime2Lifetime1 = 0; var5Lifetime2Lifetime1 < var4_ref_String__Lifetime1.length; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = kn.a(false, param0, var12);
              if (var7Lifetime1Lifetime1 > var3_intLifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          ca.field_j = -(var3_intLifetime1 >> 1) + (var3_intLifetime1 + ob.field_C);
          ai.field_j = ob.field_C - (var3_intLifetime1 >> 1);
          in.field_i = (kl.field_i + ek.field_b << 1) * ol.field_R.field_f;
          for (var4Lifetime2 = 0; ka.field_g.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_116_0 = in.field_i;
            if (cb.field_k[var4Lifetime2] < 0) {
              stackIn_117_1 = fd.field_n;
            } else {
              stackIn_117_1 = vh.field_c;
            }
            in.field_i = stackIn_116_0 + stackIn_117_1;
          }
          ak.field_j = kd.field_Hb - (in.field_i >> 1);
          cb.field_h = new int[ka.field_g.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = ak.field_j;
          while (var4Lifetime3 < ka.field_g.length) {
            var6Lifetime1 = cb.field_k[var4Lifetime3];
            if (var6Lifetime1 >= 0) {
              var7Lifetime2 = kn.a(true, param0, ka.field_g[var4Lifetime3]);
              var5Lifetime3 = var5Lifetime3 + ek.field_b;
              var8Lifetime1 = ob.field_C - (var7Lifetime2 >> 1);
              cb.field_h[var4Lifetime3] = new int[4];
              cb.field_h[var4Lifetime3][0] = -m.field_d + var8Lifetime1;
              cb.field_h[var4Lifetime3][1] = var5Lifetime3;
              cb.field_h[var4Lifetime3][2] = (m.field_d << 1) + var7Lifetime2;
              var5Lifetime3 = var5Lifetime3 + ((kl.field_i << 1) - (-ek.field_b - vh.field_c));
              cb.field_h[var4Lifetime3][3] = vh.field_c + (kl.field_i << 1);
            } else {
              var5Lifetime3 = var5Lifetime3 + fd.field_n;
            }
            var4Lifetime3++;
          }
          if (gm.field_f == 2) {
            ol.field_R.a(-1, -1, param1, 0);
          } else {
            ol.field_R.a(0, fe.a(hn.field_k, 1, rf.field_b), param1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "qh.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        var3 = (this.field_f.length >> 1) - 1;
        if (param1 != 17) {
          qh.a(true, false, 96);
        }
        var4 = param0 & var3;
        while (true) {
          var5 = this.field_f[var4 + (var4 + 1)];
          if (var5 == -1) {
            return -1;
          }
          if (this.field_f[var4 + var4] == param0) {
            return var5;
          }
          var4 = var3 & var4 + 1;
        }
    }

    qh(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while ((param0.length >> 1) + param0.length >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.field_f = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_f[var3] = -1;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < param0.length; var3Lifetime1++) {
            var4 = var2_int - 1 & param0[var3Lifetime1];
            while (this.field_f[var4 + var4 + 1] != -1) {
              var4 = -1 + var2_int & 1 + var4;
            }
            this.field_f[var4 + var4] = param0[var3Lifetime1];
            this.field_f[1 + var4 + var4] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("qh.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_d = "Security";
        field_e = new int[8192];
    }
}
