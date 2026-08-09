/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends bp implements ef {
    static int field_j;
    static qp[] field_l;
    static ri field_i;
    static jn field_m;
    static int field_k;

    public final void a(int param0) {
        if (param0 != 8905) {
            field_i = (ri) null;
            super.a(param0 ^ 0);
            return;
        }
        super.a(param0 ^ 0);
    }

    public static void b(int param0) {
        if (param0 < 115) {
            return;
        }
        field_m = null;
        field_l = null;
        field_i = null;
    }

    public final void a(ji param0, int param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "rc.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    rc(on param0, int param1, boolean param2, int[][] param3) {
        super(param0, 34067, nl.field_p, io.field_g, param1 * (param1 * 6), param2);
        int var5_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var7 = 0;
        try {
          L0: {
            L1: {
              this.field_e.a((ed) (this), 100);
              if (!param2) {
                var7 = 0;
                var5_int = var7;
                L2: while (true) {
                  if (var7 >= 6) {
                    break L1;
                  } else {
                    jaggl.OpenGL.glTexImage2Di(var7 + 34069, 0, this.e(19), param1, param1, 0, te.a(-21339, this.field_c), this.field_e.field_Ec, param3[var7], 0);
                    var7++;
                    continue L2;
                  }
                }
              } else {
                var5_int = 0;
                L3: while (true) {
                  if (6 <= var5_int) {
                    break L1;
                  } else {
                    this.a(param1, param1, param3[var5_int], 34069 - -var5_int, -1);
                    var5_int++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("rc.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -23) {
              stackIn_4_0 = ce.field_q.a(param0, "", -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("rc.M(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        field_l = new qp[38];
    }
}
