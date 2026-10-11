/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ki {
    private kk field_g;
    private hb field_d;
    static java.awt.Canvas field_f;
    private kk field_b;
    static Calendar field_e;
    static int[] field_c;
    static String field_a;

    final static void a(boolean param0, int param1, boolean param2) {
        if (param1 != 0) {
          ki.a(false, -67, false);
          if (param0) {
            ll.c(0, 0, ll.field_d, ll.field_k, 0, 192);
            lh.a(param0, -94);
            return;
          }
          ll.a();
          lh.a(param0, -94);
          return;
        }
        if (param0) {
          ll.c(0, 0, ll.field_d, ll.field_k, 0, 192);
          lh.a(param0, -94);
          return;
        }
        ll.a();
        lh.a(param0, -94);
    }

    public static void a(int param0) {
        field_a = null;
        field_e = null;
        if (param0 == 49) {
          field_f = null;
          field_c = null;
          return;
        }
        field_e = (Calendar) null;
        field_f = null;
        field_c = null;
    }

    final ob a(int param0, int param1) {
        ob var3;
        byte[] var4;
        ob var5;
        var3 = (ob) (this.field_d.a((long)param1, (byte) 102));
        if (var3 != null) {
          return var3;
        }
        if (param1 < 32768) {
          var4 = this.field_g.a(1, param1, (byte) -23);
        } else {
          var4 = this.field_b.a(1, param1 & 32767, (byte) -67);
        }
        var5 = new ob();
        if (param0 < 91) {
          field_c = (int[]) null;
        }
        if (var4 != null) {
          var5.a(false, new be(var4));
        }
        if (param1 >= 32768) {
          var5.f(32768);
        }
        this.field_d.a(-60, var5, (long)param1);
        return var5;
    }

    private ki() throws Throwable {
        throw new Error();
    }

    static {
        field_c = new int[]{45, 46, 47, 48, 49};
        field_e = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_a = "There's more than one space large enough for this exhibit, but only one place it can go. Think carefully.";
    }
}
