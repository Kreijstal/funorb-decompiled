/*
 * Decompiled by CFR-JS 0.4.0.
 */
class od extends vg {
    static ura field_h;
    static int field_i;
    od field_f;
    od field_g;
    long field_j;

    public static void b(int param0) {
        if (param0 != 0) {
            field_i = 103;
            field_h = null;
            return;
        }
        field_h = null;
    }

    final boolean d(int param0) {
        if (((od) this).field_f == null) {
            return false;
        }
        if (param0 != 0) {
            Object var3 = null;
            hc discarded$0 = od.a(-117, (uia) null);
            return true;
        }
        return true;
    }

    final void a(boolean param0, long param1) {
        if (!param0) {
          if (((od) this).field_f != null) {
            throw new RuntimeException();
          } else {
            ((od) this).field_j = param1;
            return;
          }
        } else {
          od.b(-57);
          if (((od) this).field_f != null) {
            throw new RuntimeException();
          } else {
            ((od) this).field_j = param1;
            return;
          }
        }
    }

    final void c(int param0) {
        if (((od) this).field_f != null) {
          if (param0 != -7975) {
            return;
          } else {
            ((od) this).field_f.field_g = ((od) this).field_g;
            ((od) this).field_g.field_f = ((od) this).field_f;
            ((od) this).field_f = null;
            ((od) this).field_g = null;
            return;
          }
        } else {
          return;
        }
    }

    final static hc a(int param0, uia param1) {
        if (param0 != 0) {
          return null;
        } else {
          return new hc(param1.b(false), param1.b(false), param1.b(false), param1.b(false), param1.a(-32768), param1.h(255));
        }
    }

    protected od() {
    }

    final long e(int param0) {
        if (param0 != 0) {
            return -21L;
        }
        return ((od) this).field_j;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new ura();
        field_i = 0;
    }
}
