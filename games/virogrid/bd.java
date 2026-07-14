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
        Object var5 = null;
        if (hn.a(param3, param1, param0, (byte) 109)) {
          if (param2 != -2071) {
            var5 = null;
            co discarded$2 = bd.a(59, (java.applet.Applet) null);
            return bk.a(35);
          } else {
            return bk.a(35);
          }
        } else {
          return null;
        }
    }

    final static co a(int param0, java.applet.Applet param1) {
        String var2 = null;
        co[] var3 = null;
        int var4 = 0;
        co var5 = null;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        var2 = wd.a(0, param1, "jagex-last-login-method");
        if (var2 != null) {
          var3 = wn.a(5);
          if (param0 < -46) {
            var4 = 0;
            L0: while (true) {
              if (var3.length > var4) {
                var5 = var3[var4];
                if (var5.a((byte) 115, var2)) {
                  return var5;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return nd.field_j;
              }
            }
          } else {
            bd.a(-88);
            var4 = 0;
            L1: while (true) {
              if (var3.length > var4) {
                var5 = var3[var4];
                if (var5.a((byte) 115, var2)) {
                  return var5;
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                return nd.field_j;
              }
            }
          }
        } else {
          return nd.field_j;
        }
    }

    final static void a(int param0, int param1, ri param2, e param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        var5 = 0;
        var6 = -1;
        var7 = 1;
        if (param0 <= 28) {
          field_d = null;
          L0: while (true) {
            if (param4.length() > var7) {
              L1: {
                var8 = param4.charAt(var7);
                if (var8 != 60) {
                  break L1;
                } else {
                  var6 = param2.field_d[0] + ((var5 >> 114749416) + param3.a(param4.substring(0, var7)));
                  break L1;
                }
              }
              L2: {
                if ((var6 ^ -1) != 0) {
                  param2.field_d[var7] = var6;
                  break L2;
                } else {
                  L3: {
                    if (var8 != 32) {
                      break L3;
                    } else {
                      var5 = var5 + param1;
                      break L3;
                    }
                  }
                  param2.field_d[var7] = param2.field_d[0] + ((var5 >> 740336872) - -param3.a(param4.substring(0, var7 - -1)) + -param3.a((char) var8));
                  break L2;
                }
              }
              if (62 != var8) {
                var7++;
                var7++;
                continue L0;
              } else {
                var6 = -1;
                var7++;
                continue L0;
              }
            } else {
              return;
            }
          }
        } else {
          L4: while (true) {
            if (param4.length() > var7) {
              L5: {
                var8 = param4.charAt(var7);
                if (var8 != 60) {
                  break L5;
                } else {
                  var6 = param2.field_d[0] + ((var5 >> 114749416) + param3.a(param4.substring(0, var7)));
                  break L5;
                }
              }
              L6: {
                if ((var6 ^ -1) != 0) {
                  param2.field_d[var7] = var6;
                  break L6;
                } else {
                  L7: {
                    if (var8 != 32) {
                      break L7;
                    } else {
                      var5 = var5 + param1;
                      break L7;
                    }
                  }
                  param2.field_d[var7] = param2.field_d[0] + ((var5 >> 740336872) - -param3.a(param4.substring(0, var7 - -1)) + -param3.a((char) var8));
                  break L6;
                }
              }
              if (62 != var8) {
                var7++;
                var7++;
                continue L4;
              } else {
                var6 = -1;
                var7++;
                continue L4;
              }
            } else {
              return;
            }
          }
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
