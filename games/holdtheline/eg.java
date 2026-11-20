/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static int field_a;
    static int field_b;
    static Sprite field_c;

    final static void a(int param0, int param1, boolean param2, IsaacPacketBuffer param3) {
        RuntimeException runtimeException = null;
        NineSlicePanel var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 0 ||
            param0 > (1 << param1) - 1) {
            param0 = -1 + (1 << param1);
          }
          if (!param2) {
            var5 = (NineSlicePanel) null;
            eg.a(-5, 79, 39, -52, -128, -44, 49, -52, 86, (BitmapFont) null, (BitmapFont) null, -67, (NineSlicePanel) null, -60, -43, 119, (NineSlicePanel) null, 123, 73, -126, (NineSlicePanel) null);
          }
          param3.writeBits(73, param1, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("eg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 32395) {
          eg.clearSharedReferences(-113);
        }
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, BitmapFont param9, BitmapFont param10, int param11, NineSlicePanel param12, int param13, int param14, int param15, NineSlicePanel param16, int param17, int param18, int param19, NineSlicePanel param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          WhirlpoolHasher.a(param10, param9, (byte) -112, param2);
          StraightRoadSegment.setUiFontMetrics(param3, param7, param17, param0, (byte) -96);
          WhirlpoolHasher.a(-76, param15, param13);
          ArchiveLoadStage.a(param18, param12, param16, 19362, param8, param14);
          MenuSelectionController.a(param1, param20, param4, 0);
          AchievementUnlockRequest.a(14893, param6, param19, param5);
          if (param11 != 2) {
            field_b = 37;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("eg.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param10 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',');
          if (param20 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        int var1;
        Sprite var2;
        int var3;
        IsaacPacketBuffer var4;
        Sprite var5;
        Sprite var6;
        var3 = HoldTheLine.field_D;
        var1 = 128;
        if (0 == ByteStorage.field_b ||
          ByteStorage.field_b == 1 ||
          ByteStorage.field_b == -1) {
          var1 = 256;
        }
        if (var1 > UiTheme.field_o) {
          UiTheme.field_o = UiTheme.field_o + 2;
          if (var1 < UiTheme.field_o) {
            UiTheme.field_o = var1;
          }
        } else {
          if (var1 < UiTheme.field_o) {
            UiTheme.field_o = UiTheme.field_o - 2;
            if (UiTheme.field_o < var1) {
              UiTheme.field_o = var1;
            }
          }
        }
        if (BufferedRandomAccessFile.field_d == 1) {
          SecondaryNodeDequeIterator.a(0);
          if (UiTheme.field_o != 256) {
            if (UiTheme.field_o == 128) {
              SoftwareRasterizer.darkenRectangleHalf(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
            } else {
              ue.a(8911, UiTheme.field_o);
            }
          }
          if (ma.field_k != 1) {
            var6 = o.a(ma.field_k, 2);
            if (var6 != null) {
              var6.drawAlpha(0, 0, (MouseInputHandler.field_c << 8) / 80);
            }
          }
        } else {
          if (ma.field_k == 1) {
            SecondaryNodeDequeIterator.a(0);
            if (UiTheme.field_o != 256) {
              if (UiTheme.field_o != 128) {
                ue.a(8911, UiTheme.field_o);
                var2 = o.a(BufferedRandomAccessFile.field_d, 2);
                var2.drawAlpha(0, 0, 256 - (MouseInputHandler.field_c << 8) / 80);
              } else {
                SoftwareRasterizer.darkenRectangleHalf(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
                var2 = o.a(BufferedRandomAccessFile.field_d, 2);
                var2.drawAlpha(0, 0, 256 - (MouseInputHandler.field_c << 8) / 80);
              }
            } else {
              var2 = o.a(BufferedRandomAccessFile.field_d, 2);
              var2.drawAlpha(0, 0, 256 - (MouseInputHandler.field_c << 8) / 80);
            }
          } else {
            o.a(BufferedRandomAccessFile.field_d, 2).drawUnkeyed(0, 0);
            if (BufferedRandomAccessFile.field_d != ma.field_k) {
              var5 = o.a(ma.field_k, 2);
              if (var5 != null) {
                var5.drawAlpha(0, 0, (MouseInputHandler.field_c << 8) / 80);
              }
            }
          }
        }
        if (param0) {
          var4 = (IsaacPacketBuffer) null;
          eg.a(60, -46, true, (IsaacPacketBuffer) null);
        }
    }

    final static IndexedSprite[] b(boolean param0) {
        int var2 = 0;
        int var3 = HoldTheLine.field_D;
        IndexedSprite[] var1 = new IndexedSprite[NineSlicePanel.field_d];
        for (var2 = 0; var2 < NineSlicePanel.field_d; var2++) {
          var1[var2] = new IndexedSprite(bo.field_b, AchievementUnlockRequest.field_o, DirectByteStorage.field_j[var2], Vector2i.field_g[var2], EditableTextField.field_K[var2], ad.field_d[var2], IterableSecondaryNodeDeque.field_e[var2], StraightRoadSegment.field_E);
        }
        tk.clearDecodedSpriteSheet(param0);
        if (param0) {
          NineSlicePanel var4 = (NineSlicePanel) null;
          eg.a(-72, -10, 111, 19, -41, -54, -99, -123, -100, (BitmapFont) null, (BitmapFont) null, -127, (NineSlicePanel) null, 71, 19, 60, (NineSlicePanel) null, -44, 42, -10, (NineSlicePanel) null);
        }
        return var1;
    }

    static {
    }
}
