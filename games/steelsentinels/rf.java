/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rf {
    static int field_c;
    static boolean field_b;
    static int field_a;
    static kj field_d;

    final static void a(wk[] param0, int param1, int param2, int param3, int param4, int param5, wk[] param6, int param7, int param8, mi param9, int param10, int param11, int param12, int param13, wk[] param14) {
        int var15_int = 0;
        int var16 = 0;
        try {
            var15_int = param9.field_U - -param9.field_F;
            var16 = param9.field_U;
            int discarded$0 = 53;
            int discarded$1 = 480;
            pc.a(var16, param0, 320, param9, 8, 8, 2, 16777215, 8, param6, 0, var15_int, 1146810, 240, var16, 8, param9, var15_int, param14);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "rf.B(" + (param0 != null ? "{...}" : "null") + ',' + 320 + ',' + 8 + ',' + 8 + ',' + 8 + ',' + 8 + ',' + (param6 != null ? "{...}" : "null") + ',' + 16777215 + ',' + 0 + ',' + (param9 != null ? "{...}" : "null") + ',' + 1146810 + ',' + 240 + ',' + 2 + ',' + -94 + ',' + (param14 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c() {
        field_d = null;
    }

    final static int a(int param0) {
        if (param0 != -58) {
            return 24;
        }
        return 1;
    }

    final static ef a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ef stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ef stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            L1: while (true) {
              if (var3 >= var2_int) {
                stackOut_9_0 = ec.field_b;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var4 = param1.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("rf.D(").append(16).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    final boolean b(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 >= 77) {
            break L0;
          } else {
            int discarded$2 = rf.a(-62);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this == (Object) (Object) uf.field_g) {
              break L2;
            } else {
              if ((Object) (Object) wl.field_N == this) {
                break L2;
              } else {
                if (this != (Object) (Object) jd.field_sb) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static cm a(boolean param0, int param1, byte param2, boolean param3, boolean param4, int param5) {
        try {
            int var6 = 0;
            Object var7 = null;
            Object var8 = null;
            fi var9 = null;
            cm stackIn_11_0 = null;
            Throwable decompiledCaughtException = null;
            cm stackOut_10_0 = null;
            var6 = 73 % ((-55 - param2) / 59);
            try {
              L0: {
                L1: {
                  var7 = null;
                  var8 = null;
                  if (km.field_k.field_f == null) {
                    break L1;
                  } else {
                    si.field_o = new rj(km.field_k.field_f, 5200, 0);
                    km.field_k.field_f = null;
                    var7 = (Object) (Object) new rc(255, si.field_o, new rj(km.field_k.field_g, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  if (si.field_o == null) {
                    break L2;
                  } else {
                    L3: {
                      if (rh.field_o == null) {
                        rh.field_o = new rj[km.field_k.field_a.length];
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (rh.field_o[param5] != null) {
                        break L4;
                      } else {
                        rh.field_o[param5] = new rj(km.field_k.field_a[param5], 12000, 0);
                        km.field_k.field_a[param5] = null;
                        break L4;
                      }
                    }
                    var8 = (Object) (Object) new rc(param5, si.field_o, rh.field_o[param5], 2097152);
                    break L2;
                  }
                }
                var9 = gb.field_c.a((rc) var7, (byte) 115, false, (rc) var8, param5);
                stackOut_10_0 = new cm((fa) (Object) var9, true, 1);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var7 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var7).toString());
            }
            return stackIn_11_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, na param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = v.field_e;
            L1: {
              if (2 != param1.field_k) {
                if (param1.field_k == 4) {
                  var2_int = pf.field_j[param1.field_k];
                  break L1;
                } else {
                  if (nb.field_G == param1.field_j) {
                    var2_int = ag.field_r[param1.field_k];
                    break L1;
                  } else {
                    var2_int = pf.field_j[param1.field_k];
                    break L1;
                  }
                }
              } else {
                if (param1.field_g) {
                  var2_int = v.field_e;
                  break L1;
                } else {
                  L2: {
                    if (param1.field_w != 0) {
                      break L2;
                    } else {
                      if (0 != param1.field_n) {
                        break L2;
                      } else {
                        var2_int = ag.field_r[param1.field_k];
                        break L1;
                      }
                    }
                  }
                  var2_int = pf.field_j[param1.field_k];
                  break L1;
                }
              }
            }
            stackOut_15_0 = var2_int;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("rf.C(").append(-102).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_16_0;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_a = 1024;
    }
}
