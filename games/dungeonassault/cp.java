/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp extends gd {
    static String field_T;
    static boolean field_U;
    static String field_P;
    ac field_S;
    static String[] field_Q;
    static int field_R;
    static String field_O;

    final void b(int param0, int param1, int param2) {
        cn var8 = null;
        int var9 = 0;
        int var10 = 0;
        if (param1 != 8187) {
            return;
        }
        int var4 = param0 + (((cp) this).field_t - 3);
        int var5 = -3 + (param2 + ((cp) this).field_i);
        int var6 = 5 + (((cp) this).field_q + var4);
        int var7 = 5 + var5 - -((cp) this).field_x;
        if (var4 <= gf.field_h) {
            if (gf.field_e >= var5) {
                // if_icmpgt L87
                // if_icmplt L87
            } else {
                return;
            }
            gf.b(var4, var5, ((cp) this).field_q - -5, ((cp) this).field_x - -5, 0, 128);
            super.b(param0, param1 + 0, param2);
            var8 = ((cp) this).field_S.field_d.a(40, 0, 40, 0);
            var9 = ((cp) this).field_x + var5 - 42;
            var10 = var4 - -5;
            if (var8 == null) {
                gf.b(var10, var9, 32, 32, 0);
            } else {
                var8.c(var10, var9);
            }
            return;
        }
    }

    cp(int param0, int param1, ac param2) {
        super(param0, param1, 0, 0, 0);
        String var4 = null;
        int var5 = 0;
        String[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        cn var11 = null;
        cn var12 = null;
        cn var13 = null;
        int var14 = 0;
        int var15 = 0;
        cn var16 = null;
        cn var17 = null;
        String var19 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        gp stackIn_15_0 = null;
        String stackIn_15_1 = null;
        gp stackIn_16_0 = null;
        String stackIn_16_1 = null;
        gp stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        gp stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        gp stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        gp stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        gp stackOut_14_0 = null;
        String stackOut_14_1 = null;
        gp stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        gp stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        gp stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        gp stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        gp stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        L0: {
          ((cp) this).field_S = param2;
          var19 = ((cp) this).field_S.field_z;
          var4 = var19;
          var5 = ((cp) this).field_S.field_c;
          var6 = jn.a(var19, new int[2], -108, (se) (Object) db.field_v);
          var7 = db.field_v.field_H * var6.length + la.field_b.field_H + 42;
          if (-1 <= (pb.field_G ^ -1)) {
            if ((((cp) this).field_S.field_j & 1) != 0) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var8 = stackIn_6_0;
          if (-1 == (gm.field_d.field_e ^ -1)) {
            if ((((cp) this).field_S.field_j & 2) != 0) {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L1;
            } else {
              stackOut_9_0 = 0;
              stackIn_12_0 = stackOut_9_0;
              break L1;
            }
          } else {
            stackOut_7_0 = 0;
            stackIn_12_0 = stackOut_7_0;
            break L1;
          }
        }
        var9 = stackIn_12_0;
        var10 = var8 | var9;
        var11 = new cn(140, var7);
        var12 = new cn(140, var7);
        var13 = new cn(140, var7);
        jh.a(var11);
        gf.a();
        var14 = 0;
        var15 = 0;
        L2: while (true) {
          if (var15 >= var6.length) {
            L3: {
              var14 = var14 + (la.field_b.field_H - -2);
              if (var8 == 0) {
                if (var9 == 0) {
                  la.field_b.b(jk.a(new String[1], n.field_a, 30496), 52, var14, 12632256, -1);
                  break L3;
                } else {
                  la.field_b.b(be.field_q, 52, var14, 16711680, -1);
                  break L3;
                }
              } else {
                la.field_b.b(dn.field_T, 52, var14, 16711680, -1);
                break L3;
              }
            }
            L4: {
              var14 += 4;
              var12.e();
              var15 = -40 + (var7 + -5);
              gf.a();
              var11.e(0, 0, 16744448);
              al.a(52, var14, false, ((cp) this).field_S, 16744448);
              rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
              var13.e();
              gf.a();
              var11.e(0, 0, 12690143);
              al.a(52, var14, false, ((cp) this).field_S, 10449103);
              rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
              var11.e();
              al.a(52, var14, false, ((cp) this).field_S, 12632256);
              rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
              jh.b();
              var16 = rb.a(16, var12, 255, (byte) -95);
              var17 = rb.a(16, var12, 16711680, (byte) -75);
              ((cp) this).a(var12, var11, var17, var13, (byte) 126, var16);
              ((cp) this).field_n = (en) (Object) new bd(((cp) this).field_S);
              if (var10 == 0) {
                break L4;
              } else {
                ((cp) this).field_w = false;
                break L4;
              }
            }
          } else {
            L5: {
              var14 = var14 + la.field_b.field_H;
              stackOut_14_0 = la.field_b;
              stackOut_14_1 = var6[var15];
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              if (var15 != 0) {
                stackOut_16_0 = (gp) (Object) stackIn_16_0;
                stackOut_16_1 = (String) (Object) stackIn_16_1;
                stackOut_16_2 = la.field_b.field_H;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                break L5;
              } else {
                stackOut_15_0 = (gp) (Object) stackIn_15_0;
                stackOut_15_1 = (String) (Object) stackIn_15_1;
                stackOut_15_2 = 0;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                break L5;
              }
            }
            L6: {
              stackOut_17_0 = (gp) (Object) stackIn_17_0;
              stackOut_17_1 = (String) (Object) stackIn_17_1;
              stackOut_17_2 = stackIn_17_2;
              stackOut_17_3 = var14;
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              stackIn_19_3 = stackOut_17_3;
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              stackIn_18_3 = stackOut_17_3;
              if (var10 == 0) {
                stackOut_19_0 = (gp) (Object) stackIn_19_0;
                stackOut_19_1 = (String) (Object) stackIn_19_1;
                stackOut_19_2 = stackIn_19_2;
                stackOut_19_3 = stackIn_19_3;
                stackOut_19_4 = 16760832;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                stackIn_20_2 = stackOut_19_2;
                stackIn_20_3 = stackOut_19_3;
                stackIn_20_4 = stackOut_19_4;
                break L6;
              } else {
                stackOut_18_0 = (gp) (Object) stackIn_18_0;
                stackOut_18_1 = (String) (Object) stackIn_18_1;
                stackOut_18_2 = stackIn_18_2;
                stackOut_18_3 = stackIn_18_3;
                stackOut_18_4 = 8421504;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_20_2 = stackOut_18_2;
                stackIn_20_3 = stackOut_18_3;
                stackIn_20_4 = stackOut_18_4;
                break L6;
              }
            }
            ((gp) (Object) stackIn_20_0).b(stackIn_20_1, stackIn_20_2, stackIn_20_3, stackIn_20_4, -1);
            var15++;
            continue L2;
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1, byte param2, int param3, String[] param4, int param5) {
        int var8 = DungeonAssault.field_K;
        mj.field_f = param1.getParameter("overxgames");
        if (!(null != mj.field_f)) {
            mj.field_f = "0";
        }
        dh.field_f = param1.getParameter("overxachievements");
        if (dh.field_f == null) {
            dh.field_f = "0";
        }
        String var6 = param1.getParameter("currency");
        if (var6 == null) {
            wo.field_g = 2;
        } else {
            if (!sj.a((CharSequence) (Object) var6, 10)) {
                wo.field_g = 2;
            } else {
                wo.field_g = ri.a((byte) 87, (CharSequence) (Object) var6);
            }
        }
        uj.field_d = param5;
        lj.field_u = param3;
        ld.field_c = param0;
        en.field_b = new cn[param4.length];
        int var7 = 0;
        if (param2 != -36) {
            int discarded$0 = cp.f(104, 12, -116);
        }
        while (var7 < param4.length) {
            en.field_b[var7] = new cn(317, 34);
            var7++;
        }
        ec.field_l = param4;
    }

    final static int f(int param0, int param1, int param2) {
        int var3 = 49 % ((56 - param0) / 49);
        int var4 = param2 >>> -1410169089;
        return (var4 + param2) / param1 - var4;
    }

    public static void c(byte param0) {
        field_O = null;
        field_Q = null;
        field_P = null;
        if (param0 != -66) {
            field_U = false;
        }
        field_T = null;
    }

    final static void f(int param0) {
        int var2 = DungeonAssault.field_K;
        if (!(fm.a((byte) -123))) {
            // ifnull L128
            if (cm.field_R.field_g) {
                ib.a(930);
                na.field_D.a((lm) (Object) new nm(na.field_D, of.field_g), -1);
            }
            return;
        }
        boolean discarded$8 = na.field_D.a(am.field_e, (byte) 66, bp.field_d, true);
        na.field_D.b(true);
        while (ha.b((byte) 47)) {
            boolean discarded$9 = na.field_D.a(param0 + 30335, mm.field_t, ob.field_Yb);
        }
        if (param0 != -30208) {
            cp.c((byte) 49);
        }
        return;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "If the trap here is triggered, the room will almost instantly fill with a gangrenous-looking poison gas.";
        field_U = false;
        field_O = "Giant Rats";
        field_R = 64;
        field_T = "Login: ";
    }
}
