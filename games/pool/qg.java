/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static dd field_b;
    static int field_e;
    static boolean field_d;
    static vh field_f;
    static cf field_g;
    static long field_c;
    static String field_a;

    final static void a(byte param0, int param1) {
        ij var3 = null;
        aa var4 = null;
        ij var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param1 == 0) {
            return;
          }
          if (nd.field_i.c(0)) {
            return;
          }
          if (param0 != 48) {
            return;
          }
          var4 = new aa(nd.field_i);
          var5 = (ij) (var4.b((byte) -92));
          if (param1 == var5.field_m) {
            if (kg.field_m != -1) {
              if (var5.field_H <= kg.field_m) {
                if (kg.field_m < var5.field_B + var5.field_H) {
                  kg.field_m = var5.field_B + var5.field_H;
                }
              } else {
                var5.field_B = 0;
              }
            } else {
              var5.a((byte) -117);
            }
          }
          var3 = (ij) (var4.b(-108));
          while (var3 != null) {
            if (param1 == var3.field_m) {
              var3.a((byte) -117);
            }
            var3 = (ij) (var4.b(-88));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var2), "qg.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        field_f = null;
        if (param0 != 0) {
          field_g = (cf) null;
        }
    }

    final static int[] a(int param0, int param1, int[] param2, int param3) {
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          var8 = new int[param2.length + param3];
          var4 = var8;
          var6 = -104 % ((param0 - 60) / 52);
          for (var5 = 0; param2.length > var5; var5++) {
            var8[var5] = param2[var5];
          }
          while (var4.length > var5) {
            var4[var5] = param1;
            var5++;
          }
          stackIn_7_0 = var4;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("qg.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int[] param0, int param1, int[] param2, int[] param3, int param4, int[] param5, byte param6) {
        int var7_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        var11 = Pool.field_O;
        try {
          if (param6 != 56) {
            var12 = (int[]) null;
            qg.a(106, -48, (int[]) null, -106);
          }
          for (var7_int = param1; param4 > var7_int; var7_int++) {
            var8 = -param2[0] + param5[var7_int];
            var9 = param3[var7_int] - param2[1];
            var10 = param0[var7_int] - param2[2];
            param5[var7_int] = var10 * param2[5] + (param2[3] * var8 + param2[4] * var9) >> 16;
            param3[var7_int] = param2[7] * var9 + (var8 * param2[6] + var10 * param2[8]) >> 16;
            param0[var7_int] = param2[9] * var8 + var9 * param2[10] + param2[11] * var10 >> 16;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_9_0 = var7;
          stackIn_9_1 = new StringBuilder().append("qg.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param6).append(')').toString());
        }
    }

    static {
    }
}
