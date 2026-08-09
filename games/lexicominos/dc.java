/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends si {
    wf field_x;
    static db[] field_z;
    int field_w;
    byte field_A;
    static String field_y;

    final byte[] d(byte param0) {
        int var2;
        if (!this.field_v) {
          if (this.field_x.field_h < -this.field_A + this.field_x.field_j.length) {
            throw new RuntimeException();
          } else {
            var2 = 37 % ((2 - param0) / 38);
            return this.field_x.field_j;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static void c(int param0) {
        if (param0 != 255) {
            return;
        }
        String var2 = (String) null;
        cl.a((byte) 41, (String) null, "");
    }

    final static boolean d(int param0) {
        if (a.field_c == -1) {
            if (!(a.b(1, 10343))) {
                return false;
            }
            a.field_c = ig.field_a.d(true);
            ig.field_a.field_h = 0;
        }
        if (param0 != 2) {
            return false;
        }
        if (1 != (a.field_c ^ -1)) {
            return a.b(a.field_c, 10343);
        }
        if (!(a.b(2, 10343))) {
            return false;
        }
        a.field_c = ig.field_a.b(-1698573656);
        ig.field_a.field_h = 0;
        return a.b(a.field_c, 10343);
    }

    dc() {
    }

    final static String[] a(String param0, char param1, byte param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var10 = (CharSequence) ((Object) param0);
                        var3_int = wd.a((byte) -72, param1, var10);
                        var4 = new String[1 + var3_int];
                        var5 = 0;
                        var6 = 0;
                        if (param2 == -125) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_y = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var7 >= var3_int) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var9 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8 = var6;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1 == param0.charAt(var8)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8++;
                        if (var9 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var9 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        incrementValue$1 = var5;
                        var5++;
                        var4[incrementValue$1] = param0.substring(var6, var8);
                        var6 = var8 - -1;
                        var7++;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var9 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var4[var3_int] = param0.substring(var6);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackIn_15_0 = (String[]) (var4);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0;
                }
                case 16: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_18_0 = (RuntimeException) (var3);
                    stackIn_17_0 = stackIn_18_0;
                    stackIn_18_1 = new StringBuilder().append("dc.T(");
                    stackIn_17_1 = stackIn_18_1;
                    if (param0 == null) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_19_2 = "{...}";
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                    stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                    stackIn_19_2 = "null";
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void f(byte param0) {
        field_y = null;
        int var1 = -27 % ((param0 - 19) / 53);
        field_z = null;
    }

    final static String a(int param0, byte[] param1, byte param2, int param3) {
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        String stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var12 = new char[param0];
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = 0;
            var6 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var6 >= param0) {
                      break L4;
                    } else {
                      var7 = param1[param3 + var6] & 255;
                      var14 = var7;
                      var13 = 0;
                      if (var9 != 0) {
                        if (var13 == var14) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (var13 == var14) {
                            break L5;
                          } else {
                            L6: {
                              if ((var7 ^ -1) > -129) {
                                break L6;
                              } else {
                                if (160 > var7) {
                                  L7: {
                                    var8 = ne.field_d[var7 - 128];
                                    if (var8 == 0) {
                                      var8 = 63;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  var7 = var8;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            incrementValue$0 = var5;
                            var5++;
                            var10[incrementValue$0] = (char)var7;
                            break L5;
                          }
                        }
                        var6++;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (param2 == 16) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                dc.d(-88);
                break L2;
              }
              stackIn_20_0 = new String(var12, 0, var5);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4_ref);

            stackIn_23_1 = new StringBuilder().append("dc.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_20_0;
    }

    final int c(byte param0) {
        if (param0 != 16) {
            return 68;
        }
        if (!(this.field_x != null)) {
            return 0;
        }
        return 100 * this.field_x.field_h / (this.field_x.field_j.length - this.field_A);
    }

    static {
        field_y = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
