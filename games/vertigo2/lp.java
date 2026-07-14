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
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_46_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        if ((de.field_f ^ -1) == -14) {
          return -1;
        } else {
          L0: {
            if (ia.field_C != de.field_f) {
              break L0;
            } else {
              L1: {
                if (wq.field_H) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              wq.field_H = stackIn_7_0 != 0;
              break L0;
            }
          }
          var1 = 0;
          L2: while (true) {
            if (var1 >= al.field_o.length) {
              L3: {
                if (param0 == 1) {
                  break L3;
                } else {
                  lp.g(-4);
                  break L3;
                }
              }
              return -1;
            } else {
              if (al.field_o[var1] == de.field_f) {
                L4: {
                  var2 = 0;
                  var3 = al.field_x[var1];
                  if (-3 != var3) {
                    if (-2 != var3) {
                      if (-4 == (var3 ^ -1)) {
                        L5: {
                          if (cr.field_eb[86]) {
                            if (cr.field_eb[82]) {
                              stackOut_37_0 = 1;
                              stackIn_39_0 = stackOut_37_0;
                              break L5;
                            } else {
                              stackOut_36_0 = 0;
                              stackIn_39_0 = stackOut_36_0;
                              break L5;
                            }
                          } else {
                            stackOut_34_0 = 0;
                            stackIn_39_0 = stackOut_34_0;
                            break L5;
                          }
                        }
                        var2 = stackIn_39_0;
                        break L4;
                      } else {
                        if (0 == var3) {
                          L6: {
                            if (!cr.field_eb[86]) {
                              if (!cr.field_eb[82]) {
                                stackOut_44_0 = 1;
                                stackIn_46_0 = stackOut_44_0;
                                break L6;
                              } else {
                                stackOut_43_0 = 0;
                                stackIn_46_0 = stackOut_43_0;
                                break L6;
                              }
                            } else {
                              stackOut_41_0 = 0;
                              stackIn_46_0 = stackOut_41_0;
                              break L6;
                            }
                          }
                          var2 = stackIn_46_0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      L7: {
                        if (!cr.field_eb[86]) {
                          if (cr.field_eb[82]) {
                            stackOut_30_0 = 1;
                            stackIn_32_0 = stackOut_30_0;
                            break L7;
                          } else {
                            stackOut_29_0 = 0;
                            stackIn_32_0 = stackOut_29_0;
                            break L7;
                          }
                        } else {
                          stackOut_27_0 = 0;
                          stackIn_32_0 = stackOut_27_0;
                          break L7;
                        }
                      }
                      var2 = stackIn_32_0;
                      break L4;
                    }
                  } else {
                    L8: {
                      if (cr.field_eb[86]) {
                        if (!cr.field_eb[82]) {
                          stackOut_23_0 = 1;
                          stackIn_25_0 = stackOut_23_0;
                          break L8;
                        } else {
                          stackOut_22_0 = 0;
                          stackIn_25_0 = stackOut_22_0;
                          break L8;
                        }
                      } else {
                        stackOut_20_0 = 0;
                        stackIn_25_0 = stackOut_20_0;
                        break L8;
                      }
                    }
                    var2 = stackIn_25_0;
                    break L4;
                  }
                }
                if (var2 != 0) {
                  var3 = var1 / 12;
                  var4 = -(var3 * 12) + var1;
                  if (-1 < (-8 + de.field_f ^ -1)) {
                    var5 = 7 * var3 + var4;
                    mb.field_s = mb.field_s ^ 1 << var5;
                    if (fb.field_w[0].length > var5) {
                      fb.field_w[0][var5] = true;
                      var1++;
                      continue L2;
                    } else {
                      var1++;
                      continue L2;
                    }
                  } else {
                    var5 = var4 + -8 - -(5 * var3);
                    fb.field_w[1][var5] = true;
                    return var5;
                  }
                } else {
                  var1++;
                  continue L2;
                }
              } else {
                var1++;
                continue L2;
              }
            }
          }
        }
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
        if (param0 != 110) {
            return;
        }
        int var4 = param1;
        if (!(-1 != (var4 ^ -1))) {
            ((lp) this).field_y = (param2.h(-11) << 1696427084) / 255;
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
