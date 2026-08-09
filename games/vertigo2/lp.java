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
        int[] var4 = this.field_x.a(param0, (byte) 59);
        int[] var3 = var4;
        if (!(!this.field_x.field_i)) {
            qq.a(var4, 0, we.field_M, this.field_y);
        }
        if (param1 <= 91) {
            return (int[]) null;
        }
        return var4;
    }

    public lp() {
        this(4096);
    }

    final static int h(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_62_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if ((de.field_f ^ -1) == -14) {
              stackIn_4_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (ia.field_C != de.field_f) {
                  break L1;
                } else {
                  L2: {
                    if (wq.field_H) {
                      stackIn_9_0 = 0;
                      break L2;
                    } else {
                      stackIn_9_0 = 1;
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
                  stackIn_62_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L5: {
                    if ((al.field_o[var1_int] ^ -1) == (de.field_f ^ -1)) {
                      L6: {
                        var2 = 0;
                        var3 = al.field_x[var1_int];
                        if (-3 != (var3 ^ -1)) {
                          if (-2 != (var3 ^ -1)) {
                            if (-4 == (var3 ^ -1)) {
                              L7: {
                                if (cr.field_eb[86]) {
                                  if (cr.field_eb[82]) {
                                    stackIn_42_0 = 1;
                                    break L7;
                                  } else {
                                    stackIn_42_0 = 0;
                                    break L7;
                                  }
                                } else {
                                  stackIn_42_0 = 0;
                                  break L7;
                                }
                              }
                              var2 = stackIn_42_0;
                              break L6;
                            } else {
                              if (0 == var3) {
                                L8: {
                                  if (!cr.field_eb[86]) {
                                    if (!cr.field_eb[82]) {
                                      stackIn_49_0 = 1;
                                      break L8;
                                    } else {
                                      stackIn_49_0 = 0;
                                      break L8;
                                    }
                                  } else {
                                    stackIn_49_0 = 0;
                                    break L8;
                                  }
                                }
                                var2 = stackIn_49_0;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          } else {
                            L9: {
                              if (!cr.field_eb[86]) {
                                if (cr.field_eb[82]) {
                                  stackIn_35_0 = 1;
                                  break L9;
                                } else {
                                  stackIn_35_0 = 0;
                                  break L9;
                                }
                              } else {
                                stackIn_35_0 = 0;
                                break L9;
                              }
                            }
                            var2 = stackIn_35_0;
                            break L6;
                          }
                        } else {
                          L10: {
                            if (cr.field_eb[86]) {
                              if (!cr.field_eb[82]) {
                                stackIn_28_0 = 1;
                                break L10;
                              } else {
                                stackIn_28_0 = 0;
                                break L10;
                              }
                            } else {
                              stackIn_28_0 = 0;
                              break L10;
                            }
                          }
                          var2 = stackIn_28_0;
                          break L6;
                        }
                      }
                      if (var2 != 0) {
                        var3 = var1_int / 12;
                        var4 = -(var3 * 12) + var1_int;
                        if (-1 < (-8 + de.field_f ^ -1)) {
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
                          stackIn_54_0 = var5;
                          decompiledRegionSelector0 = 1;
                          break L0;
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
          throw wn.a((Throwable) ((Object) var1), "lp.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_54_0;
          } else {
            return stackIn_62_0;
          }
        }
    }

    public static void g(int param0) {
        field_z = null;
        field_E = null;
        field_B = null;
        field_A = null;
        if (param0 != 86) {
            field_E = (java.math.BigInteger) null;
        }
    }

    private lp(int param0) {
        super(0, true);
        this.field_y = 4096;
        this.field_y = param0;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            if (param0 == 110) {
              L1: {
                var4_int = param1;
                if (-1 == (var4_int ^ -1)) {
                  this.field_y = (param2.h(-11) << 1696427084) / 255;
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("lp.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_B = new int[]{1, 4, 2, 8};
        field_z = "<%0>/<%1>";
        field_E = new java.math.BigInteger("65537");
        field_A = "<col=DE9200>Cooperate</col>";
    }
}
