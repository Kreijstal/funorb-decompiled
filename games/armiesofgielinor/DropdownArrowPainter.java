/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DropdownArrowPainter implements WidgetPainter {
    static int field_b;
    static boolean field_a;
    static String[] field_c;

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          ds.field_a = new RgbSprite[op.field_c[0].length];
          if (param0) {
            field_a = true;
          }
          GameCanvas.field_c = new RgbSprite[op.field_c[0].length];
          ConsoleTextNode.pushRasterState((byte) -56);
          for (var1_int = 0; var1_int < op.field_c[0].length; var1_int++) {
            ds.field_a[var1_int] = new RgbSprite(DiskCacheWorker.field_d.pixelWidth, DiskCacheWorker.field_d.pixelHeight);
            GameCanvas.field_c[var1_int] = new RgbSprite(ClientUiNode.field_y.pixelWidth, ClientUiNode.field_y.pixelHeight);
            ds.field_a[var1_int].b();
            DiskCacheWorker.field_d.d(0, 0, op.field_c[0][var1_int]);
            GameCanvas.field_c[var1_int].b();
            ClientUiNode.field_y.b(0, 0, op.field_c[0][var1_int]);
          }
          QuickChatPhraseRepository.popRasterState(-18862);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "gs.F(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = EmailValidator.outgoingPacket;
        var2.writeCipheredOpcode(32161, param0);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.writeByte(1, 2);
        var2.writeBytes(CoatOfArms.field_d, 0, CoatOfArms.field_d.length, 113);
        var2.writeByte(1, DiskCacheRequest.field_E);
        var2.writeByte(1, AiPlanningStrategy.field_b);
        var2.writeBytes(ClientContextMenu.field_d, 0, ClientContextMenu.field_d.length, -72);
        if (param1 != -8006) {
          field_b = -111;
        }
        var2.writeByteLengthPrefix(-var3 + var2.position, 5930);
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          TriangleRasterizer.useRasterClip();
          KeyboardInputListener.field_a = new int[260];
          EditableTextWidget.field_M = 11;
          var1_int = 0;
          var2 = -93 / ((-68 - param0) / 57);
          while (256 > var1_int) {
            var3 = 15.0;
            KeyboardInputListener.field_a[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var3) * 255.0);
            var1_int++;
          }
          var6 = 256;
          var1_intLifetime1 = var6;
          while (var6 < KeyboardInputListener.field_a.length) {
            KeyboardInputListener.field_a[var6] = 255;
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "gs.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        int var1 = -29 / ((13 - param0) / 56);
        field_c = null;
    }

    final static BinaryBitmapFont a(String param0, ResourceArchive param1, ResourceArchive param2, byte param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        BinaryBitmapFont stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param1.getGroupId(param0, 106);
          var6 = param1.getFileId((byte) -65, var5_int, param4);
          if (param3 != -53) {
            field_a = true;
          }
          stackIn_3_0 = cc.a(param1, var5_int, param2, true, var6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("gs.G(");
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void paintWidget(Widget widget, int originX, int obfuscationGuard, boolean renderFlag, int originY) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          for (var6_int = 0; var6_int <= widget.height; var6_int++) {
            var7 = 152 + var6_int * 48 / widget.height;
            var8 = var7 | (var7 << 16 | var7 << 8);
            SoftwareRaster.e(widget.x + originX, var6_int + originY + widget.y, widget.width, var8);
          }
          var6_intLifetime1 = 1;
          if (obfuscationGuard > -79) {
            var11 = (int[]) null;
            DropdownArrowPainter.pollIncomingPacket((byte) -58, (int[]) null);
          }
          while (5 >= var6_intLifetime1) {
            var7Lifetime1 = var6_intLifetime1 + (-5 + (originX + widget.x)) + (widget.width - (widget.width >> 1));
            var8Lifetime1 = -(var6_intLifetime1 * 2) + (widget.width >> 1);
            var9 = var6_intLifetime1 + (originY + (widget.y + (-4 + widget.height >> 1)));
            if (var9 >= SoftwareRaster.clipTop &&
              SoftwareRaster.clipBottom > var9) {
              if (SoftwareRaster.clipLeft < var7Lifetime1) {
                SoftwareRaster.pixels[var9 * SoftwareRaster.width - (-var7Lifetime1 + 1)] = rn.bitwiseAnd(SoftwareRaster.pixels[-1 + (var7Lifetime1 + SoftwareRaster.width * var9)], 16711422) >> 1;
              }
              if (var8Lifetime1 + var7Lifetime1 < SoftwareRaster.clipRight) {
                SoftwareRaster.pixels[SoftwareRaster.width * var9 + (var7Lifetime1 + var8Lifetime1)] = rn.bitwiseAnd(16711422, SoftwareRaster.pixels[SoftwareRaster.width * var9 + var7Lifetime1 + var8Lifetime1]) >> 1;
              }
            }
            SoftwareRaster.e(var7Lifetime1, var9, var8Lifetime1, 0);
            var6_intLifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("gs.C(");
          if (widget == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(originX).append(',').append(obfuscationGuard).append(',').append(renderFlag).append(',').append(originY).append(')').toString());
        }
    }

    final static boolean pollIncomingPacket(byte obfuscationGuard, int[] opcodePayloadLengths) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        DelayedPacket var4_ref_qu = null;
        int var4 = 0;
        DelayedPacket var5 = null;
        int var7 = 0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 42) {
            return false;
          }
          if (ov.connectionState != ResourceArchive.connectedState) {
            return false;
          }
          var2_long = vi.monotonicMillis(126);
          if (HuffmanCodec.packetDelayMillis != 0 &&
            0 > ByteStorage.pendingOpcode) {
            var4_ref_qu = (DelayedPacket) (AnimationPlayer.delayedPackets.first((byte) 127));
            if (var4_ref_qu != null &&
              var2_long > var4_ref_qu.releaseAtMillis) {
              var4_ref_qu.unlink(-111);
              fk.packetPayloadLength = var4_ref_qu.payload.length;
              ByteStorage.incomingPacket.position = 0;
              for (var5_int = 0; fk.packetPayloadLength > var5_int; var5_int++) {
                ByteStorage.incomingPacket.payload[var5_int] = var4_ref_qu.payload[var5_int];
              }
              QuickChatCommandDefinition.thirdPreviousOpcode = PrintCoatConsoleCommand.secondPreviousOpcode;
              PrintCoatConsoleCommand.secondPreviousOpcode = TurnTimerDial.previousOpcode;
              TurnTimerDial.previousOpcode = MusicCrossfadeStream.deliveredOpcode;
              MusicCrossfadeStream.deliveredOpcode = var4_ref_qu.opcode;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_45_0 = var2;
          stackIn_45_1 = new StringBuilder().append("gs.A(").append(obfuscationGuard).append(',');
          if (opcodePayloadLengths == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
        stackIn_22_0 = ByteStorage.pendingOpcode;
        try {
          while (true) {
            if (stackIn_22_0 < 0) {
              ByteStorage.incomingPacket.position = 0;
              if (!ConsoleTokenCursor.receivePacketBytes(obfuscationGuard ^ -83, 1)) {
                return false;
              }
              ByteStorage.pendingOpcode = ByteStorage.incomingPacket.readCipheredOpcode(255);
              ByteStorage.incomingPacket.position = 0;
              fk.packetPayloadLength = opcodePayloadLengths[ByteStorage.pendingOpcode];
            }
            if (!AgeValidator.isPacketPayloadReady(2)) {
              return false;
            }
            if (HuffmanCodec.packetDelayMillis == 0) {
              QuickChatCommandDefinition.thirdPreviousOpcode = PrintCoatConsoleCommand.secondPreviousOpcode;
              PrintCoatConsoleCommand.secondPreviousOpcode = TurnTimerDial.previousOpcode;
              TurnTimerDial.previousOpcode = MusicCrossfadeStream.deliveredOpcode;
              MusicCrossfadeStream.deliveredOpcode = ByteStorage.pendingOpcode;
              ByteStorage.pendingOpcode = -1;
              return true;
            }
            var4 = HuffmanCodec.packetDelayMillis;
            if (0.0 != DualNodeIterator.packetJitterMillis) {
              var4 = (int)((double)var4 + CampaignMenuButton.connectionRandom.nextGaussian() * DualNodeIterator.packetJitterMillis);
              if (0 > var4) {
                var4 = 0;
              }
            }
            var5 = new DelayedPacket(var2_long + (long)var4, ByteStorage.pendingOpcode, new byte[fk.packetPayloadLength]);
            for (var6 = 0; var6 < fk.packetPayloadLength; var6++) {
              var5.payload[var6] = ByteStorage.incomingPacket.payload[var6];
            }
            AnimationPlayer.delayedPackets.addLast((byte) -119, (IntrusiveNode) (var5));
            ByteStorage.pendingOpcode = -1;
            stackIn_22_0 = ByteStorage.pendingOpcode;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_45_0 = var2;
          stackIn_45_1 = new StringBuilder().append("gs.A(").append(obfuscationGuard).append(',');
          if (opcodePayloadLengths == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    static {
        field_a = true;
        field_c = new String[]{"This unit is not carrying any equipment.", "This unit is carrying a flag. As such, it is able to capture a single structure.", "This unit is carrying a grappling hook, enabling it attack flying units.", "This unit is wearing waders, allowing it to better traverse rivers and swamps.", "This unit is wearing boots of Elidinis, allowing it to travel very quickly over water.", "This unit is carrying a ring of life, allowing it to respawn at the nearest unoccupied allied structure when it dies."};
        field_b = 0;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
