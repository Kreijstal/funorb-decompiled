/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends bf {
    static String field_T;
    private qn field_R;
    private qn field_P;
    static boolean field_U;
    static int field_O;
    static String field_Q;
    private boolean field_X;
    static byte[] field_S;
    private qn field_W;
    static String field_Y;
    static String field_V;

    final String g(int param0) {
        String var2 = ((ih) this).field_P.g(param0 + param0);
        if (!(var2 == null)) {
            return var2;
        }
        if (!(!((ih) this).field_w)) {
            return ((ih) this).field_j == null ? ((ih) this).field_v : ((ih) this).field_j;
        }
        return null;
    }

    final static void a(int param0, int param1) {
        if (param1 <= 1) {
            ih.a(46, -13);
            pk.a(param0, -66);
            return;
        }
        pk.a(param0, -66);
    }

    ih(jm param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            ((ih) this).a(param3, 34, param5, param4, param2);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ih.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final boolean h(byte param0) {
        if (((ih) this).field_R.field_v != null) {
          if (0 != ((ih) this).field_R.field_v.length()) {
            if (null != ((ih) this).field_P.field_v) {
              if (0 != ((ih) this).field_P.field_v.length()) {
                if (null != ((ih) this).field_W.field_v) {
                  if (((ih) this).field_W.field_v.length() != 0) {
                    if (param0 >= -118) {
                      field_S = null;
                      return false;
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

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, -128, param3);
        if (param1 == 0) {
          if (param2 > -80) {
            return;
          } else {
            param3 = param3 + ((ih) this).field_u;
            param0 = param0 + ((ih) this).field_r;
            this.a((mf) (Object) ((ih) this).field_R, param3, fn.field_f, -2200, param0);
            this.a((mf) (Object) ((ih) this).field_P, param3, mn.field_i, -2200, param0);
            this.a((mf) (Object) ((ih) this).field_W, param3, aj.field_d, -2200, param0);
            return;
          }
        } else {
          return;
        }
    }

    private ih(jm param0, boolean param1) {
        super(0, 0, 0, 0, (jm) null);
        try {
            ((ih) this).field_R = (qn) (Object) new bg("", (rg) null, 2);
            ((ih) this).field_P = (qn) (Object) new bg("", (rg) null, 2);
            ((ih) this).field_W = (qn) (Object) new bg("", (rg) null, 4);
            ((ih) this).field_W.field_n = param0;
            ((ih) this).field_P.field_n = param0;
            ((ih) this).field_R.field_n = param0;
            ((ih) this).field_X = param1 ? true : false;
            if (((ih) this).field_X) {
                ((ih) this).b((mf) (Object) ((ih) this).field_P, 95);
                ((ih) this).b((mf) (Object) ((ih) this).field_R, 95);
            } else {
                ((ih) this).b((mf) (Object) ((ih) this).field_R, 95);
                ((ih) this).b((mf) (Object) ((ih) this).field_P, 95);
            }
            ((ih) this).b((mf) (Object) ((ih) this).field_W, 95);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ih.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final int c(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!param0) {
              stackOut_3_0 = Integer.parseInt(((ih) this).field_R.field_v);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -32;
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

    final void a(boolean param0, ri param1) {
        try {
            super.a(param0, param1);
            ((ih) this).field_R.field_p = (rg) (Object) param1;
            ((ih) this).field_P.field_p = (rg) (Object) param1;
            ((ih) this).field_W.field_p = (rg) (Object) param1;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ih.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        super.a(param0, 34, param2, param3, param4);
        var6 = -130 + param3 >> 1;
        if (((ih) this).field_X) {
          ((ih) this).field_P.a(0, 34, param2, 25, var6);
          ((ih) this).field_R.a(0, 34, param2, 25, var6 + 45);
          ((ih) this).field_W.a(0, (int) (char)param1, param2, 40, 90 + var6);
          return;
        } else {
          ((ih) this).field_R.a(0, 34, param2, 25, var6);
          ((ih) this).field_P.a(0, 34, param2, 25, var6 - -45);
          ((ih) this).field_W.a(0, (int) (char)param1, param2, 40, 90 + var6);
          return;
        }
    }

    final int i(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0 >= 75) {
          try {
            L0: {
              stackOut_2_0 = Integer.parseInt(((ih) this).field_W.field_v);
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
          return -116;
        }
    }

    public static void i(byte param0) {
        field_Q = null;
        field_V = null;
        field_T = null;
        field_Y = null;
        field_S = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        rf.a((byte) -122, param1);
        bb.a(param1, 69, param0, param2);
    }

    private final void a(mf param0, int param1, String param2, int param3, int param4) {
        if (param3 != -2200) {
            return;
        }
        try {
            rc.field_a.b(param2, (param0.field_y >> 1) + (param1 + param0.field_u), param0.field_r + (param4 - 5), 16777215, -1);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "ih.P(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final int h(int param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -1) {
              stackOut_3_0 = -1 + Integer.parseInt(((ih) this).field_P.field_v);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = -6;
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
        field_O = 0;
        field_Y = "Use this alternative as your account name";
        field_S = new byte[]{(byte) 3};
        field_V = "<%0> cannot join; the game has started.";
    }
}
