/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ul extends um {
    private int field_h;
    private int field_i;
    static mk field_j;
    static int field_g;
    static vm field_k;

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        RuntimeException var6 = null;
        jo stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            ul.b(true);
          }
          this.field_i = this.field_i + 1;
          this.field_h = this.field_h + param3;
          stackIn_3_0 = new jo(bm.field_g, 1);
          return (f) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("ul.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(mj param0, boolean param1, f[][] param2, byte param3) {
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = CrazyCrystals.field_B;
        try {
          while (true) {
            param0.a(120);
            if (param2[param0.field_c][param0.field_b].a(false, param2, param0)) {
              param2[param0.field_c][param0.field_b] = param2[param0.field_c][param0.field_b].a(param0, (byte) -119, param1, param2);
              continue;
            }
            break;
          }
          if (param3 >= 18) {
            return;
          }
          ul.a((mj) null, true, (f[][]) null, (byte) 24);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ul.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0) {
        tb.field_d.a(jj.field_a, 100, this.field_i * (48 * gi.field_m), this.field_h / this.field_i);
        int var2 = -101 % ((29 - param0) / 42);
        this.field_i = 0;
        this.field_h = 0;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          ul.b(false);
          if (ol.field_z[0 >= mo.field_l ? 1 : 2] == null) {
            return false;
          }
          if (!jc.field_b) {
            return rc.a(-82) ? true : false;
          }
          if (!gh.field_y) {
            return rc.a(-82) ? true : false;
          }
          return true;
        }
        if (ol.field_z[0 >= mo.field_l ? 1 : 2] == null) {
          return false;
        }
        if (jc.field_b) {
          if (gh.field_y) {
            return true;
          }
          return rc.a(-82) ? true : false;
        }
        if (rc.a(-82)) {
          return true;
        }
        return false;
    }

    ul() {
        this.field_h = 0;
        this.field_i = 0;
    }

    final pb b(byte param0) {
        if (param0 > -127) {
          this.field_h = 60;
          return (pb) ((Object) new tc());
        }
        return (pb) ((Object) new tc());
    }

    public static void b(boolean param0) {
        if (!param0) {
          field_k = (vm) null;
          field_j = null;
          field_k = null;
          return;
        }
        field_j = null;
        field_k = null;
    }

    static {
        field_j = new mk();
    }
}
