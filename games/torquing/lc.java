/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends ro {
    static int field_z;
    static String field_B;

    public static void a(boolean param0) {
        field_B = null;
    }

    public lc() {
    }

    final static bp a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        bp stackIn_4_0 = null;
        bp stackIn_8_0 = null;
        bp stackIn_17_0 = null;
        bp stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        bp stackOut_3_0 = null;
        bp stackOut_7_0 = null;
        bp stackOut_19_0 = null;
        bp stackOut_16_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = Torquing.field_u;
        try {
          var2_int = param1.length();
          if (0 == var2_int) {
            stackOut_3_0 = oj.field_l;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int > 63) {
              stackOut_7_0 = wn.field_s;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              lc.a(-40, -69, -28, 124, -109, 120, -40);
              var3 = 0;
              L0: while (true) {
                if (var3 < var2_int) {
                  L1: {
                    var4 = param1.charAt(var3);
                    if (var4 != 45) {
                      if (kl.field_t.indexOf(var4) != -1) {
                        break L1;
                      } else {
                        stackOut_19_0 = va.field_H;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    } else {
                      L2: {
                        if (var3 == 0) {
                          break L2;
                        } else {
                          if (var2_int - 1 != var3) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_16_0 = va.field_H;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("lc.C(").append(false).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    final static long h() {
        return km.b(-1) - rb.field_C;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        L0: {
          L1: {
            if (-param5 + param1 < kn.field_e) {
              break L1;
            } else {
              if (qg.field_z < param1 - -param5) {
                break L1;
              } else {
                if (j.field_q > param3 - param5) {
                  break L1;
                } else {
                  if (param3 + param5 > qk.field_p) {
                    break L1;
                  } else {
                    mh.a(param0, param1, param5, param6, param3, 15783, param4);
                    break L0;
                  }
                }
              }
            }
          }
          ue.a(-15788, param1, param3, param6, param5, param0, param4);
          break L0;
        }
        var7 = -124;
    }

    final int[][] a(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Torquing.field_u;
        int[][] var11 = ((lc) this).field_r.a(15142, param1);
        int[][] var3 = var11;
        if (((lc) this).field_r.field_b) {
            if (!(!((lc) this).c(-31292))) {
                var4 = var11[0];
                var5 = var11[1];
                var6 = var11[2];
                var7 = ((lc) this).field_u * (param1 % ((lc) this).field_u);
                for (var8 = 0; var8 < ci.field_c; var8++) {
                    var9 = ((lc) this).field_s[var8 % ((lc) this).field_x + var7];
                    var6[var8] = ie.a(4080, var9 << 4);
                    var5[var8] = ie.a(var9 >> 4, 4080);
                    var4[var8] = ie.a(4080, var9 >> 12);
                }
            }
        }
        if (param0 != -29116) {
            field_z = 43;
        }
        return var3;
    }

    final static void g(int param0) {
        RuntimeException var1 = null;
        t var1_ref = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            ph.c(243, 197, 369, 143, 16777215);
            ph.d(244, 198, 367, 141, 0);
            if (null == nc.field_d) {
              L1: {
                if (null != kl.field_o) {
                  int discarded$3 = kl.field_o.a(vo.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                var1_ref = nc.field_d[da.field_a];
                if (var1_ref == null) {
                  if (kl.field_o != null) {
                    int discarded$4 = kl.field_o.a(vo.field_e, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var1_ref.d(245, 199);
                  break L2;
                }
              }
              L3: {
                if (param0 >= 68) {
                  break L3;
                } else {
                  lc.g(6);
                  break L3;
                }
              }
              L4: {
                if (~op.field_j < ~mf.field_t) {
                  var1_ref = nc.field_d[gf.field_h];
                  if (var1_ref != null) {
                    var2_int = (60 + var1_ref.field_w) * mf.field_t / op.field_j;
                    var3 = var2_int - 30;
                    if (!pp.field_c) {
                      ql.a(256 * (var1_ref.field_w + -var3) / 30, 245, var1_ref, 199, -256 * var3 / 30, (byte) -81);
                      break L4;
                    } else {
                      ql.a(-256 * var3 / 30, 245, var1_ref, 199, (-var3 + var1_ref.field_w) * 256 / 30, (byte) -122);
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                L6: {
                  if (null == kl.field_o) {
                    break L6;
                  } else {
                    var2 = null;
                    var5 = 0;
                    var3 = var5;
                    L7: while (true) {
                      if (var5 >= nc.field_d.length) {
                        if (var2 != null) {
                          int discarded$5 = kl.field_o.a("Screenshot(s) " + (String) var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                          break L6;
                        } else {
                          break L5;
                        }
                      } else {
                        L8: {
                          var1_ref = nc.field_d[var5];
                          if (var1_ref == null) {
                            break L8;
                          } else {
                            L9: {
                              if (var1_ref.field_w != 365) {
                                break L9;
                              } else {
                                if (var1_ref.field_u == 139) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            if (var2 != null) {
                              var2 = (Object) (Object) ((String) var2 + ", " + var5);
                              break L8;
                            } else {
                              var2 = (Object) (Object) Integer.toString(var5);
                              break L8;
                            }
                          }
                        }
                        var5++;
                        continue L7;
                      }
                    }
                  }
                }
                break L5;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "lc.J(" + param0 + ')');
        }
    }

    final static void b() {
        df var2 = wa.field_d;
        var2.f(87, 6);
        var2.b(90, 1);
        var2.b(90, 0);
    }

    final static void d() {
        uf[] var1 = null;
        int[] var2 = null;
        short[] var3 = null;
        t var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        kh var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        sg var11 = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        rm var13_ref_rm = null;
        int var14 = 0;
        int var15_int = 0;
        t var15 = null;
        int var16 = 0;
        t var16_ref_t = null;
        int var17 = 0;
        kh var17_ref_kh = null;
        sg var18 = null;
        int var18_int = 0;
        int[] var19 = null;
        int var19_int = 0;
        int[] var20 = null;
        t var20_ref = null;
        int[] var21_ref_int__ = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        long var24 = 0L;
        int var26 = 0;
        int var27 = 0;
        var27 = Torquing.field_u;
        var1 = new uf[]{new uf((uc) (Object) qh.field_c, 0, 517, 298, (sm) null, 0, 0)};
        var2 = new int[]{0, 1, 2, 4, 6, 5, 9, 18, 7, 8};
        var3 = new short[]{(short) 0, (short) 2, (short) 4, (short) 3, (short) 1, (short) 5};
        var4 = new t(8, 1);
        var5 = ph.field_e;
        var6 = ph.field_j;
        var7 = ph.field_d;
        var1 = rh.a((byte) -101, var1, var4, vd.field_a);
        int discarded$10 = -58;
        ln.a(1, 0, var1);
        var1 = rh.a((byte) 114, var1, kl.field_p, "");
        var1[0].a((byte) -15, 2);
        var1 = rh.a((byte) 116, var1, var4, hl.field_c);
        var1[0].a((byte) 101, 1);
        var1 = rh.a((byte) 125, var1, var4, q.field_i);
        int discarded$11 = -58;
        ln.a(1, 0, var1);
        var1[-1 + var1.length].c(0);
        var1[var1.length + -1].d(102);
        var1 = rh.a((byte) -122, var1, var4, eq.field_c);
        int discarded$12 = -58;
        ln.a(0, dd.field_c.field_x, var1);
        hh.field_e = new t[m.field_n.length];
        be.field_g = 30;
        var8 = var2;
        var9 = 0;
        L0: while (true) {
          if (var8.length <= var9) {
            var1[-1 + var1.length].d(121);
            var1 = rh.a((byte) -110, var1, var4, vp.field_G);
            int discarded$13 = -58;
            ln.a(0, dd.field_c.field_x, var1);
            var8_ref = new kh(new rm(8, 2, 2));
            var8_ref.field_q = new mp(2);
            int discarded$14 = var8_ref.field_l.a(-60, -60, 0);
            int discarded$15 = var8_ref.field_l.a(60, -60, 0);
            int discarded$16 = var8_ref.field_l.a(-60, 60, 0);
            int discarded$17 = var8_ref.field_l.a(60, 60, 0);
            oj.a(3, (short) 0, 0, false, true, 1, 0, (short) -1, 2, var8_ref);
            oj.a(1, (short) 0, 3, false, true, 2, 3, (short) -1, 1, var8_ref);
            var9 = be.field_l[1664];
            var10 = be.field_o[1664];
            be.field_g = 40;
            var11 = new sg(1);
            var11.a(0, var8_ref);
            var11.a(var8_ref, new int[12]);
            var12 = 99999;
            var13 = -99999;
            var14 = 0;
            L1: while (true) {
              if (var8_ref.field_l.field_f <= var14) {
                var14 = 0;
                L2: while (true) {
                  if (ga.field_d.length <= var14) {
                    var1[var1.length + -1].c(0);
                    hg.field_b = var1;
                    ph.a(var5, var6, var7);
                    be.a();
                    return;
                  } else {
                    var15 = new t(80, var13 + 1 - var12);
                    var15.e();
                    be.a();
                    var8_ref.field_l.field_A[0] = var3[var14];
                    var8_ref.field_l.field_m[1] = (short)be.field_c.b((int) var3[var14]);
                    var8_ref.field_q.field_v = null;
                    var8_ref.field_k = null;
                    var11.a(0, 80, 1365, 0, -1, 0);
                    be.field_b = -var12;
                    var11.a(new int[12]);
                    var1 = rh.a((byte) 120, var1, var15, ga.field_d[var3[var14]]);
                    int discarded$18 = -58;
                    ln.a(0, dd.field_c.field_x, var1);
                    var14++;
                    continue L2;
                  }
                }
              } else {
                L3: {
                  var15_int = var8_ref.field_l.field_B[var14];
                  var16 = var8_ref.field_l.field_E[var14];
                  var17 = var10 * var15_int + -(var16 * var9) >> 16;
                  var16 = var16 * var10 + var9 * var15_int >> 16;
                  var15_int = (var17 << 9) / (var16 + 1024);
                  if (var12 <= var15_int) {
                    break L3;
                  } else {
                    var12 = var15_int;
                    break L3;
                  }
                }
                L4: {
                  if (var15_int <= var13) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var14++;
                continue L1;
              }
            }
          } else {
            L5: {
              var10 = var8[var9];
              if (m.field_n[var10] != null) {
                var11_int = be.field_l[200];
                var12 = be.field_o[200];
                var13_ref_rm = vc.field_c[var10].field_l;
                var14 = 99999;
                var15_int = -99999;
                var16 = 0;
                L6: while (true) {
                  if (var16 >= var13_ref_rm.field_f) {
                    L7: {
                      var16_ref_t = new t(60, -var14 + (1 + var15_int));
                      hh.field_e[var10] = var16_ref_t;
                      var16_ref_t.e();
                      be.a();
                      var17_ref_kh = vc.field_c[var10];
                      var18 = new sg(1);
                      var18.a(0, var17_ref_kh);
                      var19 = new int[]{0, 0, 0, 65535, 0, 0, 0, var12, var11_int, 0, -var11_int, var12};
                      if (var10 == 1) {
                        var20 = new int[]{0, 0, 0, 0, 0, 65536, 0, 65536, 0, 65536, 0, 0};
                        var21_ref_int__ = new int[12];
                        var22 = 0;
                        L8: while (true) {
                          if (3 <= var22) {
                            var19 = var21_ref_int__;
                            break L7;
                          } else {
                            var23 = 0;
                            L9: while (true) {
                              if (3 <= var23) {
                                var22++;
                                continue L8;
                              } else {
                                var24 = 0L;
                                var26 = 0;
                                L10: while (true) {
                                  if (3 <= var26) {
                                    var21_ref_int__[3 + (var22 * 3 + var23)] = (int)(var24 >>> 16);
                                    var23++;
                                    continue L9;
                                  } else {
                                    var24 = var24 + (long)var19[3 + (var23 + var26 * 3)] * (long)var20[var22 * 3 + var26 - -3];
                                    var26++;
                                    continue L10;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                    L11: {
                      var18.a(var17_ref_kh, var19);
                      sg.a(var17_ref_kh, 80, 1365, -1, -12, 12);
                      be.field_b = -var14;
                      var18.a(new int[12]);
                      if (var10 == 0) {
                        var20_ref = new t(60, var15_int - (var14 - -31));
                        var21 = (-31 + (var15_int + -var14)) / 2;
                        t.a(var16_ref_t, var20_ref, 0, 0, 0, 0, 60, var21);
                        var22 = -var21 + var20_ref.field_t;
                        t.a(var16_ref_t, var20_ref, 0, var16_ref_t.field_t - var22, 0, var21, 60, var22);
                        var16_ref_t = new t(var20_ref.field_s, var20_ref.field_t / 2);
                        var16_ref_t.e();
                        var20_ref.c(var20_ref.field_s << 3, var20_ref.field_t << 3, var16_ref_t.field_s << 3, var16_ref_t.field_t << 3, 0, 2048);
                        hh.field_e[var10] = var16_ref_t;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    var1 = rh.a((byte) 111, var1, var16_ref_t, m.field_n[var10]);
                    int discarded$19 = -58;
                    ln.a(0, dd.field_c.field_x, var1);
                    break L5;
                  } else {
                    L12: {
                      var17 = var13_ref_rm.field_B[var16];
                      var18_int = var13_ref_rm.field_E[var16];
                      var19_int = var12 * var17 - var18_int * var11_int >> 16;
                      var18_int = var11_int * var17 - -(var18_int * var12) >> 16;
                      var17 = (var19_int << 9) / (1024 + var18_int);
                      if (var17 >= var14) {
                        break L12;
                      } else {
                        var14 = var17;
                        break L12;
                      }
                    }
                    L13: {
                      if (var17 <= var15_int) {
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var16++;
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
            var9++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = 0;
        field_B = "achievements to collect";
    }
}
