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
        fs stackIn_29_0 = null;
        fs stackIn_29_1 = null;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        ln var9 = null;
        int var10_int = 0;
        ln[] var10 = null;
        int var11 = 0;
        ln var12 = null;
        int var13 = 0;
        int var14 = 0;
        ln[] var15 = null;
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
                            var10 = var9.field_D;
                            var11 = 0;
                            L9: while (true) {
                              L10: {
                                if (var10.length <= var11) {
                                  break L10;
                                } else {
                                  var12 = var10[var11];
                                  if (this.field_n == var12.field_y) {
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
                            var12 = var15[var11];
                            stackIn_29_0 = var12.field_y;

                            stackIn_29_1 = this.field_n;

                            if (stackIn_29_0 != stackIn_29_1) {
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
              stackIn_45_0 = var5_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackIn_48_0 = (RuntimeException) (var5);

            stackIn_48_1 = new StringBuilder().append("ka.QA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L19;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L19;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ')');
        }
        return stackIn_45_0;
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
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_18_0 = var3_int;
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
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("ka.MA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        return stackIn_18_0;
    }

    private final void a(sd param0, int[] param1, int param2) {
        ln[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ln[] var11 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
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
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("ka.AB(");

            if (param0 == null) {
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
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
    }

    private final int a(int param0, boolean param1, int param2, ln param3) {
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        ln[] var6_ref_ln__ = null;
        int var6 = 0;
        int var7_int = 0;
        ln[] var7 = null;
        int var8 = 0;
        ln var8_ref_ln = null;
        ln var9 = null;
        int var9_int = 0;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = param2;
            var6_ref_ln__ = param3.field_D;
            var7_int = param0;
            L1: while (true) {
              L2: {
                if (var6_ref_ln__.length <= var7_int) {
                  if (var5_int == 0) {
                    break L2;
                  } else {
                    if (!param1) {
                      break L2;
                    } else {
                      if (-1 > (cq.field_E ^ -1)) {
                        L3: {
                          if (var5_int < cq.field_E) {
                            stackIn_30_0 = var5_int;
                            break L3;
                          } else {
                            stackIn_30_0 = cq.field_E;
                            break L3;
                          }
                        }
                        var6 = stackIn_30_0;
                        var5_int = var5_int - var6;
                        var7 = param3.field_D;
                        var8 = 0;
                        L4: while (true) {
                          if (var7.length <= var8) {
                            break L2;
                          } else {
                            var9 = var7[var8];
                            if (var9.field_R == mj.field_yb) {
                              this.a((byte) -67, var6, var9);
                              this.a(param3, var9, var6, param0 ^ -1);
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
                  var8_ref_ln = var6_ref_ln__[var7_int];
                  var9_int = var8_ref_ln.field_p;
                  if (ja.field_i[var9_int] < var5_int) {
                    L5: {
                      if (ja.field_i[var9_int] == 0) {
                        break L5;
                      } else {
                        this.a(param3, var8_ref_ln, ja.field_i[var9_int], -1);
                        var5_int = var5_int - ja.field_i[var9_int];
                        ja.field_i[var9_int] = 0;
                        break L5;
                      }
                    }
                    if (var5_int != 0) {
                      var7_int++;
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
                                stackIn_16_0 = var5_int;
                                break L6;
                              } else {
                                stackIn_16_0 = cq.field_E;
                                break L6;
                              }
                            }
                            var6 = stackIn_16_0;
                            var5_int = var5_int - var6;
                            var7 = param3.field_D;
                            var8 = 0;
                            L7: while (true) {
                              if (var7.length <= var8) {
                                break L2;
                              } else {
                                var9 = var7[var8];
                                if (var9.field_R == mj.field_yb) {
                                  this.a((byte) -67, var6, var9);
                                  this.a(param3, var9, var6, param0 ^ -1);
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
                    ja.field_i[var9_int] = ja.field_i[var9_int] - var5_int;
                    stackIn_5_0 = param2;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
              stackIn_37_0 = param2 - var5_int;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var5);

            stackIn_40_1 = new StringBuilder().append("ka.PA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L8;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_5_0 = var3_int;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("ka.F(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    private final void c(int param0, sd param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ka.RA(").append(param0).append(',');

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
        int[] dupTemp$0 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        fs stackIn_23_0 = null;
        fs stackIn_23_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        fs var5 = null;
        fs var6 = null;
        int var7 = 0;
        int var8 = 0;
        ln[] var9 = null;
        int[] var9_array = null;
        int var10 = 0;
        ln var11_ref_ln = null;
        int var11 = 0;
        int var12 = 0;
        ln[] var13 = null;
        int var14 = 0;
        ln var15 = null;
        int var16 = 0;
        int[] var17 = null;
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
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5 = this.field_g.field_v[this.field_g.field_m[this.field_g.field_r - 1]];
                    var6 = this.field_g.field_v[this.field_g.field_m[-2 + this.field_g.field_r]];
                    if (var5 != param2) {
                      var7 = 0;
                      var8 = param1;
                      var9 = this.field_g.field_g.field_e;
                      var10 = 0;
                      L2: while (true) {
                        L3: {
                          L4: {
                            if (var9.length <= var10) {
                              if (var7 <= var8 * 2) {
                                if (!var5.field_h[var4_int]) {
                                  if (var5.field_h[var4_int]) {
                                    stackIn_40_0 = 5;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    if (var6 == param2) {
                                      break L3;
                                    } else {
                                      break L4;
                                    }
                                  }
                                } else {
                                  stackIn_36_0 = 2;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                }
                              } else {
                                stackIn_33_0 = -1;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            } else {
                              L5: {
                                var11_ref_ln = var9[var10];
                                if (var11_ref_ln.field_y == this.field_n) {
                                  var12 = 0;
                                  var13 = var11_ref_ln.field_D;
                                  var14 = 0;
                                  L6: while (true) {
                                    if (var13.length <= var14) {
                                      if (var12 != 0) {
                                        var8 = var8 + var11_ref_ln.field_x;
                                        break L5;
                                      } else {
                                        var10++;
                                        continue L2;
                                      }
                                    } else {
                                      var15 = var13[var14];
                                      stackIn_23_0 = var15.field_y;

                                      stackIn_23_1 = (fs) (param2);

                                      L7: {
                                        if (stackIn_23_0 == stackIn_23_1) {
                                          var12 = 1;
                                          var7 = var7 + var15.field_x;
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      }
                                      var14++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  break L5;
                                }
                              }
                              var10++;
                              continue L2;
                            }
                          }
                          L8: {
                            if (var7 >= var8) {
                              break L8;
                            } else {
                              if (2 * this.field_g.field_D[this.field_n.field_x] <= this.field_g.field_D[var4_int] * 3) {
                                break L8;
                              } else {
                                stackIn_50_0 = 3;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              }
                            }
                          }
                          dupTemp$0 = ff.field_x[this.field_n.field_x];
                          var17 = dupTemp$0;
                          var9_array = dupTemp$0;
                          var10 = param0;
                          var11 = 0;
                          L9: while (true) {
                            if (var11 >= this.field_o) {
                              L10: {
                                if ((var10 ^ -1) <= -6) {
                                  break L10;
                                } else {
                                  if (var10 < param0) {
                                    stackIn_61_0 = 4;
                                    decompiledRegionSelector0 = 8;
                                    break L0;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              stackIn_63_0 = -3;
                              decompiledRegionSelector0 = 9;
                              break L0;
                            } else {
                              L11: {
                                if (!ac.field_q[var11]) {
                                  break L11;
                                } else {
                                  if (ff.field_x[var4_int][var11] > var17[var11]) {
                                    break L11;
                                  } else {
                                    var10--;
                                    break L11;
                                  }
                                }
                              }
                              var11++;
                              continue L9;
                            }
                          }
                        }
                        L12: {
                          if (var5 == this.field_n) {
                            stackIn_46_0 = -3;
                            break L12;
                          } else {
                            stackIn_46_0 = -2;
                            break L12;
                          }
                        }
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    } else {
                      stackIn_12_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              }
            }
            stackIn_5_0 = 0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackIn_66_0 = (RuntimeException) (var4);

            stackIn_66_1 = new StringBuilder().append("ka.UA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L13;
            } else {
              stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L13;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_67_0), stackIn_67_2 + ')');
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
                return stackIn_33_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_36_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_40_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_46_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_50_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_61_0;
                        } else {
                          return stackIn_63_0;
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
        int discarded$0 = 0;
        sd var2;
        int var3;
        int var4;
        int var5;
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
              discarded$0 = this.a(-67, 25, -122);
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
        int var3_int = 0;
        int var4 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -42) {
                break L1;
              } else {
                this.d((ln) null, 1);
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
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("ka.LA(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
    }

    private final int a(int param0, int param1, int param2) {
        ln var4;
        int var5;
        int var6;
        int var7;
        int var8;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_7_0 = var3_int;
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
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ka.NA(");

            if (param0 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    private final void h(int param0) {
        Object var2;
        int var3;
        int var4_int;
        int var5;
        ln var6;
        int var9;
        qm var4;
        int var7;
        int var8;
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
        int var4;
        int var5;
        ln var6;
        int var7;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param2 < (param1 ^ -1)) {
          throw new RuntimeException();
        } else {
          if (param0 >= 0) {
            var4 = param1;
            var5 = 0;
            L0: while (true) {
              if (var5 >= this.field_o) {
                if (var4 != param0) {
                  throw new RuntimeException();
                } else {
                  return;
                }
              } else {
                var6 = this.field_g.field_g.field_e[var5];
                var4 = var4 + ja.field_i[var5];
                var4 = var4 - wb.field_b[var5];
                var4 = var4 - u.field_c[var5];
                if ((ja.field_i[var5] ^ -1) < (var6.field_J ^ -1)) {
                  throw new RuntimeException();
                } else {
                  var5++;
                  continue L0;
                }
              }
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    final int[] a(byte param0, fs param1) {
        int stackIn_6_0 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
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
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var15 = new int[this.field_o];
            var3 = var15;
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
                    this.a((byte) -4, 36);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var6 == 0) {
                    stackIn_24_0 = (int[]) (var3);
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
                            var9 = var3[var7] - -1;
                            var10 = var8.field_D;
                            var11 = 0;
                            L6: while (true) {
                              if (var10.length <= var11) {
                                break L5;
                              } else {
                                var12 = var10[var11];
                                var13 = var12.field_p;
                                if ((var3[var13] ^ -1) < (var9 ^ -1)) {
                                  var3[var13] = var9;
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
                    stackIn_6_0 = 0;
                    break L7;
                  } else {
                    stackIn_6_0 = 1;
                    break L7;
                  }
                }
                L8: {
                  var7 = stackIn_6_0;
                  var4[var6] = var7 != 0;
                  stackIn_8_0 = (int[]) (var15);

                  stackIn_8_1 = var6;

                  if (var7 == 0) {
                    stackIn_9_0 = (int[]) ((Object) stackIn_8_0);
                    stackIn_9_1 = stackIn_8_1;
                    stackIn_9_2 = 2147483647;
                    break L8;
                  } else {
                    stackIn_9_0 = (int[]) ((Object) stackIn_8_0);
                    stackIn_9_1 = stackIn_8_1;
                    stackIn_9_2 = 0;
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
            var3_ref = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3_ref);

            stackIn_27_1 = new StringBuilder().append("ka.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_24_0;
    }

    void a(int param0, sd param1, byte param2) {
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
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
            var13 = this.b(127, param1);
            var4 = var13;
            this.a(param1, var13, 0);
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
                      var7 = ik.a(u.field_d, this.field_o, (byte) 49);
                      if (var9 <= var6) {
                        break L9;
                      } else {
                        var9 = var6;
                        break L9;
                      }
                    }
                    this.c(param0, cq.field_E, -1);
                    param0 = param0 - var9;
                    var8 = this.a(var9, param0, var13, (int[]) (var7), -1);
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
            var4_ref = decompiledCaughtException;
            stackIn_42_0 = (RuntimeException) (var4_ref);

            stackIn_42_1 = new StringBuilder().append("ka.JA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "null";
              break L12;
            } else {
              stackIn_43_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_43_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackIn_43_2 = "{...}";
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
            this.a((byte) -58, (ln) null);
        }
    }

    public final void a(int param0) {
        int[] var2;
        fs[] var3;
        int var4;
        fs var5;
        int var7;
        int[] var8;
        int var6;
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
        int var3;
        ln var4;
        int var5;
        int var6;
        ln[] var7_ref_ln__;
        int var8;
        ln var9;
        int var10;
        int var7;
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
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        mg var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
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
                      var5 = (mg) ((Object) param1.field_s.c(-128));
                      L3: while (true) {
                        L4: {
                          if (var5 == null) {
                            break L4;
                          } else {
                            L5: {
                              if (var5.field_G != this.field_n) {
                                break L5;
                              } else {
                                if (param0 != var5.field_y) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var5 = (mg) ((Object) param1.field_s.b(32));
                            continue L3;
                          }
                        }
                        L6: {
                          if (var5 != null) {
                            if (var5.field_z <= param2) {
                              var5.b((byte) -93);
                              var5.a(16);
                              var5.d(true);
                              var5.field_y.field_J = var5.field_y.field_J + var5.field_z;
                              param2 = param2 - var5.field_z;
                              break L6;
                            } else {
                              var5.field_z = var5.field_z - param2;
                              var5.field_y.field_J = var5.field_y.field_J + param2;
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
                            var5 = (mg) ((Object) lh.field_v.d(0));
                            L7: while (true) {
                              L8: {
                                if (var5 == null) {
                                  break L8;
                                } else {
                                  L9: {
                                    if (var5.field_G != this.field_n) {
                                      break L9;
                                    } else {
                                      if (param1 != var5.field_y) {
                                        break L9;
                                      } else {
                                        if (param0 == var5.field_B) {
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                  }
                                  var5 = (mg) ((Object) lh.field_v.a((byte) -71));
                                  continue L7;
                                }
                              }
                              if (var5 == null) {
                                var5 = new mg(param1, param0, param2);
                                lh.field_v.a((byte) -113, var5);
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var5.field_z = var5.field_z + param2;
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
            var5_ref = decompiledCaughtException;
            stackIn_48_0 = (RuntimeException) (var5_ref);

            stackIn_48_1 = new StringBuilder().append("ka.W(");

            if (param0 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L10;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',');

            if (param1 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L11;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L11;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_49_0), stackIn_52_2 + ',' + param2 + ',' + param3 + ')');
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        ln var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        ln var5_ref_ln = null;
        Object var6 = null;
        ln[] var7 = null;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            this.c(0, cq.field_E, -1);
            var3_int = 0;
            var4 = -58 % ((param0 - 53) / 47);
            L1: while (true) {
              if (this.field_o <= var3_int) {
                var3 = param1.j(18229);
                L2: while (true) {
                  if (var3 == null) {
                    break L0;
                  } else {
                    L3: {
                      var4 = var3.field_p;
                      var5 = wb.field_b[var4];
                      if (var5 == 0) {
                        break L3;
                      } else {
                        this.a(var5, 94, var3);
                        break L3;
                      }
                    }
                    wb.field_b[var4] = 0;
                    this.c(0, cq.field_E, -1);
                    var3 = param1.h(-23410);
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
            var3_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3_ref);

            stackIn_23_1 = new StringBuilder().append("ka.OA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    private final void f(int param0) {
        Object var2;
        int var3;
        int var4;
        lo var5;
        sd var5_ref;
        qm var5_ref2;
        ln var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 == 26539) {
          L0: {
            var2 = null;
            var3 = 0;
            var4 = 0;
            if (this.field_g.field_o.field_i) {
              var5 = this.field_n.field_m;
              var6 = var5.j(18229);
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
                        if (var5.field_u[var9] >= var6.field_G[var9]) {
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
                    var6 = var5.h(param0 + -49949);
                    continue L1;
                  }
                }
              }
            } else {
              var5_ref = (sd) ((Object) this.field_n.field_i.d(0));
              L6: while (true) {
                if (var5_ref == null) {
                  break L0;
                } else {
                  var6 = var5_ref.j(18229);
                  L7: while (true) {
                    if (var6 == null) {
                      var5_ref = (sd) ((Object) this.field_n.field_i.a((byte) -71));
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
                            if ((var5_ref.field_u[var9] ^ -1) <= (var6.field_G[var9] ^ -1)) {
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
                          var6 = var5_ref.h(-23410);
                          continue L7;
                        } else {
                          var6 = var5_ref.h(-23410);
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
              var5_ref2 = new qm(1, this.field_n, (ln) (var2));
              lh.field_G.a((byte) -113, var5_ref2);
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
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
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
              stackIn_22_0 = var6_int;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var6);

            stackIn_25_1 = new StringBuilder().append("ka.I(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), stackIn_29_2 + ',' + param4 + ')');
        }
        return stackIn_22_0;
    }

    int b(int param0, int param1) {
        int var3;
        ln var4;
        int var5;
        ln[] var6;
        int var7;
        ln var8;
        int var9;
        fs stackIn_9_0 = null;
        fs stackIn_9_1 = null;
        ln[] var10;
        ln var11;
        int var12;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 == -1799) {
            break L0;
          } else {
            this.b(114, -80);
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
            var6 = var4.field_D;
            var7 = 0;
            L2: while (true) {
              L3: {
                if (var6.length <= var7) {
                  break L3;
                } else {
                  var8 = var6[var7];
                  if (null != var8.field_y) {
                    stackIn_9_0 = this.field_n;
                    stackIn_9_1 = var8.field_y;
                    if (stackIn_9_0 != stackIn_9_1) {
                      if (!this.field_n.field_h[var8.field_y.field_x]) {
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
                  var10 = var4.field_D;
                  var6 = var4.field_D;
                  var12 = 0;
                  var7 = var12;
                  L5: while (true) {
                    if (var10.length <= var12) {
                      break L4;
                    } else {
                      var11 = var10[var12];
                      var8 = var11;
                      if (this.field_n == var8.field_y) {
                        if (param0 != 0) {
                          param0--;
                          wb.field_b[var11.field_p] = wb.field_b[var11.field_p] + 1;
                          var3++;
                          var12++;
                          continue L5;
                        } else {
                          return var3;
                        }
                      } else {
                        var12++;
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
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
            stackIn_45_0 = (RuntimeException) (var3);

            stackIn_45_1 = new StringBuilder().append("ka.SA(");

            if (param0 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L6;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
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
        ln var4 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        ln[] var9 = null;
        int[] stackIn_18_0 = null;
        int[] stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int[] var10 = null;
        int var11 = 0;
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
                      stackIn_26_0 = (int[]) (var10);
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
                  stackIn_18_0 = (int[]) null;
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
            stackIn_29_0 = (RuntimeException) (var3);

            stackIn_29_1 = new StringBuilder().append("ka.CA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L7;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
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
        Object var2;
        int var3;
        int var4_int;
        int var5;
        int var8;
        qm var4;
        int var6;
        int var7;
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
        sd stackIn_20_0 = null;
        sd stackIn_20_1 = null;
        Object var2;
        int var3;
        int var4_int;
        sd var4;
        Object var5;
        int var6;
        int var7_int;
        qm var7;
        ln var8;
        int var9;
        ln[] var10_ref_ln__;
        int var10;
        int var11;
        ln var12_ref_ln;
        int var12;
        int var13;
        int var14;
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
                    stackIn_20_0 = var8.field_R;
                    stackIn_20_1 = ((ln) (var2)).field_R;
                    if (stackIn_20_0 != stackIn_20_1) {
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
            var5 = this.field_g.field_g.field_e[var4_int];
            if (((ln) (var5)).field_y == this.field_n) {
              L10: {
                var6 = oe.field_i[var4_int];
                if (((ln) (var5)).field_u) {
                  var6 = 2 * var6 - -5;
                  break L10;
                } else {
                  break L10;
                }
              }
              if (var3 < var6) {
                var2 = var5;
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
        ln[] var4 = null;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
                stackIn_13_0 = var3_int;
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
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("ka.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
                stackIn_7_0 = var3_int;
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
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ka.T(");

            if (param0 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    private final void a(int param0, int param1, ln param2) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        int var11 = 0;
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
                var4 = this.field_g.field_g.field_c[param2.field_p];
                var5 = 27 / ((param1 - -41) / 58);
                var6 = nf.a(var4, 3718);
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
                    if (0 != (var6[var7] ^ -1)) {
                      var8 = var6[var7];
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
            var4_ref = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var4_ref);

            stackIn_31_1 = new StringBuilder().append("ka.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L5;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_4_0 = var4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ka.R(").append(param0).append(',');

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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_16_0 = var5;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_14_0 = 15;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var4);

            stackIn_19_1 = new StringBuilder().append("ka.P(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
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
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_9_0 = var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ka.GA(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
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
        if (param0) {
            this.a(-105, (ln) null);
        }
        return this.field_h;
    }

    public void a(byte param0) {
        int var2;
        int var3;
        int var4_int;
        fs var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
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
                this.a(113, 108, (fs) null);
                break L2;
              }
            }
            L3: {
              if (!this.field_l) {
                break L3;
              } else {
                L4: {
                  if (!this.field_g.field_o.field_j) {
                    break L4;
                  } else {
                    this.g(-18484);
                    if (-1 != this.field_k) {
                      L5: {
                        var4 = this.field_g.field_v[this.field_k];
                        if (0 < this.field_c[this.field_k]) {
                          break L5;
                        } else {
                          L6: {
                            var8 = this.field_b[this.field_k];
                            if (var8 == -1) {
                              var5 = 7;
                              break L6;
                            } else {
                              if ((var8 ^ -1) != 1) {
                                if (var8 == -3) {
                                  var5 = 9;
                                  var7 = this.field_g.field_m[this.field_g.field_r - 2];
                                  var6 = this.field_g.field_m[this.field_g.field_r + -1];
                                  if (this.field_n.field_x == var6) {
                                    break L6;
                                  } else {
                                    if (var6 == this.field_k) {
                                      break L6;
                                    } else {
                                      if (2 * this.field_g.field_D[var6] <= this.field_g.field_D[var7] * 3) {
                                        break L6;
                                      } else {
                                        var5 = 8;
                                        break L6;
                                      }
                                    }
                                  }
                                } else {
                                  var5 = -1;
                                  break L6;
                                }
                              } else {
                                var5 = 8;
                                break L6;
                              }
                            }
                          }
                          if ((var5 ^ -1) != 0) {
                            this.field_j.a(0, (byte) 93, var4, this.field_n, var5);
                            this.field_c[this.field_k] = rg.a(6, 3, (byte) 121);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_j.a((byte) -63, this.field_n, var4);
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                break L3;
              }
            }
            return;
          } else {
            this.field_c[var4_int] = this.field_c[var4_int] - 1;
            this.field_d[var4_int] = this.field_d[var4_int] - 1;
            if ((var4_int ^ -1) == (var2 ^ -1)) {
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = hs.field_i[param0.field_p];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ka.D(");

            if (param0 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private final int b(int param0, int param1, int param2) {
        int var4;
        int[] var5;
        int var6;
        int var7;
        int var8;
        ln var9;
        mg var10;
        int var11;
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
        int var2;
        int var3_int;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
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
                        if ((var7 ^ -1) != (this.field_n.field_x ^ -1)) {
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
        if (param0 >= -19) {
            this.b(102, -64);
        }
        return this.field_l;
    }

    private final void a(byte param0, int param1, ln param2) {
        qa var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
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
            stackIn_13_0 = (RuntimeException) (var4_ref);

            stackIn_13_1 = new StringBuilder().append("ka.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
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
