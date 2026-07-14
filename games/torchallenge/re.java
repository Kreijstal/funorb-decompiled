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
            boolean discarded$0 = re.a(86, -45, 70, -5);
        }
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
            var4 = param1 >> -1060072240 & -1;
            param1 = 65535 & param1;
            if (-1 >= (var4 ^ -1)) {
              if (var4 <= 1) {
                if (0 <= param1) {
                  if ((param1 ^ -1) > -4) {
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        var2 = param0.length();
        if (-1 == var2) {
          return dj.field_W;
        } else {
          if (-65 < var2) {
            return uk.field_I;
          } else {
            if (param0.charAt(0) == 34) {
              if (param0.charAt(-1 + var2) == 34) {
                var3 = 0;
                var4 = 1;
                L0: while (true) {
                  if (var2 - 1 > var4) {
                    var5 = param0.charAt(var4);
                    if (var5 != 92) {
                      L1: {
                        if (var5 != 34) {
                          break L1;
                        } else {
                          if (var3 != 0) {
                            break L1;
                          } else {
                            return di.field_g;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L0;
                    } else {
                      L2: {
                        if (var3 != 0) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          break L2;
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L2;
                        }
                      }
                      var3 = stackIn_17_0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return di.field_g;
              }
            } else {
              L3: {
                var3 = 0;
                if (param1 == 104) {
                  break L3;
                } else {
                  var7 = null;
                  vi discarded$1 = re.a((String) null, (byte) -97);
                  break L3;
                }
              }
              var4 = 0;
              L4: while (true) {
                if (var4 < var2) {
                  var5 = param0.charAt(var4);
                  if (var5 != 46) {
                    if (0 != (rk.field_h.indexOf(var5) ^ -1)) {
                      var3 = 0;
                      var4++;
                      continue L4;
                    } else {
                      return di.field_g;
                    }
                  } else {
                    L5: {
                      if (0 == var4) {
                        break L5;
                      } else {
                        if (var4 == -1 + var2) {
                          break L5;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    return di.field_g;
                  }
                } else {
                  return null;
                }
              }
            }
          }
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
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                            param0.getAppletContext().showDocument(mc.a(var2, -1, param0), "_top");
                            if (param1 == 7184) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            field_B = null;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var2_ref = (Exception) (Object) caughtException;
                        var2_ref.printStackTrace();
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    re(Object param0, int param1) {
        super(param1);
        ((re) this).field_y = param0;
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
        if (param0 != 18990) {
            boolean discarded$0 = re.a(-67, -69, 50, -31);
        }
        return r.a(param1.length, 0, param1, (byte) 8);
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
