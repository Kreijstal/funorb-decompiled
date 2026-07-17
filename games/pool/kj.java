/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static sa[] field_g;
    int field_k;
    static int field_m;
    static int field_b;
    int field_n;
    int field_d;
    static int field_j;
    int field_e;
    int field_h;
    static String field_l;
    static String[] field_i;
    static vh field_a;
    static volatile int field_c;
    static int field_f;

    public static void b(int param0) {
        field_l = null;
        field_a = null;
        field_g = null;
        field_i = null;
        if (param0 != -9379) {
            field_j = -47;
        }
    }

    final kj a(int param0) {
        if (param0 != -14513) {
            return null;
        }
        return new kj(((kj) this).field_n, ((kj) this).field_h, ((kj) this).field_k, ((kj) this).field_d, ((kj) this).field_e);
    }

    final void a(mm param0, pq param1, byte param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
            var4_int = param1.field_g >> 13;
            var5 = param1.field_k >> 13;
            var6 = (int)(8.0 * param0.field_a + 0.5);
            var7 = (int)(0.5 + param0.field_d * 8.0);
            ((kj) this).field_h = tj.c(-var4_int + var7, var6 + -var5, 4096) >> 2;
            int var8 = -57 % ((param2 - 66) / 54);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "kj.L(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void b(byte param0) {
        ((kj) this).field_n = -1;
        if (param0 < 61) {
            kj.a((byte) 30);
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            Object var3 = null;
            ((kj) this).a((mm) null, (pq) null, (byte) 16);
        }
        return 0 <= ((kj) this).field_n ? true : false;
    }

    final void a(ge param0, byte param1) {
        if (param1 < 67) {
            return;
        }
        try {
            param0.a((byte) -81, ((kj) this).field_n);
            param0.a((byte) -81, ((kj) this).field_h & 2047);
            param0.a((byte) -81, ((kj) this).field_k);
            param0.a(((kj) this).field_d, false);
            param0.a(((kj) this).field_e, false);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "kj.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static void a(int param0, int param1, oc param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int[] var8_array = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        nj var21_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int[] var40 = null;
        int var43 = 0;
        oc var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        int[] var59 = null;
        byte[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int stackIn_14_0 = 0;
        int[] stackIn_15_0 = null;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        nj stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        short stackOut_23_0 = 0;
        short stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        short stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        nj stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        int[] stackOut_14_0 = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var44 = param2;
                if (var44.field_K == null) {
                  break L2;
                } else {
                  if (var44.field_I > 1) {
                    var61 = var44.field_K;
                    ko.a(wa.field_ib, 0, var61, 0, -147296924);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              bo.a(-94);
              break L1;
            }
            var65 = new int[param2.field_o];
            var59 = var65;
            var54 = var59;
            var49 = var54;
            var40 = var49;
            var8_array = var40;
            var66 = new int[param2.field_o];
            var62 = oj.field_r;
            var63 = wa.field_mb;
            var64 = al.field_g;
            var13 = 0;
            L3: while (true) {
              if (param2.field_o <= var13) {
                L4: {
                  if (param1 == 8355711) {
                    break L4;
                  } else {
                    field_f = -76;
                    break L4;
                  }
                }
                var43 = 0;
                var13 = var43;
                L5: while (true) {
                  if (var43 >= eh.field_x) {
                    break L0;
                  } else {
                    L6: {
                      var14 = tl.field_I[var43];
                      var15 = param2.field_y[var14];
                      var16 = param2.field_r[var14];
                      var17 = param2.field_u[var14];
                      if (param2.field_x[var14] >= oj.field_r.length) {
                        stackOut_24_0 = -1;
                        stackIn_25_0 = stackOut_24_0;
                        break L6;
                      } else {
                        stackOut_23_0 = param2.field_x[var14];
                        stackIn_25_0 = stackOut_23_0;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_25_0;
                      if (oj.field_r.length > param2.field_w[var14]) {
                        stackOut_27_0 = param2.field_w[var14];
                        stackIn_28_0 = stackOut_27_0;
                        break L7;
                      } else {
                        stackOut_26_0 = -1;
                        stackIn_28_0 = stackOut_26_0;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_28_0;
                      if (param2.field_O[var14] < oj.field_r.length) {
                        stackOut_30_0 = param2.field_O[var14];
                        stackIn_31_0 = stackOut_30_0;
                        break L8;
                      } else {
                        stackOut_29_0 = -1;
                        stackIn_31_0 = stackOut_29_0;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_31_0;
                        if (null == cf.field_a) {
                          break L10;
                        } else {
                          if (null == param2.field_H) {
                            break L10;
                          } else {
                            if (param2.field_H.length <= var14) {
                              break L10;
                            } else {
                              if (param2.field_H[var14] == -1) {
                                break L10;
                              } else {
                                if (param2.field_H[var14] >= cf.field_a.length) {
                                  break L10;
                                } else {
                                  stackOut_36_0 = cf.field_a[param2.field_H[var14]];
                                  stackIn_38_0 = stackOut_36_0;
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_37_0 = null;
                      stackIn_38_0 = (nj) (Object) stackOut_37_0;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21_ref = stackIn_38_0;
                        var22 = ch.field_M[var15];
                        var23 = li.field_h[var15];
                        var24 = ch.field_M[var16];
                        var25 = li.field_h[var16];
                        var26 = ch.field_M[var17];
                        var27 = li.field_h[var17];
                        if (var19 != var18) {
                          break L12;
                        } else {
                          if (var19 != var20) {
                            break L12;
                          } else {
                            L13: {
                              var28 = var65[var18];
                              var29 = var66[var18];
                              if (var21_ref == null) {
                                stackOut_42_0 = 8355711;
                                stackIn_43_0 = stackOut_42_0;
                                break L13;
                              } else {
                                stackOut_41_0 = var21_ref.field_a;
                                stackIn_43_0 = stackOut_41_0;
                                break L13;
                              }
                            }
                            var30 = stackIn_43_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = (-16711742 & var31 * var28) >>> 8 | 922812160 & var32 * var28 >>> 8;
                            var33 = var33 + 65793 * var29;
                            dp.a(var24, var27, var23, var25, var26, var33 >> 1 & 8355711, 108, var22);
                            break L11;
                          }
                        }
                      }
                      L14: {
                        var28 = var65[var18];
                        var29 = var65[var19];
                        var30 = var65[var20];
                        var31 = var66[var18];
                        var32 = var66[var19];
                        var33 = var66[var20];
                        if (var21_ref != null) {
                          stackOut_46_0 = var21_ref.field_a;
                          stackIn_47_0 = stackOut_46_0;
                          break L14;
                        } else {
                          stackOut_45_0 = 8355711;
                          stackIn_47_0 = stackOut_45_0;
                          break L14;
                        }
                      }
                      var34 = stackIn_47_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = 2130771712 & var36 * var28 >>> 8 | (var35 * var28 & -16711742) >>> 8;
                      var38 = (var36 * var29 & 16711777) >>> 8 | -83951361 & var29 * var35 >>> 8;
                      var37 = var37 + var31 * 65793;
                      var39 = (16711913 & var36 * var30) >>> 8 | -755040001 & var30 * var35 >>> 8;
                      var38 = var38 + var32 * 65793;
                      var39 = var39 + 65793 * var33;
                      ta.a((byte) -125, var27, var22, 255 & var37, var39 >> 16, var38 >> 8 & 255, var23, var38 >> 16, (var39 & 65528) >> 8, var37 >> 8 & 255, var38 & 255, var24, var37 >> 16, var25, var26, 255 & var39);
                      break L11;
                    }
                    var43++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = var62[var13] * param7 + (param3 * var63[var13] + param5 * var64[var13]) >> 8;
                  if (0 <= var14) {
                    break L15;
                  } else {
                    var14 = -var14;
                    break L15;
                  }
                }
                L16: {
                  if (var14 >= 0) {
                    if (var14 >= 128) {
                      stackOut_13_0 = 256;
                      stackIn_14_0 = stackOut_13_0;
                      break L16;
                    } else {
                      stackOut_12_0 = var14 + 128;
                      stackIn_14_0 = stackOut_12_0;
                      break L16;
                    }
                  } else {
                    stackOut_10_0 = 128;
                    stackIn_14_0 = stackOut_10_0;
                    break L16;
                  }
                }
                L17: {
                  var14 = stackIn_14_0;
                  var15 = param4 * var63[var13] + param6 * var62[var13] - -(var64[var13] * param0) >> 8;
                  stackOut_14_0 = cp.field_d;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (var15 >= 0) {
                    stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                    stackOut_16_1 = var15;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    break L17;
                  } else {
                    stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                    stackOut_15_1 = -var15;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L17;
                  }
                }
                var15 = stackIn_17_0[stackIn_17_1];
                var14 = (-var15 + 256) * var14 >>> 8;
                var65[var13] = var14;
                var66[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var8;
            stackOut_50_1 = new StringBuilder().append("kj.J(").append(param0).append(44).append(param1).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param2 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L18;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L18;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static void a(byte param0) {
        uh.a(-124, ub.field_n, uo.field_Lb, dg.field_J, tq.field_m);
        if (param0 > -97) {
            Object var2 = null;
            kj.a(-66, 60, (oc) null, -82, -71, 60, 97, 51);
        }
    }

    final void c(int param0, kj param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (~((kj) this).field_n == ~param1.field_n) {
                break L1;
              } else {
                L2: {
                  var3_int = param1.field_n - ((kj) this).field_n;
                  if (8 <= var3_int) {
                    break L2;
                  } else {
                    if (var3_int <= -8) {
                      break L2;
                    } else {
                      ((kj) this).field_n = param1.field_n;
                      break L1;
                    }
                  }
                }
                ((kj) this).field_n = ((kj) this).field_n + var3_int / 8;
                break L1;
              }
            }
            if (param0 == 255) {
              L3: {
                if (~((kj) this).field_h != ~param1.field_h) {
                  L4: {
                    var3_int = -((kj) this).field_h + param1.field_h;
                    if (var3_int > 1024) {
                      var3_int -= 2048;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var3_int < -1024) {
                      var3_int += 2048;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (var3_int >= 8) {
                        break L7;
                      } else {
                        if (var3_int > -8) {
                          ((kj) this).field_h = param1.field_h;
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    ((kj) this).field_h = ((kj) this).field_h + var3_int / 8;
                    break L6;
                  }
                  ((kj) this).field_h = ((kj) this).field_h & 2047;
                  break L3;
                } else {
                  break L3;
                }
              }
              L8: {
                if (~((kj) this).field_k != ~param1.field_k) {
                  L9: {
                    var3_int = param1.field_k - ((kj) this).field_k;
                    if (var3_int >= 8) {
                      break L9;
                    } else {
                      if (var3_int > -8) {
                        ((kj) this).field_k = param1.field_k;
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  ((kj) this).field_k = ((kj) this).field_k + var3_int / 8;
                  break L8;
                } else {
                  break L8;
                }
              }
              L10: {
                if (((kj) this).field_d != param1.field_d) {
                  L11: {
                    var3_int = -((kj) this).field_d + param1.field_d;
                    if (8 <= var3_int) {
                      break L11;
                    } else {
                      if (var3_int <= -8) {
                        break L11;
                      } else {
                        ((kj) this).field_d = param1.field_d;
                        break L10;
                      }
                    }
                  }
                  ((kj) this).field_d = ((kj) this).field_d + var3_int / 8;
                  break L10;
                } else {
                  break L10;
                }
              }
              L12: {
                if (~((kj) this).field_e == ~param1.field_e) {
                  break L12;
                } else {
                  L13: {
                    var3_int = param1.field_e + -((kj) this).field_e;
                    if (var3_int >= 8) {
                      break L13;
                    } else {
                      if (-8 < var3_int) {
                        ((kj) this).field_e = param1.field_e;
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  ((kj) this).field_e = ((kj) this).field_e + var3_int / 8;
                  break L12;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var3;
            stackOut_42_1 = new StringBuilder().append("kj.D(").append(param0).append(44);
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L14;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L14;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 41);
        }
    }

    final static void a(int param0, dd param1) {
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
              uc.a((byte) 90);
              qh.a(param1.field_D, param1.field_w, param1.field_y);
              if (param0 >= 38) {
                break L1;
              } else {
                var3 = null;
                kj.a(30, (dd) null);
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
            stackOut_3_1 = new StringBuilder().append("kj.G(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final boolean a(int param0, kj param1) {
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
              if (param0 == -2043) {
                break L1;
              } else {
                field_j = -19;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1.field_n != ((kj) this).field_n) {
                  break L3;
                } else {
                  if (param1.field_h != ((kj) this).field_h) {
                    break L3;
                  } else {
                    if (param1.field_k != ((kj) this).field_k) {
                      break L3;
                    } else {
                      if (((kj) this).field_d != param1.field_d) {
                        break L3;
                      } else {
                        if (param1.field_e != ((kj) this).field_e) {
                          break L3;
                        } else {
                          stackOut_7_0 = 1;
                          stackIn_9_0 = stackOut_7_0;
                          break L2;
                        }
                      }
                    }
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
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("kj.C(").append(param0).append(44);
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
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final void a(int param0, ge param1) {
        ((kj) this).field_n = param1.d(-1034);
        ((kj) this).field_h = param1.d(-1034);
        ((kj) this).field_k = param1.d(param0 ^ -64266);
        if (param0 != 65280) {
            return;
        }
        try {
            ((kj) this).field_d = param1.e((byte) 105);
            ((kj) this).field_e = param1.e((byte) 105);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "kj.K(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0, kj param1) {
        try {
            ((kj) this).field_h = param1.field_h;
            ((kj) this).field_d = param1.field_d;
            ((kj) this).field_n = param1.field_n;
            ((kj) this).field_k = param1.field_k;
            if (param0 < 21) {
                Object var4 = null;
                kj.a(63, -58, (oc) null, 93, 55, 29, 35, -81);
            }
            ((kj) this).field_e = param1.field_e;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "kj.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    kj() {
        ((kj) this).field_d = 0;
        ((kj) this).field_k = 576;
        ((kj) this).field_e = 0;
        ((kj) this).field_h = 0;
        ((kj) this).field_n = 2048;
    }

    private kj(int param0, int param1, int param2, int param3, int param4) {
        ((kj) this).field_n = param0;
        ((kj) this).field_d = param3;
        ((kj) this).field_k = param2;
        ((kj) this).field_h = param1;
        ((kj) this).field_e = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_g = new sa[512];
        field_l = "Potting the rest of your group for you.";
        field_i = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        for (var0 = 0; field_g.length > var0; var0++) {
            field_g[var0] = new sa();
        }
        field_c = 0;
        field_f = 479232;
    }
}
