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
        try {
            field_K = null;
            field_O = null;
            field_R = null;
            field_L = null;
            field_M = null;
            if (param0 != 2) {
                boolean discarded$0 = ne.a((byte) 76, -30);
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ne.B(" + param0 + ')');
        }
    }

    final static int a(boolean param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_R = null;
                break L1;
              }
            }
            stackOut_3_0 = -1422590333 ^ pj.field_b;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "ne.G(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = param0.getDocumentBase().getFile();
                      var3 = var2.indexOf('?');
                      if (param1 == 30433) {
                        break L2;
                      } else {
                        int discarded$2 = ne.a(false);
                        break L2;
                      }
                    }
                    L3: {
                      var4 = "reload.ws";
                      if (var3 >= 0) {
                        var4 = var4 + var2.substring(var3);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var5 = new java.net.URL(param0.getCodeBase(), var4);
                    param0.getAppletContext().showDocument(nn.a(param1 + -30307, param0, var5), "_self");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var2_ref2;
                stackOut_11_1 = new StringBuilder().append("ne.I(");
                stackIn_14_0 = stackOut_11_0;
                stackIn_14_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param0 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  stackIn_15_2 = stackOut_12_2;
                  break L5;
                }
              }
              throw lj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -84) {
                break L1;
              } else {
                ne.a(-91);
                break L1;
              }
            }
            stackOut_3_0 = ((ne) this).field_N;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "ne.H(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1) {
        try {
            od.a(128, param0, oc.field_f, 4);
            int var2_int = 45 % ((-17 - param1) / 46);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ne.E(" + param0 + ',' + param1 + ')');
        }
    }

    final int m(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 22302) {
                break L1;
              } else {
                ne.a((java.applet.Applet) null, 18);
                break L1;
              }
            }
            stackOut_3_0 = ((ne) this).field_I.b(5717);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "ne.C(" + param0 + ')');
        }
        return stackIn_4_0;
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
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var14 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (super.a(param0, param1, param2 + param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = -((ne) this).field_J + param0 - param6;
                var9 = ((ne) this).field_v - 2 * ((ne) this).field_J;
                if (~var8_int < ~var9) {
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
                  var8_int = var8_int * ((ne) this).field_N / var9;
                  if (param4 != 1) {
                    break L4;
                  } else {
                    ((ne) this).field_I.d(6524, var8_int);
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
                        if (~((ne) this).field_I.b(5717) >= ~var12) {
                          break L7;
                        } else {
                          var13 = ((ne) this).field_I.a(var12, (byte) 7) + -var8_int;
                          var13 = var13 * var13;
                          stackOut_23_0 = var10;
                          stackOut_23_1 = var13;
                          stackIn_31_0 = stackOut_23_0;
                          stackIn_31_1 = stackOut_23_1;
                          stackIn_24_0 = stackOut_23_0;
                          stackIn_24_1 = stackOut_23_1;
                          if (var14 != 0) {
                            break L6;
                          } else {
                            L8: {
                              if (stackIn_24_0 > stackIn_24_1) {
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
                      stackOut_30_0 = -1;
                      stackOut_30_1 = ~var11;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      break L6;
                    }
                    if (stackIn_31_0 >= stackIn_31_1) {
                      ((ne) this).field_I.c(var11, 0);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              stackOut_34_0 = 1;
              stackIn_35_0 = stackOut_34_0;
              return stackIn_35_0 != 0;
            } else {
              stackOut_36_0 = 0;
              stackIn_37_0 = stackOut_36_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var8 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var8;
            stackOut_38_1 = new StringBuilder().append("ne.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param5 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L9;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L9;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + param6 + ')');
        }
        return stackIn_37_0 != 0;
    }

    final static boolean a(int param0, char[] param1, sb param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_13_0 = 0;
        byte stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (~param0 == ~param1[0]) {
              var4_int = param2.field_o;
              var5 = 1;
              L1: while (true) {
                L2: {
                  L3: {
                    if (param1.length <= var5) {
                      break L3;
                    } else {
                      stackOut_6_0 = param2.field_o;
                      stackOut_6_1 = param2.field_u.length;
                      stackIn_17_0 = stackOut_6_0;
                      stackIn_17_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0 == stackIn_7_1) {
                            break L4;
                          } else {
                            if (~param2.m(4) == ~param1[var5]) {
                              var5++;
                              if (var6 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                        param2.field_o = var4_int;
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      }
                    }
                  }
                  stackOut_16_0 = param3;
                  stackOut_16_1 = -3;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  break L2;
                }
                L5: {
                  if (stackIn_17_0 < stackIn_17_1) {
                    break L5;
                  } else {
                    int discarded$2 = ne.a(false);
                    break L5;
                  }
                }
                param2.field_o = var4_int;
                stackOut_20_0 = 1;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("ne.J(").append(param0).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L6;
            }
          }
          L7: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L7;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param3 + ')');
        }
        return stackIn_21_0 != 0;
    }

    private ne() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "ne.<init>()");
        }
    }

    final static boolean a(byte param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (sj.field_d != null) {
              if (param0 == 10) {
                stackOut_6_0 = nm.a(param1, sj.field_d, -827843803);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "ne.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final int a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (0 > param0) {
                break L1;
              } else {
                if (((ne) this).field_I.b(5717) > param0) {
                  if (param1) {
                    stackOut_9_0 = ((ne) this).field_I.a(param0, (byte) -119);
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  } else {
                    stackOut_7_0 = -40;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = -1;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var3, "ne.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new ea[4];
        field_R = new String[]{"Welcome to the Miner Market - the last stop before the volcano. You have 500 gold to spend and you'll have to spend it all before we let you go any further. Less experienced miners should opt to buy the basic kit by clicking the above button. Once you're done, click Start Game to get on with it. We hope you fare better than the last lot.", "Welcome to the Miner Market - the last stop before the Super Volcano. You have 600 gold to spend and you'll have to spend it all before we let you go any further. Less experienced miners should opt to buy the basic kit by clicking the above button. Once you're done, click Start Game to get on with it. We hope you fare better than the last lot."};
        field_M = "Gold: <%0>";
    }
}
