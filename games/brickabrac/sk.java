/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends h {
    static String field_G;
    static jp[] field_J;
    static int field_I;
    int field_K;
    static int field_H;

    public sk() {
        super(0, 0, 0, 0, (ub) null, (uh) null);
        ((sk) this).field_K = 256;
    }

    final static void a(String[] args, int param1, oi param2, int param3, boolean param4, int param5) {
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var17 = null;
        qj stackIn_6_0 = null;
        boolean stackIn_6_1 = false;
        qj stackIn_7_0 = null;
        boolean stackIn_7_1 = false;
        qj stackIn_8_0 = null;
        boolean stackIn_8_1 = false;
        qj stackIn_9_0 = null;
        boolean stackIn_9_1 = false;
        qj stackIn_10_0 = null;
        boolean stackIn_10_1 = false;
        int stackIn_10_2 = 0;
        qj stackOut_5_0;
        boolean stackOut_5_1;
        qj stackOut_6_0;
        boolean stackOut_6_1;
        qj stackOut_7_0;
        boolean stackOut_7_1;
        qj stackOut_8_0;
        boolean stackOut_8_1;
        int stackOut_8_2;
        qj stackOut_9_0;
        boolean stackOut_9_1;
        int stackOut_9_2;
        L0: {
          var9 = BrickABrac.field_J ? 1 : 0;
          fj.field_Ub = null;
          ep.field_i = 23;
          fp.field_z = 57;
          od.field_c = 13;
          if (param5 == -12665) {
            break L0;
          } else {
            sk.a(122);
            break L0;
          }
        }
        og.field_Wb = 3;
        hg.field_e = 51550 + (hi.field_w.b(102) << 463076464);
        ek.field_kb = 72;
        qm.field_a = 40;
        tm.field_g = 11;
        var6 = (1 << param3) - 1;
        var16 = new int[param3];
        var14 = var16;
        var12 = var14;
        var10 = var12;
        var7 = var10;
        var8 = 0;
        L1: while (true) {
          if (param3 <= var8) {
            L2: {
              L3: {
                var17 = id.a(hi.field_w, false);
                pe.field_o = new qj(args, -1, var6, param2, var16, var17);
                pe.field_o.a((byte) 119, param1);
                pe.field_o.field_q = true;
                stackOut_5_0 = pe.field_o;
                stackOut_5_1 = pe.field_o.field_s;
                stackIn_9_0 = stackOut_5_0;
                stackIn_9_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (kb.field_Yb < 2) {
                  break L3;
                } else {
                  stackOut_6_0 = (qj) (Object) stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_9_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (param3 != 1) {
                    break L3;
                  } else {
                    stackOut_7_0 = (qj) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (!qg.field_t) {
                      break L3;
                    } else {
                      stackOut_8_0 = (qj) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      break L2;
                    }
                  }
                }
              }
              stackOut_9_0 = (qj) (Object) stackIn_9_0;
              stackOut_9_1 = stackIn_9_1;
              stackOut_9_2 = 0;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            }
            ((qj) (Object) stackIn_10_0).field_s = stackIn_10_1 | stackIn_10_2 != 0;
            ng.a(param4, 103, -1);
            return;
          } else {
            var7[var8] = hi.field_w.b(97);
            var8++;
            continue L1;
          }
        }
    }

    final static void i(byte param0) {
        int[] var9 = null;
        int[] var7 = null;
        int[] var4 = null;
        int[] var1 = null;
        int var2 = 0;
        int[] var10 = null;
        int[] var8 = null;
        int[] var5 = null;
        int var6 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        if (hd.field_d == null) {
            return;
        }
        if (lp.field_rb instanceof km) {
            ((km) (Object) lp.field_rb).d((byte) 79);
        }
        lp.field_rb = hd.field_d;
        hd.field_d = null;
        kh.field_a = 0;
        if (cc.field_G) {
            cc.field_G = false;
            pe.field_o = null;
        }
        if (param0 > -112) {
            field_J = null;
        }
        if (eb.field_l) {
            fj.field_Ub = null;
            lp.field_wb.c((byte) -121);
            var9 = mk.field_b;
            var7 = var9;
            var4 = var7;
            var1 = var4;
            for (var2 = 0; var2 < 8; var2++) {
                var9[var2] = 0;
            }
            var10 = pl.field_b;
            var8 = var10;
            var5 = var8;
            var1 = var5;
            var6 = 0;
            var2 = var6;
            while (8 > var6) {
                var10[var6] = 0;
                var6++;
            }
            eb.field_l = false;
        }
        if (!(!dp.field_y)) {
            eq.a(7);
            bf.a((byte) 119);
            uc.e(-94);
            dp.field_y = false;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param2 != 0) {
            return;
        }
        if (!(((sk) this).field_E != null)) {
            return;
        }
        if (!(0 != ((sk) this).field_K)) {
            return;
        }
        if (!(256 != ((sk) this).field_K)) {
            ((sk) this).field_E.a(param0 + ((sk) this).field_w, param1 - -((sk) this).field_o, param2, (byte) -11);
            return;
        }
        jp var6 = new jp(((sk) this).field_E.field_t, ((sk) this).field_E.field_s);
        fc.a(-113, var6);
        ((sk) this).field_E.a(0, 0, param2, param3);
        sc.b(param3 ^ 119);
        var6.b(param1 + ((sk) this).field_o, param0 - -((sk) this).field_w, ((sk) this).field_K);
    }

    public static void a(int param0) {
        if (param0 != 51550) {
            field_G = null;
        }
        field_J = null;
        field_G = null;
    }

    final static l a(byte param0, kl param1) {
        l var2 = new l(param1, (nm) (Object) param1);
        int var3 = 30 % ((param0 - 58) / 43);
        wd.field_v.a((nm) (Object) var2, (byte) 3);
        ob.field_J.b((qd) (Object) param1);
        return var2;
    }

    sk(oc param0) {
        super(param0.field_o, param0.field_w, param0.field_t, param0.field_s, (ub) null, (uh) null);
        param0.a(((sk) this).field_s, 0, 0, (byte) -119, ((sk) this).field_t);
        ((sk) this).field_K = 256;
        ((sk) this).field_E = param0;
    }

    static {
    }
}
