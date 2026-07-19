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
            if (param1) {
                ja var7 = (ja) null;
                this.a((ja) null, -116);
            }
            mf.field_x.c(param3, param0 - (-param2.field_m - (param2.field_x >> -764999743)), param2.field_q + param4 + -5, 16777215, -1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "wd.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        super.a(param0, param1, (byte) 119, param3, param4);
        if (param2 > 99) {
          var6 = -130 + param4 >> -914328031;
          if (!this.field_J) {
            this.field_O.a(0, param1, (byte) 108, var6, 25);
            this.field_M.a(0, param1, (byte) 122, var6 - -45, 25);
            this.field_R.a(0, param1, (byte) 103, 90 + var6, 40);
            return;
          } else {
            this.field_M.a(0, param1, (byte) 125, var6, 25);
            this.field_O.a(0, param1, (byte) 113, 45 + var6, 25);
            this.field_R.a(0, param1, (byte) 103, 90 + var6, 40);
            return;
          }
        } else {
          this.field_M = (go) null;
          var6 = -130 + param4 >> -914328031;
          if (!this.field_J) {
            this.field_O.a(0, param1, (byte) 108, var6, 25);
            this.field_M.a(0, param1, (byte) 122, var6 - -45, 25);
            this.field_R.a(0, param1, (byte) 103, 90 + var6, 40);
            return;
          } else {
            this.field_M.a(0, param1, (byte) 125, var6, 25);
            this.field_O.a(0, param1, (byte) 113, 45 + var6, 25);
            this.field_R.a(0, param1, (byte) 103, 90 + var6, 40);
            return;
          }
        }
    }

    final String c(boolean param0) {
        String var2 = null;
        if (!param0) {
            field_K = (String) null;
            var2 = this.field_M.c(param0);
            if (var2 != null) {
                return var2;
            }
            if (!(!this.field_k)) {
                return null == this.field_v ? this.field_s : this.field_v;
            }
            return null;
        }
        var2 = this.field_M.c(param0);
        if (var2 != null) {
            return var2;
        }
        if (!(!this.field_k)) {
            return null == this.field_v ? this.field_s : this.field_v;
        }
        return null;
    }

    final boolean k(int param0) {
        if (this.field_O.field_s != null) {
          if (this.field_O.field_s.length() != 0) {
            if (param0 < -42) {
              L0: {
                if (this.field_M.field_s == null) {
                  break L0;
                } else {
                  if (this.field_M.field_s.length() == 0) {
                    break L0;
                  } else {
                    if (this.field_R.field_s != null) {
                      if (this.field_R.field_s.length() == 0) {
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
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= 65) {
              stackOut_3_0 = Integer.parseInt(this.field_R.field_s);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -36;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
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
            stackOut_1_0 = Integer.parseInt(this.field_M.field_s) - 1;
            stackIn_2_0 = stackOut_1_0;
            break L0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
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
                this.field_M = (go) null;
            }
            this.field_O.field_u = (ko) ((Object) param0);
            this.field_M.field_u = (ko) ((Object) param0);
            this.field_R.field_u = (ko) ((Object) param0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "wd.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    wd(iq param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            this.a(param3, param5, (byte) 110, param2, param4);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "wd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private wd(iq param0, boolean param1) {
        super(0, 0, 0, 0, (iq) null);
        try {
            this.field_O = (go) ((Object) new fa("", (ko) null, 2));
            this.field_M = (go) ((Object) new fa("", (ko) null, 2));
            this.field_R = (go) ((Object) new fa("", (ko) null, 4));
            this.field_R.field_p = param0;
            this.field_M.field_p = param0;
            this.field_O.field_p = param0;
            this.field_J = param1 ? true : false;
            if (!this.field_J) {
                this.b((byte) -57, this.field_O);
                this.b((byte) -62, this.field_M);
            } else {
                this.b((byte) -124, this.field_M);
                this.b((byte) -121, this.field_O);
            }
            this.b((byte) -71, this.field_R);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "wd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        var3 = 26 % ((80 - param1) / 43);
        if (-3 < (param2 ^ -1)) {
          if (param0 < 5) {
            return 0;
          } else {
            return 1;
          }
        } else {
          return 2;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1 + 0, param2, param3);
        if (0 != param0) {
          return;
        } else {
          if (param1 != -11857) {
            field_Q = (String) null;
            param2 = param2 + this.field_q;
            param3 = param3 + this.field_m;
            this.a(param3, false, this.field_O, bh.field_n, param2);
            this.a(param3, false, this.field_M, ac.field_p, param2);
            this.a(param3, false, this.field_R, mg.field_D, param2);
            return;
          } else {
            param2 = param2 + this.field_q;
            param3 = param3 + this.field_m;
            this.a(param3, false, this.field_O, bh.field_n, param2);
            this.a(param3, false, this.field_M, ac.field_p, param2);
            this.a(param3, false, this.field_R, mg.field_D, param2);
            return;
          }
        }
    }

    public static void e(boolean param0) {
        field_L = null;
        if (param0) {
          field_Q = (String) null;
          field_K = null;
          field_Q = null;
          field_P = null;
          return;
        } else {
          field_K = null;
          field_Q = null;
          field_P = null;
          return;
        }
    }

    final int d(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!param0) {
              stackOut_3_0 = Integer.parseInt(this.field_O.field_s);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 121;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_L = new char[]{(char)91, (char)93, (char)35};
        field_P = new pf();
        field_Q = "Sound: ";
        field_K = "No spectators";
    }
}
