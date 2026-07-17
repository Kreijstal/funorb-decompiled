/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vl implements Iterator {
    static tf field_d;
    static in field_c;
    static int[] field_h;
    private lk field_e;
    private ln field_f;
    private ln field_b;
    static th field_a;
    static String field_g;

    public final Object next() {
        ln var1 = ((vl) this).field_b;
        if (((vl) this).field_e.field_i != var1) {
            ((vl) this).field_b = var1.field_n;
        } else {
            ((vl) this).field_b = null;
            var1 = null;
        }
        ((vl) this).field_f = var1;
        return (Object) (Object) var1;
    }

    public final void remove() {
        if (!(((vl) this).field_f != null)) {
            throw new IllegalStateException();
        }
        ((vl) this).field_f.a((byte) -42);
        ((vl) this).field_f = null;
    }

    public static void a() {
        field_h = null;
        field_a = null;
        field_d = null;
        field_g = null;
        field_c = null;
    }

    public final boolean hasNext() {
        return ((vl) this).field_e.field_i != ((vl) this).field_b;
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_h = null;
                break L1;
              }
            }
            if (bl.field_r == null) {
              tc.c();
              ra.field_hb.a(224, 112, 192, 256);
              var1_int = 0;
              L2: while (true) {
                if (32 <= var1_int) {
                  nm.field_c.b(ek.field_q, 320, 392, 0, -1);
                  break L0;
                } else {
                  var2 = ce.a(-14646, nm.field_b);
                  tc.b(var1_int / 2 + 184, 398 - var1_int, var2, 12517567);
                  tc.b(var2 + (var1_int / 2 + 184), 398 + -var1_int, -var2 + 256, 7274607);
                  var1_int++;
                  continue L2;
                }
              }
            } else {
              bl.field_r.a();
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "vl.A(" + param0 + 41);
        }
    }

    vl(lk param0) {
        ((vl) this).field_f = null;
        try {
            ((vl) this).field_e = param0;
            ((vl) this).field_b = ((vl) this).field_e.field_i.field_n;
            ((vl) this).field_f = null;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "vl.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new th(256);
    }
}
