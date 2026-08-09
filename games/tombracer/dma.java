/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dma extends tfa implements na {
    static int[][] field_k;
    static eb field_l;

    public final void b(byte param0) {
        if (param0 <= 32) {
            return;
        }
        super.b((byte) 121);
    }

    public final void a(int param0, hs param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "dma.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    dma(kda param0, int param1, boolean param2, int[][] param3) {
        super(param0, 34067, gpa.field_a, una.field_g, param1 * (param1 * 6), param2);
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
              this.field_j.a(true, (iva) (this));
              if (!param2) {
                var7 = 0;
                var5_int = var7;
                L2: while (true) {
                  if (6 <= var7) {
                    break L1;
                  } else {
                    jaggl.OpenGL.glTexImage2Di(34069 + var7, 0, this.d(92), param1, param1, 0, waa.a(this.field_f, 1383), this.field_j.field_od, param3[var7], 0);
                    var7++;
                    continue L2;
                  }
                }
              } else {
                var5_int = 0;
                L3: while (true) {
                  if ((var5_int ^ -1) <= -7) {
                    break L1;
                  } else {
                    this.a((byte) 99, var5_int + 34069, param1, param3[var5_int], param1);
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

            stackIn_11_1 = new StringBuilder().append("dma.<init>(");

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
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
    }

    public static void a(int param0) {
        field_k = (int[][]) null;
        field_l = null;
        if (param0 != -31784) {
            field_l = (eb) null;
        }
    }

    static {
        field_k = new int[][]{new int[]{0, -1}, new int[]{1, 0}, new int[]{0, 1}, new int[]{-1, 0}};
    }
}
