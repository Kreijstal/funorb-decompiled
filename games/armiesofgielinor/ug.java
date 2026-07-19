/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ug extends IOException {
    static dl field_c;
    static int field_b;
    static int field_a;

    final static void a(int param0, ha param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = param1.field_sb;
            var4 = param1.a(true, var3_int);
            System.out.println("--- STATE DUMP REQUESTED - SERVER CHECKSUM: " + Integer.toString(ub.field_d, 16) + " SERVER CHECKSUM: " + Integer.toString(param1.a(true, var3_int), 16) + " ---");
            System.out.println(param1.j(var3_int, -248));
            if (param0 == 0) {
              L1: {
                System.out.println("--- STATE DUMP ENDS: " + Integer.toString(ub.field_d, 16) + " ---");
                vl.field_n.h(32161, 72);
                vl.field_n.a((byte) -117, ub.field_d);
                vl.field_n.a((byte) -98, var4);
                if (!param2) {
                  break L1;
                } else {
                  hb.a((byte) 116, 0);
                  dj.a((byte) -125);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (runtimeException);
            stackOut_5_1 = new StringBuilder().append("ug.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static java.awt.Frame a(int param0, int param1, int param2, hd param3, int param4, int param5) {
        String discarded$1 = null;
        RuntimeException var6 = null;
        ls[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        ls[] var11 = null;
        wo var12 = null;
        Object stackIn_10_0 = null;
        int stackIn_14_0 = 0;
        int stackIn_26_0 = 0;
        Object stackIn_28_0 = null;
        Object stackIn_37_0 = null;
        java.awt.Frame stackIn_39_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_25_0 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_9_0 = null;
        java.awt.Frame stackOut_38_0 = null;
        Object stackOut_36_0 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -1) {
                break L1;
              } else {
                var10 = (CharSequence) null;
                discarded$1 = ug.a(99, (CharSequence) null);
                break L1;
              }
            }
            if (param3.b(false)) {
              L2: {
                if (param0 == 0) {
                  var11 = ma.a(param2 ^ 109, param3);
                  var6_array = var11;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (var11.length <= var8) {
                            break L5;
                          } else {
                            stackOut_13_0 = param4 ^ -1;
                            stackIn_26_0 = stackOut_13_0;
                            stackIn_14_0 = stackOut_13_0;
                            if (var9 != 0) {
                              break L4;
                            } else {
                              L6: {
                                if (stackIn_14_0 != (var11[var8].field_b ^ -1)) {
                                  break L6;
                                } else {
                                  if (param5 == var11[var8].field_a) {
                                    L7: {
                                      if (param1 == 0) {
                                        break L7;
                                      } else {
                                        if (var11[var8].field_e != param1) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    L8: {
                                      if (var7_int == 0) {
                                        break L8;
                                      } else {
                                        if (var11[var8].field_f > param0) {
                                          break L8;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    param0 = var11[var8].field_f;
                                    var7_int = 1;
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              var8++;
                              if (var9 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        stackOut_25_0 = var7_int;
                        stackIn_26_0 = stackOut_25_0;
                        break L4;
                      }
                      if (stackIn_26_0 != 0) {
                        break L2;
                      } else {
                        stackOut_27_0 = null;
                        stackIn_28_0 = stackOut_27_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  } else {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
              var12 = param3.a(true, param5, param4, param1, param0);
              L9: while (true) {
                L10: {
                  if (-1 != (var12.field_g ^ -1)) {
                    break L10;
                  } else {
                    nu.a(10L, 0);
                    if (var9 == 0) {
                      continue L9;
                    } else {
                      break L10;
                    }
                  }
                }
                var7 = (java.awt.Frame) (var12.field_f);
                if (var7 != null) {
                  if (2 != var12.field_g) {
                    stackOut_38_0 = (java.awt.Frame) (var7);
                    stackIn_39_0 = stackOut_38_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    fj.a(var7, param3, -2);
                    stackOut_36_0 = null;
                    stackIn_37_0 = stackOut_36_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var6);
            stackOut_40_1 = new StringBuilder().append("ug.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param3 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L11;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_10_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_28_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_37_0);
            } else {
              return stackIn_39_0;
            }
          }
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_1_0 = null;
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
                var2 = lt.a(0, wc.a(param1, 0));
                if (var2 == null) {
                  var2 = "";
                  break L1;
                } else {
                  break L1;
                }
              }
              stackOut_6_0 = (String) (var2);
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var2_ref);
            stackOut_8_1 = new StringBuilder().append("ug.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
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
