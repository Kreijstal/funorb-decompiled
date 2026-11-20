/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WhirlpoolHasher {
    private byte[] field_f;
    private long[] field_j;
    static int field_h;
    private long[] field_g;
    private byte[] field_c;
    private long[] field_k;
    private long[] field_d;
    private int field_e;
    static String field_i;
    private int field_a;
    private long[] field_b;

    final static void a(byte param0) {
        fo var1 = (fo) (TutorialPage.field_a.first((byte) 87));
        if (var1 == null) {
          r.a(-28036);
          return;
        }
        IsaacPacketBuffer var2 = RoadStripRenderer.field_e;
        if (param0 <= 68) {
          return;
        }
        var1.field_i = new int[]{var2.readInt(45), var2.readInt(-72), var2.readInt(-47), var2.readInt(79)};
        var1.unlink(0);
    }

    final void a(int param0, byte[] param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        Sprite var9 = null;
        var8 = HoldTheLine.field_D;
        try {
          this.field_f[this.field_e] = (byte)kc.a((int) this.field_f[this.field_e], 128 >>> LoginChoicePanel.a(7, this.field_a));
          this.field_e = this.field_e + 1;
          if (this.field_e > 32) {
            while (this.field_e < 64) {
              fieldTemp$0 = this.field_e;
              this.field_e = this.field_e + 1;
              this.field_f[fieldTemp$0] = (byte) 0;
            }
            this.c(true);
            this.field_e = 0;
          }
          while (this.field_e < 32) {
            fieldTemp$1 = this.field_e;
            this.field_e = this.field_e + 1;
            this.field_f[fieldTemp$1] = (byte) 0;
          }
          ArrayOperations.copyBytes(this.field_c, 0, this.field_f, 32, 32);
          this.c(true);
          var4_int = 0;
          var5 = param2;
          while (8 > var4_int) {
            var6 = this.field_k[var4_int];
            param1[var5] = (byte)(int)(var6 >>> 56);
            param1[var5 + 1] = (byte)(int)(var6 >>> 48);
            param1[2 + var5] = (byte)(int)(var6 >>> 40);
            param1[var5 + 3] = (byte)(int)(var6 >>> 32);
            param1[4 + var5] = (byte)(int)(var6 >>> 24);
            param1[5 + var5] = (byte)(int)(var6 >>> 16);
            param1[6 + var5] = (byte)(int)(var6 >>> 8);
            param1[var5 + 7] = (byte)(int)var6;
            var4_int++;
            var5 += 8;
          }
          if (param0 != 6934) {
            var9 = (Sprite) null;
            WhirlpoolHasher.a(-73, -103, -36, (Sprite) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("pa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        int var2Lifetime1;
        for (var2 = 0; var2 < 32; var2++) {
          this.field_c[var2] = (byte) 0;
        }
        this.field_f[0] = (byte) 0;
        if (param0) {
          return;
        }
        this.field_a = 0;
        this.field_e = 0;
        for (var2Lifetime1 = 0; 8 > var2Lifetime1; var2Lifetime1++) {
          this.field_k[var2Lifetime1] = 0L;
        }
    }

    final static void a(int param0, int param1, int param2) {
        Vector2f.field_i = param1;
        if (param0 > -32) {
          field_h = 30;
        }
        NanoTickClock.field_i = param2;
    }

    final static void a(BitmapFont param0, BitmapFont param1, byte param2, int param3) {
        CheckboxWidget.field_G = param1;
        q.field_a = param0;
        if (param2 > -39) {
          return;
        }
        try {
          IndexedSpriteState.field_j = param3;
          WhirlpoolHasher.a(-90, SoftwareRasterizer.height / 2, SoftwareRasterizer.width / 2);
          StraightRoadSegment.a(param1.capitalHeight, param0.capitalHeight, param0.capitalHeight + param0.descent, param1.descent + param1.capitalHeight, (byte) -108);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "pa.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, Sprite param3) {
        int var12 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = HoldTheLine.field_D;
        try {
          var4_int = 0;
          var5 = 0;
          var6 = param3.width;
          var7 = param3.height;
          if (param1 < 0) {
            var6 = var6 + param1;
            var4_int = var4_int - param1;
            param1 = 0;
          }
          if (var6 + param1 > 640) {
            var6 = 640 - param1;
          }
          if (param0 < 0) {
            var7 = var7 + param0;
            var5 = var5 - param0;
            param0 = 0;
          }
          if (param0 + var7 > 480) {
            var7 = -param0 + 480;
          }
          var8 = var4_int + (param3.canvasWidth * (var5 + (var7 - 1)) - 1);
          var9 = (-1 + var7 + param0) * SoftwareRasterizer.width + param1 - 1;
          var13 = var7;
          while (var13 > 0) {
            for (var12 = var6; var12 > 0; var12--) {
              var9++;
              var11 = SoftwareRasterizer.pixels[var9];
              var8++;
              var10 = param3.pixels[var8];
              if (var10 != 0) {
                if (0 != var11) {
                  var15 = 255 & var11 >> 8;
                  var18 = var10 >> 8 & 255;
                  var14 = (var11 & 16711680) >> 16;
                  var19 = 255 & var10;
                  var16 = 255 & var11;
                  var17 = var10 >> 16 & 255;
                  var14 = var14 + (var17 - (var17 * var14 >> 8) - 1);
                  var16 = var16 + (-(var16 * var19 >> 8) + (var19 - 1));
                  var15 = var15 + (-1 - (var15 * var18 >> 8) + var18);
                  SoftwareRasterizer.pixels[var9] = kc.a(kc.a(var14 << 16, var15 << 8), var16);
                } else {
                  SoftwareRasterizer.pixels[var9] = var10;
                }
              }
            }
            var13--;
            var8 = var8 - (param3.canvasWidth + var6);
            var9 = var9 - (var6 + SoftwareRasterizer.width);
          }
          if (param2 <= 97) {
            field_h = -97;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("pa.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final void c(boolean param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime1Lifetime1;
        int var3Lifetime1Lifetime2;
        int var3Lifetime1Lifetime3;
        var6 = HoldTheLine.field_D;
        if (!param0) {
          return;
        }
        var2 = 0;
        var3 = 0;
        while (var2 < 8) {
          this.field_g[var2] = GameKeyHandler.a(GameKeyHandler.a(ViewportSizingController.andLong(65280L, (long)this.field_f[var3 + 6] << 8), GameKeyHandler.a(ViewportSizingController.andLong((long)this.field_f[5 + var3] << 16, 16711680L), GameKeyHandler.a(GameKeyHandler.a(GameKeyHandler.a(GameKeyHandler.a((long)this.field_f[var3] << 56, ViewportSizingController.andLong(255L, (long)this.field_f[1 + var3]) << 48), ViewportSizingController.andLong((long)this.field_f[2 + var3], 255L) << 40), ViewportSizingController.andLong(1095216660480L, (long)this.field_f[3 + var3] << 32)), ViewportSizingController.andLong((long)this.field_f[4 + var3] << 24, 4278190080L)))), ViewportSizingController.andLong(255L, (long)this.field_f[var3 + 7]));
          var2++;
          var3 += 8;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 8; var2Lifetime1++) {
          dupTemp$0 = this.field_k[var2Lifetime1];
          arrayValue$1 = this.field_g[var2Lifetime1];
          this.field_d[var2Lifetime1] = dupTemp$0;
          this.field_b[var2Lifetime1] = GameKeyHandler.a(arrayValue$1, dupTemp$0);
        }
        for (var2Lifetime2 = 1; var2Lifetime2 <= 10; var2Lifetime2++) {
          for (var3Lifetime1 = 0; var3Lifetime1 < 8; var3Lifetime1++) {
            this.field_j[var3Lifetime1] = 0L;
            var4 = 0;
            var5 = 56;
            while (8 > var4) {
              this.field_j[var3Lifetime1] = GameKeyHandler.a(this.field_j[var3Lifetime1], ri.field_g[var4][LoginChoicePanel.a((int)(this.field_d[LoginChoicePanel.a(var3Lifetime1 - var4, 7)] >>> var5), 255)]);
              var4++;
              var5 -= 8;
            }
          }
          for (var3Lifetime1Lifetime1 = 0; var3Lifetime1Lifetime1 < 8; var3Lifetime1Lifetime1++) {
            this.field_d[var3Lifetime1Lifetime1] = this.field_j[var3Lifetime1Lifetime1];
          }
          this.field_d[0] = GameKeyHandler.a(this.field_d[0], ri.field_f[var2Lifetime2]);
          for (var3Lifetime1Lifetime2 = 0; var3Lifetime1Lifetime2 < 8; var3Lifetime1Lifetime2++) {
            this.field_j[var3Lifetime1Lifetime2] = this.field_d[var3Lifetime1Lifetime2];
            var7 = 0;
            var4Lifetime1 = var7;
            var5Lifetime1 = 56;
            while (var7 < 8) {
              this.field_j[var3Lifetime1Lifetime2] = GameKeyHandler.a(this.field_j[var3Lifetime1Lifetime2], ri.field_g[var7][LoginChoicePanel.a((int)(this.field_b[LoginChoicePanel.a(-var7 + var3Lifetime1Lifetime2, 7)] >>> var5Lifetime1), 255)]);
              var7++;
              var5Lifetime1 -= 8;
            }
          }
          for (var3Lifetime1Lifetime3 = 0; 8 > var3Lifetime1Lifetime3; var3Lifetime1Lifetime3++) {
            this.field_b[var3Lifetime1Lifetime3] = this.field_j[var3Lifetime1Lifetime3];
          }
        }
        for (var2Lifetime3 = 0; var2Lifetime3 < 8; var2Lifetime3++) {
          this.field_k[var2Lifetime3] = GameKeyHandler.a(this.field_k[var2Lifetime3], GameKeyHandler.a(this.field_b[var2Lifetime3], this.field_g[var2Lifetime3]));
        }
        return;
    }

    public static void clearSharedReferences(boolean param0) {
        field_i = null;
        if (!param0) {
          WhirlpoolHasher.clearSharedReferences(false);
        }
    }

    final void a(byte[] param0, byte param1, long param2) {
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        long var10 = 0L;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var9Lifetime1;
        var14 = HoldTheLine.field_D;
        try {
          var5_int = 0;
          var6 = -73 / ((-14 - param1) / 44);
          var7 = 7 & -(7 & (int)param2) + 8;
          var8 = this.field_a & 7;
          var10 = param2;
          var12 = 31;
          var13 = 0;
          while (var12 >= 0) {
            var13 = var13 + (((int)var10 & 255) + (255 & this.field_c[var12]));
            this.field_c[var12] = (byte)var13;
            var10 = var10 >>> 8;
            var13 = var13 >>> 8;
            var12--;
          }
          while (param2 > 8L) {
            var9 = 255 & param0[var5_int] << var7 | (255 & param0[1 + var5_int]) >>> -var7 + 8;
            if (var9 >= 0 &&
              var9 < 256) {
              this.field_f[this.field_e] = (byte)kc.a((int) this.field_f[this.field_e], var9 >>> var8);
              this.field_e = this.field_e + 1;
              this.field_a = this.field_a + (-var8 + 8);
              if (this.field_a == 512) {
                this.c(true);
                this.field_e = 0;
                this.field_a = 0;
              }
              this.field_f[this.field_e] = (byte)LoginChoicePanel.a(var9 << -var8 + 8, 255);
              param2 = param2 - 8L;
              var5_int++;
              this.field_a = this.field_a + var8;
              continue;
            }
            throw new RuntimeException("LOGIC ERROR");
          }
          if (0L < param2) {
            stackIn_15_0 = 255;
            stackIn_15_1 = param0[var5_int] << var7;
            var9Lifetime1 = stackIn_15_0 & stackIn_15_1;
            this.field_f[this.field_e] = (byte)kc.a((int) this.field_f[this.field_e], var9Lifetime1 >>> var8);
          } else {
            var9Lifetime1 = 0;
          }
          if (param2 + (long)var8 < 8L) {
            this.field_a = (int)((long)this.field_a + param2);
          } else {
            param2 = param2 - (long)(-var8 + 8);
            this.field_a = this.field_a + (8 - var8);
            this.field_e = this.field_e + 1;
            if (this.field_a == 512) {
              this.c(true);
              this.field_e = 0;
              this.field_a = 0;
            }
            this.field_f[this.field_e] = (byte)LoginChoicePanel.a(var9Lifetime1 << 8 - var8, 255);
            this.field_a = this.field_a + (int)param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("pa.I(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    WhirlpoolHasher() {
        this.field_f = new byte[64];
        this.field_j = new long[8];
        this.field_k = new long[8];
        this.field_g = new long[8];
        this.field_a = 0;
        this.field_d = new long[8];
        this.field_e = 0;
        this.field_b = new long[8];
        this.field_c = new byte[32];
    }

    static {
        field_i = "Brake/reverse";
    }
}
