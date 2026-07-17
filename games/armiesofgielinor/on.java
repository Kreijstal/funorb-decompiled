/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class on extends tc {
    static String field_p;
    int[] field_m;
    static String field_k;
    int field_l;
    static String field_o;
    static int field_n;

    public static void a(int param0) {
        field_p = null;
        field_o = null;
        field_k = null;
        if (param0 != -7) {
            on.a(-36);
        }
    }

    final static void a(ha param0, int param1, boolean param2, Random param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (~var4_int <= ~(param0.field_db * param0.field_v / 3)) {
                break L0;
              } else {
                L2: {
                  var5 = 1 + ns.a(false, param0.field_v - 2, param3);
                  var6 = ns.a(false, param0.field_db + -2, param3) + 1;
                  var7 = var6 * param0.field_v + var5;
                  if (param0.field_Eb[var7].field_h != 0) {
                    break L2;
                  } else {
                    if (null != param0.field_Eb[var7].field_c) {
                      break L2;
                    } else {
                      L3: {
                        if (~param0.field_Eb[1 + var7].field_h == ~param1) {
                          break L3;
                        } else {
                          if (~param1 == ~param0.field_Eb[-1 + var7].field_h) {
                            break L3;
                          } else {
                            if (param0.field_Eb[param0.field_v + var7].field_h == param1) {
                              break L3;
                            } else {
                              if (~param1 == ~param0.field_Eb[var7 - param0.field_v].field_h) {
                                break L3;
                              } else {
                                var8 = ns.a(false, 100, param3);
                                if (var8 < 20) {
                                  param0.field_Eb[var7].field_h = 3;
                                  break L2;
                                } else {
                                  if (40 <= var8) {
                                    if (50 > var8) {
                                      param0.field_Eb[var7].field_h = 2;
                                      break L2;
                                    } else {
                                      if (70 <= var8) {
                                        break L2;
                                      } else {
                                        if (param1 > -1) {
                                          param0.field_Eb[var7].field_h = param1;
                                          break L2;
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                  } else {
                                    param0.field_Eb[var7].field_h = 5;
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (ns.a(false, 100, param3) >= 40) {
                        var8 = ns.a(false, 100, param3);
                        if (var8 >= 20) {
                          if (var8 < 40) {
                            param0.field_Eb[var7].field_h = 5;
                            break L2;
                          } else {
                            if (var8 >= 50) {
                              if (var8 >= 70) {
                                break L2;
                              } else {
                                if (param1 <= -1) {
                                  break L2;
                                } else {
                                  param0.field_Eb[var7].field_h = param1;
                                  break L2;
                                }
                              }
                            } else {
                              param0.field_Eb[var7].field_h = 2;
                              break L2;
                            }
                          }
                        } else {
                          param0.field_Eb[var7].field_h = 3;
                          break L2;
                        }
                      } else {
                        param0.field_Eb[var7].field_h = param1;
                        break L2;
                      }
                    }
                  }
                }
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var4;
            stackOut_34_1 = new StringBuilder().append("on.A(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L4;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L4;
            }
          }
          L5: {
            stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
            stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(44).append(param1).append(44).append(0).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param3 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L5;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 41);
        }
    }

    private on() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Melee";
        field_p = "Village";
        field_o = "Slow";
    }
}
