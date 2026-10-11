/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class de implements Iterable {
    rk field_b;
    static String field_c;
    static String field_a;

    final static void a(byte param0, String param1, String param2, boolean param3) {
        rg.field_S = param1;
        lb.field_e = param2;
        if (param0 != -52) {
          return;
        }
        try {
          fc.a(sd.field_c, param3, -122);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "de.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final rk b(byte param0) {
        rk var2 = this.field_b.field_i;
        if (param0 > -15) {
          return (rk) null;
        }
        if (this.field_b != var2) {
          var2.b(false);
          return var2;
        }
        return null;
    }

    final static String a(int param0, String param1, kl param2, String param3) {
        RuntimeException var4 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.b(17820)) {
            stackIn_3_0 = (String) (param3);
            return stackIn_3_0;
          }
          if (param0 != -40) {
            field_c = (String) null;
          }
          stackIn_7_0 = param1 + " - " + param2.a((byte) 75) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("de.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, dc param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        mg var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = n.field_b;
          var5.c((byte) -61, param1);
          var5.field_m = var5.field_m + 1;
          var4 = var5.field_m;
          var5.b((byte) 11, 1);
          var5.b((byte) 11, param2.field_k);
          var5.d(1710370149, param2.field_m);
          var5.f(param2.field_r, param0 ^ -612992477);
          var5.f(param2.field_l, 613003928);
          var5.f(param2.field_i, 613003928);
          var5.f(param2.field_p, 613003928);
          var5.e(var4, param0 ^ 1182882603);
          var5.a(-var4 + var5.field_m, -127);
          if (param0 == -14149) {
            return;
          }
          de.a(54, false, 105, -87);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("de.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new kg(this));
    }

    private de() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 5) {
          de.a(-86, true, -78, -105);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final void a(rk param0, int param1) {
        if (null != param0.field_l) {
          param0.b(false);
        }
        param0.field_l = this.field_b.field_l;
        param0.field_i = this.field_b;
        param0.field_l.field_i = param0;
        if (param1 != 10) {
          return;
        }
        try {
          param0.field_i.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "de.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        int var4;
        if (param0 != 2) {
          return;
        }
        ef.field_H.e(param2, param3);
        if (!param1) {
          return;
        }
        var4 = hj.field_c % ef.field_H.field_z * 2;
        if (ef.field_H.field_z <= var4) {
          var4 = ef.field_H.field_z - (var4 - ef.field_H.field_z);
        }
        if (var4 < 10) {
          var4 = 10;
        } else {
          if (ef.field_H.field_z - 40 < var4) {
            var4 = -40 + ef.field_H.field_z;
          }
        }
        df.a(30, 0, ef.field_H, 0, 80, param3, param2, var4, 0);
    }

    static {
        field_c = "The Troll Cave";
        field_a = "Change display name";
    }
}
