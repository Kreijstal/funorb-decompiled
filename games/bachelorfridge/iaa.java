/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class iaa {
    static String[] field_b;
    static boolean field_a;

    final static void a(int param0) {
        kha var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var2 = BachelorFridge.field_y;
        try {
          if (param0 >= -105) {
            field_b = (String[]) null;
          }
          dea.field_n = 0;
          var1 = (kha) (iea.field_d.b((byte) 90));
          while (var1 != null) {
            if (dga.field_a == 0) {
              dea.field_n = dea.field_n + fw.field_h[var1.field_h].field_f * var1.field_g;
            }
            var1 = (kha) (iea.field_d.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "iaa.M(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, eaa param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        lh var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          param0 -= 8;
          var6 = (lh) (param5.b((byte) 90));
          var7 = 0;
          if (param3 >= -82) {
            field_a = true;
          }
          while (var6 != null) {
            if (var6.field_h < 0) {
              var8 = (326565 * var6.field_h + 8357 * var6.field_i & 630) + (var6.field_o >> 1);
              if (var8 > 256) {
                var8 = 256;
              }
              iga.field_a[2 + var7 % 7].a((var6.field_i * param1 >> 16) + (param4 - 32), param0 - (((var6.field_h - var6.field_q) * param1 >> 16) + 2 + 32), var6.field_o);
            }
            var6 = (lh) (param5.c(0));
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_13_0 = var6_ref;
          stackIn_13_1 = new StringBuilder().append("iaa.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, kv param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var9_intLifetime1;
        int var10Lifetime1;
        try {
          var9_int = param4 + param6.field_t + param2 - param3;
          var10 = param2 + (param4 + param6.field_t + param8);
          var11 = param6.field_u + param0 + (param6.field_p >> 1);
          dg.c(var9_int, 0, var10, param5 + var11);
          param6.d(-1 + param4, -1 + param0, param1);
          param6.d(-1 + param4, param0 + 1, param1);
          dg.b(ie.field_b);
          dg.c(var9_int + 1, 0, var10 + 1, var11 + param5);
          param6.d(param4 + 1, -1 + param0, param1);
          param6.d(1 + param4, param0 + 1, param1);
          dg.b(ie.field_b);
          var9_intLifetime1 = -param8 + (-param2 + param4) + param6.field_t + param6.field_q;
          var10Lifetime1 = -param3 + (param6.field_q + param6.field_t + param4 - param2);
          dg.c(var9_intLifetime1, var11 - param5, var10Lifetime1, 480);
          param6.d(-1 + param4, param0 - 1, param1);
          param6.d(-1 + param4, param0 + 1, param1);
          dg.b(ie.field_b);
          dg.c(var9_intLifetime1 + 1, -param5 + var11, var10Lifetime1 + 1, 480);
          param6.d(param4 + 1, -1 + param0, param1);
          if (param7 != -3702) {
            field_a = false;
          }
          param6.d(1 + param4, 1 + param0, param1);
          dg.b(ie.field_b);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "iaa.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 > 85) {
          return;
        }
        eaa var2 = (eaa) null;
        iaa.a(83, -61, 60, (byte) -114, 105, (eaa) null);
    }

    static {
        field_a = true;
    }
}
