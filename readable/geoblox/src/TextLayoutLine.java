/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextLayoutLine {
    static int[] meshModelTransform;
    static int interfaceTextArchiveId;
    int topY;
    static float introTintRedDelta;
    int bottomY;
    int[] caretX;

    final int getLineEndX(int methodGuard) {
        if (methodGuard != 0) {
            meshModelTransform = (int[]) null;
            if (this.caretX == null) {
                return 0;
            }
            if (0 != this.caretX.length) {
                return this.caretX[-1 + this.caretX.length];
            }
            return 0;
        }
        if (this.caretX == null) {
            return 0;
        }
        if (0 != this.caretX.length) {
            return this.caretX[-1 + this.caretX.length];
        }
        return 0;
    }

    final int findNearestCaretIndex(int methodGuard, int x) {
        int caretIndexOrGuardQuotient;
        int clientControlFlowSnapshot;
        int unusedCaretGuardQuotient;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        if (null == this.caretX) {
          return 0;
        }
        if (this.caretX.length == 0) {
          return 0;
        }
        for (caretIndexOrGuardQuotient = 1; this.caretX.length > caretIndexOrGuardQuotient; caretIndexOrGuardQuotient++) {
          if (this.caretX[caretIndexOrGuardQuotient] + this.caretX[-1 + caretIndexOrGuardQuotient] >> 1 > x) {
            return caretIndexOrGuardQuotient - 1;
          }
        }
        unusedCaretGuardQuotient = 35 / ((methodGuard + 9) / 51);
        return this.caretX.length - 1;
    }

    public static void releaseStaticReferences(byte methodGuard) {
        if (methodGuard != 0) {
            TextLayoutLine.releaseStaticReferences((byte) 43);
            meshModelTransform = null;
            return;
        }
        meshModelTransform = null;
    }

    TextLayoutLine(int topY, int bottomY, int characterCount) {
        this.topY = topY;
        this.caretX = new int[1 + characterCount];
        this.bottomY = bottomY;
    }

    static {
    }
}
