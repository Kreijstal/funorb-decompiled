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
        if (param1 != 66) {
            field_c = null;
            r.a(param2, (byte) 87, false, param0);
            return;
        }
        r.a(param2, (byte) 87, false, param0);
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
        float var1 = 0.0f;
        Object var2 = null;
        ja var2_ref = null;
        int var3 = 0;
        var2 = null;
        var3 = Geoblox.field_C;
        var1 = el.field_o.field_J;
        ab.a(param0 + -22, var1);
        rh.a((byte) 123);
        if (param0 == -15) {
          var2_ref = (ja) (Object) bh.field_c.g(0);
          L0: while (true) {
            if (var2_ref == null) {
              if (el.field_o.field_C) {
                return;
              } else {
                lc.a(255);
                return;
              }
            } else {
              L1: {
                var2_ref.b(true);
                if ((var2_ref.field_G ^ -1) > -4) {
                  break L1;
                } else {
                  var2_ref.field_K = ra.field_a;
                  var2_ref.field_G = 0;
                  break L1;
                }
              }
              var2_ref = (ja) (Object) bh.field_c.d(1);
              continue L0;
            }
          }
        } else {
          ef.a((byte) -11);
          var2_ref = (ja) (Object) bh.field_c.g(0);
          L2: while (true) {
            if (var2_ref == null) {
              if (el.field_o.field_C) {
                return;
              } else {
                lc.a(255);
                return;
              }
            } else {
              L3: {
                var2_ref.b(true);
                if ((var2_ref.field_G ^ -1) > -4) {
                  break L3;
                } else {
                  var2_ref.field_K = ra.field_a;
                  var2_ref.field_G = 0;
                  break L3;
                }
              }
              var2_ref = (ja) (Object) bh.field_c.d(1);
              continue L2;
            }
          }
        }
    }

    ef(ra param0) {
        ((ef) this).field_b = null;
        ((ef) this).field_a = param0;
        ((ef) this).field_d = ((ef) this).field_a.field_c.field_k;
        ((ef) this).field_b = null;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 101) {
            field_e = false;
        }
    }

    final static dm a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Geoblox.field_C;
        dm var6 = new dm(param2, param2);
        dm var3 = var6;
        for (var4 = param0; var3.field_v.length > var4; var4++) {
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
