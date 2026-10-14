/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    String field_g;
    static RgbSprite arcticNearSprite;
    private int field_b;
    private int field_c;
    float field_e;
    private int field_h;
    private po[] field_f;
    static String field_a;

    final void a(ResourceArchive param0, boolean param1, String param2, String param3) {
        try {
          if (param1) {
            this.field_c = -45;
          }
          this.a((String) null, param2, param3, param0, -1, 99);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "s.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean d(int param0) {
        int var3;
        po var4;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 > -94) {
          arcticNearSprite = (RgbSprite) null;
        }
        while (this.field_c < this.field_b) {
          var4 = this.field_f[this.field_c];
          if (!var4.field_b.ensureIndex((byte) -127)) {
            this.a(0, -22269, var4);
            return false;
          }
          if (0 <= var4.field_h &&
            !var4.field_b.ensureGroupAvailable(-13083, var4.field_h)) {
            this.a(var4.field_b.getGroupProgress(var4.field_h, -27509), -22269, var4);
            return false;
          }
          if (var4.field_d != null &&
            !var4.field_b.ensureGroupAvailableByName(var4.field_d, -28138)) {
            this.a(var4.field_b.getGroupProgressByName(0, var4.field_d), -22269, var4);
            return false;
          }
          if (var4.field_h < 0 &&
            null == var4.field_d &&
            var4.field_g != null &&
            !var4.field_b.ensureAllGroupsAvailable(108)) {
            this.a(var4.field_b.getProgress(-4126), -22269, var4);
            return false;
          }
          this.field_c = this.field_c + 1;
        }
        return true;
    }

    final void a(String param0, String param1, int param2, String param3, ResourceArchive param4) {
        try {
          this.a(param1, param0, param3, param4, -1, -90);
          int var6_int = -82 / ((73 - param2) / 51);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "s.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(String param0, String param1, String param2, ResourceArchive param3, int param4, int param5) {
        po[] var10 = null;
        po var9 = null;
        po var11 = null;
        int fieldTemp$0 = 0;
        try {
          if (this.field_b >= this.field_f.length) {
            var10 = new po[2 * this.field_b];
            po[] var7 = var10;
            ArrayOperations.copy(this.field_f, 0, var10, 0, this.field_b);
            this.field_f = var10;
          }
          var9 = new po();
          var11 = var9;
          po var7_ref = var11;
          var11.field_f = param1;
          int var8 = 0 / ((26 - param5) / 51);
          var11.field_g = param2;
          var11.field_b = param3;
          var11.field_d = param0;
          var11.field_h = param4;
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          this.field_f[fieldTemp$0] = var9;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "s.J(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(byte param0) {
        String var2 = (String) null;
        Mesh3D.a(true, (String) null, ReportAbuseDialog.field_cc);
        if (param0 == -30) {
          return;
        }
        field_a = (String) null;
    }

    final static void b(int param0) {
        FarmBackground.field_v.setBounds(18, 0, 0, -(!vd.field_e ? 0 : 2 + (DialogMessagePanel.field_J + 2) + 40) + Ball.field_A.width, (byte) 64);
        GameUiController.field_a.setBounds(18, 0, -42 + Ball.field_A.width - DialogMessagePanel.field_J, 42 + DialogMessagePanel.field_J, (byte) 64);
        if (param0 >= 122) {
          IsaacGenerator.field_b.setScrollPaneBounds(2, (byte) -118, Ball.field_A.width, 0, 20, DialogMessagePanel.field_J, Ball.field_A.height - 20);
          return;
        }
        RgbSprite var2 = (RgbSprite) null;
        s.a((RgbSprite) null, -53, 56, (RgbSprite) null, (RasterCacheSurface) null, -22, (byte) -5, (RgbSprite) null);
        IsaacGenerator.field_b.setScrollPaneBounds(2, (byte) -118, Ball.field_A.width, 0, 20, DialogMessagePanel.field_J, Ball.field_A.height - 20);
    }

    final static boolean a(int param0) {
        int var1 = -86 / ((28 - param0) / 42);
        return MusicCrossfadeStream.nameEntryPopup != null ? true : false;
    }

    final static void a(RgbSprite param0, int param1, int param2, RgbSprite param3, RasterCacheSurface param4, int param5, byte param6, RgbSprite param7) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        try {
          IndexedSpriteGeometry.pushSpriteRaster(-72, param4.sprite);
          Rasterizer2D.fillVerticalGradient(0, 0, param4.width, param4.height, CacheIoWorker.halloweenBackgroundColors[param2], 22953);
          param3.drawTransparent((-param3.canvasWidth + param4.width) / 2 - 147 / param1, 480 + param5 - param7.canvasHeight);
          param0.b(-(80 / param1) + (param4.width - param0.canvasWidth) / 2, -(201 / param1) + (param4.height + param5) - param0.canvasHeight, 41, 110);
          var8_int = -97 / ((param6 - 54) / 61);
          sc.popRaster(-95);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("s.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    s(int param0) {
        this.field_f = new po[16];
        this.field_h = param0;
    }

    public static void c(int param0) {
        field_a = null;
        arcticNearSprite = null;
        if (param0 == 4862) {
          return;
        }
        s.c(25);
    }

    private final void a(int param0, int param1, po param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = (float)param0 / 100.0f + (float)(this.field_c + 1);
          this.field_e = (float)this.field_h * var4_float / (float)(1 + this.field_b);
          if (param1 != -22269) {
            s.b(116);
          }
          if (param0 == 0) {
            this.field_g = param2.field_f;
            return;
          }
          this.field_g = param2.field_g + " - " + param0 + "%";
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("s.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_a = "Offer unrated rematch";
    }
}
