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
        ((fe) this).a((byte) -31, param4, param5, param2, param3);
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        super.a((byte) -31, param1, param2, param3, param4);
        var6 = -130 + param1 >> -556902431;
        if (((fe) this).field_G) {
          ((fe) this).field_E.a((byte) -31, 25, param2, var6, 0);
          ((fe) this).field_B.a((byte) -31, 25, param2, var6 + 45, 0);
          ((fe) this).field_D.a(param0, 40, param2, 90 + var6, 0);
          return;
        } else {
          ((fe) this).field_B.a((byte) -31, 25, param2, var6, 0);
          ((fe) this).field_E.a((byte) -31, 25, param2, var6 + 45, 0);
          ((fe) this).field_D.a(param0, 40, param2, 90 + var6, 0);
          return;
        }
    }

    private fe(isa param0, boolean param1) {
        super(0, 0, 0, 0, (isa) null);
        ((fe) this).field_B = (tra) (Object) new so("", (qc) null, 2);
        ((fe) this).field_E = (tra) (Object) new so("", (qc) null, 2);
        ((fe) this).field_D = (tra) (Object) new so("", (qc) null, 4);
        ((fe) this).field_G = param1 ? true : false;
        ((fe) this).field_D.field_r = param0;
        ((fe) this).field_E.field_r = param0;
        ((fe) this).field_B.field_r = param0;
        if (!((fe) this).field_G) {
            ((fe) this).a((ae) (Object) ((fe) this).field_B, -1);
            ((fe) this).a((ae) (Object) ((fe) this).field_E, -1);
        } else {
            ((fe) this).a((ae) (Object) ((fe) this).field_E, -1);
            ((fe) this).a((ae) (Object) ((fe) this).field_B, -1);
        }
        ((fe) this).a((ae) (Object) ((fe) this).field_D, -1);
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        } else {
          param1 = param1 + ((fe) this).field_n;
          param0 = param0 + ((fe) this).field_i;
          this.a(-44, param0, (ae) (Object) ((fe) this).field_B, param1, oda.field_i);
          this.a(-121, param0, (ae) (Object) ((fe) this).field_E, param1, kp.field_d);
          this.a(param2 + -62, param0, (ae) (Object) ((fe) this).field_D, param1, rla.field_y);
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
            ((fe) this).a((byte) 13, 53, -119, 96, 97);
            break L0;
          }
        }
        try {
          stackOut_2_0 = Integer.parseInt(((fe) this).field_D.field_o);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    final String d(byte param0) {
        int var2 = 46 % ((-58 - param0) / 60);
        String var3 = ((fe) this).field_E.d((byte) -127);
        if (!(var3 == null)) {
            return var3;
        }
        if (!(!((fe) this).field_f)) {
            return ((fe) this).field_q == null ? ((fe) this).field_o : ((fe) this).field_q;
        }
        return null;
    }

    private final void a(int param0, int param1, ae param2, int param3, String param4) {
        if (param0 > -25) {
          ((fe) this).field_B = null;
          eka.field_o.a(param4, (param2.field_m >> 2097792929) + (param2.field_i + param1), param3 + param2.field_n + -5, 16777215, -1);
          return;
        } else {
          eka.field_o.a(param4, (param2.field_m >> 2097792929) + (param2.field_i + param1), param3 + param2.field_n + -5, 16777215, -1);
          return;
        }
    }

    final int a(int param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        try {
          if (param0 > 103) {
            return stackIn_2_0;
          } else {
            stackOut_1_0 = -6;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = Integer.parseInt(((fe) this).field_B.field_o);
          stackIn_4_0 = stackOut_3_0;
        }
        return 0;
    }

    final boolean i(byte param0) {
        int var2 = 0;
        var2 = 39 / ((31 - param0) / 33);
        if (((fe) this).field_B.field_o != null) {
          if (((fe) this).field_B.field_o.length() != 0) {
            if (((fe) this).field_E.field_o != null) {
              if (((fe) this).field_E.field_o.length() != 0) {
                if (null != ((fe) this).field_D.field_o) {
                  if (0 == ((fe) this).field_D.field_o.length()) {
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
        super.a((byte) -95, param1);
        ((fe) this).field_B.field_h = (qc) (Object) param1;
        int var3 = 118 / ((-36 - param0) / 59);
        ((fe) this).field_E.field_h = (qc) (Object) param1;
        ((fe) this).field_D.field_h = (qc) (Object) param1;
    }

    final int d(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0 == 22829) {
          try {
            stackOut_2_0 = Integer.parseInt(((fe) this).field_E.field_o) + -1;
            stackIn_3_0 = stackOut_2_0;
          } catch (java.lang.Exception decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
            return stackIn_3_0;
          }
        } else {
          return -70;
        }
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new String[]{"<%0> had a touch of the vapours", "<%0> didn't notice the funny smell", "<%0> should have brought a gas mask", "<%0> came for the treasure, but stayed for the deadly gas"};
        field_C = new int[]{0, 70, 70, 70, 70};
    }
}
