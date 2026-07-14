/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sj {
    static int field_c;
    static ko field_d;
    int field_e;
    int field_a;
    static java.util.zip.CRC32 field_b;
    static int field_f;

    final static tl a(int param0, String param1, byte param2) {
        wf var3 = null;
        Object var4 = null;
        if (param2 <= 101) {
          var4 = null;
          dl discarded$2 = sj.a(42, -122, (db) null, 40);
          var3 = new wf();
          ((tl) (Object) var3).field_d = param0;
          ((tl) (Object) var3).field_c = param1;
          return (tl) (Object) var3;
        } else {
          var3 = new wf();
          ((tl) (Object) var3).field_d = param0;
          ((tl) (Object) var3).field_c = param1;
          return (tl) (Object) var3;
        }
    }

    final static void a(dl param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8) {
        wn.field_c = param4;
        a.field_c = param0;
        if (param8 < 108) {
          sj.a(5);
          o.field_f = param7;
          field_f = param3;
          kl.field_U = param1;
          sc.field_h = param5;
          fk.field_u = param6;
          km.field_e = param2;
          return;
        } else {
          o.field_f = param7;
          field_f = param3;
          kl.field_U = param1;
          sc.field_h = param5;
          fk.field_u = param6;
          km.field_e = param2;
          return;
        }
    }

    final static dl a(int param0, int param1, db param2, int param3) {
        int var4 = 0;
        var4 = 13 % ((-38 - param3) / 55);
        if (!gm.a(param2, param0, true, param1)) {
          return null;
        } else {
          return tn.b(true);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    sj(int param0, int param1, int param2, int param3) {
        ((sj) this).field_a = param3;
        ((sj) this).field_e = param0;
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 21732) {
            Object var2 = null;
            dl discarded$0 = sj.a(-71, -36, (db) null, -87);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new java.util.zip.CRC32();
    }
}
