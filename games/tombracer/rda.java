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
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                this.a(80, (int[][]) null);
                break L1;
              }
            }
            L2: {
              if (param2 != 0) {
                if (param2 != 1) {
                  break L2;
                } else {
                  L3: {
                    stackOut_17_0 = this;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (param1.h(255) != 1) {
                      stackOut_19_0 = this;
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L3;
                    } else {
                      stackOut_18_0 = this;
                      stackOut_18_1 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      break L3;
                    }
                  }
                  ((rda) this).field_g = stackIn_20_1 != 0;
                  break L2;
                }
              } else {
                ((rda) this).field_p = new rra[param1.h(255)];
                var4_int = 0;
                L4: while (true) {
                  if (~((rda) this).field_p.length >= ~var4_int) {
                    break L2;
                  } else {
                    L5: {
                      var5 = param1.h(255);
                      var6 = var5;
                      if (0 == var6) {
                        ((rda) this).field_p[var4_int] = (rra) (Object) od.a(0, param1);
                        break L5;
                      } else {
                        if (var6 == 1) {
                          ((rda) this).field_p[var4_int] = (rra) (Object) lga.a(param1, (byte) -88);
                          break L5;
                        } else {
                          if (var6 == 2) {
                            ((rda) this).field_p[var4_int] = (rra) (Object) gpa.a(4, param1);
                            break L5;
                          } else {
                            if (3 == var6) {
                              ((rda) this).field_p[var4_int] = (rra) (Object) cba.a(64, param1);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    var4_int++;
                    continue L4;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("rda.A(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, int[][] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        rra var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = ns.field_g;
              if (param0 == -8883) {
                break L1;
              } else {
                boolean discarded$2 = rda.d(56);
                break L1;
              }
            }
            L2: {
              var4 = qda.field_i;
              nfa.a(param1, param0 ^ -8901);
              loa.a(una.field_b, false, 0, 0, hba.field_b);
              if (null != ((rda) this).field_p) {
                var5 = 0;
                L3: while (true) {
                  if (var5 >= ((rda) this).field_p.length) {
                    break L2;
                  } else {
                    L4: {
                      var6 = ((rda) this).field_p[var5];
                      var7 = var6.field_c;
                      var8 = var6.field_b;
                      if (var7 < 0) {
                        if (var8 >= 0) {
                          var6.a(var3_int, var4, true);
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        if (0 > var8) {
                          var6.a(var4, 119, var3_int);
                          break L4;
                        } else {
                          var6.a((byte) -122, var3_int, var4);
                          break L4;
                        }
                      }
                    }
                    var5++;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("rda.D(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    public rda() {
        super(0, true);
    }

    final static void d(byte param0) {
        bl.field_a = null;
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == wg.field_l) {
                break L1;
              } else {
                wg.field_l.a(-21);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "rda.C(" + 0 + 41);
        }
    }

    public static void c(int param0) {
        field_m = null;
        field_n = null;
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
                    var13[var14] = sea.c(255, var15) << 4;
                    var12[var14] = sea.c(65280, var15) >> 4;
                    var11[var14] = sea.c(var15, 16711680) >> 12;
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
