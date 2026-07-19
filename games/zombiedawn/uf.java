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
              this.field_h = param3;
              this.field_j = param6;
              this.field_l = param2;
              this.field_i = param7;
              this.field_m = param0;
              this.field_k = param4;
              this.field_p = param5;
              if (param1 == -29) {
                break L1;
              } else {
                this.field_p = (int[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("uf.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param5 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 > -17) {
            field_n = (int[]) null;
            field_n = null;
            field_o = null;
            return;
        }
        field_n = null;
        field_o = null;
    }

    final static int a(int param0, int param1) {
        L0: {
          if (param1 == 12832) {
            break L0;
          } else {
            uf.a(-45);
            break L0;
          }
        }
        if (((long)param0 ^ -1L) <= -65537L) {
          if (((long)param0 ^ -1L) > -16777217L) {
            if (((long)param0 ^ -1L) > -1048577L) {
              if (((long)param0 ^ -1L) <= -262145L) {
                return fo.field_a[param0 >> 134291244] >> 2011158982;
              } else {
                return fo.field_a[param0 >> -1570979094] >> 1068834599;
              }
            } else {
              if (-4194305L < ((long)param0 ^ -1L)) {
                return fo.field_a[param0 >> -1950894642] >> -486797179;
              } else {
                return fo.field_a[param0 >> 29300272] >> -963688860;
              }
            }
          } else {
            if (((long)param0 ^ -1L) <= -268435457L) {
              if (((long)param0 ^ -1L) <= -1073741825L) {
                return fo.field_a[param0 >> 768133944];
              } else {
                return fo.field_a[param0 >> -1316965162] >> -1550157759;
              }
            } else {
              if ((long)param0 < 67108864L) {
                return fo.field_a[param0 >> 1981898386] >> 2125788387;
              } else {
                return fo.field_a[param0 >> -1643216172] >> 709401602;
              }
            }
          }
        } else {
          if (256L <= (long)param0) {
            if ((long)param0 >= 4096L) {
              if (-16385L < ((long)param0 ^ -1L)) {
                return fo.field_a[param0 >> 1057038982] >> -1360169079;
              } else {
                return fo.field_a[param0 >> 1861873864] >> -1273087256;
              }
            } else {
              if ((long)param0 < 1024L) {
                return fo.field_a[param0 >> 198716194] >> 358742443;
              } else {
                return fo.field_a[param0 >> -50109884] >> -1062905878;
              }
            }
          } else {
            if (param0 >= 0) {
              return fo.field_a[param0] >> -1519921492;
            } else {
              return -1;
            }
          }
        }
    }

    uf() {
    }

    static {
        field_o = new int[16384];
    }
}
