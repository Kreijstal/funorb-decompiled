/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cj {
    static String[] field_e;
    int field_d;
    static ci field_c;
    static q field_b;
    int[] field_a;
    java.awt.Image field_f;
    int field_g;

    abstract void a(int param0, int param1, java.awt.Component param2, byte param3);

    final static void a(boolean param0, int param1) {
        if (param1 != 793) {
            return;
        }
        ec.a(true, param0, 106);
    }

    public static void a(byte param0) {
        int var1 = 89 % ((param0 - 40) / 50);
        field_c = null;
        field_e = null;
        field_b = null;
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final void a(int param0) {
        sb.a(((cj) this).field_a, ((cj) this).field_d, ((cj) this).field_g);
        if (param0 <= 102) {
            Object var3 = null;
            ((cj) this).a(-68, -104, (java.awt.Graphics) null, 18);
        }
    }

    final static void a(java.awt.Canvas param0, int param1) {
        Object var3 = null;
        if (param1 == 13861) {
          hj.a((java.awt.Component) (Object) param0, param1 + -13863);
          jl.a((java.awt.Component) (Object) param0, 0);
          if (null != ga.field_a) {
            ga.field_a.a(false, (java.awt.Component) (Object) param0);
            return;
          } else {
            return;
          }
        } else {
          var3 = null;
          cj.a((java.awt.Canvas) null, -52);
          hj.a((java.awt.Component) (Object) param0, param1 + -13863);
          jl.a((java.awt.Component) (Object) param0, 0);
          if (null == ga.field_a) {
            return;
          } else {
            ga.field_a.a(false, (java.awt.Component) (Object) param0);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_b = new q();
    }
}
