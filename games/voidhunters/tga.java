/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tga extends uf implements lca {
    static boolean field_N;
    private eeb field_O;
    private int field_L;
    static String[] field_M;

    public static void j(int param0) {
        field_M = null;
        if (param0 <= 69) {
            tga.j(21);
        }
    }

    final void i(byte param0) {
        super.i(param0);
        if (this.field_O != null) {
            this.field_O.a(99);
        }
    }

    final String d(byte param0) {
        if (this.field_e) {
          if (this.field_p != null) {
            if (param0 != 125) {
              field_M = (String[]) null;
              tba.a(kc.field_b + (this.field_h + -this.field_L), (byte) -114, uia.field_b);
              return this.field_p;
            } else {
              tba.a(kc.field_b + (this.field_h + -this.field_L), (byte) -114, uia.field_b);
              return this.field_p;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, eeb param1) {
        if (param0 != 6614) {
            return;
        }
        try {
            this.field_O = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tga.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final eeb a(int param0) {
        if (param0 != -782444220) {
            eeb var3 = (eeb) null;
            this.a(64, (eeb) null);
            return this.field_O;
        }
        return this.field_O;
    }

    tga(String param0, sba param1, int param2) {
        super(param0, param1, param2);
    }

    final static void a(int[] param0, int param1, byte param2, byte[] param3, int param4) {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param2 > 66) {
                break L1;
              } else {
                field_M = (String[]) null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (bs.field_b.length <= var5_int) {
                break L0;
              } else {
                param1 = bs.field_b[var5_int];
                var6 = var5_int << -782444220;
                L3: while (true) {
                  incrementValue$12 = param1;
                  param1--;
                  if (incrementValue$12 == 0) {
                    var5_int++;
                    continue L2;
                  } else {
                    incrementValue$13 = var6;
                    var6++;
                    param4 = aq.field_p[incrementValue$13];
                    param0[param3[param4]] = param0[param3[param4]] + 1;
                    aq.field_p[param0[param3[param4]]] = param4;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("tga.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_L = -param1 + (kc.field_b - this.field_g);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tga.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_M = new String[]{"Simple", "Standard", "Advanced"};
        field_N = false;
    }
}
