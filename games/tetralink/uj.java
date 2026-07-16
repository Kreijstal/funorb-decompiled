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
        InterruptedException var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            Thread.sleep(param0);
            if (param1 == -568127903) {
              break L0;
            } else {
              field_s = null;
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = (InterruptedException) (Object) decompiledCaughtException;
            break L1;
          }
        }
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        L0: {
          if (!param0.field_r) {
            if (param0.c(3)) {
              L1: {
                var6 = 1;
                if (param0 instanceof ae) {
                  param4 = param4 & ((ae) (Object) param0).field_K;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (!param4) {
                  stackOut_11_0 = ((uj) this).field_t;
                  stackIn_12_0 = stackOut_11_0;
                  break L2;
                } else {
                  if (var6 == 0) {
                    stackOut_10_0 = ((uj) this).field_r;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = ((uj) this).field_v;
                    stackIn_12_0 = stackOut_9_0;
                    break L2;
                  }
                }
              }
              var7 = stackIn_12_0;
              if (param3) {
                L3: {
                  if (!param4) {
                    stackOut_19_0 = 7105644;
                    stackIn_20_0 = stackOut_19_0;
                    break L3;
                  } else {
                    stackOut_18_0 = 16777215;
                    stackIn_20_0 = stackOut_18_0;
                    break L3;
                  }
                }
                var8 = stackIn_20_0;
                ci.a(var7, (-((uj) this).field_u[0].field_F + param0.field_u >> -568127903) + (param0.field_w + param2), param0.field_F, param0.field_t + param1, ((uj) this).field_u, -119);
                int discarded$4 = ((uj) this).field_b.a(param0.field_A, param0.field_t + param1, param0.field_w + (param2 + -2), param0.field_F, param0.field_u, var8, -1, 1, 1, ((uj) this).field_b.field_N);
                return;
              } else {
                L4: {
                  ((uj) this).field_u = null;
                  if (!param4) {
                    stackOut_15_0 = 7105644;
                    stackIn_16_0 = stackOut_15_0;
                    break L4;
                  } else {
                    stackOut_14_0 = 16777215;
                    stackIn_16_0 = stackOut_14_0;
                    break L4;
                  }
                }
                var8 = stackIn_16_0;
                ci.a(var7, (-((uj) this).field_u[0].field_F + param0.field_u >> -568127903) + (param0.field_w + param2), param0.field_F, param0.field_t + param1, ((uj) this).field_u, -119);
                int discarded$5 = ((uj) this).field_b.a(param0.field_A, param0.field_t + param1, param0.field_w + (param2 + -2), param0.field_F, param0.field_u, var8, -1, 1, 1, ((uj) this).field_b.field_N);
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_22_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_22_0 = stackOut_1_0;
            break L0;
          }
        }
        L5: {
          var6 = stackIn_22_0;
          if (param0 instanceof ae) {
            param4 = param4 & ((ae) (Object) param0).field_K;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (!param4) {
            stackOut_29_0 = ((uj) this).field_t;
            stackIn_30_0 = stackOut_29_0;
            break L6;
          } else {
            if (var6 == 0) {
              stackOut_28_0 = ((uj) this).field_r;
              stackIn_30_0 = stackOut_28_0;
              break L6;
            } else {
              stackOut_27_0 = ((uj) this).field_v;
              stackIn_30_0 = stackOut_27_0;
              break L6;
            }
          }
        }
        var7 = stackIn_30_0;
        if (!param3) {
          L7: {
            ((uj) this).field_u = null;
            if (!param4) {
              stackOut_37_0 = 7105644;
              stackIn_38_0 = stackOut_37_0;
              break L7;
            } else {
              stackOut_36_0 = 16777215;
              stackIn_38_0 = stackOut_36_0;
              break L7;
            }
          }
          var8 = stackIn_38_0;
          ci.a(var7, (-((uj) this).field_u[0].field_F + param0.field_u >> -568127903) + (param0.field_w + param2), param0.field_F, param0.field_t + param1, ((uj) this).field_u, -119);
          int discarded$6 = ((uj) this).field_b.a(param0.field_A, param0.field_t + param1, param0.field_w + (param2 + -2), param0.field_F, param0.field_u, var8, -1, 1, 1, ((uj) this).field_b.field_N);
          return;
        } else {
          L8: {
            if (!param4) {
              stackOut_33_0 = 7105644;
              stackIn_34_0 = stackOut_33_0;
              break L8;
            } else {
              stackOut_32_0 = 16777215;
              stackIn_34_0 = stackOut_32_0;
              break L8;
            }
          }
          var8 = stackIn_34_0;
          ci.a(var7, (-((uj) this).field_u[0].field_F + param0.field_u >> -568127903) + (param0.field_w + param2), param0.field_F, param0.field_t + param1, ((uj) this).field_u, -119);
          int discarded$7 = ((uj) this).field_b.a(param0.field_A, param0.field_t + param1, param0.field_w + (param2 + -2), param0.field_F, param0.field_u, var8, -1, 1, 1, ((uj) this).field_b.field_N);
          return;
        }
    }

    public static void b(byte param0) {
        int var1 = -97 % ((43 - param0) / 56);
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
