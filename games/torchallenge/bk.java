/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends da {
    int field_u;
    static boolean field_w;
    static int field_i;
    static sl field_t;
    static String field_n;
    static String field_l;
    static int field_p;
    static String field_r;
    int field_v;
    int field_m;
    int field_j;
    int field_o;
    int field_k;
    static int[] field_q;
    static int[] field_s;

    final static boolean a(int param0, char param1) {
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_18_0 = 0;
        if (param0 == 32191) {
          if (param1 < 65) {
            if (97 <= param1) {
              if (param1 <= 122) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (param1 > 90) {
              L0: {
                L1: {
                  if (97 > param1) {
                    break L1;
                  } else {
                    if (param1 > 122) {
                      break L1;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L0;
                    }
                  }
                }
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L0;
              }
              return stackIn_25_0 != 0;
            } else {
              stackOut_18_0 = 1;
              stackIn_20_0 = stackOut_18_0;
              return stackIn_20_0 != 0;
            }
          }
        } else {
          field_q = null;
          if (param1 >= 65) {
            if (param1 > 90) {
              if (97 <= param1) {
                if (param1 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            if (97 <= param1) {
              if (param1 > 122) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    bk(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((bk) this).field_u = param4;
        ((bk) this).field_k = param3;
        ((bk) this).field_v = param0;
        ((bk) this).field_o = param1;
        ((bk) this).field_j = param5;
        ((bk) this).field_m = param2;
    }

    final static boolean a(CharSequence param0, boolean param1, byte param2) {
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        String var10 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        if (param2 < -66) {
          if (param0 == null) {
            return false;
          } else {
            var3 = param0.length();
            if (1 <= var3) {
              if (var3 <= 12) {
                var10 = il.a(param0, (byte) 21);
                if (var10 != null) {
                  if (var10.length() >= 1) {
                    if (!ak.a(95, var10.charAt(0))) {
                      if (!ak.a(95, var10.charAt(-1 + var10.length()))) {
                        var5 = 0;
                        var6 = 0;
                        L0: while (true) {
                          if (param0.length() <= var6) {
                            if (var5 > 0) {
                              return false;
                            } else {
                              return true;
                            }
                          } else {
                            L1: {
                              var7 = param0.charAt(var6);
                              if (!ak.a(95, (char) var7)) {
                                var5 = 0;
                                break L1;
                              } else {
                                var5++;
                                break L1;
                              }
                            }
                            if ((var5 ^ -1) > -3) {
                              var6++;
                              var6++;
                              continue L0;
                            } else {
                              if (!param1) {
                                return false;
                              } else {
                                var6++;
                                continue L0;
                              }
                            }
                          }
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          field_l = null;
          if (param0 == null) {
            return false;
          } else {
            var3 = param0.length();
            if (1 <= var3) {
              if (var3 <= 12) {
                var9 = il.a(param0, (byte) 21);
                if (var9 != null) {
                  if (var9.length() >= 1) {
                    if (!ak.a(95, var9.charAt(0))) {
                      if (!ak.a(95, var9.charAt(-1 + var9.length()))) {
                        var5 = 0;
                        var6 = 0;
                        L2: while (true) {
                          if (param0.length() <= var6) {
                            if (var5 > 0) {
                              return false;
                            } else {
                              return true;
                            }
                          } else {
                            L3: {
                              var7 = param0.charAt(var6);
                              if (!ak.a(95, (char) var7)) {
                                var5 = 0;
                                break L3;
                              } else {
                                var5++;
                                break L3;
                              }
                            }
                            if ((var5 ^ -1) > -3) {
                              var6++;
                              var6++;
                              continue L2;
                            } else {
                              if (!param1) {
                                return false;
                              } else {
                                var6++;
                                continue L2;
                              }
                            }
                          }
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_s = null;
        field_n = null;
        field_r = null;
        field_l = null;
        field_q = null;
        int var1 = 34 / ((-79 - param0) / 43);
        field_t = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = false;
        field_p = 0;
        field_r = "Unable to connect to the data server. Please check any firewall you are using.";
        field_n = "Connection restored.";
        field_l = "Loading extra data";
        field_t = new sl();
        field_q = new int[8192];
        field_s = new int[4];
    }
}
