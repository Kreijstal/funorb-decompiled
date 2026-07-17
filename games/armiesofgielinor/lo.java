/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo extends tc {
    private int field_t;
    private byte[] field_s;
    int field_p;
    private ne[] field_r;
    int field_l;
    static me field_q;
    int field_n;
    int field_k;
    static um field_u;
    static String field_m;
    static String field_o;

    final static void a(mo param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        mo var3 = null;
        int var4 = 0;
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
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null != param0.field_h) {
              L1: {
                L2: {
                  if (param0.field_a != 0) {
                    break L2;
                  } else {
                    if (0 == param0.field_e) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var2_int = 0;
                L3: while (true) {
                  if (lk.field_h <= var2_int) {
                    break L1;
                  } else {
                    L4: {
                      var3 = an.field_F[var2_int];
                      if (2 != var3.field_b) {
                        break L4;
                      } else {
                        if (param0.field_a != var3.field_a) {
                          break L4;
                        } else {
                          if (var3.field_e == param0.field_e) {
                            return;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2_int++;
                    continue L3;
                  }
                }
              }
              L5: {
                if (null == param0.field_d) {
                  break L5;
                } else {
                  ma.field_ab = param0.field_n;
                  rv.field_b = param0.field_d;
                  ge.field_h = param0.field_m;
                  no.field_S = param0.field_b;
                  break L5;
                }
              }
              bc.a(3208, param0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("lo.D(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + -1 + 41);
        }
    }

    private final void a(ne[] param0, vh param1) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        jd var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var4_int = param1.k(0);
              var5 = 0;
              var6 = 0;
              L1: while (true) {
                if (var4_int <= var6) {
                  break L0;
                } else {
                  L2: {
                    var7 = param1.k(0);
                    var8 = param1.k(0);
                    if (var7 < 0) {
                      break L2;
                    } else {
                      if (((lo) this).field_l <= var7) {
                        break L2;
                      } else {
                        if (var8 < 0) {
                          break L2;
                        } else {
                          if (var8 < ((lo) this).field_n) {
                            var9 = new jd(var7, var8, 0);
                            var10 = var7 + var8 * ((lo) this).field_l;
                            if (0 > var10) {
                              break L2;
                            } else {
                              if (var10 > param0.length) {
                                break L2;
                              } else {
                                param0[var10].field_c = var9;
                                param0[var10].field_c.field_O = var5;
                                var5++;
                                break L2;
                              }
                            }
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("lo.G(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          L4: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + 105 + 41);
        }
    }

    final int[][] e(int param0) {
        int[][] var2 = null;
        vh var3_ref_vh = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[][] var7 = null;
        int[][] var8 = null;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          var8 = new int[((lo) this).field_n][((lo) this).field_l];
          var7 = var8;
          var2 = var7;
          if (((lo) this).field_r != null) {
            var3 = 0;
            L1: while (true) {
              if (((lo) this).field_n <= var3) {
                break L0;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= ((lo) this).field_l) {
                    var3++;
                    continue L1;
                  } else {
                    var8[var3][var4] = ((lo) this).field_r[var4 - -(((lo) this).field_l * var3)].field_h;
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            int discarded$5 = 126;
            var3_ref_vh = this.a();
            var4 = 0;
            L3: while (true) {
              if (((lo) this).field_n <= var4) {
                break L0;
              } else {
                var5 = 0;
                L4: while (true) {
                  if (((lo) this).field_l <= var5) {
                    var4++;
                    continue L3;
                  } else {
                    var8[var4][var5] = var3_ref_vh.k(0);
                    var5++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        if (param0 == 28554) {
          return var2;
        } else {
          return null;
        }
    }

    private final ne[] a(int[] param0, int param1, ha param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ne[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ne[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ne[] stackOut_12_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = ((lo) this).field_n * ((lo) this).field_l;
            var5 = new ne[var4_int];
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (((lo) this).field_n <= var7) {
                stackOut_12_0 = (ne[]) var5;
                stackIn_13_0 = stackOut_12_0;
                break L0;
              } else {
                var8 = 0;
                L2: while (true) {
                  if (var8 >= ((lo) this).field_l) {
                    var7++;
                    continue L1;
                  } else {
                    L3: {
                      if (var5.length >= var6) {
                        L4: {
                          var5[var6] = new ne(param0[var6], param2);
                          if (var5[var6].field_h != 11) {
                            break L4;
                          } else {
                            var5[var6].field_h = 0;
                            break L4;
                          }
                        }
                        var6++;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("lo.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(22654).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_13_0;
    }

    private final vh a() {
        sc var3_ref_sc = null;
        int var3 = 0;
        ne[] var4 = null;
        int var5 = 0;
        ne var6 = null;
        int var7 = 0;
        bv var8 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((lo) this).field_s.length >= 4) {
          var8 = new bv(((lo) this).field_s);
          int discarded$2 = 3;
          ((lo) this).field_t = bs.a((vh) (Object) var8);
          if (((lo) this).field_t == 2) {
            int discarded$3 = -23920;
            var3_ref_sc = po.a(var8);
            ((lo) this).field_l = var3_ref_sc.field_k;
            ((lo) this).field_p = var3_ref_sc.field_a;
            ((lo) this).field_n = var3_ref_sc.field_e;
            ((lo) this).field_r = var3_ref_sc.field_c;
            ((lo) this).field_k = var3_ref_sc.field_j;
            var4 = ((lo) this).field_r;
            var5 = 0;
            L0: while (true) {
              if (var5 < var4.length) {
                var6 = var4[var5];
                var6.field_m = var6.e(10);
                var5++;
                continue L0;
              } else {
                return null;
              }
            }
          } else {
            L1: {
              ((lo) this).field_l = var8.k(0);
              ((lo) this).field_n = var8.k(0);
              if (((lo) this).field_t < 1) {
                ((lo) this).field_p = 0;
                break L1;
              } else {
                ((lo) this).field_p = var8.k(0);
                break L1;
              }
            }
            L2: {
              if (((lo) this).field_t >= 0) {
                ((lo) this).field_k = var8.k(0);
                break L2;
              } else {
                var3 = ((lo) this).field_l * ((lo) this).field_n;
                var8.field_q = var8.field_q + var3;
                ((lo) this).field_k = var8.k(0);
                var8.field_q = var8.field_q - (var3 + 1);
                break L2;
              }
            }
            return (vh) (Object) var8;
          }
        } else {
          return null;
        }
    }

    final static void a(va param0, int param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
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
              param0.field_y = new int[]{-1};
              param0.field_v = new char[]{'?'};
              if (param1 == 19003) {
                break L1;
              } else {
                var3 = null;
                lo.a((va) null, 21);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("lo.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_u = null;
        field_q = null;
        field_m = null;
    }

    final static ru[] a(String param0, int param1, String param2, kl param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        ru[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
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
        ru[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
        try {
          L0: {
            if (param1 == -28106) {
              var4_int = param3.a(param2, 110);
              var5 = param3.a((byte) -74, var4_int, param0);
              stackOut_3_0 = ak.a(var5, param3, 0, var4_int);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ru[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("lo.H(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_4_0;
    }

    final ne[] a(int param0, ha param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        ne[] var3_array = null;
        vh var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ne var5_ref_ne = null;
        int[] var6 = null;
        int var7_int = 0;
        ne[] var7 = null;
        int var8 = 0;
        tf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        ne var13 = null;
        jd var14 = null;
        int var15 = 0;
        ne[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        ne[] stackIn_8_0 = null;
        ne[] stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        ne[] stackOut_29_0 = null;
        ne[] stackOut_7_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (null == ((lo) this).field_r) {
              var3_int = 116 % ((param0 - -31) / 60);
              int discarded$4 = 126;
              var4 = this.a();
              var5 = ((lo) this).field_n * ((lo) this).field_l;
              var20 = new int[var5];
              var19 = var20;
              var18 = var19;
              var17 = var18;
              var6 = var17;
              if (2 + var5 > ((lo) this).field_s.length) {
                throw new RuntimeException("Problem loading file");
              } else {
                var7_int = 0;
                L1: while (true) {
                  if (var5 <= var7_int) {
                    L2: {
                      var7 = this.a(var20, 22654, param1);
                      if (0 <= ((lo) this).field_t) {
                        var8 = var4.k(0);
                        var9 = new tf(0, 0);
                        var10 = 0;
                        L3: while (true) {
                          if (var8 <= var10) {
                            break L2;
                          } else {
                            L4: {
                              var11 = var4.k(0);
                              var12 = var11;
                              if (var12 == 0) {
                                var9.field_n = var4.k(0);
                                var9.field_o = var4.k(0);
                                var12 = var4.k(0);
                                var13_int = var4.k(0);
                                var14 = new jd(var9.field_n, var9.field_o, var12);
                                var14.field_O = var13_int;
                                var7[var9.field_o * ((lo) this).field_l + var9.field_n].field_c = var14;
                                break L4;
                              } else {
                                if (1 != var12) {
                                  throw new RuntimeException("Illegal saved item type: " + var11);
                                } else {
                                  L5: {
                                    var9.field_n = var4.k(0);
                                    var9.field_o = var4.k(0);
                                    var12 = var4.k(0);
                                    var13 = var7[var9.field_n - -(var9.field_o * ((lo) this).field_l)];
                                    if (var13.a(false)) {
                                      break L5;
                                    } else {
                                      if (var13.e((byte) -125)) {
                                        break L5;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  var13.field_a = var12;
                                  break L4;
                                }
                              }
                            }
                            var10++;
                            continue L3;
                          }
                        }
                      } else {
                        int discarded$5 = 105;
                        this.a(var7, var4);
                        break L2;
                      }
                    }
                    stackOut_29_0 = (ne[]) var7;
                    stackIn_30_0 = stackOut_29_0;
                    break L0;
                  } else {
                    var6[var7_int] = var4.k(0);
                    var7_int++;
                    continue L1;
                  }
                }
              }
            } else {
              int discarded$6 = 126;
              vh discarded$7 = this.a();
              var16 = ((lo) this).field_r;
              var3_array = var16;
              var4_int = 0;
              L6: while (true) {
                if (var4_int >= var16.length) {
                  stackOut_7_0 = ((lo) this).field_r;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                } else {
                  L7: {
                    var5_ref_ne = var16[var4_int];
                    var5_ref_ne.a((byte) -68, param1);
                    if (!var5_ref_ne.e((byte) -122)) {
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var4_int++;
                  continue L6;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("lo.E(").append(param0).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
        return stackIn_30_0;
    }

    lo(int param0, byte[] param1) {
        try {
            ((lo) this).field_s = param1;
            ((lo) this).field_r = null;
            int discarded$0 = 126;
            vh discarded$1 = this.a();
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "lo.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new me(12, 0, 1, 0);
        field_m = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_o = "Logging in...";
    }
}
