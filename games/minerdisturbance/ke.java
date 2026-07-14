/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ke extends ui implements sg {
    static ag field_W;
    static boolean field_V;
    static boolean[] field_X;
    static bk field_U;
    private int field_T;
    private jm field_S;

    final static int a(int param0, int param1, Random param2) {
        int var3 = 0;
        int var4 = 0;
        if (param1 == -21937) {
          if (0 < param0) {
            if (tn.a(param0, -3236)) {
              return (int)((4294967295L & (long)param2.nextInt()) * (long)param0 >> 849271456);
            } else {
              var3 = -2147483648 + -(int)(4294967296L % (long)param0);
              L0: while (true) {
                var4 = param2.nextInt();
                if (var4 < var3) {
                  return vj.a((byte) -101, var4, param0);
                } else {
                  continue L0;
                }
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          field_X = null;
          if (0 < param0) {
            if (tn.a(param0, -3236)) {
              return (int)((4294967295L & (long)param2.nextInt()) * (long)param0 >> 849271456);
            } else {
              var3 = -2147483648 + -(int)(4294967296L % (long)param0);
              L1: while (true) {
                var4 = param2.nextInt();
                if (var4 < var3) {
                  return vj.a((byte) -101, var4, param0);
                } else {
                  continue L1;
                }
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    final void r(int param0) {
        if (param0 <= 123) {
            return;
        }
        super.r(124);
        if (!(null == ((ke) this).field_S)) {
            ((ke) this).field_S.c(-11);
        }
    }

    public final jm a(int param0) {
        if (param0 != 35) {
            String discarded$0 = ((ke) this).h(-84);
            return ((ke) this).field_S;
        }
        return ((ke) this).field_S;
    }

    final void a(jm param0, int param1) {
        if (param1 != 1048576) {
            return;
        }
        ((ke) this).field_S = param0;
    }

    final static void a(wh param0, boolean param1, int param2, boolean param3) {
        Object var4 = null;
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (!param3) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ke.s(-5);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (nj.field_e == null) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    dl.a(param1, param0, -32532, 1048576, param2);
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    if (km.field_a == null) {
                        statePc = 17;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var4 = (Object) (Object) mj.field_o;
                    // monitorenter mj.field_o
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        km.field_a.a(param2, true, -1);
                        if (param0 == de.field_b) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        // monitorexit var4
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return;
                }
                case 10: {
                    try {
                        km.field_a.c((byte) 108);
                        mj.field_o.f();
                        de.field_b = param0;
                        if (de.field_b != null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        km.field_a.a(param1, de.field_b, (byte) 2);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        // monitorexit var4
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return;
                }
                case 15: {
                    try {
                        var5 = caughtException;
                        // monitorexit var4
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    throw (RuntimeException) (Object) var5;
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(char param0, byte param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = MinerDisturbance.field_ab;
        var4 = param2.length();
        if (param1 == 75) {
          var5 = param3.length();
          var6 = var4;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            L0: while (true) {
              var8_int = param2.indexOf((int) param0, var8_int);
              if (var8_int >= 0) {
                var8_int++;
                var6 = var6 + var7;
                continue L0;
              } else {
                var13 = new StringBuilder(var6);
                var8 = var13;
                var9 = 0;
                L1: while (true) {
                  var10 = param2.indexOf((int) param0, var9);
                  if (0 > var10) {
                    StringBuilder discarded$12 = var13.append(param2.substring(var9));
                    return var13.toString();
                  } else {
                    StringBuilder discarded$13 = var13.append(param2.substring(var9, var10));
                    StringBuilder discarded$14 = var13.append(param3);
                    var9 = 1 + var10;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var12 = new StringBuilder(var6);
            var9 = 0;
            L2: while (true) {
              var10 = param2.indexOf((int) param0, var9);
              if (0 > var10) {
                StringBuilder discarded$15 = var12.append(param2.substring(var9));
                return var12.toString();
              } else {
                StringBuilder discarded$16 = var12.append(param2.substring(var9, var10));
                StringBuilder discarded$17 = var12.append(param3);
                var9 = 1 + var10;
                continue L2;
              }
            }
          }
        } else {
          field_U = null;
          var5 = param3.length();
          var6 = var4;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            L3: while (true) {
              var8_int = param2.indexOf((int) param0, var8_int);
              if (var8_int >= 0) {
                var8_int++;
                var6 = var6 + var7;
                continue L3;
              } else {
                var8 = new StringBuilder(var6);
                var9 = 0;
                L4: while (true) {
                  var10 = param2.indexOf((int) param0, var9);
                  if (0 > var10) {
                    StringBuilder discarded$18 = var8.append(param2.substring(var9));
                    return var8.toString();
                  } else {
                    StringBuilder discarded$19 = var8.append(param2.substring(var9, var10));
                    StringBuilder discarded$20 = var8.append(param3);
                    var9 = 1 + var10;
                    continue L4;
                  }
                }
              }
            }
          } else {
            var8 = new StringBuilder(var6);
            var9 = 0;
            L5: while (true) {
              var10 = param2.indexOf((int) param0, var9);
              if (0 > var10) {
                StringBuilder discarded$21 = var8.append(param2.substring(var9));
                return var8.toString();
              } else {
                StringBuilder discarded$22 = var8.append(param2.substring(var9, var10));
                StringBuilder discarded$23 = var8.append(param3);
                var9 = 1 + var10;
                continue L5;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        super.a(param0, param1, (byte) 62, param3);
        ((ke) this).field_T = -param1 + (nk.field_w + -((ke) this).field_u);
        if (param2 <= 49) {
            Object var6 = null;
            int discarded$0 = ke.a(-45, -96, (Random) null);
        }
    }

    final String h(int param0) {
        if (((ke) this).field_x) {
          if (null != ((ke) this).field_n) {
            qh.a(gb.field_e, nk.field_w + (-((ke) this).field_T + ((ke) this).field_v), 1);
            if (param0 != -27867) {
              field_W = null;
              return ((ke) this).field_n;
            } else {
              return ((ke) this).field_n;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void s(int param0) {
        field_X = null;
        field_U = null;
        if (param0 > -65) {
            field_V = false;
            field_W = null;
            return;
        }
        field_W = null;
    }

    ke(String param0, rm param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = new ag();
        field_X = new boolean[35];
    }
}
