/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends kb {
    static boolean field_V;
    static wm field_T;
    private c field_Q;
    private c field_O;
    private c field_U;
    private boolean field_S;
    static String[] field_R;
    static long field_P;
    static tf[] field_W;

    final int c(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        try {
          L0: {
            if (param0) {
              break L0;
            } else {
              int discarded$2 = ((gj) this).c(false);
              break L0;
            }
          }
          stackOut_2_0 = Integer.parseInt(((gj) this).field_Q.field_q);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    final static void a(String param0, java.applet.Applet param1, boolean param2) {
        try {
            Throwable throwable = null;
            String var3 = null;
            String var4 = null;
            String var5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        bh.field_n = param0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = param1.getParameter("cookieprefix");
                            var5 = var3;
                            var5 = var3;
                            var4 = param1.getParameter("cookiehost");
                            var5 = var4;
                            var5 = var4;
                            var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                            if (param0.length() != 0) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            cq.a(param1, (byte) -122, "document.cookie=\"" + var5 + "\"");
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        throwable = caughtException;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        ib.a(param1, false);
                        if (!param2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        field_V = false;
                        return;
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

    private gj(eb param0, boolean param1) {
        super(0, 0, 0, 0, (eb) null);
        ((gj) this).field_U = (c) (Object) new gk("", (fn) null, 2);
        ((gj) this).field_O = (c) (Object) new gk("", (fn) null, 2);
        ((gj) this).field_Q = (c) (Object) new gk("", (fn) null, 4);
        ((gj) this).field_Q.field_y = param0;
        ((gj) this).field_O.field_y = param0;
        ((gj) this).field_U.field_y = param0;
        ((gj) this).field_S = param1 ? true : false;
        if (!((gj) this).field_S) {
            ((gj) this).b((ng) (Object) ((gj) this).field_U, 80);
            ((gj) this).b((ng) (Object) ((gj) this).field_O, 80);
        } else {
            ((gj) this).b((ng) (Object) ((gj) this).field_O, 80);
            ((gj) this).b((ng) (Object) ((gj) this).field_U, 80);
        }
        ((gj) this).b((ng) (Object) ((gj) this).field_Q, 80);
    }

    final int e(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int stackIn_1_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          var2_int = 11 / ((param0 - 23) / 48);
          stackOut_0_0 = Integer.parseInt(((gj) this).field_U.field_q);
          stackIn_1_0 = stackOut_0_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_1_0;
        }
        return 0;
    }

    final boolean m(int param0) {
        if (null != ((gj) this).field_U.field_q) {
          if (((gj) this).field_U.field_q.length() != 0) {
            if (((gj) this).field_O.field_q != null) {
              if (((gj) this).field_O.field_q.length() != 0) {
                if (param0 == -1) {
                  if (((gj) this).field_Q.field_q != null) {
                    if (((gj) this).field_Q.field_q.length() == 0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 0;
        super.a(param0, (byte) 77, param2, param3, param4);
        var6 = param0 - 130 >> -974963391;
        if (!((gj) this).field_S) {
          ((gj) this).field_U.a(25, (byte) 77, 0, var6, param4);
          ((gj) this).field_O.a(25, (byte) 48, 0, 45 + var6, param4);
          ((gj) this).field_Q.a(40, (byte) 38, 0, 90 + var6, param4);
          if (param1 >= 19) {
            return;
          } else {
            field_P = -61L;
            return;
          }
        } else {
          ((gj) this).field_O.a(25, (byte) 29, 0, var6, param4);
          ((gj) this).field_U.a(25, (byte) 46, 0, var6 - -45, param4);
          ((gj) this).field_Q.a(40, (byte) 38, 0, 90 + var6, param4);
          if (param1 >= 19) {
            return;
          } else {
            field_P = -61L;
            return;
          }
        }
    }

    final int l(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0 == 25) {
          try {
            stackOut_2_0 = Integer.parseInt(((gj) this).field_O.field_q) - 1;
            stackIn_3_0 = stackOut_2_0;
          } catch (java.lang.Exception decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
            return stackIn_3_0;
          }
        } else {
          return -5;
        }
        return 0;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        super.a(param0, param1, param2, (byte) -123);
        if (param1 != 0) {
          return;
        } else {
          param0 = param0 + ((gj) this).field_p;
          var5 = -46 / ((param3 - 70) / 49);
          param2 = param2 + ((gj) this).field_z;
          this.a(ij.field_r, param0, param2, 0, (ng) (Object) ((gj) this).field_U);
          this.a(fc.field_b, param0, param2, 0, (ng) (Object) ((gj) this).field_O);
          this.a(ji.field_e, param0, param2, 0, (ng) (Object) ((gj) this).field_Q);
          return;
        }
    }

    private final void a(String param0, int param1, int param2, int param3, ng param4) {
        if (param3 != 0) {
          return;
        } else {
          ep.field_b.b(param0, param2 + (param4.field_z - -(param4.field_E >> 122344577)), -5 + param4.field_p + param1, 16777215, -1);
          return;
        }
    }

    final void a(oa param0, int param1) {
        super.a(param0, param1);
        ((gj) this).field_U.field_n = (fn) (Object) param0;
        ((gj) this).field_O.field_n = (fn) (Object) param0;
        ((gj) this).field_Q.field_n = (fn) (Object) param0;
    }

    public static void f(byte param0) {
        field_T = null;
        if (param0 != -28) {
            field_R = null;
            field_W = null;
            field_R = null;
            return;
        }
        field_W = null;
        field_R = null;
    }

    gj(eb param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        ((gj) this).a(param4, (byte) 21, param3, param2, param5);
    }

    final String b(byte param0) {
        String var2 = ((gj) this).field_O.b((byte) 114);
        if (var2 != null) {
            return var2;
        }
        if (param0 <= 16) {
            ((gj) this).field_U = null;
            if (!(!((gj) this).field_D)) {
                return ((gj) this).field_l == null ? ((gj) this).field_q : ((gj) this).field_l;
            }
            return null;
        }
        if (!(!((gj) this).field_D)) {
            return ((gj) this).field_l == null ? ((gj) this).field_q : ((gj) this).field_l;
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = new String[]{"A slightly different approach is required to complete all fifty pictures in Puzzle Mode. Although the timer bar is gone, you'll only have a <col=FF9900>limited supply of tiles</col> in the list on the right. If you run out of tiles, then the puzzle is failed and you will have to try again. "};
        field_T = new wm(4, 1, 1, 1);
    }
}
