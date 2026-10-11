/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wh implements Iterator {
    private rf field_a;
    static int[] field_e;
    private ek field_b;
    private int field_c;
    private rf field_d;

    final static void b(int param0) {
        qb.b(-1);
        ic.field_a = true;
        if (param0 > 63) {
          tc.field_x = true;
          ti.field_b.l(26756);
          sc.a(false, (byte) 118, ui.field_n);
          return;
        }
        wh.a(false);
        tc.field_x = true;
        ti.field_b.l(26756);
        sc.a(false, (byte) 118, ui.field_n);
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = StarCannon.field_A;
        if (this.field_a != this.field_b.field_a[this.field_c - 1]) {
          return true;
        }
        while (this.field_b.field_c > this.field_c) {
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          if (this.field_b.field_a[fieldTemp$0].field_a != this.field_b.field_a[this.field_c - 1]) {
            this.field_a = this.field_b.field_a[-1 + this.field_c].field_a;
            return true;
          }
          this.field_a = this.field_b.field_a[this.field_c - 1];
        }
        return false;
    }

    private final void a(int param0) {
        this.field_a = this.field_b.field_a[0].field_a;
        this.field_c = 1;
        if (param0 == -17399) {
          this.field_d = null;
          return;
        }
        this.a(-19);
        this.field_d = null;
    }

    public static void a(boolean param0) {
        field_e = null;
        if (param0) {
          return;
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        wh.a(124, (java.net.URL) null, (java.applet.Applet) null);
    }

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 127) {
            stackIn_2_0 = (java.net.URL) null;
            return stackIn_2_0;
          }
          var3 = null;
          var4 = null;
          if (null != qi.field_b &&
            !qi.field_b.equals(param2.getParameter("settings"))) {
            var3 = qi.field_b;
            var4 = var3;
            var4 = var3;
          }
          if (null != vk.field_v &&
            !vk.field_v.equals(param2.getParameter("session"))) {
            var4 = vk.field_v;
          }
          stackIn_11_0 = ig.a((String) (var3), -1, (String) (var4), param1, 1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("wh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sd.a((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        rf var1;
        int var2;
        var2 = StarCannon.field_A;
        if (this.field_b.field_a[this.field_c - 1] != this.field_a) {
          var1 = this.field_a;
          this.field_d = var1;
          this.field_a = var1.field_a;
          return var1;
        }
        do {
          if (this.field_b.field_c <= this.field_c) {
            return null;
          }
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          var1 = this.field_b.field_a[fieldTemp$0].field_a;
        } while (this.field_b.field_a[-1 + this.field_c] == var1);
        this.field_d = var1;
        this.field_a = var1.field_a;
        return var1;
    }

    public final void remove() {
        if (this.field_d == null) {
          throw new IllegalStateException();
        }
        this.field_d.b(4);
        this.field_d = null;
    }

    wh(ek param0) {
        this.field_d = null;
        try {
          this.field_b = param0;
          this.a(-17399);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
