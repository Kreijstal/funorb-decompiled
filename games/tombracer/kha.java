/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Frame;

final class kha {
    static String field_a;
    int field_d;
    int[] field_c;
    int field_b;

    final int a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            ((kha) this).field_d = -57;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((kha) this).field_c == null) {
              break L2;
            } else {
              if (0 == ((kha) this).field_c.length) {
                break L2;
              } else {
                stackOut_4_0 = ((kha) this).field_c[-1 + ((kha) this).field_c.length];
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (((kha) this).field_c == null) {
          return 0;
        } else {
          if (0 != ((kha) this).field_c.length) {
            var3 = 1;
            L0: while (true) {
              if (var3 >= ((kha) this).field_c.length) {
                L1: {
                  if (param1 == -1) {
                    break L1;
                  } else {
                    field_a = null;
                    break L1;
                  }
                }
                return -1 + ((kha) this).field_c.length;
              } else {
                if (param0 >= ((kha) this).field_c[var3 - 1] - -((kha) this).field_c[var3] >> 1) {
                  var3++;
                  continue L0;
                } else {
                  return var3 + -1;
                }
              }
            }
          } else {
            return 0;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
            field_a = null;
        }
    }

    final static java.awt.Frame a(fia param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        dh[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        dh[] var10 = null;
        naa var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_25_0 = null;
        java.awt.Frame stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        Object stackOut_6_0 = null;
        java.awt.Frame stackOut_26_0 = null;
        Object stackOut_24_0 = null;
        Object stackOut_20_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0.a((byte) 69)) {
              L1: {
                if (param4 != 0) {
                  break L1;
                } else {
                  var10 = af.a(66, param0);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_14_0 = null;
                          stackIn_15_0 = stackOut_14_0;
                          return (java.awt.Frame) (Object) stackIn_15_0;
                        }
                      } else {
                        L3: {
                          if (var10[var8].field_a != param5) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (java.awt.Frame) (Object) stackIn_7_0;
                  }
                }
              }
              var11 = param0.a(param4, 0, param2, (byte) 66, param5);
              L4: while (true) {
                if (var11.field_b != 0) {
                  var7 = (java.awt.Frame) var11.field_f;
                  if (var7 != null) {
                    if (var11.field_b != 2) {
                      stackOut_26_0 = (java.awt.Frame) var7;
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    } else {
                      vf.a(31637, param0, var7);
                      stackOut_24_0 = null;
                      stackIn_25_0 = stackOut_24_0;
                      return (java.awt.Frame) (Object) stackIn_25_0;
                    }
                  } else {
                    stackOut_20_0 = null;
                    stackIn_21_0 = stackOut_20_0;
                    return (java.awt.Frame) (Object) stackIn_21_0;
                  }
                } else {
                  vja.a(0, 10L);
                  continue L4;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (java.awt.Frame) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("kha.A(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + 0 + 44 + param2 + 44 + 10 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_27_0;
    }

    static int b(int param0, int param1) {
        return param0 ^ param1;
    }

    kha(int param0, int param1, int param2) {
        ((kha) this).field_b = param1;
        ((kha) this).field_d = param0;
        ((kha) this).field_c = new int[param2 + 1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "500+";
    }
}
