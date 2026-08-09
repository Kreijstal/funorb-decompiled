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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -43) {
              L1: {
                if (null == vo.a(param0, 0)) {
                  stackIn_6_0 = 0;
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("c.C(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    final void a(ed param0, int param1) {
        try {
            param0.a((byte) -126, this.field_g);
            if (param1 != 47) {
                ed var4 = (ed) null;
                this.a((ed) null, 82);
            }
            param0.b(param1 ^ 47, this.field_d);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "c.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, byte param1) {
        try {
            int var2_int = 0;
            int stackIn_12_0 = 0;
            int stackIn_14_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            IOException var2 = null;
            if (id.field_f.field_u < param0) {
              if (lo.field_k == null) {
                return false;
              } else {
                try {
                  L0: {
                    var2_int = lo.field_k.a(15166);
                    if ((var2_int ^ -1) < -1) {
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
                        stackIn_14_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        stackIn_12_0 = 0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    } else {
                      L2: {
                        if (-1 < (var2_int ^ -1)) {
                          rm.b((byte) 94);
                          break L2;
                        } else {
                          if (-30001L <= (qg.b(false) ^ -1L)) {
                            break L2;
                          } else {
                            rm.b((byte) 94);
                            break L2;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    rm.b((byte) 114);
                    decompiledRegionSelector0 = 2;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return stackIn_12_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    return stackIn_14_0 != 0;
                  } else {
                    L4: {
                      if (param1 == -104) {
                        break L4;
                      } else {
                        c.a(-128, -125);
                        break L4;
                      }
                    }
                    return false;
                  }
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
            return (tq) null;
        }
        return rf.field_n;
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = Vertigo2.field_L ? 1 : 0;
          var2 = 0;
          var3 = hm.field_F;
          if ((var3 ^ -1) <= -6) {
            if (var3 < 105) {
              var2 = (16384 * var3 - 40960) / 220;
              break L0;
            } else {
              if ((var3 ^ -1) > -121) {
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
          if ((param0 ^ -1) != -2) {
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
            if ((param0 ^ -1) == -8) {
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
          if ((param0 ^ -1) == -15) {
            var4 = -1;
            var5 = 1;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if ((param0 ^ -1) == -16) {
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
        if (param0 < 113) {
            c.a(-58, -80);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, er[] param4, int param5, cc param6, int param7, int param8, int param9, er[] param10, int param11, int param12, er[] param13, cc param14, int param15, int param16, int param17, int param18, int param19) {
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
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          L0: {
            if (param16 == 20412) {
              on.a(param6, param3, param9, param18, param1, param7, param12, new mp(param4), new mp(param13), param0, (byte) 24, param19, new mp(param10), param11, param17, param14, param8, param2, param15, param5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var20 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var20);

            stackIn_6_1 = new StringBuilder().append("c.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param11).append(',').append(param12).append(',');

            if (param13 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param14 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_19_2 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    c(long param0, String param1) {
        try {
            this.field_d = param1;
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "c.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(int param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        mi var15 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var13 = id.field_f;
            var15 = var13;
            var2 = var15.h(-11);
            if (param0 == 4) {
              var3 = (ri) ((Object) ob.field_M.a((byte) 100));
              L1: while (true) {
                L2: {
                  if (var3 == null) {
                    break L2;
                  } else {
                    if (var3.field_w == var2) {
                      break L2;
                    } else {
                      var3 = (ri) ((Object) ob.field_M.b(94));
                      continue L1;
                    }
                  }
                }
                if (var3 == null) {
                  rm.b((byte) -59);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var4 = var15.h(-11);
                    if (-1 == (var4 ^ -1)) {
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
                              dupTemp$0 = new String[2][var5];
                              var3.field_t = dupTemp$0;
                              var6 = dupTemp$0;
                              dupTemp$1 = new int[2][4 * var5];
                              var3.field_q = dupTemp$1;
                              var7 = dupTemp$1;
                              var8 = cq.field_i;
                              var9 = 0;
                              var10 = 0;
                              L6: while (true) {
                                if (var8 <= var9) {
                                  var9 = 0;
                                  var14 = 0;
                                  var10 = var14;
                                  L7: while (true) {
                                    if (var9 >= var8) {
                                      break L3;
                                    } else {
                                      var11 = ac.field_I[var5 + var9];
                                      var6[1][var14] = Vertigo2.field_I[var11];
                                      var7[1][4 * var14] = on.field_e[var11];
                                      var7[1][1 + var14 * 4] = li.field_g[var11];
                                      var7[1][var14 * 4 - -2] = ub.field_p[var11];
                                      var7[1][3 + 4 * var14] = jf.field_N[var11];
                                      if (wc.a(Vertigo2.field_I[var11], true)) {
                                        L8: {
                                          if (0 == jf.field_N[var11] + ub.field_p[var11] + li.field_g[var11]) {
                                            var6[1][var14] = null;
                                            var14--;
                                            break L8;
                                          } else {
                                            break L8;
                                          }
                                        }
                                        var14++;
                                        var9++;
                                        continue L7;
                                      } else {
                                        var14++;
                                        var9++;
                                        continue L7;
                                      }
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
                                vd.a(var15, 11591);
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
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "c.B(" + param0 + ')');
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

    static {
        field_i = "Show all lobby chat";
    }
}
