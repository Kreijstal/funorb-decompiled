/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ef implements Iterator {
    private rc field_b;
    private ra field_a;
    private rc field_d;
    static String field_c;
    static boolean field_e;

    final static void a(String param0, byte param1, String param2) {
        try {
            r.a(param2, (byte) 87, false, param0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ef.C(" + (param0 != null ? "{...}" : "null") + ',' + 66 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean hasNext() {
        return ((ef) this).field_a.field_c != ((ef) this).field_d;
    }

    public final void remove() {
        if (null == ((ef) this).field_b) {
            throw new IllegalStateException();
        }
        ((ef) this).field_b.a((byte) 92);
        ((ef) this).field_b = null;
    }

    final static void b(byte param0) {
        float var1_float = 0.0f;
        RuntimeException var1 = null;
        ja var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.field_C;
        try {
          L0: {
            var1_float = el.field_o.field_J;
            ab.a(-37, var1_float);
            rh.a((byte) 123);
            var2 = (ja) (Object) bh.field_c.g(0);
            L1: while (true) {
              if (var2 == null) {
                if (el.field_o.field_C) {
                  break L0;
                } else {
                  lc.a(255);
                  return;
                }
              } else {
                L2: {
                  var2.b(true);
                  if (var2.field_G < 3) {
                    break L2;
                  } else {
                    var2.field_K = ra.field_a;
                    var2.field_G = 0;
                    break L2;
                  }
                }
                var2 = (ja) (Object) bh.field_c.d(1);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "ef.A(" + -15 + ')');
        }
    }

    ef(ra param0) {
        ((ef) this).field_b = null;
        try {
            ((ef) this).field_a = param0;
            ((ef) this).field_d = ((ef) this).field_a.field_c.field_k;
            ((ef) this).field_b = null;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ef.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
    }

    final static dm a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Geoblox.field_C;
        dm var6 = new dm(param2, param2);
        dm var3 = var6;
        for (var4 = 0; var3.field_v.length > var4; var4++) {
            var6.field_v[var4] = param1;
        }
        return var3;
    }

    public final Object next() {
        rc var1 = ((ef) this).field_d;
        if (var1 != ((ef) this).field_a.field_c) {
            ((ef) this).field_d = var1.field_k;
        } else {
            var1 = null;
            ((ef) this).field_d = null;
        }
        ((ef) this).field_b = var1;
        return (Object) (Object) var1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Instructions";
        field_e = false;
    }
}
