/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn implements ur {
    private int field_e;
    private int field_c;
    static ed[][] field_h;
    private cc field_b;
    private int field_j;
    private int field_d;
    private int field_n;
    private int field_i;
    private int field_o;
    static lg field_p;
    static String field_m;
    private int field_f;
    private int field_g;
    static String field_a;
    private int field_k;
    private int field_l;

    public final void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        iq stackIn_3_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ck var11 = null;
        try {
          if (param3 instanceof ck) {
            stackIn_3_0 = (iq) (param3);
          } else {
            stackIn_3_0 = null;
          }
          var11 = (ck) (stackIn_3_0);
          if (var11 != null) {
            param0 = param0 & var11.field_F;
          }
          var7 = 5592405;
          bi.b(param1 + param3.field_o, param3.field_t + param4, param3.field_n, param3.field_s, this.field_k);
          if (param0) {
            var7 = 16777215;
          }
          var8 = this.field_i + (param1 + param3.field_o);
          var9 = this.field_c + (param3.field_t + param4);
          bi.f(var8, var9, this.field_d, this.field_f, 5592405);
          bi.b(var8, var9, this.field_d, this.field_f, var7);
          if (var11.field_G) {
            bi.a(var8, var9, var8 + this.field_d, this.field_f + var9, 1);
            bi.a(this.field_d + var8, var9, var8, var9 + this.field_f, 1);
          }
          if (!param2) {
            kn.a(true);
          }
          if (null != this.field_b) {
            var10 = this.field_d + (this.field_i + this.field_n);
            this.field_b.a(param3.field_w, var10 + (param1 + param3.field_o), this.field_g + param4 + param3.field_t, param3.field_n - (var10 + this.field_n), -(this.field_n << 1) + param3.field_s, this.field_e, this.field_j, this.field_o, this.field_l, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("kn.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_p = null;
        field_m = null;
        field_h = (ed[][]) null;
        field_a = null;
        if (!param0) {
          field_a = (String) null;
        }
    }

    kn(cc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_o = 1;
        this.field_l = 1;
        try {
          this.field_d = param8;
          this.field_n = param1;
          this.field_j = param4;
          this.field_b = param0;
          this.field_i = param5;
          this.field_g = param2;
          this.field_f = param7;
          this.field_e = param3;
          this.field_c = param6;
          this.field_k = param9;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "kn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_h = new ed[][]{new ed[50], new ed[30], new ed[40], new ed[50]};
        field_a = "You have <%0> unread messages!";
        field_m = "This password contains your Player Name, and would be easy to guess";
    }
}
