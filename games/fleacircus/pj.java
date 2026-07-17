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
        int var14 = 0;
        int var15 = 0;
        ih var16 = null;
        int[][] var20 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var13 = ae.field_a;
            var16 = var13;
            var2 = var16.e(false);
            var3 = (hg) (Object) ak.field_d.c((byte) 47);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_m == var2) {
                    break L2;
                  } else {
                    var3 = (hg) (Object) ak.field_d.b((byte) -105);
                    continue L1;
                  }
                }
              }
              if (var3 != null) {
                L3: {
                  var4 = var16.e(false);
                  if (var4 != 0) {
                    hm.field_c[0] = b.field_e;
                    var5 = var3.field_j;
                    var6_int = 1;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        kh.a(var5, var4, 26721);
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= var4) {
                            cm.a(var5, (byte) 118);
                            var6 = new String[2][var5];
                            var20 = new int[2][4 * var5];
                            var8 = qh.field_D;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var8 <= var9) {
                                var14 = 0;
                                var9 = var14;
                                var15 = 0;
                                var10 = var15;
                                L7: while (true) {
                                  if (var14 < var8) {
                                    L8: {
                                      var11 = mh.field_y[var5 + var14];
                                      var6[1][var15] = hm.field_c[var11];
                                      var20[1][var15 * 4] = jl.field_b[var11];
                                      var20[1][var15 * 4 + 1] = kk.field_b[var11];
                                      var20[1][4 * var15 - -2] = hg.field_q[var11];
                                      var20[1][3 + 4 * var15] = vh.field_i[var11];
                                      if (!ng.a(hm.field_c[var11], (byte) 7)) {
                                        break L8;
                                      } else {
                                        if (0 != vh.field_i[var11] + (hg.field_q[var11] + kk.field_b[var11])) {
                                          break L8;
                                        } else {
                                          var6[1][var15] = null;
                                          var15--;
                                          break L8;
                                        }
                                      }
                                    }
                                    var14++;
                                    var15++;
                                    continue L7;
                                  } else {
                                    var3.c(-1);
                                    break L3;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = mh.field_y[var9];
                                  var6[0][var10] = hm.field_c[var11];
                                  var20[0][var10 * 4] = jl.field_b[var11];
                                  var20[0][1 + var10 * 4] = kk.field_b[var11];
                                  var20[0][4 * var10 + 2] = hg.field_q[var11];
                                  var20[0][4 * var10 + 3] = vh.field_i[var11];
                                  if (ng.a(hm.field_c[var11], (byte) 7)) {
                                    if (kk.field_b[var11] - -hg.field_q[var11] + vh.field_i[var11] == 0) {
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
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              td.a((byte) -107, (ni) (Object) var16);
                              if (var6_int == 0) {
                                lg.a(rf.field_l, var6_int, w.field_a, wd.field_c, -103, dk.field_B);
                                break L10;
                              } else {
                                lg.a(rf.field_l, var6_int, w.field_a, wd.field_c, -113, dk.field_B);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        hm.field_c[var6_int] = var13.h(0);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var3.c(-1);
                    break L3;
                  }
                }
                break L0;
              } else {
                k.c(-28354);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var1, "pj.B(" + 117 + 41);
        }
    }

    pj(Object param0, int param1) {
        super(param1);
        try {
            ((pj) this).field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "pj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void h(int param0) {
        field_y = null;
        field_z = null;
        field_x = null;
        int var1 = 88 / ((-41 - param0) / 58);
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
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
              if (var6 <= var7) {
                L4: {
                  if (param0 == 127) {
                    break L4;
                  } else {
                    pj.h(100);
                    break L4;
                  }
                }
                break L0;
              } else {
                var8 = 152 + 48 * var7 / param4;
                var9 = var8 | (var8 << 16 | var8 << 8);
                gb.field_a[param3 + (param2 + var7) * gb.field_d] = var9;
                gb.field_a[param1 + ((param2 + var7) * gb.field_d + param3)] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var5, "pj.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void d(byte param0) {
        try {
            int var1_int = 0;
            RuntimeException var1 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (td.field_k == null) {
                    break L1;
                  } else {
                    td.field_k.d(-14835);
                    break L1;
                  }
                }
                L2: {
                  if (null == vg.field_r) {
                    break L2;
                  } else {
                    vg.field_r.a(true);
                    break L2;
                  }
                }
                L3: {
                  if (rd.field_c == null) {
                    break L3;
                  } else {
                    {
                      L4: {
                        rd.field_c.b((byte) -70);
                        break L4;
                      }
                    }
                    break L3;
                  }
                }
                L6: {
                  if (null != mc.field_c) {
                    var1_int = 0;
                    L7: while (true) {
                      if (var1_int >= mc.field_c.length) {
                        break L6;
                      } else {
                        L8: {
                          if (mc.field_c[var1_int] != null) {
                            {
                              L9: {
                                mc.field_c[var1_int].b((byte) -70);
                                break L9;
                              }
                            }
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var1_int++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw pf.a((Throwable) (Object) var1, "pj.E(" + 60 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final Object g(int param0) {
        if (param0 != 5) {
            return null;
        }
        return ((pj) this).field_A;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Discard";
        field_z = "Sound: ";
    }
}
