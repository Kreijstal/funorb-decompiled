/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl {
    static boolean field_e;
    static mj field_d;
    static jl field_b;
    static boolean[][] field_c;
    static String field_a;

    final static void a(ge param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = TorChallenge.field_F ? 1 : 0;
        if (!param1) {
          var3 = param0.field_l.length;
          var11 = 0;
          L0: while (true) {
            if (var11 >= var3) {
              return;
            } else {
              var4 = param0.field_l[var11];
              var6 = (65280 & var4) >> 778383080;
              var5 = 255 & var4 >> -1980998320;
              var7 = var4 & 255;
              var8 = (param2 & 16711680) >> 50829552;
              var10 = 255 & param2;
              var9 = (param2 & 65280) >> -134112728;
              if (var6 + -var5 == 0) {
                if (0 == var7 + -var5) {
                  param0.field_l[var11] = (var7 * var10 >> 601405800) + ((var8 * var5 >> -1033182328 << 720957456) + (var9 * var6 >> -2098987576 << -1505649976));
                  var11++;
                  continue L0;
                } else {
                  var11++;
                  continue L0;
                }
              } else {
                var11++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        int var7 = 0;
        double var3 = 0.0;
        double var5 = 0.0;
        int var8 = TorChallenge.field_F ? 1 : 0;
        double var1 = 65536.0;
        lj.field_j = new int[1025];
        if (param0 != 50) {
            field_c = null;
        }
        for (var7 = 1; -1025 <= (var7 ^ -1); var7++) {
            var3 = (double)var7;
            var5 = var1 / var3;
            lj.field_j[var7] = (int)var5;
        }
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            ah.field_g = param2;
            try {
                var6 = param1.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                var4 = param1.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                if (param0 < 104) {
                    hl.a((byte) -50, -58);
                }
                var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (param2.length() != 0) {
                    var5 = var7 + "; Expires=" + td.a(ol.a(256) - -94608000000L, (byte) -8) + "; Max-Age=" + 94608000L;
                } else {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                ff.a(param1, "document.cookie=\"" + var5 + "\"", (byte) 1);
            } catch (Throwable throwable) {
            }
            ok.a(param1, -1);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != -106) {
            field_a = null;
        }
    }

    final static void a(byte param0, int param1) {
        int var3 = TorChallenge.field_F ? 1 : 0;
        wc.a(true, true, ia.field_q, 0, ol.field_d, param1, bb.field_c);
        int var2 = 0;
        if (param0 != -44) {
            hl.a((byte) 99);
        }
        while (var2 < bb.field_c) {
            hi.field_G[param1 + var2] = var2;
            var2++;
        }
        wc.a(false, true, v.field_Z, param1, pi.field_e, param1 - -param1, param1 + bb.field_c);
        if (bb.field_c > param1) {
            bb.field_c = param1;
        }
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        int var5 = 0;
        Object var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          gj.field_a = hf.field_b;
          if (param0 == 0) {
            break L0;
          } else {
            var6 = null;
            hl.a((ge) null, true, -103);
            break L0;
          }
        }
        L1: {
          if (255 == param1) {
            L2: {
              stackOut_7_0 = -114;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (13 <= cf.field_f) {
                stackOut_9_0 = stackIn_9_0;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L2;
              } else {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L2;
              }
            }
            pd.field_h = be.a(stackIn_10_0, stackIn_10_1 != 0);
            break L1;
          } else {
            L3: {
              if (param1 < 100) {
                break L3;
              } else {
                if (-106 > (param1 ^ -1)) {
                  break L3;
                } else {
                  pd.field_h = wk.a(param2, param0 + -1);
                  break L1;
                }
              }
            }
            pd.field_h = mg.a((byte) 81, param3, param1);
            break L1;
          }
        }
    }

    final static void a(uf param0, int param1, int param2, int param3, int param4) {
        param0.d(param1, (byte) 122);
        param0.a(17, (byte) 106);
        param0.a(param3, (byte) 106);
        param0.a(param4, (byte) 106);
        param0.d(param2, (byte) 122);
    }

    final static void a(eg param0, eg param1, int param2, int param3) {
        int var4 = -83 % ((param2 - -5) / 60);
        ec.field_c = param1;
        pf.field_c = param0;
        aj.field_b = param3;
        ok.a(qg.field_g / 2, qg.field_f / 2, (byte) -128);
        qc.a((byte) -48, param0.field_t - -param0.field_K, param0.field_t, param1.field_K + param1.field_t, param1.field_t);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_c = new boolean[][]{new boolean[3], new boolean[3], new boolean[3], new boolean[3]};
        field_d = new mj();
        field_a = "Next";
    }
}
