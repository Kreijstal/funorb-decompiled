/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne implements t {
    static ja field_b;
    private oh field_e;
    private int field_c;
    static bk field_d;
    private int field_f;
    static la field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != -29615) {
          field_a = (la) null;
        }
    }

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          if (param0 != -24969) {
            return;
          }
          if (!param1.field_q &&
            !param1.h(-84)) {
            stackIn_7_0 = 2188450;
          } else {
            stackIn_7_0 = 3249872;
          }
          var6_int = stackIn_7_0;
          this.field_e.a("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_s + "</u>", param4 + param1.field_p, param1.field_m + param2, param1.field_x, param1.field_u, var6_int, -1, this.field_c, this.field_f, this.field_e.field_u + this.field_e.field_G);
          if (param1.h(-95)) {
            var7 = this.field_e.a(param1.field_s);
            var8 = this.field_e.field_u + this.field_e.field_G;
            var9 = param4 + param1.field_p;
            var10 = param2 + param1.field_m;
            if (this.field_c == 2) {
              var9 = var9 + (-var7 + param1.field_x);
            } else {
              if (this.field_c == 1) {
                var9 = var9 + (-var7 + param1.field_x >> 1);
              }
            }
            if (this.field_f != 2) {
              if (this.field_f == 1) {
                var10 = var10 + (param1.field_u - var8 >> 1);
              }
            } else {
              var10 = var10 + (param1.field_u - var8);
            }
            bc.a(var8, -28846, 4 + var7, 2 + var10, var9 - 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("ne.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public ne() {
        this.field_e = gk.field_c;
        this.field_c = 1;
        this.field_f = 1;
    }

    ne(oh param0, int param1, int param2) {
        try {
          this.field_c = param1;
          this.field_e = param0;
          this.field_f = param2;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "ne.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = new ja();
    }
}
