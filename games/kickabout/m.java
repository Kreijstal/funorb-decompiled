/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private long[] field_k;
    static double field_a;
    private long[] field_c;
    static String field_b;
    private byte[] field_e;
    private byte[] field_j;
    private int field_l;
    static hd field_m;
    static boolean[] field_f;
    static String field_i;
    private int field_o;
    private long[] field_p;
    private long[] field_g;
    static int[] field_d;
    static boolean field_h;
    private long[] field_n;

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = Kickabout.field_G;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var2 >= 8) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                var2 = 1;
                L2: while (true) {
                  if (var2 > 10) {
                    var2 = 0;
                    L3: while (true) {
                      if (8 <= var2) {
                        return;
                      } else {
                        ((m) this).field_n[var2] = sd.a(((m) this).field_n[var2], sd.a(((m) this).field_k[var2], ((m) this).field_c[var2]));
                        var2++;
                        continue L3;
                      }
                    }
                  } else {
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= 8) {
                        var3 = 0;
                        L5: while (true) {
                          if (var3 >= 8) {
                            ((m) this).field_p[0] = sd.a(((m) this).field_p[0], ju.field_V[var2]);
                            var3 = 0;
                            L6: while (true) {
                              if (var3 >= 8) {
                                var3 = 0;
                                L7: while (true) {
                                  if (var3 >= 8) {
                                    var2++;
                                    continue L2;
                                  } else {
                                    ((m) this).field_c[var3] = ((m) this).field_g[var3];
                                    var3++;
                                    continue L7;
                                  }
                                }
                              } else {
                                ((m) this).field_g[var3] = ((m) this).field_p[var3];
                                var7 = 0;
                                var4 = var7;
                                var5 = 56;
                                L8: while (true) {
                                  if (var7 >= 8) {
                                    var3++;
                                    continue L6;
                                  } else {
                                    ((m) this).field_g[var3] = sd.a(((m) this).field_g[var3], ju.field_W[var7][qj.b(255, (int)(((m) this).field_c[qj.b(-var7 + var3, 7)] >>> var5))]);
                                    var5 -= 8;
                                    var7++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            ((m) this).field_p[var3] = ((m) this).field_g[var3];
                            var3++;
                            continue L5;
                          }
                        }
                      } else {
                        ((m) this).field_g[var3] = 0L;
                        var4 = 0;
                        var5 = 56;
                        L9: while (true) {
                          if (8 <= var4) {
                            var3++;
                            continue L4;
                          } else {
                            ((m) this).field_g[var3] = sd.a(((m) this).field_g[var3], ju.field_W[var4][qj.b((int)(((m) this).field_p[qj.b(-var4 + var3, 7)] >>> var5), 255)]);
                            var5 -= 8;
                            var4++;
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((m) this).field_p[var2] = ((m) this).field_n[var2];
                ((m) this).field_c[var2] = sd.a(((m) this).field_k[var2], ((m) this).field_n[var2]);
                var2++;
                continue L1;
              }
            }
          } else {
            ((m) this).field_k[var2] = sd.a(mg.a(255L, (long)((m) this).field_e[7 + var3]), sd.a(mg.a((long)((m) this).field_e[var3 + 6], 255L) << 8, sd.a(mg.a(255L, (long)((m) this).field_e[var3 - -5]) << 16, sd.a(mg.a((long)((m) this).field_e[var3 - -4], 255L) << 24, sd.a(sd.a(mg.a((long)((m) this).field_e[var3 - -2], 255L) << 40, sd.a(mg.a(71776119061217280L, (long)((m) this).field_e[1 + var3] << 48), (long)((m) this).field_e[var3] << 56)), mg.a(1095216660480L, (long)((m) this).field_e[var3 + 3] << 32))))));
            var2++;
            var3 += 8;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_f = null;
        field_b = null;
        field_m = null;
        field_i = null;
    }

    final static void a(byte param0, int param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              h.field_e.field_E = param2;
              if (ov.field_b == 2) {
                b.field_N.field_E = kc.field_f;
                break L1;
              } else {
                b.field_N.field_E = im.field_Bb;
                break L1;
              }
            }
            var9_int = 495;
            var10 = 5;
            Kickabout.field_H.a(true, var9_int + -10, 5, var10, param6);
            ei.field_b.a(true, Kickabout.field_H.field_q + -ij.field_s.field_q, 0, 0, param6);
            ij.field_s.a(true, ij.field_s.field_q, ei.field_b.field_q, 0, param6);
            var10 = var10 + (param7 + param6);
            gl.field_c.a(true, gl.field_c.g((byte) -99), 5, var10, param3);
            var11 = b.field_N.g((byte) -19);
            b.field_N.a(true, var11, -5 + (var9_int + -var11), var10, param3);
            h.field_e.a(true, var9_int, 0, 0, 20);
            var12 = 5 + (var10 + param3);
            dj.field_D.a(true, var9_int, 0, 20, var12);
            var12 = var12 + 20;
            dj.field_D.field_R = fs.a(dj.field_D.field_mb, 3, 2105376, 11579568, 8421504, (byte) 118);
            mu.field_Y.a(true, var9_int, param4 + -(var9_int / 2), -(var12 / 2) + param5, var12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var9;
            stackOut_5_1 = new StringBuilder().append("m.F(").append(49).append(',').append(20).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static int a(int param0, ec param1, ec param2, int param3, boolean param4, String param5, boolean param6) {
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int stackIn_5_0 = 0;
        iw stackIn_16_0 = null;
        iw stackIn_17_0 = null;
        iw stackIn_18_0 = null;
        String stackIn_18_1 = null;
        iw stackIn_19_0 = null;
        iw stackIn_20_0 = null;
        iw stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_35_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        iw stackOut_15_0 = null;
        iw stackOut_17_0 = null;
        String stackOut_17_1 = null;
        iw stackOut_16_0 = null;
        String stackOut_16_1 = null;
        iw stackOut_18_0 = null;
        iw stackOut_20_0 = null;
        String stackOut_20_1 = null;
        iw stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_34_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_55_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var13 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var14 = param2.b(27939);
              var8 = param1.b(27939);
              if (null != op.field_y) {
                break L1;
              } else {
                if (!qo.a(false, (byte) 123)) {
                  stackOut_4_0 = -1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (un.field_c != sd.field_d) {
                break L2;
              } else {
                L3: {
                  ep.field_f = null;
                  or.field_d.field_n = 0;
                  if (param5 == null) {
                    L4: {
                      gl.field_a.field_n = 0;
                      gl.field_a.b(-56, ac.field_d.nextInt());
                      gl.field_a.b(-34, ac.field_d.nextInt());
                      stackOut_15_0 = gl.field_a;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_16_0 = stackOut_15_0;
                      if (!param2.c(-95)) {
                        stackOut_17_0 = (iw) (Object) stackIn_17_0;
                        stackOut_17_1 = "";
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        break L4;
                      } else {
                        stackOut_16_0 = (iw) (Object) stackIn_16_0;
                        stackOut_16_1 = (String) var14;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        break L4;
                      }
                    }
                    L5: {
                      ((iw) (Object) stackIn_18_0).a(stackIn_18_1, (byte) -126);
                      stackOut_18_0 = gl.field_a;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (!param1.c(-94)) {
                        stackOut_20_0 = (iw) (Object) stackIn_20_0;
                        stackOut_20_1 = "";
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        break L5;
                      } else {
                        stackOut_19_0 = (iw) (Object) stackIn_19_0;
                        stackOut_19_1 = (String) var8;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        break L5;
                      }
                    }
                    ((iw) (Object) stackIn_21_0).a(stackIn_21_1, (byte) -128);
                    or.field_d.a(106, 16);
                    or.field_d.field_n = or.field_d.field_n + 1;
                    var9 = or.field_d.field_n;
                    om.a(hn.field_h, (iw) (Object) or.field_d, (byte) -89, gl.field_a, bb.field_Nb);
                    or.field_d.c(62, -var9 + or.field_d.field_n);
                    break L3;
                  } else {
                    L6: {
                      var9 = 0;
                      if (param4) {
                        var9 = var9 | 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      gl.field_a.field_n = 0;
                      gl.field_a.b(-62, ac.field_d.nextInt());
                      gl.field_a.b(-42, ac.field_d.nextInt());
                      gl.field_a.a(var14, (byte) -126);
                      gl.field_a.a(var8, (byte) -126);
                      var15 = (CharSequence) (Object) param5;
                      gl.field_a.a(ri.a(var15, (byte) -100), (byte) -125);
                      gl.field_a.g(-1207444472, param0);
                      gl.field_a.a(106, param3);
                      gl.field_a.a(125, var9);
                      or.field_d.a(123, 18);
                      or.field_d.field_n = or.field_d.field_n + 2;
                      var10 = or.field_d.field_n;
                      var11_ref_String = sa.a(so.a(50), (byte) 123);
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    or.field_d.a(14190, var11_ref_String);
                    om.a(hn.field_h, (iw) (Object) or.field_d, (byte) -94, gl.field_a, bb.field_Nb);
                    or.field_d.d(-var10 + or.field_d.field_n, 62);
                    break L3;
                  }
                }
                int discarded$8 = 0;
                c.a(-1);
                un.field_c = pf.field_e;
                break L2;
              }
            }
            L8: {
              if (pf.field_e == un.field_c) {
                if (uj.a((byte) 55, 1)) {
                  L9: {
                    var9 = un.field_e.h((byte) -116);
                    un.field_e.field_n = 0;
                    if (var9 < 100) {
                      break L9;
                    } else {
                      if (var9 <= 105) {
                        un.field_c = id.field_t;
                        mr.field_X = new String[-100 + var9];
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  if (var9 == 248) {
                    wc.a((byte) -50, so.a(-71));
                    gd.field_b = ld.field_i;
                    int discarded$9 = -116;
                    lr.b();
                    vu.field_Db = false;
                    stackOut_34_0 = var9;
                    stackIn_35_0 = stackOut_34_0;
                    return stackIn_35_0;
                  } else {
                    if (var9 == 99) {
                      int discarded$10 = 40;
                      boolean discarded$11 = uj.a((byte) 51, lt.a());
                      int discarded$12 = 93;
                      ep.field_f = new Boolean(ki.a((iw) (Object) un.field_e));
                      un.field_e.field_n = 0;
                      break L8;
                    } else {
                      so.field_b = var9;
                      un.field_c = lm.field_N;
                      ms.field_b = -1;
                      break L8;
                    }
                  }
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L10: {
              if (id.field_t == un.field_c) {
                var9 = 2;
                if (!uj.a((byte) -96, var9)) {
                  break L10;
                } else {
                  var10 = un.field_e.a((byte) 81);
                  un.field_e.field_n = 0;
                  if (!uj.a((byte) -118, var10)) {
                    break L10;
                  } else {
                    var11 = mr.field_X.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var12 >= var11) {
                        int discarded$13 = -116;
                        lr.b();
                        vu.field_Db = false;
                        stackOut_44_0 = var11 + 100;
                        stackIn_45_0 = stackOut_44_0;
                        return stackIn_45_0;
                      } else {
                        mr.field_X[var12] = un.field_e.j(17);
                        var12++;
                        continue L11;
                      }
                    }
                  }
                }
              } else {
                break L10;
              }
            }
            L12: {
              if (lm.field_N != un.field_c) {
                break L12;
              } else {
                int discarded$14 = 180;
                if (!ps.a()) {
                  break L12;
                } else {
                  L13: {
                    if (so.field_b != 255) {
                      gd.field_b = un.field_e.a(61);
                      break L13;
                    } else {
                      var9_ref_String = un.field_e.a(true);
                      if (var9_ref_String == null) {
                        break L13;
                      } else {
                        mp.a(so.a(62), true, var9_ref_String);
                        break L13;
                      }
                    }
                  }
                  int discarded$15 = -116;
                  lr.b();
                  vu.field_Db = false;
                  stackOut_52_0 = so.field_b;
                  stackIn_53_0 = stackOut_52_0;
                  return stackIn_53_0;
                }
              }
            }
            if (!param6) {
              L14: {
                if (null == op.field_y) {
                  if (vu.field_Db) {
                    L15: {
                      if (30000L >= aa.c(29680)) {
                        gd.field_b = ic.field_e;
                        break L15;
                      } else {
                        gd.field_b = md.field_h;
                        break L15;
                      }
                    }
                    vu.field_Db = false;
                    stackOut_64_0 = 249;
                    stackIn_65_0 = stackOut_64_0;
                    return stackIn_65_0;
                  } else {
                    var9 = rl.field_o;
                    rl.field_o = pn.field_y;
                    pn.field_y = var9;
                    vu.field_Db = true;
                    break L14;
                  }
                } else {
                  break L14;
                }
              }
              stackOut_66_0 = -1;
              stackIn_67_0 = stackOut_66_0;
              break L0;
            } else {
              stackOut_55_0 = -108;
              stackIn_56_0 = stackOut_55_0;
              return stackIn_56_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var7;
            stackOut_68_1 = new StringBuilder().append("m.E(").append(param0).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L16;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L16;
            }
          }
          L17: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param2 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L17;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L17;
            }
          }
          L18: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param5 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L18;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L18;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param6 + ')');
        }
        return stackIn_67_0;
    }

    final void a(byte[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        Object var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              ((m) this).field_e[((m) this).field_l] = (byte)hf.a((int) ((m) this).field_e[((m) this).field_l], 128 >>> qj.b(7, ((m) this).field_o));
              ((m) this).field_l = ((m) this).field_l + 1;
              if (-33 <= ((m) this).field_l) {
                break L1;
              } else {
                L2: while (true) {
                  if (-65 <= ((m) this).field_l) {
                    int discarded$5 = 18;
                    this.a();
                    ((m) this).field_l = 0;
                    break L1;
                  } else {
                    int fieldTemp$6 = ((m) this).field_l;
                    ((m) this).field_l = ((m) this).field_l + 1;
                    ((m) this).field_e[fieldTemp$6] = (byte) 0;
                    continue L2;
                  }
                }
              }
            }
            L3: while (true) {
              if (32 <= ((m) this).field_l) {
                L4: {
                  if (param1 == 21024) {
                    break L4;
                  } else {
                    var9 = null;
                    int discarded$7 = m.a(64, (ec) null, (ec) null, -29, false, (String) null, true);
                    break L4;
                  }
                }
                dv.a(((m) this).field_j, 0, ((m) this).field_e, 32, 32);
                int discarded$8 = 18;
                this.a();
                var4_int = 0;
                var5 = param2;
                L5: while (true) {
                  if (var4_int >= 8) {
                    break L0;
                  } else {
                    var6 = ((m) this).field_n[var4_int];
                    param0[var5] = (byte)(int)(var6 >>> 56);
                    param0[1 + var5] = (byte)(int)(var6 >>> 48);
                    param0[var5 + 2] = (byte)(int)(var6 >>> 40);
                    param0[var5 - -3] = (byte)(int)(var6 >>> 32);
                    param0[var5 - -4] = (byte)(int)(var6 >>> 24);
                    param0[5 + var5] = (byte)(int)(var6 >>> 16);
                    param0[var5 - -6] = (byte)(int)(var6 >>> 8);
                    param0[7 + var5] = (byte)(int)var6;
                    var5 += 8;
                    var4_int++;
                    continue L5;
                  }
                }
              } else {
                int fieldTemp$9 = ((m) this).field_l;
                ((m) this).field_l = ((m) this).field_l + 1;
                ((m) this).field_e[fieldTemp$9] = (byte) 0;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("m.D(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(sj param0, sj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("m.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 5198 + ')');
        }
    }

    final void a(byte param0, long param1, byte[] param2) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var13 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 8 - ((int)param1 & 7) & 7;
              var7 = ((m) this).field_o & 7;
              var9 = param1;
              if (param0 >= 6) {
                break L1;
              } else {
                field_a = 0.37608334077803834;
                break L1;
              }
            }
            var11 = 31;
            var12 = 0;
            L2: while (true) {
              if (var11 < 0) {
                L3: while (true) {
                  if (param1 <= 8L) {
                    L4: {
                      if (param1 <= 0L) {
                        var8 = 0;
                        break L4;
                      } else {
                        var8 = param2[var5_int] << var6 & 255;
                        ((m) this).field_e[((m) this).field_l] = (byte)hf.a((int) ((m) this).field_e[((m) this).field_l], var8 >>> var7);
                        break L4;
                      }
                    }
                    L5: {
                      if (8L > param1 + (long)var7) {
                        ((m) this).field_o = (int)((long)((m) this).field_o + param1);
                        break L5;
                      } else {
                        L6: {
                          ((m) this).field_l = ((m) this).field_l + 1;
                          param1 = param1 - (long)(8 + -var7);
                          ((m) this).field_o = ((m) this).field_o + (8 + -var7);
                          if (512 != ((m) this).field_o) {
                            break L6;
                          } else {
                            int discarded$2 = 18;
                            this.a();
                            ((m) this).field_o = 0;
                            ((m) this).field_l = 0;
                            break L6;
                          }
                        }
                        ((m) this).field_e[((m) this).field_l] = (byte)qj.b(255, var8 << -var7 + 8);
                        ((m) this).field_o = ((m) this).field_o + (int)param1;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L7: {
                      var8 = 255 & param2[var5_int] << var6 | (255 & param2[1 + var5_int]) >>> -var6 + 8;
                      if (var8 < 0) {
                        break L7;
                      } else {
                        if (var8 >= 256) {
                          break L7;
                        } else {
                          L8: {
                            ((m) this).field_e[((m) this).field_l] = (byte)hf.a((int) ((m) this).field_e[((m) this).field_l], var8 >>> var7);
                            ((m) this).field_o = ((m) this).field_o + (8 + -var7);
                            ((m) this).field_l = ((m) this).field_l + 1;
                            if (512 != ((m) this).field_o) {
                              break L8;
                            } else {
                              int discarded$3 = 18;
                              this.a();
                              ((m) this).field_l = 0;
                              ((m) this).field_o = 0;
                              break L8;
                            }
                          }
                          ((m) this).field_e[((m) this).field_l] = (byte)qj.b(255, var8 << -var7 + 8);
                          ((m) this).field_o = ((m) this).field_o + var7;
                          var5_int++;
                          param1 = param1 - 8L;
                          continue L3;
                        }
                      }
                    }
                    throw new RuntimeException("LOGIC ERROR");
                  }
                }
              } else {
                var12 = var12 + ((((m) this).field_j[var11] & 255) - -((int)var9 & 255));
                ((m) this).field_j[var11] = (byte)var12;
                var12 = var12 >>> 8;
                var9 = var9 >>> 8;
                var11--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("m.A(").append(param0).append(',').append(param1).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = Kickabout.field_G;
        if (!param0) {
            return;
        }
        for (var2 = 0; var2 < 32; var2++) {
            ((m) this).field_j[var2] = (byte) 0;
        }
        ((m) this).field_o = 0;
        ((m) this).field_e[0] = (byte) 0;
        ((m) this).field_l = 0;
        for (var2 = 0; var2 < 8; var2++) {
            ((m) this).field_n[var2] = 0L;
        }
    }

    m() {
        ((m) this).field_e = new byte[64];
        ((m) this).field_l = 0;
        ((m) this).field_c = new long[8];
        ((m) this).field_j = new byte[32];
        ((m) this).field_p = new long[8];
        ((m) this).field_g = new long[8];
        ((m) this).field_k = new long[8];
        ((m) this).field_n = new long[8];
        ((m) this).field_o = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0.0;
        field_i = "Attacking";
        field_b = "<%0> cannot join; the game has started.";
    }
}
