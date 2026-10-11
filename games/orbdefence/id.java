/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id {
    static ba field_a;
    static volatile int field_b;

    final static void a(int param0) {
        int var1 = 0;
        if (ck.field_f > 32) {
          var1 = ck.field_f % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          ce.a(ck.field_f - var1, (byte) -122);
          if (param0 < 64) {
            field_b = -78;
            return;
          }
          return;
        }
        ce.a(0, (byte) -120);
        if (param0 < 64) {
          field_b = -78;
          return;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -81) {
          field_a = (ba) null;
        }
    }

    final static void a(boolean param0) {
        int var1;
        int var2;
        var2 = OrbDefence.field_D ? 1 : 0;
        oe.field_p = param0;
        bm.field_a = null;
        if (vh.field_j) {
          oj.field_q.d((byte) -62);
        } else {
          var1 = cb.field_j;
          if (var1 > 0) {
            if (1 == var1) {
              bm.field_a = gi.field_d;
            } else {
              bm.field_a = t.a(-415993727, new String[]{Integer.toString(var1)}, cd.field_x);
            }
            bm.field_a = wb.a(new CharSequence[]{(CharSequence) ((Object) bm.field_a), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) ci.field_p)}, (byte) -123);
          }
          oj.field_q.q(4210752);
          o.d(-1);
        }
    }

    final static void b(boolean param0) {
        if (ji.field_b == -ol.field_h + 0) {
          if (!param0) {
            ji.field_b = ji.field_b + 1;
            return;
          }
          field_b = 78;
          ji.field_b = ji.field_b + 1;
          return;
        }
        if (ji.field_b == -ol.field_h + 250) {
          if (!param0) {
            ji.field_b = ji.field_b + 1;
            return;
          }
          field_b = 78;
          ji.field_b = ji.field_b + 1;
          return;
        }
        if (!param0) {
          ji.field_b = ji.field_b + 1;
          return;
        }
        field_b = 78;
        ji.field_b = ji.field_b + 1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 == 734) {
          h.k(125);
          ul.i(param1, param3, param0, param2);
          return;
        }
        id.a(92, -81, -78, 79, -42);
        h.k(125);
        ul.i(param1, param3, param0, param2);
    }

    static {
        field_a = new ba(10, 2, 2, 0);
        field_b = 0;
    }
}
