/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj implements jm {
    private lh field_a;
    static rh field_c;
    static int[] field_d;
    private int field_b;
    static String field_e;
    private int field_f;
    static ci field_g;

    final static void a(le param0, int param1, int param2, le param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, lh param11, int param12, le param13, int param14, int param15, int param16, int param17, lh param18, int param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          cg.a(0, param17, param11, param18);
          g.a((byte) -81, param2, param10, param4, param9);
          di.a(param12, -121, param6);
          gi.a(param15, param0, param19, false, param13, param8);
          var21_int = -109 % ((param14 + 27) / 45);
          td.a(param3, param1, param20, 200);
          fd.a(param7, 7, param5, param16);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_4_0 = var21;
          stackIn_4_1 = new StringBuilder().append("wj.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    public final void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        int stackIn_8_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Chess.field_G;
        try {
          if (param0 < 58) {
            return;
          }
          if (!param4.field_w &&
            !param4.d((byte) -67)) {
            stackIn_8_0 = 2188450;
          } else {
            stackIn_8_0 = 3249872;
          }
          var6_int = stackIn_8_0;
          this.field_a.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_v + "</u>", param1 + param4.field_u, param2 + param4.field_r, param4.field_y, param4.field_C, var6_int, -1, this.field_b, this.field_f, this.field_a.field_t + this.field_a.field_C);
          if (!param4.d((byte) -67)) {
            return;
          }
          var7 = this.field_a.b(param4.field_v);
          var8 = this.field_a.field_C + this.field_a.field_t;
          var9 = param1 + param4.field_u;
          if (this.field_b == 2) {
            var9 = var9 + (-var7 + param4.field_y);
          } else {
            if (this.field_b == 1) {
              var9 = var9 + (param4.field_y - var7 >> 1);
            }
          }
          var10 = param4.field_r + param2;
          if (this.field_f == 2) {
            var10 = var10 + (-var8 + param4.field_C);
          } else {
            if (this.field_f == 1) {
              var10 = var10 + (-var8 + param4.field_C >> 1);
            }
          }
          rc.a(var8, false, -2 + var9, 4 + var7, 2 + var10);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("wj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -3) {
          return;
        }
        field_e = null;
        field_d = null;
        field_c = null;
        field_g = null;
    }

    public wj() {
        this.field_b = 1;
        this.field_a = rb.field_b;
        this.field_f = 1;
    }

    wj(lh param0, int param1, int param2) {
        try {
          this.field_b = param1;
          this.field_f = param2;
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "wj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new int[8192];
        field_e = "black";
    }
}
