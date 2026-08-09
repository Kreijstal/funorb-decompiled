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
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= param0.field_db * param0.field_v / 3) {
                L2: {
                  if (!param2) {
                    break L2;
                  } else {
                    field_o = (String) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var5 = 1 + ns.a(false, param0.field_v - 2, param3);
                  var6 = ns.a(param2, param0.field_db + -2, param3) + 1;
                  var7 = var6 * param0.field_v + var5;
                  if (-1 != (param0.field_Eb[var7].field_h ^ -1)) {
                    break L3;
                  } else {
                    if (null != param0.field_Eb[var7].field_c) {
                      break L3;
                    } else {
                      L4: {
                        if (param0.field_Eb[1 + var7].field_h == param1) {
                          break L4;
                        } else {
                          if (param1 == param0.field_Eb[-1 + var7].field_h) {
                            break L4;
                          } else {
                            if (param0.field_Eb[param0.field_v + var7].field_h == param1) {
                              break L4;
                            } else {
                              if (param1 == param0.field_Eb[var7 - param0.field_v].field_h) {
                                break L4;
                              } else {
                                var8 = ns.a(false, 100, param3);
                                if (var8 < 20) {
                                  param0.field_Eb[var7].field_h = 3;
                                  break L3;
                                } else {
                                  if (40 <= var8) {
                                    if (50 > var8) {
                                      param0.field_Eb[var7].field_h = 2;
                                      break L3;
                                    } else {
                                      if (70 <= var8) {
                                        break L3;
                                      } else {
                                        if (0 > (param1 ^ -1)) {
                                          param0.field_Eb[var7].field_h = param1;
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                  } else {
                                    param0.field_Eb[var7].field_h = 5;
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if ((ns.a(false, 100, param3) ^ -1) <= -41) {
                        var8 = ns.a(param2, 100, param3);
                        if ((var8 ^ -1) <= -21) {
                          if (-41 < (var8 ^ -1)) {
                            param0.field_Eb[var7].field_h = 5;
                            break L3;
                          } else {
                            if (-51 >= (var8 ^ -1)) {
                              if (-71 >= (var8 ^ -1)) {
                                break L3;
                              } else {
                                if (param1 <= -1) {
                                  break L3;
                                } else {
                                  param0.field_Eb[var7].field_h = param1;
                                  break L3;
                                }
                              }
                            } else {
                              param0.field_Eb[var7].field_h = 2;
                              break L3;
                            }
                          }
                        } else {
                          param0.field_Eb[var7].field_h = 3;
                          break L3;
                        }
                      } else {
                        param0.field_Eb[var7].field_h = param1;
                        break L3;
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
          L5: {
            var4 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var4);

            stackIn_36_1 = new StringBuilder().append("on.A(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L5;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_39_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L6;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_37_0), stackIn_40_2 + ')');
        }
    }

    private on() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "Melee";
        field_p = "Village";
        field_o = "Slow";
    }
}
