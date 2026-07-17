/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lc implements Iterator {
    private am field_a;
    private am field_d;
    static String field_b;
    static kw field_e;
    private ci field_c;

    public final Object next() {
        am var1 = ((lc) this).field_a;
        if (((lc) this).field_c.field_d != var1) {
            ((lc) this).field_a = var1.field_f;
        } else {
            var1 = null;
            ((lc) this).field_a = null;
        }
        ((lc) this).field_d = var1;
        return (Object) (Object) var1;
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        Object var6 = null;
        CharSequence var7 = null;
        if (null != k.field_m) {
          var3 = k.field_m.a((byte) 84, param2);
          if (var3 != 0) {
            if (var3 != 2) {
              k.field_m = null;
              fs.field_b = -1;
              var3 = 0;
              return;
            } else {
              if (k.field_m.field_E == null) {
                k.field_m = null;
                fs.field_b = -1;
                var3 = 0;
                return;
              } else {
                if (k.field_m.field_E.equals((Object) (Object) "")) {
                  k.field_m = null;
                  fs.field_b = -1;
                  var3 = 0;
                  return;
                } else {
                  L0: {
                    if (k.field_m.field_E.charAt(0) != 91) {
                      var7 = (CharSequence) (Object) k.field_m.field_E;
                      var4 = mo.a(0, var7);
                      var5 = var4;
                      var5 = var4;
                      break L0;
                    } else {
                      var4 = k.field_m.field_E;
                      break L0;
                    }
                  }
                  L1: {
                    var5 = null;
                    if (fs.field_b != 0) {
                      break L1;
                    } else {
                      var5 = lh.a(13, 100, var4);
                      break L1;
                    }
                  }
                  L2: {
                    if (fs.field_b != 1) {
                      break L2;
                    } else {
                      var5 = of.a(13, (byte) 100, var4);
                      break L2;
                    }
                  }
                  L3: {
                    if (fs.field_b == 2) {
                      int discarded$1 = 126;
                      var5 = il.a(var4, 13);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (fs.field_b != 3) {
                      break L4;
                    } else {
                      var5 = rn.a(var4, 2, 13, var4);
                      break L4;
                    }
                  }
                  if (var5 == null) {
                    k.field_m = null;
                    fs.field_b = -1;
                    var3 = 0;
                    return;
                  } else {
                    var6 = null;
                    wi.a((String) null, var4, 0, 2, var5, -115);
                    k.field_m = null;
                    fs.field_b = -1;
                    var3 = 0;
                    return;
                  }
                }
              }
            }
          } else {
            var3 = 0;
            return;
          }
        } else {
          var3 = 0;
          return;
        }
    }

    public final boolean hasNext() {
        return ((lc) this).field_a != ((lc) this).field_c.field_d;
    }

    public static void a() {
        field_b = null;
        field_e = null;
    }

    lc(ci param0) {
        ((lc) this).field_d = null;
        try {
            ((lc) this).field_c = param0;
            ((lc) this).field_a = ((lc) this).field_c.field_d.field_f;
            ((lc) this).field_d = null;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "lc.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public final void remove() {
        if (null == ((lc) this).field_d) {
            throw new IllegalStateException();
        }
        ((lc) this).field_d.f(-88);
        ((lc) this).field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "spent: <%0>";
    }
}
