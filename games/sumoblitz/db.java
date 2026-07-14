/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends ms {
    byte[] field_k;
    static int field_l;
    int field_m;

    final static void a(boolean param0, java.awt.Canvas param1) {
        Object var3 = null;
        if (param0) {
          L0: {
            var3 = null;
            db.a(true, (java.awt.Canvas) null);
            lq.a(0, (java.awt.Component) (Object) param1);
            gs.a((java.awt.Component) (Object) param1, true);
            if (null != as.field_w) {
              as.field_w.a(true, (java.awt.Component) (Object) param1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            lq.a(0, (java.awt.Component) (Object) param1);
            gs.a((java.awt.Component) (Object) param1, true);
            if (null != as.field_w) {
              as.field_w.a(true, (java.awt.Component) (Object) param1);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    db(byte[] param0) {
        ((db) this).field_k = param0;
    }

    static {
    }
}
