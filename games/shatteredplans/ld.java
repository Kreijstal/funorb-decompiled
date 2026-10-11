/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends oh {
    byte[] field_o;
    static String field_i;
    static gq field_h;
    boolean field_l;
    static pf field_p;
    static String field_n;
    static String field_k;
    static String field_q;
    static bc field_m;
    static int field_j;

    public static void a(int param0) {
        field_q = null;
        if (param0 == 16711680) {
          field_m = null;
          field_n = null;
          field_h = null;
          field_k = null;
          field_i = null;
          field_p = null;
          return;
        }
        field_q = (String) null;
        field_m = null;
        field_n = null;
        field_h = null;
        field_k = null;
        field_i = null;
        field_p = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, bi param7) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          param5 = param5 - param7.field_t;
          if (param4 >= -20) {
            ld.a(97);
          }
          param0 = param0 - param7.field_x;
          var8_int = param5 + param7.field_z * param0;
          var9 = param1 + gf.field_b * param3;
          var14 = -param6 + 256;
          while (true) {
            param2--;
            if (param2 < 0) {
              return;
            }
            incrementValue$4 = var8_int;
            var8_int++;
            var10 = param7.field_B[incrementValue$4];
            var11 = gf.field_h[var9];
            var12 = 16711935 & var10;
            var10 = var10 & 65280;
            var13 = 16711935 & var11;
            var11 = var11 & 65280;
            var12 = (-16711936 & var12 * param6) + (-16711936 & var14 * var13);
            var10 = (16711680 & var11 * var14) + (16711680 & var10 * param6);
            var10 = (var10 | var12) >>> 8;
            incrementValue$5 = var9;
            var9++;
            gf.field_h[incrementValue$5] = var10;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("ld.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    ld() {
    }

    final static void d(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        if (param0 == 0) {
          if (di.field_m == 0) {
            sg.a(true, false, 0, aa.field_P, tk.field_C);
            sg.a(true, false, 700, qf.field_c, tk.field_C);
          }
          fieldTemp$1 = di.field_m + 1;
          di.field_m = di.field_m + 1;
          if (fieldTemp$1 == 950) {
            jc.a(5, (byte) -67);
          }
          return;
        }
        field_m = (bc) null;
        if (di.field_m == 0) {
          sg.a(true, false, 0, aa.field_P, tk.field_C);
          sg.a(true, false, 700, qf.field_c, tk.field_C);
        }
        fieldTemp$0 = di.field_m + 1;
        di.field_m = di.field_m + 1;
        if (fieldTemp$0 == 950) {
          jc.a(5, (byte) -67);
        }
        return;
    }

    static {
        field_i = "to keep fullscreen or";
        field_h = new gq(10, 2, 2, 0);
        field_n = "TAB - hide chat temporarily";
        field_q = "Won";
        field_k = "Add friend";
    }
}
