/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hh {
    static Calendar field_c;
    static th field_b;
    static bi[] field_a;

    public static void a(boolean param0) {
        if (param0) {
          field_b = null;
          field_c = null;
          field_a = null;
          return;
        }
        hh.a(72);
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static void a(int param0) {
        lh.a(false);
        if (null != ol.field_e) {
          lh.a((byte) -6, ol.field_e);
        }
        if (param0 != 1) {
          field_c = (Calendar) null;
          fm.a(0);
          gm.e((byte) -82);
          pj.d((byte) 60);
          if (el.b((byte) 127)) {
            ud.field_b.e(8, 1);
            dk.b((byte) 41, 0);
            k.c(-28354);
            return;
          }
          k.c(-28354);
          return;
        }
        fm.a(0);
        gm.e((byte) -82);
        pj.d((byte) 60);
        if (!el.b((byte) 127)) {
          k.c(-28354);
          return;
        }
        ud.field_b.e(8, 1);
        dk.b((byte) 41, 0);
        k.c(-28354);
    }

    static {
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
