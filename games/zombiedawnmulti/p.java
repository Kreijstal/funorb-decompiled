/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static long[] field_d;
    static int field_e;
    static String field_c;
    static go field_a;
    static String field_b;
    static long[][] field_f;

    final static gh a(int param0, String param1, int param2) {
        gh var3 = new gh(false);
        var3.field_c = param2;
        if (param0 > -26) {
            field_f = null;
        }
        var3.field_h = param1;
        return var3;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        sb.field_c = param0;
        if (param2) {
            p.a(35);
        }
        kk.field_x = param1;
        ua.field_N = param3;
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        field_f = null;
        field_a = null;
        field_c = null;
        if (param0 != 5) {
            lk discarded$0 = p.a(6, 69, -42, false);
        }
    }

    final static lk a(int param0, int param1, int param2, boolean param3) {
        lk var4_ref = null;
        if (!param3) {
            return null;
        }
        lk var4 = (lk) (Object) bo.field_a.g(83);
        if (var4 == null) {
            var4_ref = new lk();
        }
        var4_ref.a(param0, param2, param1, 7457);
        return var4_ref;
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
        field_b = "Members";
        field_c = "Invite players";
        field_f = new long[8][256];
        field_d = new long[11];
        var0 = 0;
        L0: while (true) {
          if ((var0 ^ -1) <= -257) {
            field_d[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (10 < var0) {
              } else {
                var1 = 8 * (-1 + var0);
                field_d[var0] = tq.a(en.a(255L, field_f[7][var1 + 7]), tq.a(en.a(65280L, field_f[6][var1 + 6]), tq.a(tq.a(tq.a(tq.a(en.a(field_f[2][var1 + 2], 280375465082880L), tq.a(en.a(-72057594037927936L, field_f[0][var1]), en.a(field_f[1][var1 + 1], 71776119061217280L))), en.a(field_f[3][var1 - -3], 1095216660480L)), en.a(4278190080L, field_f[4][4 + var1])), en.a(field_f[5][5 + var1], 16711680L))));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (0 == (1 & var0)) {
                stackOut_4_0 = (long)(var1 >>> -1298148760);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 & 255);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1418576833;
              if (-257L < (var4 ^ -1L)) {
                break L3;
              } else {
                var4 = var4 ^ 285L;
                break L3;
              }
            }
            L4: {
              var6 = var4 << -2049087039;
              if (256L <= var6) {
                var6 = var6 ^ 285L;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << 321199169;
              if (var10 >= 256L) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var2 ^ var10;
            field_f[0][var0] = cp.a(cp.a(var4 << 1206698504, cp.a(cp.a(var10 << 267271768, cp.a(cp.a(var6 << 1745849384, cp.a(var2 << 185810808, var2 << -928002896)), var2 << -459343200)), var8 << -1456734000)), var12);
            var14 = 1;
            L6: while (true) {
              if (-9 >= (var14 ^ -1)) {
                var0++;
                continue L0;
              } else {
                field_f[var14][var0] = cp.a(field_f[-1 + var14][var0] << -851414472, field_f[-1 + var14][var0] >>> -1286415224);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
