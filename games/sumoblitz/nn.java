/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nn {
    static SpriteData[] field_a;

    final static void a(br param0, byte param1) {
        int var2_int = 0;
        br var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null == param0.field_e) {
            return;
          }
          if (param1 < 43) {
            field_a = (SpriteData[]) null;
          }
          if (param0.field_h != 0 ||
            0 != param0.field_c) {
            for (var2_int = 0; kb.field_a > var2_int; var2_int++) {
              var3 = aj.field_D[var2_int];
              if (var3.field_g == 2 &&
                param0.field_h == var3.field_h &&
                var3.field_c == param0.field_c) {
                return;
              }
            }
          }
          if (null == param0.field_b) {
          }
          dl.a(param0, (byte) 76);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("nn.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          SoftwareRasterizer.f(param1, param4, 1 + param2, 10000536);
          SoftwareRasterizer.f(param1, param4 + param0, 1 + param2, 12105912);
          var5_int = 1;
          if (param3 != -84) {
            return;
          }
          var6 = param0;
          if (SoftwareRasterizer.field_i > var5_int + param4) {
            var5_int = -param4 + SoftwareRasterizer.field_i;
          }
          if (param4 + var6 > SoftwareRasterizer.field_e) {
            var6 = SoftwareRasterizer.field_e - param4;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = 152 + 48 * var7 / param0;
            var9 = var8 << 16 | var8 << 8 | var8;
            SoftwareRasterizer.field_a[param1 + SoftwareRasterizer.field_b * (var7 + param4)] = var9;
            SoftwareRasterizer.field_a[(param4 + var7) * SoftwareRasterizer.field_b + (param1 + param2)] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var5), "nn.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    abstract byte[] a(int param0, int param1, int param2);

    final static boolean a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = 0;
          var3 = 53 / ((55 - param1) / 52);
          while (true) {
            if (param0 <= var2_int) {
              return true;
            }
            if (qn.field_d[var2_int]) {
              var2_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "nn.C(" + param0 + ',' + param1 + ')');
        }
    }

    abstract byte[] a(boolean param0);

    abstract void a(byte[] param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, Sprite[] param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = Sumoblitz.field_L ? 1 : 0;
        if (param4 == null ||
          param1 <= 0) {
          return;
        }
        try {
          var6_int = param4[0].field_z;
          var7 = param4[2].field_z;
          var8 = param4[1].field_z;
          param4[0].b(param5, param2, param0);
          int var9 = -64 % ((param3 + 25) / 61);
          param4[2].b(-var7 + param1 + param5, param2, param0);
          SoftwareRasterizer.b(mo.field_t);
          SoftwareRasterizer.e(param5 + var6_int, param2, -var7 + (param1 + param5), param2 + param4[1].field_w);
          var10 = param5 + var6_int;
          var11 = -var7 + param1 + param5;
          for (param5 = var10; param5 < var11; param5 = param5 + var8) {
            param4[1].b(param5, param2, param0);
          }
          SoftwareRasterizer.a(mo.field_t);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "nn.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        int var1 = 65 / ((-2 - param0) / 57);
        field_a = null;
    }

    final static void b(int param0, int param1) {
        if (param1 > -95) {
          nn.a(27, 41, -94, (byte) -104, 35);
        }
    }

    static {
    }
}
