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
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            var5 = DungeonAssault.field_K;
            try {
              L0: {
                L1: {
                  var6 = new byte[24];
                  var2 = var6;
                  if (bk.field_b != null) {
                    try {
                      L2: {
                        bk.field_b.a(0L, -26296);
                        bk.field_b.a(0, var6);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (var3_int >= 24) {
                              break L4;
                            } else {
                              if (var2[var3_int] == 0) {
                                var3_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (24 > var3_int) {
                            break L2;
                          } else {
                            throw new IOException();
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L6: while (true) {
                          if (24 <= var4) {
                            break L5;
                          } else {
                            var2[var4] = (byte) -1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    param1.a(var2, 1, 24, 0);
                    break L1;
                  } else {
                    param1.a(var2, 1, 24, 0);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) var2_ref;
                stackOut_16_1 = new StringBuilder().append("mf.E(").append(-30463).append(',');
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
                  break L7;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L7;
                }
              }
              throw vk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
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
            var12 = (var10 << 8) / (param2 + -1);
            var13 = var12 * var9 & 16711680 | var12 * var8 & -16711936;
            gf.a(var10, var10, -(2 * var10) + var5, var6 - 2 * var10, -var10 + param2, var13 >>> 8);
        }
        gf.b(param2, param2, param3, param1, 0);
        jh.b();
        var7.field_A = var7.field_A - param2;
        var7.field_w = var7.field_w - param2;
        return var7;
    }

    final static int b() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_28_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              int discarded$4 = 47;
              if (!ha.b()) {
                L2: {
                  d.field_g.a(-7734, ab.a(-776726687, lc.field_c, hm.field_k), ab.a(-776726687, hj.field_S, eh.field_h));
                  if (!d.field_g.c(77)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var3 = 0;
                    if (var1_int == 0) {
                      break L4;
                    } else {
                      if (d.field_g.field_b < 0) {
                        break L4;
                      } else {
                        L5: {
                          var3 = n.field_g[d.field_g.field_b];
                          if (var3 == 2) {
                            break L5;
                          } else {
                            if (5 != var3) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        int discarded$5 = 61270;
                        jb.q();
                        break L3;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (kh.field_t != 2) {
                      int discarded$6 = 61270;
                      jb.q();
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L6: {
                  if (0 != var3) {
                    break L6;
                  } else {
                    if (kh.field_t != 2) {
                      break L6;
                    } else {
                      var4 = -kg.field_d + kd.c(-2456);
                      var6 = (int)((10999L - var4) / 1000L);
                      if (var6 > 0) {
                        break L6;
                      } else {
                        var3 = 2;
                        int discarded$7 = -1;
                        ae.a(true, 5);
                        break L6;
                      }
                    }
                  }
                }
                stackOut_27_0 = var3;
                stackIn_28_0 = stackOut_27_0;
                break L0;
              } else {
                L7: {
                  d.field_g.d(0);
                  if (d.field_g.c(-94)) {
                    var1_int = 1;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (mm.field_t == 13) {
                  var2 = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "mf.A(" + 12210 + ')');
        }
        return stackIn_28_0;
    }

    public static void a() {
        field_d = null;
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (10 <= dk.field_c) {
                if (l.a(true)) {
                  if (kh.field_n == 0) {
                    mj.a(false, param1, false);
                    int discarded$8 = 0;
                    ob.a(0, -84, param2);
                    break L1;
                  } else {
                    g.a(param2, 18131);
                    break L1;
                  }
                } else {
                  gf.a();
                  ah.a(false, 320, 240);
                  int discarded$9 = 0;
                  ob.a(0, -97, param2);
                  break L1;
                }
              } else {
                L2: {
                  var3_int = 0;
                  if (!im.field_d) {
                    break L2;
                  } else {
                    im.field_d = false;
                    var3_int = 1;
                    break L2;
                  }
                }
                int discarded$10 = -3;
                int discarded$11 = -3;
                hd.a(tl.b(), jc.field_d, var3_int != 0, (byte) 105, h.a());
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("mf.C(").append(-101).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This password is part of your Player Name, and would be easy to guess";
    }
}
