/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static String field_a;
    static int[][][][][] field_c;
    static long field_b;

    public static void a(int param0) {
        field_c = (int[][][][][]) null;
        field_a = null;
        if (param0 != 31349) {
          field_a = (String) null;
        }
    }

    final static boolean a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        if (WeightedLruCache.a(false)) {
          TextFieldValidator.a(param5, param3, 14686, param0);
          if (TextButton.field_v != null &&
            TextButton.field_v.a(param3, param1 - 52, param4, param2, param5)) {
            param3 = false;
            MusicPatchNode.b(98);
          }
          DualLinkDequeIterator.a(param1 - 6, param5, param3);
          TrinketIcon.a(param3, param6, true);
          param3 = false;
        }
        if (param1 == 50) {
          return param3;
        }
        field_b = -69L;
        return param3;
    }

    final static void a(boolean param0, int param1) {
        hl.field_e = DebugConsole.a(25, 0, true, !param0 ? true : false, 11, param1);
        DualLinkNode.field_h = DebugConsole.a(50, 25, param0, !param0 ? true : false, 11, param1);
        hq.field_e = DebugConsole.a(75, 50, false, false, 11, param1);
        ModalPanel.field_G = DebugConsole.a(100, 75, false, false, 11, param1);
    }

    final static boolean a(byte param0) {
        if (param0 < 64) {
          in.a((byte) 24);
          if (null == NumericDateInputWidget.field_J) {
            return DebugConsole.field_s ? true : false;
          }
          return true;
        }
        if (null != NumericDateInputWidget.field_J) {
          return true;
        }
        if (!DebugConsole.field_s) {
          return false;
        }
        return true;
    }

    static {
        field_a = "No";
    }
}
