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
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        RuntimeException decompiledCaughtException = null;
        tl[] var2 = null;
        RuntimeException var2_ref = null;
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
        var9 = Torquing.field_u;
        try {
          L0: {
            fd.a(-109);
            re.field_d[1] = 80.0;
            this.field_x = 0;
            re.field_d[0] = 0.0;
            var10 = this.field_d.field_q;
            var2 = var10;
            this.field_D = new tl[var10.length];
            dk.a(var2, 0, this.field_D, 0, this.field_D.length);
            var3 = 0;
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= this.field_D.length) {
                this.field_m = new int[var3];
                var11 = 0;
                var4_int = var11;
                L2: while (true) {
                  if (var11 >= this.field_D.length) {
                    this.field_C = this.field_P.a(-63, this.field_d);
                    this.field_P.b(0, this.field_i);
                    var4 = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
                    var5_int = 42 % ((-34 - param0) / 44);
                    var6_ref_kh__ = vc.field_c;
                    var7 = 0;
                    L3: while (true) {
                      if (var7 >= var6_ref_kh__.length) {
                        var5_int = 0;
                        L4: while (true) {
                          if (var5_int >= this.field_C.field_y) {
                            L5: {
                              this.a(false, 0);
                              this.field_w = false;
                              this.field_T = ki.a("ff9040", "ffffff", 93, this.field_T);
                              this.field_z = 0;
                              this.field_k = this.field_d.a(-31648);
                              this.field_r = 3000;
                              this.field_c = 0;
                              this.field_v = this.field_d.a(false);
                              ap.a(gj.field_i, il.field_m[this.field_v]);
                              stackIn_25_0 = this;

                              if ((this.field_L ^ -1) != -19) {
                                stackIn_26_0 = this;
                                stackIn_26_1 = 0;
                                break L5;
                              } else {
                                stackIn_26_0 = this;
                                stackIn_26_1 = 1;
                                break L5;
                              }
                            }
                            ((bi) (this)).field_y = stackIn_26_1 != 0;
                            this.field_J = false;
                            this.field_h = Double.NEGATIVE_INFINITY;
                            this.field_K = -1.0;
                            var5 = this.field_d.a(-100, false).field_k;
                            var6 = var5.field_k + -1;
                            L6: while (true) {
                              if (var6 < 0) {
                                break L0;
                              } else {
                                L7: {
                                  if (this.field_h < re.field_d[1] * (double)var5.field_y[var6]) {
                                    this.field_h = re.field_d[1] * (double)var5.field_y[var6];
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                var6--;
                                continue L6;
                              }
                            }
                          } else {
                            this.field_C.a(var5_int, 80, 1365, -1, -12, 12);
                            var5_int++;
                            continue L4;
                          }
                        }
                      } else {
                        L8: {
                          var8 = var6_ref_kh__[var7];
                          if (var8 != null) {
                            this.field_C.a(var8, var4);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    if (this.field_D[var11].f(25468)) {
                      var3--;
                      this.field_m[var3] = var11;
                      var11++;
                      continue L2;
                    } else {
                      var11++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (this.field_D[var4_int].f(25468)) {
                  var3++;
                  var4_int++;
                  continue L1;
                } else {
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2_ref), "bi.Q(" + param0 + ')');
        }
    }

    final void g(int param0) {
        int dupTemp$0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        tl[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        qk var10 = null;
        var9 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var10 = new qk(0, this.field_L, this.field_N, this.field_S, this.field_F, this.field_G);
              if (!je.a((byte) 77)) {
                le.a((byte) 83, 5, var10);
                break L1;
              } else {
                bo.field_l.a((byte) 54, var10);
                break L1;
              }
            }
            L2: {
              if (1 + this.field_L > nh.field_k) {
                nh.field_k = this.field_L - -1;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (wi.field_a.length - 1 != this.field_L) {
                if (wi.field_a[this.field_L + 1] != wi.field_a[this.field_L]) {
                  stackIn_15_0 = 1;
                  break L3;
                } else {
                  stackIn_15_0 = 0;
                  break L3;
                }
              } else {
                stackIn_15_0 = 1;
                break L3;
              }
            }
            L4: {
              var3 = stackIn_15_0;
              var4 = wi.field_a[this.field_L];
              if (var3 == 0) {
                break L4;
              } else {
                L5: {
                  if (var4 == 1) {
                    this.a(0, (byte) 83, 255);
                    break L5;
                  } else {
                    if ((var4 ^ -1) == -3) {
                      this.a(1, (byte) 9, 254);
                      break L5;
                    } else {
                      if (var4 != 4) {
                        if (7 != var4) {
                          break L5;
                        } else {
                          this.a(3, (byte) 125, 252);
                          break L5;
                        }
                      } else {
                        this.a(2, (byte) 78, 253);
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  var5_int = this.field_G & 63;
                  if (-1 <= (var4 ^ -1)) {
                    break L6;
                  } else {
                    L7: {
                      if (var4 > wi.field_a[var5_int]) {
                        break L7;
                      } else {
                        if (hg.field_d[var5_int] == 0) {
                          break L7;
                        } else {
                          break L6;
                        }
                      }
                    }
                    this.a(4, (byte) 118, 251);
                    break L6;
                  }
                }
                if (0 == var5_int) {
                  if ((var4 ^ -1) != -3) {
                    if (-5 == (var4 ^ -1)) {
                      this.a(6, (byte) 6, 249);
                      break L4;
                    } else {
                      if (var4 != 7) {
                        break L4;
                      } else {
                        this.a(7, (byte) 112, 248);
                        if (-1 == this.field_T.indexOf("ffffff")) {
                          this.a(13, (byte) 25, 242);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  } else {
                    this.a(5, (byte) 71, 250);
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
            L8: {
              if (-1 >= this.field_T.indexOf("ff9040")) {
                break L8;
              } else {
                if ((this.field_T.indexOf("ffffff") ^ -1) == 0) {
                  this.field_l = this.field_l + this.field_U;
                  this.field_U = this.field_U * 2;
                  this.field_s = this.field_U;
                  this.a(12, (byte) 61, 243);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            this.field_T = ki.a("ff9040", "ff0000", -104, this.field_T);
            var5 = this.field_d.field_q;
            var6 = 0;
            L9: while (true) {
              if (this.field_D.length <= var6) {
                L10: {
                  if (var3 == 0) {
                    break L10;
                  } else {
                    L11: {
                      if ((var4 ^ -1) == -2) {
                        break L11;
                      } else {
                        if ((var4 ^ -1) == -4) {
                          break L11;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var6 = 0;
                    var7 = 0;
                    var8 = 0;
                    L12: while (true) {
                      if (var4 < var8) {
                        L13: {
                          if (var6 >= var7 * 8 / 10) {
                            if (1 != var4) {
                              this.a(10, (byte) 13, 245);
                              break L13;
                            } else {
                              this.a(8, (byte) 33, 247);
                              break L13;
                            }
                          } else {
                            break L13;
                          }
                        }
                        if (var7 == var6) {
                          if ((var4 ^ -1) != -2) {
                            this.a(11, (byte) 24, 244);
                            break L10;
                          } else {
                            this.a(9, (byte) 23, 246);
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      } else {
                        var7 = var7 + mh.field_k[var4];
                        var6 = var6 + this.field_b[var4];
                        var8++;
                        continue L12;
                      }
                    }
                  }
                }
                L14: {
                  dd.field_d = dd.field_d | this.field_z;
                  if (-256 == (dd.field_d ^ -1)) {
                    if (!ia.a(-22426, 0)) {
                      this.a(15, (byte) 30, 240);
                      break L14;
                    } else {
                      this.a(16, (byte) 11, 239);
                      break L14;
                    }
                  } else {
                    break L14;
                  }
                }
                if (param0 >= 25) {
                  L15: {
                    if (-1 > (wp.field_w ^ -1)) {
                      break L15;
                    } else {
                      if (qc.field_ab.length <= 1) {
                        break L15;
                      } else {
                        if (qc.field_ab[1] + qc.field_ab[0] > nh.field_k) {
                          break L15;
                        } else {
                          nh.field_k = -1 + (qc.field_ab[0] - -qc.field_ab[1]);
                          break L15;
                        }
                      }
                    }
                  }
                  this.field_J = true;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                if (null == this.field_D[var6]) {
                  if (var5[var6].field_r != 0) {
                    if (var5[var6].field_r != 7) {
                      dupTemp$0 = wi.field_a[this.field_L];
                      this.field_b[dupTemp$0] = this.field_b[dupTemp$0] + 1;
                      this.field_G = this.field_G + 4096;
                      this.field_S = this.field_S + (this.field_N << 114136940);
                      var6++;
                      continue L9;
                    } else {
                      var6++;
                      continue L9;
                    }
                  } else {
                    var6++;
                    continue L9;
                  }
                } else {
                  var6++;
                  continue L9;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "bi.T(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void e(int param0) {
        try {
            this.field_w = true;
            if (param0 != -7045) {
                java.applet.Applet var3 = (java.applet.Applet) null;
                bi.a((java.applet.Applet) null, (byte) -76);
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "bi.N(" + param0 + ')');
        }
    }

    final void b(byte param0, int param1) {
        try {
            this.field_k = this.field_k + param1;
            if (param0 < 120) {
                this.field_k = -84;
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "bi.I(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ti[] var2 = null;
        tl[] var2_array = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        tl var4 = null;
        int var5 = 0;
        ti[] var6 = null;
        tl[] var7 = null;
        int var8 = 0;
        ti var9 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              this.field_e.a(0);
              if (null == this.field_d.field_k) {
                break L1;
              } else {
                var6 = this.field_d.field_k;
                var2 = var6;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var6.length) {
                    break L1;
                  } else {
                    L3: {
                      var9 = var6[var3];
                      if (var9 != null) {
                        var9.b((byte) 62);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var3++;
                    continue L2;
                  }
                }
              }
            }
            if (param0 == 1) {
              var7 = this.field_d.field_q;
              var2_array = var7;
              var8 = 0;
              var3 = var8;
              L4: while (true) {
                if (var7.length <= var8) {
                  L5: {
                    if (this.field_d.field_m != null) {
                      L6: {
                        this.field_d = this.field_d.field_m;
                        this.field_G = this.field_G + 64;
                        this.field_L = this.field_L + 1;
                        this.field_F = this.field_F + (this.field_N << -961057594);
                        var2_int = wi.field_a[this.field_L];
                        if (1 + var2_int != this.field_q) {
                          this.field_i = tp.field_a;
                          this.field_q = var2_int + 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (ri.field_E < 2) {
                            break L8;
                          } else {
                            if (!la.field_k[this.field_q].e(17)) {
                              break L8;
                            } else {
                              break L7;
                            }
                          }
                        }
                        la.field_k[this.field_q].g();
                        break L7;
                      }
                      this.h(67);
                      break L5;
                    } else {
                      this.b(param0 ^ 8);
                      this.field_g = true;
                      this.field_q = 9;
                      this.field_d = ig.field_q;
                      la.field_k[9].a(true);
                      this.h(-83);
                      this.field_r = 0;
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4 = var7[var8];
                  var4.field_c = -1;
                  var4.field_h = null;
                  var8++;
                  continue L4;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2_ref), "bi.O(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static af a(sm param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        di stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -94 / ((23 - param1) / 43);
            stackIn_1_0 = new di(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var2);

            stackIn_5_1 = new StringBuilder().append("bi.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
        return (af) ((Object) stackIn_1_0);
    }

    final void a(int param0, int param1) {
        StringBuilder var3 = null;
        CharSequence var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var3 = new StringBuilder(this.field_T);
              var4 = (CharSequence) ((Object) "ff9040");
              gd.a(-20980, var3, var4, 5 + 13 * param0);
              this.field_T = var3.toString();
              if (param1 < -26) {
                break L1;
              } else {
                this.field_Q = (kg[]) null;
                break L1;
              }
            }
            L2: {
              if (this.field_T.indexOf("ffffff") != -1) {
                th.a(100, th.field_F[17]);
                break L2;
              } else {
                th.a(100, th.field_F[18]);
                break L2;
              }
            }
            th.a(100, th.field_F[19]);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var3_ref), "bi.CA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        try {
            int var2_int = -38 % ((param0 - 62) / 48);
            this.field_x = Math.max(10, this.field_x);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "bi.U(" + param0 + ')');
        }
    }

    final void a(byte param0, kh param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -68) {
                break L1;
              } else {
                this.b((byte) 62);
                break L1;
              }
            }
            this.field_H = param3;
            this.field_E = param2;
            this.field_P.b(0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("bi.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, sg param2, int param3) {
        kg var5 = null;
        int var6 = 0;
        kg[] var7 = null;
        int var8 = 0;
        kg var9 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = Torquing.field_u;
        try {
          L0: {
            var9 = new kg(param2, param3, param1);
            var5 = var9;
            var6 = 0;
            L1: while (true) {
              if (this.field_Q.length <= var6) {
                L2: {
                  var6 = this.field_Q.length;
                  var7 = new kg[var6 - -1];
                  dk.a(this.field_Q, 0, var7, 0, var6);
                  if (param0 == 538) {
                    break L2;
                  } else {
                    this.field_L = -15;
                    break L2;
                  }
                }
                var7[var6] = var9;
                this.field_Q = var7;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  if (this.field_Q[var6] == null) {
                    break L3;
                  } else {
                    if (this.field_Q[var6].field_a == null) {
                      break L3;
                    } else {
                      var6++;
                      continue L1;
                    }
                  }
                }
                this.field_Q[var6] = var9;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5_ref);

            stackIn_17_1 = new StringBuilder().append("bi.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        int var2_int = 0;
        sm var3 = null;
        int stackIn_11_0 = 0;
        Torquing stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Torquing stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        Torquing stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Torquing stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -103) {
                break L1;
              } else {
                var3 = (sm) null;
                bi.a((sm) null, -1);
                break L1;
              }
            }
            L2: {
              this.b(9);
              this.field_g = true;
              if (!je.a((byte) 77)) {
                L3: {
                  stackIn_19_0 = this.field_A;

                  stackIn_19_1 = 1;

                  if (ao.field_f == 0) {
                    stackIn_20_0 = (Torquing) ((Object) stackIn_19_0);
                    stackIn_20_1 = stackIn_19_1;
                    stackIn_20_2 = 2;
                    break L3;
                  } else {
                    stackIn_20_0 = (Torquing) ((Object) stackIn_19_0);
                    stackIn_20_1 = stackIn_19_1;
                    stackIn_20_2 = 8;
                    break L3;
                  }
                }
                ((Torquing) (Object) stackIn_20_0).a(stackIn_20_1 != 0, stackIn_20_2, 1, false);
                break L2;
              } else {
                L4: {
                  if (this.field_U == 0) {
                    if (-1 == (ao.field_f ^ -1)) {
                      if (this.field_L != 0) {
                        stackIn_11_0 = 1;
                        break L4;
                      } else {
                        stackIn_11_0 = 0;
                        break L4;
                      }
                    } else {
                      stackIn_11_0 = 1;
                      break L4;
                    }
                  } else {
                    stackIn_11_0 = 1;
                    break L4;
                  }
                }
                L5: {
                  var2_int = stackIn_11_0;
                  stackIn_14_0 = this.field_A;

                  stackIn_14_1 = 1;

                  if (var2_int == 0) {
                    stackIn_15_0 = (Torquing) ((Object) stackIn_14_0);
                    stackIn_15_1 = stackIn_14_1;
                    stackIn_15_2 = 0;
                    break L5;
                  } else {
                    stackIn_15_0 = (Torquing) ((Object) stackIn_14_0);
                    stackIn_15_1 = stackIn_14_1;
                    stackIn_15_2 = 7;
                    break L5;
                  }
                }
                ((Torquing) (Object) stackIn_15_0).a(stackIn_15_1 != 0, stackIn_15_2, 1, false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "bi.G(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        tl[] var3 = null;
        int var4 = 0;
        tl var5 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        pj var6 = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var3 = this.field_D;
              var4 = 0;
              if (!param0) {
                break L1;
              } else {
                this.field_v = 112;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var4 >= var3.length) {
                  break L3;
                } else {
                  L4: {
                    var5 = var3[var4];
                    if (null == var5) {
                      break L4;
                    } else {
                      if (31 == var5.field_r) {
                        var6 = var5.d(-2).field_k;
                        gq.a(var6.field_f, 4, param1);
                        gq.a(var6.field_s, 4, param1);
                        gq.a(var6.field_l, 4, param1);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var4++;
                  continue L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var3_ref), "bi.AA(" + param0 + ',' + param1 + ')');
        }
    }

    final static we a(fj param0, byte param1) {
        RuntimeException var2 = null;
        java.applet.Applet var3 = null;
        we stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 13) {
                break L1;
              } else {
                var3 = (java.applet.Applet) null;
                bi.a((java.applet.Applet) null, (byte) 44);
                break L1;
              }
            }
            stackIn_3_0 = new we(param0.g(65536), param0.g(65536), param0.g(65536), param0.g(65536), param0.e((byte) 62), param0.e((byte) 62), param0.i((byte) -101));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("bi.BA(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(byte param0, String param1) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 77) {
                break L1;
              } else {
                field_f = (pc) null;
                break L1;
              }
            }
            L2: {
              if (qm.a(param1, (byte) 45) == null) {
                stackIn_6_0 = 0;
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("bi.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final void a(byte param0, int param1) {
        sg var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (0 != (this.field_T.indexOf("ffffff") ^ -1)) {
                break L1;
              } else {
                if ((this.field_T.indexOf("ff9040") ^ -1) == 0) {
                  param1 = param1 * 2;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              this.field_j = this.field_j - param1;
              this.field_U = this.field_U + param1;
              this.field_s = this.field_U;
              if (param0 >= 94) {
                break L2;
              } else {
                var4 = (sg) null;
                this.a(91, -43, (sg) null, 50);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var3), "bi.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, double param1, double param2, sg param3, double param4, int param5) {
        int fieldTemp$3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_c < param5) {
                  break L2;
                } else {
                  fieldTemp$3 = this.field_c - 1;
                  this.field_c = this.field_c - 1;
                  if ((fieldTemp$3 ^ -1) <= -1) {
                    break L2;
                  } else {
                    this.field_P.a(param5 + 80);
                    this.a(538, 16, param3, this.field_P.field_c);
                    th.a(param5 ^ 100, th.field_F[14]);
                    th.a(100, th.field_F[15]);
                    break L1;
                  }
                }
              }
              th.a(100, th.field_F[16]);
              break L1;
            }
            this.field_P.a(param1, param4, param5 + 1, param2);
            this.a(538, 0, param3, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var10);

            stackIn_10_1 = new StringBuilder().append("bi.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(int param0) {
        try {
            this.field_c = this.field_c + 1;
            if (param0 != 0) {
                this.field_z = -49;
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "bi.K(" + param0 + ')');
        }
    }

    final void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 1000) {
                break L1;
              } else {
                this.field_G = 31;
                break L1;
              }
            }
            L2: {
              this.field_i = tp.field_a;
              this.field_c = 0;
              this.a((byte) -68, tp.field_a, 1365, 80);
              this.field_j = this.field_j + this.field_U;
              if (ri.field_E < 2) {
                var2_int = this.field_G & 63;
                this.field_S = this.field_S + (this.field_L - var2_int) * this.field_N;
                this.field_G = this.field_G + (this.field_L + -var2_int);
                break L2;
              } else {
                break L2;
              }
            }
            this.field_U = 0;
            this.h(-116);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "bi.R(" + param0 + ')');
        }
    }

    final void b(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        bm var4 = null;
        bm var5 = null;
        var3 = Torquing.field_u;
        try {
          L0: {
            L1: {
              L2: {
                if ((ri.field_E ^ -1) > -3) {
                  break L2;
                } else {
                  if (!this.field_t) {
                    break L2;
                  } else {
                    this.field_M = 779830527;
                    this.field_j = -this.field_U + 318907172;
                    this.field_o = 1086213241;
                    this.field_t = false;
                    this.field_l = 2121488289;
                    break L1;
                  }
                }
              }
              if (0 >= this.field_U) {
                break L1;
              } else {
                if (gn.field_l != null) {
                  break L1;
                } else {
                  L3: {
                    if (this.field_U <= 0) {
                      break L3;
                    } else {
                      if (!je.a((byte) 85)) {
                        L4: {
                          var4 = vl.field_c;
                          var5 = var4;
                          if (var5 == null) {
                            break L4;
                          } else {
                            if (null == var5.field_p) {
                              break L4;
                            } else {
                              if (!bn.a(var4.field_p[1][9], -17310)) {
                                break L4;
                              } else {
                                if (var4.field_n[1][9] <= this.field_U) {
                                  break L4;
                                } else {
                                  gn.field_l = new wc(11, 65524, this.field_M, this.field_o, this.field_l, this.field_j, new int[]{this.field_U});
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                        gn.field_l = va.a(true, this.field_j, this.field_M, 11, this.field_o, 3, this.field_l, new int[]{this.field_U}, 65524);
                        vl.field_c = null;
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L5: {
              if (param0 == 9) {
                break L5;
              } else {
                field_f = (pc) null;
                break L5;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "bi.P(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1, int param2) {
        int var4_int = 0;
        sm var6 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        qp var5 = null;
        try {
          L0: {
            L1: {
              if (param1 > 1) {
                break L1;
              } else {
                var6 = (sm) null;
                bi.a((sm) null, 34);
                break L1;
              }
            }
            var4_int = 1 << param0;
            if ((var4_int & fa.field_b) != 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                ao.field_f = ao.field_f | var4_int;
                fa.field_b = fa.field_b | var4_int;
                this.field_B.a((byte) 54, new tj(param0));
                if (!this.field_t) {
                  var5 = new qp(param0, param2, this.field_N, this.field_S, this.field_F, this.field_G);
                  if (je.a((byte) 61)) {
                    jh.field_y.a((byte) 54, var5);
                    break L2;
                  } else {
                    wc.a(var5, (byte) 99, 4);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var4), "bi.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        try {
            if (param0 < 121) {
                this.a(-53);
            }
            this.field_P.e(66);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "bi.S(" + param0 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            int var2_int = 0;
            java.net.URL var3 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2 = null;
            RuntimeException var2_ref = null;
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
                stackIn_7_0 = (RuntimeException) (var2_ref);

                stackIn_7_1 = new StringBuilder().append("bi.A(");

                if (param0 == null) {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "null";
                  break L3;
                } else {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "{...}";
                  break L3;
                }
              }
              throw rb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        sg discarded$0 = null;
        vn stackIn_60_0;
        String stackIn_60_1;
        int stackIn_60_2;
        int stackIn_60_3;
        vn stackIn_61_0;
        String stackIn_61_1;
        int stackIn_61_2;
        int stackIn_61_3;
        int stackIn_61_4;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        var8 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (this.field_c >= 0) {
                break L1;
              } else {
                if (this.field_c != -2147483648) {
                  ph.d(0, 0, ph.field_j, ph.field_d, 16777215);
                  this.field_c = -2147483648;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                var2_int = this.field_q - 1;
                if ((var2_int ^ -1) > -1) {
                  break L3;
                } else {
                  if (var2_int < 8) {
                    L4: {
                      if (1 != this.field_d.a(false)) {
                        break L4;
                      } else {
                        if (null != hi.field_h[var2_int]) {
                          hi.field_h[var2_int].b(0, 0);
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    gm.field_r[var2_int].b(0, 0);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              gm.field_r[7].b(0, 0);
              break L2;
            }
            L5: {
              if (this.field_K < 0.0) {
                this.field_P.a(true, gj.field_i);
                var3 = vf.field_j[this.field_v][0];
                var4 = vf.field_j[this.field_v][1];
                var5_int = vf.field_j[this.field_v][2];
                gj.field_i[1] = gj.field_i[1] + (var4 * gj.field_i[7] + var3 * gj.field_i[4] + var5_int * gj.field_i[10] >> -207182928);
                gj.field_i[0] = gj.field_i[0] + (gj.field_i[9] * var5_int + (gj.field_i[6] * var4 + var3 * gj.field_i[3]) >> 2033481328);
                gj.field_i[2] = gj.field_i[2] + (gj.field_i[11] * var5_int + (var3 * gj.field_i[5] - -(var4 * gj.field_i[8])) >> 200640624);
                break L5;
              } else {
                if (ce.field_b) {
                  break L5;
                } else {
                  gj.field_i[1] = (int)((double)gj.field_i[1] + this.field_K);
                  break L5;
                }
              }
            }
            L6: {
              this.field_C.a(this.field_P.field_c, this.field_H, this.field_E, -1, -12, 12);
              if (this.field_J) {
                break L6;
              } else {
                if (this.field_c < 0) {
                  break L6;
                } else {
                  this.field_P.b(1);
                  break L6;
                }
              }
            }
            var13 = this.field_m;
            var12 = var13;
            var9 = var12;
            var3_ref_int__ = var9;
            var4 = 0;
            L7: while (true) {
              if (var13.length <= var4) {
                L8: {
                  sg.a(this.field_C.field_g[this.field_P.field_c], 80, 1365, -1, -12, 12);
                  sg.a(vc.field_c[1], 80, 1365, -1, -12, 12);
                  if (!param0) {
                    break L8;
                  } else {
                    this.e(14);
                    break L8;
                  }
                }
                sg.a(vc.field_c[7], 80, 1365, -1, -12, 12);
                var10 = (kh) ((Object) on.field_e.c((byte) -122));
                L9: while (true) {
                  if (var10 == null) {
                    var3 = 9;
                    L10: while (true) {
                      if (var3 > 16) {
                        this.field_C.a(gj.field_i);
                        var11 = (sb) ((Object) this.field_e.b(0));
                        L11: while (true) {
                          if (var11 == null) {
                            L12: {
                              if (!ti.field_k) {
                                L13: {
                                  bd.field_w.e(-bd.field_w.field_s + 640, 0, 162);
                                  var3_ref_String = wh.a(this.field_k, (byte) -119);
                                  if (this.field_d == ig.field_q) {
                                    break L13;
                                  } else {
                                    dd.field_c.a(var3_ref_String, 628, 23, 16711680, -1);
                                    if (10000 <= this.field_k) {
                                      break L13;
                                    } else {
                                      if (this.field_J) {
                                        break L13;
                                      } else {
                                        if (this.field_v == 0) {
                                          dd.field_c.c(var3_ref_String, 344, 262, 16711680, -1);
                                          break L13;
                                        } else {
                                          dd.field_c.c(var3_ref_String, 258, 224, 16711680, -1);
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                }
                                L14: {
                                  stackIn_60_0 = dd.field_c;

                                  stackIn_60_1 = Integer.toString(Math.abs(this.field_U));

                                  stackIn_60_2 = 628;

                                  stackIn_60_3 = 67;

                                  if (!this.field_t) {
                                    stackIn_61_0 = (vn) ((Object) stackIn_60_0);
                                    stackIn_61_1 = (String) ((Object) stackIn_60_1);
                                    stackIn_61_2 = stackIn_60_2;
                                    stackIn_61_3 = stackIn_60_3;
                                    stackIn_61_4 = 16711680;
                                    break L14;
                                  } else {
                                    stackIn_61_0 = (vn) ((Object) stackIn_60_0);
                                    stackIn_61_1 = (String) ((Object) stackIn_60_1);
                                    stackIn_61_2 = stackIn_60_2;
                                    stackIn_61_3 = stackIn_60_3;
                                    stackIn_61_4 = 16776960;
                                    break L14;
                                  }
                                }
                                ((vn) (Object) stackIn_61_0).a(stackIn_61_1, stackIn_61_2, stackIn_61_3, stackIn_61_4, -1);
                                var4 = 0;
                                var5_int = 528;
                                L15: while (true) {
                                  if (8 <= var4) {
                                    var4 = 0;
                                    L16: while (true) {
                                      if (this.field_c <= var4) {
                                        L17: {
                                          if (!this.field_w) {
                                            break L17;
                                          } else {
                                            ia.field_f.d(553, 143);
                                            break L17;
                                          }
                                        }
                                        dd.field_c.b(this.field_T, 538, 102, 16711680, -1);
                                        break L12;
                                      } else {
                                        kk.field_n.d(583 - -(var4 * 8), 143);
                                        var4++;
                                        continue L16;
                                      }
                                    }
                                  } else {
                                    L18: {
                                      L19: {
                                        if (-1 != (dd.field_d >> var4 & 1 ^ -1)) {
                                          break L19;
                                        } else {
                                          L20: {
                                            if ((1 & this.field_z >> var4) == 0) {
                                              break L20;
                                            } else {
                                              if ((this.field_k % 1000 ^ -1) <= -501) {
                                                break L20;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          ph.b(var5_int, 118, ue.field_c[var4].field_w, ue.field_c[var4].field_u, 16777215, 118);
                                          ue.field_c[var4 + 8].e(var5_int, 118, 81);
                                          break L18;
                                        }
                                      }
                                      ue.field_c[var4].e(var5_int, 118, 162);
                                      break L18;
                                    }
                                    var5_int = var5_int + ue.field_c[var4].field_w;
                                    var4++;
                                    continue L15;
                                  }
                                }
                              } else {
                                break L12;
                              }
                            }
                            L21: {
                              if (-1 <= (this.field_r ^ -1)) {
                                break L21;
                              } else {
                                var3 = (this.field_r - 1) / 1000;
                                var4 = -(1000 * var3) + this.field_r;
                                var5 = hq.field_h[var3];
                                var6 = var4 * var5.field_s / 1000;
                                var7 = var5.field_t * var4 / 1000;
                                var5.b((-var6 + 640) / 2, (480 - var7) / 2, var6, var7);
                                break L21;
                              }
                            }
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            var11.c(-103);
                            var11 = (sb) ((Object) this.field_e.f(-24059));
                            continue L11;
                          }
                        }
                      } else {
                        discarded$0 = this.field_C;
                        sg.a(vc.field_c[var3], 80, 1365, -1, -12, 12);
                        var3++;
                        continue L10;
                      }
                    }
                  } else {
                    sg.a(var10, 80, 1365, -1, -12, 12);
                    var10 = (kh) ((Object) on.field_e.b((byte) -110));
                    continue L9;
                  }
                }
              } else {
                L22: {
                  var5_int = var13[var4];
                  if (null != this.field_D[var5_int]) {
                    this.field_D[var5_int].b(1);
                    this.field_C.a(this.field_D[var5_int].field_c, 80, 1365, -1, -12, 12);
                    break L22;
                  } else {
                    break L22;
                  }
                }
                var4++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "bi.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void i(int param0) {
        int stackIn_117_0 = 0;
        double stackIn_185_0 = 0.0;
        vg stackIn_194_0;
        double[] stackIn_194_1;
        int stackIn_194_2;
        double stackIn_194_3;
        int stackIn_194_4;
        int stackIn_194_5;
        vg stackIn_195_0 = null;
        double[] stackIn_195_1 = null;
        int stackIn_195_2 = 0;
        double stackIn_195_3 = 0.0;
        int stackIn_195_4 = 0;
        int stackIn_195_5 = 0;
        int stackIn_195_6 = 0;
        int stackIn_210_0 = 0;
        Torquing stackIn_279_0 = null;
        int stackIn_279_1 = 0;
        Torquing stackIn_280_0 = null;
        int stackIn_280_1 = 0;
        int stackIn_280_2 = 0;
        int stackIn_289_0 = 0;
        Torquing stackIn_292_0 = null;
        int stackIn_292_1 = 0;
        Torquing stackIn_293_0 = null;
        int stackIn_293_1 = 0;
        int stackIn_293_2 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        double[] var7 = null;
        int var8 = 0;
        pj var8_ref_pj = null;
        int var9_int = 0;
        double var9_double = 0.0;
        Object var9 = null;
        int var10 = 0;
        short[] var10_ref_short__ = null;
        double var10_double = 0.0;
        int var11_int = 0;
        tl var11 = null;
        double var12_double = 0.0;
        kg var12 = null;
        double var14_double = 0.0;
        tl var14 = null;
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
        double[] var36 = null;
        int[] var37 = null;
        kh var38 = null;
        sb var39 = null;
        var22 = null;
        var23 = null;
        var21 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (jb.a(110)) {
                break L1;
              } else {
                if (this.field_J) {
                  break L1;
                } else {
                  np.a(la.field_k[this.field_q], false, 124);
                  break L1;
                }
              }
            }
            L2: {
              this.field_j = this.field_j + 1;
              this.field_F = this.field_F - this.field_M;
              this.field_S = this.field_S + this.field_M;
              this.field_l = this.field_l + 1;
              this.field_s = this.field_U;
              if (-3 < (ri.field_E ^ -1)) {
                break L2;
              } else {
                if (!ce.field_b) {
                  break L2;
                } else {
                  ko.field_b = false;
                  break L2;
                }
              }
            }
            var2_int = 0;
            var3 = 0;
            var4 = 0;
            var5 = 0;
            var6 = 0;
            L3: while (true) {
              if (!ak.c(-85)) {
                var7_int = this.field_a[0];
                var8 = be.field_o[var7_int * 32 & 2047];
                var9_int = be.field_l[32 * var7_int & 2047];
                this.field_a[0] = 0;
                this.field_a[11] = var8;
                this.field_a[3] = var8;
                this.field_a[9] = var9_int;
                this.field_a[5] = -var9_int;
                this.field_P.field_h.a(vc.field_c[1], this.field_a);
                var38 = (kh) ((Object) on.field_e.c((byte) -119));
                L4: while (true) {
                  if (var38 == null) {
                    var10 = 9;
                    L5: while (true) {
                      if (-17 > (var10 ^ -1)) {
                        L6: {
                          this.field_a[0] = 1 + var7_int;
                          if (0 != (7 & var7_int)) {
                            break L6;
                          } else {
                            var30 = vc.field_c[9].field_l.field_m;
                            var24 = var30;
                            var10_ref_short__ = var24;
                            var11_int = (short)(65535 & var30[0] - -1024);
                            dk.a(var10_ref_short__, 0, var30.length, (short) var11_int);
                            this.field_M = this.field_M ^ var11_int << 613208131;
                            this.field_o = this.field_o ^ var11_int << 1035955139;
                            break L6;
                          }
                        }
                        this.a(false, var7_int);
                        var39 = (sb) ((Object) this.field_e.b(0));
                        L7: while (true) {
                          if (var39 == null) {
                            if (var2_int != 0) {
                              this.field_A.a(true, 1, 2, false);
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              L8: {
                                if ((ri.field_E ^ -1) > -3) {
                                  break L8;
                                } else {
                                  if (!ce.field_b) {
                                    break L8;
                                  } else {
                                    if (ko.field_b) {
                                      break L8;
                                    } else {
                                      decompiledRegionSelector0 = 2;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              if (-1 > (this.field_r ^ -1)) {
                                L9: {
                                  if (-1001 != (this.field_r ^ -1)) {
                                    if (-2001 == (this.field_r ^ -1)) {
                                      th.a(100, th.field_F[3]);
                                      break L9;
                                    } else {
                                      if (-3001 == (this.field_r ^ -1)) {
                                        th.a(100, th.field_F[2]);
                                        break L9;
                                      } else {
                                        if ((this.field_r ^ -1) < -21) {
                                          break L9;
                                        } else {
                                          qj.a(this.field_r, -5205, 96, th.field_F[5]);
                                          break L9;
                                        }
                                      }
                                    }
                                  } else {
                                    th.a(100, th.field_F[4]);
                                    break L9;
                                  }
                                }
                                this.field_r = this.field_r - 20;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                L10: {
                                  if (-1 <= (this.field_x ^ -1)) {
                                    break L10;
                                  } else {
                                    if ((this.field_x ^ -1) <= -513) {
                                      break L10;
                                    } else {
                                      var25 = ql.field_u;
                                      this.field_x = Math.min(512, this.field_x + 10);
                                      bc.field_a.a(true);
                                      var25.a(0.0, 0.0, 1.0, (byte) 51, 3.141592653589793 * (double)(il.field_m[this.field_v][2] * 2) / 2048.0);
                                      bc.field_a.a(var25, 65536);
                                      var25.a(1.0, 0.0, 0.0, (byte) 54, 3.141592653589793 * (double)(2 * il.field_m[this.field_v][0]) / 2048.0);
                                      bc.field_a.a(var25, 65536);
                                      var25.a(0.0, 1.0, 0.0, (byte) 63, (double)(il.field_m[this.field_v][1] * 2) * 3.141592653589793 / 2048.0);
                                      bc.field_a.a(var25, 65536);
                                      var25.a(0.0, 0.0, 1.0, (byte) 87, 3.141592653589793 * (double)(2 * -this.field_x) / 2048.0);
                                      bc.field_a.a(var25, 65536);
                                      bc.field_a.a(gj.field_i, (byte) 113);
                                      re.field_d[0] = 80.0 * (double)be.field_l[this.field_x] / 65535.0;
                                      re.field_d[1] = (double)be.field_o[this.field_x] * 80.0 / 65535.0;
                                      this.field_h = Double.NEGATIVE_INFINITY;
                                      var8_ref_pj = this.field_d.a(-100, false).field_k;
                                      var9_int = -1 + var8_ref_pj.field_k;
                                      L11: while (true) {
                                        if (-1 < (var9_int ^ -1)) {
                                          break L10;
                                        } else {
                                          this.field_h = Math.max(this.field_h, re.field_d[1] * (double)var8_ref_pj.field_y[var9_int] + (1000.0 + (double)var8_ref_pj.field_j[var9_int] * re.field_d[0]) + (double)var8_ref_pj.field_v[var9_int] * re.field_d[2]);
                                          var9_int--;
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                }
                                L12: {
                                  L13: {
                                    var3 = Math.min(Math.max(var3, -10), 10);
                                    var7 = new double[3];
                                    var7[0] = 2670.0 * (double)(be.field_o[this.field_x] * var3) / 65535.0;
                                    var7[1] = 2670.0 * (double)(-be.field_l[this.field_x] * var3) / 65535.0;
                                    var7[2] = (double)Math.min(Math.max(var4, -10), 10) * 2670.0;
                                    if ((this.field_c ^ -1) > -1) {
                                      break L13;
                                    } else {
                                      if (mm.field_h) {
                                        break L13;
                                      } else {
                                        if (!this.field_J) {
                                          L14: {
                                            stackIn_194_0 = this.field_P;

                                            stackIn_194_1 = (double[]) (var7);

                                            stackIn_194_2 = var5;

                                            stackIn_194_3 = 0.08;

                                            stackIn_194_4 = var6;

                                            stackIn_194_5 = 0;

                                            if (this.field_d != ig.field_q) {
                                              stackIn_195_0 = (vg) ((Object) stackIn_194_0);
                                              stackIn_195_1 = (double[]) ((Object) stackIn_194_1);
                                              stackIn_195_2 = stackIn_194_2;
                                              stackIn_195_3 = stackIn_194_3;
                                              stackIn_195_4 = stackIn_194_4;
                                              stackIn_195_5 = stackIn_194_5;
                                              stackIn_195_6 = 0;
                                              break L14;
                                            } else {
                                              stackIn_195_0 = (vg) ((Object) stackIn_194_0);
                                              stackIn_195_1 = (double[]) ((Object) stackIn_194_1);
                                              stackIn_195_2 = stackIn_194_2;
                                              stackIn_195_3 = stackIn_194_3;
                                              stackIn_195_4 = stackIn_194_4;
                                              stackIn_195_5 = stackIn_194_5;
                                              stackIn_195_6 = 1;
                                              break L14;
                                            }
                                          }
                                          L15: {
                                            var9_double = ((vg) (Object) stackIn_195_0).a(stackIn_195_1, stackIn_195_2 != 0, stackIn_195_3, stackIn_195_4 != 0, stackIn_195_5, stackIn_195_6 != 0);
                                            if (!this.field_y) {
                                              break L15;
                                            } else {
                                              if (this.field_P.field_g[2] > 1400.0) {
                                                break L15;
                                              } else {
                                                if (0.0 <= this.field_P.field_g[5]) {
                                                  this.a(14, (byte) 127, 241);
                                                  break L15;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                          }
                                          L16: {
                                            if (var9_double <= this.field_h) {
                                              break L16;
                                            } else {
                                              if (-1.0 == this.field_K) {
                                                this.field_K = 0.08 * this.field_P.field_g[4];
                                                th.a(100, th.field_F[22]);
                                                break L16;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          L17: {
                                            if (var9_double >= 100000.0 + this.field_h) {
                                              stackIn_210_0 = 0;
                                              break L17;
                                            } else {
                                              stackIn_210_0 = 1;
                                              break L17;
                                            }
                                          }
                                          var8 = stackIn_210_0;
                                          break L12;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                  L18: {
                                    if (!mm.field_h) {
                                      break L18;
                                    } else {
                                      this.field_P.c(0);
                                      break L18;
                                    }
                                  }
                                  var8 = 1;
                                  if (!this.field_J) {
                                    break L12;
                                  } else {
                                    var31 = new double[4];
                                    var26 = var31;
                                    var9 = var26;
                                    ap.a(this.field_P.field_g, 6, this.field_P.field_g, 10, (double[]) (var9), 0, 0.08);
                                    var10 = 0;
                                    L19: while (true) {
                                      if (-5 >= (var10 ^ -1)) {
                                        var10 = 0;
                                        L20: while (true) {
                                          if ((var10 ^ -1) <= -4) {
                                            L21: {
                                              var10_double = 0.1;
                                              var12_double = this.field_P.field_g[8];
                                              if (var12_double >= 1.0) {
                                                stackIn_185_0 = 0.0;
                                                break L21;
                                              } else {
                                                if (-1.0 < var12_double) {
                                                  stackIn_185_0 = Math.acos(var12_double);
                                                  break L21;
                                                } else {
                                                  stackIn_185_0 = 3.141592653589793;
                                                  break L21;
                                                }
                                              }
                                            }
                                            L22: {
                                              L23: {
                                                var14_double = stackIn_185_0;
                                                var16 = ql.field_u;
                                                if (0.0001 > var14_double) {
                                                  break L23;
                                                } else {
                                                  if (3.141492653589793 >= var14_double) {
                                                    var17 = Math.sin((-var10_double + 1.0) * var14_double);
                                                    var19 = Math.sin(var14_double * var10_double);
                                                    break L22;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              var19 = var10_double;
                                              var17 = 1.0 - var10_double;
                                              break L22;
                                            }
                                            var16.field_b = var19 + var17 * this.field_P.field_g[8];
                                            var16.field_d = this.field_P.field_g[7] * var17;
                                            var16.field_a = var17 * this.field_P.field_g[6];
                                            var16.field_e = this.field_P.field_g[9] * var17;
                                            var16.a((byte) -123);
                                            this.field_P.field_g[8] = var16.field_b;
                                            this.field_P.field_g[6] = var16.field_a;
                                            this.field_P.field_g[7] = var16.field_d;
                                            this.field_P.field_g[9] = var16.field_e;
                                            this.field_P.c(0);
                                            this.field_P.field_h.a(this.field_P.field_h.field_g[this.field_P.field_c], this.field_P.field_f);
                                            break L12;
                                          } else {
                                            this.field_P.field_g[10 - -var10] = this.field_P.field_g[10 - -var10] * 0.8;
                                            var10++;
                                            continue L20;
                                          }
                                        }
                                      } else {
                                        this.field_P.field_g[var10 + 6] = this.field_P.field_g[var10 + 6] + var31[var10];
                                        var10++;
                                        continue L19;
                                      }
                                    }
                                  }
                                }
                                L24: {
                                  if (ig.field_q == this.field_d) {
                                    var36 = this.field_d.f(14);
                                    this.field_P.field_g[0] = var36[0];
                                    this.field_P.field_g[2] = var36[2];
                                    break L24;
                                  } else {
                                    break L24;
                                  }
                                }
                                var37 = this.field_m;
                                var10 = 0;
                                L25: while (true) {
                                  if (var37.length <= var10) {
                                    if (param0 > 35) {
                                      var9_int = 0;
                                      L26: while (true) {
                                        if (this.field_Q.length <= var9_int) {
                                          L27: {
                                            if (!this.field_J) {
                                              this.field_k = this.field_k - 20;
                                              if (this.field_d == ig.field_q) {
                                                break L27;
                                              } else {
                                                if (10000 < this.field_k) {
                                                  break L27;
                                                } else {
                                                  if (0 >= this.field_k) {
                                                    break L27;
                                                  } else {
                                                    if (-21 >= ((20 + (this.field_k + -1)) % 1000 ^ -1)) {
                                                      break L27;
                                                    } else {
                                                      th.a(100, th.field_F[20]);
                                                      break L27;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              break L27;
                                            }
                                          }
                                          L28: {
                                            if (!this.field_J) {
                                              L29: {
                                                if (ig.field_q == this.field_d) {
                                                  break L29;
                                                } else {
                                                  if (0 < this.field_k) {
                                                    break L29;
                                                  } else {
                                                    if (this.field_k <= -20) {
                                                      break L29;
                                                    } else {
                                                      this.b(12, 1);
                                                      th.a(100, th.field_F[21]);
                                                      break L28;
                                                    }
                                                  }
                                                }
                                              }
                                              if (var8 != 0) {
                                                if ((this.field_c ^ -1) > -1) {
                                                  var9_int = 1;
                                                  var29 = this.field_Q;
                                                  var11_int = 0;
                                                  L30: while (true) {
                                                    if (var29.length <= var11_int) {
                                                      if (var9_int != 0) {
                                                        this.b(12, 2);
                                                        break L28;
                                                      } else {
                                                        break L28;
                                                      }
                                                    } else {
                                                      var12 = var29[var11_int];
                                                      if (var12 != null) {
                                                        var9_int = 0;
                                                        var11_int++;
                                                        continue L30;
                                                      } else {
                                                        var11_int++;
                                                        continue L30;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if (0 <= this.field_k) {
                                                    break L28;
                                                  } else {
                                                    this.b(9);
                                                    this.field_g = true;
                                                    if (je.a((byte) 69)) {
                                                      L31: {
                                                        if (this.field_U == 0) {
                                                          if (ao.field_f == 0) {
                                                            if (this.field_L != 0) {
                                                              stackIn_289_0 = 1;
                                                              break L31;
                                                            } else {
                                                              stackIn_289_0 = 0;
                                                              break L31;
                                                            }
                                                          } else {
                                                            stackIn_289_0 = 1;
                                                            break L31;
                                                          }
                                                        } else {
                                                          stackIn_289_0 = 1;
                                                          break L31;
                                                        }
                                                      }
                                                      L32: {
                                                        var9_int = stackIn_289_0;
                                                        stackIn_292_0 = this.field_A;

                                                        stackIn_292_1 = 1;

                                                        if (var9_int == 0) {
                                                          stackIn_293_0 = (Torquing) ((Object) stackIn_292_0);
                                                          stackIn_293_1 = stackIn_292_1;
                                                          stackIn_293_2 = 0;
                                                          break L32;
                                                        } else {
                                                          stackIn_293_0 = (Torquing) ((Object) stackIn_292_0);
                                                          stackIn_293_1 = stackIn_292_1;
                                                          stackIn_293_2 = 7;
                                                          break L32;
                                                        }
                                                      }
                                                      ((Torquing) (Object) stackIn_293_0).a(stackIn_293_1 != 0, stackIn_293_2, 2, false);
                                                      break L28;
                                                    } else {
                                                      L33: {
                                                        stackIn_279_0 = this.field_A;

                                                        stackIn_279_1 = 1;

                                                        if (0 != ao.field_f) {
                                                          stackIn_280_0 = (Torquing) ((Object) stackIn_279_0);
                                                          stackIn_280_1 = stackIn_279_1;
                                                          stackIn_280_2 = 8;
                                                          break L33;
                                                        } else {
                                                          stackIn_280_0 = (Torquing) ((Object) stackIn_279_0);
                                                          stackIn_280_1 = stackIn_279_1;
                                                          stackIn_280_2 = 2;
                                                          break L33;
                                                        }
                                                      }
                                                      ((Torquing) (Object) stackIn_280_0).a(stackIn_280_1 != 0, stackIn_280_2, 2, false);
                                                      break L28;
                                                    }
                                                  }
                                                }
                                              } else {
                                                this.b(12, 0);
                                                break L28;
                                              }
                                            } else {
                                              if (this.field_k <= 0) {
                                                L34: {
                                                  if (this.field_d.field_m == null) {
                                                    break L34;
                                                  } else {
                                                    if (wi.field_a[this.field_L - -1] == wi.field_a[this.field_L]) {
                                                      this.field_A.a(true, this.field_L + 1, 6, false);
                                                      break L28;
                                                    } else {
                                                      break L34;
                                                    }
                                                  }
                                                }
                                                this.field_A.a(true, wi.field_a[this.field_L], 8, false);
                                                break L28;
                                              } else {
                                                L35: {
                                                  var9_int = 300;
                                                  if (this.field_k < var9_int) {
                                                    var9_int = this.field_k;
                                                    break L35;
                                                  } else {
                                                    break L35;
                                                  }
                                                }
                                                this.field_k = this.field_k - var9_int;
                                                this.a((byte) 115, (1 + this.field_d.field_s) * var9_int / 100);
                                                break L28;
                                              }
                                            }
                                          }
                                          L36: {
                                            if (this.field_g) {
                                              break L36;
                                            } else {
                                              if (this.field_J) {
                                                break L36;
                                              } else {
                                                var9 = null;
                                                var10 = 0;
                                                L37: while (true) {
                                                  if (var10 >= this.field_D.length) {
                                                    L38: while (true) {
                                                      if (null == var9) {
                                                        break L36;
                                                      } else {
                                                        ((tl) (var9)).a((bi) (this), 19);
                                                        var9 = ((tl) (var9)).field_t;
                                                        continue L38;
                                                      }
                                                    }
                                                  } else {
                                                    var11 = this.field_D[var10];
                                                    if (null != var11) {
                                                      if ((var11.field_r ^ -1) != -4) {
                                                        L39: {
                                                          L40: {
                                                            if (-26 < (var11.field_r ^ -1)) {
                                                              break L40;
                                                            } else {
                                                              if ((var11.field_r ^ -1) < -32) {
                                                                break L40;
                                                              } else {
                                                                break L39;
                                                              }
                                                            }
                                                          }
                                                          if (var11.a(0, this.field_P.field_g)) {
                                                            var11.field_t = (tl) (var9);
                                                            var9 = var11;
                                                            var11.a(80);
                                                            this.field_D[var10] = null;
                                                            break L39;
                                                          } else {
                                                            var10++;
                                                            continue L37;
                                                          }
                                                        }
                                                        var10++;
                                                        continue L37;
                                                      } else {
                                                        var10++;
                                                        continue L37;
                                                      }
                                                    } else {
                                                      var10++;
                                                      continue L37;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          L41: {
                                            L42: {
                                              if (jb.field_d != 10) {
                                                break L42;
                                              } else {
                                                if (la.field_k[10].e(17)) {
                                                  break L42;
                                                } else {
                                                  np.a(la.field_k[this.field_q], false, 127);
                                                  break L41;
                                                }
                                              }
                                            }
                                            break L41;
                                          }
                                          decompiledRegionSelector0 = 5;
                                          break L0;
                                        } else {
                                          if (this.field_Q[var9_int] != null) {
                                            L43: {
                                              this.field_Q[var9_int].a(true);
                                              if (this.field_Q[var9_int].field_a == null) {
                                                this.field_Q[var9_int] = null;
                                                break L43;
                                              } else {
                                                break L43;
                                              }
                                            }
                                            var9_int++;
                                            continue L26;
                                          } else {
                                            var9_int++;
                                            continue L26;
                                          }
                                        }
                                      }
                                    } else {
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    }
                                  } else {
                                    var11_int = var37[var10];
                                    if (this.field_D[var11_int] != null) {
                                      L44: {
                                        var12_double = this.field_D[var11_int].a(0, 0.08);
                                        if (var12_double > this.field_h + 100000.0) {
                                          L45: {
                                            var14 = this.field_D[var11_int];
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
                                          this.field_D[var11_int] = null;
                                          break L44;
                                        } else {
                                          break L44;
                                        }
                                      }
                                      var10++;
                                      continue L25;
                                    } else {
                                      var10++;
                                      continue L25;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var39.a((byte) -114);
                            var39 = (sb) ((Object) this.field_e.f(-24059));
                            continue L7;
                          }
                        }
                      } else {
                        this.field_P.field_h.a(vc.field_c[var10], this.field_a);
                        var10++;
                        continue L5;
                      }
                    }
                  } else {
                    this.field_P.field_h.a(var38, this.field_a);
                    var38 = (kh) ((Object) on.field_e.b((byte) 72));
                    continue L4;
                  }
                }
              } else {
                L47: {
                  var7_int = po.field_z;
                  if ((var7_int ^ -1) != -99) {
                    if (var7_int != 99) {
                      if (-97 == (var7_int ^ -1)) {
                        var4++;
                        this.field_y = false;
                        if (mm.field_h) {
                          this.field_P.field_g[0] = this.field_P.field_g[0] - 10.0;
                          this.field_M = this.field_M + 4;
                          break L47;
                        } else {
                          break L47;
                        }
                      } else {
                        if (97 == var7_int) {
                          this.field_y = false;
                          var4--;
                          if (mm.field_h) {
                            this.field_M = this.field_M + 8;
                            this.field_P.field_g[0] = this.field_P.field_g[0] + 10.0;
                            break L47;
                          } else {
                            break L47;
                          }
                        } else {
                          if (var7_int != 102) {
                            if ((var7_int ^ -1) != -105) {
                              if (-106 != (var7_int ^ -1)) {
                                if (103 != var7_int) {
                                  if (42 == var7_int) {
                                    if (!mm.field_h) {
                                      break L47;
                                    } else {
                                      this.field_M = this.field_M + 16;
                                      this.field_P.field_g[1] = this.field_P.field_g[1] + 10.0;
                                      break L47;
                                    }
                                  } else {
                                    if ((var7_int ^ -1) != -44) {
                                      L48: {
                                        if (-101 == (var7_int ^ -1)) {
                                          break L48;
                                        } else {
                                          if ((var7_int ^ -1) == -83) {
                                            break L48;
                                          } else {
                                            L49: {
                                              if (84 != var7_int) {
                                                if ((var7_int ^ -1) != -84) {
                                                  if (-14 == (var7_int ^ -1)) {
                                                    var2_int = 1;
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
                                      if (!this.field_w) {
                                        break L47;
                                      } else {
                                        var6 = 1;
                                        break L47;
                                      }
                                    } else {
                                      if (mm.field_h) {
                                        this.field_P.field_g[1] = this.field_P.field_g[1] - 10.0;
                                        this.field_M = this.field_M + 32;
                                        break L47;
                                      } else {
                                        break L47;
                                      }
                                    }
                                  }
                                } else {
                                  var4++;
                                  this.field_y = false;
                                  var3--;
                                  break L47;
                                }
                              } else {
                                this.field_y = false;
                                var3--;
                                var4--;
                                break L47;
                              }
                            } else {
                              this.field_y = false;
                              var3++;
                              var4--;
                              break L47;
                            }
                          } else {
                            this.field_y = false;
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
                        this.field_P.field_g[2] = this.field_P.field_g[2] - 10.0;
                        this.field_M = this.field_M + 2;
                        break L47;
                      }
                    }
                  } else {
                    if (mm.field_h) {
                      this.field_P.field_g[2] = this.field_P.field_g[2] + 10.0;
                      this.field_M = this.field_M + 1;
                      var3++;
                      break L47;
                    } else {
                      var3++;
                      break L47;
                    }
                  }
                }
                if (2 <= ri.field_E) {
                  var7_int = po.field_z;
                  if (var7_int != 70) {
                    if (var7_int == 51) {
                      ce.field_b = true;
                      continue L3;
                    } else {
                      if (38 != var7_int) {
                        if (var7_int == 49) {
                          if (!ce.field_b) {
                            continue L3;
                          } else {
                            ko.field_b = true;
                            continue L3;
                          }
                        } else {
                          if (var7_int != 101) {
                            if (var7_int == 48) {
                              this.field_k = this.field_k - 1000;
                              continue L3;
                            } else {
                              L50: {
                                if (-81 == (var7_int ^ -1)) {
                                  break L50;
                                } else {
                                  if ((var7_int ^ -1) != -70) {
                                    if (-58 != (var7_int ^ -1)) {
                                      continue L3;
                                    } else {
                                      L51: {
                                        if (i.field_P[81]) {
                                          stackIn_117_0 = 0;
                                          break L51;
                                        } else {
                                          stackIn_117_0 = 1;
                                          break L51;
                                        }
                                      }
                                      mm.field_h = stackIn_117_0 != 0;
                                      this.field_t = this.field_t | mm.field_h;
                                      continue L3;
                                    }
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                              L52: {
                                this.field_k = 0;
                                this.field_T = ki.a("ff9040", "ffffff", -93, this.field_T.toString());
                                this.g(62);
                                vl.field_c = null;
                                if (!je.a((byte) 117)) {
                                  gn.field_l = va.a(true, this.field_j, this.field_M, 11, this.field_o, 3, this.field_l, new int[]{this.field_U}, 65524);
                                  break L52;
                                } else {
                                  break L52;
                                }
                              }
                              this.field_l = this.field_l - this.field_U;
                              this.field_U = 0;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            }
                          } else {
                            this.field_k = this.field_k + 30000;
                            this.field_t = true;
                            continue L3;
                          }
                        }
                      } else {
                        ce.field_b = false;
                        continue L3;
                      }
                    }
                  } else {
                    ti.field_k = ti.field_k ^ true;
                    continue L3;
                  }
                } else {
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "bi.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void c(int param0) {
        try {
            field_u = null;
            field_I = null;
            field_f = null;
            if (param0 != -3) {
                sm var2 = (sm) null;
                bi.a((sm) null, 58);
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "bi.V(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1) {
        try {
            this.b(param0 ^ 5);
            eq.field_b = param1;
            this.field_A.a(true, 5, 2, false);
            la.field_k[param0].a(false);
            jh.a(la.field_k[12], param0 ^ 12);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "bi.W(" + param0 + ',' + param1 + ')');
        }
    }

    bi(Torquing param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        StringBuilder var6 = null;
        this.field_t = false;
        this.field_e = new ei();
        this.field_B = new ei();
        this.field_E = 1365;
        this.field_N = -17;
        this.field_S = -1878996731;
        this.field_L = 0;
        this.field_H = 80;
        this.field_w = false;
        this.field_F = 68616224;
        this.field_G = 0;
        this.field_i = tp.field_a;
        this.field_n = 0;
        this.field_v = 0;
        this.field_a = new int[]{0, 0, 0, 65535, 0, 0, 0, 65535, 0, 0, 0, 65535};
        this.field_Q = new kg[1];
        this.field_c = 0;
        this.field_b = new int[qc.field_ab.length];
        this.field_z = 0;
        this.field_J = false;
        try {
          L0: {
            L1: {
              this.field_o = 50456792;
              this.field_A = param0;
              dd.field_d = 0;
              ao.field_f = 0;
              this.field_M = -1046390103;
              this.field_G = this.field_G + (param1 + (param1 << -954880442));
              this.field_S = this.field_S + this.field_N * ((param1 << -1531723610) + param1);
              this.field_l = -547216422;
              this.field_j = 538264946;
              this.field_L = param1;
              if (null == gj.field_i) {
                gj.field_i = new int[12];
                ap.a(gj.field_i, il.field_m[this.field_v]);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_T == null) {
                var6 = new StringBuilder(104);
                var4 = 0;
                L3: while (true) {
                  if ((var4 ^ -1) <= -9) {
                    this.field_T = var6.toString();
                    break L2;
                  } else {
                    discarded$0 = var6.append("<col=ffffff>");
                    discarded$1 = var6.append(fh.field_s.charAt(var4));
                    var4++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            this.field_d = ol.field_f[param1];
            this.field_q = 1 + wi.field_a[param1];
            this.field_P = new vg();
            this.h(104);
            vl.field_c = null;
            gn.field_l = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("bi.<init>(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
    }

    static {
        field_u = null;
        field_I = "Suggested names: ";
    }
}
