/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ci implements Iterable {
    static hd field_b;
    am field_d;
    static tf field_f;
    static hd field_h;
    static int field_a;
    static long field_c;
    static ut field_g;
    static String field_e;

    public final Iterator iterator() {
        return (Iterator) (Object) new lc((ci) this);
    }

    final am a(byte param0) {
        am var2 = null;
        var2 = ((ci) this).field_d.field_f;
        if (var2 != ((ci) this).field_d) {
          var2.f(-124);
          if (param0 != -120) {
            field_a = 106;
            return var2;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, am param1) {
        if (null != param1.field_e) {
            param1.f(-81);
        }
        param1.field_f = ((ci) this).field_d;
        if (param0 != -8545) {
            return;
        }
        try {
            param1.field_e = ((ci) this).field_d.field_e;
            param1.field_e.field_f = param1;
            param1.field_f.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ci.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    ci() {
        ((ci) this).field_d = new am();
        ((ci) this).field_d.field_f = ((ci) this).field_d;
        ((ci) this).field_d.field_e = ((ci) this).field_d;
    }

    final static void a(boolean param0) {
        int discarded$0 = 46;
        int var1 = wq.b();
        int var2 = gn.d((byte) 101);
        ba.field_p.a(-dq.field_f + ka.field_a, (mt.field_a << 1) + var2, uq.field_c - mt.field_a, (dq.field_f << 1) + var1, 3);
        re.a(0);
    }

    public static void a() {
        field_e = null;
        field_f = null;
        field_g = null;
        field_h = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new tf();
        field_e = "concluded";
    }
}
