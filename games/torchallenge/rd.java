/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends da {
    int field_m;
    static String field_j;
    static ka[] field_i;
    int field_q;
    int field_k;
    int field_l;
    int field_n;
    static int[] field_p;
    int field_o;

    final static void a(int param0, byte param1) {
        ta.field_Ab = ob.field_a[param0];
        ol.field_f = ik.field_c[param0];
        sd.field_g = pk.field_c[param0];
        if (param1 < 85) {
          field_i = (ka[]) null;
        }
    }

    public static void b(byte param0) {
        field_p = null;
        field_j = null;
        field_i = null;
        if (param0 != -60) {
          field_j = (String) null;
        }
    }

    final static void a(int[][] param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7, int param8, int param9) {
        int var10_int = 0;
        int var11 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param6 != -1012815519) {
            return;
          }
          for (var10_int = 0; param9 > var10_int; var10_int++) {
            if (param4) {
              param0[var10_int][0] = e.b((byte) 57, param3 * param7 >> 2);
              param0[var10_int][1] = e.b((byte) 57, param2 * param5 >> 2);
            }
            qg.a(param8 - (param7 >> 2) * (param3 - 4 >> 1) + param0[var10_int][0] << 4, -((param2 >> 2) * (-4 + param5 >> 1)) + (param1 + param0[var10_int][1]) << 4, 64, 128, qe.field_A);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_11_0 = var10;
          stackIn_11_1 = new StringBuilder().append("rd.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    rd(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_n = param0;
        this.field_k = param2;
        this.field_m = param1;
        this.field_o = param4;
        this.field_l = param3;
        this.field_q = param5;
    }

    static {
        field_j = "Passwords can only contain letters and numbers";
        field_p = new int[]{2, 4, 2, 4, 2};
    }
}
