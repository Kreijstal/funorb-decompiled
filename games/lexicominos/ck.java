/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ck extends IOException {
    static java.awt.Frame field_d;
    static int field_a;
    static String field_c;
    static String field_b;

    final static String a(CharSequence param0, byte param1) {
        StringBuilder discarded$1 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        int stackIn_13_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_19_0 = 0;
        Object stackIn_23_0 = null;
        boolean stackIn_29_0 = false;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_10_0 = 0;
        boolean stackOut_14_0 = false;
        int stackOut_12_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_33_0 = 0;
        boolean stackOut_28_0 = false;
        Object stackOut_22_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_int >= var3) {
                      break L3;
                    } else {
                      stackOut_6_0 = cf.a(param0.charAt(var2_int), (byte) 78);
                      stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          break L3;
                        } else {
                          var2_int++;
                          continue L1;
                        }
                      }
                    }
                  }
                  stackOut_10_0 = var3;
                  stackIn_13_0 = stackOut_10_0;
                  break L2;
                }
                L4: while (true) {
                  L5: {
                    L6: {
                      if (stackIn_13_0 <= var2_int) {
                        break L6;
                      } else {
                        stackOut_14_0 = cf.a(param0.charAt(var3 - 1), (byte) 78);
                        stackIn_19_0 = stackOut_14_0 ? 1 : 0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var9 != 0) {
                          break L5;
                        } else {
                          if (!stackIn_15_0) {
                            break L6;
                          } else {
                            var3--;
                            stackOut_12_0 = var3;
                            stackIn_13_0 = stackOut_12_0;
                            continue L4;
                          }
                        }
                      }
                    }
                    stackOut_18_0 = -var2_int + var3;
                    stackIn_19_0 = stackOut_18_0;
                    break L5;
                  }
                  var4 = stackIn_19_0;
                  if (-2 >= (var4 ^ -1)) {
                    if ((var4 ^ -1) >= -13) {
                      L7: {
                        var5 = new StringBuilder(var4);
                        if (param1 == -48) {
                          break L7;
                        } else {
                          field_d = (java.awt.Frame) null;
                          break L7;
                        }
                      }
                      var6 = var2_int;
                      L8: while (true) {
                        L9: {
                          if (var3 <= var6) {
                            stackOut_33_0 = var5.length() ^ -1;
                            stackIn_34_0 = stackOut_33_0;
                            break L9;
                          } else {
                            var7 = param0.charAt(var6);
                            stackOut_28_0 = vb.a((byte) -106, (char) var7);
                            stackIn_34_0 = stackOut_28_0 ? 1 : 0;
                            stackIn_29_0 = stackOut_28_0;
                            if (var9 != 0) {
                              break L9;
                            } else {
                              L10: {
                                if (!stackIn_29_0) {
                                  break L10;
                                } else {
                                  var8 = hh.a(125, (char) var7);
                                  if (var8 == 0) {
                                    break L10;
                                  } else {
                                    discarded$1 = var5.append((char) var8);
                                    break L10;
                                  }
                                }
                              }
                              var6++;
                              continue L8;
                            }
                          }
                        }
                        if (stackIn_34_0 != -1) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      }
                    } else {
                      stackOut_22_0 = null;
                      stackIn_23_0 = stackOut_22_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var2);
            stackOut_38_1 = new StringBuilder().append("ck.B(");
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L11;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L11;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_3_0);
        } else {
          return (String) ((Object) stackIn_23_0);
        }
    }

    ck(String param0) {
        super(param0);
    }

    final static void a(int param0, int param1) {
        th var2 = ed.field_q;
        var2.h(param0, 0);
        var2.c(1, -1);
        var2.c(param1, -1);
    }

    final static void b(byte param0) {
        if (jc.field_b == null) {
          if (param0 < -25) {
            return;
          } else {
            field_a = 22;
            return;
          }
        } else {
          jc.field_b.b(58);
          jc.field_b = null;
          if (param0 < -25) {
            return;
          } else {
            field_a = 22;
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 != -18) {
            return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        field_a = 0;
        field_b = "Type your age in years";
        field_c = "Loading extra data";
    }
}
