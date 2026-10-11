/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci implements td {
    static String field_p;
    private int field_g;
    private int field_c;
    private int field_j;
    static fk field_b;
    private int field_o;
    private int field_e;
    private int field_i;
    private int field_n;
    private int field_a;
    private kc field_f;
    private int field_d;
    private int field_k;
    static Boolean field_h;
    private int field_l;
    static String field_m;

    public static void a(int param0) {
        field_h = null;
        if (param0 == 1) {
          field_m = null;
          field_p = null;
          field_b = null;
          return;
        }
        field_m = (String) null;
        field_m = null;
        field_p = null;
        field_b = null;
    }

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        pj stackIn_3_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pj var11 = null;
        of var12 = null;
        try {
          if (param2 instanceof of) {
            stackIn_3_0 = (pj) (param2);
          } else {
            stackIn_3_0 = null;
          }
          var12 = (of) (stackIn_3_0);
          if (var12 != null) {
            param4 = param4 & var12.field_F;
          }
          var7 = 5592405;
          ul.h(param2.field_s + param1, param0 + param2.field_n, param2.field_m, param2.field_r, this.field_i);
          if (param3 != -4394) {
            var11 = (pj) null;
            this.a(118, -50, (pj) null, 88, false);
          }
          if (param4) {
            var7 = 16777215;
          }
          var8 = param1 + param2.field_s + this.field_a;
          var9 = param2.field_n + param0 + this.field_k;
          ul.a(var8, var9, this.field_j, this.field_d, 5592405);
          ul.h(var8, var9, this.field_j, this.field_d, var7);
          if (var12.field_D) {
            ul.b(var8, var9, this.field_j + var8, var9 + this.field_d, 1);
            ul.b(this.field_j + var8, var9, var8, this.field_d + var9, 1);
          }
          if (this.field_f == null) {
            return;
          }
          var10 = this.field_g + this.field_j + this.field_a;
          this.field_f.a(param2.field_l, var10 + param2.field_s + param1, this.field_c + (param2.field_n + param0), param2.field_m - (var10 + this.field_g), -(this.field_g << 1) + param2.field_r, this.field_n, this.field_o, this.field_l, this.field_e, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_18_0 = var6;
          stackIn_18_1 = new StringBuilder().append("ci.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(int param0, boolean param1) {
        param0 = (param0 & 1431655765) + ((param0 & -1431655766) >>> 1);
        param0 = (858993459 & param0) + ((-858993459 & param0) >>> 2);
        param0 = (param0 >>> 4) + param0 & 252645135;
        if (param1) {
          param0 = param0 + (param0 >>> 8);
          param0 = param0 + (param0 >>> 16);
          return param0 & 255;
        }
        return 113;
    }

    ci(kc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_e = 1;
        this.field_l = 1;
        try {
          this.field_o = param4;
          this.field_g = param1;
          this.field_n = param3;
          this.field_k = param6;
          this.field_a = param5;
          this.field_f = param0;
          this.field_i = param9;
          this.field_d = param7;
          this.field_c = param2;
          this.field_j = param8;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "ci.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_p = "Visit the Account Management section on the main site to view.";
        field_b = new fk(3);
        field_m = "+10k";
    }
}
