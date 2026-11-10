/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class TextLayoutLine {
    int field_g;
    int[] field_e;
    static String field_d;
    static String field_f;
    static ClientProtocolStage field_a;
    int field_b;
    static PcmSampleStream field_c;

    final int width(int param0) {
        int var2;
        int stackIn_5_0 = 0;
        var2 = -58 / ((10 - param0) / 54);
        if (this.field_e != null &&
          this.field_e.length != 0) {
          stackIn_5_0 = this.field_e[this.field_e.length - 1];
        } else {
          stackIn_5_0 = 0;
        }
        return stackIn_5_0;
    }

    final static void drawLegacyMenuWithFrame(byte param0) {
        int var1 = MusicPatch.getLegacyMenuWidth((byte) 78);
        int var3 = 109 % ((param0 - 9) / 62);
        int var2 = CacheEntry.getLegacyMenuHeight(true);
        DimensionOnlyResizer.field_b.drawFrame(var1 + (MainMenuScreen.field_o << 1), MarkerSliderPainter.field_k - MarkerSliderPainter.field_d, DropdownArrowPainter.field_c - MainMenuScreen.field_o, (byte) -128, (MarkerSliderPainter.field_d << 1) + var2);
        LoginCredentials.drawMenuItems(-67);
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != 15) {
          return;
        }
        field_c = null;
        field_d = null;
    }

    final static void sendQueuedByteRecord(int param0, int param1, QueuedByteRecord param2) {
        BitPacketBuffer var3 = LinkTextPainter.field_e;
        if (param1 != -19004) {
          return;
        }
        try {
          var3.writeCipheredByte(11, param0);
          var3.writeByte(param2.field_h, 70);
          var3.writeByte(param2.field_i, param1 + 19119);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "oe.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void createMenuBackgroundActors(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = ZombieDawn.field_J;
        try {
          DraggableWidget.field_L = new MenuBackgroundActor[15];
          DraggableWidget.field_L[0] = new MenuBackgroundActor(WorldObject.field_w, 0, 0);
          var1_int = GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 50, 1) + 30;
          var2 = 1;
          for (var3 = param0; 15 > var3; var3++) {
            DraggableWidget.field_L[var3] = new MenuBackgroundActor(DisplayState.field_a, var2, var1_int);
            var1_int = var1_int + (GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 100, param0 ^ 0) + 75);
            if (var3 == 7) {
              var2 = 2;
              var1_int = GooPuddleCell.nextBoundedInt(SpriteEffectHelpers.random, 10, param0 + 0);
            }
          }
          MusicPatchPcmStream.resetBackdropActors(param0 ^ -63);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "oe.C(" + param0 + ')');
        }
    }

    final static void acceptChatMessage(int param0, ChatMessage param1) {
        int var2_int = 0;
        ChatMessage var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ZombieDawn.field_J;
        try {
          if (null == param1.field_k) {
            return;
          }
          if (param1.field_i != 0 ||
            param1.field_b != 0) {
            for (var2_int = 0; var2_int < EditableTextWidget.field_E; var2_int++) {
              var3 = PowerupCard.field_m[var2_int];
              if (var3.field_j == 2 &&
                var3.field_i == param1.field_i &&
                param1.field_b == var3.field_b) {
                return;
              }
            }
          }
          if (null != param1.field_e) {
          }
          if (param0 != 0) {
            field_c = (PcmSampleStream) null;
          }
          ArchivePreloader.appendChatHistory((byte) -126, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("oe.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final int nearestCharacterIndex(int param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = ZombieDawn.field_J;
        if (param1 != 0) {
          TextLayoutLine.drawLegacyMenuWithFrame((byte) -32);
        }
        if (this.field_e != null &&
          this.field_e.length != 0) {
          for (var3 = 1; this.field_e.length > var3; var3++) {
            if ((this.field_e[var3] + this.field_e[-1 + var3] >> 1) > param0) {
              return -1 + var3;
            }
          }
          return this.field_e.length - 1;
        }
        return 0;
    }

    TextLayoutLine(int param0, int param1, int param2) {
        this.field_b = param0;
        this.field_e = new int[param2 + 1];
        this.field_g = param1;
    }

    static {
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_f = "Next";
        field_a = new ClientProtocolStage();
    }
}
