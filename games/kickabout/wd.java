/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends gn {
    static se field_l;
    static String field_g;
    int field_p;
    int field_m;
    int field_f;
    int field_k;
    int field_j;
    String[][] field_i;
    static int[] field_n;
    int[][] field_o;
    int field_h;
    boolean field_e;

    public static void a(byte param0) {
        field_g = null;
        field_l = null;
        field_n = null;
        if (param0 < 41) {
          field_n = (int[]) null;
        }
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        ut[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ut[] var9 = null;
        ut var10 = null;
        ut var11 = null;
        var8 = Kickabout.field_G;
        try {
          if (param2 <= 33) {
            field_l = (se) null;
          }
          var9 = iw.field_h;
          var3 = var9;
          if (rm.field_C == 0) {
            for (var4 = 0; var4 < 30; var4++) {
              var10 = var9[p.a((byte) -24, var9.length)];
              var6 = p.a((byte) -24, 896 - (var10.field_o >> 1));
              var7 = p.a((byte) -24, 1344 - (var10.field_v >> 1));
              var10.c(var6 + param1, param0 + var7);
            }
          } else {
            if (rm.field_C != 1) {
              return;
            }
            for (var4 = 0; var4 < 15; var4++) {
              var11 = var9[p.a((byte) -24, var9.length)];
              var6 = p.a((byte) -24, 896 - (var11.field_o >> 1));
              var7 = p.a((byte) -24, 1344 - (var11.field_v >> 1));
              var11.c(var6 + param1, var7 + param0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3_ref), "wd.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static ki a(int param0, up[] param1, gr param2, int param3, int param4) {
        ki var5 = null;
        RuntimeException var5_ref = null;
        ki stackIn_2_0 = null;
        ki stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new ki(5, param4, param3, (byte) 0, (byte) 0);
          var5.field_s = param1;
          if (param0 != 18238) {
            stackIn_2_0 = (ki) null;
            return stackIn_2_0;
          }
          var5.field_t = param2;
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("wd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    wd() {
    }

    static {
        field_g = "gameplay";
    }
}
