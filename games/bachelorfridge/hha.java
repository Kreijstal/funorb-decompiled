/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hha extends ana {
    static long[] field_z;
    static hw[] field_w;
    static int[] field_A;
    private mna field_x;
    static ee[] field_y;
    static long[][] field_v;

    final static boolean e(int param0) {
        if (param0 != 1071140296) {
          hha.e(-20);
        }
        return dka.field_G == kq.field_j ? true : false;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        boolean stackIn_8_0 = false;
        if (param3 != 1) {
          hha.g(-64);
        }
        stackIn_8_0 = (param6 >= param4) && (param6 < param4 + param2) && (param1 >= param5) && (param5 + param0 > param1);
        return stackIn_8_0;
    }

    private final void d(int param0) {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var2 = this.field_x.field_l.a(74, this.field_q.field_h);
        if (var2.i(-117)) {
          return;
        }
        if (param0 != -10649) {
          return;
        }
        iv var3 = (iv) (this.field_x.field_o.b((byte) 90));
        al.a(107, this.field_x.field_k);
        while (var3 != null) {
          var4 = var3.field_h.a(-27449, this.field_q);
          var4.b(param0 + 10648, 6);
          var4.a(24831, 95, kna.field_g[29]);
          var3.a(var2, this.field_q.field_h, 12);
          var3 = (iv) (this.field_x.field_o.c(0));
        }
    }

    private final void f(int param0) {
        if (param0 != 1532) {
          hha.e(4);
        }
    }

    hha(gj param0, mna param1) {
        super(param0, param1);
        try {
          this.field_x = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(byte param0) {
        int var2 = 84 % ((71 - param0) / 47);
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 >= 0) {
          if (this.field_l == 25) {
            jja.a(256, -1, 52);
            this.d(-10649);
          }
          return false;
        }
        this.f(1532);
        return true;
    }

    final static hk a(byte param0, java.applet.Applet param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        hk[] var3 = null;
        hk var5 = null;
        int var6 = 0;
        hk stackIn_6_0 = null;
        hk stackIn_12_0 = null;
        hk stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          var2 = fi.a("jagex-last-login-method", 61, param1);
          if (param0 < 121) {
            hha.g(78);
          }
          if (var2 == null) {
            stackIn_6_0 = uka.field_k;
            return stackIn_6_0;
          }
          var3 = gh.c((byte) -67);
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5.a(var2, 91)) {
              stackIn_12_0 = var5;
              return stackIn_12_0;
            }
          }
          stackIn_15_0 = uka.field_k;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("hha.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_z = null;
        field_v = (long[][]) null;
        if (param0 != 0) {
          hha.e(-114);
        }
        field_w = null;
        field_y = null;
        field_A = null;
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
        field_z = new long[11];
        field_A = new int[8192];
        field_v = new long[8][256];
        int var0 = 0;
        while (var0 < 256) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = (var0 & 1) != 0 ? (long)(255 & var1) : (long)(var1 >>> 8);
            var4 = var2 << 1;
            if (var4 >= 256L) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 1;
            if (!(var6 < 256L)) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1;
            if (!(256L > var10)) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_v[0][var0] = sr.a(var12, sr.a(sr.a(sr.a(sr.a(sr.a(var6 << 40, sr.a(var2 << 48, var2 << 56)), var2 << 32), var10 << 24), var8 << 16), var4 << 8));
            for (var14 = 1; var14 < 8; var14++) {
                field_v[var14][var0] = sr.a(field_v[var14 - 1][var0] << 56, field_v[-1 + var14][var0] >>> 8);
            }
            var0++;
        }
        field_z[0] = 0L;
        int var15 = 1;
        var0 = var15;
        while (var15 <= 10) {
            var1 = 8 * (var15 - 1);
            field_z[var15] = gv.a(gv.a(gv.a(gda.a(field_v[5][var1 + 5], 16711680L), gv.a(gda.a(field_v[4][var1 + 4], 4278190080L), gv.a(gda.a(1095216660480L, field_v[3][var1 + 3]), gv.a(gv.a(gda.a(71776119061217280L, field_v[1][1 + var1]), gda.a(-72057594037927936L, field_v[0][var1])), gda.a(280375465082880L, field_v[2][2 + var1]))))), gda.a(65280L, field_v[6][var1 + 6])), gda.a(field_v[7][7 + var1], 255L));
            var15++;
        }
    }
}
