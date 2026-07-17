/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on {
    static String[] field_c;
    static String field_a;
    static int field_b;

    final static void a(boolean param0, boolean param1) {
        if (0 < qd.field_ab) {
          if (hm.field_b) {
            ra.e(0, 0, ra.field_f, oj.field_a.field_z);
            t.field_q.a(param1, 256);
            if (ng.field_t > 0) {
              if (!lg.field_S) {
                return;
              } else {
                ra.e(0, 0, ra.field_f, oj.field_a.field_z);
                fj.field_b.a(param1, 256);
                return;
              }
            } else {
              if (0 < am.field_f) {
                if (lg.field_S) {
                  ra.e(0, 0, ra.field_f, oj.field_a.field_z);
                  fj.field_b.a(param1, 256);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (ng.field_t > 0) {
              if (!lg.field_S) {
                return;
              } else {
                ra.e(0, 0, ra.field_f, oj.field_a.field_z);
                fj.field_b.a(param1, 256);
                return;
              }
            } else {
              if (0 < am.field_f) {
                if (lg.field_S) {
                  ra.e(0, 0, ra.field_f, oj.field_a.field_z);
                  fj.field_b.a(param1, 256);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          if (ng.field_t > 0) {
            if (lg.field_S) {
              ra.e(0, 0, ra.field_f, oj.field_a.field_z);
              fj.field_b.a(param1, 256);
              return;
            } else {
              return;
            }
          } else {
            if (0 < am.field_f) {
              if (lg.field_S) {
                ra.e(0, 0, ra.field_f, oj.field_a.field_z);
                fj.field_b.a(param1, 256);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    public static void a() {
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[]{"Players take turns to place counters in the grid, which then fall to the bottom-most empty cell. To win, connect four counters of your colour together - vertically, horizontally or diagonally - before your opponent.<br> If the grid is filled before either player wins, the game is a draw.", "Click on a column to place a counter there - the place the piece will occupy is highlighted.<br>To move around the board, use the arrow keys, the controls at the bottom-right corner of the screen, or hold down the right mouse button and move the mouse. The circle control will reset to the default view."};
        field_a = "Waiting for models";
    }
}
