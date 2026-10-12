/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static String field_e;
    static String field_f;
    static int[] field_b;
    static int[] field_g;
    static SceneWidget field_a;
    static String[] field_h;
    static int field_d;
    static ak field_c;

    final static void a(il param0, int param1, int param2, String param3, BitmapFont param4) {
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = SteelSentinels.obfuscationControl;
        try {
          var5_int = 0;
          var6 = -1;
          var7 = 75 % ((-15 - param1) / 46);
          for (var8 = 1; param3.length() > var8; var8++) {
            var9 = param3.charAt(var8);
            if (var9 == 60) {
              var6 = param0.field_f[0] + (var5_int >> 8) + param4.c(param3.substring(0, var8));
            }
            if (-1 != var6) {
              param0.field_f[var8] = var6;
            } else {
              if (32 == var9) {
                var5_int = var5_int + param2;
              }
              param0.field_f[var8] = param0.field_f[0] + ((var5_int >> 8) + (param4.c(param3.substring(0, var8 + 1)) - param4.a((char) var9)));
            }
            if (var9 == 62) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("kk.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_f = null;
        if (param0 > -95) {
          return;
        }
        field_e = null;
        field_b = null;
        field_a = null;
        field_c = null;
        field_h = null;
    }

    final static void b(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        BitmapFont var5 = null;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          if (param0 != 34) {
            var5 = (BitmapFont) null;
            kk.a((il) null, -122, -42, (String) null, (BitmapFont) null);
          }
          var6 = IntrusiveNode.field_c;
          var1 = var6;
          var2 = 0;
          var3 = var6.length;
          while (var3 > var2) {
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
            var6[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref), "kk.A(" + param0 + ')');
        }
    }

    final static String a(ArticulatedPart param0, int param1) {
        int var6_int = 0;
        ArticulatedPart stackIn_4_0 = null;
        Object stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        ArticulatedPart var5 = null;
        Object var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        BitmapFont var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int var7Lifetime1;
        var10 = SteelSentinels.obfuscationControl;
        try {
          var15 = new int[16];
          var13 = var15;
          var12 = var13;
          var16 = var12;
          var14 = var16;
          var2 = var14;
          var3 = Projectile.a(var15, 0, true, param0);
          var4 = ub.a(127, param0.componentId);
          if (0 > var4) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = NodeDeque.a(var4, (byte) 67);
          }
          var5 = stackIn_4_0;
          if (var5 != null) {
            var3 = Projectile.a(var15, var3, true, var5);
          }
          for (var6_int = 0; var6_int < var3 - 1; var6_int++) {
            var7 = var6_int;
            for (var8 = 1 + var6_int; var3 > var8; var8++) {
              if (var15[var8] < var15[var7]) {
                var7 = var8;
              }
            }
            if (var7 != var6_int) {
              var8 = var15[var6_int];
              var12[var6_int] = var15[var7];
              var15[var7] = var8;
            }
          }
          var6 = null;
          for (var7Lifetime1 = 0; var3 > var7Lifetime1; var7Lifetime1 = var7Lifetime1 + var8) {
            for (var8 = 1; var8 + var7Lifetime1 < var3; var8++) {
              if (~var16[var7Lifetime1] == ~var2[var7Lifetime1 + var8]) {
                continue;
              }
              break;
            }
            var9 = dc.a(var16[var7Lifetime1], 32);
            if (var9 != null) {
              if (var6 == null) {
                var6 = db.a(hf.field_a, param1 ^ 4221, new String[]{Integer.toString(var8), var9});
              } else {
                var6 = db.a(q.field_a, param1 ^ 4141, new String[]{(String) (var6), Integer.toString(var8), var9});
              }
            }
          }
          if (param1 != -4097) {
            var11 = (BitmapFont) null;
            kk.a((il) null, -28, -91, (String) null, (BitmapFont) null);
          }
          stackIn_35_0 = var6;
          return (String) (stackIn_35_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_38_0 = var2_ref;
          stackIn_38_1 = new StringBuilder().append("kk.G(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != -28548) {
          field_g = (int[]) null;
        }
        return ~GameplayController.field_G == ~nf.field_b.field_fc ? true : false;
    }

    final static int approximateVectorLength(int deltaY, int deltaX, int obfuscationGuard) {
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int var3;
        int var4;
        int var4Lifetime1;
        int var4Lifetime2;
        if (obfuscationGuard != -22967) {
          field_e = (String) null;
        }
        var4 = deltaX >> 31;
        deltaX = deltaX + var4 ^ var4;
        var4Lifetime1 = deltaY >> 31;
        deltaY = deltaY + var4Lifetime1 ^ var4Lifetime1;
        var3 = 0;
        if (deltaY > deltaX) {
          var4Lifetime2 = deltaX;
          deltaX = deltaY;
          deltaY = var4Lifetime2;
        }
        if (deltaX >= 32768) {
          if (1073741824 <= deltaX) {
            var3 += 16;
            deltaX = deltaX >> 16;
          }
          if (4194304 <= deltaX) {
            deltaX = deltaX >> 8;
            var3 += 8;
          }
          if (deltaX >= 262144) {
            deltaX = deltaX >> 4;
            var3 += 4;
          }
          if (deltaX >= 65536) {
            var3 += 2;
            deltaX = deltaX >> 2;
          }
          if (deltaX >= 32768) {
            deltaX = deltaX >> 1;
            var3++;
          }
          deltaY = deltaY >> var3;
        }
        if (deltaY << 5 < deltaX) {
          return deltaX << var3;
        }
        deltaX = deltaY * deltaY + deltaX * deltaX;
        if (65536 > deltaX) {
          if (deltaX < 256) {
            if (0 > deltaX) {
              return -1;
            }
            return td.field_Xb[deltaX] >> 12;
          }
          if (deltaX < 4096) {
            if (deltaX >= 1024) {
              return td.field_Xb[deltaX >> 4] >> 10;
            }
            return td.field_Xb[deltaX >> 2] >> 11;
          }
          if (16384 <= deltaX) {
            return td.field_Xb[deltaX >> 8] >> 8;
          }
          return td.field_Xb[deltaX >> 6] >> 9;
        }
        if (deltaX < 16777216) {
          if (1048576 > deltaX) {
            if (deltaX < 262144) {
              return td.field_Xb[deltaX >> 10] >> 7;
            }
            return td.field_Xb[deltaX >> 12] >> 6;
          }
          if (deltaX < 4194304) {
            return td.field_Xb[deltaX >> 14] >> 5;
          }
          return td.field_Xb[deltaX >> 16] >> 4;
        }
        if (deltaX >= 268435456) {
          if (1073741824 <= deltaX) {
            return td.field_Xb[deltaX >> 24] << var3;
          }
          if (var3 >= 1) {
            stackIn_50_0 = td.field_Xb[deltaX >> 22] << -1 + var3;
          } else {
            stackIn_50_0 = td.field_Xb[deltaX >> 22] >> -var3 + 1;
          }
          return stackIn_50_0;
        }
        if (67108864 > deltaX) {
          if (3 <= var3) {
            stackIn_45_0 = td.field_Xb[deltaX >> 18] << -3 + var3;
          } else {
            stackIn_45_0 = td.field_Xb[deltaX >> 18] >> 3 - var3;
          }
          return stackIn_45_0;
        }
        if (var3 >= 2) {
          stackIn_41_0 = td.field_Xb[deltaX >> 20] << var3 - 2;
        } else {
          stackIn_41_0 = td.field_Xb[deltaX >> 20] >> 2 - var3;
        }
        return stackIn_41_0;
    }

    final static void a(SceneWidget param0, int param1, int param2, int[] param3, String param4, String param5, int param6, long param7, kg param8) {
        try {
          if (param6 != 1073741824) {
            field_a = (SceneWidget) null;
          }
          la.field_c = param8;
          an.field_i = new dd(param0, param7, param4, param5, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "kk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "<%0>: <%1>";
        field_b = new int[128];
        field_a = null;
        field_e = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_h = new String[]{"Light", "Heavy", "Ordnance", "Rocket", "Large rocket", "Nuke"};
    }
}
