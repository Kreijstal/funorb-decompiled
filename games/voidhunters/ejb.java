/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ejb extends rqa {
    static int field_p;
    static String field_o;

    ejb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        qn var4 = null;
        ifa var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
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
        faa var27 = null;
        long[][] var34 = null;
        int[][] var35 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var26 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                ejb.e(-77);
                break L1;
              }
            }
            L2: {
              var27 = qga.field_b;
              var2 = var27.e((byte) -93);
              if (0 != var2) {
                if ((var2 ^ -1) != -2) {
                  gna.a((Throwable) null, "HS1: " + hm.e(-13514), 0);
                  ifb.l(-119);
                  break L2;
                } else {
                  var3 = var27.e(1869);
                  var4_ref = (ifa) ((Object) hga.field_p.d(param0 + -1));
                  L3: while (true) {
                    L4: {
                      if (var4_ref == null) {
                        break L4;
                      } else {
                        if (var3 == var4_ref.field_i) {
                          break L4;
                        } else {
                          var4_ref = (ifa) ((Object) hga.field_p.a((byte) 10));
                          continue L3;
                        }
                      }
                    }
                    if (var4_ref == null) {
                      ifb.l(-126);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var4_ref.b(-3846);
                      break L2;
                    }
                  }
                }
              } else {
                var3 = var27.e(param0 + 1868);
                var4 = (qn) ((Object) md.field_j.d(0));
                L5: while (true) {
                  L6: {
                    if (var4 == null) {
                      break L6;
                    } else {
                      if (var3 == var4.field_e) {
                        break L6;
                      } else {
                        var4 = (qn) ((Object) md.field_j.a((byte) 17));
                        continue L5;
                      }
                    }
                  }
                  if (var4 == null) {
                    ifb.l(-116);
                    decompiledRegionSelector0 = 0;
                    break L0;
                  } else {
                    L7: {
                      var5 = var27.e((byte) -97);
                      if (0 != var5) {
                        var6 = var4.field_i;
                        dda.field_d[0].field_b = null;
                        dda.field_d[0].field_a = kca.field_a;
                        var7 = var4.field_g;
                        dda.field_d[0].field_c = false;
                        var8_int = 1;
                        L8: while (true) {
                          if (var8_int >= var5) {
                            var8 = new String[3][var6];
                            var9 = new String[3][var6];
                            var34 = new long[3][var6];
                            var35 = new int[3][var7 * var6];
                            var12 = 0;
                            var13 = 0;
                            var14 = 0;
                            var15 = 0;
                            var16 = 0;
                            var17 = 0;
                            var18 = var27.e((byte) -97);
                            if (0 < var18) {
                              var19 = 0;
                              L9: while (true) {
                                if (var18 > var19) {
                                  L10: {
                                    var20 = var27.e((byte) -114);
                                    var21 = dda.field_d[var20].field_a;
                                    var22 = var27.k(255);
                                    var24 = var27.field_e;
                                    if (var19 >= var6) {
                                      break L10;
                                    } else {
                                      var8[0][var12] = var21;
                                      var9[0][var12] = dda.field_d[var20].field_b;
                                      var34[0][var12] = var22;
                                      var25 = 0;
                                      L11: while (true) {
                                        if (var7 <= var25) {
                                          var12++;
                                          break L10;
                                        } else {
                                          incrementValue$3 = var15;
                                          var15++;
                                          var35[0][incrementValue$3] = var27.h(mgb.a(param0, 75));
                                          var25++;
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                  L12: {
                                    if (var21 == null) {
                                      break L12;
                                    } else {
                                      if (qja.a((byte) -75, var21)) {
                                        var8[1][var13] = kca.field_a;
                                        var9[1][var13] = null;
                                        var34[1][var13] = var22;
                                        var13++;
                                        var27.field_e = var24;
                                        var25 = 0;
                                        L13: while (true) {
                                          if (var25 >= var7) {
                                            break L12;
                                          } else {
                                            incrementValue$4 = var16;
                                            var16++;
                                            var35[1][incrementValue$4] = var27.h(param0 + 20);
                                            var25++;
                                            continue L13;
                                          }
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  L14: {
                                    if (var14 >= var6) {
                                      break L14;
                                    } else {
                                      if (!dda.field_d[var20].field_c) {
                                        dda.field_d[var20].field_c = true;
                                        var8[2][var14] = var21;
                                        var9[2][var14] = dda.field_d[var20].field_b;
                                        var34[2][var14] = var22;
                                        var14++;
                                        var27.field_e = var24;
                                        var25 = 0;
                                        L15: while (true) {
                                          if (var25 >= var7) {
                                            break L14;
                                          } else {
                                            incrementValue$5 = var17;
                                            var17++;
                                            var35[2][incrementValue$5] = var27.h(21);
                                            var25++;
                                            continue L15;
                                          }
                                        }
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var19++;
                                  continue L9;
                                } else {
                                  var4.b(-3846);
                                  break L2;
                                }
                              }
                            } else {
                              break L7;
                            }
                          } else {
                            L16: {
                              dda.field_d[var8_int].field_a = var27.a(param0 + -2);
                              dda.field_d[var8_int].field_c = false;
                              if (var27.e((byte) -119) == 1) {
                                dda.field_d[var8_int].field_b = var27.a(param0 ^ -2);
                                break L16;
                              } else {
                                dda.field_d[var8_int].field_b = null;
                                break L16;
                              }
                            }
                            var8_int++;
                            continue L8;
                          }
                        }
                      } else {
                        break L7;
                      }
                    }
                    var4.b(-3846);
                    break L2;
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
          throw rta.a((Throwable) ((Object) var1), "ejb.C(" + param0 + ')');
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

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        nc stackOut_1_0 = null;
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
            if (param1 < -119) {
              stackOut_3_0 = new nc(frb.a(119, 122));
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (nc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("ejb.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void e(int param0) {
        field_o = null;
        if (param0 <= 92) {
            ejb.a(-87);
        }
    }

    static {
        field_o = "From <%0>: ";
        field_p = 0;
    }
}
