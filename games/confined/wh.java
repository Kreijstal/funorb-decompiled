/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends ul implements j {
    private dm field_db;
    static ve field_fb;
    private int field_bb;
    static String field_eb;
    static String field_ab;
    static java.awt.Frame field_cb;

    final void a(int param0, dm param1) {
        try {
            if (param0 != -18312) {
                ((wh) this).field_bb = 119;
            }
            ((wh) this).field_db = param1;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "wh.IA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void k(byte param0) {
        super.k((byte) -128);
        if (null == ((wh) this).field_db) {
          if (param0 > -117) {
            ((wh) this).field_db = null;
            return;
          } else {
            return;
          }
        } else {
          ((wh) this).field_db.b(-71);
          if (param0 <= -117) {
            return;
          } else {
            ((wh) this).field_db = null;
            return;
          }
        }
    }

    final void a(fj param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((wh) this).field_bb = -((wh) this).field_q + ld.field_l - param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "wh.V(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    wh(String param0, uk param1, int param2) {
        super(param0, param1, param2);
    }

    final String f(byte param0) {
        if (((wh) this).field_w) {
          if (((wh) this).field_C != null) {
            fb.a(jh.field_R, -25, ld.field_l + (-((wh) this).field_bb + ((wh) this).field_F));
            if (param0 >= -82) {
              return null;
            } else {
              return ((wh) this).field_C;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final dm a(byte param0) {
        if (param0 != -9) {
            field_fb = null;
            return ((wh) this).field_db;
        }
        return ((wh) this).field_db;
    }

    public static void l(int param0) {
        field_fb = null;
        field_cb = null;
        field_ab = null;
        field_eb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_eb = "This password is part of your Player Name, and would be easy to guess";
        field_fb = new ve();
        field_ab = "1 cluster missile";
    }
}
