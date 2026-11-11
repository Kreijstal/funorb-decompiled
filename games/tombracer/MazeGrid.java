/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MazeGrid {
    private int[] cells;
    int width;
    static String field_b;
    static String field_e;
    int height;
    private static String[] field_d;

    final boolean isInBounds(int param0, int param1, byte param2) {
        if (param2 != -128) {
          this.isInBounds(52, -84, (byte) -119);
          if (0 > param0) {
            return false;
          }
          if (0 > param1) {
            return false;
          }
          if (this.width <= param0) {
            return false;
          }
          if (this.height > param1) {
            return true;
          }
          return false;
        }
        if (0 > param0) {
          return false;
        }
        if (0 > param1) {
          return false;
        }
        if (this.width <= param0) {
          return false;
        }
        if (this.height > param1) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(boolean param0) {
        field_e = null;
        field_d = null;
        if (param0) {
          MazeGrid.releaseStatics(false);
          field_b = null;
          return;
        }
        field_b = null;
    }

    private final int cellIndex(byte param0, int param1, int param2) {
        if (param0 == -37) {
          return param2 + this.width * param1;
        }
        field_d = (String[]) null;
        return param2 + this.width * param1;
    }

    final void setCell(int param0, int param1, int param2, int param3) {
        this.cells[this.cellIndex((byte) -37, param0, param3)] = param1;
        if (param2 != 0) {
          field_d = (String[]) null;
        }
    }

    final int getCell(byte param0, int param1, int param2) {
        if (param0 == -5) {
          return this.cells[this.cellIndex((byte) -37, param1, param2)];
        }
        field_d = (String[]) null;
        return this.cells[this.cellIndex((byte) -37, param1, param2)];
    }

    MazeGrid(int param0, int param1, int param2) {
        int var4 = 0;
        this.cells = new int[param1 * param0];
        this.height = param1;
        this.width = param0;
        for (var4 = 0; this.cells.length > var4; var4++) {
          this.cells[var4] = param2;
        }
    }

    final static void a(QuickChatMenu param0, byte param1) {
        try {
          if (param1 < 120) {
            field_d = (String[]) null;
          }
          rua.field_gb.addChild(-127, param0);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "hj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_b = "Join";
        field_e = "You have entered another game.";
        field_d = new String[17];
        field_d[1] = "Crumbly";
        field_d[0] = "Normal";
        field_d[4] = "Target";
        field_d[11] = "Fire Spitter";
        field_d[5] = "Old Pillar";
        field_d[12] = "Dart Spitter";
        field_d[14] = "Laser head (green)";
        field_d[15] = "Laser head (white)";
        field_d[3] = "Key Lock";
        field_d[13] = "Sawblade Spitter";
        field_d[16] = "Laser head (red)";
        field_d[8] = "Face";
        field_d[2] = "Gun";
        field_d[10] = "Big Block";
        field_d[9] = "Mirror";
    }
}
