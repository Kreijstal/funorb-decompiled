/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static il field_b;
    static int[] field_c;
    static String field_d;
    static int[] field_a;

    private final static boolean a(byte param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
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
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (ka.a(param1, false, -2)) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= param1.length()) {
                  if (param0 == -110) {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    field_c = null;
                    return true;
                  }
                } else {
                  if (ue.a(-16490, param1.charAt(var3_int))) {
                    var3_int++;
                    continue L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("pl.E(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 0 + 41);
        }
        return stackIn_13_0 != 0;
    }

    final static void a(int param0) {
        if (!(null == kb.field_a)) {
            kb.field_a.t(20252);
        }
        ne.field_d = new bk();
        re.field_g.b((al) (Object) ne.field_d, -113);
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ti var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        aj var6_ref_aj = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        la var27 = null;
        RuntimeException decompiledCaughtException = null;
        var26 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var27 = ne.field_a;
              var2 = var27.h(16383);
              if (var2 == 0) {
                var3 = var27.d((byte) -48);
                var4 = (ti) (Object) ea.field_s.b(2);
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var4.field_i == var3) {
                        break L3;
                      } else {
                        var4 = (ti) (Object) ea.field_s.a(10);
                        continue L2;
                      }
                    }
                  }
                  if (var4 == null) {
                    lj.a((byte) 115);
                    return;
                  } else {
                    L4: {
                      var5 = var27.h(16383);
                      if (0 != var5) {
                        var6 = var4.field_l;
                        var7 = var4.field_k;
                        cb.field_c[0].field_f = null;
                        cb.field_c[0].field_h = ue.field_a;
                        cb.field_c[0].field_i = false;
                        var8_int = 1;
                        L5: while (true) {
                          if (var5 <= var8_int) {
                            String[][] dupTemp$6 = new String[3][var6];
                            var4.field_m = dupTemp$6;
                            var8 = dupTemp$6;
                            var9 = new String[3][var6];
                            long[][] dupTemp$7 = new long[3][var6];
                            var4.field_q = dupTemp$7;
                            var10 = dupTemp$7;
                            int[][] dupTemp$8 = new int[3][var6 * var7];
                            var4.field_n = dupTemp$8;
                            var11 = dupTemp$8;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var27.h(16383);
                            if (0 >= var18) {
                              break L4;
                            } else {
                              var19 = 0;
                              L6: while (true) {
                                if (~var18 >= ~var19) {
                                  break L4;
                                } else {
                                  L7: {
                                    var20 = var27.h(16383);
                                    var21 = cb.field_c[var20].field_h;
                                    var22 = var27.f((byte) 38);
                                    var24 = var27.field_k;
                                    if (var6 > var19) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = cb.field_c[var20].field_f;
                                      var10[0][var12] = var22;
                                      var12++;
                                      var25 = 0;
                                      L8: while (true) {
                                        if (var7 <= var25) {
                                          break L7;
                                        } else {
                                          int incrementValue$9 = var15;
                                          var15++;
                                          var11[0][incrementValue$9] = var27.e((byte) 113);
                                          var25++;
                                          continue L8;
                                        }
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                  L9: {
                                    if (var21 == null) {
                                      break L9;
                                    } else {
                                      if (!rb.a(false, var21)) {
                                        break L9;
                                      } else {
                                        var8[1][var13] = ue.field_a;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var13++;
                                        var27.field_k = var24;
                                        var25 = 0;
                                        L10: while (true) {
                                          if (~var25 <= ~var7) {
                                            break L9;
                                          } else {
                                            int incrementValue$10 = var16;
                                            var16++;
                                            var11[1][incrementValue$10] = var27.e((byte) 113);
                                            var25++;
                                            continue L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L11: {
                                    if (~var14 <= ~var6) {
                                      break L11;
                                    } else {
                                      if (cb.field_c[var20].field_i) {
                                        break L11;
                                      } else {
                                        cb.field_c[var20].field_i = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = cb.field_c[var20].field_f;
                                        var10[2][var14] = var22;
                                        var14++;
                                        var27.field_k = var24;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var7 <= var25) {
                                            break L11;
                                          } else {
                                            int incrementValue$11 = var17;
                                            var17++;
                                            var11[2][incrementValue$11] = var27.e((byte) 113);
                                            var25++;
                                            continue L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            L13: {
                              cb.field_c[var8_int].field_h = var27.g(0);
                              cb.field_c[var8_int].field_i = false;
                              if (var27.h(16383) == 1) {
                                cb.field_c[var8_int].field_f = var27.g(0);
                                break L13;
                              } else {
                                cb.field_c[var8_int].field_f = null;
                                break L13;
                              }
                            }
                            var8_int++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var4.field_o = true;
                    var4.a(-47);
                    break L1;
                  }
                }
              } else {
                if (var2 != 1) {
                  hb.a((Throwable) null, 0, "HS1: " + jc.b(116));
                  lj.a((byte) 118);
                  break L1;
                } else {
                  var3 = var27.d((byte) -127);
                  var4_long = var27.f((byte) 108);
                  var6_ref_aj = (aj) (Object) ub.field_e.b(2);
                  L14: while (true) {
                    L15: {
                      if (var6_ref_aj == null) {
                        break L15;
                      } else {
                        if (~var6_ref_aj.field_q != ~var3) {
                          var6_ref_aj = (aj) (Object) ub.field_e.a(10);
                          continue L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (var6_ref_aj == null) {
                      lj.a((byte) 114);
                      return;
                    } else {
                      var6_ref_aj.field_j = var4_long;
                      var6_ref_aj.a(-62);
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "pl.F(" + -3570 + 41);
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, byte[] param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == 1240830180) {
              var5_int = 0;
              L1: while (true) {
                if (rf.field_a.length <= var5_int) {
                  break L0;
                } else {
                  param3 = rf.field_a[var5_int];
                  var6 = var5_int << 4;
                  L2: while (true) {
                    int incrementValue$12 = param3;
                    param3--;
                    if (incrementValue$12 == 0) {
                      var5_int++;
                      continue L1;
                    } else {
                      int incrementValue$13 = var6;
                      var6++;
                      param2 = gk.field_b[incrementValue$13];
                      param0[param4[param2]] = param0[param4[param2]] + 1;
                      gk.field_b[param0[param4[param2]]] = param2;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("pl.B(");
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
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
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
          throw sl.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    public static void c(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param0 > 37) {
                break L1;
              } else {
                var3 = null;
                pl.a((int[]) null, -51, 81, -104, (byte[]) null);
                break L1;
              }
            }
            stackOut_2_0 = pl.a((byte) -110, param1, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("pl.C(").append(param0).append(44);
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
          throw sl.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Updates will sent to the email address you've given";
        field_c = new int[8192];
        field_a = new int[4];
    }
}
