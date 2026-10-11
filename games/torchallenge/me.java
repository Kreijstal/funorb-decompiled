/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me implements j {
    static String[] field_a;
    static String field_d;
    static ka field_e;
    private int field_h;
    static boolean field_b;
    static int field_g;
    private eg field_c;
    private int field_f;

    public static void a(int param0) {
        if (param0 != -13978) {
          return;
        }
        field_e = null;
        field_a = null;
        field_d = null;
    }

    final static void a(boolean param0) {
        try {
          Exception var1 = null;
          Throwable decompiledCaughtException = null;
          if (!param0) {
            me.a(false);
          }
          if (cf.field_d != null) {
            try {
              cf.field_d.a(0L, 0);
              cf.field_d.a(-4573, id.field_b.field_q, id.field_b.field_m, 24);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
            }
          }
          id.field_b.field_q = id.field_b.field_q + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public me() {
        this.field_c = oe.field_g;
        this.field_h = 1;
        this.field_f = 1;
    }

    me(eg param0, int param1, int param2) {
        try {
          this.field_h = param1;
          this.field_f = param2;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "me.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void a(ee param0, int param1, int param2, byte param3, boolean param4) {
        int stackIn_6_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          if (!param0.field_w &&
            !param0.c(115)) {
            stackIn_6_0 = 2188450;
          } else {
            stackIn_6_0 = 3249872;
          }
          var6_int = stackIn_6_0;
          if (param3 != 97) {
            this.field_h = 7;
          }
          this.field_c.a("<u=" + Integer.toString(var6_int, 16) + ">" + param0.field_v + "</u>", param2 + param0.field_m, param0.field_i + param1, param0.field_p, param0.field_l, var6_int, -1, this.field_h, this.field_f, this.field_c.field_x + this.field_c.field_K);
          if (param0.c(94)) {
            var7 = this.field_c.a(param0.field_v);
            var8 = this.field_c.field_x + this.field_c.field_K;
            var9 = param2 + param0.field_m;
            if (this.field_h == 2) {
              var9 = var9 + (param0.field_p - var7);
            } else {
              if (this.field_h == 1) {
                var9 = var9 + (-var7 + param0.field_p >> 1);
              }
            }
            var10 = param1 + param0.field_i;
            if (this.field_f == 2) {
              var10 = var10 + (-var8 + param0.field_l);
            } else {
              if (this.field_f == 1) {
                var10 = var10 + (param0.field_l - var8 >> 1);
              }
            }
            jc.a((byte) -120, var9 - 2, var8, 4 + var7, var10 + 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("me.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_g = 0;
        field_a = new String[]{"Henhui", "Ziren", "Damen"};
    }
}
