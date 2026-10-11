/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    int[] field_G;
    int[][] field_w;
    int field_h;
    int field_m;
    int[] field_k;
    boolean[] field_B;
    byte field_j;
    int field_p;
    int[][] field_r;
    byte[] field_E;
    int[] field_c;
    boolean[] field_v;
    byte[] field_D;
    int field_e;
    byte[] field_d;
    int[][] field_i;
    byte[][] field_g;
    int[] field_u;
    int field_A;
    byte[] field_f;
    byte[] field_y;
    int field_l;
    int field_x;
    static ci field_s;
    int field_b;
    int field_q;
    static ci[] field_a;
    int field_o;
    int field_C;
    int field_H;
    byte[] field_F;
    int field_n;
    int field_z;
    int field_t;

    public static void a(byte param0) {
        int var1 = -73 / ((param0 - 3) / 61);
        field_a = null;
        field_s = null;
    }

    final static int a(int param0, int param1, int param2, String param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 40) {
            field_s = (ci) null;
          }
          stackIn_3_0 = vc.field_f.a(param3, param4, param5 - 24, param2 - param4, 480, param6, -1, 0, 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("kb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, byte param3) {
        pl.field_P = param2;
        if (param3 != -83) {
          field_a = (ci[]) null;
        }
        eb.field_I = param0;
        ib.field_cb = param1;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8, int param9, int param10, boolean param11, int param12) {
        int incrementValue$2 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        var15 = Terraphoenix.field_V;
        try {
          var13_int = param9 & 16711935;
          var14 = param9 >> 8 & 255;
          for (param8 = -param2; param8 < 0; param8++) {
            for (param7 = -param10; param7 < 0; param7++) {
              param3 = param1[param12++];
              if (param3 == 0) {
                param4++;
              } else {
                if (param3 >> 8 != (param3 & 65535)) {
                  param6[param4++] = param3;
                } else {
                  param3 = param3 & 255;
                  incrementValue$2 = param4;
                  param4++;
                  param6[incrementValue$2] = dg.a(param3 * var14, 65280) + dg.a(var13_int * param3 >> 8, 16711935);
                  if (param6[-1 + param4] == 0) {
                    param6[param4 - 1] = 1;
                  }
                }
              }
            }
            param4 = param4 + param5;
            param12 = param12 + param0;
          }
          if (!param11) {
            var16 = (int[]) null;
            kb.a(-123, (int[]) null, -30, -85, -53, -125, (int[]) null, 41, 37, -119, -27, true, -85);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_18_0 = var13;
          stackIn_18_1 = new StringBuilder().append("kb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    kb() {
        this.field_G = new int[257];
        this.field_r = new int[6][258];
        this.field_v = new boolean[16];
        this.field_d = new byte[18002];
        this.field_B = new boolean[256];
        this.field_f = new byte[256];
        this.field_k = new int[16];
        this.field_q = 0;
        this.field_y = new byte[4096];
        this.field_E = new byte[18002];
        this.field_u = new int[256];
        this.field_i = new int[6][258];
        this.field_g = new byte[6][258];
        this.field_w = new int[6][258];
        this.field_z = 0;
        this.field_c = new int[6];
    }

    static {
        field_a = new ci[4];
    }
}
