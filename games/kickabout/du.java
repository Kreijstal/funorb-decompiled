/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class du implements gj {
    private int field_d;
    static int field_a;
    private int field_c;
    static int field_e;
    static int field_k;
    static ut field_i;
    private hu field_m;
    static hd field_f;
    static int field_j;
    private int field_l;
    private int field_h;
    private int field_o;
    static String field_g;
    private int field_b;
    static int field_n;

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        int var11 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        nv var13 = null;
        fd stackIn_4_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = Kickabout.field_G;
        try {
          if (!(param3 instanceof nv)) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = (fd) (param3);
          }
          var13 = (nv) (stackIn_4_0);
          on.a(param3.field_t + param4, param3.field_g + param2, param3.field_n, param3.field_i, this.field_b);
          if (var13 != null) {
          }
          var7 = param3.field_n - var13.field_H * 2;
          var8 = var13.field_H + param4 + param3.field_t;
          var9 = var13.field_J + (param2 + param3.field_g);
          on.b(var8, var9, var8 + var7, var9, this.field_h);
          var10 = 47 / ((59 - param0) / 53);
          for (var11 = var13.a((byte) 31) - 1; 0 <= var11; var11--) {
            on.d(var13.a((byte) -120, var11) * var7 / var13.h((byte) -88) + var8, var9, this.field_d, this.field_l);
          }
          if (null == this.field_m) {
            return;
          }
          this.field_m.d(var13.field_q, var8 + var7 / 2, var13.field_J + this.field_m.field_x + var9, this.field_c, this.field_o);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("du.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != -24229) {
          return;
        }
        field_g = null;
        field_i = null;
    }

    du(hu param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_b = param4;
          this.field_m = param0;
          this.field_o = param2;
          this.field_h = param3;
          this.field_c = param1;
          this.field_l = param6;
          this.field_d = param5;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "du.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_j = 0;
        field_g = "spectate";
    }
}
