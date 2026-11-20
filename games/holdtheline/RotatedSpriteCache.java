/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RotatedSpriteCache {
    private boolean field_j;
    private boolean field_d;
    static boolean field_c;
    static String field_i;
    static jg[] field_g;
    static java.awt.Frame field_f;
    private Sprite[] field_h;
    static String field_e;
    static String field_k;
    private int field_a;
    private Sprite field_b;

    final static void a(int param0) {
        int var1 = StrongCacheEntry.field_w == -1 ? 0 : StrongCacheEntry.field_w;
        ArchiveRequest.field_r = ~SolidRoadStripRenderer.b(2, 10) == param0 ? 6 : 5;
        nm.field_b = ArchiveRequest.field_r == 6 ? tk.field_c[5][var1] : tk.field_c[var1][0];
        if (!UsernameLoginCredentials.a(nm.field_b, true)) {
          qn.field_k = false;
          fl.field_j = false;
          QuickChatPhraseDefinition.field_r = -1;
          MusicPatchPcmStream.field_r = null;
          DiskCacheStore.field_i = -1;
        } else {
          MusicPatchPcmStream.field_r = new RaceWorld(nm.field_b, ArchiveRequest.field_r, false, false, -1, -1);
          ArchiveRequest.field_r = -1;
        }
        EntitySound.field_j = false;
    }

    final RotatedSpriteCache recolorGrayscale(int param0, int param1) {
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        Sprite var10;
        int[] var11;
        int[] var12;
        var9 = HoldTheLine.field_D;
        var10 = this.field_b.copy();
        var12 = var10.pixels;
        var11 = var12;
        var4 = var11;
        var5 = param1 & 16711935;
        var6 = param1 & 65280;
        var7 = 0;
        if (param0 != -4503) {
          return (RotatedSpriteCache) null;
        }
        while (var7 < var12.length) {
          var8 = var12[var7];
          if (var8 != 0 &&
            (65535 & var8) == var8 >> 8) {
            var8 = var8 & 255;
            var4[var7] = 1 + (LoginChoicePanel.a(16711680, var6 * var8) + LoginChoicePanel.a(var5 * var8, -16712192) >>> 8);
          }
          var7++;
        }
        return new RotatedSpriteCache(var10, this.field_a, this.field_j, this.field_d);
    }

    final void setScale(int param0, boolean param1) {
        if (param1) {
          return;
        }
        this.clearRotations(27854);
        this.field_a = param0;
    }

    final Sprite getByAngle(float param0, int param1) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        param0 = (float)((double)param0 * 10.185916357881302);
        if (param1 != 27788) {
          return (Sprite) null;
        }
        for (var3 = Math.round(param0); var3 < 0; var3 += 64) {
        }
        while (var3 >= 64) {
          var3 -= 64;
        }
        return this.getByOrientation(var3, (byte) 120);
    }

    final static int a(BitmapFont param0, String param1, String[] param2, byte param3, int param4) {
        int var10 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var7Lifetime1;
        var14 = HoldTheLine.field_D;
        try {
          var5_int = 62 / ((param3 - 29) / 60);
          var6 = param0.measureText(param1);
          if (param4 >= var6 &&
            param1.indexOf("<br>") == -1) {
            param2[0] = param1;
            stackIn_5_0 = 1;
            return stackIn_5_0;
          }
          var7 = (-1 + (param4 + var6)) / param4;
          param4 = var6 / var7;
          var7Lifetime1 = 0;
          var8 = 0;
          var9 = param1.length();
          for (var10 = 0; var10 < var9; var10++) {
            var11 = param1.charAt(var10);
            if (32 == var11 ||
              var11 == 45) {
              var12 = param1.substring(var8, 1 + var10).trim();
              var13 = param0.measureText(var12);
              if (param4 <= var13) {
                var8 = var10 + 1;
                incrementValue$1 = var7Lifetime1;
                var7Lifetime1++;
                param2[incrementValue$1] = var12;
              }
            }
            if (62 == var11 &&
              param1.regionMatches(-3 + var10, "<br>", 0, 4)) {
              incrementValue$2 = var7Lifetime1;
              var7Lifetime1++;
              param2[incrementValue$2] = param1.substring(var8, -3 + var10).trim();
              var8 = var10 + 1;
            }
          }
          if (var8 < var9) {
            incrementValue$0 = var7Lifetime1;
            var7Lifetime1++;
            param2[incrementValue$0] = param1.substring(var8, var9).trim();
          }
          stackIn_25_0 = var7Lifetime1;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("mg.E(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static Object wrapByteStorage(byte param0, byte[] param1, boolean param2) {
        DirectByteStorage var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        DirectByteStorage stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        byte[] stackIn_12_0 = null;
        byte[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          if (param1.length > 136) {
            var3 = new DirectByteStorage();
            ((ByteStorage) ((Object) var3)).putBytes(95, param1);
            stackIn_6_0 = var3;
            return stackIn_6_0;
          }
          if (param0 <= 93) {
            stackIn_9_0 = (Object) null;
            return stackIn_9_0;
          }
          if (param2) {
            stackIn_14_0 = CheckboxWidget.copyBytes(param1, (byte) -69);
            return stackIn_14_0;
          }
          stackIn_12_0 = (byte[]) (param1);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("mg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_g = null;
        field_k = null;
        if (param0 != -28) {
          return;
        }
        field_i = null;
        field_e = null;
        field_f = null;
    }

    private final void clearRotations(int param0) {
        this.field_h = new Sprite[64];
        if (param0 != 27854) {
          this.clearRotations(85);
        }
    }

    private final Sprite getByOrientation(int param0, byte param1) {
        int var5 = 0;
        int var4 = 0;
        Sprite var6 = null;
        int var3 = 40 % ((2 - param1) / 63);
        if (this.field_h[param0] != null) {
        } else {
          var5 = this.field_b.canvasWidth + this.field_b.canvasHeight;
          var4 = this.field_b.canvasWidth + this.field_b.canvasHeight;
          var6 = new Sprite(var4, var5);
          vb.a(-128, var6);
          if (this.field_d) {
            this.field_b.drawRotatedCenteredNearest(15, 16384 + param0 * 1024, this.field_a, var4 >> 1, var5 >> 1);
          } else {
            this.field_b.drawRotatedCentered(var4 >> 1, var5 >> 1, 16384 + param0 * 1024, this.field_a);
          }
          if (!this.field_j) {
            var6.trimTransparentEdges();
          }
          this.field_h[param0] = new Sprite(var6.width, var6.height);
          this.field_h[param0].pixels = var6.pixels;
          MarkerSliderRenderer.restoreRasterTarget(-1);
        }
        return this.field_h[param0];
    }

    RotatedSpriteCache(Sprite param0, boolean param1, boolean param2) {
        try {
          this.field_d = param2 ? true : false;
          this.field_j = param1 ? true : false;
          this.field_b = param0;
          this.setScale(4096, false);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    RotatedSpriteCache(Sprite param0, int param1, boolean param2, boolean param3) {
        try {
          this.field_j = param2 ? true : false;
          this.field_d = param3 ? true : false;
          this.field_b = param0;
          this.setScale(param1, false);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "mg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_c = false;
        field_e = "Members";
        field_i = "Quit";
        field_k = "to keep fullscreen or";
    }
}
