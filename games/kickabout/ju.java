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
        Object var3 = null;
        ju.a(2.5262746810913086f, (String) null, (byte) 100);
        return null;
    }

    final static void a(int param0, int param1, int param2, ut[] param3, int param4) {
        int var10 = Kickabout.field_G;
        if (param3 != null) {
            // if_icmple L20
        } else {
            return;
        }
        int var5 = param3[0].field_o;
        int var6 = param3[2].field_o;
        if (param1 >= -120) {
            field_W = null;
        }
        int var7 = param3[1].field_o;
        param3[0].c(param0, param2);
        param3[2].c(param4 + param0 - var6, param2);
        on.a(vi.field_q);
        on.h(var5 + param0, param2, -var6 + param4 + param0, param3[1].field_v + param2);
        int var8 = param0 - -var5;
        int var9 = param4 + (param0 + -var6);
        param0 = var8;
        while (var9 > param0) {
            param3[1].c(param0, param2);
            param0 = param0 + var7;
        }
        on.b(vi.field_q);
    }

    final void a(byte param0, fd param1, int param2, int param3) {
        ((ju) this).field_S = ((ju) this).field_S + 1;
        super.a(param0, param1, param2, param3);
    }

    final static char b(int param0, char param1) {
        Object var3 = null;
        L0: {
          if (param1 == 181) {
            break L0;
          } else {
            if (param1 != 402) {
              L1: {
                if (param0 == 19805) {
                  break L1;
                } else {
                  var3 = null;
                  ju.a(1.7499217987060547f, (String) null, (byte) -94);
                  break L1;
                }
              }
              return Character.toTitleCase(param1);
            } else {
              break L0;
            }
          }
        }
        return param1;
    }

    final boolean a(fd param0, int param1) {
        if (param1 != 0) {
            Object var4 = null;
            ju.a(-120, -71, -85, (ut[]) null, -72);
        }
        return false;
    }

    ju(l param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (gj) (Object) fr.h((byte) 66));
        ((ju) this).field_R = param0;
        ((ju) this).field_O = param1;
        ((ju) this).a(param5, 1, param2, param4, param3);
    }

    public static void h(byte param0) {
        int var1 = 118 / ((-50 - param0) / 37);
        field_V = null;
        field_W = null;
        field_P = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        rv var6 = null;
        ke var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ut var14 = null;
        ut var15 = null;
        ut var16 = null;
        L0: {
          L1: {
            var13 = Kickabout.field_G;
            var6 = ((ju) this).field_R.c(-24407);
            if (var6 == mn.field_c) {
              break L1;
            } else {
              if (var6 != en.field_p) {
                var5 = ((ju) this).field_R.b(param1 + -90);
                if (var5 == null) {
                  var5 = ((ju) this).field_O;
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
          if (var5.equals((Object) (Object) ((ju) this).field_q)) {
            break L2;
          } else {
            ((ju) this).field_q = var5;
            ((ju) this).a((byte) -41);
            break L2;
          }
        }
        L3: {
          L4: {
            super.a(param0, (int) (char)param1, param2, param3);
            var6 = ((ju) this).field_R.c(-24407);
            var8 = (ke) (Object) ((ju) this).field_r;
            var9 = param2 - -((ju) this).field_t;
            var10 = var8.a(true, (fd) this, param3) - -(var8.a(5035, (fd) this).a(-1761) >> 1197058785);
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
              if (null == ((ju) this).field_Q) {
                break L6;
              } else {
                if (((ju) this).field_Q.field_q < var11) {
                  break L6;
                } else {
                  if (((ju) this).field_Q.field_w < var12) {
                    break L6;
                  } else {
                    iw.a(param1 ^ -19, ((ju) this).field_Q);
                    on.b();
                    break L5;
                  }
                }
              }
            }
            ((ju) this).field_Q = new ut(var11, var12);
            iw.a(70, ((ju) this).field_Q);
            break L5;
          }
          var14.b(112, 144, var14.field_o << 1143986596, var14.field_v << 607820932, -((ju) this).field_S << -1809735574, 4096);
          ta.e(126);
          ((ju) this).field_Q.c(-(var14.field_o >> 1176535073) + var9, -var14.field_v + var10, 256);
          break L3;
        }
    }

    final static ut a(int param0, int param1, sj param2, byte param3) {
        if (param3 != -9) {
            return null;
        }
        if (!cu.a(param1, param2, param0, param3 ^ -105)) {
            return null;
        }
        return mo.b(param3 + 9);
    }

    final static void a(float param0, String param1, byte param2) {
        if (param2 != 30) {
            return;
        }
        hw.field_j = param0;
        ts.field_b = param1;
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
        field_T = false;
        field_W = new long[8][256];
        field_V = new long[11];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_V[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if (var0 > 10) {
                field_P = "Log in";
              } else {
                var1 = -8 + 8 * var0;
                field_V[var0] = sd.a(mg.a(255L, field_W[7][var1 - -7]), sd.a(mg.a(65280L, field_W[6][var1 + 6]), sd.a(sd.a(mg.a(4278190080L, field_W[4][4 + var1]), sd.a(sd.a(mg.a(field_W[2][var1 - -2], 280375465082880L), sd.a(mg.a(71776119061217280L, field_W[1][1 + var1]), mg.a(field_W[0][var1], -72057594037927936L))), mg.a(1095216660480L, field_W[3][var1 + 3]))), mg.a(field_W[5][var1 + 5], 16711680L))));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((var0 & 1) != 0) {
                stackOut_4_0 = (long)(255 & var1);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 >>> 803707464);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1450181185;
              if (256L > var4) {
                break L3;
              } else {
                var4 = var4 ^ 285L;
                break L3;
              }
            }
            L4: {
              var6 = var4 << 2128848897;
              if ((var6 ^ -1L) <= -257L) {
                var6 = var6 ^ 285L;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << -1531683007;
              if (256L > var10) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var2 ^ var10;
            field_W[0][var0] = aq.a(var12, aq.a(var4 << -365431480, aq.a(aq.a(var10 << -1151721192, aq.a(aq.a(var6 << -725582488, aq.a(var2 << 1009455792, var2 << 1006682360)), var2 << -80238496)), var8 << 464022992)));
            var14 = 1;
            L6: while (true) {
              if ((var14 ^ -1) <= -9) {
                var0++;
                continue L0;
              } else {
                field_W[var14][var0] = aq.a(field_W[var14 - 1][var0] << -2076280904, field_W[var14 - 1][var0] >>> 1322694792);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
