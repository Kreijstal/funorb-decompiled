/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class rg {
    int field_b;
    String field_a;

    abstract java.net.Socket b(int param0) throws IOException;

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != -5942) {
            return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_a, this.field_b);
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        boolean stackIn_23_0 = false;
        String stackIn_30_0 = null;
        int stackIn_33_0 = 0;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        boolean stackOut_22_0 = false;
        String stackOut_29_0 = null;
        int stackOut_32_0 = 0;
        String stackOut_35_0 = null;
        String stackOut_18_0 = null;
        String stackOut_13_0 = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param1 == null) {
              stackOut_3_0 = ei.field_a;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param1.length();
                if (-2 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (var3_int <= 12) {
                    L2: {
                      var4 = ua.a(param2 ^ -47, param1);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
                          L3: {
                            if (sk.a(var4.charAt(0), -46)) {
                              break L3;
                            } else {
                              if (!sk.a(var4.charAt(-1 + var4.length()), -46)) {
                                var5 = param2;
                                var6 = 0;
                                L4: while (true) {
                                  L5: {
                                    L6: {
                                      if (var6 >= param1.length()) {
                                        break L6;
                                      } else {
                                        var7 = param1.charAt(var6);
                                        stackOut_22_0 = sk.a((char) var7, -46);
                                        stackIn_33_0 = stackOut_22_0 ? 1 : 0;
                                        stackIn_23_0 = stackOut_22_0;
                                        if (var8 != 0) {
                                          break L5;
                                        } else {
                                          L7: {
                                            if (!stackIn_23_0) {
                                              var5 = 0;
                                              if (var8 == 0) {
                                                break L7;
                                              } else {
                                                var5++;
                                                break L7;
                                              }
                                            } else {
                                              var5++;
                                              break L7;
                                            }
                                          }
                                          L8: {
                                            if (var5 < 2) {
                                              break L8;
                                            } else {
                                              if (param0) {
                                                break L8;
                                              } else {
                                                stackOut_29_0 = im.field_b;
                                                stackIn_30_0 = stackOut_29_0;
                                                decompiledRegionSelector0 = 4;
                                                break L0;
                                              }
                                            }
                                          }
                                          var6++;
                                          if (var8 == 0) {
                                            continue L4;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_32_0 = var5 ^ -1;
                                    stackIn_33_0 = stackOut_32_0;
                                    break L5;
                                  }
                                  if (stackIn_33_0 < -1) {
                                    stackOut_35_0 = rl.field_c;
                                    stackIn_36_0 = stackOut_35_0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    return null;
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_18_0 = rl.field_c;
                          stackIn_19_0 = stackOut_18_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_13_0 = ei.field_a;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_8_0 = ei.field_a;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var3);
            stackOut_38_1 = new StringBuilder().append("rg.J(").append(param0).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L9;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L9;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_30_0;
                } else {
                  return stackIn_36_0;
                }
              }
            }
          }
        }
    }

    static {
    }
}
