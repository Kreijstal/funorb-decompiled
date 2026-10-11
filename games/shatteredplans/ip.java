/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ip implements Iterator {
    static String field_h;
    static String field_f;
    private up field_a;
    static String field_g;
    static String field_d;
    static long field_b;
    private df field_c;
    private df field_e;

    public final boolean hasNext() {
        return this.field_e != this.field_a.field_a;
    }

    public final Object next() {
        Object var1 = this.field_e;
        if (this.field_a.field_a != var1) {
          this.field_e = ((df) (var1)).field_h;
        } else {
          this.field_e = null;
          var1 = null;
        }
        this.field_c = (df) (var1);
        return var1;
    }

    final static hc[] a(int param0, sl param1) {
        int var5 = 0;
        hc[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        hc[] var4 = null;
        int var6 = 0;
        hc var6_ref_hc = null;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var2_int = param1.b((byte) 93, 8);
          if (0 < var2_int) {
            return null;
          }
          var3 = param1.b((byte) 116, 12);
          var4 = new hc[var3];
          if (param0 != 24243) {
            field_d = (String) null;
          }
          for (var5 = 0; var3 > var5; var5++) {
            if (!ng.a(param1, (byte) -95)) {
              var6 = param1.b((byte) 127, a.a(var5 - 1, 1));
              var4[var5] = var4[var6];
            } else {
              var6_ref_hc = new hc();
              param1.b((byte) 122, 24);
              param1.b((byte) 80, 24);
              var6_ref_hc.field_a = param1.b((byte) 87, 24);
              param1.b((byte) 100, 9);
              param1.b((byte) 122, 12);
              param1.b((byte) 106, 12);
              param1.b((byte) 122, 12);
              var4[var5] = var6_ref_hc;
            }
          }
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("ip.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        if (param0 >= -90) {
          return false;
        }
        return ~np.field_a.field_fc == ~ec.field_p ? true : false;
    }

    public static void a(int param0) {
        if (param0 > 123) {
          field_d = null;
          field_h = null;
          field_g = null;
          field_f = null;
          return;
        }
        sl var2 = (sl) null;
        ip.a(-22, (sl) null);
        field_d = null;
        field_h = null;
        field_g = null;
        field_f = null;
    }

    public final void remove() {
        if (this.field_c == null) {
          throw new IllegalStateException();
        }
        this.field_c.a(16);
        this.field_c = null;
    }

    ip(up param0) {
        this.field_c = null;
        try {
          this.field_a = param0;
          this.field_e = this.field_a.field_a.field_h;
          this.field_c = null;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ip.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "Click to stop animation.";
        field_g = "You need to play 1 more rated game to unlock this option.";
        field_d = "Set up new game";
        field_f = "Use this alternative as your account name";
    }
}
