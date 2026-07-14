/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static String field_e;
    static String field_b;
    static ac[] field_i;
    static long[] field_a;
    static cn[] field_g;
    static nh field_c;
    static long[][] field_h;
    static boolean field_f;
    static String field_j;
    static wh field_d;

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_d = null;
        field_g = null;
        field_i = null;
        field_c = null;
        field_h = null;
        field_a = null;
        field_j = null;
        if (param0 != 7) {
            String discarded$0 = gh.a(-121, (byte) 117);
        }
    }

    final static void a(int param0, String param1, boolean param2) {
        cd.field_b = true;
        jd.field_l = param2 ? true : false;
        a.field_n = new nk(lg.field_w, hc.field_f, param1, qc.field_t, jd.field_l);
        lg.field_w.a((lm) (Object) a.field_n, -1);
        if (param0 != 23321) {
            field_i = null;
        }
    }

    final static String a(int param0, byte param1) {
        if (!((param0 ^ -1) <= -1)) {
            return "-" + -param0 / 10 + "." + -param0 % 10;
        }
        if (param1 >= -97) {
            Object var3 = null;
            ek discarded$0 = gh.a(101, -9, -53, 62, (qg) null, -6);
        }
        return param0 / 10 + "." + param0 % 10;
    }

    final static ek a(int param0, int param1, int param2, int param3, qg param4, int param5) {
        java.awt.Frame var8 = ga.a(param4, param5, param0, param2, 122, param3);
        java.awt.Frame var6 = var8;
        if (var8 == null) {
            return null;
        }
        ek var7 = new ek();
        var7.field_e = var8;
        java.awt.Component discarded$6 = var7.field_e.add((java.awt.Component) (Object) var7);
        var7.setBounds(0, 0, param5, param3);
        var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
        var7.requestFocus();
        if (param1 >= -63) {
            return null;
        }
        return var7;
    }

    final static void a(int param0, int param1) {
        if (param1 != 11) {
            return;
        }
        Object var3 = null;
        qh.a(-13716, (rj) null, param0);
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
        field_i = new ac[38];
        field_e = "Centaur";
        field_b = "Hugely muscled man wearing only a loincloth and leather helm for protection, but wielding a ridiculously large hammer to compensate. The berserker enters a trance-like state when he engages foes in combat, giving him great strength, but leaving him vulnerable to skilled opponents.";
        field_a = new long[11];
        field_h = new long[8][256];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_a[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (var0 > 10) {
                field_j = "Horns, claws, hooves, spines and a long tongue; the beastman is formed of many animals and more dangerous than all of them put together.";
              } else {
                var1 = var0 * 8 - 8;
                field_a[var0] = mn.a(eg.a(255L, field_h[7][var1 - -7]), mn.a(mn.a(mn.a(eg.a(4278190080L, field_h[4][var1 - -4]), mn.a(eg.a(field_h[3][3 + var1], 1095216660480L), mn.a(mn.a(eg.a(field_h[1][1 + var1], 71776119061217280L), eg.a(-72057594037927936L, field_h[0][var1])), eg.a(field_h[2][var1 - -2], 280375465082880L)))), eg.a(16711680L, field_h[5][var1 + 5])), eg.a(field_h[6][var1 + 6], 65280L)));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (0 == (var0 & 1)) {
                stackOut_4_0 = (long)(var1 >>> -399659256);
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
              var4 = var2 << -1789322751;
              if (256L <= var4) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << -206107199;
              if (var6 >= 256L) {
                var6 = var6 ^ 285L;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << -1380804991;
              if (256L > var10) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_h[0][var0] = id.a(var12, id.a(id.a(var8 << -1363977072, id.a(id.a(id.a(var6 << -1210259608, id.a(var2 << 462685872, var2 << -271114568)), var2 << 335481120), var10 << -1032317160)), var4 << -764004152));
            var14 = 1;
            L6: while (true) {
              if ((var14 ^ -1) <= -9) {
                var0++;
                continue L0;
              } else {
                field_h[var14][var0] = id.a(field_h[-1 + var14][var0] >>> -824951992, field_h[-1 + var14][var0] << 1643075832);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
