/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ji {
    static String field_a;
    static String field_b;

    final static int a(boolean param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            fs var2 = null;
            int stackIn_16_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_35_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_15_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_34_0 = 0;
            if (4 > jk.field_b.field_d) {
              try {
                L0: {
                  L1: {
                    if (-1 != (cd.field_d ^ -1)) {
                      break L1;
                    } else {
                      dt.field_p = gk.field_u.a((byte) 51, gd.field_a, ie.field_x);
                      cd.field_d = cd.field_d + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (param0) {
                      break L2;
                    } else {
                      field_b = (String) null;
                      break L2;
                    }
                  }
                  L3: {
                    if (-2 == (cd.field_d ^ -1)) {
                      if (dt.field_p.field_c == 2) {
                        stackOut_15_0 = tm.a(-1, -84);
                        stackIn_16_0 = stackOut_15_0;
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        if ((dt.field_p.field_c ^ -1) != -2) {
                          break L3;
                        } else {
                          cd.field_d = cd.field_d + 1;
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (cd.field_d == 2) {
                      tj.field_n = new dt((java.net.Socket) (dt.field_p.field_d), gk.field_u);
                      var2 = new fs(13);
                      sb.a(ow.field_e, 127, bt.field_d, rd.field_l, var2);
                      var2.b((byte) 127, 15);
                      var2.e(48, qq.field_P);
                      tj.field_n.a(0, -2, var2.field_n, 13);
                      cd.field_d = cd.field_d + 1;
                      gb.field_s = wq.a(-109) - -30000L;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (cd.field_d != 3) {
                      break L5;
                    } else {
                      if (tj.field_n.c(-91) > 0) {
                        var1_int = tj.field_n.a(-106);
                        if (var1_int == 0) {
                          cd.field_d = cd.field_d + 1;
                          break L5;
                        } else {
                          stackOut_29_0 = tm.a(var1_int, -93);
                          stackIn_30_0 = stackOut_29_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        if (wq.a(-52) > gb.field_s) {
                          stackOut_26_0 = tm.a(-2, -89);
                          stackIn_27_0 = stackOut_26_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (cd.field_d == 4) {
                    jk.field_b.a(vk.field_e, (byte) 114, tj.field_n);
                    dt.field_p = null;
                    tj.field_n = null;
                    cd.field_d = 0;
                    stackOut_34_0 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return -1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return tm.a(-3, -94);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_27_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_30_0;
                  } else {
                    return stackIn_35_0;
                  }
                }
              }
            } else {
              if (0 != (jk.field_b.field_j ^ -1)) {
                if (1 == (jk.field_b.field_j ^ -1)) {
                  return 4;
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(java.applet.Applet param0, byte param1, String param2) {
        try {
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String var8 = null;
            String stackIn_10_0 = null;
            Object stackIn_15_0 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_9_0 = null;
            Object stackOut_14_0 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            var7 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var8 = (String) (tw.a(param0, -32, "getcookies"));
                      var4 = cn.a(';', var8, -27224);
                      if (param1 == -57) {
                        break L2;
                      } else {
                        ji.a(-92);
                        break L2;
                      }
                    }
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        var6 = var4[var5].indexOf('=');
                        if (var7 == 0) {
                          L4: {
                            if ((var6 ^ -1) > -1) {
                              break L4;
                            } else {
                              if (!var4[var5].substring(0, var6).trim().equals(param2)) {
                                break L4;
                              } else {
                                stackOut_9_0 = var4[var5].substring(1 + var6).trim();
                                stackIn_10_0 = stackOut_9_0;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              }
                            }
                          }
                          var5++;
                          continue L3;
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackOut_14_0 = null;
                  stackIn_15_0 = stackOut_14_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) (var3_ref);
                stackOut_16_1 = new StringBuilder().append("ji.B(");
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param0 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              L7: {
                stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                if (param2 == null) {
                  stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
                  stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
                  stackOut_21_2 = "null";
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L7;
                } else {
                  stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackOut_20_2 = "{...}";
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  break L7;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_15_0);
            } else {
              return stackIn_10_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              L2: {
                if (var2_int <= var4) {
                  if (param1 > 61) {
                    break L2;
                  } else {
                    field_b = (String) null;
                    break L2;
                  }
                } else {
                  var3[-1 + var2_int + -var4] = param0.charAt(var4);
                  var4++;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              stackOut_8_0 = new String(var3);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("ji.A(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            return;
        }
        field_b = null;
    }

    static {
        field_b = "Use this alternative as your account name";
        field_a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
