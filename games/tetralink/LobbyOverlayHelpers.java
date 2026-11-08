/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyOverlayHelpers {
    static String[] field_c;
    static String field_a;
    static int field_b;

    final static void drawLobbyOverlays(boolean param0, boolean param1) {
        boolean decompiledFrameRemainder0 = true;
        if (param0) {
          if (0 < DialWidget.field_ab &&
            LoginCredentials.field_b) {
            SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.field_f, IsaacCipher.field_a.field_z);
            ArchiveIndex.field_q.drawFullScreen(param1, 256);
            if (MusicPatch.field_t <= 0 &&
              0 >= MiscTextGlobals.field_f) {
              return;
            }
            if (!StripedProgressBar.field_S) {
              return;
            }
          } else {
            if (MusicPatch.field_t > 0) {
              if (!StripedProgressBar.field_S) {
                return;
              }
            } else {
              if (0 >= MiscTextGlobals.field_f) {
                return;
              }
              if (!StripedProgressBar.field_S) {
                return;
              }
            }
          }
        } else {
          field_a = (String) null;
          if (0 >= DialWidget.field_ab) {
            if (MusicPatch.field_t > 0) {
              if (!StripedProgressBar.field_S) {
                return;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (0 >= MiscTextGlobals.field_f) {
                return;
              }
              if (StripedProgressBar.field_S) {
                SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.field_f, IsaacCipher.field_a.field_z);
                ChatMessage.field_b.drawFullScreen(param1, 256);
              }
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            if (LoginCredentials.field_b) {
              SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.field_f, IsaacCipher.field_a.field_z);
              ArchiveIndex.field_q.drawFullScreen(param1, 256);
            }
            if (MusicPatch.field_t <= 0 &&
              0 >= MiscTextGlobals.field_f) {
              return;
            }
            if (!StripedProgressBar.field_S) {
              return;
            }
          }
        }
        SoftwareRasterizer.darkenRectangle(0, 0, SoftwareRasterizer.field_f, IsaacCipher.field_a.field_z);
        ChatMessage.field_b.drawFullScreen(param1, 256);
    }

    public static void releaseStatics(int param0) {
        if (param0 != -10457) {
          return;
        }
        field_a = null;
        field_c = null;
    }

    static {
        field_c = new String[]{"Players take turns to place counters in the grid, which then fall to the bottom-most empty cell. To win, connect four counters of your colour together - vertically, horizontally or diagonally - before your opponent.<br> If the grid is filled before either player wins, the game is a draw.", "Click on a column to place a counter there - the place the piece will occupy is highlighted.<br>To move around the board, use the arrow keys, the controls at the bottom-right corner of the screen, or hold down the right mouse button and move the mouse. The circle control will reset to the default view."};
        field_a = "Waiting for models";
    }
}
