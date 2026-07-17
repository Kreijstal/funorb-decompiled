/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends km {
    private static int[] field_x;
    static long field_E;
    private vl field_z;
    private vl[] field_F;
    static int field_v;
    static int field_w;
    static String field_t;
    private kq field_r;
    private ga field_s;
    private int field_B;
    private int field_H;
    private int field_G;
    private uj field_y;
    private nc field_A;
    private String field_C;
    private int field_D;
    private int field_u;
    private int field_I;

    final void a(int param0, int param1, char param2) {
        int var5 = 0;
        L0: {
          var5 = BrickABrac.field_J ? 1 : 0;
          if (param0 == -120) {
            break L0;
          } else {
            ((ud) this).field_H = -61;
            break L0;
          }
        }
        L1: {
          if (((ud) this).field_h.field_j >= 0) {
            if (((ud) this).field_h.field_j == 3) {
              L2: {
                if (param1 == 97) {
                  break L2;
                } else {
                  if (param1 != 96) {
                    if (param1 == 98) {
                      ((ud) this).field_h.a(false, 1);
                      ((ud) this).field_y.b((byte) -100);
                      break L1;
                    } else {
                      if (99 == param1) {
                        ((ud) this).field_h.a(false, 1);
                        ((ud) this).field_y.a((byte) -95);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              if (5 != ((ud) this).field_m.length) {
                break L1;
              } else {
                ((ud) this).field_h.a(false, 4);
                break L1;
              }
            } else {
              if (4 != ((ud) this).field_h.field_j) {
                if (1 != ((ud) this).field_h.field_j) {
                  break L1;
                } else {
                  if (!((ud) this).field_y.a(-28088, param1, (int) param2)) {
                    break L1;
                  } else {
                    ((ud) this).field_h.a(false, 3);
                    break L1;
                  }
                }
              } else {
                L3: {
                  if (param1 == 97) {
                    break L3;
                  } else {
                    if (param1 == 96) {
                      break L3;
                    } else {
                      if (98 != param1) {
                        if (param1 == 99) {
                          ((ud) this).field_h.a(false, 1);
                          ((ud) this).field_y.a((byte) -114);
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        ((ud) this).field_h.a(false, 1);
                        ((ud) this).field_y.b((byte) -63);
                        break L1;
                      }
                    }
                  }
                }
                ((ud) this).field_h.a(false, 3);
                break L1;
              }
            }
          } else {
            ((ud) this).field_h.a(false, 3);
            break L1;
          }
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        jp var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int stackOut_17_5 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        L0: {
          L1: {
            super.b((byte) -101);
            al.a(13, 19);
            im.a(550, 5, 33, 5, 140, (byte) -106, 45);
            im.a(160, 5, 243, 5, 178, (byte) -88, 45);
            im.a(385, 5, 243, 5, 178, (byte) -124, 210);
            nn.field_g.b(qn.field_u[((ud) this).field_A.field_h], 320, 1 + (178 - nn.field_g.field_L), 0, -1);
            da.field_E[((ud) this).field_A.field_h].e(565, 140, -2048, 4096);
            if (((ud) this).field_y.field_q < 0) {
              break L1;
            } else {
              if (((ud) this).field_y.field_q >= ((ud) this).field_A.field_i) {
                break L1;
              } else {
                L2: {
                  var2 = nn.field_g.field_B + 2;
                  var3 = ((ud) this).field_y.field_q;
                  if (var3 == ((ud) this).field_H) {
                    break L2;
                  } else {
                    this.c(-6845, var3);
                    ((ud) this).field_H = var3;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    if (qg.field_t) {
                      break L4;
                    } else {
                      if (((ud) this).field_H >= 3 + hh.field_b[((ud) this).field_A.field_h]) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  int discarded$2 = 85;
                  int discarded$3 = 385;
                  this.a(178, 243 - 2 * var2, 210);
                  break L3;
                }
                L5: {
                  L6: {
                    if (qg.field_t) {
                      break L6;
                    } else {
                      if (hh.field_b[((ud) this).field_A.field_h] < ((ud) this).field_H) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  nn.field_g.b(((ud) this).field_A.field_c[((ud) this).field_H].field_j, 402, 421 - var2, 0, -1);
                  break L5;
                }
                if (qg.field_t) {
                  break L0;
                } else {
                  if (((ud) this).field_H <= hh.field_b[((ud) this).field_A.field_h]) {
                    break L0;
                  } else {
                    L7: {
                      if (((ud) this).field_H >= 3 + hh.field_b[((ud) this).field_A.field_h]) {
                        break L7;
                      } else {
                        L8: {
                          stackOut_15_0 = 210;
                          stackOut_15_1 = 178;
                          stackOut_15_2 = 385;
                          stackOut_15_3 = 233;
                          stackOut_15_4 = 0;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_17_2 = stackOut_15_2;
                          stackIn_17_3 = stackOut_15_3;
                          stackIn_17_4 = stackOut_15_4;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          stackIn_16_3 = stackOut_15_3;
                          stackIn_16_4 = stackOut_15_4;
                          if (1 != -hh.field_b[0] + var3) {
                            stackOut_17_0 = stackIn_17_0;
                            stackOut_17_1 = stackIn_17_1;
                            stackOut_17_2 = stackIn_17_2;
                            stackOut_17_3 = stackIn_17_3;
                            stackOut_17_4 = stackIn_17_4;
                            stackOut_17_5 = 190;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            stackIn_18_2 = stackOut_17_2;
                            stackIn_18_3 = stackOut_17_3;
                            stackIn_18_4 = stackOut_17_4;
                            stackIn_18_5 = stackOut_17_5;
                            break L8;
                          } else {
                            stackOut_16_0 = stackIn_16_0;
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = stackIn_16_2;
                            stackOut_16_3 = stackIn_16_3;
                            stackOut_16_4 = stackIn_16_4;
                            stackOut_16_5 = 128;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            stackIn_18_2 = stackOut_16_2;
                            stackIn_18_3 = stackOut_16_3;
                            stackIn_18_4 = stackOut_16_4;
                            stackIn_18_5 = stackOut_16_5;
                            break L8;
                          }
                        }
                        lb.d(stackIn_18_0, stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_18_4, stackIn_18_5);
                        break L7;
                      }
                    }
                    var4 = vq.field_F;
                    var5 = 210 - -((385 + -var4.field_x) / 2);
                    var6 = (243 - var4.field_z) / 2 + 178;
                    var4.b(var5, var6, 196);
                    break L0;
                  }
                }
              }
            }
          }
          nn.field_g.b(((ud) this).field_C, 402, 299 + nn.field_g.field_P, 0, -1);
          ((ud) this).field_H = -1;
          break L0;
        }
        L9: {
          ((ud) this).field_y.c((byte) 28);
          ((ud) this).a(0);
          if (param0 < -14) {
            break L9;
          } else {
            ((ud) this).field_D = -125;
            break L9;
          }
        }
    }

    static int d(int param0, int param1) {
        return param0 | param1;
    }

    ud(int param0, int param1) {
        this(param0, ui.field_a, param1);
    }

    final void a(boolean param0, int param1, int param2) {
        super.a(param0, 1, 104);
        ((ud) this).field_y.b(0);
        if (!param0) {
            ((ud) this).field_y.a((byte) -90);
        }
        ((ud) this).field_H = -1;
        if (param2 < 96) {
            ((ud) this).d(37);
        }
    }

    final String e(byte param0) {
        if (param0 <= 53) {
            return null;
        }
        return ag.field_D[pg.c(61) ? 7 : 39];
    }

    private final void c(int param0, int param1) {
        int var3 = 0;
        on var4 = null;
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        var3 = 0;
        L0: while (true) {
          if (((ud) this).field_F.length <= var3) {
            ((ud) this).field_z.c((byte) -78);
            int discarded$2 = 10792131;
            int discarded$3 = td.a(((ud) this).field_F, ((ud) this).field_A.field_j[param1], ((ud) this).field_r, ((ud) this).field_z, ((ud) this).field_s);
            cg.a(((ud) this).field_F, (byte) 35, ((ud) this).field_z, false);
            ((ud) this).field_I = 122880;
            ((ud) this).field_u = 163840;
            ((ud) this).field_D = 0;
            ((ud) this).field_B = 0;
            var3 = 0;
            L1: while (true) {
              if (((ud) this).field_F.length <= var3) {
                return;
              } else {
                var4 = (on) (Object) ((ud) this).field_F[var3].d(-110);
                L2: while (true) {
                  if (var4 == null) {
                    var3++;
                    continue L1;
                  } else {
                    L3: {
                      if ((1 & var4.field_N) != 0) {
                        break L3;
                      } else {
                        L4: {
                          if (((ud) this).field_D < var4.field_j - -var4.field_u) {
                            ((ud) this).field_D = var4.field_j + var4.field_u;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (((ud) this).field_I > var4.field_m) {
                            ((ud) this).field_I = var4.field_m;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (var4.field_m - -var4.field_s > ((ud) this).field_B) {
                            ((ud) this).field_B = var4.field_s + var4.field_m;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (var4.field_j >= ((ud) this).field_u) {
                          break L3;
                        } else {
                          ((ud) this).field_u = var4.field_j;
                          break L3;
                        }
                      }
                    }
                    var4 = (on) (Object) ((ud) this).field_F[var3].a((byte) 116);
                    continue L2;
                  }
                }
              }
            }
          } else {
            if (((ud) this).field_F[var3] != null) {
              ((ud) this).field_F[var3].c((byte) -80);
              var3++;
              continue L0;
            } else {
              ((ud) this).field_F[var3] = new vl();
              var3++;
              continue L0;
            }
          }
        }
    }

    final static boolean a(long param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        mp var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = -82 / ((-47 - param2) / 37);
              var5 = pf.a(false, param1);
              if (var5 == null) {
                break L1;
              } else {
                if (var5.field_Ub != null) {
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (o.field_e == null) {
                  break L3;
                } else {
                  int discarded$3 = 2;
                  if (null == ac.a(param0)) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ud.LA(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 <= 98) {
            int discarded$0 = ((ud) this).a(true);
        }
        if (param2 != 48) {
            return super.a(param0, 100, param2);
        }
        if (cf.a((byte) 62)) {
            qg.field_t = true;
            return true;
        }
        return true;
    }

    final static tp c() {
        tp var1 = new tp(cf.field_d, ek.field_db, ag.field_K[0], dl.field_d[0], jh.field_b[0], gg.field_t[0], cn.field_a[0], qp.field_c);
        int discarded$0 = 96;
        ee.d();
        return var1;
    }

    final int b(int param0, int param1) {
        if (param1 != 1) {
            return -75;
        }
        return ((ud) this).field_p - -32;
    }

    final static String d() {
        if (jm.field_f == ik.field_g) {
            return td.field_w;
        }
        if (!(ka.field_l != jm.field_f)) {
            return om.field_pc;
        }
        if (!ma.field_I.b(96)) {
            return om.field_pc;
        }
        return gf.field_d;
    }

    private ud(int param0, int[] param1, int param2) {
        super(param0, 180, 460, 402, 35, param1);
        int var4_int = 0;
        int var5 = 0;
        ((ud) this).field_F = new vl[3];
        ((ud) this).field_z = new vl();
        ((ud) this).field_r = new kq();
        ((ud) this).field_s = new ga();
        ((ud) this).field_G = 0;
        try {
            ((ud) this).field_C = oj.field_s.toLowerCase();
            ((ud) this).field_A = na.field_L[param2];
            for (var4_int = 0; ((ud) this).field_A.field_i > var4_int; var4_int++) {
                var5 = nn.field_g.c(((ud) this).field_A.field_c[var4_int].field_o);
                if (var5 > ((ud) this).field_G) {
                    ((ud) this).field_G = var5;
                }
            }
            ((ud) this).b(true);
            ((ud) this).field_y = new uj(20, 0, 1, (km) this, ((ud) this).field_m[1], ((ud) this).field_A);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ud.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final boolean a(int param0, boolean param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        q var8 = null;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          var8 = ((ud) this).field_m[param0];
          if (param2 == 123) {
            break L0;
          } else {
            boolean discarded$2 = ((ud) this).a('ﾉ', -55, 73);
            break L0;
          }
        }
        L1: {
          var5 = var8.field_f;
          var6 = var5;
          if (var6 == 31) {
            if (!((ud) this).field_h.a((byte) 113)) {
              break L1;
            } else {
              if (0 > ((ud) this).field_y.field_q) {
                break L1;
              } else {
                L2: {
                  if (qg.field_t) {
                    break L2;
                  } else {
                    if (hh.field_b[((ud) this).field_A.field_h] >= ((ud) this).field_y.field_q) {
                      break L2;
                    } else {
                      return false;
                    }
                  }
                }
                if (((ud) this).field_y.field_q >= ((ud) this).field_A.field_i) {
                  break L1;
                } else {
                  cq.a(16727, param1, ((ud) this).field_y.field_q, new oi(((ud) this).field_A));
                  break L1;
                }
              }
            }
          } else {
            if (var6 == 29) {
              if (!param1) {
                break L1;
              } else {
                if (((ud) this).field_h.c((byte) 108)) {
                  ((ud) this).field_y.a(-((ud) this).field_y.field_h, true);
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              if (var6 != 30) {
                return super.a(param0, param1, (byte) 123);
              } else {
                if (!param1) {
                  break L1;
                } else {
                  if (((ud) this).field_h.c((byte) -13)) {
                    ((ud) this).field_y.a(((ud) this).field_y.field_h, true);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
        }
        return false;
    }

    final static void a(int param0, e param1, byte param2) {
        pi var6 = null;
        int var4 = 0;
        try {
            var6 = k.field_h;
            var6.e(-13413, 4);
            var6.field_l = var6.field_l + 1;
            var4 = var6.field_l;
            var6.a(116, 1);
            var6.a(-116, param1.field_o);
            var6.a(-103, param1.field_i);
            var6.a(param1.field_k, (byte) -79);
            var6.a(param1.field_n, (byte) -79);
            var6.a(param1.field_m, (byte) -79);
            var6.a(param1.field_p, (byte) -79);
            int var5 = -68 / ((param2 - -15) / 63);
            int discarded$0 = var6.d(3, var4);
            var6.d((byte) 117, var6.field_l - var4);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "ud.C(" + 4 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public static void f() {
        field_t = null;
        field_x = null;
        int var1 = 0;
    }

    final void d(int param0) {
        if (param0 > -60) {
            field_t = null;
        }
        ((ud) this).a(bm.field_f, 0);
    }

    private final void a(int param0, int param1, int param2) {
        int var8 = 0;
        on var9 = null;
        int var10 = BrickABrac.field_J ? 1 : 0;
        int var6 = ((ud) this).field_D - ((ud) this).field_u >> 9;
        param2 = param2 + (-var6 + 385) / 2;
        int var7 = -((ud) this).field_I + ((ud) this).field_B >> 9;
        param0 = param0 + (param1 + -var7) / 2;
        for (var8 = 0; var8 < ((ud) this).field_F.length; var8++) {
            var9 = (on) (Object) ((ud) this).field_F[var8].d(-109);
            while (var9 != null) {
                if ((1 & var9.field_N) == 0) {
                    pa.field_m[var9.field_i].a((var9.field_j + -((ud) this).field_u >> 9) + param2, (var9.field_m + -((ud) this).field_I >> 9) + param0, 17, 8);
                }
                var9 = (on) (Object) ((ud) this).field_F[var8].a((byte) 116);
            }
        }
    }

    final void b(boolean param0) {
        q var3 = null;
        q var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        q var7_ref_q = null;
        String var8 = null;
        int var9 = 0;
        q var10 = null;
        q var11 = null;
        String var12 = null;
        q var13 = null;
        String stackIn_9_0 = null;
        String stackOut_8_0 = null;
        String stackOut_7_0 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        if (null != ((ud) this).field_A) {
          L0: {
            if (param0) {
              break L0;
            } else {
              field_w = 119;
              break L0;
            }
          }
          var10 = ((ud) this).field_m[0];
          var11 = var10;
          var11.field_c = (-((ud) this).field_G + 140) / 2 + 55;
          var11.field_d = 22;
          var11.field_a = 188;
          var10.field_j = ((ud) this).field_G;
          var3 = ((ud) this).field_m[2];
          var3.field_j = var11.field_j;
          var3.field_a = 389;
          var3.field_c = var11.field_c;
          var3.field_d = var10.field_d;
          var4 = ((ud) this).field_m[1];
          var4.field_a = 217;
          var4.field_d = 165;
          var4.field_j = 140;
          var4.field_c = 55;
          var5 = 0;
          var6 = 3;
          L1: while (true) {
            if (var6 >= ((ud) this).field_m.length) {
              var6 = (640 + -var5) / 2;
              var7 = 3;
              L2: while (true) {
                if (var7 >= ((ud) this).field_m.length) {
                  return;
                } else {
                  var13 = ((ud) this).field_m[var7];
                  var13.field_c = var6;
                  var13.field_a = ((ud) this).b(var7, 1);
                  var13.field_d = ((ud) this).b((byte) 126, var7);
                  var6 = var6 + (var13.field_j + 10);
                  var7++;
                  continue L2;
                }
              }
            } else {
              L3: {
                var7_ref_q = ((ud) this).field_m[var6];
                if (var7_ref_q.field_f != 8) {
                  stackOut_8_0 = ag.field_D[var7_ref_q.field_f];
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_7_0 = ((ud) this).e((byte) 74);
                  stackIn_9_0 = stackOut_7_0;
                  break L3;
                }
              }
              var12 = stackIn_9_0;
              var8 = var12;
              int dupTemp$1 = 30 + nn.field_g.c(var12);
              var7_ref_q.field_j = dupTemp$1;
              var5 = var5 + dupTemp$1;
              if (var6 > 3) {
                var5 += 10;
                var6++;
                continue L1;
              } else {
                var6++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        super.a(param0, param1, -113);
        ((ud) this).field_y.b(false);
        if (param2 >= -52) {
            field_v = -8;
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            ((ud) this).field_s = null;
        }
        return !pg.c(73) ? 16 : 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_x = new int[256];
        field_t = "Player";
        for (var0 = 0; var0 < 256; var0++) {
            field_x[var0] = var0;
        }
    }
}
