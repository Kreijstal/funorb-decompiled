/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ad {
    String[][] field_c;
    private byte[][] field_a;
    private byte[][] field_g;
    private byte[][] field_h;
    static boolean field_e;
    int field_d;
    static String field_f;
    static volatile int field_b;

    private final boolean b(byte param0, char[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= param1.length + -2) {
                var3_int = -1 + param1.length;
                if (param0 < -15) {
                  L2: while (true) {
                    if (var3_int < 2) {
                      stackOut_24_0 = 1;
                      stackIn_25_0 = stackOut_24_0;
                      break L0;
                    } else {
                      var4 = 1;
                      var5 = var3_int;
                      L3: while (true) {
                        L4: {
                          if (var5 < 0) {
                            break L4;
                          } else {
                            var4 = this.a(0, var4, de.a(106, param1[var5]), ((ad) this).field_g);
                            if (var4 == 0) {
                              break L4;
                            } else {
                              if (!this.a(var4, ((ad) this).field_g, true)) {
                                var5--;
                                continue L3;
                              } else {
                                stackOut_20_0 = 0;
                                stackIn_21_0 = stackOut_20_0;
                                return stackIn_21_0 != 0;
                              }
                            }
                          }
                        }
                        var3_int--;
                        continue L2;
                      }
                    }
                  }
                } else {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0 != 0;
                }
              } else {
                var4 = 1;
                var5 = var3_int;
                L5: while (true) {
                  L6: {
                    if (param1.length <= var5) {
                      break L6;
                    } else {
                      var4 = this.a(0, var4, de.a(33, param1[var5]), ((ad) this).field_g);
                      if (var4 != 0) {
                        if (!this.a(var4, ((ad) this).field_g, true)) {
                          var5++;
                          continue L5;
                        } else {
                          stackOut_8_0 = 0;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("ad.E(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 41);
        }
        return stackIn_25_0 != 0;
    }

    final boolean a(byte param0, char[] param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 34) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            L2: {
              if (this.a(0, param1, (byte) -118) != param1.length) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ad.G(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0 != 0;
    }

    private final boolean a(int param0, byte[][] param1, boolean param2) {
        return param1[param0][0] == -1;
    }

    final static ti[] a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = -101 / ((param3 - 78) / 48);
        ti[] var6 = new ti[9];
        ti dupTemp$0 = cd.a(param1, 1, (byte) -20);
        var6[6] = dupTemp$0;
        var6[3] = dupTemp$0;
        var6[2] = dupTemp$0;
        var6[1] = dupTemp$0;
        var6[0] = dupTemp$0;
        ti dupTemp$1 = cd.a(param2, 1, (byte) -31);
        var6[8] = dupTemp$1;
        var6[7] = dupTemp$1;
        var6[5] = dupTemp$1;
        if (!(param0 == 0)) {
            var6[4] = cd.a(param0, 64, (byte) -103);
        }
        return var6;
    }

    final void a(oa param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            ((ad) this).field_h = new byte[param0.i(17783)][];
            var3_int = 0;
            L1: while (true) {
              if (((ad) this).field_h.length <= var3_int) {
                ((ad) this).field_g = new byte[param0.i(17783)][];
                var3_int = 0;
                L2: while (true) {
                  if (((ad) this).field_g.length <= var3_int) {
                    var3_int = 0;
                    if (param1 == 1) {
                      L3: while (true) {
                        if (((ad) this).field_a.length <= var3_int) {
                          break L0;
                        } else {
                          ((ad) this).field_a[var3_int] = new byte[param0.c((byte) -109)];
                          var4 = new byte[param0.c((byte) -109)];
                          param0.a(var4.length, param1 + 1, var4, 0);
                          var3_int++;
                          continue L3;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    var4_int = (byte)param0.d((byte) 104);
                    var5 = param0.c((byte) -117);
                    ((ad) this).field_g[var3_int] = new byte[1 + var5];
                    ((ad) this).field_g[var3_int][0] = (byte)var4_int;
                    ji.a(param0.field_g, param0.field_h, ((ad) this).field_g[var3_int], 1, var5);
                    param0.field_h = param0.field_h + var5;
                    var3_int++;
                    continue L2;
                  }
                }
              } else {
                var4_int = (byte)param0.d((byte) 84);
                var5 = param0.c((byte) -124);
                ((ad) this).field_h[var3_int] = new byte[1 + var5];
                ((ad) this).field_h[var3_int][0] = (byte)var4_int;
                ji.a(param0.field_g, param0.field_h, ((ad) this).field_h[var3_int], 1, var5);
                param0.field_h = param0.field_h + var5;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ad.D(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
    }

    ad(int param0, int param1) {
        ((ad) this).field_a = new byte[257][];
        ((ad) this).field_d = param0;
        ((ad) this).field_c = new String[param1][2];
    }

    public static void a(int param0) {
        field_f = null;
    }

    private final int a(int param0, int param1, byte param2, byte[][] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((ad) this).field_h = null;
                break L1;
              }
            }
            L2: {
              if (param1 != 1) {
                break L2;
              } else {
                if (1 == param3.length) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  break L2;
                }
              }
            }
            am.field_q.field_g = param3[param1];
            am.field_q.field_h = 1;
            var5_int = 255 & param2;
            var6 = -1;
            var7 = -1;
            L3: while (true) {
              if (var5_int <= var6) {
                stackOut_13_0 = var7;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                var7 = am.field_q.i(param0 ^ 17783);
                if (var7 == 0) {
                  var6 = var6 + (am.field_q.i(param0 ^ 17783) - -1);
                  continue L3;
                } else {
                  var6++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("ad.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0;
    }

    final void a(char[] param0, Random param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int stackIn_5_0 = 0;
        byte[][] stackIn_8_0 = null;
        byte[][] stackIn_9_0 = null;
        byte[][] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        byte[][] stackOut_7_0 = null;
        byte[][] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        byte[][] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0.length != 0) {
              stackOut_3_0 = 256;
              stackIn_5_0 = stackOut_3_0;
              L1: while (true) {
                var5_int = stackIn_5_0;
                var6 = 0;
                L2: while (true) {
                  if (param0.length <= var6) {
                    if (!this.b((byte) -119, param0)) {
                      stackOut_4_0 = 256;
                      stackIn_5_0 = stackOut_4_0;
                      continue L1;
                    } else {
                      L3: {
                        if (param3 == 3670) {
                          break L3;
                        } else {
                          boolean discarded$1 = this.a(-50, (byte[][]) null, true);
                          break L3;
                        }
                      }
                      break L0;
                    }
                  } else {
                    L4: {
                      stackOut_7_0 = ((ad) this).field_a;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (!param2) {
                        stackOut_9_0 = (byte[][]) (Object) stackIn_9_0;
                        stackOut_9_1 = var5_int;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L4;
                      } else {
                        stackOut_8_0 = (byte[][]) (Object) stackIn_8_0;
                        stackOut_8_1 = 256;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        break L4;
                      }
                    }
                    var7 = stackIn_10_0[stackIn_10_1];
                    var5_int = var7[li.a(var7.length, param1, false)] & 255;
                    param0[var6] = di.a(68, (byte)var5_int);
                    var6++;
                    continue L2;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("ad.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final int a(int param0, char[] param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            var5 = 1;
            var6 = param0;
            L1: while (true) {
              L2: {
                if (var6 >= param1.length) {
                  break L2;
                } else {
                  L3: {
                    var7 = 0;
                    if (param1[var6] == 0) {
                      break L3;
                    } else {
                      var7 = de.a(11, param1[var6]);
                      break L3;
                    }
                  }
                  var5 = this.a(0, var5, (byte) var7, ((ad) this).field_h);
                  if (var5 != 0) {
                    L4: {
                      if (this.a(var5, ((ad) this).field_h, true)) {
                        var4_int = var6 - param0 + 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var6++;
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_12_0 = var4_int;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("ad.J(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + -118 + 41);
        }
        return stackIn_13_0;
    }

    final static void a(jc param0, int param1, int param2, ci param3) {
        try {
            tf.field_a = wi.b(-125) * param1 / 1000;
            kf.a(param3, (byte) -80);
            sd.a(param3, true);
            v.a((byte) 118, param3);
            if (param2 != 22313) {
                field_f = null;
            }
            rd.a(true);
            ra.a(0);
            si.field_l = -tf.field_a;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ad.I(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_f = "To server list";
        field_b = 0;
    }
}
