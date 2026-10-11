/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd extends jm {
    static int[] field_p;
    private ll[] field_r;
    static String field_q;
    static String field_s;

    final static void d(int param0) {
        mn.e(98);
        if (param0 != 16777215) {
          field_q = (String) null;
        }
    }

    final static java.applet.Applet e(int param0) {
        if (param0 <= 102) {
          return (java.applet.Applet) null;
        }
        if (bd.field_c != null) {
          return bd.field_c;
        }
        return (java.applet.Applet) ((Object) ug.field_k);
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ll var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qm var14 = null;
        try {
          de.a(param0.field_n + param2, param0.field_j + param3, param0.field_v, param0.field_k, 10197915);
          if (param4) {
            stackIn_6_0 = (((ag) (param0)).field_z) ? 1 : 0;
          } else {
            stackIn_6_0 = 0;
          }
          var6_int = stackIn_6_0;
          if (param4) {
            stackIn_12_0 = (param0.d(-2116)) ? 1 : 0;
          } else {
            stackIn_12_0 = 0;
          }
          var7 = stackIn_12_0;
          var8 = 0;
          stackIn_15_0 = (var6_int == 0) ? 16777215 : 2394342;
          var9 = stackIn_15_0;
          if (var7 != 0) {
            var8 = var8 | 2;
          }
          if (var6_int != 0) {
            var8 = var8 | 1;
          }
          var10 = this.field_r[var8];
          var11 = (param0.field_v - var10.field_h) / 2 + (param2 + param0.field_n);
          var12 = param0.field_j + param3 + (-var10.field_c + param0.field_k) / 2;
          var13 = param0.field_v / 2 + param0.field_n + param2;
          var10.a(var11, var12);
          this.field_g.b(this.a(false, param0), var13, param3, var9, -1);
          if (param1 == 5592405) {
            return;
          }
          var14 = (qm) null;
          this.a((qm) null, 3, -30, -126, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_25_0 = var6;
          stackIn_25_1 = new StringBuilder().append("cd.A(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 >= 51) {
          field_q = null;
          field_p = null;
          field_s = null;
          return;
        }
        cd.d(-30);
        field_q = null;
        field_p = null;
        field_s = null;
    }

    cd(ll[] param0) {
        try {
          this.field_g = ia.field_c;
          this.field_r = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "cd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = new int[]{61, 62, 63};
        field_q = "You appear to be telling someone your password - please don't!";
        field_s = "Please try changing the following settings:  ";
    }
}
