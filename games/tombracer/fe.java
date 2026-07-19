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
        int var6 = 0;
        super.a((byte) -31, param1, param2, param3, param4);
        var6 = -130 + param1 >> -556902431;
        if (this.field_G) {
          this.field_E.a((byte) -31, 25, param2, var6, 0);
          this.field_B.a((byte) -31, 25, param2, var6 + 45, 0);
          if (TombRacer.field_G) {
            this.field_B.a((byte) -31, 25, param2, var6, 0);
            this.field_E.a((byte) -31, 25, param2, var6 + 45, 0);
            this.field_D.a(param0, 40, param2, 90 + var6, 0);
            return;
          } else {
            this.field_D.a(param0, 40, param2, 90 + var6, 0);
            return;
          }
        } else {
          this.field_B.a((byte) -31, 25, param2, var6, 0);
          this.field_E.a((byte) -31, 25, param2, var6 + 45, 0);
          this.field_D.a(param0, 40, param2, 90 + var6, 0);
          return;
        }
    }

    private fe(isa param0, boolean param1) {
        super(0, 0, 0, 0, (isa) null);
        RuntimeException runtimeException = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              this.field_B = (tra) ((Object) new so("", (qc) null, 2));
              this.field_E = (tra) ((Object) new so("", (qc) null, 2));
              this.field_D = (tra) ((Object) new so("", (qc) null, 4));
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param1) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              L3: {
                ((fe) (this)).field_G = stackIn_4_1 != 0;
                this.field_D.field_r = param0;
                this.field_E.field_r = param0;
                this.field_B.field_r = param0;
                if (this.field_G) {
                  break L3;
                } else {
                  this.a(this.field_B, -1);
                  this.a(this.field_E, -1);
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.a(this.field_E, -1);
              this.a(this.field_B, -1);
              break L2;
            }
            this.a(this.field_D, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("fe.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
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
        int stackOut_2_0 = 0;
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
            stackOut_2_0 = Integer.parseInt(this.field_D.field_o);
            stackIn_3_0 = stackOut_2_0;
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
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 103) {
              stackOut_3_0 = Integer.parseInt(this.field_B.field_o);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = -6;
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

    final boolean i(byte param0) {
        int var2 = 0;
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
        int stackOut_2_0 = 0;
        if (param0 == 22829) {
          try {
            L0: {
              stackOut_2_0 = Integer.parseInt(this.field_E.field_o) + -1;
              stackIn_3_0 = stackOut_2_0;
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
