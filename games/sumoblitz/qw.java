/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qw {
    static int field_b;
    static String field_c;
    static hr[] field_a;

    final static boolean a(int param0, char param1) {
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        if (param1 < 48) {
          if (param1 < 65) {
            L0: {
              if (param1 < 97) {
                break L0;
              } else {
                if (122 < param1) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
            return false;
          } else {
            if (param1 <= 90) {
              stackOut_26_0 = 1;
              stackIn_28_0 = stackOut_26_0;
              return stackIn_28_0 != 0;
            } else {
              L1: {
                L2: {
                  if (param1 < 97) {
                    break L2;
                  } else {
                    if (122 < param1) {
                      break L2;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L1;
                    }
                  }
                }
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L1;
              }
              return stackIn_25_0 != 0;
            }
          }
        } else {
          if (57 < param1) {
            if (param1 >= 65) {
              if (param1 > 90) {
                if (param1 >= 97) {
                  if (122 < param1) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              if (param1 >= 97) {
                if (122 < param1) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
    }

    final static void a() {
        if (!(so.a((byte) 101))) {
            return;
        }
        ou.a(false, 4, (byte) -24);
    }

    final static void a(int param0, ah param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4_int = 0;
        ah var4 = null;
        int var5 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (param1.field_Q != 0) {
              int discarded$8 = 1;
              if (jc.b() <= 20) {
                int discarded$9 = -96;
                var2_int = fi.a(2, he.field_o);
                if (1 != var2_int) {
                  L1: {
                    var3 = param1.field_N;
                    var4_int = var3;
                    if (var4_int == 4) {
                      var3 = 0;
                      break L1;
                    } else {
                      if (0 == var4_int) {
                        var3 = 5;
                        break L1;
                      } else {
                        if (var4_int != 5) {
                          if (var4_int == 1) {
                            var3 = 2;
                            break L1;
                          } else {
                            if (2 != var4_int) {
                              break L1;
                            } else {
                              var3 = 6;
                              break L1;
                            }
                          }
                        } else {
                          var3 = 1;
                          break L1;
                        }
                      }
                    }
                  }
                  L2: {
                    if (var3 >= 7) {
                      var3 = 6;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  int discarded$10 = -96;
                  int discarded$11 = -96;
                  var4 = uj.a(param1.field_Q, 26 - -fi.a(588, ki.field_b) << 8, var3, (byte) 84, 26 + fi.a(428, ki.field_b) << 8);
                  int discarded$12 = 0;
                  oc.a(var4);
                  break L0;
                } else {
                  L3: {
                    var3 = param1.field_Q + 1;
                    if (6 <= var3) {
                      var3 = 5;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  int discarded$13 = -96;
                  int discarded$14 = -96;
                  var4 = uj.a(var3, 26 + fi.a(588, ki.field_b) << 8, param1.field_N, (byte) 84, 26 + fi.a(428, ki.field_b) << 8);
                  int discarded$15 = 0;
                  oc.a(var4);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var2;
            stackOut_29_1 = new StringBuilder().append("qw.B(").append(94).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L4;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Passwords must be between 5 and 20 letters and numbers";
    }
}
