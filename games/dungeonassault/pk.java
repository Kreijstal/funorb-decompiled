/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends kl {
    boolean field_r;
    private pp field_n;
    static cn field_o;
    int field_u;
    static String field_q;
    private String field_p;
    private String field_m;
    private pp field_s;
    static int field_t;

    pk(String param0, String param1, int param2) {
        this(param0, param1, mp.field_e.toUpperCase(), um.field_d.toUpperCase(), param2);
    }

    public static void e(int param0) {
        if (param0 <= 84) {
            pk.d(-81);
            field_o = null;
            field_q = null;
            return;
        }
        field_o = null;
        field_q = null;
    }

    final static void a(int param0, String param1) {
        ai.a(param1, 14);
        gh.a(23321, sl.field_a, false);
        if (param0 >= -1) {
            pk.d(79);
        }
    }

    final static void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        wj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        ak var12 = null;
        pe var13 = null;
        pe var14 = null;
        wj var15 = null;
        var9 = DungeonAssault.field_K;
        var15 = ra.field_c;
        var3 = -99 % ((72 - param0) / 50);
        var2 = var15.c(true);
        if (var2 != 0) {
          if (1 != var2) {
            if (var2 == 2) {
              var14 = (pe) (Object) sf.field_c.e(-24172);
              if (var14 == null) {
                tl.a(-43);
                return;
              } else {
                int[] discarded$1 = wa.b(-1);
                var14.a(false);
                return;
              }
            } else {
              sm.a((Throwable) null, 1, "A1: " + sj.l(192));
              tl.a(-16);
              return;
            }
          } else {
            var12 = (ak) (Object) oh.field_j.e(-24172);
            if (var12 == null) {
              tl.a(-110);
              return;
            } else {
              var12.a(false);
              return;
            }
          }
        } else {
          var11 = wa.b(-1);
          var4 = var11;
          var10 = var11;
          var5 = var10;
          var6 = var15;
          var7 = ((ec) (Object) var6).c(true);
          var8 = 0;
          L0: while (true) {
            if (var7 <= var8) {
              var13 = (pe) (Object) sf.field_c.e(-24172);
              if (var13 == null) {
                tl.a(111);
                return;
              } else {
                var13.a(false);
                return;
              }
            } else {
              var10[var8] = ((ec) (Object) var6).h(-111);
              var8++;
              continue L0;
            }
          }
        }
    }

    final void b(int param0) {
        super.b(-81);
        int var2 = 78 / ((41 - param0) / 63);
        int var3 = 60 + ((pk) this).field_j;
        int discarded$0 = la.field_b.a(((pk) this).field_m, 40 + ((pk) this).field_k, var3, -80 + ((pk) this).field_a, -16 + ((pk) this).field_i + (((pk) this).field_j - var3 - (jm.field_i.field_v >> -159726815)), 16777215, -1, 1, 1, la.field_b.field_H);
    }

    final void b(byte param0) {
        int[] var2 = null;
        int var3_int = 0;
        cn var3 = null;
        int[] var4 = null;
        cn var5 = null;
        int var9 = 0;
        int[] var10 = null;
        cn var11 = null;
        cn var12 = null;
        ph var13 = null;
        cn var14 = null;
        cn var15 = null;
        ph var16 = null;
        var9 = DungeonAssault.field_K;
        var10 = new int[64];
        var2 = var10;
        var3_int = 0;
        L0: while (true) {
          if (64 <= var3_int) {
            var3 = te.a(-32 + ((pk) this).field_a, ((pk) this).field_i - 28, var10, 16, 8, 0.125);
            var4 = te.b(-32 + ((pk) this).field_a, -28 + ((pk) this).field_i, 0.125);
            var5 = new cn(0, 0);
            if (param0 != 37) {
              field_q = null;
              var5.field_y = -32 + ((pk) this).field_a;
              var5.field_v = ((pk) this).field_i + -28;
              var5.field_B = var4;
              var13 = new ph(var3, var5);
              var11 = new cn(((pk) this).field_a, ((pk) this).field_i);
              var12 = new cn(((pk) this).field_a, ((pk) this).field_i);
              ((pk) this).field_l = new ph(var11, var12);
              jh.a(((pk) this).field_l);
              var13.b(16, 16);
              qe.a(23, 13, -46 + ((pk) this).field_a, ((pk) this).field_i - 34, 256, 32, 8, 128);
              jc.a(-26 + ((pk) this).field_i, 16, 14, 1, 2, 1);
              jc.a(-26 + ((pk) this).field_i, ((pk) this).field_a + -24, 14, 1, 2, 1);
              vd.a(-16 + ((pk) this).field_a, 2, -14561, 2, 8, 0);
              vd.a(((pk) this).field_a, 2, -14561, 2, 0, 6);
              vd.a(((pk) this).field_a, 2, param0 ^ -14534, 2, 0, 54);
              vd.a(((pk) this).field_a + -16, 2, param0 ^ -14534, 2, 8, ((pk) this).field_i - 16);
              vd.a(((pk) this).field_a, 2, -14561, 2, 0, -22 + ((pk) this).field_i);
              jc.a(40, 80, 14, 1, 2, 1);
              jc.a(40, -88 + ((pk) this).field_a, 14, 1, 2, 1);
              oe.field_m.h(8, 21);
              oe.field_m.j(-63 + ((pk) this).field_a, 21);
              ad.field_e.i(23, -38 + ((pk) this).field_i);
              ad.field_e.f(((pk) this).field_a - 39, ((pk) this).field_i + -38);
              da.a(((pk) this).field_p, cm.field_M, ((pk) this).field_a >> -60042527, 1917623617, (36 + ne.field_c.field_H >> 1173340545) + 14, (se) (Object) ne.field_c);
              jh.b();
              return;
            } else {
              var5.field_y = -32 + ((pk) this).field_a;
              var5.field_v = ((pk) this).field_i + -28;
              var5.field_B = var4;
              var16 = new ph(var3, var5);
              var14 = new cn(((pk) this).field_a, ((pk) this).field_i);
              var15 = new cn(((pk) this).field_a, ((pk) this).field_i);
              ((pk) this).field_l = new ph(var14, var15);
              jh.a(((pk) this).field_l);
              var16.b(16, 16);
              qe.a(23, 13, -46 + ((pk) this).field_a, ((pk) this).field_i - 34, 256, 32, 8, 128);
              jc.a(-26 + ((pk) this).field_i, 16, 14, 1, 2, 1);
              jc.a(-26 + ((pk) this).field_i, ((pk) this).field_a + -24, 14, 1, 2, 1);
              vd.a(-16 + ((pk) this).field_a, 2, -14561, 2, 8, 0);
              vd.a(((pk) this).field_a, 2, -14561, 2, 0, 6);
              vd.a(((pk) this).field_a, 2, param0 ^ -14534, 2, 0, 54);
              vd.a(((pk) this).field_a + -16, 2, param0 ^ -14534, 2, 8, ((pk) this).field_i - 16);
              vd.a(((pk) this).field_a, 2, -14561, 2, 0, -22 + ((pk) this).field_i);
              jc.a(40, 80, 14, 1, 2, 1);
              jc.a(40, -88 + ((pk) this).field_a, 14, 1, 2, 1);
              oe.field_m.h(8, 21);
              oe.field_m.j(-63 + ((pk) this).field_a, 21);
              ad.field_e.i(23, -38 + ((pk) this).field_i);
              ad.field_e.f(((pk) this).field_a - 39, ((pk) this).field_i + -38);
              da.a(((pk) this).field_p, cm.field_M, ((pk) this).field_a >> -60042527, 1917623617, (36 + ne.field_c.field_H >> 1173340545) + 14, (se) (Object) ne.field_c);
              jh.b();
              return;
            }
          } else {
            var10[var3_int] = mp.a((24 + var3_int) * 65793, -2147483648);
            var3_int++;
            continue L0;
          }
        }
    }

    pk(String param0, String param1, String param2, String param3, int param4) {
        ((pk) this).field_p = param0;
        ((pk) this).field_u = param4;
        ((pk) this).field_m = param1;
        int var6 = 78 + (jm.field_i.field_v + oj.a(((pk) this).field_m, -1, new int[1], (se) (Object) la.field_b) * la.field_b.field_H);
        ((pk) this).a(450, 0, var6);
        ((pk) this).field_d = false;
        ((pk) this).field_n = tn.a(-jm.field_i.field_y + (-10 + (((pk) this).field_a >> 497027105)) + ((pk) this).field_k, ((pk) this).field_i + (((pk) this).field_j - 16) - (jm.field_i.field_v >> 100273633), (se) (Object) ne.field_c, jm.field_i, -67, param2);
        ((pk) this).field_s = tn.a(((pk) this).field_k - (-(((pk) this).field_a >> -1710957919) - 10), -(jm.field_i.field_v >> -524225183) + -16 + (((pk) this).field_j + ((pk) this).field_i), (se) (Object) ne.field_c, jm.field_i, -93, param3);
        ((pk) this).field_f.a((ne) (Object) ((pk) this).field_n, false);
        ((pk) this).field_f.a((ne) (Object) ((pk) this).field_s, false);
    }

    final void a(boolean param0) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        if (param0) {
          L0: {
            field_o = null;
            super.a(param0);
            if (hh.field_s != null) {
              L1: {
                ((pk) this).field_d = true;
                stackOut_10_0 = this;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if ((Object) (Object) ((pk) this).field_n != (Object) (Object) hh.field_s) {
                  stackOut_12_0 = this;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L1;
                } else {
                  stackOut_11_0 = this;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L1;
                }
              }
              ((pk) this).field_r = stackIn_13_1 != 0;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L2: {
            super.a(param0);
            if (hh.field_s != null) {
              L3: {
                ((pk) this).field_d = true;
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if ((Object) (Object) ((pk) this).field_n != (Object) (Object) hh.field_s) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L3;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L3;
                }
              }
              ((pk) this).field_r = stackIn_6_1 != 0;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Swinging his morningstar wildly, the zealot has been fighting constantly for his cause so long he is no longer sure what it was.";
        field_t = 0;
    }
}
