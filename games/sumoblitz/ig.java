/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ig {
    static jn field_b;
    static pl field_a;

    final static boolean b(int param0) {
        RuntimeException var1 = null;
        ah[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var11 = 0;
        wc var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (ku.field_J != null) {
              if (an.field_a != -1) {
                if (ku.field_J.length <= an.field_a) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  var12 = ku.field_J[an.field_a];
                  var2 = var12.field_b;
                  var3 = 0;
                  var4 = 26 / ((67 - param0) / 42);
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var2.length) {
                      g.field_c = g.field_c + 1;
                      if (var3 == 0) {
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        break L0;
                      } else {
                        return false;
                      }
                    } else {
                      L2: {
                        if (var2[var5] == null) {
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "ig.A(" + param0 + 41);
        }
        return stackIn_19_0 != 0;
    }

    final static void a(int param0) {
        if (param0 != 22075) {
            ig.a(66);
        }
        lf.a(0, 256);
    }

    final static int a(String param0, boolean param1) {
        RuntimeException var2 = null;
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        RuntimeException var6_ref_RuntimeException = null;
        int var6 = 0;
        byte[] var7 = null;
        Throwable var8 = null;
        int var8_int = 0;
        int var9 = 0;
        String var10 = null;
        File var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (!qn.field_e.field_f) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (mi.field_b.containsKey((Object) (Object) param0)) {
                stackOut_7_0 = 100;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var10 = ua.a((byte) 53, param0);
                if (var10 == null) {
                  stackOut_11_0 = -1;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  var3 = pn.field_n + var10;
                  if (ha.field_e.b("", var3, -1)) {
                    if (ha.field_e.a(var3, 100)) {
                      var19 = ha.field_e.a("", var3, -1);
                      var17 = var19;
                      var15 = var17;
                      var13 = var15;
                      var4 = var13;
                      var5 = null;
                      try {
                        L1: {
                          var11 = el.a(var10, (byte) -8);
                          break L1;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        var6_ref_RuntimeException = (RuntimeException) (Object) decompiledCaughtException;
                        stackOut_22_0 = -1;
                        stackIn_23_0 = stackOut_22_0;
                        return stackIn_23_0;
                      }
                      L2: {
                        if (var4 == null) {
                          break L2;
                        } else {
                          if (var11 == null) {
                            break L2;
                          } else {
                            L3: {
                              L4: {
                                var6 = 1;
                                var18 = si.a(var11, (byte) -23);
                                var16 = var18;
                                var14 = var16;
                                var12 = var14;
                                var7 = var12;
                                if (var7 == null) {
                                  break L4;
                                } else {
                                  if (var18.length == var19.length) {
                                    var8_int = 0;
                                    L5: while (true) {
                                      if (var18.length <= var8_int) {
                                        break L3;
                                      } else {
                                        if (var18[var8_int] != var19[var8_int]) {
                                          var6 = 0;
                                          break L3;
                                        } else {
                                          var8_int++;
                                          continue L5;
                                        }
                                      }
                                    }
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              var6 = 0;
                              break L3;
                            }
                            try {
                              L6: {
                                L7: {
                                  if (var6 != 0) {
                                    break L7;
                                  } else {
                                    boolean discarded$1 = qn.field_e.a(var19, -31357, var11);
                                    break L7;
                                  }
                                }
                                break L6;
                              }
                            } catch (java.lang.Throwable decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              var8 = decompiledCaughtException;
                              stackOut_39_0 = -1;
                              stackIn_40_0 = stackOut_39_0;
                              return stackIn_40_0;
                            }
                            hw.a(var11, param0, 23295);
                            stackOut_41_0 = 100;
                            stackIn_42_0 = stackOut_41_0;
                            return stackIn_42_0;
                          }
                        }
                      }
                      stackOut_43_0 = -1;
                      stackIn_44_0 = stackOut_43_0;
                      break L0;
                    } else {
                      stackOut_17_0 = ha.field_e.a(var3, (byte) 33);
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    }
                  } else {
                    stackOut_14_0 = -1;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var2;
            stackOut_45_1 = new StringBuilder().append("ig.C(");
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L8;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L8;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + 44 + 1 + 41);
        }
        return stackIn_44_0;
    }

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new jn();
    }
}
