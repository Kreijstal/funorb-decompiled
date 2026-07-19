/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk {
    static int[][][][] field_a;
    static boolean field_b;
    static int[] field_c;
    static int field_e;
    static boolean field_d;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        fe var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var4 = -1;
            if (sh.field_r != 0) {
              db.g(-56);
              var5 = 0;
              L1: while (true) {
                if (-3 >= (var5 ^ -1)) {
                  L2: {
                    if (param0 > 93) {
                      break L2;
                    } else {
                      hk.a(-56);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (-1 <= (fk.field_u[var5] ^ -1)) {
                      break L3;
                    } else {
                      fk.field_u[var5] = fk.field_u[var5] - 1;
                      break L3;
                    }
                  }
                  L4: {
                    if (0 >= fh.field_h[var5]) {
                      L5: {
                        if (tg.field_r[var5] == null) {
                          break L5;
                        } else {
                          if (!wh.field_d[var5]) {
                            break L5;
                          } else {
                            je.a((byte) 15, tg.field_r[var5]);
                            break L5;
                          }
                        }
                      }
                      wh.field_d[var5] = false;
                      break L4;
                    } else {
                      var2 = fj.field_p[var5];
                      if (ea.field_g == null) {
                        break L4;
                      } else {
                        if ((var2 ^ -1) > -1) {
                          break L4;
                        } else {
                          if (ea.field_g.length <= var2) {
                            break L4;
                          } else {
                            L6: {
                              var1_int = fh.field_h[var5];
                              if (tg.field_r[var5] == null) {
                                L7: {
                                  if (-1 != (var5 ^ -1)) {
                                    break L7;
                                  } else {
                                    var4 = 11;
                                    break L7;
                                  }
                                }
                                L8: {
                                  if (var5 != 1) {
                                    break L8;
                                  } else {
                                    var4 = 12;
                                    break L8;
                                  }
                                }
                                if (var4 < 0) {
                                  break L4;
                                } else {
                                  var3 = cj.field_h[var4];
                                  tg.field_r[var5] = nc.a(var3, 100, var1_int);
                                  tg.field_r[var5].e(-1);
                                  tg.field_r[var5].e(0, var3.field_k.length);
                                  da.field_g[var5] = we.a(tg.field_r[var5], 6222);
                                  wh.field_d[var5] = true;
                                  fk.field_u[var5] = 25;
                                  break L6;
                                }
                              } else {
                                break L6;
                              }
                            }
                            L9: {
                              if (!wh.field_d[var5]) {
                                tg.field_r[var5].h(var1_int);
                                da.field_g[var5] = we.a(tg.field_r[var5], 6222);
                                wh.field_d[var5] = true;
                                fk.field_u[var5] = 25;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            if (!wh.field_d[var5]) {
                              break L4;
                            } else {
                              if (-1 == (fk.field_u[var5] ^ -1)) {
                                tg.field_r[var5].f(25, var1_int);
                                fk.field_u[var5] = 25;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var5++;
                  continue L1;
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
          throw oj.a((Throwable) ((Object) var1), "hk.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_a = (int[][][][]) null;
        if (param0 != 0) {
            field_c = (int[]) null;
        }
    }

    static {
        field_c = new int[3];
        field_a = new int[][][][]{new int[][][]{new int[][]{new int[]{-1, -1}, new int[]{-1, -1}, new int[]{-1, -1}, new int[]{-1, -1}, new int[]{-1, -1}, new int[]{0, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{17, 0}, new int[]{17, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}}}, new int[][][]{new int[][]{new int[]{-1, -1}, new int[]{-1, -1}, new int[]{-1, -1}, new int[]{-1, -1}, new int[]{-1, -1}, new int[]{4, 0}}, new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{5, 0}}, new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{3, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{0, 0}}, new int[][]{new int[]{-1, 0}}}, new int[][][]{new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{0, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{0, 0}}, new int[][]{new int[]{-1, 0}}, new int[][]{new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{-1, 0}, new int[]{0, 0}}}};
        field_b = false;
    }
}
