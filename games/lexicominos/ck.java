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
        Object stackIn_16_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  if (var2_int >= var3) {
                    break L2;
                  } else {
                    if (!cf.a(param0.charAt(var2_int), (byte) 78)) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var3 <= var2_int) {
                      break L4;
                    } else {
                      if (!cf.a(param0.charAt(var3 - 1), (byte) 78)) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = -var2_int + var3;
                  if (-2 >= (var4 ^ -1)) {
                    if ((var4 ^ -1) >= -13) {
                      L5: {
                        var5 = new StringBuilder(var4);
                        if (param1 == -48) {
                          break L5;
                        } else {
                          field_d = (java.awt.Frame) null;
                          break L5;
                        }
                      }
                      var6 = var2_int;
                      L6: while (true) {
                        if (var3 <= var6) {
                          if (var5.length() != 0) {
                            return var5.toString();
                          } else {
                            return null;
                          }
                        } else {
                          L7: {
                            var7 = param0.charAt(var6);
                            if (!vb.a((byte) -106, (char) var7)) {
                              break L7;
                            } else {
                              var8 = hh.a(125, (char) var7);
                              if (var8 == 0) {
                                break L7;
                              } else {
                                discarded$0 = var5.append((char) var8);
                                break L7;
                              }
                            }
                          }
                          var6++;
                          continue L6;
                        }
                      }
                    } else {
                      stackIn_16_0 = null;
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
          L8: {
            var2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var2);

            stackIn_31_1 = new StringBuilder().append("ck.B(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_3_0);
        } else {
          return (String) ((Object) stackIn_16_0);
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
        if (jc.field_b != null) {
            jc.field_b.b(58);
            jc.field_b = null;
        }
        if (param0 >= -25) {
            field_a = 22;
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
