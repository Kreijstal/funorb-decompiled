/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb implements ub {
    private int field_d;
    private TextFont field_b;
    private int field_f;
    static int matchmakingOptionByteOne;
    static me field_c;
    static String field_a;

    public final void a(boolean param0, int param1, int param2, oc param3, int param4) {
        int stackIn_5_0 = 0;
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
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!param3.field_q &&
            !param3.f(-67)) {
            stackIn_5_0 = 2188450;
          } else {
            stackIn_5_0 = 3249872;
          }
          var6_int = stackIn_5_0;
          this.field_b.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_A + "</u>", param3.field_o + param2, param3.field_w + param4, param3.field_t, param3.field_s, var6_int, -1, this.field_d, this.field_f, this.field_b.descent + this.field_b.ascent);
          if (param1 != -20618) {
            field_a = (String) null;
          }
          if (!param3.f(-54)) {
            return;
          }
          var7 = this.field_b.measureText(param3.field_A);
          var8 = this.field_b.descent + this.field_b.ascent;
          var9 = param3.field_o + param2;
          if (this.field_d == 2) {
            var9 = var9 + (-var7 + param3.field_t);
          } else {
            if (this.field_d == 1) {
              var9 = var9 + (-var7 + param3.field_t >> 1);
            }
          }
          var10 = param3.field_w + param4;
          if (this.field_f == 2) {
            var10 = var10 + (-var8 + param3.field_s);
          } else {
            if (1 == this.field_f) {
              var10 = var10 + (-var8 + param3.field_s >> 1);
            }
          }
          ScrollPaneWithFooter.a(var10 + 2, var9 - 2, param1 ^ -20727, var8, var7 + 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("bb.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    public bb() {
        this.field_d = 1;
        this.field_b = ArchiveNetworkClient.field_u;
        this.field_f = 1;
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
          field_c = (me) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    bb(TextFont param0, int param1, int param2) {
        try {
          this.field_d = param1;
          this.field_b = param0;
          this.field_f = param2;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "bb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = new me("");
        field_a = "Loading instruments";
    }
}
