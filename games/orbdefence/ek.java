/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ek implements Iterable {
    int field_d;
    static String field_c;
    static int[] field_e;
    static boolean[] field_a;
    private ca field_f;
    ca[] field_b;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!((param0 & 7) == 0)) {
            var2 = -(param0 & 7) + 8;
        }
        int var3 = param0 - -var2;
        return var3;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new pl((ek) this);
    }

    final static void c() {
        pc.field_Z = false;
        int discarded$0 = cd.field_t.b((byte) 90);
    }

    public static void b() {
        field_c = null;
        field_a = null;
        field_e = null;
    }

    final void a(ca param0, int param1, long param2) {
        ca var5 = null;
        try {
            if (null != param0.field_c) {
                param0.b(57);
            }
            var5 = ((ek) this).field_b[(int)((long)(-1 + ((ek) this).field_d) & param2)];
            param0.field_c = var5.field_c;
            if (param1 >= -122) {
                field_e = null;
            }
            param0.field_e = var5;
            param0.field_c.field_e = param0;
            param0.field_e.field_c = param0;
            param0.field_d = param2;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ek.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final ca a(long param0, int param1) {
        ca var4 = null;
        ca var5 = null;
        int var6 = 0;
        var6 = OrbDefence.field_D ? 1 : 0;
        var4 = ((ek) this).field_b[(int)((long)(param1 + ((ek) this).field_d) & param0)];
        ((ek) this).field_f = var4.field_e;
        L0: while (true) {
          if (((ek) this).field_f != var4) {
            if (((ek) this).field_f.field_d == param0) {
              var5 = ((ek) this).field_f;
              ((ek) this).field_f = ((ek) this).field_f.field_e;
              return var5;
            } else {
              ((ek) this).field_f = ((ek) this).field_f.field_e;
              continue L0;
            }
          } else {
            ((ek) this).field_f = null;
            return null;
          }
        }
    }

    private ek() throws Throwable {
        throw new Error();
    }

    final static void a() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unpacking graphics";
        field_e = new int[9];
        field_a = new boolean[112];
    }
}
