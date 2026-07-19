/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ja {
    static String[] field_e;
    int field_d;
    int field_f;
    static fk field_a;
    int field_c;
    int field_g;
    static String field_b;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 113) {
            field_b = (String) null;
        }
        field_e = null;
    }

    final static void a(byte param0) {
        String[][] dupTemp$6 = null;
        long[][] dupTemp$7 = null;
        int[][] dupTemp$8 = null;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ij var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        ik var6_ref_ik = null;
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
        c var28 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var26 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var28 = om.field_g;
              var2 = var28.e(0);
              if (var2 == 0) {
                var3 = var28.f(1952);
                var4 = (ij) ((Object) qd.field_n.a(false));
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var4.field_n != var3) {
                        var4 = (ij) ((Object) qd.field_n.b((byte) 70));
                        continue L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var4 == null) {
                    nm.a(16);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L4: {
                      var5 = var28.e(0);
                      if (var5 != 0) {
                        var6 = var4.field_h;
                        var7 = var4.field_j;
                        bg.field_a[0].field_h = ck.field_r;
                        bg.field_a[0].field_e = false;
                        bg.field_a[0].field_a = null;
                        var8_int = 1;
                        L5: while (true) {
                          if (var5 <= var8_int) {
                            dupTemp$6 = new String[3][var6];
                            var4.field_m = dupTemp$6;
                            var8 = dupTemp$6;
                            var9 = new String[3][var6];
                            dupTemp$7 = new long[3][var6];
                            var4.field_k = dupTemp$7;
                            var10 = dupTemp$7;
                            dupTemp$8 = new int[3][var7 * var6];
                            var4.field_o = dupTemp$8;
                            var11 = dupTemp$8;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var28.e(0);
                            if ((var18 ^ -1) >= -1) {
                              break L4;
                            } else {
                              var19 = 0;
                              L6: while (true) {
                                if (var18 <= var19) {
                                  break L4;
                                } else {
                                  L7: {
                                    var20 = var28.e(0);
                                    var21 = bg.field_a[var20].field_h;
                                    var22 = var28.i(-800509813);
                                    var24 = var28.field_m;
                                    if (var6 <= var19) {
                                      break L7;
                                    } else {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = bg.field_a[var20].field_a;
                                      var10[0][var12] = var22;
                                      var25 = 0;
                                      L8: while (true) {
                                        if (var7 <= var25) {
                                          var12++;
                                          break L7;
                                        } else {
                                          incrementValue$9 = var15;
                                          var15++;
                                          var11[0][incrementValue$9] = var28.g(-5053);
                                          var25++;
                                          continue L8;
                                        }
                                      }
                                    }
                                  }
                                  L9: {
                                    if (var21 == null) {
                                      break L9;
                                    } else {
                                      if (!ic.a(var21, (byte) 112)) {
                                        break L9;
                                      } else {
                                        var8[1][var13] = ck.field_r;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var28.field_m = var24;
                                        var13++;
                                        var25 = 0;
                                        L10: while (true) {
                                          if (var25 >= var7) {
                                            break L9;
                                          } else {
                                            incrementValue$10 = var16;
                                            var16++;
                                            var11[1][incrementValue$10] = var28.g(-5053);
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
                                      if (!bg.field_a[var20].field_e) {
                                        bg.field_a[var20].field_e = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = bg.field_a[var20].field_a;
                                        var10[2][var14] = var22;
                                        var28.field_m = var24;
                                        var14++;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var25 >= var7) {
                                            break L11;
                                          } else {
                                            incrementValue$11 = var17;
                                            var17++;
                                            var11[2][incrementValue$11] = var28.g(-5053);
                                            var25++;
                                            continue L12;
                                          }
                                        }
                                      } else {
                                        break L11;
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
                              bg.field_a[var8_int].field_h = var28.c(false);
                              bg.field_a[var8_int].field_e = false;
                              if (var28.e(0) != 1) {
                                bg.field_a[var8_int].field_a = null;
                                break L13;
                              } else {
                                bg.field_a[var8_int].field_a = var28.c(false);
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
                    var4.field_l = true;
                    var4.c((byte) -90);
                    break L1;
                  }
                }
              } else {
                if (-2 != (var2 ^ -1)) {
                  pf.a(false, "HS1: " + hf.b((byte) 115), (Throwable) null);
                  nm.a(16);
                  break L1;
                } else {
                  var3 = var28.f(1952);
                  var4_long = var28.i(-800509813);
                  var6_ref_ik = (ik) ((Object) vj.field_d.a(false));
                  L14: while (true) {
                    L15: {
                      if (var6_ref_ik == null) {
                        break L15;
                      } else {
                        if (var6_ref_ik.field_i != var3) {
                          var6_ref_ik = (ik) ((Object) vj.field_d.b((byte) 70));
                          continue L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (var6_ref_ik != null) {
                      var6_ref_ik.field_l = var4_long;
                      var6_ref_ik.c((byte) -85);
                      break L1;
                    } else {
                      nm.a(16);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
            var3 = -111 / ((-41 - param0) / 43);
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ja.C(" + param0 + ')');
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

    final static d a(String param0, boolean param1) {
        RuntimeException var2 = null;
        d stackIn_6_0 = null;
        d stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        d stackOut_7_0 = null;
        d stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!di.field_g.b(0)) {
                break L1;
              } else {
                if (!param0.equals(di.field_g.a(-100))) {
                  di.field_g = vn.a((byte) 83, param0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param1) {
              stackOut_7_0 = di.field_g;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_5_0 = (d) null;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("ja.A(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    static {
        field_e = new String[]{"original", "classic", "retribution", "simulator"};
        field_b = "Previous";
        field_a = new fk(2);
    }
}
