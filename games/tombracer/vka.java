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
        this.b(param0 ^ -14, 4194304, 4194304);
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
          field_H = (long[]) null;
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
        fsa var4 = null;
        RuntimeException var4_ref = null;
        fsa stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new fsa(param2, param0);
          if (param1 != 3) {
            this.s(88);
          }
          var4.b((byte) -11, this.field_k, this.field_l);
          this.field_F = new im(param2, param0);
          var4.a((byte) 83, (nv) (this.field_F));
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("vka.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void a(boolean param0, kh param1) {
        super.a(param0, param1);
        if (param0) {
          return;
        }
        try {
          this.field_G.a(param1, 120, this.o((byte) -123));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vka.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void w(int param0) {
        super.w(-124);
        this.field_G.a(this.o((byte) -20), false);
        if (param0 >= -122) {
          this.q((byte) -60);
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
        if (this.field_F == null) {
          return;
        }
        lj[] var4 = this.field_G.a((byte) -103);
        lj[] var2 = var4;
        if (var4.length >= 1) {
          var3 = var4[0];
          if (var3 instanceof fsa) {
            this.field_F.g((byte) 99).a(9, new lj[]{var3});
          }
        }
    }

    vka(la param0, int param1) {
        super(param0, param1);
        this.field_G = new f(1, 1);
    }

    final static boolean A(int param0) {
        if (param0 <= 57) {
          field_I = (long[][]) null;
        }
        return dq.field_f != null ? true : bn.field_n;
    }

    final int t(int param0) {
        if (param0 != 8) {
          this.s(-24);
        }
        return 3;
    }

    public static void e(boolean param0) {
        if (param0) {
          return;
        }
        field_H = null;
        field_I = (long[][]) null;
    }

    vka(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        this.field_G = new f(1, 1);
        try {
          this.field_G = new f(1, 1, param0.field_E, param2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
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
        field_I = new long[8][256];
        field_H = new long[11];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 != (1 & var0) ? (long)(255 & var1) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (var4 >= 256L) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (!(var6 < 256L)) {
                var6 = var6 ^ 285L;
            }
            var8 = var2 ^ var6;
            var10 = var6 << 1;
            if (!(var10 < 256L)) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_I[0][var0] = jb.a(var12, jb.a(jb.a(jb.a(var10 << 24, jb.a(var2 << 32, jb.a(jb.a(var2 << 56, var2 << 48), var6 << 40))), var8 << 16), var4 << 8));
            for (var14 = 1; 8 > var14; var14++) {
                field_I[var14][var0] = jb.a(field_I[-1 + var14][var0] << 56, field_I[var14 - 1][var0] >>> 8);
            }
            var0++;
        }
        field_H[0] = 0L;
        for (var0 = 1; 10 >= var0; var0++) {
            var1 = (var0 - 1) * 8;
            field_H[var0] = oo.a(oo.a(vi.a(65280L, field_I[6][6 + var1]), oo.a(vi.a(field_I[5][var1 + 5], 16711680L), oo.a(vi.a(4278190080L, field_I[4][4 + var1]), oo.a(oo.a(oo.a(vi.a(field_I[0][var1], -72057594037927936L), vi.a(71776119061217280L, field_I[1][var1 + 1])), vi.a(280375465082880L, field_I[2][2 + var1])), vi.a(field_I[3][var1 + 3], 1095216660480L))))), vi.a(255L, field_I[7][7 + var1]));
        }
        bia.a((byte) 93, 1600);
    }
}
