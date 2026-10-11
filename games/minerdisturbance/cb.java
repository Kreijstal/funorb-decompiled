/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cb extends ok implements wg {
    private ui field_g;
    static long[] field_f;
    static long[][] field_h;
    static ea field_e;

    abstract ag a(String param0, int param1);

    public static void d(boolean param0) {
        try {
          field_f = null;
          field_h = (long[][]) null;
          field_e = null;
          if (param0) {
            field_f = (long[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "cb.N(" + param0 + ')');
        }
    }

    public final void a(ui param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -7802) {
            field_f = (long[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("cb.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(ui param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.c(-11);
          if (param1 != 60) {
            this.b(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("cb.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    cb(ui param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_g = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("cb.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void c(boolean param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int stackIn_12_0 = 0;
        om stackIn_47_0 = null;
        long stackIn_47_1 = 0L;
        boolean stackIn_48_2 = false;
        pe stackIn_63_0 = null;
        pe stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        RuntimeException decompiledCaughtException = null;
        ld var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object var3 = null;
        int var3_int = 0;
        int var4 = 0;
        String var4_ref_String = null;
        String var5 = null;
        pe var5_ref = null;
        pe var6 = null;
        String var6_ref = null;
        pe var7 = null;
        String var7_ref = null;
        int var8 = 0;
        Object var3Lifetime1;
        String var4_ref_StringLifetime1;
        var8 = MinerDisturbance.field_ab;
        try {
          var1 = kj.field_a;
          var2 = var1.d((byte) -54);
          if (var2 == 0) {
            if (tc.field_o == null) {
              tc.field_o = new om(128);
              wd.field_c = 0;
            }
            stackIn_12_0 = (var1.d((byte) -54) != 1) ? 0 : 1;
            var3_int = stackIn_12_0;
            var4_ref_String = var1.a(param0);
            if (var3_int != 0) {
              var1.a(false);
            }
            var5_ref = an.a((byte) -97, var4_ref_String);
            var6_ref = var1.a(false);
            var7_ref = cl.a(-95, (CharSequence) ((Object) var4_ref_String));
            if (null == var7_ref) {
              var7_ref = var4_ref_String;
            }
            if (var5_ref == null) {
              var5_ref = an.a((byte) 126, var6_ref);
              if (null != var5_ref) {
                tc.field_o.a((long)var7_ref.hashCode(), true, var5_ref);
              }
            }
            if (null == var5_ref) {
              var5_ref = new pe();
              tc.field_o.a((long)var7_ref.hashCode(), true, var5_ref);
              fieldTemp$1 = wd.field_c;
              wd.field_c = wd.field_c + 1;
              var5_ref.field_tb = fieldTemp$1;
              om.field_c.a((byte) -93, var5_ref);
            }
            var5_ref.field_ob = var4_ref_String;
            return;
          }
          if (var2 != 1) {
            if (2 == var2) {
              if (1 == ha.field_g) {
                ha.field_g = 2;
              }
              return;
            }
            if (3 == var2) {
              if (ha.field_g == 2) {
                ha.field_g = 1;
              }
              return;
            }
            if (var2 != 4) {
              di.a((Throwable) null, 1, "F1: " + hj.a((byte) 104));
              si.a(-26);
              if (param0) {
                cb.a((byte) 60);
              }
              return;
            }
            ha.field_g = 1;
            var3 = var1.a(false);
            bd.field_j = ((String) (var3)).intern();
            var4 = var1.d((byte) -54);
            g.a(var4, 2);
            return;
          }
          if (ae.field_a == null) {
            ae.field_a = new om(128);
            r.field_c = 0;
          }
          var3Lifetime1 = var1.a(false);
          if (((String) (var3Lifetime1)).equals("")) {
            var3Lifetime1 = null;
          }
          var4_ref_StringLifetime1 = var1.a(false);
          var5 = var1.a(false);
          var6 = nd.a(1, var4_ref_StringLifetime1);
          if (var6 == null) {
            var6 = nd.a(1, var5);
            if (null != var6) {
              ae.field_a.a((long)cl.a(-95, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode(), true, var6);
            }
          }
          if (var6 == null) {
            var6 = new pe();
            stackIn_47_0 = ae.field_a;
            stackIn_47_1 = (long)cl.a(-95, (CharSequence) ((Object) var4_ref_StringLifetime1)).hashCode();
            stackIn_48_2 = !(param0);
            ((om) (Object) stackIn_47_0).a(stackIn_47_1, stackIn_48_2, var6);
            fieldTemp$0 = r.field_c;
            r.field_c = r.field_c + 1;
            var6.field_tb = fieldTemp$0;
            pe.field_qb.a((byte) 122, var6);
          }
          if (var3Lifetime1 != null) {
            var3Lifetime1 = ((String) (var3Lifetime1)).intern();
          }
          var6.field_ob = var4_ref_StringLifetime1;
          var6.field_nb = (String) (var3Lifetime1);
          var6.b(34);
          var7 = (pe) (pe.field_qb.b(82));
          L11: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var7 != null) {
              stackIn_63_0 = var6;
              stackIn_63_1 = var7;
              stackIn_63_2 = -73;
              decompiledFrameRemainder0 = (var8 == 0);
              if ((decompiledFrameRemainder0) &&
                (vl.a(stackIn_63_0, stackIn_63_1, stackIn_63_2))) {
                var7 = (pe) (pe.field_qb.b((byte) 56));
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              if (var7 == null) {
                break L11;
              }
              stackIn_63_0 = var6;
              stackIn_63_1 = var7;
              stackIn_63_2 = -117;
            }
            oj.$cfr$intArgs$a$c5042ffd0615(stackIn_63_0, stackIn_63_1, stackIn_63_2);
            if (var8 == 0) {
              return;
            }
            break;
          }
          pe.field_qb.a((byte) 114, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1_ref), "cb.H(" + param0 + ')');
        }
    }

    abstract String a(byte param0, String param1);

    public final boolean a(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_h = (long[][]) null;
          }
          stackIn_10_0 = (null == this.field_g.field_s) || (this.field_g.field_s.length() == 0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "cb.M(" + param0 + ')');
        }
    }

    final ag b(boolean param0) {
        RuntimeException var2 = null;
        ag stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            this.a((byte) -98, (String) null);
          }
          stackIn_4_0 = this.a(this.field_g.field_s, 5);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "cb.I(" + param0 + ')');
        }
    }

    final String e(int param0) {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -106 % ((-44 - param0) / 38);
          stackIn_1_0 = this.a((byte) -78, this.field_g.field_s);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "cb.F(" + param0 + ')');
        }
    }

    final static String a(byte param0) {
        RuntimeException var1 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -18) {
            field_h = (long[][]) null;
          }
          if (ti.field_J != null) {
            stackIn_7_0 = ti.field_J;
            return stackIn_7_0;
          }
          stackIn_5_0 = "";
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "cb.G(" + param0 + ')');
        }
    }

    static {
        int var14 = 0;
        int var0;
        int var1;
        long var2;
        long var4;
        long var6;
        long var8;
        long var10;
        long var12;
        long stackIn_6_0 = 0L;
        field_f = new long[11];
        field_h = new long[8][256];
        var0 = 0;
        L0: while (var0 < 256) {
          var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
          if ((1 & var0) == 0) {
            stackIn_6_0 = (long)(var1 >>> 8);
          } else {
            stackIn_6_0 = (long)(255 & var1);
          }
          var2 = stackIn_6_0;
          var4 = var2 << 1;
          if (var4 >= 256L) {
            var4 = var4 ^ 285L;
          }
          var6 = var4 << 1;
          if (var6 >= 256L) {
            var6 = var6 ^ 285L;
          }
          var8 = var2 ^ var6;
          var10 = var6 << 1;
          if (var10 >= 256L) {
            var10 = var10 ^ 285L;
          }
          var12 = var10 ^ var2;
          field_h[0][var0] = pa.a(var12, pa.a(pa.a(pa.a(pa.a(var2 << 32, pa.a(pa.a(var2 << 48, var2 << 56), var6 << 40)), var10 << 24), var8 << 16), var4 << 8));
          for (var14 = 1; 8 > var14; var14++) {
            field_h[var14][var0] = pa.a(field_h[var14 - 1][var0] >>> 8, field_h[var14 - 1][var0] << 56);
          }
          var0++;
        }
        field_f[0] = 0L;
        for (var0 = 1; var0 <= 10; var0++) {
          var1 = -8 + 8 * var0;
          field_f[var0] = te.a(te.a(bf.a(field_h[6][6 + var1], 65280L), te.a(te.a(bf.a(field_h[4][4 + var1], 4278190080L), te.a(te.a(te.a(bf.a(-72057594037927936L, field_h[0][var1]), bf.a(field_h[1][var1 + 1], 71776119061217280L)), bf.a(field_h[2][2 + var1], 280375465082880L)), bf.a(field_h[3][var1 + 3], 1095216660480L))), bf.a(16711680L, field_h[5][5 + var1]))), bf.a(255L, field_h[7][7 + var1]));
        }
    }
}
