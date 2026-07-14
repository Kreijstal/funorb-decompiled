/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rda extends ci {
    static String[] field_m;
    static int[] field_n;
    private rra[] field_p;
    static int field_o;

    final void a(byte param0, uia param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param0 == 107) {
            break L0;
          } else {
            this.a(80, (int[][]) null);
            break L0;
          }
        }
        L1: {
          if (-1 != (param2 ^ -1)) {
            if (-2 != (param2 ^ -1)) {
              break L1;
            } else {
              L2: {
                stackOut_16_0 = this;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if ((param1.h(255) ^ -1) != -2) {
                  stackOut_18_0 = this;
                  stackOut_18_1 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L2;
                } else {
                  stackOut_17_0 = this;
                  stackOut_17_1 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L2;
                }
              }
              ((rda) this).field_g = stackIn_19_1 != 0;
              break L1;
            }
          } else {
            ((rda) this).field_p = new rra[param1.h(255)];
            var4 = 0;
            L3: while (true) {
              if (((rda) this).field_p.length <= var4) {
                break L1;
              } else {
                var5 = param1.h(255);
                var6 = var5;
                if (0 == var6) {
                  ((rda) this).field_p[var4] = (rra) (Object) od.a(0, param1);
                  var4++;
                  continue L3;
                } else {
                  if (var6 == -2) {
                    ((rda) this).field_p[var4] = (rra) (Object) lga.a(param1, (byte) -88);
                    var4++;
                    continue L3;
                  } else {
                    if (-3 == var6) {
                      ((rda) this).field_p[var4] = (rra) (Object) gpa.a(4, param1);
                      var4++;
                      continue L3;
                    } else {
                      if (3 == var6) {
                        ((rda) this).field_p[var4] = (rra) (Object) cba.a(64, param1);
                        var4++;
                        continue L3;
                      } else {
                        var4++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int[][] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        rra var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var3 = ns.field_g;
          if (param0 == -8883) {
            break L0;
          } else {
            boolean discarded$2 = rda.d(56);
            break L0;
          }
        }
        L1: {
          var4 = qda.field_i;
          nfa.a(param1, param0 ^ -8901);
          loa.a(una.field_b, false, 0, 0, hba.field_b);
          if (null != ((rda) this).field_p) {
            var5 = 0;
            L2: while (true) {
              if (var5 >= ((rda) this).field_p.length) {
                break L1;
              } else {
                var6 = ((rda) this).field_p[var5];
                var7 = var6.field_c;
                var8 = var6.field_b;
                if (var7 < 0) {
                  if ((var8 ^ -1) <= -1) {
                    var6.a(var3, var4, true);
                    var5++;
                    continue L2;
                  } else {
                    var5++;
                    continue L2;
                  }
                } else {
                  if (0 > var8) {
                    var6.a(var4, 119, var3);
                    var5++;
                    continue L2;
                  } else {
                    var6.a((byte) -122, var3, var4);
                    var5++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    public rda() {
        super(0, true);
    }

    final static void d(byte param0) {
        if (param0 != -128) {
            boolean discarded$0 = rda.d(63);
        }
        bl.field_a = null;
    }

    final static void e(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = TombRacer.field_G ? 1 : 0;
                        if (null == wg.field_l) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        wg.field_l.a(param0 + -21);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (param0 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        if (null == ep.field_k) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        ep.field_k.a((byte) 118);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        if (null == wka.field_c) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            wka.field_c.b((byte) -52);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null == tna.field_c) {
                            statePc = 18;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var1 = 0;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (var1 >= tna.field_c.length) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (tna.field_c[var1] != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var1++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            tna.field_c[var1].b((byte) -37);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var1++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 17: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 18: {
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

    public static void c(int param0) {
        field_m = null;
        field_n = null;
        if (param0 > -82) {
            field_o = -33;
        }
    }

    final int[] c(int param0, int param1) {
        if (param0 != 1) {
            field_n = null;
        }
        int[] var4 = ((rda) this).field_i.a((byte) 107, param1);
        int[] var3 = var4;
        if (((rda) this).field_i.field_d) {
            this.a(-8883, ((rda) this).field_i.a(0));
        }
        return var4;
    }

    final int[][] b(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int[][] var29 = null;
        int[][][] var30 = null;
        int var8 = 0;
        int[] var32 = null;
        int[][] var31 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = TombRacer.field_G ? 1 : 0;
        int[][] var3 = ((rda) this).field_h.a(param0, (byte) 125);
        if (param1 != -1) {
            field_m = null;
        }
        if (!(!((rda) this).field_h.field_f)) {
            var4 = ns.field_g;
            var5 = qda.field_i;
            var29 = new int[var5][var4];
            var30 = ((rda) this).field_h.a((byte) -98);
            this.a(-8883, var29);
            for (var8 = 0; var8 < qda.field_i; var8++) {
                var32 = var29[var8];
                var31 = var30[var8];
                var11 = var31[0];
                var12 = var31[1];
                var13 = var31[2];
                for (var14 = 0; ns.field_g > var14; var14++) {
                    var15 = var32[var14];
                    var13[var14] = sea.c(255, var15) << -1948639356;
                    var12[var14] = sea.c(65280, var15) >> 78470276;
                    var11[var14] = sea.c(var15, 16711680) >> -1606044692;
                }
            }
        }
        return var3;
    }

    final static boolean d(int param0) {
        if (param0 != 20125) {
            return true;
        }
        return ld.field_e >= 2 ? true : false;
    }

    static {
    }
}
