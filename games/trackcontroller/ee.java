/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ee implements Iterator {
    static int field_c;
    private ga field_a;
    static String field_f;
    private int field_b;
    private fc field_d;
    private fc field_g;
    static int field_e;

    public final boolean hasNext() {
        int var2 = 0;
        var2 = TrackController.field_F ? 1 : 0;
        if (((ee) this).field_g == ((ee) this).field_a.field_c[((ee) this).field_b - 1]) {
          L0: while (true) {
            if (((ee) this).field_a.field_a > ((ee) this).field_b) {
              int fieldTemp$1 = ((ee) this).field_b;
              ((ee) this).field_b = ((ee) this).field_b + 1;
              if (((ee) this).field_a.field_c[fieldTemp$1].field_h == ((ee) this).field_a.field_c[-1 + ((ee) this).field_b]) {
                ((ee) this).field_g = ((ee) this).field_a.field_c[((ee) this).field_b + -1];
                continue L0;
              } else {
                ((ee) this).field_g = ((ee) this).field_a.field_c[-1 + ((ee) this).field_b].field_h;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final void remove() {
        if (!(null != ((ee) this).field_d)) {
            throw new IllegalStateException();
        }
        ((ee) this).field_d.a(-98);
        ((ee) this).field_d = null;
    }

    final static void a(java.math.BigInteger param0, be param1, java.math.BigInteger param2, int param3, be param4) {
        try {
            ha.a(param2, param0, param4.field_k, param4.field_j, 0, (byte) 77, param1);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ee.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + 0 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a() {
        ((ee) this).field_g = ((ee) this).field_a.field_c[0].field_h;
        ((ee) this).field_b = 1;
        ((ee) this).field_d = null;
        int var2 = 80;
    }

    public final Object next() {
        int var2 = 0;
        Object var3 = null;
        fc var3_ref = null;
        fc var4 = null;
        var2 = TrackController.field_F ? 1 : 0;
        if (((ee) this).field_g == ((ee) this).field_a.field_c[-1 + ((ee) this).field_b]) {
          L0: while (true) {
            if (((ee) this).field_b < ((ee) this).field_a.field_a) {
              int fieldTemp$2 = ((ee) this).field_b;
              ((ee) this).field_b = ((ee) this).field_b + 1;
              var3_ref = ((ee) this).field_a.field_c[fieldTemp$2].field_h;
              if (var3_ref == ((ee) this).field_a.field_c[-1 + ((ee) this).field_b]) {
                continue L0;
              } else {
                ((ee) this).field_g = var3_ref.field_h;
                ((ee) this).field_d = var3_ref;
                return (Object) (Object) var3_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = ((ee) this).field_g;
          ((ee) this).field_g = var4.field_h;
          ((ee) this).field_d = var4;
          return (Object) (Object) var4;
        }
    }

    final static qj a(int param0, int param1, byte param2) {
        int var6 = TrackController.field_F ? 1 : 0;
        qj var7 = new qj(param1, param1);
        qj var3 = var7;
        int var4 = 0;
        int var5 = -14 / ((param2 - 55) / 41);
        while (var3.field_z.length > var4) {
            var7.field_z[var4] = param0;
            var4++;
        }
        return var3;
    }

    ee(ga param0) {
        ((ee) this).field_d = null;
        try {
            ((ee) this).field_a = param0;
            int discarded$0 = 73;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ee.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 0;
    }
}
