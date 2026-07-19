/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kb {
    static uf field_b;
    static int field_a;

    public static void a(int param0) {
        if (param0 != -9192) {
            kb.b(-118);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void b(int param0) {
        if (param0 != 808) {
          L0: {
            kb.a(-78);
            q.field_N.k(-20281);
            if (q.field_A == null) {
              q.field_A = new db(q.field_N, ej.field_c);
              break L0;
            } else {
              break L0;
            }
          }
          q.field_N.b(q.field_A, false);
          return;
        } else {
          L1: {
            q.field_N.k(-20281);
            if (q.field_A == null) {
              q.field_A = new db(q.field_N, ej.field_c);
              break L1;
            } else {
              break L1;
            }
          }
          q.field_N.b(q.field_A, false);
          return;
        }
    }

    static {
        field_b = new uf();
    }
}
