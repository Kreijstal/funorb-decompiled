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
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param2) {
                break L1;
              } else {
                field_d = (dl) null;
                break L1;
              }
            }
            if (null != param1.field_d) {
              var3_int = 0;
              L2: while (true) {
                L3: {
                  if (-51 >= (var3_int ^ -1)) {
                    break L3;
                  } else {
                    if (null == param1.field_d.peekEvent()) {
                      break L3;
                    } else {
                      fh.a(true, 1L);
                      var3_int++;
                      continue L2;
                    }
                  }
                }
                try {
                  L4: {
                    L5: {
                      if (param0 != null) {
                        param1.field_d.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param0, 1001, "dummy")));
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    break L4;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L6: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L6;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L7: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("so.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          L8: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit: {
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
            field_a = new long[11];
            field_b = new long[8][256];
            var0 = 0;
            L0: while (true) {
              if (256 <= var0) {
                field_a[0] = 0L;
                var15 = 1;
                var0 = var15;
                L1: while (true) {
                  if ((var15 ^ -1) < -11) {
                    field_h = new wb();
                    field_e = 0;
                    break $cfr$clinit;
                  } else {
                    var1 = var15 * 8 + -8;
                    field_a[var15] = km.a(ao.a(field_b[7][7 + var1], 255L), km.a(km.a(ao.a(field_b[5][var1 + 5], 16711680L), km.a(ao.a(4278190080L, field_b[4][var1 - -4]), km.a(km.a(ao.a(280375465082880L, field_b[2][var1 - -2]), km.a(ao.a(field_b[0][var1], -72057594037927936L), ao.a(field_b[1][1 + var1], 71776119061217280L))), ao.a(1095216660480L, field_b[3][var1 + 3])))), ao.a(field_b[6][var1 + 6], 65280L)));
                    var15++;
                    continue L1;
                  }
                }
              } else {
                L2: {
                  var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
                  if (0 == (var0 & 1)) {
                    stackOut_4_0 = (long)(var1 >>> 1059119624);
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
                  var4 = var2 << -1768024767;
                  if (-257L < (var4 ^ -1L)) {
                    break L3;
                  } else {
                    var4 = var4 ^ 285L;
                    break L3;
                  }
                }
                L4: {
                  var6 = var4 << 586152257;
                  if ((var6 ^ -1L) > -257L) {
                    break L4;
                  } else {
                    var6 = var6 ^ 285L;
                    break L4;
                  }
                }
                L5: {
                  var8 = var6 ^ var2;
                  var10 = var6 << -451563263;
                  if (-257L >= (var10 ^ -1L)) {
                    var10 = var10 ^ 285L;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var12 = var10 ^ var2;
                field_b[0][var0] = jb.a(var12, jb.a(jb.a(jb.a(var10 << 482075736, jb.a(jb.a(jb.a(var2 << 195329336, var2 << 420463344), var6 << 721299496), var2 << 812286432)), var8 << -558802032), var4 << -738901944));
                var14 = 1;
                L6: while (true) {
                  if (8 <= var14) {
                    var0++;
                    continue L0;
                  } else {
                    field_b[var14][var0] = jb.a(field_b[var14 + -1][var0] << 961458872, field_b[var14 + -1][var0] >>> 772531144);
                    var14++;
                    continue L6;
                  }
                }
              }
            }
        }
    }
}
