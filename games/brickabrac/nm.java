/*
 * Decompiled by CFR-JS 0.4.0.
 */
class nm {
    nm field_b;
    nm field_e;
    static th field_c;
    static String field_a;
    static jp[] field_f;
    static jp field_d;
    static int[] field_h;
    long field_g;

    final boolean b(int param0) {
        if (param0 == 0) {
          if (null == ((nm) this).field_b) {
            return false;
          } else {
            return true;
          }
        } else {
          ((nm) this).b((byte) 95);
          if (null == ((nm) this).field_b) {
            return false;
          } else {
            return true;
          }
        }
    }

    final static String a(CharSequence[] param0, boolean param1) {
        if (!param1) {
            return null;
        }
        return ao.a(0, param0.length, 19166, param0);
    }

    final void b(byte param0) {
        if (((nm) this).field_b == null) {
          return;
        } else {
          if (param0 != 111) {
            field_a = null;
            ((nm) this).field_b.field_e = ((nm) this).field_e;
            ((nm) this).field_e.field_b = ((nm) this).field_b;
            ((nm) this).field_b = null;
            ((nm) this).field_e = null;
            return;
          } else {
            ((nm) this).field_b.field_e = ((nm) this).field_e;
            ((nm) this).field_e.field_b = ((nm) this).field_b;
            ((nm) this).field_b = null;
            ((nm) this).field_e = null;
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_c = null;
        if (!param0) {
            return;
        }
        field_h = null;
        field_a = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new th(1, 2, 2, 0);
        field_a = "Waiting for <%0> to start the game...";
        field_h = new int[]{26679, 10200253, 12658477, 16494651, 16711935};
    }
}
