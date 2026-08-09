/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends eh {
    static ui field_l;
    int field_r;
    private int field_o;
    private int field_j;
    private lm field_q;
    static ei field_p;
    tl field_t;
    private int field_k;
    static String field_s;
    static int field_n;
    private int field_m;
    static int field_u;

    final static ak a(fj param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ak stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -118 / ((12 - param1) / 49);
            stackIn_1_0 = new ak(param0.g(65536), param0.g(65536), param0.g(65536), param0.g(65536), param0.e((byte) 62), param0.i((byte) -101));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("tl.E(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    tl(int param0, int param1, int param2, int param3, int param4) {
        super((double)param0, (double)param1, (double)param2);
        this.field_j = param2;
        this.field_r = param3;
        this.field_o = param1;
        this.field_m = param0;
        this.field_k = param4;
    }

    final boolean f(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 25468) {
          L0: {
            L1: {
              if (7 != this.field_r) {
                break L1;
              } else {
                if (0 == this.field_k) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    public static void d(byte param0) {
        field_s = null;
        field_l = null;
        if (param0 >= -95) {
            field_u = -20;
        }
        field_p = null;
    }

    final lm a(byte param0) {
        if (param0 > -24) {
            this.field_t = (tl) null;
        }
        return (lm) ((Object) new ej(this.field_g[0], this.field_g[1], this.field_g[2], (double)this.e(-109)));
    }

    final kh d(int param0) {
        kh var2;
        int var3;
        int var4;
        int var5;
        int var6;
        kh var7;
        kh var8;
        kh var9;
        kh var10;
        var6 = Torquing.field_u;
        if ((this.field_r ^ -1) != -3) {
          if ((this.field_r ^ -1) != -2) {
            if (param0 != -2) {
              return (kh) null;
            } else {
              return vc.field_c[this.field_r];
            }
          } else {
            L0: {
              var2 = (kh) ((Object) on.field_e.a((long)this.field_k, (byte) 94));
              if (var2 == null) {
                L1: {
                  var8 = new kh(vc.field_c[this.field_r], true, false, true, true);
                  var10 = var8;
                  var2 = var10;
                  if (this.field_k > 100) {
                    if (this.field_k > 250) {
                      if ((this.field_k ^ -1) >= -501) {
                        var3 = 107;
                        break L1;
                      } else {
                        var3 = 12256;
                        break L1;
                      }
                    } else {
                      var3 = 3800;
                      break L1;
                    }
                  } else {
                    var3 = 127;
                    break L1;
                  }
                }
                var4 = var10.field_l.field_g - 1;
                L2: while (true) {
                  if ((var4 ^ -1) > -1) {
                    on.field_e.a(false, (long)this.field_k, var10);
                    break L0;
                  } else {
                    if (var8.field_l.field_m[var4] == 127) {
                      var8.field_l.field_m[var4] = (short)var3;
                      var4--;
                      continue L2;
                    } else {
                      var4--;
                      continue L2;
                    }
                  }
                }
              } else {
                break L0;
              }
            }
            return var2;
          }
        } else {
          L3: {
            var2 = (kh) ((Object) og.field_k.a((long)this.field_k, (byte) 117));
            if (var2 == null) {
              L4: {
                var7 = new kh(vc.field_c[this.field_r], true, false, true, true);
                var9 = var7;
                var2 = var9;
                if (this.field_k > 5) {
                  if (this.field_k > 10) {
                    if (-16 > (this.field_k ^ -1)) {
                      if (this.field_k <= 20) {
                        var4 = 1023;
                        var3 = 0;
                        break L4;
                      } else {
                        if (25 >= this.field_k) {
                          var3 = 44032;
                          var4 = 1023;
                          break L4;
                        } else {
                          if ((this.field_k ^ -1) >= -31) {
                            var3 = 21504;
                            var4 = 1023;
                            break L4;
                          } else {
                            var4 = 1023;
                            var3 = 11264;
                            break L4;
                          }
                        }
                      }
                    } else {
                      var3 = 5120;
                      var4 = 1023;
                      break L4;
                    }
                  } else {
                    var3 = 96;
                    var4 = 0;
                    break L4;
                  }
                } else {
                  var4 = 0;
                  var3 = 32;
                  break L4;
                }
              }
              var5 = var9.field_l.field_g + -1;
              L5: while (true) {
                if ((var5 ^ -1) > -1) {
                  og.field_k.a(false, (long)this.field_k, var9);
                  break L3;
                } else {
                  if ((var7.field_l.field_m[var5] ^ -1) != -128) {
                    var9.field_l.field_m[var5] = (short)gm.a(ie.a((int) var7.field_l.field_m[var5], var4), var3);
                    var5--;
                    continue L5;
                  } else {
                    var5--;
                    continue L5;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          return var2;
        }
    }

    final static h a(int param0, int param1, int param2, int param3) {
        if (param3 != 0) {
            tl.a(44, -118, 22, -115);
        }
        h var4 = new h();
        var4.field_k = new int[param2];
        var4.field_m = param1;
        to.field_s.a((byte) 54, var4);
        va.a(var4, (byte) 119, param0);
        return var4;
    }

    final void a(bi param0, int param1) {
        ei stackIn_43_0;
        int stackIn_43_1;
        sb stackIn_43_2;
        sb stackIn_43_3;
        String stackIn_43_4;
        int stackIn_43_5;
        int stackIn_43_6;
        ei stackIn_44_0;
        int stackIn_44_1;
        sb stackIn_44_2;
        sb stackIn_44_3;
        String stackIn_44_4;
        int stackIn_44_5;
        int stackIn_44_6;
        int stackIn_44_7;
        ei stackIn_47_0;
        int stackIn_47_1;
        sb stackIn_47_2;
        sb stackIn_47_3;
        String stackIn_47_4;
        int stackIn_47_5;
        int stackIn_47_6;
        ei stackIn_48_0;
        int stackIn_48_1;
        sb stackIn_48_2;
        sb stackIn_48_3;
        String stackIn_48_4;
        int stackIn_48_5;
        int stackIn_48_6;
        int stackIn_48_7;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var10 = Torquing.field_u;
        try {
          L0: {
            if (param1 == 19) {
              L1: {
                var13 = gj.field_i;
                var12 = var13;
                var11 = var12;
                var3 = var11;
                var4 = (-var13[2] + this.field_j) * var13[5] + var13[3] * (-var13[0] + this.field_m) - -((-var13[1] + this.field_o) * var13[4]) >> -1378221168;
                var5 = (this.field_j + -var13[2]) * var13[8] + ((-var13[1] + this.field_o) * var13[7] + var13[6] * (this.field_m - var13[0])) >> 1817498320;
                var6 = var13[9] * (-var13[0] + this.field_m) - -(var13[10] * (this.field_o + -var13[1])) + var13[11] * (this.field_j + -var13[2]) >> 1890150896;
                var7 = (var4 << -81261975) / var6 + be.field_g;
                var8 = (var5 << -1017731031) / var6 + be.field_b;
                var9 = this.field_r;
                if (0 == var9) {
                  param0.g(param1 ^ 111);
                  th.a(100, th.field_F[18]);
                  la.field_k[11].a(false);
                  jh.a(la.field_k[11], 0);
                  break L1;
                } else {
                  if ((var9 ^ -1) != -2) {
                    if (var9 == 2) {
                      L2: {
                        param0.b((byte) 122, 1000 * this.field_k);
                        stackIn_47_0 = param0.field_e;

                        stackIn_47_1 = 54;

                        stackIn_47_2 = null;

                        stackIn_47_3 = null;

                        stackIn_47_4 = wh.a(this.field_k * 1000, (byte) 21);

                        stackIn_47_5 = var7;

                        stackIn_47_6 = var8;

                        if (-31 >= (this.field_k ^ -1)) {
                          stackIn_48_0 = (ei) ((Object) stackIn_47_0);
                          stackIn_48_1 = stackIn_47_1;
                          stackIn_48_2 = null;
                          stackIn_48_3 = null;
                          stackIn_48_4 = (String) ((Object) stackIn_47_4);
                          stackIn_48_5 = stackIn_47_5;
                          stackIn_48_6 = stackIn_47_6;
                          stackIn_48_7 = 2;
                          break L2;
                        } else {
                          stackIn_48_0 = (ei) ((Object) stackIn_47_0);
                          stackIn_48_1 = stackIn_47_1;
                          stackIn_48_2 = null;
                          stackIn_48_3 = null;
                          stackIn_48_4 = (String) ((Object) stackIn_47_4);
                          stackIn_48_5 = stackIn_47_5;
                          stackIn_48_6 = stackIn_47_6;
                          stackIn_48_7 = 3;
                          break L2;
                        }
                      }
                      ((ei) (Object) stackIn_48_0).a((byte) stackIn_48_1, new sb(stackIn_48_4, stackIn_48_5, stackIn_48_6, stackIn_48_7));
                      th.a(100, th.field_F[7]);
                      break L1;
                    } else {
                      if (-5 == (var9 ^ -1)) {
                        param0.c((byte) 122);
                        param0.field_e.a((byte) 54, new sb(gi.field_b, var7, var8, 3));
                        th.a(100, th.field_F[9]);
                        break L1;
                      } else {
                        if (var9 == 5) {
                          param0.a((byte) 121);
                          th.a(100, th.field_F[8]);
                          th.a(100, th.field_F[27]);
                          break L1;
                        } else {
                          if ((var9 ^ -1) != -8) {
                            if (-7 != (var9 ^ -1)) {
                              if ((var9 ^ -1) == -9) {
                                param0.a(0);
                                param0.field_e.a((byte) 54, new sb(je.field_i, var7, var8, 3));
                                th.a(param1 + 81, th.field_F[18]);
                                break L1;
                              } else {
                                L3: {
                                  if (9 != var9) {
                                    if (-11 != (var9 ^ -1)) {
                                      if ((var9 ^ -1) != -12) {
                                        if (var9 != 12) {
                                          if (var9 != 13) {
                                            if ((var9 ^ -1) != -15) {
                                              if (var9 != 15) {
                                                if (-17 != (var9 ^ -1)) {
                                                  L4: {
                                                    if ((var9 ^ -1) == -18) {
                                                      break L4;
                                                    } else {
                                                      if (18 == var9) {
                                                        break L4;
                                                      } else {
                                                        if (-20 != (var9 ^ -1)) {
                                                          if (var9 == 21) {
                                                            break L4;
                                                          } else {
                                                            if ((var9 ^ -1) == -21) {
                                                              break L4;
                                                            } else {
                                                              if (-23 == (var9 ^ -1)) {
                                                                break L4;
                                                              } else {
                                                                if (-24 == (var9 ^ -1)) {
                                                                  break L4;
                                                                } else {
                                                                  if (-25 != (var9 ^ -1)) {
                                                                    break L1;
                                                                  } else {
                                                                    break L4;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          break L4;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  param0.a((byte) 113, 1000);
                                                  param0.field_e.a((byte) 54, new sb(nc.field_c, var7, var8, 3));
                                                  param0.a((byte) -68, vc.field_c[this.field_r], 1092, 72);
                                                  param0.field_i = vc.field_c[this.field_r];
                                                  param0.field_z = param0.field_z | 1 << param0.field_d.field_s;
                                                  la.field_k[10].g();
                                                  jh.a(la.field_k[10], 0);
                                                  break L1;
                                                } else {
                                                  param0.field_e.a((byte) 54, new sb(Integer.toString(1000), var7, var8, 2));
                                                  param0.a((byte) 124, 1000);
                                                  param0.a(-9 + this.field_r, -73);
                                                  break L1;
                                                }
                                              } else {
                                                break L3;
                                              }
                                            } else {
                                              break L3;
                                            }
                                          } else {
                                            break L3;
                                          }
                                        } else {
                                          break L3;
                                        }
                                      } else {
                                        break L3;
                                      }
                                    } else {
                                      break L3;
                                    }
                                  } else {
                                    break L3;
                                  }
                                }
                                param0.field_e.a((byte) 54, new sb(Integer.toString(1000), var7, var8, 2));
                                param0.a((byte) 124, 1000);
                                param0.a(-9 + this.field_r, -73);
                                break L1;
                              }
                            } else {
                              param0.e(-7045);
                              param0.field_e.a((byte) 54, new sb(ea.field_u, var7, var8, 3));
                              th.a(param1 ^ 119, th.field_F[19]);
                              th.a(100, th.field_F[10]);
                              break L1;
                            }
                          } else {
                            param0.a(this.field_c, this.field_g[1], this.field_g[0], this.field_h, this.field_g[2], 0);
                            th.a(param1 + 81, th.field_F[13]);
                            break L1;
                          }
                        }
                      }
                    }
                  } else {
                    L5: {
                      param0.a((byte) 98, this.field_k);
                      stackIn_43_0 = param0.field_e;

                      stackIn_43_1 = 54;

                      stackIn_43_2 = null;

                      stackIn_43_3 = null;

                      stackIn_43_4 = Integer.toString(this.field_k);

                      stackIn_43_5 = var7;

                      stackIn_43_6 = var8;

                      if ((this.field_k ^ -1) > -501) {
                        stackIn_44_0 = (ei) ((Object) stackIn_43_0);
                        stackIn_44_1 = stackIn_43_1;
                        stackIn_44_2 = null;
                        stackIn_44_3 = null;
                        stackIn_44_4 = (String) ((Object) stackIn_43_4);
                        stackIn_44_5 = stackIn_43_5;
                        stackIn_44_6 = stackIn_43_6;
                        stackIn_44_7 = 3;
                        break L5;
                      } else {
                        stackIn_44_0 = (ei) ((Object) stackIn_43_0);
                        stackIn_44_1 = stackIn_43_1;
                        stackIn_44_2 = null;
                        stackIn_44_3 = null;
                        stackIn_44_4 = (String) ((Object) stackIn_43_4);
                        stackIn_44_5 = stackIn_43_5;
                        stackIn_44_6 = stackIn_43_6;
                        stackIn_44_7 = 2;
                        break L5;
                      }
                    }
                    ((ei) (Object) stackIn_44_0).a((byte) stackIn_44_1, new sb(stackIn_44_4, stackIn_44_5, stackIn_44_6, stackIn_44_7));
                    th.a(param1 + 81, th.field_F[19]);
                    th.a(100, th.field_F[6]);
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackIn_59_0 = (RuntimeException) (var3_ref);

            stackIn_59_1 = new StringBuilder().append("tl.F(");

            if (param0 == null) {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "null";
              break L6;
            } else {
              stackIn_60_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_60_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackIn_60_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_60_0), stackIn_60_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, double[] param1) {
        double var3_double = 0.0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_double = ap.b(param1, param0, this.field_g, 0) - 30.0;
              if ((double)this.e(param0 ^ -127) <= var3_double) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("tl.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    private final int e(int param0) {
        int var2;
        rm var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          var9 = Torquing.field_u;
          var2 = -108 % ((-61 - param0) / 36);
          if (0 == al.field_e[this.field_r]) {
            var3 = this.d(-2).field_l;
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var3.field_f <= var5) {
                al.field_e[this.field_r] = (int)(0.99 + Math.sqrt((double)var4));
                break L0;
              } else {
                var6 = var3.field_M[var5];
                var7 = var3.field_E[var5];
                var8 = var7 * var7 + var6 * var6;
                if (var4 < var8) {
                  var4 = var8;
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        return al.field_e[this.field_r];
    }

    final double a(int param0, double param1) {
        if (param0 != 0) {
            this.d(-97);
        }
        if (!(!this.f(25468))) {
            this.field_g = hl.a(param1, qd.field_h, false, param0 + -6076, false, false, 30.0, 0.0, this.field_a, this.field_g, qd.field_h);
            this.c(0);
            this.field_h.a(this.d(-2), this.field_f);
        }
        return ap.a(this.field_g, 0, re.field_d, 0);
    }

    final void e(byte param0) {
        this.field_g = new double[13];
        this.field_g[2] = (double)this.field_j;
        this.field_g[1] = (double)this.field_o;
        this.field_g[6] = 1.0;
        this.field_g[0] = (double)this.field_m;
        if (param0 >= -77) {
          return;
        } else {
          L0: {
            if (3 == this.field_r) {
              break L0;
            } else {
              L1: {
                if ((this.field_r ^ -1) > -26) {
                  break L1;
                } else {
                  if ((this.field_r ^ -1) < -32) {
                    break L1;
                  } else {
                    break L0;
                  }
                }
              }
              he.a(this.field_a, 0.08, this.field_g, 16777215, 30.0);
              break L0;
            }
          }
          L2: {
            this.c(0);
            this.field_d = null;
            if (null != this.field_q) {
              this.field_d = this.field_q;
              break L2;
            } else {
              this.b(1);
              this.field_q = this.field_d;
              break L2;
            }
          }
          return;
        }
    }

    static {
        field_l = new ui(0, 0);
        field_s = "Orb points: <%0>";
        field_p = new ei();
    }
}
