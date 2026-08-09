/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    static long[][] field_e;
    static String field_a;
    static int[] field_g;
    static long[] field_b;
    static String field_c;
    static ue field_h;
    static int field_i;
    static String field_d;
    static String field_f;

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            int var3_int = 0;
            RuntimeException var3 = null;
            Throwable var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            String var8 = null;
            try {
              L0: {
                qi.field_b = param0;
                var3_int = 32 / ((param1 - 70) / 41);
                try {
                  L1: {
                    L2: {
                      var7 = param2.getParameter("cookieprefix");
                      var6 = var7;
                      var6 = var7;
                      var5 = param2.getParameter("cookiehost");
                      var6 = var5;
                      var6 = var5;
                      var8 = var7 + "settings=" + param0 + "; version=1; path=/; domain=" + var5;
                      var6 = var8;
                      var6 = var8;
                      if (0 == param0.length()) {
                        var6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        break L2;
                      } else {
                        var6 = var8 + "; Expires=" + ge.a((byte) -36, dd.b(88) - -94608000000L) + "; Max-Age=" + 94608000L;
                        break L2;
                      }
                    }
                    mb.a("document.cookie=\"" + var6 + "\"", param2, 790);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var4 = decompiledCaughtException;
                    break L3;
                  }
                }
                lj.a(816415832, param2);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var3);

                stackIn_11_1 = new StringBuilder().append("lj.D(");

                if (param0 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L5;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        jh.field_b.field_p = 0;
        if (param0 != -30294) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            lj.a((String) null, -127, (java.applet.Applet) null);
        }
        jh.field_b.field_d = 0;
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 <= 65) {
            field_d = (String) null;
        }
        field_f = null;
        field_c = null;
        field_h = null;
        field_g = null;
        field_d = null;
        field_b = null;
        field_e = (long[][]) null;
    }

    final static String a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -5) {
              stackIn_4_0 = mj.a(param0 + 106, false, param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("lj.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = param1.getCodeBase();
                      if (param0 == 816415832) {
                        break L2;
                      } else {
                        lj.a(16, -122);
                        break L2;
                      }
                    }
                    var3 = wh.a(127, var4, param1).getFile();
                    mb.a(new Object[]{"home", var3 + "home.ws"}, param1, "updatelinks", param0 ^ -816443192);
                    mb.a(new Object[]{"gamelist", var3 + "togamelist.ws"}, param1, "updatelinks", param0 + -816443336);
                    mb.a(new Object[]{"serverlist", var3 + "toserverlist.ws"}, param1, "updatelinks", -27504);
                    mb.a(new Object[]{"options", var3 + "options.ws"}, param1, "updatelinks", -27504);
                    mb.a(new Object[]{"terms", var3 + "terms.ws"}, param1, "updatelinks", -27504);
                    mb.a(new Object[]{"privacy", var3 + "privacy.ws"}, param1, "updatelinks", -27504);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = decompiledCaughtException;
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("lj.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var2 = 0;
          if (param1 == 8710) {
            break L0;
          } else {
            lj.a(-73, -1);
            break L0;
          }
        }
        L1: {
          var3 = qb.field_h;
          if ((var3 ^ -1) > -6) {
            var2 = var3 * (var3 * 8192) / 1100;
            break L1;
          } else {
            if (-106 >= (var3 ^ -1)) {
              if (-121 >= (var3 ^ -1)) {
                break L1;
              } else {
                var3 = 120 + -var3;
                var2 = 8192 + -(8192 * (var3 * var3) / 3300);
                break L1;
              }
            } else {
              var2 = (var3 * 16384 + -40960) / 220;
              break L1;
            }
          }
        }
        L2: {
          var4 = 1;
          var5 = 0;
          if ((param0 ^ -1) != -2) {
            break L2;
          } else {
            var5 = 1;
            break L2;
          }
        }
        L3: {
          if ((param0 ^ -1) != -4) {
            break L3;
          } else {
            var4 = -1;
            break L3;
          }
        }
        L4: {
          if (param0 != 4) {
            break L4;
          } else {
            var5 = 1;
            var4 = 1;
            break L4;
          }
        }
        L5: {
          if (param0 == 5) {
            var5 = 1;
            var4 = -1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (-7 != (param0 ^ -1)) {
            break L6;
          } else {
            var4 = 1;
            var5 = -1;
            break L6;
          }
        }
        L7: {
          L8: {
            if ((param0 ^ -1) == -8) {
              break L8;
            } else {
              if ((param0 ^ -1) == -9) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L7;
        }
        L9: {
          if ((param0 ^ -1) != -12) {
            break L9;
          } else {
            var4 = -1;
            break L9;
          }
        }
        L10: {
          if (12 == param0) {
            var5 = -1;
            var4 = -1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (-14 != (param0 ^ -1)) {
            break L11;
          } else {
            var5 = -1;
            var4 = 1;
            break L11;
          }
        }
        L12: {
          if (param0 == 14) {
            var4 = -1;
            var5 = 1;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if ((param0 ^ -1) == -16) {
            var5 = 1;
            var4 = 1;
            break L13;
          } else {
            break L13;
          }
        }
        la.field_d = ah.a(var5 * var2, (byte) 61, var2 * var4);
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
        field_a = "members-only content";
        field_g = new int[8192];
        field_e = new long[8][256];
        field_b = new long[11];
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
        for (var0 = 0; -257 < (var0 ^ -1); var0++) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = -1 != (var0 & 1 ^ -1) ? (long)(var1 & 255) : (long)(var1 >>> 53153128);
            var4 = var2 << -1210301887;
            if ((var4 ^ -1L) <= -257L) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << -326556991;
            if (256L <= var6) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << 1060880961;
            if (!(-257L < (var10 ^ -1L))) {
                var10 = var10 ^ 285L;
            }
            var12 = var10 ^ var2;
            field_e[0][var0] = ie.a(ie.a(var4 << 1897103496, ie.a(var8 << -1654736112, ie.a(var10 << 816415832, ie.a(var2 << 1523196064, ie.a(ie.a(var2 << -1247581136, var2 << -673000328), var6 << -1946519320))))), var12);
            for (var14 = 1; (var14 ^ -1) > -9; var14++) {
                field_e[var14][var0] = ie.a(field_e[-1 + var14][var0] << 1538737144, field_e[-1 + var14][var0] >>> -1191986360);
            }
        }
        field_b[0] = 0L;
        for (var0 = 1; -11 <= (var0 ^ -1); var0++) {
            var1 = 8 * var0 + -8;
            field_b[var0] = ba.a(r.a(255L, field_e[7][var1 - -7]), ba.a(r.a(65280L, field_e[6][var1 + 6]), ba.a(ba.a(r.a(4278190080L, field_e[4][var1 - -4]), ba.a(ba.a(ba.a(r.a(71776119061217280L, field_e[1][var1 - -1]), r.a(-72057594037927936L, field_e[0][var1])), r.a(field_e[2][2 + var1], 280375465082880L)), r.a(field_e[3][var1 + 3], 1095216660480L))), r.a(field_e[5][5 + var1], 16711680L))));
        }
        field_f = "Age:";
    }
}
