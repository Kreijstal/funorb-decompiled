/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fg {
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = -107 % ((0 - param3) / 34);
        if (!li.field_i) {
          dma.a(param2, param1, param0);
          return;
        }
        if (ne.field_v) {
          og.field_r.a(1, (byte) 120, param0 | -16777216, 1, param1, param2);
          return;
        }
    }

    abstract void a(int param0, java.awt.Component param1);

    public static void a(int param0) {
        field_a = null;
        if (param0 != -25692) {
          fg.a(4);
        }
    }

    abstract void a(java.awt.Component param0, int param1);

    abstract int b(int param0);

    final static boolean a(char param0, int param1) {
        if (param1 <= 22) {
          field_a = (String) null;
          if (param0 == 160) {
            return true;
          }
          if (param0 == 32) {
            return true;
          }
          if (param0 == 95) {
            return true;
          }
          if (45 != param0) {
            return false;
          }
          return true;
        }
        if (param0 == 160) {
          return true;
        }
        if (param0 == 32) {
          return true;
        }
        if (param0 == 95) {
          return true;
        }
        if (45 != param0) {
          return false;
        }
        return true;
    }

    static {
        field_a = "Private";
    }
}
