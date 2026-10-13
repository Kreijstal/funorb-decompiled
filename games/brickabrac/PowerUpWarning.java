/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PowerUpWarning extends IntrusiveNode {
    static int[] field_n;
    int ageTicks;
    int typeId;
    static RgbSprite desertMidSprite;
    static byte[] field_p;
    static int[] field_l;
    static MouseInput mouseInput;
    static mh field_k;
    static TextFont field_r;
    static int field_i;

    final static hg[] a(boolean param0, PlatformServices param1) {
        int var5 = 0;
        hg[] stackIn_4_0 = null;
        hg[] stackIn_10_0 = null;
        hg[] stackIn_13_0 = null;
        hg[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        hg[] var4 = null;
        hg var6 = null;
        int var7 = 0;
        PlatformTask var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!param1.b(-125)) {
            stackIn_4_0 = new hg[]{};
            return stackIn_4_0;
          }
          var8 = param1.a(0);
          while (var8.status == 0) {
            wj.sleepMillis(-128, 10L);
          }
          if (var8.status == 2) {
            stackIn_10_0 = new hg[]{};
            return stackIn_10_0;
          }
          if (!param0) {
            stackIn_13_0 = (hg[]) null;
            return stackIn_13_0;
          }
          var10 = (int[]) (var8.result);
          var9 = var10;
          var3 = var9;
          var4 = new hg[var10.length >> 2];
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new hg();
            var4[var5] = var6;
            var6.field_d = var3[var5 << 2];
            var6.field_c = var3[1 + (var5 << 2)];
            var6.field_h = var3[2 + (var5 << 2)];
            var6.field_f = var3[3 + (var5 << 2)];
          }
          stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("lj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (param0) {
          return;
        }
        mouseInput = null;
        field_l = null;
        field_r = null;
        field_n = null;
        field_k = null;
        field_p = null;
        desertMidSprite = null;
    }

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          var5 = ArcticBackground.field_w;
          var1 = var5;
          var2 = param0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1_ref), "lj.C(" + param0 + ')');
        }
    }

    final static void a(gb param0, int param1) {
        int var2_int = 0;
        gb var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          if (null == param0.field_j) {
            return;
          }
          if (param0.field_f != 0 ||
            0 != param0.field_d) {
            for (var2_int = 0; mm.field_Sb > var2_int; var2_int++) {
              var3 = UnderwaterBackground.field_s[var2_int];
              if (var3.field_c == 2 &&
                var3.field_f == param0.field_f &&
                var3.field_d == param0.field_d) {
                return;
              }
            }
          }
          if (null != param0.field_g) {
            ig.field_K = param0.field_m;
            kb.field_Zb = param0.field_k;
            r.field_x = param0.field_c;
            ResourceRequest.field_z = param0.field_g;
          }
          n.a(0, param0);
          var2_intLifetime1 = 85 / ((param1 + 11) / 50);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("lj.E(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        DualLinkDeque.field_b = param4;
        BufferedSocket.field_m = param2;
        TooltipSprite.field_i = param0;
        if (param3 != 0) {
          PlatformServices var6 = (PlatformServices) null;
          PowerUpWarning.a(true, (PlatformServices) null);
        }
        field_i = param1;
    }

    final static void a(int param0, PlayerBoard param1, MultiplayerMatch param2, int param3, int param4) {
        try {
          int var5_int = -82 % ((param3 - 81) / 41);
          MenuScreen.a(param2, param1, param4, param0, true, 5, 1);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "lj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    PowerUpWarning(int typeId) {
        this(typeId, true);
    }

    PowerUpWarning(int typeId, boolean unusedFlag) {
        this.ageTicks = 0;
        this.typeId = typeId;
    }

    static {
        int var3 = 0;
        int var4 = 0;
        field_n = new int[256];
        int var0 = 64;
        int var1 = 128;
        int var2 = 255;
        for (var3 = 0; var3 < 256; var3++) {
          var4 = (int)(Math.pow((double)var3, 1.5) / 16.0);
          field_n[var3] = LevelSelectScreen.d(LevelSelectScreen.d(var4 * var1 >> 8 << 8, var0 * var4 >> 8 << 16), var2 * var4 >> 8);
        }
        field_l = new int[]{0, 4096, 5793, 7094, 8192, 9159, 10033, 10837, 11585, 12288, 12953, 13585, 14189, 14768, 15326, 15864, 16384, 16888, 17378, 17854, 18318, 18770, 19212, 19644, 20066, 20480, 20886, 21283, 21674, 22058, 22435, 22806, 23170, 23530, 23884, 24232, 24576, 24915, 25249, 25580, 25905, 26227, 26545, 26859, 27170, 27477, 27780, 28081, 28378, 28672, 28963, 29251, 29537, 29819, 30099, 30377, 30652, 30924, 31194, 31462, 31727, 31991, 32252, 32511, 32768, 33023, 33276, 33527, 33776, 34024, 34270, 34514, 34756, 34996, 35235, 35472, 35708, 35942, 36175, 36406, 36636, 36864, 37091, 37316, 37540, 37763, 37985, 38205, 38424, 38642, 38858, 39073, 39287, 39500, 39712, 39923, 40132, 40341, 40548, 40755, 40960, 41164, 41368, 41570, 41771, 41972, 42171, 42369, 42567, 42763, 42959, 43154, 43348, 43541, 43733, 43925, 44115, 44305, 44494, 44682, 44869, 45056, 45242, 45427, 45611, 45795, 45977, 46160, 46341, 46522, 46702, 46881, 47059, 47237, 47415, 47591, 47767, 47942, 48117, 48291, 48465, 48637, 48809, 48981, 49152, 49322, 49492, 49661, 49830, 49998, 50166, 50332, 50499, 50665, 50830, 50995, 51159, 51323, 51486, 51649, 51811, 51972, 52134, 52294, 52454, 52614, 52773, 52932, 53090, 53248, 53405, 53562, 53719, 53874, 54030, 54185, 54340, 54494, 54647, 54801, 54954, 55106, 55258, 55410, 55561, 55712, 55862, 56012, 56162, 56311, 56459, 56608, 56756, 56903, 57051, 57198, 57344, 57490, 57636, 57781, 57926, 58071, 58215, 58359, 58503, 58646, 58789, 58931, 59073, 59215, 59357, 59498, 59639, 59779, 59919, 60059, 60199, 60338, 60477, 60615, 60753, 60891, 61029, 61166, 61303, 61440, 61576, 61712, 61848, 61984, 62119, 62254, 62388, 62523, 62657, 62790, 62924, 63057, 63190, 63323, 63455, 63587, 63719, 63850, 63982, 64113, 64243, 64374, 64504, 64634, 64763, 64893, 65022, 65151, 65279, 65408};
        mouseInput = new MouseInput();
    }
}
