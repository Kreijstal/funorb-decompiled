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
        if (param0 > -77) {
            re.a(86, -45, 70, -5);
        }
        field_B = null;
        field_v = (ka[][]) null;
        field_z = null;
        field_x = (ka[][]) null;
        field_w = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        int var6;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        if (param1 != param0) {
          L0: {
            var4 = param1 >> -1060072240 & -1;
            param1 = 65535 & param1;
            if (-1 >= (var4 ^ -1)) {
              if (var4 <= 1) {
                if (0 <= param1) {
                  if ((param1 ^ -1) > -4) {
                    stackIn_12_0 = 1;
                    break L0;
                  } else {
                    stackIn_12_0 = 0;
                    break L0;
                  }
                } else {
                  stackIn_12_0 = 0;
                  break L0;
                }
              } else {
                stackIn_12_0 = 0;
                break L0;
              }
            } else {
              stackIn_12_0 = 0;
              break L0;
            }
          }
          var5 = stackIn_12_0;
          if (var5 != 0) {
            L1: {
              if (param2 == var4) {
                if (param3 != param1) {
                  if (0 > param3) {
                    stackIn_22_0 = 1;
                    break L1;
                  } else {
                    stackIn_22_0 = 0;
                    break L1;
                  }
                } else {
                  stackIn_22_0 = 1;
                  break L1;
                }
              } else {
                stackIn_22_0 = 0;
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
        vi stackIn_4_0 = null;
        vi stackIn_8_0 = null;
        vi stackIn_13_0 = null;
        int stackIn_21_0 = 0;
        vi stackIn_25_0 = null;
        vi stackIn_40_0 = null;
        vi stackIn_44_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        var6 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (-1 == (var2_int ^ -1)) {
              stackIn_4_0 = dj.field_W;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-65 > (var2_int ^ -1)) {
                stackIn_8_0 = uk.field_I;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0.charAt(0) == 34) {
                  if (param0.charAt(-1 + var2_int) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      if (var2_int - 1 > var4) {
                        L2: {
                          var5 = param0.charAt(var4);
                          if (var5 != 92) {
                            L3: {
                              if (var5 != 34) {
                                break L3;
                              } else {
                                if (var3 != 0) {
                                  break L3;
                                } else {
                                  stackIn_25_0 = di.field_g;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              }
                            }
                            var3 = 0;
                            break L2;
                          } else {
                            L4: {
                              if (var3 != 0) {
                                stackIn_21_0 = 0;
                                break L4;
                              } else {
                                stackIn_21_0 = 1;
                                break L4;
                              }
                            }
                            var3 = stackIn_21_0;
                            break L2;
                          }
                        }
                        var4++;
                        continue L1;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_13_0 = di.field_g;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  L5: {
                    var3 = 0;
                    if (param1 == 104) {
                      break L5;
                    } else {
                      var7 = (String) null;
                      re.a((String) null, (byte) -97);
                      break L5;
                    }
                  }
                  var4 = 0;
                  L6: while (true) {
                    if (var4 < var2_int) {
                      L7: {
                        var5 = param0.charAt(var4);
                        if (var5 != 46) {
                          if (0 != (rk.field_h.indexOf(var5) ^ -1)) {
                            var3 = 0;
                            break L7;
                          } else {
                            stackIn_44_0 = di.field_g;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        } else {
                          L8: {
                            if (0 == var4) {
                              break L8;
                            } else {
                              if (var4 == -1 + var2_int) {
                                break L8;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          stackIn_40_0 = di.field_g;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                      var4++;
                      continue L6;
                    } else {
                      return null;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var2);

            stackIn_50_1 = new StringBuilder().append("re.I(");

            if (param0 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L9;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L9;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_40_0;
                } else {
                  return stackIn_44_0;
                }
              }
            }
          }
        }
    }

    final Object c(byte param0) {
        if (param0 != 70) {
            field_z = (String) null;
        }
        return this.field_y;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            String stackIn_8_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
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
                        field_B = (kh) null;
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
                stackIn_7_0 = (RuntimeException) (var2_ref2);

                stackIn_7_1 = new StringBuilder().append("re.K(");

                if (param0 == null) {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "null";
                  break L4;
                } else {
                  stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackIn_8_2 = "{...}";
                  break L4;
                }
              }
              throw oj.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
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
            this.field_y = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 != 1024) {
            String var3 = (String) null;
            re.a((String) null, (byte) -106);
            return false;
        }
        return false;
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 18990) {
                break L1;
              } else {
                re.a(-67, -69, 50, -31);
                break L1;
              }
            }
            stackIn_3_0 = r.a(param1.length, 0, param1, (byte) 8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("re.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_w = new int[]{1, 1, 2, 2, 3, 1, 2, 3, 1, 2, 2, 3, 1, 2, 3, 3, 1};
        field_z = "Please try again in a few minutes.";
        field_v = new ka[2][2];
        field_x = new ka[9][];
    }
}
