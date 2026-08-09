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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (ka.a(param1, param2, -2)) {
              var3_int = 0;
              L1: while (true) {
                if (var3_int >= param1.length()) {
                  if (param0 == -110) {
                    stackIn_13_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    field_c = (int[]) null;
                    return true;
                  }
                } else {
                  if (ue.a(-16490, param1.charAt(var3_int))) {
                    var3_int++;
                    continue L1;
                  } else {
                    stackIn_8_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("pl.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_13_0 != 0;
          }
        }
    }

    final static void a(int param0) {
        if (!(null == kb.field_a)) {
            kb.field_a.t(20252);
        }
        ne.field_d = new bk();
        if (param0 != 0) {
            field_d = (String) null;
        }
        re.field_g.b(ne.field_d, -113);
    }

    final static void b(int param0) {
        String[][] dupTemp$0 = null;
        long[][] dupTemp$1 = null;
        int[][] dupTemp$2 = null;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ti var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        aj var6_ref_aj = null;
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
        var26 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var27 = ne.field_a;
              var2 = var27.h(16383);
              if (-1 == (var2 ^ -1)) {
                var3 = var27.d((byte) -48);
                var4 = (ti) ((Object) ea.field_s.b(2));
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var4.field_i == var3) {
                        break L3;
                      } else {
                        var4 = (ti) ((Object) ea.field_s.a(10));
                        continue L2;
                      }
                    }
                  }
                  if (var4 == null) {
                    lj.a((byte) 115);
                    decompiledRegionSelector0 = 1;
                    break L0;
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
                            dupTemp$0 = new String[3][var6];
                            var4.field_m = dupTemp$0;
                            var8 = dupTemp$0;
                            var9 = new String[3][var6];
                            dupTemp$1 = new long[3][var6];
                            var4.field_q = dupTemp$1;
                            var10 = dupTemp$1;
                            dupTemp$2 = new int[3][var6 * var7];
                            var4.field_n = dupTemp$2;
                            var11 = dupTemp$2;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var27.h(param0 ^ -12815);
                            if (0 >= var18) {
                              break L4;
                            } else {
                              var19 = 0;
                              L6: while (true) {
                                if (var18 <= var19) {
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
                                          incrementValue$3 = var15;
                                          var15++;
                                          var11[0][incrementValue$3] = var27.e((byte) 113);
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
                                          if (var25 >= var7) {
                                            break L9;
                                          } else {
                                            incrementValue$4 = var16;
                                            var16++;
                                            var11[1][incrementValue$4] = var27.e((byte) 113);
                                            var25++;
                                            continue L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var14 >= var6) {
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
                                            incrementValue$5 = var17;
                                            var17++;
                                            var11[2][incrementValue$5] = var27.e((byte) 113);
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
                              if (var27.h(param0 + 19953) == 1) {
                                cb.field_c[var8_int].field_f = var27.g(param0 ^ -3570);
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
                if (-2 != (var2 ^ -1)) {
                  hb.a((Throwable) null, param0 + 3570, "HS1: " + jc.b(116));
                  lj.a((byte) 118);
                  break L1;
                } else {
                  var3 = var27.d((byte) -127);
                  var4_long = var27.f((byte) 108);
                  var6_ref_aj = (aj) ((Object) ub.field_e.b(2));
                  L14: while (true) {
                    L15: {
                      if (var6_ref_aj == null) {
                        break L15;
                      } else {
                        if ((var6_ref_aj.field_q ^ -1) != (var3 ^ -1)) {
                          var6_ref_aj = (aj) ((Object) ub.field_e.a(param0 ^ -3580));
                          continue L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (var6_ref_aj == null) {
                      lj.a((byte) 114);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var6_ref_aj.field_j = var4_long;
                      var6_ref_aj.a(-62);
                      break L1;
                    }
                  }
                }
              }
            }
            L16: {
              if (param0 == -3570) {
                break L16;
              } else {
                field_a = (int[]) null;
                break L16;
              }
            }
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "pl.F(" + param0 + ')');
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

    final static void a(int[] param0, int param1, int param2, int param3, byte[] param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 == 1240830180) {
              var5_int = 0;
              L1: while (true) {
                if (rf.field_a.length <= var5_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  param3 = rf.field_a[var5_int];
                  var6 = var5_int << 1240830180;
                  L2: while (true) {
                    incrementValue$5 = param3;
                    param3--;
                    if (-1 == (incrementValue$5 ^ -1)) {
                      var5_int++;
                      continue L1;
                    } else {
                      incrementValue$6 = var6;
                      var6++;
                      param2 = gk.field_b[incrementValue$6];
                      dupTemp$7 = param4[param2];
                      dupTemp$8 = param0[dupTemp$7];
                      param0[dupTemp$7] = dupTemp$8 + 1;
                      gk.field_b[dupTemp$8] = param2;
                      continue L2;
                    }
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
          L3: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("pl.B(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != -30877) {
            field_b = (il) null;
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        byte[] var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 37) {
                break L1;
              } else {
                var3 = (byte[]) null;
                pl.a((int[]) null, -51, 81, -104, (byte[]) null);
                break L1;
              }
            }
            stackIn_3_0 = pl.a((byte) -110, param1, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("pl.C(").append(param0).append(',');

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
          throw sl.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_d = "Updates will sent to the email address you've given";
        field_c = new int[8192];
        field_a = new int[4];
    }
}
