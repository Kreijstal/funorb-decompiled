/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends hc {
    static ea[] field_O;
    private aa field_I;
    private int field_N;
    static String[] field_K;
    static String[] field_R;
    static bj field_L;
    int field_J;
    static long field_Q;
    static String field_M;
    int field_P;

    public static void a(int param0) {
        boolean discarded$0 = false;
        field_K = null;
        field_O = null;
        field_R = null;
        field_L = null;
        field_M = null;
        if (param0 != 2) {
            discarded$0 = ne.a((byte) 76, -30);
        }
    }

    final static int a(boolean param0) {
        if (param0) {
            field_R = (String[]) null;
            return -1422590333 ^ pj.field_b;
        }
        return -1422590333 ^ pj.field_b;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            int discarded$2 = 0;
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            try {
              try {
                L0: {
                  L1: {
                    var2 = param0.getDocumentBase().getFile();
                    var3 = var2.indexOf('?');
                    if (param1 == 30433) {
                      break L1;
                    } else {
                      discarded$2 = ne.a(false);
                      break L1;
                    }
                  }
                  L2: {
                    var4 = "reload.ws";
                    if (-1 >= (var3 ^ -1)) {
                      var4 = var4 + var2.substring(var3);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var5 = new java.net.URL(param0.getCodeBase(), var4);
                  param0.getAppletContext().showDocument(nn.a(param1 + -30307, param0, var5), "_self");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) (var2_ref2);
                stackOut_9_1 = new StringBuilder().append("ne.I(");
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param0 == null) {
                  stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L3;
                } else {
                  stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
                  stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L3;
                }
              }
              throw lj.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte param0) {
        if (param0 != -84) {
            ne.a(-91);
            return this.field_N;
        }
        return this.field_N;
    }

    final static void a(int param0, int param1) {
        od.a(128, param0, oc.field_f, 4);
        int var2 = 45 % ((-17 - param1) / 46);
    }

    final int m(int param0) {
        java.applet.Applet var3 = null;
        if (param0 != 22302) {
          var3 = (java.applet.Applet) null;
          ne.a((java.applet.Applet) null, 18);
          return this.field_I.b(5717);
        } else {
          return this.field_I.b(5717);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var14 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (super.a(param0, param1, param2 + param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -this.field_J + param0 - param6;
                var9 = this.field_v - 2 * this.field_J;
                if (var8_int > var9) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var8_int < 0) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                L4: {
                  var8_int = var8_int * this.field_N / var9;
                  if (param4 != 1) {
                    break L4;
                  } else {
                    this.field_I.d(6524, var8_int);
                    if (var14 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (2 == param4) {
                  var10 = 2147483647;
                  var11 = -1;
                  var12 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (this.field_I.b(5717) <= var12) {
                          break L7;
                        } else {
                          var13 = this.field_I.a(var12, (byte) 7) + -var8_int;
                          var13 = var13 * var13;
                          stackOut_16_0 = var10;
                          stackOut_16_1 = var13;
                          stackIn_19_0 = stackOut_16_0;
                          stackIn_19_1 = stackOut_16_1;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          if (var14 != 0) {
                            if (stackIn_19_0 >= stackIn_19_1) {
                              break L6;
                            } else {
                              break L3;
                            }
                          } else {
                            L8: {
                              if (stackIn_17_0 > stackIn_17_1) {
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
                      if (-1 >= (var11 ^ -1)) {
                        break L6;
                      } else {
                        break L3;
                      }
                    }
                    this.field_I.c(var11, 0);
                    break L3;
                  }
                } else {
                  return true;
                }
              }
              stackOut_26_0 = 1;
              stackIn_27_0 = stackOut_26_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var8 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var8);
            stackOut_28_1 = new StringBuilder().append("ne.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param5 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param6 + ')');
        }
        return stackIn_27_0 != 0;
    }

    final static boolean a(int param0, char[] param1, sb param2, byte param3) {
        int discarded$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param0 == param1[0]) {
              var4_int = param2.field_o;
              var5 = 1;
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (param1.length <= var5) {
                        break L4;
                      } else {
                        stackOut_6_0 = param2.field_o;
                        stackOut_6_1 = param2.field_u.length;
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        if (var6 != 0) {
                          if (stackIn_9_0 < stackIn_9_1) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          L5: {
                            if (stackIn_7_0 == stackIn_7_1) {
                              break L5;
                            } else {
                              if (param2.m(4) == param1[var5]) {
                                var5++;
                                if (var6 == 0) {
                                  continue L1;
                                } else {
                                  break L4;
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                          param2.field_o = var4_int;
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                    if (param3 < -3) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  discarded$1 = ne.a(false);
                  break L2;
                }
                param2.field_o = var4_int;
                stackOut_18_0 = 1;
                stackIn_19_0 = stackOut_18_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("ne.J(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            return stackIn_19_0 != 0;
          }
        }
    }

    private ne() throws Throwable {
        throw new Error();
    }

    final static boolean a(byte param0, int param1) {
        if (sj.field_d == null) {
            return false;
        }
        if (param0 != 10) {
            return false;
        }
        return nm.a(param1, sj.field_d, -827843803);
    }

    final int a(int param0, boolean param1) {
        if (0 <= param0) {
          if (this.field_I.b(5717) > param0) {
            if (!param1) {
              return -40;
            } else {
              return this.field_I.a(param0, (byte) -119);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    static {
        field_O = new ea[4];
        field_R = new String[]{"Welcome to the Miner Market - the last stop before the volcano. You have 500 gold to spend and you'll have to spend it all before we let you go any further. Less experienced miners should opt to buy the basic kit by clicking the above button. Once you're done, click Start Game to get on with it. We hope you fare better than the last lot.", "Welcome to the Miner Market - the last stop before the Super Volcano. You have 600 gold to spend and you'll have to spend it all before we let you go any further. Less experienced miners should opt to buy the basic kit by clicking the above button. Once you're done, click Start Game to get on with it. We hope you fare better than the last lot."};
        field_M = "Gold: <%0>";
    }
}
