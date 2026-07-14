/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class fd {
    static int[] field_a;
    static int[][] field_h;
    static int field_f;
    static cd field_d;
    static int[] field_c;
    static int[] field_b;
    static int[] field_e;
    static String field_i;
    static long field_g;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_h = null;
        field_b = null;
        field_d = null;
        field_i = null;
        if (param0 <= 103) {
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static void a(int param0, boolean param1, String param2, String param3) {
        kk.field_c = param2;
        ob.field_F = param3;
        jj.a(param1, gb.field_c, 1702);
        if (param0 >= 58) {
            return;
        }
        fd.a(-9);
    }

    final static void a(boolean param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    var1 = (Object) (Object) el.field_n;
                    // monitorenter el.field_n
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0) {
                            statePc = 3;
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
                        field_f = 1;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        bg.field_l = bf.field_B;
                        vd.field_a = vd.field_a + 1;
                        if (0 <= j.field_b) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (112 <= var2) {
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
                    try {
                        ve.field_B[var2] = false;
                        var2++;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        j.field_b = sc.field_a;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (sc.field_a == j.field_b) {
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
                        var2 = se.field_p[sc.field_a];
                        sc.field_a = 127 & sc.field_a + 1;
                        if (var2 < 0) {
                            statePc = 11;
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
                        ve.field_B[var2] = true;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ve.field_B[var2 ^ -1] = false;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        bf.field_B = dk.field_i;
                        // monitorexit var1
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var3;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static java.net.URL a(int param0, String param1, int param2, java.net.URL param3, String param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_41_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_40_0 = null;
            var9 = Transmogrify.field_A ? 1 : 0;
            var5 = param3.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                  break L1;
                } else {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (0 > var7_int) {
                    break L1;
                  } else {
                    if (-1 >= (param0 ^ -1)) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                }
              }
              L2: {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (-1 < (var7_int ^ -1)) {
                    break L2;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (var5.regionMatches(var6, "/p=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if (var7_int >= 0) {
                    if (param4 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L4: {
                L5: {
                  if (var5.regionMatches(var6, "/s=", 0, 3)) {
                    break L5;
                  } else {
                    if (var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                var7_int = var5.indexOf('/', var6 + 1);
                if (var7_int >= 0) {
                  if (param1 == null) {
                    var6 = var7_int;
                    continue L0;
                  } else {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue L0;
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                var7 = new StringBuilder(var6);
                StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                if (param2 == 130) {
                  break L6;
                } else {
                  field_d = null;
                  break L6;
                }
              }
              L7: {
                if ((param0 ^ -1) >= -1) {
                  break L7;
                } else {
                  StringBuilder discarded$10 = var7.append("/l=");
                  StringBuilder discarded$11 = var7.append(Integer.toString(param0));
                  break L7;
                }
              }
              L8: {
                if (param4 == null) {
                  break L8;
                } else {
                  if (param4.length() > 0) {
                    StringBuilder discarded$12 = var7.append("/p=");
                    StringBuilder discarded$13 = var7.append(param4);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (param1 == null) {
                  break L9;
                } else {
                  if (-1 > (param1.length() ^ -1)) {
                    StringBuilder discarded$14 = var7.append("/s=");
                    StringBuilder discarded$15 = var7.append(param1);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (var5.length() > var6) {
                  StringBuilder discarded$16 = var7.append(var5.substring(var6, var5.length()));
                  break L10;
                } else {
                  StringBuilder discarded$17 = var7.append(47);
                  break L10;
                }
              }
              try {
                stackOut_40_0 = new java.net.URL(param3, var7.toString());
                stackIn_41_0 = stackOut_40_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_41_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_h = new int[8][];
        field_c = new int[8];
        field_a = new int[8];
        field_b = new int[8];
        field_e = new int[8];
        tg.a(0, 30, new int[9], (byte) 68, 435, 210, 130);
        tg.a(1, 30, new int[6], (byte) 50, 435, 210, 130);
        tg.a(7, 30, new int[6], (byte) 43, 435, 210, 130);
        tg.a(2, 43, new int[2], (byte) 78, 520, 274, 396);
        tg.a(3, 43, new int[4], (byte) 69, 540, 30, 420);
        tg.a(4, 43, new int[2], (byte) 71, 565, 312, 394);
        tg.a(6, 43, new int[2], (byte) 91, 565, 312, 394);
        tg.a(5, 43, new int[2], (byte) 57, 443, 197, 260);
    }
}
