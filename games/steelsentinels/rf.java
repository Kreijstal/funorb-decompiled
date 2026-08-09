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
        if (param13 >= -81) {
            return;
        }
        try {
            var15_int = param9.field_U - -param9.field_F;
            var16 = param9.field_U;
            pc.a(var16, param0, param1, param9, param5, param3, param12, param7, param2, param6, param8, var15_int, param10, param11, var16, param4, param9, var15_int, param14, 480, 53);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "rf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + (param14 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        field_d = null;
        if (param0 < 105) {
            field_b = false;
        }
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
        ef stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0 == 16) {
                break L1;
              } else {
                field_c = 67;
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var3 >= var2_int) {
                stackIn_12_0 = ec.field_b;
                break L0;
              } else {
                var4 = param1.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L2;
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
          L3: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("rf.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final boolean b(int param0) {
        int stackIn_8_0 = 0;
        L0: {
          if (param0 >= 77) {
            break L0;
          } else {
            rf.a(-62);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this == uf.field_g) {
              break L2;
            } else {
              if (wl.field_N == this) {
                break L2;
              } else {
                if (this != jd.field_sb) {
                  stackIn_8_0 = 0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackIn_8_0 = 1;
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
            cm stackIn_13_0 = null;
            Throwable decompiledCaughtException = null;
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
                    var7 = new rc(255, si.field_o, new rj(km.field_k.field_g, 12000, 0), 2097152);
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
                    var8 = new rc(param5, si.field_o, rh.field_o[param5], 2097152);
                    break L2;
                  }
                }
                L5: {
                  var9 = gb.field_c.a((rc) (var7), (byte) 115, param3, (rc) (var8), param5);
                  if (!param4) {
                    break L5;
                  } else {
                    var9.d((byte) 74);
                    break L5;
                  }
                }
                stackIn_13_0 = new cm(var9, param0, param1);
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var7 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) (var7)).toString());
            }
            return stackIn_13_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, na param1) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            var2_int = v.field_e;
            if (param0 < -75) {
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
                      if (-1 != (param1.field_w ^ -1)) {
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
              stackIn_17_0 = var2_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = -50;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("rf.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_17_0;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = true;
        field_a = 1024;
    }
}
