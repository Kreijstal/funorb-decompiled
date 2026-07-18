/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends ji {
    private go field_R;
    private go field_O;
    private boolean field_J;
    private go field_M;
    static pf field_P;
    static char[] field_L;
    static String field_Q;
    static long field_N;
    static String field_K;

    private final void a(int param0, boolean param1, vg param2, String param3, int param4) {
        try {
            mf.field_x.c(param3, param0 - (-param2.field_m - (param2.field_x >> 1)), param2.field_q + param4 + -5, 16777215, -1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "wd.M(" + param0 + ',' + false + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        super.a(param0, param1, (byte) 119, param3, param4);
        if (param2 > 99) {
          var6 = -130 + param4 >> 1;
          if (!((wd) this).field_J) {
            ((wd) this).field_O.a(0, param1, (byte) 108, var6, 25);
            ((wd) this).field_M.a(0, param1, (byte) 122, var6 - -45, 25);
            ((wd) this).field_R.a(0, param1, (byte) 103, 90 + var6, 40);
            return;
          } else {
            ((wd) this).field_M.a(0, param1, (byte) 125, var6, 25);
            ((wd) this).field_O.a(0, param1, (byte) 113, 45 + var6, 25);
            ((wd) this).field_R.a(0, param1, (byte) 103, 90 + var6, 40);
            return;
          }
        } else {
          ((wd) this).field_M = null;
          var6 = -130 + param4 >> 1;
          if (!((wd) this).field_J) {
            ((wd) this).field_O.a(0, param1, (byte) 108, var6, 25);
            ((wd) this).field_M.a(0, param1, (byte) 122, var6 - -45, 25);
            ((wd) this).field_R.a(0, param1, (byte) 103, 90 + var6, 40);
            return;
          } else {
            ((wd) this).field_M.a(0, param1, (byte) 125, var6, 25);
            ((wd) this).field_O.a(0, param1, (byte) 113, 45 + var6, 25);
            ((wd) this).field_R.a(0, param1, (byte) 103, 90 + var6, 40);
            return;
          }
        }
    }

    final String c(boolean param0) {
        String var2 = null;
        if (!param0) {
            field_K = null;
            var2 = ((wd) this).field_M.c(param0);
            if (var2 != null) {
                return var2;
            }
            if (!(!((wd) this).field_k)) {
                return null == ((wd) this).field_v ? ((wd) this).field_s : ((wd) this).field_v;
            }
            return null;
        }
        var2 = ((wd) this).field_M.c(param0);
        if (var2 != null) {
            return var2;
        }
        if (!(!((wd) this).field_k)) {
            return null == ((wd) this).field_v ? ((wd) this).field_s : ((wd) this).field_v;
        }
        return null;
    }

    final boolean k(int param0) {
        if (((wd) this).field_O.field_s != null) {
          if (((wd) this).field_O.field_s.length() != 0) {
            if (param0 < -42) {
              L0: {
                if (((wd) this).field_M.field_s == null) {
                  break L0;
                } else {
                  if (((wd) this).field_M.field_s.length() == 0) {
                    break L0;
                  } else {
                    if (((wd) this).field_R.field_s != null) {
                      if (((wd) this).field_R.field_s.length() == 0) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return true;
                    }
                  }
                }
              }
              return true;
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

    final int l(int param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= 65) {
              stackOut_3_0 = Integer.parseInt(((wd) this).field_R.field_s);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -36;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_4_0;
    }

    final int f(byte param0) {
        int var2 = 0;
        NumberFormatException var3 = null;
        int stackIn_2_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        var2 = 74 / ((param0 - 48) / 42);
        try {
          L0: {
            stackOut_1_0 = Integer.parseInt(((wd) this).field_M.field_s) - 1;
            stackIn_2_0 = stackOut_1_0;
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_2_0;
    }

    final void a(ja param0, int param1) {
        try {
            super.a(param0, -93);
            if (param1 >= -47) {
                ((wd) this).field_M = null;
            }
            ((wd) this).field_O.field_u = (ko) (Object) param0;
            ((wd) this).field_M.field_u = (ko) (Object) param0;
            ((wd) this).field_R.field_u = (ko) (Object) param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "wd.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    wd(iq param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            ((wd) this).a(param3, param5, (byte) 110, param2, param4);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "wd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private wd(iq param0, boolean param1) {
        super(0, 0, 0, 0, (iq) null);
        try {
            ((wd) this).field_O = (go) (Object) new fa("", (ko) null, 2);
            ((wd) this).field_M = (go) (Object) new fa("", (ko) null, 2);
            ((wd) this).field_R = (go) (Object) new fa("", (ko) null, 4);
            ((wd) this).field_R.field_p = param0;
            ((wd) this).field_M.field_p = param0;
            ((wd) this).field_O.field_p = param0;
            ((wd) this).field_J = param1 ? true : false;
            if (!((wd) this).field_J) {
                ((wd) this).b((byte) -57, (vg) (Object) ((wd) this).field_O);
                ((wd) this).b((byte) -62, (vg) (Object) ((wd) this).field_M);
            } else {
                ((wd) this).b((byte) -124, (vg) (Object) ((wd) this).field_M);
                ((wd) this).b((byte) -121, (vg) (Object) ((wd) this).field_O);
            }
            ((wd) this).b((byte) -71, (vg) (Object) ((wd) this).field_R);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "wd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        if (param2 < 2) {
            if (param0 < 5) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (0 != param0) {
          return;
        } else {
          if (param1 != -11857) {
            field_Q = null;
            param2 = param2 + ((wd) this).field_q;
            param3 = param3 + ((wd) this).field_m;
            this.a(param3, false, (vg) (Object) ((wd) this).field_O, bh.field_n, param2);
            this.a(param3, false, (vg) (Object) ((wd) this).field_M, ac.field_p, param2);
            this.a(param3, false, (vg) (Object) ((wd) this).field_R, mg.field_D, param2);
            return;
          } else {
            param2 = param2 + ((wd) this).field_q;
            param3 = param3 + ((wd) this).field_m;
            this.a(param3, false, (vg) (Object) ((wd) this).field_O, bh.field_n, param2);
            this.a(param3, false, (vg) (Object) ((wd) this).field_M, ac.field_p, param2);
            this.a(param3, false, (vg) (Object) ((wd) this).field_R, mg.field_D, param2);
            return;
          }
        }
    }

    public static void e() {
        field_L = null;
        field_K = null;
        field_Q = null;
        field_P = null;
    }

    final int d(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!param0) {
              stackOut_3_0 = Integer.parseInt(((wd) this).field_O.field_s);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 121;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new char[]{'[', ']', '#'};
        field_P = new pf();
        field_Q = "Sound: ";
        field_K = "No spectators";
    }
}
