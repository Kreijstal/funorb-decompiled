/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vm {
    String field_l;
    private int field_c;
    static String field_e;
    static String field_h;
    private lm[] field_f;
    static wb field_g;
    private int field_a;
    float field_b;
    private int field_i;
    static int[] field_d;
    static db field_k;
    static Vector[] field_j;

    public static void b(byte param0) {
        field_h = null;
        if (param0 > 111) {
          field_d = null;
          field_g = null;
          field_e = null;
          field_k = null;
          field_j = null;
          return;
        }
        vm.a((byte) 36);
        field_d = null;
        field_g = null;
        field_e = null;
        field_k = null;
        field_j = null;
    }

    final boolean a(int param0) {
        lm var2;
        int var3;
        lm var4;
        var3 = CrazyCrystals.field_B;
        if (param0 != 0) {
          field_d = (int[]) null;
        }
        while (this.field_c > this.field_i) {
          var4 = this.field_f[this.field_i];
          var2 = var4;
          if (!var4.field_h.a((byte) 102)) {
            this.a(var4, 1, 0);
            return false;
          }
          if (var4.field_i >= 0 &&
            !var4.field_h.e(var4.field_i, 75)) {
            this.a(var2, 1, var4.field_h.b(25030, var4.field_i));
            return false;
          }
          if (var4.field_b != null &&
            !var4.field_h.a(-20402, var4.field_b)) {
            this.a(var2, 1, var4.field_h.b(var4.field_b, param0 ^ -75));
            return false;
          }
          if (var4.field_i < 0 &&
            null == var4.field_b &&
            null != var4.field_f &&
            !var4.field_h.a(false)) {
            this.a(var2, param0 ^ 1, var4.field_h.b(param0 + 3492));
            return false;
          }
          this.field_i = this.field_i + 1;
        }
        return true;
    }

    final static int a(byte param0, boolean param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 125 % ((param0 - 22) / 36);
          if (param1) {
            stackIn_4_0 = gh.field_F.a(param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = ec.field_m.a(param2);
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vm.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static mb[] a(byte param0) {
        if (param0 > 51) {
          return new mb[]{gg.field_d, wp.field_c, je.field_b};
        }
        vm.b((byte) -80);
        return new mb[]{gg.field_d, wp.field_c, je.field_b};
    }

    private final void a(lm param0, int param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = (float)(param1 + this.field_i) + (float)param2 / 100.0f;
          this.field_b = (float)this.field_a * var4_float / (float)(1 + this.field_c);
          if (param2 == 0) {
            this.field_l = param0.field_c;
            return;
          }
          this.field_l = param0.field_f + " - " + param2 + "%";
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("vm.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private vm() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "Return to game";
        field_h = "Email (Login):";
        field_g = new wb();
        field_d = new int[8192];
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$62abead39cee(int param0, boolean param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 125 % ((param0 - 22) / 36);
          if (param1) {
            stackIn_4_0 = gh.field_F.a(param2);
            return stackIn_4_0;
          }
          stackIn_2_0 = ec.field_m.a(param2);
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("vm.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }
}
