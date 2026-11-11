/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DarknessBehaviour extends Behaviour {
    static UrlDownloadRequest field_o;
    private int field_n;
    private Sprite mask;
    private int field_q;
    private int field_p;

    private final int toMaskCoordinate(int param0, int param1) {
        if (param0 >= -20) {
          return 49;
        }
        return param1 / 8 >> 16;
    }

    public final void toggle(int param0) {
        int var2;
        if (this.locked) {
          return;
        }
        super.toggle(82);
        var2 = -79 % ((28 - param0) / 49);
        if (!this.enabled) {
          this.clearMask(false);
        } else {
          if (this.getRoom(true).hasActiveVariant((byte) -82)) {
            this.fillMask((byte) -115, this.field_p);
          }
        }
    }

    final int hashState(int param0, int param1) {
        if (param1 > -48) {
          this.field_p = 110;
        }
        return param0;
    }

    final int onProjectileEffect(int param0, Projectile param1, HazardEffect param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 25940) {
            this.field_q = 56;
          }
          var4_int = param1.getSize(-1);
          stackIn_3_0 = this.onAreaEffect(var4_int, var4_int, param2, param1.getX(3), (byte) -36, param1.getY(9648));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ana.BC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void attachToTrap(boolean param0, Trap param1) {
        try {
          super.attachToTrap(param0, param1);
          this.createMask(0);
          param1.setHandlesEffectType(26492, true, 1);
          param1.setAlwaysBlocksBeams(param0, 35);
          param1.b((byte) 112, 8);
          param1.setProvidesSurface(true, (byte) 109, 2);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ana.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getSurfaceCoverage(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var17 = 0;
        int var19 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var18;
        int var20;
        int var21;
        var21 = TombRacer.field_G ? 1 : 0;
        if (param4 <= 79) {
          this.mask = (Sprite) null;
        }
        if (2 != param3) {
          return 0;
        }
        if (null == this.mask) {
          return 0;
        }
        OpenGlIndexArray.setRasterTarget(this.mask, (byte) 89);
        var7 = 0;
        var8 = param5 - (param0 / 2 + this.trap.getX(3) - this.trap.getWidth(-15) / 2);
        var9 = -this.trap.getY(9648) + this.trap.getHeight((byte) 55) / 2 + (param2 - param1 / 2);
        var10 = param0 + var8;
        var11 = var9 + param1;
        var12 = this.toMaskCoordinate(-105, var8);
        var13 = this.toMaskCoordinate(-127, var9);
        var14 = this.toMaskCoordinate(-68, 7 + var10);
        var15 = this.toMaskCoordinate(-73, 8 + (var11 - 1));
        var16 = 64;
        for (var17 = var13; var17 <= var15; var17++) {
          var18 = this.mask.field_m * var17 + var12;
          for (var19 = var12; var14 >= var19; var19++) {
            if (var18 >= 0 &&
              var18 < SoftwareRasterizer.pixels.length &&
              this.field_q <= SoftwareRasterizer.pixels[var18]) {
              if (var13 != var17 &&
                var17 != var15 &&
                var19 != var12 &&
                var14 != var19) {
                var7 = var7 + var16;
              } else {
                var20 = BufferedSocket.rectangleOverlapArea(var9 >> 16, 1, 8 * var17, var17 * 8 + 8, var11 >> 16, 0, 8 * var19, var10 >> 16, 8 + var19 * 8, var8 >> 16);
                var7 = var7 + var20;
              }
            }
            var18++;
          }
        }
        pfa.popRasterState(1);
        return var7;
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          this.tick(2);
        }
        return 3;
    }

    DarknessBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_q = 240;
        this.field_n = 2621440;
        this.field_p = 255;
        try {
          if (param0.formatVersion >= 4) {
            this.field_n = param1.readBits((byte) 44, 10) << 16;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ana.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static StringBuilder padTo(int param0, char param1, int param2, StringBuilder param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder var7 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param3.length();
          param3.setLength(param0);
          if (param2 != -11) {
            var7 = (StringBuilder) null;
            DarknessBehaviour.padTo(101, 'ﾘ', -14, (StringBuilder) null);
          }
          for (var5 = var4_int; param0 > var5; var5++) {
            param3.setCharAt(var5, param1);
          }
          stackIn_7_0 = (StringBuilder) (param3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ana.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_o = null;
        if (!param0) {
          StringBuilder var2 = (StringBuilder) null;
          DarknessBehaviour.padTo(101, 'ﾥ', 42, (StringBuilder) null);
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) 59, this.field_n >> 16, 10);
          if (param0) {
            BitPacketBuffer var4 = (BitPacketBuffer) null;
            this.encode(true, (BitPacketBuffer) null);
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ana.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int onAreaEffect(int param0, int param1, HazardEffect param2, int param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_intLifetime1;
        try {
          if (param2.type == 1) {
            var7_int = MidiVoiceMixer.min(param0, param1, -48) / 2;
            this.a(param3, (byte) 90, param2.size, var7_int, param5);
          }
          var7_intLifetime1 = -5 / ((param4 - 62) / 52);
          stackIn_3_0 = 0;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("ana.UB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void tick(int param0) {
        int var3_int = 0;
        int[] var2;
        int var4;
        BitPacketBuffer var5;
        int[] var6;
        int[] var7;
        int[] var8;
        Player var3;
        int[] var6Lifetime1;
        int[] var6Lifetime1Lifetime1;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.mask == null) {
          return;
        }
        if (!this.enabled) {
          return;
        }
        var8 = this.mask.pixels;
        var7 = var8;
        var6 = var7;
        var2 = var6;
        if (param0 != 5418) {
          var5 = (BitPacketBuffer) null;
          this.encode(true, (BitPacketBuffer) null);
        }
        for (var3_int = -1 + var8.length; var3_int >= 0; var3_int--) {
          if (var8[var3_int] < this.field_p) {
            var6Lifetime1 = var2;
            var6Lifetime1[var3_int] = var6Lifetime1[var3_int] + 8;
          }
          var6Lifetime1Lifetime1 = var2;
          if (var8[var3_int] > this.field_p) {
            var6Lifetime1Lifetime1[var3_int] = this.field_p;
          }
        }
        if (this.field_n > 0) {
          var3 = this.getPlayer((byte) 19);
          this.a(var3.getX(3), (byte) 86, 10, this.field_n, var3.getY(param0 ^ 12442));
        }
    }

    final int onBeamEffect(int param0, HazardEffect param1, BeamSegment param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        BeamSegment var10 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -85) {
            var10 = (BeamSegment) null;
            this.onBeamEffect(26, (HazardEffect) null, (BeamSegment) null);
          }
          var4_int = param2.field_d - this.trap.getX(3) + this.trap.getWidth(-67) / 2;
          var5 = param2.field_e - (this.trap.getX(3) - this.trap.getWidth(-63) / 2);
          var6 = param2.field_k - this.trap.getY(9648) + this.trap.getHeight((byte) 55) / 2;
          var7 = param2.field_a + (-this.trap.getY(9648) + this.trap.getHeight((byte) 55) / 2);
          var8 = param1.size;
          if (var8 >= 10) {
            var8 = 9;
          }
          var9 = var8 * HardwareReflectionEffect.field_e.length / 10;
          OpenGlIndexArray.setRasterTarget(this.mask, (byte) 110);
          iha.drawGlowingLine(var4_int / 8 >> 16, var6 / 8 >> 16, var5 / 8 >> 16, var7 / 8 >> 16, 2, var9, HardwareReflectionEffect.field_e);
          pfa.popRasterState(1);
          stackIn_6_0 = 0;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ana.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void clearMask(boolean param0) {
        if (param0) {
          return;
        }
        this.fillMask((byte) -125, 0);
    }

    private final void createMask(int param0) {
        int var2;
        int var3;
        int stackIn_12_1 = 0;
        int stackIn_13_2 = 0;
        var2 = this.trap.getWidth(param0 - 21) >> 16;
        var3 = this.trap.getHeight((byte) 55) >> 16;
        if (param0 != 0) {
          return;
        }
        if (this.getRoom(true).hasActiveVariant((byte) -82)) {
          this.field_p = 128;
        } else {
          this.field_p = 255;
        }
        this.mask = null;
        if (var2 >= 32 &&
          var3 >= 32 &&
          var2 < 1024 && var3 < 1024) {
          this.mask = new Sprite(var2 / 8, var3 / 8);
          stackIn_12_1 = -117;
          if (!this.enabled) {
            stackIn_13_2 = 0;
          } else {
            stackIn_13_2 = 255;
          }
          this.fillMask((byte) stackIn_12_1, stackIn_13_2);
        }
    }

    DarknessBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        this.field_q = 240;
        this.field_n = 2621440;
        this.field_p = 255;
    }

    private final void fillMask(byte param0, int param1) {
        int var5 = TombRacer.field_G ? 1 : 0;
        if (null == this.mask) {
          return;
        }
        if (this.getRoom(true).hasActiveVariant((byte) -82)) {
          param1 = param1 / 2;
        }
        int[] var6 = this.mask.pixels;
        int[] var3 = var6;
        int var4 = -1 + var6.length;
        if (param0 >= -93) {
          field_o = (UrlDownloadRequest) null;
        }
        while (var4 >= 0) {
          var3[var4] = param1;
          var4--;
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = -106 % ((-24 - param1) / 60);
        if (null == this.mask) {
          return;
        }
    }

    static {
    }
}
