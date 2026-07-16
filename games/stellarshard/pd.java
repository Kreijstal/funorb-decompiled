/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends vk {
    private bd field_t;
    static pb field_s;
    private int field_o;
    static String[] field_g;
    static lj field_e;
    static int[] field_u;
    private int field_n;
    private String field_m;
    private int field_k;
    static vi field_h;
    private boolean field_r;
    static int field_q;
    static long[] field_j;
    static long[][] field_l;
    private int field_v;
    static va field_f;
    private int field_i;
    static String field_p;

    final void a(boolean param0, String param1, int param2, int param3, bd param4) {
        if (!(param1 != null)) {
            ((pd) this).field_a = null;
            return;
        }
        if (param4 == ((pd) this).field_t) {
            if (((pd) this).field_r) {
                if (-2 == (((pd) this).field_o ^ -1)) {
                    if (null != ((pd) this).field_m) {
                        if (!(!((pd) this).field_m.equals((Object) (Object) param1))) {
                            return;
                        }
                    }
                }
            }
        }
        ((pd) this).field_t = param4;
        ((pd) this).field_r = param0 ? true : false;
        ((pd) this).field_o = 1;
        uj var8 = this.a(param2, !param0 ? true : false, param1, param4);
        int var7 = param4.b(param1);
        var8.field_a[0] = -(var7 >> 945312385) + param3;
        var8.field_a[param1.length()] = (var7 >> 319797313) + param3;
        mh.a(1, 0, param1, var8, param4);
    }

    final void a(int param0, int param1, int param2, int param3, bd param4, int param5, String param6, byte param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        uj var14 = null;
        int var15 = 0;
        Object var16 = null;
        String[] var17 = null;
        String[] var18 = null;
        uj stackIn_33_0 = null;
        uj stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        uj stackIn_34_0 = null;
        uj stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        uj stackIn_35_0 = null;
        uj stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        int stackIn_35_4 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        uj stackOut_32_0 = null;
        uj stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        uj stackOut_34_0 = null;
        uj stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        uj stackOut_33_0 = null;
        uj stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        L0: {
          var15 = stellarshard.field_B;
          if (0 == param1) {
            param1 = param4.field_v;
            break L0;
          } else {
            break L0;
          }
        }
        if (param6 != null) {
          L1: {
            if (param7 < -32) {
              break L1;
            } else {
              var16 = null;
              ((pd) this).a(-57, -104, 68, -43, (bd) null, -58, (String) null, (byte) -4);
              break L1;
            }
          }
          L2: {
            if (((pd) this).field_t != param4) {
              break L2;
            } else {
              if (((pd) this).field_r) {
                break L2;
              } else {
                if (((pd) this).field_o != param3) {
                  break L2;
                } else {
                  if ((param0 ^ -1) != (((pd) this).field_i ^ -1)) {
                    break L2;
                  } else {
                    if ((((pd) this).field_k ^ -1) != (param1 ^ -1)) {
                      break L2;
                    } else {
                      if (param5 != ((pd) this).field_n) {
                        break L2;
                      } else {
                        if ((param2 ^ -1) != (((pd) this).field_v ^ -1)) {
                          break L2;
                        } else {
                          if (null == ((pd) this).field_m) {
                            break L2;
                          } else {
                            if (((pd) this).field_m.equals((Object) (Object) param6)) {
                              return;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L3: {
            ((pd) this).field_t = param4;
            ((pd) this).field_n = param5;
            ((pd) this).field_m = param6;
            ((pd) this).field_k = param1;
            ((pd) this).field_v = param2;
            ((pd) this).field_r = false;
            ((pd) this).field_i = param0;
            ((pd) this).field_o = param3;
            var17 = new String[param4.c(param6, param2) - -1];
            var18 = var17;
            var10 = Math.max(1, param4.a(param6, new int[1], var18));
            if ((((pd) this).field_i ^ -1) != -4) {
              break L3;
            } else {
              if (-2 != (var10 ^ -1)) {
                break L3;
              } else {
                ((pd) this).field_i = 1;
                break L3;
              }
            }
          }
          L4: {
            ((pd) this).field_a = new uj[var10];
            if ((((pd) this).field_i ^ -1) == -1) {
              var11 = param4.field_N;
              break L4;
            } else {
              if (((pd) this).field_i == 1) {
                var11 = (-(var10 * ((pd) this).field_k) + ((pd) this).field_n >> -1123900447) + param4.field_N;
                break L4;
              } else {
                if (((pd) this).field_i == 2) {
                  var11 = -(((pd) this).field_k * var10) + -param4.field_r + ((pd) this).field_n;
                  break L4;
                } else {
                  L5: {
                    var12 = (-(((pd) this).field_k * var10) + ((pd) this).field_n) / (1 + var10);
                    if (0 <= var12) {
                      break L5;
                    } else {
                      var12 = 0;
                      break L5;
                    }
                  }
                  ((pd) this).field_k = ((pd) this).field_k + var12;
                  var11 = param4.field_N - -var12;
                  break L4;
                }
              }
            }
          }
          var12 = 0;
          L6: while (true) {
            if (var10 <= var12) {
              return;
            } else {
              L7: {
                var13 = var17[var12];
                stackOut_32_0 = null;
                stackOut_32_1 = null;
                stackOut_32_2 = -param4.field_N + var11;
                stackOut_32_3 = var11 - -param4.field_r;
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                stackIn_34_2 = stackOut_32_2;
                stackIn_34_3 = stackOut_32_3;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                stackIn_33_2 = stackOut_32_2;
                stackIn_33_3 = stackOut_32_3;
                if (var13 != null) {
                  stackOut_34_0 = null;
                  stackOut_34_1 = null;
                  stackOut_34_2 = stackIn_34_2;
                  stackOut_34_3 = stackIn_34_3;
                  stackOut_34_4 = var13.length();
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  stackIn_35_2 = stackOut_34_2;
                  stackIn_35_3 = stackOut_34_3;
                  stackIn_35_4 = stackOut_34_4;
                  break L7;
                } else {
                  stackOut_33_0 = null;
                  stackOut_33_1 = null;
                  stackOut_33_2 = stackIn_33_2;
                  stackOut_33_3 = stackIn_33_3;
                  stackOut_33_4 = 0;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_35_2 = stackOut_33_2;
                  stackIn_35_3 = stackOut_33_3;
                  stackIn_35_4 = stackOut_33_4;
                  break L7;
                }
              }
              L8: {
                var14 = new uj(stackIn_35_2, stackIn_35_3, stackIn_35_4);
                var14.field_a[0] = 0;
                if (var13 == null) {
                  break L8;
                } else {
                  L9: {
                    var14.field_a[var13.length()] = param4.b(var13);
                    stackOut_36_0 = 1;
                    stackIn_38_0 = stackOut_36_0;
                    stackIn_37_0 = stackOut_36_0;
                    if ((param3 ^ -1) != -4) {
                      stackOut_38_0 = stackIn_38_0;
                      stackOut_38_1 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      stackIn_39_1 = stackOut_38_1;
                      break L9;
                    } else {
                      stackOut_37_0 = stackIn_37_0;
                      stackOut_37_1 = ((pd) this).a(var13, false, param2, param4.b(var13));
                      stackIn_39_0 = stackOut_37_0;
                      stackIn_39_1 = stackOut_37_1;
                      break L9;
                    }
                  }
                  mh.a(stackIn_39_0, stackIn_39_1, var13, var14, param4);
                  break L8;
                }
              }
              var11 = var11 + param1;
              ((pd) this).field_a[var12] = var14;
              var12++;
              continue L6;
            }
          }
        } else {
          ((pd) this).field_a = null;
          return;
        }
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, byte param3) {
        java.awt.Graphics var4 = null;
        if (param3 >= -14) {
            return;
        }
        try {
            var4 = param0.getGraphics();
            field_h.a(param1, var4, -22984, param2);
            var4.dispose();
        } catch (Exception exception) {
            param0.repaint();
        }
    }

    final void a(int param0, bd param1, String param2, int param3, int param4) {
        if (param2 == null) {
            ((pd) this).field_a = null;
            return;
        }
        if (((pd) this).field_t == param1) {
            if (((pd) this).field_r) {
                if (-1 == (((pd) this).field_o ^ -1)) {
                    if (((pd) this).field_m != null) {
                        if (!(!((pd) this).field_m.equals((Object) (Object) param2))) {
                            return;
                        }
                    }
                }
            }
        }
        ((pd) this).field_m = param2;
        ((pd) this).field_r = true;
        ((pd) this).field_t = param1;
        ((pd) this).field_o = 0;
        uj var7 = this.a(param4, false, param2, param1);
        uj var8 = var7;
        var7.field_a[param3] = param0;
        var8.field_a[param2.length()] = param1.b(param2) + param0;
        mh.a(param3 + 1, 0, param2, var8, param1);
    }

    final void a(int param0, bd param1, int param2, String param3, byte param4) {
        if (param3 == null) {
            ((pd) this).field_a = null;
            return;
        }
        if (param1 == ((pd) this).field_t) {
            if (((pd) this).field_r) {
                if (((pd) this).field_o == 2) {
                    if (((pd) this).field_m != null) {
                        if (((pd) this).field_m.equals((Object) (Object) param3)) {
                            return;
                        }
                    }
                }
            }
        }
        ((pd) this).field_t = param1;
        ((pd) this).field_m = param3;
        ((pd) this).field_o = 2;
        ((pd) this).field_r = true;
        if (param4 != 22) {
            field_h = null;
        }
        uj var8 = this.a(param2, false, param3, param1);
        uj var9 = var8;
        var9.field_a[0] = param0 - param1.b(param3);
        var9.field_a[param3.length()] = param0;
        mh.a(1, 0, param3, var9, param1);
    }

    private final uj a(int param0, boolean param1, String param2, bd param3) {
        uj var6 = new uj(param0 - param3.field_N, param0 - -param3.field_r, param2.length());
        uj var5 = var6;
        ((pd) this).field_a = new uj[]{var6};
        if (param1) {
            ((pd) this).field_t = null;
        }
        return var5;
    }

    final static void a(int param0, hk param1, int param2) {
        ha var3 = pg.field_fb;
        var3.f(param0, 950);
        var3.a(false, 5);
        if (param2 < 1) {
            field_u = null;
        }
        var3.a(false, 0);
        var3.c(param1.field_t, -128);
        var3.a(false, param1.field_q);
        var3.a(false, param1.field_r);
    }

    public static void b(byte param0) {
        field_j = null;
        if (param0 < 110) {
            return;
        }
        field_p = null;
        field_f = null;
        field_s = null;
        field_e = null;
        field_l = null;
        field_g = null;
        field_h = null;
        field_u = null;
    }

    public pd() {
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
        field_s = new pb(270, 70);
        field_l = new long[8][256];
        field_j = new long[11];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_j[0] = 0L;
            var15 = 1;
            var0 = var15;
            L1: while (true) {
              if (var15 > 10) {
                field_p = "No highscores";
                return;
              } else {
                var1 = 8 * (-1 + var15);
                field_j[var15] = ue.a(ue.a(ue.a(ue.a(ue.a(ue.a(stellarshard.a(field_l[2][var1 - -2], 280375465082880L), ue.a(stellarshard.a(-72057594037927936L, field_l[0][var1]), stellarshard.a(71776119061217280L, field_l[1][1 + var1]))), stellarshard.a(field_l[3][var1 - -3], 1095216660480L)), stellarshard.a(4278190080L, field_l[4][var1 - -4])), stellarshard.a(16711680L, field_l[5][5 + var1])), stellarshard.a(field_l[6][6 + var1], 65280L)), stellarshard.a(field_l[7][7 + var1], 255L));
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if (0 == (var0 & 1)) {
                stackOut_4_0 = (long)(var1 >>> -811088888);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 & 255);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 2086766337;
              if (var4 < 256L) {
                break L3;
              } else {
                var4 = var4 ^ 285L;
                break L3;
              }
            }
            L4: {
              var6 = var4 << 1807066881;
              if ((var6 ^ -1L) > -257L) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var6 ^ var2;
              var10 = var6 << 1129984001;
              if (var10 < 256L) {
                break L5;
              } else {
                var10 = var10 ^ 285L;
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_l[0][var0] = ib.a(ib.a(ib.a(var8 << -1943179760, ib.a(ib.a(var2 << 1873070304, ib.a(ib.a(var2 << 982893048, var2 << -2059394448), var6 << -997507864)), var10 << -2065678760)), var4 << -157616760), var12);
            var14 = 1;
            L6: while (true) {
              if ((var14 ^ -1) <= -9) {
                var0++;
                continue L0;
              } else {
                field_l[var14][var0] = ib.a(field_l[var14 + -1][var0] >>> 1220265544, field_l[-1 + var14][var0] << -994699080);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
