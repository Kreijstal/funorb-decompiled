/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pfa {
    private jj field_a;
    private jj[] field_e;
    private ad field_f;
    static ee field_g;
    private gj field_c;
    private sna field_d;
    boolean field_b;

    final static int c() {
        return rj.field_i - io.field_p;
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        lda var9 = null;
        int var10 = 0;
        int stackIn_16_0 = 0;
        String stackIn_22_0 = null;
        int stackIn_26_0 = 0;
        String stackIn_32_0 = null;
        int stackIn_39_0 = 0;
        lda stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        String stackOut_21_0 = null;
        String stackOut_20_0 = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        lda stackOut_42_0 = null;
        lda stackOut_41_0 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var1_int = ql.field_s;
              var2 = 0;
              if (2 != ub.field_j) {
                break L1;
              } else {
                var3_long = f.b((byte) 73) - ph.field_P;
                var2 = (int)((-var3_long + 10999L) / 1000L);
                if (0 <= var2) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              }
            }
            var3 = 0;
            L2: while (true) {
              if (~var3 <= ~mj.field_h.length) {
                L3: {
                  if (param0 == 1) {
                    break L3;
                  } else {
                    int discarded$1 = 0;
                    pfa.b();
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  var4 = fr.field_l[var3];
                  if (var4 < 0) {
                    var5 = fa.field_f;
                    break L4;
                  } else {
                    if (~dp.field_o.field_g != ~var4) {
                      var5 = jc.field_t;
                      break L4;
                    } else {
                      var5 = nja.field_a;
                      break L4;
                    }
                  }
                }
                L5: {
                  var6 = mj.field_h[var3];
                  if (ub.field_j != 2) {
                    break L5;
                  } else {
                    if (var2 != 1) {
                      break L5;
                    } else {
                      L6: {
                        if (~vka.field_p.length > ~mq.field_a.length) {
                          stackOut_15_0 = mq.field_a.length;
                          stackIn_16_0 = stackOut_15_0;
                          break L6;
                        } else {
                          stackOut_14_0 = vka.field_p.length;
                          stackIn_16_0 = stackOut_14_0;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_16_0;
                        if (var3 < 6) {
                          break L7;
                        } else {
                          if (var7 + 6 > var3) {
                            L8: {
                              if (var3 + -6 - -vka.field_p.length - var7 >= 0) {
                                stackOut_21_0 = vka.field_p[-6 + var3 + vka.field_p.length + -var7];
                                stackIn_22_0 = stackOut_21_0;
                                break L8;
                              } else {
                                stackOut_20_0 = "";
                                stackIn_22_0 = stackOut_20_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_22_0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (wba.field_a.length < ta.field_b.length) {
                          stackOut_25_0 = ta.field_b.length;
                          stackIn_26_0 = stackOut_25_0;
                          break L9;
                        } else {
                          stackOut_24_0 = wba.field_a.length;
                          stackIn_26_0 = stackOut_24_0;
                          break L9;
                        }
                      }
                      var8 = stackIn_26_0;
                      if (~var3 > ~(var7 + 7)) {
                        break L5;
                      } else {
                        if (~var3 > ~(var8 + 7 - -var7)) {
                          L10: {
                            if (~(-var7 + -7 + var3) <= ~wba.field_a.length) {
                              stackOut_31_0 = "";
                              stackIn_32_0 = stackOut_31_0;
                              break L10;
                            } else {
                              stackOut_30_0 = wba.field_a[-var7 + -7 + var3];
                              stackIn_32_0 = stackOut_30_0;
                              break L10;
                            }
                          }
                          var6 = stackIn_32_0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (-2 == var4) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (0 > var4) {
                    stackOut_38_0 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    break L12;
                  } else {
                    stackOut_37_0 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    break L12;
                  }
                }
                L13: {
                  var7 = gg.a(stackIn_39_0 != 0, -59, var6);
                  var8 = -(var7 >> 1) + mg.field_k;
                  if (var4 < 0) {
                    break L13;
                  } else {
                    L14: {
                      if (var4 != dp.field_o.field_g) {
                        stackOut_42_0 = st.field_b;
                        stackIn_43_0 = stackOut_42_0;
                        break L14;
                      } else {
                        stackOut_41_0 = hi.field_a;
                        stackIn_43_0 = stackOut_41_0;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_43_0;
                      var1_int = var1_int + cba.field_d;
                      if (var9 != null) {
                        var9.a((um.field_d << 1) + hc.field_D, 28, var8 - vt.field_k, var1_int, (vt.field_k << 1) + var7);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var1_int = var1_int + um.field_d;
                    break L13;
                  }
                }
                L16: {
                  if (var4 < 0) {
                    jk.field_o.c(var6, var8, gaa.field_k + var1_int, var5, -1);
                    var1_int = var1_int + mm.field_z;
                    break L16;
                  } else {
                    fp.field_f.c(var6, var8, var1_int + tca.field_f, var5, -1);
                    var1_int = var1_int + (um.field_d + (cba.field_d + hc.field_D));
                    break L16;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "pfa.I(" + param0 + ')');
        }
    }

    final void a(int param0, ad param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((pfa) this).field_f = param1;
              if (param0 == 0) {
                break L1;
              } else {
                ((pfa) this).field_a = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("pfa.D(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final void a() {
        int var2 = 0;
        int var3_int = 0;
        jj var3 = null;
        sna var4 = null;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        ((pfa) this).field_e = new jj[((pfa) this).field_f.field_s.field_m.length];
        var2 = 0;
        var3_int = 0;
        L0: while (true) {
          if (((pfa) this).field_e.length <= var3_int) {
            ((pfa) this).field_a = new jj(-1);
            ((pfa) this).field_a.field_rb = 254;
            ((pfa) this).field_a.field_kb = 220;
            var3 = ((pfa) this).field_a;
            ((pfa) this).field_a.field_p = 42;
            var3.field_sb = 42;
            ((pfa) this).field_d = new sna();
            ((pfa) this).field_d.field_rb = 142;
            ((pfa) this).field_d.field_kb = 510;
            var4 = ((pfa) this).field_d;
            ((pfa) this).field_d.field_p = 36;
            var4.field_sb = 36;
            return;
          } else {
            if (((pfa) this).field_f.field_s.field_m[var3_int] != -1) {
              ((pfa) this).field_e[var2] = new jj(((pfa) this).field_f.field_s.field_o.field_g.field_b[((pfa) this).field_f.field_s.field_m[var3_int]]);
              ((pfa) this).field_e[var2].field_kb = var3_int * 46 + 287;
              ((pfa) this).field_e[var2].field_rb = 306;
              ((pfa) this).field_e[var2].field_sb = 32;
              ((pfa) this).field_e[var2].field_p = 32;
              var2++;
              var3_int++;
              continue L0;
            } else {
              var3_int++;
              continue L0;
            }
          }
        }
    }

    private final void a(kv param0, int param1, int param2, int param3, int param4, int param5) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        try {
            var7_int = 0;
            if (param2 > -127) {
                Object var10 = null;
                this.a((kv) null, -51, -127, -118, 95, -32);
            }
            for (var8 = 0; param1 > var8; var8++) {
                var7_int = var7_int + am.field_Q[var8];
            }
            dg.a(param3, param4, param3 - -var7_int, 28 + param4);
            param0.e(param3, param4);
            dg.c();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "pfa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void d(int param0) {
        ((pfa) this).field_b = false;
        if (param0 != 15204352) {
            ((pfa) this).field_f = null;
        }
    }

    public static void b() {
        field_g = null;
    }

    final boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          if (param0 == -214844415) {
            break L0;
          } else {
            ((pfa) this).field_c = null;
            break L0;
          }
        }
        if (!((pfa) this).field_b) {
          return false;
        } else {
          L1: {
            ((pfa) this).field_d.a(19842, true);
            if (1 != ((pfa) this).field_d.field_R) {
              break L1;
            } else {
              ((pfa) this).field_c.a(7955);
              lf.field_c = 0;
              ((pfa) this).field_d.field_R = 0;
              break L1;
            }
          }
          var2 = 0;
          L2: while (true) {
            if (var2 >= ((pfa) this).field_e.length) {
              ((pfa) this).field_a.a(param0 ^ -214830717, true);
              return true;
            } else {
              if (((pfa) this).field_e[var2] != null) {
                ((pfa) this).field_e[var2].a(19842, true);
                var2++;
                continue L2;
              } else {
                var2++;
                continue L2;
              }
            }
          }
        }
    }

    final void a(boolean param0) {
        int var3_int = 0;
        String var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        aga var10 = null;
        oha var11 = null;
        int var12 = 0;
        aga var13 = null;
        oha var14 = null;
        oha var15 = null;
        String var16 = null;
        kv stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        kv stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_37_2 = 0;
        kv stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int stackIn_38_3 = 0;
        kv stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        kv stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int stackOut_37_3 = 0;
        kv stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_36_2 = 0;
        int stackOut_36_3 = 0;
        var9 = BachelorFridge.field_y;
        if (((pfa) this).field_f != null) {
          L0: {
            if (((pfa) this).field_c.field_h.field_A == 0) {
              dg.g(0, 0, 640, 480);
              break L0;
            } else {
              break L0;
            }
          }
          var10 = ((pfa) this).field_f.field_s;
          var13 = var10;
          ula.field_h.e(120, 120);
          ((pfa) this).field_f.field_f.a(((pfa) this).field_f.field_f.field_x, param0, 2048, 2048, 0, -119, 256, 130, 104);
          mp.field_s.e(280, 180);
          jha.field_g.a(hl.field_G[2], 334, 194, 15204352, -1);
          hfa.field_z.a(hl.field_G[2], 334, 194, 65793, -1);
          jha.field_g.a(hl.field_G[3], 330, 224, 818659, -1);
          hfa.field_z.a(hl.field_G[3], 330, 224, 65793, -1);
          jha.field_g.a(hl.field_G[0], 334, 252, 16769792, -1);
          hfa.field_z.a(hl.field_G[0], 334, 252, 65793, -1);
          jha.field_g.a(hl.field_G[1], 328, 280, 51233, -1);
          hfa.field_z.a(hl.field_G[1], 328, 280, 65793, -1);
          this.a(dt.field_a, var10.field_k[2], -128, 400, 174, 2);
          this.a(in.field_b, var10.field_k[3], -128, 400, 204, 3);
          this.a(fk.field_s, var10.field_k[0], -128, 400, 236, 0);
          this.a(vaa.field_b, var10.field_k[1], -128, 400, 263, 1);
          int discarded$2 = 1;
          ce.a(true, 16776960, 155, var13.field_n, 320);
          jha.field_g.a(hr.field_a, 390, 368, 16776960, -1);
          hfa.field_z.a(hr.field_a, 390, 368, 65793, -1);
          var3_int = 0;
          L1: while (true) {
            if (~var3_int <= ~((pfa) this).field_e.length) {
              L2: {
                stackOut_35_0 = qt.field_m;
                stackOut_35_1 = 510;
                stackOut_35_2 = 142;
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                stackIn_37_2 = stackOut_35_2;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                stackIn_36_2 = stackOut_35_2;
                if (!((pfa) this).field_d.field_T) {
                  stackOut_37_0 = (kv) (Object) stackIn_37_0;
                  stackOut_37_1 = stackIn_37_1;
                  stackOut_37_2 = stackIn_37_2;
                  stackOut_37_3 = 16764160;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  stackIn_38_3 = stackOut_37_3;
                  break L2;
                } else {
                  stackOut_36_0 = (kv) (Object) stackIn_36_0;
                  stackOut_36_1 = stackIn_36_1;
                  stackOut_36_2 = stackIn_36_2;
                  stackOut_36_3 = 16777215;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_38_2 = stackOut_36_2;
                  stackIn_38_3 = stackOut_36_3;
                  break L2;
                }
              }
              ((kv) (Object) stackIn_38_0).e(stackIn_38_1, stackIn_38_2, stackIn_38_3);
              var12 = 0;
              var3_int = var12;
              L3: while (true) {
                if (~var12 <= ~((pfa) this).field_e.length) {
                  L4: {
                    if (!((pfa) this).field_a.field_T) {
                      break L4;
                    } else {
                      if (((pfa) this).field_f.field_s.field_y == 0) {
                        break L4;
                      } else {
                        var3 = pna.field_zb[((pfa) this).field_f.field_s.field_y].field_d;
                        var16 = pna.field_zb[((pfa) this).field_f.field_s.field_y].field_e;
                        var5 = ad.field_h.c(var16, 200) + 10;
                        var6 = ad.field_h.a(var16, 200, 0) + (ad.field_h.field_F << 1);
                        dg.a(mk.field_p + 17, 4 + gd.field_m, var5 - -6, var6, 10, 65793, 128);
                        ad.field_h.c(var3, 20 + (mk.field_p - -4), 20 + gd.field_m, 0, -1);
                        int discarded$3 = ad.field_h.a(var16, 4 + (mk.field_p - -20), gd.field_m - -24, 200, 200, 0, -1, 0, 0, 0);
                        break L4;
                      }
                    }
                  }
                  return;
                } else {
                  L5: {
                    if (null != ((pfa) this).field_e[var12]) {
                      if (((pfa) this).field_e[var12].field_zb != -1) {
                        if (!((pfa) this).field_e[var12].field_T) {
                          break L5;
                        } else {
                          var15 = al.a(109, ((pfa) this).field_e[var12].field_zb);
                          var5 = 640;
                          var6 = 480;
                          var7 = 4 + mk.field_p;
                          var8 = gd.field_m + 4;
                          sd.a(((pfa) this).field_f.field_s.a(var15, -5313), var7, var15, (byte) 74, var8);
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  var12++;
                  continue L3;
                }
              }
            } else {
              L6: {
                if (((pfa) this).field_e[var3_int] == null) {
                  break L6;
                } else {
                  if (((pfa) this).field_e[var3_int].field_zb == -1) {
                    break L6;
                  } else {
                    L7: {
                      var11 = al.a(-113, ((pfa) this).field_e[var3_int].field_zb);
                      var14 = var11;
                      gq.field_E.e(((pfa) this).field_e[var3_int].field_kb, ((pfa) this).field_e[var3_int].field_rb);
                      if (!(var14 instanceof tv)) {
                        if (!(var14 instanceof hd)) {
                          if (var14 instanceof a) {
                            if (var14.field_b == 3) {
                              nia.field_l[var14.field_b].e(-1 + ((pfa) this).field_e[var3_int].field_kb, ((pfa) this).field_e[var3_int].field_rb + -1, 16769792);
                              break L7;
                            } else {
                              if (4 != var14.field_b) {
                                if (var14.field_b == 2) {
                                  nia.field_l[var14.field_b].e(((pfa) this).field_e[var3_int].field_kb - 1, ((pfa) this).field_e[var3_int].field_rb + -1, 15204352);
                                  break L7;
                                } else {
                                  if (var14.field_b == 1) {
                                    nia.field_l[var14.field_b].e(((pfa) this).field_e[var3_int].field_kb - 1, ((pfa) this).field_e[var3_int].field_rb - 1, 818659);
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                              } else {
                                nia.field_l[var14.field_b].e(((pfa) this).field_e[var3_int].field_kb + -1, -1 + ((pfa) this).field_e[var3_int].field_rb, 51233);
                                break L7;
                              }
                            }
                          } else {
                            if (var14 instanceof t) {
                              L8: {
                                if (((t) (Object) var14).field_p == 1) {
                                  break L8;
                                } else {
                                  if (((t) (Object) var14).field_p == 2) {
                                    break L8;
                                  } else {
                                    if (4 != ((t) (Object) var14).field_p) {
                                      nia.field_l[var14.field_b].e(-1 + ((pfa) this).field_e[var3_int].field_kb, -1 + ((pfa) this).field_e[var3_int].field_rb, 15204352);
                                      break L7;
                                    } else {
                                      nia.field_l[var14.field_b].e(((pfa) this).field_e[var3_int].field_kb + -1, ((pfa) this).field_e[var3_int].field_rb - 1, 16754688);
                                      break L7;
                                    }
                                  }
                                }
                              }
                              nia.field_l[var14.field_b].e(-1 + ((pfa) this).field_e[var3_int].field_kb, ((pfa) this).field_e[var3_int].field_rb - 1, 818659);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          nia.field_l[var14.field_b].e(-1 + ((pfa) this).field_e[var3_int].field_kb, ((pfa) this).field_e[var3_int].field_rb + -1, 14964736);
                          break L7;
                        }
                      } else {
                        nia.field_l[var11.field_b].e(((pfa) this).field_e[var3_int].field_kb + -1, -1 + ((pfa) this).field_e[var3_int].field_rb, 51233);
                        break L7;
                      }
                    }
                    wca.a(true, ((pfa) this).field_e[var3_int].field_rb, ((pfa) this).field_e[var3_int].field_kb, ((pfa) this).field_e[var3_int].field_zb, 117);
                    if (!((pfa) this).field_f.field_s.c((byte) -10, ((pfa) this).field_e[var3_int].field_zb)) {
                      dg.d(4 + ((pfa) this).field_e[var3_int].field_kb, 4 + ((pfa) this).field_e[var3_int].field_rb, (((pfa) this).field_e[var3_int].field_sb >> 1) + (((pfa) this).field_e[var3_int].field_kb - -15), ((pfa) this).field_e[var3_int].field_rb - -(((pfa) this).field_e[var3_int].field_p >> 1) - -15, 65793, 4);
                      dg.d(5 + ((pfa) this).field_e[var3_int].field_kb, 5 + ((pfa) this).field_e[var3_int].field_rb, (((pfa) this).field_e[var3_int].field_sb >> 1) + (((pfa) this).field_e[var3_int].field_kb + 14), 14 + ((pfa) this).field_e[var3_int].field_rb + (((pfa) this).field_e[var3_int].field_p >> 1), 16711680, 2);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              var3_int++;
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    pfa(gj param0, sna param1, ad param2) {
        try {
            ((pfa) this).field_c = param0;
            ((pfa) this).a(0, param2);
            ((pfa) this).field_b = true;
            int discarded$0 = 26;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "pfa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
