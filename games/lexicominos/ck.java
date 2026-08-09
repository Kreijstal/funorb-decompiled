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
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        int stackIn_13_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_19_0 = 0;
        Object stackIn_23_0 = null;
        boolean stackIn_29_0 = false;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        boolean stackOut_14_0;
        boolean stackOut_28_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            stackIn_13_0 = var3;
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackIn_13_0 = var3;
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
                            if (var9 == 0) {
                              stackIn_13_0 = var3;
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    stackIn_19_0 = -var2_int + var3;
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
                          L10: {
                            if (var3 <= var6) {
                              break L10;
                            } else {
                              var7 = param0.charAt(var6);
                              stackOut_28_0 = vb.a((byte) -106, (char) var7);
                              stackIn_34_0 = stackOut_28_0 ? 1 : 0;
                              stackIn_29_0 = stackOut_28_0;
                              if (var9 != 0) {
                                break L9;
                              } else {
                                L11: {
                                  if (!stackIn_29_0) {
                                    break L11;
                                  } else {
                                    var8 = hh.a(125, (char) var7);
                                    if (var8 == 0) {
                                      break L11;
                                    } else {
                                      discarded$0 = var5.append((char) var8);
                                      break L11;
                                    }
                                  }
                                }
                                var6++;
                                if (var9 == 0) {
                                  continue L8;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          stackIn_34_0 = var5.length() ^ -1;
                          break L9;
                        }
                        if (stackIn_34_0 != -1) {
                          return var5.toString();
                        } else {
                          return null;
                        }
                      }
                    } else {
                      stackIn_23_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var2);

            stackIn_40_1 = new StringBuilder().append("ck.B(");

            if (param0 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L12;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L12;
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
