/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends sh {
    static String field_C;
    static String field_B;
    int field_D;
    static rh field_F;
    static boolean[] field_G;
    static String field_E;

    public wj() {
        super(0, 0, 0, 0, (dh) null, (bb) null);
        ((wj) this).field_D = 256;
    }

    final static boolean f(int param0) {
        if (param0 != 7426) {
            field_E = null;
        }
        return 250 < gb.field_f ? true : false;
    }

    wj(el param0) {
        super(param0.field_v, param0.field_m, param0.field_r, param0.field_h, (dh) null, (bb) null);
        param0.a(((wj) this).field_h, ((wj) this).field_r, (byte) -113, 0, 0);
        ((wj) this).field_D = 256;
        ((wj) this).field_A = param0;
    }

    final static String a(String param0, String[] param1, byte param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        var3 = param0.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param0.indexOf("<%", var5);
          if (0 > var6_int) {
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            if (param2 < -12) {
              L1: while (true) {
                var8 = param0.indexOf("<%", var5);
                if (0 <= var8) {
                  var5 = var8 - -2;
                  L2: while (true) {
                    L3: {
                      if (var5 >= var3) {
                        break L3;
                      } else {
                        if (!rc.a(-58, param0.charAt(var5))) {
                          break L3;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    }
                    var9 = param0.substring(2 + var8, var5);
                    if (f.b((byte) -125, (CharSequence) (Object) var9)) {
                      if (var3 <= var5) {
                        continue L1;
                      } else {
                        if (param0.charAt(var5) != 62) {
                          continue L1;
                        } else {
                          var5++;
                          var10 = ol.a(false, (CharSequence) (Object) var9);
                          StringBuilder discarded$3 = var6.append(param0.substring(var7, var8));
                          var7 = var5;
                          StringBuilder discarded$4 = var6.append(param1[var10]);
                          continue L1;
                        }
                      }
                    } else {
                      continue L1;
                    }
                  }
                } else {
                  StringBuilder discarded$5 = var6.append(param0.substring(var7));
                  return var6.toString();
                }
              }
            } else {
              return null;
            }
          } else {
            var5 = var6_int + 2;
            L4: while (true) {
              L5: {
                if (var3 <= var5) {
                  break L5;
                } else {
                  if (!rc.a(-58, param0.charAt(var5))) {
                    break L5;
                  } else {
                    var5++;
                    continue L4;
                  }
                }
              }
              var7_ref = param0.substring(var6_int + 2, var5);
              if (!f.b((byte) -123, (CharSequence) (Object) var7_ref)) {
                continue L0;
              } else {
                if (var5 >= var3) {
                  continue L0;
                } else {
                  if (param0.charAt(var5) != 62) {
                    continue L0;
                  } else {
                    var5++;
                    var8 = ol.a(false, (CharSequence) (Object) var7_ref);
                    var4 = var4 + (-var5 + (var6_int + param1[var8].length()));
                    continue L0;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 16 % ((param2 - 1) / 43);
        if (!(param3 == 0)) {
            return;
        }
        if (null == ((wj) this).field_A) {
            return;
        }
        if (((wj) this).field_D == 0) {
            return;
        }
        if ((((wj) this).field_D ^ -1) == -257) {
            ((wj) this).field_A.a(param0 - -((wj) this).field_v, param1 - -((wj) this).field_m, (byte) 83, param3);
            return;
        }
        dm var6 = new dm(((wj) this).field_A.field_r, ((wj) this).field_A.field_h);
        Geoblox.a(1, var6);
        ((wj) this).field_A.a(0, 0, (byte) -115, param3);
        id.a(true);
        var6.d(((wj) this).field_v + param0, ((wj) this).field_m + param1, ((wj) this).field_D);
    }

    public static void f(byte param0) {
        field_G = null;
        field_B = null;
        field_C = null;
        if (param0 != -60) {
            return;
        }
        field_F = null;
        field_E = null;
    }

    final static void a(d param0, byte param1, Object param2) {
        Exception var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = Geoblox.field_C;
                    if (param0.field_q == null) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var3_int = 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (var3_int >= 50) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (null == param0.field_q.peekEvent()) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    bc.a(0, 1L);
                    var3_int++;
                    statePc = 4;
                    continue stateLoop;
                }
                case 7: {
                    var4 = 11 / ((param1 - 2) / 48);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        if (param2 != null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param0.field_q.postEvent((java.awt.AWTEvent) (Object) new java.awt.event.ActionEvent(param2, 1001, "dummy"));
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var3 = (Exception) (Object) caughtException;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static dm[] a(String param0, String param1, rh param2, int param3) {
        int var4 = param2.a((byte) 126, param1);
        int var5 = param2.a(param0, -114, var4);
        if (param3 != 0) {
            field_G = null;
        }
        return ll.a(var4, (byte) -81, var5, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Please check if address is correct";
        field_C = "to keep fullscreen or";
        field_G = new boolean[64];
        field_E = "Player Name: ";
    }
}
