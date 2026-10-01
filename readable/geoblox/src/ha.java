/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha {
    static int field_g;
    int field_e;
    int field_b;
    int field_a;
    int field_c;
    int field_d;
    int field_f;

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    private final static IndexedSprite a(int param0, int[] param1, IndexedSprite param2) {
        IndexedSprite var3 = null;
        RuntimeException var3_ref = null;
        IndexedSprite stackIn_2_0 = null;
        IndexedSprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new IndexedSprite(0, 0, 0);
          var3.field_a = param2.field_a;
          var3.field_e = param2.field_e;
          var3.field_d = param2.field_d;
          if (param0 < -62) {
            var3.field_c = param2.field_c;
            var3.palette = param1;
            var3.indices = param2.indices;
            var3.field_f = param2.field_f;
            var3.field_b = param2.field_b;
            stackIn_4_0 = (IndexedSprite) (var3);
            decompiledRegionSelector0 = 1;
          } else {
            stackIn_2_0 = (IndexedSprite) null;
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var3_ref);

          stackIn_7_1 = new StringBuilder().append("ha.I(").append(param0).append(',');

          if (param1 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }


          stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

          if (param2 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(byte param0, rh param1, rh param2, rh param3) {
        Sprite var18 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var20 = null;
        int[][] var17 = null;
        int[][] var7 = null;
        IndexedSprite[] var15 = null;
        int var11_int = 0;
        Sprite var16 = null;
        Sprite var19 = null;
        Sprite var11 = null;
        Sprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = Geoblox.field_C;
        try {
            id.field_c = wj.a("frame_top", "commonui", param2, 0);
            fh.field_e = wj.a("frame_bottom", "commonui", param2, 0);
            jc.field_a = ug.a("jagex_logo_grey", param2, (byte) -78, "commonui");
            vk.field_e = wj.a("button", "commonui", param2, 0);
            oa.field_e = oi.a((byte) -39, "validation", "commonui", param2);
            hh.field_d = (m) ((Object) q.a(param3, 1, "arezzo12", "commonui", param2));
            ng.field_F = (m) ((Object) q.a(param3, 1, "arezzo14", "commonui", param2));
            hh.field_c = (m) ((Object) q.a(param3, 1, "arezzo14bold", "commonui", param2));
            var18 = new Sprite(param1.a(0, "", "button.gif"), (java.awt.Component) ((Object) f.field_kb));
            jg.a(param2, 1, "commonui", "dropdown");
            var5 = MenuScreen.a("commonui", "screen_options", true, param2);
            ek.field_a = new IndexedSprite[4];
            sb.field_e = new IndexedSprite[4];
            lj.field_c = new IndexedSprite[4];
            var6 = new IndexedSprite[][]{ek.field_a, sb.field_e, lj.field_c};
            var20 = new int[4][];
            var17 = var20;
            var7 = var17;
            var7[0] = var5[0].palette;
            for (var8 = 1; var20.length > var8; var8++) {
                var7[var8] = (int[]) ((Object) var20[0].clone());
            }
            var8 = var5[0].indices[0];
            var20[2][var8] = 16777215;
            var20[1][var8] = 2394342;
            var20[3][var8] = 4767999;
            for (var9 = 0; -4 < (var9 ^ -1); var9++) {
                var15 = var6[var9];
                IndexedSprite[] var10 = var15;
                for (var11_int = 0; var11_int < var15.length; var11_int++) {
                    var15[var11_int] = ha.a(-84, var20[var11_int], var5[var9]);
                }
            }
            var9 = var18.height;
            oc.b(-105);
            if (param0 <= 98) {
                IndexedSprite var14 = (IndexedSprite) null;
                ha.a(72, (int[]) null, (IndexedSprite) null);
            }
            var18.e();
            SoftwareRasterizer.a(0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.field_b);
            var16 = new Sprite(var9, var9);
            var19 = var16;
            var19.e();
            var18.c(0, 0);
            var11 = new Sprite(var9, var9);
            var11.e();
            var18.c(var9 + -var18.width, 0);
            var12 = new Sprite(var18.width + -(2 * var9), var9);
            var12.e();
            var18.c(-var9, 0);
            id.a(true);
            vk.field_e = new Sprite[]{var16, var12, var11};
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ha.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0) {
        int var1 = 77 / ((param0 - -17) / 52);
        return nk.field_e;
    }

    static {
        field_g = 0;
    }
}
