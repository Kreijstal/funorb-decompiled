/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static cg field_c;
    static qc field_a;
    static String field_b;
    static pb field_f;
    static int field_g;
    static int[] field_e;
    static boolean field_d;

    final static bm a(String param0, String param1, pf param2, pf param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        bm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = param3.b(param1, (byte) -118);
              var6 = param3.a(var5_int, param0, (byte) -11);
              if (param4 == 63) {
                break L1;
              } else {
                field_a = (qc) null;
                break L1;
              }
            }
            stackIn_3_0 = dd.a(var5_int, (byte) 115, param3, param2, var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("eh.B(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_16_2 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0) {
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
        hk var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        nf var6_ref_nf = null;
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
        ha var28 = null;
        var26 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var28 = ae.field_N;
              var2 = var28.f(4);
              if (param0 == (var2 ^ -1)) {
                var3 = var28.c((byte) 26);
                var4 = (hk) ((Object) id.field_g.b(-114));
                L2: while (true) {
                  L3: {
                    if (var4 == null) {
                      break L3;
                    } else {
                      if (var4.field_t == var3) {
                        break L3;
                      } else {
                        var4 = (hk) ((Object) id.field_g.b((byte) 80));
                        continue L2;
                      }
                    }
                  }
                  if (var4 == null) {
                    oj.c(-2290);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L4: {
                      var5 = var28.f(4);
                      if (-1 == (var5 ^ -1)) {
                        break L4;
                      } else {
                        var6 = var4.field_q;
                        hi.field_e[0].field_e = wf.field_b;
                        hi.field_e[0].field_d = null;
                        var7 = var4.field_r;
                        hi.field_e[0].field_a = false;
                        var8_int = 1;
                        L5: while (true) {
                          if (var5 <= var8_int) {
                            dupTemp$0 = new String[3][var6];
                            var4.field_u = dupTemp$0;
                            var8 = dupTemp$0;
                            var9 = new String[3][var6];
                            dupTemp$1 = new long[3][var6];
                            var4.field_w = dupTemp$1;
                            var10 = dupTemp$1;
                            dupTemp$2 = new int[3][var6 * var7];
                            var4.field_o = dupTemp$2;
                            var11 = dupTemp$2;
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var28.f(4);
                            if (0 >= var18) {
                              break L4;
                            } else {
                              var19 = 0;
                              L6: while (true) {
                                if (var18 <= var19) {
                                  break L4;
                                } else {
                                  L7: {
                                    var20 = var28.f(4);
                                    var21 = hi.field_e[var20].field_e;
                                    var22 = var28.d(param0 ^ -1);
                                    var24 = var28.field_k;
                                    if (var19 < var6) {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = hi.field_e[var20].field_d;
                                      var10[0][var12] = var22;
                                      var25 = 0;
                                      L8: while (true) {
                                        if (var7 <= var25) {
                                          var12++;
                                          break L7;
                                        } else {
                                          incrementValue$3 = var15;
                                          var15++;
                                          var11[0][incrementValue$3] = var28.b(false);
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
                                      if (!hk.a(param0 + 101, var21)) {
                                        break L9;
                                      } else {
                                        var8[1][var13] = wf.field_b;
                                        var9[1][var13] = null;
                                        var10[1][var13] = var22;
                                        var13++;
                                        var28.field_k = var24;
                                        var25 = 0;
                                        L10: while (true) {
                                          if (var25 >= var7) {
                                            break L9;
                                          } else {
                                            incrementValue$4 = var16;
                                            var16++;
                                            var11[1][incrementValue$4] = var28.b(false);
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
                                      if (hi.field_e[var20].field_a) {
                                        break L11;
                                      } else {
                                        hi.field_e[var20].field_a = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = hi.field_e[var20].field_d;
                                        var10[2][var14] = var22;
                                        var14++;
                                        var28.field_k = var24;
                                        var25 = 0;
                                        L12: while (true) {
                                          if (var25 >= var7) {
                                            break L11;
                                          } else {
                                            incrementValue$5 = var17;
                                            var17++;
                                            var11[2][incrementValue$5] = var28.b(false);
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
                              hi.field_e[var8_int].field_e = var28.e((byte) 115);
                              hi.field_e[var8_int].field_a = false;
                              if (1 != var28.f(4)) {
                                hi.field_e[var8_int].field_d = null;
                                break L13;
                              } else {
                                hi.field_e[var8_int].field_d = var28.e((byte) 117);
                                break L13;
                              }
                            }
                            var8_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                    var4.field_s = true;
                    var4.c(20);
                    break L1;
                  }
                }
              } else {
                if ((var2 ^ -1) != -2) {
                  qe.a(-121, "HS1: " + bh.b((byte) -106), (Throwable) null);
                  oj.c(param0 ^ 2289);
                  break L1;
                } else {
                  var3 = var28.c((byte) 83);
                  var4_long = var28.d(0);
                  var6_ref_nf = (nf) ((Object) wb.field_f.b(-89));
                  L14: while (true) {
                    L15: {
                      if (var6_ref_nf == null) {
                        break L15;
                      } else {
                        if (var6_ref_nf.field_u != var3) {
                          var6_ref_nf = (nf) ((Object) wb.field_f.b((byte) -22));
                          continue L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    if (var6_ref_nf == null) {
                      oj.c(-2290);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var6_ref_nf.field_k = var4_long;
                      var6_ref_nf.c(20);
                      break L1;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "eh.D(" + param0 + ')');
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

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (!((param0 ^ -1) != -1)) {
            return 0;
        }
        if (!(-1 <= (param0 ^ -1))) {
            var2 = 1;
            if (!((param0 ^ -1) >= -65536)) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (-256 > (param0 ^ -1)) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (param0 > 15) {
                param0 = param0 >> 4;
                var2 += 4;
            }
            if (3 < param0) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if ((param0 ^ -1) < -2) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        if (param1 > -33) {
            eh.a((byte) -13);
        }
        var2 = 2;
        if (param0 < -65536) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (255 < (param0 ^ -1)) {
            var2 += 8;
            param0 = param0 >> 8;
        }
        if (!(param0 >= -16)) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (3 < (param0 ^ -1)) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (!(1 >= (param0 ^ -1))) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        field_f = null;
        field_a = null;
        if (param0 != 5) {
            return;
        }
        field_b = null;
    }

    static {
        field_c = new cg();
        field_b = "Sound          ";
    }
}
