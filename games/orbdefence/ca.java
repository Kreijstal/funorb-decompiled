/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ca {
    static boolean field_b;
    ca field_c;
    long field_d;
    ca field_e;
    static String field_a;

    final static short[] a(short[] param0, int param1, boolean param2, se param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        se var9 = null;
        short[] stackIn_20_0 = null;
        short[] stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param3.h(param1, 8);
                        if (var4_int != 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        return null;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4_int != param0.length) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        param0 = new short[var4_int];
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = param3.h(4, 8);
                        if (!param2) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = (se) null;
                        ca.a((short[]) null, -25, true, (se) null);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = (short)param3.h(16, 8);
                        if (0 < var5) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7 >= var4_int) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        param0[var7] = (short)var6;
                        var7++;
                        if (var8 != 0) {
                            statePc = 22;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var8 == 0) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var8 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7 = 0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var7 >= var4_int) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_23_0 = (short[]) (param0);
                        stackIn_20_0 = stackIn_23_0;
                        if (var8 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_20_0[var7] = (short)(var6 + param3.h(var5, 8));
                        var7++;
                        if (var8 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = (short[]) (param0);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_26_0 = (RuntimeException) (var4);
                    stackIn_25_0 = stackIn_26_0;
                    stackIn_26_1 = new StringBuilder().append("ca.JB(");
                    stackIn_25_1 = stackIn_26_1;
                    if (param0 == null) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_25_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_25_1);
                    stackIn_27_2 = "{...}";
                    statePc = 27;
                    continue stateLoop;
                }
                case 26: {
                    stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_27_2 = "null";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_0 = stackIn_29_0;
                    stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_28_1 = stackIn_29_1;
                    if (param3 == null) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_30_2 = "{...}";
                    statePc = 30;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_30_2 = "null";
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw dd.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != 40) {
            field_a = (String) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static int a(boolean param0) {
        if (vh.field_n < 2) {
          return 0;
        } else {
          if (!param0) {
            if (wj.field_m == 0) {
              if (og.field_g.b(-1)) {
                if (!og.field_g.b((byte) 112, "commonui")) {
                  return 40;
                } else {
                  if (am.field_b.b(-1)) {
                    if (am.field_b.b((byte) 111, "commonui")) {
                      if (!wb.field_b.b(-1)) {
                        return 70;
                      } else {
                        if (wb.field_b.c(7715)) {
                          return 100;
                        } else {
                          return 80;
                        }
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                }
              } else {
                return 20;
              }
            } else {
              if (lf.field_a != null) {
                if (lf.field_a.b(-1)) {
                  if (!lf.field_a.c((byte) -62, "")) {
                    return 29;
                  } else {
                    if (!lf.field_a.b((byte) -113, "")) {
                      return 29;
                    } else {
                      if (!og.field_g.b(-1)) {
                        return 43;
                      } else {
                        if (og.field_g.b((byte) 58, "commonui")) {
                          if (am.field_b.b(-1)) {
                            if (!am.field_b.b((byte) 94, "commonui")) {
                              return 80;
                            } else {
                              if (!wb.field_b.b(-1)) {
                                return 82;
                              } else {
                                if (wb.field_b.c(7715)) {
                                  return 100;
                                } else {
                                  return 86;
                                }
                              }
                            }
                          } else {
                            return 71;
                          }
                        } else {
                          return 57;
                        }
                      }
                    }
                  }
                } else {
                  return 14;
                }
              } else {
                if (!og.field_g.b(-1)) {
                  return 43;
                } else {
                  if (og.field_g.b((byte) 58, "commonui")) {
                    if (am.field_b.b(-1)) {
                      if (!am.field_b.b((byte) 94, "commonui")) {
                        return 80;
                      } else {
                        if (!wb.field_b.b(-1)) {
                          return 82;
                        } else {
                          if (wb.field_b.c(7715)) {
                            return 100;
                          } else {
                            return 86;
                          }
                        }
                      }
                    } else {
                      return 71;
                    }
                  } else {
                    return 57;
                  }
                }
              }
            }
          } else {
            field_b = false;
            if (wj.field_m == 0) {
              if (og.field_g.b(-1)) {
                if (!og.field_g.b((byte) 112, "commonui")) {
                  return 40;
                } else {
                  if (am.field_b.b(-1)) {
                    if (am.field_b.b((byte) 111, "commonui")) {
                      if (!wb.field_b.b(-1)) {
                        return 70;
                      } else {
                        if (!wb.field_b.c(7715)) {
                          return 80;
                        } else {
                          return 100;
                        }
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                }
              } else {
                return 20;
              }
            } else {
              if (lf.field_a != null) {
                if (lf.field_a.b(-1)) {
                  if (!lf.field_a.c((byte) -62, "")) {
                    return 29;
                  } else {
                    if (lf.field_a.b((byte) -113, "")) {
                      if (!og.field_g.b(-1)) {
                        return 43;
                      } else {
                        if (og.field_g.b((byte) 58, "commonui")) {
                          if (am.field_b.b(-1)) {
                            if (!am.field_b.b((byte) 94, "commonui")) {
                              return 80;
                            } else {
                              if (!wb.field_b.b(-1)) {
                                return 82;
                              } else {
                                if (wb.field_b.c(7715)) {
                                  return 100;
                                } else {
                                  return 86;
                                }
                              }
                            }
                          } else {
                            return 71;
                          }
                        } else {
                          return 57;
                        }
                      }
                    } else {
                      return 29;
                    }
                  }
                } else {
                  return 14;
                }
              } else {
                if (!og.field_g.b(-1)) {
                  return 43;
                } else {
                  if (og.field_g.b((byte) 58, "commonui")) {
                    if (am.field_b.b(-1)) {
                      if (!am.field_b.b((byte) 94, "commonui")) {
                        return 80;
                      } else {
                        if (!wb.field_b.b(-1)) {
                          return 82;
                        } else {
                          if (wb.field_b.c(7715)) {
                            return 100;
                          } else {
                            return 86;
                          }
                        }
                      }
                    } else {
                      return 71;
                    }
                  } else {
                    return 57;
                  }
                }
              }
            }
          }
        }
    }

    final void b(int param0) {
        se var3;
        if (null == this.field_c) {
          return;
        } else {
          this.field_c.field_e = this.field_e;
          if (param0 != 57) {
            var3 = (se) null;
            ca.a((short[]) null, 120, true, (se) null);
            this.field_e.field_c = this.field_c;
            this.field_e = null;
            this.field_c = null;
            return;
          } else {
            this.field_e.field_c = this.field_c;
            this.field_e = null;
            this.field_c = null;
            return;
          }
        }
    }

    final boolean b(boolean param0) {
        if (!(null != this.field_c)) {
            return false;
        }
        if (!param0) {
            ca.a(-7);
            return true;
        }
        return true;
    }

    static {
        field_a = "Max Bolts";
    }
}
