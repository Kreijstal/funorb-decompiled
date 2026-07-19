/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends mc {
    static int[][] field_w;
    static gq field_A;
    static bc field_z;
    static int[] field_x;
    static String field_v;
    private Object field_y;

    final Object e(byte param0) {
        if (param0 >= -106) {
            field_v = (String) null;
        }
        return this.field_y;
    }

    final static boolean f(byte param0) {
        bc var2 = null;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 >= 111) {
            break L0;
          } else {
            var2 = (bc) null;
            m.a((byte) -50, (int[]) null, (bc) null, (nk[]) null, (bc) null);
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (!hg.field_r) {
                break L3;
              } else {
                if (h.field_q) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (!w.d(true)) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              break L2;
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    public static void e(int param0) {
        field_A = null;
        field_z = null;
        if (param0 >= -107) {
            field_w = (int[][]) null;
        }
        field_v = null;
        field_w = (int[][]) null;
        field_x = null;
    }

    final boolean e(boolean param0) {
        if (param0) {
            return false;
        }
        return false;
    }

    final static void a(byte param0, fs[] param1, ob param2, int param3, pf param4, int param5, me param6, fs param7, l param8, boolean param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12_int = 0;
        sd var12 = null;
        cs var12_ref = null;
        int var13 = 0;
        lo var13_ref_lo = null;
        ln var14_ref_ln = null;
        int var14 = 0;
        ln var15 = null;
        int var16 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param9) {
                param8.a((byte) -87, param1, param2);
                break L1;
              } else {
                param8.a(param2, param1, 127);
                break L1;
              }
            }
            param8.a(10529, param2, param1);
            var10_int = 0;
            var11 = 0;
            L2: while (true) {
              if (var11 >= param1.length) {
                L3: {
                  param2.c(var10_int, (byte) -89);
                  if (param0 <= -57) {
                    break L3;
                  } else {
                    field_v = (String) null;
                    break L3;
                  }
                }
                var11 = 0;
                L4: while (true) {
                  if (param1.length <= var11) {
                    var11 = 0;
                    var12_int = 0;
                    L5: while (true) {
                      if (param1.length <= var12_int) {
                        param2.c(var11, (byte) -118);
                        var12_int = 0;
                        L6: while (true) {
                          if (var12_int >= param1.length) {
                            var12_int = 0;
                            L7: while (true) {
                              if (var12_int >= param1.length) {
                                L8: {
                                  if (param7 != null) {
                                    param2.c(param7.field_w, (byte) -127);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                var12_int = 0;
                                L9: while (true) {
                                  if (param1.length <= var12_int) {
                                    param2.c(param4.e(0), (byte) -67);
                                    var12_ref = (cs) ((Object) param4.d(0));
                                    L10: while (true) {
                                      if (var12_ref == null) {
                                        param6.a(-3, param2);
                                        param2.c(param5, (byte) -125);
                                        param2.c(param3, (byte) -90);
                                        break L0;
                                      } else {
                                        di.a(var12_ref.field_n, false, param2);
                                        di.a(var12_ref.field_k, false, param2);
                                        param2.c(var12_ref.field_m, (byte) -82);
                                        var12_ref = (cs) ((Object) param4.a((byte) -71));
                                        continue L10;
                                      }
                                    }
                                  } else {
                                    var13 = 0;
                                    L11: while (true) {
                                      if (var13 >= 4) {
                                        var12_int++;
                                        continue L9;
                                      } else {
                                        param2.c(param1[var12_int].field_u[var13], (byte) -94);
                                        var13++;
                                        continue L11;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var13 = var12_int + 1;
                                L12: while (true) {
                                  if (var13 >= param1.length) {
                                    var12_int++;
                                    continue L7;
                                  } else {
                                    L13: {
                                      if (param1[var12_int].field_h[var13]) {
                                        param2.c(param1[var12_int].field_f[var13], (byte) -55);
                                        break L13;
                                      } else {
                                        param2.c(127, (byte) -88);
                                        break L13;
                                      }
                                    }
                                    var13++;
                                    continue L12;
                                  }
                                }
                              }
                            }
                          } else {
                            L14: {
                              var13_ref_lo = param1[var12_int].field_m;
                              if (var13_ref_lo == null) {
                                break L14;
                              } else {
                                if (var13_ref_lo.g(122) <= 0) {
                                  break L14;
                                } else {
                                  im.a(param1[var12_int], param2, 9555);
                                  di.a(var13_ref_lo.field_q, false, param2);
                                  var14 = var13_ref_lo.g(-127);
                                  param2.c(var14, (byte) -69);
                                  var15 = var13_ref_lo.j(18229);
                                  L15: while (true) {
                                    if (var15 == null) {
                                      break L14;
                                    } else {
                                      L16: {
                                        if (var15 != var13_ref_lo.field_q) {
                                          di.a(var15, false, param2);
                                          break L16;
                                        } else {
                                          break L16;
                                        }
                                      }
                                      var15 = var13_ref_lo.h(-23410);
                                      continue L15;
                                    }
                                  }
                                }
                              }
                            }
                            var12_int++;
                            continue L6;
                          }
                        }
                      } else {
                        L17: {
                          if (param1[var12_int].field_m == null) {
                            break L17;
                          } else {
                            if ((param1[var12_int].field_m.g(-68) ^ -1) >= -1) {
                              break L17;
                            } else {
                              var11++;
                              break L17;
                            }
                          }
                        }
                        var12_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var12 = (sd) ((Object) param1[var11].field_i.d(0));
                    L18: while (true) {
                      if (var12 == null) {
                        var11++;
                        continue L4;
                      } else {
                        im.a(var12.field_o, param2, 9555);
                        di.a(var12.field_q, false, param2);
                        var13 = var12.g(89);
                        param2.c(var13, (byte) -112);
                        var14_ref_ln = var12.j(18229);
                        L19: while (true) {
                          if (var14_ref_ln == null) {
                            var12 = (sd) ((Object) param1[var11].field_i.a((byte) -71));
                            continue L18;
                          } else {
                            L20: {
                              if (var14_ref_ln != var12.field_q) {
                                di.a(var14_ref_ln, false, param2);
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            var14_ref_ln = var12.h(-23410);
                            continue L19;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var10_int = var10_int + param1[var11].field_i.e(0);
                var11++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L21: {
            var10 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) (var10);
            stackOut_61_1 = new StringBuilder().append("m.A(").append(param0).append(',');
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param1 == null) {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L21;
            } else {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L21;
            }
          }
          L22: {
            stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param2 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L22;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L22;
            }
          }
          L23: {
            stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',').append(param3).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param4 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L23;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L23;
            }
          }
          L24: {
            stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
            stackOut_70_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_70_2).append(',').append(param5).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param6 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L24;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L24;
            }
          }
          L25: {
            stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param7 == null) {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L25;
            } else {
              stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L25;
            }
          }
          L26: {
            stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
            stackOut_76_1 = ((StringBuilder) (Object) stackIn_76_1).append(stackIn_76_2).append(',');
            stackIn_78_0 = stackOut_76_0;
            stackIn_78_1 = stackOut_76_1;
            stackIn_77_0 = stackOut_76_0;
            stackIn_77_1 = stackOut_76_1;
            if (param8 == null) {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "null";
              stackIn_79_0 = stackOut_78_0;
              stackIn_79_1 = stackOut_78_1;
              stackIn_79_2 = stackOut_78_2;
              break L26;
            } else {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "{...}";
              stackIn_79_0 = stackOut_77_0;
              stackIn_79_1 = stackOut_77_1;
              stackIn_79_2 = stackOut_77_2;
              break L26;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_79_0), stackIn_79_2 + ',' + param9 + ')');
        }
    }

    m(Object param0, int param1) {
        super(param1);
        try {
            this.field_y = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "m.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, int[] param1, bc param2, nk[] param3, bc param4) {
        bi[] dupTemp$4 = null;
        bi[] dupTemp$5 = null;
        bi[] dupTemp$6 = null;
        bi[] dupTemp$7 = null;
        RuntimeException var5 = null;
        nk[] var5_array = null;
        int[] var6 = null;
        nk[] var6_array = null;
        int var7_int = 0;
        hh var7 = null;
        qr var8 = null;
        qr var9 = null;
        qr var10 = null;
        qr var11 = null;
        bi[] var12 = null;
        bi[] var13 = null;
        bi[] var14 = null;
        qr var15 = null;
        bi[] var16 = null;
        bi[] var17 = null;
        int var18 = 0;
        int[] var19 = null;
        nk[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var18 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var20 = tp.a("lobby", param4, "crowns", (byte) -118);
              var5_array = var20;
              rg.field_d = var20.length;
              if (param3 == null) {
                break L1;
              } else {
                var6_array = new nk[param3.length + rg.field_d];
                var7_int = 0;
                L2: while (true) {
                  if (rg.field_d <= var7_int) {
                    var5_array = var6_array;
                    var7_int = 0;
                    L3: while (true) {
                      if (param3.length <= var7_int) {
                        break L1;
                      } else {
                        var6_array[var7_int + rg.field_d] = param3[var7_int];
                        var7_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var6_array[var7_int] = var20[var7_int];
                    var7_int++;
                    continue L2;
                  }
                }
              }
            }
            var23 = new int[var5_array.length];
            var21 = var23;
            var19 = var21;
            var24 = var19;
            var22 = var24;
            var6 = var22;
            var7_int = 0;
            L4: while (true) {
              if (var7_int >= rg.field_d) {
                L5: {
                  if (param3 != null) {
                    if (param1 != null) {
                      var7_int = 0;
                      L6: while (true) {
                        if (var7_int >= param3.length) {
                          break L5;
                        } else {
                          var6[rg.field_d - -var7_int] = param1[var7_int];
                          var7_int++;
                          continue L6;
                        }
                      }
                    } else {
                      var7_int = 0;
                      L7: while (true) {
                        if (param3.length <= var7_int) {
                          break L5;
                        } else {
                          var6[rg.field_d + var7_int] = param3[var7_int].field_c;
                          var7_int++;
                          continue L7;
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                rc.field_l = 2;
                s.field_i = 11;
                tg.field_a = 4;
                cr.field_c = 15;
                qo.field_b = 2;
                var7 = go.a(115, "largefont", param4, param2, "lobby");
                ge.field_p = go.a(117, "generalfont", param4, param2, "lobby");
                ul.field_xb = go.a(123, "chatfont", param4, param2, "lobby");
                var7.a(var5_array, var24);
                ge.field_p.a(var5_array, var24);
                ul.field_xb.a(var5_array, var24);
                var8 = new qr(0L, (qr) null);
                var8.field_nb = (nq) ((Object) var7);
                var8.field_x = 16777215;
                var8.field_Y = cr.field_c;
                var8.field_G = 1;
                var9 = var8;
                var9.field_y = 1;
                var10 = new qr(0L, (qr) null);
                var10.field_x = 16777215;
                var10.field_Y = cr.field_c;
                var10.field_nb = (nq) ((Object) ge.field_p);
                var10.field_G = 1;
                var11 = var10;
                var11.field_y = 1;
                gg.field_d = new qr(0L, var8);
                gg.field_d.field_F = re.a(ae.a(-82, "lobby", param4, "heading"), 123);
                oh.field_a = new qr(0L, (qr) null);
                oh.field_a.field_F = tj.a(false, 4210752, false, 120, 8421504, (byte) -63);
                l.field_a = new qr(0L, (qr) null);
                l.field_a.field_F = cs.a(16, 3, 114, 6316128, 6316128, 1);
                h.field_v = new qr(0L, (qr) null);
                h.field_v.field_F = re.a(ae.a(-113, "lobby", param4, "popup"), 122);
                var12 = re.a(ae.a(124, "lobby", param4, "popup_mouseover"), 117);
                var13 = ae.a(32, "lobby", param4, "button");
                var14 = re.a(ae.a(-97, "lobby", param4, "tab_active"), 82);
                un.field_g = new qr(0L, var8);
                un.field_g.field_F = var14;
                po.field_d = new qr(0L, (qr) null);
                po.field_d.field_pb = id.a(2, param4, "lobby", "closebutton");
                po.field_d.field_fb = id.a(2, param4, "lobby", "closebutton_mouseover");
                nl.field_b = new qr(0L, var8);
                nl.field_b.field_F = tj.a(true, 2039583, true, 40, 3815994, (byte) -47);
                td.field_N = new qr(0L, var10);
                td.field_N.field_kb = 2;
                td.field_N.field_F = tj.a(true, 2039583, false, 30, 3815994, (byte) -111);
                jr.field_h = new qr(0L, var10);
                jr.field_h.field_kb = 2;
                jr.field_h.field_F = tj.a(false, 2039583, false, 30, 3815994, (byte) -35);
                vm.field_Cb = new qr(0L, var10);
                vm.field_Cb.field_kb = 2;
                vm.field_Cb.field_F = tj.a(false, 2039583, true, 30, 3815994, (byte) -64);
                ii.field_u = new qr(0L, (qr) null);
                ii.field_u.field_x = 13421772;
                ii.field_u.field_Y = cr.field_c;
                ii.field_u.field_G = 1;
                ii.field_u.field_nb = (nq) ((Object) ge.field_p);
                gn.field_w = new qr(0L, ii.field_u);
                gn.field_w.field_ab = 16777215;
                gn.field_w.field_W = 8421504;
                gn.field_w.field_jb = 16777215;
                gn.field_w.field_x = 16764006;
                gn.field_w.field_qb = 16777215;
                var15 = new qr(0L, gn.field_w);
                var15.field_x = 16777215;
                var15.field_Y = cr.field_c;
                var15.field_nb = (nq) ((Object) var7);
                fg.field_b = new qr(0L, ii.field_u);
                fg.field_b.field_F = tj.a(false, 2236962, false, 16, 2236962, (byte) -40);
                fg.field_b.field_kb = 2;
                dm.field_h = new qr(0L, ii.field_u);
                dm.field_h.field_F = tj.a(false, 1513239, false, 16, 1513239, (byte) -36);
                dm.field_h.field_kb = 2;
                oj.field_zb = new qr(0L, fg.field_b);
                oj.field_zb.a(gn.field_w, false);
                ek.field_E = new qr(0L, dm.field_h);
                ek.field_E.a(gn.field_w, false);
                var16 = ae.a(-82, "lobby", param4, "button_mouseover");
                hd.field_t = new ul(h.field_v, var12, ii.field_u, gn.field_w, 3, 2, qo.field_b, 3, cr.field_c);
                rd.field_h = new qr(0L, gn.field_w);
                rd.field_h.field_lb = var16;
                rd.field_h.field_T = 1;
                rd.field_h.field_t = 1;
                rd.field_h.field_V = 1;
                rd.field_h.field_J = 1;
                if (param0 < -25) {
                  rd.field_h.field_F = var13;
                  rd.field_h.field_vb = ae.a(-112, "lobby", param4, "button_mouseheld");
                  rd.field_h.field_sb = ae.a(62, "lobby", param4, "button_active");
                  rd.field_h.field_wb = ae.a(-104, "lobby", param4, "button_disabled");
                  rd.field_h.field_y = 1;
                  re.field_h = new qr(0L, gn.field_w);
                  re.field_h.field_y = 1;
                  re.field_h.field_F = re.a(ae.a(73, "lobby", param4, "tab_inactive"), 127);
                  re.field_h.field_lb = re.a(ae.a(100, "lobby", param4, "tab_mouseover"), 85);
                  re.field_h.field_sb = var14;
                  tm.field_t = new qr(0L, (qr) null);
                  tm.field_t.field_F = cs.a(16, 3, 206, 1856141, 1127256, -1);
                  rs.field_Eb = new qr(0L, (qr) null);
                  rs.field_Eb.field_F = cs.a(16, 3, 290, 11579568, 6052956, -1);
                  ea.field_a = new qr(0L, var15);
                  ea.field_a.field_T = 1;
                  ea.field_a.field_y = 1;
                  ea.field_a.field_J = 1;
                  ea.field_a.field_t = 1;
                  ea.field_a.field_V = 1;
                  af.field_f = new qr(0L, ea.field_a);
                  jf.field_b = new qr(0L, gn.field_w);
                  jf.field_b.field_V = 1;
                  jf.field_b.field_t = 1;
                  jf.field_b.field_y = 1;
                  jf.field_b.field_T = 1;
                  jf.field_b.field_J = 1;
                  kq.field_h = new qr(0L, jf.field_b);
                  rf.field_l = new qr(0L, jf.field_b);
                  bd.field_E = new qr(0L, ea.field_a);
                  n.field_o = new qr(0L, jf.field_b);
                  mc.field_o = new qr(0L, jf.field_b);
                  an.field_d = new qr(0L, jf.field_b);
                  jf.field_b.field_F = re.a(ae.a(106, "lobby", param4, "smallbutton"), 47);
                  jf.field_b.field_lb = re.a(ae.a(-79, "lobby", param4, "smallbutton_mouseover"), 103);
                  dupTemp$4 = re.a(ae.a(-114, "lobby", param4, "smallbutton_active"), 51);
                  jf.field_b.field_sb = dupTemp$4;
                  jf.field_b.field_vb = dupTemp$4;
                  jf.field_b.field_wb = re.a(ae.a(109, "lobby", param4, "smallbutton_disabled"), 65);
                  af.field_f.field_F = re.a(ae.a(-99, "lobby", param4, "mediumbutton"), 41);
                  af.field_f.field_lb = re.a(ae.a(80, "lobby", param4, "mediumbutton_mouseover"), 126);
                  af.field_f.field_vb = re.a(ae.a(113, "lobby", param4, "mediumbutton_mouseheld"), 95);
                  ea.field_a.field_F = re.a(ae.a(-121, "lobby", param4, "bigbutton"), 53);
                  ea.field_a.field_lb = re.a(ae.a(92, "lobby", param4, "bigbutton_mouseover"), 76);
                  ea.field_a.field_vb = re.a(ae.a(-108, "lobby", param4, "bigbutton_mouseheld"), 127);
                  ea.field_a.field_wb = re.a(ae.a(-98, "lobby", param4, "bigbutton_disabled"), 122);
                  kq.field_h.field_F = re.a(ae.a(-86, "lobby", param4, "greenbutton"), 76);
                  kq.field_h.field_lb = re.a(ae.a(-78, "lobby", param4, "greenbutton_mouseover"), 91);
                  kq.field_h.field_vb = re.a(ae.a(-98, "lobby", param4, "greenbutton_mouseheld"), 39);
                  rf.field_l.field_F = re.a(ae.a(-126, "lobby", param4, "redbutton"), 56);
                  rf.field_l.field_lb = re.a(ae.a(120, "lobby", param4, "redbutton_mouseover"), 55);
                  rf.field_l.field_vb = re.a(ae.a(126, "lobby", param4, "redbutton_mouseheld"), 103);
                  bd.field_E.field_F = re.a(ae.a(-101, "lobby", param4, "backbutton"), 48);
                  bd.field_E.field_lb = re.a(ae.a(-103, "lobby", param4, "backbutton_mouseover"), 60);
                  bd.field_E.field_vb = re.a(ae.a(-104, "lobby", param4, "backbutton_mouseheld"), 123);
                  bd.field_E.field_wb = re.a(ae.a(53, "lobby", param4, "backbutton_disabled"), 40);
                  an.field_d.field_F = re.a(ae.a(115, "lobby", param4, "gameoptionbutton"), 57);
                  an.field_d.field_lb = re.a(ae.a(54, "lobby", param4, "gameoptionbutton_mouseover"), 117);
                  dupTemp$5 = re.a(ae.a(77, "lobby", param4, "gameoptionbutton_active"), 52);
                  an.field_d.field_sb = dupTemp$5;
                  an.field_d.field_vb = dupTemp$5;
                  an.field_d.field_wb = re.a(ae.a(-114, "lobby", param4, "gameoptionbutton_disabled"), 121);
                  n.field_o.field_F = re.a(ae.a(-117, "lobby", param4, "chatbutton"), 75);
                  n.field_o.field_lb = re.a(ae.a(84, "lobby", param4, "chatbutton_mouseover"), 122);
                  dupTemp$6 = re.a(ae.a(124, "lobby", param4, "chatbutton_active"), 53);
                  n.field_o.field_sb = dupTemp$6;
                  n.field_o.field_vb = dupTemp$6;
                  mc.field_o.field_F = re.a(ae.a(74, "lobby", param4, "chatfilterbutton"), 104);
                  mc.field_o.field_lb = re.a(ae.a(-95, "lobby", param4, "chatfilterbutton_mouseover"), 101);
                  dupTemp$7 = re.a(ae.a(91, "lobby", param4, "chatfilterbutton_active"), 77);
                  mc.field_o.field_sb = dupTemp$7;
                  mc.field_o.field_vb = dupTemp$7;
                  var17 = ae.a(-118, "lobby", param4, "checkbox");
                  fk.field_i = new rs(0L, var17[1], var17[0], 1, gn.field_w, (String) null);
                  sj.field_c = new qr(0L, (qr) null);
                  sj.field_c.field_F = cg.a(-15338, id.a(2, param4, "lobby", "slideregion"));
                  sj.field_c.field_lb = cg.a(-15338, id.a(2, param4, "lobby", "slideregion_mouseover"));
                  sj.field_c.field_vb = cg.a(-15338, id.a(2, param4, "lobby", "slideregion_mouseheld"));
                  sj.field_c.field_wb = cg.a(-15338, id.a(2, param4, "lobby", "slideregion_disabled"));
                  ml.field_l = new qr(0L, (qr) null);
                  ml.field_l.field_F = re.a(ae.a(126, "lobby", param4, "dragbar"), 33);
                  ml.field_l.field_lb = re.a(ae.a(-109, "lobby", param4, "dragbar_mouseover"), 118);
                  ml.field_l.field_vb = re.a(ae.a(-77, "lobby", param4, "dragbar_mouseheld"), 67);
                  ml.field_l.field_wb = re.a(ae.a(57, "lobby", param4, "dragbar_disabled"), 126);
                  sk.field_k = new qr(0L, (qr) null);
                  sk.field_k.field_pb = id.a(2, param4, "lobby", "upbutton");
                  sk.field_k.field_fb = id.a(2, param4, "lobby", "upbutton_mouseover");
                  sk.field_k.field_U = id.a(2, param4, "lobby", "upbutton_mouseheld");
                  sk.field_k.field_ob = id.a(2, param4, "lobby", "upbutton_disabled");
                  eg.field_u = new qr(0L, (qr) null);
                  eg.field_u.field_pb = id.a(2, param4, "lobby", "downbutton");
                  eg.field_u.field_fb = id.a(2, param4, "lobby", "downbutton_mouseover");
                  eg.field_u.field_U = id.a(2, param4, "lobby", "downbutton_mouseheld");
                  eg.field_u.field_ob = id.a(2, param4, "lobby", "downbutton_disabled");
                  se.field_m = new ur(0L, sk.field_k, eg.field_u, sj.field_c, ml.field_l);
                  ih.field_g = new am(0L, (qr) null, me.field_d, se.field_m, jf.field_b, (String) null, (String) null);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var23[var7_int] = 10;
                var7_int++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("m.G(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          L11: {
            stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param4 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, bi[] param5, int param6, int param7, bi[] param8, int param9, nq param10, nq param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, bi[] param19, int param20) {
        RuntimeException var21 = null;
        bi[] var22 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              mb.a(param2, param16, param9, 0, param12, param13, param20, param7, param6, param0, param4, param10, param17, param3, new v(param8), new v(param19), param18, param11, param14, new v(param5), param15);
              if (param1 == 13421772) {
                break L1;
              } else {
                var22 = (bi[]) null;
                m.a(48, 114, -92, -17, -81, (bi[]) null, 87, -77, (bi[]) null, 10, (nq) null, (nq) null, -117, -102, 14, -52, -97, -21, 46, (bi[]) null, 33);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var21 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var21);
            stackOut_3_1 = new StringBuilder().append("m.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param5 == null) {
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
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param8 == null) {
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
          L4: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param9).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param10 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param11 == null) {
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
          L6: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param19 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param20 + ')');
        }
    }

    static {
        field_A = new gq(12, 0, 1, 0);
        field_x = new int[128];
        field_v = "PEACE DECLARED!";
    }
}
