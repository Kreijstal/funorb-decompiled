/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dd {
    static db field_f;
    int field_c;
    static String field_d;
    int[] field_b;
    java.awt.Image field_e;
    int field_a;

    abstract void a(boolean param0, int param1, int param2, java.awt.Component param3);

    final static void a(int param0, int param1) {
        th var2;
        var2 = ed.field_q;
        var2.h(param1, 0);
        if (param0 <= 32) {
          return;
        } else {
          var2.c(1, -1);
          var2.c(0, -1);
          return;
        }
    }

    final static int a(byte param0, int param1) {
        int var2;
        L0: {
          if (param0 == 34) {
            break L0;
          } else {
            dd.a(true, false, true, -68);
            break L0;
          }
        }
        if (0 == param1) {
          return 0;
        } else {
          if ((param1 ^ -1) < -1) {
            L1: {
              var2 = 1;
              if (param1 > 65535) {
                param1 = param1 >> 16;
                var2 += 16;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((param1 ^ -1) < -256) {
                var2 += 8;
                param1 = param1 >> 8;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((param1 ^ -1) < -16) {
                var2 += 4;
                param1 = param1 >> 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if ((param1 ^ -1) >= -4) {
                break L4;
              } else {
                param1 = param1 >> 2;
                var2 += 2;
                break L4;
              }
            }
            L5: {
              if (-2 <= (param1 ^ -1)) {
                break L5;
              } else {
                param1 = param1 >> 1;
                var2++;
                break L5;
              }
            }
            return var2;
          } else {
            L6: {
              var2 = 2;
              if (param1 < -65536) {
                var2 += 16;
                param1 = param1 >> 16;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (255 >= (param1 ^ -1)) {
                break L7;
              } else {
                param1 = param1 >> 8;
                var2 += 8;
                break L7;
              }
            }
            L8: {
              if (15 < (param1 ^ -1)) {
                var2 += 4;
                param1 = param1 >> 4;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if ((param1 ^ -1) > 3) {
                param1 = param1 >> 2;
                var2 += 2;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (1 >= (param1 ^ -1)) {
                break L10;
              } else {
                var2++;
                param1 = param1 >> 1;
                break L10;
              }
            }
            return var2;
          }
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4;
        var4 = 0;
        if (!param1) {
          L0: {
            if (param0) {
              var4 += 2;
              break L0;
            } else {
              break L0;
            }
          }
          if (!param2) {
            if (param3 != -11902) {
              field_d = (String) null;
              return sb.field_c[var4];
            } else {
              return sb.field_c[var4];
            }
          } else {
            var4++;
            if (param3 != -11902) {
              field_d = (String) null;
              return sb.field_c[var4];
            } else {
              return sb.field_c[var4];
            }
          }
        } else {
          L1: {
            var4 += 4;
            if (param0) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          if (param2) {
            var4++;
            if (param3 == -11902) {
              return sb.field_c[var4];
            } else {
              field_d = (String) null;
              return sb.field_c[var4];
            }
          } else {
            if (param3 != -11902) {
              field_d = (String) null;
              return sb.field_c[var4];
            } else {
              return sb.field_c[var4];
            }
          }
        }
    }

    abstract void a(int param0, java.awt.Graphics param1, byte param2, int param3);

    public static void a(int param0) {
        field_d = null;
        if (param0 != 1) {
            dd.a(false, false, false, -79);
            field_f = null;
            return;
        }
        field_f = null;
    }

    final static void a(int[] param0, int param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2_int >= param0.length) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2_int = 1 + 3 * var2_int;
                        if (var4 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2_int = var2_int / 3;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param1 == -23588) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        dd.a((byte) 112, 61);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var2_int ^ -1) >= -1) {
                            statePc = 24;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (var4 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        return;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var3 >= var2_int) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        vh.a((byte) -42, var2_int, param0, var3);
                        var3++;
                        if (var4 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var4 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var2_int = var2_int / 3;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var4 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_22_0 = (RuntimeException) (runtimeException);
                    stackIn_21_0 = stackIn_22_0;
                    stackIn_22_1 = new StringBuilder().append("dd.H(");
                    stackIn_21_1 = stackIn_22_1;
                    if (param0 == null) {
                        statePc = 22;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_23_2 = "{...}";
                    statePc = 23;
                    continue stateLoop;
                }
                case 22: {
                    stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                    stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                    stackIn_23_2 = "null";
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    throw ld.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            return;
        }
        lf.a(this.field_b, this.field_a, this.field_c);
    }

    static {
    }
}
