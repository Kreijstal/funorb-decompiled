/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md {
    static int field_c;
    static String field_b;
    static int field_a;

    final static String a(boolean param0, CharSequence param1, byte param2) {
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        String var10 = null;
        String var11 = null;
        var8 = StarCannon.field_A;
        if (param1 != null) {
          var3 = param1.length();
          if (-2 >= (var3 ^ -1)) {
            if (12 >= var3) {
              if (param2 == -81) {
                L0: {
                  var11 = ni.a(116, param1);
                  if (var11 == null) {
                    break L0;
                  } else {
                    if (var11.length() < 1) {
                      break L0;
                    } else {
                      if (!dk.a((byte) -123, var11.charAt(0))) {
                        if (!dk.a((byte) -124, var11.charAt(var11.length() - 1))) {
                          var5 = 0;
                          var6 = 0;
                          L1: while (true) {
                            if (param1.length() <= var6) {
                              if ((var5 ^ -1) < -1) {
                                return v.field_c;
                              } else {
                                return null;
                              }
                            } else {
                              L2: {
                                var7 = param1.charAt(var6);
                                if (dk.a((byte) -128, (char) var7)) {
                                  var5++;
                                  break L2;
                                } else {
                                  var5 = 0;
                                  break L2;
                                }
                              }
                              if ((var5 ^ -1) > -3) {
                                var6++;
                                var6++;
                                continue L1;
                              } else {
                                if (!param0) {
                                  return te.field_c;
                                } else {
                                  var6++;
                                  continue L1;
                                }
                              }
                            }
                          }
                        } else {
                          return v.field_c;
                        }
                      } else {
                        return v.field_c;
                      }
                    }
                  }
                }
                return vj.field_W;
              } else {
                var9 = null;
                boolean discarded$1 = md.a(-31, (String) null);
                var10 = ni.a(116, param1);
                if (var10 != null) {
                  if (var10.length() >= 1) {
                    if (!dk.a((byte) -123, var10.charAt(0))) {
                      if (!dk.a((byte) -124, var10.charAt(var10.length() - 1))) {
                        var5 = 0;
                        var6 = 0;
                        L3: while (true) {
                          if (param1.length() <= var6) {
                            if ((var5 ^ -1) < -1) {
                              return v.field_c;
                            } else {
                              return null;
                            }
                          } else {
                            L4: {
                              var7 = param1.charAt(var6);
                              if (dk.a((byte) -128, (char) var7)) {
                                var5++;
                                break L4;
                              } else {
                                var5 = 0;
                                break L4;
                              }
                            }
                            if ((var5 ^ -1) > -3) {
                              var6++;
                              var6++;
                              continue L3;
                            } else {
                              if (!param0) {
                                return te.field_c;
                              } else {
                                var6++;
                                continue L3;
                              }
                            }
                          }
                        }
                      } else {
                        return v.field_c;
                      }
                    } else {
                      return v.field_c;
                    }
                  } else {
                    return vj.field_W;
                  }
                } else {
                  return vj.field_W;
                }
              }
            } else {
              return vj.field_W;
            }
          } else {
            return vj.field_W;
          }
        } else {
          return vj.field_W;
        }
    }

    public static void a(int param0) {
        if (param0 != -27240) {
            return;
        }
        field_b = null;
    }

    final static boolean a(int param0, String param1) {
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        if (param0 == -1) {
          if (param1 != null) {
            if (param1.length() < rj.field_j) {
              return true;
            } else {
              L0: {
                if (param1.length() > wc.field_a) {
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  break L0;
                }
              }
              return stackIn_15_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          field_b = null;
          if (param1 != null) {
            if (param1.length() >= rj.field_j) {
              if (param1.length() <= wc.field_a) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
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
        field_c = 4;
        field_a = -1;
    }
}
