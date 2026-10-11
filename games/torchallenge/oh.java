/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static long[][] field_b;
    static String field_a;
    static long[] field_f;
    static String field_c;
    static k field_d;
    static int field_e;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -4) {
          field_d = (k) null;
        }
        field_f = null;
        field_b = (long[][]) null;
        field_c = null;
        field_d = null;
    }

    final static void a(long param0, String param1, java.applet.Applet param2, String param3, int param4) {
        try {
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param2.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param3 + "=" + param1 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param0 >= (long)param4) {
                var7Lifetime4 = var9 + "; Expires=" + td.a(param0 * 1000L + ol.a(256), (byte) -8) + "; Max-Age=" + param0;
              } else {
                var7Lifetime4 = var9 + "; Discard;";
              }
              ff.a(param2, "document.cookie=\"" + var7Lifetime4 + "\"", (byte) 1);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var6_ref;
            stackIn_9_1 = new StringBuilder().append("oh.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
            if (param2 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
            if (param3 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static k a(byte param0, int param1) {
        int var3 = 0;
        k[] var2;
        int var4;
        String var5;
        k[] var6;
        var4 = TorChallenge.field_F ? 1 : 0;
        var6 = nj.a((byte) 104);
        var2 = var6;
        if (param0 < 122) {
          var5 = (String) null;
          oh.a(-4L, (String) null, (java.applet.Applet) null, (String) null, 93);
        }
        for (var3 = 0; var3 < var6.length; var3++) {
          if (var6[var3].field_i == param1) {
            return var6[var3];
          }
        }
        return null;
    }

    static {
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_b = new long[8][256];
        field_f = new long[11];
        field_c = "Passwords must be between 5 and 20 characters long";
        field_a = "ERROR: missing text";
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = (1 & var0) != 0 ? (long)(255 & var1) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (!(var4 < 256L)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (256L <= var6) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (!(var10 < 256L)) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_b[0][var0] = rj.a(rj.a(var4 << 8, rj.a(rj.a(rj.a(rj.a(rj.a(var2 << 56, var2 << 48), var6 << 40), var2 << 32), var10 << 24), var8 << 16)), var12);
            for (var14 = 1; var14 < 8; var14++) {
                field_b[var14][var0] = rj.a(field_b[-1 + var14][var0] << 56, field_b[var14 - 1][var0] >>> 8);
            }
            var0++;
        }
        field_f[0] = 0L;
        int var15 = 1;
        var0 = var15;
        while (var15 <= 10) {
            var1 = -8 + var15 * 8;
            field_f[var15] = d.a(d.a(ba.a(field_b[6][var1 + 6], 65280L), d.a(d.a(ba.a(4278190080L, field_b[4][var1 + 4]), d.a(ba.a(field_b[3][var1 + 3], 1095216660480L), d.a(ba.a(280375465082880L, field_b[2][2 + var1]), d.a(ba.a(field_b[1][var1 + 1], 71776119061217280L), ba.a(field_b[0][var1], -72057594037927936L))))), ba.a(field_b[5][5 + var1], 16711680L))), ba.a(field_b[7][7 + var1], 255L));
            var15++;
        }
        field_e = 0;
        field_d = new k(6, 0, 4, 2);
    }
}
