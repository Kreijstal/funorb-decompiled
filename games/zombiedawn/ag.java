/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ag implements Iterator {
    private ii field_f;
    static f[] field_a;
    static int[] field_b;
    static vn field_h;
    private nb field_d;
    private nb field_g;
    static String field_c;
    static String field_e;

    final static byte[] a(Object param0, byte param1, boolean param2) {
        byte[] var3 = null;
        rf var4 = null;
        if (param0 != null) {
          if (param0 instanceof byte[]) {
            var3 = (byte[]) param0;
            if (param2) {
              return jl.a(var3, (byte) 45);
            } else {
              return var3;
            }
          } else {
            if (param1 >= 80) {
              if (param0 instanceof rf) {
                var4 = (rf) param0;
                return var4.a((byte) -116);
              } else {
                throw new IllegalArgumentException();
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public final boolean hasNext() {
        return ((ag) this).field_g != ((ag) this).field_f.field_c;
    }

    public static void a(byte param0) {
        if (param0 != 48) {
            return;
        }
        field_a = null;
        field_h = null;
        field_e = null;
        field_c = null;
        field_b = null;
    }

    final static void a(int param0, boolean param1) {
        cl var2 = null;
        L0: {
          var2 = null;
          if (!param1) {
            var2 = (cl) (Object) new wh();
            break L0;
          } else {
            var2 = new cl();
            break L0;
          }
        }
        nl.a(new lg((wa) (Object) var2), (byte) -121);
        if (param0 > -105) {
          field_e = null;
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, boolean param1, bo param2) {
        int var4 = 0;
        am var5 = null;
        var5 = dp.field_e;
        var5.j(11, param0);
        var5.field_j = var5.field_j + 1;
        var4 = var5.field_j;
        var5.i(1, -111);
        var5.i(param2.field_q, -101);
        var5.i(param2.field_h, 40);
        var5.h(-109, param2.field_j);
        var5.h(-105, param2.field_k);
        var5.h(98, param2.field_m);
        var5.h(-118, param2.field_l);
        if (!param1) {
          return;
        } else {
          int discarded$2 = var5.e(-69, var4);
          var5.d(-60, -var4 + var5.field_j);
          return;
        }
    }

    public final Object next() {
        nb var1 = ((ag) this).field_g;
        if (((ag) this).field_f.field_c != var1) {
            ((ag) this).field_g = var1.field_i;
        } else {
            ((ag) this).field_g = null;
            var1 = null;
        }
        ((ag) this).field_d = var1;
        return (Object) (Object) var1;
    }

    ag(ii param0) {
        ((ag) this).field_d = null;
        ((ag) this).field_f = param0;
        ((ag) this).field_d = null;
        ((ag) this).field_g = ((ag) this).field_f.field_c.field_i;
    }

    public final void remove() {
        if (null == ((ag) this).field_d) {
            throw new IllegalStateException();
        }
        ((ag) this).field_d.c((byte) -9);
        ((ag) this).field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{303, 60, 257, 63};
        field_e = "Become a member to get this expansion and...";
    }
}
