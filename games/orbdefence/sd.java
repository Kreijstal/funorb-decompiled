/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    static im field_a;
    static hj[] field_f;
    static int field_h;
    static String field_d;
    static int field_g;
    static volatile int field_c;
    static l field_b;
    static int[] field_e;

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4;
        L0: {
          var4 = 0;
          if (param1) {
            var4 += 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param2) {
          if (param3 != 30775) {
            L1: {
              sd.a(false, false, false, -6);
              if (param0) {
                var4++;
                break L1;
              } else {
                break L1;
              }
            }
            return s.field_E[var4];
          } else {
            L2: {
              if (param0) {
                var4++;
                break L2;
              } else {
                break L2;
              }
            }
            return s.field_E[var4];
          }
        } else {
          var4 += 2;
          if (param3 == 30775) {
            L3: {
              if (param0) {
                var4++;
                break L3;
              } else {
                break L3;
              }
            }
            return s.field_E[var4];
          } else {
            L4: {
              sd.a(false, false, false, -6);
              if (param0) {
                var4++;
                break L4;
              } else {
                break L4;
              }
            }
            return s.field_E[var4];
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        field_b = null;
        if (param0 != -30) {
          field_c = 11;
          field_f = null;
          field_d = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          return;
        }
    }

    final static void a(int param0) {
        mb.field_a = gd.a(0);
        bm.field_d = new sk();
        int var1 = 113 / ((param0 - 25) / 55);
        wj.a(-118, true, true);
    }

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = 4;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var4_int = -1;
                        var5 = param0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 >= param2) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4_int = var4_int >>> -297926712 ^ vi.field_O[255 & (var4_int ^ param1[var5])];
                        var5++;
                        if (var6 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4_int = var4_int ^ -1;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = var4_int;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (var4);
                    stackIn_13_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("sd.D(").append(param0).append(',');
                    stackIn_13_1 = stackIn_14_1;
                    if (param1 == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw dd.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, int param1) {
        bd.field_u.a(param0, (byte) -89);
        if (param1 <= 15) {
            sd.a((byte) 74);
        }
    }

    static {
        field_a = new im();
        field_d = "Damage";
        field_g = 0;
        field_e = new int[8192];
        field_c = 0;
    }
}
