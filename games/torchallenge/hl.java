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
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (!param1) {
              var3_int = param0.field_l.length;
              var11 = 0;
              L1: while (true) {
                if (var11 >= var3_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var4 = param0.field_l[var11];
                    var6 = (65280 & var4) >> 778383080;
                    var5 = 255 & var4 >> -1980998320;
                    var7 = var4 & 255;
                    var8 = (param2 & 16711680) >> 50829552;
                    var10 = 255 & param2;
                    var9 = (param2 & 65280) >> -134112728;
                    if (var6 + -var5 != 0) {
                      break L2;
                    } else {
                      if (0 != var7 + -var5) {
                        break L2;
                      } else {
                        param0.field_l[var11] = (var7 * var10 >> 601405800) + ((var8 * var5 >> -1033182328 << 720957456) + (var9 * var6 >> -2098987576 << -1505649976));
                        break L2;
                      }
                    }
                  }
                  var11++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("hl.D(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        double var1_double = 0.0;
        double var3 = 0.0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_double = 65536.0;
              lj.field_j = new int[1025];
              if (param0 == 50) {
                break L1;
              } else {
                field_c = (boolean[][]) null;
                break L1;
              }
            }
            var7 = 1;
            L2: while (true) {
              if (-1025 > (var7 ^ -1)) {
                break L0;
              } else {
                var3 = (double)var7;
                var5 = var1_double / var3;
                lj.field_j[var7] = (int)var5;
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "hl.B(" + param0 + ')');
        }
    }

    final static void a(int param0, java.applet.Applet param1, String param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            try {
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
            } catch (RuntimeException runtimeException) {
                throw oj.a((Throwable) ((Object) runtimeException), "hl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = (boolean[][]) null;
        field_b = null;
        field_a = null;
        if (param0 != -106) {
            field_a = (String) null;
        }
    }

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              wc.a(true, true, ia.field_q, 0, ol.field_d, param1, bb.field_c);
              var2_int = 0;
              if (param0 == -44) {
                break L1;
              } else {
                hl.a((byte) 99);
                break L1;
              }
            }
            L2: while (true) {
              if (var2_int >= bb.field_c) {
                L3: {
                  wc.a(false, true, v.field_Z, param1, pi.field_e, param1 - -param1, param1 + bb.field_c);
                  if (bb.field_c <= param1) {
                    break L3;
                  } else {
                    bb.field_c = param1;
                    break L3;
                  }
                }
                break L0;
              } else {
                hi.field_G[param1 + var2_int] = var2_int;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "hl.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, String[] param2, String param3) {
        int var5 = 0;
        ge var6 = null;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              gj.field_a = hf.field_b;
              if (param0 == 0) {
                break L1;
              } else {
                var6 = (ge) null;
                hl.a((ge) null, true, -103);
                break L1;
              }
            }
            L2: {
              if (255 == param1) {
                L3: {
                  stackIn_10_0 = -114;

                  if (13 <= cf.field_f) {
                    stackIn_11_0 = stackIn_10_0;
                    stackIn_11_1 = 0;
                    break L3;
                  } else {
                    stackIn_11_0 = stackIn_10_0;
                    stackIn_11_1 = 1;
                    break L3;
                  }
                }
                pd.field_h = be.a(stackIn_11_0, stackIn_11_1 != 0);
                break L2;
              } else {
                L4: {
                  if (param1 < 100) {
                    break L4;
                  } else {
                    if (-106 > (param1 ^ -1)) {
                      break L4;
                    } else {
                      pd.field_h = wk.a(param2, param0 + -1);
                      break L2;
                    }
                  }
                }
                pd.field_h = mg.a((byte) 81, param3, param1);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("hl.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
    }

    final static void a(uf param0, int param1, int param2, int param3, int param4) {
        try {
            param0.d(param1, (byte) 122);
            param0.a(17, (byte) 106);
            param0.a(param3, (byte) 106);
            param0.a(param4, (byte) 106);
            param0.d(param2, (byte) 122);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "hl.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(eg param0, eg param1, int param2, int param3) {
        try {
            int var4_int = -83 % ((param2 - -5) / 60);
            ec.field_c = param1;
            pf.field_c = param0;
            aj.field_b = param3;
            ok.a(qg.field_g / 2, qg.field_f / 2, (byte) -128);
            qc.a((byte) -48, param0.field_t - -param0.field_K, param0.field_t, param1.field_K + param1.field_t, param1.field_t);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "hl.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_e = false;
        field_c = new boolean[][]{new boolean[]{true, true, true}, new boolean[]{true, false, true}, new boolean[]{false, true, false}, new boolean[]{true, true, true}};
        field_d = new mj();
        field_a = "Next";
    }
}
