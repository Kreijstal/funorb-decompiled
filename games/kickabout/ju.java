/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ju extends lb {
    private String field_O;
    private int field_S;
    static boolean field_T;
    private l field_R;
    private ut field_Q;
    static long[][] field_W;
    static long[] field_V;
    static String field_P;
    static int field_U;

    final String f(int param0) {
        if (param0 == -1) {
            return null;
        }
        String var3 = (String) null;
        ju.a(2.5262746810913086f, (String) null, (byte) 100);
        return null;
    }

    final static void a(int param0, int param1, int param2, ut[] param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (-1 <= (param4 ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    var5_int = param3[0].field_o;
                    var6 = param3[2].field_o;
                    if (param1 < -120) {
                      break L2;
                    } else {
                      field_W = (long[][]) null;
                      break L2;
                    }
                  }
                  var7 = param3[1].field_o;
                  param3[0].c(param0, param2);
                  param3[2].c(param4 + param0 - var6, param2);
                  on.a(vi.field_q);
                  on.h(var5_int + param0, param2, -var6 + param4 + param0, param3[1].field_v + param2);
                  var8 = param0 - -var5_int;
                  var9 = param4 + (param0 + -var6);
                  param0 = var8;
                  L3: while (true) {
                    if (var9 <= param0) {
                      on.b(vi.field_q);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param3[1].c(param0, param2);
                      param0 = param0 + var7;
                      continue L3;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("ju.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, fd param1, int param2, int param3) {
        try {
            this.field_S = this.field_S + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ju.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static char b(int param0, char param1) {
        if (param1 == 181 || param1 == 402) {
            return param1;
        }
        if (param0 != 19805) {
            String var3 = (String) null;
            ju.a(1.7499217987060547f, (String) null, (byte) -94);
        }
        return Character.toTitleCase(param1);
    }

    final boolean a(fd param0, int param1) {
        RuntimeException var3 = null;
        ut[] var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var4 = (ut[]) null;
                ju.a(-120, -71, -85, (ut[]) null, -72);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ju.HA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    ju(l param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, fr.h((byte) 66));
        try {
            this.field_R = param0;
            this.field_O = param1;
            this.a(param5, 1, param2, param4, param3);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ju.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void h(byte param0) {
        int var1 = 118 / ((-50 - param0) / 37);
        field_V = null;
        field_W = (long[][]) null;
        field_P = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5;
        rv var6;
        ke var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        ut var14;
        ut var15;
        ut var16;
        L0: {
          L1: {
            var13 = Kickabout.field_G;
            var6 = this.field_R.c(-24407);
            if (var6 == mn.field_c) {
              break L1;
            } else {
              if (var6 != en.field_p) {
                var5 = this.field_R.b(param1 + -90);
                if (var5 == null) {
                  var5 = this.field_O;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          var5 = qh.field_a;
          break L0;
        }
        L2: {
          if (var5.equals(this.field_q)) {
            break L2;
          } else {
            this.field_q = var5;
            this.a((byte) -41);
            break L2;
          }
        }
        L3: {
          L4: {
            super.a(param0, (int) (char)param1, param2, param3);
            var6 = this.field_R.c(-24407);
            var8 = (ke) ((Object) this.field_r);
            var9 = param2 - -this.field_t;
            var10 = var8.a(true, (fd) (this), param3) - -(var8.a(5035, (fd) (this)).a(-1761) >> 1197058785);
            if (var6 == mn.field_c) {
              break L4;
            } else {
              if (var6 != en.field_p) {
                if (jt.field_Bb != var6) {
                  if (var6 == he.field_yb) {
                    var16 = jc.field_g[1];
                    var16.c(var9, var10 - (var16.field_w >> 847731425), 256);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  var15 = jc.field_g[2];
                  var15.c(var9, var10 - (var15.field_w >> 1414980481), 256);
                  break L3;
                }
              } else {
                break L4;
              }
            }
          }
          L5: {
            L6: {
              var14 = jc.field_g[0];
              var11 = var14.field_o << 1567258785;
              var12 = var14.field_v << 94174561;
              if (null == this.field_Q) {
                break L6;
              } else {
                if (this.field_Q.field_q < var11) {
                  break L6;
                } else {
                  if (this.field_Q.field_w < var12) {
                    break L6;
                  } else {
                    iw.a(param1 ^ -19, this.field_Q);
                    on.b();
                    break L5;
                  }
                }
              }
            }
            this.field_Q = new ut(var11, var12);
            iw.a(70, this.field_Q);
            break L5;
          }
          var14.b(112, 144, var14.field_o << 1143986596, var14.field_v << 607820932, -this.field_S << -1809735574, 4096);
          ta.e(126);
          this.field_Q.c(-(var14.field_o >> 1176535073) + var9, -var14.field_v + var10, 256);
          break L3;
        }
    }

    final static ut a(int param0, int param1, sj param2, byte param3) {
        RuntimeException var4 = null;
        ut stackIn_2_0 = null;
        ut stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == -9) {
              if (cu.a(param1, param2, param0, param3 ^ -105)) {
                stackIn_7_0 = mo.b(param3 + 9);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackIn_2_0 = (ut) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ju.R(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(float param0, String param1, byte param2) {
        if (param2 != 30) {
            return;
        }
        try {
            hw.field_j = param0;
            ts.field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ju.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
        field_T = false;
        field_W = new long[8][256];
        field_V = new long[11];
        for (var0 = 0; var0 < 256; var0++) {
            var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
            var2 = (var0 & 1) == 0 ? (long)(var1 >>> 803707464) : (long)(255 & var1);
            var4 = var2 << 1450181185;
            if (256L <= var4) {
                var4 = var4 ^ 285L;
            }
            var6 = var4 << 2128848897;
            if (!((var6 ^ -1L) > -257L)) {
                var6 = var6 ^ 285L;
            }
            var8 = var6 ^ var2;
            var10 = var6 << -1531683007;
            if (256L <= var10) {
                var10 = var10 ^ 285L;
            }
            var12 = var2 ^ var10;
            field_W[0][var0] = aq.a(var12, aq.a(var4 << -365431480, aq.a(aq.a(var10 << -1151721192, aq.a(aq.a(var6 << -725582488, aq.a(var2 << 1009455792, var2 << 1006682360)), var2 << -80238496)), var8 << 464022992)));
            for (var14 = 1; (var14 ^ -1) > -9; var14++) {
                field_W[var14][var0] = aq.a(field_W[var14 - 1][var0] << -2076280904, field_W[var14 - 1][var0] >>> 1322694792);
            }
        }
        field_V[0] = 0L;
        for (var0 = 1; var0 <= 10; var0++) {
            var1 = -8 + 8 * var0;
            field_V[var0] = sd.a(mg.a(255L, field_W[7][var1 - -7]), sd.a(mg.a(65280L, field_W[6][var1 + 6]), sd.a(sd.a(mg.a(4278190080L, field_W[4][4 + var1]), sd.a(sd.a(mg.a(field_W[2][var1 - -2], 280375465082880L), sd.a(mg.a(71776119061217280L, field_W[1][1 + var1]), mg.a(field_W[0][var1], -72057594037927936L))), mg.a(1095216660480L, field_W[3][var1 + 3]))), mg.a(field_W[5][var1 + 5], 16711680L))));
        }
        field_P = "Log in";
    }
}
