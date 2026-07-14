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
        field_j = null;
        field_l = null;
        field_f = null;
        field_o = null;
        field_m = null;
        if (param0 != 2) {
            field_j = null;
        }
    }

    public final void a(int param0, int param1, boolean param2, w param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        te var11 = null;
        w stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        w stackOut_1_0 = null;
        L0: {
          if (!(param3 instanceof te)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (w) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (w) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (te) (Object) stackIn_3_0;
          if (var11 == null) {
            break L1;
          } else {
            param2 = param2 & var11.field_D;
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          lf.a(param1 + param3.field_t, param3.field_o + param0, param3.field_j, param3.field_v, ((fb) this).field_a);
          if (param2) {
            var7 = 16777215;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var8 = ((fb) this).field_q + (param1 - -param3.field_t);
          var9 = param0 + param3.field_o - -((fb) this).field_n;
          if (param4 == -3284) {
            break L3;
          } else {
            ((fb) this).field_q = 93;
            break L3;
          }
        }
        L4: {
          lf.d(var8, var9, ((fb) this).field_r, ((fb) this).field_h, 5592405);
          lf.a(var8, var9, ((fb) this).field_r, ((fb) this).field_h, var7);
          if (!var11.field_C) {
            break L4;
          } else {
            lf.b(var8, var9, var8 - -((fb) this).field_r, var9 - -((fb) this).field_h, 1);
            lf.b(((fb) this).field_r + var8, var9, var8, var9 - -((fb) this).field_h, 1);
            break L4;
          }
        }
        L5: {
          if (null != ((fb) this).field_b) {
            var10 = ((fb) this).field_k + (((fb) this).field_q + ((fb) this).field_r);
            int discarded$1 = ((fb) this).field_b.a(param3.field_u, param3.field_t + param1 - -var10, param0 + (param3.field_o - -((fb) this).field_e), -var10 - ((fb) this).field_k + param3.field_j, param3.field_v - (((fb) this).field_k << -1437509631), ((fb) this).field_c, ((fb) this).field_i, ((fb) this).field_d, ((fb) this).field_s, 0);
            break L5;
          } else {
            break L5;
          }
        }
    }

    final static hk b(int param0) {
        if (param0 != 12898) {
            hk discarded$0 = fb.b(-114);
        }
        return kg.field_G;
    }

    final static void a(byte param0, int param1, int param2) {
        if (null != p.field_d) {
            // if_icmple L29
        }
        p.field_d = new int[param2 * 2];
        if (we.field_g != null) {
            // if_icmplt L46
        } else {
            we.field_g = new int[param2 * 2];
        }
        if (l.field_D != null) {
            // if_icmpgt L71
        } else {
            l.field_D = new int[2 * param2];
        }
        if (oc.field_a != null) {
            // if_icmpge L107
        }
        oc.field_a = new int[2 * param2];
        if (null != hl.field_N) {
            // if_icmple L136
        }
        hl.field_N = new int[param2 * 2];
        if (null != oj.field_j) {
            // if_icmpge L165
        }
        oj.field_j = new int[2 * param2];
        if (param0 != -107) {
            return;
        }
        if (null != ff.field_a) {
            // if_icmpgt L192
        } else {
            ff.field_a = new int[(param2 - -param1) * 2];
        }
        if (null != f.field_h) {
            // if_icmplt L221
        } else {
            f.field_h = new boolean[param2 * 2];
        }
        r.field_D = 2147483647;
        pf.field_o = 0;
        l.field_G = -2147483648;
        rb.field_a = -2147483648;
        ve.field_d = 2147483647;
    }

    fb(le param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((fb) this).field_s = 1;
        ((fb) this).field_d = 1;
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
              if ((var0 ^ -1) < -11) {
              } else {
                var1 = -8 + 8 * var0;
                field_o[var0] = qg.a(qg.a(tf.a(65280L, field_j[6][6 + var1]), qg.a(qg.a(tf.a(4278190080L, field_j[4][var1 - -4]), qg.a(qg.a(qg.a(tf.a(-72057594037927936L, field_j[0][var1]), tf.a(71776119061217280L, field_j[1][1 + var1])), tf.a(280375465082880L, field_j[2][var1 + 2])), tf.a(field_j[3][3 + var1], 1095216660480L))), tf.a(field_j[5][var1 + 5], 16711680L))), tf.a(255L, field_j[7][var1 - -7]));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (0 != (1 & var0)) {
                stackOut_4_0 = (long)(255 & var1);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 >>> -1232195320);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << -442926015;
              if ((var4 ^ -1L) <= -257L) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << -1143607935;
              if ((var6 ^ -1L) > -257L) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var2 ^ var6;
              var10 = var6 << 1267622465;
              if (var10 < 256L) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_j[0][var0] = te.a(var12, te.a(var4 << -1430395832, te.a(te.a(var10 << 803900312, te.a(te.a(var6 << 1164673768, te.a(var2 << 189013808, var2 << 1583537400)), var2 << -1340205280)), var8 << -870043696)));
            var14 = 1;
            L6: while (true) {
              if ((var14 ^ -1) <= -9) {
                var0++;
                continue L0;
              } else {
                field_j[var14][var0] = te.a(field_j[var14 + -1][var0] << 999954104, field_j[-1 + var14][var0] >>> -2102041400);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
