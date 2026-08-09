/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm extends vg implements qb {
    private hc field_eb;
    static long[][] field_db;
    static int[] field_bb;
    static String field_Z;
    static long[] field_ab;
    static ed[] field_cb;
    static int[] field_fb;

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (param3 == 1) {
                break L1;
              } else {
                tm.c(-26, 47, -12);
                break L1;
              }
            }
            L2: {
              if (param0 != this.field_eb) {
                break L2;
              } else {
                this.o(127);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var6);

            stackIn_7_1 = new StringBuilder().append("tm.K(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static qe[] c(int param0, int param1, int param2) {
        int var12 = 0;
        int[] var19 = null;
        qe var14 = null;
        int var15 = EscapeVector.field_A;
        int var3 = 12;
        int[] var4 = new int[]{3170352, 6332512};
        int[] var5 = new int[]{6340704, 16777215};
        if (param0 != 10) {
            field_bb = (int[]) null;
        }
        int var6 = 16777215;
        int var7 = 1;
        ih var8 = fh.field_g;
        int[][] var18 = gd.field_U[param2];
        int var10 = je.a(false, param2);
        if (1 + param1 < var10) {
            var10 = 1 + param1;
        }
        qe[] var11 = new qe[var10];
        for (var12 = 0; var12 < var10; var12++) {
            var19 = var18[var12];
            var14 = new qe(var12, var19, var3, var4, var5, var6, var7, var8);
            var11[var12] = var14;
        }
        return var11;
    }

    tm(tb param0, fc param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        hm var4 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (ge.field_h == param1) {
                var3 = tj.field_k;
                break L1;
              } else {
                if (param1 == ck.field_A) {
                  this.field_x = this.field_x + 10;
                  var3 = ol.field_K;
                  if (!tb.a(false)) {
                    break L1;
                  } else {
                    var3 = e.field_b;
                    this.field_x = this.field_x + 20;
                    break L1;
                  }
                } else {
                  if (um.field_d != param1) {
                    break L1;
                  } else {
                    var3 = eg.field_a;
                    this.field_x = this.field_x + 30;
                    break L1;
                  }
                }
              }
            }
            var4 = new hm((String) (var3), (wn) null);
            var4.field_j = 50;
            var4.field_x = 80;
            var4.field_g = this.field_g;
            var4.field_k = 0;
            var4.field_s = (db) ((Object) new k(ke.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.b(var4, false);
            this.field_eb = this.a(-1, ah.field_k, (wn) (this));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("tm.<init>(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    public static void n(int param0) {
        field_ab = null;
        field_cb = null;
        field_db = (long[][]) null;
        if (param0 != -23008) {
            tm.c(105, -33, -63);
        }
        field_Z = null;
        field_fb = null;
        field_bb = null;
    }

    private final hc a(int param0, String param1, wn param2) {
        hc discarded$1 = null;
        hc var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        wn var6 = null;
        hc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new hc(param1, param2);
              if (param0 == -1) {
                break L1;
              } else {
                var6 = (wn) null;
                discarded$1 = this.a(36, (String) null, (wn) null);
                break L1;
              }
            }
            var4.field_s = (db) ((Object) new ck());
            var5 = this.field_x - 6;
            this.field_x = this.field_x + 38;
            var4.a(-16 + this.field_g - 14, var5, 15, true, 30);
            this.b(var4, false);
            this.i(param0 + 1);
            stackIn_3_0 = (hc) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("tm.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void o(int param0) {
        if (!this.field_G) {
            return;
        }
        this.field_G = false;
        if (param0 <= 120) {
            tm.c(-66, -5, 40);
        }
    }

    private static long a(long param0, long param1) {
        return param0 | param1;
    }

    static {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        field_bb = new int[8192];
        field_ab = new long[11];
        field_Z = "Email (Login):";
        field_db = new long[8][256];
        field_cb = new ed[5];
        for (var0 = 0; var0 < 256; var0++) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = -1 == (var0 & 1 ^ -1) ? (long)(var1 >>> -1648659448) : (long)(255 & var1);
            var4 = var2 << 1224233473;
            if (!((var4 ^ -1L) > -257L)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1261329729;
            if (!((var6 ^ -1L) > -257L)) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << -1269217791;
            if (256L <= var10) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_db[0][var0] = tm.a(tm.a(tm.a(var8 << -1152304688, tm.a(tm.a(tm.a(var6 << 790963624, tm.a(var2 << -1093897800, var2 << -668761936)), var2 << 473541600), var10 << -2020525224)), var4 << 1902389832), var12);
            for (var14 = 1; var14 < 8; var14++) {
                field_db[var14][var0] = tm.a(field_db[-1 + var14][var0] >>> 589328392, field_db[-1 + var14][var0] << -1136273224);
            }
        }
        field_ab[0] = 0L;
        int var15 = 1;
        var0 = var15;
        while (10 >= var15) {
            var1 = -8 + 8 * var15;
            field_ab[var15] = ja.a(fn.a(field_db[7][7 + var1], 255L), ja.a(ja.a(fn.a(field_db[5][var1 + 5], 16711680L), ja.a(fn.a(4278190080L, field_db[4][4 + var1]), ja.a(ja.a(fn.a(field_db[2][2 + var1], 280375465082880L), ja.a(fn.a(field_db[1][var1 - -1], 71776119061217280L), fn.a(field_db[0][var1], -72057594037927936L))), fn.a(1095216660480L, field_db[3][3 + var1])))), fn.a(65280L, field_db[6][var1 + 6])));
            var15++;
        }
    }
}
