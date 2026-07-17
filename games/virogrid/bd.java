/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd {
    static dl field_d;
    static p field_c;
    static int field_e;
    static String[] field_a;
    static km field_b;

    public static void a(int param0) {
        field_d = null;
        if (param0 <= 45) {
            return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static rm a(int param0, int param1, int param2, eh param3) {
        RuntimeException var4 = null;
        Object var5 = null;
        rm stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        rm stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (hn.a(param3, param1, param0, (byte) 109)) {
              L1: {
                if (param2 == -2071) {
                  break L1;
                } else {
                  var5 = null;
                  co discarded$2 = bd.a(59, (java.applet.Applet) null);
                  break L1;
                }
              }
              stackOut_5_0 = bk.a(35);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("bd.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final static co a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        co[] var3 = null;
        int var4 = 0;
        co var5 = null;
        int var6 = 0;
        co stackIn_3_0 = null;
        co stackIn_11_0 = null;
        co stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        co stackOut_13_0 = null;
        co stackOut_10_0 = null;
        co stackOut_2_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2 = wd.a(0, param1, "jagex-last-login-method");
            if (var2 != null) {
              L1: {
                var3 = wn.a(5);
                if (param0 < -46) {
                  break L1;
                } else {
                  bd.a(-88);
                  break L1;
                }
              }
              var4 = 0;
              L2: while (true) {
                if (var3.length <= var4) {
                  stackOut_13_0 = nd.field_j;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a((byte) 115, var2)) {
                    stackOut_10_0 = (co) var5;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              stackOut_2_0 = nd.field_j;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2_ref;
            stackOut_15_1 = new StringBuilder().append("bd.C(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_14_0;
    }

    final static void a(int param0, int param1, ri param2, e param3, String param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = -1;
              var7 = 1;
              if (param0 > 28) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: while (true) {
              if (param4.length() <= var7) {
                break L0;
              } else {
                L3: {
                  var8 = param4.charAt(var7);
                  if (var8 != 60) {
                    break L3;
                  } else {
                    var6 = param2.field_d[0] + ((var5_int >> 8) + param3.a(param4.substring(0, var7)));
                    break L3;
                  }
                }
                L4: {
                  if (var6 != -1) {
                    param2.field_d[var7] = var6;
                    break L4;
                  } else {
                    L5: {
                      if (var8 != 32) {
                        break L5;
                      } else {
                        var5_int = var5_int + param1;
                        break L5;
                      }
                    }
                    param2.field_d[var7] = param2.field_d[0] + ((var5_int >> 8) - -param3.a(param4.substring(0, var7 - -1)) + -param3.a((char) var8));
                    break L4;
                  }
                }
                L6: {
                  if (62 != var8) {
                    var7++;
                    break L6;
                  } else {
                    var6 = -1;
                    break L6;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var5;
            stackOut_16_1 = new StringBuilder().append("bd.B(").append(param0).append(44).append(param1).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int stackIn_21_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        if (!param1) {
          if (vl.field_i[param3] <= vl.field_i[param2]) {
            if (vl.field_i[param3] < vl.field_i[param2]) {
              return false;
            } else {
              if (wh.field_c[param2] >= wh.field_c[param3]) {
                if (wh.field_c[param2] <= wh.field_c[param3]) {
                  var4 = kf.field_j[param2] + (vc.field_jb[param2] - -tg.field_A[param2]);
                  if (param0 != 3005) {
                    var6 = null;
                    bd.a(65, 53, (ri) null, (e) null, (String) null);
                    var5 = vc.field_jb[param3] - -tg.field_A[param3] + kf.field_j[param3];
                    if (var5 <= var4) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L0: {
                          if (param2 >= param3) {
                            stackOut_57_0 = 0;
                            stackIn_58_0 = stackOut_57_0;
                            break L0;
                          } else {
                            stackOut_56_0 = 1;
                            stackIn_58_0 = stackOut_56_0;
                            break L0;
                          }
                        }
                        return stackIn_58_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    var5 = vc.field_jb[param3] - -tg.field_A[param3] + kf.field_j[param3];
                    if (var5 <= var4) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L1: {
                          if (param2 >= param3) {
                            stackOut_48_0 = 0;
                            stackIn_49_0 = stackOut_48_0;
                            break L1;
                          } else {
                            stackOut_47_0 = 1;
                            stackIn_49_0 = stackOut_47_0;
                            break L1;
                          }
                        }
                        return stackIn_49_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        } else {
          if (wh.field_c[param2] >= wh.field_c[param3]) {
            if (wh.field_c[param2] > wh.field_c[param3]) {
              return false;
            } else {
              if (vl.field_i[param3] > vl.field_i[param2]) {
                return true;
              } else {
                if (vl.field_i[param3] >= vl.field_i[param2]) {
                  var4 = kf.field_j[param2] + (vc.field_jb[param2] - -tg.field_A[param2]);
                  if (param0 != 3005) {
                    var6 = null;
                    bd.a(65, 53, (ri) null, (e) null, (String) null);
                    var5 = vc.field_jb[param3] - -tg.field_A[param3] + kf.field_j[param3];
                    if (var5 <= var4) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        if (param2 >= param3) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      return true;
                    }
                  } else {
                    var5 = vc.field_jb[param3] - -tg.field_A[param3] + kf.field_j[param3];
                    if (var5 <= var4) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L2: {
                          if (param2 >= param3) {
                            stackOut_20_0 = 0;
                            stackIn_21_0 = stackOut_20_0;
                            break L2;
                          } else {
                            stackOut_19_0 = 1;
                            stackIn_21_0 = stackOut_19_0;
                            break L2;
                          }
                        }
                        return stackIn_21_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new dl();
    }
}
