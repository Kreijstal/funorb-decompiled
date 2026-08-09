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
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
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
                  incrementValue$5 = param1;
                  param1--;
                  if (incrementValue$5 == 0) {
                    var5_int++;
                    continue L2;
                  } else {
                    incrementValue$6 = var6;
                    var6++;
                    param4 = aq.field_p[incrementValue$6];
                    dupTemp$7 = param3[param4];
                    dupTemp$8 = param0[dupTemp$7];
                    param0[dupTemp$7] = dupTemp$8 + 1;
                    aq.field_p[dupTemp$8] = param4;
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
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("tga.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param4 + ')');
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
