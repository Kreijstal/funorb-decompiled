/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe extends paa {
    static String[] field_A;
    private tra field_E;
    static int[] field_C;
    static oj field_F;
    private tra field_B;
    private boolean field_G;
    private tra field_D;

    public static void e(int param0) {
        if (param0 != 25) {
          fe.e(83);
          field_C = null;
          field_A = null;
          field_F = null;
          return;
        } else {
          field_C = null;
          field_A = null;
          field_F = null;
          return;
        }
    }

    fe(isa param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
            this.a((byte) -31, param4, param5, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6;
        super.a((byte) -31, param1, param2, param3, param4);
        var6 = -130 + param1 >> -556902431;
        if (this.field_G) {
          this.field_E.a((byte) -31, 25, param2, var6, 0);
          this.field_B.a((byte) -31, 25, param2, var6 + 45, 0);
          this.field_D.a(param0, 40, param2, 90 + var6, 0);
          return;
        } else {
          this.field_B.a((byte) -31, 25, param2, var6, 0);
          this.field_E.a((byte) -31, 25, param2, var6 + 45, 0);
          this.field_D.a(param0, 40, param2, 90 + var6, 0);
          return;
        }
    }

    private fe(isa param0, boolean param1) {
        super(0, 0, 0, 0, (isa) null);
        try {
            this.field_B = (tra) ((Object) new so("", (qc) null, 2));
            this.field_E = (tra) ((Object) new so("", (qc) null, 2));
            this.field_D = (tra) ((Object) new so("", (qc) null, 4));
            this.field_G = param1 ? true : false;
            this.field_D.field_r = param0;
            this.field_E.field_r = param0;
            this.field_B.field_r = param0;
            if (!this.field_G) {
                this.a(this.field_B, -1);
                this.a(this.field_E, -1);
            } else {
                this.a(this.field_E, -1);
                this.a(this.field_B, -1);
            }
            this.a(this.field_D, -1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        } else {
          param1 = param1 + this.field_n;
          param0 = param0 + this.field_i;
          this.a(-44, param0, this.field_B, param1, oda.field_i);
          this.a(-121, param0, this.field_E, param1, kp.field_d);
          this.a(param2 + -62, param0, this.field_D, param1, rla.field_y);
          return;
        }
    }

    final int j(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 == 110) {
            break L0;
          } else {
            this.a((byte) 13, 53, -119, 96, 97);
            break L0;
          }
        }
        try {
          L1: {
            stackIn_3_0 = Integer.parseInt(this.field_D.field_o);
            break L1;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
        return stackIn_3_0;
    }

    final String d(byte param0) {
        int var2 = 46 % ((-58 - param0) / 60);
        String var3 = this.field_E.d((byte) -127);
        if (!(var3 == null)) {
            return var3;
        }
        if (!(!this.field_f)) {
            return this.field_q == null ? this.field_o : this.field_q;
        }
        return null;
    }

    private final void a(int param0, int param1, ae param2, int param3, String param4) {
        try {
            if (param0 > -25) {
                this.field_B = (tra) null;
            }
            eka.field_o.a(param4, (param2.field_m >> 2097792929) + (param2.field_i + param1), param3 + param2.field_n + -5, 16777215, -1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fe.LA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            if (param0 > 103) {
              stackIn_4_0 = Integer.parseInt(this.field_B.field_o);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -6;
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

    final boolean i(byte param0) {
        int var2;
        var2 = 39 / ((31 - param0) / 33);
        if (this.field_B.field_o != null) {
          if (this.field_B.field_o.length() != 0) {
            if (this.field_E.field_o != null) {
              if (this.field_E.field_o.length() != 0) {
                if (null != this.field_D.field_o) {
                  if (0 == this.field_D.field_o.length()) {
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
    }

    final void a(byte param0, uba param1) {
        try {
            super.a((byte) -95, param1);
            this.field_B.field_h = (qc) ((Object) param1);
            int var3_int = 118 / ((-36 - param0) / 59);
            this.field_E.field_h = (qc) ((Object) param1);
            this.field_D.field_h = (qc) ((Object) param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fe.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int d(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 == 22829) {
          try {
            L0: {
              stackIn_3_0 = Integer.parseInt(this.field_E.field_o) + -1;
              break L0;
            }
          } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (NumberFormatException) (Object) decompiledCaughtException;
            return -1;
          }
          return stackIn_3_0;
        } else {
          return -70;
        }
    }

    static {
        field_A = new String[]{"<%0> had a touch of the vapours", "<%0> didn't notice the funny smell", "<%0> should have brought a gas mask", "<%0> came for the treasure, but stayed for the deadly gas"};
        field_C = new int[]{0, 70, 70, 70, 70};
    }
}
