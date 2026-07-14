/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mf {
    static cn[] field_b;
    static String[] field_c;
    static int[] field_d;
    static String field_a;

    final static void a(int param0, ec param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte[] var10 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = DungeonAssault.field_K;
                        var9 = new byte[24];
                        var7 = var9;
                        var6 = var7;
                        var10 = var6;
                        var8 = var10;
                        var2 = var8;
                        if (bk.field_b != null) {
                            statePc = 2;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            bk.field_b.a(0L, -26296);
                            bk.field_b.a(param0 ^ -30463, var9);
                            var3_int = 0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if ((var3_int ^ -1) <= -25) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var10[var3_int] == 0) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_int++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (24 > var3_int) {
                                statePc = 13;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (24 <= var4) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 13: {
                        param1.a(var10, 1, 24, 0);
                        if (param0 == -30463) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        cn discarded$2 = mf.a(114, 83, 37, -91, (byte) -11);
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static cn a(int param0, int param1, int param2, int param3, byte param4) {
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = DungeonAssault.field_K;
        int var5 = param3 + param2 * 2;
        int var6 = param1 + 2 * param2;
        cn var7 = new cn(var5, var6);
        jh.a(var7);
        int var8 = 16711935 & param0;
        int var9 = param0 & 65280;
        int var11 = 72 / ((param4 - 11) / 53);
        for (var10 = 0; var10 < param2; var10++) {
            var12 = (var10 << -1584090136) / (param2 + -1);
            var13 = var12 * var9 & 16711680 | var12 * var8 & -16711936;
            gf.a(var10, var10, -(2 * var10) + var5, var6 - 2 * var10, -var10 + param2, var13 >>> 156402824);
        }
        gf.b(param2, param2, param3, param1, 0);
        jh.b();
        var7.field_A = var7.field_A - param2;
        var7.field_w = var7.field_w - param2;
        return var7;
    }

    final static int b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!ha.b((byte) 47)) {
            L1: {
              d.field_g.a(-7734, ab.a(-776726687, lc.field_c, hm.field_k), ab.a(-776726687, hj.field_S, eh.field_h));
              if (!d.field_g.c(77)) {
                break L1;
              } else {
                var1 = 1;
                break L1;
              }
            }
            if (param0 == 12210) {
              L2: {
                L3: {
                  var3 = 0;
                  if (var1 == 0) {
                    break L3;
                  } else {
                    if (-1 < d.field_g.field_b) {
                      break L3;
                    } else {
                      L4: {
                        var3 = n.field_g[d.field_g.field_b];
                        if (-3 == var3) {
                          break L4;
                        } else {
                          if (5 != var3) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      jb.q(61270);
                      break L2;
                    }
                  }
                }
                if (var2 == 0) {
                  break L2;
                } else {
                  if (-3 != (kh.field_t ^ -1)) {
                    jb.q(61270);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L5: {
                if (0 != var3) {
                  break L5;
                } else {
                  if ((kh.field_t ^ -1) != -3) {
                    break L5;
                  } else {
                    var4 = -kg.field_d + kd.c(param0 ^ -9766);
                    var6 = (int)((10999L - var4) / 1000L);
                    if ((var6 ^ -1) < -1) {
                      break L5;
                    } else {
                      var3 = 2;
                      ae.a(true, 5, -1);
                      break L5;
                    }
                  }
                }
              }
              return var3;
            } else {
              return 46;
            }
          } else {
            L6: {
              d.field_g.d(0);
              if (d.field_g.c(-94)) {
                var1 = 1;
                break L6;
              } else {
                break L6;
              }
            }
            if ((mm.field_t ^ -1) == -14) {
              var2 = 1;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 5) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var3 = 0;
        int var4 = DungeonAssault.field_K;
        if (param0 > -75) {
            return;
        }
        if (10 > dk.field_c) {
            var3 = 0;
            if (im.field_d) {
                im.field_d = false;
                var3 = 1;
            }
            hd.a(tl.b(-3), jc.field_d, var3 != 0, (byte) 105, h.a(-3));
        } else {
            if (!l.a(true)) {
                gf.a();
                ah.a(false, 320, 240);
                ob.a(0, -97, param2, 0);
            } else {
                if (-1 != (kh.field_n ^ -1)) {
                    g.a(param2, 18131);
                } else {
                    mj.a(false, param1, false);
                    ob.a(0, -84, param2, 0);
                }
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This password is part of your Player Name, and would be easy to guess";
    }
}
