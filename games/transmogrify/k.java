/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class k {
    static String field_e;
    int field_c;
    static String field_a;
    int field_d;
    int field_f;
    int field_b;
    int field_h;
    int field_g;

    public static void a(boolean param0) {
        if (param0) {
            field_e = (String) null;
            field_e = null;
            field_a = null;
            return;
        }
        field_e = null;
        field_a = null;
    }

    abstract void a(int param0, int param1);

    abstract void a(int param0, int param1, int param2);

    final static void b(boolean param0) {
        if (!param0) {
            field_e = (String) null;
        }
    }

    final static void a(int param0, boolean param1, int param2, ti[] param3, int param4) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param4 <= 0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        var5_int = param3[0].field_r;
                        var6 = param3[2].field_r;
                        if (param1) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return;
                }
                case 7: {
                    try {
                        var7 = param3[1].field_r;
                        param3[0].c(param2, param0);
                        param3[2].c(-var6 + (param2 + param4), param0);
                        sb.a(q.field_i);
                        sb.g(var5_int + param2, param0, param2 - -param4 - var6, param3[1].field_s + param0);
                        var8 = param2 - -var5_int;
                        var9 = -var6 + param2 + param4;
                        param2 = var8;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param2 >= var9) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        param3[1].c(param2, param0);
                        param2 = param2 + var7;
                        if (var10 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var10 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        sb.b(q.field_i);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_16_0 = (RuntimeException) (var5);
                    stackIn_15_0 = stackIn_16_0;
                    stackIn_16_1 = new StringBuilder().append("k.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_15_1 = stackIn_16_1;
                    if (param3 == null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_17_2 = "{...}";
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_17_2 = "null";
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param4 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(char param0, int param1) {
        if (param1 <= -11) {
          if (param0 < 65) {
            if (param0 >= 97) {
              if (param0 <= 122) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (90 < param0) {
              if (param0 >= 97) {
                if (param0 > 122) {
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
          return true;
        }
    }

    static {
        field_a = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_e = "Loading sound effects";
    }
}
