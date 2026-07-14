/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends cg {
    private boolean field_m;
    static int field_l;
    static long[] field_o;
    static long[] field_n;
    private String field_p;
    static long[][] field_k;
    static int field_j;

    final static int b(int param0, int param1) {
        int var2 = 0;
        if (!(-1 != param1)) {
            return 0;
        }
        if (-1 < param1) {
            var2 = 1;
            if (param1 < -65536) {
                param1 = param1 >> 16;
                var2 += 16;
            }
            if (-256 < param1) {
                var2 += 8;
                param1 = param1 >> 8;
            }
            if (param1 > 15) {
                param1 = param1 >> 4;
                var2 += 4;
            }
            if (!(-4 <= (param1 ^ -1))) {
                var2 += 2;
                param1 = param1 >> 2;
            }
            if (!(param1 >= -2)) {
                param1 = param1 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (!(65535 <= param1)) {
            var2 += 16;
            param1 = param1 >> 16;
        }
        if (param0 != -27571) {
            return 56;
        }
        if (255 < (param1 ^ -1)) {
            var2 += 8;
            param1 = param1 >> 8;
        }
        if ((param1 ^ -1) > 15) {
            param1 = param1 >> 4;
            var2 += 4;
        }
        if (!(param1 >= -4)) {
            param1 = param1 >> 2;
            var2 += 2;
        }
        if (param1 < -2) {
            var2++;
            param1 = param1 >> 1;
        }
        return var2;
    }

    public static void h(int param0) {
        field_k = (long[][]) null;
        field_n = null;
        field_o = null;
        if (param0 != 0) {
            field_j = 77;
        }
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = Main.field_T;
        ag.field_b.b(-127);
        for (var1 = 0; var1 < 32; var1++) {
            ak.field_P[var1] = 0L;
        }
        var1 = 0;
        if (param0 >= -5) {
            field_j = -80;
        }
        while (32 > var1) {
            field_n[var1] = 0L;
            var1++;
        }
        de.field_c = 0;
    }

    final static int a(boolean param0, boolean param1, String param2) {
        if (param0) {
            hj.h(107);
        }
        if (param1) {
            return c.field_u.a(param2);
        }
        return mb.field_a.a(param2);
    }

    hj(hf param0) {
        super(param0);
        ((hj) this).field_m = false;
    }

    final void g(int param0) {
        ((hj) this).field_p = null;
        if (param0 <= 70) {
            field_n = (long[]) null;
        }
    }

    final sg a(String param0, int param1) {
        nk var3 = null;
        CharSequence var4 = null;
        sg stackIn_15_0 = null;
        sg stackOut_14_0 = null;
        sg stackOut_13_0 = null;
        var4 = (CharSequence) param0;
        if (!bi.a(var4, (byte) 28)) {
          return pe.field_b;
        } else {
          L0: {
            if (param1 < -58) {
              break L0;
            } else {
              hj.a(-78, 71);
              break L0;
            }
          }
          L1: {
            if (!param0.equals((Object) (Object) ((hj) this).field_p)) {
              L2: {
                var3 = mh.a(-63, param0);
                if (var3 == null) {
                  break L2;
                } else {
                  if (null == ((nk) var3).field_d) {
                    ((hj) this).field_m = ((nk) var3).field_b;
                    ((hj) this).field_p = param0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              return a.field_n;
            } else {
              break L1;
            }
          }
          L3: {
            if (((hj) this).field_m) {
              stackOut_14_0 = ii.field_e;
              stackIn_15_0 = stackOut_14_0;
              break L3;
            } else {
              stackOut_13_0 = pe.field_b;
              stackIn_15_0 = stackOut_13_0;
              break L3;
            }
          }
          return (sg) (Object) stackIn_15_0;
        }
    }

    final String a(String param0, boolean param1) {
        nk var4 = null;
        if (param1) {
            ((hj) this).field_m = false;
        }
        CharSequence var5 = (CharSequence) param0;
        String var3 = hf.a(var5, (byte) 36);
        if (!(var3 == null)) {
            return var3;
        }
        if (!param0.equals((Object) (Object) ((hj) this).field_p)) {
            var4 = mh.a(-63, param0);
            if (var4 == null) {
                return null;
            }
            if (null != ((nk) var4).field_d) {
                return null;
            }
            ((hj) this).field_m = ((nk) var4).field_b;
            ((hj) this).field_p = param0;
        }
        if (!((hj) this).field_m) {
            return ui.field_K;
        }
        return vd.field_k;
    }

    final static void a(int param0, int param1) {
        if (param0 != 2) {
            String var3 = (String) null;
            int discarded$0 = hj.a(true, false, (String) null);
        }
        int discarded$1 = vf.b((byte) 99);
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
        int var15 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        bk discarded$1 = new bk();
        field_o = new long[11];
        field_n = new long[32];
        field_k = new long[8][256];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_o[0] = 0L;
            var15 = 1;
            var0 = var15;
            L1: while (true) {
              if (-11 > (var15 ^ -1)) {
              } else {
                var1 = (var15 + -1) * 8;
                field_o[var15] = ji.a(ji.a(ji.a(rl.a(field_k[5][5 + var1], 16711680L), ji.a(ji.a(ji.a(ji.a(rl.a(71776119061217280L, field_k[1][1 + var1]), rl.a(-72057594037927936L, field_k[0][var1])), rl.a(field_k[2][2 + var1], 280375465082880L)), rl.a(field_k[3][3 + var1], 1095216660480L)), rl.a(field_k[4][var1 + 4], 4278190080L))), rl.a(field_k[6][6 + var1], 65280L)), rl.a(255L, field_k[7][7 + var1]));
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((var0 & 1) == 0) {
                stackOut_4_0 = (long)(var1 >>> -870880888);
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
              var4 = var2 << 2124226241;
              if (256L > var4) {
                break L3;
              } else {
                var4 = var4 ^ 285L;
                break L3;
              }
            }
            L4: {
              var6 = var4 << -713032127;
              if ((var6 ^ -1L) > -257L) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << 139639745;
              if (-257L < (var10 ^ -1L)) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_k[0][var0] = v.a(v.a(var4 << 1777541000, v.a(v.a(v.a(var2 << 1046522592, v.a(v.a(var2 << 609697200, var2 << -1521315208), var6 << 728407272)), var10 << -469316840), var8 << 1377679184)), var12);
            var14 = 1;
            L6: while (true) {
              if (-9 >= (var14 ^ -1)) {
                var0++;
                continue L0;
              } else {
                field_k[var14][var0] = v.a(field_k[var14 - 1][var0] << 1194182904, field_k[-1 + var14][var0] >>> 1939892168);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
