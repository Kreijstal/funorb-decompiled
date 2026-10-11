/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mv {
    static sa field_c;
    static boolean field_b;
    static RgbSprite[] field_a;
    static String field_d;
    static String field_e;

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 >= -40) {
            mv.a(6, (byte) -96, -115, -102, -81);
          }
          for (var5_int = 0; var5_int < 7; var5_int++) {
            var6 = 16 - (param2 + 20 * var5_int) % 144;
            var7 = var6;
            var8 = var6;
            if (0 < var8) {
              var8 = 0;
            }
            var8 = var8 >> 3;
            if (var7 < 0) {
              var7 = (var7 << 1) + 256;
            } else {
              var7 = -(var7 << 4) + 256;
            }
            var9 = 0;
            var10 = var5_int % 3;
            if (var10 == 0) {
              var9 = -5;
            } else {
              if (var10 != 1) {
                if (var10 == 2) {
                  var9 = 10;
                }
              } else {
                var9 = -20;
              }
            }
            if (param3 >= 0) {
              le.field_c[param3].f(param0 - (-10 - var9) + (int)((double)var8 * Math.sin((double)(10 + var6 + param2 * 3) * 3.141592653589793 / (double)(230 + 4 * var5_int))), param4 + var6, var7 >> 1);
            } else {
              im.field_y.f(var9 + 10 + (param0 + (int)(Math.sin((double)(var6 + param2 * 3 + 10) * 3.141592653589793 / (double)(var5_int * 4 + 230)) * (double)var8)), var6 + param4, var7 >> 1);
            }
          }
          if (param3 < 0) {
            return;
          }
          if (cu.field_a) {
            for (var5_intLifetime1 = -128; var5_intLifetime1 < 16; var5_intLifetime1++) {
              var6Lifetime1 = var5_intLifetime1;
              var7Lifetime1 = var5_intLifetime1;
              if (var7Lifetime1 > 0) {
                var7Lifetime1 = 0;
              }
              var7Lifetime1 = var7Lifetime1 >> 5;
              if (var6Lifetime1 < 0) {
                var6Lifetime1 = 256 + (var6Lifetime1 << 1);
              } else {
                var6Lifetime1 = -(var6Lifetime1 << 4) + 256;
              }
              ds.field_a[param3].f(param0 - 5 + (int)((double)var7Lifetime1 * Math.sin((double)(var5_intLifetime1 + param2) * 3.141592653589793 / 236.0)), param4 + var5_intLifetime1, var6Lifetime1 >> 2);
              ds.field_a[param3].f(param0 + (-20 + (int)((double)var7Lifetime1 * Math.sin(3.141592653589793 * (double)(5 + (param2 + var5_intLifetime1)) / 256.0))), param4 + var5_intLifetime1, var6Lifetime1 >> 2);
              ds.field_a[param3].f((int)(Math.sin((double)(var5_intLifetime1 + (param2 + 10)) * 3.141592653589793 / 216.0) * (double)var7Lifetime1) + 10 + param0, param4 + var5_intLifetime1, var6Lifetime1 >> 2);
            }
            return;
          }
          pv.field_e.b();
          SoftwareRaster.b();
          TrianglePulse.field_d.d(0, TrianglePulse.field_d.field_v >> 1, op.field_c[0][param3]);
          so.field_b.a(5605);
          pv.field_e.d(-20 + param0, -200 + param4, 75, 210, 255);
          pv.field_e.c();
          pv.field_e.d(-20 + param0, param4 + 10, 75, 50, 255);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "mv.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != -48) {
          return;
        }
        field_a = null;
        field_c = null;
        field_d = null;
        field_e = null;
    }

    static {
        field_c = new sa();
        field_e = "You can ask to join this game";
    }
}
