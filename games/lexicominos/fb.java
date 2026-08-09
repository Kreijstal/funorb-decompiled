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

    public static void a(int param0) {
        field_j = (long[][]) null;
        field_l = null;
        field_f = null;
        field_o = null;
        field_m = null;
        if (param0 != 2) {
            field_j = (long[][]) null;
        }
    }

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        w stackIn_3_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        te var11 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof te)) {
                stackIn_3_0 = null;
                break L1;
              } else {
                stackIn_3_0 = (w) (param3);
                break L1;
              }
            }
            L2: {
              var11 = (te) ((Object) stackIn_3_0);
              if (var11 == null) {
                break L2;
              } else {
                param2 = param2 & var11.field_D;
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              lf.a(param1 + param3.field_t, param3.field_o + param0, param3.field_j, param3.field_v, this.field_a);
              if (param2) {
                var7 = 16777215;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var8 = this.field_q + (param1 - -param3.field_t);
              var9 = param0 + param3.field_o - -this.field_n;
              if (param4 == -3284) {
                break L4;
              } else {
                this.field_q = 93;
                break L4;
              }
            }
            L5: {
              lf.d(var8, var9, this.field_r, this.field_h, 5592405);
              lf.a(var8, var9, this.field_r, this.field_h, var7);
              if (!var11.field_C) {
                break L5;
              } else {
                lf.b(var8, var9, var8 - -this.field_r, var9 - -this.field_h, 1);
                lf.b(this.field_r + var8, var9, var8, var9 - -this.field_h, 1);
                break L5;
              }
            }
            L6: {
              if (null != this.field_b) {
                var10 = this.field_k + (this.field_q + this.field_r);
                this.field_b.a(param3.field_u, param3.field_t + param1 - -var10, param0 + (param3.field_o - -this.field_e), -var10 - this.field_k + param3.field_j, param3.field_v - (this.field_k << -1437509631), this.field_c, this.field_i, this.field_d, this.field_s, 0);
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
            stackIn_18_0 = (RuntimeException) (var6);

            stackIn_18_1 = new StringBuilder().append("fb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param4 + ')');
        }
    }

    final static hk b(int param0) {
        if (param0 != 12898) {
            fb.b(-114);
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
        if (param0 == -107) {
          L12: {
            L13: {
              if (null == ff.field_a) {
                break L13;
              } else {
                if (param1 + param2 > ff.field_a.length) {
                  break L13;
                } else {
                  break L12;
                }
              }
            }
            ff.field_a = new int[(param2 - -param1) * 2];
            break L12;
          }
          L14: {
            L15: {
              if (null == f.field_h) {
                break L15;
              } else {
                if (f.field_h.length < param2) {
                  break L15;
                } else {
                  break L14;
                }
              }
            }
            f.field_h = new boolean[param2 * 2];
            break L14;
          }
          r.field_D = 2147483647;
          pf.field_o = 0;
          l.field_G = -2147483648;
          rb.field_a = -2147483648;
          ve.field_d = 2147483647;
          return;
        } else {
          return;
        }
    }

    fb(le param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_s = 1;
        this.field_d = 1;
        try {
            this.field_b = param0;
            this.field_n = param6;
            this.field_e = param2;
            this.field_i = param4;
            this.field_a = param9;
            this.field_r = param8;
            this.field_c = param3;
            this.field_h = param7;
            this.field_k = param1;
            this.field_q = param5;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "fb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
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
        field_l = new aj(14, 0, 4, 1);
        field_f = new rb();
        field_o = new long[11];
        field_j = new long[8][256];
        for (var0 = 0; 256 > var0; var0++) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = 0 == (1 & var0) ? (long)(var1 >>> -1232195320) : (long)(255 & var1);
            var4 = var2 << -442926015;
            if (!((var4 ^ -1L) > -257L)) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << -1143607935;
            if ((var6 ^ -1L) <= -257L) {
                var6 = var6 ^ 285L;
            }
            var8 = var2 ^ var6;
            var10 = var6 << 1267622465;
            if (var10 >= 256L) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_j[0][var0] = te.a(var12, te.a(var4 << -1430395832, te.a(te.a(var10 << 803900312, te.a(te.a(var6 << 1164673768, te.a(var2 << 189013808, var2 << 1583537400)), var2 << -1340205280)), var8 << -870043696)));
            for (var14 = 1; (var14 ^ -1) > -9; var14++) {
                field_j[var14][var0] = te.a(field_j[var14 + -1][var0] << 999954104, field_j[-1 + var14][var0] >>> -2102041400);
            }
        }
        field_o[0] = 0L;
        for (var0 = 1; (var0 ^ -1) >= -11; var0++) {
            var1 = -8 + 8 * var0;
            field_o[var0] = qg.a(qg.a(tf.a(65280L, field_j[6][6 + var1]), qg.a(qg.a(tf.a(4278190080L, field_j[4][var1 - -4]), qg.a(qg.a(qg.a(tf.a(-72057594037927936L, field_j[0][var1]), tf.a(71776119061217280L, field_j[1][1 + var1])), tf.a(280375465082880L, field_j[2][var1 + 2])), tf.a(field_j[3][3 + var1], 1095216660480L))), tf.a(field_j[5][var1 + 5], 16711680L))), tf.a(255L, field_j[7][var1 - -7]));
        }
    }
}
