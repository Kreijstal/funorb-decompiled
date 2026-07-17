/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.awt.Frame;

final class ug extends IOException {
    static dl field_c;
    static int field_b;
    static int field_a;

    final static void a(int param0, ha param1) {
        int var3_int = param1.field_sb;
        int var4 = param1.a(true, var3_int);
        System.out.println("--- STATE DUMP REQUESTED - SERVER CHECKSUM: " + Integer.toString(ub.field_d, 16) + " SERVER CHECKSUM: " + Integer.toString(param1.a(true, var3_int), 16) + " ---");
        System.out.println(param1.j(var3_int, -248));
        try {
            System.out.println("--- STATE DUMP ENDS: " + Integer.toString(ub.field_d, 16) + " ---");
            vl.field_n.h(32161, 72);
            vl.field_n.a((byte) -117, ub.field_d);
            vl.field_n.a((byte) -98, var4);
            hb.a((byte) 116, 0);
            dj.a((byte) -125);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ug.B(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    final static java.awt.Frame a(int param0, int param1, int param2, hd param3, int param4, int param5) {
        RuntimeException var6 = null;
        ls[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        ls[] var10 = null;
        wo var11 = null;
        Object stackIn_8_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_33_0 = null;
        java.awt.Frame stackIn_35_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_23_0 = null;
        Object stackOut_7_0 = null;
        java.awt.Frame stackOut_34_0 = null;
        Object stackOut_32_0 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (param3.b(false)) {
              L1: {
                if (param0 == 0) {
                  var10 = ma.a(-110, param3);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_23_0 = null;
                          stackIn_24_0 = stackOut_23_0;
                          return (java.awt.Frame) (Object) stackIn_24_0;
                        }
                      } else {
                        L3: {
                          if (param4 != var10[var8].field_b) {
                            var8++;
                            break L3;
                          } else {
                            if (param5 == var10[var8].field_a) {
                              L4: {
                                if (var7_int == 0) {
                                  break L4;
                                } else {
                                  if (var10[var8].field_f > param0) {
                                    break L4;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              param0 = var10[var8].field_f;
                              var7_int = 1;
                              break L3;
                            } else {
                              var8++;
                              break L3;
                            }
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    return (java.awt.Frame) (Object) stackIn_8_0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param3.a(true, param5, param4, 0, param0);
              L5: while (true) {
                if (var11.field_g != 0) {
                  var7 = (java.awt.Frame) var11.field_f;
                  if (var7 != null) {
                    if (2 != var11.field_g) {
                      stackOut_34_0 = (java.awt.Frame) var7;
                      stackIn_35_0 = stackOut_34_0;
                      break L0;
                    } else {
                      fj.a(var7, param3, -2);
                      stackOut_32_0 = null;
                      stackIn_33_0 = stackOut_32_0;
                      return (java.awt.Frame) (Object) stackIn_33_0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  nu.a(10L, 0);
                  continue L5;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var6;
            stackOut_36_1 = new StringBuilder().append("ug.A(").append(param0).append(44).append(0).append(44).append(-1).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param3 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L6;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L6;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_35_0;
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 == 16) {
              L1: {
                int discarded$2 = 0;
                var2 = lt.a(0, wc.a(param1));
                if (var2 == null) {
                  var2 = "";
                  break L1;
                } else {
                  break L1;
                }
              }
              stackOut_6_0 = (String) var2;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2_ref;
            stackOut_8_1 = new StringBuilder().append("ug.C(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    public static void a() {
        field_c = null;
    }

    ug(String param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new dl(1);
    }
}
