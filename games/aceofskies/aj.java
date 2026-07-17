/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends qd {
    static eg field_u;
    private byte[] field_q;
    static ef field_s;
    static hd field_r;
    static qo field_v;
    static long[] field_w;
    static long[][] field_t;

    public static void c() {
        field_r = null;
        field_w = null;
        field_v = null;
        field_u = null;
        field_s = null;
        field_t = null;
    }

    final void b(int param0, int param1, byte param2) {
        param2 = (byte)(((param2 & 255) >> 1) + 127);
        if (param0 != 255) {
            field_r = null;
        }
        int var4 = param1 * 2;
        int incrementValue$0 = var4;
        var4++;
        ((aj) this).field_q[incrementValue$0] = (byte)param2;
        ((aj) this).field_q[var4] = (byte)param2;
    }

    aj() {
        super(12, 5, 16, 2, 2, 0.44999998807907104f);
    }

    final byte[] a(int param0, int param1, int param2, int param3) {
        ((aj) this).field_q = new byte[param2 * (param3 * param1 * 2)];
        ((aj) this).a(true, param2, param3, param1);
        if (param0 != -4) {
            return null;
        }
        return ((aj) this).field_q;
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
        field_u = new eg();
        field_s = null;
        field_r = new hd(1);
        field_v = new qo();
        field_t = new long[8][256];
        field_w = new long[11];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_w[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (var0 > 10) {
                return;
              } else {
                var1 = 8 * (var0 - 1);
                field_w[var0] = un.a(un.a(un.a(un.a(ct.a(4278190080L, field_t[4][var1 - -4]), un.a(un.a(un.a(ct.a(-72057594037927936L, field_t[0][var1]), ct.a(71776119061217280L, field_t[1][var1 - -1])), ct.a(field_t[2][2 + var1], 280375465082880L)), ct.a(1095216660480L, field_t[3][var1 - -3]))), ct.a(field_t[5][5 + var1], 16711680L)), ct.a(65280L, field_t[6][6 + var1])), ct.a(255L, field_t[7][var1 - -7]));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (0 == (var0 & 1)) {
                stackOut_4_0 = (long)(var1 >>> 8);
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
              var4 = var2 << 1;
              if (256L <= var4) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << 1;
              if (var6 < 256L) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << 1;
              if (var10 < 256L) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_t[0][var0] = fk.a(fk.a(fk.a(var8 << 16, fk.a(var10 << 24, fk.a(var2 << 32, fk.a(var6 << 40, fk.a(var2 << 56, var2 << 48))))), var4 << 8), var12);
            var14 = 1;
            L6: while (true) {
              if (8 <= var14) {
                var0++;
                continue L0;
              } else {
                field_t[var14][var0] = fk.a(field_t[-1 + var14][var0] >>> 8, field_t[var14 + -1][var0] << 56);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
