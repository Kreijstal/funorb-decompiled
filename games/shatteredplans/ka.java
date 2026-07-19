/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ka implements uj {
    int field_o;
    static String field_m;
    int field_k;
    fs field_n;
    static bc field_e;
    static boolean field_a;
    static String field_f;
    int[] field_b;
    private boolean field_l;
    mn field_j;
    int[] field_i;
    private int[] field_d;
    int field_h;
    dc field_g;
    int[] field_c;

    private final int a(byte param0, int param1, int param2, int[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ln var9 = null;
        int var9_int = 0;
        ln[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        ln[] var15 = null;
        ln var16 = null;
        ln[] var17 = null;
        ln var18 = null;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var7 = 82 % ((-17 - param0) / 43);
            var6 = param2;
            var8 = this.field_o + -1;
            L1: while (true) {
              L2: {
                if (var8 < 0) {
                  break L2;
                } else {
                  if (-1 == (param2 ^ -1)) {
                    break L2;
                  } else {
                    var9_int = param3[var8];
                    if (0 == u.field_d[var9_int]) {
                      break L2;
                    } else {
                      if (0 != ol.field_a[var9_int]) {
                        L3: {
                          var10_int = ol.field_a[var9_int] * var6 / param1;
                          if (0 != var10_int) {
                            L4: {
                              if (var10_int <= param2) {
                                break L4;
                              } else {
                                var10_int = param2;
                                break L4;
                              }
                            }
                            this.c(param2, cq.field_E, -1);
                            var11 = this.a(0, true, var10_int, this.field_g.field_g.field_e[var9_int]);
                            if (var10_int < var11) {
                              throw new RuntimeException();
                            } else {
                              L5: {
                                if (var11 >= var10_int) {
                                  break L5;
                                } else {
                                  u.field_c[var9_int] = u.field_c[var9_int] + (-var11 + var10_int);
                                  break L5;
                                }
                              }
                              var5_int = var5_int + var10_int;
                              param2 = param2 - var10_int;
                              ig.field_c[var9_int] = ig.field_c[var9_int] + var11;
                              this.c(param2, cq.field_E, -1);
                              break L3;
                            }
                          } else {
                            break L3;
                          }
                        }
                        var8--;
                        continue L1;
                      } else {
                        var8--;
                        continue L1;
                      }
                    }
                  }
                }
              }
              L6: {
                if ((param2 ^ -1) < -1) {
                  var8 = 0;
                  var9 = mj.field_yb.j(18229);
                  L7: while (true) {
                    if (var9 == null) {
                      if (0 < var8) {
                        var9 = mj.field_yb.j(18229);
                        L8: while (true) {
                          if (var9 == null) {
                            break L6;
                          } else {
                            var17 = var9.field_D;
                            var11 = 0;
                            L9: while (true) {
                              L10: {
                                if (var17.length <= var11) {
                                  break L10;
                                } else {
                                  var18 = var17[var11];
                                  if (this.field_n == var18.field_y) {
                                    var11++;
                                    continue L9;
                                  } else {
                                    var13 = param2 / var8;
                                    this.a(var13, -111, var9);
                                    param2 = param2 - var13;
                                    var5_int = var5_int + var13;
                                    var8--;
                                    break L10;
                                  }
                                }
                              }
                              var9 = mj.field_yb.h(-23410);
                              continue L8;
                            }
                          }
                        }
                      } else {
                        break L6;
                      }
                    } else {
                      var15 = var9.field_D;
                      var10 = var15;
                      var11 = 0;
                      L11: while (true) {
                        L12: {
                          if (var11 >= var15.length) {
                            break L12;
                          } else {
                            var16 = var15[var11];
                            if (var16.field_y != this.field_n) {
                              var8++;
                              break L12;
                            } else {
                              var11++;
                              continue L11;
                            }
                          }
                        }
                        var9 = mj.field_yb.h(-23410);
                        continue L7;
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
              stackOut_39_0 = var5_int;
              stackIn_40_0 = stackOut_39_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var5 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var5);
            stackOut_41_1 = new StringBuilder().append("ka.QA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param3 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L13;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L13;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
        return stackIn_40_0;
    }

    final int a(int param0, ln param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ln[] var4 = null;
        int var5 = 0;
        ln var6 = null;
        mg var7 = null;
        int var8 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param1.field_D;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4.length) {
                L2: {
                  if (!this.field_g.field_o.field_l) {
                    break L2;
                  } else {
                    if (var3_int <= 1) {
                      break L2;
                    } else {
                      var3_int = 1;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (param0 == -5) {
                    break L3;
                  } else {
                    this.field_n = (fs) null;
                    break L3;
                  }
                }
                stackOut_17_0 = var3_int;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              } else {
                L4: {
                  var6 = var4[var5];
                  if (var6.field_y == this.field_n) {
                    break L4;
                  } else {
                    var7 = (mg) ((Object) lh.field_v.d(0));
                    L5: while (true) {
                      L6: {
                        if (var7 == null) {
                          break L6;
                        } else {
                          if (var7.field_B != var6) {
                            var7 = (mg) ((Object) lh.field_v.a((byte) -71));
                            continue L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (var7 != null) {
                        break L4;
                      } else {
                        var3_int++;
                        break L4;
                      }
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3);
            stackOut_19_1 = new StringBuilder().append("ka.MA(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        return stackIn_18_0;
    }

    private final void a(sd param0, int[] param1, int param2) {
        ln[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ln[] var11 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_g.field_o.field_i) {
                this.c(param2 ^ 0, param0);
                break L1;
              } else {
                this.c(0, this.field_n.field_m);
                break L1;
              }
            }
            var11 = this.field_g.field_g.field_e;
            var4 = var11;
            var5 = param2;
            L2: while (true) {
              if (var5 >= param1.length) {
                break L0;
              } else {
                var6 = param1[var5];
                var7 = var11[var6];
                var8 = this.c(var7, -5);
                var9 = this.a(var7, (byte) -127);
                cb.field_o[var6] = var8;
                hs.field_i[var6] = var9;
                ei.field_d[var6] = this.d(var7, 2);
                u.field_d[var6] = (var8 << -776442096) / var9;
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4_ref);
            stackOut_8_1 = new StringBuilder().append("ka.AB(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    private final int a(int param0, boolean param1, int param2, ln param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        ln[] var6_ref_ln__ = null;
        int var6 = 0;
        int var7 = 0;
        ln var8_ref_ln = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ln[] var11 = null;
        ln var12 = null;
        ln[] var13 = null;
        ln var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_36_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = param2;
            var6_ref_ln__ = param3.field_D;
            var7 = param0;
            L1: while (true) {
              L2: {
                if (var6_ref_ln__.length <= var7) {
                  if (var5_int == 0) {
                    break L2;
                  } else {
                    if (!param1) {
                      break L2;
                    } else {
                      if (-1 > (cq.field_E ^ -1)) {
                        L3: {
                          if (var5_int < cq.field_E) {
                            stackOut_29_0 = var5_int;
                            stackIn_30_0 = stackOut_29_0;
                            break L3;
                          } else {
                            stackOut_28_0 = cq.field_E;
                            stackIn_30_0 = stackOut_28_0;
                            break L3;
                          }
                        }
                        var6 = stackIn_30_0;
                        var5_int = var5_int - var6;
                        var13 = param3.field_D;
                        var8 = 0;
                        L4: while (true) {
                          if (var13.length <= var8) {
                            break L2;
                          } else {
                            var14 = var13[var8];
                            if (var14.field_R == mj.field_yb) {
                              this.a((byte) -67, var6, var14);
                              this.a(param3, var14, var6, param0 ^ -1);
                              break L2;
                            } else {
                              var8++;
                              continue L4;
                            }
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  var8_ref_ln = var6_ref_ln__[var7];
                  var9 = var8_ref_ln.field_p;
                  if (ja.field_i[var9] < var5_int) {
                    L5: {
                      if (ja.field_i[var9] == 0) {
                        break L5;
                      } else {
                        this.a(param3, var8_ref_ln, ja.field_i[var9], -1);
                        var5_int = var5_int - ja.field_i[var9];
                        ja.field_i[var9] = 0;
                        break L5;
                      }
                    }
                    if (var5_int != 0) {
                      var7++;
                      continue L1;
                    } else {
                      if (var5_int == 0) {
                        break L2;
                      } else {
                        if (!param1) {
                          break L2;
                        } else {
                          if (-1 > (cq.field_E ^ -1)) {
                            L6: {
                              if (var5_int < cq.field_E) {
                                stackOut_15_0 = var5_int;
                                stackIn_16_0 = stackOut_15_0;
                                break L6;
                              } else {
                                stackOut_14_0 = cq.field_E;
                                stackIn_16_0 = stackOut_14_0;
                                break L6;
                              }
                            }
                            var6 = stackIn_16_0;
                            var5_int = var5_int - var6;
                            var11 = param3.field_D;
                            var8 = 0;
                            L7: while (true) {
                              if (var11.length <= var8) {
                                break L2;
                              } else {
                                var12 = var11[var8];
                                if (var12.field_R == mj.field_yb) {
                                  this.a((byte) -67, var6, var12);
                                  this.a(param3, var12, var6, param0 ^ -1);
                                  break L2;
                                } else {
                                  var8++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  } else {
                    this.a(param3, var8_ref_ln, var5_int, param0 ^ -1);
                    ja.field_i[var9] = ja.field_i[var9] - var5_int;
                    stackOut_4_0 = param2;
                    stackIn_5_0 = stackOut_4_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              stackOut_36_0 = param2 - var5_int;
              stackIn_37_0 = stackOut_36_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var5);
            stackOut_38_1 = new StringBuilder().append("ka.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param3 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L8;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_37_0;
        }
    }

    int d(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param1 == 2) {
                break L1;
              } else {
                this.field_j = (mn) null;
                break L1;
              }
            }
            L2: {
              var3_int = this.a(-5, param0);
              if (-1 != (var3_int ^ -1)) {
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("ka.F(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    private final void c(int param0, sd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param0;
            L1: while (true) {
              if ((var3_int ^ -1) <= -5) {
                break L0;
              } else {
                lh.field_y[var3_int] = param1.field_u[param1.field_w[0]] + (-param1.field_u[var3_int] + 1);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ka.RA(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    private final int e(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        ln var2 = mj.field_yb.j(18229);
        int var3 = param0;
        while (var2 != null) {
            var4 = var2.field_p;
            var5 = this.b((byte) 89, var2);
            var3 = var3 + var5;
            ue.field_e[var4] = var5;
            var2 = mj.field_yb.h(-23410);
        }
        return var3;
    }

    int a(int param0, int param1, fs param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        fs var5 = null;
        fs var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        ln var11_ref_ln = null;
        int var11 = 0;
        int var12 = 0;
        ln[] var13 = null;
        int var14 = 0;
        ln var15 = null;
        int var16 = 0;
        int[] var17 = null;
        ln[] var18 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_59_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2.field_x;
              if (this.field_n == param2) {
                break L1;
              } else {
                if (this.field_n.field_h[var4_int]) {
                  break L1;
                } else {
                  if (-1 != (this.field_g.field_w & 1 << var4_int ^ -1)) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5 = this.field_g.field_v[this.field_g.field_m[this.field_g.field_r - 1]];
                    var6 = this.field_g.field_v[this.field_g.field_m[-2 + this.field_g.field_r]];
                    if (var5 != param2) {
                      var7 = 0;
                      var8 = param1;
                      var18 = this.field_g.field_g.field_e;
                      var10 = 0;
                      L2: while (true) {
                        if (var18.length <= var10) {
                          if (var7 <= var8 * 2) {
                            if (!var5.field_h[var4_int]) {
                              if (var5.field_h[var4_int]) {
                                stackOut_35_0 = 5;
                                stackIn_36_0 = stackOut_35_0;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              } else {
                                if (var6 == param2) {
                                  L3: {
                                    if (var5 == this.field_n) {
                                      stackOut_41_0 = -3;
                                      stackIn_42_0 = stackOut_41_0;
                                      break L3;
                                    } else {
                                      stackOut_40_0 = -2;
                                      stackIn_42_0 = stackOut_40_0;
                                      break L3;
                                    }
                                  }
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                } else {
                                  L4: {
                                    if (var7 >= var8) {
                                      break L4;
                                    } else {
                                      if (2 * this.field_g.field_D[this.field_n.field_x] <= this.field_g.field_D[var4_int] * 3) {
                                        break L4;
                                      } else {
                                        stackOut_45_0 = 3;
                                        stackIn_46_0 = stackOut_45_0;
                                        decompiledRegionSelector0 = 7;
                                        break L0;
                                      }
                                    }
                                  }
                                  var17 = ff.field_x[this.field_n.field_x];
                                  var10 = param0;
                                  var11 = 0;
                                  L5: while (true) {
                                    if (var11 >= this.field_o) {
                                      L6: {
                                        if ((var10 ^ -1) <= -6) {
                                          break L6;
                                        } else {
                                          if (var10 < param0) {
                                            stackOut_56_0 = 4;
                                            stackIn_57_0 = stackOut_56_0;
                                            decompiledRegionSelector0 = 8;
                                            break L0;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                      stackOut_58_0 = -3;
                                      stackIn_59_0 = stackOut_58_0;
                                      decompiledRegionSelector0 = 9;
                                      break L0;
                                    } else {
                                      L7: {
                                        if (!ac.field_q[var11]) {
                                          break L7;
                                        } else {
                                          if (ff.field_x[var4_int][var11] > var17[var11]) {
                                            break L7;
                                          } else {
                                            var10--;
                                            break L7;
                                          }
                                        }
                                      }
                                      var11++;
                                      continue L5;
                                    }
                                  }
                                }
                              }
                            } else {
                              stackOut_31_0 = 2;
                              stackIn_32_0 = stackOut_31_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          } else {
                            stackOut_28_0 = -1;
                            stackIn_29_0 = stackOut_28_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        } else {
                          L8: {
                            var11_ref_ln = var18[var10];
                            if (var11_ref_ln.field_y == this.field_n) {
                              var12 = 0;
                              var13 = var11_ref_ln.field_D;
                              var14 = 0;
                              L9: while (true) {
                                if (var13.length <= var14) {
                                  if (var12 != 0) {
                                    var8 = var8 + var11_ref_ln.field_x;
                                    break L8;
                                  } else {
                                    var10++;
                                    continue L2;
                                  }
                                } else {
                                  L10: {
                                    var15 = var13[var14];
                                    if (var15.field_y == param2) {
                                      var12 = 1;
                                      var7 = var7 + var15.field_x;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  var14++;
                                  continue L9;
                                }
                              }
                            } else {
                              break L8;
                            }
                          }
                          var10++;
                          continue L2;
                        }
                      }
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_60_0 = (RuntimeException) (var4);
            stackOut_60_1 = new StringBuilder().append("ka.UA(").append(param0).append(',').append(param1).append(',');
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param2 == null) {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L11;
            } else {
              stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackOut_61_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L11;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_63_0), stackIn_63_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_32_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_36_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_42_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_46_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_57_0;
                        } else {
                          return stackIn_59_0;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public final void b(byte param0) {
        int discarded$1 = 0;
        sd var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!this.field_n.field_i.g(59)) {
          L0: {
            this.d(-1);
            lh.field_D.a(0);
            lh.field_G.a(0);
            lh.field_v.a(0);
            if (param0 < -3) {
              break L0;
            } else {
              discarded$1 = this.a(-67, 25, -122);
              break L0;
            }
          }
          var2 = (sd) ((Object) this.field_n.field_i.d(0));
          var3 = 1;
          L1: while (true) {
            if (var2 == null) {
              L2: {
                if (!this.field_g.field_o.field_h) {
                  break L2;
                } else {
                  L3: {
                    if ((this.field_n.field_u[0] ^ -1) > -6) {
                      break L3;
                    } else {
                      this.h(99);
                      break L3;
                    }
                  }
                  L4: {
                    if (this.field_n.field_u[1] >= 5) {
                      this.f(26539);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if ((this.field_n.field_u[2] ^ -1) <= -6) {
                      this.b(true);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (-6 >= (this.field_n.field_u[3] ^ -1)) {
                    this.e((byte) 101);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L6: {
                if (!this.field_g.a(lh.field_v, this.field_n, -6, lh.field_D, lh.field_G)) {
                  break L6;
                } else {
                  break L6;
                }
              }
              this.field_g.a(lh.field_v, 0, lh.field_D, lh.field_G);
              return;
            } else {
              L7: {
                if (this.field_g.field_o.field_i) {
                  L8: {
                    var4 = this.field_n.field_m.field_r / this.field_n.field_i.e(0);
                    if (0 == this.field_n.field_m.field_r % this.field_n.field_i.e(0)) {
                      break L8;
                    } else {
                      if (var3 != 0) {
                        var4++;
                        var3 = 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (0 <= var4) {
                      break L9;
                    } else {
                      var4 = 0;
                      break L9;
                    }
                  }
                  this.a(var4, var2, (byte) -54);
                  break L7;
                } else {
                  this.a(var2.field_x, var2, (byte) -54);
                  break L7;
                }
              }
              var2 = (sd) ((Object) this.field_n.field_i.a((byte) -71));
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    public final void a(fs param0, byte param1) {
        int discarded$3 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -42) {
                break L1;
              } else {
                discarded$3 = this.d((ln) null, 1);
                break L1;
              }
            }
            L2: {
              var3_int = this.field_b[param0.field_x];
              var7 = var3_int;
              if (var7 == -1) {
                var4 = 10;
                break L2;
              } else {
                if ((var7 ^ -1) == 1) {
                  var4 = 11;
                  break L2;
                } else {
                  if (var7 == -3) {
                    var4 = 12;
                    var6 = this.field_g.field_m[-2 + this.field_g.field_r];
                    var5 = this.field_g.field_m[this.field_g.field_r - 1];
                    if (this.field_n.field_x == var5) {
                      break L2;
                    } else {
                      if (this.field_k == var5) {
                        break L2;
                      } else {
                        if (this.field_g.field_D[var5] * 2 <= 3 * this.field_g.field_D[var6]) {
                          break L2;
                        } else {
                          var4 = 11;
                          break L2;
                        }
                      }
                    }
                  } else {
                    var4 = -1;
                    break L2;
                  }
                }
              }
            }
            L3: {
              if (-1 != var4) {
                this.field_j.a(0, (byte) 12, param0, this.field_n, var4);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("ka.LA(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        ln var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = ShatteredPlansClient.field_F ? 1 : 0;
          var5 = 0;
          if (param2 <= param0) {
            var4 = mj.field_yb.j(18229);
            L1: while (true) {
              if (var4 == null) {
                var5 = var5 + param2;
                param0 = param0 - param2;
                break L0;
              } else {
                var6 = var4.field_p;
                var7 = ue.field_e[var6];
                wb.field_b[var6] = wb.field_b[var6] + var7;
                oe.field_i[var6] = oe.field_i[var6] + var7;
                var4 = mj.field_yb.h(-23410);
                continue L1;
              }
            }
          } else {
            var4 = mj.field_yb.j(18229);
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                var6 = var4.field_p;
                var7 = ue.field_e[var6] * param0 / param2;
                oe.field_i[var6] = oe.field_i[var6] + var7;
                param0 = param0 - var7;
                wb.field_b[var6] = wb.field_b[var6] + var7;
                var5 = var5 + var7;
                var4 = mj.field_yb.h(-23410);
                continue L2;
              }
            }
          }
        }
        if (param1 == -1814) {
          this.c(param0, cq.field_E, -1);
          return var5;
        } else {
          return 86;
        }
    }

    int c(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = cb.field_o[param0.field_p];
            var4 = 0;
            L1: while (true) {
              if (-5 >= (var4 ^ -1)) {
                L2: {
                  if (param1 == -5) {
                    break L2;
                  } else {
                    this.field_h = 120;
                    break L2;
                  }
                }
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3_int = var3_int + param0.field_G[var4] * lh.field_y[var4];
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ka.NA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    private final void h(int param0) {
        Object var2 = null;
        int var3 = 0;
        int var4_int = 0;
        qm var4 = null;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = null;
        var3 = 0;
        var4_int = 42 / ((11 - param0) / 61);
        var5 = 0;
        L0: while (true) {
          if (var5 >= this.field_o) {
            L1: {
              if (var2 != null) {
                var4 = new qm(0, this.field_n, (ln) (var2));
                lh.field_G.a((byte) -113, var4);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            var6 = this.field_g.field_g.field_e[var5];
            if (var6.field_y == this.field_n) {
              if (!var6.field_u) {
                var7 = 0;
                var8 = 0;
                L2: while (true) {
                  if (4 <= var8) {
                    var8 = (oe.field_i[var5] * 10 - -1) * var7;
                    if (var3 < var8) {
                      var3 = var8;
                      var2 = var6;
                      var5++;
                      continue L0;
                    } else {
                      var5++;
                      continue L0;
                    }
                  } else {
                    var7 = var7 + var6.field_G[var8];
                    var8++;
                    continue L2;
                  }
                }
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
    }

    private final void c(int param0, int param1, int param2) {
        int var5 = 0;
        ln var6 = null;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(param2 >= (param1 ^ -1))) {
            throw new RuntimeException();
        }
        if (param0 < 0) {
            throw new RuntimeException();
        }
        int var4 = param1;
        for (var5 = 0; var5 < this.field_o; var5++) {
            var6 = this.field_g.field_g.field_e[var5];
            var4 = var4 + ja.field_i[var5];
            var4 = var4 - wb.field_b[var5];
            var4 = var4 - u.field_c[var5];
            if (!(ja.field_i[var5] <= var6.field_J)) {
                throw new RuntimeException();
            }
        }
        if (var4 == param0) {
            return;
        }
        throw new RuntimeException();
    }

    final int[] a(byte param0, fs param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int[] var3_array = null;
        boolean[] var4 = null;
        ln[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        ln[] var10 = null;
        int var11 = 0;
        ln var12 = null;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int stackIn_6_0 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_23_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var15 = new int[this.field_o];
            var17 = var15;
            var16 = var17;
            var3_array = var16;
            var4 = new boolean[this.field_o];
            var5 = this.field_g.field_g.field_e;
            var6 = 0;
            L1: while (true) {
              if (var6 >= this.field_o) {
                L2: {
                  var6 = 1;
                  if (param0 <= -16) {
                    break L2;
                  } else {
                    discarded$1 = this.a((byte) -4, 36);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var6 == 0) {
                    stackOut_23_0 = (int[]) (var3_array);
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    var6 = 0;
                    var7 = 0;
                    L4: while (true) {
                      if (this.field_o <= var7) {
                        continue L3;
                      } else {
                        L5: {
                          if (var4[var7]) {
                            var4[var7] = false;
                            var8 = var5[var7];
                            var9 = var17[var7] - -1;
                            var10 = var8.field_D;
                            var11 = 0;
                            L6: while (true) {
                              if (var10.length <= var11) {
                                break L5;
                              } else {
                                var12 = var10[var11];
                                var13 = var12.field_p;
                                if (var17[var13] > var9) {
                                  var17[var13] = var9;
                                  var4[var13] = true;
                                  var6 = 1;
                                  var11++;
                                  continue L6;
                                } else {
                                  var11++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        var7++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                L7: {
                  if (param1 != var5[var6].field_y) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L7;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L7;
                  }
                }
                L8: {
                  var7 = stackIn_6_0;
                  var4[var6] = var7 != 0;
                  stackOut_6_0 = (int[]) (var15);
                  stackOut_6_1 = var6;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (var7 == 0) {
                    stackOut_8_0 = (int[]) ((Object) stackIn_8_0);
                    stackOut_8_1 = stackIn_8_1;
                    stackOut_8_2 = 2147483647;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    break L8;
                  } else {
                    stackOut_7_0 = (int[]) ((Object) stackIn_7_0);
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = 0;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    break L8;
                  }
                }
                stackIn_9_0[stackIn_9_1] = stackIn_9_2;
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var3);
            stackOut_25_1 = new StringBuilder().append("ka.L(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    void a(int param0, sd param1, byte param2) {
        RuntimeException var4 = null;
        int[] var4_array = null;
        ln var5 = null;
        ln var6_ref_ln = null;
        int var6 = 0;
        int var7_int = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ln var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              cq.field_E = param0;
              mj.field_yb = param1;
              this.c(-17286);
              if (!this.field_g.field_o.field_i) {
                this.c(0, param1);
                break L1;
              } else {
                this.c(0, this.field_n.field_m);
                break L1;
              }
            }
            var16 = this.b(127, param1);
            var14 = var16;
            var13 = var14;
            var4_array = var13;
            this.a(param1, var16, 0);
            this.c(param0, cq.field_E, -1);
            param0 = param0 - this.a((byte) -106, param0);
            if ((param0 ^ -1) > -1) {
              var5 = param1.j(18229);
              var12 = var5;
              var6_ref_ln = var12;
              var7_int = 0;
              var8 = 0;
              L2: while (true) {
                if (4 <= var8) {
                  L3: while (true) {
                    if (var5 == null) {
                      wb.field_b[var6_ref_ln.field_p] = param0;
                      param0 = 0;
                      this.a(118, param1);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var8 = var5.field_p;
                      param0 = param0 + wb.field_b[var8];
                      wb.field_b[var8] = 0;
                      var9 = 0;
                      var10 = 0;
                      L4: while (true) {
                        if ((var10 ^ -1) <= -5) {
                          L5: {
                            if (var9 <= var7_int) {
                              break L5;
                            } else {
                              var7_int = var9;
                              var6_ref_ln = var5;
                              break L5;
                            }
                          }
                          var5 = param1.h(param2 ^ 23364);
                          continue L3;
                        } else {
                          var9 = var9 + var5.field_G[var10];
                          var10++;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  var7_int = var7_int + var12.field_G[var8];
                  var8++;
                  continue L2;
                }
              }
            } else {
              L6: {
                this.c(param0, cq.field_E, -1);
                if (this.field_g.field_o.field_l) {
                  break L6;
                } else {
                  if (!this.field_g.field_o.field_k) {
                    param0 = param0 - this.b(param0, param2 + -1745);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              this.c(param0, cq.field_E, param2 + 53);
              if (param0 == 0) {
                this.a(param2 ^ 30, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L7: {
                  var6 = this.e(param2 ^ -54);
                  var7 = null;
                  if (param2 == -54) {
                    break L7;
                  } else {
                    this.field_l = true;
                    break L7;
                  }
                }
                L8: {
                  var8 = 0;
                  if (!this.field_l) {
                    break L8;
                  } else {
                    L9: {
                      var9 = this.a(param0, (byte) -58);
                      var17 = ik.a(u.field_d, this.field_o, (byte) 49);
                      var15 = var17;
                      var7 = var15;
                      if (var9 <= var6) {
                        break L9;
                      } else {
                        var9 = var6;
                        break L9;
                      }
                    }
                    this.c(param0, cq.field_E, -1);
                    param0 = param0 - var9;
                    var8 = this.a(var9, param0, var16, var17, -1);
                    param0 = param0 - var8;
                    param0 = param0 + var9;
                    this.c(param0, cq.field_E, -1);
                    break L8;
                  }
                }
                L10: {
                  param0 = param0 - this.a(param0, -1814, var6);
                  this.c(param0, cq.field_E, param2 + 53);
                  if (!this.field_l) {
                    break L10;
                  } else {
                    if (-1 > (param0 ^ -1)) {
                      param0 = param0 - this.a((byte) 92, var8, param0, (int[]) (var7));
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                L11: {
                  if (param0 == 0) {
                    break L11;
                  } else {
                    this.a(param0, param2 + -70, param1.field_q);
                    break L11;
                  }
                }
                this.a(-46, param1);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var4);
            stackOut_40_1 = new StringBuilder().append("ka.JA(").append(param0).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L12;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L12;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param2 + ')');
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

    final static void a(int param0, int param1) {
        if (param0 != 7321) {
            field_e = (bc) null;
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int discarded$0 = 0;
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var2 = 0; var2 < this.field_o; var2++) {
            ol.field_a[var2] = 0;
            ue.field_e[var2] = 0;
            wb.field_b[var2] = 0;
            ja.field_i[var2] = 0;
            u.field_c[var2] = 0;
            rl.field_b[var2] = false;
        }
        if (param0 != -17286) {
            discarded$0 = this.a((byte) -58, (ln) null);
        }
    }

    public final void a(int param0) {
        int[] var2 = null;
        fs[] var3 = null;
        int var4 = 0;
        fs var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var8 = this.b(-128);
        var2 = var8;
        if (var8 == null) {
          return;
        } else {
          if (var8.length != 0) {
            var3 = this.field_g.field_v;
            var4 = 0;
            L0: while (true) {
              if (var4 >= var3.length) {
                var4 = -49 / ((-36 - param0) / 38);
                return;
              } else {
                var5 = var3[var4];
                if (var5 != this.field_n) {
                  var6 = var8[vc.a((byte) -39, var8.length)];
                  this.field_j.a(0, (byte) -110, var5, this.field_n, var6);
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    int a(byte param0, int param1) {
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        int var6 = 0;
        ln[] var7_ref_ln__ = null;
        int var7 = 0;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = 0;
        var4 = mj.field_yb.j(18229);
        L0: while (true) {
          if (var4 == null) {
            if (param0 < -29) {
              return var3;
            } else {
              return 9;
            }
          } else {
            L1: {
              var5 = var4.field_p;
              var6 = 0;
              if (this.field_g.field_o.field_l) {
                var6 = 1;
                break L1;
              } else {
                var7_ref_ln__ = var4.field_D;
                var8 = 0;
                L2: while (true) {
                  if (var8 >= var7_ref_ln__.length) {
                    break L1;
                  } else {
                    var9 = var7_ref_ln__[var8];
                    if (this.field_n != var9.field_y) {
                      var6++;
                      var8++;
                      continue L2;
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
            ja.field_i[var5] = ja.field_i[var5] + var4.field_x;
            wb.field_b[var5] = var6;
            var7 = -var4.field_x + var6;
            var4 = mj.field_yb.h(-23410);
            var3 = var3 + var7;
            continue L0;
          }
        }
    }

    int a(int param0, byte param1) {
        if (param1 >= -25) {
            field_m = (String) null;
        }
        return 3 * param0 >> 677264546;
    }

    int[] b(int param0) {
        int var2 = 81 % ((-48 - param0) / 61);
        return new int[]{14, 15};
    }

    private final void a(ln param0, ln param1, int param2, int param3) {
        RuntimeException var5 = null;
        mg var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (param0 != null) {
                  if ((param2 ^ -1) >= param3) {
                    throw new RuntimeException();
                  } else {
                    if (param1.field_y != this.field_n) {
                      throw new RuntimeException();
                    } else {
                      L2: {
                        if (param0.field_R == param1.field_R) {
                          break L2;
                        } else {
                          if (!param1.b(param0, (byte) 10)) {
                            throw new RuntimeException();
                          } else {
                            break L2;
                          }
                        }
                      }
                      var5_ref = (mg) ((Object) param1.field_s.c(-128));
                      L3: while (true) {
                        L4: {
                          if (var5_ref == null) {
                            break L4;
                          } else {
                            L5: {
                              if (var5_ref.field_G != this.field_n) {
                                break L5;
                              } else {
                                if (param0 != var5_ref.field_y) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var5_ref = (mg) ((Object) param1.field_s.b(32));
                            continue L3;
                          }
                        }
                        L6: {
                          if (var5_ref != null) {
                            if (var5_ref.field_z <= param2) {
                              var5_ref.b((byte) -93);
                              var5_ref.a(16);
                              var5_ref.d(true);
                              var5_ref.field_y.field_J = var5_ref.field_y.field_J + var5_ref.field_z;
                              param2 = param2 - var5_ref.field_z;
                              break L6;
                            } else {
                              var5_ref.field_z = var5_ref.field_z - param2;
                              var5_ref.field_y.field_J = var5_ref.field_y.field_J + param2;
                              decompiledRegionSelector0 = 0;
                              break L0;
                            }
                          } else {
                            break L6;
                          }
                        }
                        if (0 == param2) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          if (param2 <= param1.field_J) {
                            param1.field_J = param1.field_J - param2;
                            var5_ref = (mg) ((Object) lh.field_v.d(0));
                            L7: while (true) {
                              L8: {
                                if (var5_ref == null) {
                                  break L8;
                                } else {
                                  L9: {
                                    if (var5_ref.field_G != this.field_n) {
                                      break L9;
                                    } else {
                                      if (param1 != var5_ref.field_y) {
                                        break L9;
                                      } else {
                                        if (param0 == var5_ref.field_B) {
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                  var5_ref = (mg) ((Object) lh.field_v.a((byte) -71));
                                  continue L7;
                                }
                              }
                              if (var5_ref == null) {
                                var5_ref = new mg(param1, param0, param2);
                                lh.field_v.a((byte) -113, var5_ref);
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var5_ref.field_z = var5_ref.field_z + param2;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              }
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var5);
            stackOut_44_1 = new StringBuilder().append("ka.W(");
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L10;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L10;
            }
          }
          L11: {
            stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param1 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L11;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L11;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_50_0), stackIn_50_2 + ',' + param2 + ',' + param3 + ')');
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
              return;
            }
          }
        }
    }

    private final void a(int param0, sd param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        ln var3_ref = null;
        int var4 = 0;
        ln var5_ref_ln = null;
        int var5 = 0;
        Object var6 = null;
        ln[] var7 = null;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            this.c(0, cq.field_E, -1);
            var3_int = 0;
            var4 = -58 % ((param0 - 53) / 47);
            L1: while (true) {
              if (this.field_o <= var3_int) {
                var3_ref = param1.j(18229);
                L2: while (true) {
                  if (var3_ref == null) {
                    break L0;
                  } else {
                    L3: {
                      var4 = var3_ref.field_p;
                      var5 = wb.field_b[var4];
                      if (var5 == 0) {
                        break L3;
                      } else {
                        this.a(var5, 94, var3_ref);
                        break L3;
                      }
                    }
                    wb.field_b[var4] = 0;
                    this.c(0, cq.field_E, -1);
                    var3_ref = param1.h(-23410);
                    continue L2;
                  }
                }
              } else {
                if (0 != u.field_c[var3_int]) {
                  var5_ref_ln = this.field_g.field_g.field_e[var3_int];
                  var6 = null;
                  var7 = var5_ref_ln.field_D;
                  var8 = 0;
                  L4: while (true) {
                    if (var7.length <= var8) {
                      this.a(u.field_c[var3_int], 86, (ln) (var6));
                      u.field_c[var3_int] = 0;
                      this.c(0, cq.field_E, -1);
                      var3_int++;
                      continue L1;
                    } else {
                      var9 = var7[var8];
                      if (param1 == var9.field_R) {
                        L5: {
                          if (var6 == null) {
                            break L5;
                          } else {
                            if (((ln) (var6)).field_J < var9.field_J) {
                              break L5;
                            } else {
                              var8++;
                              continue L4;
                            }
                          }
                        }
                        var6 = var9;
                        var8++;
                        continue L4;
                      } else {
                        var8++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var3);
            stackOut_21_1 = new StringBuilder().append("ka.OA(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    private final void f(int param0) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        sd var5 = null;
        qm var5_ref = null;
        ln var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        lo var11 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == 26539) {
          L0: {
            var2 = null;
            var3 = 0;
            var4 = 0;
            if (this.field_g.field_o.field_i) {
              var11 = this.field_n.field_m;
              var6 = var11.j(18229);
              L1: while (true) {
                if (var6 == null) {
                  break L0;
                } else {
                  var7 = 0;
                  var8 = 0;
                  var9 = 0;
                  L2: while (true) {
                    L3: {
                      if (-5 >= (var9 ^ -1)) {
                        break L3;
                      } else {
                        var8 = var8 + var6.field_G[var9];
                        if (var11.field_u[var9] >= var6.field_G[var9]) {
                          var9++;
                          continue L2;
                        } else {
                          var7 = 1;
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (var7 != 0) {
                        break L4;
                      } else {
                        L5: {
                          var9 = this.a((byte) -22, var6);
                          if (var2 == null) {
                            break L5;
                          } else {
                            if (var8 < var3) {
                              break L5;
                            } else {
                              if (var8 != var3) {
                                break L4;
                              } else {
                                if (var4 <= var9) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                        var3 = var8;
                        var4 = var9;
                        var2 = var6;
                        break L4;
                      }
                    }
                    var6 = var11.h(param0 + -49949);
                    continue L1;
                  }
                }
              }
            } else {
              var5 = (sd) ((Object) this.field_n.field_i.d(0));
              L6: while (true) {
                if (var5 == null) {
                  break L0;
                } else {
                  var6 = var5.j(18229);
                  L7: while (true) {
                    if (var6 == null) {
                      var5 = (sd) ((Object) this.field_n.field_i.a((byte) -71));
                      continue L6;
                    } else {
                      var7 = 0;
                      var8 = 0;
                      var9 = 0;
                      L8: while (true) {
                        L9: {
                          if (-5 >= (var9 ^ -1)) {
                            break L9;
                          } else {
                            var8 = var8 + var6.field_G[var9];
                            if (var5.field_u[var9] >= var6.field_G[var9]) {
                              var9++;
                              continue L8;
                            } else {
                              var7 = 1;
                              break L9;
                            }
                          }
                        }
                        if (var7 == 0) {
                          L10: {
                            L11: {
                              var9 = this.a((byte) -34, var6);
                              if (var2 == null) {
                                break L11;
                              } else {
                                if (var8 < var3) {
                                  break L11;
                                } else {
                                  if (var8 != var3) {
                                    break L10;
                                  } else {
                                    if (var9 < var4) {
                                      break L11;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            var4 = var9;
                            var3 = var8;
                            var2 = var6;
                            break L10;
                          }
                          var6 = var5.h(-23410);
                          continue L7;
                        } else {
                          var6 = var5.h(-23410);
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L12: {
            if (var2 != null) {
              var5_ref = new qm(1, this.field_n, (ln) (var2));
              lh.field_G.a((byte) -113, var5_ref);
              break L12;
            } else {
              break L12;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, int param1, int[] param2, int[] param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            var7 = param4 + this.field_o;
            L1: while (true) {
              L2: {
                if ((var7 ^ -1) > -1) {
                  break L2;
                } else {
                  var8 = param3[var7];
                  var9 = this.field_g.field_g.field_e[var8];
                  var10 = 0;
                  L3: while (true) {
                    L4: {
                      if (var10 >= param2.length) {
                        break L4;
                      } else {
                        if (param2[var10] != var8) {
                          var10++;
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var10 != param2.length) {
                        this.c(param0 + param1, cq.field_E, -1);
                        if (0 != u.field_d[var8]) {
                          if (ei.field_d[var8] <= param1) {
                            var11 = this.a(var9, param1, (byte) 30);
                            param1 = param1 - var11;
                            var6_int = var6_int + var11;
                            this.c(param0 + param1, cq.field_E, -1);
                            if (-1 != (param1 ^ -1)) {
                              break L5;
                            } else {
                              break L2;
                            }
                          } else {
                            break L5;
                          }
                        } else {
                          break L2;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var7--;
                    continue L1;
                  }
                }
              }
              L6: {
                if (param1 > 0) {
                  param1 = param1 - this.b(param1, -126, param0);
                  break L6;
                } else {
                  break L6;
                }
              }
              stackOut_20_0 = var6_int;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var6);
            stackOut_22_1 = new StringBuilder().append("ka.I(").append(param0).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param4 + ')');
        }
        return stackIn_21_0;
    }

    int b(int param0, int param1) {
        int discarded$2 = 0;
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        ln[] var11 = null;
        ln var12 = null;
        ln[] var13 = null;
        ln var14 = null;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 == -1799) {
            break L0;
          } else {
            discarded$2 = this.b(114, -80);
            break L0;
          }
        }
        var3 = 0;
        var4 = mj.field_yb.j(param1 ^ -16436);
        L1: while (true) {
          if (var4 == null) {
            return var3;
          } else {
            var5 = 0;
            var11 = var4.field_D;
            var7 = 0;
            L2: while (true) {
              L3: {
                if (var11.length <= var7) {
                  break L3;
                } else {
                  var12 = var11[var7];
                  if (null != var12.field_y) {
                    if (this.field_n != var12.field_y) {
                      if (!this.field_n.field_h[var12.field_y.field_x]) {
                        var5 = 1;
                        break L3;
                      } else {
                        var7++;
                        continue L2;
                      }
                    } else {
                      var7++;
                      continue L2;
                    }
                  } else {
                    var7++;
                    continue L2;
                  }
                }
              }
              L4: {
                if (var5 != 0) {
                  var13 = var4.field_D;
                  var10 = 0;
                  var7 = var10;
                  L5: while (true) {
                    if (var13.length <= var10) {
                      break L4;
                    } else {
                      var14 = var13[var10];
                      if (this.field_n == var14.field_y) {
                        if (param0 != 0) {
                          param0--;
                          wb.field_b[var14.field_p] = wb.field_b[var14.field_p] + 1;
                          var3++;
                          var10++;
                          continue L5;
                        } else {
                          return var3;
                        }
                      } else {
                        var10++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              var4 = mj.field_yb.h(-23410);
              continue L1;
            }
          }
        }
    }

    public final void a(fs param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == 7686) {
              L1: {
                if (2 != this.field_h) {
                  break L1;
                } else {
                  this.field_j.a((byte) -63, this.field_n, param0);
                  break L1;
                }
              }
              L2: {
                var3_int = this.field_b[param0.field_x];
                var7 = var3_int;
                if (-2 != (var7 ^ -1)) {
                  if (2 != var7) {
                    if (var7 == 3) {
                      var4 = 2;
                      break L2;
                    } else {
                      if (-5 != (var7 ^ -1)) {
                        if (-6 != (var7 ^ -1)) {
                          if (-1 == var7) {
                            var4 = 4;
                            break L2;
                          } else {
                            if (var7 != -2) {
                              if (2 != (var7 ^ -1)) {
                                var4 = -1;
                                break L2;
                              } else {
                                var5 = this.field_g.field_m[-1 + this.field_g.field_r];
                                var6 = this.field_g.field_m[-2 + this.field_g.field_r];
                                var4 = 6;
                                if (this.field_n.field_x == var5) {
                                  break L2;
                                } else {
                                  if ((this.field_k ^ -1) == (var5 ^ -1)) {
                                    break L2;
                                  } else {
                                    if (2 * this.field_g.field_D[var5] > 3 * this.field_g.field_D[var6]) {
                                      var4 = 5;
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              }
                            } else {
                              var4 = 5;
                              break L2;
                            }
                          }
                        } else {
                          var4 = 13;
                          break L2;
                        }
                      } else {
                        var4 = 3;
                        break L2;
                      }
                    }
                  } else {
                    var4 = 1;
                    break L2;
                  }
                } else {
                  var4 = 0;
                  break L2;
                }
              }
              L3: {
                if (-1 != var4) {
                  this.field_j.a(0, (byte) 6, param0, this.field_n, var4);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                L5: {
                  if (!this.field_l) {
                    break L5;
                  } else {
                    if (this.field_n.field_h[param0.field_x]) {
                      break L5;
                    } else {
                      if ((var3_int ^ -1) > -1) {
                        this.field_j.a((byte) -63, this.field_n, param0);
                        if ((this.field_h ^ -1) == -4) {
                          this.g(param1 + -26170);
                          break L5;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L4;
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
            var3 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var3);
            stackOut_43_1 = new StringBuilder().append("ka.SA(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L6;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int[] b(int param0, sd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ln var4 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        ln[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int[] stackIn_18_0 = null;
        int[] stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_25_0 = null;
        int[] stackOut_17_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param1.j(18229);
            L1: while (true) {
              if (var4 == null) {
                if (param0 >= 66) {
                  var10 = new int[var3_int];
                  var11 = 0;
                  var6 = var11;
                  L2: while (true) {
                    if (this.field_o <= var11) {
                      stackOut_25_0 = (int[]) (var10);
                      stackIn_26_0 = stackOut_25_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        if (rl.field_b[var11]) {
                          var3_int--;
                          var10[var3_int] = var11;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var11++;
                      continue L2;
                    }
                  }
                } else {
                  stackOut_17_0 = (int[]) null;
                  stackIn_18_0 = stackOut_17_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var9 = var4.field_D;
                var6 = 0;
                L4: while (true) {
                  if (var6 >= var9.length) {
                    var4 = param1.h(-23410);
                    continue L1;
                  } else {
                    var7 = var9[var6];
                    if (this.field_n != var7.field_y) {
                      L5: {
                        if (null == var7.field_y) {
                          break L5;
                        } else {
                          if (!this.field_n.field_h[var7.field_y.field_x]) {
                            break L5;
                          } else {
                            var6++;
                            continue L4;
                          }
                        }
                      }
                      L6: {
                        if (!rl.field_b[var7.field_p]) {
                          rl.field_b[var7.field_p] = true;
                          var3_int++;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var6++;
                      continue L4;
                    } else {
                      var6++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var3);
            stackOut_27_1 = new StringBuilder().append("ka.CA(").append(param0).append(',');
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
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0;
        } else {
          return stackIn_26_0;
        }
    }

    void b(boolean param0) {
        Object var2 = null;
        int var3 = 0;
        int var4_int = 0;
        qm var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0) {
          var2 = null;
          var3 = 0;
          var4_int = 0;
          L0: while (true) {
            if (this.field_o <= var4_int) {
              L1: {
                if (var2 == null) {
                  break L1;
                } else {
                  var4 = new qm(2, this.field_n, (ln) (var2));
                  lh.field_G.a((byte) -113, var4);
                  break L1;
                }
              }
              return;
            } else {
              var5 = hs.field_i[var4_int];
              if ((var5 ^ -1) <= -7) {
                var6 = cb.field_o[var4_int];
                var7 = var5 * var6 * var6;
                if (var3 < var7) {
                  var3 = var7;
                  var2 = this.field_g.field_g.field_e[var4_int];
                  var4_int++;
                  continue L0;
                } else {
                  var4_int++;
                  continue L0;
                }
              } else {
                var4_int++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    void e(byte param0) {
        Object var2 = null;
        int var3 = 0;
        int var4_int = 0;
        sd var4 = null;
        Object var5 = null;
        int var6 = 0;
        int var7_int = 0;
        qm var7 = null;
        ln var8 = null;
        int var9 = 0;
        ln[] var10_ref_ln__ = null;
        int var10 = 0;
        int var11 = 0;
        ln var12_ref_ln = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ln var15 = null;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = null;
        var3 = 0;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= this.field_o) {
            if (var2 == null) {
              return;
            } else {
              var4 = ((ln) (var2)).field_R;
              if (var4 != null) {
                L1: {
                  var5 = null;
                  var6 = 0;
                  if (param0 == 101) {
                    break L1;
                  } else {
                    field_a = false;
                    break L1;
                  }
                }
                var7_int = 0;
                L2: while (true) {
                  if (this.field_o <= var7_int) {
                    L3: {
                      if (var5 == null) {
                        break L3;
                      } else {
                        var7 = new qm(3, this.field_n, (ln) (var2), (ln) (var5));
                        lh.field_G.a((byte) -113, var7);
                        break L3;
                      }
                    }
                    return;
                  } else {
                    var8 = this.field_g.field_g.field_e[var7_int];
                    if (var8.field_R != ((ln) (var2)).field_R) {
                      L4: {
                        if (var8.field_y == this.field_n) {
                          break L4;
                        } else {
                          if (var8.field_y == null) {
                            break L4;
                          } else {
                            if (!this.field_n.field_h[var8.field_y.field_x]) {
                              break L4;
                            } else {
                              var7_int++;
                              continue L2;
                            }
                          }
                        }
                      }
                      var9 = 0;
                      var10_ref_ln__ = var8.field_D;
                      var11 = 0;
                      L5: while (true) {
                        L6: {
                          if (var11 >= var10_ref_ln__.length) {
                            break L6;
                          } else {
                            var12_ref_ln = var10_ref_ln__[var11];
                            if (var12_ref_ln.field_R == ((ln) (var2)).field_R) {
                              var9 = 1;
                              break L6;
                            } else {
                              var11++;
                              continue L5;
                            }
                          }
                        }
                        if (var9 == 0) {
                          var10 = 0;
                          var12 = 0;
                          L7: while (true) {
                            if (-5 >= (var12 ^ -1)) {
                              L8: {
                                var11 = 0;
                                var11 = var8.field_x;
                                if (!var8.field_u) {
                                  break L8;
                                } else {
                                  var11 = 5 + 2 * var11;
                                  break L8;
                                }
                              }
                              L9: {
                                var12 = this.a(-5, var8);
                                var11 = var11 + var12;
                                var11 = var11 + this.a((byte) -113, var8);
                                if (-2 >= (var11 ^ -1)) {
                                  break L9;
                                } else {
                                  var11 = 1;
                                  break L9;
                                }
                              }
                              var13 = (var10 << -467720464) / var11;
                              if (var6 < var13) {
                                var5 = var8;
                                var6 = var13;
                                var7_int++;
                                continue L2;
                              } else {
                                var7_int++;
                                continue L2;
                              }
                            } else {
                              var10 = var10 + (1 + (var4.field_u[var12] + -var4.field_w[0])) * var8.field_G[var12];
                              var12++;
                              continue L7;
                            }
                          }
                        } else {
                          var7_int++;
                          continue L2;
                        }
                      }
                    } else {
                      var7_int++;
                      continue L2;
                    }
                  }
                }
              } else {
                return;
              }
            }
          } else {
            var15 = this.field_g.field_g.field_e[var4_int];
            if (var15.field_y == this.field_n) {
              L10: {
                var6 = oe.field_i[var4_int];
                if (var15.field_u) {
                  var6 = 2 * var6 - -5;
                  break L10;
                } else {
                  break L10;
                }
              }
              if (var3 < var6) {
                var2 = var15;
                var3 = var6;
                var4_int++;
                continue L0;
              } else {
                var4_int++;
                continue L0;
              }
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    int a(byte param0, ln param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ln[] var4 = null;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -14) {
                break L1;
              } else {
                field_m = (String) null;
                break L1;
              }
            }
            var3_int = 0;
            var4 = param1.field_D;
            var5 = 0;
            L2: while (true) {
              if (var5 >= var4.length) {
                stackOut_12_0 = var3_int;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                var6 = var4[var5];
                if (var6.field_y != null) {
                  if (this.field_n != var6.field_y) {
                    if (!this.field_n.field_h[var6.field_y.field_x]) {
                      var3_int = var3_int + var6.field_x;
                      var5++;
                      continue L2;
                    } else {
                      var5++;
                      continue L2;
                    }
                  } else {
                    var5++;
                    continue L2;
                  }
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("ka.U(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    private final int a(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ln[] var4 = null;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            var4 = param0.field_D;
            var5 = 0;
            L1: while (true) {
              if (var4.length <= var5) {
                L2: {
                  if (param1 == -5942) {
                    break L2;
                  } else {
                    field_a = true;
                    break L2;
                  }
                }
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var6 = var4[var5];
                var3_int = var3_int + ja.field_i[var6.field_p];
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ka.T(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    private final void a(int param0, int param1, ln param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var16 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (-1 < (param0 ^ -1)) {
              throw new RuntimeException();
            } else {
              if (param0 == 0) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var12 = this.field_g.field_g.field_c[param2.field_p];
                var5 = 27 / ((param1 - -41) / 58);
                var16 = nf.a(var12, 3718);
                var7 = 0;
                L1: while (true) {
                  if (this.field_o <= var7) {
                    L2: {
                      if (param0 == 0) {
                        break L2;
                      } else {
                        if (cq.field_E >= param0) {
                          this.a((byte) -113, param0, param2);
                          break L2;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    if (0 != (var16[var7] ^ -1)) {
                      var8 = var16[var7];
                      var9 = this.field_g.field_g.field_e[var8];
                      var10 = ja.field_i[var8];
                      if (param0 > var10) {
                        if (0 != var10) {
                          L3: {
                            if (var9 != param2) {
                              this.a(param2, var9, var10, -1);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          param0 = param0 - var10;
                          ja.field_i[var8] = 0;
                          var7++;
                          continue L1;
                        } else {
                          var7++;
                          continue L1;
                        }
                      } else {
                        L4: {
                          if (param2 != var9) {
                            this.a(param2, var9, param0, -1);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        ja.field_i[var8] = var10 + -param0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      var7++;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var4);
            stackOut_28_1 = new StringBuilder().append("ka.O(").append(param0).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
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

    int b(byte param0, ln param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
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
              var3_int = -18 % ((-44 - param0) / 62);
              var4 = this.a((byte) -56, param1);
              if (param1.field_u) {
                var4 = var4 >> 1;
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_3_0 = var4;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ka.R(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void d(byte param0) {
        field_f = null;
        int var1 = -25 / ((2 - param0) / 56);
        field_e = null;
        field_m = null;
    }

    private final int a(ln param0, int param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param0.field_p;
              var5 = this.b(param0, param2 ^ 33);
              if (var5 > param1) {
                var5 = param1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.a(param0, param2 ^ -5932) >= ei.field_d[var4_int]) {
                ol.field_a[var4_int] = var5;
                var6 = this.a(0, false, var5, param0);
                if (var5 < var6) {
                  throw new RuntimeException();
                } else {
                  L3: {
                    if (var6 < var5) {
                      u.field_c[var4_int] = var5 - var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  ig.field_c[var4_int] = ig.field_c[var4_int] + var6;
                  break L2;
                }
              } else {
                u.field_c[var4_int] = var5;
                break L2;
              }
            }
            if (param2 == 30) {
              stackOut_15_0 = var5;
              stackIn_16_0 = stackOut_15_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_13_0 = 15;
              stackIn_14_0 = stackOut_13_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("ka.P(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          return stackIn_16_0;
        }
    }

    int a(ln param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param1 < -49) {
                break L1;
              } else {
                this.field_b = (int[]) null;
                break L1;
              }
            }
            L2: {
              var3_int = param0.field_x;
              if (param0.field_u) {
                var3_int = 2 * (var3_int + 5);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var3_int = var3_int + this.a(-5, param0);
              var3_int = var3_int + this.a((byte) -23, param0);
              if (1 > var3_int) {
                var3_int = 1;
                break L3;
              } else {
                break L3;
              }
            }
            stackOut_8_0 = var3_int;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("ka.GA(");
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
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    private final void d(int param0) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 0;
        if (param0 != -1) {
            this.field_c = (int[]) null;
        }
        while (var2 < this.field_o) {
            cb.field_o[var2] = 0;
            hs.field_i[var2] = 0;
            ei.field_d[var2] = 0;
            u.field_d[var2] = 0;
            oe.field_i[var2] = 0;
            ig.field_c[var2] = 0;
            var2++;
        }
    }

    public final void a(boolean param0, int param1) {
        this.field_l = param0 ? true : false;
        if (param1 != -6861) {
            field_e = (bc) null;
        }
    }

    public final int a(boolean param0) {
        int discarded$0 = 0;
        if (param0) {
            discarded$0 = this.a(-105, (ln) null);
        }
        return this.field_h;
    }

    public void a(byte param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        fs var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          if (this.field_n.field_i.g(-116)) {
            this.field_l = false;
            break L0;
          } else {
            break L0;
          }
        }
        var2 = this.field_g.field_m[this.field_g.field_r - 1];
        var3 = this.field_g.field_D[var2];
        var4_int = 0;
        L1: while (true) {
          if (var4_int >= this.field_g.field_r) {
            L2: {
              if (param0 == -63) {
                break L2;
              } else {
                discarded$1 = this.a(113, 108, (fs) null);
                break L2;
              }
            }
            L3: {
              if (!this.field_l) {
                break L3;
              } else {
                if (!this.field_g.field_o.field_j) {
                  break L3;
                } else {
                  this.g(-18484);
                  if (-1 != this.field_k) {
                    L4: {
                      var4 = this.field_g.field_v[this.field_k];
                      if (0 < this.field_c[this.field_k]) {
                        break L4;
                      } else {
                        L5: {
                          var8 = this.field_b[this.field_k];
                          if (var8 == -1) {
                            var5 = 7;
                            break L5;
                          } else {
                            if ((var8 ^ -1) != 1) {
                              if (var8 == -3) {
                                var5 = 9;
                                var7 = this.field_g.field_m[this.field_g.field_r - 2];
                                var6 = this.field_g.field_m[this.field_g.field_r + -1];
                                if (this.field_n.field_x == var6) {
                                  break L5;
                                } else {
                                  if (var6 == this.field_k) {
                                    break L5;
                                  } else {
                                    if (2 * this.field_g.field_D[var6] <= this.field_g.field_D[var7] * 3) {
                                      break L5;
                                    } else {
                                      var5 = 8;
                                      break L5;
                                    }
                                  }
                                }
                              } else {
                                var5 = -1;
                                break L5;
                              }
                            } else {
                              var5 = 8;
                              break L5;
                            }
                          }
                        }
                        if ((var5 ^ -1) != 0) {
                          this.field_j.a(0, (byte) 93, var4, this.field_n, var5);
                          this.field_c[this.field_k] = rg.a(6, 3, (byte) 121);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    this.field_j.a((byte) -63, this.field_n, var4);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
            }
            return;
          } else {
            this.field_c[var4_int] = this.field_c[var4_int] - 1;
            this.field_d[var4_int] = this.field_d[var4_int] - 1;
            if (var4_int == var2) {
              this.field_i[var4_int] = 3;
              var4_int++;
              continue L1;
            } else {
              if (this.field_g.field_D[var4_int] * 2 >= var3) {
                this.field_i[var4_int] = this.field_i[var4_int] - 1;
                var4_int++;
                continue L1;
              } else {
                this.field_i[var4_int] = 0;
                var4_int++;
                continue L1;
              }
            }
          }
        }
    }

    int b(ln param0, int param1) {
        RuntimeException var3 = null;
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
              if (param1 >= 41) {
                break L1;
              } else {
                this.f(28);
                break L1;
              }
            }
            stackOut_2_0 = hs.field_i[param0.field_p];
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ka.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final int b(int param0, int param1, int param2) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ln var9 = null;
        mg var10 = null;
        int var11 = 0;
        L0: {
          var11 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 < -124) {
            break L0;
          } else {
            this.a((fs) null, (byte) -78);
            break L0;
          }
        }
        var4 = 0;
        var5 = ik.a(u.field_c, this.field_o, (byte) 49);
        var6 = 0;
        L1: while (true) {
          L2: {
            if (var6 >= this.field_o) {
              break L2;
            } else {
              var7 = var5[-var6 + -1 + this.field_o];
              var8 = u.field_c[var7];
              if (0 == param0) {
                break L2;
              } else {
                if (0 == cq.field_E) {
                  break L2;
                } else {
                  if (var8 != 0) {
                    if (cq.field_E >= var8) {
                      if (var8 <= param0) {
                        if (ol.field_a[var7] != 0) {
                          var9 = this.field_g.field_g.field_e[var7];
                          var10 = (mg) ((Object) var9.field_s.c(-128));
                          L3: while (true) {
                            L4: {
                              if (var10 == null) {
                                break L4;
                              } else {
                                if (var10.field_y.field_R == mj.field_yb) {
                                  break L4;
                                } else {
                                  var10 = (mg) ((Object) var9.field_s.b(32));
                                  continue L3;
                                }
                              }
                            }
                            if (var10 != null) {
                              var4 = var4 + var8;
                              this.a((byte) -68, var8, var10.field_y);
                              var10.field_z = var10.field_z + var8;
                              param0 = param0 - var8;
                              var10.field_y.field_J = var10.field_y.field_J - var8;
                              ig.field_c[var7] = ig.field_c[var7] + var8;
                              var6++;
                              continue L1;
                            } else {
                              var6++;
                              continue L1;
                            }
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      } else {
                        var6++;
                        continue L1;
                      }
                    } else {
                      var6++;
                      continue L1;
                    }
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          this.c(param2 + param0, cq.field_E, -1);
          return var4;
        }
    }

    void g(int param0) {
        int var2 = 0;
        int var3_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = this.field_g.field_r;
        ff.field_x = new int[var2][];
        this.field_k = -1;
        ac.field_q = new boolean[this.field_o];
        var3_int = 0;
        L0: while (true) {
          if (var3_int >= var2) {
            var3 = ff.field_x[this.field_n.field_x];
            var4 = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= this.field_o) {
                L2: {
                  if (param0 == -18484) {
                    break L2;
                  } else {
                    this.d(-52);
                    break L2;
                  }
                }
                var5 = 0;
                L3: while (true) {
                  if (var2 <= var5) {
                    var5 = 0;
                    L4: while (true) {
                      if (var2 <= var5) {
                        return;
                      } else {
                        var6 = this.field_g.field_m[var5];
                        if (-1 < (this.field_b[var6] ^ -1)) {
                          this.field_k = var6;
                          var5++;
                          continue L4;
                        } else {
                          var5++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    this.field_b[var5] = this.a(var4, nc.a(param0, -18484), this.field_g.field_v[var5]);
                    var5++;
                    continue L3;
                  }
                }
              } else {
                if (this.field_g.field_g.field_e[var5].field_y == this.field_n) {
                  ac.field_q[var5] = false;
                  var5++;
                  continue L1;
                } else {
                  var6 = 1;
                  var7 = 0;
                  L5: while (true) {
                    L6: {
                      if (var7 >= var2) {
                        break L6;
                      } else {
                        if (var7 != this.field_n.field_x) {
                          if (this.field_n.field_h[var7]) {
                            if (var3[var5] >= ff.field_x[var7][var5]) {
                              var6 = 0;
                              break L6;
                            } else {
                              var7++;
                              continue L5;
                            }
                          } else {
                            var7++;
                            continue L5;
                          }
                        } else {
                          var7++;
                          continue L5;
                        }
                      }
                    }
                    L7: {
                      if (var6 != 0) {
                        var4++;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ac.field_q[var5] = var6 != 0;
                    var5++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            ff.field_x[var3_int] = this.a((byte) -64, this.field_g.field_v[var3_int]);
            var3_int++;
            continue L0;
          }
        }
    }

    final boolean c(byte param0) {
        int discarded$0 = 0;
        if (param0 >= -19) {
            discarded$0 = this.b(102, -64);
        }
        return this.field_l;
    }

    private final void a(byte param0, int param1, ln param2) {
        qa var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 < -37) {
              param2.field_J = param2.field_J + param1;
              cq.field_E = cq.field_E - param1;
              var4 = (qa) ((Object) lh.field_D.d(0));
              L1: while (true) {
                if (var4 == null) {
                  var4 = new qa(param2, param1);
                  lh.field_D.a((byte) -113, var4);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (var4.field_u != param2) {
                    var4 = (qa) ((Object) lh.field_D.a((byte) -71));
                    continue L1;
                  } else {
                    var4.field_v = var4.field_v + param1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4_ref);
            stackOut_11_1 = new StringBuilder().append("ka.M(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
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

    ka(dc param0, fs param1, mn param2, int param3) {
        try {
            this.field_l = true;
            this.field_g = param0;
            this.field_j = param2;
            this.field_h = param3;
            this.field_n = param1;
            this.field_o = this.field_g.field_g.field_e.length;
            this.field_i = new int[this.field_g.field_r];
            this.field_d = new int[this.field_g.field_r];
            this.field_b = new int[this.field_g.field_r];
            this.field_c = new int[this.field_g.field_r];
            this.field_k = -1;
            kd.a(23299, this.field_o);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_m = "Victory in <%0>";
        field_f = "Unable to delete friend - system busy";
    }
}
