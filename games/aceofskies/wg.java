/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg implements ir {
    private int field_e;
    static String field_c;
    private int field_d;
    private BitmapFont field_a;
    static long field_b;

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_c = null;
    }

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        int stackIn_7_0 = 0;
        String stackIn_23_2 = null;
        int var11 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 != -7592) {
            wg.a(false);
          }
          if (!param3.field_g &&
            !param3.e(28660)) {
            stackIn_7_0 = 2188450;
          } else {
            stackIn_7_0 = 3249872;
          }
          int var6_int = stackIn_7_0;
          this.field_a.drawParagraph("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_f + "</u>", param3.field_p + param2, param3.field_h + param4, param3.field_q, param3.field_n, var6_int, -1, this.field_e, this.field_d, this.field_a.maxAscent + this.field_a.maxDescent);
          if (!param3.e(param1 + 36252)) {
            return;
          }
          int var7 = this.field_a.measureTextWidth(param3.field_f);
          int var8 = this.field_a.maxDescent + this.field_a.maxAscent;
          int var9 = param3.field_p + param2;
          int var10 = param3.field_h + param4;
          if (this.field_e == 2) {
            var9 = var9 + (-var7 + param3.field_q);
          } else if (1 == this.field_e) {
            var9 = var9 + (-var7 + param3.field_q >> 1);
          }
          if (this.field_d == 2) {
            var10 = var10 + (param3.field_n - var8);
          } else if (1 == this.field_d) {
            var10 = var10 + (-var8 + param3.field_n >> 1);
          }
          co.a(2 + var10, var8, 4 + var7, -2 + var9, 119);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_22_0 = var6;
          StringBuilder stackIn_22_1 = new StringBuilder().append("wg.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    public wg() {
        this.field_a = qo.field_b;
        this.field_d = 1;
        this.field_e = 1;
    }

    wg(BitmapFont param0, int param1, int param2) {
        try {
          this.field_d = param2;
          this.field_e = param1;
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "wg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_c = "gun_overheat";
    }
}
