/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialWidget extends TextButton {
    int radius;
    int centerY;
    int stepCount;
    static boolean field_H;
    static QuickChatDynamicCommand quickChatCommand;
    int value;
    int centerX;
    int markerValue;
    static long field_J;
    static int field_K;

    final static void k(int param0) {
        String var2 = (String) null;
        IntValueNode.a(AgeValidator.field_o, (String) null, 63);
        if (param0 != 0) {
          DialWidget.releaseStatics(true);
        }
    }

    final static void decodeSpriteSheet(byte[] encoded, boolean guard) {
        boolean stackIn_39_1 = false;
        boolean stackIn_51_1 = false;
        String stackIn_57_2 = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = EscapeVector.obfuscationControl;
        try {
          PacketBuffer var17 = new PacketBuffer(encoded);
          PacketBuffer var18 = var17;
          var18.position = -2 + encoded.length;
          ArchiveLoadTask.spriteCount = var18.readUnsignedShort(1952);
          ModeProgress.spriteOffsetXs = new int[ArchiveLoadTask.spriteCount];
          UiContainer.spriteHasAlpha = new boolean[ArchiveLoadTask.spriteCount];
          SavedDataQuerySupport.spriteHeights = new int[ArchiveLoadTask.spriteCount];
          if (!guard) {
            byte[] var16 = (byte[]) null;
            DialWidget.decodeSpriteSheet((byte[]) null, false);
          }
          CheckboxPainter.spriteAlphas = new byte[ArchiveLoadTask.spriteCount][];
          ChatMessage.spriteOffsetYs = new int[ArchiveLoadTask.spriteCount];
          AnimatedPathMarker.spriteIndices = new byte[ArchiveLoadTask.spriteCount][];
          SpriteLoadTask.spriteWidths = new int[ArchiveLoadTask.spriteCount];
          var18.position = -(ArchiveLoadTask.spriteCount * 8) + (-7 + encoded.length);
          IntroAudioSupport.spriteSheetWidth = var18.readUnsignedShort(1952);
          DelegatingCanvas.spriteSheetHeight = var18.readUnsignedShort(1952);
          int var3 = 1 + (var18.readUnsignedByte(0) & 255);
          for (int var4 = 0; var4 < ArchiveLoadTask.spriteCount; var4++) {
            ModeProgress.spriteOffsetXs[var4] = var17.readUnsignedShort(1952);
          }
          for (int var4Lifetime1 = 0; ArchiveLoadTask.spriteCount > var4Lifetime1; var4Lifetime1++) {
            ChatMessage.spriteOffsetYs[var4Lifetime1] = var18.readUnsignedShort(1952);
          }
          for (int var4Lifetime2 = 0; var4Lifetime2 < ArchiveLoadTask.spriteCount; var4Lifetime2++) {
            SpriteLoadTask.spriteWidths[var4Lifetime2] = var18.readUnsignedShort(1952);
          }
          for (int var4Lifetime3 = 0; ArchiveLoadTask.spriteCount > var4Lifetime3; var4Lifetime3++) {
            SavedDataQuerySupport.spriteHeights[var4Lifetime3] = var18.readUnsignedShort(1952);
          }
          var18.position = -(var3 * 3) - (-3 - (encoded.length - (7 + ArchiveLoadTask.spriteCount * 8)));
          ArchiveLoadTask.spritePalette = new int[var3];
          for (int var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            ArchiveLoadTask.spritePalette[var4Lifetime4] = var18.readUnsignedMedium((byte) -124);
            if (ArchiveLoadTask.spritePalette[var4Lifetime4] == 0) {
              ArchiveLoadTask.spritePalette[var4Lifetime4] = 1;
            }
          }
          var18.position = 0;
          for (int var4Lifetime5 = 0; var4Lifetime5 < ArchiveLoadTask.spriteCount; var4Lifetime5++) {
            int var5 = SpriteLoadTask.spriteWidths[var4Lifetime5];
            int var6 = SavedDataQuerySupport.spriteHeights[var4Lifetime5];
            int var7 = var6 * var5;
            byte[] var21 = new byte[var7];
            byte[] var19 = var21;
            byte[] var8 = var19;
            AnimatedPathMarker.spriteIndices[var4Lifetime5] = var21;
            byte[] var22 = new byte[var7];
            byte[] var20 = var22;
            byte[] var9 = var20;
            CheckboxPainter.spriteAlphas[var4Lifetime5] = var22;
            boolean var10 = false;
            int var11 = var18.readUnsignedByte(0);
            if ((var11 & 1) == 0) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var18.readByte(false);
              }
              if (0 != (2 & var11)) {
                for (var12 = 0; var7 > var12; var12++) {
                  byte dupTemp$0 = var18.readByte(false);
                  var9[var12] = dupTemp$0;
                  var13 = dupTemp$0;
                  boolean stackIn_50_0 = var10;
                  stackIn_51_1 = !(var13 == -1);
                  var10 = stackIn_50_0 | stackIn_51_1;
                }
              }
            } else {
              for (var12 = 0; var12 < var5; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var13 * var5 + var12] = var18.readByte(false);
                }
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    byte dupTemp$1 = var18.readByte(false);
                    var9[var12 + var5 * var13] = dupTemp$1;
                    int var14 = dupTemp$1;
                    boolean stackIn_38_0 = var10;
                    stackIn_39_1 = !(var14 == -1);
                    var10 = stackIn_38_0 | stackIn_39_1;
                  }
                }
              }
            }
            UiContainer.spriteHasAlpha[var4Lifetime5] = (var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_56_0 = var2;
          StringBuilder stackIn_56_1 = new StringBuilder().append("eb.U(");
          if (encoded == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(guard).append(')').toString());
        }
    }

    final boolean onPointerPressed(int offsetY, int pointerX, byte guard, int pointerY, int offsetX, UiComponent root, int button) {
        String stackIn_21_2 = null;
        int var12 = EscapeVector.obfuscationControl;
        try {
          if (!super.onPointerPressed(offsetY, pointerX, guard, pointerY, offsetX, root, button)) {
            return false;
          }
          int var8_int = -offsetX - this.x - (this.centerX - pointerX);
          int var9 = -this.y + (-offsetY + (-this.centerY + pointerY));
          if (this.radius * this.radius <= var8_int * var8_int + var9 * var9) {
            return true;
          }
          double var10 = Math.atan2((double)var9, (double)var8_int) - LoginStage.field_c;
          if (0.0 > var10) {
            var10 = var10 - 3.141592653589793 / (double)this.stepCount;
          } else if (var10 > 0.0) {
            var10 = var10 + 3.141592653589793 / (double)this.stepCount;
          }
          this.value = (int)(var10 * (double)this.stepCount / 6.283185307179586);
          while (this.stepCount <= this.value) {
            this.value = this.value - this.stepCount;
          }
          while (0 > this.value) {
            this.value = this.value + this.stepCount;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var8;
          StringBuilder stackIn_20_1 = new StringBuilder().append("eb.V(").append(offsetY).append(',').append(pointerX).append(',').append(guard).append(',').append(pointerY).append(',').append(offsetX).append(',');
          if (root == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(button).append(')').toString());
        }
    }

    public static void releaseStatics(boolean guard) {
        if (!guard) {
          return;
        }
        quickChatCommand = null;
    }

    private DialWidget() throws Throwable {
        throw new Error();
    }

    static {
        quickChatCommand = new QuickChatDynamicCommand(2, 4, 4, 0);
        field_K = 0;
    }
}
