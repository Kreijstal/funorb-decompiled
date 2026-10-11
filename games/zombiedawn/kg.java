/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kg extends pm {
    private tb field_h;
    static int[] field_g;
    private tb field_j;
    static int field_f;
    static volatile boolean field_l;
    static int field_i;
    static int field_k;

    public static void d(int param0) {
        if (param0 != -2314) {
          field_l = true;
          field_g = null;
          return;
        }
        field_g = null;
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        Object stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = this.field_h.field_o.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var5 = var4;
          if (tk.a((byte) 84, var5)) {
            stackIn_6_0 = ci.field_a;
            return stackIn_6_0;
          }
          if (param1 >= -94) {
            this.field_h = (tb) null;
          }
          if (cj.a((byte) 15, var5)) {
            stackIn_11_0 = dj.field_a;
            return stackIn_11_0;
          }
          if (tb.a(-10723, var5)) {
            stackIn_14_0 = eo.field_i;
            return stackIn_14_0;
          }
          if (this.b(param0, 1)) {
            stackIn_18_0 = dl.field_e;
            return stackIn_18_0;
          }
          if (var6.length() <= 0) {
            stackIn_21_0 = dp.field_g;
            return stackIn_21_0;
          }
          if (lf.a(var6, var5, -7235)) {
            stackIn_24_0 = kb.field_h;
            return stackIn_24_0;
          }
          if (ic.a(var5, var6, 0)) {
            stackIn_27_0 = uo.field_a;
            return stackIn_27_0;
          }
          if (!t.a(var5, (byte) 96, var6)) {
            stackIn_32_0 = ci.field_a;
            return stackIn_32_0;
          }
          stackIn_30_0 = kb.field_h;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("kg.B(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean b(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 1) {
            var8 = (String) null;
            this.a((String) null, (byte) 125);
          }
          var9 = this.field_j.field_o.toLowerCase();
          var4 = param0.toLowerCase();
          if (var9.length() > 0) {
            if (var4.length() <= 0) {
              return false;
            }
            var5 = var9.lastIndexOf("@");
            if (0 <= var5 &&
              var5 < var9.length() - 1) {
              var6 = var9.substring(0, var5);
              var7 = var9.substring(var5 + 1);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("kg.M(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    kg(tb param0, tb param1, tb param2) {
        super(param0);
        try {
          this.field_h = param1;
          this.field_j = param2;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "kg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final rh a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        rh stackIn_2_0 = null;
        rh stackIn_5_0 = null;
        rh stackIn_8_0 = null;
        rh stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_h.field_o.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = uc.field_b;
            return stackIn_2_0;
          }
          if (param1 != 2) {
            stackIn_5_0 = (rh) null;
            return stackIn_5_0;
          }
          if (!on.a((byte) -23, var4, var3)) {
            stackIn_8_0 = uc.field_b;
            return stackIn_8_0;
          }
          if (!this.b(param0, 1)) {
            return mc.field_g;
          }
          stackIn_12_0 = uc.field_b;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("kg.I(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_g = ae.a(14821);
        field_l = false;
    }
}
