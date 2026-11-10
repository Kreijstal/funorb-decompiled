/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelegatingCanvas extends java.awt.Canvas {
    static int[] field_c;
    static boolean field_f;
    private java.awt.Component field_a;
    static IntrusiveDeque field_e;
    static IntrusiveDeque field_d;
    static int field_b;

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "rm.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          field_f = false;
        }
        field_e = null;
        field_c = null;
        field_d = null;
    }

    final static void writeHighscoreSubmission(byte param0, int param1, PendingRecordRequest param2) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        BitPacketBuffer var7 = LinkTextPainter.field_e;
        BitPacketBuffer var8 = var7;
        var8.writeCipheredByte(11, param1);
        var8.position = var8.position + 1;
        int var4 = var8.position;
        var8.writeByte(1, 100);
        var8.writeShort(param2.field_i, (byte) 105);
        var8.writeShort(param2.field_o, (byte) 105);
        var8.writeShort(param2.field_n, (byte) 105);
        var8.writeInt(104, param2.field_q);
        var8.writeInt(-124, param2.field_m);
        var8.writeInt(-118, param2.field_l);
        if (param0 >= -47) {
          return;
        }
        try {
          var8.writeInt(40, param2.field_t);
          var8.writeByte(param2.field_k.length, 87);
          for (var5 = 0; var5 < param2.field_k.length; var5++) {
            var7.writeInt(30, param2.field_k[var5]);
          }
          var8.writeCrc32(-123, var4);
          var8.writeLengthPrefixByte(50, -var4 + var8.position);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "rm.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int floorDivide(int param0, int param1, boolean param2) {
        if (param2) {
          PendingRecordRequest var4 = (PendingRecordRequest) null;
          DelegatingCanvas.writeHighscoreSubmission((byte) -68, 88, (PendingRecordRequest) null);
        }
        int var3 = param1 >>> 31;
        return (var3 + param1) / param0 - var3;
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_a.update(param0);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "rm.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean drawModalOverlays(boolean param0) {
        int var1;
        int var3;
        int stackIn_11_0 = 0;
        boolean stackIn_12_1 = false;
        int var2;
        var3 = ZombieDawn.field_J;
        var1 = param0 ? 1 : 0;
        if (ArmySoldier.hasActiveDialog((byte) -80)) {
          GameWorld.drawDialogOverlay((byte) 120);
          var1 = 1;
        } else {
          if (!NodeHashTable.isLegacyMenuOpen(false)) {
            if (AreaSelectionScreen.isDimOverlayShown(50)) {
              Rasterizer.halveBrightnessRectangle(0, 0, Rasterizer.width, Rasterizer.height);
              TextLayoutLine.drawLegacyMenuWithFrame((byte) -116);
              var1 = 1;
            }
          } else {
            NameAvailabilityValidator.drawLegacyMenuWithFrame(-160793343);
            var1 = 1;
          }
        }
        if (LoginPayloadKind.startRequestTimeout(15000) &&
          !NodeHashTable.isLegacyMenuOpen(false)) {
          stackIn_11_0 = 80;
          if (DisplayState.field_b != null) {
            stackIn_12_1 = true;
          } else {
            stackIn_12_1 = RankingRowHelpers.field_c;
          }
          QuickChatPhraseDefinition.drawDimmedOverlayAt(stackIn_11_0, stackIn_12_1);
          var1 = 1;
        }
        if (DelayedPacket.isDisplayModeChangePending(2)) {
          var2 = (TickClock.field_b - 1 << 8) / 16;
          if (var2 > 0) {
            Rasterizer.fillRectangleBlended(0, 0, Rasterizer.width, Rasterizer.height, 0, var2);
            var1 = 1;
          }
        }
        return var1 != 0;
    }

    DelegatingCanvas(java.awt.Component param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "rm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new int[8192];
        field_f = false;
        field_e = new IntrusiveDeque();
        field_d = new IntrusiveDeque();
    }
}
