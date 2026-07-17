/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class c extends v {
    private long field_g;
    static String field_i;
    static String field_f;
    private String field_d;
    static int field_h;
    static int field_e;

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 <= -43) {
              L1: {
                if (null == vo.a(param0, 0)) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("c.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final void a(ed param0, int param1) {
        try {
            param0.a((byte) -126, ((c) this).field_g);
            if (param1 != 47) {
                Object var4 = null;
                ((c) this).a((ed) null, 82);
            }
            param0.b(param1 ^ 47, ((c) this).field_d);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "c.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static boolean a(int param0, byte param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_12_0 = 0;
            int stackIn_14_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_11_0 = 0;
            if (id.field_f.field_u < param0) {
              if (lo.field_k == null) {
                return false;
              } else {
                try {
                  L0: {
                    var2_int = lo.field_k.a(15166);
                    if (var2_int > 0) {
                      L1: {
                        if (param0 + -id.field_f.field_u < var2_int) {
                          var2_int = -id.field_f.field_u + param0;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      lo.field_k.a(id.field_f.field_p, false, var2_int, id.field_f.field_u);
                      gn.field_b = gk.a(89);
                      id.field_f.field_u = id.field_f.field_u + var2_int;
                      if (param0 <= id.field_f.field_u) {
                        id.field_f.field_u = 0;
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      }
                    } else {
                      L2: {
                        if (var2_int < 0) {
                          rm.b((byte) 94);
                          break L2;
                        } else {
                          if (qg.b(false) <= 30000L) {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            rm.b((byte) 94);
                            break L2;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    rm.b((byte) 114);
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return false;
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    tq a(byte param0) {
        if (param0 != -83) {
            return null;
        }
        return rf.field_n;
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Vertigo2.field_L ? 1 : 0;
          var2 = 0;
          var3 = hm.field_F;
          if (var3 >= 5) {
            if (var3 < 105) {
              var2 = (16384 * var3 - 40960) / 220;
              break L0;
            } else {
              if (var3 < 120) {
                var3 = 120 - var3;
                var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            var2 = var3 * var3 * 8192 / 1100;
            break L0;
          }
        }
        L1: {
          if (param1 == -3797) {
            break L1;
          } else {
            c.a(-62, -13);
            break L1;
          }
        }
        L2: {
          var4 = 1;
          var5 = 0;
          if (param0 != 1) {
            break L2;
          } else {
            var5 = 1;
            break L2;
          }
        }
        L3: {
          if (param0 != 3) {
            break L3;
          } else {
            var4 = -1;
            break L3;
          }
        }
        L4: {
          if (param0 == 4) {
            var5 = 1;
            var4 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param0 != 5) {
            break L5;
          } else {
            var5 = 1;
            var4 = -1;
            break L5;
          }
        }
        L6: {
          if (param0 != 6) {
            break L6;
          } else {
            var4 = 1;
            var5 = -1;
            break L6;
          }
        }
        L7: {
          L8: {
            if (param0 == 7) {
              break L8;
            } else {
              if (param0 == 8) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L7;
        }
        L9: {
          if (param0 != 11) {
            break L9;
          } else {
            var4 = -1;
            break L9;
          }
        }
        L10: {
          if (param0 != 12) {
            break L10;
          } else {
            var5 = -1;
            var4 = -1;
            break L10;
          }
        }
        L11: {
          if (param0 == 13) {
            var5 = -1;
            var4 = 1;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (param0 == 14) {
            var4 = -1;
            var5 = 1;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if (param0 == 15) {
            var4 = 1;
            var5 = 1;
            break L13;
          } else {
            break L13;
          }
        }
        ba.field_g = hh.a(var5 * var2, var4 * var2, false);
    }

    public static void b(int param0) {
        field_i = null;
        field_f = null;
    }

    final static void a(int param0, int param1, int param2, int param3, er[] param4, int param5, cc param6, int param7, int param8, int param9, er[] param10, int param11, int param12, er[] param13, cc param14, int param15, int param16, int param17, int param18, int param19) {
        RuntimeException var20 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param16 == 20412) {
              on.a(param6, param3, param9, param18, param1, param7, param12, new mp(param4), new mp(param13), param0, (byte) 24, param19, new mp(param10), param11, param17, param14, param8, param2, param15, param5);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var20 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var20;
            stackOut_4_1 = new StringBuilder().append("c.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param5).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param7).append(44).append(param8).append(44).append(param9).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param10 == null) {
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
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param11).append(44).append(param12).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param13 == null) {
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
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param14 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param15 + 44 + param16 + 44 + param17 + 44 + param18 + 44 + param19 + 41);
        }
    }

    c(long param0, String param1) {
        try {
            ((c) this).field_d = param1;
            ((c) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "c.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        ri var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        mi var13 = null;
        int var14 = 0;
        int var15 = 0;
        mi var16 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var13 = id.field_f;
            var16 = var13;
            var2 = var16.h(-11);
            var3 = (ri) (Object) ob.field_M.a((byte) 100);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_w == var2) {
                    break L2;
                  } else {
                    var3 = (ri) (Object) ob.field_M.b(94);
                    continue L1;
                  }
                }
              }
              if (var3 == null) {
                rm.b((byte) -59);
                return;
              } else {
                L3: {
                  var4 = var16.h(-11);
                  if (var4 == 0) {
                    break L3;
                  } else {
                    var5 = var3.field_n;
                    Vertigo2.field_I[0] = qe.field_V;
                    var6_int = 1;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        vl.a(var5, var4, -26418);
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= var4) {
                            qb.a(var5, 2);
                            String[][] dupTemp$2 = new String[2][var5];
                            var3.field_t = dupTemp$2;
                            var6 = dupTemp$2;
                            int[][] dupTemp$3 = new int[2][4 * var5];
                            var3.field_q = dupTemp$3;
                            var7 = dupTemp$3;
                            var8 = cq.field_i;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var14 = 0;
                                var9 = var14;
                                var15 = 0;
                                var10 = var15;
                                L7: while (true) {
                                  if (var14 >= var8) {
                                    break L3;
                                  } else {
                                    L8: {
                                      var11 = ac.field_I[var5 + var14];
                                      var6[1][var15] = Vertigo2.field_I[var11];
                                      var7[1][4 * var15] = on.field_e[var11];
                                      var7[1][1 + var15 * 4] = li.field_g[var11];
                                      var7[1][var15 * 4 - -2] = ub.field_p[var11];
                                      var7[1][3 + 4 * var15] = jf.field_N[var11];
                                      if (!wc.a(Vertigo2.field_I[var11], true)) {
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var15++;
                                    var14++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = ac.field_I[var9];
                                  var6[0][var10] = Vertigo2.field_I[var11];
                                  var7[0][var10 * 4] = on.field_e[var11];
                                  var7[0][4 * var10 - -1] = li.field_g[var11];
                                  var7[0][2 + 4 * var10] = ub.field_p[var11];
                                  var7[0][4 * var10 - -3] = jf.field_N[var11];
                                  if (wc.a(Vertigo2.field_I[var11], true)) {
                                    if (ub.field_p[var11] + li.field_g[var11] + jf.field_N[var11] == 0) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var10++;
                                var9++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              vd.a((ed) (Object) var16, 11591);
                              if (0 == var6_int) {
                                var3.field_s = br.field_U;
                                var3.field_y = kp.field_P;
                                var3.field_u = af.field_E;
                                var3.field_p = bp.field_z;
                                wo.a(kp.field_P, af.field_E, true, var6_int, br.field_U, bp.field_z);
                                break L10;
                              } else {
                                wo.a(kp.field_P, af.field_E, true, var6_int, br.field_U, bp.field_z);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        Vertigo2.field_I[var6_int] = var13.f(128);
                        var6_int++;
                        continue L4;
                      }
                    }
                  }
                }
                var3.field_v = true;
                var3.c(2);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "c.B(" + 4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Show all lobby chat";
    }
}
