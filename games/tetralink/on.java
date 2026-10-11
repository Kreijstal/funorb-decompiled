/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static String[] field_c;
    static String field_a;
    static int field_b;

    final static void a(boolean param0, boolean param1) {
        boolean decompiledFrameRemainder0 = true;
        if (param0) {
          if (0 < qd.field_ab &&
            hm.field_b) {
            ra.e(0, 0, ra.field_f, oj.field_a.field_z);
            t.field_q.a(param1, 256);
            if (ng.field_t <= 0 &&
              0 >= am.field_f) {
              return;
            }
            if (!lg.field_S) {
              return;
            }
          } else {
            if (ng.field_t > 0) {
              if (!lg.field_S) {
                return;
              }
            } else {
              if (0 >= am.field_f) {
                return;
              }
              if (!lg.field_S) {
                return;
              }
            }
          }
        } else {
          field_a = (String) null;
          if (0 >= qd.field_ab) {
            if (ng.field_t > 0) {
              if (!lg.field_S) {
                return;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (0 >= am.field_f) {
                return;
              }
              if (lg.field_S) {
                ra.e(0, 0, ra.field_f, oj.field_a.field_z);
                fj.field_b.a(param1, 256);
              }
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            if (hm.field_b) {
              ra.e(0, 0, ra.field_f, oj.field_a.field_z);
              t.field_q.a(param1, 256);
            }
            if (ng.field_t <= 0 &&
              0 >= am.field_f) {
              return;
            }
            if (!lg.field_S) {
              return;
            }
          }
        }
        ra.e(0, 0, ra.field_f, oj.field_a.field_z);
        fj.field_b.a(param1, 256);
    }

    public static void a(int param0) {
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
