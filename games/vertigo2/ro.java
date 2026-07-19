/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ro {
    static String field_a;
    static int field_e;
    static String field_f;
    static long[][] field_h;
    static long[] field_d;
    lq[] field_c;
    static int field_i;
    static nj field_b;
    static lk field_g;

    final int a(int param0) {
        int var2 = 0;
        lq[] var3 = null;
        int var4 = 0;
        lq var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Vertigo2.field_L ? 1 : 0;
          var2 = -1;
          if (param0 == 8783) {
            break L0;
          } else {
            field_b = (nj) null;
            break L0;
          }
        }
        L1: {
          if (null != this.field_c) {
            var3 = this.field_c;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(6586);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var2;
    }

    final int b(int param0, int param1) {
        int var5 = 0;
        lq var6 = null;
        int var7 = Vertigo2.field_L ? 1 : 0;
        lq[] var8 = this.field_c;
        lq[] var3 = var8;
        int var4 = -57 / ((59 - param1) / 58);
        for (var5 = 0; var8.length > var5; var5++) {
            var6 = var8[var5];
            if (!(var6.field_c.length <= param0)) {
                return var6.field_c[param0];
            }
            param0 = param0 - (var6.field_c.length + -1);
        }
        return 0;
    }

    final int b(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 88) {
            break L0;
          } else {
            field_i = -17;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_c) {
              break L2;
            } else {
              if (0 >= this.field_c.length) {
                break L2;
              } else {
                stackOut_4_0 = this.field_c[this.field_c.length + -1].field_d - this.field_c[0].field_f;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    public static void c(byte param0) {
        field_d = null;
        field_f = null;
        field_h = (long[][]) null;
        if (param0 != 76) {
            ro.a((byte) 24);
        }
        field_a = null;
        field_b = null;
        field_g = null;
    }

    final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        lq var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Vertigo2.field_L ? 1 : 0;
          if (this.field_c == null) {
            break L0;
          } else {
            if (this.field_c.length == 0) {
              break L0;
            } else {
              if (this.field_c[0].field_f > param0) {
                break L0;
              } else {
                if (param1 == 42) {
                  if (param0 <= this.field_c[this.field_c.length - 1].field_d) {
                    if (1 == this.field_c.length) {
                      return this.field_c[0].a(param2, false);
                    } else {
                      var4 = 0;
                      var5 = 0;
                      L1: while (true) {
                        if (this.field_c.length <= var5) {
                          return -1;
                        } else {
                          L2: {
                            var6 = this.field_c[var5];
                            if (var6.field_f > param0) {
                              break L2;
                            } else {
                              if (param0 <= var6.field_d) {
                                var7 = var6.a(param2, false);
                                if (var7 != -1) {
                                  return var4 + var7;
                                } else {
                                  return -1;
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                          var4 = var4 + (-1 + var6.field_c.length);
                          var5++;
                          continue L1;
                        }
                      }
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -43;
                }
              }
            }
          }
        }
        return -1;
    }

    final static void a(byte param0) {
        if (sl.field_q == null) {
          sl.field_q = new String[37];
          sl.field_q[8] = null;
          sl.field_q[9] = np.field_Jb;
          sl.field_q[2] = gb.field_a;
          sl.field_q[11] = fn.field_B;
          sl.field_q[3] = dg.field_c;
          sl.field_q[5] = oe.field_vb;
          sl.field_q[6] = mo.field_b;
          sl.field_q[13] = pb.field_a;
          sl.field_q[1] = no.field_a;
          sl.field_q[4] = rr.field_A;
          sl.field_q[7] = rk.field_x;
          sl.field_q[0] = rh.field_E;
          sl.field_q[22] = rb.field_a;
          sl.field_q[16] = bq.field_G[2];
          sl.field_q[20] = pn.field_H;
          sl.field_q[33] = gm.field_a;
          sl.field_q[32] = ek.field_C;
          sl.field_q[17] = df.field_n[0];
          if (param0 == -52) {
            sl.field_q[31] = vo.field_v;
            sl.field_q[19] = ld.field_a;
            sl.field_q[24] = mk.field_K;
            sl.field_q[26] = nn.field_p + ue.field_F[1];
            sl.field_q[34] = dh.field_b;
            sl.field_q[35] = in.field_a;
            sl.field_q[25] = ue.field_F[0] + bb.field_y;
            sl.field_q[29] = vo.field_v;
            sl.field_q[14] = bq.field_G[0];
            sl.field_q[30] = vi.field_B;
            sl.field_q[23] = sp.field_Q;
            sl.field_q[21] = qi.field_f;
            sl.field_q[27] = vi.field_x;
            sl.field_q[15] = bq.field_G[1];
            sl.field_q[18] = df.field_n[1];
            sl.field_q[28] = gm.field_a;
            sl.field_q[36] = ja.a(ek.field_C, (byte) -44);
            mb.field_q = new String[23];
            mb.field_q[7] = oe.field_vb.toLowerCase();
            mb.field_q[17] = sl.field_q[29].toLowerCase();
            mb.field_q[18] = sl.field_q[29].toLowerCase();
            mb.field_q[8] = rb.field_a.toLowerCase();
            mb.field_q[9] = rb.field_a.toLowerCase();
            mb.field_q[6] = rr.field_A.toLowerCase();
            mb.field_q[5] = dg.field_c.toLowerCase();
            mb.field_q[1] = po.field_d.toLowerCase();
            mb.field_q[2] = po.field_d.toLowerCase();
            mb.field_q[22] = po.field_d.toLowerCase();
            mb.field_q[4] = po.field_d.toLowerCase();
            mb.field_q[3] = po.field_d.toLowerCase();
            mb.field_q[13] = t.field_i.toLowerCase();
            mb.field_q[15] = dh.field_e.toLowerCase();
            mb.field_q[14] = lr.field_I.toLowerCase();
            mb.field_q[19] = ek.field_C.toLowerCase();
            mb.field_q[21] = nb.field_E.toLowerCase();
            td.field_l = new String[11];
            td.field_l[9] = gr.field_ab;
            td.field_l[6] = lr.field_I;
            td.field_l[0] = sr.field_c;
            td.field_l[8] = rh.field_G;
            td.field_l[4] = ri.field_z;
            td.field_l[10] = rp.field_d;
            qe.field_U = new String[10];
            td.field_l[2] = or.field_l;
            td.field_l[1] = wp.field_e;
            td.field_l[5] = uj.field_e;
            td.field_l[3] = ua.field_d;
            td.field_l[7] = pe.field_t;
            qe.field_U[0] = gg.field_s;
            qe.field_U[5] = kf.field_a;
            qe.field_U[7] = b.field_b;
            qe.field_U[8] = pb.field_d;
            qe.field_U[2] = jb.field_L;
            qe.field_U[4] = og.field_c;
            qe.field_U[1] = an.field_e;
            qe.field_U[6] = b.field_a;
            qe.field_U[3] = le.field_e;
            qe.field_U[9] = to.field_d;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final int a(int param0, int param1) {
        int discarded$0 = 0;
        lq var4 = null;
        int var5 = Vertigo2.field_L ? 1 : 0;
        int var3 = 0;
        if (param1 != 22413) {
            String var6 = (String) null;
            discarded$0 = this.a((String) null, false, -10, -11);
        }
        while (var3 < this.field_c.length) {
            var4 = this.field_c[var3];
            if (param0 < var4.field_c.length) {
                return var3;
            }
            param0 = param0 - (-1 + var4.field_c.length);
            var3++;
        }
        return this.field_c.length;
    }

    final int a(String param0, boolean param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var10 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = param1 ? 1 : 0;
            var7 = param0.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                if (-1 <= (var5_int ^ -1)) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_14_0 = (-param2 + param3 << -1224344376) / var5_int;
                  stackIn_15_0 = stackOut_14_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  var9 = param0.charAt(var8);
                  if (60 == var9) {
                    var6 = 1;
                    break L2;
                  } else {
                    if (var9 != 62) {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var6 = 0;
                      break L2;
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var5);
            stackOut_18_1 = new StringBuilder().append("ro.J(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0;
        } else {
          return stackIn_17_0;
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
            long stackIn_5_0 = 0L;
            long stackOut_4_0 = 0L;
            long stackOut_3_0 = 0L;
            field_e = 0;
            field_a = "Staff impersonation";
            field_f = "If you do nothing the game will revert to normal view in <%0> seconds.";
            field_i = 83;
            field_d = new long[11];
            field_h = new long[8][256];
            var0 = 0;
            L0: while (true) {
              if ((var0 ^ -1) <= -257) {
                field_d[0] = 0L;
                var0 = 1;
                L1: while (true) {
                  if (10 < var0) {
                    field_b = null;
                    break $cfr$clinit;
                  } else {
                    var1 = (-1 + var0) * 8;
                    field_d[var0] = og.a(og.a(og.a(og.a(og.a(og.a(og.a(j.a(71776119061217280L, field_h[1][var1 + 1]), j.a(-72057594037927936L, field_h[0][var1])), j.a(field_h[2][var1 - -2], 280375465082880L)), j.a(field_h[3][var1 - -3], 1095216660480L)), j.a(4278190080L, field_h[4][var1 + 4])), j.a(16711680L, field_h[5][5 + var1])), j.a(65280L, field_h[6][6 + var1])), j.a(255L, field_h[7][7 + var1]));
                    var0++;
                    continue L1;
                  }
                }
              } else {
                L2: {
                  var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓\udc0b鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
                  if (0 == (1 & var0)) {
                    stackOut_4_0 = (long)(var1 >>> 384556616);
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
                  var4 = var2 << -2112163647;
                  if ((var4 ^ -1L) > -257L) {
                    break L3;
                  } else {
                    var4 = var4 ^ 285L;
                    break L3;
                  }
                }
                L4: {
                  var6 = var4 << -1350127743;
                  if (256L > var6) {
                    break L4;
                  } else {
                    var6 = var6 ^ 285L;
                    break L4;
                  }
                }
                L5: {
                  var8 = var6 ^ var2;
                  var10 = var6 << -397333567;
                  if (256L > var10) {
                    break L5;
                  } else {
                    var10 = var10 ^ 285L;
                    break L5;
                  }
                }
                var12 = var2 ^ var10;
                field_h[0][var0] = bq.a(var12, bq.a(var4 << -849076024, bq.a(var8 << -161581488, bq.a(var10 << -1327596392, bq.a(bq.a(var6 << -399264216, bq.a(var2 << 364093432, var2 << -938042832)), var2 << -1265662624)))));
                var14 = 1;
                L6: while (true) {
                  if (var14 >= 8) {
                    var0++;
                    continue L0;
                  } else {
                    field_h[var14][var0] = bq.a(field_h[-1 + var14][var0] << -1483991112, field_h[var14 + -1][var0] >>> 2136772552);
                    var14++;
                    continue L6;
                  }
                }
              }
            }
        }
    }
}
