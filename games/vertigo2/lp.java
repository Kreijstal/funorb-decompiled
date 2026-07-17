/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp extends ji {
    static int field_D;
    static int[] field_B;
    static java.math.BigInteger field_E;
    private int field_y;
    static String field_z;
    static int field_C;
    static String field_A;

    final int[] c(int param0, int param1) {
        int[] var4 = ((lp) this).field_x.a(param0, (byte) 59);
        int[] var3 = var4;
        if (!(!((lp) this).field_x.field_i)) {
            qq.a(var4, 0, we.field_M, ((lp) this).field_y);
        }
        if (param1 <= 91) {
            return null;
        }
        return var4;
    }

    public lp() {
        this(4096);
    }

    final static int h(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_44_0 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (de.field_f == 13) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (~ia.field_C != ~de.field_f) {
                  break L1;
                } else {
                  L2: {
                    if (wq.field_H) {
                      stackOut_8_0 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      break L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      break L2;
                    }
                  }
                  wq.field_H = stackIn_9_0 != 0;
                  break L1;
                }
              }
              var1_int = 0;
              L3: while (true) {
                if (var1_int >= al.field_o.length) {
                  L4: {
                    if (param0 == 1) {
                      break L4;
                    } else {
                      lp.g(-4);
                      break L4;
                    }
                  }
                  stackOut_52_0 = -1;
                  stackIn_53_0 = stackOut_52_0;
                  break L0;
                } else {
                  L5: {
                    if (~al.field_o[var1_int] == ~de.field_f) {
                      L6: {
                        var2 = 0;
                        var3 = al.field_x[var1_int];
                        if (var3 != 2) {
                          if (var3 != 1) {
                            if (var3 == 3) {
                              L7: {
                                L8: {
                                  if (!cr.field_eb[86]) {
                                    break L8;
                                  } else {
                                    if (!cr.field_eb[82]) {
                                      break L8;
                                    } else {
                                      stackOut_33_0 = 1;
                                      stackIn_35_0 = stackOut_33_0;
                                      break L7;
                                    }
                                  }
                                }
                                stackOut_34_0 = 0;
                                stackIn_35_0 = stackOut_34_0;
                                break L7;
                              }
                              var2 = stackIn_35_0;
                              break L6;
                            } else {
                              if (0 == var3) {
                                L9: {
                                  L10: {
                                    if (cr.field_eb[86]) {
                                      break L10;
                                    } else {
                                      if (cr.field_eb[82]) {
                                        break L10;
                                      } else {
                                        stackOut_38_0 = 1;
                                        stackIn_40_0 = stackOut_38_0;
                                        break L9;
                                      }
                                    }
                                  }
                                  stackOut_39_0 = 0;
                                  stackIn_40_0 = stackOut_39_0;
                                  break L9;
                                }
                                var2 = stackIn_40_0;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          } else {
                            L11: {
                              L12: {
                                if (cr.field_eb[86]) {
                                  break L12;
                                } else {
                                  if (!cr.field_eb[82]) {
                                    break L12;
                                  } else {
                                    stackOut_28_0 = 1;
                                    stackIn_30_0 = stackOut_28_0;
                                    break L11;
                                  }
                                }
                              }
                              stackOut_29_0 = 0;
                              stackIn_30_0 = stackOut_29_0;
                              break L11;
                            }
                            var2 = stackIn_30_0;
                            break L6;
                          }
                        } else {
                          L13: {
                            L14: {
                              if (!cr.field_eb[86]) {
                                break L14;
                              } else {
                                if (cr.field_eb[82]) {
                                  break L14;
                                } else {
                                  stackOut_23_0 = 1;
                                  stackIn_25_0 = stackOut_23_0;
                                  break L13;
                                }
                              }
                            }
                            stackOut_24_0 = 0;
                            stackIn_25_0 = stackOut_24_0;
                            break L13;
                          }
                          var2 = stackIn_25_0;
                          break L6;
                        }
                      }
                      if (var2 != 0) {
                        var3 = var1_int / 12;
                        var4 = -(var3 * 12) + var1_int;
                        if (-8 + de.field_f < 0) {
                          var5 = 7 * var3 + var4;
                          mb.field_s = mb.field_s ^ 1 << var5;
                          if (fb.field_w[0].length > var5) {
                            fb.field_w[0][var5] = true;
                            break L5;
                          } else {
                            break L5;
                          }
                        } else {
                          var5 = var4 + -8 - -(5 * var3);
                          fb.field_w[1][var5] = true;
                          stackOut_44_0 = var5;
                          stackIn_45_0 = stackOut_44_0;
                          return stackIn_45_0;
                        }
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  var1_int++;
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "lp.A(" + param0 + 41);
        }
        return stackIn_53_0;
    }

    public static void g(int param0) {
        field_z = null;
        field_E = null;
        field_B = null;
        field_A = null;
        if (param0 != 86) {
            field_E = null;
        }
    }

    private lp(int param0) {
        super(0, true);
        ((lp) this).field_y = 4096;
        ((lp) this).field_y = param0;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            if (param0 == 110) {
              L1: {
                var4_int = param1;
                if (var4_int == 0) {
                  ((lp) this).field_y = (param2.h(-11) << 12) / 255;
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("lp.C(").append(param0).append(44).append(param1).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new int[]{1, 4, 2, 8};
        field_z = "<%0>/<%1>";
        field_E = new java.math.BigInteger("65537");
        field_A = "<col=DE9200>Cooperate</col>";
    }
}
