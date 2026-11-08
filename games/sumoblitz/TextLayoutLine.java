/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextLayoutLine {
    int top;
    static SpriteData[] field_c;
    int bottom;
    int[] caretX;

    final int rightEdge(int param0) {
        if (param0 != 1) {
          this.top = -39;
          if (null != this.caretX) {
            return this.caretX.length == 0 ? 0 : this.caretX[this.caretX.length - 1];
          }
          return 0;
        }
        if (null == this.caretX) {
          return 0;
        }
        if (this.caretX.length != 0) {
          return this.caretX[this.caretX.length - 1];
        }
        return 0;
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 < 68) {
          field_c = (SpriteData[]) null;
        }
    }

    final int nearestCaret(int param0, byte param1) {
        int var3 = 0;
        int var4;
        int var5;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (null == this.caretX) {
          return 0;
        }
        if (this.caretX.length == 0) {
          return 0;
        }
        var4 = 82 % ((param1 + 9) / 57);
        for (var3 = 1; this.caretX.length > var3; var3++) {
          if (param0 < (this.caretX[var3] + this.caretX[-1 + var3] >> 1)) {
            return -1 + var3;
          }
        }
        return -1 + this.caretX.length;
    }

    TextLayoutLine(int param0, int param1, int param2) {
        this.top = param0;
        this.caretX = new int[1 + param2];
        this.bottom = param1;
    }

    static {
    }
}
