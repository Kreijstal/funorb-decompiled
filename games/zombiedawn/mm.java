/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mm extends le {
    static String field_l;
    static int field_i;
    static String field_j;
    private vo field_h;
    static float field_k;

    final void a(byte param0, wk param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        pb var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            var5 = (pb) (Object) ((mm) this).field_h.b((byte) 26);
            L1: while (true) {
              if (var5 == null) {
                L2: {
                  if (param0 == 117) {
                    break L2;
                  } else {
                    field_j = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var5.a((byte) -28, param1);
                var5 = (pb) (Object) ((mm) this).field_h.a(false);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("mm.E(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final static boolean a(boolean param0) {
        if (j.field_l == null) {
            j.field_l = t.a(false, 6);
        }
        if (j.field_l.field_k) {
            j.field_l = null;
            return true;
        }
        return false;
    }

    public static void e(byte param0) {
        field_j = null;
        int var1 = -73 / ((param0 - -7) / 41);
        field_l = null;
    }

    final static void c(byte param0) {
        se.field_j = oj.b(0);
        if (param0 > -57) {
            mm.c((byte) -40);
        }
        e.field_S = new dn();
        pn.a(true, (byte) -52, true);
    }

    final void a(int param0) {
        int var3 = ZombieDawn.field_J;
        pb var5 = (pb) (Object) ((mm) this).field_h.b((byte) 26);
        while (var5 != null) {
            var5.e((byte) -113);
            var5 = (pb) (Object) ((mm) this).field_h.a(false);
        }
        if (param0 != -25687) {
            Object var4 = null;
            boolean discarded$0 = ((mm) this).a((ah) null, (byte) 55);
        }
    }

    final static void d(byte param0) {
        if (!(!uh.field_g)) {
            return;
        }
        int var1 = 20;
        int var2 = 40;
        int var3 = pb.a(so.field_a, 5, 1);
        if (var3 == 0) {
            ga.field_q = ga.field_q - 3;
        } else {
            if (!(var3 != 1)) {
                ga.field_q = ga.field_q + 3;
            }
        }
        if (!(~ga.field_q <= ~var2)) {
            ga.field_q = var2;
        }
        if (ga.field_q > var1 + var2) {
            ga.field_q = var1 + var2;
        }
    }

    final static dj a(int param0, byte param1) {
        if (param1 >= -18) {
            field_i = -54;
        }
        return hd.a(false, true, param0, 1, true, false);
    }

    final boolean a(ah param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        pb var5 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              var3_int = param0.a(true);
              var4 = param0.f(237239984);
              if (param1 > 49) {
                break L1;
              } else {
                mm.e((byte) 37);
                break L1;
              }
            }
            var5 = (pb) (Object) ((mm) this).field_h.b((byte) 26);
            L2: while (true) {
              if (var5 == null) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (!var5.a(var4, var3_int, 114)) {
                  var5 = (pb) (Object) ((mm) this).field_h.a(false);
                  continue L2;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("mm.G(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    mm(int param0, int param1) {
        boolean[][] var3 = null;
        boolean[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean[][] var8_ref_boolean____ = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        boolean[][] var13 = null;
        int var14 = 0;
        boolean[][] var15 = null;
        boolean[][] var16 = null;
        boolean[][] var17 = null;
        boolean[][] var18 = null;
        param0 = param0 / 24;
        param1 = param1 / 24;
        var18 = new boolean[1 + 2 * t.field_b][1 + t.field_b * 2];
        var17 = var18;
        var16 = var17;
        var15 = var16;
        var13 = var15;
        var3 = var13;
        var4 = new boolean[var18.length][var18[0].length];
        var5 = param0 - t.field_b;
        var6 = -t.field_b + param1;
        var13[t.field_b][t.field_b] = true;
        var7 = 0;
        L0: while (true) {
          if (~var7 <= ~t.field_b) {
            ((mm) this).field_h = new vo();
            var7 = 0;
            L1: while (true) {
              if (var7 >= var3.length) {
                return;
              } else {
                var14 = 0;
                var8 = var14;
                L2: while (true) {
                  if (~var14 <= ~var3[0].length) {
                    var7++;
                    continue L1;
                  } else {
                    L3: {
                      var9 = var5 + var14;
                      var10 = var7 + var6;
                      var11 = (param0 + -var9) * (param0 + -var9) + (-var10 + param1) * (param1 - var10);
                      if (var11 >= 81) {
                        break L3;
                      } else {
                        if (!var3[var7][var14]) {
                          break L3;
                        } else {
                          ((mm) this).field_h.a(0, (le) (Object) new pb(var9, var10, var11));
                          break L3;
                        }
                      }
                    }
                    var14++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var8 = 0;
            L4: while (true) {
              if (var3.length <= var8) {
                var8_ref_boolean____ = var3;
                var3 = var4;
                var4 = var8_ref_boolean____;
                var7++;
                continue L0;
              } else {
                var9 = 0;
                L5: while (true) {
                  if (var9 >= var3[0].length) {
                    var8++;
                    continue L4;
                  } else {
                    L6: {
                      var10 = var5 + var9;
                      var11 = var6 + var8;
                      if (var10 <= 0) {
                        break L6;
                      } else {
                        if (var11 <= 0) {
                          break L6;
                        } else {
                          if (~vg.field_a[0].length >= ~var10) {
                            break L6;
                          } else {
                            if (vg.field_a.length <= var11) {
                              break L6;
                            } else {
                              if ((1 & vg.field_a[var11][var10]) != 1) {
                                break L6;
                              } else {
                                L7: {
                                  if (var3[var8][var9]) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (var9 <= 0) {
                                        break L8;
                                      } else {
                                        if (var3[var8][-1 + var9]) {
                                          break L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (var8 <= 0) {
                                        break L9;
                                      } else {
                                        if (var3[var8 + -1][var9]) {
                                          break L7;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (-1 + var3[0].length <= var9) {
                                        break L10;
                                      } else {
                                        if (var3[var8][1 + var9]) {
                                          break L7;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    if (~(var3.length + -1) >= ~var8) {
                                      break L6;
                                    } else {
                                      if (!var3[var8 + 1][var9]) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                var4[var8][var9] = true;
                                break L6;
                              }
                            }
                          }
                        }
                      }
                    }
                    var9++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = -1;
        field_j = "More suggestions";
        field_l = "MELTDOWN";
    }
}
