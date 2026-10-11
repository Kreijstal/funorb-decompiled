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
        Object var1 = this.field_a;
        if (this.field_c.field_d != var1) {
          this.field_a = ((am) (var1)).field_f;
        } else {
          var1 = null;
          this.field_a = null;
        }
        this.field_d = (am) (var1);
        return var1;
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3;
        String var4;
        Object var5;
        String var6;
        CharSequence var7;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var3Lifetime5;
        Object var5Lifetime1;
        Object var5Lifetime2;
        if (null == k.field_m) {
          var3 = 91 % ((-21 - param0) / 44);
          return;
        }
        var3Lifetime1 = k.field_m.a((byte) 84, param2);
        if (var3Lifetime1 == 0) {
          var3Lifetime1 = 91 % ((-21 - param0) / 44);
          return;
        }
        if (var3Lifetime1 != 2) {
          k.field_m = null;
          fs.field_b = -1;
          var3Lifetime1 = 91 % ((-21 - param0) / 44);
          return;
        }
        if (k.field_m.field_E == null) {
          k.field_m = null;
          fs.field_b = -1;
          var3Lifetime2 = 91 % ((-21 - param0) / 44);
          return;
        }
        if (k.field_m.field_E.equals("")) {
          k.field_m = null;
          fs.field_b = -1;
          var3Lifetime3 = 91 % ((-21 - param0) / 44);
          return;
        }
        if (k.field_m.field_E.charAt(0) != 91) {
          var7 = (CharSequence) ((Object) k.field_m.field_E);
          var4 = mo.a(0, var7);
          var5 = var4;
          var5Lifetime2 = var4;
        } else {
          var4 = k.field_m.field_E;
        }
        var5Lifetime1 = null;
        if (fs.field_b == 0) {
          var5Lifetime1 = lh.a(param1, 100, var4);
        }
        if (fs.field_b == 1) {
          var5Lifetime1 = of.a(param1, (byte) 100, var4);
        }
        if (fs.field_b == 2) {
          var5Lifetime1 = il.a(var4, param1, (byte) 126);
        }
        if (fs.field_b == 3) {
          var5Lifetime1 = rn.a(var4, 2, param1, var4);
        }
        if (var5Lifetime1 == null) {
          k.field_m = null;
          fs.field_b = -1;
          var3Lifetime4 = 91 % ((-21 - param0) / 44);
          return;
        }
        var6 = (String) null;
        wi.a((String) null, var4, 0, 2, (String) (var5Lifetime1), -115);
        k.field_m = null;
        fs.field_b = -1;
        var3Lifetime5 = 91 % ((-21 - param0) / 44);
        return;
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
