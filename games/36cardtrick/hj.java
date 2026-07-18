/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class hj extends cg {
    private boolean field_m;
    static int field_l;
    static long[] field_o;
    static long[] field_n;
    private String field_p;
    static long[][] field_k;
    static int field_j;

    final static int b(int param0, int param1) {
        int var2 = 0;
        if (!(param1 != 0)) {
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
            if (!(param1 <= 3)) {
                var2 += 2;
                param1 = param1 >> 2;
            }
            if (!(param1 <= 1)) {
                param1 = param1 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (!(param1 >= -65536)) {
            var2 += 16;
            param1 = param1 >> 16;
        }
        if (param1 < -256) {
            var2 += 8;
            param1 = param1 >> 8;
        }
        if (param1 < -16) {
            param1 = param1 >> 4;
            var2 += 4;
        }
        if (!(param1 >= -4)) {
            param1 = param1 >> 2;
            var2 += 2;
        }
        if (param1 < -2) {
            var2++;
            param1 = param1 >> 1;
        }
        return var2;
    }

    public static void h(int param0) {
        field_k = null;
        field_n = null;
        field_o = null;
        if (param0 != 0) {
            field_j = 77;
        }
    }

    final static void b(byte param0) {
        int var1_int = 0;
        int var2 = Main.field_T;
        try {
            ag.field_b.b(-127);
            for (var1_int = 0; var1_int < 32; var1_int++) {
                ak.field_P[var1_int] = 0L;
            }
            var1_int = 0;
            if (param0 >= -5) {
                field_j = -80;
            }
            while (32 > var1_int) {
                field_n[var1_int] = 0L;
                var1_int++;
            }
            de.field_c = 0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "hj.J(" + param0 + ')');
        }
    }

    final static int a(boolean param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                hj.h(107);
                break L1;
              }
            }
            if (!param1) {
              stackOut_5_0 = mb.field_a.a(param2);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = c.field_u.a(param2);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("hj.K(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    hj(hf param0) {
        super(param0);
        ((hj) this).field_m = false;
    }

    final void g(int param0) {
        ((hj) this).field_p = null;
        if (param0 <= 70) {
            field_n = null;
        }
    }

    final sg a(String param0, int param1) {
        nk var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        sg stackIn_3_0 = null;
        sg stackIn_12_0 = null;
        sg stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        sg stackOut_2_0 = null;
        sg stackOut_11_0 = null;
        sg stackOut_16_0 = null;
        sg stackOut_15_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var4 = (CharSequence) (Object) param0;
            int discarded$9 = 28;
            if (!bi.a(var4)) {
              stackOut_2_0 = pe.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param1 < -58) {
                  break L1;
                } else {
                  hj.a(-78, 71);
                  break L1;
                }
              }
              L2: {
                if (!param0.equals((Object) (Object) ((hj) this).field_p)) {
                  L3: {
                    var3 = mh.a(-63, param0);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (null == var3.field_d) {
                        ((hj) this).field_m = var3.field_b;
                        ((hj) this).field_p = param0;
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  stackOut_11_0 = a.field_n;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (((hj) this).field_m) {
                  stackOut_16_0 = ii.field_e;
                  stackIn_17_0 = stackOut_16_0;
                  break L4;
                } else {
                  stackOut_15_0 = pe.field_b;
                  stackIn_17_0 = stackOut_15_0;
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("hj.M(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final String a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        nk var4 = null;
        CharSequence var5 = null;
        String stackIn_5_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_16_0 = null;
        String stackOut_14_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ((hj) this).field_m = false;
                break L1;
              }
            }
            var5 = (CharSequence) (Object) param0;
            int discarded$2 = 36;
            var3 = hf.a(var5);
            if (var3 != null) {
              stackOut_4_0 = (String) var3;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L2: {
                if (param0.equals((Object) (Object) ((hj) this).field_p)) {
                  break L2;
                } else {
                  var4 = mh.a(-63, param0);
                  if (var4 != null) {
                    if (null == var4.field_d) {
                      ((hj) this).field_m = var4.field_b;
                      ((hj) this).field_p = param0;
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (((hj) this).field_m) {
                stackOut_16_0 = vd.field_k;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                stackOut_14_0 = ui.field_K;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var3_ref;
            stackOut_18_1 = new StringBuilder().append("hj.I(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
        }
        return stackIn_17_0;
    }

    final static void a(int param0, int param1) {
        if (param0 != 2) {
            Object var3 = null;
            int discarded$0 = hj.a(true, false, (String) null);
        }
        int discarded$1 = vf.b((byte) 99);
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
        int var15 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        bk discarded$1 = new bk();
        field_o = new long[11];
        field_n = new long[32];
        field_k = new long[8][256];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_o[0] = 0L;
            var15 = 1;
            var0 = var15;
            L1: while (true) {
              if (var15 > 10) {
                return;
              } else {
                var1 = (var15 + -1) * 8;
                field_o[var15] = ji.a(ji.a(ji.a(rl.a(field_k[5][5 + var1], 16711680L), ji.a(ji.a(ji.a(ji.a(rl.a(71776119061217280L, field_k[1][1 + var1]), rl.a(-72057594037927936L, field_k[0][var1])), rl.a(field_k[2][2 + var1], 280375465082880L)), rl.a(field_k[3][3 + var1], 1095216660480L)), rl.a(field_k[4][var1 + 4], 4278190080L))), rl.a(field_k[6][6 + var1], 65280L)), rl.a(255L, field_k[7][7 + var1]));
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((var0 & 1) == 0) {
                stackOut_4_0 = (long)(var1 >>> 8);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(255 & var1);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1;
              if (256L > var4) {
                break L3;
              } else {
                var4 = var4 ^ 285L;
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
              var8 = var6 ^ var2;
              var10 = var6 << 1;
              if (var10 < 256L) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_k[0][var0] = v.a(v.a(var4 << 8, v.a(v.a(v.a(var2 << 32, v.a(v.a(var2 << 48, var2 << 56), var6 << 40)), var10 << 24), var8 << 16)), var12);
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_k[var14][var0] = v.a(field_k[var14 - 1][var0] << 56, field_k[-1 + var14][var0] >>> 8);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
