/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tc implements Iterable {
    static String field_b;
    vh field_a;
    static o field_f;
    static int field_e;
    static String field_d;
    static int[] field_c;

    private tc() throws Throwable {
        throw new Error();
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ne(this));
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -51) {
          field_c = (int[]) null;
        }
        field_f = null;
        field_c = null;
        field_d = null;
    }

    final vh c(int param0) {
        if (param0 != 0) {
          this.c(117);
        }
        vh var2 = this.field_a.field_o;
        if (this.field_a == var2) {
          return null;
        }
        var2.c((byte) 13);
        return var2;
    }

    final static void b(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Terraphoenix.field_V;
        try {
          var1 = th.field_g;
          synchronized (var1) {
            eb.field_F = eb.field_F + 1;
            r.field_V = d.field_M;
            if (0 > dj.field_e) {
              for (var2 = 0; var2 < 112; var2++) {
                bh.field_e[var2] = false;
              }
              dj.field_e = vl.field_h;
            } else {
              while (vl.field_h != dj.field_e) {
                var2 = sj.field_g[vl.field_h];
                vl.field_h = vl.field_h + 1 & 127;
                if (var2 >= 0) {
                  bh.field_e[var2] = true;
                  continue;
                }
                bh.field_e[~var2] = false;
              }
            }
            d.field_M = u.field_g;
          }
          if (param0 != 1) {
            tc.a(122);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1_ref), "tc.B(" + param0 + ')');
        }
    }

    final void a(vh param0, byte param1) {
        try {
          if (param0.field_i != null) {
            param0.c((byte) 13);
          }
          param0.field_i = this.field_a.field_i;
          param0.field_o = this.field_a;
          param0.field_i.field_o = param0;
          int var3_int = -73 / ((param1 + 57) / 49);
          param0.field_o.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "tc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String a(byte param0, byte[] param1, int param2, int param3) {
        int var6 = 0;
        int incrementValue$0 = 0;
        char[] var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        int var8 = 0;
        var9 = Terraphoenix.field_V;
        try {
          var12 = new char[param2];
          var11 = var12;
          var10 = var11;
          var4 = var10;
          if (param0 != -114) {
            field_b = (String) null;
          }
          var5 = 0;
          for (var6 = 0; var6 < param2; var6++) {
            var7 = 255 & param1[var6 + param3];
            if (var7 != 0) {
              if (var7 >= 128 &&
                var7 < 160) {
                var8 = oj.field_s[var7 - 128];
                if (0 == var8) {
                  var8 = 63;
                }
                var7 = var8;
              }
              incrementValue$0 = var5;
              var5++;
              var10[incrementValue$0] = (char)var7;
            }
          }
          stackIn_16_0 = new String(var12, 0, var5);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_19_0 = var4_ref;
          stackIn_19_1 = new StringBuilder().append("tc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
          field_d = (String) null;
        }
        return (param1 - param3) * (-param3 + param1) + (-param2 + param4) * (-param2 + param4);
    }

    static {
        field_b = "This password is part of your Player Name, and would be easy to guess";
        field_f = new o();
        field_d = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
