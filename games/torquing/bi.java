/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static pc field_f;
    private boolean field_t;
    static String field_u;
    ei field_e;
    static String field_I;
    static int field_p;
    ei field_B;
    int field_n;
    private int field_j;
    private int[] field_m;
    private double field_h;
    private int field_E;
    kh field_i;
    private tl[] field_D;
    private int field_S;
    private int field_U;
    private int field_o;
    private int field_F;
    private double field_K;
    private int field_N;
    private String field_T;
    vg field_P;
    private boolean field_w;
    private sg field_C;
    private int field_H;
    private kg[] field_Q;
    int field_s;
    int field_L;
    private int field_r;
    private int field_x;
    private int field_l;
    private int field_G;
    private int field_c;
    private Torquing field_A;
    private int field_M;
    hc field_d;
    private int[] field_a;
    private int field_v;
    private boolean field_g;
    private int field_k;
    private boolean field_y;
    int[] field_b;
    int field_z;
    int field_q;
    private boolean field_J;

    private final void h(int param0) {
        tl[] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        int[] var4 = null;
        int var5_int = 0;
        pj var5 = null;
        kh[] var6_ref_kh__ = null;
        int var6 = 0;
        int var7 = 0;
        kh var8 = null;
        int var9 = 0;
        tl[] var10 = null;
        int var11 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackOut_19_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        var9 = Torquing.field_u;
        int discarded$2 = -109;
        fd.a();
        re.field_d[1] = 80.0;
        ((bi) this).field_x = 0;
        re.field_d[0] = 0.0;
        var10 = ((bi) this).field_d.field_q;
        var2 = var10;
        ((bi) this).field_D = new tl[var10.length];
        dk.a((Object[]) (Object) var2, 0, (Object[]) (Object) ((bi) this).field_D, 0, ((bi) this).field_D.length);
        var3 = 0;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= ((bi) this).field_D.length) {
            ((bi) this).field_m = new int[var3];
            var11 = 0;
            var4_int = var11;
            L1: while (true) {
              if (var11 >= ((bi) this).field_D.length) {
                ((bi) this).field_C = ((bi) this).field_P.a(-63, ((bi) this).field_d);
                ((bi) this).field_P.b(0, ((bi) this).field_i);
                var4 = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
                var5_int = 42 % ((-34 - param0) / 44);
                var6_ref_kh__ = vc.field_c;
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6_ref_kh__.length) {
                    var5_int = 0;
                    L3: while (true) {
                      if (var5_int >= ((bi) this).field_C.field_y) {
                        L4: {
                          this.a(false, 0);
                          ((bi) this).field_w = false;
                          ((bi) this).field_T = ki.a("ff9040", "ffffff", 93, ((bi) this).field_T);
                          ((bi) this).field_z = 0;
                          ((bi) this).field_k = ((bi) this).field_d.a(-31648);
                          ((bi) this).field_r = 3000;
                          ((bi) this).field_c = 0;
                          ((bi) this).field_v = ((bi) this).field_d.a(false);
                          int[] discarded$3 = ap.a(gj.field_i, il.field_m[((bi) this).field_v]);
                          stackOut_19_0 = this;
                          stackIn_21_0 = stackOut_19_0;
                          stackIn_20_0 = stackOut_19_0;
                          if (((bi) this).field_L != 18) {
                            stackOut_21_0 = this;
                            stackOut_21_1 = 0;
                            stackIn_22_0 = stackOut_21_0;
                            stackIn_22_1 = stackOut_21_1;
                            break L4;
                          } else {
                            stackOut_20_0 = this;
                            stackOut_20_1 = 1;
                            stackIn_22_0 = stackOut_20_0;
                            stackIn_22_1 = stackOut_20_1;
                            break L4;
                          }
                        }
                        ((bi) this).field_y = stackIn_22_1 != 0;
                        ((bi) this).field_J = false;
                        ((bi) this).field_h = Double.NEGATIVE_INFINITY;
                        ((bi) this).field_K = -1.0;
                        var5 = ((bi) this).field_d.a(-100, false).field_k;
                        var6 = var5.field_k + -1;
                        L5: while (true) {
                          if (var6 < 0) {
                            return;
                          } else {
                            if (((bi) this).field_h < re.field_d[1] * (double)var5.field_y[var6]) {
                              ((bi) this).field_h = re.field_d[1] * (double)var5.field_y[var6];
                              var6--;
                              continue L5;
                            } else {
                              var6--;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        ((bi) this).field_C.a(var5_int, 80, 1365, -1, -12, 12);
                        var5_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var8 = var6_ref_kh__[var7];
                    if (var8 != null) {
                      ((bi) this).field_C.a(var8, var4);
                      var7++;
                      continue L2;
                    } else {
                      var7++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (((bi) this).field_D[var11].f(25468)) {
                  var3--;
                  ((bi) this).field_m[var3] = var11;
                  var11++;
                  continue L1;
                } else {
                  var11++;
                  continue L1;
                }
              }
            }
          } else {
            if (((bi) this).field_D[var4_int].f(25468)) {
              var3++;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final void g(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        tl[] var10 = null;
        tl[] var11 = null;
        qk var12 = null;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var9 = Torquing.field_u;
          var12 = new qk(0, ((bi) this).field_L, ((bi) this).field_N, ((bi) this).field_S, ((bi) this).field_F, ((bi) this).field_G);
          if (!je.a((byte) 77)) {
            le.a((byte) 83, 5, var12);
            break L0;
          } else {
            bo.field_l.a((byte) 54, (q) (Object) var12);
            break L0;
          }
        }
        L1: {
          if (1 + ((bi) this).field_L > nh.field_k) {
            nh.field_k = ((bi) this).field_L - -1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          L3: {
            if (wi.field_a.length - 1 == ((bi) this).field_L) {
              break L3;
            } else {
              if (~wi.field_a[((bi) this).field_L + 1] == ~wi.field_a[((bi) this).field_L]) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              } else {
                break L3;
              }
            }
          }
          stackOut_9_0 = 1;
          stackIn_11_0 = stackOut_9_0;
          break L2;
        }
        L4: {
          L5: {
            var3 = stackIn_11_0;
            var4 = wi.field_a[((bi) this).field_L];
            if (var3 == 0) {
              break L5;
            } else {
              L6: {
                if (var4 == 1) {
                  this.a(0, (byte) 83, 255);
                  break L6;
                } else {
                  if (var4 == 2) {
                    this.a(1, (byte) 9, 254);
                    break L6;
                  } else {
                    if (var4 != 4) {
                      if (7 != var4) {
                        break L6;
                      } else {
                        this.a(3, (byte) 125, 252);
                        break L6;
                      }
                    } else {
                      this.a(2, (byte) 78, 253);
                      break L6;
                    }
                  }
                }
              }
              L7: {
                var5 = ((bi) this).field_G & 63;
                if (var4 <= 0) {
                  break L7;
                } else {
                  L8: {
                    if (var4 > wi.field_a[var5]) {
                      break L8;
                    } else {
                      if (hg.field_d[var5] == 0) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  this.a(4, (byte) 118, 251);
                  break L7;
                }
              }
              if (0 == var5) {
                if (var4 != 2) {
                  if (var4 == 4) {
                    this.a(6, (byte) 6, 249);
                    break L5;
                  } else {
                    if (var4 != 7) {
                      break L5;
                    } else {
                      this.a(7, (byte) 112, 248);
                      if (-1 == ((bi) this).field_T.indexOf("ffffff")) {
                        this.a(13, (byte) 25, 242);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                } else {
                  this.a(5, (byte) 71, 250);
                  break L5;
                }
              } else {
                L9: {
                  if (-1 >= ((bi) this).field_T.indexOf("ff9040")) {
                    break L9;
                  } else {
                    if (((bi) this).field_T.indexOf("ffffff") == -1) {
                      ((bi) this).field_l = ((bi) this).field_l + ((bi) this).field_U;
                      ((bi) this).field_U = ((bi) this).field_U * 2;
                      ((bi) this).field_s = ((bi) this).field_U;
                      this.a(12, (byte) 61, 243);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                ((bi) this).field_T = ki.a("ff9040", "ff0000", -104, ((bi) this).field_T);
                var10 = ((bi) this).field_d.field_q;
                var6 = 0;
                L10: while (true) {
                  if (((bi) this).field_D.length <= var6) {
                    break L4;
                  } else {
                    L11: {
                      if (null != ((bi) this).field_D[var6]) {
                        break L11;
                      } else {
                        if (var10[var6].field_r == 0) {
                          break L11;
                        } else {
                          if (var10[var6].field_r == 7) {
                            break L11;
                          } else {
                            ((bi) this).field_b[wi.field_a[((bi) this).field_L]] = ((bi) this).field_b[wi.field_a[((bi) this).field_L]] + 1;
                            ((bi) this).field_G = ((bi) this).field_G + 4096;
                            ((bi) this).field_S = ((bi) this).field_S + (((bi) this).field_N << 12);
                            break L11;
                          }
                        }
                      }
                    }
                    var6++;
                    continue L10;
                  }
                }
              }
            }
          }
          L12: {
            if (-1 >= ((bi) this).field_T.indexOf("ff9040")) {
              break L12;
            } else {
              if (((bi) this).field_T.indexOf("ffffff") == -1) {
                ((bi) this).field_l = ((bi) this).field_l + ((bi) this).field_U;
                ((bi) this).field_U = ((bi) this).field_U * 2;
                ((bi) this).field_s = ((bi) this).field_U;
                this.a(12, (byte) 61, 243);
                break L12;
              } else {
                break L12;
              }
            }
          }
          ((bi) this).field_T = ki.a("ff9040", "ff0000", -104, ((bi) this).field_T);
          var11 = ((bi) this).field_d.field_q;
          var6 = 0;
          L13: while (true) {
            if (((bi) this).field_D.length <= var6) {
              break L4;
            } else {
              L14: {
                if (null != ((bi) this).field_D[var6]) {
                  break L14;
                } else {
                  if (var11[var6].field_r == 0) {
                    break L14;
                  } else {
                    if (var11[var6].field_r == 7) {
                      break L14;
                    } else {
                      ((bi) this).field_b[wi.field_a[((bi) this).field_L]] = ((bi) this).field_b[wi.field_a[((bi) this).field_L]] + 1;
                      ((bi) this).field_G = ((bi) this).field_G + 4096;
                      ((bi) this).field_S = ((bi) this).field_S + (((bi) this).field_N << 12);
                      break L14;
                    }
                  }
                }
              }
              var6++;
              continue L13;
            }
          }
        }
        L15: {
          if (var3 == 0) {
            break L15;
          } else {
            L16: {
              if (var4 == 1) {
                break L16;
              } else {
                if (var4 == 3) {
                  break L16;
                } else {
                  break L15;
                }
              }
            }
            var6 = 0;
            var7 = 0;
            var8 = 0;
            L17: while (true) {
              if (var4 < var8) {
                L18: {
                  if (var6 >= var7 * 8 / 10) {
                    if (1 != var4) {
                      this.a(10, (byte) 13, 245);
                      break L18;
                    } else {
                      this.a(8, (byte) 33, 247);
                      break L18;
                    }
                  } else {
                    break L18;
                  }
                }
                if (var7 == var6) {
                  if (var4 != 1) {
                    this.a(11, (byte) 24, 244);
                    break L15;
                  } else {
                    this.a(9, (byte) 23, 246);
                    break L15;
                  }
                } else {
                  break L15;
                }
              } else {
                var7 = var7 + mh.field_k[var4];
                var6 = var6 + ((bi) this).field_b[var4];
                var8++;
                continue L17;
              }
            }
          }
        }
        L19: {
          dd.field_d = dd.field_d | ((bi) this).field_z;
          if (dd.field_d == 255) {
            if (!ia.a(-22426, 0)) {
              this.a(15, (byte) 30, 240);
              break L19;
            } else {
              this.a(16, (byte) 11, 239);
              break L19;
            }
          } else {
            break L19;
          }
        }
        if (param0 >= 25) {
          L20: {
            if (wp.field_w > 0) {
              break L20;
            } else {
              if (qc.field_ab.length <= 1) {
                break L20;
              } else {
                if (~(qc.field_ab[1] + qc.field_ab[0]) < ~nh.field_k) {
                  break L20;
                } else {
                  nh.field_k = -1 + (qc.field_ab[0] - -qc.field_ab[1]);
                  break L20;
                }
              }
            }
          }
          ((bi) this).field_J = true;
          return;
        } else {
          return;
        }
    }

    final void e(int param0) {
        ((bi) this).field_w = true;
        if (param0 != -7045) {
            Object var3 = null;
            bi.a((java.applet.Applet) null, (byte) -76);
        }
    }

    final void b(byte param0, int param1) {
        ((bi) this).field_k = ((bi) this).field_k + param1;
        if (param0 < 120) {
            ((bi) this).field_k = -84;
        }
    }

    final void d(int param0) {
        ti[] var2_ref_ti__ = null;
        tl[] var2_ref_tl__ = null;
        int var2 = 0;
        int var3 = 0;
        tl var4 = null;
        int var5 = 0;
        ti[] var6 = null;
        tl[] var7 = null;
        int var8 = 0;
        ti var9 = null;
        L0: {
          var5 = Torquing.field_u;
          ((bi) this).field_e.a(0);
          if (null == ((bi) this).field_d.field_k) {
            break L0;
          } else {
            var6 = ((bi) this).field_d.field_k;
            var2_ref_ti__ = var6;
            var3 = 0;
            L1: while (true) {
              if (var3 >= var6.length) {
                break L0;
              } else {
                var9 = var6[var3];
                if (var9 != null) {
                  var9.b((byte) 62);
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
        if (param0 == 1) {
          var7 = ((bi) this).field_d.field_q;
          var2_ref_tl__ = var7;
          var8 = 0;
          var3 = var8;
          L2: while (true) {
            if (var7.length <= var8) {
              L3: {
                if (((bi) this).field_d.field_m != null) {
                  L4: {
                    ((bi) this).field_d = ((bi) this).field_d.field_m;
                    ((bi) this).field_G = ((bi) this).field_G + 64;
                    ((bi) this).field_L = ((bi) this).field_L + 1;
                    ((bi) this).field_F = ((bi) this).field_F + (((bi) this).field_N << 6);
                    var2 = wi.field_a[((bi) this).field_L];
                    if (1 + var2 != ((bi) this).field_q) {
                      ((bi) this).field_i = tp.field_a;
                      ((bi) this).field_q = var2 + 1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    L6: {
                      if (ri.field_E < 2) {
                        break L6;
                      } else {
                        if (!la.field_k[((bi) this).field_q].e(17)) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    la.field_k[((bi) this).field_q].g();
                    break L5;
                  }
                  this.h(67);
                  break L3;
                } else {
                  ((bi) this).b(param0 ^ 8);
                  ((bi) this).field_g = true;
                  ((bi) this).field_q = 9;
                  ((bi) this).field_d = ig.field_q;
                  la.field_k[9].a(true);
                  this.h(-83);
                  ((bi) this).field_r = 0;
                  break L3;
                }
              }
              return;
            } else {
              var4 = var7[var8];
              var4.field_c = -1;
              var4.field_h = null;
              var8++;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    final static af a(sm param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        di stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        di stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -94 / ((23 - param1) / 43);
            stackOut_0_0 = new di(param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("bi.B(");
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
          throw rb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param1 + ')');
        }
        return (af) (Object) stackIn_1_0;
    }

    final void a(int param0, int param1) {
        StringBuilder var3 = new StringBuilder(((bi) this).field_T);
        CharSequence var4 = (CharSequence) (Object) "ff9040";
        StringBuilder discarded$0 = gd.a(-20980, var3, var4, 5 + 13 * param0);
        ((bi) this).field_T = var3.toString();
        if (param1 >= -26) {
            ((bi) this).field_Q = null;
        }
        if (((bi) this).field_T.indexOf("ffffff") == -1) {
            th.a(100, th.field_F[18]);
        } else {
            th.a(100, th.field_F[17]);
        }
        th.a(100, th.field_F[19]);
    }

    final void a(byte param0) {
        int var2 = -38 % ((param0 - 62) / 48);
        ((bi) this).field_x = Math.max(10, ((bi) this).field_x);
    }

    final void a(byte param0, kh param1, int param2, int param3) {
        try {
            if (param0 != -68) {
                ((bi) this).b((byte) 62);
            }
            ((bi) this).field_H = param3;
            ((bi) this).field_E = param2;
            ((bi) this).field_P.b(0, param1);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "bi.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, sg param2, int param3) {
        kg var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        kg[] var7 = null;
        int var8 = 0;
        kg var9 = null;
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
        var8 = Torquing.field_u;
        try {
          L0: {
            var9 = new kg(param2, param3, param1);
            var5 = var9;
            var6 = 0;
            L1: while (true) {
              if (((bi) this).field_Q.length <= var6) {
                L2: {
                  var6 = ((bi) this).field_Q.length;
                  var7 = new kg[var6 - -1];
                  dk.a((Object[]) (Object) ((bi) this).field_Q, 0, (Object[]) (Object) var7, 0, var6);
                  if (param0 == 538) {
                    break L2;
                  } else {
                    ((bi) this).field_L = -15;
                    break L2;
                  }
                }
                var7[var6] = var9;
                ((bi) this).field_Q = var7;
                break L0;
              } else {
                L3: {
                  if (((bi) this).field_Q[var6] == null) {
                    break L3;
                  } else {
                    if (((bi) this).field_Q[var6].field_a == null) {
                      break L3;
                    } else {
                      var6++;
                      continue L1;
                    }
                  }
                }
                ((bi) this).field_Q[var6] = var9;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5_ref;
            stackOut_13_1 = new StringBuilder().append("bi.J(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param3 + ')');
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        Object var3 = null;
        int stackIn_11_0 = 0;
        Torquing stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Torquing stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Torquing stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Torquing stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Torquing stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Torquing stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        Torquing stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Torquing stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Torquing stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        Torquing stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Torquing stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        Torquing stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        L0: {
          if (param0 == -103) {
            break L0;
          } else {
            var3 = null;
            af discarded$2 = bi.a((sm) null, -1);
            break L0;
          }
        }
        L1: {
          ((bi) this).b(9);
          ((bi) this).field_g = true;
          if (!je.a((byte) 77)) {
            L2: {
              stackOut_15_0 = ((bi) this).field_A;
              stackOut_15_1 = 1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              if (ao.field_f == 0) {
                stackOut_17_0 = (Torquing) (Object) stackIn_17_0;
                stackOut_17_1 = stackIn_17_1;
                stackOut_17_2 = 2;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                break L2;
              } else {
                stackOut_16_0 = (Torquing) (Object) stackIn_16_0;
                stackOut_16_1 = stackIn_16_1;
                stackOut_16_2 = 8;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                break L2;
              }
            }
            ((Torquing) (Object) stackIn_18_0).a(stackIn_18_1 != 0, stackIn_18_2, 1, false);
            break L1;
          } else {
            L3: {
              if (((bi) this).field_U == 0) {
                if (ao.field_f == 0) {
                  if (((bi) this).field_L != 0) {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_11_0 = stackOut_8_0;
                    break L3;
                  }
                } else {
                  stackOut_6_0 = 1;
                  stackIn_11_0 = stackOut_6_0;
                  break L3;
                }
              } else {
                stackOut_4_0 = 1;
                stackIn_11_0 = stackOut_4_0;
                break L3;
              }
            }
            L4: {
              var2 = stackIn_11_0;
              stackOut_11_0 = ((bi) this).field_A;
              stackOut_11_1 = 1;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              if (var2 == 0) {
                stackOut_13_0 = (Torquing) (Object) stackIn_13_0;
                stackOut_13_1 = stackIn_13_1;
                stackOut_13_2 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                break L4;
              } else {
                stackOut_12_0 = (Torquing) (Object) stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = 7;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                break L4;
              }
            }
            ((Torquing) (Object) stackIn_14_0).a(stackIn_14_1 != 0, stackIn_14_2, 1, false);
            break L1;
          }
        }
    }

    private final void a(boolean param0, int param1) {
        tl[] var3 = null;
        int var4 = 0;
        tl var5 = null;
        pj var6 = null;
        int var7 = 0;
        tl[] var8 = null;
        var7 = Torquing.field_u;
        var8 = ((bi) this).field_D;
        var3 = var8;
        var4 = 0;
        L0: while (true) {
          L1: {
            if (var4 >= var8.length) {
              break L1;
            } else {
              var5 = var8[var4];
              if (var5 != null) {
                if (31 == var5.field_r) {
                  var6 = var5.d(-2).field_k;
                  gq.a(var6.field_f, 4, param1);
                  gq.a(var6.field_s, 4, param1);
                  gq.a(var6.field_l, 4, param1);
                  break L1;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
          return;
        }
    }

    final static we a(fj param0) {
        RuntimeException var2 = null;
        we stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        we stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = new we(param0.g(65536), param0.g(65536), param0.g(65536), param0.g(65536), param0.e((byte) 62), param0.e((byte) 62), param0.i((byte) -101));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("bi.BA(");
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
          throw rb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 13 + ')');
        }
        return stackIn_1_0;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              int discarded$9 = 45;
              if (qm.a(param1) == null) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("bi.F(").append(83).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(byte param0, int param1) {
        Object var4 = null;
        L0: {
          L1: {
            if (((bi) this).field_T.indexOf("ffffff") != -1) {
              break L1;
            } else {
              if (((bi) this).field_T.indexOf("ff9040") == -1) {
                param1 = param1 * 2;
                break L1;
              } else {
                ((bi) this).field_j = ((bi) this).field_j - param1;
                ((bi) this).field_U = ((bi) this).field_U + param1;
                ((bi) this).field_s = ((bi) this).field_U;
                if (param0 >= 94) {
                  break L0;
                } else {
                  var4 = null;
                  this.a(91, -43, (sg) null, 50);
                  break L0;
                }
              }
            }
          }
          ((bi) this).field_j = ((bi) this).field_j - param1;
          ((bi) this).field_U = ((bi) this).field_U + param1;
          ((bi) this).field_s = ((bi) this).field_U;
          if (param0 >= 94) {
            break L0;
          } else {
            var4 = null;
            this.a(91, -43, (sg) null, 50);
            break L0;
          }
        }
    }

    final void a(int param0, double param1, double param2, sg param3, double param4, int param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((bi) this).field_c < param5) {
                  break L2;
                } else {
                  int fieldTemp$3 = ((bi) this).field_c - 1;
                  ((bi) this).field_c = ((bi) this).field_c - 1;
                  if (fieldTemp$3 >= 0) {
                    break L2;
                  } else {
                    ((bi) this).field_P.a(param5 + 80);
                    this.a(538, 16, param3, ((bi) this).field_P.field_c);
                    th.a(param5 ^ 100, th.field_F[14]);
                    th.a(100, th.field_F[15]);
                    break L1;
                  }
                }
              }
              th.a(100, th.field_F[16]);
              break L1;
            }
            ((bi) this).field_P.a(param1, param4, param5 + 1, param2);
            this.a(538, 0, param3, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("bi.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0) {
        ((bi) this).field_c = ((bi) this).field_c + 1;
        if (param0 != 0) {
            ((bi) this).field_z = -49;
        }
    }

    final void f(int param0) {
        int var2 = 0;
        if (param0 != 1000) {
            ((bi) this).field_G = 31;
        }
        ((bi) this).field_i = tp.field_a;
        ((bi) this).field_c = 0;
        ((bi) this).a((byte) -68, tp.field_a, 1365, 80);
        ((bi) this).field_j = ((bi) this).field_j + ((bi) this).field_U;
        if (!(ri.field_E >= 2)) {
            var2 = ((bi) this).field_G & 63;
            ((bi) this).field_S = ((bi) this).field_S + (((bi) this).field_L - var2) * ((bi) this).field_N;
            ((bi) this).field_G = ((bi) this).field_G + (((bi) this).field_L + -var2);
        }
        ((bi) this).field_U = 0;
        this.h(-116);
    }

    final void b(int param0) {
        int var3 = 0;
        bm var4 = null;
        bm var5 = null;
        L0: {
          L1: {
            var3 = Torquing.field_u;
            if (ri.field_E < 2) {
              break L1;
            } else {
              if (!((bi) this).field_t) {
                break L1;
              } else {
                ((bi) this).field_M = 779830527;
                ((bi) this).field_j = -((bi) this).field_U + 318907172;
                ((bi) this).field_o = 1086213241;
                ((bi) this).field_t = false;
                ((bi) this).field_l = 2121488289;
                if (param0 == 9) {
                  break L0;
                } else {
                  field_f = null;
                  break L0;
                }
              }
            }
          }
          L2: {
            if (0 >= ((bi) this).field_U) {
              break L2;
            } else {
              if (gn.field_l != null) {
                break L2;
              } else {
                if (((bi) this).field_U <= 0) {
                  return;
                } else {
                  if (!je.a((byte) 85)) {
                    L3: {
                      var4 = vl.field_c;
                      var5 = var4;
                      if (var5 == null) {
                        break L3;
                      } else {
                        if (null == var5.field_p) {
                          break L3;
                        } else {
                          int discarded$2 = -17310;
                          if (!bn.a(var4.field_p[1][9])) {
                            break L3;
                          } else {
                            if (var4.field_n[1][9] <= ((bi) this).field_U) {
                              break L3;
                            } else {
                              gn.field_l = new wc(11, 65524, ((bi) this).field_M, ((bi) this).field_o, ((bi) this).field_l, ((bi) this).field_j, new int[1]);
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    int discarded$3 = 65524;
                    gn.field_l = va.a(true, ((bi) this).field_j, ((bi) this).field_M, 11, ((bi) this).field_o, 3, ((bi) this).field_l, new int[1]);
                    vl.field_c = null;
                    if (param0 == 9) {
                      break L0;
                    } else {
                      field_f = null;
                      break L0;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (param0 == 9) {
            break L0;
          } else {
            field_f = null;
            break L0;
          }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        qp var5 = null;
        if (param1 <= 1) {
            Object var6 = null;
            af discarded$0 = bi.a((sm) null, 34);
        }
        int var4 = 1 << param0;
        if (!((var4 & fa.field_b) == 0)) {
            return;
        }
        ao.field_f = ao.field_f | var4;
        fa.field_b = fa.field_b | var4;
        ((bi) this).field_B.a((byte) 54, (q) (Object) new tj(param0));
        if (((bi) this).field_t) {
        } else {
            var5 = new qp(param0, param2, ((bi) this).field_N, ((bi) this).field_S, ((bi) this).field_F, ((bi) this).field_G);
            if (!je.a((byte) 61)) {
                int discarded$2 = 4;
                int discarded$3 = 99;
                wc.a(var5);
            } else {
                jh.field_y.a((byte) 54, (q) (Object) var5);
            }
        }
    }

    final void c(byte param0) {
        if (param0 < 121) {
            ((bi) this).a(-53);
        }
        ((bi) this).field_P.e(66);
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            int var2_int = 0;
            Exception var2 = null;
            RuntimeException var2_ref = null;
            java.net.URL var3 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2_int = 35 % ((param1 - -53) / 50);
                    var3 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                    param0.getAppletContext().showDocument(og.a(var3, param0, (byte) -70), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = (Exception) (Object) decompiledCaughtException;
                    var2.printStackTrace();
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref;
                stackOut_4_1 = new StringBuilder().append("bi.A(");
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw rb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        String var3_ref_String = null;
        int var4 = 0;
        int var5_int = 0;
        t var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        kh var10 = null;
        sb var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        vn stackIn_51_0 = null;
        String stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        vn stackIn_52_0 = null;
        String stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        vn stackIn_53_0 = null;
        String stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        int stackIn_53_4 = 0;
        vn stackOut_50_0 = null;
        String stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        vn stackOut_52_0 = null;
        String stackOut_52_1 = null;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        int stackOut_52_4 = 0;
        vn stackOut_51_0 = null;
        String stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        L0: {
          var8 = Torquing.field_u;
          if (((bi) this).field_c >= 0) {
            break L0;
          } else {
            if (((bi) this).field_c != -2147483648) {
              ph.d(0, 0, ph.field_j, ph.field_d, 16777215);
              ((bi) this).field_c = -2147483648;
              return;
            } else {
              break L0;
            }
          }
        }
        L1: {
          L2: {
            var2 = ((bi) this).field_q - 1;
            if (var2 < 0) {
              break L2;
            } else {
              if (var2 < 8) {
                L3: {
                  if (1 != ((bi) this).field_d.a(false)) {
                    break L3;
                  } else {
                    if (null != hi.field_h[var2]) {
                      hi.field_h[var2].b(0, 0);
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                gm.field_r[var2].b(0, 0);
                break L1;
              } else {
                break L2;
              }
            }
          }
          gm.field_r[7].b(0, 0);
          break L1;
        }
        L4: {
          if (((bi) this).field_K < 0.0) {
            ((bi) this).field_P.a(true, gj.field_i);
            var3 = vf.field_j[((bi) this).field_v][0];
            var4 = vf.field_j[((bi) this).field_v][1];
            var5_int = vf.field_j[((bi) this).field_v][2];
            gj.field_i[1] = gj.field_i[1] + (var4 * gj.field_i[7] + var3 * gj.field_i[4] + var5_int * gj.field_i[10] >> 16);
            gj.field_i[0] = gj.field_i[0] + (gj.field_i[9] * var5_int + (gj.field_i[6] * var4 + var3 * gj.field_i[3]) >> 16);
            gj.field_i[2] = gj.field_i[2] + (gj.field_i[11] * var5_int + (var3 * gj.field_i[5] - -(var4 * gj.field_i[8])) >> 16);
            ((bi) this).field_C.a(((bi) this).field_P.field_c, ((bi) this).field_H, ((bi) this).field_E, -1, -12, 12);
            if (((bi) this).field_J) {
              break L4;
            } else {
              if (((bi) this).field_c < 0) {
                break L4;
              } else {
                ((bi) this).field_P.b(1);
                break L4;
              }
            }
          } else {
            if (ce.field_b) {
              ((bi) this).field_C.a(((bi) this).field_P.field_c, ((bi) this).field_H, ((bi) this).field_E, -1, -12, 12);
              if (((bi) this).field_J) {
                break L4;
              } else {
                if (((bi) this).field_c < 0) {
                  break L4;
                } else {
                  ((bi) this).field_P.b(1);
                  break L4;
                }
              }
            } else {
              ((bi) this).field_C.a(((bi) this).field_P.field_c, ((bi) this).field_H, ((bi) this).field_E, -1, -12, 12);
              if (((bi) this).field_J) {
                break L4;
              } else {
                if (((bi) this).field_c < 0) {
                  break L4;
                } else {
                  ((bi) this).field_P.b(1);
                  break L4;
                }
              }
            }
          }
        }
        var15 = ((bi) this).field_m;
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var9 = var12;
        var3_ref_int__ = var9;
        var4 = 0;
        L5: while (true) {
          if (var15.length <= var4) {
            L6: {
              sg.a(((bi) this).field_C.field_g[((bi) this).field_P.field_c], 80, 1365, -1, -12, 12);
              sg.a(vc.field_c[1], 80, 1365, -1, -12, 12);
              if (!param0) {
                break L6;
              } else {
                ((bi) this).e(14);
                break L6;
              }
            }
            sg.a(vc.field_c[7], 80, 1365, -1, -12, 12);
            var10 = (kh) (Object) on.field_e.c((byte) -122);
            L7: while (true) {
              if (var10 == null) {
                var3 = 9;
                L8: while (true) {
                  if (var3 > 16) {
                    ((bi) this).field_C.a(gj.field_i);
                    var11 = (sb) (Object) ((bi) this).field_e.b(0);
                    L9: while (true) {
                      if (var11 == null) {
                        L10: {
                          if (!ti.field_k) {
                            L11: {
                              bd.field_w.e(-bd.field_w.field_s + 640, 0, 162);
                              var3_ref_String = wh.a(((bi) this).field_k, (byte) -119);
                              if (((bi) this).field_d == ig.field_q) {
                                break L11;
                              } else {
                                dd.field_c.a(var3_ref_String, 628, 23, 16711680, -1);
                                if (10000 <= ((bi) this).field_k) {
                                  break L11;
                                } else {
                                  if (((bi) this).field_J) {
                                    break L11;
                                  } else {
                                    if (((bi) this).field_v == 0) {
                                      dd.field_c.c(var3_ref_String, 344, 262, 16711680, -1);
                                      break L11;
                                    } else {
                                      dd.field_c.c(var3_ref_String, 258, 224, 16711680, -1);
                                      break L11;
                                    }
                                  }
                                }
                              }
                            }
                            L12: {
                              stackOut_50_0 = dd.field_c;
                              stackOut_50_1 = Integer.toString(Math.abs(((bi) this).field_U));
                              stackOut_50_2 = 628;
                              stackOut_50_3 = 67;
                              stackIn_52_0 = stackOut_50_0;
                              stackIn_52_1 = stackOut_50_1;
                              stackIn_52_2 = stackOut_50_2;
                              stackIn_52_3 = stackOut_50_3;
                              stackIn_51_0 = stackOut_50_0;
                              stackIn_51_1 = stackOut_50_1;
                              stackIn_51_2 = stackOut_50_2;
                              stackIn_51_3 = stackOut_50_3;
                              if (!((bi) this).field_t) {
                                stackOut_52_0 = (vn) (Object) stackIn_52_0;
                                stackOut_52_1 = (String) (Object) stackIn_52_1;
                                stackOut_52_2 = stackIn_52_2;
                                stackOut_52_3 = stackIn_52_3;
                                stackOut_52_4 = 16711680;
                                stackIn_53_0 = stackOut_52_0;
                                stackIn_53_1 = stackOut_52_1;
                                stackIn_53_2 = stackOut_52_2;
                                stackIn_53_3 = stackOut_52_3;
                                stackIn_53_4 = stackOut_52_4;
                                break L12;
                              } else {
                                stackOut_51_0 = (vn) (Object) stackIn_51_0;
                                stackOut_51_1 = (String) (Object) stackIn_51_1;
                                stackOut_51_2 = stackIn_51_2;
                                stackOut_51_3 = stackIn_51_3;
                                stackOut_51_4 = 16776960;
                                stackIn_53_0 = stackOut_51_0;
                                stackIn_53_1 = stackOut_51_1;
                                stackIn_53_2 = stackOut_51_2;
                                stackIn_53_3 = stackOut_51_3;
                                stackIn_53_4 = stackOut_51_4;
                                break L12;
                              }
                            }
                            ((vn) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_53_2, stackIn_53_3, stackIn_53_4, -1);
                            var4 = 0;
                            var5_int = 528;
                            L13: while (true) {
                              if (8 <= var4) {
                                var4 = 0;
                                L14: while (true) {
                                  if (((bi) this).field_c <= var4) {
                                    if (!((bi) this).field_w) {
                                      dd.field_c.b(((bi) this).field_T, 538, 102, 16711680, -1);
                                      if (((bi) this).field_r <= 0) {
                                        break L10;
                                      } else {
                                        var3 = (((bi) this).field_r - 1) / 1000;
                                        var4 = -(1000 * var3) + ((bi) this).field_r;
                                        var5 = hq.field_h[var3];
                                        var6 = var4 * var5.field_s / 1000;
                                        var7 = var5.field_t * var4 / 1000;
                                        var5.b((-var6 + 640) / 2, (480 - var7) / 2, var6, var7);
                                        break L10;
                                      }
                                    } else {
                                      ia.field_f.d(553, 143);
                                      dd.field_c.b(((bi) this).field_T, 538, 102, 16711680, -1);
                                      if (((bi) this).field_r <= 0) {
                                        break L10;
                                      } else {
                                        var3 = (((bi) this).field_r - 1) / 1000;
                                        var4 = -(1000 * var3) + ((bi) this).field_r;
                                        var5 = hq.field_h[var3];
                                        var6 = var4 * var5.field_s / 1000;
                                        var7 = var5.field_t * var4 / 1000;
                                        var5.b((-var6 + 640) / 2, (480 - var7) / 2, var6, var7);
                                        break L10;
                                      }
                                    }
                                  } else {
                                    kk.field_n.d(583 - -(var4 * 8), 143);
                                    var4++;
                                    continue L14;
                                  }
                                }
                              } else {
                                L15: {
                                  L16: {
                                    if ((dd.field_d >> var4 & 1) != 0) {
                                      break L16;
                                    } else {
                                      L17: {
                                        if ((1 & ((bi) this).field_z >> var4) == 0) {
                                          break L17;
                                        } else {
                                          if (((bi) this).field_k % 1000 >= 500) {
                                            break L17;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      ph.b(var5_int, 118, ue.field_c[var4].field_w, ue.field_c[var4].field_u, 16777215, 118);
                                      ue.field_c[var4 + 8].e(var5_int, 118, 81);
                                      break L15;
                                    }
                                  }
                                  ue.field_c[var4].e(var5_int, 118, 162);
                                  break L15;
                                }
                                var5_int = var5_int + ue.field_c[var4].field_w;
                                var4++;
                                continue L13;
                              }
                            }
                          } else {
                            if (((bi) this).field_r <= 0) {
                              break L10;
                            } else {
                              var3 = (((bi) this).field_r - 1) / 1000;
                              var4 = -(1000 * var3) + ((bi) this).field_r;
                              var5 = hq.field_h[var3];
                              var6 = var4 * var5.field_s / 1000;
                              var7 = var5.field_t * var4 / 1000;
                              var5.b((-var6 + 640) / 2, (480 - var7) / 2, var6, var7);
                              break L10;
                            }
                          }
                        }
                        return;
                      } else {
                        var11.c(-103);
                        var11 = (sb) (Object) ((bi) this).field_e.f(-24059);
                        continue L9;
                      }
                    }
                  } else {
                    sg discarded$1 = ((bi) this).field_C;
                    sg.a(vc.field_c[var3], 80, 1365, -1, -12, 12);
                    var3++;
                    continue L8;
                  }
                }
              } else {
                sg.a(var10, 80, 1365, -1, -12, 12);
                var10 = (kh) (Object) on.field_e.b((byte) -110);
                continue L7;
              }
            }
          } else {
            var5_int = var15[var4];
            if (null != ((bi) this).field_D[var5_int]) {
              ((bi) this).field_D[var5_int].b(1);
              ((bi) this).field_C.a(((bi) this).field_D[var5_int].field_c, 80, 1365, -1, -12, 12);
              var4++;
              continue L5;
            } else {
              var4++;
              continue L5;
            }
          }
        }
    }

    final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        double[] var7 = null;
        int var8 = 0;
        pj var8_ref_pj = null;
        int var9_int = 0;
        Object var9 = null;
        double var9_double = 0.0;
        int var10 = 0;
        short[] var10_ref_short__ = null;
        double var10_double = 0.0;
        int var11_int = 0;
        tl var11 = null;
        double var12_double = 0.0;
        kg var12 = null;
        tl var14 = null;
        double var14_double = 0.0;
        ed var16 = null;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        Object var22 = null;
        Object var23 = null;
        short[] var24 = null;
        ed var25 = null;
        double[] var26 = null;
        kg[] var29 = null;
        short[] var30 = null;
        double[] var31 = null;
        short[] var34 = null;
        double[] var35 = null;
        short[] var38 = null;
        double[] var39 = null;
        double[] var40 = null;
        int[] var41 = null;
        kh var42 = null;
        sb var43 = null;
        int stackIn_87_0 = 0;
        double stackIn_140_0 = 0.0;
        vg stackIn_147_0 = null;
        double[] stackIn_147_1 = null;
        int stackIn_147_2 = 0;
        double stackIn_147_3 = 0.0;
        int stackIn_147_4 = 0;
        int stackIn_147_5 = 0;
        vg stackIn_148_0 = null;
        double[] stackIn_148_1 = null;
        int stackIn_148_2 = 0;
        double stackIn_148_3 = 0.0;
        int stackIn_148_4 = 0;
        int stackIn_148_5 = 0;
        vg stackIn_149_0 = null;
        double[] stackIn_149_1 = null;
        int stackIn_149_2 = 0;
        double stackIn_149_3 = 0.0;
        int stackIn_149_4 = 0;
        int stackIn_149_5 = 0;
        int stackIn_149_6 = 0;
        int stackIn_161_0 = 0;
        Torquing stackIn_215_0 = null;
        int stackIn_215_1 = 0;
        Torquing stackIn_216_0 = null;
        int stackIn_216_1 = 0;
        Torquing stackIn_217_0 = null;
        int stackIn_217_1 = 0;
        int stackIn_217_2 = 0;
        int stackIn_224_0 = 0;
        Torquing stackIn_225_0 = null;
        int stackIn_225_1 = 0;
        Torquing stackIn_226_0 = null;
        int stackIn_226_1 = 0;
        Torquing stackIn_227_0 = null;
        int stackIn_227_1 = 0;
        int stackIn_227_2 = 0;
        vg stackOut_146_0 = null;
        double[] stackOut_146_1 = null;
        int stackOut_146_2 = 0;
        double stackOut_146_3 = 0.0;
        int stackOut_146_4 = 0;
        int stackOut_146_5 = 0;
        vg stackOut_148_0 = null;
        double[] stackOut_148_1 = null;
        int stackOut_148_2 = 0;
        double stackOut_148_3 = 0.0;
        int stackOut_148_4 = 0;
        int stackOut_148_5 = 0;
        int stackOut_148_6 = 0;
        vg stackOut_147_0 = null;
        double[] stackOut_147_1 = null;
        int stackOut_147_2 = 0;
        double stackOut_147_3 = 0.0;
        int stackOut_147_4 = 0;
        int stackOut_147_5 = 0;
        int stackOut_147_6 = 0;
        int stackOut_160_0 = 0;
        int stackOut_159_0 = 0;
        double stackOut_139_0 = 0.0;
        double stackOut_138_0 = 0.0;
        double stackOut_137_0 = 0.0;
        int stackOut_223_0 = 0;
        int stackOut_222_0 = 0;
        Torquing stackOut_224_0 = null;
        int stackOut_224_1 = 0;
        Torquing stackOut_226_0 = null;
        int stackOut_226_1 = 0;
        int stackOut_226_2 = 0;
        Torquing stackOut_225_0 = null;
        int stackOut_225_1 = 0;
        int stackOut_225_2 = 0;
        Torquing stackOut_214_0 = null;
        int stackOut_214_1 = 0;
        Torquing stackOut_216_0 = null;
        int stackOut_216_1 = 0;
        int stackOut_216_2 = 0;
        Torquing stackOut_215_0 = null;
        int stackOut_215_1 = 0;
        int stackOut_215_2 = 0;
        int stackOut_86_0 = 0;
        int stackOut_85_0 = 0;
        L0: {
          var22 = null;
          var23 = null;
          var21 = Torquing.field_u;
          if (jb.a(110)) {
            break L0;
          } else {
            if (((bi) this).field_J) {
              break L0;
            } else {
              np.a(la.field_k[((bi) this).field_q], false, 124);
              break L0;
            }
          }
        }
        L1: {
          ((bi) this).field_j = ((bi) this).field_j + 1;
          ((bi) this).field_F = ((bi) this).field_F - ((bi) this).field_M;
          ((bi) this).field_S = ((bi) this).field_S + ((bi) this).field_M;
          ((bi) this).field_l = ((bi) this).field_l + 1;
          ((bi) this).field_s = ((bi) this).field_U;
          if (ri.field_E < 2) {
            break L1;
          } else {
            if (!ce.field_b) {
              break L1;
            } else {
              ko.field_b = false;
              break L1;
            }
          }
        }
        var2 = 0;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        L2: while (true) {
          int discarded$2 = -85;
          if (!ak.c()) {
            var7_int = ((bi) this).field_a[0];
            var8 = be.field_o[var7_int * 32 & 2047];
            var9_int = be.field_l[32 * var7_int & 2047];
            ((bi) this).field_a[0] = 0;
            ((bi) this).field_a[11] = var8;
            ((bi) this).field_a[3] = var8;
            ((bi) this).field_a[9] = var9_int;
            ((bi) this).field_a[5] = -var9_int;
            ((bi) this).field_P.field_h.a(vc.field_c[1], ((bi) this).field_a);
            var42 = (kh) (Object) on.field_e.c((byte) -119);
            L3: while (true) {
              if (var42 == null) {
                var10 = 9;
                L4: while (true) {
                  if (var10 > 16) {
                    L5: {
                      ((bi) this).field_a[0] = 1 + var7_int;
                      if (0 != (7 & var7_int)) {
                        break L5;
                      } else {
                        var38 = vc.field_c[9].field_l.field_m;
                        var34 = var38;
                        var30 = var34;
                        var24 = var30;
                        var10_ref_short__ = var24;
                        var11_int = (short)(65535 & var38[0] - -1024);
                        dk.a(var10_ref_short__, 0, var38.length, (short) var11_int);
                        ((bi) this).field_M = ((bi) this).field_M ^ var11_int << 3;
                        ((bi) this).field_o = ((bi) this).field_o ^ var11_int << 3;
                        break L5;
                      }
                    }
                    this.a(false, var7_int);
                    var43 = (sb) (Object) ((bi) this).field_e.b(0);
                    L6: while (true) {
                      if (var43 == null) {
                        if (var2 != 0) {
                          ((bi) this).field_A.a(true, 1, 2, false);
                          return;
                        } else {
                          L7: {
                            if (ri.field_E < 2) {
                              break L7;
                            } else {
                              if (!ce.field_b) {
                                break L7;
                              } else {
                                if (ko.field_b) {
                                  break L7;
                                } else {
                                  return;
                                }
                              }
                            }
                          }
                          if (((bi) this).field_r > 0) {
                            L8: {
                              if (((bi) this).field_r != 1000) {
                                if (((bi) this).field_r == 2000) {
                                  th.a(100, th.field_F[3]);
                                  break L8;
                                } else {
                                  if (((bi) this).field_r == 3000) {
                                    th.a(100, th.field_F[2]);
                                    break L8;
                                  } else {
                                    if (((bi) this).field_r > 20) {
                                      break L8;
                                    } else {
                                      qj.a(((bi) this).field_r, -5205, 96, th.field_F[5]);
                                      break L8;
                                    }
                                  }
                                }
                              } else {
                                th.a(100, th.field_F[4]);
                                break L8;
                              }
                            }
                            ((bi) this).field_r = ((bi) this).field_r - 20;
                            return;
                          } else {
                            L9: {
                              if (((bi) this).field_x <= 0) {
                                break L9;
                              } else {
                                if (((bi) this).field_x >= 512) {
                                  break L9;
                                } else {
                                  var25 = ql.field_u;
                                  ((bi) this).field_x = Math.min(512, ((bi) this).field_x + 10);
                                  bc.field_a.a(true);
                                  var25.a(0.0, 0.0, 1.0, (byte) 51, 3.141592653589793 * (double)(il.field_m[((bi) this).field_v][2] * 2) / 2048.0);
                                  bc.field_a.a(var25, 65536);
                                  var25.a(1.0, 0.0, 0.0, (byte) 54, 3.141592653589793 * (double)(2 * il.field_m[((bi) this).field_v][0]) / 2048.0);
                                  bc.field_a.a(var25, 65536);
                                  var25.a(0.0, 1.0, 0.0, (byte) 63, (double)(il.field_m[((bi) this).field_v][1] * 2) * 3.141592653589793 / 2048.0);
                                  bc.field_a.a(var25, 65536);
                                  var25.a(0.0, 0.0, 1.0, (byte) 87, 3.141592653589793 * (double)(2 * -((bi) this).field_x) / 2048.0);
                                  bc.field_a.a(var25, 65536);
                                  bc.field_a.a(gj.field_i, (byte) 113);
                                  re.field_d[0] = 80.0 * (double)be.field_l[((bi) this).field_x] / 65535.0;
                                  re.field_d[1] = (double)be.field_o[((bi) this).field_x] * 80.0 / 65535.0;
                                  ((bi) this).field_h = Double.NEGATIVE_INFINITY;
                                  var8_ref_pj = ((bi) this).field_d.a(-100, false).field_k;
                                  var9_int = -1 + var8_ref_pj.field_k;
                                  L10: while (true) {
                                    if (var9_int < 0) {
                                      break L9;
                                    } else {
                                      ((bi) this).field_h = Math.max(((bi) this).field_h, re.field_d[1] * (double)var8_ref_pj.field_y[var9_int] + (1000.0 + (double)var8_ref_pj.field_j[var9_int] * re.field_d[0]) + (double)var8_ref_pj.field_v[var9_int] * re.field_d[2]);
                                      var9_int--;
                                      continue L10;
                                    }
                                  }
                                }
                              }
                            }
                            L11: {
                              L12: {
                                var3 = Math.min(Math.max(var3, -10), 10);
                                var7 = new double[3];
                                var7[0] = 2670.0 * (double)(be.field_o[((bi) this).field_x] * var3) / 65535.0;
                                var7[1] = 2670.0 * (double)(-be.field_l[((bi) this).field_x] * var3) / 65535.0;
                                var7[2] = (double)Math.min(Math.max(var4, -10), 10) * 2670.0;
                                if (((bi) this).field_c < 0) {
                                  break L12;
                                } else {
                                  if (mm.field_h) {
                                    break L12;
                                  } else {
                                    if (!((bi) this).field_J) {
                                      L13: {
                                        stackOut_146_0 = ((bi) this).field_P;
                                        stackOut_146_1 = (double[]) var7;
                                        stackOut_146_2 = var5;
                                        stackOut_146_3 = 0.08;
                                        stackOut_146_4 = var6;
                                        stackOut_146_5 = 0;
                                        stackIn_148_0 = stackOut_146_0;
                                        stackIn_148_1 = stackOut_146_1;
                                        stackIn_148_2 = stackOut_146_2;
                                        stackIn_148_3 = stackOut_146_3;
                                        stackIn_148_4 = stackOut_146_4;
                                        stackIn_148_5 = stackOut_146_5;
                                        stackIn_147_0 = stackOut_146_0;
                                        stackIn_147_1 = stackOut_146_1;
                                        stackIn_147_2 = stackOut_146_2;
                                        stackIn_147_3 = stackOut_146_3;
                                        stackIn_147_4 = stackOut_146_4;
                                        stackIn_147_5 = stackOut_146_5;
                                        if (((bi) this).field_d != ig.field_q) {
                                          stackOut_148_0 = (vg) (Object) stackIn_148_0;
                                          stackOut_148_1 = (double[]) (Object) stackIn_148_1;
                                          stackOut_148_2 = stackIn_148_2;
                                          stackOut_148_3 = stackIn_148_3;
                                          stackOut_148_4 = stackIn_148_4;
                                          stackOut_148_5 = stackIn_148_5;
                                          stackOut_148_6 = 0;
                                          stackIn_149_0 = stackOut_148_0;
                                          stackIn_149_1 = stackOut_148_1;
                                          stackIn_149_2 = stackOut_148_2;
                                          stackIn_149_3 = stackOut_148_3;
                                          stackIn_149_4 = stackOut_148_4;
                                          stackIn_149_5 = stackOut_148_5;
                                          stackIn_149_6 = stackOut_148_6;
                                          break L13;
                                        } else {
                                          stackOut_147_0 = (vg) (Object) stackIn_147_0;
                                          stackOut_147_1 = (double[]) (Object) stackIn_147_1;
                                          stackOut_147_2 = stackIn_147_2;
                                          stackOut_147_3 = stackIn_147_3;
                                          stackOut_147_4 = stackIn_147_4;
                                          stackOut_147_5 = stackIn_147_5;
                                          stackOut_147_6 = 1;
                                          stackIn_149_0 = stackOut_147_0;
                                          stackIn_149_1 = stackOut_147_1;
                                          stackIn_149_2 = stackOut_147_2;
                                          stackIn_149_3 = stackOut_147_3;
                                          stackIn_149_4 = stackOut_147_4;
                                          stackIn_149_5 = stackOut_147_5;
                                          stackIn_149_6 = stackOut_147_6;
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        var9_double = ((vg) (Object) stackIn_149_0).a(stackIn_149_1, stackIn_149_2 != 0, stackIn_149_3, stackIn_149_4 != 0, stackIn_149_5, stackIn_149_6 != 0);
                                        if (!((bi) this).field_y) {
                                          break L14;
                                        } else {
                                          if (((bi) this).field_P.field_g[2] > 1400.0) {
                                            break L14;
                                          } else {
                                            if (0.0 <= ((bi) this).field_P.field_g[5]) {
                                              this.a(14, (byte) 127, 241);
                                              break L14;
                                            } else {
                                              break L14;
                                            }
                                          }
                                        }
                                      }
                                      L15: {
                                        if (var9_double <= ((bi) this).field_h) {
                                          break L15;
                                        } else {
                                          if (-1.0 == ((bi) this).field_K) {
                                            ((bi) this).field_K = 0.08 * ((bi) this).field_P.field_g[4];
                                            th.a(100, th.field_F[22]);
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      L16: {
                                        if (var9_double >= 100000.0 + ((bi) this).field_h) {
                                          stackOut_160_0 = 0;
                                          stackIn_161_0 = stackOut_160_0;
                                          break L16;
                                        } else {
                                          stackOut_159_0 = 1;
                                          stackIn_161_0 = stackOut_159_0;
                                          break L16;
                                        }
                                      }
                                      var8 = stackIn_161_0;
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                              L17: {
                                if (!mm.field_h) {
                                  break L17;
                                } else {
                                  ((bi) this).field_P.c(0);
                                  break L17;
                                }
                              }
                              var8 = 1;
                              if (!((bi) this).field_J) {
                                break L11;
                              } else {
                                var39 = new double[4];
                                var35 = var39;
                                var31 = var35;
                                var26 = var31;
                                var9 = (Object) (Object) var26;
                                ap.a(((bi) this).field_P.field_g, 6, ((bi) this).field_P.field_g, 10, (double[]) var9, 0, 0.08);
                                var10 = 0;
                                L18: while (true) {
                                  if (var10 >= 4) {
                                    var10 = 0;
                                    L19: while (true) {
                                      if (var10 >= 3) {
                                        L20: {
                                          var10_double = 0.1;
                                          var12_double = ((bi) this).field_P.field_g[8];
                                          if (var12_double >= 1.0) {
                                            stackOut_139_0 = 0.0;
                                            stackIn_140_0 = stackOut_139_0;
                                            break L20;
                                          } else {
                                            if (-1.0 < var12_double) {
                                              stackOut_138_0 = Math.acos(var12_double);
                                              stackIn_140_0 = stackOut_138_0;
                                              break L20;
                                            } else {
                                              stackOut_137_0 = 3.141592653589793;
                                              stackIn_140_0 = stackOut_137_0;
                                              break L20;
                                            }
                                          }
                                        }
                                        L21: {
                                          L22: {
                                            var14_double = stackIn_140_0;
                                            var16 = ql.field_u;
                                            if (0.0001 > var14_double) {
                                              break L22;
                                            } else {
                                              if (3.141492653589793 >= var14_double) {
                                                var17 = Math.sin((-var10_double + 1.0) * var14_double);
                                                var19 = Math.sin(var14_double * var10_double);
                                                break L21;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          var19 = var10_double;
                                          var17 = 1.0 - var10_double;
                                          break L21;
                                        }
                                        var16.field_b = var19 + var17 * ((bi) this).field_P.field_g[8];
                                        var16.field_d = ((bi) this).field_P.field_g[7] * var17;
                                        var16.field_a = var17 * ((bi) this).field_P.field_g[6];
                                        var16.field_e = ((bi) this).field_P.field_g[9] * var17;
                                        var16.a((byte) -123);
                                        ((bi) this).field_P.field_g[8] = var16.field_b;
                                        ((bi) this).field_P.field_g[6] = var16.field_a;
                                        ((bi) this).field_P.field_g[7] = var16.field_d;
                                        ((bi) this).field_P.field_g[9] = var16.field_e;
                                        ((bi) this).field_P.c(0);
                                        ((bi) this).field_P.field_h.a(((bi) this).field_P.field_h.field_g[((bi) this).field_P.field_c], ((bi) this).field_P.field_f);
                                        break L11;
                                      } else {
                                        ((bi) this).field_P.field_g[10 - -var10] = ((bi) this).field_P.field_g[10 - -var10] * 0.8;
                                        var10++;
                                        continue L19;
                                      }
                                    }
                                  } else {
                                    ((bi) this).field_P.field_g[var10 + 6] = ((bi) this).field_P.field_g[var10 + 6] + var39[var10];
                                    var10++;
                                    continue L18;
                                  }
                                }
                              }
                            }
                            L23: {
                              if (ig.field_q == ((bi) this).field_d) {
                                var40 = ((bi) this).field_d.f(14);
                                ((bi) this).field_P.field_g[0] = var40[0];
                                ((bi) this).field_P.field_g[2] = var40[2];
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            var41 = ((bi) this).field_m;
                            var10 = 0;
                            L24: while (true) {
                              if (~var41.length >= ~var10) {
                                if (param0 > 35) {
                                  var9_int = 0;
                                  L25: while (true) {
                                    if (~((bi) this).field_Q.length >= ~var9_int) {
                                      L26: {
                                        if (!((bi) this).field_J) {
                                          ((bi) this).field_k = ((bi) this).field_k - 20;
                                          if (((bi) this).field_d == ig.field_q) {
                                            break L26;
                                          } else {
                                            if (10000 < ((bi) this).field_k) {
                                              break L26;
                                            } else {
                                              if (0 >= ((bi) this).field_k) {
                                                break L26;
                                              } else {
                                                if ((20 + (((bi) this).field_k + -1)) % 1000 >= 20) {
                                                  break L26;
                                                } else {
                                                  th.a(100, th.field_F[20]);
                                                  break L26;
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          break L26;
                                        }
                                      }
                                      L27: {
                                        if (!((bi) this).field_J) {
                                          L28: {
                                            if (ig.field_q == ((bi) this).field_d) {
                                              break L28;
                                            } else {
                                              if (0 < ((bi) this).field_k) {
                                                break L28;
                                              } else {
                                                if (((bi) this).field_k <= -20) {
                                                  break L28;
                                                } else {
                                                  this.b(12, 1);
                                                  th.a(100, th.field_F[21]);
                                                  break L27;
                                                }
                                              }
                                            }
                                          }
                                          if (var8 != 0) {
                                            if (((bi) this).field_c < 0) {
                                              var9_int = 1;
                                              var29 = ((bi) this).field_Q;
                                              var11_int = 0;
                                              L29: while (true) {
                                                if (~var29.length >= ~var11_int) {
                                                  if (var9_int != 0) {
                                                    this.b(12, 2);
                                                    break L27;
                                                  } else {
                                                    break L27;
                                                  }
                                                } else {
                                                  L30: {
                                                    var12 = var29[var11_int];
                                                    if (var12 == null) {
                                                      break L30;
                                                    } else {
                                                      var9_int = 0;
                                                      break L30;
                                                    }
                                                  }
                                                  var11_int++;
                                                  continue L29;
                                                }
                                              }
                                            } else {
                                              if (0 <= ((bi) this).field_k) {
                                                break L27;
                                              } else {
                                                ((bi) this).b(9);
                                                ((bi) this).field_g = true;
                                                if (je.a((byte) 69)) {
                                                  L31: {
                                                    L32: {
                                                      if (((bi) this).field_U != 0) {
                                                        break L32;
                                                      } else {
                                                        if (ao.field_f != 0) {
                                                          break L32;
                                                        } else {
                                                          if (((bi) this).field_L == 0) {
                                                            stackOut_223_0 = 0;
                                                            stackIn_224_0 = stackOut_223_0;
                                                            break L31;
                                                          } else {
                                                            break L32;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    stackOut_222_0 = 1;
                                                    stackIn_224_0 = stackOut_222_0;
                                                    break L31;
                                                  }
                                                  L33: {
                                                    var9_int = stackIn_224_0;
                                                    stackOut_224_0 = ((bi) this).field_A;
                                                    stackOut_224_1 = 1;
                                                    stackIn_226_0 = stackOut_224_0;
                                                    stackIn_226_1 = stackOut_224_1;
                                                    stackIn_225_0 = stackOut_224_0;
                                                    stackIn_225_1 = stackOut_224_1;
                                                    if (var9_int == 0) {
                                                      stackOut_226_0 = (Torquing) (Object) stackIn_226_0;
                                                      stackOut_226_1 = stackIn_226_1;
                                                      stackOut_226_2 = 0;
                                                      stackIn_227_0 = stackOut_226_0;
                                                      stackIn_227_1 = stackOut_226_1;
                                                      stackIn_227_2 = stackOut_226_2;
                                                      break L33;
                                                    } else {
                                                      stackOut_225_0 = (Torquing) (Object) stackIn_225_0;
                                                      stackOut_225_1 = stackIn_225_1;
                                                      stackOut_225_2 = 7;
                                                      stackIn_227_0 = stackOut_225_0;
                                                      stackIn_227_1 = stackOut_225_1;
                                                      stackIn_227_2 = stackOut_225_2;
                                                      break L33;
                                                    }
                                                  }
                                                  ((Torquing) (Object) stackIn_227_0).a(stackIn_227_1 != 0, stackIn_227_2, 2, false);
                                                  break L27;
                                                } else {
                                                  L34: {
                                                    stackOut_214_0 = ((bi) this).field_A;
                                                    stackOut_214_1 = 1;
                                                    stackIn_216_0 = stackOut_214_0;
                                                    stackIn_216_1 = stackOut_214_1;
                                                    stackIn_215_0 = stackOut_214_0;
                                                    stackIn_215_1 = stackOut_214_1;
                                                    if (0 != ao.field_f) {
                                                      stackOut_216_0 = (Torquing) (Object) stackIn_216_0;
                                                      stackOut_216_1 = stackIn_216_1;
                                                      stackOut_216_2 = 8;
                                                      stackIn_217_0 = stackOut_216_0;
                                                      stackIn_217_1 = stackOut_216_1;
                                                      stackIn_217_2 = stackOut_216_2;
                                                      break L34;
                                                    } else {
                                                      stackOut_215_0 = (Torquing) (Object) stackIn_215_0;
                                                      stackOut_215_1 = stackIn_215_1;
                                                      stackOut_215_2 = 2;
                                                      stackIn_217_0 = stackOut_215_0;
                                                      stackIn_217_1 = stackOut_215_1;
                                                      stackIn_217_2 = stackOut_215_2;
                                                      break L34;
                                                    }
                                                  }
                                                  ((Torquing) (Object) stackIn_217_0).a(stackIn_217_1 != 0, stackIn_217_2, 2, false);
                                                  break L27;
                                                }
                                              }
                                            }
                                          } else {
                                            this.b(12, 0);
                                            break L27;
                                          }
                                        } else {
                                          if (((bi) this).field_k <= 0) {
                                            L35: {
                                              if (((bi) this).field_d.field_m == null) {
                                                break L35;
                                              } else {
                                                if (~wi.field_a[((bi) this).field_L - -1] == ~wi.field_a[((bi) this).field_L]) {
                                                  ((bi) this).field_A.a(true, ((bi) this).field_L + 1, 6, false);
                                                  break L27;
                                                } else {
                                                  break L35;
                                                }
                                              }
                                            }
                                            ((bi) this).field_A.a(true, wi.field_a[((bi) this).field_L], 8, false);
                                            break L27;
                                          } else {
                                            L36: {
                                              var9_int = 300;
                                              if (((bi) this).field_k < var9_int) {
                                                var9_int = ((bi) this).field_k;
                                                break L36;
                                              } else {
                                                break L36;
                                              }
                                            }
                                            ((bi) this).field_k = ((bi) this).field_k - var9_int;
                                            ((bi) this).a((byte) 115, (1 + ((bi) this).field_d.field_s) * var9_int / 100);
                                            break L27;
                                          }
                                        }
                                      }
                                      L37: {
                                        if (((bi) this).field_g) {
                                          break L37;
                                        } else {
                                          if (((bi) this).field_J) {
                                            break L37;
                                          } else {
                                            var9 = null;
                                            var10 = 0;
                                            L38: while (true) {
                                              if (~var10 <= ~((bi) this).field_D.length) {
                                                L39: while (true) {
                                                  if (var9 == null) {
                                                    break L37;
                                                  } else {
                                                    ((tl) var9).a((bi) this, 19);
                                                    var9 = (Object) (Object) ((tl) var9).field_t;
                                                    continue L39;
                                                  }
                                                }
                                              } else {
                                                L40: {
                                                  var11 = ((bi) this).field_D[var10];
                                                  if (var11 == null) {
                                                    break L40;
                                                  } else {
                                                    if (var11.field_r == 3) {
                                                      break L40;
                                                    } else {
                                                      L41: {
                                                        if (var11.field_r < 25) {
                                                          break L41;
                                                        } else {
                                                          if (var11.field_r > 31) {
                                                            break L41;
                                                          } else {
                                                            break L40;
                                                          }
                                                        }
                                                      }
                                                      if (!var11.a(0, ((bi) this).field_P.field_g)) {
                                                        break L40;
                                                      } else {
                                                        var11.field_t = (tl) var9;
                                                        var9 = (Object) (Object) var11;
                                                        var11.a(80);
                                                        ((bi) this).field_D[var10] = null;
                                                        break L40;
                                                      }
                                                    }
                                                  }
                                                }
                                                var10++;
                                                continue L38;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L42: {
                                        if (jb.field_d != 10) {
                                          break L42;
                                        } else {
                                          if (la.field_k[10].e(17)) {
                                            break L42;
                                          } else {
                                            np.a(la.field_k[((bi) this).field_q], false, 127);
                                            break L42;
                                          }
                                        }
                                      }
                                      return;
                                    } else {
                                      L43: {
                                        if (((bi) this).field_Q[var9_int] == null) {
                                          break L43;
                                        } else {
                                          ((bi) this).field_Q[var9_int].a(true);
                                          if (((bi) this).field_Q[var9_int].field_a == null) {
                                            ((bi) this).field_Q[var9_int] = null;
                                            break L43;
                                          } else {
                                            break L43;
                                          }
                                        }
                                      }
                                      var9_int++;
                                      continue L25;
                                    }
                                  }
                                } else {
                                  return;
                                }
                              } else {
                                L44: {
                                  var11_int = var41[var10];
                                  if (((bi) this).field_D[var11_int] == null) {
                                    break L44;
                                  } else {
                                    var12_double = ((bi) this).field_D[var11_int].a(0, 0.08);
                                    if (var12_double > ((bi) this).field_h + 100000.0) {
                                      L45: {
                                        var14 = ((bi) this).field_D[var11_int];
                                        this.a(538, 0, var14.field_h, var14.field_c);
                                        if (null == ig.field_r[13]) {
                                          ig.field_r[13] = nj.a(th.field_F[13], 100, 96);
                                          break L45;
                                        } else {
                                          break L45;
                                        }
                                      }
                                      L46: {
                                        if (!ig.field_r[13].e(17)) {
                                          ig.field_r[13].c(0);
                                          ni.a(ig.field_r[13], true);
                                          break L46;
                                        } else {
                                          break L46;
                                        }
                                      }
                                      ((bi) this).field_D[var11_int] = null;
                                      break L44;
                                    } else {
                                      break L44;
                                    }
                                  }
                                }
                                var10++;
                                continue L24;
                              }
                            }
                          }
                        }
                      } else {
                        var43.a((byte) -114);
                        var43 = (sb) (Object) ((bi) this).field_e.f(-24059);
                        continue L6;
                      }
                    }
                  } else {
                    ((bi) this).field_P.field_h.a(vc.field_c[var10], ((bi) this).field_a);
                    var10++;
                    continue L4;
                  }
                }
              } else {
                ((bi) this).field_P.field_h.a(var42, ((bi) this).field_a);
                var42 = (kh) (Object) on.field_e.b((byte) 72);
                continue L3;
              }
            }
          } else {
            L47: {
              var7_int = po.field_z;
              if (var7_int != 98) {
                if (var7_int != 99) {
                  if (var7_int == 96) {
                    var4++;
                    ((bi) this).field_y = false;
                    if (mm.field_h) {
                      ((bi) this).field_P.field_g[0] = ((bi) this).field_P.field_g[0] - 10.0;
                      ((bi) this).field_M = ((bi) this).field_M + 4;
                      break L47;
                    } else {
                      break L47;
                    }
                  } else {
                    if (97 == var7_int) {
                      ((bi) this).field_y = false;
                      var4--;
                      if (mm.field_h) {
                        ((bi) this).field_M = ((bi) this).field_M + 8;
                        ((bi) this).field_P.field_g[0] = ((bi) this).field_P.field_g[0] + 10.0;
                        break L47;
                      } else {
                        break L47;
                      }
                    } else {
                      if (var7_int != 102) {
                        if (var7_int != 104) {
                          if (var7_int != 105) {
                            if (103 != var7_int) {
                              if (42 == var7_int) {
                                if (!mm.field_h) {
                                  break L47;
                                } else {
                                  ((bi) this).field_M = ((bi) this).field_M + 16;
                                  ((bi) this).field_P.field_g[1] = ((bi) this).field_P.field_g[1] + 10.0;
                                  break L47;
                                }
                              } else {
                                if (var7_int != 43) {
                                  L48: {
                                    if (var7_int == 100) {
                                      break L48;
                                    } else {
                                      if (var7_int == 82) {
                                        break L48;
                                      } else {
                                        L49: {
                                          if (84 != var7_int) {
                                            if (var7_int != 83) {
                                              if (var7_int == 13) {
                                                var2 = 1;
                                                break L47;
                                              } else {
                                                break L47;
                                              }
                                            } else {
                                              break L49;
                                            }
                                          } else {
                                            break L49;
                                          }
                                        }
                                        var5 = 1;
                                        break L47;
                                      }
                                    }
                                  }
                                  if (!((bi) this).field_w) {
                                    break L47;
                                  } else {
                                    var6 = 1;
                                    break L47;
                                  }
                                } else {
                                  if (mm.field_h) {
                                    ((bi) this).field_P.field_g[1] = ((bi) this).field_P.field_g[1] - 10.0;
                                    ((bi) this).field_M = ((bi) this).field_M + 32;
                                    break L47;
                                  } else {
                                    break L47;
                                  }
                                }
                              }
                            } else {
                              var4++;
                              ((bi) this).field_y = false;
                              var3--;
                              break L47;
                            }
                          } else {
                            ((bi) this).field_y = false;
                            var3--;
                            var4--;
                            break L47;
                          }
                        } else {
                          ((bi) this).field_y = false;
                          var3++;
                          var4--;
                          break L47;
                        }
                      } else {
                        ((bi) this).field_y = false;
                        var4++;
                        var3++;
                        break L47;
                      }
                    }
                  }
                } else {
                  var3--;
                  if (!mm.field_h) {
                    break L47;
                  } else {
                    ((bi) this).field_P.field_g[2] = ((bi) this).field_P.field_g[2] - 10.0;
                    ((bi) this).field_M = ((bi) this).field_M + 2;
                    break L47;
                  }
                }
              } else {
                L50: {
                  if (!mm.field_h) {
                    break L50;
                  } else {
                    ((bi) this).field_P.field_g[2] = ((bi) this).field_P.field_g[2] + 10.0;
                    ((bi) this).field_M = ((bi) this).field_M + 1;
                    break L50;
                  }
                }
                var3++;
                break L47;
              }
            }
            if (2 <= ri.field_E) {
              var7_int = po.field_z;
              if (var7_int != 70) {
                if (var7_int == 51) {
                  ce.field_b = true;
                  continue L2;
                } else {
                  if (38 != var7_int) {
                    if (var7_int == 49) {
                      if (!ce.field_b) {
                        continue L2;
                      } else {
                        ko.field_b = true;
                        continue L2;
                      }
                    } else {
                      if (var7_int != 101) {
                        if (var7_int == 48) {
                          ((bi) this).field_k = ((bi) this).field_k - 1000;
                          continue L2;
                        } else {
                          L51: {
                            if (var7_int == 80) {
                              break L51;
                            } else {
                              if (var7_int != 69) {
                                if (var7_int != 57) {
                                  continue L2;
                                } else {
                                  L52: {
                                    if (i.field_P[81]) {
                                      stackOut_86_0 = 0;
                                      stackIn_87_0 = stackOut_86_0;
                                      break L52;
                                    } else {
                                      stackOut_85_0 = 1;
                                      stackIn_87_0 = stackOut_85_0;
                                      break L52;
                                    }
                                  }
                                  mm.field_h = stackIn_87_0 != 0;
                                  ((bi) this).field_t = ((bi) this).field_t | mm.field_h;
                                  continue L2;
                                }
                              } else {
                                break L51;
                              }
                            }
                          }
                          L53: {
                            ((bi) this).field_k = 0;
                            ((bi) this).field_T = ki.a("ff9040", "ffffff", -93, ((bi) this).field_T.toString());
                            ((bi) this).g(62);
                            vl.field_c = null;
                            if (!je.a((byte) 117)) {
                              int discarded$3 = 65524;
                              gn.field_l = va.a(true, ((bi) this).field_j, ((bi) this).field_M, 11, ((bi) this).field_o, 3, ((bi) this).field_l, new int[1]);
                              break L53;
                            } else {
                              break L53;
                            }
                          }
                          ((bi) this).field_l = ((bi) this).field_l - ((bi) this).field_U;
                          ((bi) this).field_U = 0;
                          return;
                        }
                      } else {
                        ((bi) this).field_k = ((bi) this).field_k + 30000;
                        ((bi) this).field_t = true;
                        continue L2;
                      }
                    }
                  } else {
                    ce.field_b = false;
                    continue L2;
                  }
                }
              } else {
                ti.field_k = ti.field_k ^ true;
                continue L2;
              }
            } else {
              continue L2;
            }
          }
        }
    }

    public static void c() {
        field_u = null;
        field_I = null;
        field_f = null;
    }

    private final void b(int param0, int param1) {
        ((bi) this).b(9);
        eq.field_b = param1;
        ((bi) this).field_A.a(true, 5, 2, false);
        la.field_k[12].a(false);
        jh.a(la.field_k[12], 0);
    }

    bi(Torquing param0, int param1) {
        RuntimeException var3 = null;
        StringBuilder var3_ref = null;
        int var4 = 0;
        StringBuilder var6 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        ((bi) this).field_t = false;
        ((bi) this).field_e = new ei();
        ((bi) this).field_B = new ei();
        ((bi) this).field_E = 1365;
        ((bi) this).field_N = -17;
        ((bi) this).field_S = -1878996731;
        ((bi) this).field_L = 0;
        ((bi) this).field_H = 80;
        ((bi) this).field_w = false;
        ((bi) this).field_F = 68616224;
        ((bi) this).field_G = 0;
        ((bi) this).field_i = tp.field_a;
        ((bi) this).field_n = 0;
        ((bi) this).field_v = 0;
        ((bi) this).field_a = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
        ((bi) this).field_Q = new kg[1];
        ((bi) this).field_c = 0;
        ((bi) this).field_b = new int[qc.field_ab.length];
        ((bi) this).field_z = 0;
        ((bi) this).field_J = false;
        try {
          L0: {
            L1: {
              ((bi) this).field_o = 50456792;
              ((bi) this).field_A = param0;
              dd.field_d = 0;
              ao.field_f = 0;
              ((bi) this).field_M = -1046390103;
              ((bi) this).field_G = ((bi) this).field_G + (param1 + (param1 << 6));
              ((bi) this).field_S = ((bi) this).field_S + ((bi) this).field_N * ((param1 << 6) + param1);
              ((bi) this).field_l = -547216422;
              ((bi) this).field_j = 538264946;
              ((bi) this).field_L = param1;
              if (null != gj.field_i) {
                break L1;
              } else {
                gj.field_i = new int[12];
                int[] discarded$3 = ap.a(gj.field_i, il.field_m[((bi) this).field_v]);
                break L1;
              }
            }
            L2: {
              if (((bi) this).field_T != null) {
                break L2;
              } else {
                var6 = new StringBuilder(104);
                var3_ref = var6;
                var4 = 0;
                L3: while (true) {
                  if (var4 >= 8) {
                    ((bi) this).field_T = var6.toString();
                    break L2;
                  } else {
                    StringBuilder discarded$4 = var3_ref.append("<col=ffffff>");
                    StringBuilder discarded$5 = var3_ref.append(fh.field_s.charAt(var4));
                    var4++;
                    continue L3;
                  }
                }
              }
            }
            ((bi) this).field_d = ol.field_f[param1];
            ((bi) this).field_q = 1 + wi.field_a[param1];
            ((bi) this).field_P = new vg();
            this.h(104);
            vl.field_c = null;
            gn.field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("bi.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
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
          throw rb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = null;
        field_I = "Suggested names: ";
    }
}
