/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg {
    static volatile int field_a;
    static String field_c;
    static int field_b;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 18567) {
          wl var2 = (wl) null;
          kg.a((String) null, 109, true, (wl) null);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, Sprite[] param5) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param5 != null &&
            param4 > 0) {
            var6_int = param5[0].fullWidth;
            var7 = param5[2].fullWidth;
            var8 = param5[1].fullWidth;
            param5[0].b(param1, param3, param2);
            param5[2].b(param4 + (param1 - var7), param3, param2);
            SoftwareRasterizer.saveClip(rl.field_a);
            SoftwareRasterizer.intersectClip(var6_int + param1, param3, param4 + (param1 - var7), param5[1].fullHeight + param3);
            var9 = param1 + var6_int;
            var10 = -var7 + (param1 + param4);
            for (param1 = var9; param1 < var10; param1 = param1 + var8) {
              param5[1].b(param1, param3, param2);
            }
            var11 = -92 / ((param0 + 40) / 54);
            SoftwareRasterizer.restoreClip(rl.field_a);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("kg.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, ResourceArchive param1, ResourceArchive param2, ResourceArchive param3) {
        Sprite var17 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        IndexedSprite[] var14 = null;
        int var11_int = 0;
        Sprite var15 = null;
        Sprite var18 = null;
        Sprite var11 = null;
        Sprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = AceOfSkies.obfuscationControl ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          ArchiveProvider.field_c = qg.a((byte) 3, param1, "commonui", "frame_top");
          HighscoreQuery.field_k = qg.a((byte) 3, param1, "commonui", "frame_bottom");
          eo.field_b = ij.a(param1, "jagex_logo_grey", "commonui", 1);
          u.field_i = qg.a((byte) 3, param1, "commonui", "button");
          gu.field_c = tj.a("validation", "commonui", 1, param1);
          oi.field_c = (BitmapFont) ((Object) as.a(param3, -119, param1, "arezzo12", "commonui"));
          qo.field_b = (BitmapFont) ((Object) as.a(param3, -104, param1, "arezzo14", "commonui"));
          b.field_c = (BitmapFont) ((Object) as.a(param3, param0 ^ -112, param1, "arezzo14bold", "commonui"));
          var17 = new Sprite(param2.a("button.gif", (byte) -71, ""), (java.awt.Component) ((Object) ci.field_f));
          cd.a(param1, "commonui", "dropdown", param0 - 116);
          var5 = iu.a(param1, "commonui", (byte) -86, "screen_options");
          MenuInputState.field_i = new IndexedSprite[param0];
          dk.field_e = new IndexedSprite[4];
          sl.field_o = new IndexedSprite[4];
          var6 = new IndexedSprite[][]{sl.field_o, dk.field_e, MenuInputState.field_i};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].palette;
          for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].indices[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            IndexedSprite[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = ClientException.a(15810, var5[var9], var19[var11_int]);
            }
          }
          var9Lifetime1 = var17.height;
          qk.a((byte) -92);
          var17.makeRasterTarget();
          SoftwareRasterizer.c(0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.framebufferHeight);
          var15 = new Sprite(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.makeRasterTarget();
          var17.c(0, 0);
          var11 = new Sprite(var9Lifetime1, var9Lifetime1);
          var11.makeRasterTarget();
          var17.c(var9Lifetime1 - var17.width, 0);
          var12 = new Sprite(-(var9Lifetime1 * 2) + var17.width, var9Lifetime1);
          var12.makeRasterTarget();
          var17.c(-var9Lifetime1, 0);
          sl.c(param0 + 2761);
          u.field_i = new Sprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "kg.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        var2 = param0;
        var3 = it.field_c;
        if (var3 >= 5) {
          if (var3 < 105) {
            var2 = (-40960 + var3 * 16384) / 220;
          } else {
            if (var3 < 120) {
              var3 = -var3 + 120;
              var2 = 8192 - var3 * var3 * 8192 / 3300;
            }
          }
        } else {
          var2 = var3 * (var3 * 8192) / 1100;
        }
        var4 = 1;
        var5 = 0;
        if (param1 == 3) {
          var4 = -1;
        }
        if (param1 == 1) {
          var5 = 1;
        }
        if (param1 == 4) {
          var4 = 1;
          var5 = 1;
        }
        if (5 == param1) {
          var4 = -1;
          var5 = 1;
        }
        if (param1 == 6) {
          var4 = 1;
          var5 = -1;
        }
        if (7 == param1 ||
          param1 == 8) {
          var5 = -1;
          var4 = -1;
        }
        if (param1 == 11) {
          var4 = -1;
        }
        if (param1 == 12) {
          var4 = -1;
          var5 = -1;
        }
        if (param1 == 13) {
          var5 = -1;
          var4 = 1;
        }
        if (14 == param1) {
          var5 = 1;
          var4 = -1;
        }
        if (param1 == 15) {
          var5 = 1;
          var4 = 1;
        }
        PacketBuffer.field_k = of.a(var5 * var2, -19, var4 * var2);
    }

    final static aq a(String param0, int param1, boolean param2, wl param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var10 = null;
        Object stackIn_12_0 = null;
        aq stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2) {
            field_a = 32;
          }
          var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param1);
          jaggl.OpenGL.glShaderSourceARB(var4_long, param0);
          jaggl.OpenGL.glCompileShaderARB(var4_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, wl.field_m, 0);
          if (0 == wl.field_m[0]) {
            if (0 == wl.field_m[0]) {
              System.out.println("Shader compile failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, wl.field_m, 1);
            if (wl.field_m[1] > 1) {
              var10 = new byte[wl.field_m[1]];
              jaggl.OpenGL.glGetInfoLogARB(var4_long, wl.field_m[1], wl.field_m, 0, var10, 0);
              System.out.println(new String(var10));
            }
            if (wl.field_m[0] == 0) {
              jaggl.OpenGL.glDeleteObjectARB(var4_long);
              stackIn_12_0 = null;
              return (aq) (stackIn_12_0);
            }
          }
          stackIn_14_0 = new aq(param3, var4_long, param1);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("kg.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static cl a(String param0, byte param1) {
        String var2 = null;
        cl var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        cl stackIn_13_0 = null;
        cl stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (null == pj.field_a) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (param0.length() == 0) {
            return null;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = vu.normalizePlayerName(param1 ^ 64, var6);
          if (var2 == null) {
            return null;
          }
          var3 = (cl) (pj.field_a.a(124, (long)var2.hashCode()));
          if (param1 != 61) {
            stackIn_13_0 = (cl) null;
            return stackIn_13_0;
          }
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_I);
            var4 = vu.normalizePlayerName(param1 + 63, var7);
            if (!var4.equals(var2)) {
              var3 = (cl) (pj.field_a.a(false));
              continue;
            }
            break;
          }
          stackIn_18_0 = var3;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("kg.B(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = 0;
        field_c = "GAME PAUSED";
        field_b = -1;
    }
}
