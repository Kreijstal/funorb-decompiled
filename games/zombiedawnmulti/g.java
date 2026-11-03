/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class g {
    private static IntrusiveDeque field_b;
    private static IntrusiveDeque field_c;
    static Random field_a;
    private static String field_z;

    final static int b(int param0) {
        return le.a(param0, (byte) -80) >> 8;
    }

    final static void a(Sprite param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var9Lifetime1;
        int var9Lifetime2;
        var3 = param1 + param2 * SoftwareRasterizer.field_b;
        var4 = 0;
        var5 = param0.height;
        var6 = param0.width;
        var7 = SoftwareRasterizer.field_b - var6;
        var8 = 0;
        if (param2 < SoftwareRasterizer.field_e) {
          var9 = SoftwareRasterizer.field_e - param2;
          var5 = var5 - var9;
          param2 = SoftwareRasterizer.field_e;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * SoftwareRasterizer.field_b;
        }
        if (param2 + var5 > SoftwareRasterizer.field_d) {
          var5 = var5 - (param2 + var5 - SoftwareRasterizer.field_d);
        }
        if (param1 < SoftwareRasterizer.field_f) {
          var9Lifetime1 = SoftwareRasterizer.field_f - param1;
          var6 = var6 - var9Lifetime1;
          param1 = SoftwareRasterizer.field_f;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param1 + var6 > SoftwareRasterizer.field_g) {
          var9Lifetime2 = param1 + var6 - SoftwareRasterizer.field_g;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 > 0 &&
          var5 > 0) {
          g.a(SoftwareRasterizer.field_i, param0.pixels, 0, var4, var3, var6, var5, var7, var8);
          return;
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static void c() {
        oh var0 = (oh) (field_c.a(true));
        if (var0 == null) {
          var0 = new oh();
        }
        var0.a(SoftwareRasterizer.field_i, SoftwareRasterizer.field_b, SoftwareRasterizer.field_l, SoftwareRasterizer.field_f, SoftwareRasterizer.field_e, SoftwareRasterizer.field_g, SoftwareRasterizer.field_d);
        field_b.a(var0, false);
    }

    final static Sprite b(Sprite param0) {
        Sprite var1 = new Sprite(param0.fullWidth, param0.field_u);
        g.c(var1);
        SoftwareRasterizer.clear();
        param0.f(0, 0, 16777215);
        g.a(12303291);
        g.a(8947848);
        g.a(4473924);
        param0.f(0, 0, 0);
        g.d();
        return var1;
    }

    final static void a(Sprite param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var10Lifetime1;
        int var10Lifetime2;
        var4 = param1 + param2 * SoftwareRasterizer.field_b;
        var5 = 0;
        var6 = param0.height;
        var7 = param0.width;
        var8 = SoftwareRasterizer.field_b - var7;
        var9 = 0;
        if (param2 < SoftwareRasterizer.field_e) {
          var10 = SoftwareRasterizer.field_e - param2;
          var6 = var6 - var10;
          param2 = SoftwareRasterizer.field_e;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * SoftwareRasterizer.field_b;
        }
        if (param2 + var6 > SoftwareRasterizer.field_d) {
          var6 = var6 - (param2 + var6 - SoftwareRasterizer.field_d);
        }
        if (param1 < SoftwareRasterizer.field_f) {
          var10Lifetime1 = SoftwareRasterizer.field_f - param1;
          var7 = var7 - var10Lifetime1;
          param1 = SoftwareRasterizer.field_f;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param1 + var7 > SoftwareRasterizer.field_g) {
          var10Lifetime2 = param1 + var7 - SoftwareRasterizer.field_g;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 > 0 &&
          var6 > 0) {
          g.a(SoftwareRasterizer.field_i, param0.pixels, 0, var5, var4, var7, var6, var8, var9, param3);
          return;
        }
    }

    final static void b() {
        oh var0 = (oh) (field_b.a(true));
        if (var0 == null) {
          throw new IllegalStateException(field_z);
        }
        SoftwareRasterizer.setTarget(var0.field_g, var0.field_i, var0.field_h);
        SoftwareRasterizer.setClip(var0.field_l, var0.field_f, var0.field_j, var0.field_k);
        var0.field_g = null;
        field_c.a(var0, false);
    }

    private final static boolean b(IntrusiveDeque param0) {
        IntrusiveNode var1;
        var1 = param0.c(51);
        while (var1 instanceof id) {
          if (var1.previous instanceof id) {
            if (((id) (var1)).field_E > ((id) (var1.previous)).field_E) {
              return false;
            }
            var1 = var1.previous;
            continue;
          }
          break;
        }
        return true;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var12 = 0;
        int var13 = 0;
        int incrementValue$12 = 0;
        int var10;
        int var11;
        for (var12 = -param6; var12 < 0; var12++) {
          for (var13 = -param5; var13 < 0; var13++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              var10 = param0[param4];
              var11 = 256 - ((param2 & 255) * param9 >> 8);
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = (var10 & 16711935) * var11 >> 8 & 16711935 | (var10 & 65280) * var11 >> 8 & 65280;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final static void a(Sprite param0) {
        int var4 = 0;
        int var5 = 0;
        int var3 = 0;
        int[] var1 = param0.pixels;
        int var2 = 0;
        for (var4 = 0; var4 < param0.height; var4++) {
          for (var5 = 0; var5 < param0.width / 2; var5++) {
            var3 = var1[var2 + var5];
            var1[var2 + var5] = var1[var2 + param0.width - var5 - 1];
            var1[var2 + param0.width - var5 - 1] = var3;
          }
          var2 = var2 + param0.width;
        }
        param0.offsetX = param0.fullWidth - param0.width - param0.offsetX;
    }

    final static void c(Sprite param0) {
        g.a(param0.pixels, param0.width, param0.height);
    }

    final static void a(int param0) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$9 = 0;
        int var1;
        int[] var2;
        int var3;
        int var4;
        Sprite var5;
        int[] var6;
        int[] var9;
        int[] var10;
        var1 = 0;
        var10 = SoftwareRasterizer.field_i;
        var9 = var10;
        var2 = var9;
        var3 = SoftwareRasterizer.field_b;
        var4 = SoftwareRasterizer.field_l;
        var5 = new Sprite(var3, var4);
        var6 = var5.pixels;
        for (var7 = 0; var7 < var4; var7++) {
          for (var8 = 0; var8 < var3; var8++) {
            boolean decompiledFrameRemainder0 = true;
            if (var10[var1] == 0 && (var1 < var10.length - 1 &&
              var2[var1 + 1] != 0 ||
              var1 > 1 &&
              var2[var1 - 1] != 0 ||
              var1 > var3 &&
              var2[var1 - var3] != 0 ||
              var1 < var10.length - 1 - var3 &&
              var2[var1 + var3] != 0)) {
              var6[var1++] = param0;
              decompiledFrameRemainder0 = false;
            }
            else {
              incrementValue$9 = var1;
              var1++;
              var6[incrementValue$9] = var2[incrementValue$9];
            }
          }
        }
        var5.c(0, 0);
    }

    final static void a(IntrusiveDeque param0) {
        Object var1;
        IntrusiveNode var1_ref;
        IntrusiveNode var2;
        while (!g.b(param0)) {
          var1_ref = param0.c(51);
          while (var1_ref instanceof id) {
            if (!(var1_ref.previous instanceof id)) {
              break;
            }
            var2 = var1_ref.previous;
            if (((id) (var1_ref)).field_E > ((id) (var2)).field_E) {
              var1_ref.unlink(true);
              qc.a(var1_ref, var2, 0);
            }
            var1_ref = var2;
          }
        }
    }

    final static void d() {
        g.b();
    }

    final static int a(int param0, int param1, boolean param2, boolean param3) {
        int var4;
        int var5;
        int var5Lifetime1;
        var4 = 750;
        if (param0 == 255) {
          return 0;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param0 != 18) {
          if (param0 != 5 &&
            param0 != 12) {
            if (param0 != 7 &&
              param0 != 13 &&
              param0 != 9 &&
              param0 != 10 &&
              param0 != 11 &&
              param0 != 14 &&
              param0 != 16) {
              if ((param0 == 8 ||
                param0 == 4 ||
                param0 == 1 ||
                param0 == 3 ||
                param0 == 15 ||
                param0 == 17)) {
                var4 = var4 * 2;
              }
            } else {
              var4 = var4 * 3;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            var4 = var4 * 4;
          }
        } else {
          var4 = var4 * 5;
        }
        if (param1 == 255) {
          var5 = var4;
          if (param2) {
            var4 = var4 - var5 / 4;
          }
          if (param3) {
            var4 = var4 - var5 / 3;
          }
          return var4;
        }
        if (param1 != 33 &&
          param1 != 32) {
          if (param1 != 36) {
            var4 = var4 * 3 / 2;
          } else {
            var4 = var4 * 4;
          }
        } else {
          var4 = var4 * 4 / 3;
        }
        var5Lifetime1 = var4;
        if (param2) {
          var4 = var4 - var5Lifetime1 / 4;
        }
        if (param3) {
          var4 = var4 - var5Lifetime1 / 3;
        }
        return var4;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        param0 += 2;
        param1 += 2;
        param2 -= 4;
        param3 -= 4;
        int var5 = param0 + param1 * SoftwareRasterizer.field_b;
        int var6 = SoftwareRasterizer.field_b - param2;
        g.a(SoftwareRasterizer.field_i, var5, param4, 0, 0, 0, 0, param2, param3, var6);
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var11 = 0;
        int var12 = 0;
        int incrementValue$12 = 0;
        int var9;
        int var10;
        for (var11 = -param6; var11 < 0; var11++) {
          for (var12 = -param5; var12 < 0; var12++) {
            param2 = param1[param3++];
            if (param2 == 0) {
              param4++;
            } else {
              var9 = param0[param4];
              var10 = 256 - (param2 & 255);
              incrementValue$12 = param4;
              param4++;
              param0[incrementValue$12] = (var9 & 16711935) * var10 >> 8 & 16711935 | (var9 & 65280) * var10 >> 8 & 65280;
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    private final static void a(int[] param0, int param1, int param2) {
        g.c();
        SoftwareRasterizer.setTarget(param0, param1, param2);
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11;
        param8--;
        while (param8 >= 0) {
          for (var10 = param7 - 1; var10 >= 0; var10--) {
            var11 = param0[param1];
            if (var11 != 0 &&
              var11 != param2) {
              param3 = param1 - 1;
              param4 = param1 + 1;
              param5 = param1 - SoftwareRasterizer.field_b;
              param6 = param1 + SoftwareRasterizer.field_b;
              if (param0[param5 + 1] == 0) {
                param0[param5 + 1] = param2;
              }
              if (param0[param6 + 1] == 0) {
                param0[param6 + 1] = param2;
              }
              if (param0[param5 - 1] == 0) {
                param0[param5 - 1] = param2;
              }
              if (param0[param6 - 1] == 0) {
                param0[param6 - 1] = param2;
              }
              if (param0[param3] == 0) {
                param0[param3] = param2;
              }
              if (param0[param4] == 0) {
                param0[param4] = param2;
              }
              if (param0[param5] == 0) {
                param0[param5] = param2;
              }
              if (param0[param6] == 0) {
                param0[param6] = param2;
              }
              if (param0[param3 - 1] == 0) {
                param0[param3 - 1] = param2;
              }
              if (param0[param4 + 1] == 0) {
                param0[param4 + 1] = param2;
              }
              if (param0[param5 - SoftwareRasterizer.field_b] == 0) {
                param0[param5 - SoftwareRasterizer.field_b] = param2;
              }
              if (param0[param6 + SoftwareRasterizer.field_b] == 0) {
                param0[param6 + SoftwareRasterizer.field_b] = param2;
              }
            }
            param1++;
          }
          param1 = param1 + param9;
          param8--;
        }
    }

    static {
        field_z = "No pixdest to pop!";
        field_b = new IntrusiveDeque();
        field_c = new IntrusiveDeque();
        field_a = new Random();
    }
}
