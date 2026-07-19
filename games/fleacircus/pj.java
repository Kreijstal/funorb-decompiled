/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pj extends cb {
    static String field_y;
    static String field_z;
    private Object field_A;
    static int[] field_x;

    final boolean c(byte param0) {
        if (param0 >= -11) {
            return true;
        }
        return false;
    }

    final static void e(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        hg var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ih var13 = null;
        ih var14 = null;
        int[][] var18 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        boolean stackIn_33_0 = false;
        int stackIn_40_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_39_0 = 0;
        boolean stackOut_32_0 = false;
        var12 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var13 = ae.field_a;
            var14 = var13;
            var2 = var14.e(false);
            if (param0 > 62) {
              var3 = (hg) ((Object) ak.field_d.c((byte) 47));
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 == null) {
                      break L3;
                    } else {
                      stackOut_5_0 = var3.field_m ^ -1;
                      stackIn_12_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var12 != 0) {
                        break L2;
                      } else {
                        if (stackIn_6_0 == (var2 ^ -1)) {
                          break L3;
                        } else {
                          var3 = (hg) ((Object) ak.field_d.b((byte) -105));
                          if (var12 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  if (var3 != null) {
                    stackOut_11_0 = var14.e(false);
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    k.c(-28354);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
                L4: {
                  var4 = stackIn_12_0;
                  if (var4 != 0) {
                    hm.field_c[0] = b.field_e;
                    var5 = var3.field_j;
                    var6_int = 1;
                    L5: while (true) {
                      L6: {
                        if (var4 <= var6_int) {
                          kh.a(var5, var4, 26721);
                          break L6;
                        } else {
                          hm.field_c[var6_int] = var13.h(0);
                          var6_int++;
                          if (var12 != 0) {
                            break L6;
                          } else {
                            continue L5;
                          }
                        }
                      }
                      var6_int = 0;
                      L7: while (true) {
                        L8: {
                          if (var6_int >= var4) {
                            cm.a(var5, (byte) 118);
                            stackOut_29_0 = 2;
                            stackOut_29_1 = var5;
                            stackIn_30_0 = stackOut_29_0;
                            stackIn_30_1 = stackOut_29_1;
                            break L8;
                          } else {
                            td.a((byte) -107, var14);
                            stackOut_22_0 = -1;
                            stackOut_22_1 = var6_int ^ -1;
                            stackIn_30_0 = stackOut_22_0;
                            stackIn_30_1 = stackOut_22_1;
                            stackIn_23_0 = stackOut_22_0;
                            stackIn_23_1 = stackOut_22_1;
                            if (var12 != 0) {
                              break L8;
                            } else {
                              L9: {
                                if (stackIn_23_0 == stackIn_23_1) {
                                  lg.a(rf.field_l, var6_int, w.field_a, wd.field_c, -103, dk.field_B);
                                  break L9;
                                } else {
                                  lg.a(rf.field_l, var6_int, w.field_a, wd.field_c, -113, dk.field_B);
                                  if (var12 == 0) {
                                    break L9;
                                  } else {
                                    lg.a(rf.field_l, var6_int, w.field_a, wd.field_c, -103, dk.field_B);
                                    break L9;
                                  }
                                }
                              }
                              var6_int++;
                              continue L7;
                            }
                          }
                        }
                        var6 = new String[stackIn_30_0][stackIn_30_1];
                        var18 = new int[2][4 * var5];
                        var8 = qh.field_D;
                        var9 = 0;
                        var10 = 0;
                        L10: while (true) {
                          L11: {
                            if (var8 <= var9) {
                              var9 = 0;
                              stackOut_39_0 = 0;
                              stackIn_40_0 = stackOut_39_0;
                              break L11;
                            } else {
                              var11 = mh.field_y[var9];
                              var6[0][var10] = hm.field_c[var11];
                              var18[0][var10 * 4] = jl.field_b[var11];
                              var18[0][1 + var10 * 4] = kk.field_b[var11];
                              var18[0][4 * var10 + 2] = hg.field_q[var11];
                              var18[0][4 * var10 + 3] = vh.field_i[var11];
                              stackOut_32_0 = ng.a(hm.field_c[var11], (byte) 7);
                              stackIn_40_0 = stackOut_32_0 ? 1 : 0;
                              stackIn_33_0 = stackOut_32_0;
                              if (var12 != 0) {
                                break L11;
                              } else {
                                L12: {
                                  if (stackIn_33_0) {
                                    if (kk.field_b[var11] - -hg.field_q[var11] + vh.field_i[var11] == 0) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  } else {
                                    break L12;
                                  }
                                }
                                var9++;
                                var10++;
                                continue L10;
                              }
                            }
                          }
                          var10 = stackIn_40_0;
                          L13: while (true) {
                            if (var9 < var8) {
                              var11 = mh.field_y[var5 + var9];
                              var6[1][var10] = hm.field_c[var11];
                              var18[1][var10 * 4] = jl.field_b[var11];
                              var18[1][var10 * 4 + 1] = kk.field_b[var11];
                              var18[1][4 * var10 - -2] = hg.field_q[var11];
                              var18[1][3 + 4 * var10] = vh.field_i[var11];
                              if (var12 != 0) {
                                break L4;
                              } else {
                                L14: {
                                  if (!ng.a(hm.field_c[var11], (byte) 7)) {
                                    break L14;
                                  } else {
                                    if (0 != vh.field_i[var11] + (hg.field_q[var11] + kk.field_b[var11])) {
                                      break L14;
                                    } else {
                                      var6[1][var10] = null;
                                      var10--;
                                      break L14;
                                    }
                                  }
                                }
                                var9++;
                                var10++;
                                continue L13;
                              }
                            } else {
                              var3.c(-1);
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var3.c(-1);
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "pj.B(" + param0 + ')');
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

    pj(Object param0, int param1) {
        super(param1);
        try {
            this.field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "pj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void h(int param0) {
        field_y = null;
        field_z = null;
        field_x = null;
        int var1 = 88 / ((-41 - param0) / 58);
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              gb.b(param3, param2, 1 + param1, 10000536);
              gb.b(param3, param4 + param2, 1 + param1, 12105912);
              var5_int = 1;
              var6 = param4;
              if (param2 + var5_int < gb.field_b) {
                var5_int = -param2 + gb.field_b;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (gb.field_i >= var6 + param2) {
                break L2;
              } else {
                var6 = gb.field_i - param2;
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              L4: {
                if (var6 <= var7) {
                  if (param0 == 127) {
                    break L4;
                  } else {
                    pj.h(100);
                    return;
                  }
                } else {
                  var8 = 152 + 48 * var7 / param4;
                  var9 = var8 | (var8 << -1103879120 | var8 << 391889960);
                  gb.field_a[param3 + (param2 + var7) * gb.field_d] = var9;
                  gb.field_a[param1 + ((param2 + var7) * gb.field_d + param3)] = var9;
                  var7++;
                  if (var10 != 0) {
                    break L4;
                  } else {
                    continue L3;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var5), "pj.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void d(byte param0) {
        try {
            IOException iOException = null;
            IOException var2_ref = null;
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (param0 == 60) {
                    break L1;
                  } else {
                    field_y = (String) null;
                    break L1;
                  }
                }
                L2: {
                  if (td.field_k == null) {
                    break L2;
                  } else {
                    td.field_k.d(param0 + -14895);
                    break L2;
                  }
                }
                L3: {
                  if (null == vg.field_r) {
                    break L3;
                  } else {
                    vg.field_r.a(true);
                    break L3;
                  }
                }
                L4: {
                  if (rd.field_c == null) {
                    break L4;
                  } else {
                    try {
                      L5: {
                        rd.field_c.b((byte) -70);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L6;
                      }
                    }
                    break L4;
                  }
                }
                if (null != mc.field_c) {
                  var1_int = 0;
                  L7: while (true) {
                    if (var1_int >= mc.field_c.length) {
                      break L0;
                    } else {
                      if (var3 == 0) {
                        L8: {
                          if (mc.field_c[var1_int] != null) {
                            try {
                              L9: {
                                mc.field_c[var1_int].b((byte) -70);
                                break L9;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L10: {
                                var2_ref = (IOException) (Object) decompiledCaughtException;
                                break L10;
                              }
                            }
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw pf.a((Throwable) ((Object) var1), "pj.E(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final Object g(int param0) {
        if (param0 != 5) {
            return (Object) null;
        }
        return this.field_A;
    }

    static {
        field_y = "Discard";
        field_z = "Sound: ";
    }
}
