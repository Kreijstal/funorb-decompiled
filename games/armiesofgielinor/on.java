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
        int stackIn_4_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_39_0 = false;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var4_int >= param0.field_db * param0.field_v / 3) {
                    break L3;
                  } else {
                    var5 = 1 + ns.a(false, param0.field_v - 2, param3);
                    var6 = ns.a(param2, param0.field_db + -2, param3) + 1;
                    var7 = var6 * param0.field_v + var5;
                    stackOut_3_0 = -1;
                    stackIn_40_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 != (param0.field_Eb[var7].field_h ^ -1)) {
                          break L4;
                        } else {
                          if (null != param0.field_Eb[var7].field_c) {
                            break L4;
                          } else {
                            L5: {
                              if (param0.field_Eb[1 + var7].field_h == param1) {
                                break L5;
                              } else {
                                if (param1 == param0.field_Eb[-1 + var7].field_h) {
                                  break L5;
                                } else {
                                  if (param0.field_Eb[param0.field_v + var7].field_h == param1) {
                                    break L5;
                                  } else {
                                    if (param1 == param0.field_Eb[var7 - param0.field_v].field_h) {
                                      break L5;
                                    } else {
                                      L6: {
                                        L7: {
                                          var8 = ns.a(false, 100, param3);
                                          if (var8 < 20) {
                                            break L7;
                                          } else {
                                            L8: {
                                              if (40 <= var8) {
                                                break L8;
                                              } else {
                                                param0.field_Eb[var7].field_h = 5;
                                                if (var9 == 0) {
                                                  break L6;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                            L9: {
                                              if (50 > var8) {
                                                break L9;
                                              } else {
                                                if (70 <= var8) {
                                                  break L6;
                                                } else {
                                                  if (0 > (param1 ^ -1)) {
                                                    param0.field_Eb[var7].field_h = param1;
                                                    if (var9 == 0) {
                                                      break L6;
                                                    } else {
                                                      break L9;
                                                    }
                                                  } else {
                                                    break L6;
                                                  }
                                                }
                                              }
                                            }
                                            param0.field_Eb[var7].field_h = 2;
                                            if (var9 == 0) {
                                              break L6;
                                            } else {
                                              break L7;
                                            }
                                          }
                                        }
                                        param0.field_Eb[var7].field_h = 3;
                                        break L6;
                                      }
                                      if (var9 == 0) {
                                        break L4;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L10: {
                              if ((ns.a(false, 100, param3) ^ -1) <= -41) {
                                break L10;
                              } else {
                                param0.field_Eb[var7].field_h = param1;
                                if (var9 == 0) {
                                  break L4;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              var8 = ns.a(param2, 100, param3);
                              if ((var8 ^ -1) <= -21) {
                                break L11;
                              } else {
                                param0.field_Eb[var7].field_h = 3;
                                if (var9 == 0) {
                                  break L4;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L12: {
                              if (-41 < (var8 ^ -1)) {
                                break L12;
                              } else {
                                L13: {
                                  if (-51 >= (var8 ^ -1)) {
                                    break L13;
                                  } else {
                                    param0.field_Eb[var7].field_h = 2;
                                    if (var9 == 0) {
                                      break L4;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                if (-71 >= (var8 ^ -1)) {
                                  break L4;
                                } else {
                                  if (param1 <= -1) {
                                    break L4;
                                  } else {
                                    param0.field_Eb[var7].field_h = param1;
                                    if (var9 == 0) {
                                      break L4;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            param0.field_Eb[var7].field_h = 5;
                            break L4;
                          }
                        }
                      }
                      var4_int++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_39_0 = param2;
                stackIn_40_0 = stackOut_39_0 ? 1 : 0;
                break L2;
              }
              if (stackIn_40_0 == 0) {
                break L0;
              } else {
                field_o = (String) null;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var4);
            stackOut_43_1 = new StringBuilder().append("on.A(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L14;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L14;
            }
          }
          L15: {
            stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param3 == null) {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L15;
            } else {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L15;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ')');
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
