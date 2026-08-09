/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends al {
    static int[][] field_s;
    private int field_t;
    private int field_v;
    private int field_r;
    private oh[] field_u;
    static int[] field_q;
    static int field_w;

    final static hl b(boolean param0) {
        if (param0) {
            field_w = -76;
            return bl.d(!param0 ? true : false);
        }
        return bl.d(!param0 ? true : false);
    }

    final static void a(long param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            try {
              L0: {
                Thread.sleep(param0);
                if (param1 == -568127903) {
                  break L0;
                } else {
                  field_s = (int[][]) null;
                  return;
                }
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (!param0.field_r) {
                if (param0.c(3)) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param0 instanceof ae) {
                param4 = param4 & ((ae) ((Object) param0)).field_K;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param4) {
                stackIn_14_0 = this.field_t;
                break L3;
              } else {
                if (var6_int == 0) {
                  stackIn_14_0 = this.field_r;
                  break L3;
                } else {
                  stackIn_14_0 = this.field_v;
                  break L3;
                }
              }
            }
            L4: {
              var7 = stackIn_14_0;
              if (param3) {
                break L4;
              } else {
                this.field_u = (oh[]) null;
                break L4;
              }
            }
            L5: {
              if (!param4) {
                stackIn_19_0 = 7105644;
                break L5;
              } else {
                stackIn_19_0 = 16777215;
                break L5;
              }
            }
            var8 = stackIn_19_0;
            ci.a(var7, (-this.field_u[0].field_F + param0.field_u >> -568127903) + (param0.field_w + param2), param0.field_F, param0.field_t + param1, this.field_u, -119);
            this.field_b.a(param0.field_A, param0.field_t + param1, param0.field_w + (param2 + -2), param0.field_F, param0.field_u, var8, -1, 1, 1, this.field_b.field_N);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("uj.L(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(byte param0) {
        int var1 = -97 % ((43 - param0) / 56);
        field_s = (int[][]) null;
        field_q = null;
    }

    private uj(int param0, int param1, int param2) {
        this.field_u = mf.field_q;
        this.field_v = param1;
        this.field_t = param2;
        this.field_r = param0;
        this.field_b = ab.field_V;
    }

    public uj() {
        this(2188450, 2591221, 9543);
    }

    static {
    }
}
