/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ra extends kna {
    static String field_G;
    static int[] field_F;
    private gea field_K;
    static long field_L;
    static String field_H;
    private int field_J;
    private boolean field_I;

    final void a(la param0, int param1) {
        try {
            super.a(param0, param1);
            this.field_K.a(true);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ra.BB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        tga.field_a.a(param2, param5, param3, param0, fm.a(param4, param1), (byte) -128);
    }

    abstract boolean C(int param0);

    public static void B(int param0) {
        field_G = null;
        field_F = null;
        int var1 = 62 % ((param0 - 26) / 38);
        field_H = null;
    }

    ra(la param0, int param1) {
        super(param0, param1);
        this.field_K = new gea();
        this.field_J = 131072;
        this.field_I = true;
    }

    final ro a(byte param0, la param1, boolean param2) {
        ro var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        gea stackIn_3_0 = null;
        gea stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        ro stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new ro(param1, param2);
              var5 = 3 / ((param0 - 57) / 63);
              if (!this.A(-127)) {
                break L1;
              } else {
                L2: {
                  stackIn_3_0 = this.field_K;

                  if (this.field_I) {
                    stackIn_4_0 = (gea) ((Object) stackIn_3_0);
                    stackIn_4_1 = 0;
                    break L2;
                  } else {
                    stackIn_4_0 = (gea) ((Object) stackIn_3_0);
                    stackIn_4_1 = 1;
                    break L2;
                  }
                }
                ((gea) (Object) stackIn_4_0).a(stackIn_4_1 != 0, 1);
                break L1;
              }
            }
            L3: {
              if (!this.C(1760)) {
                break L3;
              } else {
                var4.a((byte) -99, this.field_J);
                break L3;
              }
            }
            var4.a(99, this.field_K);
            stackIn_8_0 = (ro) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4_ref);

            stackIn_11_1 = new StringBuilder().append("ra.FC(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    abstract boolean A(int param0);

    ra(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_K = new gea();
        this.field_J = 131072;
        this.field_I = true;
        try {
          L0: {
            L1: {
              this.field_K = new gea(param0.field_E, param2);
              if (!this.A(-97)) {
                break L1;
              } else {
                L2: {
                  stackIn_4_0 = this;

                  if (-2 != (param2.b((byte) 44, 1) ^ -1)) {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 1;
                    break L2;
                  }
                }
                ((ra) (this)).field_I = stackIn_5_1 != 0;
                break L1;
              }
            }
            if (!this.C(1760)) {
              break L0;
            } else {
              this.field_J = ji.a(param2.b((byte) 44, 8), 107, 4);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("ra.<init>(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
        }
    }

    final static String r(byte param0) {
        if (!(fna.field_k != null)) {
            return "";
        }
        int var1 = 69 / ((param0 - 0) / 33);
        return fna.field_k;
    }

    void a(boolean param0, kh param1) {
        RuntimeException var3 = null;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              this.field_K.a(param1, 0);
              if (!this.A(64)) {
                break L1;
              } else {
                L2: {
                  stackIn_3_0 = (kh) (param1);

                  stackIn_3_1 = 118;

                  if (this.field_I) {
                    stackIn_4_0 = (kh) ((Object) stackIn_3_0);
                    stackIn_4_1 = stackIn_3_1;
                    stackIn_4_2 = 1;
                    break L2;
                  } else {
                    stackIn_4_0 = (kh) ((Object) stackIn_3_0);
                    stackIn_4_1 = stackIn_3_1;
                    stackIn_4_2 = 0;
                    break L2;
                  }
                }
                ((kh) (Object) stackIn_4_0).a((byte) stackIn_4_1, stackIn_4_2, 1);
                break L1;
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                this.field_J = -18;
                break L3;
              }
            }
            if (!this.C(1760)) {
              break L0;
            } else {
              param1.a((byte) 103, wma.a((byte) 8, 4, this.field_J), 8);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("ra.V(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    static {
        field_G = "Elapsed time";
        field_F = new int[]{0, 28};
        field_H = "OFF";
    }
}
