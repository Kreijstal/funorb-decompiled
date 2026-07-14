/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends rb implements fb, rp {
    en field_j;
    static int[] field_g;
    static je field_i;
    static String field_f;
    static vh field_h;
    static int field_d;
    static kl field_e;

    public final void b(fn param0, int param1) {
        int var3 = -12 / ((-80 - param1) / 33);
        ((sb) this).a(127);
    }

    public final void a(int param0, gh param1) {
        if (param0 > -82) {
            return;
        }
        ((sb) this).a(125);
    }

    public static void b(boolean param0) {
        field_f = null;
        field_e = null;
        field_h = null;
        field_g = null;
        field_i = null;
        if (param0) {
            Object var2 = null;
            rn discarded$0 = sb.a((String) null, (byte) -81);
        }
    }

    public sb() {
    }

    final String b(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_5_0 = null;
        Object stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((sb) this).field_j.l(97);
                        var3 = ((sb) this).field_j.m(-26458);
                        if (param0 == -71) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        gu discarded$3 = ((sb) this).c(-41);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4 = ((sb) this).field_j.a((byte) -77);
                        var5 = ra.b(true);
                        if (-1891 < (var4 ^ -1)) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var4 <= var5 + -3) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = fo.a(4800, cv.field_r, new String[2]);
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return (String) (Object) stackIn_6_0;
                }
                case 7: {
                    try {
                        if (!dt.a(var4, -24375, var3, var2_int)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = null;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return (String) (Object) stackIn_9_0;
                }
                case 10: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    return qq.field_z;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static rn a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = param0.length();
        if (0 == var2) {
          return hv.field_N;
        } else {
          if (-64 > (var2 ^ -1)) {
            return el.field_e;
          } else {
            var3 = 0;
            L0: while (true) {
              if (var3 >= var2) {
                if (param1 != -107) {
                  var6 = null;
                  rn discarded$1 = sb.a((String) null, (byte) -62);
                  return null;
                } else {
                  return null;
                }
              } else {
                var4 = param0.charAt(var3);
                if (var4 != 45) {
                  if (ew.field_c.indexOf(var4) == -1) {
                    return ov.field_h;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  L1: {
                    if (var3 == 0) {
                      break L1;
                    } else {
                      if (var2 + -1 == var3) {
                        break L1;
                      } else {
                        var3++;
                        continue L0;
                      }
                    }
                  }
                  return ov.field_h;
                }
              }
            }
          }
        }
    }

    final gu c(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        gu stackIn_2_0 = null;
        gu stackIn_5_0 = null;
        gu stackIn_8_0 = null;
        Throwable decompiledCaughtException = null;
        gu stackOut_4_0 = null;
        gu stackOut_1_0 = null;
        gu stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2_int = ((sb) this).field_j.l(50);
                        var3 = ((sb) this).field_j.m(-26458);
                        var4 = ((sb) this).field_j.a((byte) -77);
                        var5 = ra.b(true);
                        if (var4 >= 1890) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = rn.field_e;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (gu) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        var6 = 26 % ((param0 - 56) / 32);
                        if (var4 <= -3 + var5) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = rn.field_e;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return (gu) (Object) stackIn_5_0;
                }
                case 6: {
                    try {
                        if (dt.a(var4, -24375, var3, var2_int)) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = rn.field_e;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return (gu) (Object) stackIn_8_0;
                }
                case 9: {
                    var2 = (NumberFormatException) (Object) caughtException;
                    return rn.field_e;
                }
                case 10: {
                    return oo.field_g;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final boolean b(int param0) {
        if (param0 <= 12) {
            field_g = null;
        }
        return ((sb) this).field_j.k(-22339);
    }

    public final void a(fn param0, int param1) {
        if (param1 != 80) {
            field_h = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 2;
        field_f = "You currently have an ongoing mission at this location.<br><Br>You are on turn <col=ffff00><%0></col>. <br><br>Do you wish to resume this mission or do you want to abort it and restart?";
        field_g = new int[]{166};
    }
}
