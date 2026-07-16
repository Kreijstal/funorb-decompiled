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
        var12 = fleas.field_A ? 1 : 0;
        var13 = ae.field_a;
        var16 = var13;
        var2 = var16.e(false);
        if (param0 > 62) {
          var3 = (hg) (Object) ak.field_d.c((byte) 47);
          L0: while (true) {
            L1: {
              if (var3 == null) {
                break L1;
              } else {
                if (var3.field_m == var2) {
                  break L1;
                } else {
                  var3 = (hg) (Object) ak.field_d.b((byte) -105);
                  continue L0;
                }
              }
            }
            if (var3 != null) {
              L2: {
                var4 = var16.e(false);
                if (var4 != 0) {
                  hm.field_c[0] = b.field_e;
                  var5 = var3.field_j;
                  var6_int = 1;
                  L3: while (true) {
                    if (var4 <= var6_int) {
                      kh.a(var5, var4, 26721);
                      var6_int = 0;
                      L4: while (true) {
                        if (var6_int >= var4) {
                          cm.a(var5, (byte) 118);
                          var6 = new String[2][var5];
                          var20 = new int[2][4 * var5];
                          var8 = qh.field_D;
                          var9 = 0;
                          var10 = 0;
                          L5: while (true) {
                            if (var8 <= var9) {
                              var14 = 0;
                              var9 = var14;
                              var15 = 0;
                              var10 = var15;
                              L6: while (true) {
                                if (var14 >= var8) {
                                  break L2;
                                } else {
                                  var11 = mh.field_y[var5 + var14];
                                  var6[1][var15] = hm.field_c[var11];
                                  var20[1][var15 * 4] = jl.field_b[var11];
                                  var20[1][var15 * 4 + 1] = kk.field_b[var11];
                                  var20[1][4 * var15 - -2] = hg.field_q[var11];
                                  var20[1][3 + 4 * var15] = vh.field_i[var11];
                                  if (ng.a(hm.field_c[var11], (byte) 7)) {
                                    if (0 == vh.field_i[var11] + (hg.field_q[var11] + kk.field_b[var11])) {
                                      var6[1][var15] = null;
                                      var15--;
                                      var14++;
                                      var15++;
                                      continue L6;
                                    } else {
                                      var14++;
                                      var15++;
                                      continue L6;
                                    }
                                  } else {
                                    var14++;
                                    var15++;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
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
                                  var9++;
                                  var10++;
                                  continue L5;
                                } else {
                                  var9++;
                                  var10++;
                                  continue L5;
                                }
                              } else {
                                var9++;
                                var10++;
                                continue L5;
                              }
                            }
                          }
                        } else {
                          td.a((byte) -107, (ni) (Object) var16);
                          if (-1 == (var6_int ^ -1)) {
                            lg.a(rf.field_l, var6_int, w.field_a, wd.field_c, -103, dk.field_B);
                            var6_int++;
                            continue L4;
                          } else {
                            lg.a(rf.field_l, var6_int, w.field_a, wd.field_c, -113, dk.field_B);
                            var6_int++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      hm.field_c[var6_int] = var13.h(0);
                      var6_int++;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
              var3.c(-1);
              return;
            } else {
              k.c(-28354);
              return;
            }
          }
        } else {
          return;
        }
    }

    pj(Object param0, int param1) {
        super(param1);
        ((pj) this).field_A = param0;
    }

    public static void h(int param0) {
        field_y = null;
        field_z = null;
        field_x = null;
        int var1 = 88 / ((-41 - param0) / 58);
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = fleas.field_A ? 1 : 0;
        gb.b(param3, param2, 1 + param1, 10000536);
        gb.b(param3, param4 + param2, 1 + param1, 12105912);
        int var5 = 1;
        int var6 = param4;
        if (!(param2 + var5 >= gb.field_b)) {
            var5 = -param2 + gb.field_b;
        }
        if (gb.field_i < var6 + param2) {
            var6 = gb.field_i - param2;
        }
        for (var7 = var5; var6 > var7; var7++) {
            var8 = 152 + 48 * var7 / param4;
            var9 = var8 | (var8 << -1103879120 | var8 << 391889960);
            gb.field_a[param3 + (param2 + var7) * gb.field_d] = var9;
            gb.field_a[param1 + ((param2 + var7) * gb.field_d + param3)] = var9;
        }
        if (param0 != 127) {
            pj.h(100);
        }
    }

    final static void d(byte param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var3 = fleas.field_A ? 1 : 0;
              if (param0 == 60) {
                break L0;
              } else {
                field_y = null;
                break L0;
              }
            }
            L1: {
              if (td.field_k == null) {
                break L1;
              } else {
                td.field_k.d(param0 + -14895);
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
                try {
                  L4: {
                    rd.field_c.b((byte) -70);
                    break L4;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                break L3;
              }
            }
            L6: {
              if (null != mc.field_c) {
                var1 = 0;
                L7: while (true) {
                  if (var1 >= mc.field_c.length) {
                    break L6;
                  } else {
                    if (mc.field_c[var1] != null) {
                      try {
                        L8: {
                          mc.field_c[var1].b((byte) -70);
                          var1++;
                          break L8;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L9: {
                          var2 = (IOException) (Object) decompiledCaughtException;
                          var1++;
                          break L9;
                        }
                      }
                      continue L7;
                    } else {
                      var1++;
                      continue L7;
                    }
                  }
                }
              } else {
                break L6;
              }
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
