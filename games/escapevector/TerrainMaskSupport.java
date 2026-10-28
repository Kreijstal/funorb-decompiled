/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class TerrainMaskSupport {
    static Sprite field_a;
    static PcmSample field_e;
    static int[] field_b;
    static int[] field_c;
    static int[] field_d;

    final static void a(int param0) {
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (AccountPanelInputSupport.field_d != null) {
            return;
          }
          if (param0 <= 48) {
            return;
          }
          AccountPanelInputSupport.field_d = new SpriteOffset[DialWidgetPainter.field_h.length];
          for (int var1_int = 0; var1_int < DialWidgetPainter.field_h.length; var1_int++) {
            int var2 = DialWidgetPainter.field_h[var1_int];
            SpriteOffset var3 = HuffmanDecoder.field_b;
            Sprite var4 = TextWidgetPainter.a(var2, (byte) -39, 2);
            int var5 = var4.fullWidth - var3.x;
            int var6 = -var3.y + var4.fullHeight;
            SpriteOffset var7 = new SpriteOffset(var5, var6);
            AccountPanelInputSupport.field_d[var1_int] = CanvasRenderSupport.selectQuarterTurnOffset(var2, (byte) 121, var7, var3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "ka.A(" + param0 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void decodeTerrainQuadrant(int left, int quadrantCode, int bottom, int right, DataInputStream input, int[] rows, byte guard, int top) throws IOException {
        int var10 = EscapeVector.obfuscationControl;
        if (0 == quadrantCode) {
          return;
        }
        if (1 == quadrantCode) {
          int var8_int = -(1 << left) + (2 << -1 + right);
          for (int var9 = top; bottom > var9; var9++) {
            rows[var9] = MatchingTextValidator.a(rows[var9], var8_int);
          }
          return;
        }
        try {
          if (guard != -74) {
            TerrainMaskSupport.a(1);
          }
          AccountRegistrationPanel.decodeTerrainQuadrants(top, bottom, input, left, right, rows, 2147483647);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "ka.B(" + left + ',' + quadrantCode + ',' + bottom + ',' + right + ',' + (input != null ? "{...}" : "null") + ',' + (rows != null ? "{...}" : "null") + ',' + guard + ',' + top + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        field_c = null;
        field_d = null;
        int var1 = 23 % ((guard - 60) / 46);
        field_b = null;
        field_a = null;
        field_e = null;
    }

    static {
        field_b = new int[17];
        field_d = new int[17];
        field_b[2] = 500;
        field_b[14] = 4000;
        field_b[16] = 4000;
        field_d[1] = 1000;
        field_b[4] = 500;
        field_b[15] = 4000;
        field_b[0] = 1000;
        field_b[6] = 2000;
        field_b[3] = 500;
        field_b[5] = 500;
        field_b[7] = 2000;
        field_d[10] = 1000;
        field_d[11] = 1000;
        field_d[13] = 1000;
        field_d[12] = 1000;
        field_d[5] = 500;
        field_d[9] = 1000;
    }
}
