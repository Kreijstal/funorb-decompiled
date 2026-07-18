/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jj {
    private String field_l;
    int field_d;
    static String field_j;
    static String field_e;
    tf[] field_k;
    tf[] field_f;
    tf[] field_a;
    static int[] field_h;
    int[][] field_g;
    private tf field_i;
    static String field_c;
    static int field_b;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = Pixelate.field_H ? 1 : 0;
          if (0 >= ((jj) this).field_d) {
            break L0;
          } else {
            L1: {
              var2 = -(kb.field_L.c(((jj) this).field_l) / 2) + 300;
              var3 = 20 + kb.field_L.c(((jj) this).field_l) / 2 + 320;
              var4 = -1;
              var5 = 25;
              t.a(nh.field_a);
              if (((jj) this).field_d <= dm.field_Cb + -var5) {
                if (var5 <= ((jj) this).field_d) {
                  break L1;
                } else {
                  var4 = 640 - ((jj) this).field_d * 640 / var5;
                  t.f(var4, 0, var3, 480);
                  break L1;
                }
              } else {
                var4 = 640 * (-((jj) this).field_d + dm.field_Cb) / var5;
                t.f(var2, 0, var4, 480);
                break L1;
              }
            }
            fi.a(((jj) this).field_i, 0, -kb.field_L.field_w + (140 - pd.field_Jb * 2));
            kb.field_L.b(((jj) this).field_l, 320, 140, 0, 0);
            t.b(nh.field_a);
            if (var4 <= 0) {
              break L0;
            } else {
              var6 = -((kb.field_L.field_w - -kb.field_L.field_z) / 2) + 141;
              var7 = 0;
              L2: while (true) {
                if (10 <= var7) {
                  break L0;
                } else {
                  t.a(-40 + var4 + 4 * var7 << 4, var6 << 4, var7 << 3, 15, bo.field_c);
                  var7++;
                  continue L2;
                }
              }
            }
          }
        }
        L3: {
          if (param0 <= -87) {
            break L3;
          } else {
            var9 = null;
            jj.a((byte) 106, (fa) null, (fa) null);
            break L3;
          }
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        gk.field_fb = param4;
        hq.field_r = param0;
        ii.field_i = param3;
        ul.field_q = param2;
    }

    final static bo[] a(cb param0) {
        RuntimeException var2 = null;
        int[] var3 = null;
        bo[] var4 = null;
        int var5 = 0;
        bo var6 = null;
        int var7 = 0;
        ei var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        bo[] stackIn_6_0 = null;
        bo[] stackIn_12_0 = null;
        bo[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        bo[] stackOut_5_0 = null;
        bo[] stackOut_16_0 = null;
        bo[] stackOut_11_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (!param0.a((byte) 115)) {
              stackOut_5_0 = new bo[]{};
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              var8 = param0.a(true);
              L1: while (true) {
                if (0 != var8.field_b) {
                  if (var8.field_b != 2) {
                    var12 = (int[]) var8.field_e;
                    var11 = var12;
                    var10 = var11;
                    var9 = var10;
                    var3 = var9;
                    var4 = new bo[var12.length >> 2];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_16_0 = (bo[]) var4;
                        stackIn_17_0 = stackOut_16_0;
                        break L0;
                      } else {
                        var6 = new bo();
                        var4[var5] = var6;
                        var6.field_l = var3[var5 << 2];
                        var6.field_i = var3[1 + (var5 << 2)];
                        var6.field_j = var3[2 + (var5 << 2)];
                        var6.field_g = var3[3 + (var5 << 2)];
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_11_0 = new bo[]{};
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                } else {
                  int discarded$1 = 23;
                  vg.a(10L);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("jj.N(");
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
          throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + -855969982 + ')');
        }
        return stackIn_17_0;
    }

    void c(int param0) {
        if (param0 > ~((jj) this).field_d) {
            ((jj) this).field_d = ((jj) this).field_d - 1;
        }
        jd.field_r = jd.field_r + 1;
    }

    public static void b() {
        field_e = null;
        field_j = null;
        field_c = null;
        field_h = null;
    }

    final static void a(byte param0, fa param1, fa param2) {
        try {
            if (param2.field_h != null) {
                param2.c(2779);
            }
            param2.field_a = param1;
            int var3_int = 28 / ((58 - param0) / 36);
            param2.field_h = param1.field_h;
            param2.field_h.field_a = param2;
            param2.field_a.field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "jj.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a() {
        r.b(-93);
        eh.a(3, v.field_c, fq.field_q, r.field_c, h.field_V[0].field_A, hk.field_b);
    }

    void a(boolean param0) {
        if (param0) {
            ((jj) this).field_d = -82;
        }
    }

    jj(String param0, tf[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        tf var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        ((jj) this).field_d = 0;
        try {
          L0: {
            ((jj) this).field_f = param1;
            ((jj) this).field_l = "\"" + param0 + "\"";
            ((jj) this).field_k = new tf[((jj) this).field_f.length];
            ((jj) this).field_a = new tf[((jj) this).field_f.length];
            var3_int = ((jj) this).field_f[0].field_F >> 1;
            var4 = ((jj) this).field_f[0].field_F >> 2;
            var5 = 0;
            L1: while (true) {
              if (var5 >= ((jj) this).field_f.length) {
                ((jj) this).field_i = new tf(640, 4 * pd.field_Jb + (kb.field_L.field_w + kb.field_L.field_z));
                ((jj) this).field_i.c();
                var5 = 320;
                var6 = ((jj) this).field_i.field_E - pd.field_Jb * 2 + -kb.field_L.field_z;
                kb.field_L.b(((jj) this).field_l, -1 + var5, var6 - 1, 0, -1);
                kb.field_L.b(((jj) this).field_l, var5 + 1, var6 + -1, 0, -1);
                kb.field_L.b(((jj) this).field_l, var5 - 1, var6 - -1, 0, -1);
                kb.field_L.b(((jj) this).field_l, 1 + var5, var6 + 1, 0, -1);
                t.c(pd.field_Jb, pd.field_Jb, 0, 0, ((jj) this).field_i.field_F, ((jj) this).field_i.field_E);
                kb.field_L.b(((jj) this).field_l, var5, var6, 0, -1);
                qa.field_f.a(19692);
                ((jj) this).field_g = new int[2][];
                var7 = 0;
                L2: while (true) {
                  if (((jj) this).field_k.length <= var7) {
                    var7 = 0;
                    L3: while (true) {
                      if (var7 >= 2) {
                        break L0;
                      } else {
                        var8 = ((jj) this).field_f[var7];
                        var9 = 0;
                        L4: while (true) {
                          if (var9 >= var8.field_G.length) {
                            var8.field_G[127] = 0;
                            var8.field_G[63] = 0;
                            var8.field_G[64] = 0;
                            var8.field_G[0] = 0;
                            var8.field_G[1] = 0;
                            var8.field_G[62] = 0;
                            var9 = (-1 + var8.field_B) * var8.field_A;
                            var8.field_G[var9] = 0;
                            var8.field_G[var9 - -1] = 0;
                            var8.field_G[var9 - 64] = 0;
                            var8.field_G[var9 - -63] = 0;
                            var8.field_G[var9 + 62] = 0;
                            var8.field_G[var9 - 1] = 0;
                            var7++;
                            continue L3;
                          } else {
                            L5: {
                              if (var8.field_G[var9] != 0) {
                                break L5;
                              } else {
                                var8.field_G[var9] = 65793;
                                break L5;
                              }
                            }
                            var9++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var8_int = 0;
                    var9 = 0;
                    var10 = 0;
                    var11 = 0;
                    L6: while (true) {
                      if (((jj) this).field_k[var7].field_G.length <= var11) {
                        L7: {
                          var11 = 48;
                          var9 = var11 + (255 & var9 / ((jj) this).field_k[var7].field_G.length);
                          var8_int = var11 + (var8_int / ((jj) this).field_k[var7].field_G.length & 255);
                          var10 = (var10 / ((jj) this).field_k[var7].field_G.length & 255) + var11;
                          if (var9 <= 255) {
                            break L7;
                          } else {
                            var9 = 255;
                            break L7;
                          }
                        }
                        L8: {
                          if (var8_int <= 255) {
                            break L8;
                          } else {
                            var8_int = 255;
                            break L8;
                          }
                        }
                        L9: {
                          if (255 >= var10) {
                            break L9;
                          } else {
                            var10 = 255;
                            break L9;
                          }
                        }
                        ((jj) this).field_g[var7] = new int[32];
                        var17 = 0;
                        var12 = var17;
                        L10: while (true) {
                          if (var17 >= ((jj) this).field_g[var7].length) {
                            var7++;
                            continue L2;
                          } else {
                            var13 = 255 & var17 * var8_int / 32;
                            var14 = var9 * var17 / 32 & 255;
                            var15 = 255 & var10 * var17 / 32;
                            ((jj) this).field_g[var7][var17] = bq.a(bq.a(var13 << 16, var14 << 8), var15);
                            var17++;
                            continue L10;
                          }
                        }
                      } else {
                        var12 = ((jj) this).field_k[var7].field_G[var11];
                        var9 = var9 + ((var12 & 65280) >> 8);
                        var10 = var10 + (255 & var12);
                        var8_int = var8_int + (255 & var12 >> 16);
                        var11++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                ((jj) this).field_k[var5] = new tf(var3_int, var3_int);
                ((jj) this).field_a[var5] = new tf(var4, var4);
                ((jj) this).field_k[var5].c();
                ((jj) this).field_f[var5].d(0, 0);
                ((jj) this).field_a[var5].c();
                ((jj) this).field_f[var5].e(0, 0);
                ((jj) this).field_f[var5].c();
                t.a(0, 0, 128, 128, 0, 48);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var3;
            stackOut_28_1 = new StringBuilder().append("jj.<init>(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          L12: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L12;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Enter name of friend to add to list";
        field_e = "<%0> would need a rating of <%1> to play with the current options.";
        field_c = "Reload game";
    }
}
