/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class za extends IntrusiveNode {
    protected za() {
    }

    final static boolean a(byte param0, char param1) {
        if (param0 != 117) {
          za.a((byte) -61, '￑');
          if (160 == param1) {
            return true;
          }
          if (param1 == 32) {
            return true;
          }
          if (param1 == 95) {
            return true;
          }
          if (45 != param1) {
            return false;
          }
          return true;
        }
        if (160 == param1) {
          return true;
        }
        if (param1 == 32) {
          return true;
        }
        if (param1 == 95) {
          return true;
        }
        if (45 != param1) {
          return false;
        }
        return true;
    }

    final static void registerMenuLayout(int rowSpacing, int[] actions, int top, int left, int screenId, int right, byte obfuscationGuard) {
        try {
          ua.menuActions[screenId] = actions;
          dt.menuLeft[screenId] = left;
          int var7_int = -99 % ((24 - obfuscationGuard) / 63);
          ClientException.menuRight[screenId] = right;
          bk.menuTop[screenId] = top;
          oo.menuRowSpacing[screenId] = rowSpacing;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "za.B(" + rowSpacing + ',' + (actions != null ? "{...}" : "null") + ',' + top + ',' + left + ',' + screenId + ',' + right + ',' + obfuscationGuard + ')');
        }
    }

    static {
    }
}
