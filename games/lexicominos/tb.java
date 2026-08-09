/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tb {
    static mj field_a;
    static volatile int field_b;

    abstract long b(int param0);

    final static String a(String param0, String param1, boolean param2, String param3) {
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        int statePc = 0;
        int var4 = 0;
        int var5 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Lexicominos.field_L ? 1 : 0;
                    if (param2) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_a = (mj) null;
                    statePc = 8;
                    continue stateLoop;
                }
                case 2: {
                    var4 = param1.indexOf(param0);
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (0 == (var4 ^ -1)) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    param1 = param1.substring(0, var4) + param3 + param1.substring(param0.length() + var4);
                    stackIn_7_0 = (String) (param1);
                    stackIn_5_0 = stackIn_7_0;
                    if (var5 != 0) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4 = ((String) (Object) stackIn_5_0).indexOf(param0, param3.length() + var4);
                    if (var5 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    stackIn_7_0 = (String) (param1);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    var4 = param1.indexOf(param0);
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (0 == (var4 ^ -1)) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    param1 = param1.substring(0, var4) + param3 + param1.substring(param0.length() + var4);
                    stackIn_13_0 = (String) (param1);
                    stackIn_11_0 = stackIn_13_0;
                    if (var5 != 0) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var4 = ((String) (Object) stackIn_11_0).indexOf(param0, param3.length() + var4);
                    if (var5 == 0) {
                        statePc = 9;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (String) (param1);
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    return stackIn_13_0;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != 255) {
            tb.a((String) null, (String) null, true, (String) null);
            field_a = null;
            return;
        }
        field_a = null;
    }

    abstract int a(long param0, byte param1);

    abstract void a(byte param0);

    final static pk a(th param0, int param1) {
        pk stackIn_5_0 = null;
        pk stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        pk var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.g(8, 26527);
            if (-1 <= (var2_int ^ -1)) {
              var3 = hl.a(true, param0) ? 1 : 0;
              if (param1 <= -18) {
                L1: {
                  var4 = hl.a(true, param0) ? 1 : 0;
                  var5 = new pk();
                  var5.field_w = (short)param0.g(16, 26527);
                  var5.field_h = hi.a(param0, (byte) -94, 16, var5.field_h);
                  var5.field_I = hi.a(param0, (byte) -70, 16, var5.field_I);
                  var5.field_g = hi.a(param0, (byte) -83, 16, var5.field_g);
                  var5.field_H = (short)param0.g(16, 26527);
                  var5.field_a = hi.a(param0, (byte) -46, 16, var5.field_a);
                  var5.field_k = hi.a(param0, (byte) -41, 16, var5.field_k);
                  var5.field_B = hi.a(param0, (byte) -114, 16, var5.field_B);
                  if (var3 != 0) {
                    var5.field_A = (short)param0.g(16, 26527);
                    var5.field_z = hi.a(param0, (byte) -87, 16, var5.field_z);
                    var5.field_b = hi.a(param0, (byte) -97, 16, var5.field_b);
                    var5.field_c = hi.a(param0, (byte) -42, 16, var5.field_c);
                    var5.field_j = hi.a(param0, (byte) -52, 16, var5.field_j);
                    var5.field_K = hi.a(param0, (byte) -35, 16, var5.field_K);
                    var5.field_E = hi.a(param0, (byte) -98, 16, var5.field_E);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var4 == 0) {
                    break L2;
                  } else {
                    param0.g(16, 26527);
                    var5.field_d = hi.a(param0, (byte) -70, 16, var5.field_d);
                    var5.field_s = hi.a(param0, (byte) -96, 16, var5.field_s);
                    var5.field_e = hi.a(param0, (byte) -128, 16, var5.field_e);
                    var5.field_x = hi.a(param0, (byte) -127, 16, var5.field_x);
                    var5.field_P = hi.a(param0, (byte) -124, 16, var5.field_P);
                    break L2;
                  }
                }
                L3: {
                  if (!hl.a(true, param0)) {
                    break L3;
                  } else {
                    var5.field_q = hi.a(param0, (byte) -77, 16, var5.field_q);
                    break L3;
                  }
                }
                L4: {
                  if (hl.a(true, param0)) {
                    var5.field_J = vk.a(0, param0, 16, var5.field_J);
                    var6 = 0;
                    var7 = 0;
                    L5: while (true) {
                      L6: {
                        L7: {
                          L8: {
                            if (var5.field_J.length <= var7) {
                              break L8;
                            } else {
                              var10 = var6 ^ -1;
                              var9 = var5.field_J[var7] & 255 ^ -1;
                              if (var8 != 0) {
                                if (var9 != var10) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              } else {
                                L9: {
                                  if (var9 >= var10) {
                                    break L9;
                                  } else {
                                    var6 = 255 & var5.field_J[var7];
                                    break L9;
                                  }
                                }
                                var7++;
                                if (var8 == 0) {
                                  continue L5;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                          if (0 != var6) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                        var5.field_J = null;
                        if (var8 == 0) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                      var5.field_N = (byte)(1 + var6);
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                stackIn_29_0 = (pk) (var5);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (pk) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var2);

            stackIn_32_1 = new StringBuilder().append("tb.I(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_29_0;
        }
    }

    final int a(byte param0, long param1) {
        long var4;
        if (param0 >= 5) {
          var4 = this.b(255);
          if (0L < var4) {
            ge.a(0, var4);
            return this.a(param1, (byte) 121);
          } else {
            return this.a(param1, (byte) 121);
          }
        } else {
          field_a = (mj) null;
          var4 = this.b(255);
          if (0L >= var4) {
            return this.a(param1, (byte) 121);
          } else {
            ge.a(0, var4);
            return this.a(param1, (byte) 121);
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    static {
        field_b = 0;
    }
}
