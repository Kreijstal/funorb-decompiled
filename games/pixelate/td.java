/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static String field_a;
    static String field_c;
    static String field_d;
    static BirthDateEntryPanel field_b;

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -97) {
            field_d = (String) null;
          }
          stackIn_3_0 = DialWidget.a(-26629, 10, param1, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("td.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        if (param0 != 6) {
          Sprite[] var2 = (Sprite[]) null;
          td.drawThreeSliceBar(72, -37, -11, (Sprite[]) null, (byte) -29, -65);
        }
        field_b = null;
    }

    final static void drawThreeSliceBar(int param0, int param1, int param2, Sprite[] param3, byte param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          if (param3 != null &&
            0 < param2) {
            var6_int = param3[0].field_A;
            var7 = param3[2].field_A;
            var8 = param3[1].field_A;
            param3[0].drawWithOpacity(param0, param1, param5);
            param3[2].drawWithOpacity(param2 + param0 - var7, param1, param5);
            if (param4 != 121) {
              return;
            }
            SoftwareRasterizer.saveClip(Matrix3.field_c);
            SoftwareRasterizer.intersectClip(var6_int + param0, param1, -var7 + param2 + param0, param1 + param3[1].field_B);
            var9 = param0 + var6_int;
            var10 = -var7 + (param0 + param2);
            for (param0 = var9; var10 > param0; param0 = param0 + var8) {
              param3[1].drawWithOpacity(param0, param1, param5);
            }
            SoftwareRasterizer.restoreClip(Matrix3.field_c);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("td.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, IndexedSprite[] param1) {
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        Sprite[] var8 = null;
        int var2_intLifetime1;
        int var3Lifetime1;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          AcidSunsetBackground.field_o = new IndexedSprite[param1.length];
          for (var2_int = 0; AcidSunsetBackground.field_o.length > var2_int; var2_int++) {
            var3 = gd.field_e[var2_int].field_m;
            var4 = gd.field_e[var2_int].field_k;
            AcidSunsetBackground.field_o[var2_int] = new IndexedSprite(var3, var4, 2);
            for (var5 = 0; var5 < var4; var5++) {
              for (var6 = 0; var3 > var6; var6++) {
                AcidSunsetBackground.field_o[var2_int].indices[var6 + var5 * var3] = param1[var2_int].indices[var6 + var5 * 5];
              }
            }
          }
          li.field_d = new Sprite(48, 48);
          li.field_d.makeRasterTarget();
          if (param0 < 117) {
            var8 = (Sprite[]) null;
            td.drawThreeSliceBar(-3, 104, 72, (Sprite[]) null, (byte) -122, -90);
          }
          for (var2_intLifetime1 = 0; 8 > var2_intLifetime1; var2_intLifetime1++) {
            var3Lifetime1 = (var2_intLifetime1 << 8) / 8;
            SoftwareRasterizer.fillRoundedRectangle(var2_intLifetime1, var2_intLifetime1, 32 + (-var2_intLifetime1 + 8) * 2, -(2 * var2_intLifetime1) + 16 + 32, 6, var3Lifetime1 * 65793);
          }
          SoftwareRasterizer.fillRoundedRectangle(8, 8, 32, 32, 6, 16777215);
          SoftwareRasterizer.blurRectangle(2, 2, 0, 0, SoftwareRasterizer.field_j, SoftwareRasterizer.field_d);
          ClientException.field_f.bindRaster(19692);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("td.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_a = "Log in / Create account";
        field_c = "It's a draw!";
    }
}
