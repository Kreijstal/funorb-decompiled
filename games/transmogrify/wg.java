/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wg implements Iterator {
    static qj field_f;
    private ri field_a;
    static ik field_d;
    private pf field_c;
    static String field_e;
    private ri field_b;

    final static void b(int param0) {
        int var2 = 0;
        he var3_ref_he = null;
        int var3 = 0;
        gh var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        hj var8 = null;
        byte[] var14 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        var8 = nf.field_l;
        var2 = var8.d((byte) 59);
        if (-1 != (var2 ^ -1)) {
          if (1 == var2) {
            var3 = var8.c((byte) -122);
            var4 = (gh) (Object) mf.field_b.a((byte) -95);
            L0: while (true) {
              if (var4 == null) {
                if (var4 == null) {
                  pc.a(param0 + -3);
                  return;
                } else {
                  var4.c(5);
                  if (param0 != 4) {
                    field_e = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (var4.field_j != var3) {
                  var4 = (gh) (Object) mf.field_b.a(true);
                  continue L0;
                } else {
                  if (var4 == null) {
                    pc.a(param0 + -3);
                    return;
                  } else {
                    L1: {
                      var4.c(5);
                      if (param0 == 4) {
                        break L1;
                      } else {
                        field_e = null;
                        break L1;
                      }
                    }
                    return;
                  }
                }
              }
            }
          } else {
            d.a((Throwable) null, 13, "A1: " + ik.q(48));
            pc.a(1);
            if (param0 == 4) {
              return;
            } else {
              field_e = null;
              return;
            }
          }
        } else {
          var3_ref_he = (he) (Object) pj.field_A.a((byte) -95);
          if (var3_ref_he != null) {
            L2: {
              var4_int = var8.d((byte) 85);
              if (0 != var4_int) {
                var14 = new byte[var4_int];
                var8.a(var4_int, 2, var14, 0);
                break L2;
              } else {
                var5 = null;
                break L2;
              }
            }
            var8.field_h = var8.field_h + 4;
            if (!var8.d(5432)) {
              pc.a(param0 + -3);
              return;
            } else {
              var3_ref_he.c(param0 ^ 1);
              if (param0 == 4) {
                return;
              } else {
                field_e = null;
                return;
              }
            }
          } else {
            pc.a(param0 ^ 5);
            return;
          }
        }
    }

    public final void remove() {
        if (((wg) this).field_a == null) {
            throw new IllegalStateException();
        }
        ((wg) this).field_a.b((byte) -81);
        ((wg) this).field_a = null;
    }

    public final Object next() {
        ri var1 = ((wg) this).field_b;
        if (var1 != ((wg) this).field_c.field_e) {
            ((wg) this).field_b = var1.field_h;
        } else {
            ((wg) this).field_b = null;
            var1 = null;
        }
        ((wg) this).field_a = var1;
        return (Object) (Object) var1;
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_f = null;
        if (param0 != 20738) {
            field_d = null;
        }
    }

    wg(pf param0) {
        ((wg) this).field_a = null;
        ((wg) this).field_c = param0;
        ((wg) this).field_a = null;
        ((wg) this).field_b = ((wg) this).field_c.field_e.field_h;
    }

    public final boolean hasNext() {
        return ((wg) this).field_c.field_e != ((wg) this).field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Service unavailable";
        field_f = new qj();
    }
}
