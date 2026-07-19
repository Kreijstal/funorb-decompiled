/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends sq {
    static String field_h;
    int[] field_g;
    static int field_e;
    private int[] field_f;

    final boolean a(int param0, byte param1, qe param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 9) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            if (-1 == (param0 ^ -1)) {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              if ((param0 ^ -1) == -9) {
                L2: {
                  if (-3 != (param2.field_z ^ -1)) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L2;
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L2;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var4_int = this.b(param0, 30554);
                  if ((param2.field_z ^ -1) == 0) {
                    L4: {
                      if (var4_int == 0) {
                        break L4;
                      } else {
                        if (-2 != (var4_int ^ -1)) {
                          stackOut_12_0 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    stackOut_11_0 = 1;
                    stackIn_13_0 = stackOut_11_0;
                    break L3;
                  } else {
                    if (param2.field_z != var4_int) {
                      stackOut_7_0 = 0;
                      stackIn_13_0 = stackOut_7_0;
                      break L3;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_13_0 = stackOut_6_0;
                      break L3;
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("af.EA(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_17_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        RuntimeException decompiledCaughtException = null;
        var14 = Pool.field_O;
        try {
          L0: {
            L1: {
              var6_int = 8 + param1 + 8 + 487 + param3;
              wa.field_hb.b(3, 2147483647, 3, var6_int + -6, fl.field_q.field_Db + -6);
              var7 = -5 + wa.field_hb.field_Db;
              ph.field_d.b(-param2 + var7, 2147483647, 5, param3 + 2 + 485 + param1, param2);
              pa.field_J.b(0, 2147483647, param1, -param1 + (ph.field_d.field_gb + -fj.field_j.field_gb), param2);
              fj.field_j.b(0, 2147483647, param1 + pa.field_J.field_gb, fj.field_j.field_gb, param2);
              var7 = var7 - (2 + param2);
              qd.field_b.a(param3, -5 + var7, (byte) -112, 2, param3 + 2 + (485 + param1), 5, 5);
              if (sg.field_J == null) {
                break L1;
              } else {
                sg.field_J.a(qd.field_b.field_gb, qd.field_b.field_qb, qd.field_b.field_Db, false, qd.field_b.field_eb);
                break L1;
              }
            }
            L2: {
              var8 = fl.field_q.field_gb + (-param1 - var6_int);
              var9 = var8 / 2;
              if (param4 == 36) {
                break L2;
              } else {
                field_h = (String) null;
                break L2;
              }
            }
            var10 = var9 - -param0 - -param1;
            var11 = 0;
            var12 = 0;
            L3: while (true) {
              if ((var12 ^ -1) <= -7) {
                break L0;
              } else {
                L4: {
                  L5: {
                    if (var12 >= 5) {
                      break L5;
                    } else {
                      if (il.field_g[var12] == null) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var13 = var11 * (-6 + (fl.field_q.field_Db - -2)) / (bq.field_m + 1) + 3;
                  var11++;
                  var7 = -var13 + 1 - -((2 + (-6 + fl.field_q.field_Db)) * var11 / (1 + bq.field_m));
                  if (5 > var12) {
                    il.field_g[var12].b(var13, 2147483647, var6_int, var8, var7);
                    ln.field_v[var12].b(0, param4 ^ 2147483611, param1, var9 - param1, var7);
                    uo.field_Mb[var12].b(param5, 2147483647, var9, param0, var7 - param5 + -param5);
                    ta.field_b[var12].b(param5, 2147483647, var10, -var10 + var8 + -param1, -param5 + (var7 + -param5));
                    break L4;
                  } else {
                    d.field_e.b(var13, 2147483647, var6_int, var8, var7);
                    break L4;
                  }
                }
                var12++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var6), "af.RA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    af(al param0) {
        super(param0);
        try {
            if (param0.field_n >= 2) {
                this.field_f = new int[]{-1, -1};
            }
            this.field_g = new int[]{-1, -1};
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "af.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void h(byte param0) {
        dd[] discarded$0 = null;
        field_h = null;
        if (param0 >= -2) {
            discarded$0 = af.a(-47, 110, -56, 55, 78);
        }
    }

    final int a(qe param0, byte param1) {
        dd[] discarded$2 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param1 > 82) {
                break L1;
              } else {
                discarded$2 = af.a(66, 112, 38, -91, 125);
                break L1;
              }
            }
            if (this.field_f == null) {
              stackOut_12_0 = (1 + param0.field_L) % this.field_d.field_n;
              stackIn_13_0 = stackOut_12_0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              var3_int = this.field_d.field_n / 2;
              var4 = param0.field_L / var3_int;
              var5 = (var4 - -1) % 2;
              var7 = 1;
              L2: while (true) {
                if (var7 > var3_int) {
                  stackOut_10_0 = param0.field_L;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var8 = (this.field_f[var5] - -var7) % var3_int;
                  var6 = var3_int * var5 + var8;
                  if (0 != (1 << var6 & this.field_d.field_p)) {
                    var7++;
                    continue L2;
                  } else {
                    this.field_f[var5] = var8;
                    stackOut_7_0 = var6;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("af.I(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final void c(int param0) {
        if (param0 > -25) {
            return;
        }
        wj.field_S[10] = dq.field_a.a((byte) 96, 0);
        wj.field_S[11] = dq.field_a.a((byte) 40, 1);
    }

    final int b(int param0) {
        int var2 = 90 % ((-79 - param0) / 38);
        return 1;
    }

    private final boolean r(int param0) {
        if (param0 != 9) {
            return false;
        }
        return true;
    }

    private final int c(byte param0) {
        if (param0 != 116) {
            this.field_f = (int[]) null;
        }
        return this.u(4);
    }

    final static dd[] a(int param0, int param1, int param2, int param3, int param4) {
        dd[] var6 = new dd[9];
        dd[] var5 = var6;
        if (param1 != 64) {
            af.a(-37, true);
        }
        dd dupTemp$0 = ad.a(param3, param4, 7);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        dd dupTemp$1 = ad.a(param2, param4, 7);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (!(param0 == 0)) {
            var6[4] = ad.a(param0, 64, 7);
        }
        return var5;
    }

    private final int d(byte param0) {
        int var2 = -75 % ((27 - param0) / 44);
        return 0;
    }

    final int a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        aa var6_ref_aa = null;
        int var7 = 0;
        cr var7_ref_cr = null;
        int var8 = 0;
        int var9_int = 0;
        aa var9 = null;
        cr var10_ref_cr = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        qe var13 = null;
        qe var14 = null;
        int stackIn_94_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackOut_93_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_94_0 = 0;
        int stackOut_94_1 = 0;
        var12 = Pool.field_O;
        var13 = this.field_d.j(76);
        var14 = var13;
        if (var14 != null) {
          if ((var14.field_q ^ -1) == -3) {
            L0: {
              var3 = var14.field_z;
              var4 = 0;
              if (!this.field_d.d((byte) 123)) {
                break L0;
              } else {
                var14.a(3, -14, new int[]{this.field_d.field_A});
                var14.field_t = true;
                var4 = var4 | (this.q(1) | um.field_c);
                var14.field_w = (byte)(var14.field_w - 1);
                break L0;
              }
            }
            L1: {
              if (var14.field_n != 8) {
                if (var14.field_n == -1) {
                  var14.a(7, -14, new int[]{var13.field_L});
                  var14.field_t = true;
                  var4 = var4 | this.w(-2);
                  var14.field_w = (byte)(var14.field_w - 1);
                  break L1;
                } else {
                  if (var3 == -1) {
                    break L1;
                  } else {
                    if (this.b(var14.field_n, 30554) == var3) {
                      break L1;
                    } else {
                      var14.a(1, -14, new int[]{var13.field_L});
                      var14.field_t = true;
                      var4 = var4 | this.b(true);
                      var14.field_w = (byte)(var14.field_w - 1);
                      break L1;
                    }
                  }
                }
              } else {
                if (var3 != 2) {
                  var14.a(2, -14, new int[]{var13.field_L});
                  var14.field_t = true;
                  var4 = var4 | this.o(-17);
                  var14.field_w = (byte)(var14.field_w - 1);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (var14.field_m.c(0)) {
                var5 = 0;
                var6 = 0;
                var7 = 0;
                var8 = 0;
                L3: while (true) {
                  if (var8 >= this.field_d.field_l.length) {
                    if (this.t(-91) <= var5) {
                      if (var7 < this.d((byte) 87)) {
                        L4: {
                          if (-1 != (var7 ^ -1)) {
                            var14.a(14, -14, new int[]{});
                            break L4;
                          } else {
                            var14.a(13, -14, new int[]{});
                            break L4;
                          }
                        }
                        var14.field_t = true;
                        var4 = var4 | this.e((byte) 91);
                        break L2;
                      } else {
                        if (var6 >= this.p(89)) {
                          break L2;
                        } else {
                          if (var6 != 0) {
                            var14.a(16, -14, new int[]{});
                            var14.field_t = true;
                            var4 = var4 | this.g((byte) -46);
                            break L2;
                          } else {
                            var14.a(15, -14, new int[]{});
                            var14.field_t = true;
                            var4 = var4 | this.g((byte) -46);
                            break L2;
                          }
                        }
                      }
                    } else {
                      if (0 == var5) {
                        var14.a(12, -14, new int[]{});
                        var14.field_t = true;
                        var4 = var4 | this.s(0);
                        break L2;
                      } else {
                        var14.a(6, -14, new int[]{});
                        var14.field_t = true;
                        var4 = var4 | this.s(0);
                        break L2;
                      }
                    }
                  } else {
                    if (0 < this.field_d.field_l[var8].field_c) {
                      L5: {
                        var5++;
                        var9_int = this.b(var8, 30554);
                        if (var9_int != var3) {
                          break L5;
                        } else {
                          var6++;
                          break L5;
                        }
                      }
                      if (var9_int != 0) {
                        if (var9_int != 1) {
                          var8++;
                          continue L3;
                        } else {
                          var7++;
                          var8++;
                          continue L3;
                        }
                      } else {
                        var7++;
                        var8++;
                        continue L3;
                      }
                    } else {
                      var8++;
                      continue L3;
                    }
                  }
                }
              } else {
                L6: {
                  var5 = var14.field_m.a(45);
                  if (0 != var4) {
                    break L6;
                  } else {
                    if (-2 != (var5 ^ -1)) {
                      break L6;
                    } else {
                      if (8 != ((cr) ((Object) var14.field_m.c((byte) -25))).field_n) {
                        break L6;
                      } else {
                        if (-3 == (var3 ^ -1)) {
                          return ag.field_e;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                var6_ref_aa = new aa(var14.field_m);
                var7_ref_cr = (cr) ((Object) var6_ref_aa.b((byte) -92));
                L7: while (true) {
                  if (var7_ref_cr == null) {
                    break L2;
                  } else {
                    if (var7_ref_cr.field_n != 8) {
                      var7_ref_cr = (cr) ((Object) var6_ref_aa.b(-97));
                      continue L7;
                    } else {
                      var14.a(5, -14, new int[]{this.field_d.field_A});
                      return hm.field_e;
                    }
                  }
                }
              }
            }
            L8: {
              var5 = -52 % ((param0 - -37) / 60);
              if (!var14.field_t) {
                break L8;
              } else {
                if (0 == (nr.field_Y & var4)) {
                  if (this.a((1 + this.field_d.field_A) % this.field_d.field_n, -119)) {
                    var14.a(11, -14, new int[]{});
                    var4 = this.f((byte) -30);
                    break L8;
                  } else {
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
            }
            L9: {
              if (var14.field_m.c(0)) {
                break L9;
              } else {
                var6 = 0;
                var7 = 0;
                var8 = ((cr) ((Object) var14.field_m.c((byte) 109))).field_n;
                var9 = new aa(var14.field_m);
                var10_ref_cr = (cr) ((Object) var9.b((byte) -92));
                L10: while (true) {
                  if (var10_ref_cr == null) {
                    L11: {
                      if (var4 != 0) {
                        break L11;
                      } else {
                        if ((var3 ^ -1) == 0) {
                          if (-1 <= (var7 ^ -1)) {
                            L12: {
                              this.a((int) this.b(var8, 30554), -1, var14.field_L);
                              stackOut_93_0 = var4;
                              stackIn_95_0 = stackOut_93_0;
                              stackIn_94_0 = stackOut_93_0;
                              if (this.r(9)) {
                                stackOut_95_0 = stackIn_95_0;
                                stackOut_95_1 = nd.field_j;
                                stackIn_96_0 = stackOut_95_0;
                                stackIn_96_1 = stackOut_95_1;
                                break L12;
                              } else {
                                stackOut_94_0 = stackIn_94_0;
                                stackOut_94_1 = 0;
                                stackIn_96_0 = stackOut_94_0;
                                stackIn_96_1 = stackOut_94_1;
                                break L12;
                              }
                            }
                            var4 = stackIn_96_0 | stackIn_96_1;
                            var4 = var4 | i.field_m;
                            break L9;
                          } else {
                            L13: {
                              var10 = this.v(-13243);
                              var11 = 3 & var10;
                              if (var11 != 0) {
                                if ((var11 ^ -1) != -2) {
                                  break L13;
                                } else {
                                  var4 = var4 | (oa.field_b | i.field_m);
                                  break L13;
                                }
                              } else {
                                var4 = var4 | i.field_m;
                                this.a((int) this.b(var8, 30554), -1, var14.field_L);
                                break L13;
                              }
                            }
                            L14: {
                              if ((8 & var10 ^ -1) != -9) {
                                break L14;
                              } else {
                                var4 = var4 | nd.field_j;
                                break L14;
                              }
                            }
                            return var4;
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                    if ((var7 ^ -1) >= -1) {
                      if (-1 != (var4 ^ -1)) {
                        break L9;
                      } else {
                        if (0 < var6) {
                          var4 = var4 | nd.field_j;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                    } else {
                      var14.a(4, -14, new int[]{this.field_d.field_A});
                      var14.field_t = true;
                      var4 = var4 | this.c((byte) 116);
                      break L9;
                    }
                  } else {
                    L15: {
                      if (0 == (var10_ref_cr.field_n & 7)) {
                        break L15;
                      } else {
                        if (var3 != -1) {
                          if (this.b(var10_ref_cr.field_n, 30554) == var3) {
                            var14.field_w = (byte)(var14.field_w + 1);
                            var6++;
                            break L15;
                          } else {
                            var14.field_w = (byte)(var14.field_w - 1);
                            var7++;
                            break L15;
                          }
                        } else {
                          if (this.a(var8, var10_ref_cr.field_n, (byte) 35)) {
                            var14.field_w = (byte)(var14.field_w + 1);
                            var6++;
                            break L15;
                          } else {
                            var7++;
                            var14.field_w = (byte)(var14.field_w + 1);
                            break L15;
                          }
                        }
                      }
                    }
                    var10_ref_cr = (cr) ((Object) var9.b(-108));
                    continue L10;
                  }
                }
              }
            }
            L16: {
              if (!this.field_d.a(false, (byte) 69, var14)) {
                if (!this.a(var14.field_L % this.field_d.field_n, -57)) {
                  break L16;
                } else {
                  var14.field_w = (byte)(var14.field_w - 1);
                  break L16;
                }
              } else {
                if (this.a((1 + var14.field_L) % this.field_d.field_n, -122)) {
                  var14.field_w = (byte)(var14.field_w + 1);
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            return var4;
          } else {
            throw new IllegalStateException("Shot not finished yet, foo!");
          }
        } else {
          throw new IllegalStateException("Couldn't get the last shot to examine!");
        }
    }

    final int[] a(int param0, byte param1) {
        if (param1 != -32) {
            field_e = -117;
        }
        return uj.field_a;
    }

    private final boolean a(int param0, int param1, byte param2) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param2 > 25) {
            break L0;
          } else {
            this.field_g = (int[]) null;
            break L0;
          }
        }
        L1: {
          if ((param0 & 7) == 0) {
            break L1;
          } else {
            if ((param1 & 7) == 0) {
              break L1;
            } else {
              L2: {
                if (this.b(param0, 30554) != this.b(param1, 30554)) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              return stackIn_9_0 != 0;
            }
          }
        }
        return false;
    }

    final int b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Pool.field_O;
        if (param0 < -113) {
          var3 = this.field_d.field_n / 2;
          param1 = param1 % 2;
          var4 = 0;
          var5 = 0;
          L0: while (true) {
            if (var3 <= var5) {
              return var4;
            } else {
              var6 = var5 + var3 * param1;
              if (this.a((byte) 36, var6)) {
                if ((1 << var6 & this.field_d.field_p) == 0) {
                  var4 = var4 | 1 << var6;
                  var5++;
                  continue L0;
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return -16;
        }
    }

    final boolean a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] stackIn_1_0 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int[] stackOut_0_0 = null;
        int[] stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int[] stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var9 = Pool.field_O;
          this.field_d.e(12226, 0);
          var3 = 1;
          var4 = 1;
          stackOut_0_0 = this.field_g;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (this.field_d.field_n == 1) {
            stackOut_2_0 = (int[]) ((Object) stackIn_2_0);
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (int[]) ((Object) stackIn_1_0);
            stackOut_1_1 = param0 / (this.field_d.field_n >> -12476831);
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0[stackIn_3_1];
          if (param1 <= -28) {
            break L1;
          } else {
            field_h = (String) null;
            break L1;
          }
        }
        L2: {
          if (var5 == -1) {
            var10 = 1;
            var6 = var10;
            L3: while (true) {
              if (16 <= var10) {
                break L2;
              } else {
                if ((var10 ^ -1) != -9) {
                  if (this.field_d.field_r[var10].field_j) {
                    var3 = 0;
                    break L2;
                  } else {
                    var10++;
                    continue L3;
                  }
                } else {
                  var10++;
                  continue L3;
                }
              }
            }
          } else {
            var6 = (var5 << 1912934147) + 1;
            var7 = var6 - -7;
            var8 = var6;
            L4: while (true) {
              L5: {
                if (var7 <= var8) {
                  break L5;
                } else {
                  if (this.field_d.field_l[var8].field_s) {
                    var4 = 0;
                    if (this.field_d.field_r[var8].field_j) {
                      var3 = 0;
                      break L5;
                    } else {
                      var8++;
                      continue L4;
                    }
                  } else {
                    var8++;
                    continue L4;
                  }
                }
              }
              if (var4 == 0) {
                break L2;
              } else {
                if (this.field_d.field_r[8].field_j) {
                  var3 = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
          }
        }
        return var3 != 0;
    }

    private final int w(int param0) {
        if (param0 != -2) {
            return -119;
        }
        return this.u(4);
    }

    private final int u(int param0) {
        int discarded$0 = 0;
        if (param0 != 4) {
            qe var3 = (qe) null;
            discarded$0 = this.a((qe) null, (byte) 56);
        }
        return sg.field_O | ll.field_f;
    }

    private final int p(int param0) {
        dd discarded$0 = null;
        if (param0 <= 46) {
            qe var3 = (qe) null;
            discarded$0 = this.b((qe) null, -66);
            return 0;
        }
        return 0;
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        oi var3 = null;
        fl var4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = (oi) ((Object) qr.field_a.c((byte) 69));
            L1: while (true) {
              if (var3 == null) {
                if (param1) {
                  var4 = (fl) ((Object) cq.field_g.c((byte) 83));
                  L2: while (true) {
                    if (var4 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      pm.a(var4, param0, true);
                      var4 = (fl) ((Object) cq.field_g.f((byte) -5));
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                ra.a(param0, var3, -102);
                var3 = (oi) ((Object) qr.field_a.f((byte) -5));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "af.HB(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final byte b(int param0, int param1) {
        L0: {
          if (param1 == 30554) {
            break L0;
          } else {
            field_e = -70;
            break L0;
          }
        }
        if (0 == param0) {
          return (byte) -1;
        } else {
          if ((param0 ^ -1) != -9) {
            L1: {
              if (0 > param0) {
                break L1;
              } else {
                if (-17 <= (param0 ^ -1)) {
                  return (byte)((param0 & 9) >> -1674602461);
                } else {
                  break L1;
                }
              }
            }
            return (byte) -1;
          } else {
            return (byte) 2;
          }
        }
    }

    final void a(qe param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
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
              super.a(param0, param1);
              if (null == this.field_f) {
                break L1;
              } else {
                var3_int = this.field_d.field_n / 2;
                this.field_f[this.c(-125, param0.field_L)] = param0.field_L % var3_int;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("af.K(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final int a(qe param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = Pool.field_O;
        try {
          L0: {
            var3_int = 34 % ((param1 - -32) / 40);
            var4 = param0.field_z;
            if (var4 == -1) {
              stackOut_7_0 = 9;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var4 ^ -1) == -1) {
                stackOut_9_0 = 10;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var4 != 1) {
                  if (-3 != (var4 ^ -1)) {
                    stackOut_11_0 = -1;
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    return 12;
                  }
                } else {
                  return 11;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("af.CA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    private final int s(int param0) {
        if (param0 != 0) {
            this.field_f = (int[]) null;
        }
        return (this.field_d.j(46).field_M ^ -1) > -1 ? this.u(4) : ob.field_F | sg.field_O;
    }

    private final int b(boolean param0) {
        if (!param0) {
            return 115;
        }
        return this.u(4);
    }

    final dd b(qe param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        dd stackIn_6_0 = null;
        dd stackIn_15_0 = null;
        dd stackIn_17_0 = null;
        dd stackIn_19_0 = null;
        dd stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        dd stackOut_5_0 = null;
        dd stackOut_18_0 = null;
        dd stackOut_16_0 = null;
        dd stackOut_14_0 = null;
        dd stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                break L1;
              } else {
                this.field_f = (int[]) null;
                break L1;
              }
            }
            if ((param0.field_z ^ -1) == 0) {
              stackOut_5_0 = mf.field_n;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (!(dq.field_a instanceof mf)) {
                  break L2;
                } else {
                  var3_int = param0.field_z;
                  if (0 != var3_int) {
                    if (var3_int != 1) {
                      if ((var3_int ^ -1) == -3) {
                        stackOut_18_0 = dq.field_a.field_e[8];
                        stackIn_19_0 = stackOut_18_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L2;
                      }
                    } else {
                      stackOut_16_0 = dq.field_a.field_e[10];
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackOut_14_0 = dq.field_a.field_e[1];
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackOut_20_0 = dq.field_a.field_e[param0.field_z];
              stackIn_21_0 = stackOut_20_0;
              decompiledRegionSelector0 = 4;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("af.JA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                return stackIn_21_0;
              }
            }
          }
        }
    }

    final boolean f(int param0) {
        if (param0 <= 113) {
            return true;
        }
        return true;
    }

    private final int v(int param0) {
        if (param0 != -13243) {
            field_e = 18;
        }
        return 9;
    }

    final boolean a(int param0, byte param1, int param2) {
        int discarded$0 = 0;
        if (param1 <= 122) {
            discarded$0 = this.b(-73);
        }
        return this.b(param0, (byte) 122, param2);
    }

    private final int t(int param0) {
        int var2 = -15 % ((-49 - param0) / 40);
        return (this.field_d.j(106).field_M ^ -1) > -1 ? 0 : 1;
    }

    final int e(int param0) {
        if (param0 <= 64) {
            this.field_g = (int[]) null;
        }
        return 2;
    }

    private final int q(int param0) {
        if (param0 != 1) {
            return -95;
        }
        return this.u(param0 ^ 5) | nr.field_R;
    }

    private final boolean b(int param0, byte param1, int param2) {
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 >= 19) {
          if (param0 == -1) {
            L0: {
              if ((param2 & 7) == 0) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L0;
              }
            }
            return stackIn_16_0 != 0;
          } else {
            if ((param0 ^ -1) != -3) {
              L1: {
                L2: {
                  if (0 == (param2 & 7)) {
                    break L2;
                  } else {
                    if ((1 & param2 >> -1828597245) != param0) {
                      break L2;
                    } else {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      break L1;
                    }
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L1;
              }
              return stackIn_12_0 != 0;
            } else {
              L3: {
                if (8 != param2) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L3;
                }
              }
              return stackIn_7_0 != 0;
            }
          }
        } else {
          return true;
        }
    }

    final int m(int param0) {
        if (param0 != 0) {
            af.a(108, false);
        }
        return 1;
    }

    private final boolean d(int param0, int param1) {
        int var3 = 0;
        int var4 = Pool.field_O;
        if (param0 != 85884769) {
            return false;
        }
        for (var3 = 1 + (param1 << -1102572189); (param1 << -2010250525) + 8 > var3; var3++) {
            if (!(!this.field_d.field_l[var3].field_s)) {
                return false;
            }
        }
        return true;
    }

    final void a(int param0, int param1, int param2) {
        int discarded$0 = 0;
        int var4 = -2 != (this.field_d.field_n ^ -1) ? param2 / (this.field_d.field_n >> 85884769) : 0;
        this.field_g[var4] = param0;
        if (param1 != -1) {
            discarded$0 = this.c((byte) 2);
        }
        this.field_g[1 - var4] = 1 - param0;
    }

    final int i(int param0) {
        if (param0 != 26840) {
            return -37;
        }
        return 16;
    }

    final int a(boolean param0) {
        if (param0) {
            return 0;
        }
        return 1;
    }

    final boolean c(qe param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var3_int = this.b(param0.field_n, 30554);
            if (param1 <= -33) {
              L1: {
                var4 = param0.field_z;
                if (-1 != var4) {
                  if (var3_int != var4) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L1;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L1;
                  }
                } else {
                  L2: {
                    if (var3_int == 0) {
                      break L2;
                    } else {
                      if (1 != var3_int) {
                        stackOut_8_0 = 0;
                        stackIn_12_0 = stackOut_8_0;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_7_0 = 1;
                  stackIn_12_0 = stackOut_7_0;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("af.C(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    private final int f(byte param0) {
        int discarded$0 = 0;
        if (param0 != -30) {
            discarded$0 = this.a(-100);
        }
        return sg.field_O | ll.field_f | nr.field_R | ve.field_j;
    }

    final String a(int param0, String[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        String stackIn_14_0 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_15_0 = null;
        String stackOut_13_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var7 = Pool.field_O;
        try {
          L0: {
            if (this.field_d.field_n > param0) {
              if (2 == this.field_d.field_n) {
                stackOut_15_0 = nr.a(param1, param0 ^ -2, w.field_g);
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                var3_int = param1.length >> -1931652927;
                var4 = new String[2][var3_int];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= param1.length) {
                    stackOut_13_0 = nr.a(new String[]{aq.a(-107, (CharSequence[]) ((Object) var4[0])), aq.a(-86, (CharSequence[]) ((Object) var4[1]))}, -1, ub.field_o);
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      var6 = var5 % var3_int;
                      if (var6 != 0) {
                        if (var3_int - 1 != var6) {
                          var4[var5 / var3_int][var6] = nr.a(new String[]{param1[var5]}, param0 + -2, bc.field_h);
                          break L2;
                        } else {
                          var4[var5 / var3_int][var6] = nr.a(new String[]{param1[var5]}, param0 + -2, lq.field_N);
                          break L2;
                        }
                      } else {
                        var4[var5 / var3_int][var6] = nr.a(new String[]{param1[var5]}, -1, en.field_e);
                        break L2;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("af.P(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    private final int o(int param0) {
        if (param0 != -17) {
            this.field_g = (int[]) null;
        }
        return this.u(4);
    }

    final int e(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          if (param1 > 119) {
            break L0;
          } else {
            this.field_g = (int[]) null;
            break L0;
          }
        }
        var3 = 0;
        var4 = 1 + (param0 << 1897518947);
        L1: while (true) {
          if (var4 >= (param0 << 1105205699) - -8) {
            return var3;
          } else {
            if (!this.field_d.field_l[var4].field_s) {
              var3++;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final static int c(byte param0, int param1) {
        if (param0 > -120) {
            return 48;
        }
        param1 = param1 & 8191;
        if ((param1 ^ -1) > -4097) {
            return param1 >= 2048 ? wf.field_b[-param1 + 4096] : wf.field_b[param1];
        }
        return param1 < 6144 ? -wf.field_b[-4096 + param1] : -wf.field_b[8192 + -param1];
    }

    final void a(ge param0, boolean param1) {
        int discarded$3 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                discarded$3 = this.e(99, 46);
                break L1;
              }
            }
            L2: {
              var3_int = param0.e((byte) 105);
              this.field_g[0] = var3_int >> 255384967;
              if (0 != (this.field_g[0] ^ -1)) {
                this.field_g[1] = 1 - this.field_g[0];
                break L2;
              } else {
                this.field_g[1] = -1;
                break L2;
              }
            }
            L3: {
              if (null == this.field_f) {
                break L3;
              } else {
                L4: {
                  this.field_f[0] = rb.b(7, var3_int);
                  if ((this.field_f[0] ^ -1) != -8) {
                    break L4;
                  } else {
                    this.field_f[0] = -1;
                    break L4;
                  }
                }
                this.field_f[1] = rb.b(var3_int, 63) >> -630118109;
                if (this.field_f[1] == 7) {
                  this.field_f[1] = -1;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("af.M(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    final int f(int param0, int param1) {
        dd[] discarded$0 = null;
        if (param0 != 22533) {
            discarded$0 = af.a(115, -64, -57, 83, -73);
        }
        return this.field_g[1 == this.field_d.field_n ? 0 : param1 / (this.field_d.field_n >> 1773321921)];
    }

    private final int g(byte param0) {
        if (param0 != -46) {
            return -121;
        }
        return this.s(0);
    }

    private final int e(byte param0) {
        boolean discarded$0 = false;
        if (param0 <= 52) {
            discarded$0 = this.a(11, -35, (byte) -35);
        }
        return this.s(0);
    }

    final int h(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qe var6 = null;
        L0: {
          var5 = Pool.field_O;
          var6 = this.field_d.j(param0 + 118);
          var3 = 0;
          var4 = var6.field_u;
          if (2 != var4) {
            if (-4 != (var4 ^ -1)) {
              if ((var4 ^ -1) != -2) {
                var3 = this.u(4);
                break L0;
              } else {
                var3 = this.u(param0 ^ -5) | nr.field_R;
                break L0;
              }
            } else {
              var3 = this.u(4) | nr.field_V;
              break L0;
            }
          } else {
            var3 = this.u(4) | nr.field_Q;
            break L0;
          }
        }
        L1: {
          var6.a(17, param0 + -13, new int[]{var6.field_L});
          if (this.a((var6.field_L - param0) % this.field_d.field_n, -112)) {
            var6.a(11, -14, new int[]{});
            var3 = this.f((byte) -30);
            break L1;
          } else {
            break L1;
          }
        }
        var6.field_t = true;
        return var3;
    }

    final int c(int param0, int param1) {
        if (param0 > -36) {
            this.field_f = (int[]) null;
        }
        return 1 != this.field_d.field_n ? param1 / (this.field_d.field_n >> -573043071) : 0;
    }

    final int a(int param0) {
        int var2 = 0;
        L0: {
          var2 = this.f(22533, this.field_d.field_A);
          if (param0 == -1) {
            break L0;
          } else {
            field_h = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (var2 == 0) {
              break L2;
            } else {
              if (-2 != (var2 ^ -1)) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (this.d(85884769, var2)) {
            return 2;
          } else {
            break L1;
          }
        }
        return var2;
    }

    static {
        field_h = "You have declined the invitation.";
    }
}
