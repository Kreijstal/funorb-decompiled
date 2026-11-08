/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GzipDecompressor {
    static UiComponent field_d;
    static int[] field_b;
    private java.util.zip.Inflater field_f;
    static boolean field_c;
    static String field_e;
    static AnimationSequence field_a;
    static BinaryBitmapFont field_g;

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        field_d = null;
        field_g = null;
        if (param0 != 57) {
          field_g = (BinaryBitmapFont) null;
        }
    }

    final static void stepMusicVolumeUp(byte param0) {
        int var1 = 0;
        if (FontAndFrameStyleHelpers.field_a >= 224) {
          NineSliceFrame.setMusicVolume(256, 51);
        } else {
          var1 = FontAndFrameStyleHelpers.field_a % 32;
          NineSliceFrame.setMusicVolume(32 + FontAndFrameStyleHelpers.field_a - var1, param0 - 27);
        }
        if (param0 == 127) {
          return;
        }
        field_g = (BinaryBitmapFont) null;
    }

    final static MusicPatch loadInstrumentPatch(boolean param0, int param1, Archive param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        MusicPatch stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        MusicPatch stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param2.getFlatFile(0, param1);
          var3 = var4;
          if (!param0) {
            stackIn_2_0 = (MusicPatch) null;
            return stackIn_2_0;
          }
          if (var4 != null) {
            stackIn_7_0 = new MusicPatch(var4);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (MusicPatch) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("go.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void closeQuickChatMenu(byte param0) {
        TextLayout.field_a = false;
        if (null != AlternateLongAndTextCredentials.field_o) {
          AlternateLongAndTextCredentials.field_o.resetSelection(20424);
        }
        if (0 != SecondaryNodeDequeIterator.field_d) {
          TextLayout.resetChatInput(-77);
        }
        DebouncedValidator.field_e = 0;
        if (param0 == 42) {
          return;
        }
        Archive var2 = (Archive) null;
        GzipDecompressor.loadInstrumentPatch(false, 4, (Archive) null);
    }

    final static void showMessageDialogText(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
          MarkerSliderPainter.field_e.field_jb = param1;
          LoginCredentials.field_b = true;
          var2_int = WidgetContainer.field_O.field_h;
          var3 = WidgetContainer.field_O.field_j;
          if (param0 != -105) {
            field_e = (String) null;
          }
          var4 = MarkerSliderPainter.field_e.field_Ib.paragraphHeight(param1, 272, MarkerSliderPainter.field_e.field_Q);
          var5 = -(var4 / 2) + 7 + var3 / 2 - 110;
          ArchiveIndex.field_q.setBounds((byte) -117, 320, var5, -(2 * var5) - 120 + var3, (-320 + var2_int) / 2);
          ArchiveIndex.field_q.field_Eb = Archive.buildNineSliceSprites(2105376, 3, 8421504, param0 ^ -121, 11579568, ArchiveIndex.field_q.field_R);
          MarkerSliderPainter.field_e.setBounds((byte) -92, -48 + ArchiveIndex.field_q.field_Hb, 16, -24 + ArchiveIndex.field_q.field_R - 20, 24);
          DelegatingCanvas.field_a.setBounds((byte) -124, 80, -20 + (ArchiveIndex.field_q.field_R - 24), 24, 120);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "go.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void decompress(byte param0, byte[] param1, PacketBuffer param2) {
        try {
          try {
            if (param2.payload[param2.position] != 31 ||
              param2.payload[1 + param2.position] != -117) {
              throw new RuntimeException("");
            }
            if (null == this.field_f) {
              this.field_f = new java.util.zip.Inflater(true);
            }
            try {
              if (param0 < 70) {
                field_g = (BinaryBitmapFont) null;
              }
              this.field_f.setInput(param2.payload, param2.position + 10, -10 - param2.position + (-8 + param2.payload.length));
              this.field_f.inflate(param1);
            } catch (Exception exception) {
              this.field_f.reset();
              throw new RuntimeException("");
            }
            this.field_f.reset();
          } catch (RuntimeException runtimeException) {
            throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "go.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private GzipDecompressor(int param0, int param1, int param2) {
    }

    public GzipDecompressor() {
        this(-1, 1000000, 1000000);
    }

    static {
        field_e = "Invite";
    }
}
