/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static long[][] field_b;
    static String field_a;
    static long[] field_f;
    static String field_c;
    static k field_d;
    static int field_e;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -4) {
            field_d = null;
        }
        field_f = null;
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(long param0, String param1, java.applet.Applet param2, String param3, int param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var8 = param2.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                var9 = param3 + "=" + param1 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (param0 >= (long)param4) {
                  var7 = var9 + "; Expires=" + td.a(param0 * 1000L + ol.a(256), (byte) -8) + "; Max-Age=" + param0;
                  break L0;
                } else {
                  var7 = var9 + "; Discard;";
                  break L0;
                }
              }
              ff.a(param2, "document.cookie=\"" + var7 + "\"", (byte) 1);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static k a(byte param0, int param1) {
        k[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        k[] var6 = null;
        L0: {
          var4 = TorChallenge.field_F ? 1 : 0;
          var6 = nj.a((byte) 104);
          var2 = var6;
          if (param0 >= 122) {
            break L0;
          } else {
            var5 = null;
            oh.a(-4L, (String) null, (java.applet.Applet) null, (String) null, 93);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 < var6.length) {
            if (var6[var3].field_i == param1) {
              return var6[var3];
            } else {
              var3++;
              continue L1;
            }
          } else {
            return null;
          }
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
        int var15 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_b = new long[8][256];
        field_f = new long[11];
        field_c = "Passwords must be between 5 and 20 characters long";
        field_a = "ERROR: missing text";
        var0 = 0;
        L0: while (true) {
          if (-257 >= var0) {
            field_f[0] = 0L;
            var15 = 1;
            var0 = var15;
            L1: while (true) {
              if (-11 > (var15 ^ -1)) {
                field_e = 0;
                field_d = new k(6, 0, 4, 2);
              } else {
                var1 = -8 + var15 * 8;
                field_f[var15] = d.a(d.a(ba.a(field_b[6][var1 + 6], 65280L), d.a(d.a(ba.a(4278190080L, field_b[4][var1 - -4]), d.a(ba.a(field_b[3][var1 + 3], 1095216660480L), d.a(ba.a(280375465082880L, field_b[2][2 + var1]), d.a(ba.a(field_b[1][var1 + 1], 71776119061217280L), ba.a(field_b[0][var1], -72057594037927936L))))), ba.a(field_b[5][5 + var1], 16711680L))), ba.a(field_b[7][7 + var1], 255L));
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (-1 == (1 & var0)) {
                stackOut_4_0 = (long)(var1 >>> -1119533176);
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
              var4 = var2 << 513603329;
              if (-257L >= (var4 ^ -1L)) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << 295464449;
              if (256L > var6) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << -830381823;
              if (var10 >= 256L) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var2 ^ var10;
            field_b[0][var0] = rj.a(rj.a(var4 << 2099255176, rj.a(rj.a(rj.a(rj.a(rj.a(var2 << -2092594312, var2 << 599989808), var6 << -1054790872), var2 << 2058090144), var10 << -1213552744), var8 << 1636541392)), var12);
            var14 = 1;
            L6: while (true) {
              if ((var14 ^ -1) <= -9) {
                var0++;
                continue L0;
              } else {
                field_b[var14][var0] = rj.a(field_b[-1 + var14][var0] << 1695990776, field_b[var14 - 1][var0] >>> -799867128);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
