/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ica extends bca {
    static int[][] field_r;
    int field_s;
    static kv field_t;
    int field_q;

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        at stackIn_2_0 = null;
        aw stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 5) {
              stackIn_4_0 = new aw(param1, (ica) (this));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (at) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("ica.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (at) ((Object) stackIn_4_0);
        }
    }

    final void a(op param0, int param1) {
        try {
            int var3_int = -26 % ((param1 - 12) / 35);
            this.a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ica.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ica(int param0, nq param1) {
        super(param0, param1);
    }

    public static void d(byte param0) {
        field_t = null;
        field_r = (int[][]) null;
        if (param0 > -98) {
            field_t = (kv) null;
        }
    }

    ica(lu param0) {
        super(param0);
        int var2_int = 0;
        try {
            this.field_k = param0.e((byte) 117);
            this.field_o = new eaa();
            var2_int = param0.b(16711935);
            while (true) {
                var2_int--;
                if (var2_int < 0) {
                    break;
                }
                this.field_o.a(dca.a((byte) 102, param0), true);
            }
            this.field_s = param0.b(16711935);
            this.field_q = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ica.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final int[][] a(op param0, int param1, int param2, aga param3) {
        int[][] var5 = null;
        RuntimeException var5_ref = null;
        gj var6 = null;
        int[][] var7 = null;
        int[][] var8 = null;
        int[][] var9 = null;
        int[][] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = new int[17][17];
              var8 = var9;
              var7 = var8;
              var5 = var7;
              if (param2 < -35) {
                break L1;
              } else {
                var6 = (gj) null;
                this.a(-18, (gj) null);
                break L1;
              }
            }
            var9[6][7] = 1;
            var9[5][8] = 1;
            var9[6][9] = 1;
            var9[7][6] = 1;
            var9[7][7] = 1;
            var9[6][8] = 1;
            var9[7][10] = 1;
            var9[7][9] = 1;
            var9[8][7] = 1;
            var9[8][5] = 1;
            var9[8][6] = 1;
            var9[7][8] = 1;
            var9[8][11] = 1;
            var9[9][6] = 1;
            var9[8][9] = 1;
            var9[8][10] = 1;
            var9[8][8] = 1;
            var9[9][7] = 1;
            var9[9][8] = 1;
            var9[9][9] = 1;
            var9[9][10] = 1;
            var9[10][7] = 1;
            var9[10][9] = 1;
            var9[10][8] = 1;
            var9[11][8] = 1;
            stackIn_3_0 = (int[][]) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("ica.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte param0, lu param1) {
        try {
            super.a((byte) -106, param1);
            if (param0 > -12) {
                gj var4 = (gj) null;
                this.a(106, (gj) null);
            }
            param1.d(this.field_s, 0);
            param1.d(this.field_q, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ica.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = new int[][]{new int[]{210, 80}, new int[]{250, 100}, new int[]{279, 131}, new int[]{296, 186}, new int[]{292, 228}, new int[]{270, 266}, new int[]{224, 299}, new int[]{182, 307}, new int[]{140, 298}, new int[]{94, 265}, new int[]{73, 229}, new int[]{68, 186}, new int[]{86, 132}, new int[]{114, 100}, new int[]{154, 82}};
    }
}
