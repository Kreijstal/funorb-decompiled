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
        am var1 = this.field_a;
        if (this.field_c.field_d != var1) {
            this.field_a = var1.field_f;
        } else {
            var1 = null;
            this.field_a = null;
        }
        this.field_d = var1;
        return var1;
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        CharSequence var7 = null;
        if (null != k.field_m) {
          var3 = k.field_m.a((byte) 84, param2);
          if (var3 != 0) {
            if (-3 == (var3 ^ -1)) {
              if (k.field_m.field_E != null) {
                if (!k.field_m.field_E.equals("")) {
                  L0: {
                    if (k.field_m.field_E.charAt(0) != 91) {
                      var7 = (CharSequence) ((Object) k.field_m.field_E);
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
                      var5 = lh.a(param1, 100, var4);
                      break L1;
                    }
                  }
                  L2: {
                    if (fs.field_b != 1) {
                      break L2;
                    } else {
                      var5 = of.a(param1, (byte) 100, var4);
                      break L2;
                    }
                  }
                  L3: {
                    if ((fs.field_b ^ -1) == -3) {
                      var5 = il.a(var4, param1, (byte) 126);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (-4 != (fs.field_b ^ -1)) {
                      break L4;
                    } else {
                      var5 = rn.a(var4, 2, param1, var4);
                      break L4;
                    }
                  }
                  if (var5 == null) {
                    k.field_m = null;
                    fs.field_b = -1;
                    var3 = 91 % ((-21 - param0) / 44);
                    return;
                  } else {
                    var6 = (String) null;
                    wi.a((String) null, var4, 0, 2, var5, -115);
                    k.field_m = null;
                    fs.field_b = -1;
                    var3 = 91 % ((-21 - param0) / 44);
                    return;
                  }
                } else {
                  k.field_m = null;
                  fs.field_b = -1;
                  var3 = 91 % ((-21 - param0) / 44);
                  return;
                }
              } else {
                k.field_m = null;
                fs.field_b = -1;
                var3 = 91 % ((-21 - param0) / 44);
                return;
              }
            } else {
              k.field_m = null;
              fs.field_b = -1;
              var3 = 91 % ((-21 - param0) / 44);
              return;
            }
          } else {
            var3 = 91 % ((-21 - param0) / 44);
            return;
          }
        } else {
          var3 = 91 % ((-21 - param0) / 44);
          return;
        }
    }

    public final boolean hasNext() {
        return this.field_a != this.field_c.field_d;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -19) {
            field_b = (String) null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    lc(ci param0) {
        this.field_d = null;
        try {
            this.field_c = param0;
            this.field_a = this.field_c.field_d.field_f;
            this.field_d = null;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "lc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void remove() {
        if (null == this.field_d) {
            throw new IllegalStateException();
        }
        this.field_d.f(-88);
        this.field_d = null;
    }

    static {
        field_b = "spent: <%0>";
    }
}
