/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class wt extends fd implements jp {
    static int field_v;
    static int field_x;
    static ut field_y;
    static ut[] field_z;
    fd[] field_w;
    static wu field_A;

    private final boolean a(fd param0) {
        RuntimeException var4 = null;
        int var4_int = 0;
        fd var5 = null;
        fd var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            if (((wt) this).field_w == null) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var4_int = 0;
              L1: while (true) {
                if (var4_int >= ((wt) this).field_w.length) {
                  stackOut_25_0 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  break L0;
                } else {
                  L2: {
                    var5 = ((wt) this).field_w[var4_int];
                    if (var5 == null) {
                      break L2;
                    } else {
                      if (var5.b(100)) {
                        var4_int = var4_int + 1;
                        L3: while (true) {
                          if (var4_int >= ((wt) this).field_w.length) {
                            break L2;
                          } else {
                            L4: {
                              var6 = ((wt) this).field_w[var4_int];
                              if (null != var6) {
                                if (!var6.a(param0, 0)) {
                                  break L4;
                                } else {
                                  return true;
                                }
                              } else {
                                break L4;
                              }
                            }
                            var4_int = var4_int + 1;
                            continue L3;
                          }
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("wt.I(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + -28 + 44 + 1 + 41);
        }
        return stackIn_26_0 != 0;
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 >= 10) {
          L0: {
            int discarded$2 = 1;
            if (this.a() == null) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 17883) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$2 = ((wt) this).a(125, (fd) null, 11, -44, 107, -118, 34);
                break L1;
              }
            }
            L2: {
              if (((wt) this).a(1, param3, param2, param1)) {
                ((wt) this).b(param1, param3, param2, param0 ^ -3421);
                this.a(param2, 10, param1, param3);
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_6_0 = (StringBuilder) param3;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("wt.GA(").append(param0).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_7_0;
    }

    final static wh a(int param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        if (pn.field_z.a(false) >= 16) {
            return null;
        }
        int var7 = -79 % ((-85 - param5) / 32);
        wh var6 = new wh(param3, param0, param4, param2, param1);
        pn.field_z.a((gn) (Object) var6, 3);
        return var6;
    }

    public static void b() {
        field_y = null;
        field_z = null;
        field_A = null;
    }

    private final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        fd var7 = null;
        int var8 = 0;
        int var9 = 0;
        fd[] var11 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            if (null == ((wt) this).field_w) {
              return;
            } else {
              var11 = ((wt) this).field_w;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var11.length) {
                  break L0;
                } else {
                  var7 = var11[var6];
                  StringBuilder discarded$29 = param3.append(10);
                  var8 = 0;
                  L2: while (true) {
                    if (param2 < var8) {
                      L3: {
                        if (var7 != null) {
                          StringBuilder discarded$30 = var7.a(17883, param2 - -1, param0, param3);
                          break L3;
                        } else {
                          StringBuilder discarded$31 = param3.append("null");
                          break L3;
                        }
                      }
                      var6++;
                      continue L1;
                    } else {
                      StringBuilder discarded$32 = param3.append(32);
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("wt.M(");
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          L5: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(10).append(44).append(param2).append(44);
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    private final boolean a(int param0, fd param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            stackOut_3_0 = this.a(-17305, param1, 1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("wt.J(").append(9).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((wt) this).a((byte) -118);
    }

    private final boolean b(fd param0) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            int discarded$4 = 1;
            int discarded$5 = -28;
            stackOut_2_0 = this.a(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("wt.L(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 87 + 41);
        }
        return stackIn_3_0;
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        fd[] var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        int var6 = 0;
        fd var7 = null;
        int var8 = 0;
        fd[] var9 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_19_0 = false;
        boolean stackOut_17_0 = false;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            if (null != ((wt) this).field_w) {
              var9 = ((wt) this).field_w;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var9.length) {
                  L2: {
                    if (param1 < -60) {
                      break L2;
                    } else {
                      field_v = -42;
                      break L2;
                    }
                  }
                  var5_int = param3;
                  if (80 == var5_int) {
                    L3: {
                      if (!ne.field_G[81]) {
                        int discarded$1 = 87;
                        stackOut_19_0 = this.b(param2);
                        stackIn_20_0 = stackOut_19_0;
                        break L3;
                      } else {
                        stackOut_17_0 = this.a(9, param2);
                        stackIn_20_0 = stackOut_17_0;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  L4: {
                    var7 = var9[var6];
                    if (null == var7) {
                      break L4;
                    } else {
                      if (!var7.b(35)) {
                        break L4;
                      } else {
                        if (!var7.a(param0, (byte) -123, param2, param3)) {
                          break L4;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5_ref;
            stackOut_21_1 = new StringBuilder().append("wt.E(").append(param0).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param3 + 41);
        }
        return stackIn_20_0;
    }

    final static void a(int param0, nu param1, int param2, ut[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            nw.field_b = param1;
            ek.field_G = param2;
            tm.field_n = param3;
            L1: {
              if (ek.field_G == -2) {
                af.field_a = null;
                break L1;
              } else {
                af.field_a = new dt[4];
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= 4) {
                    break L1;
                  } else {
                    af.field_a[var4_int] = new dt((gm) (Object) nw.field_b.field_P[nw.field_b.field_g[ek.field_G].field_p][var4_int - -1], var4_int + 1);
                    var4_int++;
                    continue L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("wt.G(").append(0).append(44);
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param2).append(44);
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final static boolean a(tj param0, nl param1, byte param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        nl stackIn_17_0 = null;
        nl stackIn_19_0 = null;
        nl stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        nl stackOut_16_0 = null;
        nl stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        nl stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (-1 != param0.field_m) {
                break L1;
              } else {
                if (0 == param0.field_h) {
                  break L1;
                } else {
                  var4_int = -(param1.field_o >> 1) + 20;
                  L2: {
                    var5 = (param1.field_w + -param0.field_p) / param0.field_h;
                    var5 = 9 * var5 >> 3;
                    if (var5 <= 2) {
                      break L2;
                    } else {
                      if (var5 >= var4_int) {
                        break L2;
                      } else {
                        L3: {
                          var6 = param0.field_t - -(param0.field_q * var5);
                          var7 = Math.abs(-var6 + param1.field_M);
                          if (var6 <= 24379392) {
                            break L3;
                          } else {
                            if (var6 < 34275328) {
                              if (-28 + (var7 >> 16) > 12) {
                                param1.c(var6, 5);
                                stackOut_21_0 = 1;
                                stackIn_22_0 = stackOut_21_0;
                                return stackIn_22_0 != 0;
                              } else {
                                L4: {
                                  stackOut_16_0 = (nl) param1;
                                  stackIn_19_0 = stackOut_16_0;
                                  stackIn_17_0 = stackOut_16_0;
                                  if (param1.field_M < var6) {
                                    stackOut_19_0 = (nl) (Object) stackIn_19_0;
                                    stackOut_19_1 = 8;
                                    stackIn_20_0 = stackOut_19_0;
                                    stackIn_20_1 = stackOut_19_1;
                                    break L4;
                                  } else {
                                    stackOut_17_0 = (nl) (Object) stackIn_17_0;
                                    stackOut_17_1 = 2;
                                    stackIn_20_0 = stackOut_17_0;
                                    stackIn_20_1 = stackOut_17_1;
                                    break L4;
                                  }
                                }
                                stackIn_20_0.field_G = stackIn_20_1;
                                return true;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        param1.field_G = 0;
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      }
                    }
                  }
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  break L0;
                }
              }
            }
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("wt.F(");
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L5;
            }
          }
          L6: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L6;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + -75 + 44 + param3 + 41);
        }
        return stackIn_24_0 != 0;
    }

    final static wn a(int param0, String[] param1) {
        wn var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        wn stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        wn stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 <= -108) {
              var2 = new wn(false);
              var2.field_f = param1;
              stackOut_3_0 = (wn) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (wn) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("wt.A(").append(param0).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_4_0;
    }

    abstract void a(byte param0);

    void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        fd var6 = null;
        int var7 = 0;
        L0: {
          var7 = Kickabout.field_G;
          if (0 != param0) {
            break L0;
          } else {
            if (null == ((wt) this).field_r) {
              break L0;
            } else {
              ((wt) this).field_r.a(126, true, param3, (fd) this, param2);
              break L0;
            }
          }
        }
        L1: {
          if (param1 == 65) {
            break L1;
          } else {
            field_x = -84;
            break L1;
          }
        }
        L2: {
          if (((wt) this).field_w != null) {
            var5 = ((wt) this).field_w.length + -1;
            L3: while (true) {
              if (var5 < 0) {
                break L2;
              } else {
                var6 = ((wt) this).field_w[var5];
                if (null != var6) {
                  var6.a(param0, 65, param2 - -((wt) this).field_t, ((wt) this).field_g + param3);
                  var5--;
                  continue L3;
                } else {
                  var5--;
                  continue L3;
                }
              }
            }
          } else {
            break L2;
          }
        }
    }

    final String f(int param0) {
        fd[] var2 = null;
        int var3 = 0;
        fd var4 = null;
        String var5 = null;
        int var6 = 0;
        fd[] var7 = null;
        var6 = Kickabout.field_G;
        if (((wt) this).field_w != null) {
          L0: {
            var7 = ((wt) this).field_w;
            var2 = var7;
            if (param0 == -1) {
              break L0;
            } else {
              field_A = null;
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var7.length > var3) {
              var4 = var7[var3];
              if (var4 != null) {
                var5 = var4.f(-1);
                if (null != var5) {
                  return var5;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final int f(byte param0) {
        int var2 = 0;
        fd[] var3 = null;
        int var4 = 0;
        fd var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        var7 = Kickabout.field_G;
        var2 = 0;
        var3 = ((wt) this).field_w;
        var4 = 0;
        L0: while (true) {
          if (var3.length <= var4) {
            L1: {
              if (param0 == 118) {
                break L1;
              } else {
                var8 = null;
                boolean discarded$1 = ((wt) this).a(20, (fd) null, 22, -126, -123, 63, -127);
                break L1;
              }
            }
            return var2;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.f((byte) 118);
              if (var2 < var6) {
                var2 = var6;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    wt(int param0, int param1, int param2, int param3, gj param4) {
        super(param0, param1, param2, param3, param4, (jv) null);
    }

    final boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        fd[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        fd var10 = null;
        int var11 = 0;
        fd[] var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            if (((wt) this).field_w != null) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_v = -64;
                  break L1;
                }
              }
              var12 = ((wt) this).field_w;
              var8 = var12;
              var9 = 0;
              L2: while (true) {
                if (var9 >= var12.length) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L0;
                } else {
                  L3: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L3;
                    } else {
                      if (var10.a(param0, param1 - -((wt) this).field_g, param2, param3, param4, param5 - -((wt) this).field_t, param6)) {
                        stackOut_12_0 = 1;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0 != 0;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var9++;
                  continue L2;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var8_ref;
            stackOut_17_1 = new StringBuilder().append("wt.EA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_16_0 != 0;
    }

    private final fd a() {
        fd[] var2 = null;
        int var3 = 0;
        fd var4 = null;
        int var5 = 0;
        fd[] var6 = null;
        var5 = Kickabout.field_G;
        if (null != ((wt) this).field_w) {
          var6 = ((wt) this).field_w;
          var2 = var6;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              return null;
            } else {
              var4 = var6[var3];
              if (null != var4) {
                if (var4.b(100)) {
                  return var4;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        fd[] var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        fd var9 = null;
        int var10 = 0;
        fd[] var11 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            if (null != ((wt) this).field_w) {
              var11 = ((wt) this).field_w;
              var7 = var11;
              var8 = 0;
              L1: while (true) {
                if (var11.length <= var8) {
                  L2: {
                    if (param4 == -1) {
                      break L2;
                    } else {
                      wh discarded$1 = wt.a(-45, false, false, 110, 69, -102);
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  L3: {
                    var9 = var11[var8];
                    if (var9 == null) {
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var7_ref;
            stackOut_12_1 = new StringBuilder().append("wt.T(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    void a(byte param0, fd param1, int param2, int param3) {
        fd[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        fd var7 = null;
        int var8 = 0;
        fd[] var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            super.a(param0, param1, param2, param3);
            if (null != ((wt) this).field_w) {
              var9 = ((wt) this).field_w;
              var5 = var9;
              var6 = 0;
              L1: while (true) {
                if (var6 >= var9.length) {
                  break L0;
                } else {
                  L2: {
                    var7 = var9[var6];
                    if (var7 == null) {
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5_ref;
            stackOut_9_1 = new StringBuilder().append("wt.P(").append(param0).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final boolean a(int param0, fd param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        fd var5 = null;
        fd var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            if (((wt) this).field_w != null) {
              var4_int = -1 + ((wt) this).field_w.length;
              L1: while (true) {
                if (var4_int < 0) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L0;
                } else {
                  L2: {
                    var5 = ((wt) this).field_w[var4_int];
                    if (null == var5) {
                      break L2;
                    } else {
                      if (!var5.b(92)) {
                        break L2;
                      } else {
                        var4_int = var4_int - 1;
                        L3: while (true) {
                          if (var4_int < 0) {
                            break L2;
                          } else {
                            L4: {
                              var6 = ((wt) this).field_w[var4_int];
                              if (var6 == null) {
                                break L4;
                              } else {
                                if (var6.a(param1, 0)) {
                                  stackOut_16_0 = 1;
                                  stackIn_17_0 = stackOut_16_0;
                                  return stackIn_17_0 != 0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var4_int = var4_int - 1;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var4_int--;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("wt.K(").append(-17305).append(44);
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + 1 + 41);
        }
        return stackIn_21_0 != 0;
    }

    final void g(int param0) {
        fd[] var2 = null;
        int var3 = 0;
        fd var4 = null;
        int var5 = 0;
        fd[] var6 = null;
        var5 = Kickabout.field_G;
        var6 = ((wt) this).field_w;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          if (var6.length <= var3) {
            L1: {
              if (param0 == 84) {
                break L1;
              } else {
                field_z = null;
                break L1;
              }
            }
            return;
          } else {
            var4 = var6[var3];
            if (null != var4) {
              var4.g(84);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final boolean a(int param0, fd param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        fd[] var8_array = null;
        int var9 = 0;
        fd var10 = null;
        int var11 = 0;
        fd[] var12 = null;
        int stackIn_5_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            if (null == ((wt) this).field_w) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var12 = ((wt) this).field_w;
              var8_array = var12;
              var9 = 0;
              L1: while (true) {
                if (var9 >= var12.length) {
                  var9 = -27 / ((param6 - 63) / 56);
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  L2: {
                    var10 = var12[var9];
                    if (var10 == null) {
                      break L2;
                    } else {
                      if (!var10.b(127)) {
                        break L2;
                      } else {
                        if (var10.a(param0, param1, param2, param3, param4, param5, -87)) {
                          stackOut_13_0 = 1;
                          stackIn_14_0 = stackOut_13_0;
                          return stackIn_14_0 != 0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  var9++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8;
            stackOut_18_1 = new StringBuilder().append("wt.BA(").append(param0).append(44);
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_17_0 != 0;
    }

    final boolean a(fd param0, int param1) {
        fd[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        fd var5 = null;
        int var6 = 0;
        fd[] var7 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            var7 = ((wt) this).field_w;
            var3 = var7;
            var4 = param1;
            L1: while (true) {
              if (var4 >= var7.length) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (null == var5) {
                    break L2;
                  } else {
                    if (var5.a(param0, param1)) {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    } else {
                      break L2;
                    }
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("wt.HA(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_11_0 != 0;
    }

    static {
    }
}
