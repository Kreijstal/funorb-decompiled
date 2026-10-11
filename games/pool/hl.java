/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl implements fp {
    private int field_b;
    private int field_i;
    static String field_c;
    private lr field_e;
    private int field_j;
    private int field_g;
    private int field_h;
    private int field_o;
    static ie field_a;
    private int field_f;
    private int field_l;
    private int field_k;
    private int field_d;
    private int field_m;
    static int field_n;

    final static eo a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        eo var3 = null;
        String var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        Object stackIn_2_0 = null;
        eo stackIn_11_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == gd.field_c) {
            stackIn_2_0 = null;
            return (eo) (stackIn_2_0);
          }
          var5 = (CharSequence) ((Object) param0);
          var2 = hq.a(param1 ^ 123, var5);
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (eo) (gd.field_c.a((long)var2.hashCode(), false));
          while (true) {
            if (var3 == null) {
              if (param1 == 1) {
                return null;
              }
              hl.a(-34);
              stackIn_16_0 = null;
              return (eo) (stackIn_16_0);
            }
            var6 = (CharSequence) ((Object) var3.field_Zb);
            var4 = hq.a(param1 ^ 104, var6);
            if (var4 == null) {
              var4 = var3.field_Zb;
            }
            if (!var4.equals(var2)) {
              var3 = (eo) (gd.field_c.a(param1 ^ -98));
              continue;
            }
            break;
          }
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_19_0 = var2_ref;
          stackIn_19_1 = new StringBuilder().append("hl.E(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        ei stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ri var12 = null;
        try {
          if (!(param4 instanceof ri)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (ei) (param4);
          }
          var12 = (ri) (stackIn_3_0);
          if (var12 != null) {
            param0 = param0 & var12.field_I;
          }
          var7 = 5592405;
          qh.f(param4.field_C + param1, param4.field_D + param3, param4.field_l, param4.field_y, this.field_f);
          if (param0) {
            var7 = 16777215;
          }
          var10 = 8 / ((param2 - 2) / 41);
          var8 = param1 - (-param4.field_C - this.field_o);
          var9 = this.field_k + (param3 + param4.field_D);
          qh.c(var8, var9, this.field_g, this.field_j, 5592405);
          qh.f(var8, var9, this.field_g, this.field_j, var7);
          if (var12.field_G) {
            qh.d(var8, var9, var8 + this.field_g, this.field_j + var9, 1);
            qh.d(this.field_g + var8, var9, var8, var9 + this.field_j, 1);
          }
          if (null != this.field_e) {
            var11 = this.field_g + this.field_o + this.field_m;
            this.field_e.a(param4.field_m, var11 + (param1 + param4.field_C), this.field_d + (param3 + param4.field_D), -var11 + (-this.field_m + param4.field_l), -(this.field_m << 1) + param4.field_y, this.field_l, this.field_i, this.field_b, this.field_h, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("hl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
          field_n = -28;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static int a(int param0) {
        if (param0 != 23467) {
          return 80;
        }
        return rl.field_a;
    }

    final static void a(dd param0, int param1) {
        try {
          int var2_int = 17 % ((param1 - 33) / 56);
          mm.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "hl.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    hl(lr param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_b = 1;
        this.field_h = 1;
        try {
          this.field_i = param4;
          this.field_j = param7;
          this.field_d = param2;
          this.field_e = param0;
          this.field_g = param8;
          this.field_k = param6;
          this.field_l = param3;
          this.field_o = param5;
          this.field_f = param9;
          this.field_m = param1;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_c = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_a = new ie();
    }
}
