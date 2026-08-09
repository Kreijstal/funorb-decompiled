/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends sh {
    int field_C;
    la field_D;
    static ej[] field_x;
    static int[][] field_A;
    byte[] field_y;
    static int field_z;

    final byte[] e(int param0) {
        if (this.field_v) {
          throw new RuntimeException();
        } else {
          if (param0 != 2) {
            this.f(34);
            return this.field_y;
          } else {
            return this.field_y;
          }
        }
    }

    final int f(int param0) {
        if (param0 != 100) {
            return -32;
        }
        if (!(!this.field_v)) {
            return 0;
        }
        return 100;
    }

    public static void c(byte param0) {
        if (param0 < 3) {
            al.c((byte) 59);
            field_A = (int[][]) null;
            field_x = null;
            return;
        }
        field_A = (int[][]) null;
        field_x = null;
    }

    final static void b(int param0, boolean param1) {
        cj.field_i = 1000000000L / (long)param0;
        if (!param1) {
            field_x = (ej[]) null;
        }
    }

    final static void c(boolean param0) {
        String var2 = (String) null;
        wk.a((String) null, -105, mj.field_d);
        if (param0) {
            field_A = (int[][]) null;
        }
    }

    final static Boolean d(byte param0) {
        Boolean var1 = bd.field_k;
        bd.field_k = null;
        if (param0 != -48) {
            return (Boolean) null;
        }
        return var1;
    }

    final static nf a(lj param0, int param1, int param2, lj param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        nf stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (lk.a(160, param0, param2, param1)) {
              var5_int = 69 / ((param4 - -78) / 40);
              stackIn_4_0 = gl.a(param3.c(param2, param1, 0), (byte) 110);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("al.D(");

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (nf) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    al() {
    }

    static {
        field_A = new int[][]{new int[]{31}, new int[]{1984}, new int[]{126976}, new int[]{8126464}, new int[]{520093696}, new int[]{-1073741824, 7}};
        field_x = new ej[14];
        field_z = -2;
    }
}
