/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dg implements Iterator {
    static vj field_e;
    private be field_g;
    static ck[][] field_d;
    private uh field_a;
    private be field_f;
    static mi field_c;
    static int field_b;

    public final Object next() {
        be var1 = ((dg) this).field_f;
        if (((dg) this).field_a.field_a != var1) {
            ((dg) this).field_f = var1.field_p;
        } else {
            var1 = null;
            ((dg) this).field_f = null;
        }
        ((dg) this).field_g = var1;
        return (Object) (Object) var1;
    }

    public final void remove() {
        if (!(((dg) this).field_g != null)) {
            throw new IllegalStateException();
        }
        ((dg) this).field_g.e((byte) 81);
        ((dg) this).field_g = null;
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_c = null;
    }

    final static void a(int param0, w param1, w param2) {
        try {
            if (param2.field_M == null) {
                param2.field_M = new vj();
            }
            if (null == param1.field_M) {
                param1.field_M = new vj();
            }
            if (null == mc.field_a) {
                mc.field_a = new nk(64);
            }
            if (null == hg.field_e) {
                hg.field_e = new nk(64);
            }
            uf.field_z = param1.field_M;
            if (param0 != 21014) {
                field_c = null;
            }
            qi.field_S = param2.field_M;
            d.a(true);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "dg.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        kn var4 = null;
        kc var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (kn) (Object) pb.field_c.c((byte) -80);
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param0 <= -47) {
                    break L2;
                  } else {
                    field_b = 100;
                    break L2;
                  }
                }
                var5 = (kc) (Object) field_e.c((byte) -121);
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    wb.a(var5, 3, 60);
                    var5 = (kc) (Object) field_e.d(true);
                    continue L3;
                  }
                }
              } else {
                fm.a((byte) -125, 3, var4);
                var4 = (kn) (Object) pb.field_c.d(true);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "dg.C(" + param0 + 44 + 3 + 41);
        }
    }

    public final boolean hasNext() {
        return ((dg) this).field_f != ((dg) this).field_a.field_a;
    }

    final static boolean b(int param0) {
        return rg.a(se.h(25144), (byte) -78);
    }

    dg(uh param0) {
        ((dg) this).field_g = null;
        try {
            ((dg) this).field_a = param0;
            ((dg) this).field_f = ((dg) this).field_a.field_a.field_p;
            ((dg) this).field_g = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "dg.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ck[8][];
        field_e = new vj();
    }
}
