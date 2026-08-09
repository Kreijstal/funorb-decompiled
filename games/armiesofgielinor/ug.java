/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ug extends IOException {
    static dl field_c;
    static int field_b;
    static int field_a;

    final static void a(int param0, ha param1, boolean param2) {
        int var3_int = param1.field_sb;
        int var4 = param1.a(true, var3_int);
        System.out.println("--- STATE DUMP REQUESTED - SERVER CHECKSUM: " + Integer.toString(ub.field_d, 16) + " SERVER CHECKSUM: " + Integer.toString(param1.a(true, var3_int), 16) + " ---");
        System.out.println(param1.j(var3_int, -248));
        if (param0 != 0) {
            return;
        }
        try {
            System.out.println("--- STATE DUMP ENDS: " + Integer.toString(ub.field_d, 16) + " ---");
            vl.field_n.h(32161, 72);
            vl.field_n.a((byte) -117, ub.field_d);
            vl.field_n.a((byte) -98, var4);
            if (param2) {
                hb.a((byte) 116, 0);
                dj.a((byte) -125);
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ug.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static java.awt.Frame a(int param0, int param1, int param2, hd param3, int param4, int param5) {
        Object stackIn_10_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_36_0 = null;
        java.awt.Frame stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ls[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        ls[] var11 = null;
        wo var12 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -1) {
                break L1;
              } else {
                var10 = (CharSequence) null;
                ug.a(99, (CharSequence) null);
                break L1;
              }
            }
            if (param3.b(false)) {
              L2: {
                if (param0 == 0) {
                  var11 = ma.a(param2 ^ 109, param3);
                  var6 = var11;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L3: while (true) {
                      if (var11.length <= var8) {
                        if (var7_int != 0) {
                          break L2;
                        } else {
                          stackIn_27_0 = null;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      } else {
                        L4: {
                          if (param4 != var11[var8].field_b) {
                            break L4;
                          } else {
                            if (param5 == var11[var8].field_a) {
                              L5: {
                                if (param1 == 0) {
                                  break L5;
                                } else {
                                  if (var11[var8].field_e != param1) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L6: {
                                if (var7_int == 0) {
                                  break L6;
                                } else {
                                  if (var11[var8].field_f > param0) {
                                    break L6;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              param0 = var11[var8].field_f;
                              var7_int = 1;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    stackIn_10_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
              var12 = param3.a(true, param5, param4, param1, param0);
              L7: while (true) {
                if (-1 != (var12.field_g ^ -1)) {
                  var7 = (java.awt.Frame) (var12.field_f);
                  if (var7 != null) {
                    if (2 != var12.field_g) {
                      stackIn_38_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      fj.a(var7, param3, -2);
                      stackIn_36_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  nu.a(10L, 0);
                  continue L7;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6_ref = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var6_ref);

            stackIn_41_1 = new StringBuilder().append("ug.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L8;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_10_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_27_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_36_0);
            } else {
              return stackIn_38_0;
            }
          }
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 16) {
              L1: {
                var2 = lt.a(0, wc.a(param1, 0));
                if (var2 == null) {
                  var2 = "";
                  break L1;
                } else {
                  break L1;
                }
              }
              stackIn_7_0 = (String) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("ug.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 16) {
            field_c = (dl) null;
        }
    }

    ug(String param0) {
        super(param0);
    }

    static {
        field_c = new dl(1);
    }
}
