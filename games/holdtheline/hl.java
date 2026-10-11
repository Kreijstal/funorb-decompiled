/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hl {
    static hj field_d;
    long field_f;
    static qi field_g;
    static String field_e;
    static String field_c;
    hl field_h;
    hl field_a;
    static boolean field_b;

    final static boolean a(boolean param0, int param1, wc param2, qm param3) {
        boolean stackIn_17_0 = false;
        boolean stackIn_27_0 = false;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        hn var11 = null;
        dd var12 = null;
        float var5Lifetime1;
        float var6Lifetime1;
        float var7Lifetime1;
        float var8Lifetime1;
        float var9Lifetime1;
        try {
          if (-param2.field_k + param1 <= 1 &&
            param1 - param2.field_k >= -1) {
            if (param0) {
              return false;
            }
            if (!(param2 instanceof dd)) {
              var11 = (hn) (param2);
              var5 = (float)(param3.field_h - var11.field_U.field_h);
              var6 = (float)(param3.field_f - var11.field_U.field_f);
              var7 = (float)var11.field_D;
              var8 = (float)var11.field_R;
              if (var11.field_E > var11.field_I) {
                var7 = (float)var11.field_R;
                var8 = (float)var11.field_D;
              }
              var9 = var6 * var6 + var5 * var5;
              if (var7 * var7 > var9) {
                return false;
              }
              if (var8 * var8 < var9) {
                return false;
              }
              var10 = ha.a(var11.field_U, param3, param0);
              stackIn_17_0 = var11.b((byte) -113, var10);
              return stackIn_17_0;
            }
            var12 = (dd) (param2);
            var5Lifetime1 = (float)(-var12.field_R.field_h + param3.field_h);
            var6Lifetime1 = (float)(param3.field_f - var12.field_R.field_f);
            var7Lifetime1 = -(var6Lifetime1 * var12.field_D) + var5Lifetime1 * var12.field_B;
            if (!(0.0f > var7Lifetime1) &&
              !(var12.field_J < var7Lifetime1)) {
              var8Lifetime1 = var7Lifetime1 / var12.field_J;
              var9Lifetime1 = var12.field_D * var5Lifetime1 + var12.field_B * var6Lifetime1;
              stackIn_27_0 = ((float)var12.d(var8Lifetime1, 0) <= var9Lifetime1) && (var9Lifetime1 <= (float)var12.c(95, var8Lifetime1));
              return stackIn_27_0;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("hl.SB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        if (param0 == -2) {
          field_e = null;
          field_g = null;
          field_c = null;
          field_d = null;
          return;
        }
        String var2 = (String) null;
        hl.a((String) null, 26, true, (String) null, (a) null, (String) null, 76);
        field_e = null;
        field_g = null;
        field_c = null;
        field_d = null;
    }

    final void d(int param0) {
        if (param0 != 0) {
          hl.c(47);
          if (null == this.field_a) {
            return;
          }
          this.field_a.field_h = this.field_h;
          this.field_h.field_a = this.field_a;
          this.field_a = null;
          this.field_h = null;
          return;
        }
        if (null == this.field_a) {
          return;
        }
        this.field_a.field_h = this.field_h;
        this.field_h.field_a = this.field_a;
        this.field_a = null;
        this.field_h = null;
    }

    final boolean b(int param0) {
        if (null == this.field_a) {
          return false;
        }
        if (param0 < 38) {
          return true;
        }
        return true;
    }

    final static boolean a(String param0, int param1, boolean param2, String param3, a param4, String param5, int param6) {
        RuntimeException var7 = null;
        String var8 = null;
        vm var9 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -23000) {
            var8 = (String) null;
            hl.a((String) null, 49, true, (String) null, (a) null, (String) null, 51);
          }
          if (gg.field_M != bb.field_a) {
            return false;
          }
          var9 = new vm(ka.field_b, param4);
          ka.field_b.a(var9, false);
          if (ma.a(0)) {
            var9.q(-124);
            return true;
          }
          ij.field_k = param5;
          qd.field_k = param0;
          ff.field_b = param2;
          bb.field_a = sf.field_n;
          ol.field_a = param3;
          u.field_V = param6;
          bg.field_d = null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_16_0 = var7;
          stackIn_16_1 = new StringBuilder().append("hl.VB(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_e = "To use a <col=1>super powers</col> you must activate it. Doing so will scatter the three used powerups around the course.";
        field_c = "Back";
        field_b = false;
    }
}
