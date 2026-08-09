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
        if (param0 == 32191) {
          if (param1 < 65) {
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
          }
        } else {
          field_q = (int[]) null;
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
        this.field_u = param4;
        this.field_k = param3;
        this.field_v = param0;
        this.field_o = param1;
        this.field_j = param5;
        this.field_m = param2;
    }

    final static boolean a(CharSequence param0, boolean param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 < -66) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            if (param0 == null) {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = param0.length();
              if (1 > var3_int) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (var3_int <= 12) {
                  L2: {
                    var4 = il.a(param0, (byte) 21);
                    if (var4 == null) {
                      break L2;
                    } else {
                      if (var4.length() >= 1) {
                        L3: {
                          if (ak.a(95, var4.charAt(0))) {
                            break L3;
                          } else {
                            if (!ak.a(95, var4.charAt(-1 + var4.length()))) {
                              var5 = 0;
                              var6 = 0;
                              L4: while (true) {
                                if (param0.length() <= var6) {
                                  if (var5 > 0) {
                                    stackIn_36_0 = 0;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  L5: {
                                    var7 = param0.charAt(var6);
                                    if (!ak.a(95, (char) var7)) {
                                      var5 = 0;
                                      break L5;
                                    } else {
                                      var5++;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if ((var5 ^ -1) > -3) {
                                      break L6;
                                    } else {
                                      if (!param1) {
                                        stackIn_31_0 = 0;
                                        decompiledRegionSelector0 = 4;
                                        break L0;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L4;
                                }
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackIn_21_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("bk.C(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0 != 0;
                } else {
                  return stackIn_36_0 != 0;
                }
              }
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
