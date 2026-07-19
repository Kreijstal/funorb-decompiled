/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk extends w {
    static String field_o;
    private long field_f;
    static String[] field_j;
    private int field_g;
    static int field_d;
    private long field_h;
    private long field_m;
    static int field_i;
    static int field_e;
    private int field_k;
    private long[] field_l;
    static int[] field_n;

    final static ei a(ei param0, byte param1) {
        hj discarded$2 = null;
        RuntimeException var2 = null;
        qm var3 = null;
        int var4 = 0;
        lb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ei var9 = null;
        ei stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ei stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param1 == -127) {
                break L1;
              } else {
                discarded$2 = mk.a(67, -35, -105);
                break L1;
              }
            }
            var9 = new ei();
            var3 = ((vj) (param0.field_b[-1 + param0.field_e])).a(0);
            var4 = 0;
            L2: while (true) {
              if (var4 >= param0.field_e) {
                stackOut_8_0 = (ei) (var9);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                var5 = (lb) (param0.field_b[var4]);
                var5.field_r.field_h = var3.field_h;
                var5.field_r.field_f = var3.field_f;
                var6 = -var5.field_r.field_h + var5.field_s.field_h;
                var7 = -var5.field_r.field_f + var5.field_s.field_f;
                if (4 <= var6 * var6 + var7 * var7) {
                  var3 = var5.field_s;
                  var9.a(var5, (byte) 6);
                  var4++;
                  continue L2;
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("mk.F(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, ib param4, int param5) {
        RuntimeException var6 = null;
        nl[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        nl[] var10 = null;
        af var11 = null;
        Object stackIn_3_0 = null;
        java.awt.Frame stackIn_28_0 = null;
        Object stackIn_38_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_37_0 = null;
        java.awt.Frame stackOut_27_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var9 = HoldTheLine.field_D;
        try {
          L0: {
            if (param4.a(true)) {
              L1: {
                if (0 != param2) {
                  break L1;
                } else {
                  var10 = oh.a(param4, (byte) 111);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        if (param1 == var10[var8].field_b) {
                          L3: {
                            if (param3 == var10[var8].field_a) {
                              L4: {
                                if (-1 == (param5 ^ -1)) {
                                  break L4;
                                } else {
                                  if (param5 == var10[var8].field_d) {
                                    break L4;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (param2 < var10[var8].field_g) {
                                    break L5;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              param2 = var10[var8].field_g;
                              var7_int = 1;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          var8++;
                          continue L2;
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (param0 == 2) {
                var11 = param4.a(param5, param2, param3, param1, false);
                L6: while (true) {
                  if (var11.field_d != 0) {
                    var7 = (java.awt.Frame) (var11.field_b);
                    if (var7 != null) {
                      if ((var11.field_d ^ -1) == -3) {
                        rd.a((byte) 102, param4, var7);
                        stackOut_37_0 = null;
                        stackIn_38_0 = stackOut_37_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        return var7;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    qe.a(10L, (byte) 45);
                    continue L6;
                  }
                }
              } else {
                stackOut_27_0 = (java.awt.Frame) null;
                stackIn_28_0 = stackOut_27_0;
                decompiledRegionSelector0 = 1;
                break L0;
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
          L7: {
            var6 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var6);
            stackOut_39_1 = new StringBuilder().append("mk.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param4 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L7;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L7;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_28_0;
          } else {
            return (java.awt.Frame) ((Object) stackIn_38_0);
          }
        }
    }

    final int a(long param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        var4 = 61 % ((param1 - 27) / 36);
        if ((this.field_h ^ -1L) > (this.field_f ^ -1L)) {
          this.field_m = this.field_m + (-this.field_h + this.field_f);
          this.field_h = this.field_h + (-this.field_h + this.field_f);
          this.field_f = this.field_f + param0;
          return 1;
        } else {
          var5 = 0;
          L0: while (true) {
            L1: {
              this.field_f = this.field_f + param0;
              var5++;
              if (-11 >= (var5 ^ -1)) {
                break L1;
              } else {
                if ((this.field_h ^ -1L) < (this.field_f ^ -1L)) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_h <= this.field_f) {
                break L2;
              } else {
                this.field_f = this.field_h;
                break L2;
              }
            }
            return var5;
          }
        }
    }

    final void b(byte param0) {
        if (!(this.field_f <= this.field_h)) {
            this.field_h = this.field_h + (this.field_f - this.field_h);
        }
        int var2 = 57 % ((-67 - param0) / 36);
        this.field_m = 0L;
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        vn var9 = null;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_28_0 = null;
        String stackIn_34_0 = null;
        String stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        vn stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        String stackOut_27_0 = null;
        String stackOut_26_0 = null;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        String stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        vn stackOut_44_0 = null;
        vn stackOut_43_0 = null;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var1_int = ie.field_j;
              var2 = 0;
              if (pa.field_h != 2) {
                break L1;
              } else {
                var3_long = -cg.field_g + bb.b(-1);
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (0 > var2) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 > 98) {
                break L2;
              } else {
                mk.a(false);
                break L2;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (var3 >= ii.field_b.length) {
                break L0;
              } else {
                L4: {
                  var4 = cd.field_f[var3];
                  if (var4 < 0) {
                    var5 = hg.field_I;
                    break L4;
                  } else {
                    if (var4 == kl.field_q.field_g) {
                      var5 = ge.field_b;
                      break L4;
                    } else {
                      var5 = sd.field_c;
                      break L4;
                    }
                  }
                }
                L5: {
                  var6 = ii.field_b[var3];
                  if (2 != pa.field_h) {
                    break L5;
                  } else {
                    if (var2 != 1) {
                      break L5;
                    } else {
                      L6: {
                        if (qg.field_b.length < dg.field_b.length) {
                          stackOut_18_0 = dg.field_b.length;
                          stackIn_19_0 = stackOut_18_0;
                          break L6;
                        } else {
                          stackOut_17_0 = qg.field_b.length;
                          stackIn_19_0 = stackOut_17_0;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_19_0;
                        if (aa.field_j.length < pb.field_a.length) {
                          stackOut_21_0 = pb.field_a.length;
                          stackIn_22_0 = stackOut_21_0;
                          break L7;
                        } else {
                          stackOut_20_0 = aa.field_j.length;
                          stackIn_22_0 = stackOut_20_0;
                          break L7;
                        }
                      }
                      L8: {
                        var8 = stackIn_22_0;
                        if (6 > var3) {
                          break L8;
                        } else {
                          if (var3 < 6 - -var7) {
                            L9: {
                              if ((-var7 + var3 + (-6 - -qg.field_b.length) ^ -1) > -1) {
                                stackOut_27_0 = "";
                                stackIn_28_0 = stackOut_27_0;
                                break L9;
                              } else {
                                stackOut_26_0 = qg.field_b[-var7 + qg.field_b.length + var3 + -6];
                                stackIn_28_0 = stackOut_26_0;
                                break L9;
                              }
                            }
                            var6 = stackIn_28_0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (var3 < var7 + 7) {
                        break L5;
                      } else {
                        if (var3 >= var8 + 7 - -var7) {
                          break L5;
                        } else {
                          L10: {
                            if (aa.field_j.length > -7 + var3 - var7) {
                              stackOut_33_0 = aa.field_j[-7 + (var3 - var7)];
                              stackIn_34_0 = stackOut_33_0;
                              break L10;
                            } else {
                              stackOut_32_0 = "";
                              stackIn_34_0 = stackOut_32_0;
                              break L10;
                            }
                          }
                          var6 = stackIn_34_0;
                          break L5;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (var4 == -2) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  stackOut_38_0 = (String) (var6);
                  stackOut_38_1 = -113;
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  if (-1 < (var4 ^ -1)) {
                    stackOut_40_0 = (String) ((Object) stackIn_40_0);
                    stackOut_40_1 = stackIn_40_1;
                    stackOut_40_2 = 0;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    stackIn_41_2 = stackOut_40_2;
                    break L12;
                  } else {
                    stackOut_39_0 = (String) ((Object) stackIn_39_0);
                    stackOut_39_1 = stackIn_39_1;
                    stackOut_39_2 = 1;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    stackIn_41_2 = stackOut_39_2;
                    break L12;
                  }
                }
                L13: {
                  var7 = h.a(stackIn_41_0, (byte) stackIn_41_1, stackIn_41_2 != 0);
                  var8 = -(var7 >> -1019571679) + field_i;
                  if (0 > var4) {
                    break L13;
                  } else {
                    L14: {
                      if (var4 == kl.field_q.field_g) {
                        stackOut_44_0 = na.field_p;
                        stackIn_45_0 = stackOut_44_0;
                        break L14;
                      } else {
                        stackOut_43_0 = qm.field_e;
                        stackIn_45_0 = stackOut_43_0;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_45_0;
                      var1_int = var1_int + dc.field_bb;
                      if (var9 != null) {
                        var9.a(var1_int, w.field_b + (vf.field_w << -1225228351), -51, (pg.field_G << 345411713) + var7, -pg.field_G + var8);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var1_int = var1_int + vf.field_w;
                    break L13;
                  }
                }
                L16: {
                  if (0 <= var4) {
                    q.field_a.a(var6, var8, var1_int + wg.field_b, var5, -1);
                    var1_int = var1_int + (w.field_b + vf.field_w + dc.field_bb);
                    break L16;
                  } else {
                    sj.field_G.a(var6, var8, var1_int + gh.field_i, var5, -1);
                    var1_int = var1_int + hn.field_M;
                    break L16;
                  }
                }
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "mk.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        hj[] var5 = jc.field_h;
        hj var6 = ij.a(-8096, param0, var5, param1);
        param2 = param2 - (var6.field_y - param1 >> 246788257);
        param4 = param4 - (-param0 + var6.field_s >> 1224021441);
        tc.c(10 + param4, 10 + param2, var6.field_s, var6.field_y, 0, 128);
        if (param3 != -42) {
            return;
        }
        var6.a(param4, param2);
    }

    final static void a(int param0, int param1, ih param2) {
        da var5 = null;
        int var4 = 0;
        int discarded$0 = 0;
        try {
            var5 = da.field_p;
            var5.c((byte) 33, param1);
            var5.field_l = var5.field_l + 1;
            var4 = var5.field_l;
            var5.f(111, param0);
            var5.f(111, param2.field_r);
            var5.f(111, param2.field_s);
            var5.a((byte) -58, param2.field_l);
            var5.a((byte) -58, param2.field_q);
            var5.a((byte) -58, param2.field_k);
            var5.a((byte) -58, param2.field_u);
            discarded$0 = var5.a(var4, (byte) 85);
            var5.a(-268435456, var5.field_l + -var4);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "mk.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (tc.field_d > param4) {
                param1 = param1 - (-param4 + tc.field_d);
                param4 = tc.field_d;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param4 - -param1 <= tc.field_e) {
                break L2;
              } else {
                param1 = -param4 + tc.field_e;
                break L2;
              }
            }
            L3: {
              if (tc.field_a <= param3) {
                break L3;
              } else {
                param2 = param2 - (tc.field_a + -param3);
                param3 = tc.field_a;
                break L3;
              }
            }
            L4: {
              if (tc.field_i >= param2 + param3) {
                break L4;
              } else {
                param2 = tc.field_i - param3;
                break L4;
              }
            }
            L5: {
              if (0 >= param1) {
                break L5;
              } else {
                if (param2 <= 0) {
                  break L5;
                } else {
                  var6_int = tc.field_j * param3 + param4;
                  var7 = -param1 + tc.field_j;
                  if (param0 == 255) {
                    param3 = -param2;
                    L6: while (true) {
                      if (param3 >= 0) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        param4 = -param1;
                        L7: while (true) {
                          if ((param4 ^ -1) <= -1) {
                            var6_int = var6_int + var7;
                            param3++;
                            continue L6;
                          } else {
                            var8 = tc.field_b[var6_int];
                            if ((var8 & 65280) >> -1029126936 > param5) {
                              L8: {
                                if ((var8 & 65280) >> 1616206760 >= (var8 & 16711680) >> -1512710544) {
                                  L9: {
                                    var9 = -60 + ((var8 & 16711680) >> 1172402255);
                                    if (var9 <= 255) {
                                      break L9;
                                    } else {
                                      var9 = 255;
                                      break L9;
                                    }
                                  }
                                  var10 = var8 & 65280;
                                  var10 = 65280 & -(var10 >> 880940165) + (var10 >> 827642145);
                                  var11 = (255 & var8) >> -439113245;
                                  tc.field_b[var6_int] = kc.a(kc.a(var10, var9 << 1566120400), var11);
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                              var6_int++;
                              param4++;
                              continue L7;
                            } else {
                              var6_int++;
                              param4++;
                              continue L7;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var6), "mk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final long a(int param0) {
        ei discarded$0 = null;
        this.field_h = this.field_h + this.b(10);
        if ((this.field_h ^ -1L) > (this.field_f ^ -1L)) {
            return (-this.field_h + this.field_f) / 1000000L;
        }
        if (param0 > -25) {
            ei var3 = (ei) null;
            discarded$0 = mk.a((ei) null, (byte) -102);
        }
        return 0L;
    }

    public static void a(boolean param0) {
        field_j = null;
        if (!param0) {
            field_j = (String[]) null;
        }
        field_n = null;
        field_o = null;
    }

    private final long b(int param0) {
        int var8 = 0;
        int var9 = HoldTheLine.field_D;
        if (param0 != 10) {
            field_e = 16;
        }
        long var2 = System.nanoTime();
        long var4 = -this.field_m + var2;
        this.field_m = var2;
        if (var4 > -5000000000L) {
            if (5000000000L > var4) {
                this.field_l[this.field_k] = var4;
                this.field_k = (1 + this.field_k) % 10;
                if (!(1 <= this.field_g)) {
                    this.field_g = this.field_g + 1;
                }
            }
        }
        long var6 = 0L;
        for (var8 = 1; this.field_g >= var8; var8++) {
            var6 = var6 + this.field_l[(10 + -var8 + this.field_k) % 10];
        }
        return var6 / (long)this.field_g;
    }

    final static void a(int param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            aa.field_k = false;
            if (param2 == -2698) {
              L1: {
                fi.field_nb = false;
                if (sb.field_c == null) {
                  break L1;
                } else {
                  if (sb.field_c.field_F) {
                    L2: {
                      if (-9 != (param0 ^ -1)) {
                        break L2;
                      } else {
                        L3: {
                          if (ci.field_o) {
                            param1 = wb.field_j;
                            break L3;
                          } else {
                            param1 = sg.field_Z;
                            break L3;
                          }
                        }
                        param0 = 2;
                        lh.field_a.a(param2 ^ 2795, ec.field_v);
                        break L2;
                      }
                    }
                    L4: {
                      var3_int = 1;
                      if (10 != param0) {
                        break L4;
                      } else {
                        var3_int = 0;
                        be.a(17902);
                        break L4;
                      }
                    }
                    L5: {
                      if (var3_int != 0) {
                        L6: {
                          if (fi.field_nb) {
                            param1 = sd.a(fk.field_d, new String[]{param1}, true);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (!gn.field_g) {
                            break L7;
                          } else {
                            param1 = mi.field_g;
                            break L7;
                          }
                        }
                        sb.field_c.a(true, param1, param0);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (-257 == (param0 ^ -1)) {
                      break L1;
                    } else {
                      if (10 != param0) {
                        if (!ci.field_o) {
                          lh.field_a.j(param2 ^ -2692);
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                  } else {
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
          L8: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var3);
            stackOut_27_1 = new StringBuilder().append("mk.M(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static hj a(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        int var4 = -105 / ((66 - param1) / 56);
        hj var7 = new hj(param2, param2);
        hj var3 = var7;
        for (var5 = 0; var3.field_z.length > var5; var5++) {
            var7.field_z[var5] = param0;
        }
        return var3;
    }

    mk() {
        this.field_g = 1;
        this.field_f = 0L;
        this.field_h = 0L;
        this.field_m = 0L;
        this.field_k = 0;
        this.field_l = new long[10];
        this.field_h = System.nanoTime();
        this.field_f = System.nanoTime();
    }

    final static void a(boolean param0, kk param1) {
        if (null != param1.field_p) {
            ai.a((byte) -123, param1.field_p);
        }
        if (!param0) {
            return;
        }
        try {
            param1.d(0);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "mk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_o = "Effects will stack, so holding one <col=1>red</col> and<br> two <col=1>blue</col> will give mines and a major shield.";
        field_e = 256;
        field_n = new int[4];
    }
}
