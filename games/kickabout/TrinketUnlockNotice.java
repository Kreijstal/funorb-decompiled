/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class TrinketUnlockNotice implements OverlayLayer {
    static Random field_d;
    private static int field_c;
    static UiLayoutNode field_b;
    static boolean field_f;
    static String field_e;
    static byte[][] field_a;

    public final boolean capturesInput(byte param0) {
        if (param0 < 63) {
          TrinketUnlockNotice.releaseStatics((byte) 14);
          return false;
        }
        return false;
    }

    public final void paint(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (field_c != -1) {
          var2 = -AuctionsScreen.field_A + 20;
          SoftwareRasterizer.drawRoundedRectangle(-1 + var2, 19, 2 + LineupPositionSupport.field_d, 50, 10, 16777215);
          SoftwareRasterizer.fillRoundedRectangleBlended(var2, 20, LineupPositionSupport.field_d, 48, 10, 65793, 160);
          if (ArchivePreloader.field_i != null) {
            ArchivePreloader.field_i[PacketBuffer.field_e[field_c]].drawQuarterSize(var2, 28);
          }
          un.field_d.a(AvailabilityCheckRequest.field_c[field_c], var2 + 16 + 32, 49, 16777215, -1);
        }
        var2Lifetime1 = 1 / ((50 - param0) / 45);
    }

    public final boolean handleKeyTyped(int param0, int param1, char param2) {
        if (param0 != 11516) {
          field_f = false;
          return false;
        }
        return false;
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        if (param0 == 16) {
          field_d = null;
          field_a = (byte[][]) null;
          field_b = null;
          return;
        }
        TrinketUnlockNotice.releaseStatics((byte) -17);
        field_d = null;
        field_a = (byte[][]) null;
        field_b = null;
    }

    public final void update(int param0, boolean param1) {
        int var3;
        int var4;
        IntValueNode var5;
        var4 = Kickabout.field_G;
        if (0 != TextLine.field_f) {
          TextLine.field_f = TextLine.field_f - 1;
          if (TextLine.field_f < 16) {
            var3 = 16 - TextLine.field_f;
            AuctionsScreen.field_A = var3 * (LineupPositionSupport.field_d + 20) * var3 >> 8;
          } else {
            if (!(319 >= TextLine.field_f)) {
              var3 = -319 + TextLine.field_f;
              AuctionsScreen.field_A = var3 * ((LineupPositionSupport.field_d + 20) * var3) >> 8;
            }
          }
        } else {
          if (-1 != field_c) {
            field_c = -1;
          }
          var5 = (IntValueNode) (LoginText.field_f.removeFirst((byte) -36));
          if (var5 != null) {
            field_c = var5.field_j;
            TextLine.field_f = 335;
            LineupPositionSupport.field_d = un.field_d.a(AvailabilityCheckRequest.field_c[field_c]) + 56;
            AuctionsScreen.field_A = 20 + LineupPositionSupport.field_d;
            if (param0 == -25) {
              return;
            }
            field_d = (Random) null;
            return;
          }
        }
        if (param0 == -25) {
          return;
        }
        field_d = (Random) null;
    }

    static {
        field_c = -1;
        field_d = new Random();
        field_e = "Loading extra data (2/2)";
    }
}
