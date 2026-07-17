/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wf {
    long field_b;
    static hd field_d;
    wf field_c;
    wf field_a;

    final void c(int param0) {
        if (((wf) this).field_c != null) {
          ((wf) this).field_c.field_a = ((wf) this).field_a;
          ((wf) this).field_a.field_c = ((wf) this).field_c;
          ((wf) this).field_a = null;
          if (param0 >= -122) {
            ((wf) this).field_a = null;
            ((wf) this).field_c = null;
            return;
          } else {
            ((wf) this).field_c = null;
            return;
          }
        } else {
          return;
        }
    }

    final boolean b(byte param0) {
        if (param0 >= 80) {
          if (((wf) this).field_c == null) {
            return false;
          } else {
            return true;
          }
        } else {
          ((wf) this).field_a = null;
          if (((wf) this).field_c == null) {
            return false;
          } else {
            return true;
          }
        }
    }

    public static void b(int param0) {
        field_d = null;
        int var1 = 0;
    }

    final static void a(long param0, boolean param1) {
        if (0L >= param0) {
          return;
        } else {
          if (param0 % 10L != 0L) {
            ci.a(param0, (byte) 105);
            field_d = null;
            return;
          } else {
            ci.a(param0 - 1L, (byte) 127);
            ci.a(1L, (byte) 104);
            field_d = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new hd(1);
    }
}
