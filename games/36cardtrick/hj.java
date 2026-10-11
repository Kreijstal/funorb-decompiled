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
        int var2;
        int var2Lifetime1;
        if (param1 == 0) {
          return 0;
        }
        if (param1 > 0) {
          var2 = 1;
          if (param1 > 65535) {
            param1 = param1 >> 16;
            var2 += 16;
          }
          if (param1 > 255) {
            var2 += 8;
            param1 = param1 >> 8;
          }
          if (param1 > 15) {
            param1 = param1 >> 4;
            var2 += 4;
          }
          if (param1 > 3) {
            var2 += 2;
            param1 = param1 >> 2;
          }
          if (param1 > 1) {
            param1 = param1 >> 1;
            var2++;
          }
          return var2;
        }
        var2Lifetime1 = 2;
        if (param1 < -65536) {
          var2Lifetime1 += 16;
          param1 = param1 >> 16;
        }
        if (param0 != -27571) {
          return 56;
        }
        if (param1 < -256) {
          var2Lifetime1 += 8;
          param1 = param1 >> 8;
        }
        if (param1 < -16) {
          param1 = param1 >> 4;
          var2Lifetime1 += 4;
        }
        if (param1 < -4) {
          param1 = param1 >> 2;
          var2Lifetime1 += 2;
        }
        if (param1 < -2) {
          var2Lifetime1++;
          param1 = param1 >> 1;
        }
        return var2Lifetime1;
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
        int var1_int = 0;
        int var2 = Main.field_T;
        int var1_intLifetime1;
        try {
          ag.field_b.b(-127);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            ak.field_P[var1_int] = 0L;
          }
          var1_intLifetime1 = 0;
          if (param0 >= -5) {
            field_j = -80;
          }
          while (32 > var1_intLifetime1) {
            field_n[var1_intLifetime1] = 0L;
            var1_intLifetime1++;
          }
          de.field_c = 0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "hj.J(" + param0 + ')');
        }
    }

    final static int a(boolean param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            hj.h(107);
          }
          if (!param1) {
            stackIn_6_0 = mb.field_a.a(param2);
            return stackIn_6_0;
          }
          stackIn_4_0 = c.field_u.a(param2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("hj.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    hj(hf param0) {
        super(param0);
        this.field_m = false;
    }

    final void g(int param0) {
        this.field_p = null;
        if (param0 <= 70) {
          field_n = (long[]) null;
        }
    }

    final sg a(String param0, int param1) {
        nk var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        sg stackIn_3_0 = null;
        sg stackIn_12_0 = null;
        sg stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!bi.a(var4, (byte) 28)) {
            stackIn_3_0 = pe.field_b;
            return stackIn_3_0;
          }
          if (param1 >= -58) {
            hj.a(-78, 71);
          }
          if (!param0.equals(this.field_p)) {
            var3 = mh.a(-63, param0);
            if (var3 != null &&
              null == var3.field_d) {
              this.field_m = var3.field_b;
              this.field_p = param0;
            } else {
              stackIn_12_0 = a.field_n;
              return stackIn_12_0;
            }
          }
          if (this.field_m) {
            stackIn_17_0 = ii.field_e;
          } else {
            stackIn_17_0 = pe.field_b;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("hj.M(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final String a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        nk var4 = null;
        CharSequence var5 = null;
        String stackIn_5_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            this.field_m = false;
          }
          var5 = (CharSequence) ((Object) param0);
          var3 = hf.a(var5, (byte) 36);
          if (var3 != null) {
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (!param0.equals(this.field_p)) {
            var4 = mh.a(-63, param0);
            if (var4 == null) {
              return null;
            }
            if (null != var4.field_d) {
              return null;
            }
            this.field_m = var4.field_b;
            this.field_p = param0;
          }
          if (this.field_m) {
            stackIn_17_0 = vd.field_k;
            return stackIn_17_0;
          }
          stackIn_15_0 = ui.field_K;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("hj.I(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 2) {
          String var3 = (String) null;
          hj.a(true, false, (String) null);
        }
        vf.b((byte) 99);
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
        bk discarded$0 = new bk();
        field_o = new long[11];
        field_n = new long[32];
        field_k = new long[8][256];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = (var0 & 1) != 0 ? (long)(255 & var1) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (256L <= var4) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (var10 >= 256L) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_k[0][var0] = v.a(v.a(var4 << 8, v.a(v.a(v.a(var2 << 32, v.a(v.a(var2 << 48, var2 << 56), var6 << 40)), var10 << 24), var8 << 16)), var12);
            for (var14 = 1; var14 < 8; var14++) {
                field_k[var14][var0] = v.a(field_k[var14 - 1][var0] << 56, field_k[-1 + var14][var0] >>> 8);
            }
            var0++;
        }
        field_o[0] = 0L;
        int var15 = 1;
        var0 = var15;
        while (var15 <= 10) {
            var1 = (var15 - 1) * 8;
            field_o[var15] = ji.a(ji.a(ji.a(rl.a(field_k[5][5 + var1], 16711680L), ji.a(ji.a(ji.a(ji.a(rl.a(71776119061217280L, field_k[1][1 + var1]), rl.a(-72057594037927936L, field_k[0][var1])), rl.a(field_k[2][2 + var1], 280375465082880L)), rl.a(field_k[3][3 + var1], 1095216660480L)), rl.a(field_k[4][var1 + 4], 4278190080L))), rl.a(field_k[6][6 + var1], 65280L)), rl.a(255L, field_k[7][7 + var1]));
            var15++;
        }
    }
}
