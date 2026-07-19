/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends pj {
    int field_I;
    static char[] field_N;
    private int field_K;
    static String field_J;
    private of field_M;
    int field_L;

    final int b(int param0, int param1) {
        int var3 = 0;
        var3 = 0 / ((-49 - param1) / 44);
        if ((param0 ^ -1) <= -1) {
          if (param0 >= this.field_M.b(100)) {
            return -1;
          } else {
            return this.field_M.a((byte) 43, param0);
          }
        } else {
          return -1;
        }
    }

    public static void a(byte param0) {
        if (param0 < 32) {
            return;
        }
        field_N = null;
        field_J = null;
    }

    final static ce a(String param0, boolean param1) {
        RuntimeException var2 = null;
        ce stackIn_2_0 = null;
        ce stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ce stackOut_3_0 = null;
        ce stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param1) {
              stackOut_3_0 = new ce(param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (ce) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("hh.H(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final int a(int param0) {
        if (param0 != -3) {
            return 14;
        }
        return this.field_K;
    }

    final boolean a(int param0, int param1, boolean param2, int param3, int param4, int param5, rc param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var14 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = param3 + -param1 - this.field_I;
                var9 = -(2 * this.field_I) + this.field_t;
                if (var9 < var8_int) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (-1 < (var8_int ^ -1)) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                L4: {
                  var8_int = var8_int * this.field_K / var9;
                  if (1 == param0) {
                    break L4;
                  } else {
                    if (-3 != (param0 ^ -1)) {
                      break L3;
                    } else {
                      var10 = 2147483647;
                      var11 = -1;
                      var12 = 0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (this.field_M.b(120) <= var12) {
                              break L7;
                            } else {
                              var13 = this.field_M.a((byte) 43, var12) + -var8_int;
                              var13 = var13 * var13;
                              stackOut_12_0 = var10 ^ -1;
                              stackIn_18_0 = stackOut_12_0;
                              stackIn_13_0 = stackOut_12_0;
                              if (var14 != 0) {
                                break L6;
                              } else {
                                L8: {
                                  if (stackIn_13_0 < (var13 ^ -1)) {
                                    var10 = var13;
                                    var11 = var12;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                var12++;
                                if (var14 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          stackOut_17_0 = var11;
                          stackIn_18_0 = stackOut_17_0;
                          break L6;
                        }
                        L9: {
                          if (stackIn_18_0 >= 0) {
                            this.field_M.a(true, var11);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        if (var14 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                this.field_M.c(-120, var8_int);
                break L3;
              }
              stackOut_23_0 = 1;
              stackIn_24_0 = stackOut_23_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var8 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var8);
            stackOut_27_1 = new StringBuilder().append("hh.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param6 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_24_0 != 0;
        } else {
          return stackIn_26_0 != 0;
        }
    }

    final int i(int param0) {
        int var2 = 4 / ((19 - param0) / 61);
        return this.field_M.b(110);
    }

    final static String a(boolean param0, java.applet.Applet param1) {
        try {
            RuntimeException var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            String stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            String stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            String stackIn_12_0 = null;
            String stackIn_18_0 = null;
            String stackIn_20_0 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            String stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            String stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            String stackOut_11_0 = null;
            String stackOut_19_0 = null;
            String stackOut_17_0 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            var8 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var9 = param1.getParameter("cookieprefix");
                      var3 = var9 + "settings";
                      if (!param0) {
                        break L2;
                      } else {
                        hh.a((byte) -44);
                        break L2;
                      }
                    }
                    L3: {
                      var4 = (String) (fd.a(param1, "getcookies", (byte) 116));
                      stackOut_3_0 = (String) (var4);
                      stackOut_3_1 = 59;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (param0) {
                        stackOut_5_0 = (String) ((Object) stackIn_5_0);
                        stackOut_5_1 = stackIn_5_1;
                        stackOut_5_2 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        stackIn_6_2 = stackOut_5_2;
                        break L3;
                      } else {
                        stackOut_4_0 = (String) ((Object) stackIn_4_0);
                        stackOut_4_1 = stackIn_4_1;
                        stackOut_4_2 = 1;
                        stackIn_6_0 = stackOut_4_0;
                        stackIn_6_1 = stackOut_4_1;
                        stackIn_6_2 = stackOut_4_2;
                        break L3;
                      }
                    }
                    var5 = b.a(stackIn_6_0, (char) stackIn_6_1, stackIn_6_2 != 0);
                    var6 = 0;
                    L4: while (true) {
                      L5: {
                        if (var5.length <= var6) {
                          break L5;
                        } else {
                          var7 = var5[var6].indexOf('=');
                          if (var8 != 0) {
                            break L5;
                          } else {
                            L6: {
                              if (0 > var7) {
                                break L6;
                              } else {
                                if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                                  break L6;
                                } else {
                                  stackOut_11_0 = var5[var6].substring(var7 - -1).trim();
                                  stackIn_12_0 = stackOut_11_0;
                                  decompiledRegionSelector0 = 1;
                                  break L1;
                                }
                              }
                            }
                            var6++;
                            if (var8 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var2_ref = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L7;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (td.field_i == null) {
                    stackOut_19_0 = param1.getParameter("settings");
                    stackIn_20_0 = stackOut_19_0;
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    stackOut_17_0 = td.field_i;
                    stackIn_18_0 = stackOut_17_0;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector1 = 2;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_21_0 = (RuntimeException) (var2);
                stackOut_21_1 = new StringBuilder().append("hh.D(").append(param0).append(',');
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (param1 == null) {
                  stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
                  stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
                  stackOut_23_2 = "null";
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  break L8;
                } else {
                  stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackOut_22_2 = "{...}";
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  break L8;
                }
              }
              throw fc.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_20_0;
              } else {
                return stackIn_12_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private hh() throws Throwable {
        throw new Error();
    }

    static {
        field_N = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_J = "Login: ";
    }
}
