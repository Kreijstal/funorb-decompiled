/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wm implements Iterable {
    le[] field_c;
    private le field_a;
    static int field_e;
    static int field_d;
    int field_f;
    static int field_b;

    final le a(boolean param0, long param1) {
        le var5 = null;
        int var6 = ZombieDawn.field_J;
        le var4 = this.field_c[(int)((long)(-1 + this.field_f) & param1)];
        this.field_a = var4.field_b;
        while (var4 != this.field_a) {
          if (this.field_a.field_f == param1) {
            var5 = this.field_a;
            this.field_a = this.field_a.field_b;
            return var5;
          }
          this.field_a = this.field_a.field_b;
        }
        if (!param0) {
          this.field_a = null;
          return null;
        }
        wm.a(17, (byte) 50);
        this.field_a = null;
        return null;
    }

    final static int a(int param0, byte param1) {
        int var2;
        int var3;
        var2 = 41 / ((-39 - param1) / 56);
        var3 = 0;
        if (param0 < 0) {
          param0 = param0 >>> 16;
          var3 += 16;
        } else {
          if (param0 >= 65536) {
            param0 = param0 >>> 16;
            var3 += 16;
          }
        }
        if (param0 >= 256) {
          param0 = param0 >>> 8;
          var3 += 8;
        }
        if (param0 >= 16) {
          param0 = param0 >>> 4;
          var3 += 4;
        }
        if (4 <= param0) {
          param0 = param0 >>> 2;
          var3 += 2;
        }
        if (param0 >= 1) {
          var3++;
          param0 = param0 >>> 1;
        }
        return var3 + param0;
    }

    final static hn a(int param0, gi param1) {
        RuntimeException var2 = null;
        hn stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 96) {
            field_b = 21;
          }
          stackIn_3_0 = aa.a(106, fn.a(param1, 100, 96));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("wm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new hl(this));
    }

    final void a(long param0, boolean param1, le param2) {
        le var5 = null;
        try {
          if (null != param2.field_d) {
            param2.b(-27598);
          }
          var5 = this.field_c[(int)((long)(this.field_f - 1) & param0)];
          param2.field_b = var5;
          if (!param1) {
            this.iterator();
          }
          param2.field_d = var5.field_d;
          param2.field_d.field_b = param2;
          param2.field_f = param0;
          param2.field_b.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "wm.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private wm() throws Throwable {
        throw new Error();
    }

    static {
        field_e = 0;
        field_b = -1;
    }
}
