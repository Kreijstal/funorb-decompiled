/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class so {
    static Random field_a;

    final static vn a(vn param0) {
        vn var1 = new vn(param0.field_r, param0.field_q);
        var1.a();
        bi.d();
        param0.h(0, 0, 16777215);
        so.a(12303291);
        so.a(8947848);
        so.a(4473924);
        param0.h(0, 0, 0);
        return var1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        param0 += 2;
        param1 += 2;
        param2 -= 4;
        param3 -= 4;
        int var5 = param0 + param1 * bi.field_f;
        int var6 = bi.field_f - param2;
        so.a(bi.field_c, var5, param4, 0, 0, 0, 0, param2, param3, var6);
    }

    final static String a(String[] args) {
        return args[pb.a(field_a, args.length, 1)];
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

    final static void b(vn param0, int param1, int param2, int param3) {
        int var10 = 0;
        int var4 = param1 + param2 * bi.field_f;
        int var5 = 0;
        int var6 = param0.field_t;
        int var7 = param0.field_w;
        int var8 = bi.field_f - var7;
        int var9 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        if (param2 < bi.field_l) {
          var10 = bi.field_l - param2;
          var6 = var6 - var10;
          param2 = bi.field_l;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * bi.field_f;
        }
        if (param2 + var6 > bi.field_d) {
          var6 = var6 - (param2 + var6 - bi.field_d);
        }
        if (param1 < bi.field_g) {
          var10Lifetime1 = bi.field_g - param1;
          var7 = var7 - var10Lifetime1;
          param1 = bi.field_g;
          var5 = var5 + var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 + var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param1 + var7 > bi.field_b) {
          var10Lifetime2 = param1 + var7 - bi.field_b;
          var7 = var7 - var10Lifetime2;
          var9 = var9 + var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        so.a(bi.field_c, param0.field_z, 0, var5, var4, var7, var6, var8, var9, param3);
    }

    final static void b(vo param0) {
        Object var1;
        le var1_ref;
        le var2;
        while (!so.a(param0)) {
          var1_ref = param0.b((byte) 26);
          while (var1_ref instanceof fb) {
            if (!(var1_ref.field_b instanceof fb)) {
              break;
            }
            var2 = var1_ref.field_b;
            if (((fb) (var1_ref)).field_x > ((fb) (var2)).field_x) {
              var1_ref.b(-27598);
              im.a(var1_ref, -30395, var2);
            }
            var1_ref = var2;
          }
        }
    }

    final static void a(vn param0, int param1, int param2) {
        int var9 = 0;
        int var3 = param1 + param2 * bi.field_f;
        int var4 = 0;
        int var5 = param0.field_t;
        int var6 = param0.field_w;
        int var7 = bi.field_f - var6;
        int var8 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        if (param2 < bi.field_l) {
          var9 = bi.field_l - param2;
          var5 = var5 - var9;
          param2 = bi.field_l;
          var4 = var4 + var9 * var6;
          var3 = var3 + var9 * bi.field_f;
        }
        if (param2 + var5 > bi.field_d) {
          var5 = var5 - (param2 + var5 - bi.field_d);
        }
        if (param1 < bi.field_g) {
          var9Lifetime1 = bi.field_g - param1;
          var6 = var6 - var9Lifetime1;
          param1 = bi.field_g;
          var4 = var4 + var9Lifetime1;
          var3 = var3 + var9Lifetime1;
          var8 = var8 + var9Lifetime1;
          var7 = var7 + var9Lifetime1;
        }
        if (param1 + var6 > bi.field_b) {
          var9Lifetime2 = param1 + var6 - bi.field_b;
          var6 = var6 - var9Lifetime2;
          var8 = var8 + var9Lifetime2;
          var7 = var7 + var9Lifetime2;
        }
        if (var6 <= 0 ||
          var5 <= 0) {
          return;
        }
        so.a(bi.field_c, param0.field_z, 0, var4, var3, var6, var5, var7, var8);
    }

    public static void a() {
        field_a = null;
    }

    final static void a(int param0) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$9 = 0;
        int var1;
        int[] var2;
        int var3;
        int var4;
        vn var5;
        int[] var6;
        var1 = 0;
        var2 = bi.field_c;
        var3 = bi.field_f;
        var4 = bi.field_a;
        var5 = new vn(var3, var4);
        var6 = var5.field_z;
        for (var7 = 0; var7 < var4; var7++) {
          for (var8 = 0; var8 < var3; var8++) {
            boolean decompiledFrameRemainder0 = true;
            if (var2[var1] == 0 && (var1 < var2.length - 1 &&
              var2[var1 + 1] != 0 ||
              var1 > 1 &&
              var2[var1 - 1] != 0 ||
              var1 > var3 &&
              var2[var1 - var3] != 0 ||
              var1 < var2.length - 1 - var3 &&
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
        var5.e(0, 0);
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

    final static int a(int[] param0) {
        return param0[pb.a(field_a, param0.length, 1)];
    }

    final static void a(vn param0, int param1, int param2, int param3) {
        int var10 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        param1 = param1 + (param0.field_r - param0.field_w - param0.field_v);
        param2 = param2 + param0.field_x;
        int var4 = param1 + param2 * bi.field_f;
        int var5 = param0.field_w - 1;
        int var6 = param0.field_t;
        int var7 = param0.field_w;
        int var8 = bi.field_f - var7;
        int var9 = var7 + var7;
        if (param2 < bi.field_l) {
          var10 = bi.field_l - param2;
          var6 = var6 - var10;
          param2 = bi.field_l;
          var5 = var5 + var10 * var7;
          var4 = var4 + var10 * bi.field_f;
        }
        if (param2 + var6 > bi.field_d) {
          var6 = var6 - (param2 + var6 - bi.field_d);
        }
        if (param1 < bi.field_g) {
          var10Lifetime1 = bi.field_g - param1;
          var7 = var7 - var10Lifetime1;
          param1 = bi.field_g;
          var5 = var5 - var10Lifetime1;
          var4 = var4 + var10Lifetime1;
          var9 = var9 - var10Lifetime1;
          var8 = var8 + var10Lifetime1;
        }
        if (param1 + var7 > bi.field_b) {
          var10Lifetime2 = param1 + var7 - bi.field_b;
          var7 = var7 - var10Lifetime2;
          var9 = var9 - var10Lifetime2;
          var8 = var8 + var10Lifetime2;
        }
        if (var7 <= 0 ||
          var6 <= 0) {
          return;
        }
        so.b(bi.field_c, param0.field_z, 0, var5, var4, var7, var6, var8, var9, param3);
    }

    private final static boolean a(vo param0) {
        le var1;
        var1 = param0.b((byte) 26);
        while (var1 instanceof fb) {
          if (var1.field_b instanceof fb) {
            if (((fb) (var1)).field_x > ((fb) (var1.field_b)).field_x) {
              return false;
            }
            var1 = var1.field_b;
            continue;
          }
          break;
        }
        return true;
    }

    private final static void b(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var12 = 0;
        int var13 = 0;
        int incrementValue$14 = 0;
        int var10;
        int var11;
        var10 = param9 & 16711935;
        var11 = param9 >> 8 & 255;
        for (var12 = -param6; var12 < 0; var12++) {
          for (var13 = -param5; var13 < 0; var13++) {
            param2 = param1[param3--];
            if (param2 == 0) {
              param4++;
            } else {
              if (param2 >> 8 != (param2 & 65535)) {
                param0[param4++] = param2;
              } else {
                param2 = param2 & 255;
                incrementValue$14 = param4;
                param4++;
                param0[incrementValue$14] = (param2 * var10 >> 8 & 16711934) + (param2 * var11 & 65280) + 1;
              }
            }
          }
          param4 = param4 + param7;
          param3 = param3 + param8;
        }
    }

    final static int b(int param0) {
        return pj.a(param0, -42) >> 8;
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
              param5 = param1 - bi.field_f;
              param6 = param1 + bi.field_f;
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
              if (param0[param5 - bi.field_f] == 0) {
                param0[param5 - bi.field_f] = param2;
              }
              if (param0[param6 + bi.field_f] == 0) {
                param0[param6 + bi.field_f] = param2;
              }
            }
            param1++;
          }
          param1 = param1 + param9;
          param8--;
        }
    }

    final static int c(int param0) {
        return pb.a(field_a, param0, 1);
    }

    static {
        field_a = new Random();
    }
}
