/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf extends le {
    int field_l;
    int field_h;
    int field_k;
    int field_m;
    static int[] field_n;
    int[] field_p;
    static int[] field_o;
    int field_i;
    int field_j;

    final void a(int param0, byte param1, int param2, int param3, int param4, int[] param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ((uf) this).field_h = param3;
              ((uf) this).field_j = param6;
              ((uf) this).field_l = param2;
              ((uf) this).field_i = param7;
              ((uf) this).field_m = param0;
              ((uf) this).field_k = param4;
              ((uf) this).field_p = param5;
              if (param1 == -29) {
                break L1;
              } else {
                ((uf) this).field_p = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("uf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param5 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a() {
        field_n = null;
        field_o = null;
    }

    final static int a(int param0, int param1) {
        if ((long)param0 >= 65536L) {
          if ((long)param0 < 16777216L) {
            if ((long)param0 < 1048576L) {
              if ((long)param0 >= 262144L) {
                return fo.field_a[param0 >> 12] >> 6;
              } else {
                return fo.field_a[param0 >> 10] >> 7;
              }
            } else {
              if ((long)param0 < 4194304L) {
                return fo.field_a[param0 >> 14] >> 5;
              } else {
                return fo.field_a[param0 >> 16] >> 4;
              }
            }
          } else {
            if ((long)param0 >= 268435456L) {
              if ((long)param0 >= 1073741824L) {
                return fo.field_a[param0 >> 24];
              } else {
                return fo.field_a[param0 >> 22] >> 1;
              }
            } else {
              if ((long)param0 < 67108864L) {
                return fo.field_a[param0 >> 18] >> 3;
              } else {
                return fo.field_a[param0 >> 20] >> 2;
              }
            }
          }
        } else {
          if (256L <= (long)param0) {
            if ((long)param0 >= 4096L) {
              if ((long)param0 < 16384L) {
                return fo.field_a[param0 >> 6] >> 9;
              } else {
                return fo.field_a[param0 >> 8] >> 8;
              }
            } else {
              if ((long)param0 < 1024L) {
                return fo.field_a[param0 >> 2] >> 11;
              } else {
                return fo.field_a[param0 >> 4] >> 10;
              }
            }
          } else {
            if (param0 >= 0) {
              return fo.field_a[param0] >> 12;
            } else {
              return -1;
            }
          }
        }
    }

    uf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[16384];
    }
}
