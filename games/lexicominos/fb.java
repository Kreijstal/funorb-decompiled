/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb implements rd {
    private int field_c;
    private int field_i;
    private int field_e;
    private int field_k;
    private int field_n;
    private int field_r;
    private le field_b;
    private int field_a;
    static aj field_l;
    private int field_s;
    static int field_g;
    private int field_d;
    static rb field_f;
    private int field_h;
    static le field_m;
    private int field_q;
    static long[] field_o;
    static long[][] field_j;
    static boolean field_p;

    public static void a() {
        field_j = null;
        field_l = null;
        field_f = null;
        field_o = null;
        field_m = null;
    }

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        te var11 = null;
        w stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        w stackOut_1_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof te)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (w) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (w) param3;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (te) (Object) stackIn_3_0;
              if (var11 == null) {
                break L2;
              } else {
                param2 = param2 & var11.field_D;
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              lf.a(param1 + param3.field_t, param3.field_o + param0, param3.field_j, param3.field_v, ((fb) this).field_a);
              if (param2) {
                var7 = 16777215;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var8 = ((fb) this).field_q + (param1 - -param3.field_t);
              var9 = param0 + param3.field_o - -((fb) this).field_n;
              if (param4 == -3284) {
                break L4;
              } else {
                ((fb) this).field_q = 93;
                break L4;
              }
            }
            L5: {
              lf.d(var8, var9, ((fb) this).field_r, ((fb) this).field_h, 5592405);
              lf.a(var8, var9, ((fb) this).field_r, ((fb) this).field_h, var7);
              if (!var11.field_C) {
                break L5;
              } else {
                lf.b(var8, var9, var8 - -((fb) this).field_r, var9 - -((fb) this).field_h, 1);
                lf.b(((fb) this).field_r + var8, var9, var8, var9 - -((fb) this).field_h, 1);
                break L5;
              }
            }
            L6: {
              if (null != ((fb) this).field_b) {
                var10 = ((fb) this).field_k + (((fb) this).field_q + ((fb) this).field_r);
                int discarded$1 = ((fb) this).field_b.a(param3.field_u, param3.field_t + param1 - -var10, param0 + (param3.field_o - -((fb) this).field_e), -var10 - ((fb) this).field_k + param3.field_j, param3.field_v - (((fb) this).field_k << 1), ((fb) this).field_c, ((fb) this).field_i, ((fb) this).field_d, ((fb) this).field_s, 0);
                break L6;
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("fb.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param4 + 41);
        }
    }

    final static hk b(int param0) {
        if (param0 != 12898) {
            hk discarded$0 = fb.b(-114);
        }
        return kg.field_G;
    }

    final static void a(byte param0, int param1, int param2) {
        L0: {
          L1: {
            if (null == p.field_d) {
              break L1;
            } else {
              if (param2 <= p.field_d.length) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          p.field_d = new int[param2 * 2];
          break L0;
        }
        L2: {
          L3: {
            if (we.field_g == null) {
              break L3;
            } else {
              if (we.field_g.length < param2) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          we.field_g = new int[param2 * 2];
          break L2;
        }
        L4: {
          L5: {
            if (l.field_D == null) {
              break L5;
            } else {
              if (param2 > l.field_D.length) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          l.field_D = new int[2 * param2];
          break L4;
        }
        L6: {
          L7: {
            if (oc.field_a == null) {
              break L7;
            } else {
              if (oc.field_a.length >= param2) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          oc.field_a = new int[2 * param2];
          break L6;
        }
        L8: {
          L9: {
            if (null == hl.field_N) {
              break L9;
            } else {
              if (param2 <= hl.field_N.length) {
                break L8;
              } else {
                break L9;
              }
            }
          }
          hl.field_N = new int[param2 * 2];
          break L8;
        }
        L10: {
          L11: {
            if (null == oj.field_j) {
              break L11;
            } else {
              if (oj.field_j.length >= param2) {
                break L10;
              } else {
                break L11;
              }
            }
          }
          oj.field_j = new int[2 * param2];
          break L10;
        }
    }

    fb(le param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((fb) this).field_s = 1;
        ((fb) this).field_d = 1;
        try {
            ((fb) this).field_b = param0;
            ((fb) this).field_n = param6;
            ((fb) this).field_e = param2;
            ((fb) this).field_i = param4;
            ((fb) this).field_a = param9;
            ((fb) this).field_r = param8;
            ((fb) this).field_c = param3;
            ((fb) this).field_h = param7;
            ((fb) this).field_k = param1;
            ((fb) this).field_q = param5;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "fb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
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
        field_l = new aj(14, 0, 4, 1);
        field_f = new rb();
        field_o = new long[11];
        field_j = new long[8][256];
        var0 = 0;
        L0: while (true) {
          if (256 <= var0) {
            field_o[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (var0 > 10) {
                return;
              } else {
                var1 = -8 + 8 * var0;
                field_o[var0] = qg.a(qg.a(tf.a(65280L, field_j[6][6 + var1]), qg.a(qg.a(tf.a(4278190080L, field_j[4][var1 - -4]), qg.a(qg.a(qg.a(tf.a(-72057594037927936L, field_j[0][var1]), tf.a(71776119061217280L, field_j[1][1 + var1])), tf.a(280375465082880L, field_j[2][var1 + 2])), tf.a(field_j[3][3 + var1], 1095216660480L))), tf.a(field_j[5][var1 + 5], 16711680L))), tf.a(255L, field_j[7][var1 - -7]));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (0 != (1 & var0)) {
                stackOut_4_0 = (long)(255 & var1);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 >>> 8);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1;
              if (var4 >= 256L) {
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
              var8 = var2 ^ var6;
              var10 = var6 << 1;
              if (var10 < 256L) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_j[0][var0] = te.a(var12, te.a(var4 << 8, te.a(te.a(var10 << 24, te.a(te.a(var6 << 40, te.a(var2 << 48, var2 << 56)), var2 << 32)), var8 << 16)));
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_j[var14][var0] = te.a(field_j[var14 + -1][var0] << 56, field_j[-1 + var14][var0] >>> 8);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
