/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends kd {
    static int field_h;
    static java.math.BigInteger field_d;
    private String field_e;
    private String field_c;
    static int field_g;
    static int field_f;

    final static java.awt.Frame a(uf param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_38_0 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        ji[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        ji[] var10 = null;
        ce var11 = null;
        var9 = TrackController.field_F ? 1 : 0;
        try {
          if (!param0.b(-4)) {
            stackIn_3_0 = null;
            return (java.awt.Frame) (stackIn_3_0);
          }
          if (param1 == 0) {
            var10 = rf.a(param0, false);
            var6 = var10;
            if (var6 == null) {
              stackIn_7_0 = null;
              return (java.awt.Frame) (stackIn_7_0);
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (var10[var8].field_f == param5 &&
                var10[var8].field_c == param4 && ((param2 == 0 ||
                param2 == var10[var8].field_g) &&
                (var7_int == 0 ||
                !(param1 >= var10[var8].field_b)))) {
                var7_int = 1;
                param1 = var10[var8].field_b;
              }
            }
            if (var7_int == 0) {
              stackIn_27_0 = null;
              return (java.awt.Frame) (stackIn_27_0);
            }
          }
          var11 = param0.a(86, param1, param2, param5, param4);
          if (param3 <= 85) {
            sc.a(-111);
          }
          while (var11.field_f == 0) {
            wl.a(10L, false);
          }
          var7 = (java.awt.Frame) (var11.field_e);
          if (var7 == null) {
            stackIn_34_0 = null;
            return (java.awt.Frame) (stackIn_34_0);
          }
          if (var11.field_f != 2) {
            return var7;
          }
          sg.a(var7, (byte) -105, param0);
          stackIn_38_0 = null;
          return (java.awt.Frame) (stackIn_38_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_41_0 = var6_ref;
          stackIn_41_1 = new StringBuilder().append("sc.B(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void a(byte param0, be param1) {
        try {
          if (param0 != -6) {
            field_g = 54;
          }
          param1.b(this.field_c, param0 + 132);
          param1.a(this.field_e, 27933);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "sc.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 255) {
          field_d = (java.math.BigInteger) null;
        }
        field_d = null;
    }

    final static int a(int param0, int param1) {
        param0 = (param0 & 1431655765) + ((param0 & -1431655765) >>> 1);
        param0 = (858993459 & param0) + (param0 >>> 2 & 858993459);
        param0 = (param0 >>> 4) + param0 & 252645135;
        if (param1 != -1) {
          sc.a(-83);
        }
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        return param0 & 255;
    }

    final nh a(boolean param0) {
        if (param0) {
          return (nh) null;
        }
        return nd.field_M;
    }

    sc(String param0, String param1) {
        try {
          this.field_e = param1;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "sc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = 0;
        field_d = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
