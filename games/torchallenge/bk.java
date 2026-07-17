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
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3_int = param0.length();
              if (1 > var3_int) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                if (var3_int <= 12) {
                  L1: {
                    var4 = il.a(param0, (byte) 21);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (var4.length() >= 1) {
                        L2: {
                          if (ak.a(95, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!ak.a(95, var4.charAt(-1 + var4.length()))) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (param0.length() <= var6) {
                                  if (var5 > 0) {
                                    stackOut_33_0 = 0;
                                    stackIn_34_0 = stackOut_33_0;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  L4: {
                                    var7 = param0.charAt(var6);
                                    if (!ak.a(95, (char) var7)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (var5 < 2) {
                                      break L5;
                                    } else {
                                      if (!param1) {
                                        stackOut_28_0 = 0;
                                        stackIn_29_0 = stackOut_28_0;
                                        return stackIn_29_0 != 0;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L3;
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0 != 0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0 != 0;
                } else {
                  return false;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("bk.C(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L6;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L6;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 44 + param1 + 44 + -125 + 41);
        }
        return stackIn_34_0 != 0;
    }

    public static void b(byte param0) {
        field_s = null;
        field_n = null;
        field_r = null;
        field_l = null;
        field_q = null;
        int var1 = 34;
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
