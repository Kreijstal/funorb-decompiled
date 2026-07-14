/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vka extends kna {
    static long[][] field_I;
    private f field_G;
    static long[] field_H;
    private im field_F;

    final void q(byte param0) {
        super.q(param0);
        ((vka) this).b(param0 ^ -14, 4194304, 4194304);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            field_H = null;
            return false;
        }
        return false;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return true;
        }
        return true;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa var4 = new fsa(param2, param0);
        if (param1 != 3) {
            boolean discarded$0 = ((vka) this).s(88);
        }
        var4.b((byte) -11, ((vka) this).field_k, ((vka) this).field_l);
        ((vka) this).field_F = new im(param2, param0);
        var4.a((byte) 83, (nv) (Object) ((vka) this).field_F);
        return var4;
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        if (param0) {
            return;
        }
        ((vka) this).field_G.a(param1, 120, ((vka) this).o((byte) -123));
    }

    final void w(int param0) {
        super.w(-124);
        ((vka) this).field_G.a(((vka) this).o((byte) -20), false);
        if (param0 >= -122) {
            ((vka) this).q((byte) -60);
        }
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    final void x(int param0) {
        lj var3 = null;
        super.x(param0);
        if (((vka) this).field_F == null) {
            return;
        }
        lj[] var4 = ((vka) this).field_G.a((byte) -103);
        lj[] var2 = var4;
        if (var4.length >= 1) {
            var3 = var4[0];
            if (var3 instanceof fsa) {
                ((vka) this).field_F.g((byte) 99).a(9, new lj[1]);
            }
        }
    }

    vka(la param0, int param1) {
        super(param0, param1);
        ((vka) this).field_G = new f(1, 1);
    }

    final static boolean A(int param0) {
        if (param0 <= 57) {
            field_I = null;
        }
        return dq.field_f != null ? true : bn.field_n;
    }

    final int t(int param0) {
        if (param0 != 8) {
            boolean discarded$0 = ((vka) this).s(-24);
        }
        return 3;
    }

    public static void e(boolean param0) {
        if (param0) {
            return;
        }
        field_H = null;
        field_I = null;
    }

    vka(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        ((vka) this).field_G = new f(1, 1);
        ((vka) this).field_G = new f(1, 1, param0.field_E, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_I = new long[8][256];
        field_H = new long[11];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_H[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (10 < var0) {
                int discarded$1 = bia.a((byte) 93, 1600);
              } else {
                var1 = (var0 + -1) * 8;
                field_H[var0] = oo.a(oo.a(vi.a(65280L, field_I[6][6 + var1]), oo.a(vi.a(field_I[5][var1 - -5], 16711680L), oo.a(vi.a(4278190080L, field_I[4][4 + var1]), oo.a(oo.a(oo.a(vi.a(field_I[0][var1], -72057594037927936L), vi.a(71776119061217280L, field_I[1][var1 + 1])), vi.a(280375465082880L, field_I[2][2 + var1])), vi.a(field_I[3][var1 - -3], 1095216660480L))))), vi.a(255L, field_I[7][7 + var1]));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (0 == (1 & var0)) {
                stackOut_4_0 = (long)(var1 >>> -386276536);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(255 & var1);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 194500097;
              if ((var4 ^ -1L) > -257L) {
                break L3;
              } else {
                var4 = var4 ^ 285L;
                break L3;
              }
            }
            L4: {
              var6 = var4 << -1332700223;
              if (var6 >= 256L) {
                var6 = var6 ^ 285L;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var8 = var2 ^ var6;
              var10 = var6 << 1476275457;
              if (-257L >= (var10 ^ -1L)) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var2 ^ var10;
            field_I[0][var0] = jb.a(var12, jb.a(jb.a(jb.a(var10 << -25906600, jb.a(var2 << -568896544, jb.a(jb.a(var2 << -1979719688, var2 << 1917942128), var6 << -1367977752))), var8 << 646746256), var4 << -729432632));
            var14 = 1;
            L6: while (true) {
              if (8 <= var14) {
                var0++;
                continue L0;
              } else {
                field_I[var14][var0] = jb.a(field_I[-1 + var14][var0] << -1374833288, field_I[var14 + -1][var0] >>> -1766029432);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
