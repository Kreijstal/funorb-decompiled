/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowableObjectList {
    static byte[][][] field_c;
    static String[] field_f;
    int size;
    private int capacity;
    static RotatedSpriteAsset[] field_a;
    Object[] elements;

    public static void clearSharedReferences(boolean param0) {
        field_c = (byte[][][]) null;
        field_f = null;
        if (!param0) {
          return;
        }
        field_a = null;
    }

    final static Sprite[] buildDecodedSprites(int param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        Sprite[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var11;
        int[] var13;
        byte[] var15;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = HoldTheLine.field_D;
        if (param0 < 51) {
          return (Sprite[]) null;
        }
        var1 = new Sprite[NineSlicePanel.field_d];
        for (var2 = 0; NineSlicePanel.field_d > var2; var2++) {
          var3 = EditableTextField.field_K[var2] * ReflectionCheckSupport.field_d[var2];
          var21 = IterableSecondaryNodeDeque.field_e[var2];
          if (!SocketConnector.field_f[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var6 < var3; var6++) {
              var10[var6] = StraightRoadSegment.field_E[LoginChoicePanel.andInts((int) var21[var6], 255)];
            }
            var1[var2] = new Sprite(SpriteDecodeGlobals.field_b, AchievementUnlockRequest.field_o, DirectByteStorage.field_j[var2], Vector2i.field_g[var2], EditableTextField.field_K[var2], ReflectionCheckSupport.field_d[var2], var22);
          } else {
            var15 = TrackCurve.field_i[var2];
            var11 = var15;
            var9 = var11;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var7 < var3; var7++) {
              var6_ref_int__[var7] = BitwiseIntegerOperations.orInts(LoginChoicePanel.andInts(-16777216, var15[var7] << 24), StraightRoadSegment.field_E[LoginChoicePanel.andInts((int) var21[var7], 255)]);
            }
            var1[var2] = (Sprite) ((Object) new ArgbSprite(SpriteDecodeGlobals.field_b, AchievementUnlockRequest.field_o, DirectByteStorage.field_j[var2], Vector2i.field_g[var2], EditableTextField.field_K[var2], ReflectionCheckSupport.field_d[var2], var17));
          }
        }
        VehicleEngineSounds.clearDecodedSpriteSheet(false);
        return var1;
    }

    final void add(Object param0, byte param1) {
        int fieldTemp$0 = 0;
        try {
          if (this.size == this.capacity) {
            this.grow((byte) 14);
          }
          if (param1 != 6) {
            PaletteBitmapFont var4 = (PaletteBitmapFont) null;
            GrowableObjectList.drawTextWithHighlight(((int[]) (this.elements[5]))[6], -83, (String) null, 82, -33, (PaletteBitmapFont) null);
          }
          fieldTemp$0 = this.size;
          this.size = this.size + 1;
          this.elements[fieldTemp$0] = param0;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ei.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void drawTextWithHighlight(int param0, int param1, String param2, int param3, int param4, PaletteBitmapFont param5) {
        try {
          param5.drawAlpha(param2, 1 + param0, param4 + param1, 8, -1, 114);
          param5.draw(param2, param0, param4, param3, -1);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ei.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void drawDottedRectangle(int param0, int param1, int param2, int param3, byte param4) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = HoldTheLine.field_D;
        try {
          var5_int = param2 + param1;
          if (param4 != 19) {
            return;
          }
          var6 = param0 + param3;
          if (param2 <= SoftwareRasterizer.clipLeft) {
            stackIn_6_0 = SoftwareRasterizer.clipLeft;
          } else {
            stackIn_6_0 = param2;
          }
          var7 = stackIn_6_0;
          if (param3 > SoftwareRasterizer.clipTop) {
            stackIn_9_0 = param3;
          } else {
            stackIn_9_0 = SoftwareRasterizer.clipTop;
          }
          var8 = stackIn_9_0;
          if (var5_int >= SoftwareRasterizer.clipRight) {
            stackIn_12_0 = SoftwareRasterizer.clipRight;
          } else {
            stackIn_12_0 = var5_int;
          }
          var9 = stackIn_12_0;
          if (var6 < SoftwareRasterizer.clipBottom) {
            stackIn_15_0 = var6;
          } else {
            stackIn_15_0 = SoftwareRasterizer.clipBottom;
          }
          var10 = stackIn_15_0;
          if (param2 >= SoftwareRasterizer.clipLeft &&
            param2 < SoftwareRasterizer.clipRight) {
            var11 = param2 + SoftwareRasterizer.width * var8;
            var12 = -var8 + (1 + var10) >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              SoftwareRasterizer.pixels[var11] = 16777215;
              var11 = var11 + 2 * SoftwareRasterizer.width;
            }
          }
          if (SoftwareRasterizer.clipTop <= param3 &&
            var6 < SoftwareRasterizer.clipBottom) {
            var11Lifetime1 = SoftwareRasterizer.width * param3 + var7;
            var12Lifetime1 = -var7 + (var9 + 1) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              SoftwareRasterizer.pixels[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (var5_int >= SoftwareRasterizer.clipLeft &&
            SoftwareRasterizer.clipRight > var5_int) {
            var11Lifetime2 = var5_int + SoftwareRasterizer.width * (var8 + (1 & var5_int - param2));
            var12Lifetime2 = -var8 + var10 + 1 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              SoftwareRasterizer.pixels[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + SoftwareRasterizer.width * 2;
            }
          }
          if (SoftwareRasterizer.clipTop <= param3 &&
            SoftwareRasterizer.clipBottom > var6) {
            var11Lifetime3 = var7 + (SoftwareRasterizer.width * var6 + (var6 - param3 & 1));
            var12Lifetime3 = 1 - (-var9 + var7) >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              SoftwareRasterizer.pixels[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var5), "ei.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void insertionSort(boolean param0) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        if (param0) {
          ((boolean[]) (this.elements[23]))[18] = false;
        }
        for (var2 = 1; var2 < this.size; var2++) {
          this.insertIntoSortedPrefix((byte) -108, (SortableValue) (this.elements[var2]), var2);
        }
    }

    final void removeAt(boolean param0, int param1) {
        int var4 = HoldTheLine.field_D;
        this.size = this.size - 1;
        int var3 = param1;
        if (!param0) {
          return;
        }
        while (this.size > var3) {
          this.elements[var3] = this.elements[var3 + 1];
          var3++;
        }
    }

    private final void insertIntoSortedPrefix(byte param0, SortableValue param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = HoldTheLine.field_D;
        try {
          if (param0 != -108) {
            this.elements = (Object[]) null;
          }
          for (var4_int = param2 - 1; 0 <= var4_int; var4_int--) {
            if (((SortableValue) (this.elements[var4_int])).compareTo((byte) -101, param1) < 0) {
              this.elements[1 + var4_int] = param1;
              return;
            }
            this.elements[1 + var4_int] = this.elements[var4_int];
          }
          this.elements[0] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ei.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    public GrowableObjectList() {
        this.size = 0;
        this.elements = new Object[10];
        this.capacity = 10;
    }

    private final void grow(byte param0) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        this.capacity = this.capacity + 10;
        Object[] var5 = new Object[this.capacity];
        Object[] var2 = var5;
        for (var3 = 0; var3 < this.size; var3++) {
          var5[var3] = this.elements[var3];
        }
        if (param0 < 7) {
          ((long[]) (((Object[]) (this.elements[12]))[6]))[0] = -121L;
        }
        this.elements = var2;
    }

    static {
        field_f = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
