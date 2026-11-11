/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CharacterChoiceTile extends IntrusiveNode {
    static String field_i;
    static String field_h;
    int field_f;
    private int field_g;
    static TombRacer field_j;
    private int field_k;

    final boolean isHovered(byte param0) {
        if (param0 >= -62) {
          this.field_k = -99;
          if (this.field_k > AgeValidator.field_j) {
            return false;
          }
          if (this.field_k + 64 < AgeValidator.field_j) {
            return false;
          }
          if (GridWidgetContainer.field_B < this.field_g) {
            return false;
          }
          if (GridWidgetContainer.field_B <= 64 + this.field_g) {
            return true;
          }
          return false;
        }
        if (this.field_k > AgeValidator.field_j) {
          return false;
        }
        if (this.field_k + 64 < AgeValidator.field_j) {
          return false;
        }
        if (GridWidgetContainer.field_B < this.field_g) {
          return false;
        }
        if (GridWidgetContainer.field_B <= 64 + this.field_g) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        int var1 = -85 / ((42 - param0) / 45);
        field_i = null;
        field_h = null;
        field_j = null;
    }

    CharacterChoiceTile(int param0, int param1, int param2) {
        this(param1, param2);
        this.field_f = param0;
    }

    final boolean isEmpty(int param0) {
        if (param0 != -64) {
          return true;
        }
        return this.field_f == -1 ? true : false;
    }

    final static HazardEffect decodeEffect(byte param0, BitPacketBuffer param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        HazardEffect var4 = null;
        BitPacketBuffer var5 = null;
        HazardEffect stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param1.readBits((byte) 44, 4);
          if (param0 != 87) {
            var5 = (BitPacketBuffer) null;
            CharacterChoiceTile.decodeEffect((byte) -125, (BitPacketBuffer) null);
          }
          var3 = param1.readBits((byte) 44, 10);
          var4 = new HazardEffect(var2_int, var3);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ad.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean containsId(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int[] stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = 0;
          if (param0 != -13545) {
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var2), "ad.B(" + param0 + ',' + param1 + ')');
        }
        stackIn_6_0 = VariantMask.field_a;
        try {
          while (stackIn_6_0.length > var2_int) {
            if (param1 == VariantMask.field_a[var2_int]) {
              return true;
            }
            var2_int++;
            stackIn_6_0 = VariantMask.field_a;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var2), "ad.B(" + param0 + ',' + param1 + ')');
        }
    }

    final void draw(byte param0, boolean param1) {
        String var10 = null;
        int var3 = 0;
        String var4 = null;
        int var5 = -38 / ((32 - param0) / 33);
        GraphicsToolkit var8 = tga.field_a;
        int var4_int = this.field_k;
        int var6 = this.field_g;
        ToolkitSprite[] var7 = ArchiveSource.field_a;
        String var4Lifetime1;
        int var3Lifetime1;
        TextInputWidget.paintNineSliceFrame(1, var7, (byte) -96, var4_int, var8, 64, 1, 64, var6, 0);
        tga.field_a.setClip(this.field_k, this.field_g, this.field_k + 64, -3 + this.field_g + 64);
        if (this.isEmpty(-64)) {
          nc.field_e.draw(this.field_k, this.field_g);
          tga.field_a.la();
          var3 = 2431750;
          if (param1) {
            var3 = 10309393;
          }
          var10 = !this.isEmpty(-64) ? Room.field_m[this.field_f] : "";
          var4 = var10;
          SocketConnector.drawWrappedText(var10.toUpperCase(), 1, FloatPacketBuffer.field_j, var3, 0, 64, 1, 40 + this.field_g, -10 + this.field_k, -1, (byte) 60, 84);
          return;
        }
        fa.field_a[this.field_f].draw(this.field_k, this.field_g);
        tga.field_a.la();
        var3Lifetime1 = 2431750;
        if (param1) {
          var3Lifetime1 = 10309393;
        }
        String var9 = !this.isEmpty(-64) ? Room.field_m[this.field_f] : "";
        var4Lifetime1 = var9;
        SocketConnector.drawWrappedText(var9.toUpperCase(), 1, FloatPacketBuffer.field_j, var3Lifetime1, 0, 64, 1, 40 + this.field_g, -10 + this.field_k, -1, (byte) 60, 84);
    }

    CharacterChoiceTile(int param0, int param1) {
        this.field_f = -1;
        this.field_k = -2 + param0 + uca.cosmeticRandom.nextBounded(4, 0);
        this.field_g = -5 + (uca.cosmeticRandom.nextBounded(10, 0) + param1);
    }

    static {
        field_i = "Completed";
        field_h = "<%0> wants to draw.";
    }
}
