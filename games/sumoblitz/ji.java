/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ji {
    static String field_a;
    static String field_b;

    final static int a(boolean param0) {
        try {
            int stackIn_16_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_35_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            IOException var1 = null;
            fs var2 = null;
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
                        stackIn_16_0 = tm.a(-1, -84);
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
                          stackIn_30_0 = tm.a(var1_int, -93);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        if (wq.a(-52) > gb.field_s) {
                          stackIn_27_0 = tm.a(-2, -89);
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
                    stackIn_35_0 = 0;
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
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            String stackIn_8_0 = null;
            Object stackIn_13_0 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            StringBuilder stackIn_19_1 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            var7 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var3 = (String) (tw.a(param0, -32, "getcookies"));
                      var4 = cn.a(';', var3, -27224);
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
                        L4: {
                          var6 = var4[var5].indexOf('=');
                          if ((var6 ^ -1) > -1) {
                            break L4;
                          } else {
                            if (!var4[var5].substring(0, var6).trim().equals(param2)) {
                              break L4;
                            } else {
                              stackIn_8_0 = var4[var5].substring(1 + var6).trim();
                              decompiledRegionSelector0 = 1;
                              break L1;
                            }
                          }
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var3_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  stackIn_13_0 = null;
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
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var3_ref2);

                stackIn_16_1 = new StringBuilder().append("ji.B(");

                if (param0 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L6;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L7;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L7;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return (String) ((Object) stackIn_13_0);
            } else {
              return stackIn_8_0;
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
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var2_int <= var4) {
                L2: {
                  if (param1 > 61) {
                    break L2;
                  } else {
                    field_b = (String) null;
                    break L2;
                  }
                }
                stackIn_7_0 = new String(var3);
                break L0;
              } else {
                var3[-1 + var2_int + -var4] = param0.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("ji.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
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
