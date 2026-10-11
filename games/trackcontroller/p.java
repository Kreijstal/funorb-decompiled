/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static oh field_a;

    final static void a(byte param0) {
        if (param0 != 25) {
          field_a = (oh) null;
          if (null == gl.field_E) {
            if (null == ib.field_e) {
              rf.a(true);
              return;
            }
            ib.field_e.e((byte) 50);
            rf.a(true);
            return;
          }
          gl.field_E.k(-113);
          if (null != ib.field_e) {
            ib.field_e.e((byte) 50);
            rf.a(true);
            return;
          }
          rf.a(true);
          return;
        }
        if (null != gl.field_E) {
          gl.field_E.k(-113);
          if (null == ib.field_e) {
            rf.a(true);
            return;
          }
          ib.field_e.e((byte) 50);
          rf.a(true);
          return;
        }
        if (null == ib.field_e) {
          rf.a(true);
          return;
        }
        ib.field_e.e((byte) 50);
        rf.a(true);
    }

    public static void b(byte param0) {
        int var1 = 22 / ((param0 - 46) / 53);
        field_a = null;
    }

    static {
    }
}
