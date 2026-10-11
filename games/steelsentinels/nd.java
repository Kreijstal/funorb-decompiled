/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static gh field_a;

    final static int a(byte param0) {
        if (param0 != 56) {
          return 7;
        }
        return (pm.field_Z << 2) + (sg.field_c << 4) + fi.field_y;
    }

    final static void a(boolean param0, int param1) {
        hf.a(param0, 1);
        if (param1 != 230827172) {
          field_a = (gh) null;
          if (null != ll.field_i) {
            jg.a(ll.field_i, 1);
            return;
          }
          return;
        }
        if (null == ll.field_i) {
          return;
        }
        jg.a(ll.field_i, 1);
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = -64 % ((param0 + 13) / 36);
    }

    static {
    }
}
