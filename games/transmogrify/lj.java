/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class lj extends qg {
    private boolean field_v;
    static bb field_u;
    boolean field_t;
    static double field_x;
    static hi field_z;
    private boolean field_w;
    boolean field_y;

    final static int a(int param0, char param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        var3 = 0;
        var4 = param2.length();
        var5 = 0;
        L0: while (true) {
          if (var4 <= var5) {
            if (param0 < 120) {
              field_x = 0.6750055556683646;
              return var3;
            } else {
              return var3;
            }
          } else {
            if (param2.charAt(var5) == param1) {
              var3++;
              var5++;
              var5++;
              continue L0;
            } else {
              var5++;
              var5++;
              continue L0;
            }
          }
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
            field_x = -1.0687482226304967;
            field_z = null;
            field_u = null;
            return;
        }
        field_z = null;
        field_u = null;
    }

    boolean a(qg param0, int param1) {
        if (((lj) this).field_t) {
          if (((lj) this).field_v) {
            param0.e(-29113);
            ((lj) this).field_w = true;
            if (((lj) this).field_m != null) {
              if (((lj) this).field_m instanceof la) {
                ((la) (Object) ((lj) this).field_m).a((qg) this, (byte) -73, ((lj) this).field_w);
                if (param1 >= -11) {
                  ((lj) this).field_t = false;
                  return true;
                } else {
                  return true;
                }
              } else {
                if (param1 >= -11) {
                  ((lj) this).field_t = false;
                  return true;
                } else {
                  return true;
                }
              }
            } else {
              if (param1 >= -11) {
                ((lj) this).field_t = false;
                return true;
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void d(byte param0) {
        int var1 = -62 / ((37 - param0) / 44);
        tb.a(ha.b(119), true);
    }

    lj(String param0, ui param1, ma param2) {
        super(param0, param1, param2);
        ((lj) this).field_t = true;
        ((lj) this).field_w = false;
        ((lj) this).field_v = true;
    }

    lj(String param0, ma param1) {
        this(param0, vi.field_e.field_d, param1);
    }

    boolean a(int param0, qg param1, byte param2, char param3) {
        int var5 = 0;
        var5 = 15 % ((param2 - 65) / 55);
        if (((lj) this).b((byte) 109)) {
          if ((param0 ^ -1) != -85) {
            if ((param0 ^ -1) != -84) {
              return false;
            } else {
              ((lj) this).a((byte) -102, -1, 1, -1);
              return true;
            }
          } else {
            ((lj) this).a((byte) -102, -1, 1, -1);
            return true;
          }
        } else {
          return false;
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        var5 = 23 / ((50 - param0) / 45);
        if (((lj) this).field_m != null) {
          if (!(((lj) this).field_m instanceof df)) {
            return;
          } else {
            ((df) (Object) ((lj) this).field_m).a((lj) this, 17, param1, param2, param3);
            return;
          }
        } else {
          return;
        }
    }

    final StringBuilder a(int param0, int param1, StringBuilder param2, Hashtable param3) {
        if (param1 < -20) {
          if (((lj) this).a((byte) -105, param3, param2, param0)) {
            ((lj) this).a(param2, 74, param0, param3);
            if (!((lj) this).field_y) {
              if (((lj) this).field_t) {
                return param2;
              } else {
                StringBuilder discarded$6 = param2.append(" disabled");
                return param2;
              }
            } else {
              L0: {
                StringBuilder discarded$7 = param2.append(" active");
                if (!((lj) this).field_t) {
                  StringBuilder discarded$8 = param2.append(" disabled");
                  break L0;
                } else {
                  break L0;
                }
              }
              return param2;
            }
          } else {
            return param2;
          }
        } else {
          ((lj) this).a((byte) 29, 113, 50, 108);
          if (((lj) this).a((byte) -105, param3, param2, param0)) {
            ((lj) this).a(param2, 74, param0, param3);
            if (!((lj) this).field_y) {
              L1: {
                if (!((lj) this).field_t) {
                  StringBuilder discarded$9 = param2.append(" disabled");
                  break L1;
                } else {
                  break L1;
                }
              }
              return param2;
            } else {
              L2: {
                StringBuilder discarded$10 = param2.append(" active");
                if (!((lj) this).field_t) {
                  StringBuilder discarded$11 = param2.append(" disabled");
                  break L2;
                } else {
                  break L2;
                }
              }
              return param2;
            }
          } else {
            return param2;
          }
        }
    }

    void a(int param0, byte param1, qg param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (0 != ((lj) this).field_s) {
          if (((lj) this).field_s != b.field_k) {
            if (!((lj) this).b(param3, param0, param1 + 11, oa.field_j, bk.field_a)) {
              ((lj) this).a(param0, oa.field_j, param2, -1, bk.field_a, param3);
              return;
            } else {
              if (0 == b.field_k) {
                ((lj) this).a((byte) -105, -param0 + bk.field_a, ((lj) this).field_s, -param3 + oa.field_j);
                ((lj) this).a(param0, oa.field_j, param2, -1, bk.field_a, param3);
                return;
              } else {
                ((lj) this).a(param0, oa.field_j, param2, -1, bk.field_a, param3);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        if (((lj) this).field_t) {
          if (((lj) this).b(param3, param6, param4 ^ 30385, param0, param5)) {
            boolean discarded$2 = ((lj) this).a(param2, param4 + 30272);
            ((lj) this).field_s = param1;
            if (null != ((lj) this).field_m) {
              if (!(((lj) this).field_m instanceof lg)) {
                return true;
              } else {
                ((lg) (Object) ((lj) this).field_m).a(31298, param0, param5, param3, param1, param6, (lj) this);
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param4 != -30386) {
              ((lj) this).field_y = false;
              return false;
            } else {
              return false;
            }
          }
        } else {
          if (param4 != -30386) {
            ((lj) this).field_y = false;
            return false;
          } else {
            return false;
          }
        }
    }

    final boolean b(byte param0) {
        int var2 = 10 % ((-57 - param0) / 46);
        return ((lj) this).field_w;
    }

    final void a(int param0, int param1, qg param2, int param3, int param4, int param5) {
        if (param3 == -1) {
          if (((lj) this).field_m != null) {
            if (!(((lj) this).field_m instanceof lg)) {
              ((lj) this).field_s = 0;
              return;
            } else {
              ((lg) (Object) ((lj) this).field_m).a((lj) this, param1, 9976, param4, param0, param5);
              ((lj) this).field_s = 0;
              return;
            }
          } else {
            ((lj) this).field_s = 0;
            return;
          }
        } else {
          lj.d((byte) 20);
          if (((lj) this).field_m == null) {
            ((lj) this).field_s = 0;
            return;
          } else {
            L0: {
              if (((lj) this).field_m instanceof lg) {
                ((lg) (Object) ((lj) this).field_m).a((lj) this, param1, 9976, param4, param0, param5);
                break L0;
              } else {
                break L0;
              }
            }
            ((lj) this).field_s = 0;
            return;
          }
        }
    }

    final void e(int param0) {
        if (((lj) this).field_w) {
          ((lj) this).field_w = false;
          if (null != ((lj) this).field_m) {
            if (!(((lj) this).field_m instanceof la)) {
              if (param0 != -29113) {
                ((lj) this).field_y = true;
                return;
              } else {
                return;
              }
            } else {
              ((la) (Object) ((lj) this).field_m).a((qg) this, (byte) -42, ((lj) this).field_w);
              if (param0 != -29113) {
                ((lj) this).field_y = true;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != -29113) {
              ((lj) this).field_y = true;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -29113) {
            ((lj) this).field_y = true;
            return;
          } else {
            return;
          }
        }
    }

    final static String a(boolean param0, String param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object stackIn_3_0 = null;
            String stackIn_10_0 = null;
            Object stackOut_2_0 = null;
            String stackOut_9_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = Transmogrify.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param0) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = null;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return (String) (Object) stackIn_3_0;
                    }
                    case 4: {
                        try {
                            var3 = (String) kj.a(param2, false, "getcookies");
                            var4 = vi.a(';', var3, 0);
                            var5 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 14;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 11;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) param1)) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = var4[var5].substring(1 + var6).trim();
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0;
                    }
                    case 11: {
                        try {
                            var5++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var3_ref = caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        return null;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected lj() {
        ((lj) this).field_t = true;
        ((lj) this).field_w = false;
        ((lj) this).field_v = true;
        ((lj) this).field_q = vi.field_e.field_o;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = 0.0;
    }
}
