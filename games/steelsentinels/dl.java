/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class dl extends lh implements lm {
    static byte[] field_O;
    static String[][] field_N;
    static int field_M;
    static ka field_J;
    ul field_K;
    static String[] field_I;
    static String[][] field_H;
    static byte[][] field_L;
    static int field_G;

    lh h(int param0) {
        jc var2 = null;
        lh var3 = null;
        int var4 = 0;
        L0: {
          var4 = SteelSentinels.field_G;
          var2 = new jc(((dl) this).field_K);
          if (param0 == -1) {
            break L0;
          } else {
            boolean discarded$2 = dl.f(-120);
            break L0;
          }
        }
        var3 = (lh) (Object) var2.b(2);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.d(~param0)) {
              var3 = (lh) (Object) var2.d(param0 + 3);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    boolean a(int param0, int param1, char param2, lh param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        jc var8 = null;
        lh var9 = null;
        int stackIn_9_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        boolean stackOut_14_0 = false;
        boolean stackOut_13_0 = false;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var8 = new jc(((dl) this).field_K);
              var9 = (lh) (Object) var8.b(2);
              if (param0 == 30373) {
                break L1;
              } else {
                int discarded$2 = dl.a(76, 69, -95, -115);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b((byte) -12)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.d(0)) {
                        break L4;
                      } else {
                        if (var9.a(param0, param1, param2, param3)) {
                          stackOut_8_0 = 1;
                          stackIn_9_0 = stackOut_8_0;
                          return stackIn_9_0 != 0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9 = (lh) (Object) var8.d(2);
                    continue L2;
                  }
                }
              }
              var6 = param1;
              if (var6 != 80) {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                break L0;
              } else {
                L5: {
                  if (fc.field_e[81]) {
                    stackOut_14_0 = ((dl) this).b(param3, 79);
                    stackIn_15_0 = stackOut_14_0;
                    break L5;
                  } else {
                    stackOut_13_0 = ((dl) this).b(-11963, param3);
                    stackIn_15_0 = stackOut_13_0;
                    break L5;
                  }
                }
                return stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("dl.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final void a(lh param0, int param1) {
        try {
            if (param1 > -82) {
                Object var4 = null;
                boolean discarded$0 = ((dl) this).a(-93, (lh) null);
            }
            ((dl) this).field_K.a(3, (ck) (Object) param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "dl.IC(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param2 - -param3 <= pb.field_c) {
            return param2;
        }
        if (param1 != 127) {
            boolean discarded$0 = dl.f(-101);
        }
        if (-param3 + param0 + param2 >= 0) {
            return -param3 + (param0 + param2);
        }
        return pb.field_c - param3;
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = SteelSentinels.field_G;
        if (param3 == 0) {
            if (!(((dl) this).field_p == null)) {
                ((dl) this).field_p.a(param2, (lh) this, (byte) -30, true, param0);
            }
        }
        jc var5 = new jc(((dl) this).field_K);
        lh var6 = (lh) (Object) var5.c(2);
        while (var6 != null) {
            var6.a(((dl) this).field_z + param0, (byte) -109, ((dl) this).field_o + param2, param3);
            var6 = (lh) (Object) var5.a(true);
        }
        if (param1 > -99) {
            Object var8 = null;
            this.a((byte) -85, (Hashtable) null, (StringBuilder) null, 76);
        }
    }

    dl(int param0, int param1, int param2, int param3, qk param4) {
        super(param0, param1, param2, param3, param4, (tn) null);
        ((dl) this).field_K = new ul();
    }

    void a(int param0, int param1, lh param2, int param3) {
        jc var5 = null;
        RuntimeException var5_ref = null;
        lh var6 = null;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            super.a(param0, 108, param2, param3);
            var5 = new jc(((dl) this).field_K);
            if (param1 > 56) {
              var6 = (lh) (Object) var5.b(2);
              L1: while (true) {
                L2: {
                  if (var6 == null) {
                    break L2;
                  } else {
                    if (!var6.b((byte) -12)) {
                      break L2;
                    } else {
                      var6.a(((dl) this).field_o + param0, 112, param2, param3 + ((dl) this).field_z);
                      var6 = (lh) (Object) var5.d(2);
                      continue L1;
                    }
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5_ref;
            stackOut_8_1 = new StringBuilder().append("dl.H(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, lh param1) {
        jc var3 = null;
        RuntimeException var3_ref = null;
        lh var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                var6 = null;
                StringBuilder discarded$2 = ((dl) this).a((Hashtable) null, (StringBuilder) null, (byte) -47, 62);
                break L1;
              }
            }
            var3 = new jc(((dl) this).field_K);
            var4 = (lh) (Object) var3.b(2);
            L2: while (true) {
              if (var4 == null) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                if (var4.a(1, param1)) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  var4 = (lh) (Object) var3.d(param0 + 1);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("dl.E(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final boolean b(int param0, lh param1) {
        RuntimeException var3 = null;
        lh var4 = null;
        jc var5 = null;
        lh var6 = null;
        int var7 = 0;
        jc var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            if (!((dl) this).field_K.f(param0 + 11970)) {
              var8 = new jc(((dl) this).field_K);
              var4 = (lh) (Object) var8.b(2);
              L1: while (true) {
                if (var4 == null) {
                  if (param0 == -11963) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    field_L = null;
                    return false;
                  }
                } else {
                  L2: {
                    if (!var4.d(0)) {
                      break L2;
                    } else {
                      var5 = new jc(((dl) this).field_K);
                      ck discarded$2 = var5.a(false, (ck) (Object) var4);
                      var6 = (lh) (Object) var5.d(2);
                      L3: while (true) {
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (var6.a(param0 ^ -11964, param1)) {
                            stackOut_11_0 = 1;
                            stackIn_12_0 = stackOut_11_0;
                            return stackIn_12_0 != 0;
                          } else {
                            var6 = (lh) (Object) var5.d(2);
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                  var4 = (lh) (Object) var8.d(param0 + 11965);
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
          L4: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("dl.JC(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
        return stackIn_18_0 != 0;
    }

    public static void g(int param0) {
        field_J = null;
        field_O = null;
        field_L = null;
        field_N = null;
        field_H = null;
        field_I = null;
    }

    final StringBuilder a(Hashtable param0, StringBuilder param1, byte param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param2 < -104) {
              L1: {
                if (!((dl) this).a(param1, (byte) -91, param3, param0)) {
                  break L1;
                } else {
                  ((dl) this).a(param3, param0, false, param1);
                  this.a((byte) 77, param0, param1, param3);
                  break L1;
                }
              }
              stackOut_5_0 = (StringBuilder) param1;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (StringBuilder) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("dl.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) -116, param2, param3, param4);
        if (param1 > -71) {
            field_N = null;
        }
        this.f((byte) 45);
    }

    final boolean b(lh param0, int param1) {
        jc var3 = null;
        RuntimeException var3_ref = null;
        lh var4 = null;
        jc var5 = null;
        lh var6 = null;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1 > 55) {
                break L1;
              } else {
                field_O = null;
                break L1;
              }
            }
            if (!((dl) this).field_K.f(7)) {
              var3 = new jc(((dl) this).field_K);
              var4 = (lh) (Object) var3.c(2);
              L2: while (true) {
                if (var4 == null) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L3: {
                    if (var4.d(0)) {
                      var5 = new jc(((dl) this).field_K);
                      ck discarded$2 = var5.a(24192, (ck) (Object) var4);
                      var6 = (lh) (Object) var5.a(true);
                      L4: while (true) {
                        if (var6 == null) {
                          break L3;
                        } else {
                          if (var6.a(1, param0)) {
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            return stackIn_15_0 != 0;
                          } else {
                            var6 = (lh) (Object) var5.a(true);
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4 = (lh) (Object) var3.a(true);
                  continue L2;
                }
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3_ref;
            stackOut_20_1 = new StringBuilder().append("dl.GC(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final static al g(byte param0) {
        return (al) (Object) new gl();
    }

    final void a(byte param0, int param1, int param2, int param3, lh param4, int param5) {
        jc var7 = null;
        RuntimeException var7_ref = null;
        lh var8 = null;
        int var9 = 0;
        int var10 = 0;
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
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            var7 = new jc(((dl) this).field_K);
            var8 = (lh) (Object) var7.b(2);
            var9 = -102 / ((param0 - 36) / 32);
            L1: while (true) {
              L2: {
                if (var8 == null) {
                  break L2;
                } else {
                  if (!var8.b((byte) -12)) {
                    break L2;
                  } else {
                    var8.a((byte) -128, param1, ((dl) this).field_z + param2, param3 + ((dl) this).field_o, param4, param5);
                    var8 = (lh) (Object) var7.d(2);
                    continue L1;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var7_ref;
            stackOut_6_1 = new StringBuilder().append("dl.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param4 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              pb.d(param1, param5, param2, param0, param4);
              pb.d(param2, param0, param7, param6, param4);
              pb.d(param7, param6, param1, param5, param4);
              if (param0 >= param5) {
                break L1;
              } else {
                var8_int = param1;
                param1 = param2;
                param2 = var8_int;
                var8_int = param5;
                param5 = param0;
                param0 = var8_int;
                break L1;
              }
            }
            L2: {
              if (param6 < param5) {
                var8_int = param1;
                param1 = param7;
                param7 = var8_int;
                var8_int = param5;
                param5 = param6;
                param6 = var8_int;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 > param6) {
                var8_int = param2;
                param2 = param7;
                param7 = var8_int;
                var8_int = param0;
                param0 = param6;
                param6 = var8_int;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2 < param7) {
                var10 = param5;
                L5: while (true) {
                  if (param0 <= var10) {
                    var10 = param0;
                    L6: while (true) {
                      if (var10 >= param6) {
                        break L4;
                      } else {
                        var9 = (-param5 + var10) * (-param1 + param7) / (-param5 + param6) + param1;
                        var8_int = param2 - -((param7 + -param2) * (-param0 + var10) / (param6 - param0));
                        pb.g(var8_int, var10, 1 + (-var8_int + var9), param4);
                        var10++;
                        continue L6;
                      }
                    }
                  } else {
                    var9 = param1 - -((var10 - param5) * (-param1 + param7) / (param6 + -param5));
                    var8_int = (param2 + -param1) * (-param5 + var10) / (-param5 + param0) + param1;
                    pb.g(var8_int, var10, -var8_int + (var9 + 1), param4);
                    var10++;
                    continue L5;
                  }
                }
              } else {
                var10 = param5;
                L7: while (true) {
                  if (param0 <= var10) {
                    var10 = param0;
                    L8: while (true) {
                      if (param6 <= var10) {
                        break L4;
                      } else {
                        var9 = param2 + (-param2 + param7) * (var10 + -param0) / (param6 + -param0);
                        var8_int = param1 + (var10 + -param5) * (-param1 + param7) / (-param5 + param6);
                        pb.g(var8_int, var10, 1 + -var8_int + var9, param4);
                        var10++;
                        continue L8;
                      }
                    }
                  } else {
                    var9 = (param2 + -param1) * (-param5 + var10) / (param0 - param5) + param1;
                    var8_int = (param7 + -param1) * (var10 - param5) / (-param5 + param6) + param1;
                    pb.g(var8_int, var10, 1 + -var8_int + var9, param4);
                    var10++;
                    continue L7;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var8, "dl.EC(" + param0 + ',' + param1 + ',' + param2 + ',' + true + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        jc var8 = null;
        RuntimeException var8_ref = null;
        lh var9 = null;
        int var10 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var8 = new jc(((dl) this).field_K);
              if (param5) {
                break L1;
              } else {
                field_M = 17;
                break L1;
              }
            }
            var9 = (lh) (Object) var8.b(2);
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b((byte) -12)) {
                    break L3;
                  } else {
                    if (!var9.a(param0, param1, ((dl) this).field_o + param2, param3, ((dl) this).field_z + param4, true, param6)) {
                      var9 = (lh) (Object) var8.d(2);
                      continue L2;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0 != 0;
                    }
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var8_ref;
            stackOut_12_1 = new StringBuilder().append("dl.I(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final boolean a(byte param0, int param1, int param2, int param3, lh param4, int param5, int param6) {
        jc var8 = null;
        RuntimeException var8_ref = null;
        lh var9 = null;
        int var10 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 <= -34) {
                break L1;
              } else {
                ((dl) this).a(-58, (byte) 107, -39, -11);
                break L1;
              }
            }
            var8 = new jc(((dl) this).field_K);
            var9 = (lh) (Object) var8.b(2);
            L2: while (true) {
              L3: {
                if (var9 == null) {
                  break L3;
                } else {
                  if (!var9.b((byte) -12)) {
                    break L3;
                  } else {
                    L4: {
                      if (!var9.d(0)) {
                        break L4;
                      } else {
                        if (var9.a((byte) -83, param1, param2, param3, param4, param5, param6)) {
                          stackOut_9_0 = 1;
                          stackIn_10_0 = stackOut_9_0;
                          return stackIn_10_0 != 0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var9 = (lh) (Object) var8.d(2);
                    continue L2;
                  }
                }
              }
              stackOut_12_0 = 0;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var8_ref;
            stackOut_14_1 = new StringBuilder().append("dl.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param4 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final static boolean f(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = (Object) (Object) wc.field_i;
        synchronized (var1_ref) {
          L0: {
            if (ad.field_b != mn.field_y) {
              L1: {
                if (param0 == 22759) {
                  break L1;
                } else {
                  field_G = -52;
                  break L1;
                }
              }
              ei.field_q = kk.field_b[ad.field_b];
              de.field_c = pi.field_b[ad.field_b];
              ad.field_b = 127 & 1 + ad.field_b;
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    final boolean d(int param0) {
        if (param0 != 0) {
            field_J = null;
        }
        return ((dl) this).h(-1) != null ? true : false;
    }

    final void d(byte param0) {
        int var4 = SteelSentinels.field_G;
        if (param0 != -45) {
            field_N = null;
        }
        jc var2 = new jc(((dl) this).field_K);
        lh var3 = (lh) (Object) var2.b(param0 + 47);
        while (var3 != null) {
            var3.d((byte) -45);
            var3 = (lh) (Object) var2.d(2);
        }
    }

    final static boolean a(long param0, int[] param1, int param2, int param3, String param4) {
        mg var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (vk.a(param0, param1, param4, param3, -21)) {
              L1: {
                if (param3 != 1) {
                  break L1;
                } else {
                  param3 = 0;
                  break L1;
                }
              }
              ib.field_b = param3;
              en.field_e = param4;
              var7 = (CharSequence) (Object) param4;
              bk.field_U = ui.a(1, var7);
              ti.field_p = param0;
              if (param2 < -113) {
                var6 = um.a(ea.field_f, fb.field_l, pg.field_u, param1, -90);
                pa.a(12105, var6);
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6_ref;
            stackOut_10_1 = new StringBuilder().append("dl.HC(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    private final void a(byte param0, Hashtable param1, StringBuilder param2, int param3) {
        jc var5 = null;
        RuntimeException var5_ref = null;
        lh var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            var5 = new jc(((dl) this).field_K);
            var7 = -34 % ((-2 - param0) / 43);
            var6 = (lh) (Object) var5.b(2);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                StringBuilder discarded$12 = param2.append('\n');
                var8 = 0;
                L2: while (true) {
                  if (param3 < var8) {
                    StringBuilder discarded$13 = var6.a(param1, param2, (byte) -114, 1 + param3);
                    var6 = (lh) (Object) var5.d(2);
                    continue L1;
                  } else {
                    StringBuilder discarded$14 = param2.append(' ');
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5_ref;
            stackOut_8_1 = new StringBuilder().append("dl.DC(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
    }

    final int b(boolean param0) {
        int var5 = 0;
        int var6 = SteelSentinels.field_G;
        int var2 = 0;
        if (!param0) {
            field_L = null;
        }
        jc var3 = new jc(((dl) this).field_K);
        lh var4 = (lh) (Object) var3.b(2);
        while (var4 != null) {
            var5 = var4.b(true);
            if (var5 > var2) {
                var2 = var5;
            }
            var4 = (lh) (Object) var3.d(2);
        }
        return var2;
    }

    String e(int param0) {
        jc var2 = null;
        lh var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        var2 = new jc(((dl) this).field_K);
        if (param0 == 0) {
          var3 = (lh) (Object) var2.b(2);
          L0: while (true) {
            if (var3 != null) {
              var4 = var3.e(param0);
              if (var4 != null) {
                return var4;
              } else {
                var3 = (lh) (Object) var2.d(2);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    private final void f(byte param0) {
        int var4 = SteelSentinels.field_G;
        jc var2 = new jc(((dl) this).field_K);
        lh var3 = (lh) (Object) var2.b(2);
        while (var3 != null) {
            var3.e((byte) 102);
            var3 = (lh) (Object) var2.d(2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new String[][]{new String[12], new String[15], null, new String[7], null, new String[5], null, new String[7], null, new String[6], null};
        field_H = new String[][]{new String[24], new String[30], new String[0], new String[14], new String[0], new String[8], new String[0], new String[14], new String[0], new String[14]};
        field_I = new String[]{"never", "once", "twice", "<%0> times"};
    }
}
