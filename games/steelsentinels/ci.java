/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static String field_d;
    static int field_g;
    static bf field_a;
    static int[] field_c;
    static String field_h;
    static NodeDeque field_e;
    static String field_f;
    static String[] field_b;

    final static String a(byte param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = SteelSentinels.obfuscationControl;
        var6 = "(" + di.field_d + " " + ma.field_W + " " + aj.field_u + ") " + ch.field_N;
        var1 = var6;
        if (param0 != 94) {
          return (String) null;
        }
        if (jg.field_f > 0) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < jg.field_f; var2++) {
            var7 = var1 + ' ';
            var3 = rf.field_d.payload[var2] & 255;
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (10 > var4) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            var8 = var7 + (char)var4;
            if (var3 >= 10) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    public static void a(boolean param0) {
        if (param0) {
          ci.a((byte) -76);
        }
        field_f = null;
        field_d = null;
        field_c = null;
        field_e = null;
        field_h = null;
        field_a = null;
        field_b = null;
    }

    final static void a(ResourceArchive param0, byte param1, ResourceArchive param2, ResourceArchive param3) {
        RgbSprite var17 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        IndexedSprite[] var14 = null;
        int var11_int = 0;
        RgbSprite var15 = null;
        RgbSprite var18 = null;
        RgbSprite var11 = null;
        RgbSprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = SteelSentinels.obfuscationControl;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          jj.field_k = cf.a("frame_top", "commonui", (byte) -95, param0);
          Explosion.field_J = cf.a("frame_bottom", "commonui", (byte) -94, param0);
          Explosion.field_L = rl.a(param0, "commonui", "jagex_logo_grey", false);
          un.field_m = cf.a("button", "commonui", (byte) -54, param0);
          t.field_i = ec.a((byte) -62, "validation", param0, "commonui");
          rc.field_m = (BitmapFont) ((Object) be.a(param0, param2, (byte) -48, "arezzo12", "commonui"));
          tj.field_e = (BitmapFont) ((Object) be.a(param0, param2, (byte) -62, "arezzo14", "commonui"));
          gf.field_d = (BitmapFont) ((Object) be.a(param0, param2, (byte) -57, "arezzo14bold", "commonui"));
          var17 = new RgbSprite(param3.a("", -742, "button.gif"), (java.awt.Component) ((Object) sl.field_n));
          if (param1 < 63) {
            ci.a(true);
          }
          gl.a(param0, (byte) 85, "commonui", "dropdown");
          var5 = cj.a(45, "commonui", param0, "screen_options");
          lh.field_q = new IndexedSprite[4];
          ce.field_q = new IndexedSprite[4];
          vm.field_r = new IndexedSprite[4];
          var6 = new IndexedSprite[][]{lh.field_q, ce.field_q, vm.field_r};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_o;
          for (var8 = 1; var19.length > var8; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_p[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            IndexedSprite[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
              var14[var11_int] = NodeHashTable.a(var5[var9], var19[var11_int], false);
            }
          }
          var9Lifetime1 = var17.field_F;
          ArchiveIndex.a(false);
          var17.d();
          SoftwareRaster.b(0, 0, SoftwareRaster.field_c, SoftwareRaster.field_j);
          var15 = new RgbSprite(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.d();
          var17.f(0, 0);
          var11 = new RgbSprite(var9Lifetime1, var9Lifetime1);
          var11.d();
          var17.f(var9Lifetime1 - var17.field_A, 0);
          var12 = new RgbSprite(var17.field_A - var9Lifetime1 * 2, var9Lifetime1);
          var12.d();
          var17.f(-var9Lifetime1, 0);
          tk.$cfr$intArgs$f$20d51497949f(122);
          un.field_m = new RgbSprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ci.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(ResourceArchive param0, byte param1, String param2, String param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
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
        try {
          if (!param0.ensureIndex(true)) {
            stackIn_2_0 = (String) (param4);
            return stackIn_2_0;
          }
          if (param1 < 86) {
            field_g = -116;
          }
          stackIn_6_0 = param3 + " - " + param0.a((byte) 94, param2) + "%";
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ci.A(");
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
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static od a(Throwable param0, String param1) {
        od var2 = null;
        if (param0 instanceof od) {
          var2 = (od) ((Object) param0);
          var2.field_a = var2.field_a + ' ' + param1;
        } else {
          var2 = new od(param0, param1);
        }
        return var2;
    }

    final static void a(boolean param0, byte param1) {
        if (null != ll.field_i) {
          jg.a(ll.field_i, 1);
        }
        if (null != an.field_i) {
          an.field_i.b(param0, (byte) -114);
        }
        bh.a((byte) -115, param0);
        int var2 = 40 % ((param1 - 49) / 45);
        if (FunOrbClient.field_x != null) {
          FunOrbClient.field_x.a(param0, (byte) 127);
        }
        tf.a(0, param0);
    }

    static {
        field_d = "Show chat";
        field_h = "Players: <%0>/<%1>";
        field_c = new int[8192];
        field_f = "Enemy wave - ";
        field_b = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
