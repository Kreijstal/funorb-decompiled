/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ll extends pf {
    static ko field_k;
    static String field_h;
    private java.nio.ByteBuffer field_f;
    static String field_l;
    static ut field_g;
    static cn field_o;
    static int[] field_j;
    static int field_i;
    static ut field_m;
    static ut field_n;

    final static void c(byte param0) {
        ma.k((byte) -118);
        int var1 = 115 % ((param0 - -48) / 42);
        ae.m(-19417);
    }

    public static void b(byte param0) {
        field_m = null;
        field_l = null;
        field_h = null;
        field_n = null;
        field_j = null;
        field_o = null;
        field_k = null;
        if (param0 > -47) {
          ll.b((byte) 81);
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    final void a(byte[] param0, int param1) {
        try {
            this.field_f = java.nio.ByteBuffer.allocateDirect(param0.length);
            this.field_f.position(0);
            this.field_f.put(param0);
            if (param1 != 21820) {
                ll.b((byte) -82);
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ll.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte[] a(int param0) {
        byte[] var2;
        ea var3;
        byte[] var4;
        if (param0 != 2) {
          var3 = (ea) null;
          ll.a((int[][][]) null, -84, 70, (ea) null, 83);
          var4 = new byte[this.field_f.capacity()];
          var2 = var4;
          this.field_f.position(0);
          this.field_f.get(var4);
          return var4;
        } else {
          var4 = new byte[this.field_f.capacity()];
          var2 = var4;
          this.field_f.position(0);
          this.field_f.get(var4);
          return var4;
        }
    }

    ll() {
    }

    final static int a(int[][][] param0, int param1, int param2, ea param3, int param4) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (-3 == (param2 ^ -1)) {
              stackIn_3_0 = param0[param4][param3.field_i][param3.field_k] + (-param0[param4][param3.field_i][param3.field_e] + (-param0[param4][param3.field_d][param3.field_k] + param0[param4][param3.field_d][param3.field_e]));
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 > 81) {
                  break L1;
                } else {
                  field_m = (ut) null;
                  break L1;
                }
              }
              if (param2 != 1) {
                if (param2 != 0) {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = param0[param3.field_c][param3.field_i][param4] + (-param0[param3.field_l][param3.field_i][param4] + param0[param3.field_l][param3.field_d][param4]) - param0[param3.field_c][param3.field_d][param4];
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_8_0 = param0[param3.field_c][param4][param3.field_k] + (-param0[param3.field_c][param4][param3.field_e] + -param0[param3.field_l][param4][param3.field_k]) + param0[param3.field_l][param4][param3.field_e];
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("ll.H(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    static {
        field_h = "Please try changing the following settings:  ";
        field_k = new ko(1);
        field_l = "Up to 16 players compete in <col=ffff00>1 vs 1 games</col> to be the ultimate winner in a <col=ffff00>knockout competition.</col>";
        field_j = new int[4];
        field_i = -1;
    }
}
