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
            L1: {
              if (param0) {
                break L1;
              } else {
                int discarded$2 = ((gj) this).c(false);
                break L1;
              }
            }
            stackOut_2_0 = Integer.parseInt(((gj) this).field_Q.field_q);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final static void a(String param0, java.applet.Applet param1, boolean param2) {
        try {
            Throwable throwable = null;
            String var3 = null;
            RuntimeException var3_ref = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            String stackIn_11_2 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            String stackOut_10_2 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            try {
              bh.field_n = param0;
              try {
                L0: {
                  L1: {
                    var3 = param1.getParameter("cookieprefix");
                    var5 = var3;
                    var5 = var3;
                    var4 = param1.getParameter("cookiehost");
                    var5 = var4;
                    var5 = var4;
                    var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                    if (param0.length() != 0) {
                      break L1;
                    } else {
                      var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                      break L1;
                    }
                  }
                  cq.a(param1, (byte) -122, "document.cookie=\"" + var5 + "\"");
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  throwable = decompiledCaughtException;
                  break L2;
                }
              }
              ib.a(param1, false);
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_8_0 = (RuntimeException) var3_ref;
                stackOut_8_1 = new StringBuilder().append("gj.E(");
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (param0 == null) {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "null";
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L3;
                } else {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "{...}";
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L3;
                }
              }
              L4: {
                stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param1 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L4;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L4;
                }
              }
              throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + true + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private gj(eb param0, boolean param1) {
        super(0, 0, 0, 0, (eb) null);
        try {
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
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int e(byte param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int stackIn_1_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            var2_int = 11 / ((param0 - 23) / 48);
            stackOut_0_0 = Integer.parseInt(((gj) this).field_U.field_q);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_1_0;
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
        var6 = param0 - 130 >> 1;
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
            L0: {
              stackOut_2_0 = Integer.parseInt(((gj) this).field_O.field_q) - 1;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            return -1;
          }
          return stackIn_3_0;
        } else {
          return -5;
        }
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
        try {
            ep.field_b.b(param0, param2 + (param4.field_z - -(param4.field_E >> 1)), -5 + param4.field_p + param1, 16777215, -1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "gj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + 0 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(oa param0, int param1) {
        try {
            super.a(param0, param1);
            ((gj) this).field_U.field_n = (fn) (Object) param0;
            ((gj) this).field_O.field_n = (fn) (Object) param0;
            ((gj) this).field_Q.field_n = (fn) (Object) param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "gj.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void f(byte param0) {
        field_T = null;
        field_W = null;
        field_R = null;
    }

    gj(eb param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            ((gj) this).a(param4, (byte) 21, param3, param2, param5);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
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
