/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wh implements Iterable {
    int field_d;
    static String field_b;
    br[] field_a;
    static boolean field_c;
    private br field_e;

    final br a(long param0, int param1) {
        br var4;
        int var5;
        br var6;
        int var7;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = this.field_a[(int)(param0 & (long)(-1 + this.field_d))];
        this.field_e = var4.field_d;
        var5 = -79 / ((param1 + 3) / 54);
        while (true) {
          if (var4 == this.field_e) {
            this.field_e = null;
            return null;
          }
          if (param0 != this.field_e.field_e) {
            this.field_e = this.field_e.field_d;
            continue;
          }
          break;
        }
        var6 = this.field_e;
        this.field_e = this.field_e.field_d;
        return var6;
    }

    final void a(long param0, byte param1, br param2) {
        br var5 = null;
        try {
          if (null != param2.field_b) {
            param2.a(true);
          }
          var5 = this.field_a[(int)(param0 & (long)(this.field_d - 1))];
          param2.field_d = var5;
          param2.field_b = var5.field_b;
          param2.field_b.field_d = param2;
          param2.field_e = param0;
          if (param1 > 0) {
            this.field_e = (br) null;
          }
          param2.field_d.field_b = param2;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "wh.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static fc a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        fc stackIn_4_0 = null;
        fc stackIn_10_0 = null;
        fc stackIn_13_0 = null;
        fc stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -12) {
            var3 = (byte[]) null;
            wh.a((byte[]) null, -96);
          }
          var2_int = ql.a(true, 0, param0);
          if (var2_int == 3) {
            stackIn_4_0 = ee.a(param0, true);
            return stackIn_4_0;
          }
          if (var2_int == 4) {
            stackIn_15_0 = nn.a(-99, param0);
            return stackIn_15_0;
          }
          if (var2_int == 5) {
            stackIn_13_0 = jg.a(30270, param0);
            return stackIn_13_0;
          }
          if (var2_int != 6) {
            return null;
          }
          stackIn_10_0 = gi.a(param0, -115);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("wh.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new up(this));
    }

    public static void a(boolean param0) {
        if (param0) {
          byte[] var2 = (byte[]) null;
          wh.a((byte[]) null, -107);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, String param3, String param4) {
        ec.field_b.field_vb = param4;
        ec.field_b.field_wb = param3;
        ec.field_b.field_M = param1;
        ec.field_b.field_zb = ec.field_b.field_zb + ua.field_E.field_zb;
        ua.field_E.field_x = ua.field_E.field_x + ua.field_E.field_zb;
        if (param0 != 6) {
          return;
        }
        try {
          ua.field_E.field_zb = param2;
          ec.field_b.field_zb = ec.field_b.field_zb - ua.field_E.field_zb;
          ua.field_E.field_x = ua.field_E.field_x - ua.field_E.field_zb;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "wh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static ja a(int param0, double param1, int param2) {
        int var8 = 0;
        ja var9 = new ja(640, 75);
        var9.a();
        oo.a(0, 5, 640, 55, 16777215, 1);
        ja var5 = new ja(640, 75);
        var5.a();
        ff.field_r.b(sm.field_g[param2], 320, 65, 53248, 1);
        ja var6 = new ja(640, 75);
        var6.a();
        int var7 = (int)(param1 * 640.0);
        if (param0 >= 26) {
          var8 = (int)(75.0 * param1);
          var5.c((-var7 + 640) / 2, 0, var7, var8);
          var9.e(0, 0);
          var6.g(16777215);
          var6.g(16777215);
          var6.g(1);
          var6.g(1);
          dl.field_h.b((byte) 96);
          return var6;
        }
        return (ja) null;
    }

    wh(int param0) {
        int var2 = 0;
        br dupTemp$0 = null;
        br var3 = null;
        this.field_a = new br[param0];
        this.field_d = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new br();
          var3 = dupTemp$0;
          this.field_a[var2] = dupTemp$0;
          var3.field_d = var3;
          var3.field_b = var3;
        }
    }

    static {
        field_c = false;
        field_b = "Miasma";
    }
}
