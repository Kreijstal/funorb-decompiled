/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so {
    static long[][] field_b;
    static long[] field_a;
    static dl field_d;
    static am field_g;
    static wb field_h;
    static int[] field_f;
    static j field_c;
    static int field_e;

    public static void a(int param0) {
        if (param0 != -11774) {
          un var2 = (un) null;
          so.a((Object) null, (un) null, false);
        }
        field_a = null;
        field_h = null;
        field_f = null;
        field_b = (long[][]) null;
        field_g = null;
        field_d = null;
        field_c = null;
    }

    final static void a(Object param0, un param1, boolean param2) {
        int var3_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        try {
          if (!param2) {
            field_d = (dl) null;
          }
          if (null == param1.field_d) {
            return;
          }
          for (var3_int = 0; var3_int < 50; var3_int++) {
            if (null != param1.field_d.peekEvent()) {
              fh.a(true, 1L);
              continue;
            }
            break;
          }
          try {
            if (null != param0) {
              param1.field_d.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param0, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("so.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
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
        field_a = new long[11];
        field_b = new long[8][256];
        int var0 = 0;
        while (256 > var0) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 != (var0 & 1) ? (long)(255 & var1) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (var4 >= 256L) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (!(var10 < 256L)) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_b[0][var0] = jb.a(var12, jb.a(jb.a(jb.a(var10 << 24, jb.a(jb.a(jb.a(var2 << 56, var2 << 48), var6 << 40), var2 << 32)), var8 << 16), var4 << 8));
            for (var14 = 1; 8 > var14; var14++) {
                field_b[var14][var0] = jb.a(field_b[var14 - 1][var0] << 56, field_b[var14 - 1][var0] >>> 8);
            }
            var0++;
        }
        field_a[0] = 0L;
        int var15 = 1;
        var0 = var15;
        while (var15 <= 10) {
            var1 = var15 * 8 - 8;
            field_a[var15] = km.a(ao.a(field_b[7][7 + var1], 255L), km.a(km.a(ao.a(field_b[5][var1 + 5], 16711680L), km.a(ao.a(4278190080L, field_b[4][var1 + 4]), km.a(km.a(ao.a(280375465082880L, field_b[2][var1 + 2]), km.a(ao.a(field_b[0][var1], -72057594037927936L), ao.a(field_b[1][1 + var1], 71776119061217280L))), ao.a(1095216660480L, field_b[3][var1 + 3])))), ao.a(field_b[6][var1 + 6], 65280L)));
            var15++;
        }
        field_h = new wb();
        field_e = 0;
    }
}
