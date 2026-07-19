/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    int field_d;
    byte[] field_c;
    int field_a;
    int field_k;
    static String field_l;
    static int[] field_j;
    int field_e;
    int field_i;
    int field_f;
    static String field_h;
    int field_b;
    static String field_m;
    byte[] field_g;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 1;
              if (param2 == 26186) {
                break L1;
              } else {
                field_j = (int[]) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                if (param1 <= 1) {
                  stackOut_8_0 = param1 ^ -1;
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_4_0 = 1 & param1;
                  stackIn_9_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (var4 != 0) {
                    break L3;
                  } else {
                    L4: {
                      if (stackIn_5_0 == 0) {
                        break L4;
                      } else {
                        var3_int = var3_int * param0;
                        break L4;
                      }
                    }
                    param0 = param0 * param0;
                    param1 = param1 >> 1;
                    continue L2;
                  }
                }
              }
              if (stackIn_9_0 != -2) {
                stackOut_12_0 = var3_int;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_10_0 = param0 * var3_int;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var3), "nh.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_13_0;
        }
    }

    final static void a(ti param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 >= 31) {
              if (-1 != ((param0.field_m | param0.field_n) & 3 ^ -1)) {
                var2_int = 4 - (param0.field_n & 3);
                var3 = -(3 & param0.field_m) + 4;
                var4 = param0.field_n + var2_int;
                var5 = new int[(param0.field_n + var2_int) * (param0.field_m + var3)];
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var6 >= param0.field_m) {
                        break L3;
                      } else {
                        if (var8 != 0) {
                          break L2;
                        } else {
                          var7 = 0;
                          L4: while (true) {
                            L5: {
                              L6: {
                                if (var7 >= param0.field_n) {
                                  break L6;
                                } else {
                                  var5[(var6 + var3) * var4 - -var2_int - -var7] = param0.field_w[var7 + var6 * param0.field_n];
                                  var7++;
                                  if (var8 != 0) {
                                    break L5;
                                  } else {
                                    if (var8 == 0) {
                                      continue L4;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var6++;
                              break L5;
                            }
                            if (var8 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    param0.field_u = param0.field_u - var2_int;
                    param0.field_n = param0.field_n + var2_int;
                    param0.field_l = param0.field_l - var3;
                    param0.field_w = var5;
                    break L2;
                  }
                  param0.field_m = param0.field_m + var3;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var2);
            stackOut_18_1 = new StringBuilder().append("nh.E(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static gd a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        gd var8 = new gd(param4, param2, param3, param1, param0, param5);
        int var9 = -40 % ((param7 - 6) / 59);
        rh.field_r.a(var8, -107);
        ne.a((byte) 7, var8, param6);
        return var8;
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        field_h = null;
        field_m = null;
        int var1 = 43 % ((47 - param0) / 61);
    }

    final static rj b(int param0) {
        try {
            Throwable var1 = null;
            ti var2 = null;
            rj stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            rj stackOut_2_0 = null;
            try {
              L0: {
                L1: {
                  if (param0 == 1) {
                    break L1;
                  } else {
                    var2 = (ti) null;
                    nh.a((ti) null, (byte) 65);
                    break L1;
                  }
                }
                stackOut_2_0 = (rj) (Class.forName("sk").newInstance());
                stackIn_3_0 = stackOut_2_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_j = new int[8192];
        field_l = "Discard";
        field_h = "Cancel";
        field_m = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
