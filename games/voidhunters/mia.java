/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mia implements Runnable {
    volatile boolean field_c;
    static boolean[] field_a;
    volatile vka[] field_b;
    eab field_d;
    volatile boolean field_e;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -11954) {
            boolean discarded$0 = mia.a('', false);
        }
    }

    final static void a(int param0, int param1, int param2) {
        faa var4 = null;
        mm var6 = null;
        mm var7 = null;
        if (param1 == paa.field_q) {
          if (param2 < 42) {
            field_a = null;
            return;
          } else {
            return;
          }
        } else {
          var6 = (mm) (Object) ks.field_r.a(-1, (long)paa.field_q);
          var7 = var6;
          if (var7 == null) {
            paa.field_q = param1;
            var4 = dpa.field_p;
            var4.h(24335, param0);
            var4.c(0, 3);
            var4.c(0, 11);
            var4.a(param1, true);
            if (param2 >= 42) {
              return;
            } else {
              field_a = null;
              return;
            }
          } else {
            var7.field_Ib = null;
            paa.field_q = param1;
            var4 = dpa.field_p;
            var4.h(24335, param0);
            var4.c(0, 3);
            var4.c(0, 11);
            var4.a(param1, true);
            if (param2 >= 42) {
              return;
            } else {
              field_a = null;
              return;
            }
          }
        }
    }

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        vka var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = VoidHunters.field_G;
                    ((mia) this).field_c = true;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((mia) this).field_e) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var1_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (2 <= var1_int) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = (stateCaught_3 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = ((mia) this).field_b[var1_int];
                        if (var2 == null) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2.h();
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var1_int++;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var1_int++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        gdb.b(-106, 10L);
                        var5 = null;
                        ts.a((byte) 97, ((mia) this).field_d, (Object) null);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof Exception ? 10 : 12);
                        continue stateLoop;
                    }
                }
                case 9: {
                    ((mia) this).field_c = false;
                    return;
                }
                case 10: {
                    try {
                        var1 = (Exception) (Object) caughtException;
                        var6 = null;
                        gna.a((Throwable) (Object) var1, (String) null, 0);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    ((mia) this).field_c = false;
                    return;
                }
                case 12: {
                    try {
                        var3 = caughtException;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    ((mia) this).field_c = false;
                    throw (RuntimeException) (Object) var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(char param0, boolean param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        var5 = VoidHunters.field_G;
        if (param1) {
          if (param0 <= 0) {
            if (param0 >= 160) {
              if (param0 <= 255) {
                return true;
              } else {
                if (param0 != 0) {
                  var14 = tu.field_c;
                  var10 = var14;
                  var6 = var10;
                  var2 = var6;
                  var3 = 0;
                  L0: while (true) {
                    if (var14.length <= var3) {
                      return false;
                    } else {
                      var4 = var14[var3];
                      if (var4 == param0) {
                        return true;
                      } else {
                        var3++;
                        continue L0;
                      }
                    }
                  }
                } else {
                  return false;
                }
              }
            } else {
              if (param0 != 0) {
                var13 = tu.field_c;
                var9 = var13;
                var6 = var9;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var13.length <= var3) {
                    return false;
                  } else {
                    var4 = var13[var3];
                    if (var4 == param0) {
                      return true;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
              } else {
                return false;
              }
            }
          } else {
            if (param0 >= 128) {
              if (param0 >= 160) {
                if (param0 <= 255) {
                  return true;
                } else {
                  if (param0 != 0) {
                    var12 = tu.field_c;
                    var8 = var12;
                    var6 = var8;
                    var2 = var6;
                    var3 = 0;
                    L2: while (true) {
                      if (var12.length <= var3) {
                        return false;
                      } else {
                        var4 = var12[var3];
                        if (var4 == param0) {
                          return true;
                        } else {
                          var3++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    return false;
                  }
                }
              } else {
                if (param0 != 0) {
                  var11 = tu.field_c;
                  var7 = var11;
                  var6 = var7;
                  var2 = var6;
                  var3 = 0;
                  L3: while (true) {
                    if (var11.length > var3) {
                      var4 = var11[var3];
                      if (var4 == param0) {
                        return true;
                      } else {
                        var3++;
                        continue L3;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    mia() {
        ((mia) this).field_b = new vka[2];
        ((mia) this).field_e = false;
        ((mia) this).field_c = false;
    }

    static {
    }
}
