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
        int discarded$0 = 1;
        return bl.d();
    }

    final static void a(long param0) {
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            {
              Thread.sleep(param0);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (!param0.field_r) {
                if (param0.c(3)) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 1;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (param0 instanceof ae) {
                param4 = param4 & ((ae) (Object) param0).field_K;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param4) {
                stackOut_13_0 = ((uj) this).field_t;
                stackIn_14_0 = stackOut_13_0;
                break L3;
              } else {
                if (var6_int == 0) {
                  stackOut_12_0 = ((uj) this).field_r;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = ((uj) this).field_v;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              }
            }
            L4: {
              var7 = stackIn_14_0;
              if (param3) {
                break L4;
              } else {
                ((uj) this).field_u = null;
                break L4;
              }
            }
            L5: {
              if (!param4) {
                stackOut_18_0 = 7105644;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = 16777215;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            var8 = stackIn_19_0;
            int discarded$2 = -119;
            ci.a(var7, (-((uj) this).field_u[0].field_F + param0.field_u >> 1) + (param0.field_w + param2), param0.field_F, param0.field_t + param1, ((uj) this).field_u);
            int discarded$3 = ((uj) this).field_b.a(param0.field_A, param0.field_t + param1, param0.field_w + (param2 + -2), param0.field_F, param0.field_u, var8, -1, 1, 1, ((uj) this).field_b.field_N);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6;
            stackOut_21_1 = new StringBuilder().append("uj.L(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b() {
        int var1 = 0;
        field_s = null;
        field_q = null;
    }

    private uj(int param0, int param1, int param2) {
        ((uj) this).field_u = mf.field_q;
        ((uj) this).field_v = param1;
        ((uj) this).field_t = param2;
        ((uj) this).field_r = param0;
        ((uj) this).field_b = ab.field_V;
    }

    public uj() {
        this(2188450, 2591221, 9543);
    }

    static {
    }
}
