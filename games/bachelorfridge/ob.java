/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends kj {
    private int field_f;
    static ok field_g;

    final boolean b(int param0) {
        ((ob) this).field_f = ((ob) this).field_f - 1;
        if (0 <= ((ob) this).field_f - 1) {
          if (param0 <= 21) {
            boolean discarded$2 = ((ob) this).b(-23);
            return false;
          } else {
            return false;
          }
        } else {
          ((ob) this).field_e.field_h.d(-1, ((ob) this).field_c, ((ob) this).field_d);
          return true;
        }
    }

    final static void a(long param0, byte param1, int param2, int param3, String param4) {
        oa.field_vb = param3;
        el.field_h = param2;
        wg.field_g = true;
        we.field_b = param0;
        hda.field_l = param4;
        if (param1 != -47) {
            ob.c(0);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            boolean discarded$0 = ((ob) this).b(1);
        }
    }

    ob(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        ((ob) this).field_f = 100;
    }

    public static void c(int param0) {
        if (param0 != 0) {
            field_g = null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static void a(String param0, int param1, int[] param2, String param3, int param4, byte param5, int param6, String param7, kga param8, int[] param9) {
        Object var11 = null;
        gfa.field_a[param4] = new wca(param6, param0, param7, param2, param9, param1, param8, param3);
        if (param5 != 22) {
          var11 = null;
          ob.a(-114L, (byte) -127, -69, -33, (String) null);
          param4++;
          return;
        } else {
          param4++;
          return;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
          return;
        } else {
          co.field_b[4].a(param2, -64 + param0, (100 + -((ob) this).field_f) * 192 / 100);
          return;
        }
    }

    static {
    }
}
