/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends lb {
    private Object field_y;
    static String field_z;
    static ka[][] field_v;
    static kh field_B;
    static int[] field_w;
    static ka[][] field_x;
    static int field_A;

    public static void e(byte param0) {
        field_B = null;
        field_v = null;
        field_z = null;
        field_x = null;
        field_w = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        if (param1 != param0) {
          L0: {
            var4 = param1 >> 16;
            param1 = 65535 & param1;
            if (var4 >= 0) {
              if (var4 <= 1) {
                if (0 <= param1) {
                  if (param1 < 3) {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L0;
                  } else {
                    stackOut_9_0 = 0;
                    stackIn_12_0 = stackOut_9_0;
                    break L0;
                  }
                } else {
                  stackOut_7_0 = 0;
                  stackIn_12_0 = stackOut_7_0;
                  break L0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_12_0 = stackOut_5_0;
                break L0;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_12_0 = stackOut_3_0;
              break L0;
            }
          }
          var5 = stackIn_12_0;
          if (var5 != 0) {
            L1: {
              if (param2 == var4) {
                if (param3 != param1) {
                  if (0 > param3) {
                    stackOut_20_0 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    break L1;
                  } else {
                    stackOut_19_0 = 0;
                    stackIn_22_0 = stackOut_19_0;
                    break L1;
                  }
                } else {
                  stackOut_17_0 = 1;
                  stackIn_22_0 = stackOut_17_0;
                  break L1;
                }
              } else {
                stackOut_15_0 = 0;
                stackIn_22_0 = stackOut_15_0;
                break L1;
              }
            }
            var6 = stackIn_22_0;
            return var6 != 0;
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static vi a(String param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        vi stackIn_4_0 = null;
        vi stackIn_8_0 = null;
        vi stackIn_13_0 = null;
        int stackIn_21_0 = 0;
        vi stackIn_25_0 = null;
        vi stackIn_40_0 = null;
        vi stackIn_44_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        vi stackOut_3_0 = null;
        vi stackOut_7_0 = null;
        vi stackOut_24_0 = null;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        vi stackOut_12_0 = null;
        vi stackOut_43_0 = null;
        vi stackOut_39_0 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackOut_3_0 = dj.field_W;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int > 64) {
              stackOut_7_0 = uk.field_I;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              if (param0.charAt(0) == 34) {
                if (param0.charAt(-1 + var2_int) == 34) {
                  var3 = 0;
                  var4 = 1;
                  L0: while (true) {
                    if (var2_int - 1 > var4) {
                      L1: {
                        var5 = param0.charAt(var4);
                        if (var5 != 92) {
                          L2: {
                            if (var5 != 34) {
                              break L2;
                            } else {
                              if (var3 != 0) {
                                break L2;
                              } else {
                                stackOut_24_0 = di.field_g;
                                stackIn_25_0 = stackOut_24_0;
                                return stackIn_25_0;
                              }
                            }
                          }
                          var3 = 0;
                          break L1;
                        } else {
                          L3: {
                            if (var3 != 0) {
                              stackOut_20_0 = 0;
                              stackIn_21_0 = stackOut_20_0;
                              break L3;
                            } else {
                              stackOut_19_0 = 1;
                              stackIn_21_0 = stackOut_19_0;
                              break L3;
                            }
                          }
                          var3 = stackIn_21_0;
                          break L1;
                        }
                      }
                      var4++;
                      continue L0;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_12_0 = di.field_g;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              } else {
                L4: {
                  var3 = 0;
                  if (param1 == 104) {
                    break L4;
                  } else {
                    var7 = null;
                    vi discarded$1 = re.a((String) null, (byte) -97);
                    break L4;
                  }
                }
                var4 = 0;
                L5: while (true) {
                  if (~var4 > ~var2_int) {
                    L6: {
                      var5 = param0.charAt(var4);
                      if (var5 != 46) {
                        if (rk.field_h.indexOf(var5) != -1) {
                          var3 = 0;
                          break L6;
                        } else {
                          stackOut_43_0 = di.field_g;
                          stackIn_44_0 = stackOut_43_0;
                          return stackIn_44_0;
                        }
                      } else {
                        L7: {
                          if (0 == var4) {
                            break L7;
                          } else {
                            if (var4 == -1 + var2_int) {
                              break L7;
                            } else {
                              if (var3 == 0) {
                                var3 = 1;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        stackOut_39_0 = di.field_g;
                        stackIn_40_0 = stackOut_39_0;
                        return stackIn_40_0;
                      }
                    }
                    var4++;
                    continue L5;
                  } else {
                    return null;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var2;
            stackOut_48_1 = new StringBuilder().append("re.I(");
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param0 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L8;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L8;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + 44 + param1 + 41);
        }
    }

    final Object c(byte param0) {
        if (param0 != 70) {
            field_z = null;
        }
        return ((re) this).field_y;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    L2: {
                      var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                      param0.getAppletContext().showDocument(mc.a(var2, -1, param0), "_top");
                      if (param1 == 7184) {
                        break L2;
                      } else {
                        field_B = null;
                        break L2;
                      }
                    }
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_5_0 = (RuntimeException) var2_ref2;
                stackOut_5_1 = new StringBuilder().append("re.K(");
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (param0 == null) {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "null";
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L4;
                } else {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "{...}";
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L4;
                }
              }
              throw oj.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    re(Object param0, int param1) {
        super(param1);
        try {
            ((re) this).field_y = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "re.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final boolean e(int param0) {
        if (param0 != 1024) {
            Object var3 = null;
            vi discarded$0 = re.a((String) null, (byte) -106);
            return false;
        }
        return false;
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 18990) {
                break L1;
              } else {
                boolean discarded$2 = re.a(-67, -69, 50, -31);
                break L1;
              }
            }
            stackOut_2_0 = r.a(param1.length, 0, param1, (byte) 8);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("re.H(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new int[]{1, 1, 2, 2, 3, 1, 2, 3, 1, 2, 2, 3, 1, 2, 3, 3, 1};
        field_z = "Please try again in a few minutes.";
        field_v = new ka[2][2];
        field_x = new ka[9][];
    }
}
